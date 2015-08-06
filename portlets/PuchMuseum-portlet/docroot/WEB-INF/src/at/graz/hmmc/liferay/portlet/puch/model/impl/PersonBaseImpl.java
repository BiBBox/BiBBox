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

package at.graz.hmmc.liferay.portlet.puch.model.impl;

import at.graz.hmmc.liferay.portlet.puch.model.Person;
import at.graz.hmmc.liferay.portlet.puch.service.PersonLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Person service. Represents a row in the &quot;puchmuseum_person&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PersonImpl}.
 * </p>
 *
 * @author reihsr
 * @see PersonImpl
 * @see at.graz.hmmc.liferay.portlet.puch.model.Person
 * @generated
 */
public abstract class PersonBaseImpl extends PersonModelImpl implements Person {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a person model instance should use the {@link Person} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PersonLocalServiceUtil.addPerson(this);
		}
		else {
			PersonLocalServiceUtil.updatePerson(this);
		}
	}
}