/*
 * Copyright (c) 2001-2005 JGoodies Karsten Lentzsch. All Rights Reserved.
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
 *  o Neither the name of JGoodies Karsten Lentzsch nor the names of 
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

package org.pushingpixels.substance.internal.contrib.jgoodies.looks;

/**
 * Describes font size hints used by the JGoodies Windows look&amp;feel; future
 * implementations of the Plastic l&amp;f may use the same hints.
 * <p>
 * 
 * These hints are only applied if the dialog font is <em>Tahoma</em>, which is
 * the default font on the majority of Windows desktops. The hints apply a size
 * delta to increase or decrease the given system font size.
 * <p>
 * 
 * NOTE: This is work in progress and will probably change in the next release,
 * to better reflect the font choice in the J2SE 1.4.".
 * 
 * @author Karsten Lentzsch
 * 
 * @see Options#setGlobalFontSizeHints(FontSizeHints)
 * @see FontUtils
 */
public final class FontSizeHints {

	public static final FontSizeHints LARGE = new FontSizeHints(12, 12, 14, 14);
	public static final FontSizeHints SYSTEM = new FontSizeHints(11, 11, 14, 14);
	public static final FontSizeHints MIXED2 = new FontSizeHints(11, 11, 14, 13);
	public static final FontSizeHints MIXED = new FontSizeHints(11, 11, 14, 12);
	public static final FontSizeHints SMALL = new FontSizeHints(11, 11, 12, 12);
	public static final FontSizeHints FIXED = new FontSizeHints(12, 12, 12, 12);

	public static final FontSizeHints DEFAULT = SYSTEM;

	private final int loResMenuFontSize;
	private final int loResControlFontSize;
	private final int hiResMenuFontSize;
	private final int hiResControlFontSize;

	/**
	 * Constructs <code>FontSizeHints</code> for the specified menu and control
	 * fonts, both for low and high resolution environments.
	 * 
	 * @param loResMenuFontSize
	 *            the size of the menu font in low resolution
	 * @param loResControlFontSize
	 *            the size of the control font in low resolution
	 * @param hiResMenuFontSize
	 *            the size of the menu font in low resolution
	 * @param hiResControlFontSize
	 *            the size of the control font in low resolution
	 */
	public FontSizeHints(int loResMenuFontSize, int loResControlFontSize,
			int hiResMenuFontSize, int hiResControlFontSize) {
		this.loResMenuFontSize = loResMenuFontSize;
		this.loResControlFontSize = loResControlFontSize;
		this.hiResMenuFontSize = hiResMenuFontSize;
		this.hiResControlFontSize = hiResControlFontSize;
	}

	/**
	 * Returns the low resolution menu font size.
	 * 
	 * @return the size of the menu font in low resolution mode
	 */
	public int loResMenuFontSize() {
		return loResMenuFontSize;
	}

	/**
	 * Returns the low resolution control font size.
	 * 
	 * @return the size of the control font in low resolution mode
	 */
	public int loResControlFontSize() {
		return loResControlFontSize;
	}

	/**
	 * Returns the high resolution menu font size.
	 * 
	 * @return the size of the menu font in high resolution mode
	 */
	public int hiResMenuFontSize() {
		return hiResMenuFontSize;
	}

	/**
	 * Returns the high resolution control font size.
	 * 
	 * @return the size of the control font in high resolution mode
	 */
	public int hiResControlFontSize() {
		return hiResControlFontSize;
	}

	/**
	 * Returns the menu font size.
	 * 
	 * @return the size of the menu font in the current resolution
	 */
	public int menuFontSize() {
		return LookUtils.IS_LOW_RESOLUTION ? loResMenuFontSize
				: hiResMenuFontSize();
	}

	/**
	 * Returns the control font size.
	 * 
	 * @return the size of the control font in the current resolution
	 */
	public int controlFontSize() {
		return LookUtils.IS_LOW_RESOLUTION ? loResControlFontSize
				: hiResControlFontSize();
	}

	/**
	 * Returns the delta between the system menu font size and our menu font
	 * size hint.
	 * 
	 * @return the delta between the system menu font size and our menu font
	 *         size hint
	 */
	public float menuFontSizeDelta() {
		return menuFontSize() - SYSTEM.menuFontSize();
	}

	/**
	 * Returns the delta between system control font size and our control font
	 * size hint.
	 * 
	 * @return the delta between the system control font size and our control
	 *         font size hint
	 */
	public float controlFontSizeDelta() {
		return controlFontSize() - SYSTEM.controlFontSize();
	}

	/**
	 * Looksup and returns the <code>FontSizeHints</code> for the specified
	 * name.
	 * 
	 * @param name
	 *            the name of the FontSizeHints object
	 * @return the associated FontSizeHints object
	 */
	public static FontSizeHints valueOf(String name) {
		if (name.equalsIgnoreCase("LARGE"))
			return LARGE;
		else if (name.equalsIgnoreCase("SYSTEM"))
			return SYSTEM;
		else if (name.equalsIgnoreCase("MIXED"))
			return MIXED;
		else if (name.equalsIgnoreCase("SMALL"))
			return SMALL;
		else if (name.equalsIgnoreCase("FIXED"))
			return FIXED;
		else
			throw new IllegalArgumentException("Unknown font size hints name: "
					+ name);
	}
}