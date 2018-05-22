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

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.utils.scroll.SubstanceScrollButton;
import org.pushingpixels.trident.swing.SwingRepaintCallback;

/**
 * Utility class to track transitions in visual state of buttons.
 * 
 * @author Kirill Grouchnikov
 */
public class ButtonVisualStateTracker {
	/**
	 * The rollover button listener.
	 */
	private RolloverButtonListener substanceButtonListener;
	/**
	 * Property change listener. Listens on changes to the
	 * {@link SubstanceLookAndFeel#BUTTON_SHAPER} property and
	 * {@link AbstractButton#MODEL_CHANGED_PROPERTY} property.
	 */
	protected PropertyChangeListener substancePropertyListener;

	protected StateTransitionTracker stateTransitionTracker;

	/**
	 * Installs tracking listeners on the specified button.
	 * 
	 * @param b
	 *            Button.
	 * @param toInstallRolloverListener
	 *            If <code>true</code>, the button will have the rollover
	 *            listener installed on it.
	 */
	public void installListeners(final AbstractButton b,
			boolean toInstallRolloverListener) {
		this.stateTransitionTracker = new StateTransitionTracker(b, b
				.getModel());
		if (b instanceof SubstanceScrollButton) {
			this.stateTransitionTracker.setRepaintCallback(() -> {
					JScrollBar scrollBar = (JScrollBar) SwingUtilities
							.getAncestorOfClass(JScrollBar.class, b);
					if (scrollBar != null)
						return new SwingRepaintCallback(scrollBar);
					return new SwingRepaintCallback(b);
			});
		}
		this.stateTransitionTracker.registerModelListeners();
		this.stateTransitionTracker.registerFocusListeners();
		if (toInstallRolloverListener) {
			this.substanceButtonListener = new RolloverButtonListener(b,
					this.stateTransitionTracker);
			b.addMouseListener(this.substanceButtonListener);
			b.addMouseMotionListener(this.substanceButtonListener);
			b.addFocusListener(this.substanceButtonListener);
			b.addPropertyChangeListener(this.substanceButtonListener);
			b.addChangeListener(this.substanceButtonListener);
		}

		this.substancePropertyListener = (PropertyChangeEvent evt) -> {
			if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(evt
					.getPropertyName())) {
				stateTransitionTracker.setModel((ButtonModel) evt
						.getNewValue());
			}
		};
		b.addPropertyChangeListener(this.substancePropertyListener);
	}

	/**
	 * Uninstalls the tracking listeners from the specified button.
	 * 
	 * @param b
	 *            Button.
	 */
	public void uninstallListeners(AbstractButton b) {
		if (this.substanceButtonListener != null) {
			b.removeMouseListener(this.substanceButtonListener);
			b.removeMouseMotionListener(this.substanceButtonListener);
			b.removeFocusListener(this.substanceButtonListener);
			b.removePropertyChangeListener(this.substanceButtonListener);
			b.removeChangeListener(this.substanceButtonListener);
			this.substanceButtonListener = null;
		}

		b.removePropertyChangeListener(this.substancePropertyListener);
		this.substancePropertyListener = null;

		this.stateTransitionTracker.unregisterModelListeners();
		this.stateTransitionTracker.unregisterFocusListeners();
	}

	public StateTransitionTracker getStateTransitionTracker() {
		return this.stateTransitionTracker;
	}
}
