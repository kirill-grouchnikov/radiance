/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.internal.ui;

import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicViewportUI;
import java.awt.*;

/**
 * UI for panels in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceViewportUI extends BasicViewportUI {
	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstanceViewportUI();
	}

	private SubstanceViewportUI() {
	}

	@Override
	protected void installDefaults(JComponent c) {
		super.installDefaults(c);
		// support for per-window skins
		Color backgr = c.getBackground();
		if ((backgr == null) || (backgr instanceof UIResource)) {
			Color backgroundFillColor = SubstanceColorUtilities.getBackgroundFillColor(c);
			if (backgroundFillColor != null) {
				c.setBackground(new ColorUIResource(backgroundFillColor));
			}
		}
	}

	@Override
	public void update(Graphics g, JComponent c) {
		if (!SubstanceCoreUtilities.isCurrentLookAndFeel()) {
			return;
		}

		if (toPaintBackground(c)) {
			BackgroundPaintingUtils.update(g, c, false);
		}
		super.paint(g, c);
	}

	/**
	 * Returns indication whether the viewport background should be filled.
	 * 
	 * @param c
	 *            Component (should be {@link JViewport}).
	 * @return <code>true</code> if the viewport background should be filled
	 *         with the background color, <code>false</code> otherwise.
	 */
	private boolean toPaintBackground(JComponent c) {
		return SubstanceCoreUtilities.isOpaque(c);
	}
}
