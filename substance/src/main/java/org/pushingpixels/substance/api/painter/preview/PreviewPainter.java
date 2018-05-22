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
package org.pushingpixels.substance.api.painter.preview;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 * Base class for component preview painters.
 * 
 * @author Kirill Grouchnikov
 */
public abstract class PreviewPainter {
	/**
	 * Draws a component preview on the specified graphics.
	 * 
	 * @param parent
	 *            Component parent. May be <code>null</code>.
	 * @param component
	 *            Component. May be <code>null</code>.
	 * @param componentIndex
	 *            Component index in its parent. May be negative.
	 * @param g
	 *            Graphics context.
	 * @param x
	 *            X coordinate of the preview area.
	 * @param y
	 *            Y coordinate of the preview area.
	 * @param w
	 *            Width of the preview area.
	 * @param h
	 *            Height of the preview area.
	 */
	public void previewComponent(Container parent, Component component,
			int componentIndex, Graphics g, int x, int y, int w, int h) {
	}

	/**
	 * Checks whether the specified component is previewable.
	 * 
	 * @param parent
	 *            Component parent. May be <code>null</code>.
	 * @param component
	 *            Component. May be <code>null</code>.
	 * @param componentIndex
	 *            Component index in its parent. May be negative.
	 * @return <code>true</code> if the specified component is previewable,
	 *         <code>false</code> otherwise.
	 */
	public boolean hasPreview(Container parent, Component component,
			int componentIndex) {
		return false;
	}

	/**
	 * Checks whether the specified component has a preview window.
	 * 
	 * @param parent
	 *            Component parent. May be <code>null</code>.
	 * @param component
	 *            Component. May be <code>null</code>.
	 * @param componentIndex
	 *            Component index in its parent. May be negative.
	 * @return <code>true</code> if the specified component has a preview
	 *         window, <code>false</code> otherwise.
	 */
	public boolean hasPreviewWindow(Container parent, Component component,
			int componentIndex) {
		return false;
	}

	/**
	 * Returns the dimension for the component preview window.
	 * 
	 * @param parent
	 *            Component parent. May be <code>null</code>.
	 * @param component
	 *            Component. May be <code>null</code>.
	 * @param componentIndex
	 *            Component index in its parent. May be negative.
	 * @return Dimension of the component preview window.
	 */
	public Dimension getPreviewWindowDimension(Container parent,
			Component component, int componentIndex) {
		return new Dimension(300, 200);
	}

	/**
	 * Returns extra delay (in milliseconds) for showing the component preview
	 * window. The base delay is 2000 milliseconds (2 seconds). This function
	 * must return a non-negative value. Note that this method may not be called
	 * in some preview scenarios (that require immediate preview functionality).
	 * 
	 * @param parent
	 *            Component parent. May be <code>null</code>.
	 * @param component
	 *            Component. May be <code>null</code>.
	 * @param componentIndex
	 *            Component index in its parent. May be negative.
	 * @return Non-negative extra delay (in milliseconds) for showing the
	 *         component preview window.
	 */
	public int getPreviewWindowExtraDelay(Container parent,
			Component component, int componentIndex) {
		return 0;
	}

	/**
	 * Returns indication whether the thumbnail preview should be updated
	 * periodically. If the return value is <code>true</code>, then the
	 * implementation of {@link #getUpdateCycle(Container, Component, int)}
	 * returns the refresh cycle length in milliseconds.
	 * 
	 * @param parent
	 *            Component parent. May be <code>null</code>.
	 * @param component
	 *            Component. May be <code>null</code>.
	 * @param componentIndex
	 *            Component index in its parent. May be negative.
	 * @return <code>true</code> if the thumbnail preview of the specified
	 *         component should be updated periodically, <code>false</code>
	 *         otherwise.
	 */
	public boolean toUpdatePeriodically(Container parent, Component component,
			int componentIndex) {
		return false;
	}

	/**
	 * If the result of {@link #toUpdatePeriodically(Container, Component, int)}
	 * is <code>true</code>, returns the update cycle length in milliseconds.
	 * 
	 * @param parent
	 *            Component parent. May be <code>null</code>.
	 * @param component
	 *            Component. May be <code>null</code>.
	 * @param componentIndex
	 *            Component index in its parent. May be negative.
	 * @return Update cycle length in milliseconds for the thumbnail preview of
	 *         the specified component.
	 */
	public int getUpdateCycle(Container parent, Component component,
			int componentIndex) {
		return 10000;
	}
}
