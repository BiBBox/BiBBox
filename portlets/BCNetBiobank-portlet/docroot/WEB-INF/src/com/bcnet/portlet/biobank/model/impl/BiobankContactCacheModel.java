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

package com.bcnet.portlet.biobank.model.impl;

import com.bcnet.portlet.biobank.model.BiobankContact;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing BiobankContact in entity cache.
 *
 * @author suyama
 * @see BiobankContact
 * @generated
 */
public class BiobankContactCacheModel implements CacheModel<BiobankContact>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{biobankDbId=");
		sb.append(biobankDbId);
		sb.append(", contactId=");
		sb.append(contactId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BiobankContact toEntityModel() {
		BiobankContactImpl biobankContactImpl = new BiobankContactImpl();

		biobankContactImpl.setBiobankDbId(biobankDbId);
		biobankContactImpl.setContactId(contactId);

		biobankContactImpl.resetOriginalValues();

		return biobankContactImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		biobankDbId = objectInput.readLong();
		contactId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(biobankDbId);
		objectOutput.writeLong(contactId);
	}

	public long biobankDbId;
	public long contactId;
}