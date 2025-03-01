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
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;

import javax.swing.*;
import java.awt.*;

/**
 * Utilities related to color schemes. This class is for internal use only.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceColorSchemeUtilities {
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
                DecorationPainterUtils.getDecorationType(component));
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
                DecorationPainterUtils.getDecorationType(component));
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
}
