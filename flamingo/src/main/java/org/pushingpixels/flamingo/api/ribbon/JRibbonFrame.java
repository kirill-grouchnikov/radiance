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
package org.pushingpixels.flamingo.api.ribbon;

import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandMenuContentModel;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.JPopupPanel;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager;
import org.pushingpixels.flamingo.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.flamingo.api.common.projection.CommandButtonProjection;
import org.pushingpixels.flamingo.api.common.projection.CommandPopupMenuProjection;
import org.pushingpixels.flamingo.api.common.projection.Projection;
import org.pushingpixels.flamingo.api.ribbon.projection.RibbonGalleryProjection;
import org.pushingpixels.flamingo.api.ribbon.synapse.model.ComponentContentModel;
import org.pushingpixels.flamingo.api.ribbon.synapse.projection.ComponentProjection;
import org.pushingpixels.flamingo.internal.substance.ribbon.ui.SubstanceRibbonFrameTitlePane;
import org.pushingpixels.flamingo.internal.ui.common.FlamingoInternalButton;
import org.pushingpixels.flamingo.internal.ui.ribbon.*;
import org.pushingpixels.flamingo.internal.utils.FlamingoUtilities;
import org.pushingpixels.flamingo.internal.utils.KeyTipManager;
import org.pushingpixels.flamingo.internal.utils.KeyTipManager.KeyTipEvent;
import org.pushingpixels.flamingo.internal.utils.KeyTipRenderingUtilities;
import org.pushingpixels.neon.api.AsynchronousLoadListener;
import org.pushingpixels.neon.api.AsynchronousLoading;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstancePopupContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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
 * interferes with the intended hierarchy of this frame.
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

    private AWTEventListener awtEventListener;
    private KeyTipManager.KeyTipListener keyTipListener;

    /**
     * Custom layout manager that enforces the {@link JRibbon} location at
     * {@link BorderLayout#NORTH}.
     *
     * @author Kirill Grouchnikov
     */
    private static class RibbonFrameLayout extends BorderLayout {
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
    private static class KeyTipLayer extends JComponent {
        /**
         * Creates a new key tip layer.
         */
        public KeyTipLayer() {
            this.setOpaque(false);

            // Support placing heavyweight components in the ribbon frame. See
            // https://community.oracle.com/docs/DOC-982814.
            this.setMixingCutoutShape(new Rectangle());
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
            // https://community.oracle.com/blogs/alexfromsun/2006/09/20/well-behaved-glasspane
            return false;
        }
    }

    public static class RibbonKeyboardAction {
        private String actionName;
        private KeyStroke actionKeyStroke;
        private Command command;

        public RibbonKeyboardAction(String actionName, KeyStroke actionKeyStroke, Command command) {
            this.actionName = actionName;
            this.actionKeyStroke = actionKeyStroke;
            this.command = command;
        }

        public String getActionName() {
            return actionName;
        }

        public KeyStroke getActionKeyStroke() {
            return actionKeyStroke;
        }

        public Command getCommand() {
            return command;
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

        final KeyTipManager keyTipManager = KeyTipManager.defaultManager();
        this.awtEventListener = new AWTEventListener() {
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
                                    prevAltModif = (keyEvent.getModifiersEx() == InputEvent.ALT_DOWN_MASK);
                                    if (wasAltModif && keyEvent.getKeyCode() == KeyEvent.VK_ALT) {
                                        break;
                                    }
                                    char keyChar = keyEvent.getKeyChar();
                                    if (Character.isLetter(keyChar) || Character.isDigit(keyChar)) {
                                        // System.out.println("Will handle key press "
                                        // + keyChar);
                                        keyTipManager.handleKeyPress(keyChar);
                                    }
                                    if ((keyEvent.getKeyCode() == KeyEvent.VK_ALT)
                                            || (keyEvent.getKeyCode() == KeyEvent.VK_F10)) {
                                        if (keyEvent.getModifiersEx() != 0) {
                                            break;
                                        }
                                        boolean hadPopups = !PopupPanelManager.defaultManager()
                                                .getShownPath().isEmpty();
                                        PopupPanelManager.defaultManager().hidePopups(null);
                                        if (hadPopups || keyTipManager.isShowingKeyTips()) {
                                            keyTipManager.hideAllKeyTips();
                                        } else {
                                            keyTipManager.showRootKeyTipChain(JRibbonFrame.this);
                                        }
                                    }
                                    if (keyEvent.getKeyCode() == KeyEvent.VK_ESCAPE) {
                                        // Dismiss keytips if showing
                                        if (keyTipManager.isShowingKeyTips()) {
                                            keyTipManager.showPreviousChain();
                                        }
                                    }
                                    if (keyTipManager.isShowingKeyTips()) {
                                        // Traversal of ribbon tasks while keytips are showing
                                        switch (keyEvent.getKeyCode()) {
                                            case KeyEvent.VK_LEFT:
                                                RibbonTask previous = getPreviousRibbonTask();
                                                if (previous != null) {
                                                    ribbon.setSelectedTask(previous);
                                                }
                                                break;
                                            case KeyEvent.VK_RIGHT:
                                                RibbonTask next = getNextRibbonTask();
                                                if (next != null) {
                                                    ribbon.setSelectedTask(next);
                                                }
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        if (event instanceof MouseEvent) {
                            MouseEvent mouseEvent = (MouseEvent) event;
                            switch (mouseEvent.getID()) {
                                case MouseEvent.MOUSE_CLICKED:
                                case MouseEvent.MOUSE_DRAGGED: {
                                    keyTipManager.hideAllKeyTips();
                                    break;
                                }
                                case MouseEvent.MOUSE_PRESSED:
                                case MouseEvent.MOUSE_RELEASED: {
                                    keyTipManager.hideAllKeyTips();
                                    if (mouseEvent.isPopupTrigger()) {
                                        // Note that we need to find the deepest component
                                        // under the mouse event so that it is then routed
                                        // properly to the ribbon contextual click listener
                                        handlePopupTrigger(mouseEvent,
                                                SwingUtilities.getDeepestComponentAt(c,
                                                        mouseEvent.getX(), mouseEvent.getY()));
                                    } else if (mouseEvent.getID() == MouseEvent.MOUSE_PRESSED) {
                                        if (SwingUtilities.getAncestorOfClass(JPopupPanel.class, c)
                                                == null) {
                                            PopupPanelManager.defaultManager().hidePopups(null);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        };

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

        this.keyTipListener = new KeyTipManager.KeyTipListener() {
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
        };

        ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
        JPopupMenu.setDefaultLightWeightPopupEnabled(false);

        super.setIconImages(Collections.singletonList(SubstanceCoreUtilities.getBlankImage(
                NeonCortex.getScaleFactor(null), 16, 16)));
    }

    @Override
    public void dispose() {
        SubstanceCoreUtilities.unregisterAWTEventListener(this.awtEventListener);
        KeyTipManager.defaultManager().removeKeyTipListener(this.keyTipListener);
        super.dispose();
    }

    @SuppressWarnings("deprecation")
    @Override
    public void show() {
        super.show();
        SubstanceCoreUtilities.registerAWTEventListener(this.awtEventListener);
        KeyTipManager.defaultManager().addKeyTipListener(this.keyTipListener);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void hide() {
        SubstanceCoreUtilities.unregisterAWTEventListener(this.awtEventListener);
        KeyTipManager.defaultManager().removeKeyTipListener(this.keyTipListener);
        super.hide();
    }

    private boolean isValidPopupTriggerSource(Component c) {
        if (SwingUtilities.getAncestorOfClass(GlobalPopupMenu.class, c) != null) {
            // Don't display context menu on context menu entries
            return false;
        }

        if ((SwingUtilities.getAncestorOfClass(JRibbon.class, c) != null) ||
                (SwingUtilities.getAncestorOfClass(SubstanceRibbonFrameTitlePane.class,
                        c) != null)) {
            // If the component is in the ribbon or in the ribbon frame title pane, it's valid
            return true;
        }

        // Is it in a popup panel?
        JPopupPanel popupPanel = (JPopupPanel) SwingUtilities.getAncestorOfClass(
                JPopupPanel.class, c);
        if (popupPanel == null) {
            return false;
        }

        while (true) {
            JComponent popupInvoker = popupPanel.getInvoker();
            if (popupInvoker == null) {
                return false;
            }
            // Are we in a multi-cascade popup chain?
            popupPanel = (JPopupPanel) SwingUtilities.getAncestorOfClass(
                    JPopupPanel.class, popupInvoker);
            if (popupPanel != null) {
                continue;
            }

            // At the "top" level of the popup chain
            // If the component is in the ribbon or in the ribbon frame title pane, it's valid
            boolean isValidChainRoot =
                    (SwingUtilities.getAncestorOfClass(JRibbon.class, popupInvoker) != null) ||
                            (SwingUtilities.getAncestorOfClass(SubstanceRibbonFrameTitlePane.class,
                                    popupInvoker) != null);
            return isValidChainRoot;
        }
    }

    private boolean isInTaskbar(Component c) {
        if (SwingUtilities.getAncestorOfClass(SubstanceRibbonFrameTitlePane.class, c) != null) {
            return true;
        }

        // Is it in a popup panel?
        JPopupPanel popupPanel = (JPopupPanel) SwingUtilities.getAncestorOfClass(
                JPopupPanel.class, c);
        if (popupPanel == null) {
            return false;
        }

        while (true) {
            JComponent popupInvoker = popupPanel.getInvoker();
            if (popupInvoker == null) {
                return false;
            }
            // Are we in a multi-cascade popup chain?
            popupPanel = (JPopupPanel) SwingUtilities.getAncestorOfClass(
                    JPopupPanel.class, popupInvoker);
            if (popupPanel != null) {
                continue;
            }

            // At the "top" level of the popup chain
            return (SwingUtilities.getAncestorOfClass(SubstanceRibbonFrameTitlePane.class,
                    popupInvoker) != null);
        }
    }

    @SubstancePopupContainer
    public static class GlobalPopupMenu extends JCommandPopupMenu {
        public GlobalPopupMenu(Projection<JCommandPopupMenu, CommandMenuContentModel,
                CommandPopupMenuPresentationModel> projection) {
            super(projection);
        }
    }

    @SuppressWarnings("unchecked")
    private void handlePopupTrigger(MouseEvent event, Component c) {
        if (!isValidPopupTriggerSource(c)) {
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
        if (isInTaskbar(c)) {
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
                CommandButtonProjection<? extends Command> commandButtonProjection =
                        (CommandButtonProjection<? extends Command>) projection;
                menuContentModel = onShowContextualMenuListener.getContextualMenuContentModel(
                        commandButtonProjection);
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
                    if ((c instanceof JCommandButton) &&
                            (!(c instanceof FlamingoInternalButton))) {
                        menuContentModel =
                                onShowContextualMenuListener.getContextualMenuContentModel(
                                        ((JCommandButton) c).getProjection());
                    }
                }
            }
        }

        if (menuContentModel == null) {
            // If the popup trigger is not on any of the "supported" ribbon content, ask the
            // application to provide the general contextual menu items
            menuContentModel = onShowContextualMenuListener.getContextualMenuContentModel();
        }

        CommandPopupMenuProjection globalContextMenuProjection = new CommandPopupMenuProjection(
                menuContentModel,
                CommandPopupMenuPresentationModel.builder()
                        .setMenuPresentationState(CommandButtonPresentationState.MEDIUM)
                        .build());
        globalContextMenuProjection.setComponentSupplier(projection -> GlobalPopupMenu::new);
        final JCommandPopupMenu menu = globalContextMenuProjection.buildComponent();

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

        PopupPanelManager.defaultManager().hidePopups(c);
        Popup popup = PopupFactory.getSharedInstance().getPopup(ribbon, menu, x, y);
        PopupPanelManager.defaultManager().addPopup((JComponent) c, popup, menu);
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

    public void setKeyboardActions(Set<RibbonKeyboardAction> actions) {
        JRibbonRootPane rootPane = (JRibbonRootPane) this.getRootPane();
        rootPane.setKeyboardActions(actions);
    }

    @Override
    public synchronized void setIconImages(List<? extends Image> icons) {
        super.setIconImages(icons);
        this.wasSetIconImagesCalled = true;
    }

    public synchronized void setApplicationIcon(final ResizableIcon.Factory iconFactory) {
        if (iconFactory == null) {
            return;
        }
        // Important - the work to convert the resizable icon content to images suited
        // to be passed to the underlying Swing / platform APIs needs to happen off the
        // UI thread.
        new Thread(() -> setApplicationAndMenuButtonIcon(iconFactory)).start();
    }

    private void setApplicationAndMenuButtonIcon(final ResizableIcon.Factory iconFactory) {
        final Image icon16 = getImage(iconFactory, 16);
        if (NeonCortex.getPlatform() == NeonCortex.Platform.MACOS) {
            SwingUtilities.invokeLater(() -> setLegacyIconImages(
                    Collections.singletonList(icon16)));
        } else {
            SwingUtilities.invokeLater(() -> setLegacyIconImages(Arrays.asList(icon16,
                    getImage(iconFactory, 32), getImage(iconFactory, 64))));
        }
        // Set the taskbar / dock icon
        SwingUtilities.invokeLater(() -> {
            Taskbar taskbar = Taskbar.getTaskbar();
            if (taskbar.isSupported(Taskbar.Feature.ICON_IMAGE)) {
                taskbar.setIconImage(getImage(iconFactory, 256));
            }
        });
    }

    private void setLegacyIconImages(List<Image> images) {
        if (this.wasSetIconImagesCalled) {
            return;
        }
        super.setIconImages(images);
    }

    private static Image getImage(ResizableIcon.Factory iconFactory, int size) {
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
        Image result = SubstanceCoreUtilities.getBlankImage(
                NeonCortex.getScaleFactor(null), size, size);
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

    private List<RibbonTask> getAllShownRibbonTasks() {
        List<RibbonTask> result = new ArrayList<>();
        for (int i = 0; i < this.ribbon.getTaskCount(); i++) {
            result.add(this.ribbon.getTask(i));
        }
        for (int i = 0; i < this.ribbon.getContextualTaskGroupCount(); i++) {
            RibbonContextualTaskGroup curr = this.ribbon.getContextualTaskGroup(i);
            if (this.ribbon.isVisible(curr)) {
                for (int j = 0; j < curr.getTaskCount(); j++) {
                    result.add(curr.getTask(j));
                }
            }
        }

        return Collections.unmodifiableList(result);
    }

    private RibbonTask getNextRibbonTask() {
        List<RibbonTask> all = getAllShownRibbonTasks();
        int indexOfCurrent = all.indexOf(this.ribbon.getSelectedTask());
        if (indexOfCurrent < 0) {
            return null;
        }
        if (indexOfCurrent == (all.size() - 1)) {
            return null;
        }
        return all.get(indexOfCurrent + 1);
    }

    private RibbonTask getPreviousRibbonTask() {
        List<RibbonTask> all = getAllShownRibbonTasks();
        int indexOfCurrent = all.indexOf(this.ribbon.getSelectedTask());
        if (indexOfCurrent < 0) {
            return null;
        }
        if (indexOfCurrent == 0) {
            return null;
        }
        return all.get(indexOfCurrent - 1);
    }
}
