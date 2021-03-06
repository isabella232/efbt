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

import org.eclipse.efbt.cocason.dsl.cocason.conversion.DATEValueConverter;

import org.eclipse.xtext.conversion.IValueConverterService;

import org.eclipse.xtext.naming.IQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class CoCaSonRuntimeModule extends AbstractCoCaSonRuntimeModule {
	
    
    @Override
    public Class<? extends IValueConverterService> bindIValueConverterService() {
        return DATEValueConverter.class;
    }
    

}
