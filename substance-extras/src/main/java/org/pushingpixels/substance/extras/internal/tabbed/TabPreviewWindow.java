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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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

import org.pushingpixels.neon.icon.NeonIconUIResource;
import org.pushingpixels.substance.extras.api.tabbed.TabPreviewPainter;
import org.pushingpixels.substance.extras.internal.tabbed.TabPreviewThread.TabPreviewInfo;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.ui.SubstanceTabbedPaneUI;
import org.pushingpixels.trident.Timeline;
import org.pushingpixels.trident.swing.SwingComponentTimeline;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;

/**
 * Tab preview window. Is displayed when the mouse hovers over relevant (previewable) tabs.
 * 
 * @author Kirill Grouchnikov
 */
public class TabPreviewWindow extends JWindow implements ActionListener {
    public static final class PreviewLabel extends JLabel {
        float alpha = 0.0f;

        private PreviewLabel(Icon image) {
            super(image);
        }

        public void setAlpha(float alpha) {
            this.alpha = alpha;
            this.repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setComposite(AlphaComposite.SrcOver.derive(this.alpha));
            super.paintComponent(g2);
            g2.dispose();
        }
    }

    /**
     * Singleton instance of tab preview window.
     */
    protected static TabPreviewWindow instance;

    /**
     * Information on the current tab preview request.
     */
    protected static TabPreviewInfo currTabPreviewInfo;

    /**
     * Currently running timer task.
     */
    protected static Timer currTabPreviewTimer;

    /**
     * Returns the singleton instance of tab preview window.
     * 
     * @return The singleton instance of tab preview window.
     */
    public static synchronized TabPreviewWindow getInstance() {
        if (TabPreviewWindow.instance == null) {
            TabPreviewWindow.instance = new TabPreviewWindow();
            TabPreviewWindow.instance.setLayout(new BorderLayout());
            // instance.addHierarchyListener(new HierarchyListener() {
            // public void hierarchyChanged(HierarchyEvent e) {
            // System.err.println(e.getID());
            // }
            // });
        }
        return TabPreviewWindow.instance;
    }

