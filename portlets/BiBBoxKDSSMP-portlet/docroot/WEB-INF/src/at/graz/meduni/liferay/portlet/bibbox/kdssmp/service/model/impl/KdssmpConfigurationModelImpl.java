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

import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpConfiguration;
import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpConfigurationModel;

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
 * The base model implementation for the KdssmpConfiguration service. Represents a row in the &quot;kdssmp.configuration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpConfigurationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KdssmpConfigurationImpl}.
 * </p>
 *
 * @author reihsr
 * @see KdssmpConfigurationImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpConfiguration
 * @see at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpConfigurationModel
 * @generated
 */
public class KdssmpConfigurationModelImpl extends BaseModelImpl<KdssmpConfiguration>
	implements KdssmpConfigurationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kdssmp configuration model instance should use the {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpConfiguration} interface instead.
	 */
	public static final String TABLE_NAME = "kdssmp.configuration";
	public static final Object[][] TABLE_COLUMNS = {
			{ "configurationId", Types.BIGINT },
			{ "scope", Types.VARCHAR },
			{ "optionkey", Types.VARCHAR },
			{ "optionvalue", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table kdssmp.configuration (configurationId LONG not null primary key,scope VARCHAR(75) null,optionkey VARCHAR(75) null,optionvalue VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table kdssmp.configuration";
	public static final String ORDER_BY_JPQL = " ORDER BY kdssmpConfiguration.optionkey ASC";
	public static final String ORDER_BY_SQL = " ORDER BY kdssmp.configuration.optionkey ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpConfiguration"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpConfiguration"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpConfiguration"),
			true);
	public static long OPTIONKEY_COLUMN_BITMASK = 1L;
	public static long SCOPE_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpConfiguration"));

	public KdssmpConfigurationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _configurationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setConfigurationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _configurationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return KdssmpConfiguration.class;
	}

	@Override
	public String getModelClassName() {
		return KdssmpConfiguration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("configurationId", getConfigurationId());
		attributes.put("scope", getScope());
		attributes.put("optionkey", getOptionkey());
		attributes.put("optionvalue", getOptionvalue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long configurationId = (Long)attributes.get("configurationId");

		if (configurationId != null) {
			setConfigurationId(configurationId);
		}

		String scope = (String)attributes.get("scope");

		if (scope != null) {
			setScope(scope);
		}

		String optionkey = (String)attributes.get("optionkey");

		if (optionkey != null) {
			setOptionkey(optionkey);
		}

		String optionvalue = (String)attributes.get("optionvalue");

		if (optionvalue != null) {
			setOptionvalue(optionvalue);
		}
	}

	@Override
	public long getConfigurationId() {
		return _configurationId;
	}

	@Override
	public void setConfigurationId(long configurationId) {
		_configurationId = configurationId;
	}

	@Override
	public String getScope() {
		if (_scope == null) {
			return StringPool.BLANK;
		}
		else {
			return _scope;
		}
	}

	@Override
	public void setScope(String scope) {
		_columnBitmask |= SCOPE_COLUMN_BITMASK;

		if (_originalScope == null) {
			_originalScope = _scope;
		}

		_scope = scope;
	}

	public String getOriginalScope() {
		return GetterUtil.getString(_originalScope);
	}

	@Override
	public String getOptionkey() {
		if (_optionkey == null) {
			return StringPool.BLANK;
		}
		else {
			return _optionkey;
		}
	}

	@Override
	public void setOptionkey(String optionkey) {
		_columnBitmask = -1L;

		if (_originalOptionkey == null) {
			_originalOptionkey = _optionkey;
		}

		_optionkey = optionkey;
	}

	public String getOriginalOptionkey() {
		return GetterUtil.getString(_originalOptionkey);
	}

	@Override
	public String getOptionvalue() {
		if (_optionvalue == null) {
			return StringPool.BLANK;
		}
		else {
			return _optionvalue;
		}
	}

	@Override
	public void setOptionvalue(String optionvalue) {
		_optionvalue = optionvalue;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			KdssmpConfiguration.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public KdssmpConfiguration toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (KdssmpConfiguration)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		KdssmpConfigurationImpl kdssmpConfigurationImpl = new KdssmpConfigurationImpl();

		kdssmpConfigurationImpl.setConfigurationId(getConfigurationId());
		kdssmpConfigurationImpl.setScope(getScope());
		kdssmpConfigurationImpl.setOptionkey(getOptionkey());
		kdssmpConfigurationImpl.setOptionvalue(getOptionvalue());

		kdssmpConfigurationImpl.resetOriginalValues();

		return kdssmpConfigurationImpl;
	}

	@Override
	public int compareTo(KdssmpConfiguration kdssmpConfiguration) {
		int value = 0;

		value = getOptionkey().compareTo(kdssmpConfiguration.getOptionkey());

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

		if (!(obj instanceof KdssmpConfiguration)) {
			return false;
		}

		KdssmpConfiguration kdssmpConfiguration = (KdssmpConfiguration)obj;

		long primaryKey = kdssmpConfiguration.getPrimaryKey();

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
		KdssmpConfigurationModelImpl kdssmpConfigurationModelImpl = this;

		kdssmpConfigurationModelImpl._originalScope = kdssmpConfigurationModelImpl._scope;

		kdssmpConfigurationModelImpl._originalOptionkey = kdssmpConfigurationModelImpl._optionkey;

		kdssmpConfigurationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<KdssmpConfiguration> toCacheModel() {
		KdssmpConfigurationCacheModel kdssmpConfigurationCacheModel = new KdssmpConfigurationCacheModel();

		kdssmpConfigurationCacheModel.configurationId = getConfigurationId();

		kdssmpConfigurationCacheModel.scope = getScope();

		String scope = kdssmpConfigurationCacheModel.scope;

		if ((scope != null) && (scope.length() == 0)) {
			kdssmpConfigurationCacheModel.scope = null;
		}

		kdssmpConfigurationCacheModel.optionkey = getOptionkey();

		String optionkey = kdssmpConfigurationCacheModel.optionkey;

		if ((optionkey != null) && (optionkey.length() == 0)) {
			kdssmpConfigurationCacheModel.optionkey = null;
		}

		kdssmpConfigurationCacheModel.optionvalue = getOptionvalue();

		String optionvalue = kdssmpConfigurationCacheModel.optionvalue;

		if ((optionvalue != null) && (optionvalue.length() == 0)) {
			kdssmpConfigurationCacheModel.optionvalue = null;
		}

		return kdssmpConfigurationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{configurationId=");
		sb.append(getConfigurationId());
		sb.append(", scope=");
		sb.append(getScope());
		sb.append(", optionkey=");
		sb.append(getOptionkey());
		sb.append(", optionvalue=");
		sb.append(getOptionvalue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append(
			"at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpConfiguration");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>configurationId</column-name><column-value><![CDATA[");
		sb.append(getConfigurationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scope</column-name><column-value><![CDATA[");
		sb.append(getScope());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>optionkey</column-name><column-value><![CDATA[");
		sb.append(getOptionkey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>optionvalue</column-name><column-value><![CDATA[");
		sb.append(getOptionvalue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = KdssmpConfiguration.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			KdssmpConfiguration.class
		};
	private long _configurationId;
	private String _scope;
	private String _originalScope;
	private String _optionkey;
	private String _originalOptionkey;
	private String _optionvalue;
	private long _columnBitmask;
	private KdssmpConfiguration _escapedModel;
}