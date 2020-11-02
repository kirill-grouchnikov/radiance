/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.substance.main;

import org.pushingpixels.demo.substance.main.check.selector.SubstanceSkinSelector;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.skin.MagellanSkin;
import org.pushingpixels.substance.api.text.SubstanceTextField;

import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;

public class TextHighlightsInDecorationAreas {
    private static JTextField makeTextField(String text) {
        JTextField result = new SubstanceTextField(text, 20);
        // force the display of text selection even when the focus has been lost
        result.setCaret(new DefaultCaret() {
            @Override
            public void setSelectionVisible(boolean vis) {
                super.setSelectionVisible(true);
            }
        });
        result.selectAll();
        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);

            SubstanceCortex.GlobalScope.setSkin(new MagellanSkin());

            JFrame frame = new JFrame("Text highlights");
            RadianceLogo.configureOn(frame);

            frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

            JPanel panelTitlePane = new JPanel(new FlowLayout());
            SubstanceCortex.ComponentOrParentChainScope.setDecorationType(
                    panelTitlePane, SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE);
            JPanel panelToolbar = new JPanel(new FlowLayout());
            SubstanceCortex.ComponentOrParentChainScope.setDecorationType(
                    panelToolbar, SubstanceSlices.DecorationAreaType.TOOLBAR);
            JPanel panelGeneral = new JPanel(new FlowLayout());
            SubstanceCortex.ComponentOrParentChainScope.setDecorationType(
                    panelGeneral, SubstanceSlices.DecorationAreaType.CONTROL_PANE);
            JPanel panelNone = new JPanel(new FlowLayout());
            SubstanceCortex.ComponentOrParentChainScope.setDecorationType(
                    panelNone, SubstanceSlices.DecorationAreaType.NONE);
            JPanel panelFooter = new JPanel(new FlowLayout());
            SubstanceCortex.ComponentOrParentChainScope.setDecorationType(
                    panelFooter, SubstanceSlices.DecorationAreaType.FOOTER);

            panelTitlePane.add(makeTextField("sample title pane"));
            panelToolbar.add(makeTextField("sample toolbar"));
            panelGeneral.add(makeTextField("sample general"));
            panelNone.add(makeTextField("sample none"));
            panelFooter.add(makeTextField("sample footer"));

            frame.getContentPane().add(panelTitlePane);
            frame.getContentPane().add(panelToolbar);
            frame.getContentPane().add(panelGeneral);
            frame.getContentPane().add(panelNone);
            frame.getContentPane().add(panelFooter);

            JPanel selector = new JPanel(new FlowLayout(FlowLayout.TRAILING));
            selector.add(new SubstanceSkinSelector());
            frame.getContentPane().add(selector);

            frame.setSize(300, 300);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
