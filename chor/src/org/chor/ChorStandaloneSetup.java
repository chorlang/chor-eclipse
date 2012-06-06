
package org.chor;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ChorStandaloneSetup extends ChorStandaloneSetupGenerated{

	public static void doSetup() {
		new ChorStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

