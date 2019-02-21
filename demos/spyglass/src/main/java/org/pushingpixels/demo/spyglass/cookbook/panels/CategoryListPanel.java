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
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.model.CommandMenuContentModel;
import org.pushingpixels.flamingo.api.common.projection.CommandStripProjection;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CategoryListPanel extends SingleContentPanel {
    public CategoryListPanel(int mainPanelTopOffset) {
        super(mainPanelTopOffset);

        FormBuilder footerPaneBuilder = FormBuilder.create().
                columns("pref").
                rows("p").
                padding(new EmptyBorder(6, 0, 4, 0));

        JComponent controlButtons = new CommandStripProjection(
                new CommandGroup(
                        Command.builder()
                                .setIconFactory(EchoResizableIcon.factory(ScaledResizableIcon
                                        .factory(ic_add_white_24px.factory(), 0.75f)))
                                .build(),
                        Command.builder()
                                .setIconFactory(EchoResizableIcon.factory(ScaledResizableIcon
                                        .factory(ic_remove_white_24px.factory(), 0.75f)))
                                .build(),
                        Command.builder()
                                .setIconFactory(EchoResizableIcon.factory(ScaledResizableIcon
                                        .factory(ic_settings_white_24px.factory(), 0.75f)))
                                .setSecondaryContentModel(new CommandMenuContentModel(
                                        new CommandGroup(Command.builder()
                                                .setText("menu item")
                                                .build())))
                                .build()),
                CommandStripPresentationModel.withDefaults())
                .buildComponent();

        footerPaneBuilder.add(controlButtons).xy(1, 1);

        this.getFooterContentPanel().add(footerPaneBuilder.build());
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(150, 200);
    }
}
