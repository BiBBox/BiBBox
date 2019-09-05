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

package at.graz.meduni.liferay.portlet.bibbox.service.service.persistence;

import at.graz.meduni.liferay.portlet.bibbox.service.model.idcard;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the idcard service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author reihsr
 * @see idcardPersistenceImpl
 * @see idcardUtil
 * @generated
 */
public interface idcardPersistence extends BasePersistence<idcard> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link idcardUtil} to access the idcard persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the idcard in the entity cache if it is enabled.
	*
	* @param idcard the idcard
	*/
	public void cacheResult(
		at.graz.meduni.liferay.portlet.bibbox.service.model.idcard idcard);

	/**
	* Caches the idcards in the entity cache if it is enabled.
	*
	* @param idcards the idcards
	*/
	public void cacheResult(
		java.util.List<at.graz.meduni.liferay.portlet.bibbox.service.model.idcard> idcards);

	/**
	* Creates a new idcard with the primary key. Does not add the idcard to the database.
	*
	* @param idcardId the primary key for the new idcard
	* @return the new idcard
	*/
	public at.graz.meduni.liferay.portlet.bibbox.service.model.idcard create(
		long idcardId);

	/**
	* Removes the idcard with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idcardId the primary key of the idcard
	* @return the idcard that was removed
	* @throws at.graz.meduni.liferay.portlet.bibbox.service.NoSuchidcardException if a idcard with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.graz.meduni.liferay.portlet.bibbox.service.model.idcard remove(
		long idcardId)
		throws at.graz.meduni.liferay.portlet.bibbox.service.NoSuchidcardException,
			com.liferay.portal.kernel.exception.SystemException;

	public at.graz.meduni.liferay.portlet.bibbox.service.model.idcard updateImpl(
		at.graz.meduni.liferay.portlet.bibbox.service.model.idcard idcard)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the idcard with the primary key or throws a {@link at.graz.meduni.liferay.portlet.bibbox.service.NoSuchidcardException} if it could not be found.
	*
	* @param idcardId the primary key of the idcard
	* @return the idcard
	* @throws at.graz.meduni.liferay.portlet.bibbox.service.NoSuchidcardException if a idcard with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.graz.meduni.liferay.portlet.bibbox.service.model.idcard findByPrimaryKey(
		long idcardId)
		throws at.graz.meduni.liferay.portlet.bibbox.service.NoSuchidcardException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the idcard with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idcardId the primary key of the idcard
	* @return the idcard, or <code>null</code> if a idcard with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.graz.meduni.liferay.portlet.bibbox.service.model.idcard fetchByPrimaryKey(
		long idcardId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the idcards.
	*
	* @return the idcards
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.graz.meduni.liferay.portlet.bibbox.service.model.idcard> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the idcards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.portlet.bibbox.service.model.impl.idcardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of idcards
	* @param end the upper bound of the range of idcards (not inclusive)
	* @return the range of idcards
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.graz.meduni.liferay.portlet.bibbox.service.model.idcard> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the idcards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.graz.meduni.liferay.portlet.bibbox.service.model.impl.idcardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of idcards
	* @param end the upper bound of the range of idcards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of idcards
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.graz.meduni.liferay.portlet.bibbox.service.model.idcard> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the idcards from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of idcards.
	*
	* @return the number of idcards
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}