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

import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.KeyValuePair;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.AbstractPopupMenuPanel;
import org.pushingpixels.radiance.component.api.common.projection.Projection;
import org.pushingpixels.radiance.component.internal.theming.common.ui.RadianceColorSelectorPopupMenuPanelUI;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.RadiancePopupContainer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.beans.PropertyChangeListener;
import java.util.List;

@RadiancePopupContainer
public class JCustomComplexPopupMenuPanel extends AbstractPopupMenuPanel {
    /**
     * @see #getUIClassID
     */
    public static final String uiClassID = "CustomComplexPopupMenuPanelUI";

    private Projection<JCustomComplexPopupMenuPanel, CustomComplexPopupMenuContentModel,
            CustomComplexPopupMenuPresentationModel> projection;
    private CustomComplexPopupMenuContentModel contentModel;
    private CustomComplexPopupMenuPresentationModel presentationModel;

    private PropertyChangeListener zoomPropertyChangeListener;

    public JCustomComplexPopupMenuPanel(Projection<JCustomComplexPopupMenuPanel, CustomComplexPopupMenuContentModel,
            CustomComplexPopupMenuPresentationModel> projection) {
        this.projection = projection;
        this.contentModel = projection.getContentModel();
        this.presentationModel = projection.getPresentationModel();

        this.populateContent();
        this.updateUI();
    }

    public Projection<JCustomComplexPopupMenuPanel, CustomComplexPopupMenuContentModel,
            CustomComplexPopupMenuPresentationModel> getProjection() {
        return this.projection;
    }

