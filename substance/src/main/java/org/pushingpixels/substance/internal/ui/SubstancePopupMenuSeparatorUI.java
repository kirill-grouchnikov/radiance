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

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JSeparator;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;

import org.pushingpixels.substance.internal.painter.SeparatorPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;
import org.pushingpixels.substance.internal.utils.menu.MenuUtilities;
import org.pushingpixels.substance.internal.utils.menu.SubstanceMenuBackgroundDelegate;

/**
 * UI for popup menu separators in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstancePopupMenuSeparatorUI extends BasicPopupMenuSeparatorUI {
	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstancePopupMenuSeparatorUI();
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		Graphics2D graphics = (Graphics2D) g.create();

		JSeparator sep = (JSeparator) c;

		int xOffset = MenuUtilities.getTextOffset(sep, sep.getParent());
		SubstanceMenuBackgroundDelegate.paintBackground(graphics, c, xOffset);

		Dimension s = c.getSize();
		int startX = 0;
		int width = s.width;
		if (c.getComponentOrientation().isLeftToRight()) {
			startX = xOffset - 2;
			width = s.width - startX;
		} else {
			startX = 0;
			if (xOffset > 0) {
				width = xOffset - 4;
			} else {
				width = s.width;
			}
		}
		graphics.translate(startX, 0);
		graphics.setComposite(WidgetUtilities.getAlphaComposite(sep));
		SeparatorPainterUtils.paintSeparator(sep, graphics, width, s.height, sep.getOrientation(),
				true, 2);

		graphics.dispose();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.swing.plaf.basic.BasicPopupMenuSeparatorUI#getPreferredSize(javax
	 * .swing.JComponent)
	 */
	@Override
	public Dimension getPreferredSize(JComponent c) {
		float borderStrokeWidth = SubstanceSizeUtils.getBorderStrokeWidth();
		int prefSize = (int) (Math.ceil(2.0 * borderStrokeWidth));
		return new Dimension(0, prefSize);
	}
}
