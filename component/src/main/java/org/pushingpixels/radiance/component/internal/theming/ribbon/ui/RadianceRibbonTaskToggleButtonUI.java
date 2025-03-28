/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.theming.ribbon.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.ribbon.RibbonContextualTaskGroup;
import org.pushingpixels.radiance.component.internal.theming.utils.CommandButtonVisualStateTracker;
import org.pushingpixels.radiance.component.internal.theming.utils.RibbonTaskToggleButtonTonalBackgroundDelegate;
import org.pushingpixels.radiance.component.internal.ui.ribbon.BasicRibbonTaskToggleButtonUI;
import org.pushingpixels.radiance.component.internal.ui.ribbon.JRibbonTaskToggleButton;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.util.EnumSet;
import java.util.Map;

/**
 * UI for {@link JRibbonTaskToggleButton} components in <b>Radiance</b> look
 * and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceRibbonTaskToggleButtonUI extends
        BasicRibbonTaskToggleButtonUI implements TransitionAwareUI {
    /**
     * Tracker for visual state transitions.
     */
    private CommandButtonVisualStateTracker radianceVisualStateTracker;

    /**
     * Property change listener on the button.
     */
    private PropertyChangeListener radiancePropertyChangeListener;

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceRibbonTaskToggleButtonUI();
    }

    /**
     * Painting delegate.
     */
    private RibbonTaskToggleButtonTonalBackgroundDelegate tonalDelegate;

    /**
     * Simple constructor.
     */
    private RadianceRibbonTaskToggleButtonUI() {
        this.tonalDelegate = new RibbonTaskToggleButtonTonalBackgroundDelegate();
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        this.commandButton.setOpaque(false);
        this.commandButton.setBorder(new Border() {
            public Insets getBorderInsets(Component c) {
                return new Insets(0, 12, 0, 12);
            }

            public boolean isBorderOpaque() {
                return false;
            }

            public void paintBorder(Component c, Graphics g, int x, int y,
                    int width, int height) {
            }
        });
        ComponentOrParentChainScope.setDecorationType(this.commandButton,
                DecorationAreaType.CONTROL_PANE);
        RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(this.commandButton,
                RibbonContextualTaskGroup.HUE_ALPHA);
    }

    @Override
    protected void uninstallDefaults() {
        DecorationPainterUtils.clearDecorationType(this.commandButton);
        super.uninstallDefaults();
    }

    @Override
    protected void uninstallComponents() {
        DecorationPainterUtils.clearDecorationType(this.commandButton);
        super.uninstallDefaults();
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        this.radianceVisualStateTracker = new CommandButtonVisualStateTracker();
        this.radianceVisualStateTracker.installListeners(this.commandButton);

        this.radiancePropertyChangeListener = propertyChangeEvent -> {
            if ("contextualGroupHueColor".equals(propertyChangeEvent.getPropertyName())) {
                Color newValue = (Color) propertyChangeEvent.getNewValue();
                commandButton.setBackground(newValue);
            }
        };
        this.commandButton.addPropertyChangeListener(this.radiancePropertyChangeListener);
    }

    @Override
    protected void uninstallListeners() {
        this.radianceVisualStateTracker.uninstallListeners(this.commandButton);
        this.radianceVisualStateTracker = null;

        this.commandButton
                .removePropertyChangeListener(this.radiancePropertyChangeListener);
        this.radiancePropertyChangeListener = null;

        super.uninstallListeners();
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        this.layoutInfo = this.layoutManager.getLayoutInfo(this.commandButton);

        Graphics2D g2d = (Graphics2D) g.create();
        this.tonalDelegate.updateTaskToggleButtonBackground(g2d,
            (JRibbonTaskToggleButton) this.commandButton);
        this.paintTextAndFocus(g2d);
        g2d.dispose();
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, this.commandButton.getFont());
        this.paint(g2d, c);
        g2d.dispose();
    }

    private void paintTextAndFocus(Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        String toPaint = this.text;

        // compute the insets
        int fullInsets = this.commandButton.getInsets().left;
        int pw = this.getPreferredSize(this.commandButton).width;
        int mw = this.getMinimumSize(this.commandButton).width;
        int w = this.commandButton.getWidth();
        int h = this.commandButton.getHeight();
        int insets = fullInsets - (pw - w) * (fullInsets - 2) / (pw - mw);

        // and the text rectangle
        Rectangle textRect = new Rectangle(insets,
                1 + (h - fm.getHeight()) / 2, w - 2 * insets, fm.getHeight());

        // show the first characters that fit into the available text rectangle
        while (true) {
            if (toPaint.length() == 0)
                break;
            int strWidth = fm.stringWidth(toPaint);
            if (strWidth <= textRect.width)
                break;
            toPaint = toPaint.substring(0, toPaint.length() - 1);
        }

        int finalStrWidth = fm.stringWidth(toPaint);
        if (finalStrWidth < textRect.width) {
            int delta = textRect.width - finalStrWidth;
            textRect.x += delta / 2;
            textRect.width -= delta;
        }

        StateTransitionTracker.ModelStateInfo modelStateInfo = this.radianceVisualStateTracker
                .getActionStateTransitionTracker().getModelStateInfo();
        ComponentState currState = modelStateInfo.getCurrModelStateNoSelection();

        Color fgColor = getTonalForegroundColor(this.commandButton, modelStateInfo);
        if (currState.isDisabled()) {
            float alpha = CoreColorTokenUtils.getContainerTokens(
                    this.commandButton, currState, CoreColorTokenUtils.ContainerType.NEUTRAL)
                .getOnContainerDisabledAlpha();
            fgColor = RadianceColorUtilities.getAlphaColor(fgColor,
                (int) (fgColor.getAlpha() * alpha));
        }

        RadianceTextUtilities.paintText(g, textRect, toPaint, -1, this.commandButton.getFont(), fgColor, null);

        Color focusColor = RadianceColorUtilities.getAlphaColor(fgColor, 192);
        Graphics2D g2d = (Graphics2D) g.create();

        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(g2d, 0, 0,
                this.commandButton.getWidth(), this.commandButton.getWidth(),
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    // Use foreground color for consistency - since non-active task toggle buttons use parent's
                    // decoration background fill.
                    float radius = (float) scaleFactor * RibbonTaskToggleButtonTonalBackgroundDelegate.getTaskToggleButtonCornerRadius(
                            (JRibbonTaskToggleButton) this.commandButton);
                    float focusRingPadding = (float) scaleFactor * RadianceSizeUtils.getFocusRingPadding(this.commandButton,
                            RadianceSizeUtils.getComponentFontSize(this.commandButton));
                    Shape contour = RadianceOutlineUtilities.getBaseOutline(
                            this.commandButton.getComponentOrientation(),
                            scaledWidth, scaledHeight,
                            radius, EnumSet.of(RadianceThemingSlices.Side.BOTTOM),
                            focusRingPadding);

                    RadianceCoreUtilities.paintFocus(graphics1X,
                            this.commandButton, this.commandButton, this,
                            scaleFactor, contour, textRect, focusColor, 1.0f, 0);
                }
        );

        g2d.dispose();
    }

    private static Color getTonalForegroundColor(JCommandButton button,
        StateTransitionTracker.ModelStateInfo modelStateInfo) {
        ComponentState currStateIgnoreSelection =
            ComponentState.getState(button.getActionModel(), button, true);
        ComponentState currState = ComponentState.getState(button.getActionModel(), button, false);
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
            modelStateInfo.getStateNoSelectionContributionMap();

        ContainerColorTokens tokens = CoreColorTokenUtils.getContainerTokens(
            button, currStateIgnoreSelection, CoreColorTokenUtils.ContainerType.MUTED);
        RadianceSkin skin = RadianceCoreUtilities.getSkin(button);
        RadianceThemingSlices.DecorationAreaType parentDecorationAreaType =
            RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(button.getParent());
        ContainerColorTokens parentTokens =
            skin.getBackgroundContainerTokens(parentDecorationAreaType);

        if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
            ContainerColorTokens tokensForCurrState = (currState == ComponentState.ENABLED)
                ? parentTokens : tokens;
//            System.out.println("For " + button.getText() + " state is " + currState +
//                    " and scheme is " + schemeForCurrState.getDisplayName() +
//                    " -> " + schemeForCurrState.getForegroundColor());
            return tokensForCurrState.getOnContainer();
        }

        float aggrRed = 0;
        float aggrGreen = 0;
        float aggrBlue = 0;
