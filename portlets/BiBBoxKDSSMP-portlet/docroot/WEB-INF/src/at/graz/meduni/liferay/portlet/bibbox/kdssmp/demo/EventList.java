package at.graz.meduni.liferay.portlet.bibbox.kdssmp.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.Event;
import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpConfiguration;
import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.model.KdssmpParameterConfiguration;
import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.EventDataLocalServiceUtil;
import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.EventLocalServiceUtil;
import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.KdssmpConfigurationLocalServiceUtil;
import at.graz.meduni.liferay.portlet.bibbox.kdssmp.service.service.KdssmpParameterConfigurationLocalServiceUtil;

import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutConstants;
import com.liferay.portal.model.LayoutPrototype;
import com.liferay.portal.model.LayoutSetPrototype;
import com.liferay.portal.model.LayoutTemplate;
import com.liferay.portal.model.LayoutTypePortlet;
import com.liferay.portal.model.PortletConstants;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.LayoutPrototypeLocalServiceUtil;
import com.liferay.portal.service.LayoutSetPrototypeServiceUtil;
import com.liferay.portal.service.LayoutTemplateLocalServiceUtil;
import com.liferay.portal.service.ResourceLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortletKeys;
import com.liferay.portlet.dynamicdatamapping.storage.Field;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class EventList
 */
public class EventList extends MVCPortlet {
	/**
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void createEvent(ActionRequest request, ActionResponse response) throws Exception {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Date eventdate = ParamUtil.getDate(request, "kdssmpdate", dateFormat);
			String eventtype = ParamUtil.getString(request, "eventType");
			long patientId = ParamUtil.getLong(request, "patientId");
			
			String pagetitle = patientId + dateFormat.format(eventdate) + " " + eventtype;
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			long userId = themeDisplay.getUserId();
			long groupId = themeDisplay.getScopeGroupId();
			boolean privateLayout = false;
			long parentLayoutId = 0;
			String name = pagetitle;
			String title = null;
			String description = null;
			String type = LayoutConstants.TYPE_PORTLET;
			boolean hidden = false;
			Random r = new Random();
			char c = (char)(r.nextInt(26) + 'a');
			char d = (char)(r.nextInt(26) + 'a');
			String friendlyURL = "/" + c + d + dateFormat.format(eventdate) + eventtype.toLowerCase().replaceAll(" ", "").replaceAll("ä", "a") + patientId;
			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setAddGroupPermissions(true);
			serviceContext.setAddGuestPermissions(true);
			Group group = themeDisplay.getScopeGroup();
			serviceContext.setScopeGroupId(group.getGroupId());
			serviceContext.setUserId(themeDisplay.getUserId());

			Layout layout = LayoutLocalServiceUtil.addLayout(userId, groupId, privateLayout, parentLayoutId, name, title, description, type, hidden, friendlyURL, serviceContext);

			KdssmpConfiguration eventtype_display = KdssmpConfigurationLocalServiceUtil.getConfigurationOptionValue("Display", eventtype);
			KdssmpConfiguration eventlayoutprototype = KdssmpConfigurationLocalServiceUtil.getConfigurationOption("layoutprototype", eventtype_display.getOptionkey());
			System.out.println(eventlayoutprototype.getOptionvalue());
			List<LayoutPrototype> layoutprototypes = LayoutPrototypeLocalServiceUtil.getLayoutPrototypes(-1, -1);
			for(LayoutPrototype layoutprototype : layoutprototypes) {
				if (HtmlUtil.escape(layoutprototype.getName()).contains(eventlayoutprototype.getOptionvalue())) {
					System.out.println(layoutprototype.getName() + " - " + layoutprototype.getUuid());
					layout.setLayoutPrototypeUuid(layoutprototype.getUuid());
					layout.setLayoutPrototypeLinkEnabled(true);
					LayoutLocalServiceUtil.updateLayout(layout);
				}
			}
			
			/*List<LayoutSetPrototype> lsps = LayoutSetPrototypeServiceUtil.search(themeDisplay.getCompanyId(), Boolean.TRUE, null);
			for (LayoutSetPrototype lsp : lsps) {
				// System.out.println("->" + lsp.getName() + " - " +
				// lsp.getLayoutSetPrototypeId());
				if (HtmlUtil.escape(lsp.getName()).contains("kDSSMP")) {
					System.out.println("hit");
					layout.getLayoutPrototypeUuid();
					LayoutTypePortlet ltp = (LayoutTypePortlet) layout.getLayoutType();
					ltp.setLayoutTemplateId(userId, "1_column");
					System.out.println("ltp.setLayoutTemplateId(" + userId + ", " + lsp.getNameCurrentLanguageId() + ");");
					LayoutLocalServiceUtil.updateLayout(layout);
					
					System.out.println(lsp.getName() + " - " + lsp.getUuid() + "");
					//layout.setLayoutPrototypeUuid(lsp.getUuid());
					//layout.setLayoutPrototypeLinkEnabled(true);
					//LayoutLocalServiceUtil.updateLayout(layout);
					// LayoutLocalServiceUtil.updateLayout(layout.getGroupId(),
					// layout.isPrivateLayout(),layout.getLayoutId(),
					// layout.getTypeSettings());
					//addResources(layout, PortletKeys.DOCKBAR);
				}

			}*/

