/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.spyglass.mail;

import com.jgoodies.forms.builder.FormBuilder;
import org.pushingpixels.demo.spyglass.mail.svg.*;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Thread content panel (rightmost under LTR). In the real app this will probably be a collapsible
 * list backed by an adapter and custom renderer(s).
 */
public class ThreadPanel extends JPanel {
    public ThreadPanel() {
        this.setLayout(new VerticalStackLayout());

        SubstanceSkin currentSkin = SubstanceCortex.GlobalScope.getCurrentSkin();
        SubstanceColorScheme fillScheme = currentSkin.getColorScheme(DecorationAreaType.NONE,
                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED);
        Color iconColor = fillScheme.getForegroundColor();
        Color backgroundColor = fillScheme.getLightColor();
        Color innerBackgroundColor = fillScheme.getUltraLightColor();

        this.add(getHeaderActionsPanel(iconColor, backgroundColor));
        this.add(getMessageTitlePanel("Keys found", backgroundColor));

        this.add(getCollapsedMessagePanel("Reception desk",
                "If you lost your keys stop by the reception desk", "10:25am", innerBackgroundColor,
                backgroundColor));
        this.add(getCollapsedMessagePanel("Bryce Dunwood", "I think those might be Grayson's",
                "10:28am", innerBackgroundColor, backgroundColor));
        this.add(getFullMessagePanel("Reception desk", "Today, 4:15pm",
                "Bryce Dunwood, Grayson Flay",
                "Thanks, Bryce.\n\nGrayson, can you check if you still have your keys?\n\n"
                        + "It's a silver keychain with five keys and a small elephant. "
                        + "If these are yours, please stop by. We'll be here until six today.\n\n"
                        + "Morgan from reception.",
                innerBackgroundColor, backgroundColor, iconColor));

        this.add(getFooterActionsPanel(backgroundColor, iconColor));

        this.setBackground(backgroundColor);

        this.setPreferredSize(new Dimension(400, 0));
    }

    private JPanel getHeaderActionsPanel(Color iconColor, Color backgroundColor) {
        JPanel result = new JPanel(new FlowLayout(FlowLayout.LEADING, 24, 0));
        result.setBorder(new EmptyBorder(14, 4, 14, 4));

        ResizableIcon closeIcon = NeonCortex.colorizeIcon(
                ic_close_black_24px.factory(), iconColor, 0.8f);
        closeIcon.setDimension(new Dimension(16, 16));
        result.add(new JLabel(closeIcon));

        ResizableIcon listIcon = NeonCortex.colorizeIcon(
                ic_view_list_black_24px.factory(), iconColor, 0.8f);
        listIcon.setDimension(new Dimension(16, 16));
        result.add(new JLabel(listIcon));

        ResizableIcon alarmIcon = NeonCortex.colorizeIcon(
                ic_access_alarm_black_24px.factory(), iconColor, 0.8f);
        alarmIcon.setDimension(new Dimension(16, 16));
        result.add(new JLabel(alarmIcon));

        ResizableIcon archiveIcon = NeonCortex.colorizeIcon(
                ic_archive_black_24px.factory(), iconColor, 0.8f);
        archiveIcon.setDimension(new Dimension(16, 16));
        result.add(new JLabel(archiveIcon));

        ResizableIcon deleteIcon = NeonCortex.colorizeIcon(
                ic_delete_black_24px.factory(), iconColor, 0.8f);
        deleteIcon.setDimension(new Dimension(16, 16));
        result.add(new JLabel(deleteIcon));

        result.setBackground(backgroundColor);

        return result;
    }

    private JPanel getMessageTitlePanel(String title, Color backgroundColor) {
        JPanel result = new JPanel(new BorderLayout());
        result.setBorder(new EmptyBorder(6, 12, 16, 12));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(SubstanceCortex.GlobalScope.getFontPolicy().getFontSet()
                .getControlFont().deriveFont(Font.BOLD, 19.0f));
        result.add(titleLabel);

        result.setBackground(backgroundColor);

        return result;
    }

