/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.check;

import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior;
import org.pushingpixels.radiance.animation.api.swing.SwingComponentTimeline;
import org.pushingpixels.radiance.demo.theming.main.Check.MyMainTabPreviewPainter;
import org.pushingpixels.radiance.demo.theming.main.RadianceLogo;
import org.pushingpixels.radiance.demo.theming.main.check.svg.error_black_24dp;
import org.pushingpixels.radiance.demo.theming.main.check.svg.help_black_24dp;
import org.pushingpixels.radiance.demo.theming.main.check.svg.info_black_24dp;
import org.pushingpixels.radiance.demo.theming.main.check.svg.vaadin.folder_open;
import org.pushingpixels.radiance.demo.theming.main.check.svg.warning_black_24dp;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceLookAndFeel;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.*;
import org.pushingpixels.radiance.theming.api.icon.RadianceDefaultIconPack;
import org.pushingpixels.radiance.theming.api.painter.preview.DefaultPreviewPainter;
import org.pushingpixels.radiance.theming.api.skin.NebulaBrickWallSkin;
import org.pushingpixels.radiance.theming.extras.api.RadianceExtrasSlices.TabOverviewKind;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Locale;

/**
 * Factory for creating the global control panels (for global settings and testing the dialogs).
 *
 * @author Kirill Grouchnikov
 */
public class ControlPanelFactory {
    /**
     * Instance of a simple dialog.
     */
    private static SimpleDialog simpleDialog;

    /**
     * Instance of a disposable dialog.
     */
    private static JDialog disposableDialog;

    /**
     * Returns the main control panel.
     *
     * @param mainFrame             The main test frame.
     * @param mainTabbedPane        The main tabbed pane.
     * @param mainTabPreviewPainter The preview painter of the main tabbed pane.
     * @param toolbar               The toolbar of the main test frame.
     * @return The main control panel.
     */
    public static JPanel getMainControlPanel(final JFrame mainFrame,
            final JTabbedPane mainTabbedPane, final MyMainTabPreviewPainter mainTabPreviewPainter,
            final JToolBar toolbar) {
        TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
                "right:pref, 4dlu, fill:pref:grow", 2, 24).padding(new EmptyBorder(8, 0, 4, 0));

        builder.appendSeparator("Title pane settings");

        final JCheckBox markAsModified = new JCheckBox("Marked modified");
        markAsModified.setSelected(false);
        markAsModified.addActionListener(actionEvent -> RadianceThemingCortex.RootPaneScope
                .setContentsModified(mainFrame.getRootPane(),
                        markAsModified.isSelected() ? Boolean.TRUE : false));
        builder.append("Modified", markAsModified);

        JButton changeTitleButton = new JButton("Change");
        changeTitleButton.addActionListener(actionEvent -> {
            String random = "abcdefghijklmnopqrstuvwxyz ";
            int length = 60 + (int) (150 * Math.random());
            String title = "";
            while (length > 0) {
                title += random.charAt((int) (random.length() * Math.random()));
                length--;
            }
            mainFrame.setTitle(title);
        });
        builder.append("Title string", changeTitleButton);

        final JCheckBox useCustomTitlePaneButtonsProvider = new JCheckBox("Use custom");
        useCustomTitlePaneButtonsProvider.setSelected(false);
        useCustomTitlePaneButtonsProvider.addActionListener(actionEvent -> RadianceThemingCortex.RootPaneScope
                .setTitlePaneButtonsProvider(mainFrame.getRootPane(),
                        useCustomTitlePaneButtonsProvider.isSelected() ?
                                new CustomTitlePaneButtonsProvider() : null));
        builder.append("Buttons provider", useCustomTitlePaneButtonsProvider);

        builder.appendSeparator("Miscellaneous");

