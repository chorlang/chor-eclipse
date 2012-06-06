package org.chor.validation;

import jolie.util.Pair;

import org.chor.chor.ChorPackage;
import org.chor.chor.Program;
import org.chor.validation.impl.TypeChecker;
import org.eclipse.xtext.validation.Check;
import org.eclipse.emf.ecore.EStructuralFeature;


public class ChorJavaValidator extends AbstractChorJavaValidator {
	
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
	@Check
	public void checkProgram(Program program)
	{
		TypeChecker t = new TypeChecker(program);
		
		System.out.println("Processing of the program terminated");

		
		for (Pair<String, EStructuralFeature> p : t.errors) {
			error(p.key(),ChorPackage.Literals.PROGRAM__NAME);
		}
		
		
	/*	
		String temp = t.check(program);
		if (temp != "" )
			error( temp, ChorPackage.Literals.PROGRAM__NAME);
	*/
		
	}




}
