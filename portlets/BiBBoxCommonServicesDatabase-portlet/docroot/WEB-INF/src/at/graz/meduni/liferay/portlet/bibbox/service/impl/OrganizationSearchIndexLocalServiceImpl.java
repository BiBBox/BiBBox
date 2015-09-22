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

package at.graz.meduni.liferay.portlet.bibbox.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.liferay.portal.kernel.exception.SystemException;

import at.graz.meduni.liferay.portlet.bibbox.NoSuchOrganizationSearchIndexException;
import at.graz.meduni.liferay.portlet.bibbox.service.base.OrganizationSearchIndexLocalServiceBaseImpl;

/**
 * The implementation of the organization search index local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link at.graz.meduni.liferay.portlet.bibbox.service.OrganizationSearchIndexLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author reihsr
 * @see at.graz.meduni.liferay.portlet.bibbox.service.base.OrganizationSearchIndexLocalServiceBaseImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.service.OrganizationSearchIndexLocalServiceUtil
 */
public class OrganizationSearchIndexLocalServiceImpl
	extends OrganizationSearchIndexLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link at.graz.meduni.liferay.portlet.bibbox.service.OrganizationSearchIndexLocalServiceUtil} to access the organization search index local service.
	 */
	/**
	 * Error Format for date
	 */
	String date_format_apache_error_pattern = "EEE MMM dd HH:mm:ss yyyy";
	SimpleDateFormat date_format_apache_error = new SimpleDateFormat(date_format_apache_error_pattern);
	
	/**
	 * 
	 */
	public String getSearchIndexValueByKey(String keyword, long organizationId) {
		try {
			return organizationSearchIndexPersistence.findByKeyAndOrganization(organizationId, keyword).getValue();
		} catch (NoSuchOrganizationSearchIndexException e) {
			System.out.println("[" + date_format_apache_error.format(new Date()) + "] [info] [BiBBoxCommonServicesDatabase-portlet::at.graz.meduni.liferay.portlet.bibbox.service.impl.OrganizationSearchIndexLocalServiceImpl::getSearchIndexValueByKey] Could not find OrganizationSearchIndex for (" + keyword + ", " + organizationId + ".");
			e.printStackTrace();
		} catch (SystemException e) {
			System.out.println("[" + date_format_apache_error.format(new Date()) + "] [error] [BiBBoxCommonServicesDatabase-portlet::at.graz.meduni.liferay.portlet.bibbox.service.impl.OrganizationSearchIndexLocalServiceImpl::getSearchIndexValueByKey] Error gettint value from OrganizationSearchIndex for (" + keyword + ", " + organizationId + ".");
			e.printStackTrace();
		}
		return "";
	}
}