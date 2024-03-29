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
package org.pushingpixels.radiance.demo.component.common;

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.JDeterminateCircularProgress;
import org.pushingpixels.radiance.component.api.common.model.CircularProgressPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.DeterminateProgressContentModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;
import org.pushingpixels.radiance.component.api.common.projection.DeterminateCircularProgressProjection;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.demo.component.svg.material.transcoded.add_circle_outline_24px;
import org.pushingpixels.radiance.demo.component.svg.material.transcoded.remove_circle_outline_24px;
import org.pushingpixels.radiance.demo.theming.main.check.selector.RadianceSkinSelector;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;

public class TestDeterminateCircularProgress extends JFrame {
    private DeterminateProgressContentModel contentModel;
    private Command decreaseProgress;
    private Command increaseProgress;

    public TestDeterminateCircularProgress() {
        this.setLayout(new BorderLayout());
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        RadianceSkinSelector skinSelector = new RadianceSkinSelector();
        RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(skinSelector,
                RadianceThemingSlices.PopupPlacementStrategy.Upward.HALIGN_START);
        controlPanel.add(skinSelector);

        contentModel = DeterminateProgressContentModel.builder()
                .setProgress(0.5f)
                .build();

        JButton addEnabled = new JButton("add");
        addEnabled.addActionListener(actionEvent -> {
            int radius = 8 + (int) (10 * Math.random());
            float strokeWidth = 1.5f + (float) Math.random();
            JDeterminateCircularProgress jcp = new DeterminateCircularProgressProjection(
                    contentModel,
                    CircularProgressPresentationModel.builder()
                            .setRadius(radius)
                            .setStrokeWidth(strokeWidth)
                            .build()
            ).buildComponent();
            flow.add(jcp);
            flow.revalidate();
        });
        controlPanel.add(addEnabled);

        this.decreaseProgress = Command.builder()
                .setText("D")
                .setIconFactory(remove_circle_outline_24px.factory())
                .setAction(e -> {
                    contentModel.setProgress(contentModel.getProgress() - 0.1f);
                    decreaseProgress.setActionEnabled(contentModel.getProgress() > 0.00001f);
                    increaseProgress.setActionEnabled(true);
                })
                .build();
        this.increaseProgress = Command.builder()
                .setIconFactory(add_circle_outline_24px.factory())
                .setAction(e -> {
                    contentModel.setProgress(contentModel.getProgress() + 0.1f);
                    decreaseProgress.setActionEnabled(true);
                    increaseProgress.setActionEnabled(contentModel.getProgress() < 0.99999f);
                })
                .build();

        CommandButtonPresentationModel progressButtonPresentationModel =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.SMALL_FIT_TO_ICON)
                        .setIconDimension(new Dimension(14, 14))
                        .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.NEVER)
                        .setIconFilterStrategies(
                                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT
                        )
                        .build();

        controlPanel.add(new CommandButtonProjection<>(this.decreaseProgress, progressButtonPresentationModel).buildComponent());
        controlPanel.add(new CommandButtonProjection<>(this.increaseProgress, progressButtonPresentationModel).buildComponent());

        this.add(controlPanel, BorderLayout.SOUTH);

        this.add(flow, BorderLayout.CENTER);

        this.setPreferredSize(new Dimension(400, 300));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin());

            TestDeterminateCircularProgress test = new TestDeterminateCircularProgress();
            test.setTitle("Circular progress");
            test.setIconImage(RadianceLogo.getLogoImage(test,
                    RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                            RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                            ComponentState.ENABLED)));
            RadianceThemingCortex.GlobalScope.registerSkinChangeListener(() -> SwingUtilities.invokeLater(
                    () -> test.setIconImage(RadianceLogo.getLogoImage(test,
                            RadianceThemingCortex.ComponentScope.getCurrentSkin(test.getRootPane())
                                    .getColorScheme(RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                                            RadianceThemingSlices.ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)))));
            test.setVisible(true);
        });
    }

}
