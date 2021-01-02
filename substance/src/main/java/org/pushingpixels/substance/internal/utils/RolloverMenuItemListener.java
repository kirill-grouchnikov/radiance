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
package org.pushingpixels.substance.internal.utils;

import org.pushingpixels.substance.internal.animation.StateTransitionTracker;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;

/**
 * Menu item listener for rollover effects. Tracks the mouse motion interaction
 * for the associated menu item. This class is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class RolloverMenuItemListener implements MouseInputListener {
	/**
	 * If the mouse pointer is currently inside the associated menu item area,
	 * <code>this</code> flag is <code>true</code>.
	 */
	private boolean isMouseInside;

	/**
	 * The associated menu item.
	 */
	private JMenuItem item;

	private StateTransitionTracker stateTransitionTracker;

	/**
	 * Simple constructor.
	 * 
	 * @param item
	 *            The associated menu item.
	 */
	public RolloverMenuItemListener(JMenuItem item,
			StateTransitionTracker stateTransitionTracker) {
		this.item = item;
		this.stateTransitionTracker = stateTransitionTracker;
		this.isMouseInside = false;
	}

    @Override
	public void mouseEntered(MouseEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			this.isMouseInside = true;
			this.item.getModel().setRollover(true);
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

    @Override
	public void mouseExited(MouseEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			this.isMouseInside = false;
			this.item.getModel().setRollover(false);
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

    @Override
	public void mouseReleased(MouseEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			ButtonModel model = this.item.getModel();
			model.setRollover(false);
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

    @Override
	public void mousePressed(MouseEvent e) {
	}

    @Override
	public void mouseDragged(MouseEvent e) {
	}

    @Override
	public void mouseMoved(MouseEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			this.item.getModel().setRollover(this.isMouseInside);
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

}
