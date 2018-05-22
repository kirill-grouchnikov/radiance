/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.utils.RolloverMenuItemListener;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;
import org.pushingpixels.substance.internal.utils.icon.RadioButtonMenuItemIcon;
import org.pushingpixels.substance.internal.utils.menu.MenuUtilities;
import org.pushingpixels.substance.internal.utils.menu.MenuUtilities.MenuPropertyListener;
import org.pushingpixels.substance.internal.utils.menu.SubstanceMenu;

/**
 * UI for radio button menu items in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceRadioButtonMenuItemUI extends BasicRadioButtonMenuItemUI
		implements SubstanceMenu, TransitionAwareUI {
	/**
	 * Rollover listener.
	 */
	protected RolloverMenuItemListener substanceRolloverListener;

	protected StateTransitionTracker stateTransitionTracker;

	/**
	 * Property change listener. Listens on changes to
	 * {@link AbstractButton#MODEL_CHANGED_PROPERTY} property.
	 */
	protected PropertyChangeListener substancePropertyListener;

	/**
	 * Listens on all changes to the underlying menu item.
	 */
	protected MenuPropertyListener substanceMenuPropertyListener;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.plaf.ComponentUI#createUI(javax.swing.JComponent)
	 */
	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		JRadioButtonMenuItem item = (JRadioButtonMenuItem) comp;
		item.setRolloverEnabled(true);

		return new SubstanceRadioButtonMenuItemUI((JRadioButtonMenuItem) comp);
	}

	public SubstanceRadioButtonMenuItemUI(JRadioButtonMenuItem menuItem) {
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

		this.substancePropertyListener = (PropertyChangeEvent evt) -> {
			if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(evt
					.getPropertyName())) {
				stateTransitionTracker.setModel((ButtonModel) evt
						.getNewValue());
			}
			if ("font".equals(evt.getPropertyName())) {
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
	protected void uninstallListeners() {
		super.uninstallListeners();

		// Improving performance on big menus.
		this.substanceMenuPropertyListener.uninstall();
		this.substanceMenuPropertyListener = null;

		// fix for defect 109 - unregistering rollover listener
		this.menuItem.removeMouseListener(this.substanceRolloverListener);
		this.substanceRolloverListener = null;

		this.menuItem
				.removePropertyChangeListener(this.substancePropertyListener);
		this.substancePropertyListener = null;

		this.stateTransitionTracker.unregisterModelListeners();
	}

	@Override
	protected void installDefaults() {
		super.installDefaults();
		this.updateCheckIconIfNeeded();
		this.defaultTextIconGap = SubstanceSizeUtils
				.getTextIconGap(SubstanceSizeUtils
						.getComponentFontSize(this.menuItem));
	}
	
	@Override
	public void updateCheckIconIfNeeded() {
        if (this.checkIcon == null || this.checkIcon instanceof UIResource) {
            this.checkIcon = new RadioButtonMenuItemIcon(this.menuItem,
                    SubstanceSizeUtils.getMenuCheckMarkSize(SubstanceSizeUtils
                            .getComponentFontSize(this.menuItem)));
        }
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
		return this.checkIcon;
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
	public boolean isInside(MouseEvent me) {
		return this.menuItem.getBounds().contains(me.getX(), me.getY());
	}

	@Override
	public StateTransitionTracker getTransitionTracker() {
		return this.stateTransitionTracker;
	}

	@Override
	protected void paintMenuItem(Graphics g, JComponent c, Icon checkIcon,
			Icon arrowIcon, Color background, Color foreground,
			int defaultTextIconGap) {
		MenuUtilities.paintMenuItem(g, menuItem, checkIcon, arrowIcon,
				defaultTextIconGap);
	}

	@Override
	public void update(Graphics g, JComponent c) {
		Graphics2D g2d = (Graphics2D) g.create();
		RenderingUtils.installDesktopHints(g2d, c);
		super.update(g2d, c);
		g2d.dispose();
	}
}
