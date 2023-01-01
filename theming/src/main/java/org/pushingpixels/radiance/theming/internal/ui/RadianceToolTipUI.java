/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceMetricsUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceTextUtilities;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicHTML;
import javax.swing.plaf.basic.BasicToolTipUI;
import javax.swing.text.View;
import java.awt.*;

/**
 * UI for tool tips in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceToolTipUI extends BasicToolTipUI {
	/**
	 * Creates a UI delegate for the specified component.
	 * 
	 * @param comp
	 *            Component.
	 * @return UI delegate.
	 */
	public static ComponentUI createUI(JComponent comp) {
		RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new RadianceToolTipUI();
	}

	protected RadianceToolTipUI() {
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		Font font = c.getFont();
		// FontMetrics metrics = c.getFontMetrics(font);
		Dimension size = c.getSize();
		if (c.isOpaque()) {
			g.setColor(c.getBackground());
			g.fillRect(0, 0, size.width, size.height);
		}
		g.setColor(c.getForeground());
		g.setFont(font);
		// fix for bug 4153892
		String tipText = ((JToolTip) c).getTipText();
		if (tipText == null) {
			tipText = "";
		}

		Insets insets = c.getInsets();
		Rectangle paintTextR = new Rectangle(insets.left + 3, insets.top + 1,
				size.width - (insets.left + insets.right + 6),
				size.height - (insets.top + insets.bottom + 1));
		View v = (View) c.getClientProperty(BasicHTML.propertyKey);
		if (v != null) {
			v.paint(g, paintTextR);
		} else {
			RadianceTextUtilities.paintText(g, paintTextR, tipText, -1, font, c.getForeground(), null);
		}
	}

	@Override
	public Dimension getPreferredSize(JComponent c) {
		Font font = c.getFont();
		Insets insets = c.getInsets();

		Dimension prefSize = new Dimension(insets.left + insets.right,
				insets.top + insets.bottom);
		String text = ((JToolTip) c).getTipText();

		if ((text == null) || text.equals("")) {
			text = "";
		} else {
			View v = (c != null) ? (View) c.getClientProperty("html") : null;
			if (v != null) {
				// fix for 302 - add extra pixels for the HTML view as well
				prefSize.width += (int) (v.getPreferredSpan(View.X_AXIS) + 6);
				prefSize.height += (int) (v.getPreferredSpan(View.Y_AXIS) + 2);
			} else {
				FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(
						RadianceCommonCortex.getScaleFactor(c), font);
				prefSize.width += fm.stringWidth(text) + 6;
				prefSize.height += fm.getHeight() + 2;
			}
		}
		return prefSize;
	}

	@Override
	public void update(Graphics g, JComponent c) {
		Graphics2D g2d = (Graphics2D) g.create();
		RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
		super.update(g2d, c);
		g2d.dispose();
	}
}
