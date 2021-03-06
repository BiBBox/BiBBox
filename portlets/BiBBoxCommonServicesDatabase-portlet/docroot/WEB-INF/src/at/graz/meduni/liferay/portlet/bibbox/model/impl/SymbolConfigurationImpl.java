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

package at.graz.meduni.liferay.portlet.bibbox.model.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import at.graz.meduni.liferay.portlet.bibbox.model.IconConfiguration;
import at.graz.meduni.liferay.portlet.bibbox.model.SymbolTypeConfiguration;
import at.graz.meduni.liferay.portlet.bibbox.service.IconConfigurationLocalServiceUtil;
import at.graz.meduni.liferay.portlet.bibbox.service.SymbolTypeConfigurationLocalServiceUtil;

/**
 * The extended model implementation for the SymbolConfiguration service. Represents a row in the &quot;bibboxcs.symbolconfiguration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link at.graz.meduni.liferay.portlet.bibbox.model.SymbolConfiguration} interface.
 * </p>
 *
 * @author reihsr
 */
public class SymbolConfigurationImpl extends SymbolConfigurationBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a symbol configuration model instance should use the {@link at.graz.meduni.liferay.portlet.bibbox.model.SymbolConfiguration} interface instead.
	 */
	public SymbolConfigurationImpl() {
	}
	
	/**
	 * Error Format for date
	 */
	String date_format_apache_error_pattern = "EEE MMM dd HH:mm:ss yyyy";
	SimpleDateFormat date_format_apache_error = new SimpleDateFormat(date_format_apache_error_pattern);
	
	/**
	 * 
	 * @return
	 */
	public String getTemplate() {
		String template = "";
		try {
			SymbolTypeConfiguration symboltypeconfiguration = SymbolTypeConfigurationLocalServiceUtil.getSymbolTypeConfigurationBySymbolType(this.getSymboltype());
			template = symboltypeconfiguration.getTemplate();
		} catch(Exception ex) {
			System.err.println("[" + date_format_apache_error.format(new Date()) + "] [error] [BiBBoxCommonServicesDatabase-portlet::at.graz.meduni.liferay.portlet.bibbox.model.impl.SymbolConfigurationImpl::getTemplate] Error retrieving Template for " + this.getSymboltype() + ".");
			ex.printStackTrace();
		}
		return template;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getSymbolIconConfiguration() {
		String config = "";
		try {
			SymbolTypeConfiguration symboltypeconfiguration = SymbolTypeConfigurationLocalServiceUtil.getSymbolTypeConfigurationBySymbolType(this.getSymboltype());
			config = symboltypeconfiguration.getSymboliconconfiguration();
		} catch(Exception ex) {
			System.err.println("[" + date_format_apache_error.format(new Date()) + "] [error] [BiBBoxCommonServicesDatabase-portlet::at.graz.meduni.liferay.portlet.bibbox.model.impl.SymbolConfigurationImpl::getSymbolIconConfiguration] Error retrieving SymbolIconConfiguration for " + this.getSymboltype() + ".");
			ex.printStackTrace();
		}
		return config;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<IconConfiguration> getIconsForPosition(String position) {
		try {
			return IconConfigurationLocalServiceUtil.getIconsForPosition(this.getSymbolconfigurationId(), position);
		} catch(Exception ex) {
			System.err.println("[" + date_format_apache_error.format(new Date()) + "] [error] [BiBBoxCommonServicesDatabase-portlet::at.graz.meduni.liferay.portlet.bibbox.model.impl.SymbolConfigurationImpl::getIconsForPosition] Error retrieving IconConfigurations for search (" + this.getSymbolconfigurationId() + ", " + position + ").");
			ex.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<IconConfiguration> getIconsForKey(String key) {
		try {
			return IconConfigurationLocalServiceUtil.getIconsForKey(this.getSymbolconfigurationId(), key);
		} catch(Exception ex) {
			System.err.println("[" + date_format_apache_error.format(new Date()) + "] [error] [BiBBoxCommonServicesDatabase-portlet::at.graz.meduni.liferay.portlet.bibbox.model.impl.SymbolConfigurationImpl::getIconsForKey] Error retrieving IconConfigurations for search (" + this.getSymbolconfigurationId() + ", " + key + ").");
			ex.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 
	 * @return
	 */
	public IconConfiguration getIconsForKeyPosition(String key, String position) {
		try {
			return IconConfigurationLocalServiceUtil.getIconsForKeyPosition(this.getSymbolconfigurationId(), key, position);
		} catch(Exception ex) {
			System.err.println("[" + date_format_apache_error.format(new Date()) + "] [error] [BiBBoxCommonServicesDatabase-portlet::at.graz.meduni.liferay.portlet.bibbox.model.impl.SymbolConfigurationImpl::getIconsForKeyPosition] Error retrieving IconConfigurations for search (" + this.getSymbolconfigurationId() + ", " + key + ", " + position + ").");
			ex.printStackTrace();
		}
		return null;
	}
}