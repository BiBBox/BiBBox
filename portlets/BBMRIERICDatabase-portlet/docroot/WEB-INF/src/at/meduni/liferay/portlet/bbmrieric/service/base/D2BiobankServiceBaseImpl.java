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
import at.meduni.liferay.portlet.bbmrieric.service.D2BiobankService;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.BioBankPersistence;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.ContactInformationPersistence;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.D2BiobankNetworkLinkPersistence;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.D2BiobankNetworkPersistence;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.D2BiobankPersistence;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.D2CollectionPersistence;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.DiseaseDiscriptionPersistence;
import at.meduni.liferay.portlet.bbmrieric.service.persistence.SearchIndexPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.portlet.asset.service.persistence.AssetEntryPersistence;
import com.liferay.portlet.asset.service.persistence.AssetLinkPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the d2 biobank remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link at.meduni.liferay.portlet.bbmrieric.service.impl.D2BiobankServiceImpl}.
 * </p>
 *
 * @author reihsr
 * @see at.meduni.liferay.portlet.bbmrieric.service.impl.D2BiobankServiceImpl
 * @see at.meduni.liferay.portlet.bbmrieric.service.D2BiobankServiceUtil
 * @generated
 */
public abstract class D2BiobankServiceBaseImpl extends BaseServiceImpl
	implements D2BiobankService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link at.meduni.liferay.portlet.bbmrieric.service.D2BiobankServiceUtil} to access the d2 biobank remote service.
	 */

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
	 * Returns the d2 biobank remote service.
	 *
	 * @return the d2 biobank remote service
	 */
	public at.meduni.liferay.portlet.bbmrieric.service.D2BiobankService getD2BiobankService() {
		return d2BiobankService;
	}

	/**
	 * Sets the d2 biobank remote service.
	 *
	 * @param d2BiobankService the d2 biobank remote service
	 */
	public void setD2BiobankService(
		at.meduni.liferay.portlet.bbmrieric.service.D2BiobankService d2BiobankService) {
		this.d2BiobankService = d2BiobankService;
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
	 * Returns the d2 biobank network local service.
	 *
	 * @return the d2 biobank network local service
	 */
	public at.meduni.liferay.portlet.bbmrieric.service.D2BiobankNetworkLocalService getD2BiobankNetworkLocalService() {
		return d2BiobankNetworkLocalService;
	}

	/**
	 * Sets the d2 biobank network local service.
	 *
	 * @param d2BiobankNetworkLocalService the d2 biobank network local service
	 */
	public void setD2BiobankNetworkLocalService(
		at.meduni.liferay.portlet.bbmrieric.service.D2BiobankNetworkLocalService d2BiobankNetworkLocalService) {
		this.d2BiobankNetworkLocalService = d2BiobankNetworkLocalService;
	}

	/**
	 * Returns the d2 biobank network persistence.
	 *
	 * @return the d2 biobank network persistence
	 */
	public D2BiobankNetworkPersistence getD2BiobankNetworkPersistence() {
		return d2BiobankNetworkPersistence;
	}

	/**
	 * Sets the d2 biobank network persistence.
	 *
	 * @param d2BiobankNetworkPersistence the d2 biobank network persistence
	 */
	public void setD2BiobankNetworkPersistence(
		D2BiobankNetworkPersistence d2BiobankNetworkPersistence) {
		this.d2BiobankNetworkPersistence = d2BiobankNetworkPersistence;
	}

	/**
	 * Returns the d2 biobank network link local service.
	 *
	 * @return the d2 biobank network link local service
	 */
	public at.meduni.liferay.portlet.bbmrieric.service.D2BiobankNetworkLinkLocalService getD2BiobankNetworkLinkLocalService() {
		return d2BiobankNetworkLinkLocalService;
	}

	/**
	 * Sets the d2 biobank network link local service.
	 *
	 * @param d2BiobankNetworkLinkLocalService the d2 biobank network link local service
	 */
	public void setD2BiobankNetworkLinkLocalService(
		at.meduni.liferay.portlet.bbmrieric.service.D2BiobankNetworkLinkLocalService d2BiobankNetworkLinkLocalService) {
		this.d2BiobankNetworkLinkLocalService = d2BiobankNetworkLinkLocalService;
	}

	/**
	 * Returns the d2 biobank network link persistence.
	 *
	 * @return the d2 biobank network link persistence
	 */
	public D2BiobankNetworkLinkPersistence getD2BiobankNetworkLinkPersistence() {
		return d2BiobankNetworkLinkPersistence;
	}

	/**
	 * Sets the d2 biobank network link persistence.
	 *
	 * @param d2BiobankNetworkLinkPersistence the d2 biobank network link persistence
	 */
	public void setD2BiobankNetworkLinkPersistence(
		D2BiobankNetworkLinkPersistence d2BiobankNetworkLinkPersistence) {
		this.d2BiobankNetworkLinkPersistence = d2BiobankNetworkLinkPersistence;
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
	 * Returns the d2 collection remote service.
	 *
	 * @return the d2 collection remote service
	 */
	public at.meduni.liferay.portlet.bbmrieric.service.D2CollectionService getD2CollectionService() {
		return d2CollectionService;
	}

	/**
	 * Sets the d2 collection remote service.
	 *
	 * @param d2CollectionService the d2 collection remote service
	 */
	public void setD2CollectionService(
		at.meduni.liferay.portlet.bbmrieric.service.D2CollectionService d2CollectionService) {
		this.d2CollectionService = d2CollectionService;
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
	}

	public void destroy() {
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
	@BeanReference(type = at.meduni.liferay.portlet.bbmrieric.service.D2BiobankService.class)
	protected at.meduni.liferay.portlet.bbmrieric.service.D2BiobankService d2BiobankService;
	@BeanReference(type = D2BiobankPersistence.class)
	protected D2BiobankPersistence d2BiobankPersistence;
	@BeanReference(type = at.meduni.liferay.portlet.bbmrieric.service.D2BiobankNetworkLocalService.class)
	protected at.meduni.liferay.portlet.bbmrieric.service.D2BiobankNetworkLocalService d2BiobankNetworkLocalService;
	@BeanReference(type = D2BiobankNetworkPersistence.class)
	protected D2BiobankNetworkPersistence d2BiobankNetworkPersistence;
	@BeanReference(type = at.meduni.liferay.portlet.bbmrieric.service.D2BiobankNetworkLinkLocalService.class)
	protected at.meduni.liferay.portlet.bbmrieric.service.D2BiobankNetworkLinkLocalService d2BiobankNetworkLinkLocalService;
	@BeanReference(type = D2BiobankNetworkLinkPersistence.class)
	protected D2BiobankNetworkLinkPersistence d2BiobankNetworkLinkPersistence;
	@BeanReference(type = at.meduni.liferay.portlet.bbmrieric.service.D2CollectionLocalService.class)
	protected at.meduni.liferay.portlet.bbmrieric.service.D2CollectionLocalService d2CollectionLocalService;
	@BeanReference(type = at.meduni.liferay.portlet.bbmrieric.service.D2CollectionService.class)
	protected at.meduni.liferay.portlet.bbmrieric.service.D2CollectionService d2CollectionService;
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
	private D2BiobankServiceClpInvoker _clpInvoker = new D2BiobankServiceClpInvoker();
}