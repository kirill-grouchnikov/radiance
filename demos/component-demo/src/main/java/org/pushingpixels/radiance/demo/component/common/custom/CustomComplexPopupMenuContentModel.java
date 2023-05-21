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
package org.pushingpixels.radiance.demo.component.common.custom;

import org.pushingpixels.radiance.component.api.common.KeyValuePair;
import org.pushingpixels.radiance.component.api.common.model.BaseCommandMenuContentModel;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.PropertyChangeAware;
import org.pushingpixels.radiance.component.internal.utils.WeakPropertyChangeSupport;

import java.awt.*;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomComplexPopupMenuContentModel implements BaseCommandMenuContentModel {

    public enum PopupMenuSectionEntryKind {
        COMMAND, ZOOM, EDIT, HEADER, FOOTER
    }

    private List<CustomComplexPopupMenuSectionModel> sections = new ArrayList<>();

    public static class CustomComplexPopupMenuZoom implements PropertyChangeAware {
        private String title;
        private int zoom;
        private Command commandZoomOut;
        private Command commandZoomIn;
        private Command commandFullScreen;

        private final WeakPropertyChangeSupport weakPropertyChangeSupport;

        public CustomComplexPopupMenuZoom(String title, int zoom, Command commandZoomOut,
                Command commandZoomIn, Command commandFullScreen) {
            this.title = title;
            this.zoom = zoom;
            this.commandZoomOut = commandZoomOut;
            this.commandZoomIn = commandZoomIn;
            this.commandFullScreen = commandFullScreen;

            this.weakPropertyChangeSupport = new WeakPropertyChangeSupport(this);
        }

        public void setZoom(int zoom) {
            if (this.zoom != zoom) {
                int old = this.zoom;
                this.zoom = zoom;
                this.weakPropertyChangeSupport.firePropertyChange("zoom", old, this.zoom);
            }
        }

        @Override
        public void addPropertyChangeListener(PropertyChangeListener l) {
            this.weakPropertyChangeSupport.addPropertyChangeListener(l);
        }

        @Override
        public void removePropertyChangeListener(PropertyChangeListener l) {
            this.weakPropertyChangeSupport.removePropertyChangeListener(l);
        }
    }

    public static class CustomComplexPopupMenuEdit {
        private String title;
        private Command commandCut;
        private Command commandCopy;
        private Command commandPaste;

        public CustomComplexPopupMenuEdit(String title, Command commandCut,
                Command commandCopy, Command commandPaste) {
            this.title = title;
            this.commandCut = commandCut;
            this.commandCopy = commandCopy;
            this.commandPaste = commandPaste;
        }
    }

    public static class CustomComplexPopupMenuHeader {
        private String title;
        private Command commandSignIn;
        private List<Color> colors;

        public CustomComplexPopupMenuHeader(String title, Command commandSignIn,
                List<Color> colors) {
            this.title = title;
            this.commandSignIn = commandSignIn;
            this.colors = colors;
        }
    }

    public static class CustomComplexPopupMenuFooter {
        private Command commandFooter;

        public CustomComplexPopupMenuFooter(Command commandFooter) {
            this.commandFooter = commandFooter;
        }
    }

    public static class CustomComplexPopupMenuSectionModel {
        private List<KeyValuePair<PopupMenuSectionEntryKind, Object>> sectionContent;

        public List<KeyValuePair<PopupMenuSectionEntryKind, Object>> getSectionContent() {
            return Collections.unmodifiableList(this.sectionContent);
        }
    }

    public static Builder sectionBuilder() {
        return new Builder();
    }

    public void addSection(CustomComplexPopupMenuSectionModel sectionModel) {
        this.sections.add(sectionModel);
    }

    public List<CustomComplexPopupMenuSectionModel> getSections() {
        return Collections.unmodifiableList(this.sections);
    }

    public static class Builder {
        private List<KeyValuePair<PopupMenuSectionEntryKind, Object>> sectionContent = new ArrayList<>();

        public Builder addCommand(Command command) {
            this.sectionContent.add(new KeyValuePair<>(PopupMenuSectionEntryKind.COMMAND, command));
            return this;
        }

        public Builder addZoom(CustomComplexPopupMenuZoom zoom) {
            this.sectionContent.add(new KeyValuePair<>(PopupMenuSectionEntryKind.ZOOM, zoom));
            return this;
        }

        public Builder addEdit(CustomComplexPopupMenuEdit edit) {
            this.sectionContent.add(new KeyValuePair<>(PopupMenuSectionEntryKind.EDIT, edit));
            return this;
        }

        public Builder addHeader(CustomComplexPopupMenuHeader header) {
            this.sectionContent.add(new KeyValuePair<>(PopupMenuSectionEntryKind.HEADER, header));
            return this;
        }

        public Builder addFooter(CustomComplexPopupMenuFooter footer) {
            this.sectionContent.add(new KeyValuePair<>(PopupMenuSectionEntryKind.FOOTER, footer));
            return this;
        }

        public CustomComplexPopupMenuSectionModel build() {
            CustomComplexPopupMenuSectionModel sectionModel = new CustomComplexPopupMenuSectionModel();
            sectionModel.sectionContent = Collections.unmodifiableList(this.sectionContent);
            return sectionModel;
        }
    }
}
