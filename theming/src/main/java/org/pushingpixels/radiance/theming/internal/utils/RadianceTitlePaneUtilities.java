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

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;

import javax.swing.*;
import java.awt.*;

/**
 * Various utility functions for title panes. This class is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceTitlePaneUtilities {
    /**
     * Client property to mark every child to be either leading or trailing. The value must be one
     * of {@link ExtraComponentKind}.
     * 
     * @see #markTitlePaneExtraComponent(JComponent, ExtraComponentKind)
     */
    public static final String EXTRA_COMPONENT_KIND = "radiance.theming.internal.titlePane.extraComponentKind";

    /** Enumerates the types of children components of title panes. */
    public enum ExtraComponentKind {
        /** Leading child components (left on LTR and right on RTL). */
        LEADING,

        /** Trailing child components (right on LTR and left on RTL). */
        TRAILING,

        /** Child components anchored to the title. */
        WITH_TITLE
    }

    public static ExtraComponentKind getTitlePaneControlButtonKind(JRootPane rootPane) {
        RadianceThemingSlices.HorizontalGravity controlButtonGroupGravity =
                getTitleControlButtonGroupHorizontalGravity(rootPane);
        switch (controlButtonGroupGravity) {
            case LEADING:
                return ExtraComponentKind.LEADING;
            case TRAILING:
            case SWING_DEFAULT:
                return ExtraComponentKind.TRAILING;
            case PLATFORM:
            default: {
                RadianceCommonCortex.Platform platform = RadianceCommonCortex.getPlatform();
                switch (platform) {
                    case MACOS:
                        return ExtraComponentKind.LEADING;
                    default:
                        return ExtraComponentKind.TRAILING;
                }
            }
        }
    }

    public static RadianceThemingSlices.HorizontalGravity getTitleTextHorizontalGravity() {
        Object globalProperty = UIManager.get(RadianceSynapse.TITLE_TEXT_HORIZONTAL_GRAVITY);
        if (globalProperty instanceof RadianceThemingSlices.HorizontalGravity) {
            return (RadianceThemingSlices.HorizontalGravity) globalProperty;
        }
        return RadianceThemingSlices.HorizontalGravity.SWING_DEFAULT;
    }

    public static RadianceThemingSlices.TitleIconHorizontalGravity getTitleIconHorizontalGravity() {
        Object globalProperty = UIManager.get(RadianceSynapse.TITLE_ICON_HORIZONTAL_GRAVITY);
        if (globalProperty instanceof RadianceThemingSlices.TitleIconHorizontalGravity) {
            return (RadianceThemingSlices.TitleIconHorizontalGravity) globalProperty;
        }
        return RadianceThemingSlices.TitleIconHorizontalGravity.SWING_DEFAULT;
    }

    public static RadianceThemingSlices.HorizontalGravity getTitleControlButtonGroupHorizontalGravity(
            JRootPane rootPane) {
        Object rootPaneProperty = (rootPane == null) ? null
                : rootPane.getClientProperty(
                        RadianceSynapse.TITLE_CONTROL_BUTTON_GROUP_HORIZONTAL_GRAVITY);
        if (rootPaneProperty instanceof RadianceThemingSlices.HorizontalGravity) {
            return (RadianceThemingSlices.HorizontalGravity) rootPaneProperty;
        }
        Object globalProperty = UIManager
                .get(RadianceSynapse.TITLE_CONTROL_BUTTON_GROUP_HORIZONTAL_GRAVITY);
        if (globalProperty instanceof RadianceThemingSlices.HorizontalGravity) {
            return (RadianceThemingSlices.HorizontalGravity) globalProperty;
        }
        return RadianceThemingSlices.HorizontalGravity.SWING_DEFAULT;
    }

    public static RadianceThemingSlices.VerticalGravity getTitleControlButtonGroupVerticalGravity(
            JRootPane rootPane) {
        Object rootPaneProperty = (rootPane == null) ? null
                : rootPane.getClientProperty(
                        RadianceSynapse.TITLE_CONTROL_BUTTON_GROUP_VERTICAL_GRAVITY);
        if (rootPaneProperty instanceof RadianceThemingSlices.VerticalGravity) {
            return (RadianceThemingSlices.VerticalGravity) rootPaneProperty;
        }
        Object globalProperty = UIManager
                .get(RadianceSynapse.TITLE_CONTROL_BUTTON_GROUP_VERTICAL_GRAVITY);
        if (globalProperty instanceof RadianceThemingSlices.HorizontalGravity) {
            return (RadianceThemingSlices.VerticalGravity) globalProperty;
        }
        return RadianceThemingSlices.VerticalGravity.CENTERED;
    }

    public static boolean areTitlePaneControlButtonsOnRight(JRootPane rootPane) {
        boolean isLtr = rootPane.getComponentOrientation().isLeftToRight();
        RadianceThemingSlices.HorizontalGravity controlButtonGroupGravity = getTitleControlButtonGroupHorizontalGravity(
                rootPane);
        switch (controlButtonGroupGravity) {
            case LEADING:
                return isLtr ? false : true;
            case TRAILING:
            case SWING_DEFAULT:
                return isLtr ? true : false;
            case PLATFORM:
            default: {
                RadianceCommonCortex.Platform platform = RadianceCommonCortex.getPlatform();
                switch (platform) {
                    case MACOS:
                        return isLtr ? false : true;
                    default:
                        return isLtr ? true : false;
                }
            }
        }
    }

    public static RadianceThemingSlices.HorizontalGravity getTitlePaneTextGravity() {
        RadianceThemingSlices.HorizontalGravity titleTextGravity = RadianceThemingCortex.GlobalScope
                .getTitleTextHorizontalGravity();
        switch (titleTextGravity) {
            case LEADING:
            case TRAILING:
            case CENTERED:
                return titleTextGravity;
            case SWING_DEFAULT:
                return RadianceThemingSlices.HorizontalGravity.LEADING;
            case PLATFORM:
            default: {
                RadianceCommonCortex.Platform platform = RadianceCommonCortex.getPlatform();
                switch (platform) {
                    case WINDOWS:
                        return RadianceThemingSlices.HorizontalGravity.LEADING;
                    default:
                        return RadianceThemingSlices.HorizontalGravity.CENTERED;
                }
            }
        }
    }

    public static RadianceThemingSlices.TitleIconHorizontalGravity getTitlePaneIconGravity() {
        RadianceThemingSlices.TitleIconHorizontalGravity iconGravity = RadianceThemingCortex.GlobalScope
                .getTitleIconHorizontalGravity();
        switch (iconGravity) {
            case NONE:
            case OPPOSITE_CONTROL_BUTTONS:
            case NEXT_TO_TITLE:
                return iconGravity;
            case SWING_DEFAULT:
                return RadianceThemingSlices.TitleIconHorizontalGravity.OPPOSITE_CONTROL_BUTTONS;
            case PLATFORM:
            default: {
                RadianceCommonCortex.Platform platform = RadianceCommonCortex.getPlatform();
                switch (platform) {
                    case MACOS:
                        return RadianceThemingSlices.TitleIconHorizontalGravity.NEXT_TO_TITLE;
                    case GNOME:
                        return RadianceThemingSlices.TitleIconHorizontalGravity.NONE;
                    default:
                        return RadianceThemingSlices.TitleIconHorizontalGravity.OPPOSITE_CONTROL_BUTTONS;
                }
            }
        }
    }

    /**
     * Marks the specified child component with the specified extra component kind.
     * 
     * @param comp
     *            Child component.
     * @param kind
     *            Extra kind.
     * @see #EXTRA_COMPONENT_KIND
     */
    public static void markTitlePaneExtraComponent(JComponent comp, ExtraComponentKind kind) {
        comp.putClientProperty(EXTRA_COMPONENT_KIND, kind);
    }

    /**
     * Computes the rectangle of the title text in the specified title pane. This method looks at
     * all the children components of the title pane, grouping them by leading and trailing (based
     * on {@link #EXTRA_COMPONENT_KIND} client property). The title text rectangle is the space
     * between the leading group and the trailing group.
     * 
     * @return Rectangle of the title text.
     * @throws IllegalStateException
     *             If at least one child component of this title pane is not marked with the
     *             {@link #EXTRA_COMPONENT_KIND} client property.
     * @see #markTitlePaneExtraComponent(JComponent, ExtraComponentKind)
     * @see #EXTRA_COMPONENT_KIND
     */
    public static Rectangle getTitlePaneTextRectangle(JComponent titlePane,
            Component rootComponent) {
        boolean leftToRight = rootComponent.getComponentOrientation().isLeftToRight();

        int horizontalPadding = RadianceSizeUtils.getTitlePaneHorizontalPadding(
                RadianceSizeUtils.getComponentFontSize(titlePane));
        if (leftToRight) {
            int maxLeadingX = 0;
            int minTrailingX = titlePane.getWidth();
            int extraWidthTaken = 0;

            for (int i = 0; i < titlePane.getComponentCount(); i++) {
                Component child = titlePane.getComponent(i);
                if (!child.isVisible())
                    continue;
                if (child instanceof JComponent) {
                    ExtraComponentKind kind = (ExtraComponentKind) ((JComponent) child)
                            .getClientProperty(EXTRA_COMPONENT_KIND);
                    if (kind == null) {
                        throw new IllegalStateException(
                                "Title pane child " + child.getClass().getName()
                                        + " is not marked as leading or trailing");
                    }
                    switch (kind) {
                        case LEADING:
                            int childRight = child.getX() + child.getWidth();
                            if (childRight > maxLeadingX)
                                maxLeadingX = childRight;
                            break;
                        case TRAILING:
                            int childLeft = child.getX();
                            if (childLeft < minTrailingX)
                                minTrailingX = childLeft;
                            break;
                        default:
                            extraWidthTaken += child.getWidth();
                    }
                }
            }

            int start = maxLeadingX + horizontalPadding + extraWidthTaken;
            int end = minTrailingX - horizontalPadding;
            return new Rectangle(start, 0, end - start, titlePane.getHeight());
        } else {
            int minLeadingX = titlePane.getWidth();
            int maxTrailingX = 0;
            int extraWidthTaken = 0;

            for (int i = 0; i < titlePane.getComponentCount(); i++) {
                Component child = titlePane.getComponent(i);
                if (!child.isVisible())
                    continue;
                if (child instanceof JComponent) {
                    ExtraComponentKind kind = (ExtraComponentKind) ((JComponent) child)
                            .getClientProperty(EXTRA_COMPONENT_KIND);
                    if (kind == null) {
                        throw new IllegalStateException(
                                "Title pane child " + child.getClass().getName()
                                        + " is not marked as leading or trailing");
                    }
                    switch (kind) {
                        case LEADING:
                            int childLeft = child.getX();
                            if (childLeft < minLeadingX)
                                minLeadingX = childLeft;
                            break;
                        case TRAILING:
                            int childRight = child.getX() + child.getWidth();
                            if (childRight > maxTrailingX)
                                maxTrailingX = childRight;
                            break;
                        default:
                            extraWidthTaken += child.getWidth();
                    }
                }
            }

            int start = maxTrailingX + horizontalPadding;
            int end = minLeadingX - horizontalPadding - extraWidthTaken;
            return new Rectangle(start, 0, end - start, titlePane.getHeight());
        }
    }

}
