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
package org.pushingpixels.substance.extras.internal.tabbed;

import java.awt.event.InputEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JTabbedPane;

import org.pushingpixels.substance.extras.api.tabbed.TabPreviewPainter;

/**
 * Mouse wheel listener for the {@link TabPagerWidget}.
 * 
 * @author Kirill Grouchnikov
 */
public class TabPagerMouseWheelListener implements MouseWheelListener {
	/**
	 * The associated tabbed pane (may be <code>null</code>).
	 */
	protected JTabbedPane tabbedPane;

	/**
	 * Creates a new mouse wheel listener on the currently paged tabbed pane.
	 */
	public TabPagerMouseWheelListener() {
		this(null);
	}

	/**
	 * Creates a new mouse wheel listener on the specified tabbed pane.
	 * 
	 * @param tabbedPane
	 *            Tabbed pane.
	 */
	public TabPagerMouseWheelListener(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seejava.awt.event.MouseWheelListener#mouseWheelMoved(java.awt.event.
	 * MouseWheelEvent)
	 */
	public void mouseWheelMoved(MouseWheelEvent e) {
		TabPreviewPainter tpp = TabPreviewUtilities
				.getTabPreviewPainter(this.tabbedPane);
		if (tpp == null)
			return;

		if (((e.getModifiers() & InputEvent.CTRL_MASK) != 0)
				&& e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {
			int amount = e.getWheelRotation();
			TabPagerManager te = TabPagerManager.getPager();
			if (te.isVisible()) {
				if (amount > 0) {
					if (this.tabbedPane != null)
						te.page(this.tabbedPane, true);
					else
						te.page(true);
				} else {
					if (this.tabbedPane != null)
						te.page(this.tabbedPane, false);
					else
						te.page(false);
				}
			}
		}
	}
}
