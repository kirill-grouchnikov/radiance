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
package org.pushingpixels.demo.substance.main.samples.substance.api;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.event.ChangeEvent;
import javax.swing.plaf.FontUIResource;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.font.FontPolicy;
import org.pushingpixels.substance.api.font.FontSet;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

/**
 * Test application that shows the use of the
 * {@link SubstanceCortex.GlobalScope#setFontPolicy(FontPolicy)} API.
 * 
 * @author Kirill Grouchnikov
 * @see SubstanceCortex.GlobalScope#setFontPolicy(FontPolicy)
 */
public class SetFontPolicy extends JFrame {
    /**
     * Wrapper around the base Substance font set. Is used to create larger / smaller font sets.
     * 
     * @author Kirill Grouchnikov
     */
    private static class WrapperFontSet implements FontSet {
        /**
         * Extra size in pixels. Can be positive or negative.
         */
        private int extra;

        /**
         * The base Substance font set.
         */
        private FontSet delegate;

        /**
         * Creates a wrapper font set.
         * 
         * @param delegate
         *            The base Substance font set.
         * @param extra
         *            Extra size in pixels. Can be positive or negative.
         */
        public WrapperFontSet(FontSet delegate, int extra) {
            super();
            this.delegate = delegate;
            this.extra = extra;
        }

        /**
         * Returns the wrapped font.
         * 
         * @param systemFont
         *            Original font.
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
    public SetFontPolicy() {
        super("Set font policy");

        this.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new FlowLayout());

        // create a slider to control the font size.
        final JSlider fontSizeSlider = new JSlider(-3, 3, 0);
        fontSizeSlider.setPaintLabels(true);
        fontSizeSlider.setMajorTickSpacing(1);
        fontSizeSlider.setToolTipText("Controls the global font set size");
        fontSizeSlider.addChangeListener((ChangeEvent e) -> {
            // if the value is adjusting - ignore. This is done
            // to make CPU usage better.
            if (!fontSizeSlider.getModel().getValueIsAdjusting()) {
                final int newValue = fontSizeSlider.getValue();
                SwingUtilities.invokeLater(() -> {
                    // reset the base font policy to null - this
                    // restores the original font policy (default size).
                    SubstanceCortex.GlobalScope.setFontPolicy(null);
                    // Get the default font set
                    final FontSet substanceCoreFontSet = SubstanceCortex.GlobalScope.getFontPolicy()
                            .getFontSet("Substance", null);
                    // Create the wrapper font set
                    FontPolicy newFontPolicy = new FontPolicy() {
                        public FontSet getFontSet(String lafName, UIDefaults table) {
                            return new WrapperFontSet(substanceCoreFontSet, newValue);
                        }
                    };

                    try {
                        SetFontPolicy.this
                                .setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                        // set the new font policy
                        SubstanceCortex.GlobalScope.setFontPolicy(newFontPolicy);
                        SetFontPolicy.this.setCursor(Cursor.getDefaultCursor());
                    } catch (Exception exc) {
                        exc.printStackTrace();
                    }
                });
            }
        });
        panel.add(fontSizeSlider);

        panel.add(new JButton("button"));
        panel.add(new JComboBox(new Object[] { "item1", "item2" }));

        this.add(panel, BorderLayout.CENTER);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * The main method for <code>this</code> sample. The arguments are ignored.
     * 
     * @param args
     *            Ignored.
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new SetFontPolicy().setVisible(true);
        });
    }
}
