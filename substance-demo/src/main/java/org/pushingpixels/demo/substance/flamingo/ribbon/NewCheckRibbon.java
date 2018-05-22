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
package org.pushingpixels.demo.substance.flamingo.ribbon;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.pushingpixels.demo.flamingo.ribbon.BasicCheckRibbon;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.SubstanceSlices.SubstanceWidgetType;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;
import org.pushingpixels.substance.flamingo.SubstanceFlamingoPlugin;
import org.pushingpixels.substance.flamingo.ribbon.gallery.oob.SubstanceRibbonTask;

import com.jgoodies.forms.builder.DefaultFormBuilder;

public class NewCheckRibbon extends BasicCheckRibbon {
    @Override
    public void configureRibbon() {
        super.configureRibbon();
        this.getRibbon().addTask(SubstanceRibbonTask.getSubstanceRibbonTask());
    }

    @Override
    protected void configureStatusBar() {
        super.configureStatusBar();
        ComponentOrParentChainScope.setDecorationType(this.statusBar, DecorationAreaType.FOOTER);
    }

    @Override
    protected void configureControlPanel(DefaultFormBuilder formBuilder) {
        super.configureControlPanel(formBuilder);

        final JCheckBox useThemedDefaultIconsCheckBox = new JCheckBox("use");
        useThemedDefaultIconsCheckBox
                .addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
                    SubstanceCortex.GlobalScope.setUseThemedDefaultIcons(
                            useThemedDefaultIconsCheckBox.isSelected() ? Boolean.TRUE : null);
                    SwingUtilities.updateComponentTreeUI(NewCheckRibbon.this);
                    repaint();
                }));
        formBuilder.append("Themed icons", useThemedDefaultIconsCheckBox);

        final JCheckBox useGlowingIconsCheckBox = new JCheckBox("use");
        useGlowingIconsCheckBox
                .addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
                    if (useGlowingIconsCheckBox.isSelected()) {
                        SubstanceCortex.GlobalScope.allowAnimations(AnimationFacet.ICON_GLOW);
                    } else {
                        SubstanceCortex.GlobalScope.disallowAnimations(AnimationFacet.ICON_GLOW);
                    }
                    SwingUtilities.updateComponentTreeUI(NewCheckRibbon.this);
                    repaint();
                }));
        formBuilder.append("Glowing icons", useGlowingIconsCheckBox);

        final JCheckBox heapPanel = new JCheckBox("show");
        heapPanel.setSelected(false);
        heapPanel.addActionListener((ActionEvent e) -> {
            SubstanceCortex.WindowScope.setWidgetVisible(this, heapPanel.isSelected(),
                    SubstanceWidgetType.TITLE_PANE_HEAP_STATUS);
        });
        formBuilder.append("Heap panel", heapPanel);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceFlamingoPlugin());

        UIManager.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if ("lookAndFeel".equals(evt.getPropertyName())) {
                LookAndFeel oldLaf = (LookAndFeel) evt.getOldValue();
                LookAndFeel newLaf = (LookAndFeel) evt.getNewValue();
                System.out.println("Look-and-feel change from "
                        + ((oldLaf == null) ? "null" : oldLaf.getName()) + " to "
                        + ((newLaf == null) ? "null" : newLaf.getName()));
            }
        });

        try {
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            Enumeration<URL> urls = cl.getResources("META-INF/MANIFEST.MF");
            Set<String> timestampStrings = new HashSet<String>();
            while (urls.hasMoreElements()) {
                try (InputStream is = urls.nextElement().openStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                    while (true) {
                        String line = br.readLine();
                        if (line == null)
                            break;
                        int firstColonIndex = line.indexOf(":");
                        if (firstColonIndex < 0)
                            continue;
                        String name = line.substring(0, firstColonIndex).trim();
                        if (timestampStrings.contains(name)) {
                            continue;
                        }
                        if (name.endsWith("-BuildStamp")) {
                            System.out.println(line);
                            timestampStrings.add(name);
                        }
                    }
                }
            }
            System.out.println();
        } catch (IOException ioe) {
        }

        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new OfficeBlue2007Skin());
            NewCheckRibbon c = new NewCheckRibbon();
            c.configureRibbon();
            c.applyComponentOrientation(ComponentOrientation.getOrientation(Locale.getDefault()));
            Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment()
                    .getMaximumWindowBounds();
            c.setPreferredSize(new Dimension(r.width, r.height / 2));
            c.setMinimumSize(new Dimension(100, r.height / 3));
            c.pack();
            c.setLocation(r.x, r.y);
            c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            c.setVisible(true);
        });
    }
}
