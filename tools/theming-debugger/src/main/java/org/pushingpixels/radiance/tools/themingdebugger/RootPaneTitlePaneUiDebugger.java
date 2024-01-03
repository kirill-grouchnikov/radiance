/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.tools.themingdebugger;

import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.FocusKind;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeTransform;
import org.pushingpixels.radiance.theming.api.text.RadianceTextArea;
import org.pushingpixels.radiance.theming.internal.utils.LazyResettableHashMap;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.widget.animation.effects.GhostPaintingUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.Dialog.ModalityType;
import java.awt.event.*;

/**
 * To use this in your app, call
 * {@link RadianceThemingCortex.GlobalScope#registerWidget(String, Class, boolean)}
 */
public class RootPaneTitlePaneUiDebugger extends RadianceThemingWidget<JRootPane> {
    private MouseListener radianceDebugUiListener;

    private JComponent titlePane;

    private static void dump(Component comp, int level) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < level; i++) {
            sb.append("  ");
        }
        sb.append(comp.toString());
        System.out.println(sb);
        if (comp instanceof Container) {
            Container cont = (Container) comp;
            for (int i = 0; i < cont.getComponentCount(); i++) {
                dump(cont.getComponent(i), level + 1);
            }
        }
    }

    @Override
    public void installUI() {
        SwingUtilities.invokeLater(() -> {
            if (!(UIManager.getLookAndFeel() instanceof RadianceLookAndFeel)) {
                return;
            }

            titlePane = RadianceCoreUtilities.getTitlePaneComponent(
                    SwingUtilities.getWindowAncestor(jcomp));
            if (titlePane != null) {
                radianceDebugUiListener = new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        process(e);
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        process(e);
                    }

                    private void process(MouseEvent e) {
                        if (!e.isPopupTrigger()) {
                            return;
                        }

                        JPopupMenu popup = new JPopupMenu();
                        // Mark the popup menu to be HEADER decoration area type for visual
                        // consistency with the popup menu displayed on clicking the application
                        // icon (from RadianceTitlePane.RadianceMenuBar)
                        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(popup,
                                RadianceThemingSlices.DecorationAreaType.HEADER);

                        JMenu cbMenu = new JMenu("Color blindness");
                        JMenuItem protanopiaCurrent = new JMenuItem("Protanopia current");
                        protanopiaCurrent.addActionListener(new SkinChanger(
                                ProtanopiaColorScheme::new,
                                "Protanopia current"));
                        cbMenu.add(protanopiaCurrent);
                        JMenuItem deuteranopiaCurrent = new JMenuItem("Deuteranopia current");
                        deuteranopiaCurrent.addActionListener(new SkinChanger(
                                DeuteranopiaColorScheme::new,
                                "Deuteranopia current"));
                        cbMenu.add(deuteranopiaCurrent);
                        JMenuItem tritanopiaCurrent = new JMenuItem("Tritanopia current");
                        tritanopiaCurrent.addActionListener(new SkinChanger(
                                TritanopiaColorScheme::new,
                                "Tritanopia current"));
                        cbMenu.add(tritanopiaCurrent);

                        cbMenu.addSeparator();

                        JMenuItem restoreOriginal = new JMenuItem("Restore original");
                        if (RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(null,
                                ComponentState.ENABLED) instanceof ColorBlindColorScheme) {
                            restoreOriginal.addActionListener(
                                    new SkinChanger(scheme -> {
                                        if (scheme instanceof ColorBlindColorScheme) {
                                            return ((ColorBlindColorScheme) scheme).getOrigScheme();
                                        }
                                        return scheme;
                                    }, "Current"));
                        } else {
                            restoreOriginal.setEnabled(false);
                        }
                        cbMenu.add(restoreOriginal);

                        popup.add(cbMenu);

                        JMenu animMenu = new JMenu("Animation rate");
                        JMenuItem debugNone = new JMenuItem("None");
                        debugNone.addActionListener(new AnimationChanger(0));
                        animMenu.add(debugNone);
                        JMenuItem debugAnim = new JMenuItem("Debug rate (extra slow)");
                        debugAnim.addActionListener(new AnimationChanger(5000));
                        animMenu.add(debugAnim);
                        JMenuItem debugAnimFast = new JMenuItem("Debug rate (faster)");
                        debugAnimFast.addActionListener(new AnimationChanger(2500));
                        animMenu.add(debugAnimFast);
                        JMenuItem debugSlow = new JMenuItem("Slow rate");
                        debugSlow.addActionListener(new AnimationChanger(1000));
                        animMenu.add(debugSlow);
                        JMenuItem debugRegular = new JMenuItem("Regular rate");
                        debugRegular.addActionListener(new AnimationChanger(250));
                        animMenu.add(debugRegular);
                        JMenuItem debugFast = new JMenuItem("Fast rate");
                        debugFast.addActionListener(new AnimationChanger(100));
                        animMenu.add(debugFast);

                        popup.add(animMenu);

                        JMenu focusMenu = new JMenu("Focus kind");
                        for (FocusKind fKind : FocusKind.values()) {
                            JMenuItem focusMenuItem = new JMenuItem(fKind.name().toLowerCase());
                            focusMenuItem.addActionListener(new FocusKindChanger(fKind));
                            focusMenu.add(focusMenuItem);
                        }
                        popup.add(focusMenu);

                        JMenuItem dumpHierarchy = new JMenuItem("Dump hierarchy");
                        dumpHierarchy.addActionListener((ActionEvent event) -> dump(jcomp, 0));
                        popup.add(dumpHierarchy);

                        final JCheckBoxMenuItem ltrChange = new JCheckBoxMenuItem(
                                "Is left-to-right");
                        ltrChange.setSelected(jcomp.getComponentOrientation().isLeftToRight());
                        ltrChange.addActionListener((ActionEvent event) -> SwingUtilities
                                .invokeLater(() -> jcomp.applyComponentOrientation(
                                        ltrChange.isSelected() ? ComponentOrientation.LEFT_TO_RIGHT
                                                : ComponentOrientation.RIGHT_TO_LEFT)));
                        popup.add(ltrChange);

                        JMenu iconFiltering = new JMenu("Icon filtering");

                        JMenuItem defaultIconFiltering = new JMenuItem("Default");
                        defaultIconFiltering.addActionListener((ActionEvent event) ->
                                SwingUtilities.invokeLater(() -> {
                                    RadianceThemingCortex.GlobalScope.setIconFilterStrategies(
                                            RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                                            RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME);
                                    jcomp.repaint();
                                }));
                        iconFiltering.add(defaultIconFiltering);

                        JMenuItem mutedIconFiltering = new JMenuItem("Muted");
                        mutedIconFiltering.addActionListener((ActionEvent event) ->
                                SwingUtilities.invokeLater(() -> {
                                    RadianceThemingCortex.GlobalScope.setIconFilterStrategies(
                                            RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME,
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME);
                                    jcomp.repaint();
                                }));
                        iconFiltering.add(mutedIconFiltering);

                        JMenuItem textInactiveIconFiltering = new JMenuItem("Text inactive");
                        textInactiveIconFiltering.addActionListener((ActionEvent event) ->
                                SwingUtilities.invokeLater(() -> {
                                    RadianceThemingCortex.GlobalScope.setIconFilterStrategies(
                                            RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
                                    jcomp.repaint();
                                }));
                        iconFiltering.add(textInactiveIconFiltering);

                        JMenuItem textAlwaysIconFiltering = new JMenuItem("Text always");
                        textAlwaysIconFiltering.addActionListener((ActionEvent event) ->
                                SwingUtilities.invokeLater(() -> {
                                    RadianceThemingCortex.GlobalScope.setIconFilterStrategies(
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                            RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
                                    jcomp.repaint();
                                }));
                        iconFiltering.add(textAlwaysIconFiltering);

                        popup.add(iconFiltering);

                        final JCheckBoxMenuItem ghostDebugMode = new JCheckBoxMenuItem(
                                "Ghost debug mode");
                        ghostDebugMode.addActionListener(
                                (ActionEvent event) -> SwingUtilities.invokeLater(() -> {
                                    ghostDebugMode.setEnabled(false);
                                    GhostPaintingUtils.MAX_ICON_GHOSTING_ALPHA = 0.8f;
                                    GhostPaintingUtils.MIN_ICON_GHOSTING_ALPHA = 0.6f;
                                    GhostPaintingUtils.MAX_PRESS_GHOSTING_ALPHA = 0.8f;
                                    GhostPaintingUtils.MIN_PRESS_GHOSTING_ALPHA = 0.6f;
                                    GhostPaintingUtils.DECAY_FACTOR = 0.7f;
                                }));
                        popup.add(ghostDebugMode);

                        JMenuItem showCacheStats = new JMenuItem("Show cache stats");
                        showCacheStats.addActionListener(
                                (ActionEvent event) -> SwingUtilities.invokeLater(() -> {
                                    final JTextArea textArea = new RadianceTextArea();
                                    java.util.List<String> stats = LazyResettableHashMap.getStats();
                                    if (stats != null) {
                                        for (String stat : stats) {
                                            textArea.append(stat + "\n");
                                        }
                                    }
                                    final JDialog dialog = new JDialog(
                                            SwingUtilities.getWindowAncestor(jcomp),
                                            ModalityType.APPLICATION_MODAL);
                                    dialog.setTitle("Radiance cache stats");
                                    dialog.setLayout(new BorderLayout());
                                    dialog.add(new JScrollPane(textArea), BorderLayout.CENTER);
                                    JButton dismiss = new JButton("Dismiss");
                                    dismiss.addActionListener(actionEvent -> dialog.dispose());
                                    JButton copyToClipboard = new JButton("Copy to clipboard");
                                    copyToClipboard.addActionListener(actionEvent -> {
                                        textArea.selectAll();
                                        TransferHandler.getCopyAction()
                                                .actionPerformed(new ActionEvent(textArea,
                                                        ActionEvent.ACTION_PERFORMED, "Copy"));
                                    });
                                    JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
                                    controls.add(copyToClipboard);
                                    controls.add(dismiss);
                                    dialog.add(controls, BorderLayout.SOUTH);

                                    dialog.setSize(500, 400);
                                    dialog.setLocationRelativeTo(jcomp.getRootPane());
                                    dialog.setVisible(true);
                                }));
                        popup.add(showCacheStats);

                        popup.show(titlePane, e.getX(), e.getY());
                    }
                };
                titlePane.addMouseListener(radianceDebugUiListener);
            }
        });
    }

    @Override
    public void uninstallUI() {
        if (this.radianceDebugUiListener != null) {
            titlePane.removeMouseListener(this.radianceDebugUiListener);
            this.radianceDebugUiListener = null;
        }
    }

    private static class SkinChanger implements ActionListener {
        private ColorSchemeTransform transform;

        private String name;

        private SkinChanger(ColorSchemeTransform transform, String name) {
            super();
            this.transform = transform;
            this.name = name;
        }

        public void actionPerformed(ActionEvent e) {
            SwingUtilities.invokeLater(() -> {
                RadianceSkin newSkin = RadianceThemingCortex.GlobalScope.getCurrentSkin().
                        transform(transform, name);
                RadianceThemingCortex.GlobalScope.setSkin(newSkin);
            });
        }
    }

    private static class AnimationChanger implements ActionListener {
        private long newAnimationDuration;

        private AnimationChanger(long newAnimationDuration) {
            super();
            this.newAnimationDuration = newAnimationDuration;
        }

        public void actionPerformed(ActionEvent e) {
            SwingUtilities.invokeLater(
                    () -> RadianceThemingCortex.GlobalScope.setTimelineDuration(newAnimationDuration));
        }
    }

    private static class FocusKindChanger implements ActionListener {
        private FocusKind newFocusKind;

        private FocusKindChanger(FocusKind newFocusKind) {
            super();
            this.newFocusKind = newFocusKind;
        }

        public void actionPerformed(ActionEvent e) {
            SwingUtilities.invokeLater(
                    () -> RadianceThemingCortex.GlobalScope.setFocusKind(newFocusKind));
        }
    }
}
