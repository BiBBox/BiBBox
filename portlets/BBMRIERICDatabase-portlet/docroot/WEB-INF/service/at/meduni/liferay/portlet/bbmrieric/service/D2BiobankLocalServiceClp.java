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

import com.liferay.portal.service.InvokableLocalService;

/**
 * @author reihsr
 * @generated
 */
public class D2BiobankLocalServiceClp implements D2BiobankLocalService {
	public D2BiobankLocalServiceClp(InvokableLocalService invokableLocalService) {
		_invokableLocalService = invokableLocalService;

		_methodName0 = "addD2Biobank";

		_methodParameterTypes0 = new String[] {
				"at.meduni.liferay.portlet.bbmrieric.model.D2Biobank"
			};

		_methodName1 = "createD2Biobank";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteD2Biobank";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteD2Biobank";

		_methodParameterTypes3 = new String[] {
				"at.meduni.liferay.portlet.bbmrieric.model.D2Biobank"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchD2Biobank";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "fetchD2BiobankByUuidAndCompanyId";

		_methodParameterTypes11 = new String[] { "java.lang.String", "long" };

		_methodName12 = "fetchD2BiobankByUuidAndGroupId";

		_methodParameterTypes12 = new String[] { "java.lang.String", "long" };

		_methodName13 = "getD2Biobank";

		_methodParameterTypes13 = new String[] { "long" };

		_methodName14 = "getPersistedModel";

		_methodParameterTypes14 = new String[] { "java.io.Serializable" };

		_methodName15 = "getD2BiobankByUuidAndCompanyId";

		_methodParameterTypes15 = new String[] { "java.lang.String", "long" };

		_methodName16 = "getD2BiobankByUuidAndGroupId";

		_methodParameterTypes16 = new String[] { "java.lang.String", "long" };

		_methodName17 = "getD2Biobanks";

		_methodParameterTypes17 = new String[] { "int", "int" };

		_methodName18 = "getD2BiobanksCount";

		_methodParameterTypes18 = new String[] {  };

		_methodName19 = "updateD2Biobank";

		_methodParameterTypes19 = new String[] {
				"at.meduni.liferay.portlet.bbmrieric.model.D2Biobank"
			};

		_methodName20 = "getBeanIdentifier";

		_methodParameterTypes20 = new String[] {  };

		_methodName21 = "setBeanIdentifier";

		_methodParameterTypes21 = new String[] { "java.lang.String" };

		_methodName23 = "d2BiobankFromRequest";

		_methodParameterTypes23 = new String[] { "javax.portlet.ActionRequest" };

		_methodName24 = "getD2Biobanks";

		_methodParameterTypes24 = new String[] { "long" };

		_methodName25 = "getD2Biobanks";

		_methodParameterTypes25 = new String[] { "long", "int", "int" };

		_methodName26 = "getD2BiobankByBBMRIERICID";

		_methodParameterTypes26 = new String[] { "long", "java.lang.String" };

		_methodName27 = "getD2BiobankByBBMRIERICID";

		_methodParameterTypes27 = new String[] { "java.lang.String" };

		_methodName28 = "addD2Biobank";

		_methodParameterTypes28 = new String[] {
				"at.meduni.liferay.portlet.bbmrieric.model.D2Biobank",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName29 = "addD2Biobank";

		_methodParameterTypes29 = new String[] {
				"long", "long", "long", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "java.lang.String", "java.lang.String", "boolean",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "boolean", "boolean", "boolean", "long",
				"boolean", "boolean", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "boolean", "boolean", "boolean", "boolean",
				"boolean", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName30 = "updateD2Biobank";

		_methodParameterTypes30 = new String[] {
				"at.meduni.liferay.portlet.bbmrieric.model.D2Biobank",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName31 = "updateD2Biobank";

		_methodParameterTypes31 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "long",
				"java.lang.String", "java.lang.String", "boolean",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "boolean", "boolean", "boolean", "long",
				"boolean", "boolean", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "boolean", "boolean", "boolean", "boolean",
				"boolean", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName32 = "deleteD2Biobank";

		_methodParameterTypes32 = new String[] {
				"long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName33 = "getD2Biobanks";

		_methodParameterTypes33 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};

		_methodName34 = "getLDAPNotUpdatedBiobanks";

		_methodParameterTypes34 = new String[] { "long", "java.lang.String" };

		_methodName35 = "getBiobankWithLdapUpdate";

		_methodParameterTypes35 = new String[] { "long" };

		_methodName36 = "getD2BiobankFromLDAP";

		_methodParameterTypes36 = new String[] {
				"at.meduni.liferay.portlet.bbmrieric.model.D2Biobank",
				"javax.naming.directory.Attributes", "boolean"
			};
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank addD2Biobank(
		at.meduni.liferay.portlet.bbmrieric.model.D2Biobank d2Biobank)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName0,
					_methodParameterTypes0,
					new Object[] { ClpSerializer.translateInput(d2Biobank) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank createD2Biobank(
		long biobankId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1, new Object[] { biobankId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank deleteD2Biobank(
		long biobankId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName2,
					_methodParameterTypes2, new Object[] { biobankId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank deleteD2Biobank(
		at.meduni.liferay.portlet.bbmrieric.model.D2Biobank d2Biobank)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] { ClpSerializer.translateInput(d2Biobank) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName4,
					_methodParameterTypes4, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.kernel.dao.orm.DynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName5,
					_methodParameterTypes5,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName7,
					_methodParameterTypes7,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName8,
					_methodParameterTypes8,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName9,
					_methodParameterTypes9,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					ClpSerializer.translateInput(projection)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank fetchD2Biobank(
		long biobankId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10, new Object[] { biobankId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank fetchD2BiobankByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11,
					new Object[] { ClpSerializer.translateInput(uuid), companyId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank fetchD2BiobankByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName12,
					_methodParameterTypes12,
					new Object[] { ClpSerializer.translateInput(uuid), groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank getD2Biobank(
		long biobankId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13, new Object[] { biobankId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName14,
					_methodParameterTypes14,
					new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank getD2BiobankByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] { ClpSerializer.translateInput(uuid), companyId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank getD2BiobankByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16,
					new Object[] { ClpSerializer.translateInput(uuid), groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Biobank> getD2Biobanks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName17,
					_methodParameterTypes17, new Object[] { start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Biobank>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getD2BiobanksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName18,
					_methodParameterTypes18, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank updateD2Biobank(
		at.meduni.liferay.portlet.bbmrieric.model.D2Biobank d2Biobank)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] { ClpSerializer.translateInput(d2Biobank) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableLocalService.invokeMethod(_methodName21,
				_methodParameterTypes21,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank d2BiobankFromRequest(
		javax.portlet.ActionRequest request) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName23,
					_methodParameterTypes23,
					new Object[] { ClpSerializer.translateInput(request) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Biobank> getD2Biobanks(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName24,
					_methodParameterTypes24, new Object[] { groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Biobank>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Biobank> getD2Biobanks(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName25,
					_methodParameterTypes25,
					new Object[] { groupId, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Biobank>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank getD2BiobankByBBMRIERICID(
		long groupId, java.lang.String bbmribiobankID) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName26,
					_methodParameterTypes26,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(bbmribiobankID)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank getD2BiobankByBBMRIERICID(
		java.lang.String bbmribiobankID) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName27,
					_methodParameterTypes27,
					new Object[] { ClpSerializer.translateInput(bbmribiobankID) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank addD2Biobank(
		at.meduni.liferay.portlet.bbmrieric.model.D2Biobank newbiobank,
		com.liferay.portal.service.ServiceContext serviceContext) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName28,
					_methodParameterTypes28,
					new Object[] {
						ClpSerializer.translateInput(newbiobank),
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank addD2Biobank(
		long biobankId, long companyId, long groupId, long userId,
		java.lang.String biobankName, java.lang.String ldapbiobankID,
		java.lang.String ldapupdateuuid, java.lang.String contactIDRef,
		long contactPriority, java.lang.String biobankJurisdicalPerson,
		java.lang.String biobankCountry, boolean biobankPartnerCharterSigned,
		java.lang.String bioresourceReference,
		java.lang.String biobankNetworkIDRef, java.lang.String geoLatitude,
		java.lang.String geoLongitude, boolean collaborationPartnersCommercial,
		boolean collaborationPartnersNonforprofit,
		boolean biobankITSupportAvailable, long biobankITStaffSize,
		boolean biobankISAvailable, boolean biobankHISAvailable,
		java.lang.String biobankAcronym, java.lang.String biobankDescription,
		java.lang.String biobankURL, java.lang.String biobankHeadFirstName,
		java.lang.String biobankHeadLastName, java.lang.String biobankHeadRole,
		boolean biobankClinical, boolean biobankPopulation,
		boolean biobankResearchStudy, boolean biobankNonHuman,
		boolean biobankCollection, java.lang.String biobankType,
		com.liferay.portal.service.ServiceContext serviceContext) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName29,
					_methodParameterTypes29,
					new Object[] {
						biobankId,
						
					companyId,
						
					groupId,
						
					userId,
						
					ClpSerializer.translateInput(biobankName),
						
					ClpSerializer.translateInput(ldapbiobankID),
						
					ClpSerializer.translateInput(ldapupdateuuid),
						
					ClpSerializer.translateInput(contactIDRef),
						
					contactPriority,
						
					ClpSerializer.translateInput(biobankJurisdicalPerson),
						
					ClpSerializer.translateInput(biobankCountry),
						
					biobankPartnerCharterSigned,
						
					ClpSerializer.translateInput(bioresourceReference),
						
					ClpSerializer.translateInput(biobankNetworkIDRef),
						
					ClpSerializer.translateInput(geoLatitude),
						
					ClpSerializer.translateInput(geoLongitude),
						
					collaborationPartnersCommercial,
						
					collaborationPartnersNonforprofit,
						
					biobankITSupportAvailable,
						
					biobankITStaffSize,
						
					biobankISAvailable,
						
					biobankHISAvailable,
						
					ClpSerializer.translateInput(biobankAcronym),
						
					ClpSerializer.translateInput(biobankDescription),
						
					ClpSerializer.translateInput(biobankURL),
						
					ClpSerializer.translateInput(biobankHeadFirstName),
						
					ClpSerializer.translateInput(biobankHeadLastName),
						
					ClpSerializer.translateInput(biobankHeadRole),
						
					biobankClinical,
						
					biobankPopulation,
						
					biobankResearchStudy,
						
					biobankNonHuman,
						
					biobankCollection,
						
					ClpSerializer.translateInput(biobankType),
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank updateD2Biobank(
		at.meduni.liferay.portlet.bbmrieric.model.D2Biobank d2biobank,
		com.liferay.portal.service.ServiceContext serviceContext) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName30,
					_methodParameterTypes30,
					new Object[] {
						ClpSerializer.translateInput(d2biobank),
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank updateD2Biobank(
		long biobankId, long userId, java.lang.String biobankName,
		java.lang.String ldapbiobankID, java.lang.String ldapupdateuuid,
		java.lang.String contactIDRef, long contactPriority,
		java.lang.String biobankJurisdicalPerson,
		java.lang.String biobankCountry, boolean biobankPartnerCharterSigned,
		java.lang.String bioresourceReference,
		java.lang.String biobankNetworkIDRef, java.lang.String geoLatitude,
		java.lang.String geoLongitude, boolean collaborationPartnersCommercial,
		boolean collaborationPartnersNonforprofit,
		boolean biobankITSupportAvailable, long biobankITStaffSize,
		boolean biobankISAvailable, boolean biobankHISAvailable,
		java.lang.String biobankAcronym, java.lang.String biobankDescription,
		java.lang.String biobankURL, java.lang.String biobankHeadFirstName,
		java.lang.String biobankHeadLastName, java.lang.String biobankHeadRole,
		boolean biobankClinical, boolean biobankPopulation,
		boolean biobankResearchStudy, boolean biobankNonHuman,
		boolean biobankCollection, java.lang.String biobankType,
		com.liferay.portal.service.ServiceContext serviceContext) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName31,
					_methodParameterTypes31,
					new Object[] {
						biobankId,
						
					userId,
						
					ClpSerializer.translateInput(biobankName),
						
					ClpSerializer.translateInput(ldapbiobankID),
						
					ClpSerializer.translateInput(ldapupdateuuid),
						
					ClpSerializer.translateInput(contactIDRef),
						
					contactPriority,
						
					ClpSerializer.translateInput(biobankJurisdicalPerson),
						
					ClpSerializer.translateInput(biobankCountry),
						
					biobankPartnerCharterSigned,
						
					ClpSerializer.translateInput(bioresourceReference),
						
					ClpSerializer.translateInput(biobankNetworkIDRef),
						
					ClpSerializer.translateInput(geoLatitude),
						
					ClpSerializer.translateInput(geoLongitude),
						
					collaborationPartnersCommercial,
						
					collaborationPartnersNonforprofit,
						
					biobankITSupportAvailable,
						
					biobankITStaffSize,
						
					biobankISAvailable,
						
					biobankHISAvailable,
						
					ClpSerializer.translateInput(biobankAcronym),
						
					ClpSerializer.translateInput(biobankDescription),
						
					ClpSerializer.translateInput(biobankURL),
						
					ClpSerializer.translateInput(biobankHeadFirstName),
						
					ClpSerializer.translateInput(biobankHeadLastName),
						
					ClpSerializer.translateInput(biobankHeadRole),
						
					biobankClinical,
						
					biobankPopulation,
						
					biobankResearchStudy,
						
					biobankNonHuman,
						
					biobankCollection,
						
					ClpSerializer.translateInput(biobankType),
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank deleteD2Biobank(
		long biobankId, com.liferay.portal.service.ServiceContext serviceContext) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName32,
					_methodParameterTypes32,
					new Object[] {
						biobankId,
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Biobank> getD2Biobanks(
		java.lang.String keyword, java.lang.String country,
		java.lang.String materialtype, java.lang.String diagnosisavailable,
		java.lang.String biobanksize, java.lang.String typeofbiobank,
		java.lang.String typeofcollection) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName33,
					_methodParameterTypes33,
					new Object[] {
						ClpSerializer.translateInput(keyword),
						
					ClpSerializer.translateInput(country),
						
					ClpSerializer.translateInput(materialtype),
						
					ClpSerializer.translateInput(diagnosisavailable),
						
					ClpSerializer.translateInput(biobanksize),
						
					ClpSerializer.translateInput(typeofbiobank),
						
					ClpSerializer.translateInput(typeofcollection)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Biobank>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Biobank> getLDAPNotUpdatedBiobanks(
		long groupId, java.lang.String ldapupdateuuid) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName34,
					_methodParameterTypes34,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(ldapupdateuuid)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<at.meduni.liferay.portlet.bbmrieric.model.D2Biobank>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank getBiobankWithLdapUpdate(
		long biobankId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName35,
					_methodParameterTypes35, new Object[] { biobankId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public at.meduni.liferay.portlet.bbmrieric.model.D2Biobank getD2BiobankFromLDAP(
		at.meduni.liferay.portlet.bbmrieric.model.D2Biobank d2biobank,
		javax.naming.directory.Attributes attrs, boolean contact) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName36,
					_methodParameterTypes36,
					new Object[] {
						ClpSerializer.translateInput(d2biobank),
						
					ClpSerializer.translateInput(attrs),
						
					contact
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (at.meduni.liferay.portlet.bbmrieric.model.D2Biobank)ClpSerializer.translateOutput(returnObj);
	}

	private InvokableLocalService _invokableLocalService;
	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName34;
	private String[] _methodParameterTypes34;
	private String _methodName35;
	private String[] _methodParameterTypes35;
	private String _methodName36;
	private String[] _methodParameterTypes36;
}