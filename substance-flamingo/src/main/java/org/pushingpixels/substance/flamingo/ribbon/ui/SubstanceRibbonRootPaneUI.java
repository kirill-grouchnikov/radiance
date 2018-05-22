/*
 * Copyright (c) 2005-2010 Substance Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Flamingo Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.substance.flamingo.ribbon.ui;

import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;

import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ComponentUI;

import org.pushingpixels.flamingo.api.ribbon.JRibbon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonRootPane;
import org.pushingpixels.flamingo.internal.ui.ribbon.appmenu.JRibbonApplicationMenuButton;
import org.pushingpixels.flamingo.internal.utils.FlamingoUtilities;
import org.pushingpixels.substance.internal.ui.SubstanceRootPaneUI;
import org.pushingpixels.substance.internal.utils.SubstanceTitlePane;

/**
 * UI delegate for root panes of {@link JRibbonFrame} under Substance
 * look-and-feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceRibbonRootPaneUI extends SubstanceRootPaneUI {
	/**
	 * Application menu button of this root pane.
	 */
	protected JRibbonApplicationMenuButton applicationMenuButton;

	/**
	 * Hierarchy listener to track the creation of application menu button.
	 */
	protected HierarchyListener substanceRibbonHierarchyListener;

	public static ComponentUI createUI(JComponent c) {
		return new SubstanceRibbonRootPaneUI();
	}

	@Override
	protected void installComponents(JRootPane root) {
		super.installComponents(root);

		this.createAppMenuButton(root);
	}

	@Override
	protected void installListeners(final JRootPane root) {
		super.installListeners(root);

		this.substanceRibbonHierarchyListener = (HierarchyEvent e) -> 
			SwingUtilities.invokeLater(() -> createAppMenuButton(root));

		root.addHierarchyListener(this.substanceRibbonHierarchyListener);
	}

	@Override
	protected void uninstallListeners(JRootPane root) {
		root.removeHierarchyListener(this.substanceRibbonHierarchyListener);
		this.substanceRibbonHierarchyListener = null;

		super.uninstallListeners(root);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.swing.plaf.basic.BasicRootPaneUI#uninstallComponents(javax.swing
	 * .JRootPane)
	 */
	@Override
	protected void uninstallComponents(JRootPane root) {
		root.getLayeredPane().remove(this.applicationMenuButton);
		this.applicationMenuButton = null;

		super.uninstallComponents(root);
	}

	@Override
	protected LayoutManager createLayoutManager() {
		return new SubstanceRibbonRootLayout();
	}

	@Override
	protected SubstanceTitlePane createTitlePane(JRootPane root) {
		return new SubstanceRibbonFrameTitlePane(root, this);
	}

	/**
	 * Custom layout manager for the {@link JRibbonRootPane} under Substance.
	 * 
	 * @author Kirill Grouchnikov
	 */
	protected class SubstanceRibbonRootLayout extends SubstanceRootLayout {
		@Override
		public void layoutContainer(Container parent) {
			super.layoutContainer(parent);

			if (applicationMenuButton == null)
				return;

			JRibbonRootPane ribbonRootPane = (JRibbonRootPane) root;
			JRibbonFrame ribbonFrame = (JRibbonFrame) ribbonRootPane
					.getParent();
			boolean ltr = ribbonFrame.getRibbon().getComponentOrientation()
					.isLeftToRight();
			SubstanceRibbonUI ribbonUI = (SubstanceRibbonUI) ribbonFrame
					.getRibbon().getUI();
			int appMenuButtonSize = getTitlePane().getHeight()
					+ ribbonUI.getTaskToggleButtonHeight();
			applicationMenuButton.setVisible(ribbonFrame.getRibbon()
					.getApplicationMenu() != null);
			if (ltr) {
				applicationMenuButton.setBounds(3, 3, appMenuButtonSize - 6,
						appMenuButtonSize - 6);
			} else {
				applicationMenuButton.setBounds(parent.getWidth() - 3
						- appMenuButtonSize, 3, appMenuButtonSize - 6,
						appMenuButtonSize - 6);
			}
			syncApplicationMenuTips();
			getTitlePane().doLayout();
			ribbonFrame.getRibbon().doLayout();
		}
	}

	/**
	 * Synchronizes the rich tooltip and popup keytip of the application menu
	 * button.
	 */
	public void syncApplicationMenuTips() {
		if ((this.applicationMenuButton == null)
				|| !this.applicationMenuButton.isVisible())
			return;

		JRibbonRootPane ribbonRootPane = (JRibbonRootPane) root;
		if (ribbonRootPane == null)
			return;
		JRibbonFrame ribbonFrame = (JRibbonFrame) ribbonRootPane.getParent();
		JRibbon ribbon = ribbonFrame.getRibbon();
		if (ribbon != null) {
			this.applicationMenuButton.setPopupRichTooltip(ribbon
					.getApplicationMenuRichTooltip());
			this.applicationMenuButton.setPopupKeyTip(ribbon
					.getApplicationMenuKeyTip());
		}
	}

	/**
	 * Creates the application menu button.
	 * 
	 * @param root
	 *            Root pane.
	 */
	private void createAppMenuButton(JRootPane root) {
		Window windowAncestor = SwingUtilities.getWindowAncestor(root);
		if ((applicationMenuButton == null)
				&& (windowAncestor instanceof JRibbonFrame)) {
			JRibbonFrame ribbonFrame = (JRibbonFrame) windowAncestor;
			applicationMenuButton = new JRibbonApplicationMenuButton(
					ribbonFrame.getRibbon());
			applicationMenuButton.applyComponentOrientation(ribbonFrame
					.getRibbon().getComponentOrientation());
			root.getLayeredPane().add(applicationMenuButton);
			root.getLayeredPane().setLayer(applicationMenuButton,
					JRibbonRootPane.RIBBON_SPECIAL_LAYER);
			FlamingoUtilities.updateRibbonFrameIconImages(ribbonFrame);
			JComponent titlePane = getTitlePane();
			if (titlePane != null) {
				getTitlePane().doLayout();
			}
		}
	}
}
