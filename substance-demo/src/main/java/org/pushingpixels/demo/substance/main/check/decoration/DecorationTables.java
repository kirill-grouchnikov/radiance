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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.demo.substance.main.check.decoration;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import org.pushingpixels.demo.substance.main.check.SubstanceSkinComboSelector;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.skin.MistSilverSkin;

public class DecorationTables extends JFrame {
    private static class TablePanel extends JPanel {
        public TablePanel(String caption, DecorationAreaType decorationAreaType,
                boolean isEnabled) {
            super(new BorderLayout());
            ComponentOrParentChainScope.setDecorationType(this, decorationAreaType);

            JLabel captionLabel = new JLabel(" " + caption);
            Font font = captionLabel.getFont();
            captionLabel.setFont(font.deriveFont(Font.BOLD));
            this.add(captionLabel, BorderLayout.NORTH);
            JTable table = new JTable(
                    new Object[][] { { "cell00", "cell01" }, { "cell10", "cell11" },
                                    { "cell20", "cell21" }, { "cell30", "cell31" } },
                    new Object[] { "col1", "col2" });
            table.setEnabled(isEnabled);
            JScrollPane scroll = new JScrollPane(table);
            this.add(scroll, BorderLayout.CENTER);
            this.setBorder(new EmptyBorder(0, 1, 0, 1));
        }
    }

    public DecorationTables() {
        super("Tables in decoration areas");

        JPanel tablePanel = new JPanel(new GridLayout(2, 4));

        tablePanel.add(new TablePanel("Enabled in HEADER", DecorationAreaType.HEADER, true));
        tablePanel.add(new TablePanel("Disabled in HEADER", DecorationAreaType.HEADER, false));
        tablePanel.add(new TablePanel("Enabled in NONE", DecorationAreaType.NONE, true));
        tablePanel.add(new TablePanel("Disabled in NONE", DecorationAreaType.NONE, false));
        tablePanel.add(new TablePanel("Enabled in GENERAL", DecorationAreaType.GENERAL, true));
        tablePanel.add(new TablePanel("Disabled in GENERAL", DecorationAreaType.GENERAL, false));
        tablePanel.add(new TablePanel("Enabled in FOOTER", DecorationAreaType.FOOTER, true));
        tablePanel.add(new TablePanel("Disabled in FOOTER", DecorationAreaType.FOOTER, false));

        this.setLayout(new BorderLayout());
        this.add(tablePanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        controlPanel.add(new SubstanceSkinComboSelector());

        this.add(controlPanel, BorderLayout.SOUTH);

        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new MistSilverSkin());
            new DecorationTables().setVisible(true);
        });
    }
}
