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
package org.pushingpixels.substance.internal.utils.menu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.MenuGutterFillKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker.ModelStateInfo;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.HighlightPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;
import org.pushingpixels.substance.internal.utils.menu.MenuUtilities.MenuLayoutMetrics;

/**
 * Delegate for painting background of menu items.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceMenuBackgroundDelegate {
	public static Color getGutterSoftFillColor(SubstanceColorScheme colorScheme) {
		return colorScheme.isDark() ? colorScheme.getUltraLightColor() 
				: colorScheme.getExtraLightColor();
	}
	
	public static Color getGutterHardFillColor(SubstanceColorScheme colorScheme) {
		return colorScheme.isDark() 
				? SubstanceColorUtilities.getLighterColor(colorScheme.getUltraLightColor(), 0.05) 
				: colorScheme.getUltraLightColor();
	}
	
	/**
	 * Updates the specified menu item with the background that matches the
	 * provided parameters.
	 * 
	 * @param g
	 *            Graphic context.
	 * @param menuItem
	 *            Menu item.
	 * @param bgColor
	 *            Current background color.
	 * @param borderAlpha
	 *            Border alpha.
	 * @param textOffset
	 *            The offset of the menu item text.
	 */
	public static void paintBackground(Graphics g, JComponent menuItem,
			int textOffset) {
		if (!menuItem.isShowing())
			return;
		int menuWidth = menuItem.getWidth();
		int menuHeight = menuItem.getHeight();

		Graphics2D graphics = (Graphics2D) g.create();
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_OFF);

		BackgroundPaintingUtils.update(graphics, menuItem, false);

		if (textOffset == 0) {
			// issue 465 - the value can be 0 - leading to
			// IllegalArgumenException on LinearGradientPaint below.
			return;
		}
		

		if (menuItem.getParent() instanceof JPopupMenu) {
			JPopupMenu parent = (JPopupMenu) menuItem.getParent();
			MenuLayoutMetrics popupMetrics = MenuUtilities.getPopupLayoutMetrics(
					parent, true);
			MenuGutterFillKind fillKind = SubstanceCoreUtilities
					.getMenuGutterFillKind();
			boolean hasGutterContent = (popupMetrics.maxIconWidth > 0) ||
					(popupMetrics.maxCheckIconWidth > 0);
			boolean shouldPaintGutter = hasGutterContent && (fillKind != null)
					&& (fillKind != MenuGutterFillKind.NONE);

			if (shouldPaintGutter) {
				SubstanceColorScheme scheme = SubstanceColorSchemeUtilities
						.getColorScheme(menuItem, ComponentState.ENABLED);
				Color extraLight = getGutterHardFillColor(scheme);
				Color ultraLight = getGutterSoftFillColor(scheme);
				if (menuItem.getComponentOrientation().isLeftToRight()) {
					Color leftColor = ((fillKind == MenuGutterFillKind.SOFT_FILL) || 
							(fillKind == MenuGutterFillKind.HARD)) ? ultraLight
							: extraLight;
					Color rightColor = ((fillKind == MenuGutterFillKind.SOFT_FILL) || 
							(fillKind == MenuGutterFillKind.SOFT)) ? ultraLight
							: extraLight;
					LinearGradientPaint gp = new LinearGradientPaint(0, 0,
							textOffset, 0, new float[] { 0.0f, 1.0f },
							new Color[] { leftColor, rightColor },
							CycleMethod.REPEAT);
					graphics.setComposite(WidgetUtilities.getAlphaComposite(
							menuItem, 0.7f, g));

					graphics.setPaint(gp);
					graphics.fillRect(0, 0, textOffset - 2, menuHeight);
				} else {
					// fix for defect 125 - support of RTL menus
					Color leftColor = ((fillKind == MenuGutterFillKind.HARD_FILL) 
							|| (fillKind == MenuGutterFillKind.HARD)) ? extraLight
							: ultraLight;
					Color rightColor = ((fillKind == MenuGutterFillKind.HARD_FILL) || 
							(fillKind == MenuGutterFillKind.SOFT)) ? extraLight
							: ultraLight;

					LinearGradientPaint gp = new LinearGradientPaint(
							textOffset, 0, menuWidth, 0, new float[] { 0.0f, 1.0f },
							new Color[] { leftColor, rightColor },
							CycleMethod.REPEAT);
					graphics.setComposite(WidgetUtilities.getAlphaComposite(
							menuItem, 0.7f, g));
					graphics.setPaint(gp);
					graphics.fillRect(textOffset - 2, 0, menuWidth, menuHeight);
				}
			}
		}
		// }

		graphics.dispose();
	}

	/**
	 * Paints menu highlights.
	 * 
	 * @param g
	 *            Graphics context.
	 * @param menuItem
	 *            Menu item.
	 * @param borderAlpha
	 *            Alpha channel for painting the border.
	 */
	public static void paintHighlights(Graphics g, JMenuItem menuItem,
			float borderAlpha) {
		Graphics2D graphics = (Graphics2D) g.create();

		TransitionAwareUI transitionAwareUI = (TransitionAwareUI) menuItem
				.getUI();
		StateTransitionTracker stateTransitionTracker = transitionAwareUI
				.getTransitionTracker();
		ModelStateInfo modelStateInfo = stateTransitionTracker
				.getModelStateInfo();

		ComponentState currState = modelStateInfo
				.getCurrModelStateNoSelection();

		if (currState.isDisabled()) {
			// no highlights on disabled menus
			return;
		}
		Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
				.getStateNoSelectionContributionMap();
		// if ("Check enabled unselected".equals(menuItem.getText())) {
		// System.out.println("New contribution map");
		// for (Map.Entry<ComponentState,
		// StateTransitionTracker.StateContributionInfo> existing : activeStates
		// .entrySet()) {
		// System.out.println("\t" + existing.getKey() + " in ["
		// + existing.getValue().start + ":"
		// + existing.getValue().end + "] -> "
		// + existing.getValue().curr);
		// }
		// }

		if ((currState == ComponentState.ENABLED) && (activeStates.size() == 1)) {
			// default state - no highlights
			return;
		}

		for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> stateEntry : activeStates
				.entrySet()) {
			ComponentState activeState = stateEntry.getKey();
			float alpha = SubstanceColorSchemeUtilities.getHighlightAlpha(
					menuItem, activeState)
					* stateEntry.getValue().getContribution();
			if (alpha == 0.0f)
				continue;

			SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
					.getColorScheme(menuItem,
							ColorSchemeAssociationKind.HIGHLIGHT, activeState);
			SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
					.getColorScheme(menuItem,
							ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
							activeState);
			graphics.setComposite(WidgetUtilities.getAlphaComposite(
					menuItem, alpha, g));
            HighlightPainterUtils.paintHighlight(graphics, null, menuItem,
                    new Rectangle(0, 0, menuItem.getWidth(), menuItem.getHeight()), borderAlpha,
                    null, fillScheme, borderScheme);
			graphics.setComposite(WidgetUtilities.getAlphaComposite(
					menuItem, g));
		}

		graphics.dispose();
	}
}
