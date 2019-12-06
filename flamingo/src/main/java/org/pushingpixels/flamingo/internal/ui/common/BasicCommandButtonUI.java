/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.internal.ui.common;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.CommandButtonLayoutManager.CommandButtonLayoutInfo;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.PopupButtonModel;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.JPopupPanel;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager;
import org.pushingpixels.neon.api.AsynchronousLoading;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.substance.api.SubstanceCortex;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashSet;
import java.util.Set;

/**
 * Basic UI for command button {@link JCommandButton}.
 * 
 * @author Kirill Grouchnikov
 */
public abstract class BasicCommandButtonUI extends CommandButtonUI {
    /**
     * The associated command button.
     */
    protected AbstractCommandButton commandButton;

    /**
     * Property change listener.
     */
    private PropertyChangeListener propertyChangeListener;
    
    private PropertyChangeListener projectionPropertyChangeListener;

    /**
     * Tracks user interaction with the command button (including keyboard and mouse).
     */
    private BasicCommandButtonListener basicPopupButtonListener;

    /**
     * Layout information.
     */
    protected CommandButtonLayoutManager.CommandButtonLayoutInfo layoutInfo;

    private ChangeListener actionPreviewChangeListener;

    private FocusListener focusListener;

    protected boolean isInnerFocusOnAction;

    /**
     * Client property to mark the command button to not dispose the popups on activation.
     * 
     * @see #disposePopupsActionListener
     */
    public static final String DONT_DISPOSE_POPUPS =
            "flamingo.internal.commandButton.ui.dontDisposePopups";

    /**
     * This listener disposes all popup panels when button's action is activated. An example of
     * scenario would be a command button in the popup panel of an in-ribbon gallery. When this
     * command button is activated, the associated popup panel is dismissed.
     * 
     * @see #DONT_DISPOSE_POPUPS
     */
    private CommandAction disposePopupsActionListener;

    /**
     * Action listener on the popup area.
     */
    private PopupActionListener popupActionListener;

    /**
     * The "expand" action icon.
     */
    protected ResizableIcon popupActionIcon;

    protected CommandButtonLayoutManager layoutManager;

    /**
     * Creates a new UI delegate.
     */
    protected BasicCommandButtonUI() {
    }

    @Override
    public void installUI(JComponent c) {
        this.commandButton = (AbstractCommandButton) c;
        installDefaults();
        installComponents();
        installListeners();
        installKeyboardActions();

        this.layoutManager = this.commandButton.getPresentationState()
                .createLayoutManager(this.commandButton);

        this.updateIconDimension();
    }

    @Override
    public void uninstallUI(JComponent c) {
        c.setLayout(null);

        uninstallKeyboardActions();
        uninstallListeners();
        uninstallComponents();
        uninstallDefaults();
        this.commandButton = null;
    }

