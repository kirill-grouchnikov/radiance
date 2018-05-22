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
package org.pushingpixels.substance.internal.utils.combo;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicComboPopup;

import org.pushingpixels.substance.internal.ui.SubstanceListUI;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.border.SubstanceBorder;

/**
 * Combo popup implementation in <b>Substance</b> look-and-feel. This class is
 * <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceComboPopup extends BasicComboPopup {

	/**
	 * Creates combo popup for the specified combobox.
	 * 
	 * @param combo
	 *            Combobox.
	 */
	public SubstanceComboPopup(JComboBox combo) {
		super(combo);
		// fix for defect 154
		this.setOpaque(true);
		this.list.setBackground(combo.getBackground());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.plaf.basic.BasicComboPopup#configurePopup()
	 */
	@Override
	protected void configurePopup() {
		super.configurePopup();
		setBorder(new SubstanceBorder(new Insets(0, 2, 2, 2)));
	}

	/**
	 * Sets the list selection index to the selectedIndex. This method is used
	 * to synchronize the list selection with the combo box selection.
	 * 
	 * @param selectedIndex
	 *            the index to set the list
	 */
	private void setListSelection(int selectedIndex) {
		if (selectedIndex == -1) {
			this.list.clearSelection();
		} else {
			this.list.setSelectedIndex(selectedIndex);
			this.list.ensureIndexIsVisible(selectedIndex);
		}
	}

	/**
	 * Calculates the upper left location of the popup.
	 * 
	 * @return The upper left location of the popup.
	 */
	private Point getPopupLocation() {
		Dimension popupSize = this.comboBox.getSize();
		Insets insets = this.getInsets();

		// reduce the width of the scrollpane by the insets so that the popup
		// is the same width as the combo box.
		popupSize.setSize(popupSize.width - (insets.right + insets.left), this
				.getPopupHeightForRowCount(this.comboBox.getMaximumRowCount()));
		Rectangle popupBounds = this.computePopupBounds(0, this.comboBox
				.getBounds().height, popupSize.width, popupSize.height);
		Dimension scrollSize = popupBounds.getSize();
		Point popupLocation = popupBounds.getLocation();

		this.scroller.setMaximumSize(scrollSize);
		this.scroller.setPreferredSize(scrollSize);
		this.scroller.setMinimumSize(scrollSize);

		this.list.revalidate();

		return new Point(popupLocation.x, popupLocation.y);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.plaf.basic.BasicComboPopup#computePopupBounds(int, int,
	 * int, int)
	 */
	@Override
	protected Rectangle computePopupBounds(int px, int py, int pw, int ph) {
		int popupFlyoutOrientation = SubstanceCoreUtilities
				.getPopupFlyoutOrientation(this.comboBox);
		Insets insets = this.getInsets();
		int dx = 0;
		int dy = 0;
		switch (popupFlyoutOrientation) {
		case SwingConstants.NORTH:
			dy = -ph - (int) this.comboBox.getSize().getHeight() - insets.top
					- insets.bottom;
			break;
		case SwingConstants.CENTER:
			dy = -ph / 2 - (int) this.comboBox.getSize().getHeight() / 2
					- insets.top / 2 - insets.bottom / 2;
			break;
		case SwingConstants.EAST:
			dx = pw + insets.left + insets.right;
			dy = -(int) this.comboBox.getSize().getHeight();
			break;
		case SwingConstants.WEST:
			dx = -pw - insets.left - insets.right;
			dy = -(int) this.comboBox.getSize().getHeight();
		}
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Rectangle screenBounds;

		// Calculate the desktop dimensions relative to the combo box.
		GraphicsConfiguration gc = this.comboBox.getGraphicsConfiguration();
		Point p = new Point();
		SwingUtilities.convertPointFromScreen(p, this.comboBox);
		if (gc != null) {
			Insets screenInsets = toolkit.getScreenInsets(gc);
			screenBounds = gc.getBounds();
			screenBounds.width -= (screenInsets.left + screenInsets.right);
			screenBounds.height -= (screenInsets.top + screenInsets.bottom);
			screenBounds.x += (p.x + screenInsets.left);
			screenBounds.y += (p.y + screenInsets.top);
		} else {
			screenBounds = new Rectangle(p, toolkit.getScreenSize());
		}

		Rectangle rect = new Rectangle(px + dx, py + dy, pw, ph);
		if ((py + ph > screenBounds.y + screenBounds.height)
				&& (ph < screenBounds.height)) {
			rect.y = -rect.height - insets.top - insets.bottom;
		}

		// The following has been taken from JGoodies' Looks implementation
		// for the popup prototype value
		Object popupPrototypeDisplayValue = SubstanceCoreUtilities
				.getComboPopupPrototypeDisplayValue(this.comboBox);
		if (popupPrototypeDisplayValue != null) {
			ListCellRenderer renderer = this.list.getCellRenderer();
			Component c = renderer.getListCellRendererComponent(this.list,
					popupPrototypeDisplayValue, -1, true, true);
			int npw = c.getPreferredSize().width;
			boolean hasVerticalScrollBar = this.comboBox.getItemCount() > this.comboBox
					.getMaximumRowCount();
			if (hasVerticalScrollBar) {
				// Add the scrollbar width.
				JScrollBar verticalBar = this.scroller.getVerticalScrollBar();
				npw += verticalBar.getPreferredSize().width;
			}

			pw = Math.max(pw, npw);
			rect.width = pw;
		}

		return rect;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.plaf.basic.BasicComboPopup#show()
	 */
	@Override
	public void show() {
		this.setListSelection(this.comboBox.getSelectedIndex());

		Point location = this.getPopupLocation();
		this.show(this.comboBox, location.x, location.y);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.plaf.basic.BasicComboPopup#hide()
	 */
	@Override
	public void hide() {
		super.hide();
		SubstanceListUI ui = (SubstanceListUI) this.list.getUI();
		ui.resetRolloverIndex();
		// this.list.putClientProperty(SubstanceListUI.ROLLED_OVER_INDEX, null);
	}

	public JComboBox getCombobox() {
		return this.comboBox;
	}
}
