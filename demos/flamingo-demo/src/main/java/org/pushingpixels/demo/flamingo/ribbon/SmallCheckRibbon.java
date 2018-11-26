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
package org.pushingpixels.demo.flamingo.ribbon;

import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Help_browser;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.CommandActionEvent;
import org.pushingpixels.flamingo.api.ribbon.*;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SmallCheckRibbon extends BasicCheckRibbon {
    public SmallCheckRibbon() {
        super();
        this.setTitle("Ribbon longer title to check contextual tabs");
    }

    @Override
    public void configureRibbon() {
        JRibbonBand clipboardBand = this.getClipboardBand();
        JRibbonBand quickStylesBand = this.getQuickStylesBand();
        JFlowRibbonBand fontBand = this.getFontBand();
        JRibbonBand findBand = this.getFindBand();
        RibbonTask pageLayoutTask = new RibbonTask("Page Layout", clipboardBand, quickStylesBand,
                fontBand, findBand);
        pageLayoutTask.setKeyTip("P");

        JRibbonBand themeBand = this.getActionBand();
        JRibbonBand preferencesBand = this.getPreferencesBand();
        JRibbonBand arrangeBand = this.getApplicationsBand();
        JRibbonBand paragraphBand = this.getParagraphBand();
        JRibbonBand showHideBand = this.getShowHideBand();
        RibbonTask writeTask = new RibbonTask("Write", themeBand, preferencesBand, arrangeBand,
                paragraphBand, showHideBand);
        writeTask.setKeyTip("W");

        JRibbonBand previewBand = this.getPreviewBand();
        JRibbonBand animationBand = this.getAnimationBand();
        JRibbonBand transitionBand = this.getTransitionBand();
        JRibbonBand transitionNextBand = this.getTransitionNextBand();
        RibbonTask animationsTask = new RibbonTask("Animations", previewBand, animationBand,
                transitionBand, transitionNextBand);
        animationsTask.setKeyTip("A");

        JRibbonBand alignmentBand = this.getAlignmentBand();
        RibbonTask wrappedTask = new RibbonTask("Wrapped", alignmentBand);
        wrappedTask.setKeyTip("R");

        this.getRibbon().addTask(pageLayoutTask);
        this.getRibbon().addTask(writeTask);
        this.getRibbon().addTask(animationsTask);
        this.getRibbon().addTask(wrappedTask);

        this.getRibbon().addAnchoredCommand(FlamingoCommand.builder()
                .setIcon(Help_browser.of(16, 16))
                .setActionRichTooltip(RichTooltip.builder()
                        .setTitle(resourceBundle.getString("Help.tooltip.title"))
                        .addDescriptionSection(
                                resourceBundle.getString("Help.tooltip.actionParagraph"))
                        .build())
                .setAction((CommandActionEvent e) -> JOptionPane.showMessageDialog(
                        SmallCheckRibbon.this, "Help button clicked"))
                .build().project());

        group1 = new RibbonContextualTaskGroup("Group 1", Color.red,
                getContextualRibbonTask("Group 1-1", "XA"),
                getContextualRibbonTask("Group 1-2", "XB"));
        group2 = new RibbonContextualTaskGroup("Group 2", Color.green,
                getContextualRibbonTask("Group 2-1", "YA"));
        this.getRibbon().addContextualTaskGroup(group1);
        this.getRibbon().addContextualTaskGroup(group2);

        configureTaskBar();

        // application menu
        configureApplicationMenu();

        this.add(getControlPanel(), BorderLayout.EAST);
        this.add(new RulerPanel(), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);

        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new OfficeBlue2007Skin());

            SmallCheckRibbon c = new SmallCheckRibbon();
            c.configureRibbon();
            Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment()
                    .getMaximumWindowBounds();
            c.setPreferredSize(new Dimension(r.width, r.height / 2));
            c.setMinimumSize(new Dimension(100, r.height / 3));
            c.pack();
            c.setLocation(r.x, r.y);
            c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            c.setVisible(true);
        });
    }
}
