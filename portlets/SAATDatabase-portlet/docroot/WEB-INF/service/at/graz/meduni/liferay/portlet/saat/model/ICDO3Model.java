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

package at.graz.meduni.liferay.portlet.saat.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ICDO3 service. Represents a row in the &quot;saat_code_icdo3&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link at.graz.meduni.liferay.portlet.saat.model.impl.ICDO3ModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link at.graz.meduni.liferay.portlet.saat.model.impl.ICDO3Impl}.
 * </p>
 *
 * @author reihsr
 * @see ICDO3
 * @see at.graz.meduni.liferay.portlet.saat.model.impl.ICDO3Impl
 * @see at.graz.meduni.liferay.portlet.saat.model.impl.ICDO3ModelImpl
 * @generated
 */
public interface ICDO3Model extends BaseModel<ICDO3> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a i c d o3 model instance should use the {@link ICDO3} interface instead.
	 */

	/**
	 * Returns the primary key of this i c d o3.
	 *
	 * @return the primary key of this i c d o3
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this i c d o3.
	 *
	 * @param primaryKey the primary key of this i c d o3
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the icdo3 ID of this i c d o3.
	 *
	 * @return the icdo3 ID of this i c d o3
	 */
	public long getIcdo3Id();

	/**
	 * Sets the icdo3 ID of this i c d o3.
	 *
	 * @param icdo3Id the icdo3 ID of this i c d o3
	 */
	public void setIcdo3Id(long icdo3Id);

	/**
	 * Returns the code of this i c d o3.
	 *
	 * @return the code of this i c d o3
	 */
	@AutoEscape
	public String getCode();

	/**
	 * Sets the code of this i c d o3.
	 *
	 * @param code the code of this i c d o3
	 */
	public void setCode(String code);

	/**
	 * Returns the term of this i c d o3.
	 *
	 * @return the term of this i c d o3
	 */
	public int getTerm();

	/**
	 * Sets the term of this i c d o3.
	 *
	 * @param term the term of this i c d o3
	 */
	public void setTerm(int term);

	/**
	 * Returns the sui of this i c d o3.
	 *
	 * @return the sui of this i c d o3
	 */
	public int getSui();

	/**
	 * Sets the sui of this i c d o3.
	 *
	 * @param sui the sui of this i c d o3
	 */
	public void setSui(int sui);

	/**
	 * Returns the typ of this i c d o3.
	 *
	 * @return the typ of this i c d o3
	 */
	@AutoEscape
	public String getTyp();

	/**
	 * Sets the typ of this i c d o3.
	 *
	 * @param typ the typ of this i c d o3
	 */
	public void setTyp(String typ);

	/**
	 * Returns the use of this i c d o3.
	 *
	 * @return the use of this i c d o3
	 */
	@AutoEscape
	public String getUse();

	/**
	 * Sets the use of this i c d o3.
	 *
	 * @param use the use of this i c d o3
	 */
	public void setUse(String use);

	/**
	 * Returns the description of this i c d o3.
	 *
	 * @return the description of this i c d o3
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this i c d o3.
	 *
	 * @param description the description of this i c d o3
	 */
	public void setDescription(String description);

	/**
	 * Returns the localisation of this i c d o3.
	 *
	 * @return the localisation of this i c d o3
	 */
	@AutoEscape
	public String getLocalisation();

	/**
	 * Sets the localisation of this i c d o3.
	 *
	 * @param localisation the localisation of this i c d o3
	 */
	public void setLocalisation(String localisation);

	/**
	 * Returns the link of this i c d o3.
	 *
	 * @return the link of this i c d o3
	 */
	@AutoEscape
	public String getLink();

	/**
	 * Sets the link of this i c d o3.
	 *
	 * @param link the link of this i c d o3
	 */
	public void setLink(String link);

	/**
	 * Returns the exklusiva of this i c d o3.
	 *
	 * @return the exklusiva of this i c d o3
	 */
	@AutoEscape
	public String getExklusiva();

	/**
	 * Sets the exklusiva of this i c d o3.
	 *
	 * @param exklusiva the exklusiva of this i c d o3
	 */
	public void setExklusiva(String exklusiva);

	/**
	 * Returns the hint of this i c d o3.
	 *
	 * @return the hint of this i c d o3
	 */
	@AutoEscape
	public String getHint();

	/**
	 * Sets the hint of this i c d o3.
	 *
	 * @param hint the hint of this i c d o3
	 */
	public void setHint(String hint);

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
	public int compareTo(at.graz.meduni.liferay.portlet.saat.model.ICDO3 icdo3);

	@Override
	public int hashCode();

	@Override
	public CacheModel<at.graz.meduni.liferay.portlet.saat.model.ICDO3> toCacheModel();

	@Override
	public at.graz.meduni.liferay.portlet.saat.model.ICDO3 toEscapedModel();

	@Override
	public at.graz.meduni.liferay.portlet.saat.model.ICDO3 toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}