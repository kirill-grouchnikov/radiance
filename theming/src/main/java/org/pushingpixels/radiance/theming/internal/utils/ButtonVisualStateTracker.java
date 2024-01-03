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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;

import javax.swing.*;
import java.beans.PropertyChangeListener;

/**
 * Utility class to track transitions in visual state of buttons.
 * 
 * @author Kirill Grouchnikov
 */
public class ButtonVisualStateTracker {
	/**
	 * The rollover button listener.
	 */
	private RolloverButtonListener radianceButtonListener;
	/**
	 * Property change listener.
	 */
	private PropertyChangeListener radiancePropertyListener;

	private StateTransitionTracker stateTransitionTracker;

	/**
	 * Installs tracking listeners on the specified button.
	 * 
	 * @param b
	 *            Button.
	 * @param toInstallRolloverListener
	 *            If <code>true</code>, the button will have the rollover
	 *            listener installed on it.
	 */
	public void installListeners(final AbstractButton b, boolean toInstallRolloverListener) {
		this.stateTransitionTracker = new StateTransitionTracker(b, b.getModel());
		this.stateTransitionTracker.registerModelListeners();
		this.stateTransitionTracker.registerFocusListeners();
		if (toInstallRolloverListener) {
			this.radianceButtonListener = new RolloverButtonListener(b,
					this.stateTransitionTracker);
			b.addMouseListener(this.radianceButtonListener);
			b.addMouseMotionListener(this.radianceButtonListener);
			b.addFocusListener(this.radianceButtonListener);
			b.addPropertyChangeListener(this.radianceButtonListener);
			b.addChangeListener(this.radianceButtonListener);
		}

		this.radiancePropertyListener = propertyChangeEvent -> {
			if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
				stateTransitionTracker.setModel((ButtonModel) propertyChangeEvent.getNewValue());
			}
		};
		b.addPropertyChangeListener(this.radiancePropertyListener);
	}

	/**
	 * Uninstalls the tracking listeners from the specified button.
	 * 
	 * @param b
	 *            Button.
	 */
	public void uninstallListeners(AbstractButton b) {
		if (this.radianceButtonListener != null) {
			b.removeMouseListener(this.radianceButtonListener);
			b.removeMouseMotionListener(this.radianceButtonListener);
			b.removeFocusListener(this.radianceButtonListener);
			b.removePropertyChangeListener(this.radianceButtonListener);
			b.removeChangeListener(this.radianceButtonListener);
			this.radianceButtonListener = null;
		}

		b.removePropertyChangeListener(this.radiancePropertyListener);
		this.radiancePropertyListener = null;

		this.stateTransitionTracker.unregisterModelListeners();
		this.stateTransitionTracker.unregisterFocusListeners();
	}

	public StateTransitionTracker getStateTransitionTracker() {
		return this.stateTransitionTracker;
	}
}
