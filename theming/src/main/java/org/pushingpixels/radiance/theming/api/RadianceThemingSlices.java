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
package org.pushingpixels.radiance.theming.api;

import org.pushingpixels.radiance.common.internal.contrib.jgoodies.looks.LookUtils;
import org.pushingpixels.radiance.theming.api.shaper.RadianceButtonShaper;
import org.pushingpixels.radiance.theming.api.tabbed.TabCloseCallback;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceOutlineUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * Various constants and data classes used in scope-defined APIs provided by {@link RadianceThemingCortex}.
 *
 * @author Kirill Grouchnikov
 */
public final class RadianceThemingSlices {
    /**
     * Listener for the locale changes.
     *
     * @author Kirill Grouchnikov
     */
    @FunctionalInterface
    public interface LocaleChangeListener {
        /**
         * Called when the locale is changed.
         */
        void localeChanged();
    }

    /**
     * Enumerates available sides.
     *
     * @author Kirill Grouchnikov
     * @see RadianceThemingCortex.ComponentScope#setButtonOpenSide(JComponent, RadianceThemingSlices.Side)
     * @see RadianceThemingCortex.ComponentScope#setButtonStraightSide(JComponent, RadianceThemingSlices.Side)
     */
    public enum Side {
        /**
         * Leading horizontal side.
         */
        LEADING,

        /**
         * Trailing horizontal side.
         */
        TRAILING,

        /**
         * Top side.
         */
        TOP,

        /**
         * Bottom side.
         */
        BOTTOM
    }

    public static class Sides {
        private Set<Side> openSides;
        private Set<Side> straightSides;

        private Sides(Set<Side> openSides, Set<Side> straightSides) {
            this.openSides = openSides;
            this.straightSides = straightSides;
        }

        public Set<Side> getOpenSides() {
            return this.openSides;
        }

        public Set<Side> getStraightSides() {
            return this.straightSides;
        }

        public static Sides CLOSED_RECTANGLE = Sides.builder().setStraightSidesAll().build();

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private Set<Side> openSides = new HashSet<>();
            private Set<Side> straightSides = new HashSet<>();

            public Builder setOpenSides(Set<Side> openSides) {
                this.openSides.clear();
                this.openSides.addAll(openSides);
                return this;
            }

            public Builder setOpenSidesAll() {
                this.openSides.clear();
                this.openSides.addAll(EnumSet.allOf(RadianceThemingSlices.Side.class));
                return this;
            }

            public Builder setStraightSides(Set<Side> straightSides) {
                this.straightSides.clear();
                this.straightSides.addAll(straightSides);
                return this;
            }

            public Builder setStraightSidesAll() {
                this.straightSides.clear();
                this.straightSides.addAll(EnumSet.allOf(RadianceThemingSlices.Side.class));
                return this;
            }

