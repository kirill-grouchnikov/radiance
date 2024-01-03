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
package org.pushingpixels.radiance.theming.internal.ui;

import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.menu.MenuUtilities;

import javax.swing.*;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPopupMenuUI;
import java.awt.*;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

/**
 * UI for popup menus in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadiancePopupMenuUI extends BasicPopupMenuUI {
	/**
	 * Tracks changes to the popup menu and invalidates precomputed text offset.
	 */
	private ContainerListener radianceContainerListener;

	private PopupMenuListener radiancePopupMenuListener;

	public static ComponentUI createUI(JComponent comp) {
		RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new RadiancePopupMenuUI();
	}

	protected RadiancePopupMenuUI() {
	}

	@Override
	protected void installListeners() {
		super.installListeners();

		this.radianceContainerListener = new ContainerListener() {
			public void componentAdded(ContainerEvent e) {
				MenuUtilities.cleanPopupLayoutMetrics(popupMenu);
			}

			public void componentRemoved(ContainerEvent e) {
				MenuUtilities.cleanPopupLayoutMetrics(popupMenu);
			}
		};
		this.popupMenu.addContainerListener(this.radianceContainerListener);

		this.radiancePopupMenuListener = new PopupMenuListener() {
			@Override
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
			}

			@Override
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
				// go over all elements in the popup menu and mark them as
				// unarmed if necessary
				for (int i = 0; i < popupMenu.getComponentCount(); i++) {
					Component comp = popupMenu.getComponent(i);
					if (comp instanceof JMenuItem) {
						JMenuItem menuItem = (JMenuItem) comp;
						if (menuItem.isEnabled()
								&& menuItem.getModel().isArmed())
							menuItem.getModel().setArmed(false);
					}
				}
			}

			@Override
			public void popupMenuCanceled(PopupMenuEvent e) {
				// go over all elements in the popup menu and mark them as
				// unarmed if necessary
				for (int i = 0; i < popupMenu.getComponentCount(); i++) {
					Component comp = popupMenu.getComponent(i);
					if (comp instanceof JMenuItem) {
						JMenuItem menuItem = (JMenuItem) comp;
						if (menuItem.isEnabled()
								&& menuItem.getModel().isArmed())
							menuItem.getModel().setArmed(false);
					}
				}
			}
		};
		this.popupMenu.addPopupMenuListener(this.radiancePopupMenuListener);
	}

	@Override
	protected void uninstallListeners() {
		this.popupMenu.removeContainerListener(this.radianceContainerListener);
		this.radianceContainerListener = null;

		this.popupMenu.removePopupMenuListener(this.radiancePopupMenuListener);
		this.radiancePopupMenuListener = null;

		super.uninstallListeners();
	}
	
	@Override
	public void paint(Graphics g, JComponent c) {
		BackgroundPaintingUtils.update(g, c, false);
	}
}
