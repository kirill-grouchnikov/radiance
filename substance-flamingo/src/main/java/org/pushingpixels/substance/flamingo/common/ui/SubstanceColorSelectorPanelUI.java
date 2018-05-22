/*
 * Copyright (c) 2005-2018 Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.substance.flamingo.common.ui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

import org.pushingpixels.flamingo.internal.ui.common.popup.BasicColorSelectorPanelUI;
import org.pushingpixels.flamingo.internal.ui.common.popup.JColorSelectorPanel;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

/**
 * UI for {@link JColorSelectorPanel} components in <b>Substance</b> look and
 * feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceColorSelectorPanelUI extends BasicColorSelectorPanelUI {
	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.plaf.ComponentUI#createUI(javax.swing.JComponent)
	 */
	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstanceColorSelectorPanelUI();
	}

	@Override
	protected void paintCaptionBackground(Graphics g, int x, int y, int width, int height) {
		SubstanceColorScheme bgFillScheme = SubstanceColorSchemeUtilities.getColorScheme(
				this.colorSelectorPanel, ColorSchemeAssociationKind.HIGHLIGHT,
				ComponentState.ENABLED);
		SubstanceCoreUtilities.getFillPainter(this.colorSelectorPanel).paintContourBackground(g,
				this.colorSelectorPanel, width, height, new Rectangle(x, y, width, height), false,
				bgFillScheme, false);

		SubstanceColorScheme bgBorderScheme = SubstanceColorSchemeUtilities.getColorScheme(
				this.colorSelectorPanel, ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
				ComponentState.ENABLED);
		Color borderColor = bgBorderScheme.getLineColor();
		float lineThickness = SubstanceSizeUtils.getBorderStrokeWidth();

		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setStroke(new BasicStroke(lineThickness));
		g2d.setColor(borderColor);
		g2d.draw(new Line2D.Float(x, y, x + width, y));
		float bottomLineY = y + height - lineThickness;
		g2d.draw(new Line2D.Float(x, bottomLineY, x + width, bottomLineY));
		g2d.dispose();
	}

	@Override
	protected void paintBottomDivider(Graphics g, int x, int y, int width, int height) {
		SubstanceColorScheme bgBorderScheme = SubstanceColorSchemeUtilities.getColorScheme(
				this.colorSelectorPanel, ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
				ComponentState.ENABLED);
		Color borderColor = bgBorderScheme.getLineColor();
		float lineThickness = SubstanceSizeUtils.getBorderStrokeWidth();
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setStroke(new BasicStroke(lineThickness));
		g2d.setColor(borderColor);
		float lineY = y + height - lineThickness;
		g2d.draw(new Line2D.Float(x, lineY, x + width, lineY));
		g2d.dispose();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.plaf.ComponentUI#update(java.awt.Graphics,
	 * javax.swing.JComponent)
	 */
	@Override
	public void update(Graphics g, JComponent c) {
		BackgroundPaintingUtils.updateIfOpaque(g, c);
		this.paint(g, c);
	}
	
	@Override
	protected int getLayoutGap() {
        return (int) SubstanceSizeUtils.getAdjustedSize(
                SubstanceSizeUtils.getComponentFontSize(colorSelectorPanel), 4, 1, 0.25f);
	}
}
