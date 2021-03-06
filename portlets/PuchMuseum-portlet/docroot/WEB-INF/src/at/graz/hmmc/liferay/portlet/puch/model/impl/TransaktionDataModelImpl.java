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

package at.graz.hmmc.liferay.portlet.puch.model.impl;

import at.graz.hmmc.liferay.portlet.puch.model.TransaktionData;
import at.graz.hmmc.liferay.portlet.puch.model.TransaktionDataModel;

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
 * The base model implementation for the TransaktionData service. Represents a row in the &quot;puchmuseum.transaktiondata&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.graz.hmmc.liferay.portlet.puch.model.TransaktionDataModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TransaktionDataImpl}.
 * </p>
 *
 * @author reihsr
 * @see TransaktionDataImpl
 * @see at.graz.hmmc.liferay.portlet.puch.model.TransaktionData
 * @see at.graz.hmmc.liferay.portlet.puch.model.TransaktionDataModel
 * @generated
 */
public class TransaktionDataModelImpl extends BaseModelImpl<TransaktionData>
	implements TransaktionDataModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a transaktion data model instance should use the {@link at.graz.hmmc.liferay.portlet.puch.model.TransaktionData} interface instead.
	 */
	public static final String TABLE_NAME = "puchmuseum.transaktiondata";
	public static final Object[][] TABLE_COLUMNS = {
			{ "transaktiondataId", Types.BIGINT },
			{ "puchmuseumsobjectId", Types.BIGINT },
			{ "transaktionId", Types.BIGINT },
			{ "objectkey", Types.VARCHAR },
			{ "objectvalue", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table puchmuseum.transaktiondata (transaktiondataId LONG not null primary key,puchmuseumsobjectId LONG,transaktionId LONG,objectkey VARCHAR(75) null,objectvalue VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table puchmuseum.transaktiondata";
	public static final String ORDER_BY_JPQL = " ORDER BY transaktionData.transaktionId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY puchmuseum.transaktiondata.transaktionId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.graz.hmmc.liferay.portlet.puch.model.TransaktionData"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.graz.hmmc.liferay.portlet.puch.model.TransaktionData"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.graz.hmmc.liferay.portlet.puch.model.TransaktionData"),
			true);
	public static long OBJECTKEY_COLUMN_BITMASK = 1L;
	public static long TRANSAKTIONID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.graz.hmmc.liferay.portlet.puch.model.TransaktionData"));

	public TransaktionDataModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _transaktiondataId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTransaktiondataId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _transaktiondataId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TransaktionData.class;
	}

	@Override
	public String getModelClassName() {
		return TransaktionData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("transaktiondataId", getTransaktiondataId());
		attributes.put("puchmuseumsobjectId", getPuchmuseumsobjectId());
		attributes.put("transaktionId", getTransaktionId());
		attributes.put("objectkey", getObjectkey());
		attributes.put("objectvalue", getObjectvalue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long transaktiondataId = (Long)attributes.get("transaktiondataId");

		if (transaktiondataId != null) {
			setTransaktiondataId(transaktiondataId);
		}

		Long puchmuseumsobjectId = (Long)attributes.get("puchmuseumsobjectId");

		if (puchmuseumsobjectId != null) {
			setPuchmuseumsobjectId(puchmuseumsobjectId);
		}

		Long transaktionId = (Long)attributes.get("transaktionId");

		if (transaktionId != null) {
			setTransaktionId(transaktionId);
		}

		String objectkey = (String)attributes.get("objectkey");

		if (objectkey != null) {
			setObjectkey(objectkey);
		}

		String objectvalue = (String)attributes.get("objectvalue");

		if (objectvalue != null) {
			setObjectvalue(objectvalue);
		}
	}

	@Override
	public long getTransaktiondataId() {
		return _transaktiondataId;
	}

	@Override
	public void setTransaktiondataId(long transaktiondataId) {
		_transaktiondataId = transaktiondataId;
	}

	@Override
	public long getPuchmuseumsobjectId() {
		return _puchmuseumsobjectId;
	}

	@Override
	public void setPuchmuseumsobjectId(long puchmuseumsobjectId) {
		_puchmuseumsobjectId = puchmuseumsobjectId;
	}

	@Override
	public long getTransaktionId() {
		return _transaktionId;
	}

	@Override
	public void setTransaktionId(long transaktionId) {
		_columnBitmask = -1L;

		if (!_setOriginalTransaktionId) {
			_setOriginalTransaktionId = true;

			_originalTransaktionId = _transaktionId;
		}

		_transaktionId = transaktionId;
	}

	public long getOriginalTransaktionId() {
		return _originalTransaktionId;
	}

	@Override
	public String getObjectkey() {
		if (_objectkey == null) {
			return StringPool.BLANK;
		}
		else {
			return _objectkey;
		}
	}

	@Override
	public void setObjectkey(String objectkey) {
		_columnBitmask |= OBJECTKEY_COLUMN_BITMASK;

		if (_originalObjectkey == null) {
			_originalObjectkey = _objectkey;
		}

		_objectkey = objectkey;
	}

	public String getOriginalObjectkey() {
		return GetterUtil.getString(_originalObjectkey);
	}

	@Override
	public String getObjectvalue() {
		if (_objectvalue == null) {
			return StringPool.BLANK;
		}
		else {
			return _objectvalue;
		}
	}

	@Override
	public void setObjectvalue(String objectvalue) {
		_objectvalue = objectvalue;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TransaktionData.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TransaktionData toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TransaktionData)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TransaktionDataImpl transaktionDataImpl = new TransaktionDataImpl();

		transaktionDataImpl.setTransaktiondataId(getTransaktiondataId());
		transaktionDataImpl.setPuchmuseumsobjectId(getPuchmuseumsobjectId());
		transaktionDataImpl.setTransaktionId(getTransaktionId());
		transaktionDataImpl.setObjectkey(getObjectkey());
		transaktionDataImpl.setObjectvalue(getObjectvalue());

		transaktionDataImpl.resetOriginalValues();

		return transaktionDataImpl;
	}

	@Override
	public int compareTo(TransaktionData transaktionData) {
		int value = 0;

		if (getTransaktionId() < transaktionData.getTransaktionId()) {
			value = -1;
		}
		else if (getTransaktionId() > transaktionData.getTransaktionId()) {
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

		if (!(obj instanceof TransaktionData)) {
			return false;
		}

		TransaktionData transaktionData = (TransaktionData)obj;

		long primaryKey = transaktionData.getPrimaryKey();

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
		TransaktionDataModelImpl transaktionDataModelImpl = this;

		transaktionDataModelImpl._originalTransaktionId = transaktionDataModelImpl._transaktionId;

		transaktionDataModelImpl._setOriginalTransaktionId = false;

		transaktionDataModelImpl._originalObjectkey = transaktionDataModelImpl._objectkey;

		transaktionDataModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TransaktionData> toCacheModel() {
		TransaktionDataCacheModel transaktionDataCacheModel = new TransaktionDataCacheModel();

		transaktionDataCacheModel.transaktiondataId = getTransaktiondataId();

		transaktionDataCacheModel.puchmuseumsobjectId = getPuchmuseumsobjectId();

		transaktionDataCacheModel.transaktionId = getTransaktionId();

		transaktionDataCacheModel.objectkey = getObjectkey();

		String objectkey = transaktionDataCacheModel.objectkey;

		if ((objectkey != null) && (objectkey.length() == 0)) {
			transaktionDataCacheModel.objectkey = null;
		}

		transaktionDataCacheModel.objectvalue = getObjectvalue();

		String objectvalue = transaktionDataCacheModel.objectvalue;

		if ((objectvalue != null) && (objectvalue.length() == 0)) {
			transaktionDataCacheModel.objectvalue = null;
		}

		return transaktionDataCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{transaktiondataId=");
		sb.append(getTransaktiondataId());
		sb.append(", puchmuseumsobjectId=");
		sb.append(getPuchmuseumsobjectId());
		sb.append(", transaktionId=");
		sb.append(getTransaktionId());
		sb.append(", objectkey=");
		sb.append(getObjectkey());
		sb.append(", objectvalue=");
		sb.append(getObjectvalue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("at.graz.hmmc.liferay.portlet.puch.model.TransaktionData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>transaktiondataId</column-name><column-value><![CDATA[");
		sb.append(getTransaktiondataId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>puchmuseumsobjectId</column-name><column-value><![CDATA[");
		sb.append(getPuchmuseumsobjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transaktionId</column-name><column-value><![CDATA[");
		sb.append(getTransaktionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>objectkey</column-name><column-value><![CDATA[");
		sb.append(getObjectkey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>objectvalue</column-name><column-value><![CDATA[");
		sb.append(getObjectvalue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TransaktionData.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TransaktionData.class
		};
	private long _transaktiondataId;
	private long _puchmuseumsobjectId;
	private long _transaktionId;
	private long _originalTransaktionId;
	private boolean _setOriginalTransaktionId;
	private String _objectkey;
	private String _originalObjectkey;
	private String _objectvalue;
	private long _columnBitmask;
	private TransaktionData _escapedModel;
}