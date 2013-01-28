package org.vaadin.aceeditor.gwt.shared;

/**
 * 
 * Errors that are shown only if editors userId equals this userId.
 * For others, a warning is shown.
 */
public class PersonalErrorMarkerData implements Marker.Data {

	private final String userId;
	private final String msg;
	
	public PersonalErrorMarkerData(String dataString) {
		String[] items = dataString.split(":", 2);
		userId = items[0];
		msg = items[1];
	}
	
	public PersonalErrorMarkerData(String userId, String msg) {
		this.userId = userId;
		this.msg = msg;
	}

	public String getUserId() {
		return userId;
	}
	
	public String getErrorMessage() {
		return msg;
	}

	public String getDataString() {
		return userId+":"+msg;
	}
}
