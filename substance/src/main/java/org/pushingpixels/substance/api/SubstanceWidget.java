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
package org.pushingpixels.substance.api;

import javax.swing.JComponent;

/**
 * Interface for Substance widgets (behavioral traits).
 * 
 * @author Kirill Grouchnikov
 */
public abstract class SubstanceWidget<T extends JComponent> {
	/**
     * Associated component.
     */
    protected T jcomp;

	/**
	 * Associates a component with <code>this</code> widget.
	 * 
	 * @param jcomp
	 *            Component.
	 */
	public void setComponent(T jcomp) {
        this.jcomp = jcomp;
    }

	/**
	 * Installs UI on the associated component.
	 */
	public void installUI() {
	}

	/**
	 * Installs default settings for the associated component.
	 */
	public void installDefaults() {
    }

	/**
	 * Installs listeners for the associated component.
	 */
	public void installListeners() {
    }

	/**
	 * Installs components for the associated component.
	 */
	public void installComponents() {
    }

	/**
	 * Uninstalls UI on the associated component.
	 */
	public void uninstallUI() {
    }

	/**
	 * Uninstalls default settings for the associated component.
	 */
	public void uninstallDefaults() {
    }

	/**
	 * Uninstalls listeners for the associated component.
	 */
	public void uninstallListeners() {
    }

	/**
	 * Uninstalls components for the associated component.
	 */
	public void uninstallComponents() {
    }
}
