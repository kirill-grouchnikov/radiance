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
package org.pushingpixels.radiance.demo.theming.main;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.demo.theming.main.check.svg.radiance_menu;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class RadianceLogo {
    public static RadianceIcon getLogoIcon(RadianceColorScheme scheme) {
        // Step 1 - create a colorized version of the transcoded Radiance logo
        RadianceIcon base = radiance_menu.factory().createNewIcon();
        base.setColorFilter(color -> scheme.getForegroundColor());
        // Step 2 - configure the colorized version to be 16x16
        base.setDimension(new Dimension(16, 16));
        // Step 3 - good to go
        return base;
    }

    public static BufferedImage getLogoImage(Component comp, RadianceColorScheme scheme) {
        return getLogoIcon(scheme).toImage(RadianceCommonCortex.getScaleFactor(comp));
    }

    public static void configureOn(JFrame frame) {
        frame.setIconImage(RadianceLogo.getLogoImage(frame, RadianceThemingCortex.ComponentScope.getCurrentSkin(frame.getRootPane())
                .getColorScheme(RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)));
        RadianceThemingCortex.GlobalScope.registerSkinChangeListener(() -> SwingUtilities.invokeLater(
                () -> frame.setIconImage(RadianceLogo.getLogoImage(frame,
                        RadianceThemingCortex.ComponentScope.getCurrentSkin(frame.getRootPane())
                                .getColorScheme(RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)))));
    }
}
