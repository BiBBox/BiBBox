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
 * The base model interface for the Dictionary service. Represents a row in the &quot;saat_dictionary&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link at.graz.meduni.liferay.portlet.saat.model.impl.DictionaryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link at.graz.meduni.liferay.portlet.saat.model.impl.DictionaryImpl}.
 * </p>
 *
 * @author reihsr
 * @see Dictionary
 * @see at.graz.meduni.liferay.portlet.saat.model.impl.DictionaryImpl
 * @see at.graz.meduni.liferay.portlet.saat.model.impl.DictionaryModelImpl
 * @generated
 */
public interface DictionaryModel extends BaseModel<Dictionary> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dictionary model instance should use the {@link Dictionary} interface instead.
	 */

	/**
	 * Returns the primary key of this dictionary.
	 *
	 * @return the primary key of this dictionary
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dictionary.
	 *
	 * @param primaryKey the primary key of this dictionary
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the dictionary ID of this dictionary.
	 *
	 * @return the dictionary ID of this dictionary
	 */
	public long getDictionaryId();

	/**
	 * Sets the dictionary ID of this dictionary.
	 *
	 * @param dictionaryId the dictionary ID of this dictionary
	 */
	public void setDictionaryId(long dictionaryId);

	/**
	 * Returns the synonym of this dictionary.
	 *
	 * @return the synonym of this dictionary
	 */
	@AutoEscape
	public String getSynonym();

	/**
	 * Sets the synonym of this dictionary.
	 *
	 * @param synonym the synonym of this dictionary
	 */
	public void setSynonym(String synonym);

	/**
	 * Returns the before_synonym of this dictionary.
	 *
	 * @return the before_synonym of this dictionary
	 */
	public int getBefore_synonym();

	/**
	 * Sets the before_synonym of this dictionary.
	 *
	 * @param before_synonym the before_synonym of this dictionary
	 */
	public void setBefore_synonym(int before_synonym);

	/**
	 * Returns the after_synonym of this dictionary.
	 *
	 * @return the after_synonym of this dictionary
	 */
	public int getAfter_synonym();

	/**
	 * Sets the after_synonym of this dictionary.
	 *
	 * @param after_synonym the after_synonym of this dictionary
	 */
	public void setAfter_synonym(int after_synonym);

	/**
	 * Returns the foreword of this dictionary.
	 *
	 * @return the foreword of this dictionary
	 */
	public boolean getForeword();

	/**
	 * Returns <code>true</code> if this dictionary is foreword.
	 *
	 * @return <code>true</code> if this dictionary is foreword; <code>false</code> otherwise
	 */
	public boolean isForeword();

	/**
	 * Sets whether this dictionary is foreword.
	 *
	 * @param foreword the foreword of this dictionary
	 */
	public void setForeword(boolean foreword);

	/**
	 * Returns the ending of this dictionary.
	 *
	 * @return the ending of this dictionary
	 */
	public boolean getEnding();

	/**
	 * Returns <code>true</code> if this dictionary is ending.
	 *
	 * @return <code>true</code> if this dictionary is ending; <code>false</code> otherwise
	 */
	public boolean isEnding();

	/**
	 * Sets whether this dictionary is ending.
	 *
	 * @param ending the ending of this dictionary
	 */
	public void setEnding(boolean ending);

	/**
	 * Returns the sentence of this dictionary.
	 *
	 * @return the sentence of this dictionary
	 */
	public boolean getSentence();

	/**
	 * Returns <code>true</code> if this dictionary is sentence.
	 *
	 * @return <code>true</code> if this dictionary is sentence; <code>false</code> otherwise
	 */
	public boolean isSentence();

	/**
	 * Sets whether this dictionary is sentence.
	 *
	 * @param sentence the sentence of this dictionary
	 */
	public void setSentence(boolean sentence);

	/**
	 * Returns the iscode of this dictionary.
	 *
	 * @return the iscode of this dictionary
	 */
	public boolean getIscode();

	/**
	 * Returns <code>true</code> if this dictionary is iscode.
	 *
	 * @return <code>true</code> if this dictionary is iscode; <code>false</code> otherwise
	 */
	public boolean isIscode();

	/**
	 * Sets whether this dictionary is iscode.
	 *
	 * @param iscode the iscode of this dictionary
	 */
	public void setIscode(boolean iscode);

	/**
	 * Returns the pattern of this dictionary.
	 *
	 * @return the pattern of this dictionary
	 */
	@AutoEscape
	public String getPattern();

	/**
	 * Sets the pattern of this dictionary.
	 *
	 * @param pattern the pattern of this dictionary
	 */
	public void setPattern(String pattern);

	/**
	 * Returns the code_typ of this dictionary.
	 *
	 * @return the code_typ of this dictionary
	 */
	@AutoEscape
	public String getCode_typ();

	/**
	 * Sets the code_typ of this dictionary.
	 *
	 * @param code_typ the code_typ of this dictionary
	 */
	public void setCode_typ(String code_typ);

	/**
	 * Returns the code_value of this dictionary.
	 *
	 * @return the code_value of this dictionary
	 */
	@AutoEscape
	public String getCode_value();

	/**
	 * Sets the code_value of this dictionary.
	 *
	 * @param code_value the code_value of this dictionary
	 */
	public void setCode_value(String code_value);

	/**
	 * Returns the root of this dictionary.
	 *
	 * @return the root of this dictionary
	 */
	public boolean getRoot();

	/**
	 * Returns <code>true</code> if this dictionary is root.
	 *
	 * @return <code>true</code> if this dictionary is root; <code>false</code> otherwise
	 */
	public boolean isRoot();

	/**
	 * Sets whether this dictionary is root.
	 *
	 * @param root the root of this dictionary
	 */
	public void setRoot(boolean root);

	/**
	 * Returns the negation of this dictionary.
	 *
	 * @return the negation of this dictionary
	 */
	public boolean getNegation();

	/**
	 * Returns <code>true</code> if this dictionary is negation.
	 *
	 * @return <code>true</code> if this dictionary is negation; <code>false</code> otherwise
	 */
	public boolean isNegation();

	/**
	 * Sets whether this dictionary is negation.
	 *
	 * @param negation the negation of this dictionary
	 */
	public void setNegation(boolean negation);

	/**
	 * Returns the occur of this dictionary.
	 *
	 * @return the occur of this dictionary
	 */
	public boolean getOccur();

	/**
	 * Returns <code>true</code> if this dictionary is occur.
	 *
	 * @return <code>true</code> if this dictionary is occur; <code>false</code> otherwise
	 */
	public boolean isOccur();

	/**
	 * Sets whether this dictionary is occur.
	 *
	 * @param occur the occur of this dictionary
	 */
	public void setOccur(boolean occur);

	/**
	 * Returns the disease_ids of this dictionary.
	 *
	 * @return the disease_ids of this dictionary
	 */
	@AutoEscape
	public String getDisease_ids();

	/**
	 * Sets the disease_ids of this dictionary.
	 *
	 * @param disease_ids the disease_ids of this dictionary
	 */
	public void setDisease_ids(String disease_ids);

	/**
	 * Returns the dirty of this dictionary.
	 *
	 * @return the dirty of this dictionary
	 */
	public boolean getDirty();

	/**
	 * Returns <code>true</code> if this dictionary is dirty.
	 *
	 * @return <code>true</code> if this dictionary is dirty; <code>false</code> otherwise
	 */
	public boolean isDirty();

	/**
	 * Sets whether this dictionary is dirty.
	 *
	 * @param dirty the dirty of this dictionary
	 */
	public void setDirty(boolean dirty);

	/**
	 * Returns the priority of this dictionary.
	 *
	 * @return the priority of this dictionary
	 */
	public int getPriority();

	/**
	 * Sets the priority of this dictionary.
	 *
	 * @param priority the priority of this dictionary
	 */
	public void setPriority(int priority);

	/**
	 * Returns the disease_ids_count of this dictionary.
	 *
	 * @return the disease_ids_count of this dictionary
	 */
	public int getDisease_ids_count();

	/**
	 * Sets the disease_ids_count of this dictionary.
	 *
	 * @param disease_ids_count the disease_ids_count of this dictionary
	 */
	public void setDisease_ids_count(int disease_ids_count);

	/**
	 * Returns the priority_mode of this dictionary.
	 *
	 * @return the priority_mode of this dictionary
	 */
	public boolean getPriority_mode();

	/**
	 * Returns <code>true</code> if this dictionary is priority_mode.
	 *
	 * @return <code>true</code> if this dictionary is priority_mode; <code>false</code> otherwise
	 */
	public boolean isPriority_mode();

	/**
	 * Sets whether this dictionary is priority_mode.
	 *
	 * @param priority_mode the priority_mode of this dictionary
	 */
	public void setPriority_mode(boolean priority_mode);

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
		at.graz.meduni.liferay.portlet.saat.model.Dictionary dictionary);

	@Override
	public int hashCode();

	@Override
	public CacheModel<at.graz.meduni.liferay.portlet.saat.model.Dictionary> toCacheModel();

	@Override
	public at.graz.meduni.liferay.portlet.saat.model.Dictionary toEscapedModel();

	@Override
	public at.graz.meduni.liferay.portlet.saat.model.Dictionary toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}