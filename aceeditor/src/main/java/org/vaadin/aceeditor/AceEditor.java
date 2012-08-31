package org.vaadin.aceeditor;

import org.vaadin.aceeditor.gwt.ace.AceMode;
import org.vaadin.aceeditor.gwt.ace.AceTheme;

import com.vaadin.terminal.PaintException;
import com.vaadin.terminal.PaintTarget;
import com.vaadin.ui.AbstractTextField;

/**
 * Vaadin Ace editor.
 * 
 * @see <a href="http://ace.ajax.org">Ace Editor</a>
 * 
 */
@SuppressWarnings({ "serial", "unchecked" })
@com.vaadin.ui.ClientWidget(org.vaadin.aceeditor.gwt.client.VAceEditor.class)
public class AceEditor extends AbstractTextField {

	private static final String DEFAULT_WIDTH = "400px";
	private static final String DEFAULT_HEIGHT = "300px";

	private AceMode mode = null;
	private AceTheme theme = null;
	private String fontSize = "12px";
	private Boolean hScrollVisible = false;
	private Boolean useWrapMode = false;


	/**
	 * Initializes the editor with an empty string as content.
	 */
	public AceEditor() {
		super();
		setValue("");
		setWidth(DEFAULT_WIDTH);
		setHeight(DEFAULT_HEIGHT);
	}

	/**
	 * 
	 */
	public AceMode getMode() {
		return mode;
	}

	/**
	 * Sets the Ace mode.
	 * 
	 * @param mode
	 */
	public void setMode(AceMode mode) {
		this.mode = mode;
		requestRepaint();
	}

	/**
	 * 
	 */
	public AceTheme getTheme() {
		return theme;
	}

	/**
	 * Sets the Ace theme.
	 * 
	 * @param theme
	 */
	public void setTheme(AceTheme theme) {
		this.theme = theme;
		requestRepaint();
	}

	/**
	 * 
	 */
	public String getFontSize() {
		return fontSize;
	}

	/**
	 * 
	 * @param fontSize
	 */
	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
		requestRepaint();
	}

	/**
	 * 
	 */
	public boolean gethScrollVisible() {
		return hScrollVisible;
	}

	/**
	 * 
	 * @param hScrollVisible
	 */
	public void sethScrollVisible(Boolean hScrollVisible) {
		this.hScrollVisible = hScrollVisible;
		requestRepaint();
	}
	
	public Boolean getUseWrapMode() {
		return useWrapMode;
	}

	public void setUseWrapMode(Boolean useWrapMode) {
		this.useWrapMode = useWrapMode;
		requestRepaint();
	}

	@Override
	public void paintContent(PaintTarget target) throws PaintException {
		super.paintContent(target);
		if (mode != null) {
			target.addAttribute("ace-mode", mode.toString());
		}
		if (theme != null) {
			target.addAttribute("ace-theme", theme.toString());
		}
		if (fontSize != null) {
			target.addAttribute("ace-font-size", fontSize);
		}
		target.addAttribute("ace-hscroll-visible", hScrollVisible);
		target.addAttribute("ace-use-wrapmode", useWrapMode);
	}

}
