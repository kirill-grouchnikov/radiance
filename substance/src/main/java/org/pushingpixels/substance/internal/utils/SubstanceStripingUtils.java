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
package org.pushingpixels.substance.internal.utils;

import java.awt.Color;

import javax.swing.JComponent;

import org.pushingpixels.substance.internal.ui.SubstanceTableUI;

/**
 * <p>
 * This class is used to speed up the striping of lists, tables, trees and
 * comboboxes that use Substance default renderers. This class if for internal
 * use only.
 * </p>
 * 
 * <p>
 * The usage is this:
 * </p>
 * <ul>
 * <li>Call {@link #setup(JComponent)} before starting painting the component
 * cells. An example -
 * {@link SubstanceTableUI#paint(java.awt.Graphics, JComponent)} that should
 * call this method prior to the call to its <code>paintCells</code>.</li>
 * <li>The specific renderer should call
 * {@link #applyStripedBackground(JComponent, int, JComponent)}.</li>
 * <li>After all cells have been renderered, call {@link #tearDown(JComponent)}.
 * </ul>
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceStripingUtils {
	/**
	 * Name of the client property that stores the background fill color of odd
	 * rows. The value should be an instance of {@link Color}.
	 */
	private static final String ODD_COLOR = "substancelaf.internal.stripingColor.odd";

	/**
	 * Name of the client property that stores the background fill color of even
	 * rows. The value should be an instance of {@link Color}.
	 */
	private static final String EVEN_COLOR = "substancelaf.internal.stripingColor.even";

	/**
	 * Sets up the specified component for the UI delegate striping.
	 * 
	 * @param comp
	 *            Component.
	 */
	public static void setup(JComponent comp) {
		comp.putClientProperty(EVEN_COLOR, SubstanceColorUtilities
				.getStripedBackground(comp, 0));
		comp.putClientProperty(ODD_COLOR, SubstanceColorUtilities
				.getStripedBackground(comp, 1));
	}

	/**
	 * Cleans the component after the UI delegate striping is over.
	 * 
	 * @param comp
	 *            Component. Should be the same as passed to
	 *            {@link #setup(JComponent)
	 * 		}.
	 */
	public static void tearDown(JComponent comp) {
		comp.putClientProperty(EVEN_COLOR, null);
		comp.putClientProperty(ODD_COLOR, null);
	}

	/**
	 * Applies the striped background to the specified renderer.
	 * 
	 * @param component
	 *            Component (should be the same as passed to
	 *            {@link #setup(JComponent)
	 * 		}).
	 * @param rowIndex
	 *            Row index.
	 * @param renderer
	 *            Renderer component.
	 */
	public static void applyStripedBackground(JComponent component,
			int rowIndex, JComponent renderer) {
		Color backgr = (Color) component
				.getClientProperty((rowIndex % 2) == 0 ? EVEN_COLOR : ODD_COLOR);
		if (backgr == null)
			return;
		renderer.setBackground(backgr);
	}
}
