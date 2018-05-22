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
package org.pushingpixels.flamingo.api.ribbon;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;

import org.pushingpixels.flamingo.api.common.AsynchronousLoadListener;
import org.pushingpixels.flamingo.api.common.AsynchronousLoading;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.common.popup.JPopupPanel;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager;
import org.pushingpixels.flamingo.internal.ui.ribbon.AbstractBandControlPanel;
import org.pushingpixels.flamingo.internal.ui.ribbon.BasicBandControlPanelUI;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonRootPane;
import org.pushingpixels.flamingo.internal.utils.FlamingoUtilities;
import org.pushingpixels.flamingo.internal.utils.KeyTipManager;
import org.pushingpixels.flamingo.internal.utils.KeyTipManager.KeyTipEvent;
import org.pushingpixels.flamingo.internal.utils.KeyTipRenderingUtilities;
import org.pushingpixels.flamingo.internal.utils.RenderingUtils;

/**
 * <p>
 * Ribbon frame. Provides the same functionality as a regular {@link JFrame}, but with a
 * {@link JRibbon} component in the top location.
 * </p>
 * 
 * <p>
 * This is the only officially supported way to use the {@link JRibbon} container. While
 * {@link JRibbon#JRibbon()} constructor is public, it is provided only for the applications that
 * are absolutely prevented from using {@link JRibbonFrame} class.
 * </p>
 * 
 * <p>
 * The implementation enforces that a {@link JRibbon} component is always at the
 * {@link BorderLayout#NORTH} location, throwing {@link IllegalArgumentException} on attempts to set
 * a custom layout manager, add another component at {@link BorderLayout#NORTH}, remove the
 * {@link JRibbon} component, set a custom menu bar, content pane or any other operation that
 * inteferes with the intended hierarchy of this frame.
 * </p>
 * 
 * @author Kirill Grouchnikov
 */
public class JRibbonFrame extends JFrame {
    /**
     * The ribbon component.
     */
    private JRibbon ribbon;

    private ResizableIcon appIcon;

    private boolean wasSetIconImagesCalled;

    /**
     * Custom layout manager that enforces the {@link JRibbon} location at
     * {@link BorderLayout#NORTH}.
     * 
     * @author Kirill Grouchnikov
     */
    private class RibbonFrameLayout extends BorderLayout {
        @Override
        public void addLayoutComponent(Component comp, Object constraints) {
            if ((constraints != null) && constraints.equals(BorderLayout.NORTH)) {
                if (getLayoutComponent(BorderLayout.NORTH) != null) {
                    throw new IllegalArgumentException("Already has a NORTH JRibbon component");
                }
                if (!(comp instanceof JRibbon)) {
                    throw new IllegalArgumentException(
                            "Can't add non-JRibbon component to NORTH location");
                }
            }
            super.addLayoutComponent(comp, constraints);
        }

        @Override
        public void removeLayoutComponent(Component comp) {
            if (comp instanceof JRibbon) {
                throw new IllegalArgumentException("Can't remove JRibbon component");
            }
            super.removeLayoutComponent(comp);
        }
    }

    /**
     * A custom layer that shows the currently visible key tip chain.
     * 
     * @author Kirill Grouchnikov
     */
    private class KeyTipLayer extends JComponent {
        /**
         * Creates a new key tip layer.
         */
        public KeyTipLayer() {
            this.setOpaque(false);

            // Support placing heavyweight components in the ribbon frame. See
            // https://community.oracle.com/docs/DOC-982814.
            try {
                Class awtUtilitiesClass = Class.forName("com.sun.awt.AWTUtilities");
                Method mSetComponentMixing = awtUtilitiesClass
                        .getMethod("setComponentMixingCutoutShape", Component.class, Shape.class);
                mSetComponentMixing.invoke(null, this, new Rectangle());
            } catch (Throwable t) {
            }
        }

        @Override
        public synchronized void addMouseListener(MouseListener l) {
        }

        @Override
        public synchronized void addMouseMotionListener(MouseMotionListener l) {
        }

        @Override
        public synchronized void addMouseWheelListener(MouseWheelListener l) {
        }

        @Override
        public synchronized void addKeyListener(KeyListener l) {
        }

