/*
 * Copyright (c) 2005-2019 Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.internal.substance.ribbon.ui;

import org.pushingpixels.flamingo.api.ribbon.*;
import org.pushingpixels.flamingo.internal.ui.ribbon.*;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.*;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.painter.*;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.*;
import java.util.*;

/**
 * UI for ribbon in <b>Substance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceRibbonUI extends BasicRibbonUI {
    /**
     * Panel for hosting task toggle buttons.
     *
     * @author Kirill Grouchnikov
     */
    protected class SubstanceTaskToggleButtonsHostPanel extends TaskToggleButtonsHostPanel {
        @Override
        protected void paintContextualTaskGroupOutlines(Graphics g, RibbonContextualTaskGroup group,
                Rectangle groupBounds) {
            Graphics2D g2d = (Graphics2D) g.create();

            g2d.translate(groupBounds.x, 0);
            SeparatorPainterUtils.paintSeparator(ribbon, g2d, 2, groupBounds.height * 3 / 4,
                    SwingConstants.VERTICAL, false, 0, groupBounds.height / 3, true);

            g2d.translate(groupBounds.width - 1, 0);
            SeparatorPainterUtils.paintSeparator(ribbon, g2d, 2, groupBounds.height * 3 / 4,
                    SwingConstants.VERTICAL, false, 0, groupBounds.height / 3, true);

            g2d.dispose();
        }

        @Override
        protected void paintTaskOutlines(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            SubstanceColorScheme scheme = SubstanceColorSchemeUtilities.getColorScheme(ribbon,
                    ColorSchemeAssociationKind.SEPARATOR, ComponentState.ENABLED);

            Set<RibbonTask> tasksWithTrailingSeparators = new HashSet<>();
            // add all regular tasks except the last
            for (int i = 0; i < ribbon.getTaskCount() - 1; i++) {
                RibbonTask task = ribbon.getTask(i);
                tasksWithTrailingSeparators.add(task);
                // System.out.println("Added " + task.getTitle());
            }
            // add all tasks of visible contextual groups except last task in
            // each group
            for (int i = 0; i < ribbon.getContextualTaskGroupCount(); i++) {
                RibbonContextualTaskGroup group = ribbon.getContextualTaskGroup(i);
                if (ribbon.isVisible(group)) {
                    for (int j = 0; j < group.getTaskCount() - 1; j++) {
                        RibbonTask task = group.getTask(j);
                        tasksWithTrailingSeparators.add(task);
                    }
                }
            }

            for (RibbonTask taskWithTrailingSeparator : tasksWithTrailingSeparators) {
                JComponent taskToggleButton = taskToggleButtons.get(taskWithTrailingSeparator);
                Rectangle bounds = taskToggleButton.getBounds();
                int x = bounds.x + bounds.width + getTabButtonGap() / 2 - 1;
                g2d.translate(x, 0);
                SeparatorPainterUtils.paintSeparator(ribbon, g2d, scheme, 2, getHeight(),
                        SwingConstants.VERTICAL, false, getHeight() / 3, 0, true);
                g2d.translate(-x, 0);
            }

            g2d.dispose();
        }
    }

    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceRibbonUI();
    }

    private SubstanceRibbonUI() {
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        ComponentOrParentChainScope.setDecorationType(this.ribbon, DecorationAreaType.HEADER);
        Color backgr = this.ribbon.getBackground();
        if ((backgr == null) || (backgr instanceof UIResource)) {
            Color toSet = SubstanceColorSchemeUtilities
                    .getColorScheme(this.ribbon, ComponentState.ENABLED).getBackgroundFillColor();
            this.ribbon.setBackground(new ColorUIResource(toSet));
        }
    }

    @Override
    protected void uninstallDefaults() {
        DecorationPainterUtils.clearDecorationType(this.ribbon);
        super.uninstallDefaults();
    }

    @Override
    protected void installComponents() {
        super.installComponents();
        ComponentOrParentChainScope.setDecorationType(this.ribbon, DecorationAreaType.HEADER);
        ComponentOrParentChainScope.setDecorationType(this.bandScrollablePanel,
                DecorationAreaType.GENERAL);
    }

    @Override
    protected TaskToggleButtonsHostPanel createTaskToggleButtonsHostPanel() {
        return new SubstanceTaskToggleButtonsHostPanel();
    }

    @Override
    protected void paintBackground(Graphics g) {
        BackgroundPaintingUtils.update(g, this.ribbon, false);
    }

    @Override
    protected int getTabButtonGap() {
        return SubstanceSizeUtils.getAdjustedSize(
                SubstanceSizeUtils.getComponentFontSize(this.ribbon), super.getTabButtonGap(), 3, 1,
                false);
    }

    @Override
    protected void syncApplicationMenuTips() {
        if ((this.applicationMenuButton == null) || !this.applicationMenuButton.isVisible()) {
            return;
        }

        JRibbonRootPane ribbonRootPane = (JRibbonRootPane) SwingUtilities.getRootPane(this.ribbon);
        if (ribbonRootPane == null) {
            return;
        }
        JRibbonFrame ribbonFrame = (JRibbonFrame) ribbonRootPane.getParent();
        JRibbon ribbon = ribbonFrame.getRibbon();
        if (ribbon != null) {
            this.applicationMenuButton.setPopupRichTooltip(
                    ribbon.getApplicationMenuCommandProjection()
                            .getContentModel().getSecondaryRichTooltip());
            this.applicationMenuButton.setPopupKeyTip(
                    ribbon.getApplicationMenuCommandProjection()
                            .getPresentationModel().getPopupKeyTip());
        }
    }

    @Override
    protected void paintMinimizedRibbonSeparator(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.translate(0, this.ribbon.getHeight() - 1);
        SeparatorPainterUtils.paintSeparator(this.ribbon, g2d, this.ribbon.getWidth(), 0,
                JSeparator.HORIZONTAL, false, 0);
        g2d.dispose();
    }
}
