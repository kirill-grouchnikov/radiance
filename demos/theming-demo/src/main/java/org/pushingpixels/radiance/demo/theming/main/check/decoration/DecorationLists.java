/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.check.decoration;

import org.pushingpixels.radiance.demo.theming.main.check.selector.RadianceSkinSelector;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;

import javax.swing.*;
import java.awt.*;

public class DecorationLists extends JFrame {
    private static class ListPanel extends JPanel {
        public ListPanel(String caption, DecorationAreaType decorationAreaType, boolean isEnabled) {
            super(new BorderLayout());
            ComponentOrParentChainScope.setDecorationType(this, decorationAreaType);

            JLabel captionLabel = new JLabel(" " + caption);
            Font font = captionLabel.getFont();
            captionLabel.setFont(font.deriveFont(Font.BOLD));
            this.add(captionLabel, BorderLayout.NORTH);
            JList<String> list = new JList<>(new String[] { "entry1", "entry2", "entry3", "entry4" });
            list.setEnabled(isEnabled);
            this.add(list, BorderLayout.CENTER);
        }
    }

    public DecorationLists() {
        super("Lists in decoration areas");

        JPanel listsPanel = new JPanel(new GridLayout(2, 4));

        listsPanel.add(new ListPanel("Enabled in HEADER", DecorationAreaType.HEADER, true));
        listsPanel.add(new ListPanel("Disabled in HEADER", DecorationAreaType.HEADER, false));
        listsPanel.add(new ListPanel("Enabled in NONE", DecorationAreaType.NONE, true));
        listsPanel.add(new ListPanel("Disabled in NONE", DecorationAreaType.NONE, false));
        listsPanel.add(new ListPanel("Enabled in CONTROL_PANE", DecorationAreaType.CONTROL_PANE, true));
        listsPanel.add(new ListPanel("Disabled in CONTROL_PANE", DecorationAreaType.CONTROL_PANE, false));
        listsPanel.add(new ListPanel("Enabled in FOOTER", DecorationAreaType.FOOTER, true));
        listsPanel.add(new ListPanel("Disabled in FOOTER", DecorationAreaType.FOOTER, false));

        this.setLayout(new BorderLayout());
        this.add(listsPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        controlPanel.add(new RadianceSkinSelector());

        this.add(controlPanel, BorderLayout.SOUTH);

        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new DecorationLists().setVisible(true);
        });
    }
}
