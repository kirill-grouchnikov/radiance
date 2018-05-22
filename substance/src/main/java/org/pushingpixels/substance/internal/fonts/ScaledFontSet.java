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
package org.pushingpixels.substance.internal.fonts;

import javax.swing.plaf.FontUIResource;

import org.pushingpixels.substance.api.font.FontSet;

/**
 * Wrapper around the base Substance font set. Is used to create larger /
 * smaller font sets.
 * 
 * @author Kirill Grouchnikov
 */
public class ScaledFontSet implements FontSet {
	/**
	 * Scale factor. Should be positive.
	 */
	private float scaleFactor;

	/**
	 * The base Substance font set.
	 */
	private FontSet delegate;

	/**
	 * Creates a wrapper font set.
	 * 
	 * @param delegate
	 *            The base Substance font set.
	 * @param scaleFactor
	 *            Scale factor. Should be positive.
	 */
	public ScaledFontSet(FontSet delegate, float scaleFactor) {
		super();
		this.delegate = delegate;
		this.scaleFactor = scaleFactor;
	}

	/**
	 * Returns the wrapped font.
	 * 
	 * @param systemFont
	 *            Original font.
	 * @return Wrapped font.
	 */
	private FontUIResource getWrappedFont(FontUIResource systemFont) {
		return new FontUIResource(systemFont.getFontName(), systemFont
				.getStyle(), (int) (systemFont.getSize() * this.scaleFactor));
	}

	public FontUIResource getControlFont() {
		return this.getWrappedFont(this.delegate.getControlFont());
	}

	public FontUIResource getMenuFont() {
		return this.getWrappedFont(this.delegate.getMenuFont());
	}

	public FontUIResource getMessageFont() {
		return this.getWrappedFont(this.delegate.getMessageFont());
	}

	public FontUIResource getSmallFont() {
		return this.getWrappedFont(this.delegate.getSmallFont());
	}

	public FontUIResource getTitleFont() {
		return this.getWrappedFont(this.delegate.getTitleFont());
	}

	public FontUIResource getWindowTitleFont() {
		return this.getWrappedFont(this.delegate.getWindowTitleFont());
	}
}
