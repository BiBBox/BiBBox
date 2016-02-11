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

package at.graz.meduni.liferay.portlet.bibbox.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ImporterConfig service. Represents a row in the &quot;rdconnect.importerconfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link at.graz.meduni.liferay.portlet.bibbox.service.model.impl.ImporterConfigModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link at.graz.meduni.liferay.portlet.bibbox.service.model.impl.ImporterConfigImpl}.
 * </p>
 *
 * @author reihsr
 * @see ImporterConfig
 * @see at.graz.meduni.liferay.portlet.bibbox.service.model.impl.ImporterConfigImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.service.model.impl.ImporterConfigModelImpl
 * @generated
 */
public interface ImporterConfigModel extends BaseModel<ImporterConfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a importer config model instance should use the {@link ImporterConfig} interface instead.
	 */

	/**
	 * Returns the primary key of this importer config.
	 *
	 * @return the primary key of this importer config
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this importer config.
	 *
	 * @param primaryKey the primary key of this importer config
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the importerconfig ID of this importer config.
	 *
	 * @return the importerconfig ID of this importer config
	 */
	public long getImporterconfigId();

	/**
	 * Sets the importerconfig ID of this importer config.
	 *
	 * @param importerconfigId the importerconfig ID of this importer config
	 */
	public void setImporterconfigId(long importerconfigId);

	/**
	 * Returns the scope of this importer config.
	 *
	 * @return the scope of this importer config
	 */
	@AutoEscape
	public String getScope();

	/**
	 * Sets the scope of this importer config.
	 *
	 * @param scope the scope of this importer config
	 */
	public void setScope(String scope);

	/**
	 * Returns the element ID of this importer config.
	 *
	 * @return the element ID of this importer config
	 */
	@AutoEscape
	public String getElementId();

	/**
	 * Sets the element ID of this importer config.
	 *
	 * @param elementId the element ID of this importer config
	 */
	public void setElementId(String elementId);

	/**
	 * Returns the elementvalue of this importer config.
	 *
	 * @return the elementvalue of this importer config
	 */
	@AutoEscape
	public String getElementvalue();

	/**
	 * Sets the elementvalue of this importer config.
	 *
	 * @param elementvalue the elementvalue of this importer config
	 */
	public void setElementvalue(String elementvalue);

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
	public int compareTo(ImporterConfig importerConfig);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ImporterConfig> toCacheModel();

	@Override
	public ImporterConfig toEscapedModel();

	@Override
	public ImporterConfig toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}