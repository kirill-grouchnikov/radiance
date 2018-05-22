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

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ButtonModel;
import javax.swing.JComponent;

import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;

/**
 * Control listener for rollover effects. Tracks the mouse motion interaction
 * for the associated {@link TransitionAwareUI} control.
 * 
 * @author Kirill Grouchnikov
 */
public class RolloverTextControlListener implements MouseListener,
		MouseMotionListener, FocusListener {
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

	private JComponent component;

	/**
	 * Simple constructor.
	 * 
	 * @param trackableUI
	 *            Object that is queried for mouse events.
	 * @param model
	 *            Surrogate model for tracking control status.
	 */
	public RolloverTextControlListener(JComponent component,
			TransitionAwareUI trackableUI, ButtonModel model) {
		this.component = component;
		this.trackableUI = trackableUI;
		this.model = model;
		this.isMouseInside = false;
		this.stateTransitionTracker = this.trackableUI.getTransitionTracker();
	}

	public void registerListeners() {
		this.component.addMouseListener(this);
		this.component.addMouseMotionListener(this);
		this.component.addFocusListener(this);
	}

	public void unregisterListeners() {
		this.component.removeMouseListener(this);
		this.component.removeMouseMotionListener(this);
		this.component.removeFocusListener(this);
	}

	@Override
	public void focusGained(FocusEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			this.model.setSelected(true);
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			this.model.setSelected(false);
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 */
	public void mouseEntered(MouseEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			Component component = (Component) e.getSource();
			if (!component.isEnabled())
				return;
			boolean isInside = this.trackableUI.isInside(e);
			// boolean isInsideChanged = (this.isMouseInside != isInside);
			this.isMouseInside = isInside;
			this.model.setRollover(isInside);
			this.model.setEnabled(component.isEnabled());
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 */
	public void mouseExited(MouseEvent e) {
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			Component component = (Component) e.getSource();
			if (!component.isEnabled())
				return;
			// boolean isInsideChanged = (this.isMouseInside != false);
			this.isMouseInside = false;
			this.model.setRollover(false);
			this.model.setEnabled(component.isEnabled());
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	public void mouseReleased(MouseEvent e) {
		// System.out.println("mouse released [" + e.getX() + ":" + e.getY() +
		// "]");
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			Component component = (Component) e.getSource();
			if (!component.isEnabled())
				return;
			boolean isInside = this.trackableUI.isInside(e);
			// boolean isInsideChanged = (this.isMouseInside != isInside);
			this.isMouseInside = isInside;
			this.model.setRollover(this.isMouseInside);
			this.model.setEnabled(component.isEnabled());
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	public void mousePressed(MouseEvent e) {
		// System.out.println("mouse pressed [" + e.getX() + ":" + e.getY() +
		// "]");
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			Component component = (Component) e.getSource();
			if (!component.isEnabled())
				return;
			boolean isInside = this.trackableUI.isInside(e);
			// boolean isInsideChanged = (this.isMouseInside != isInside);
			this.isMouseInside = isInside;
			this.model.setRollover(this.isMouseInside);
			this.model.setEnabled(component.isEnabled());
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent
	 * )
	 */
	public void mouseDragged(MouseEvent e) {
		// System.out.println("mouse dragged [" + e.getX() + ":" + e.getY() +
		// "]");
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			Component component = (Component) e.getSource();
			if (!component.isEnabled())
				return;
			boolean isInside = this.trackableUI.isInside(e);
			// boolean isInsideChanged = (this.isMouseInside != isInside);
			this.isMouseInside = isInside;
			this.model.setEnabled(component.isEnabled());
		} finally {
			this.stateTransitionTracker.onModelStateChanged();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
	 */
	public void mouseMoved(MouseEvent e) {
		// System.out.println("mouse moved [" + e.getX() + ":" + e.getY() +
		// "]");
		this.stateTransitionTracker.turnOffModelChangeTracking();
		try {
			Component component = (Component) e.getSource();
			if (!component.isEnabled())
				return;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	public void mouseClicked(MouseEvent e) {
	}
}
