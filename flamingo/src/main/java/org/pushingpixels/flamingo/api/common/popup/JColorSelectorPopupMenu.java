/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.flamingo.api.common.popup;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.model.*;
import org.pushingpixels.flamingo.api.common.projection.Projection;
import org.pushingpixels.flamingo.internal.substance.common.ui.SubstanceColorSelectorPopupMenuUI;
import org.pushingpixels.flamingo.internal.ui.common.popup.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.util.List;
import java.util.*;

public class JColorSelectorPopupMenu extends AbstractPopupMenu {
    /**
     * @see #getUIClassID
     */
    public static final String uiClassID = "ColorSelectorPopupMenuUI";

    private Projection<JColorSelectorPopupMenu, ColorSelectorPopupMenuContentModel,
            ColorSelectorPopupMenuPresentationModel> projection;
    private ColorSelectorPopupMenuContentModel contentModel;
    private ColorSelectorPopupMenuPresentationModel presentationModel;

    private ColorSelectorPopupMenuContentModel.ColorPreviewListener colorPreviewListener;
    private ColorSelectorPopupMenuContentModel.ColorActivationListener colorActivationListener;

    private int colorColumns;
    private JColorSelectorPanel lastColorSelectorPanel;

    private static LinkedList<Color> recentlySelected = new LinkedList<>();

    public JColorSelectorPopupMenu(Projection<JColorSelectorPopupMenu, ColorSelectorPopupMenuContentModel,
            ColorSelectorPopupMenuPresentationModel> projection) {
        this.projection = projection;
        this.contentModel = projection.getContentModel();
        this.presentationModel = projection.getPresentationModel();
        this.colorPreviewListener = this.contentModel.getColorPreviewListener();
        this.colorActivationListener = this.contentModel.getColorActivationListener();
        this.colorColumns = this.presentationModel.getColorColumns();

        this.populateContent();
        this.contentModel.addChangeListener((ChangeEvent event) -> populateContent());

        this.updateUI();
    }

    public Projection<JColorSelectorPopupMenu, ColorSelectorPopupMenuContentModel,
            ColorSelectorPopupMenuPresentationModel> getProjection() {
        return this.projection;
    }

    private void populateContent() {
        // Command presentation for menu content
        CommandPresentation presentation =
                CommandPresentation.builder()
                        .setPresentationState(
                                this.presentationModel.getMenuPresentationState())
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
                        AbstractCommandButton commandButton =
                                command.project(presentation).buildComponent();
                        if (commandButton instanceof JCommandMenuButton) {
                            this.addMenuButton((JCommandMenuButton) commandButton);
                        }
                        if (commandButton instanceof JCommandToggleMenuButton) {
                            this.addMenuButton((JCommandToggleMenuButton) commandButton);
                        }
                        break;
                    case COLOR_SECTION:
                        ColorSelectorPopupMenuGroupModel.ColorSectionModel colorSectionModel =
                                (ColorSelectorPopupMenuGroupModel.ColorSectionModel) groupEntry.getValue();
                        this.addColorSection(colorSectionModel.getTitle(),
                                colorSectionModel.getColors());
                        break;
                    case COLOR_SECTION_WITH_DERIVED:
                        ColorSelectorPopupMenuGroupModel.ColorSectionModel colorSectionWithDerivedModel =
                                (ColorSelectorPopupMenuGroupModel.ColorSectionModel) groupEntry.getValue();
                        this.addColorSectionWithDerived(colorSectionWithDerivedModel.getTitle(),
                                colorSectionWithDerivedModel.getColors());
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
        setUI(SubstanceColorSelectorPopupMenuUI.createUI(this));
    }

    private void addColorSectionWithDerived(String label, Color[] primaryColors) {
        if ((primaryColors == null) || (primaryColors.length != this.colorColumns)) {
            throw new IllegalArgumentException("Must pass exactly " + this.colorColumns +
                    " colors");
        }
        JPanel selectorContainer = new MultiRowSelector(this, primaryColors);
        JColorSelectorPanel selector = new JColorSelectorPanel(label, selectorContainer);
        this.addMenuPanel(selector);

        this.lastColorSelectorPanel = selector;
    }

