/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ComponentStateFacet;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.blade.BladeIconUtils;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicButtonListener;
import java.awt.*;

/**
 * UI for check boxes in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceCheckBoxUI extends RadianceRadioButtonUI {
    /**
     * Prefix for the checkbox-related properties in the {@link UIManager}.
     */
    private final static String propertyPrefix = "CheckBox" + ".";

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceCheckBoxUI((JToggleButton) comp);
    }

    /**
     * Simple constructor.
     *
     * @param button The associated button.
     */
    protected RadianceCheckBoxUI(JToggleButton button) {
        super(button);
    }

    @Override
    protected String getPropertyPrefix() {
        return propertyPrefix;
    }

    @Override
    protected void installDefaults(AbstractButton b) {
        super.installDefaults(b);

        button.setRolloverEnabled(true);

        Border border = b.getBorder();
        if (border == null || border instanceof UIResource) {
            b.setBorder(RadianceSizeUtils.getCheckBoxBorder(
                    RadianceSizeUtils.getComponentFontSize(b),
                    b.getComponentOrientation().isLeftToRight()));
        }
    }

    @Override
    protected void updateIcon() {
        int fontSize = RadianceSizeUtils.getComponentFontSize(button);
        int checkMarkSize = RadianceSizeUtils.getCheckBoxMarkSize(fontSize);
        this.radianceIcon = new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                StateTransitionTracker.ModelStateInfo modelStateInfo =
                        stateTransitionTracker.getModelStateInfo();

                RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(button);
                RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(button);
                ComponentState currState = modelStateInfo.getCurrModelState();

                float visibility = stateTransitionTracker.getFacetStrength(ComponentStateFacet.SELECTION);
                boolean isCheckMarkFadingOut = !currState.isFacetActive(ComponentStateFacet.SELECTION);
                float alpha = RadianceColorSchemeUtilities.getAlpha(button, currState);

                // Populate color schemes based on the current transition state of the check box.
                BladeUtils.populateColorScheme(mutableFillColorScheme, button,
                        modelStateInfo, currState,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        false);
                BladeUtils.populateColorScheme(mutableBorderColorScheme, button,
                        modelStateInfo, currState,
                        RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                        false);
                BladeUtils.populateColorScheme(mutableMarkColorScheme, button,
                        modelStateInfo, currState,
                        ColorSchemeAssociationKind.MARK,
                        false);

                Graphics2D graphics = (Graphics2D) g.create();
                graphics.translate(x, y);
                BladeIconUtils.drawCheckBox(
                        graphics, button, fillPainter, borderPainter,
                        checkMarkSize, currState,
                        mutableFillColorScheme, mutableMarkColorScheme, mutableBorderColorScheme,
                        visibility, 0.0f, isCheckMarkFadingOut, alpha);
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
    protected BasicButtonListener createButtonListener(AbstractButton b) {
        return new RolloverButtonListener(b, this.stateTransitionTracker);
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        JCheckBox checkBox = (JCheckBox) c;
        return RadianceMetricsUtilities.getPreferredCheckButtonSize(checkBox,
                ((RadianceCheckBoxUI) checkBox.getUI()).getDefaultIcon());
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        super.update(g2d, c);
        g2d.dispose();
    }
}
