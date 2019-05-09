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
package org.pushingpixels.substance.internal.utils.icon;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.*;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.animation.*;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Map;

/**
 * Icon with transition-aware capabilities. Has a delegate that does the actual painting based on
 * the transition color schemes. This class is used heavily on Substance-provided icons, such as
 * title pane button icons, arrow icons on scroll bars and combos etc.
 * 
 * @author Kirill Grouchnikov
 */
@TransitionAware
public class TransitionAwareIcon implements Icon {
    /**
     * The delegate needs to implement the method in this interface based on the provided color
     * scheme. The color scheme is computed based on the transitions that are happening on the
     * associated button.
     * 
     * @author Kirill Grouchnikov
     */
    public interface Delegate {
        /**
         * Returns the icon that matches the specified scheme.
         * 
         * @param scheme
         *            Color scheme.
         * @return Icon that matches the specified scheme.
         */
        ResizableIcon getColorSchemeIcon(SubstanceColorScheme scheme);
    }

    public interface ColorSchemeAssociationKindDelegate {
        ColorSchemeAssociationKind getColorSchemeAssociationKind(ComponentState state);
    }

    public interface TransitionAwareUIDelegate {
        TransitionAwareUI getTransitionAwareUI();
    }

    /**
     * The associated component.
     */
    private JComponent comp;

    /**
     * The associated model.
     */
    // private ButtonModel model;

    private TransitionAwareUIDelegate transitionAwareUIDelegate;

    /**
     * Delegate to compute the actual icons.
     */
    protected Delegate delegate;

    protected ColorSchemeAssociationKindDelegate colorSchemeAssociationKindDelegate;

    protected String uniqueIconTypeId;

    /**
     * Icon cache to speed up the subsequent icon painting. The basic assumption is that the
     * {@link #delegate} returns an icon that paints the same for the same parameters.
     */
    private static LazyResettableHashMap<ResizableIcon> iconMap = new LazyResettableHashMap<>(
            "TransitionAwareIcon");

    private int iconWidth;

    private int iconHeight;

    public TransitionAwareIcon(final AbstractButton button, Delegate delegate,
            String uniqueIconTypeId) {
        this(button, (button == null) ? null : () -> (TransitionAwareUI) button.getUI(), delegate,
                null, uniqueIconTypeId);
    }

    /**
     * Creates a new transition-aware icon.
     */
    public TransitionAwareIcon(JComponent comp, TransitionAwareUIDelegate transitionAwareUIDelegate,
            Delegate delegate,
            ColorSchemeAssociationKindDelegate colorSchemeAssociationKindDelegate,
            String uniqueIconTypeId) {
        this.comp = comp;
        this.transitionAwareUIDelegate = transitionAwareUIDelegate;
        this.delegate = delegate;
        this.colorSchemeAssociationKindDelegate = colorSchemeAssociationKindDelegate;
        this.uniqueIconTypeId = uniqueIconTypeId;

        ResizableIcon markEnabledIcon = this.delegate
                .getColorSchemeIcon(SubstanceColorSchemeUtilities.getColorScheme(comp,
                        ColorSchemeAssociationKind.MARK, ComponentState.ENABLED));
        this.iconWidth = markEnabledIcon.getIconWidth();
        this.iconHeight = markEnabledIcon.getIconHeight();
    }

