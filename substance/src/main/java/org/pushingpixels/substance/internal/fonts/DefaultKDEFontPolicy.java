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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

import javax.swing.UIDefaults;

import org.pushingpixels.substance.api.font.FontPolicy;
import org.pushingpixels.substance.api.font.FontSet;

/**
 * The default font policy for KDE OS.
 * 
 * @author <a href="mailto:paranoid.tiberiumlabs@gmail.com">Paranoid</a>
 */
public class DefaultKDEFontPolicy implements FontPolicy {

	/**
	 * method to check if current user session is KDE
	 * 
	 * @return {@Code true} if KDE session is currently running.
	 */
	public static boolean isKDERunning() {
		// KDE_FULL_SESSION=true
		return "true".equals(System.getenv("KDE_FULL_SESSION"));
	}

	/**
	 * Checks for KDE4 flags in current env. There are few possible flags:<br/>
	 * {@code KDE_SESSION_VERSION=4<br/> DESKTOP_SESSION=kde4<br/>} If distro
	 * for some readon don't set this flags - KDE3 is possibli
	 * running.<br/><br/>
	 * 
	 * There is one more way to determine current KDE version. We can run
	 * {@code "konsole --version"} command and parse output, but KDE3 don't have
	 * own env flags, so this command will run every time we using KDE3.
	 * 
	 * @return {@code true} if KDE4 env flags found, {@code false} otherwise.
	 */
	private static boolean isKDE4Running() {
		if (!isKDERunning()) {
			throw new IllegalStateException("KDE is not running");
		}
		return "4".equals(System.getenv("KDE_SESSION_VERSION"))
				|| "kde4".equals(System.getenv("DESKTOP_SESSION"));
	}

	private static final String SANS_SERIF = "SansSerif";
	private static FontSet fontSet = null;

	public synchronized FontSet getFontSet(String lafName, UIDefaults table) {
		if (fontSet == null) {
			fontSet = getInternalFontSet(lafName, table);
		}
		return fontSet;
	}

	private FontSet getInternalFontSet(String lafName, UIDefaults table) {

		// size is the most important, then family and then style
		int commonSize = 10;
		int menuSize = 10;
		int titleSize = 10;
		int commonStyle = Font.PLAIN;
		int menuStyle = Font.PLAIN;
		int titleStyle = Font.BOLD;
		String commonFamily = SANS_SERIF;
		String menuFamily = SANS_SERIF;
		String titleFamily = SANS_SERIF;

		// size is the most important, then family and then style

		/*
		 * KDE4 can set common, menu, small and window title, while KDE3 can set
		 * only common, menu and window title. But in KDE4 config files small
		 * font is named "smallestReadableFont"
		 */

		// <editor-fold defaultstate="collapsed" desc=" reading fonts ">
		try {

			String kdeglobals = getFileContent("kdeglobals");

			Pattern pattern = Pattern.compile(",");

			try {

				String fontParam = getIniParam(kdeglobals, "[General]", "font");
				String[] fontParams = pattern.split(fontParam);
				commonFamily = fontParams[0];
				commonSize = Integer.parseInt(fontParams[1]);
				boolean bold = "75".equals(fontParams[4]);
				boolean italic = "1".equals(fontParams[5]);
				if (bold && italic) {
					commonStyle = Font.BOLD + Font.ITALIC;
				} else if (italic) {
					commonStyle = Font.ITALIC;
				} else if (bold) {
					commonStyle = Font.BOLD;
				} else {
					commonStyle = Font.PLAIN;
				}

			} catch (Exception commonReadException) {
				commonFamily = SANS_SERIF;
				commonSize = 10;
				commonStyle = Font.PLAIN;
			}

			try {

				String menuFontParam = getIniParam(kdeglobals, "[General]",
						"menuFont");
				String[] menuFontParams = pattern.split(menuFontParam);
				menuFamily = menuFontParams[0];
				menuSize = Integer.parseInt(menuFontParams[1]);
				boolean bold = "75".equals(menuFontParams[4]);
				boolean italic = "1".equals(menuFontParams[5]);
				if (bold && italic) {
					menuStyle = Font.BOLD + Font.ITALIC;
				} else if (italic) {
					menuStyle = Font.ITALIC;
				} else if (bold) {
					menuStyle = Font.BOLD;
				} else {
					menuStyle = Font.PLAIN;
				}

			} catch (Exception menuReadException) {
				menuFamily = SANS_SERIF;
				menuSize = 10;
				menuStyle = Font.PLAIN;
			}

			try {

				String activeFontParam = getIniParam(kdeglobals, "[WM]",
						"activeFont");
				String[] activeFontParams = pattern.split(activeFontParam);
				titleFamily = activeFontParams[0];
				titleSize = Integer.parseInt(activeFontParams[1]);
				boolean bold = "75".equals(activeFontParams[4]);
				boolean italic = "1".equals(activeFontParams[5]);
				if (bold && italic) {
					titleStyle = Font.BOLD + Font.ITALIC;
				} else if (italic) {
					titleStyle = Font.ITALIC;
				} else if (bold) {
					titleStyle = Font.BOLD;
				} else {
					titleStyle = Font.PLAIN;
				}

			} catch (Exception titleReadException) {
				titleFamily = SANS_SERIF;
				titleSize = 10;
				titleStyle = Font.BOLD;
			}

		} catch (Exception kdeglobalsReadException) {

			commonFamily = SANS_SERIF;
			commonSize = 10;
			commonStyle = Font.PLAIN;

			menuFamily = SANS_SERIF;
			menuSize = 10;
			menuStyle = Font.PLAIN;

			titleFamily = SANS_SERIF;
			titleSize = 10;
			titleStyle = Font.BOLD;

		}

		// </editor-fold>

		// <editor-fold defaultstate="collapsed" desc=" dpi settings ">

		double dcommonSize = commonSize;
		double dmenuSize = menuSize;
		double dtitleSize = titleSize;

		int dpi;
		try {
			String dpiParam = getIniParam(getFileContent("kcmfonts"),
					"[General]", "forceFontDPI");
			dpi = Integer.parseInt(dpiParam);
		} catch (Exception dpiReadException) {
			dpi = 96;
		}
		// kcmfonts common for both KDE3 and KDE4
		if (dpi <= 0) {
			dpi = 96;
		}
		if (dpi < 50) {
			dpi = 50;
		}
		dcommonSize = ((commonSize * dpi) / 72.0);
		dmenuSize = ((menuSize * dpi) / 72.0);
		dtitleSize = ((titleSize * dpi) / 72.0);

		commonSize = (int) (dcommonSize + 0.5);
		if (commonSize < 1) {
			commonSize = 1;
		}

		menuSize = (int) (dmenuSize + 0.5);
		if (menuSize < 1) {
			menuSize = 1;
		}

		titleSize = (int) (dtitleSize + 0.5);
		if (titleSize < 1) {
			titleSize = 1;
		}

		// </editor-fold>

		Font commonFont = new Font(commonFamily, commonStyle, commonSize);
		Font menuFont = new Font(menuFamily, menuStyle, menuSize);
		Font titleFont = new Font(titleFamily, titleStyle, titleSize);

		return FontSets.createDefaultFontSet(commonFont, menuFont, commonFont,
				commonFont, commonFont, titleFont);
	}

