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

public class RadianceIconFilterStrategySelector extends
        FlexiComboBox<RadianceIconFilterStrategySelector.IconFilterStrategyConfiguration> {
    public static class IconFilterStrategyConfiguration {
        private String title;
        private RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy;
        private RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy;
        private RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy;

        private IconFilterStrategyConfiguration(String title,
                RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy) {
            this.title = title;
            this.activeIconFilterStrategy = activeIconFilterStrategy;
            this.enabledIconFilterStrategy = enabledIconFilterStrategy;
            this.disabledIconFilterStrategy = disabledIconFilterStrategy;
        }
    }

    public RadianceIconFilterStrategySelector() {
        // populate the combobox
        super(new IconFilterStrategyConfiguration("Default",
                        RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                        RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME),
                new IconFilterStrategyConfiguration("Muted",
                        RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME),
                new IconFilterStrategyConfiguration("Text inactive",
                        RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT),
                new IconFilterStrategyConfiguration("Text always",
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT));

        // add an action listener to change icon filter strategies based on user selection
        this.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            IconFilterStrategyConfiguration selected = (IconFilterStrategyConfiguration) getSelectedItem();
            RadianceThemingCortex.GlobalScope.setIconFilterStrategies(
                    selected.activeIconFilterStrategy,
                    selected.enabledIconFilterStrategy,
                    selected.disabledIconFilterStrategy);
            SwingUtilities.getWindowAncestor(RadianceIconFilterStrategySelector.this).repaint();
        }));
    }

    @Override
    public String getCaption(IconFilterStrategyConfiguration item) {
        return item.title;
    }
}
