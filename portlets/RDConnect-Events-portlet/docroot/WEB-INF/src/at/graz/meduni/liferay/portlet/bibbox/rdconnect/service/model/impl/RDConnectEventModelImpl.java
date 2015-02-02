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

package at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.impl;

import at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.RDConnectEvent;
import at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.RDConnectEventModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
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
 * The base model implementation for the RDConnectEvent service. Represents a row in the &quot;rdconnect.event&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.RDConnectEventModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RDConnectEventImpl}.
 * </p>
 *
 * @author reihsr
 * @see RDConnectEventImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.RDConnectEvent
 * @see at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.RDConnectEventModel
 * @generated
 */
public class RDConnectEventModelImpl extends BaseModelImpl<RDConnectEvent>
	implements RDConnectEventModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a r d connect event model instance should use the {@link at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.RDConnectEvent} interface instead.
	 */
	public static final String TABLE_NAME = "rdconnect.event";
	public static final Object[][] TABLE_COLUMNS = {
			{ "eventId", Types.BIGINT },
			{ "eventdate", Types.TIMESTAMP },
			{ "organizationId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "shorttext", Types.VARCHAR },
			{ "longtext_", Types.VARCHAR },
			{ "link", Types.VARCHAR },
			{ "restricted", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table rdconnect.event (eventId LONG not null primary key,eventdate DATE null,organizationId LONG,userId LONG,shorttext VARCHAR(75) null,longtext_ VARCHAR(75) null,link VARCHAR(75) null,restricted VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table rdconnect.event";
	public static final String ORDER_BY_JPQL = " ORDER BY rdConnectEvent.eventdate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY rdconnect.event.eventdate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.RDConnectEvent"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.RDConnectEvent"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.RDConnectEvent"),
			true);
	public static long EVENTDATE_COLUMN_BITMASK = 1L;
	public static long RESTRICTED_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.RDConnectEvent"));

	public RDConnectEventModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _eventId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEventId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _eventId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return RDConnectEvent.class;
	}

	@Override
	public String getModelClassName() {
		return RDConnectEvent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eventId", getEventId());
		attributes.put("eventdate", getEventdate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("userId", getUserId());
		attributes.put("shorttext", getShorttext());
		attributes.put("longtext", getLongtext());
		attributes.put("link", getLink());
		attributes.put("restricted", getRestricted());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		Date eventdate = (Date)attributes.get("eventdate");

		if (eventdate != null) {
			setEventdate(eventdate);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String shorttext = (String)attributes.get("shorttext");

		if (shorttext != null) {
			setShorttext(shorttext);
		}

		String longtext = (String)attributes.get("longtext");

		if (longtext != null) {
			setLongtext(longtext);
		}

		String link = (String)attributes.get("link");

		if (link != null) {
			setLink(link);
		}

		String restricted = (String)attributes.get("restricted");

		if (restricted != null) {
			setRestricted(restricted);
		}
	}

	@Override
	public long getEventId() {
		return _eventId;
	}

	@Override
	public void setEventId(long eventId) {
		_eventId = eventId;
	}

	@Override
	public Date getEventdate() {
		return _eventdate;
	}

	@Override
	public void setEventdate(Date eventdate) {
		_columnBitmask = -1L;

		if (_originalEventdate == null) {
			_originalEventdate = _eventdate;
		}

		_eventdate = eventdate;
	}

	public Date getOriginalEventdate() {
		return _originalEventdate;
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
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
	public String getShorttext() {
		if (_shorttext == null) {
			return StringPool.BLANK;
		}
		else {
			return _shorttext;
		}
	}

	@Override
	public void setShorttext(String shorttext) {
		_shorttext = shorttext;
	}

	@Override
	public String getLongtext() {
		if (_longtext == null) {
			return StringPool.BLANK;
		}
		else {
			return _longtext;
		}
	}

	@Override
	public void setLongtext(String longtext) {
		_longtext = longtext;
	}

	@Override
	public String getLink() {
		if (_link == null) {
			return StringPool.BLANK;
		}
		else {
			return _link;
		}
	}

	@Override
	public void setLink(String link) {
		_link = link;
	}

	@Override
	public String getRestricted() {
		if (_restricted == null) {
			return StringPool.BLANK;
		}
		else {
			return _restricted;
		}
	}

	@Override
	public void setRestricted(String restricted) {
		_columnBitmask |= RESTRICTED_COLUMN_BITMASK;

		if (_originalRestricted == null) {
			_originalRestricted = _restricted;
		}

		_restricted = restricted;
	}

	public String getOriginalRestricted() {
		return GetterUtil.getString(_originalRestricted);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			RDConnectEvent.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public RDConnectEvent toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (RDConnectEvent)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RDConnectEventImpl rdConnectEventImpl = new RDConnectEventImpl();

		rdConnectEventImpl.setEventId(getEventId());
		rdConnectEventImpl.setEventdate(getEventdate());
		rdConnectEventImpl.setOrganizationId(getOrganizationId());
		rdConnectEventImpl.setUserId(getUserId());
		rdConnectEventImpl.setShorttext(getShorttext());
		rdConnectEventImpl.setLongtext(getLongtext());
		rdConnectEventImpl.setLink(getLink());
		rdConnectEventImpl.setRestricted(getRestricted());

		rdConnectEventImpl.resetOriginalValues();

		return rdConnectEventImpl;
	}

	@Override
	public int compareTo(RDConnectEvent rdConnectEvent) {
		int value = 0;

		value = DateUtil.compareTo(getEventdate(), rdConnectEvent.getEventdate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RDConnectEvent)) {
			return false;
		}

		RDConnectEvent rdConnectEvent = (RDConnectEvent)obj;

		long primaryKey = rdConnectEvent.getPrimaryKey();

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
		RDConnectEventModelImpl rdConnectEventModelImpl = this;

		rdConnectEventModelImpl._originalEventdate = rdConnectEventModelImpl._eventdate;

		rdConnectEventModelImpl._originalRestricted = rdConnectEventModelImpl._restricted;

		rdConnectEventModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<RDConnectEvent> toCacheModel() {
		RDConnectEventCacheModel rdConnectEventCacheModel = new RDConnectEventCacheModel();

		rdConnectEventCacheModel.eventId = getEventId();

		Date eventdate = getEventdate();

		if (eventdate != null) {
			rdConnectEventCacheModel.eventdate = eventdate.getTime();
		}
		else {
			rdConnectEventCacheModel.eventdate = Long.MIN_VALUE;
		}

		rdConnectEventCacheModel.organizationId = getOrganizationId();

		rdConnectEventCacheModel.userId = getUserId();

		rdConnectEventCacheModel.shorttext = getShorttext();

		String shorttext = rdConnectEventCacheModel.shorttext;

		if ((shorttext != null) && (shorttext.length() == 0)) {
			rdConnectEventCacheModel.shorttext = null;
		}

		rdConnectEventCacheModel.longtext = getLongtext();

		String longtext = rdConnectEventCacheModel.longtext;

		if ((longtext != null) && (longtext.length() == 0)) {
			rdConnectEventCacheModel.longtext = null;
		}

		rdConnectEventCacheModel.link = getLink();

		String link = rdConnectEventCacheModel.link;

		if ((link != null) && (link.length() == 0)) {
			rdConnectEventCacheModel.link = null;
		}

		rdConnectEventCacheModel.restricted = getRestricted();

		String restricted = rdConnectEventCacheModel.restricted;

		if ((restricted != null) && (restricted.length() == 0)) {
			rdConnectEventCacheModel.restricted = null;
		}

		return rdConnectEventCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{eventId=");
		sb.append(getEventId());
		sb.append(", eventdate=");
		sb.append(getEventdate());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", shorttext=");
		sb.append(getShorttext());
		sb.append(", longtext=");
		sb.append(getLongtext());
		sb.append(", link=");
		sb.append(getLink());
		sb.append(", restricted=");
		sb.append(getRestricted());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append(
			"at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.RDConnectEvent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>eventId</column-name><column-value><![CDATA[");
		sb.append(getEventId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventdate</column-name><column-value><![CDATA[");
		sb.append(getEventdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shorttext</column-name><column-value><![CDATA[");
		sb.append(getShorttext());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>longtext</column-name><column-value><![CDATA[");
		sb.append(getLongtext());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>link</column-name><column-value><![CDATA[");
		sb.append(getLink());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>restricted</column-name><column-value><![CDATA[");
		sb.append(getRestricted());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = RDConnectEvent.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			RDConnectEvent.class
		};
	private long _eventId;
	private Date _eventdate;
	private Date _originalEventdate;
	private long _organizationId;
	private long _userId;
	private String _userUuid;
	private String _shorttext;
	private String _longtext;
	private String _link;
	private String _restricted;
	private String _originalRestricted;
	private long _columnBitmask;
	private RDConnectEvent _escapedModel;
}