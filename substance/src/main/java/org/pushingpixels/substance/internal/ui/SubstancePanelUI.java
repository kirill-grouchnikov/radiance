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
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicPanelUI;

import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostPaintingUtils;

/**
 * UI for panels in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstancePanelUI extends BasicPanelUI {
	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.plaf.ComponentUI#createUI(javax.swing.JComponent)
	 */
	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstancePanelUI();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.swing.plaf.basic.BasicPanelUI#installDefaults(javax.swing.JPanel)
	 */
	@Override
	protected void installDefaults(JPanel p) {
		super.installDefaults(p);
		// support for per-window skins
		Color backgr = p.getBackground();
		if ((backgr == null) || (backgr instanceof UIResource)) {
			Color backgroundFillColor = SubstanceColorUtilities
					.getBackgroundFillColor(p);
			// fix for issue 436 - logic in getBackground() of
			// custom panels can result in null value
			if (backgroundFillColor != null) {
				p.setBackground(new ColorUIResource(backgroundFillColor));
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.plaf.ComponentUI#update(java.awt.Graphics,
	 * javax.swing.JComponent)
	 */
	@Override
	public void update(Graphics g, JComponent c) {
		if (!SubstanceCoreUtilities.isCurrentLookAndFeel())
			return;

		if (toPaintBackground(c)) {
			BackgroundPaintingUtils.update(g, c, false);
		}
		super.paint(g, c);
		GhostPaintingUtils.paintGhostImages(c, g);
	}

	/**
	 * Returns indication whether the panel background should be filled.
	 * 
	 * @param c
	 *            Component (should be {@link JPanel}).
	 * @return <code>true</code> if the panel background should be filled with
	 *         the background color, <code>false</code> otherwise.
	 */
	protected boolean toPaintBackground(JComponent c) {
		return SubstanceCoreUtilities.isOpaque(c);
	}
}
