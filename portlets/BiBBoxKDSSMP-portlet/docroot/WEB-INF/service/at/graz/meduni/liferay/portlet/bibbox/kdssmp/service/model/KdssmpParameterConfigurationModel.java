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

package at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the KdssmpParameterConfiguration service. Represents a row in the &quot;kdssmp.parameterconfiguration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.impl.KdssmpParameterConfigurationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.impl.KdssmpParameterConfigurationImpl}.
 * </p>
 *
 * @author reihsr
 * @see KdssmpParameterConfiguration
 * @see at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.impl.KdssmpParameterConfigurationImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.impl.KdssmpParameterConfigurationModelImpl
 * @generated
 */
public interface KdssmpParameterConfigurationModel extends BaseModel<KdssmpParameterConfiguration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a kdssmp parameter configuration model instance should use the {@link KdssmpParameterConfiguration} interface instead.
	 */

	/**
	 * Returns the primary key of this kdssmp parameter configuration.
	 *
	 * @return the primary key of this kdssmp parameter configuration
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kdssmp parameter configuration.
	 *
	 * @param primaryKey the primary key of this kdssmp parameter configuration
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the parameterconfiguration ID of this kdssmp parameter configuration.
	 *
	 * @return the parameterconfiguration ID of this kdssmp parameter configuration
	 */
	public long getParameterconfigurationId();

	/**
	 * Sets the parameterconfiguration ID of this kdssmp parameter configuration.
	 *
	 * @param parameterconfigurationId the parameterconfiguration ID of this kdssmp parameter configuration
	 */
	public void setParameterconfigurationId(long parameterconfigurationId);

	/**
	 * Returns the displayname of this kdssmp parameter configuration.
	 *
	 * @return the displayname of this kdssmp parameter configuration
	 */
	@AutoEscape
	public String getDisplayname();

	/**
	 * Sets the displayname of this kdssmp parameter configuration.
	 *
	 * @param displayname the displayname of this kdssmp parameter configuration
	 */
	public void setDisplayname(String displayname);

	/**
	 * Returns the datatype of this kdssmp parameter configuration.
	 *
	 * @return the datatype of this kdssmp parameter configuration
	 */
	@AutoEscape
	public String getDatatype();

	/**
	 * Sets the datatype of this kdssmp parameter configuration.
	 *
	 * @param datatype the datatype of this kdssmp parameter configuration
	 */
	public void setDatatype(String datatype);

	/**
	 * Returns the valuerange of this kdssmp parameter configuration.
	 *
	 * @return the valuerange of this kdssmp parameter configuration
	 */
	@AutoEscape
	public String getValuerange();

	/**
	 * Sets the valuerange of this kdssmp parameter configuration.
	 *
	 * @param valuerange the valuerange of this kdssmp parameter configuration
	 */
	public void setValuerange(String valuerange);

	/**
	 * Returns the displayoptions of this kdssmp parameter configuration.
	 *
	 * @return the displayoptions of this kdssmp parameter configuration
	 */
	@AutoEscape
	public String getDisplayoptions();

	/**
	 * Sets the displayoptions of this kdssmp parameter configuration.
	 *
	 * @param displayoptions the displayoptions of this kdssmp parameter configuration
	 */
	public void setDisplayoptions(String displayoptions);

	/**
	 * Returns the visible of this kdssmp parameter configuration.
	 *
	 * @return the visible of this kdssmp parameter configuration
	 */
	public boolean getVisible();

	/**
	 * Returns <code>true</code> if this kdssmp parameter configuration is visible.
	 *
	 * @return <code>true</code> if this kdssmp parameter configuration is visible; <code>false</code> otherwise
	 */
	public boolean isVisible();

	/**
	 * Sets whether this kdssmp parameter configuration is visible.
	 *
	 * @param visible the visible of this kdssmp parameter configuration
	 */
	public void setVisible(boolean visible);

	/**
	 * Returns the computed of this kdssmp parameter configuration.
	 *
	 * @return the computed of this kdssmp parameter configuration
	 */
	public boolean getComputed();

	/**
	 * Returns <code>true</code> if this kdssmp parameter configuration is computed.
	 *
	 * @return <code>true</code> if this kdssmp parameter configuration is computed; <code>false</code> otherwise
	 */
	public boolean isComputed();

	/**
	 * Sets whether this kdssmp parameter configuration is computed.
	 *
	 * @param computed the computed of this kdssmp parameter configuration
	 */
	public void setComputed(boolean computed);

	/**
	 * Returns the confirmationscript of this kdssmp parameter configuration.
	 *
	 * @return the confirmationscript of this kdssmp parameter configuration
	 */
	@AutoEscape
	public String getConfirmationscript();

	/**
	 * Sets the confirmationscript of this kdssmp parameter configuration.
	 *
	 * @param confirmationscript the confirmationscript of this kdssmp parameter configuration
	 */
	public void setConfirmationscript(String confirmationscript);

	/**
	 * Returns the grouping of this kdssmp parameter configuration.
	 *
	 * @return the grouping of this kdssmp parameter configuration
	 */
	@AutoEscape
	public String getGrouping();

	/**
	 * Sets the grouping of this kdssmp parameter configuration.
	 *
	 * @param grouping the grouping of this kdssmp parameter configuration
	 */
	public void setGrouping(String grouping);

	/**
	 * Returns the columnwidth of this kdssmp parameter configuration.
	 *
	 * @return the columnwidth of this kdssmp parameter configuration
	 */
	@AutoEscape
	public String getColumnwidth();

	/**
	 * Sets the columnwidth of this kdssmp parameter configuration.
	 *
	 * @param columnwidth the columnwidth of this kdssmp parameter configuration
	 */
	public void setColumnwidth(String columnwidth);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		KdssmpParameterConfiguration kdssmpParameterConfiguration);

	@Override
	public int hashCode();

	@Override
	public CacheModel<KdssmpParameterConfiguration> toCacheModel();

	@Override
	public KdssmpParameterConfiguration toEscapedModel();

	@Override
	public KdssmpParameterConfiguration toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}