/*
 * Copyright (c) 2005-2018 Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.flamingo.utils;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;

import org.pushingpixels.flamingo.api.ribbon.JRibbon;
import org.pushingpixels.flamingo.internal.ui.ribbon.appmenu.JRibbonApplicationMenuButton;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.flamingo.common.ui.ActionPopupTransitionAwareUI;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

/**
 * Delegate class for painting backgrounds of buttons in <b>Substance </b> look
 * and feel. This class is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class RibbonApplicationMenuButtonBackgroundDelegate {
	/**
	 * Cache for background images. Each time
	 * {@link #getBackground(AbstractButton, SubstanceButtonShaper, SubstanceFillPainter, int, int)}
	 * is called, it checks <code>this</code> map to see if it already contains
	 * such background. If so, the background from the map is returned.
	 */
	private static LazyResettableHashMap<BufferedImage> imageCache = new LazyResettableHashMap<BufferedImage>(
			"Substance.Flamingo.RibbonApplicationMenuButtonBackgroundDelegate");

	/**
	 * Retrieves the background for the specified button.
	 * 
	 * @param menuButton
	 *            Button.
	 * @param shaper
	 *            Button shaper.
	 * @param painter
	 *            Button gradient painter.
	 * @param borderPainter
	 *            Button border painter.
	 * @param width
	 *            Button width.
	 * @param height
	 *            Button height.
	 * @return Button background.
	 */
	public static BufferedImage getFullAlphaBackground(JRibbonApplicationMenuButton menuButton,
			SubstanceFillPainter painter, SubstanceBorderPainter borderPainter, int width,
			int height) {

		JRibbon ribbon = menuButton.getRibbon();

		ButtonModel model = new DefaultButtonModel();
		model.setEnabled(true);
		model.setSelected(menuButton.getPopupModel().isSelected());
		boolean popupShowing = menuButton.getPopupModel().isPopupShowing();
		model.setRollover(menuButton.getPopupModel().isRollover() && !popupShowing);
		model.setPressed(menuButton.getPopupModel().isPressed() || popupShowing);
		model.setArmed(menuButton.getActionModel().isArmed() || popupShowing);

		ActionPopupTransitionAwareUI ui = (ActionPopupTransitionAwareUI) menuButton.getUI();
		StateTransitionTracker popupStateTransitionTracker = ui.getPopupTransitionTracker();
		StateTransitionTracker.ModelStateInfo modelStateInfo = popupStateTransitionTracker
				.getModelStateInfo();
		Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
				.getStateContributionMap();
		ComponentState currState = ComponentState.getState(model, menuButton);

		SubstanceColorScheme baseFillScheme = SubstanceColorSchemeUtilities
				.getColorScheme(menuButton, currState);
		SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities.getColorScheme(ribbon,
				ColorSchemeAssociationKind.BORDER, currState);

		HashMapKey baseKey = SubstanceCoreUtilities.getHashKey(width, height,
				baseFillScheme.getDisplayName(), baseBorderScheme.getDisplayName(),
				painter.getDisplayName(), borderPainter.getDisplayName(),
				SubstanceSizeUtils.getComponentFontSize(menuButton));

		BufferedImage baseLayer = imageCache.get(baseKey);
		if (baseLayer == null) {
			baseLayer = getSingleLayer(menuButton, painter, borderPainter, width, height,
					baseFillScheme, baseBorderScheme);

			imageCache.put(baseKey, baseLayer);
		}

		if (popupShowing || currState.isDisabled() || (activeStates.size() == 1)) {
			return baseLayer;
		}

		BufferedImage result = SubstanceCoreUtilities.getBlankImage(width, height);
		Graphics2D g2d = result.createGraphics();
		double scaleFactor = UIUtil.getScaleFactor();

		g2d.drawImage(baseLayer, 0, 0, (int) (baseLayer.getWidth() / scaleFactor),
		        (int) (baseLayer.getHeight() / scaleFactor), null);

		for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
				.entrySet()) {
			ComponentState activeState = activeEntry.getKey();
			if (activeState == currState)
				continue;

			float contribution = activeEntry.getValue().getContribution();
			if (contribution == 0.0f)
				continue;

			SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
					.getColorScheme(menuButton, activeState);
			SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities.getColorScheme(ribbon,
					ColorSchemeAssociationKind.BORDER, activeState);

			HashMapKey key = SubstanceCoreUtilities.getHashKey(width, height,
					fillScheme.getDisplayName(), borderScheme.getDisplayName(),
					painter.getDisplayName(), borderPainter.getDisplayName(),
					SubstanceSizeUtils.getComponentFontSize(menuButton));

			BufferedImage layer = imageCache.get(key);
			if (layer == null) {
				layer = getSingleLayer(menuButton, painter, borderPainter, width, height,
						fillScheme, borderScheme);

				imageCache.put(key, layer);
			}

			g2d.setComposite(AlphaComposite.SrcOver.derive(contribution));
			g2d.drawImage(layer, 0, 0, (int) (layer.getWidth() / scaleFactor),
			        (int) (layer.getHeight() / scaleFactor), null);
		}

		g2d.dispose();
		return result;
	}

	private static BufferedImage getSingleLayer(JRibbonApplicationMenuButton menuButton,
			SubstanceFillPainter painter, SubstanceBorderPainter borderPainter, int width,
			int height, SubstanceColorScheme fillScheme, SubstanceColorScheme borderScheme) {
		float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;

		float outerRadius = Math.min(width - 2 * borderDelta, height - 2 * borderDelta);
		int delta = 0;// (outerRadius % 2 == 1) ? 1 : 0;
		Shape contour = new Ellipse2D.Double(borderDelta + delta, borderDelta + delta,
				outerRadius - delta, outerRadius - delta);

		BufferedImage newBackground = SubstanceCoreUtilities.getBlankImage(width, height);
		Graphics2D finalGraphics = (Graphics2D) newBackground.getGraphics();
		painter.paintContourBackground(finalGraphics, menuButton, width, height, contour, false,
				fillScheme, true);

		float borderThickness = SubstanceSizeUtils.getBorderStrokeWidth();
		float innerRadius = Math.min(width - 2 * (borderDelta + borderThickness),
				height - 2 * (borderDelta + borderThickness));
		delta = 0;// (innerRadius % 2 == 1) ? 1 : 0;
		Shape contourInner = new Ellipse2D.Double(borderDelta + borderThickness + delta,
				borderDelta + borderThickness + delta, innerRadius - delta, innerRadius - delta);

		borderPainter.paintBorder(finalGraphics, menuButton, width, height, contour, contourInner,
				borderScheme);
		return newBackground;
	}
}
