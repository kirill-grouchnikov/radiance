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

/**
 * Provides convenience behavior used by the JGoodies Looks.
 * 
 * @author Karsten Lentzsch
 */
public final class LookUtils {

	// Basics System Properties **********************************************
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
	 * True if this is the Mac OS X.
	 */
	public static final boolean IS_OS_MAC = startsWith(OS_NAME, "Mac");

	/**
	 * True if this is Windows 98/ME/2000/XP/VISTA.
	 */
	public static final boolean IS_OS_WINDOWS_MODERN = startsWith(OS_NAME,
			"Windows")
			&& !startsWith(OS_VERSION, "4.0");

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

	private static boolean startsWith(String str, String prefix) {
		return str != null && str.startsWith(prefix);
	}
}
