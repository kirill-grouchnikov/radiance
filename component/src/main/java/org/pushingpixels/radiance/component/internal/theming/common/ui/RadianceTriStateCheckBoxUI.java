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
package org.pushingpixels.radiance.component.internal.theming.common.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.component.api.common.JTriStateCheckBox;
import org.pushingpixels.radiance.component.internal.ui.common.BasicTriStateCheckBoxUI;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeIconUtils;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceTextUtilities;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicHTML;
import javax.swing.text.View;
import java.awt.*;

/**
 * UI for {@link JTriStateCheckBox} components in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceTriStateCheckBoxUI extends BasicTriStateCheckBoxUI {
    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceTriStateCheckBoxUI((JTriStateCheckBox) comp);
    }

    private BladeColorScheme mutableFillColorScheme = new BladeColorScheme();
    private BladeColorScheme mutableBorderColorScheme = new BladeColorScheme();
    private BladeColorScheme mutableMarkColorScheme = new BladeColorScheme();

    private RadianceTriStateCheckBoxUI(JTriStateCheckBox triStateCheckBox) {
        super(triStateCheckBox);
    }

    @Override
    protected void updateIcon() {
        int fontSize = RadianceSizeUtils.getComponentFontSize(this.triStateCheckBox);
        int checkMarkSize = RadianceSizeUtils.getCheckBoxMarkSize(fontSize);
        this.radianceIcon = new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                StateTransitionTracker.ModelStateInfo modelStateInfo =
                        stateTransitionTracker.getModelStateInfo();

                RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(triStateCheckBox);
                RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(triStateCheckBox);
                ComponentState currState = modelStateInfo.getCurrModelState();

                float visibility = stateTransitionTracker.getFacetStrength(
                        RadianceThemingSlices.ComponentStateFacet.SELECTION,
                        RadianceThemingSlices.ComponentStateFacet.MIX);

                float selectedStrength = stateTransitionTracker.getFacetStrength(
                        RadianceThemingSlices.ComponentStateFacet.SELECTION);
                float mixStrength = stateTransitionTracker.getFacetStrength(
                        RadianceThemingSlices.ComponentStateFacet.MIX);

                float checkmarkFlatness = 0.0f;
                if ((selectedStrength > 0.0f) && (mixStrength > 0.0f)) {
                    // Going between On and Indeterminate states
                    checkmarkFlatness = mixStrength;
                }
                if ((selectedStrength == 0.0f) && (mixStrength > 0.0f)) {
                    // Going between Off and Indeterminate states
                    checkmarkFlatness = 1.0f;
                }
                if ((selectedStrength > 0.0f) && (mixStrength == 0.0f)) {
                    // Going between On and Off states
                    checkmarkFlatness = 0.0f;
                }

                boolean isCheckMarkFadingOut = !currState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION);
                float alpha = RadianceColorSchemeUtilities.getAlpha(triStateCheckBox, currState);

                // Populate color schemes based on the current transition state of the check box.
                BladeUtils.populateColorScheme(mutableFillColorScheme, triStateCheckBox,
                        modelStateInfo, currState,
                        RadianceThemingSlices.ColorSchemeAssociationKind.MARK_BOX,
                        false);
                BladeUtils.populateColorScheme(mutableBorderColorScheme, triStateCheckBox,
                        modelStateInfo, currState,
                        RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                        false);
                BladeUtils.populateColorScheme(mutableMarkColorScheme, triStateCheckBox,
                        modelStateInfo, currState,
                        RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                        false);

                Graphics2D graphics = (Graphics2D) g.create();
                graphics.translate(x, y);
                BladeIconUtils.drawCheckBox(
                        graphics, triStateCheckBox, fillPainter, borderPainter,
                        checkMarkSize, currState,
                        mutableFillColorScheme, mutableMarkColorScheme, mutableBorderColorScheme,
                        visibility, checkmarkFlatness, isCheckMarkFadingOut, alpha);
                graphics.dispose();
            }

            @Override
            public int getIconWidth() {
                return checkMarkSize;
            }

            @Override
            public int getIconHeight() {
                return checkMarkSize;
            }
        };
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        JTriStateCheckBox b = (JTriStateCheckBox) c;

        if (RadianceCoreUtilities.isOpaque(c)) {
            BackgroundPaintingUtils.update(g, c, false);
        }

        FontMetrics fm = g.getFontMetrics();

        Insets i = b.getInsets();

        viewRect.x = i.left;
        viewRect.y = i.top;
        viewRect.width = b.getWidth() - (i.right + viewRect.x);
        viewRect.height = b.getHeight() - (i.bottom + viewRect.y);

        textRect.x = textRect.y = textRect.width = textRect.height = 0;
        iconRect.x = iconRect.y = iconRect.width = iconRect.height = 0;

        Font f = b.getFont();
        g.setFont(f);

        // layout the text and icon
        String buttonText = this.triStateCheckBox.getProjection().getContentModel().getText();
        String text = SwingUtilities.layoutCompoundLabel(c, fm, buttonText, this.radianceIcon,
                SwingConstants.CENTER, SwingConstants.CENTER, SwingConstants.CENTER,
                SwingConstants.TRAILING, viewRect, iconRect, textRect,
                (buttonText == null) ? 0 : this.iconTextGap);

        Graphics2D g2d = (Graphics2D) g.create();
        if (text != null && !text.equals("")) {
            final View v = (View) b.getClientProperty(BasicHTML.propertyKey);
            if (v != null) {
                v.paint(g2d, textRect);
            } else {
                float buttonAlpha = RadianceColorSchemeUtilities.getAlpha(b,
                        ComponentState.getState(b.getTriStateButtonModel(), false));
                RadianceTextUtilities.paintText(g, b, textRect, text, -1,
                        this.stateTransitionTracker.getModelStateInfo(), buttonAlpha);
            }
        }

        // Paint the icon
        if (this.radianceIcon != null) {
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            this.radianceIcon.paintIcon(c, g2d, iconRect.x, iconRect.y);
        }

        // make sure that the focus ring is not clipped
        float focusRingPadding = RadianceSizeUtils.getFocusRingPadding(
                b, RadianceSizeUtils.getComponentFontSize(b)) / 2;

        Graphics2D graphicsFocus = (Graphics2D) g2d.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphicsFocus.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphicsFocus, 0, 0,
                b.getWidth(), b.getHeight(),
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    RadianceCoreUtilities.paintFocus(graphics1X, b, b, this, scaleFactor,
                            null, textRect, 1.0f,
                            (float) scaleFactor * focusRingPadding);
                }
        );
        graphicsFocus.dispose();
        // g2d.setColor(Color.red);
        // g2d.draw(iconRect);
        // g2d.draw(viewRect);
        // g2d.draw(textRect);
        // g2d.setColor(Color.blue);
        // g2d.drawRect(0, 0, button.getWidth() - 1, button.getHeight() - 1);

        g2d.dispose();
    }
}
