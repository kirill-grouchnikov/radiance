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

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.ImageBackedFilterableRadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.demo.component.svg.SvgBatikRadianceIcon;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.MarinerSkin;

import javax.swing.*;
import java.awt.*;

public class IconFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RadianceSkin skin = new MarinerSkin();
            RadianceThemingCortex.GlobalScope.setSkin(skin);
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

            ContainerColorTokens errorTokens = skin.getSystemContainerTokens(
                RadianceThemingSlices.DecorationAreaType.NONE, RadianceThemingSlices.SystemContainerType.ERROR);
            ContainerColorTokens successTokens = skin.getSystemContainerTokens(
                RadianceThemingSlices.DecorationAreaType.NONE, RadianceThemingSlices.SystemContainerType.SUCCESS);
            ContainerColorTokens infoTokens = skin.getSystemContainerTokens(
                RadianceThemingSlices.DecorationAreaType.NONE, RadianceThemingSlices.SystemContainerType.INFO);

            Command errorCommand = Command.builder()
                    .setText("Error")
                    .setIconFactory(() -> new ImageBackedFilterableRadianceIcon(radianceFactory,
                            color -> errorTokens.getAccentOnContainer()))
                    .build();
            frame.add(errorCommand.project(presentationModel).buildComponent());

            Command successCommand = Command.builder()
                    .setText("Success")
                    .setIconFactory(() -> new ImageBackedFilterableRadianceIcon(radianceFactory,
                            color -> successTokens.getAccentOnContainer()))
                    .build();
            frame.add(successCommand.project(presentationModel).buildComponent());

            Command infoCommand = Command.builder()
                    .setText("Info")
                    .setIconFactory(() -> new ImageBackedFilterableRadianceIcon(radianceFactory,
                            color -> infoTokens.getAccentOnContainer()))
                    .build();
            frame.add(infoCommand.project(presentationModel).buildComponent());

            RadianceIcon.Factory tangoFactory = () -> SvgBatikRadianceIcon.getSvgIcon(
                    IconFrame.class.getResourceAsStream("svg/tango/Edit-paste.svg"),
                    RadianceCommonCortex.getScaleFactor(frame),
                    new Dimension(16, 16));

            Command originalTangoCommand = Command.builder()
                    .setText("None")
                    .setIconFactory(tangoFactory)
                    .build();
            frame.add(originalTangoCommand.project(presentationModel).buildComponent());

            Command errorTangoCommand = Command.builder()
                    .setText("Error")
                    .setIconFactory(() -> new ImageBackedFilterableRadianceIcon(tangoFactory,
                        errorTokens.getColorFilter(1.0f, 1.0f)))
                    .build();
            frame.add(errorTangoCommand.project(presentationModel).buildComponent());

            Command successTangoCommand = Command.builder()
                    .setText("Success")
                    .setIconFactory(() -> new ImageBackedFilterableRadianceIcon(tangoFactory,
                        successTokens.getColorFilter(1.0f, 1.0f)))
                    .build();
            frame.add(successTangoCommand.project(presentationModel).buildComponent());

            Command infoTangoCommand = Command.builder()
                    .setText("Info")
                    .setIconFactory(() -> new ImageBackedFilterableRadianceIcon(tangoFactory,
                        infoTokens.getColorFilter(1.0f, 1.0f)))
                    .build();
            frame.add(infoTangoCommand.project(presentationModel).buildComponent());

            frame.setVisible(true);
        });
    }
}
