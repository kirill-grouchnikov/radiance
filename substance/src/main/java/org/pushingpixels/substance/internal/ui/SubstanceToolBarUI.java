/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.substance.internal.ui;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolBarUI;

import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.DecorationPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostPaintingUtils;

/**
 * UI for tool bars in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceToolBarUI extends BasicToolBarUI {
    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#createUI(javax.swing.JComponent)
     */
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceToolBarUI();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicToolBarUI#installDefaults()
     */
    @Override
    protected void installDefaults() {
        super.installDefaults();
        ComponentOrParentChainScope.setDecorationType(this.toolBar, DecorationAreaType.TOOLBAR);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicToolBarUI#uninstallDefaults()
     */
    @Override
    protected void uninstallDefaults() {
        DecorationPainterUtils.clearDecorationType(this.toolBar);
        super.uninstallDefaults();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#update(java.awt.Graphics, javax.swing.JComponent)
     */
    @Override
    public void update(Graphics g, JComponent c) {
        boolean isOpaque = SubstanceCoreUtilities.isOpaque(c);
        if (isOpaque) {
            BackgroundPaintingUtils.update(g, c, false);
        } else {
            super.update(g, c);
        }
        GhostPaintingUtils.paintGhostImages(c, g);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicToolBarUI#setBorderToRollover(java.awt.Component )
     */
    @Override
    protected void setBorderToRollover(Component c) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicToolBarUI#setBorderToNonRollover(java.awt .Component)
     */
    @Override
    protected void setBorderToNonRollover(Component c) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicToolBarUI#setBorderToNormal(java.awt.Component )
     */
    @Override
    protected void setBorderToNormal(Component c) {
    }
}
