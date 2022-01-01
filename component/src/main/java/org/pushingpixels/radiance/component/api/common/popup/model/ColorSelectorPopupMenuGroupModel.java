/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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

public class ColorSelectorPopupMenuGroupModel implements ChangeAware {
    public enum GroupEntryKind {
        COMMAND, COLOR_SECTION, COLOR_SECTION_WITH_DERIVED, RECENTS_SECTION
    }

    private List<KeyValuePair<GroupEntryKind, Object>> groupContent;

    /**
     * Stores the listeners on this model.
     */
    private final WeakChangeSupport weakChangeSupport;

    public static class ColorSectionModel {
        private String title;
        private Color[] colors;

        public ColorSectionModel(String title) {
            this.title = title;
        }

        public ColorSectionModel(String title, Color[] colors) {
            this.title = title;
            this.colors = colors;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Color[] getColors() {
            return Arrays.copyOf(this.colors, this.colors.length);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private ColorSelectorPopupMenuGroupModel() {
        this.weakChangeSupport = new WeakChangeSupport(this);
    }

    public List<KeyValuePair<GroupEntryKind, Object>> getGroupContent() {
        return Collections.unmodifiableList(this.groupContent);
    }

    public void addChangeListener(ChangeListener l) {
        this.weakChangeSupport.addChangeListener(l);
    }

    @Override
    public void removeChangeListener(ChangeListener l) {
        this.weakChangeSupport.removeChangeListener(l);
    }

    private void fireStateChanged() {
        this.weakChangeSupport.fireStateChanged();
    }

    public static class Builder {
        private List<KeyValuePair<GroupEntryKind, Object>> groupContent = new ArrayList<>();

        public Builder addCommand(Command command) {
            this.groupContent.add(new KeyValuePair<>(GroupEntryKind.COMMAND, command));
            return this;
        }

        public Builder addColorSection(ColorSectionModel colorSectionModel) {
            this.groupContent.add(
                    new KeyValuePair<>(GroupEntryKind.COLOR_SECTION, colorSectionModel));
            return this;
        }

        public Builder addColorSectionWithDerived(ColorSectionModel colorSectionModel) {
            this.groupContent.add(new KeyValuePair<>(GroupEntryKind.COLOR_SECTION_WITH_DERIVED,
                    colorSectionModel));
            return this;
        }

        public Builder addRecentsSection(ColorSectionModel colorSectionModel) {
            this.groupContent.add(new KeyValuePair<>(GroupEntryKind.RECENTS_SECTION,
                    colorSectionModel));
            return this;
        }

        public ColorSelectorPopupMenuGroupModel build() {
            ColorSelectorPopupMenuGroupModel menuGroupModel =new ColorSelectorPopupMenuGroupModel();
            menuGroupModel.groupContent = Collections.unmodifiableList(this.groupContent);
            return menuGroupModel;
        }
    }
}
