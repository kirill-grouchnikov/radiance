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
package org.pushingpixels.radiance.component.api.common.popup;

import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.KeyValuePair;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuContentModel;
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuGroupModel;
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.Projection;
import org.pushingpixels.radiance.component.internal.theming.common.ui.RadianceColorSelectorPopupMenuPanelUI;
import org.pushingpixels.radiance.component.internal.ui.common.popup.ColorSelectorPopupMenuMultiRowSelector;
import org.pushingpixels.radiance.component.internal.ui.common.popup.ColorSelectorPopupMenuSingleRowSelector;
import org.pushingpixels.radiance.component.internal.ui.common.popup.JColorSelectorPanel;
import org.pushingpixels.radiance.theming.internal.utils.RadiancePopupContainer;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@RadiancePopupContainer
public class JColorSelectorPopupMenuPanel extends AbstractPopupMenuPanel {
    /**
     * @see #getUIClassID
     */
    public static final String uiClassID = "ColorSelectorPopupMenuUI";

    private Projection<JColorSelectorPopupMenuPanel, ColorSelectorPopupMenuContentModel,
            ColorSelectorPopupMenuPresentationModel> projection;
    private ColorSelectorPopupMenuContentModel contentModel;
    private ColorSelectorPopupMenuPresentationModel presentationModel;

    private int colorColumns;
    private JColorSelectorPanel lastColorSelectorPanel;
    private ChangeListener contentChangeListener;

    private static LinkedList<Color> recentlySelected = new LinkedList<>();

    public JColorSelectorPopupMenuPanel(Projection<JColorSelectorPopupMenuPanel, ColorSelectorPopupMenuContentModel,
            ColorSelectorPopupMenuPresentationModel> projection) {
        this.projection = projection;
        this.contentModel = projection.getContentModel();
        this.presentationModel = projection.getPresentationModel();
        this.colorColumns = this.presentationModel.getColorColumns();

        this.populateContent();
        this.contentChangeListener = (ChangeEvent event) -> populateContent();
        this.contentModel.addChangeListener(this.contentChangeListener);

        this.updateUI();
    }

    public Projection<JColorSelectorPopupMenuPanel, ColorSelectorPopupMenuContentModel,
            ColorSelectorPopupMenuPresentationModel> getProjection() {
        return this.projection;
    }

    private void populateContent() {
        // Command presentation for menu content
        CommandButtonPresentationModel presentation =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(this.presentationModel.getMenuPresentationState())
                        .setPopupFireTrigger(this.presentationModel.getMenuPopupFireTrigger())
                        .setSelectedStateHighlight(this.presentationModel.getSelectedStateHighlight())
                        .setMenu(true)
                        .build();

        List<ColorSelectorPopupMenuGroupModel> menuGroups = this.contentModel.getMenuGroups();
        for (int i = 0; i < menuGroups.size(); i++) {
            ColorSelectorPopupMenuGroupModel menuGroup = menuGroups.get(i);
            for (KeyValuePair<ColorSelectorPopupMenuGroupModel.GroupEntryKind, Object> groupEntry :
                    menuGroup.getGroupContent()) {
                switch (groupEntry.getKey()) {
                    case COMMAND:
                        Command command = (Command) groupEntry.getValue();
                        JCommandButton commandButton = command.project(presentation).buildComponent();
                        this.addMenuButton(commandButton);
                        break;
                    case COLOR_SECTION:
                        ColorSelectorPopupMenuGroupModel.ColorSectionModel colorSectionModel =
                                (ColorSelectorPopupMenuGroupModel.ColorSectionModel) groupEntry.getValue();
                        this.addColorSection(colorSectionModel.getTitle(), colorSectionModel.getColors());
                        break;
                    case COLOR_SECTION_WITH_DERIVED:
                        ColorSelectorPopupMenuGroupModel.ColorSectionModelWithDerived colorSectionWithDerivedModel =
                                (ColorSelectorPopupMenuGroupModel.ColorSectionModelWithDerived) groupEntry.getValue();
                        this.addColorSectionWithDerived(colorSectionWithDerivedModel.getTitle(),
                                colorSectionWithDerivedModel.getColors(),
                                colorSectionWithDerivedModel.getDerivedCount());
                        break;
                    case RECENTS_SECTION:
                        ColorSelectorPopupMenuGroupModel.ColorSectionModel recentsSectionModel =
                                (ColorSelectorPopupMenuGroupModel.ColorSectionModel) groupEntry.getValue();
                        this.addRecentSection(recentsSectionModel.getTitle());
                }
            }
            if (i < (menuGroups.size() - 1)) {
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

    private void addColorSectionWithDerived(String label, Color[] primaryColors, int derivedCount) {
        if ((primaryColors == null) || (primaryColors.length != this.colorColumns)) {
            throw new IllegalArgumentException("Must pass exactly " + this.colorColumns + " colors");
        }
        if (derivedCount < 1) {
            throw new IllegalArgumentException("Needs to pass a non-trivial number of derived colors");
        }
        JPanel selectorContainer = new ColorSelectorPopupMenuMultiRowSelector(this, derivedCount,
                primaryColors);
        JColorSelectorPanel selector = new JColorSelectorPanel(label, selectorContainer);
        this.addMenuPanel(selector);

        this.lastColorSelectorPanel = selector;
    }

    private void addColorSection(String label, Color[] primaryColors) {
        if ((primaryColors == null) || (primaryColors.length != this.colorColumns)) {
            throw new IllegalArgumentException("Must pass exactly " + this.colorColumns + " colors");
        }
        JPanel selectorContainer = new ColorSelectorPopupMenuSingleRowSelector(this, primaryColors);
        JColorSelectorPanel selector = new JColorSelectorPanel(label, selectorContainer);
        this.addMenuPanel(selector);
        this.lastColorSelectorPanel = selector;
    }

    private void addRecentSection(String label) {
        int colorCount = Math.min(recentlySelected.size(), this.colorColumns);
        Color[] toDisplay = Arrays.copyOfRange(recentlySelected.toArray(new Color[0]), 0, colorCount);

        JPanel recent = new ColorSelectorPopupMenuSingleRowSelector(this, toDisplay);
        JColorSelectorPanel recentPanel = new JColorSelectorPanel(label, recent);
        recentPanel.setLastPanel(true);
        this.addMenuPanel(recentPanel);
        this.lastColorSelectorPanel = recentPanel;
    }

    @Override
    void addMenuButton(JCommandButton menuButton) {
        super.addMenuButton(menuButton);
        this.updateLastColorSelectorPanel();
    }

    @Override
    void addMenuSeparator() {
        super.addMenuSeparator();
        this.updateLastColorSelectorPanel();
    }

    private void updateLastColorSelectorPanel() {
        if (this.lastColorSelectorPanel != null) {
            this.lastColorSelectorPanel.setLastPanel(true);
            this.lastColorSelectorPanel = null;
        }
    }

    public synchronized static List<Color> getRecentlyUsedColors() {
        return Collections.unmodifiableList(recentlySelected);
    }

    public synchronized static void addColorToRecentlyUsed(Color color) {
        // Is it already in?
        if (recentlySelected.contains(color)) {
            // Bump up to the top of the most recent
            recentlySelected.remove(color);
            recentlySelected.addFirst(color);
            return;
        }

        if (recentlySelected.size() == 100) {
            // Too many in history, bump out the least recently used or added
            recentlySelected.removeLast();
        }
        recentlySelected.addFirst(color);
    }

}
