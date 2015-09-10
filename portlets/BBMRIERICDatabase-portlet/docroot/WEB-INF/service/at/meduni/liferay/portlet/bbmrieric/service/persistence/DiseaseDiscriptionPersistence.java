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

import at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the disease discription service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author reihsr
 * @see DiseaseDiscriptionPersistenceImpl
 * @see DiseaseDiscriptionUtil
 * @generated
 */
public interface DiseaseDiscriptionPersistence extends BasePersistence<DiseaseDiscription> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DiseaseDiscriptionUtil} to access the disease discription persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the disease discription where diseasecode = &#63; or throws a {@link at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException} if it could not be found.
	*
	* @param diseasecode the diseasecode
	* @return the matching disease discription
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException if a matching disease discription could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription findByDiseaseCode(
		java.lang.String diseasecode)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the disease discription where diseasecode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param diseasecode the diseasecode
	* @return the matching disease discription, or <code>null</code> if a matching disease discription could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription fetchByDiseaseCode(
		java.lang.String diseasecode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the disease discription where diseasecode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param diseasecode the diseasecode
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching disease discription, or <code>null</code> if a matching disease discription could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription fetchByDiseaseCode(
		java.lang.String diseasecode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the disease discription where diseasecode = &#63; from the database.
	*
	* @param diseasecode the diseasecode
	* @return the disease discription that was removed
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription removeByDiseaseCode(
		java.lang.String diseasecode)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of disease discriptions where diseasecode = &#63;.
	*
	* @param diseasecode the diseasecode
	* @return the number of matching disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public int countByDiseaseCode(java.lang.String diseasecode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the disease discriptions where diseasegroup = &#63;.
	*
	* @param diseasegroup the diseasegroup
	* @return the matching disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription> findByDiseaseGroup(
		java.lang.String diseasegroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the disease discriptions where diseasegroup = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.DiseaseDiscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param diseasegroup the diseasegroup
	* @param start the lower bound of the range of disease discriptions
	* @param end the upper bound of the range of disease discriptions (not inclusive)
	* @return the range of matching disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription> findByDiseaseGroup(
		java.lang.String diseasegroup, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the disease discriptions where diseasegroup = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.DiseaseDiscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param diseasegroup the diseasegroup
	* @param start the lower bound of the range of disease discriptions
	* @param end the upper bound of the range of disease discriptions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription> findByDiseaseGroup(
		java.lang.String diseasegroup, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first disease discription in the ordered set where diseasegroup = &#63;.
	*
	* @param diseasegroup the diseasegroup
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching disease discription
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException if a matching disease discription could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription findByDiseaseGroup_First(
		java.lang.String diseasegroup,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first disease discription in the ordered set where diseasegroup = &#63;.
	*
	* @param diseasegroup the diseasegroup
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching disease discription, or <code>null</code> if a matching disease discription could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription fetchByDiseaseGroup_First(
		java.lang.String diseasegroup,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last disease discription in the ordered set where diseasegroup = &#63;.
	*
	* @param diseasegroup the diseasegroup
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching disease discription
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException if a matching disease discription could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription findByDiseaseGroup_Last(
		java.lang.String diseasegroup,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last disease discription in the ordered set where diseasegroup = &#63;.
	*
	* @param diseasegroup the diseasegroup
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching disease discription, or <code>null</code> if a matching disease discription could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription fetchByDiseaseGroup_Last(
		java.lang.String diseasegroup,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the disease discriptions before and after the current disease discription in the ordered set where diseasegroup = &#63;.
	*
	* @param diseasediscriptionId the primary key of the current disease discription
	* @param diseasegroup the diseasegroup
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next disease discription
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException if a disease discription with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription[] findByDiseaseGroup_PrevAndNext(
		long diseasediscriptionId, java.lang.String diseasegroup,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the disease discriptions where diseasegroup = &#63; from the database.
	*
	* @param diseasegroup the diseasegroup
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDiseaseGroup(java.lang.String diseasegroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of disease discriptions where diseasegroup = &#63;.
	*
	* @param diseasegroup the diseasegroup
	* @return the number of matching disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public int countByDiseaseGroup(java.lang.String diseasegroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the disease discriptions where root = &#63;.
	*
	* @param root the root
	* @return the matching disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription> findByRoot(
		boolean root)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the disease discriptions where root = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.DiseaseDiscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param root the root
	* @param start the lower bound of the range of disease discriptions
	* @param end the upper bound of the range of disease discriptions (not inclusive)
	* @return the range of matching disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription> findByRoot(
		boolean root, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the disease discriptions where root = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.DiseaseDiscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param root the root
	* @param start the lower bound of the range of disease discriptions
	* @param end the upper bound of the range of disease discriptions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription> findByRoot(
		boolean root, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first disease discription in the ordered set where root = &#63;.
	*
	* @param root the root
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching disease discription
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException if a matching disease discription could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription findByRoot_First(
		boolean root,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first disease discription in the ordered set where root = &#63;.
	*
	* @param root the root
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching disease discription, or <code>null</code> if a matching disease discription could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription fetchByRoot_First(
		boolean root,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last disease discription in the ordered set where root = &#63;.
	*
	* @param root the root
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching disease discription
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException if a matching disease discription could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription findByRoot_Last(
		boolean root,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last disease discription in the ordered set where root = &#63;.
	*
	* @param root the root
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching disease discription, or <code>null</code> if a matching disease discription could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription fetchByRoot_Last(
		boolean root,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the disease discriptions before and after the current disease discription in the ordered set where root = &#63;.
	*
	* @param diseasediscriptionId the primary key of the current disease discription
	* @param root the root
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next disease discription
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException if a disease discription with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription[] findByRoot_PrevAndNext(
		long diseasediscriptionId, boolean root,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the disease discriptions where root = &#63; from the database.
	*
	* @param root the root
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRoot(boolean root)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of disease discriptions where root = &#63;.
	*
	* @param root the root
	* @return the number of matching disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public int countByRoot(boolean root)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the disease discription in the entity cache if it is enabled.
	*
	* @param diseaseDiscription the disease discription
	*/
	public void cacheResult(
		at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription diseaseDiscription);

	/**
	* Caches the disease discriptions in the entity cache if it is enabled.
	*
	* @param diseaseDiscriptions the disease discriptions
	*/
	public void cacheResult(
		java.util.List<at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription> diseaseDiscriptions);

	/**
	* Creates a new disease discription with the primary key. Does not add the disease discription to the database.
	*
	* @param diseasediscriptionId the primary key for the new disease discription
	* @return the new disease discription
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription create(
		long diseasediscriptionId);

	/**
	* Removes the disease discription with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param diseasediscriptionId the primary key of the disease discription
	* @return the disease discription that was removed
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException if a disease discription with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription remove(
		long diseasediscriptionId)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException,
			com.liferay.portal.kernel.exception.SystemException;

	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription updateImpl(
		at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription diseaseDiscription)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the disease discription with the primary key or throws a {@link at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException} if it could not be found.
	*
	* @param diseasediscriptionId the primary key of the disease discription
	* @return the disease discription
	* @throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException if a disease discription with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription findByPrimaryKey(
		long diseasediscriptionId)
		throws at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the disease discription with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param diseasediscriptionId the primary key of the disease discription
	* @return the disease discription, or <code>null</code> if a disease discription with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription fetchByPrimaryKey(
		long diseasediscriptionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the disease discriptions.
	*
	* @return the disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the disease discriptions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.DiseaseDiscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of disease discriptions
	* @param end the upper bound of the range of disease discriptions (not inclusive)
	* @return the range of disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the disease discriptions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.bbmrieric.model.impl.DiseaseDiscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of disease discriptions
	* @param end the upper bound of the range of disease discriptions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscription> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the disease discriptions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of disease discriptions.
	*
	* @return the number of disease discriptions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}