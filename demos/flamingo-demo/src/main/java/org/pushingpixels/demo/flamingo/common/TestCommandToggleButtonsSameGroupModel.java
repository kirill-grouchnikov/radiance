/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.demo.flamingo.common;

import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.*;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.CommandToggleGroupModel;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.MarinerSkin;

import javax.swing.*;
import java.awt.*;

public class TestCommandToggleButtonsSameGroupModel extends JFrame {
    private TestCommandToggleButtonsSameGroupModel() {
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        CommandToggleGroupModel justifyGroup = new CommandToggleGroupModel();

        FlamingoCommand justifyLeft = FlamingoCommand.builder()
                .setTitle("left").setIcon(new Format_justify_left())
                .setToggleSelected(true).inToggleGroup(justifyGroup).build();
        FlamingoCommand justifyCenter = FlamingoCommand.builder()
                .setTitle("center").setIcon(new Format_justify_center())
                .setToggle().inToggleGroup(justifyGroup).build();
        FlamingoCommand justifyRight = FlamingoCommand.builder()
                .setTitle("right").setIcon(new Format_justify_right())
                .setToggle().inToggleGroup(justifyGroup).build();
        FlamingoCommand justifyFill = FlamingoCommand.builder()
                .setTitle("fill").setIcon(new Format_justify_fill())
                .setToggle().inToggleGroup(justifyGroup).build();

        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(new JLabel(
                "<html>Selection state is <br>synced across the <br>strips below</html>"));
        this.add(getToggleStrip(
                FlamingoCommandDisplay.builder().setState(CommandButtonDisplayState.SMALL).build(),
                justifyLeft, justifyCenter, justifyRight, justifyFill));
        this.add(getToggleStrip(
                FlamingoCommandDisplay.builder().setState(CommandButtonDisplayState.MEDIUM).build(),
                justifyLeft, justifyCenter, justifyRight, justifyFill));
        this.add(getToggleStrip(
                FlamingoCommandDisplay.builder().setState(CommandButtonDisplayState.BIG).build(),
                justifyLeft, justifyCenter, justifyRight, justifyFill));


        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private JCommandButtonStrip getToggleStrip(FlamingoCommandDisplay display,
            FlamingoCommand... commands) {
        JCommandButtonStrip result = new JCommandButtonStrip();
        result.setDisplayState(display.getState());
        for (FlamingoCommand command : commands) {
            result.add(command.project(display).buildButton());
        }
        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new MarinerSkin());

            new TestCommandToggleButtonsSameGroupModel().setVisible(true);
        });
    }
}
