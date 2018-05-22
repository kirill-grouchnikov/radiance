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

import javax.swing.plaf.FontUIResource;

import org.pushingpixels.substance.api.font.FontPolicy;
import org.pushingpixels.substance.api.font.FontSet;

/**
 * Provides predefined FontSet implementations.
 * 
 * @author Karsten Lentzsch
 * 
 * @see FontSet
 * @see FontPolicy
 * @see FontPolicies
 * 
 * @since 2.0
 */
public final class FontSets {

	private static FontSet logicalFontSet;

	private FontSets() {
		// Override default constructor; prevents instantation.
	}

	// Default FontSets *******************************************************

	/**
	 * Creates and returns a FontSet that is based only on the given control
	 * font. The small font will be derived from the control font; all other
	 * fonts returned are the control font.
	 * 
	 * @param controlFont
	 *            the font used for all controls
	 * 
	 * @return a FontSet based on the given fonts
	 * 
	 * @throws NullPointerException
	 *             if the control font is <code>null</code>
	 */
	public static FontSet createDefaultFontSet(Font controlFont) {
		return createDefaultFontSet(controlFont, null);
	}

	/**
	 * Creates and returns a FontSet that is based on the given control font and
	 * menu font. The small font will be derived from the control font; all
	 * other fonts return, except the menu font, are the control font.
	 * 
	 * @param controlFont
	 *            the font used for all controls
	 * @param menuFont
	 *            the font used for the menu bar and menu items
	 * 
	 * @return a FontSet based on the given fonts
	 * 
	 * @throws NullPointerException
	 *             if the control font is <code>null</code>
	 */
	public static FontSet createDefaultFontSet(Font controlFont, Font menuFont) {
		return createDefaultFontSet(controlFont, menuFont, null, null, null,
				null);
	}

	/**
	 * Creates and returns a FontSet that is based on the given control font and
	 * menu font. The small font will be derived from the control font; all
	 * other fonts return, except the menu font, are the control font.
	 * 
	 * @param controlFont
	 *            the font used for all controls
	 * @param menuFont
	 *            the font used for the menu bar and menu items
	 * @param titleFont
	 *            used for TitledBorder, titles and titled separators
	 * 
	 * @return a FontSet based on the given fonts
	 * 
	 * @throws NullPointerException
	 *             if the control font is <code>null</code>
	 */
	public static FontSet createDefaultFontSet(Font controlFont, Font menuFont,
			Font titleFont) {
		return createDefaultFontSet(controlFont, menuFont, titleFont, null,
				null, null);
	}

	/**
	 * Creates and returns a FontSet for the given fonts. If a font is
	 * <code>null</code>, it uses the control font as fallback. If the small
	 * font is <code>null</code> it will be derived from the control font.
	 * 
	 * @param controlFont
	 *            used for all controls
	 * @param menuFont
	 *            used for the menu bar and menu items
	 * @param titleFont
	 *            used for TitledBorder, titles and titled separators
	 * @param messageFont
	 *            used for OptionPanes
	 * @param smallFont
	 *            used for tool tips and similar components
	 * @param windowTitleFont
	 *            used for internal frame window titles
	 * 
	 * @return a FontSet based on the given fonts
	 * 
	 * @throws NullPointerException
	 *             if the control font is <code>null</code>
	 */
	public static FontSet createDefaultFontSet(Font controlFont, Font menuFont,
			Font titleFont, Font messageFont, Font smallFont,
			Font windowTitleFont) {
		return new DefaultFontSet(controlFont, menuFont, titleFont,
				messageFont, smallFont, windowTitleFont);
	}

	// Logical FontSet ********************************************************

	/**
	 * Lazily creates and returns the FontSet that returns the logical fonts
	 * specified by the Java runtime environment.
	 * 
	 * @return a FontSets that uses the logical fonts specified by the Java
	 *         environment
	 */
	public static FontSet getLogicalFontSet() {
		if (logicalFontSet == null) {
			logicalFontSet = new LogicalFontSet();
		}
		return logicalFontSet;
	}

