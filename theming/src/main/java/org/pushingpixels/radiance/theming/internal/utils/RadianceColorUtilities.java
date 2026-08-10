/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.internal.animation.ModificationAwareUI;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.UIResource;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.util.Map;

/**
 * Various color-related utilities. This class is <b>for internal use only</b>.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceColorUtilities {
    /**
     * Interpolates color.
     *
     * @param color1         The first color
     * @param color2         The second color
     * @param color1Likeness The closer this value is to 0.0, the closer the resulting
     *                       color will be to <code>color2</code>.
     * @return Interpolated RGB value.
     */
    public static int getInterpolatedRGB(Color color1, Color color2,
            double color1Likeness) {
        if ((color1Likeness < 0.0) || (color1Likeness > 1.0)) {
            throw new IllegalArgumentException(
                    "Color likeness should be in 0.0-1.0 range [is "
                            + color1Likeness + "]");
        }
        int alpha1 = color1.getAlpha();
        int alpha2 = color2.getAlpha();

        int r = getInterpolatedChannelValue(color1.getRed(), color2.getRed(), color1Likeness);
        int g = getInterpolatedChannelValue(color1.getGreen(), color2.getGreen(), color1Likeness);
        int b = getInterpolatedChannelValue(color1.getBlue(), color2.getBlue(), color1Likeness);
        int a = (alpha1 == alpha2) ? alpha1 : (int) Math.round(color1Likeness * alpha1
                + (1.0 - color1Likeness) * alpha2);

        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private static int getInterpolatedChannelValue(int value1, int value2, double value1Likeness) {
        if (value1 == value2) {
            return value1;
        }
        if (value1Likeness == 1.0f) {
            return value1;
        }
        if (value1Likeness == 0.0f) {
            return value2;
        }

        // Step 1 - convert channel from electro to optical
        double optical1 = EOCF_sRGB(value1 / 255.0f);
        double optical2 = EOCF_sRGB(value2 / 255.0f);

        // Step 2 - interpolate
        double interpolatedOptical = value1Likeness * optical1 +
                (1.0f - value1Likeness) * optical2;

        // Step 3 - convert interpolated from optical to electro
        double interpolatedElectro = OECF_sRGB(interpolatedOptical);

        // Step 4 - convert to 0..255 range
        // using some interpolation values (such as 0.29 from issue 401)
        // results in an incorrect final value without Math.round.
        int result = (int) Math.round(interpolatedElectro * 255.0f);
        if (result < 0) {
            result = 0;
        }
        if (result > 255) {
            result = 255;
        }
        return result;
    }

    // Opto-electronic conversion function for the sRGB color space
    // Takes a gamma-encoded sRGB value and converts it to a linear sRGB value
    private static double OECF_sRGB(double linear) {
        // IEC 61966-2-1:1999
        return linear <= 0.0031308f ? linear * 12.92f
                : (Math.pow(linear, 1.0f / 2.4f) * 1.055f) - 0.055f;
    }

    // Electro-optical conversion function for the sRGB color space
    // Takes a linear sRGB value and converts it to a gamma-encoded sRGB value
    private static double EOCF_sRGB(double srgb) {
        // IEC 61966-2-1:1999
        return srgb <= 0.04045f ? srgb / 12.92f : Math.pow((srgb + 0.055f) / 1.055f, 2.4f);
    }

    /**
     * Interpolates color.
     *
     * @param color1         The first color
     * @param color2         The second color
     * @param color1Likeness The closer this value is to 0.0, the closer the resulting
     *                       color will be to <code>color2</code>.
     * @return Interpolated color.
     */
    public static Color getInterpolatedColor(Color color1, Color color2,
            double color1Likeness) {
        if (color1.equals(color2)) {
            return color1;
        }
        if (color1Likeness == 1.0) {
            return color1;
        }
        if (color1Likeness == 0.0) {
            return color2;
        }
        return new Color(getInterpolatedRGB(color1, color2, color1Likeness), true);
    }

    public static Color overlayColor(Color base, Color overlay) {
        float baseAlpha = base.getAlpha() / 255.0f;
        float overlayAlpha = overlay.getAlpha() / 255.0f;
        float finalAlpha = overlayAlpha + baseAlpha * (1.0f - overlayAlpha);

        if (finalAlpha == 0.0f) {
            return new Color(0, 0, 0, 0);
        }

        int baseR = base.getRed();
        int overlayR = overlay.getRed();
        int finalR = (int) ((overlayR * overlayAlpha +
                (baseR * baseAlpha) * (1.0f - overlayAlpha)) / finalAlpha);

        int baseG = base.getGreen();
        int overlayG = overlay.getGreen();
        int finalG = (int) ((overlayG * overlayAlpha +
                (baseG * baseAlpha) * (1.0f - overlayAlpha)) / finalAlpha);

        int baseB = base.getBlue();
        int overlayB = overlay.getBlue();
        int finalB = (int) ((overlayB * overlayAlpha +
                (baseB * baseAlpha) * (1.0f - overlayAlpha)) / finalAlpha);

        return new Color(finalR, finalG, finalB, (int) (255 * finalAlpha));
    }

    /**
     * Returns a translucent of the specified color.
     *
     * @param color Color.
     * @param alpha Alpha channel value.
     * @return Translucent of the specified color that matches the requested
     * alpha channel value.
     */
    public static Color getAlphaColor(Color color, int alpha) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
    }

    /**
     * Returns the foreground color of the specified color tokens.
     *
     * @param colorTokens Color tokens.
     * @return Color tokens foreground color.
     */
    public static ColorUIResource getForegroundColor(ContainerColorTokens colorTokens) {
        return new ColorUIResource(colorTokens.getOnContainer());
    }

    /**
     * Returns the brightness of the specified color.
     *
     * @param rgb RGB value of a color.
     * @return The brightness of the specified color.
     */
    public static int getColorBrightness(int rgb) {
        int oldR = (rgb >>> 16) & 0xFF;
        int oldG = (rgb >>> 8) & 0xFF;
        int oldB = (rgb >>> 0) & 0xFF;

        // See https://en.wikipedia.org/wiki/Relative_luminance
        return (2126 * oldR + 7152 * oldG + 722 * oldB) / 10000;
    }

    /**
     * Returns the color of the focus ring for the specified component.
     *
     * @param comp Component.
     * @return The color of the focus ring for the specified component.
     */
    public static Color getFocusColor(Component comp, TransitionAwareUI transitionAwareUI) {
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();

        ComponentState currState = modelStateInfo.getCurrModelState();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                modelStateInfo.getStateContributionMap();

        RadianceSkin skin = RadianceCoreUtilities.getSkin(comp);
        if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
            if (currState.isDisabled()) {
                currState = currState.getEnabledMatch();
            }
            if (currState.isActive()) {
                return skin.getActiveContainerTokens(comp, currState).getOnContainer();
            } else {
                return skin.getMutedContainerTokens(comp).getOnContainer();
            }
        }

        float aggrRed = 0;
        float aggrGreen = 0;
        float aggrBlue = 0;
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            float alpha = activeEntry.getValue().getContribution();
            Color active;
            if (activeState.isActive()) {
                active = skin.getActiveContainerTokens(comp, activeState).getOnContainer();
            } else {
                active = skin.getMutedContainerTokens(comp).getOnContainer();
            }
            aggrRed += alpha * active.getRed();
            aggrGreen += alpha * active.getGreen();
            aggrBlue += alpha * active.getBlue();
        }
        return new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue);
    }

    private static BladeContainerColorTokens mutableContainerTokens =
        new BladeContainerColorTokens();

    /**
     * Returns the foreground text color of the specified component.
     *
     * @param component      Component.
     * @param modelStateInfo Component model state info.
     * @return The foreground text color of the specified component.
     */
    public static Color getForegroundColor(Component component,
        StateTransitionTracker.ModelStateInfo modelStateInfo,
        CoreColorTokenUtils.ContainerType inactiveContainerType) {
        ComponentState currState = modelStateInfo.getCurrModelState();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
            modelStateInfo.getStateContributionMap();

        // special case for enabled buttons with no background -
        // always use the color tokens for the default state.
        if (component instanceof AbstractButton) {
            AbstractButton button = (AbstractButton) component;
            if (RadianceCoreUtilities.isComponentNeverPainted(button)
                || !button.isContentAreaFilled()
                || (button instanceof JRadioButton)
                || (button instanceof JCheckBox)) {
                if (!currState.isDisabled()) {
                    currState = ComponentState.ENABLED;
                    activeStates = null;
                } else {
                    currState = ComponentState.DISABLED_UNSELECTED;
                    activeStates = null;
                }
            }
        }

        // special case for modification aware buttons
        if (component instanceof AbstractButton) {
            AbstractButton button = (AbstractButton) component;
            if (button.getUI() instanceof ModificationAwareUI) {
                ModificationAwareUI modificationAwareUI = (ModificationAwareUI) button.getUI();
                Timeline modificationTimeline = modificationAwareUI.getModificationTimeline();
                if (modificationTimeline != null) {
                    if (modificationTimeline.getState() != Timeline.TimelineState.IDLE) {
                        BladeUtils.populateModificationAwareColorTokens(mutableContainerTokens,
                            button, modificationTimeline.getTimelinePosition());
                        return mutableContainerTokens.getOnContainer();
                    }
                }
            }
        }

        ContainerColorTokens colorTokens =
            CoreColorTokenUtils.getContainerTokens(component, currState, inactiveContainerType);
        if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
            return colorTokens.getOnContainer();
        }

        float aggrRed = 0;
        float aggrGreen = 0;
        float aggrBlue = 0;
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
            activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            float alpha = activeEntry.getValue().getContribution();

            ContainerColorTokens activeColorTokens =
                CoreColorTokenUtils.getContainerTokens(component, activeState,
                    inactiveContainerType);
            Color activeForeground = activeColorTokens.getOnContainer();
            aggrRed += alpha * activeForeground.getRed();
            aggrGreen += alpha * activeForeground.getGreen();
            aggrBlue += alpha * activeForeground.getBlue();
        }
        return new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue);
    }

    public static Color getForegroundVariantColor(Component component,
        StateTransitionTracker.ModelStateInfo modelStateInfo,
        CoreColorTokenUtils.ContainerType inactiveContainerType) {
        ComponentState currState = modelStateInfo.getCurrModelState();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
            modelStateInfo.getStateContributionMap();

        // special case for enabled buttons with no background -
        // always use the color tokens for the default state.
        if (component instanceof AbstractButton) {
            AbstractButton button = (AbstractButton) component;
            if (RadianceCoreUtilities.isComponentNeverPainted(button)
                || !button.isContentAreaFilled()
                || (button instanceof JRadioButton)
                || (button instanceof JCheckBox)) {
                if (!currState.isDisabled()) {
                    currState = ComponentState.ENABLED;
                    activeStates = null;
                } else {
                    currState = ComponentState.DISABLED_UNSELECTED;
                    activeStates = null;
                }
            }
        }

        // special case for modification aware buttons
        if (component instanceof AbstractButton) {
            AbstractButton button = (AbstractButton) component;
            if (button.getUI() instanceof ModificationAwareUI) {
                ModificationAwareUI modificationAwareUI = (ModificationAwareUI) button.getUI();
                Timeline modificationTimeline = modificationAwareUI.getModificationTimeline();
                if (modificationTimeline != null) {
                    if (modificationTimeline.getState() != Timeline.TimelineState.IDLE) {
                        BladeUtils.populateModificationAwareColorTokens(mutableContainerTokens,
                            button, modificationTimeline.getTimelinePosition());
                        return mutableContainerTokens.getOnContainerLow();
                    }
                }
            }
        }

        ContainerColorTokens colorTokens =
            CoreColorTokenUtils.getContainerTokens(component, currState, inactiveContainerType);
        if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
            return colorTokens.getOnContainerLow();
        }

        float aggrRed = 0;
        float aggrGreen = 0;
        float aggrBlue = 0;
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
            activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            float alpha = activeEntry.getValue().getContribution();

            ContainerColorTokens activeColorTokens =
                CoreColorTokenUtils.getContainerTokens(component, activeState,
                    inactiveContainerType);
            Color activeForeground = activeColorTokens.getOnContainerLow();
            aggrRed += alpha * activeForeground.getRed();
            aggrGreen += alpha * activeForeground.getGreen();
            aggrBlue += alpha * activeForeground.getBlue();
        }
        return new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue);
    }

    public static float getForegroundAlpha(Component component,
        StateTransitionTracker.ModelStateInfo modelStateInfo,
        CoreColorTokenUtils.ContainerType inactiveContainerType) {
        ComponentState currState = modelStateInfo.getCurrModelState();

        // special case for enabled buttons with no background -
        // always use the color tokens for the default state.
        if (component instanceof AbstractButton) {
            AbstractButton button = (AbstractButton) component;
            if (RadianceCoreUtilities.isComponentNeverPainted(button)
                || !button.isContentAreaFilled()
                || (button instanceof JRadioButton)
                || (button instanceof JCheckBox)) {
                if (!currState.isDisabled()) {
                    currState = ComponentState.ENABLED;
                } else {
                    currState = ComponentState.DISABLED_UNSELECTED;
                }
            }
        }

        // special case for modification aware buttons
        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        if (component instanceof AbstractButton) {
            AbstractButton button = (AbstractButton) component;
            if (button.getUI() instanceof ModificationAwareUI) {
                ModificationAwareUI modificationAwareUI = (ModificationAwareUI) button.getUI();
                Timeline modificationTimeline = modificationAwareUI.getModificationTimeline();
                if (modificationTimeline != null) {
                    if (modificationTimeline.getState() != Timeline.TimelineState.IDLE) {
                        BladeUtils.populateModificationAwareColorTokens(mutableContainerTokens,
                            button, modificationTimeline.getTimelinePosition());
                        return currState.isDisabled()
                            ? mutableContainerTokens.getOnContainerDisabledAlpha()
                            : mutableContainerTokens.getOnContainerEnabledAlpha();
                    }
                }
            }
        }

        ContainerColorTokens tokens;
        if (currState.isActive()) {
            tokens = skin.getActiveContainerTokens(component, currState);
        } else if (inactiveContainerType == CoreColorTokenUtils.ContainerType.MUTED) {
            tokens = skin.getMutedContainerTokens(component);
        } else {
            tokens = skin.getNeutralContainerTokens(component);
        }

        return currState.isDisabled() ? tokens.getOnContainerDisabledAlpha()
            : tokens.getOnContainerEnabledAlpha();
    }

    /**
     * Returns the foreground text color of the specified menu component.
     *
     * @param menuComponent  Menu component.
     * @param modelStateInfo Model state info for the component.
     * @return The foreground text color of the specified menu component.
     */
    public static Color getMenuComponentForegroundColor(JMenuItem menuComponent,
        StateTransitionTracker.ModelStateInfo modelStateInfo,
        CoreColorTokenUtils.ContainerType inactiveContainerType) {
        ComponentState currState = modelStateInfo.getCurrModelStateNoSelection();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
            modelStateInfo.getStateNoSelectionContributionMap();

        // use HIGHLIGHT on active menu items
        RadianceThemingSlices.ContainerColorTokensAssociationKind currAssocKind =
            currState.isActive() ? RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT
                : RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT;
        ContainerColorTokens colorTokens =
            CoreColorTokenUtils.getContainerTokens(
                menuComponent, currAssocKind, currState, inactiveContainerType);
        if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
            return colorTokens.getOnContainer();
        }

        float aggrRed = 0;
        float aggrGreen = 0;
        float aggrBlue = 0;
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
            activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            float alpha = activeEntry.getValue().getContribution();

            // use HIGHLIGHT on active menu items
            RadianceThemingSlices.ContainerColorTokensAssociationKind assocKind =
                activeState.isActive() ? RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT
                    : RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT;
            ContainerColorTokens activeContainerTokens =
                CoreColorTokenUtils.getContainerTokens(
                    menuComponent, assocKind, activeState, inactiveContainerType);
            Color activeForeground = activeContainerTokens.getOnContainer();
            aggrRed += alpha * activeForeground.getRed();
            aggrGreen += alpha * activeForeground.getGreen();
            aggrBlue += alpha * activeForeground.getBlue();
        }
        return new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue);
    }

    public static float getMenuComponentForegroundAlpha(JMenuItem menuComponent,
        StateTransitionTracker.ModelStateInfo modelStateInfo,
        CoreColorTokenUtils.ContainerType inactiveContainerType) {
        ComponentState currState = modelStateInfo.getCurrModelStateNoSelection();

        // use HIGHLIGHT on active menu items
        RadianceThemingSlices.ContainerColorTokensAssociationKind currAssocKind =
            currState.isActive() ? RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT
                : RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT;
        ContainerColorTokens colorTokens =
            CoreColorTokenUtils.getContainerTokens(
                menuComponent, currAssocKind, currState, inactiveContainerType);
        return currState.isDisabled() ? colorTokens.getOnContainerDisabledAlpha()
            : colorTokens.getOnContainerEnabledAlpha();
    }

    /**
     * Returns the background fill color of the specified component.
     *
     * @param component Component.
     * @return The background fill color of the specified component.
     */
    public static Color getBackgroundFillColor(Component component,
        CoreColorTokenUtils.ContainerType inactiveContainerType) {
        Color backgr = component.getBackground();
        boolean isBackgroundUiResource = backgr instanceof UIResource;

        // special case - sliders, checkboxes and radio buttons. For this,
        // switch to component parent
        if ((component instanceof JCheckBox)
            || (component instanceof JRadioButton)
            || (component instanceof JSlider)) {
            component = component.getParent();
        } else {
            // Fix for 325 - respect the opacity setting of the text
            // component
            if (component instanceof JTextComponent && isBackgroundUiResource &&
                (!component.isOpaque() || !((JTextComponent) component).isEditable())) {
                component = component.getParent();
            }
        }

        // do not change the background color on cell renderers
        if (SwingUtilities.getAncestorOfClass(CellRendererPane.class, component) != null) {
            return backgr;
        }

        ContainerColorTokens colorTokens = CoreColorTokenUtils.getContainerTokens(
            component,
            component.isEnabled() ? ComponentState.ENABLED : ComponentState.DISABLED_UNSELECTED,
            inactiveContainerType);
        if (!isBackgroundUiResource) {
            if (component.isEnabled()) {
                return backgr;
            }
            backgr = colorTokens.getContainerSurface();
        } else {
            ComponentState state = component.isEnabled() ? ComponentState.ENABLED
                : ComponentState.DISABLED_UNSELECTED;
            JTextComponent matchingTextComp = RadianceCoreUtilities
                .getTextComponentForTransitions(component);
            if (matchingTextComp != null) {
                Component original = component;
                component = matchingTextComp;
                boolean isEditable = matchingTextComp.isEditable();
                if (!isEditable) {
                    Component parent = component.getParent();
                    if (original == parent) {
                        return getBackgroundFillColor(original.getParent(), inactiveContainerType);
                    }
                    return getBackgroundFillColor(parent, inactiveContainerType);
                }
            }
            // menu items always use the same background color so that the
            // menu looks continuous
            if (component instanceof JMenuItem) {
                state = ComponentState.ENABLED;
            }

            backgr = RadianceColorUtilities.getDefaultBackgroundColor(component, state);
            float alpha = state.isDisabled()
                ? colorTokens.getContainerSurfaceDisabledAlpha()
                : colorTokens.getContainerSurfaceEnabledAlpha();
            if (alpha < 1.0f) {
                Color defaultColor = RadianceColorUtilities
                    .getDefaultBackgroundColor(component, ComponentState.ENABLED);
                backgr = RadianceColorUtilities.getInterpolatedColor(
                    backgr, defaultColor, 1.0f - (1.0f - alpha) / 2.0f);
            }
        }
        return backgr;
    }

    public static Color getBackgroundFillColorScrollBar(JScrollBar scrollbar) {
        RadianceSkin skin = RadianceCoreUtilities.getSkin(scrollbar);
        ContainerColorTokens colorTokens = skin.getNeutralContainerTokens(scrollbar);
        return colorTokens.isDark() ? colorTokens.getContainerSurfaceLow()
            : colorTokens.getContainerSurfaceHigh();
    }

    private static ColorUIResource getDefaultBackgroundColor(Component comp,
        ComponentState compState) {
        if (comp instanceof JTextComponent) {
            // special case for text-based components
            return new ColorUIResource(RadianceCoreUtilities.getTextBackgroundFill(comp, compState));
        }
        return new ColorUIResource(RadianceCoreUtilities.getBackgroundFill(
            RadianceThemingCortex.ComponentScope.getCurrentSkin(comp),
            DecorationPainterUtils.getDecorationType(comp)));
    }

    /**
     * Returns the striped background for the specified component. This method
     * is relevant for components such as trees, tables and lists that use
     * odd-even striping for the alternating rows.
     *
     * @param component Component.
     * @param rowIndex  Row index.
     * @return The striped background for the specified component.
     */
    public static Color getStripedBackground(JComponent component, int rowIndex) {
        Color backgr = component.getBackground();
        boolean isBackgroundUiResource = backgr instanceof UIResource;
        if (!isBackgroundUiResource) {
            return backgr;
        }

        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        ContainerColorTokens tokens = skin.getNeutralContainerTokens(component);
        if (rowIndex % 2 == 0) {
            // Surface for even rows
            return tokens.getContainerSurface();
        } else {
            // Container surface low / high for odd rows
            return tokens.isDark() ? tokens.getContainerSurfaceLow()
                : tokens.getContainerSurfaceHigh();
        }
    }

    public static String encode(int number) {
        if ((number < 0) || (number > 255)) {
            throw new IllegalArgumentException("" + number);
        }
        String hex = "0123456789ABCDEF";
        char c1 = hex.charAt(number / 16);
        char c2 = hex.charAt(number % 16);
        return c1 + "" + c2;
    }

    public static String encode(Color color) {
        if (color == null) {
            return "[null]";
        }
        return "#" + encode(color.getRed()) + encode(color.getGreen())
                + encode(color.getBlue()) + " [a=" + encode(color.getAlpha()) + "]";
    }
}
