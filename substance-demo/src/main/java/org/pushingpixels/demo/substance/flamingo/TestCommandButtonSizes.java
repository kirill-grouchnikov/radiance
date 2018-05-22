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
package org.pushingpixels.demo.substance.flamingo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import org.pushingpixels.demo.substance.flamingo.svg.transcoded.Font_x_generic;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.OfficeSilver2007Skin;
import org.pushingpixels.substance.flamingo.SubstanceFlamingoPlugin;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;

public class TestCommandButtonSizes extends JFrame {
    public TestCommandButtonSizes() {
        super("Command button sizes");
        FormLayout fl = new FormLayout(
                "right:pref, 2dlu, center:pref, 2dlu, left:pref, 4dlu, right:pref, 2dlu, center:pref, 2dlu, left:pref");
        DefaultFormBuilder builder = new DefaultFormBuilder(fl).border(Borders.DIALOG);

        ResizableIcon svgIcon = new Font_x_generic();
        svgIcon.setDimension(new Dimension(16, 16));

        // Core Swing button with an icon and text
        builder.append("core");
        JButton buttonCore1 = new JButton("s", svgIcon);
        JLabel sizeCore1 = new JLabel();
        wireLabelToComponent(buttonCore1, sizeCore1);
        builder.append(buttonCore1, sizeCore1);

        // Flamingo MEDIUM action command button with an icon and text
        builder.append("command medium action");
        JCommandButton commandButton1 = new JCommandButton("c", svgIcon);
        commandButton1.setDisplayState(CommandButtonDisplayState.MEDIUM);
        commandButton1.setFlat(false);
        JLabel sizeCommand1 = new JLabel();
        wireLabelToComponent(commandButton1, sizeCommand1);
        builder.append(commandButton1, sizeCommand1);

        // Flamingo MEDIUM split command button with an icon and text
        builder.append("command medium split");
        JCommandButton commandButton2 = new JCommandButton("c", svgIcon);
        commandButton2.setDisplayState(CommandButtonDisplayState.MEDIUM);
        commandButton2.setFlat(false);
        commandButton2.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
        JLabel sizeCommand2 = new JLabel();
        wireLabelToComponent(commandButton2, sizeCommand2);
        builder.append(commandButton2, sizeCommand2);

        // Flamingo MEDIUM command toggle button with an icon and text
        builder.append("command toggle medium");
        JCommandToggleButton commandToggleButton1 = new JCommandToggleButton("ct", svgIcon);
        commandToggleButton1.setDisplayState(CommandButtonDisplayState.MEDIUM);
        commandToggleButton1.setFlat(false);
        JLabel sizeCommandToggle1 = new JLabel();
        wireLabelToComponent(commandToggleButton1, sizeCommandToggle1);
        builder.append(commandToggleButton1, sizeCommandToggle1);

        // Core Swing button with an icon
        builder.append("core");
        JButton buttonCore2 = new JButton(svgIcon);
        JLabel sizeCore2 = new JLabel();
        wireLabelToComponent(buttonCore2, sizeCore2);
        builder.append(buttonCore2, sizeCore2);

        // Flamingo MEDIUM command toggle button with an icon
        builder.append("command toggle medium");
        JCommandToggleButton commandToggleButton2 = new JCommandToggleButton(svgIcon);
        commandToggleButton2.setDisplayState(CommandButtonDisplayState.MEDIUM);
        commandToggleButton2.setFlat(false);
        JLabel sizeCommandToggle2 = new JLabel();
        wireLabelToComponent(commandToggleButton2, sizeCommandToggle2);
        builder.append(commandToggleButton2, sizeCommandToggle2);

        // Flamingo MEDIUM action command button with an icon
        builder.append("command medium action");
        JCommandButton commandButton3 = new JCommandButton(svgIcon);
        commandButton3.setDisplayState(CommandButtonDisplayState.MEDIUM);
        commandButton3.setFlat(false);
        JLabel sizeCommand3 = new JLabel();
        wireLabelToComponent(commandButton3, sizeCommand3);
        builder.append(commandButton3, sizeCommand3);

        // Flamingo SMALL action command button with an icon and text
        builder.append("command small action");
        JCommandButton commandButton4 = new JCommandButton("c", svgIcon);
        commandButton4.setDisplayState(CommandButtonDisplayState.SMALL);
        commandButton4.setFlat(false);
        JLabel sizeCommand4 = new JLabel();
        wireLabelToComponent(commandButton4, sizeCommand4);
        builder.append(commandButton4, sizeCommand4);

        // Flamingo SMALL action command button with an icon and text
        builder.append("command small action, gap scale 0.5");
        JCommandButton commandButton5 = new JCommandButton("c", svgIcon);
        commandButton5.setDisplayState(CommandButtonDisplayState.SMALL);
        commandButton5.setGapScaleFactor(0.5);
        commandButton5.setFlat(false);
        JLabel sizeCommand5 = new JLabel();
        wireLabelToComponent(commandButton5, sizeCommand5);
        builder.append(commandButton5, sizeCommand5);

        this.add(builder.getPanel(), BorderLayout.CENTER);

        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void wireLabelToComponent(final Component comp, final JLabel label) {
        comp.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                label.setText(comp.getWidth() + ":" + comp.getHeight());
            }
        });
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceFlamingoPlugin());

        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new OfficeSilver2007Skin());
            new TestCommandButtonSizes().setVisible(true);
        });
    }

}
