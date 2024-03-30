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
package org.pushingpixels.radiance.theming.api.titlepane;

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeIconUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import java.awt.*;

public class DefaultTitlePaneButtonsProvider implements TitlePaneButtonsProvider {
    public static class DefaultCloseButtonProvider implements TitlePaneButtonProvider {
        @Override
        public String getText(JRootPane rootPane) {
            if ((rootPane != null) && RadianceCoreUtilities.isRootPaneModified(rootPane)) {
                return RadianceThemingCortex.GlobalScope.getLabelBundle().
                        getString("SystemMenu.close")
                        + " [" + RadianceThemingCortex.GlobalScope.getLabelBundle()
                        .getString("Tooltip.contentsNotSaved")
                        + "]";
            } else {
                return RadianceThemingCortex.GlobalScope.getLabelBundle().getString("SystemMenu.close");
            }
        }

        @Override
        public void drawIcon(Graphics2D g, RadianceColorScheme scheme, float alpha, int iconSize) {
            BladeIconUtils.drawCloseIcon(g, iconSize,
                    RadianceSizeUtils.getCloseIconStrokeWidth(iconSize), scheme);
        }
    }

    @Override
    public TitlePaneButtonProvider getCloseButtonProvider() {
        return new DefaultCloseButtonProvider();
    }

    public static class DefaultRestoreButtonProvider implements TitlePaneButtonProvider {
        @Override
        public String getText(JRootPane rootPane) {
            return RadianceThemingCortex.GlobalScope.getLabelBundle().getString("SystemMenu.restore");
        }

        @Override
        public void drawIcon(Graphics2D g, RadianceColorScheme scheme, float alpha, int iconSize) {
            BladeIconUtils.drawRestoreIcon(g, iconSize, scheme);
        }
    }

    @Override
    public TitlePaneButtonProvider getRestoreButtonProvider() {
        return new DefaultRestoreButtonProvider();
    }

    public static class DefaultIconifyButtonProvider implements TitlePaneButtonProvider {
        @Override
        public String getText(JRootPane rootPane) {
            return RadianceThemingCortex.GlobalScope.getLabelBundle().getString("SystemMenu.iconify");
        }

        @Override
        public void drawIcon(Graphics2D g, RadianceColorScheme scheme, float alpha, int iconSize) {
            BladeIconUtils.drawIconifyIcon(g, iconSize, scheme);
        }
    }

    @Override
    public TitlePaneButtonProvider getIconifyButtonProvider() {
        return new DefaultIconifyButtonProvider();
    }

    public static class DefaultMaximizeButtonProvider implements TitlePaneButtonProvider {
        @Override
        public String getText(JRootPane rootPane) {
            return RadianceThemingCortex.GlobalScope.getLabelBundle().getString("SystemMenu.maximize");
        }

        @Override
        public void drawIcon(Graphics2D g, RadianceColorScheme scheme, float alpha, int iconSize) {
            BladeIconUtils.drawMaximizeIcon(g, iconSize, scheme);
        }
    }

    @Override
    public TitlePaneButtonProvider getMaximizeButtonProvider() {
        return new DefaultMaximizeButtonProvider();
    }
}