        @Override
        protected void paintComponent(Graphics g) {
            JRibbonFrame ribbonFrame = (JRibbonFrame) SwingUtilities.getWindowAncestor(this);
            if (!ribbonFrame.isShowingKeyTips())
                return;

            // don't show keytips on inactive windows
            if (!ribbonFrame.isActive())
                return;

            Collection<KeyTipManager.KeyTipLink> keyTips = KeyTipManager.defaultManager()
                    .getCurrentlyShownKeyTips();
            if (keyTips != null) {
                Graphics2D g2d = (Graphics2D) g.create();
                RenderingUtils.installDesktopHints(g2d);

                for (KeyTipManager.KeyTipLink keyTip : keyTips) {
                    // don't display keytips on components in popup panels
                    if (SwingUtilities.getAncestorOfClass(JPopupPanel.class, keyTip.comp) != null)
                        continue;

                    // don't display key tips on hidden components
                    Rectangle compBounds = keyTip.comp.getBounds();
                    if (!keyTip.comp.isShowing() || (compBounds.getWidth() == 0)
                            || (compBounds.getHeight() == 0))
                        continue;

                    Dimension pref = KeyTipRenderingUtilities.getPrefSize(g2d.getFontMetrics(),
                            keyTip.keyTipString);

                    Point prefCenter = keyTip.prefAnchorPoint;
                    Point loc = SwingUtilities.convertPoint(keyTip.comp, prefCenter, this);
                    Container bandControlPanel = SwingUtilities
                            .getAncestorOfClass(AbstractBandControlPanel.class, keyTip.comp);
                    if (bandControlPanel != null) {
                        // special case for controls in threesome
                        // ribbon band rows
                        if (hasClientPropertySetToTrue(keyTip.comp,
                                BasicBandControlPanelUI.TOP_ROW)) {
                            loc = SwingUtilities.convertPoint(keyTip.comp, prefCenter,
                                    bandControlPanel);
                            loc.y = 0;
                            loc = SwingUtilities.convertPoint(bandControlPanel, loc, this);
                            // prefCenter.y = 0;
                        }
                        if (hasClientPropertySetToTrue(keyTip.comp,
                                BasicBandControlPanelUI.MID_ROW)) {
                            loc = SwingUtilities.convertPoint(keyTip.comp, prefCenter,
                                    bandControlPanel);
                            loc.y = bandControlPanel.getHeight() / 2;
                            loc = SwingUtilities.convertPoint(bandControlPanel, loc, this);
                            // prefCenter.y = keyTip.comp.getHeight() / 2;
                        }
                        if (hasClientPropertySetToTrue(keyTip.comp,
                                BasicBandControlPanelUI.BOTTOM_ROW)) {
                            loc = SwingUtilities.convertPoint(keyTip.comp, prefCenter,
                                    bandControlPanel);
                            loc.y = bandControlPanel.getHeight();
                            loc = SwingUtilities.convertPoint(bandControlPanel, loc, this);
                            // prefCenter.y = keyTip.comp.getHeight();
                        }
                    }

                    KeyTipRenderingUtilities.renderKeyTip(
                            g2d, this, new Rectangle(loc.x - pref.width / 2,
                                    loc.y - pref.height / 2, pref.width, pref.height),
                            keyTip.keyTipString, keyTip.enabled);
                }

                g2d.dispose();
            }
        }

        /**
         * Checks whether the specified component or one of its ancestors has the specified client
         * property set to {@link Boolean#TRUE}.
         * 
         * @param c
         *            Component.
         * @param clientPropName
         *            Client property name.
         * @return <code>true</code> if the specified component or one of its ancestors has the
         *         specified client property set to {@link Boolean#TRUE}, <code>false</code>
         *         otherwise.
         */
        private boolean hasClientPropertySetToTrue(Component c, String clientPropName) {
            while (c != null) {
                if (c instanceof JComponent) {
                    JComponent jc = (JComponent) c;
                    if (Boolean.TRUE.equals(jc.getClientProperty(clientPropName)))
                        return true;
                }
                c = c.getParent();
            }
            return false;
        }

