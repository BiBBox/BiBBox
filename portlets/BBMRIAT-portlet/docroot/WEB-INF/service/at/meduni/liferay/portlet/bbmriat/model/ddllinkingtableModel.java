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

package at.meduni.liferay.portlet.bbmriat.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ddllinkingtable service. Represents a row in the &quot;bbmriat.ddllinkingtable&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link at.meduni.liferay.portlet.bbmriat.model.impl.ddllinkingtableModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link at.meduni.liferay.portlet.bbmriat.model.impl.ddllinkingtableImpl}.
 * </p>
 *
 * @author Robert Reihs
 * @see ddllinkingtable
 * @see at.meduni.liferay.portlet.bbmriat.model.impl.ddllinkingtableImpl
 * @see at.meduni.liferay.portlet.bbmriat.model.impl.ddllinkingtableModelImpl
 * @generated
 */
public interface ddllinkingtableModel extends BaseModel<ddllinkingtable> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ddllinkingtable model instance should use the {@link ddllinkingtable} interface instead.
	 */

	/**
	 * Returns the primary key of this ddllinkingtable.
	 *
	 * @return the primary key of this ddllinkingtable
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ddllinkingtable.
	 *
	 * @param primaryKey the primary key of this ddllinkingtable
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ddllinkingtable of this ddllinkingtable.
	 *
	 * @return the ddllinkingtable of this ddllinkingtable
	 */
	public long getDdllinkingtable();

	/**
	 * Sets the ddllinkingtable of this ddllinkingtable.
	 *
	 * @param ddllinkingtable the ddllinkingtable of this ddllinkingtable
	 */
	public void setDdllinkingtable(long ddllinkingtable);

	/**
	 * Returns the recordid of this ddllinkingtable.
	 *
	 * @return the recordid of this ddllinkingtable
	 */
	public long getRecordid();

	/**
	 * Sets the recordid of this ddllinkingtable.
	 *
	 * @param recordid the recordid of this ddllinkingtable
	 */
	public void setRecordid(long recordid);

	/**
	 * Returns the recordsetid of this ddllinkingtable.
	 *
	 * @return the recordsetid of this ddllinkingtable
	 */
	public long getRecordsetid();

	/**
	 * Sets the recordsetid of this ddllinkingtable.
	 *
	 * @param recordsetid the recordsetid of this ddllinkingtable
	 */
	public void setRecordsetid(long recordsetid);

	/**
	 * Returns the linkrecordid of this ddllinkingtable.
	 *
	 * @return the linkrecordid of this ddllinkingtable
	 */
	public long getLinkrecordid();

	/**
	 * Sets the linkrecordid of this ddllinkingtable.
	 *
	 * @param linkrecordid the linkrecordid of this ddllinkingtable
	 */
	public void setLinkrecordid(long linkrecordid);

	/**
	 * Returns the linkrecordsetid of this ddllinkingtable.
	 *
	 * @return the linkrecordsetid of this ddllinkingtable
	 */
	public long getLinkrecordsetid();

	/**
	 * Sets the linkrecordsetid of this ddllinkingtable.
	 *
	 * @param linkrecordsetid the linkrecordsetid of this ddllinkingtable
	 */
	public void setLinkrecordsetid(long linkrecordsetid);

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
	public int compareTo(ddllinkingtable ddllinkingtable);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ddllinkingtable> toCacheModel();

	@Override
	public ddllinkingtable toEscapedModel();

	@Override
	public ddllinkingtable toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}