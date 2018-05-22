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
package org.pushingpixels.substance.api.colorscheme;

import java.awt.Color;

/**
 * Interface for derived color scheme colors.
 * 
 * @author Kirill Grouchnikov
 */
public interface SchemeDerivedColors {
	/**
	 * Returns the watermark stamp color for <code>this</code> scheme.
	 * 
	 * @return Watermark stamp color for <code>this</code> scheme.
	 */
	public Color getWatermarkStampColor();

	/**
	 * Returns the watermark light color for <code>this</code> scheme.
	 * 
	 * @return Watermark light color for <code>this</code> scheme.
	 */
	public Color getWatermarkLightColor();

	/**
	 * Returns the watermark dark color for <code>this</code> scheme.
	 * 
	 * @return Watermark dark color for <code>this</code> scheme.
	 */
	public Color getWatermarkDarkColor();

	/**
	 * Returns the line color for <code>this</code> scheme.
	 * 
	 * @return The line color for <code>this</code> scheme.
	 */
	public Color getLineColor();

	/**
	 * Returns the selection background color for <code>this</code> scheme.
	 * 
	 * @return The selection background color for <code>this</code> scheme.
	 */
	public Color getSelectionBackgroundColor();

	/**
	 * Returns the selection foreground color for <code>this</code> scheme.
	 * 
	 * @return The selection foreground color for <code>this</code> scheme.
	 */
	public Color getSelectionForegroundColor();

	/**
	 * Returns the background fill color for <code>this</code> scheme.
	 * 
	 * @return The background fill color for <code>this</code> scheme.
	 */
	public Color getBackgroundFillColor();

	/**
	 * Returns the text background fill color for <code>this</code> scheme.
	 * 
	 * @return The text background fill color for <code>this</code> scheme.
	 */
	public Color getTextBackgroundFillColor();

	/**
	 * Returns the focus ring color for <code>this</code> scheme.
	 * 
	 * @return The focus ring color for <code>this</code> scheme.
	 */
	public Color getFocusRingColor();
}
