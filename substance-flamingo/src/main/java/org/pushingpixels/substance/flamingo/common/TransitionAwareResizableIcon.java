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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.substance.flamingo.common;

import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Map;

import javax.swing.JComponent;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.icon.TransitionAware;

/**
 * Icon with transition-aware capabilities. Has a delegate that does the actual
 * painting based on the transition themes. 
 * 
 * @author Kirill Grouchnikov
 */
@TransitionAware
public class TransitionAwareResizableIcon implements ResizableIcon {
	/**
	 * The width of the rendered image.
	 */
	protected int width;

	/**
	 * The height of the rendered image.
	 */
	protected int height;

	/**
	 * The delegate needs to implement the method in this interface based on the
	 * provided theme. The theme is computed based on the transitions that are
	 * happening on the associated control.
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static interface Delegate {
		/**
		 * Returns the icon that matches the specified theme.
		 * 
		 * @param scheme
		 *            Color scheme.
		 * @param width
		 *            Icon width.
		 * @param height
		 *            Icon height.
		 * @return Icon that matches the specified theme.
		 */
		public SubstanceIconUIResource getColorSchemeIcon(SubstanceColorScheme scheme, int width,
				int height);
	}

	/**
	 * The associated component.
	 */
	private JComponent comp;

	private StateTransitionTrackerDelegate stateTransitionTrackerDelegate;

	/**
	 * Delegate to compute the actual icons.
	 */
	private Delegate delegate;

	/**
	 * Icon cache to speed up the subsequent icon painting. The basic assumption
	 * is that the {@link #delegate} returns an icon that paints the same for
	 * the same parameters.
	 */
	private LazyResettableHashMap<SubstanceIconUIResource> iconMap;

	public static interface StateTransitionTrackerDelegate {
		public StateTransitionTracker getStateTransitionTracker();
	}

	/**
	 * Creates a new transition-aware icon.
	 * 
	 * @param button
	 *            Associated command button.
	 * @param buttonModel
	 *            Associated model.
	 * @param extraModelKey
	 *            Extra model key.
	 * @param delegate
	 *            Delegate to compute the actual icons.
	 * @param initialDim
	 *            Initial icon dimension.
	 */
	public TransitionAwareResizableIcon(AbstractCommandButton button,
			StateTransitionTrackerDelegate stateTransitionTrackerDelegate,
			Delegate delegate, Dimension initialDim) {
		this.comp = button;
		this.stateTransitionTrackerDelegate = stateTransitionTrackerDelegate;
		this.delegate = delegate;
		this.iconMap = new LazyResettableHashMap<SubstanceIconUIResource>(
				"TransitionAwareResizableIcon");
		this.width = initialDim.width;
		this.height = initialDim.height;
	}

	/**
	 * Returns the current icon to paint.
	 * 
	 * @return Icon to paint.
	 */
	private SubstanceIconUIResource getIconToPaint() {
		StateTransitionTracker stateTransitionTracker = this.stateTransitionTrackerDelegate
				.getStateTransitionTracker();

		StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
				.getModelStateInfo();
		Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
				.getStateContributionMap();

		ComponentState currState = modelStateInfo.getCurrModelState();

		SubstanceColorScheme baseScheme = SubstanceColorSchemeUtilities
				.getColorScheme(this.comp, ColorSchemeAssociationKind.MARK,
						currState);
		float baseAlpha = SubstanceColorSchemeUtilities.getAlpha(this.comp,
				currState);

		HashMapKey keyBase = SubstanceCoreUtilities.getHashKey(baseScheme
				.getDisplayName(), baseAlpha, this.width, this.height);
		// System.out.println(key);
		SubstanceIconUIResource layerBase = this.iconMap.get(keyBase);
		if (layerBase == null) {
		    SubstanceIconUIResource baseFullOpacity = this.delegate.getColorSchemeIcon(baseScheme,
					width, height);
			if (baseAlpha == 1.0f) {
				layerBase = baseFullOpacity;
				iconMap.put(keyBase, layerBase);
			} else {
				BufferedImage baseImage = SubstanceCoreUtilities.getBlankImage(
						baseFullOpacity.getIconWidth(), baseFullOpacity
								.getIconHeight());
				Graphics2D g2base = baseImage.createGraphics();
				g2base.setComposite(AlphaComposite.SrcOver.derive(baseAlpha));
				baseFullOpacity.paintIcon(this.comp, g2base, 0, 0);
				g2base.dispose();
				layerBase = new SubstanceIconUIResource(baseImage);
				iconMap.put(keyBase, layerBase);
			}
		}
		if (currState.isDisabled() || (activeStates.size() == 1)) {
			return layerBase;
		}

		BufferedImage result = SubstanceCoreUtilities.getBlankImage(layerBase
				.getIconWidth(), layerBase.getIconHeight());
		Graphics2D g2d = result.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

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
				g2d.setComposite(AlphaComposite.SrcOver
						.derive(stateContribution));

				SubstanceColorScheme scheme = SubstanceColorSchemeUtilities
						.getColorScheme(this.comp,
								ColorSchemeAssociationKind.MARK, activeState);
				float alpha = SubstanceColorSchemeUtilities.getAlpha(this.comp,
						activeState);

				HashMapKey key = SubstanceCoreUtilities.getHashKey(scheme
						.getDisplayName(), alpha, this.width, this.height);
				SubstanceIconUIResource layer = iconMap.get(key);
				if (layer == null) {
				    SubstanceIconUIResource fullOpacity = this.delegate.getColorSchemeIcon(scheme,
							width, height);
					if (alpha == 1.0f) {
						layer = fullOpacity;
						iconMap.put(key, layer);
					} else {
						BufferedImage image = SubstanceCoreUtilities
								.getBlankImage(fullOpacity.getIconWidth(),
										fullOpacity.getIconHeight());
						Graphics2D g2layer = image.createGraphics();
						g2layer.setComposite(AlphaComposite.SrcOver
								.derive(alpha));
						fullOpacity.paintIcon(this.comp, g2layer, 0, 0);
						g2layer.dispose();
						layer = new SubstanceIconUIResource(image);
						iconMap.put(key, layer);
					}
				}
				layer.paintIcon(this.comp, g2d, 0, 0);
			}
		}
		g2d.dispose();
		return new SubstanceIconUIResource(result);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
	public void paintIcon(Component c, Graphics g, int x, int y) {
		this.getIconToPaint().paintIcon(c, g, x, y);
	}

	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

	public int getIconHeight() {
		return this.height;
	}

	public int getIconWidth() {
		return this.width;
	}
}
