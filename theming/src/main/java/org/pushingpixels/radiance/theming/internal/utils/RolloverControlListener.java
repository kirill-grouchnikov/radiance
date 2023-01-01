/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Control listener for rollover effects. Tracks the mouse motion interaction
 * for the associated {@link TransitionAwareUI} control. This class is <b>for
 * internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class RolloverControlListener implements MouseListener, MouseMotionListener {
	/**
	 * If the mouse pointer is currently inside the designated area (fetched
	 * from the associated {@link #trackableUI}), <code>this</code> flag is
	 * <code>true</code>.
	 */
	private boolean isMouseInside;

	/**
	 * Surrogate model for tracking control status.
	 */
	private ButtonModel model;

	/**
	 * Object that is queried for mouse events. This object is responsible for
	 * handling the designated (hot-spot) area of the associated control.
	 */
	private TransitionAwareUI trackableUI;

	private StateTransitionTracker stateTransitionTracker;

	/**
	 * Simple constructor.
	 * 
	 * @param trackableUI
	 *            Object that is queried for mouse events.
	 * @param model
	 *            Surrogate model for tracking control status.
	 */
	public RolloverControlListener(TransitionAwareUI trackableUI,
			ButtonModel model) {
		this.trackableUI = trackableUI;
		this.model = model;
		this.isMouseInside = false;
		this.stateTransitionTracker = trackableUI.getTransitionTracker();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			Component component = (Component) e.getSource();
			if (!component.isEnabled()) {
				return;
			}
			boolean isInside = this.trackableUI.isInside(e);
			// boolean isInsideChanged = (this.isMouseInside != isInside);
			this.isMouseInside = isInside;
			this.model.setRollover(isInside);
			this.model.setEnabled(component.isEnabled());
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			Component component = (Component) e.getSource();
			if (!component.isEnabled()) {
                return;
            }
			// boolean isInsideChanged = (this.isMouseInside != false);
			this.isMouseInside = false;
			this.model.setRollover(false);
			this.model.setEnabled(component.isEnabled());
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		// System.out.println("mouse released [" + e.getX() + ":" + e.getY() +
		// "]");
		try {
			Component component = (Component) e.getSource();
			if (!component.isEnabled()) {
                return;
            }
			boolean isInside = this.trackableUI.isInside(e);
			// boolean isInsideChanged = (this.isMouseInside != isInside);
			this.isMouseInside = isInside;
			this.model.setRollover(this.isMouseInside);
			this.model.setPressed(false);
			this.model.setArmed(false);
			this.model.setSelected(false);
			this.model.setEnabled(component.isEnabled());
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			// System.out.println("mouse pressed [" + e.getX() + ":" + e.getY()
			// +
			// "]");
			Component component = (Component) e.getSource();
			if (!component.isEnabled()) {
                return;
            }
			boolean isInside = this.trackableUI.isInside(e);
			// boolean isInsideChanged = (this.isMouseInside != isInside);
			this.isMouseInside = isInside;
			this.model.setRollover(this.isMouseInside);
			if (this.isMouseInside) {
				this.model.setPressed(true);
				this.model.setArmed(true);
				this.model.setSelected(true);
			}
			this.model.setEnabled(component.isEnabled());
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			// System.out.println("mouse dragged [" + e.getX() + ":" + e.getY()
			// +
			// "]");
			Component component = (Component) e.getSource();
			if (!component.isEnabled()) {
                return;
            }
			boolean isInside = this.trackableUI.isInside(e);
			// boolean isInsideChanged = (this.isMouseInside != isInside);
			this.isMouseInside = isInside;
			this.model.setEnabled(component.isEnabled());
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			// System.out.println("mouse moved [" + e.getX() + ":" + e.getY() +
			// "]");
			Component component = (Component) e.getSource();
			if (!component.isEnabled()) {
                return;
            }
			boolean isInside = this.trackableUI.isInside(e);
			// System.out.println("inside");
			// boolean isInsideChanged = (this.isMouseInside != isInside);
			this.isMouseInside = isInside;
			this.model.setRollover(isInside);
			this.model.setEnabled(component.isEnabled());
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}
}
