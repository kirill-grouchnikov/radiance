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
package org.pushingpixels.radiance.theming.internal.utils.border;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeDrawingUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import javax.swing.border.Border;
import javax.swing.plaf.UIResource;
import java.awt.*;

/**
 * Gradient border for the <b>Radiance</b> look and feel. This class is <b>for
 * internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceBorder implements Border, UIResource {
	/**
	 * Insets of <code>this</code> border.
	 */
	protected Insets myInsets;

	/**
	 * Border alpha.
	 */
	protected float alpha;

	/**
	 * When the border is painted, the default radius is multiplied by this
	 * factor.
	 */
	protected float radiusScaleFactor;

	/**
	 * Creates a new border with dynamic insets (computed at the invocation time
	 * of {@link #getBorderInsets(Component)} call).
	 */
	public RadianceBorder() {
		super();
		this.alpha = 1.0f;
		this.radiusScaleFactor = 0.5f;
	}

	/**
	 * Creates a new border with the specified insets.
	 * 
	 * @param insets
	 *            Insets.
	 */
	public RadianceBorder(Insets insets) {
		this();
		this.myInsets = new Insets(insets.top, insets.left, insets.bottom,
				insets.right);
	}
	
	public RadianceBorder(float radiusScaleFactor, Insets insets) {
		this();
		this.radiusScaleFactor = radiusScaleFactor;
		this.myInsets = new Insets(insets.top, insets.left, insets.bottom, insets.right);
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
	 * @param alpha
	 *            Alpha value.
	 */
	private void paintBorder(Component c, Graphics g, int x, int y, int width,
			int height, boolean isEnabled, float alpha) {
		// failsafe for LAF change
		if (!RadianceCoreUtilities.isCurrentLookAndFeel()) {
			return;
		}

		if ((width <= 0) || (height <= 0))
			return;

		if (alpha == 0.0f) {
			return;
		}

		Graphics2D graphics = (Graphics2D) g.create();

		ComponentState state = isEnabled ? ComponentState.ENABLED : ComponentState.DISABLED_UNSELECTED;
		RadianceColorScheme borderColorScheme = RadianceColorSchemeUtilities
				.getColorScheme(c, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, state);

		float finalAlpha = alpha * RadianceColorSchemeUtilities.getAlpha(c, state);
		graphics.setComposite(WidgetUtilities.getAlphaComposite(c, finalAlpha, g));

		float baseRadius = this.radiusScaleFactor *
				RadianceSizeUtils.getClassicButtonCornerRadius(RadianceSizeUtils.getComponentFontSize(c));
		BladeDrawingUtils.paintBladeBorder(c, graphics, x, y, width, height, baseRadius,
				borderColorScheme);

		graphics.dispose();
	}

	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width,
			int height) {
		paintBorder(c, g, x, y, width, height, c.isEnabled(), this.alpha);
	}

	@Override
	public Insets getBorderInsets(Component c) {
		if (this.myInsets == null) {
			return RadianceSizeUtils.getDefaultBorderInsets(RadianceSizeUtils.getComponentFontSize(c));
		}
		return this.myInsets;
	}

	@Override
	public boolean isBorderOpaque() {
		return false;
	}

	/**
	 * Returns the radius scale factor of this border.
	 * 
	 * @return The radius scale factor of this border.
	 */
	public float getRadiusScaleFactor() {
		return this.radiusScaleFactor;
	}
}
