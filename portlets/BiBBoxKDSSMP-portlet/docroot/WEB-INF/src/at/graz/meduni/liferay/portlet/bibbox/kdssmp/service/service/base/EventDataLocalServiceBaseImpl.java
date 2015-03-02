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

package at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.base;

import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventData;
import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.EventDataLocalService;
import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.persistence.EventDataPersistence;
import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.persistence.patientnamegeneratorPersistence;

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

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the event data local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.impl.EventDataLocalServiceImpl}.
 * </p>
 *
 * @author reihsr
 * @see at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.impl.EventDataLocalServiceImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.EventDataLocalServiceUtil
 * @generated
 */
public abstract class EventDataLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements EventDataLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.EventDataLocalServiceUtil} to access the event data local service.
	 */

	/**
	 * Adds the event data to the database. Also notifies the appropriate model listeners.
	 *
	 * @param eventData the event data
	 * @return the event data that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EventData addEventData(EventData eventData)
		throws SystemException {
		eventData.setNew(true);

		return eventDataPersistence.update(eventData);
	}

	/**
	 * Creates a new event data with the primary key. Does not add the event data to the database.
	 *
	 * @param eventdataId the primary key for the new event data
	 * @return the new event data
	 */
	@Override
	public EventData createEventData(long eventdataId) {
		return eventDataPersistence.create(eventdataId);
	}

	/**
	 * Deletes the event data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eventdataId the primary key of the event data
	 * @return the event data that was removed
	 * @throws PortalException if a event data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EventData deleteEventData(long eventdataId)
		throws PortalException, SystemException {
		return eventDataPersistence.remove(eventdataId);
	}

	/**
	 * Deletes the event data from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eventData the event data
	 * @return the event data that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EventData deleteEventData(EventData eventData)
		throws SystemException {
		return eventDataPersistence.remove(eventData);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(EventData.class,
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
		return eventDataPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.impl.EventDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return eventDataPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.impl.EventDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return eventDataPersistence.findWithDynamicQuery(dynamicQuery, start,
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
		return eventDataPersistence.countWithDynamicQuery(dynamicQuery);
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
		return eventDataPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public EventData fetchEventData(long eventdataId) throws SystemException {
		return eventDataPersistence.fetchByPrimaryKey(eventdataId);
	}

	/**
	 * Returns the event data with the primary key.
	 *
	 * @param eventdataId the primary key of the event data
	 * @return the event data
	 * @throws PortalException if a event data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EventData getEventData(long eventdataId)
		throws PortalException, SystemException {
		return eventDataPersistence.findByPrimaryKey(eventdataId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return eventDataPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the event datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.impl.EventDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of event datas
	 * @param end the upper bound of the range of event datas (not inclusive)
	 * @return the range of event datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EventData> getEventDatas(int start, int end)
		throws SystemException {
		return eventDataPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of event datas.
	 *
	 * @return the number of event datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getEventDatasCount() throws SystemException {
		return eventDataPersistence.countAll();
	}

	/**
	 * Updates the event data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param eventData the event data
	 * @return the event data that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EventData updateEventData(EventData eventData)
		throws SystemException {
		return eventDataPersistence.update(eventData);
	}

	/**
	 * Returns the event data local service.
	 *
	 * @return the event data local service
	 */
	public at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.EventDataLocalService getEventDataLocalService() {
		return eventDataLocalService;
	}

	/**
	 * Sets the event data local service.
	 *
	 * @param eventDataLocalService the event data local service
	 */
	public void setEventDataLocalService(
		at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.EventDataLocalService eventDataLocalService) {
		this.eventDataLocalService = eventDataLocalService;
	}

	/**
	 * Returns the event data persistence.
	 *
	 * @return the event data persistence
	 */
	public EventDataPersistence getEventDataPersistence() {
		return eventDataPersistence;
	}

	/**
	 * Sets the event data persistence.
	 *
	 * @param eventDataPersistence the event data persistence
	 */
	public void setEventDataPersistence(
		EventDataPersistence eventDataPersistence) {
		this.eventDataPersistence = eventDataPersistence;
	}

	/**
	 * Returns the patientnamegenerator local service.
	 *
	 * @return the patientnamegenerator local service
	 */
	public at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.patientnamegeneratorLocalService getpatientnamegeneratorLocalService() {
		return patientnamegeneratorLocalService;
	}

	/**
	 * Sets the patientnamegenerator local service.
	 *
	 * @param patientnamegeneratorLocalService the patientnamegenerator local service
	 */
	public void setpatientnamegeneratorLocalService(
		at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.patientnamegeneratorLocalService patientnamegeneratorLocalService) {
		this.patientnamegeneratorLocalService = patientnamegeneratorLocalService;
	}

	/**
	 * Returns the patientnamegenerator persistence.
	 *
	 * @return the patientnamegenerator persistence
	 */
	public patientnamegeneratorPersistence getpatientnamegeneratorPersistence() {
		return patientnamegeneratorPersistence;
	}

	/**
	 * Sets the patientnamegenerator persistence.
	 *
	 * @param patientnamegeneratorPersistence the patientnamegenerator persistence
	 */
	public void setpatientnamegeneratorPersistence(
		patientnamegeneratorPersistence patientnamegeneratorPersistence) {
		this.patientnamegeneratorPersistence = patientnamegeneratorPersistence;
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

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventData",
			eventDataLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.EventData");
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
		return EventData.class;
	}

	protected String getModelClassName() {
		return EventData.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = eventDataPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.EventDataLocalService.class)
	protected at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.EventDataLocalService eventDataLocalService;
	@BeanReference(type = EventDataPersistence.class)
	protected EventDataPersistence eventDataPersistence;
	@BeanReference(type = at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.patientnamegeneratorLocalService.class)
	protected at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.patientnamegeneratorLocalService patientnamegeneratorLocalService;
	@BeanReference(type = patientnamegeneratorPersistence.class)
	protected patientnamegeneratorPersistence patientnamegeneratorPersistence;
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
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private EventDataLocalServiceClpInvoker _clpInvoker = new EventDataLocalServiceClpInvoker();
}