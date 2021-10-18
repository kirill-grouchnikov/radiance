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
package org.pushingpixels.radiance.demo.laf.main.check;

import org.pushingpixels.radiance.laf.api.RadianceLafCortex;
import org.pushingpixels.radiance.laf.api.painter.preview.DefaultPreviewPainter;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Test application panel for testing {@link JScrollPane} component.
 * 
 * @author Kirill Grouchnikov
 */
public class ScrollPanel extends ControllablePanel {
    /**
     * Scroll panel.
     */
    private JScrollPane sp;

    /**
     * The inner panel.
     */
    private JPanel panel;

    /**
     * Creates the scroll panel for the test application.
     */
    public ScrollPanel() {
        this.panel = new CheckeredPanel();
        this.sp = new JScrollPane(this.panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.setLayout(new BorderLayout());
        this.add(this.sp, BorderLayout.CENTER);

        TestFormLayoutBuilder builder = new TestFormLayoutBuilder("right:pref, 4dlu, fill:pref:grow",
                2, 5);

        builder.appendSeparator("General settings");
        final JCheckBox isEnabled = new JCheckBox("is enabled");
        isEnabled.setSelected(true);
        isEnabled.addActionListener(actionEvent -> {
            boolean toEnable = isEnabled.isSelected();
            sp.setEnabled(toEnable);
            updateEnabledState(sp, toEnable);
            System.out.println("Scroll pane is " + toEnable);
        });
        builder.append("Enabled", isEnabled);

        final JCheckBox hasNullBorder = new JCheckBox("Has null border");
        hasNullBorder.setSelected(false);
        hasNullBorder.addActionListener(actionEvent -> {
            if (hasNullBorder.isSelected())
                sp.setBorder(null);
            else
                sp.setBorder(new LineBorder(Color.red));
            sp.repaint();
        });
        builder.append("Border", hasNullBorder);

        final JCheckBox hasPreview = new JCheckBox("Has preview");
        hasPreview.addActionListener(actionEvent -> RadianceLafCortex.ComponentOrParentScope
                .setComponentPreviewPainter(sp,
                        hasPreview.isSelected() ? new DefaultPreviewPainter() : null));
        builder.append("Preview", hasPreview);

        final JCheckBox hasAutoScroll = new JCheckBox("Has auto scroll");
        hasAutoScroll.addActionListener(actionEvent -> RadianceLafCortex.ComponentScope
                .setAutomaticScrollPresence(sp, hasAutoScroll.isSelected()));
        builder.append("Auto scroll", hasAutoScroll);

        this.controlPanel = builder.build();
    }

    /**
     * Recursively updates the enabled state of the specified container and its children.
     * 
     * @param c
     *            Container.
     * @param enabled
     *            New value for the enabled status.
     */
    void updateEnabledState(Container c, boolean enabled) {
        for (int counter = c.getComponentCount() - 1; counter >= 0; counter--) {
            Component child = c.getComponent(counter);

            child.setEnabled(enabled);
            if (child instanceof Container) {
                updateEnabledState((Container) child, enabled);
            }
        }
    }
}
