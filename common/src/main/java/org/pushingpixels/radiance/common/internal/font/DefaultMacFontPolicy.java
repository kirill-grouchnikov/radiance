/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of the copyright holder nor the names of
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
 * The default font policy for Mac OS.
 *
 * @author Kirill Grouchnikov
 */
public class DefaultMacFontPolicy implements FontPolicy {
    @Override
    public FontSet getFontSet() {
        String fontFamily = "Lucida Grande";
        if (LookUtils.IS_OS_MAC_CATALINA_OR_LATER) {
            // fontFamily = ".AppleSystemUIFont";
            // Use Helvetica Neue instead of .AppleSystemUIFont until kerning fixes
            // have been submitted to OpenJDK
            fontFamily = "Helvetica Neue";
        } else if (LookUtils.IS_OS_MAC_EL_CAPITAN_OR_LATER) {
            fontFamily = ".SF NS Text";
        } else if (LookUtils.IS_OS_MAC_YOSEMITE) {
            fontFamily = ".Helvetica Neue DeskInterface";
        }

        Font controlFont = new FontSets.DefaultUIResourceFont(fontFamily, Font.PLAIN, 13);
        Font menuFont = new FontSets.DefaultUIResourceFont(fontFamily, Font.PLAIN, 14);
        Font smallFont = controlFont.deriveFont(controlFont.getSize2D() - 2f);

        if (LookUtils.IS_OS_MAC_CATALINA_OR_LATER) {
            // Enable the following block when the code is switched back to .AppleSystemUIFont
            // on Catalina
//            HashMap<AttributedCharacterIterator.Attribute, Object> attributes = new HashMap<>();
//            attributes.put(TextAttribute.KERNING, TextAttribute.KERNING_ON);
//            controlFont = controlFont.deriveFont(attributes);
//            menuFont = menuFont.deriveFont(attributes);
//            smallFont = smallFont.deriveFont(attributes);
        }

        Font titleFont = menuFont;
        Font messageFont = controlFont;
        Font windowTitleFont = titleFont;
        return FontSets.createDefaultFontSet(controlFont, menuFont, titleFont,
                messageFont, smallFont, windowTitleFont);
    }
}
