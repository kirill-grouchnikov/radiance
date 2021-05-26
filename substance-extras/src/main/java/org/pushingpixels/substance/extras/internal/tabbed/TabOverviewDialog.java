/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.extras.internal.tabbed;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.extras.api.SubstanceExtrasSlices.TabOverviewKind;
import org.pushingpixels.substance.extras.api.tabbed.TabPreviewPainter;
import org.pushingpixels.substance.extras.internal.contrib.blogofbug.swing.components.*;
import org.pushingpixels.substance.extras.internal.tabbed.TabPreviewThread.TabPreviewInfo;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.utils.*;
import org.pushingpixels.trident.api.Timeline;
import org.pushingpixels.trident.api.Timeline.TimelineState;
import org.pushingpixels.trident.api.swing.EventDispatchThreadTimelineCallbackAdapter;
import org.pushingpixels.trident.api.swing.SwingRepaintCallback;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.beans.*;
import java.text.MessageFormat;

/**
 * Tab overview dialog.
 *
 * @author Kirill Grouchnikov
 */
public class TabOverviewDialog extends JDialog {
    /**
     * The associated tabbed pane.
     */
    protected JTabbedPane tabPane;

    /**
     * The associated preview callback.
     */
    protected TabPreviewThread.TabPreviewCallback previewCallback;

    /**
     * Listener on LAF switches.
     */
    protected PropertyChangeListener lafSwitchListener;

    /**
     * Handles mouse events on the tab overview dialog (such as highlighting the currently
     * rolled-over tab preview, closing the overview when a tab preview is clicked, tooltips etc.)
     *
     * @author Kirill Grouchnikov
     */
    protected class TabPreviewMouseHandler extends MouseAdapter {
        /**
         * Tab index.
         */
        private int index;

        /**
         * Tab preview control.
         */
        private JComponent previewControl;

        /**
         * If <code>true</code>, the preview uses double click to select the tab and dismiss the tab
         * overview dialog.
         */
        private boolean useDoubleClick;

        /**
         * If <code>true</code>, the tab preview controls have rollover effects on borders.
         */
        private boolean hasRolloverBorderEffect;

