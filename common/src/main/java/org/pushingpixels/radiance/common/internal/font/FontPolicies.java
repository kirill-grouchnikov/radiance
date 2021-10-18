/*
 * Copyright (c) 2001-2006 JGoodies Karsten Lentzsch. All Rights Reserved.
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

package org.pushingpixels.radiance.common.internal.font;

import org.pushingpixels.radiance.common.api.font.FontPolicy;
import org.pushingpixels.radiance.common.api.font.FontSet;
import org.pushingpixels.radiance.common.internal.contrib.jgoodies.looks.LookUtils;

import java.awt.*;

/**
 * Provides predefined FontPolicy implementations.
 * <p>
 * 
 * <strong>Note:</strong> The available policies work well on Windows. On other
 * platforms the fonts specified by the runtime environment are chosen. I plan
 * to provide more logic or options for other platforms, for example that a
 * Linux system checks for a Tahoma or Segoe UI.
 * <p>
 * 
 * TODO: Add a check for a custom font policy set in the System properties.
 * <p>
 * 
 * TODO: Add policies that emulate different Windows setups: default XP on 96dpi
 * with normal fonts ("XP-normal-96"), Vista on 120dpi with large fonts
 * ("Vista-large-120"), etc.
 * 
 * @author Karsten Lentzsch
 * 
 * @see FontPolicy
 * @see FontSet
 * @see FontSets
 * @see Fonts
 * 
 * @since 2.0
 */
public final class FontPolicies {

	private FontPolicies() {
		// Override default constructor; prevents instantation.
	}

	// Getting a FontPolicy *********************************************

	/**
	 * Returns a font policy that in turn always returns the specified FontSet.
	 * The FontSet will be fixed, but the FontSet itself may return different
	 * fonts in different environments.
	 * 
	 * @param fontSet
	 *            the FontSet to be return by this policy
	 * @return a font policy that returns the specified FontSet.
	 */
	public static FontPolicy createFixedPolicy(FontSet fontSet) {
		return new FixedPolicy(fontSet);
	}

	/**
	 * Returns the default font policy for Plastic on the Windows platform. It
	 * differs from the default Windows policy in that it uses a bold font for
	 * TitledBorders, titles, and titled separators.
	 * 
	 * @return the default font policy for Plastic on the Windows platform.
	 */
	public static FontPolicy getDefaultPlasticOnWindowsPolicy() {
		return new DefaultPlasticOnWindowsPolicy();
	}

	/**
	 * Returns the default Plastic FontPolicy that may vary with the platform
	 * and environment. On Windows, the PlasticOnWindowsPolicy is returned that
	 * is much like the defualt WindowsPolicy but uses a bold title font. On
	 * other Platforms, the logical fonts policy is returned that uses the
	 * logical fonts as specified by the Java runtime environment.
	 * 
	 * @return a Windows-like policy on Windows, a logical fonts policy on all
	 *         other platforms
	 */
	public static FontPolicy getDefaultPlasticPolicy() {
		if (LookUtils.IS_OS_WINDOWS) {
			return getDefaultPlasticOnWindowsPolicy();
		}
		return getLogicalFontsPolicy();
	}

	/**
	 * Returns the default font policy for the Windows platform. It aims to
	 * return a FontSet that is close to the native guidelines and useful for
	 * the current Java environment.
	 * <p>
	 * 
	 * The control font scales with the platform screen resolution
	 * (96dpi/101dpi/120dpi/144dpi/...) and honors the desktop font settings
	 * (normal/large/extra large).
	 * 
	 * @return the default font policy for the Windows platform.
	 */
	public static FontPolicy getDefaultWindowsPolicy() {
		return new DefaultWindowsPolicy();
	}

	/**
	 * Returns a font policy that returns the logical fonts as specified by the
	 * Java runtime environment.
	 * 
	 * @return a font policy that returns logical fonts.
	 */
	public static FontPolicy getLogicalFontsPolicy() {
		return createFixedPolicy(FontSets.getLogicalFontSet());
	}

	// Utility Methods ********************************************************

	/**
	 * Implements the default font lookup for the Plastic L&f family when
	 * running in a Windows environment.
	 */
	private static final class DefaultPlasticOnWindowsPolicy implements
			FontPolicy {

        @Override
		public FontSet getFontSet() {
			Font windowsControlFont = Fonts.getWindowsControlFont();
			Font controlFont;
			if (windowsControlFont != null) {
				controlFont = windowsControlFont;
			} else {
				controlFont = new Font("Dialog", Font.PLAIN, 12);
			}

			Font menuFont = controlFont;
			Font titleFont = controlFont.deriveFont(Font.BOLD);

			return FontSets.createDefaultFontSet(controlFont, menuFont,
					titleFont);
		}
	}

	/**
	 * Implements the default font lookup on the Windows platform.
	 */
	private static final class DefaultWindowsPolicy implements FontPolicy {

        @Override
		public FontSet getFontSet() {
			Font windowsControlFont = Fonts.getWindowsControlFont();
			Font controlFont;
			if (windowsControlFont != null) {
				controlFont = windowsControlFont;
			} else {
				controlFont = new FontSets.DefaultUIResourceFont("Dialog", Font.PLAIN, 12);
			}
			Font menuFont = controlFont;
			Font titleFont = controlFont;
			Font messageFont = controlFont;
			Font smallFont = controlFont.deriveFont(controlFont.getSize2D() - 2f);
			Font windowTitleFont = controlFont;
			return FontSets.createDefaultFontSet(controlFont, menuFont,
					titleFont, messageFont, smallFont, windowTitleFont);
		}
	}

	/**
	 * A FontPolicy that returns a fixed FontSet and that ignores the laf name
	 * and UIDefaults table.
	 */
	private static final class FixedPolicy implements FontPolicy {

		private final FontSet fontSet;

		FixedPolicy(FontSet fontSet) {
			this.fontSet = fontSet;
		}

		@Override
		public FontSet getFontSet() {
			return fontSet;
		}
	}
}
