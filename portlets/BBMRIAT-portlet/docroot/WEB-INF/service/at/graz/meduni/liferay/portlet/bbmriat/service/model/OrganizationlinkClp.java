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

package at.graz.meduni.liferay.portlet.bbmriat.service.model;

import at.graz.meduni.liferay.portlet.bbmriat.service.service.ClpSerializer;
import at.graz.meduni.liferay.portlet.bbmriat.service.service.OrganizationlinkLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Reihs Robert
 */
public class OrganizationlinkClp extends BaseModelImpl<Organizationlink>
	implements Organizationlink {
	public OrganizationlinkClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Organizationlink.class;
	}

	@Override
	public String getModelClassName() {
		return Organizationlink.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _organizationlinkId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOrganizationlinkId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _organizationlinkId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organizationlinkId", getOrganizationlinkId());
		attributes.put("parentorganizationId", getParentorganizationId());
		attributes.put("organizationId", getOrganizationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organizationlinkId = (Long)attributes.get("organizationlinkId");

		if (organizationlinkId != null) {
			setOrganizationlinkId(organizationlinkId);
		}

		Long parentorganizationId = (Long)attributes.get("parentorganizationId");

		if (parentorganizationId != null) {
			setParentorganizationId(parentorganizationId);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}
	}

	@Override
	public long getOrganizationlinkId() {
		return _organizationlinkId;
	}

	@Override
	public void setOrganizationlinkId(long organizationlinkId) {
		_organizationlinkId = organizationlinkId;

		if (_organizationlinkRemoteModel != null) {
			try {
				Class<?> clazz = _organizationlinkRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationlinkId",
						long.class);

				method.invoke(_organizationlinkRemoteModel, organizationlinkId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getParentorganizationId() {
		return _parentorganizationId;
	}

	@Override
	public void setParentorganizationId(long parentorganizationId) {
		_parentorganizationId = parentorganizationId;

		if (_organizationlinkRemoteModel != null) {
			try {
				Class<?> clazz = _organizationlinkRemoteModel.getClass();

				Method method = clazz.getMethod("setParentorganizationId",
						long.class);

				method.invoke(_organizationlinkRemoteModel, parentorganizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;

		if (_organizationlinkRemoteModel != null) {
			try {
				Class<?> clazz = _organizationlinkRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId", long.class);

				method.invoke(_organizationlinkRemoteModel, organizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOrganizationlinkRemoteModel() {
		return _organizationlinkRemoteModel;
	}

	public void setOrganizationlinkRemoteModel(
		BaseModel<?> organizationlinkRemoteModel) {
		_organizationlinkRemoteModel = organizationlinkRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _organizationlinkRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_organizationlinkRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OrganizationlinkLocalServiceUtil.addOrganizationlink(this);
		}
		else {
			OrganizationlinkLocalServiceUtil.updateOrganizationlink(this);
		}
	}

	@Override
	public Organizationlink toEscapedModel() {
		return (Organizationlink)ProxyUtil.newProxyInstance(Organizationlink.class.getClassLoader(),
			new Class[] { Organizationlink.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OrganizationlinkClp clone = new OrganizationlinkClp();

		clone.setOrganizationlinkId(getOrganizationlinkId());
		clone.setParentorganizationId(getParentorganizationId());
		clone.setOrganizationId(getOrganizationId());

		return clone;
	}

	@Override
	public int compareTo(Organizationlink organizationlink) {
		long primaryKey = organizationlink.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrganizationlinkClp)) {
			return false;
		}

		OrganizationlinkClp organizationlink = (OrganizationlinkClp)obj;

		long primaryKey = organizationlink.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{organizationlinkId=");
		sb.append(getOrganizationlinkId());
		sb.append(", parentorganizationId=");
		sb.append(getParentorganizationId());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"at.graz.meduni.liferay.portlet.bbmriat.service.model.Organizationlink");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>organizationlinkId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationlinkId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentorganizationId</column-name><column-value><![CDATA[");
		sb.append(getParentorganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _organizationlinkId;
	private long _parentorganizationId;
	private long _organizationId;
	private BaseModel<?> _organizationlinkRemoteModel;
}