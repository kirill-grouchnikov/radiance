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
package org.pushingpixels.substance.internal.utils.border;

import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.ui.SubstanceTableUI;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

/**
 * Table cell border for the <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceTableCellBorder implements Border, UIResource {
	/**
	 * Insets of <code>this</code> border.
	 */
	protected Insets myInsets;

	protected SubstanceTableUI ui;

	protected SubstanceTableUI.TableCellId cellId;

	/**
	 * Border alpha.
	 */
	protected float alpha;

	/**
	 * Cache of small border images.
	 */
	private static LazyResettableHashMap<BufferedImage> smallImageCache = new LazyResettableHashMap<BufferedImage>(
			"SubstanceTableCellBorder");

	/**
	 * Creates a new border with the specified insets.
	 * 
	 * @param insets
	 *            Insets.
	 */
	public SubstanceTableCellBorder(Insets insets, SubstanceTableUI ui,
			SubstanceTableUI.TableCellId cellId) {
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
	 * @param isEnabled
	 *            Component enabled status.
	 * @param hasFocus
	 *            Component focus ownership status.
	 * @param alpha
	 *            Alpha value.
	 */
	private void paintBorder(JComponent c, Graphics g, int x, int y, int width,
			int height, boolean isEnabled, boolean hasFocus) {
		// failsafe for LAF change
		if (!SubstanceCoreUtilities.isCurrentLookAndFeel()) {
			return;
		}

		if ((width <= 0) || (height <= 0))
			return;

		Graphics2D graphics = (Graphics2D) g.create();

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

		SubstanceColorScheme baseBorderScheme = SubstanceColorSchemeUtilities
				.getColorScheme(c, ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
						currState);

		HashMapKey baseKey = SubstanceCoreUtilities.getHashKey(
				SubstanceSizeUtils.getComponentFontSize(c), width, height,
				radius, baseBorderScheme.getDisplayName());
		BufferedImage baseLayer = smallImageCache.get(baseKey);
		float baseAlpha = SubstanceColorSchemeUtilities.getAlpha(c, currState);

		if (baseLayer == null) {
			baseLayer = SubstanceCoreUtilities.getBlankImage(width, height);
			Graphics2D g2d = baseLayer.createGraphics();
			SubstanceImageCreator.paintBorder(c, g2d, 0, 0, width, height,
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

				SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
						.getColorScheme(c,
								ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
								activeState);

				HashMapKey key = SubstanceCoreUtilities.getHashKey(
						SubstanceSizeUtils.getComponentFontSize(c), width,
						height, radius, borderScheme.getDisplayName());
				BufferedImage layer = smallImageCache.get(key);
				float activeAlpha = SubstanceColorSchemeUtilities.getAlpha(c,
						activeState);

				if (layer == null) {
					layer = SubstanceCoreUtilities.getBlankImage(width, height);
					Graphics2D g2d = layer.createGraphics();
					SubstanceImageCreator.paintBorder(c, g2d, 0, 0, width,
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.border.Border#paintBorder(java.awt.Component,
	 * java.awt.Graphics, int, int, int, int)
	 */
	public void paintBorder(Component c, Graphics g, int x, int y, int width,
			int height) {
		paintBorder((JComponent) c, g, x, y, width, height, c.isEnabled(), c
				.hasFocus());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.border.Border#getBorderInsets(java.awt.Component)
	 */
	public Insets getBorderInsets(Component c) {
		return this.myInsets;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.border.Border#isBorderOpaque()
	 */
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
