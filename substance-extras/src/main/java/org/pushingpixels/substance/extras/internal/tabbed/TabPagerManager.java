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

import org.pushingpixels.substance.extras.api.tabbed.TabPreviewPainter;
import org.pushingpixels.substance.extras.internal.tabbed.TabPreviewThread.*;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.trident.api.Timeline;
import org.pushingpixels.trident.api.Timeline.TimelineState;
import org.pushingpixels.trident.api.swing.EventDispatchThreadTimelineCallbackAdapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

/**
 * Tab pager manager.
 *
 * @author Kirill Grouchnikov
 */
public class TabPagerManager {
    /**
     * Singleton instance of the tab pager manager.
     */
    protected static TabPagerManager instance;

    /**
     * The tabbed pane that is currently paged.
     */
    protected JTabbedPane currTabbedPane;

    /**
     * Index of the central tab.
     */
    protected int currTabIndex;

    /**
     * Index of the next tab.
     */
    protected int nextTabIndex;

    /**
     * Index of the previous tab.
     */
    protected int prevTabIndex;

    // protected Map smallPreviewMap;
    //
    // protected Map regularPreviewMap;
    //
    /**
     * Preview window for the left (previous) tab.
     */
    protected JWindow prevTabWindow;

    /**
     * Preview window for the central (current) tab.
     */
    protected JWindow currTabWindow;

    /**
     * Preview window for the right (next) tab.
     */
    protected JWindow nextTabWindow;

    /**
     * Indicates whether the tab pager windows are visible.
     */
    protected boolean isVisible;

    /**
     * Implementation of the tab preview callback for the tab pager.
     *
     * @author Kirill Grouchnikov.
     */
    public class TabPagerPreviewCallback implements TabPreviewCallback {
        /**
         * The associated preview window.
         */
        private JWindow previewWindow;

        /**
         * The associated tab preview control.
         */
        private TabPreviewControl previewControl;

        /**
         * Creates a new tab preview callback for the tab pager.
         *
         * @param previewWindow The associated preview window.
         * @param tabPane       The associated tab preview control.
         * @param tabIndex      Tab index.
         */
        public TabPagerPreviewCallback(JWindow previewWindow, JTabbedPane tabPane, int tabIndex) {
            this.previewWindow = previewWindow;
            this.previewControl = new TabPreviewControl(tabPane, tabIndex);
            this.previewWindow.getContentPane().removeAll();
            this.previewWindow.getContentPane().add(this.previewControl, BorderLayout.CENTER);
            this.previewWindow.getContentPane().doLayout();
            this.previewControl.doLayout();
        }

        @Override
        public void start(JTabbedPane tabPane, int tabCount, TabPreviewInfo tabPreviewInfo) {
            // Nothing to do since the callback was registered
            // for a specific tab.
        }

        @Override
        public void offer(JTabbedPane tabPane, int tabIndex, BufferedImage componentSnap) {
            if (TabPagerManager.this.currTabbedPane != tabPane) {
                // has since been cancelled
                return;
            }

            if (!this.previewWindow.isVisible()) {
                // has since been hidden
                return;
            }

            this.previewControl.setPreviewImage(componentSnap, true);
        }
    }

    /**
     * Returns the tab pager instance.
     *
     * @return Tab pager instance.
     */
    public static synchronized TabPagerManager getPager() {
        if (TabPagerManager.instance == null)
            TabPagerManager.instance = new TabPagerManager();
        return TabPagerManager.instance;
    }

