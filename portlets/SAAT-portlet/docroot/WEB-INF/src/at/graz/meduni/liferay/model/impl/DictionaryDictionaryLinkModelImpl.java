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

package at.graz.meduni.liferay.model.impl;

import at.graz.meduni.liferay.model.DictionaryDictionaryLink;
import at.graz.meduni.liferay.model.DictionaryDictionaryLinkModel;
import at.graz.meduni.liferay.model.DictionaryDictionaryLinkSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DictionaryDictionaryLink service. Represents a row in the &quot;dictionary2_dictionary2_addiction_link&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.graz.meduni.liferay.model.DictionaryDictionaryLinkModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DictionaryDictionaryLinkImpl}.
 * </p>
 *
 * @author reihsr
 * @see DictionaryDictionaryLinkImpl
 * @see at.graz.meduni.liferay.model.DictionaryDictionaryLink
 * @see at.graz.meduni.liferay.model.DictionaryDictionaryLinkModel
 * @generated
 */
@JSON(strict = true)
public class DictionaryDictionaryLinkModelImpl extends BaseModelImpl<DictionaryDictionaryLink>
	implements DictionaryDictionaryLinkModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dictionary dictionary link model instance should use the {@link at.graz.meduni.liferay.model.DictionaryDictionaryLink} interface instead.
	 */
	public static final String TABLE_NAME = "dictionary2_dictionary2_addiction_link";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "dictionary_id", Types.BIGINT },
			{ "addiction_id", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table dictionary2_dictionary2_addiction_link (id_ LONG not null primary key,dictionary_id LONG,addiction_id LONG)";
	public static final String TABLE_SQL_DROP = "drop table dictionary2_dictionary2_addiction_link";
	public static final String ORDER_BY_JPQL = " ORDER BY dictionaryDictionaryLink.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY dictionary2_dictionary2_addiction_link.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.graz.meduni.liferay.model.DictionaryDictionaryLink"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.graz.meduni.liferay.model.DictionaryDictionaryLink"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.graz.meduni.liferay.model.DictionaryDictionaryLink"),
			true);
	public static long DICTIONARY_ID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DictionaryDictionaryLink toModel(
		DictionaryDictionaryLinkSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DictionaryDictionaryLink model = new DictionaryDictionaryLinkImpl();

		model.setId(soapModel.getId());
		model.setDictionary_id(soapModel.getDictionary_id());
		model.setAddiction_id(soapModel.getAddiction_id());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DictionaryDictionaryLink> toModels(
		DictionaryDictionaryLinkSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DictionaryDictionaryLink> models = new ArrayList<DictionaryDictionaryLink>(soapModels.length);

		for (DictionaryDictionaryLinkSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.graz.meduni.liferay.model.DictionaryDictionaryLink"));

	public DictionaryDictionaryLinkModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DictionaryDictionaryLink.class;
	}

	@Override
	public String getModelClassName() {
		return DictionaryDictionaryLink.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dictionary_id", getDictionary_id());
		attributes.put("addiction_id", getAddiction_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dictionary_id = (Long)attributes.get("dictionary_id");

		if (dictionary_id != null) {
			setDictionary_id(dictionary_id);
		}

		Long addiction_id = (Long)attributes.get("addiction_id");

		if (addiction_id != null) {
			setAddiction_id(addiction_id);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public long getDictionary_id() {
		return _dictionary_id;
	}

	@Override
	public void setDictionary_id(long dictionary_id) {
		_columnBitmask |= DICTIONARY_ID_COLUMN_BITMASK;

		if (!_setOriginalDictionary_id) {
			_setOriginalDictionary_id = true;

			_originalDictionary_id = _dictionary_id;
		}

		_dictionary_id = dictionary_id;
	}

	public long getOriginalDictionary_id() {
		return _originalDictionary_id;
	}

	@JSON
	@Override
	public long getAddiction_id() {
		return _addiction_id;
	}

	@Override
	public void setAddiction_id(long addiction_id) {
		_addiction_id = addiction_id;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DictionaryDictionaryLink.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DictionaryDictionaryLink toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DictionaryDictionaryLink)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DictionaryDictionaryLinkImpl dictionaryDictionaryLinkImpl = new DictionaryDictionaryLinkImpl();

		dictionaryDictionaryLinkImpl.setId(getId());
		dictionaryDictionaryLinkImpl.setDictionary_id(getDictionary_id());
		dictionaryDictionaryLinkImpl.setAddiction_id(getAddiction_id());

		dictionaryDictionaryLinkImpl.resetOriginalValues();

		return dictionaryDictionaryLinkImpl;
	}

	@Override
	public int compareTo(DictionaryDictionaryLink dictionaryDictionaryLink) {
		int value = 0;

		if (getId() < dictionaryDictionaryLink.getId()) {
			value = -1;
		}
		else if (getId() > dictionaryDictionaryLink.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof DictionaryDictionaryLink)) {
			return false;
		}

		DictionaryDictionaryLink dictionaryDictionaryLink = (DictionaryDictionaryLink)obj;

		long primaryKey = dictionaryDictionaryLink.getPrimaryKey();

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
		DictionaryDictionaryLinkModelImpl dictionaryDictionaryLinkModelImpl = this;

		dictionaryDictionaryLinkModelImpl._originalDictionary_id = dictionaryDictionaryLinkModelImpl._dictionary_id;

		dictionaryDictionaryLinkModelImpl._setOriginalDictionary_id = false;

		dictionaryDictionaryLinkModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DictionaryDictionaryLink> toCacheModel() {
		DictionaryDictionaryLinkCacheModel dictionaryDictionaryLinkCacheModel = new DictionaryDictionaryLinkCacheModel();

		dictionaryDictionaryLinkCacheModel.id = getId();

		dictionaryDictionaryLinkCacheModel.dictionary_id = getDictionary_id();

		dictionaryDictionaryLinkCacheModel.addiction_id = getAddiction_id();

		return dictionaryDictionaryLinkCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", dictionary_id=");
		sb.append(getDictionary_id());
		sb.append(", addiction_id=");
		sb.append(getAddiction_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("at.graz.meduni.liferay.model.DictionaryDictionaryLink");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dictionary_id</column-name><column-value><![CDATA[");
		sb.append(getDictionary_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addiction_id</column-name><column-value><![CDATA[");
		sb.append(getAddiction_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DictionaryDictionaryLink.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DictionaryDictionaryLink.class
		};
	private long _id;
	private long _dictionary_id;
	private long _originalDictionary_id;
	private boolean _setOriginalDictionary_id;
	private long _addiction_id;
	private long _columnBitmask;
	private DictionaryDictionaryLink _escapedModel;
}