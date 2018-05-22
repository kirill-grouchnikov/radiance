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
package org.pushingpixels.substance.internal.utils.icon;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.Icon;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.plaf.UIResource;

/**
 * Icon for the cascading {@link JMenu}s.
 * 
 * @author Kirill Grouchnikov
 */
public class MenuArrowIcon implements Icon, UIResource {
	/**
	 * Icon for left-to-right {@link JMenu}s.
	 */
	private final Icon ltrIcon;

	/**
	 * Icon for right-to-left {@link JMenu}s.
	 */
	private final Icon rtlIcon;

	/**
	 * Creates the arrow icon for the specified menu.
	 * 
	 * @param menu
	 *            Menu.
	 */
	public MenuArrowIcon(JMenu menu) {
		this.ltrIcon = new ArrowButtonTransitionAwareIcon(menu,
				SwingConstants.EAST);
		this.rtlIcon = new ArrowButtonTransitionAwareIcon(menu,
				SwingConstants.WEST);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
	public int getIconHeight() {
		return this.ltrIcon.getIconHeight();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
	public int getIconWidth() {
		return this.ltrIcon.getIconWidth();
	}

	@Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		if (c.getComponentOrientation().isLeftToRight()) {
			this.ltrIcon.paintIcon(c, g2d, x, y);
		} else {
			this.rtlIcon.paintIcon(c, g2d, x, y);
		}
		g2d.dispose();
	}
}
