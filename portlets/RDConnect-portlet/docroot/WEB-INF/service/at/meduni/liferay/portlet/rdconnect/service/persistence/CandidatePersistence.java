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

package at.meduni.liferay.portlet.rdconnect.service.persistence;

import at.meduni.liferay.portlet.rdconnect.model.Candidate;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the candidate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Robert Reihs
 * @see CandidatePersistenceImpl
 * @see CandidateUtil
 * @generated
 */
public interface CandidatePersistence extends BasePersistence<Candidate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CandidateUtil} to access the candidate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the candidates where country LIKE &#63; and name LIKE &#63; and source LIKE &#63; and candidatetype LIKE &#63; and subunitof = &#63;.
	*
	* @param country the country
	* @param name the name
	* @param source the source
	* @param candidatetype the candidatetype
	* @param subunitof the subunitof
	* @return the matching candidates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> findByCNST(
		java.lang.String country, java.lang.String name,
		java.lang.String source, java.lang.String candidatetype,
		java.lang.String subunitof)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the candidates where country LIKE &#63; and name LIKE &#63; and source LIKE &#63; and candidatetype LIKE &#63; and subunitof = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param country the country
	* @param name the name
	* @param source the source
	* @param candidatetype the candidatetype
	* @param subunitof the subunitof
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @return the range of matching candidates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> findByCNST(
		java.lang.String country, java.lang.String name,
		java.lang.String source, java.lang.String candidatetype,
		java.lang.String subunitof, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the candidates where country LIKE &#63; and name LIKE &#63; and source LIKE &#63; and candidatetype LIKE &#63; and subunitof = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param country the country
	* @param name the name
	* @param source the source
	* @param candidatetype the candidatetype
	* @param subunitof the subunitof
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching candidates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> findByCNST(
		java.lang.String country, java.lang.String name,
		java.lang.String source, java.lang.String candidatetype,
		java.lang.String subunitof, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first candidate in the ordered set where country LIKE &#63; and name LIKE &#63; and source LIKE &#63; and candidatetype LIKE &#63; and subunitof = &#63;.
	*
	* @param country the country
	* @param name the name
	* @param source the source
	* @param candidatetype the candidatetype
	* @param subunitof the subunitof
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException if a matching candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate findByCNST_First(
		java.lang.String country, java.lang.String name,
		java.lang.String source, java.lang.String candidatetype,
		java.lang.String subunitof,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first candidate in the ordered set where country LIKE &#63; and name LIKE &#63; and source LIKE &#63; and candidatetype LIKE &#63; and subunitof = &#63;.
	*
	* @param country the country
	* @param name the name
	* @param source the source
	* @param candidatetype the candidatetype
	* @param subunitof the subunitof
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate, or <code>null</code> if a matching candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate fetchByCNST_First(
		java.lang.String country, java.lang.String name,
		java.lang.String source, java.lang.String candidatetype,
		java.lang.String subunitof,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last candidate in the ordered set where country LIKE &#63; and name LIKE &#63; and source LIKE &#63; and candidatetype LIKE &#63; and subunitof = &#63;.
	*
	* @param country the country
	* @param name the name
	* @param source the source
	* @param candidatetype the candidatetype
	* @param subunitof the subunitof
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException if a matching candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate findByCNST_Last(
		java.lang.String country, java.lang.String name,
		java.lang.String source, java.lang.String candidatetype,
		java.lang.String subunitof,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last candidate in the ordered set where country LIKE &#63; and name LIKE &#63; and source LIKE &#63; and candidatetype LIKE &#63; and subunitof = &#63;.
	*
	* @param country the country
	* @param name the name
	* @param source the source
	* @param candidatetype the candidatetype
	* @param subunitof the subunitof
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate, or <code>null</code> if a matching candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate fetchByCNST_Last(
		java.lang.String country, java.lang.String name,
		java.lang.String source, java.lang.String candidatetype,
		java.lang.String subunitof,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the candidates before and after the current candidate in the ordered set where country LIKE &#63; and name LIKE &#63; and source LIKE &#63; and candidatetype LIKE &#63; and subunitof = &#63;.
	*
	* @param candidateId the primary key of the current candidate
	* @param country the country
	* @param name the name
	* @param source the source
	* @param candidatetype the candidatetype
	* @param subunitof the subunitof
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException if a candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate[] findByCNST_PrevAndNext(
		long candidateId, java.lang.String country, java.lang.String name,
		java.lang.String source, java.lang.String candidatetype,
		java.lang.String subunitof,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the candidates where country LIKE &#63; and name LIKE &#63; and source LIKE &#63; and candidatetype LIKE &#63; and subunitof = &#63; from the database.
	*
	* @param country the country
	* @param name the name
	* @param source the source
	* @param candidatetype the candidatetype
	* @param subunitof the subunitof
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCNST(java.lang.String country, java.lang.String name,
		java.lang.String source, java.lang.String candidatetype,
		java.lang.String subunitof)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of candidates where country LIKE &#63; and name LIKE &#63; and source LIKE &#63; and candidatetype LIKE &#63; and subunitof = &#63;.
	*
	* @param country the country
	* @param name the name
	* @param source the source
	* @param candidatetype the candidatetype
	* @param subunitof the subunitof
	* @return the number of matching candidates
	* @throws SystemException if a system exception occurred
	*/
	public int countByCNST(java.lang.String country, java.lang.String name,
		java.lang.String source, java.lang.String candidatetype,
		java.lang.String subunitof)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the candidates where subunitof = &#63;.
	*
	* @param subunitof the subunitof
	* @return the matching candidates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> findBySubRemover(
		java.lang.String subunitof)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the candidates where subunitof = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subunitof the subunitof
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @return the range of matching candidates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> findBySubRemover(
		java.lang.String subunitof, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the candidates where subunitof = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subunitof the subunitof
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching candidates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> findBySubRemover(
		java.lang.String subunitof, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first candidate in the ordered set where subunitof = &#63;.
	*
	* @param subunitof the subunitof
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException if a matching candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate findBySubRemover_First(
		java.lang.String subunitof,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first candidate in the ordered set where subunitof = &#63;.
	*
	* @param subunitof the subunitof
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate, or <code>null</code> if a matching candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate fetchBySubRemover_First(
		java.lang.String subunitof,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last candidate in the ordered set where subunitof = &#63;.
	*
	* @param subunitof the subunitof
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException if a matching candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate findBySubRemover_Last(
		java.lang.String subunitof,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last candidate in the ordered set where subunitof = &#63;.
	*
	* @param subunitof the subunitof
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate, or <code>null</code> if a matching candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate fetchBySubRemover_Last(
		java.lang.String subunitof,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the candidates before and after the current candidate in the ordered set where subunitof = &#63;.
	*
	* @param candidateId the primary key of the current candidate
	* @param subunitof the subunitof
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException if a candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate[] findBySubRemover_PrevAndNext(
		long candidateId, java.lang.String subunitof,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the candidates where subunitof = &#63; from the database.
	*
	* @param subunitof the subunitof
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySubRemover(java.lang.String subunitof)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of candidates where subunitof = &#63;.
	*
	* @param subunitof the subunitof
	* @return the number of matching candidates
	* @throws SystemException if a system exception occurred
	*/
	public int countBySubRemover(java.lang.String subunitof)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the candidates where country = &#63;.
	*
	* @param country the country
	* @return the matching candidates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> findByCountry(
		java.lang.String country)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the candidates where country = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param country the country
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @return the range of matching candidates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> findByCountry(
		java.lang.String country, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the candidates where country = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param country the country
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching candidates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> findByCountry(
		java.lang.String country, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first candidate in the ordered set where country = &#63;.
	*
	* @param country the country
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException if a matching candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate findByCountry_First(
		java.lang.String country,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first candidate in the ordered set where country = &#63;.
	*
	* @param country the country
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate, or <code>null</code> if a matching candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate fetchByCountry_First(
		java.lang.String country,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last candidate in the ordered set where country = &#63;.
	*
	* @param country the country
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException if a matching candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate findByCountry_Last(
		java.lang.String country,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last candidate in the ordered set where country = &#63;.
	*
	* @param country the country
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate, or <code>null</code> if a matching candidate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate fetchByCountry_Last(
		java.lang.String country,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the candidates before and after the current candidate in the ordered set where country = &#63;.
	*
	* @param candidateId the primary key of the current candidate
	* @param country the country
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException if a candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate[] findByCountry_PrevAndNext(
		long candidateId, java.lang.String country,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the candidates where country = &#63; from the database.
	*
	* @param country the country
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCountry(java.lang.String country)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of candidates where country = &#63;.
	*
	* @param country the country
	* @return the number of matching candidates
	* @throws SystemException if a system exception occurred
	*/
	public int countByCountry(java.lang.String country)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the candidate in the entity cache if it is enabled.
	*
	* @param candidate the candidate
	*/
	public void cacheResult(
		at.meduni.liferay.portlet.rdconnect.model.Candidate candidate);

	/**
	* Caches the candidates in the entity cache if it is enabled.
	*
	* @param candidates the candidates
	*/
	public void cacheResult(
		java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> candidates);

	/**
	* Creates a new candidate with the primary key. Does not add the candidate to the database.
	*
	* @param candidateId the primary key for the new candidate
	* @return the new candidate
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate create(
		long candidateId);

	/**
	* Removes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param candidateId the primary key of the candidate
	* @return the candidate that was removed
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException if a candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate remove(
		long candidateId)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException,
			com.liferay.portal.kernel.exception.SystemException;

	public at.meduni.liferay.portlet.rdconnect.model.Candidate updateImpl(
		at.meduni.liferay.portlet.rdconnect.model.Candidate candidate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the candidate with the primary key or throws a {@link at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException} if it could not be found.
	*
	* @param candidateId the primary key of the candidate
	* @return the candidate
	* @throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException if a candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate findByPrimaryKey(
		long candidateId)
		throws at.meduni.liferay.portlet.rdconnect.NoSuchCandidateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the candidate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param candidateId the primary key of the candidate
	* @return the candidate, or <code>null</code> if a candidate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public at.meduni.liferay.portlet.rdconnect.model.Candidate fetchByPrimaryKey(
		long candidateId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the candidates.
	*
	* @return the candidates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the candidates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @return the range of candidates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the candidates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link at.meduni.liferay.portlet.rdconnect.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidates
	* @param end the upper bound of the range of candidates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of candidates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<at.meduni.liferay.portlet.rdconnect.model.Candidate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the candidates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of candidates.
	*
	* @return the number of candidates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}