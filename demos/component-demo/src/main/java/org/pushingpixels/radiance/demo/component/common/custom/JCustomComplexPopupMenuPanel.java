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

import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.JExoLabel;
import org.pushingpixels.radiance.component.api.common.KeyValuePair;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.LabelContentModel;
import org.pushingpixels.radiance.component.api.common.model.LabelPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.AbstractPopupMenuPanel;
import org.pushingpixels.radiance.component.api.common.projection.LabelProjection;
import org.pushingpixels.radiance.component.api.common.projection.Projection;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.text.RadianceTextUtils;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeListener;
import java.util.List;

public class JCustomComplexPopupMenuPanel extends AbstractPopupMenuPanel {
    private Projection<JCustomComplexPopupMenuPanel, CustomComplexPopupMenuContentModel,
            CustomComplexPopupMenuPresentationModel> projection;
    private CustomComplexPopupMenuContentModel contentModel;
    private CustomComplexPopupMenuPresentationModel presentationModel;

    public JCustomComplexPopupMenuPanel(Projection<JCustomComplexPopupMenuPanel,
            CustomComplexPopupMenuContentModel,
            CustomComplexPopupMenuPresentationModel> projection) {
        this.projection = projection;
        this.contentModel = projection.getContentModel();
        this.presentationModel = projection.getPresentationModel();

        this.populateContent();
        this.updateUI();

        // This assumes that the content of the popup does not change. If it does, we would need to
        // register a change listener on the content model and update the content accordingly.
        for (Component comp : this.getMenuComponents()) {
            this.add(comp);
        }

        // Simple vertical stack, no scrolling built in. If scrolling needed, the entire content
        // or relevant part of it can be wrapped in a JScrollablePanel.
        this.setLayout(new LayoutManager() {
            @Override
            public void addLayoutComponent(String name, Component comp) {
            }

            @Override
            public void removeLayoutComponent(Component comp) {
            }

            private int getLabelPreferredSingleLineWidth(
                    LabelContentModel contentModel,
                    LabelPresentationModel presentationModel,
                    Font font
            ) {
                return presentationModel.getContentPadding().left
                        + RadianceTextUtils.getLabelPreferredSingleLineWidth(
                        JCustomComplexPopupMenuPanel.this, contentModel.getText(), font)
                        + presentationModel.getContentPadding().right;
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                int combinedHeight = 0;
                int maxPrimaryWidth = 0;
                int maxActionWidth = 0;

                // Rows such as zoom, edit and header have two areas: title and actions.
                // Treat the title area separately to be aligned with the command-based
                // rows. That is, do not allow the action area of any such row to vertically
                // overlap with the text of any command-based row.

                Font defaultFont = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet().getControlFont();
                int entryIndex = 0;
                List<CustomComplexPopupMenuContentModel.CustomComplexPopupMenuSectionModel> sections =
                        contentModel.getSections();
                for (CustomComplexPopupMenuContentModel.CustomComplexPopupMenuSectionModel section : sections) {
                    for (KeyValuePair<CustomComplexPopupMenuContentModel.PopupMenuSectionEntryKind, Object> sectionEntry :
                            section.getSectionContent()) {
                        switch (sectionEntry.getKey()) {
                            case COMMAND:
                                JCommandButton commandButton =
                                        (JCommandButton) parent.getComponent(entryIndex++);
                                CommandButtonLayoutManager regularLayoutManager =
                                        presentationModel.itemPresentationState
                                                .createLayoutManager(commandButton);
                                Dimension preferredSize =
                                        regularLayoutManager.getPreferredSize(commandButton);

                                maxPrimaryWidth = Math.max(maxPrimaryWidth, preferredSize.width);
                                combinedHeight += preferredSize.height;
                                break;
                            case EDIT:
                                CustomComplexPopupMenuContentModel.CustomComplexPopupMenuEdit edit =
                                        (CustomComplexPopupMenuContentModel.CustomComplexPopupMenuEdit) sectionEntry.getValue();
                                EditSection editSection = (EditSection) parent.getComponent(entryIndex++);

                                int editTitleWidth = getLabelPreferredSingleLineWidth(
                                        LabelContentModel.builder().setText(edit.getTitle()).build(),
                                        LabelPresentationModel.builder()
                                                .setContentPadding(presentationModel.itemContentPadding)
                                                .setTextMaxLines(1)
                                                .build(),
                                        defaultFont
                                );
                                maxPrimaryWidth = Math.max(maxPrimaryWidth, editTitleWidth);

                                Dimension cutPreferredSize = presentationModel.editPresentationModel
                                        .getPresentationState().createLayoutManager(editSection.getCutButton())
                                        .getPreferredSize(editSection.getCutButton());
                                Dimension copyPreferredSize = presentationModel.editPresentationModel
                                        .getPresentationState().createLayoutManager(editSection.getCopyButton())
                                        .getPreferredSize(editSection.getCopyButton());
                                Dimension pastePreferredSize = presentationModel.editPresentationModel
                                        .getPresentationState().createLayoutManager(editSection.getPasteButton())
                                        .getPreferredSize(editSection.getPasteButton());

                                maxActionWidth = Math.max(
                                        maxActionWidth,
                                        cutPreferredSize.width + copyPreferredSize.width + pastePreferredSize.width + 6
                                );

                                combinedHeight += cutPreferredSize.height;

                                break;
                            case ZOOM:
                                CustomComplexPopupMenuContentModel.CustomComplexPopupMenuZoom zoom =
                                        (CustomComplexPopupMenuContentModel.CustomComplexPopupMenuZoom) sectionEntry.getValue();
                                ZoomSection zoomSection = (ZoomSection) parent.getComponent(entryIndex++);

                                int zoomTitleWidth = getLabelPreferredSingleLineWidth(
                                        LabelContentModel.builder().setText(zoom.getTitle()).build(),
                                        LabelPresentationModel.builder()
                                                .setContentPadding(presentationModel.itemContentPadding)
                                                .setTextMaxLines(1)
                                                .build(),
                                        defaultFont
                                );
                                maxPrimaryWidth = Math.max(maxPrimaryWidth, zoomTitleWidth);

                                Dimension zoomOutPreferredSize = presentationModel.zoomPresentationModel
                                        .getPresentationState().createLayoutManager(zoomSection.getZoomOutButton())
                                        .getPreferredSize(zoomSection.getZoomOutButton());
                                int zoomLevelWidth = getLabelPreferredSingleLineWidth(
                                        LabelContentModel.builder().setText(
                                                presentationModel.zoomLabelPresentationModel.getSingleLineDisplayPrototype()
                                        ).build(),
                                        presentationModel.zoomLabelPresentationModel,
                                        defaultFont
                                );
                                Dimension zoomInPreferredSize = presentationModel.zoomPresentationModel
                                        .getPresentationState().createLayoutManager(zoomSection.getZoomInButton())
                                        .getPreferredSize(zoomSection.getZoomInButton());
                                Dimension fullScreenPreferredSize = presentationModel.fullScreenPresentationModel
                                        .getPresentationState().createLayoutManager(zoomSection.getFullScreenButton())
                                        .getPreferredSize(zoomSection.getFullScreenButton());

                                maxActionWidth = Math.max(
                                        maxActionWidth,
                                        zoomOutPreferredSize.width + zoomLevelWidth + zoomInPreferredSize.width + fullScreenPreferredSize.width + 4
                                );

                                combinedHeight += zoomOutPreferredSize.height;

                                break;
                            case HEADER:
                                CustomComplexPopupMenuContentModel.CustomComplexPopupMenuHeader header =
                                        (CustomComplexPopupMenuContentModel.CustomComplexPopupMenuHeader) sectionEntry.getValue();
                                HeaderSection headerSection = (HeaderSection) parent.getComponent(entryIndex++);

                                int headerTitleWidth = getLabelPreferredSingleLineWidth(
                                        LabelContentModel.builder().setText(header.getTitle()).build(),
                                        presentationModel.headerTitlePresentationModel,
                                        defaultFont
                                );
                                maxPrimaryWidth = Math.max(maxPrimaryWidth, headerTitleWidth);

                                Dimension signInPreferredSize = presentationModel.headerSignInPresentationModel
                                        .getPresentationState().createLayoutManager(headerSection.getSignInButton())
                                        .getPreferredSize(headerSection.getSignInButton());

                                maxActionWidth = Math.max(maxActionWidth, signInPreferredSize.width);

                                combinedHeight += (signInPreferredSize.height + presentationModel.headerSeparatorHeight);

                                break;
                            case FOOTER:
                                FooterSection footerSection = (FooterSection) parent.getComponent(entryIndex++);

                                Dimension footerPreferredSize = presentationModel.footerPresentationModel
                                        .getPresentationState().createLayoutManager(footerSection.getFooterButton())
                                        .getPreferredSize(footerSection.getFooterButton());

                                maxPrimaryWidth = Math.max(maxPrimaryWidth, footerPreferredSize.width);
                                combinedHeight += footerPreferredSize.height;
                                break;
                        }
                    }
                    // Account for the section separator in index tracking
                    entryIndex++;
                }

                // Account for horizontal separators between sections
                combinedHeight += (sections.size() - 1) * 2;

                Insets ins = parent.getInsets();
                // For width, account for horizontal insets, the max width of the "primary" section,
                // an extra gap of 32 pixels between "primary" and "action", and the max width of
                // the "action" section
                return new Dimension(ins.left + maxPrimaryWidth + 32 + maxActionWidth + ins.right,
                        combinedHeight + ins.top + ins.bottom);
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return preferredLayoutSize(parent);
            }

            @Override
            public void layoutContainer(Container parent) {
                Insets ins = parent.getInsets();

                int topY = ins.top;
                for (int i = 0; i < parent.getComponentCount(); i++) {
                    Component comp = parent.getComponent(i);
                    Dimension pref = comp.getPreferredSize();
                    comp.setBounds(ins.left, topY, parent.getWidth() - ins.left - ins.right,
                            pref.height);
                    topY += pref.height;
                }
            }
        });
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
                        .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)
                        .setContentPadding(this.presentationModel.itemContentPadding)
                        .setHorizontalAlignment(this.presentationModel.itemHorizontalAlignment)
                        .setSides(RadianceThemingSlices.Sides.CLOSED_RECTANGLE)
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
                        this.addMenuPanel(new EditSection(edit));
                        break;
                    case ZOOM:
                        CustomComplexPopupMenuContentModel.CustomComplexPopupMenuZoom zoom =
                                (CustomComplexPopupMenuContentModel.CustomComplexPopupMenuZoom) sectionEntry.getValue();
                        this.addMenuPanel(new ZoomSection(zoom));
                        break;
                    case HEADER:
                        CustomComplexPopupMenuContentModel.CustomComplexPopupMenuHeader header =
                                (CustomComplexPopupMenuContentModel.CustomComplexPopupMenuHeader) sectionEntry.getValue();
                        this.addMenuPanel(new HeaderSection(header));
                        break;
                    case FOOTER:
                        CustomComplexPopupMenuContentModel.CustomComplexPopupMenuFooter footer =
                                (CustomComplexPopupMenuContentModel.CustomComplexPopupMenuFooter) sectionEntry.getValue();
                        this.addMenuPanel(new FooterSection(footer));
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
        return "PanelUI";
    }

    private JSeparator getHardVerticalSeparator() {
        JSeparator separator = new JSeparator(JSeparator.VERTICAL);
        RadianceThemingCortex.ComponentScope.setSeparatorAppearance(separator,
                RadianceThemingSlices.SeparatorAppearance.HARD);
        return separator;
    }

    private class EditSection extends JPanel {
        private JCommandButton cutButton;
        private JCommandButton copyButton;
        private JCommandButton pasteButton;

        public EditSection(CustomComplexPopupMenuContentModel.CustomComplexPopupMenuEdit edit) {
            this.setLayout(new BorderLayout());

            JExoLabel titleLabel = new LabelProjection(
                    LabelContentModel.builder().setText(edit.getTitle()).build(),
                    LabelPresentationModel.builder()
                            .setTextMaxLines(1)
                            .setContentPadding(presentationModel.itemContentPadding)
                            .build()
            ).buildComponent();
            this.add(titleLabel, BorderLayout.LINE_START);

            JPanel commands = new JPanel();
            BoxLayout commandsLayout = new BoxLayout(commands, BoxLayout.LINE_AXIS);
            commands.setLayout(commandsLayout);

            commands.add(getHardVerticalSeparator());
            this.cutButton = edit.getCommandCut().project(presentationModel.editPresentationModel)
                    .buildComponent();
            commands.add(this.cutButton);
            commands.add(getHardVerticalSeparator());
            this.copyButton = edit.getCommandCopy().project(presentationModel.editPresentationModel)
                    .buildComponent();
            commands.add(this.copyButton);
            commands.add(getHardVerticalSeparator());
            this.pasteButton = edit.getCommandPaste().project(presentationModel.editPresentationModel)
                    .buildComponent();
            commands.add(this.pasteButton);
            this.add(commands, BorderLayout.LINE_END);
        }

        public JCommandButton getCutButton() {
            return cutButton;
        }

        public JCommandButton getCopyButton() {
            return copyButton;
        }

        public JCommandButton getPasteButton() {
            return pasteButton;
        }
    }

    private class ZoomSection extends JPanel {
        @SuppressWarnings("FieldCanBeLocal")
        private PropertyChangeListener zoomPropertyChangeListener;
        private JCommandButton zoomOutButton;
        private JCommandButton zoomInButton;
        private JCommandButton fullScreenButton;

        public ZoomSection(CustomComplexPopupMenuContentModel.CustomComplexPopupMenuZoom zoom) {
            this.setLayout(new BorderLayout());
            JExoLabel titleLabel = new LabelProjection(
                    LabelContentModel.builder().setText(zoom.getTitle()).build(),
                    LabelPresentationModel.builder()
                            .setTextMaxLines(1)
                            .setContentPadding(presentationModel.itemContentPadding)
                            .build()
            ).buildComponent();
            this.add(titleLabel, BorderLayout.LINE_START);

            JPanel commands = new JPanel();
            BoxLayout commandsLayout = new BoxLayout(commands, BoxLayout.LINE_AXIS);
            commands.setLayout(commandsLayout);

            commands.add(getHardVerticalSeparator());

            this.zoomOutButton = zoom.getCommandZoomOut().project(presentationModel.zoomPresentationModel)
                    .buildComponent();
            commands.add(this.zoomOutButton);

            LabelContentModel zoomContentModel = LabelContentModel.builder().
                    setText(String.valueOf(zoom.getZoom())).build();

            JExoLabel zoomLabel = new LabelProjection(zoomContentModel,
                    presentationModel.zoomLabelPresentationModel
            ).buildComponent();
            commands.add(zoomLabel);

            this.zoomInButton = zoom.getCommandZoomIn().project(presentationModel.zoomPresentationModel)
                    .buildComponent();
            commands.add(this.zoomInButton);

            commands.add(getHardVerticalSeparator());

            this.fullScreenButton = zoom.getCommandFullScreen().project(presentationModel.fullScreenPresentationModel)
                    .buildComponent();
            commands.add(this.fullScreenButton);

            this.add(commands, BorderLayout.LINE_END);

            this.zoomPropertyChangeListener = evt -> {
                if ("zoom".equals(evt.getPropertyName())) {
                    // Propagate the zoom level change into our label content model
                    zoomContentModel.setText(String.valueOf(evt.getNewValue()));
                }
            };
            zoom.addPropertyChangeListener(this.zoomPropertyChangeListener);
        }

        public JCommandButton getZoomOutButton() {
            return zoomOutButton;
        }

        public JCommandButton getZoomInButton() {
            return zoomInButton;
        }

        public JCommandButton getFullScreenButton() {
            return fullScreenButton;
        }
    }

    private class HeaderSection extends JPanel {
        private JCommandButton signInButton;

        public HeaderSection(CustomComplexPopupMenuContentModel.CustomComplexPopupMenuHeader header) {
            this.setLayout(new BorderLayout());

            JPanel mainSection = new JPanel(new BorderLayout());
            JExoLabel titleLabel = new LabelProjection(
                    LabelContentModel.builder().setText(header.getTitle()).build(),
                    presentationModel.headerTitlePresentationModel
            ).buildComponent();
            mainSection.add(titleLabel, BorderLayout.LINE_START);

            JPanel signInPanel = new JPanel(new BorderLayout());
            RadianceSkin skin = RadianceThemingCortex.ComponentScope.getCurrentSkin(this);
            RadianceThemingSlices.DecorationAreaType decorationAreaType =
                    RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(this);
            RadianceColorScheme scheme = skin.getBackgroundColorScheme(decorationAreaType);

            RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(signInPanel, 1.0);
            signInPanel.setBackground(scheme.getAccentedBackgroundFillColor());

            this.signInButton = header.getCommandSignIn().project(presentationModel.headerSignInPresentationModel).
                    buildComponent();
            signInPanel.add(this.signInButton, BorderLayout.CENTER);
            mainSection.add(signInPanel, BorderLayout.LINE_END);

            this.add(mainSection, BorderLayout.CENTER);

            JPanel headerSeparator = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    int width = getWidth();
                    Graphics2D g2d = (Graphics2D) g.create();

                    int stopCount = header.getColors().length;
                    float[] stops = new float[stopCount];
                    stops[0] = 0.0f;
                    for (int stop = 1; stop <= (stopCount - 2); stop++) {
                        stops[stop] = (float) stop / (float) stopCount;
                    }
                    stops[stopCount - 1] = 1.0f;

                    g2d.setPaint(new LinearGradientPaint(
                            0.0f, 0.0f, width, 0.0f,
                            stops, header.getColors()
                    ));
                    g2d.fillRect(0, 0, width, getHeight());

                    g2d.dispose();
                }
            };
            headerSeparator.setPreferredSize(new Dimension(0, presentationModel.headerSeparatorHeight));
            this.add(headerSeparator, BorderLayout.SOUTH);
        }

        public JCommandButton getSignInButton() {
            return signInButton;
        }
    }

    private class FooterSection extends JPanel {
        private JCommandButton footerButton;

        public FooterSection(CustomComplexPopupMenuContentModel.CustomComplexPopupMenuFooter footer) {
            this.setLayout(new BorderLayout());
            RadianceSkin skin = RadianceThemingCortex.ComponentScope.getCurrentSkin(this);
            RadianceThemingSlices.DecorationAreaType decorationAreaType =
                    RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(this);
            RadianceColorScheme scheme = skin.getBackgroundColorScheme(decorationAreaType);

            RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(this, 1.0);
            this.setBackground(scheme.getAccentedBackgroundFillColor());

            this.footerButton = footer.getCommandFooter().project(presentationModel.footerPresentationModel)
                    .buildComponent();
            this.add(this.footerButton, BorderLayout.CENTER);
        }

        public JCommandButton getFooterButton() {
            return footerButton;
        }
    }
}
