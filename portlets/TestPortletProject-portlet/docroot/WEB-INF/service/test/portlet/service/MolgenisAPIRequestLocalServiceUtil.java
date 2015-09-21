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

package test.portlet.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MolgenisAPIRequest. This utility wraps
 * {@link test.portlet.service.impl.MolgenisAPIRequestLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author reihsr
 * @see MolgenisAPIRequestLocalService
 * @see test.portlet.service.base.MolgenisAPIRequestLocalServiceBaseImpl
 * @see test.portlet.service.impl.MolgenisAPIRequestLocalServiceImpl
 * @generated
 */
public class MolgenisAPIRequestLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link test.portlet.service.impl.MolgenisAPIRequestLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the molgenis a p i request to the database. Also notifies the appropriate model listeners.
	*
	* @param molgenisAPIRequest the molgenis a p i request
	* @return the molgenis a p i request that was added
	* @throws SystemException if a system exception occurred
	*/
	public static test.portlet.model.MolgenisAPIRequest addMolgenisAPIRequest(
		test.portlet.model.MolgenisAPIRequest molgenisAPIRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMolgenisAPIRequest(molgenisAPIRequest);
	}

	/**
	* Creates a new molgenis a p i request with the primary key. Does not add the molgenis a p i request to the database.
	*
	* @param molgenisapirequestId the primary key for the new molgenis a p i request
	* @return the new molgenis a p i request
	*/
	public static test.portlet.model.MolgenisAPIRequest createMolgenisAPIRequest(
		long molgenisapirequestId) {
		return getService().createMolgenisAPIRequest(molgenisapirequestId);
	}

	/**
	* Deletes the molgenis a p i request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param molgenisapirequestId the primary key of the molgenis a p i request
	* @return the molgenis a p i request that was removed
	* @throws PortalException if a molgenis a p i request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static test.portlet.model.MolgenisAPIRequest deleteMolgenisAPIRequest(
		long molgenisapirequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMolgenisAPIRequest(molgenisapirequestId);
	}

	/**
	* Deletes the molgenis a p i request from the database. Also notifies the appropriate model listeners.
	*
	* @param molgenisAPIRequest the molgenis a p i request
	* @return the molgenis a p i request that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static test.portlet.model.MolgenisAPIRequest deleteMolgenisAPIRequest(
		test.portlet.model.MolgenisAPIRequest molgenisAPIRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMolgenisAPIRequest(molgenisAPIRequest);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link test.portlet.model.impl.MolgenisAPIRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link test.portlet.model.impl.MolgenisAPIRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static test.portlet.model.MolgenisAPIRequest fetchMolgenisAPIRequest(
		long molgenisapirequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMolgenisAPIRequest(molgenisapirequestId);
	}

	/**
	* Returns the molgenis a p i request with the primary key.
	*
	* @param molgenisapirequestId the primary key of the molgenis a p i request
	* @return the molgenis a p i request
	* @throws PortalException if a molgenis a p i request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static test.portlet.model.MolgenisAPIRequest getMolgenisAPIRequest(
		long molgenisapirequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMolgenisAPIRequest(molgenisapirequestId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the molgenis a p i requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link test.portlet.model.impl.MolgenisAPIRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of molgenis a p i requests
	* @param end the upper bound of the range of molgenis a p i requests (not inclusive)
	* @return the range of molgenis a p i requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<test.portlet.model.MolgenisAPIRequest> getMolgenisAPIRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMolgenisAPIRequests(start, end);
	}

	/**
	* Returns the number of molgenis a p i requests.
	*
	* @return the number of molgenis a p i requests
	* @throws SystemException if a system exception occurred
	*/
	public static int getMolgenisAPIRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMolgenisAPIRequestsCount();
	}

	/**
	* Updates the molgenis a p i request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param molgenisAPIRequest the molgenis a p i request
	* @return the molgenis a p i request that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static test.portlet.model.MolgenisAPIRequest updateMolgenisAPIRequest(
		test.portlet.model.MolgenisAPIRequest molgenisAPIRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMolgenisAPIRequest(molgenisAPIRequest);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.lang.String getAgregatedJsonFromMolgenis() {
		return getService().getAgregatedJsonFromMolgenis();
	}

	public static void clearService() {
		_service = null;
	}

	public static MolgenisAPIRequestLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MolgenisAPIRequestLocalService.class.getName());

			if (invokableLocalService instanceof MolgenisAPIRequestLocalService) {
				_service = (MolgenisAPIRequestLocalService)invokableLocalService;
			}
			else {
				_service = new MolgenisAPIRequestLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MolgenisAPIRequestLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MolgenisAPIRequestLocalService service) {
	}

	private static MolgenisAPIRequestLocalService _service;
}