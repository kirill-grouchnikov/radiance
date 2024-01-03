/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.theming.internal.painter.SeparatorPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolBarSeparatorUI;
import java.awt.*;

/**
 * UI for toolbar separators in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceToolBarSeparatorUI extends BasicToolBarSeparatorUI {
	public static ComponentUI createUI(JComponent comp) {
		RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new RadianceToolBarSeparatorUI();
	}

	protected RadianceToolBarSeparatorUI() {
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		Graphics2D graphics = (Graphics2D) g.create();
		JSeparator separator = (JSeparator) c;
		SeparatorPainterUtils.paintSeparator(separator, graphics, c.getWidth(), c.getHeight(),
				separator.getOrientation());
		graphics.dispose();
	}

	@Override
	public Dimension getPreferredSize(JComponent c) {
		Dimension size = ((JToolBar.Separator) c).getSeparatorSize();

		if (size != null) {
			size = size.getSize();
		} else {
			size = new Dimension(6, 6);

			if (((JSeparator) c).getOrientation() == SwingConstants.VERTICAL) {
				size.height = 0;
			} else {
				size.width = 0;
			}
		}
		return size;
	}

	@Override
	public Dimension getMaximumSize(JComponent c) {
		Dimension pref = getPreferredSize(c);
		if (((JSeparator) c).getOrientation() == SwingConstants.VERTICAL) {
			return new Dimension(pref.width, Short.MAX_VALUE);
		} else {
			return new Dimension(Short.MAX_VALUE, pref.height);
		}
	}
}
