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
package org.pushingpixels.demo.substance.swingx;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Date;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXStatusBar;
import org.jdesktop.swingx.plaf.basic.BasicStatusBarUI;
import org.pushingpixels.demo.substance.main.RadianceLogo;
import org.pushingpixels.demo.substance.main.check.SampleMenuFactory;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.skin.GeminiSkin;
import org.pushingpixels.substance.swingx.SubstanceSwingxPlugin;

public class TestDatePicker extends JFrame {
    public TestDatePicker() {
        super("Date pickers galore");

        this.setLayout(new BorderLayout());

        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(true);
        toolbar.add(new JLabel("In a toolbar"));
        toolbar.add(Box.createHorizontalStrut(8));
        toolbar.add(new JXDatePicker(new Date()));
        this.add(toolbar, BorderLayout.NORTH);

        JPanel left = new JPanel();
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        left.setBorder(new EmptyBorder(0, 4, 0, 4));
        left.add(Box.createVerticalStrut(30));
        left.add(new JLabel("In a sidebar"));
        left.add(new JXDatePicker(new Date()));
        ComponentOrParentChainScope.setDecorationType(left, DecorationAreaType.GENERAL);
        this.add(left, BorderLayout.WEST);

        JPanel center = new JPanel(new FlowLayout(FlowLayout.CENTER));
        center.setBorder(new EmptyBorder(40, 0, 0, 0));
        center.add(new JLabel("General"));
        center.add(new JXDatePicker(new Date()));
        this.add(center, BorderLayout.CENTER);

        JXStatusBar statusBar = new JXStatusBar();
        statusBar.putClientProperty(BasicStatusBarUI.AUTO_ADD_SEPARATOR, false);
        statusBar.add(new JLabel("In a status bar"));
        statusBar.add(Box.createHorizontalStrut(8));
        statusBar.add(new JXDatePicker(new Date()));
        this.add(statusBar, BorderLayout.SOUTH);

        this.setIconImage(RadianceLogo
                .getLogoImage(SubstanceCortex.ComponentScope.getCurrentSkin(this.getRootPane())
                        .getColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE,
                                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)));
        SubstanceCortex.GlobalScope.registerSkinChangeListener(
                () -> SwingUtilities.invokeLater(() -> setIconImage(RadianceLogo.getLogoImage(
                        SubstanceCortex.ComponentScope.getCurrentSkin(getRootPane()).getColorScheme(
                                DecorationAreaType.PRIMARY_TITLE_PANE,
                                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)))));

        JMenuBar jmb = new JMenuBar();
        jmb.add(SampleMenuFactory.getSkinMenu());
        jmb.add(SampleMenuFactory.getTransformMenu());
        this.setJMenuBar(jmb);

        this.setSize(450, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceSwingxPlugin());

        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new GeminiSkin());
            new TestDatePicker().setVisible(true);
        });
    }
}
