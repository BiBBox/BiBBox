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

import at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation;
import at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisationModel;
import at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisationSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the InvitationOrganisation service. Represents a row in the &quot;bibboxcs.invitation_organisation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InvitationOrganisationImpl}.
 * </p>
 *
 * @author reihsr
 * @see InvitationOrganisationImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation
 * @see at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisationModel
 * @generated
 */
@JSON(strict = true)
public class InvitationOrganisationModelImpl extends BaseModelImpl<InvitationOrganisation>
	implements InvitationOrganisationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a invitation organisation model instance should use the {@link at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation} interface instead.
	 */
	public static final String TABLE_NAME = "bibboxcs.invitation_organisation";
	public static final Object[][] TABLE_COLUMNS = {
			{ "invitationOrganisationId", Types.BIGINT },
			{ "invitationId", Types.BIGINT },
			{ "organisationId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "lastchanged", Types.TIMESTAMP },
			{ "lastchanger", Types.BIGINT },
			{ "reactdate", Types.TIMESTAMP },
			{ "lastusedlink", Types.TIMESTAMP },
			{ "rejectdate", Types.TIMESTAMP },
			{ "securitylinktoken", Types.BIGINT },
			{ "securitytoken", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table bibboxcs.invitation_organisation (invitationOrganisationId LONG not null primary key,invitationId LONG,organisationId LONG,userId LONG,lastchanged DATE null,lastchanger LONG,reactdate DATE null,lastusedlink DATE null,rejectdate DATE null,securitylinktoken LONG,securitytoken LONG)";
	public static final String TABLE_SQL_DROP = "drop table bibboxcs.invitation_organisation";
	public static final String ORDER_BY_JPQL = " ORDER BY invitationOrganisation.invitationOrganisationId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY bibboxcs.invitation_organisation.invitationOrganisationId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation"),
			true);
	public static long INVITATIONID_COLUMN_BITMASK = 1L;
	public static long ORGANISATIONID_COLUMN_BITMASK = 2L;
	public static long INVITATIONORGANISATIONID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static InvitationOrganisation toModel(
		InvitationOrganisationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		InvitationOrganisation model = new InvitationOrganisationImpl();

		model.setInvitationOrganisationId(soapModel.getInvitationOrganisationId());
		model.setInvitationId(soapModel.getInvitationId());
		model.setOrganisationId(soapModel.getOrganisationId());
		model.setUserId(soapModel.getUserId());
		model.setLastchanged(soapModel.getLastchanged());
		model.setLastchanger(soapModel.getLastchanger());
		model.setReactdate(soapModel.getReactdate());
		model.setLastusedlink(soapModel.getLastusedlink());
		model.setRejectdate(soapModel.getRejectdate());
		model.setSecuritylinktoken(soapModel.getSecuritylinktoken());
		model.setSecuritytoken(soapModel.getSecuritytoken());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<InvitationOrganisation> toModels(
		InvitationOrganisationSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<InvitationOrganisation> models = new ArrayList<InvitationOrganisation>(soapModels.length);

		for (InvitationOrganisationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation"));

	public InvitationOrganisationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _invitationOrganisationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInvitationOrganisationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _invitationOrganisationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return InvitationOrganisation.class;
	}

	@Override
	public String getModelClassName() {
		return InvitationOrganisation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("invitationOrganisationId", getInvitationOrganisationId());
		attributes.put("invitationId", getInvitationId());
		attributes.put("organisationId", getOrganisationId());
		attributes.put("userId", getUserId());
		attributes.put("lastchanged", getLastchanged());
		attributes.put("lastchanger", getLastchanger());
		attributes.put("reactdate", getReactdate());
		attributes.put("lastusedlink", getLastusedlink());
		attributes.put("rejectdate", getRejectdate());
		attributes.put("securitylinktoken", getSecuritylinktoken());
		attributes.put("securitytoken", getSecuritytoken());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long invitationOrganisationId = (Long)attributes.get(
				"invitationOrganisationId");

		if (invitationOrganisationId != null) {
			setInvitationOrganisationId(invitationOrganisationId);
		}

		Long invitationId = (Long)attributes.get("invitationId");

		if (invitationId != null) {
			setInvitationId(invitationId);
		}

		Long organisationId = (Long)attributes.get("organisationId");

		if (organisationId != null) {
			setOrganisationId(organisationId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date lastchanged = (Date)attributes.get("lastchanged");

		if (lastchanged != null) {
			setLastchanged(lastchanged);
		}

		Long lastchanger = (Long)attributes.get("lastchanger");

		if (lastchanger != null) {
			setLastchanger(lastchanger);
		}

		Date reactdate = (Date)attributes.get("reactdate");

		if (reactdate != null) {
			setReactdate(reactdate);
		}

		Date lastusedlink = (Date)attributes.get("lastusedlink");

		if (lastusedlink != null) {
			setLastusedlink(lastusedlink);
		}

		Date rejectdate = (Date)attributes.get("rejectdate");

		if (rejectdate != null) {
			setRejectdate(rejectdate);
		}

		Long securitylinktoken = (Long)attributes.get("securitylinktoken");

		if (securitylinktoken != null) {
			setSecuritylinktoken(securitylinktoken);
		}

		Long securitytoken = (Long)attributes.get("securitytoken");

		if (securitytoken != null) {
			setSecuritytoken(securitytoken);
		}
	}

	@JSON
	@Override
	public long getInvitationOrganisationId() {
		return _invitationOrganisationId;
	}

	@Override
	public void setInvitationOrganisationId(long invitationOrganisationId) {
		_invitationOrganisationId = invitationOrganisationId;
	}

	@JSON
	@Override
	public long getInvitationId() {
		return _invitationId;
	}

	@Override
	public void setInvitationId(long invitationId) {
		_columnBitmask |= INVITATIONID_COLUMN_BITMASK;

		if (!_setOriginalInvitationId) {
			_setOriginalInvitationId = true;

			_originalInvitationId = _invitationId;
		}

		_invitationId = invitationId;
	}

	public long getOriginalInvitationId() {
		return _originalInvitationId;
	}

	@JSON
	@Override
	public long getOrganisationId() {
		return _organisationId;
	}

	@Override
	public void setOrganisationId(long organisationId) {
		_columnBitmask |= ORGANISATIONID_COLUMN_BITMASK;

		if (!_setOriginalOrganisationId) {
			_setOriginalOrganisationId = true;

			_originalOrganisationId = _organisationId;
		}

		_organisationId = organisationId;
	}

	public long getOriginalOrganisationId() {
		return _originalOrganisationId;
	}

	@JSON
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

	@JSON
	@Override
	public Date getLastchanged() {
		return _lastchanged;
	}

	@Override
	public void setLastchanged(Date lastchanged) {
		_lastchanged = lastchanged;
	}

	@JSON
	@Override
	public long getLastchanger() {
		return _lastchanger;
	}

	@Override
	public void setLastchanger(long lastchanger) {
		_lastchanger = lastchanger;
	}

	@JSON
	@Override
	public Date getReactdate() {
		return _reactdate;
	}

	@Override
	public void setReactdate(Date reactdate) {
		_reactdate = reactdate;
	}

	@JSON
	@Override
	public Date getLastusedlink() {
		return _lastusedlink;
	}

	@Override
	public void setLastusedlink(Date lastusedlink) {
		_lastusedlink = lastusedlink;
	}

	@JSON
	@Override
	public Date getRejectdate() {
		return _rejectdate;
	}

	@Override
	public void setRejectdate(Date rejectdate) {
		_rejectdate = rejectdate;
	}

	@JSON
	@Override
	public long getSecuritylinktoken() {
		return _securitylinktoken;
	}

	@Override
	public void setSecuritylinktoken(long securitylinktoken) {
		_securitylinktoken = securitylinktoken;
	}

	@JSON
	@Override
	public long getSecuritytoken() {
		return _securitytoken;
	}

	@Override
	public void setSecuritytoken(long securitytoken) {
		_securitytoken = securitytoken;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			InvitationOrganisation.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public InvitationOrganisation toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (InvitationOrganisation)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		InvitationOrganisationImpl invitationOrganisationImpl = new InvitationOrganisationImpl();

		invitationOrganisationImpl.setInvitationOrganisationId(getInvitationOrganisationId());
		invitationOrganisationImpl.setInvitationId(getInvitationId());
		invitationOrganisationImpl.setOrganisationId(getOrganisationId());
		invitationOrganisationImpl.setUserId(getUserId());
		invitationOrganisationImpl.setLastchanged(getLastchanged());
		invitationOrganisationImpl.setLastchanger(getLastchanger());
		invitationOrganisationImpl.setReactdate(getReactdate());
		invitationOrganisationImpl.setLastusedlink(getLastusedlink());
		invitationOrganisationImpl.setRejectdate(getRejectdate());
		invitationOrganisationImpl.setSecuritylinktoken(getSecuritylinktoken());
		invitationOrganisationImpl.setSecuritytoken(getSecuritytoken());

		invitationOrganisationImpl.resetOriginalValues();

		return invitationOrganisationImpl;
	}

	@Override
	public int compareTo(InvitationOrganisation invitationOrganisation) {
		long primaryKey = invitationOrganisation.getPrimaryKey();

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

		if (!(obj instanceof InvitationOrganisation)) {
			return false;
		}

		InvitationOrganisation invitationOrganisation = (InvitationOrganisation)obj;

		long primaryKey = invitationOrganisation.getPrimaryKey();

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
		InvitationOrganisationModelImpl invitationOrganisationModelImpl = this;

		invitationOrganisationModelImpl._originalInvitationId = invitationOrganisationModelImpl._invitationId;

		invitationOrganisationModelImpl._setOriginalInvitationId = false;

		invitationOrganisationModelImpl._originalOrganisationId = invitationOrganisationModelImpl._organisationId;

		invitationOrganisationModelImpl._setOriginalOrganisationId = false;

		invitationOrganisationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<InvitationOrganisation> toCacheModel() {
		InvitationOrganisationCacheModel invitationOrganisationCacheModel = new InvitationOrganisationCacheModel();

		invitationOrganisationCacheModel.invitationOrganisationId = getInvitationOrganisationId();

		invitationOrganisationCacheModel.invitationId = getInvitationId();

		invitationOrganisationCacheModel.organisationId = getOrganisationId();

		invitationOrganisationCacheModel.userId = getUserId();

		Date lastchanged = getLastchanged();

		if (lastchanged != null) {
			invitationOrganisationCacheModel.lastchanged = lastchanged.getTime();
		}
		else {
			invitationOrganisationCacheModel.lastchanged = Long.MIN_VALUE;
		}

		invitationOrganisationCacheModel.lastchanger = getLastchanger();

		Date reactdate = getReactdate();

		if (reactdate != null) {
			invitationOrganisationCacheModel.reactdate = reactdate.getTime();
		}
		else {
			invitationOrganisationCacheModel.reactdate = Long.MIN_VALUE;
		}

		Date lastusedlink = getLastusedlink();

		if (lastusedlink != null) {
			invitationOrganisationCacheModel.lastusedlink = lastusedlink.getTime();
		}
		else {
			invitationOrganisationCacheModel.lastusedlink = Long.MIN_VALUE;
		}

		Date rejectdate = getRejectdate();

		if (rejectdate != null) {
			invitationOrganisationCacheModel.rejectdate = rejectdate.getTime();
		}
		else {
			invitationOrganisationCacheModel.rejectdate = Long.MIN_VALUE;
		}

		invitationOrganisationCacheModel.securitylinktoken = getSecuritylinktoken();

		invitationOrganisationCacheModel.securitytoken = getSecuritytoken();

		return invitationOrganisationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{invitationOrganisationId=");
		sb.append(getInvitationOrganisationId());
		sb.append(", invitationId=");
		sb.append(getInvitationId());
		sb.append(", organisationId=");
		sb.append(getOrganisationId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", lastchanged=");
		sb.append(getLastchanged());
		sb.append(", lastchanger=");
		sb.append(getLastchanger());
		sb.append(", reactdate=");
		sb.append(getReactdate());
		sb.append(", lastusedlink=");
		sb.append(getLastusedlink());
		sb.append(", rejectdate=");
		sb.append(getRejectdate());
		sb.append(", securitylinktoken=");
		sb.append(getSecuritylinktoken());
		sb.append(", securitytoken=");
		sb.append(getSecuritytoken());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append(
			"at.graz.meduni.liferay.portlet.bibbox.service.model.InvitationOrganisation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>invitationOrganisationId</column-name><column-value><![CDATA[");
		sb.append(getInvitationOrganisationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>invitationId</column-name><column-value><![CDATA[");
		sb.append(getInvitationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organisationId</column-name><column-value><![CDATA[");
		sb.append(getOrganisationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastchanged</column-name><column-value><![CDATA[");
		sb.append(getLastchanged());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastchanger</column-name><column-value><![CDATA[");
		sb.append(getLastchanger());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reactdate</column-name><column-value><![CDATA[");
		sb.append(getReactdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastusedlink</column-name><column-value><![CDATA[");
		sb.append(getLastusedlink());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rejectdate</column-name><column-value><![CDATA[");
		sb.append(getRejectdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>securitylinktoken</column-name><column-value><![CDATA[");
		sb.append(getSecuritylinktoken());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>securitytoken</column-name><column-value><![CDATA[");
		sb.append(getSecuritytoken());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = InvitationOrganisation.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			InvitationOrganisation.class
		};
	private long _invitationOrganisationId;
	private long _invitationId;
	private long _originalInvitationId;
	private boolean _setOriginalInvitationId;
	private long _organisationId;
	private long _originalOrganisationId;
	private boolean _setOriginalOrganisationId;
	private long _userId;
	private String _userUuid;
	private Date _lastchanged;
	private long _lastchanger;
	private Date _reactdate;
	private Date _lastusedlink;
	private Date _rejectdate;
	private long _securitylinktoken;
	private long _securitytoken;
	private long _columnBitmask;
	private InvitationOrganisation _escapedModel;
}