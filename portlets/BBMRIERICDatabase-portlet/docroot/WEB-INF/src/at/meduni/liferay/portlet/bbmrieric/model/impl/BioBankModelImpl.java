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

import at.meduni.liferay.portlet.bbmrieric.model.BioBank;
import at.meduni.liferay.portlet.bbmrieric.model.BioBankModel;

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
 * The base model implementation for the BioBank service. Represents a row in the &quot;bbmrieric.biobank&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.meduni.liferay.portlet.bbmrieric.model.BioBankModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BioBankImpl}.
 * </p>
 *
 * @author reihsr
 * @see BioBankImpl
 * @see at.meduni.liferay.portlet.bbmrieric.model.BioBank
 * @see at.meduni.liferay.portlet.bbmrieric.model.BioBankModel
 * @generated
 */
public class BioBankModelImpl extends BaseModelImpl<BioBank>
	implements BioBankModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a bio bank model instance should use the {@link at.meduni.liferay.portlet.bbmrieric.model.BioBank} interface instead.
	 */
	public static final String TABLE_NAME = "bbmrieric.biobank";
	public static final Object[][] TABLE_COLUMNS = {
			{ "biobankId", Types.BIGINT },
			{ "organisationid", Types.BIGINT },
			{ "ldapbiobankID", Types.VARCHAR },
			{ "biobankcountry", Types.VARCHAR },
			{ "biobankname", Types.VARCHAR },
			{ "biobanktype", Types.VARCHAR },
			{ "biobanksize", Types.VARCHAR },
			{ "biobankdescription", Types.VARCHAR },
			{ "biobankjuristicperson", Types.VARCHAR },
			{ "UUID", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table bbmrieric.biobank (biobankId LONG not null primary key,organisationid LONG,ldapbiobankID TEXT null,biobankcountry TEXT null,biobankname TEXT null,biobanktype TEXT null,biobanksize TEXT null,biobankdescription TEXT null,biobankjuristicperson TEXT null,UUID VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table bbmrieric.biobank";
	public static final String ORDER_BY_JPQL = " ORDER BY bioBank.biobankId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY bbmrieric.biobank.biobankId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.meduni.liferay.portlet.bbmrieric.model.BioBank"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.meduni.liferay.portlet.bbmrieric.model.BioBank"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.at.meduni.liferay.portlet.bbmrieric.model.BioBank"),
			true);
	public static long UUID_COLUMN_BITMASK = 1L;
	public static long BIOBANKCOUNTRY_COLUMN_BITMASK = 2L;
	public static long LDAPBIOBANKID_COLUMN_BITMASK = 4L;
	public static long BIOBANKID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.meduni.liferay.portlet.bbmrieric.model.BioBank"));

	public BioBankModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _biobankId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBiobankId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _biobankId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return BioBank.class;
	}

	@Override
	public String getModelClassName() {
		return BioBank.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("biobankId", getBiobankId());
		attributes.put("organisationid", getOrganisationid());
		attributes.put("ldapbiobankID", getLdapbiobankID());
		attributes.put("biobankcountry", getBiobankcountry());
		attributes.put("biobankname", getBiobankname());
		attributes.put("biobanktype", getBiobanktype());
		attributes.put("biobanksize", getBiobanksize());
		attributes.put("biobankdescription", getBiobankdescription());
		attributes.put("biobankjuristicperson", getBiobankjuristicperson());
		attributes.put("UUID", getUUID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long biobankId = (Long)attributes.get("biobankId");

		if (biobankId != null) {
			setBiobankId(biobankId);
		}

		Long organisationid = (Long)attributes.get("organisationid");

		if (organisationid != null) {
			setOrganisationid(organisationid);
		}

		String ldapbiobankID = (String)attributes.get("ldapbiobankID");

		if (ldapbiobankID != null) {
			setLdapbiobankID(ldapbiobankID);
		}

		String biobankcountry = (String)attributes.get("biobankcountry");

		if (biobankcountry != null) {
			setBiobankcountry(biobankcountry);
		}

		String biobankname = (String)attributes.get("biobankname");

		if (biobankname != null) {
			setBiobankname(biobankname);
		}

		String biobanktype = (String)attributes.get("biobanktype");

		if (biobanktype != null) {
			setBiobanktype(biobanktype);
		}

		String biobanksize = (String)attributes.get("biobanksize");

		if (biobanksize != null) {
			setBiobanksize(biobanksize);
		}

		String biobankdescription = (String)attributes.get("biobankdescription");

		if (biobankdescription != null) {
			setBiobankdescription(biobankdescription);
		}

		String biobankjuristicperson = (String)attributes.get(
				"biobankjuristicperson");

		if (biobankjuristicperson != null) {
			setBiobankjuristicperson(biobankjuristicperson);
		}

		String UUID = (String)attributes.get("UUID");

		if (UUID != null) {
			setUUID(UUID);
		}
	}

	@Override
	public long getBiobankId() {
		return _biobankId;
	}

	@Override
	public void setBiobankId(long biobankId) {
		_biobankId = biobankId;
	}

	@Override
	public long getOrganisationid() {
		return _organisationid;
	}

	@Override
	public void setOrganisationid(long organisationid) {
		_organisationid = organisationid;
	}

	@Override
	public String getLdapbiobankID() {
		if (_ldapbiobankID == null) {
			return StringPool.BLANK;
		}
		else {
			return _ldapbiobankID;
		}
	}

	@Override
	public void setLdapbiobankID(String ldapbiobankID) {
		_columnBitmask |= LDAPBIOBANKID_COLUMN_BITMASK;

		if (_originalLdapbiobankID == null) {
			_originalLdapbiobankID = _ldapbiobankID;
		}

		_ldapbiobankID = ldapbiobankID;
	}

	public String getOriginalLdapbiobankID() {
		return GetterUtil.getString(_originalLdapbiobankID);
	}

	@Override
	public String getBiobankcountry() {
		if (_biobankcountry == null) {
			return StringPool.BLANK;
		}
		else {
			return _biobankcountry;
		}
	}

	@Override
	public void setBiobankcountry(String biobankcountry) {
		_columnBitmask |= BIOBANKCOUNTRY_COLUMN_BITMASK;

		if (_originalBiobankcountry == null) {
			_originalBiobankcountry = _biobankcountry;
		}

		_biobankcountry = biobankcountry;
	}

	public String getOriginalBiobankcountry() {
		return GetterUtil.getString(_originalBiobankcountry);
	}

	@Override
	public String getBiobankname() {
		if (_biobankname == null) {
			return StringPool.BLANK;
		}
		else {
			return _biobankname;
		}
	}

	@Override
	public void setBiobankname(String biobankname) {
		_biobankname = biobankname;
	}

	@Override
	public String getBiobanktype() {
		if (_biobanktype == null) {
			return StringPool.BLANK;
		}
		else {
			return _biobanktype;
		}
	}

	@Override
	public void setBiobanktype(String biobanktype) {
		_biobanktype = biobanktype;
	}

	@Override
	public String getBiobanksize() {
		if (_biobanksize == null) {
			return StringPool.BLANK;
		}
		else {
			return _biobanksize;
		}
	}

	@Override
	public void setBiobanksize(String biobanksize) {
		_biobanksize = biobanksize;
	}

	@Override
	public String getBiobankdescription() {
		if (_biobankdescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _biobankdescription;
		}
	}

	@Override
	public void setBiobankdescription(String biobankdescription) {
		_biobankdescription = biobankdescription;
	}

	@Override
	public String getBiobankjuristicperson() {
		if (_biobankjuristicperson == null) {
			return StringPool.BLANK;
		}
		else {
			return _biobankjuristicperson;
		}
	}

	@Override
	public void setBiobankjuristicperson(String biobankjuristicperson) {
		_biobankjuristicperson = biobankjuristicperson;
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
			BioBank.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public BioBank toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (BioBank)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BioBankImpl bioBankImpl = new BioBankImpl();

		bioBankImpl.setBiobankId(getBiobankId());
		bioBankImpl.setOrganisationid(getOrganisationid());
		bioBankImpl.setLdapbiobankID(getLdapbiobankID());
		bioBankImpl.setBiobankcountry(getBiobankcountry());
		bioBankImpl.setBiobankname(getBiobankname());
		bioBankImpl.setBiobanktype(getBiobanktype());
		bioBankImpl.setBiobanksize(getBiobanksize());
		bioBankImpl.setBiobankdescription(getBiobankdescription());
		bioBankImpl.setBiobankjuristicperson(getBiobankjuristicperson());
		bioBankImpl.setUUID(getUUID());

		bioBankImpl.resetOriginalValues();

		return bioBankImpl;
	}

	@Override
	public int compareTo(BioBank bioBank) {
		long primaryKey = bioBank.getPrimaryKey();

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

		if (!(obj instanceof BioBank)) {
			return false;
		}

		BioBank bioBank = (BioBank)obj;

		long primaryKey = bioBank.getPrimaryKey();

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
		BioBankModelImpl bioBankModelImpl = this;

		bioBankModelImpl._originalLdapbiobankID = bioBankModelImpl._ldapbiobankID;

		bioBankModelImpl._originalBiobankcountry = bioBankModelImpl._biobankcountry;

		bioBankModelImpl._originalUUID = bioBankModelImpl._UUID;

		bioBankModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<BioBank> toCacheModel() {
		BioBankCacheModel bioBankCacheModel = new BioBankCacheModel();

		bioBankCacheModel.biobankId = getBiobankId();

		bioBankCacheModel.organisationid = getOrganisationid();

		bioBankCacheModel.ldapbiobankID = getLdapbiobankID();

		String ldapbiobankID = bioBankCacheModel.ldapbiobankID;

		if ((ldapbiobankID != null) && (ldapbiobankID.length() == 0)) {
			bioBankCacheModel.ldapbiobankID = null;
		}

		bioBankCacheModel.biobankcountry = getBiobankcountry();

		String biobankcountry = bioBankCacheModel.biobankcountry;

		if ((biobankcountry != null) && (biobankcountry.length() == 0)) {
			bioBankCacheModel.biobankcountry = null;
		}

		bioBankCacheModel.biobankname = getBiobankname();

		String biobankname = bioBankCacheModel.biobankname;

		if ((biobankname != null) && (biobankname.length() == 0)) {
			bioBankCacheModel.biobankname = null;
		}

		bioBankCacheModel.biobanktype = getBiobanktype();

		String biobanktype = bioBankCacheModel.biobanktype;

		if ((biobanktype != null) && (biobanktype.length() == 0)) {
			bioBankCacheModel.biobanktype = null;
		}

		bioBankCacheModel.biobanksize = getBiobanksize();

		String biobanksize = bioBankCacheModel.biobanksize;

		if ((biobanksize != null) && (biobanksize.length() == 0)) {
			bioBankCacheModel.biobanksize = null;
		}

		bioBankCacheModel.biobankdescription = getBiobankdescription();

		String biobankdescription = bioBankCacheModel.biobankdescription;

		if ((biobankdescription != null) && (biobankdescription.length() == 0)) {
			bioBankCacheModel.biobankdescription = null;
		}

		bioBankCacheModel.biobankjuristicperson = getBiobankjuristicperson();

		String biobankjuristicperson = bioBankCacheModel.biobankjuristicperson;

		if ((biobankjuristicperson != null) &&
				(biobankjuristicperson.length() == 0)) {
			bioBankCacheModel.biobankjuristicperson = null;
		}

		bioBankCacheModel.UUID = getUUID();

		String UUID = bioBankCacheModel.UUID;

		if ((UUID != null) && (UUID.length() == 0)) {
			bioBankCacheModel.UUID = null;
		}

		return bioBankCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{biobankId=");
		sb.append(getBiobankId());
		sb.append(", organisationid=");
		sb.append(getOrganisationid());
		sb.append(", ldapbiobankID=");
		sb.append(getLdapbiobankID());
		sb.append(", biobankcountry=");
		sb.append(getBiobankcountry());
		sb.append(", biobankname=");
		sb.append(getBiobankname());
		sb.append(", biobanktype=");
		sb.append(getBiobanktype());
		sb.append(", biobanksize=");
		sb.append(getBiobanksize());
		sb.append(", biobankdescription=");
		sb.append(getBiobankdescription());
		sb.append(", biobankjuristicperson=");
		sb.append(getBiobankjuristicperson());
		sb.append(", UUID=");
		sb.append(getUUID());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("at.meduni.liferay.portlet.bbmrieric.model.BioBank");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>biobankId</column-name><column-value><![CDATA[");
		sb.append(getBiobankId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organisationid</column-name><column-value><![CDATA[");
		sb.append(getOrganisationid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ldapbiobankID</column-name><column-value><![CDATA[");
		sb.append(getLdapbiobankID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>biobankcountry</column-name><column-value><![CDATA[");
		sb.append(getBiobankcountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>biobankname</column-name><column-value><![CDATA[");
		sb.append(getBiobankname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>biobanktype</column-name><column-value><![CDATA[");
		sb.append(getBiobanktype());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>biobanksize</column-name><column-value><![CDATA[");
		sb.append(getBiobanksize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>biobankdescription</column-name><column-value><![CDATA[");
		sb.append(getBiobankdescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>biobankjuristicperson</column-name><column-value><![CDATA[");
		sb.append(getBiobankjuristicperson());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UUID</column-name><column-value><![CDATA[");
		sb.append(getUUID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = BioBank.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			BioBank.class
		};
	private long _biobankId;
	private long _organisationid;
	private String _ldapbiobankID;
	private String _originalLdapbiobankID;
	private String _biobankcountry;
	private String _originalBiobankcountry;
	private String _biobankname;
	private String _biobanktype;
	private String _biobanksize;
	private String _biobankdescription;
	private String _biobankjuristicperson;
	private String _UUID;
	private String _originalUUID;
	private long _columnBitmask;
	private BioBank _escapedModel;
}