        /**
         * Creates the mouse handler for a single tab preview control.
         *
         * @param index                   Tab index.
         * @param previewControl          Tab preview control.
         * @param hasRolloverBorderEffect If <code>true</code>, the preview uses double click to
         *                                select the tab and
         *                                dismiss the tab overview dialog.
         * @param useDoubleClick          If <code>true</code>, the tab preview controls have
         *                                rollover effects on
         *                                borders.
         */
        public TabPreviewMouseHandler(int index, JComponent previewControl,
                boolean hasRolloverBorderEffect, boolean useDoubleClick) {
            this.index = index;
            this.previewControl = previewControl;
            this.useDoubleClick = useDoubleClick;
            this.hasRolloverBorderEffect = hasRolloverBorderEffect;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (this.useDoubleClick) {
                if (e.getClickCount() < 2)
                    return;
            }

            SwingUtilities.invokeLater(() -> {
                TabOverviewDialog.this.dispose();
                TabOverviewDialog.this.tabPane.setSelectedIndex(TabPreviewMouseHandler.this.index);
            });
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (!this.hasRolloverBorderEffect)
                return;
            boolean isSelected = (TabOverviewDialog.this.tabPane.getSelectedIndex() == this.index);
            Border innerBorder = isSelected ? new LineBorder(Color.blue, 2)
                    : new LineBorder(Color.black, 1);
            this.previewControl.setBorder(innerBorder);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!this.hasRolloverBorderEffect)
                return;
            boolean isSelected = (TabOverviewDialog.this.tabPane.getSelectedIndex() == this.index);
            Border innerBorder = isSelected ? new LineBorder(Color.black, 2)
                    : new LineBorder(Color.black, 1);
            this.previewControl.setBorder(innerBorder);
        }
    }

    /**
     * Tab round carousel overview panel. Contains a round carousel of tab preview widgets. The
     * widgets are created in a separate thread ( {@link TabPreviewThread}) and offered to the tab
     * overview dialog via the registered implementation of
     * {@link TabPreviewThread.TabPreviewCallback}. This way the application stays interactive while
     * the tab overview dialog is being populated.
     *
     * @author Kirill Grouchnikov
     */
    protected class TabRoundCarouselOverviewPanel extends JPanel {
        /**
         * Tab preview controls.
         */
        protected ReflectedImageLabel[] previewControls;

        /**
         * Width of a single tab preview control.
         */
        protected int pWidth;

        /**
         * Height of a single tab preview control.
         */
        protected int pHeight;

        /**
         * Associated carousel.
         */
        protected JCarosel carosel;

        /**
         * Creates a tab overview panel.
         *
         * @param dialogWidth  The width of the parent dialog.
         * @param dialogHeight The height of the parent dialog.
         */
        public TabRoundCarouselOverviewPanel(final int dialogWidth, final int dialogHeight) {
            // int tabCount = TabOverviewDialog.this.tabPane.getTabCount();

            // this.previewControls = new HashSet<Component>();
            TabPreviewThread.TabPreviewCallback previewCallback =
                    new TabPreviewThread.TabPreviewCallback() {
                        @Override
                        public void start(JTabbedPane tabPane, int tabCount,
                                TabPreviewInfo tabPreviewInfo) {
                            // Check if need to reallocate the preview controls.
                            boolean isSame = (previewControls != null)
                                    && (previewControls.length == tabCount);
                            if (isSame)
                                return;

                            if (previewControls != null) {
                                for (int i = 0; i < previewControls.length; i++) {
                                    carosel.remove(previewControls[i]);
                                }
                            }

                            double coef = Math.min(3.5, tabCount / 1.5);
                            coef = Math.max(coef, 4.5);
                            pWidth = (int) (dialogWidth / coef);
                            pHeight = (int) (dialogHeight / coef);

                            tabPreviewInfo.setPreviewWidth(pWidth - 4);
                            tabPreviewInfo.setPreviewHeight(pHeight - 4);

                            previewControls = new ReflectedImageLabel[tabCount];
                            TabPreviewPainter tpp = TabPreviewUtilities
                                    .getTabPreviewPainter(TabOverviewDialog.this.tabPane);
                            for (int i = 0; i < tabCount; i++) {
                                BufferedImage placeHolder = new BufferedImage(pWidth, pHeight,
                                        BufferedImage.TYPE_INT_ARGB);
                                Graphics2D g2d = (Graphics2D) placeHolder.getGraphics();
                                g2d.setColor(UIManager.getColor("Label.background"));
                                g2d.fillRect(0, 0, pWidth, pHeight);
                                ReflectedImageLabel ril = (ReflectedImageLabel) carosel.add(
                                        placeHolder,
                                        tabPane.getTitleAt(i));
                                ril.setForeground(UIManager.getColor("Label.foreground"));
                                ril.setBackground(UIManager.getColor("Label.background"));
                                // TabPreviewControl previewControl = new
                                // TabPreviewControl(
                                // TabOverviewDialog.this.tabPane, i);
                                ril.setPreferredSize(new Dimension(pWidth, pHeight));
                                // fix for issue 177 in Substance (disallowing
                                // selection
                                // of disabled tabs).
                                if (tpp.isSensitiveToEvents(TabOverviewDialog.this.tabPane, i)) {
                                    ril.addMouseListener(
                                            new TabPreviewMouseHandler(i, ril, false, true));
                                    ril.setToolTipText(TabPreviewUtilities.getLabelBundle()
                                            .getString("TabbedPane.overviewWidgetTooltip"));
                                }
                                previewControls[i] = ril;
                                // carosel.add(previewControl);
                            }
                            carosel.bringToFront(previewControls[tabPane.getSelectedIndex()]);
                            // System.err.println("Added " + previewControls.length
                            // + " labels");
                            // doLayout();
                            // for (int i = 0; i < tabCount; i++) {
                            // previewControls[i].revalidate();
                            // }
                            // repaint();
                        }

                        @Override
                        public void offer(JTabbedPane tabPane, int tabIndex,
                                BufferedImage componentSnap) {
                            int width = componentSnap.getWidth() + 4;
                            int height = componentSnap.getHeight() + 4;
                            BufferedImage result = new BufferedImage(width, height,
                                    BufferedImage.TYPE_INT_ARGB);
                            Graphics2D g2d = (Graphics2D) result.getGraphics();
                            g2d.setColor(UIManager.getColor("Label.background"));
                            g2d.fillRect(0, 0, width, height);
                            g2d.setColor(UIManager.getColor("Label.foreground"));
                            g2d.drawRect(0, 0, width - 1, height - 1);
                            g2d.drawImage(componentSnap, 2, 2, null);

                            Icon tabIcon = tabPane.getIconAt(tabIndex);
                            if (tabIcon != null) {
                                tabIcon.paintIcon(tabPane, g2d, 2, 2);
                            }

                            // Component caroselComponent = carosel.add(result, tabPane
                            // .getTitleAt(tabIndex));
                            // caroselComponent.setForeground(UIManager
                            // .getColor("Label.foreground"));

                            // System.err.println("Setting image on " + tabIndex);
                            previewControls[tabIndex].setRichImage(result);
                            // System.err.println("Set image on " + tabIndex);
                            previewControls[tabIndex].repaint();
                            // previewControls.add(caroselComponent);
                            // TabRoundCarouselOverviewPanel.this.previewControls[tabIndex]
                            // .setPreviewImage(componentSnap);
                        }
                    };

            this.carosel = new JCarosel();
            this.carosel.setDepthBasedAlpha(true);
            // // carosel.setBackground(Color.BLACK, Color.DARK_GRAY);
            // carosel
            // .add(
            // TabOverviewDialog.class
            // .getResource(
            // "/contrib/com/blogofbug/examples/images/Acknowledgements.png")
            // .toString(), "You Rock", 128, 128);
            // carosel.add(TabOverviewDialog.class.getResource(
            // "/contrib/com/blogofbug/examples/images/Dock.png")
            // .toString(), "Docks Rock", 128, 128);
            // carosel.add(TabOverviewDialog.class.getResource(
            // "/contrib/com/blogofbug/examples/images/Cascade.png")
            // .toString(), "Cascade Icon", 128, 128);
            // carosel.add(TabOverviewDialog.class.getResource(
            // "/contrib/com/blogofbug/examples/images/Quit.png")
            // .toString(), "Quit Bugging", 128, 128);
            this.setLayout(new BorderLayout());
            this.add(carosel, BorderLayout.CENTER);

            TabPreviewInfo previewInfo = new TabPreviewInfo();
            previewInfo.tabPane = TabOverviewDialog.this.tabPane;
            previewInfo.previewCallback = previewCallback;
            // previewInfo.previewWidth = this.pWidth - 4;
            // previewInfo.previewHeight = this.pHeight - 20;
            previewInfo.toPreviewAllTabs = true;
            previewInfo.initiator = TabOverviewDialog.this;

            TabPreviewThread.getInstance().queueTabPreviewRequest(previewInfo);
        }
    }

    /**
     * Tab menu carousel overview panel. Contains a menu carousel of tab preview widgets. The
     * widgets are created in a separate thread ( {@link TabPreviewThread}) and offered to the tab
     * overview dialog via the registered implementation of
     * {@link TabPreviewThread.TabPreviewCallback}. This way the application stays interactive while
     * the tab overview dialog is being populated.
     *
     * @author Kirill Grouchnikov
     */
    protected class TabMenuCarouselOverviewPanel extends JPanel {
        /**
         * Tab preview controls.
         */
        protected ReflectedImageLabel[] previewControls;

        /**
         * Width of a single tab preview control.
         */
        protected int pWidth;

        /**
         * Height of a single tab preview control.
         */
        protected int pHeight;

        /**
         * The associated carousel menu.
         */
        protected JCarouselMenu caroselMenu;

        /**
         * Cell renderer for the carosel menu. Employs a little trick to provide LAF-consistent
         * painting of the cells.
         *
         * @author Kirill Grouchnikov
         */
        protected class MenuCarouselListCellRenderer extends JLabel implements ListCellRenderer<JCarouselMenu.MenuItem> {
            /**
             * The cell renderer from the currently installed LAF.
             */
            protected ListCellRenderer<Object> lafDefaultCellRenderer;

            /**
             * Creates the cell renderer for the carosel menu.
             *
             * @param lafDefaultCellRenderer The cell renderer from the currently installed LAF.
             */
            public MenuCarouselListCellRenderer(ListCellRenderer<Object> lafDefaultCellRenderer) {
                this.lafDefaultCellRenderer = lafDefaultCellRenderer;
            }

            /**
             * Sets up the component for stamping
             */
            @Override
            public Component getListCellRendererComponent(JList<? extends JCarouselMenu.MenuItem> list,
                    JCarouselMenu.MenuItem value, int index, boolean isSelected, boolean cellHasFocus) {
                Component result = this.lafDefaultCellRenderer.getListCellRendererComponent(list,
                        value.getLabel(), index, isSelected, cellHasFocus);

                if (result instanceof JComponent) {
                    JComponent jc = (JComponent) result;
                    jc.setBorder(new EmptyBorder(5, 5, 5, 5));
                    jc.setFont(super.getFont().deriveFont(Font.BOLD, 14.0f));
                }

                return result;
            }
        }

        /**
         * Creates a tab overview panel.
         *
         * @param dialogWidth  The width of the parent dialog.
         * @param dialogHeight The height of the parent dialog.
         */
        public TabMenuCarouselOverviewPanel(final int dialogWidth, final int dialogHeight) {
            // int tabCount = TabOverviewDialog.this.tabPane.getTabCount();

            // this.previewControls = new HashSet<Component>();
            TabPreviewThread.TabPreviewCallback previewCallback =
                    new TabPreviewThread.TabPreviewCallback() {
                        @Override
                        public void start(JTabbedPane tabPane, int tabCount,
                                TabPreviewInfo tabPreviewInfo) {
                            // Check if need to reallocate the preview controls.
                            boolean isSame = (previewControls != null)
                                    && (previewControls.length == tabCount);
                            if (isSame)
                                return;

                            if (previewControls != null) {
                                for (int i = 0; i < previewControls.length; i++) {
                                    caroselMenu.remove(previewControls[i]);
                                }
                            }

                            double coef = Math.min(2.8, tabCount / 1.8);
                            coef = Math.max(2.5, coef);
                            pWidth = (int) (dialogWidth / coef);
                            pHeight = (int) (dialogHeight / coef);

                            tabPreviewInfo.setPreviewWidth(pWidth - 4);
                            tabPreviewInfo.setPreviewHeight(pHeight - 4);

                            previewControls = new ReflectedImageLabel[tabCount];
                            TabPreviewPainter tpp = TabPreviewUtilities
                                    .getTabPreviewPainter(TabOverviewDialog.this.tabPane);
                            for (int i = 0; i < tabCount; i++) {
                                BufferedImage placeHolder = new BufferedImage(pWidth, pHeight,
                                        BufferedImage.TYPE_INT_ARGB);
                                Graphics2D g2d = (Graphics2D) placeHolder.getGraphics();
                                g2d.setColor(UIManager.getColor("Label.background"));
                                g2d.fillRect(0, 0, pWidth, pHeight);
                                ReflectedImageLabel ril = (ReflectedImageLabel) caroselMenu.add(
                                        placeHolder,
                                        tabPane.getTitleAt(i));
                                ril.setForeground(UIManager.getColor("Label.foreground"));
                                ril.setBackground(UIManager.getColor("Label.background"));
                                // TabPreviewControl previewControl = new
                                // TabPreviewControl(
                                // TabOverviewDialog.this.tabPane, i);
                                ril.setPreferredSize(new Dimension(pWidth, pHeight));
                                // fix for issue 177 in Substance (disallowing
                                // selection
                                // of disabled tabs).
                                if (tpp.isSensitiveToEvents(TabOverviewDialog.this.tabPane, i)) {
                                    ril.addMouseListener(
                                            new TabPreviewMouseHandler(i, ril, false, true));
                                    ril.setToolTipText(TabPreviewUtilities.getLabelBundle()
                                            .getString("TabbedPane.overviewWidgetTooltip"));
                                }
                                previewControls[i] = ril;
                                // carosel.add(previewControl);
                            }
                            caroselMenu.setSelectedIndex(tabPane.getSelectedIndex());
                            // System.err.println("Added " + previewControls.length
                            // + " labels");
                            // doLayout();
                            // for (int i = 0; i < tabCount; i++) {
                            // previewControls[i].revalidate();
                            // }
                            // repaint();
                        }

                        @Override
                        public void offer(JTabbedPane tabPane, int tabIndex,
                                BufferedImage componentSnap) {
                            int width = componentSnap.getWidth() + 4;
                            int height = componentSnap.getHeight() + 4;
                            BufferedImage result = new BufferedImage(width, height,
                                    BufferedImage.TYPE_INT_ARGB);
                            Graphics2D g2d = (Graphics2D) result.getGraphics();
                            g2d.setColor(UIManager.getColor("Label.background"));
                            g2d.fillRect(0, 0, width, height);
                            g2d.setColor(UIManager.getColor("Label.foreground"));
                            g2d.drawRect(0, 0, width - 1, height - 1);
                            g2d.drawImage(componentSnap, 2, 2, null);

                            Icon tabIcon = tabPane.getIconAt(tabIndex);
                            if (tabIcon != null) {
                                tabIcon.paintIcon(tabPane, g2d, 2, 2);
                            }

                            previewControls[tabIndex].setRichImage(result);
                            previewControls[tabIndex].repaint();
                        }
                    };

            this.caroselMenu = new JCarouselMenu(null);
            JList<Object> someList = new JList<>();
            ListCellRenderer<Object> lcr = someList.getCellRenderer();
            this.caroselMenu.setCellRenderer(new MenuCarouselListCellRenderer(lcr));
            this.caroselMenu.setMenuScrollColor(UIManager.getColor("Panel.background"));
            this.caroselMenu.setUpDownColor(UIManager.getColor("Label.foreground"));

            int controlFontSize = SubstanceSizeUtils.getControlFontSize();
            double scale = NeonCortex.getScaleFactor(this);
            SubstanceColorScheme colorScheme = SubstanceColorSchemeUtilities
                    .getColorScheme(this.caroselMenu, ComponentState.DEFAULT);
            this.caroselMenu.setUpDownIcons(
                    SubstanceImageCreator.getArrowIcon(scale, controlFontSize,
                            SwingConstants.NORTH, colorScheme),
                    SubstanceImageCreator.getArrowIcon(scale, controlFontSize,
                            SwingConstants.SOUTH, colorScheme));

            this.setLayout(new BorderLayout());
            this.add(caroselMenu, BorderLayout.CENTER);

            TabPreviewInfo previewInfo = new TabPreviewInfo();
            previewInfo.tabPane = TabOverviewDialog.this.tabPane;
            previewInfo.previewCallback = previewCallback;
            previewInfo.setPreviewWidth(this.pWidth - 4);
            previewInfo.setPreviewHeight(this.pHeight - 4);
            previewInfo.toPreviewAllTabs = true;
            previewInfo.initiator = TabOverviewDialog.this;

            TabPreviewThread.getInstance().queueTabPreviewRequest(previewInfo);
        }

        @Override
        public void updateUI() {
            super.updateUI();
            if (this.caroselMenu != null) {
                JList<Object> someList = new JList<>();
                ListCellRenderer<Object> lcr = someList.getCellRenderer();
                this.caroselMenu.setCellRenderer(new MenuCarouselListCellRenderer(lcr));
                this.caroselMenu.setMenuScrollColor(UIManager.getColor("Panel.background"));
                this.caroselMenu.setUpDownColor(UIManager.getColor("Label.foreground"));
                this.caroselMenu.setBackground(UIManager.getColor("Panel.background"));

                double scale = NeonCortex.getScaleFactor(this.caroselMenu);
                int controlFontSize = SubstanceSizeUtils.getControlFontSize();
                SubstanceColorScheme colorScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(this.caroselMenu, ComponentState.DEFAULT);
                this.caroselMenu.setUpDownIcons(
                        SubstanceImageCreator.getArrowIcon(scale, controlFontSize,
                                SwingConstants.NORTH, colorScheme),
                        SubstanceImageCreator.getArrowIcon(scale, controlFontSize,
                                SwingConstants.SOUTH, colorScheme));
            }
        }
    }

    /**
     * Tab grid overview panel. Contains a grid of tab preview widgets. The widgets are created in a
     * separate thread ({@link TabPreviewThread}) and offered to the tab overview dialog via the
     * registered implementation of {@link TabPreviewThread.TabPreviewCallback}. This way the
     * application stays interactive while the tab overview dialog is being populated.
     *
     * @author Kirill Grouchnikov
     */
    protected class TabGridOverviewPanel extends JPanel {
        /**
         * Tab preview controls.
         */
        protected TabPreviewControl[] previewControls;

        /**
         * Width of a single tab preview control.
         */
        protected int pWidth;

        /**
         * Height of a single tab preview control.
         */
        protected int pHeight;

        /**
         * Number of overview grid columns.
         */
        protected int colCount;

        /**
         * Glass pane for rollover effects.
         */
        protected TabGridOverviewGlassPane glassPane;

        /**
         * Creates a tab overview panel.
         *
         * @param dialogWidth  The width of the parent dialog.
         * @param dialogHeight The height of the parent dialog.
         */
        public TabGridOverviewPanel(final int dialogWidth, final int dialogHeight) {
            // int tabCount = TabOverviewDialog.this.tabPane.getTabCount();

            TabPreviewThread.TabPreviewCallback previewCallback =
                    new TabPreviewThread.TabPreviewCallback() {
                        @Override
                        public void start(JTabbedPane tabPane, int tabCount,
                                TabPreviewInfo tabPreviewInfo) {
                            colCount = (int) Math.sqrt(tabCount);
                            if (colCount * colCount < tabCount)
                                colCount++;

                            pWidth = (dialogWidth - 8) / colCount;
                            pHeight = (dialogHeight - 32) / colCount;

                            tabPreviewInfo.setPreviewWidth(pWidth - 4);
                            tabPreviewInfo.setPreviewHeight(pHeight - 20);

                            // Check if need to reallocate the preview controls.
                            boolean isSame = (previewControls != null)
                                    && (previewControls.length == tabCount);
                            if (isSame)
                                return;

                            if (previewControls != null) {
                                for (int i = 0; i < previewControls.length; i++) {
                                    remove(previewControls[i]);
                                }
                            }

                            previewControls = new TabPreviewControl[tabCount];
                            TabPreviewPainter tpp = TabPreviewUtilities
                                    .getTabPreviewPainter(TabOverviewDialog.this.tabPane);
                            for (int i = 0; i < tabCount; i++) {
                                TabPreviewControl previewControl = new TabPreviewControl(
                                        TabOverviewDialog.this.tabPane, i);
                                // fix for issue 177 in Substance (disallowing selection
                                // of disabled tabs).
                                if (tpp.isSensitiveToEvents(TabOverviewDialog.this.tabPane, i)) {
                                    previewControl.addMouseListener(
                                            new TabPreviewMouseHandler(i, previewControl, true,
                                                    false));
                                }
                                previewControls[i] = previewControl;
                                add(previewControl);
                            }

                            doLayout();
                            for (int i = 0; i < tabCount; i++) {
                                previewControls[i].revalidate();
                            }
                            repaint();

                            JRootPane rp = SwingUtilities.getRootPane(TabGridOverviewPanel.this);
                            glassPane = new TabGridOverviewGlassPane(TabGridOverviewPanel.this);
                            rp.setGlassPane(glassPane);
                            glassPane.setVisible(true);
                        }

                        @Override
                        public void offer(JTabbedPane tabPane, int tabIndex,
                                BufferedImage componentSnap) {
                            TabGridOverviewPanel.this.previewControls[tabIndex]
                                    .setPreviewImage(componentSnap, true);
                        }
                    };

            this.setLayout(new TabGridOverviewPanelLayout());

            TabPreviewInfo previewInfo = new TabPreviewInfo();
            previewInfo.tabPane = TabOverviewDialog.this.tabPane;
            previewInfo.previewCallback = previewCallback;
            // previewInfo.setPreviewWidth(this.pWidth - 4);
            // previewInfo.setPreviewHeight(this.pHeight - 20);
            previewInfo.toPreviewAllTabs = true;
            previewInfo.initiator = TabOverviewDialog.this;

            TabPreviewThread.getInstance().queueTabPreviewRequest(previewInfo);
        }

        /**
         * Layout manager for the tab overview panel.
         *
         * @author Kirill Grouchnikov
         */
        private class TabGridOverviewPanelLayout implements LayoutManager {
            @Override
            public void addLayoutComponent(String name, Component comp) {
            }

            @Override
            public void removeLayoutComponent(Component comp) {
            }

            @Override
            public void layoutContainer(Container parent) {
                // int width = parent.getWidth();
                // int height = parent.getHeight();
                //
                if (TabGridOverviewPanel.this.previewControls == null)
                    return;

                for (int i = 0; i < TabGridOverviewPanel.this.previewControls.length; i++) {
                    TabPreviewControl previewControl = TabGridOverviewPanel.this.previewControls[i];
                    if (previewControl == null)
                        continue;
                    int rowIndex = i / TabGridOverviewPanel.this.colCount;
                    int colIndex = i % TabGridOverviewPanel.this.colCount;

                    previewControl.setBounds(colIndex * TabGridOverviewPanel.this.pWidth,
                            rowIndex * TabGridOverviewPanel.this.pHeight,
                            TabGridOverviewPanel.this.pWidth, TabGridOverviewPanel.this.pHeight);
                }
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return parent.getSize();
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                return this.minimumLayoutSize(parent);
            }
        }
    }

    /**
     * Glass pane for the tab grid overview panel. Provides rollover effects, showing zoomed version
     * of the tab thumbnails.
     *
     * @author Kirill Grouchnikov
     */
    public class TabGridOverviewGlassPane extends JPanel {
        private final class RolloverMouseListener extends MouseAdapter {
            private final int index;
            private final TabGridOverviewPanel overviewPanel;

            private Timeline rolloverTimeline;

            private RolloverMouseListener(final int index,
                    final TabGridOverviewPanel overviewPanel) {
                this.index = index;
                this.overviewPanel = overviewPanel;
                this.rolloverTimeline = AnimationConfigurationManager.getInstance()
                        .timelineBuilder(overviewPanel.previewControls[index])
                        .addPropertyToInterpolate("zoom", 1.0f, 1.2f)
                        .addCallback(new SwingRepaintCallback(
                                SwingUtilities.getRootPane(overviewPanel)))
                        .addCallback(new EventDispatchThreadTimelineCallbackAdapter() {
                            @Override
                            public void onTimelineStateChanged(TimelineState oldState,
                                    TimelineState newState, float durationFraction,
                                    float timelinePosition) {
                                if ((oldState == TimelineState.DONE) &&
                                        (newState == TimelineState.IDLE)) {
                                    overviewPanel.previewControls[index].setToolTipText(
                                            TabPreviewUtilities.getLabelBundle()
                                                    .getString("TabbedPane.overviewWidgetTooltip"));
                                }
                            }
                        })
                        .build();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                currHoverIndex = index;
                overviewPanel.previewControls[index].setToolTipText(null);
                this.rolloverTimeline.play();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (currHoverIndex == index) {
                    currHoverIndex = -1;
                }
                overviewPanel.previewControls[index].setToolTipText(null);
                this.rolloverTimeline.playReverse();
            }
        }

        /**
         * Index of the tab thumbnail currently under the mouse pointer.
         */
        private int currHoverIndex;

        /**
         * The associated overview panel.
         */
        private TabGridOverviewPanel overviewPanel;

        /**
         * Creates the glass pane.
         *
         * @param overviewPanel The associated overview panel.
         */
        public TabGridOverviewGlassPane(final TabGridOverviewPanel overviewPanel) {
            this.setOpaque(false);
            this.overviewPanel = overviewPanel;

            int size = this.overviewPanel.previewControls.length;
            /**
             * Mouse listeneres (one for each tab thumbnail).
             */
            MouseListener[] mouseListeners = new MouseListener[size];
            this.currHoverIndex = -1;
            for (int i = 0; i < size; i++) {
                final int index = i;
                mouseListeners[i] = new RolloverMouseListener(index, overviewPanel);
                this.overviewPanel.previewControls[i].addMouseListener(mouseListeners[i]);
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D graphics = (Graphics2D) g.create();
            for (int i = 0; i < tabPane.getTabCount(); i++) {
                TabPreviewControl child = overviewPanel.previewControls[i];
                if (child.getZoom() > 1.0f) {
                    paintSingleTabComponent(graphics, i);
                }
            }
            if (currHoverIndex >= 0) {
                // paint the currently hovered once again (so it'll be on top)
                paintSingleTabComponent(graphics, currHoverIndex);
            }
            graphics.dispose();
        }

        /**
         * Paints a single tab component.
         *
         * @param graphics Graphics context.
         * @param index    Tab component index.
         */
        private void paintSingleTabComponent(Graphics2D graphics, int index) {
            TabPreviewControl child = overviewPanel.previewControls[index];
            Rectangle cBounds = child.getBounds();
            int dx = child.getLocationOnScreen().x - this.getLocationOnScreen().x;
            int dy = child.getLocationOnScreen().y - this.getLocationOnScreen().y;
            double factor = child.getZoom();
            int bw = (int) (cBounds.width * factor);
            int bh = (int) (cBounds.height * factor);
            BufferedImage bi = new BufferedImage(bw, bh, BufferedImage.TYPE_INT_ARGB);
            Graphics2D bGraphics = (Graphics2D) bi.getGraphics().create();
            bGraphics.scale(factor, factor);

            TabPreviewControl tChild = child;

            bGraphics.setColor(tChild.getBackground());
            bGraphics.fillRect(0, 0, tChild.getWidth(), tChild.getHeight());

            Icon icon = tabPane.getIconAt(index);
            int iy = (icon == null) ? 16 : icon.getIconHeight();
            if (icon != null) {
                icon.paintIcon(this, bGraphics, 1, 1);
            }
            String title = tabPane.getTitleAt(index);
            JLabel tempLabel = new JLabel(title);
            tempLabel.setBounds(tChild.titleLabel.getBounds());
            tempLabel.setFont(tChild.titleLabel.getFont());
            int bdx = tempLabel.getX();
            int bdy = tempLabel.getY();
            bGraphics.translate(bdx, bdy);
            tempLabel.paint(bGraphics);
            bGraphics.translate(-bdx, -bdy);
            bdx = 1;
            bdy = iy + 3;
            bGraphics.translate(bdx, bdy);
            child.paintTabThumbnail(bGraphics);
            bGraphics.translate(-bdx, -bdy);
            bGraphics.setColor(Color.black);
            bGraphics.drawRect(0, 0, child.getWidth() - 1, child.getHeight() - 1);
            bGraphics.dispose();

            dx -= (bw - cBounds.width) / 2;
            dy -= (bh - cBounds.height) / 2;
            // make sure that the enlarged thumbnail stays inbounds
            dx = Math.max(dx, 0);
            dy = Math.max(dy, 0);
            if (dx + bi.getWidth() > getWidth()) {
                dx -= (dx + bi.getWidth() - getWidth());
            }
            if (dy + bi.getHeight() > getHeight()) {
                dy -= (dy + bi.getHeight() - getHeight());
            }
            graphics.drawImage(bi, dx, dy, null);
        }
    }

    /**
     * Creates a new tab overview dialog. Declared private to enforce usage of
     * {@link #getOverviewDialog(JTabbedPane)}.
     *
     * @param tabPane      Tabbed pane.
     * @param overviewKind Overview kind.
     * @param owner        Optional owner for the tab overview dialog.
     * @param modal        Modality indication.
     * @param dialogWidth  Tab overview dialog width.
     * @param dialogHeight Tab overview dialog height.
     * @throws HeadlessException
     * @see #getOverviewDialog(JTabbedPane)
     */
    private TabOverviewDialog(final JTabbedPane tabPane, TabOverviewKind overviewKind, Frame owner,
            boolean modal, int dialogWidth, int dialogHeight) throws HeadlessException {
        super(owner, modal);
        this.tabPane = tabPane;
        this.setLayout(new BorderLayout());
        if (overviewKind == TabOverviewKind.GRID) {
            TabGridOverviewPanel gridOverviewPanel = new TabGridOverviewPanel(dialogWidth,
                    dialogHeight);
            this.add(gridOverviewPanel, BorderLayout.CENTER);
            //
            // TabGridOverviewGlassPane glassPane = new
            // TabGridOverviewGlassPane(
            // gridOverviewPanel);
            // this.setGlassPane(glassPane);
            // glassPane.setVisible(true);
        }
        if (overviewKind == TabOverviewKind.ROUND_CAROUSEL) {
            this.add(new TabRoundCarouselOverviewPanel(dialogWidth, dialogHeight),
                    BorderLayout.CENTER);
        }
        if (overviewKind == TabOverviewKind.MENU_CAROUSEL) {
            this.add(new TabMenuCarouselOverviewPanel(dialogWidth, dialogHeight),
                    BorderLayout.CENTER);
        }

        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setResizable(false);

        this.lafSwitchListener = propertyChangeEvent -> {
            if ("lookAndFeel".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(
                        () -> SwingUtilities.updateComponentTreeUI(TabOverviewDialog.this));
            }
        };

        UIManager.addPropertyChangeListener(this.lafSwitchListener);

        // Cancel all pending preview requests issued by this overview
        // dialog when it closes.
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                this.cancelRequests();
                UIManager.removePropertyChangeListener(lafSwitchListener);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                this.cancelRequests();
                UIManager.removePropertyChangeListener(lafSwitchListener);
            }

            /**
             * Cancels preview requests issued by <code>this</code> overview dialog.
             */
            private void cancelRequests() {
                if (TabPreviewThread.instanceRunning()) {
                    TabPreviewThread.getInstance().cancelTabPreviewRequests(TabOverviewDialog.this);
                }
            }
        });
    }

    /**
     * Returns a new instance of a tab overview dialog.
     *
     * @param tabPane Tabbed pane.
     * @return Tab overview dialog for the specified tabbed pane.
     */
    public static TabOverviewDialog getOverviewDialog(JTabbedPane tabPane) {
        final TabPreviewPainter previewPainter = TabPreviewUtilities.getTabPreviewPainter(tabPane);
        String title = previewPainter.toUpdatePeriodically(tabPane)
                ? MessageFormat.format(
                TabPreviewUtilities.getLabelBundle()
                        .getString("TabbedPane.overviewDialogTitleRefresh"),
                new Object[] {Integer.valueOf(previewPainter.getUpdateCycle(tabPane) / 1000)})
                : TabPreviewUtilities.getLabelBundle().getString("TabbedPane.overviewDialogTitle");
        JFrame frameForModality = previewPainter.getModalOwner(tabPane);
        boolean isModal = (frameForModality != null);
        Rectangle dialogScreenBounds = previewPainter.getPreviewDialogScreenBounds(tabPane);
        TabOverviewKind overviewKind = previewPainter.getOverviewKind(tabPane);
        final TabOverviewDialog overviewDialog = new TabOverviewDialog(tabPane, overviewKind,
                frameForModality, isModal, dialogScreenBounds.width, dialogScreenBounds.height);
        overviewDialog.setTitle(title);

        overviewDialog.setLocation(dialogScreenBounds.x, dialogScreenBounds.y);
        overviewDialog.setSize(dialogScreenBounds.width, dialogScreenBounds.height);

        // make sure that the tab overview dialog is disposed when it loses focus
        final PropertyChangeListener activeWindowListener = propertyChangeEvent -> {
            if ("activeWindow".equals(propertyChangeEvent.getPropertyName())) {
                if (overviewDialog == propertyChangeEvent.getOldValue()) {
                    if (previewPainter.toDisposeOverviewOnFocusLoss()) {
                        overviewDialog.dispose();
                    }
                }
            }
        };
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
                .addPropertyChangeListener(activeWindowListener);

        // make sure that when the window with the tabbed pane is
        // closed, the tab overview dialog is disposed.
        final Window tabWindow = SwingUtilities.getWindowAncestor(tabPane);
        final WindowListener tabWindowListener = new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                overviewDialog.dispose();
            }
        };
        tabWindow.addWindowListener(tabWindowListener);
        overviewDialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                tabWindow.removeWindowListener(tabWindowListener);
                KeyboardFocusManager.getCurrentKeyboardFocusManager()
                        .removePropertyChangeListener(activeWindowListener);
            }
        });

        return overviewDialog;
    }
}
