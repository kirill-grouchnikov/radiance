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
package org.pushingpixels.substance.api.shaper;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.geom.GeneralPath;
import java.util.Set;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.border.Border;

import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceInternalArrowButton;
import org.pushingpixels.substance.internal.utils.SubstanceOutlineUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.border.SubstanceBorder;
import org.pushingpixels.substance.internal.utils.border.SubstanceButtonBorder;

/**
 * Button shaper that returns rectangular buttons with slightly rounded corners (ala Windows XP).
 * This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class ClassicButtonShaper implements SubstanceButtonShaper, RectangularButtonShaper {
    /**
     * Cache of already computed contours.
     */
    private final static LazyResettableHashMap<GeneralPath> contours = new LazyResettableHashMap<GeneralPath>(
            "ClassicButtonShaper");

    /**
     * Reusable instance of this shaper.
     */
    public static final ClassicButtonShaper INSTANCE = new ClassicButtonShaper();

    @Override
    public String getDisplayName() {
        return "Classic";
    }

    @Override
    public GeneralPath getButtonOutline(AbstractButton button, float extraInsets, float width,
            float height, boolean isInner) {
        Set<SubstanceSlices.Side> straightSides = SubstanceCoreUtilities.getSides(button,
                SubstanceSynapse.BUTTON_STRAIGHT_SIDE);

        float radius = this.getCornerRadius(button, extraInsets);
        if (isInner) {
            radius -= SubstanceSizeUtils.getBorderStrokeWidth();
            if (radius < 0.0f)
                radius = 0.0f;
        }

        HashMapKey key = SubstanceCoreUtilities.getHashKey(width, height, straightSides, radius,
                extraInsets);

        GeneralPath result = contours.get(key);
        if (result != null) {
            return result;
        }

//        System.out.println("Getting button outline for " + width + "x" + height + " and " + extraInsets);
        result = SubstanceOutlineUtilities.getBaseOutline(width, height, radius, straightSides,
                extraInsets);
//        System.out.println("\t-->" + result.getBounds2D());
//        try {
//            throw new Exception();
//        } catch (Throwable t) {
//            t.printStackTrace(System.out);
//        }
        contours.put(key, result);
        return result;
    }

    @Override
    public Border getButtonBorder(final AbstractButton button) {
        return new SubstanceButtonBorder(ClassicButtonShaper.class) {
            public Insets getBorderInsets(Component c) {
                int fontSize = SubstanceSizeUtils.getComponentFontSize(button);
                Insets buttonInsets = SubstanceSizeUtils.getButtonInsets(fontSize);
                float focusPadding = SubstanceSizeUtils.getFocusRingPadding(fontSize);
                int lrPadding = SubstanceCoreUtilities.hasText(button)
                        ? SubstanceSizeUtils.getTextButtonLRPadding(fontSize)
                        : 0;
                Set<SubstanceSlices.Side> openSides = SubstanceCoreUtilities.getSides(button,
                        SubstanceSynapse.BUTTON_OPEN_SIDE);
                int left = lrPadding + buttonInsets.left + (int) focusPadding
                        + ((openSides != null) && openSides.contains(SubstanceSlices.Side.LEFT)
                                ? -1
                                : 0);
                int right = lrPadding + buttonInsets.right + (int) focusPadding
                        + ((openSides != null) && openSides.contains(SubstanceSlices.Side.RIGHT)
                                ? -1
                                : 0);
                int top = buttonInsets.top
                        + ((openSides != null) && openSides.contains(SubstanceSlices.Side.TOP)
                                ? -1
                                : 0);
                int bottom = buttonInsets.bottom
                        + ((openSides != null) && openSides.contains(SubstanceSlices.Side.BOTTOM)
                                ? -1
                                : 0);
                return new Insets(top, left, bottom, right);
            }
        };
    }

    @Override
    public Dimension getPreferredSize(AbstractButton button, Dimension uiPreferredSize) {
        Dimension result;
        boolean toTweakWidth = false;
        boolean toTweakHeight = false;

        Icon icon = button.getIcon();
        boolean hasIcon = SubstanceCoreUtilities.hasIcon(button);
        boolean hasText = SubstanceCoreUtilities.hasText(button);
        Insets margin = button.getMargin();

        result = uiPreferredSize;

        boolean hasNoMinSizeProperty = SubstanceCoreUtilities.hasNoMinSizeProperty(button);
        if ((!hasNoMinSizeProperty) && hasText) {
            int baseWidth = uiPreferredSize.width;
            baseWidth = Math.max(baseWidth, SubstanceSizeUtils
                    .getMinButtonWidth(SubstanceSizeUtils.getComponentFontSize(button)));
            result = new Dimension(baseWidth, uiPreferredSize.height);
            int baseHeight = result.height;
            result = new Dimension(result.width, baseHeight);
        } else {
            if (hasNoMinSizeProperty) {
                if (margin != null) {
                    result = new Dimension(result.width + margin.left + margin.right,
                            result.height + margin.top + margin.bottom);
                }
            }
        }

        int fontSize = SubstanceSizeUtils.getComponentFontSize(button);
        int extraPadding = SubstanceSizeUtils.getExtraPadding(fontSize);
        float focusPadding = SubstanceSizeUtils.getFocusRingPadding(fontSize);
        int iconPaddingWidth = 6 + 2 * extraPadding + (int) (2 * focusPadding);
        int iconPaddingHeight = 6 + 2 * extraPadding;
        if (margin != null) {
            iconPaddingWidth = Math.max(iconPaddingWidth, margin.left + margin.right);
            iconPaddingHeight = Math.max(iconPaddingHeight, margin.top + margin.bottom);
        }
        if (hasIcon) {
            // check the icon height
            int iconHeight = icon.getIconHeight();
            if (iconHeight > (result.getHeight() - iconPaddingHeight)) {
                result = new Dimension(result.width, iconHeight);
                toTweakHeight = true;
            }
            int iconWidth = icon.getIconWidth();
            if (iconWidth > (result.getWidth() - iconPaddingWidth)) {
                result = new Dimension(iconWidth, result.height);
                toTweakWidth = true;
            }
        }

        if (SubstanceCoreUtilities.isScrollBarButton(button)) {
            toTweakWidth = false;
            toTweakHeight = false;
        }

        if (toTweakWidth) {
            result = new Dimension(result.width + iconPaddingWidth, result.height);
        }
        if (toTweakHeight) {
            result = new Dimension(result.width, result.height + iconPaddingHeight);
        }

        return result;
    }

    @Override
    public boolean isProportionate() {
        return true;
    }

    @Override
    public float getCornerRadius(AbstractButton button, float insets) {
        float radius = SubstanceSizeUtils
                .getClassicButtonCornerRadius(SubstanceSizeUtils.getComponentFontSize(button));
        if ((button != null)
                && button.getClass().isAnnotationPresent(SubstanceInternalArrowButton.class)) {
            Border parentBorder = ((JComponent) button.getParent()).getBorder();
            if (parentBorder instanceof SubstanceBorder) {
                radius *= ((SubstanceBorder) parentBorder).getRadiusScaleFactor();
            }
        }
        if (SubstanceCoreUtilities.isToolBarButton(button)) {
            radius = SubstanceCoreUtilities.getToolbarButtonCornerRadius(button, insets);
        }
        return radius;
    }
}