    private JPanel getCollapsedMessagePanel(String from, String summary, String date,
            Color innerBackground, Color outerBackground) {
        FormBuilder builder = FormBuilder.create().
                columns("center:pref, 8dlu, 0dlu:grow, 8dlu, right:pref").
                rows("p").
                padding(new EmptyBorder(8, 16, 8, 16));
        Font baseFont = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet()
                .getControlFont();

        JLabel senderLabel = new JLabel(from);
        senderLabel.setFont(baseFont.deriveFont(Font.BOLD));
        builder.add(senderLabel).xy(1, 1);

        builder.add(new JLabel(summary)).xy(3, 1);

        JLabel dateLabel = new JLabel(date);
        dateLabel.setFont(baseFont.deriveFont(baseFont.getSize() - 2.0f));
        builder.add(dateLabel).xy(5, 1);

        JPanel result = new JPanel(new BorderLayout());
        result.setBorder(new EmptyBorder(2, 8, 2, 8));
        result.setBackground(outerBackground);

        JPanel inner = builder.build();
        inner.setOpaque(true);
        inner.setBackground(innerBackground);
        result.add(inner, BorderLayout.CENTER);

        return result;
    }

    private JPanel getFullMessagePanel(String from, String date, String to, String message,
            Color innerBackground, Color outerBackground, Color iconColor) {
        FormBuilder firstRow = FormBuilder.create().
                columns("0dlu:grow, 8dlu, right:pref, 8dlu, center:pref, 8dlu, center:pref").
                rows("p").
                padding(new EmptyBorder(8, 16, 2, 16));
        Font baseFont = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet()
                .getControlFont();

        JLabel senderLabel = new JLabel(from);
        senderLabel.setFont(baseFont.deriveFont(Font.BOLD));
        firstRow.add(senderLabel).xy(1, 1);

        JLabel dateLabel = new JLabel(date);
        dateLabel.setFont(baseFont.deriveFont(baseFont.getSize() - 2.0f));
        firstRow.add(dateLabel).xy(3, 1);

        ResizableIcon replyIcon = NeonCortex.colorizeIcon(
                ic_reply_black_24px.factory(), iconColor, 0.8f);
        replyIcon.setDimension(new Dimension(14, 14));
        firstRow.add(new JLabel(replyIcon)).xy(5, 1);

        ResizableIcon moreIcon = NeonCortex.colorizeIcon(
                ic_more_horiz_black_24px.factory(), iconColor, 0.8f);
        moreIcon.setDimension(new Dimension(14, 14));
        firstRow.add(new JLabel(moreIcon)).xy(7, 1);

        JLabel toLabel = new JLabel("To: " + to);
        toLabel.setBorder(new EmptyBorder(0, 16, 24, 16));

        JEditorPane messagePane = new JEditorPane();
        messagePane.setContentType("text/plain");
        messagePane.setBorder(new EmptyBorder(0, 16, 0, 16));
        messagePane.setBackground(innerBackground);
        messagePane.setText(message);

        Color historyColor = new Color(32, 96, 148);
        ResizableIcon historyIcon = NeonCortex.colorizeIcon(
                ic_history_black_24px.factory(), historyColor);
        historyIcon.setDimension(new Dimension(12, 12));
        JLabel historyLabel = new JLabel("Show History", historyIcon, JLabel.LEADING);
        historyLabel.setBorder(new EmptyBorder(24, 16, 16, 16));
        historyLabel.setForeground(historyColor);
        SubstanceCortex.ComponentOrParentChainScope.setColorizationFactor(historyLabel, 1.0);

        JPanel result = new JPanel(new BorderLayout());
        result.setBorder(new EmptyBorder(2, 8, 2, 8));
        result.setBackground(outerBackground);

        JPanel inner = new JPanel(new VerticalStackLayout());
        inner.setOpaque(true);
        inner.setBackground(innerBackground);
        inner.add(firstRow.build());
        inner.add(toLabel);
        inner.add(messagePane);
        inner.add(historyLabel);

        result.add(inner, BorderLayout.CENTER);

        return result;
    }

    private JPanel getFooterActionsPanel(Color backgroundColor, Color iconColor) {
        JPanel result = new JPanel(new FlowLayout(FlowLayout.TRAILING, 8, 0));
        result.setBorder(new EmptyBorder(16, 24, 16, 0));

        ResizableIcon replyIcon = NeonCortex.colorizeIcon(
                ic_reply_black_24px.factory(), iconColor, 0.8f);
        replyIcon.setDimension(new Dimension(14, 14));
        JButton reply = new JButton("Reply", replyIcon);

        ResizableIcon forwardIcon = NeonCortex.colorizeIcon(
                ic_forward_black_24px.factory(), iconColor, 0.8f);
        forwardIcon.setDimension(new Dimension(14, 14));
        JButton forward = new JButton("Forward", forwardIcon);

        // Mark the button panel to be flat - effectively marking both action buttons as flat
        SubstanceCortex.ComponentOrParentScope.setFlatBackground(result, true);

        result.add(reply);
        result.add(forward);

        result.setBackground(backgroundColor);

        return result;
    }
}
