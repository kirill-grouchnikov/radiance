/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.theming.common.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.bcb.JBreadcrumbBar;
import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager;
import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager.CommandButtonSeparatorOrientation;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.radiance.component.api.common.RolloverActionListener;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.JCommandPopupMenuPanel;
import org.pushingpixels.radiance.component.api.common.popup.PopupPanelManager;
import org.pushingpixels.radiance.component.api.ribbon.JRibbon;
import org.pushingpixels.radiance.component.api.ribbon.JRibbonFrame;
import org.pushingpixels.radiance.component.internal.theming.common.BladeTransitionAwareRadianceIcon;
import org.pushingpixels.radiance.component.internal.theming.common.GlowingRadianceIcon;
import org.pushingpixels.radiance.component.internal.theming.utils.CommandButtonBackgroundDelegate;
import org.pushingpixels.radiance.component.internal.theming.utils.CommandButtonVisualStateTracker;
import org.pushingpixels.radiance.component.internal.ui.common.BasicCommandButtonUI;
import org.pushingpixels.radiance.component.internal.utils.ComponentUtilities;
import org.pushingpixels.radiance.component.internal.utils.KeyTipRenderingUtilities;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.AnimationFacet;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ComponentStateFacet;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;
import org.pushingpixels.radiance.theming.api.shaper.RadianceButtonShaper;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker.ModelStateInfo;
import org.pushingpixels.radiance.theming.internal.blade.BladeArrowIconUtils;
import org.pushingpixels.radiance.theming.internal.painter.SeparatorPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;
import org.pushingpixels.radiance.theming.internal.widget.animation.effects.GhostPaintingUtils;
import org.pushingpixels.radiance.theming.internal.widget.animation.effects.GhostingListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.beans.PropertyChangeListener;
import java.util.Map;

