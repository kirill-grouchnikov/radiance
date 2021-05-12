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
package org.pushingpixels.substance.internal.painter;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Collection;

/**
 * Contains utility methods related to painting separators. This class is for
 * internal use only.
 * 
 * @author Kirill Grouchnikov
 */
public class SeparatorPainterUtils {
	/**
	 * Cached images of separators.
	 */
	private static LazyResettableHashMap<BufferedImage> cached =
			new LazyResettableHashMap<>("SeparatorPainterUtils");

	/**
	 * Paints a separator.
	 * 
	 * @param c
	 *            Component.
	 * @param graphics
	 *            Graphics context.
	 * @param width
	 *            Separator width.
	 * @param height
	 *            Separator height.
	 * @param orientation
	 *            Separator orientation.
	 */
	public static void paintSeparator(Component c, Graphics graphics, int width, int height,
			int orientation) {
		paintSeparator(c, graphics, width, height, orientation, true, 10);
	}

	/**
	 * Paints a separator.
	 * 
	 * @param c
	 *            Component.
	 * @param graphics
	 *            Graphics context.
	 * @param width
	 *            Separator width.
	 * @param height
	 *            Separator height.
	 * @param orientation
	 *            Separator orientation.
	 * @param hasShadow
	 *            If <code>true</code>, the separator painting will have shadow.
	 * @param maxGradLength
	 *            Specifies the maximum pixel length of "ramp" portions of the
	 *            separator. The ramp portions are located on separator ends and
	 *            allow providing a faded appearance on those ends.
	 */
	public static void paintSeparator(Component c, Graphics graphics, int width, int height,
			int orientation, boolean hasShadow, int maxGradLength) {
		paintSeparator(c, graphics, width, height, orientation, hasShadow, maxGradLength,
				maxGradLength, false);
	}

	/**
	 * Paints a separator.
	 * 
	 * @param c
	 *            Component.
	 * @param g
	 *            Graphics context.
	 * @param width
	 *            Separator width.
	 * @param height
	 *            Separator height.
	 * @param orientation
	 *            Separator orientation.
	 * @param hasShadow
	 *            If <code>true</code>, the separator painting will have shadow.
	 * @param maxGradLengthStart
	 *            Specifies the maximum pixel length of the starting "ramp"
	 *            portion of the separator. The starting ramp portion is located
	 *            on top / left separator end and allows providing a faded
	 *            appearance on that end.
	 * @param maxGradLengthEnd
	 *            Specifies the maximum pixel length of the ending "ramp"
	 *            portion of the separator. The ending ramp portion is located
	 *            on bottom / right separator end and allows providing a faded
	 *            appearance on that end.
	 * @param toEnforceAlphaColors
	 *            If <code>true</code>, the fade sequences will always use alpha
	 *            colors. This may affect the performance.
	 */
	public static void paintSeparator(Component c, Graphics g, int width, int height,
			int orientation, boolean hasShadow, int maxGradLengthStart, int maxGradLengthEnd,
			boolean toEnforceAlphaColors) {
		SubstanceColorScheme compScheme = null;
		Component parent = c.getParent();
		boolean isParentAPopup = (parent instanceof JPopupMenu) ||
				((parent instanceof JComponent) && ((JComponent) parent).getClientProperty(
						DecorationPainterUtils.POPUP_INVOKER_LINK) != null);
		if (isParentAPopup) {
			// For separators in popups, first see if we have a color
			// scheme explicitly registered for the SEPARATOR association kind.
			compScheme = SubstanceColorSchemeUtilities.getDirectColorScheme(c,
					ColorSchemeAssociationKind.SEPARATOR, ComponentState.ENABLED);
			if (compScheme == null) {
				// Then get a background color scheme associated with the
				// decoration type of that separator
				compScheme = SubstanceCoreUtilities.getSkin(c).getBackgroundColorScheme(
						ComponentOrParentChainScope.getDecorationType(c));
			}
		}
		if (compScheme == null) {
			// And finally, get the separator's color scheme via the regular
			// route that includes fall back in case there is no explicitly registered
			// color scheme for the SEPARATOR association kind.
			compScheme = SubstanceColorSchemeUtilities.getColorScheme(c,
					ColorSchemeAssociationKind.SEPARATOR, ComponentState.ENABLED);
		}

		paintSeparator(c, g, compScheme, width, height, orientation, hasShadow, maxGradLengthStart,
				maxGradLengthEnd, toEnforceAlphaColors);
	}

