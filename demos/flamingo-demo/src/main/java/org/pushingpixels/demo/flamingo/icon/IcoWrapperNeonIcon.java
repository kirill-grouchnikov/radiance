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
package org.pushingpixels.demo.flamingo.icon;

import org.pushingpixels.neon.api.icon.NeonIcon;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Implementation of {@link NeonIcon} interface that wraps ICO files.
 * 
 * @author Kirill Grouchnikov
 */
public class IcoWrapperNeonIcon extends IcoWrapperIcon implements NeonIcon {
	/**
	 * Returns the icon for the specified URL.
	 * 
	 * @param location
	 *            Icon URL.
	 * @param initialDim
	 *            Initial dimension of the icon.
	 * @return Icon instance.
	 */
	public static IcoWrapperNeonIcon getIcon(URL location, double scale,
			final Dimension initialDim) {
		try {
			return new IcoWrapperNeonIcon(location.openStream(), scale, initialDim);
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}

	/**
	 * Returns the icon for the specified input stream.
	 * 
	 * @param inputStream
	 *            Icon input stream.
	 * @param initialDim
	 *            Initial dimension of the icon.
	 * @return Icon instance.
	 */
	public static IcoWrapperNeonIcon getIcon(InputStream inputStream, double scale,
			final Dimension initialDim) {
		return new IcoWrapperNeonIcon(inputStream, scale, initialDim);
	}

	/**
	 * Creates a new ICO-based resizable icon.
	 * 
	 * @param inputStream
	 *            Input stream with the ICO content.
	 * @param initialDim
	 *            Initial dimension of the icon.
	 */
	private IcoWrapperNeonIcon(InputStream inputStream, double scale,
			Dimension initialDim) {
		super(inputStream, scale, initialDim.width, initialDim.height);
	}

	@Override
	public void setDimension(Dimension dim) {
		this.setPreferredSize(dim);
	}

	@Override
	public void setColorFilter(ColorFilter colorFilter) {
		throw new UnsupportedOperationException();
	}
}
