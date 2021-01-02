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
package org.pushingpixels.substance.internal.utils;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.skin.SkinInfo;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.ui.SubstanceButtonUI;
import org.pushingpixels.substance.internal.ui.SubstanceRootPaneUI;
import org.pushingpixels.substance.internal.utils.icon.SubstanceIconFactory;
import org.pushingpixels.substance.internal.utils.icon.TransitionAwareIcon;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostPaintingUtils;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Map;

/**
 * Title pane for <b>Substance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceTitlePane extends JComponent {
    /**
     * PropertyChangeListener added to the JRootPane.
     */
    private PropertyChangeListener propertyChangeListener;

    /**
     * JMenuBar, typically renders the system menu items.
     */
    protected JMenuBar menuBar;

    private boolean isControlOnlyMode;

    private int preferredHeight;

    /**
     * Action used to close the Window.
     */
    private Action closeAction;

    /**
     * Action used to iconify the Frame.
     */
    private Action iconifyAction;

    /**
     * Action to restore the Frame size.
     */
    private Action restoreAction;

    /**
     * Action to restore the Frame size.
     */
    private Action maximizeAction;

    /**
     * Button used to maximize or restore the frame.
     */
    private JButton toggleButton;

    /**
     * Button used to minimize the frame
     */
    private JButton minimizeButton;

    /**
     * Button used to close the frame.
     */
    private JButton closeButton;

    /**
     * Listens for changes in the state of the Window listener to update the state of the widgets.
     */
    private WindowListener windowListener;

    /**
     * Window we're currently in.
     */
    protected Window window;

    /**
     * JRootPane rendering for.
     */
    protected JRootPane rootPane;

    /**
     * Buffered Frame.state property. As state isn't bound, this is kept to determine when to avoid
     * updating widgets.
     */
    private int state;

    /**
     * SubstanceRootPaneUI that created us.
     */
    private SubstanceRootPaneUI rootPaneUI;

    /**
     * Listens on changes to <code>componentOrientation</code> and
     * {@link SubstanceSynapse#CONTENTS_MODIFIED} properties.
     */
    private PropertyChangeListener propertyListener;

    /**
     * The application icon to be displayed.
     */
    private Image appIcon;

    /**
     * Creates a new title pane.
     *
     * @param root Root pane.
     * @param ui   Root pane UI.
     */
    public SubstanceTitlePane(JRootPane root, SubstanceRootPaneUI ui) {
        this.rootPane = root;
        this.rootPaneUI = ui;

        this.state = -1;

        this.installSubcomponents();
        this.installDefaults();

        this.setLayout(this.createLayout());

        this.setToolTipText(this.getTitle());

        ComponentOrParentChainScope.setDecorationType(this, DecorationAreaType.PRIMARY_TITLE_PANE);
        this.setForeground(SubstanceColorUtilities.getForegroundColor(SubstanceCoreUtilities
                .getSkin(this).getBackgroundColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE)));
    }

    /**
     * Uninstalls the necessary state.
     */
    public void uninstall() {
        this.uninstallListeners();
        this.window = null;

        // Swing bug (?) - the updateComponentTree never gets to the
        // system menu (and in our case we have radio menu items with
        // rollover listeners). Fix for defect 109 - memory leak on skin
        // switch
        if ((this.menuBar != null) && (this.menuBar.getMenuCount() > 0)) {
            this.menuBar.getUI().uninstallUI(this.menuBar);
            SubstanceCoreUtilities.uninstallMenu(this.menuBar.getMenu(0));
        }

        if (this.menuBar != null) {
            this.menuBar.removeAll();
        }
        this.removeAll();
    }

    /**
     * Installs the necessary listeners.
     */
    private void installListeners() {
        if (this.window != null) {
            this.windowListener = new WindowHandler();
            this.window.addWindowListener(this.windowListener);
            this.propertyChangeListener = new PropertyChangeHandler();
            this.window.addPropertyChangeListener(this.propertyChangeListener);
        }

        // Property change listener for pulsating close button
        // when window has been marked as changed.
        // Fix for defect 109 - memory leak on skin change.
        this.propertyListener = propertyChangeEvent -> {
            if (SubstanceSynapse.CONTENTS_MODIFIED.equals(propertyChangeEvent.getPropertyName())) {
                syncCloseButtonTooltip();
            }

            if ("componentOrientation".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(() -> {
                    if (SubstanceTitlePane.this.menuBar != null) {
                        SubstanceTitlePane.this.menuBar.applyComponentOrientation(
                                (ComponentOrientation) propertyChangeEvent.getNewValue());
                    }
                });
            }
        };
        // Wire it on the frame itself and its root pane.
        this.rootPane.addPropertyChangeListener(this.propertyListener);
        if (this.getFrame() != null)
            this.getFrame().addPropertyChangeListener(this.propertyListener);
    }

    /**
     * Uninstalls the necessary listeners.
     */
    private void uninstallListeners() {
        if (this.window != null) {
            this.window.removeWindowListener(this.windowListener);
            this.windowListener = null;
            this.window.removePropertyChangeListener(this.propertyChangeListener);
            this.propertyChangeListener = null;
        }

        // Fix for defect 109 - memory leak on skin change.
        this.rootPane.removePropertyChangeListener(this.propertyListener);
        if (this.getFrame() != null) {
            this.getFrame().removePropertyChangeListener(this.propertyListener);
        }
        this.propertyListener = null;

    }

    /**
     * Returns the <code>JRootPane</code> this was created for.
     */
    @Override
    public JRootPane getRootPane() {
        return this.rootPane;
    }

    /**
     * Returns the decoration style of the <code>JRootPane</code>.
     *
     * @return Decoration style of the <code>JRootPane</code>.
     */
    private int getWindowDecorationStyle() {
        return this.getRootPane().getWindowDecorationStyle();
    }

    @Override
    public void addNotify() {
        super.addNotify();

        this.uninstallListeners();

        this.window = SwingUtilities.getWindowAncestor(this);
        if (this.window != null) {
            this.setActive(this.window.isActive());
            if (this.window instanceof Frame) {
                this.setState(((Frame) this.window).getExtendedState());
            } else {
                this.setState(0);
            }
            if (this.getComponentCount() == 0) {
                // fix for issue 385 - add the sub-components uninstalled
                // in the removeNotify. This happens when a decorated
                // dialog has been disposed and then reshown.
                this.installSubcomponents();
            }
            this.installListeners();
        }
        this.setToolTipText(this.getTitle());
        this.updateAppIcon();
    }

    @Override
    public void removeNotify() {
        super.removeNotify();

        this.uninstall();
        this.window = null;
    }

    /**
     * Adds any sub-Components contained in the <code>SubstanceTitlePane</code>.
     */
    private void installSubcomponents() {
        int decorationStyle = this.getWindowDecorationStyle();
        if (decorationStyle == JRootPane.FRAME) {
            this.createActions();
            this.menuBar = this.createMenuBar();
            if (this.menuBar != null) {
                this.add(this.menuBar);
            }
            this.createButtons();
            this.add(this.minimizeButton);
            this.add(this.toggleButton);
            this.add(this.closeButton);
        } else {
            if ((decorationStyle == JRootPane.PLAIN_DIALOG)
                    || (decorationStyle == JRootPane.INFORMATION_DIALOG)
                    || (decorationStyle == JRootPane.ERROR_DIALOG)
                    || (decorationStyle == JRootPane.COLOR_CHOOSER_DIALOG)
                    || (decorationStyle == JRootPane.FILE_CHOOSER_DIALOG)
                    || (decorationStyle == JRootPane.QUESTION_DIALOG)
                    || (decorationStyle == JRootPane.WARNING_DIALOG)) {
                this.createActions();
                this.createButtons();
                this.add(this.closeButton);
            }
        }
    }

    /**
     * Installs the fonts and necessary properties.
     */
    private void installDefaults() {
        Font font = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet().getWindowTitleFont();
        this.setFont(font);
    }

    /**
     * Returns the <code>JMenuBar</code> displaying the appropriate system menu items.
     *
     * @return <code>JMenuBar</code> displaying the appropriate system menu items.
     */
    private JMenuBar createMenuBar() {
        this.menuBar = new SubstanceMenuBar();
        this.menuBar.setFocusable(false);
        this.menuBar.setBorderPainted(true);
        this.menuBar.add(this.createMenu());
        this.menuBar.setOpaque(false);
        // support for RTL
        this.menuBar.applyComponentOrientation(this.rootPane.getComponentOrientation());

        SubstanceSlices.TitleIconHorizontalGravity iconGravity = SubstanceTitlePaneUtilities
                .getTitlePaneIconGravity();
        SubstanceTitlePaneUtilities.markTitlePaneExtraComponent(this.menuBar,
                (iconGravity == SubstanceSlices.TitleIconHorizontalGravity.NEXT_TO_TITLE)
                        ? SubstanceTitlePaneUtilities.ExtraComponentKind.WITH_TITLE
                        : SubstanceTitlePaneUtilities.ExtraComponentKind.LEADING);

        return this.menuBar;
    }

    /**
     * Create the <code>Action</code>s that get associated with the buttons and menu items.
     */
    private void createActions() {
        this.closeAction = new CloseAction();
        if (this.getWindowDecorationStyle() == JRootPane.FRAME) {
            this.iconifyAction = new IconifyAction();
            this.restoreAction = new RestoreAction();
            this.maximizeAction = new MaximizeAction();
        }
    }

    /**
     * Returns the <code>JMenu</code> displaying the appropriate menu items for manipulating the
     * Frame.
     *
     * @return <code>JMenu</code> displaying the appropriate menu items for manipulating the Frame.
     */
    private JMenu createMenu() {
        JMenu menu = new JMenu("");
        menu.setOpaque(false);
        menu.setBackground(null);
        if (this.getWindowDecorationStyle() == JRootPane.FRAME) {
            this.addMenuItems(menu);
        }
        return menu;
    }

    /**
     * Adds the necessary <code>JMenuItem</code>s to the specified menu.
     *
     * @param menu Menu.
     */
    private void addMenuItems(JMenu menu) {
        menu.add(this.restoreAction);

        menu.add(this.iconifyAction);

        if (Toolkit.getDefaultToolkit().isFrameStateSupported(Frame.MAXIMIZED_BOTH)) {
            menu.add(this.maximizeAction);
        }

        if (SubstanceCoreUtilities.toShowExtraWidgets(rootPane)) {
            menu.addSeparator();
            JMenu skinMenu = new JMenu(
                    SubstanceCortex.GlobalScope.getLabelBundle().getString("SystemMenu.skins"));
            Map<String, SkinInfo> allSkins = SubstanceCortex.GlobalScope.getAllSkins();
            for (Map.Entry<String, SkinInfo> skinEntry : allSkins.entrySet()) {
                final String skinClassName = skinEntry.getValue().getClassName();
                JMenuItem jmiSkin = new JMenuItem(skinEntry.getKey());
                jmiSkin.addActionListener(actionEvent -> SwingUtilities
                        .invokeLater(() -> SubstanceCortex.GlobalScope.setSkin(skinClassName)));

                skinMenu.add(jmiSkin);
            }
            menu.add(skinMenu);
        }

        menu.addSeparator();

        menu.add(this.closeAction);
    }

    /**
     * Returns a <code>JButton</code> appropriate for placement on the TitlePane.
     *
     * @return Title button.
     */
    private JButton createTitleButton() {
        JButton button = new SubstanceTitleButton();

        button.setFocusPainted(false);
        button.setFocusable(false);
        button.setOpaque(true);

        SubstanceTitlePaneUtilities.markTitlePaneExtraComponent(button,
                SubstanceTitlePaneUtilities.getTitlePaneControlButtonKind(this.rootPane));

        return button;
    }

    /**
     * Creates the Buttons that will be placed on the TitlePane.
     */
    private void createButtons() {
        this.closeButton = this.createTitleButton();
        this.closeButton.setAction(this.closeAction);
        this.closeButton.setText(null);
        this.closeButton.setBorder(null);

        Icon closeIcon = new TransitionAwareIcon(closeButton,
                scheme -> SubstanceIconFactory.getTitlePaneIcon(
                        SubstanceIconFactory.IconKind.CLOSE, scheme),
                "substance.titlePane.closeIcon");
        this.closeButton.setIcon(closeIcon);

        this.closeButton.setFocusable(false);
        SubstanceCortex.ComponentOrParentScope.setBackgroundAppearanceStrategy(this.closeButton,
                SubstanceSlices.BackgroundAppearanceStrategy.FLAT);

        this.closeButton.putClientProperty(SubstanceButtonUI.IS_TITLE_CLOSE_BUTTON, Boolean.TRUE);

        if (this.getWindowDecorationStyle() == JRootPane.FRAME) {
            this.minimizeButton = this.createTitleButton();
            this.minimizeButton.setAction(this.iconifyAction);
            this.minimizeButton.setText(null);
            this.minimizeButton.setBorder(null);

            Icon minIcon = new TransitionAwareIcon(this.minimizeButton,
                    scheme -> SubstanceIconFactory.getTitlePaneIcon(
                            SubstanceIconFactory.IconKind.MINIMIZE, scheme),
                    "substance.titlePane.minIcon");
            this.minimizeButton.setIcon(minIcon);

            this.minimizeButton.setFocusable(false);
            SubstanceCortex.ComponentOrParentScope.setBackgroundAppearanceStrategy(
                    this.minimizeButton, SubstanceSlices.BackgroundAppearanceStrategy.FLAT);
            this.minimizeButton.setToolTipText(
                    SubstanceCortex.GlobalScope.getLabelBundle().getString("SystemMenu.iconify"));

            this.toggleButton = this.createTitleButton();
            this.toggleButton.setAction(this.restoreAction);
            this.toggleButton.setText(null);
            this.toggleButton.setBorder(null);

            Icon maxIcon = new TransitionAwareIcon(this.toggleButton,
                    scheme -> SubstanceIconFactory.getTitlePaneIcon(
                            SubstanceIconFactory.IconKind.MAXIMIZE, scheme),
                    "substance.titlePane.maxIcon");
            this.toggleButton.setIcon(maxIcon);

            this.toggleButton.setToolTipText(
                    SubstanceCortex.GlobalScope.getLabelBundle().getString("SystemMenu.maximize"));
            this.toggleButton.setFocusable(false);
            SubstanceCortex.ComponentOrParentScope.setBackgroundAppearanceStrategy(
                    this.toggleButton, SubstanceSlices.BackgroundAppearanceStrategy.FLAT);

        }
        syncCloseButtonTooltip();
    }

    /**
     * Returns the <code>LayoutManager</code> that should be installed on the
     * <code>SubstanceTitlePane</code>.
     *
     * @return Layout manager.
     */
    protected LayoutManager createLayout() {
        return new TitlePaneLayout();
    }

    /**
     * Updates state dependant upon the Window's active state.
     *
     * @param isActive if <code>true</code>, the window is in active state.
     */
    private void setActive(boolean isActive) {
        this.getRootPane().repaint();
    }

    /**
     * Sets the state of the Window.
     *
     * @param state Window state.
     */
    private void setState(int state) {
        this.setState(state, false);
    }

    /**
     * Sets the state of the window. If <code>updateRegardless</code> is true and the state has not
     * changed, this will update anyway.
     *
     * @param state            Window state.
     * @param updateRegardless if <code>true</code>, the update is done in any case.
     */
    private void setState(int state, boolean updateRegardless) {
        if ((this.window != null) && (this.getWindowDecorationStyle() == JRootPane.FRAME)) {
            if ((this.state == state) && !updateRegardless) {
                return;
            }
            Frame frame = this.getFrame();

            if (frame != null) {
                final JRootPane rootPane = this.getRootPane();

                if (((state & Frame.MAXIMIZED_BOTH) != 0)
                        && ((rootPane.getBorder() == null)
                        || (rootPane.getBorder() instanceof UIResource))
                        && frame.isShowing()) {
                    rootPane.setBorder(null);
                } else {
                    if ((state & Frame.MAXIMIZED_BOTH) == 0) {
                        // This is a croak, if state becomes bound, this can
                        // be nuked.
                        this.rootPaneUI.installBorder(rootPane);
                    }
                }
                if (frame.isResizable()) {
                    if ((state & Frame.MAXIMIZED_BOTH) != 0) {
                        Icon restoreIcon = new TransitionAwareIcon(this.toggleButton,
                                scheme -> SubstanceIconFactory.getTitlePaneIcon(
                                        SubstanceIconFactory.IconKind.RESTORE, scheme),
                                "substance.titlePane.restoreIcon");
                        this.updateToggleButton(this.restoreAction, restoreIcon);
                        this.toggleButton.setToolTipText(SubstanceCortex.GlobalScope
                                .getLabelBundle().getString("SystemMenu.restore"));
                        this.maximizeAction.setEnabled(false);
                        this.restoreAction.setEnabled(true);
                    } else {
                        Icon maxIcon = new TransitionAwareIcon(this.toggleButton,
                                scheme -> SubstanceIconFactory.getTitlePaneIcon(
                                        SubstanceIconFactory.IconKind.MAXIMIZE, scheme),
                                "substance.titlePane.maxIcon");
                        this.updateToggleButton(this.maximizeAction, maxIcon);
                        this.toggleButton.setToolTipText(SubstanceCortex.GlobalScope
                                .getLabelBundle().getString("SystemMenu.maximize"));
                        this.maximizeAction.setEnabled(true);
                        this.restoreAction.setEnabled(false);
                    }
                    if ((this.toggleButton.getParent() == null)
                            || (this.minimizeButton.getParent() == null)) {
                        this.add(this.toggleButton);
                        this.add(this.minimizeButton);
                        this.revalidate();
                        this.repaint();
                    }
                    this.toggleButton.setText(null);
                } else {
                    this.maximizeAction.setEnabled(false);
                    this.restoreAction.setEnabled(false);
                    if (this.toggleButton.getParent() != null) {
                        this.remove(this.toggleButton);
                        this.revalidate();
                        this.repaint();
                    }
                }
            } else {
                // Not contained in a Frame
                this.maximizeAction.setEnabled(false);
                this.restoreAction.setEnabled(false);
                this.iconifyAction.setEnabled(false);
                this.remove(this.toggleButton);
                this.remove(this.minimizeButton);
                this.revalidate();
                this.repaint();
            }
            this.closeAction.setEnabled(true);
            this.state = state;
        }
    }

    /**
     * Updates the toggle button to contain the Icon <code>icon</code>, and Action
     * <code>action</code>.
     *
     * @param action Action.
     * @param icon   Icon.
     */
    private void updateToggleButton(Action action, Icon icon) {
        this.toggleButton.setAction(action);
        this.toggleButton.setIcon(icon);
        this.toggleButton.setText(null);
    }

    /**
     * Returns the Frame rendering in. This will return null if the <code>JRootPane</code> is not
     * contained in a <code>Frame</code>.
     *
     * @return Frame.
     */
    private Frame getFrame() {
        if (this.window instanceof Frame) {
            return (Frame) window;
        }
        return null;
    }

    /**
     * Returns the String to display as the title.
     *
     * @return Display title.
     */
    private String getTitle() {
        if (this.window instanceof Frame) {
            return ((Frame) this.window).getTitle();
        }
        if (this.window instanceof Dialog) {
            return ((Dialog) this.window).getTitle();
        }
        return null;
    }

    private String getDisplayTitle() {
        String theTitle = this.getTitle();
        if (theTitle == null) {
            return null;
        }

        Font font = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet()
                .getWindowTitleFont();

        Rectangle titleTextRect = SubstanceTitlePaneUtilities.getTitlePaneTextRectangle(this,
                (this.window != null) ? this.window : this.getRootPane());
        FontMetrics fm = SubstanceMetricsUtilities.getFontMetrics(font);
        int titleWidth = titleTextRect.width - 20;
        String clippedTitle = SubstanceCoreUtilities.clipString(fm, titleWidth, theTitle);

        return clippedTitle;
    }

    @Override
    public void paintComponent(Graphics g) {
        // long start = System.nanoTime();
        // As state isn't bound, we need a convenience place to check
        // if it has changed. Changing the state typically changes the
        if (this.getFrame() != null) {
            this.setState(this.getFrame().getExtendedState());
        }

        if (this.isControlOnlyMode) {
            return;
        }

        final JRootPane rootPane = this.getRootPane();
        boolean leftToRight = (this.window == null)
                ? rootPane.getComponentOrientation().isLeftToRight()
                : this.window.getComponentOrientation().isLeftToRight();
        int width = this.getWidth();
        int height = this.getHeight();

        SubstanceSkin skin = SubstanceCoreUtilities.getSkin(rootPane);
        if (skin == null) {
            SubstanceCoreUtilities.traceSubstanceApiUsage(this,
                    "Substance delegate used when Substance is not the current LAF");
        }
        SubstanceColorScheme scheme = skin
                .getEnabledColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE);

        String theTitle = this.getTitle();
        String displayTitle = getDisplayTitle();

        Graphics2D graphics = (Graphics2D) g.create();
        BackgroundPaintingUtils.update(graphics, SubstanceTitlePane.this, false);

        Font font = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet()
                .getWindowTitleFont();
        graphics.setFont(font);

        if (displayTitle != null) {
            Rectangle titleTextRect = SubstanceTitlePaneUtilities.getTitlePaneTextRectangle(this,
                    (this.window != null) ? this.window : this.getRootPane());
            FontMetrics fm = SubstanceMetricsUtilities.getFontMetrics(font);
            int displayTitleWidth = fm.stringWidth(displayTitle);

            // show tooltip with full title only if necessary
            if (theTitle.equals(displayTitle)) {
                this.setToolTipText(null);
            } else {
                this.setToolTipText(theTitle);
            }

            int xOffset = 0;
            SubstanceSlices.HorizontalGravity titleTextGravity = SubstanceTitlePaneUtilities
                    .getTitlePaneTextGravity();
            switch (titleTextGravity) {
                case LEADING:
                    xOffset = leftToRight ? titleTextRect.x
                            : titleTextRect.x + titleTextRect.width - displayTitleWidth;
                    break;
                case TRAILING:
                    xOffset = leftToRight
                            ? titleTextRect.x + titleTextRect.width - displayTitleWidth
                            : titleTextRect.x;
                    break;
                default:
                    xOffset = titleTextRect.x + (titleTextRect.width - displayTitleWidth) / 2;
            }

            int yOffset = titleTextRect.y + (int) ((titleTextRect.getHeight() - fm.getHeight()) / 2)
                    + fm.getAscent();

            SubstanceTextUtilities.paintTextWithDropShadow(this, graphics,
                    scheme.getForegroundColor(), scheme.getEchoColor(), displayTitle,
                    width, height, xOffset, yOffset);
        }

        GhostPaintingUtils.paintGhostImages(this, graphics);

        // long end = System.nanoTime();
        // System.out.println(end - start);
        graphics.dispose();
    }

    /**
     * Actions used to <code>close</code> the <code>Window</code>.
     */
    private class CloseAction extends AbstractAction {
        /**
         * Creates a new close action.
         */
        public CloseAction() {
            super(SubstanceCortex.GlobalScope.getLabelBundle().getString("SystemMenu.close"),
                    SubstanceImageCreator.getCloseIcon(
                            SubstanceCoreUtilities.getSkin(rootPane)
                                    .getActiveColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE)));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (window != null) {
                window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING));
            }
        }
    }

    /**
     * Actions used to <code>iconfiy</code> the <code>Frame</code>.
     */
    private class IconifyAction extends AbstractAction {
        /**
         * Creates a new iconify action.
         */
        private IconifyAction() {
            super(SubstanceCortex.GlobalScope.getLabelBundle().getString("SystemMenu.iconify"),
                    SubstanceImageCreator.getMinimizeIcon(
                            SubstanceCoreUtilities.getSkin(rootPane)
                                    .getActiveColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE)));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Frame frame = SubstanceTitlePane.this.getFrame();
            if (frame != null) {
                frame.setExtendedState(SubstanceTitlePane.this.state | Frame.ICONIFIED);
            }
        }
    }

    /**
     * Actions used to <code>restore</code> the <code>Frame</code>.
     */
    private class RestoreAction extends AbstractAction {
        /**
         * Creates a new restore action.
         */
        private RestoreAction() {
            super(SubstanceCortex.GlobalScope.getLabelBundle().getString("SystemMenu.restore"),
                    SubstanceImageCreator.getRestoreIcon(
                            SubstanceCoreUtilities.getSkin(rootPane)
                                    .getActiveColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE)));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Frame frame = SubstanceTitlePane.this.getFrame();

            if (frame == null) {
                return;
            }

            if ((SubstanceTitlePane.this.state & Frame.ICONIFIED) != 0) {
                frame.setExtendedState(SubstanceTitlePane.this.state & ~Frame.ICONIFIED);
            } else {
                frame.setExtendedState(SubstanceTitlePane.this.state & ~Frame.MAXIMIZED_BOTH);
            }
        }
    }

    /**
     * Actions used to <code>restore</code> the <code>Frame</code>.
     */
    private class MaximizeAction extends AbstractAction {
        /**
         * Creates a new maximize action.
         */
        private MaximizeAction() {
            super(SubstanceCortex.GlobalScope.getLabelBundle().getString("SystemMenu.maximize"),
                    SubstanceImageCreator.getMaximizeIcon(
                            SubstanceCoreUtilities.getSkin(rootPane)
                                    .getActiveColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE)));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Frame frame = SubstanceTitlePane.this.getFrame();
            if (frame != null) {
                frame.setExtendedState(SubstanceTitlePane.this.state | Frame.MAXIMIZED_BOTH);
            }
        }
    }

    /**
     * Class responsible for drawing the system menu. Looks up the image to draw from the Frame
     * associated with the <code>JRootPane</code>.
     */
    public class SubstanceMenuBar extends JMenuBar {
        @Override
        public void paint(Graphics g) {
            if (appIcon != null) {
                float scaleFactor = (float) NeonCortex.getScaleFactor();
                g.drawImage(appIcon, 0, 0, (int) (appIcon.getWidth(null) / scaleFactor),
                        (int) (appIcon.getHeight(null) / scaleFactor), null);
            } else {
                Icon icon = UIManager.getIcon("InternalFrame.icon");
                if (icon != null) {
                    icon.paintIcon(this, g, 0, 0);
                }
            }
        }

        @Override
        public Dimension getMinimumSize() {
            return this.getPreferredSize();
        }

        @Override
        public Dimension getPreferredSize() {
            Dimension size = super.getPreferredSize();

            int iSize = SubstanceSizeUtils.getTitlePaneIconSize();
            return new Dimension(Math.max(iSize, size.width), Math.max(size.height, iSize));
        }
    }

    /**
     * Layout manager for the title pane.
     *
     * @author Kirill Graphics
     */
    protected class TitlePaneLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component c) {
        }

        @Override
        public void removeLayoutComponent(Component c) {
        }

        @Override
        public Dimension preferredLayoutSize(Container c) {
            int height = getPaneHeight();
            return new Dimension(height, height);
        }

        @Override
        public Dimension minimumLayoutSize(Container c) {
            return this.preferredLayoutSize(c);
        }

        @Override
        public void layoutContainer(Container c) {
            JRootPane rootPane = getRootPane();
            boolean leftToRight = rootPane.getComponentOrientation().isLeftToRight();
            boolean controlButtonsOnRight = SubstanceTitlePaneUtilities
                    .areTitlePaneControlButtonsOnRight(rootPane);

            int w = SubstanceTitlePane.this.getWidth();
            int x;
            int spacing;

            // assumes all buttons have the same dimensions
            // these dimensions include the borders
            int buttonSize = getControlButtonSize();

            SubstanceSlices.VerticalGravity buttonGroupVerticalGravity = SubstanceTitlePaneUtilities
                    .getTitleControlButtonGroupVerticalGravity(rootPane);
            final int height = getHeight();
            final int y;
            switch (buttonGroupVerticalGravity) {
                case TOP:
                    y = 0;
                    break;
                case BOTTOM:
                    y = height - buttonSize;
                    break;
                default:
                    y = (height - buttonSize) / 2;
            }

            x = leftToRight ? w : 0;

            SubstanceSlices.TitleIconHorizontalGravity iconHorizontalGravity = isControlOnlyMode
                    ? SubstanceSlices.TitleIconHorizontalGravity.NONE
                    : SubstanceTitlePaneUtilities.getTitlePaneIconGravity();
            SubstanceSlices.HorizontalGravity titleTextHorizontalGravity = SubstanceTitlePaneUtilities
                    .getTitlePaneTextGravity();
            if (SubstanceTitlePane.this.menuBar != null) {
                spacing = SubstanceSizeUtils.getTitlePaneHorizontalPadding(
                        SubstanceSizeUtils.getComponentFontSize(SubstanceTitlePane.this));
                int menuBarLeft;
                switch (iconHorizontalGravity) {
                    case OPPOSITE_CONTROL_BUTTONS:
                        menuBarLeft = controlButtonsOnRight ? spacing : w - buttonSize - spacing;
                        break;
                    case NEXT_TO_TITLE:
                        Rectangle titleRect = SubstanceTitlePaneUtilities.getTitlePaneTextRectangle(
                                SubstanceTitlePane.this, (window != null) ? window : getRootPane());
                        String displayTitle = getDisplayTitle();

                        Font font = SubstanceCortex.GlobalScope.getFontPolicy()
                                .getFontSet().getWindowTitleFont();
                        int displayTitleWidth = SubstanceMetricsUtilities.getFontMetrics(font)
                                .stringWidth(displayTitle);
                        switch (titleTextHorizontalGravity) {
                            case LEADING:
                                menuBarLeft = leftToRight ? titleRect.x - buttonSize - spacing
                                        : titleRect.x + titleRect.width + spacing;
                                break;
                            case TRAILING:
                                menuBarLeft = leftToRight
                                        ? titleRect.x + titleRect.width - displayTitleWidth
                                        - buttonSize - spacing
                                        : titleRect.x + titleRect.width + spacing;
                                break;
                            default:
                                int displayTitleLeft = titleRect.x
                                        + (titleRect.width - displayTitleWidth) / 2;
                                menuBarLeft = leftToRight ? displayTitleLeft - buttonSize - spacing
                                        : displayTitleLeft + displayTitleWidth + spacing;
                        }

                        break;
                    default:
                        menuBarLeft = -1;
                }
                if (menuBarLeft >= 0) {
                    SubstanceTitlePane.this.menuBar.setVisible(true);
                    SubstanceTitlePane.this.menuBar.setBounds(menuBarLeft, y, buttonSize,
                            buttonSize);
                } else {
                    SubstanceTitlePane.this.menuBar.setVisible(false);
                }
            }

            x = controlButtonsOnRight ? w : 0;
            spacing = getControlButtonsSmallGap();
            x += controlButtonsOnRight ? -spacing - buttonSize : spacing;
            if (SubstanceTitlePane.this.closeButton != null) {
                SubstanceTitlePane.this.closeButton.setBounds(x, y, buttonSize, buttonSize);
            }

            if (!controlButtonsOnRight)
                x += buttonSize;

            if (SubstanceTitlePane.this.getWindowDecorationStyle() == JRootPane.FRAME) {
                if (Toolkit.getDefaultToolkit().isFrameStateSupported(Frame.MAXIMIZED_BOTH)) {
                    if (SubstanceTitlePane.this.toggleButton.getParent() != null) {
                        spacing = getControlButtonsLargeGap();
                        x += controlButtonsOnRight ? -spacing - buttonSize : spacing;
                        SubstanceTitlePane.this.toggleButton.setBounds(x, y, buttonSize,
                                buttonSize);
                        if (!controlButtonsOnRight) {
                            x += buttonSize;
                        }
                    }
                }

                if ((SubstanceTitlePane.this.minimizeButton != null)
                        && (SubstanceTitlePane.this.minimizeButton.getParent() != null)) {
                    spacing = getControlButtonsSmallGap();
                    x += controlButtonsOnRight ? -spacing - buttonSize : spacing;
                    SubstanceTitlePane.this.minimizeButton.setBounds(x, y, buttonSize, buttonSize);
                    if (!controlButtonsOnRight) {
                        x += buttonSize;
                    }
                }
            }
        }
    }

    /**
     * PropertyChangeListener installed on the Window. Updates the necessary state as the state of
     * the Window changes.
     */
    private class PropertyChangeHandler implements PropertyChangeListener {
        @Override
        public void propertyChange(PropertyChangeEvent pce) {
            String name = pce.getPropertyName();

            // Frame.state isn't currently bound.
            if ("resizable".equals(name) || "state".equals(name)) {
                Frame frame = SubstanceTitlePane.this.getFrame();

                if (frame != null) {
                    SubstanceTitlePane.this.setState(frame.getExtendedState(), true);
                }
                if ("resizable".equals(name)) {
                    SubstanceTitlePane.this.getRootPane().repaint();
                }
            } else {
                if ("title".equals(name)) {
                    SubstanceTitlePane.this.setToolTipText((String) pce.getNewValue());
                    revalidate();
                    repaint();
                } else if ("componentOrientation".equals(name)) {
                    revalidate();
                    repaint();
                } else if ("iconImage".equals(name)) {
                    updateAppIcon();
                    revalidate();
                    repaint();
                }
            }
        }
    }

    /**
     * WindowListener installed on the Window, updates the state as necessary.
     */
    private class WindowHandler extends WindowAdapter {
        @Override
        public void windowActivated(WindowEvent ev) {
            SubstanceTitlePane.this.setActive(true);
        }

        @Override
        public void windowDeactivated(WindowEvent ev) {
            SubstanceTitlePane.this.setActive(false);
        }
    }

    /**
     * Synchronizes the tooltip of the close button.
     */
    private void syncCloseButtonTooltip() {
        if (SubstanceCoreUtilities.isRootPaneModified(this.getRootPane())) {
            this.closeButton.setToolTipText(
                    SubstanceCortex.GlobalScope.getLabelBundle().getString("SystemMenu.close")
                            + " [" + SubstanceCortex.GlobalScope.getLabelBundle()
                            .getString("Tooltip.contentsNotSaved")
                            + "]");
        } else {
            this.closeButton.setToolTipText(
                    SubstanceCortex.GlobalScope.getLabelBundle().getString("SystemMenu.close"));
        }
        this.closeButton.repaint();
    }

    /**
     * Updates the application icon.
     */
    private void updateAppIcon() {
        if (this.window == null) {
            this.appIcon = null;
            return;
        }
        java.util.List<Image> iconImages = window.getIconImages();

        if (iconImages.size() == 0) {
            this.appIcon = null;
        } else {
            int prefSize = getControlButtonSize();
            this.appIcon = SubstanceCoreUtilities.getScaledIconImage(iconImages, prefSize,
                    prefSize);
        }
    }

    public AbstractButton getCloseButton() {
        return this.closeButton;
    }

    private int getControlButtonSize() {
        if ((this.closeButton != null) && (this.closeButton.getIcon() != null)) {
            return this.closeButton.getIcon().getIconHeight();
        } else {
            return SubstanceSizeUtils.getTitlePaneIconSize();
        }
    }

    private int getControlButtonsSmallGap() {
        return (int) SubstanceSizeUtils.getAdjustedSize(
                SubstanceSizeUtils.getComponentFontSize(this), 3, 2, 1);
    }

    private int getControlButtonsLargeGap() {
        return 10;
    }

    public void setControlOnlyMode() {
        this.isControlOnlyMode = true;
        this.setOpaque(false);
        this.revalidate();
        this.repaint();
    }

    public void setPreferredHeight(int preferredHeight) {
        this.preferredHeight = preferredHeight;
        this.revalidate();
        this.repaint();
    }

    public JButton createControlButton() {
        JButton result = createTitleButton();
        int prefSize = getControlButtonSize();
        result.setPreferredSize(new Dimension(prefSize, prefSize));
        SubstanceCortex.ComponentOrParentScope.setBackgroundAppearanceStrategy(result,
                SubstanceSlices.BackgroundAppearanceStrategy.FLAT);
        ComponentOrParentChainScope.setDecorationType(result,
                DecorationAreaType.PRIMARY_TITLE_PANE);
        return result;
    }

    private int getPaneHeight() {
        FontMetrics fm = SubstanceMetricsUtilities.getFontMetrics(this.getFont());
        int fontHeight = fm.getHeight();
        fontHeight += 7;
        int iconHeight = 0;
        if (SubstanceTitlePane.this.getWindowDecorationStyle() == JRootPane.FRAME) {
            iconHeight = SubstanceSizeUtils.getTitlePaneIconSize();
        }

        int finalHeight = Math.max(fontHeight, iconHeight);
        finalHeight = Math.max(finalHeight, SubstanceTitlePane.this.preferredHeight);
        return finalHeight;
    }

    public Insets getControlInsets() {
        boolean controlButtonsOnRight = SubstanceTitlePaneUtilities
                .areTitlePaneControlButtonsOnRight(getRootPane());

        int buttonSize = getControlButtonSize();

        // Close button and its offset
        int controlInsets = getControlButtonsSmallGap();
        controlInsets += buttonSize;

        if (this.getWindowDecorationStyle() == JRootPane.FRAME) {
            if (Toolkit.getDefaultToolkit().isFrameStateSupported(Frame.MAXIMIZED_BOTH)) {
                // Toggle / maximize button
                if (this.toggleButton.getParent() != null) {
                    controlInsets += getControlButtonsLargeGap();
                    controlInsets += buttonSize;
                }
            }

            if ((this.minimizeButton != null) && (this.minimizeButton.getParent() != null)) {
                // Minimize button
                controlInsets += getControlButtonsSmallGap();
                controlInsets += buttonSize;
            }
        }

        int height = getPaneHeight();

        SubstanceSlices.VerticalGravity buttonGroupVerticalGravity = SubstanceTitlePaneUtilities
                .getTitleControlButtonGroupVerticalGravity(rootPane);
        final int y;
        switch (buttonGroupVerticalGravity) {
            case TOP:
                y = 0;
                break;
            case BOTTOM:
                y = height - buttonSize;
                break;
            default:
                y = (height - buttonSize) / 2;
        }

        int leftInset = controlButtonsOnRight ? 0 : controlInsets;
        int rightInset = controlButtonsOnRight ? controlInsets : 0;
        int topInset = y;
        int bottomInset = height - y - buttonSize;
        return new Insets(topInset, leftInset, bottomInset, rightInset);
    }
}