	/**
	 * Paints a separator.
	 * 
	 * @param c
	 *            Component.
	 * @param g
	 *            Graphics context.
	 * @param scheme
	 *            Color scheme.
	 * @param width
	 *            Separator width.
	 * @param height
	 *            Separator height.
	 * @param orientation
	 *            Separator orientation.
	 * @param hasShadow
	 *            If <code>true</code>, the separator painting will have shadow.
	 * @param maxGradLengthStart
	 *            Specifies the maximum pixel length of the starting "ramp"
	 *            portion of the separator. The starting ramp portion is located
	 *            on top / left separator end and allows providing a faded
	 *            appearance on that end.
	 * @param maxGradLengthEnd
	 *            Specifies the maximum pixel length of the ending "ramp"
	 *            portion of the separator. The ending ramp portion is located
	 *            on bottom / right separator end and allows providing a faded
	 *            appearance on that end.
	 * @param toEnforceAlphaColors
	 *            If <code>true</code>, the fade sequences will always use alpha
	 *            colors. This may affect the performance.
	 */
	public static void paintSeparator(Component c, Graphics g, SubstanceColorScheme scheme,
			int width, int height, int orientation, boolean hasShadow, int maxGradLengthStart,
			int maxGradLengthEnd, boolean toEnforceAlphaColors) {

		DecorationAreaType decorationAreaType = ComponentOrParentChainScope.getDecorationType(c);
		SubstanceSkin skin = SubstanceCoreUtilities.getSkin(c);
		// use alpha colors when the control is in a painted decoration area
		// (where skin can use different background colors) or in a decoration
		// area that has overlays.
		boolean toUseAlphaColors = ((decorationAreaType == null)
				|| (decorationAreaType == DecorationAreaType.NONE)) ? false
						: skin.isRegisteredAsDecorationArea(decorationAreaType)
								|| (skin.getOverlayPainters(decorationAreaType).size() > 0);
		toUseAlphaColors = toUseAlphaColors || toEnforceAlphaColors;

		Color backgrFill = SubstanceColorUtilities.getBackgroundFillColor(c);
		int fontSize = SubstanceSizeUtils.getComponentFontSize(c);
		float borderStrokeWidth = SubstanceSizeUtils.getBorderStrokeWidth(c);
		if ((orientation == JSeparator.HORIZONTAL) && (height == 0)) {
			height = (int) Math.ceil(2.0 * borderStrokeWidth);
		}
		if ((orientation == JSeparator.VERTICAL) && (width == 0)) {
			width = (int) Math.ceil(2.0 * borderStrokeWidth);
		}

		if ((width == 0) || (height == 0))
			return;

		double scale = NeonCortex.getScaleFactor(c);
		ImageHashMapKey key = SubstanceCoreUtilities.getScaleAwareHashKey(
				scale, fontSize, scheme.getDisplayName(), width,
				height, orientation, hasShadow, maxGradLengthStart, maxGradLengthEnd,
				toUseAlphaColors, backgrFill.getRGB());

		BufferedImage singleLine = cached.get(key);
		if (singleLine == null) {
			singleLine = SubstanceCoreUtilities.getBlankImage(scale, width, height);
			Graphics2D graphics = singleLine.createGraphics();

			Color primary = scheme.getSeparatorPrimaryColor();
			Color secondary = scheme.getSeparatorSecondaryColor();

			Color primaryZero = toUseAlphaColors
					? SubstanceColorUtilities.getAlphaColor(primary, 0)
					: SubstanceColorUtilities.getInterpolatedColor(primary, backgrFill, 0.0f);
			Color secondaryZero = toUseAlphaColors
					? SubstanceColorUtilities.getAlphaColor(secondary, 0)
					: SubstanceColorUtilities.getInterpolatedColor(secondary, backgrFill, 0.0f);
			graphics.setStroke(new BasicStroke(borderStrokeWidth, BasicStroke.CAP_BUTT,
					BasicStroke.JOIN_ROUND));
			if (orientation == JSeparator.VERTICAL) {
				int gradStart = Math.min(maxGradLengthStart, height / 2);
				int gradEnd = Math.min(maxGradLengthEnd, height / 2);
				float gradStartFraction = (float) gradStart / height;
				float gradEndFraction = (float) (height - gradEnd) / height;
				float regularX = Math.max(0, width / 2.0f - borderStrokeWidth);

				// Dynamically create the array of stop fractions and corresponding
				// colors. If the start fraction is 0, we need to skip the 0-opacity
				// first stop, as identical fractions in LinearGradientPaint lead to
				// a crash. The same applies to end fraction 0, and identical start
				// and end fraction values
				int stopsCount = ((gradStartFraction > 0.0f) ? 1 : 0) + 1 +
						((gradEndFraction > gradStartFraction) ? 1 : 0) +
						((gradEndFraction < 1.0f) ? 1 : 0);
				float[] stops = new float[stopsCount];
				Color[] colors = new Color[stopsCount];
				int stopIndex = 0;
				if (gradStartFraction > 0.0f) {
					stops[stopIndex] = 0.0f;
					colors[stopIndex] = primaryZero;
					stopIndex++;
				}
				stops[stopIndex] = gradStartFraction;
				colors[stopIndex] = primary;
				stopIndex++;
				if (gradEndFraction > gradStartFraction) {
					stops[stopIndex] = gradEndFraction;
					colors[stopIndex] = primary;
					stopIndex++;
				}
				if (gradEndFraction < 1.0f) {
					stops[stopIndex] = 1.0f;
					colors[stopIndex] = primaryZero;
				}

				LinearGradientPaint primaryPaint = new LinearGradientPaint(0, 0, 0, height,
						stops, colors);
				graphics.setPaint(primaryPaint);
				graphics.draw(new Line2D.Float(regularX, 0, regularX, height));

				if (hasShadow) {
					float shadowX = regularX + borderStrokeWidth;

					stopIndex = 0;
					if (gradStartFraction > 0.0f) {
						stops[stopIndex] = 0.0f;
						colors[stopIndex] = secondaryZero;
						stopIndex++;
					}
					stops[stopIndex] = gradStartFraction;
					colors[stopIndex] = secondary;
					stopIndex++;
					if (gradEndFraction > gradStartFraction) {
						stops[stopIndex] = gradEndFraction;
						colors[stopIndex] = secondary;
						stopIndex++;
					}
					if (gradEndFraction < 1.0f) {
						stops[stopIndex] = 1.0f;
						colors[stopIndex] = secondaryZero;
					}

					LinearGradientPaint secondaryPaint = new LinearGradientPaint(0, 0, 0, height,
							stops, colors);
					graphics.setPaint(secondaryPaint);
					graphics.draw(new Line2D.Float(shadowX, 0, shadowX, height));
				}
			} else {
				// HORIZONTAL
				int gradStart = Math.min(maxGradLengthStart, width / 2);
				int gradEnd = Math.min(maxGradLengthEnd, width / 2);
				graphics.translate(0, Math.max(0, height / 2 - 1));

				float gradStartFraction = (float) gradStart / width;
				float gradEndFraction = (float) (width - gradEnd) / width;
				float regularY = Math.max(0, height / 2.0f - borderStrokeWidth);

				// Dynamically create the array of stop fractions and corresponding
				// colors. If the start fraction is 0, we need to skip the 0-opacity
				// first stop, as identical fractions in LinearGradientPaint lead to
				// a crash. The same applies to end fraction 0, and identical start
				// and end fraction values
				int stopsCount = ((gradStartFraction > 0.0f) ? 1 : 0) + 1 +
						((gradEndFraction > gradStartFraction) ? 1 : 0) +
						((gradEndFraction < 1.0f) ? 1 : 0);
				float[] stops = new float[stopsCount];
				Color[] colors = new Color[stopsCount];
				int stopIndex = 0;
				if (gradStartFraction > 0.0f) {
					stops[stopIndex] = 0.0f;
					colors[stopIndex] = primaryZero;
					stopIndex++;
				}
				stops[stopIndex] = gradStartFraction;
				colors[stopIndex] = primary;
				stopIndex++;
				if (gradEndFraction > gradStartFraction) {
					stops[stopIndex] = gradEndFraction;
					colors[stopIndex] = primary;
					stopIndex++;
				}
				if (gradEndFraction < 1.0f) {
					stops[stopIndex] = 1.0f;
					colors[stopIndex] = primaryZero;
				}

				LinearGradientPaint primaryPaint = new LinearGradientPaint(0, 0, width, 0,
						stops, colors);
				graphics.setPaint(primaryPaint);
				graphics.draw(new Line2D.Float(0, regularY, width, regularY));

				if (hasShadow) {
					float shadowY = regularY + borderStrokeWidth;

					stopIndex = 0;
					if (gradStartFraction > 0.0f) {
						stops[stopIndex] = 0.0f;
						colors[stopIndex] = secondaryZero;
						stopIndex++;
					}
					stops[stopIndex] = gradStartFraction;
					colors[stopIndex] = secondary;
					stopIndex++;
					if (gradEndFraction > gradStartFraction) {
						stops[stopIndex] = gradEndFraction;
						colors[stopIndex] = secondary;
						stopIndex++;
					}
					if (gradEndFraction < 1.0f) {
						stops[stopIndex] = 1.0f;
						colors[stopIndex] = secondaryZero;
					}

					LinearGradientPaint secondaryPaint = new LinearGradientPaint(0, 0, width, 0,
							stops, colors);
					graphics.setPaint(secondaryPaint);
					graphics.draw(new Line2D.Float(0, shadowY, width, shadowY));
				}
			}
			graphics.dispose();
			cached.put(key, singleLine);
		}

		Graphics2D g2d = (Graphics2D) g.create();
		NeonCortex.drawImageWithScale(g2d, scale, singleLine, 0, 0);
		g2d.dispose();
	}

