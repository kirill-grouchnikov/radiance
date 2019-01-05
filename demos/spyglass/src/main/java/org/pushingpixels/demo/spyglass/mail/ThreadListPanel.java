/*
 * Copyright (c) 2005-2019 Spyglass Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Spyglass Kirill Grouchnikov nor the names of
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
package org.pushingpixels.demo.spyglass.mail;

import com.jgoodies.forms.builder.FormBuilder;
import org.pushingpixels.demo.spyglass.mail.svg.*;
import org.pushingpixels.neon.NeonCortex;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.SubstanceSlices.*;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.renderer.SubstancePanelListCellRenderer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;
import java.util.*;

/**
 * Thread list panel (center).
 */
public class ThreadListPanel extends PanelWithRightLine {
    public ThreadListPanel() {
        this.setLayout(new VerticalStackLayout());

        SubstanceSkin currentSkin = SubstanceCortex.GlobalScope.getCurrentSkin();

        SubstanceCortex.ComponentOrParentChainScope.setDecorationType(this, VisorMail.THREADS);
        this.setRightLineColor(currentSkin.getColorScheme(VisorMail.THREADS,
                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED).getDarkColor());

        // Get the color schemes for colorizing the icons.
        SubstanceColorScheme fillScheme = currentSkin.getColorScheme(VisorMail.THREADS,
                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED);
        Color mainSelectorIconColor = fillScheme.getForegroundColor();

        ResizableIcon editIcon = NeonCortex.colorizeIcon(
                ic_mode_edit_black_24px.factory(), mainSelectorIconColor, 0.8f);
        editIcon.setDimension(new Dimension(14, 14));
        this.add(getTitlePanel(editIcon));

        ResizableIcon mailIcon = NeonCortex.colorizeIcon(
                ic_mail_outline_black_24px.factory(), mainSelectorIconColor);
        mailIcon.setDimension(new Dimension(12, 12));
        this.add(getInboxLabel("Inbox", mailIcon, fillScheme.getLightColor()));

        JList<ThreadInfo> threadList = new JList<>(new ThreadListModel(
                new ThreadInfo("Bob Macpearson", "5:50pm", "Welcome Natalie",
                        "Everybody please welcome our new team member", 3),
                new ThreadInfo("Eve Stephens", "5:35pm", "All hands rescheduled",
                        "We will send another update shortly", -1),
                new ThreadInfo("Randy White", "5:33pm", "Revenue target 'Q4",
                        "See the attached spreadsheet for the latest", 5),
                new ThreadInfo("Reception desk", "4:15pm", "Keys found",
                        "If you lost your keys stop by the reception desk", 2),
                new ThreadInfo("Amanda Pinewood", "4:00pm", "Samantha's baby!!!",
                        "It's a girl! And now the first photos", 12),
                new ThreadInfo("Jackson Grady", "11:58am", "Lunch meeting",
                        "Apologies for last minute reschedule", 1),
                new ThreadInfo("Robert Malone", "11:30am", "Project status update",
                        "Based on what we were talking about yesterday", -1),
                new ThreadInfo("Reception desk", "10:02am", "Car alarm",
                        "If you have a white Accord, its alarm is on", 2),
                new ThreadInfo("Jessica Fletcher", "10:01am", "Your flight",
                        "There has been a slight change to your flight", 2),
                new ThreadInfo("Josh Mandin", "9:29am", "Printer broken",
                        "We are aware of the issue with the main office printer", -1)));
        threadList.setCellRenderer(new ThreadRenderer());

        threadList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        threadList.setSelectedIndex(3);

        JScrollPane summaryScrollPane = new JScrollPane(threadList);
        this.add(summaryScrollPane);

        this.setPreferredSize(new Dimension(300, 0));
    }

    private static class ThreadInfo {
        public String from;
        public String time;
        public String title;
        public String summary;
        public int unread;

        public ThreadInfo(String from, String time, String title, String summary, int unread) {
            this.from = from;
            this.time = time;
            this.title = title;
            this.summary = summary;
            this.unread = unread;
        }
    }

    private static class ThreadListModel extends AbstractListModel<ThreadInfo> {
        protected List<ThreadInfo> model;

        public ThreadListModel(ThreadInfo... infos) {
            super();
            model = new ArrayList<>();
            for (int i = 0; i < infos.length; i++) {
                model.add(infos[i]);
            }
        }

        @Override
        public ThreadInfo getElementAt(int index) {
            return model.get(index);
        }

        @Override
        public int getSize() {
            return model.size();
        }
    }

    private static class ThreadRenderer extends SubstancePanelListCellRenderer<ThreadInfo> {
        private JLabel personLabel;
        private JLabel fromLabel;
        private JLabel timeLabel;
        private JLabel titleLabel;
        private JLabel summaryLabel;
        private JLabel unreadLabel;
        private JSeparator separator;

