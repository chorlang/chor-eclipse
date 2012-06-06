package org.chor.epp.impl;

import java.io.IOException;
import java.io.Writer;

public abstract class PrettyPrinter
{
	private int indentation = 0;
	private final Writer writer;
	private final StringBuilder builder = new StringBuilder();
	
	public PrettyPrinter( Writer writer )
	{
		this.writer = writer;
	}
	
	protected void setIndentationLevel( int level )
	{
		this.indentation = level;
	}
	
	protected int indentationLevel()
	{
		return indentation;
	}
	
	protected void indent()
	{
		indentation++;
	}

	protected void unindent()
	{
		indentation--;
	}
	
	protected void writeIndented( String s )
	{
		for( int i = 0; i < indentation; i++ ) {
			builder.append( '\t' );
		}
		builder.append( s );
	}
	
	protected void writeLineIndented( String s )
	{
		for( int i = 0; i < indentation; i++ ) {
			builder.append( '\t' );
		}
		builder.append( s );
		builder.append( '\n' );
	}
	
	protected void writeLine( String s )
	{
		builder.append( s );
		builder.append( '\n' );
	}
	
	protected void writeLine()
	{
		builder.append( '\n' );
	}
	
	protected void write( String s )
	{
		builder.append( s );
	}
	
	protected void flush()
		throws IOException
	{
		writer.write( builder.toString() );
		writer.flush();
	}
}
