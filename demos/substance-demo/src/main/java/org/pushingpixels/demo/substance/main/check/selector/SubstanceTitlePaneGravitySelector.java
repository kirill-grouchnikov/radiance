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
package org.pushingpixels.demo.substance.main.check.selector;

import org.pushingpixels.demo.substance.main.check.FlexiComboBox;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;

import javax.swing.*;

public class SubstanceTitlePaneGravitySelector extends
        FlexiComboBox<SubstanceTitlePaneGravitySelector.TitlePaneConfiguration> {
    public static class TitlePaneConfiguration {
        private String title;
        private SubstanceSlices.HorizontalGravity textGravity;
        private SubstanceSlices.HorizontalGravity controlButtonsGravity;
        private SubstanceSlices.TitleIconHorizontalGravity iconGravity;

        private TitlePaneConfiguration(String title, SubstanceSlices.HorizontalGravity textGravity,
                SubstanceSlices.HorizontalGravity controlButtonsGravity, SubstanceSlices.TitleIconHorizontalGravity iconGravity) {
            this.title = title;
            this.textGravity = textGravity;
            this.controlButtonsGravity = controlButtonsGravity;
            this.iconGravity = iconGravity;
        }
    }

    public SubstanceTitlePaneGravitySelector() {
        // populate the combobox
        super(new TitlePaneConfiguration("Swing default", SubstanceSlices.HorizontalGravity.SWING_DEFAULT,
                                SubstanceSlices.HorizontalGravity.SWING_DEFAULT,
                                SubstanceSlices.TitleIconHorizontalGravity.SWING_DEFAULT),
                new TitlePaneConfiguration("Platform", SubstanceSlices.HorizontalGravity.PLATFORM,
                        SubstanceSlices.HorizontalGravity.PLATFORM,
                        SubstanceSlices.TitleIconHorizontalGravity.PLATFORM),
                new TitlePaneConfiguration("Force macOS", SubstanceSlices.HorizontalGravity.CENTERED,
                        SubstanceSlices.HorizontalGravity.LEADING,
                        SubstanceSlices.TitleIconHorizontalGravity.NEXT_TO_TITLE),
                new TitlePaneConfiguration("Force Windows", SubstanceSlices.HorizontalGravity.LEADING,
                        SubstanceSlices.HorizontalGravity.TRAILING,
                        SubstanceSlices.TitleIconHorizontalGravity.OPPOSITE_CONTROL_BUTTONS),
                new TitlePaneConfiguration("Force Gnome", SubstanceSlices.HorizontalGravity.CENTERED,
                        SubstanceSlices.HorizontalGravity.TRAILING, SubstanceSlices.TitleIconHorizontalGravity.NONE),
                new TitlePaneConfiguration("Force KDE", SubstanceSlices.HorizontalGravity.CENTERED,
                        SubstanceSlices.HorizontalGravity.TRAILING,
                        SubstanceSlices.TitleIconHorizontalGravity.OPPOSITE_CONTROL_BUTTONS));

        // add an action listener to change title pane gravity based on user selection
        this.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            TitlePaneConfiguration selected = (TitlePaneConfiguration) getSelectedItem();
            SubstanceCortex.GlobalScope.configureTitleContentGravity(selected.textGravity,
                    selected.controlButtonsGravity, selected.iconGravity);
        }));
    }

    @Override
    public String getCaption(TitlePaneConfiguration item) {
        return item.title;
    }
}
