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
package org.pushingpixels.substance.api;

import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.KeyboardFocusManager;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicLookAndFeel;

import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;
import org.pushingpixels.substance.internal.SubstancePluginRepository;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.contrib.jgoodies.looks.common.ShadowPopupFactory;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.MemoryAnalyzer;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceTitlePane;

/**
 * <p>
 * base class for <b>Substance </b> look and feel. There are three options to use Substance in your
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
     * Change listener on keyboard focus manager - fix for defect 208.
     */
    private PropertyChangeListener focusOwnerChangeListener;

    /**
     * The current keyboard focus manager - fix for defect 208.
     */
    private KeyboardFocusManager currentKeyboardFocusManager;

    /**
     * The skin of this look-and-feel instance.
     */
    protected SubstanceSkin skin;

    /**
     * The name of this look-and-feel instance.
     */
    protected String name;

    /**
     * Creates a new skin-based Substance look-and-feel.
     * 
     * @param skin
     *            Skin.
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

        String UI_CLASSNAME_PREFIX = "org.pushingpixels.substance.internal.ui.Substance";
        Object[] uiDefaults = {

                        "ButtonUI", UI_CLASSNAME_PREFIX + "ButtonUI",

                        "CheckBoxUI", UI_CLASSNAME_PREFIX + "CheckBoxUI",

                        "ComboBoxUI", UI_CLASSNAME_PREFIX + "ComboBoxUI",

                        "CheckBoxMenuItemUI", UI_CLASSNAME_PREFIX + "CheckBoxMenuItemUI",

                        "DesktopIconUI", UI_CLASSNAME_PREFIX + "DesktopIconUI",

                        "DesktopPaneUI", UI_CLASSNAME_PREFIX + "DesktopPaneUI",

                        "EditorPaneUI", UI_CLASSNAME_PREFIX + "EditorPaneUI",

                        "FileChooserUI", UI_CLASSNAME_PREFIX + "FileChooserUI",

                        "FormattedTextFieldUI", UI_CLASSNAME_PREFIX + "FormattedTextFieldUI",

                        "InternalFrameUI", UI_CLASSNAME_PREFIX + "InternalFrameUI",

                        "LabelUI", UI_CLASSNAME_PREFIX + "LabelUI",

                        "ListUI", UI_CLASSNAME_PREFIX + "ListUI",

                        "MenuUI", UI_CLASSNAME_PREFIX + "MenuUI",

                        "MenuBarUI", UI_CLASSNAME_PREFIX + "MenuBarUI",

                        "MenuItemUI", UI_CLASSNAME_PREFIX + "MenuItemUI",

                        "OptionPaneUI", UI_CLASSNAME_PREFIX + "OptionPaneUI",

                        "PanelUI", UI_CLASSNAME_PREFIX + "PanelUI",

                        "PasswordFieldUI", UI_CLASSNAME_PREFIX + "PasswordFieldUI",

                        "PopupMenuUI", UI_CLASSNAME_PREFIX + "PopupMenuUI",

                        "PopupMenuSeparatorUI", UI_CLASSNAME_PREFIX + "PopupMenuSeparatorUI",

                        "ProgressBarUI", UI_CLASSNAME_PREFIX + "ProgressBarUI",

                        "RadioButtonUI", UI_CLASSNAME_PREFIX + "RadioButtonUI",

                        "RadioButtonMenuItemUI", UI_CLASSNAME_PREFIX + "RadioButtonMenuItemUI",

                        "RootPaneUI", UI_CLASSNAME_PREFIX + "RootPaneUI",

                        "ScrollBarUI", UI_CLASSNAME_PREFIX + "ScrollBarUI",

                        "ScrollPaneUI", UI_CLASSNAME_PREFIX + "ScrollPaneUI",

                        "SeparatorUI", UI_CLASSNAME_PREFIX + "SeparatorUI",

                        "SliderUI", UI_CLASSNAME_PREFIX + "SliderUI",

                        "SpinnerUI", UI_CLASSNAME_PREFIX + "SpinnerUI",

                        "SplitPaneUI", UI_CLASSNAME_PREFIX + "SplitPaneUI",

                        "TabbedPaneUI", UI_CLASSNAME_PREFIX + "TabbedPaneUI",

                        "TableUI", UI_CLASSNAME_PREFIX + "TableUI",

                        "TableHeaderUI", UI_CLASSNAME_PREFIX + "TableHeaderUI",

                        "TextAreaUI", UI_CLASSNAME_PREFIX + "TextAreaUI",

                        "TextFieldUI", UI_CLASSNAME_PREFIX + "TextFieldUI",

                        "TextPaneUI", UI_CLASSNAME_PREFIX + "TextPaneUI",

                        "ToggleButtonUI", UI_CLASSNAME_PREFIX + "ToggleButtonUI",

                        "ToolBarUI", UI_CLASSNAME_PREFIX + "ToolBarUI",

                        "ToolBarSeparatorUI", UI_CLASSNAME_PREFIX + "ToolBarSeparatorUI",

                        "ToolTipUI", UI_CLASSNAME_PREFIX + "ToolTipUI",

                        "TreeUI", UI_CLASSNAME_PREFIX + "TreeUI",

                        "ViewportUI", UI_CLASSNAME_PREFIX + "ViewportUI",

        };
        table.putDefaults(uiDefaults);
    }

    @Override
    protected void initComponentDefaults(UIDefaults table) {
        super.initComponentDefaults(table);

        SubstanceCortex.GlobalScope.initFontDefaults(table);
        this.skin.addCustomEntriesToTable(table);
    }

    @Override
    public UIDefaults getDefaults() {
        UIDefaults table = super.getDefaults();

        SubstancePluginRepository.getInstance().processAllDefaultsEntriesComponentPlugins(table,
                this.skin);
        return table;
    }

    @Override
    public void initialize() {
        super.initialize();
        ShadowPopupFactory.install();

        SubstanceCortex.GlobalScope.setSkin(this.skin, false);

        // tracer for memory analysis
        String traceFilename = (String) UIManager.get(SubstanceSynapse.TRACE_FILE);
        if (traceFilename != null) {
            MemoryAnalyzer.commence(1000, traceFilename);
            for (SubstanceComponentPlugin plugin : SubstancePluginRepository.getInstance()
                    .getComponentPlugins())
                MemoryAnalyzer.enqueueUsage("Has plugin '" + plugin.getClass().getName() + "'");
        }

        // to show heap status panel in title pane?
        String heapStatusTraceFilename = (String) UIManager
                .get(SubstanceSynapse.HEAP_STATUS_TRACE_FILE);
        SubstanceTitlePane.setHeapStatusLogfileName(heapStatusTraceFilename);

        // initialize component plugins
        SubstancePluginRepository.getInstance().initializeAllComponentPlugins();

        // fix for defect 208 - tracking changes to focus owner
        // and repainting the default button
        this.focusOwnerChangeListener = (PropertyChangeEvent evt) -> {
            if ("focusOwner".equals(evt.getPropertyName())) {
                Component newFocusOwner = (Component) evt.getNewValue();
                if (newFocusOwner != null) {
                    JRootPane rootPane = SwingUtilities.getRootPane(newFocusOwner);
                    if (rootPane == null)
                        return;
                    JButton defaultButton = rootPane.getDefaultButton();
                    if (defaultButton == null)
                        return;
                    defaultButton.repaint();
                }
            }
            if ("managingFocus".equals(evt.getPropertyName())) {
                if (Boolean.FALSE.equals(evt.getNewValue())) {
                    // new keyboard focus manager has been installed
                    currentKeyboardFocusManager
                            .removePropertyChangeListener(focusOwnerChangeListener);
                    currentKeyboardFocusManager = KeyboardFocusManager
                            .getCurrentKeyboardFocusManager();
                    currentKeyboardFocusManager.addPropertyChangeListener(focusOwnerChangeListener);
                }
            }
        };
        this.currentKeyboardFocusManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        this.currentKeyboardFocusManager.addPropertyChangeListener(this.focusOwnerChangeListener);
    }

    @Override
    public void uninitialize() {
        super.uninitialize();

        SubstanceCortex.GlobalScope.unsetSkin();

        ShadowPopupFactory.uninstall();

        SubstanceCoreUtilities.stopThreads();

        // fix for defect 109 - memory leak on watermarks
        if (this.skin.getWatermark() != null)
            this.skin.getWatermark().dispose();

        // uninitialize component plugins
        SubstancePluginRepository.getInstance().uninitializeAllComponentPlugins();

        // clear caches
        LazyResettableHashMap.reset();

        this.currentKeyboardFocusManager
                .removePropertyChangeListener(this.focusOwnerChangeListener);
        this.focusOwnerChangeListener = null;
        this.currentKeyboardFocusManager = null;
    }

    @Override
    public boolean getSupportsWindowDecorations() {
        return true;
    }

    @Override
    public Icon getDisabledIcon(JComponent component, Icon icon) {
        if (icon == null)
            return null;
        SubstanceColorScheme colorScheme = SubstanceColorSchemeUtilities.getColorScheme(component,
                ComponentState.DISABLED_UNSELECTED);
        BufferedImage result = SubstanceImageCreator.getColorSchemeImage(component, icon,
                colorScheme, 0.5f);
        float alpha = SubstanceColorSchemeUtilities.getAlpha(component,
                ComponentState.DISABLED_UNSELECTED);
        if (alpha < 1.0f) {
            BufferedImage intermediate = SubstanceCoreUtilities
                    .getBlankUnscaledImage(icon.getIconWidth(), icon.getIconHeight());
            Graphics2D g2d = intermediate.createGraphics();
            g2d.setComposite(AlphaComposite.SrcOver.derive(alpha));
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2d.drawImage(result, 0, 0, result.getWidth(), result.getHeight(), null);
            g2d.dispose();
            result = intermediate;
        }

        return new SubstanceIconUIResource(result);
    }
}
