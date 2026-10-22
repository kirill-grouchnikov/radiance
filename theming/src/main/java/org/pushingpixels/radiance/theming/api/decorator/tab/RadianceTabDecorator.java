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
package org.pushingpixels.radiance.theming.api.decorator.tab;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * Interface for decorating tabs in tabbed panes.
 * This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public interface RadianceTabDecorator {
    /**
     * Returns the insets for a tab.
     *
     * @return The tab insets.
     */
    Insets getTabInsets();

    /**
     * Returns the content color for a tab.
     *
     * @param tabbedPane The tabbed pane.
     * @param tabIndex   The tab index.
     * @return The content color.
     */
    Color getTabContentColor(JTabbedPane tabbedPane, int tabIndex);

    /**
     * Returns the decorated content color for a tab.
     *
     * @param tabComponent The tab component.
     * @param currState    The current state.
     * @param activeStates The active states.
     * @return The decorated content color.
     */
    Color getDecoratedTabContentColor(JComponent tabComponent, ComponentState currState,
        Map<ComponentState, Float> activeStates);

    /**
     * Returns the outline color for a tab.
     *
     * @param tabComponent The tab component.
     * @return The outline color.
     */
    Color getTabOutlineColor(Component tabComponent);

    /**
     * Returns whether to draw an unbroken content edge.
     *
     * @return {@code true} if an unbroken content edge should be drawn.
     */
    boolean shouldDrawUnbrokenContentEdge();

    /**
     * Paints the tab surface at 1X scale.
     *
     * @param graphics1X              The graphics context.
     * @param tabComponent            The tab component.
     * @param scaleFactor             The scale factor.
     * @param originalScaledOffsetX   The original scaled X offset.
     * @param originalScaledOffsetY   The original scaled Y offset.
     * @param width                   The width.
     * @param height                  The height.
     * @param surfaceColorTokens      The surface color tokens.
     */
    void paintTabSurfaceAt1X(Graphics2D graphics1X,
        JComponent tabComponent, double scaleFactor,
        int originalScaledOffsetX, int originalScaledOffsetY, int width, int height,
        ContainerColorTokens surfaceColorTokens);

    /**
     * Paints the tab surface highlight at 1X scale.
     *
     * @param graphics1X                The graphics context.
     * @param tabComponent              The tab component.
     * @param scaleFactor               The scale factor.
     * @param width                     The width.
     * @param height                    The height.
     * @param surfaceHighlightColorTokens The surface highlight color tokens.
     */
    void paintTabSurfaceHighlightAt1X(Graphics2D graphics1X,
        JComponent tabComponent, double scaleFactor, int width, int height,
        ContainerColorTokens surfaceHighlightColorTokens);

    /**
     * Paints the tab outline at 1X scale.
     *
     * @param graphics1X    The graphics context.
     * @param tabComponent  The tab component.
     * @param scaleFactor   The scale factor.
     * @param width         The width.
     * @param height        The height.
     * @param outlineColor  The outline color.
     */
    void paintTabOutlineAt1X(Graphics2D graphics1X,
        JComponent tabComponent, double scaleFactor, int width, int height, Color outlineColor);
}