    /**
     * Installs defaults on the associated command button.
     */
    protected void installDefaults() {
        this.updateBorder();
        this.syncDisabledIcon();
        Font currFont = this.commandButton.getFont();
        if ((currFont == null) || (currFont instanceof UIResource)) {
            this.commandButton.setFont(SubstanceCortex.GlobalScope.getFontPolicy()
                    .getFontSet().getControlFont());
        }
        this.syncIconDimension();

        // Support for focus traversal inside command buttons that have action area
        // and popup area
        this.commandButton.getActionMap().put("innerFocusChange", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleInnerFocus();
            }
        });

        KeyStroke tab = KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0);
        KeyStroke shiftTab = KeyStroke.getKeyStroke(KeyEvent.VK_TAB, KeyEvent.SHIFT_DOWN_MASK);
        KeyStroke ctrlTab = KeyStroke.getKeyStroke(KeyEvent.VK_TAB, KeyEvent.CTRL_DOWN_MASK);
        KeyStroke ctrlShiftTab = KeyStroke.getKeyStroke(KeyEvent.VK_TAB,
                KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK);

        // Only register TAB for forward traversal
        Set<AWTKeyStroke> forwardFocusKeys = new HashSet<>();
        forwardFocusKeys.add(tab);
        this.commandButton.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                forwardFocusKeys);

        // Only register SHIFT+TAB for backward traversal
        Set<AWTKeyStroke> backwardFocusKeys = new HashSet<>();
        backwardFocusKeys.add(shiftTab);
        this.commandButton.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
                backwardFocusKeys);

        // Add CTRL+keys to the command button's input map. Since we only have at most two
        // active areas (action and popup), there's no need for now to do anything different for
        // CTRL+TAB vs CTRL+SHIFT+TAB
        InputMap inputMap = this.commandButton.getInputMap(JComponent.WHEN_FOCUSED);
        inputMap.put(ctrlTab, "innerFocusChange");
        inputMap.put(ctrlShiftTab, "innerFocusChange");

        this.syncInitialInnerFocus();
    }

    protected void updateBorder() {
        Border currBorder = this.commandButton.getBorder();
        if ((currBorder == null) || (currBorder instanceof UIResource)) {
            int tb = (int) (this.commandButton.getVGapScaleFactor() * 4);
            int lr = (int) (this.commandButton.getHGapScaleFactor() * 6);
            this.commandButton
                    .setBorder(new BorderUIResource.EmptyBorderUIResource(tb, lr, tb, lr));
        }
    }

    /**
     * Installs subcomponents on the associated command button.
     */
    protected void installComponents() {
        this.updatePopupActionIcon();

        ResizableIcon buttonIcon = this.commandButton.getIcon();
        if (buttonIcon instanceof AsynchronousLoading) {
            ((AsynchronousLoading) buttonIcon).addAsynchronousLoadListener((boolean success) -> {
                if (success && (commandButton != null))
                    commandButton.repaint();
            });
        }

        if (this.commandButton instanceof JCommandButton) {
            this.popupActionIcon = this.createPopupActionIcon();
        }
    }

    /**
     * Installs listeners on the associated command button.
     */
    protected void installListeners() {
        this.basicPopupButtonListener = createButtonListener(this.commandButton);
        if (this.basicPopupButtonListener != null) {
            this.commandButton.addMouseListener(this.basicPopupButtonListener);
            this.commandButton.addMouseMotionListener(this.basicPopupButtonListener);
            this.commandButton.addFocusListener(this.basicPopupButtonListener);
            this.commandButton.addChangeListener(this.basicPopupButtonListener);
        }

        this.propertyChangeListener = (PropertyChangeEvent evt) -> {
            if (AbstractButton.ICON_CHANGED_PROPERTY.equals(evt.getPropertyName())) {
                Icon newIcon = (Icon) evt.getNewValue();
                if (newIcon instanceof AsynchronousLoading) {
                    AsynchronousLoading async = (AsynchronousLoading) newIcon;
                    async.addAsynchronousLoadListener((boolean success) -> {
                        if (success) {
                            if (commandButton != null) {
                                syncIconDimension();
                                syncDisabledIcon();
                                commandButton.repaint();
                            }
                        }
                    });
                    if (!async.isLoading()) {
                        syncIconDimension();
                        syncDisabledIcon();
                        commandButton.repaint();
                    }
                } else {
                    syncIconDimension();
                    syncDisabledIcon();
                    commandButton.revalidate();
                    commandButton.repaint();
                }
            }
            if ("commandButtonKind".equals(evt.getPropertyName())) {
                updatePopupActionIcon();
            }
            if ("popupOrientationKind".equals(evt.getPropertyName())) {
                updatePopupActionIcon();
            }
            if ("iconDimension".equals(evt.getPropertyName())) {
                updateIconDimension();
            }
            if ("hgapScaleFactor".equals(evt.getPropertyName())) {
                updateBorder();
            }
            if ("vgapScaleFactor".equals(evt.getPropertyName())) {
                updateBorder();
            }

            if ("popupModel".equals(evt.getPropertyName())) {
                // rewire the popup action listener on the new popup model
                PopupButtonModel oldModel = (PopupButtonModel) evt.getOldValue();
                PopupButtonModel newModel = (PopupButtonModel) evt.getNewValue();

                if (oldModel != null) {
                    oldModel.removePopupActionListener(popupActionListener);
                    popupActionListener = null;
                }

                if (newModel != null) {
                    popupActionListener = createPopupActionListener();
                    newModel.addPopupActionListener(popupActionListener);
                }
            }
            if ("presentationState".equals(evt.getPropertyName())) {
                syncIconDimension();
                syncDisabledIcon();

                commandButton.invalidate();
                commandButton.revalidate();
                commandButton.doLayout();
            }

            // pass the event to the layout manager
            if (layoutManager != null) {
                layoutManager.propertyChange(evt);
            }

            if ("componentOrientation".equals(evt.getPropertyName())) {
                updatePopupActionIcon();
                commandButton.repaint();
            }
        };
        this.commandButton.addPropertyChangeListener(this.propertyChangeListener);

        Command command = this.commandButton.getProjection().getContentModel();
        this.projectionPropertyChangeListener = (PropertyChangeEvent evt) -> {
            if ("text".equals(evt.getPropertyName())) {
                commandButton.setText((String) evt.getNewValue());
            }
            if ("extraText".equals(evt.getPropertyName())) {
                commandButton.setExtraText((String) evt.getNewValue());
            }
            if ("iconFactory".equals(evt.getPropertyName())) {
                ResizableIcon.Factory factory = (ResizableIcon.Factory) evt.getNewValue();
                commandButton.setIcon((factory != null) ? factory.createNewIcon() : null);
            }
            if ("disabledIconFactory".equals(evt.getPropertyName())) {
                ResizableIcon.Factory factory = (ResizableIcon.Factory) evt.getNewValue();
                commandButton.setDisabledIcon((factory != null) ? factory.createNewIcon() : null);
            }
            if ("isToggleSelected".equals(evt.getPropertyName())) {
                commandButton.getActionModel().setSelected((Boolean) evt.getNewValue());
                if (command.getToggleGroupModel() != null) {
                    command.getToggleGroupModel().setSelected(command, (Boolean) evt.getNewValue());
                }
            }
            if ("action".equals(evt.getPropertyName())) {
                commandButton.removeCommandListener((CommandAction) evt.getOldValue());
                commandButton.addCommandListener((CommandAction) evt.getNewValue());
            }
            if ("actionPreview".equals(evt.getPropertyName())) {
                syncActionPreview(command, ((Command.CommandActionPreview) evt.getNewValue()));
            }
            if ("actionRichTooltip".equals(evt.getPropertyName())) {
                commandButton.setActionRichTooltip((RichTooltip) evt.getNewValue());
            }
            if ("secondaryRichTooltip".equals(evt.getPropertyName())) {
                if (commandButton instanceof JCommandButton) {
                    ((JCommandButton) commandButton).setPopupRichTooltip(
                            (RichTooltip) evt.getNewValue());
                }
            }
            if ("isAutoRepeatAction".equals(evt.getPropertyName())) {
                if (commandButton instanceof JCommandButton) {
                    ((JCommandButton) commandButton).setAutoRepeatAction(
                            (Boolean) evt.getNewValue());
                }
            }
            if ("isFireActionOnRollover".equals(evt.getPropertyName())) {
                if (commandButton instanceof JCommandButton) {
                    ((JCommandButton) commandButton).setFireActionOnRollover(
                            (Boolean) evt.getNewValue());
                }
            }
            if ("isFireActionOnPress".equals(evt.getPropertyName())) {
                commandButton.getActionModel().setFireActionOnPress((Boolean) evt.getNewValue());
            }
            if ("actionEnabled".equals(evt.getPropertyName())) {
                commandButton.getActionModel().setEnabled((Boolean) evt.getNewValue());
                syncDisabledIcon();
                commandButton.repaint();
            }
            if ("secondaryEnabled".equals(evt.getPropertyName())) {
                if (commandButton instanceof JCommandButton) {
                    ((JCommandButton) commandButton).getPopupModel().setEnabled(
                            (Boolean) evt.getNewValue());
                    syncDisabledIcon();
                    commandButton.repaint();
                }
            }
        };
        command.addPropertyChangeListener(this.projectionPropertyChangeListener);

        syncActionPreview(command, command.getActionPreview());

        this.disposePopupsActionListener = (CommandActionEvent e) -> {
            boolean toDismiss = !Boolean.TRUE
                    .equals(commandButton.getClientProperty(DONT_DISPOSE_POPUPS));
            if (toDismiss) {
                JCommandPopupMenu menu = (JCommandPopupMenu) SwingUtilities
                        .getAncestorOfClass(JCommandPopupMenu.class, commandButton);
                if (menu != null) {
                    toDismiss = menu.getProjection().getPresentationModel()
                            .isToDismissOnCommandActivation();
                }
            }
            if (toDismiss) {
                if (SwingUtilities.getAncestorOfClass(JPopupPanel.class, commandButton) != null) {
                    SwingUtilities.invokeLater(() -> {
                        // command button may be cleared if the button click
                        // resulted in LAF switch
                        if (commandButton != null) {
                            // clear the active states
                            commandButton.getActionModel().setPressed(false);
                            commandButton.getActionModel().setRollover(false);
                            commandButton.getActionModel().setArmed(false);
                        }
                    });
                }
                PopupPanelManager.defaultManager().hidePopups(null);
            }
        };
        this.commandButton.addCommandListener(this.disposePopupsActionListener);

        if (this.commandButton instanceof JCommandButton) {
            this.popupActionListener = this.createPopupActionListener();
            ((JCommandButton) this.commandButton).getPopupModel()
                    .addPopupActionListener(this.popupActionListener);
        }

        this.focusListener = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                commandButton.repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                commandButton.repaint();
            }
        };
        this.commandButton.addFocusListener(this.focusListener);
    }

    /**
     * Creates the icon for the popup area.
     * 
     * @return The icon for the popup area.
     */
    protected ResizableIcon createPopupActionIcon() {
        return null;
    }

    /**
     * Creates the button listener for the specified command button.
     * 
     * @param b
     *            Command button.
     * @return The button listener for the specified command button.
     */
    protected BasicCommandButtonListener createButtonListener(AbstractCommandButton b) {
        return new BasicCommandButtonListener();
    }

    /**
     * Installs the keyboard actions on the associated command button.
     */
    protected void installKeyboardActions() {
        if (this.basicPopupButtonListener != null) {
            basicPopupButtonListener.installKeyboardActions(this.commandButton);
        }
    }

    /**
     * Uninstalls defaults from the associated command button.
     */
    protected void uninstallDefaults() {
    }

    /**
     * Uninstalls subcomponents from the associated command button.
     */
    protected void uninstallComponents() {
    }

    /**
     * Uninstalls listeners from the associated command button.
     */
    protected void uninstallListeners() {
        if (this.basicPopupButtonListener != null) {
            this.commandButton.removeMouseListener(this.basicPopupButtonListener);
            this.commandButton.removeMouseListener(this.basicPopupButtonListener);
            this.commandButton.removeMouseMotionListener(this.basicPopupButtonListener);
            this.commandButton.removeFocusListener(this.basicPopupButtonListener);
            this.commandButton.removeChangeListener(this.basicPopupButtonListener);
        }

        this.commandButton.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;

        this.commandButton.getProjection().getContentModel().removePropertyChangeListener(
                this.projectionPropertyChangeListener);
        this.projectionPropertyChangeListener = null;

        this.commandButton.removeCommandListener(this.disposePopupsActionListener);
        this.disposePopupsActionListener = null;

        if (this.commandButton instanceof JCommandButton) {
            ((JCommandButton) this.commandButton).getPopupModel()
                    .removePopupActionListener(this.popupActionListener);
            this.popupActionListener = null;
        }

        if (this.actionPreviewChangeListener != null) {
            this.commandButton.getActionModel().removeChangeListener(
                    this.actionPreviewChangeListener);
        }

        this.commandButton.removeFocusListener(this.focusListener);
        this.focusListener = null;
    }

    /**
     * Uninstalls the keyboard actions from the associated command button.
     */
    protected void uninstallKeyboardActions() {
        if (this.basicPopupButtonListener != null) {
            this.basicPopupButtonListener.uninstallKeyboardActions(this.commandButton);
        }
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        NeonCortex.installDesktopHints(g2d, this.commandButton.getFont());
        super.update(g2d, c);
        g2d.dispose();
    }

    /**
     * Returns the current icon.
     * 
     * @return Current icon.
     */
    protected Icon getIconToPaint() {
        return (toUseDisabledIcon() && this.commandButton.getDisabledIcon() != null)
                ? this.commandButton.getDisabledIcon()
                : this.commandButton.getIcon();
    }

    protected boolean toUseDisabledIcon() {
        // special case for command buttons with POPUP_ONLY kind -
        // check the popup model
        boolean toUseDisabledIcon;
        if (this.commandButton instanceof JCommandButton && ((JCommandButton) this.commandButton)
                .getCommandButtonKind() == JCommandButton.CommandButtonKind.POPUP_ONLY) {
            toUseDisabledIcon = !((JCommandButton) this.commandButton).getPopupModel().isEnabled();
        } else {
            toUseDisabledIcon = !this.commandButton.getActionModel().isEnabled();
        }
        // Disabled state at the component level overrides the model state
        if (!toUseDisabledIcon && !this.commandButton.isEnabled()) {
            toUseDisabledIcon = true;
        }
        return toUseDisabledIcon;
    }

    /**
     * Updates the icon dimension.
     */
    private void updateIconDimension() {
        int dimension = this.commandButton.getIconDimension();

        if (dimension > 0) {
            this.commandButton.getIcon().setDimension(new Dimension(dimension, dimension));
            this.commandButton.setPresentationState(CommandButtonPresentationState.FIT_TO_ICON);

            this.commandButton.invalidate();
            this.commandButton.revalidate();
            this.commandButton.doLayout();
            this.commandButton.repaint();
        }
    }

    /**
     * Updates the popup action icon.
     */
    protected void updatePopupActionIcon() {
        JCommandButton button = (JCommandButton) this.commandButton;
        if (button.getCommandButtonKind().hasPopup()) {
            this.popupActionIcon = this.createPopupActionIcon();
        } else {
            this.popupActionIcon = null;
        }
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        AbstractCommandButton button = (AbstractCommandButton) c;
        return this.layoutManager.getPreferredSize(button);
    }

    @Override
    public CommandButtonLayoutInfo getLayoutInfo() {
        if (this.layoutInfo != null) {
            return this.layoutInfo;
        }
        this.layoutInfo = this.layoutManager.getLayoutInfo(commandButton);
        return this.layoutInfo;
    }

    @Override
    public CommandButtonLayoutManager getLayoutManager() {
        return this.layoutManager;
    }

    /**
     * Returns the layout gap for the visuals of the associated command button.
     * 
     * @return The layout gap for the visuals of the associated command button.
     */
    protected int getLayoutGap() {
        Font font = this.commandButton.getFont();
        if (font == null) {
            font = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet().getControlFont();
        }
        return (font.getSize() - 4) / 4;
    }

    /**
     * Returns indication whether the action-popup areas separator is painted.
     * 
     * @return <code>true</code> if the action-popup areas separator is painted.
     */
    protected boolean isPaintingSeparators() {
        PopupButtonModel popupModel = (this.commandButton instanceof JCommandButton)
                ? ((JCommandButton) this.commandButton).getPopupModel()
                : null;
        boolean isActionRollover = this.commandButton.getActionModel().isRollover();
        boolean isPopupRollover = (popupModel != null) && popupModel.isRollover();
        return isActionRollover || isPopupRollover;
    }

    /**
     * Returns indication whether the button background is painted.
     * 
     * @return <code>true</code> if the button background is painted.
     */
    protected boolean isPaintingBackground() {
        PopupButtonModel popupModel = (this.commandButton instanceof JCommandButton)
                ? ((JCommandButton) this.commandButton).getPopupModel()
                : null;
        boolean isActionSelected = this.commandButton.getActionModel().isSelected();
        boolean isPopupSelected = (popupModel != null) && popupModel.isSelected();
        boolean isActionRollover = this.commandButton.getActionModel().isRollover();
        boolean isPopupRollover = (popupModel != null) && popupModel.isRollover();
        boolean isPopupShowing = (popupModel != null) && (popupModel.isPopupShowing());
        boolean isActionArmed = this.commandButton.getActionModel().isArmed();
        boolean isPopupArmed = (popupModel != null) && (popupModel.isArmed());

        return (isActionSelected || isPopupSelected || isActionRollover || isPopupRollover
                || isPopupShowing || isActionArmed || isPopupArmed || !this.commandButton.isFlat());
    }

    /**
     * Creates the popup action listener for this command button.
     * 
     * @return Popup action listener for this command button.
     */
    protected PopupActionListener createPopupActionListener() {
        return (ActionEvent e) -> processPopupAction();
    }

    public void processPopupAction() {
        boolean wasPopupShowing = false;
        if (this.commandButton instanceof JCommandButton) {
            wasPopupShowing = ((JCommandButton) this.commandButton).getPopupModel()
                    .isPopupShowing();
        }

        // dismiss all the popups that are currently showing
        // up until <this> button.
        PopupPanelManager.defaultManager().hidePopups(commandButton);

        if (!(commandButton instanceof JCommandButton)) {
            return;
        }

        if (wasPopupShowing) {
            return;
        }

        JCommandButton jcb = (JCommandButton) this.commandButton;

        // check if the command button has an associated popup panel
        PopupPanelCallback popupCallback = jcb.getPopupCallback();
        final JPopupPanel popupPanel =
                (popupCallback != null) ? popupCallback.getPopupPanel(jcb) : null;
        if (popupPanel != null) {
            popupPanel.applyComponentOrientation(jcb.getComponentOrientation());
            SwingUtilities.invokeLater(() -> {
                if ((commandButton == null) || (popupPanel == null)) {
                    return;
                }

                if (!commandButton.isShowing()) {
                    return;
                }

                popupPanel.doLayout();

                int x = 0;
                int y = 0;

                JPopupPanel.PopupPanelCustomizer customizer = popupPanel.getCustomizer();
                boolean ltr = commandButton.getComponentOrientation().isLeftToRight();
                if (customizer == null) {
                    switch (((JCommandButton) commandButton).getPopupOrientationKind()) {
                    case DOWNWARD:
                        if (ltr) {
                            x = commandButton.getLocationOnScreen().x;
                        } else {
                            x = commandButton.getLocationOnScreen().x + commandButton.getWidth()
                                    - popupPanel.getPreferredSize().width;
                        }
                        y = commandButton.getLocationOnScreen().y + commandButton.getSize().height;
                        break;
                    case SIDEWARD:
                        if (ltr) {
                            x = commandButton.getLocationOnScreen().x + commandButton.getWidth();
                        } else {
                            x = commandButton.getLocationOnScreen().x
                                    - popupPanel.getPreferredSize().width;
                        }
                        y = commandButton.getLocationOnScreen().y
                                + getLayoutInfo().popupClickArea.y;
                        break;
                    }
                } else {
                    Rectangle placementRect = customizer.getScreenBounds();
                    // System.out.println(placementRect);
                    x = placementRect.x;
                    y = placementRect.y;
                }

                // make sure that the popup stays in bounds
                Rectangle scrBounds = commandButton.getGraphicsConfiguration().getBounds();
                int pw = popupPanel.getPreferredSize().width;
                if ((x + pw) > (scrBounds.x + scrBounds.width)) {
                    x = scrBounds.x + scrBounds.width - pw;
                }
                int ph = popupPanel.getPreferredSize().height;
                if ((y + ph) > (scrBounds.y + scrBounds.height)) {
                    y = scrBounds.y + scrBounds.height - ph;
                }

                // get the popup and show it
                if (customizer != null) {
                    Rectangle placementRect = customizer.getScreenBounds();
                    popupPanel.setPreferredSize(
                            new Dimension(placementRect.width, placementRect.height));
                }
                Popup popup = PopupFactory.getSharedInstance().getPopup(commandButton, popupPanel,
                        x, y);
                // System.out.println("Showing the popup panel");
                PopupPanelManager.defaultManager().addPopup(commandButton, popup, popupPanel);
            });
        }
    }

    protected void syncDisabledIcon() {
    }

    private void syncIconDimension() {
        ResizableIcon icon = this.commandButton.getIcon();
        CommandButtonPresentationState commandButtonState =
                this.commandButton.getPresentationState();

        this.layoutManager = commandButtonState.createLayoutManager(this.commandButton);

        if (icon == null) {
            return;
        }

        int maxHeight = layoutManager.getPreferredIconSize(this.commandButton);
        if (maxHeight < 0) {
            maxHeight = this.commandButton.getIcon().getIconHeight();
        }

        if (commandButtonState != CommandButtonPresentationState.FIT_TO_ICON) {
            Dimension newDim = new Dimension(maxHeight, maxHeight);
            icon.setDimension(newDim);
        }
    }

    private void syncActionPreview(Command command, Command.CommandActionPreview actionPreview) {
        if (this.actionPreviewChangeListener != null) {
            this.commandButton.getActionModel().removeChangeListener(
                    this.actionPreviewChangeListener);
        }

        if (actionPreview != null) {
            this.actionPreviewChangeListener = new ChangeListener() {
                boolean wasRollover = false;

                @Override
                public void stateChanged(ChangeEvent e) {
                    boolean isRollover = commandButton.getActionModel().isRollover();
                    if (wasRollover && !isRollover) {
                        actionPreview.onCommandPreviewCanceled(command);
                    }
                    if (!wasRollover && isRollover) {
                        actionPreview.onCommandPreviewActivated(command);
                    }
                    wasRollover = isRollover;
                }
            };

            commandButton.getActionModel().addChangeListener(this.actionPreviewChangeListener);
        }
    }

    @Override
    public Point getActionKeyTipAnchorCenterPoint() {
        return this.layoutManager.getActionKeyTipAnchorCenterPoint(this.commandButton);
    }

    @Override
    public Point getPopupKeyTipAnchorCenterPoint() {
        return this.layoutManager.getPopupKeyTipAnchorCenterPoint(this.commandButton);
    }

    private void syncInitialInnerFocus() {
        if (!(this.commandButton instanceof JCommandButton)) {
            this.isInnerFocusOnAction = true;
            // Only JCommandButton can have two areas
            return;
        }

        JCommandButton jcb = (JCommandButton) this.commandButton;
        switch (jcb.getCommandButtonKind()) {
            case ACTION_ONLY:
                this.isInnerFocusOnAction = true;
                break;
            case POPUP_ONLY:
                this.isInnerFocusOnAction = false;
                break;
            default:
                this.isInnerFocusOnAction = jcb.getActionModel().isEnabled();
        }
    }

    private void toggleInnerFocus() {
        if (!(this.commandButton instanceof JCommandButton)) {
            // Only JCommandButton can have two areas
            return;
        }

        JCommandButton jcb = (JCommandButton) this.commandButton;
        JCommandButton.CommandButtonKind commandButtonKind = jcb.getCommandButtonKind();
        if ((commandButtonKind == JCommandButton.CommandButtonKind.ACTION_ONLY) ||
                (commandButtonKind == JCommandButton.CommandButtonKind.POPUP_ONLY)) {
            // Only one area
            return;
        }

        if (!jcb.getActionModel().isEnabled() || !jcb.getPopupModel().isEnabled()) {
            // Can transfer inner focus only if both areas are enabled
            return;
        }

        this.isInnerFocusOnAction = !this.isInnerFocusOnAction;

        this.commandButton.repaint();
    }

    @Override
    public boolean isInnerFocusOnAction() {
        return this.isInnerFocusOnAction;
    }

    @Override
    public void setInnerFocusOnAction(boolean innerFocusOnAction) {
        if (this.isInnerFocusOnAction != innerFocusOnAction) {
            this.isInnerFocusOnAction = innerFocusOnAction;
            this.commandButton.repaint();
        }
    }
}
