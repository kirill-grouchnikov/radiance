/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.tabbed;

import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import javax.swing.*;
import java.awt.event.MouseEvent;

/**
 * Callback for registering app-specific behaviour on tab close buttons. This
 * class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public interface TabCloseCallback {
	/**
	 * Invoked when the tab area (not close button) is clicked.
	 * 
	 * @param tabbedPane
	 *            Tabbed pane.
	 * @param tabIndex
	 *            Index of the tab under the click.
	 * @param mouseEvent
	 *            Mouse event.
	 * @return Tab close kind.
	 */
    RadianceThemingSlices.TabCloseKind onAreaClick(JTabbedPane tabbedPane, int tabIndex,
                                                   MouseEvent mouseEvent);

	/**
	 * Invoked when the tab close button is clicked.
	 * 
	 * @param tabbedPane
	 *            Tabbed pane.
	 * @param tabIndex
	 *            Index of the tab under the click.
	 * @param mouseEvent
	 *            Mouse event.
	 * @return Tab close kind.
	 */
    RadianceThemingSlices.TabCloseKind onCloseButtonClick(JTabbedPane tabbedPane,
                                                          int tabIndex, MouseEvent mouseEvent);

	/**
	 * Returns the tooltip for the tab area (not close button).
	 * 
	 * @param tabbedPane
	 *            Tabbed pane.
	 * @param tabIndex
	 *            Index of the tab under the mouse.
	 * @return Tooltip for the tab area.
	 */
    String getAreaTooltip(JTabbedPane tabbedPane, int tabIndex);

	/**
	 * Returns the tooltip for the tab close button.
	 * 
	 * @param tabbedPane
	 *            Tabbed pane.
	 * @param tabIndex
	 *            Index of the tab under the mouse.
	 * @return Tooltip for the tab close button.
	 */
    String getCloseButtonTooltip(JTabbedPane tabbedPane, int tabIndex);
}
