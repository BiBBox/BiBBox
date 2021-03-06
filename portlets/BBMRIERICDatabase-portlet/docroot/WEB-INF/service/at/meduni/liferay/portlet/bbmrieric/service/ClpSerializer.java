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

package at.meduni.liferay.portlet.bbmrieric.service;

import at.meduni.liferay.portlet.bbmrieric.model.BioBankClp;
import at.meduni.liferay.portlet.bbmrieric.model.ContactInformationClp;
import at.meduni.liferay.portlet.bbmrieric.model.D2BiobankClp;
import at.meduni.liferay.portlet.bbmrieric.model.D2BiobankNetworkClp;
import at.meduni.liferay.portlet.bbmrieric.model.D2BiobankNetworkLinkClp;
import at.meduni.liferay.portlet.bbmrieric.model.D2CollectionClp;
import at.meduni.liferay.portlet.bbmrieric.model.DiseaseDiscriptionClp;
import at.meduni.liferay.portlet.bbmrieric.model.SearchIndexClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author reihsr
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"BBMRIERICDatabase-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"BBMRIERICDatabase-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "BBMRIERICDatabase-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(BioBankClp.class.getName())) {
			return translateInputBioBank(oldModel);
		}

		if (oldModelClassName.equals(ContactInformationClp.class.getName())) {
			return translateInputContactInformation(oldModel);
		}

		if (oldModelClassName.equals(D2BiobankClp.class.getName())) {
			return translateInputD2Biobank(oldModel);
		}

		if (oldModelClassName.equals(D2BiobankNetworkClp.class.getName())) {
			return translateInputD2BiobankNetwork(oldModel);
		}

		if (oldModelClassName.equals(D2BiobankNetworkLinkClp.class.getName())) {
			return translateInputD2BiobankNetworkLink(oldModel);
		}

		if (oldModelClassName.equals(D2CollectionClp.class.getName())) {
			return translateInputD2Collection(oldModel);
		}

		if (oldModelClassName.equals(DiseaseDiscriptionClp.class.getName())) {
			return translateInputDiseaseDiscription(oldModel);
		}

		if (oldModelClassName.equals(SearchIndexClp.class.getName())) {
			return translateInputSearchIndex(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputBioBank(BaseModel<?> oldModel) {
		BioBankClp oldClpModel = (BioBankClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getBioBankRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputContactInformation(BaseModel<?> oldModel) {
		ContactInformationClp oldClpModel = (ContactInformationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getContactInformationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputD2Biobank(BaseModel<?> oldModel) {
		D2BiobankClp oldClpModel = (D2BiobankClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getD2BiobankRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputD2BiobankNetwork(BaseModel<?> oldModel) {
		D2BiobankNetworkClp oldClpModel = (D2BiobankNetworkClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getD2BiobankNetworkRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputD2BiobankNetworkLink(
		BaseModel<?> oldModel) {
		D2BiobankNetworkLinkClp oldClpModel = (D2BiobankNetworkLinkClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getD2BiobankNetworkLinkRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputD2Collection(BaseModel<?> oldModel) {
		D2CollectionClp oldClpModel = (D2CollectionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getD2CollectionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDiseaseDiscription(BaseModel<?> oldModel) {
		DiseaseDiscriptionClp oldClpModel = (DiseaseDiscriptionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDiseaseDiscriptionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSearchIndex(BaseModel<?> oldModel) {
		SearchIndexClp oldClpModel = (SearchIndexClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSearchIndexRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"at.meduni.liferay.portlet.bbmrieric.model.impl.BioBankImpl")) {
			return translateOutputBioBank(oldModel);
		}

		if (oldModelClassName.equals(
					"at.meduni.liferay.portlet.bbmrieric.model.impl.ContactInformationImpl")) {
			return translateOutputContactInformation(oldModel);
		}

		if (oldModelClassName.equals(
					"at.meduni.liferay.portlet.bbmrieric.model.impl.D2BiobankImpl")) {
			return translateOutputD2Biobank(oldModel);
		}

		if (oldModelClassName.equals(
					"at.meduni.liferay.portlet.bbmrieric.model.impl.D2BiobankNetworkImpl")) {
			return translateOutputD2BiobankNetwork(oldModel);
		}

		if (oldModelClassName.equals(
					"at.meduni.liferay.portlet.bbmrieric.model.impl.D2BiobankNetworkLinkImpl")) {
			return translateOutputD2BiobankNetworkLink(oldModel);
		}

		if (oldModelClassName.equals(
					"at.meduni.liferay.portlet.bbmrieric.model.impl.D2CollectionImpl")) {
			return translateOutputD2Collection(oldModel);
		}

		if (oldModelClassName.equals(
					"at.meduni.liferay.portlet.bbmrieric.model.impl.DiseaseDiscriptionImpl")) {
			return translateOutputDiseaseDiscription(oldModel);
		}

		if (oldModelClassName.equals(
					"at.meduni.liferay.portlet.bbmrieric.model.impl.SearchIndexImpl")) {
			return translateOutputSearchIndex(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"at.meduni.liferay.portlet.bbmrieric.NoSuchBioBankException")) {
			return new at.meduni.liferay.portlet.bbmrieric.NoSuchBioBankException();
		}

		if (className.equals(
					"at.meduni.liferay.portlet.bbmrieric.NoSuchContactInformationException")) {
			return new at.meduni.liferay.portlet.bbmrieric.NoSuchContactInformationException();
		}

		if (className.equals(
					"at.meduni.liferay.portlet.bbmrieric.NoSuchD2BiobankException")) {
			return new at.meduni.liferay.portlet.bbmrieric.NoSuchD2BiobankException();
		}

		if (className.equals(
					"at.meduni.liferay.portlet.bbmrieric.NoSuchD2BiobankNetworkException")) {
			return new at.meduni.liferay.portlet.bbmrieric.NoSuchD2BiobankNetworkException();
		}

		if (className.equals(
					"at.meduni.liferay.portlet.bbmrieric.NoSuchD2BiobankNetworkLinkException")) {
			return new at.meduni.liferay.portlet.bbmrieric.NoSuchD2BiobankNetworkLinkException();
		}

		if (className.equals(
					"at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException")) {
			return new at.meduni.liferay.portlet.bbmrieric.NoSuchD2CollectionException();
		}

		if (className.equals(
					"at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException")) {
			return new at.meduni.liferay.portlet.bbmrieric.NoSuchDiseaseDiscriptionException();
		}

		if (className.equals(
					"at.meduni.liferay.portlet.bbmrieric.NoSuchSearchIndexException")) {
			return new at.meduni.liferay.portlet.bbmrieric.NoSuchSearchIndexException();
		}

		return throwable;
	}

	public static Object translateOutputBioBank(BaseModel<?> oldModel) {
		BioBankClp newModel = new BioBankClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setBioBankRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputContactInformation(
		BaseModel<?> oldModel) {
		ContactInformationClp newModel = new ContactInformationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setContactInformationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputD2Biobank(BaseModel<?> oldModel) {
		D2BiobankClp newModel = new D2BiobankClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setD2BiobankRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputD2BiobankNetwork(BaseModel<?> oldModel) {
		D2BiobankNetworkClp newModel = new D2BiobankNetworkClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setD2BiobankNetworkRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputD2BiobankNetworkLink(
		BaseModel<?> oldModel) {
		D2BiobankNetworkLinkClp newModel = new D2BiobankNetworkLinkClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setD2BiobankNetworkLinkRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputD2Collection(BaseModel<?> oldModel) {
		D2CollectionClp newModel = new D2CollectionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setD2CollectionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDiseaseDiscription(
		BaseModel<?> oldModel) {
		DiseaseDiscriptionClp newModel = new DiseaseDiscriptionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDiseaseDiscriptionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSearchIndex(BaseModel<?> oldModel) {
		SearchIndexClp newModel = new SearchIndexClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSearchIndexRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}