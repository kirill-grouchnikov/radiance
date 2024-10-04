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
package org.pushingpixels.radiance.component.internal.ui.common;

import org.pushingpixels.radiance.common.api.AsynchronousLoading;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.*;
import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager.CommandButtonLayoutInfo;
import org.pushingpixels.radiance.component.api.common.model.BaseCommand;
import org.pushingpixels.radiance.component.api.common.model.BaseCommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.PopupButtonModel;
import org.pushingpixels.radiance.component.api.common.popup.JCommandPopupMenuPanel;
import org.pushingpixels.radiance.component.api.common.popup.JPopupPanel;
import org.pushingpixels.radiance.component.api.common.popup.PopupPanelManager;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.accessibility.AccessibleContext;
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
    protected JCommandButton commandButton;

    /**
     * Property change listener.
     */
    private PropertyChangeListener propertyChangeListener;

    private PropertyChangeListener commandPropertyChangeListener;

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

    protected String text;
    protected String extraText;
    protected RadianceIcon icon;
    protected HorizontalAlignment horizontalAlignment;
    protected RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy;

    /**
     * Client property to mark the command button to not dispose the popups on activation.
     *
     * @see #disposePopupsActionListener
     */
    public static final String DO_NOT_DISPOSE_POPUPS =
            "radiance.component.internal.commandButton.ui.doNotDisposePopups";

    /**
     * This listener disposes all popup panels when button's action is activated. An example of
     * scenario would be a command button in the popup panel of an in-ribbon gallery. When this
     * command button is activated, the associated popup panel is dismissed.
     *
     * @see #DO_NOT_DISPOSE_POPUPS
     */
    private CommandAction disposePopupsActionListener;

    /**
     * Action listener on the popup area.
     */
    private PopupActionListener popupActionListener;

    /**
     * The popup indicator icon.
     */
    protected RadianceIcon popupIcon;

    protected CommandButtonLayoutManager layoutManager;

    /**
     * Creates a new UI delegate.
     */
    protected BasicCommandButtonUI() {
    }

    @Override
    public void installUI(JComponent c) {
        this.commandButton = (JCommandButton) c;
        installDefaults();
        installComponents();
        installListeners();
        installKeyboardActions();

        this.layoutManager = this.commandButton.getPresentationState().createLayoutManager();

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
        Font currFont = this.commandButton.getFont();
        if ((currFont == null) || (currFont instanceof UIResource)) {
            this.commandButton.setFont(RadianceThemingCortex.GlobalScope.getFontPolicy()
                    .getFontSet().getControlFont());
        }

        RadianceIcon.Factory iconFactory = this.commandButton.getContentModel().getIconFactory();
        this.icon = (iconFactory != null) ? iconFactory.createNewIcon() : null;
        this.text = this.commandButton.getContentModel().getText();
        this.extraText = this.commandButton.getContentModel().getExtraText();
        this.horizontalAlignment = this.commandButton.getPresentationModel().getHorizontalAlignment();
        this.backgroundAppearanceStrategy = this.commandButton.getPresentationModel().getBackgroundAppearanceStrategy();

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

    private void updateBorder() {
        Border currBorder = this.commandButton.getBorder();
        if ((currBorder == null) || (currBorder instanceof UIResource)) {
            BaseCommandButtonPresentationModel presentationModel =
                    this.commandButton.getPresentationModel();
            Insets contentPadding = presentationModel.getContentPadding();
            double hgapScaleFactor = presentationModel.getHorizontalGapScaleFactor();
            double vgapScaleFactor = presentationModel.getVerticalGapScaleFactor();

            int top = (int) (vgapScaleFactor * contentPadding.top);
            int bottom = (int) (vgapScaleFactor * contentPadding.bottom);
            int left = (int) (hgapScaleFactor * contentPadding.left);
            int right = (int) (hgapScaleFactor * contentPadding.right);

            this.commandButton.setBorder(
                    new BorderUIResource.EmptyBorderUIResource(top, left, bottom, right));
        }
    }

    /**
     * Installs subcomponents on the associated command button.
     */
    protected void installComponents() {
        this.updatePopupIcon();

        if (this.icon instanceof AsynchronousLoading) {
            ((AsynchronousLoading) this.icon).addAsynchronousLoadListener((boolean success) -> {
                if (success && (commandButton != null))
                    commandButton.repaint();
            });
        }

        this.popupIcon = this.commandButton.getPresentationModel().getPopupIcon();
    }

    /**
     * Installs listeners on the associated command button.
     */
    protected void installListeners() {
        this.basicPopupButtonListener = createButtonListener();
        if (this.basicPopupButtonListener != null) {
            this.commandButton.addMouseListener(this.basicPopupButtonListener);
            this.commandButton.addMouseMotionListener(this.basicPopupButtonListener);
            this.commandButton.addFocusListener(this.basicPopupButtonListener);
            this.commandButton.addChangeListener(this.basicPopupButtonListener);
        }

        this.propertyChangeListener = propertyChangeEvent -> {
            if (AbstractButton.ICON_CHANGED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                Icon newIcon = (Icon) propertyChangeEvent.getNewValue();
                if (newIcon instanceof AsynchronousLoading) {
                    AsynchronousLoading async = (AsynchronousLoading) newIcon;
                    async.addAsynchronousLoadListener((boolean success) -> {
                        if (success) {
                            if (commandButton != null) {
                                syncIconDimension();
                                commandButton.repaint();
                            }
                        }
                    });
                    if (!async.isLoading()) {
                        syncIconDimension();
                        commandButton.repaint();
                    }
                } else {
                    syncIconDimension();
                    commandButton.revalidate();
                    commandButton.repaint();
                }
            }
            if ("popupOrientationKind".equals(propertyChangeEvent.getPropertyName())) {
                updatePopupIcon();
            }
            if ("iconDimension".equals(propertyChangeEvent.getPropertyName())) {
                updateIconDimension();
            }
            if ("hgapScaleFactor".equals(propertyChangeEvent.getPropertyName())) {
                updateBorder();
            }
            if ("vgapScaleFactor".equals(propertyChangeEvent.getPropertyName())) {
                updateBorder();
            }

            if ("popupModel".equals(propertyChangeEvent.getPropertyName())) {
                // rewire the popup action listener on the new popup model
                PopupButtonModel oldModel = (PopupButtonModel) propertyChangeEvent.getOldValue();
                PopupButtonModel newModel = (PopupButtonModel) propertyChangeEvent.getNewValue();

                if (oldModel != null) {
                    oldModel.removePopupActionListener(popupActionListener);
                    popupActionListener = null;
                }

                if (newModel != null) {
                    popupActionListener = createPopupActionListener();
                    newModel.addPopupActionListener(popupActionListener);
                }
            }
            if ("presentationState".equals(propertyChangeEvent.getPropertyName())) {
                syncIconDimension();

                commandButton.invalidate();
                commandButton.revalidate();
                commandButton.doLayout();
            }

            // pass the event to the layout manager
            if (layoutManager != null) {
                layoutManager.propertyChange(propertyChangeEvent);
            }

            if ("componentOrientation".equals(propertyChangeEvent.getPropertyName())) {
                updatePopupIcon();
                commandButton.repaint();
            }
        };
        this.commandButton.addPropertyChangeListener(this.propertyChangeListener);

        BaseCommand<?> command = this.commandButton.getContentModel();
        this.commandPropertyChangeListener = propertyChangeEvent -> {
            if ("text".equals(propertyChangeEvent.getPropertyName())) {
                text = (String) propertyChangeEvent.getNewValue();
                AccessibleContext accessibleContext = commandButton.getAccessibleContext();
                if (accessibleContext != null) {
                    accessibleContext.firePropertyChange(
                            AccessibleContext.ACCESSIBLE_VISIBLE_DATA_PROPERTY,
                            propertyChangeEvent.getOldValue(), extraText);
                }
                commandButton.revalidate();
                commandButton.repaint();
            }
            if ("extraText".equals(propertyChangeEvent.getPropertyName())) {
                extraText = (String) propertyChangeEvent.getNewValue();
                AccessibleContext accessibleContext = commandButton.getAccessibleContext();
                if (accessibleContext != null) {
                    accessibleContext.firePropertyChange(
                            AccessibleContext.ACCESSIBLE_VISIBLE_DATA_PROPERTY,
                            propertyChangeEvent.getOldValue(), extraText);
                }
                commandButton.revalidate();
                commandButton.repaint();
            }
            if ("iconFactory".equals(propertyChangeEvent.getPropertyName())) {
                RadianceIcon.Factory factory = (RadianceIcon.Factory) propertyChangeEvent.getNewValue();
                icon = (factory != null) ? factory.createNewIcon() : null;
                syncIconDimension();
                commandButton.repaint();
            }
            if ("isToggleSelected".equals(propertyChangeEvent.getPropertyName())) {
                commandButton.getActionModel().setSelected((Boolean) propertyChangeEvent.getNewValue());
                if (command.getToggleGroupModel() != null) {
                    command.getToggleGroupModel().setSelected(command, (Boolean) propertyChangeEvent.getNewValue());
                }
            }
            if ("action".equals(propertyChangeEvent.getPropertyName())) {
                commandButton.removeCommandListener((CommandAction) propertyChangeEvent.getOldValue());
                commandButton.addCommandListener((CommandAction) propertyChangeEvent.getNewValue());
            }
            if ("actionPreview".equals(propertyChangeEvent.getPropertyName())) {
                syncActionPreview(command, ((Command.CommandActionPreview) propertyChangeEvent.getNewValue()));
            }
            if ("isFireActionOnPress".equals(propertyChangeEvent.getPropertyName())) {
                commandButton.getActionModel().setFireActionOnPress((Boolean) propertyChangeEvent.getNewValue());
            }
            if ("actionEnabled".equals(propertyChangeEvent.getPropertyName())) {
                boolean newValue = (Boolean) propertyChangeEvent.getNewValue();
                if (!newValue) {
                    // Clear active states, need to do this before marking the model as disabled
                    commandButton.getActionModel().setPressed(false);
                    commandButton.getActionModel().setRollover(false);
                    commandButton.getActionModel().setArmed(false);
                }
                commandButton.getActionModel().setEnabled(newValue);
                commandButton.repaint();
            }
            if ("secondaryEnabled".equals(propertyChangeEvent.getPropertyName())) {
                boolean newValue = (Boolean) propertyChangeEvent.getNewValue();
                if (!newValue) {
                    // Clear active states, need to do this before marking the model as disabled
                    commandButton.getPopupModel().setPressed(false);
                    commandButton.getPopupModel().setRollover(false);
                    commandButton.getPopupModel().setArmed(false);
                }
                commandButton.getPopupModel().setEnabled(newValue);
                commandButton.repaint();
            }
        };
        command.addPropertyChangeListener(this.commandPropertyChangeListener);

        syncActionPreview(command, command.getActionPreview());

        this.disposePopupsActionListener = commandActionEvent -> {
            boolean toDismiss = !Boolean.TRUE
                    .equals(commandButton.getClientProperty(DO_NOT_DISPOSE_POPUPS));
            if (toDismiss) {
                JCommandPopupMenuPanel menuPanel = (JCommandPopupMenuPanel) SwingUtilities
                        .getAncestorOfClass(JCommandPopupMenuPanel.class, commandButton);
                if (menuPanel != null) {
                    toDismiss = menuPanel.getProjection().getPresentationModel()
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

        this.popupActionListener = this.createPopupActionListener();
        this.commandButton.getPopupModel().addPopupActionListener(this.popupActionListener);

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
     * Creates the button listener for the specified command button.
     *
     * @return The button listener for the specified command button.
     */
    protected BasicCommandButtonListener createButtonListener() {
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

        this.commandButton.getContentModel().removePropertyChangeListener(
                this.commandPropertyChangeListener);
        this.commandPropertyChangeListener = null;

        this.commandButton.removeCommandListener(this.disposePopupsActionListener);
        this.disposePopupsActionListener = null;

        commandButton.getPopupModel().removePopupActionListener(this.popupActionListener);
        this.popupActionListener = null;

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
        RadianceCommonCortex.installDesktopHints(g2d, this.commandButton.getFont());
        super.update(g2d, c);
        g2d.dispose();
    }

    /**
     * Updates the icon dimension.
     */
    private void updateIconDimension() {
        Dimension dimension = this.commandButton.getPresentationModel().getIconDimension();
        if (dimension != null) {
            this.icon.setDimension(dimension);

            this.commandButton.invalidate();
            this.commandButton.revalidate();
            this.commandButton.doLayout();
            this.commandButton.repaint();
        }
    }

    /**
     * Updates the popup indicator icon.
     */
    protected void updatePopupIcon() {
        if (this.commandButton.getContentModel().hasSecondaryContent()) {
            this.popupIcon = this.commandButton.getPresentationModel().getPopupIcon();
        } else {
            this.popupIcon = null;
        }
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        JCommandButton button = (JCommandButton) c;
        return this.layoutManager.getPreferredSize(button.getContentModel(),
                button.getPresentationModel());
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
     * Returns indication whether the action-popup areas separator is painted.
     *
     * @return <code>true</code> if the action-popup areas separator is painted.
     */
    protected boolean isPaintingSeparators() {
        PopupButtonModel popupModel = this.commandButton.getPopupModel();
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
        PopupButtonModel popupModel = this.commandButton.getPopupModel();
        boolean isActionSelected = this.commandButton.getActionModel().isSelected();
        boolean isPopupSelected = (popupModel != null) && popupModel.isSelected();
        boolean isActionRollover = this.commandButton.getActionModel().isRollover();
        boolean isPopupRollover = (popupModel != null) && popupModel.isRollover();
        boolean isPopupShowing = (popupModel != null) && (popupModel.isPopupShowing());
        boolean isActionArmed = this.commandButton.getActionModel().isArmed();
        boolean isPopupArmed = (popupModel != null) && (popupModel.isArmed());

        return (isActionSelected || isPopupSelected || isActionRollover || isPopupRollover
                || isPopupShowing || isActionArmed || isPopupArmed ||
                (this.backgroundAppearanceStrategy != RadianceThemingSlices.BackgroundAppearanceStrategy.NEVER));
    }

    /**
     * Creates the popup action listener for this command button.
     *
     * @return Popup action listener for this command button.
     */
    protected PopupActionListener createPopupActionListener() {
        return event -> processPopupAction();
    }

    public void processPopupAction() {
        boolean wasPopupShowing = this.commandButton.getPopupModel().isPopupShowing();

        // dismiss all the popups that are currently showing
        // up until <this> button.
        PopupPanelManager.defaultManager().hidePopups(commandButton);

        if (wasPopupShowing) {
            return;
        }

        // check if the command button has an associated popup panel
        final JPopupPanel popupPanel = this.commandButton.getProjection().getPopupMenuPanelProjection().buildComponent();
        if (popupPanel != null) {
            popupPanel.applyComponentOrientation(this.commandButton.getComponentOrientation());
            SwingUtilities.invokeLater(() -> {
                if (commandButton == null) {
                    return;
                }

                if (!commandButton.isShowing()) {
                    return;
                }

                BaseCommand.SecondaryLifecycle secondaryLifecycle =
                        commandButton.getContentModel().getSecondaryLifecycle();
                if (secondaryLifecycle != null) {
                    secondaryLifecycle.onBeforeActivateSecondary(popupPanel);
                }

                popupPanel.doLayout();

                int popupX;
                int popupY;

                CommandButtonUI ui = this.commandButton.getUI();
                BaseCommandButtonPresentationModel presentationModel =
                        this.commandButton.getPresentationModel();
                Rectangle popupAnchorRectOnScreen;
                if (presentationModel.getPopupAnchorBoundsProvider() != null) {
                    popupAnchorRectOnScreen = presentationModel.getPopupAnchorBoundsProvider().
                            getPopupAnchorBoundsOnScreen();
                } else {
                    Rectangle popupClickArea = ui.getLayoutInfo().popupClickArea;
                    Point buttonLocationOnScreen = this.commandButton.getLocationOnScreen();
                    popupAnchorRectOnScreen = new Rectangle(
                            buttonLocationOnScreen.x + popupClickArea.x,
                            buttonLocationOnScreen.y + popupClickArea.y,
                            popupClickArea.width, popupClickArea.height
                    );
                }

                RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy =
                        this.commandButton.getPresentationModel().getPopupPlacementStrategy();
                Insets insets = popupPanel.getInsets();

                Dimension delta = RadianceCoreUtilities.getPlacementAwarePopupShift(
                        this.commandButton.getComponentOrientation().isLeftToRight(),
                        new Dimension(popupAnchorRectOnScreen.width, popupAnchorRectOnScreen.height),
                        popupPanel.getPreferredSize(), insets,
                        popupPlacementStrategy);

                int dx = delta.width;
                int dy = delta.height;

                popupX = popupAnchorRectOnScreen.x + dx;
                popupY = popupAnchorRectOnScreen.y + popupAnchorRectOnScreen.height + dy;

                // make sure that the popup stays in bounds
                Rectangle scrBounds = commandButton.getGraphicsConfiguration().getBounds();
                int pw = popupPanel.getPreferredSize().width;
                if ((popupX + pw) > (scrBounds.x + scrBounds.width)) {
                    popupX = scrBounds.x + scrBounds.width - pw;
                }
                int ph = popupPanel.getPreferredSize().height;
                if ((popupY + ph) > (scrBounds.y + scrBounds.height)) {
                    popupY = scrBounds.y + scrBounds.height - ph;
                }

                PopupPanelManager.defaultManager().showPopup(commandButton, popupPanel, popupX, popupY);
            });
        }
    }

    private void syncIconDimension() {
        if (this.icon == null) {
            return;
        }

        CommandButtonPresentationState commandButtonState =
                this.commandButton.getPresentationState();

        this.layoutManager = commandButtonState.createLayoutManager();

        Dimension preferredIconSize = layoutManager.getPreferredIconSize(
                this.commandButton.getContentModel(),
                this.commandButton.getPresentationModel());
        int iconWidth = (preferredIconSize != null) ? preferredIconSize.width : this.icon.getIconWidth();
        int iconHeight = (preferredIconSize != null) ? preferredIconSize.height : this.icon.getIconHeight();

        if ((this.icon.getIconWidth() == iconWidth) && (this.icon.getIconHeight() == iconHeight)) {
            return;
        }

        Dimension newDim = new Dimension(iconWidth, iconHeight);
        this.icon.setDimension(newDim);
    }

    private void syncActionPreview(BaseCommand<?> command, Command.CommandActionPreview actionPreview) {
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
        boolean hasAction = (this.commandButton.getContentModel().getAction() != null);
        boolean hasSecondary = this.commandButton.getContentModel().hasSecondaryContent();

        if (!hasSecondary) {
            this.isInnerFocusOnAction = true;
        } else if (!hasAction) {
            this.isInnerFocusOnAction = false;
        } else {
            this.isInnerFocusOnAction = this.commandButton.getActionModel().isEnabled();
        }
    }

    private void toggleInnerFocus() {
        boolean hasAction = (this.commandButton.getContentModel().getAction() != null);
        boolean hasSecondary = this.commandButton.getContentModel().hasSecondaryContent();

        if (!hasAction || !hasSecondary) {
            // Only one area
            return;
        }

        if (!this.commandButton.getActionModel().isEnabled() || !this.commandButton.getPopupModel().isEnabled()) {
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
