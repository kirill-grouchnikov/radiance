/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.palette;

import org.pushingpixels.radiance.demo.theming.main.Check;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class TonalCheck {
    public static void main(String[] args) {
        RadianceSkin tonalSkin = new BusinessBlackSteelSkin.BusinessBlackSteelTonalSkin();
        //new ControlStates.SampleSkin(new AquaColorScheme());

        RadianceThemingCortex.GlobalScope.registerWidget("org.pushingpixels.radiance.theming" +
            ".extras.api.tabbed.TabHoverPreviewWidget", JTabbedPane.class, false);
        RadianceThemingCortex.GlobalScope.registerWidget("org.pushingpixels.radiance.theming" +
            ".extras.api.tabbed.TabOverviewDialogWidget", JTabbedPane.class, false);
        RadianceThemingCortex.GlobalScope.registerWidget("org.pushingpixels.radiance.theming" +
            ".extras.api.tabbed.TabPagerWidget", JTabbedPane.class, false);
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(tonalSkin);
            RadianceThemingCortex.GlobalScope.setUseConstantThemesOnOptionPanes(true);
            RadianceThemingCortex.GlobalScope.setTabCloseButtonsVisible(true);
            RadianceThemingCortex.GlobalScope.setExtraWidgetsPresence(true);
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);

            Check c = new Check();
            c.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    super.componentResized(e);
                    ((JFrame) e.getComponent()).getRootPane().repaint();
                }
            });
            c.setPreferredSize(new Dimension(1080, 800));
            c.setMinimumSize(new Dimension(150, 100));
            c.pack();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            // center the frame in the physical screen
            c.setLocation((d.width - c.getWidth()) / 2, (d.height - c.getHeight()) / 2);

            c.setVisible(true);
            c.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        });
    }
}
