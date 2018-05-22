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
package org.pushingpixels.samples.substance.cookbook.panels;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.samples.substance.cookbook.EchoResizableIcon;
import org.pushingpixels.samples.substance.cookbook.ScaledResizableIcon;
import org.pushingpixels.samples.substance.cookbook.svg.ic_bookmark_border_white_24px;
import org.pushingpixels.samples.substance.cookbook.svg.ic_help_outline_white_24px;
import org.pushingpixels.samples.substance.cookbook.svg.ic_print_white_24px;
import org.pushingpixels.samples.substance.cookbook.svg.ic_send_white_24px;
import org.pushingpixels.samples.substance.cookbook.svg.ic_star_border_white_24px;
import org.pushingpixels.substance.api.SubstanceCortex;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

public class RecipePanel extends SingleContentPanel {
    public RecipePanel(int mainPanelTopOffset) {
        super(mainPanelTopOffset);

        // Configure the title pane content
        DefaultFormBuilder titlePaneBuilder = new DefaultFormBuilder(new FormLayout(
                "pref, 2dlu, pref, 2dlu, pref, 2dlu, pref, 8dlu, center:pref:grow, 8dlu, pref", ""))
                        .border(new EmptyBorder(10, 16, 0, 16));

        titlePaneBuilder.append(getCommandButton(
                new EchoResizableIcon(
                        new ScaledResizableIcon(ic_bookmark_border_white_24px.of(20, 20), 0.8f)),
                "Bookmark"));
        titlePaneBuilder.append(getCommandButton(
                new EchoResizableIcon(
                        new ScaledResizableIcon(ic_star_border_white_24px.of(20, 20), 0.8f)),
                "Star"));
        titlePaneBuilder
                .append(getCommandButton(
                        new EchoResizableIcon(
                                new ScaledResizableIcon(ic_print_white_24px.of(20, 20), 0.8f)),
                        "Print"));
        titlePaneBuilder.append(getCommandButton(
                new EchoResizableIcon(new ScaledResizableIcon(ic_send_white_24px.of(20, 20), 0.8f)),
                "Send"));

        JLabel title = new JLabel("Cookbook");
        title.setFont(SubstanceCortex.GlobalScope.getFontPolicy().getFontSet("Substance", null)
                .getWindowTitleFont());

        titlePaneBuilder.append(title);

        titlePaneBuilder.append(getCommandButton(
                new EchoResizableIcon(
                        new ScaledResizableIcon(ic_help_outline_white_24px.of(20, 20), 0.8f)),
                "Help"));

        this.titlePanel.setLayout(new BorderLayout());
        this.titlePanel.add(titlePaneBuilder.getPanel(), BorderLayout.CENTER);
    }

    private JCommandButton getCommandButton(ResizableIcon icon, String tooltip) {
        JCommandButton result = new JCommandButton(icon);
        result.setFlat(true);
        result.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
        result.setDisplayState(CommandButtonDisplayState.SMALL);
        result.setActionRichTooltip(new RichTooltip.RichTooltipBuilder().setTitle(tooltip)
                .addDescriptionSection("Description for " + tooltip).build());
        return result;
    }
}
