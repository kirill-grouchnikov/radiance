/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.painter.surface;

import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.painter.FractionBasedPainter;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import java.awt.*;
import java.awt.MultipleGradientPaint.CycleMethod;

/**
 * Surface painter with flat full based on the provided color query.
 *
 * @author Kirill Grouchnikov
 */
public class FlatSurfacePainter implements RadianceSurfacePainter {
    private String displayName;

    private ContainerColorTokensSingleColorQuery colorQuery;

    /**
     * Creates a new flat surface painter.
     *
     * @param displayName  The display name of this painter.
     * @param colorQuery   The color query of this painter. Must be non-<code>null</code>.
     */
    public FlatSurfacePainter(String displayName, ContainerColorTokensSingleColorQuery colorQuery) {
        if (colorQuery == null) {
            throw new IllegalArgumentException("Cannot pass null arguments");
        }
        this.displayName = displayName;
        this.colorQuery = colorQuery;
    }

    @Override
    public String getDisplayName() {
        return this.displayName;
    }

    @Override
    public void paintSurface(Graphics g, Component comp, float width, float height, double scaleFactor,
            Shape outline, ContainerColorTokens colorTokens) {
        Graphics2D graphics = (Graphics2D) g.create();

        Color color = this.colorQuery.query(colorTokens);
        graphics.setPaint(color);
        graphics.fill(outline);
        graphics.dispose();
    }

}
