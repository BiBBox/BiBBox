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

import at.graz.hmmc.liferay.portlet.puch.model.Transaktion;
import at.graz.hmmc.liferay.portlet.puch.model.TransaktionModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
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
 * The base model implementation for the Transaktion service. Represents a row in the &quot;puchmuseum.transaktion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.graz.hmmc.liferay.portlet.puch.model.TransaktionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TransaktionImpl}.
 * </p>
 *
 * @author reihsr
 * @see TransaktionImpl
 * @see at.graz.hmmc.liferay.portlet.puch.model.Transaktion
 * @see at.graz.hmmc.liferay.portlet.puch.model.TransaktionModel
 * @generated
 */
public class TransaktionModelImpl extends BaseModelImpl<Transaktion>
	implements TransaktionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a transaktion model instance should use the {@link at.graz.hmmc.liferay.portlet.puch.model.Transaktion} interface instead.
	 */
	public static final String TABLE_NAME = "puchmuseum.transaktion";
	public static final Object[][] TABLE_COLUMNS = {
			{ "transaktionId", Types.BIGINT },
			{ "createrUserId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedUserId", Types.BIGINT },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "typ", Types.VARCHAR },
			{ "puchmuseumsobjectId", Types.BIGINT },
			{ "startDate", Types.TIMESTAMP },
			{ "endDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table puchmuseum.transaktion (transaktionId LONG not null primary key,createrUserId LONG,createDate DATE null,modifiedUserId LONG,modifiedDate DATE null,typ VARCHAR(75) null,puchmuseumsobjectId LONG,startDate DATE null,endDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table puchmuseum.transaktion";
	public static final String ORDER_BY_JPQL = " ORDER BY transaktion.typ ASC";
	public static final String ORDER_BY_SQL = " ORDER BY puchmuseum.transaktion.typ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.graz.hmmc.liferay.portlet.puch.model.Transaktion"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.graz.hmmc.liferay.portlet.puch.model.Transaktion"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.graz.hmmc.liferay.portlet.puch.model.Transaktion"),
			true);
	public static long PUCHMUSEUMSOBJECTID_COLUMN_BITMASK = 1L;
	public static long TYP_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.graz.hmmc.liferay.portlet.puch.model.Transaktion"));

	public TransaktionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _transaktionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTransaktionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _transaktionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Transaktion.class;
	}

	@Override
	public String getModelClassName() {
		return Transaktion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("transaktionId", getTransaktionId());
		attributes.put("createrUserId", getCreaterUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedUserId", getModifiedUserId());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("typ", getTyp());
		attributes.put("puchmuseumsobjectId", getPuchmuseumsobjectId());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long transaktionId = (Long)attributes.get("transaktionId");

		if (transaktionId != null) {
			setTransaktionId(transaktionId);
		}

		Long createrUserId = (Long)attributes.get("createrUserId");

		if (createrUserId != null) {
			setCreaterUserId(createrUserId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long modifiedUserId = (Long)attributes.get("modifiedUserId");

		if (modifiedUserId != null) {
			setModifiedUserId(modifiedUserId);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String typ = (String)attributes.get("typ");

		if (typ != null) {
			setTyp(typ);
		}

		Long puchmuseumsobjectId = (Long)attributes.get("puchmuseumsobjectId");

		if (puchmuseumsobjectId != null) {
			setPuchmuseumsobjectId(puchmuseumsobjectId);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}
	}

	@Override
	public long getTransaktionId() {
		return _transaktionId;
	}

	@Override
	public void setTransaktionId(long transaktionId) {
		_transaktionId = transaktionId;
	}

	@Override
	public long getCreaterUserId() {
		return _createrUserId;
	}

	@Override
	public void setCreaterUserId(long createrUserId) {
		_createrUserId = createrUserId;
	}

	@Override
	public String getCreaterUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getCreaterUserId(), "uuid",
			_createrUserUuid);
	}

	@Override
	public void setCreaterUserUuid(String createrUserUuid) {
		_createrUserUuid = createrUserUuid;
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
	public long getModifiedUserId() {
		return _modifiedUserId;
	}

	@Override
	public void setModifiedUserId(long modifiedUserId) {
		_modifiedUserId = modifiedUserId;
	}

	@Override
	public String getModifiedUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getModifiedUserId(), "uuid",
			_modifiedUserUuid);
	}

	@Override
	public void setModifiedUserUuid(String modifiedUserUuid) {
		_modifiedUserUuid = modifiedUserUuid;
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
	public String getTyp() {
		if (_typ == null) {
			return StringPool.BLANK;
		}
		else {
			return _typ;
		}
	}

	@Override
	public void setTyp(String typ) {
		_columnBitmask = -1L;

		if (_originalTyp == null) {
			_originalTyp = _typ;
		}

		_typ = typ;
	}

	public String getOriginalTyp() {
		return GetterUtil.getString(_originalTyp);
	}

	@Override
	public long getPuchmuseumsobjectId() {
		return _puchmuseumsobjectId;
	}

	@Override
	public void setPuchmuseumsobjectId(long puchmuseumsobjectId) {
		_columnBitmask |= PUCHMUSEUMSOBJECTID_COLUMN_BITMASK;

		if (!_setOriginalPuchmuseumsobjectId) {
			_setOriginalPuchmuseumsobjectId = true;

			_originalPuchmuseumsobjectId = _puchmuseumsobjectId;
		}

		_puchmuseumsobjectId = puchmuseumsobjectId;
	}

	public long getOriginalPuchmuseumsobjectId() {
		return _originalPuchmuseumsobjectId;
	}

	@Override
	public Date getStartDate() {
		return _startDate;
	}

	@Override
	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	@Override
	public Date getEndDate() {
		return _endDate;
	}

	@Override
	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Transaktion.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Transaktion toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Transaktion)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TransaktionImpl transaktionImpl = new TransaktionImpl();

		transaktionImpl.setTransaktionId(getTransaktionId());
		transaktionImpl.setCreaterUserId(getCreaterUserId());
		transaktionImpl.setCreateDate(getCreateDate());
		transaktionImpl.setModifiedUserId(getModifiedUserId());
		transaktionImpl.setModifiedDate(getModifiedDate());
		transaktionImpl.setTyp(getTyp());
		transaktionImpl.setPuchmuseumsobjectId(getPuchmuseumsobjectId());
		transaktionImpl.setStartDate(getStartDate());
		transaktionImpl.setEndDate(getEndDate());

		transaktionImpl.resetOriginalValues();

		return transaktionImpl;
	}

	@Override
	public int compareTo(Transaktion transaktion) {
		int value = 0;

		value = getTyp().compareTo(transaktion.getTyp());

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

		if (!(obj instanceof Transaktion)) {
			return false;
		}

		Transaktion transaktion = (Transaktion)obj;

		long primaryKey = transaktion.getPrimaryKey();

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
		TransaktionModelImpl transaktionModelImpl = this;

		transaktionModelImpl._originalTyp = transaktionModelImpl._typ;

		transaktionModelImpl._originalPuchmuseumsobjectId = transaktionModelImpl._puchmuseumsobjectId;

		transaktionModelImpl._setOriginalPuchmuseumsobjectId = false;

		transaktionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Transaktion> toCacheModel() {
		TransaktionCacheModel transaktionCacheModel = new TransaktionCacheModel();

		transaktionCacheModel.transaktionId = getTransaktionId();

		transaktionCacheModel.createrUserId = getCreaterUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			transaktionCacheModel.createDate = createDate.getTime();
		}
		else {
			transaktionCacheModel.createDate = Long.MIN_VALUE;
		}

		transaktionCacheModel.modifiedUserId = getModifiedUserId();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			transaktionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			transaktionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		transaktionCacheModel.typ = getTyp();

		String typ = transaktionCacheModel.typ;

		if ((typ != null) && (typ.length() == 0)) {
			transaktionCacheModel.typ = null;
		}

		transaktionCacheModel.puchmuseumsobjectId = getPuchmuseumsobjectId();

		Date startDate = getStartDate();

		if (startDate != null) {
			transaktionCacheModel.startDate = startDate.getTime();
		}
		else {
			transaktionCacheModel.startDate = Long.MIN_VALUE;
		}

		Date endDate = getEndDate();

		if (endDate != null) {
			transaktionCacheModel.endDate = endDate.getTime();
		}
		else {
			transaktionCacheModel.endDate = Long.MIN_VALUE;
		}

		return transaktionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{transaktionId=");
		sb.append(getTransaktionId());
		sb.append(", createrUserId=");
		sb.append(getCreaterUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedUserId=");
		sb.append(getModifiedUserId());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", typ=");
		sb.append(getTyp());
		sb.append(", puchmuseumsobjectId=");
		sb.append(getPuchmuseumsobjectId());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("at.graz.hmmc.liferay.portlet.puch.model.Transaktion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>transaktionId</column-name><column-value><![CDATA[");
		sb.append(getTransaktionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createrUserId</column-name><column-value><![CDATA[");
		sb.append(getCreaterUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedUserId</column-name><column-value><![CDATA[");
		sb.append(getModifiedUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typ</column-name><column-value><![CDATA[");
		sb.append(getTyp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>puchmuseumsobjectId</column-name><column-value><![CDATA[");
		sb.append(getPuchmuseumsobjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Transaktion.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Transaktion.class
		};
	private long _transaktionId;
	private long _createrUserId;
	private String _createrUserUuid;
	private Date _createDate;
	private long _modifiedUserId;
	private String _modifiedUserUuid;
	private Date _modifiedDate;
	private String _typ;
	private String _originalTyp;
	private long _puchmuseumsobjectId;
	private long _originalPuchmuseumsobjectId;
	private boolean _setOriginalPuchmuseumsobjectId;
	private Date _startDate;
	private Date _endDate;
	private long _columnBitmask;
	private Transaktion _escapedModel;
}