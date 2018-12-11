/*
 * Copyright (c) 2005-2018 Spyglass Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.projection.CommandStripProjection;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class RecipeListPanel extends SingleContentPanel {
    public RecipeListPanel(int mainPanelTopOffset) {
        super(mainPanelTopOffset);

        // Configure the title pane content
        FormBuilder titlePaneBuilder = FormBuilder.create().
                columns("pref, 0dlu, 0dlu:grow, 0dlu, pref, 6dlu, pref").
                rows("p").
                padding(new EmptyBorder(8, 4, 0, 4));

        JLabel smaller = new JLabel(new EchoResizableIcon(
                new ScaledResizableIcon(ic_format_size_white_24px.of(16, 16), 0.6f)));
        titlePaneBuilder.add(smaller).xy(1, 1);

        JSlider slider = new JSlider(0, 100, 80);
        titlePaneBuilder.add(slider).xy(3, 1);

        JLabel bigger = new JLabel(new EchoResizableIcon(
                new ScaledResizableIcon(ic_format_size_white_24px.of(16, 16), 0.8f)));
        titlePaneBuilder.add(bigger).xy(5, 1);

        CommandToggleGroupModel viewGroup = new CommandToggleGroupModel();
        JComponent titlePaneControlButtons = new CommandStripProjection(
                new CommandGroupModel(
                        Command.builder()
                                .setIcon(new EchoResizableIcon(new ScaledResizableIcon(
                                        ic_view_headline_white_24px.of(16, 16), 0.75f)))
                                .inToggleGroupAsSelected(viewGroup)
                                .build(),
                        Command.builder()
                                .setIcon(new EchoResizableIcon(new ScaledResizableIcon(
                                        ic_view_list_white_24px.of(16, 16), 0.75f)))
                                .inToggleGroup(viewGroup)
                                .build(),
                        Command.builder()
                                .setIcon(new EchoResizableIcon(new ScaledResizableIcon(
                                        ic_view_stream_white_24px.of(16, 16), 0.75f)))
                                .inToggleGroup(viewGroup)
                                .build()),
                CommandStripPresentationModel.builder().build())
                .buildComponent();

        titlePaneBuilder.add(titlePaneControlButtons).xy(7, 1);

        this.titlePanel.setLayout(new BorderLayout());
        this.titlePanel.add(titlePaneBuilder.build(), BorderLayout.CENTER);

        JPanel mainPanel = this.getMainPanel();
        JPanel recipePanel = new JPanel();
        JScrollPane scroll = new JScrollPane(recipePanel);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // remove the scroll pane border
        scroll.setBorder(new EmptyBorder(0, 0, 0, 0));
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(scroll, BorderLayout.CENTER);

        // set scroll mode to simple so that the light bar
        // does not have visual artifacts during scrolling
        // the contents
        scroll.getViewport().setScrollMode(JViewport.SIMPLE_SCROLL_MODE);

        // Footer content
        FormBuilder footerPaneBuilder = FormBuilder.create().
                columns("pref, 12dlu, 0dlu:grow").
                rows("p").
                padding(new EmptyBorder(6, 0, 4, 0));

        final JComponent controlButtons = new CommandStripProjection(
                new CommandGroupModel(
                        Command.builder()
                                .setIcon(new EchoResizableIcon(new ScaledResizableIcon(
                                        ic_add_white_24px.of(16, 16), 0.75f)))
                                .build(),
                        Command.builder()
                                .setIcon(new EchoResizableIcon(new ScaledResizableIcon(
                                        ic_remove_white_24px.of(12, 12), 0.75f)))
                                .build()),
                CommandStripPresentationModel.builder().build())
                .buildComponent();

        final JTextField searchTextField = new JTextField(15);
        // mark the search text field with NONE decoration so that it
        // has white background
        ComponentOrParentChainScope.setDecorationType(searchTextField, DecorationAreaType.NONE);

        footerPaneBuilder.add(controlButtons).xy(1, 1);
        footerPaneBuilder.add(searchTextField).xy(3, 1);

        this.getFooterContentPanel().add(footerPaneBuilder.build());

        // Scroll down. The preferred sizes are here to
        // make the scroll thumb appear
        recipePanel.setPreferredSize(new Dimension(280, 1800));
        scroll.setPreferredSize(new Dimension(280, 300));
        final BoundedRangeModel verticalScrollModel = scroll.getVerticalScrollBar().getModel();
        SwingUtilities.invokeLater(() -> verticalScrollModel.setValue(800));
    }
}
