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

import at.meduni.liferay.portlet.bbmrieric.model.SearchIndex;
import at.meduni.liferay.portlet.bbmrieric.model.SearchIndexModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
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

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the SearchIndex service. Represents a row in the &quot;bbmrieric.searchindex&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.meduni.liferay.portlet.bbmrieric.model.SearchIndexModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SearchIndexImpl}.
 * </p>
 *
 * @author reihsr
 * @see SearchIndexImpl
 * @see at.meduni.liferay.portlet.bbmrieric.model.SearchIndex
 * @see at.meduni.liferay.portlet.bbmrieric.model.SearchIndexModel
 * @generated
 */
public class SearchIndexModelImpl extends BaseModelImpl<SearchIndex>
	implements SearchIndexModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a search index model instance should use the {@link at.meduni.liferay.portlet.bbmrieric.model.SearchIndex} interface instead.
	 */
	public static final String TABLE_NAME = "bbmrieric.searchindex";
	public static final Object[][] TABLE_COLUMNS = {
			{ "searchid", Types.BIGINT },
			{ "organisationid", Types.BIGINT },
			{ "locationid", Types.BIGINT },
			{ "location", Types.VARCHAR },
			{ "searchindexkey", Types.VARCHAR },
			{ "searchindexvalue", Types.VARCHAR },
			{ "UUID", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table bbmrieric.searchindex (searchid LONG not null primary key,organisationid LONG,locationid LONG,location TEXT null,searchindexkey TEXT null,searchindexvalue TEXT null,UUID VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table bbmrieric.searchindex";
	public static final String ORDER_BY_JPQL = " ORDER BY searchIndex.searchid ASC";
	public static final String ORDER_BY_SQL = " ORDER BY bbmrieric.searchindex.searchid ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.meduni.liferay.portlet.bbmrieric.model.SearchIndex"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.meduni.liferay.portlet.bbmrieric.model.SearchIndex"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.meduni.liferay.portlet.bbmrieric.model.SearchIndex"),
			true);
	public static long UUID_COLUMN_BITMASK = 1L;
	public static long ORGANISATIONID_COLUMN_BITMASK = 2L;
	public static long SEARCHINDEXKEY_COLUMN_BITMASK = 4L;
	public static long SEARCHINDEXVALUE_COLUMN_BITMASK = 8L;
	public static long SEARCHID_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.meduni.liferay.portlet.bbmrieric.model.SearchIndex"));

	public SearchIndexModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _searchid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSearchid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _searchid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SearchIndex.class;
	}

	@Override
	public String getModelClassName() {
		return SearchIndex.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("searchid", getSearchid());
		attributes.put("organisationid", getOrganisationid());
		attributes.put("locationid", getLocationid());
		attributes.put("location", getLocation());
		attributes.put("searchindexkey", getSearchindexkey());
		attributes.put("searchindexvalue", getSearchindexvalue());
		attributes.put("UUID", getUUID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long searchid = (Long)attributes.get("searchid");

		if (searchid != null) {
			setSearchid(searchid);
		}

		Long organisationid = (Long)attributes.get("organisationid");

		if (organisationid != null) {
			setOrganisationid(organisationid);
		}

		Long locationid = (Long)attributes.get("locationid");

		if (locationid != null) {
			setLocationid(locationid);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String searchindexkey = (String)attributes.get("searchindexkey");

		if (searchindexkey != null) {
			setSearchindexkey(searchindexkey);
		}

		String searchindexvalue = (String)attributes.get("searchindexvalue");

		if (searchindexvalue != null) {
			setSearchindexvalue(searchindexvalue);
		}

		String UUID = (String)attributes.get("UUID");

		if (UUID != null) {
			setUUID(UUID);
		}
	}

	@Override
	public long getSearchid() {
		return _searchid;
	}

	@Override
	public void setSearchid(long searchid) {
		_searchid = searchid;
	}

	@Override
	public long getOrganisationid() {
		return _organisationid;
	}

	@Override
	public void setOrganisationid(long organisationid) {
		_columnBitmask |= ORGANISATIONID_COLUMN_BITMASK;

		if (!_setOriginalOrganisationid) {
			_setOriginalOrganisationid = true;

			_originalOrganisationid = _organisationid;
		}

		_organisationid = organisationid;
	}

	public long getOriginalOrganisationid() {
		return _originalOrganisationid;
	}

	@Override
	public long getLocationid() {
		return _locationid;
	}

	@Override
	public void setLocationid(long locationid) {
		_locationid = locationid;
	}

	@Override
	public String getLocation() {
		if (_location == null) {
			return StringPool.BLANK;
		}
		else {
			return _location;
		}
	}

	@Override
	public void setLocation(String location) {
		_location = location;
	}

	@Override
	public String getSearchindexkey() {
		if (_searchindexkey == null) {
			return StringPool.BLANK;
		}
		else {
			return _searchindexkey;
		}
	}

	@Override
	public void setSearchindexkey(String searchindexkey) {
		_columnBitmask |= SEARCHINDEXKEY_COLUMN_BITMASK;

		if (_originalSearchindexkey == null) {
			_originalSearchindexkey = _searchindexkey;
		}

		_searchindexkey = searchindexkey;
	}

	public String getOriginalSearchindexkey() {
		return GetterUtil.getString(_originalSearchindexkey);
	}

	@Override
	public String getSearchindexvalue() {
		if (_searchindexvalue == null) {
			return StringPool.BLANK;
		}
		else {
			return _searchindexvalue;
		}
	}

	@Override
	public void setSearchindexvalue(String searchindexvalue) {
		_columnBitmask |= SEARCHINDEXVALUE_COLUMN_BITMASK;

		if (_originalSearchindexvalue == null) {
			_originalSearchindexvalue = _searchindexvalue;
		}

		_searchindexvalue = searchindexvalue;
	}

	public String getOriginalSearchindexvalue() {
		return GetterUtil.getString(_originalSearchindexvalue);
	}

	@Override
	public String getUUID() {
		if (_UUID == null) {
			return StringPool.BLANK;
		}
		else {
			return _UUID;
		}
	}

	@Override
	public void setUUID(String UUID) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUUID == null) {
			_originalUUID = _UUID;
		}

		_UUID = UUID;
	}

	public String getOriginalUUID() {
		return GetterUtil.getString(_originalUUID);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			SearchIndex.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SearchIndex toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SearchIndex)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SearchIndexImpl searchIndexImpl = new SearchIndexImpl();

		searchIndexImpl.setSearchid(getSearchid());
		searchIndexImpl.setOrganisationid(getOrganisationid());
		searchIndexImpl.setLocationid(getLocationid());
		searchIndexImpl.setLocation(getLocation());
		searchIndexImpl.setSearchindexkey(getSearchindexkey());
		searchIndexImpl.setSearchindexvalue(getSearchindexvalue());
		searchIndexImpl.setUUID(getUUID());

		searchIndexImpl.resetOriginalValues();

		return searchIndexImpl;
	}

	@Override
	public int compareTo(SearchIndex searchIndex) {
		long primaryKey = searchIndex.getPrimaryKey();

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

		if (!(obj instanceof SearchIndex)) {
			return false;
		}

		SearchIndex searchIndex = (SearchIndex)obj;

		long primaryKey = searchIndex.getPrimaryKey();

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
		SearchIndexModelImpl searchIndexModelImpl = this;

		searchIndexModelImpl._originalOrganisationid = searchIndexModelImpl._organisationid;

		searchIndexModelImpl._setOriginalOrganisationid = false;

		searchIndexModelImpl._originalSearchindexkey = searchIndexModelImpl._searchindexkey;

		searchIndexModelImpl._originalSearchindexvalue = searchIndexModelImpl._searchindexvalue;

		searchIndexModelImpl._originalUUID = searchIndexModelImpl._UUID;

		searchIndexModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SearchIndex> toCacheModel() {
		SearchIndexCacheModel searchIndexCacheModel = new SearchIndexCacheModel();

		searchIndexCacheModel.searchid = getSearchid();

		searchIndexCacheModel.organisationid = getOrganisationid();

		searchIndexCacheModel.locationid = getLocationid();

		searchIndexCacheModel.location = getLocation();

		String location = searchIndexCacheModel.location;

		if ((location != null) && (location.length() == 0)) {
			searchIndexCacheModel.location = null;
		}

		searchIndexCacheModel.searchindexkey = getSearchindexkey();

		String searchindexkey = searchIndexCacheModel.searchindexkey;

		if ((searchindexkey != null) && (searchindexkey.length() == 0)) {
			searchIndexCacheModel.searchindexkey = null;
		}

		searchIndexCacheModel.searchindexvalue = getSearchindexvalue();

		String searchindexvalue = searchIndexCacheModel.searchindexvalue;

		if ((searchindexvalue != null) && (searchindexvalue.length() == 0)) {
			searchIndexCacheModel.searchindexvalue = null;
		}

		searchIndexCacheModel.UUID = getUUID();

		String UUID = searchIndexCacheModel.UUID;

		if ((UUID != null) && (UUID.length() == 0)) {
			searchIndexCacheModel.UUID = null;
		}

		return searchIndexCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{searchid=");
		sb.append(getSearchid());
		sb.append(", organisationid=");
		sb.append(getOrganisationid());
		sb.append(", locationid=");
		sb.append(getLocationid());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", searchindexkey=");
		sb.append(getSearchindexkey());
		sb.append(", searchindexvalue=");
		sb.append(getSearchindexvalue());
		sb.append(", UUID=");
		sb.append(getUUID());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("at.meduni.liferay.portlet.bbmrieric.model.SearchIndex");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>searchid</column-name><column-value><![CDATA[");
		sb.append(getSearchid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organisationid</column-name><column-value><![CDATA[");
		sb.append(getOrganisationid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locationid</column-name><column-value><![CDATA[");
		sb.append(getLocationid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>searchindexkey</column-name><column-value><![CDATA[");
		sb.append(getSearchindexkey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>searchindexvalue</column-name><column-value><![CDATA[");
		sb.append(getSearchindexvalue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UUID</column-name><column-value><![CDATA[");
		sb.append(getUUID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SearchIndex.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SearchIndex.class
		};
	private long _searchid;
	private long _organisationid;
	private long _originalOrganisationid;
	private boolean _setOriginalOrganisationid;
	private long _locationid;
	private String _location;
	private String _searchindexkey;
	private String _originalSearchindexkey;
	private String _searchindexvalue;
	private String _originalSearchindexvalue;
	private String _UUID;
	private String _originalUUID;
	private long _columnBitmask;
	private SearchIndex _escapedModel;
}