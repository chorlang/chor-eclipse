package org.chor.validation.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;

import jolie.util.Pair;

import org.chor.chor.BranchGType;
import org.chor.chor.ChorPackage;
import org.chor.chor.Constant;
import org.chor.chor.Expression;
import org.chor.chor.ExpressionBasicTerm;
import org.chor.chor.GlobalType;
import org.chor.chor.IfThenElse;
import org.chor.chor.Interaction;
import org.chor.chor.Program;
import org.chor.chor.Site;
import org.chor.chor.Start;
import org.chor.chor.ThreadWithRole;
import org.chor.chor.util.ChorSwitch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class TypeChecker extends ChorSwitch<String> {
	private HashMap<String,HashMap<String,String>> theta;
	private HashMap<String,GlobalType> delta; 
	private HashMap<Site,HashSet<String>> services;
	private HashMap<String,HashMap<String,String>> varTypes;

	public List<Pair<String,EStructuralFeature>> errors = new LinkedList<Pair<String,EStructuralFeature>>();
	
	
	public TypeChecker(Program program)
	{

		// Initialise Theta and Delta to empty
		theta  = new HashMap<String, HashMap<String,String>>();
		delta  = new HashMap<String, GlobalType>();
		
		// We also initialise services, needed for keeping track of what roles play services in a start
		services = new HashMap<Site,HashSet<String>>();
		
		// and, finally, we initialize varTypes;
		varTypes = new HashMap<String,HashMap<String,String>>();
		
		// we start parsing the choreography of program
		doSwitchIfNotNull(program.getChoreography());
	}
	


	public String caseStart(Start start)	{

		// First, we check that if we are using a used binder, then the old session is complete
		if (delta.containsKey(start.getSession()) && delta.get(start.getSession())!=null) 
			errors.add(new Pair<String,EStructuralFeature>(
					"Channel " + start.getSession() + " is not correctly used",
					start.eContainingFeature()));
		// if the old session is complete, we need to flush delta and theta from such a binder
		else if (delta.containsKey(start.getSession())) {
			delta.remove(start.getSession());
			for (String s : theta.keySet()) {
				if ((theta.get(s)).containsKey(start.getSession())) 
					(theta.get(s)).remove(start.getSession());
			}
		}
		
		// We update the theta environment with active threads
		for (ThreadWithRole twr : start.getActiveThreads()) {
			// if theta contains a thread, then we update its function
			if (theta.containsKey(twr.getThread())) {
				(theta.get(twr.getThread())).put(start.getSession(), twr.getRole());
			}
			// otherwise we just create a HashMap for this new thread
			else {
				HashMap<String,String> temp = new HashMap<String,String>();
				temp.put(start.getSession(), twr.getRole());
				theta.put(twr.getThread(), temp);
			}
		}
		
		// ...and service threads
		// first we remove any service thread name already used from theta (binding)
		for (ThreadWithRole twr : start.getServiceThreads()) {
			if (theta.containsKey(twr.getThread())) theta.remove(twr.getThread());
		}
		// then we do the expected update
		for (ThreadWithRole twr : start.getServiceThreads()) {
			HashMap<String,String> temp = new HashMap<String,String>();
			temp.put(start.getSession(), twr.getRole());
			theta.put(twr.getThread(), temp);
		}
		
		
  
		// Then, we update the delta environment
		delta.put(start.getSession(), start.getPublicChannel().getProtocol().getType());

		
		// We need to check that the service roles are so also in other starts.
		// First we check if the public channel entry is empty (first occurrence)
		// If so we add a new entry to services
		HashSet<String> tempSet = new HashSet<String>();
		if (services.get(start.getPublicChannel())==null) {
			for (ThreadWithRole twr : start.getServiceThreads()) {
				tempSet.add(twr.getRole());
			}
			services.put(start.getPublicChannel(), tempSet);
		}
		// Otherwise we run a check
		else {
			// It consists of checking that the set of service roles is  what we get from services
			for (ThreadWithRole twr : start.getServiceThreads()) 
				tempSet.add(twr.getRole());
			if (!services.get(start.getPublicChannel()).equals(tempSet)) {
				errors.add(new Pair<String,EStructuralFeature>("Some roles in " + 
						start.getPublicChannel().getName() +
						" are used as servers and as active roles in other instances.",
						start.eContainingFeature()));
			}
		}
		
		
		
		return doSwitchIfNotNull(start.getContinuation());
	}
	

	
	
	public String caseInteraction(Interaction interaction)	{

		// we first make sure that that the session channel used is in delta
		if (!delta.containsKey(interaction.getSession())) {
			errors.add(new Pair<String,EStructuralFeature>(
					"The choreography contains open term "+ interaction.getSession(),
					interaction.eContainingFeature()));
			return "";
		}
		
		GlobalType g = delta.get(interaction.getSession());

		// we check that the sender thread exists
		if (theta.get(interaction.getSender())==null) { 
			errors.add(new Pair<String,EStructuralFeature>("Thread " + 
															interaction.getSender() +
															" is not in session "+interaction.getSession(),
															interaction.eContainingFeature()));
		}		
		// if so, we check that the sender thread is actually in this session
		else if (!theta.get(interaction.getSender()).containsKey(interaction.getSession())) {
			errors.add(new Pair<String,EStructuralFeature>("Thread " + 
					interaction.getSender() +
					" is not in session "+interaction.getSession(),
					interaction.eContainingFeature()));
		}		
		// if so, we check that the sender thread is the one supposed to send according to the type
		else {
			String temp = (theta.get(interaction.getSender())).get(interaction.getSession());
			if ( !temp.equals(g.getSender()) ) {
				errors.add(new Pair<String,EStructuralFeature>("Thread " + 
						interaction.getSender() +
						" is not supposed to output here",
						interaction.eContainingFeature()));
			}
		}
		


		// we check that the receiver thread exists
		if (theta.get(interaction.getReceiver())==null) { 
			errors.add(new Pair<String,EStructuralFeature>("Thread " + 
															interaction.getReceiver() +
															" is not in session "+interaction.getSession(),
															interaction.eContainingFeature()));
		}		
		// if so, we check that the receiver thread is actually in this session
		else if (!theta.get(interaction.getReceiver()).containsKey(interaction.getSession())) {
			errors.add(new Pair<String,EStructuralFeature>("Thread " + 
					interaction.getReceiver() +
					" is not in session "+interaction.getSession(),
					interaction.eContainingFeature()));
		}		
		// if so, we check that the receiver thread is the one supposed to receive according to the type
		else {
			String temp2 = (theta.get(interaction.getReceiver())).get(interaction.getSession());
			if ( !temp2.equals(g.getReceiver()) ) {
				errors.add(new Pair<String,EStructuralFeature>("Thread " + 
						interaction.getReceiver() +
						" is not supposed to input here",
						interaction.eContainingFeature()));
			}
		}

		
		// we check that the operator used is among the ones available in the type
		boolean flag = true;
		GlobalType newtype = null;
		for (BranchGType br : g.getBranches()) {
			if (br.getOperation().equals(interaction.getOperation())) {
				flag = false;
				newtype = br.getContinuation();
			}
		}
		if (flag) {
			errors.add(new Pair<String,EStructuralFeature>("Operation " +
															interaction.getOperation() +
															" not declared in the type",
															interaction.eContainmentFeature()));
			return "";
		}
		
		// We need to check that the type of the message matches the type of the receiving variable
		// for that we call a specialised method
/*		String tempType; 
		if (varTypes.get(interaction.getReceiver())==null)
			tempType = null;
		else tempType = (varTypes.get(interaction.getReceiver())).get(interaction.getReceiverVariable());
		String inferredType = null;//infer(interaction.getSenderExpression());
		if (tempType==null) {
			HashMap<String,String> local = new HashMap<String,String>();
			local.put(interaction.getReceiverVariable(), inferredType);
			varTypes.put(interaction.getReceiver(), local);
		}
		else if (tempType!=inferredType) { 
			errors.add(new Pair<String,EStructuralFeature>("The type of the variable " +
					interaction.getSenderExpression() + 
					" does not match the type of the communicated message",
					interaction.eContainmentFeature()));
		}
	*/	
		// we now change delta and then check the continuation
		delta.remove(interaction.getSession());
		delta.put(interaction.getSession(), newtype);
		return doSwitchIfNotNull(interaction.getContinuation());

	}
	
	

	




	private String infer(ExpressionBasicTerm exp) {
		
		//System.out.println(exp.getClass().toString());
					
		return "";
	}



	public String caseIfThenElse(IfThenElse cond)	{
		
		HashMap<String,GlobalType> backup = (HashMap<String,GlobalType>)delta.clone();
		
		System.out.println(delta);
		
		doSwitchIfNotNull(cond.getThen());
		
		System.out.println(delta);

		delta = backup;
		
		System.out.println(delta);

		doSwitchIfNotNull(cond.getElse());
		
		return "";
	}

	public String doSwitchIfNotNull (EObject obj) {
		if (obj==null) {
			for (String s : delta.keySet()) {
				if (delta.get(s)!=null) 
					errors.add(new Pair<String,EStructuralFeature>(
							"Channel " + s + " is not correctly used",
							ChorPackage.Literals.PROGRAM__NAME));
			}
			return "";
		}
		else return doSwitch(obj);
	}

}


	
	