            public Sides build() {
                return new Sides(this.openSides, this.straightSides);
            }
        }
    }

    /**
     * Enumerates focus indication kinds.
     *
     * @author Kirill Grouchnikov
     * @see RadianceThemingCortex.GlobalScope#setFocusKind(RadianceThemingSlices.FocusKind)
     */
    public enum FocusKind {
        /**
         * No focus indication.
         */
        NONE {
            @Override
            public void paintFocus(Component mainComp, Component focusedComp, TransitionAwareUI transitionAwareUI, Graphics2D graphics, double scaleFactor, Shape focusShape, Rectangle textRect, float extraPadding) {
            }
        },

        /**
         * Focus indication around the text.
         */
        TEXT {
            @Override
            public void paintFocus(Component mainComp, Component focusedComp, TransitionAwareUI transitionAwareUI, Graphics2D graphics, double scaleFactor, Shape focusShape, Rectangle textRect, float extraPadding) {
                if (textRect == null)
                    return;
                if ((textRect.width == 0) || (textRect.height == 0))
                    return;

                int fontSize = RadianceSizeUtils.getComponentFontSize(mainComp);
                float dashLength = (float) scaleFactor * getDashLength(fontSize);
                float dashGap = (float) scaleFactor * getDashGap(fontSize);
                float dashPhase = (dashLength + dashGap)
                        * (1.0f - transitionAwareUI.getTransitionTracker().getFocusLoopPosition());

                graphics.setStroke(new BasicStroke(1.0f,
                        BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0.0f,
                        new float[]{dashLength, dashGap}, dashPhase));

                int delta = ((mainComp instanceof JComboBox) || (mainComp instanceof JSpinner)) ? 0
                        : 1;
                Shape contour = RadianceOutlineUtilities.getBaseOutline(
                        mainComp.getComponentOrientation(),
                        (float) scaleFactor * textRect.width + 2 * delta,
                        (float) scaleFactor * textRect.height,
                        (float) scaleFactor * RadianceSizeUtils.getClassicButtonCornerRadius(fontSize),
                        null);

                graphics.translate((float) scaleFactor * textRect.x - delta,
                        (float) scaleFactor * textRect.y);
                graphics.draw(contour);
            }

            @Override
            public boolean isAnimated() {
                return true;
            }
        },

        /**
         * Focus indication around the whole component.
         */
        ALL {
            @Override
            public void paintFocus(Component mainComp, Component focusedComp,
                    TransitionAwareUI transitionAwareUI, Graphics2D graphics, double scaleFactor,
                    Shape focusShape, Rectangle textRect, float extraPadding) {
                int fontSize = RadianceSizeUtils.getComponentFontSize(mainComp);
                float dashLength = (float) scaleFactor * getDashLength(fontSize);
                float dashGap = (float) scaleFactor * getDashGap(fontSize);
                float dashPhase = (dashLength + dashGap) * (1.0f
                        - transitionAwareUI.getTransitionTracker().getFocusLoopPosition());

                if ((focusShape == null)
                        && ((mainComp instanceof AbstractButton) && !(mainComp instanceof JCheckBox)
                        && !(mainComp instanceof JRadioButton))) {
                    RadianceButtonShaper shaper = RadianceCoreUtilities.getButtonShaper(mainComp);
                    if (shaper == null)
                        return;

                    graphics.setStroke(new BasicStroke(
                            1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0.0f,
                            new float[]{dashLength, dashGap}, dashPhase));

                    Shape contour = shaper.getButtonOutline((AbstractButton) mainComp, 1.0f,
                            (float) scaleFactor * mainComp.getWidth(),
                            (float) scaleFactor * mainComp.getHeight(),
                            scaleFactor, false);
                    graphics.draw(contour);
                } else {
                    float delta = RadianceSizeUtils.getBorderStrokeWidth(mainComp);
                    Shape contour = (focusShape != null) ? focusShape
                            : RadianceOutlineUtilities.getBaseOutline(
                            mainComp.getComponentOrientation(),
                            (float) scaleFactor * mainComp.getWidth() - 2 * delta,
                            (float) scaleFactor * mainComp.getHeight() - 2 * delta,
                            (float) scaleFactor * RadianceSizeUtils.getClassicButtonCornerRadius(
                                    RadianceSizeUtils.getComponentFontSize(mainComp)),
                            null);

                    graphics.setStroke(new BasicStroke(
                            1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0.0f,
                            new float[]{dashLength, dashGap}, dashPhase));
                    graphics.draw(contour);
                }
            }

            @Override
            public boolean isAnimated() {
                return true;
            }
        },

        /**
         * Focus indication around the whole component, but moved 1 pixel inside the component.
         */
        ALL_INNER {
            @Override
            public void paintFocus(Component mainComp, Component focusedComp, TransitionAwareUI transitionAwareUI,
                    Graphics2D graphics, double scaleFactor, Shape focusShape, Rectangle textRect,
                    float extraPadding) {

                int fontSize = RadianceSizeUtils.getComponentFontSize(mainComp);
                float dashLength = (float) scaleFactor * getDashLength(fontSize);
                float dashGap = (float) scaleFactor * getDashGap(fontSize);
                float dashPhase = (dashLength + dashGap) * (1.0f
                        - transitionAwareUI.getTransitionTracker().getFocusLoopPosition());

                if ((focusShape == null)
                        && ((mainComp instanceof AbstractButton) && !(mainComp instanceof JCheckBox)
                        && !(mainComp instanceof JRadioButton))) {
                    RadianceButtonShaper shaper = RadianceCoreUtilities.getButtonShaper(mainComp);
                    if (shaper == null)
                        return;

                    if (shaper.isProportionate()) {
                        graphics.setStroke(new BasicStroke(
                                1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0.0f,
                                new float[]{dashLength, dashGap}, dashPhase));
                        float insetsPix = extraPadding;

                        Shape contour = shaper.getButtonOutline((AbstractButton) mainComp, insetsPix,
                                (float) scaleFactor * mainComp.getWidth(),
                                (float) scaleFactor * mainComp.getHeight(), scaleFactor, true);
                        graphics.draw(contour);
                    }
                } else {
                    graphics.translate(extraPadding / 2, extraPadding / 2);
                    Shape contour = (focusShape != null) ? focusShape
                            : RadianceOutlineUtilities.getBaseOutline(
                            mainComp.getComponentOrientation(),
                            (float) scaleFactor * mainComp.getWidth() - extraPadding,
                            (float) scaleFactor * mainComp.getHeight() - extraPadding,
                            (float) scaleFactor * RadianceSizeUtils.getClassicButtonCornerRadius(fontSize)
                                    - extraPadding,
                            null);

                    graphics.setStroke(new BasicStroke(
                            1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0.0f,
                            new float[]{dashLength, dashGap}, dashPhase));
                    graphics.draw(contour);
                }
            }

            @Override
            public boolean isAnimated() {
                return true;
            }
        },

        /**
         * Focus indication around the whole component, but moved 1 pixel inside the component.
         */
        ALL_STRONG_INNER {
            @Override
            public void paintFocus(Component mainComp, Component focusedComp, TransitionAwareUI transitionAwareUI, Graphics2D graphics, double scaleFactor, Shape focusShape, Rectangle textRect, float extraPadding) {
                int fontSize = RadianceSizeUtils.getComponentFontSize(mainComp);
                graphics.setStroke(new BasicStroke(1.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
                if ((focusShape == null)
                        && ((mainComp instanceof AbstractButton) && !(mainComp instanceof JCheckBox)
                        && !(mainComp instanceof JRadioButton))) {
                    RadianceButtonShaper shaper = RadianceCoreUtilities.getButtonShaper(mainComp);
                    if (shaper == null)
                        return;

                    if (shaper.isProportionate()) {
                        Shape contour = shaper.getButtonOutline((AbstractButton) mainComp, extraPadding,
                                (float) scaleFactor * mainComp.getWidth(),
                                (float) scaleFactor * mainComp.getHeight(),
                                scaleFactor, true);
                        graphics.draw(contour);
                    }
                } else {
                    graphics.translate(extraPadding / 2, extraPadding / 2);
                    Shape contour = (focusShape != null) ? focusShape
                            : RadianceOutlineUtilities.getBaseOutline(
                            mainComp.getComponentOrientation(),
                            (float) scaleFactor * mainComp.getWidth() - extraPadding,
                            (float) scaleFactor * mainComp.getHeight() - extraPadding,
                            (float) scaleFactor * RadianceSizeUtils.getClassicButtonCornerRadius(fontSize)
                                    - extraPadding,
                            null);

                    graphics.draw(contour);
                }
            }
        },

        /**
         * Focus indication under the component text.
         */
        UNDERLINE {
            @Override
            public void paintFocus(Component mainComp, Component focusedComp, TransitionAwareUI transitionAwareUI, Graphics2D graphics, double scaleFactor, Shape focusShape, Rectangle textRect, float extraPadding) {
                if (textRect == null)
                    return;

                int fontSize = RadianceSizeUtils.getComponentFontSize(mainComp);
                float dashLength = (float) scaleFactor * getDashLength(fontSize);
                float dashGap = (float) scaleFactor * getDashGap(fontSize);
                float dashPhase = (dashLength + dashGap)
                        * (1.0f - transitionAwareUI.getTransitionTracker().getFocusLoopPosition());

                graphics.setStroke(new BasicStroke(
                        1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0.0f,
                        new float[]{dashLength, dashGap}, dashPhase));

                graphics.translate((float) scaleFactor * textRect.x - 1, (float) scaleFactor * textRect.y);
                graphics.drawLine(0, (int) (scaleFactor * textRect.height - 1),
                        (int) (scaleFactor * textRect.width), (int) (scaleFactor * textRect.height - 1));
                graphics.dispose();
            }

            @Override
            public boolean isAnimated() {
                return true;
            }
        },

        /**
         * Strong focus indication under the component text.
         */
        STRONG_UNDERLINE {
            @Override
            public void paintFocus(Component mainComp, Component focusedComp, TransitionAwareUI transitionAwareUI, Graphics2D graphics, double scaleFactor, Shape focusShape, Rectangle textRect, float extraPadding) {
                if (textRect == null)
                    return;

                graphics.setStroke(new BasicStroke(
                        1.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
                graphics.translate((float) scaleFactor * textRect.x - 1,
                        (float) scaleFactor * textRect.y);
                graphics.drawLine(0, (int) (scaleFactor * textRect.height - 1),
                        (int) (scaleFactor * textRect.width), (int) (scaleFactor * textRect.height - 1));
            }
        };

        public abstract void paintFocus(Component mainComp, Component focusedComp,
                TransitionAwareUI transitionAwareUI, Graphics2D graphics, double scaleFactor,
                Shape focusShape, Rectangle textRect, float extraPadding);

        /**
         * Returns DPI-aware dash length for dash-based focus painting.
         *
         * @param fontSize The font size of the component for focus painting.
         * @return DPI-aware dash length for dash-based focus painting.
         */
        protected final float getDashLength(int fontSize) {
            return 2.0f + RadianceSizeUtils.getExtraPadding(fontSize);
        }

        /**
         * Returns DPI-aware dash gap for dash-based focus painting.
         *
         * @param fontSize The font size of the component for focus painting.
         * @return DPI-aware dash gap for dash-based focus painting.
         */
        protected final float getDashGap(int fontSize) {
            return getDashLength(fontSize) / 2.0f;
        }

        /**
         * Returns indication whether <code>this</code> focus kind can be animated. For example,
         * focus rings painted with solid lines are generally static.
         *
         * @return <code>true</code> if <code>this</code> focus kind can be animated,
         * <code>false</code> otherwise.
         */
        public boolean isAnimated() {
            return false;
        }
    }

    /**
     * Enumerates possible modes of closing tabs.
     *
     * @author Kirill Grouchnikov
     * @see RadianceThemingCortex.ComponentScope#setTabCloseCallback(JTabbedPane, TabCloseCallback)
     */
    public enum TabCloseKind {
        /**
         * Indicates that no tabs should be closed.
         */
        NONE,

        /**
         * Indicates that the specified tab should be closed.
         */
        THIS,

        /**
         * Indicates that all tabs should be closed.
         */
        ALL,

        /**
         * Indicates that all tabs except the specified should be closed.
         */
        ALL_BUT_THIS
    }

    /**
     * Tab content pane border kind.
     *
     * @author Kirill Grouchnikov
     */
    public enum TabContentPaneBorderKind {
        /**
         * The content pane has double border along the tab placement side. This is the default.
         */
        DOUBLE_PLACEMENT,

        /**
         * The content pane has single border along the tab placement side.
         */
        SINGLE_PLACEMENT
    }

    /**
     * Enumerates configurable Radiance-specific widget types for
     * {@link RadianceThemingCortex.GlobalScope#setWidgetVisible(boolean, WidgetType...)} and
     * {@link RadianceThemingCortex.WindowScope#setWidgetVisible(java.awt.Window, boolean, WidgetType...)}
     * APIs.
     *
     * @author Kirill Grouchnikov
     */
    public enum WidgetType {
        /**
         * Menu search widget.
         */
        MENU_SEARCH,
    }

    /**
     * Button order for grouped buttons.
     */
    public enum ButtonOrder {
        /**
         * Platform-specific order. On macOS the default button will be the placed the closest to
         * the trailing edge of the button group (rightmost under LTR and leftmost under RTL). On
         * other platforms the default button will be placed closest to the leading edge of the
         * button group (leftmost under LTR and rightmost under RTL).
         */
        PLATFORM {
            @Override
            public boolean isDefaultButtonLeading() {
                return !LookUtils.IS_OS_MAC;
            }
        },

        /**
         * The default button will be placed closest to the leading edge of the button group
         * (leftmost under LTR and rightmost under RTL).
         */
        DEFAULT_AS_LEADING {
            @Override
            public boolean isDefaultButtonLeading() {
                return true;
            }
        },

        /**
         * The default button will be placed closest to the trailing edge of the button group
         * (rightmost under LTR and leftmost under RTL).
         */
        DEFAULT_AS_TRAILING {
            @Override
            public boolean isDefaultButtonLeading() {
                return false;
            }
        },

        /**
         * The default button will be placed as it is under default Swing behavior.
         */
        SWING_DEFAULT {
            @Override
            public boolean isDefaultButtonLeading() {
                return true;
            }
        };

        public abstract boolean isDefaultButtonLeading();
    }

    public enum HorizontalGravity {
        /**
         * Platform-specific content gravity.
         */
        PLATFORM,

        /**
         * Align content to the leading edge of the parent container. Leading edge is left under LTR
         * component orientation and right under RTL component orientation.
         */
        LEADING,

        /**
         * Center content horizontally in the parent container.
         */
        CENTERED,

        /**
         * Align content to the trailing edge of the parent container. Trailing edge is right under
         * LTR component orientation and left under RTL component orientation.
         */
        TRAILING,

        /**
         * Swing default content gravity.
         */
        SWING_DEFAULT
    }

    public enum VerticalGravity {
        /**
         * Align content to the top edge of the parent container.
         */
        TOP,

        /**
         * Center content horizontally in the parent container.
         */
        CENTERED,

        /**
         * Align content to the bottom edge of the parent container.
         */
        BOTTOM
    }

    public enum TitleIconHorizontalGravity {
        /**
         * Platform-specific icon gravity.
         */
        PLATFORM,

        /**
         * Do not show icon.
         */
        NONE,

        /**
         * Align icon next to the title text (on the left under LTR component orientation and on the
         * right under RTL component orientation.
         */
        NEXT_TO_TITLE,

        /**
         * Align icon on the side of the title pane opposite to that of the control buttons.
         */
        OPPOSITE_CONTROL_BUTTONS,

        /**
         * Swing default icon gravity.
         */
        SWING_DEFAULT
    }

    /**
     * Password strength.
     *
     * @author Kirill Grouchnikov
     */
    public enum PasswordStrength {
        /**
         * Weak strength.
         */
        WEAK,

        /**
         * Medium strength.
         */
        MEDIUM,

        /**
         * Strong strength.
         */
        STRONG
    }

    /**
     * Animation facet.
     *
     * @author Kirill Grouchnikov.
     */
    public final static class AnimationFacet {
        /**
         * Animation facet display name.
         */
        protected String displayName;

        /**
         * Creates a new animation facet.
         *
         * @param displayName      Display name for the animation facet.
         * @param isDefaultAllowed Indicates whether this animation facet is allowed by default.
         */
        public AnimationFacet(String displayName, boolean isDefaultAllowed) {
            this.displayName = displayName;
            if (isDefaultAllowed) {
                AnimationConfigurationManager.getInstance().allowAnimations(this);
            }
        }

        /**
         * Arming a component.
         */
        public static final AnimationFacet ARM = new AnimationFacet("radiance.theming.core.arm", true);

        /**
         * Pressing a component.
         */
        public static final AnimationFacet PRESS = new AnimationFacet("radiance.theming.core.press", true);

        /**
         * Focusing a component.
         */
        public static final AnimationFacet FOCUS = new AnimationFacet("radiance.theming.core.focus", true);

        /**
         * <p>
         * Focus loop animation. Disabled by default, use
         * {@link RadianceThemingCortex.GlobalScope#allowAnimations(RadianceThemingSlices.AnimationFacet)} to
         * enable.
         * </p>
         */
        public static final AnimationFacet FOCUS_LOOP_ANIMATION = new AnimationFacet(
                "radiance.theming.core.focusLoopAnimation", false);

        /**
         * Rollover a component.
         */
        public static final AnimationFacet ROLLOVER = new AnimationFacet("radiance.theming.core.rollover", true);

        /**
         * Selecting a component.
         */
        public static final AnimationFacet SELECTION = new AnimationFacet("radiance.theming.core.selection", true);

        /**
         * <i>Ghosting image</i> effects on button icons when the button is rolled-over. Disabled by
         * default, use
         * {@link RadianceThemingCortex.GlobalScope#allowAnimations(RadianceThemingSlices.AnimationFacet)} to
         * enable.
         */
        public static final AnimationFacet GHOSTING_ICON_ROLLOVER = new AnimationFacet(
                "radiance.theming.core.ghosting.iconRollover", false);

        /**
         * <i>Ghosting image</i> effects on buttons when the button is pressed. Disabled by default,
         * use
         * {@link RadianceThemingCortex.GlobalScope#allowAnimations(RadianceThemingSlices.AnimationFacet)} to
         * enable.
         */
        public static final AnimationFacet GHOSTING_BUTTON_PRESS = new AnimationFacet(
                "radiance.theming.core.ghosting.buttonPress", false);

        /**
         * Glow effect on icons when the relevant control is rolled over. Disabled by default, use
         * {@link RadianceThemingCortex.GlobalScope#allowAnimations(RadianceThemingSlices.AnimationFacet)} to
         * enable.
         */
        public static final AnimationFacet ICON_GLOW = new AnimationFacet(
                "radiance.theming.core.iconGlow", false);

        /**
         * Smart tree scroll animation facet. Disabled by default, use
         * {@link RadianceThemingCortex.GlobalScope#allowAnimations(RadianceThemingSlices.AnimationFacet)} to
         * enable.
         *
         * <p>
         * Smart tree scroll is relevant for scroll panes containing a tree. When enabled, it
         * automatically scrolls the tree horizontally when the viewport shows mainly empty area
         * (especially relevant for multi-level trees with narrow viewports).
         * </p>
         */
        public final static AnimationFacet TREE_SMART_SCROLL_ANIMATION = new AnimationFacet(
                "radiance.theming.treeSmartScrollAnimation", false);

        @Override
        public String toString() {
            return this.displayName;
        }
    }

    /**
     * Enumeration of available decoration area types. This class is part of officially supported
     * API.
     *
     * @author Kirill Grouchnikov
     */
    public final static class DecorationAreaType {
        private String displayName;

        public DecorationAreaType(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public String toString() {
            return this.displayName;
        }

        /**
         * Title pane of primary, top-level windows (frames, dialogs).
         */
        public final static DecorationAreaType PRIMARY_TITLE_PANE =
                new DecorationAreaType("Primary title pane");

        /**
         * Title pane of secondary, non top-level windows (internal frames, desktop icons).
         */
        public final static DecorationAreaType SECONDARY_TITLE_PANE =
                new DecorationAreaType("Secondary title pane");

        /**
         * Tool bar.
         */
        public final static DecorationAreaType TOOLBAR = new DecorationAreaType("Toolbar");

        /**
         * Any area that can be placed in the top portion of its window. Menu bar is an example of a
         * core Swing component.
         */
        public final static DecorationAreaType HEADER = new DecorationAreaType("Header");

        /**
         * Any area that can be placed in the bottom portion of its window.
         */
        public final static DecorationAreaType FOOTER = new DecorationAreaType("Footer");

        /**
         * Control pane area, such as sidebars / task panes or ribbon bands in Component.
         */
        public final static DecorationAreaType CONTROL_PANE = new DecorationAreaType("Control pane");

        /**
         * The default decoration area type. Components placed in areas with this type do not get
         * any special background decoration painting.
         */
        public final static DecorationAreaType NONE = new DecorationAreaType("None");

        public String getDisplayName() {
            return this.displayName;
        }
    }

    /**
     * Enumeration of available color overlay types. This class is part of officially supported API.
     *
     * @author Kirill Grouchnikov
     */
    public enum ColorOverlayType {
        LINE,
        FOCUS_INDICATION,
        BACKGROUND_FILL,
        TEXT_BACKGROUND_FILL,
        SELECTION_BACKGROUND_FILL,
        SELECTION_FOREGROUND
    }

    /**
     * Enumerates available icon filter strategies.
     *
     * @author Kirill Grouchnikov
     */
    public enum IconFilterStrategy {
        /**
         * The icon is always painted in its original appearance.
         */
        ORIGINAL,

        /**
         * The icon is themed based on the current text color.
         */
        THEMED_FOLLOW_TEXT,

        /**
         * The icon is themed based on the color scheme that matches the current component state.
         */
        THEMED_FOLLOW_COLOR_SCHEME
    }

    public enum BackgroundAppearanceStrategy {
        /**
         * Never paint background.
         */
        NEVER,

        /**
         * Paint background only when selected, armed, pressed or (possibly) hovered over.
         */
        FLAT,

        /**
         * Always paint background.
         */
        ALWAYS
    }

    public abstract static class PopupPlacementStrategy {
        private PopupPlacementStrategy() {
        }

        public final static class Upward extends PopupPlacementStrategy {
            private Upward() {
            }

            public final static Upward HALIGN_START = new Upward();
            public final static Upward HALIGN_END = new Upward();
        }

        public final static class Downward extends PopupPlacementStrategy {
            private Downward() {
            }

            public final static Downward HALIGN_START = new Downward();
            public final static Downward HALIGN_END = new Downward();
        }

        public final static class CenteredVertically extends PopupPlacementStrategy {
            private CenteredVertically() {
            }

            public final static CenteredVertically HALIGN_START = new CenteredVertically();
            public final static CenteredVertically HALIGN_END = new CenteredVertically();
        }

        public final static class Startward extends PopupPlacementStrategy {
            private Startward() {
            }

            public final static Startward VALIGN_TOP = new Startward();
            public final static Startward VALIGN_BOTTOM = new Startward();
        }

        public final static class Endward extends PopupPlacementStrategy {
            private Endward() {
            }

            public final static Endward VALIGN_TOP = new Endward();
            public final static Endward VALIGN_BOTTOM = new Endward();
        }
    }

    /**
     * Allows associating different color schemes to different visual parts of UI components. For
     * example, the {@link JCheckBox} has three different visual areas:
     * <ul>
     * <li>Border - assciated with {@link #BORDER}</li>
     * <li>Fill - associated with {@link #MARK_BOX}</li>
     * <li>Check mark - associated with {@link #MARK}</li>
     * </ul>
     * <p>
     * Applications can create custom instances of this class to further refine the control over the
     * painting. In this case, the custom UI delegates must be created to use these new association
     * kinds.
     *
     * @author Kirill Grouchnikov
     */
    public final static class ColorSchemeAssociationKind {
        /**
         * All known association kind values.
         */
        private static Set<ColorSchemeAssociationKind> values = new HashSet<>();

        /**
         * Name for this association kind.
         */
        private String name;

        /**
         * Fallback for this association kind. This is used when no color scheme is associated with
         * this kind. For example, {@link #TAB_BORDER} specifies that its fallback is
         * {@link #BORDER}. When the {@link JTabbedPane} UI delegate is painting the tabs, it will
         * try to use the color scheme associated with {@link #TAB_BORDER}. If none was registered,
         * it will fall back to use the color scheme associated with {@link #BORDER}, and if that is
         * not registered as well, will use the color scheme associated with {@link #FILL}.
         */
        private ColorSchemeAssociationKind fallback;

        /**
         * Creates a new association kind.
         *
         * @param name     Association kind name.
         * @param fallback Fallback association kind. This is used when no color scheme is
         *                 associated with this kind. For example, {@link #TAB_BORDER} specifies that its
         *                 fallback is {@link #BORDER}. When the {@link JTabbedPane} UI delegate is
         *                 painting the tabs, it will try to use the color scheme associated with
         *                 {@link #TAB_BORDER}.
         *                 If none was registered, it will fall back to use the color scheme associated
         *                 with {@link #BORDER}, and if that is not registered as well, will use the
         *                 color scheme associated with {@link #FILL}.
         */
        public ColorSchemeAssociationKind(String name, ColorSchemeAssociationKind fallback) {
            this.name = name;
            this.fallback = fallback;
            values.add(this);
        }

        @Override
        public String toString() {
            return this.name;
        }

        /**
         * The default visual area that is used for the inner part of most controls.
         */
        public static final ColorSchemeAssociationKind FILL = new ColorSchemeAssociationKind("fill", null);

        /**
         * Visual area of separators.
         */
        public static final ColorSchemeAssociationKind SEPARATOR = new ColorSchemeAssociationKind("separator", FILL);

        /**
         * Fill visual area of the tabs.
         */
        public static final ColorSchemeAssociationKind TAB = new ColorSchemeAssociationKind("tab", FILL);

        /**
         * Border visual area of non-tab controls.
         */
        public static final ColorSchemeAssociationKind BORDER = new ColorSchemeAssociationKind("border", FILL);

        /**
         * Visual area of marks. Used for painting check marks of checkboxes and radio buttons, as
         * well as arrow icons of combo boxes, spinners and more.
         */
        public static final ColorSchemeAssociationKind MARK = new ColorSchemeAssociationKind("mark", BORDER);

        /**
         * Visual area of mark boxes. Used for painting the box of checkboxes and radio buttons.
         */
        public static final ColorSchemeAssociationKind MARK_BOX = new ColorSchemeAssociationKind("markBox", FILL);

        /**
         * Visual area of focus indication.
         */
        public static final ColorSchemeAssociationKind FOCUS = new ColorSchemeAssociationKind("focus", MARK);

        /**
         * Border visual area of the tabs.
         */
        public static final ColorSchemeAssociationKind TAB_BORDER = new ColorSchemeAssociationKind("tabBorder", BORDER);

        /**
         * Highlight visual areas for lists, tables, trees and menus.
         */
        public static final ColorSchemeAssociationKind HIGHLIGHT = new ColorSchemeAssociationKind("highlight", FILL);

        /**
         * Highlight visual areas for text components.
         */
        public static final ColorSchemeAssociationKind HIGHLIGHT_TEXT =
                new ColorSchemeAssociationKind("highlightText", HIGHLIGHT);

        /**
         * Border visual areas for highlighted regions of lists, tables, trees and menus.
         */
        public static final ColorSchemeAssociationKind HIGHLIGHT_BORDER =
                new ColorSchemeAssociationKind("highlightBorder", BORDER);

        /**
         * Visual area of marks in highlighted regions of lists, tables, trees and menus.
         */
        public static final ColorSchemeAssociationKind HIGHLIGHT_MARK =
                new ColorSchemeAssociationKind("highlightMark", MARK);

        /**
         * Returns all available association kinds.
         *
         * @return All available association kinds.
         */
        public static Set<ColorSchemeAssociationKind> values() {
            return Collections.unmodifiableSet(values);
        }

        /**
         * Returns the fallback for this association kind.
         *
         * @return The fallback for this association kind.
         */
        public ColorSchemeAssociationKind getFallback() {
            return fallback;
        }
    }

    /**
     * Defines a single facet of core and custom {@link ComponentState}s. See Javadocs of the
     * {@link ComponentState} class for more information on state facets.
     */
    public final static class ComponentStateFacet {
        int value;

        String name;

        /**
         * Facet that describes the enabled bit.
         */
        public static final ComponentStateFacet ENABLE = new ComponentStateFacet("enable", 0);

        /**
         * Facet that describes the rollover bit.
         */
        public static final ComponentStateFacet ROLLOVER = new ComponentStateFacet("rollover", 10);

        /**
         * Facet that describes the selection bit.
         */
        public static final ComponentStateFacet SELECTION = new ComponentStateFacet("selection", 10);

        /**
         * Facet that describes the press bit.
         */
        public static final ComponentStateFacet PRESS = new ComponentStateFacet("press", 50);

        /**
         * Facet that describes the arm bit. This is relevant for menu items.
         */
        public static final ComponentStateFacet ARM = new ComponentStateFacet("arm", 10);

        /**
         * Facet that describes the default bit. This is relevant for buttons which can be set as
         * default with the {@link JRootPane#setDefaultButton(javax.swing.JButton)} API.
         */
        public static final ComponentStateFacet DEFAULT = new ComponentStateFacet("default", 500);

        /**
         * Facet that describes the determinate bit.
         */
        public static final ComponentStateFacet DETERMINATE = new ComponentStateFacet("determinate", 10);

        /**
         * Facet that describes the determinate bit.
         */
        public static final ComponentStateFacet INDETERMINATE = new ComponentStateFacet("indeterminate", 10);

        /**
         * Facet that describes the determinate bit.
         */
        public static final ComponentStateFacet MIX = new ComponentStateFacet("mix", 10);

        /**
         * Creates a new facet.
         *
         * @param name  Facet name.
         * @param value Facet value. This is used in the matching algorithm described in the
         *              javadocs of {@link ComponentState}. The larger the value, the more importance is
         *              given to the specific facet.
         */
        public ComponentStateFacet(String name, int value) {
            this.name = name;
            if (value < 0) {
                throw new IllegalArgumentException("Facet value must be non-negative");
            }
            this.value = value;
        }

        @Override
        public String toString() {
            return this.name + ":" + this.value;
        }
    }
}
