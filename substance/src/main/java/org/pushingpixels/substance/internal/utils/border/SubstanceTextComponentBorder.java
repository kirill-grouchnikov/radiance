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
package org.pushingpixels.substance.internal.utils.border;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Map;

/**
 * Text component border for the <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceTextComponentBorder implements Border, UIResource {
    /**
     * Insets of <code>this</code> border.
     */
    protected Insets myInsets;

    /**
     * Cache of small border images.
     */
    private static LazyResettableHashMap<BufferedImage> smallImageCache = new LazyResettableHashMap<>(
            "SubstanceTextComponentBorder");

    /**
     * Creates a new border with the specified insets.
     * 
     * @param insets
     *            Insets.
     */
    public SubstanceTextComponentBorder(Insets insets) {
        this.myInsets = new Insets(insets.top, insets.left, insets.bottom, insets.right);
    }

    /**
     * Paints border instance for the specified component.
     * 
     * @param c
     *            The component.
     * @param g
     *            Graphics context.
     * @param x
     *            Component left X (in graphics context).
     * @param y
     *            Component top Y (in graphics context).
     * @param width
     *            Component width.
     * @param height
     *            Component height.
     * @param isEnabled
     *            Component enabled status.
     */
    private void paintBorderImpl(JComponent c, Graphics g, int x, int y, int width, int height, boolean isEnabled) {
        // failsafe for LAF change
        if (!SubstanceCoreUtilities.isCurrentLookAndFeel()) {
            return;
        }

        if ((width <= 0) || (height <= 0))
            return;

        Graphics2D graphics = (Graphics2D) g.create();
        JTextComponent componentForTransitions = SubstanceCoreUtilities
                .getTextComponentForTransitions(c);
        boolean useCache = (width * height < 100000);
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities.getBorderPainter(c);
        if (componentForTransitions != null) {
            ComponentUI ui = componentForTransitions.getUI();
            if (ui instanceof TransitionAwareUI) {
                TransitionAwareUI trackable = (TransitionAwareUI) ui;
                StateTransitionTracker stateTransitionTracker = trackable.getTransitionTracker();
                StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                        .getModelStateInfo();
                Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                        .getStateContributionMap();
                ComponentState currState = modelStateInfo.getCurrModelState();
                if (currState.isDisabled()) {
                    currState = ComponentState.DISABLED_SELECTED;
                }

                graphics.translate(x, y);

                SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(componentForTransitions, ColorSchemeAssociationKind.BORDER,
                                currState);
                float baseAlpha = SubstanceColorSchemeUtilities.getAlpha(c, currState);
                graphics.setComposite(AlphaComposite.SrcOver.derive(baseAlpha));
                if (useCache) {
                    HashMapKey baseHashKey = SubstanceCoreUtilities.getHashKey(
                            borderPainter.getDisplayName(), width, height,
                            baseBorderScheme.getDisplayName());
                    BufferedImage baseLayer = smallImageCache.get(baseHashKey);
                    if (baseLayer == null) {
                        baseLayer = SubstanceCoreUtilities.getBlankImage(width, height);
                        Graphics2D g2base = baseLayer.createGraphics();
                        SubstanceImageCreator.paintSimpleBorder(c, g2base, width, height,
                                baseBorderScheme);
                        g2base.dispose();
                        smallImageCache.put(baseHashKey, baseLayer);
                    }
                    NeonCortex.drawImage(graphics, baseLayer, 0, 0);
                } else {
                    SubstanceImageCreator.paintSimpleBorder(c, graphics, width, height,
                            baseBorderScheme);
                }

                if (!currState.isDisabled() && (activeStates.size() > 1)) {
                    for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                            .entrySet()) {
                        ComponentState activeState = activeEntry.getKey();
                        if (activeState == currState) {
                            continue;
                        }

                        float contribution = activeEntry.getValue().getContribution();
                        if (contribution == 0.0f) {
                            continue;
                        }

                        float alpha = SubstanceColorSchemeUtilities.getAlpha(c, activeState);
                        if (alpha == 0.0f) {
                            continue;
                        }

                        SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
                                .getColorScheme(componentForTransitions,
                                        ColorSchemeAssociationKind.BORDER, activeState);
                        graphics.setComposite(AlphaComposite.SrcOver.derive(alpha * contribution));

                        if (useCache) {
                            HashMapKey extraHashKey = SubstanceCoreUtilities.getHashKey(
                                    borderPainter.getDisplayName(), width, height,
                                    borderScheme.getDisplayName());
                            BufferedImage extraLayer = smallImageCache.get(extraHashKey);
                            if (extraLayer == null) {
                                extraLayer = SubstanceCoreUtilities.getBlankImage(width, height);
                                Graphics2D g2extra = extraLayer.createGraphics();
                                SubstanceImageCreator.paintSimpleBorder(c, g2extra, width, height,
                                        baseBorderScheme);
                                g2extra.dispose();
                                smallImageCache.put(extraHashKey, extraLayer);
                            }

                            NeonCortex.drawImage(graphics, extraLayer, 0, 0);
                        } else {
                            SubstanceImageCreator.paintSimpleBorder(c, graphics, width, height,
                                    borderScheme);
                        }
                    }
                }
                return;
            }
        }

        ComponentState currState = isEnabled ? ComponentState.ENABLED
                : ComponentState.DISABLED_UNSELECTED;
        SubstanceColorScheme borderColorScheme = SubstanceColorSchemeUtilities.getColorScheme(c,
                ColorSchemeAssociationKind.BORDER, currState);
        graphics.translate(x, y);

        if (useCache) {
            HashMapKey baseHashKey = SubstanceCoreUtilities.getHashKey(
                    borderPainter.getDisplayName(), width, height,
                    borderColorScheme.getDisplayName());
            BufferedImage baseLayer = smallImageCache.get(baseHashKey);
            if (baseLayer == null) {
                baseLayer = SubstanceCoreUtilities.getBlankImage(width, height);
                Graphics2D g2base = baseLayer.createGraphics();
                SubstanceImageCreator.paintSimpleBorder(c, g2base, width, height,
                        borderColorScheme);
                g2base.dispose();
                smallImageCache.put(baseHashKey, baseLayer);
            }

            NeonCortex.drawImage(graphics, baseLayer, 0, 0);
        } else {
            SubstanceImageCreator.paintSimpleBorder(c, graphics, width, height, borderColorScheme);
        }

        graphics.dispose();
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        paintBorderImpl((JComponent) c, g, x, y, width, height, c.isEnabled());
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return this.myInsets;
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
