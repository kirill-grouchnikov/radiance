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
package org.pushingpixels.substance.api.skin;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.FractionBasedBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopBezelOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * <code>Mariner</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 6.1
 */
public class MarinerSkin extends SubstanceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Mariner";

	/**
	 * Overlay painter to paint a dark line along the bottom edge of the
	 * menubar.
	 */
	private BottomLineOverlayPainter menuOverlayPainter;

	/**
	 * Overlay painter to paint a dark line along the bottom edge of the
	 * toolbars.
	 */
	private BottomLineOverlayPainter toolbarBottomLineOverlayPainter;

	/**
	 * Overlay painter to paint a bezel line along the top edge of the footer.
	 */
	private TopBezelOverlayPainter footerTopBezelOverlayPainter;

	/**
	 * Creates a new <code>Mariner</code> skin.
	 */
	public MarinerSkin() {
		SubstanceSkin.ColorSchemes schemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/mariner.colorschemes");

		SubstanceColorScheme activeScheme = schemes.get("Mariner Active");
		SubstanceColorScheme enabledScheme = schemes.get("Mariner Enabled");
		SubstanceColorScheme disabledScheme = schemes.get("Mariner Disabled");

		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);

		defaultSchemeBundle.registerColorScheme(activeScheme, 0.5f,
				ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(disabledScheme, 0.8f,
				ComponentState.DISABLED_UNSELECTED);

		// borders
		SubstanceColorScheme activeBorderScheme = schemes.get("Mariner Active Border");
		SubstanceColorScheme enabledBorderScheme = schemes.get("Mariner Enabled Border");
		defaultSchemeBundle.registerColorScheme(activeBorderScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
		defaultSchemeBundle.registerColorScheme(activeBorderScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(enabledBorderScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);

		// marks
		SubstanceColorScheme activeMarkScheme = schemes.get("Mariner Active Mark");
		SubstanceColorScheme enabledMarkScheme = schemes.get("Mariner Enabled Mark");
		defaultSchemeBundle.registerColorScheme(activeMarkScheme, ColorSchemeAssociationKind.MARK,
				ComponentState.getActiveStates());
		defaultSchemeBundle.registerColorScheme(enabledMarkScheme, ColorSchemeAssociationKind.MARK,
				ComponentState.ENABLED);

		ComponentState uneditable = new ComponentState("uneditable",
				new ComponentStateFacet[] { ComponentStateFacet.ENABLE },
				new ComponentStateFacet[] { ComponentStateFacet.EDITABLE });
		SubstanceColorScheme uneditableControls = schemes.get("Mariner Uneditable");
		defaultSchemeBundle.registerColorScheme(uneditableControls, ColorSchemeAssociationKind.FILL,
				uneditable);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);

		// header color scheme bundle
		SubstanceColorScheme headerColorScheme = schemes.get("Mariner Header");
		SubstanceColorScheme headerBorderColorScheme = schemes.get("Mariner Header Border");
		SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(
				headerColorScheme, headerColorScheme, headerColorScheme);
		headerSchemeBundle.registerColorScheme(headerColorScheme, 0.4f,
				ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
		headerSchemeBundle.registerColorScheme(headerColorScheme,
				ComponentState.ROLLOVER_UNSELECTED);
		headerSchemeBundle.registerColorScheme(headerColorScheme, ColorSchemeAssociationKind.MARK);
		headerSchemeBundle.registerColorScheme(headerBorderColorScheme,
				ColorSchemeAssociationKind.BORDER);
		this.registerDecorationAreaSchemeBundle(headerSchemeBundle, headerColorScheme,
				DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER);

		// footer color scheme bundle
		SubstanceColorScheme enabledFooterScheme = schemes.get("Mariner Footer Enabled");
		SubstanceColorScheme disabledFooterScheme = schemes.get("Mariner Footer Disabled");

		SubstanceColorSchemeBundle footerSchemeBundle = new SubstanceColorSchemeBundle(activeScheme,
				enabledFooterScheme, disabledFooterScheme);

		footerSchemeBundle.registerColorScheme(activeScheme, 0.5f,
				ComponentState.DISABLED_SELECTED);
		footerSchemeBundle.registerColorScheme(disabledFooterScheme, 0.8f,
				ComponentState.DISABLED_UNSELECTED);

		// borders
		SubstanceColorScheme footerEnabledBorderScheme = schemes
				.get("Mariner Footer Enabled Border");
		footerSchemeBundle.registerColorScheme(activeBorderScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
		footerSchemeBundle.registerColorScheme(activeBorderScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.DISABLED_SELECTED);
		footerSchemeBundle.registerColorScheme(footerEnabledBorderScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);

		// marks
		SubstanceColorScheme footerEnabledMarkScheme = schemes.get("Mariner Footer Enabled Mark");
		footerSchemeBundle.registerColorScheme(activeMarkScheme, ColorSchemeAssociationKind.MARK,
				ComponentState.getActiveStates());
		footerSchemeBundle.registerColorScheme(footerEnabledMarkScheme,
				ColorSchemeAssociationKind.MARK, ComponentState.ENABLED);

		// separators
		SubstanceColorScheme footerSeparatorScheme = schemes.get("Mariner Footer Separator");
		footerSchemeBundle.registerColorScheme(footerSeparatorScheme,
				ColorSchemeAssociationKind.SEPARATOR);

		SubstanceColorScheme footerWatermarkColorScheme = schemes.get("Mariner Footer Watermark");
		this.registerDecorationAreaSchemeBundle(footerSchemeBundle, footerWatermarkColorScheme,
				DecorationAreaType.FOOTER, DecorationAreaType.TOOLBAR, DecorationAreaType.GENERAL);

		this.setTabFadeStart(0.15);
		this.setTabFadeEnd(0.25);

		// add an overlay painter to paint a bezel line along the top
		// edge of footer
		this.footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
				ColorSchemeSingleColorQuery.ULTRADARK, ColorSchemeSingleColorQuery.LIGHT);
		this.addOverlayPainter(this.footerTopBezelOverlayPainter, DecorationAreaType.FOOTER);

		// add two overlay painters to create a bezel line between
		// menu bar and toolbars
		this.menuOverlayPainter = new BottomLineOverlayPainter(
				(SubstanceColorScheme scheme) -> scheme.getUltraDarkColor().darker());
		this.addOverlayPainter(this.menuOverlayPainter, DecorationAreaType.HEADER);

		// add overlay painter to paint drop shadows along the bottom
		// edges of toolbars
		this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(),
				DecorationAreaType.TOOLBAR);

		// add overlay painter to paint a dark line along the bottom
		// edge of toolbars
		this.toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
				ColorSchemeSingleColorQuery.ULTRADARK);
		this.addOverlayPainter(this.toolbarBottomLineOverlayPainter, DecorationAreaType.TOOLBAR);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new FractionBasedFillPainter("Mariner", new float[] { 0.0f, 0.5f, 1.0f },
				new ColorSchemeSingleColorQuery[] { ColorSchemeSingleColorQuery.EXTRALIGHT,
						ColorSchemeSingleColorQuery.LIGHT, ColorSchemeSingleColorQuery.MID });

		this.decorationPainter = new MatteDecorationPainter();
		this.highlightPainter = new ClassicHighlightPainter();

		this.borderPainter = new FractionBasedBorderPainter("Mariner",
				new float[] { 0.0f, 0.5f, 1.0f },
				new ColorSchemeSingleColorQuery[] { ColorSchemeSingleColorQuery.ULTRADARK,
						ColorSchemeSingleColorQuery.DARK, ColorSchemeSingleColorQuery.MID });
		this.highlightBorderPainter = new ClassicBorderPainter();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.skin.SubstanceSkin#getDisplayName()
	 */
	public String getDisplayName() {
		return NAME;
	}
}
