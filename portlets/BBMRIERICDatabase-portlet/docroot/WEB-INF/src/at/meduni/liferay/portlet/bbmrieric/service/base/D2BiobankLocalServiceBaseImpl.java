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

package at.meduni.liferay.portlet.bbmrieric.service.base;

import at.meduni.liferay.portlet.bbmrieric.model.D2Biobank;
import at.meduni.liferay.portlet.bbmrieric.service.D2BiobankLocalService;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.BioBankPersistence;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.ContactInformationPersistence;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.D2BiobankPersistence;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.D2CollectionPersistence;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.DiseaseDiscriptionPersistence;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.SearchIndexPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.portlet.asset.service.persistence.AssetEntryPersistence;
import com.liferay.portlet.asset.service.persistence.AssetLinkPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the d2 biobank local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link at.meduni.liferay.portlet.bbmrieric.service.impl.D2BiobankLocalServiceImpl}.
 * </p>
 *
 * @author reihsr
 * @see at.meduni.liferay.portlet.bbmrieric.service.impl.D2BiobankLocalServiceImpl
 * @see at.meduni.liferay.portlet.bbmrieric.service.D2BiobankLocalServiceUtil
 * @generated
 */
public abstract class D2BiobankLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements D2BiobankLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link at.meduni.liferay.portlet.bbmrieric.service.D2BiobankLocalServiceUtil} to access the d2 biobank local service.
	 */

	/**
	 * Adds the d2 biobank to the database. Also notifies the appropriate model listeners.
	 *
	 * @param d2Biobank the d2 biobank
	 * @return the d2 biobank that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public D2Biobank addD2Biobank(D2Biobank d2Biobank)
		throws SystemException {
		d2Biobank.setNew(true);

		return d2BiobankPersistence.update(d2Biobank);
	}

	/**
	 * Creates a new d2 biobank with the primary key. Does not add the d2 biobank to the database.
	 *
	 * @param biobankId the primary key for the new d2 biobank
	 * @return the new d2 biobank
	 */
	@Override
	public D2Biobank createD2Biobank(long biobankId) {
		return d2BiobankPersistence.create(biobankId);
	}

	/**
	 * Deletes the d2 biobank with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param biobankId the primary key of the d2 biobank
	 * @return the d2 biobank that was removed
	 * @throws PortalException if a d2 biobank with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public D2Biobank deleteD2Biobank(long biobankId)
		throws PortalException, SystemException {
		return d2BiobankPersistence.remove(biobankId);
	}

	/**
	 * Deletes the d2 biobank from the database. Also notifies the appropriate model listeners.
	 *
	 * @param d2Biobank the d2 biobank
	 * @return the d2 biobank that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public D2Biobank deleteD2Biobank(D2Biobank d2Biobank)
		throws SystemException {
		return d2BiobankPersistence.remove(d2Biobank);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(D2Biobank.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return d2BiobankPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2BiobankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return d2BiobankPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2BiobankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return d2BiobankPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return d2BiobankPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return d2BiobankPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public D2Biobank fetchD2Biobank(long biobankId) throws SystemException {
		return d2BiobankPersistence.fetchByPrimaryKey(biobankId);
	}

	/**
	 * Returns the d2 biobank with the matching UUID and company.
	 *
	 * @param uuid the d2 biobank's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching d2 biobank, or <code>null</code> if a matching d2 biobank could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public D2Biobank fetchD2BiobankByUuidAndCompanyId(String uuid,
		long companyId) throws SystemException {
		return d2BiobankPersistence.fetchByUuid_C_First(uuid, companyId, null);
	}

	/**
	 * Returns the d2 biobank matching the UUID and group.
	 *
	 * @param uuid the d2 biobank's UUID
	 * @param groupId the primary key of the group
	 * @return the matching d2 biobank, or <code>null</code> if a matching d2 biobank could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public D2Biobank fetchD2BiobankByUuidAndGroupId(String uuid, long groupId)
		throws SystemException {
		return d2BiobankPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the d2 biobank with the primary key.
	 *
	 * @param biobankId the primary key of the d2 biobank
	 * @return the d2 biobank
	 * @throws PortalException if a d2 biobank with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public D2Biobank getD2Biobank(long biobankId)
		throws PortalException, SystemException {
		return d2BiobankPersistence.findByPrimaryKey(biobankId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return d2BiobankPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns the d2 biobank with the matching UUID and company.
	 *
	 * @param uuid the d2 biobank's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching d2 biobank
	 * @throws PortalException if a matching d2 biobank could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public D2Biobank getD2BiobankByUuidAndCompanyId(String uuid, long companyId)
		throws PortalException, SystemException {
		return d2BiobankPersistence.findByUuid_C_First(uuid, companyId, null);
	}

	/**
	 * Returns the d2 biobank matching the UUID and group.
	 *
	 * @param uuid the d2 biobank's UUID
	 * @param groupId the primary key of the group
	 * @return the matching d2 biobank
	 * @throws PortalException if a matching d2 biobank could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public D2Biobank getD2BiobankByUuidAndGroupId(String uuid, long groupId)
		throws PortalException, SystemException {
		return d2BiobankPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the d2 biobanks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2BiobankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of d2 biobanks
	 * @param end the upper bound of the range of d2 biobanks (not inclusive)
	 * @return the range of d2 biobanks
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<D2Biobank> getD2Biobanks(int start, int end)
		throws SystemException {
		return d2BiobankPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of d2 biobanks.
	 *
	 * @return the number of d2 biobanks
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getD2BiobanksCount() throws SystemException {
		return d2BiobankPersistence.countAll();
	}

	/**
	 * Updates the d2 biobank in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param d2Biobank the d2 biobank
	 * @return the d2 biobank that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public D2Biobank updateD2Biobank(D2Biobank d2Biobank)
		throws SystemException {
		return d2BiobankPersistence.update(d2Biobank);
	}

	/**
	 * Returns the bio bank local service.
	 *
	 * @return the bio bank local service
	 */
	public at.meduni.liferay.portlet.bbmrieric.service.BioBankLocalService getBioBankLocalService() {
		return bioBankLocalService;
	}

	/**
	 * Sets the bio bank local service.
	 *
	 * @param bioBankLocalService the bio bank local service
	 */
	public void setBioBankLocalService(
		at.meduni.liferay.portlet.bbmrieric.service.BioBankLocalService bioBankLocalService) {
		this.bioBankLocalService = bioBankLocalService;
	}

	/**
	 * Returns the bio bank persistence.
	 *
	 * @return the bio bank persistence
	 */
	public BioBankPersistence getBioBankPersistence() {
		return bioBankPersistence;
	}

	/**
	 * Sets the bio bank persistence.
	 *
	 * @param bioBankPersistence the bio bank persistence
	 */
	public void setBioBankPersistence(BioBankPersistence bioBankPersistence) {
		this.bioBankPersistence = bioBankPersistence;
	}

	/**
	 * Returns the contact information local service.
	 *
	 * @return the contact information local service
	 */
	public at.meduni.liferay.portlet.bbmrieric.service.ContactInformationLocalService getContactInformationLocalService() {
		return contactInformationLocalService;
	}

	/**
	 * Sets the contact information local service.
	 *
	 * @param contactInformationLocalService the contact information local service
	 */
	public void setContactInformationLocalService(
		at.meduni.liferay.portlet.bbmrieric.service.ContactInformationLocalService contactInformationLocalService) {
		this.contactInformationLocalService = contactInformationLocalService;
	}

	/**
	 * Returns the contact information persistence.
	 *
	 * @return the contact information persistence
	 */
	public ContactInformationPersistence getContactInformationPersistence() {
		return contactInformationPersistence;
	}

	/**
	 * Sets the contact information persistence.
	 *
	 * @param contactInformationPersistence the contact information persistence
	 */
	public void setContactInformationPersistence(
		ContactInformationPersistence contactInformationPersistence) {
		this.contactInformationPersistence = contactInformationPersistence;
	}

	/**
	 * Returns the d2 biobank local service.
	 *
	 * @return the d2 biobank local service
	 */
	public at.meduni.liferay.portlet.bbmrieric.service.D2BiobankLocalService getD2BiobankLocalService() {
		return d2BiobankLocalService;
	}

	/**
	 * Sets the d2 biobank local service.
	 *
	 * @param d2BiobankLocalService the d2 biobank local service
	 */
	public void setD2BiobankLocalService(
		at.meduni.liferay.portlet.bbmrieric.service.D2BiobankLocalService d2BiobankLocalService) {
		this.d2BiobankLocalService = d2BiobankLocalService;
	}

	/**
	 * Returns the d2 biobank persistence.
	 *
	 * @return the d2 biobank persistence
	 */
	public D2BiobankPersistence getD2BiobankPersistence() {
		return d2BiobankPersistence;
	}

	/**
	 * Sets the d2 biobank persistence.
	 *
	 * @param d2BiobankPersistence the d2 biobank persistence
	 */
	public void setD2BiobankPersistence(
		D2BiobankPersistence d2BiobankPersistence) {
		this.d2BiobankPersistence = d2BiobankPersistence;
	}

	/**
	 * Returns the d2 collection local service.
	 *
	 * @return the d2 collection local service
	 */
	public at.meduni.liferay.portlet.bbmrieric.service.D2CollectionLocalService getD2CollectionLocalService() {
		return d2CollectionLocalService;
	}

	/**
	 * Sets the d2 collection local service.
	 *
	 * @param d2CollectionLocalService the d2 collection local service
	 */
	public void setD2CollectionLocalService(
		at.meduni.liferay.portlet.bbmrieric.service.D2CollectionLocalService d2CollectionLocalService) {
		this.d2CollectionLocalService = d2CollectionLocalService;
	}

	/**
	 * Returns the d2 collection persistence.
	 *
	 * @return the d2 collection persistence
	 */
	public D2CollectionPersistence getD2CollectionPersistence() {
		return d2CollectionPersistence;
	}

	/**
	 * Sets the d2 collection persistence.
	 *
	 * @param d2CollectionPersistence the d2 collection persistence
	 */
	public void setD2CollectionPersistence(
		D2CollectionPersistence d2CollectionPersistence) {
		this.d2CollectionPersistence = d2CollectionPersistence;
	}

	/**
	 * Returns the disease discription local service.
	 *
	 * @return the disease discription local service
	 */
	public at.meduni.liferay.portlet.bbmrieric.service.DiseaseDiscriptionLocalService getDiseaseDiscriptionLocalService() {
		return diseaseDiscriptionLocalService;
	}

	/**
	 * Sets the disease discription local service.
	 *
	 * @param diseaseDiscriptionLocalService the disease discription local service
	 */
	public void setDiseaseDiscriptionLocalService(
		at.meduni.liferay.portlet.bbmrieric.service.DiseaseDiscriptionLocalService diseaseDiscriptionLocalService) {
		this.diseaseDiscriptionLocalService = diseaseDiscriptionLocalService;
	}

	/**
	 * Returns the disease discription persistence.
	 *
	 * @return the disease discription persistence
	 */
	public DiseaseDiscriptionPersistence getDiseaseDiscriptionPersistence() {
		return diseaseDiscriptionPersistence;
	}

	/**
	 * Sets the disease discription persistence.
	 *
	 * @param diseaseDiscriptionPersistence the disease discription persistence
	 */
	public void setDiseaseDiscriptionPersistence(
		DiseaseDiscriptionPersistence diseaseDiscriptionPersistence) {
		this.diseaseDiscriptionPersistence = diseaseDiscriptionPersistence;
	}

	/**
	 * Returns the search index local service.
	 *
	 * @return the search index local service
	 */
	public at.meduni.liferay.portlet.bbmrieric.service.SearchIndexLocalService getSearchIndexLocalService() {
		return searchIndexLocalService;
	}

	/**
	 * Sets the search index local service.
	 *
	 * @param searchIndexLocalService the search index local service
	 */
	public void setSearchIndexLocalService(
		at.meduni.liferay.portlet.bbmrieric.service.SearchIndexLocalService searchIndexLocalService) {
		this.searchIndexLocalService = searchIndexLocalService;
	}

	/**
	 * Returns the search index persistence.
	 *
	 * @return the search index persistence
	 */
	public SearchIndexPersistence getSearchIndexPersistence() {
		return searchIndexPersistence;
	}

	/**
	 * Sets the search index persistence.
	 *
	 * @param searchIndexPersistence the search index persistence
	 */
	public void setSearchIndexPersistence(
		SearchIndexPersistence searchIndexPersistence) {
		this.searchIndexPersistence = searchIndexPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Returns the asset entry local service.
	 *
	 * @return the asset entry local service
	 */
	public com.liferay.portlet.asset.service.AssetEntryLocalService getAssetEntryLocalService() {
		return assetEntryLocalService;
	}

	/**
	 * Sets the asset entry local service.
	 *
	 * @param assetEntryLocalService the asset entry local service
	 */
	public void setAssetEntryLocalService(
		com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService) {
		this.assetEntryLocalService = assetEntryLocalService;
	}

	/**
	 * Returns the asset entry remote service.
	 *
	 * @return the asset entry remote service
	 */
	public com.liferay.portlet.asset.service.AssetEntryService getAssetEntryService() {
		return assetEntryService;
	}

	/**
	 * Sets the asset entry remote service.
	 *
	 * @param assetEntryService the asset entry remote service
	 */
	public void setAssetEntryService(
		com.liferay.portlet.asset.service.AssetEntryService assetEntryService) {
		this.assetEntryService = assetEntryService;
	}

	/**
	 * Returns the asset entry persistence.
	 *
	 * @return the asset entry persistence
	 */
	public AssetEntryPersistence getAssetEntryPersistence() {
		return assetEntryPersistence;
	}

	/**
	 * Sets the asset entry persistence.
	 *
	 * @param assetEntryPersistence the asset entry persistence
	 */
	public void setAssetEntryPersistence(
		AssetEntryPersistence assetEntryPersistence) {
		this.assetEntryPersistence = assetEntryPersistence;
	}

	/**
	 * Returns the asset link local service.
	 *
	 * @return the asset link local service
	 */
	public com.liferay.portlet.asset.service.AssetLinkLocalService getAssetLinkLocalService() {
		return assetLinkLocalService;
	}

	/**
	 * Sets the asset link local service.
	 *
	 * @param assetLinkLocalService the asset link local service
	 */
	public void setAssetLinkLocalService(
		com.liferay.portlet.asset.service.AssetLinkLocalService assetLinkLocalService) {
		this.assetLinkLocalService = assetLinkLocalService;
	}

	/**
	 * Returns the asset link persistence.
	 *
	 * @return the asset link persistence
	 */
	public AssetLinkPersistence getAssetLinkPersistence() {
		return assetLinkPersistence;
	}

	/**
	 * Sets the asset link persistence.
	 *
	 * @param assetLinkPersistence the asset link persistence
	 */
	public void setAssetLinkPersistence(
		AssetLinkPersistence assetLinkPersistence) {
		this.assetLinkPersistence = assetLinkPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("at.meduni.liferay.portlet.bbmrieric.model.D2Biobank",
			d2BiobankLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"at.meduni.liferay.portlet.bbmrieric.model.D2Biobank");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return D2Biobank.class;
	}

	protected String getModelClassName() {
		return D2Biobank.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = d2BiobankPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = at.meduni.liferay.portlet.bbmrieric.service.BioBankLocalService.class)
	protected at.meduni.liferay.portlet.bbmrieric.service.BioBankLocalService bioBankLocalService;
	@BeanReference(type = BioBankPersistence.class)
	protected BioBankPersistence bioBankPersistence;
	@BeanReference(type = at.meduni.liferay.portlet.bbmrieric.service.ContactInformationLocalService.class)
	protected at.meduni.liferay.portlet.bbmrieric.service.ContactInformationLocalService contactInformationLocalService;
	@BeanReference(type = ContactInformationPersistence.class)
	protected ContactInformationPersistence contactInformationPersistence;
	@BeanReference(type = at.meduni.liferay.portlet.bbmrieric.service.D2BiobankLocalService.class)
	protected at.meduni.liferay.portlet.bbmrieric.service.D2BiobankLocalService d2BiobankLocalService;
	@BeanReference(type = D2BiobankPersistence.class)
	protected D2BiobankPersistence d2BiobankPersistence;
	@BeanReference(type = at.meduni.liferay.portlet.bbmrieric.service.D2CollectionLocalService.class)
	protected at.meduni.liferay.portlet.bbmrieric.service.D2CollectionLocalService d2CollectionLocalService;
	@BeanReference(type = D2CollectionPersistence.class)
	protected D2CollectionPersistence d2CollectionPersistence;
	@BeanReference(type = at.meduni.liferay.portlet.bbmrieric.service.DiseaseDiscriptionLocalService.class)
	protected at.meduni.liferay.portlet.bbmrieric.service.DiseaseDiscriptionLocalService diseaseDiscriptionLocalService;
	@BeanReference(type = DiseaseDiscriptionPersistence.class)
	protected DiseaseDiscriptionPersistence diseaseDiscriptionPersistence;
	@BeanReference(type = at.meduni.liferay.portlet.bbmrieric.service.SearchIndexLocalService.class)
	protected at.meduni.liferay.portlet.bbmrieric.service.SearchIndexLocalService searchIndexLocalService;
	@BeanReference(type = SearchIndexPersistence.class)
	protected SearchIndexPersistence searchIndexPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@BeanReference(type = com.liferay.portlet.asset.service.AssetEntryLocalService.class)
	protected com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService;
	@BeanReference(type = com.liferay.portlet.asset.service.AssetEntryService.class)
	protected com.liferay.portlet.asset.service.AssetEntryService assetEntryService;
	@BeanReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;
	@BeanReference(type = com.liferay.portlet.asset.service.AssetLinkLocalService.class)
	protected com.liferay.portlet.asset.service.AssetLinkLocalService assetLinkLocalService;
	@BeanReference(type = AssetLinkPersistence.class)
	protected AssetLinkPersistence assetLinkPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private D2BiobankLocalServiceClpInvoker _clpInvoker = new D2BiobankLocalServiceClpInvoker();
}