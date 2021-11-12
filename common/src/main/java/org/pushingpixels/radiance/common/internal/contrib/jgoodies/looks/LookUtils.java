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

package org.pushingpixels.radiance.common.internal.contrib.jgoodies.looks;

import java.awt.*;

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
     * <p>
     * Defaults to <code>null</code> if the runtime does not have security
     * access to read this property or the property does not exist.
     */
    private static final String OS_NAME = getSystemProperty("os.name");

    /**
     * The <code>os.version</code> System Property. Operating system version.
     * <p>
     * <p>
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
     * True if this is Windows.
     */
    public static final boolean IS_OS_WINDOWS = startsWith(OS_NAME, "Windows");

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
     * True if this is Mac Yosemite.
     */
    public static final boolean IS_OS_MAC_YOSEMITE = IS_OS_MAC
            && startsWith(OS_VERSION, "10.10");

	/**
	 * True if this is Mac El Capitan or later
	 */
	public static final boolean IS_OS_MAC_EL_CAPITAN_OR_LATER = IS_OS_MAC
			&& (startsWith(OS_VERSION, "10.11") || startsWith(OS_VERSION, "10.12")
			|| startsWith(OS_VERSION, "10.13") || startsWith(OS_VERSION, "10.14"))
			|| startsWith(OS_VERSION, "10.15") || startsWith(OS_VERSION, "10.16");

	/**
	 * True if this is Mac Mojave or later
	 */
	public static final boolean IS_OS_MAC_MOJAVE_OR_LATER = IS_OS_MAC
			&& (startsWith(OS_VERSION, "10.14") || startsWith(OS_VERSION, "10.15")
            || startsWith(OS_VERSION, "10.16"));

	/**
	 * True if this is Mac Catalina or later
	 */
	public static final boolean IS_OS_MAC_CATALINA_OR_LATER = IS_OS_MAC
			&& (startsWith(OS_VERSION, "10.15") || startsWith(OS_VERSION, "10.16")
            || startsWith(OS_VERSION, "11.") || startsWith(OS_VERSION, "12."));

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
     * @param key the name of the system property
     * @return the system property's String value, or <code>null</code> if
     * there's no such value, or a SecurityException has been caught
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
     * @param key          the name of the system property
     * @param defaultValue the default value if no property exists.
     * @return the system property's String value, or the defaultValue if
     * there's no such value, or a SecurityException has been caught
     */
    public static String getSystemProperty(String key, String defaultValue) {
        try {
            return System.getProperty(key, defaultValue);
        } catch (SecurityException e) {
            // log("Can't read the System property " + key + ".");
            return defaultValue;
        }
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
}
