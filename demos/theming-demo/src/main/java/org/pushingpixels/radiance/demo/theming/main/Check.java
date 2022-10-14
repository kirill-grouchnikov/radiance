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
package org.pushingpixels.radiance.demo.theming.main;

import org.pushingpixels.radiance.common.api.font.FontSet;
import org.pushingpixels.radiance.demo.theming.main.check.*;
import org.pushingpixels.radiance.demo.theming.main.check.selector.*;
import org.pushingpixels.radiance.demo.theming.main.check.svg.tango.*;
import org.pushingpixels.radiance.demo.theming.main.check.svg.vaadin.*;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceLookAndFeel;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.Side;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.TabCloseKind;
import org.pushingpixels.radiance.theming.api.combo.WidestComboPopupPrototype;
import org.pushingpixels.radiance.theming.api.skin.RadianceGeminiLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.SkinInfo;
import org.pushingpixels.radiance.theming.api.tabbed.TabCloseCallback;
import org.pushingpixels.radiance.theming.api.tabbed.TabCloseListener;
import org.pushingpixels.radiance.theming.api.tabbed.VetoableMultipleTabCloseListener;
import org.pushingpixels.radiance.theming.api.tabbed.VetoableTabCloseListener;
import org.pushingpixels.radiance.theming.extras.api.RadianceExtrasSlices.TabOverviewKind;
import org.pushingpixels.radiance.theming.extras.api.RadianceThemingExtrasCortex;
import org.pushingpixels.radiance.theming.extras.api.tabbed.DefaultTabPreviewPainter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;

public class Check extends JFrame {
    private JTabbedPane jtp;

    private MyMainTabPreviewPainter mainTabPreviewPainter;

    private FakeAccordion.FakeAccordionPanel currentSpecificTaskPane;

    private FakeAccordion.FakeAccordionPanel mainTaskPane;

    private FakeAccordion accordion;

    private JToolBar toolbar;

