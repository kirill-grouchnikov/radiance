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
package org.pushingpixels.radiance.demo.theming.main.check.selector;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.font.FontPolicy;
import org.pushingpixels.radiance.demo.theming.main.check.svg.tango.view_zoom_in;
import org.pushingpixels.radiance.demo.theming.main.check.svg.tango.view_zoom_out;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class RadianceFontScaleSelector extends JPanel {
    public RadianceFontScaleSelector() {
        this.setLayout(new BorderLayout());
        this.add(new JLabel(view_zoom_out.of(32, 32)), BorderLayout.LINE_START);
        this.add(new JLabel(view_zoom_in.of(32, 32)), BorderLayout.LINE_END);

        JSlider fontScaleSlider = new JSlider(100, 300);
        fontScaleSlider.setMajorTickSpacing(50);
        fontScaleSlider.setMinorTickSpacing(10);
        fontScaleSlider.setSnapToTicks(true);
        fontScaleSlider.setPaintTicks(true);
        fontScaleSlider.setPaintLabels(true);
        fontScaleSlider.setValue(100);
        fontScaleSlider.setBorder(new EmptyBorder(0, 12, 0, 12));
        this.add(fontScaleSlider, BorderLayout.CENTER);

        fontScaleSlider.addChangeListener(changeEvent -> {
            // if the value is adjusting - ignore. This is done
            // to make CPU usage better.
            if (fontScaleSlider.getModel().getValueIsAdjusting()) {
                return;
            }
            final float scale = fontScaleSlider.getValue() / 100.0f;
            SwingUtilities.invokeLater(() -> {
                // reset the base font policy to null - this
                // restores the original font policy (default size).
                RadianceThemingCortex.GlobalScope.setFontPolicy(null);
                // Create a scaled font policy that matches the current scale selection
                FontPolicy newFontPolicy = RadianceCommonCortex.getScaledFontPolicy(scale);
                RadianceThemingCortex.GlobalScope.setFontPolicy(newFontPolicy);
            });
        });
    }
}
