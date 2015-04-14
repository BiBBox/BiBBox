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

package at.meduni.liferay.portlet.bbmrieric.services.model.impl;

import at.meduni.liferay.portlet.bbmrieric.services.model.LDAPlog;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LDAPlog in entity cache.
 *
 * @author reihsr
 * @see LDAPlog
 * @generated
 */
public class LDAPlogCacheModel implements CacheModel<LDAPlog>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{ldaplogId=");
		sb.append(ldaplogId);

		return sb.toString();
	}

	@Override
	public LDAPlog toEntityModel() {
		LDAPlogImpl ldaPlogImpl = new LDAPlogImpl();

		ldaPlogImpl.setLdaplogId(ldaplogId);

		ldaPlogImpl.resetOriginalValues();

		return ldaPlogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ldaplogId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ldaplogId);
	}

	public long ldaplogId;
}