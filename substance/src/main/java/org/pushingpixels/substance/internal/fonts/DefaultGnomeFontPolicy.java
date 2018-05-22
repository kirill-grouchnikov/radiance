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

import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.lang.reflect.Method;
import java.util.StringTokenizer;

import javax.swing.UIDefaults;
import javax.swing.plaf.FontUIResource;

import org.pushingpixels.substance.api.font.FontPolicy;
import org.pushingpixels.substance.api.font.FontSet;

/**
 * The default font policy for Gnome OS.
 * 
 * @author Kirill Grouchnikov
 */
public class DefaultGnomeFontPolicy implements FontPolicy {
	/**
	 * Font scale.
	 */
	private static double fontScale;

	static {
		GraphicsEnvironment ge = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsConfiguration gc = ge.getDefaultScreenDevice()
				.getDefaultConfiguration();
		AffineTransform at = gc.getNormalizingTransform();
		fontScale = at.getScaleY();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.fonts.FontPolicy#getFontSet(java.lang.String,
	 * javax.swing.UIDefaults)
	 */
	public FontSet getFontSet(String lafName, UIDefaults table) {
		Object defaultGtkFontName = Toolkit.getDefaultToolkit()
				.getDesktopProperty("gnome.Gtk/FontName");
		String family = "";
		int style = Font.PLAIN;
		int size = 10;
		if (defaultGtkFontName instanceof String) {
			String pangoName = (String) defaultGtkFontName;
			StringTokenizer tok = new StringTokenizer(pangoName);
			while (tok.hasMoreTokens()) {
				String word = tok.nextToken();
				boolean allDigits = true;
				for (int i = 0; i < word.length(); i++) {
					if (!Character.isDigit(word.charAt(i))) {
						allDigits = false;
						break;
					}
				}

				if (word.equalsIgnoreCase("italic")) {
					style |= Font.ITALIC;
				} else if (word.equalsIgnoreCase("bold")) {
					style |= Font.BOLD;
				} else if (allDigits) {
					try {
						size = Integer.parseInt(word);
					} catch (NumberFormatException nfe) {
						size = 10;
					}
				} else {
					if (family.length() > 0) {
						family += " ";
					}
					family += word;
				}
			}
		}

		double dsize = size * getPointsToPixelsRatio();

		size = (int) (dsize + 0.5);
		if (size < 1) {
			size = 1;
		}

		if (family.length() == 0)
			family = "sans";
		// Font controlFont = new Font(family, style, size);

		Font controlFont = null;
		// make some black magic with sun-private classes
		// to better map the logical font name (such as sans)
		// to an actual font (such as DejaVu Sans).
		String fcFamilyLC = family.toLowerCase();
		try {
			Class fontManagerClass = Class.forName("sun.font.FontManager");
			Method mapFcMethod = fontManagerClass.getMethod("mapFcName",
					new Class[] { String.class });
			Object mapFcMethodResult = mapFcMethod.invoke(null, fcFamilyLC);
			if (mapFcMethodResult != null) {
				Method getFontConfigFUIRMethod = fontManagerClass.getMethod(
						"getFontConfigFUIR", new Class[] { String.class,
								int.class, int.class });
				controlFont = (Font) getFontConfigFUIRMethod.invoke(null,
						fcFamilyLC, style, size);
			} else {
				Font font = new FontUIResource(family, style, size);
				Method getCompositeFontUIResourceMethod = fontManagerClass
						.getMethod("getCompositeFontUIResource",
								new Class[] { Font.class });
				controlFont = (Font) getCompositeFontUIResourceMethod.invoke(
						null, font);
			}
		} catch (Throwable t) {
			controlFont = new Font(family, style, size);
		}

		return FontSets.createDefaultFontSet(controlFont);
	}

	public static double getPointsToPixelsRatio() {
		// for details behind the computations, look in
		// com.sun.java.swing.plaf.gtk.PangoFonts
		int dpi = 96;
		Object value = Toolkit.getDefaultToolkit().getDesktopProperty(
				"gnome.Xft/DPI");
		if (value instanceof Integer) {
			dpi = ((Integer) value).intValue() / 1024;
			if (dpi == -1) {
				dpi = 96;
			}
			if (dpi < 50) {
				dpi = 50;
			}
			return dpi / 72.0;
		} else {
			return fontScale;
		}
	}
}
