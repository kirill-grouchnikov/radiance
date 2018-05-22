/*
 * Copyright 2005-2008 Kirill Grouchnikov, based on work by
 * Sun Microsystems, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.pushingpixels.demo.substance.swingx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.plaf.FontUIResource;

import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXErrorPane;
import org.jdesktop.swingx.JXHeader;
import org.jdesktop.swingx.JXHyperlink;
import org.jdesktop.swingx.JXLoginPane;
import org.jdesktop.swingx.JXMonthView;
import org.jdesktop.swingx.JXStatusBar;
import org.jdesktop.swingx.JXTaskPane;
import org.jdesktop.swingx.JXTaskPaneContainer;
import org.jdesktop.swingx.JXTipOfTheDay;
import org.jdesktop.swingx.JXTitledPanel;
import org.jdesktop.swingx.JXTitledSeparator;
import org.jdesktop.swingx.calendar.DateSelectionModel;
import org.jdesktop.swingx.error.ErrorInfo;
import org.jdesktop.swingx.tips.TipLoader;
import org.jdesktop.swingx.tips.TipOfTheDayModel;
import org.pushingpixels.demo.substance.main.RadianceLogo;
import org.pushingpixels.demo.substance.main.check.SampleMenuFactory;
import org.pushingpixels.demo.substance.main.check.statusbar.FontSizePanel;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.font.FontPolicy;
import org.pushingpixels.substance.api.font.FontSet;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;
import org.pushingpixels.substance.swingx.SubstanceSwingxPlugin;

public class TestSwingXFrame extends JFrame {
    private static class WrapperFontSet implements FontSet {
        private int extra;

        private FontSet delegate;

        public WrapperFontSet(FontSet delegate, int extra) {
            super();
            this.delegate = delegate;
            this.extra = extra;
        }

        private FontUIResource getWrappedFont(FontUIResource systemFont) {
            return new FontUIResource(systemFont.getFontName(), systemFont.getStyle(),
                    systemFont.getSize() + this.extra);
        }

        public FontUIResource getControlFont() {
            return this.getWrappedFont(this.delegate.getControlFont());
        }

        public FontUIResource getMenuFont() {
            return this.getWrappedFont(this.delegate.getMenuFont());
        }

        public FontUIResource getMessageFont() {
            return this.getWrappedFont(this.delegate.getMessageFont());
        }

        public FontUIResource getSmallFont() {
            return this.getWrappedFont(this.delegate.getSmallFont());
        }

        public FontUIResource getTitleFont() {
            return this.getWrappedFont(this.delegate.getTitleFont());
        }

        public FontUIResource getWindowTitleFont() {
            // FontUIResource f = this.getWrappedFont(this.delegate
            // .getWindowTitleFont());
            // return new FontUIResource(f.deriveFont(Font.BOLD, f.getSize() +
            // 1));
            return this.getWrappedFont(this.delegate.getWindowTitleFont());
        }
    }

    TestSwingXFrame() {
        super("SwingX testing bed");

        this.setIconImage(RadianceLogo
                .getLogoImage(SubstanceCortex.ComponentScope.getCurrentSkin(this.getRootPane())
                        .getColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE,
                                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)));
        SubstanceCortex.GlobalScope.registerSkinChangeListener(
                () -> SwingUtilities.invokeLater(() -> setIconImage(RadianceLogo.getLogoImage(
                        SubstanceCortex.ComponentScope.getCurrentSkin(getRootPane()).getColorScheme(
                                DecorationAreaType.PRIMARY_TITLE_PANE,
                                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)))));

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 4);
        Date[] unselDates = new Date[3];
        unselDates[0] = cal.getTime();
        cal.add(Calendar.DAY_OF_MONTH, 3);
        unselDates[1] = cal.getTime();
        cal.add(Calendar.DAY_OF_MONTH, 3);
        unselDates[2] = cal.getTime();
        long[] flaggedDates = new long[3];
        cal.add(Calendar.DAY_OF_MONTH, 1);
        flaggedDates[0] = cal.getTimeInMillis();
        cal.add(Calendar.DAY_OF_MONTH, 2);
        flaggedDates[1] = cal.getTimeInMillis();
        cal.add(Calendar.DAY_OF_MONTH, 2);
        flaggedDates[2] = cal.getTimeInMillis();

        JXTaskPaneContainer taskPaneContainer = new JXTaskPaneContainer() {
            @Override
            public boolean getScrollableTracksViewportWidth() {
                return false;
            }
        };

        JXTaskPane taskPane = new JXTaskPane();
        taskPane.setTitle("JXMonthView and JXDatePicker");
        taskPaneContainer.add(taskPane);
        JXMonthView monthView = new JXMonthView();
        // monthView.setFlaggedDates(flaggedDates);
        // monthView.setUnselectableDates(unselDates);
        monthView.setShowingLeadingDays(true);
        monthView.setShowingTrailingDays(true);
        monthView.setShowingWeekNumber(true);
        monthView.setSelectionMode(DateSelectionModel.SelectionMode.MULTIPLE_INTERVAL_SELECTION);
        monthView.setDayForeground(Calendar.SUNDAY, Color.blue);
        monthView.setTraversable(true);
        // monthView.setFlaggedDates(unselDates);
        taskPane.add(monthView);

        JXDatePicker datePicker = new JXDatePicker();
        datePicker.getMonthView().setUnselectableDates(unselDates);
        taskPane.add(datePicker);

        taskPane = new JXTaskPane();
        taskPane.setTitle("JXHyperlink and JXTitledSeparator");
        taskPane.setSpecial(true);
        taskPaneContainer.add(taskPane);
        JXHyperlink link = new JXHyperlink();
        link.setText("My first link");
        taskPane.add(link);
        taskPane.add(new JXTitledSeparator("Titled separator"));

        JXTaskPane taskPaneVarious = new JXTaskPane();
        taskPaneVarious.setTitle("Various SwingX components");
        taskPaneContainer.add(taskPaneVarious);
        JButton headerButton = new JButton("Test JXHeader");
        headerButton.addActionListener((ActionEvent e) -> {
            JDialog dialog = new JDialog(TestSwingXFrame.this, "JXHeader test", true);
            JXHeader header = new JXHeader();
            header.setTitle("Sample header title");
            header.setDescription("Sample long long\nlong header description");
            dialog.add(header, BorderLayout.NORTH);
            dialog.add(new JPanel() {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(400, 200);
                }
            }, BorderLayout.CENTER);
            dialog.pack();
            dialog.setLocationRelativeTo(TestSwingXFrame.this);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        });
        taskPaneVarious.add(headerButton);

        JButton showLoginDialog = new JButton("Show JXLoginDialog");
        showLoginDialog.addActionListener((ActionEvent e) -> {
            JXLoginPane loginPane = new JXLoginPane();
            loginPane.setMessage("Sample login message");
            loginPane.setBannerText("Sample banner");
            JXLoginPane.showLoginDialog(TestSwingXFrame.this, loginPane);
        });
        taskPaneVarious.add(showLoginDialog);

        JButton showTopOfTheDayDialog = new JButton("Show JXTipOfTheDay");
        showTopOfTheDayDialog.addActionListener((ActionEvent e) -> {
            Properties tips = new Properties();
            try {
                tips.load(TestSwingXFrame.class.getClassLoader().getResourceAsStream(
                        "org/pushingpixels/demo/substance/swingx/tips.properties"));
            } catch (Exception exc) {
            }

            TipOfTheDayModel model = TipLoader.load(tips);
            JXTipOfTheDay totd = new JXTipOfTheDay(model);

            totd.showDialog(TestSwingXFrame.this);
        });
        taskPaneVarious.add(showTopOfTheDayDialog);

        JButton titledPanelButton = new JButton("Test JXTitledPanel");
        titledPanelButton.addActionListener((ActionEvent e) -> {
            JFrame dialog = new JFrame("JXTitledPanel test");
            dialog.add(new JXTitledPanel("Left panel"), BorderLayout.WEST);
            JPanel center = new JPanel(new GridLayout(2, 1, 0, 0));
            center.add(new JXTitledPanel("Top panel"));
            center.add(new JXTitledPanel("Bottom panel"));
            dialog.add(center, BorderLayout.CENTER);
            dialog.setSize(600, 300);
            dialog.setLocationRelativeTo(TestSwingXFrame.this);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        });
        taskPaneVarious.add(titledPanelButton);

        JButton errorPaneButton = new JButton("Test JXErrorPane");
        errorPaneButton.addActionListener((ActionEvent e) -> {
            try {
                new URL("some wrong URL string");
            } catch (MalformedURLException murle) {
                String msg = "<html>An error just happened. Possible reasons:"
                        + "<ol><li>Development team hoped nobody would notice."
                        + "<li>The testers missed this scenario. Wait, we don't have testers."
                        + "<li>Didn't your momma teach you not to use Linux?" + "</ol>"
                        + "In any case, it's all open source so it's all good. Fix it yourself.";
                String details = "<html>Web resources should begin with \"http://\""
                        + " and cannot contain any spaces. Below are a few"
                        + " more guidelines.<ul></ul></html>";
                JXErrorPane.showDialog(TestSwingXFrame.this, new ErrorInfo(
                        "Reformatting the disk complete", msg, details, null, murle, null, null));
            }
        });
        taskPaneVarious.add(errorPaneButton);

        taskPaneVarious.add(new JTextField("Field 1"));

        JScrollPane scrollPane = new JScrollPane(taskPaneContainer);
        scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.add(scrollPane, BorderLayout.WEST);

        final JTabbedPane mainPane = new JTabbedPane();
        mainPane.addTab("JXTable", new TablePanel());
        mainPane.addTab("JXTreeTable", new TreeTablePanel());
        this.add(mainPane, BorderLayout.CENTER);

        JXStatusBar statusBar = new JXStatusBar();
        this.add(statusBar, BorderLayout.SOUTH);

        JXStatusBar.Constraint c2 = new JXStatusBar.Constraint(
                JXStatusBar.Constraint.ResizeBehavior.FILL);
        final JLabel tabLabel = new JLabel("");
        statusBar.add(tabLabel, c2);
        mainPane.getModel().addChangeListener((ChangeEvent e) -> {
            int selectedIndex = mainPane.getSelectedIndex();
            if (selectedIndex < 0)
                tabLabel.setText("No selected tab");
            else
                tabLabel.setText("Tab " + mainPane.getTitleAt(selectedIndex) + " selected");
        });

        final JSlider fontSizeSlider = new JSlider(-3, 6, 0);
        fontSizeSlider.setFocusable(false);
        fontSizeSlider.setOpaque(false);
        fontSizeSlider.setToolTipText(
                "Controls the global font set size. Resets Substance as the current LAF.");
        fontSizeSlider.addChangeListener((ChangeEvent e) -> {
            // if the value is adjusting - ignore. This is done
            // to make CPU usage better.
            if (!fontSizeSlider.getModel().getValueIsAdjusting()) {
                final int newValue = fontSizeSlider.getValue();
                SwingUtilities.invokeLater(() -> {
                    SubstanceCortex.GlobalScope.setFontPolicy(null);
                    final FontSet substanceCoreFontSet = SubstanceCortex.GlobalScope.getFontPolicy()
                            .getFontSet("Substance", null);
                    FontPolicy newFontPolicy = new FontPolicy() {
                        public FontSet getFontSet(String lafName, UIDefaults table) {
                            return new WrapperFontSet(substanceCoreFontSet, newValue);
                        }
                    };

                    try {
                        TestSwingXFrame.this
                                .setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                        SubstanceCortex.GlobalScope.setFontPolicy(newFontPolicy);
                        TestSwingXFrame.this.setCursor(Cursor.getDefaultCursor());
                    } catch (Exception exc) {
                        exc.printStackTrace();
                    }
                });
            }
        });

        JPanel fontSizePanel = FontSizePanel.getPanel();
        JXStatusBar.Constraint fontSizePanelConstraints = new JXStatusBar.Constraint();
        fontSizePanelConstraints.setFixedWidth(350);
        statusBar.add(fontSizePanel, fontSizePanelConstraints);

        this.setSize(1080, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // LAF changing
        JMenuBar jmb = new JMenuBar();
        jmb.add(SampleMenuFactory.getLookAndFeelMenu(this));
        this.setJMenuBar(jmb);

        JToolBar toolbar = new JToolBar();
        JXDatePicker datePickerToolBar = new JXDatePicker();
        toolbar.add(datePickerToolBar);

        this.add(toolbar, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JDialog.setDefaultLookAndFeelDecorated(true);
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceSwingxPlugin());

        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new TestSwingXFrame().setVisible(true);
        });
    }
}
