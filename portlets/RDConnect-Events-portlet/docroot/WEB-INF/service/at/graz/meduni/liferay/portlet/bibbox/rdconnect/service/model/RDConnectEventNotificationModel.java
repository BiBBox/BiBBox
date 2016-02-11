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

package at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the RDConnectEventNotification service. Represents a row in the &quot;rdconnect.eventnotification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.impl.RDConnectEventNotificationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.impl.RDConnectEventNotificationImpl}.
 * </p>
 *
 * @author reihsr
 * @see RDConnectEventNotification
 * @see at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.impl.RDConnectEventNotificationImpl
 * @see at.graz.meduni.liferay.portlet.bibbox.rdconnect.service.model.impl.RDConnectEventNotificationModelImpl
 * @generated
 */
public interface RDConnectEventNotificationModel extends BaseModel<RDConnectEventNotification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a r d connect event notification model instance should use the {@link RDConnectEventNotification} interface instead.
	 */

	/**
	 * Returns the primary key of this r d connect event notification.
	 *
	 * @return the primary key of this r d connect event notification
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this r d connect event notification.
	 *
	 * @param primaryKey the primary key of this r d connect event notification
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the eventnotification ID of this r d connect event notification.
	 *
	 * @return the eventnotification ID of this r d connect event notification
	 */
	public long getEventnotificationId();

	/**
	 * Sets the eventnotification ID of this r d connect event notification.
	 *
	 * @param eventnotificationId the eventnotification ID of this r d connect event notification
	 */
	public void setEventnotificationId(long eventnotificationId);

	/**
	 * Returns the notificationtype of this r d connect event notification.
	 *
	 * @return the notificationtype of this r d connect event notification
	 */
	@AutoEscape
	public String getNotificationtype();

	/**
	 * Sets the notificationtype of this r d connect event notification.
	 *
	 * @param notificationtype the notificationtype of this r d connect event notification
	 */
	public void setNotificationtype(String notificationtype);

	/**
	 * Returns the user ID of this r d connect event notification.
	 *
	 * @return the user ID of this r d connect event notification
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this r d connect event notification.
	 *
	 * @param userId the user ID of this r d connect event notification
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this r d connect event notification.
	 *
	 * @return the user uuid of this r d connect event notification
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this r d connect event notification.
	 *
	 * @param userUuid the user uuid of this r d connect event notification
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the notificationselected of this r d connect event notification.
	 *
	 * @return the notificationselected of this r d connect event notification
	 */
	public boolean getNotificationselected();

	/**
	 * Returns <code>true</code> if this r d connect event notification is notificationselected.
	 *
	 * @return <code>true</code> if this r d connect event notification is notificationselected; <code>false</code> otherwise
	 */
	public boolean isNotificationselected();

	/**
	 * Sets whether this r d connect event notification is notificationselected.
	 *
	 * @param notificationselected the notificationselected of this r d connect event notification
	 */
	public void setNotificationselected(boolean notificationselected);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(RDConnectEventNotification rdConnectEventNotification);

	@Override
	public int hashCode();

	@Override
	public CacheModel<RDConnectEventNotification> toCacheModel();

	@Override
	public RDConnectEventNotification toEscapedModel();

	@Override
	public RDConnectEventNotification toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}