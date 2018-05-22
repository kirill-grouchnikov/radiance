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
package org.pushingpixels.demo.substance.main.check;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import org.pushingpixels.demo.substance.main.Check;

/**
 * Popup listener for the test application.
 * 
 * @author Kirill Grouchnikov
 */
public class MousePopupListener extends MouseAdapter {
	/**
	 * The owner component.
	 */
	private JComponent owner;

	/**
	 * Creates a popup listener.
	 * 
	 * @param owner
	 *            The owner component.
	 */
	public MousePopupListener(JComponent owner) {
		this.owner = owner;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseAdapter#mousePressed(java.awt.event.MouseEvent)
	 */
	public void mousePressed(MouseEvent e) {
		checkPopup(e);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseAdapter#mouseClicked(java.awt.event.MouseEvent)
	 */
	public void mouseClicked(MouseEvent e) {
		checkPopup(e);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseAdapter#mouseReleased(java.awt.event.MouseEvent)
	 */
	public void mouseReleased(MouseEvent e) {
		checkPopup(e);
	}

	/**
	 * Handles the mouse event, showing the popup menu as necessary.
	 * 
	 * @param e
	 *            Mouse event.
	 */
	void checkPopup(MouseEvent e) {
		if (e.isPopupTrigger()) {
			JPopupMenu popup = new JPopupMenu();
			int mcount = 0;
			for (LinkedList<JMenuItem> miList : SampleMenuFactory
					.getTestMenuItems()) {
				if (mcount > 0) {
					if (mcount % 2 == 0)
						popup.addSeparator();
					else
						popup.add(new JSeparator());
				}
				for (JMenuItem menuItem : miList) {
					popup.add(menuItem);
				}
				mcount++;
			}
			popup.addPopupMenuListener(new PopupPrintListener());

			popup.show(this.owner, e.getX(), e.getY());
		}
	}

	/**
	 * Custom popup listener.
	 * 
	 * @author Kirill Grouchnikov
	 */
	protected static class PopupPrintListener implements PopupMenuListener {
		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.swing.event.PopupMenuListener#popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent)
		 */
		public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
			Check.out("Popup menu will be visible!");
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.swing.event.PopupMenuListener#popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent)
		 */
		public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			Check.out("Popup menu will be invisible!");
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.swing.event.PopupMenuListener#popupMenuCanceled(javax.swing.event.PopupMenuEvent)
		 */
		public void popupMenuCanceled(PopupMenuEvent e) {
			Check.out("Popup menu is hidden!");
		}
	}
}