    public Check() {
        super("Radiance test application");

        if (UIManager.getLookAndFeel() instanceof RadianceLookAndFeel) {
            setIconImage(RadianceLogo.getLogoImage(this,
                    RadianceThemingCortex.ComponentScope.getCurrentSkin(this.getRootPane())
                            .getColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE,
                                    ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)));
        }
        RadianceThemingCortex.GlobalScope.registerSkinChangeListener(() -> SwingUtilities.invokeLater(
                () -> setIconImage(RadianceLogo.getLogoImage(Check.this,
                        RadianceThemingCortex.ComponentScope.getCurrentSkin(Check.this.getRootPane())
                                .getColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE,
                                        ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)))));

        setLayout(new BorderLayout());

        jtp = new JTabbedPane();
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(jtp,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);

        mainTabPreviewPainter = new MyMainTabPreviewPainter();
        RadianceThemingExtrasCortex.ComponentScope.setTabPanePreviewPainter(jtp, mainTabPreviewPainter);
        jtp.getModel().addChangeListener(new TabSwitchListener());

        final JPanel contentPanel = new JPanel(new BorderLayout());
        toolbar = getToolbar(22, true);
        contentPanel.add(toolbar, BorderLayout.NORTH);

        if (UIManager.getLookAndFeel() instanceof RadianceLookAndFeel) {
            JPanel statusBar = getStatusBar();
            this.add(statusBar, BorderLayout.SOUTH);
        }

        this.accordion = new FakeAccordion();

        JPanel mainControlPanel = ControlPanelFactory.getMainControlPanel(this, jtp,
                mainTabPreviewPainter, toolbar);
        mainTaskPane = this.accordion.addPanel("General settings",
                cog.of(12, 12), mainControlPanel);
        mainTaskPane.setCollapsed(true);

        JPanel dialogControlPanel = ControlPanelFactory.getDialogControlPanel(this);
        FakeAccordion.FakeAccordionPanel dialogTaskPane =
                this.accordion.addPanel("Frames & Dialogs", modal_list.of(12, 12),
                        dialogControlPanel);
        dialogTaskPane.setCollapsed(true);

        currentSpecificTaskPane = null;

        final JScrollPane scrollPane = new JScrollPane(accordion,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        ComponentOrParentChainScope.setDecorationType(scrollPane, DecorationAreaType.CONTROL_PANE);

        JPanel mainPanel = new JPanel();
        mainPanel.add(scrollPane);
        mainPanel.add(jtp);
        mainPanel.setLayout(new LayoutManager() {
            public void addLayoutComponent(String name, Component comp) {
            }

            public Dimension minimumLayoutSize(Container parent) {
                Dimension min1 = scrollPane.getMinimumSize();
                Dimension min2 = jtp.getMinimumSize();
                return new Dimension(min1.width + min2.width, min1.height + min2.height);
            }

            public void layoutContainer(Container parent) {
                // give 30% width to task pane container and
                // 70% width to the tabbed pane with controls.
                int width = parent.getWidth();
                int height = parent.getHeight();
                scrollPane.setBounds(0, 0, (int) (0.3 * width), height);
                jtp.setBounds((int) (0.3 * width), 0, width - (int) (0.3 * width), height);
            }

            public Dimension preferredLayoutSize(Container parent) {
                Dimension pref1 = scrollPane.getPreferredSize();
                Dimension pref2 = jtp.getPreferredSize();
                return new Dimension(pref1.width + pref2.width, pref1.height + pref2.height);
            }

            public void removeLayoutComponent(Component comp) {
            }
        });
        contentPanel.add(mainPanel, BorderLayout.CENTER);

        this.add(contentPanel, BorderLayout.CENTER);

        setPreferredSize(new Dimension(400, 400));
        this.setSize(getPreferredSize());
        setMinimumSize(getPreferredSize());

        ButtonsPanel buttonsPanel = new ButtonsPanel();
        jtp.addTab("Buttons", button.of(12, 12), buttonsPanel);
        getRootPane().setDefaultButton(buttonsPanel.defaultButton);

        jtp.addTab("Combo box", combobox.of(12, 12), new CombosPanel());

        jtp.addTab("Scroll pane", browser.of(12, 12), new ScrollPanel());

        TabCloseCallback closeCallback = new TabCloseCallback() {
            public TabCloseKind onAreaClick(JTabbedPane tabbedPane, int tabIndex,
                    MouseEvent mouseEvent) {
                if (mouseEvent.getButton() != MouseEvent.BUTTON3)
                    return TabCloseKind.NONE;
                if (mouseEvent.isShiftDown()) {
                    return TabCloseKind.ALL;
                }
                return TabCloseKind.THIS;
            }

            public TabCloseKind onCloseButtonClick(JTabbedPane tabbedPane, int tabIndex,
                    MouseEvent mouseEvent) {
                if (mouseEvent.isAltDown()) {
                    return TabCloseKind.ALL_BUT_THIS;
                }
                if (mouseEvent.isShiftDown()) {
                    return TabCloseKind.ALL;
                }
                return TabCloseKind.THIS;
            }

            public String getAreaTooltip(JTabbedPane tabbedPane, int tabIndex) {
                return null;
            }

            public String getCloseButtonTooltip(JTabbedPane tabbedPane, int tabIndex) {
                StringBuffer result = new StringBuffer();
                result.append("<html><body>");
                result.append(
                        "Mouse click closes <b>" + tabbedPane.getTitleAt(tabIndex) + "</b> tab");
                result.append("<br><b>Alt</b>-Mouse click closes all tabs but <b>"
                        + tabbedPane.getTitleAt(tabIndex) + "</b> tab");
                result.append("<br><b>Shift</b>-Mouse click closes all tabs");
                result.append("</body></html>");
                return result.toString();
            }
        };

        TabPanel tp = new TabPanel();
        RadianceThemingCortex.ComponentScope.setTabCloseCallback(tp.jtp, closeCallback);
        jtp.addTab("Tabs", tabs.of(12, 12), tp);

        jtp.addTab("Split", split_h.of(12, 12), new SplitPanel());

        jtp.addTab("Desktop", user_card.of(12, 12), new DesktopPanel());

        jtp.addTab("Text fields", text_input.of(12, 12), new TextFieldsPanel());

        jtp.addTab("Table", table.of(12, 12), new TablePanel());

        try {
            jtp.addTab("List", lines.of(12, 12), new ListPanel());
        } catch (NoClassDefFoundError ncdfe) {
        }

        jtp.addTab("Slider", slider.of(12, 12), new SliderPanel());

        jtp.addTab("Progress bar", progressbar.of(12, 12), new ProgressBarPanel());

        jtp.addTab("Spinner", spinner.of(12, 12), new SpinnerPanel());

        jtp.addTab("Tree", file_tree.of(12, 12), new TreePanel());

        jtp.addTab("File tree", file_tree.of(12, 12), new FileTreePanel());

        jtp.addTab("Cards", grid_big_o.of(12, 12), new CardPanel());

        JPanel verticalButtonPanel = new JPanel();
        verticalButtonPanel.setLayout(new GridLayout(1, 3));
        verticalButtonPanel.add(new JButton("Vert button 1"));
        verticalButtonPanel.add(new JButton("Vert button 2"));
        JPanel smallVerticalButtonPanel = new JPanel();
        smallVerticalButtonPanel.setLayout(new GridLayout(4, 4));
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                JButton vertButton = new JButton("vert");
                vertButton.setToolTipText("Vertical button " + row + ":" + col);
                smallVerticalButtonPanel.add(vertButton);
            }
        }
        verticalButtonPanel.add(smallVerticalButtonPanel);
        jtp.addTab("V-Buttons", grid_h.of(12, 12), verticalButtonPanel);

        jtp.addTab("Colored", globe_wire.of(12, 12), new ColoredControlsPanel());

        jtp.addTab("Colorized", globe.of(12, 12), new ColorizedControlsPanel());

        jtp.addTab("Cells", grid_small.of(12, 12), new CellsPanel());

        jtp.addTab("Sizes", plus.of(12, 12), new SizesPanel());

        jtp.addTab("H-Align", align_left.of(12, 12), new HAlignmentPanel());

        jtp.addTab("V-Align", bar_chart.of(12, 12), new VAlignmentPanel());

        // sample menu bar
        JMenuBar jmb = new JMenuBar();
        if (UIManager.getLookAndFeel() instanceof RadianceLookAndFeel) {
            jmb.add(SampleMenuFactory.getSkinMenu());
            jmb.add(SampleMenuFactory.getTransformMenu());
        }
        JMenu coloredMenu = new JMenu("Colors");
        coloredMenu.setMnemonic('0');
        JMenuItem coloredMI = new JMenuItem("Italic red");
        coloredMI.setFont(coloredMI.getFont().deriveFont(Font.ITALIC));
        coloredMI.setForeground(Color.red);
        coloredMenu.add(coloredMI);
        JRadioButtonMenuItem coloredRBMI = new JRadioButtonMenuItem("Bold green");
        coloredRBMI.setFont(coloredRBMI.getFont().deriveFont(Font.BOLD));
        coloredRBMI.setForeground(Color.green);
        coloredMenu.add(coloredRBMI);
        JCheckBoxMenuItem coloredCBMI = new JCheckBoxMenuItem("Big blue");
        coloredCBMI.setFont(coloredCBMI.getFont().deriveFont(32f));
        coloredCBMI.setForeground(Color.blue);
        coloredMenu.add(coloredCBMI);
        JMenu coloredM = new JMenu("Always big magenta");
        coloredM.setForeground(Color.magenta);
        coloredM.setFont(coloredM.getFont().deriveFont(24f));
        coloredMenu.add(coloredM);
        jmb.add(coloredMenu);

        JMenu testMenu = SampleMenuFactory.getTestMenu();
        jmb.add(testMenu);

        JMenu jm4 = new JMenu("Disabled");
        jm4.add(new JMenuItem("text4"));
        jm4.setMnemonic('4');
        jmb.add(jm4);
        jm4.setEnabled(false);

        // LAF changing
        jmb.add(SampleMenuFactory.getLookAndFeelMenu(this));
        setJMenuBar(jmb);

        TabCloseCallback closeCallbackMain = new TabCloseCallback() {
            public TabCloseKind onAreaClick(JTabbedPane tabbedPane, int tabIndex,
                    MouseEvent mouseEvent) {
                if (mouseEvent.getButton() != MouseEvent.BUTTON2)
                    return TabCloseKind.NONE;
                if (mouseEvent.isShiftDown()) {
                    return TabCloseKind.ALL;
                }
                return TabCloseKind.THIS;
            }

            public TabCloseKind onCloseButtonClick(JTabbedPane tabbedPane, int tabIndex,
                    MouseEvent mouseEvent) {
                if (mouseEvent.isAltDown()) {
                    return TabCloseKind.ALL_BUT_THIS;
                }
                if (mouseEvent.isShiftDown()) {
                    return TabCloseKind.ALL;
                }
                return TabCloseKind.THIS;
            }

            public String getAreaTooltip(JTabbedPane tabbedPane, int tabIndex) {
                return null;
            }

            public String getCloseButtonTooltip(JTabbedPane tabbedPane, int tabIndex) {
                StringBuffer result = new StringBuffer();
                result.append("<html><body>");
                result.append(
                        "Mouse click closes <b>" + tabbedPane.getTitleAt(tabIndex) + "</b> tab");
                result.append("<br><b>Alt</b>-Mouse click closes all tabs but <b>"
                        + tabbedPane.getTitleAt(tabIndex) + "</b> tab");
                result.append("<br><b>Shift</b>-Mouse click closes all tabs");
                result.append("</body></html>");
                return result.toString();
            }
        };

        RadianceThemingCortex.ComponentScope.setTabCloseCallback(jtp, closeCallbackMain);
        RadianceThemingCortex.GlobalScope.registerTabCloseChangeListener(new TabCloseListener() {
            public void tabClosed(JTabbedPane tabbedPane, Component tabComponent) {
                System.out.println("Closed tab");
            }

            public void tabClosing(JTabbedPane tabbedPane, Component tabComponent) {
                System.out.println("Closing tab");
            }
        });

        RadianceThemingCortex.ComponentScope.registerTabCloseChangeListener(jtp,
                new VetoableTabCloseListener() {
                    public void tabClosed(JTabbedPane tabbedPane, Component tabComponent) {
                        System.out.println("Closed tab - specific");
                    }

                    public void tabClosing(JTabbedPane tabbedPane, Component tabComponent) {
                        System.out.println("Closing tab - specific");
                    }

                    public boolean vetoTabClosing(JTabbedPane tabbedPane, Component tabComponent) {
                        int userCloseAnswer = JOptionPane.showConfirmDialog(Check.this,
                                "Are you sure you want to close '"
                                        + tabbedPane.getTitleAt(
                                        tabbedPane.indexOfComponent(tabComponent))
                                        + "' tab?",
                                "Confirm dialog", JOptionPane.YES_NO_OPTION);
                        return (userCloseAnswer == JOptionPane.NO_OPTION);
                    }
                });

        RadianceThemingCortex.ComponentScope.registerTabCloseChangeListener(jtp,
                new VetoableMultipleTabCloseListener() {
                    public void tabsClosed(JTabbedPane tabbedPane, Set<Component> tabComponents) {
                        System.out.println("Closed " + tabComponents.size() + " tabs - specific");
                    }

                    public void tabsClosing(JTabbedPane tabbedPane, Set<Component> tabComponents) {
                        System.out.println("Closing " + tabComponents.size() + " tabs - specific");
                    }

                    public boolean vetoTabsClosing(JTabbedPane tabbedPane,
                            Set<Component> tabComponents) {
                        int userCloseAnswer = JOptionPane.showConfirmDialog(Check.this,
                                "Are you sure you want to close " + tabComponents.size() + " tabs?",
                                "Confirm dialog", JOptionPane.YES_NO_OPTION);
                        return (userCloseAnswer == JOptionPane.NO_OPTION);
                    }
                });
    }

    private static class DialogFontSet implements FontSet {
        /**
         * The base Radiance font set.
         */
        private FontSet delegate;

        /**
         * Creates a wrapper font set.
         *
         * @param delegate The base Radiance font set.
         */
        public DialogFontSet(FontSet delegate) {
            super();
            this.delegate = delegate;
        }

        /**
         * Returns the wrapped font.
         *
         * @param systemFont Original font.
         * @return Wrapped font.
         */
        private FontUIResource getWrappedFont(FontUIResource systemFont) {
            return new FontUIResource("Dialog", systemFont.getStyle(), systemFont.getSize());
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
            return this.getWrappedFont(this.delegate.getWindowTitleFont());
        }
    }

    private JPanel getStatusBar() {
        JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        statusBar.setBorder(new EmptyBorder(4, 5, 4, 5));

        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(statusBar,
                DecorationAreaType.FOOTER);

        RadianceSkinSelector skinSelector = new RadianceSkinSelector();
        RadianceThemingCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(skinSelector,
                SwingUtilities.NORTH);
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeCallback(skinSelector,
                new WidestComboPopupPrototype<SkinInfo>());
        skinSelector.setToolTipText("Radiance skin");
        statusBar.add(skinSelector);

        RadianceLocaleSelector localeSelector = new RadianceLocaleSelector(true, selected -> {
            LookAndFeel currLaf = UIManager.getLookAndFeel();
            Locale.setDefault(selected);
            Check.this.applyComponentOrientation(
                    ComponentOrientation.getOrientation(Locale.getDefault()));
            if (currLaf instanceof RadianceLookAndFeel) {
                RadianceThemingCortex.GlobalScope.resetLabelBundle();
                if ("CN".equals(selected.getCountry())) {
                    final FontSet currFontSet = RadianceThemingCortex.GlobalScope.getFontPolicy()
                            .getFontSet();
                    RadianceThemingCortex.GlobalScope.setFontPolicy(
                            () -> new DialogFontSet(currFontSet));
                } else {
                    RadianceThemingCortex.GlobalScope.setFontPolicy(null);
                }
            }
            try {
                UIManager.setLookAndFeel(currLaf.getClass().getName());
            } catch (Exception exc) {
            }
            SwingUtilities.updateComponentTreeUI(Check.this);
        });

        RadianceThemingCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(localeSelector,
                SwingUtilities.NORTH);
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeCallback(localeSelector,
                new WidestComboPopupPrototype<RadianceLocaleSelector.LocaleInfo>());
        localeSelector.setToolTipText("Application locale");
        statusBar.add(localeSelector);

        try {
            RadianceFontSelector fontSelector = new RadianceFontSelector();
            RadianceThemingCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(fontSelector,
                    SwingUtilities.NORTH);
            RadianceThemingCortex.ComponentScope.setComboBoxPrototypeCallback(fontSelector,
                    new WidestComboPopupPrototype<RadianceFontSelector.FontInfo>());
            fontSelector.setToolTipText("Radiance font set");
            statusBar.add(fontSelector);
        } catch (Throwable t) {
        }

        RadianceTitlePaneGravitySelector titlePaneGravitySelector = new RadianceTitlePaneGravitySelector();
        RadianceThemingCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(titlePaneGravitySelector,
                SwingUtilities.NORTH);
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeCallback(titlePaneGravitySelector,
                new WidestComboPopupPrototype<RadianceTitlePaneGravitySelector.TitlePaneConfiguration>());
        titlePaneGravitySelector.setToolTipText("Application title pane gravity");
        statusBar.add(titlePaneGravitySelector);

        RadianceIconFilterStrategySelector iconFilterStrategySelector = new RadianceIconFilterStrategySelector();
        RadianceThemingCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(iconFilterStrategySelector,
                SwingUtilities.NORTH);
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeCallback(iconFilterStrategySelector,
                new WidestComboPopupPrototype<RadianceIconFilterStrategySelector.IconFilterStrategyConfiguration>());
        iconFilterStrategySelector.setToolTipText("Icon filter strategies");
        statusBar.add(iconFilterStrategySelector);

        return statusBar;
    }

    public static void main(String[] args) {
        RadianceThemingCortex.GlobalScope.registerWidget(
                "org.pushingpixels.radiance.theming.extras.api.tabbed.TabHoverPreviewWidget",
                JTabbedPane.class, false);
        RadianceThemingCortex.GlobalScope.registerWidget(
                "org.pushingpixels.radiance.theming.extras.api.tabbed.TabOverviewDialogWidget",
                JTabbedPane.class, false);
        RadianceThemingCortex.GlobalScope.registerWidget(
                "org.pushingpixels.radiance.theming.extras.api.tabbed.TabPagerWidget", JTabbedPane.class,
                false);
        SwingUtilities.invokeLater(() -> {
            try {
                System.out.println(" CREATING LAF ");
                long time0 = System.currentTimeMillis();
                LookAndFeel laf = new RadianceGeminiLookAndFeel();
                long time1 = System.currentTimeMillis();
                System.out.println(" LAF CREATED " + (time1 - time0));
                System.out.println(" SETTING LAF ");
                long time2 = System.currentTimeMillis();
                UIManager.setLookAndFeel(laf);
                long time3 = System.currentTimeMillis();
                System.out.println(" LAF SET " + (time3 - time2));
            } catch (Exception e) {
                e.printStackTrace();
            }

            RadianceThemingCortex.GlobalScope.setUseConstantThemesOnOptionPanes(true);
            RadianceThemingCortex.GlobalScope.setTabCloseButtonsVisible(true);
            RadianceThemingCortex.GlobalScope.setExtraWidgetsPresence(true);
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);

            long time2 = System.currentTimeMillis();

            Check c = new Check();
            c.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    super.componentResized(e);
                    ((JFrame) e.getComponent()).getRootPane().repaint();
                }
            });
            c.setPreferredSize(new Dimension(1080, 800));
            c.setMinimumSize(new Dimension(150, 100));
            c.pack();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            // center the frame in the physical screen
            c.setLocation((d.width - c.getWidth()) / 2, (d.height - c.getHeight()) / 2);

            c.setVisible(true);
            c.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            long time3 = System.currentTimeMillis();
            System.out.println("App " + (time3 - time2));
        });
    }

    private static void configureToolbarButton(AbstractButton button, boolean useMutedIcons) {
        if (useMutedIcons) {
            RadianceThemingCortex.ComponentScope.setIconFilterStrategies(
                    button,
                    RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME,
                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME);
        }
    }

    public static JToolBar getToolbar(int size, boolean hasStrings) {
        return getToolbar(size, hasStrings, false);
    }

    public static JToolBar getToolbar(int size, boolean hasStrings, boolean useMutedIcons) {
        JToolBar toolBar = new JToolBar();

        JButton buttonCut = new JButton(hasStrings ? "cut" : null, edit_cut.of(size, size));
        RadianceThemingCortex.ComponentOrParentScope.setButtonIgnoreMinimumSize(buttonCut, true);
        configureToolbarButton(buttonCut, useMutedIcons);
        toolBar.add(buttonCut);

        JButton buttonCopy = new JButton(hasStrings ? "copy" : null, edit_copy.of(size, size));
        RadianceThemingCortex.ComponentOrParentScope.setButtonIgnoreMinimumSize(buttonCopy, true);
        configureToolbarButton(buttonCopy, useMutedIcons);
        buttonCopy.setEnabled(false);
        toolBar.add(buttonCopy);

        JToggleButton buttonPaste = new JToggleButton(edit_paste.of(size, size));
        buttonPaste.setSelected(true);
        buttonPaste.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                JPopupMenu pastePopup = new JPopupMenu();
                pastePopup.add(new JMenuItem("sub 1", computer.of(16, 16)));
                pastePopup.add(new JMenuItem("sub 2", system_search.of(16, 16)));
                pastePopup.add(new JMenuItem("sub 3", help_browser.of(16, 16)));
                pastePopup.show(buttonPaste, 0, buttonPaste.getHeight());
            }
        });
        configureToolbarButton(buttonPaste, useMutedIcons);
        toolBar.add(buttonPaste);

        JButton buttonSelectAll = new JButton(edit_select_all.of(size, size));
        configureToolbarButton(buttonSelectAll, useMutedIcons);
        toolBar.add(buttonSelectAll);

        JButton buttonDelete = new JButton(edit_delete.of(size, size));
        configureToolbarButton(buttonDelete, useMutedIcons);
        toolBar.add(buttonDelete);

        toolBar.addSeparator();

        // add an inner toolbar to check the painting of toolbar
        // gradient and drop shadows under different skins.
        JToolBar innerToolbar = new JToolBar(JToolBar.HORIZONTAL);
        innerToolbar.setFloatable(false);

        JToggleButton buttonFormatCenter = new JToggleButton(format_justify_center.of(size, size));
        RadianceThemingCortex.ComponentScope.setToolbarButtonCornerRadius(buttonFormatCenter, 5.0f);
        configureToolbarButton(buttonFormatCenter, useMutedIcons);
        innerToolbar.add(buttonFormatCenter);

        JToggleButton buttonFormatLeft = new JToggleButton(format_justify_left.of(size, size));
        configureToolbarButton(buttonFormatLeft, useMutedIcons);
        innerToolbar.add(buttonFormatLeft);

        JToggleButton buttonFormatRight = new JToggleButton(format_justify_right.of(size, size));
        configureToolbarButton(buttonFormatRight, useMutedIcons);
        innerToolbar.add(buttonFormatRight);

        JToggleButton buttonFormatFill = new JToggleButton(format_justify_fill.of(size, size));
        RadianceThemingCortex.ComponentScope.setToolbarButtonCornerRadius(buttonFormatFill, 0.0f);
        configureToolbarButton(buttonFormatFill, useMutedIcons);
        innerToolbar.add(buttonFormatFill);

        toolBar.add(innerToolbar);
        toolBar.addSeparator();

        if (size > 20) {
            JToolBar innerToolbar2 = new JToolBar(JToolBar.HORIZONTAL);
            innerToolbar2.setFloatable(false);

            JPanel innerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
            innerToolbar2.add(innerPanel, BorderLayout.CENTER);

            final JToggleButton buttonStyleBold = new JToggleButton(
                    format_text_bold.of(size, size));
            Set<Side> rightSide = EnumSet.of(Side.RIGHT);
            RadianceThemingCortex.ComponentScope.setButtonOpenSides(buttonStyleBold, rightSide);
            RadianceThemingCortex.ComponentScope.setToolbarButtonCornerRadius(buttonStyleBold, 3.0f);
            configureToolbarButton(buttonStyleBold, useMutedIcons);

            final JToggleButton buttonStyleItalic = new JToggleButton(
                    format_text_italic.of(size, size));
            RadianceThemingCortex.ComponentScope.setToolbarButtonCornerRadius(buttonStyleItalic, 0.0f);
            RadianceThemingCortex.ComponentScope.setButtonOpenSides(buttonStyleItalic, rightSide);
            configureToolbarButton(buttonStyleItalic, useMutedIcons);

            final JToggleButton buttonStyleUnderline = new JToggleButton(
                    format_text_underline.of(size, size));
            RadianceThemingCortex.ComponentScope.setToolbarButtonCornerRadius(buttonStyleUnderline, 0.0f);
            RadianceThemingCortex.ComponentScope.setButtonOpenSides(buttonStyleUnderline, rightSide);
            configureToolbarButton(buttonStyleUnderline, useMutedIcons);

            final JToggleButton buttonStyleStrikethrough = new JToggleButton(
                    format_text_strikethrough.of(size, size));
            RadianceThemingCortex.ComponentScope.setButtonOpenSides(buttonStyleStrikethrough,
                    EnumSet.of(Side.LEFT));
            RadianceThemingCortex.ComponentScope.setToolbarButtonCornerRadius(buttonStyleStrikethrough,
                    3.0f);
            configureToolbarButton(buttonStyleStrikethrough, useMutedIcons);

            buttonStyleBold.setSelected(true);

            innerPanel.add(buttonStyleBold);
            innerPanel.add(buttonStyleItalic);
            innerPanel.add(buttonStyleUnderline);
            innerPanel.add(buttonStyleStrikethrough);

            toolBar.add(innerToolbar2);
        }

        toolBar.add(Box.createGlue());

        JButton buttonExit = new JButton(process_stop.of(size, size));
        buttonExit.setToolTipText("Closes the test application");
        buttonExit.addActionListener(actionEvent -> System.exit(0));
        configureToolbarButton(buttonExit, useMutedIcons);
        toolBar.add(buttonExit);

        return toolBar;
    }

    public void setSpecificTaskPane(JPanel contents, String title, Icon icon) {
        if (this.currentSpecificTaskPane != null) {
            this.accordion.removeLastPanel();
        }

        this.currentSpecificTaskPane = this.accordion.addPanel(title, icon, contents);
        SwingUtilities.updateComponentTreeUI(contents);
    }

    public void clearSpecificTaskPane() {
        if (this.currentSpecificTaskPane != null) {
            this.accordion.removeLastPanel();
        }
        this.currentSpecificTaskPane = null;
    }

    public class TabSwitchListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            Component selected = jtp.getSelectedComponent();
            if (selected instanceof Deferrable) {
                Deferrable deferrable = (Deferrable) selected;
                if (!deferrable.isInitialized())
                    deferrable.initialize();
            }

            if (selected instanceof Controllable) {
                JPanel controlPanel = ((Controllable) selected).getControlPanel();
                if (controlPanel == null)
                    clearSpecificTaskPane();
                else
                    setSpecificTaskPane(controlPanel, jtp.getTitleAt(jtp.getSelectedIndex()),
                            jtp.getIconAt(jtp.getSelectedIndex()));
            } else {
                clearSpecificTaskPane();
            }
        }
    }

    public static class MyMainTabPreviewPainter extends DefaultTabPreviewPainter {
        protected TabOverviewKind tabOverviewKind;

        public void setTabOverviewKind(TabOverviewKind tabOverviewKind) {
            this.tabOverviewKind = tabOverviewKind;
        }

        @Override
        public TabOverviewKind getOverviewKind(JTabbedPane tabPane) {
            if (tabOverviewKind == null) {
                return super.getOverviewKind(tabPane);
            }
            return tabOverviewKind;
        }
    }
}
