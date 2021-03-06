/*******************************************************************************
* Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*    Thales - initial API and implementation
*******************************************************************************/
package org.polarsys.capella.ad.viewpoint.dsl.generation.ui.util;

/**
 * @author Boubekeur Zendagui
 */
public class DataWidgetClasses {
	
	// Controller to manage Multiple Semantic List 
	public static final int class_Natures__Multiple_Field_Controller = 1;
	// Controller to manage Simple Semantic List
	public static final int class_Natures__Simple_Field_Controller = 2;
	// The query providing data for Multiple Semantic List
	public static final int class_Natures__Field_Controller_Query = 3;
	
	// 
	public static final int class_Natures__Checkbox_Widget = 10;
	public static final int class_Natures__Radiobox_Widget = 11;
	
	
	// Name of the class to generate 
	public String className;
	// Name of the the package wherein the class will be generated
	public String classPackage;
	// The nature of the class to generate.
	public int classNature;

}
