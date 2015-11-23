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

package at.meduni.liferay.portlet.bbmrieric.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ContactInformation service. Represents a row in the &quot;bbmrieric.contactinformation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link at.meduni.liferay.portlet.bbmrieric.model.impl.ContactInformationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link at.meduni.liferay.portlet.bbmrieric.model.impl.ContactInformationImpl}.
 * </p>
 *
 * @author reihsr
 * @see ContactInformation
 * @see at.meduni.liferay.portlet.bbmrieric.model.impl.ContactInformationImpl
 * @see at.meduni.liferay.portlet.bbmrieric.model.impl.ContactInformationModelImpl
 * @generated
 */
public interface ContactInformationModel extends BaseModel<ContactInformation>,
	StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a contact information model instance should use the {@link ContactInformation} interface instead.
	 */

	/**
	 * Returns the primary key of this contact information.
	 *
	 * @return the primary key of this contact information
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this contact information.
	 *
	 * @param primaryKey the primary key of this contact information
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this contact information.
	 *
	 * @return the uuid of this contact information
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this contact information.
	 *
	 * @param uuid the uuid of this contact information
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the contactinformation ID of this contact information.
	 *
	 * @return the contactinformation ID of this contact information
	 */
	public long getContactinformationId();

	/**
	 * Sets the contactinformation ID of this contact information.
	 *
	 * @param contactinformationId the contactinformation ID of this contact information
	 */
	public void setContactinformationId(long contactinformationId);

	/**
	 * Returns the company ID of this contact information.
	 *
	 * @return the company ID of this contact information
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this contact information.
	 *
	 * @param companyId the company ID of this contact information
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this contact information.
	 *
	 * @return the group ID of this contact information
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this contact information.
	 *
	 * @param groupId the group ID of this contact information
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this contact information.
	 *
	 * @return the user ID of this contact information
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this contact information.
	 *
	 * @param userId the user ID of this contact information
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this contact information.
	 *
	 * @return the user uuid of this contact information
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this contact information.
	 *
	 * @param userUuid the user uuid of this contact information
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this contact information.
	 *
	 * @return the user name of this contact information
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this contact information.
	 *
	 * @param userName the user name of this contact information
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this contact information.
	 *
	 * @return the create date of this contact information
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this contact information.
	 *
	 * @param createDate the create date of this contact information
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this contact information.
	 *
	 * @return the modified date of this contact information
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this contact information.
	 *
	 * @param modifiedDate the modified date of this contact information
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the updateuuid of this contact information.
	 *
	 * @return the updateuuid of this contact information
	 */
	@AutoEscape
	public String getUpdateuuid();

	/**
	 * Sets the updateuuid of this contact information.
	 *
	 * @param updateuuid the updateuuid of this contact information
	 */
	public void setUpdateuuid(String updateuuid);

	/**
	 * Returns the contact i d of this contact information.
	 *
	 * @return the contact i d of this contact information
	 */
	@AutoEscape
	public String getContactID();

	/**
	 * Sets the contact i d of this contact information.
	 *
	 * @param contactID the contact i d of this contact information
	 */
	public void setContactID(String contactID);

	/**
	 * Returns the contact email of this contact information.
	 *
	 * @return the contact email of this contact information
	 */
	@AutoEscape
	public String getContactEmail();

	/**
	 * Sets the contact email of this contact information.
	 *
	 * @param contactEmail the contact email of this contact information
	 */
	public void setContactEmail(String contactEmail);

	/**
	 * Returns the contact country of this contact information.
	 *
	 * @return the contact country of this contact information
	 */
	@AutoEscape
	public String getContactCountry();

	/**
	 * Sets the contact country of this contact information.
	 *
	 * @param contactCountry the contact country of this contact information
	 */
	public void setContactCountry(String contactCountry);

	/**
	 * Returns the contact first name of this contact information.
	 *
	 * @return the contact first name of this contact information
	 */
	@AutoEscape
	public String getContactFirstName();

	/**
	 * Sets the contact first name of this contact information.
	 *
	 * @param contactFirstName the contact first name of this contact information
	 */
	public void setContactFirstName(String contactFirstName);

	/**
	 * Returns the contact last name of this contact information.
	 *
	 * @return the contact last name of this contact information
	 */
	@AutoEscape
	public String getContactLastName();

	/**
	 * Sets the contact last name of this contact information.
	 *
	 * @param contactLastName the contact last name of this contact information
	 */
	public void setContactLastName(String contactLastName);

	/**
	 * Returns the contact phone of this contact information.
	 *
	 * @return the contact phone of this contact information
	 */
	@AutoEscape
	public String getContactPhone();

	/**
	 * Sets the contact phone of this contact information.
	 *
	 * @param contactPhone the contact phone of this contact information
	 */
	public void setContactPhone(String contactPhone);

	/**
	 * Returns the contact address of this contact information.
	 *
	 * @return the contact address of this contact information
	 */
	@AutoEscape
	public String getContactAddress();

	/**
	 * Sets the contact address of this contact information.
	 *
	 * @param contactAddress the contact address of this contact information
	 */
	public void setContactAddress(String contactAddress);

	/**
	 * Returns the contact z i p of this contact information.
	 *
	 * @return the contact z i p of this contact information
	 */
	@AutoEscape
	public String getContactZIP();

	/**
	 * Sets the contact z i p of this contact information.
	 *
	 * @param contactZIP the contact z i p of this contact information
	 */
	public void setContactZIP(String contactZIP);

	/**
	 * Returns the contact city of this contact information.
	 *
	 * @return the contact city of this contact information
	 */
	@AutoEscape
	public String getContactCity();

	/**
	 * Sets the contact city of this contact information.
	 *
	 * @param contactCity the contact city of this contact information
	 */
	public void setContactCity(String contactCity);

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
	public int compareTo(ContactInformation contactInformation);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ContactInformation> toCacheModel();

	@Override
	public ContactInformation toEscapedModel();

	@Override
	public ContactInformation toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}