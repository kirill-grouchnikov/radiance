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
package org.pushingpixels.substance.api.painter.decoration;

import java.net.URL;

import javax.imageio.ImageIO;

import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Implementation of {@link SubstanceDecorationPainter} that uses brushed metal
 * painting on decoration areas.
 * 
 * @author Kirill Grouchnikov
 * @since version 4.0
 */
public class BrushedMetalDecorationPainter extends
		ImageWrapperDecorationPainter {
	/**
	 * The display name for the decoration painters of this class.
	 */
	public static final String DISPLAY_NAME = "Brushed Metal";

	/**
	 * Creates a new brushed metal decoration painter.
	 */
	public BrushedMetalDecorationPainter() {
		super();
		try {
			// the following is fix by Dag Joar and Christian Schlichtherle
			// for application running with -Xbootclasspath VM flag. In this
			// case, the using MyClass.class.getClassLoader() would return
			// null, but the context class loader will function properly
			// that classes will be properly loaded regardless of whether
			// the lib is added to the system class path, the extension class
			// path and regardless of the class loader architecture set up by
			// some frameworks.
			ClassLoader cl = SubstanceCoreUtilities
					.getClassLoaderForResources();
			URL metalUrl = cl.getResource("org/pushingpixels/substance/internal/image/brushed.gif");
			this.originalTile = ImageIO.read(metalUrl);
		} catch (Exception exc) {
			// ignore - probably specified incorrect file
			// or file is not image
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.utils.SubstanceTrait#getDisplayName()
	 */
	public String getDisplayName() {
		return DISPLAY_NAME;
	}
}
