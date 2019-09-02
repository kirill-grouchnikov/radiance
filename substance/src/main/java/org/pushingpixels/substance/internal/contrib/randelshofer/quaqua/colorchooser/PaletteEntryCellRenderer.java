/*
 * @(#)PaletteEntryCellRenderer.java  1.0  19 septembre 2005
 *
 * Copyright (c) 2005 Werner Randelshofer
 * Staldenmattweg 2, Immensee, CH-6405, Switzerland.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Werner Randelshofer. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Werner Randelshofer.
 */

package org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser;

import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceStripingUtils;

import javax.swing.*;
import java.awt.*;

/**
 * PaletteEntryCellRenderer.
 *
 * @author Werner Randelshofer
 * @version 1.0 19 septembre 2005 Created.
 */
public class PaletteEntryCellRenderer extends SubstanceDefaultListCellRenderer {
	static class ColorIcon implements Icon {
		private Color color = Color.black;

		public void setColor(Color c) {
			this.color = c;
		}

		public Color getColor() {
			return color;
		}

		public int getIconHeight() {
			return 15;
		}

		public int getIconWidth() {
			return 25;
		}

		public void paintIcon(Component c, Graphics g, int x, int y) {
			g.setColor(getColor());
			g.fillRect(x, y, getIconWidth() - 1, getIconHeight() - 1);
			g.setColor(SubstanceColorUtilities.deriveByBrightness(getColor(), -0.5f));
			g.drawRect(x, y, getIconWidth() - 1, getIconHeight() - 1);
		}
	}

	private ColorIcon icon;

	/**
	 * Creates a new instance.
	 */
	public PaletteEntryCellRenderer() {
		icon = new ColorIcon();
		setIcon(icon);
		setOpaque(false);
	}

	public Component getListCellRendererComponent(JList list, Object value, int index,
			boolean isSelected, boolean cellHasFocus) {
		setComponentOrientation(list.getComponentOrientation());

		setEnabled(list.isEnabled());
		setFont(list.getFont());
		SubstanceStripingUtils.applyStripedBackground(list, index, this);

		PaletteEntry entry = (PaletteEntry) value;
		icon.setColor(entry.getColor());
		setText(entry.getName());

		return this;
	}
}
