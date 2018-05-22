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
package org.pushingpixels.substance.api;

import java.awt.BasicStroke;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.text.JTextComponent;

import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.contrib.jgoodies.looks.LookUtils;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceOutlineUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

/**
 * Various constants and data classes used in scope-defined APIs provided by
 * {@link SubstanceCortex}.
 * 
 * @author Kirill Grouchnikov
 */
public final class SubstanceSlices {
    /**
     * Listener for the locale changes.
     * 
     * @author Kirill Grouchnikov
     */
    public interface LocaleChangeListener {
        /**
         * Called when the locale is changed.
         */
        public void localeChanged();
    }

    /**
     * Enumerates available sides.
     * 
     * @author Kirill Grouchnikov
     * @see SubstanceLookAndFeel#BUTTON_OPEN_SIDE
     * @see SubstanceLookAndFeel#BUTTON_STRAIGHT_SIDE
     */
    public static enum Side {
        /**
         * Left side.
         */
        LEFT,

        /**
         * Right side.
         */
        RIGHT,

        /**
         * Top side.
         */
        TOP,

        /**
         * Bottom side.
         */
        BOTTOM;
    }

    /**
     * Enumerates focus indication kinds.
     * 
     * @author Kirill Grouchnikov
     * @see SubstanceLookAndFeel#FOCUS_KIND
     */
    public static enum FocusKind {
        /**
         * No focus indication.
         */
        NONE {
            @Override
            public void paintFocus(Component mainComp, Component focusedComp,
                    TransitionAwareUI transitionAwareUI, Graphics2D graphics, Shape focusShape,
                    Rectangle textRect, float extraPadding) {
            }
        },

        /**
         * Focus indication around the text.
         */
        TEXT {
            @Override
            public void paintFocus(Component mainComp, Component focusedComp,
                    TransitionAwareUI transitionAwareUI, Graphics2D graphics, Shape focusShape,
                    Rectangle textRect, float extraPadding) {
                if (textRect == null)
                    return;
                if ((textRect.width == 0) || (textRect.height == 0))
                    return;

                int fontSize = SubstanceSizeUtils.getComponentFontSize(mainComp);
                float dashLength = getDashLength(fontSize);
                float dashGap = getDashGap(fontSize);
                float dashPhase = (dashLength + dashGap)
                        * (1.0f - transitionAwareUI.getTransitionTracker().getFocusLoopPosition());

                graphics.setStroke(new BasicStroke(SubstanceSizeUtils.getFocusStrokeWidth(),
                        BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0.0f,
                        new float[] { dashLength, dashGap }, dashPhase));

                int delta = ((mainComp instanceof JComboBox) || (mainComp instanceof JSpinner)) ? 0
                        : 1;
                GeneralPath contour = SubstanceOutlineUtilities.getBaseOutline(
                        textRect.width + 2 * delta, textRect.height,
                        SubstanceSizeUtils.getClassicButtonCornerRadius(fontSize), null);

                graphics.translate(textRect.x - delta, textRect.y);
                graphics.draw(contour);
            }

            /*
             * (non-Javadoc)
             * 
             * @see org.pushingpixels.substance.utils.SubstanceConstants.FocusKind #isAnimated ()
             */
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
                    TransitionAwareUI transitionAwareUI, Graphics2D graphics, Shape focusShape,
                    Rectangle textRect, float extraPadding) {
                if ((focusShape == null)
                        && ((mainComp instanceof AbstractButton) && !(mainComp instanceof JCheckBox)
                                && !(mainComp instanceof JRadioButton))) {
                    SubstanceButtonShaper shaper = SubstanceCoreUtilities.getButtonShaper(mainComp);
                    if (shaper == null)
                        return;

                    int fontSize = SubstanceSizeUtils.getComponentFontSize(mainComp);
                    float dashLength = getDashLength(fontSize);
                    float dashGap = getDashGap(fontSize);
                    float dashPhase = (dashLength + dashGap) * (1.0f
                            - transitionAwareUI.getTransitionTracker().getFocusLoopPosition());
                    graphics.setStroke(new BasicStroke(SubstanceSizeUtils.getFocusStrokeWidth(),
                            BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0.0f,
                            new float[] { dashLength, dashGap }, dashPhase));

                    Shape contour = shaper.getButtonOutline((AbstractButton) mainComp,
                            2 * SubstanceSizeUtils.getBorderStrokeWidth(), mainComp.getWidth(),
                            mainComp.getHeight(), false);
                    graphics.draw(contour);
                } else {
                    float delta = SubstanceSizeUtils.getBorderStrokeWidth();
                    Shape contour = (focusShape != null) ? focusShape
                            : SubstanceOutlineUtilities.getBaseOutline(
                                    mainComp.getWidth() - 2 * delta,
                                    mainComp.getHeight() - 2 * delta,
                                    SubstanceSizeUtils.getClassicButtonCornerRadius(
                                            SubstanceSizeUtils.getComponentFontSize(mainComp)),
                                    null);

                    int fontSize = SubstanceSizeUtils.getComponentFontSize(mainComp);
                    float dashLength = getDashLength(fontSize);
                    float dashGap = getDashGap(fontSize);
                    float dashPhase = (dashLength + dashGap) * (1.0f
                            - transitionAwareUI.getTransitionTracker().getFocusLoopPosition());
                    graphics.setStroke(new BasicStroke(SubstanceSizeUtils.getFocusStrokeWidth(),
                            BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0.0f,
                            new float[] { dashLength, dashGap }, dashPhase));
                    graphics.draw(contour);
                }
            }

