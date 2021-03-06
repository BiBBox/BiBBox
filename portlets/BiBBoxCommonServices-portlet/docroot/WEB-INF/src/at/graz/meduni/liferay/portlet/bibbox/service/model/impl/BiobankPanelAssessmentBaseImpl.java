/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package at.graz.meduni.liferay.portlet.bibbox.service.model.impl;

import at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessment;
import at.graz.meduni.liferay.portlet.bibbox.service.service.BiobankPanelAssessmentLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the BiobankPanelAssessment service. Represents a row in the &quot;bibboxcs.biobankpanelassessment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BiobankPanelAssessmentImpl}.
 * </p>
 *
 * @author reihsr
 * @see BiobankPanelAssessmentImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.service.model.BiobankPanelAssessment
 * @generated
 */
public abstract class BiobankPanelAssessmentBaseImpl
	extends BiobankPanelAssessmentModelImpl implements BiobankPanelAssessment {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a biobank panel assessment model instance should use the {@link BiobankPanelAssessment} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BiobankPanelAssessmentLocalServiceUtil.addBiobankPanelAssessment(this);
		}
		else {
			BiobankPanelAssessmentLocalServiceUtil.updateBiobankPanelAssessment(this);
		}
	}
}