	private String getIniParam(String content, String category, String param)
			throws Exception {
		// checking if our param in our category - we don't need same params
		// from other categories
		int categoryIndex = content.indexOf(category);
		
		// fix for defect 483 - https://substance.dev.java.net/issues/show_bug.cgi?id=483
		// lineSeparator + 
		String lineSeparator = System.getProperty("line.separator");// JDK7: System.lineSeparator()
		int nextCategoryIndex = content.indexOf(lineSeparator + '[', categoryIndex + 1);
		
		if (nextCategoryIndex < 0) {
			nextCategoryIndex = content.length();
		}
		int paramIndex = content.indexOf(param, categoryIndex);
		if (paramIndex >= 0 && paramIndex < nextCategoryIndex) {

			// now paramString contains full string of our parameter
			int lineEnd = content.indexOf(lineSeparator,
					paramIndex);
			if (lineEnd <= 0) {
				lineEnd = content.length();
			}
			String paramString = content.substring(paramIndex, lineEnd);

			// getting just our value, we don't need other symbols
			int equalityIndex = paramString.indexOf('=');
			/*
			 * paramString.indexOf('#'); paramString.indexOf(';');
			 * 
			 * don't know do we need to remove trailing comments after this
			 * symbols? have nothing similar in my system...
			 */
			String result = paramString.substring(equalityIndex + 1).trim();
			if (result.length() > 0) {
				return result;
			}
		}
		throw new Exception("No such param in current category");
	}

	private String getFileContent(String fileName) throws IOException {

		/*
		 * preparing KDE home folder. KDE4 may be stored in .kde4 folder, and
		 * may be in .kde.
		 * 
		 * we check for .kde4 folder, if it exists - we will use it. Otherwise
		 * we will left kdeHome empty, and it will be set to .kde in both cases
		 * of KDE3 and KDE4 with .kde folder.
		 */
		String userHome = System.getProperty("user.home");
		String kdeHome = null;
		if (isKDE4Running()) {
			File kdeHomeFolder = new File(userHome, ".kde4");
			if (kdeHomeFolder.exists()) {
				kdeHome = ".kde4";
			}
		}
		if (kdeHome == null) {
			kdeHome = ".kde";
		}

		char fs = File.separatorChar;
		fileName = userHome + fs + kdeHome + "/share/config/" + fileName;
		if (fs != '/') {
			fileName = fileName.replace('/', fs);
		}

		// creating file from user home, using system's file separator:
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		StringBuilder sb = new StringBuilder();
		// size same as inside BufferedReader code
		char[] buffer = new char[8192];
		int read = 0;
		while ((read = in.read(buffer)) >= 0) {
			sb.append(buffer, 0, read);
		}
		in.close();

		return sb.toString();
	}

}
