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
package org.pushingpixels.radiance.theming.internal.ui;

import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingWidget;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.RadianceThemingWidgetRepository;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicRootPaneUI;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Set;

/**
 * UI for root panes in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 * @author Larry Salibra (fix for defect 198)
 */
public class RadianceRootPaneUI extends BasicRootPaneUI {
    private enum CursorState {
        EXITED, ENTERED, NIL
    }

    /**
     * The amount of space (in pixels) that the cursor is changed on.
     */
    private static final int CORNER_DRAG_WIDTH = 16;

    /**
     * Region from edges that dragging is active from.
     */
    private static final int BORDER_DRAG_THICKNESS = 5;

    /**
     * Window the <code>JRootPane</code> is in.
     */
    private Window window;

    /**
     * <code>JComponent</code> providing window decorations. This will be null if not providing
     * window decorations.
     */
    private RadianceTitlePane titlePane;

    private boolean isContentExtendingIntoTitlePane;

    /**
     * <code>MouseInputListener</code> that is added to the parent <code>Window</code> the
     * <code>JRootPane</code> is contained in.
     */
    private MouseInputListener radianceMouseInputListener;

    /**
     * Mouse listener on the title pane (dragging).
     */
    private MouseInputListener radianceTitleMouseInputListener;

    /**
     * The <code>LayoutManager</code> that is set on the <code>JRootPane</code>.
     */
    private LayoutManager layoutManager;

    /**
     * <code>LayoutManager</code> of the <code>JRootPane</code> before we replaced it.
     */
    private LayoutManager savedOldLayout;

    /**
     * <code>JRootPane</code> providing the look and feel for.
     */
    private JRootPane root;

    /**
     * Window listener that stops all Radiance threads when the last frame is disposed.
     */
    private WindowListener radianceWindowListener;

    /**
     * The current window.
     */
    private Window radianceCurrentWindow;

    /**
     * Hierarchy listener to keep track of the associated top-level window.
     */
    private HierarchyListener radianceHierarchyListener;

    /**
     * Component listener to keep track of the primary graphics configuration (for recomputing the
     * maximized bounds) - fix for defect 213.
     */
    private ComponentListener radianceWindowComponentListener;

    /**
     * The graphics configuration that contains the top-left corner of the window (fix for defect
     * 213).
     */
    private GraphicsConfiguration currentRootPaneGC;

    private PropertyChangeListener radiancePropertyChangeListener;

