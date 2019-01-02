/*
 * Copyright (c) 2005-2019 Substance Kirill Grouchnikov. All Rights Reserved.
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

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JTabbedPane;

import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.internal.ui.SubstanceTabbedPaneUI;

/**
 * Adds tab preview thumbnail on tab mouse hover.
 * 
 * @author Kirill Grouchnikov
 */
public class TabHoverPreviewWidget extends SubstanceWidget<JTabbedPane> {
	/**
	 * Mouse listener for rollover effects.
	 */
	protected MouseRolloverHandler baseRolloverHandler;

	/**
	 * Mouse listener for rollover effects.
	 * 
	 * @author Kirill Grouchnikov
	 */
	protected class MouseRolloverHandler implements MouseListener, MouseMotionListener {
		/**
		 * Index of previously rolled-over tab.
		 */
		int prevRolledOver = -1;

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mouseDragged(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
			TabPreviewWindow.cancelPreviewRequest();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			if (e.getSource() != jcomp)
				return;

            SubstanceTabbedPaneUI ui = (SubstanceTabbedPaneUI) jcomp.getUI();
			int currRolledOver = ui.getRolloverTabIndex();
			if (currRolledOver >= jcomp.getTabCount())
				return;

			if (currRolledOver != jcomp.getSelectedIndex()) {
				if (currRolledOver == this.prevRolledOver) {
					if ((currRolledOver >= 0)
							&& (currRolledOver < jcomp.getTabCount())
							&& jcomp.isEnabledAt(currRolledOver)) {
						TabPreviewWindow.getInstance().postPreviewRequest(
								jcomp, currRolledOver);
					}
				} else {
					if ((this.prevRolledOver >= 0)
							&& (this.prevRolledOver < jcomp.getTabCount())
							&& jcomp.isEnabledAt(this.prevRolledOver)) {
						TabPreviewWindow.cancelPreviewRequest();
					}
					if ((currRolledOver >= 0)
							&& (currRolledOver < jcomp.getTabCount())
							&& jcomp.isEnabledAt(currRolledOver)) {
						TabPreviewWindow.getInstance().postPreviewRequest(
								jcomp, currRolledOver);
					}
				}
			} else {
				// no preview on the selected tab
				TabPreviewWindow.cancelPreviewRequest();
			}
			this.prevRolledOver = currRolledOver;
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if ((this.prevRolledOver >= 0)
					&& (this.prevRolledOver < jcomp.getTabCount())
					&& jcomp.isEnabledAt(this.prevRolledOver)) {
				TabPreviewWindow.cancelPreviewRequest();
			}
			this.prevRolledOver = -1;
		}
	}

	@Override
	public void installListeners() {
		this.baseRolloverHandler = new MouseRolloverHandler();
		this.jcomp.addMouseMotionListener(this.baseRolloverHandler);
		this.jcomp.addMouseListener(this.baseRolloverHandler);
	}

	@Override
	public void uninstallListeners() {
		if (this.baseRolloverHandler != null) {
			this.jcomp.removeMouseMotionListener(this.baseRolloverHandler);
			this.jcomp.removeMouseListener(this.baseRolloverHandler);
			this.baseRolloverHandler = null;
		}
	}

	@Override
	public void uninstallUI() {
		if (TabPreviewThread.instanceRunning()) {
			TabPreviewThread.getInstance().cancelTabPreviewRequests(this.jcomp);
		}
		TabPreviewWindow.cancelPreviewRequest();

		super.uninstallUI();
	}
}
