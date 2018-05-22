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
package org.pushingpixels.demo.substance.flamingo.ribbon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import org.pushingpixels.demo.flamingo.ribbon.BasicCheckRibbon;
import org.pushingpixels.demo.substance.flamingo.svg.transcoded.Help_browser;
import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.flamingo.api.common.FlamingoCommand.FlamingoCommandBuilder;
import org.pushingpixels.flamingo.api.ribbon.JFlowRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.RibbonContextualTaskGroup;
import org.pushingpixels.flamingo.api.ribbon.RibbonTask;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;
import org.pushingpixels.substance.flamingo.SubstanceFlamingoPlugin;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

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

        JRibbonBand rowSpanBand = this.getRowSpanBand();
        JRibbonBand alignmentBand = this.getAlignmentBand();
        RibbonTask wrappedTask = new RibbonTask("Wrapped", rowSpanBand, alignmentBand);
        wrappedTask.setKeyTip("R");

        this.getRibbon().addTask(pageLayoutTask);
        this.getRibbon().addTask(writeTask);
        this.getRibbon().addTask(animationsTask);
        this.getRibbon().addTask(wrappedTask);

        this.getRibbon().addAnchoredCommand(new FlamingoCommandBuilder()
                .setIcon(Help_browser.of(16, 16))
                .setActionRichTooltip(new RichTooltip.RichTooltipBuilder()
                        .setTitle(resourceBundle.getString("Help.tooltip.title"))
                        .addDescriptionSection(
                                resourceBundle.getString("Help.tooltip.actionParagraph"))
                        .build())
                .setAction((ActionEvent e) -> JOptionPane.showMessageDialog(SmallCheckRibbon.this,
                        "Help button clicked"))
                .build());

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

        JPanel controlPanel = new JPanel();
        controlPanel.setBorder(new EmptyBorder(20, 0, 0, 5));
        FormLayout lm = new FormLayout("right:pref, 4dlu, fill:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm, controlPanel);

        this.configureControlPanel(builder);

        this.add(controlPanel, BorderLayout.EAST);
        this.add(new RulerPanel(), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceFlamingoPlugin());

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
