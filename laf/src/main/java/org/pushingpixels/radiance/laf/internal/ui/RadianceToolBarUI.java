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
package org.pushingpixels.radiance.laf.internal.ui;

import org.pushingpixels.radiance.laf.api.RadianceLafCortex;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices;
import org.pushingpixels.radiance.laf.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.laf.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.laf.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.laf.internal.widget.animation.effects.GhostPaintingUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolBarUI;
import java.awt.*;

/**
 * UI for tool bars in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceToolBarUI extends BasicToolBarUI {
    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceToolBarUI();
    }

    private RadianceToolBarUI() {
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        RadianceLafCortex.ComponentOrParentChainScope.setDecorationType(this.toolBar, RadianceLafSlices.DecorationAreaType.TOOLBAR);
    }

    @Override
    protected void uninstallDefaults() {
        DecorationPainterUtils.clearDecorationType(this.toolBar);
        super.uninstallDefaults();
    }

    @Override
    public void update(Graphics g, JComponent c) {
        boolean isOpaque = RadianceCoreUtilities.isOpaque(c);
        if (isOpaque) {
            BackgroundPaintingUtils.update(g, c, false);
        } else {
            super.update(g, c);
        }
        GhostPaintingUtils.paintGhostImages(c, g);
    }

    @Override
    protected void setBorderToRollover(Component c) {
    }

    @Override
    protected void setBorderToNonRollover(Component c) {
    }

    @Override
    protected void setBorderToNormal(Component c) {
    }
}
