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
import java.awt.Rectangle;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.LookAndFeel;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuUI;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;
import org.pushingpixels.substance.internal.utils.icon.MenuArrowIcon;
import org.pushingpixels.substance.internal.utils.menu.MenuUtilities;
import org.pushingpixels.substance.internal.utils.menu.MenuUtilities.MenuPropertyListener;
import org.pushingpixels.substance.internal.utils.menu.SubstanceMenu;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostPaintingUtils;

/**
 * UI for menus in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceMenuUI extends BasicMenuUI implements SubstanceMenu,
		TransitionAwareUI {
	/**
	 * For rollover effects - enhancement 93.
	 */
	protected MouseListener substanceMouseListener;

	protected StateTransitionTracker stateTransitionTracker;

	/**
	 * Listens on all changes to the underlying menu item.
	 */
	protected MenuPropertyListener substanceMenuPropertyListener;

	/**
	 * Property change listener. Listens on changes to
	 * {@link AbstractButton#MODEL_CHANGED_PROPERTY} property.
	 */
	protected PropertyChangeListener substancePropertyListener;

	/**
	 * For rollover effects - enhancement 93.
	 */
	protected FocusListener substanceFocusListener;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.plaf.ComponentUI#createUI(javax.swing.JComponent)
	 */
	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstanceMenuUI((JMenu) comp);
	}

	public SubstanceMenuUI(JMenu menuItem) {
		this.stateTransitionTracker = new StateTransitionTracker(menuItem,
				menuItem.getModel());
	}

	@Override
	protected void installDefaults() {
		super.installDefaults();
		this.menuItem.setRolloverEnabled(true);
		// this.menuItem.setOpaque(false);

		this.arrowIcon = new MenuArrowIcon((JMenu) this.menuItem);

		this.defaultTextIconGap = SubstanceSizeUtils
				.getTextIconGap(SubstanceSizeUtils
						.getComponentFontSize(this.menuItem));

        SubstanceCortex.ComponentOrParentScope.setFlatBackground(this.menuItem, true);

		LookAndFeel.installProperty(menuItem, "opaque", Boolean.FALSE);
	}

	@Override
	protected void installListeners() {
		super.installListeners();

		// Improving performance on big menus.
		this.substanceMenuPropertyListener = new MenuPropertyListener(
				this.menuItem);
		this.substanceMenuPropertyListener.install();

		this.stateTransitionTracker.registerModelListeners();

		// fix for enhancement 93 - rollover effects on menu items
		this.substanceMouseListener = new MouseAdapter() {
			// fix for defect 93 - no rollover effects on menu
			// items that are not in the selected path
			private boolean toRepaint() {
				MenuElement[] selectedMenuPath = MenuSelectionManager
						.defaultManager().getSelectedPath();
				for (MenuElement elem : selectedMenuPath) {
					if (elem == SubstanceMenuUI.this.menuItem) {
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
		this.menuItem.addMouseListener(this.substanceMouseListener);
		this.substanceFocusListener = new FocusAdapter() {
			// fix for defect 93 - no rollover effects on menu
			// items that are not in the selected path
			private boolean toRepaint() {
				MenuElement[] selectedMenuPath = MenuSelectionManager
						.defaultManager().getSelectedPath();
				for (MenuElement elem : selectedMenuPath) {
					if (elem == SubstanceMenuUI.this.menuItem) {
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
		this.menuItem.addFocusListener(this.substanceFocusListener);

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

		// fix for enhancement 93 - rollover effects on menu items
		this.menuItem.removeMouseListener(this.substanceMouseListener);
		this.substanceMouseListener = null;
		this.menuItem.removeFocusListener(this.substanceFocusListener);
		this.substanceFocusListener = null;

		this.menuItem
				.removePropertyChangeListener(this.substancePropertyListener);
		this.substancePropertyListener = null;

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
		MenuUtilities.paintMenuItem(g, menuItem, checkIcon, arrowIcon,
				defaultTextIconGap);
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
		RenderingUtils.installDesktopHints(g2d, c);
		super.update(g2d, c);
		GhostPaintingUtils.paintGhostImages(c, g2d);
		g2d.dispose();
	}
	
	public void updateCheckIconIfNeeded() {
	}
}
