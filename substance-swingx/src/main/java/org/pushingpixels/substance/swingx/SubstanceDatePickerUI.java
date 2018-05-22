/*
 * Copyright 2005-2018 Kirill Grouchnikov, based on work by
 * Sun Microsystems, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.pushingpixels.substance.swingx;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Shape;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.text.JTextComponent;

import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXMonthView;
import org.jdesktop.swingx.plaf.MonthViewUI;
import org.jdesktop.swingx.plaf.basic.BasicDatePickerUI;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.Side;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities.TextComponentAware;
import org.pushingpixels.substance.internal.utils.SubstanceDropDownButton;
import org.pushingpixels.substance.internal.utils.SubstanceOutlineUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.SubstanceTextUtilities;
import org.pushingpixels.substance.internal.utils.border.SubstanceTextComponentBorder;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;

/**
 * Substance-consistent UI delegate for {@link JXDatePicker}.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceDatePickerUI extends BasicDatePickerUI {
	protected PropertyChangeListener substancePropertyChangeListener;

	protected JButton substancePopupButton;

	private Insets layoutInsets;

	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstanceDatePickerUI();
	}

	@Override
	public void installUI(JComponent c) {
		super.installUI(c);

		c.putClientProperty(SubstanceCoreUtilities.TEXT_COMPONENT_AWARE,
				new TextComponentAware<JXDatePicker>() {
					@Override
					public JTextComponent getTextComponent(JXDatePicker t) {
						return t.getEditor();
					}
				});
	}

	@Override
	public void uninstallUI(JComponent c) {
		c.putClientProperty(SubstanceCoreUtilities.TEXT_COMPONENT_AWARE, null);

		super.uninstallUI(c);
	}

	@Override
	protected void installListeners() {
		super.installListeners();

		this.substancePropertyChangeListener = (PropertyChangeEvent evt) -> {
			// issue 7 - update the popup button on orientation change
			if ("componentOrientation".equals(evt.getPropertyName())) {
				configurePopupButton();
			}
		};
		this.datePicker
				.addPropertyChangeListener(this.substancePropertyChangeListener);
	}

	@Override
	protected void uninstallListeners() {
		this.datePicker
				.removePropertyChangeListener(this.substancePropertyChangeListener);
		this.substancePropertyChangeListener = null;
		super.uninstallListeners();
	}

	@Override
	protected void installDefaults() {
		super.installDefaults();

		Border b = this.datePicker.getBorder();
		if (b == null || b instanceof UIResource) {
			int fontSize = SubstanceSizeUtils
					.getComponentFontSize(this.datePicker);
			Insets borderInsets = SubstanceSizeUtils
					.getComboBorderInsets(fontSize);
			this.datePicker.setBorder(new SubstanceTextComponentBorder(
					borderInsets));
			this.layoutInsets = SubstanceSizeUtils
					.getComboLayoutInsets(fontSize);
		}

		this.datePicker.setOpaque(false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jdesktop.swingx.plaf.basic.BasicDatePickerUI#createPopupButton()
	 */
	@Override
	protected JButton createPopupButton() {
		this.substancePopupButton = new SubstanceDropDownButton(this.datePicker);
		this.substancePopupButton.setFocusPainted(false);
		configurePopupButton();

		this.substancePopupButton.setIcon(SubstanceCoreUtilities.getArrowIcon(
				this.substancePopupButton, SwingConstants.SOUTH));

		return this.substancePopupButton;
	}

	private void configurePopupButton() {
		Side side = this.datePicker.getComponentOrientation().isLeftToRight() ? Side.LEFT
				: Side.RIGHT;
		SubstanceCortex.ComponentScope.setButtonStraightSide(this.substancePopupButton, side);

		this.substancePopupButton.setRolloverEnabled(true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jdesktop.swingx.plaf.basic.BasicDatePickerUI#hidePopup()
	 */
	@Override
	public void hidePopup() {
		super.hidePopup();

		// fix for issue 6 - clear rollover indices on the popup
		// month view component
		JXMonthView popupMonthView = this.datePicker.getMonthView();
		MonthViewUI ui = popupMonthView.getUI();
		if (ui instanceof SubstanceMonthViewUI) {
			((SubstanceMonthViewUI) ui).resetRolloverIndex();
		}
	}

	@Override
	protected JFormattedTextField createEditor() {
		JFormattedTextField result = super.createEditor();
		Insets ins = SubstanceSizeUtils
				.getComboTextBorderInsets(SubstanceSizeUtils
						.getComponentFontSize(result));
		result.setBorder(new EmptyBorder(ins.top, ins.left, ins.bottom,
				ins.right));
		result.setBackground(this.datePicker.getBackground());
		result.setOpaque(false);
		return result;
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		Graphics2D graphics = (Graphics2D) g.create();

		int componentFontSize = SubstanceSizeUtils.getComponentFontSize(this.datePicker);
		float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth();
		Shape contour = SubstanceOutlineUtilities.getBaseOutline(datePicker.getWidth(),
				datePicker.getHeight(),
				Math.max(0,
						2.0f * SubstanceSizeUtils.getClassicButtonCornerRadius(componentFontSize)
								- borderDelta),
				null, borderDelta);

		graphics.setColor(SubstanceTextUtilities
				.getTextBackgroundFillColor(this.datePicker));
		graphics.fill(contour);

		super.paint(g, c);
	}

	@Override
	protected LayoutManager createLayoutManager() {
		return new DatePickerLayoutManager();
	}

	private class DatePickerLayoutManager implements LayoutManager {
		public void addLayoutComponent(String name, Component comp) {
		}

		public void removeLayoutComponent(Component comp) {
		}

		public Dimension preferredLayoutSize(Container parent) {
			return parent.getPreferredSize();
		}

		public Dimension minimumLayoutSize(Container parent) {
			return parent.getMinimumSize();
		}

		public void layoutContainer(Container parent) {
			int popupButtonWidth = substancePopupButton != null ? substancePopupButton
					.getPreferredSize().width
					: 0;

			boolean ltr = datePicker.getComponentOrientation().isLeftToRight();

			datePicker.getEditor().setBounds(
					ltr ? layoutInsets.left : layoutInsets.left
							+ popupButtonWidth,
					layoutInsets.top,
					datePicker.getWidth() - popupButtonWidth
							- layoutInsets.left - layoutInsets.right,
					datePicker.getHeight() - layoutInsets.top
							- layoutInsets.bottom);

			if (substancePopupButton != null) {
				if (ltr) {
					substancePopupButton.setBounds(datePicker.getWidth()
							- popupButtonWidth, 0, popupButtonWidth, datePicker
							.getHeight());
				} else {
					substancePopupButton.setBounds(0, 0, popupButtonWidth,
							datePicker.getHeight());
				}
			}
		}
	}
	
	@Override
	public void update(Graphics g, JComponent c) {
		Graphics2D g2d = (Graphics2D) g.create();
		RenderingUtils.installDesktopHints(g2d, c);
		super.update(g2d, c);
		g2d.dispose();
	}
}