    /**
     * Constructs a new tab pager manager. Is made private to enforce single instance.
     */
    private TabPagerManager() {
        // this.smallPreviewMap = new HashMap();
        // this.regularPreviewMap = new HashMap();

        // Rectangle virtualBounds = new Rectangle();
        // GraphicsEnvironment ge = GraphicsEnvironment
        // .getLocalGraphicsEnvironment();
        // GraphicsDevice[] gds = ge.getScreenDevices();
        // for (int i = 0; i < gds.length; i++) {
        // GraphicsDevice gd = gds[i];
        // GraphicsConfiguration gc = gd.getDefaultConfiguration();
        // virtualBounds = virtualBounds.union(gc.getBounds());
        // }
        //
        // int screenWidth = virtualBounds.width;
        // int screenHeight = virtualBounds.height;

        this.currTabWindow = new JWindow();
        this.currTabWindow.getContentPane().setLayout(new BorderLayout());
        // int currWidth = screenWidth / 3;
        // int currHeight = screenHeight / 3;
        // this.currTabWindow.setSize(currWidth, currHeight);
        // // Fix for issue 178 on Substance (multiple screens)
        // this.currTabWindow.setLocation(currWidth + virtualBounds.x,
        // currHeight);
        this.currTabWindow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwingUtilities.invokeLater(() -> {
                    // fix for issue 177 in Substance (disallowing selection
                    // of disabled tabs).
                    TabPreviewPainter tpp = TabPreviewUtilities
                            .getTabPreviewPainter(currTabbedPane);
                    if (tpp.isSensitiveToEvents(currTabbedPane, currTabIndex)) {
                        hide();
                        currTabbedPane.setSelectedIndex(currTabIndex);
                    }
                });
            }
        });
        this.currTabWindow.addMouseWheelListener(new TabPagerMouseWheelListener());

        // int smallWidth = 2 * screenWidth / 9;
        // int smallHeight = 2 * screenHeight / 9;
        this.prevTabWindow = new JWindow();
        this.prevTabWindow.getContentPane().setLayout(new BorderLayout());
        // this.prevTabWindow.setSize(smallWidth, smallHeight);
        // // Fix for issue 178 on Substance (multiple screens)
        // this.prevTabWindow.setLocation((screenWidth / 18) + virtualBounds.x,
        // 7 * screenHeight / 18);
        this.prevTabWindow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwingUtilities.invokeLater(() -> {
                    // fix for issue 177 in Substance (disallowing selection
                    // of disabled tabs).
                    TabPreviewPainter tpp = TabPreviewUtilities
                            .getTabPreviewPainter(currTabbedPane);
                    if (tpp.isSensitiveToEvents(currTabbedPane, prevTabIndex)) {
                        hide();
                        currTabbedPane.setSelectedIndex(prevTabIndex);
                    }
                });
            }
        });
        this.prevTabWindow.addMouseWheelListener(new TabPagerMouseWheelListener());

        this.nextTabWindow = new JWindow();
        // this.nextTabWindow.getContentPane().setLayout(new BorderLayout());
        // this.nextTabWindow.setSize(smallWidth, smallHeight);
        // // Fix for issue 178 on Substance (multiple screens)
        // this.nextTabWindow.setLocation((13 * screenWidth / 18)
        // + virtualBounds.x, 7 * screenHeight / 18);
        this.nextTabWindow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwingUtilities.invokeLater(() -> {
                    // fix for issue 177 in Substance (disallowing selection
                    // of disabled tabs).
                    TabPreviewPainter tpp = TabPreviewUtilities
                            .getTabPreviewPainter(currTabbedPane);
                    if (tpp.isSensitiveToEvents(currTabbedPane, nextTabIndex)) {
                        hide();
                        currTabbedPane.setSelectedIndex(nextTabIndex);
                    }
                });
            }
        });
        this.nextTabWindow.addMouseWheelListener(new TabPagerMouseWheelListener());

        this.recomputeBounds();

        this.isVisible = false;
    }

    /**
     * Recomputes the bounds of tab pager windows.
     */
    private void recomputeBounds() {
        Rectangle virtualBounds = new Rectangle();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gds = ge.getScreenDevices();
        for (int i = 0; i < gds.length; i++) {
            GraphicsDevice gd = gds[i];
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            virtualBounds = virtualBounds.union(gc.getBounds());
        }

        int screenWidth = virtualBounds.width;
        int screenHeight = virtualBounds.height;

        int currWidth = screenWidth / 3;
        int currHeight = screenHeight / 3;
        this.currTabWindow.setSize(currWidth, currHeight);
        // Fix for issue 178 on Substance (multiple screens)
        this.currTabWindow.setLocation(currWidth + virtualBounds.x, currHeight);

        int smallWidth = 2 * screenWidth / 9;
        int smallHeight = 2 * screenHeight / 9;
        this.prevTabWindow.setSize(smallWidth, smallHeight);
        // Fix for issue 178 on Substance (multiple screens)
        this.prevTabWindow.setLocation((screenWidth / 18) + virtualBounds.x, 7 * screenHeight / 18);

        this.nextTabWindow.getContentPane().setLayout(new BorderLayout());
        this.nextTabWindow.setSize(smallWidth, smallHeight);
        // Fix for issue 178 on Substance (multiple screens)
        this.nextTabWindow.setLocation((13 * screenWidth / 18) + virtualBounds.x,
                7 * screenHeight / 18);
    }

    /**
     * Sets the tabbed pane on <code>this</code> tab pager manager.
     *
     * @param jtp Tabbed pane to page.
     */
    private void setTabbedPane(JTabbedPane jtp) {
        if (this.currTabbedPane == jtp)
            return;
        this.currTabbedPane = jtp;
        // this.smallPreviewMap.clear();
        // this.regularPreviewMap.clear();
    }

    /**
     * Flips the pages.
     *
     * @param tabbedPane Tabbed pane.
     * @param isForward  if <code>true</code>, the tabs are flipped one page (tab) forward, if
     *                   <code>false</code>, the tabs are flipped one page (tab) backward.
     */
    public synchronized void page(JTabbedPane tabbedPane, boolean isForward) {
        this.setTabbedPane(tabbedPane);
        if (!this.isVisible) {
            this.recomputeBounds();
            this.currTabWindow.setVisible(true);
            this.prevTabWindow.setVisible(true);
            this.nextTabWindow.setVisible(true);
            this.isVisible = true;
            this.currTabIndex = this.currTabbedPane.getSelectedIndex();
        }

        int delta = isForward ? 1 : -1;
        this.currTabIndex += delta;
        if (this.currTabIndex == this.currTabbedPane.getTabCount())
            this.currTabIndex = 0;
        if (this.currTabIndex == -1)
            this.currTabIndex = this.currTabbedPane.getTabCount() - 1;

        this.nextTabIndex = this.currTabIndex + 1;
        this.prevTabIndex = this.currTabIndex - 1;
        if (this.nextTabIndex == this.currTabbedPane.getTabCount())
            this.nextTabIndex = 0;
        if (this.prevTabIndex == -1)
            this.prevTabIndex = this.currTabbedPane.getTabCount() - 1;

        TabPreviewThread.TabPreviewInfo currTabPreviewInfo = new TabPreviewThread.TabPreviewInfo();
        currTabPreviewInfo.tabPane = this.currTabbedPane;
        currTabPreviewInfo.tabIndexToPreview = this.currTabIndex;
        currTabPreviewInfo.setPreviewWidth(this.currTabWindow.getWidth() - 4);
        currTabPreviewInfo.setPreviewHeight(this.currTabWindow.getHeight() - 20);
        currTabPreviewInfo.previewCallback = new TabPagerPreviewCallback(this.currTabWindow,
                this.currTabbedPane, this.currTabIndex);
        currTabPreviewInfo.initiator = this;
        TabPreviewPainter previewPainter = TabPreviewUtilities
                .getTabPreviewPainter(currTabPreviewInfo.tabPane);
        if ((previewPainter != null)
                && (previewPainter.hasPreviewWindow(this.currTabbedPane, this.currTabIndex))) {
            TabPreviewThread.getInstance().queueTabPreviewRequest(currTabPreviewInfo);
        }

        TabPreviewThread.TabPreviewInfo prevTabPreviewInfo = new TabPreviewThread.TabPreviewInfo();
        prevTabPreviewInfo.tabPane = this.currTabbedPane;
        prevTabPreviewInfo.tabIndexToPreview = this.prevTabIndex;
        prevTabPreviewInfo.setPreviewWidth(this.prevTabWindow.getWidth() - 4);
        prevTabPreviewInfo.setPreviewHeight(this.prevTabWindow.getHeight() - 20);
        prevTabPreviewInfo.previewCallback = new TabPagerPreviewCallback(this.prevTabWindow,
                this.currTabbedPane, this.prevTabIndex);
        prevTabPreviewInfo.initiator = this;
        if ((previewPainter != null)
                && (previewPainter.hasPreviewWindow(this.currTabbedPane, this.prevTabIndex))) {
            TabPreviewThread.getInstance().queueTabPreviewRequest(prevTabPreviewInfo);
        }

        TabPreviewThread.TabPreviewInfo nextTabPreviewInfo = new TabPreviewThread.TabPreviewInfo();
        nextTabPreviewInfo.tabPane = this.currTabbedPane;
        nextTabPreviewInfo.tabIndexToPreview = this.nextTabIndex;
        nextTabPreviewInfo.setPreviewWidth(this.nextTabWindow.getWidth() - 4);
        nextTabPreviewInfo.setPreviewHeight(this.nextTabWindow.getHeight() - 20);
        nextTabPreviewInfo.previewCallback = new TabPagerPreviewCallback(this.nextTabWindow,
                this.currTabbedPane, this.nextTabIndex);
        nextTabPreviewInfo.initiator = this;
        if ((previewPainter != null)
                && (previewPainter.hasPreviewWindow(this.currTabbedPane, this.nextTabIndex))) {
            TabPreviewThread.getInstance().queueTabPreviewRequest(nextTabPreviewInfo);
        }

    }

    /**
     * Flips the pages in the currently shown tabbed pane.
     *
     * @param isForward if <code>true</code>, the tabs are flipped one page (tab) forward, if
     *                  <code>false</code>, the tabs are flipped one page (tab) backward.
     */
    public void page(boolean isForward) {
        if (this.currTabbedPane == null)
            return;
        this.page(this.currTabbedPane, isForward);
    }

    /**
     * Returns indication whether the tab pager windows are showing.
     *
     * @return <code>true</code> if the tab pager windows are visible, <code>false</code> otherwise.
     */
    public boolean isVisible() {
        return this.isVisible;
    }

    /**
     * Hides the tab pager windows.
     *
     * @return The index of the center (current) tab.
     */
    public synchronized int hide() {
        int result = this.isVisible ? this.currTabIndex : -1;

        final Point currWindowLocation = this.currTabWindow.getLocation();
        final Dimension currWindowSize = this.currTabWindow.getSize();
        final Point nextWindowLocation = this.nextTabWindow.getLocation();
        final Dimension nextWindowSize = this.nextTabWindow.getSize();
        final Point prevWindowLocation = this.prevTabWindow.getLocation();
        final Dimension prevWindowSize = this.prevTabWindow.getSize();

        AnimationConfigurationManager.getInstance().timelineBuilder(this.currTabbedPane)
                .addPropertyToInterpolate(Timeline.<Rectangle>property("bounds")
                        .on(this.currTabWindow)
                        .from(new Rectangle(currWindowLocation, currWindowSize))
                        .to(new Rectangle(currWindowLocation.x + currWindowSize.width / 2,
                                currWindowLocation.y + currWindowSize.height / 2, 0, 0)))
                .addPropertyToInterpolate(Timeline.<Rectangle>property("bounds")
                        .on(this.prevTabWindow)
                        .from(new Rectangle(prevWindowLocation, prevWindowSize))
                        .to(new Rectangle(prevWindowLocation.x + prevWindowSize.width / 2,
                                prevWindowLocation.y + prevWindowSize.height / 2, 0, 0)))
                .addPropertyToInterpolate(Timeline.<Rectangle>property("bounds")
                        .on(this.nextTabWindow)
                        .from(new Rectangle(nextWindowLocation, nextWindowSize))
                        .to(new Rectangle(nextWindowLocation.x + nextWindowSize.width / 2,
                                nextWindowLocation.y + nextWindowSize.height / 2, 0, 0)))
                .addCallback(new EventDispatchThreadTimelineCallbackAdapter() {
                    @Override
                    public void onTimelineStateChanged(TimelineState oldState,
                            TimelineState newState, float durationFraction,
                            float timelinePosition) {
                        if ((oldState == TimelineState.DONE) && (newState == TimelineState.IDLE)) {
                            currTabWindow.setVisible(false);
                            currTabWindow.dispose();
                            prevTabWindow.setVisible(false);
                            prevTabWindow.dispose();
                            nextTabWindow.setVisible(false);
                            nextTabWindow.dispose();
                        }
                    }
                })
                .play();

        this.isVisible = false;
        return result;
    }

    /**
     * Resets the internal caches.
     */
    public static void reset() {
        // TabPagerManager.instance.regularPreviewMap.clear();
        // TabPagerManager.instance.smallPreviewMap.clear();
    }
}
