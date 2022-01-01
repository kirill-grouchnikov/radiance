/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;
import org.pushingpixels.radiance.theming.internal.utils.icon.MenuArrowIcon;
import org.pushingpixels.radiance.theming.internal.utils.menu.MenuUtilities;
import org.pushingpixels.radiance.theming.internal.utils.menu.RadianceMenu;
import org.pushingpixels.radiance.theming.internal.widget.animation.effects.GhostPaintingUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuUI;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;

/**
 * UI for menus in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceMenuUI extends BasicMenuUI implements RadianceMenu,
		TransitionAwareUI {
	/**
	 * For rollover effects - enhancement 93.
	 */
	private MouseListener radianceMouseListener;

	private StateTransitionTracker stateTransitionTracker;

	/**
	 * Listens on all changes to the underlying menu item.
	 */
	private MenuUtilities.MenuPropertyListener radianceMenuPropertyListener;

	/**
	 * Property change listener. Listens on changes to
	 * {@link AbstractButton#MODEL_CHANGED_PROPERTY} property.
	 */
	private PropertyChangeListener radiancePropertyListener;

	/**
	 * For rollover effects - enhancement 93.
	 */
	private FocusListener radianceFocusListener;

	public static ComponentUI createUI(JComponent comp) {
		RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new RadianceMenuUI((JMenu) comp);
	}

	private RadianceMenuUI(JMenu menuItem) {
		this.stateTransitionTracker = new StateTransitionTracker(menuItem, menuItem.getModel());
	}

	@Override
	protected void installDefaults() {
		super.installDefaults();
		this.menuItem.setRolloverEnabled(true);
		// this.menuItem.setOpaque(false);

		this.arrowIcon = new MenuArrowIcon((JMenu) this.menuItem);

		this.defaultTextIconGap = RadianceSizeUtils
				.getTextIconGap(RadianceSizeUtils
						.getComponentFontSize(this.menuItem));

        RadianceThemingCortex.ComponentOrParentScope.setBackgroundAppearanceStrategy(this.menuItem,
				RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT);

		LookAndFeel.installProperty(menuItem, "opaque", Boolean.FALSE);
	}

	@Override
	protected void installListeners() {
		super.installListeners();

		// Improving performance on big menus.
		this.radianceMenuPropertyListener = new MenuUtilities.MenuPropertyListener(
				this.menuItem);
		this.radianceMenuPropertyListener.install();

		this.stateTransitionTracker.registerModelListeners();

		// fix for enhancement 93 - rollover effects on menu items
		this.radianceMouseListener = new MouseAdapter() {
			// fix for defect 93 - no rollover effects on menu
			// items that are not in the selected path
			private boolean toRepaint() {
				MenuElement[] selectedMenuPath = MenuSelectionManager
						.defaultManager().getSelectedPath();
				for (MenuElement elem : selectedMenuPath) {
					if (elem == RadianceMenuUI.this.menuItem) {
						return true;
					}
				}
				return (selectedMenuPath.length == 0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				if (this.toRepaint()) {
					stateTransitionTracker.turnOffModelChangeTracking();
					menuItem.getModel().setRollover(true);
					stateTransitionTracker.onModelStateChanged();
					// fix for issue 371 - repaint the menu bar since the
					// menu is marked as flat
					Rectangle bounds = menuItem.getBounds();
					menuItem.getParent().repaint(bounds.x, bounds.y,
							bounds.width, bounds.height);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (this.toRepaint()) {
					stateTransitionTracker.turnOffModelChangeTracking();
					menuItem.getModel().setRollover(false);
					stateTransitionTracker.onModelStateChanged();
					// fix for issue 371 - repaint the menu bar since the
					// menu is marked as flat
					Rectangle bounds = menuItem.getBounds();
					menuItem.getParent().repaint(bounds.x, bounds.y,
							bounds.width, bounds.height);
				}
			}
		};
		this.menuItem.addMouseListener(this.radianceMouseListener);
		this.radianceFocusListener = new FocusAdapter() {
			// fix for defect 93 - no rollover effects on menu
			// items that are not in the selected path
			private boolean toRepaint() {
				MenuElement[] selectedMenuPath = MenuSelectionManager
						.defaultManager().getSelectedPath();
				for (MenuElement elem : selectedMenuPath) {
					if (elem == RadianceMenuUI.this.menuItem) {
						return true;
					}
				}
				return (selectedMenuPath.length == 0);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (toRepaint()) {
					stateTransitionTracker.turnOffModelChangeTracking();
					menuItem.getModel().setRollover(false);
					stateTransitionTracker.onModelStateChanged();
					// fix for issue 371 - repaint the menu bar since the
					// menu is marked as flat
					Rectangle bounds = menuItem.getBounds();
					menuItem.getParent().repaint(bounds.x, bounds.y,
							bounds.width, bounds.height);
				}
			}
		};
		this.menuItem.addFocusListener(this.radianceFocusListener);

		this.radiancePropertyListener = propertyChangeEvent -> {
			if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(propertyChangeEvent
					.getPropertyName())) {
				stateTransitionTracker.setModel((ButtonModel) propertyChangeEvent
						.getNewValue());
			}
			if ("font".equals(propertyChangeEvent.getPropertyName())) {
				SwingUtilities.invokeLater(() -> {
					if (menuItem != null) {
						menuItem.updateUI();
					}
				});
			}
		};
		this.menuItem.addPropertyChangeListener(this.radiancePropertyListener);
	}

	@Override
	protected void uninstallListeners() {
		super.uninstallListeners();

		// Improving performance on big menus.
		this.radianceMenuPropertyListener.uninstall();
		this.radianceMenuPropertyListener = null;

		// fix for enhancement 93 - rollover effects on menu items
		this.menuItem.removeMouseListener(this.radianceMouseListener);
		this.radianceMouseListener = null;
		this.menuItem.removeFocusListener(this.radianceFocusListener);
		this.radianceFocusListener = null;

		this.menuItem
				.removePropertyChangeListener(this.radiancePropertyListener);
		this.radiancePropertyListener = null;

		this.stateTransitionTracker.unregisterModelListeners();
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

		if (MenuUtilities.getPopupLayoutMetrics(menuItem, false) != null) {
			return new Dimension(MenuUtilities.getPreferredWidth(menuItem),
					superDim.height);
		}

		return superDim;
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
		return true;
	}

	@Override
	public void update(Graphics g, JComponent c) {
		Graphics2D g2d = (Graphics2D) g.create();
		RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
		super.update(g2d, c);
		GhostPaintingUtils.paintGhostImages(c, g2d);
		g2d.dispose();
	}
	
	public void updateCheckIconIfNeeded() {
	}
}
