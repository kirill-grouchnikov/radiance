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
package org.pushingpixels.substance.api;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.internal.contrib.jgoodies.looks.LookUtils;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.SubstancePluginRepository;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.ui.*;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import javax.swing.plaf.basic.BasicLookAndFeel;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Base class for <b>Substance </b> look and feel. There are three options to use Substance in your
 * application:
 * </p>
 *
 * <ul>
 * <li>Use {@link UIManager#setLookAndFeel(javax.swing.LookAndFeel)} or
 * {@link UIManager#setLookAndFeel(String)} passing one of the core skin-based look-and-feels in the
 * <code>org.pushingpixels.substance.api.skin</code> package.</li>
 * <li>Extend this class, pass a skin instance to the {@link #SubstanceLookAndFeel(SubstanceSkin)}
 * constructor, and then use {@link UIManager#setLookAndFeel(javax.swing.LookAndFeel)}.</li>
 * <li>Call {@link SubstanceCortex.GlobalScope#setSkin(String)} or
 * {@link SubstanceCortex.GlobalScope#setSkin(SubstanceSkin)} static methods. These methods do not
 * require Substance to be the current look-and-feel.</li>
 * </ul>
 *
 * @author Kirill Grouchnikov
 */
public abstract class SubstanceLookAndFeel extends BasicLookAndFeel {
    /**
     * The skin of this look-and-feel instance.
     */
    private SubstanceSkin skin;

    /**
     * The name of this look-and-feel instance.
     */
    private String name;

    private AWTEventListener awtEventListener;

    /**
     * Creates a new skin-based Substance look-and-feel.
     *
     * @param skin Skin.
     */
    protected SubstanceLookAndFeel(SubstanceSkin skin) {
        this.skin = skin;
        this.name = "Substance " + skin.getDisplayName();
    }

    @Override
    public String getDescription() {
        return "Substance Look and Feel by Kirill Grouchnikov";
    }

    @Override
    public String getID() {
        return this.name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isNativeLookAndFeel() {
        return false;
    }

    @Override
    public boolean isSupportedLookAndFeel() {
        return true;
    }

    @Override
    protected void initClassDefaults(UIDefaults table) {
        super.initClassDefaults(table);

        Object[] uiDefaults = {
                "ButtonUI", SubstanceButtonUI.class.getName(),
                "CheckBoxUI", SubstanceCheckBoxUI.class.getName(),
                "ComboBoxUI", SubstanceComboBoxUI.class.getName(),
                "CheckBoxMenuItemUI", SubstanceCheckBoxMenuItemUI.class.getName(),
                "DesktopIconUI", SubstanceDesktopIconUI.class.getName(),
                "DesktopPaneUI", SubstanceDesktopPaneUI.class.getName(),
                "EditorPaneUI", SubstanceEditorPaneUI.class.getName(),
                "FileChooserUI", SubstanceFileChooserUI.class.getName(),
                "FormattedTextFieldUI", SubstanceFormattedTextFieldUI.class.getName(),
                "InternalFrameUI", SubstanceInternalFrameUI.class.getName(),
                "LabelUI", SubstanceLabelUI.class.getName(),
                "ListUI", SubstanceListUI.class.getName(),
                "MenuUI", SubstanceMenuUI.class.getName(),
                "MenuBarUI", SubstanceMenuBarUI.class.getName(),
                "MenuItemUI", SubstanceMenuItemUI.class.getName(),
                "OptionPaneUI", SubstanceOptionPaneUI.class.getName(),
                "PanelUI", SubstancePanelUI.class.getName(),
                "PasswordFieldUI", SubstancePasswordFieldUI.class.getName(),
                "PopupMenuUI", SubstancePopupMenuUI.class.getName(),
                "PopupMenuSeparatorUI", SubstancePopupMenuSeparatorUI.class.getName(),
                "ProgressBarUI", SubstanceProgressBarUI.class.getName(),
                "RadioButtonUI", SubstanceRadioButtonUI.class.getName(),
                "RadioButtonMenuItemUI", SubstanceRadioButtonMenuItemUI.class.getName(),
                "RootPaneUI", SubstanceRootPaneUI.class.getName(),
                "ScrollBarUI", SubstanceScrollBarUI.class.getName(),
                "ScrollPaneUI", SubstanceScrollPaneUI.class.getName(),
                "SeparatorUI", SubstanceSeparatorUI.class.getName(),
                "SliderUI", SubstanceSliderUI.class.getName(),
                "SpinnerUI", SubstanceSpinnerUI.class.getName(),
                "SplitPaneUI", SubstanceSplitPaneUI.class.getName(),
                "TabbedPaneUI", SubstanceTabbedPaneUI.class.getName(),
                "TableUI", SubstanceTableUI.class.getName(),
                "TableHeaderUI", SubstanceTableHeaderUI.class.getName(),
                "TextAreaUI", SubstanceTextAreaUI.class.getName(),
                "TextFieldUI", SubstanceTextFieldUI.class.getName(),
                "TextPaneUI", SubstanceTextPaneUI.class.getName(),
                "ToggleButtonUI", SubstanceToggleButtonUI.class.getName(),
                "ToolBarUI", SubstanceToolBarUI.class.getName(),
                "ToolBarSeparatorUI", SubstanceToolBarSeparatorUI.class.getName(),
                "ToolTipUI", SubstanceToolTipUI.class.getName(),
                "TreeUI", SubstanceTreeUI.class.getName(),
                "ViewportUI", SubstanceViewportUI.class.getName()
        };
        table.putDefaults(uiDefaults);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void initComponentDefaults(UIDefaults table) {
        super.initComponentDefaults(table);

        SubstanceCortex.GlobalScope.initFontDefaults(table);
        this.skin.addCustomEntriesToTable(table);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        if ((NeonCortex.getPlatform() != NeonCortex.Platform.MACOS)
                || !LookUtils.IS_OS_MAC_MOJAVE_OR_LATER) {
            Map<Object, Object> desktopHints =
                    (Map<Object, Object>) toolkit.getDesktopProperty("awt.font.desktophints");

            Object aaHint = (desktopHints == null) ? null :
                    desktopHints.get(RenderingHints.KEY_TEXT_ANTIALIASING);
            if (aaHint == null
                    || aaHint == RenderingHints.VALUE_TEXT_ANTIALIAS_OFF
                    || aaHint == RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT) {
                // do nothing
            } else {
                // This is needed for consistent text rendering / measurement, especially
                // in text components.
                table.put(RenderingHints.KEY_TEXT_ANTIALIASING, aaHint);
                table.put(RenderingHints.KEY_TEXT_LCD_CONTRAST,
                        desktopHints.get(RenderingHints.KEY_TEXT_LCD_CONTRAST));
            }
        }
    }

    @Override
    public UIDefaults getDefaults() {
        UIDefaults table = super.getDefaults();

        SubstancePluginRepository.getInstance().processAllDefaultsEntriesComponentPlugins(table, this.skin);
        return table;
    }

    @Override
    public void initialize() {
        super.initialize();

        SubstanceCortex.GlobalScope.setSkin(this.skin, false);

        // tracer for memory analysis
        String traceFilename = (String) UIManager.get(SubstanceSynapse.TRACE_FILE);
        if (traceFilename != null) {
            MemoryAnalyzer.commence(1000, traceFilename);
            for (SubstanceComponentPlugin plugin : SubstancePluginRepository.getInstance().getComponentPlugins())
                MemoryAnalyzer.enqueueUsage("Has plugin '" + plugin.getClass().getName() + "'");
        }

        // initialize component plugins
        SubstancePluginRepository.getInstance().initializeAllComponentPlugins();

        this.awtEventListener = (AWTEvent event) -> {
            List<AWTEventListener> eventListeners = SubstanceCoreUtilities.getAwtEventListeners();
            for (int i = eventListeners.size() - 1; i >= 0; i--) {
                eventListeners.get(i).eventDispatched(event);
            }
        };
        Toolkit.getDefaultToolkit().addAWTEventListener(this.awtEventListener,
                AWTEvent.KEY_EVENT_MASK | AWTEvent.MOUSE_EVENT_MASK | AWTEvent.MOUSE_WHEEL_EVENT_MASK);
    }

    @Override
    public void uninitialize() {
        super.uninitialize();

        Toolkit.getDefaultToolkit().removeAWTEventListener(this.awtEventListener);

        SubstanceCortex.GlobalScope.unsetSkin();

        SubstanceCoreUtilities.stopThreads();

        // uninitialize component plugins
        SubstancePluginRepository.getInstance().uninitializeAllComponentPlugins();

        // clear caches
        LazyResettableHashMap.reset();
    }

    @Override
    public boolean getSupportsWindowDecorations() {
        return true;
    }

    @Override
    public Icon getDisabledIcon(JComponent component, Icon icon) {
        if (icon == null) {
            return null;
        }
        SubstanceColorScheme colorScheme = SubstanceColorSchemeUtilities.getColorScheme(component,
                ComponentState.DISABLED_UNSELECTED);
        BufferedImage result = SubstanceImageCreator.getColorSchemeImage(component, icon, colorScheme, 0.5f);
        float alpha = SubstanceColorSchemeUtilities.getAlpha(component,
                ComponentState.DISABLED_UNSELECTED);
        if (alpha < 1.0f) {
            BufferedImage intermediate = SubstanceCoreUtilities
                    .getBlankUnscaledImage(result.getWidth(), result.getHeight());
            Graphics2D g2d = intermediate.createGraphics();
            g2d.setComposite(AlphaComposite.SrcOver.derive(alpha));
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2d.drawImage(result, 0, 0, result.getWidth(), result.getHeight(), null);
            g2d.dispose();
            result = intermediate;
        }

        return new ScaleAwareImageWrapperIcon(result, NeonCortex.getScaleFactor(component));
    }
}
