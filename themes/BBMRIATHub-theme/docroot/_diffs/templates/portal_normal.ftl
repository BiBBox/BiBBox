<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${the_title} - ${company_name}</title>

	<meta name="GOOGLEBOT" content="NOINDEX, NOFOLLOW">
	<meta name="ROBOTS" content="NOINDEX, NOFOLLOW">
	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	${theme.include(top_head_include)}
</head>

<body class="${css_class} rdbody">

${theme.include(body_top_include)}

<#if is_signed_in>
	<#if is_admin>
		<@liferay.dockbar />
	</#if>
</#if>

<div class="rdconnect-header-container">
	<div class="rdconnect-header-container-top">
		<div class="rdconnect-header-container-inner">
			<div class="rdconnect-header-container-top-rdlogo">
				<a href="http://rd-connect.bibbox.org/home">
				  <img alt="RD-Connect-IDCard-Logo" height="27px" width="168px" src="/BBMRIATHub-theme/images/bbmriat.png" />
				</a>
			</div>
			<div class="rdconnect-header-container-top-menue">
				<#assign locPortletId = "portalmenu_WAR_RDConnectportlet" />
				 
				<#assign PortletPreferencesFactoryUtil = staticUtil["com.liferay.portlet.PortletPreferencesFactoryUtil"] />
				<#assign portletSetup = PortletPreferencesFactoryUtil.getLayoutPortletSetup(layout, locPortletId) />
				 
				<#if portletSetup.getValue("portletSetupShowBorders", "") != "false" >
					<#assign temp = portletSetup.setValue("portletSetupShowBorders", "false") />
					<#assign temp = portletSetup.store() />
				</#if>
				 
				${theme.runtime(locPortletId, "", "")}
			</div>
		</div>
	</div>
	<div class="rdconnect-header-container-bottom">
		<div class="rdconnect-header-container-inner">
			<#assign locPortletId = "portalhubinformation_WAR_RDConnectportlet" />
				 
			<#assign PortletPreferencesFactoryUtil = staticUtil["com.liferay.portlet.PortletPreferencesFactoryUtil"] />
			<#assign portletSetup = PortletPreferencesFactoryUtil.getLayoutPortletSetup(layout, locPortletId) />
				 
			<#if portletSetup.getValue("portletSetupShowBorders", "") != "false" >
				<#assign temp = portletSetup.setValue("portletSetupShowBorders", "false") />
				<#assign temp = portletSetup.store() />
			</#if>
				 
			${theme.runtime(locPortletId, "", "")}
		</div>
	</div>
</div>

<div class="container-fluid" id="wrapper">
	<div id="content"> 

		<#if selectable>
			${theme.include(content_include)}
		<#else>
			${portletDisplay.recycle()}

			${portletDisplay.setTitle(the_title)}

			${theme.wrapPortlet("portlet.ftl", content_include)}
		</#if>
	</div>
	
	
</div>
<footer id="footer" role="contentinfo">
		<p class="powered-by">
			Linking up rare disease resarch across the world<br/> <a href="http://www.rd-connect.eu" rel="external">RD-Connect</a>
		</p>
</footer>
${theme.include(body_bottom_include)}

${theme.include(bottom_include)}

</body>

</html>