            /*
             * (non-Javadoc)
             * 
             * @see org.pushingpixels.substance.utils.SubstanceConstants.FocusKind #isAnimated ()
             */
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
            public void paintFocus(Component mainComp, Component focusedComp,
                    TransitionAwareUI transitionAwareUI, Graphics2D graphics, Shape focusShape,
                    Rectangle textRect, float extraPadding) {

                if ((focusShape == null)
                        && ((mainComp instanceof AbstractButton) && !(mainComp instanceof JCheckBox)
                                && !(mainComp instanceof JRadioButton))) {
                    SubstanceButtonShaper shaper = SubstanceCoreUtilities.getButtonShaper(mainComp);
                    if (shaper == null)
                        return;

                    if (shaper.isProportionate()) {
                        int fontSize = SubstanceSizeUtils.getComponentFontSize(mainComp);
                        float dashLength = getDashLength(fontSize);
                        float dashGap = getDashGap(fontSize);
                        float dashPhase = (dashLength + dashGap) * (1.0f
                                - transitionAwareUI.getTransitionTracker().getFocusLoopPosition());
                        graphics.setStroke(new BasicStroke(SubstanceSizeUtils.getFocusStrokeWidth(),
                                BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0.0f,
                                new float[] { dashLength, dashGap }, dashPhase));
                        float insetsPix = extraPadding;

                        Shape contour = shaper.getButtonOutline((AbstractButton) mainComp,
                                insetsPix, mainComp.getWidth(), mainComp.getHeight(), true);
                        graphics.draw(contour);
                    }
                } else {
                    graphics.translate(extraPadding / 2, extraPadding / 2);
                    int fontSize = SubstanceSizeUtils.getComponentFontSize(mainComp);
                    Shape contour = (focusShape != null) ? focusShape
                            : SubstanceOutlineUtilities.getBaseOutline(
                                    mainComp.getWidth() - extraPadding,
                                    mainComp.getHeight() - extraPadding,
                                    SubstanceSizeUtils.getClassicButtonCornerRadius(fontSize)
                                            - extraPadding,
                                    null);

                    float dashLength = getDashLength(fontSize);
                    float dashGap = getDashGap(fontSize);
                    float dashPhase = (dashLength + dashGap) * (1.0f
                            - transitionAwareUI.getTransitionTracker().getFocusLoopPosition());

                    graphics.setStroke(new BasicStroke(SubstanceSizeUtils.getFocusStrokeWidth(),
                            BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0.0f,
                            new float[] { dashLength, dashGap }, dashPhase));
                    graphics.draw(contour);
                }
            }

