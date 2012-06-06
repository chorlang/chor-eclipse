package org.chor.epp.impl;

import java.io.IOException;
import java.io.Writer;

import jolie.lang.parse.ast.OLSyntaxNode;

public class JolieProcessPrettyPrinter extends PrettyPrinter
{
	private final OLSyntaxNode rootNode;
	
	public JolieProcessPrettyPrinter( Writer writer, OLSyntaxNode rootNode )
	{
		super( writer );
		this.rootNode = rootNode;
	}
	
	public void run()
		throws IOException
	{
		JolieProcessPrettyPrinterVisitor visitor = new JolieProcessPrettyPrinterVisitor( this );
		//writeLineIndented( "main" );
		//writeLineIndented( "{" );
		//indent();
		rootNode.accept( visitor );
		//unindent();
		//writeLineIndented( "}" );
		flush();
	}
}