    private void addColorSection(String label, Color[] primaryColors) {
        if ((primaryColors == null) || (primaryColors.length != this.colorColumns)) {
            throw new IllegalArgumentException("Must pass exactly " + this.colorColumns +
                    " colors");
        }
        JPanel selectorContainer = new SingleRowSelector(this, primaryColors);
        JColorSelectorPanel selector = new JColorSelectorPanel(label, selectorContainer);
        this.addMenuPanel(selector);
        this.lastColorSelectorPanel = selector;
    }

    private void addRecentSection(String label) {
        JPanel recent = new SingleRowSelector(this, recentlySelected.toArray(new Color[0]));
        JColorSelectorPanel recentPanel = new JColorSelectorPanel(label, recent);
        recentPanel.setLastPanel(true);
        this.addMenuPanel(recentPanel);
        this.lastColorSelectorPanel = recentPanel;
    }

    @Override
    void addMenuButton(JCommandMenuButton menuButton) {
        super.addMenuButton(menuButton);
        this.updateLastColorSelectorPanel();
    }

    @Override
    void addMenuButton(JCommandToggleMenuButton menuButton) {
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

    private static void wireToLRU(JColorSelectorComponent colorSelector) {
        colorSelector.addColorActivationListener((Color color) -> addColorToRecentlyUsed(color));
    }

    public synchronized static List<Color> getRecentlyUsedColors() {
        return Collections.unmodifiableList(recentlySelected);
    }

    public synchronized static void addColorToRecentlyUsed(Color color) {
        // is in?
        if (recentlySelected.contains(color)) {
            // bump up to the top of the most recent
            recentlySelected.remove(color);
            recentlySelected.addLast(color);
            return;
        }

        if (recentlySelected.size() == 100) {
            // too many in history, bump out the least recently used or added
            recentlySelected.removeFirst();
        }
        recentlySelected.addLast(color);
    }

    private class SingleRowSelector extends JPanel {
        private SingleRowSelector(final JColorSelectorPopupMenu colorSelectorPopupMenu,
                final Color... colors) {
            final JColorSelectorComponent[] comps = new JColorSelectorComponent[colors.length];
            for (int i = 0; i < colors.length; i++) {
                comps[i] = new JColorSelectorComponent(colors[i], colorPreviewListener,
                        colorActivationListener);
                wireToLRU(comps[i]);
                this.add(comps[i]);
            }

            this.setLayout(new LayoutManager() {
                @Override
                public void addLayoutComponent(String name, Component comp) {
                }

                @Override
                public void removeLayoutComponent(Component comp) {
                }

                @Override
                public Dimension minimumLayoutSize(Container parent) {
                    return new Dimension(10, 10);
                }

                @Override
                public Dimension preferredLayoutSize(Container parent) {
                    BasicColorSelectorPopupMenuUI ui =
                            (BasicColorSelectorPopupMenuUI) colorSelectorPopupMenu.getUI();
                    int gap = ui.getColorSelectorCellGap();
                    int size = ui.getColorSelectorCellSize();
                    return new Dimension(colors.length * size
                            + (colors.length + 1) * gap, size + 2 * gap);
                }

                @Override
                public void layoutContainer(Container parent) {
                    BasicColorSelectorPopupMenuUI ui =
                            (BasicColorSelectorPopupMenuUI) colorSelectorPopupMenu.getUI();
                    int gap = ui.getColorSelectorCellGap();
                    int size = ui.getColorSelectorCellSize();

                    if (parent.getComponentOrientation().isLeftToRight()) {
                        int x = gap;
                        int y = gap;
                        for (int i = 0; i < colors.length; i++) {
                            comps[i].setBounds(x, y, size, size);
                            x += (size + gap);
                        }
                    } else {
                        int x = getWidth() - gap;
                        int y = gap;
                        for (int i = 0; i < colors.length; i++) {
                            comps[i].setBounds(x - size, y, size, size);
                            x -= (size + gap);
                        }
                    }
                }
            });
        }
    }

    private class MultiRowSelector extends JPanel {
        private static final int SECONDARY_ROWS = 5;

        private MultiRowSelector(final JColorSelectorPopupMenu colorSelectorPopupMenu,
                final Color... colors) {
            final JColorSelectorComponent[][] comps =
                    new JColorSelectorComponent[colors.length][1 + SECONDARY_ROWS];
            for (int i = 0; i < colors.length; i++) {
                Color primary = colors[i];

                comps[i][0] = new JColorSelectorComponent(primary, colorPreviewListener,
                        colorActivationListener);
                wireToLRU(comps[i][0]);
                this.add(comps[i][0]);

                float[] primaryHsb = new float[3];
                Color.RGBtoHSB(primary.getRed(), primary.getGreen(), primary.getBlue(), primaryHsb);

                for (int row = 1; row <= SECONDARY_ROWS; row++) {
                    float bFactor = (float) (row - 1) / (float) (SECONDARY_ROWS);
                    bFactor = (float) Math.pow(bFactor, 1.4f);
                    float brightness = 1.0f - bFactor;

                    if (primaryHsb[1] == 0.0f) {
                        // special handling for gray scale
                        float max = 0.5f + 0.5f * primaryHsb[2];
                        brightness = max * (SECONDARY_ROWS - row + 1) / SECONDARY_ROWS;
                    }

                    Color secondary = new Color(Color.HSBtoRGB(primaryHsb[0],
                            primaryHsb[1] * (row + 1) / (SECONDARY_ROWS + 1), brightness));

                    comps[i][row] = new JColorSelectorComponent(secondary, colorPreviewListener,
                            colorActivationListener);
                    comps[i][row].setTopOpen(row > 1);
                    comps[i][row].setBottomOpen(row < SECONDARY_ROWS);
                    wireToLRU(comps[i][row]);
                    this.add(comps[i][row]);
                }
            }

            this.setLayout(new LayoutManager() {
                @Override
                public void addLayoutComponent(String name, Component comp) {
                }

                @Override
                public void removeLayoutComponent(Component comp) {
                }

                @Override
                public Dimension minimumLayoutSize(Container parent) {
                    return new Dimension(10, 10);
                }

                @Override
                public Dimension preferredLayoutSize(Container parent) {
                    BasicColorSelectorPopupMenuUI ui =
                            (BasicColorSelectorPopupMenuUI) colorSelectorPopupMenu.getUI();
                    int gap = ui.getColorSelectorCellGap();
                    int size = ui.getColorSelectorCellSize();
                    return new Dimension(colors.length * size + (colors.length + 1) * gap,
                            gap + size + gap + SECONDARY_ROWS * size + gap);
                }

                @Override
                public void layoutContainer(Container parent) {
                    BasicColorSelectorPopupMenuUI ui =
                            (BasicColorSelectorPopupMenuUI) colorSelectorPopupMenu.getUI();
                    int gap = ui.getColorSelectorCellGap();
                    int size = ui.getColorSelectorCellSize();

                    if (parent.getComponentOrientation().isLeftToRight()) {
                        int y = gap;
                        for (int row = 0; row <= SECONDARY_ROWS; row++) {
                            int x = gap;
                            for (int i = 0; i < colors.length; i++) {
                                comps[i][row].setBounds(x, y, size, size);
                                x += (size + gap);
                            }
                            y += size;
                            if (row == 0) {
                                y += gap;
                            }
                        }
                    } else {
                        int y = gap;

                        for (int row = 0; row <= SECONDARY_ROWS; row++) {
                            int x = getWidth() - gap;
                            for (int i = 0; i < colors.length; i++) {
                                comps[i][row].setBounds(x - size, y, size, size);
                                x -= (size + gap);
                            }
                            y += size;
                            if (row == 0) {
                                y += gap;
                            }
                        }
                    }
                }
            });
        }
    }
}
