/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.utils.menu;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker.ModelStateInfo;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.painter.HighlightPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * Delegate for painting background of menu items.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceMenuBackgroundDelegate {
	/**
	 * Updates the specified menu item with the background that matches the
	 * provided parameters.
	 * 
	 * @param g
	 *            Graphic context.
	 * @param menuItem
	 *            Menu item.
	 * @param textOffset
	 *            The offset of the menu item text.
	 */
	public static void paintBackground(Graphics g, JComponent menuItem, int textOffset) {
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
			// IllegalArgumentException on LinearGradientPaint below.
			return;
		}
		

		if (menuItem.getParent() instanceof JPopupMenu) {
			JPopupMenu parent = (JPopupMenu) menuItem.getParent();
			MenuUtilities.MenuLayoutMetrics popupMetrics = MenuUtilities.getPopupLayoutMetrics(
					parent, true);
			float fillAlpha = RadianceCoreUtilities.getMenuGutterFillAlpha();
			boolean hasGutterContent = (popupMetrics.maxIconWidth > 0) ||
					(popupMetrics.maxCheckIconWidth > 0);
			boolean shouldPaintGutter = hasGutterContent;

			if (shouldPaintGutter) {
				graphics.setComposite(WidgetUtilities.getAlphaComposite(
						menuItem, fillAlpha, g));
				RadianceSkin skin = RadianceCoreUtilities.getSkin(menuItem);
				ContainerColorTokens backgroundTokens =
					skin.getBackgroundContainerTokens(
						DecorationPainterUtils.getDecorationType(menuItem));
				Color gutterColor = backgroundTokens.isDark()
					? backgroundTokens.getContainerSurfaceHighest()
					: backgroundTokens.getContainerSurfaceLowest();
				graphics.setColor(gutterColor);
				if (menuItem.getComponentOrientation().isLeftToRight()) {
					graphics.fillRect(0, 0, textOffset - 2, menuHeight);
				} else {
					// fix for defect 125 - support of RTL menus
					graphics.fillRect(textOffset - 2, 0, menuWidth, menuHeight);
				}
			}
		}

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
	public static void paintHighlights(Graphics g, JMenuItem menuItem, float borderAlpha) {
		Graphics2D graphics = (Graphics2D) g.create();

		TransitionAwareUI transitionAwareUI = (TransitionAwareUI) menuItem.getUI();
		StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
		ModelStateInfo modelStateInfo = stateTransitionTracker.getModelStateInfo();

		ComponentState currState = modelStateInfo.getCurrModelStateNoSelection();

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

		for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> stateEntry :
				activeStates.entrySet()) {
			ComponentState activeState = stateEntry.getKey();
			if ((activeState == ComponentState.ENABLED) || (activeState == ComponentState.DISABLED_UNSELECTED)) {
				continue;
			}
			float alpha = stateEntry.getValue().getContribution();
			if (alpha == 0.0f) {
				continue;
			}

			graphics.setComposite(WidgetUtilities.getAlphaComposite(menuItem, alpha, g));
			ContainerColorTokens colorTokens =
				RadianceColorSchemeUtilities.getContainerTokens(
					menuItem, RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
					activeState, RadianceThemingSlices.ContainerType.NEUTRAL);
			HighlightPainterUtils.paintHighlight(graphics, null, menuItem,
				new Rectangle(0, 0, menuItem.getWidth(), menuItem.getHeight()), borderAlpha,
				null, colorTokens);
			graphics.setComposite(WidgetUtilities.getAlphaComposite(menuItem, g));
		}

		graphics.dispose();
	}
}
