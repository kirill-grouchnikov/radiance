/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.ui.ribbon;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.component.api.common.CommandActionEvent;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.popup.JPopupPanel;
import org.pushingpixels.radiance.component.api.ribbon.JRibbon;
import org.pushingpixels.radiance.component.api.ribbon.JRibbonFrame;
import org.pushingpixels.radiance.component.internal.theming.ribbon.ui.RadianceRibbonFrameTitlePane;
import org.pushingpixels.radiance.component.internal.theming.ribbon.ui.RadianceRibbonRootPaneUI;
import org.pushingpixels.radiance.component.internal.utils.KeyTipManager;
import org.pushingpixels.radiance.component.internal.utils.KeyTipRenderingUtilities;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.*;
import java.util.Collection;
import java.util.Set;

/**
 * Root pane for the {@link JRibbonFrame}. This class is for internal use only and should not be
 * directly used by the applications.
 *
 * @author Kirill Grouchnikov
 */
public class JRibbonRootPane extends JRootPane {
    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "RibbonRootPaneUI";

    private JComponent keyTipLayer;

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
                RadianceCommonCortex.installDesktopHints(g2d, getFont());

                for (KeyTipManager.KeyTipLink keyTip : keyTips) {
                    // Components in generic popup panels do not display keytips as that interferes
                    // with the popup layer in the root pane. However, there is a special treatment
                    // for the taskbar overflow popup where the height is limited and we push the
                    // key tips to be displayed below the popup.
                    boolean isInPopup = (SwingUtilities.getAncestorOfClass(
                        JPopupPanel.class, keyTip.comp) != null);
                    if (isInPopup && (SwingUtilities.getAncestorOfClass(
                        RadianceRibbonFrameTitlePane.TaskbarOverflowPopupPanel.class,
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
                            RadianceRibbonFrameTitlePane.TaskbarOverflowPopupPanel.class,
                            keyTip.comp);
                    if (taskbarOverflowPanel != null) {
                        // special case for controls in taskbar overflow - push them down
                        loc = SwingUtilities.convertPoint(keyTip.comp, prefCenter,
                            taskbarOverflowPanel);
                        loc.y = pref.height / 2 + taskbarOverflowPanel.getHeight();
                        loc = SwingUtilities.convertPoint(taskbarOverflowPanel, loc, this);
                    }

                    Container titlePane = SwingUtilities
                        .getAncestorOfClass(RadianceRibbonFrameTitlePane.class,
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

    public JRibbonRootPane() {
        updateUI();

        this.keyTipLayer = new JRibbonRootPane.KeyTipLayer();

        // Explicitly configure the foreground color on the ribbon root pane. This is needed so that
        // the rendering of key tips and other elements is done with correct color tokens (not
        // blended with the default system colors set on the ribbon root pane).
        RadianceSkin skin = RadianceCoreUtilities.getSkin(this);
        ContainerColorTokens colorTokens = skin.getNeutralContainerTokens(
            RadianceThemingSlices.DecorationAreaType.NONE);
        this.keyTipLayer.setForeground(new ColorUIResource(colorTokens.getOnContainer()));

        KeyboardFocusManager.getCurrentKeyboardFocusManager().
                setDefaultFocusTraversalPolicy(new LayoutFocusTraversalPolicy());

        resetMaps();
    }

    @Override
    public void updateUI() {
        setUI(RadianceRibbonRootPaneUI.createUI(this));
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    private void resetMaps() {
        ActionMap actionMap = this.getActionMap();
        actionMap.clear();
        actionMap.put("toggleMinimized", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRibbonFrame ribbonFrame = (JRibbonFrame) SwingUtilities
                        .getWindowAncestor(JRibbonRootPane.this);
                JRibbon ribbon = ribbonFrame.getRibbon();
                ribbon.setMinimized(!ribbon.isMinimized());
            }
        });

        InputMap inputMap = this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.clear();
        KeyStroke keyStroke = (RadianceCommonCortex.getPlatform() == RadianceCommonCortex.Platform.MACOS)
                ? KeyStroke.getKeyStroke("meta alt R")
                : KeyStroke.getKeyStroke("ctrl F1");
        inputMap.put(keyStroke, "toggleMinimized");
    }

    public void setKeyboardActions(Set<JRibbonFrame.RibbonKeyboardAction> actions) {
        this.resetMaps();

        ActionMap actionMap = this.getActionMap();
        InputMap inputMap = this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        for (JRibbonFrame.RibbonKeyboardAction action : actions) {
            actionMap.put(action.getActionName(), new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Command command = action.getCommand();
                    if (command.isActionEnabled()) {
                        command.getAction().commandActivated(
                                new CommandActionEvent(
                                        JRibbonRootPane.this,
                                        ActionEvent.ACTION_PERFORMED,
                                        command,
                                        e.getActionCommand(),
                                        e.getWhen(),
                                        e.getModifiers()
                                ));
                    }
                }
            });
            inputMap.put(action.getActionKeyStroke(), action.getActionName());
        }
    }

    public JComponent getKeyTipLayer() {
        return keyTipLayer;
    }
}
