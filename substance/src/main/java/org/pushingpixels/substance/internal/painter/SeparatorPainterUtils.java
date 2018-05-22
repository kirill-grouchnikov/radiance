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
package org.pushingpixels.substance.internal.painter;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.Collection;

import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

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
	private static LazyResettableHashMap<BufferedImage> cached = new LazyResettableHashMap<BufferedImage>(
			"SeparatorPainterUtils");

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
				// decoration type
				// of that separator
				compScheme = SubstanceCoreUtilities.getSkin(c)
						.getBackgroundColorScheme(ComponentOrParentChainScope.getDecorationType(c));
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
		float borderStrokeWidth = SubstanceSizeUtils.getBorderStrokeWidth();
		if ((orientation == JSeparator.HORIZONTAL) && (height == 0)) {
			height = (int) Math.ceil(2.0 * borderStrokeWidth);
		}
		if ((orientation == JSeparator.VERTICAL) && (width == 0)) {
			width = (int) Math.ceil(2.0 * borderStrokeWidth);
		}

		if ((width == 0) || (height == 0))
			return;

		HashMapKey key = SubstanceCoreUtilities.getHashKey(fontSize, scheme.getDisplayName(), width,
				height, orientation, hasShadow, maxGradLengthStart, maxGradLengthEnd,
				toUseAlphaColors, backgrFill.getRGB());

		BufferedImage singleLine = cached.get(key);
		if (singleLine == null) {
			singleLine = SubstanceCoreUtilities.getBlankImage(width, height);
			Graphics2D graphics = singleLine.createGraphics();

			Color foreLight = getSeparatorLightColor(scheme);
			Color foreDark = getSeparatorDarkColor(scheme);
			Color back = getSeparatorShadowColor(scheme);

			Color foreLight12 = toUseAlphaColors
					? SubstanceColorUtilities.getAlphaColor(foreLight, 32)
					: SubstanceColorUtilities.getInterpolatedColor(foreLight, backgrFill, 0.12f);
			Color foreDark95 = toUseAlphaColors
					? SubstanceColorUtilities.getAlphaColor(foreDark, 240)
					: SubstanceColorUtilities.getInterpolatedColor(foreDark, backgrFill, 0.95f);
			Color back12 = toUseAlphaColors ? SubstanceColorUtilities.getAlphaColor(back, 32)
					: SubstanceColorUtilities.getInterpolatedColor(back, backgrFill, 0.12f);
			Color back95 = toUseAlphaColors ? SubstanceColorUtilities.getAlphaColor(back, 240)
					: SubstanceColorUtilities.getInterpolatedColor(back, backgrFill, 0.95f);
			graphics.setStroke(new BasicStroke(borderStrokeWidth, BasicStroke.CAP_BUTT,
					BasicStroke.JOIN_ROUND));
			if (orientation == JSeparator.VERTICAL) {
				int gradStart = Math.min(maxGradLengthStart, height / 2);
				int gradEnd = Math.min(maxGradLengthEnd, height / 2);
				float regularX = Math.max(0, width / 2.0f - borderStrokeWidth);
				graphics.setPaint(new GradientPaint(0, 0, foreLight12, 0, gradStart, foreDark95));
				graphics.draw(new Line2D.Float(regularX, 0, regularX, gradStart));
				graphics.setColor(foreDark95);
				graphics.draw(new Line2D.Float(regularX, gradStart, regularX, height - gradEnd));
				graphics.setPaint(
						new GradientPaint(0, height - gradEnd, foreDark95, 0, height, foreLight12));
				graphics.draw(new Line2D.Float(regularX, height - gradEnd, regularX, height));

				if (hasShadow) {
					float shadowX = regularX + borderStrokeWidth;
					graphics.setPaint(new GradientPaint(0, 0, back12, 0, gradStart, back95));
					graphics.draw(new Line2D.Float(shadowX, 0, shadowX, gradStart));
					graphics.setColor(back95);
					graphics.draw(new Line2D.Float(shadowX, gradStart, shadowX, height - gradEnd));
					graphics.setPaint(
							new GradientPaint(0, height - gradEnd, back95, 0, height, back12));
					graphics.draw(new Line2D.Float(shadowX, height - gradEnd, shadowX, height));
				}
			} else {
				// HORIZONTAL
				int gradStart = Math.min(maxGradLengthStart, width / 2);
				int gradEnd = Math.min(maxGradLengthEnd, width / 2);
				graphics.translate(0, Math.max(0, height / 2 - 1));
				float regularY = Math.max(0, height / 2.0f - borderStrokeWidth);
				graphics.setPaint(new GradientPaint(0, 0, foreLight12, gradStart, 0, foreDark95));
				graphics.draw(new Line2D.Float(0, regularY, gradStart, regularY));
				graphics.setColor(foreDark95);
				graphics.draw(new Line2D.Float(gradStart, regularY, width - gradEnd, regularY));
				graphics.setPaint(
						new GradientPaint(width - gradEnd, 0, foreDark95, width, 0, foreLight12));
				graphics.draw(new Line2D.Float(width - gradEnd, regularY, width, regularY));

				if (hasShadow) {
					float shadowY = regularY + borderStrokeWidth;
					graphics.setPaint(new GradientPaint(0, 0, back12, gradStart, 0, back95));
					graphics.draw(new Line2D.Float(0, shadowY, gradStart, shadowY));
					graphics.setColor(back95);
					graphics.draw(new Line2D.Float(gradStart, shadowY, width - gradEnd, shadowY));
					graphics.setPaint(
							new GradientPaint(width - gradEnd, 0, back95, width, 0, back12));
					graphics.draw(new Line2D.Float(width - gradEnd, shadowY, width, shadowY));
				}
			}
			graphics.dispose();
			cached.put(key, singleLine);
		}

		Graphics2D g2d = (Graphics2D) g.create();
		double scaleFactor = UIUtil.getScaleFactor();
		g2d.drawImage(singleLine, 0, 0, (int) (singleLine.getWidth() / scaleFactor),
		        (int) (singleLine.getHeight() / scaleFactor), null);
		g2d.dispose();
	}

	public static Color getSeparatorShadowColor(SubstanceColorScheme scheme) {
		return scheme.isDark() ? scheme.getDarkColor() : scheme.getUltraLightColor();
	}

	public static Color getSeparatorDarkColor(SubstanceColorScheme scheme) {
		return scheme.isDark() ? scheme.getExtraLightColor()
				: SubstanceColorUtilities.getInterpolatedColor(scheme.getMidColor(),
						scheme.getDarkColor(), 0.4f);
	}

	public static Color getSeparatorLightColor(SubstanceColorScheme scheme) {
		return scheme.isDark() ? scheme.getLightColor()
				: SubstanceColorUtilities.getInterpolatedColor(scheme.getLightColor(),
						scheme.getDarkColor(), 0.8f);
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

		HashMapKey key = SubstanceCoreUtilities.getHashKey(componentFontSize,
				scheme.getDisplayName(), 0, height, SwingConstants.VERTICAL, true, 0.0,
				fadeStartFraction, backgrFill.getRGB());

		float borderStrokeWidth = SubstanceSizeUtils.getBorderStrokeWidth();
		BufferedImage singleLine = cached.get(key);
		if (singleLine == null) {
			singleLine = SubstanceCoreUtilities
					.getBlankImage(Math.max(2, (int) Math.ceil(2.0 * borderStrokeWidth)), height);
			Graphics2D graphics = singleLine.createGraphics();

			Color foreLight = getSeparatorLightColor(scheme);
			Color foreDark = getSeparatorDarkColor(scheme);
			Color back = getSeparatorShadowColor(scheme);

			graphics.setStroke(new BasicStroke(borderStrokeWidth, BasicStroke.CAP_BUTT,
					BasicStroke.JOIN_ROUND));
			Color foreLight12 = SubstanceColorUtilities.getInterpolatedColor(foreLight, backgrFill,
					0.12f);
			Color foreDark95 = SubstanceColorUtilities.getInterpolatedColor(foreDark, backgrFill,
					0.95f);
			Color back12 = SubstanceColorUtilities.getInterpolatedColor(back, backgrFill, 0.12f);
			Color back95 = SubstanceColorUtilities.getInterpolatedColor(back, backgrFill, 0.95f);

			LinearGradientPaint forePaint = new LinearGradientPaint(0, 0, 0, height,
					new float[] { 0.0f, fadeStartFraction, 1.0f },
					new Color[] { foreDark95, foreDark95, foreLight12 });
			graphics.setPaint(forePaint);
			graphics.translate(borderStrokeWidth / 2, 0);
			graphics.draw(
					new Line2D.Float(borderStrokeWidth / 2, 0, borderStrokeWidth / 2, height));

			LinearGradientPaint backPaint = new LinearGradientPaint(0, 0, 0, height,
					new float[] { 0.0f, fadeStartFraction, 1.0f },
					new Color[] { back95, back95, back12 });
			graphics.setPaint(backPaint);
			graphics.draw(new Line2D.Float(3 * borderStrokeWidth / 2, 0, 3 * borderStrokeWidth / 2,
					height));

			graphics.dispose();
			cached.put(key, singleLine);
		}

		Graphics2D g2d = (Graphics2D) g.create();
		double scaleFactor = UIUtil.getScaleFactor();
		for (int lineX : x) {
			g2d.drawImage(singleLine, lineX, y, (int) (singleLine.getWidth() / scaleFactor),
			        (int) (singleLine.getHeight() / scaleFactor), null);
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

		HashMapKey key = SubstanceCoreUtilities.getHashKey(componentFontSize,
				scheme.getDisplayName(), width, 0, SwingConstants.VERTICAL, true, 0.0,
				fadeStartFraction, isLtr, backgrFill.getRGB());

		float borderStrokeWidth = SubstanceSizeUtils.getBorderStrokeWidth();
		BufferedImage singleLine = cached.get(key);
		if (singleLine == null) {
			singleLine = SubstanceCoreUtilities.getBlankImage(width,
					Math.max(2, (int) Math.ceil(2.0 * borderStrokeWidth)));
			Graphics2D graphics = singleLine.createGraphics();

			Color foreLight = getSeparatorLightColor(scheme);
			Color foreDark = getSeparatorDarkColor(scheme);
			Color back = getSeparatorShadowColor(scheme);

			graphics.setStroke(new BasicStroke(borderStrokeWidth, BasicStroke.CAP_BUTT,
					BasicStroke.JOIN_ROUND));
			Color foreLight12 = SubstanceColorUtilities.getInterpolatedColor(foreLight, backgrFill,
					0.12f);
			Color foreDark95 = SubstanceColorUtilities.getInterpolatedColor(foreDark, backgrFill,
					0.95f);
			Color back12 = SubstanceColorUtilities.getInterpolatedColor(back, backgrFill, 0.12f);
			Color back95 = SubstanceColorUtilities.getInterpolatedColor(back, backgrFill, 0.95f);

			LinearGradientPaint forePaint = new LinearGradientPaint(0, 0, width, 0,
					new float[] { 0.0f, fadeStartFraction, 1.0f },
					new Color[] { isLtr ? foreDark95 : foreLight12, foreDark95,
							isLtr ? foreLight12 : foreDark95 });
			graphics.setPaint(forePaint);
			graphics.draw(new Line2D.Float(0, borderStrokeWidth / 2, width, borderStrokeWidth / 2));

			LinearGradientPaint backPaint = new LinearGradientPaint(0, 9, width, 0,
					new float[] { 0.0f, fadeStartFraction, 1.0f },
					new Color[] { isLtr ? back95 : back12, back95, isLtr ? back12 : back95 });
			graphics.setPaint(backPaint);
			graphics.draw(new Line2D.Float(0, 3 * borderStrokeWidth / 2, width,
					3 * borderStrokeWidth / 2));

			graphics.dispose();
			cached.put(key, singleLine);
		}

		Graphics2D g2d = (Graphics2D) g.create();
		double scaleFactor = UIUtil.getScaleFactor();
		for (int lineY : y) {
			g2d.drawImage(singleLine, x, lineY, (int) (singleLine.getWidth() / scaleFactor),
			        (int) (singleLine.getHeight() / scaleFactor), null);
		}
		g2d.dispose();
	}
}
