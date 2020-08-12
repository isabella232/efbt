/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.efbt.aorta;

import com.google.inject.Injector;

import org.eclipse.efbt.aorta.aorta_program.Aorta_programPackage;
import org.eclipse.efbt.common.model.module_management.Module_managementPackage;
import org.eclipse.efbt.functional_design.core.model.functionality_module.Functionality_modulePackage;
import org.eclipse.efbt.functional_design.core.model.scenarios.ScenariosPackage;
import org.eclipse.efbt.requirements.core.model.requirements_text.Requirements_textPackage;
import org.eclipse.efbt.testing.common.model.test.TestPackage;
import org.eclipse.efbt.testing.common.model.test_definition.Test_definitionPackage;
import org.eclipse.efbt.testing.common.model.test_input_data.Test_input_dataPackage;
import org.eclipse.efbt.input_data.smcubes.model.base_column_structured_data.Base_column_structured_dataPackage;
import org.eclipse.emf.ecore.EPackage;

/**
 * Initialization support for running Xtext languages without Equinox extension
 * registry.
 */
public class AortaStandaloneSetup extends AortaStandaloneSetupGenerated {

	/**
	 * Do Setup
	 */
	public static void doSetup() {
		new AortaStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	/**
	 * Register the model which the language is based upon.
	 * 
	 * @param injector
	 */
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/aorta_program")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/aorta_program", Aorta_programPackage.eINSTANCE);
		}

		
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/base_column_structured_data")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/base_column_structured_data",
					Base_column_structured_dataPackage.eINSTANCE);
		}

	
	//	if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/column_structured_data")) {
	//		EPackage.Registry.INSTANCE.put("http://www.eclipse.org/column_structured_data",
	//				Column_structured_dataPackage.eINSTANCE);
	//	}
	//	if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/column_structures")) {
	//		EPackage.Registry.INSTANCE.put("http://www.eclipse.org/column_structures",
	//				Column_structuresPackage.eINSTANCE);
	//	}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/functionality_module")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/functionality_module",
					Functionality_modulePackage.eINSTANCE);
		}
	//	if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/input_data_structures")) {
	//		EPackage.Registry.INSTANCE.put("http://www.eclipse.org/input_data_structures",
	//				Input_data_structuresPackage.eINSTANCE);
	//	}
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/module_management")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/module_management",
					Module_managementPackage.eINSTANCE);
		}
		
		

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/requirements_text")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/requirements_text",
					Requirements_textPackage.eINSTANCE);
		}
	
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/scenarios")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/scenarios", ScenariosPackage.eINSTANCE);
		}

		
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/test_definition")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/test_definition", Test_definitionPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/test_input_data")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/test_input_data", Test_input_dataPackage.eINSTANCE);
		}

		
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/test")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/test", TestPackage.eINSTANCE);
		}

		super.register(injector);
	}

}
