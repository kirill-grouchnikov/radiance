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

package org.pushingpixels.radiance.theming.internal.contrib.randelshofer.quaqua.colorchooser;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.renderer.RadianceDefaultListCellRenderer;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceStripingUtils;

import javax.swing.*;
import java.awt.*;

/**
 * PaletteEntryCellRenderer.
 *
 * @author Werner Randelshofer
 * @version 1.0 19 septembre 2005 Created.
 */
public class PaletteEntryCellRenderer extends RadianceDefaultListCellRenderer {
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
			Color border = RadianceCoreUtilities.getBorderPainter(c).getRepresentativeColor(
					RadianceColorSchemeUtilities.getColorScheme(c,
							RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
							ComponentState.ENABLED));
			// Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
			// to not normalize coordinates to paint at full pixels, and will result in blurry
			// outlines.
			Graphics2D graphics = (Graphics2D) g.create();
			graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			graphics.translate(x, y);

			RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, getIconWidth(), getIconHeight(),
					(graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
						graphics1X.setColor(getColor());
						graphics1X.fillRect(x, y, scaledWidth - 1, scaledHeight - 1);
						graphics1X.setColor(border);
						graphics1X.drawRect(x, y, scaledWidth - 1, scaledHeight - 1);
					});
			graphics.dispose();
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
		RadianceStripingUtils.applyStripedBackground(list, index, this);

		PaletteEntry entry = (PaletteEntry) value;
		icon.setColor(entry.getColor());
		setText(entry.getName());

		return this;
	}
}
