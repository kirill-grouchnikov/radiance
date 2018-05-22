/*
 * Copyright 2005-2018 Kirill Grouchnikov, based on work by
 * Sun Microsystems, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.pushingpixels.substance.swingx;

import java.awt.Graphics2D;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JSeparator;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.painter.overlay.SubstanceOverlayPainter;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.SeparatorPainterUtils;

public class SubstanceSwingxFillBackgroundDelegate {
    public void paint(JComponent component, Graphics2D graphics, boolean paintSeparator) {
        BackgroundPaintingUtils.updateIfOpaque(graphics, component);
        if (paintSeparator) {
            SubstanceSkin skin = SubstanceCortex.ComponentScope.getCurrentSkin(component);
            DecorationAreaType decorationAreaType = ComponentOrParentChainScope
                    .getDecorationType(component);
            List<SubstanceOverlayPainter> overlayPainters = skin
                    .getOverlayPainters(decorationAreaType);
            // only if there are no overlays specified on this decoration area
            // type in the skin
            if (overlayPainters.size() == 0) {
                // paint the separator on top.
                SeparatorPainterUtils.paintSeparator(component, graphics, component.getWidth(), 0,
                        JSeparator.HORIZONTAL, false, 0);
            }
        }
    }
}
