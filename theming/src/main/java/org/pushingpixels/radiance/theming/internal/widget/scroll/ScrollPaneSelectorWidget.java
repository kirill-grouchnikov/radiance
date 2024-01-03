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
package org.pushingpixels.radiance.theming.internal.widget.scroll;

import org.pushingpixels.radiance.theming.api.RadianceThemingWidget;
import org.pushingpixels.radiance.theming.api.painter.preview.PreviewPainter;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import javax.swing.*;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.event.HierarchyListener;
import java.beans.PropertyChangeListener;

/**
 * Widget that decorates scroll panes with selector.
 * 
 * @author Kirill Grouchnikov
 */
public class ScrollPaneSelectorWidget extends RadianceThemingWidget<JScrollPane> {
    /**
     * The scroll pane selector for the associated scroll pane.
     */
    private ScrollPaneSelector scrollPaneSelector;

    /**
     * Hierarchy listener - remove the selector in the scroll pane of a combo popup.
     */
    private HierarchyListener hierarchyListener;

    /**
     * Property change listener - listens on the changes to
     * {@link RadianceSynapse#COMPONENT_PREVIEW_PAINTER} property.
     */
    private PropertyChangeListener propertyChangeListener;

    @Override
    public void installUI() {
        if (RadianceCoreUtilities.toShowExtraWidgets(this.jcomp)) {

            PreviewPainter pPainter = WidgetUtilities.getComponentPreviewPainter(this.jcomp);
            if (pPainter == null)
                return;
            this.scrollPaneSelector = new ScrollPaneSelector();
            this.scrollPaneSelector.installOnScrollPane(this.jcomp);
        }
    }

    @Override
    public void uninstallUI() {
        if (this.scrollPaneSelector != null) {
            this.scrollPaneSelector.uninstallFromScrollPane();
            this.scrollPaneSelector = null;
        }
    }

    @Override
    public void installListeners() {
        this.hierarchyListener = hierarchyEvent -> {
            if (jcomp.getParent() instanceof ComboPopup) {
                if (scrollPaneSelector != null) {
                    scrollPaneSelector.uninstallFromScrollPane();
                    scrollPaneSelector = null;
                }
            }
        };
        this.jcomp.addHierarchyListener(this.hierarchyListener);

        this.propertyChangeListener = propertyChangeEvent -> {
            if (RadianceSynapse.COMPONENT_PREVIEW_PAINTER.equals(propertyChangeEvent.getPropertyName())) {
                PreviewPainter pPainter = WidgetUtilities.getComponentPreviewPainter(jcomp);
                // Uninstall old scroll pane selector
                if (scrollPaneSelector != null) {
                    scrollPaneSelector.uninstallFromScrollPane();
                    scrollPaneSelector = null;
                }
                // Install new scroll pane selector
                if (pPainter != null && RadianceCoreUtilities.toShowExtraWidgets(jcomp)) {
                    scrollPaneSelector = new ScrollPaneSelector();
                    scrollPaneSelector.installOnScrollPane(jcomp);
                }
            }
        };
        this.jcomp.addPropertyChangeListener(this.propertyChangeListener);
    }

    @Override
    public void uninstallListeners() {
        this.jcomp.removeHierarchyListener(this.hierarchyListener);
        this.hierarchyListener = null;

        this.jcomp.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;
    }
}