    /**
     * <code>Cursor</code> used to track the cursor set by the user. This is initially
     * <code>Cursor.DEFAULT_CURSOR</code>.
     */
    private Cursor lastCursor = Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);

    /**
     * Optimization to speed up the {@link RadianceCoreUtilities#getSkin(Component)}
     * implementation.
     */
    private static int rootPanesWithCustomSkin = 0;

    private Set<RadianceThemingWidget<JComponent>> themingWidgets;

    /**
     * Creates a UI for a <code>JRootPane</code>.
     *
     * @param comp the JRootPane the RootPaneUI will be created for
     * @return the RootPaneUI implementation for the passed in JRootPane
     */
    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceRootPaneUI();
    }

    protected RadianceRootPaneUI() {
    }

    /**
     * Invokes supers implementation of <code>installUI</code> to install the necessary state onto
     * the passed in <code>JRootPane</code> to render the metal look and feel implementation of
     * <code>RootPaneUI</code>. If the <code>windowDecorationStyle</code> property of the
     * <code>JRootPane</code> is other than <code>JRootPane.NONE</code>, this will add a custom
     * <code>Component</code> to render the widgets to <code>JRootPane</code>, as well as installing
     * a custom <code>Border</code> and <code>LayoutManager</code> on the <code>JRootPane</code>.
     *
     * @param c the JRootPane to install state onto
     */
    @Override
    public void installUI(JComponent c) {
        this.themingWidgets = RadianceThemingWidgetRepository.getRepository().getMatchingWidgets(c);

        super.installUI(c);

        this.root = (JRootPane) c;
        int style = this.root.getWindowDecorationStyle();
        if (style != JRootPane.NONE) {
            this.installClientDecorations(this.root);
        }

        if (RadianceCoreUtilities.isRootPaneModified(this.root)) {
            propagateModificationState();
        }

        if (this.root.getClientProperty(RadianceSynapse.ROOT_PANE_SKIN) instanceof RadianceSkin) {
            rootPanesWithCustomSkin++;
        }

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installUI();
        }
    }

    /**
     * Invokes super implementation to uninstall any of its state. This will also reset the
     * <code>LayoutManager</code> of the <code>JRootPane</code>. If a <code>Component</code> has
     * been added to the <code>JRootPane</code> to render the window decoration style, this method
     * will remove it. Similarly, this will revert the Border and LayoutManager of the
     * <code>JRootPane</code> to what it was before <code>installUI</code> was invoked.
     *
     * @param c the JRootPane to uninstall state from
     */
    @Override
    public void uninstallUI(JComponent c) {
        super.uninstallUI(c);
        this.uninstallClientDecorations(this.root);

        this.layoutManager = null;
        this.radianceMouseInputListener = null;

        if (this.root.getClientProperty(RadianceSynapse.ROOT_PANE_SKIN) instanceof RadianceSkin) {
            rootPanesWithCustomSkin--;
        }

        this.root = null;

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallUI();
        }
    }

    /**
     * Installs the appropriate <code>Border</code> onto the <code>JRootPane</code>.
     *
     * @param root Root pane.
     */
    public void installBorder(JRootPane root) {
        int style = root.getWindowDecorationStyle();

        if (style == JRootPane.NONE) {
            LookAndFeel.uninstallBorder(root);
        } else {
            LookAndFeel.installBorder(root, "RootPane.border");
        }
    }

    /**
     * Removes any border that may have been installed.
     *
     * @param root Root pane.
     */
    private void uninstallBorder(JRootPane root) {
        LookAndFeel.uninstallBorder(root);
    }

    @Override
    protected void installDefaults(JRootPane c) {
        super.installDefaults(c);
        // support for per-window skins
        Color backgr = c.getBackground();
        if ((backgr == null) || (backgr instanceof UIResource)) {
            Color backgroundFillColor = RadianceColorUtilities.getBackgroundFillColor(c);
            // fix for issue 244 - set the root pane BG color
            if (backgroundFillColor != null) {
                c.setBackground(new ColorUIResource(backgroundFillColor));
            }
        }

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installDefaults();
        }
    }

    @Override
    protected void uninstallDefaults(JRootPane root) {
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallDefaults();
        }

        super.uninstallDefaults(root);
    }

    @Override
    public void update(Graphics g, JComponent c) {
        if (!RadianceCoreUtilities.isCurrentLookAndFeel())
            return;

        if (RadianceCoreUtilities.isOpaque(c)) {
            BackgroundPaintingUtils.update(g, c, false);
        }
        super.paint(g, c);
    }

    /**
     * Installs the necessary Listeners on the parent <code>Window</code>, if there is one.
     * <p>
     * This takes the parent so that cleanup can be done from <code>removeNotify</code>, at which
     * point the parent hasn't been reset yet.
     *
     * @param root   Root pane.
     * @param parent The parent of the JRootPane
     */
    private void installWindowListeners(JRootPane root, Component parent) {
        if (parent instanceof Window) {
            this.window = (Window) parent;
        } else {
            this.window = SwingUtilities.getWindowAncestor(parent);
        }

        if (this.window != null) {
            if (this.radianceMouseInputListener == null) {
                this.radianceMouseInputListener = this.createWindowMouseInputListener();
            }
            this.window.addMouseListener(this.radianceMouseInputListener);
            this.window.addMouseMotionListener(this.radianceMouseInputListener);

            if (this.titlePane != null) {
                if (this.radianceTitleMouseInputListener == null) {
                    this.radianceTitleMouseInputListener = new TitleMouseInputHandler();
                }
                this.titlePane.addMouseMotionListener(this.radianceTitleMouseInputListener);
                this.titlePane.addMouseListener(this.radianceTitleMouseInputListener);
            }
        }
    }

    /**
     * Uninstalls the necessary Listeners on the <code>Window</code> the Listeners were last
     * installed on.
     *
     * @param root Root pane.
     */
    private void uninstallWindowListeners() {
        if ((this.window != null) && (this.radianceMouseInputListener != null)) {
            this.window.removeMouseListener(this.radianceMouseInputListener);
            this.window.removeMouseMotionListener(this.radianceMouseInputListener);
        }
        if ((this.titlePane != null) && (this.radianceTitleMouseInputListener != null)) {
            this.titlePane.removeMouseListener(this.radianceTitleMouseInputListener);
            this.titlePane.removeMouseMotionListener(this.radianceTitleMouseInputListener);
        }
    }

    /**
     * Installs the appropriate LayoutManager on the <code>JRootPane</code> to render the window
     * decorations.
     *
     * @param root Root pane.
     */
    private void installLayout(JRootPane root) {
        if (this.layoutManager == null) {
            this.layoutManager = this.createLayoutManager();
        }
        this.savedOldLayout = root.getLayout();
        root.setLayout(this.layoutManager);
    }

    @Override
    protected void installListeners(final JRootPane root) {
        super.installListeners(root);

        this.radianceHierarchyListener = hierarchyEvent -> {
            Component parent = root.getParent();
            if (parent == null) {
                // fix for defect 271 - check for null parent
                // as early as possible
                return;
            }
            if (MemoryAnalyzer.isRunning()) {
                MemoryAnalyzer.enqueueUsage("Root pane @" + root.hashCode() + "\n"
                        + RadianceCoreUtilities.getHierarchy(parent));
            }
            if (parent.getClass().getName().startsWith("org.jdesktop.jdic.tray") || (parent
                    .getClass().getName().compareTo("javax.swing.Popup$HeavyWeightWindow") == 0)) {
                // Workaround for bug 240 - using JDIC system tray
                // menu results in an HierarchyEvent being fired right
                // after a MouseEvent. Somehow, the
                // EventQueue.getCurrentEvent() returns the HierarchyEvent
                // even when the MouseEvent is being processed, resulting
                // in zeroed modifiers set on the ActionEvent passed
                // to the action listeners on that menu item.
                SwingUtilities.invokeLater(() -> {
                    root.removeHierarchyListener(radianceHierarchyListener);
                    radianceHierarchyListener = null;
                });
            }

            Window currWindow = null;
            if (parent instanceof Window) {
                currWindow = (Window) parent;
            } else {
                currWindow = SwingUtilities.getWindowAncestor(parent);
            }
            if (radianceWindowListener != null) {
                radianceCurrentWindow.removeWindowListener(radianceWindowListener);
                radianceWindowListener = null;
            }
            if (radianceWindowComponentListener != null) {
                radianceCurrentWindow.removeComponentListener(radianceWindowComponentListener);
                radianceWindowComponentListener = null;
            }
            if (currWindow != null) {
                // fix for bug 116 - stopping threads when all frames
                // are not displayable
                radianceWindowListener = new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        RadianceCoreUtilities.testWindowCloseThreadingViolation(e.getWindow());
                        SwingUtilities.invokeLater(() -> {
                            Frame[] frames = Frame.getFrames();
                            for (Frame frame : frames) {
                                if (frame.isDisplayable())
                                    return;
                            }
                            RadianceCoreUtilities.stopThreads();
                        });
                    }
                };

                if (!(parent instanceof JInternalFrame)) {
                    currWindow.addWindowListener(radianceWindowListener);
                }

                // fix for defect 213 - maximizing frame under multiple
                // screens shouldn't always use insets of the primary
                // screen.
                radianceWindowComponentListener = new ComponentAdapter() {
                    @Override
                    public void componentMoved(ComponentEvent e) {
                        this.processNewPosition();
                    }

                    @Override
                    public void componentResized(ComponentEvent e) {
                        this.processNewPosition();
                    }

                    protected void processNewPosition() {
                        SwingUtilities.invokeLater(() -> {
                            if (window == null)
                                return;

                            if (!window.isShowing() || !window.isDisplayable()) {
                                currentRootPaneGC = null;
                                return;
                            }

                            GraphicsEnvironment ge = GraphicsEnvironment
                                    .getLocalGraphicsEnvironment();
                            GraphicsDevice[] gds = ge.getScreenDevices();
                            if (gds.length == 1)
                                return;
                            Point midLoc = new Point(
                                    window.getLocationOnScreen().x + window.getWidth() / 2,
                                    window.getLocationOnScreen().y + window.getHeight() / 2);
                            for (GraphicsDevice gd : gds) {
                                GraphicsConfiguration gc = gd.getDefaultConfiguration();
                                Rectangle bounds = gc.getBounds();
                                if (bounds.contains(midLoc)) {
                                    if (gc != currentRootPaneGC) {
                                        currentRootPaneGC = gc;
                                    }
                                    break;
                                }
                            }
                        });
                    }
                };
                // fix for defect 225 - install the listener only on
                // JFrames.
                if (parent instanceof JFrame) {
                    currWindow.addComponentListener(radianceWindowComponentListener);
                }

                RadianceRootPaneUI.this.window = currWindow;
            }
            radianceCurrentWindow = currWindow;
        };
        root.addHierarchyListener(this.radianceHierarchyListener);

        this.radiancePropertyChangeListener = propertyChangeEvent -> {
            if (RadianceSynapse.CONTENTS_MODIFIED.equals(propertyChangeEvent.getPropertyName())) {
                propagateModificationState();
            }
        };
        root.addPropertyChangeListener(this.radiancePropertyChangeListener);

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installListeners();
        }
    }

    @Override
    protected void uninstallListeners(JRootPane root) {
        // fix for bug 116 - stopping threads when all frames are
        // not displayable
        if (this.window != null) {
            this.window.removeWindowListener(this.radianceWindowListener);
            this.radianceWindowListener = null;
            this.window.removeComponentListener(this.radianceWindowComponentListener);
            this.radianceWindowComponentListener = null;
        }
        root.removeHierarchyListener(this.radianceHierarchyListener);
        this.radianceHierarchyListener = null;

        root.removePropertyChangeListener(this.radiancePropertyChangeListener);
        this.radiancePropertyChangeListener = null;

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallListeners();
        }

        super.uninstallListeners(root);
    }

    @Override
    protected void installComponents(JRootPane root) {
        super.installComponents(root);

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installComponents();
        }
    }

    @Override
    protected void uninstallComponents(JRootPane root) {
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallComponents();
        }

        super.uninstallComponents(root);
    }

    /**
     * Uninstalls the previously installed <code>LayoutManager</code>.
     *
     * @param root Root pane.
     */
    private void uninstallLayout(JRootPane root) {
        if (this.savedOldLayout != null) {
            root.setLayout(this.savedOldLayout);
            this.savedOldLayout = null;
        }
    }

    /**
     * Installs the necessary state onto the JRootPane to render client decorations. This is ONLY
     * invoked if the <code>JRootPane</code> has a decoration style other than
     * <code>JRootPane.NONE</code>.
     *
     * @param root Root pane.
     */
    private void installClientDecorations(JRootPane root) {
        this.installBorder(root);

        RadianceTitlePane titlePane = this.createTitlePane(root);

        this.setTitlePane(root, titlePane);
        if (Boolean.TRUE.equals(root
                .getClientProperty(RadianceSynapse.ROOT_PANE_CONTENTS_EXTENDS_INTO_TITLE_PANE))) {
            extendContentIntoTitlePane();
        }
        Object preferredTitlePaneHeight = root
                .getClientProperty(RadianceSynapse.ROOT_PANE_PREFERRED_TITLE_PANE_HEIGHT);
        if (preferredTitlePaneHeight != null) {
            setPreferredTitlePaneHeight((Integer) preferredTitlePaneHeight);
        }
        this.installWindowListeners(root, root.getParent());
        this.installLayout(root);
        if (this.window != null) {
            root.revalidate();
            root.repaint();
        }
    }

    /**
     * Uninstalls any state that <code>installClientDecorations</code> has installed.
     * <p>
     * NOTE: This may be called if you haven't installed client decorations yet (ie before
     * <code>installClientDecorations</code> has been invoked).
     *
     * @param root Root pane.
     */
    private void uninstallClientDecorations(JRootPane root) {
        this.uninstallBorder(root);
        this.uninstallWindowListeners();
        this.setTitlePane(root, null);
        this.uninstallLayout(root);
        // We have to revalidate/repaint root if the style is JRootPane.NONE
        // only. When we needs to call revalidate/repaint with other styles
        // the installClientDecorations is always called after this method
        // immediately and it will cause the revalidate/repaint at the proper
        // time.
        int style = root.getWindowDecorationStyle();
        if (style == JRootPane.NONE) {
            root.repaint();
            root.revalidate();
        }
        // Reset the cursor, as we may have changed it to a resize cursor
        if (this.window != null) {
            this.window.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
        this.window = null;
    }

    /**
     * Returns the <code>JComponent</code> to render the window decoration style.
     *
     * @param root Root pane.
     * @return The title pane component.
     */
    protected RadianceTitlePane createTitlePane(JRootPane root) {
        return new RadianceTitlePane(root, this);
    }

    /**
     * Returns a <code>MouseListener</code> that will be added to the <code>Window</code> containing
     * the <code>JRootPane</code>.
     *
     * @return Window mouse listener.
     */
    private MouseInputListener createWindowMouseInputListener() {
        return new MouseInputHandler();
    }

    /**
     * Returns a <code>LayoutManager</code> that will be set on the <code>JRootPane</code>.
     *
     * @return Layout manager.
     */
    protected LayoutManager createLayoutManager() {
        return new RadianceRootLayout();
    }

    /**
     * Sets the window title pane -- the JComponent used to provide a plaf a way to override the
     * native operating system's window title pane with one whose look and feel are controlled by
     * the plaf. The plaf creates and sets this value; the default is null, implying a native
     * operating system window title pane.
     *
     * @param root      Root pane
     * @param titlePane The <code>JComponent</code> to use for the window title pane.
     */
    private void setTitlePane(JRootPane root, RadianceTitlePane titlePane) {
        JLayeredPane layeredPane = root.getLayeredPane();

        if (this.titlePane != null) {
            // fix for defect 109 - memory leak on skin change
            this.titlePane.uninstall();
            layeredPane.remove(this.titlePane);
        }
        if (titlePane != null) {
            layeredPane.add(titlePane, JLayeredPane.FRAME_CONTENT_LAYER);
            titlePane.setVisible(true);
        }
        this.titlePane = titlePane;
    }

    /**
     * Returns the <code>JComponent</code> rendering the title pane. If this returns null, it
     * implies there is no need to render window decorations. This method is <b>for internal use
     * only</b>.
     *
     * @return Title pane.
     * @see #setTitlePane
     */
    public JComponent getTitlePane() {
        return this.titlePane;
    }

    public JButton createTitlePaneControlButton() {
        if (this.titlePane == null) {
            return null;
        }

        return this.titlePane.createControlButton();
    }

    public Insets getTitlePaneControlInsets() {
        if (this.titlePane == null) {
            return null;
        }
        return this.titlePane.getControlInsets();
    }

    public void extendContentIntoTitlePane() {
        if (this.titlePane == null) {
            throw new IllegalStateException("This root pane has not been marked to be decorated");
        }
        this.isContentExtendingIntoTitlePane = true;
        this.titlePane.setControlOnlyMode();
        Container titlePaneParent = this.titlePane.getParent();
        titlePaneParent.setComponentZOrder(this.titlePane, 0);
        titlePaneParent.invalidate();
    }

    public void setPreferredTitlePaneHeight(int preferredTitlePaneHeight) {
        if (this.titlePane == null) {
            throw new IllegalStateException("This root pane has not been marked to be decorated");
        }
        this.titlePane.setPreferredHeight(preferredTitlePaneHeight);
        this.titlePane.getParent().invalidate();
    }

    /**
     * Returns the <code>JRootPane</code> we're providing the look and feel for.
     *
     * @return The associated root pane.
     */
    protected JRootPane getRootPane() {
        return this.root;
    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
        super.propertyChange(e);

        String propertyName = e.getPropertyName();
        if (propertyName == null) {
            return;
        }

        if (propertyName.equals("windowDecorationStyle")) {
            JRootPane root = (JRootPane) e.getSource();
            int style = root.getWindowDecorationStyle();

            this.uninstallClientDecorations(root);
            if (style != JRootPane.NONE) {
                this.installClientDecorations(root);
            }
        }
        if (propertyName.equals("ancestor")) {
            this.uninstallWindowListeners();
            if (((JRootPane) e.getSource()).getWindowDecorationStyle() != JRootPane.NONE) {
                this.installWindowListeners(this.root, this.root.getParent());
            }
        }
        if (propertyName.equals("background")) {
            RadianceCoreUtilities.getTitlePaneComponent(window)
                    .setBackground((Color) e.getNewValue());
        }

        if (propertyName.equals(RadianceSynapse.ROOT_PANE_SKIN)) {
            RadianceSkin oldValue = (RadianceSkin) e.getOldValue();
            RadianceSkin newValue = (RadianceSkin) e.getNewValue();
            if ((oldValue == null) && (newValue != null)) {
                rootPanesWithCustomSkin++;
            }
            if ((oldValue != null) && (newValue == null)) {
                rootPanesWithCustomSkin--;
            }
        }
    }

    /**
     * A custom layout manager that is responsible for the layout of layeredPane, glassPane, menuBar
     * and titlePane, if one has been installed.
     */
    protected class RadianceRootLayout implements LayoutManager2 {
        /**
         * Returns the amount of space the layout would like to have.
         * <p>
         * <p>
         * aram the Container for which this layout manager is being used
         *
         * @return a Dimension object containing the layout's preferred size
         */
        @Override
        public Dimension preferredLayoutSize(Container parent) {
            Dimension cpd, mbd, tpd;
            int cpWidth = 0;
            int cpHeight = 0;
            int mbWidth = 0;
            int mbHeight = 0;
            int tpWidth = 0;
            int tpHeight = 0;
            Insets i = parent.getInsets();
            JRootPane root = (JRootPane) parent;

            if (root.getContentPane() != null) {
                cpd = root.getContentPane().getPreferredSize();
            } else {
                cpd = root.getSize();
            }
            if (cpd != null) {
                cpWidth = cpd.width;
                cpHeight = cpd.height;
            }

            if (root.getJMenuBar() != null) {
                mbd = root.getJMenuBar().getPreferredSize();
                if (mbd != null) {
                    mbWidth = mbd.width;
                    mbHeight = mbd.height;
                }
            }

            if ((root.getWindowDecorationStyle() != JRootPane.NONE)
                    && (root.getUI() instanceof RadianceRootPaneUI)) {
                JComponent titlePane = ((RadianceRootPaneUI) root.getUI()).getTitlePane();
                if (titlePane != null) {
                    tpd = titlePane.getPreferredSize();
                    if (tpd != null) {
                        tpWidth = tpd.width;
                        tpHeight = tpd.height;
                    }
                }
            }

            return new Dimension(Math.max(Math.max(cpWidth, mbWidth), tpWidth) + i.left + i.right,
                    cpHeight + mbHeight + tpHeight + i.top + i.bottom);
        }

        /**
         * Returns the minimum amount of space the layout needs.
         * <p>
         * <p>
         * aram the Container for which this layout manager is being used
         *
         * @return a Dimension object containing the layout's minimum size
         */
        @Override
        public Dimension minimumLayoutSize(Container parent) {
            Dimension cpd, mbd, tpd;
            int cpWidth = 0;
            int cpHeight = 0;
            int mbWidth = 0;
            int mbHeight = 0;
            int tpWidth = 0;
            int tpHeight = 0;
            Insets i = parent.getInsets();
            JRootPane root = (JRootPane) parent;

            if (root.getContentPane() != null) {
                cpd = root.getContentPane().getMinimumSize();
            } else {
                cpd = root.getSize();
            }
            if (cpd != null) {
                cpWidth = cpd.width;
                cpHeight = cpd.height;
            }

            if (root.getJMenuBar() != null) {
                mbd = root.getJMenuBar().getMinimumSize();
                if (mbd != null) {
                    mbWidth = mbd.width;
                    mbHeight = mbd.height;
                }
            }
            if ((root.getWindowDecorationStyle() != JRootPane.NONE)
                    && (root.getUI() instanceof RadianceRootPaneUI)) {
                JComponent titlePane = ((RadianceRootPaneUI) root.getUI()).getTitlePane();
                if (titlePane != null) {
                    tpd = titlePane.getMinimumSize();
                    if (tpd != null) {
                        tpWidth = tpd.width;
                        tpHeight = tpd.height;
                    }
                }
            }

            return new Dimension(Math.max(Math.max(cpWidth, mbWidth), tpWidth) + i.left + i.right,
                    cpHeight + mbHeight + tpHeight + i.top + i.bottom);
        }

        /**
         * Returns the maximum amount of space the layout can use.
         * <p>
         * <p>
         * aram the Container for which this layout manager is being used
         *
         * @return a Dimension object containing the layout's maximum size
         */
        @Override
        public Dimension maximumLayoutSize(Container target) {
            Dimension cpd, mbd, tpd;
            int cpWidth = Integer.MAX_VALUE;
            int cpHeight = Integer.MAX_VALUE;
            int mbWidth = Integer.MAX_VALUE;
            int mbHeight = Integer.MAX_VALUE;
            int tpWidth = Integer.MAX_VALUE;
            int tpHeight = Integer.MAX_VALUE;
            Insets i = target.getInsets();
            JRootPane root = (JRootPane) target;

            if (root.getContentPane() != null) {
                cpd = root.getContentPane().getMaximumSize();
                if (cpd != null) {
                    cpWidth = cpd.width;
                    cpHeight = cpd.height;
                }
            }

            if (root.getJMenuBar() != null) {
                mbd = root.getJMenuBar().getMaximumSize();
                if (mbd != null) {
                    mbWidth = mbd.width;
                    mbHeight = mbd.height;
                }
            }

            if ((root.getWindowDecorationStyle() != JRootPane.NONE)
                    && (root.getUI() instanceof RadianceRootPaneUI)) {
                JComponent titlePane = ((RadianceRootPaneUI) root.getUI()).getTitlePane();
                if (titlePane != null) {
                    tpd = titlePane.getMaximumSize();
                    if (tpd != null) {
                        tpWidth = tpd.width;
                        tpHeight = tpd.height;
                    }
                }
            }

            int maxHeight = Math.max(Math.max(cpHeight, mbHeight), tpHeight);
            // Only overflows if 3 real non-MAX_VALUE heights, sum to >
            // MAX_VALUE
            // Only will happen if sums to more than 2 billion units. Not
            // likely.
            if (maxHeight != Integer.MAX_VALUE) {
                maxHeight = cpHeight + mbHeight + tpHeight + i.top + i.bottom;
            }

            int maxWidth = Math.max(Math.max(cpWidth, mbWidth), tpWidth);
            // Similar overflow comment as above
            if (maxWidth != Integer.MAX_VALUE) {
                maxWidth += i.left + i.right;
            }

            return new Dimension(maxWidth, maxHeight);
        }

        /**
         * Instructs the layout manager to perform the layout for the specified container.
         * <p>
         * <p>
         * aram the Container for which this layout manager is being used
         */
        @Override
        public void layoutContainer(Container parent) {
            JRootPane root = (JRootPane) parent;
            Rectangle b = root.getBounds();
            Insets i = root.getInsets();
            int nextY = 0;
            int w = b.width - i.right - i.left;
            int h = b.height - i.top - i.bottom;

            if (root.getLayeredPane() != null) {
                root.getLayeredPane().setBounds(i.left, i.top, w, h);
            }
            if (root.getGlassPane() != null) {
                root.getGlassPane().setBounds(i.left, i.top, w, h);
            }
            // Note: This is laying out the children in the layeredPane,
            // technically, these are not our children.
            if ((root.getWindowDecorationStyle() != JRootPane.NONE)
                    && (root.getUI() instanceof RadianceRootPaneUI)) {
                if (titlePane != null) {
                    Dimension tpd = titlePane.getPreferredSize();
                    if (tpd != null) {
                        int tpHeight = tpd.height;
                        if (!isContentExtendingIntoTitlePane) {
                            titlePane.setBounds(0, 0, w, tpHeight);
                            nextY += tpHeight;
                        } else {
                            boolean controlButtonsOnRight = RadianceTitlePaneUtilities
                                    .areTitlePaneControlButtonsOnRight(root);
                            Insets titlePaneControlInsets = titlePane.getControlInsets();
                            int titlePaneWidth = controlButtonsOnRight
                                    ? titlePaneControlInsets.right
                                    : titlePaneControlInsets.left;
                            int titlePaneX = controlButtonsOnRight ? w - titlePaneWidth : 0;
                            titlePane.setBounds(titlePaneX, 0, titlePaneWidth, tpHeight);
                        }
                    }
                }
            }
            if (root.getJMenuBar() != null) {
                Dimension mbd = root.getJMenuBar().getPreferredSize();
                root.getJMenuBar().setBounds(0, nextY, w, mbd.height);
                nextY += mbd.height;
            }
            if (root.getContentPane() != null) {
                root.getContentPane().setBounds(0, nextY, w, h < nextY ? 0 : h - nextY);
            }
        }

        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public void addLayoutComponent(Component comp, Object constraints) {
        }

        @Override
        public float getLayoutAlignmentX(Container target) {
            return 0.0f;
        }

        @Override
        public float getLayoutAlignmentY(Container target) {
            return 0.0f;
        }

        @Override
        public void invalidateLayout(Container target) {
        }
    }

    /**
     * Maps from positions to cursor type. Refer to calculateCorner and calculatePosition for
     * details of this.
     */
    private static final int[] cursorMapping = new int[] {Cursor.NW_RESIZE_CURSOR,
            Cursor.NW_RESIZE_CURSOR, Cursor.N_RESIZE_CURSOR, Cursor.NE_RESIZE_CURSOR,
            Cursor.NE_RESIZE_CURSOR, Cursor.NW_RESIZE_CURSOR, 0, 0, 0,
            Cursor.NE_RESIZE_CURSOR, Cursor.W_RESIZE_CURSOR, 0, 0, 0,
            Cursor.E_RESIZE_CURSOR, Cursor.SW_RESIZE_CURSOR, 0, 0, 0,
            Cursor.SE_RESIZE_CURSOR, Cursor.SW_RESIZE_CURSOR, Cursor.SW_RESIZE_CURSOR,
            Cursor.S_RESIZE_CURSOR, Cursor.SE_RESIZE_CURSOR, Cursor.SE_RESIZE_CURSOR};

    /**
     * MouseInputHandler is responsible for handling resize/moving of the Window. It sets the cursor
     * directly on the Window when then mouse moves over a hot spot.
     */
    private class MouseInputHandler implements MouseInputListener {
        /**
         * Set to true if the drag operation is moving the window.
         */
        private boolean isMovingWindow;

        private boolean isMousePressed;

        /**
         * Used to determine the corner the resize is occuring from.
         */
        private int dragCursor;

        /**
         * X location the mouse went down on for a drag operation.
         */
        private int dragOffsetX;

        /**
         * Y location the mouse went down on for a drag operation.
         */
        private int dragOffsetY;

        /**
         * Width of the window when the drag started.
         */
        private int dragWidth;

        /**
         * Height of the window when the drag started.
         */
        private int dragHeight;

        @Override
        public void mousePressed(MouseEvent ev) {
            JRootPane rootPane = RadianceRootPaneUI.this.getRootPane();
            this.isMousePressed = true;

            if ((titlePane == null)
                    || (rootPane.getWindowDecorationStyle() == JRootPane.NONE)) {
                return;
            }
            Point dragWindowOffset = ev.getPoint();
            Window w = (Window) ev.getSource();
            if (w != null) {
                w.toFront();
            }

            Frame f = null;
            Dialog d = null;

            if (w instanceof Frame) {
                f = (Frame) w;
            } else if (w instanceof Dialog) {
                d = (Dialog) w;
            }

            int frameState = (f != null) ? f.getExtendedState() : 0;

            if (isMouseEventInExtendedTitlePane(ev)) {
                if ((((f != null) && ((frameState & Frame.MAXIMIZED_BOTH) == 0)) || (d != null))
                        && (dragWindowOffset.y >= RadianceRootPaneUI.BORDER_DRAG_THICKNESS)
                        && (dragWindowOffset.x >= RadianceRootPaneUI.BORDER_DRAG_THICKNESS)
                        && (dragWindowOffset.x < w.getWidth()
                        - RadianceRootPaneUI.BORDER_DRAG_THICKNESS)) {
                    this.isMovingWindow = true;
                    this.dragOffsetX = dragWindowOffset.x;
                    this.dragOffsetY = dragWindowOffset.y;
                }
            } else if (((f != null) && f.isResizable()
                    && ((frameState & Frame.MAXIMIZED_BOTH) == 0))
                    || ((d != null) && d.isResizable())) {
                this.dragOffsetX = dragWindowOffset.x;
                this.dragOffsetY = dragWindowOffset.y;
                this.dragWidth = w.getWidth();
                this.dragHeight = w.getHeight();
                this.dragCursor = this
                        .getCursor(this.calculateCorner(w, dragWindowOffset.x, dragWindowOffset.y));
            }
        }

        @Override
        public void mouseReleased(MouseEvent ev) {
            if ((this.dragCursor != 0) && (RadianceRootPaneUI.this.window != null)
                    && !RadianceRootPaneUI.this.window.isValid()) {
                // Some Window systems validate as you resize, others won't,
                // thus the check for validity before repainting.
                RadianceRootPaneUI.this.window.validate();
                RadianceRootPaneUI.this.getRootPane().repaint();
            }
            this.isMousePressed = false;
            this.isMovingWindow = false;
            this.dragCursor = 0;
        }

        @Override
        public void mouseMoved(MouseEvent ev) {
            JRootPane root = RadianceRootPaneUI.this.getRootPane();

            if (root.getWindowDecorationStyle() == JRootPane.NONE) {
                return;
            }

            Window w = (Window) ev.getSource();

            Frame f = null;
            Dialog d = null;

            if (w instanceof Frame) {
                f = (Frame) w;
            } else if (w instanceof Dialog) {
                d = (Dialog) w;
            }

            // Update the cursor
            int cursor = this.getCursor(this.calculateCorner(w, ev.getX(), ev.getY()));

            boolean isFrameResizable = (f != null)
                    && (f.isResizable() && (f.getExtendedState() & Frame.MAXIMIZED_BOTH) == 0);
            boolean isDialogResizable = (d != null) && d.isResizable();
            if ((cursor != 0) && (isFrameResizable || isDialogResizable)) {
                w.setCursor(Cursor.getPredefinedCursor(cursor));
            } else {
                w.setCursor(RadianceRootPaneUI.this.lastCursor);
                RadianceRootPaneUI.this.lastCursor = null;
            }
        }

        /**
         * Adjusts the bounds.
         *
         * @param bounds      Original bounds.
         * @param min         Minimum dimension.
         * @param deltaX      Delta X.
         * @param deltaY      Delta Y.
         * @param deltaWidth  Delta width.
         * @param deltaHeight Delta height.
         */
        private void adjust(Rectangle bounds, Dimension min, int deltaX, int deltaY, int deltaWidth,
                int deltaHeight) {
            bounds.x += deltaX;
            bounds.y += deltaY;
            bounds.width += deltaWidth;
            bounds.height += deltaHeight;
            if (min != null) {
                if (bounds.width < min.width) {
                    int correction = min.width - bounds.width;
                    if (deltaX != 0) {
                        bounds.x -= correction;
                    }
                    bounds.width = min.width;
                }
                if (bounds.height < min.height) {
                    int correction = min.height - bounds.height;
                    if (deltaY != 0) {
                        bounds.y -= correction;
                    }
                    bounds.height = min.height;
                }
            }
        }

        @Override
        public void mouseDragged(MouseEvent ev) {
            Window w = (Window) ev.getSource();
            Point pt = ev.getPoint();

            if (this.isMovingWindow) {
                PointerInfo pi = MouseInfo.getPointerInfo();
                if (pi != null) {
                    Point windowPt = pi.getLocation();
                    windowPt.x = windowPt.x - this.dragOffsetX;
                    windowPt.y = windowPt.y - this.dragOffsetY;
                    w.setLocation(windowPt);
                }
            } else if (this.dragCursor != 0) {
                Rectangle r = w.getBounds();
                Rectangle startBounds = new Rectangle(r);
                Dimension min = w.getMinimumSize();

                switch (this.dragCursor) {
                    case Cursor.E_RESIZE_CURSOR:
                        this.adjust(r, min, 0, 0,
                                pt.x + (this.dragWidth - this.dragOffsetX) - r.width, 0);
                        break;
                    case Cursor.S_RESIZE_CURSOR:
                        this.adjust(r, min, 0, 0, 0,
                                pt.y + (this.dragHeight - this.dragOffsetY) - r.height);
                        break;
                    case Cursor.N_RESIZE_CURSOR:
                        this.adjust(r, min, 0, pt.y - this.dragOffsetY, 0,
                                -(pt.y - this.dragOffsetY));
                        break;
                    case Cursor.W_RESIZE_CURSOR:
                        this.adjust(r, min, pt.x - this.dragOffsetX, 0, -(pt.x - this.dragOffsetX),
                                0);
                        break;
                    case Cursor.NE_RESIZE_CURSOR:
                        this.adjust(r, min, 0, pt.y - this.dragOffsetY,
                                pt.x + (this.dragWidth - this.dragOffsetX) - r.width,
                                -(pt.y - this.dragOffsetY));
                        break;
                    case Cursor.SE_RESIZE_CURSOR:
                        this.adjust(r, min, 0, 0,
                                pt.x + (this.dragWidth - this.dragOffsetX) - r.width,
                                pt.y + (this.dragHeight - this.dragOffsetY) - r.height);
                        break;
                    case Cursor.NW_RESIZE_CURSOR:
                        this.adjust(r, min, pt.x - this.dragOffsetX, pt.y - this.dragOffsetY,
                                -(pt.x - this.dragOffsetX), -(pt.y - this.dragOffsetY));
                        break;
                    case Cursor.SW_RESIZE_CURSOR:
                        this.adjust(r, min, pt.x - this.dragOffsetX, 0, -(pt.x - this.dragOffsetX),
                                pt.y + (this.dragHeight - this.dragOffsetY) - r.height);
                        break;
                    default:
                        break;
                }
                if (!r.equals(startBounds)) {
                    w.setBounds(r);
                    // Defer repaint/validate on mouseReleased unless dynamic
                    // layout is active.
                    if (Toolkit.getDefaultToolkit().isDynamicLayoutActive()) {
                        w.validate();
                        RadianceRootPaneUI.this.getRootPane().repaint();
                    }
                }
            }
        }

        private CursorState cursorState = CursorState.NIL;

        @Override
        public void mouseEntered(MouseEvent ev) {
            if (isMousePressed) {
                return;
            }
            Window w = (Window) ev.getSource();
            if ((RadianceRootPaneUI.this.lastCursor == null)
                    && (cursorState != CursorState.ENTERED)) {
                // fix for defect 107
                RadianceRootPaneUI.this.lastCursor = w.getCursor();
            }
            cursorState = CursorState.ENTERED;
            this.mouseMoved(ev);
        }

        @Override
        public void mouseExited(MouseEvent ev) {
            if (isMousePressed) {
                return;
            }
            Window w = (Window) ev.getSource();
            w.setCursor(RadianceRootPaneUI.this.lastCursor);
            RadianceRootPaneUI.this.lastCursor = null;
            cursorState = CursorState.EXITED;
        }

        @Override
        public void mouseClicked(MouseEvent ev) {
            Window w = (Window) ev.getSource();
            Frame f = null;

            if (w instanceof Frame) {
                f = (Frame) w;
            } else {
                return;
            }

            // fix for issue 444 - ignore double clicks when the title pane
            // is not showing (for example under JRootPane.NONE decoration
            // style).
            if (titlePane == null)
                return;

            // Point convertedPoint = SwingUtilities.convertPoint(w, ev.getPoint(),
            // windowTitlePane);

            int state = f.getExtendedState();
            if (isMouseEventInExtendedTitlePane(ev)) {
                if (((ev.getClickCount() % 2) == 0) && (ev.getButton() == MouseEvent.BUTTON1)) {
                    if (f.isResizable()) {
                        if ((state & Frame.MAXIMIZED_BOTH) != 0) {
                            f.setExtendedState(state & ~Frame.MAXIMIZED_BOTH);
                        } else {
                            f.setExtendedState(state | Frame.MAXIMIZED_BOTH);
                        }
                    }
                }
            }
        }

        /**
         * Returns the corner that contains the point <code>x</code>, <code>y</code>, or -1 if the
         * position doesn't match a corner.
         *
         * @param w Window.
         * @param x X coordinate.
         * @param y Y coordinate.
         * @return Corner that contains the specified point.
         */
        private int calculateCorner(Window w, int x, int y) {
            Insets insets = w.getInsets();
            int xPosition = this.calculatePosition(x - insets.left,
                    w.getWidth() - insets.left - insets.right);
            int yPosition = this.calculatePosition(y - insets.top,
                    w.getHeight() - insets.top - insets.bottom);

            if ((xPosition == -1) || (yPosition == -1)) {
                return -1;
            }
            return yPosition * 5 + xPosition;
        }

        /**
         * Returns the Cursor to render for the specified corner. This returns 0 if the corner
         * doesn't map to a valid Cursor
         *
         * @param corner Corner
         * @return Cursor to render for the specified corner.
         */
        private int getCursor(int corner) {
            if (corner == -1) {
                return 0;
            }
            return RadianceRootPaneUI.cursorMapping[corner];
        }

        /**
         * Returns an integer indicating the position of <code>spot</code> in <code>width</code>.
         * The return value will be: 0 if < BORDER_DRAG_THICKNESS 1 if < CORNER_DRAG_WIDTH 2 if >=
         * CORNER_DRAG_WIDTH && < width - BORDER_DRAG_THICKNESS 3 if >= width - CORNER_DRAG_WIDTH 4
         * if >= width - BORDER_DRAG_THICKNESS 5 otherwise
         *
         * @param spot  Spot.
         * @param width Width.
         * @return The position of spot in width.
         */
        private int calculatePosition(int spot, int width) {
            if (spot < RadianceRootPaneUI.BORDER_DRAG_THICKNESS) {
                return 0;
            }
            if (spot < RadianceRootPaneUI.CORNER_DRAG_WIDTH) {
                return 1;
            }
            if (spot >= (width - RadianceRootPaneUI.BORDER_DRAG_THICKNESS)) {
                return 4;
            }
            if (spot >= (width - RadianceRootPaneUI.CORNER_DRAG_WIDTH)) {
                return 3;
            }
            return 2;
        }
    }

    /**
     * Mouse handler on the title pane.
     *
     * @author Kirill Grouchnikov
     */
    private class TitleMouseInputHandler extends MouseInputAdapter {

        /**
         * Pointer location when the mouse was pressed for a drag relative to the upper-lefthand
         * corner of the window.
         */
        private Point dragOffset = new Point(0, 0);

        @Override
        public void mousePressed(MouseEvent ev) {
            JRootPane rootPane = RadianceRootPaneUI.this.getRootPane();

            if (rootPane.getWindowDecorationStyle() == JRootPane.NONE) {
                return;
            }

            Point dragWindowOffset = ev.getPoint();
            Component source = (Component) ev.getSource();

            // Point convertedDragWindowOffset = SwingUtilities.convertPoint(source,
            // dragWindowOffset,
            // getTitlePane());

            dragWindowOffset = SwingUtilities.convertPoint(source, dragWindowOffset,
                    RadianceRootPaneUI.this.window);

            if (isMouseEventInExtendedTitlePane(ev)) {
                // if (getTitlePane() != null && getTitlePane().contains(convertedDragWindowOffset))
                // {
                if (RadianceRootPaneUI.this.window != null) {
                    RadianceRootPaneUI.this.window.toFront();
                    dragOffset = dragWindowOffset;
                }
            }
        }

        @Override
        public void mouseDragged(MouseEvent ev) {
            Component source = (Component) ev.getSource();

            // fix for issue 198
            Point eventLocationOnScreen = ev.getLocationOnScreen();
            if (eventLocationOnScreen == null) {
                eventLocationOnScreen = new Point(ev.getX() + source.getLocationOnScreen().x,
                        ev.getY() + source.getLocationOnScreen().y);
            }
            // Fix for issue 192 - disable dragging maximized frame.
            if (RadianceRootPaneUI.this.window instanceof Frame) {
                Frame f = (Frame) RadianceRootPaneUI.this.window;
                int frameState = (f != null) ? f.getExtendedState() : 0;
                if ((f != null) && ((frameState & Frame.MAXIMIZED_BOTH) == 0)) {
                    RadianceRootPaneUI.this.window.setLocation(
                            eventLocationOnScreen.x - dragOffset.x,
                            eventLocationOnScreen.y - dragOffset.y);
                }
            } else {
                // fix for issue 193 - allow dragging decorated dialogs.
                RadianceRootPaneUI.this.window.setLocation(eventLocationOnScreen.x - dragOffset.x,
                        eventLocationOnScreen.y - dragOffset.y);
            }
        }

        @Override
        public void mouseClicked(MouseEvent ev) {
            Frame f = null;

            if (RadianceRootPaneUI.this.window instanceof Frame) {
                f = (Frame) RadianceRootPaneUI.this.window;
            } else {
                return;
            }

            int state = f.getExtendedState();
            if (isMouseEventInExtendedTitlePane(ev)) {
                if (((ev.getClickCount() % 2) == 0) && (ev.getButton() == MouseEvent.BUTTON1)) {
                    if (f.isResizable()) {
                        if ((state & Frame.MAXIMIZED_BOTH) != 0) {
                            f.setExtendedState(state & ~Frame.MAXIMIZED_BOTH);
                        } else {
                            f.setExtendedState(state | Frame.MAXIMIZED_BOTH);
                        }
                        return;
                    }
                }
            }
        }
    }

    private void propagateModificationState() {
        if (this.titlePane != null) {
            this.titlePane.getCloseButton().putClientProperty(
                    RadianceSynapse.CONTENTS_MODIFIED,
                    root.getClientProperty(RadianceSynapse.CONTENTS_MODIFIED));
            return;
        }

        JInternalFrame jif = (JInternalFrame) SwingUtilities
                .getAncestorOfClass(JInternalFrame.class, this.root);
        if (jif != null) {
            RadianceInternalFrameUI internalFrameUI = (RadianceInternalFrameUI) jif.getUI();
            internalFrameUI.setWindowModified(Boolean.TRUE
                    .equals(root.getClientProperty(RadianceSynapse.CONTENTS_MODIFIED)));
        }
    }

    public static boolean hasCustomSkinOnAtLeastOneRootPane() {
        return (rootPanesWithCustomSkin > 0);
    }

    private boolean isMouseEventInExtendedTitlePane(MouseEvent ev) {
        Point point = ev.getPoint();
        Component source = (Component) ev.getSource();
        if (this.titlePane == null) {
            return false;
        }
        if (!isContentExtendingIntoTitlePane) {
            return (this.titlePane != null
                    && this.titlePane.contains(SwingUtilities.convertPoint(source, point, this.titlePane)));
        } else {
            // Built-in title pane is not going to be full-width. Work with layered pane
            // and its insets
            JLayeredPane layeredPane = this.root.getLayeredPane();
            Insets layeredPaneInsets = layeredPane.getInsets();
            Point convertedPoint = SwingUtilities.convertPoint(source, point, layeredPane);
            convertedPoint.x += layeredPaneInsets.left;
            convertedPoint.y += layeredPaneInsets.top;
            Rectangle titlePaneRect = new Rectangle(0, 0, layeredPane.getWidth() -
                    layeredPaneInsets.left - layeredPaneInsets.right,
                    this.titlePane.getHeight());
            return titlePaneRect.contains(convertedPoint);
        }
    }
}
