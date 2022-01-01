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
package org.pushingpixels.radiance.demo.theming.main.samples.theming.api;

import org.pushingpixels.radiance.common.api.font.FontPolicy;
import org.pushingpixels.radiance.common.api.font.FontSet;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

/**
 * Test application that shows the use of the {@link RadianceThemingCortex.GlobalScope#getFontPolicy()}
 * API.
 *
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex.GlobalScope#getFontPolicy()
 */
public class GetFontPolicy extends JFrame {
    /**
     * Wrapper around the base Radiance font set. Is used to create larger / smaller font sets.
     *
     * @author Kirill Grouchnikov
     */
    private static class WrapperFontSet implements FontSet {
        /**
         * Extra size in pixels. Can be positive or negative.
         */
        private int extra;

        /**
         * The base Radiance font set.
         */
        private FontSet delegate;

        /**
         * Creates a wrapper font set.
         *
         * @param delegate The base Radiance font set.
         * @param extra    Extra size in pixels. Can be positive or negative.
         */
        public WrapperFontSet(FontSet delegate, int extra) {
            super();
            this.delegate = delegate;
            this.extra = extra;
        }

        /**
         * Returns the wrapped font.
         *
         * @param systemFont Original font.
         * @return Wrapped font.
         */
        private FontUIResource getWrappedFont(FontUIResource systemFont) {
            return new FontUIResource(systemFont.getFontName(), systemFont.getStyle(),
                    systemFont.getSize() + this.extra);
        }

        public FontUIResource getControlFont() {
            return this.getWrappedFont(this.delegate.getControlFont());
        }

        public FontUIResource getMenuFont() {
            return this.getWrappedFont(this.delegate.getMenuFont());
        }

        public FontUIResource getMessageFont() {
            return this.getWrappedFont(this.delegate.getMessageFont());
        }

        public FontUIResource getSmallFont() {
            return this.getWrappedFont(this.delegate.getSmallFont());
        }

        public FontUIResource getTitleFont() {
            return this.getWrappedFont(this.delegate.getTitleFont());
        }

        public FontUIResource getWindowTitleFont() {
            return this.getWrappedFont(this.delegate.getWindowTitleFont());
        }
    }

    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public GetFontPolicy() {
        super("Get font policy");

        this.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new FlowLayout());

        // create a slider to control the font size.
        final JSlider fontSizeSlider = new JSlider(-3, 3, 0);
        fontSizeSlider.setPaintLabels(true);
        fontSizeSlider.setMajorTickSpacing(1);
        fontSizeSlider.setToolTipText("Controls the global font set size");
        fontSizeSlider.addChangeListener(changeEvent -> {
            // if the value is adjusting - ignore. This is done
            // to make CPU usage better.
            if (!fontSizeSlider.getModel().getValueIsAdjusting()) {
                final int newValue = fontSizeSlider.getValue();
                SwingUtilities.invokeLater(() -> {
                    // reset the base font policy to null - this
                    // restores the original font policy (default size).
                    RadianceThemingCortex.GlobalScope.setFontPolicy(null);
                    // Get the default font set
                    final FontSet radianceCoreFontSet = RadianceThemingCortex.GlobalScope
                            .getFontPolicy().getFontSet();
                    // Create the wrapper font set
                    FontPolicy newFontPolicy =
                            () -> new WrapperFontSet(radianceCoreFontSet, newValue);

                    try {
                        GetFontPolicy.this.setCursor(
                                Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                        // set the new font policy
                        RadianceThemingCortex.GlobalScope.setFontPolicy(newFontPolicy);
                        GetFontPolicy.this.setCursor(Cursor.getDefaultCursor());
                    } catch (Exception exc) {
                        exc.printStackTrace();
                    }
                });
            }
        });
        panel.add(fontSizeSlider);

        JButton jb = new JButton("Show font info");
        jb.addActionListener(actionEvent -> {
            FontPolicy fontPolicy = RadianceThemingCortex.GlobalScope.getFontPolicy();
            FontSet fontSet = fontPolicy.getFontSet();
            String[] infoArray = new String[] { "Control: " + fontSet.getControlFont(),
                    "Menu: " + fontSet.getMenuFont(),
                    "Message: " + fontSet.getMessageFont(),
                    "Small: " + fontSet.getSmallFont(), "Title: " + fontSet.getTitleFont(),
                    "Window title: " + fontSet.getWindowTitleFont() };
            JList<String> infoList = new JList<>(infoArray);
            JDialog infoDialog = new JDialog(GetFontPolicy.this, "Font set info", true);
            infoDialog.setLayout(new BorderLayout());
            infoDialog.add(infoList, BorderLayout.CENTER);
            infoDialog.pack();
            infoDialog.setLocationRelativeTo(GetFontPolicy.this);
            infoDialog.setVisible(true);
        });
        panel.add(jb);

        this.add(panel, BorderLayout.CENTER);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * The main method for <code>this</code> sample. The arguments are ignored.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new GetFontPolicy().setVisible(true);
        });
    }
}
