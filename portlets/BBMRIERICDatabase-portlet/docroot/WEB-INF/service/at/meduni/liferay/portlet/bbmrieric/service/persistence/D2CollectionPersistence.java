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

package at.meduni.liferay.portlet.bbmrieric.service.persistence;

import at.meduni.liferay.portlet.bbmrieric.model.D2Collection;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the d2 collection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author reihsr
 * @see D2CollectionPersistenceImpl
 * @see D2CollectionUtil
 * @generated
 */
public interface D2CollectionPersistence extends BasePersistence<D2Collection> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link D2CollectionUtil} to access the d2 collection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the d2 collections where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the d2 collections where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @return the range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the d2 collections where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collections before and after the current d2 collection in the ordered set where uuid = &#63;.
	*
	* @param d2collectionId the primary key of the current d2 collection
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a d2 collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection[] findByUuid_PrevAndNext(
		long d2collectionId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the d2 collections where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d2 collections where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collection where uuid = &#63; and groupId = &#63; or throws a {@link at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByUUID_G(
		java.lang.String uuid, long groupId)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collection where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collection where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the d2 collection where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the d2 collection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d2 collections where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the d2 collections where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the d2 collections where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @return the range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the d2 collections where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collections before and after the current d2 collection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param d2collectionId the primary key of the current d2 collection
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a d2 collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection[] findByUuid_C_PrevAndNext(
		long d2collectionId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the d2 collections where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d2 collections where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the d2 collections where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the d2 collections where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @return the range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the d2 collections where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collections before and after the current d2 collection in the ordered set where groupId = &#63;.
	*
	* @param d2collectionId the primary key of the current d2 collection
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a d2 collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection[] findByGroupId_PrevAndNext(
		long d2collectionId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the d2 collections where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d2 collections where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the d2 collections where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the d2 collections where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @return the range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the d2 collections where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collections before and after the current d2 collection in the ordered set where companyId = &#63;.
	*
	* @param d2collectionId the primary key of the current d2 collection
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a d2 collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection[] findByCompanyId_PrevAndNext(
		long d2collectionId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the d2 collections where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d2 collections where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collection where groupId = &#63; and d2collectionId = &#63; or throws a {@link at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException} if it could not be found.
	*
	* @param groupId the group ID
	* @param d2collectionId the d2collection ID
	* @return the matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByCollectionByID(
		long groupId, long d2collectionId)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collection where groupId = &#63; and d2collectionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param d2collectionId the d2collection ID
	* @return the matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByCollectionByID(
		long groupId, long d2collectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collection where groupId = &#63; and d2collectionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param d2collectionId the d2collection ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByCollectionByID(
		long groupId, long d2collectionId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the d2 collection where groupId = &#63; and d2collectionId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param d2collectionId the d2collection ID
	* @return the d2 collection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection removeByCollectionByID(
		long groupId, long d2collectionId)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d2 collections where groupId = &#63; and d2collectionId = &#63;.
	*
	* @param groupId the group ID
	* @param d2collectionId the d2collection ID
	* @return the number of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByCollectionByID(long groupId, long d2collectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collection where groupId = &#63; and bbmricollectionID = &#63; and bbmribiobankID = &#63; or throws a {@link at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException} if it could not be found.
	*
	* @param groupId the group ID
	* @param bbmricollectionID the bbmricollection i d
	* @param bbmribiobankID the bbmribiobank i d
	* @return the matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByCollectionBBMRIERICID(
		long groupId, java.lang.String bbmricollectionID,
		java.lang.String bbmribiobankID)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collection where groupId = &#63; and bbmricollectionID = &#63; and bbmribiobankID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param bbmricollectionID the bbmricollection i d
	* @param bbmribiobankID the bbmribiobank i d
	* @return the matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByCollectionBBMRIERICID(
		long groupId, java.lang.String bbmricollectionID,
		java.lang.String bbmribiobankID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collection where groupId = &#63; and bbmricollectionID = &#63; and bbmribiobankID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param bbmricollectionID the bbmricollection i d
	* @param bbmribiobankID the bbmribiobank i d
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByCollectionBBMRIERICID(
		long groupId, java.lang.String bbmricollectionID,
		java.lang.String bbmribiobankID, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the d2 collection where groupId = &#63; and bbmricollectionID = &#63; and bbmribiobankID = &#63; from the database.
	*
	* @param groupId the group ID
	* @param bbmricollectionID the bbmricollection i d
	* @param bbmribiobankID the bbmribiobank i d
	* @return the d2 collection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection removeByCollectionBBMRIERICID(
		long groupId, java.lang.String bbmricollectionID,
		java.lang.String bbmribiobankID)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d2 collections where groupId = &#63; and bbmricollectionID = &#63; and bbmribiobankID = &#63;.
	*
	* @param groupId the group ID
	* @param bbmricollectionID the bbmricollection i d
	* @param bbmribiobankID the bbmribiobank i d
	* @return the number of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByCollectionBBMRIERICID(long groupId,
		java.lang.String bbmricollectionID, java.lang.String bbmribiobankID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the d2 collections where biobankId = &#63;.
	*
	* @param biobankId the biobank ID
	* @return the matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByCollectionForD2Biobank(
		long biobankId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the d2 collections where biobankId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param biobankId the biobank ID
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @return the range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByCollectionForD2Biobank(
		long biobankId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the d2 collections where biobankId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param biobankId the biobank ID
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByCollectionForD2Biobank(
		long biobankId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where biobankId = &#63;.
	*
	* @param biobankId the biobank ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByCollectionForD2Biobank_First(
		long biobankId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where biobankId = &#63;.
	*
	* @param biobankId the biobank ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByCollectionForD2Biobank_First(
		long biobankId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where biobankId = &#63;.
	*
	* @param biobankId the biobank ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByCollectionForD2Biobank_Last(
		long biobankId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where biobankId = &#63;.
	*
	* @param biobankId the biobank ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByCollectionForD2Biobank_Last(
		long biobankId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collections before and after the current d2 collection in the ordered set where biobankId = &#63;.
	*
	* @param d2collectionId the primary key of the current d2 collection
	* @param biobankId the biobank ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a d2 collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection[] findByCollectionForD2Biobank_PrevAndNext(
		long d2collectionId, long biobankId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the d2 collections where biobankId = &#63; from the database.
	*
	* @param biobankId the biobank ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCollectionForD2Biobank(long biobankId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d2 collections where biobankId = &#63;.
	*
	* @param biobankId the biobank ID
	* @return the number of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByCollectionForD2Biobank(long biobankId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the d2 collections where biobankId = &#63; and parentd2collectionId = &#63;.
	*
	* @param biobankId the biobank ID
	* @param parentd2collectionId the parentd2collection ID
	* @return the matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByRootCollectionForD2Biobank(
		long biobankId, long parentd2collectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the d2 collections where biobankId = &#63; and parentd2collectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param biobankId the biobank ID
	* @param parentd2collectionId the parentd2collection ID
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @return the range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByRootCollectionForD2Biobank(
		long biobankId, long parentd2collectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the d2 collections where biobankId = &#63; and parentd2collectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param biobankId the biobank ID
	* @param parentd2collectionId the parentd2collection ID
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByRootCollectionForD2Biobank(
		long biobankId, long parentd2collectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where biobankId = &#63; and parentd2collectionId = &#63;.
	*
	* @param biobankId the biobank ID
	* @param parentd2collectionId the parentd2collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByRootCollectionForD2Biobank_First(
		long biobankId, long parentd2collectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where biobankId = &#63; and parentd2collectionId = &#63;.
	*
	* @param biobankId the biobank ID
	* @param parentd2collectionId the parentd2collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByRootCollectionForD2Biobank_First(
		long biobankId, long parentd2collectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where biobankId = &#63; and parentd2collectionId = &#63;.
	*
	* @param biobankId the biobank ID
	* @param parentd2collectionId the parentd2collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByRootCollectionForD2Biobank_Last(
		long biobankId, long parentd2collectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where biobankId = &#63; and parentd2collectionId = &#63;.
	*
	* @param biobankId the biobank ID
	* @param parentd2collectionId the parentd2collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByRootCollectionForD2Biobank_Last(
		long biobankId, long parentd2collectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collections before and after the current d2 collection in the ordered set where biobankId = &#63; and parentd2collectionId = &#63;.
	*
	* @param d2collectionId the primary key of the current d2 collection
	* @param biobankId the biobank ID
	* @param parentd2collectionId the parentd2collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a d2 collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection[] findByRootCollectionForD2Biobank_PrevAndNext(
		long d2collectionId, long biobankId, long parentd2collectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the d2 collections where biobankId = &#63; and parentd2collectionId = &#63; from the database.
	*
	* @param biobankId the biobank ID
	* @param parentd2collectionId the parentd2collection ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRootCollectionForD2Biobank(long biobankId,
		long parentd2collectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d2 collections where biobankId = &#63; and parentd2collectionId = &#63;.
	*
	* @param biobankId the biobank ID
	* @param parentd2collectionId the parentd2collection ID
	* @return the number of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByRootCollectionForD2Biobank(long biobankId,
		long parentd2collectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the d2 collections where groupId = &#63; and updateuuid &ne; &#63;.
	*
	* @param groupId the group ID
	* @param updateuuid the updateuuid
	* @return the matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByNotUUID(
		long groupId, java.lang.String updateuuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the d2 collections where groupId = &#63; and updateuuid &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param updateuuid the updateuuid
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @return the range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByNotUUID(
		long groupId, java.lang.String updateuuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the d2 collections where groupId = &#63; and updateuuid &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param updateuuid the updateuuid
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findByNotUUID(
		long groupId, java.lang.String updateuuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where groupId = &#63; and updateuuid &ne; &#63;.
	*
	* @param groupId the group ID
	* @param updateuuid the updateuuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByNotUUID_First(
		long groupId, java.lang.String updateuuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d2 collection in the ordered set where groupId = &#63; and updateuuid &ne; &#63;.
	*
	* @param groupId the group ID
	* @param updateuuid the updateuuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByNotUUID_First(
		long groupId, java.lang.String updateuuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where groupId = &#63; and updateuuid &ne; &#63;.
	*
	* @param groupId the group ID
	* @param updateuuid the updateuuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByNotUUID_Last(
		long groupId, java.lang.String updateuuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d2 collection in the ordered set where groupId = &#63; and updateuuid &ne; &#63;.
	*
	* @param groupId the group ID
	* @param updateuuid the updateuuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d2 collection, or <code>null</code> if a matching d2 collection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByNotUUID_Last(
		long groupId, java.lang.String updateuuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collections before and after the current d2 collection in the ordered set where groupId = &#63; and updateuuid &ne; &#63;.
	*
	* @param d2collectionId the primary key of the current d2 collection
	* @param groupId the group ID
	* @param updateuuid the updateuuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a d2 collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection[] findByNotUUID_PrevAndNext(
		long d2collectionId, long groupId, java.lang.String updateuuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the d2 collections where groupId = &#63; and updateuuid &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param updateuuid the updateuuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNotUUID(long groupId, java.lang.String updateuuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d2 collections where groupId = &#63; and updateuuid &ne; &#63;.
	*
	* @param groupId the group ID
	* @param updateuuid the updateuuid
	* @return the number of matching d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public int countByNotUUID(long groupId, java.lang.String updateuuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the d2 collection in the entity cache if it is enabled.
	*
	* @param d2Collection the d2 collection
	*/
	public void cacheResult(
		at.meduni.liferay.portlet.bbmrieric.model.D2Collection d2Collection);

	/**
	* Caches the d2 collections in the entity cache if it is enabled.
	*
	* @param d2Collections the d2 collections
	*/
	public void cacheResult(
		java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> d2Collections);

	/**
	* Creates a new d2 collection with the primary key. Does not add the d2 collection to the database.
	*
	* @param d2collectionId the primary key for the new d2 collection
	* @return the new d2 collection
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection create(
		long d2collectionId);

	/**
	* Removes the d2 collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param d2collectionId the primary key of the d2 collection
	* @return the d2 collection that was removed
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a d2 collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection remove(
		long d2collectionId)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection updateImpl(
		at.meduni.liferay.portlet.bbmrieric.model.D2Collection d2Collection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collection with the primary key or throws a {@link at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException} if it could not be found.
	*
	* @param d2collectionId the primary key of the d2 collection
	* @return the d2 collection
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException if a d2 collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection findByPrimaryKey(
		long d2collectionId)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d2 collection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param d2collectionId the primary key of the d2 collection
	* @return the d2 collection, or <code>null</code> if a d2 collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.D2Collection fetchByPrimaryKey(
		long d2collectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the d2 collections.
	*
	* @return the d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the d2 collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @return the range of d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the d2 collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of d2 collections
	* @param end the upper bound of the range of d2 collections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Collection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the d2 collections from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d2 collections.
	*
	* @return the number of d2 collections
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}