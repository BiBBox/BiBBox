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

package at.meduni.liferay.portlet.rdconnect.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the RDCOrganizationUserAccess service. Represents a row in the &quot;rdconnect.rdcorganizationuseraccess&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link at.meduni.liferay.portlet.rdconnect.model.impl.RDCOrganizationUserAccessModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link at.meduni.liferay.portlet.rdconnect.model.impl.RDCOrganizationUserAccessImpl}.
 * </p>
 *
 * @author Robert Reihs
 * @see RDCOrganizationUserAccess
 * @see at.meduni.liferay.portlet.rdconnect.model.impl.RDCOrganizationUserAccessImpl
 * @see at.meduni.liferay.portlet.rdconnect.model.impl.RDCOrganizationUserAccessModelImpl
 * @generated
 */
public interface RDCOrganizationUserAccessModel extends BaseModel<RDCOrganizationUserAccess> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a r d c organization user access model instance should use the {@link RDCOrganizationUserAccess} interface instead.
	 */

	/**
	 * Returns the primary key of this r d c organization user access.
	 *
	 * @return the primary key of this r d c organization user access
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this r d c organization user access.
	 *
	 * @param primaryKey the primary key of this r d c organization user access
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the rdcorganizationuseraccess ID of this r d c organization user access.
	 *
	 * @return the rdcorganizationuseraccess ID of this r d c organization user access
	 */
	public long getRdcorganizationuseraccessId();

	/**
	 * Sets the rdcorganizationuseraccess ID of this r d c organization user access.
	 *
	 * @param rdcorganizationuseraccessId the rdcorganizationuseraccess ID of this r d c organization user access
	 */
	public void setRdcorganizationuseraccessId(long rdcorganizationuseraccessId);

	/**
	 * Returns the organisation ID of this r d c organization user access.
	 *
	 * @return the organisation ID of this r d c organization user access
	 */
	public long getOrganisationId();

	/**
	 * Sets the organisation ID of this r d c organization user access.
	 *
	 * @param organisationId the organisation ID of this r d c organization user access
	 */
	public void setOrganisationId(long organisationId);

	/**
	 * Returns the user ID of this r d c organization user access.
	 *
	 * @return the user ID of this r d c organization user access
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this r d c organization user access.
	 *
	 * @param userId the user ID of this r d c organization user access
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this r d c organization user access.
	 *
	 * @return the user uuid of this r d c organization user access
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this r d c organization user access.
	 *
	 * @param userUuid the user uuid of this r d c organization user access
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the ipaddress of this r d c organization user access.
	 *
	 * @return the ipaddress of this r d c organization user access
	 */
	public long getIpaddress();

	/**
	 * Sets the ipaddress of this r d c organization user access.
	 *
	 * @param ipaddress the ipaddress of this r d c organization user access
	 */
	public void setIpaddress(long ipaddress);

	/**
	 * Returns the lastaccess of this r d c organization user access.
	 *
	 * @return the lastaccess of this r d c organization user access
	 */
	public Date getLastaccess();

	/**
	 * Sets the lastaccess of this r d c organization user access.
	 *
	 * @param lastaccess the lastaccess of this r d c organization user access
	 */
	public void setLastaccess(Date lastaccess);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		at.meduni.liferay.portlet.rdconnect.model.RDCOrganizationUserAccess rdcOrganizationUserAccess);

	@Override
	public int hashCode();

	@Override
	public CacheModel<at.meduni.liferay.portlet.rdconnect.model.RDCOrganizationUserAccess> toCacheModel();

	@Override
	public at.meduni.liferay.portlet.rdconnect.model.RDCOrganizationUserAccess toEscapedModel();

	@Override
	public at.meduni.liferay.portlet.rdconnect.model.RDCOrganizationUserAccess toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}