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

import org.jdesktop.swingx.JXTaskPaneContainer;
import org.jdesktop.swingx.VerticalLayout;
import org.jdesktop.swingx.plaf.basic.BasicTaskPaneContainerUI;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.internal.painter.DecorationPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostPaintingUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * Substance-consistent UI delegate for {@link JXTaskPaneContainer}.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceTaskPaneContainerUI extends BasicTaskPaneContainerUI {
    /**
     * Background delegate.
     */
    private SubstanceSwingxFillBackgroundDelegate bgDelegate;

    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceTaskPaneContainerUI();
    }

    /**
     * Creates a new UI delegate.
     */
    public SubstanceTaskPaneContainerUI() {
        super();
        this.bgDelegate = new SubstanceSwingxFillBackgroundDelegate();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jdesktop.swingx.plaf.basic.BasicTaskPaneContainerUI#installUI(javax
     * .swing.JComponent)
     */
    @Override
    public void installUI(JComponent c) {
        super.installUI(c);

        JXTaskPaneContainer taskPane = (JXTaskPaneContainer) c;
        taskPane.setLayout(new VerticalLayout(14));
        taskPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        // taskPane.putClientProperty(SubstanceLookAndFeel.PAINT_ACTIVE_PROPERTY
        // ,
        // Boolean.TRUE);
        // taskPane.setOpaque(false);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jdesktop.swingx.plaf.basic.BasicTaskPaneContainerUI#installDefaults()
     */
    @Override
    protected void installDefaults() {
        super.installDefaults();
        this.taskPane.setBackgroundPainter(null);
        ComponentOrParentChainScope.setDecorationType(this.taskPane, DecorationAreaType.GENERAL);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jdesktop.swingx.plaf.basic.BasicTaskPaneContainerUI#uninstallDefaults ()
     */
    @Override
    protected void uninstallDefaults() {
        DecorationPainterUtils.clearDecorationType(this.taskPane);
        super.uninstallDefaults();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jdesktop.swingx.plaf.basic.BasicTaskPaneContainerUI#paint(java.awt .Graphics,
     * javax.swing.JComponent)
     */
    @Override
    public void paint(Graphics g, JComponent c) {
        this.bgDelegate.paint(c, (Graphics2D) g, false);
    }

    @Override
    public void update(Graphics g, JComponent c) {
        super.update(g, c);
        GhostPaintingUtils.paintGhostImages(c, g);
    }
}
