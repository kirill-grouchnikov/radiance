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
package org.pushingpixels.radiance.theming.internal.utils.border;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeDrawingUtils;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.ui.RadianceTableUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.UIResource;
import java.awt.*;

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
	private BladeColorScheme mutableBorderColorScheme = new BladeColorScheme();

	/**
	 * Creates a new border with the specified insets.
	 * 
	 * @param insets
	 *            Insets.
	 */
	public RadianceTableCellBorder(Insets insets, RadianceTableUI ui,
			RadianceTableUI.TableCellId cellId) {
		this.myInsets = new Insets(insets.top, insets.left, insets.bottom, insets.right);
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

		float radius = 0.0f;
		StateTransitionTracker stateTransitionTracker = ui.getStateTransitionTracker(cellId);
		StateTransitionTracker.ModelStateInfo modelStateInfo =
				(stateTransitionTracker == null) ? null : stateTransitionTracker.getModelStateInfo();
		ComponentState currState =
				(modelStateInfo == null) ? ui.getCellState(cellId) : modelStateInfo.getCurrModelState();
		if (currState.isDisabled()) {
			currState = ComponentState.DISABLED_SELECTED;
		}

		BladeUtils.populateColorScheme(mutableBorderColorScheme, c,
				modelStateInfo, currState,
				RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(c),
				RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
				false);
		BladeDrawingUtils.paintBladeBorder(c, graphics, x, y, width, height, radius,
				mutableBorderColorScheme);
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