	/**
	 * Paints vertical separator lines.
	 * 
	 * @param g
	 *            Graphics context.
	 * @param c
	 *            Component.
	 * @param scheme
	 *            Color scheme for painting the vertical separator lines.
	 * @param y
	 *            The top Y coordinate of the lines.
	 * @param x
	 *            The X coordinates of the lines.
	 * @param height
	 *            The height of the lines.
	 * @param fadeStartFraction
	 *            The start fraction of the fade out sequence.
	 */
	public static void paintVerticalLines(Graphics g, Component c, SubstanceColorScheme scheme,
			int y, Collection<Integer> x, int height, float fadeStartFraction) {
		int componentFontSize = SubstanceSizeUtils.getComponentFontSize(c);
		Color backgrFill = SubstanceColorUtilities.getBackgroundFillColor(c);

		double scale = NeonCortex.getScaleFactor(c);
		ImageHashMapKey key = SubstanceCoreUtilities.getScaleAwareHashKey(
				scale, componentFontSize,
				scheme.getDisplayName(), 0, height, SwingConstants.VERTICAL, true, 0.0,
				fadeStartFraction, backgrFill.getRGB());

		float borderStrokeWidth = SubstanceSizeUtils.getBorderStrokeWidth(c);
		BufferedImage singleLine = cached.get(key);
		if (singleLine == null) {
			singleLine = SubstanceCoreUtilities.getBlankImage(scale,
					Math.max(2, (int) Math.ceil(2.0 * borderStrokeWidth)), height);
			Graphics2D graphics = singleLine.createGraphics();

			Color primary = scheme.getSeparatorPrimaryColor();
			Color secondary = scheme.getSeparatorSecondaryColor();

			graphics.setStroke(new BasicStroke(borderStrokeWidth, BasicStroke.CAP_BUTT,
					BasicStroke.JOIN_ROUND));
			Color primaryZero = SubstanceColorUtilities.getInterpolatedColor(
					primary, backgrFill, 0.0f);
			Color secondaryZero = SubstanceColorUtilities.getInterpolatedColor(
					secondary, backgrFill, 0.0f);

			LinearGradientPaint forePaint = new LinearGradientPaint(0, 0, 0, height,
					new float[] { 0.0f, fadeStartFraction, 1.0f },
					new Color[] { primary, primary, primaryZero });
			graphics.setPaint(forePaint);
			graphics.translate(borderStrokeWidth / 2, 0);
			graphics.draw(
					new Line2D.Float(borderStrokeWidth / 2, 0, borderStrokeWidth / 2, height));

			LinearGradientPaint backPaint = new LinearGradientPaint(0, 0, 0, height,
					new float[] { 0.0f, fadeStartFraction, 1.0f },
					new Color[] { secondary, secondary, secondaryZero });
			graphics.setPaint(backPaint);
			graphics.draw(new Line2D.Float(3 * borderStrokeWidth / 2, 0, 3 * borderStrokeWidth / 2,
					height));

			graphics.dispose();
			cached.put(key, singleLine);
		}

		Graphics2D g2d = (Graphics2D) g.create();
		for (int lineX : x) {
			NeonCortex.drawImageWithScale(g2d, scale, singleLine, lineX, y);
		}
		g2d.dispose();
	}

