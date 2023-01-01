/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  o Redistributions of source code must retain the above copyright notice, 
 *    this list of conditions and the following disclaimer. 
 *     
 *  o Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution. 
 *     
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission. 
 *     
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */
package org.pushingpixels.radiance.component.api.common.popup;

import org.pushingpixels.radiance.component.internal.theming.common.ui.RadiancePopupPanelUI;
import org.pushingpixels.radiance.component.internal.ui.common.popup.PopupPanelUI;

import javax.swing.*;
import java.awt.*;

/**
 * Base class for popup panels.
 * 
 * @author Kirill Grouchnikov
 * @see PopupPanelManager#showPopup(JComponent, JPopupPanel, int, int)
 */
public abstract class JPopupPanel extends JPanel {
	/**
	 * @see #getUIClassID
	 */
	public static final String uiClassID = "PopupPanelUI";

	/**
	 * The customizer for this popup panel. Can be <code>null</code>.
	 * 
	 * @see #getCustomizer()
	 * @see #setCustomizer(PopupPanelCustomizer)
	 */
	private PopupPanelCustomizer customizer;
	
	private JComponent originator;

	/**
	 * Allows providing custom application logic for computing the screen bounds
	 * of popup panels before they are shown on the screen.
	 * 
	 * @author Kirill Grouchnikov
	 */
	@FunctionalInterface
	public interface PopupPanelCustomizer {
		/**
		 * Returns the requested screen bounds of the associated popup panel.
		 * 
		 * @return The requested screen bounds of the associated popup panel.
		 */
		Rectangle getScreenBounds();
	}

	/**
	 * Protected to prevent direct instantiation.
	 */
	protected JPopupPanel() {
	}

	@Override
	public PopupPanelUI getUI() {
		return (PopupPanelUI) ui;
	}

	/**
	 * Sets the popup panel UI delegate that renders this component.
	 * 
	 * @param ui the popup panel UI delegate
	 */
	protected void setUI(PopupPanelUI ui) {
		super.setUI(ui);
	}

	@Override
	public String getUIClassID() {
		return uiClassID;
	}

	@Override
	public void updateUI() {
		setUI(RadiancePopupPanelUI.createUI(this));
	}

	/**
	 * Sets the customizer for this popup panel.
	 * 
	 * @param customizer
	 *            The customizer for this popup panel.
	 * @see #getCustomizer()
	 */
	public void setCustomizer(PopupPanelCustomizer customizer) {
		this.customizer = customizer;
	}

	/**
	 * Returns the customizer of this popup panel. Can return <code>null</code>.
	 * 
	 * @return The customizer of this popup panel.
	 * @see #setCustomizer(PopupPanelCustomizer)
	 */
	public PopupPanelCustomizer getCustomizer() {
		return this.customizer;
	}
	
	/**
	 * Sets the originator of this popup panel.
     *
     * @param originator
     *            The originator for this popup panel.
     * @see #getOriginator()
	 */
	public void setOriginator(JComponent originator) {
		this.originator = originator;
	}

	/**
	 * Returns the invoker of this popup panel.
     *
     * @return The invoker of this popup panel.
     * @see #setOriginator(JComponent)
	 */
	public JComponent getOriginator() {
		return originator;
	}
}
