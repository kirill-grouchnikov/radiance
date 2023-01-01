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
package org.pushingpixels.radiance.component.api.common;

import org.pushingpixels.radiance.component.api.common.model.RichTooltipPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.JPopupPanel;
import org.pushingpixels.radiance.component.api.common.popup.PopupPanelManager;
import org.pushingpixels.radiance.component.api.ribbon.AbstractRibbonBand;
import org.pushingpixels.radiance.component.internal.ui.common.JRichTooltipPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.List;

public class RichTooltipManager {
    private Timer initialDelayTimer;

    private Timer dismissTimer;

    private RichTooltip richTooltip;

    private WithRichTooltip currentActiveTrackable;

    private MouseEvent lastMouseEvent;

    private MouseEvent lastMouseEventInCurrentActiveTrackableCoordinates;

    private final static RichTooltipManager sharedInstance = new RichTooltipManager();

    private Popup tipWindow;

    private JRichTooltipPanel tip;

    private boolean tipShowing = false;

    public interface WithRichTooltip {
        RichTooltip getRichTooltip(MouseEvent mouseEvent);
        RichTooltipPresentationModel getRichTooltipPresentationModel(MouseEvent mouseEvent);
    }

    private RichTooltipManager() {
        initialDelayTimer = new Timer(750, new InitialDelayTimerAction());
        initialDelayTimer.setRepeats(false);
        dismissTimer = new Timer(20000, new DismissTimerAction());
        dismissTimer.setRepeats(false);

        Toolkit.getDefaultToolkit().addAWTEventListener((AWTEvent event) -> {
            MouseEvent mouseEvent = (MouseEvent) event;
            switch (mouseEvent.getID()) {
                case MouseEvent.MOUSE_PRESSED:
                    hideTipWindow();
                    initialDelayTimer.stop();
                    currentActiveTrackable = null;
                    lastMouseEvent = null;
                    lastMouseEventInCurrentActiveTrackableCoordinates = null;
                    break;
                case MouseEvent.MOUSE_MOVED:
                    int x = mouseEvent.getX();
                    int y = mouseEvent.getY();
                    Component source = (Component) event.getSource();
                    Component deepest = SwingUtilities.getDeepestComponentAt(source, x, y);
                    WithRichTooltip trackableComponent =
                            (deepest instanceof WithRichTooltip) ?
                                    (WithRichTooltip) deepest :
                                    (WithRichTooltip) SwingUtilities.getAncestorOfClass(
                                            WithRichTooltip.class, deepest);
                    if (trackableComponent != null) {
                        Point inTrackableComponent = SwingUtilities.convertPoint(
                                source, x, y, (JComponent) trackableComponent);
                        if (((JComponent) trackableComponent).contains(inTrackableComponent)) {
                            // The mouse event is currently inside a trackable component
                            if (currentActiveTrackable == trackableComponent) {
                                // Still in the same trackable component
                                if (tipShowing) {
                                    checkForTipChange(mouseEvent, trackableComponent);
                                } else {
                                    // Lazily lookup the values from within insideTimerAction
                                    currentActiveTrackable = trackableComponent;
                                    lastMouseEvent = mouseEvent;
                                    lastMouseEventInCurrentActiveTrackableCoordinates =
                                            retarget(mouseEvent, source, ((JComponent) trackableComponent));
                                    richTooltip = null;
                                    initialDelayTimer.restart();
                                }
                            } else {
                                // In a new trackable component
                                initiateToolTip(mouseEvent, trackableComponent);
                            }
                        } else {
                            // Not inside a trackable component
                            if (currentActiveTrackable != null) {
                                // Moved outside of a trackable component
                                windDownTooltip();
                            }
                        }
                    } else {
                        if (currentActiveTrackable != null) {
                            // Moved outside of a trackable component
                            windDownTooltip();
                        }
                    }
            }
        }, AWTEvent.MOUSE_EVENT_MASK | AWTEvent.MOUSE_MOTION_EVENT_MASK);
    }

