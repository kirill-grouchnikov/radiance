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
import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;
import org.pushingpixels.radiance.component.api.common.model.panel.MenuPopupPanelLayoutSpec;
import org.pushingpixels.radiance.component.internal.utils.WeakChangeSupport;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Objects;

/**
 * Presentation model for a command popup menu panel.
 */
public class CommandPopupMenuPanelPresentationModel implements MutablePresentationModel {
    /**
     * Stores the listeners on this model.
     */
    private final WeakChangeSupport weakChangeSupport;

    /**
     * Layout specification for the panel.
     */
    private MenuPopupPanelLayoutSpec layoutSpec;

    /**
     * Padding around the panel content.
     */
    private Insets contentPadding;
    /**
     * Gap between panel elements.
     */
    private int contentGap;
    /**
     * Whether to show group labels.
     */
    private boolean toShowGroupLabels = true;

    /**
     * Presentation state for command buttons.
     */
    private CommandButtonPresentationState commandPresentationState;
    /**
     * Dimension of command button icons.
     */
    private Dimension commandIconDimension;
    /**
     * Padding around command button content.
     */
    private Insets commandContentPadding;
    /**
     * Scale factor for horizontal gaps.
     */
    private double commandHorizontalGapScaleFactor;
    /**
     * Scale factor for vertical gaps.
     */
    private double commandVerticalGapScaleFactor;
    /**
     * Background appearance strategy.
     */
    private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy;
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
     * Horizontal alignment of command buttons.
     */
    private HorizontalAlignment commandHorizontalAlignment;

    /**
     * Constructs a {@code CommandPopupMenuPanelPresentationModel}.
     */
    private CommandPopupMenuPanelPresentationModel() {
        this.weakChangeSupport = new WeakChangeSupport(this);
    }

    /**
     * Creates a new builder for {@link CommandPopupMenuPanelPresentationModel}.
     *
     * @return A new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Returns the presentation state for command buttons.
     *
     * @return The presentation state.
     */
    public CommandButtonPresentationState getCommandPresentationState() {
        return commandPresentationState;
    }

