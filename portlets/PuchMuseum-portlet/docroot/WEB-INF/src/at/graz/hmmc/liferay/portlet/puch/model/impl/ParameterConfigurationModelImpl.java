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

import at.graz.hmmc.liferay.portlet.puch.model.ParameterConfiguration;
import at.graz.hmmc.liferay.portlet.puch.model.ParameterConfigurationModel;

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
 * The base model implementation for the ParameterConfiguration service. Represents a row in the &quot;puchmuseum.parameterconfiguration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link at.graz.hmmc.liferay.portlet.puch.model.ParameterConfigurationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ParameterConfigurationImpl}.
 * </p>
 *
 * @author reihsr
 * @see ParameterConfigurationImpl
 * @see at.graz.hmmc.liferay.portlet.puch.model.ParameterConfiguration
 * @see at.graz.hmmc.liferay.portlet.puch.model.ParameterConfigurationModel
 * @generated
 */
public class ParameterConfigurationModelImpl extends BaseModelImpl<ParameterConfiguration>
	implements ParameterConfigurationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a parameter configuration model instance should use the {@link at.graz.hmmc.liferay.portlet.puch.model.ParameterConfiguration} interface instead.
	 */
	public static final String TABLE_NAME = "puchmuseum.parameterconfiguration";
	public static final Object[][] TABLE_COLUMNS = {
			{ "parameterconfigurationId", Types.BIGINT },
			{ "displaynameshort", Types.VARCHAR },
			{ "displaynamelong", Types.VARCHAR },
			{ "datatype", Types.VARCHAR },
			{ "group_", Types.VARCHAR },
			{ "tab", Types.VARCHAR },
			{ "summery", Types.BOOLEAN },
			{ "viewscript", Types.VARCHAR },
			{ "viewvisible", Types.BOOLEAN },
			{ "viewtip", Types.VARCHAR },
			{ "viewtitlecss", Types.VARCHAR },
			{ "viewvaluecss", Types.VARCHAR },
			{ "viewcss", Types.VARCHAR },
			{ "editscript", Types.VARCHAR },
			{ "editvisible", Types.BOOLEAN },
			{ "edittip", Types.VARCHAR },
			{ "edittitlecss", Types.VARCHAR },
			{ "editvaluecss", Types.VARCHAR },
			{ "editcss", Types.VARCHAR },
			{ "editcolumnwidth", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table puchmuseum.parameterconfiguration (parameterconfigurationId LONG not null primary key,displaynameshort TEXT null,displaynamelong TEXT null,datatype VARCHAR(75) null,group_ VARCHAR(75) null,tab TEXT null,summery BOOLEAN,viewscript TEXT null,viewvisible BOOLEAN,viewtip TEXT null,viewtitlecss TEXT null,viewvaluecss TEXT null,viewcss TEXT null,editscript TEXT null,editvisible BOOLEAN,edittip TEXT null,edittitlecss TEXT null,editvaluecss TEXT null,editcss TEXT null,editcolumnwidth LONG)";
	public static final String TABLE_SQL_DROP = "drop table puchmuseum.parameterconfiguration";
	public static final String ORDER_BY_JPQL = " ORDER BY parameterConfiguration.parameterconfigurationId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY puchmuseum.parameterconfiguration.parameterconfigurationId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.at.graz.hmmc.liferay.portlet.puch.model.ParameterConfiguration"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.at.graz.hmmc.liferay.portlet.puch.model.ParameterConfiguration"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.at.graz.hmmc.liferay.portlet.puch.model.ParameterConfiguration"));

	public ParameterConfigurationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _parameterconfigurationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setParameterconfigurationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _parameterconfigurationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ParameterConfiguration.class;
	}

	@Override
	public String getModelClassName() {
		return ParameterConfiguration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("parameterconfigurationId", getParameterconfigurationId());
		attributes.put("displaynameshort", getDisplaynameshort());
		attributes.put("displaynamelong", getDisplaynamelong());
		attributes.put("datatype", getDatatype());
		attributes.put("group", getGroup());
		attributes.put("tab", getTab());
		attributes.put("summery", getSummery());
		attributes.put("viewscript", getViewscript());
		attributes.put("viewvisible", getViewvisible());
		attributes.put("viewtip", getViewtip());
		attributes.put("viewtitlecss", getViewtitlecss());
		attributes.put("viewvaluecss", getViewvaluecss());
		attributes.put("viewcss", getViewcss());
		attributes.put("editscript", getEditscript());
		attributes.put("editvisible", getEditvisible());
		attributes.put("edittip", getEdittip());
		attributes.put("edittitlecss", getEdittitlecss());
		attributes.put("editvaluecss", getEditvaluecss());
		attributes.put("editcss", getEditcss());
		attributes.put("editcolumnwidth", getEditcolumnwidth());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long parameterconfigurationId = (Long)attributes.get(
				"parameterconfigurationId");

		if (parameterconfigurationId != null) {
			setParameterconfigurationId(parameterconfigurationId);
		}

		String displaynameshort = (String)attributes.get("displaynameshort");

		if (displaynameshort != null) {
			setDisplaynameshort(displaynameshort);
		}

		String displaynamelong = (String)attributes.get("displaynamelong");

		if (displaynamelong != null) {
			setDisplaynamelong(displaynamelong);
		}

		String datatype = (String)attributes.get("datatype");

		if (datatype != null) {
			setDatatype(datatype);
		}

		String group = (String)attributes.get("group");

		if (group != null) {
			setGroup(group);
		}

		String tab = (String)attributes.get("tab");

		if (tab != null) {
			setTab(tab);
		}

		Boolean summery = (Boolean)attributes.get("summery");

		if (summery != null) {
			setSummery(summery);
		}

		String viewscript = (String)attributes.get("viewscript");

		if (viewscript != null) {
			setViewscript(viewscript);
		}

		Boolean viewvisible = (Boolean)attributes.get("viewvisible");

		if (viewvisible != null) {
			setViewvisible(viewvisible);
		}

		String viewtip = (String)attributes.get("viewtip");

		if (viewtip != null) {
			setViewtip(viewtip);
		}

		String viewtitlecss = (String)attributes.get("viewtitlecss");

		if (viewtitlecss != null) {
			setViewtitlecss(viewtitlecss);
		}

		String viewvaluecss = (String)attributes.get("viewvaluecss");

		if (viewvaluecss != null) {
			setViewvaluecss(viewvaluecss);
		}

		String viewcss = (String)attributes.get("viewcss");

		if (viewcss != null) {
			setViewcss(viewcss);
		}

		String editscript = (String)attributes.get("editscript");

		if (editscript != null) {
			setEditscript(editscript);
		}

		Boolean editvisible = (Boolean)attributes.get("editvisible");

		if (editvisible != null) {
			setEditvisible(editvisible);
		}

		String edittip = (String)attributes.get("edittip");

		if (edittip != null) {
			setEdittip(edittip);
		}

		String edittitlecss = (String)attributes.get("edittitlecss");

		if (edittitlecss != null) {
			setEdittitlecss(edittitlecss);
		}

		String editvaluecss = (String)attributes.get("editvaluecss");

		if (editvaluecss != null) {
			setEditvaluecss(editvaluecss);
		}

		String editcss = (String)attributes.get("editcss");

		if (editcss != null) {
			setEditcss(editcss);
		}

		Long editcolumnwidth = (Long)attributes.get("editcolumnwidth");

		if (editcolumnwidth != null) {
			setEditcolumnwidth(editcolumnwidth);
		}
	}

	@Override
	public long getParameterconfigurationId() {
		return _parameterconfigurationId;
	}

	@Override
	public void setParameterconfigurationId(long parameterconfigurationId) {
		_parameterconfigurationId = parameterconfigurationId;
	}

	@Override
	public String getDisplaynameshort() {
		if (_displaynameshort == null) {
			return StringPool.BLANK;
		}
		else {
			return _displaynameshort;
		}
	}

	@Override
	public void setDisplaynameshort(String displaynameshort) {
		_displaynameshort = displaynameshort;
	}

	@Override
	public String getDisplaynamelong() {
		if (_displaynamelong == null) {
			return StringPool.BLANK;
		}
		else {
			return _displaynamelong;
		}
	}

	@Override
	public void setDisplaynamelong(String displaynamelong) {
		_displaynamelong = displaynamelong;
	}

	@Override
	public String getDatatype() {
		if (_datatype == null) {
			return StringPool.BLANK;
		}
		else {
			return _datatype;
		}
	}

	@Override
	public void setDatatype(String datatype) {
		_datatype = datatype;
	}

	@Override
	public String getGroup() {
		if (_group == null) {
			return StringPool.BLANK;
		}
		else {
			return _group;
		}
	}

	@Override
	public void setGroup(String group) {
		_group = group;
	}

	@Override
	public String getTab() {
		if (_tab == null) {
			return StringPool.BLANK;
		}
		else {
			return _tab;
		}
	}

	@Override
	public void setTab(String tab) {
		_tab = tab;
	}

	@Override
	public boolean getSummery() {
		return _summery;
	}

	@Override
	public boolean isSummery() {
		return _summery;
	}

	@Override
	public void setSummery(boolean summery) {
		_summery = summery;
	}

	@Override
	public String getViewscript() {
		if (_viewscript == null) {
			return StringPool.BLANK;
		}
		else {
			return _viewscript;
		}
	}

	@Override
	public void setViewscript(String viewscript) {
		_viewscript = viewscript;
	}

	@Override
	public boolean getViewvisible() {
		return _viewvisible;
	}

	@Override
	public boolean isViewvisible() {
		return _viewvisible;
	}

	@Override
	public void setViewvisible(boolean viewvisible) {
		_viewvisible = viewvisible;
	}

	@Override
	public String getViewtip() {
		if (_viewtip == null) {
			return StringPool.BLANK;
		}
		else {
			return _viewtip;
		}
	}

	@Override
	public void setViewtip(String viewtip) {
		_viewtip = viewtip;
	}

	@Override
	public String getViewtitlecss() {
		if (_viewtitlecss == null) {
			return StringPool.BLANK;
		}
		else {
			return _viewtitlecss;
		}
	}

	@Override
	public void setViewtitlecss(String viewtitlecss) {
		_viewtitlecss = viewtitlecss;
	}

	@Override
	public String getViewvaluecss() {
		if (_viewvaluecss == null) {
			return StringPool.BLANK;
		}
		else {
			return _viewvaluecss;
		}
	}

	@Override
	public void setViewvaluecss(String viewvaluecss) {
		_viewvaluecss = viewvaluecss;
	}

	@Override
	public String getViewcss() {
		if (_viewcss == null) {
			return StringPool.BLANK;
		}
		else {
			return _viewcss;
		}
	}

	@Override
	public void setViewcss(String viewcss) {
		_viewcss = viewcss;
	}

	@Override
	public String getEditscript() {
		if (_editscript == null) {
			return StringPool.BLANK;
		}
		else {
			return _editscript;
		}
	}

	@Override
	public void setEditscript(String editscript) {
		_editscript = editscript;
	}

	@Override
	public boolean getEditvisible() {
		return _editvisible;
	}

	@Override
	public boolean isEditvisible() {
		return _editvisible;
	}

	@Override
	public void setEditvisible(boolean editvisible) {
		_editvisible = editvisible;
	}

	@Override
	public String getEdittip() {
		if (_edittip == null) {
			return StringPool.BLANK;
		}
		else {
			return _edittip;
		}
	}

	@Override
	public void setEdittip(String edittip) {
		_edittip = edittip;
	}

	@Override
	public String getEdittitlecss() {
		if (_edittitlecss == null) {
			return StringPool.BLANK;
		}
		else {
			return _edittitlecss;
		}
	}

	@Override
	public void setEdittitlecss(String edittitlecss) {
		_edittitlecss = edittitlecss;
	}

	@Override
	public String getEditvaluecss() {
		if (_editvaluecss == null) {
			return StringPool.BLANK;
		}
		else {
			return _editvaluecss;
		}
	}

	@Override
	public void setEditvaluecss(String editvaluecss) {
		_editvaluecss = editvaluecss;
	}

	@Override
	public String getEditcss() {
		if (_editcss == null) {
			return StringPool.BLANK;
		}
		else {
			return _editcss;
		}
	}

	@Override
	public void setEditcss(String editcss) {
		_editcss = editcss;
	}

	@Override
	public long getEditcolumnwidth() {
		return _editcolumnwidth;
	}

	@Override
	public void setEditcolumnwidth(long editcolumnwidth) {
		_editcolumnwidth = editcolumnwidth;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ParameterConfiguration.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ParameterConfiguration toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ParameterConfiguration)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ParameterConfigurationImpl parameterConfigurationImpl = new ParameterConfigurationImpl();

		parameterConfigurationImpl.setParameterconfigurationId(getParameterconfigurationId());
		parameterConfigurationImpl.setDisplaynameshort(getDisplaynameshort());
		parameterConfigurationImpl.setDisplaynamelong(getDisplaynamelong());
		parameterConfigurationImpl.setDatatype(getDatatype());
		parameterConfigurationImpl.setGroup(getGroup());
		parameterConfigurationImpl.setTab(getTab());
		parameterConfigurationImpl.setSummery(getSummery());
		parameterConfigurationImpl.setViewscript(getViewscript());
		parameterConfigurationImpl.setViewvisible(getViewvisible());
		parameterConfigurationImpl.setViewtip(getViewtip());
		parameterConfigurationImpl.setViewtitlecss(getViewtitlecss());
		parameterConfigurationImpl.setViewvaluecss(getViewvaluecss());
		parameterConfigurationImpl.setViewcss(getViewcss());
		parameterConfigurationImpl.setEditscript(getEditscript());
		parameterConfigurationImpl.setEditvisible(getEditvisible());
		parameterConfigurationImpl.setEdittip(getEdittip());
		parameterConfigurationImpl.setEdittitlecss(getEdittitlecss());
		parameterConfigurationImpl.setEditvaluecss(getEditvaluecss());
		parameterConfigurationImpl.setEditcss(getEditcss());
		parameterConfigurationImpl.setEditcolumnwidth(getEditcolumnwidth());

		parameterConfigurationImpl.resetOriginalValues();

		return parameterConfigurationImpl;
	}

	@Override
	public int compareTo(ParameterConfiguration parameterConfiguration) {
		long primaryKey = parameterConfiguration.getPrimaryKey();

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

		if (!(obj instanceof ParameterConfiguration)) {
			return false;
		}

		ParameterConfiguration parameterConfiguration = (ParameterConfiguration)obj;

		long primaryKey = parameterConfiguration.getPrimaryKey();

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
	}

	@Override
	public CacheModel<ParameterConfiguration> toCacheModel() {
		ParameterConfigurationCacheModel parameterConfigurationCacheModel = new ParameterConfigurationCacheModel();

		parameterConfigurationCacheModel.parameterconfigurationId = getParameterconfigurationId();

		parameterConfigurationCacheModel.displaynameshort = getDisplaynameshort();

		String displaynameshort = parameterConfigurationCacheModel.displaynameshort;

		if ((displaynameshort != null) && (displaynameshort.length() == 0)) {
			parameterConfigurationCacheModel.displaynameshort = null;
		}

		parameterConfigurationCacheModel.displaynamelong = getDisplaynamelong();

		String displaynamelong = parameterConfigurationCacheModel.displaynamelong;

		if ((displaynamelong != null) && (displaynamelong.length() == 0)) {
			parameterConfigurationCacheModel.displaynamelong = null;
		}

		parameterConfigurationCacheModel.datatype = getDatatype();

		String datatype = parameterConfigurationCacheModel.datatype;

		if ((datatype != null) && (datatype.length() == 0)) {
			parameterConfigurationCacheModel.datatype = null;
		}

		parameterConfigurationCacheModel.group = getGroup();

		String group = parameterConfigurationCacheModel.group;

		if ((group != null) && (group.length() == 0)) {
			parameterConfigurationCacheModel.group = null;
		}

		parameterConfigurationCacheModel.tab = getTab();

		String tab = parameterConfigurationCacheModel.tab;

		if ((tab != null) && (tab.length() == 0)) {
			parameterConfigurationCacheModel.tab = null;
		}

		parameterConfigurationCacheModel.summery = getSummery();

		parameterConfigurationCacheModel.viewscript = getViewscript();

		String viewscript = parameterConfigurationCacheModel.viewscript;

		if ((viewscript != null) && (viewscript.length() == 0)) {
			parameterConfigurationCacheModel.viewscript = null;
		}

		parameterConfigurationCacheModel.viewvisible = getViewvisible();

		parameterConfigurationCacheModel.viewtip = getViewtip();

		String viewtip = parameterConfigurationCacheModel.viewtip;

		if ((viewtip != null) && (viewtip.length() == 0)) {
			parameterConfigurationCacheModel.viewtip = null;
		}

		parameterConfigurationCacheModel.viewtitlecss = getViewtitlecss();

		String viewtitlecss = parameterConfigurationCacheModel.viewtitlecss;

		if ((viewtitlecss != null) && (viewtitlecss.length() == 0)) {
			parameterConfigurationCacheModel.viewtitlecss = null;
		}

		parameterConfigurationCacheModel.viewvaluecss = getViewvaluecss();

		String viewvaluecss = parameterConfigurationCacheModel.viewvaluecss;

		if ((viewvaluecss != null) && (viewvaluecss.length() == 0)) {
			parameterConfigurationCacheModel.viewvaluecss = null;
		}

		parameterConfigurationCacheModel.viewcss = getViewcss();

		String viewcss = parameterConfigurationCacheModel.viewcss;

		if ((viewcss != null) && (viewcss.length() == 0)) {
			parameterConfigurationCacheModel.viewcss = null;
		}

		parameterConfigurationCacheModel.editscript = getEditscript();

		String editscript = parameterConfigurationCacheModel.editscript;

		if ((editscript != null) && (editscript.length() == 0)) {
			parameterConfigurationCacheModel.editscript = null;
		}

		parameterConfigurationCacheModel.editvisible = getEditvisible();

		parameterConfigurationCacheModel.edittip = getEdittip();

		String edittip = parameterConfigurationCacheModel.edittip;

		if ((edittip != null) && (edittip.length() == 0)) {
			parameterConfigurationCacheModel.edittip = null;
		}

		parameterConfigurationCacheModel.edittitlecss = getEdittitlecss();

		String edittitlecss = parameterConfigurationCacheModel.edittitlecss;

		if ((edittitlecss != null) && (edittitlecss.length() == 0)) {
			parameterConfigurationCacheModel.edittitlecss = null;
		}

		parameterConfigurationCacheModel.editvaluecss = getEditvaluecss();

		String editvaluecss = parameterConfigurationCacheModel.editvaluecss;

		if ((editvaluecss != null) && (editvaluecss.length() == 0)) {
			parameterConfigurationCacheModel.editvaluecss = null;
		}

		parameterConfigurationCacheModel.editcss = getEditcss();

		String editcss = parameterConfigurationCacheModel.editcss;

		if ((editcss != null) && (editcss.length() == 0)) {
			parameterConfigurationCacheModel.editcss = null;
		}

		parameterConfigurationCacheModel.editcolumnwidth = getEditcolumnwidth();

		return parameterConfigurationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{parameterconfigurationId=");
		sb.append(getParameterconfigurationId());
		sb.append(", displaynameshort=");
		sb.append(getDisplaynameshort());
		sb.append(", displaynamelong=");
		sb.append(getDisplaynamelong());
		sb.append(", datatype=");
		sb.append(getDatatype());
		sb.append(", group=");
		sb.append(getGroup());
		sb.append(", tab=");
		sb.append(getTab());
		sb.append(", summery=");
		sb.append(getSummery());
		sb.append(", viewscript=");
		sb.append(getViewscript());
		sb.append(", viewvisible=");
		sb.append(getViewvisible());
		sb.append(", viewtip=");
		sb.append(getViewtip());
		sb.append(", viewtitlecss=");
		sb.append(getViewtitlecss());
		sb.append(", viewvaluecss=");
		sb.append(getViewvaluecss());
		sb.append(", viewcss=");
		sb.append(getViewcss());
		sb.append(", editscript=");
		sb.append(getEditscript());
		sb.append(", editvisible=");
		sb.append(getEditvisible());
		sb.append(", edittip=");
		sb.append(getEdittip());
		sb.append(", edittitlecss=");
		sb.append(getEdittitlecss());
		sb.append(", editvaluecss=");
		sb.append(getEditvaluecss());
		sb.append(", editcss=");
		sb.append(getEditcss());
		sb.append(", editcolumnwidth=");
		sb.append(getEditcolumnwidth());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append(
			"at.graz.hmmc.liferay.portlet.puch.model.ParameterConfiguration");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>parameterconfigurationId</column-name><column-value><![CDATA[");
		sb.append(getParameterconfigurationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>displaynameshort</column-name><column-value><![CDATA[");
		sb.append(getDisplaynameshort());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>displaynamelong</column-name><column-value><![CDATA[");
		sb.append(getDisplaynamelong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>datatype</column-name><column-value><![CDATA[");
		sb.append(getDatatype());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>group</column-name><column-value><![CDATA[");
		sb.append(getGroup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tab</column-name><column-value><![CDATA[");
		sb.append(getTab());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>summery</column-name><column-value><![CDATA[");
		sb.append(getSummery());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viewscript</column-name><column-value><![CDATA[");
		sb.append(getViewscript());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viewvisible</column-name><column-value><![CDATA[");
		sb.append(getViewvisible());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viewtip</column-name><column-value><![CDATA[");
		sb.append(getViewtip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viewtitlecss</column-name><column-value><![CDATA[");
		sb.append(getViewtitlecss());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viewvaluecss</column-name><column-value><![CDATA[");
		sb.append(getViewvaluecss());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viewcss</column-name><column-value><![CDATA[");
		sb.append(getViewcss());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>editscript</column-name><column-value><![CDATA[");
		sb.append(getEditscript());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>editvisible</column-name><column-value><![CDATA[");
		sb.append(getEditvisible());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>edittip</column-name><column-value><![CDATA[");
		sb.append(getEdittip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>edittitlecss</column-name><column-value><![CDATA[");
		sb.append(getEdittitlecss());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>editvaluecss</column-name><column-value><![CDATA[");
		sb.append(getEditvaluecss());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>editcss</column-name><column-value><![CDATA[");
		sb.append(getEditcss());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>editcolumnwidth</column-name><column-value><![CDATA[");
		sb.append(getEditcolumnwidth());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ParameterConfiguration.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ParameterConfiguration.class
		};
	private long _parameterconfigurationId;
	private String _displaynameshort;
	private String _displaynamelong;
	private String _datatype;
	private String _group;
	private String _tab;
	private boolean _summery;
	private String _viewscript;
	private boolean _viewvisible;
	private String _viewtip;
	private String _viewtitlecss;
	private String _viewvaluecss;
	private String _viewcss;
	private String _editscript;
	private boolean _editvisible;
	private String _edittip;
	private String _edittitlecss;
	private String _editvaluecss;
	private String _editcss;
	private long _editcolumnwidth;
	private ParameterConfiguration _escapedModel;
}