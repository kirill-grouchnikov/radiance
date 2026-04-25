/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.skin;

import org.pushingpixels.ephemeral.chroma.blend.Blend;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.TokenPalette;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.RadianceDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.MatteSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.RadianceSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicComponentShaper;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceMetricsUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.util.Set;

/**
 * <code>Blueprint</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class BlueprintSkin extends RadianceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Blueprint";

	@Override
	public String getDisplayName() {
		return NAME;
	}

	private static class RectangularComponentShaper extends ClassicComponentShaper {
		private ShapeSupplier RECTANGLE_SHAPE_SUPPLIER =
			(c, width, height, insets, radiusAdjustment, scaleFactor) ->
				new Rectangle2D.Float(insets, insets, width - 2.0f * insets, height - 2.0f * insets);

		private ShapeSupplier ROUND_SHAPE_SUPPLIER =
			(c, width, height, insets, radiusAdjustment, scaleFactor) ->
				new Ellipse2D.Float(insets, insets, width - 2.0f * insets, height - 2.0f * insets);

		private ShapeSupplier DIAMOND_SHAPE_SUPPLIER =
			(c, width, height, insets, radiusAdjustment, scaleFactor) -> {
				float dimension = Math.min(width, height) - 1.0f;
				float midX = width / 2.0f - 1.0f;
				float midY = height / 2.0f - 1.0f;
				float halfSize = dimension / 2.0f - insets;

				Path2D.Float result = new Path2D.Float();
				// Starting from top, clockwise
				result.moveTo(midX, midY - halfSize);
				result.lineTo(midX + halfSize, midY);
				result.lineTo(midX, midY + halfSize);
				result.lineTo(midX - halfSize, midY);
				result.closePath();
				return result;
			};

		@Override
		public String getDisplayName() {
			return "Classic";
		}

		@Override
		public ShapeSupplier getButtonShapeSupplier() {
			return RECTANGLE_SHAPE_SUPPLIER;
		}

		@Override
		public Dimension getButtonPreferredSize(AbstractButton button) {
			Dimension result = RadianceMetricsUtilities.getPreferredButtonSize(button);
			boolean toTweakWidth = false;
			boolean toTweakHeight = false;

			Icon icon = button.getIcon();
			boolean hasIcon = RadianceCoreUtilities.hasIcon(button);
			boolean hasText = RadianceCoreUtilities.hasText(button);
			Insets margin = button.getMargin();

			boolean hasNoMinSizeProperty = RadianceCoreUtilities.hasNoMinSizeProperty(button);
			if ((!hasNoMinSizeProperty) && hasText) {
				result = new Dimension(Math.max(result.width,
					RadianceSizeUtils.getMinButtonWidth(RadianceSizeUtils.getComponentFontSize(button))),
					result.height);
			} else {
				if (hasNoMinSizeProperty) {
					if (margin != null) {
						result = new Dimension(result.width + margin.left + margin.right,
							result.height + margin.top + margin.bottom);
					}
				}
			}

			int fontSize = RadianceSizeUtils.getComponentFontSize(button);
			int extraPadding = RadianceSizeUtils.getExtraPadding(fontSize);
			float focusPadding = RadianceSizeUtils.getFocusRingPadding(button, fontSize);
			int iconPaddingWidth = 6 + 2 * extraPadding + (int) (2 * focusPadding);
			int iconPaddingHeight = 6 + 2 * extraPadding;
			if (margin != null) {
				iconPaddingWidth = Math.max(iconPaddingWidth, margin.left + margin.right);
				iconPaddingHeight = Math.max(iconPaddingHeight, margin.top + margin.bottom);
			}
			if (hasIcon) {
				// check the icon height
				int iconHeight = icon.getIconHeight();
				if (iconHeight > (result.getHeight() - iconPaddingHeight)) {
					result = new Dimension(result.width, iconHeight);
					toTweakHeight = true;
				}
				int iconWidth = icon.getIconWidth();
				if (iconWidth > (result.getWidth() - iconPaddingWidth)) {
					result = new Dimension(iconWidth, result.height);
					toTweakWidth = true;
				}
			}

			if (RadianceCoreUtilities.isScrollBarButton(button)) {
				toTweakWidth = false;
				toTweakHeight = false;
			}

			if (toTweakWidth) {
				result = new Dimension(result.width + iconPaddingWidth, result.height);
			}
			if (toTweakHeight) {
				result = new Dimension(result.width, result.height + iconPaddingHeight);
			}

			return result;
		}

		@Override
		public Insets getBaselineInsets(Component c) {
			return new Insets(0, 0, 0, 0);
		}

		@Override
		public ShapeSupplier getBaselineShapeSupplier() {
			return RECTANGLE_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getBaselineShapeSupplier(Set<RadianceThemingSlices.Side> straightSides) {
			return RECTANGLE_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getCheckBoxShapeSupplier() {
			return RECTANGLE_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getComboBoxShapeSupplier() {
			return RECTANGLE_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getProgressBarProgressShapeSupplier(
			Set<RadianceThemingSlices.Side> straightSides) {
			return RECTANGLE_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getProgressBarTrackShapeSupplier() {
			return RECTANGLE_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getRadioButtonShapeSupplier() {
			return ROUND_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getScrollBarThumbShapeSupplier() {
			return RECTANGLE_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getSliderThumbDirectionalShapeSupplier() {
			return DIAMOND_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getSliderThumbUniformShapeSupplier() {
			return DIAMOND_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getSliderTrackShapeSupplier() {
			return RECTANGLE_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getSplitDividerBumpShapeSupplier() {
			return ROUND_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getSwitchThumbShapeSupplier() {
			return ROUND_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getSwitchTrackShapeSupplier() {
			return RECTANGLE_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getTabShapeSupplier() {
			return RECTANGLE_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getTextComponentShapeSupplier() {
			return RECTANGLE_SHAPE_SUPPLIER;
		}

		@Override
		public ShapeSupplier getTreeIconShapeSupplier() {
			return RECTANGLE_SHAPE_SUPPLIER;
		}
	}

	private static class BlueprintDecorationPainter extends RadianceDecorationPainter {
		private static final String DISPLAY_NAME = "Blueprint";

		@Override
		public String getDisplayName() {
			return DISPLAY_NAME;
		}

		@Override
		public void paintDecorationArea(Graphics2D graphics, Component comp,
			RadianceThemingSlices.DecorationAreaType decorationAreaType,
			int width, int height, double scaleFactor, ContainerColorTokens colorTokens) {

			graphics.setColor(colorTokens.getContainerSurface());
			graphics.fillRect(0, 0, width, height);
		}
	}

	private static class BlueprintDecorationOverlayPainter implements RadianceDecorationPainter.OverlayPainter {
		private static final String DISPLAY_NAME = "Blueprint";

		private final ContainerColorTokensSingleColorQuery containerTokensQuery;
		private final float strokeWidth;
		private final Alignment alignment;

		enum Alignment {
			TOP, BOTTOM
		}

		public BlueprintDecorationOverlayPainter(ContainerColorTokensSingleColorQuery containerTokensQuery,
			float strokeWidth, Alignment alignment) {
			this.containerTokensQuery = containerTokensQuery;
			this.strokeWidth = strokeWidth;
			this.alignment = alignment;
		}

		@Override
		public String getDisplayName() {
			return DISPLAY_NAME;
		}

		@Override
		public void paintOverlay(Graphics2D graphics, Component comp,
			RadianceThemingSlices.DecorationAreaType decorationAreaType,
			int width, int height, double scaleFactor, ContainerColorTokens colorTokens) {

			Component c = comp;
			Component topMostWithSameDecorationAreaType = c;
			while (c != null) {
				if (DecorationPainterUtils.getImmediateDecorationType(c) == decorationAreaType) {
					topMostWithSameDecorationAreaType = c;
				}
				c = c.getParent();
			}

			Point inTopMost = SwingUtilities.convertPoint(comp, new Point(0, 0),
				topMostWithSameDecorationAreaType);

			Color lineColor = this.containerTokensQuery.query(colorTokens);
			graphics.setColor(lineColor);

			int y = (this.alignment == Alignment.TOP)
				? (int) (Math.ceil(this.strokeWidth / 2.0f)) - (int) (inTopMost.y * scaleFactor)
				: (int) (scaleFactor * topMostWithSameDecorationAreaType.getHeight() - this.strokeWidth / 2.0f - 1.0f);

			int x = (int) (inTopMost.x * scaleFactor);

			graphics.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
				0, new float[]{(float) (5.0f * scaleFactor), (float) (4.0f * scaleFactor)}, 0));

			Graphics2D g2d = (Graphics2D) graphics.create();
			g2d.clipRect(0, 0, width, height);
			// Account for the horizontal offset of this component in its decoration area
			g2d.translate(-x, 0);
			g2d.drawLine(0, y, x + width, y);
			g2d.dispose();
		}
	}

	private static class BlueprintDecorationInlayPainter implements RadianceDecorationPainter.InlayPainter {
		private static final String DISPLAY_NAME = "Blueprint";

		private static final int GRID_SIZE = 8;

		@Override
		public String getDisplayName() {
			return DISPLAY_NAME;
		}

		@Override
		public void paintInlay(Graphics2D graphics, Component comp, RadianceThemingSlices.DecorationAreaType decorationAreaType, int x, int y, int width, int height, double scaleFactor, ContainerColorTokens colorTokens) {
			Point offset = RadianceCoreUtilities.getOffsetInRootPaneCoords(comp);

			Graphics2D g2d = (Graphics2D) graphics.create();
			g2d.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));

			int scaledGridSize = (int) (scaleFactor * GRID_SIZE);
			int scaledOffsetX = -(int) (scaleFactor * offset.x + x);
			int scaledOffsetY = -(int) (scaleFactor * offset.y + y);

			int startGridX = x + scaledOffsetX % scaledGridSize;
			int endGridX = (startGridX + width + scaledGridSize);
			int startGridY = y + scaledOffsetY % scaledGridSize;
			int endGridY = (startGridY + height + scaledGridSize);

			g2d.setColor(colorTokens.getContainerOutlineVariant());
			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.2f));

			// Vertical lines
			for (int gridX = startGridX; gridX <= endGridX; gridX += scaledGridSize) {
				g2d.drawLine(gridX, y, gridX, y + height);
			}
			// Horizontal lines
			for (int gridY = startGridY; gridY <= endGridY; gridY += scaledGridSize) {
				g2d.drawLine(x, gridY, x + width, gridY);
			}

			g2d.dispose();
		}
	}

	private static class BlueprintSurfacePainter implements RadianceSurfacePainter {
		@Override
		public String getDisplayName() {
			return "Blueprint";
		}

		@Override
		public void paintSurface(Graphics g, Component comp, float width, float height, double scaleFactor,
			Shape outline, ContainerColorTokens colorTokens) {

			Graphics2D g2d = (Graphics2D) g.create();
			g2d.clip(outline);

			g2d.setColor(RadianceColorUtilities.getAlphaColor(colorTokens.getContainerSurfaceDim(), 230));
			g2d.fill(outline);

			int stripeWidth = (int) Math.ceil(scaleFactor);
			int stepWidth = 3 * stripeWidth;

			int iHeight = (int) Math.ceil(height);

			g2d.setColor(RadianceColorUtilities.getAlphaColor(colorTokens.getContainerSurfaceLow(), 128));
			g2d.setStroke(new BasicStroke(stripeWidth));
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
			for (int x = 0; x <= (width + height); x += stepWidth) {
				g2d.drawLine(x, 0, x - iHeight, iHeight);
			}

			g2d.dispose();
		}
	}

	public BlueprintSkin() {
		Hct primaryBlue = Hct.fromInt(0xFF174792);
		Hct darkPrimaryBlue = Hct.fromInt(0xFF103266);

		TokenPaletteColorResolver activeResolver =
			TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
				TokenPaletteColorResolverOverlay.builder()
					.containerOutline(TokenPalette::getComplementaryContainerOutline)
					.containerOutlineVariant((p) -> Blend.harmonize(
						p.getComplementaryContainerOutline(), p.getContainerSurface(), 0.2))
					.complementaryContainerOutline(TokenPalette::getContainerOutline)
					.containerSurfaceEnabledAlpha((s) -> 0.6f)
					.containerSurfaceDisabledAlpha((s) -> 0.35f)
					.containerOutlineDisabledAlpha((s) -> 0.35f)
					.onContainerDisabledAlpha((s) -> 0.85f)
					.onContainer((s) -> primaryBlue.toInt())
					.onContainerVariant((s) -> primaryBlue.toInt() & 0xC0FFFFFF)
					.inverseContainerSurface((s) -> primaryBlue.toInt())
					.inverseContainerOutline((s) -> darkPrimaryBlue.toInt())
					.build());
		TokenPaletteColorResolver mutedResolver =
			TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
				TokenPaletteColorResolverOverlay.builder()
					.containerOutline(TokenPalette::getComplementaryContainerOutline)
					.containerOutlineVariant((p) -> Blend.harmonize(
						p.getComplementaryContainerOutline(), p.getContainerSurface(), 0.2))
					.complementaryContainerOutline(TokenPalette::getContainerOutline)
					.containerSurfaceEnabledAlpha((s) -> 0.0f)
					.containerSurfaceDisabledAlpha((s) -> 0.0f)
					.containerOutlineDisabledAlpha((s) -> 0.55f)
					.onContainerDisabledAlpha((s) -> 0.65f)
					.build());

		ContainerColorTokensBundle blueprintDefaultBundle = new ContainerColorTokensBundle(
			/* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFFFFFF),
				/* containerConfiguration */ ContainerConfiguration.defaultLight(),
				/* colorResolver */ activeResolver),
			/* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ primaryBlue,
				/* containerConfiguration */ ContainerConfiguration.defaultDark(),
				/* colorResolver */ mutedResolver),
			/* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ primaryBlue,
				/* containerConfiguration */ ContainerConfiguration.defaultDark(),
				/* colorResolver */ mutedResolver),
			/* isSystemDark */ true);

		ContainerColorTokens blueprintHighlightContainerTokens =
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFFFFFF),
				/* containerConfiguration */ ContainerConfiguration.defaultLight(),
				/* colorResolver */ activeResolver);
		blueprintDefaultBundle.registerActiveContainerTokens(blueprintHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.getActiveStates());
		this.registerDecorationAreaTokensBundle(blueprintDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE, RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
			RadianceThemingSlices.DecorationAreaType.FOOTER, RadianceThemingSlices.DecorationAreaType.TOOLBAR,
			RadianceThemingSlices.DecorationAreaType.HEADER);

        this.registerComponentShaper(new ClassicComponentShaper(),
            RadianceThemingSlices.DecorationAreaType.NONE);
		this.surfacePainter = new BlueprintSurfacePainter();
		this.outlinePainter = new FlatOutlinePainter();

		this.decorationPainter = new BlueprintDecorationPainter();
		this.decorationPainter.setInlayPainter(new BlueprintDecorationInlayPainter());

		this.decorationPainter.addOverlayPainter(
			new BlueprintDecorationOverlayPainter(
				ContainerColorTokens::getContainerOutlineVariant, 1.0f,
				BlueprintDecorationOverlayPainter.Alignment.BOTTOM),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);
		this.decorationPainter.addOverlayPainter(
			new BlueprintDecorationOverlayPainter(
				ContainerColorTokens::getContainerOutlineVariant, 1.0f,
				BlueprintDecorationOverlayPainter.Alignment.TOP),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR,
			RadianceThemingSlices.DecorationAreaType.FOOTER);

		this.highlightSurfacePainter = new BlueprintSurfacePainter();
		this.registerComponentShaper(new RectangularComponentShaper(),
			RadianceThemingSlices.DecorationAreaType.NONE, RadianceThemingSlices.DecorationAreaType.TOOLBAR);
	}
}
