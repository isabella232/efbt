/*******************************************************************************
 * Copyright (c) 2020 Bird Software Solutions Ltd
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Neil Mackenzie - initial API and implementation
 *******************************************************************************/
/*
 * generated by Xtext 2.23.0
 */
package org.eclipse.efbt.cocason.dsl.cocason;

import org.eclipse.efbt.cocamo.core.model.functionality_module.Functionality_modulePackage;
import org.eclipse.efbt.cocamo.core.model.module_management.Module_managementPackage;
import org.eclipse.efbt.cocamo.core.model.requirements_text.Requirements_textPackage;
import org.eclipse.efbt.cocamo.core.model.scenarios.ScenariosPackage;
import org.eclipse.efbt.cocamo.core.model.test.TestPackage;
import org.eclipse.efbt.cocamo.core.model.test_definition.Test_definitionPackage;
import org.eclipse.efbt.cocamo.core.model.test_input_data.Test_input_dataPackage;
import org.eclipse.efbt.cocamo.functions.model.functions.FunctionsPackage;
import org.eclipse.efbt.cocamo.smcubes.model.base_column_structured_data.Base_column_structured_dataPackage;
import org.eclipse.efbt.cocamo.smcubes.model.cocamo.CocamoPackage;
import org.eclipse.efbt.cocamo.smcubes.model.column_structured_data.Column_structured_dataPackage;
import org.eclipse.efbt.cocamo.smcubes.model.core.CorePackage;
import org.eclipse.efbt.cocamo.smcubes.model.data_definition.Data_definitionPackage;
import org.eclipse.efbt.cocamo.smcubes.model.efbt_data_definition.Efbt_data_definitionPackage;
import org.eclipse.efbt.cocamo.smcubes.model.efbt_mapping.Efbt_mappingPackage;
import org.eclipse.efbt.cocamo.smcubes.model.efbt_vtl_transformation.Efbt_vtl_transformationPackage;
import org.eclipse.efbt.cocamo.smcubes.model.mapping.MappingPackage;
import org.eclipse.efbt.cocamo.smcubes.model.rendering.RenderingPackage;
import org.eclipse.efbt.cocamo.smcubes.model.reports.ReportsPackage;
import org.eclipse.efbt.cocamo.smcubes.model.smcubes_model.Smcubes_modelPackage;
import org.eclipse.efbt.cocamo.smcubes.model.vtl_transformation.Vtl_transformationPackage;
import org.eclipse.efbt.language.trl.model.transformation.TransformationPackage;
import org.eclipse.efbt.language.trl.model.trl_report_cell_views.Trl_report_cell_viewsPackage;
import org.eclipse.efbt.language.trl.model.trl_sql_views.Trl_sql_viewsPackage;
import org.eclipse.efbt.lineage.attributelineage.model.attribute_lineage.Attribute_lineagePackage;
import org.eclipse.efbt.lineage.attributelineage.model.cube_transformation_logic.Cube_transformation_logicPackage;
import org.eclipse.efbt.lineage.attributelineage.model.row_transformation_logic.Row_transformation_logicPackage;
import org.eclipse.efbt.lineage.common.model.advanced_variable_lineagefunctions.Advanced_variable_lineagefunctionsPackage;
import org.eclipse.efbt.lineage.common.model.column_transformation_logic.Column_transformation_logicPackage;
import org.eclipse.efbt.lineage.common.model.lineagecubes.cube_schema.Cube_schemaPackage;
import org.eclipse.efbt.lineage.common.model.lineagecubes.cubes.CubesPackage;
import org.eclipse.efbt.controller.core.model.platform_call.Platform_callPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class CoCaSonStandaloneSetup extends CoCaSonStandaloneSetupGenerated {

	public static void doSetup() {
		new CoCaSonStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	

	@Override
	public void register(Injector injector) {
		
		if (!EPackage.Registry.INSTANCE.containsKey(Smcubes_modelPackage.eNS_URI))
		    EPackage.Registry.INSTANCE.put(Smcubes_modelPackage.eNS_URI, Smcubes_modelPackage.eINSTANCE);

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/cocamo")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/cocamo", CocamoPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/base_column_structured_data")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/base_column_structured_data",
					Base_column_structured_dataPackage.eINSTANCE);
		}
			
			if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/column_structured_data")) {
				EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/column_structured_data",
						Column_structured_dataPackage.eINSTANCE);
			}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/smcubes_model")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/smcubes_model",
					Smcubes_modelPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/efbt_vtl_transformation")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/efbt_vtl_transformation",
					Efbt_vtl_transformationPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/functionality_module")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/functionality_module",
					Functionality_modulePackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/efbt_mapping")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/efbt_mapping",
					Efbt_mappingPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/data_definition")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/data_definition",
					Data_definitionPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/module_management")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/module_management",
					Module_managementPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/reports")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/reports",
					ReportsPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/efbt_data_definition")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/efbt_data_definition",
					Efbt_data_definitionPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/requirements_text")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/requirements_text",
					Requirements_textPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/scenarios")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/scenarios", ScenariosPackage.eINSTANCE);
		}


		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/test_definition")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/test_definition", Test_definitionPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/test_input_data")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/test_input_data", Test_input_dataPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/test")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/test", TestPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/mapping")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/mapping", MappingPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey(CorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/vtl_transformation")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/vtl_transformation", Vtl_transformationPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/rendering")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/rendering", RenderingPackage.eINSTANCE);
		}
		
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI))
		    EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/attribute_lineage")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/attribute_lineage", Attribute_lineagePackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/functions")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/functions", FunctionsPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/column_transformation_logic")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/column_transformation_logic", Column_transformation_logicPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/row_transformation_logic")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/row_transformation_logic", Row_transformation_logicPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/cubes")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/cubes", CubesPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/cube_transformation_logic")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/cube_transformation_logic", Cube_transformation_logicPackage.eINSTANCE);
		}
		
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/advanced_variable_lineagefunctions")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/advanced_variable_lineagefunctions", Advanced_variable_lineagefunctionsPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/transformation")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/transformation", TransformationPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/cube_schema")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/cube_schema", Cube_schemaPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/trl_sql_views")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/trl_sql_views", Trl_sql_viewsPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/trl_report_cell_views")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/trl_report_cell_views", Trl_report_cell_viewsPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/efbt/platform_call")) {
			EPackage.Registry.INSTANCE.put("http://www.eclipse.org/efbt/platform_call", Platform_callPackage.eINSTANCE);
		}
		
		super.register(injector);
	}
}


