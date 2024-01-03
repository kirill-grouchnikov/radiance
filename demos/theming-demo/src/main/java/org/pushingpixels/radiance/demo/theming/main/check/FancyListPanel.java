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
package org.pushingpixels.radiance.demo.theming.main.check;

import com.jgoodies.forms.builder.FormBuilder;
import org.pushingpixels.radiance.demo.theming.main.check.svg.person_outline_black_24dp;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.renderer.RadiancePanelListCellRenderer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Test application panel for testing {@link JList} component using the
 * {@link RadiancePanelListCellRenderer} component.
 *
 * @author Kirill Grouchnikov
 */
public class FancyListPanel extends ControllablePanel {
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

    /**
     * List.
     */
    private JList<ThreadInfo> list;

    /**
     * Creates a new list panel.
     */
    public FancyListPanel() {
        super();
        setLayout(new BorderLayout());
        list = new JList<>(new ThreadListModel(
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
        list.setCellRenderer(new ThreadRenderer());
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(3);

        final JScrollPane jsp = new JScrollPane(list);
        this.add(jsp, BorderLayout.CENTER);
    }

    private static class ThreadRenderer extends RadiancePanelListCellRenderer<ThreadInfo> {
        private JLabel personLabel;
        private JLabel fromLabel;
        private JLabel timeLabel;
        private JLabel titleLabel;
        private JLabel summaryLabel;
        private JLabel unreadLabel;
        private JSeparator separator;

        public ThreadRenderer() {
            Font bold = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet()
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
            // selection and other highlight effects
            this.registerThemeAwareLabelsWithText(this.fromLabel, this.timeLabel, this.titleLabel,
                    this.summaryLabel, this.unreadLabel);
            // Register the icon factory for the person label here since the icon visuals
            // are the same for all the thread rows in this app
            this.registerThemeAwareLabelWithIcon(this.personLabel,
                    person_outline_black_24dp.factory(),
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
}
