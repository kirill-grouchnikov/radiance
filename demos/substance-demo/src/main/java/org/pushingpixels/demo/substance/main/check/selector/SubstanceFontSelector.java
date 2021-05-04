/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.substance.main.check.selector;

import org.pushingpixels.demo.substance.main.check.FlexiComboBox;
import org.pushingpixels.neon.api.font.FontSet;
import org.pushingpixels.substance.api.SubstanceCortex;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.net.URL;

public class SubstanceFontSelector extends FlexiComboBox<SubstanceFontSelector.FontInfo> {
    public static class FontInfo {
        private FontSet fontSet;
        private String displayName;

        private FontInfo(String regularFontFileName, String boldFontFileName) throws Throwable {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            URL baseFontURL = classLoader.getResource(regularFontFileName);
            Font baseFont = Font.createFont(Font.TRUETYPE_FONT, baseFontURL.openStream());
            URL boldFontURL = classLoader.getResource(boldFontFileName);
            Font boldFont = Font.createFont(Font.TRUETYPE_FONT, boldFontURL.openStream());

            Font controlFont = baseFont.deriveFont(13.0f);
            Font menuFont = baseFont.deriveFont(14.0f);
            Font titleFont = menuFont;
            Font messageFont = controlFont;
            Font smallFont = baseFont.deriveFont(12.0f);
            Font windowTitleFont = boldFont.deriveFont(14.0f);
            this.fontSet = new FontSetWrapper(controlFont, menuFont, titleFont,
                    messageFont, smallFont, windowTitleFont);
            this.displayName = controlFont.getFontName();
        }

        private FontInfo(String displayName, FontSet fontSet) {
            this.fontSet = fontSet;
            this.displayName = displayName;
        }
    }

    private static class FontSetWrapper implements FontSet {
        private final FontUIResource controlFont;
        private final FontUIResource menuFont;
        private final FontUIResource titleFont;
        private final FontUIResource messageFont;
        private final FontUIResource smallFont;
        private final FontUIResource windowTitleFont;

        private FontSetWrapper(Font controlFont, Font menuFont, Font titleFont,
                Font messageFont, Font smallFont, Font windowTitleFont) {
            this.controlFont = new FontUIResource(controlFont);
            this.menuFont = new FontUIResource(menuFont);
            this.titleFont = new FontUIResource(titleFont);
            this.messageFont = new FontUIResource(messageFont);
            this.smallFont = new FontUIResource(smallFont);
            this.windowTitleFont = new FontUIResource(windowTitleFont);
        }

        @Override
        public FontUIResource getControlFont() {
            return controlFont;
        }

        @Override
        public FontUIResource getMenuFont() {
            return menuFont;
        }

        @Override
        public FontUIResource getTitleFont() {
            return titleFont;
        }

        @Override
        public FontUIResource getWindowTitleFont() {
            return windowTitleFont;
        }

        @Override
        public FontUIResource getSmallFont() {
            return smallFont;
        }

        @Override
        public FontUIResource getMessageFont() {
            return messageFont;
        }
    }

    public SubstanceFontSelector() throws Throwable {
        // populate the combobox
        super(new FontInfo("Platform", SubstanceCortex.GlobalScope.getFontPolicy()
                        .getFontSet()),
                new FontInfo("fonts/Inter-UI-Regular.ttf", "fonts/Inter-UI-Bold.ttf"),
                new FontInfo("fonts/SourceCodePro-Regular.ttf", "fonts/SourceCodePro-Bold.ttf"),
                new FontInfo("fonts/Roboto-Regular.ttf", "fonts/Roboto-Bold.ttf"),
                new FontInfo("fonts/RobotoCondensed-Regular.ttf",
                        "fonts/RobotoCondensed-Bold.ttf"));

        // add an action listener to change font based on user selection
        this.addActionListener(actionEvent -> SwingUtilities.invokeLater(() ->
                SubstanceCortex.GlobalScope.setFontPolicy(
                        () -> ((FontInfo) SubstanceFontSelector.this.getSelectedItem()).fontSet)));
    }

    @Override
    public String getCaption(FontInfo item) {
        return item.displayName;
    }
}
