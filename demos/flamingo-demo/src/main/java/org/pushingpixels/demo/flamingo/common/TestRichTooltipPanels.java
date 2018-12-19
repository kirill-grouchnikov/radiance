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
import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.flamingo.internal.ui.common.JRichTooltipPanel;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;

public class TestRichTooltipPanels extends JFrame {
    private TestRichTooltipPanels() {
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        JRichTooltipPanel panel = new JRichTooltipPanel(RichTooltip.builder()
                .setTitle(
                        "Main title that can go over multiple lines of text even exceeding the " +
                                "bigger")
                .addDescriptionSection(
                        "Simple description that can go over multiple lines of text even " +
                                "exceeding the bigger")
                .addDescriptionSection(
                        "Second paragraph that can be multiline as well to test this feature")
                .setMainIconFactory(Address_book_new.factory())
                .setFooterIconFactory(Help_browser.factory())
                .addFooterSection(
                        "Multiline footer description to provide a little bit more information on" +
                                " this subject")
                .build());
        this.add(panel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());

            new TestRichTooltipPanels().setVisible(true);
        });
    }
}
