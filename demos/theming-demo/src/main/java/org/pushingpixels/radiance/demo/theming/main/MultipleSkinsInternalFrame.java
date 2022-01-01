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
package org.pushingpixels.radiance.demo.theming.main;

import org.pushingpixels.radiance.demo.theming.main.check.SampleInternalFrame;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.extras.api.skinpack.OfficeSilver2007Skin;
import org.pushingpixels.radiance.theming.api.skin.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class MultipleSkinsInternalFrame {

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceSkin[][] skinGrid = new RadianceSkin[][] {
                            { new AutumnSkin(), new BusinessSkin(), new BusinessBlueSteelSkin(),
                                            new BusinessBlackSteelSkin() },
                            { new NebulaSkin(), new CremeSkin(), new CremeCoffeeSkin(),
                                            new ModerateSkin() },
                            { new OfficeSilver2007Skin(), new SaharaSkin(), new MistAquaSkin(),
                                            new NebulaBrickWallSkin() },
                            { new RavenSkin(), new GraphiteSkin(), new GraphiteGlassSkin(),
                                            new MagellanSkin() } };

            JFrame frame = new JFrame("Multiple skins");
            final JDesktopPane desktopPane = new JDesktopPane();

            final JInternalFrame[] frames = new JInternalFrame[12];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    SampleInternalFrame internalFrame = new SampleInternalFrame();
                    RadianceThemingCortex.RootPaneScope.setSkin(internalFrame.getRootPane(),
                            skinGrid[i][j]);
                    SwingUtilities.updateComponentTreeUI(internalFrame);
                    frames[i * 3 + j] = internalFrame;

                    desktopPane.add(internalFrame);
                    internalFrame.setVisible(true);
                }
            }

            desktopPane.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    Rectangle bounds = desktopPane.getBounds();
                    int x = bounds.x;
                    for (int i = 0; i < 4; i++) {
                        int y = bounds.y;
                        for (int j = 0; j < 3; j++) {
                            frames[i * 3 + j].setBounds(x, y, bounds.width / 4, bounds.height / 3);
                            y += bounds.height / 3;
                        }
                        x += bounds.width / 4;
                    }
                }
            });
            frame.add(desktopPane, BorderLayout.CENTER);

            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.doLayout();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
    }

}
