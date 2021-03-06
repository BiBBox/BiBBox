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

import at.meduni.liferay.portlet.bbmrieric.model.ContactInformation;
import at.meduni.liferay.portlet.bbmrieric.model.ContactInformationModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ContactInformation service. Represents a row in the &quot;bbmrieric.contactinformation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.meduni.liferay.portlet.bbmrieric.model.ContactInformationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContactInformationImpl}.
 * </p>
 *
 * @author reihsr
 * @see ContactInformationImpl
 * @see at.meduni.liferay.portlet.bbmrieric.model.ContactInformation
 * @see at.meduni.liferay.portlet.bbmrieric.model.ContactInformationModel
 * @generated
 */
public class ContactInformationModelImpl extends BaseModelImpl<ContactInformation>
	implements ContactInformationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a contact information model instance should use the {@link at.meduni.liferay.portlet.bbmrieric.model.ContactInformation} interface instead.
	 */
	public static final String TABLE_NAME = "bbmrieric.contactinformation";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "contactinformationId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "updateuuid", Types.VARCHAR },
			{ "contactID", Types.VARCHAR },
			{ "contactEmail", Types.VARCHAR },
			{ "contactCountry", Types.VARCHAR },
			{ "contactFirstName", Types.VARCHAR },
			{ "contactLastName", Types.VARCHAR },
			{ "contactPhone", Types.VARCHAR },
			{ "contactAddress", Types.VARCHAR },
			{ "contactZIP", Types.VARCHAR },
			{ "contactCity", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table bbmrieric.contactinformation (uuid_ VARCHAR(75) null,contactinformationId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,userName TEXT null,createDate DATE null,modifiedDate DATE null,updateuuid TEXT null,contactID TEXT null,contactEmail TEXT null,contactCountry TEXT null,contactFirstName TEXT null,contactLastName TEXT null,contactPhone TEXT null,contactAddress TEXT null,contactZIP TEXT null,contactCity TEXT null)";
	public static final String TABLE_SQL_DROP = "drop table bbmrieric.contactinformation";
	public static final String ORDER_BY_JPQL = " ORDER BY contactInformation.contactinformationId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY bbmrieric.contactinformation.contactinformationId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.meduni.liferay.portlet.bbmrieric.model.ContactInformation"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.meduni.liferay.portlet.bbmrieric.model.ContactInformation"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.meduni.liferay.portlet.bbmrieric.model.ContactInformation"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long CONTACTID_COLUMN_BITMASK = 2L;
	public static long GROUPID_COLUMN_BITMASK = 4L;
	public static long UPDATEUUID_COLUMN_BITMASK = 8L;
	public static long UUID_COLUMN_BITMASK = 16L;
	public static long CONTACTINFORMATIONID_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.meduni.liferay.portlet.bbmrieric.model.ContactInformation"));

	public ContactInformationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _contactinformationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setContactinformationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contactinformationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ContactInformation.class;
	}

	@Override
	public String getModelClassName() {
		return ContactInformation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("contactinformationId", getContactinformationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("updateuuid", getUpdateuuid());
		attributes.put("contactID", getContactID());
		attributes.put("contactEmail", getContactEmail());
		attributes.put("contactCountry", getContactCountry());
		attributes.put("contactFirstName", getContactFirstName());
		attributes.put("contactLastName", getContactLastName());
		attributes.put("contactPhone", getContactPhone());
		attributes.put("contactAddress", getContactAddress());
		attributes.put("contactZIP", getContactZIP());
		attributes.put("contactCity", getContactCity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long contactinformationId = (Long)attributes.get("contactinformationId");

		if (contactinformationId != null) {
			setContactinformationId(contactinformationId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String updateuuid = (String)attributes.get("updateuuid");

		if (updateuuid != null) {
			setUpdateuuid(updateuuid);
		}

		String contactID = (String)attributes.get("contactID");

		if (contactID != null) {
			setContactID(contactID);
		}

		String contactEmail = (String)attributes.get("contactEmail");

		if (contactEmail != null) {
			setContactEmail(contactEmail);
		}

		String contactCountry = (String)attributes.get("contactCountry");

		if (contactCountry != null) {
			setContactCountry(contactCountry);
		}

		String contactFirstName = (String)attributes.get("contactFirstName");

		if (contactFirstName != null) {
			setContactFirstName(contactFirstName);
		}

		String contactLastName = (String)attributes.get("contactLastName");

		if (contactLastName != null) {
			setContactLastName(contactLastName);
		}

		String contactPhone = (String)attributes.get("contactPhone");

		if (contactPhone != null) {
			setContactPhone(contactPhone);
		}

		String contactAddress = (String)attributes.get("contactAddress");

		if (contactAddress != null) {
			setContactAddress(contactAddress);
		}

		String contactZIP = (String)attributes.get("contactZIP");

		if (contactZIP != null) {
			setContactZIP(contactZIP);
		}

		String contactCity = (String)attributes.get("contactCity");

		if (contactCity != null) {
			setContactCity(contactCity);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getContactinformationId() {
		return _contactinformationId;
	}

	@Override
	public void setContactinformationId(long contactinformationId) {
		_contactinformationId = contactinformationId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getUpdateuuid() {
		if (_updateuuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _updateuuid;
		}
	}

	@Override
	public void setUpdateuuid(String updateuuid) {
		_columnBitmask |= UPDATEUUID_COLUMN_BITMASK;

		if (_originalUpdateuuid == null) {
			_originalUpdateuuid = _updateuuid;
		}

		_updateuuid = updateuuid;
	}

	public String getOriginalUpdateuuid() {
		return GetterUtil.getString(_originalUpdateuuid);
	}

	@Override
	public String getContactID() {
		if (_contactID == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactID;
		}
	}

	@Override
	public void setContactID(String contactID) {
		_columnBitmask |= CONTACTID_COLUMN_BITMASK;

		if (_originalContactID == null) {
			_originalContactID = _contactID;
		}

		_contactID = contactID;
	}

	public String getOriginalContactID() {
		return GetterUtil.getString(_originalContactID);
	}

	@Override
	public String getContactEmail() {
		if (_contactEmail == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactEmail;
		}
	}

	@Override
	public void setContactEmail(String contactEmail) {
		_contactEmail = contactEmail;
	}

	@Override
	public String getContactCountry() {
		if (_contactCountry == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactCountry;
		}
	}

	@Override
	public void setContactCountry(String contactCountry) {
		_contactCountry = contactCountry;
	}

	@Override
	public String getContactFirstName() {
		if (_contactFirstName == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactFirstName;
		}
	}

	@Override
	public void setContactFirstName(String contactFirstName) {
		_contactFirstName = contactFirstName;
	}

	@Override
	public String getContactLastName() {
		if (_contactLastName == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactLastName;
		}
	}

	@Override
	public void setContactLastName(String contactLastName) {
		_contactLastName = contactLastName;
	}

	@Override
	public String getContactPhone() {
		if (_contactPhone == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactPhone;
		}
	}

	@Override
	public void setContactPhone(String contactPhone) {
		_contactPhone = contactPhone;
	}

	@Override
	public String getContactAddress() {
		if (_contactAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactAddress;
		}
	}

	@Override
	public void setContactAddress(String contactAddress) {
		_contactAddress = contactAddress;
	}

	@Override
	public String getContactZIP() {
		if (_contactZIP == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactZIP;
		}
	}

	@Override
	public void setContactZIP(String contactZIP) {
		_contactZIP = contactZIP;
	}

	@Override
	public String getContactCity() {
		if (_contactCity == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactCity;
		}
	}

	@Override
	public void setContactCity(String contactCity) {
		_contactCity = contactCity;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				ContactInformation.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			ContactInformation.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ContactInformation toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ContactInformation)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ContactInformationImpl contactInformationImpl = new ContactInformationImpl();

		contactInformationImpl.setUuid(getUuid());
		contactInformationImpl.setContactinformationId(getContactinformationId());
		contactInformationImpl.setCompanyId(getCompanyId());
		contactInformationImpl.setGroupId(getGroupId());
		contactInformationImpl.setUserId(getUserId());
		contactInformationImpl.setUserName(getUserName());
		contactInformationImpl.setCreateDate(getCreateDate());
		contactInformationImpl.setModifiedDate(getModifiedDate());
		contactInformationImpl.setUpdateuuid(getUpdateuuid());
		contactInformationImpl.setContactID(getContactID());
		contactInformationImpl.setContactEmail(getContactEmail());
		contactInformationImpl.setContactCountry(getContactCountry());
		contactInformationImpl.setContactFirstName(getContactFirstName());
		contactInformationImpl.setContactLastName(getContactLastName());
		contactInformationImpl.setContactPhone(getContactPhone());
		contactInformationImpl.setContactAddress(getContactAddress());
		contactInformationImpl.setContactZIP(getContactZIP());
		contactInformationImpl.setContactCity(getContactCity());

		contactInformationImpl.resetOriginalValues();

		return contactInformationImpl;
	}

	@Override
	public int compareTo(ContactInformation contactInformation) {
		long primaryKey = contactInformation.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContactInformation)) {
			return false;
		}

		ContactInformation contactInformation = (ContactInformation)obj;

		long primaryKey = contactInformation.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		ContactInformationModelImpl contactInformationModelImpl = this;

		contactInformationModelImpl._originalUuid = contactInformationModelImpl._uuid;

		contactInformationModelImpl._originalCompanyId = contactInformationModelImpl._companyId;

		contactInformationModelImpl._setOriginalCompanyId = false;

		contactInformationModelImpl._originalGroupId = contactInformationModelImpl._groupId;

		contactInformationModelImpl._setOriginalGroupId = false;

		contactInformationModelImpl._originalUpdateuuid = contactInformationModelImpl._updateuuid;

		contactInformationModelImpl._originalContactID = contactInformationModelImpl._contactID;

		contactInformationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ContactInformation> toCacheModel() {
		ContactInformationCacheModel contactInformationCacheModel = new ContactInformationCacheModel();

		contactInformationCacheModel.uuid = getUuid();

		String uuid = contactInformationCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			contactInformationCacheModel.uuid = null;
		}

		contactInformationCacheModel.contactinformationId = getContactinformationId();

		contactInformationCacheModel.companyId = getCompanyId();

		contactInformationCacheModel.groupId = getGroupId();

		contactInformationCacheModel.userId = getUserId();

		contactInformationCacheModel.userName = getUserName();

		String userName = contactInformationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			contactInformationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			contactInformationCacheModel.createDate = createDate.getTime();
		}
		else {
			contactInformationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			contactInformationCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			contactInformationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		contactInformationCacheModel.updateuuid = getUpdateuuid();

		String updateuuid = contactInformationCacheModel.updateuuid;

		if ((updateuuid != null) && (updateuuid.length() == 0)) {
			contactInformationCacheModel.updateuuid = null;
		}

		contactInformationCacheModel.contactID = getContactID();

		String contactID = contactInformationCacheModel.contactID;

		if ((contactID != null) && (contactID.length() == 0)) {
			contactInformationCacheModel.contactID = null;
		}

		contactInformationCacheModel.contactEmail = getContactEmail();

		String contactEmail = contactInformationCacheModel.contactEmail;

		if ((contactEmail != null) && (contactEmail.length() == 0)) {
			contactInformationCacheModel.contactEmail = null;
		}

		contactInformationCacheModel.contactCountry = getContactCountry();

		String contactCountry = contactInformationCacheModel.contactCountry;

		if ((contactCountry != null) && (contactCountry.length() == 0)) {
			contactInformationCacheModel.contactCountry = null;
		}

		contactInformationCacheModel.contactFirstName = getContactFirstName();

		String contactFirstName = contactInformationCacheModel.contactFirstName;

		if ((contactFirstName != null) && (contactFirstName.length() == 0)) {
			contactInformationCacheModel.contactFirstName = null;
		}

		contactInformationCacheModel.contactLastName = getContactLastName();

		String contactLastName = contactInformationCacheModel.contactLastName;

		if ((contactLastName != null) && (contactLastName.length() == 0)) {
			contactInformationCacheModel.contactLastName = null;
		}

		contactInformationCacheModel.contactPhone = getContactPhone();

		String contactPhone = contactInformationCacheModel.contactPhone;

		if ((contactPhone != null) && (contactPhone.length() == 0)) {
			contactInformationCacheModel.contactPhone = null;
		}

		contactInformationCacheModel.contactAddress = getContactAddress();

		String contactAddress = contactInformationCacheModel.contactAddress;

		if ((contactAddress != null) && (contactAddress.length() == 0)) {
			contactInformationCacheModel.contactAddress = null;
		}

		contactInformationCacheModel.contactZIP = getContactZIP();

		String contactZIP = contactInformationCacheModel.contactZIP;

		if ((contactZIP != null) && (contactZIP.length() == 0)) {
			contactInformationCacheModel.contactZIP = null;
		}

		contactInformationCacheModel.contactCity = getContactCity();

		String contactCity = contactInformationCacheModel.contactCity;

		if ((contactCity != null) && (contactCity.length() == 0)) {
			contactInformationCacheModel.contactCity = null;
		}

		return contactInformationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", contactinformationId=");
		sb.append(getContactinformationId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", updateuuid=");
		sb.append(getUpdateuuid());
		sb.append(", contactID=");
		sb.append(getContactID());
		sb.append(", contactEmail=");
		sb.append(getContactEmail());
		sb.append(", contactCountry=");
		sb.append(getContactCountry());
		sb.append(", contactFirstName=");
		sb.append(getContactFirstName());
		sb.append(", contactLastName=");
		sb.append(getContactLastName());
		sb.append(", contactPhone=");
		sb.append(getContactPhone());
		sb.append(", contactAddress=");
		sb.append(getContactAddress());
		sb.append(", contactZIP=");
		sb.append(getContactZIP());
		sb.append(", contactCity=");
		sb.append(getContactCity());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append(
			"at.meduni.liferay.portlet.bbmrieric.model.ContactInformation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactinformationId</column-name><column-value><![CDATA[");
		sb.append(getContactinformationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateuuid</column-name><column-value><![CDATA[");
		sb.append(getUpdateuuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactID</column-name><column-value><![CDATA[");
		sb.append(getContactID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactEmail</column-name><column-value><![CDATA[");
		sb.append(getContactEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactCountry</column-name><column-value><![CDATA[");
		sb.append(getContactCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactFirstName</column-name><column-value><![CDATA[");
		sb.append(getContactFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactLastName</column-name><column-value><![CDATA[");
		sb.append(getContactLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactPhone</column-name><column-value><![CDATA[");
		sb.append(getContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactAddress</column-name><column-value><![CDATA[");
		sb.append(getContactAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactZIP</column-name><column-value><![CDATA[");
		sb.append(getContactZIP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactCity</column-name><column-value><![CDATA[");
		sb.append(getContactCity());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ContactInformation.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ContactInformation.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _contactinformationId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _updateuuid;
	private String _originalUpdateuuid;
	private String _contactID;
	private String _originalContactID;
	private String _contactEmail;
	private String _contactCountry;
	private String _contactFirstName;
	private String _contactLastName;
	private String _contactPhone;
	private String _contactAddress;
	private String _contactZIP;
	private String _contactCity;
	private long _columnBitmask;
	private ContactInformation _escapedModel;
}