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
package org.pushingpixels.radiance.demo.themingapps.mail;

import com.jgoodies.forms.builder.FormBuilder;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.demo.themingapps.mail.svg.*;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.renderer.RadiancePanelListCellRenderer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Main destinations panel (leftmost under LTR).
 */
public class DestinationsPanel extends PanelWithRightLine {
    private static class DestinationInfo {
        public RadianceIcon.Factory iconFactory;
        public String title;
        public int unread;

        public DestinationInfo(RadianceIcon.Factory iconFactory, String title, int unread) {
            this.iconFactory = iconFactory;
            this.title = title;
            this.unread = unread;
        }
    }

    private static class DestinationListModel extends AbstractListModel<DestinationInfo> {
        protected List<DestinationInfo> model;

        public DestinationListModel(DestinationInfo... infos) {
            super();
            model = new ArrayList<>();
            for (int i = 0; i < infos.length; i++) {
                model.add(infos[i]);
            }
        }

        @Override
        public DestinationInfo getElementAt(int index) {
            return model.get(index);
        }

        @Override
        public int getSize() {
            return model.size();
        }
    }

    public DestinationsPanel(Window window) {
        RadianceSkin currentSkin = RadianceThemingCortex.GlobalScope.getCurrentSkin();

        ComponentOrParentChainScope.setDecorationType(this, VisorMail.DESTINATIONS);
        this.setRightLineColor(currentSkin.getColorScheme(VisorMail.DESTINATIONS,
                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED).getDarkColor());
        this.setLayout(new VerticalStackLayout());

        // Get the color schemes for colorizing the icons.
        Color mainSelectorIconTitleColor = currentSkin
                .getColorScheme(VisorMail.DESTINATIONS,
                        ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)
                .getForegroundColor();

        RadianceIcon refreshIcon = refresh_black_24dp.factory().createNewIcon();
        refreshIcon.setColorFilter(color -> mainSelectorIconTitleColor);
        refreshIcon.setDimension(new Dimension(12, 12));
        this.add(getRefreshAction(window, refreshIcon));
        this.add(getMainLabel("MAIL"));

        JList<DestinationInfo> destinationList = new JList<>(
                new DestinationListModel(
                        new DestinationInfo(inbox_black_24dp.factory(), "Inbox", 6),
                        new DestinationInfo(send_black_24dp.factory(), "Sent", 3),
                        new DestinationInfo(watch_later_black_24dp.factory(), "Send later", 5),
                        new DestinationInfo(drafts_black_24dp.factory(), "Drafts", -1),
                        new DestinationInfo(star_border_black_24dp.factory(), "Starred", -1),
                        new DestinationInfo(delete_black_24dp.factory(), "Trash", -1)));
        destinationList.setCellRenderer(new DestinationRenderer());

        destinationList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        destinationList.setSelectedIndex(0);

        JScrollPane destinationScrollPane = new JScrollPane(destinationList);
        this.add(destinationScrollPane);

        this.setPreferredSize(new Dimension(200, 0));
    }

    private static class DestinationRenderer extends RadiancePanelListCellRenderer<DestinationInfo> {
        private JLabel iconLabel;
        private JLabel titleLabel;
        private JLabel unreadLabel;

        public DestinationRenderer() {
            FormBuilder builder = FormBuilder.create().
                    columns("center:pref, 4dlu, fill:pref:grow, 4dlu, center:pref").
                    rows("p").
                    padding(new EmptyBorder(8, 8, 8, 8));

            this.iconLabel = new JLabel();
            this.titleLabel = new JLabel();
            this.unreadLabel = new JLabel();
            builder.add(this.iconLabel).xy(1, 1);
            builder.add(this.titleLabel).xy(3, 1);
            builder.add(this.unreadLabel).xy(5, 1);

            // Register the text labels so that they get the right colors on rollover,
            // selection and other highlight effects
            this.registerThemeAwareLabelsWithText(this.iconLabel, this.titleLabel, this.unreadLabel);

            this.setLayout(new BorderLayout());
            this.add(builder.build(), BorderLayout.CENTER);

            this.setOpaque(false);
        }

        @Override
        protected void bindData(JList<? extends DestinationInfo> list, DestinationInfo value,
                int index) {
            this.titleLabel.setText(value.title);
            this.unreadLabel.setText(value.unread > 0 ? Integer.toString(value.unread) : "");
        }

        @Override
        protected void onPreRender(JList<? extends DestinationInfo> list, DestinationInfo value,
                int index) {
            // Register the matching icon factory here without setting the actual icon. The
            // icon will be created and colorized by Radiance runtime based on the highlight
            // state of the specific row at render time
            this.registerThemeAwareLabelWithIcon(this.iconLabel, value.iconFactory,
                    new Dimension(16, 16));
        }
    }

    private JPanel getMainLabel(String title) {
        FormBuilder builder = FormBuilder.create().
                columns("fill:pref:grow").
                rows("p").
                padding(new EmptyBorder(8, 8, 8, 8));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet()
                .getControlFont().deriveFont(Font.BOLD));
        builder.add(titleLabel).xy(1, 1);

        JPanel result = builder.build();
        return result;
    }

    private JPanel getRefreshAction(Window window, RadianceIcon icon) {
        FormBuilder builder = FormBuilder.create().
                columns("right:pref:grow").
                rows("p").
                padding(new EmptyBorder(12, 8, 12, 8));

        // Use Radiance API to create a button that has consistent look with the
        // title pane control buttons
        JButton refreshButton = RadianceThemingCortex.WindowScope.createTitlePaneControlButton(window);

        refreshButton.setIcon(icon);
        refreshButton.setToolTipText("Refresh mail");
        builder.add(refreshButton).xy(1, 1);

        JPanel result = builder.build();
        return result;
    }
}
