/*
 * Copyright (c) 2005-2019 Flamingo Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.*;
import org.pushingpixels.flamingo.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.flamingo.api.common.projection.*;
import org.pushingpixels.flamingo.api.ribbon.projection.RibbonGalleryProjection;
import org.pushingpixels.flamingo.api.ribbon.synapse.model.ComponentContentModel;
import org.pushingpixels.flamingo.api.ribbon.synapse.projection.ComponentProjection;
import org.pushingpixels.flamingo.internal.substance.ribbon.ui.SubstanceRibbonFrameTitlePane;
import org.pushingpixels.flamingo.internal.ui.common.FlamingoInternalButton;
import org.pushingpixels.flamingo.internal.ui.ribbon.*;
import org.pushingpixels.flamingo.internal.utils.*;
import org.pushingpixels.flamingo.internal.utils.KeyTipManager.KeyTipEvent;
import org.pushingpixels.neon.*;
import org.pushingpixels.neon.icon.*;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Method;
import java.util.List;
import java.util.*;
import java.util.concurrent.CountDownLatch;

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
            if (!ribbonFrame.isShowingKeyTips()) {
                return;
            }

            // don't show keytips on inactive windows
            if (!ribbonFrame.isActive()) {
                return;
            }

            Collection<KeyTipManager.KeyTipLink> keyTips = KeyTipManager.defaultManager()
                    .getCurrentlyShownKeyTips();
            if (keyTips != null) {
                Graphics2D g2d = (Graphics2D) g.create();
                NeonCortex.installDesktopHints(g2d, getFont());

                for (KeyTipManager.KeyTipLink keyTip : keyTips) {
                    // Components in generic popup panels do not display keytips as that interferes
                    // with the popup layer in the root pane. However, there is a special treatment
                    // for the taskbar overflow popup where the height is limited and we push the
                    // key tips to be displayed below the popup.
                    boolean isInPopup = (SwingUtilities.getAncestorOfClass(
                            JPopupPanel.class, keyTip.comp) != null);
                    if (isInPopup && (SwingUtilities.getAncestorOfClass(
                            SubstanceRibbonFrameTitlePane.TaskbarOverflowPopupPanel.class,
                            keyTip.comp) == null)) {
                        continue;
                    }

                    // don't display key tips on hidden components
                    Rectangle compBounds = keyTip.comp.getBounds();
                    if (!keyTip.comp.isShowing() || (compBounds.getWidth() == 0)
                            || (compBounds.getHeight() == 0)) {
                        continue;
                    }

                    Dimension pref = KeyTipRenderingUtilities.getPrefSize(g2d.getFontMetrics(),
                            keyTip.keyTipString);

                    Point prefCenter = keyTip.prefAnchorPoint;
                    Point loc = SwingUtilities.convertPoint(keyTip.comp, prefCenter, this);
                    Container bandControlPanel = SwingUtilities
                            .getAncestorOfClass(AbstractBandControlPanel.class, keyTip.comp);
                    if (bandControlPanel != null) {
                        // special case for controls in threesome ribbon band rows
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

                    Container taskbarOverflowPanel = SwingUtilities
                            .getAncestorOfClass(
                                    SubstanceRibbonFrameTitlePane.TaskbarOverflowPopupPanel.class,
                                    keyTip.comp);
                    if (taskbarOverflowPanel != null) {
                        // special case for controls in taskbar overflow - push them down
                        loc = SwingUtilities.convertPoint(keyTip.comp, prefCenter,
                                taskbarOverflowPanel);
                        loc.y = pref.height / 2 + taskbarOverflowPanel.getHeight();
                        loc = SwingUtilities.convertPoint(taskbarOverflowPanel, loc, this);
                    }

                    Container titlePane = SwingUtilities
                            .getAncestorOfClass(SubstanceRibbonFrameTitlePane.class,
                                    keyTip.comp);
                    if (titlePane != null) {
                        // special case for controls in title pane (taskbar)
                        loc = SwingUtilities.convertPoint(keyTip.comp, prefCenter,
                                titlePane);
                        loc.y = pref.height / 2 + titlePane.getHeight() / 2;
                        loc = SwingUtilities.convertPoint(titlePane, loc, this);
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
         * @param c              Component.
         * @param clientPropName Client property name.
         * @return <code>true</code> if the specified component or one of its ancestors has the
         * specified client property set to {@link Boolean#TRUE}, <code>false</code>
         * otherwise.
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
     * @throws HeadlessException If GraphicsEnvironment.isHeadless() returns true.
     */
    public JRibbonFrame() throws HeadlessException {
        super();
        this.initRibbon();
    }

    /**
     * Creates a new ribbon frame with no title.
     *
     * @param gc Graphics configuration to use.
     */
    public JRibbonFrame(GraphicsConfiguration gc) {
        super(gc);
        this.initRibbon();
    }

    /**
     * Creates a new ribbon frame with the specified title.
     *
     * @param title Ribbon frame title.
     * @throws HeadlessException If GraphicsEnvironment.isHeadless() returns true.
     */
    public JRibbonFrame(String title) throws HeadlessException {
        super(title);
        this.initRibbon();
    }

    /**
     * Creates a new ribbon frame with the specified title.
     *
     * @param title Ribbon frame title.
     * @param gc    Graphics configuration to use.
     * @throws HeadlessException If GraphicsEnvironment.isHeadless() returns true.
     */
    public JRibbonFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
        this.initRibbon();
    }

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

    @Override
    public void setJMenuBar(JMenuBar menubar) {
        throw new IllegalArgumentException("Can't set a menu bar on JRibbonFrame");
    }

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
                                case KeyEvent.KEY_RELEASED:
                                    boolean wasAltModif = prevAltModif;
                                    prevAltModif =
                                            keyEvent.getModifiersEx() == InputEvent.ALT_DOWN_MASK;
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
                                        if (keyEvent.getModifiersEx() != 0) {
                                            break;
                                        }
                                        boolean hadPopups = !PopupPanelManager.defaultManager()
                                                .getShownPath().isEmpty();
                                        PopupPanelManager.defaultManager().hidePopups(null);
                                        if (hadPopups
                                                || KeyTipManager.defaultManager()
                                                .isShowingKeyTips()) {
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
                                case MouseEvent.MOUSE_DRAGGED: {
                                    KeyTipManager.defaultManager().hideAllKeyTips();
                                    break;
                                }
                                case MouseEvent.MOUSE_PRESSED:
                                case MouseEvent.MOUSE_RELEASED: {
                                    KeyTipManager.defaultManager().hideAllKeyTips();
                                    if (mouseEvent.isPopupTrigger()) {
                                        // Note that we need to find the deepest component
                                        // under the mouse event so that it is then routed
                                        // properly to the ribbon contextual click listener
                                        handlePopupTrigger(mouseEvent,
                                                SwingUtilities.getDeepestComponentAt(c,
                                                        mouseEvent.getX(), mouseEvent.getY()));
                                    }
                                }
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
                if (ribbonFrame.getRootPane().getWindowDecorationStyle() != JRootPane.NONE) {
                    keyTipLayer.setBounds(ribbonFrame.getRootPane().getBounds());
                } else {
                    keyTipLayer.setBounds(ribbonFrame.getRootPane().getContentPane().getBounds());
                }
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
                if (event.getSource() == JRibbonFrame.this) {
                    keyTipLayer.setVisible(false);
                }
            }

            @Override
            public void keyTipsShown(KeyTipEvent event) {
                if (event.getSource() == JRibbonFrame.this) {
                    keyTipLayer.setVisible(true);
                }
            }
        });

        RichTooltipManager.sharedInstance();

        ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
        JPopupMenu.setDefaultLightWeightPopupEnabled(false);

        super.setIconImages(Collections.singletonList(
                SubstanceCoreUtilities.getBlankImage(16, 16)));
    }

    private void handlePopupTrigger(MouseEvent event, Component c) {
        if ((SwingUtilities.getAncestorOfClass(JRibbon.class, c) == null) &&
                (SwingUtilities.getAncestorOfClass(SubstanceRibbonFrameTitlePane.class,
                        c) == null)) {
            // Component not in the ribbon. Do nothing.
            return;
        }

        JRibbon.OnShowContextualMenuListener onShowContextualMenuListener =
                this.ribbon.getOnShowContextualMenuListener();
        if (onShowContextualMenuListener == null) {
            return;
        }

        CommandMenuContentModel menuContentModel = null;
        // Special case - the component is in the taskbar.
        if (SwingUtilities.getAncestorOfClass(SubstanceRibbonFrameTitlePane.class, c) != null) {
            Object projection = null;
            // Is it a wrapped component
            JRibbonComponent taskbarWrapped = (JRibbonComponent) SwingUtilities.getAncestorOfClass(
                    JRibbonComponent.class, c);
            if (taskbarWrapped != null) {
                projection = taskbarWrapped.getClientProperty(FlamingoUtilities.TASKBAR_PROJECTION);
            } else {
                projection = ((JComponent) c).getClientProperty(
                        FlamingoUtilities.TASKBAR_PROJECTION);
            }
            if (projection instanceof RibbonGalleryProjection) {
                menuContentModel = onShowContextualMenuListener.getContextualMenuContentModel(
                        (RibbonGalleryProjection) projection);
            } else if (projection instanceof ComponentProjection) {
                menuContentModel = onShowContextualMenuListener.getContextualMenuContentModel(
                        (ComponentProjection<? extends JComponent, ?
                                extends ComponentContentModel>) projection);
            } else if (projection instanceof CommandButtonProjection) {
                menuContentModel = onShowContextualMenuListener.getContextualMenuContentModel(
                        (CommandButtonProjection<? extends Command>) projection);
            } else {
                menuContentModel = onShowContextualMenuListener.getContextualMenuContentModel();
            }
        } else {
            // Special case - popup trigger in a ribbon gallery
            JRibbonGallery gallery = (JRibbonGallery) SwingUtilities.getAncestorOfClass(
                    JRibbonGallery.class, c);
            if (gallery != null) {
                menuContentModel = onShowContextualMenuListener.getContextualMenuContentModel(
                        gallery.getProjection());
            } else {
                // Another special case - wrapped component
                JRibbonComponent component = (JRibbonComponent) SwingUtilities.getAncestorOfClass(
                        JRibbonComponent.class, c);
                if (component != null) {
                    menuContentModel = onShowContextualMenuListener.getContextualMenuContentModel(
                            component.getProjection());
                } else {
                    if ((c instanceof AbstractCommandButton) &&
                            (!(c instanceof FlamingoInternalButton))) {
                        menuContentModel =
                                onShowContextualMenuListener.getContextualMenuContentModel(
                                        ((AbstractCommandButton) c).getProjection());
                    }
                }
            }
        }

        if (menuContentModel == null) {
            // If the popup trigger is not on any of the "supported" ribbon content, ask the
            // application to provide the general contextual menu items
            menuContentModel = onShowContextualMenuListener.getContextualMenuContentModel();
        }

        final JCommandPopupMenu menu = new CommandPopupMenuProjection(menuContentModel,
                CommandPopupMenuPresentationModel.builder()
                        .setMenuPresentationState(CommandButtonPresentationState.MEDIUM)
                        .build())
                .buildComponent();

        int x = event.getXOnScreen();
        int y = event.getYOnScreen();
        Rectangle scrBounds = this.ribbon.getGraphicsConfiguration().getBounds();
        int pw = menu.getPreferredSize().width;
        if ((x + pw) > (scrBounds.x + scrBounds.width)) {
            x = scrBounds.x + scrBounds.width - pw;
        }
        int ph = menu.getPreferredSize().height;
        if ((y + ph) > (scrBounds.y + scrBounds.height)) {
            y = scrBounds.y + scrBounds.height - ph;
        }

        Popup popup = PopupFactory.getSharedInstance().getPopup(this.ribbon, menu, x, y);
        PopupPanelManager.defaultManager().addPopup(this.ribbon, popup, menu);
    }

    /**
     * Returns the ribbon component.
     *
     * @return Ribbon component.
     */
    public JRibbon getRibbon() {
        return this.ribbon;
    }

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

    public synchronized void setApplicationIcon(final ResizableIconFactory iconFactory) {
        if (iconFactory == null) {
            return;
        }
        // Important - the work to convert the resizable icon content to images suited
        // to be passed to the underlying Swing / platform APIs needs to happen off the
        // UI thread.
        new Thread(() -> setApplicationAndMenuButtonIcon(iconFactory)).start();
    }

    private void setApplicationAndMenuButtonIcon(final ResizableIconFactory iconFactory) {
        final Image icon16 = getImage(iconFactory, 16);
        if (NeonCortex.getPlatform() == NeonCortex.Platform.MACOS) {
            SwingUtilities.invokeLater(() -> setLegacyIconImages(
                    Collections.singletonList(icon16)));
        } else {
            SwingUtilities.invokeLater(() -> setLegacyIconImages(Arrays.asList(icon16,
                    getImage(iconFactory, 32), getImage(iconFactory, 64))));
        }
    }

    private void setLegacyIconImages(List<Image> images) {
        if (this.wasSetIconImagesCalled) {
            return;
        }
        super.setIconImages(images);
    }

    private static Image getImage(ResizableIconFactory iconFactory, int size) {
        ResizableIcon icon = iconFactory.createNewIcon();
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
        Image result = SubstanceCoreUtilities.getBlankImage(size, size);
        Graphics2D g2d = (Graphics2D) result.getGraphics().create();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();
        return result;
    }

    /**
     * Returns indication whether this ribbon frame is showing the key tips.
     *
     * @return <code>true</code> if this ribbon frame is showing the key tips, <code>false</code>
     * otherwise.
     */
    public boolean isShowingKeyTips() {
        return KeyTipManager.defaultManager().isShowingKeyTips();
    }
}
