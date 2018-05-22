/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.samples.substance.mail;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.JXSearchField;
import org.pushingpixels.samples.substance.mail.svg.ic_mail_outline_black_24px;
import org.pushingpixels.samples.substance.mail.svg.ic_mode_edit_black_24px;
import org.pushingpixels.samples.substance.mail.svg.ic_person_outline_black_24px;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.LightAquaColorScheme;
import org.pushingpixels.substance.api.colorscheme.SteelBlueColorScheme;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIcon;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.highlight.FractionBasedHighlightPainter;
import org.pushingpixels.substance.api.painter.highlight.SubstanceHighlightPainter;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Main destinations panel (leftmost under LTR). In the real app this will probably be a JList
 * backed by an adapter and custom renderer(s).
 */
public class ThreadListPanel extends PanelWithRightLine {
    public ThreadListPanel() {
        this.setLayout(new VerticalStackLayout());

        SubstanceSkin currentSkin = SubstanceCortex.GlobalScope.getCurrentSkin();

        this.setRightLineColor(currentSkin.getColorScheme(DecorationAreaType.NONE,
                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED).getDarkColor());

        // Get the color schemes for colorizing the icons.
        SubstanceColorScheme fillScheme = currentSkin.getColorScheme(DecorationAreaType.NONE,
                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED);
        Color mainSelectorIconColor = fillScheme.getForegroundColor();

        this.add(getTitlePanel(
                ic_mode_edit_black_24px.of(14, 14).colorize(mainSelectorIconColor, 0.8f)));
        this.add(getInboxLabel("Inbox",
                ic_mail_outline_black_24px.of(12, 12).colorize(mainSelectorIconColor),
                fillScheme.getLightColor()));

        JList threadList = new JList(new ThreadListModel(
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

        threadList.setCellRenderer(new ListCellRenderer<ThreadInfo>() {
            @Override
            public Component getListCellRendererComponent(JList<? extends ThreadInfo> list,
                    ThreadInfo value, int index, boolean isSelected, boolean cellHasFocus) {
                HighlightablePanel summaryPanel = getThreadSummaryPanel(value, isSelected);
                if (isSelected) {
                    summaryPanel.setSelected();
                }
                return summaryPanel;
            }
        });

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

    private static class ThreadListModel extends AbstractListModel {
        protected List<ThreadInfo> model;

        public ThreadListModel(ThreadInfo... infos) {
            super();
            model = new ArrayList<ThreadInfo>();
            for (int i = 0; i < infos.length; i++) {
                model.add(infos[i]);
            }
        }

        @Override
        public Object getElementAt(int index) {
            return model.get(index);
        }

        @Override
        public int getSize() {
            return model.size();
        }
    }

    // This class emulates the highlights on rows.
    private static class HighlightablePanel extends JPanel {
        private boolean isSelected;

        public HighlightablePanel(JPanel content) {
            content.setOpaque(false);
            setLayout(new BorderLayout());
            add(content, BorderLayout.CENTER);
        }

        public void setSelected() {
            isSelected = true;
            setOpaque(!isSelected);
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (isSelected) {
                SubstanceSkin skin = SubstanceCortex.ComponentScope.getCurrentSkin(this);
                SubstanceHighlightPainter highlightPainter = new FractionBasedHighlightPainter(
                        "Custom", new float[] { 0.0f, 1.0f },
                        new ColorSchemeSingleColorQuery[] { ColorSchemeSingleColorQuery.EXTRALIGHT,
                                        ColorSchemeSingleColorQuery.EXTRALIGHT });
                SubstanceBorderPainter highlightBorderPainter = skin.getHighlightBorderPainter();
                if (highlightBorderPainter == null) {
                    highlightBorderPainter = skin.getBorderPainter();
                }
                SubstanceColorScheme fillScheme = new LightAquaColorScheme();
                SubstanceColorScheme borderScheme = new SteelBlueColorScheme();

                int width = this.getWidth();
                int height = this.getHeight();

                Graphics2D g2d = (Graphics2D) g.create();
                highlightPainter.paintHighlight(g2d, this, width, height, fillScheme);
                highlightBorderPainter.paintBorder(g2d, this, width, height,
                        new Rectangle2D.Float(0, 0, width, height), null, borderScheme);
                g2d.dispose();
            }

            super.paintComponent(g);
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

    private JPanel getInboxLabel(String title, SubstanceIcon icon, Color background) {
        FormLayout lm = new FormLayout("center:pref, 4dlu, fill:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm).border(new EmptyBorder(4, 8, 4, 8));
        builder.append(new JLabel(icon));
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(SubstanceCortex.GlobalScope.getFontPolicy().getFontSet("Substance", null)
                .getControlFont().deriveFont(Font.BOLD));
        builder.append(titleLabel);
        JPanel inside = builder.build();

        HeaderPanel result = new HeaderPanel(new BorderLayout());
        result.add(inside, BorderLayout.CENTER);
        result.setBackground(background);
        return result;
    }

    private HighlightablePanel getThreadSummaryPanel(ThreadInfo threadInfo, boolean isSelected) {
        Font bold = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet("Substance", null)
                .getControlFont().deriveFont(Font.BOLD);

        DefaultFormBuilder firstRow = new DefaultFormBuilder(
                new FormLayout("center:pref, 4dlu, fill:pref:grow, 4dlu, right:pref", ""))
                        .border(new EmptyBorder(12, 16, 2, 16));
        firstRow.append(new JLabel(ic_person_outline_black_24px.of(10, 10)));
        JLabel fromLabel = new JLabel(threadInfo.from);
        fromLabel.setFont(bold.deriveFont(bold.getSize() + 1.5f));
        firstRow.append(fromLabel);
        firstRow.append(new JLabel(threadInfo.time));

        DefaultFormBuilder secondRow = new DefaultFormBuilder(new FormLayout("fill:pref", ""))
                .border(new EmptyBorder(0, 16, 0, 16));
        JLabel titleLabel = new JLabel(threadInfo.title);
        titleLabel.setFont(bold);
        secondRow.append(titleLabel);

        DefaultFormBuilder thirdRow = new DefaultFormBuilder(
                new FormLayout("0dlu:grow, 16dlu, right:pref", ""))
                        .border(new EmptyBorder(0, 16, 16, 16));
        thirdRow.append(new JLabel(threadInfo.summary));
        if (threadInfo.unread > 0) {
            thirdRow.append(new JLabel(Integer.toString(threadInfo.unread)));
        }

        JPanel result = new JPanel(new VerticalStackLayout());
        result.add(firstRow.build());
        result.add(secondRow.build());
        result.add(thirdRow.build());
        if (!isSelected) {
            result.add(new JSeparator(JSeparator.HORIZONTAL));
        }
        return new HighlightablePanel(result);

    }

    private JPanel getTitlePanel(SubstanceIcon icon) {
        FormLayout lm = new FormLayout("fill:pref:grow, 8dlu, center:pref", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm)
                .border(new EmptyBorder(8, 8, 12, 8));

        JXSearchField searchBox = new JXSearchField("Search");
        builder.append(searchBox);

        JButton actionButton = new JButton(icon);
        SubstanceCortex.ComponentOrParentScope.setButtonIgnoreMinimumSize(actionButton,
                Boolean.TRUE);
        SubstanceCortex.ComponentOrParentScope.setFlatBackground(actionButton, Boolean.TRUE);
        builder.append(actionButton);
        JPanel result = builder.build();
        return result;
    }
}
