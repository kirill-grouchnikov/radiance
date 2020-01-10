/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.internal.substance.common.ui;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandMenuButton;
import org.pushingpixels.flamingo.api.common.RolloverActionListener;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager;
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame;
import org.pushingpixels.flamingo.internal.utils.KeyTipRenderingUtilities;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.util.EnumSet;
import java.util.Map;

/**
 * UI for {@link JCommandMenuButton} components in <b>Substance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceCommandMenuButtonUI extends SubstanceCommandButtonUI {
    /**
     * Rollover menu mouse listener.
     */
    private MouseListener rolloverMenuMouseListener;

    public static ComponentUI createUI(JComponent c) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(c);
        SubstanceCortex.ComponentScope.setButtonStraightSides(c,
                EnumSet.allOf(SubstanceSlices.Side.class));
        return new SubstanceCommandMenuButtonUI((JCommandMenuButton) c);
    }

    private SubstanceCommandMenuButtonUI(JCommandMenuButton button) {
        super(button);
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        this.rolloverMenuMouseListener = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (commandButton.isEnabled()) {
                    int modifiers = 0;
                    AWTEvent currentEvent = EventQueue.getCurrentEvent();
                    if (currentEvent instanceof InputEvent) {
                        modifiers = ((InputEvent) currentEvent).getModifiersEx();
                    } else if (currentEvent instanceof ActionEvent) {
                        modifiers = ((ActionEvent) currentEvent).getModifiers();
                    }
                    fireRolloverActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED,
                            commandButton.getActionModel().getActionCommand(),
                            EventQueue.getMostRecentEventTime(), modifiers));

                    // Ignore mouse entered event to initiate displaying the popup content
                    // if the currently displayed popup chain shows global ribbon context menu
                    // that originates from this button.
                    java.util.List<PopupPanelManager.PopupInfo> popupInfoList =
                            PopupPanelManager.defaultManager().getShownPath();
                    int popupInfoListSize = popupInfoList.size();
                    if ((popupInfoListSize >= 1) &&
                            (popupInfoList.get(popupInfoListSize - 1).getPopupPanel()
                                    instanceof JRibbonFrame.GlobalPopupMenu) &&
                            (popupInfoList.get(popupInfoListSize - 1).getPopupOriginator()
                                    == commandButton)) {
                        return;
                    }

                    processPopupAction();
                }
            }
        };
        this.commandButton.addMouseListener(this.rolloverMenuMouseListener);
    }

    @Override
    protected void uninstallListeners() {
        this.commandButton.removeMouseListener(this.rolloverMenuMouseListener);
        this.rolloverMenuMouseListener = null;

        super.uninstallListeners();
    }

    /**
     * Fires the rollover action on all registered handlers.
     *
     * @param e Event object.
     */
    public void fireRolloverActionPerformed(ActionEvent e) {
        // Guaranteed to return a non-null array
        RolloverActionListener[] listeners = commandButton
                .getListeners(RolloverActionListener.class);
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 1; i >= 0; i--) {
            (listeners[i]).actionPerformed(e);
        }
    }

    @Override
    public void update(Graphics g, JComponent c) {
        super.update(g, c);

        JCommandMenuButton menuButton = (JCommandMenuButton) c;
        KeyTipRenderingUtilities.renderButtonKeyTips(g, menuButton, layoutManager);
    }

    @Override
    protected void paintButtonIcon(Graphics g, Rectangle iconRect) {
        boolean isSelected = this.commandButton.getActionModel().isSelected();
        if (isSelected) {
            Graphics2D g2d = (Graphics2D) g.create();
            float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth();
            Rectangle2D.Float extended = new Rectangle2D.Float(iconRect.x - borderDelta / 2.0f,
                    iconRect.y - borderDelta / 2.0f, iconRect.width + borderDelta,
                    iconRect.height + borderDelta);

            ComponentState currState = this.commandButton.getActionModel().isEnabled()
                    ? ComponentState.SELECTED
                    : ComponentState.DISABLED_SELECTED;

            SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities.getColorScheme(
                    this.commandButton, SubstanceSlices.ColorSchemeAssociationKind.HIGHLIGHT, currState);
            SubstanceFillPainter fillPainter = SubstanceCoreUtilities
                    .getFillPainter(this.commandButton);
            fillPainter.paintContourBackground(g2d, this.commandButton,
                    extended.x + extended.width, extended.y + extended.height,
                    extended, false, fillScheme, false);

            SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities.getColorScheme(
                    this.commandButton, SubstanceSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER, currState);
            SubstanceBorderPainter borderPainter = SubstanceCoreUtilities
                    .getBorderPainter(this.commandButton);
            borderPainter.paintBorder(g2d, this.commandButton,
                    extended.x + extended.width, extended.y + extended.height,
                    extended, null, borderScheme);

            g2d.dispose();
        }
        super.paintButtonIcon(g, iconRect);
        // does it actually have an icon?
        Icon iconToPaint = this.getIconToPaint();
        if (isSelected && (iconToPaint == null)) {
            // draw a checkmark
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            ComponentState currState = this.commandButton.getActionModel().isEnabled()
                    ? ComponentState.SELECTED
                    : ComponentState.DISABLED_SELECTED;
            SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities.getColorScheme(
                    this.commandButton, SubstanceSlices.ColorSchemeAssociationKind.HIGHLIGHT, currState);
            g2d.setColor(fillScheme.getForegroundColor());

            int iw = iconRect.width;
            int ih = iconRect.height;
            GeneralPath path = new GeneralPath();

            path.moveTo(0.2f * iw, 0.5f * ih);
            path.lineTo(0.42f * iw, 0.8f * ih);
            path.lineTo(0.8f * iw, 0.2f * ih);
            g2d.translate(iconRect.x, iconRect.y);
            Stroke stroke = new BasicStroke((float) 0.12 * iw, BasicStroke.CAP_ROUND,
                    BasicStroke.JOIN_ROUND);
            g2d.setStroke(stroke);
            g2d.draw(path);

            g2d.dispose();
        }
    }

    @Override
    protected boolean isPaintingBackground() {
        boolean isActionRollover = this.commandButton.getActionModel().isRollover();

        if (isActionRollover || !this.commandButton.isFlat()) {
            return true;
        }

        return (this.getActionTransitionTracker()
                .getFacetStrength(SubstanceSlices.ComponentStateFacet.ROLLOVER) > 0.0f);
    }

    @Override
    protected Color getForegroundColor(StateTransitionTracker.ModelStateInfo modelStateInfo) {
        Color fgColor = this.commandButton.getForeground();
        if (fgColor instanceof UIResource) {
            float buttonAlpha = SubstanceColorSchemeUtilities.getAlpha(this.commandButton,
                    modelStateInfo.getCurrModelState());

            fgColor = getMenuButtonForegroundColor(this.commandButton, modelStateInfo);

            if (buttonAlpha < 1.0f) {
                Color bgFillColor = SubstanceColorUtilities
                        .getBackgroundFillColor(this.commandButton);
                fgColor = SubstanceColorUtilities.getInterpolatedColor(fgColor, bgFillColor,
                        buttonAlpha);
            }
        }
        return fgColor;
    }

    private static Color getMenuButtonForegroundColor(AbstractCommandButton menuButton,
            StateTransitionTracker.ModelStateInfo modelStateInfo) {
        ComponentState currState = modelStateInfo.getCurrModelStateNoSelection();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateNoSelectionContributionMap();

        SubstanceSlices.ColorSchemeAssociationKind currAssocKind = SubstanceSlices.ColorSchemeAssociationKind.FILL;
        // use HIGHLIGHT on active and non-rollover menu items
        if (!currState.isDisabled() && (currState != ComponentState.ENABLED)
                && !currState.isFacetActive(SubstanceSlices.ComponentStateFacet.ROLLOVER))
            currAssocKind = SubstanceSlices.ColorSchemeAssociationKind.HIGHLIGHT;
        SubstanceColorScheme colorScheme = SubstanceColorSchemeUtilities.getColorScheme(menuButton,
                currAssocKind, currState);
        if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
            return colorScheme.getForegroundColor();
        }

        float aggrRed = 0;
        float aggrGreen = 0;
        float aggrBlue = 0;
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                .entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            float alpha = activeEntry.getValue().getContribution();
            SubstanceSlices.ColorSchemeAssociationKind assocKind = SubstanceSlices.ColorSchemeAssociationKind.FILL;
            // use HIGHLIGHT on active and non-rollover menu items
            if (!activeState.isDisabled() && (activeState != ComponentState.ENABLED)
                    && !activeState.isFacetActive(SubstanceSlices.ComponentStateFacet.ROLLOVER))
                assocKind = SubstanceSlices.ColorSchemeAssociationKind.HIGHLIGHT;
            SubstanceColorScheme activeColorScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(menuButton, assocKind, activeState);
            Color activeForeground = activeColorScheme.getForegroundColor();
            aggrRed += alpha * activeForeground.getRed();
            aggrGreen += alpha * activeForeground.getGreen();
            aggrBlue += alpha * activeForeground.getBlue();
        }
        return new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue);
    }
}
