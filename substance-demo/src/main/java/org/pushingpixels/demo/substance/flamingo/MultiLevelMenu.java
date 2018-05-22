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

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.demo.substance.flamingo.svg.transcoded.Edit_copy;
import org.pushingpixels.demo.substance.flamingo.svg.transcoded.Edit_cut;
import org.pushingpixels.demo.substance.flamingo.svg.transcoded.Edit_find;
import org.pushingpixels.demo.substance.flamingo.svg.transcoded.Edit_find_replace;
import org.pushingpixels.demo.substance.flamingo.svg.transcoded.Edit_paste;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonPopupOrientationKind;
import org.pushingpixels.flamingo.api.common.JCommandMenuButton;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.GeminiSkin;
import org.pushingpixels.substance.flamingo.SubstanceFlamingoPlugin;

public class MultiLevelMenu extends JFrame {

    public MultiLevelMenu() {
        super("Multi level menu");

        JCommandButton main = new JCommandButton("click me");
        main.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
        main.setDisplayState(CommandButtonDisplayState.MEDIUM);
        main.setFlat(false);

        // first level menu
        main.setPopupCallback((JCommandButton commandButton) -> {
            JCommandPopupMenu result = new JCommandPopupMenu();

            result.addMenuButton(new JCommandMenuButton("Copy", new Edit_copy()));
            result.addMenuButton(new JCommandMenuButton("Cut", new Edit_cut()));
            result.addMenuButton(new JCommandMenuButton("Paste", new Edit_paste()));

            result.addMenuSeparator();

            JCommandMenuButton second = new JCommandMenuButton("Find", null);
            second.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
            // second level
            second.setPopupCallback((JCommandButton commandButton2) -> {
                JCommandPopupMenu result2 = new JCommandPopupMenu();

                result2.addMenuButton(new JCommandMenuButton("Find", new Edit_find()));
                result2.addMenuButton(
                        new JCommandMenuButton("Find replace", new Edit_find_replace()));

                return result2;
            });
            second.setPopupOrientationKind(CommandButtonPopupOrientationKind.SIDEWARD);
            result.addMenuButton(second);

            return result;
        });

        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.add(main);

        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceFlamingoPlugin());

        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new GeminiSkin());

            new MultiLevelMenu().setVisible(true);
        });
    }

}