    /**
     * Specifies the initial delay value.
     *
     * @param milliseconds the number of milliseconds to delay (after the cursor has
     *                     paused) before displaying the tooltip
     * @see #getInitialDelay()
     */
    public void setInitialDelay(int milliseconds) {
        initialDelayTimer.setInitialDelay(milliseconds);
    }

    /**
     * Returns the initial delay value.
     *
     * @return an integer representing the initial delay value, in milliseconds
     * @see #setInitialDelay(int)
     */
    public int getInitialDelay() {
        return initialDelayTimer.getInitialDelay();
    }

    /**
     * Specifies the dismissal delay value.
     *
     * @param milliseconds the number of milliseconds to delay before taking away the
     *                     tooltip
     * @see #getDismissDelay()
     */
    public void setDismissDelay(int milliseconds) {
        dismissTimer.setInitialDelay(milliseconds);
    }

    /**
     * Returns the dismissal delay value.
     *
     * @return an integer representing the dismissal delay value, in
     * milliseconds
     * @see #setDismissDelay(int)
     */
    public int getDismissDelay() {
        return dismissTimer.getInitialDelay();
    }

    private MouseEvent retarget(MouseEvent original, Component source, Component target) {
        Point inTarget = SwingUtilities.convertPoint(
                source, original.getX(), original.getY(), target);
        return new MouseEvent(target, original.getID(), original.getWhen(),
                original.getModifiersEx(), inTarget.x, inTarget.y, original.getClickCount(),
                original.isPopupTrigger(), original.getButton());
    }

    private void showTipWindow(MouseEvent mouseEvent) {
        if (currentActiveTrackable == null) {
            return;
        }

        JComponent currentActiveTrackableComponent = (JComponent) currentActiveTrackable;

        if (currentActiveTrackable == null || !currentActiveTrackableComponent.isShowing()) {
            return;
        }
        Dimension size;
        Point screenLocation = currentActiveTrackableComponent.getLocationOnScreen();
        Point location = new Point();
        GraphicsConfiguration gc;
        gc = currentActiveTrackableComponent.getGraphicsConfiguration();
        Rectangle sBounds = gc.getBounds();
        Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(gc);
        // Take into account screen insets, decrease viewport
        sBounds.x += screenInsets.left;
        sBounds.y += screenInsets.top;
        sBounds.width -= (screenInsets.left + screenInsets.right);
        sBounds.height -= (screenInsets.top + screenInsets.bottom);

        // Just to be paranoid
        hideTipWindow();

        tip = new JRichTooltipPanel(currentActiveTrackable.getRichTooltip(mouseEvent),
                currentActiveTrackable.getRichTooltipPresentationModel(mouseEvent));
        tip.applyComponentOrientation(currentActiveTrackableComponent.getComponentOrientation());
        size = tip.getPreferredSize();

        AbstractRibbonBand ribbonBand = (AbstractRibbonBand) SwingUtilities
                .getAncestorOfClass(AbstractRibbonBand.class, currentActiveTrackableComponent);
        boolean ltr = tip.getComponentOrientation().isLeftToRight();
        boolean isInRibbonBand = (ribbonBand != null);
        if (isInRibbonBand) {
            // display directly below or above ribbon band
            location.x = ltr ? screenLocation.x : screenLocation.x
                    + currentActiveTrackableComponent.getWidth() - size.width;
            Point bandLocationOnScreen = ribbonBand.getLocationOnScreen();
            location.y = bandLocationOnScreen.y + ribbonBand.getHeight() + 4;
            if ((location.y + size.height) > (sBounds.y + sBounds.height)) {
                location.y = bandLocationOnScreen.y - size.height;
            }
        } else {
            // display directly below or above it
            location.x = ltr ? screenLocation.x : screenLocation.x
                    + currentActiveTrackableComponent.getWidth() - size.width;
            location.y = screenLocation.y + currentActiveTrackableComponent.getHeight();
            if ((location.y + size.height) > (sBounds.y + sBounds.height)) {
                location.y = screenLocation.y - size.height;
            }
        }

        // Tweak the X location to not overflow the screen
        if (location.x < sBounds.x) {
            location.x = sBounds.x;
        } else if (location.x - sBounds.x + size.width > sBounds.width) {
            location.x = sBounds.x + Math.max(0, sBounds.width - size.width);
        }

        PopupFactory popupFactory = PopupFactory.getSharedInstance();
        tipWindow = popupFactory.getPopup(currentActiveTrackableComponent, tip, location.x, location.y);
        tipWindow.show();

        dismissTimer.start();
        tipShowing = true;
    }

