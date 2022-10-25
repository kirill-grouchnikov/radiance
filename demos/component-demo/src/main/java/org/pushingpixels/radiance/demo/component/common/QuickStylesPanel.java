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
package org.pushingpixels.radiance.demo.component.common;

import org.pushingpixels.radiance.component.api.common.model.panel.PanelLayoutSpec;
import org.pushingpixels.radiance.component.api.common.model.panel.PanelRowFillSpec;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Font_x_generic;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.icon.DecoratedRadianceIcon;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandGroup;
import org.pushingpixels.radiance.component.api.common.model.CommandPanelContentModel;
import org.pushingpixels.radiance.component.api.common.model.CommandPanelPresentationModel;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;

import java.awt.*;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class QuickStylesPanel {
    public static CommandPanelContentModel getQuickStylesContentModel(
            ResourceBundle resourceBundle, Locale locale) {
        List<CommandGroup> commandGroups = new ArrayList<>();

        MessageFormat mf = new MessageFormat(resourceBundle.getString("PanelStyles.text"));
        mf.setLocale(locale);

        for (int groupIndex = 0; groupIndex < 4; groupIndex++) {
            String commandGroupName = mf.format(new Object[] { groupIndex });
            List<Command> commands = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                final String deco = groupIndex + "/" + i;
                RadianceIcon.Factory iconFactory = DecoratedRadianceIcon.factory(
                        Font_x_generic.factory(),
                        (Component c, Graphics g, int x, int y,
                                int width, int height) -> {
                            Graphics2D g2d = (Graphics2D) g.create();
                            g2d.setColor(Color.black);
                            if (c.getComponentOrientation().isLeftToRight()) {
                                g2d.drawString(deco, x + 2, y + height - 2);
                            } else {
                                g2d.drawString(deco,
                                        x + width - g2d.getFontMetrics().stringWidth(deco) - 2,
                                        y + height - 2);
                            }
                            g2d.dispose();
                        });
                Command command = Command.builder()
                        .setIconFactory(iconFactory)
                        .setToggle()
                        .setAction(commandActionEvent -> System.out.println("Invoked action on " + deco))
                        .build();
                commands.add(command);
            }

            commandGroups.add(new CommandGroup(commandGroupName, commands));
        }

        CommandPanelContentModel commandPanelContentModel =
                new CommandPanelContentModel(commandGroups);
        commandPanelContentModel.setSingleSelectionMode(true);

        return commandPanelContentModel;
    }

    public static void updatePanelContentModel(CommandPanelContentModel model,
            ResourceBundle resourceBundle, Locale locale) {
        MessageFormat mf = new MessageFormat(resourceBundle.getString("PanelStyles.text"));
        mf.setLocale(locale);

        List<CommandGroup> commandGroups = model.getCommandGroups();
        for (int groupIndex = 0; groupIndex < commandGroups.size(); groupIndex++) {
            CommandGroup commandGroup = commandGroups.get(groupIndex);
            String commandGroupName = mf.format(new Object[] { groupIndex });
            commandGroup.setTitle(commandGroupName);
        }
    }

    public static CommandPanelPresentationModel getQuickStylesPresentationModel() {
        return CommandPanelPresentationModel.builder()
                .setLayoutSpec(new PanelLayoutSpec.RowFill(new PanelRowFillSpec.Adaptive(64)))
                .setToShowGroupLabels(false)
                .setCommandPresentationState(CommandButtonPresentationState.FIT_TO_ICON)
                .setCommandIconDimension(48)
                .build();
    }
}