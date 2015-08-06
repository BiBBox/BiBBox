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

package at.graz.hmmc.liferay.portlet.puch.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Configuration service. Represents a row in the &quot;puchmuseum_configuration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link at.graz.hmmc.liferay.portlet.puch.model.impl.ConfigurationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link at.graz.hmmc.liferay.portlet.puch.model.impl.ConfigurationImpl}.
 * </p>
 *
 * @author reihsr
 * @see Configuration
 * @see at.graz.hmmc.liferay.portlet.puch.model.impl.ConfigurationImpl
 * @see at.graz.hmmc.liferay.portlet.puch.model.impl.ConfigurationModelImpl
 * @generated
 */
public interface ConfigurationModel extends BaseModel<Configuration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a configuration model instance should use the {@link Configuration} interface instead.
	 */

	/**
	 * Returns the primary key of this configuration.
	 *
	 * @return the primary key of this configuration
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this configuration.
	 *
	 * @param primaryKey the primary key of this configuration
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the configuration ID of this configuration.
	 *
	 * @return the configuration ID of this configuration
	 */
	public long getConfigurationId();

	/**
	 * Sets the configuration ID of this configuration.
	 *
	 * @param configurationId the configuration ID of this configuration
	 */
	public void setConfigurationId(long configurationId);

	/**
	 * Returns the scope of this configuration.
	 *
	 * @return the scope of this configuration
	 */
	@AutoEscape
	public String getScope();

	/**
	 * Sets the scope of this configuration.
	 *
	 * @param scope the scope of this configuration
	 */
	public void setScope(String scope);

	/**
	 * Returns the optionkey of this configuration.
	 *
	 * @return the optionkey of this configuration
	 */
	@AutoEscape
	public String getOptionkey();

	/**
	 * Sets the optionkey of this configuration.
	 *
	 * @param optionkey the optionkey of this configuration
	 */
	public void setOptionkey(String optionkey);

	/**
	 * Returns the optionvalue of this configuration.
	 *
	 * @return the optionvalue of this configuration
	 */
	@AutoEscape
	public String getOptionvalue();

	/**
	 * Sets the optionvalue of this configuration.
	 *
	 * @param optionvalue the optionvalue of this configuration
	 */
	public void setOptionvalue(String optionvalue);

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
	public int compareTo(Configuration configuration);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Configuration> toCacheModel();

	@Override
	public Configuration toEscapedModel();

	@Override
	public Configuration toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}