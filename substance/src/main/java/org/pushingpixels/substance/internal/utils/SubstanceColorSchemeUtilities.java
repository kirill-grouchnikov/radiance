/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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

import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.BaseDarkColorScheme;
import org.pushingpixels.substance.api.colorscheme.BaseLightColorScheme;
import org.pushingpixels.substance.api.colorscheme.BottleGreenColorScheme;
import org.pushingpixels.substance.api.colorscheme.LightGrayColorScheme;
import org.pushingpixels.substance.api.colorscheme.MetallicColorScheme;
import org.pushingpixels.substance.api.colorscheme.SchemeBaseColors;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.colorscheme.SunGlareColorScheme;
import org.pushingpixels.substance.api.colorscheme.SunfireRedColorScheme;

/**
 * Utilities related to color schemes. This class is for internal use only.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceColorSchemeUtilities {
    /**
     * Cache of shifted schemes.
     */
    private final static LazyResettableHashMap<SubstanceColorScheme> shiftedCache = new LazyResettableHashMap<SubstanceColorScheme>(
            "ShiftColorScheme.shiftedSchemes");

    private static enum ColorSchemeKind {
        LIGHT, DARK
    }

    /**
     * Metallic skin.
     */
    public static final SubstanceSkin METALLIC_SKIN = getMetallicSkin();

    /**
     * Returns a metallic skin.
     * 
     * @return Metallic skin.
     */
    private static SubstanceSkin getMetallicSkin() {
        SubstanceSkin res = new SubstanceSkin() {
            @Override
            public String getDisplayName() {
                return "Metallic Skin";
            }
        };
        res.registerDecorationAreaSchemeBundle(
                new SubstanceColorSchemeBundle(new MetallicColorScheme(), new MetallicColorScheme(),
                        new LightGrayColorScheme()),
                DecorationAreaType.NONE);
        return res;
    }

    /**
     * Returns a colorized version of the specified color scheme.
     * 
     * @param component
     *            Component.
     * @param scheme
     *            Color scheme.
     * @param isEnabled
     *            Indicates whether the component is enabled.
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
     * @param component
     *            Component.
     * @param scheme
     *            Color scheme.
     * @param support
     *            Used to compute the colorized scheme.
     * @param isEnabled
     *            Indicates whether the component is enabled.
     * @return Colorized version of the specified color scheme.
     */
    private static SubstanceColorScheme getColorizedScheme(Component component,
            SubstanceColorScheme scheme, Color fgColor, Color bgColor, boolean isEnabled) {
        if ((scheme != null) && (component != null)) {
            // Support for enhancement 256 - colorizing
            // controls.
            if (bgColor instanceof UIResource)
                bgColor = null;
            if (fgColor instanceof UIResource) {
                fgColor = null;
            }
            if ((bgColor != null) || (fgColor != null)) {
                double colorization = SubstanceCoreUtilities.getColorizationFactor(component);
                if (!isEnabled)
                    colorization /= 2.0;
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
     * @param jtp
     *            Tabbed pane.
     * @param tabIndex
     *            Tab index.
     * @param componentState
     *            Tab component state.
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
            SubstanceColorScheme colorized = getColorizedScheme(component, nonColorized,
                    jtp.getForegroundAt(tabIndex), jtp.getBackgroundAt(tabIndex),
                    !componentState.isDisabled());
            return colorized;
        } else {
            return getColorizedScheme(jtp, nonColorized, !componentState.isDisabled());
        }
    }

    /**
     * Returns the color scheme of the specified component.
     * 
     * @param component
     *            Component.
     * @param componentState
     *            Component state.
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
     * @param component
     *            Component.
     * @param associationKind
     *            Association kind.
     * @param componentState
     *            Component state.
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
     * @param component
     *            Component.
     * @param associationKind
     *            Association kind.
     * @param componentState
     *            Component state.
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
     * @param component
     *            Component.
     * @param associationKind
     *            Association kind.
     * @param componentState
     *            Component state.
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
     * @param component
     *            Component.
     * @param componentState
     *            Component state.
     * @return Highlight color scheme alpha channel.
     */
    public static float getHighlightAlpha(Component component, ComponentState componentState) {
        return SubstanceCoreUtilities.getSkin(component).getHighlightAlpha(component,
                componentState);
    }

    /**
     * Returns the alpha channel of the color scheme of the component.
     * 
     * @param component
     *            Component.
     * @param componentState
     *            Component state.
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

    public static SchemeBaseColors getBaseColorScheme(InputStream is) {
        Color ultraLight = null;
        Color extraLight = null;
        Color light = null;
        Color mid = null;
        Color dark = null;
        Color ultraDark = null;
        Color foreground = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            while (true) {
                String line = reader.readLine();
                if (line == null)
                    break;
                String[] split = line.split("=");
                if (split.length != 2) {
                    throw new IllegalArgumentException("Unsupported format in line " + line);
                }
                String key = split[0];
                String value = split[1];
                if ("colorUltraLight".equals(key)) {
                    if (ultraLight == null) {
                        ultraLight = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'ultraLight' should only be defined once");
                }
                if ("colorExtraLight".equals(key)) {
                    if (extraLight == null) {
                        extraLight = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'extraLight' should only be defined once");
                }
                if ("colorLight".equals(key)) {
                    if (light == null) {
                        light = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'light' should only be defined once");
                }
                if ("colorMid".equals(key)) {
                    if (mid == null) {
                        mid = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'mid' should only be defined once");
                }
                if ("colorDark".equals(key)) {
                    if (dark == null) {
                        dark = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'dark' should only be defined once");
                }
                if ("colorUltraDark".equals(key)) {
                    if (ultraDark == null) {
                        ultraDark = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'ultraDark' should only be defined once");
                }
                if ("colorForeground".equals(key)) {
                    if (foreground == null) {
                        foreground = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'foreground' should only be defined once");
                }
                throw new IllegalArgumentException("Unsupported format in line " + line);
            }
            final Color[] colors = new Color[] { ultraLight, extraLight, light, mid, dark,
                            ultraDark, foreground };
            return new SchemeBaseColors() {
                @Override
                public String getDisplayName() {
                    return null;
                }

                @Override
                public Color getUltraLightColor() {
                    return colors[0];
                }

                @Override
                public Color getExtraLightColor() {
                    return colors[1];
                }

                @Override
                public Color getLightColor() {
                    return colors[2];
                }

                @Override
                public Color getMidColor() {
                    return colors[3];
                }

                @Override
                public Color getDarkColor() {
                    return colors[4];
                }

                @Override
                public Color getUltraDarkColor() {
                    return colors[5];
                }

                @Override
                public Color getForegroundColor() {
                    return colors[6];
                }
            };
        } catch (IOException ioe) {
            throw new IllegalArgumentException(ioe);
        }
    }

    public static SubstanceColorScheme getLightColorScheme(String name, final Color[] colors) {
        if (colors == null)
            throw new IllegalArgumentException("Color encoding cannot be null");
        if (colors.length != 7)
            throw new IllegalArgumentException("Color encoding must have 7 components");
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
        };
    }

    public static SubstanceColorScheme getDarkColorScheme(String name, final Color[] colors) {
        if (colors == null)
            throw new IllegalArgumentException("Color encoding cannot be null");
        if (colors.length != 7)
            throw new IllegalArgumentException("Color encoding must have 7 components");
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
        };
    }

    public static SubstanceSkin.ColorSchemes getColorSchemes(URL url) {
        List<SubstanceColorScheme> schemes = new ArrayList<SubstanceColorScheme>();

        Color ultraLight = null;
        Color extraLight = null;
        Color light = null;
        Color mid = null;
        Color dark = null;
        Color ultraDark = null;
        Color foreground = null;
        String name = null;
        ColorSchemeKind kind = null;
        boolean inColorSchemeBlock = false;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            while (true) {
                String line = reader.readLine();
                if (line == null)
                    break;

                line = line.trim();
                if (line.length() == 0)
                    continue;

                if (line.startsWith("#")) {
                    // enhancement 476 - allow comments
                    continue;
                }

                if (line.indexOf("{") >= 0) {
                    if (inColorSchemeBlock) {
                        throw new IllegalArgumentException("Already in color scheme definition");
                    }
                    inColorSchemeBlock = true;
                    name = line.substring(0, line.indexOf("{")).trim();
                    continue;
                }

                if (line.indexOf("}") >= 0) {
                    if (!inColorSchemeBlock) {
                        throw new IllegalArgumentException("Not in color scheme definition");
                    }
                    inColorSchemeBlock = false;

                    if ((name == null) || (kind == null) || (ultraLight == null)
                            || (extraLight == null) || (light == null) || (mid == null)
                            || (dark == null) || (ultraDark == null) || (foreground == null)) {
                        throw new IllegalArgumentException("Incomplete specification");
                    }
                    Color[] colors = new Color[] { ultraLight, extraLight, light, mid, dark,
                                    ultraDark, foreground };
                    if (kind == ColorSchemeKind.LIGHT) {
                        schemes.add(getLightColorScheme(name, colors));
                    } else {
                        schemes.add(getDarkColorScheme(name, colors));
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
                    continue;
                }

                String[] split = line.split("=");
                if (split.length != 2) {
                    throw new IllegalArgumentException("Unsupported format in line " + line);
                }
                String key = split[0].trim();
                String value = split[1].trim();
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
                        throw new IllegalArgumentException("Unsupported format in line " + line);
                    }
                    throw new IllegalArgumentException("'kind' should only be defined once");
                }
                if ("colorUltraLight".equals(key)) {
                    if (ultraLight == null) {
                        ultraLight = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'ultraLight' should only be defined once");
                }
                if ("colorExtraLight".equals(key)) {
                    if (extraLight == null) {
                        extraLight = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'extraLight' should only be defined once");
                }
                if ("colorLight".equals(key)) {
                    if (light == null) {
                        light = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'light' should only be defined once");
                }
                if ("colorMid".equals(key)) {
                    if (mid == null) {
                        mid = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'mid' should only be defined once");
                }
                if ("colorDark".equals(key)) {
                    if (dark == null) {
                        dark = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'dark' should only be defined once");
                }
                if ("colorUltraDark".equals(key)) {
                    if (ultraDark == null) {
                        ultraDark = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'ultraDark' should only be defined once");
                }
                if ("colorForeground".equals(key)) {
                    if (foreground == null) {
                        foreground = Color.decode(value);
                        continue;
                    }
                    throw new IllegalArgumentException("'foreground' should only be defined once");
                }
                throw new IllegalArgumentException("Unsupported format in line " + line);
            }
            ;
        } catch (IOException ioe) {
            throw new IllegalArgumentException(ioe);
        }
        return new SubstanceSkin.ColorSchemes(schemes);
    }

    /**
     * Returns a shifted color scheme. This method is for internal use only.
     * 
     * @param orig
     *            The original color scheme.
     * @param backgroundShiftColor
     *            Shift color for the background color scheme colors. May be <code>null</code> - in
     *            this case, the background color scheme colors will not be shifted.
     * @param backgroundShiftFactor
     *            Shift factor for the background color scheme colors. If the shift color for the
     *            background color scheme colors is <code>null</code>, this value is ignored.
     * @param foregroundShiftColor
     *            Shift color for the foreground color scheme colors. May be <code>null</code> - in
     *            this case, the foreground color scheme colors will not be shifted.
     * @param foregroundShiftFactor
     *            Shift factor for the foreground color scheme colors. If the shift color for the
     *            foreground color scheme colors is <code>null</code>, this value is ignored.
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