    /**
     * Returns the current icon to paint.
     * 
     * @return Icon to paint.
     */
    private synchronized ResizableIcon getIconToPaint() {
        StateTransitionTracker stateTransitionTracker = this.transitionAwareUIDelegate
                .getTransitionAwareUI().getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();

        ComponentState currState = modelStateInfo.getCurrModelState();
        boolean buttonNeverPainted = SubstanceCoreUtilities.isButtonNeverPainted(this.comp);
        if (buttonNeverPainted) {
            if (currState.isFacetActive(ComponentStateFacet.ENABLE))
                currState = ComponentState.ENABLED;
        }

        ColorSchemeAssociationKind baseAssociationKind = (this.colorSchemeAssociationKindDelegate == null)
                ? ColorSchemeAssociationKind.MARK
                : this.colorSchemeAssociationKindDelegate.getColorSchemeAssociationKind(currState);
        SubstanceColorScheme baseScheme = SubstanceColorSchemeUtilities.getColorScheme(this.comp,
                baseAssociationKind, currState);
        float baseAlpha = SubstanceColorSchemeUtilities.getAlpha(this.comp, currState);

        HashMapKey keyBase = SubstanceCoreUtilities.getHashKey(this.uniqueIconTypeId,
                SubstanceSizeUtils.getComponentFontSize(this.comp), baseScheme.getDisplayName(),
                baseAlpha);
        ResizableIcon layerBase = iconMap.get(keyBase);
        if (layerBase == null) {
            ResizableIcon baseFullOpacity = this.delegate.getColorSchemeIcon(baseScheme);
            if (baseAlpha == 1.0f) {
                layerBase = baseFullOpacity;
                iconMap.put(keyBase, layerBase);
            } else {
                BufferedImage baseImage = SubstanceCoreUtilities.getBlankImage(
                        baseFullOpacity.getIconWidth(), baseFullOpacity.getIconHeight());
                Graphics2D g2base = baseImage.createGraphics();
                g2base.setComposite(AlphaComposite.SrcOver.derive(baseAlpha));
                baseFullOpacity.paintIcon(this.comp, g2base, 0, 0);
                g2base.dispose();
                layerBase = new ImageWrapperIcon(baseImage);
                iconMap.put(keyBase, layerBase);
            }
        }
        if (currState.isDisabled() || (activeStates.size() == 1) || buttonNeverPainted) {
            return layerBase;
        }

        BufferedImage result = SubstanceCoreUtilities.getBlankImage(layerBase.getIconWidth(),
                layerBase.getIconHeight());
        Graphics2D g2d = result.createGraphics();
        // draw the base layer
        layerBase.paintIcon(this.comp, g2d, 0, 0);

        // draw the other active layers
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                .entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            // System.out.println("Painting state " + activeState + "[curr is "
            // + currState + "] with " + activeEntry.getValue());
            if (activeState == currState)
                continue;

            float stateContribution = activeEntry.getValue().getContribution();
            if (stateContribution > 0.0f) {
                g2d.setComposite(AlphaComposite.SrcOver.derive(stateContribution));

                ColorSchemeAssociationKind associationKind = (this.colorSchemeAssociationKindDelegate == null)
                        ? ColorSchemeAssociationKind.MARK
                        : this.colorSchemeAssociationKindDelegate
                                .getColorSchemeAssociationKind(activeState);
                SubstanceColorScheme scheme = SubstanceColorSchemeUtilities
                        .getColorScheme(this.comp, associationKind, activeState);
                float alpha = SubstanceColorSchemeUtilities.getAlpha(this.comp, activeState);

                HashMapKey key = SubstanceCoreUtilities.getHashKey(this.uniqueIconTypeId,
                        SubstanceSizeUtils.getComponentFontSize(this.comp), scheme.getDisplayName(),
                        alpha);
                ResizableIcon layer = iconMap.get(key);
                if (layer == null) {
                    ResizableIcon fullOpacity = this.delegate.getColorSchemeIcon(scheme);
                    if (alpha == 1.0f) {
                        layer = fullOpacity;
                        iconMap.put(key, layer);
                    } else {
                        BufferedImage image = SubstanceCoreUtilities.getBlankImage(
                                fullOpacity.getIconWidth(), fullOpacity.getIconHeight());
                        Graphics2D g2layer = image.createGraphics();
                        g2layer.setComposite(AlphaComposite.SrcOver.derive(alpha));
                        fullOpacity.paintIcon(this.comp, g2layer, 0, 0);
                        g2layer.dispose();
                        layer = new ImageWrapperIcon(image);
                        iconMap.put(key, layer);
                    }
                }
                layer.paintIcon(this.comp, g2d, 0, 0);
            }
        }
        g2d.dispose();
        return new ImageWrapperIcon(result);
    }

    @Override
    public int getIconHeight() {
        return this.iconHeight;
    }

    @Override
    public int getIconWidth() {
        return this.iconWidth;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        this.getIconToPaint().paintIcon(c, g, x, y);
    }
}
