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

package at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.impl;

import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.Event;
import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Event service. Represents a row in the &quot;kdssmp.event&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EventImpl}.
 * </p>
 *
 * @author reihsr
 * @see EventImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.Event
 * @see at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventModel
 * @generated
 */
public class EventModelImpl extends BaseModelImpl<Event> implements EventModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a event model instance should use the {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.Event} interface instead.
	 */
	public static final String TABLE_NAME = "kdssmp.event";
	public static final Object[][] TABLE_COLUMNS = {
			{ "eventId", Types.BIGINT },
			{ "patientId", Types.BIGINT },
			{ "eventdate", Types.TIMESTAMP },
			{ "eventtype", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table kdssmp.event (eventId LONG not null primary key,patientId LONG,eventdate DATE null,eventtype VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table kdssmp.event";
	public static final String ORDER_BY_JPQL = " ORDER BY event.patientId ASC, event.eventdate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY kdssmp.event.patientId ASC, kdssmp.event.eventdate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.Event"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.Event"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.Event"),
			true);
	public static long PATIENTID_COLUMN_BITMASK = 1L;
	public static long EVENTDATE_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.Event"));

	public EventModelImpl() {
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
		return Event.class;
	}

	@Override
	public String getModelClassName() {
		return Event.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eventId", getEventId());
		attributes.put("patientId", getPatientId());
		attributes.put("eventdate", getEventdate());
		attributes.put("eventtype", getEventtype());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}

		Date eventdate = (Date)attributes.get("eventdate");

		if (eventdate != null) {
			setEventdate(eventdate);
		}

		String eventtype = (String)attributes.get("eventtype");

		if (eventtype != null) {
			setEventtype(eventtype);
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
	public long getPatientId() {
		return _patientId;
	}

	@Override
	public void setPatientId(long patientId) {
		_columnBitmask = -1L;

		if (!_setOriginalPatientId) {
			_setOriginalPatientId = true;

			_originalPatientId = _patientId;
		}

		_patientId = patientId;
	}

	public long getOriginalPatientId() {
		return _originalPatientId;
	}

	@Override
	public Date getEventdate() {
		return _eventdate;
	}

	@Override
	public void setEventdate(Date eventdate) {
		_columnBitmask = -1L;

		_eventdate = eventdate;
	}

	@Override
	public String getEventtype() {
		if (_eventtype == null) {
			return StringPool.BLANK;
		}
		else {
			return _eventtype;
		}
	}

	@Override
	public void setEventtype(String eventtype) {
		_eventtype = eventtype;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Event.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Event toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Event)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EventImpl eventImpl = new EventImpl();

		eventImpl.setEventId(getEventId());
		eventImpl.setPatientId(getPatientId());
		eventImpl.setEventdate(getEventdate());
		eventImpl.setEventtype(getEventtype());

		eventImpl.resetOriginalValues();

		return eventImpl;
	}

	@Override
	public int compareTo(Event event) {
		int value = 0;

		if (getPatientId() < event.getPatientId()) {
			value = -1;
		}
		else if (getPatientId() > event.getPatientId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = DateUtil.compareTo(getEventdate(), event.getEventdate());

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

		if (!(obj instanceof Event)) {
			return false;
		}

		Event event = (Event)obj;

		long primaryKey = event.getPrimaryKey();

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
		EventModelImpl eventModelImpl = this;

		eventModelImpl._originalPatientId = eventModelImpl._patientId;

		eventModelImpl._setOriginalPatientId = false;

		eventModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Event> toCacheModel() {
		EventCacheModel eventCacheModel = new EventCacheModel();

		eventCacheModel.eventId = getEventId();

		eventCacheModel.patientId = getPatientId();

		Date eventdate = getEventdate();

		if (eventdate != null) {
			eventCacheModel.eventdate = eventdate.getTime();
		}
		else {
			eventCacheModel.eventdate = Long.MIN_VALUE;
		}

		eventCacheModel.eventtype = getEventtype();

		String eventtype = eventCacheModel.eventtype;

		if ((eventtype != null) && (eventtype.length() == 0)) {
			eventCacheModel.eventtype = null;
		}

		return eventCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{eventId=");
		sb.append(getEventId());
		sb.append(", patientId=");
		sb.append(getPatientId());
		sb.append(", eventdate=");
		sb.append(getEventdate());
		sb.append(", eventtype=");
		sb.append(getEventtype());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append(
			"at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.Event");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>eventId</column-name><column-value><![CDATA[");
		sb.append(getEventId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>patientId</column-name><column-value><![CDATA[");
		sb.append(getPatientId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventdate</column-name><column-value><![CDATA[");
		sb.append(getEventdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventtype</column-name><column-value><![CDATA[");
		sb.append(getEventtype());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Event.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Event.class };
	private long _eventId;
	private long _patientId;
	private long _originalPatientId;
	private boolean _setOriginalPatientId;
	private Date _eventdate;
	private String _eventtype;
	private long _columnBitmask;
	private Event _escapedModel;
}