	// Helper Code ************************************************************

	private static final class DefaultFontSet implements FontSet {

		private final FontUIResource controlFont;
		private final FontUIResource menuFont;
		private final FontUIResource titleFont;
		private final FontUIResource messageFont;
		private final FontUIResource smallFont;
		private final FontUIResource windowTitleFont;

		// Instance Creation --------------------------------------------------

		/**
		 * Constructs a DefaultFontSet for the given fonts. If a font is
		 * <code>null</code>, it uses the control font as fallback. If the small
		 * font is <code>null</code> it will be derived from the control font.
		 * 
		 * @param controlFont
		 *            used for all controls
		 * @param menuFont
		 *            used for the menu bar and menu items
		 * @param titleFont
		 *            used for TitledBorder, titles and titled separators
		 * @param messageFont
		 *            used for OptionPanes
		 * @param smallFont
		 *            used for tool tips and similar components
		 * @param windowTitleFont
		 *            used for internal frame window titles
		 * 
		 * @throws NullPointerException
		 *             if the control font is <code>null</code>
		 */
		public DefaultFontSet(Font controlFont, Font menuFont, Font titleFont,
				Font messageFont, Font smallFont, Font windowTitleFont) {
			this.controlFont = new FontUIResource(controlFont);
			this.menuFont = menuFont != null ? new FontUIResource(menuFont)
					: this.controlFont;
			this.titleFont = titleFont != null ? new FontUIResource(titleFont)
					: this.controlFont; // new
			// FontUIResource(controlFont.deriveFont
			// (Font.BOLD))
			this.messageFont = messageFont != null ? new FontUIResource(
					messageFont) : this.controlFont;
			this.smallFont = new FontUIResource(smallFont != null ? smallFont
					: controlFont.deriveFont(controlFont.getSize2D() - 2f));
			this.windowTitleFont = windowTitleFont != null ? new FontUIResource(
					windowTitleFont)
					: this.titleFont;
		}

		// FontSet API --------------------------------------------------------

		public FontUIResource getControlFont() {
			return controlFont;
		}

		public FontUIResource getMenuFont() {
			return menuFont;
		}

		public FontUIResource getTitleFont() {
			return titleFont;
		}

		public FontUIResource getWindowTitleFont() {
			return windowTitleFont;
		}

		public FontUIResource getSmallFont() {
			return smallFont;
		}

		public FontUIResource getMessageFont() {
			return messageFont;
		}

	}

	/**
	 * Looks up and returns the logical fonts as specified by the Java runtime
	 * environment.
	 */
	private static final class LogicalFontSet implements FontSet {

		private FontUIResource controlFont;
		private FontUIResource titleFont;
		private FontUIResource systemFont;
		private FontUIResource smallFont;

		public FontUIResource getControlFont() {
			if (controlFont == null) {
				controlFont = new FontUIResource(Font.getFont(
						"swing.plaf.metal.controlFont", new Font("Dialog",
								Font.PLAIN, 12)));

			}
			return controlFont;
		}

		public FontUIResource getMenuFont() {
			return getControlFont();
		}

		public FontUIResource getTitleFont() {
			if (titleFont == null) {
				titleFont = new FontUIResource(getControlFont().deriveFont(
						Font.BOLD));
			}
			return titleFont;
		}

		public FontUIResource getSmallFont() {
			if (smallFont == null) {
				smallFont = new FontUIResource(Font.getFont(
						"swing.plaf.metal.smallFont", new Font("Dialog",
								Font.PLAIN, 10)));
			}
			return smallFont;
		}

		public FontUIResource getMessageFont() {
			if (systemFont == null) {
				systemFont = new FontUIResource(Font.getFont(
						"swing.plaf.metal.systemFont", new Font("Dialog",
								Font.PLAIN, 12)));
			}
			return systemFont;
		}

		public FontUIResource getWindowTitleFont() {
			return getTitleFont();
		}

	}

}
