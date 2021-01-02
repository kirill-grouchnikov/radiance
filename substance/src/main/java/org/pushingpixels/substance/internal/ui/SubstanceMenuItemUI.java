/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.internal.ui;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.utils.RolloverMenuItemListener;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.menu.MenuUtilities;
import org.pushingpixels.substance.internal.utils.menu.MenuUtilities.MenuPropertyListener;
import org.pushingpixels.substance.internal.utils.menu.SubstanceMenu;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuItemUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;

/**
 * UI for menu items in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceMenuItemUI extends BasicMenuItemUI implements
		SubstanceMenu, TransitionAwareUI {
	private StateTransitionTracker stateTransitionTracker;

	/**
	 * Listens on all changes to the underlying menu item.
	 */
	private MenuPropertyListener substanceMenuPropertyListener;

	/**
	 * Rollover listener.
	 */
	private RolloverMenuItemListener substanceRolloverListener;

	private PropertyChangeListener substancePropertyListener;

	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstanceMenuItemUI((JMenuItem) comp);
	}

	private SubstanceMenuItemUI(JMenuItem menuItem) {
		this.stateTransitionTracker = new StateTransitionTracker(menuItem,
				menuItem.getModel());
	}

	@Override
	protected void installListeners() {
		super.installListeners();

		// Improving performance on big menus.
		this.substanceMenuPropertyListener = new MenuPropertyListener(
				this.menuItem);
		this.substanceMenuPropertyListener.install();

		// fix for defect 109 - storing reference to rollover listener
		this.substanceRolloverListener = new RolloverMenuItemListener(
				this.menuItem, this.stateTransitionTracker);
		this.menuItem.addMouseListener(this.substanceRolloverListener);

		this.stateTransitionTracker.registerModelListeners();

		this.substancePropertyListener = propertyChangeEvent -> {
			if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
				stateTransitionTracker.setModel((ButtonModel) propertyChangeEvent.getNewValue());
			}
			if ("font".equals(propertyChangeEvent.getPropertyName())) {
				SwingUtilities.invokeLater(() -> {
					if (menuItem != null) {
						menuItem.updateUI();
					}
				});
			}
		};
		this.menuItem.addPropertyChangeListener(this.substancePropertyListener);
	}

	@Override
	protected void installDefaults() {
		super.installDefaults();

		this.defaultTextIconGap = SubstanceSizeUtils.getTextIconGap(
		        SubstanceSizeUtils.getComponentFontSize(this.menuItem));
	}
	
	@Override
	public void updateCheckIconIfNeeded() {
	}

	@Override
	protected void uninstallListeners() {
		// Improving performance on big menus.
		this.substanceMenuPropertyListener.uninstall();
		this.substanceMenuPropertyListener = null;

		// fix for defect 109 - unregistering rollover listener
		this.menuItem.removeMouseListener(this.substanceRolloverListener);
		this.substanceRolloverListener = null;

		this.stateTransitionTracker.unregisterModelListeners();

		this.menuItem
				.removePropertyChangeListener(this.substancePropertyListener);
		this.substancePropertyListener = null;

		super.uninstallListeners();
	}

    @Override
	public JMenuItem getAssociatedMenuItem() {
		return this.menuItem;
	}

    @Override
	public Font getAcceleratorFont() {
		return this.acceleratorFont;
	}

    @Override
	public Icon getArrowIcon() {
		return this.arrowIcon;
	}

    @Override
	public Icon getCheckIcon() {
		return null;
	}

    @Override
	public int getDefaultTextIconGap() {
		return this.defaultTextIconGap;
	}

	@Override
	protected Dimension getPreferredMenuItemSize(JComponent c, Icon checkIcon,
			Icon arrowIcon, int defaultTextIconGap) {
		Dimension superDim = super.getPreferredMenuItemSize(c, checkIcon,
				arrowIcon, defaultTextIconGap);
		return new Dimension(MenuUtilities.getPreferredWidth(menuItem),
				superDim.height);
	}

	@Override
	protected void paintMenuItem(Graphics g, JComponent c, Icon checkIcon,
			Icon arrowIcon, Color background, Color foreground,
			int defaultTextIconGap) {
		MenuUtilities.paintMenuItem(g, menuItem, checkIcon, arrowIcon);
	}

	@Override
	public StateTransitionTracker getTransitionTracker() {
		return this.stateTransitionTracker;
	}

	@Override
	public boolean isInside(MouseEvent me) {
		return this.menuItem.getBounds().contains(me.getX(), me.getY());
	}

	@Override
	public void update(Graphics g, JComponent c) {
		Graphics2D g2d = (Graphics2D) g.create();
		NeonCortex.installDesktopHints(g2d, c.getFont());
		super.update(g2d, c);
		g2d.dispose();
	}
}
