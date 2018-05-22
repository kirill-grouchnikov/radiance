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
package org.pushingpixels.substance.flamingo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.UIDefaults;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ColorUIResource;

import org.pushingpixels.flamingo.api.bcb.JBreadcrumbBar;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButtonPanel;
import org.pushingpixels.flamingo.api.common.JCommandMenuButton;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.JCommandToggleMenuButton;
import org.pushingpixels.flamingo.api.common.JScrollablePanel;
import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.JPopupPanel;
import org.pushingpixels.flamingo.api.ribbon.JRibbon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbonComponent;
import org.pushingpixels.flamingo.internal.ui.common.JCircularProgress;
import org.pushingpixels.flamingo.internal.ui.common.JRichTooltipPanel;
import org.pushingpixels.flamingo.internal.ui.common.popup.JColorSelectorComponent;
import org.pushingpixels.flamingo.internal.ui.common.popup.JColorSelectorPanel;
import org.pushingpixels.flamingo.internal.ui.ribbon.JBandControlPanel;
import org.pushingpixels.flamingo.internal.ui.ribbon.JFlowBandControlPanel;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonGallery;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonRootPane;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonTaskToggleButton;
import org.pushingpixels.flamingo.internal.ui.ribbon.appmenu.JRibbonApplicationMenuButton;
import org.pushingpixels.flamingo.internal.ui.ribbon.appmenu.JRibbonApplicationMenuPopupPanel;
import org.pushingpixels.substance.api.SubstanceComponentPlugin;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.font.FontSet;
import org.pushingpixels.substance.flamingo.ribbon.ui.SubstanceRibbonBandBorder;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.border.SubstanceBorder;
import org.pushingpixels.substance.internal.utils.border.SubstancePopupMenuBorder;

