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

import org.jdesktop.swingx.JXPanel;
import org.jdesktop.swingx.JXTitledPanel;
import org.jdesktop.swingx.plaf.basic.BasicTitledPanelUI;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.internal.contrib.jgoodies.looks.ShadowPopupBorder;
import org.pushingpixels.substance.internal.painter.DecorationPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.border.SubstanceBorder;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;

/**
 * Substance-consistent UI delegate for {@link JXTitledPanel}.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceTitledPanelUI extends BasicTitledPanelUI {
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceTitledPanelUI();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jdesktop.swingx.plaf.basic.BasicTitledPanelUI#installComponents(org
     * .jdesktop.swingx.JXTitledPanel)
     */
    @Override
    protected void installComponents(JXTitledPanel titledPanel) {
        super.installComponents(titledPanel);

        Border currBorder = titledPanel.getBorder();
        if ((currBorder == null) || (currBorder instanceof UIResource)) {
            titledPanel.setBorder(new BorderUIResource.CompoundBorderUIResource(
                    new EmptyBorder(2, 2, 2, 2),
                    new CompoundBorder(ShadowPopupBorder.getInstance(), new SubstanceBorder())));
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jdesktop.swingx.plaf.basic.BasicTitledPanelUI#createAndConfigureTopPanel
     * (org.jdesktop.swingx.JXTitledPanel)
     */
    @Override
    protected JXPanel createAndConfigureTopPanel(JXTitledPanel titledPanel) {
        JXPanel result = super.createAndConfigureTopPanel(titledPanel);
        ComponentOrParentChainScope.setDecorationType(result, DecorationAreaType.HEADER);
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jdesktop.swingx.plaf.basic.BasicTitledPanelUI#uninstallDefaults(org
     * .jdesktop.swingx.JXTitledPanel)
     */
    @Override
    protected void uninstallDefaults(JXTitledPanel titledPanel) {
        DecorationPainterUtils.clearDecorationType(topPanel);
        super.uninstallDefaults(titledPanel);
    }
}
