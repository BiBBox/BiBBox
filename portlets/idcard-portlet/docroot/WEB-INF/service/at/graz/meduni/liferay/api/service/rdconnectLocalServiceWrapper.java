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

package at.graz.meduni.liferay.api.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link rdconnectLocalService}.
 *
 * @author reihsr
 * @see rdconnectLocalService
 * @generated
 */
public class rdconnectLocalServiceWrapper implements rdconnectLocalService,
	ServiceWrapper<rdconnectLocalService> {
	public rdconnectLocalServiceWrapper(
		rdconnectLocalService rdconnectLocalService) {
		_rdconnectLocalService = rdconnectLocalService;
	}

	/**
	* Adds the rdconnect to the database. Also notifies the appropriate model listeners.
	*
	* @param rdconnect the rdconnect
	* @return the rdconnect that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public at.graz.meduni.liferay.api.model.rdconnect addrdconnect(
		at.graz.meduni.liferay.api.model.rdconnect rdconnect)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.addrdconnect(rdconnect);
	}

	/**
	* Creates a new rdconnect with the primary key. Does not add the rdconnect to the database.
	*
	* @param idcardapilogId the primary key for the new rdconnect
	* @return the new rdconnect
	*/
	@Override
	public at.graz.meduni.liferay.api.model.rdconnect createrdconnect(
		long idcardapilogId) {
		return _rdconnectLocalService.createrdconnect(idcardapilogId);
	}

	/**
	* Deletes the rdconnect with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idcardapilogId the primary key of the rdconnect
	* @return the rdconnect that was removed
	* @throws PortalException if a rdconnect with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public at.graz.meduni.liferay.api.model.rdconnect deleterdconnect(
		long idcardapilogId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.deleterdconnect(idcardapilogId);
	}

	/**
	* Deletes the rdconnect from the database. Also notifies the appropriate model listeners.
	*
	* @param rdconnect the rdconnect
	* @return the rdconnect that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public at.graz.meduni.liferay.api.model.rdconnect deleterdconnect(
		at.graz.meduni.liferay.api.model.rdconnect rdconnect)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.deleterdconnect(rdconnect);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rdconnectLocalService.dynamicQuery();
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.api.model.impl.rdconnectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.api.model.impl.rdconnectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.dynamicQueryCount(dynamicQuery);
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
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public at.graz.meduni.liferay.api.model.rdconnect fetchrdconnect(
		long idcardapilogId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.fetchrdconnect(idcardapilogId);
	}

	/**
	* Returns the rdconnect with the primary key.
	*
	* @param idcardapilogId the primary key of the rdconnect
	* @return the rdconnect
	* @throws PortalException if a rdconnect with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public at.graz.meduni.liferay.api.model.rdconnect getrdconnect(
		long idcardapilogId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.getrdconnect(idcardapilogId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the rdconnects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.api.model.impl.rdconnectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rdconnects
	* @param end the upper bound of the range of rdconnects (not inclusive)
	* @return the range of rdconnects
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<at.graz.meduni.liferay.api.model.rdconnect> getrdconnects(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.getrdconnects(start, end);
	}

	/**
	* Returns the number of rdconnects.
	*
	* @return the number of rdconnects
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getrdconnectsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.getrdconnectsCount();
	}

	/**
	* Updates the rdconnect in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rdconnect the rdconnect
	* @return the rdconnect that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public at.graz.meduni.liferay.api.model.rdconnect updaterdconnect(
		at.graz.meduni.liferay.api.model.rdconnect rdconnect)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rdconnectLocalService.updaterdconnect(rdconnect);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _rdconnectLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_rdconnectLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _rdconnectLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public rdconnectLocalService getWrappedrdconnectLocalService() {
		return _rdconnectLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedrdconnectLocalService(
		rdconnectLocalService rdconnectLocalService) {
		_rdconnectLocalService = rdconnectLocalService;
	}

	@Override
	public rdconnectLocalService getWrappedService() {
		return _rdconnectLocalService;
	}

	@Override
	public void setWrappedService(rdconnectLocalService rdconnectLocalService) {
		_rdconnectLocalService = rdconnectLocalService;
	}

	private rdconnectLocalService _rdconnectLocalService;
}