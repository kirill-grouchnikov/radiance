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
package org.pushingpixels.radiance.demo.theming.main.check;

import org.pushingpixels.radiance.demo.theming.main.check.svg.flags.*;
import org.pushingpixels.radiance.demo.theming.main.check.svg.ic_info_black_24px;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.colorscheme.*;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.GlassFillPainter;
import org.pushingpixels.radiance.theming.api.painter.highlight.GlassHighlightPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;
import org.pushingpixels.radiance.theming.api.skin.GraphiteSkin;
import org.pushingpixels.radiance.theming.api.skin.NebulaAccentedSkin;
import org.pushingpixels.radiance.theming.api.skin.SkinInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Map;

/**
 * Factory that creates menus for the test applications.
 *
 * @author Kirill Grouchnikov
 */
public class SampleMenuFactory {
    /**
     * Returns a sample test menu.
     *
     * @return Sample test menu.
     */
    public static JMenu getTestMenu() {
        JMenu testMenu = new JMenu("Test");
        testMenu.setMnemonic('1');
        int mcount = 0;
        for (LinkedList<JMenuItem> miList : getTestMenuItems()) {
            if (mcount > 0) {
                if (mcount % 2 == 0)
                    testMenu.addSeparator();
                else
                    testMenu.add(new JSeparator());
            }
            for (JMenuItem menuItem : miList) {
                testMenu.add(menuItem);
            }
            mcount++;
        }

        return testMenu;
    }