    private void populateContent() {
        // Command presentation for menu content
        CommandButtonPresentationModel presentation =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(this.presentationModel.itemPresentationState)
                        .setPopupFireTrigger(this.presentationModel.itemPopupFireTrigger)
                        .setSelectedStateHighlight(this.presentationModel.itemSelectedStateHighlight)
                        .setIconFilterStrategies(
                                this.presentationModel.itemIconActiveFilterStrategy,
                                this.presentationModel.itemIconEnabledFilterStrategy,
                                this.presentationModel.itemIconDisabledFilterStrategy
                        )
                        .setContentPadding(this.presentationModel.itemContentPadding)
                        .setHorizontalAlignment(this.presentationModel.itemHorizontalAlignment)
                        .setPopupPlacementStrategy(this.presentationModel.popupPlacementStrategy)
                        .build();

        List<CustomComplexPopupMenuContentModel.CustomComplexPopupMenuSectionModel> sections =
                this.contentModel.getSections();
        for (int i = 0; i < sections.size(); i++) {
            CustomComplexPopupMenuContentModel.CustomComplexPopupMenuSectionModel section = sections.get(i);
            for (KeyValuePair<CustomComplexPopupMenuContentModel.PopupMenuSectionEntryKind, Object> sectionEntry :
                    section.getSectionContent()) {
                switch (sectionEntry.getKey()) {
                    case COMMAND:
                        Command command = (Command) sectionEntry.getValue();
                        JCommandButton commandButton = command.project(presentation).buildComponent();
                        this.addMenuButton(commandButton);
                        break;
                    case EDIT:
                        CustomComplexPopupMenuContentModel.CustomComplexPopupMenuEdit edit =
                                (CustomComplexPopupMenuContentModel.CustomComplexPopupMenuEdit) sectionEntry.getValue();
                        this.addEditSection(edit);
                        break;
                    case ZOOM:
                        CustomComplexPopupMenuContentModel.CustomComplexPopupMenuZoom zoom =
                                (CustomComplexPopupMenuContentModel.CustomComplexPopupMenuZoom) sectionEntry.getValue();
                        this.addZoomSection(zoom);
                        break;
                    case FOOTER:
                        CustomComplexPopupMenuContentModel.CustomComplexPopupMenuFooter footer =
                                (CustomComplexPopupMenuContentModel.CustomComplexPopupMenuFooter) sectionEntry.getValue();
                        this.addFooterSection(footer);
                        break;
                }
            }
            if (i < (sections.size() - 1)) {
                this.addMenuSeparator();
            }
        }
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    @Override
    public void updateUI() {
        setUI(RadianceColorSelectorPopupMenuPanelUI.createUI(this));
    }

    private void addEditSection(CustomComplexPopupMenuContentModel.CustomComplexPopupMenuEdit edit) {
        JPanel section = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel(edit.getTitle());
        titleLabel.setBorder(new EmptyBorder(this.presentationModel.itemContentPadding));
        section.add(titleLabel, BorderLayout.LINE_START);

        JPanel commands = new JPanel();
        BoxLayout commandsLayout = new BoxLayout(commands, BoxLayout.LINE_AXIS);
        commands.setLayout(commandsLayout);

        commands.add(new JSeparator(JSeparator.VERTICAL));
        commands.add(edit.getCommandCut().project(this.presentationModel.editPresentationModel)
                .buildComponent());
        commands.add(new JSeparator(JSeparator.VERTICAL));
        commands.add(edit.getCommandCopy().project(this.presentationModel.editPresentationModel)
                .buildComponent());
        commands.add(new JSeparator(JSeparator.VERTICAL));
        commands.add(edit.getCommandPaste().project(this.presentationModel.editPresentationModel)
                .buildComponent());
        section.add(commands, BorderLayout.LINE_END);

        this.addMenuPanel(section);
    }

    private void addZoomSection(CustomComplexPopupMenuContentModel.CustomComplexPopupMenuZoom zoom) {
        JPanel section = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel(zoom.getTitle());
        titleLabel.setBorder(new EmptyBorder(this.presentationModel.itemContentPadding));
        section.add(titleLabel, BorderLayout.LINE_START);

        JPanel commands = new JPanel();
        BoxLayout commandsLayout = new BoxLayout(commands, BoxLayout.LINE_AXIS);
        commands.setLayout(commandsLayout);

        commands.add(new JSeparator(JSeparator.VERTICAL));
        commands.add(zoom.getCommandZoomOut().project(this.presentationModel.zoomPresentationModel)
                .buildComponent());
        commands.add(new JSeparator(JSeparator.VERTICAL));
        JLabel zoomLabel = new JLabel(String.valueOf(zoom.getZoom()));
        zoomLabel.setBorder(new EmptyBorder(this.presentationModel.zoomLabelPresentationModel.getContentPadding()));
        commands.add(zoomLabel);
        commands.add(new JSeparator(JSeparator.VERTICAL));
        commands.add(zoom.getCommandZoomIn().project(this.presentationModel.zoomPresentationModel)
                .buildComponent());
        section.add(commands, BorderLayout.LINE_END);

        this.zoomPropertyChangeListener = evt -> {
            if ("zoom".equals(evt.getPropertyName())) {
                zoomLabel.setText(String.valueOf(evt.getNewValue()));
            }
        };
        zoom.addPropertyChangeListener(this.zoomPropertyChangeListener);

        this.addMenuPanel(section);
    }

    private void addFooterSection(CustomComplexPopupMenuContentModel.CustomComplexPopupMenuFooter footer) {
        JPanel section = new JPanel(new BorderLayout());
        RadianceSkin skin = RadianceThemingCortex.ComponentScope.getCurrentSkin(this);
        RadianceThemingSlices.DecorationAreaType decorationAreaType =
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(this);
        RadianceColorScheme scheme = skin.getBackgroundColorScheme(decorationAreaType);

        RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(section, 1.0);
        section.setBackground(scheme.getAccentedBackgroundFillColor());

        section.add(footer.getCommandFooter().project(this.presentationModel.footerPresentationModel)
                .buildComponent(), BorderLayout.CENTER);

        this.addMenuPanel(section);
    }
}
