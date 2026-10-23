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
package org.pushingpixels.radiance.component.api.common.model;

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import java.awt.*;

/**
 * Presentation model for a command strip.
 */
public class CommandStripPresentationModel implements ImmutablePresentationModel {
    /**
     * Default gap scale factor for the primary axis.
     */
    public static final double DEFAULT_GAP_SCALE_FACTOR_PRIMARY_AXIS = 0.75;
    /**
     * Default gap scale factor for the secondary axis.
     */
    public static final double DEFAULT_GAP_SCALE_FACTOR_SECONDARY_AXIS = 1.0;

    /**
     * Button strip orientation.
     *
     * @author Kirill Grouchnikov
     */
    public enum StripOrientation {
        /**
         * Horizontal strip orientation.
         */
        HORIZONTAL,

        /**
         * Vertical strip orientation.
         */
        VERTICAL
    }

    /**
     * Presentation state for the buttons in this button strip. Default state is
     * {@link CommandButtonPresentationState#SMALL}.
     */
    private CommandButtonPresentationState commandPresentationState;

    /**
     * Padding around command button content.
     */
    private Insets commandContentPadding;

    /**
     * Icon filter strategy when active.
     */
    private RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy;
    /**
     * Icon filter strategy when enabled.
     */
    private RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy;
    /**
     * Icon filter strategy when disabled.
     */
    private RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy;

    /**
     * Scale factor for horizontal gaps.
     */
    private double hgapScaleFactor;

    /**
     * Scale factor for vertical gaps.
     */
    private double vgapScaleFactor;

    /**
     * Orientation of <code>this</code> strip.
     */
    private StripOrientation orientation;

    /**
     * Background appearance strategy.
     */
    private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy;
    /**
     * Whether the strip is focusable.
     */
    private boolean isFocusable;
    /**
     * Whether to dismiss popups on activation.
     */
    private boolean toDismissPopupsOnActivation;

    /**
     * Constructs a {@code CommandStripPresentationModel}.
     */
    private CommandStripPresentationModel() {
    }

    /**
     * Creates a new builder for {@link CommandStripPresentationModel}.
     *
     * @return A new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Returns a presentation model with default settings.
     *
     * @return The default presentation model.
     */
    public static CommandStripPresentationModel withDefaults() {
        return CommandStripPresentationModel.builder().build();
    }

    /**
     * Returns the presentation state for command buttons.
     *
     * @return The presentation state.
     */
    public CommandButtonPresentationState getCommandPresentationState() {
        return this.commandPresentationState;
    }

    /**
     * Returns the padding around command button content.
     *
     * @return The padding.
     */
    public Insets getCommandContentPadding() {
        return this.commandContentPadding;
    }

    /**
     * Returns the icon filter strategy when active.
     *
     * @return The strategy.
     */
    public RadianceThemingSlices.IconFilterStrategy getActiveIconFilterStrategy() {
        return this.activeIconFilterStrategy;
    }

    /**
     * Returns the icon filter strategy when enabled.
     *
     * @return The strategy.
     */
    public RadianceThemingSlices.IconFilterStrategy getEnabledIconFilterStrategy() {
        return this.enabledIconFilterStrategy;
    }

    /**
     * Returns the icon filter strategy when disabled.
     *
     * @return The strategy.
     */
    public RadianceThemingSlices.IconFilterStrategy getDisabledIconFilterStrategy() {
        return this.disabledIconFilterStrategy;
    }

    /**
     * Returns the scale factor for horizontal gaps.
     *
     * @return The scale factor.
     */
    public double getHorizontalGapScaleFactor() {
        return this.hgapScaleFactor;
    }

    /**
     * Returns the scale factor for vertical gaps.
     *
     * @return The scale factor.
     */
    public double getVerticalGapScaleFactor() {
        return this.vgapScaleFactor;
    }

    /**
     * Returns the strip orientation.
     *
     * @return The orientation.
     */
    public StripOrientation getOrientation() {
        return this.orientation;
    }

    /**
     * Returns the background appearance strategy.
     *
     * @return The strategy.
     */
    public RadianceThemingSlices.BackgroundAppearanceStrategy getBackgroundAppearanceStrategy() {
        return this.backgroundAppearanceStrategy;
    }

    /**
     * Returns whether the strip is focusable.
     *
     * @return {@code true} if focusable.
     */
    public boolean isFocusable() {
        return this.isFocusable;
    }

    /**
     * Returns whether to dismiss popups on activation.
     *
     * @return {@code true} if dismiss on activation.
     */
    public boolean isToDismissPopupsOnActivation() {
        return this.toDismissPopupsOnActivation;
    }

    /**
     * Builder for {@link CommandStripPresentationModel}.
     */
    public static class Builder {
        /**
         * Command presentation state.
         */
        private CommandButtonPresentationState commandPresentationState =
                CommandButtonPresentationState.SMALL;
        /**
         * Command content padding.
         */
        private Insets commandContentPadding =
                CommandButtonPresentationModel.COMPACT_BUTTON_CONTENT_PADDING;
        /**
         * Active icon filter strategy.
         */
        private RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        /**
         * Enabled icon filter strategy.
         */
        private RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        /**
         * Disabled icon filter strategy.
         */
        private RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_TOKENS;
        /**
         * Horizontal gap scale factor.
         */
        private double hgapScaleFactor = -1;
        /**
         * Vertical gap scale factor.
         */
        private double vgapScaleFactor = -1;
        /**
         * Strip orientation.
         */
        private StripOrientation orientation = StripOrientation.HORIZONTAL;
        /**
         * Background appearance strategy.
         */
        private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy =
                RadianceThemingSlices.BackgroundAppearanceStrategy.ALWAYS;
        /**
         * Whether the strip is focusable.
         */
        private boolean isFocusable = true;
        /**
         * Whether to dismiss popups on activation.
         */
        private boolean toDismissPopupsOnActivation = true;

