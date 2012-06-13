/***************************************************************************
 *   Copyright (C) 2011-2012 by Fabrizio Montesi <famontesi@gmail.com>     *
 *   Copyright (C) 2011 by Marco Carbone <carbonem@itu.dk>                 *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU Library General Public License as       *
 *   published by the Free Software Foundation; either version 2 of the    *
 *   License, or (at your option) any later version.                       *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU Library General Public     *
 *   License along with this program; if not, write to the                 *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 *                                                                         *
 *   For details about the authors of this software, see the AUTHORS file. *
 ***************************************************************************/


package org.chor.validation;

import org.chor.chor.Program;
import org.chor.validation.impl.TypeChecker;
import org.eclipse.xtext.validation.Check;


public class ChorJavaValidator extends AbstractChorJavaValidator
{
	@Check
	public void checkProgram(Program program)
	{
		TypeChecker t = new TypeChecker( program, this );
		/* for (Pair<String, EStructuralFeature> p : t.errors) {
			error(p.key(),ChorPackage.Literals.PROGRAM__NAME);
			error(
				p.key(),
				program.getChoreography().eContainer(),
				ChorPackage.Literals.INTERACTION__OPERATION,2
			);
			//error( p.key(), p.value() );
		}*/
	}
}
