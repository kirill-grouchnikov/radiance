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
package org.pushingpixels.radiance.demo.theming.main.check;

import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.titlepane.DefaultTitlePaneButtonsProvider;
import org.pushingpixels.radiance.theming.api.titlepane.TitlePaneButtonProvider;

import java.awt.*;

public class CustomTitlePaneButtonsProvider extends DefaultTitlePaneButtonsProvider {
    @Override
    public TitlePaneButtonProvider getCloseButtonProvider() {
        return new DefaultCloseButtonProvider() {
            @Override
            public void drawIcon(Graphics2D g, RadianceColorScheme scheme, int iconSize) {
                Graphics2D graphics = (Graphics2D) g.create();
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BICUBIC);

                int start = iconSize / 4;
                int end = iconSize - start;

                Color primaryColor = scheme.getMarkColor();

                Stroke primaryStroke = new BasicStroke(1.5f,
                        BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);

                graphics.setStroke(primaryStroke);
                graphics.setColor(primaryColor);
                // Triangle
                graphics.drawLine(start, start, end, start);
                graphics.drawLine(end, start, end, end);
                graphics.drawLine(end, end, start, start);

                graphics.dispose();
            }
        };
    }

    @Override
    public TitlePaneButtonProvider getMaximizeButtonProvider() {
        return new DefaultMaximizeButtonProvider() {
            @Override
            public void drawIcon(Graphics2D g, RadianceColorScheme scheme, int iconSize) {
                Graphics2D graphics = (Graphics2D) g.create();
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BICUBIC);

                int start = iconSize / 4;
                int end = iconSize - start;

                Color primaryColor = scheme.getMarkColor();

                Stroke primaryStroke = new BasicStroke(1.5f,
                        BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);

                graphics.setStroke(primaryStroke);
                graphics.setColor(primaryColor);
                // Arrow to top-right
                graphics.drawLine(start, end, end, start);
                graphics.drawLine(start, start, end, start);
                graphics.drawLine(end, end, end, start);

                graphics.dispose();
            }
        };
    }

    @Override
    public TitlePaneButtonProvider getRestoreButtonProvider() {
        return new DefaultRestoreButtonProvider() {
            @Override
            public void drawIcon(Graphics2D g, RadianceColorScheme scheme, int iconSize) {
                Graphics2D graphics = (Graphics2D) g.create();
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BICUBIC);

                int start = iconSize / 4;
                int end = iconSize - start;

                Color primaryColor = scheme.getMarkColor();

                Stroke primaryStroke = new BasicStroke(1.5f,
                        BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);

                graphics.setStroke(primaryStroke);
                graphics.setColor(primaryColor);
                // Arrow to bottom-left
                graphics.drawLine(start, end, end, start);
                graphics.drawLine(start, start, start, end);
                graphics.drawLine(start, end, end, end);

                graphics.dispose();
            }
        };
    }

    @Override
    public TitlePaneButtonProvider getIconifyButtonProvider() {
        return new DefaultIconifyButtonProvider() {
            @Override
            public void drawIcon(Graphics2D g, RadianceColorScheme scheme, int iconSize) {
                Graphics2D graphics = (Graphics2D) g.create();
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BICUBIC);

                int start = iconSize / 4;
                int end = iconSize - start;
                int mid = (start + end) / 2;

                Color primaryColor = scheme.getMarkColor();

                Stroke primaryStroke = new BasicStroke(1.5f,
                        BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);

                graphics.setStroke(primaryStroke);
                graphics.setColor(primaryColor);

                graphics.drawLine(mid, start, mid, end);
                graphics.drawLine(start, end, end, end);

                graphics.dispose();
            }
        };
    }
}