        /**
         * Constructs a {@code Builder}.
         */
        public Builder() {
        }

        /**
         * Sets the command presentation state.
         *
         * @param commandPresentationState The presentation state.
         * @return This builder.
         */
        public Builder setCommandPresentationState(
                CommandButtonPresentationState commandPresentationState) {
            this.commandPresentationState = commandPresentationState;
            return this;
        }

        /**
         * Sets the command content padding.
         *
         * @param commandContentPadding The padding.
         * @return This builder.
         */
        public Builder setCommandContentPadding(Insets commandContentPadding) {
            this.commandContentPadding = commandContentPadding;
            return this;
        }

        /**
         * Sets the icon filter strategies.
         *
         * @param activeIconFilterStrategy The active state strategy.
         * @param enabledIconFilterStrategy The enabled state strategy.
         * @param disabledIconFilterStrategy The disabled state strategy.
         * @return This builder.
         */
        public Builder setIconFilterStrategies(
                RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy) {
            this.activeIconFilterStrategy = activeIconFilterStrategy;
            this.enabledIconFilterStrategy = enabledIconFilterStrategy;
            this.disabledIconFilterStrategy = disabledIconFilterStrategy;
            return this;
        }

        /**
         * Sets the horizontal gap scale factor.
         *
         * @param hgapScaleFactor The scale factor.
         * @return This builder.
         */
        public Builder setHorizontalGapScaleFactor(double hgapScaleFactor) {
            this.hgapScaleFactor = hgapScaleFactor;
            return this;
        }

        /**
         * Sets the vertical gap scale factor.
         *
         * @param vgapScaleFactor The scale factor.
         * @return This builder.
         */
        public Builder setVerticalGapScaleFactor(double vgapScaleFactor) {
            this.vgapScaleFactor = vgapScaleFactor;
            return this;
        }

        /**
         * Sets the strip orientation.
         *
         * @param orientation The orientation.
         * @return This builder.
         */
        public Builder setOrientation(StripOrientation orientation) {
            this.orientation = orientation;
            return this;
        }

        /**
         * Sets the background appearance strategy.
         *
         * @param backgroundAppearanceStrategy The strategy.
         * @return This builder.
         */
        public Builder setBackgroundAppearanceStrategy(
                RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {
            this.backgroundAppearanceStrategy = backgroundAppearanceStrategy;
            return this;
        }

        /**
         * Sets whether the strip is focusable.
         *
         * @param focusable {@code true} to make focusable.
         * @return This builder.
         */
        public Builder setFocusable(boolean focusable) {
            this.isFocusable = focusable;
            return this;
        }

        /**
         * Sets whether to dismiss popups on activation.
         *
         * @param toDismissPopupsOnActivation {@code true} to dismiss on activation.
         * @return This builder.
         */
        public Builder setToDismissPopupsOnActivation(boolean toDismissPopupsOnActivation) {
            this.toDismissPopupsOnActivation = toDismissPopupsOnActivation;
            return this;
        }

        /**
         * Builds the {@link CommandStripPresentationModel}.
         *
         * @return The built model.
         */
        public CommandStripPresentationModel build() {
            CommandStripPresentationModel presentationModel = new CommandStripPresentationModel();
            presentationModel.commandPresentationState = this.commandPresentationState;
            presentationModel.commandContentPadding = this.commandContentPadding;
            presentationModel.activeIconFilterStrategy = this.activeIconFilterStrategy;
            presentationModel.enabledIconFilterStrategy = this.enabledIconFilterStrategy;
            presentationModel.disabledIconFilterStrategy = this.disabledIconFilterStrategy;
            presentationModel.orientation = this.orientation;
            if (this.hgapScaleFactor < 0) {
                presentationModel.hgapScaleFactor =
                        (this.orientation == StripOrientation.HORIZONTAL)
                                ? DEFAULT_GAP_SCALE_FACTOR_PRIMARY_AXIS
                                : DEFAULT_GAP_SCALE_FACTOR_SECONDARY_AXIS;
            } else {
                presentationModel.hgapScaleFactor = this.hgapScaleFactor;
            }
            if (this.vgapScaleFactor < 0) {
                presentationModel.vgapScaleFactor =
                        (this.orientation == StripOrientation.VERTICAL)
                                ? DEFAULT_GAP_SCALE_FACTOR_PRIMARY_AXIS
                                : DEFAULT_GAP_SCALE_FACTOR_SECONDARY_AXIS;
            } else {
                presentationModel.vgapScaleFactor = this.vgapScaleFactor;
            }
            presentationModel.backgroundAppearanceStrategy = this.backgroundAppearanceStrategy;
            presentationModel.isFocusable = this.isFocusable;
            presentationModel.toDismissPopupsOnActivation = this.toDismissPopupsOnActivation;
            return presentationModel;
        }
    }
}