    /**
     * Returns menu items for a sample test menu.
     *
     * @return Menu items for a sample test menu.
     */
    public static LinkedList<LinkedList<JMenuItem>> getTestMenuItems() {
        LinkedList<LinkedList<JMenuItem>> result = new LinkedList<>();
        LinkedList<JMenuItem> list1 = new LinkedList<>();
        final JMenuItem jmi1 = new JMenuItem("Menu item enabled", se.of(16, 16));
        jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmi2 = new JMenuItem("Menu item disabled");
        jmi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,
                InputEvent.CTRL_DOWN_MASK | InputEvent.ALT_DOWN_MASK));
        jmi2.setEnabled(false);

        list1.add(jmi1);
        list1.add(jmi2);
        result.add(list1);

        LinkedList<JMenuItem> list2 = new LinkedList<>();
        final JCheckBoxMenuItem jcbmi1 = new JCheckBoxMenuItem("Check enabled selected");
        jcbmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        jcbmi1.setSelected(true);
        JCheckBoxMenuItem jcbmi2 = new JCheckBoxMenuItem("Check enabled unselected", br.of(16, 16));
        jcbmi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        jcbmi2.setSelected(false);
        JCheckBoxMenuItem jcbmi3 = new JCheckBoxMenuItem("Check disabled selected");
        jcbmi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        jcbmi3.setSelected(true);
        jcbmi3.setEnabled(false);
        final JCheckBoxMenuItem jcbmi4 = new JCheckBoxMenuItem("Check disabled unselected");
        jcbmi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
        jcbmi4.setSelected(false);
        jcbmi4.setEnabled(false);

        list2.add(jcbmi1);
        list2.add(jcbmi2);
        list2.add(jcbmi3);
        list2.add(jcbmi4);
        result.add(list2);

        LinkedList<JMenuItem> list3 = new LinkedList<>();
        final JRadioButtonMenuItem jrbmi1 = new JRadioButtonMenuItem("Radio enabled selected",
                il.of(16, 16));
        jrbmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));
        jrbmi1.setSelected(true);
        JRadioButtonMenuItem jrbmi2 = new JRadioButtonMenuItem("Radio enabled unselected");
        jrbmi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_DOWN_MASK));
        jrbmi2.setSelected(false);
        ButtonGroup bgRadioMenu1 = new ButtonGroup();
        bgRadioMenu1.add(jrbmi1);
        bgRadioMenu1.add(jrbmi2);
        JRadioButtonMenuItem jrbmi3 = new JRadioButtonMenuItem("Radio disabled selected");
        jrbmi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
        jrbmi3.setSelected(true);
        jrbmi3.setEnabled(false);
        JRadioButtonMenuItem jrbmi4 = new JRadioButtonMenuItem("Radio disabled unselected");
        jrbmi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.CTRL_DOWN_MASK));
        jrbmi4.setSelected(false);
        jrbmi4.setEnabled(false);
        ButtonGroup bgRadioMenu2 = new ButtonGroup();
        bgRadioMenu2.add(jrbmi3);
        bgRadioMenu2.add(jrbmi4);

        list3.add(jrbmi1);
        list3.add(jrbmi2);
        list3.add(jrbmi3);
        list3.add(jrbmi4);
        result.add(list3);

        LinkedList<JMenuItem> list4 = new LinkedList<>();
        JMenuItem themed1 = new JMenuItem("Themed enabled", ic_info_black_24px.of(16, 16));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(themed1,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
        JMenuItem themed2 = new JMenuItem("Themed disabled", ic_info_black_24px.of(16, 16));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(themed2,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
        themed2.setEnabled(false);
        JCheckBoxMenuItem themed3 = new JCheckBoxMenuItem("Themed selected enabled",
                ic_info_black_24px.of(16, 16));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(themed3,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
        themed3.setSelected(true);
        JCheckBoxMenuItem themed4 = new JCheckBoxMenuItem("Themed selected disabled",
                ic_info_black_24px.of(16, 16));
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(themed4,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
        themed4.setSelected(true);
        themed4.setEnabled(false);

        list4.add(themed1);
        list4.add(themed2);
        list4.add(themed3);
        list4.add(themed4);
        result.add(list4);

        LinkedList<JMenuItem> list5 = new LinkedList<>();
        JMenu submenu1 = new JMenu("submenu1");
        submenu1.setIcon(de.of(16, 16));
        submenu1.add(new JMenuItem("submenu item1", fi.of(16, 16)));
        submenu1.add(new JMenuItem("submenu item2"));
        submenu1.add(new JMenuItem("submenu item3"));
        JMenu submenu11 = new JMenu("submenu1-1");
        submenu11.add(new JMenuItem("submenu item111"));
        submenu11.add(new JMenuItem("submenu item112"));
        submenu11.add(new JMenuItem("submenu item113"));
        submenu11.add(new JMenuItem("submenu item114", fr.of(16, 16)));
        submenu1.add(submenu11);
        JMenu submenu12 = new JMenu("submenu1-2");
        submenu12.add(new JMenuItem("submenu item121", jp.of(16, 16)));
        submenu12.add(new JMenuItem("submenu item122"));
        submenu12.add(new JMenuItem("submenu item123"));
        submenu12.add(new JMenuItem("submenu item124"));
        submenu1.add(submenu12);
        JMenu submenu13 = new JMenu("submenu1-3");
        submenu13.add(new JMenuItem("submenu item131"));
        submenu13.add(new JMenuItem("submenu item132"));
        submenu13.add(new JMenuItem("submenu item133"));
        submenu13.add(new JMenuItem("submenu item134"));
        submenu13.add(new JMenuItem("submenu item135"));
        submenu1.add(submenu13);
        list5.add(submenu1);

        JMenu submenu2 = new JMenu("submenu2");
        submenu2.add(new JMenuItem("submenu item1"));
        submenu2.add(new JMenuItem("submenu item2"));
        submenu2.add(new JMenuItem("submenu item3"));
        JMenu submenu21 = new JMenu("submenu2-1");
        submenu21.add(new JMenuItem("submenu item211"));
        submenu21.add(new JMenuItem("submenu item212"));
        submenu21.add(new JMenuItem("submenu item213"));
        submenu21.add(new JMenuItem("submenu item214"));
        submenu2.add(submenu21);
        JMenu submenu22 = new JMenu("submenu2-2");
        submenu22.add(new JMenuItem("submenu item221"));
        submenu22.add(new JMenuItem("submenu item222"));
        submenu22.add(new JMenuItem("submenu item223"));
        submenu22.add(new JMenuItem("submenu item224"));
        submenu2.add(submenu22);
        JMenu submenu23 = new JMenu("submenu2-3");
        submenu23.add(new JMenuItem("submenu item231"));
        submenu23.add(new JMenuItem("submenu item232"));
        submenu23.add(new JMenuItem("submenu item233"));
        submenu23.add(new JMenuItem("submenu item234"));
        submenu2.add(submenu23);
        list5.add(submenu2);

        JMenu submenu3 = new JMenu("submenu3 (disabled)");
        submenu3.setEnabled(false);
        list5.add(submenu3);

        result.add(list5);

        return result;
    }

    /**
     * Returns menu for setting skins.
     *
     * @return Menu for setting skins.
     */
    public static JMenu getSkinMenu() {
        JMenu jmSkin = new JMenu("Skins");
        Map<String, SkinInfo> skinMap = RadianceThemingCortex.GlobalScope.getAllSkins();
        for (final Map.Entry<String, SkinInfo> entry : skinMap.entrySet()) {
            JMenuItem jmiSkin = new JMenuItem(entry.getValue().getDisplayName());
            jmiSkin.addActionListener(actionEvent -> {
                String skinClassName = entry.getValue().getClassName();
                boolean status = RadianceThemingCortex.GlobalScope.setSkin(skinClassName);
                if (!status) {
                    System.out.println("Failed to set " + skinClassName);
                }
            });

            jmSkin.add(jmiSkin);
        }

        jmSkin.addSeparator();
        final CustomSkin customSkin = new CustomSkin();
        JMenuItem jmiSkin = new JMenuItem(customSkin.getDisplayName());
        jmiSkin.addActionListener(actionEvent -> RadianceThemingCortex.GlobalScope.setSkin(customSkin));
        final CustomAccentedSkin customAccentedSkin = new CustomAccentedSkin();
        JMenuItem jmiAccentedSkin = new JMenuItem(customAccentedSkin.getDisplayName());
        jmiAccentedSkin.addActionListener(actionEvent -> RadianceThemingCortex.GlobalScope.setSkin(customAccentedSkin));
        final CustomFocusSkin customFocusSkin = new CustomFocusSkin();
        JMenuItem jmiFocusSkin = new JMenuItem(customFocusSkin.getDisplayName());
        jmiFocusSkin.addActionListener(actionEvent -> RadianceThemingCortex.GlobalScope.setSkin(customFocusSkin));

        jmSkin.add(jmiSkin);
        jmSkin.add(jmiAccentedSkin);
        jmSkin.add(jmiFocusSkin);

        return jmSkin;
    }

    protected static class CustomAccentedSkin extends NebulaAccentedSkin {
        public CustomAccentedSkin() {
            super(new AccentBuilder().withWindowChromeAccent(new OliveColorScheme()));
        }

        @Override
        public String getDisplayName() {
            return "Nebula Olive";
        }
    }

    protected static class CustomFocusSkin extends GraphiteSkin {
        public CustomFocusSkin() {
            super();

            this.setOverlayColor(Color.red, RadianceThemingSlices.ColorOverlayType.FOCUS_INDICATION,
                    DecorationAreaType.NONE, ComponentState.getAllStates());
        }

        @Override
        public String getDisplayName() {
            return "Graphite Red Focus";
        }
    }

    protected static class CustomSkin extends RadianceSkin {
        @Override
        public String getDisplayName() {
            return "Custom";
        }

        public CustomSkin() {
            RadianceColorScheme activeScheme = new OrangeColorScheme().shade(0.2).invert();
            RadianceColorScheme enabledScheme = new MetallicColorScheme();
            RadianceColorScheme disabledScheme = new LightGrayColorScheme();

            RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
                    activeScheme, enabledScheme, disabledScheme);
            defaultSchemeBundle.registerHighlightAlpha(0.6f, ComponentState.ROLLOVER_UNSELECTED);
            defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.SELECTED);
            defaultSchemeBundle.registerHighlightAlpha(0.95f, ComponentState.ROLLOVER_SELECTED);
            defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
            defaultSchemeBundle.registerHighlightColorScheme(activeScheme, ComponentState.ROLLOVER_SELECTED,
                    ComponentState.ROLLOVER_UNSELECTED, ComponentState.SELECTED,
                    ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
            this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);

            RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(
                    activeScheme.saturate(0.3), activeScheme, disabledScheme);
            this.registerDecorationAreaSchemeBundle(headerSchemeBundle,
                    activeScheme.saturate(0.3),
                    DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
                    DecorationAreaType.HEADER);

            this.borderPainter = new ClassicBorderPainter();
            this.fillPainter = new GlassFillPainter();
            this.buttonShaper = new ClassicButtonShaper();
            this.decorationPainter = new ArcDecorationPainter();
            this.highlightPainter = new GlassHighlightPainter();
        }
    }

    public static JMenu getTransformMenu() {
        JMenu jmTransform = new JMenu("Transforms");

        JMenuItem itemShade = new JMenuItem("Shade 10%");
        itemShade.addActionListener(new SkinChanger(
                scheme -> scheme.shade(0.1), "Shaded current"));
        jmTransform.add(itemShade);

        JMenuItem itemTone = new JMenuItem("Tone 10%");
        itemTone.addActionListener(new SkinChanger(
                scheme -> scheme.tone(0.1), "Toned current"));
        jmTransform.add(itemTone);

        JMenuItem itemTint = new JMenuItem("Tint 10%");
        itemTint.addActionListener(new SkinChanger(
                scheme -> scheme.tint(0.1), "Tinted current"));
        jmTransform.add(itemTint);

        JMenuItem itemHueShift = new JMenuItem("Hue shift 10%");
        itemHueShift.addActionListener(new SkinChanger(
                scheme -> scheme.hueShift(0.1), "Hue shifted current"));
        jmTransform.add(itemHueShift);

        JMenuItem itemSaturate = new JMenuItem("Saturate 10%");
        itemSaturate.addActionListener(new SkinChanger(
                scheme -> scheme.saturate(0.1), "Saturated current"));
        jmTransform.add(itemSaturate);

        JMenuItem itemDesaturate = new JMenuItem("Desaturate 10%");
        itemDesaturate.addActionListener(new SkinChanger(
                scheme -> scheme.saturate(-0.1), "Desaturated current"));
        jmTransform.add(itemDesaturate);

        JMenuItem itemNegate = new JMenuItem("Negate");
        itemNegate.addActionListener(new SkinChanger(
                RadianceColorScheme::negate, "Negated current"));
        jmTransform.add(itemNegate);

        JMenuItem itemInvert = new JMenuItem("Invert");
        itemInvert.addActionListener(new SkinChanger(
                RadianceColorScheme::invert, "Inverted current"));
        jmTransform.add(itemInvert);

        return jmTransform;
    }

    public static JMenu getLookAndFeelMenu(JFrame frame) {
        JMenu lafMenu = new JMenu("Look & feel");
        JMenu coreLafMenus = new JMenu("Core LAFs");
        lafMenu.add(coreLafMenus);
        coreLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "System",
                UIManager.getSystemLookAndFeelClassName()));
        coreLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Metal",
                "javax.swing.plaf.metal.MetalLookAndFeel"));
        coreLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Windows",
                "com.sun.java.swing.plaf.windows.WindowsLookAndFeel"));
        coreLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Windows Classic",
                "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"));
        coreLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Motif",
                "com.sun.java.swing.plaf.motif.MotifLookAndFeel"));
        coreLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Nimbus",
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"));

        JMenu customLafMenus = new JMenu("Custom LAFs");
        lafMenu.add(customLafMenus);
        JMenu jgoodiesMenu = new JMenu("JGoodies family");
        customLafMenus.add(jgoodiesMenu);
        jgoodiesMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JGoodies Plastic",
                "com.jgoodies.looks.plastic.PlasticLookAndFeel"));
        jgoodiesMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JGoodies PlasticXP",
                "com.jgoodies.looks.plastic.PlasticXPLookAndFeel"));
        jgoodiesMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JGoodies Plastic3D",
                "com.jgoodies.looks.plastic.Plastic3DLookAndFeel"));
        jgoodiesMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JGoodies Windows",
                "com.jgoodies.looks.windows.WindowsLookAndFeel"));

        JMenu syntheticaMenu = new JMenu("Synthetica family");
        customLafMenus.add(syntheticaMenu);
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica Standard",
                "de.javasoft.synthetica.standard.SyntheticaStandardLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica Classy",
                "de.javasoft.synthetica.classy.SyntheticaClassyLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica Dark",
                "de.javasoft.synthetica.dark.SyntheticaDarkLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica Plain",
                "de.javasoft.synthetica.plain.SyntheticaPlainLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica Simple2D",
                "de.javasoft.synthetica.simple2d.SyntheticaSimple2DLookAndFeel"));
        syntheticaMenu.addSeparator();

        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica AluOxide",
                "de.javasoft.synthetica.aluoxide.SyntheticaAluOxideLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica BlackEye",
                "de.javasoft.synthetica.blackeye.SyntheticaBlackEyeLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica BlackMoon",
                "de.javasoft.synthetica.blackmoon.SyntheticaBlackMoonLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica BlackStar",
                "de.javasoft.synthetica.blackstar.SyntheticaBlackStarLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica BlueIce",
                "de.javasoft.synthetica.blueice.SyntheticaBlueIceLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica BlueLight",
                "de.javasoft.synthetica.bluelight.SyntheticaBlueLightLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica BlueMoon",
                "de.javasoft.synthetica.bluemoon.SyntheticaBlueMoonLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica BlueSteel",
                "de.javasoft.synthetica.bluesteel.SyntheticaBlueSteelLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica GreenDream",
                "de.javasoft.synthetica.greendream.SyntheticaGreenDreamLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica MauveMetallic",
                "de.javasoft.synthetica.mauvemetallic.SyntheticaMauveMetallicLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica OrangeMetallic",
                "de.javasoft.synthetica.orangemetallic.SyntheticaOrangeMetallicLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica SilverMoon",
                "de.javasoft.synthetica.silvermoon.SyntheticaSilverMoonLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica SkyMetallic",
                "de.javasoft.synthetica.skymetallic.SyntheticaSkyMetallicLookAndFeel"));
        syntheticaMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Synthetica WhiteVision",
                "de.javasoft.synthetica.whitevision.SyntheticaWhiteVisionLookAndFeel"));

        JMenu flatMenu = new JMenu("Flat family");
        customLafMenus.add(flatMenu);
        flatMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Flat Light",
                "com.formdev.flatlaf.FlatLightLaf"));
        flatMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Flat Dark",
                "com.formdev.flatlaf.FlatDarkLaf"));
        flatMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Flat IntelliJ",
                "com.formdev.flatlaf.FlatIntelliJLaf"));
        flatMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Flat Darcula",
                "com.formdev.flatlaf.FlatDarculaLaf"));

        JMenu darkMenu = new JMenu("Dark family");
        customLafMenus.add(darkMenu);
        darkMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Default",
                "com.github.weisj.darklaf.DarkLaf"));
        darkMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Darcula Theme",
                "com.github.weisj.darklaf.theme.laf.DarculaThemeDarklafLookAndFeel"));
        darkMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "High Contrast Dark Theme",
                "com.github.weisj.darklaf.theme.laf.HighContrastDarkThemeDarklafLookAndFeel"));
        darkMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "High Contrast Light Theme",
                "com.github.weisj.darklaf.theme.laf.HighContrastLightThemeDarklafLookAndFeel"));
        darkMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "IntelliJ Theme",
                "com.github.weisj.darklaf.theme.laf.IntelliJThemeDarklafLookAndFeel"));
        darkMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "One Dark Theme",
                "com.github.weisj.darklaf.theme.laf.OneDarkThemeDarklafLookAndFeel"));
        darkMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Solarized Dark Theme",
                "com.github.weisj.darklaf.theme.laf.SolarizedDarkThemeDarklafLookAndFeel"));
        darkMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Solarized Light Theme",
                "com.github.weisj.darklaf.theme.laf.SolarizedLightThemeDarklafLookAndFeel"));

        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Darcula",
                "com.bulenkov.darcula.DarculaLaf"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Material",
                "mdlaf.MaterialLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "WebLaf",
                "com.alee.laf.WebLookAndFeel"));

        // From this point it's look-and-feels that are not actively developed anymore
        customLafMenus.addSeparator();

        JMenu jtattooMenu = new JMenu("JTattoo family");
        customLafMenus.add(jtattooMenu);
        jtattooMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JTattoo Acryl",
                "com.jtattoo.plaf.acryl.AcrylLookAndFeel"));
        jtattooMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JTattoo Aero",
                "com.jtattoo.plaf.aero.AeroLookAndFeel"));
        jtattooMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JTattoo Aluminium",
                "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel"));
        jtattooMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JTattoo Bernstein",
                "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel"));
        jtattooMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JTattoo Fast",
                "com.jtattoo.plaf.fast.FastLookAndFeel"));
        jtattooMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JTattoo HiFi",
                "com.jtattoo.plaf.hifi.HiFiLookAndFeel"));
        jtattooMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JTattoo Luna",
                "com.jtattoo.plaf.luna.LunaLookAndFeel"));
        jtattooMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JTattoo McWin",
                "com.jtattoo.plaf.mcwin.McWinLookAndFeel"));
        jtattooMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JTattoo Mint",
                "com.jtattoo.plaf.mint.MintLookAndFeel"));
        jtattooMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "JTattoo Smart",
                "com.jtattoo.plaf.smart.SmartLookAndFeel"));

        JMenu officeMenu = new JMenu("Office family");
        customLafMenus.add(officeMenu);
        officeMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Office 2003",
                "org.fife.plaf.Office2003.Office2003LookAndFeel"));
        officeMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Office XP",
                "org.fife.plaf.OfficeXP.OfficeXPLookAndFeel"));
        officeMenu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Visual Studio 2005",
                "org.fife.plaf.VisualStudio2005.VisualStudio2005LookAndFeel"));

        JMenu a03Menu = new JMenu("A03 family");
        customLafMenus.add(a03Menu);
        a03Menu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "A03 Basic",
                "a03.swing.plaf.basic.A03BasicLookAndFeel"));
        a03Menu.add(RadianceLookAndFeelChanger.getMenuItem(frame, "A03 Aphrodite",
                "a03.swing.plaf.aphrodite.A03AphroditeLookAndFeel"));

        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Alloy",
                "com.incors.plaf.alloy.AlloyLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "BeautyEye Cross",
                "org.jb2011.lnf.beautyeye.BeautyEyeLookAndFeelCross"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "BeautyEye Win",
                "org.jb2011.lnf.beautyeye.BeautyEyeLookAndFeelWin"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Cezanne Textile",
                "de.centigrade.laf.textile.TextileLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "EaSynth",
                "com.easynth.lookandfeel.EaSynthLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "FH",
                "com.shfarr.ui.plaf.fh.FhLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Hippo",
                "se.diod.hippo.plaf.HippoLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "InfoNode",
                "net.infonode.gui.laf.InfoNodeLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Kunststoff",
                "com.incors.plaf.kunststoff.KunststoffLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Liquid",
                "com.birosoft.liquid.LiquidLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Lipstik",
                "com.lipstikLF.LipstikLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Metouia",
                "net.sourceforge.mlf.metouia.MetouiaLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Napkin",
                "napkin.NapkinLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "NimROD",
                "com.nilo.plaf.nimrod.NimRODLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Oyoaha",
                "com.oyoaha.swing.plaf.oyoaha.OyoahaLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Pagosoft",
                "com.pagosoft.plaf.PgsLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Quaqua",
                "ch.randelshofer.quaqua.QuaquaLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Sea Glass",
                "com.seaglasslookandfeel.SeaGlassLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Simple",
                "com.memoire.slaf.SlafLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Skin",
                "com.l2fprod.gui.plaf.skin.SkinLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Smooth Metal",
                "smooth.metal.SmoothLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Squareness",
                "net.beeger.squareness.SquarenessLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Tiny",
                "de.muntjak.tinylookandfeel.TinyLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Tonic",
                "com.digitprop.tonic.TonicLookAndFeel"));
        customLafMenus.add(RadianceLookAndFeelChanger.getMenuItem(frame, "Trendy",
                "com.Trendy.swing.plaf.TrendyLookAndFeel"));

        return lafMenu;
    }

    protected static class SkinChanger implements ActionListener {
        protected ColorSchemeTransform transform;

        protected String name;

        public SkinChanger(ColorSchemeTransform transform, String name) {
            super();
            this.transform = transform;
            this.name = name;
        }

        public void actionPerformed(ActionEvent e) {
            SwingUtilities.invokeLater(() -> {
                RadianceSkin newSkin = RadianceThemingCortex.GlobalScope.getCurrentSkin()
                        .transform(transform, name);
                RadianceThemingCortex.GlobalScope.setSkin(newSkin);
            });
        }
    }
}
