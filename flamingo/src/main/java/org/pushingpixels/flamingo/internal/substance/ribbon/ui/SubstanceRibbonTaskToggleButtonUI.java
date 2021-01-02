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
package org.pushingpixels.flamingo.internal.substance.ribbon.ui;

import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.ribbon.RibbonContextualTaskGroup;
import org.pushingpixels.flamingo.internal.substance.utils.CommandButtonVisualStateTracker;
import org.pushingpixels.flamingo.internal.substance.utils.RibbonTaskToggleButtonBackgroundDelegate;
import org.pushingpixels.flamingo.internal.ui.ribbon.BasicRibbonTaskToggleButtonUI;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonTaskToggleButton;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.painter.DecorationPainterUtils;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.util.EnumSet;
import java.util.Map;

/**
 * UI for {@link JRibbonTaskToggleButton} components in <b>Substance</b> look
 * and feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceRibbonTaskToggleButtonUI extends
        BasicRibbonTaskToggleButtonUI implements TransitionAwareUI {
    /**
     * Tracker for visual state transitions.
     */
    private CommandButtonVisualStateTracker substanceVisualStateTracker;

    /**
     * Property change listener on the button.
     */
    private PropertyChangeListener substancePropertyChangeListener;

    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceRibbonTaskToggleButtonUI();
    }

    /**
     * Painting delegate.
     */
    private RibbonTaskToggleButtonBackgroundDelegate delegate;

    /**
     * Simple constructor.
     */
    private SubstanceRibbonTaskToggleButtonUI() {
        this.delegate = new RibbonTaskToggleButtonBackgroundDelegate();
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
        SubstanceCortex.ComponentOrParentChainScope.setColorizationFactor(this.commandButton,
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

        this.substanceVisualStateTracker = new CommandButtonVisualStateTracker();
        this.substanceVisualStateTracker.installListeners(this.commandButton);

        this.substancePropertyChangeListener = propertyChangeEvent -> {
            if ("contextualGroupHueColor".equals(propertyChangeEvent.getPropertyName())) {
                Color newValue = (Color) propertyChangeEvent.getNewValue();
                commandButton.setBackground(newValue);
            }
        };
        this.commandButton.addPropertyChangeListener(this.substancePropertyChangeListener);
    }

    @Override
    protected void uninstallListeners() {
        this.substanceVisualStateTracker.uninstallListeners(this.commandButton);
        this.substanceVisualStateTracker = null;

        this.commandButton
                .removePropertyChangeListener(this.substancePropertyChangeListener);
        this.substancePropertyChangeListener = null;

        super.uninstallListeners();
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        this.layoutInfo = this.layoutManager.getLayoutInfo(this.commandButton);

        this.delegate.updateTaskToggleButtonBackground(g, (JRibbonTaskToggleButton) this.commandButton);
        this.paintTextAndFocus(g);
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        NeonCortex.installDesktopHints(g2d, this.commandButton.getFont());
        this.paint(g2d, c);
        g2d.dispose();
    }

    private void paintTextAndFocus(Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        String toPaint = this.commandButton.getText();

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

        StateTransitionTracker.ModelStateInfo modelStateInfo = this.substanceVisualStateTracker
                .getActionStateTransitionTracker().getModelStateInfo();
        ComponentState currState = modelStateInfo.getCurrModelStateNoSelection();
        float buttonAlpha = SubstanceColorSchemeUtilities.getAlpha(
                this.commandButton, currState);

        Color fgColor = getForegroundColor(this.commandButton, modelStateInfo);

        if (buttonAlpha < 1.0f) {
            Color bgFillColor = SubstanceColorUtilities
                    .getBackgroundFillColor(this.commandButton);
            fgColor = SubstanceColorUtilities.getInterpolatedColor(fgColor,
                    bgFillColor, buttonAlpha);
        }

        SubstanceTextUtilities.paintText(g, textRect, toPaint, -1, this.commandButton.getFont(), fgColor, null);

        // Use foreground color for consistency - since non-active task toggle buttons use parent's
        // decoration background fill.
        float radius = RibbonTaskToggleButtonBackgroundDelegate.getTaskToggleButtonCornerRadius(
                (JRibbonTaskToggleButton) this.commandButton);
        float focusRingPadding = SubstanceSizeUtils.getFocusRingPadding(SubstanceSizeUtils
                .getComponentFontSize(this.commandButton));
        Shape contour = SubstanceOutlineUtilities.getBaseOutline(this.commandButton.getWidth(),
                this.commandButton.getHeight(), radius, EnumSet.of(SubstanceSlices.Side.BOTTOM),
                focusRingPadding);

        SubstanceCoreUtilities.paintFocus(g, this.commandButton, this.commandButton, this,
                contour, textRect, SubstanceColorUtilities.getAlphaColor(fgColor, 192), 1.0f, 0);
    }

    private static Color getForegroundColor(JCommandButton button,
            StateTransitionTracker.ModelStateInfo modelStateInfo) {
        ComponentState currStateIgnoreSelection =
                ComponentState.getState(button.getActionModel(), button, true);
        ComponentState currState = ComponentState.getState(button.getActionModel(), button, false);
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                modelStateInfo.getStateNoSelectionContributionMap();

        SubstanceColorScheme buttonFillScheme = SubstanceColorSchemeUtilities.getColorScheme(
                button, ColorSchemeAssociationKind.FILL, currStateIgnoreSelection);
        SubstanceSkin skin = SubstanceCoreUtilities.getSkin(button);
        SubstanceSlices.DecorationAreaType parentDecorationAreaType =
                SubstanceCortex.ComponentOrParentChainScope.getDecorationType(button.getParent());
        SubstanceColorScheme parentFillScheme = skin.getBackgroundColorScheme(parentDecorationAreaType);

        if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
            SubstanceColorScheme schemeForCurrState = (currState == ComponentState.ENABLED)
                    ? parentFillScheme : buttonFillScheme;
//            System.out.println("For " + button.getText() + " state is " + currState +
//                    " and scheme is " + schemeForCurrState.getDisplayName() +
//                    " -> " + schemeForCurrState.getForegroundColor());
            return schemeForCurrState.getForegroundColor();
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
            SubstanceColorScheme activeColorScheme =
                    SubstanceColorSchemeUtilities.getColorScheme(button,
                            ColorSchemeAssociationKind.FILL, activeState);
            //System.out.println("\t" + activeState + " : " + currState);
            Color activeForeground = correspondsToParentFill
                    ? parentFillScheme.getForegroundColor()
                    : activeColorScheme.getForegroundColor();

//            System.out.println("\t" + activeState + " at alpha " + alpha + " from " +
//                    (correspondsToParentFill ? parentFillScheme :
//                            activeColorScheme).getDisplayName()
//                    + "[" + correspondsToParentFill + "] contributes color " +
//                    activeForeground);
            aggrRed += alpha * activeForeground.getRed();
            aggrGreen += alpha * activeForeground.getGreen();
            aggrBlue += alpha * activeForeground.getBlue();
        }
        return new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue);
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        JCommandButton button = (JCommandButton) c;

        JButton forSizing = new JButton(button.getText(), button.getIcon());
        Dimension result = forSizing.getUI().getPreferredSize(forSizing);
        Insets borderInsets = button.getBorder().getBorderInsets(button);
        result.width += (borderInsets.left + borderInsets.right);
        result.height += (borderInsets.top + borderInsets.bottom);
        return result;
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.substanceVisualStateTracker.getActionStateTransitionTracker();
    }

    @Override
    public boolean isInside(MouseEvent me) {
        return true;
    }
}