			// Create Event in DB
			Event event = EventLocalServiceUtil.createNewEvent(layout.getLayoutId(), patientId ,eventdate, eventtype);
			EventLocalServiceUtil.addEvent(event);

			// Read Data from request
			addEventDate(request, layout.getLayoutId());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * 
	 * @param request
	 */
	private void addEventDate(ActionRequest request, long layoutId) {
		System.out.println("create Event data");
		try {
			String eventtype = ParamUtil.getString(request, "eventType");
			long patientId = ParamUtil.getLong(request, "patientId");
			List<KdssmpConfiguration> parameters = KdssmpConfigurationLocalServiceUtil.getConfigurationOptions("Parameter", eventtype.toLowerCase().replaceAll(" ", ""));
			for(KdssmpConfiguration parameter : parameters) {
				KdssmpParameterConfiguration parameterconfig = KdssmpParameterConfigurationLocalServiceUtil.getKdssmpParameterConfiguration(Long.parseLong(parameter.getOptionvalue()));
				String id = parameterconfig.getDatatype() + parameterconfig.getParameterconfigurationId();
				String value = "";
				System.out.println(parameterconfig.getDatatype());
				if(parameterconfig.getDatatype().equalsIgnoreCase("html")) {
					value = ParamUtil.getString(request, id);
				} else if(parameterconfig.getDatatype().equalsIgnoreCase("text")) {
					value = ParamUtil.getString(request, id);
				} else if(parameterconfig.getDatatype().equalsIgnoreCase("textbox")) {
					value = ParamUtil.getString(request, id);
				} else if(parameterconfig.getDatatype().equalsIgnoreCase("Select")) {
					value = ParamUtil.getString(request, id);
				} else if(parameterconfig.getDatatype().equalsIgnoreCase("Multiselect")) {
					String[] items = ParamUtil.getParameterValues(request, id);
					boolean first = true;
					for(String item : items){
						if(!first) {
							value += ";";
						} else {
							first = false;
						}
						value += "\"" + item + "\"";
					}
				}
				EventDataLocalServiceUtil.createNewEventData(layoutId, patientId, String.valueOf(parameterconfig.getParameterconfigurationId()), value);
			}
		} catch(Exception ex) {
			System.err.println("ERROR: EventList::addEventDate(ActionRequest request)");
			ex.printStackTrace();
		}
	}

	/**
	 * 
	 * @param layout
	 * @param portletId
	 * @throws Exception
	 */
	protected void addResources(Layout layout, String portletId) throws Exception {
		String rootPortletId = PortletConstants.getRootPortletId(portletId);
		String portletPrimaryKey = PortletPermissionUtil.getPrimaryKey(layout.getPlid(), portletId);
		ResourceLocalServiceUtil.addResources(layout.getCompanyId(), layout.getGroupId(), 0, rootPortletId, portletPrimaryKey, true, true, true);
	}
}