/**
 * Plugin for Flamingo components.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceFlamingoPlugin implements SubstanceComponentPlugin {
    @Override
	public Object[] getDefaults(SubstanceSkin skin) {
		String UI_COMMON_CLASSNAME_PREFIX = "org.pushingpixels.substance.flamingo.common.ui.Substance";

		String UI_RIBBON_CLASSNAME_PREFIX = "org.pushingpixels.substance.flamingo.ribbon.ui.Substance";

		String UI_BCB_CLASSNAME_PREFIX = "org.pushingpixels.substance.flamingo.bcb.ui.Substance";

		FontSet fontSet = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet(
				"Substance", null);
		Font controlFont = fontSet.getControlFont();

		Border textBorder = new SubstancePopupMenuBorder();

		SubstanceColorScheme mainActiveScheme = skin.getActiveColorScheme(DecorationAreaType.NONE);
		Color backgroundColor = new ColorUIResource(mainActiveScheme.getBackgroundFillColor());
		Color disabledForegroundColor = SubstanceColorUtilities.getForegroundColor(
				mainActiveScheme);

		Object richTooltipBorder = new UIDefaults.LazyValue() {
			@Override
			public Object createValue(UIDefaults table) {
				return new SubstanceBorder(new Insets(3, 5, 4, 5));
			}
		};

		Object[] defaults = new Object[] {
				JCommandButtonPanel.uiClassID,
				UI_COMMON_CLASSNAME_PREFIX + "CommandButtonPanelUI",

				JCommandButton.uiClassID,
				UI_COMMON_CLASSNAME_PREFIX + "CommandButtonUI",

				JCommandMenuButton.uiClassID,
				UI_COMMON_CLASSNAME_PREFIX + "CommandMenuButtonUI",

				JCommandToggleButton.uiClassID,
				UI_COMMON_CLASSNAME_PREFIX + "CommandToggleButtonUI",

				JCommandToggleMenuButton.uiClassID,
				UI_COMMON_CLASSNAME_PREFIX + "CommandToggleMenuButtonUI",

                JPopupPanel.uiClassID,
                UI_COMMON_CLASSNAME_PREFIX + "PopupPanelUI",

                JCircularProgress.uiClassID,
                UI_COMMON_CLASSNAME_PREFIX + "CircularProgressUI",

				JScrollablePanel.uiClassID,
				UI_COMMON_CLASSNAME_PREFIX + "ScrollablePanelUI",

                JCommandPopupMenu.uiClassID,
                UI_COMMON_CLASSNAME_PREFIX + "CommandPopupMenuUI",

                JColorSelectorPopupMenu.uiClassID,
                UI_COMMON_CLASSNAME_PREFIX + "CommandPopupMenuUI",

				JColorSelectorPanel.uiClassID,
				UI_COMMON_CLASSNAME_PREFIX + "ColorSelectorPanelUI",

				JColorSelectorComponent.uiClassID,
				UI_COMMON_CLASSNAME_PREFIX + "ColorSelectorComponentUI",

				JBandControlPanel.uiClassID,
				UI_RIBBON_CLASSNAME_PREFIX + "BandControlPanelUI",

				JFlowBandControlPanel.uiClassID,
				UI_RIBBON_CLASSNAME_PREFIX + "FlowBandControlPanelUI",

				JRibbon.uiClassID,
				UI_RIBBON_CLASSNAME_PREFIX + "RibbonUI",

				JRibbonRootPane.uiClassID,
				UI_RIBBON_CLASSNAME_PREFIX + "RibbonRootPaneUI",

				JRibbonBand.uiClassID,
				UI_RIBBON_CLASSNAME_PREFIX + "RibbonBandUI",

				JRibbonGallery.uiClassID,
				UI_RIBBON_CLASSNAME_PREFIX + "RibbonGalleryUI",

				JRibbonApplicationMenuButton.uiClassID,
				UI_RIBBON_CLASSNAME_PREFIX + "RibbonApplicationMenuButtonUI",

				JRibbonApplicationMenuPopupPanel.uiClassID,
				UI_RIBBON_CLASSNAME_PREFIX + "RibbonApplicationMenuPopupPanelUI",

				JRibbonTaskToggleButton.uiClassID,
				UI_RIBBON_CLASSNAME_PREFIX + "RibbonTaskToggleButtonUI",

				JRichTooltipPanel.uiClassID,
				UI_RIBBON_CLASSNAME_PREFIX + "RichTooltipPanelUI",

				JRibbonComponent.uiClassID,
				UI_RIBBON_CLASSNAME_PREFIX + "RibbonComponentUI",

				JBreadcrumbBar.uiClassID,
				UI_BCB_CLASSNAME_PREFIX + "BreadcrumbBarUI",

				"BreadcrumbBar.font",
				controlFont,

				"IconPanel.font",
				fontSet.getTitleFont(),

				"CommandButtonPanel.font",
				controlFont.deriveFont(Font.BOLD, controlFont.getSize() + 1),

				"Ribbon.font",
				controlFont,

				"ControlPanel.border",
				null,

				"ControlPanel.background",
				backgroundColor,

				"PopupPanel.border", textBorder,

				"PopupGallery.background", backgroundColor,

				"Ribbon.border",
				new BorderUIResource.EmptyBorderUIResource(1, 1, 1, 1),

				"RibbonBand.border", new SubstanceRibbonBandBorder(),

				"RibbonBand.background", backgroundColor,

				"RibbonGallery.border",
				new BorderUIResource.EmptyBorderUIResource(2, 2, 2, 2),

				"RibbonGallery.margin", new Insets(3, 3, 3, 3),
				
				"RichTooltipPanel.border", richTooltipBorder,

				"ToggleButton.background", backgroundColor,

				"ToggleButton.disabledText", disabledForegroundColor };
		return defaults;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.lafplugin.LafComponentPlugin#uninitialize()
	 */
	public void uninitialize() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.lafplugin.LafComponentPlugin#initialize()
	 */
	public void initialize() {
	}
}
