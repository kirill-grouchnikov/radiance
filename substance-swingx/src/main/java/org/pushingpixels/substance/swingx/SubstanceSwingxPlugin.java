/*
 * Copyright 2005-2018 Kirill Grouchnikov, based on work by
 * Sun Microsystems, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.pushingpixels.substance.swingx;

import org.jdesktop.swingx.*;
import org.jdesktop.swingx.painter.Painter;
import org.jdesktop.swingx.plaf.PainterUIResource;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceComponentPlugin;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.font.FontSet;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.DecorationPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.border.SubstanceBorder;
import org.pushingpixels.substance.swingx.svg.ic_search_black_24px;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.IconUIResource;
import java.awt.*;

/**
 * Substance plugin for <a href="https://swingx.dev.java.net">SwingX</a>
 * components.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceSwingxPlugin implements SubstanceComponentPlugin {

	/**
	 * Creates a plugin instance.
	 */
	public SubstanceSwingxPlugin() {
	}

	@Override
	public Object[] getDefaults(SubstanceSkin skin) {
		final SubstanceColorScheme mainActiveScheme = skin
				.getActiveColorScheme(DecorationAreaType.NONE);
		SubstanceColorScheme mainEnabledScheme = skin
				.getEnabledColorScheme(DecorationAreaType.NONE);
		SubstanceColorScheme mainDisabledScheme = skin
				.getDisabledColorScheme(DecorationAreaType.NONE);
		Color foregroundColor = SubstanceColorUtilities
				.getForegroundColor(mainEnabledScheme);
		Color backgroundColor = new ColorUIResource(mainActiveScheme
				.getBackgroundFillColor());
		Color disabledForegroundColor = SubstanceColorUtilities
				.getForegroundColor(mainDisabledScheme);

		SubstanceColorScheme highlightColorScheme = skin.getColorScheme(
				(Component) null, ColorSchemeAssociationKind.HIGHLIGHT,
				ComponentState.SELECTED);
		if (highlightColorScheme == null) {
			highlightColorScheme = skin.getColorScheme(null,
					ComponentState.ROLLOVER_SELECTED);
		}

		Color selectionBackgroundColor = new ColorUIResource(
				highlightColorScheme.getSelectionBackgroundColor());

		Color selectionForegroundColor = new ColorUIResource(
				highlightColorScheme.getSelectionForegroundColor());

		FontSet fontSet = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet(
				"Substance", null);

		Font controlFont = fontSet.getControlFont();

		Painter titlePanelPainter = new Painter() {
			public void paint(Graphics2D g, Object jxTitledPanel, int width,
					int height) {
				JComponent titledPanel = (JComponent) jxTitledPanel;
				Graphics2D g2d = (Graphics2D) g.create();
				// g2d.translate(10, 10);
				DecorationAreaType decorationType = ComponentOrParentChainScope
						.getDecorationType(titledPanel);
				if ((decorationType != null)
						&& (SubstanceCoreUtilities.getSkin(titledPanel)
								.isRegisteredAsDecorationArea(decorationType))) {
					DecorationPainterUtils.paintDecorationBackground(g2d,
							titledPanel, false);
				} else {
					BackgroundPaintingUtils.fillAndWatermark(g2d, titledPanel,
							SubstanceCoreUtilities.getSkin(titledPanel)
									.getBackgroundColorScheme(decorationType)
									.getBackgroundFillColor(), new Rectangle(0,
									0, titledPanel.getWidth(), titledPanel
											.getHeight()));
				}
				g2d.dispose();
			}
		};

		SubstanceColorScheme headerDecorationTheme = skin
				.getEnabledColorScheme(DecorationAreaType.HEADER);
		Color titlePaneForeground = new ColorUIResource(SubstanceColorUtilities
				.getForegroundColor(headerDecorationTheme));

		Object[] defaults = new Object[] {

				JXDatePicker.uiClassID,
				"org.pushingpixels.substance.swingx.SubstanceDatePickerUI",

				JXMonthView.uiClassID,
				"org.pushingpixels.substance.swingx.SubstanceMonthViewUI",

				JXTaskPaneContainer.uiClassID,
				"org.pushingpixels.substance.swingx.SubstanceTaskPaneContainerUI",

				JXTaskPane.uiClassID,
				"org.pushingpixels.substance.swingx.SubstanceTaskPaneUI",

				JXStatusBar.uiClassID,
				"org.pushingpixels.substance.swingx.SubstanceStatusBarUI",

				JXHeader.uiClassID,
				"org.pushingpixels.substance.swingx.SubstanceHeaderUI",

				JXLoginPane.uiClassID,
				"org.pushingpixels.substance.swingx.SubstanceLoginPaneUI",

				JXTipOfTheDay.uiClassID,
				"org.pushingpixels.substance.swingx.SubstanceTipOfTheDayUI",

				JXTitledPanel.uiClassID,
				"org.pushingpixels.substance.swingx.SubstanceTitledPanelUI",

				JXErrorPane.uiClassID,
				"org.pushingpixels.substance.swingx.SubstanceErrorPaneUI",

				JXHyperlink.uiClassID,
				"org.pushingpixels.substance.swingx.SubstanceHyperlinkUI",

				"PanelUI",
				"org.pushingpixels.substance.swingx.SubstancePanelUI",

				"TableUI",
				"org.pushingpixels.substance.swingx.SubstanceTableUI",

				"ColumnHeaderRenderer.upIcon",
				new UIDefaults.LazyValue() {
					@Override
					public Object createValue(UIDefaults table) {
						return new IconUIResource(SubstanceImageCreator
								.getArrowIcon(SubstanceSizeUtils
										.getControlFontSize(),
										SwingConstants.NORTH, mainActiveScheme));
					}
				},

				"ColumnHeaderRenderer.downIcon",
				new UIDefaults.LazyValue() {
					@Override
					public Object createValue(UIDefaults table) {
						return new IconUIResource(SubstanceImageCreator
								.getArrowIcon(SubstanceSizeUtils
										.getControlFontSize(),
										SwingConstants.SOUTH, mainActiveScheme));
					}
				},

				"JXDatePicker.arrowIcon",
				new UIDefaults.LazyValue() {
					@Override
					public Object createValue(UIDefaults table) {
						return new IconUIResource(SubstanceImageCreator
								.getArrowIcon(SubstanceSizeUtils
										.getControlFontSize(),
										SwingConstants.SOUTH, mainActiveScheme));
					}
				},

				"JXLoginPane.bannerFont",
				new FontUIResource(controlFont.deriveFont(3.0f * controlFont
						.getSize())),

				"JXLoginPane.bannerForeground",
				new ColorUIResource(SubstanceColorUtilities.invertColor(foregroundColor)),

				"JXLoginPane.bannerLightBackground",
				new ColorUIResource(
						mainActiveScheme.isDark() ? mainActiveScheme
								.getUltraLightColor() : mainActiveScheme
								.getLightColor()),

				"JXLoginPane.bannerDarkBackground",
				new ColorUIResource(
						mainActiveScheme.isDark() ? mainActiveScheme
								.getLightColor() : mainActiveScheme
								.getMidColor()),

				"JXMonthView.background",
				backgroundColor,

				"JXMonthView.foreground",
				foregroundColor,

				"JXMonthView.monthStringBackground",
				backgroundColor,

				"JXMonthView.monthStringForeground",
				foregroundColor,

				"JXMonthView.daysOfTheWeekForeground",
				foregroundColor,

				"JXMonthView.weekOfTheYearForeground",
				foregroundColor,

				"JXMonthView.unselectableDayForeground",
				new ColorUIResource(Color.RED),

				"JXMonthView.selectedBackground",
				selectionBackgroundColor,

				"JXMonthView.selectedForeground",
				selectionForegroundColor,

				"JXMonthView.flaggedDayForeground",
				new ColorUIResource(Color.RED),

				"JXMonthView.leadingDayForeground",
				disabledForegroundColor,

				"JXMonthView.trailingDayForeground",
				disabledForegroundColor,
				
				"SearchField.icon",
				ic_search_black_24px.uiResourceOf(14, 14).colorize(foregroundColor, 0.75f),

				"TaskPane.titleForeground",
				foregroundColor,

				"TaskPane.titleOver",
				foregroundColor,

				"TaskPane.specialTitleForeground",
				foregroundColor,

				"TaskPane.specialTitleOver",
				foregroundColor,

				"TaskPaneContainer.background",
				backgroundColor,

				"TaskPaneContainer.backgroundPainter",
				null,

				"TaskPane.background",
				backgroundColor,

				"TaskPane.foreground",
				foregroundColor,

				"TaskPane.font",
				new FontUIResource(controlFont.deriveFont(Font.BOLD)),

				"TipOfTheDay.background",
				backgroundColor.darker(),

				"TipOfTheDay.foreground",
				foregroundColor,

				"TipOfTheDay.font",
				new FontUIResource(controlFont),

				"TipOfTheDay.tipFont",
				new FontUIResource(controlFont.deriveFont(4.0f + controlFont
						.getSize())),

				"TipOfTheDay.border", new SubstanceBorder(),

				"TitledBorder.font", new FontUIResource(controlFont),

				"TitledBorder.titleColor", foregroundColor,

				"JXTitledPanel.titleForeground", titlePaneForeground,

				"JXTitledPanel.titleFont",
				new FontUIResource(controlFont.deriveFont(Font.BOLD)),

				"JXTitledPanel.titlePainter",
				new PainterUIResource(titlePanelPainter),

				"JXHeader.titleForeground", titlePaneForeground,

				"JXHeader.descriptionForeground", titlePaneForeground, };

		return defaults;
	}

	public void initialize() {
	}

	public void uninitialize() {
	}
}