            /*
             * (non-Javadoc)
             * 
             * @see org.pushingpixels.substance.utils.SubstanceConstants.FocusKind #isAnimated ()
             */
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
            public void paintFocus(Component mainComp, Component focusedComp,
                    TransitionAwareUI transitionAwareUI, Graphics2D graphics, Shape focusShape,
                    Rectangle textRect, float extraPadding) {
                int fontSize = SubstanceSizeUtils.getComponentFontSize(mainComp);
                graphics.setStroke(new BasicStroke(1.5f * SubstanceSizeUtils.getFocusStrokeWidth(),
                        BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
                if ((focusShape == null)
                        && ((mainComp instanceof AbstractButton) && !(mainComp instanceof JCheckBox)
                                && !(mainComp instanceof JRadioButton))) {
                    SubstanceButtonShaper shaper = SubstanceCoreUtilities.getButtonShaper(mainComp);
                    if (shaper == null)
                        return;

                    if (shaper.isProportionate()) {
                        Shape contour = shaper.getButtonOutline((AbstractButton) mainComp,
                                extraPadding, mainComp.getWidth(), mainComp.getHeight(), true);
                        graphics.draw(contour);
                    }
                } else {
                    graphics.translate(extraPadding / 2, extraPadding / 2);
                    Shape contour = (focusShape != null) ? focusShape
                            : SubstanceOutlineUtilities.getBaseOutline(
                                    mainComp.getWidth() - extraPadding,
                                    mainComp.getHeight() - extraPadding,
                                    SubstanceSizeUtils.getClassicButtonCornerRadius(fontSize)
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
            public void paintFocus(Component mainComp, Component focusedComp,
                    TransitionAwareUI transitionAwareUI, Graphics2D graphics, Shape focusShape,
                    Rectangle textRect, float extraPadding) {
                if (textRect == null)
                    return;

                int fontSize = SubstanceSizeUtils.getComponentFontSize(mainComp);
                float dashLength = getDashLength(fontSize);
                float dashGap = getDashGap(fontSize);
                float dashPhase = (dashLength + dashGap)
                        * (1.0f - transitionAwareUI.getTransitionTracker().getFocusLoopPosition());

                graphics.setStroke(new BasicStroke(SubstanceSizeUtils.getFocusStrokeWidth(),
                        BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0.0f,
                        new float[] { dashLength, dashGap }, dashPhase));

                graphics.translate(textRect.x - 1, textRect.y);
                graphics.drawLine(0, textRect.height - 1, textRect.width, textRect.height - 1);
                graphics.dispose();
            }

            /*
             * (non-Javadoc)
             * 
             * @see org.pushingpixels.substance.utils.SubstanceConstants.FocusKind #isAnimated ()
             */
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
            public void paintFocus(Component mainComp, Component focusedComp,
                    TransitionAwareUI transitionAwareUI, Graphics2D graphics, Shape focusShape,
                    Rectangle textRect, float extraPadding) {
                if (textRect == null)
                    return;

                graphics.setStroke(new BasicStroke(1.5f * SubstanceSizeUtils.getFocusStrokeWidth(),
                        BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
                graphics.translate(textRect.x - 1, textRect.y);
                graphics.drawLine(0, textRect.height - 1, textRect.width, textRect.height - 1);
            }
        };

        /**
         * Paints the focus ring on the specified component.
         * 
         * @param mainComp
         *            The main component for the focus painting.
         * @param focusedComp
         *            The actual component that has the focus. For example, the main component can
         *            be a {@link JSpinner}, while the focused component is a text field inside the
         *            the spinner editor.
         * @param graphics
         *            Graphics context.
         * @param focusShape
         *            Focus shape. May be <code>null</code> - in this case, the bounds of
         *            <code>mainComp</code> will be used.
         * @param textRect
         *            Text rectangle (if relevant).
         * @param extraPadding
         *            Extra padding between the component bounds and the focus ring painting.
         */
        public abstract void paintFocus(Component mainComp, Component focusedComp,
                TransitionAwareUI transitionAwareUI, Graphics2D graphics, Shape focusShape,
                Rectangle textRect, float extraPadding);

        /**
         * Returns DPI-aware dash length for dash-based focus painting.
         * 
         * @param fontSize
         *            The font size of the component for focus painting.
         * @return DPI-aware dash length for dash-based focus painting.
         */
        protected static float getDashLength(int fontSize) {
            return 2.0f + SubstanceSizeUtils.getExtraPadding(fontSize);
        }

        /**
         * Returns DPI-aware dash gap for dash-based focus painting.
         * 
         * @param fontSize
         *            The font size of the component for focus painting.
         * @return DPI-aware dash gap for dash-based focus painting.
         */
        protected static float getDashGap(int fontSize) {
            return getDashLength(fontSize) / 2.0f;
        }

        /**
         * Returns indication whether <code>this</code> focus kind can be animated. For example,
         * focus rings painted with solid lines are generally static.
         * 
         * @return <code>true</code> if <code>this</code> focus kind can be animated,
         *         <code>false</code> otherwise.
         */
        public boolean isAnimated() {
            return false;
        }
    }

    /**
     * Enumerates of image-based watermarks kinds.
     * 
     * @author Kirill Grouchnikov
     * @see SubstanceLookAndFeel#setImageWatermarkKind(org.pushingpixels.substance.utils.
     *      SubstanceSlices.ImageWatermarkKind)
     * @see SubstanceLookAndFeel#getImageWatermarkKind()
     */
    public enum ImageWatermarkKind {
        /**
         * The default behaviour. The image is centered in the screen and scaled down if necessary.
         */
        SCREEN_CENTER_SCALE,

        /**
         * The image is tiled starting from the screen top-left corner and not scaled.
         */
        SCREEN_TILE,

        /**
         * The image is anchored to the top-left corner of the application frame and not scaled.
         */
        APP_ANCHOR,

        /**
         * The image is anchored to the center of the application frame and not scaled.
         */
        APP_CENTER,

        /**
         * The image is tiled starting from the top-left corner of the application frame and not
         * scaled.
         */
        APP_TILE
    }

    /**
     * Enumerates possible modes of closing tabs.
     * 
     * @author Kirill Grouchnikov
     * @see SubstanceLookAndFeel#TABBED_PANE_CLOSE_CALLBACK
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
     * Enumerates possible values for menu gutter fill kind.
     * 
     * @author Kirill Grouchnikov
     * @see SubstanceLookAndFeel#MENU_GUTTER_FILL_KIND
     */
    public enum MenuGutterFillKind {
        /**
         * The <code>none</code> fill kind - draws no background in the menu gutter.
         */
        NONE,

        /**
         * The <code>soft fill</code> fill kind - draws light fill background in the menu gutter.
         */
        SOFT_FILL,

        /**
         * The <code>hard fill</code> fill kind - draws darker fill background in the menu gutter.
         */
        HARD_FILL,

        /**
         * The <code>soft</code> fill kind - draws gradient ranging from darker to light in the menu
         * gutter.
         */
        SOFT,

        /**
         * The <code>hard</code> (default) fill kind - draws gradient ranging from darker to light
         * in the menu gutter.
         */
        HARD
    }

    /**
     * Tab content pane border kind.
     * 
     * @author Kirill Grouchnikov
     * @since version 4.1
     */
    public enum TabContentPaneBorderKind {
        /**
         * The content pane has full border on all sides plus an additional line along the tab
         * placement side (as in Firefox 2.0, Internet Explorer 7.0 and Nimbus). This is the default
         * kind starting in versions 4.1-6.1.
         */
        DOUBLE_FULL,

        /**
         * The content pane has full single border on all sides. This has been the default kind
         * prior to version 4.1.
         */
        SINGLE_FULL,

        /**
         * The content pane has double border along the tab placement side. This is the default kind
         * starting from version 6.2.
         */
        DOUBLE_PLACEMENT,

        /**
         * The content pane has single border along the tab placement side.
         */
        SINGLE_PLACEMENT
    }

    /**
     * Enumerates configurable Substance-specific widget types for
     * {@link SubstanceCortex.GlobalScope#setWidgetVisible(boolean, SubstanceWidgetType...)} and
     * {@link SubstanceCortex.WindowScope#setWidgetVisible(java.awt.Window, boolean, SubstanceWidgetType...)}
     * APIs.
     * 
     * @author Kirill Grouchnikov
     */
    public enum SubstanceWidgetType {
        /**
         * Menu search widget.
         */
        MENU_SEARCH,

        /**
         * Title pane heap status widget.
         */
        TITLE_PANE_HEAP_STATUS
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
        /** Platform-specific content gravity. */
        PLATFORM,

        /**
         * Align content to the leading edge of the parent container. Leading edge is left under LTR
         * component orientation and right under RTL component orientation.
         */
        LEADING,

        /** Center content horizontally in the parent container. */
        CENTERED,

        /**
         * Align content to the trailing edge of the parent container. Trailing edge is right under
         * LTR component orientation and left under RTL component orientation.
         */
        TRAILING,

        /** Swing default content gravity. */
        SWING_DEFAULT
    }

    public enum VerticalGravity {
        /** Align content to the top edge of the parent container. */
        TOP,

        /** Center content horizontally in the parent container. */
        CENTERED,

        /** Align content to the bottom edge of the parent container. */
        BOTTOM
    }

    public enum TitleIconHorizontalGravity {
        /** Platform-specific icon gravity. */
        PLATFORM,

        /** Do not show icon. */
        NONE,

        /**
         * Align icon next to the title text (on the left under LTR component orientation and on the
         * right under RTL component orientation.
         */
        NEXT_TO_TITLE,

        /** Align icon on the side of the title pane opposite to that of the control buttons. */
        OPPOSITE_CONTROL_BUTTONS,

        /** Swing default icon gravity. */
        SWING_DEFAULT
    }

    /**
     * Password strength.
     * 
     * @author Kirill Grouchnikov
     */
    public static enum PasswordStrength {
        /** Weak strength. */
        WEAK,

        /** Medium strength. */
        MEDIUM,

        /** Strong strength. */
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
         * @param displayName
         *            Display name for the animation facet.
         * @param isDefaultAllowed
         *            Indicates whether this animation facet is allowed by default.
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
        public static final AnimationFacet ARM = new AnimationFacet("substancelaf.core.arm", true);

        /**
         * Pressing a component.
         */
        public static final AnimationFacet PRESS = new AnimationFacet("substancelaf.core.press",
                true);

        /**
         * Focusing a component.
         */
        public static final AnimationFacet FOCUS = new AnimationFacet("substancelaf.core.focus",
                true);

        /**
         * <p>
         * Focus loop animation. Disabled by default, use
         * {@link SubstanceCortex.GlobalScope#allowAnimations(AnimationFacet)} to enable.
         * </p>
         * 
         * @since version 3.0
         */
        public static final AnimationFacet FOCUS_LOOP_ANIMATION = new AnimationFacet(
                "substancelaf.core.focusLoopAnimation", false);

        /**
         * Rollover a component.
         */
        public static final AnimationFacet ROLLOVER = new AnimationFacet(
                "substancelaf.core.rollover", true);

        /**
         * Selecting a component.
         */
        public static final AnimationFacet SELECTION = new AnimationFacet(
                "substancelaf.core.selection", true);

        /**
         * <i>Ghosting image</i> effects on button icons when the button is rolled-over. Disabled by
         * default, use {@link SubstanceCortex.GlobalScope#allowAnimations(AnimationFacet)} to
         * enable.
         */
        public static final AnimationFacet GHOSTING_ICON_ROLLOVER = new AnimationFacet(
                "substancelaf.core.ghosting.iconRollover", false);

        /**
         * <i>Ghosting image</i> effects on buttons when the button is pressed. Disabled by default,
         * use {@link SubstanceCortex.GlobalScope#allowAnimations(AnimationFacet)} to enable.
         */
        public static final AnimationFacet GHOSTING_BUTTON_PRESS = new AnimationFacet(
                "substancelaf.core.ghosting.buttonPress", false);

        /**
         * Glow effect on icons when the relevant control is rolled over. Disabled by default, use
         * {@link SubstanceCortex.GlobalScope#allowAnimations(AnimationFacet)} to enable.
         */
        public static final AnimationFacet ICON_GLOW = new AnimationFacet(
                "substancelaf.core.iconGlow", false);

        /**
         * Smart tree scroll animation facet. Disabled by default, use
         * {@link SubstanceCortex.GlobalScope#allowAnimations(AnimationFacet)} to enable.
         * </p>
         * 
         * <p>
         * Smart tree scroll is relevant for scroll panes containing a tree. When enabled, it
         * automatically scrolls the tree horizontally when the viewport shows mainly empty area
         * (especially relevant for multi-level trees with narrow viewports).
         * </p>
         * 
         * @since 4.0
         */
        public final static AnimationFacet TREE_SMART_SCROLL_ANIMATION_KIND = new AnimationFacet(
                "substancelaf.treeSmartScrollAnimationKind", false);

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Object#toString()
         */
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
     * @since version 4.3
     */
    public final static class DecorationAreaType {
        String displayName;

        public DecorationAreaType(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public String toString() {
            return this.displayName;
        }

        /**
         * Title pane of top-level windows (frames, dialogs).
         */
        public final static DecorationAreaType PRIMARY_TITLE_PANE = new DecorationAreaType(
                "Primary title pane");

        /**
         * Title pane of non top-level windows (internal frames, desktop icons).
         */
        public final static DecorationAreaType SECONDARY_TITLE_PANE = new DecorationAreaType(
                "Secondary title pane");

        /**
         * Tool bar.
         */
        public final static DecorationAreaType TOOLBAR = new DecorationAreaType("Toolbar");

        /**
         * Any area that can be placed in the top portion of its window. Menu bar is an example of a
         * core Swing component. <code>JXHeader</code> and <code>JXTitledPanel</code> titled area
         * (components from <a href="https://swingx.dev.java.net">SwingX</a> suite) are examples of
         * third-party components.
         */
        public final static DecorationAreaType HEADER = new DecorationAreaType("Header");

        /**
         * Any area that can be placed in the bottom portion of its window. <code>JXStatusBar</code>
         * component from <a href="https://swingx.dev.java.net">SwingX</a> suite is an example of a
         * third-party component.
         */
        public final static DecorationAreaType FOOTER = new DecorationAreaType("Footer");

        /**
         * Any general area that does not fit for the other types. <code>JXTaskPaneContainer</code>
         * component from <a href="https://swingx.dev.java.net">SwingX</a> suite is an example of a
         * third-party component.
         */
        public final static DecorationAreaType GENERAL = new DecorationAreaType("General");

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
     * Allows associating different color schemes to different visual parts of UI components. For
     * example, the {@link JCheckBox} has three different visual areas:
     * <ul>
     * <li>Border - assciated with {@link #BORDER}</li>
     * <li>Fill - associated with {@link #FILL}</li>
     * <li>Check mark - associated with {@link #MARK}</li>
     * </ul>
     * 
     * Applications can create custom instances of this class to further refine the control over the
     * painting. In this case, the custom UI delegates must be created to use these new association
     * kinds.
     * 
     * @author Kirill Grouchnikov
     * @since version 5.1
     */
    public final static class ColorSchemeAssociationKind {
        /**
         * All known association kind values.
         */
        private static Set<ColorSchemeAssociationKind> values = new HashSet<ColorSchemeAssociationKind>();

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
         * @param name
         *            Association kind name.
         * @param fallback
         *            Fallback association kind. This is used when no color scheme is associated
         *            with this kind. For example, {@link #TAB_BORDER} specifies that its fallback
         *            is {@link #BORDER}. When the {@link JTabbedPane} UI delegate is painting the
         *            tabs, it will try to use the color scheme associated with {@link #TAB_BORDER}.
         *            If none was registered, it will fall back to use the color scheme associated
         *            with {@link #BORDER}, and if that is not registered as well, will use the
         *            color scheme associated with {@link #FILL}.
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
        public static final ColorSchemeAssociationKind FILL = new ColorSchemeAssociationKind("fill",
                null);

        /**
         * Visual area of separators.
         */
        public static final ColorSchemeAssociationKind SEPARATOR = new ColorSchemeAssociationKind(
                "separator", FILL);

        /**
         * Fill visual area of the tabs.
         */
        public static final ColorSchemeAssociationKind TAB = new ColorSchemeAssociationKind("tab",
                FILL);

        /**
         * Border visual area of non-tab controls.
         */
        public static final ColorSchemeAssociationKind BORDER = new ColorSchemeAssociationKind(
                "border", FILL);

        /**
         * Visual area of marks. Used for painting check marks of checkboxes and radio buttons, as
         * well as arrow icons of combo boxes, spinners and more.
         */
        public static final ColorSchemeAssociationKind MARK = new ColorSchemeAssociationKind("mark",
                BORDER);

        /**
         * Border visual area of the tabs.
         */
        public static final ColorSchemeAssociationKind TAB_BORDER = new ColorSchemeAssociationKind(
                "tabBorder", BORDER);

        /**
         * Highlight visual areas for lists, tables, trees and menus.
         */
        public static final ColorSchemeAssociationKind HIGHLIGHT = new ColorSchemeAssociationKind(
                "highlight", FILL);

        /**
         * Highlight visual areas for text components.
         */
        public static final ColorSchemeAssociationKind HIGHLIGHT_TEXT = new ColorSchemeAssociationKind(
                "highlightText", HIGHLIGHT);

        /**
         * Border visual areas for highlighted regions of lists, tables, trees and menus.
         */
        public static final ColorSchemeAssociationKind HIGHLIGHT_BORDER = new ColorSchemeAssociationKind(
                "highlightBorder", BORDER);

        /**
         * Visual area of marks in highlighted regions of lists, tables, trees and menus.
         */
        public static final ColorSchemeAssociationKind HIGHLIGHT_MARK = new ColorSchemeAssociationKind(
                "highlightMark", MARK);

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
     * Defies a single facet of core and custom {@link ComponentState}s. See Javadocs of the
     * {@link ComponentState} class for more information on state facets.
     * 
     * <p>
     * This class is experimental API and is likely to change in the next few releases.
     * </p>
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
        public static final ComponentStateFacet SELECTION = new ComponentStateFacet("selection",
                10);

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
         * Facet that describes the determinate bit. This is relevant for {@link JProgressBar}
         * control and its {@link JProgressBar#setIndeterminate(boolean)} API.
         */
        public static final ComponentStateFacet DETERMINATE = new ComponentStateFacet("determinate",
                10);

        /**
         * Facet that describes the editable bit. This is relevant for {@link JTextComponent}
         * derived controls and its {@link JTextComponent#setEditable(boolean)} API.
         */
        public static final ComponentStateFacet EDITABLE = new ComponentStateFacet("editable", 50);

        /**
         * Creates a new facet.
         * 
         * @param name
         *            Facet name.
         * @param value
         *            Facet value. This is used in the matching algorithm described in the javadocs
         *            of {@link ComponentState}. The larger the value, the more importance is given
         *            to the specific facet.
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
