package org.vaadin.aceeditor.gwt.ace;

import java.util.LinkedList;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ExternalTextResource;
import com.google.gwt.resources.client.TextResource;

/**
 * Helper for loading Ace {@link AceMode modes} and {@link AceTheme themes}.
 * 
 */
public class GwtAceFileLoadUtil {

	public interface LoadListener {
		/**
		 * This is called when the load is complete, whether successful or not.
		 * 
		 * It's the listeners job to check if the loading was successful.
		 */
		public void loadComplete();
	}

	/**
	 * Tries to load script from the given URL. The listener is called when
	 * done.
	 * 
	 * @param url
	 * @param lis
	 */
	public static final native void loadScript(String url, LoadListener lis) /*-{
		var script = $doc.createElement("script")
		script.type = "text/javascript";
		
		if (script.readyState){  //IE
			script.onreadystatechange = function() {
				if (script.readyState == "loaded" || script.readyState == "complete"){
					script.onreadystatechange = null;
					lis.@org.vaadin.aceeditor.gwt.ace.GwtAceFileLoadUtil.LoadListener::loadComplete()();
				}
			};
		} else {  //Others
			script.onload = function(){
				lis.@org.vaadin.aceeditor.gwt.ace.GwtAceFileLoadUtil.LoadListener::loadComplete()();
			};
			script.onerror = function() {
				lis.@org.vaadin.aceeditor.gwt.ace.GwtAceFileLoadUtil.LoadListener::loadComplete()();
			};
		}
		
		script.src = url;
		$doc.getElementsByTagName("head")[0].appendChild(script);
	}-*/;

	public static final JavaScriptObject getObject(AceMode mode) {
		return getObject(mode.toString());
	}

	public static final boolean isAvailable(AceMode mode) {
		return isModeAvailable(mode.toString());
	}

	private static native JavaScriptObject getObject(String mode) /*-{
		var modePackage = $wnd.require("ace/mode/"+mode);
		if (!modePackage) {
			return null;
		}
		return new modePackage.Mode();
	}-*/;

	private static native boolean isModeAvailable(String mode) /*-{
		return !!($wnd.require("ace/mode/"+mode));
	}-*/;

	public static final String getThemeString(AceTheme theme) {
		return "ace/theme/" + theme.toString();
	}

	public static final boolean isAvailable(AceTheme theme) {
		return isThemeAvailable(getThemeString(theme));
	}

	private static final native boolean isThemeAvailable(String themeString) /*-{
		return !!($wnd.require(themeString));
	}-*/;

	public static final List<AceMode> getAvailableModes() {
		LinkedList<AceMode> ams = new LinkedList<AceMode>();
		for (AceMode mode : AceMode.values()) {
			if (isAvailable(mode)) {
				ams.add(mode);
			}
		}
		return ams;
	}

	public static final List<AceTheme> getAvailableThemes() {
		LinkedList<AceTheme> ats = new LinkedList<AceTheme>();
		for (AceTheme theme : AceTheme.values()) {
			if (isAvailable(theme)) {
				ats.add(theme);
			}
		}
		return ats;
	}

	public static DataResource getResourceFor(AceMode mode) {
		AceModeResources res = AceModeResources.INSTANCE;
		
		switch(mode) {
			case c_cpp: return res.c_cpp();
			case clojure: return res.clojure();
			case coffee: return res.coffee();
			case coldfusion: return res.coldfusion();
			case csharp: return res.csharp();
			case css: return res.css();
			case groovy: return res.groovy();
			case haxe: return res.haxe();
			case html: return res.html();
			case java: return res.java();
			case javascript: return res.javascript();
			case json: return res.json();
			case latex: return res.latex();
			case lua: return res.lua();
			case markdown: return res.markdown();
			case ocaml: return res.ocaml();
			case perl: return res.perl();
			case pgsql: return res.pgsql();
			case php: return res.php();
			case powershell: return res.powershell();
			case python: return res.python();
			case ruby: return res.ruby();
			case scad: return res.scad();
			case scala: return res.scala();
			case scss: return res.scss();
			case sql: return res.sql();
			case svg: return res.svg();
			case textile: return res.textile();
			case xml: return res.xml();
			default: throw new IllegalArgumentException("No resource for mode: "+mode);
		}
	}
		
	public static DataResource getResourceFor(AceTheme theme) {
		AceThemeResources res = AceThemeResources.INSTANCE;
		
		switch(theme) {
			case chrome: return res.chrome();
			case clouds: return res.clouds();
			case clouds_midnight: return res.clouds_midnight();
			case cobalt: return res.cobalt();
			case crimson_editor: return res.crimson_editor();
			case dawn: return res.dawn();
			case dreamweaver: return res.dreamweaver();
			case eclipse: return res.eclipse();
			case idle_fingers: return res.idle_fingers();
			case kr_theme: return res.kr_theme();
			case merbivore: return res.merbivore();
			case merbivore_soft: return res.merbivore_soft();
			case mono_industrial: return res.mono_industrial();
			case monokai: return res.monokai();
			case pastel_on_dark: return res.pastel_on_dark();
			case solarized_dark: return res.solarized_dark();
			case solarized_light: return res.solarized_light();
			case textmate: return res.textmate();
			case tomorrow: return res.tomorrow();
			case tomorrow_night: return res.tomorrow_night();
			case tomorrow_night_blue: return res.tomorrow_night_blue();
			case tomorrow_night_bright: return res.tomorrow_night_bright();
			case tomorrow_night_eighties: return res.tomorrow_night_eighties();
			case twilight: return res.twilight();
			case vibrant_ink: return res.vibrant_ink();
			default: throw new IllegalArgumentException("No resource for theme: "+theme);
		}
	}

	public static DataResource getWorkerResourceFor(AceMode mode) {
//		AceModeResources res = AceModeResources.INSTANCE;
//		if (mode==AceMode.javascript) return res.javascriptWorker();
		return null;
	}
	

}