	/**
	 * Paints horizontal separator lines.
	 * 
	 * @param g
	 *            Graphics context.
	 * @param c
	 *            Component.
	 * @param scheme
	 *            Color scheme for painting the horizontal separator lines.
	 * @param x
	 *            The left X coordinate of the lines.
	 * @param y
	 *            The Y coordinates of the lines.
	 * @param width
	 *            The width of the lines.
	 * @param fadeStartFraction
	 *            The start fraction of the fade out sequence.
	 * @param isLtr
	 *            If <code>true</code>, the lines are left-to-right and the fade
	 *            out is on the right side. Otherwise, the fade out is on the
	 *            left side.
	 */
	public static void paintHorizontalLines(Graphics g, Component c, SubstanceColorScheme scheme,
			int x, Collection<Integer> y, int width, float fadeStartFraction, boolean isLtr) {
		int componentFontSize = SubstanceSizeUtils.getComponentFontSize(c);
		Color backgrFill = SubstanceColorUtilities.getBackgroundFillColor(c);

		double scale = NeonCortex.getScaleFactor(c);
		ImageHashMapKey key = SubstanceCoreUtilities.getScaleAwareHashKey(
				scale, componentFontSize,
				scheme.getDisplayName(), width, 0, SwingConstants.VERTICAL, true, 0.0,
				fadeStartFraction, isLtr, backgrFill.getRGB());

		float borderStrokeWidth = SubstanceSizeUtils.getBorderStrokeWidth(c);
		BufferedImage singleLine = cached.get(key);
		if (singleLine == null) {
			singleLine = SubstanceCoreUtilities.getBlankImage(scale,
					width, Math.max(2, (int) Math.ceil(2.0 * borderStrokeWidth)));
			Graphics2D graphics = singleLine.createGraphics();

			Color primary = scheme.getSeparatorPrimaryColor();
			Color secondary = scheme.getSeparatorSecondaryColor();

			graphics.setStroke(new BasicStroke(borderStrokeWidth, BasicStroke.CAP_BUTT,
					BasicStroke.JOIN_ROUND));
			Color primaryZero = SubstanceColorUtilities.getInterpolatedColor(
					primary, backgrFill, 0.0f);
			Color secondaryZero = SubstanceColorUtilities.getInterpolatedColor(
					secondary, backgrFill, 0.0f);

			LinearGradientPaint forePaint = new LinearGradientPaint(0, 0, width, 0,
					new float[] { 0.0f, fadeStartFraction, 1.0f },
					new Color[] { isLtr ? primary : primaryZero, primary,
							isLtr ? primaryZero : primary });
			graphics.setPaint(forePaint);
			graphics.draw(new Line2D.Float(0, borderStrokeWidth / 2, width, borderStrokeWidth / 2));

			LinearGradientPaint backPaint = new LinearGradientPaint(0, 9, width, 0,
					new float[] { 0.0f, fadeStartFraction, 1.0f },
					new Color[] { isLtr ? secondary : secondaryZero, secondary,
							isLtr ? secondaryZero : secondary });
			graphics.setPaint(backPaint);
			graphics.draw(new Line2D.Float(0, 3 * borderStrokeWidth / 2, width,
					3 * borderStrokeWidth / 2));

			graphics.dispose();
			cached.put(key, singleLine);
		}

		Graphics2D g2d = (Graphics2D) g.create();
		for (int lineY : y) {
			NeonCortex.drawImageWithScale(g2d, scale, singleLine, x, lineY);
		}
		g2d.dispose();
	}
}
