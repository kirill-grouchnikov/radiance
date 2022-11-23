/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.themingapps.chat;

import com.jgoodies.forms.builder.FormBuilder;
import org.pushingpixels.radiance.demo.theming.main.check.svg.help_black_24dp;
import org.pushingpixels.radiance.demo.themingapps.chat.svg.chat_black_24dp;
import org.pushingpixels.radiance.demo.themingapps.chat.svg.person_black_24dp;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.FocusKind;
import org.pushingpixels.radiance.theming.api.skin.ModerateSkin;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ChatFrame extends JFrame {
    public ChatFrame() {
        this.getContentPane().setLayout(new BorderLayout());
        RadianceThemingCortex.WindowScope.extendContentIntoTitlePane(this,
                RadianceThemingSlices.HorizontalGravity.LEADING,
                RadianceThemingSlices.VerticalGravity.CENTERED);
        RadianceThemingCortex.WindowScope.setPreferredTitlePaneHeight(this, 40);

        FormBuilder builder = FormBuilder.create().
                columns("pref, 8dlu, center:0dlu:grow, 8dlu, pref, 8dlu, pref, 8dlu, pref").
                rows("p").
                padding(new EmptyBorder(8,
                        12 + RadianceThemingCortex.WindowScope.getTitlePaneControlInsets(this).left,
                        0, 12));

        builder.add(new JButton("New chat")).xy(1, 1);

        JLabel titleLabel = new JLabel("Chat", chat_black_24dp.of(16, 16), JLabel.CENTER);
        titleLabel.setIconTextGap(6);
        RadianceThemingCortex.WindowScope.markLabelAsTitlePaneText(this, titleLabel);
        builder.add(titleLabel).xy(3, 1);

        builder.add(new JTextField(12)).xy(5, 1);
        builder.add(new JLabel(help_black_24dp.of(14, 14))).xy(7, 1);
        builder.add(new JLabel(person_black_24dp.of(12, 12))).xy(9, 1);

        JPanel titlePane = builder.build();
        titlePane.setPreferredSize(new Dimension(100, 40));
        titlePane.setOpaque(true);
        ComponentOrParentChainScope.setDecorationType(titlePane, DecorationAreaType.PRIMARY_TITLE_PANE);

        this.getContentPane().add(titlePane, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Configure the main skin
            RadianceThemingCortex.GlobalScope.setSkin(new ModerateSkin());
            RadianceThemingCortex.GlobalScope.setFocusKind(FocusKind.NONE);
            JFrame.setDefaultLookAndFeelDecorated(true);

            // Create the main frame
            ChatFrame chatFrame = new ChatFrame();

            // Set initial size, center in screen, configure to exit the app on clicking the
            // close button
            chatFrame.setSize(900, 600);
            chatFrame.setLocationRelativeTo(null);
            chatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // And finally make the main frame visible
            chatFrame.setVisible(true);
        });
    }

}
