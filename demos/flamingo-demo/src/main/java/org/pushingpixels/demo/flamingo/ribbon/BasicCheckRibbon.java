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
package org.pushingpixels.demo.flamingo.ribbon;

import com.jgoodies.forms.builder.FormBuilder;
import org.pushingpixels.demo.flamingo.*;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.*;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.FlamingoCommand.*;
import org.pushingpixels.flamingo.api.common.icon.*;
import org.pushingpixels.flamingo.api.common.popup.*;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager.*;
import org.pushingpixels.flamingo.api.ribbon.*;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuPrimaryCommand.*;
import org.pushingpixels.flamingo.api.ribbon.resize.*;
import org.pushingpixels.neon.NeonCortex;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.*;
import java.util.List;

public class BasicCheckRibbon extends JRibbonFrame {
    protected Locale currLocale;

    protected ResourceBundle resourceBundle;

    protected class QuickStylesPanel extends JCommandButtonPanel {
        public QuickStylesPanel() {
            super(32);

            MessageFormat mfGroupTitle = new MessageFormat(
                    resourceBundle.getString("PanelStyles.text"));
            mfGroupTitle.setLocale(currLocale);
            MessageFormat mfTooltipTitle = new MessageFormat(
                    resourceBundle.getString("PanelStyles.tooltip.textActionTitle"));
            mfTooltipTitle.setLocale(currLocale);
            MessageFormat mfTooltipParagraph = new MessageFormat(
                    resourceBundle.getString("PanelStyles.tooltip.textActionParagraph1"));
            mfTooltipParagraph.setLocale(currLocale);

            for (int groupIndex = 0; groupIndex < 4; groupIndex++) {
                String iconGroupName = mfGroupTitle.format(new Object[] { groupIndex });
                this.addButtonGroup(iconGroupName, groupIndex);
                for (int i = 0; i < 15; i++) {
                    final int index = i;
                    ResizableIcon fontIcon = new Font_x_generic();
                    ResizableIcon finalIcon = new DecoratedResizableIcon(fontIcon,
                            new DecoratedResizableIcon.IconDecorator() {
                                @Override
                                public void paintIconDecoration(Component c, Graphics g, int x,
                                        int y, int width, int height) {
                                    Graphics2D g2d = (Graphics2D) g.create();
                                    g2d.setColor(Color.black);
                                    g2d.setFont(UIManager.getFont("Label.font"));
                                    NeonCortex.installDesktopHints(g2d, c);
                                    g2d.drawString("" + index, x + 2, y + height - 2);
                                    g2d.dispose();
                                }
                            });
                    JCommandToggleButton jrb = new JCommandToggleButton(null, finalIcon);
                    jrb.setName("Group " + groupIndex + ", index " + i);
                    jrb.addActionListener(
                            (ActionEvent e) -> System.out.println("Invoked action on " + index));
                    String actionTooltipTitle = mfTooltipTitle.format(new Object[] { i });
                    String actionTooltipParagraph1 = mfTooltipParagraph.format(new Object[] { i });
                    jrb.setActionRichTooltip(
                            new RichTooltip.RichTooltipBuilder().setTitle(actionTooltipTitle)
                                    .addDescriptionSection(actionTooltipParagraph1).build());
                    this.addButtonToLastGroup(jrb);
                }
            }
            this.setSingleSelectionMode(true);
        }
    }