    /**
     * Posts a preview request for a tab component in the specified tabbed pane.
     * 
     * @param tabPane
     *            Tabbed pane.
     * @param tabIndex
     *            Index of the tab to preview.
     */
    public synchronized void postPreviewRequest(JTabbedPane tabPane, int tabIndex) {
        TabPreviewPainter previewPainter = TabPreviewUtilities.getTabPreviewPainter(tabPane);
        if ((previewPainter == null) || (!previewPainter.hasPreviewWindow(tabPane, tabIndex)))
            return;

        // check if already showing
        if (currTabPreviewInfo != null) {
            if ((currTabPreviewInfo.tabPane == tabPane)
                    && (currTabPreviewInfo.tabIndexToPreview == tabIndex))
                return;
        }

        if (currTabPreviewTimer != null) {
            if (currTabPreviewTimer.isRunning())
                currTabPreviewTimer.stop();
        }

        Dimension previewDim = previewPainter.getPreviewWindowDimension(tabPane, tabIndex);
        int pWidth = previewDim.width;
        int pHeight = previewDim.height;
        Component tabComponent = tabPane.getComponentAt(tabIndex);
        if (tabComponent != null) {
            int width = tabComponent.getWidth();
            int height = tabComponent.getHeight();
            double ratio = (double) width / (double) height;
            double pRatio = (double) previewDim.width / (double) previewDim.height;
            if (pRatio > ratio) {
                pWidth = (int) (pHeight * ratio);
            } else {
                pHeight = (int) (pWidth / ratio);
            }
        }

        currTabPreviewInfo = new TabPreviewInfo();
        currTabPreviewInfo.tabPane = tabPane;
        currTabPreviewInfo.tabIndexToPreview = tabIndex;
        currTabPreviewInfo.setPreviewWidth(pWidth);
        currTabPreviewInfo.setPreviewHeight(pHeight);
        currTabPreviewInfo.initiator = tabPane;
        currTabPreviewInfo.previewCallback = new TabPreviewThread.TabPreviewCallback() {
            /*
             * (non-Javadoc)
             * 
             * @seeorg.pushingpixels.lafwidget.tabbed.TabPreviewThread. TabPreviewCallback
             * #start(javax.swing.JTabbedPane, int, org.pushingpixels
             * .lafwidget.tabbed.TabPreviewThread.TabPreviewInfo)
             */
            public void start(JTabbedPane tabPane, int tabCount, TabPreviewInfo tabPreviewInfo) {
                // Nothing to do since the callback was registered
                // for a specific tab.
            }

            /*
             * (non-Javadoc)
             * 
             * @seeorg.pushingpixels.lafwidget.tabbed.TabPreviewThread. TabPreviewCallback
             * #offer(javax.swing.JTabbedPane, int, java.awt.image.BufferedImage)
             */
            public void offer(JTabbedPane tabPane, int tabIndex, BufferedImage componentSnap) {
                if (currTabPreviewInfo == null) {
                    // has since been cancelled
                    return;
                }
                if ((tabPane != currTabPreviewInfo.tabPane)
                        || (tabIndex != currTabPreviewInfo.tabIndexToPreview)) {
                    // has since been cancelled
                    return;
                }
                Rectangle previewScreenRectangle = TabPreviewWindow.this.getPreviewWindowScreenRect(
                        tabPane, tabIndex, currTabPreviewInfo.getPreviewWidth(),
                        currTabPreviewInfo.getPreviewHeight());
                TabPreviewWindow.this.getContentPane().removeAll();
                final JLabel previewLabel = new PreviewLabel(
                        new NeonIconUIResource(componentSnap));
                TabPreviewWindow.this.addComponentListener(new ComponentAdapter() {
                    @Override
                    public void componentShown(ComponentEvent e) {
                        previewLabel.setVisible(true);
                        // Start fading-in of the image.
                        Timeline timeline = new SwingComponentTimeline(previewLabel);
                        AnimationConfigurationManager.getInstance().configureTimeline(timeline);
                        timeline.addPropertyToInterpolate("alpha", 0.0f, 1.0f);
                        timeline.play();
                    }
                });
                // previewLabel.setBorder(new SubstanceBorder());
                TabPreviewWindow.this.getContentPane().add(previewLabel, BorderLayout.CENTER);
                TabPreviewWindow.this.setSize(previewScreenRectangle.width,
                        previewScreenRectangle.height);
                TabPreviewWindow.this.setLocation(previewScreenRectangle.x,
                        previewScreenRectangle.y);
                previewLabel.setVisible(false);
                TabPreviewWindow.this.setVisible(true);
            }
        };

        int extraDelay = previewPainter.getPreviewWindowExtraDelay(tabPane, tabIndex);
        if (extraDelay < 0) {
            throw new IllegalArgumentException("Extra delay for tab preview must be non-negative");
        }
        currTabPreviewTimer = new Timer(2000 + extraDelay, this);
        currTabPreviewTimer.setRepeats(false);
        currTabPreviewTimer.start();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    public void actionPerformed(ActionEvent e) {
        if (currTabPreviewInfo == null)
            return;

        // If we are here - the delay timer has expired.

        // System.err.println("Post " + tabIndex);
        TabPreviewPainter previewPainter = TabPreviewUtilities
                .getTabPreviewPainter(currTabPreviewInfo.tabPane);
        if ((previewPainter == null)
                || (!previewPainter.hasPreviewWindow(currTabPreviewInfo.tabPane,
                        currTabPreviewInfo.tabIndexToPreview)))
            return;

        // Queue the request with the preview thread.
        TabPreviewThread.getInstance().queueTabPreviewRequest(currTabPreviewInfo);
    }

    /**
     * Returns the screen rectangle for the preview window.
     * 
     * @param tabPane
     *            Tabbed pane.
     * @param tabIndex
     *            Tab index.
     * @param pWidth
     *            Preview width.
     * @param pHeight
     *            Preview height.
     * @return The screen rectangle for the preview window.
     */
    protected Rectangle getPreviewWindowScreenRect(JTabbedPane tabPane, int tabIndex, int pWidth,
            int pHeight) {
        SubstanceTabbedPaneUI ui = (SubstanceTabbedPaneUI) tabPane.getUI();
        Rectangle relative = ui.getTabRectangle(tabIndex);
        if (relative == null)
            return null;

        Rectangle result = new Rectangle(pWidth, pHeight);
        boolean ltr = tabPane.getComponentOrientation().isLeftToRight();
        if (ltr) {
            if (tabPane.getTabPlacement() != SwingConstants.BOTTOM) {
                result.setLocation(relative.x, relative.y + relative.height);
            } else {
                result.setLocation(relative.x, relative.y - pHeight);
            }
        } else {
            if (tabPane.getTabPlacement() != SwingConstants.BOTTOM) {
                result.setLocation(relative.x + relative.width - pWidth,
                        relative.y + relative.height);
            } else {
                result.setLocation(relative.x + relative.width - pWidth, relative.y - pHeight);
            }
        }
        int dx = tabPane.getLocationOnScreen().x;
        int dy = tabPane.getLocationOnScreen().y;
        result.x += dx;
        result.y += dy;

        // Fix to make the tab preview window stay in screen bounds
        Rectangle virtualBounds = new Rectangle();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gds = ge.getScreenDevices();
        for (int i = 0; i < gds.length; i++) {
            GraphicsDevice gd = gds[i];
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            virtualBounds = virtualBounds.union(gc.getBounds());
        }

        if (result.x + result.width > (virtualBounds.width - 1)) {
            result.x -= (result.x + result.width - virtualBounds.width + 1);
        }
        if (result.y + result.height > (virtualBounds.height - 1)) {
            result.y -= (result.y + result.height - virtualBounds.height + 1);
        }
        if (result.x < virtualBounds.x)
            result.x = virtualBounds.x + 1;
        if (result.y < virtualBounds.y)
            result.y = virtualBounds.y + 1;
        return result;
    }

    /**
     * Cancels the currently pending preview request.
     */
    public static synchronized void cancelPreviewRequest() {
        currTabPreviewInfo = null;
        if ((currTabPreviewTimer != null) && currTabPreviewTimer.isRunning()) {
            currTabPreviewTimer.stop();
            currTabPreviewTimer = null;
        }
        if (instance != null)
            instance.dispose();
    }
}
