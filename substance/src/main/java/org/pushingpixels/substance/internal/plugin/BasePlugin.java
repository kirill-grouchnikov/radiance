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
package org.pushingpixels.substance.internal.plugin;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.InsetsUIResource;

import org.pushingpixels.substance.api.SubstanceComponentPlugin;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.font.FontSet;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.icon.SubstanceIconFactory;

/**
 * Core plugin for additional UI delegates. Contains information on Quaqua and
 * Xoetrope color chooser panels. This class is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class BasePlugin implements SubstanceComponentPlugin {

	/**
	 * Common directory for Quaqua images.
	 */
	protected final static String commonDir = "/org/pushingpixels/substance/internal/contrib/randelshofer/quaqua/images/";

	/**
	 * Color chooser class name from Quaqua.
	 */
	protected final static String quaquaColorChooserClassName = "org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.Quaqua14ColorChooserUI";

	/**
	 * Indication whether the Quaqua color chooser is available. The lite
	 * version strips away the Quaqua color chooser.
	 */
	protected boolean hasQuaquaColorChooser;

	/**
	 * Creates the base plugin.
	 */
	public BasePlugin() {
		try {
			Class.forName(quaquaColorChooserClassName);
			this.hasQuaquaColorChooser = true;
		} catch (ClassNotFoundException cnfe) {
			this.hasQuaquaColorChooser = false;
		}
	}

	@Override
	public Object[] getDefaults(SubstanceSkin skin) {
		if (this.hasQuaquaColorChooser) {
			ResourceBundle bundle = ResourceBundle
					.getBundle("org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.Labels");
			List labelsList = new LinkedList();
			for (Enumeration i = bundle.getKeys(); i.hasMoreElements();) {
				String key = (String) i.nextElement();
				labelsList.add(key);
				labelsList.add(bundle.getObject(key));
			}
			final SubstanceColorScheme colorScheme = skin
					.getEnabledColorScheme(DecorationAreaType.NONE);
			InsetsUIResource visualMargin = new InsetsUIResource(0, 0, 0, 0);
			Color foregroundColor = new ColorUIResource(colorScheme
					.getForegroundColor());
			Object[] mainDefaults = new Object[] {
					// quaqua
					"Slider.upThumbSmall",
					new UIDefaults.LazyValue() {
						public Object createValue(UIDefaults table) {
							return SubstanceIconFactory
									.getSliderHorizontalIcon(
											SubstanceSizeUtils
													.getSliderIconSize(SubstanceSizeUtils
															.getControlFontSize()) - 2,
											true);
						}
					},

					// quaqua
					"Slider.leftThumbSmall",
					new UIDefaults.LazyValue() {
						public Object createValue(UIDefaults table) {
							return SubstanceIconFactory
									.getSliderVerticalIcon(
											SubstanceSizeUtils
													.getSliderIconSize(SubstanceSizeUtils
															.getControlFontSize()) - 2,
											true);
						}
					},

					// quaqua
					"Component.visualMargin",
					visualMargin,

					// quaqua
					"ColorChooser.foreground",
					foregroundColor,

					// class names of default choosers
					"ColorChooser.defaultChoosers",
					new String[] {
							"org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser.ColorWheelChooser",
							"org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser.ColorSlidersChooser",
							"org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser.ColorPalettesChooser",
							"org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser.SwatchesChooser",
							"org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser.CrayonsChooser",
							"org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser.Quaqua15ColorPicker",
							"org.pushingpixels.substance.internal.contrib.xoetrope.editor.color.ColorWheelPanel" },
					// "ColorChooser.swatchesDefaultRecentColor", ...,
					// "ColorChooser.swatchesRecentSwatchSize", ...,
					"ColorChooser.swatchesSwatchSize",
					new DimensionUIResource(5, 5),
					"ColorChooser.resetMnemonic",
					new Integer(-1),
					"ColorChooser.crayonsImage",
					SubstanceImageCreator.getCrayonsImage(),
					"ColorChooser.textSliderGap",
					new Integer(0),

					// Magnifying glass used as the cursor image
					"ColorChooser.colorPickerMagnifier",
					new UIDefaults.LazyValue() {
						@Override
						public Object createValue(UIDefaults table) {
							BufferedImage result = SubstanceCoreUtilities
									.getBlankImage(48, 48);
							Graphics2D g = result.createGraphics();

							g.setColor(Color.black);
							g.translate(-4, -6);
							int xc = 20;
							int yc = 22;
							int r = 15;

							g.setStroke(new BasicStroke(2.5f));
							g.drawOval(xc - r, yc - r, 2 * r, 2 * r);
							g.setStroke(new BasicStroke(4.0f));
							GeneralPath handle = new GeneralPath();
							handle.moveTo((float) (xc + r / Math.sqrt(2.0)),
									(float) (yc + r / Math.sqrt(2.0)));
							handle.lineTo(45, 47);
							g.draw(handle);
							g.translate(4, 6);

							g.setStroke(new BasicStroke(1.0f));
							g.drawLine(16, 4, 16, 13);
							g.drawLine(4, 16, 13, 16);
							g.drawLine(16, 19, 16, 28);
							g.drawLine(19, 16, 28, 16);

							return result;
						}
					},
					// makeBufferedImage(commonDir + "zoomer.png"),
					// Hot spot of the magnifier cursor
					"ColorChooser.colorPickerHotSpot",
					new UIDefaults.ProxyLazyValue("java.awt.Point",
							new Object[] { new Integer(29), new Integer(29) }),
					// Pick point relative to hot spot
					"ColorChooser.colorPickerPickOffset",
					new UIDefaults.ProxyLazyValue("java.awt.Point",
							new Object[] { new Integer(-13), new Integer(-13) }),
					// Rectangle used for drawing the mask of the magnifying
					// glass
					"ColorChooser.colorPickerGlassRect",
					new UIDefaults.ProxyLazyValue("java.awt.Rectangle",
							new Object[] { new Integer(3), new Integer(3),
									new Integer(26), new Integer(26) }),
					// Capture rectangle. Width and height must be equal sized
					// and must be odd.
					// The position of the capture rectangle is relative to the
					// hot spot.
					"ColorChooser.colorPickerCaptureRect",
					new UIDefaults.ProxyLazyValue("java.awt.Rectangle",
							new Object[] { new Integer(-15), new Integer(-15),
									new Integer(5), new Integer(5) }),
					// Zoomed (magnified) capture image. Width and height must
					// be a multiple of the capture rectangles size.
					"ColorChooser.colorPickerZoomRect",
					new UIDefaults.ProxyLazyValue("java.awt.Rectangle",
							new Object[] { new Integer(4), new Integer(4),
									new Integer(25), new Integer(25) }),

			};

			Object[] colorDefaults = null;
			FontSet substanceFontSet = SubstanceCortex.GlobalScope.getFontPolicy()
					.getFontSet("Substance", null);
			Font controlFont = substanceFontSet.getControlFont();

			Font fontBoldBaseP1 = new FontUIResource(controlFont.deriveFont(
					Font.BOLD, controlFont.getSize() + 1));

			Font fontPlainBaseM2 = new FontUIResource(controlFont
					.deriveFont((float) (controlFont.getSize() - 2)));

			colorDefaults = new Object[] {
					"ColorChooserUI",
					"org.pushingpixels.substance.internal.ui.SubstanceColorChooserUI",

					"ColorChooser.font", controlFont,

					"ColorChooser.smallFont", fontPlainBaseM2,

					"ColorChooser.crayonsFont", fontBoldBaseP1 };

			Object[] labelDefaults = new Object[mainDefaults.length
					+ labelsList.size()];
			for (int i = 0; i < mainDefaults.length; i++)
				labelDefaults[i] = mainDefaults[i];
			int start = mainDefaults.length;
			for (int i = 0; i < labelsList.size(); i++)
				labelDefaults[start + i] = labelsList.get(i);
			mainDefaults = labelDefaults;

			Object[] defaults = new Object[mainDefaults.length + colorDefaults.length];
			for (int i = 0; i < mainDefaults.length; i++)
				defaults[i] = mainDefaults[i];
			start = mainDefaults.length;
			for (int i = 0; i < colorDefaults.length; i++)
				defaults[start + i] = colorDefaults[i];
			return defaults;
		} else {
			// Object[] defaults = new Object[labelsList.size()];
			// for (int i = 0; i < labelsList.size(); i++)
			// defaults[i] = labelsList.get(i);
			return new Object[0];
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.lafplugin.LafPlugin#uninitialize()
	 */
	public void uninitialize() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.lafplugin.LafPlugin#initialize()
	 */
	public void initialize() {
	}
}