    private class ExpandActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(BasicCheckRibbon.this, "Expand button clicked");
        }
    }

    private class SamplePopupMenu extends JCommandPopupMenu {
        public SamplePopupMenu() {
            MessageFormat mf = new MessageFormat(resourceBundle.getString("TestMenuItem.text"));
            mf.setLocale(currLocale);

            JCommandMenuButton menuButton1 = new JCommandMenuButton(mf.format(new Object[] { "1" }),
                    new ColorResizableIcon(16, new Color(0xFF80DEEA)));
            menuButton1.addActionListener(
                    (ActionEvent e) -> System.out.println("Test menu item 1 activated"));
            menuButton1.setActionKeyTip("1");
            this.addMenuButton(menuButton1);

            JCommandMenuButton menuButton2 = new JCommandMenuButton(mf.format(new Object[] { "2" }),
                    new ColorResizableIcon(16, new Color(0xFF80CBC4)));
            menuButton2.addActionListener(
                    (ActionEvent e) -> System.out.println("Test menu item 2 activated"));
            menuButton2.setActionKeyTip("2");
            this.addMenuButton(menuButton2);

            JCommandMenuButton menuButton3 = new JCommandMenuButton(mf.format(new Object[] { "3" }),
                    new ColorResizableIcon(16, new Color(0xFFA5D6A7)));
            menuButton3.addActionListener(
                    (ActionEvent e) -> System.out.println("Test menu item 3 activated"));
            menuButton3.setActionKeyTip("3");
            this.addMenuButton(menuButton3);

            this.addMenuSeparator();

            JCommandMenuButton menuButton4 = new JCommandMenuButton(mf.format(new Object[] { "4" }),
                    new ColorResizableIcon(16, new Color(0xFFC5E1A5)));
            menuButton4.addActionListener(
                    (ActionEvent e) -> System.out.println("Test menu item 4 activated"));
            menuButton4.setActionKeyTip("4");
            this.addMenuButton(menuButton4);

            JCommandMenuButton menuButton5 = new JCommandMenuButton(mf.format(new Object[] { "5" }),
                    new ColorResizableIcon(16, new Color(0xFFE6EE9C)));
            menuButton5.addActionListener(
                    (ActionEvent e) -> System.out.println("Test menu item 5 activated"));
            menuButton5.setActionKeyTip("5");
            this.addMenuButton(menuButton5);
        }
    }

    protected JRibbonBand getActionBand() {
        JRibbonBand actionBand = new JRibbonBand(resourceBundle.getString("Action.textBandTitle"),
                new Document_new(), new ExpandActionListener());

        actionBand.startGroup();
        actionBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("AddressBook.text"))
                        .setIcon(Address_book_new.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Address Book activated"))
                        .setActionKeyTip("NA").build(),
                RibbonElementPriority.TOP);

        actionBand.startGroup();
        actionBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Document.text"))
                        .setIcon(Document_new.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Document activated"))
                        .setActionKeyTip("ND").build(),
                RibbonElementPriority.TOP);

        actionBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Appointment.text"))
                        .setIcon(Appointment_new.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Appointment activated"))
                        .setActionKeyTip("NP").build(),
                RibbonElementPriority.MEDIUM);

        actionBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Bookmark.text"))
                        .setIcon(Bookmark_new.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Bookmark activated"))
                        .setActionKeyTip("NB").build(),
                RibbonElementPriority.MEDIUM);

        actionBand.addRibbonCommand(new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("Contact.text")).setIcon(Contact_new.of(16, 16))
                .setAction((ActionEvent e) -> System.out.println("Contact activated"))
                .setActionKeyTip("NC").build(), RibbonElementPriority.MEDIUM);

        List<RibbonBandResizePolicy> resizePolicies = new ArrayList<RibbonBandResizePolicy>();
        resizePolicies.add(new CoreRibbonResizePolicies.Mirror(actionBand));
        resizePolicies.add(new CoreRibbonResizePolicies.Mid2Low(actionBand));
        resizePolicies.add(new CoreRibbonResizePolicies.IconRibbonBandResizePolicy(actionBand));
        actionBand.setResizePolicies(resizePolicies);

        return actionBand;
    }

    protected JRibbonBand getPreferencesBand() {
        JRibbonBand preferencesBand = new JRibbonBand(
                resourceBundle.getString("Preferences.textBandTitle"),
                new Preferences_desktop_font(), new ExpandActionListener());
        preferencesBand.setResizePolicies(
                CoreRibbonResizePolicies.getCorePoliciesRestrictive(preferencesBand));

        preferencesBand.startGroup();

        preferencesBand.addRibbonCommand(new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("Accessibility.text"))
                .setIcon(Preferences_desktop_accessibility.of(16, 16))
                .setAction((ActionEvent e) -> System.out.println("Accessibility activated"))
                .setActionKeyTip("Y").build(), RibbonElementPriority.MEDIUM);

        preferencesBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Assistive.text"))
                        .setIcon(Preferences_desktop_assistive_technology.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Assistive activated"))
                        .setActionKeyTip("E").build(),
                RibbonElementPriority.MEDIUM);

        preferencesBand.addRibbonCommand(new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("KeyboardShortcuts.text"))
                .setIcon(Preferences_desktop_keyboard_shortcuts.of(16, 16))
                .setPopupCallback((JCommandButton commandButton) -> new SamplePopupMenu())
                .setPopupKeyTip("H").build(), RibbonElementPriority.MEDIUM);

        preferencesBand.startGroup();

        preferencesBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Font.text"))
                        .setIcon(Preferences_desktop_font.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Font activated"))
                        .setActionKeyTip("Z").build(),
                RibbonElementPriority.TOP);

        preferencesBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Locale.text"))
                        .setIcon(Preferences_desktop_locale.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Locale activated"))
                        .setActionKeyTip("L").build(),
                RibbonElementPriority.TOP);

        preferencesBand.startGroup();

        preferencesBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Screensaver.text"))
                        .setIcon(Preferences_desktop_screensaver.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Screensaver activated"))
                        .setActionKeyTip("V").build(),
                RibbonElementPriority.MEDIUM);

        preferencesBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Themes.text"))
                        .setIcon(Preferences_desktop_theme.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Themes activated"))
                        .setActionKeyTip("T").build(),
                RibbonElementPriority.MEDIUM);

        return preferencesBand;
    }

    protected JRibbonBand getParagraphBand() {
        JRibbonBand paragraphBand = new JRibbonBand(
                resourceBundle.getString("Paragraph.textBandTitle"), new Format_justify_left(),
                null);

        paragraphBand.startGroup(resourceBundle.getString("Indent.text"));
        JRibbonComponent justifyLeftWrapper = new JRibbonComponent(new Format_justify_left(),
                resourceBundle.getString("IndentLeft.text"),
                new JSpinner(new SpinnerNumberModel(0, 0, 100, 5)));
        justifyLeftWrapper.setKeyTip("PL");

        justifyLeftWrapper.setRichTooltip(new RichTooltip.RichTooltipBuilder()
                .setTitle(resourceBundle.getString("IndentLeft.tooltip.title"))
                .addDescriptionSection(
                        resourceBundle.getString("IndentLeft.tooltip.actionParagraph1"))
                .addDescriptionSection(
                        resourceBundle.getString("IndentLeft.tooltip.actionParagraph2"))
                .build());

        paragraphBand.addRibbonComponent(justifyLeftWrapper);

        JRibbonComponent justifyRightWrapper = new JRibbonComponent(new Format_justify_right(),
                resourceBundle.getString("IndentRight.text"),
                new JSpinner(new SpinnerNumberModel(0, 0, 100, 5)));
        justifyRightWrapper.setKeyTip("PR");

        justifyRightWrapper.setRichTooltip(new RichTooltip.RichTooltipBuilder()
                .setTitle(resourceBundle.getString("IndentRight.tooltip.title"))
                .addDescriptionSection(
                        resourceBundle.getString("IndentRight.tooltip.actionParagraph1"))
                .addDescriptionSection(
                        resourceBundle.getString("IndentRight.tooltip.actionParagraph2"))
                .build());

        paragraphBand.addRibbonComponent(justifyRightWrapper);

        paragraphBand.startGroup(resourceBundle.getString("Spacing.text"));
        JRibbonComponent beforeWrapper = new JRibbonComponent(
                new JSpinner(new SpinnerNumberModel(0, 0, 100, 5)));
        beforeWrapper.setKeyTip("PB");
        paragraphBand.addRibbonComponent(beforeWrapper);

        JRibbonComponent afterWrapper = new JRibbonComponent(
                new JSpinner(new SpinnerNumberModel(10, 0, 100, 5)));
        afterWrapper.setKeyTip("PA");
        paragraphBand.addRibbonComponent(afterWrapper);

        return paragraphBand;
    }

    protected JRibbonBand getShowHideBand() {
        JRibbonBand showHideBand = new JRibbonBand(
                resourceBundle.getString("ShowHide.textBandTitle"), new Format_justify_left(),
                null);

        JCheckBox ruler = new JCheckBox(resourceBundle.getString("Ruler.text"));
        ruler.setSelected(true);
        JRibbonComponent rulerWrapper = new JRibbonComponent(ruler);
        rulerWrapper.setKeyTip("SR");
        showHideBand.addRibbonComponent(rulerWrapper);

        JCheckBox gridlines = new JCheckBox(resourceBundle.getString("Gridlines.text"));
        JRibbonComponent gridlinesWrapper = new JRibbonComponent(gridlines);
        gridlinesWrapper.setKeyTip("SG");
        showHideBand.addRibbonComponent(gridlinesWrapper);

        JCheckBox messageBar = new JCheckBox(resourceBundle.getString("MessageBar.text"));
        messageBar.setEnabled(false);
        JRibbonComponent messageBarWrapper = new JRibbonComponent(messageBar);
        messageBarWrapper.setKeyTip("SM");
        showHideBand.addRibbonComponent(messageBarWrapper);

        JCheckBox documentMap = new JCheckBox(resourceBundle.getString("DocumentMap.text"));
        JRibbonComponent documentMapWrapper = new JRibbonComponent(documentMap);
        documentMapWrapper.setKeyTip("SD");
        showHideBand.addRibbonComponent(documentMapWrapper);

        JCheckBox thumbnails = new JCheckBox(resourceBundle.getString("Thumbnails.text"));
        JRibbonComponent thumbnailsWrapper = new JRibbonComponent(thumbnails);
        thumbnailsWrapper.setKeyTip("ST");
        showHideBand.addRibbonComponent(thumbnailsWrapper);

        return showHideBand;
    }

    protected JRibbonBand getApplicationsBand() {
        JRibbonBand applicationsBand = new JRibbonBand(
                resourceBundle.getString("Applications.textBandTitle"), new Applications_other(),
                new ExpandActionListener());

        JRibbonComponent games = new JRibbonComponent(new Applications_games(),
                resourceBundle.getString("Games.text"),
                new JComboBox(new Object[] { "Tetris", "Minesweeper", "Doom" }));
        games.setKeyTip("AG");
        games.setResizingAware(true);
        games.setHorizontalAlignment(HorizontalAlignment.FILL);
        applicationsBand.addRibbonComponent(games);

        JRibbonComponent internet = new JRibbonComponent(new Applications_internet(),
                resourceBundle.getString("Internet.text"),
                new JComboBox(new Object[] { "Firefox", "Opera", "Konqueror" }));
        internet.setKeyTip("AI");
        internet.setEnabled(false);
        internet.setResizingAware(true);
        internet.setHorizontalAlignment(HorizontalAlignment.FILL);
        applicationsBand.addRibbonComponent(internet);

        JRibbonComponent multimedia = new JRibbonComponent(null,
                resourceBundle.getString("Multimedia.text"),
                new JComboBox(new Object[] { resourceBundle.getString("Pictures.text"),
                        resourceBundle.getString("Video.text"),
                        resourceBundle.getString("Audio.text") }));
        multimedia.setKeyTip("AM");
        multimedia.setResizingAware(true);
        multimedia.setHorizontalAlignment(HorizontalAlignment.FILL);
        applicationsBand.addRibbonComponent(multimedia);

        return applicationsBand;
    }

    protected JRibbonBand getDocumentBand() {
        JRibbonBand result = new JRibbonBand(resourceBundle.getString("Document.textBandTitle"),
                new Applications_office(), new ExpandActionListener());
        result.setExpandButtonKeyTip("FY");
        result.setCollapsedStateKeyTip("ZD");

        result.startGroup();

        FlamingoCommandToggleGroup locationGroup = new FlamingoCommandToggleGroup();
        result.addRibbonCommand(
                new FlamingoCommandBuilder()
                        .setTitle(resourceBundle.getString("DocumentLocal.text"))
                        .setIcon(Folder.of(16, 16))
                        .setAction(
                                (ActionEvent e) -> System.out.println("Document Local activated"))
                        .setToggle().inToggleGroup(locationGroup).build(),
                RibbonElementPriority.TOP);

        result.addRibbonCommand(
                new FlamingoCommandBuilder()
                        .setTitle(resourceBundle.getString("DocumentRemote.text"))
                        .setIcon(Folder_remote.of(16, 16))
                        .setAction(
                                (ActionEvent e) -> System.out.println("Document Remote activated"))
                        .setToggle().inToggleGroup(locationGroup).build(),
                RibbonElementPriority.TOP);

        result.addRibbonCommand(
                new FlamingoCommandBuilder()
                        .setTitle(resourceBundle.getString("DocumentSaved.text"))
                        .setIcon(Folder_saved_search.of(16, 16))
                        .setAction(
                                (ActionEvent e) -> System.out.println("Document Saved activated"))
                        .setToggle().inToggleGroup(locationGroup).build(),
                RibbonElementPriority.TOP);

        result.startGroup();

        result.addRibbonCommand(new FlamingoCommandBuilder()
                        .setTitle(resourceBundle.getString("DocumentNew.text"))
                        .setIcon(Document_new.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Document New " +
                                "activated")).build(),
                RibbonElementPriority.MEDIUM);

        result.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("DocumentOpen.text"))
                        .setIcon(Document_open.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Document Open activated"))
                        .build(),
                RibbonElementPriority.MEDIUM);

        result.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("DocumentSave.text"))
                        .setIcon(Document_save.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Document Save activated"))
                        .build(),
                RibbonElementPriority.MEDIUM);

        result.addRibbonCommand(new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("DocumentPrint.text"))
                .setIcon(Document_print.of(16, 16))
                .setAction((ActionEvent e) -> System.out.println("Document Print activated"))
                .build(), RibbonElementPriority.MEDIUM);

        result.addRibbonCommand(
                new FlamingoCommandBuilder()
                        .setTitle(resourceBundle.getString("DocumentPrintPreview.text"))
                        .setIcon(Document_print_preview.of(16, 16))
                        .setAction((ActionEvent e) -> System.out
                                .println("Document Print Preview activated"))
                        .build(),
                RibbonElementPriority.MEDIUM);

        result.addRibbonCommand(
                new FlamingoCommandBuilder()
                        .setTitle(resourceBundle.getString("DocumentProperties.text"))
                        .setIcon(Document_properties.of(16, 16))
                        .setAction((ActionEvent e) -> System.out
                                .println("Document Properties activated"))
                        .build(),
                RibbonElementPriority.MEDIUM);

        result.setResizePolicies(CoreRibbonResizePolicies.getCorePoliciesRestrictive(result));

        return result;
    }

    protected JRibbonBand getClipboardBand() {
        JRibbonBand clipboardBand = new JRibbonBand(
                resourceBundle.getString("Clipboard.textBandTitle"), new Edit_paste(),
                new ExpandActionListener());
        clipboardBand.setExpandButtonKeyTip("FO");
        clipboardBand
                .setExpandButtonRichTooltip(new RichTooltip.RichTooltipBuilder()
                        .setTitle(resourceBundle.getString("Clipboard.textBandTitle"))
                        .addDescriptionSection(
                                resourceBundle.getString("Clipboard.textBandTooltipParagraph1"))
                        .build());

        clipboardBand.setCollapsedStateKeyTip("ZC");

        clipboardBand
                .addRibbonCommand(
                        new FlamingoCommandBuilder()
                                .setTitle(resourceBundle.getString("Paste.text"))
                                .setIcon(Edit_paste.of(16, 16))
                                .setAction((ActionEvent e) -> System.out.println("Pasted!"))
                                .setActionRichTooltip(
                                        new RichTooltip.RichTooltipBuilder()
                                                .setTitle(resourceBundle.getString("Paste.text"))
                                                .addDescriptionSection(resourceBundle.getString(
                                                        "Paste.tooltip.actionParagraph1"))
                                                .build())
                                .setPopupCallback(
                                        (JCommandButton commandButton) -> new SamplePopupMenu())
                                .setPopupRichTooltip(new RichTooltip.RichTooltipBuilder()
                                        .setTitle(resourceBundle.getString("Paste.text"))
                                        .addDescriptionSection(resourceBundle
                                                .getString("Paste.tooltip.popupParagraph1"))
                                        .build())
                                .setPopupKeyTip("V").setTitleClickAction().build(),
                        RibbonElementPriority.TOP);

        clipboardBand
                .addRibbonCommand(
                        new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Cut.text"))
                                .setIcon(Edit_cut.of(16, 16))
                                .setAction((ActionEvent e) -> System.out.println("Cut!"))
                                .setActionRichTooltip(new RichTooltip.RichTooltipBuilder()
                                        .setTitle(resourceBundle.getString("Cut.text"))
                                        .addDescriptionSection(resourceBundle
                                                .getString("Cut.tooltip.actionParagraph1"))
                                        .build())
                                .setPopupCallback(
                                        (JCommandButton commandButton) -> new SamplePopupMenu())
                                .setPopupKeyTip("X").setTitleClickAction().build(),
                        RibbonElementPriority.MEDIUM);

        clipboardBand
                .addRibbonCommand(
                        new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Copy.text"))
                                .setIcon(Edit_copy.of(16, 16))
                                .setAction((ActionEvent e) -> System.out.println("Copy!"))
                                .setPopupCallback(
                                        (JCommandButton commandButton) -> new SamplePopupMenu())
                                .setPopupKeyTip("C").setTitleClickPopup().build(),
                        RibbonElementPriority.MEDIUM);

        PopupPanelCallback formatButtonPopupCallback = (JCommandButton commandButton) -> {
            JCommandPopupMenu popupMenu = new JCommandPopupMenu(new QuickStylesPanel(), 5, 3);
            JCommandMenuButton saveSelectionButton = new JCommandMenuButton(
                    resourceBundle.getString("Format.menuSaveSelection.text"),
                    new ColorResizableIcon(16, new Color(0xFFFBC02D)));
            saveSelectionButton.addActionListener(
                    (ActionEvent e) -> System.out.println("Save Selection activated"));
            saveSelectionButton.setActionKeyTip("SS");
            popupMenu.addMenuButton(saveSelectionButton);

            JCommandMenuButton clearSelectionButton = new JCommandMenuButton(
                    resourceBundle.getString("Format.menuClearSelection.text"),
                    new ColorResizableIcon(16, new Color(0xFFFFA000)));
            clearSelectionButton.addActionListener(
                    (ActionEvent e) -> System.out.println("Clear Selection activated"));
            clearSelectionButton.setActionKeyTip("SC");
            popupMenu.addMenuButton(clearSelectionButton);

            popupMenu.addMenuSeparator();
            JCommandMenuButton applyStylesButton = new JCommandMenuButton(
                    resourceBundle.getString("Format.applyStyles.text"),
                    new ColorResizableIcon(16, new Color(0xFFF57C00)));
            applyStylesButton.addActionListener(
                    (ActionEvent e) -> System.out.println("Apply Styles activated"));
            applyStylesButton.setActionKeyTip("SA");
            popupMenu.addMenuButton(applyStylesButton);
            return popupMenu;
        };

        clipboardBand.addRibbonCommand(new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("Format.text")).setIcon(Edit_paste.of(16, 16))
                .setPopupCallback(formatButtonPopupCallback)
                .setPopupRichTooltip(new RichTooltip.RichTooltipBuilder().setTitle(
                        "Main title that can go over multiple lines of text even exceeding the " +
                                "bigger")
                        .addDescriptionSection(
                                "Simple description that can go over multiple lines of text even " +
                                        "exceeding the bigger")
                        .addDescriptionSection(
                                "Second paragraph that can be multiline as well to test this " +
                                        "feature")
                        .setMainIcon(Address_book_new.of(32, 32))
                        .setFooterIcon(Help_browser.of(16, 16))
                        .addFooterSection(
                                "Multiline footer description to provide a little bit more " +
                                        "information on this subject")
                        .build())
                .setPopupKeyTip("FP").build(), RibbonElementPriority.MEDIUM);

        List<RibbonBandResizePolicy> resizePolicies = new ArrayList<>();
        resizePolicies.add(new CoreRibbonResizePolicies.Mirror(clipboardBand));
        resizePolicies.add(new CoreRibbonResizePolicies.Mid2Low(clipboardBand));
        clipboardBand.setResizePolicies(resizePolicies);

        return clipboardBand;
    }

    protected JRibbonBand getFindBand() {
        JRibbonBand findBand = new JRibbonBand(resourceBundle.getString("Find.textBandTitle"),
                new Edit_find());
        findBand.setCollapsedStateKeyTip("ZY");

        findBand.addRibbonCommand(new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("Search.text")).setIcon(System_search.of(16, 16))
                .setAction((ActionEvent e) -> System.out.println("Search activated"))
                .setActionKeyTip("FD").build(), RibbonElementPriority.TOP);

        findBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Find.text"))
                        .setIcon(Edit_find.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Find activated")).build(),
                RibbonElementPriority.MEDIUM);

        findBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("FindReplace.text"))
                        .setIcon(Edit_find_replace.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Find Replace activated"))
                        .setEnabled(false).build(),
                RibbonElementPriority.MEDIUM);

        findBand.addRibbonCommand(new FlamingoCommandBuilder()
                        .setTitle(resourceBundle.getString("SelectAll.text"))
                        .setIcon(Edit_select_all.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Select All activated"))
                        .build(),
                RibbonElementPriority.MEDIUM);

        List<RibbonBandResizePolicy> resizePolicies = new ArrayList<>();
        resizePolicies.add(new CoreRibbonResizePolicies.Mirror(findBand));
        resizePolicies.add(new CoreRibbonResizePolicies.IconRibbonBandResizePolicy(findBand));
        findBand.setResizePolicies(resizePolicies);

        return findBand;
    }

    protected JRibbonBand getQuickStylesBand() {
        JRibbonBand quickStylesBand = new JRibbonBand(
                resourceBundle.getString("QuickStyles.textBandTitle"),
                new Preferences_desktop_theme());
        quickStylesBand.setCollapsedStateKeyTip("ZS");

        quickStylesBand.setResizePolicies(
                CoreRibbonResizePolicies.getCorePoliciesRestrictive(quickStylesBand));

        Map<RibbonElementPriority, Integer> stylesGalleryVisibleCommandCounts = new
                HashMap<>();
        stylesGalleryVisibleCommandCounts.put(RibbonElementPriority.LOW, 1);
        stylesGalleryVisibleCommandCounts.put(RibbonElementPriority.MEDIUM, 2);
        stylesGalleryVisibleCommandCounts.put(RibbonElementPriority.TOP, 2);

        List<StringValuePair<List<FlamingoCommand>>> stylesGalleryCommands = new
                ArrayList<>();
        List<FlamingoCommand> stylesGalleryCommandsList = new ArrayList<>();
        List<FlamingoCommand> stylesGalleryCommandsList2 = new ArrayList<>();
        MessageFormat mfButtonText = new MessageFormat(
                resourceBundle.getString("StylesGallery.textButton"));
        mfButtonText.setLocale(currLocale);
        for (int i = 0; i < 30; i++) {
            final int index = i;
            ResizableIcon fontIcon = new Font_x_generic();
            ResizableIcon finalIcon = new DecoratedResizableIcon(fontIcon,
                    (Component c, Graphics g, int x, int y,
                            int width, int height) -> {
                        Graphics2D g2d = (Graphics2D) g.create();
                        g2d.setColor(Color.black);
                        NeonCortex.installDesktopHints(g2d, c);
                        g2d.setFont(SubstanceCortex.GlobalScope.getFontPolicy().getFontSet(null).
                                getControlFont());
                        g2d.drawString("" + index, x + 2, y + height - 2);
                        g2d.dispose();
                    });

            FlamingoCommand ribbonCommand = new FlamingoCommandBuilder()
                    .setTitle(mfButtonText.format(new Object[] { i })).setIcon(finalIcon)
                    .setAction((ActionEvent e) -> System.out.println("Invoked action on " + index))
                    .setToggleSelected(i == 1).build();

            // jrb.setName("Style " + i);
            if (i < 10) {
                stylesGalleryCommandsList.add(ribbonCommand);
            } else {
                stylesGalleryCommandsList2.add(ribbonCommand);
            }
        }

        stylesGalleryCommands.add(new StringValuePair<>(
                resourceBundle.getString("StylesGallery.textGroupTitle1"),
                stylesGalleryCommandsList));
        stylesGalleryCommands.add(new StringValuePair<>(
                resourceBundle.getString("StylesGallery.textGroupTitle2"),
                stylesGalleryCommandsList2));

        quickStylesBand.addRibbonGallery("Styles", stylesGalleryCommands,
                stylesGalleryVisibleCommandCounts, 3, 3, JRibbonBand.BIG_FIXED_LANDSCAPE,
                RibbonElementPriority.TOP);
        quickStylesBand.setRibbonGalleryPopupCallback("Styles", (JCommandPopupMenu menu) -> {
            JCommandMenuButton saveSelectionButton = new JCommandMenuButton(
                    resourceBundle.getString("Format.menuSaveSelection.text"),
                    new EmptyResizableIcon(16));
            saveSelectionButton.addActionListener(
                    (ActionEvent e) -> System.out.println("Save Selection activated"));
            saveSelectionButton.setActionKeyTip("SS");
            menu.addMenuButton(saveSelectionButton);

            JCommandMenuButton clearSelectionButton = new JCommandMenuButton(
                    resourceBundle.getString("Format.menuClearSelection.text"),
                    new EmptyResizableIcon(16));
            clearSelectionButton.addActionListener(
                    (ActionEvent e) -> System.out.println("Clear Selection activated"));
            clearSelectionButton.setActionKeyTip("SC");
            menu.addMenuButton(clearSelectionButton);

            menu.addMenuSeparator();
            JCommandMenuButton applyStylesButton = new JCommandMenuButton(
                    resourceBundle.getString("Format.applyStyles.text"), new Font_x_generic());
            applyStylesButton.addActionListener(
                    (ActionEvent e) -> System.out.println("Apply Styles activated"));
            applyStylesButton.setActionKeyTip("SA");
            menu.addMenuButton(applyStylesButton);
        });
        quickStylesBand.setRibbonGalleryExpandKeyTip("Styles", "L");

        quickStylesBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Styles1.text"))
                        .setIcon(Font_x_generic.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Generic activated"))
                        .setActionKeyTip("SA").build(),
                RibbonElementPriority.MEDIUM);

        quickStylesBand.addRibbonCommand(
                new FlamingoCommandBuilder().setTitle(resourceBundle.getString("Styles2.text"))
                        .setIcon(Image_x_generic.of(16, 16))
                        .setAction((ActionEvent e) -> System.out.println("Image activated"))
                        .setActionKeyTip("SB").build(),
                RibbonElementPriority.MEDIUM);

        final JColorSelectorPopupMenu.ColorSelectorCallback callback = new
                JColorSelectorPopupMenu.ColorSelectorCallback() {
                    @Override
                    public void onColorSelected(Color color) {
                        System.out.println("Selected color " + color);
                    }

                    @Override
                    public void onColorRollover(Color color) {
                        System.out.println("Rollover color " + color);
                    }
                };

        final PopupPanelCallback popupCallback = (JCommandButton commandButton) -> {
            JColorSelectorPopupMenu result = new JColorSelectorPopupMenu(callback);
            final Color defaultColor = new Color(0xFFEEEEEE);
            final JCommandMenuButton automaticColor = new JCommandMenuButton(
                    resourceBundle.getString("ColorSelector.textAutomatic"),
                    new ColorResizableIcon(16, defaultColor));
            automaticColor.getActionModel().addActionListener((ActionEvent e) -> {
                callback.onColorSelected(defaultColor);
                JColorSelectorPopupMenu.addColorToRecentlyUsed(defaultColor);
            });
            automaticColor.getActionModel().addChangeListener(new ChangeListener() {
                boolean wasRollover = automaticColor.getActionModel().isRollover();

                @Override
                public void stateChanged(ChangeEvent e) {
                    boolean isRollover = automaticColor.getActionModel().isRollover();
                    if (wasRollover && !isRollover) {
                        callback.onColorRollover(null);
                    }
                    if (!wasRollover && isRollover) {
                        callback.onColorRollover(Color.black);
                    }
                    wasRollover = isRollover;
                }
            });
            result.addMenuButton(automaticColor);

            result.addColorSectionWithDerived(
                    resourceBundle.getString("ColorSelector.textThemeCaption"),
                    new Color[] { new Color(255, 255, 255), new Color(0, 0, 0),
                            new Color(160, 160, 160), new Color(16, 64, 128),
                            new Color(80, 128, 192), new Color(180, 80, 80),
                            new Color(160, 192, 80), new Color(128, 92, 160),
                            new Color(80, 160, 208), new Color(255, 144, 64) });

            result.addColorSection(resourceBundle.getString("ColorSelector.textStandardCaption"),
                    new Color[] { new Color(140, 0, 0), new Color(253, 0, 0),
                            new Color(255, 160, 0), new Color(255, 255, 0),
                            new Color(144, 240, 144), new Color(0, 128, 0),
                            new Color(160, 224, 224), new Color(0, 0, 255),
                            new Color(0, 0, 128), new Color(128, 0, 128) });
            result.addRecentSection(resourceBundle.getString("ColorSelector.textRecentCaption"));

            JCommandMenuButton moreButton = new JCommandMenuButton(
                    resourceBundle.getString("ColorSelector.textMoreColor"), null);
            moreButton.getActionModel()
                    .addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
                        Color color = JColorChooser.showDialog(BasicCheckRibbon.this,
                                "Color chooser", defaultColor);
                        if (color != null) {
                            callback.onColorSelected(color);
                            JColorSelectorPopupMenu.addColorToRecentlyUsed(color);
                        }
                    }));
            result.addMenuButton(moreButton);
            return result;
        };

        quickStylesBand.addRibbonCommand(new FlamingoCommandBuilder()
                        .setTitle(resourceBundle.getString("Styles3.text")).setIcon(Text_html.of
                                (16, 16))
                        .setPopupCallback(popupCallback).setPopupKeyTip("SC").build(),
                RibbonElementPriority.MEDIUM);

        return quickStylesBand;
    }

    protected JRibbonBand getPreviewBand() {
        JRibbonBand previewBand = new JRibbonBand(resourceBundle.getString("Preview.textBandTitle"),
                new SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32));

        previewBand.setResizePolicies(CoreRibbonResizePolicies.getCorePoliciesNone(previewBand));

        previewBand.addRibbonCommand(new FlamingoCommandBuilder()
                        .setTitle(resourceBundle.getString("Preview.text"))
                        .setIcon(new SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32))
                        .setAction((ActionEvent e) -> System.out.println("Preview activated"))
                        .build(),
                RibbonElementPriority.TOP);
        previewBand
                .addRibbonCommand(
                        new FlamingoCommandBuilder()
                                .setTitle(resourceBundle.getString("SlideShow.text"))
                                .setIcon(new SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32))
                                .setAction((ActionEvent e) -> System.out
                                        .println("Slide Show activated"))
                                .build(),
                        RibbonElementPriority.TOP);

        return previewBand;
    }

    protected JRibbonBand getAlignmentBand() {
        JRibbonBand alignmentBand = new JRibbonBand(
                resourceBundle.getString("Alignment.textTaskTitle"), new Format_justify_left(),
                null);

        alignmentBand.startGroup();

        JRibbonComponent wideWrapper1 = new JRibbonComponent(
                new JLabel(resourceBundle.getString("VeryLong.text")));
        alignmentBand.addRibbonComponent(wideWrapper1);

        JRibbonComponent alignLeadingWrapper1 = new JRibbonComponent(null,
                resourceBundle.getString("Leading.text"),
                new JSpinner(new SpinnerNumberModel(0, 0, 100, 5)));
        alignLeadingWrapper1.setHorizontalAlignment(HorizontalAlignment.LEADING);
        alignmentBand.addRibbonComponent(alignLeadingWrapper1);

        JRibbonComponent alignTrailingWrapper1 = new JRibbonComponent(null,
                resourceBundle.getString("Trailing.text"),
                new JSpinner(new SpinnerNumberModel(0, 0, 100, 5)));
        alignTrailingWrapper1.setHorizontalAlignment(HorizontalAlignment.TRAILING);
        alignmentBand.addRibbonComponent(alignTrailingWrapper1);

        JRibbonComponent wideWrapper2 = new JRibbonComponent(
                new JLabel(resourceBundle.getString("VeryLong.text")));
        alignmentBand.addRibbonComponent(wideWrapper2);

        JRibbonComponent alignCenterWrapper1 = new JRibbonComponent(null,
                resourceBundle.getString("Center.text"),
                new JSpinner(new SpinnerNumberModel(0, 0, 100, 5)));
        alignCenterWrapper1.setHorizontalAlignment(HorizontalAlignment.CENTER);
        alignmentBand.addRibbonComponent(alignCenterWrapper1);

        JRibbonComponent alignFillWrapper1 = new JRibbonComponent(null,
                resourceBundle.getString("Fill.text"),
                new JSpinner(new SpinnerNumberModel(0, 0, 100, 5)));
        alignFillWrapper1.setHorizontalAlignment(HorizontalAlignment.FILL);
        alignmentBand.addRibbonComponent(alignFillWrapper1);

        alignmentBand.startGroup();

        JRibbonComponent wideWrapper3 = new JRibbonComponent(
                new JLabel(resourceBundle.getString("Long.text")));
        alignmentBand.addRibbonComponent(wideWrapper3);

        JRibbonComponent alignLeadingWrapper2 = new JRibbonComponent(
                new JSpinner(new SpinnerNumberModel(0, 0, 100, 5)));
        alignLeadingWrapper2.setHorizontalAlignment(HorizontalAlignment.LEADING);
        alignmentBand.addRibbonComponent(alignLeadingWrapper2);

        JRibbonComponent alignTrailingWrapper2 = new JRibbonComponent(
                new JSpinner(new SpinnerNumberModel(0, 0, 100, 5)));
        alignTrailingWrapper2.setHorizontalAlignment(HorizontalAlignment.TRAILING);
        alignmentBand.addRibbonComponent(alignTrailingWrapper2);

        JRibbonComponent wideWrapper4 = new JRibbonComponent(
                new JLabel(resourceBundle.getString("Long.text")));
        alignmentBand.addRibbonComponent(wideWrapper4);

        JRibbonComponent alignCenterWrapper2 = new JRibbonComponent(
                new JSpinner(new SpinnerNumberModel(0, 0, 100, 5)));
        alignCenterWrapper2.setHorizontalAlignment(HorizontalAlignment.CENTER);
        alignmentBand.addRibbonComponent(alignCenterWrapper2);

        JRibbonComponent alignFillWrapper2 = new JRibbonComponent(
                new JSpinner(new SpinnerNumberModel(0, 0, 100, 5)));
        alignFillWrapper2.setHorizontalAlignment(HorizontalAlignment.FILL);
        alignmentBand.addRibbonComponent(alignFillWrapper2);

        return alignmentBand;
    }

    protected JRibbonBand getAnimationBand() {
        JRibbonBand animationBand = new JRibbonBand(
                resourceBundle.getString("Animation.textBandTitle"),
                new SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32));

        animationBand
                .addRibbonCommand(
                        new FlamingoCommandBuilder()
                                .setTitle(resourceBundle.getString("CustomAnimation.text"))
                                .setIcon(new SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32))
                                .setAction((ActionEvent e) -> System.out
                                        .println("Animation 1 activated"))
                                .build(),
                        RibbonElementPriority.TOP);
        animationBand
                .addRibbonCommand(
                        new FlamingoCommandBuilder()
                                .setTitle(resourceBundle.getString("CustomAnimation.text"))
                                .setIcon(new SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32))
                                .setAction((ActionEvent e) -> System.out
                                        .println("Animation 2 activated"))
                                .build(),
                        RibbonElementPriority.TOP);
        animationBand
                .addRibbonCommand(
                        new FlamingoCommandBuilder()
                                .setTitle(resourceBundle.getString("CustomAnimation.text"))
                                .setIcon(new SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32))
                                .setAction((ActionEvent e) -> System.out
                                        .println("Animation 3 activated"))
                                .build(),
                        RibbonElementPriority.TOP);

        animationBand
                .setResizePolicies(CoreRibbonResizePolicies.getCorePoliciesNone(animationBand));

        return animationBand;
    }

    protected JRibbonBand getTransitionBand() {
        JRibbonBand transitionBand = new JRibbonBand(
                resourceBundle.getString("TransitionToThis.textBandTitle"),
                new SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32));

        Map<RibbonElementPriority, Integer> transitionGalleryVisibleCommandCounts = new
                HashMap<RibbonElementPriority, Integer>();
        transitionGalleryVisibleCommandCounts.put(RibbonElementPriority.LOW, 2);
        transitionGalleryVisibleCommandCounts.put(RibbonElementPriority.MEDIUM, 4);
        transitionGalleryVisibleCommandCounts.put(RibbonElementPriority.TOP, 6);

        List<StringValuePair<List<FlamingoCommand>>> transitionGalleryCommands = new
                ArrayList<StringValuePair<List<FlamingoCommand>>>();

        List<FlamingoCommand> transitionGalleryCommandsList = new ArrayList<FlamingoCommand>();
        for (int i = 1; i <= 40; i++) {
            final int index = i;
            ResizableIcon mainIcon = new Appointment_new();
            ResizableIcon finalIcon = new DecoratedResizableIcon(mainIcon,
                    new DecoratedResizableIcon.IconDecorator() {
                        @Override
                        public void paintIconDecoration(Component c, Graphics g, int x, int y,
                                int width, int height) {
                            Graphics2D g2d = (Graphics2D) g.create();
                            NeonCortex.installDesktopHints(g2d, c);
                            g2d.setFont(UIManager.getFont("Label.font").deriveFont(9.0f));
                            g2d.setColor(Color.black);
                            g2d.drawString("" + index, x + 1, y + height - 2);
                            g2d.drawString("" + index, x + 3, y + height - 2);
                            g2d.drawString("" + index, x + 2, y + height - 1);
                            g2d.drawString("" + index, x + 2, y + height - 3);
                            g2d.setColor(Color.white);
                            g2d.drawString("" + index, x + 2, y + height - 2);
                            g2d.dispose();
                        }
                    });

            FlamingoCommand ribbonCommand = new FlamingoCommandBuilder().setIcon(finalIcon)
                    .setAction((ActionEvent e) -> System.out.println("Activated action " + index))
                    .setToggle().build();

            transitionGalleryCommandsList.add(ribbonCommand);
        }
        transitionGalleryCommands.add(new StringValuePair<List<FlamingoCommand>>(
                resourceBundle.getString("TransitionGallery.textGroupTitle1"),
                transitionGalleryCommandsList));

        List<FlamingoCommand> transitionGalleryButtonsList2 = new ArrayList<FlamingoCommand>();
        for (int i = 41; i <= 70; i++) {
            final int index = i;
            ResizableIcon mainIcon = new Appointment_new();
            ResizableIcon finalIcon = new DecoratedResizableIcon(mainIcon,
                    new DecoratedResizableIcon.IconDecorator() {
                        @Override
                        public void paintIconDecoration(Component c, Graphics g, int x, int y,
                                int width, int height) {
                            Graphics2D g2d = (Graphics2D) g.create();
                            NeonCortex.installDesktopHints(g2d, c);
                            g2d.setFont(UIManager.getFont("Label.font").deriveFont(9.0f));
                            g2d.setColor(Color.black);
                            g2d.drawString("" + index, x + 1, y + height - 2);
                            g2d.drawString("" + index, x + 3, y + height - 2);
                            g2d.drawString("" + index, x + 2, y + height - 1);
                            g2d.drawString("" + index, x + 2, y + height - 3);
                            g2d.setColor(Color.white);
                            g2d.drawString("" + index, x + 2, y + height - 2);
                            g2d.dispose();
                        }
                    });

            FlamingoCommand ribbonCommand = new FlamingoCommandBuilder().setIcon(finalIcon)
                    .setAction((ActionEvent e) -> System.out.println("Activated action " + index))
                    .setToggle().build();

            transitionGalleryButtonsList2.add(ribbonCommand);
        }
        transitionGalleryCommands.add(new StringValuePair<List<FlamingoCommand>>(
                resourceBundle.getString("TransitionGallery.textGroupTitle2"),
                transitionGalleryButtonsList2));

        transitionBand.addRibbonGallery("Transitions", transitionGalleryCommands,
                transitionGalleryVisibleCommandCounts, 6, 6, CommandButtonDisplayState.SMALL,
                RibbonElementPriority.TOP);

        transitionBand.startGroup();
        transitionBand.addRibbonComponent(new JRibbonComponent(
                new SimpleResizableIcon(RibbonElementPriority.TOP, 16, 16),
                resourceBundle.getString("Sound.text"), new JComboBox(new Object[] {
                "[" + resourceBundle.getString("NoSound.text") + "]     " })));
        transitionBand.addRibbonComponent(
                new JRibbonComponent(null, resourceBundle.getString("Speed.text"), new JComboBox(
                        new Object[] { resourceBundle.getString("Medium.text") + "           " })));
        JCommandButton applyToAll = new JCommandButton(resourceBundle.getString("ApplyToAll.text"),
                new SimpleResizableIcon(RibbonElementPriority.TOP, 16, 16));
        applyToAll.setDisplayState(CommandButtonDisplayState.MEDIUM);
        applyToAll.setVGapScaleFactor(0.5);
        transitionBand.addRibbonComponent(new JRibbonComponent(applyToAll));

        return transitionBand;
    }

    protected JRibbonBand getTransitionNextBand() {
        JRibbonBand transitionBand = new JRibbonBand(
                resourceBundle.getString("TransitionToNext.textBandTitle"),
                new SimpleResizableIcon(RibbonElementPriority.TOP, 32, 32));

        JCheckBox mouseClick = new JCheckBox(resourceBundle.getString("OnMouseClick.text"));
        mouseClick.setSelected(true);
        JRibbonComponent mouseClickWrapper = new JRibbonComponent(mouseClick);
        transitionBand.addRibbonComponent(mouseClickWrapper);

        JCheckBox autoAfter = new JCheckBox(resourceBundle.getString("AutoAfter.text"));
        JRibbonComponent autoAfterWrapper = new JRibbonComponent(autoAfter);
        transitionBand.addRibbonComponent(autoAfterWrapper);

        transitionBand.addRibbonComponent(
                new JRibbonComponent(new SimpleResizableIcon(RibbonElementPriority.TOP, 16, 16), "",
                        new JSpinner(new SpinnerDateModel())));

        return transitionBand;
    }

    protected RibbonContextualTaskGroup group1;
    protected RibbonContextualTaskGroup group2;

    protected JPanel statusBar;

    private JRibbonBand paragraphBand;

    public BasicCheckRibbon() {
        super();
        setApplicationIcon(new Applications_internet());
        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.demo.flamingo.resource.Resources", currLocale);
        setTitle(resourceBundle.getString("Frame.title"));
    }

    public void configureRibbon() {
        JRibbonBand clipboardBand = this.getClipboardBand();
        JRibbonBand quickStylesBand = this.getQuickStylesBand();
        JFlowRibbonBand fontBand = this.getFontBand();
        JRibbonBand documentBand = this.getDocumentBand();
        JRibbonBand findBand = this.getFindBand();
        RibbonTask pageLayoutTask = new RibbonTask(
                resourceBundle.getString("PageLayout.textTaskTitle"), clipboardBand,
                quickStylesBand, fontBand, documentBand, findBand);
        pageLayoutTask.setKeyTip("P");

        JRibbonBand actionBand = this.getActionBand();
        JRibbonBand preferencesBand = this.getPreferencesBand();
        JRibbonBand arrangeBand = this.getApplicationsBand();
        paragraphBand = this.getParagraphBand();
        JRibbonBand showHideBand = this.getShowHideBand();
        RibbonTask writeTask = new RibbonTask(resourceBundle.getString("Write.textTaskTitle"),
                actionBand, preferencesBand, arrangeBand, paragraphBand, showHideBand);
        writeTask.setResizeSequencingPolicy(
                new CoreRibbonResizeSequencingPolicies.CollapseFromLast(writeTask));
        writeTask.setKeyTip("W");

        JRibbonBand previewBand = this.getPreviewBand();
        JRibbonBand animationBand = this.getAnimationBand();
        JRibbonBand transitionBand = this.getTransitionBand();
        JRibbonBand transitionNextBand = this.getTransitionNextBand();
        RibbonTask animationsTask = new RibbonTask(
                resourceBundle.getString("Animations.textTaskTitle"), previewBand, animationBand,
                transitionBand, transitionNextBand);
        animationsTask.setKeyTip("A");

        JRibbonBand alignmentBand = this.getAlignmentBand();
        RibbonTask wrappedTask = new RibbonTask(resourceBundle.getString("Wrapped.textTaskTitle"),
                alignmentBand);
        wrappedTask.setKeyTip("R");

        this.getRibbon().addTask(pageLayoutTask);
        this.getRibbon().addTask(writeTask);
        this.getRibbon().addTask(animationsTask);
        this.getRibbon().addTask(wrappedTask);

        this.getRibbon()
                .addAnchoredCommand(new FlamingoCommandBuilder()
                        .setTitle(resourceBundle.getString("Share.title"))
                        .setIcon(Internet_mail.of(16, 16)).setActionKeyTip("GS")
                        .setAction((ActionEvent e) -> JOptionPane
                                .showMessageDialog(BasicCheckRibbon.this, "Share button clicked"))
                        .build());

        this.getRibbon()
                .addAnchoredCommand(new FlamingoCommandBuilder()
                        .setIcon(Internet_group_chat.of(16, 16)).setActionKeyTip("GC")
                        .setAction((ActionEvent e) -> JOptionPane
                                .showMessageDialog(BasicCheckRibbon.this, "Chat button clicked"))
                        .build());

        this.getRibbon().addAnchoredCommand(new FlamingoCommandBuilder()
                .setIcon(Help_browser.of(16, 16))
                .setActionRichTooltip(new RichTooltip.RichTooltipBuilder()
                        .setTitle(resourceBundle.getString("Help.tooltip.title"))
                        .addDescriptionSection(
                                resourceBundle.getString("Help.tooltip.actionParagraph"))
                        .build())
                .setActionKeyTip("GH").setAction((ActionEvent e) -> JOptionPane
                        .showMessageDialog(BasicCheckRibbon.this, "Help button clicked"))
                .build());

        group1 = new RibbonContextualTaskGroup(
                resourceBundle.getString("Group1.textTaskGroupTitle"), Color.red,
                getContextualRibbonTask(resourceBundle.getString("Task11.textTaskTitle"), "XA"),
                getContextualRibbonTask(resourceBundle.getString("Task12.textTaskTitle"), "XB"));
        group2 = new RibbonContextualTaskGroup(
                resourceBundle.getString("Group2.textTaskGroupTitle"), Color.green,
                getContextualRibbonTask(resourceBundle.getString("Task21.textTaskTitle"), "YA"));
        this.getRibbon().addContextualTaskGroup(group1);
        this.getRibbon().addContextualTaskGroup(group2);

        configureTaskBar();

        // application menu
        configureApplicationMenu();

        this.add(getControlPanel(), BorderLayout.EAST);
        this.add(new RulerPanel(), BorderLayout.CENTER);

        this.configureStatusBar();
    }

    protected void configureTaskBar() {
        JRibbon ribbon = this.getRibbon();

        // taskbar components
        ribbon.addTaskbarCommand(new FlamingoCommandBuilder().setIcon(Edit_paste.of(16, 16))
                .setAction((ActionEvent e) -> System.out.println("Taskbar Paste activated"))
                .setActionRichTooltip(new RichTooltip.RichTooltipBuilder()
                        .setTitle(resourceBundle.getString("Paste.text"))
                        .addDescriptionSection(
                                resourceBundle.getString("Paste.tooltip.actionParagraph1"))
                        .build())
                .setActionKeyTip("1")
                .setPopupCallback((JCommandButton commandButton) -> new SamplePopupMenu())
                .setPopupRichTooltip(new RichTooltip.RichTooltipBuilder()
                        .setTitle(resourceBundle.getString("Paste.text"))
                        .addDescriptionSection(
                                resourceBundle.getString("Paste.tooltip.popupParagraph1"))
                        .build())
                .setTitleClickAction().build());

        ribbon.addTaskbarCommand(new FlamingoCommandBuilder().setIcon(Edit_clear.of(16, 16))
                .setAction((ActionEvent e) -> System.out.println("Taskbar Clear activated"))
                .setEnabled(false).setActionKeyTip("2").build());

        ribbon.addTaskbarCommand(new FlamingoCommandBuilder().setIcon(Edit_copy.of(16, 16))
                .setAction((ActionEvent e) -> System.out.println("Taskbar Copy activated"))
                .setActionKeyTip("3").build());

        ribbon.addTaskbarSeparator();

        ribbon.addTaskbarCommand(new FlamingoCommandBuilder().setIcon(Edit_find.of(16, 16))
                .setAction((ActionEvent e) -> System.out.println("Taskbar Find activated"))
                .setActionKeyTip("4").build());

        JComboBox seasonCombo = new JComboBox<>(new String[] { "Winter",
                "Spring", "Summer", "Autumn" });
        JRibbonComponent seasonComboWrapper = new JRibbonComponent(seasonCombo);
        seasonComboWrapper.setKeyTip("5");
        seasonComboWrapper.setRichTooltip(new RichTooltip.RichTooltipBuilder()
                .setTitle(resourceBundle.getString("Seasons.tooltip.title"))
                .build());
        ribbon.addTaskbarComponent(seasonComboWrapper);

        ribbon.addTaskbarGalleryDropdown(ribbon.getTask(0).getBand(1), "Styles",
                Font_x_generic.of(16, 16));
    }

    protected void configureApplicationMenu() {
        // "Create new" primary
        RibbonApplicationMenuPrimaryCommand amEntryNew = new
                RibbonApplicationMenuPrimaryCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuNew.text"))
                .setIcon(Document_new.of(16, 16))
                .setAction((ActionEvent ae) -> System.out.println("Invoked creating new document"))
                .setActionKeyTip("N").build();

        // "Open" primary
        RibbonApplicationMenuPrimaryCommand amEntryOpen = new
                RibbonApplicationMenuPrimaryCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuOpen.text"))
                .setIcon(Document_open.of(16, 16))
                .setAction((ActionEvent ae) -> System.out.println("Invoked opening document"))
                .setRolloverCallback((JPanel targetPanel) -> {
                    targetPanel.removeAll();
                    JCommandButtonPanel openHistoryPanel = new JCommandButtonPanel(
                            CommandButtonDisplayState.MEDIUM);
                    String groupName = resourceBundle
                            .getString("AppMenuOpen.secondary.textGroupTitle1");
                    openHistoryPanel.addButtonGroup(groupName);

                    MessageFormat mf = new MessageFormat(
                            resourceBundle.getString("AppMenuOpen.secondary.textButton"));
                    mf.setLocale(currLocale);
                    for (int i = 0; i < 5; i++) {
                        JCommandButton historyButton = new JCommandButton(
                                mf.format(new Object[] { i }), new Text_html());
                        historyButton.setHorizontalAlignment(SwingUtilities.LEFT);
                        openHistoryPanel.addButtonToLastGroup(historyButton);
                    }
                    openHistoryPanel.setMaxButtonColumns(1);
                    targetPanel.setLayout(new BorderLayout());
                    targetPanel.add(openHistoryPanel, BorderLayout.CENTER);
                }).setActionKeyTip("O").build();

        // "Save" primary
        RibbonApplicationMenuPrimaryCommand amEntrySave = new
                RibbonApplicationMenuPrimaryCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuSave.text"))
                .setIcon(Document_save.of(16, 16))
                .setAction((ActionEvent ae) -> System.out.println("Invoked saving document"))
                .setActionKeyTip("S").setEnabled(false).build();

        // "Save as" primary + secondaries
        FlamingoCommand amEntrySaveAsWord = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuSaveAs.word.text"))
                .setIcon(X_office_document.of(16, 16))
                .setExtraText(resourceBundle.getString("AppMenuSaveAs.word.description"))
                .setAction((ActionEvent ae) -> System.out.println("Invoked saved as Word"))
                .setActionKeyTip("W").build();

        FlamingoCommand amEntrySaveAsHtml = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuSaveAs.html.text"))
                .setIcon(Text_html.of(16, 16))
                .setExtraText(resourceBundle.getString("AppMenuSaveAs.html.description"))
                .setAction((ActionEvent ae) -> System.out.println("Invoked saved as HTML"))
                .setActionKeyTip("H").setEnabled(false).build();

        FlamingoCommand amEntrySaveAsOtherFormats = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuSaveAs.other.text"))
                .setIcon(Document_save_as.of(16, 16))
                .setExtraText(resourceBundle.getString("AppMenuSaveAs.other.description"))
                .setAction((ActionEvent ae) -> System.out.println("Invoked saved as other"))
                .setActionKeyTip("O").build();

        RibbonApplicationMenuPrimaryCommand amEntrySaveAs = new
                RibbonApplicationMenuPrimaryCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuSaveAs.text"))
                .setIcon(Document_save_as.of(16, 16))
                .setAction((ActionEvent ae) -> System.out.println("Invoked saving document as"))
                .setActionKeyTip("A").setPopupKeyTip("F").setTitleClickAction()
                .addSecondaryMenuGroup(
                        resourceBundle.getString("AppMenuSaveAs.secondary.textGroupTitle1"),
                        amEntrySaveAsWord, amEntrySaveAsHtml, amEntrySaveAsOtherFormats)
                .build();

        // "Print" primary + secondaries
        FlamingoCommand amEntryPrintSelect = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuPrint.print.text"))
                .setIcon(Printer.of(16, 16))
                .setExtraText(resourceBundle.getString("AppMenuPrint.print.description"))
                .setAction((ActionEvent ae) -> System.out.println("Invoked print"))
                .setActionKeyTip("P").build();

        FlamingoCommand amEntryPrintDefault = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuPrint.quick.text"))
                .setIcon(Printer.of(16, 16))
                .setExtraText(resourceBundle.getString("AppMenuPrint.quick.description"))
                .setAction((ActionEvent ae) -> System.out.println("Invoked quick"))
                .setActionKeyTip("Q").build();

        FlamingoCommand amEntryPrintPreview = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuPrint.preview.text"))
                .setIcon(Document_print_preview.of(16, 16))
                .setExtraText(resourceBundle.getString("AppMenuPrint.preview.description"))
                .setAction((ActionEvent ae) -> System.out.println("Invoked preview"))
                .setActionKeyTip("V").build();

        FlamingoCommand amEntryPrintMemo = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuPrint.memo.text"))
                .setIcon(Text_x_generic.of(16, 16))
                .setAction((ActionEvent ae) -> System.out.println("Invoked memo"))
                .setActionKeyTip("M").build();

        FlamingoCommand amEntryPrintCustom = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuPrint.custom.text"))
                .setIcon(Text_x_generic.of(16, 16))
                .setAction((ActionEvent ae) -> System.out.println("Invoked custom"))
                .setActionKeyTip("C").build();

        RibbonApplicationMenuPrimaryCommand amEntryPrint = new
                RibbonApplicationMenuPrimaryCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuPrint.text"))
                .setIcon(Document_print.of(16, 16))
                .setAction((ActionEvent ae) -> System.out.println("Invoked printing as"))
                .setActionKeyTip("P").setPopupKeyTip("W").setTitleClickAction()
                .addSecondaryMenuGroup(
                        resourceBundle.getString("AppMenuPrint.secondary.textGroupTitle1"),
                        amEntryPrintSelect, amEntryPrintDefault, amEntryPrintPreview)
                .addSecondaryMenuGroup(
                        resourceBundle.getString("AppMenuPrint.secondary.textGroupTitle2"),
                        amEntryPrintMemo, amEntryPrintCustom)
                .build();

        // "Send" primary + secondaries
        FlamingoCommand amEntrySendMail = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuSend.email.text"))
                .setIcon(Mail_message_new.of(16, 16))
                .setExtraText(resourceBundle.getString("AppMenuSend.email.description"))
                .setAction((ActionEvent ae) -> System.out.println("Invoked email"))
                .setActionKeyTip("E").build();

        FlamingoCommand amEntrySendHtml = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuSend.html.text"))
                .setIcon(Text_html.of(16, 16))
                .setExtraText(resourceBundle.getString("AppMenuSend.html.description"))
                .setAction((ActionEvent ae) -> System.out.println("Invoked HTML"))
                .setActionKeyTip("H").build();

        FlamingoCommand amEntrySendDoc = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuSend.word.text"))
                .setIcon(X_office_document.of(16, 16))
                .setExtraText(resourceBundle.getString("AppMenuSend.word.description"))
                .setAction((ActionEvent ae) -> System.out.println("Invoked Word"))
                .setActionKeyTip("W").build();

        FlamingoCommand amEntrySendWireless = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuSend.wireless.text"))
                .setIcon(Network_wireless.of(16, 16))
                .setExtraText(resourceBundle.getString("AppMenuSend.wireless.description"))
                .setPopupCallback((JCommandButton commandButton) -> {
                    JCommandPopupMenu wirelessChoices = new JCommandPopupMenu();

                    JCommandMenuButton wiFiMenuButton = new JCommandMenuButton(
                            resourceBundle.getString("AppMenuSend.wireless.wifi.text"),
                            new EmptyResizableIcon(16));
                    wiFiMenuButton.setActionKeyTip("W");
                    wiFiMenuButton.addActionListener(
                            (ActionEvent e) -> System.out.println("WiFi activated"));
                    wirelessChoices.addMenuButton(wiFiMenuButton);

                    JCommandMenuButton blueToothMenuButton = new JCommandMenuButton(
                            resourceBundle.getString("AppMenuSend.wireless.bluetooth.text"),
                            new EmptyResizableIcon(16));
                    blueToothMenuButton.setActionKeyTip("B");
                    blueToothMenuButton.addActionListener(
                            (ActionEvent e) -> System.out.println("BlueTooth activated"));
                    wirelessChoices.addMenuButton(blueToothMenuButton);
                    return wirelessChoices;
                }).setPopupKeyTip("X").build();

        RibbonApplicationMenuPrimaryCommand amEntrySend = new
                RibbonApplicationMenuPrimaryCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuSend.text"))
                .setIcon(Mail_forward.of(16, 16)).setPopupKeyTip("D")
                .addSecondaryMenuGroup(
                        resourceBundle.getString("AppMenuSend.secondary.textGroupTitle1"),
                        amEntrySendMail, amEntrySendHtml, amEntrySendDoc, amEntrySendWireless)
                .build();

        // "Exit" primary
        RibbonApplicationMenuPrimaryCommand amEntryExit = new
                RibbonApplicationMenuPrimaryCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuExit.text"))
                .setIcon(System_log_out.of(16, 16)).setAction((ActionEvent ae) -> System.exit(0))
                .setActionKeyTip("X").setRolloverCallback(new PrimaryClearRolloverCallback())
                .build();

        RibbonApplicationMenu applicationMenu = new RibbonApplicationMenu(
                resourceBundle.getString("AppMenu.title"));
        applicationMenu.addMenuCommand(amEntryNew);
        applicationMenu.addMenuCommand(amEntryOpen);
        applicationMenu.addMenuCommand(amEntrySave);
        applicationMenu.addMenuCommand(amEntrySaveAs);
        applicationMenu.addMenuSeparator();
        applicationMenu.addMenuCommand(amEntryPrint);
        applicationMenu.addMenuCommand(amEntrySend);
        applicationMenu.addMenuSeparator();
        applicationMenu.addMenuCommand(amEntryExit);

        applicationMenu.setDefaultCallback((JPanel targetPanel) -> {
            targetPanel.removeAll();
            JCommandButtonPanel openHistoryPanel = new JCommandButtonPanel(
                    CommandButtonDisplayState.MEDIUM);
            String groupName = resourceBundle.getString("AppMenu.default.textGroupTitle1");
            openHistoryPanel.addButtonGroup(groupName);

            MessageFormat mf = new MessageFormat(
                    resourceBundle.getString("AppMenu.default.textButton"));
            mf.setLocale(currLocale);
            for (int i = 0; i < 5; i++) {
                JCommandButton historyButton = new JCommandButton(mf.format(new Object[] { i }),
                        new Text_html());
                historyButton.setHorizontalAlignment(SwingUtilities.LEFT);
                openHistoryPanel.addButtonToLastGroup(historyButton);
            }
            openHistoryPanel.setMaxButtonColumns(1);
            targetPanel.setLayout(new BorderLayout());
            targetPanel.add(openHistoryPanel, BorderLayout.CENTER);
        });

        FlamingoCommand amFooterProps = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuOptions.text"))
                .setIcon(Document_properties.of(16, 16))
                .setAction((ActionEvent ae) -> System.out.println("Invoked Options")).build();
        FlamingoCommand amFooterExit = new FlamingoCommandBuilder()
                .setTitle(resourceBundle.getString("AppMenuExit.text"))
                .setIcon(System_log_out.of(16, 16)).setAction((ActionEvent ae) -> System.exit(0))
                .setEnabled(false).build();

        applicationMenu.addFooterCommand(amFooterProps);
        applicationMenu.addFooterCommand(amFooterExit);

        //this.getRibbon().setApplicationMenu(applicationMenu);

        ResizableIcon appMenuRichTooltipMainIcon = null;
        try {
            final BufferedImage appMenuButtonTooltipImage = ImageIO
                    .read(BasicCheckRibbon.class.getResource(
                            "/org/pushingpixels/demo/flamingo/ribbon/appmenubutton-tooltip-main" +
                                    ".png"));
            final int appMenuButtonTooltipImageWidth = appMenuButtonTooltipImage.getWidth();
            final int appMenuButtonTooltipImageHeight = appMenuButtonTooltipImage.getHeight();
            final float appMenuButtonTooltipImageRatio = (float) appMenuButtonTooltipImageWidth
                    / (float) appMenuButtonTooltipImageHeight;
            final int appMenuButtonTooltipImageInitialWidth = 160;
            final int appMenuButtonTooltipImageInitialHeight = (int)
                    (appMenuButtonTooltipImageInitialWidth
                            / appMenuButtonTooltipImageRatio);
            appMenuRichTooltipMainIcon = new ResizableIcon() {
                private int width;
                private int height;

                @Override
                public int getIconWidth() {
                    return this.width;
                }

                @Override
                public int getIconHeight() {
                    return this.height;
                }

                @Override
                public void setDimension(Dimension newDimension) {
                    this.width = newDimension.width;
                    this.height = newDimension.height;
                }

                @Override
                public void paintIcon(Component c, Graphics g, int x, int y) {
                    g.drawImage(appMenuButtonTooltipImage, x, y, getIconWidth(), getIconHeight(),
                            null);
                }
            };
            appMenuRichTooltipMainIcon.setDimension(new Dimension(
                    appMenuButtonTooltipImageInitialWidth, appMenuButtonTooltipImageInitialHeight));
        } catch (IOException ioe) {
        }

        this.getRibbon().setApplicationMenuRichTooltip(new RichTooltip.RichTooltipBuilder()
                .setTitle(resourceBundle.getString("AppMenu.tooltip.title"))
                .addDescriptionSection(resourceBundle.getString("AppMenu.tooltip.paragraph1"))
                .setMainIcon(appMenuRichTooltipMainIcon).setFooterIcon(Help_browser.of(16, 16))
                .addFooterSection(resourceBundle.getString("AppMenu.tooltip.footer1")).build());
        this.getRibbon().setApplicationMenuKeyTip("F");
    }

    protected RibbonTask getContextualRibbonTask(String title, String keyTip) {
        JRibbonBand actionBand = this.getActionBand();
        JRibbonBand arrangeBand = this.getApplicationsBand();
        JRibbonBand previewBand = this.getPreviewBand();
        JRibbonBand transitionBand = this.getTransitionBand();
        RibbonTask task = new RibbonTask(title, actionBand, arrangeBand, previewBand,
                transitionBand);
        task.setKeyTip(keyTip);
        return task;
    }

    protected JPanel getControlPanel() {
        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 8dlu, fill:pref:grow").
                rows("p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p").
                padding(new EmptyBorder(20, 4, 0, 4));

        final JCheckBox group1Visible = new JCheckBox("visible");
        final JCheckBox group2Visible = new JCheckBox("visible");
        group1Visible.addActionListener((ActionEvent e) -> SwingUtilities
                .invokeLater(() -> getRibbon().setVisible(group1, group1Visible.isSelected())));
        group2Visible.addActionListener((ActionEvent e) -> SwingUtilities
                .invokeLater(() -> getRibbon().setVisible(group2, group2Visible.isSelected())));
        builder.add("Group 1").xy(1, 1).add(group1Visible).xy(3, 1);
        builder.add("Group 2").xy(1, 3).add(group2Visible).xy(3, 3);

        builder.addLabel("Skin").xy(1, 5).add(SkinSwitcher.getSkinSwitcher(this)).xy(3, 5);

        final JCheckBox appMenuVisible = new JCheckBox("visible");
        appMenuVisible.setSelected(true);
        appMenuVisible.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            if (!appMenuVisible.isSelected())
                getRibbon().setApplicationMenu(null);
            else
                configureApplicationMenu();
        }));
        builder.add("App menu").xy(1, 7).add(appMenuVisible).xy(3, 7);

        final JCheckBox taskbarFull = new JCheckBox("full");
        taskbarFull.setSelected(true);
        taskbarFull.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            if (!taskbarFull.isSelected()) {
                getRibbon().clearTaskbar();
            } else {
                configureTaskBar();
            }
        }));
        final JCheckBox taskbarEnabled = new JCheckBox("enabled");
        taskbarEnabled.setSelected(true);
        taskbarEnabled.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            for (FlamingoCommand command : getRibbon().getTaskbarCommands()) {
                command.setEnabled(taskbarEnabled.isSelected());
            }
        }));
        JPanel taskbarPanel = new JPanel();
        taskbarPanel.setLayout(new BorderLayout());
        taskbarPanel.add(taskbarFull, BorderLayout.LINE_START);
        taskbarPanel.add(taskbarEnabled, BorderLayout.LINE_END);
        builder.add("Taskbar").xy(1, 9).add(taskbarPanel).xy(3, 9);

        JButton changeParagraph = new JButton("change");
        changeParagraph
                .addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        paragraphBand.setGroupTitle(0, getRandomString(5, 15));
                        paragraphBand.getRibbonComponents(0).get(0)
                                .setCaption(getRandomString(4, 10));
                    }

                    private String getRandomString(int minLength, int maxLength) {
                        Random random = new Random();
                        int len = minLength + random.nextInt(maxLength - minLength);
                        String newTitle = new String();
                        String letters = "abcdefghijklmnopqrstubvwxyz       ";
                        for (int i = 0; i < len; i++) {
                            newTitle += letters.charAt(random.nextInt(letters.length()));
                        }
                        return newTitle;
                    }
                }));
        builder.add("Change 'Paragraph'").xy(1, 11).add(changeParagraph).xy(3, 11);

        JComboBox localeSwitcher = LocaleSwitcher.getLocaleSwitcher((Locale selected) -> {
            currLocale = selected;
            resourceBundle = ResourceBundle
                    .getBundle("org.pushingpixels.demo.flamingo.resource.Resources", currLocale);
            for (Window window : Window.getWindows()) {
                window.applyComponentOrientation(ComponentOrientation.getOrientation(currLocale));
                SwingUtilities.updateComponentTreeUI(window);
            }
        });
        builder.add("Locale").xy(1, 13).add(localeSwitcher).xy(3, 13);

        return builder.build();
    }

    protected JFlowRibbonBand getFontBand() {
        JFlowRibbonBand fontBand = new JFlowRibbonBand(
                resourceBundle.getString("Font.textBandTitle"), new Preferences_desktop_font(),
                new ExpandActionListener());
        fontBand.setExpandButtonKeyTip("FN");
        fontBand.setCollapsedStateKeyTip("ZF");

        JComboBox fontCombo = new JComboBox<>(new String[] { "+ Minor (Calibri)   ",
                "+ Minor (Columbus)   ", "+ Minor (Consolas)   ", "+ Minor (Cornelius)   ",
                "+ Minor (Cleopatra)   ", "+ Minor (Cornucopia)   ",
                "+ Minor (California)   ", "+ Minor (Calendula)   ",
                "+ Minor (Coriander)   ", "+ Minor (Callisto)   ",
                "+ Minor (Cajun)   ", "+ Minor (Congola)   ",
                "+ Minor (Candella)   ", "+ Minor (Cambria)   " });
        JRibbonComponent fontComboWrapper = new JRibbonComponent(fontCombo);
        fontComboWrapper.setKeyTip("SF");
        fontBand.addFlowComponent(fontComboWrapper);

        JComboBox sizeCombo = new JComboBox<>(new String[] { "11  " });
        JRibbonComponent sizeComboWrapper = new JRibbonComponent(sizeCombo);
        sizeComboWrapper.setKeyTip("SS");
        fontBand.addFlowComponent(sizeComboWrapper);

        JCommandButtonStrip indentStrip = new JCommandButtonStrip();

        JCommandButton indentLeftButton = new JCommandButton("", new Format_indent_less());
        indentLeftButton.setActionKeyTip("AO");
        indentStrip.add(indentLeftButton);

        JCommandButton indentRightButton = new JCommandButton("", new Format_indent_more());
        indentRightButton.setActionKeyTip("AI");
        indentStrip.add(indentRightButton);

        fontBand.addFlowComponent(indentStrip);

        JCommandButtonStrip styleStrip = new JCommandButtonStrip();

        JCommandToggleButton styleBoldButton = new JCommandToggleButton("", new Format_text_bold());
        styleBoldButton.addActionListener((ActionEvent e) -> System.out.println("Bold toggled"));
        styleBoldButton.getActionModel().setSelected(true);
        styleBoldButton
                .setActionRichTooltip(new RichTooltip.RichTooltipBuilder()
                        .setTitle(resourceBundle.getString("FontBold.tooltip.textActionTitle"))
                        .addDescriptionSection(
                                resourceBundle.getString("FontBold.tooltip.textActionParagraph1"))
                        .build());
        styleBoldButton.setActionKeyTip("1");
        styleStrip.add(styleBoldButton);

        JCommandToggleButton styleItalicButton = new JCommandToggleButton("",
                new Format_text_italic());
        styleItalicButton.addActionListener(
                (ActionEvent e) -> System.out.println("Italic toggled"));
        styleItalicButton.setActionRichTooltip(new RichTooltip.RichTooltipBuilder()
                .setTitle(resourceBundle.getString("FontItalic.tooltip.textActionTitle"))
                .addDescriptionSection(
                        resourceBundle.getString("FontItalic.tooltip.textActionParagraph1"))
                .build());
        styleItalicButton.setActionKeyTip("2");
        styleStrip.add(styleItalicButton);

        JCommandToggleButton styleUnderlineButton = new JCommandToggleButton("",
                new Format_text_underline());
        styleUnderlineButton.addActionListener(
                (ActionEvent e) -> System.out.println("Underline toggled"));
        styleUnderlineButton.setActionRichTooltip(new RichTooltip.RichTooltipBuilder()
                .setTitle(resourceBundle.getString("FontUnderline.tooltip.textActionTitle"))
                .addDescriptionSection(
                        resourceBundle.getString("FontUnderline.tooltip.textActionParagraph1"))
                .build());
        styleUnderlineButton.setActionKeyTip("3");
        styleStrip.add(styleUnderlineButton);

        JCommandToggleButton styleStrikeThroughButton = new JCommandToggleButton("",
                new Format_text_strikethrough());
        styleStrikeThroughButton.addActionListener(
                (ActionEvent e) -> System.out.println("Strikethrough toggled"));
        styleStrikeThroughButton.setActionRichTooltip(new RichTooltip.RichTooltipBuilder()
                .setTitle(resourceBundle.getString("FontStrikethrough.tooltip.textActionTitle"))
                .addDescriptionSection(
                        resourceBundle.getString("FontStrikethrough.tooltip.textActionParagraph1"))
                .build());
        styleStrikeThroughButton.setActionKeyTip("4");
        styleStrip.add(styleStrikeThroughButton);

        fontBand.addFlowComponent(styleStrip);

        JCommandButtonStrip alignStrip = new JCommandButtonStrip();
        CommandToggleButtonGroup alignGroup = new CommandToggleButtonGroup();

        JCommandToggleButton alignLeftButton = new JCommandToggleButton("",
                new Format_justify_left());
        alignLeftButton.setActionKeyTip("AL");
        alignGroup.add(alignLeftButton);
        alignStrip.add(alignLeftButton);

        JCommandToggleButton alignCenterButton = new JCommandToggleButton("",
                new Format_justify_center());
        alignCenterButton.setActionKeyTip("AC");
        alignCenterButton.getActionModel().setSelected(true);
        alignGroup.add(alignCenterButton);
        alignStrip.add(alignCenterButton);

        JCommandToggleButton alignRightButton = new JCommandToggleButton("",
                new Format_justify_right());
        alignRightButton.setActionKeyTip("AR");
        alignGroup.add(alignRightButton);
        alignStrip.add(alignRightButton);

        JCommandToggleButton alignFillButton = new JCommandToggleButton("",
                new Format_justify_fill());
        alignFillButton.setActionKeyTip("AF");
        alignGroup.add(alignFillButton);
        alignStrip.add(alignFillButton);

        fontBand.addFlowComponent(alignStrip);

        return fontBand;
    }

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());

            final BasicCheckRibbon c = new BasicCheckRibbon();
            c.configureRibbon();
            c.applyComponentOrientation(ComponentOrientation.getOrientation(Locale.getDefault()));
            Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment()
                    .getMaximumWindowBounds();
            c.setPreferredSize(new Dimension(r.width, r.height / 2));
            c.setMinimumSize(new Dimension(r.width / 10, r.height / 4));
            c.pack();
            c.setLocation(r.x, r.y);
            c.setVisible(true);
            c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            KeyStroke keyStroke = (NeonCortex.getPlatform() == NeonCortex
                    .Platform.MACOS) ? KeyStroke.getKeyStroke("meta alt E") :
                    KeyStroke.getKeyStroke("alt shift E");
            c.getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT)
                    .put(keyStroke, "installTracingRepaintManager");
            c.getRootPane().getActionMap().put("installTracingRepaintManager",
                    new AbstractAction() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            RepaintManager.setCurrentManager(new TracingRepaintManager());
                        }
                    });
        });
    }

    protected void configureStatusBar() {
        statusBar = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        SubstanceCortex.ComponentOrParentChainScope.setDecorationType(statusBar,
                SubstanceSlices.DecorationAreaType.FOOTER);

        JLabel helper = new JLabel("Right click to show menu");
        statusBar.add(helper);

        JCommandButtonStrip alignStrip = new JCommandButtonStrip();
        CommandToggleButtonGroup alignGroup = new CommandToggleButtonGroup();

        JCommandToggleButton alignLeftButton = new JCommandToggleButton("",
                new Format_justify_left());
        alignLeftButton.getActionModel().setSelected(true);
        alignGroup.add(alignLeftButton);
        alignStrip.add(alignLeftButton);

        JCommandToggleButton alignCenterButton = new JCommandToggleButton("",
                new Format_justify_center());
        alignGroup.add(alignCenterButton);
        alignStrip.add(alignCenterButton);

        JCommandToggleButton alignRightButton = new JCommandToggleButton("",
                new Format_justify_right());
        alignGroup.add(alignRightButton);
        alignStrip.add(alignRightButton);

        JCommandToggleButton alignFillButton = new JCommandToggleButton("",
                new Format_justify_fill());
        alignGroup.add(alignFillButton);
        alignStrip.add(alignFillButton);

        statusBar.add(alignStrip);

        final Map<Integer, Boolean> selection = new TreeMap<>();
        statusBar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    processPopup(e);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    processPopup(e);
                }
            }

            private void processPopup(MouseEvent me) {
                Point pt = new Point(me.getPoint());
                SwingUtilities.convertPointToScreen(pt, statusBar);
                final JCommandPopupMenu menu = new JCommandPopupMenu();
                for (int i = 0; i < 10; i++) {
                    final int ind = i;
                    final JCommandToggleMenuButton button = new JCommandToggleMenuButton(
                            "option " + i, null);
                    button.getActionModel().addActionListener((ActionEvent ae) -> selection.put(ind,
                            button.getActionModel().isSelected()));
                    if (selection.containsKey(i)) {
                        button.getActionModel().setSelected(selection.get(i));
                    }
                    menu.addMenuButton(button);
                    if (i == 3 || i == 7) {
                        menu.addMenuSeparator();
                    }
                }
                menu.setToDismissOnChildClick(false);

                Popup popup = PopupFactory.getSharedInstance().getPopup(statusBar, menu, pt.x,
                        pt.y - menu.getPreferredSize().height);
                PopupPanelManager.defaultManager().addPopup(statusBar, popup, menu);

                PopupListener tracker = new PopupListener() {
                    @Override
                    public void popupShown(PopupEvent event) {
                    }

                    @Override
                    public void popupHidden(PopupEvent event) {
                        if (event.getSource() == menu) {
                            System.out.print("Current selection: ");
                            for (Map.Entry<Integer, Boolean> e : selection.entrySet()) {
                                if (e.getValue()) {
                                    System.out.print(e.getKey() + " ");
                                }
                            }
                            System.out.println();
                        }
                        PopupPanelManager.defaultManager().removePopupListener(this);
                    }
                };
                PopupPanelManager.defaultManager().addPopupListener(tracker);
            }
        });

        this.add(statusBar, BorderLayout.SOUTH);
    }

    public static class RulerPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g.create();
            NeonCortex.installDesktopHints(g2d, this);
            g2d.setColor(Color.gray);

            if (getComponentOrientation().isLeftToRight()) {
                // horizontal ruler on top
                int offset = 20;
                for (int i = offset; i < this.getWidth(); i += 10) {
                    if ((i - offset) % 100 == 0)
                        continue;
                    g2d.drawLine(i, 9, i, 11);
                }
                for (int i = offset + 50; i < this.getWidth(); i += 100) {
                    g2d.drawLine(i, 7, i, 13);
                }
                for (int i = offset; i < this.getWidth(); i += 100) {
                    int c = ((i - offset) / 100) % 10;
                    g2d.drawString("" + c, i - 2, 15);
                }

                // vertical ruler on left
                for (int i = offset; i < this.getHeight(); i += 10) {
                    if ((i - offset) % 100 == 0)
                        continue;
                    g2d.drawLine(9, i, 11, i);
                }
                for (int i = offset + 50; i < this.getHeight(); i += 100) {
                    g2d.drawLine(7, i, 13, i);
                }
                for (int i = offset; i < this.getHeight(); i += 100) {
                    int c = ((i - offset) / 100) % 10;
                    g2d.drawString("" + c, 8, i + 4);
                }
            } else {
                // horizontal ruler on top
                int offset = 20;
                for (int i = getWidth() - offset; i > 0; i -= 10) {
                    if ((getWidth() - offset - i) % 100 == 0)
                        continue;
                    g2d.drawLine(i, 9, i, 11);
                }
                for (int i = getWidth() - offset - 50; i > 0; i -= 100) {
                    g2d.drawLine(i, 7, i, 13);
                }
                for (int i = getWidth() - offset; i > 0; i -= 100) {
                    int c = ((getWidth() - offset - i) / 100) % 10;
                    g2d.drawString("" + c, i - 2, 15);
                }

                // vertical ruler on right
                for (int i = offset; i < this.getHeight(); i += 10) {
                    if ((i - offset) % 100 == 0)
                        continue;
                    g2d.drawLine(getWidth() - 9, i, getWidth() - 11, i);
                }
                for (int i = offset + 50; i < this.getHeight(); i += 100) {
                    g2d.drawLine(getWidth() - 7, i, getWidth() - 13, i);
                }
                for (int i = offset; i < this.getHeight(); i += 100) {
                    int c = ((i - offset) / 100) % 10;
                    g2d.drawString("" + c, getWidth() - 14, i + 4);
                }
            }
            g2d.dispose();
        }
    }
}