//        System.out.println(
//                "For " + button.getText() + " in " + currState + ":" + currStateIgnoreSelection);
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
            activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            float alpha = activeEntry.getValue().getContribution();

            boolean correspondsToParentFill = (activeState == ComponentState.ENABLED) &&
                !button.getActionModel().isSelected();
            ContainerColorTokens activeTokens =
                CoreColorTokenUtils.getContainerTokens(button,
                    activeState, CoreColorTokenUtils.ContainerType.MUTED);
            //System.out.println("\t" + activeState + " : " + currState);
            Color activeForeground = correspondsToParentFill
                ? parentTokens.getOnContainer()
                : activeTokens.getOnContainer();

            aggrRed += alpha * activeForeground.getRed();
            aggrGreen += alpha * activeForeground.getGreen();
            aggrBlue += alpha * activeForeground.getBlue();
        }
        return new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue);
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        JButton forSizing = new JButton(this.text, this.icon);
        Dimension result = forSizing.getUI().getPreferredSize(forSizing);
        Insets borderInsets = this.commandButton.getBorder().getBorderInsets(this.commandButton);
        result.width += (borderInsets.left + borderInsets.right);
        result.height += (borderInsets.top + borderInsets.bottom);
        return result;
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.radianceVisualStateTracker.getActionStateTransitionTracker();
    }

    @Override
    public boolean isInside(MouseEvent me) {
        return true;
    }
}
