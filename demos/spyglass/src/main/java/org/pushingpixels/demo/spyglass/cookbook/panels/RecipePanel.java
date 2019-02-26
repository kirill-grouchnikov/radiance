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
package org.pushingpixels.demo.spyglass.cookbook.panels;

import com.jgoodies.forms.builder.FormBuilder;
import org.pushingpixels.demo.spyglass.cookbook.*;
import org.pushingpixels.demo.spyglass.cookbook.svg.*;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.neon.icon.*;
import org.pushingpixels.substance.api.SubstanceCortex;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class RecipePanel extends SingleContentPanel {
    public RecipePanel(int mainPanelTopOffset) {
        super(mainPanelTopOffset);

        // Configure the title pane content
        FormBuilder titlePaneBuilder = FormBuilder.create().
                columns("pref, 2dlu, pref, 2dlu, pref, 2dlu, pref, 8dlu, center:pref:grow, 8dlu, " +
                        "pref").
                rows("p").
                padding(new EmptyBorder(10, 16, 0, 16));

        titlePaneBuilder.add(getCommandButton(
                EchoResizableIcon.factory(ScaledResizableIcon.factory(
                        ic_bookmark_border_white_24px.factory(), 0.8f)),
                "Bookmark")).xy(1, 1);
        titlePaneBuilder.add(getCommandButton(
                EchoResizableIcon.factory(ScaledResizableIcon.factory(
                        ic_star_border_white_24px.factory(), 0.8f)),
                "Star")).xy(3, 1);
        titlePaneBuilder.add(getCommandButton(
                EchoResizableIcon.factory(ScaledResizableIcon.factory(
                        ic_view_stream_white_24px.factory(), 0.8f)),
                "Print")).xy(5, 1);
        titlePaneBuilder.add(getCommandButton(
                EchoResizableIcon.factory(ScaledResizableIcon.factory(
                        ic_send_white_24px.factory(), 0.8f)),
                "Send")).xy(7, 1);

        JLabel title = new JLabel("Cookbook");
        title.setFont(SubstanceCortex.GlobalScope.getFontPolicy().getFontSet()
                .getWindowTitleFont());

        titlePaneBuilder.add(title).xy(9, 1);

        titlePaneBuilder.add(getCommandButton(
                EchoResizableIcon.factory(ScaledResizableIcon.factory(
                        ic_help_outline_white_24px.factory(), 0.8f)),
                "Help")).xy(11, 1);

        this.titlePanel.setLayout(new BorderLayout());
        this.titlePanel.add(titlePaneBuilder.build(), BorderLayout.CENTER);
    }

    private AbstractCommandButton getCommandButton(ResizableIcon.Factory iconFactory,
            String tooltip) {
        return Command.builder()
                .setIconFactory(iconFactory)
                .setAction((CommandActionEvent e) -> System.out.println(tooltip + " activated"))
                .setActionRichTooltip(RichTooltip.builder()
                        .setTitle(tooltip)
                        .addDescriptionSection("Description for " + tooltip)
                        .build())
                .build()
                .project(CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.SMALL)
                        .build())
                .buildComponent();
    }
}
