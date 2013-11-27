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

package at.meduni.liferay.portlet.rdconnect.model.impl;

import at.meduni.liferay.portlet.rdconnect.model.AQRRating;
import at.meduni.liferay.portlet.rdconnect.model.AQRRatingModel;

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
 * The base model implementation for the AQRRating service. Represents a row in the &quot;rdconnect.aqr_rating&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.meduni.liferay.portlet.rdconnect.model.AQRRatingModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AQRRatingImpl}.
 * </p>
 *
 * @author Robert Reihs
 * @see AQRRatingImpl
 * @see at.meduni.liferay.portlet.rdconnect.model.AQRRating
 * @see at.meduni.liferay.portlet.rdconnect.model.AQRRatingModel
 * @generated
 */
public class AQRRatingModelImpl extends BaseModelImpl<AQRRating>
	implements AQRRatingModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a a q r rating model instance should use the {@link at.meduni.liferay.portlet.rdconnect.model.AQRRating} interface instead.
	 */
	public static final String TABLE_NAME = "rdconnect.aqr_rating";
	public static final Object[][] TABLE_COLUMNS = {
			{ "aqrId", Types.BIGINT },
			{ "accessability", Types.BIGINT },
			{ "quality", Types.BIGINT },
			{ "relevance", Types.BIGINT },
			{ "masterCandidateId", Types.BIGINT },
			{ "aqrrater", Types.VARCHAR },
			{ "ratingtype", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table rdconnect.aqr_rating (aqrId LONG not null primary key,accessability LONG,quality LONG,relevance LONG,masterCandidateId LONG,aqrrater VARCHAR(75) null,ratingtype VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table rdconnect.aqr_rating";
	public static final String ORDER_BY_JPQL = " ORDER BY aqrRating.aqrId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY rdconnect.aqr_rating.aqrId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.meduni.liferay.portlet.rdconnect.model.AQRRating"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.meduni.liferay.portlet.rdconnect.model.AQRRating"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.meduni.liferay.portlet.rdconnect.model.AQRRating"),
			true);
	public static long MASTERCANDIDATEID_COLUMN_BITMASK = 1L;
	public static long AQRID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.meduni.liferay.portlet.rdconnect.model.AQRRating"));

	public AQRRatingModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _aqrId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAqrId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _aqrId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AQRRating.class;
	}

	@Override
	public String getModelClassName() {
		return AQRRating.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("aqrId", getAqrId());
		attributes.put("accessability", getAccessability());
		attributes.put("quality", getQuality());
		attributes.put("relevance", getRelevance());
		attributes.put("masterCandidateId", getMasterCandidateId());
		attributes.put("aqrrater", getAqrrater());
		attributes.put("ratingtype", getRatingtype());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long aqrId = (Long)attributes.get("aqrId");

		if (aqrId != null) {
			setAqrId(aqrId);
		}

		Long accessability = (Long)attributes.get("accessability");

		if (accessability != null) {
			setAccessability(accessability);
		}

		Long quality = (Long)attributes.get("quality");

		if (quality != null) {
			setQuality(quality);
		}

		Long relevance = (Long)attributes.get("relevance");

		if (relevance != null) {
			setRelevance(relevance);
		}

		Long masterCandidateId = (Long)attributes.get("masterCandidateId");

		if (masterCandidateId != null) {
			setMasterCandidateId(masterCandidateId);
		}

		String aqrrater = (String)attributes.get("aqrrater");

		if (aqrrater != null) {
			setAqrrater(aqrrater);
		}

		String ratingtype = (String)attributes.get("ratingtype");

		if (ratingtype != null) {
			setRatingtype(ratingtype);
		}
	}

	@Override
	public long getAqrId() {
		return _aqrId;
	}

	@Override
	public void setAqrId(long aqrId) {
		_aqrId = aqrId;
	}

	@Override
	public long getAccessability() {
		return _accessability;
	}

	@Override
	public void setAccessability(long accessability) {
		_accessability = accessability;
	}

	@Override
	public long getQuality() {
		return _quality;
	}

	@Override
	public void setQuality(long quality) {
		_quality = quality;
	}

	@Override
	public long getRelevance() {
		return _relevance;
	}

	@Override
	public void setRelevance(long relevance) {
		_relevance = relevance;
	}

	@Override
	public long getMasterCandidateId() {
		return _masterCandidateId;
	}

	@Override
	public void setMasterCandidateId(long masterCandidateId) {
		_columnBitmask |= MASTERCANDIDATEID_COLUMN_BITMASK;

		if (!_setOriginalMasterCandidateId) {
			_setOriginalMasterCandidateId = true;

			_originalMasterCandidateId = _masterCandidateId;
		}

		_masterCandidateId = masterCandidateId;
	}

	public long getOriginalMasterCandidateId() {
		return _originalMasterCandidateId;
	}

	@Override
	public String getAqrrater() {
		if (_aqrrater == null) {
			return StringPool.BLANK;
		}
		else {
			return _aqrrater;
		}
	}

	@Override
	public void setAqrrater(String aqrrater) {
		_aqrrater = aqrrater;
	}

	@Override
	public String getRatingtype() {
		if (_ratingtype == null) {
			return StringPool.BLANK;
		}
		else {
			return _ratingtype;
		}
	}

	@Override
	public void setRatingtype(String ratingtype) {
		_ratingtype = ratingtype;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			AQRRating.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AQRRating toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AQRRating)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AQRRatingImpl aqrRatingImpl = new AQRRatingImpl();

		aqrRatingImpl.setAqrId(getAqrId());
		aqrRatingImpl.setAccessability(getAccessability());
		aqrRatingImpl.setQuality(getQuality());
		aqrRatingImpl.setRelevance(getRelevance());
		aqrRatingImpl.setMasterCandidateId(getMasterCandidateId());
		aqrRatingImpl.setAqrrater(getAqrrater());
		aqrRatingImpl.setRatingtype(getRatingtype());

		aqrRatingImpl.resetOriginalValues();

		return aqrRatingImpl;
	}

	@Override
	public int compareTo(AQRRating aqrRating) {
		long primaryKey = aqrRating.getPrimaryKey();

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

		if (!(obj instanceof AQRRating)) {
			return false;
		}

		AQRRating aqrRating = (AQRRating)obj;

		long primaryKey = aqrRating.getPrimaryKey();

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
		AQRRatingModelImpl aqrRatingModelImpl = this;

		aqrRatingModelImpl._originalMasterCandidateId = aqrRatingModelImpl._masterCandidateId;

		aqrRatingModelImpl._setOriginalMasterCandidateId = false;

		aqrRatingModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<AQRRating> toCacheModel() {
		AQRRatingCacheModel aqrRatingCacheModel = new AQRRatingCacheModel();

		aqrRatingCacheModel.aqrId = getAqrId();

		aqrRatingCacheModel.accessability = getAccessability();

		aqrRatingCacheModel.quality = getQuality();

		aqrRatingCacheModel.relevance = getRelevance();

		aqrRatingCacheModel.masterCandidateId = getMasterCandidateId();

		aqrRatingCacheModel.aqrrater = getAqrrater();

		String aqrrater = aqrRatingCacheModel.aqrrater;

		if ((aqrrater != null) && (aqrrater.length() == 0)) {
			aqrRatingCacheModel.aqrrater = null;
		}

		aqrRatingCacheModel.ratingtype = getRatingtype();

		String ratingtype = aqrRatingCacheModel.ratingtype;

		if ((ratingtype != null) && (ratingtype.length() == 0)) {
			aqrRatingCacheModel.ratingtype = null;
		}

		return aqrRatingCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{aqrId=");
		sb.append(getAqrId());
		sb.append(", accessability=");
		sb.append(getAccessability());
		sb.append(", quality=");
		sb.append(getQuality());
		sb.append(", relevance=");
		sb.append(getRelevance());
		sb.append(", masterCandidateId=");
		sb.append(getMasterCandidateId());
		sb.append(", aqrrater=");
		sb.append(getAqrrater());
		sb.append(", ratingtype=");
		sb.append(getRatingtype());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("at.meduni.liferay.portlet.rdconnect.model.AQRRating");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>aqrId</column-name><column-value><![CDATA[");
		sb.append(getAqrId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accessability</column-name><column-value><![CDATA[");
		sb.append(getAccessability());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quality</column-name><column-value><![CDATA[");
		sb.append(getQuality());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>relevance</column-name><column-value><![CDATA[");
		sb.append(getRelevance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterCandidateId</column-name><column-value><![CDATA[");
		sb.append(getMasterCandidateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aqrrater</column-name><column-value><![CDATA[");
		sb.append(getAqrrater());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ratingtype</column-name><column-value><![CDATA[");
		sb.append(getRatingtype());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = AQRRating.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			AQRRating.class
		};
	private long _aqrId;
	private long _accessability;
	private long _quality;
	private long _relevance;
	private long _masterCandidateId;
	private long _originalMasterCandidateId;
	private boolean _setOriginalMasterCandidateId;
	private String _aqrrater;
	private String _ratingtype;
	private long _columnBitmask;
	private AQRRating _escapedModel;
}