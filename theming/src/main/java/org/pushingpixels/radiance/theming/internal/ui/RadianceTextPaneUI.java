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

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingWidget;
import org.pushingpixels.radiance.theming.internal.RadianceThemingWidgetRepository;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceTextUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RolloverTextControlListener;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicTextPaneUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.util.Set;

/**
 * UI for text panes in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceTextPaneUI extends BasicTextPaneUI implements TransitionAwareUI {
    private StateTransitionTracker stateTransitionTracker;

    /**
     * The associated text pane.
     */
    private JTextPane textPane;

    /**
     * Property change listener.
     */
    private PropertyChangeListener radiancePropertyChangeListener;

    /**
     * Listener for transition animations.
     */
    private RolloverTextControlListener radianceRolloverListener;

    /**
     * Surrogate button model for tracking the state transitions.
     */
    private ButtonModel transitionModel;

    private Set<RadianceThemingWidget<JComponent>> themingWidgets;

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceTextPaneUI(comp);
    }

    /**
     * Simple constructor.
     *
     * @param c Component (text pane).
     */
    protected RadianceTextPaneUI(JComponent c) {
        super();
        this.textPane = (JTextPane) c;

        this.transitionModel = new DefaultButtonModel();
        this.transitionModel.setArmed(false);
        this.transitionModel.setSelected(false);
        this.transitionModel.setPressed(false);
        this.transitionModel.setRollover(false);
        this.transitionModel.setEnabled(this.textPane.isEnabled());

        this.stateTransitionTracker = new StateTransitionTracker(this.textPane,
                this.transitionModel);
    }

    @Override
    public void installUI(JComponent c) {
        this.themingWidgets = RadianceThemingWidgetRepository.getRepository().getMatchingWidgets(c);

        super.installUI(c);

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installUI();
        }
    }

    @Override
    public void uninstallUI(JComponent c) {
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallUI();
        }
        super.uninstallUI(c);
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        this.radianceRolloverListener = new RolloverTextControlListener(this.textPane, this,
                this.transitionModel);
        this.radianceRolloverListener.registerListeners();

        this.stateTransitionTracker.registerModelListeners();
        this.stateTransitionTracker.registerFocusListeners();

        this.radiancePropertyChangeListener = propertyChangeEvent -> {
            if ("font".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(() -> {
                    // remember the caret location - issue 404
                    int caretPos = textPane.getCaretPosition();
                    textPane.updateUI();
                    textPane.setCaretPosition(caretPos);
                    Container parent = textPane.getParent();
                    if (parent != null) {
                        parent.invalidate();
                        parent.validate();
                    }
                });
            }

            if ("enabled".equals(propertyChangeEvent.getPropertyName())) {
                transitionModel.setEnabled(textPane.isEnabled());
            }
        };
        this.textPane.addPropertyChangeListener(this.radiancePropertyChangeListener);
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installListeners();
        }
    }

    @Override
    protected void uninstallListeners() {
        this.stateTransitionTracker.unregisterModelListeners();
        this.stateTransitionTracker.unregisterFocusListeners();

        this.textPane.removePropertyChangeListener(this.radiancePropertyChangeListener);
        this.radiancePropertyChangeListener = null;

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallListeners();
        }

        super.uninstallListeners();
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();

        // support for per-window skins
        SwingUtilities.invokeLater(() -> {
            if (textPane == null)
                return;
            Color foregr = textPane.getForeground();
            if ((foregr == null) || (foregr instanceof UIResource)) {
                textPane.setForeground(RadianceColorUtilities
                        .getForegroundColor(RadianceThemingCortex.ComponentScope.getCurrentSkin(textPane)
                                .getEnabledColorScheme(RadianceThemingCortex.ComponentOrParentChainScope
                                        .getDecorationType(textPane))));
            }
        });
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installDefaults();
        }
    }

    @Override
    protected void uninstallDefaults() {
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallDefaults();
        }

        super.uninstallDefaults();
    }

    @Override
    protected void paintBackground(Graphics g) {
        RadianceTextUtilities.paintTextCompBackground(g, this.textPane);
    }

    @Override
    public boolean isInside(MouseEvent me) {
        return true;
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.stateTransitionTracker;
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        super.update(g2d, c);
        g2d.dispose();
    }
}
