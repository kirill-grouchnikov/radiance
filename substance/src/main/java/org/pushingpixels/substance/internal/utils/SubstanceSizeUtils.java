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
package org.pushingpixels.substance.internal.utils;

import java.awt.Component;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.font.FontPolicy;
import org.pushingpixels.substance.api.font.FontSet;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.fonts.DefaultGnomeFontPolicy;

/**
 * This class is responsible for computing DPI-aware insets, stroke widths,
 * paddings, icon sizes etc. This class if for internal use only.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceSizeUtils {
	/**
	 * Cached control font size.
	 */
	private static int controlFontSize = -1;

	/**
	 * The points to pixels ratio of the current font policy.
	 */
	private static double pointsToPixelsRatio = 1.0;

	/**
	 * Gets the current control font size.
	 * 
	 * @return Control font size.
	 */
	public static int getControlFontSize() {
		if (controlFontSize > 0)
			return controlFontSize;
		FontPolicy fPolicy = SubstanceCortex.GlobalScope.getFontPolicy();
		FontSet fSet = fPolicy.getFontSet("Substance", null);
		controlFontSize = fSet.getControlFont().getSize();
		return controlFontSize;
	}

	/**
	 * Sets the new value for the control font size.
	 * 
	 * @param size
	 *            Control font size.
	 */
	public static void setControlFontSize(int size) {
		controlFontSize = size;
	}

	/**
	 * Computes the font size for the specified component. If the component is
	 * <code>null</code> or doesn't have font set ({@link Component#getFont()}
	 * returns <code>null</code>), this method returns the default control font
	 * size from {@link #getControlFontSize()}.
	 * 
	 * @param c
	 *            Component.
	 * @return Font size for the specified component
	 */
	public static int getComponentFontSize(Component c) {
		return ((c == null) || (c.getFont() == null)) ? getControlFontSize()
				: c.getFont().getSize();
	}

	/**
	 * Gets the adjusted size. The basic functionality of this method is as
	 * follows:
	 * 
	 * <ul>
	 * <li>The <code>baseSize</code> parameter specifies the base value</li>
	 * <li>The <code>forEachBase</code> and <code>toAdjustBy</code> specify how
	 * to adjust the resulting value based on the passed <code>fontSize</code>.</li>
	 * </ul>
	 * 
	 * For example, if you want base value to be 1.2 pixels, and have it grow by
	 * 0.1 pixel for every additional pixel in the font size, call this method
	 * with the following values:
	 * 
	 * <ul>
	 * <li><code>baseSize</code> = 1.2</li>
	 * <li><code>forEachBase</code> = 1</li>
	 * <li><code>toAdjustBy</code> = 0.1</li>
	 * </ul>
	 * 
	 * @param fontSize
	 *            Font size.
	 * @param baseSize
	 *            The base value.
	 * @param forEachBase
	 *            Base units for computing the adjustment.
	 * @param toAdjustBy
	 *            Adjustment amount for computing the adjustment.
	 * @return Adjusted size.
	 */
	public static float getAdjustedSize(int fontSize, float baseSize,
			int forEachBase, float toAdjustBy) {
		int delta = fontSize - 11;
		if (delta <= 0)
			return baseSize;
		float result = baseSize + delta * toAdjustBy / forEachBase;
		return result;
	}

	/**
	 * Gets the adjusted size. The basic functionality of this method is as
	 * follows:
	 * 
	 * <ul>
	 * <li>The <code>baseSize</code> parameter specifies the base value</li>
	 * <li>The <code>forEachBase</code> and <code>toAdjustBy</code> specify how
	 * to adjust the resulting value based on the passed <code>fontSize</code>.</li>
	 * </ul>
	 * 
	 * For example, if you want base value to be 4 pixels, and have it grow by 1
	 * pixel for every 3 additional pixels in the font size, call this method
	 * with the following values:
	 * 
	 * <ul>
	 * <li><code>baseSize</code> = 4</li>
	 * <li><code>forEachBase</code> = 3</li>
	 * <li><code>toAdjustBy</code> = 1</li>
	 * </ul>
	 * 
	 * @param fontSize
	 *            Font size.
	 * @param baseSize
	 *            The base value.
	 * @param forEachBase
	 *            Base units for computing the adjustment.
	 * @param toAdjustBy
	 *            Adjustment amount for computing the adjustment.
	 * @param toRoundAsEven
	 *            If <code>true</code>, the final value will be rounded down to
	 *            the closest even value.
	 * @return Adjusted size.
	 */
	public static int getAdjustedSize(int fontSize, int baseSize,
			int forEachBase, int toAdjustBy, boolean toRoundAsEven) {
		int delta = fontSize - 11;
		if (delta <= 0)
			return baseSize;
		int result = baseSize + delta * toAdjustBy / forEachBase;
		if (toRoundAsEven && (result % 2 != 0))
			result--;
		return result;
	}

	/**
	 * Returns the height of arrow icons under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Height of arrow icons under the specified font size.
	 */
	public static float getArrowIconHeight(int fontSize) {
		if (fontSize < 12)
			return 0.5f + fontSize * 0.5f;
		return getAdjustedSize(fontSize, 7.0f, 1, 0.4f);
	}

	/**
	 * Returns the width of arrow icons under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Width of arrow icons under the specified font size.
	 */
	public static float getArrowIconWidth(int fontSize) {
		int result = 2 * fontSize / 3;
		return result + 2;
	}

	/**
	 * Returns the stroke width of arrow icons under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Stroke width of arrow icons under the specified font size.
	 */
	public static float getArrowStrokeWidth(int fontSize) {
		return getAdjustedSize(fontSize, 2.0f, 1, 0.06f);
	}

	/**
	 * Returns the stroke width of borders under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Stroke width of borders under the specified font size.
	 */
	public static float getBorderStrokeWidth() {
		return 1.0f / (float) UIUtil.getScaleFactor();
	}

	/**
	 * Returns the button insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Button insets under the specified font size.
	 */
	public static Insets getButtonInsets(int fontSize) {
		// Special handling to make buttons
		// have the same height as text components.
		// We subtract the border stroke width - since the new
		// text component border appearance has a lighter "halo"
		// around the darker inner border.
		Insets textInsets = getTextBorderInsets(fontSize);
		int borderStroke = (int) getBorderStrokeWidth();
		int topDelta = textInsets.top - borderStroke;
		int bottomDelta = textInsets.bottom - borderStroke;

		int lrInset = SubstanceSizeUtils.getAdjustedSize(fontSize, 4, 4, 1,
				false);
		return new Insets(topDelta, lrInset, bottomDelta, lrInset);
	}

	/**
	 * Returns the border for check boxes under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Border for check boxes under the specified font size.
	 */
	public static Border getCheckBoxBorder(int fontSize, boolean ltr) {
		// The base insets are 2,3,3,5. We add one pixel for
		// each 3 extra points in base control size.
		int tInset = getAdjustedSize(fontSize, 2, 3, 1, false);
		int bInset = getAdjustedSize(fontSize, 3, 3, 1, false);
		if (fontSize == 11) {
			tInset = 2;
			bInset = 2;
		}
		int leadingInset = getAdjustedSize(fontSize, 3, 3, 1, false);
		int trailingInset = getAdjustedSize(fontSize, 5, 3, 1, false);

		return new BorderUIResource.EmptyBorderUIResource(tInset,
				ltr ? leadingInset : trailingInset, bInset, ltr ? trailingInset
						: leadingInset);
	}

	/**
	 * Returns the check mark size for check boxes under the specified font
	 * size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Check mark size for check boxes under the specified font size.
	 */
	public static int getCheckBoxMarkSize(int fontSize) {
		return 3 + fontSize;
	}

	/**
	 * Returns the corner radius for {@link ClassicButtonShaper} under the
	 * specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Corner radius for {@link ClassicButtonShaper} under the specified
	 *         font size.
	 */
	public static float getClassicButtonCornerRadius(int fontSize) {
		return getAdjustedSize(fontSize, 3, 6, 1, false);
	}

	/**
	 * Returns the combo box border insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Combo box border insets under the specified font size.
	 */
	public static Insets getComboBorderInsets(int fontSize) {
		// The base insets are 1,2,1,2. We add one pixel for
		// each 3 extra points in base control size.
		int tbInset = getAdjustedSize(fontSize, 1, 3, 1, false);
		int lrInset = getAdjustedSize(fontSize, 2, 3, 1, false);
		return new Insets(tbInset, lrInset, tbInset, lrInset);
	}

	/**
	 * Returns the combo box border insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Combo box border insets under the specified font size.
	 */
	public static Insets getComboLayoutInsets(int fontSize) {
		// The base insets are 2,2,2,2. We add one pixel for
		// each 4 extra points in base control size.
		int tbInset = getAdjustedSize(fontSize, 2, 4, 1, false);
		int lrInset = getAdjustedSize(fontSize, 2, 4, 1, false);
		return new Insets(tbInset, lrInset, tbInset, lrInset);
	}

	// /**
	// * Returns the combo box border insets under the specified font size.
	// *
	// * @param fontSize
	// * Font size.
	// * @return Combo box border insets under the specified font size.
	// */
	// public static Insets getEditableComboBorderInsets(int fontSize) {
	// // The base insets are 2,2,2,2. We add one pixel for
	// // each 4 extra points in base control size.
	// int tbInset = getAdjustedSize(fontSize, 2, 4, 1, false);
	// int lrInset = getAdjustedSize(fontSize, 2, 4, 1, false);
	// return new Insets(tbInset, lrInset, tbInset, lrInset);
	// }

	/**
	 * Returns the combo box text border insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Combo box text border insets under the specified font size.
	 */
	public static Insets getComboTextBorderInsets(int fontSize) {
		// the following makes sure that the text components
		// and combos have the same height and text alignment
		// under all font sizes.
		Insets textInsets = getTextBorderInsets(fontSize);
		Insets comboInsets = getComboBorderInsets(fontSize);
		int topDelta = textInsets.top - comboInsets.top;// - 1;
		int bottomDelta = textInsets.bottom - comboInsets.bottom;// - 1;

		int lrInset = getAdjustedSize(fontSize, 3, 4, 1, false);
		return new Insets(topDelta, lrInset, bottomDelta, lrInset);
	}

	/**
	 * Returns the default border insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Default border insets under the specified font size.
	 */
	public static Insets getDefaultBorderInsets(int fontSize) {
		// The base insets are 2,2,2,2. We add one pixel for
		// each 3 extra points in base control size.
		int inset = getAdjustedSize(fontSize, 2, 3, 1, false);
		return new Insets(inset, inset, inset, inset);
	}

	/**
	 * Returns the stroke width of double arrow icons under the specified font
	 * size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Stroke width of double arrow icons under the specified font size.
	 */
	public static float getDoubleArrowStrokeWidth(int fontSize) {
        return getAdjustedSize(fontSize, 1.5f, 1, 0.04f);
	}

	/**
	 * Returns the diameter of a drag bump dot under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Diameter of a drag bump dot under the specified font size.
	 */
	public static int getDragBumpDiameter(int fontSize) {
		return getAdjustedSize(fontSize, 2, 4, 1, false);
	}

	/**
	 * Returns the diameter of a big drag bump dot under the specified font
	 * size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Diameter of a big drag bump dot under the specified font size.
	 */
	public static int getBigDragBumpDiameter(int fontSize) {
		int result = getAdjustedSize(fontSize, 3, 3, 1, false);
		if (result % 2 != 0)
			result++;
		return result;
	}

	/**
	 * Returns the extra padding amount under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Extra padding amount under the specified font size.
	 */
	public static int getExtraPadding(int fontSize) {
		if (fontSize < 14)
			return 0;
		return (int) SubstanceSizeUtils.getAdjustedSize(fontSize, 0, 3, 1.2f);
	}

	/**
	 * Returns the focus ring padding amount under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Focus ring padding amount under the specified font size.
	 */
	public static float getFocusRingPadding(int fontSize) {
	    // Should always account for the border stroke width so that the focus ring
	    // doesn't end too close to the outer border of the control
	    float borderStrokeWidth = SubstanceSizeUtils.getBorderStrokeWidth();
		if (fontSize < 14) {
			return 2 + borderStrokeWidth;
		}
		return 3 + SubstanceSizeUtils.getAdjustedSize(fontSize, 0, 3,
				0.8f) + borderStrokeWidth;
	}

	/**
	 * Returns the stroke width of focus rings.
	 */
	public static float getFocusStrokeWidth() {
        return 1.0f / (float) UIUtil.getScaleFactor();
	}

	/**
	 * Returns the stroke width of close icon under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Stroke width of close icon under the specified font size.
	 */
	public static float getCloseIconStrokeWidth(int fontSize) {
		return Math.max(1.0f, fontSize / 10.0f);
	}

	/**
	 * Returns the list cell renderer insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return List cell renderer insets under the specified font size.
	 */
	public static Insets getListCellRendererInsets(int fontSize) {
		// Special handling to make non-editable combo boxes
		// have the same height as text components. The combo box
		// uses list cell renderer, so to compute the top and
		// bottom insets of a list cell renderer, we subtract the
		// insets of combo box from the insets of text component.
		// We also subtract the border stroke width - since the new
		// text component border appearance has a lighter "halo"
		// around the darker inner border.
		Insets textInsets = getTextBorderInsets(fontSize);
		Insets comboInsets = getComboBorderInsets(fontSize);
		int borderStroke = (int) getBorderStrokeWidth();
		int topDelta = textInsets.top - comboInsets.top - borderStroke;
		int bottomDelta = textInsets.bottom - comboInsets.bottom - borderStroke;

		int lrInset = SubstanceSizeUtils.getAdjustedSize(fontSize, 4, 4, 1,
				false);
		return new Insets(topDelta, lrInset, bottomDelta, lrInset);
	}

	/**
	 * Returns the check mark size of check box menu items and radio button menu
	 * items under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Check mark size of check box menu items and radio button menu
	 *         items under the specified font size.
	 */
	public static int getMenuCheckMarkSize(int fontSize) {
		int result = fontSize - 2;
		if (result % 2 == 0)
			result--;
		return result;
	}

	/**
	 * Returns the margin for menu items under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Margin for menu items under the specified font size.
	 */
	public static int getMenuItemMargin(int fontSize) {
		return getAdjustedSize(fontSize, 2, 4, 1, false);
	}

	/**
	 * Returns the gap between text and icon in buttons and menu items under the
	 * specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Gap between text and icon in button menu items under the
	 *         specified font size.
	 */
	public static int getTextIconGap(int fontSize) {
		return getAdjustedSize(fontSize, 4, 3, 1, false);
	}

	/**
	 * Returns the maximum button height under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Maximum button height under the specified font size.
	 */
	public static int getMinButtonWidth(int fontSize) {
		return 5 * fontSize + 12;
	}

	/**
	 * Returns the password dot diameter for password fields under the specified
	 * font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Password dot diameter for password fields under the specified
	 *         font size.
	 */
	public static int getPasswordDotDiameter(int fontSize) {
		return getAdjustedSize(fontSize, 7, 2, 1, false);
	}

	/**
	 * Returns the password dot gap for password fields under the specified font
	 * size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Password dot gap for password fields under the specified font
	 *         size.
	 */
	public static int getPasswordDotGap(int fontSize) {
		return (fontSize - 6) / 3;
	}

	/**
	 * Returns the border for radio buttons under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Border for radio buttons under the specified font size.
	 */
	public static Border getRadioButtonBorder(int fontSize, boolean ltr) {
		Border checkBoxBorder = getCheckBoxBorder(fontSize, ltr);
		Insets checkBoxInsets = checkBoxBorder.getBorderInsets(null);
		return new BorderUIResource.EmptyBorderUIResource(checkBoxInsets.top,
				checkBoxInsets.left - (ltr ? 0 : 2), checkBoxInsets.bottom,
				checkBoxInsets.right - (ltr ? 2 : 0));
	}

	/**
	 * Returns the check mark size for radio buttons under the specified font
	 * size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Check mark size for radio buttons under the specified font size.
	 */
	public static int getRadioButtonMarkSize(int fontSize) {
		int result = fontSize;
		return result;
	}

	/**
	 * Returns the width of scroll bars under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Width of scroll bars under the specified font size.
	 */
	public static int getScrollBarWidth(int fontSize) {
		int result = (int) (getArrowIconWidth(fontSize) * 3 / 2) + 2;
		if (result % 2 == 1)
			result--;
		return result;
	}

	/**
	 * Returns the slider thumb icon size under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Slider thumb icon size under the specified font size.
	 */
	public static int getSliderIconSize(int fontSize) {
		int result = fontSize + 5;
		if (result % 2 != 0)
			result--;
		return result;
	}

	/**
	 * Returns the slider tick size under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Slider tick size under the specified font size.
	 */
	public static int getSliderTickSize(int fontSize) {
		return Math.max(7, fontSize - 3);
	}

	/**
	 * Returns the slider track size under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Slider track size under the specified font size.
	 */
	public static int getSliderTrackSize(int fontSize) {
		return SubstanceSizeUtils.getAdjustedSize(fontSize, 5, 4, 1, false);
	}

	/**
	 * Returns the height of small arrow icons under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Height of small arrow icons under the specified font size.
	 */
	public static float getSmallArrowIconHeight(int fontSize) {
		return getArrowIconHeight(fontSize) - 1;
	}
	
	public static float getSmallDoubleArrowIconHeight(int fontSize) {
	    float result = getSmallArrowIconHeight(fontSize);
	    result += getSmallDoubleArrowGap(fontSize);
	    return result;
	}
	
	public static float getSmallDoubleArrowGap(int fontSize) {
        return 3 + 2 * SubstanceSizeUtils.getExtraPadding(fontSize) / 3;
	}

	/**
	 * Returns the width of small arrow icons under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Width of small arrow icons under the specified font size.
	 */
	public static float getSmallArrowIconWidth(int fontSize) {
		return getArrowIconWidth(fontSize) - 2;
	}

	/**
	 * Returns the height of spinner arrow icons under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Height of spinner arrow icons under the specified font size.
	 */
	public static float getSpinnerArrowIconHeight(int fontSize) {
		float result = SubstanceSizeUtils.getArrowIconHeight(fontSize)
				+ SubstanceSizeUtils
						.getAdjustedSize(fontSize + 1, 0, 1, -0.25f);
		return result;
	}

	/**
	 * Returns the width of spinner arrow icons under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Width of spinner arrow icons under the specified font size.
	 */
	public static float getSpinnerArrowIconWidth(int fontSize) {
		int result = (int) (SubstanceSizeUtils.getArrowIconWidth(fontSize) + SubstanceSizeUtils
				.getAdjustedSize(fontSize, 1, 1, -0.15f));
		if (result % 2 == 0)
			result--;
		return result;
	}

	/**
	 * Returns the spinner border insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Spinner border insets under the specified font size.
	 */
	public static Insets getSpinnerBorderInsets(int fontSize) {
		// make sure that spinners and combos have the same height and text
		// alignment under all font sizes.
		Insets comboInsets = getComboBorderInsets(fontSize);
		return new Insets(comboInsets.top + 1, comboInsets.left,
				comboInsets.bottom + 1, comboInsets.right);
	}

	/**
	 * Returns the spinner arrow button insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Spinner arrow button insets under the specified font size.
	 */
	public static Insets getSpinnerArrowButtonInsets(int fontSize) {
		int borderStrokeWidth = (int) Math.floor(getBorderStrokeWidth());
		return new Insets(borderStrokeWidth, borderStrokeWidth,
				borderStrokeWidth, borderStrokeWidth);
	}

	// /**
	// * Returns the spinner button width under the specified font size.
	// *
	// * @param fontSize
	// * Font size.
	// * @return Spinner button width under the specified font size.
	// */
	// public static int getSpinnerButtonWidth(int fontSize) {
	// return (int)(getArrowIconWidth(fontSize) * 3 / 2);
	// }

	/**
	 * Returns the spinner text border insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Spinner text border insets under the specified font size.
	 */
	public static Insets getSpinnerTextBorderInsets(int fontSize) {
		Insets textInsets = getComboTextBorderInsets(fontSize);
		return new Insets(textInsets.top - 1, textInsets.left,
				textInsets.bottom - 1, textInsets.right);
	}

	/**
	 * Returns the height of split pane divider arrow icons under the specified
	 * font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Height of split pane divider arrow icons under the specified font
	 *         size.
	 */
	public static float getSplitPaneArrowIconHeight(int fontSize) {
		float result = SubstanceSizeUtils.getArrowIconHeight(fontSize)
				+ SubstanceSizeUtils.getAdjustedSize(fontSize, -2, 1, -0.3f);
		return result;
	}

	/**
	 * Returns the width of split pane divider arrow icons under the specified
	 * font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Width of split pane divider arrow icons under the specified font
	 *         size.
	 */
	public static float getSplitPaneArrowIconWidth(int fontSize) {
		float result = SubstanceSizeUtils.getArrowIconWidth(fontSize)
				+ SubstanceSizeUtils.getAdjustedSize(fontSize, -2, 1, -0.25f);
		return result;
	}

	/**
	 * Returns the offset of the first split pane divider button under the
	 * specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Offset of the first split pane divider button under the specified
	 *         font size.
	 */
	public static int getSplitPaneButtonOffset(int fontSize) {
		return getAdjustedSize(fontSize, 2, 3, 1, false);
	}

	/**
	 * Returns the tabbed pane content insets under the specified size. The
	 * {@link SubstanceSlices.TabContentPaneBorderKind#SINGLE_FULL} is
	 * assumed.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Tabbed pane content insets under the specified size.
	 */
	public static Insets getTabbedPaneContentInsets() {
		float borderStrokeWidth = getBorderStrokeWidth();
		int inset = (int) Math.ceil(borderStrokeWidth + 0.5f);
		return new Insets(inset, inset, inset, inset);
	}

	/**
	 * Returns the stroke width of tab close buttons under the specified size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Stroke width of tab close buttons under the specified size.
	 */
	public static float getTabCloseButtonStrokeWidth() {
		return getBorderStrokeWidth();
	}

	/**
	 * Returns the icon size of tab close buttons under the specified size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Icon size of tab close buttons under the specified size.
	 */
	public static int getTabCloseIconSize(int fontSize) {
		return fontSize - 2;
	}

	/**
	 * Returns the table cell renderer insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Table cell renderer insets under the specified font size.
	 */
	public static Insets getTableCellRendererInsets(int fontSize) {
		Insets textInsets = getTextBorderInsets(fontSize);
		Insets comboInsets = getComboBorderInsets(fontSize);
		int topDelta = textInsets.top - comboInsets.top - 1;
		int bottomDelta = textInsets.bottom - comboInsets.bottom - 2;
		if (fontSize == 11) {
			bottomDelta++;
		}

		int lrInset = SubstanceSizeUtils.getAdjustedSize(fontSize, 2, 4, 1,
				false);
		return new Insets(topDelta, lrInset, bottomDelta, lrInset);
	}

	/**
	 * Returns the text border insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Text border insets under the specified font size.
	 */
	public static Insets getTextBorderInsets(int fontSize) {
		// The base insets are 3,5,4,5. We add one pixel for
		// each 3 extra points in base control size.
		int tInset = getAdjustedSize(fontSize, 3, 3, 1, false);
		int bInset = getAdjustedSize(fontSize, 4, 3, 1, false);
		if (fontSize == 11) {
			tInset = 3;
			bInset = 3;
		}
		int lrInset = getAdjustedSize(fontSize, 5, 3, 1, false);
		return new Insets(tInset, lrInset, bInset, lrInset);
	}

	/**
	 * Returns the text button padding amount on left and right sides under the
	 * specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Text button padding amount on left and right sides under the
	 *         specified font size.
	 */
	public static int getTextButtonLRPadding(int fontSize) {
		return SubstanceSizeUtils.getAdjustedSize(fontSize, 3, 2, 1, false);
	}

	/**
	 * Returns the icon size of title pane buttons under the specified size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Icon size of title pane buttons under the specified size.
	 */
	public static int getTitlePaneIconSize() {
		return 5 + getControlFontSize();
	}

	/**
	 * Returns the tool bar drag inset under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Tool bar drag inset under the specified font size.
	 */
	public static int getToolBarDragInset(int fontSize) {
		return fontSize + 5;
	}

	/**
	 * Returns the tool bar insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Tool bar insets under the specified font size.
	 */
	public static Insets getToolBarInsets(int fontSize) {
		int lbrInset = getAdjustedSize(fontSize, 2, 3, 1, false);
		int tInset = getAdjustedSize(fontSize, 1, 3, 1, false);
		return new Insets(tInset, lbrInset, lbrInset, lbrInset);
	}

	/**
	 * Returns the tooltip border insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Tooltip border insets under the specified font size.
	 */
	public static Insets getToolTipBorderInsets(int fontSize) {
		// The base insets are 1,1,1,1. We add one pixel for
		// each 3 extra points in base control size.
		int inset = getAdjustedSize(fontSize, 1, 3, 1, false);
		return new Insets(inset, inset, inset, inset);
	}

	/**
	 * Returns the tree cell renderer insets under the specified font size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Tree cell renderer insets under the specified font size.
	 */
	public static Insets getTreeCellRendererInsets(int fontSize) {
		Insets listCellInsets = getListCellRendererInsets(fontSize);
		return new Insets(listCellInsets.top - 1, listCellInsets.left - 2,
				listCellInsets.bottom - 1, listCellInsets.right - 2);
	}

	/**
	 * Returns the icon size of tree expand / collapse icons under the specified
	 * size.
	 * 
	 * @param fontSize
	 *            Font size.
	 * @return Icon size of tree expand / collapse icons under the specified
	 *         size.
	 */
	public static int getTreeIconSize(int fontSize) {
		int extraPadding = SubstanceSizeUtils.getExtraPadding(fontSize);
		int extraPadding2 = 2 * extraPadding;
		return 10 + extraPadding2;
	}

	/**
	 * Returns the points to pixels ratio of the current font policy.
	 * 
	 * @return The points to pixels ratio of the current font policy.
	 */
	public static double getPointsToPixelsRatio() {
		return pointsToPixelsRatio;
	}

	/**
	 * Resets the points to pixels ratio based on the specified font policy.
	 * 
	 * @param fontPolicy
	 *            Font policy.
	 */
	public static void resetPointsToPixelsRatio(FontPolicy fontPolicy) {
		if (fontPolicy instanceof DefaultGnomeFontPolicy) {
			pointsToPixelsRatio = DefaultGnomeFontPolicy
					.getPointsToPixelsRatio();
		} else {
			pointsToPixelsRatio = Toolkit.getDefaultToolkit()
					.getScreenResolution() / 72.0;
		}
	}

    /**
     * Returns the size of the lookup button. 
     * 
     * @return The size of the lookup button.
     */
    public static int getLookupButtonSize() {
        return 4 + SubstanceSizeUtils.getControlFontSize();
    }
}
