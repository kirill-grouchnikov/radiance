/*
 * Copyright (c) 2005-2019 Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.substance.main.check;

import org.pushingpixels.demo.substance.main.check.svg.flags.*;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.*;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.GlassFillPainter;
import org.pushingpixels.substance.api.painter.highlight.GlassHighlightPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.api.skin.SkinInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

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
        LinkedList<LinkedList<JMenuItem>> result = new LinkedList<LinkedList<JMenuItem>>();
        LinkedList<JMenuItem> list1 = new LinkedList<JMenuItem>();
        final JMenuItem jmi1 = new JMenuItem("Menu item enabled", se.of(16, 16));
        jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK));
        JMenuItem jmi2 = new JMenuItem("Menu item disabled");
        jmi2.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_B, Event.CTRL_MASK | Event.ALT_MASK));
        jmi2.setEnabled(false);

        list1.add(jmi1);
        list1.add(jmi2);
        result.add(list1);

        LinkedList<JMenuItem> list2 = new LinkedList<JMenuItem>();
        final JCheckBoxMenuItem jcbmi1 = new JCheckBoxMenuItem("Check enabled selected");
        jcbmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK));
        jcbmi1.setSelected(true);
        JCheckBoxMenuItem jcbmi2 = new JCheckBoxMenuItem("Check enabled unselected", br.of(16, 16));
        jcbmi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, Event.CTRL_MASK));
        jcbmi2.setSelected(false);
        JCheckBoxMenuItem jcbmi3 = new JCheckBoxMenuItem("Check disabled selected");
        jcbmi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, Event.CTRL_MASK));
        jcbmi3.setSelected(true);
        jcbmi3.setEnabled(false);
        final JCheckBoxMenuItem jcbmi4 = new JCheckBoxMenuItem("Check disabled unselected");
        jcbmi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, Event.CTRL_MASK));
        jcbmi4.setSelected(false);
        jcbmi4.setEnabled(false);

        list2.add(jcbmi1);
        list2.add(jcbmi2);
        list2.add(jcbmi3);
        list2.add(jcbmi4);
        result.add(list2);

        LinkedList<JMenuItem> list3 = new LinkedList<JMenuItem>();
        final JRadioButtonMenuItem jrbmi1 = new JRadioButtonMenuItem("Radio enabled selected",
                il.of(16, 16));
        jrbmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK));
        jrbmi1.setSelected(true);
        JRadioButtonMenuItem jrbmi2 = new JRadioButtonMenuItem("Radio enabled unselected");
        jrbmi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, Event.CTRL_MASK));
        jrbmi2.setSelected(false);
        ButtonGroup bgRadioMenu1 = new ButtonGroup();
        bgRadioMenu1.add(jrbmi1);
        bgRadioMenu1.add(jrbmi2);
        JRadioButtonMenuItem jrbmi3 = new JRadioButtonMenuItem("Radio disabled selected");
        jrbmi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, Event.CTRL_MASK));
        jrbmi3.setSelected(true);
        jrbmi3.setEnabled(false);
        JRadioButtonMenuItem jrbmi4 = new JRadioButtonMenuItem("Radio disabled unselected");
        jrbmi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, Event.CTRL_MASK));
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

        LinkedList<JMenuItem> list4 = new LinkedList<JMenuItem>();
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
        list4.add(submenu1);

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
        list4.add(submenu2);

        JMenu submenu3 = new JMenu("submenu3 (disabled)");
        submenu3.setEnabled(false);
        list4.add(submenu3);

        result.add(list4);

        return result;
    }

    /**
     * Returns menu for setting skins.
     * 
     * @return Menu for setting skins.
     */
    public static JMenu getSkinMenu() {
        JMenu jmSkin = new JMenu("Skins");
        Map<String, SkinInfo> skinMap = SubstanceCortex.GlobalScope.getAllSkins();
        for (final Map.Entry<String, SkinInfo> entry : skinMap.entrySet()) {
            JMenuItem jmiSkin = new JMenuItem(entry.getValue().getDisplayName());
            jmiSkin.addActionListener((ActionEvent e) -> {
                String skinClassName = entry.getValue().getClassName();
                boolean status = SubstanceCortex.GlobalScope.setSkin(skinClassName);
                if (!status) {
                    System.out.println("Failed to set " + skinClassName);
                }
            });

            jmSkin.add(jmiSkin);
        }

        jmSkin.addSeparator();
        final CustomSkin customSkin = new CustomSkin();
        JMenuItem jmiSkin = new JMenuItem(customSkin.getDisplayName());
        jmiSkin.addActionListener(
                (ActionEvent e) -> SubstanceCortex.GlobalScope.setSkin(customSkin));

        jmSkin.add(jmiSkin);

        return jmSkin;
    }

    protected static class CustomSkin extends SubstanceSkin {
        @Override
        public String getDisplayName() {
            return "Custom";
        }

        public CustomSkin() {
            SubstanceColorScheme activeScheme = new OrangeColorScheme().shade(0.2).invert();
            SubstanceColorScheme enabledScheme = new MetallicColorScheme();
            SubstanceColorScheme disabledScheme = new LightGrayColorScheme();

            SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
                    activeScheme, enabledScheme, disabledScheme);
            defaultSchemeBundle.registerHighlightColorScheme(activeScheme, 0.6f,
                    ComponentState.ROLLOVER_UNSELECTED);
            defaultSchemeBundle.registerHighlightColorScheme(activeScheme, 0.8f,
                    ComponentState.SELECTED);
            defaultSchemeBundle.registerHighlightColorScheme(activeScheme, 0.95f,
                    ComponentState.ROLLOVER_SELECTED);
            defaultSchemeBundle.registerHighlightColorScheme(activeScheme, 0.8f,
                    ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
            this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);

            SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(
                    activeScheme.saturate(0.3), activeScheme, disabledScheme);
            this.registerDecorationAreaSchemeBundle(headerSchemeBundle,
                    headerSchemeBundle.getActiveColorScheme(),
                    DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
                    DecorationAreaType.HEADER);

            this.borderPainter = new ClassicBorderPainter();
            this.fillPainter = new GlassFillPainter();
            this.buttonShaper = new ClassicButtonShaper();
            this.decorationPainter = new ArcDecorationPainter();
            this.highlightPainter = new GlassHighlightPainter();

            this.tabFadeStart = 1.0f;
            this.tabFadeEnd = 1.0f;
        }
    }

    public static JMenu getTransformMenu() {
        JMenu jmTransform = new JMenu("Transforms");

        JMenuItem itemShade = new JMenuItem("Shade 10%");
        itemShade.addActionListener(new SkinChanger(
                (SubstanceColorScheme scheme) -> scheme.shade(0.1), "Shaded current"));
        jmTransform.add(itemShade);

        JMenuItem itemTone = new JMenuItem("Tone 10%");
        itemTone.addActionListener(new SkinChanger(
                (SubstanceColorScheme scheme) -> scheme.tone(0.1), "Toned current"));
        jmTransform.add(itemTone);

        JMenuItem itemTint = new JMenuItem("Tint 10%");
        itemTint.addActionListener(new SkinChanger(
                (SubstanceColorScheme scheme) -> scheme.tint(0.1), "Tinted current"));
        jmTransform.add(itemTint);

        JMenuItem itemHueShift = new JMenuItem("Hue shift 10%");
        itemHueShift.addActionListener(new SkinChanger(
                (SubstanceColorScheme scheme) -> scheme.hueShift(0.1), "Hue shifted current"));
        jmTransform.add(itemHueShift);

        JMenuItem itemSaturate = new JMenuItem("Saturate 10%");
        itemSaturate.addActionListener(new SkinChanger(
                (SubstanceColorScheme scheme) -> scheme.saturate(0.1), "Saturated current"));
        jmTransform.add(itemSaturate);

        JMenuItem itemDesaturate = new JMenuItem("Desaturate 10%");
        itemDesaturate.addActionListener(new SkinChanger(
                (SubstanceColorScheme scheme) -> scheme.saturate(-0.1), "Desaturated current"));
        jmTransform.add(itemDesaturate);

        JMenuItem itemNegate = new JMenuItem("Negate");
        itemNegate.addActionListener(new SkinChanger(
                (SubstanceColorScheme scheme) -> scheme.negate(), "Negated current"));
        jmTransform.add(itemNegate);

        JMenuItem itemInvert = new JMenuItem("Invert");
        itemInvert.addActionListener(new SkinChanger(
                (SubstanceColorScheme scheme) -> scheme.invert(), "Inverted current"));
        jmTransform.add(itemInvert);

        return jmTransform;
    }

    public static JMenu getLookAndFeelMenu(JFrame frame) {
        JMenu lafMenu = new JMenu("Look & feel");
        JMenu coreLafMenus = new JMenu("Core LAFs");
        lafMenu.add(coreLafMenus);
        coreLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "System",
                UIManager.getSystemLookAndFeelClassName()));
        coreLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Metal",
                "javax.swing.plaf.metal.MetalLookAndFeel"));
        coreLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Windows",
                "com.sun.java.swing.plaf.windows.WindowsLookAndFeel"));
        coreLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Windows Classic",
                "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"));
        coreLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Motif",
                "com.sun.java.swing.plaf.motif.MotifLookAndFeel"));
        coreLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Nimbus",
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"));

        JMenu customLafMenus = new JMenu("Custom LAFs");
        lafMenu.add(customLafMenus);
        JMenu jgoodiesMenu = new JMenu("JGoodies family");
        customLafMenus.add(jgoodiesMenu);
        jgoodiesMenu.add(SubstanceLafChanger.getMenuItem(frame, "JGoodies Plastic",
                "com.jgoodies.looks.plastic.PlasticLookAndFeel"));
        jgoodiesMenu.add(SubstanceLafChanger.getMenuItem(frame, "JGoodies PlasticXP",
                "com.jgoodies.looks.plastic.PlasticXPLookAndFeel"));
        jgoodiesMenu.add(SubstanceLafChanger.getMenuItem(frame, "JGoodies Plastic3D",
                "com.jgoodies.looks.plastic.Plastic3DLookAndFeel"));
        jgoodiesMenu.add(SubstanceLafChanger.getMenuItem(frame, "JGoodies Windows",
                "com.jgoodies.looks.windows.WindowsLookAndFeel"));

        JMenu jtattooMenu = new JMenu("JTattoo family");
        customLafMenus.add(jtattooMenu);
        jtattooMenu.add(SubstanceLafChanger.getMenuItem(frame, "JTattoo Acryl",
                "com.jtattoo.plaf.acryl.AcrylLookAndFeel"));
        jtattooMenu.add(SubstanceLafChanger.getMenuItem(frame, "JTattoo Aero",
                "com.jtattoo.plaf.aero.AeroLookAndFeel"));
        jtattooMenu.add(SubstanceLafChanger.getMenuItem(frame, "JTattoo Aluminium",
                "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel"));
        jtattooMenu.add(SubstanceLafChanger.getMenuItem(frame, "JTattoo Bernstein",
                "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel"));
        jtattooMenu.add(SubstanceLafChanger.getMenuItem(frame, "JTattoo Fast",
                "com.jtattoo.plaf.fast.FastLookAndFeel"));
        jtattooMenu.add(SubstanceLafChanger.getMenuItem(frame, "JTattoo HiFi",
                "com.jtattoo.plaf.hifi.HiFiLookAndFeel"));
        jtattooMenu.add(SubstanceLafChanger.getMenuItem(frame, "JTattoo Luna",
                "com.jtattoo.plaf.luna.LunaLookAndFeel"));
        jtattooMenu.add(SubstanceLafChanger.getMenuItem(frame, "JTattoo McWin",
                "com.jtattoo.plaf.mcwin.McWinLookAndFeel"));
        jtattooMenu.add(SubstanceLafChanger.getMenuItem(frame, "JTattoo Mint",
                "com.jtattoo.plaf.mint.MintLookAndFeel"));
        jtattooMenu.add(SubstanceLafChanger.getMenuItem(frame, "JTattoo Smart",
                "com.jtattoo.plaf.smart.SmartLookAndFeel"));

        JMenu syntheticaMenu = new JMenu("Synthetica family");
        customLafMenus.add(syntheticaMenu);
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica standard",
                "de.javasoft.synthetica.standard.SyntheticaStandardLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica plain",
                "de.javasoft.synthetica.plain.SyntheticaPlainLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica dark",
                "de.javasoft.synthetica.dark.SyntheticaDarkLookAndFeel"));
        syntheticaMenu.addSeparator();

        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica BlackEye",
                "de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica BlackMoon",
                "de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica BlackStar",
                "de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica BlueIce",
                "de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica BlueMoon",
                "de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica BlueSteel",
                "de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica GreenDream",
                "de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica MauveMetallic",
                "de.javasoft.plaf.synthetica.SyntheticaMauveMetallicLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica OrangeMetallic",
                "de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica SkyMetallic",
                "de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica SilverMoon",
                "de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel"));
        syntheticaMenu.add(SubstanceLafChanger.getMenuItem(frame, "Synthetica WhiteVision",
                "de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel"));

        JMenu officeMenu = new JMenu("Office family");
        customLafMenus.add(officeMenu);
        officeMenu.add(SubstanceLafChanger.getMenuItem(frame, "Office 2003",
                "org.fife.plaf.Office2003.Office2003LookAndFeel"));
        officeMenu.add(SubstanceLafChanger.getMenuItem(frame, "Office XP",
                "org.fife.plaf.OfficeXP.OfficeXPLookAndFeel"));
        officeMenu.add(SubstanceLafChanger.getMenuItem(frame, "Visual Studio 2005",
                "org.fife.plaf.VisualStudio2005.VisualStudio2005LookAndFeel"));

        customLafMenus.add(
                SubstanceLafChanger.getMenuItem(frame, "A03", "a03.swing.plaf.A03LookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Alloy",
                "com.incors.plaf.alloy.AlloyLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "BeautyEye Cross",
                "org.jb2011.lnf.beautyeye.BeautyEyeLookAndFeelCross"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "BeautyEye Win",
                "org.jb2011.lnf.beautyeye.BeautyEyeLookAndFeelWin"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Cezanne Textile",
                "de.centigrade.laf.textile.TextileLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Darcula",
                "com.bulenkov.darcula.DarculaLaf"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "EaSynth",
                "com.easynth.lookandfeel.EaSynthLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "FH",
                "com.shfarr.ui.plaf.fh.FhLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Hippo",
                "se.diod.hippo.plaf.HippoLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "InfoNode",
                "net.infonode.gui.laf.InfoNodeLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Kunststoff",
                "com.incors.plaf.kunststoff.KunststoffLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Liquid",
                "com.birosoft.liquid.LiquidLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Lipstik",
                "com.lipstikLF.LipstikLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Metouia",
                "net.sourceforge.mlf.metouia.MetouiaLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Napkin",
                "napkin.NapkinLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Nimbus",
                "org.jdesktop.swingx.plaf.nimbus.NimbusLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "NimROD",
                "com.nilo.plaf.nimrod.NimRODLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Oyoaha",
                "com.oyoaha.swing.plaf.oyoaha.OyoahaLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Pagosoft",
                "com.pagosoft.plaf.PgsLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Quaqua",
                "ch.randelshofer.quaqua.QuaquaLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Sea Glass",
                "com.seaglasslookandfeel.SeaGlassLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Simple",
                "com.memoire.slaf.SlafLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Skin",
                "com.l2fprod.gui.plaf.skin.SkinLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Smooth Metal",
                "smooth.metal.SmoothLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Squareness",
                "net.beeger.squareness.SquarenessLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Tiny",
                "de.muntjak.tinylookandfeel.TinyLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Tonic",
                "com.digitprop.tonic.TonicLookAndFeel"));
        customLafMenus.add(SubstanceLafChanger.getMenuItem(frame, "Trendy",
                "com.Trendy.swing.plaf.TrendyLookAndFeel"));
        customLafMenus.add(
                SubstanceLafChanger.getMenuItem(frame, "WebLaf", "com.alee.laf.WebLookAndFeel"));
        customLafMenus.add(
                SubstanceLafChanger.getMenuItem(frame, "Material", "mdlaf.MaterialLookAndFeel"));

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
                SubstanceSkin newSkin = SubstanceCortex.GlobalScope.getCurrentSkin()
                        .transform(transform, name);
                SubstanceCortex.GlobalScope.setSkin(newSkin);
            });
        }
    }
}
