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

	// Private Helper Methods ***********************************************

	private static boolean startsWith(String str, String prefix) {
		return str != null && str.startsWith(prefix);
	}
}
