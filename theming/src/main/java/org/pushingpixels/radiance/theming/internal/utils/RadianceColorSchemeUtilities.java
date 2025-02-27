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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;

/**
 * Utilities related to color schemes. This class is for internal use only.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceColorSchemeUtilities {
    /**
     * Cache of shifted schemes.
     */
    private final static LazyResettableHashMap<RadianceColorScheme> shiftedCache =
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
    private static RadianceColorScheme getColorizedScheme(Component component,
            RadianceColorScheme scheme, boolean isEnabled) {
        Component forQuerying = component;
        if ((component != null) && (component.getParent() != null)
                && ((component.getClass().isAnnotationPresent(RadianceInternalArrowButton.class)
                || (component instanceof RadianceTitleButton)))) {
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
    private static RadianceColorScheme getColorizedScheme(Component component,
            RadianceColorScheme scheme, Color fgColor, Color bgColor, boolean isEnabled) {
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
                double colorization = RadianceCoreUtilities.getColorizationFactor(component);
                if (!isEnabled) {
                    colorization /= 2.0;
                }
                if (colorization > 0.0) {
                    return RadianceColorSchemeUtilities.getShiftedScheme(scheme, bgColor,
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
    public static ContainerColorTokens getContainerTokens(final JTabbedPane jtp, final int tabIndex,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState componentState) {
        RadianceSkin skin = RadianceCoreUtilities.getSkin(jtp);
        if (skin == null) {
            RadianceCoreUtilities.traceRadianceApiUsage(jtp,
                "Radiance delegate used when Radiance is not the current LAF");
        }
        ContainerColorTokens nonColorized = skin.getContainerTokens(jtp, associationKind,
            componentState, RadianceThemingSlices.ContainerType.MUTED);
        if (tabIndex >= 0) {
            Component component = jtp.getComponentAt(tabIndex);
            return ColorSchemeUtils.getColorizedTokens(component, nonColorized,
                jtp.getForegroundAt(tabIndex), jtp.getBackgroundAt(tabIndex),
                !componentState.isDisabled());
        } else {
            return ColorSchemeUtils.getColorizedTokens(jtp, nonColorized, !componentState.isDisabled());
        }
    }

    /**
     * Returns the color scheme of the specified component.
     *
     * @param component      Component.
     * @param componentState Component state.
     * @return Component color scheme.
     */
    public static RadianceColorScheme getColorScheme(Component component,
            ComponentState componentState) {
        Component orig = component;
        // special case - if the component is marked as flat and
        // it is in the default state, or it is a button
        // that is never painting its background - get the color scheme of the
        // parent
        boolean isButtonThatIsNeverPainted = ((component instanceof AbstractButton)
                && RadianceCoreUtilities.isComponentNeverPainted((AbstractButton) component));
        if (isButtonThatIsNeverPainted
                || (RadianceCoreUtilities.hasFlatAppearance(component, false)
                && (componentState == ComponentState.ENABLED))) {
            component = component.getParent();
        }

        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        if (skin == null) {
            RadianceCoreUtilities.traceRadianceApiUsage(component,
                    "Radiance delegate used when Radiance is not the current LAF");
        }
        RadianceColorScheme nonColorized = skin.getColorScheme(component, componentState);

        return getColorizedScheme(orig, nonColorized, !componentState.isDisabled());
    }

    public static ContainerColorTokens getContainerTokens(Component component,
        ComponentState componentState, RadianceThemingSlices.ContainerType inactiveContainerType) {
        Component orig = component;
        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        // special case - if the component is marked as flat and
        // it is in the default state, or it is a button
        // that is never painting its background - get the color scheme of the
        // parent
        boolean isButtonThatIsNeverPainted = ((component instanceof AbstractButton)
            && RadianceCoreUtilities.isComponentNeverPainted((AbstractButton) component));
        if (isButtonThatIsNeverPainted
            || (!componentState.isActive()
                && (RadianceCoreUtilities.hasFlatAppearance(component, false)))) {
            // TODO: TONAL - verify that we don't need to use the old logic.
            ContainerColorTokens nonColorized = skin.getBackgroundExtendedContainerTokens(
                DecorationPainterUtils.getDecorationType(component)).getBaseContainerTokens();
            return ColorSchemeUtils.getColorizedTokens(orig, nonColorized, !componentState.isDisabled());
        }

        if (skin == null) {
            RadianceCoreUtilities.traceRadianceApiUsage(component,
                "Radiance delegate used when Radiance is not the current LAF");
        }
        ContainerColorTokens nonColorized = skin.getContainerTokens(component,
            componentState, inactiveContainerType);

        return ColorSchemeUtils.getColorizedTokens(orig, nonColorized, !componentState.isDisabled());
    }

    /**
     * Returns the color scheme of the component.
     *
     * @param component       Component.
     * @param associationKind Association kind.
     * @param componentState  Component state.
     * @return Component color scheme.
     */
    public static RadianceColorScheme getColorScheme(Component component,
            RadianceThemingSlices.ColorSchemeAssociationKind associationKind,
            ComponentState componentState) {
        // special case - if the component is marked as flat and
        // it is in the enabled state, get the color scheme of the parent.
        // However, flat toolbars should be ignored, since they are
        // the "top" level decoration area.
        if (!(component instanceof JToolBar)
                && RadianceCoreUtilities.hasFlatAppearance(component, false)
                && (componentState == ComponentState.ENABLED)) {
            component = component.getParent();
        }

        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        if (skin == null) {
            RadianceCoreUtilities.traceRadianceApiUsage(component,
                    "Radiance delegate used when Radiance is not the current LAF");
        }
        RadianceColorScheme nonColorized = skin.getColorScheme(component, associationKind,
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
    public static ContainerColorTokens getContainerTokens(Component component,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState componentState, RadianceThemingSlices.ContainerType inactiveContainerType) {
        return getContainerTokens(component, associationKind, componentState, inactiveContainerType,
            false);
    }

    /**
     * Returns the color scheme of the component.
     *
     * @param component       Component.
     * @param associationKind Association kind.
     * @param componentState  Component state.
     * @return Component color scheme.
     */
    public static ContainerColorTokens getContainerTokens(Component component,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState componentState, RadianceThemingSlices.ContainerType inactiveContainerType,
        boolean skipFlatCheck) {
        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);

        // special case - if the component is marked as flat, get the color scheme of the parent.
        // However, flat toolbars should be ignored, since they are
        // the "top" level decoration area.
        if (!skipFlatCheck && !(component instanceof JToolBar)
            && !componentState.isActive()
            && RadianceCoreUtilities.hasFlatAppearance(component, false)) {
            // TODO: TONAL - verify that we don't need to use the old logic.
            ContainerColorTokens nonColorized = skin.getBackgroundExtendedContainerTokens(
                DecorationPainterUtils.getDecorationType(component)).getBaseContainerTokens();
            return ColorSchemeUtils.getColorizedTokens(component, nonColorized, !componentState.isDisabled());
        }

        if (skin == null) {
            RadianceCoreUtilities.traceRadianceApiUsage(component,
                "Radiance delegate used when Radiance is not the current LAF");
        }
        ContainerColorTokens nonColorized = skin.getContainerTokens(component,
            associationKind, componentState, inactiveContainerType);
        return ColorSchemeUtils.getColorizedTokens(component, nonColorized, !componentState.isDisabled());
    }

    /**
     * Returns the color scheme of the component.
     *
     * @param component       Component.
     * @param associationKind Association kind.
     * @param componentState  Component state.
     * @return Component color scheme.
     */
    public static ContainerColorTokens getDirectContainerTokens(Component component,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState componentState, RadianceThemingSlices.ContainerType inactiveContainerType) {
        // special case - if the component is marked as flat and
        // it is in the enabled state, get the color scheme of the parent.
        // However, flat toolbars should be ignored, since they are
        // the "top" level decoration area.
        if (!(component instanceof JToolBar)
            && RadianceCoreUtilities.hasFlatAppearance(component, false)
            && (componentState == ComponentState.ENABLED)) {
            component = component.getParent();
        }

        ContainerColorTokens nonColorized = RadianceCoreUtilities.getSkin(component)
            .getDirectContainerTokens(component, associationKind, componentState, inactiveContainerType);
        return ColorSchemeUtils.getColorizedTokens(component, nonColorized, !componentState.isDisabled());
    }

    /**
     * Returns the active color scheme of the component.
     *
     * @param component      Component.
     * @param componentState Component state.
     * @return Component color scheme.
     */
    public static RadianceColorScheme getActiveColorScheme(Component component,
            ComponentState componentState) {
        // special case - if the component is marked as flat and
        // it is in the enabled state, get the color scheme of the parent.
        // However, flat toolbars should be ignored, since they are
        // the "top" level decoration area.
        if (!(component instanceof JToolBar)
                && RadianceCoreUtilities.hasFlatAppearance(component, false)
                && (componentState == ComponentState.ENABLED)) {
            component = component.getParent();
        }

        RadianceColorScheme nonColorized = RadianceCoreUtilities.getSkin(component)
                .getActiveColorScheme(RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(component));
        return getColorizedScheme(component, nonColorized, !componentState.isDisabled());
    }

    public static ContainerColorTokens getActiveContainerTokens(Component component,
            ComponentState componentState) {
        // special case - if the component is marked as flat and
        // it is in the enabled state, get the color scheme of the parent.
        // However, flat toolbars should be ignored, since they are
        // the "top" level decoration area.
        if (!(component instanceof JToolBar)
                && RadianceCoreUtilities.hasFlatAppearance(component, false)
                && (componentState == ComponentState.ENABLED)) {
            component = component.getParent();
        }

        ContainerColorTokens nonColorized = RadianceCoreUtilities.getSkin(component)
                .getActiveContainerTokens(RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(component));
        return ColorSchemeUtils.getColorizedTokens(component, nonColorized, !componentState.isDisabled());
    }

    /**
     * Returns the alpha channel of the highlight color scheme of the component.
     *
     * @param component      Component.
     * @param componentState Component state.
     * @return Highlight color scheme alpha channel.
     */
    // TODO: TONAL - remove
    public static float getHighlightAlpha(Component component, ComponentState componentState) {
        if (componentState.isDisabled() || (componentState == ComponentState.ENABLED)) {
            return 0.0f;
        }
        return 1.0f;
    }

    /**
     * Returns the alpha channel of the color scheme of the component.
     *
     * @param component      Component.
     * @param componentState Component state.
     * @return Color scheme alpha channel.
     */
    // TODO: TONAL - remove this
    public static float getAlpha(Component component, ComponentState componentState) {
        return RadianceCoreUtilities.getSkin(component).getAlpha(component, componentState);
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
    public static RadianceColorScheme getShiftedScheme(RadianceColorScheme orig,
            Color backgroundShiftColor, double backgroundShiftFactor, Color foregroundShiftColor,
            double foregroundShiftFactor) {
        HashMapKey key = RadianceCoreUtilities.getHashKey(orig.getDisplayName(),
                backgroundShiftColor == null ? "" : backgroundShiftColor.getRGB(),
                backgroundShiftFactor,
                foregroundShiftColor == null ? "" : foregroundShiftColor.getRGB(),
                foregroundShiftFactor);
        RadianceColorScheme result = shiftedCache.get(key);
        if (result == null) {
            result = orig.shift(backgroundShiftColor, backgroundShiftFactor, foregroundShiftColor,
                    foregroundShiftFactor);
            shiftedCache.put(key, result);
        }
        return result;
    }
}
