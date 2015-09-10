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

import at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription;
import at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscriptionModel;

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
 * The base model implementation for the DiseaseDiscription service. Represents a row in the &quot;bbmrieric.diseasediscription&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscriptionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DiseaseDiscriptionImpl}.
 * </p>
 *
 * @author reihsr
 * @see DiseaseDiscriptionImpl
 * @see at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription
 * @see at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscriptionModel
 * @generated
 */
public class DiseaseDiscriptionModelImpl extends BaseModelImpl<DiseaseDiscription>
	implements DiseaseDiscriptionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a disease discription model instance should use the {@link at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription} interface instead.
	 */
	public static final String TABLE_NAME = "bbmrieric.diseasediscription";
	public static final Object[][] TABLE_COLUMNS = {
			{ "diseasediscriptionId", Types.BIGINT },
			{ "diseasecode", Types.VARCHAR },
			{ "diseasegroup", Types.VARCHAR },
			{ "diseasediscription", Types.VARCHAR },
			{ "root", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table bbmrieric.diseasediscription (diseasediscriptionId LONG not null primary key,diseasecode VARCHAR(75) null,diseasegroup VARCHAR(75) null,diseasediscription TEXT null,root BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table bbmrieric.diseasediscription";
	public static final String ORDER_BY_JPQL = " ORDER BY diseaseDiscription.diseasegroup ASC";
	public static final String ORDER_BY_SQL = " ORDER BY bbmrieric.diseasediscription.diseasegroup ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription"),
			true);
	public static long DISEASECODE_COLUMN_BITMASK = 1L;
	public static long DISEASEGROUP_COLUMN_BITMASK = 2L;
	public static long ROOT_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription"));

	public DiseaseDiscriptionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _diseasediscriptionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDiseasediscriptionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _diseasediscriptionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DiseaseDiscription.class;
	}

	@Override
	public String getModelClassName() {
		return DiseaseDiscription.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("diseasediscriptionId", getDiseasediscriptionId());
		attributes.put("diseasecode", getDiseasecode());
		attributes.put("diseasegroup", getDiseasegroup());
		attributes.put("diseasediscription", getDiseasediscription());
		attributes.put("root", getRoot());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long diseasediscriptionId = (Long)attributes.get("diseasediscriptionId");

		if (diseasediscriptionId != null) {
			setDiseasediscriptionId(diseasediscriptionId);
		}

		String diseasecode = (String)attributes.get("diseasecode");

		if (diseasecode != null) {
			setDiseasecode(diseasecode);
		}

		String diseasegroup = (String)attributes.get("diseasegroup");

		if (diseasegroup != null) {
			setDiseasegroup(diseasegroup);
		}

		String diseasediscription = (String)attributes.get("diseasediscription");

		if (diseasediscription != null) {
			setDiseasediscription(diseasediscription);
		}

		Boolean root = (Boolean)attributes.get("root");

		if (root != null) {
			setRoot(root);
		}
	}

	@Override
	public long getDiseasediscriptionId() {
		return _diseasediscriptionId;
	}

	@Override
	public void setDiseasediscriptionId(long diseasediscriptionId) {
		_diseasediscriptionId = diseasediscriptionId;
	}

	@Override
	public String getDiseasecode() {
		if (_diseasecode == null) {
			return StringPool.BLANK;
		}
		else {
			return _diseasecode;
		}
	}

	@Override
	public void setDiseasecode(String diseasecode) {
		_columnBitmask |= DISEASECODE_COLUMN_BITMASK;

		if (_originalDiseasecode == null) {
			_originalDiseasecode = _diseasecode;
		}

		_diseasecode = diseasecode;
	}

	public String getOriginalDiseasecode() {
		return GetterUtil.getString(_originalDiseasecode);
	}

	@Override
	public String getDiseasegroup() {
		if (_diseasegroup == null) {
			return StringPool.BLANK;
		}
		else {
			return _diseasegroup;
		}
	}

	@Override
	public void setDiseasegroup(String diseasegroup) {
		_columnBitmask = -1L;

		if (_originalDiseasegroup == null) {
			_originalDiseasegroup = _diseasegroup;
		}

		_diseasegroup = diseasegroup;
	}

	public String getOriginalDiseasegroup() {
		return GetterUtil.getString(_originalDiseasegroup);
	}

	@Override
	public String getDiseasediscription() {
		if (_diseasediscription == null) {
			return StringPool.BLANK;
		}
		else {
			return _diseasediscription;
		}
	}

	@Override
	public void setDiseasediscription(String diseasediscription) {
		_diseasediscription = diseasediscription;
	}

	@Override
	public boolean getRoot() {
		return _root;
	}

	@Override
	public boolean isRoot() {
		return _root;
	}

	@Override
	public void setRoot(boolean root) {
		_columnBitmask |= ROOT_COLUMN_BITMASK;

		if (!_setOriginalRoot) {
			_setOriginalRoot = true;

			_originalRoot = _root;
		}

		_root = root;
	}

	public boolean getOriginalRoot() {
		return _originalRoot;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DiseaseDiscription.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DiseaseDiscription toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DiseaseDiscription)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DiseaseDiscriptionImpl diseaseDiscriptionImpl = new DiseaseDiscriptionImpl();

		diseaseDiscriptionImpl.setDiseasediscriptionId(getDiseasediscriptionId());
		diseaseDiscriptionImpl.setDiseasecode(getDiseasecode());
		diseaseDiscriptionImpl.setDiseasegroup(getDiseasegroup());
		diseaseDiscriptionImpl.setDiseasediscription(getDiseasediscription());
		diseaseDiscriptionImpl.setRoot(getRoot());

		diseaseDiscriptionImpl.resetOriginalValues();

		return diseaseDiscriptionImpl;
	}

	@Override
	public int compareTo(DiseaseDiscription diseaseDiscription) {
		int value = 0;

		value = getDiseasegroup().compareTo(diseaseDiscription.getDiseasegroup());

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

		if (!(obj instanceof DiseaseDiscription)) {
			return false;
		}

		DiseaseDiscription diseaseDiscription = (DiseaseDiscription)obj;

		long primaryKey = diseaseDiscription.getPrimaryKey();

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
		DiseaseDiscriptionModelImpl diseaseDiscriptionModelImpl = this;

		diseaseDiscriptionModelImpl._originalDiseasecode = diseaseDiscriptionModelImpl._diseasecode;

		diseaseDiscriptionModelImpl._originalDiseasegroup = diseaseDiscriptionModelImpl._diseasegroup;

		diseaseDiscriptionModelImpl._originalRoot = diseaseDiscriptionModelImpl._root;

		diseaseDiscriptionModelImpl._setOriginalRoot = false;

		diseaseDiscriptionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DiseaseDiscription> toCacheModel() {
		DiseaseDiscriptionCacheModel diseaseDiscriptionCacheModel = new DiseaseDiscriptionCacheModel();

		diseaseDiscriptionCacheModel.diseasediscriptionId = getDiseasediscriptionId();

		diseaseDiscriptionCacheModel.diseasecode = getDiseasecode();

		String diseasecode = diseaseDiscriptionCacheModel.diseasecode;

		if ((diseasecode != null) && (diseasecode.length() == 0)) {
			diseaseDiscriptionCacheModel.diseasecode = null;
		}

		diseaseDiscriptionCacheModel.diseasegroup = getDiseasegroup();

		String diseasegroup = diseaseDiscriptionCacheModel.diseasegroup;

		if ((diseasegroup != null) && (diseasegroup.length() == 0)) {
			diseaseDiscriptionCacheModel.diseasegroup = null;
		}

		diseaseDiscriptionCacheModel.diseasediscription = getDiseasediscription();

		String diseasediscription = diseaseDiscriptionCacheModel.diseasediscription;

		if ((diseasediscription != null) && (diseasediscription.length() == 0)) {
			diseaseDiscriptionCacheModel.diseasediscription = null;
		}

		diseaseDiscriptionCacheModel.root = getRoot();

		return diseaseDiscriptionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{diseasediscriptionId=");
		sb.append(getDiseasediscriptionId());
		sb.append(", diseasecode=");
		sb.append(getDiseasecode());
		sb.append(", diseasegroup=");
		sb.append(getDiseasegroup());
		sb.append(", diseasediscription=");
		sb.append(getDiseasediscription());
		sb.append(", root=");
		sb.append(getRoot());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append(
			"at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>diseasediscriptionId</column-name><column-value><![CDATA[");
		sb.append(getDiseasediscriptionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diseasecode</column-name><column-value><![CDATA[");
		sb.append(getDiseasecode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diseasegroup</column-name><column-value><![CDATA[");
		sb.append(getDiseasegroup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diseasediscription</column-name><column-value><![CDATA[");
		sb.append(getDiseasediscription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>root</column-name><column-value><![CDATA[");
		sb.append(getRoot());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DiseaseDiscription.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DiseaseDiscription.class
		};
	private long _diseasediscriptionId;
	private String _diseasecode;
	private String _originalDiseasecode;
	private String _diseasegroup;
	private String _originalDiseasegroup;
	private String _diseasediscription;
	private boolean _root;
	private boolean _originalRoot;
	private boolean _setOriginalRoot;
	private long _columnBitmask;
	private DiseaseDiscription _escapedModel;
}