    /**
     * Sets the presentation state for command buttons.
     *
     * @param commandPresentationState The presentation state.
     */
    public void setCommandPresentationState(CommandButtonPresentationState commandPresentationState) {
        if (this.commandPresentationState != commandPresentationState) {
            this.commandPresentationState = commandPresentationState;
            this.fireStateChanged();
        }
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
     * Sets the padding around command button content.
     *
     * @param commandContentPadding The padding.
     */
    public void setCommandContentPadding(Insets commandContentPadding) {
        if (commandContentPadding == null) {
            throw new IllegalArgumentException("Command content padding cannot be null");
        }
        if (this.commandContentPadding != commandContentPadding) {
            this.commandContentPadding = commandContentPadding;
            this.fireStateChanged();
        }
    }

    /**
     * Returns the dimension of command button icons.
     *
     * @return The icon dimension.
     */
    public Dimension getCommandIconDimension() {
        return commandIconDimension;
    }

    /**
     * Sets the dimension of command button icons.
     *
     * @param commandIconDimension The icon dimension.
     */
    public void setCommandIconDimension(Dimension commandIconDimension) {
        if (this.commandIconDimension != commandIconDimension) {
            this.commandIconDimension = commandIconDimension;
            this.fireStateChanged();
        }
    }

    /**
     * Returns the layout specification.
     *
     * @return The layout spec.
     */
    public MenuPopupPanelLayoutSpec getLayoutSpec() {
        return this.layoutSpec;
    }

    /**
     * Sets the layout specification.
     *
     * @param layoutSpec The layout spec.
     */
    public void setLayoutSpec(MenuPopupPanelLayoutSpec layoutSpec) {
        if (layoutSpec == null) {
            throw new IllegalArgumentException("Layout spec cannot be null");
        }
        if (this.layoutSpec != layoutSpec) {
            this.layoutSpec = layoutSpec;
            this.fireStateChanged();
        }
    }

    /**
     * Returns the padding around the panel content.
     *
     * @return The padding.
     */
    public Insets getContentPadding() {
        return this.contentPadding;
    }

    /**
     * Sets the padding around the panel content.
     *
     * @param contentPadding The padding.
     */
    public void setContentPadding(Insets contentPadding) {
        if (contentPadding == null) {
            throw new IllegalArgumentException("Content padding cannot be null");
        }
        if (!Objects.equals(this.contentPadding, contentPadding)) {
            this.contentPadding = contentPadding;
            this.fireStateChanged();
        }
    }

    /**
     * Returns the gap between panel elements.
     *
     * @return The gap.
     */
    public int getContentGap() {
        return this.contentGap;
    }

    /**
     * Sets the gap between panel elements.
     *
     * @param contentGap The gap.
     */
    public void setContentGap(int contentGap) {
        if (this.contentGap != contentGap) {
            this.contentGap = contentGap;
            this.fireStateChanged();
        }
    }

    /**
     * Returns the scale factor for horizontal gaps.
     *
     * @return The scale factor.
     */
    public double getCommandHorizontalGapScaleFactor() {
        return this.commandHorizontalGapScaleFactor;
    }

    /**
     * Sets the scale factor for horizontal gaps.
     *
     * @param commandHorizontalGapScaleFactor The scale factor.
     */
    public void setCommandHorizontalGapScaleFactor(double commandHorizontalGapScaleFactor) {
        if (this.commandHorizontalGapScaleFactor != commandHorizontalGapScaleFactor) {
            this.commandHorizontalGapScaleFactor = commandHorizontalGapScaleFactor;
            this.fireStateChanged();
        }
    }

    /**
     * Returns the scale factor for vertical gaps.
     *
     * @return The scale factor.
     */
    public double getCommandVerticalGapScaleFactor() {
        return this.commandVerticalGapScaleFactor;
    }

    /**
     * Sets the scale factor for vertical gaps.
     *
     * @param commandVerticalGapScaleFactor The scale factor.
     */
    public void setCommandVerticalGapScaleFactor(double commandVerticalGapScaleFactor) {
        if (this.commandVerticalGapScaleFactor != commandVerticalGapScaleFactor) {
            this.commandVerticalGapScaleFactor = commandVerticalGapScaleFactor;
            this.fireStateChanged();
        }
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
     * Sets the background appearance strategy.
     *
     * @param backgroundAppearanceStrategy The strategy.
     */
    public void setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {
        if (this.backgroundAppearanceStrategy != backgroundAppearanceStrategy) {
            this.backgroundAppearanceStrategy = backgroundAppearanceStrategy;
            this.fireStateChanged();
        }
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
     * Sets the icon filter strategies for active, enabled, and disabled states.
     *
     * @param activeIconFilterStrategy The active state strategy.
     * @param enabledIconFilterStrategy The enabled state strategy.
     * @param disabledIconFilterStrategy The disabled state strategy.
     */
    public void setIconFilterStrategies(
            RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy,
            RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
            RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy) {
        if ((this.activeIconFilterStrategy != activeIconFilterStrategy) ||
                (this.enabledIconFilterStrategy != enabledIconFilterStrategy) ||
                (this.disabledIconFilterStrategy != disabledIconFilterStrategy)) {
            this.activeIconFilterStrategy = activeIconFilterStrategy;
            this.enabledIconFilterStrategy = enabledIconFilterStrategy;
            this.disabledIconFilterStrategy = disabledIconFilterStrategy;
            this.fireStateChanged();
        }
    }

    /**
     * Returns whether group labels are shown.
     *
     * @return {@code true} if group labels are shown.
     */
    public boolean isToShowGroupLabels() {
        return this.toShowGroupLabels;
    }

    /**
     * Sets whether group labels are shown.
     *
     * @param toShowGroupLabels {@code true} to show group labels.
     */
    public void setToShowGroupLabels(boolean toShowGroupLabels) {
        if (this.toShowGroupLabels != toShowGroupLabels) {
            this.toShowGroupLabels = toShowGroupLabels;
            this.fireStateChanged();
        }
    }

    /**
     * Returns the horizontal alignment of command buttons.
     *
     * @return The alignment.
     */
    public HorizontalAlignment getCommandHorizontalAlignment() {
        return this.commandHorizontalAlignment;
    }

    /**
     * Adds a change listener.
     *
     * @param l The listener.
     */
    public void addChangeListener(ChangeListener l) {
        this.weakChangeSupport.addChangeListener(l);
    }

    /**
     * Removes a change listener.
     *
     * @param l The listener.
     */
    @Override
    public void removeChangeListener(ChangeListener l) {
        this.weakChangeSupport.removeChangeListener(l);
    }

    /**
     * Fires a state changed event to all registered listeners.
     */
    private void fireStateChanged() {
        this.weakChangeSupport.fireStateChanged();
    }

    /**
     * Builder for {@link CommandPopupMenuPanelPresentationModel}.
     */
    public static class Builder {
        /**
         * Layout specification.
         */
        private MenuPopupPanelLayoutSpec layoutSpec;
        /**
         * Content padding.
         */
        private Insets contentPadding = CommandPanelPresentationModel.DEFAULT_CONTENT_PADDING;
        /**
         * Content gap.
         */
        private int contentGap = CommandPanelPresentationModel.DEFAULT_GAP;
        /**
         * Whether to show group labels.
         */
        private boolean toShowGroupLabels = true;
        /**
         * Command presentation state.
         */
        private CommandButtonPresentationState commandPresentationState;
        /**
         * Command icon dimension.
         */
        private Dimension commandIconDimension = null;
        /**
         * Command content padding.
         */
        private Insets commandContentPadding = CommandButtonPresentationModel.COMPACT_BUTTON_CONTENT_PADDING;
        /**
         * Horizontal gap scale factor.
         */
        private double commandHorizontalGapScaleFactor =
                CommandButtonPresentationModel.DEFAULT_GAP_SCALE_FACTOR;
        /**
         * Vertical gap scale factor.
         */
        private double commandVerticalGapScaleFactor =
                CommandButtonPresentationModel.DEFAULT_GAP_SCALE_FACTOR;
        /**
         * Background appearance strategy.
         */
        private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy =
                RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT;
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
         * Command horizontal alignment.
         */
        private HorizontalAlignment commandHorizontalAlignment = CommandButtonPresentationModel.DEFAULT_HORIZONTAL_ALIGNMENT;

        /**
         * Constructs a {@code Builder}.
         */
        public Builder() {
        }

        /**
         * Sets the layout specification.
         *
         * @param layoutSpec The layout spec.
         * @return This builder.
         */
        public Builder setLayoutSpec(MenuPopupPanelLayoutSpec layoutSpec) {
            this.layoutSpec = layoutSpec;
            return this;
        }

        /**
         * Sets the content padding.
         *
         * @param contentPadding The padding.
         * @return This builder.
         */
        public Builder setContentPadding(Insets contentPadding) {
            if (commandContentPadding == null) {
                throw new IllegalArgumentException("Command content padding cannot be null");
            }
            this.contentPadding = contentPadding;
            return this;
        }

        /**
         * Sets the content gap.
         *
         * @param contentGap The gap.
         * @return This builder.
         */
        public Builder setContentGap(int contentGap) {
            this.contentGap = contentGap;
            return this;
        }

        /**
         * Sets whether to show group labels.
         *
         * @param toShowGroupLabels {@code true} to show group labels.
         * @return This builder.
         */
        public Builder setToShowGroupLabels(boolean toShowGroupLabels) {
            this.toShowGroupLabels = toShowGroupLabels;
            return this;
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
         * Sets the command icon dimension.
         *
         * @param commandIconDimension The icon dimension.
         * @return This builder.
         */
        public Builder setCommandIconDimension(Dimension commandIconDimension) {
            this.commandIconDimension = commandIconDimension;
            return this;
        }

        /**
         * Sets the command content padding.
         *
         * @param commandContentPadding The padding.
         * @return This builder.
         */
        public Builder setCommandContentPadding(Insets commandContentPadding) {
            if (commandContentPadding == null) {
                throw new IllegalArgumentException("Command content padding cannot be null");
            }
            this.commandContentPadding = commandContentPadding;
            return this;
        }

        /**
         * Sets the command horizontal alignment.
         *
         * @param commandHorizontalAlignment The alignment.
         * @return This builder.
         */
        public Builder setCommandHorizontalAlignment(HorizontalAlignment commandHorizontalAlignment) {
            this.commandHorizontalAlignment = commandHorizontalAlignment;
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
         * Sets the horizontal gap scale factor.
         *
         * @param commandHorizontalGapScaleFactor The scale factor.
         * @return This builder.
         */
        public Builder setCommandHorizontalGapScaleFactor(double commandHorizontalGapScaleFactor) {
            this.commandHorizontalGapScaleFactor = commandHorizontalGapScaleFactor;
            return this;
        }

        /**
         * Sets the vertical gap scale factor.
         *
         * @param commandVerticalGapScaleFactor The scale factor.
         * @return This builder.
         */
        public Builder setCommandVerticalGapScaleFactor(double commandVerticalGapScaleFactor) {
            this.commandVerticalGapScaleFactor = commandVerticalGapScaleFactor;
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
         * Builds the {@link CommandPopupMenuPanelPresentationModel}.
         *
         * @return The built model.
         */
        public CommandPopupMenuPanelPresentationModel build() {
            if (this.layoutSpec == null) {
                throw new IllegalArgumentException("Layout spec cannot be null");
            }

            CommandPopupMenuPanelPresentationModel presentationModel = new CommandPopupMenuPanelPresentationModel();
            presentationModel.layoutSpec = this.layoutSpec;
            presentationModel.contentPadding = this.contentPadding;
            presentationModel.contentGap = this.contentGap;
            presentationModel.toShowGroupLabels = this.toShowGroupLabels;
            presentationModel.commandIconDimension = this.commandIconDimension;
            presentationModel.commandPresentationState = this.commandPresentationState;
            presentationModel.commandContentPadding = this.commandContentPadding;
            presentationModel.commandHorizontalGapScaleFactor = this.commandHorizontalGapScaleFactor;
            presentationModel.commandVerticalGapScaleFactor = this.commandVerticalGapScaleFactor;
            presentationModel.backgroundAppearanceStrategy = this.backgroundAppearanceStrategy;
            presentationModel.activeIconFilterStrategy = this.activeIconFilterStrategy;
            presentationModel.enabledIconFilterStrategy = this.enabledIconFilterStrategy;
            presentationModel.disabledIconFilterStrategy = this.disabledIconFilterStrategy;
            presentationModel.commandHorizontalAlignment = this.commandHorizontalAlignment;
            return presentationModel;
        }
    }
}
