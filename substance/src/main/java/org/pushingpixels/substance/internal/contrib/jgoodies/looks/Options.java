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

import org.pushingpixels.substance.internal.contrib.jgoodies.looks.common.ShadowPopup;

import javax.swing.*;

/**
 * Provides access to several optional properties for the JGoodies L&amp;Fs,
 * either by a key to the <code>UIDefaults</code> table or via a method or both.
 * 
 * @author Karsten Lentzsch
 */

public final class Options {
	public static final String POPUP_DROP_SHADOW_ENABLED_KEY = "jgoodies.popupDropShadowEnabled";

	// Optional Client Properties *******************************************

	// System Settings ********************************************************

	/**
	 * Holds the Boolean system property value for the popup drop shadow
	 * enablement, or null, if it has not been set. If this property has been
	 * set, we log a message about the choosen value.
	 * <p>
	 * 
	 * This property just set the feature's enablement, not its actual
	 * activation. For example, drop shadows are always inactive on the Mac OS
	 * X, because this platform already provides shadows. The activation is
	 * requested in <code>#isPopupDropShadowActive</code>.
	 * 
	 * @see #isPopupDropShadowEnabled()
	 * @see #isPopupDropShadowActive()
	 */
	private static final Boolean POPUP_DROP_SHADOW_ENABLED_SYSTEM_VALUE = LookUtils
			.getBooleanSystemProperty(POPUP_DROP_SHADOW_ENABLED_KEY,
					"Popup drop shadows");

	// Private ****************************************************************
	private Options() {
		// Override default constructor; prevents instantiation.
	}

	// Accessing Options ******************************************************


	/**
	 * Checks and answers whether popup drop shadows are active. This feature
	 * shall be inactive with toolkits that use native drop shadows, such as
	 * Aqua on the Mac OS X. It is also inactive if the ShadowPopup cannot
	 * snapshot the desktop background (due to security and AWT exceptions).
	 * Otherwise the feature's enablement state is returned.
	 * <p>
	 * 
	 * Currently only the Mac OS X is detected as platform where the toolkit
	 * uses native drop shadows.
	 * 
	 * @return true if drop shadows are active, false if inactive
	 * 
	 * @see #isPopupDropShadowEnabled()
	 */
	public static boolean isPopupDropShadowActive() {
		return !LookUtils.getToolkitUsesNativeDropShadows()
				&& ShadowPopup.canSnapshot() && isPopupDropShadowEnabled();
	}

	/**
	 * Checks and answers whether the optional drop shadows for PopupMenus are
	 * enabled or disabled.
	 * 
	 * @return true if drop shadows are enabled, false if disabled
	 * 
	 * @see #isPopupDropShadowActive()
	 */
	public static boolean isPopupDropShadowEnabled() {
		if (POPUP_DROP_SHADOW_ENABLED_SYSTEM_VALUE != null)
			return POPUP_DROP_SHADOW_ENABLED_SYSTEM_VALUE.booleanValue();

		Object value = UIManager.get(POPUP_DROP_SHADOW_ENABLED_KEY);
		return value == null ? isPopupDropShadowEnabledDefault() : Boolean.TRUE
				.equals(value);
	}

	/**
	 * Checks and answers whether popup drop shadows are enabled or disabled by
	 * default. True for modern Windows platforms: Windows 98/ME/2000/XP.
	 * <p>
	 * 
	 * TODO: Consider enabling popup drop shadows on Linux by default.
	 * <p>
	 * 
	 * TODO: Consider moving the default to the individual L&amp;F's component
	 * defaults initialization. For example Plastic and Plastic3D may disable
	 * this feature by default, while PlasticXP enables it by default.
	 * 
	 * @return false
	 */
	private static boolean isPopupDropShadowEnabledDefault() {
		return LookUtils.IS_OS_WINDOWS_MODERN;
	}
}