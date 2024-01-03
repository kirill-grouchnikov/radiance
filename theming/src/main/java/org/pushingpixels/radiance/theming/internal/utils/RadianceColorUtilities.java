/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
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
     * Returns the color of the top portion of border in control backgrounds.
     *
     * @param scheme The color scheme.
     * @return The color of the top portion of border in control backgrounds.
     */
    public static Color getTopBorderColor(RadianceColorScheme scheme) {
        return scheme.getUltraDarkColor();
    }

    /**
     * Returns the color of the middle portion of border in control backgrounds.
     *
     * @param scheme The color scheme.
     * @return The color of the middle portion of border in control backgrounds.
     */
    public static Color getMidBorderColor(RadianceColorScheme scheme) {
        return scheme.getDarkColor();
    }

    /**
     * Returns the color of the bottom portion of border in control backgrounds.
     *
     * @param scheme The color scheme.
     * @return The color of the bottom portion of border in control backgrounds.
     */
    public static Color getBottomBorderColor(RadianceColorScheme scheme) {
        return RadianceColorUtilities.getInterpolatedColor(scheme
                .getDarkColor(), scheme.getMidColor(), 0.5);
    }

    /**
     * Returns the color of the top portion of fill in control backgrounds.
     *
     * @param scheme The color scheme.
     * @return The color of the top portion of fill in control backgrounds.
     */
    public static Color getTopFillColor(RadianceColorScheme scheme) {
        return RadianceColorUtilities.getInterpolatedColor(scheme
                .getDarkColor(), scheme.getMidColor(), 0.4);
    }

    /**
     * Returns the color of the middle portion of fill in control backgrounds.
     *
     * @param scheme The color scheme.
     * @return The color of the middle portion of fill in control backgrounds.
     */
    public static Color getMidFillColor(RadianceColorScheme scheme) {
        return scheme.getMidColor();
    }

    /**
     * Returns the color of the bottom portion of fill in control backgrounds.
     *
     * @param scheme The color scheme.
     * @return The color of the bottom portion of fill in control backgrounds.
     */
    public static Color getBottomFillColor(RadianceColorScheme scheme) {
        return scheme.getUltraLightColor();
    }

    /**
     * Returns the color of the top portion of shine in control backgrounds.
     *
     * @param scheme The color scheme.
     * @return The color of the top portion of shine in control backgrounds.
     */
    public static Color getTopShineColor(RadianceColorScheme scheme) {
        return getBottomFillColor(scheme);
    }

    /**
     * Returns the color of the bottom portion of shine in control backgrounds.
     *
     * @param scheme The color scheme.
     * @return The color of the bottom portion of shine in control backgrounds.
     */
    public static Color getBottomShineColor(RadianceColorScheme scheme) {
        return scheme.getLightColor();
    }

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

    /**
     * Inverts the specified color.
     *
     * @param color The original color.
     * @return The inverted color.
     */
    public static Color invertColor(Color color) {
        return new Color(255 - color.getRed(), 255 - color.getGreen(),
                255 - color.getBlue(), color.getAlpha());
    }

    /**
     * Returns a negative of the specified color.
     *
     * @param rgb Color RGB.
     * @return Negative of the specified color.
     */
    public static int getNegativeColor(int rgb) {
        int transp = (rgb >>> 24) & 0xFF;
        int r = (rgb >>> 16) & 0xFF;
        int g = (rgb >>> 8) & 0xFF;
        int b = (rgb >>> 0) & 0xFF;

        return (transp << 24) | ((255 - r) << 16) | ((255 - g) << 8) | (255 - b);
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
     * Returns saturated version of the specified color.
     *
     * @param color  Color.
     * @param factor Saturation factor.
     * @return Saturated color.
     */
    public static Color getSaturatedColor(Color color, double factor) {
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        if ((red == green) || (green == blue)) {
            // monochrome
            return color;
        }

        float[] hsbvals = new float[3];
        Color.RGBtoHSB(red, green, blue, hsbvals);
        float sat = hsbvals[1];
        if (factor > 0.0) {
            sat = sat + (float) factor * (1.0f - sat);
        } else {
            sat = sat + (float) factor * sat;
        }
        return new Color(Color.HSBtoRGB(hsbvals[0], sat, hsbvals[2]));
    }

    /**
     * Returns hue-shifted (in HSV space) version of the specified color.
     *
     * @param color    Color.
     * @param hueShift hue shift factor.
     * @return Hue-shifted (in HSV space) color.
     */
    public static Color getHueShiftedColor(Color color, double hueShift) {
        float[] hsbvals = new float[3];
        Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), hsbvals);
        float hue = hsbvals[0];
        hue += hueShift;
        if (hue < 0.0) {
            hue += 1.0;
        }
        if (hue > 1.0) {
            hue -= 1.0;
        }
        return new Color(Color.HSBtoRGB(hue, hsbvals[1], hsbvals[2]));
    }

    /**
     * Derives a color based on the original color and a brightness source. The
     * resulting color has the same hue and saturation as the original color,
     * but its brightness is shifted towards the brightness of the brightness
     * source. Thus, a light red color shifted towards dark green will become
     * dark red.
     *
     * @param original         Original color.
     * @param brightnessSource Brightness source.
     * @return Derived color that has the same hue and saturation as the
     * original color, but its brightness is shifted towards the
     * brightness of the brightness source.
     */
    public static Color deriveByBrightness(Color original, Color brightnessSource) {
        float[] hsbvalsOrig = new float[3];
        Color.RGBtoHSB(original.getRed(), original.getGreen(), original.getBlue(), hsbvalsOrig);
        float[] hsbvalsBrightnessSrc = new float[3];
        Color.RGBtoHSB(brightnessSource.getRed(), brightnessSource.getGreen(),
                brightnessSource.getBlue(), hsbvalsBrightnessSrc);
        return new Color(Color.HSBtoRGB(hsbvalsOrig[0], hsbvalsOrig[1],
                (hsbvalsBrightnessSrc[2] + hsbvalsOrig[2]) / 2.0f));
    }

    public static Color deriveByBrightness(Color original, float brightnessFactor) {
        float[] hsbvalsOrig = new float[3];
        Color.RGBtoHSB(original.getRed(), original.getGreen(), original.getBlue(), hsbvalsOrig);

        // Brightness factor is in -1.0...1.0 range. Negative values are treated as darkening
        // and positive values are treated as brightening - leaving the hue and saturation intact
        float newBrightness = (brightnessFactor > 0.0f)
                ? hsbvalsOrig[2] + (1.0f - hsbvalsOrig[2]) * brightnessFactor
                : hsbvalsOrig[2] + hsbvalsOrig[2] * brightnessFactor;
        return new Color(Color.HSBtoRGB(hsbvalsOrig[0], hsbvalsOrig[1], newBrightness));
    }

    /**
     * Returns the foreground color of the specified color scheme.
     *
     * @param scheme Color scheme.
     * @return Color scheme foreground color.
     */
    public static ColorUIResource getForegroundColor(RadianceColorScheme scheme) {
        return new ColorUIResource(scheme.getForegroundColor());
    }

    /**
     * Returns lighter version of the specified color.
     *
     * @param color Color.
     * @param diff  Difference factor (values closer to 1.0 will produce results
     *              closer to white color).
     * @return Lighter version of the specified color.
     */
    public static Color getLighterColor(Color color, double diff) {
        return RadianceColorUtilities.getInterpolatedColor(color, Color.white, 1.0 - diff);
    }

    /**
     * Returns darker version of the specified color.
     *
     * @param color Color.
     * @param diff  Difference factor (values closer to 1.0 will produce results
     *              closer to black color).
     * @return Darker version of the specified color.
     */
    public static Color getDarkerColor(Color color, double diff) {
        return RadianceColorUtilities.getInterpolatedColor(color, Color.black, 1.0 - diff);
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
        RadianceThemingSlices.DecorationAreaType decorationAreaType = DecorationPainterUtils.getDecorationType(comp);

        if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
            Color overlay = skin.getOverlayColor(RadianceThemingSlices.ColorOverlayType.FOCUS_INDICATION,
                    decorationAreaType, currState);
            if (overlay != null) {
                return overlay;
            }
            RadianceColorScheme colorScheme = RadianceColorSchemeUtilities.getColorScheme(
                    comp, RadianceThemingSlices.ColorSchemeAssociationKind.FOCUS, currState);
            return colorScheme.getFocusRingColor();
        }

        float aggrRed = 0;
        float aggrGreen = 0;
        float aggrBlue = 0;
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            float alpha = activeEntry.getValue().getContribution();
            Color overlay = skin.getOverlayColor(RadianceThemingSlices.ColorOverlayType.FOCUS_INDICATION,
                    decorationAreaType, currState);
            Color active = (overlay != null) ? overlay :
                    RadianceColorSchemeUtilities.getColorScheme(comp, RadianceThemingSlices.ColorSchemeAssociationKind.FOCUS, activeState).
                            getFocusRingColor();
            aggrRed += alpha * active.getRed();
            aggrGreen += alpha * active.getGreen();
            aggrBlue += alpha * active.getBlue();
        }
        return new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue);
    }

    /**
     * Returns the color strength.
     *
     * @param color Color.
     * @return Color strength.
     */
    public static float getColorStrength(Color color) {
        return Math.max(getColorBrightness(color.getRGB()),
                getColorBrightness(getNegativeColor(color.getRGB()))) / 255.0f;
    }

    /**
     * Returns the foreground text color of the specified component.
     *
     * @param component      Component.
     * @param modelStateInfo Component model state info.
     * @return The foreground text color of the specified component.
     */
    public static Color getForegroundColor(Component component,
            StateTransitionTracker.ModelStateInfo modelStateInfo) {
        ComponentState currState = modelStateInfo.getCurrModelState();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                modelStateInfo.getStateContributionMap();

        // special case for enabled buttons with no background -
        // always use the color scheme for the default state.
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

        RadianceColorScheme colorScheme = RadianceColorSchemeUtilities
                .getColorScheme(component, currState);
        if (currState.isDisabled() || (activeStates == null)
                || (activeStates.size() == 1)) {
            return colorScheme.getForegroundColor();
        }

        float aggrRed = 0;
        float aggrGreen = 0;
        float aggrBlue = 0;
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            float alpha = activeEntry.getValue().getContribution();
            RadianceColorScheme activeColorScheme = RadianceColorSchemeUtilities
                    .getColorScheme(component, activeState);
            Color activeForeground = activeColorScheme.getForegroundColor();
            aggrRed += alpha * activeForeground.getRed();
            aggrGreen += alpha * activeForeground.getGreen();
            aggrBlue += alpha * activeForeground.getBlue();
        }
        return new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue);
    }

    /**
     * Returns the foreground text color of the specified menu component.
     *
     * @param menuComponent  Menu component.
     * @param modelStateInfo Model state info for the component.
     * @return The foreground text color of the specified menu component.
     */
    public static Color getMenuComponentForegroundColor(JMenuItem menuComponent,
            StateTransitionTracker.ModelStateInfo modelStateInfo) {
        ComponentState currState = modelStateInfo.getCurrModelStateNoSelection();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                modelStateInfo.getStateNoSelectionContributionMap();

        RadianceThemingSlices.ColorSchemeAssociationKind currAssocKind = RadianceThemingSlices.ColorSchemeAssociationKind.FILL;
        // use HIGHLIGHT on active menu items
        if (currState.isActive()) {
            currAssocKind = RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT;
        }
        RadianceColorScheme colorScheme = RadianceColorSchemeUtilities
                .getColorScheme(menuComponent, currAssocKind, currState);
        if (currState.isDisabled() || (activeStates == null)
                || (activeStates.size() == 1)) {
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
            // use HIGHLIGHT on active menu items
            if (activeState.isActive()) {
                assocKind = RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT;
            }
            RadianceColorScheme activeColorScheme = RadianceColorSchemeUtilities
                    .getColorScheme(menuComponent, assocKind, activeState);
            Color activeForeground = activeColorScheme.getForegroundColor();
            aggrRed += alpha * activeForeground.getRed();
            aggrGreen += alpha * activeForeground.getGreen();
            aggrBlue += alpha * activeForeground.getBlue();
        }
        return new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue);
    }

    /**
     * Returns the background fill color of the specified component.
     *
     * @param component Component.
     * @return The background fill color of the specified component.
     */
    public static Color getBackgroundFillColor(Component component) {
        Color backgr = component.getBackground();
        boolean isBackgroundUiResource = backgr instanceof UIResource;

        // special case - sliders, check boxes and radio buttons. For this,
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

        if (!isBackgroundUiResource) {
            // special case for issue 386 - if the colorization
            // is 1.0, return the component background
            if ((RadianceCoreUtilities.getColorizationFactor(component) == 1.0f)
                    && component.isEnabled()) {
                return backgr;
            }

            RadianceColorScheme scheme = RadianceColorSchemeUtilities.getColorScheme(component,
                    component.isEnabled() ? ComponentState.ENABLED : ComponentState.DISABLED_UNSELECTED);
            backgr = scheme.getBackgroundFillColor();
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
                        return getBackgroundFillColor(original.getParent());
                    }
                    return getBackgroundFillColor(parent);
                }
            }
            // menu items always use the same background color so that the
            // menu looks continuous
            if (component instanceof JMenuItem) {
                state = ComponentState.ENABLED;
            }
            backgr = RadianceColorUtilities.getDefaultBackgroundColor(component, state);

            float alpha = RadianceColorSchemeUtilities.getAlpha(component, state);
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
        RadianceColorScheme scheme =
                skin.getBackgroundColorScheme(DecorationPainterUtils.getDecorationType(scrollbar));
        return scheme.getAccentedBackgroundFillColor();
    }

    /**
     * Returns the default background color for the specified component.
     *
     * @param comp      Component.
     * @param compState Component state.
     * @return The default background color for the components of the specified
     * class.
     */
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
        RadianceColorScheme scheme =
                skin.getBackgroundColorScheme(DecorationPainterUtils.getDecorationType(component));
        return (rowIndex % 2 == 0)
                ? scheme.getBackgroundFillColor()
                : scheme.getAccentedBackgroundFillColor();
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
        return "#" + encode(color.getRed()) + encode(color.getGreen())
                + encode(color.getBlue());
    }
}
