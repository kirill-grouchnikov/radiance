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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.titlepane.TitlePaneButtonProvider;
import org.pushingpixels.radiance.theming.api.titlepane.TitlePaneButtonsProvider;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.blade.BladeIconUtils;
import org.pushingpixels.radiance.theming.internal.blade.BladeTransitionAwareIcon;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.ui.RadianceMenuBarUI;

import javax.swing.*;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.plaf.MenuBarUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

/**
 * UI for internal frame title pane in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceInternalFrameTitlePane extends BasicInternalFrameTitlePane {
    /**
     * Listens on the changes to the internal frame title.
     */
    protected PropertyChangeListener radiancePropertyListener;

    /**
     * Listens to the changes to the {@link RadianceSynapse#CONTENTS_MODIFIED } property on the
     * internal frame and its root pane.
     */
    private PropertyChangeListener radianceWinModifiedListener;

    /**
     * Client property to mark an internal frame as being iconified.
     */
    private static final String ICONIFYING = "radiance.theming.internal.internalTitleFramePane.iconifying";

    /**
     * Client property to mark a title pane as uninstalled.
     */
    private static final String UNINSTALLED = "radiance.theming.internal.internalTitleFramePane.uninstalled";

    private TitlePaneButtonsProvider titlePaneButtonsProvider;

    /**
     * Simple constructor.
     *
     * @param f Associated internal frame.
     */
    public RadianceInternalFrameTitlePane(JInternalFrame f) {
        super(f);
        this.setToolTipText(f.getTitle());
        RadianceThemingCortex.ComponentOrParentChainScope.setDecorationType(this,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE);
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        if (RadianceCoreUtilities.isCurrentLookAndFeel()) {
            this.setForeground(RadianceColorUtilities
                    .getForegroundColor(RadianceCoreUtilities.getSkin(this.frame)
                            .getActiveColorScheme(RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE)));
        }
    }

    @Override
    protected void installListeners() {
        super.installListeners();
        this.radiancePropertyListener = propertyChangeEvent -> {
            if (JInternalFrame.TITLE_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                RadianceInternalFrameTitlePane.this.setToolTipText((String) propertyChangeEvent.getNewValue());
            }
            if ("JInternalFrame.messageType".equals(propertyChangeEvent.getPropertyName())) {
                updateOptionPaneState();
                frame.repaint();
            }
        };
        this.frame.addPropertyChangeListener(this.radiancePropertyListener);

        // Property change listener for pulsating close button
        // when contents has been marked as modified.
        this.radianceWinModifiedListener = propertyChangeEvent -> {
            if (RadianceSynapse.CONTENTS_MODIFIED.equals(propertyChangeEvent.getPropertyName())) {
                this.closeButton.setToolTipText(this.titlePaneButtonsProvider.
                        getCloseButtonProvider().getText(this.frame.getRootPane()));
            }
            if (RadianceSynapse.TITLE_PANE_BUTTONS_PROVIDER.equals(propertyChangeEvent.getPropertyName())) {
                setButtonIcons();
            }
        };
        // Wire it on the root pane.
        this.frame.getRootPane().addPropertyChangeListener(this.radianceWinModifiedListener);
    }

    @Override
    protected JMenuBar createSystemMenuBar() {
        this.menuBar = new RadianceMenuBar();
        this.menuBar.setBorderPainted(true);
        this.menuBar.setOpaque(false);
        this.menuBar.setFocusable(false);
        // support for RTL
        this.menuBar.applyComponentOrientation(this.getComponentOrientation());

        RadianceThemingSlices.TitleIconHorizontalGravity iconGravity = RadianceTitlePaneUtilities
                .getTitlePaneIconGravity();
        RadianceTitlePaneUtilities.markTitlePaneExtraComponent(this.menuBar,
                (iconGravity == RadianceThemingSlices.TitleIconHorizontalGravity.NEXT_TO_TITLE)
                        ? RadianceTitlePaneUtilities.ExtraComponentKind.WITH_TITLE
                        : RadianceTitlePaneUtilities.ExtraComponentKind.LEADING);
        return this.menuBar;
    }

    @Override
    public void uninstallListeners() {
        this.frame.removePropertyChangeListener(this.radiancePropertyListener);
        this.radiancePropertyListener = null;

        this.frame.getRootPane().removePropertyChangeListener(this.radianceWinModifiedListener);
        this.radianceWinModifiedListener = null;

        super.uninstallListeners();
    }

    /**
     * Uninstalls <code>this</code> title pane.
     */
    public void uninstall() {
        if ((this.menuBar != null) && (this.menuBar.getMenuCount() > 0)) {
            MenuBarUI menuBarUI = this.menuBar.getUI();
            if (menuBarUI instanceof RadianceMenuBarUI) {
                RadianceMenuBarUI ui = (RadianceMenuBarUI) menuBarUI;
                if (ui.getMenuBar() == this.menuBar)
                    menuBarUI.uninstallUI(this.menuBar);
            }
            RadianceCoreUtilities.uninstallMenu(this.menuBar.getMenu(0));
            this.remove(menuBar);
            // fix for issue 362 - remove the buttons so that we don't
            // have duplicate buttons on internal frames in reparented
            // desktop panes
            this.remove(maxButton);
            this.remove(closeButton);
            this.remove(iconButton);
        }
        this.uninstallListeners();
        this.putClientProperty(UNINSTALLED, Boolean.TRUE);
    }

    @Override
    protected void enableActions() {
        super.enableActions();

        if (!this.frame.isIcon()) {
            if (this.maxButton != null)
                this.maxButton.setEnabled(
                        this.maximizeAction.isEnabled() || this.restoreAction.isEnabled());
            if (this.iconButton != null)
                this.iconButton.setEnabled(this.iconifyAction.isEnabled());
        }
    }

    private String getDisplayTitle() {
        String theTitle = this.frame.getTitle();
        if (theTitle == null) {
            return null;
        }

        Font font = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet()
                .getWindowTitleFont();

        Rectangle titleTextRect = RadianceTitlePaneUtilities.getTitlePaneTextRectangle(this,
                this.frame);
        FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(
                RadianceCommonCortex.getScaleFactor(this), font);
        int titleWidth = titleTextRect.width - 20;
        String clippedTitle = RadianceCoreUtilities.clipString(fm, titleWidth, theTitle);

        return clippedTitle;
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();
        // Desktop icon is translucent.
        final float coef = (this.getParent() instanceof JDesktopIcon) ? 0.9f : 1.0f;
        graphics.setComposite(WidgetUtilities.getAlphaComposite(this.frame, coef, g));

        boolean leftToRight = this.frame.getComponentOrientation().isLeftToRight();

        int width = this.getWidth();
        int height = this.getHeight() + 2;

        RadianceColorScheme scheme = RadianceCoreUtilities.getSkin(this.frame)
                .getEnabledColorScheme(RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE);
        JInternalFrame hostFrame = (JInternalFrame) SwingUtilities
                .getAncestorOfClass(JInternalFrame.class, this);
        JComponent hostForColorization = hostFrame;
        if (hostFrame == null) {
            // try desktop icon
            JDesktopIcon desktopIcon = (JDesktopIcon) SwingUtilities
                    .getAncestorOfClass(JDesktopIcon.class, this);
            if (desktopIcon != null)
                hostFrame = desktopIcon.getInternalFrame();
            hostForColorization = desktopIcon;
        }
        Color backgr = hostFrame.getBackground();
        if (!(backgr instanceof UIResource)) {
            double colorization = RadianceCoreUtilities.getColorizationFactor(hostForColorization);
            scheme = RadianceColorSchemeUtilities.getShiftedScheme(scheme, backgr, colorization,
                    null, 0.0);
        }

        BackgroundPaintingUtils.update(graphics, RadianceInternalFrameTitlePane.this, false);

        String theTitle = this.frame.getTitle();
        String displayTitle = getDisplayTitle();

        Font font = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet().getWindowTitleFont();
        graphics.setFont(font);

        if (displayTitle != null) {
            Rectangle titleTextRect = RadianceTitlePaneUtilities.getTitlePaneTextRectangle(this,
                    this.frame);
            FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(
                    RadianceCommonCortex.getScaleFactor(this), font);
            int displayTitleWidth = fm.stringWidth(displayTitle);

            // show tooltip with full title only if necessary
            if (theTitle.equals(displayTitle)) {
                this.setToolTipText(null);
            } else {
                this.setToolTipText(theTitle);
            }

            int xOffset = 0;
            RadianceThemingSlices.HorizontalGravity titleTextGravity = RadianceTitlePaneUtilities
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

            RadianceTextUtilities.paintTextWithDropShadow(this, graphics,
                    scheme.getForegroundColor(), scheme.getEchoColor(), displayTitle,
                    width, height, xOffset, yOffset);
        }

        graphics.dispose();
    }

    @Override
    protected void setButtonIcons() {
        this.titlePaneButtonsProvider = RadianceCoreUtilities.getTitlePaneButtonsProvider(
                this.frame.getRootPane());

        super.setButtonIcons();
        if (!RadianceCoreUtilities.isCurrentLookAndFeel()) {
            return;
        }

        TitlePaneButtonProvider restoreButtonProvider = this.titlePaneButtonsProvider.getRestoreButtonProvider();
        Icon restoreIcon = new BladeTransitionAwareIcon(
                this.frame.isIcon() ? this.iconButton : this.maxButton,
                new BladeTransitionAwareIcon.Delegate() {
                    @Override
                    public void drawColorSchemeIcon(Graphics2D g, RadianceColorScheme scheme) {
                        restoreButtonProvider.drawIcon(g, scheme, RadianceSizeUtils.getTitlePaneIconSize());
                    }

                    @Override
                    public Dimension getIconDimension() {
                        int size = RadianceSizeUtils.getTitlePaneIconSize();
                        return new Dimension(size, size);
                    }
                });
        TitlePaneButtonProvider maximizeButtonProvider = this.titlePaneButtonsProvider.getMaximizeButtonProvider();
        Icon maximizeIcon = new BladeTransitionAwareIcon(this.maxButton,
                new BladeTransitionAwareIcon.Delegate() {
                    @Override
                    public void drawColorSchemeIcon(Graphics2D g, RadianceColorScheme scheme) {
                        maximizeButtonProvider.drawIcon(g, scheme, RadianceSizeUtils.getTitlePaneIconSize());
                    }

                    @Override
                    public Dimension getIconDimension() {
                        int size = RadianceSizeUtils.getTitlePaneIconSize();
                        return new Dimension(size, size);
                    }
                });
        TitlePaneButtonProvider iconifyButtonProvider = this.titlePaneButtonsProvider.getIconifyButtonProvider();
        Icon iconifyIcon = new BladeTransitionAwareIcon(this.iconButton,
                new BladeTransitionAwareIcon.Delegate() {
                    @Override
                    public void drawColorSchemeIcon(Graphics2D g, RadianceColorScheme scheme) {
                        iconifyButtonProvider.drawIcon(g, scheme, RadianceSizeUtils.getTitlePaneIconSize());
                    }

                    @Override
                    public Dimension getIconDimension() {
                        int size = RadianceSizeUtils.getTitlePaneIconSize();
                        return new Dimension(size, size);
                    }
                });
        TitlePaneButtonProvider closeButtonProvider = this.titlePaneButtonsProvider.getCloseButtonProvider();
        Icon closeIcon = new BladeTransitionAwareIcon(this.closeButton,
                new BladeTransitionAwareIcon.Delegate() {
                    @Override
                    public void drawColorSchemeIcon(Graphics2D g, RadianceColorScheme scheme) {
                        closeButtonProvider.drawIcon(g, scheme, RadianceSizeUtils.getTitlePaneIconSize());
                    }

                    @Override
                    public Dimension getIconDimension() {
                        int size = RadianceSizeUtils.getTitlePaneIconSize();
                        return new Dimension(size, size);
                    }
                });
        if (this.frame.isIcon()) {
            this.iconButton.setIcon(restoreIcon);
            this.iconButton.setToolTipText(restoreButtonProvider.getText(this.frame.getRootPane()));
            this.maxButton.setIcon(maximizeIcon);
            this.maxButton.setToolTipText(maximizeButtonProvider.getText(this.frame.getRootPane()));
        } else {
            this.iconButton.setIcon(iconifyIcon);
            this.iconButton.setToolTipText(iconifyButtonProvider.getText(this.frame.getRootPane()));
            if (this.frame.isMaximum()) {
                this.maxButton.setIcon(restoreIcon);
                this.maxButton.setToolTipText(restoreButtonProvider.getText(this.frame.getRootPane()));
            } else {
                this.maxButton.setIcon(maximizeIcon);
                this.maxButton.setToolTipText(maximizeButtonProvider.getText(this.frame.getRootPane()));
            }
        }
        this.closeButton.setIcon(closeIcon);
        this.closeButton.setToolTipText(closeButtonProvider.getText(this.frame.getRootPane()));
    }

    /**
     * Click correction listener that resets models of minimize and restore buttons on click (so
     * that the rollover behaviour will be preserved correctly).
     *
     * @author Kirill Grouchnikov.
     */
    public static class ClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            AbstractButton src = (AbstractButton) e.getSource();
            ButtonModel model = src.getModel();
            model.setArmed(false);
            model.setPressed(false);
            model.setRollover(false);
            model.setSelected(false);
        }
    }

    @Override
    protected void createActions() {
        super.createActions();
        this.iconifyAction = new RadianceIconifyAction();
    }

    @Override
    protected void createButtons() {
        iconButton = new RadianceTitleButton("InternalFrameTitlePane.iconifyButtonAccessibleName");
        iconButton.addActionListener(iconifyAction);

        maxButton = new RadianceTitleButton("InternalFrameTitlePane.maximizeButtonAccessibleName");
        maxButton.addActionListener(maximizeAction);

        closeButton = new RadianceTitleButton("InternalFrameTitlePane.closeButtonAccessibleName");
        closeButton.addActionListener(closeAction);

        RadianceTitlePaneUtilities.ExtraComponentKind buttonExtraComponentKind = RadianceTitlePaneUtilities
                .getTitlePaneControlButtonKind(this.frame.getRootPane());
        RadianceTitlePaneUtilities.markTitlePaneExtraComponent(iconButton,
                buttonExtraComponentKind);
        RadianceTitlePaneUtilities.markTitlePaneExtraComponent(maxButton,
                buttonExtraComponentKind);
        RadianceTitlePaneUtilities.markTitlePaneExtraComponent(closeButton,
                buttonExtraComponentKind);

        setButtonIcons();

        for (ActionListener listener : this.iconButton.getActionListeners())
            if (listener instanceof ClickListener)
                return;
        this.iconButton.addActionListener(new ClickListener());
        for (ActionListener listener : this.maxButton.getActionListeners())
            if (listener instanceof ClickListener)
                return;
        this.maxButton.addActionListener(new ClickListener());

        RadianceCoreUtilities.markButtonAsFlat(this.iconButton);
        RadianceCoreUtilities.markButtonAsFlat(this.maxButton);
        RadianceCoreUtilities.markButtonAsFlat(this.closeButton);

        this.enableActions();
    }

    @Override
    protected LayoutManager createLayout() {
        return new RadianceTitlePaneLayout();
    }

    @Override
    public void removeNotify() {
        super.removeNotify();

        // fix for defect 211 - internal frames that are iconified
        // programmatically should not uninstall the title panes.
        boolean isAlive = ((this.frame.isIcon() && !this.frame.isClosed())
                || Boolean.TRUE.equals(frame.getClientProperty(ICONIFYING)));
        if (!isAlive) {
            this.uninstall();
        }
    }

    @Override
    public void addNotify() {
        super.addNotify();
        if (Boolean.TRUE.equals(this.getClientProperty(UNINSTALLED))) {
            this.installTitlePane();
            // this.installListeners();
            this.putClientProperty(UNINSTALLED, null);
        }
    }

    /**
     * Layout manager for this title pane.
     *
     * @author Kirill Grouchnikov
     */
    protected class RadianceTitlePaneLayout extends TitlePaneLayout {
        @Override
        public void addLayoutComponent(String name, Component c) {
        }

        @Override
        public void removeLayoutComponent(Component c) {
        }

        @Override
        public Dimension preferredLayoutSize(Container c) {
            return minimumLayoutSize(c);
        }

        @Override
        public Dimension minimumLayoutSize(Container c) {
            // Compute width.
            int width = 30;
            if (frame.isClosable()) {
                width += 21;
            }
            if (frame.isMaximizable()) {
                width += 16 + (frame.isClosable() ? 10 : 4);
            }
            if (frame.isIconifiable()) {
                width += 16 + (frame.isMaximizable() ? 2 : (frame.isClosable() ? 10 : 4));
            }
            FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(
                    RadianceCommonCortex.getScaleFactor(c), getFont());
            String frameTitle = frame.getTitle();
            int title_w = frameTitle != null ? fm.stringWidth(frameTitle) : 0;
            int title_length = frameTitle != null ? frameTitle.length() : 0;

            if (title_length > 2) {
                int subtitle_w = fm.stringWidth(frame.getTitle().substring(0, 2) + "...");
                width += Math.min(title_w, subtitle_w);
            } else {
                width += title_w;
            }

            // Compute height.
            int height = 0;
            int fontHeight = fm.getHeight();
            fontHeight += 7;
            Icon icon = frame.getFrameIcon();
            int iconHeight = 0;
            if (icon != null) {
                // SystemMenuBar forces the icon to be 16x16 or less.
                iconHeight = Math.min(icon.getIconHeight(), 16);
            }
            iconHeight += 5;
            height = Math.max(fontHeight, iconHeight);

            return new Dimension(width, height);
        }

        @Override
        public void layoutContainer(Container c) {
            JRootPane rootPane = frame.getRootPane();
            boolean leftToRight = rootPane.getComponentOrientation().isLeftToRight();
            boolean controlButtonsOnRight = RadianceTitlePaneUtilities
                    .areTitlePaneControlButtonsOnRight(rootPane);

            int w = getWidth();
            int x;
            int spacing;
            // assumes all buttons have the same dimensions
            // these dimensions include the borders
            int buttonHeight = closeButton.getIcon().getIconHeight();
            int buttonWidth = closeButton.getIcon().getIconWidth();

            int y = (getHeight() - buttonHeight) / 2;

            // assumes all buttons have the same dimensions
            // these dimensions include the borders

            x = leftToRight ? w : 0;

            RadianceThemingSlices.TitleIconHorizontalGravity iconGravity =
                    RadianceTitlePaneUtilities.getTitlePaneIconGravity();
            RadianceThemingSlices.HorizontalGravity titleTextGravity =
                    RadianceTitlePaneUtilities.getTitlePaneTextGravity();
            if (RadianceInternalFrameTitlePane.this.menuBar != null) {
                spacing = 5;
                int menuBarLeft;
                switch (iconGravity) {
                    case OPPOSITE_CONTROL_BUTTONS:
                        menuBarLeft = controlButtonsOnRight ? spacing : w - buttonWidth - spacing;
                        break;
                    case NEXT_TO_TITLE:
                        Rectangle titleRect = RadianceTitlePaneUtilities.getTitlePaneTextRectangle(
                                RadianceInternalFrameTitlePane.this, frame);
                        String displayTitle = getDisplayTitle();

                        Font font = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet().getWindowTitleFont();
                        int displayTitleWidth = RadianceMetricsUtilities.getFontMetrics(
                                RadianceCommonCortex.getScaleFactor(c), font).stringWidth(displayTitle);
                        switch (titleTextGravity) {
                            case LEADING:
                                menuBarLeft = leftToRight ? titleRect.x - buttonWidth - spacing
                                        : titleRect.x + titleRect.width + spacing;
                                break;
                            case TRAILING:
                                menuBarLeft = leftToRight
                                        ? titleRect.x + titleRect.width - displayTitleWidth
                                        - buttonWidth - spacing
                                        : titleRect.x + titleRect.width + spacing;
                                break;
                            default:
                                int displayTitleLeft = titleRect.x
                                        + (titleRect.width - displayTitleWidth) / 2;
                                menuBarLeft = leftToRight ? displayTitleLeft - buttonWidth - spacing
                                        : displayTitleLeft + displayTitleWidth + spacing;
                        }

                        break;
                    default:
                        menuBarLeft = -1;

                }
                if (menuBarLeft >= 0) {
                    menuBar.setVisible(true);
                    menuBar.setBounds(menuBarLeft, y, buttonWidth, buttonHeight);
                } else {
                    menuBar.setVisible(false);
                }
            }

            x = controlButtonsOnRight ? w : 0;
            spacing = 3;

            closeButton.setVisible(frame.isClosable());
            if (frame.isClosable()) {
                x += controlButtonsOnRight ? -spacing - buttonWidth : spacing;
                closeButton.setBounds(x, y, buttonWidth, buttonHeight);
                if (!controlButtonsOnRight) {
                    x += buttonWidth;
                }
            }

            maxButton.setVisible(frame.isMaximizable());
            if (frame.isMaximizable()) {
                spacing = frame.isClosable() ? 10 : 4;
                x += controlButtonsOnRight ? -spacing - buttonWidth : spacing;
                maxButton.setBounds(x, y, buttonWidth, buttonHeight);
                if (!controlButtonsOnRight) {
                    x += buttonWidth;
                }
            }

            iconButton.setVisible(frame.isIconifiable());
            if (frame.isIconifiable()) {
                spacing = frame.isMaximizable() ? 2 : (frame.isClosable() ? 10 : 4);
                x += controlButtonsOnRight ? -spacing - buttonWidth : spacing;
                iconButton.setBounds(x, y, buttonWidth, buttonHeight);
                if (!controlButtonsOnRight) {
                    x += buttonWidth;
                }
            }
        }
    }

    /**
     * Custom iconifying action.
     *
     * @author Kirill Grouchnikov
     */
    public class RadianceIconifyAction extends IconifyAction {
        /**
         * Creates an iconifying action.
         */
        public RadianceIconifyAction() {
            super();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.putClientProperty(ICONIFYING, Boolean.TRUE);
            super.actionPerformed(e);
            frame.putClientProperty(ICONIFYING, null);
        }
    }

    /**
     * Class responsible for drawing the system menu. Looks up the image to draw from the Frame
     * associated with the <code>JRootPane</code>.
     */
    public class RadianceMenuBar extends JMenuBar {
        @Override
        public void paint(Graphics g) {
            Icon icon = frame.getFrameIcon();

            if (icon != null) {
                int width = this.getWidth();
                int height = this.getHeight();
                int iconWidth = icon.getIconWidth();
                int iconHeight = icon.getIconHeight();
                if ((iconWidth <= width) && (iconHeight <= height)) {
                    // paint the icon unscaled
                    icon.paintIcon(this, g, 0, 0);
                } else {
                    // need to scale the icon
                    float scale = Math.min((float) width / iconWidth, (float) height / iconHeight);
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.scale(scale, scale);
                    icon.paintIcon(this, g2d, 0, 0);
                    g2d.dispose();
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

            int iSize = RadianceSizeUtils.getTitlePaneIconSize();
            return new Dimension(Math.max(iSize, size.width), Math.max(size.height, iSize));
        }
    }

    /**
     * Updates the state of internal frames used in {@link JOptionPane}s.
     */
    private void updateOptionPaneState() {
        Object obj = frame.getClientProperty("JInternalFrame.messageType");

        if (obj == null) {
            // Don't change the closable state unless in an JOptionPane.
            return;
        }
        if (frame.isClosable()) {
            frame.setClosable(false);
        }
    }

    public AbstractButton getCloseButton() {
        return this.closeButton;
    }
}
