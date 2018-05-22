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

package org.pushingpixels.substance.internal.fonts;

import java.awt.Font;

import javax.swing.UIDefaults;

import org.pushingpixels.substance.api.font.FontPolicy;
import org.pushingpixels.substance.api.font.FontSet;
import org.pushingpixels.substance.internal.contrib.jgoodies.looks.LookUtils;

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
	 * Returns a font policy that checks for a custom FontPolicy and a custom
	 * FontSet specified in the System settings or UIManager. If no custom
	 * settings are available, the given default policy will be used to look up
	 * the FontSet.
	 * 
	 * @param defaultPolicy
	 *            the policy used if there are no custom settings
	 * @return a FontPolicy that checks for custom settings before the default
	 *         policy is returned.
	 */
	public static FontPolicy customSettingsPolicy(FontPolicy defaultPolicy) {
		return new CustomSettingsPolicy(defaultPolicy);
	}

	// /**
	// * Returns the default platform independent font choice policy.<p>
	// *
	// * The current implementation just returns the logical fonts.
	// * A future version shall check for available good fonts
	// * and shall use them before it falls back to the logical fonts.
	// *
	// * @return the default platform independent font choice policy.
	// */
	// public static FontPolicy getDefaultCrossPlatformPolicy() {
	// return new DefaultCrossPlatformPolicy();
	// }

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
		// return getDefaultCrossPlatformPolicy();
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

	/**
	 * Returns a font policy for getting a Plastic appearance that aims to be
	 * visual backward compatible with the JGoodies Looks version 1.x. It uses a
	 * font choice similar to the choice implemented by the Plastic L&amp;fs in
	 * the JGoodies Looks version 1.x.
	 * 
	 * @return a font policy that aims to reproduce the Plastic font choice in
	 *         the JGoodies Looks 1.x.
	 */
	public static FontPolicy getLooks1xPlasticPolicy() {
		Font controlFont = Fonts.getDefaultGUIFontWesternModernWindowsNormal();
		Font menuFont = controlFont;
		Font titleFont = controlFont.deriveFont(Font.BOLD);
		FontSet fontSet = FontSets.createDefaultFontSet(controlFont, menuFont,
				titleFont);
		return createFixedPolicy(fontSet);
	}

	/**
	 * Returns a font policy for getting a Windows appearance that aims to be
	 * visual backward compatible with the JGoodies Looks version 1.x. It uses a
	 * font choice similar to the choice implemented by the Windows L&amp;f in
	 * the JGoodies Looks version 1.x.
	 * 
	 * @return a font policy that aims to reproduce the Windows font choice in
	 *         the JGoodies Looks 1.x.
	 */
	public static FontPolicy getLooks1xWindowsPolicy() {
		return new Looks1xWindowsPolicy();
	}

	/**
	 * Returns a font policy intended for API users that want to move Plastic
	 * code from the Looks 1.x to the Looks 2.0. On Windows, it uses the Looks
	 * 2.0 Plastic fonts, on other platforms it uses the Looks 1.x Plastic
	 * fonts.
	 * 
	 * @return the recent Plastic font policy on Windows, the JGoodies Looks 1.x
	 *         on other Platforms.
	 */
	public static FontPolicy getTransitionalPlasticPolicy() {
		return LookUtils.IS_OS_WINDOWS ? getDefaultPlasticOnWindowsPolicy()
				: getLooks1xPlasticPolicy();
	}

	// Utility Methods ********************************************************

	/**
	 * Looks up and returns a custom FontSet for the given Look&amp;Feel name,
	 * or <code>null</code> if no custom font set has been defined for this
	 * Look&amp;Feel.
	 * 
	 * @param the
	 *            name of the Look&amp;Feel, one of <code>"Plastic"</code> or
	 *            <code>"Windows"</code>
	 * @return a custom FontPolicy - if any - or otherwise <code>null</code>
	 */
	private static FontSet getCustomFontSet(String lafName) {
		String controlFontKey = lafName + ".controlFont";
		String menuFontKey = lafName + ".menuFont";
		String decodedControlFont = LookUtils.getSystemProperty(controlFontKey);
		if (decodedControlFont == null)
			return null;
		Font controlFont = Font.decode(decodedControlFont);
		String decodedMenuFont = LookUtils.getSystemProperty(menuFontKey);
		Font menuFont = decodedMenuFont != null ? Font.decode(decodedMenuFont)
				: null;
		Font titleFont = "Plastic".equals(lafName) ? controlFont
				.deriveFont(Font.BOLD) : controlFont;
		return FontSets.createDefaultFontSet(controlFont, menuFont, titleFont);
	}

	/**
	 * Looks up and returns a custom FontPolicy for the given Look&amp;Feel
	 * name, or <code>null</code> if no custom policy has been defined for this
	 * Look&amp;Feel.
	 * 
	 * @param the
	 *            name of the Look&amp;Feel, one of <code>"Plastic"</code> or
	 *            <code>"Windows"</code>
	 * @return a custom FontPolicy - if any - or otherwise <code>null</code>
	 */
	private static FontPolicy getCustomPolicy(String lafName) {
		// TODO: Look up predefined font choice policies
		return null;
	}

	private static final class CustomSettingsPolicy implements FontPolicy {

		private final FontPolicy wrappedPolicy;

		CustomSettingsPolicy(FontPolicy wrappedPolicy) {
			this.wrappedPolicy = wrappedPolicy;
		}

		public FontSet getFontSet(String lafName, UIDefaults table) {
			FontPolicy customPolicy = getCustomPolicy(lafName);
			if (customPolicy != null) {
				return customPolicy.getFontSet(null, table);
			}
			FontSet customFontSet = getCustomFontSet(lafName);
			if (customFontSet != null) {
				return customFontSet;
			}
			return wrappedPolicy.getFontSet(lafName, table);
		}
	}

	// private static final class DefaultCrossPlatformPolicy implements
	// FontPolicy {
	//        
	// public FontSet getFontSet(String lafName, UIDefaults table) {
	// // TODO: If Tahoma or Segoe UI is available, return them
	// // in a size appropriate for the screen resolution.
	// // Otherwise return the logical font set.
	// return FontSets.getLogicalFontSet();
	// }
	// }

	/**
	 * Implements the default font lookup for the Plastic L&f family when
	 * running in a Windows environment.
	 */
	private static final class DefaultPlasticOnWindowsPolicy implements
			FontPolicy {

		public FontSet getFontSet(String lafName, UIDefaults table) {
			Font windowsControlFont = Fonts.getWindowsControlFont();
			Font controlFont;
			if (windowsControlFont != null) {
				controlFont = windowsControlFont;
			} else if (table != null) {
				controlFont = table.getFont("Button.font");
			} else {
				controlFont = new Font("Dialog", Font.PLAIN, 12);
			}

			Font menuFont = table == null ? controlFont : table
					.getFont("Menu.font");
			Font titleFont = controlFont.deriveFont(Font.BOLD);

			return FontSets.createDefaultFontSet(controlFont, menuFont,
					titleFont);
		}
	}

	/**
	 * Implements the default font lookup on the Windows platform.
	 */
	private static final class DefaultWindowsPolicy implements FontPolicy {

		public FontSet getFontSet(String lafName, UIDefaults table) {
			Font windowsControlFont = Fonts.getWindowsControlFont();
			Font controlFont;
			if (windowsControlFont != null) {
				controlFont = windowsControlFont;
			} else if (table != null) {
				controlFont = table.getFont("Button.font");
			} else {
				controlFont = new Font("Dialog", Font.PLAIN, 12);
			}
			Font menuFont = table == null ? controlFont : table
					.getFont("Menu.font");
			Font titleFont = controlFont;
			Font messageFont = table == null ? controlFont : table
					.getFont("OptionPane.font");
			Font smallFont = table == null ? controlFont.deriveFont(controlFont
					.getSize2D() - 2f) : table.getFont("ToolTip.font");
			Font windowTitleFont = table == null ? controlFont : table
					.getFont("InternalFrame.titleFont");
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

		public FontSet getFontSet(String lafName, UIDefaults table) {
			return fontSet;
		}
	}

	/**
	 * Aims to mimic the font choice as used in the JGoodies Looks 1.x.
	 */
	private static final class Looks1xWindowsPolicy implements FontPolicy {

		public FontSet getFontSet(String lafName, UIDefaults table) {
			Font windowsControlFont = Fonts.getLooks1xWindowsControlFont();
			Font controlFont;
			if (windowsControlFont != null) {
				controlFont = windowsControlFont;
			} else if (table != null) {
				controlFont = table.getFont("Button.font");
			} else {
				controlFont = new Font("Dialog", Font.PLAIN, 12);
			}
			return FontSets.createDefaultFontSet(controlFont);
		}
	}

}
