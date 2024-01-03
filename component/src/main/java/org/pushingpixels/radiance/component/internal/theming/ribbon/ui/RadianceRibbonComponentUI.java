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
package org.pushingpixels.radiance.component.internal.theming.ribbon.ui;

import org.pushingpixels.radiance.component.internal.ui.ribbon.BasicRibbonComponentUI;
import org.pushingpixels.radiance.component.internal.ui.ribbon.JRibbonComponent;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceTextUtilities;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * UI for {@link JRibbonComponent} components in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceRibbonComponentUI extends BasicRibbonComponentUI {
    public static ComponentUI createUI(JComponent c) {
        return new RadianceRibbonComponentUI();
    }

    private RadianceRibbonComponentUI() {
    }

    @Override
    protected void paintIcon(Graphics g, JRibbonComponent ribbonComp, Icon icon, int x, int y) {
        ComponentState state = ribbonComp.isEnabled() ? ComponentState.ENABLED
                : ComponentState.DISABLED_UNSELECTED;

        float labelAlpha = RadianceColorSchemeUtilities.getAlpha(ribbonComp, state);
        Color textColor = RadianceTextUtilities.getForegroundColor(
                ribbonComp, state, labelAlpha);
        icon = RadianceCoreUtilities.getFilteredIcon(ribbonComp, icon, state, textColor);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.translate(x, y);
        icon.paintIcon(ribbonComp, g2d, 0, 0);
        g2d.dispose();
    }
}