        @Override
        public boolean contains(int x, int y) {
            // pass the mouse events to the underlying layers for
            // showing the correct cursor. See
            // http://weblogs.java.net/blog/alexfromsun/archive/2006/09/
            // a_wellbehaved_g.html
            return false;
        }
    }

    /**
     * Creates a new ribbon frame with no title.
     * 
     * @throws HeadlessException
     *             If GraphicsEnvironment.isHeadless() returns true.
     */
    public JRibbonFrame() throws HeadlessException {
        super();
        this.initRibbon();
    }

    /**
     * Creates a new ribbon frame with no title.
     * 
     * @param gc
     *            Graphics configuration to use.
     */
    public JRibbonFrame(GraphicsConfiguration gc) {
        super(gc);
        this.initRibbon();
    }

    /**
     * Creates a new ribbon frame with the specified title.
     * 
     * @param title
     *            Ribbon frame title.
     * @throws HeadlessException
     *             If GraphicsEnvironment.isHeadless() returns true.
     */
    public JRibbonFrame(String title) throws HeadlessException {
        super(title);
        this.initRibbon();
    }

    /**
     * Creates a new ribbon frame with the specified title.
     * 
     * @param title
     *            Ribbon frame title.
     * @param gc
     *            Graphics configuration to use.
     * @throws HeadlessException
     *             If GraphicsEnvironment.isHeadless() returns true.
     */
    public JRibbonFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
        this.initRibbon();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.JFrame#setLayout(java.awt.LayoutManager)
     */
    @Override
    public void setLayout(LayoutManager manager) {
        if (manager.getClass() != RibbonFrameLayout.class) {
            LayoutManager currManager = getLayout();
            if (currManager != null) {
                throw new IllegalArgumentException(
                        "Can't set a custom layout manager on JRibbonFrame");
            }
        }
        super.setLayout(manager);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.JFrame#setJMenuBar(javax.swing.JMenuBar)
     */
    @Override
    public void setJMenuBar(JMenuBar menubar) {
        throw new IllegalArgumentException("Can't set a menu bar on JRibbonFrame");
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.JFrame#setContentPane(java.awt.Container)
     */
    @Override
    public void setContentPane(Container contentPane) {
        throw new IllegalArgumentException("Can't set the content pane on JRibbonFrame");
    }

    /**
     * Initializes the layout and the ribbon.
     */
    private void initRibbon() {
        this.setLayout(new RibbonFrameLayout());
        this.ribbon = new JRibbon(this);
        this.add(this.ribbon, BorderLayout.NORTH);

        // this.keyTipManager = new KeyTipManager(this);
        Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
            private boolean prevAltModif = false;

            @Override
            public void eventDispatched(AWTEvent event) {
                Object src = event.getSource();
                if (src instanceof Component) {
                    Component c = (Component) src;
                    if ((c == JRibbonFrame.this)
                            || (SwingUtilities.getWindowAncestor(c) == JRibbonFrame.this)) {
                        if (event instanceof KeyEvent) {
                            KeyEvent keyEvent = (KeyEvent) event;
                            // System.out.println(keyEvent.getID() + ":"
                            // + keyEvent.getKeyCode());
                            switch (keyEvent.getID()) {
                            case KeyEvent.KEY_PRESSED:
                                // if (keyEvent.getKeyCode() ==
                                // KeyEvent.VK_ESCAPE) {
                                // keyTipManager.showPreviousChain();
                                // }

                                break;
                            case KeyEvent.KEY_RELEASED:
                                boolean wasAltModif = prevAltModif;
                                prevAltModif = keyEvent
                                        .getModifiersEx() == InputEvent.ALT_DOWN_MASK;
                                if (wasAltModif && keyEvent.getKeyCode() == KeyEvent.VK_ALT)
                                    break;
                                char keyChar = keyEvent.getKeyChar();
                                if (Character.isLetter(keyChar) || Character.isDigit(keyChar)) {
                                    // System.out.println("Will handle key press "
                                    // + keyChar);
                                    KeyTipManager.defaultManager().handleKeyPress(keyChar);
                                }
                                if ((keyEvent.getKeyCode() == KeyEvent.VK_ALT)
                                        || (keyEvent.getKeyCode() == KeyEvent.VK_F10)) {
                                    if (keyEvent.getModifiers() != 0
                                            || keyEvent.getModifiersEx() != 0)
                                        break;
                                    boolean hadPopups = !PopupPanelManager.defaultManager()
                                            .getShownPath().isEmpty();
                                    PopupPanelManager.defaultManager().hidePopups(null);
                                    if (hadPopups
                                            || KeyTipManager.defaultManager().isShowingKeyTips()) {
                                        KeyTipManager.defaultManager().hideAllKeyTips();
                                    } else {
                                        KeyTipManager.defaultManager()
                                                .showRootKeyTipChain(JRibbonFrame.this);
                                    }
                                }
                                if (keyEvent.getKeyCode() == KeyEvent.VK_ESCAPE) {
                                    // System.out.println("In KTM");
                                    KeyTipManager.defaultManager().showPreviousChain();
                                }
                                break;
                            }
                        }
                        if (event instanceof MouseEvent) {
                            MouseEvent mouseEvent = (MouseEvent) event;
                            switch (mouseEvent.getID()) {
                            case MouseEvent.MOUSE_CLICKED:
                            case MouseEvent.MOUSE_DRAGGED:
                            case MouseEvent.MOUSE_PRESSED:
                            case MouseEvent.MOUSE_RELEASED:
                                KeyTipManager.defaultManager().hideAllKeyTips();
                            }
                        }
                    }
                }
            }
        }, AWTEvent.KEY_EVENT_MASK | AWTEvent.MOUSE_EVENT_MASK);

        final KeyTipLayer keyTipLayer = new KeyTipLayer();
        JRootPane rootPane = this.getRootPane();
        JLayeredPane layeredPane = rootPane.getLayeredPane();
        final LayoutManager currLM = rootPane.getLayout();
        rootPane.setLayout(new LayoutManager() {
            public void addLayoutComponent(String name, Component comp) {
                currLM.addLayoutComponent(name, comp);
            }

            public void layoutContainer(Container parent) {
                currLM.layoutContainer(parent);
                JRibbonFrame ribbonFrame = JRibbonFrame.this;
                if (ribbonFrame.getRootPane().getWindowDecorationStyle() != JRootPane.NONE)
                    keyTipLayer.setBounds(ribbonFrame.getRootPane().getBounds());
                else
                    keyTipLayer.setBounds(ribbonFrame.getRootPane().getContentPane().getBounds());
            }

            public Dimension minimumLayoutSize(Container parent) {
                return currLM.minimumLayoutSize(parent);
            }

            public Dimension preferredLayoutSize(Container parent) {
                return currLM.preferredLayoutSize(parent);
            }

            public void removeLayoutComponent(Component comp) {
                currLM.removeLayoutComponent(comp);
            }
        });
        // layeredPane.setLayout(new OverlayLayout(layeredPane));
        layeredPane.add(keyTipLayer, (Integer) (JLayeredPane.DEFAULT_LAYER + 60));

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowDeactivated(WindowEvent e) {
                // hide all key tips on window deactivation
                KeyTipManager keyTipManager = KeyTipManager.defaultManager();
                if (keyTipManager.isShowingKeyTips()) {
                    keyTipManager.hideAllKeyTips();
                }
            }
        });

        KeyTipManager.defaultManager().addKeyTipListener(new KeyTipManager.KeyTipListener() {
            @Override
            public void keyTipsHidden(KeyTipEvent event) {
                if (event.getSource() == JRibbonFrame.this)
                    keyTipLayer.setVisible(false);
            }

            @Override
            public void keyTipsShown(KeyTipEvent event) {
                if (event.getSource() == JRibbonFrame.this)
                    keyTipLayer.setVisible(true);
            }
        });

        ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
        JPopupMenu.setDefaultLightWeightPopupEnabled(false);

        super.setIconImages(Arrays.asList(FlamingoUtilities.getBlankImage(16, 16)));
    }

    /**
     * Returns the ribbon component.
     * 
     * @return Ribbon component.
     */
    public JRibbon getRibbon() {
        return this.ribbon;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.JFrame#createRootPane()
     */
    @Override
    protected JRootPane createRootPane() {
        JRootPane rp = new JRibbonRootPane();
        rp.setOpaque(true);
        return rp;
    }

    @Override
    public synchronized void setIconImages(List<? extends Image> icons) {
        super.setIconImages(icons);
        this.wasSetIconImagesCalled = true;
    }

    public synchronized void setApplicationIcon(final ResizableIcon icon) {
        new Thread() {
            @Override
            public void run() {
                // still loading?
                if (icon instanceof AsynchronousLoading) {
                    AsynchronousLoading async = (AsynchronousLoading) icon;
                    if (async.isLoading()) {
                        final CountDownLatch latch = new CountDownLatch(1);
                        final boolean[] status = new boolean[1];
                        AsynchronousLoadListener all = (boolean success) -> {
                            status[0] = success;
                            latch.countDown();
                        };
                        async.addAsynchronousLoadListener(all);
                        try {
                            latch.await();
                        } catch (InterruptedException ie) {
                        }
                        async.removeAsynchronousLoadListener(all);
                    }
                }
                setApplicationAndMenuButtonIcon(icon);
            }
        }.start();
    }

    private void setApplicationAndMenuButtonIcon(final ResizableIcon icon) {
        if (System.getProperty("os.name").startsWith("Mac")) {
            final Image image16 = getImage(icon, 16);
            final Image image128 = getImage(icon, 128);
            SwingUtilities.invokeLater(() -> {
                if (image16 != null) {
                    setLegacyIconImages(Arrays.asList(image16));
                }
                if (image128 != null) {
                    try {
                        Class appClass = Class.forName("com.apple.eawt.Application");
                        if (appClass != null) {
                            Object appInstance = appClass.newInstance();
                            Method setDockImageMethod = appClass
                                    .getDeclaredMethod("setDockIconImage", Image.class);
                            if (setDockImageMethod != null) {
                                setDockImageMethod.invoke(appInstance, image128);
                            }
                        }
                    } catch (Throwable t) {
                        t.printStackTrace();
                        // give up
                    }
                }
                setMainAppIcon(icon);
            });
        } else {
            final List<Image> images = new ArrayList<Image>();
            Image icon16 = getImage(icon, 16);
            if (icon16 != null)
                images.add(icon16);
            Image icon32 = getImage(icon, 32);
            if (icon32 != null)
                images.add(icon32);
            Image icon64 = getImage(icon, 64);
            if (icon64 != null)
                images.add(icon64);
            SwingUtilities.invokeLater(() -> {
                if (!images.isEmpty())
                    setLegacyIconImages(images);
                setMainAppIcon(icon);
            });
        }
    }

    private void setMainAppIcon(ResizableIcon icon) {
        this.appIcon = icon;
        FlamingoUtilities.updateRibbonFrameIconImages(this);
    }

    private void setLegacyIconImages(List<Image> images) {
        if (this.wasSetIconImagesCalled) {
            return;
        }
        super.setIconImages(images);
    }

    private static Image getImage(ResizableIcon icon, int size) {
        icon.setDimension(new Dimension(size, size));
        if (icon instanceof AsynchronousLoading) {
            AsynchronousLoading async = (AsynchronousLoading) icon;
            if (async.isLoading()) {
                final CountDownLatch latch = new CountDownLatch(1);
                final boolean[] status = new boolean[1];
                AsynchronousLoadListener all = (boolean success) -> {
                    status[0] = success;
                    latch.countDown();
                };
                async.addAsynchronousLoadListener(all);
                try {
                    latch.await();
                } catch (InterruptedException ie) {
                }
                async.removeAsynchronousLoadListener(all);
                if (!status[0]) {
                    return null;
                }
                if (async.isLoading()) {
                    return null;
                }
            }
        }
        Image result = FlamingoUtilities.getBlankImage(size, size);
        Graphics2D g2d = (Graphics2D) result.getGraphics().create();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();
        return result;
    }

    public synchronized ResizableIcon getApplicationIcon() {
        return this.appIcon;
    }

    /**
     * Returns indication whether this ribbon frame is showing the key tips.
     * 
     * @return <code>true</code> if this ribbon frame is showing the key tips, <code>false</code>
     *         otherwise.
     */
    public boolean isShowingKeyTips() {
        return KeyTipManager.defaultManager().isShowingKeyTips();
    }
}
