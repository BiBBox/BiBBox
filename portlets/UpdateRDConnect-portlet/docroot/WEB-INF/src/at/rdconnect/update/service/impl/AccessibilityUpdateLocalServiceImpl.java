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

package at.rdconnect.update.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import at.rdconnect.update.model.AccessibilityUpdate;
import at.rdconnect.update.model.CoreUpdate;
import at.rdconnect.update.service.base.AccessibilityUpdateLocalServiceBaseImpl;

/**
 * The implementation of the accessibility update local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link at.rdconnect.update.service.AccessibilityUpdateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author reihsr
 * @see at.rdconnect.update.service.base.AccessibilityUpdateLocalServiceBaseImpl
 * @see at.rdconnect.update.service.AccessibilityUpdateLocalServiceUtil
 */
public class AccessibilityUpdateLocalServiceImpl
	extends AccessibilityUpdateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link at.rdconnect.update.service.AccessibilityUpdateLocalServiceUtil} to access the accessibility update local service.
	 */
	public List<AccessibilityUpdate> getAccessibilityUpdateByOrganization(long organizationid) throws SystemException {
		return accessibilityUpdatePersistence.findByOrganizationId(organizationid);
	}
}