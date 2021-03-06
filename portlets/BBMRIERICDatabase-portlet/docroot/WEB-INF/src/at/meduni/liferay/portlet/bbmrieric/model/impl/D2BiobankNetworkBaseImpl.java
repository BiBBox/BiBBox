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

package at.meduni.liferay.portlet.bbmrieric.model.impl;

import at.meduni.liferay.portlet.bbmrieric.model.D2BiobankNetwork;
import at.meduni.liferay.portlet.bbmrieric.service.D2BiobankNetworkLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the D2BiobankNetwork service. Represents a row in the &quot;bbmrieric.d2biobanknetwork&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link D2BiobankNetworkImpl}.
 * </p>
 *
 * @author reihsr
 * @see D2BiobankNetworkImpl
 * @see at.meduni.liferay.portlet.bbmrieric.model.D2BiobankNetwork
 * @generated
 */
public abstract class D2BiobankNetworkBaseImpl extends D2BiobankNetworkModelImpl
	implements D2BiobankNetwork {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a d2 biobank network model instance should use the {@link D2BiobankNetwork} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			D2BiobankNetworkLocalServiceUtil.addD2BiobankNetwork(this);
		}
		else {
			D2BiobankNetworkLocalServiceUtil.updateD2BiobankNetwork(this);
		}
	}
}