        final JCheckBox useConstantThemesOnOptionPanes = new JCheckBox("use constant themes");
        useConstantThemesOnOptionPanes.setSelected(true);
        useConstantThemesOnOptionPanes
                .addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> RadianceThemingCortex.GlobalScope.setUseConstantThemesOnOptionPanes(
                        useConstantThemesOnOptionPanes.isSelected())));
        builder.append("Option pane icons", useConstantThemesOnOptionPanes);

        final JComboBox<String> placementCombo = new JComboBox<>(
                new String[]{"top", "bottom", "left", "right"});
        placementCombo.addActionListener(actionEvent -> {
            String selected = (String) placementCombo.getSelectedItem();
            if ("top".equals(selected))
                mainTabbedPane.setTabPlacement(JTabbedPane.TOP);
            if ("bottom".equals(selected))
                mainTabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
            if ("left".equals(selected))
                mainTabbedPane.setTabPlacement(JTabbedPane.LEFT);
            if ("right".equals(selected))
                mainTabbedPane.setTabPlacement(JTabbedPane.RIGHT);
        });
        builder.append("Placement", placementCombo);

        try {
            final JComboBox<TabOverviewKind> overviewKindCombo = new FlexiComboBox<>(
                    TabOverviewKind.GRID, TabOverviewKind.MENU_CAROUSEL,
                    TabOverviewKind.ROUND_CAROUSEL) {
                @Override
                public String getCaption(TabOverviewKind item) {
                    return item.getName();
                }
            };
            overviewKindCombo.addActionListener(actionEvent -> mainTabPreviewPainter
                    .setTabOverviewKind((TabOverviewKind) overviewKindCombo.getSelectedItem()));

            builder.append("Overview kind", overviewKindCombo);
        } catch (NoClassDefFoundError ncdfe) {
        }

        final JSlider menuGutterFillAlphaSlider = new JSlider(0, 100,
                (int) (100 * RadianceThemingCortex.GlobalScope.getMenuGutterFillAlpha()));
        menuGutterFillAlphaSlider.addChangeListener(changeEvent -> {
            float val = menuGutterFillAlphaSlider.getValue() / 100.0f;
            RadianceThemingCortex.GlobalScope.setMenuGutterFillAlpha(val);
        });
        builder.append("Menu fill alpha", menuGutterFillAlphaSlider);

        final JComboBox<FocusKind> focusKindCombo = new FlexiComboBox<>(FocusKind.values()) {
            @Override
            public String getCaption(FocusKind item) {
                return item.name();
            }
        };
        focusKindCombo.setSelectedItem(FocusKind.ALL_INNER);
        focusKindCombo.addActionListener(actionEvent ->
                RadianceThemingCortex.GlobalScope.setFocusKind((FocusKind) focusKindCombo.getSelectedItem()));
        builder.append("Focus kind", focusKindCombo);

        JButton buttonGlassPane = new JButton("Show");
        buttonGlassPane.addActionListener(actionEvent -> {
            final JPanel glassPane = new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D graphics = (Graphics2D) g;
                    int height = getHeight();
                    int width = getWidth();
                    Composite c = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) 0.4);
                    graphics.setComposite(c);
                    for (int i = 0; i < height; i++) {
                        Color color = (i % 2 == 0) ? new Color(200, 200, 255)
                                : new Color(230, 230, 255);
                        graphics.setColor(color);
                        graphics.drawLine(0, i, width, i);
                    }
                    Composite c2 = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) 1.0);
                    graphics.setComposite(c2);
                }
            };
            glassPane.setOpaque(false);
            glassPane.addMouseListener(new MouseAdapter() {
            });
            glassPane.addKeyListener(new KeyAdapter() {
            });
            mainFrame.setGlassPane(glassPane);
            new Thread(() -> {
                glassPane.setVisible(true);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                glassPane.setVisible(false);
            }).start();
        });
        builder.append("Glass pane", buttonGlassPane);

        builder.appendSeparator("Custom animations");
        final JCheckBox allowFocusLoopAnimations = new JCheckBox("Allow animation");
        allowFocusLoopAnimations.setSelected(RadianceThemingCortex.GlobalScope
                .isAnimationAllowed(AnimationFacet.FOCUS_LOOP_ANIMATION));
        allowFocusLoopAnimations.addActionListener(actionEvent -> {
            if (allowFocusLoopAnimations.isSelected()) {
                RadianceThemingCortex.GlobalScope.allowAnimations(AnimationFacet.FOCUS_LOOP_ANIMATION);
            } else {
                RadianceThemingCortex.GlobalScope.disallowAnimations(AnimationFacet.FOCUS_LOOP_ANIMATION);
            }
        });
        builder.append("Focus loop", allowFocusLoopAnimations);

        final JCheckBox allowGlowIconAnimations = new JCheckBox("Allow animation");
        allowGlowIconAnimations.addActionListener(actionEvent -> {
            if (allowGlowIconAnimations.isSelected()) {
                RadianceThemingCortex.GlobalScope.allowAnimations(AnimationFacet.ICON_GLOW);
            } else {
                RadianceThemingCortex.GlobalScope.disallowAnimations(AnimationFacet.ICON_GLOW);
            }
        });
        builder.append("Icon glow", allowGlowIconAnimations);

        final JCheckBox allowGhostIconAnimations = new JCheckBox("Allow animation");
        allowGhostIconAnimations.addActionListener(actionEvent -> {
            if (allowGhostIconAnimations.isSelected()) {
                RadianceThemingCortex.GlobalScope.allowAnimations(AnimationFacet.GHOSTING_ICON_ROLLOVER);
            } else {
                RadianceThemingCortex.GlobalScope
                        .disallowAnimations(AnimationFacet.GHOSTING_ICON_ROLLOVER);
            }
        });
        builder.append("Icon rollover", allowGhostIconAnimations);

        final JCheckBox allowGhostPressAnimations = new JCheckBox("Allow animation");
        allowGhostPressAnimations.addActionListener(actionEvent -> {
            if (allowGhostPressAnimations.isSelected()) {
                RadianceThemingCortex.GlobalScope.allowAnimations(AnimationFacet.GHOSTING_BUTTON_PRESS);
            } else {
                RadianceThemingCortex.GlobalScope
                        .disallowAnimations(AnimationFacet.GHOSTING_BUTTON_PRESS);
            }
        });
        builder.append("Button press", allowGhostPressAnimations);

        builder.appendSeparator("Toolbar");
        final JCheckBox isToolbarFlat = new JCheckBox("Is flat");

        isToolbarFlat.setSelected(true);
        isToolbarFlat.addActionListener(actionEvent -> {
            RadianceThemingCortex.ComponentOrParentScope.setBackgroundAppearanceStrategy(toolbar,
                    isToolbarFlat.isSelected() ? BackgroundAppearanceStrategy.FLAT : null);
            toolbar.repaint();
        });
        builder.append("Flat", isToolbarFlat);

        builder.appendSeparator("Menu bar");
        final JCheckBox menuSearch = new JCheckBox("Has menu search");
        menuSearch.setSelected(false);
        menuSearch.addActionListener(actionEvent -> RadianceThemingCortex.WindowScope.setWidgetVisible(mainFrame,
                menuSearch.isSelected(), WidgetType.MENU_SEARCH));
        builder.append("Menu search", menuSearch);

        builder.appendSeparator("Icon pack");
        final JCheckBox iconPack = new JCheckBox("Use custom icon pack");
        iconPack.setSelected(false);
        iconPack.addActionListener(actionEvent -> RadianceThemingCortex.GlobalScope.setIconPack(
                iconPack.isSelected() ? new TangoIconPack() : new RadianceDefaultIconPack()));
        builder.append("Icon pack", iconPack);

        JPanel result = builder.build();
        result.setName("Main control panel");
        return result;
    }

    /**
     * Returns the control panel for testing dialogs.
     *
     * @param mainFrame The main test frame.
     * @return Control panel for testing dialogs.
     */
    public static JPanel getDialogControlPanel(final JFrame mainFrame) {
        TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
                "right:pref, 4dlu, fill:pref:grow", 2, 30).padding(new EmptyBorder(8, 0, 4, 0));

        builder.appendSeparator("Core choosers");
        JButton bfo = new JButton("Open dialog", folder_open.of(12, 12));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(bfo,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
        bfo.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(mainFrame);
        }));
        builder.append("File chooser", bfo);

        JButton bfs = new JButton("Save dialog", folder_open.of(12, 12));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(bfs,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
        bfs.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            JFileChooser jfc = new JFileChooser();
            jfc.showSaveDialog(mainFrame);
        }));
        builder.append("", bfs);

        JButton bc = new JButton("Open", folder_open.of(12, 12));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(bc,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
        bc.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            Color color = JColorChooser.showDialog(mainFrame, "Color chooser",
                    new Color(23, 45, 200));
            if (color != null) {
                System.out.println("Chosen " + color.toString());
            }
        }));
        builder.append("Color chooser", bc);

        JButton bcWindow = new JButton("open in window");
        bcWindow.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            final Window window = new Window(mainFrame);
            window.setLayout(new BorderLayout());
            window.add(new JColorChooser());
            window.pack();
            window.setLocationRelativeTo(null);
            window.setVisible(true);
            Timer timerDispose = new Timer(5000, actionEventInner -> window.dispose());
            timerDispose.setRepeats(false);
            timerDispose.start();
        }));
        builder.append("", bcWindow);

        builder.appendSeparator("Button bars");

        final JComboBox<ButtonOrder> buttonBarOrderCombo = new FlexiComboBox<>(ButtonOrder.values()) {
            @Override
            public String getCaption(ButtonOrder item) {
                return item.name();
            }
        };
        buttonBarOrderCombo.setSelectedItem(RadianceThemingCortex.GlobalScope.getButtonBarOrder());
        buttonBarOrderCombo.addActionListener(actionEvent -> RadianceThemingCortex.GlobalScope
                .setButtonBarOrder((ButtonOrder) buttonBarOrderCombo.getSelectedItem()));
        builder.append("Button bar order", buttonBarOrderCombo);

        final JComboBox<HorizontalGravity> buttonBarGravityCombo = new FlexiComboBox<>(
                HorizontalGravity.values()) {
            @Override
            public String getCaption(HorizontalGravity item) {
                return item.name();
            }
        };
        buttonBarGravityCombo.setSelectedItem(RadianceThemingCortex.GlobalScope.getButtonBarGravity());
        buttonBarGravityCombo.addActionListener(actionEvent -> RadianceThemingCortex.GlobalScope
                .setButtonBarGravity((HorizontalGravity) buttonBarGravityCombo.getSelectedItem()));
        builder.append("Button bar gravity", buttonBarGravityCombo);

        JButton bop = new JButton("Show");
        bop.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            JOptionPane pane = new JOptionPane("Sample option pane");
            pane.applyComponentOrientation(
                    ComponentOrientation.getOrientation(Locale.getDefault()));
            JDialog dialog = pane.createDialog(mainFrame, "Sample title");
            dialog.setVisible(true);
            dialog.dispose();
        }));
        builder.append("Plain", bop);

        JButton bopi = new JButton("Show", info_black_24dp.of(16, 16));
        bopi.addActionListener(actionEvent -> SwingUtilities.invokeLater(
                () -> JOptionPane.showMessageDialog(mainFrame, "Sample info message",
                        "Sample title", JOptionPane.INFORMATION_MESSAGE)));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(bopi,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
        builder.append("Info", bopi);

        JButton bope = new JButton("Show", error_black_24dp.of(16, 16));
        bope.addActionListener(actionEvent -> SwingUtilities.invokeLater(
                () -> JOptionPane.showMessageDialog(mainFrame, "Sample error message",
                        "Sample title", JOptionPane.ERROR_MESSAGE)));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(bope,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
        builder.append("Error", bope);

        JButton bopw = new JButton("Show", warning_black_24dp.of(16, 16));
        bopw.addActionListener(actionEvent -> SwingUtilities.invokeLater(
                () -> JOptionPane.showMessageDialog(mainFrame,
                        "Sample warning message", "Sample title", JOptionPane.WARNING_MESSAGE)));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(bopw,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
        builder.append("Warning", bopw);

        JButton bopq = new JButton("Show", help_black_24dp.of(16, 16));
        bopq.addActionListener(actionEvent -> SwingUtilities.invokeLater(
                () -> JOptionPane.showMessageDialog(mainFrame,
                        "Sample question message", "Sample title", JOptionPane.QUESTION_MESSAGE)));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(bopq,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
        builder.append("Question", bopq);

        JButton bopc = new JButton("Show");
        bopc.addActionListener(actionEvent -> SwingUtilities
                .invokeLater(() -> JOptionPane.showOptionDialog(mainFrame, new JPanel(), "Option",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,
                        null)));
        builder.append("Custom", bopc);

        JButton buttonOptionPaneSimpleInput = new JButton("Show");
        buttonOptionPaneSimpleInput.addActionListener(actionEvent ->
                SwingUtilities.invokeLater(() ->
                        JOptionPane.showInputDialog(mainFrame,
                                "Sample Question Message", "Default Answer")));
        builder.append("Simple input", buttonOptionPaneSimpleInput);

        JButton buttonOptionPaneComplexInput = new JButton("Show");
        buttonOptionPaneComplexInput.addActionListener(actionEvent ->
                SwingUtilities.invokeLater(() -> JOptionPane.showInputDialog(
                        mainFrame,
                        "Sample Question Message", "Title Goes Here",
                        JOptionPane.QUESTION_MESSAGE, null,
                        new String[]{"entry1", "entry2", "entry3", "entry4"},
                        "entry1")));
        builder.append("Complex input", buttonOptionPaneComplexInput);

        JButton buttonOptionPaneInternalInput = new JButton("Show");
        buttonOptionPaneInternalInput
                .addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
                    JDialog dialog = new JDialog(mainFrame, "Sample dialog", true);
                    dialog.setSize(400, 300);
                    dialog.setLocationRelativeTo(mainFrame);
                    dialog.setLayout(new BorderLayout());
                    JDesktopPane panel = new JDesktopPane();
                    panel.applyComponentOrientation(
                            ComponentOrientation.getOrientation(Locale.getDefault()));
                    dialog.add(panel, BorderLayout.CENTER);
                    JOptionPane.showInternalInputDialog(panel, "Sample info message",
                            "Sample title", JOptionPane.INFORMATION_MESSAGE);
                    dialog.dispose();
                }));
        builder.append("Internal input", buttonOptionPaneInternalInput);

        builder.appendSeparator("Default buttons");

        JButton openDisposable = new JButton("Open");
        openDisposable.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            if (disposableDialog != null) {
                disposableDialog.setVisible(true);
                return;
            }
            disposableDialog = new JDialog();
            disposableDialog.setTitle("Disposable");

            JTree tree = new JTree();
            JScrollPane jsp = new JScrollPane(tree, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                    JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            RadianceThemingCortex.ComponentOrParentScope.setComponentPreviewPainter(jsp,
                    new DefaultPreviewPainter());

            disposableDialog.setLayout(new BorderLayout());
            disposableDialog.add(jsp, BorderLayout.CENTER);

            disposableDialog.setSize(200, 100);
            disposableDialog.setLocationRelativeTo(null);
            disposableDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            disposableDialog.setVisible(true);
        }));
        builder.append("Disposable dialog", openDisposable);

        JButton launchFrameDialogWithIcon = new JButton("Open");
        launchFrameDialogWithIcon.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            SimpleDialog sd = new SimpleDialog();
            if (UIManager.getLookAndFeel() instanceof RadianceLookAndFeel) {
                sd.setIconImage(RadianceLogo.getLogoImage(sd,
                        RadianceThemingCortex.ComponentScope.getCurrentSkin(sd.getRootPane())
                                .getColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE,
                                        ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)));
            }
            sd.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
            sd.setModal(false);
            sd.pack();
            sd.setLocationRelativeTo(null);
            sd.setVisible(true);
            sd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        }));
        builder.append("Dialog with icon", launchFrameDialogWithIcon);

        JButton bd = new JButton("Open");
        bd.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            SimpleDialog sd = new SimpleDialog();
            sd.setModal(false);
            sd.pack();
            sd.setLocationRelativeTo(null);
            sd.setVisible(true);
            simpleDialog = sd;
        }));
        builder.append("Open a dialog", bd);

        JButton bcd = new JButton("Close");
        bcd.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            if (simpleDialog != null) {
                simpleDialog.removeAll();
                simpleDialog.dispose();
                ReferenceQueue<JButton> weakQueue = new ReferenceQueue<>();
                WeakReference<JButton> weakRef = new WeakReference<>(simpleDialog.b1,
                        weakQueue);
                weakRef.enqueue();
                simpleDialog.b1 = null;
                simpleDialog = null;
                System.gc();
                // Wait until the weak reference is on the queue and remove it
                System.out.println("Waiting to remove");
                try {
                    Reference<?> ref = weakQueue.remove();
                    ref.clear();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                    return;
                }
                System.out.println("Removed");
            }
        }));
        builder.append("Close the dialog", bcd);

        JButton buttonDialogCloseOnEsc = new JButton("Show");
        buttonDialogCloseOnEsc
                .addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
                    final JDialog dialog = new JDialog((Frame) null, "Click ESC to dispose");
                    dialog.setSize(200, 200);
                    dialog.setLayout(new BorderLayout());

                    JPanel myContentPane = new JPanel();
                    myContentPane.setLayout(new BorderLayout());
                    dialog.setContentPane(myContentPane);

                    JTabbedPane tabs = new JTabbedPane();
                    JPanel tab1 = new JPanel(new FlowLayout());
                    tab1.add(new JLabel("test"));
                    JTextField tab1TextField = new JTextField("some text");
                    RadianceThemingCortex.ComponentScope.setFlipTextSelectionOnEscape(tab1TextField,
                            true);
                    tab1.add(tab1TextField);
                    tabs.addTab("Foo", tab1);
                    JPanel tab2 = new JPanel(new FlowLayout());
                    tab2.add(new JButton("Test"));
                    tabs.addTab("Bar", tab2);
                    dialog.add(tabs, BorderLayout.CENTER);

                    JLabel instructional = new JLabel("Press Esc to close dialog");
                    RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(instructional,
                            1.0);
                    dialog.add(instructional, BorderLayout.NORTH);

                    // create a looping animation to change the label foreground to draw some attention.
                    SwingComponentTimeline.componentBuilder(instructional)
                            .addPropertyToInterpolate("foreground",
                                    () -> RadianceThemingCortex.ComponentScope.getCurrentSkin(myContentPane)
                                            .getColorScheme(myContentPane, ComponentState.ENABLED).getForegroundColor(),
                                    () -> RadianceThemingCortex.GlobalScope.getCurrentSkin()
                                            .getOptionPaneIconColorScheme(JOptionPane.WARNING_MESSAGE)
                                            .getMidColor())
                            .setDuration(1000)
                            .playLoop(RepeatBehavior.REVERSE);

                    // connect "Esc" key with disposing the dialog
                    String actionName = "VK_ESCAPE";
                    Action action = new AbstractAction(actionName) {
                        public void actionPerformed(ActionEvent e) {
                            dialog.dispose();
                        }
                    };
                    myContentPane.getActionMap().put(actionName, action);
                    myContentPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                            KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0),
                            actionName);

                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);
                }));
        builder.append("Dialog with ESC close", buttonDialogCloseOnEsc);

        JButton buttonDialogUndecorated = new JButton("Show");
        buttonDialogUndecorated
                .addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
                    final JDialog dialog = new JDialog((Frame) null, "");
                    dialog.setSize(200, 200);
                    dialog.setUndecorated(true);
                    dialog.setLayout(new BorderLayout());

                    JPanel myContentPane = new JPanel();
                    myContentPane.setLayout(new BorderLayout());
                    dialog.setContentPane(myContentPane);

                    JLabel instructional = new JLabel("Press Esc to close dialog");
                    RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(instructional,
                            1.0);
                    dialog.add(instructional, BorderLayout.NORTH);

                    // create a looping animation to change the label foreground to draw some attention.
                    SwingComponentTimeline.componentBuilder(instructional)
                            .addPropertyToInterpolate("foreground",
                                    () -> RadianceThemingCortex.ComponentScope.getCurrentSkin(myContentPane)
                                            .getColorScheme(myContentPane, ComponentState.ENABLED).getForegroundColor(),
                                    () -> RadianceThemingCortex.GlobalScope.getCurrentSkin()
                                            .getOptionPaneIconColorScheme(JOptionPane.WARNING_MESSAGE)
                                            .getMidColor())
                            .setDuration(1000)
                            .playLoop(RepeatBehavior.REVERSE);

                    // connect "Esc" key with "System.exit(0)"
                    String actionName = "VK_ESCAPE";
                    Action action = new AbstractAction(actionName) {
                        public void actionPerformed(ActionEvent e) {
                            dialog.dispose();
                        }
                    };
                    myContentPane.getActionMap().put(actionName, action);
                    myContentPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                            KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0),
                            actionName);

                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);
                }));
        builder.append("Undecorated dialog", buttonDialogUndecorated);

        builder.appendSeparator("Miscellaneous");

        JButton customSkinFrame = new JButton("Show");
        customSkinFrame.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            JFrame testFrame = new SampleFrame("Radiance");
            RadianceThemingCortex.RootPaneScope.setSkin(testFrame.getRootPane(),
                    new NebulaBrickWallSkin());
            SwingUtilities.updateComponentTreeUI(testFrame.getRootPane());
            testFrame.setSize(340, 254);
            testFrame.setLocationRelativeTo(mainFrame);
            testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            testFrame.setVisible(true);
        }));
        builder.append("Nebula brick wall frame", customSkinFrame);

        JButton btf = new JButton("Show");
        btf.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            JFrame testFrame = new JFrame("test1");
            testFrame.setSize(262, 100);
            testFrame.setLocationRelativeTo(mainFrame);
            testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            testFrame.setVisible(true);
        }));
        builder.append("Regular frame", btf);

        JButton btfU = new JButton("Show");
        btfU.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(false);
            JDialog.setDefaultLookAndFeelDecorated(false);

            JFrame testFrame = new JFrame("test undecorated");
            // testFrame.setUndecorated(true);

            testFrame.setSize(262, 100);
            testFrame.setLocation(400, 400);
            testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            testFrame.setVisible(true);

            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        }));
        builder.append("Undecorated frame", btfU);

        JButton bcp = new JButton("Open");
        bcp.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            JFrame colorFrame = new JFrame();
            final ColorPanel cp1 = new ColorPanel("default");
            final ColorPanel cp2 = new ColorPanel("green");
            cp2.setBackground(Color.green);
            final ColorPanel cp3 = new ColorPanel("red");
            cp3.setBackground(Color.red);
            final ColorPanel cp4 = new ColorPanel("black");
            cp4.setBackground(Color.black);
            // cp2.setBackground(Color.GREEN);
            colorFrame.setLayout(new LayoutManager() {
                public void addLayoutComponent(String name, Component comp) {
                }

                public void layoutContainer(Container parent) {
                    int h = parent.getHeight() / 2;
                    int w = parent.getWidth() / 2;
                    cp1.setBounds(0, 0, w, h);
                    cp2.setBounds(0, h, w, parent.getHeight() - h);
                    cp3.setBounds(w, 0, w, h + 1);
                    cp4.setBounds(w, h + 1, w, parent.getHeight() - h);
                }

                public Dimension minimumLayoutSize(Container parent) {
                    return preferredLayoutSize(parent);
                }

                public Dimension preferredLayoutSize(Container parent) {
                    return new Dimension(100, 100);
                }

                public void removeLayoutComponent(Component comp) {
                }

            });
            colorFrame.add(cp1);
            colorFrame.add(cp2);
            colorFrame.add(cp3);
            colorFrame.add(cp4);

            colorFrame.setSize(400, 399);
            colorFrame.setLocation(300, 300);
            colorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            colorFrame.setVisible(true);
        }));
        builder.append("Color panels", bcp);

        JButton paneDialog = new JButton("Open");
        paneDialog.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            JDialog dialog = new JDialog(mainFrame, true);
            dialog.setTitle("Test text pane in scroll pane");
            JTextPane textPane = new JTextPane();
            String contents = "";
            for (int i = 0; i < 100; i++)
                contents += "This is sample line " + i + " and a lot of other irrelevant text\n";
            textPane.replaceSelection(contents);

            JScrollPane scroll = new JScrollPane(textPane);
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.add(scroll, BorderLayout.CENTER);

            dialog.setLayout(new BorderLayout());
            dialog.add(panel, BorderLayout.CENTER);
            dialog.setSize(400, 400);
            dialog.setLocation(400, 200);
            dialog.setVisible(true);
        }));
        builder.append("Text pane dialog", paneDialog);

        return builder.build();
    }
}
