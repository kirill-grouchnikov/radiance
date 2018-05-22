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
package org.pushingpixels.substance.internal.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.MenuBarUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.ui.SubstanceButtonUI;
import org.pushingpixels.substance.internal.ui.SubstanceMenuBarUI;
import org.pushingpixels.substance.internal.utils.icon.SubstanceIconFactory;
import org.pushingpixels.substance.internal.utils.icon.TransitionAwareIcon;

/**
 * UI for internal frame title pane in <b>Substance </b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceInternalFrameTitlePane extends BasicInternalFrameTitlePane {
    /**
     * Listens on the changes to the internal frame title.
     */
    protected PropertyChangeListener substancePropertyListener;

    /**
     * Listens to the changes to the {@link SubstanceLookAndFeel#CONTENTS_MODIFIED } property on the
     * internal frame and its root pane.
     */
    protected PropertyChangeListener substanceWinModifiedListener;

    /**
     * Client property to mark an internal frame as being iconified.
     */
    protected static final String ICONIFYING = "substance.internal.internalTitleFramePane.iconifying";

    /**
     * Client property to mark a title pane as uninstalled.
     */
    protected static final String UNINSTALLED = "substance.internal.internalTitleFramePane.uninstalled";

    // protected boolean wasClosable;

    /**
     * Simple constructor.
     * 
     * @param f
     *            Associated internal frame.
     */
    public SubstanceInternalFrameTitlePane(JInternalFrame f) {
        super(f);
        this.setToolTipText(f.getTitle());
        ComponentOrParentChainScope.setDecorationType(this,
                DecorationAreaType.SECONDARY_TITLE_PANE);
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        if (SubstanceCoreUtilities.isCurrentLookAndFeel()) {
            this.setForeground(SubstanceColorUtilities
                    .getForegroundColor(SubstanceCoreUtilities.getSkin(this.frame)
                            .getActiveColorScheme(DecorationAreaType.SECONDARY_TITLE_PANE)));
        }
    }

    @Override
    protected void installListeners() {
        super.installListeners();
        this.substancePropertyListener = (PropertyChangeEvent evt) -> {
            if (JInternalFrame.TITLE_PROPERTY.equals(evt.getPropertyName())) {
                SubstanceInternalFrameTitlePane.this.setToolTipText((String) evt.getNewValue());
            }
            if ("JInternalFrame.messageType".equals(evt.getPropertyName())) {
                updateOptionPaneState();
                frame.repaint();
            }
        };
        this.frame.addPropertyChangeListener(this.substancePropertyListener);

        // Property change listener for pulsating close button
        // when contents has been marked as modified.
        this.substanceWinModifiedListener = (PropertyChangeEvent evt) -> {
            if (SubstanceSynapse.CONTENTS_MODIFIED.equals(evt.getPropertyName())) {
                syncCloseButtonTooltip();
            }
        };
        // Wire it on the root pane.
        this.frame.getRootPane().addPropertyChangeListener(this.substanceWinModifiedListener);
    }

    @Override
    protected JMenuBar createSystemMenuBar() {
        this.menuBar = new SubstanceMenuBar();
        this.menuBar.setBorderPainted(true);
        this.menuBar.setOpaque(false);
        this.menuBar.setFocusable(false);
        // support for RTL
        this.menuBar.applyComponentOrientation(this.getComponentOrientation());

        SubstanceSlices.TitleIconHorizontalGravity iconGravity = SubstanceTitlePaneUtilities
                .getTitlePaneIconGravity();
        SubstanceTitlePaneUtilities.markTitlePaneExtraComponent(this.menuBar,
                (iconGravity == SubstanceSlices.TitleIconHorizontalGravity.NEXT_TO_TITLE)
                        ? SubstanceTitlePaneUtilities.ExtraComponentKind.WITH_TITLE
                        : SubstanceTitlePaneUtilities.ExtraComponentKind.LEADING);
        return this.menuBar;
    }

    @Override
    public void uninstallListeners() {
        this.frame.removePropertyChangeListener(this.substancePropertyListener);
        this.substancePropertyListener = null;

        this.frame.getRootPane().removePropertyChangeListener(this.substanceWinModifiedListener);
        this.substanceWinModifiedListener = null;

        super.uninstallListeners();
    }

    /**
     * Uninstalls <code>this</code> title pane.
     */
    public void uninstall() {
        if ((this.menuBar != null) && (this.menuBar.getMenuCount() > 0)) {
            MenuBarUI menuBarUI = this.menuBar.getUI();
            if (menuBarUI instanceof SubstanceMenuBarUI) {
                SubstanceMenuBarUI ui = (SubstanceMenuBarUI) menuBarUI;
                if (ui.getMenuBar() == this.menuBar)
                    menuBarUI.uninstallUI(this.menuBar);
            }
            SubstanceCoreUtilities.uninstallMenu(this.menuBar.getMenu(0));
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

        Font font = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet("Substance", null)
                .getWindowTitleFont();

        Rectangle titleTextRect = SubstanceTitlePaneUtilities.getTitlePaneTextRectangle(this,
                this.frame);
        FontMetrics fm = this.frame.getFontMetrics(font);
        int titleWidth = titleTextRect.width - 20;
        String clippedTitle = SubstanceCoreUtilities.clipString(fm, titleWidth, theTitle);

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

        SubstanceColorScheme scheme = SubstanceCoreUtilities.getSkin(this.frame)
                .getEnabledColorScheme(DecorationAreaType.SECONDARY_TITLE_PANE);
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
            double colorization = SubstanceCoreUtilities.getColorizationFactor(hostForColorization);
            scheme = SubstanceColorSchemeUtilities.getShiftedScheme(scheme, backgr, colorization,
                    null, 0.0);
        }

        BackgroundPaintingUtils.update(graphics, SubstanceInternalFrameTitlePane.this, false);

        String theTitle = this.frame.getTitle();
        String displayTitle = getDisplayTitle();

        Font font = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet("Substance", null)
                .getWindowTitleFont();
        graphics.setFont(font);

        if (displayTitle != null) {
            Rectangle titleTextRect = SubstanceTitlePaneUtilities.getTitlePaneTextRectangle(this,
                    this.frame);
            FontMetrics fm = this.frame.getFontMetrics(font);
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

            SubstanceColorScheme fillScheme = SubstanceCoreUtilities.getSkin(this.frame)
                    .getBackgroundColorScheme(DecorationAreaType.SECONDARY_TITLE_PANE);
            Color echoColor = !fillScheme.isDark() ? fillScheme.getUltraDarkColor()
                    : fillScheme.getUltraLightColor();
            SubstanceTextUtilities.paintTextWithDropShadow(this, graphics,
                    SubstanceColorUtilities.getForegroundColor(scheme), echoColor, displayTitle,
                    width, height, xOffset, yOffset);
        }

        graphics.dispose();
    }

    @Override
    protected void setButtonIcons() {
        super.setButtonIcons();
        if (!SubstanceCoreUtilities.isCurrentLookAndFeel())
            return;

        Icon restoreIcon = new TransitionAwareIcon(this.maxButton,
                (SubstanceColorScheme scheme) -> SubstanceIconFactory.getTitlePaneIcon(
                        SubstanceIconFactory.IconKind.RESTORE, scheme,
                        SubstanceCoreUtilities.getSkin(SubstanceInternalFrameTitlePane.this)
                                .getBackgroundColorScheme(DecorationAreaType.SECONDARY_TITLE_PANE)),
                "substance.internalFrame.restoreIcon");
        Icon maximizeIcon = new TransitionAwareIcon(this.maxButton,
                (SubstanceColorScheme scheme) -> SubstanceIconFactory.getTitlePaneIcon(
                        SubstanceIconFactory.IconKind.MAXIMIZE, scheme,
                        SubstanceCoreUtilities.getSkin(SubstanceInternalFrameTitlePane.this)
                                .getBackgroundColorScheme(DecorationAreaType.SECONDARY_TITLE_PANE)),
                "substance.internalFrame.maxIcon");
        Icon minimizeIcon = new TransitionAwareIcon(this.iconButton,
                (SubstanceColorScheme scheme) -> SubstanceIconFactory.getTitlePaneIcon(
                        SubstanceIconFactory.IconKind.MINIMIZE, scheme,
                        SubstanceCoreUtilities.getSkin(SubstanceInternalFrameTitlePane.this)
                                .getBackgroundColorScheme(DecorationAreaType.SECONDARY_TITLE_PANE)),
                "substance.internalFrame.minIcon");
        Icon closeIcon = new TransitionAwareIcon(this.closeButton,
                (SubstanceColorScheme scheme) -> SubstanceIconFactory.getTitlePaneIcon(
                        SubstanceIconFactory.IconKind.CLOSE, scheme,
                        SubstanceCoreUtilities.getSkin(SubstanceInternalFrameTitlePane.this)
                                .getBackgroundColorScheme(DecorationAreaType.SECONDARY_TITLE_PANE)),
                "substance.internalFrame.closeIcon");
        if (this.frame.isIcon()) {
            this.iconButton.setIcon(restoreIcon);
            this.iconButton.setToolTipText(
                    SubstanceCortex.GlobalScope.getLabelBundle().getString("SystemMenu.restore"));
            this.maxButton.setIcon(maximizeIcon);
            this.maxButton.setToolTipText(
                    SubstanceCortex.GlobalScope.getLabelBundle().getString("SystemMenu.maximize"));
        } else {
            this.iconButton.setIcon(minimizeIcon);
            this.iconButton.setToolTipText(
                    SubstanceCortex.GlobalScope.getLabelBundle().getString("SystemMenu.iconify"));
            if (this.frame.isMaximum()) {
                this.maxButton.setIcon(restoreIcon);
                this.maxButton.setToolTipText(SubstanceCortex.GlobalScope.getLabelBundle()
                        .getString("SystemMenu.restore"));
            } else {
                this.maxButton.setIcon(maximizeIcon);
                this.maxButton.setToolTipText(SubstanceCortex.GlobalScope.getLabelBundle()
                        .getString("SystemMenu.maximize"));
            }
        }
        if (closeIcon != null) {
            this.closeButton.setIcon(closeIcon);
            syncCloseButtonTooltip();
        }
    }

    /**
     * Click correction listener that resets models of minimize and restore buttons on click (so
     * that the rollover behaviour will be preserved correctly).
     * 
     * @author Kirill Grouchnikov.
     */
    public static class ClickListener implements ActionListener {
        /*
         * (non-Javadoc)
         * 
         * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent )
         */
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
        this.iconifyAction = new SubstanceIconifyAction();
    }

    @Override
    protected void createButtons() {
        iconButton = new SubstanceTitleButton("InternalFrameTitlePane.iconifyButtonAccessibleName");
        iconButton.addActionListener(iconifyAction);

        maxButton = new SubstanceTitleButton("InternalFrameTitlePane.maximizeButtonAccessibleName");
        maxButton.addActionListener(maximizeAction);

        closeButton = new SubstanceTitleButton("InternalFrameTitlePane.closeButtonAccessibleName");
        closeButton.addActionListener(closeAction);

        SubstanceTitlePaneUtilities.ExtraComponentKind buttonExtraComponentKind = SubstanceTitlePaneUtilities
                .getTitlePaneControlButtonKind(this.getRootPane());
        SubstanceTitlePaneUtilities.markTitlePaneExtraComponent(iconButton,
                buttonExtraComponentKind);
        SubstanceTitlePaneUtilities.markTitlePaneExtraComponent(maxButton,
                buttonExtraComponentKind);
        SubstanceTitlePaneUtilities.markTitlePaneExtraComponent(closeButton,
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

        SubstanceCoreUtilities.markButtonAsFlat(this.iconButton);
        SubstanceCoreUtilities.markButtonAsFlat(this.maxButton);
        SubstanceCoreUtilities.markButtonAsFlat(this.closeButton);

        this.closeButton.putClientProperty(SubstanceButtonUI.IS_TITLE_CLOSE_BUTTON, Boolean.TRUE);

        this.enableActions();
    }

    @Override
    protected LayoutManager createLayout() {
        return new SubstanceTitlePaneLayout();
    }

    /**
     * Synchronizes the tooltip of the close button.
     */
    protected void syncCloseButtonTooltip() {
        if (SubstanceCoreUtilities.isRootPaneModified(this.frame.getRootPane())) {
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
    protected class SubstanceTitlePaneLayout extends TitlePaneLayout {
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
            FontMetrics fm = frame.getFontMetrics(getFont());
            String frameTitle = frame.getTitle();
            int title_w = frameTitle != null ? fm.stringWidth(frameTitle) : 0;
            int title_length = frameTitle != null ? frameTitle.length() : 0;

            if (title_length > 2) {
                int subtitle_w = fm.stringWidth(frame.getTitle().substring(0, 2) + "...");
                width += (title_w < subtitle_w) ? title_w : subtitle_w;
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
            boolean controlButtonsOnRight = SubstanceTitlePaneUtilities
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

            SubstanceSlices.TitleIconHorizontalGravity iconGravity = SubstanceTitlePaneUtilities
                    .getTitlePaneIconGravity();
            SubstanceSlices.HorizontalGravity titleTextGravity = SubstanceTitlePaneUtilities
                    .getTitlePaneTextGravity();
            if (SubstanceInternalFrameTitlePane.this.menuBar != null) {
                spacing = 5;
                int menuBarLeft;
                switch (iconGravity) {
                    case OPPOSITE_CONTROL_BUTTONS:
                        menuBarLeft = controlButtonsOnRight ? spacing : w - buttonWidth - spacing;
                        break;
                    case NEXT_TO_TITLE:
                        Rectangle titleRect = SubstanceTitlePaneUtilities.getTitlePaneTextRectangle(
                                SubstanceInternalFrameTitlePane.this, frame);
                        String displayTitle = getDisplayTitle();

                        Font font = SubstanceCortex.GlobalScope.getFontPolicy()
                                .getFontSet("Substance", null).getWindowTitleFont();
                        int displayTitleWidth = frame.getFontMetrics(font)
                                .stringWidth(displayTitle);
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
            if (frame.isClosable()) {
                x += controlButtonsOnRight ? -spacing - buttonWidth : spacing;
                closeButton.setBounds(x, y, buttonWidth, buttonHeight);
                if (!controlButtonsOnRight) {
                    x += buttonWidth;
                }
            }

            if (frame.isMaximizable()) {
                spacing = frame.isClosable() ? 10 : 4;
                x += controlButtonsOnRight ? -spacing - buttonWidth : spacing;
                maxButton.setBounds(x, y, buttonWidth, buttonHeight);
                if (!controlButtonsOnRight) {
                    x += buttonWidth;
                }
            }

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
    public class SubstanceIconifyAction extends IconifyAction {
        /**
         * Creates an iconifying action.
         */
        public SubstanceIconifyAction() {
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
    public class SubstanceMenuBar extends JMenuBar {
        @Override
        public void paint(Graphics g) {
            Icon icon = frame.getFrameIcon();

            if (icon != null) {
                icon.paintIcon(this, g, 0, 0);
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
