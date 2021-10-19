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
package org.pushingpixels.radiance.components.internal.theming.ribbon.ui;

import org.pushingpixels.radiance.components.api.ribbon.JRibbon;
import org.pushingpixels.radiance.components.api.ribbon.JRibbonFrame;
import org.pushingpixels.radiance.components.api.ribbon.RibbonContextualTaskGroup;
import org.pushingpixels.radiance.components.api.ribbon.RibbonTask;
import org.pushingpixels.radiance.components.api.ribbon.projection.RibbonApplicationMenuCommandButtonProjection;
import org.pushingpixels.radiance.components.internal.ui.ribbon.BasicRibbonUI;
import org.pushingpixels.radiance.components.internal.ui.ribbon.JRibbonRootPane;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.painter.SeparatorPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.HashSet;
import java.util.Set;

/**
 * UI for ribbon in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceRibbonUI extends BasicRibbonUI {
    /**
     * Panel for hosting task toggle buttons.
     *
     * @author Kirill Grouchnikov
     */
    protected class RadianceTaskToggleButtonsHostPanel extends TaskToggleButtonsHostPanel {
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
            RadianceColorScheme scheme = RadianceColorSchemeUtilities.getColorScheme(ribbon,
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

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            RadianceColorScheme compScheme = RadianceColorSchemeUtilities.getColorScheme(
                    this, ColorSchemeAssociationKind.SEPARATOR, ComponentState.ENABLED);
            g2d.setColor(compScheme.getSeparatorPrimaryColor());
            float separatorThickness = RadianceSizeUtils.getBorderStrokeWidth(this);
            float separatorY = this.getHeight() - separatorThickness;
            g2d.setStroke(new BasicStroke(separatorThickness, BasicStroke.CAP_BUTT,
                    BasicStroke.JOIN_ROUND));
            g2d.draw(new Line2D.Double(0, separatorY, this.getWidth(), separatorY));
            g2d.dispose();
        }
    }

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceRibbonUI();
    }

    private RadianceRibbonUI() {
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        ComponentOrParentChainScope.setDecorationType(this.ribbon, DecorationAreaType.HEADER);
    }

    @Override
    protected void uninstallDefaults() {
        DecorationPainterUtils.clearDecorationType(this.ribbon);
        DecorationPainterUtils.clearDecorationType(this.bandScrollablePanel);
        super.uninstallDefaults();
    }

    @Override
    protected void installComponents() {
        super.installComponents();
        ComponentOrParentChainScope.setDecorationType(this.bandScrollablePanel,
                DecorationAreaType.CONTROL_PANE);
    }

    @Override
    protected TaskToggleButtonsHostPanel createTaskToggleButtonsHostPanel() {
        return new RadianceTaskToggleButtonsHostPanel();
    }

    @Override
    protected void paintBackground(Graphics g) {
        BackgroundPaintingUtils.update(g, this.ribbon, false);
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceColorScheme compScheme = RadianceColorSchemeUtilities.getColorScheme(
                this.ribbon, ColorSchemeAssociationKind.SEPARATOR, ComponentState.ENABLED);
        g2d.setColor(compScheme.getSeparatorPrimaryColor());
        float separatorThickness = RadianceSizeUtils.getBorderStrokeWidth(this.ribbon);
        float separatorY = this.taskToggleButtonsScrollablePanel.getY() +
                this.taskToggleButtonsScrollablePanel.getHeight() - separatorThickness;
        g2d.setStroke(new BasicStroke(separatorThickness, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND));
        g2d.draw(new Line2D.Double(0, separatorY, this.ribbon.getWidth(), separatorY));
        g2d.dispose();
    }

    @Override
    protected int getTabButtonGap() {
        return RadianceSizeUtils.getAdjustedSize(
                RadianceSizeUtils.getComponentFontSize(this.ribbon), super.getTabButtonGap(), 3, 1,
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
            RibbonApplicationMenuCommandButtonProjection applicationMenuProjection =
                    ribbon.getApplicationMenuCommandProjection();
            if (applicationMenuProjection != null) {
                this.applicationMenuButton.setPopupRichTooltip(
                        ribbon.getApplicationMenuCommandProjection()
                                .getContentModel().getSecondaryRichTooltip());
                this.applicationMenuButton.setPopupKeyTip(
                        ribbon.getApplicationMenuCommandProjection()
                                .getPresentationModel().getPopupKeyTip());
            }
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
