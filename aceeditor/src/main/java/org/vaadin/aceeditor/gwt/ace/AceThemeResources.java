package org.vaadin.aceeditor.gwt.ace;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.DataResource.MimeType;

public interface AceThemeResources extends ClientBundle {
	AceThemeResources INSTANCE = GWT.create(AceThemeResources.class);
	
	@Source("aceresources/theme-chrome.js")
	@MimeType("application/javascript")
	DataResource chrome();
	
	@Source("aceresources/theme-clouds.js")
	@MimeType("application/javascript")
	DataResource clouds();
	
	@Source("aceresources/theme-clouds_midnight.js")
	@MimeType("application/javascript")
	DataResource clouds_midnight();
	
	@Source("aceresources/theme-cobalt.js")
	@MimeType("application/javascript")
	DataResource cobalt();
	
	@Source("aceresources/theme-crimson_editor.js")
	@MimeType("application/javascript")
	DataResource crimson_editor();
	
	@Source("aceresources/theme-dawn.js")
	@MimeType("application/javascript")
	DataResource dawn();
	
	@Source("aceresources/theme-dreamweaver.js")
	@MimeType("application/javascript")
	DataResource dreamweaver();
	
	@Source("aceresources/theme-eclipse.js")
	@MimeType("application/javascript")
	DataResource eclipse();
	
	@Source("aceresources/theme-idle_fingers.js")
	@MimeType("application/javascript")
	DataResource idle_fingers();
	
	@Source("aceresources/theme-kr_theme.js")
	@MimeType("application/javascript")
	DataResource kr_theme();
	
	@Source("aceresources/theme-merbivore.js")
	@MimeType("application/javascript")
	DataResource merbivore();
	
	@Source("aceresources/theme-merbivore_soft.js")
	@MimeType("application/javascript")
	DataResource merbivore_soft();
	
	@Source("aceresources/theme-mono_industrial.js")
	@MimeType("application/javascript")
	DataResource mono_industrial();
	
	@Source("aceresources/theme-monokai.js")
	@MimeType("application/javascript")
	DataResource monokai();
	
	@Source("aceresources/theme-pastel_on_dark.js")
	@MimeType("application/javascript")
	DataResource pastel_on_dark();
	
	@Source("aceresources/theme-solarized_dark.js")
	@MimeType("application/javascript")
	DataResource solarized_dark();
	
	@Source("aceresources/theme-solarized_light.js")
	@MimeType("application/javascript")
	DataResource solarized_light();
	
	@Source("aceresources/theme-textmate.js")
	@MimeType("application/javascript")
	DataResource textmate();
	
	@Source("aceresources/theme-tomorrow.js")
	@MimeType("application/javascript")
	DataResource tomorrow();
	
	@Source("aceresources/theme-tomorrow_night.js")
	@MimeType("application/javascript")
	DataResource tomorrow_night();
	
	@Source("aceresources/theme-tomorrow_night_blue.js")
	@MimeType("application/javascript")
	DataResource tomorrow_night_blue();
	
	@Source("aceresources/theme-tomorrow_night_bright.js")
	@MimeType("application/javascript")
	DataResource tomorrow_night_bright();
	
	@Source("aceresources/theme-tomorrow_night_eighties.js")
	@MimeType("application/javascript")
	DataResource tomorrow_night_eighties();

	@Source("aceresources/theme-twilight.js")
	@MimeType("application/javascript")
	DataResource twilight();
	
	@Source("aceresources/theme-vibrant_ink.js")
	@MimeType("application/javascript")
	DataResource vibrant_ink();
}