        public ThreadRenderer() {
            Font bold = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet(null)
                    .getControlFont().deriveFont(Font.BOLD);

            FormBuilder firstRow = FormBuilder.create().
                    columns("center:pref, 4dlu, fill:pref:grow, 4dlu, right:pref").
                    rows("p").
                    padding(new EmptyBorder(12, 16, 2, 16));

            this.personLabel = new JLabel();
            firstRow.add(this.personLabel).xy(1, 1);
            this.fromLabel = new JLabel();
            this.fromLabel.setFont(bold.deriveFont(bold.getSize() + 1.5f));
            firstRow.add(this.fromLabel).xy(3, 1);
            this.timeLabel = new JLabel();
            firstRow.add(this.timeLabel).xy(5, 1);

            FormBuilder secondRow = FormBuilder.create().
                    columns("fill:pref").
                    rows("p").
                    padding(new EmptyBorder(0, 16, 0, 16));
            this.titleLabel = new JLabel();
            this.titleLabel.setFont(bold);
            secondRow.add(this.titleLabel).xy(1, 1);

            FormBuilder thirdRow = FormBuilder.create().
                    columns("0dlu:grow, 16dlu, right:pref").
                    rows("p").
                    padding(new EmptyBorder(0, 16, 16, 16));
            this.summaryLabel = new JLabel();
            thirdRow.add(this.summaryLabel).xy(1, 1);
            this.unreadLabel = new JLabel();
            thirdRow.add(this.unreadLabel).xy(3, 1);

            this.separator = new JSeparator(JSeparator.HORIZONTAL);

            this.setLayout(new VerticalStackLayout());
            this.add(firstRow.build());
            this.add(secondRow.build());
            this.add(thirdRow.build());
            this.add(this.separator);

            // Register the text labels so that they get the right colors on rollover,
            // selection and other highight effects
            this.registerThemeAwareLabelsWithText(this.fromLabel, this.timeLabel, this.titleLabel,
                    this.summaryLabel, this.unreadLabel);
            // Register the icon factory for the person label here since the icon visuals
            // are the same for all the thread rows in this app
            this.registerThemeAwareLabelWithIcon(this.personLabel,
                    ic_person_outline_black_24px.factory(),
                    new Dimension(10, 10));

            this.setOpaque(false);
        }

        @Override
        protected void bindData(JList<? extends ThreadInfo> list, ThreadInfo value, int index) {
            this.fromLabel.setText(value.from);
            this.timeLabel.setText(value.time);
            this.titleLabel.setText(value.title);
            this.summaryLabel.setText(value.summary);
            if (value.unread > 0) {
                this.unreadLabel.setVisible(true);
                this.unreadLabel.setText(Integer.toString(value.unread));
            } else {
                this.unreadLabel.setVisible(false);
            }
        }
    }

    private static class HeaderPanel extends JPanel {
        public HeaderPanel(LayoutManager lm) {
            super(lm);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();

            int width = getWidth();
            int height = getHeight();

            g2d.setColor(getBackground());
            g2d.fillRect(0, 0, width, height);
            g2d.setColor(getBackground().darker());
            g2d.drawLine(0, 0, width, 0);
            g2d.drawLine(0, height, width, height);

            g2d.dispose();
        }
    }

    private JPanel getInboxLabel(String title, ResizableIcon icon, Color background) {
        FormBuilder builder = FormBuilder.create().
                columns("center:pref, 4dlu, fill:pref:grow").
                rows("p").
                padding(new EmptyBorder(4, 8, 4, 8));

        builder.add(new JLabel(icon)).xy(1, 1);
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(SubstanceCortex.GlobalScope.getFontPolicy().getFontSet(null)
                .getControlFont().deriveFont(Font.BOLD));
        builder.add(titleLabel).xy(3, 1);
        JPanel inside = builder.build();

        HeaderPanel result = new HeaderPanel(new BorderLayout());
        result.add(inside, BorderLayout.CENTER);
        result.setBackground(background);
        return result;
    }

    private JPanel getTitlePanel(ResizableIcon icon) {
        FormBuilder builder = FormBuilder.create().
                columns("fill:pref:grow, 8dlu, center:pref").
                rows("p").
                padding(new EmptyBorder(8, 8, 12, 8));

        JTextField searchBox = new JTextField("Search");
        builder.add(searchBox).xy(1, 1);

        JButton actionButton = new JButton(icon);
        SubstanceCortex.ComponentOrParentScope.setButtonIgnoreMinimumSize(actionButton,
                Boolean.TRUE);
        SubstanceCortex.ComponentOrParentScope.setFlatBackground(actionButton, Boolean.TRUE);
        builder.add(actionButton).xy(3, 1);
        JPanel result = builder.build();
        return result;
    }
}
