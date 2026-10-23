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
package org.pushingpixels.radiance.component.api.common.popup.model;

import org.pushingpixels.radiance.component.api.common.KeyValuePair;
import org.pushingpixels.radiance.component.api.common.model.ChangeAware;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.internal.utils.WeakChangeSupport;

import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Model for a group of entries in a color selector popup menu.
 */
public class ColorSelectorPopupMenuGroupModel implements ChangeAware {
    /**
     * Kind of entry in a group.
     */
    public enum GroupEntryKind {
        /** A command entry. */
        COMMAND,
        /** A color section entry. */
        COLOR_SECTION,
        /** A color section with derived colors entry. */
        COLOR_SECTION_WITH_DERIVED,
        /** A recents section entry. */
        RECENTS_SECTION
    }

    /**
     * The content of the group.
     */
    private List<KeyValuePair<GroupEntryKind, Object>> groupContent;

    /**
     * Stores the listeners on this model.
     */
    private final WeakChangeSupport weakChangeSupport;

    /**
     * Model for a section of colors in a popup menu.
     */
    public static class ColorSectionModel {
        /**
         * Title of the section.
         */
        private String title;
        /**
         * Colors in the section.
         */
        private Color[] colors;

        /**
         * Constructs a {@code ColorSectionModel} with the given title.
         *
         * @param title The section title.
         */
        public ColorSectionModel(String title) {
            this.title = title;
        }

        /**
         * Constructs a {@code ColorSectionModel} with the given title and colors.
         *
         * @param title  The section title.
         * @param colors The colors in the section.
         */
        public ColorSectionModel(String title, Color[] colors) {
            this.title = title;
            this.colors = colors;
        }

        /**
         * Returns the section title.
         *
         * @return The title.
         */
        public final String getTitle() {
            return this.title;
        }

        /**
         * Returns the colors in the section.
         *
         * @return The colors array.
         */
        public final Color[] getColors() {
            return Arrays.copyOf(this.colors, this.colors.length);
        }
    }

    /**
     * Model for a section of colors with derived colors in a popup menu.
     */
    public static class ColorSectionModelWithDerived {
        /**
         * Title of the section.
         */
        private String title;
        /**
         * Colors in the section.
         */
        private Color[] colors;
        /**
         * Number of derived colors.
         */
        private int derivedCount;

        /**
         * Constructs a {@code ColorSectionModelWithDerived}.
         *
         * @param title        The section title.
         * @param colors       The colors in the section.
         * @param derivedCount The number of derived colors.
         */
        public ColorSectionModelWithDerived(String title, Color[] colors, int derivedCount) {
            this.title = title;
            this.colors = colors;
            this.derivedCount = derivedCount;
        }

        /**
         * Returns the section title.
         *
         * @return The title.
         */
        public final String getTitle() {
            return this.title;
        }

        /**
         * Returns the colors in the section.
         *
         * @return The colors array.
         */
        public final Color[] getColors() {
            return Arrays.copyOf(this.colors, this.colors.length);
        }

        /**
         * Returns the number of derived colors.
         *
         * @return The derived count.
         */
        public int getDerivedCount() {
            return this.derivedCount;
        }
    }

    /**
     * Creates a new builder for {@link ColorSelectorPopupMenuGroupModel}.
     *
     * @return A new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Constructs a {@code ColorSelectorPopupMenuGroupModel}.
     */
    private ColorSelectorPopupMenuGroupModel() {
        this.weakChangeSupport = new WeakChangeSupport(this);
    }

    /**
     * Returns the group content as an unmodifiable list.
     *
     * @return The group content.
     */
    public List<KeyValuePair<GroupEntryKind, Object>> getGroupContent() {
        return Collections.unmodifiableList(this.groupContent);
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
     * Builder for {@link ColorSelectorPopupMenuGroupModel}.
     */
    public static class Builder {
        /**
         * Constructs a new {@link Builder} instance.
         */
        public Builder() {
        }

        /**
         * The group content being built.
         */
        private List<KeyValuePair<GroupEntryKind, Object>> groupContent = new ArrayList<>();

        /**
         * Adds a command to the group.
         *
         * @param command The command.
         * @return This builder.
         */
        public Builder addCommand(Command command) {
            this.groupContent.add(new KeyValuePair<>(GroupEntryKind.COMMAND, command));
            return this;
        }

        /**
         * Adds a color section to the group.
         *
         * @param colorSectionModel The color section model.
         * @return This builder.
         */
        public Builder addColorSection(ColorSectionModel colorSectionModel) {
            this.groupContent.add(new KeyValuePair<>(GroupEntryKind.COLOR_SECTION, colorSectionModel));
            return this;
        }

        /**
         * Adds a color section with derived colors to the group.
         *
         * @param colorSectionModel The color section model with derived colors.
         * @return This builder.
         */
        public Builder addColorSectionWithDerived(ColorSectionModelWithDerived colorSectionModel) {
            this.groupContent.add(new KeyValuePair<>(GroupEntryKind.COLOR_SECTION_WITH_DERIVED,
                    colorSectionModel));
            return this;
        }

        /**
         * Adds a recents section to the group.
         *
         * @param colorSectionModel The recents section model.
         * @return This builder.
         */
        public Builder addRecentsSection(ColorSectionModel colorSectionModel) {
            this.groupContent.add(new KeyValuePair<>(GroupEntryKind.RECENTS_SECTION,
                    colorSectionModel));
            return this;
        }

        /**
         * Builds the {@link ColorSelectorPopupMenuGroupModel}.
         *
         * @return The built model.
         */
        public ColorSelectorPopupMenuGroupModel build() {
            ColorSelectorPopupMenuGroupModel menuGroupModel = new ColorSelectorPopupMenuGroupModel();
            menuGroupModel.groupContent = Collections.unmodifiableList(this.groupContent);
            return menuGroupModel;
        }
    }
}
