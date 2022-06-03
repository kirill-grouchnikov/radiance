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
package org.pushingpixels.radiance.theming.internal.plugin;

import org.pushingpixels.radiance.common.api.font.FontSet;
import org.pushingpixels.radiance.theming.api.RadianceThemingComponentPlugin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.utils.icon.RadianceIconFactory;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.ui.RadianceColorChooserUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceImageCreator;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;
import org.pushingpixels.radiance.theming.internal.utils.icon.SliderHorizontalIcon;
import org.pushingpixels.radiance.theming.internal.utils.icon.SliderVerticalIcon;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.InsetsUIResource;
import java.awt.*;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Core plugin for color chooser UI delegates. Contains information on Quaqua and
 * Xoetrope color chooser panels. This class is <b>for internal use only</b>.
 *
 * @author Kirill Grouchnikov
 */
public class ColorChooserPlugin implements RadianceThemingComponentPlugin {
    @Override
    public Object[] getDefaults(RadianceSkin skin) {
        if (!Boolean.TRUE.equals(UIManager.getBoolean(RadianceSynapse.USE_DEFAULT_COLOR_CHOOSER))) {
            ResourceBundle bundle = ResourceBundle.getBundle(
                    "org.pushingpixels.radiance.theming.internal.contrib.randelshofer.quaqua.Labels");
            List<Object> labelsList = new LinkedList<>();
            for (Enumeration<String> i = bundle.getKeys(); i.hasMoreElements(); ) {
                String key = i.nextElement();
                labelsList.add(key);
                labelsList.add(bundle.getObject(key));
            }
            final RadianceColorScheme colorScheme = skin
                    .getEnabledColorScheme(RadianceThemingSlices.DecorationAreaType.NONE);
            InsetsUIResource visualMargin = new InsetsUIResource(0, 0, 0, 0);
            Color foregroundColor = new ColorUIResource(colorScheme
                    .getForegroundColor());
            Object[] mainDefaults = new Object[]{
                    // quaqua
                    "Slider.upThumbSmall",
                    (UIDefaults.LazyValue) ((UIDefaults table) ->
                            new SliderHorizontalIcon(null, RadianceSizeUtils
                                    .getSliderIconSize(RadianceSizeUtils
                                            .getControlFontSize()) - 2,
                                    true)),

                    // quaqua
                    "Slider.leftThumbSmall",
                    (UIDefaults.LazyValue) ((UIDefaults table) ->
                            new SliderVerticalIcon(null, RadianceSizeUtils
                                    .getSliderIconSize(RadianceSizeUtils
                                            .getControlFontSize()) - 2,
                                    true)),

                    // quaqua
                    "Component.visualMargin",
                    visualMargin,

                    // quaqua
                    "ColorChooser.foreground",
                    foregroundColor,

                    // class names of default choosers
                    "ColorChooser.defaultChoosers",
                    new String[]{
                            "org.pushingpixels.radiance.theming.internal.contrib.randelshofer.quaqua.colorchooser.ColorWheelChooser",
                            "org.pushingpixels.radiance.theming.internal.contrib.randelshofer.quaqua.colorchooser.ColorSlidersChooser",
                            "org.pushingpixels.radiance.theming.internal.contrib.randelshofer.quaqua.colorchooser.ColorPalettesChooser",
                            "org.pushingpixels.radiance.theming.internal.contrib.randelshofer.quaqua.colorchooser.SwatchesChooser",
                            "org.pushingpixels.radiance.theming.internal.contrib.randelshofer.quaqua.colorchooser.CrayonsChooser",
                            "org.pushingpixels.radiance.theming.internal.contrib.xoetrope.editor.color.ColorWheelPanel"},
                    // "ColorChooser.swatchesDefaultRecentColor", ...,
                    // "ColorChooser.swatchesRecentSwatchSize", ...,
                    "ColorChooser.swatchesSwatchSize",
                    new DimensionUIResource(5, 5),
                    "ColorChooser.resetMnemonic",
                    Integer.valueOf(-1),
                    "ColorChooser.crayonsImage",
                    (UIDefaults.LazyValue) ((UIDefaults table) -> RadianceImageCreator.getCrayonsImage(
                            RadianceCoreUtilities.getBackgroundFill(skin, RadianceThemingSlices.DecorationAreaType.NONE)
                    )),
                    "ColorChooser.textSliderGap",
                    Integer.valueOf(0),
            };

            FontSet radianceFontSet = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet();
            Font controlFont = radianceFontSet.getControlFont();

            Font fontBoldBaseP1 = controlFont.deriveFont(Font.BOLD, controlFont.getSize() + 1);
            if (!(fontBoldBaseP1 instanceof FontUIResource)) {
                fontBoldBaseP1 = new FontUIResource(fontBoldBaseP1);
            }

            Font fontPlainBaseM2 = controlFont.deriveFont((float) (controlFont.getSize() - 2));
            if (!(fontPlainBaseM2 instanceof FontUIResource)) {
                fontPlainBaseM2 = new FontUIResource(fontPlainBaseM2);
            }

            Object[] colorDefaults = new Object[]{
                    "ColorChooserUI", RadianceColorChooserUI.class.getName(),

                    "ColorChooser.font", controlFont,

                    "ColorChooser.smallFont", fontPlainBaseM2,

                    "ColorChooser.crayonsFont", fontBoldBaseP1};

            Object[] labelDefaults = new Object[mainDefaults.length
                    + labelsList.size()];
            System.arraycopy(mainDefaults, 0, labelDefaults, 0, mainDefaults.length);
            int start = mainDefaults.length;
            for (int i = 0; i < labelsList.size(); i++) {
                labelDefaults[start + i] = labelsList.get(i);
            }
            mainDefaults = labelDefaults;

            Object[] defaults = new Object[mainDefaults.length + colorDefaults.length];
            System.arraycopy(mainDefaults, 0, defaults, 0, mainDefaults.length);
            start = mainDefaults.length;
            System.arraycopy(colorDefaults, 0, defaults, start + 0, colorDefaults.length);
            return defaults;
        } else {
            return new Object[0];
        }
    }
}
