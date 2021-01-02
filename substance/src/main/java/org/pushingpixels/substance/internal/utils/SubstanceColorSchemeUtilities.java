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
package org.pushingpixels.substance.internal.utils;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.*;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.*;

/**
 * Utilities related to color schemes. This class is for internal use only.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceColorSchemeUtilities {
    /**
     * Cache of shifted schemes.
     */
    private final static LazyResettableHashMap<SubstanceColorScheme> shiftedCache =
            new LazyResettableHashMap<>("ShiftColorScheme.shiftedSchemes");

    private enum ColorSchemeKind {
        LIGHT, DARK
    }

    /**
     * Returns a colorized version of the specified color scheme.
     *
     * @param component Component.
     * @param scheme    Color scheme.
     * @param isEnabled Indicates whether the component is enabled.
     * @return Colorized version of the specified color scheme.
     */
    private static SubstanceColorScheme getColorizedScheme(Component component,
            SubstanceColorScheme scheme, boolean isEnabled) {
        Component forQuerying = component;
        if ((component != null) && (component.getParent() != null)
                && ((component.getClass().isAnnotationPresent(SubstanceInternalArrowButton.class)
                || (component instanceof SubstanceTitleButton)))) {
            forQuerying = component.getParent();
        }
        return getColorizedScheme(component, scheme,
                (forQuerying == null) ? null : forQuerying.getForeground(),
                (forQuerying == null) ? null : forQuerying.getBackground(), isEnabled);
    }

    /**
     * Returns a colorized version of the specified color scheme.
     *
     * @param component Component.
     * @param scheme    Color scheme.
     * @param isEnabled Indicates whether the component is enabled.
     * @return Colorized version of the specified color scheme.
     */
    private static SubstanceColorScheme getColorizedScheme(Component component,
            SubstanceColorScheme scheme, Color fgColor, Color bgColor, boolean isEnabled) {
        if ((scheme != null) && (component != null)) {
            // Support for enhancement 256 - colorizing
            // controls.
            if (bgColor instanceof UIResource) {
                bgColor = null;
            }
            if (fgColor instanceof UIResource) {
                fgColor = null;
            }
            if ((bgColor != null) || (fgColor != null)) {
                double colorization = SubstanceCoreUtilities.getColorizationFactor(component);
                if (!isEnabled) {
                    colorization /= 2.0;
                }
                if (colorization > 0.0) {
                    return SubstanceColorSchemeUtilities.getShiftedScheme(scheme, bgColor,
                            colorization, fgColor, colorization);
                }
            }
        }
        return scheme;
    }

    /**
     * Returns the color scheme of the specified tabbed pane tab.
     *
     * @param jtp            Tabbed pane.
     * @param tabIndex       Tab index.
     * @param componentState Tab component state.
     * @return The color scheme of the specified tabbed pane tab.
     */
    public static SubstanceColorScheme getColorScheme(final JTabbedPane jtp, final int tabIndex,
            ColorSchemeAssociationKind associationKind, ComponentState componentState) {
        SubstanceSkin skin = SubstanceCoreUtilities.getSkin(jtp);
        if (skin == null) {
            SubstanceCoreUtilities.traceSubstanceApiUsage(jtp,
                    "Substance delegate used when Substance is not the current LAF");
        }
        SubstanceColorScheme nonColorized = skin.getColorScheme(jtp, associationKind,
                componentState);
        if (tabIndex >= 0) {
            Component component = jtp.getComponentAt(tabIndex);
            return getColorizedScheme(component, nonColorized,
                    jtp.getForegroundAt(tabIndex), jtp.getBackgroundAt(tabIndex),
                    !componentState.isDisabled());
        } else {
            return getColorizedScheme(jtp, nonColorized, !componentState.isDisabled());
        }
    }

    /**
     * Returns the color scheme of the specified component.
     *
     * @param component      Component.
     * @param componentState Component state.
     * @return Component color scheme.
     */
    public static SubstanceColorScheme getColorScheme(Component component,
            ComponentState componentState) {
        Component orig = component;
        // special case - if the component is marked as flat and
        // it is in the default state, or it is a button
        // that is never painting its background - get the color scheme of the
        // parent
        boolean isButtonThatIsNeverPainted = ((component instanceof AbstractButton)
                && SubstanceCoreUtilities.isButtonNeverPainted((AbstractButton) component));
        if (isButtonThatIsNeverPainted
                || (SubstanceCoreUtilities.hasFlatAppearance(component, false)
                && (componentState == ComponentState.ENABLED))) {
            component = component.getParent();
        }

        SubstanceSkin skin = SubstanceCoreUtilities.getSkin(component);
        if (skin == null) {
            SubstanceCoreUtilities.traceSubstanceApiUsage(component,
                    "Substance delegate used when Substance is not the current LAF");
        }
        SubstanceColorScheme nonColorized = skin.getColorScheme(component, componentState);

        return getColorizedScheme(orig, nonColorized, !componentState.isDisabled());
    }

    /**
     * Returns the color scheme of the component.
     *
     * @param component       Component.
     * @param associationKind Association kind.
     * @param componentState  Component state.
     * @return Component color scheme.
     */
    public static SubstanceColorScheme getColorScheme(Component component,
            ColorSchemeAssociationKind associationKind, ComponentState componentState) {
        // special case - if the component is marked as flat and
        // it is in the default state, get the color scheme of the parent.
        // However, flat toolbars should be ignored, since they are
        // the "top" level decoration area.
        if (!(component instanceof JToolBar)
                && SubstanceCoreUtilities.hasFlatAppearance(component, false)
                && (componentState == ComponentState.ENABLED)) {
            component = component.getParent();
        }

        SubstanceSkin skin = SubstanceCoreUtilities.getSkin(component);
        if (skin == null) {
            return null;
        }
        SubstanceColorScheme nonColorized = skin.getColorScheme(component, associationKind,
                componentState);
        return getColorizedScheme(component, nonColorized, !componentState.isDisabled());
    }

    /**
     * Returns the color scheme of the component.
     *
     * @param component       Component.
     * @param associationKind Association kind.
     * @param componentState  Component state.
     * @return Component color scheme.
     */
    public static SubstanceColorScheme getDirectColorScheme(Component component,
            ColorSchemeAssociationKind associationKind, ComponentState componentState) {
        // special case - if the component is marked as flat and
        // it is in the default state, get the color scheme of the parent.
        // However, flat toolbars should be ignored, since they are
        // the "top" level decoration area.
        if (!(component instanceof JToolBar)
                && SubstanceCoreUtilities.hasFlatAppearance(component, false)
                && (componentState == ComponentState.ENABLED)) {
            component = component.getParent();
        }

        SubstanceColorScheme nonColorized = SubstanceCoreUtilities.getSkin(component)
                .getDirectColorScheme(component, associationKind, componentState);
        return getColorizedScheme(component, nonColorized, !componentState.isDisabled());
    }

    /**
     * Returns the active color scheme of the component.
     *
     * @param component      Component.
     * @param componentState Component state.
     * @return Component color scheme.
     */
    public static SubstanceColorScheme getActiveColorScheme(Component component,
            ComponentState componentState) {
        // special case - if the component is marked as flat and
        // it is in the default state, get the color scheme of the parent.
        // However, flat toolbars should be ignored, since they are
        // the "top" level decoration area.
        if (!(component instanceof JToolBar)
                && SubstanceCoreUtilities.hasFlatAppearance(component, false)
                && (componentState == ComponentState.ENABLED)) {
            component = component.getParent();
        }

        SubstanceColorScheme nonColorized = SubstanceCoreUtilities.getSkin(component)
                .getActiveColorScheme(ComponentOrParentChainScope.getDecorationType(component));
        return getColorizedScheme(component, nonColorized, !componentState.isDisabled());
    }

    /**
     * Returns the alpha channel of the highlight color scheme of the component.
     *
     * @param component      Component.
     * @param componentState Component state.
     * @return Highlight color scheme alpha channel.
     */
    public static float getHighlightAlpha(Component component, ComponentState componentState) {
        return SubstanceCoreUtilities.getSkin(component).getHighlightAlpha(component, componentState);
    }

    /**
     * Returns the alpha channel of the color scheme of the component.
     *
     * @param component      Component.
     * @param componentState Component state.
     * @return Color scheme alpha channel.
     */
    public static float getAlpha(Component component, ComponentState componentState) {
        return SubstanceCoreUtilities.getSkin(component).getAlpha(component, componentState);
    }

    /**
     * Used as reference in attention-drawing animations. This field is <b>for internal use
     * only</b>.
     */
    public final static SubstanceColorScheme YELLOW = new SunGlareColorScheme();

    /**
     * Used as reference in attention-drawing animations. This field is <b>for internal use
     * only</b>.
     */
    public final static SubstanceColorScheme ORANGE = new SunfireRedColorScheme();

    /**
     * Used as reference to the green color scheme. This field is <b>for internal use only</b>.
     */
    public final static SubstanceColorScheme GREEN = new BottleGreenColorScheme();

    public static SubstanceColorScheme getLightColorScheme(String name, final Color[] colors,
            final Map<String, Color> additionalColors) {
        if (colors == null) {
            throw new IllegalArgumentException("Color encoding cannot be null");
        }
        if (colors.length != 7) {
            throw new IllegalArgumentException("Color encoding must have 7 components");
        }
        return new BaseLightColorScheme(name) {
            public Color getUltraLightColor() {
                return colors[0];
            }

            public Color getExtraLightColor() {
                return colors[1];
            }

            public Color getLightColor() {
                return colors[2];
            }

            public Color getMidColor() {
                return colors[3];
            }

            public Color getDarkColor() {
                return colors[4];
            }

            public Color getUltraDarkColor() {
                return colors[5];
            }

            public Color getForegroundColor() {
                return colors[6];
            }

            @Override
            public Color getLineColor() {
                if (additionalColors.containsKey("colorLine")) {
                    return additionalColors.get("colorLine");
                }
                return super.getLineColor();
            }

            @Override
            public Color getBackgroundFillColor() {
                if (additionalColors.containsKey("colorBackgroundFill")) {
                    return additionalColors.get("colorBackgroundFill");
                }
                return super.getBackgroundFillColor();
            }

            @Override
            public Color getAccentedBackgroundFillColor() {
                if (additionalColors.containsKey("colorAccentedBackgroundFill")) {
                    return additionalColors.get("colorAccentedBackgroundFill");
                }
                return super.getAccentedBackgroundFillColor();
            }

            @Override
            public Color getTextBackgroundFillColor() {
                if (additionalColors.containsKey("colorTextBackgroundFill")) {
                    return additionalColors.get("colorTextBackgroundFill");
                }
                return super.getTextBackgroundFillColor();
            }

            @Override
            public Color getSelectionBackgroundColor() {
                if (additionalColors.containsKey("colorSelectionBackground")) {
                    return additionalColors.get("colorSelectionBackground");
                }
                return super.getSelectionBackgroundColor();
            }

            @Override
            public Color getSelectionForegroundColor() {
                if (additionalColors.containsKey("colorSelectionForeground")) {
                    return additionalColors.get("colorSelectionForeground");
                }
                return super.getSelectionForegroundColor();
            }

            @Override
            public Color getFocusRingColor() {
                if (additionalColors.containsKey("colorFocusRing")) {
                    return additionalColors.get("colorFocusRing");
                }
                return super.getFocusRingColor();
            }

            @Override
            public Color getSeparatorPrimaryColor() {
                if (additionalColors.containsKey("colorSeparatorPrimary")) {
                    return additionalColors.get("colorSeparatorPrimary");
                }
                return super.getSeparatorPrimaryColor();
            }

            @Override
            public Color getSeparatorSecondaryColor() {
                if (additionalColors.containsKey("colorSeparatorSecondary")) {
                    return additionalColors.get("colorSeparatorSecondary");
                }
                return super.getSeparatorSecondaryColor();
            }

            @Override
            public Color getMarkColor() {
                if (additionalColors.containsKey("colorMark")) {
                    return additionalColors.get("colorMark");
                }
                return super.getMarkColor();
            }

            @Override
            public Color getEchoColor() {
                if (additionalColors.containsKey("colorEcho")) {
                    return additionalColors.get("colorEcho");
                }
                return super.getEchoColor();
            }
        };
    }

    public static SubstanceColorScheme getDarkColorScheme(String name, final Color[] colors,
            final Map<String, Color> additionalColors) {
        if (colors == null) {
            throw new IllegalArgumentException("Color encoding cannot be null");
        }
        if (colors.length != 7) {
            throw new IllegalArgumentException("Color encoding must have 7 components");
        }
        return new BaseDarkColorScheme(name) {
            public Color getUltraLightColor() {
                return colors[0];
            }

            public Color getExtraLightColor() {
                return colors[1];
            }

            public Color getLightColor() {
                return colors[2];
            }

            public Color getMidColor() {
                return colors[3];
            }

            public Color getDarkColor() {
                return colors[4];
            }

            public Color getUltraDarkColor() {
                return colors[5];
            }

            public Color getForegroundColor() {
                return colors[6];
            }

            @Override
            public Color getLineColor() {
                if (additionalColors.containsKey("colorLine")) {
                    return additionalColors.get("colorLine");
                }
                return super.getLineColor();
            }

            @Override
            public Color getBackgroundFillColor() {
                if (additionalColors.containsKey("colorBackgroundFill")) {
                    return additionalColors.get("colorBackgroundFill");
                }
                return super.getBackgroundFillColor();
            }

            @Override
            public Color getAccentedBackgroundFillColor() {
                if (additionalColors.containsKey("colorAccentedBackgroundFill")) {
                    return additionalColors.get("colorAccentedBackgroundFill");
                }
                return super.getAccentedBackgroundFillColor();
            }

            @Override
            public Color getTextBackgroundFillColor() {
                if (additionalColors.containsKey("colorTextBackgroundFill")) {
                    return additionalColors.get("colorTextBackgroundFill");
                }
                return super.getTextBackgroundFillColor();
            }

            @Override
            public Color getSelectionBackgroundColor() {
                if (additionalColors.containsKey("colorSelectionBackground")) {
                    return additionalColors.get("colorSelectionBackground");
                }
                return super.getSelectionBackgroundColor();
            }

            @Override
            public Color getSelectionForegroundColor() {
                if (additionalColors.containsKey("colorSelectionForeground")) {
                    return additionalColors.get("colorSelectionForeground");
                }
                return super.getSelectionForegroundColor();
            }

            @Override
            public Color getFocusRingColor() {
                if (additionalColors.containsKey("colorFocusRing")) {
                    return additionalColors.get("colorFocusRing");
                }
                return super.getFocusRingColor();
            }

            @Override
            public Color getSeparatorPrimaryColor() {
                if (additionalColors.containsKey("colorSeparatorPrimary")) {
                    return additionalColors.get("colorSeparatorPrimary");
                }
                return super.getSeparatorPrimaryColor();
            }

            @Override
            public Color getSeparatorSecondaryColor() {
                if (additionalColors.containsKey("colorSeparatorSecondary")) {
                    return additionalColors.get("colorSeparatorSecondary");
                }
                return super.getSeparatorSecondaryColor();
            }

            @Override
            public Color getMarkColor() {
                if (additionalColors.containsKey("colorMark")) {
                    return additionalColors.get("colorMark");
                }
                return super.getMarkColor();
            }

            @Override
            public Color getEchoColor() {
                if (additionalColors.containsKey("colorEcho")) {
                    return additionalColors.get("colorEcho");
                }
                return super.getEchoColor();
            }
        };
    }

    private static Color decodeColor(String value, Map<String, Color> colorMap) {
        if (value.startsWith("@")) {
            return colorMap.get(value.substring(1));
        }
        return Color.decode(value);
    }

    public static SubstanceSkin.ColorSchemes getColorSchemes(InputStream inputStream) {
        List<SubstanceColorScheme> schemes = new ArrayList<>();

        Map<String, Color> colorMap = new HashMap<>();

        Color ultraLight = null;
        Color extraLight = null;
        Color light = null;
        Color mid = null;
        Color dark = null;
        Color ultraDark = null;
        Color foreground = null;
        Color background = null;
        String name = null;
        ColorSchemeKind kind = null;
        Map<String, Color> additionalColors = new HashMap<>();
        boolean inColorSchemeBlock = false;
        boolean inColorsBlock = false;
        int lineNumber = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (true) {
                String line = reader.readLine();
                lineNumber++;
                if (line == null)
                    break;

                line = line.trim();
                if (line.length() == 0)
                    continue;

                if (line.startsWith("#")) {
                    // enhancement 476 - allow comments
                    continue;
                }

                if (line.contains("{")) {
                    if (inColorSchemeBlock || inColorsBlock) {
                        throw new IllegalArgumentException("Already in color scheme or colors definition, line " + lineNumber);
                    }
                    name = line.substring(0, line.indexOf("{")).trim();
                    if (name.equals("@colors")) {
                        inColorsBlock = true;
                    } else {
                        inColorSchemeBlock = true;
                    }
                    continue;
                }

                if (line.contains("}")) {
                    if (!inColorSchemeBlock && !inColorsBlock) {
                        throw new IllegalArgumentException("Not in color scheme or colors definition, line " + lineNumber);
                    }

                    if (inColorsBlock) {
                        // Colors have already been processed
                        inColorsBlock = false;
                        continue;
                    }

                    inColorSchemeBlock = false;

                    if (background == null) {
                        if ((name == null) || (kind == null) || (ultraLight == null)
                                || (extraLight == null) || (light == null) || (mid == null)
                                || (dark == null) || (ultraDark == null) || (foreground == null)) {
                            throw new IllegalArgumentException("Incomplete specification of '" + name + "', line " + lineNumber);
                        }
                    } else {
                        if ((name == null) || (foreground == null)) {
                            throw new IllegalArgumentException("Incomplete specification '" + name + "', line " + lineNumber);
                        }
                    }
                    Color[] colors = (background != null)
                            ? new Color[] {background, background, background, background, background, background,
                            foreground}
                            : new Color[] {ultraLight, extraLight, light, mid, dark, ultraDark, foreground};

                    if (kind == ColorSchemeKind.LIGHT) {
                        schemes.add(getLightColorScheme(name, colors, new HashMap<>(additionalColors)));
                    } else {
                        schemes.add(getDarkColorScheme(name, colors, new HashMap<>(additionalColors)));
                    }
                    name = null;
                    kind = null;
                    ultraLight = null;
                    extraLight = null;
                    light = null;
                    mid = null;
                    dark = null;
                    ultraDark = null;
                    foreground = null;
                    background = null;
                    additionalColors.clear();
                    continue;
                }

                String[] split = line.split("=");
                if (split.length != 2) {
                    throw new IllegalArgumentException("Unsupported format in line " + line + " [" + lineNumber + "]");
                }

                String key = split[0].trim();
                String value = split[1].trim();

                if (inColorsBlock) {
                    colorMap.put(key, Color.decode(value));
                    continue;
                }

                if ("kind".equals(key)) {
                    if (kind == null) {
                        if ("Light".equals(value)) {
                            kind = ColorSchemeKind.LIGHT;
                            continue;
                        }
                        if ("Dark".equals(value)) {
                            kind = ColorSchemeKind.DARK;
                            continue;
                        }
                        throw new IllegalArgumentException("Unsupported format in line " + line + " [" + lineNumber + "]");
                    }
                    throw new IllegalArgumentException("'kind' should only be defined once, line " + lineNumber);
                }
                if ("colorUltraLight".equals(key)) {
                    if (ultraLight == null) {
                        ultraLight = decodeColor(value, colorMap);
                        continue;
                    }
                    throw new IllegalArgumentException("'ultraLight' should only be defined once, line " + lineNumber);
                }
                if ("colorExtraLight".equals(key)) {
                    if (extraLight == null) {
                        extraLight = decodeColor(value, colorMap);
                        continue;
                    }
                    throw new IllegalArgumentException("'extraLight' should only be defined once, line " + lineNumber);
                }
                if ("colorLight".equals(key)) {
                    if (light == null) {
                        light = decodeColor(value, colorMap);
                        continue;
                    }
                    throw new IllegalArgumentException("'light' should only be defined once, line " + lineNumber);
                }
                if ("colorMid".equals(key)) {
                    if (mid == null) {
                        mid = decodeColor(value, colorMap);
                        continue;
                    }
                    throw new IllegalArgumentException("'mid' should only be defined once, line " + lineNumber);
                }
                if ("colorDark".equals(key)) {
                    if (dark == null) {
                        dark = decodeColor(value, colorMap);
                        continue;
                    }
                    throw new IllegalArgumentException("'dark' should only be defined once, line " + lineNumber);
                }
                if ("colorUltraDark".equals(key)) {
                    if (ultraDark == null) {
                        ultraDark = decodeColor(value, colorMap);
                        continue;
                    }
                    throw new IllegalArgumentException("'ultraDark' should only be defined once, line " + lineNumber);
                }
                if ("colorForeground".equals(key)) {
                    if (foreground == null) {
                        foreground = decodeColor(value, colorMap);
                        continue;
                    }
                    throw new IllegalArgumentException("'foreground' should only be defined once, line " + lineNumber);
                }
                if ("colorBackground".equals(key)) {
                    if (value.contains("->")) {
                        String[] splitInner = value.split("->");
                        Color colorStart = decodeColor(splitInner[0].trim(), colorMap);
                        Color colorEnd = decodeColor(splitInner[1].trim(), colorMap);
                        ultraLight = colorStart;
                        extraLight = SubstanceColorUtilities.getInterpolatedColor(colorStart, colorEnd, 0.9f);
                        light = SubstanceColorUtilities.getInterpolatedColor(colorStart, colorEnd, 0.7f);
                        mid = SubstanceColorUtilities.getInterpolatedColor(colorStart, colorEnd, 0.5f);
                        dark = SubstanceColorUtilities.getInterpolatedColor(colorStart, colorEnd, 0.2f);
                        ultraDark = colorEnd;
                        continue;
                    } else {
                        if (background == null) {
                            background = decodeColor(value, colorMap);
                            continue;
                        }
                    }
                    throw new IllegalArgumentException("'foreground' should only be defined once, line " + lineNumber);
                }
                additionalColors.put(key, decodeColor(value, colorMap));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException(ioe);
        }

        return new SubstanceSkin.ColorSchemes() {
            @Override
            public Collection<SubstanceColorScheme> getAll() {
                return Collections.unmodifiableCollection(schemes);
            }

            @Override
            public SubstanceColorScheme get(String displayName) {
                for (SubstanceColorScheme scheme : schemes) {
                    if (scheme.getDisplayName().equals(displayName)) {
                        return scheme;
                    }
                }
                return null;
            }
        };
    }

    /**
     * Returns a shifted color scheme. This method is for internal use only.
     *
     * @param orig                  The original color scheme.
     * @param backgroundShiftColor  Shift color for the background color scheme colors. May be <code>null</code> - in
     *                              this case, the background color scheme colors will not be shifted.
     * @param backgroundShiftFactor Shift factor for the background color scheme colors. If the shift color for the
     *                              background color scheme colors is <code>null</code>, this value is ignored.
     * @param foregroundShiftColor  Shift color for the foreground color scheme colors. May be <code>null</code> - in
     *                              this case, the foreground color scheme colors will not be shifted.
     * @param foregroundShiftFactor Shift factor for the foreground color scheme colors. If the shift color for the
     *                              foreground color scheme colors is <code>null</code>, this value is ignored.
     * @return Shifted scheme.
     */
    public static SubstanceColorScheme getShiftedScheme(SubstanceColorScheme orig,
            Color backgroundShiftColor, double backgroundShiftFactor, Color foregroundShiftColor,
            double foregroundShiftFactor) {
        HashMapKey key = SubstanceCoreUtilities.getHashKey(orig.getDisplayName(),
                backgroundShiftColor == null ? "" : backgroundShiftColor.getRGB(),
                backgroundShiftFactor,
                foregroundShiftColor == null ? "" : foregroundShiftColor.getRGB(),
                foregroundShiftFactor);
        SubstanceColorScheme result = shiftedCache.get(key);
        if (result == null) {
            result = orig.shift(backgroundShiftColor, backgroundShiftFactor, foregroundShiftColor,
                    foregroundShiftFactor);
            shiftedCache.put(key, result);
        }
        return result;
    }
}
