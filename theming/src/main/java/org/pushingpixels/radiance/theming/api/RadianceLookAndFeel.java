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
package org.pushingpixels.radiance.theming.api;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.internal.contrib.jgoodies.looks.LookUtils;
import org.pushingpixels.radiance.theming.internal.RadiancePluginRepository;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.ui.*;
import org.pushingpixels.radiance.theming.internal.utils.LazyResettableHashMap;
import org.pushingpixels.radiance.theming.internal.utils.MemoryAnalyzer;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import javax.swing.plaf.basic.BasicLookAndFeel;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Base class for <b>Radiance </b> look and feel. There are three options to use Radiance in your
 * application:
 * </p>
 *
 * <ul>
 * <li>Use {@link UIManager#setLookAndFeel(javax.swing.LookAndFeel)} or
 * {@link UIManager#setLookAndFeel(String)} passing one of the core skin-based look-and-feels in the
 * <code>org.pushingpixels.radiance.theming.api.skin</code> package.</li>
 * <li>Extend this class, pass a skin instance to the {@link #RadianceLookAndFeel(RadianceSkin)}
 * constructor, and then use {@link UIManager#setLookAndFeel(javax.swing.LookAndFeel)}.</li>
 * <li>Call {@link RadianceThemingCortex.GlobalScope#setSkin(String)} or
 * {@link RadianceThemingCortex.GlobalScope#setSkin(RadianceSkin)} static methods. These methods do not
 * require Radiance to be the current look-and-feel.</li>
 * </ul>
 *
 * @author Kirill Grouchnikov
 */
public abstract class RadianceLookAndFeel extends BasicLookAndFeel {
    /**
     * The skin of this look-and-feel instance.
     */
    private RadianceSkin skin;

    /**
     * The name of this look-and-feel instance.
     */
    private String name;

    private AWTEventListener awtEventListener;

    /**
     * Creates a new skin-based Radiance look-and-feel.
     *
     * @param skin Skin.
     */
    protected RadianceLookAndFeel(RadianceSkin skin) {
        this.skin = skin;
        this.name = "Radiance " + skin.getDisplayName();
    }

    @Override
    public String getDescription() {
        return "Radiance Look and Feel by Kirill Grouchnikov";
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
                "ButtonUI", RadianceButtonUI.class.getName(),
                "CheckBoxUI", RadianceCheckBoxUI.class.getName(),
                "ComboBoxUI", RadianceComboBoxUI.class.getName(),
                "CheckBoxMenuItemUI", RadianceCheckBoxMenuItemUI.class.getName(),
                "DesktopIconUI", RadianceDesktopIconUI.class.getName(),
                "DesktopPaneUI", RadianceDesktopPaneUI.class.getName(),
                "EditorPaneUI", RadianceEditorPaneUI.class.getName(),
                "FileChooserUI", RadianceFileChooserUI.class.getName(),
                "FormattedTextFieldUI", RadianceFormattedTextFieldUI.class.getName(),
                "InternalFrameUI", RadianceInternalFrameUI.class.getName(),
                "LabelUI", RadianceLabelUI.class.getName(),
                "ListUI", RadianceListUI.class.getName(),
                "MenuUI", RadianceMenuUI.class.getName(),
                "MenuBarUI", RadianceMenuBarUI.class.getName(),
                "MenuItemUI", RadianceMenuItemUI.class.getName(),
                "OptionPaneUI", RadianceOptionPaneUI.class.getName(),
                "PanelUI", RadiancePanelUI.class.getName(),
                "PasswordFieldUI", RadiancePasswordFieldUI.class.getName(),
                "PopupMenuUI", RadiancePopupMenuUI.class.getName(),
                "PopupMenuSeparatorUI", RadiancePopupMenuSeparatorUI.class.getName(),
                "ProgressBarUI", RadianceProgressBarUI.class.getName(),
                "RadioButtonUI", RadianceRadioButtonUI.class.getName(),
                "RadioButtonMenuItemUI", RadianceRadioButtonMenuItemUI.class.getName(),
                "RootPaneUI", RadianceRootPaneUI.class.getName(),
                "ScrollBarUI", RadianceScrollBarUI.class.getName(),
                "ScrollPaneUI", RadianceScrollPaneUI.class.getName(),
                "SeparatorUI", RadianceSeparatorUI.class.getName(),
                "SliderUI", RadianceSliderUI.class.getName(),
                "SpinnerUI", RadianceSpinnerUI.class.getName(),
                "SplitPaneUI", RadianceSplitPaneUI.class.getName(),
                "TabbedPaneUI", RadianceTabbedPaneUI.class.getName(),
                "TableUI", RadianceTableUI.class.getName(),
                "TableHeaderUI", RadianceTableHeaderUI.class.getName(),
                "TextAreaUI", RadianceTextAreaUI.class.getName(),
                "TextFieldUI", RadianceTextFieldUI.class.getName(),
                "TextPaneUI", RadianceTextPaneUI.class.getName(),
                "ToggleButtonUI", RadianceToggleButtonUI.class.getName(),
                "ToolBarUI", RadianceToolBarUI.class.getName(),
                "ToolBarSeparatorUI", RadianceToolBarSeparatorUI.class.getName(),
                "ToolTipUI", RadianceToolTipUI.class.getName(),
                "TreeUI", RadianceTreeUI.class.getName(),
                "ViewportUI", RadianceViewportUI.class.getName()
        };
        table.putDefaults(uiDefaults);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void initComponentDefaults(UIDefaults table) {
        super.initComponentDefaults(table);

        RadianceThemingCortex.GlobalScope.initFontDefaults(table);
        this.skin.addCustomEntriesToTable(table);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        if ((RadianceCommonCortex.getPlatform() != RadianceCommonCortex.Platform.MACOS)
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

        RadiancePluginRepository.getInstance().processAllDefaultsEntriesComponentPlugins(table, this.skin);
        return table;
    }

    @Override
    public void initialize() {
        super.initialize();

        RadianceThemingCortex.GlobalScope.setSkin(this.skin, false);

        // tracer for memory analysis
        String traceFilename = (String) UIManager.get(RadianceSynapse.TRACE_FILE);
        if (traceFilename != null) {
            MemoryAnalyzer.commence(1000, traceFilename);
            for (RadianceThemingComponentPlugin plugin : RadiancePluginRepository.getInstance().getComponentPlugins())
                MemoryAnalyzer.enqueueUsage("Has plugin '" + plugin.getClass().getName() + "'");
        }

        // initialize component plugins
        RadiancePluginRepository.getInstance().initializeAllComponentPlugins();

        this.awtEventListener = (AWTEvent event) -> {
            List<AWTEventListener> eventListeners = RadianceCoreUtilities.getAwtEventListeners();
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

        RadianceThemingCortex.GlobalScope.unsetSkin();

        RadianceCoreUtilities.stopThreads();

        // uninitialize component plugins
        RadiancePluginRepository.getInstance().uninitializeAllComponentPlugins();

        // clear caches
        LazyResettableHashMap.reset();
    }

    @Override
    public boolean getSupportsWindowDecorations() {
        return true;
    }

    @Override
    public Icon getDisabledIcon(JComponent component, Icon icon) {
        // Radiance no longer provides its own implementation of this method. It does
        // not scale well for skins that have different color treatments for different
        // decoration areas. It also does not provide enough flexibility for creating
        // visuals of disabled icons based on a single color vs based on a color scheme
        // that matches the disabled component state.
        //
        // Use RadianceThemingCortex.GlobalScope.setIconFilterStrategies and
        // RadianceThemingCortex.ComponentScope.setIconFilterStrategies for configuring the
        // visual appearance of icons on disabled components.
        return icon;
    }
}
