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
package org.pushingpixels.radiance.laf.internal.utils.border;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.laf.api.ComponentState;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.laf.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.laf.internal.ui.RadianceTableUI;
import org.pushingpixels.radiance.laf.internal.utils.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Map;

/**
 * Table cell border for the <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceTableCellBorder implements Border, UIResource {
	/**
	 * Insets of <code>this</code> border.
	 */
	protected Insets myInsets;

	protected RadianceTableUI ui;

	protected RadianceTableUI.TableCellId cellId;

	/**
	 * Border alpha.
	 */
	protected float alpha;

	/**
	 * Cache of small border images.
	 */
	private static LazyResettableHashMap<BufferedImage> smallImageCache =
			new LazyResettableHashMap<>("RadianceTableCellBorder");

	/**
	 * Creates a new border with the specified insets.
	 * 
	 * @param insets
	 *            Insets.
	 */
	public RadianceTableCellBorder(Insets insets, RadianceTableUI ui,
			RadianceTableUI.TableCellId cellId) {
		this.myInsets = new Insets(insets.top, insets.left, insets.bottom,
				insets.right);
		this.ui = ui;
		this.cellId = cellId;
		this.alpha = 1.0f;
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
	 */
	private void paintBorderImpl(JComponent c, Graphics g, int x, int y, int width, int height) {
		// failsafe for LAF change
		if (!RadianceCoreUtilities.isCurrentLookAndFeel()) {
			return;
		}

		if ((width <= 0) || (height <= 0))
			return;

		Graphics2D graphics = (Graphics2D) g.create();

		double scale = RadianceCommonCortex.getScaleFactor(c);

		float radius = 0.0f;
		StateTransitionTracker stateTransitionTracker = ui
				.getStateTransitionTracker(cellId);
		StateTransitionTracker.ModelStateInfo modelStateInfo = (stateTransitionTracker == null) ? null
				: stateTransitionTracker.getModelStateInfo();
		Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = (modelStateInfo == null) ? null
				: modelStateInfo.getStateContributionMap();
		ComponentState currState = (modelStateInfo == null) ? ui
				.getCellState(cellId) : modelStateInfo.getCurrModelState();
		if (currState.isDisabled())
			currState = ComponentState.DISABLED_SELECTED;

		RadianceColorScheme baseBorderScheme = RadianceColorSchemeUtilities
				.getColorScheme(c, RadianceLafSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
						currState);

		ImageHashMapKey baseKey = RadianceCoreUtilities.getScaleAwareHashKey(
				scale, width, height, radius,
				RadianceSizeUtils.getComponentFontSize(c), baseBorderScheme.getDisplayName());
		BufferedImage baseLayer = smallImageCache.get(baseKey);
		float baseAlpha = RadianceColorSchemeUtilities.getAlpha(c, currState);

		if (baseLayer == null) {
			baseLayer = RadianceCoreUtilities.getBlankImage(scale, width, height);
			Graphics2D g2d = baseLayer.createGraphics();
			RadianceImageCreator.paintBorder(c, g2d, 0, 0, width, height,
					radius, baseBorderScheme);
			g2d.dispose();
			smallImageCache.put(baseKey, baseLayer);
		}

		graphics.setComposite(AlphaComposite.SrcOver.derive(baseAlpha
				* this.alpha));
		graphics.drawImage(baseLayer, x, y, null);

		if (!currState.isDisabled() && (activeStates != null)
				&& (activeStates.size() > 1)) {
			for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
					.entrySet()) {
				ComponentState activeState = activeEntry.getKey();
				if (activeState == currState)
					continue;

				float contribution = activeEntry.getValue().getContribution();
				if (contribution == 0.0f)
					continue;

				RadianceColorScheme borderScheme = RadianceColorSchemeUtilities
						.getColorScheme(c,
								RadianceLafSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
								activeState);

				ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
						scale, width, height, radius,
						RadianceSizeUtils.getComponentFontSize(c), borderScheme.getDisplayName());
				BufferedImage layer = smallImageCache.get(key);
				float activeAlpha = RadianceColorSchemeUtilities.getAlpha(c, activeState);

				if (layer == null) {
					layer = RadianceCoreUtilities.getBlankImage(scale, width, height);
					Graphics2D g2d = layer.createGraphics();
					RadianceImageCreator.paintBorder(c, g2d, 0, 0, width,
							height, radius, borderScheme);
					g2d.dispose();
					smallImageCache.put(key, layer);
				}

				graphics.setComposite(AlphaComposite.SrcOver.derive(activeAlpha
						* this.alpha * contribution));
				graphics.drawImage(layer, x, y, null);
			}
		}
		graphics.dispose();
	}

	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		paintBorderImpl((JComponent) c, g, x, y, width, height);
	}

	@Override
	public Insets getBorderInsets(Component c) {
		return this.myInsets;
	}

	@Override
	public boolean isBorderOpaque() {
		return false;
	}

	/**
	 * Sets the alpha for this border.
	 * 
	 * @param alpha
	 *            Alpha factor.
	 */
	public void setAlpha(float alpha) {
		this.alpha = alpha;
	}
}
