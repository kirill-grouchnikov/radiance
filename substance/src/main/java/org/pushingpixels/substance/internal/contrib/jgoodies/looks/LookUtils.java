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

package org.pushingpixels.substance.internal.contrib.jgoodies.looks;

import java.awt.Component;
import java.awt.Toolkit;
import java.util.Locale;

/**
 * Provides convenience behavior used by the JGoodies Looks.
 * 
 * @author Karsten Lentzsch
 */
public final class LookUtils {

	// Basics System Properties **********************************************

	/**
	 * The <code>java.vendor</code> System Property.
	 * <p>
	 * 
	 * Defaults to <code>null</code> if the runtime does not have security
	 * access to read this property or the property does not exist.
	 */
	private static final String JAVA_VENDOR = getSystemProperty("java.vendor");
	
	private static final String JAVA_SPEC_VERSION = getSystemProperty("java.specification.version");

	/**
	 * The <code>os.name</code> System Property. Operating system name.
	 * <p>
	 * 
	 * Defaults to <code>null</code> if the runtime does not have security
	 * access to read this property or the property does not exist.
	 */
	private static final String OS_NAME = getSystemProperty("os.name");

	/**
	 * The <code>os.version</code> System Property. Operating system version.
	 * <p>
	 * 
	 * Defaults to <code>null</code> if the runtime does not have security
	 * access to read this property or the property does not exist.
	 */
	private static final String OS_VERSION = getSystemProperty("os.version");

	// Requesting the Operating System Name ***********************************

	/**
	 * True if this is FreeBSD.
	 */
	public static final boolean IS_OS_FREEBSD = startsWithIgnoreCase(OS_NAME,
			"FreeBSD");

	/**
	 * True if this is Linux.
	 */
	public static final boolean IS_OS_LINUX = startsWithIgnoreCase(OS_NAME,
			"Linux");

	/**
	 * True if this is OS/2.
	 */
	public static final boolean IS_OS_OS2 = startsWith(OS_NAME, "OS/2");

	/**
	 * True if this is the Mac OS X.
	 */
	public static final boolean IS_OS_MAC = startsWith(OS_NAME, "Mac");

	/**
	 * True if this is Windows.
	 */
	public static final boolean IS_OS_WINDOWS = startsWith(OS_NAME, "Windows");

	/**
	 * True if this is Windows 98/ME/2000/XP/VISTA.
	 */
	public static final boolean IS_OS_WINDOWS_MODERN = startsWith(OS_NAME,
			"Windows")
			&& !startsWith(OS_VERSION, "4.0");

	/**
	 * True if this is Windows 95.
	 * 
	 * @since 2.0
	 */
	public static final boolean IS_OS_WINDOWS_95 = startsWith(OS_NAME,
			"Windows 9")
			&& startsWith(OS_VERSION, "4.0");

	/**
	 * True if this is Windows 98.
	 * 
	 * @since 2.0
	 */
	public static final boolean IS_OS_WINDOWS_98 = startsWith(OS_NAME,
			"Windows 9")
			&& startsWith(OS_VERSION, "4.1");

	/**
	 * True if this is Windows NT.
	 * 
	 * @since 2.0
	 */
	public static final boolean IS_OS_WINDOWS_NT = startsWith(OS_NAME,
			"Windows NT");

	/**
	 * True if this is Windows ME.
	 * 
	 * @since 2.0
	 */
	public static final boolean IS_OS_WINDOWS_ME = startsWith(OS_NAME,
			"Windows")
			&& startsWith(OS_VERSION, "4.9");

	/**
	 * True if this is Windows 2000.
	 * 
	 * @since 2.0
	 */
	public static final boolean IS_OS_WINDOWS_2000 = startsWith(OS_NAME,
			"Windows")
			&& startsWith(OS_VERSION, "5.0");

	/**
	 * True if this is Windows XP.
	 */
	public static final boolean IS_OS_WINDOWS_XP = startsWith(OS_NAME,
			"Windows")
			&& startsWith(OS_VERSION, "5.1");

	/**
	 * True if this is Windows Vista.
	 * 
	 * @since 2.0
	 */
	public static final boolean IS_OS_WINDOWS_VISTA = startsWith(OS_NAME,
			"Windows")
			&& startsWith(OS_VERSION, "6.0");

	/**
	 * True if this is Mac Yosemite.
	 */
	public static final boolean IS_OS_MAC_YOSEMITE = IS_OS_MAC 
			&& startsWith(OS_VERSION, "10.10");

	/**
	 * True if this is Mac El Capitan or later (Sierra + High Sierra for now)
	 */
	public static final boolean IS_OS_MAC_EL_CAPITAN_OR_LATER = IS_OS_MAC 
			&& (startsWith(OS_VERSION, "10.11") || startsWith(OS_VERSION, "10.12")
			 || startsWith(OS_VERSION, "10.13"));

