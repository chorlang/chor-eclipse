package org.chor.ui.handlers;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.chor.chor.Program;
import org.chor.epp.EndpointProjectionException;
import org.chor.epp.JolieEpp;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class GenerateJolieHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public GenerateJolieHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IEditorPart e = HandlerUtil.getActiveEditor(event);
		final XtextEditor editor = (XtextEditor) e;
		editor.getDocument().readOnly( new IUnitOfWork.Void<XtextResource>() {
			public void process(XtextResource resource) {
				File srcGenDirectory =
					new File(
						editor.getResource().getWorkspace().getRoot().getLocation().toOSString()
						+
						editor.getResource().getFullPath().toOSString()
					);
				JolieEpp s = new JolieEpp( srcGenDirectory.getParentFile() );
				String message = "Projection completed successfully";
				try {
					s.epp( (Program) resource.getParseResult().getRootASTElement() );
				} catch( EndpointProjectionException e ) {
					message = e.getMessage();
				} catch( Exception e ) {
					StringWriter w = new StringWriter();
					PrintWriter p = new PrintWriter( w );
					e.printStackTrace( p );
					message = w.toString();
				}
				MessageDialog.openInformation(
					window.getShell(),
					"chorus.ui",
					message
				);
			}
		} );

		return null;
	}
	

}
