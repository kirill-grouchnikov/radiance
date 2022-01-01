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
package org.pushingpixels.radiance.demo.theming.main.check.selector;

import org.pushingpixels.radiance.demo.theming.main.check.FlexiComboBox;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import javax.swing.*;

public class RadianceTitlePaneGravitySelector extends
        FlexiComboBox<RadianceTitlePaneGravitySelector.TitlePaneConfiguration> {
    public static class TitlePaneConfiguration {
        private String title;
        private RadianceThemingSlices.HorizontalGravity textGravity;
        private RadianceThemingSlices.HorizontalGravity controlButtonsGravity;
        private RadianceThemingSlices.TitleIconHorizontalGravity iconGravity;

        private TitlePaneConfiguration(String title, RadianceThemingSlices.HorizontalGravity textGravity,
                                       RadianceThemingSlices.HorizontalGravity controlButtonsGravity, RadianceThemingSlices.TitleIconHorizontalGravity iconGravity) {
            this.title = title;
            this.textGravity = textGravity;
            this.controlButtonsGravity = controlButtonsGravity;
            this.iconGravity = iconGravity;
        }
    }

    public RadianceTitlePaneGravitySelector() {
        // populate the combobox
        super(new TitlePaneConfiguration("Swing default", RadianceThemingSlices.HorizontalGravity.SWING_DEFAULT,
                                RadianceThemingSlices.HorizontalGravity.SWING_DEFAULT,
                                RadianceThemingSlices.TitleIconHorizontalGravity.SWING_DEFAULT),
                new TitlePaneConfiguration("Platform", RadianceThemingSlices.HorizontalGravity.PLATFORM,
                        RadianceThemingSlices.HorizontalGravity.PLATFORM,
                        RadianceThemingSlices.TitleIconHorizontalGravity.PLATFORM),
                new TitlePaneConfiguration("Force macOS", RadianceThemingSlices.HorizontalGravity.CENTERED,
                        RadianceThemingSlices.HorizontalGravity.LEADING,
                        RadianceThemingSlices.TitleIconHorizontalGravity.NEXT_TO_TITLE),
                new TitlePaneConfiguration("Force Windows", RadianceThemingSlices.HorizontalGravity.LEADING,
                        RadianceThemingSlices.HorizontalGravity.TRAILING,
                        RadianceThemingSlices.TitleIconHorizontalGravity.OPPOSITE_CONTROL_BUTTONS),
                new TitlePaneConfiguration("Force Gnome", RadianceThemingSlices.HorizontalGravity.CENTERED,
                        RadianceThemingSlices.HorizontalGravity.TRAILING, RadianceThemingSlices.TitleIconHorizontalGravity.NONE),
                new TitlePaneConfiguration("Force KDE", RadianceThemingSlices.HorizontalGravity.CENTERED,
                        RadianceThemingSlices.HorizontalGravity.TRAILING,
                        RadianceThemingSlices.TitleIconHorizontalGravity.OPPOSITE_CONTROL_BUTTONS));

        // add an action listener to change title pane gravity based on user selection
        this.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            TitlePaneConfiguration selected = (TitlePaneConfiguration) getSelectedItem();
            RadianceThemingCortex.GlobalScope.configureTitleContentGravity(selected.textGravity,
                    selected.controlButtonsGravity, selected.iconGravity);
        }));
    }

    @Override
    public String getCaption(TitlePaneConfiguration item) {
        return item.title;
    }
}