	/**
	 * True if this is Solaris.
	 */
	public static final boolean IS_OS_SOLARIS = startsWith(OS_NAME, "Solaris");
	
	public static final boolean IS_VENDOR_APPLE = containsIgnoreCase(JAVA_VENDOR, "Apple");
	
    public static final boolean IS_JAVA_8 = startsWith(JAVA_SPEC_VERSION, "8");
    public static final boolean IS_JAVA_9 = startsWith(JAVA_SPEC_VERSION, "9");
    public static final boolean IS_JAVA_10 = startsWith(JAVA_SPEC_VERSION, "10");

	// Other Properties *******************************************************

	/**
	 * True if if the screen resolution is smaller than 120 dpi.
	 * 
	 * @see Toolkit#getScreenResolution()
	 */
	public static final boolean IS_LOW_RESOLUTION = isLowResolution();

	private LookUtils() {
		// Override default constructor; prevents instantiation.
	}

	// Accessing System Configuration *****************************************

	/**
	 * Tries to look up the System property for the given key. In untrusted
	 * environments this may throw a SecurityException. In this case we catch
	 * the exception and answer <code>null</code>.
	 * 
	 * @param key
	 *            the name of the system property
	 * @return the system property's String value, or <code>null</code> if
	 *         there's no such value, or a SecurityException has been caught
	 */
	public static String getSystemProperty(String key) {
		try {
			return System.getProperty(key);
		} catch (SecurityException e) {
			// log("Can't read the System property " + key + ".");
			return null;
		}
	}

	/**
	 * Tries to look up the System property for the given key. In untrusted
	 * environments this may throw a SecurityException. In this case, we catch
	 * the exception and answer the default value.
	 * 
	 * @param key
	 *            the name of the system property
	 * @param defaultValue
	 *            the default value if no property exists.
	 * @return the system property's String value, or the defaultValue if
	 *         there's no such value, or a SecurityException has been caught
	 */
	public static String getSystemProperty(String key, String defaultValue) {
		try {
			return System.getProperty(key, defaultValue);
		} catch (SecurityException e) {
			// log("Can't read the System property " + key + ".");
			return defaultValue;
		}
	}

	/**
	 * Checks if a boolean system property has been set for the given key, and
	 * returns the associated Boolean, or <code>null</code> if no value has been
	 * set. The test for the property ignores case. If a Boolean value has been
	 * set, a message is logged with the given prefix.
	 * 
	 * @param key
	 *            the key used to lookup the system property value
	 * @param logMessage
	 *            a prefix used when a message is logged
	 * @return <code>Boolean.TRUE</code> if the system property has been set to
	 *         "true" (case ignored), <code>Boolean.FALSE</code> if it has been
	 *         set to "false", <code>null</code> otherwise
	 */
	public static Boolean getBooleanSystemProperty(String key, String logMessage) {
		String value = getSystemProperty(key, "");
		Boolean result;
		if (value.equalsIgnoreCase("false"))
			result = Boolean.FALSE;
		else if (value.equalsIgnoreCase("true"))
			result = Boolean.TRUE;
		else
			result = null;
		return result;
	}

	/**
	 * Checks and answers whether we have a true color system.
	 * 
	 * @param c
	 *            the component used to determine the toolkit
	 * @return true if the component's toolkit has a pixel size >= 24
	 */
	public static boolean isTrueColor(Component c) {
		return c.getToolkit().getColorModel().getPixelSize() >= 24;
	}

	/**
	 * Checks and answers whether this toolkit provides native drop shadows for
	 * popups such as the Mac OS X. Currently this is used to determine if the
	 * Looks' popup drop shadow feature is active or not - even if it's enabled.
	 * 
	 * @return true if the toolkit provides native drop shadows
	 * 
	 * @see Options#isPopupDropShadowActive()
	 */
	public static boolean getToolkitUsesNativeDropShadows() {
		return IS_OS_MAC;
	}

	// Private Helper Methods ***********************************************

	/**
	 * Checks and answers whether the screen resolution is low or high.
	 * Resolutions below 120 dpi are considere low, all others are high.
	 * 
	 * @return true if the screen resolution is smaller than 120 dpi
	 */
	private static boolean isLowResolution() {
		return Toolkit.getDefaultToolkit().getScreenResolution() < 120;
	}

	private static boolean startsWith(String str, String prefix) {
		return str != null && str.startsWith(prefix);
	}

	private static boolean startsWithIgnoreCase(String str, String prefix) {
		return str != null
				&& str.toUpperCase(Locale.ENGLISH).startsWith(
						prefix.toUpperCase(Locale.ENGLISH));
	}
	
	private static boolean containsIgnoreCase(String str, String searchFor) {
		return str != null
				&& str.toUpperCase(Locale.ENGLISH).contains(
						searchFor.toUpperCase(Locale.ENGLISH));
	}

}
