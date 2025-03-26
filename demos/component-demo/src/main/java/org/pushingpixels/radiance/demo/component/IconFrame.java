/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.component;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.ImageBackedFilterableRadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.demo.component.svg.SvgBatikRadianceIcon;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.palette.TonalPaletteSeeds;
import org.pushingpixels.radiance.theming.api.skin.MarinerSkin;

import javax.swing.*;
import java.awt.*;

public class IconFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new MarinerSkin());
            JFrame.setDefaultLookAndFeelDecorated(true);

            JFrame frame = new JFrame("Icons");
            frame.setSize(400, 150);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            RadianceLogo.tonalConfigureOn(frame);

            frame.setLayout(new FlowLayout(FlowLayout.CENTER));

            CommandButtonPresentationModel presentationModel =
                    CommandButtonPresentationModel.builder()
                            .setPresentationState(CommandButtonPresentationState.MEDIUM)
                            .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.ALWAYS)
                            .build();

            RadianceIcon.Factory radianceFactory = () -> SvgBatikRadianceIcon.getSvgIcon(
                    IconFrame.class.getResourceAsStream("svg/radiance_menu.svg"),
                    RadianceCommonCortex.getScaleFactor(frame),
                    new Dimension(16, 16));

            Command originalCommand = Command.builder()
                    .setText("None")
                    .setIconFactory(radianceFactory)
                    .build();
            frame.add(originalCommand.project(presentationModel).buildComponent());

            Command redCommand = Command.builder()
                    .setText("Red")
                    .setIconFactory(() -> new ImageBackedFilterableRadianceIcon(radianceFactory,
                            color -> Color.red))
                    .build();
            frame.add(redCommand.project(presentationModel).buildComponent());

            Command greenCommand = Command.builder()
                    .setText("Green")
                    .setIconFactory(() -> new ImageBackedFilterableRadianceIcon(radianceFactory,
                            color -> new Color(0, 128, 0)))
                    .build();
            frame.add(greenCommand.project(presentationModel).buildComponent());

            Command blueCommand = Command.builder()
                    .setText("Blue")
                    .setIconFactory(() -> new ImageBackedFilterableRadianceIcon(radianceFactory,
                            color -> Color.blue))
                    .build();
            frame.add(blueCommand.project(presentationModel).buildComponent());

            RadianceIcon.Factory tangoFactory = () -> SvgBatikRadianceIcon.getSvgIcon(
                    IconFrame.class.getResourceAsStream("svg/tango/Edit-paste.svg"),
                    RadianceCommonCortex.getScaleFactor(frame),
                    new Dimension(16, 16));

            Command originalTangoCommand = Command.builder()
                    .setText("None")
                    .setIconFactory(tangoFactory)
                    .build();
            frame.add(originalTangoCommand.project(presentationModel).buildComponent());

            ContainerColorTokens redTokens = ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(TonalPaletteSeeds.SUNFIRE_RED.getRGB()),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());
            Command redTangoCommand = Command.builder()
                    .setText("Red")
                    .setIconFactory(() -> new ImageBackedFilterableRadianceIcon(tangoFactory,
                        redTokens.getColorFilter(1.0f, 1.0f)))
                    .build();
            frame.add(redTangoCommand.project(presentationModel).buildComponent());

            ContainerColorTokens greenTokens = ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(TonalPaletteSeeds.LIME_GREEN.getRGB()),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());
            Command greenTangoCommand = Command.builder()
                    .setText("Green")
                    .setIconFactory(() -> new ImageBackedFilterableRadianceIcon(tangoFactory,
                        greenTokens.getColorFilter(1.0f, 1.0f)))
                    .build();
            frame.add(greenTangoCommand.project(presentationModel).buildComponent());

            ContainerColorTokens blueTokens = ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(TonalPaletteSeeds.STEEL_BLUE.getRGB()),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());
            Command blueTangoCommand = Command.builder()
                    .setText("Blue")
                    .setIconFactory(() -> new ImageBackedFilterableRadianceIcon(tangoFactory,
                        blueTokens.getColorFilter(1.0f, 1.0f)))
                    .build();
            frame.add(blueTangoCommand.project(presentationModel).buildComponent());

            frame.setVisible(true);
        });
    }
}