/**
 * UI for command buttons {@link JCommandButton} in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceCommandButtonUI extends BasicCommandButtonUI
        implements ActionPopupTransitionAwareUI {
    /**
     * Property change listener. Listens on changes to {@link AbstractButton#MODEL_CHANGED_PROPERTY}
     * property.
     */
    private PropertyChangeListener radiancePropertyListener;

    /**
     * Model change listener for ghost image effects.
     */
    private GhostingListener radianceModelChangeListener;

    /**
     * Tracker for visual state transitions.
     */
    private CommandButtonVisualStateTracker radianceVisualStateTracker;

    private ButtonModel overallRolloverModel;

    private RolloverControlListener radianceOverallRolloverListener;

    /**
     * Rollover menu mouse listener.
     */
    private MouseListener rolloverMenuMouseListener;

    private StateTransitionTracker overallStateTransitionTracker;

    private CommandButtonBackgroundDelegate commandButtonBackgroundDelegate;

    /**
     * The matching glowing icon. Is used only when
     * {@link AnimationConfigurationManager#isAnimationAllowed(AnimationFacet, Component)} returns
     * true on {@link AnimationFacet#ICON_GLOW}.
     */
    private GlowingRadianceIcon glowingIcon;

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceCommandButtonUI((JCommandButton) comp);
    }

    /**
     * Creates a new UI delegate for command button.
     *
     * @param button command button
     */
    RadianceCommandButtonUI(JCommandButton button) {
        super();

        this.overallRolloverModel = new DefaultButtonModel();
        this.overallRolloverModel.setArmed(false);
        this.overallRolloverModel.setSelected(false);
        this.overallRolloverModel.setPressed(false);
        this.overallRolloverModel.setRollover(false);
        this.overallRolloverModel.setEnabled(button.isEnabled());

        this.overallStateTransitionTracker = new StateTransitionTracker(button,
                this.overallRolloverModel);

        this.radianceVisualStateTracker = new CommandButtonVisualStateTracker();
        this.commandButtonBackgroundDelegate = new CommandButtonBackgroundDelegate();
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        RadianceThemingCortex.ComponentScope.setButtonShaper(this.commandButton,
                ClassicButtonShaper.INSTANCE);

        this.commandButton.setOpaque(false);
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        this.radianceVisualStateTracker.installListeners(this.commandButton);

        this.radiancePropertyListener = propertyChangeEvent -> {
            if ("actionModel".equals(propertyChangeEvent.getPropertyName())) {
                if (radianceModelChangeListener != null)
                    radianceModelChangeListener.unregisterListeners();
                radianceModelChangeListener = new GhostingListener(commandButton,
                        commandButton.getActionModel());
                radianceModelChangeListener.registerListeners();
            }
            if ("icon".equals(propertyChangeEvent.getPropertyName())) {
                trackGlowingIcon();
            }
        };
        this.commandButton.addPropertyChangeListener(this.radiancePropertyListener);

        this.radianceModelChangeListener = new GhostingListener(this.commandButton,
                this.commandButton.getActionModel());
        this.radianceModelChangeListener.registerListeners();

        this.radianceOverallRolloverListener = new RolloverControlListener(this,
                this.overallRolloverModel);
        this.commandButton.addMouseListener(this.radianceOverallRolloverListener);
        this.commandButton.addMouseMotionListener(this.radianceOverallRolloverListener);

        this.overallStateTransitionTracker.registerModelListeners();

        this.rolloverMenuMouseListener = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (commandButton.isEnabled() &&
                        (commandButton.getProjection().getPresentationModel().getPopupFireTrigger() ==
                                CommandButtonPresentationModel.PopupFireTrigger.ON_ROLLOVER)) {
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
                                    instanceof JRibbonFrame.GlobalPopupMenuPanel) &&
                            (popupInfoList.get(popupInfoListSize - 1).getPopupOriginator()
                                    == commandButton)) {
                        return;
                    }

                    processPopupAction();
                }
            }
        };
        this.commandButton.addMouseListener(this.rolloverMenuMouseListener);

        this.trackGlowingIcon();
    }

    @Override
    protected void uninstallListeners() {
        this.radianceVisualStateTracker.uninstallListeners(this.commandButton);
        this.radianceVisualStateTracker = null;

        this.commandButton.removePropertyChangeListener(this.radiancePropertyListener);
        this.radiancePropertyListener = null;

        this.radianceModelChangeListener.unregisterListeners();
        this.radianceModelChangeListener = null;

        this.commandButton.removeMouseListener(this.radianceOverallRolloverListener);
        this.commandButton.removeMouseMotionListener(this.radianceOverallRolloverListener);
        this.radianceOverallRolloverListener = null;

        this.overallStateTransitionTracker.unregisterModelListeners();

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

    /**
     * Tracks possible usage of glowing icon.
     */
    private void trackGlowingIcon() {
        RadianceIcon currIcon = this.commandButton.getIcon();
        if (currIcon instanceof GlowingRadianceIcon)
            return;
        if (currIcon == null)
            return;
        boolean isPopupOnly = (this.commandButton.getCommandButtonKind() ==
                JCommandButton.CommandButtonKind.POPUP_ONLY);
        StateTransitionTracker tracker = isPopupOnly
                ? this.radianceVisualStateTracker.getPopupStateTransitionTracker()
                : this.radianceVisualStateTracker.getActionStateTransitionTracker();
        this.glowingIcon = new GlowingRadianceIcon(currIcon, tracker.getIconGlowTracker());
    }

    private void paintButtonBackground(Graphics graphics) {
        if (RadianceCoreUtilities.isComponentNeverPainted(this.commandButton)) {
            return;
        }

        Rectangle actionArea = this.getLayoutInfo().actionClickArea;
        Rectangle popupArea = this.getLayoutInfo().popupClickArea;

        Graphics2D g2d = (Graphics2D) graphics.create();
        this.commandButtonBackgroundDelegate.updateBackground(g2d, this.commandButton,
                getActionTransitionTracker(), actionArea,
                getPopupTransitionTracker(), popupArea);
        g2d.dispose();
    }

    private void paintButtonIconRegular(Graphics g, Rectangle iconRect, Color textColor) {
        Icon icon = this.commandButton.getIcon();
        if ((iconRect == null) || (icon == null) || (iconRect.width == 0)
                || (iconRect.height == 0)) {
            return;
        }

        Graphics2D g2d = (Graphics2D) g.create();

        GhostPaintingUtils.paintGhostIcon(g2d, this.commandButton, icon, iconRect);
        g2d.setComposite(WidgetUtilities.getAlphaComposite(this.commandButton, g));

        StateTransitionTracker tracker = this.radianceVisualStateTracker
                .getActionStateTransitionTracker();
        ButtonModel model = commandButton.getActionModel();
        if (this.commandButton.getCommandButtonKind() == CommandButtonKind.POPUP_ONLY) {
            tracker = this.radianceVisualStateTracker.getPopupStateTransitionTracker();
            model = this.commandButton.getPopupModel();
        }
        this.commandButtonBackgroundDelegate.paintCommandButtonIcon(g2d, iconRect,
                this.commandButton, icon, this.glowingIcon, model, tracker, textColor);
        g2d.dispose();
    }

    protected void paintButtonIcon(Graphics g, Rectangle iconRect, Color textColor) {
        boolean isSelectedMenu = this.commandButton.getActionModel().isSelected() &&
                this.commandButton.getProjection().getPresentationModel().isMenu();
        if (isSelectedMenu) {
            Graphics2D graphics = (Graphics2D) g.create();
            // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
            // to not normalize coordinates to paint at full pixels, and will result in blurry
            // outlines.
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            graphics.translate(iconRect.x, iconRect.y);
            RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, iconRect.width, iconRect.height,
                    (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                        Rectangle2D.Float extended = new Rectangle2D.Float(-1.0f, -1.0f,
                                scaledWidth + 2.0f, scaledHeight + 2.0f);

                        ComponentState currState = this.commandButton.getActionModel().isEnabled()
                                ? ComponentState.SELECTED
                                : ComponentState.DISABLED_SELECTED;

                        RadianceColorScheme fillScheme = RadianceColorSchemeUtilities.getColorScheme(
                                this.commandButton, RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, currState);
                        RadianceFillPainter fillPainter = RadianceCoreUtilities
                                .getFillPainter(this.commandButton);
                        fillPainter.paintContourBackground(graphics1X, this.commandButton,
                                extended.x + extended.width, extended.y + extended.height,
                                extended, fillScheme);

                        RadianceColorScheme borderScheme = RadianceColorSchemeUtilities.getColorScheme(
                                this.commandButton,
                                RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
                                currState);
                        RadianceBorderPainter borderPainter = RadianceCoreUtilities
                                .getBorderPainter(this.commandButton);
                        borderPainter.paintBorder(graphics1X, this.commandButton,
                                extended.x + extended.width, extended.y + extended.height,
                                extended, null, borderScheme);
                    });
            graphics.dispose();
        }
        this.paintButtonIconRegular(g, iconRect, textColor);
        // does it actually have an icon?
        Icon iconToPaint = this.commandButton.getIcon();
        if (isSelectedMenu && (iconToPaint == null)) {
            // draw a checkmark
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            ComponentState currState = this.commandButton.getActionModel().isEnabled()
                    ? ComponentState.SELECTED
                    : ComponentState.DISABLED_SELECTED;
            RadianceColorScheme fillScheme = RadianceColorSchemeUtilities.getColorScheme(
                    this.commandButton, RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, currState);
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

    private void paintButtonHorizontalSeparator(Graphics graphics, Rectangle separatorArea) {
        Graphics2D g2d = (Graphics2D) graphics.create();
        g2d.translate(0, separatorArea.y);

        RadianceColorScheme colorScheme = RadianceColorSchemeUtilities.getColorScheme(
                this.commandButton, ColorSchemeAssociationKind.SEPARATOR,
                ComponentState.getState(this.commandButton.getActionModel(), this.commandButton));

        float fadeAlpha = this.getSeparatorAlpha();
        g2d.setComposite(AlphaComposite.SrcOver.derive(fadeAlpha));

        SeparatorPainterUtils.paintSeparator(this.commandButton, g2d, colorScheme,
                this.commandButton.getWidth(), 1, JSlider.HORIZONTAL, true, 4, 4, true);

        g2d.dispose();
    }

    private void paintButtonVerticalSeparator(Graphics graphics, Rectangle separatorArea) {
        Graphics2D g2d = (Graphics2D) graphics.create();
        g2d.translate(separatorArea.x, 0);

        RadianceColorScheme colorScheme = RadianceColorSchemeUtilities.getColorScheme(
                this.commandButton, ColorSchemeAssociationKind.SEPARATOR,
                ComponentState.getState(this.commandButton.getActionModel(), this.commandButton));

        float fadeAlpha = this.getSeparatorAlpha();
        g2d.setComposite(AlphaComposite.SrcOver.derive(fadeAlpha));

        SeparatorPainterUtils.paintSeparator(this.commandButton, g2d, colorScheme, 1,
                this.commandButton.getHeight(), JSlider.VERTICAL, true, 4, 4, true);

        g2d.dispose();
    }

    @Override
    protected boolean isPaintingBackground() {
        if (this.commandButton.getProjection().getPresentationModel().isMenu() &&
                (this.commandButton.getActionModel().isRollover() ||
                        (this.commandButton.getBackgroundAppearanceStrategy() != RadianceThemingSlices.BackgroundAppearanceStrategy.NEVER))) {
            return true;
        }

        if (super.isPaintingBackground()) {
            return true;
        }
        return this.commandButton.hasFocus() || (this.overallStateTransitionTracker
                .getFacetStrength(ComponentStateFacet.ROLLOVER) > 0.0f);
    }

    @Override
    protected boolean isPaintingSeparators() {
        if (super.isPaintingSeparators()) {
            return true;
        }
        boolean hasIcon = (this.commandButton.getIcon() != null);
        return this.commandButton.hasFocus() || (hasIcon && (this.overallStateTransitionTracker
                .getFacetStrength(ComponentStateFacet.ROLLOVER) > 0.0f));
    }

    @Override
    protected RadianceIcon createPopupActionIcon() {
        final int fontSize = RadianceSizeUtils.getComponentFontSize(this.commandButton);
        int arrowIconHeight = (int) RadianceSizeUtils.getArrowIconHeight(fontSize);
        int arrowIconWidth = (int) RadianceSizeUtils.getArrowIconWidth(fontSize);
        return new BladeTransitionAwareRadianceIcon(this.commandButton,
                this::getPopupTransitionTracker,
                (g, scheme, width, height) -> {
                    RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy =
                            commandButton.getPopupPlacementStrategy();
                    int direction =
                            (popupPlacementStrategy instanceof RadianceThemingSlices.PopupPlacementStrategy.Downward)
                                    ? SwingConstants.SOUTH
                                    : (commandButton.getComponentOrientation().isLeftToRight()
                                    ? SwingConstants.EAST : SwingConstants.WEST);
                    BladeArrowIconUtils.drawArrow(g, width, height,
                            RadianceSizeUtils.getArrowStrokeWidth(fontSize) - 0.5f,
                            direction, scheme);
                }, new Dimension(arrowIconWidth, arrowIconHeight));
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setFont(this.commandButton.getFont());

        this.layoutInfo = this.layoutManager.getLayoutInfo(this.commandButton);
        commandButton.putClientProperty("icon.bounds", layoutInfo.iconRect);

        if (this.isPaintingBackground()) {
            this.paintButtonBackground(g2d);
        }

//        g2d.setColor(new Color(255, 255, 220));
//        g2d.fill(layoutInfo.actionClickArea);
//        g2d.setColor(new Color(255, 220, 220));
//        g2d.fill(layoutInfo.popupClickArea);

        // decide which command button model should be used to
        // compute the foreground color of the command button's text
        boolean useActionAreaForFg = layoutInfo.isTextInActionArea;
        StateTransitionTracker transitionTrackerForFg = useActionAreaForFg
                ? this.getActionTransitionTracker()
                : this.getPopupTransitionTracker();
        ModelStateInfo modelStateInfoForFg = transitionTrackerForFg.getModelStateInfo();
        ComponentState currStateForFg = modelStateInfoForFg.getCurrModelState();
        Color fgColor = getForegroundColor(modelStateInfoForFg);

        if (layoutInfo.textLayoutInfoList != null) {
            for (CommandButtonLayoutManager.TextLayoutInfo mainTextLayoutInfo :
                    layoutInfo.textLayoutInfoList) {
                if (mainTextLayoutInfo.text != null) {
                    RadianceTextUtilities.paintText(g2d, mainTextLayoutInfo.textRect,
                            mainTextLayoutInfo.text, -1, g2d.getFont(), fgColor,
                            g2d.getClipBounds());
                }
            }
        }

        if (layoutInfo.extraTextLayoutInfoList != null) {
            RadianceColorScheme disabledColorScheme = RadianceColorSchemeUtilities.getColorScheme(
                    this.commandButton, ComponentState.DISABLED_UNSELECTED);
            Color disabledFgColor = disabledColorScheme.getForegroundColor();
            float buttonAlpha = RadianceColorSchemeUtilities.getAlpha(this.commandButton,
                    ComponentState.DISABLED_UNSELECTED);
            if (buttonAlpha < 1.0f) {
                Color bgFillColor = RadianceColorUtilities.getBackgroundFillColor(
                        this.commandButton);
                disabledFgColor = RadianceColorUtilities.getInterpolatedColor(disabledFgColor,
                        bgFillColor, buttonAlpha);
            }
            if (currStateForFg.isDisabled()) {
                disabledFgColor = RadianceColorUtilities.getInterpolatedColor(disabledFgColor,
                        RadianceColorUtilities.getBackgroundFillColor(c), 0.5f);
            }
            disabledFgColor = RadianceColorUtilities.getInterpolatedColor(disabledFgColor,
                    fgColor, 0.5);
            for (CommandButtonLayoutManager.TextLayoutInfo extraTextLayoutInfo :
                    layoutInfo.extraTextLayoutInfoList) {
                if (extraTextLayoutInfo.text != null) {
                    RadianceTextUtilities.paintText(g2d, extraTextLayoutInfo.textRect,
                            extraTextLayoutInfo.text, -1, g2d.getFont(), disabledFgColor,
                            g2d.getClipBounds());
                }
            }
        }

        if (layoutInfo.iconRect != null) {
            // Important - have the icon follow the foreground color of the action area
            // if it is configured with RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT
            this.paintButtonIcon(g2d, layoutInfo.iconRect,
                    getForegroundColor(this.getActionTransitionTracker().getModelStateInfo()));
        }
        if (layoutInfo.popupActionRect.getWidth() > 0) {
            paintPopupActionIcon(g2d, layoutInfo.popupActionRect);
        }

        if (this.isPaintingSeparators() && (layoutInfo.separatorArea != null)) {
            if (layoutInfo.separatorOrientation == CommandButtonSeparatorOrientation.HORIZONTAL) {
                this.paintButtonHorizontalSeparator(g2d, layoutInfo.separatorArea);
            } else {
                this.paintButtonVerticalSeparator(g2d, layoutInfo.separatorArea);
            }
        }

        Graphics2D focusGraphics = (Graphics2D) g2d.create();

        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        focusGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(focusGraphics, 0, 0,
                this.commandButton.getWidth(), this.commandButton.getHeight(),
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    float focusRingPadding = (float) scaleFactor *
                            RadianceSizeUtils.getFocusRingPadding(this.commandButton,
                                    RadianceSizeUtils.getComponentFontSize(this.commandButton));
                    Rectangle innerFocusArea = this.isInnerFocusOnAction ? layoutInfo.actionClickArea
                            : layoutInfo.popupClickArea;
                    Shape insetFocusArea = new Rectangle2D.Float(
                            (float) scaleFactor * innerFocusArea.x + focusRingPadding,
                            (float) scaleFactor * innerFocusArea.y + focusRingPadding,
                            (float) scaleFactor * innerFocusArea.width - 2 * focusRingPadding,
                            (float) scaleFactor * innerFocusArea.height - 2 * focusRingPadding);
                    RadianceCoreUtilities.paintFocus(graphics1X,
                            this.commandButton, this.commandButton,
                            this, scaleFactor, insetFocusArea, innerFocusArea, 1.0f, 0);
                });

        g2d.dispose();


//        g2d.setColor(Color.red);
//        g2d.draw(layoutInfo.iconRect);
//        g2d.setColor(Color.blue);
//        if (layoutInfo.textLayoutInfoList != null) {
//            for (CommandButtonLayoutManager.TextLayoutInfo mainTextLayoutInfo :
//                    layoutInfo.textLayoutInfoList) {
//                if (mainTextLayoutInfo.text != null) {
//                    g2d.draw(mainTextLayoutInfo.textRect);
//                }
//            }
//        }
//        g2d.setColor(Color.magenta);
//        if (layoutInfo.extraTextLayoutInfoList != null) {
//            for (CommandButtonLayoutManager.TextLayoutInfo extraTextLayoutInfo :
//                    layoutInfo.extraTextLayoutInfoList) {
//                if (extraTextLayoutInfo.text != null) {
//                    g2d.draw(extraTextLayoutInfo.textRect);
//                }
//            }
//        }
//        g2d.setColor(Color.green);
//        g2d.draw(layoutInfo.popupActionRect);

        g2d.dispose();
    }

    protected Color getForegroundColor(ModelStateInfo modelStateInfo) {
        Color fgColor = this.commandButton.getForeground();
        if (fgColor instanceof UIResource) {
            float buttonAlpha = RadianceColorSchemeUtilities.getAlpha(this.commandButton,
                    modelStateInfo.getCurrModelState());

            if (this.commandButton.getProjection().getPresentationModel().isMenu()) {
                fgColor = getMenuButtonForegroundColor(this.commandButton, modelStateInfo);

                if (buttonAlpha < 1.0f) {
                    Color bgFillColor = RadianceColorUtilities
                            .getBackgroundFillColor(this.commandButton);
                    fgColor = RadianceColorUtilities.getInterpolatedColor(fgColor, bgFillColor,
                            buttonAlpha);
                }
            } else {
                fgColor = RadianceTextUtilities.getForegroundColor(this.commandButton,
                        this.commandButton.getText(), modelStateInfo, buttonAlpha);
            }
        }
        return fgColor;
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, this.commandButton.getFont());
        this.paint(g2d, c);

        if (this.commandButton.getProjection().getPresentationModel().isMenu()) {
            KeyTipRenderingUtilities.renderButtonKeyTips(g, this.commandButton, layoutManager);
        }

        g2d.dispose();
    }

    private void paintPopupActionIcon(Graphics g, Rectangle popupActionRect) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        popupActionIcon.paintIcon(this.commandButton, g2d,
                popupActionRect.x + (popupActionRect.width - popupActionIcon.getIconWidth()) / 2,
                popupActionRect.y + (popupActionRect.height - popupActionIcon.getIconHeight()) / 2);
        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        JCommandButton button = (JCommandButton) c;
        RadianceButtonShaper shaper = RadianceCoreUtilities.getButtonShaper(button);

        Dimension superPref = super.getPreferredSize(button);
        if (superPref == null)
            return null;

        if (shaper == null)
            return superPref;

        // Do not enforce min size on buttons in the ribbon
        // Additional fix - buttons with popup action should
        // not have min size enforced as well
        // Additional fix - buttons in popup menus and breadcrumb bars should
        // not have min size enforced
        if ((button.getPresentationState() == CommandButtonPresentationState.MEDIUM)
                && (SwingUtilities.getAncestorOfClass(JRibbon.class, button) == null)
                && (SwingUtilities.getAncestorOfClass(JBreadcrumbBar.class, button) == null)
                && (SwingUtilities.getAncestorOfClass(JCommandPopupMenuPanel.class, button) == null)) {
            JButton forSizing = new JButton(button.getText(), button.getIcon());
            Dimension result = shaper.getPreferredSize(forSizing, superPref);
            if (ComponentUtilities.hasPopupAction(button)) {
                result.width = superPref.width;
            }
            return result;
        }
        return superPref;
    }

    /**
     * Computes the alpha value for painting the separators.
     *
     * @return Alpha value for painting the separators.
     */
    private float getSeparatorAlpha() {
        ComponentState actionAreaState = this.getActionTransitionTracker().getModelStateInfo()
                .getCurrModelState();

        if (!actionAreaState.isFacetActive(ComponentStateFacet.SELECTION)
                && !actionAreaState.isDisabled()) {
            float actionRolloverCycle = this.getActionTransitionTracker()
                    .getFacetStrength(ComponentStateFacet.ROLLOVER);
            float popupRolloverCycle = this.getPopupTransitionTracker()
                    .getFacetStrength(ComponentStateFacet.ROLLOVER);
            return Math.min(1.0f, actionRolloverCycle + popupRolloverCycle);
        }
        return 1.0f;
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.overallStateTransitionTracker;
    }

    @Override
    public boolean isInside(MouseEvent me) {
        boolean inAction = (this.layoutInfo.actionClickArea != null)
                && this.layoutInfo.actionClickArea.contains(me.getPoint());
        boolean inPopup = (this.layoutInfo.popupClickArea != null)
                && this.layoutInfo.popupClickArea.contains(me.getPoint());
        return inAction || inPopup;
    }

    @Override
    public StateTransitionTracker getActionTransitionTracker() {
        return this.radianceVisualStateTracker.getActionStateTransitionTracker();
    }

    @Override
    public StateTransitionTracker getPopupTransitionTracker() {
        return this.radianceVisualStateTracker.getPopupStateTransitionTracker();
    }


    private static Color getMenuButtonForegroundColor(JCommandButton menuButton,
            StateTransitionTracker.ModelStateInfo modelStateInfo) {
        ComponentState currState = modelStateInfo.getCurrModelStateNoSelection();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateNoSelectionContributionMap();

        RadianceThemingSlices.ColorSchemeAssociationKind currAssocKind = RadianceThemingSlices.ColorSchemeAssociationKind.FILL;
        // use HIGHLIGHT on active and non-rollover menu items
        if (currState.isActive()
                && !currState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER))
            currAssocKind = RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT;
        RadianceColorScheme colorScheme = RadianceColorSchemeUtilities.getColorScheme(menuButton,
                currAssocKind, currState);
        if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
            return colorScheme.getForegroundColor();
        }

        float aggrRed = 0;
        float aggrGreen = 0;
        float aggrBlue = 0;
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            float alpha = activeEntry.getValue().getContribution();
            RadianceThemingSlices.ColorSchemeAssociationKind assocKind = RadianceThemingSlices.ColorSchemeAssociationKind.FILL;
            // use HIGHLIGHT on active and non-rollover menu items
            if (activeState.isActive()
                    && !activeState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER))
                assocKind = RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT;
            RadianceColorScheme activeColorScheme = RadianceColorSchemeUtilities
                    .getColorScheme(menuButton, assocKind, activeState);
            Color activeForeground = activeColorScheme.getForegroundColor();
            aggrRed += alpha * activeForeground.getRed();
            aggrGreen += alpha * activeForeground.getGreen();
            aggrBlue += alpha * activeForeground.getBlue();
        }
        return new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue);
    }
}
