/**
 *   Copyright (c) 2014 BestSolution.at EDV Systemhaus GmbH/Austria,
 *   http://www.BestSolution.at
 *  
 *   This file is part of framework-grid which was developed with funding
 *   from DI Christoph Hermann - InformationsTechnologie Beratung Hermann
 *   /Austria.
 *  
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 */
package at.bestsolution.framework.grid.model.grid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFree Text Auto Filter Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.framework.grid.model.grid.MFreeTextAutoFilterConfiguration#getMatchType <em>Match Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.framework.grid.model.grid.GridPackage#getMFreeTextAutoFilterConfiguration()
 * @model
 * @generated
 */
public interface MFreeTextAutoFilterConfiguration extends MAutoFilterConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "  Copyright (c) 2014 BestSolution.at EDV Systemhaus GmbH/Austria,\n  http://www.BestSolution.at\n \n  This file is part of framework-grid which was developed with funding\n  from DI Christoph Hermann - InformationsTechnologie Beratung Hermann\n  /Austria.\n \n  Licensed under the Apache License, Version 2.0 (the \"License\");\n  you may not use this file except in compliance with the License.\n  You may obtain a copy of the License at\n \n      http://www.apache.org/licenses/LICENSE-2.0\n\n  Unless required by applicable law or agreed to in writing, software\n  distributed under the License is distributed on an \"AS IS\" BASIS,\n  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n  See the License for the specific language governing permissions and\n  limitations under the License.\n";

	/**
	 * Returns the value of the '<em><b>Match Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.framework.grid.model.grid.MAutoFilterMatchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Type</em>' attribute.
	 * @see at.bestsolution.framework.grid.model.grid.MAutoFilterMatchType
	 * @see #setMatchType(MAutoFilterMatchType)
	 * @see at.bestsolution.framework.grid.model.grid.GridPackage#getMFreeTextAutoFilterConfiguration_MatchType()
	 * @model
	 * @generated
	 */
	MAutoFilterMatchType getMatchType();

	/**
	 * Sets the value of the '{@link at.bestsolution.framework.grid.model.grid.MFreeTextAutoFilterConfiguration#getMatchType <em>Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Type</em>' attribute.
	 * @see at.bestsolution.framework.grid.model.grid.MAutoFilterMatchType
	 * @see #getMatchType()
	 * @generated
	 */
	void setMatchType(MAutoFilterMatchType value);

} // MFreeTextAutoFilterConfiguration