    private void windDownTooltip() {
        initialDelayTimer.stop();
        currentActiveTrackable = null;
        richTooltip = null;
        lastMouseEvent = null;
        lastMouseEventInCurrentActiveTrackableCoordinates = null;
        hideTipWindow();
    }

    private void hideTipWindow() {
        if (tipWindow != null) {
            tipWindow.hide();
            tipWindow = null;
            tipShowing = false;
            tip = null;
            dismissTimer.stop();
        }
    }

    /**
     * Returns a shared <code>RichTooltipManager</code> instance.
     *
     * @return a shared <code>RichTooltipManager</code> object
     */
    public static RichTooltipManager sharedInstance() {
        return sharedInstance;
    }

    public void hideCurrentlyShowingTipIfNecessary() {
        this.hideTipWindow();
    }

    private void initiateToolTip(MouseEvent original, WithRichTooltip component) {
        // do not show tooltips on components in popup panels that are not in the last shown one
        List<PopupPanelManager.PopupInfo> popups =
                PopupPanelManager.defaultManager().getShownPath();
        if (popups.size() > 0) {
            JPopupPanel popupPanel = popups.get(popups.size() - 1).getPopupPanel();
            boolean ignore = true;
            Component c = (Component) component;
            while (c != null) {
                if (c == popupPanel) {
                    ignore = false;
                    break;
                }
                c = c.getParent();
            }
            if (ignore) {
                return;
            }
        }

        if (currentActiveTrackable != null) {
            initialDelayTimer.stop();
        }

        currentActiveTrackable = component;
        lastMouseEvent = original;
        lastMouseEventInCurrentActiveTrackableCoordinates =
                retarget(original, lastMouseEvent.getComponent(), (Component) component);
        initialDelayTimer.start();
    }

    private void checkForTipChange(MouseEvent event, WithRichTooltip component) {
        RichTooltip newTooltip = component.getRichTooltip(event);

        // is it different?
        boolean isDifferent = (richTooltip != newTooltip);
        if (isDifferent) {
            hideTipWindow();
            if (newTooltip != null) {
                richTooltip = newTooltip;
                initialDelayTimer.restart();
            }
        }
    }

    private class InitialDelayTimerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if ((currentActiveTrackable != null) && ((JComponent) currentActiveTrackable).isShowing()) {
                // Lazy lookup
                if (richTooltip == null && lastMouseEvent != null) {
                    richTooltip = currentActiveTrackable.getRichTooltip(
                            lastMouseEventInCurrentActiveTrackableCoordinates);
                }
                if (richTooltip != null) {
                    boolean showRichTooltip = true;
                    // check that no visible popup is originating in this
                    // component
                    for (PopupPanelManager.PopupInfo pi : PopupPanelManager
                            .defaultManager().getShownPath()) {
                        if (pi.getPopupOriginator() == currentActiveTrackable) {
                            showRichTooltip = false;
                            break;
                        }
                    }

                    if (showRichTooltip) {
                        showTipWindow(lastMouseEventInCurrentActiveTrackableCoordinates);
                    }
                } else {
                    currentActiveTrackable = null;
                    richTooltip = null;
                    lastMouseEvent = null;
                    lastMouseEventInCurrentActiveTrackableCoordinates = null;
                    hideTipWindow();
                }
            }
        }
    }

    private class DismissTimerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hideTipWindow();
            initialDelayTimer.stop();
            currentActiveTrackable = null;
            lastMouseEvent = null;
            lastMouseEventInCurrentActiveTrackableCoordinates = null;
        }
    }
}
