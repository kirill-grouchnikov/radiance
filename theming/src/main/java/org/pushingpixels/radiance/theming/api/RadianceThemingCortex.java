/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.common.api.font.FontPolicy;
import org.pushingpixels.radiance.common.api.font.FontSet;
import org.pushingpixels.radiance.theming.api.combo.ComboPopupPrototypeCallback;
import org.pushingpixels.radiance.theming.api.icon.RadianceDefaultIconPack;
import org.pushingpixels.radiance.theming.api.icon.RadianceIconPack;
import org.pushingpixels.radiance.theming.api.painter.preview.DefaultPreviewPainter;
import org.pushingpixels.radiance.theming.api.painter.preview.PreviewPainter;
import org.pushingpixels.radiance.theming.api.password.PasswordStrengthChecker;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;
import org.pushingpixels.radiance.theming.api.shaper.PillButtonShaper;
import org.pushingpixels.radiance.theming.api.shaper.RadianceButtonShaper;
import org.pushingpixels.radiance.theming.api.skin.SkinChangeListener;
import org.pushingpixels.radiance.theming.api.skin.SkinInfo;
import org.pushingpixels.radiance.theming.api.tabbed.BaseTabCloseListener;
import org.pushingpixels.radiance.theming.api.tabbed.TabCloseCallback;
import org.pushingpixels.radiance.theming.api.titlepane.TitlePaneButtonProvider;
import org.pushingpixels.radiance.theming.api.titlepane.TitlePaneButtonsProvider;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.theming.internal.RadianceThemingWidgetRepository;
import org.pushingpixels.radiance.theming.internal.RadiancePluginRepository;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.ui.RadianceRootPaneUI;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;

/**
 * This class is the only officially-supported entry point into configuring the behavior of
 * Radiance-powered UIs and for querying the state of such UIs. <b>All</b> APIs in this class
 * should be called when Radiance is the currently set look-and-feel unless explicitly stated
 * otherwise. The API surface of this class is broken into a number of scopes, with every scope
 * applying at the specific granularity level of control:
 *
 * <ul>
 * <li>{@link GlobalScope} - configuring and querying the global state of the application.</li>
 * <li>{@link WindowScope} - configuring and querying state at the level of the application
 * {@link Window}s.</li>
 * <li>{@link RootPaneScope} - configuring and querying state at the level of the application
 * {@link JRootPane}s.</li>
 * <li>{@link ComponentScope} - configuring and querying state at the level of the application
 * {@link Component}s.</li>
 * <li>{@link ComponentOrParentScope} - configuring and querying state at the level of individual
 * application {@link Component}s or all immediate child components of a container.</li>
 * <li>{@link ComponentOrParentChainScope} - configuring and querying state at the level of
 * individual application {@link Component}s or all nested child components of a container.
 * </ul>
 *
 * @author Kirill Grouchnikov
 */
public class RadianceThemingCortex {
    // No-op private constructor to prevent application code from directly creating instances
    private RadianceThemingCortex() {
    }

    /**
     * APIs in this scope apply to the global state of the application.
     */
    public static final class GlobalScope {
        private final static String RADIANCE_FONT_POLICY_KEY =
                "radiance.theming.internal.fontPolicyKey";

        /**
         * Resource bundle for <b>Radiance</b> labels.
         */
        private static ResourceBundle labelBundle = null;

        /**
         * Class loader for {@link #labelBundle}.
         */
        private static ClassLoader labelBundleClassLoader;

        /**
         * The current Radiance skin.
         */
        private static RadianceSkin currentSkin = null;

        /**
         * List of all listeners on skin changes.
         */
        private final static Set<SkinChangeListener> skinChangeListeners = new
                HashSet<>();

        /**
         * List of all listeners on changing locales.
         */
        private final static Set<RadianceThemingSlices.LocaleChangeListener> localeChangeListeners = new
                HashSet<>();

        private static RadianceIconPack iconPack;

        private static RadianceThemingSlices.ButtonOrder buttonBarButtonOrder =
                RadianceThemingSlices.ButtonOrder.PLATFORM;

        private static RadianceThemingSlices.HorizontalGravity buttonBarGravity =
                RadianceThemingSlices.HorizontalGravity.PLATFORM;

        /**
         * Sets the specified skin. If the current look-and-feel is not Radiance, this method will
         * create a new Radiance look-and-feel based on the specified skin and set it on
         * {@link UIManager}. This method does not require Radiance to be the current
         * look-and-feel.
         *
         * @param newSkin         Skin to set.
         * @param toUpdateWindows if <code>true</code>, the
         *                        {@link SwingUtilities#updateComponentTreeUI(Component)} is
         *                        called on all windows returned by {@link Window#getWindows()} API.
         * @return <code>true</code> if the specified skin has been set successfully,
         * <code>false</code> otherwise.
         * @see #setSkin(RadianceSkin)
         */
        static boolean setSkin(RadianceSkin newSkin, boolean toUpdateWindows) {
            if (!SwingUtilities.isEventDispatchThread()) {
                throw new IllegalStateException("This method must be called on the Event Dispatch Thread");
            }

            if (!newSkin.isValid())
                return false;

            boolean isRadiance = (UIManager.getLookAndFeel() instanceof RadianceLookAndFeel);
            if (!isRadiance) {
                class SkinDerivedLookAndFeel extends RadianceLookAndFeel {
                    public SkinDerivedLookAndFeel(RadianceSkin newSkin) {
                        super(newSkin);
                    }
                }

                LookAndFeel derived = new SkinDerivedLookAndFeel(newSkin);
                try {
                    UIManager.setLookAndFeel(derived);
                } catch (UnsupportedLookAndFeelException ulafe) {
                    ulafe.printStackTrace(System.err);
                    return false;
                }
                if (!(UIManager.getLookAndFeel() instanceof RadianceLookAndFeel)) {
                    return false;
                }
                for (Window window : Window.getWindows()) {
                    SwingUtilities.updateComponentTreeUI(window);
                }
                return true;
            }

            try {
                // Required skin settings must be non-null
                if (!newSkin.isValid()) {
                    return false;
                }

                UIDefaults lafDefaults = UIManager.getLookAndFeelDefaults();
                // The table will be null when the skin is set using a custom LAF
                if (lafDefaults != null) {
                    initFontDefaults(lafDefaults, getFontPolicy().getFontSet());
                    newSkin.addCustomEntriesToTable(lafDefaults);
                    RadiancePluginRepository.getInstance()
                            .processAllDefaultsEntriesComponentPlugins(lafDefaults, newSkin);
                }

                // file chooser strings go to the main UIManager table
                ResourceBundle radianceBundle = getLabelBundle();
                Enumeration<String> keyEn = radianceBundle.getKeys();
                while (keyEn.hasMoreElements()) {
                    String key = keyEn.nextElement();
                    if (key.contains("FileChooser")) {
                        String value = radianceBundle.getString(key);
                        UIManager.put(key, value);
                    }
                }

                LazyResettableHashMap.reset();

                currentSkin = newSkin;

                if (toUpdateWindows) {
                    RadianceCoreUtilities.updateActiveUi();
                }

                for (SkinChangeListener skinChangeListener : skinChangeListeners) {
                    skinChangeListener.skinChanged();
                }
                return true;
            } catch (NoClassDefFoundError | Exception e) {
                e.printStackTrace(System.err);
                return false;
            }
        }

        static void unsetSkin() {
            currentSkin = null;
        }

        /**
         * Sets the specified skin. If the current look-and-feel is not Radiance, this method will
         * create a new Radiance look-and-feel based on the specified skin and set it on
         * {@link UIManager}. This method does not require Radiance to be the current
         * look-and-feel. Calling this method will call
         * {@link SwingUtilities#updateComponentTreeUI(Component)} on all open top-level windows.
         *
         * @param newSkin Skin to set.
         * @return <code>true</code> if the specified skin has been set successfully,
         * <code>false</code> otherwise.
         * @throws IllegalStateException When called outside the Event Dispatch Thread.
         * @see #registerSkinChangeListener(SkinChangeListener)
         * @see #unregisterSkinChangeListener(SkinChangeListener)
         * @see #setSkin(String)
         * @see RootPaneScope#setSkin(JRootPane, RadianceSkin)
         * @see RadianceSkin#isValid()
         */
        public static boolean setSkin(RadianceSkin newSkin) {
            return setSkin(newSkin, true);
        }

        /**
         * Sets the specified skin. If the current look-and-feel is not Radiance, this method will
         * create a new Radiance look-and-feel based on the specified skin and set it on
         * {@link UIManager}. This method does not require Radiance to be the current
         * look-and-feel. Calling this method will call
         * {@link SwingUtilities#updateComponentTreeUI(Component)} on all open top-level windows.
         *
         * @param skinClassName Skin to set.
         * @return <code>true</code> if the specified skin has been set successfully,
         * <code>false</code> otherwise.
         * @throws IllegalStateException When called outside the Event Dispatch Thread.
         * @see #setSkin(RadianceSkin)
         * @see #registerSkinChangeListener(SkinChangeListener)
         * @see #unregisterSkinChangeListener(SkinChangeListener)
         * @see #setSkin(RadianceSkin)
         * @see RootPaneScope#setSkin(JRootPane, RadianceSkin)
         * @see RadianceSkin#isValid()
         */
        public static boolean setSkin(String skinClassName) {
            try {
                Class<?> skinClass = Class.forName(skinClassName);
                if (skinClass == null) {
                    return false;
                }
                Object obj = skinClass.getDeclaredConstructor().newInstance();
                if (obj == null) {
                    return false;
                }
                if (!(obj instanceof RadianceSkin)) {
                    return false;
                }
                return setSkin((RadianceSkin) obj);
            } catch (Exception exc) {
                exc.printStackTrace();
                return false;
            }
        }

        /**
         * Returns the current global skin. If the current look-and-feel is not Radiance, this
         * method returns <code>null</code>.
         *
         * @return Current global skin.
         */
        public static RadianceSkin getCurrentSkin() {
            LookAndFeel current = UIManager.getLookAndFeel();
            if (current instanceof RadianceLookAndFeel) {
                return currentSkin;
            }
            return null;
        }

        /**
         * Looks up the correct control font and sets it for all controls.
         *
         * @param table The UI defaults table.
         */
        static void initFontDefaults(UIDefaults table) {
            FontSet radianceFontSet = getFontPolicy().getFontSet();
            initFontDefaults(table, radianceFontSet);
        }

        /**
         * Sets Fonts in the given FontSet as defaults for all known component types in the given
         * UIDefaults table.
         *
         * @param table   the UIDefaults table used to set fonts
         * @param fontSet describes the set of Fonts to be installed
         */
        private static void initFontDefaults(UIDefaults table, FontSet fontSet) {
            Font controlFont = fontSet.getControlFont();
            Font menuFont = fontSet.getMenuFont();
            Font messageFont = fontSet.getMessageFont();
            Font toolTipFont = fontSet.getSmallFont();
            Font titleFont = fontSet.getTitleFont();
            Font windowFont = fontSet.getWindowTitleFont();

            Object[] defaults = {

                    "Button.font", controlFont,

                    "CheckBox.font", controlFont,

                    "ColorChooser.font", controlFont,

                    "ComboBox.font", controlFont,

                    "EditorPane.font", controlFont,

                    "FormattedTextField.font", controlFont,

                    "Label.font", controlFont,

                    "List.font", controlFont,

                    "Panel.font", controlFont,

                    "PasswordField.font", controlFont,

                    "ProgressBar.font", controlFont,

                    "RadioButton.font", controlFont,

                    "ScrollPane.font", controlFont,

                    "Spinner.font", controlFont,

                    "TabbedPane.font", controlFont,

                    "Table.font", controlFont,

                    "TableHeader.font", controlFont,

                    "TextArea.font", controlFont,

                    "TextField.font", controlFont,

                    "TextPane.font", controlFont,

                    "ToolBar.font", controlFont,

                    "ToggleButton.font", controlFont,

                    "Tree.font", controlFont,

                    "Viewport.font", controlFont,

                    "InternalFrame.titleFont", windowFont,

                    "DesktopIcon.titleFont", windowFont,

                    "OptionPane.font", messageFont,

                    "OptionPane.messageFont", messageFont,

                    "OptionPane.buttonFont", messageFont,

                    "TitledBorder.font", titleFont,

                    "ToolTip.font", toolTipFont,

                    "CheckBoxMenuItem.font", menuFont,

                    "CheckBoxMenuItem.acceleratorFont", menuFont,

                    "Menu.font", menuFont,

                    "Menu.acceleratorFont", menuFont,

                    "MenuBar.font", menuFont,

                    "MenuItem.font", menuFont,

                    "MenuItem.acceleratorFont", menuFont,

                    "PopupMenu.font", menuFont,

                    "RadioButtonMenuItem.font", menuFont,

                    "RadioButtonMenuItem.acceleratorFont", menuFont,};
            table.putDefaults(defaults);
        }

        /**
         * Registers a new listener on skin change.
         *
         * @param skinChangeListener New listener on skin change.
         * @see #setSkin(String)
         * @see #setSkin(RadianceSkin)
         * @see #unregisterSkinChangeListener(SkinChangeListener)
         */
        public static void registerSkinChangeListener(SkinChangeListener skinChangeListener) {
            skinChangeListeners.add(skinChangeListener);
        }

        /**
         * Unregisters a listener on skin change.
         *
         * @param skinChangeListener The listener to unregister.
         * @see #setSkin(String)
         * @see #setSkin(RadianceSkin)
         * @see #registerSkinChangeListener(SkinChangeListener)
         */
        public static void unregisterSkinChangeListener(SkinChangeListener skinChangeListener) {
            skinChangeListeners.remove(skinChangeListener);
        }

        /**
         * Returns all available skins.
         *
         * @return All available skins. Key - skin display name, value - skin information.
         */
        public static Map<String, SkinInfo> getAllSkins() {
            Map<String, SkinInfo> result = new TreeMap<>();
            for (RadianceThemingSkinPlugin skinPlugin : RadiancePluginRepository.getInstance()
                    .getSkinPlugins()) {
                for (SkinInfo skinInfo : skinPlugin.getSkins()) {
                    result.put(skinInfo.getDisplayName(), skinInfo);
                }
            }
            return result;
        }

        /**
         * Registers the specified component plugin. It is recommended to call this method
         * <b>before</b> setting Radiance as the look-and-feel in your application initialization
         * sequence. If this method is called after Radiance has been set, you will need to call
         * the {@link #setSkin(String)} or {@link #setSkin(RadianceSkin)} APIs to reinitialize the
         * Radiance skin.
         *
         * @param componentPlugin Component plugin to register.
         */
        public static void registerComponentPlugin(RadianceThemingComponentPlugin componentPlugin) {
            RadiancePluginRepository.getInstance().registerComponentPlugin(componentPlugin);
        }

        /**
         * Registers the specified skin plugin.
         *
         * @param skinPlugin Skin plugin to register.
         */
        public static void registerSkinPlugin(RadianceThemingSkinPlugin skinPlugin) {
            RadiancePluginRepository.getInstance().registerSkinPlugin(skinPlugin);
        }

        public static void registerWidget(String widgetClassName, Class<?> supportedClass,
                boolean isExact) {
            RadianceThemingWidgetRepository.getRepository().registerWidget(widgetClassName,
                    supportedClass, isExact);
        }

        /**
         * Sets the {@link FontPolicy} to be used with Radiance family. If the specified policy is
         * <code>null</code>, the default will be reset. This method does not require Radiance to
         * be the current look-and-feel, and will cause Radiance to be set as the current
         * application look-and-feel.
         *
         * @param fontPolicy The {@link FontPolicy} to be used with Radiance family, or
         *                   <code>null</code> to reset to the default
         * @see #getFontPolicy()
         */
        public static void setFontPolicy(FontPolicy fontPolicy) {
            UIManager.put(RADIANCE_FONT_POLICY_KEY, fontPolicy);
            RadianceSizeUtils.setControlFontSize(-1);
            setSkin(getCurrentSkin());
        }

        /**
         * Looks up and retrieves the {@link FontPolicy} used by the Radiance family. If a
         * {@link FontPolicy} has been set, it'll be returned. If no {@link FontPolicy} has been
         * set, the default Radiance font policy will be returned.
         *
         * @return the {@link FontPolicy} set for Radiance, or the default Radiance font policy.
         * @see #setFontPolicy
         */
        public static FontPolicy getFontPolicy() {
            FontPolicy policy = (FontPolicy) UIManager.get(RADIANCE_FONT_POLICY_KEY);
            if (policy != null) {
                return policy;
            }

            // return default policy
            return RadianceCommonCortex.getDefaultFontPolicy();
        }

        /**
         * Registers the specified listener on tab-close events on <b>all</b> tabbed panes.
         *
         * @param tabCloseListener Listener to register.
         * @see ComponentScope#registerTabCloseChangeListener(JTabbedPane, BaseTabCloseListener)
         * @see #unregisterTabCloseChangeListener(BaseTabCloseListener)
         * @see #getAllTabCloseListeners()
         */
        public static void registerTabCloseChangeListener(BaseTabCloseListener tabCloseListener) {
            TabCloseListenerManager.getInstance().registerListener(tabCloseListener);
        }

        /**
         * Unregisters the specified listener on tab-close events on <b>all</b> tabbed panes.
         *
         * @param tabCloseListener Listener to unregister.
         * @see ComponentScope#unregisterTabCloseChangeListener(JTabbedPane, BaseTabCloseListener)
         * @see #registerTabCloseChangeListener(BaseTabCloseListener)
         * @see #getAllTabCloseListeners()
         */
        public static void unregisterTabCloseChangeListener(BaseTabCloseListener tabCloseListener) {
            TabCloseListenerManager.getInstance().unregisterListener(tabCloseListener);
        }

        /**
         * Returns the set of all listeners registered on tab-close events on <b>all</b> tabbed
         * panes.
         *
         * @return Set of all listeners registered on tab-close events on <b>all</b> tabbed panes.
         * @see #registerTabCloseChangeListener(BaseTabCloseListener)
         * @see #unregisterTabCloseChangeListener(BaseTabCloseListener)
         */
        public static Set<BaseTabCloseListener> getAllTabCloseListeners() {
            return TabCloseListenerManager.getInstance().getListeners();
        }

        /**
         * Sets the {@link RadianceIconPack} to be used with Radiance.
         *
         * @param iconPack The {@link RadianceIconPack} to be used with Radiance.
         * @see #getIconPack()
         */
        public static void setIconPack(RadianceIconPack iconPack) {
            if (iconPack == null) {
                throw new IllegalArgumentException("Cannot pass null icon pack");
            }
            GlobalScope.iconPack = iconPack;
            LazyResettableHashMap.reset();
        }

        /**
         * Looks up and retrieves the {@link RadianceIconPack} used by Radiance.
         *
         * @return the {@link RadianceIconPack} set for Radiance.
         * @see #setIconPack(RadianceIconPack)
         */
        public static RadianceIconPack getIconPack() {
            if (GlobalScope.iconPack == null) {
                GlobalScope.iconPack = new RadianceDefaultIconPack();
            }
            return GlobalScope.iconPack;
        }

        /**
         * Allows animations of the specified facet on all controls. Due to performance
         * considerations, this API can only be used to control renderer-based components
         * (tables, lists, trees) and custom Radiance animations (focus loop, icon glow, etc).
         *
         * @param animationFacet Animation facet to allow.
         */
        public static void allowAnimations(RadianceThemingSlices.AnimationFacet animationFacet) {
            AnimationConfigurationManager.getInstance().allowAnimations(animationFacet);
        }

        /**
         * Allows animations of the specified facet on all controls of specified class. Due to
         * performance considerations, this API can only be used to control renderer-based
         * components (tables, lists, trees) and custom Radiance animations (focus loop, icon
         * glow, etc).
         *
         * @param animationFacet Animation facet to allow.
         * @param clazz          Control class for allowing the animation facet.
         */
        public static void allowAnimations(RadianceThemingSlices.AnimationFacet animationFacet, Class<?> clazz) {
            AnimationConfigurationManager.getInstance().allowAnimations(animationFacet, clazz);
        }

        /**
         * Allows animations of the specified facet on all controls of specified classes. Due to
         * performance considerations, this API can only be used to control renderer-based
         * components (tables, lists, trees) and custom Radiance animations (focus loop, icon
         * glow, etc).
         *
         * @param animationFacet Animation facet to allow.
         * @param clazz          Control classes for allowing the animation facet.
         */
        public static void allowAnimations(RadianceThemingSlices.AnimationFacet animationFacet, Class<?>[] clazz) {
            AnimationConfigurationManager.getInstance().allowAnimations(animationFacet, clazz);
        }

        /**
         * Disallows animations of the specified facet on all controls. Due to performance
         * considerations, this API can only be used to control renderer-based components
         * (tables, lists, trees) and custom Radiance animations (focus loop, icon glow, etc).
         *
         * @param animationFacet Animation facet to disallow.
         */
        public static void disallowAnimations(RadianceThemingSlices.AnimationFacet animationFacet) {
            AnimationConfigurationManager.getInstance().disallowAnimations(animationFacet);
        }

        /**
         * Disallows animations of the specified facet on all controls of specified class. Due to
         * performance considerations, this API can only be used to control renderer-based
         * components (tables, lists, trees) and custom Radiance animations (focus loop, icon
         * glow, etc).
         *
         * @param animationFacet Animation facet to disallow.
         * @param clazz          Control class for disallowing the animation facet.
         */
        public static void disallowAnimations(RadianceThemingSlices.AnimationFacet animationFacet, Class<?> clazz) {
            AnimationConfigurationManager.getInstance().disallowAnimations(animationFacet, clazz);
        }

        /**
         * Disallows animations of the specified facet on all controls of specified classes. Due to
         * performance considerations, this API can only be used to control renderer-based
         * components (tables, lists, trees) and custom Radiance animations (focus loop, icon
         * glow, etc).
         *
         * @param animationFacet Animation facet to disallow.
         * @param clazz          Control classes for disallowing the animation facet.
         */
        public static void disallowAnimations(RadianceThemingSlices.AnimationFacet animationFacet, Class<?>[] clazz) {
            AnimationConfigurationManager.getInstance().disallowAnimations(animationFacet, clazz);
        }

        /**
         * Checks whether the specified animation facet is allowed on the specified component.
         *
         * @param animationFacet Animation facet.
         * @return <code>true</code> if the specified animation facet is allowed globally,
         * <code>false</code> otherwise.
         */
        public static boolean isAnimationAllowed(RadianceThemingSlices.AnimationFacet animationFacet) {
            return AnimationConfigurationManager.getInstance().isAnimationAllowed(animationFacet,
                    null);
        }

        public static void setTimelineDuration(long timelineDuration) {
            AnimationConfigurationManager.getInstance().setTimelineDuration(timelineDuration);
        }

        public static long getTimelineDuration() {
            return AnimationConfigurationManager.getInstance().getTimelineDuration();
        }

        /**
         * Registers a new listener on locale change.
         *
         * @param localeListener New listener on locale change.
         */
        public static void registerLocaleChangeListener(RadianceThemingSlices.LocaleChangeListener localeListener) {
            localeChangeListeners.add(localeListener);
        }

        /**
         * Unregisters a listener on locale change.
         *
         * @param localeListener The listener to unregister.
         */
        public static void unregisterLocaleChangeListener(RadianceThemingSlices.LocaleChangeListener localeListener) {
            localeChangeListeners.remove(localeListener);
        }

        /**
         * Returns all listeners registered on locale change.
         *
         * @return All listeners registered on locale change.
         */
        public static Set<RadianceThemingSlices.LocaleChangeListener> getLocaleChangeListeners() {
            return Collections.unmodifiableSet(localeChangeListeners);
        }

        /**
         * Retrieves the current label bundle.
         *
         * @return The current label bundle.
         * @see #resetLabelBundle()
         */
        public static synchronized ResourceBundle getLabelBundle() {
            if (labelBundle == null) {
                // fix for RFE 157 (allowing custom class loader for
                // resource bundles which can remove server calls
                // in applets)
                if (labelBundleClassLoader == null) {
                    labelBundle = ResourceBundle.getBundle(
                            "org.pushingpixels.radiance.theming.internal.resources.Labels",
                            Locale.getDefault());
                } else {
                    labelBundle = ResourceBundle.getBundle(
                            "org.pushingpixels.radiance.theming.internal.resources.Labels",
                            Locale.getDefault(), labelBundleClassLoader);
                }
                for (RadianceThemingSlices.LocaleChangeListener lcl : RadianceThemingCortex.GlobalScope
                        .getLocaleChangeListeners())
                    lcl.localeChanged();
            }
            return labelBundle;
        }

        /**
         * Retrieves the label bundle for the specified locale.
         *
         * @param locale Locale.
         * @return The label bundle for the specified locale.
         */
        public static synchronized ResourceBundle getLabelBundle(Locale locale) {
            // fix for RFE 157 (allowing custom class loader for
            // resource bundles which can remove server calls
            // in applets)
            if (labelBundleClassLoader == null) {
                return ResourceBundle
                        .getBundle("org.pushingpixels.radiance.theming.internal.resources.Labels", locale);
            } else {
                return ResourceBundle.getBundle(
                        "org.pushingpixels.radiance.theming.internal.resources.Labels", locale,
                        labelBundleClassLoader);
            }
        }

        /**
         * Resets the current label bundle. Useful when the application changes Locale at runtime.
         *
         * @see #getLabelBundle()
         */
        public static synchronized void resetLabelBundle() {
            labelBundle = null;
        }

        /**
         * Sets the class loader for {@link #labelBundle}.
         *
         * @param labelBundleClassLoader Class loader for {@link #labelBundle}.
         */
        public static void setLabelBundleClassLoader(ClassLoader labelBundleClassLoader) {
            GlobalScope.labelBundleClassLoader = labelBundleClassLoader;
        }

        public static ClassLoader getLabelBundleClassLoader() {
            return labelBundleClassLoader;
        }

        /**
         * Sets the new setting for the icons of the <code>JOptionPane</code>s created with
         * predefined message types. The default setting is <code>true</code> (use constant color
         * scheme). To use color scheme-consistent coloring, call this method and pass
         * <code>false</code>.
         *
         * @param useConstantThemesOnOptionPanes if <code>true</code>, the
         *                                       <code>JOptionPane</code>s created with predefined
         *                                       message types will use constant color schemes
         *                                       for the icons.
         */
        public static void setUseConstantThemesOnOptionPanes(
                Boolean useConstantThemesOnOptionPanes) {
            UIManager.put(RadianceSynapse.USE_THEMED_ICONS_ON_OPTION_PANES,
                    useConstantThemesOnOptionPanes);
            SwingUtilities.invokeLater(RadianceCoreUtilities::updateActiveUi);
        }

        /**
         * Specifies how icons on controls such as buttons, toggle buttons, labels, tabs and menu
         * items are themed.
         *
         * @param activeIconFilterStrategy   Icon filter strategy for controls in active states.
         * @param enabledIconFilterStrategy  Icon filter strategy for controls in enabled state.
         * @param disabledIconFilterStrategy Icon filter strategy for controls in disabled states.
         * @see ComponentScope#setIconFilterStrategies(JComponent, RadianceThemingSlices.IconFilterStrategy, RadianceThemingSlices.IconFilterStrategy, RadianceThemingSlices.IconFilterStrategy)
         */
        public static void setIconFilterStrategies(
                RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy) {
            UIManager.put(RadianceSynapse.ICON_FILTER_STRATEGY_ACTIVE, activeIconFilterStrategy);
            UIManager.put(RadianceSynapse.ICON_FILTER_STRATEGY_ENABLED, enabledIconFilterStrategy);
            UIManager.put(RadianceSynapse.ICON_FILTER_STRATEGY_DISABLED, disabledIconFilterStrategy);
        }

        /**
         * Returns the currently set button order for all containers that display grouped buttons,
         * such as <code>JOptionPane</code>s, for example.
         *
         * @return The currently set button order for all containers that display grouped buttons.
         * @see #setButtonBarOrder(RadianceThemingSlices.ButtonOrder)
         */
        public static RadianceThemingSlices.ButtonOrder getButtonBarOrder() {
            return buttonBarButtonOrder;
        }

        /**
         * Sets the button order for all containers that display grouped buttons, such as
         * <code>JOptionPane</code>s, for example. The default order is
         * {@link RadianceThemingSlices.ButtonOrder#PLATFORM}.
         *
         * @param buttonBarButtonOrder The new button order for all containers that display
         *                             grouped buttons. The
         *                             value cannot be <code>null</code>.
         * @see #getButtonBarOrder()
         */
        public static void setButtonBarOrder(RadianceThemingSlices.ButtonOrder buttonBarButtonOrder) {
            if (buttonBarButtonOrder == null) {
                throw new IllegalArgumentException(
                        "Cannot pass null. Did you mean PLATFORM or SWING_DEFAULT?");
            }
            GlobalScope.buttonBarButtonOrder = buttonBarButtonOrder;
            SwingUtilities.invokeLater(RadianceCoreUtilities::updateActiveUi);
        }

        /**
         * Returns the currently set button bar gravity for all containers that display grouped
         * buttons, such as <code>JOptionPane</code>s, for example.
         *
         * @return The currently set button bar gravity for all containers that display grouped
         * buttons.
         * @see #setButtonBarGravity(RadianceThemingSlices.HorizontalGravity)
         */
        public static RadianceThemingSlices.HorizontalGravity getButtonBarGravity() {
            return buttonBarGravity;
        }

        /**
         * Sets the button bar gravity for all containers that display grouped buttons, such as
         * <code>JOptionPane</code>s, for example. The default gravity is
         * {@link RadianceThemingSlices.HorizontalGravity#PLATFORM}.
         *
         * @param buttonBarGravity The new button alignment for all containers that display
         *                         grouped buttons. The
         *                         value cannot be <code>null</code>.
         * @see #getButtonBarGravity()
         */
        public static void setButtonBarGravity(RadianceThemingSlices.HorizontalGravity buttonBarGravity) {
            if (buttonBarGravity == null) {
                throw new IllegalArgumentException(
                        "Cannot pass null. Did you mean PLATFORM or SWING_DEFAULT?");
            }
            GlobalScope.buttonBarGravity = buttonBarGravity;
            SwingUtilities.invokeLater(RadianceCoreUtilities::updateActiveUi);
        }

        /**
         * Configures title pane content gravity for all decorated application windows. This will
         * only apply if you are using {@link JFrame#setDefaultLookAndFeelDecorated(boolean)} and /
         * or {@link JDialog#setDefaultLookAndFeelDecorated(boolean)} APIs with <code>true</code>.
         * The default gravities are {@link RadianceThemingSlices.HorizontalGravity#SWING_DEFAULT} and
         * {@link RadianceThemingSlices.TitleIconHorizontalGravity#SWING_DEFAULT}. Note that specific
         * windows can have the horizontal gravity of control button group set to a different value
         * with
         * {@link WindowScope#extendContentIntoTitlePane(Window, RadianceThemingSlices.HorizontalGravity, RadianceThemingSlices.VerticalGravity)}
         * API.
         *
         * @param titleTextHorizontalGravity               Horizontal gravity for the title text.
         *                                                 The value cannot be <code>null</code>.
         * @param titleControlButtonGroupHorizontalGravity Horizontal gravity for the control
         *                                                 button group. The value cannot be
         *                                                 <code>null</code> or
         *                                                 {@link RadianceThemingSlices.HorizontalGravity#CENTERED}.
         * @param titleIconHorizontalGravity               Horizontal gravity for the icon. The
         *                                                 value cannot be <code>null</code>.
         * @see WindowScope#extendContentIntoTitlePane(Window,
         * RadianceThemingSlices.HorizontalGravity,
         * RadianceThemingSlices.VerticalGravity)
         * @see #getTitleTextHorizontalGravity()
         * @see WindowScope#getTitleControlButtonGroupHorizontalGravity(Window)
         * @see #getTitleIconHorizontalGravity()
         * @see JFrame#setDefaultLookAndFeelDecorated(boolean)
         * @see JDialog#setDefaultLookAndFeelDecorated(boolean)
         */
        public static void configureTitleContentGravity(
                RadianceThemingSlices.HorizontalGravity titleTextHorizontalGravity,
                RadianceThemingSlices.HorizontalGravity titleControlButtonGroupHorizontalGravity,
                RadianceThemingSlices.TitleIconHorizontalGravity titleIconHorizontalGravity) {
            if (titleTextHorizontalGravity == null) {
                throw new IllegalArgumentException(
                        "Cannot pass null for text gravity. Did you mean PLATFORM or " +
                                "SWING_DEFAULT?");
            }
            if (titleControlButtonGroupHorizontalGravity == null) {
                throw new IllegalArgumentException(
                        "Cannot pass null for control button group horizontal gravity. Did you " +
                                "mean PLATFORM or SWING_DEFAULT?");
            }
            if (titleIconHorizontalGravity == null) {
                throw new IllegalArgumentException(
                        "Cannot pass null for icon horizontal gravity. Did you mean PLATFORM or " +
                                "SWING_DEFAULT?");
            }
            if (titleControlButtonGroupHorizontalGravity == RadianceThemingSlices.HorizontalGravity
                    .CENTERED) {
                throw new IllegalArgumentException(
                        "Cannot pass CENTERED for control button group horizontal gravity. Did " +
                                "you mean PLATFORM or SWING_DEFAULT?");
            }

            UIManager.put(RadianceSynapse.TITLE_TEXT_HORIZONTAL_GRAVITY,
                    titleTextHorizontalGravity);
            UIManager.put(RadianceSynapse.TITLE_CONTROL_BUTTON_GROUP_HORIZONTAL_GRAVITY,
                    titleControlButtonGroupHorizontalGravity);
            UIManager.put(RadianceSynapse.TITLE_ICON_HORIZONTAL_GRAVITY,
                    titleIconHorizontalGravity);
            SwingUtilities.invokeLater(RadianceCoreUtilities::updateActiveUi);
        }

        /**
         * Returns the gravity for the title text in title panes of all decorated application
         * windows.
         *
         * @return HorizontalGravity for the title text in title panes of all decorated application
         * windows.
         * @see #configureTitleContentGravity(RadianceThemingSlices.HorizontalGravity, RadianceThemingSlices.HorizontalGravity,
         * RadianceThemingSlices.TitleIconHorizontalGravity)
         * @see WindowScope#getTitleControlButtonGroupHorizontalGravity(Window)
         * @see #getTitleIconHorizontalGravity()
         */
        public static RadianceThemingSlices.HorizontalGravity getTitleTextHorizontalGravity() {
            return RadianceTitlePaneUtilities.getTitleTextHorizontalGravity();
        }

        /**
         * Returns the gravity for the icon in title panes of all decorated application windows.
         *
         * @return Horizontal gravity for the icon in title panes of all decorated application
         * windows.
         * @see #configureTitleContentGravity(RadianceThemingSlices.HorizontalGravity, RadianceThemingSlices.HorizontalGravity,
         * RadianceThemingSlices.TitleIconHorizontalGravity)
         * @see WindowScope#getTitleControlButtonGroupHorizontalGravity(Window)
         * @see #getTitleIconHorizontalGravity()
         */
        public static RadianceThemingSlices.TitleIconHorizontalGravity getTitleIconHorizontalGravity() {
            return RadianceTitlePaneUtilities.getTitleIconHorizontalGravity();
        }

        /**
         * Sets the visibility of the specified widget kind(s). This call applies to all root panes.
         * This method should not be called from inside the initialization sequence of your window.
         * If the specific widget needs to be visible when the window is shown, wrap the call with
         * {@link SwingUtilities#invokeLater(Runnable)}.
         *
         * @param visible          Visibility indication.
         * @param radianceWidgets Widget types.
         */
        public static void setWidgetVisible(boolean visible,
                RadianceThemingSlices.WidgetType... radianceWidgets) {
            RadianceWidgetManager.getInstance().register(null, visible, radianceWidgets);
            for (Window window : Window.getWindows()) {
                JRootPane root = SwingUtilities.getRootPane(window);
                SwingUtilities.updateComponentTreeUI(root);
            }
        }

        /**
         * Specifies global visibility of the lock icon on non-editable text components.
         *
         * @param visible If <code>true</code>, all non-editable text components not explicitly
         *                configured with
         *                {@link ComponentScope#setLockIconVisible(JComponent, Boolean)}
         *                will show a lock icon. Pass <code>null</code> to reset to the default
         *                behavior.
         * @see ComponentScope#setLockIconVisible(JComponent, Boolean)
         * @see GlobalScope#setExtraWidgetsPresence(Boolean)
         * @see ComponentOrParentChainScope#setExtraWidgetsPresence(JComponent, Boolean)
         */
        public static void setLockIconVisible(Boolean visible) {
            UIManager.put(RadianceSynapse.HAS_LOCK_ICON, visible);
        }

        /**
         * Specifies global visibility of the caps lock icon on password fields.
         * Note that this functionality may not be supported on all platforms. See
         * {@link Toolkit#getLockingKeyState(int)} documentation for more.
         *
         * @param visible If <code>true</code>, all password fields not explicitly
         *                configured with
         *                {@link ComponentScope#setCapsLockIconVisible(JPasswordField, Boolean)} will show an indicator
         *                icon when they are focused and caps lock is on. Pass <code>null</code> to reset to the
         *                default behavior.
         * @see ComponentScope#setCapsLockIconVisible(JPasswordField, Boolean)
         * @see GlobalScope#setExtraWidgetsPresence(Boolean)
         * @see ComponentOrParentChainScope#setExtraWidgetsPresence(JComponent, Boolean)
         */
        public static void setCapsLockIconVisible(Boolean visible) {
            UIManager.put(RadianceSynapse.HAS_CAPS_LOCK_ICON, visible);
        }

        /**
         * Specifies global preview painter to be used for showing preview thumbnails. Default
         * implementation is available in the {@link DefaultPreviewPainter}.
         *
         * @param previewPainter Global preview painter. Can be <code>null</code>.
         * @see ComponentOrParentScope#setComponentPreviewPainter(JComponent, PreviewPainter)
         */
        public static void setComponentPreviewPainter(PreviewPainter previewPainter) {
            UIManager.put(RadianceSynapse.COMPONENT_PREVIEW_PAINTER, previewPainter);
        }

        /**
         * Specifies whether the contents of text components should be selected on focus gain.
         *
         * @param selectTextOnFocus If <code>true</code>, the contents of text components will be
         *                          selected on
         *                          focus gain. Pass <code>null</code> to reset to the default
         *                          behavior.
         * @see ComponentOrParentChainScope#setSelectTextOnFocus(JComponent, Boolean)
         */
        public static void setSelectTextOnFocus(Boolean selectTextOnFocus) {
            UIManager.put(RadianceSynapse.TEXT_SELECT_ON_FOCUS, selectTextOnFocus);
        }

        /**
         * Specifies whether text components should have the edit context menu (with Cut / Copy /
         * Paste / ... menu items)
         *
         * @param hasEditContextMenu If <code>true</code>, text components will have the edit
         *                           context menu (with Cut / Copy / Paste / ... menu items). Pass <code>null</code>
         *                           to reset to the default behavior.
         * @see ComponentScope#setTextEditContextMenuPresence(JTextComponent, Boolean)
         */
        public static void setTextEditContextMenuPresence(Boolean hasEditContextMenu) {
            UIManager.put(RadianceSynapse.TEXT_EDIT_CONTEXT_MENU, hasEditContextMenu);
        }

        /**
         * Specifies whether trees should have should have automatic drag and drop support.
         *
         * @param hasAutomaticDragAndDropSupport If <code>true</code>, trees will have automatic
         *                                       drag and drop support. Pass <code>null</code> to reset to the
         *                                       default behavior.
         * @see ComponentScope#setAutomaticDragAndDropSupportPresence(JTree, Boolean)
         */
        public static void setAutomaticDragAndDropSupportPresence(
                Boolean hasAutomaticDragAndDropSupport) {
            UIManager.put(RadianceSynapse.TREE_AUTO_DND_SUPPORT, hasAutomaticDragAndDropSupport);
        }

        /**
         * Specifies whether scroll panes should have have auto-scroll support invoked on mouse
         * button click that triggers popups.
         *
         * @param hasAutomaticScroll If <code>true</code>, scroll panes will have have
         *                           auto-scroll support invoked
         *                           on mouse button click that triggers popups. Pass
         *                           <code>null</code> to reset to
         *                           the default behavior.
         * @see ComponentScope#setAutomaticScrollPresence(JScrollPane, Boolean)
         * @see GlobalScope#setExtraWidgetsPresence(Boolean)
         * @see ComponentOrParentChainScope#setExtraWidgetsPresence(JComponent, Boolean)
         */
        public static void setAutomaticScrollPresence(Boolean hasAutomaticScroll) {
            UIManager.put(RadianceSynapse.AUTO_SCROLL, hasAutomaticScroll);
        }

        /**
         * Specifies whether buttons should ignore the default (minimum) dimension. Note that
         * {@link RadianceButtonShaper} implementations are not required to respect this call. The
         * current implementations of the default {@link PillButtonShaper} and
         * {@link ClassicButtonShaper} respect this setting.
         *
         * @param buttonIgnoreMinimumSize If <code>true</code>, buttons will ignore the default
         *                                (minimum) size under button shapers that respect this setting. Pass
         *                                <code>null</code> to reset to the default behavior.
         * @see ComponentOrParentScope#setButtonIgnoreMinimumSize(JComponent, Boolean)
         */
        public static void setButtonIgnoreMinimumSize(Boolean buttonIgnoreMinimumSize) {
            UIManager.put(RadianceSynapse.BUTTON_NO_MIN_SIZE, buttonIgnoreMinimumSize);
        }

        /**
         * Specifies when components should draw their background.
         *
         * @param backgroundAppearanceStrategy Background appearance strategy. Pass
         *                                     <code>null</code> to reset to the default behavior (to <code>ALWAYS</code>)
         * @see ComponentOrParentScope#setBackgroundAppearanceStrategy(JComponent, RadianceThemingSlices.BackgroundAppearanceStrategy)
         */
        public static void setBackgroundAppearanceStrategy(
                RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {
            UIManager.put(RadianceSynapse.BACKGROUND_APPEARANCE_STRATEGY,
                    backgroundAppearanceStrategy);
        }

        /**
         * Specifies corner radius for all toolbar buttons.
         *
         * @param toolbarButtonCornerRadius Corner radius for all toolbar buttons.
         * @see ComponentScope#setToolbarButtonCornerRadius(AbstractButton, float)
         * @see ComponentOrParentChainScope#setToolbarButtonCornerRadius(JToolBar, float)
         */
        public static void setToolbarButtonCornerRadius(float toolbarButtonCornerRadius) {
            UIManager.put(RadianceSynapse.TOOLBAR_BUTTON_CORNER_RADIUS,
                    Float.valueOf(toolbarButtonCornerRadius));
        }

        /**
         * Specifies that extra UI elements (such as menu items in system menu or lock borders) can
         * be shown.
         *
         * @param extraWidgetsPresence
         *         If <code>true</code>, extra UI elements (such as menu items in system menu or
         *         lock borders) can be shown. Pass <code>null</code> to reset to the default
         *         behavior.
         * @see ComponentOrParentChainScope#setExtraWidgetsPresence(JComponent, Boolean)
         */
        public static void setExtraWidgetsPresence(Boolean extraWidgetsPresence) {
            UIManager.put(RadianceSynapse.SHOW_EXTRA_WIDGETS, extraWidgetsPresence);
        }

        /**
         * <p>
         * Specifies colorization amount applied to the background and foreground of the current
         * color scheme and all control. By default, when the application does not use any custom
         * colors, all the controls are painted with the colors of the current color scheme / skin.
         * The colors coming from the look-and-feel implement the marker {@link UIResource}
         * interface which allows the UI delegates to differentiate between application-specific
         * colors which are not changed, and the LAF-provide colors that are changed on LAF switch.
         * </p>
         *
         * <p>
         * Calling this method installs the "smart colorization" mode which uses the colors of the
         * current color scheme and the custom background / foreground colors (when installed by
         * application) to colorize the relevant portions of the control. For example, on checkbox
         * the custom background color will be used to colorize the check box itself, while the
         * custom foreground color will be applied to the check box text and the check mark.
         * </p>
         *
         * <p>
         * Value of 0.0 of colorization amount results in Radiance completely
         * <strong>ignoring</strong> the custom application background and foreground colors set on
         * the components - no colorization. Values closer to 1.0 result in almost full usage of the
         * custom application background and foreground colors set on the components. Note that in
         * order to maintain the gradients (fill, border, etc), even value of 1.0 does not result in
         * full custom color being applied to the relevant visuals of the control.
         * </p>
         *
         * <p>
         * Calling this method applies colorization amount to all components that do not specify a
         * custom value with
         * {@link ComponentOrParentChainScope#setColorizationFactor(JComponent, double)} calls.
         * </p>
         *
         * <p>
         * The default colorization amount (when this method is not called at all) is 0.5. This
         * means that applications that install custom background / foreground colors on their UI
         * controls will see them colorized with 50% "strength", even without calling this method.
         * </p>
         *
         * @param colorizationFactor Colorization factor to apply to the component and its nested
         *                           children.
         * @see ComponentOrParentChainScope#setColorizationFactor(JComponent, double)
         */
        public static void setColorizationFactor(double colorizationFactor) {
            UIManager.put(RadianceSynapse.COLORIZATION_FACTOR, Double.valueOf(colorizationFactor));
        }

        /**
         * Configures visibility of close buttons on tabbed pane tabs.
         *
         * @param tabCloseButtonsVisible If <code>true</code>, tabs in tabbed panes will show
         *                               close buttons.
         * @see ComponentScope#setTabCloseButtonVisible(JComponent, Boolean)
         * @see ComponentScope#setTabCloseButtonsVisible(JTabbedPane, Boolean)
         */
        public static void setTabCloseButtonsVisible(Boolean tabCloseButtonsVisible) {
            UIManager.put(RadianceSynapse.TABBED_PANE_CLOSE_BUTTONS, tabCloseButtonsVisible);
        }

        /**
         * Configures the callback for deciding on the tab close type on tabbed pane tabs. Note that
         * this is only relevant for tabs configured with
         * {@link ComponentScope#setTabCloseButtonVisible(JComponent, Boolean)},
         * {@link ComponentScope#setTabCloseButtonsVisible(JTabbedPane, Boolean)} and
         * {@link #setTabCloseButtonsVisible(Boolean)} APIs.
         *
         * @param tabCloseCallback Callback for deciding on the tab close type on tabbed pane tabs.
         * @see ComponentScope#setTabCloseCallback(JComponent, TabCloseCallback)
         * @see ComponentScope#setTabCloseCallback(JTabbedPane, TabCloseCallback)
         */
        public static void setTabCloseCallback(TabCloseCallback tabCloseCallback) {
            UIManager.put(RadianceSynapse.TABBED_PANE_CLOSE_CALLBACK, tabCloseCallback);
        }

        /**
         * Specifies that only the close button of a marked-as-modified tab component should
         * pulsate. By default, the animation on modified tabs is on the entire tab rectangle. Note
         * that this is only relevant for tabs configured with
         * {@link ComponentScope#setTabContentsModified(JComponent, Boolean)}
         *
         * @param runModifiedAnimationOnTabCloseButton If <code>true</code>, the
         *                                             marked-as-modified animation will run only
         *                                             on the
         *                                             tab close button.
         * @see ComponentScope#setRunModifiedAnimationOnTabCloseButton(JTabbedPane, Boolean)
         * @see ComponentScope#setRunModifiedAnimationOnTabCloseButton(JComponent, Boolean)
         */
        public static void setRunModifiedAnimationOnTabCloseButton(
                Boolean runModifiedAnimationOnTabCloseButton) {
            UIManager.put(RadianceSynapse.TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION,
                    runModifiedAnimationOnTabCloseButton);
        }

        /**
         * Specifies the content pane border kind for tabbed panes.
         *
         * @param tabContentPaneBorderKind Content pane border kind for tabbed panes.
         * @see ComponentScope#setTabContentPaneBorderKind(JTabbedPane, RadianceThemingSlices.TabContentPaneBorderKind)
         */
        public static void setTabContentPaneBorderKind(
                RadianceThemingSlices.TabContentPaneBorderKind tabContentPaneBorderKind) {
            UIManager.put(RadianceSynapse.TABBED_PANE_CONTENT_BORDER_KIND, tabContentPaneBorderKind);
        }

        /**
         * Specifies the number of echo characters for each password character in password fields.
         *
         * @param echoCount Number of echo characters for each password character in password
         *                  fields.
         * @see ComponentScope#setNumberOfPasswordEchoesPerCharacter(JPasswordField, int)
         */
        public static void setNumberOfPasswordEchoesPerCharacter(int echoCount) {
            UIManager.put(RadianceSynapse.PASSWORD_ECHO_PER_CHAR, Integer.valueOf(echoCount));
        }

        /**
         * Specifies the menu gutter fill alpha. Menu gutter is the part of the menu where
         * checkmarks and icons are painted. The current / default menu gutter fill alpha
         * can be obtained by calling {@link #getMenuGutterFillAlpha()}.
         *
         * @param menuGutterFillAlpha Menu gutter fill alpha.
         * @see #getMenuGutterFillAlpha()
         */
        public static void setMenuGutterFillAlpha(float menuGutterFillAlpha) {
            if ((menuGutterFillAlpha < 0.0f) || (menuGutterFillAlpha > 1.0f)) {
                throw new IllegalArgumentException(
                        "Menu gutter fill alpha should be in 0.0-1.0 range");
            }
            UIManager.put(RadianceSynapse.MENU_GUTTER_FILL_ALPHA, menuGutterFillAlpha);
        }

        /**
         * Returns the menu gutter fill alpha. Menu gutter is the part of the menu where
         * checkmarks and icons are painted.
         *
         * @return Menu gutter fill alpha.
         * @see #setMenuGutterFillAlpha(float)
         */
        public static float getMenuGutterFillAlpha() {
            return RadianceCoreUtilities.getMenuGutterFillAlpha();
        }

        /**
         * Specifies the trace filename. The trace file will contain output of the memory analyser
         * which can be used to pinpoint the memory leaks.
         *
         * @param traceFilename Filename for tracing the memory allocations.
         */
        public static void setTraceFilename(String traceFilename) {
            UIManager.put(RadianceSynapse.TRACE_FILE, traceFilename);
        }

        /**
         * Specifies the kind of focus indication to be used on application components.
         *
         * @param focusKind Kind of focus indication to be used on application components.
         * @see ComponentOrParentChainScope#setFocusKind(JComponent, RadianceThemingSlices.FocusKind)
         */
        public static void setFocusKind(RadianceThemingSlices.FocusKind focusKind) {
            UIManager.put(RadianceSynapse.FOCUS_KIND, focusKind);
        }

        /**
         * Specifies the combobox popup prototype callback which is used to compute the width of the
         * popups at runtime.
         *
         * @param comboPopupPrototypeCallback Popup prototype callback which is used to compute
         *                                    the width of the popups at
         *                                    runtime.
         * @see ComponentScope#setComboBoxPrototypeCallback(JComboBox, ComboPopupPrototypeCallback)
         */
        public static void setComboBoxPrototypeCallback(
                ComboPopupPrototypeCallback comboPopupPrototypeCallback) {
            UIManager.put(RadianceSynapse.COMBOBOX_POPUP_PROTOTYPE_CALLBACK, comboPopupPrototypeCallback);
        }

        /**
         * Specifies the combobox popup prototype display value which is used to compute the width
         * of the popups at runtime.
         *
         * @param comboPopupPrototypeDisplayValue Popup prototype display value which is used to
         *                                        compute the width of the popups
         *                                        at runtime.
         * @see ComponentScope#setComboBoxPrototypeDisplayValue(JComboBox, Object)
         * @see #setComboBoxPrototypeCallback(ComboPopupPrototypeCallback)
         */
        public static void setComboBoxPrototypeDisplayValue(
                Object comboPopupPrototypeDisplayValue) {
            UIManager.put(RadianceSynapse.COMBOBOX_POPUP_PROTOTYPE_OBJECT, comboPopupPrototypeDisplayValue);
        }

        /**
         * Specifies the combobox popup placement strategy. Pass <code>null</code> to reset to the
         * default placement strategy. Note that the combo arrow changes in accordance with the
         * combo popup placement strategy.
         *
         * @param comboBoxPopupPlacementStrategy Placement strategy for combobox popups.
         * @see ComponentScope#setComboBoxPopupPlacementStrategy(JComboBox, RadianceThemingSlices.PopupPlacementStrategy)
         */
        public static void setComboBoxPopupPlacementStrategy(
                RadianceThemingSlices.PopupPlacementStrategy comboBoxPopupPlacementStrategy) {
            UIManager.put(RadianceSynapse.COMBO_BOX_POPUP_PLACEMENT_STRATEGY,
                    comboBoxPopupPlacementStrategy);
        }

        public static BufferedImage getBlankImage(double scaleFactor, int width, int height) {
            return RadianceCoreUtilities.getBlankImage(scaleFactor, width, height);
        }

        public static void setUseDefaultColorChooser() {
            UIManager.put(RadianceSynapse.USE_DEFAULT_COLOR_CHOOSER, Boolean.TRUE);
        }
    }

    /**
     * APIs in this scope apply to individual application {@link Component}s.
     */
    public static final class ComponentScope {
        /**
         * Returns the current skin for the specified component. If the current look-and-feel is not
         * Radiance, this method returns <code>null</code>.
         *
         * @param c Component. May be <code>null</code> - in this case the global current
         *          Radiance skin will be returned.
         * @return Current skin for the specified component.
         * @see GlobalScope#getCurrentSkin()
         */
        public static RadianceSkin getCurrentSkin(Component c) {
            return RadianceCoreUtilities.getSkin(c);
        }

        /**
         * Registers the specified listener on tab-close events on <b>the specified</b> tabbed pane.
         *
         * @param tabbedPane       Tabbed pane. Must be not <code>null</code>.
         * @param tabCloseListener Listener to register.
         * @see GlobalScope#registerTabCloseChangeListener(BaseTabCloseListener)
         * @see #unregisterTabCloseChangeListener(JTabbedPane, BaseTabCloseListener)
         * @see #getAllTabCloseListeners(JTabbedPane)
         */
        public static void registerTabCloseChangeListener(JTabbedPane tabbedPane,
                BaseTabCloseListener tabCloseListener) {
            if (tabbedPane == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            TabCloseListenerManager.getInstance().registerListener(tabbedPane, tabCloseListener);
        }

        /**
         * Unregisters the specified listener on tab-close events on <b>the specified</b> tabbed
         * pane.
         *
         * @param tabbedPane       Tabbed pane. Must be not <code>null</code>.
         * @param tabCloseListener Listener to unregister.
         * @see GlobalScope#unregisterTabCloseChangeListener(BaseTabCloseListener)
         * @see #registerTabCloseChangeListener(JTabbedPane, BaseTabCloseListener)
         * @see #getAllTabCloseListeners(JTabbedPane)
         */
        public static void unregisterTabCloseChangeListener(JTabbedPane tabbedPane,
                BaseTabCloseListener tabCloseListener) {
            if (tabbedPane == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            TabCloseListenerManager.getInstance().unregisterListener(tabbedPane, tabCloseListener);
        }

        /**
         * Returns all listeners registered on tab closing of the specified tabbed pane.
         *
         * @param tabbedPane A tabbed pane. Must be not <code>null</code>.
         * @return All listeners registered on tab closing of the specified tabbed pane.
         * @see #registerTabCloseChangeListener(JTabbedPane, BaseTabCloseListener)
         * @see #unregisterTabCloseChangeListener(JTabbedPane, BaseTabCloseListener)
         */
        public static Set<BaseTabCloseListener> getAllTabCloseListeners(JTabbedPane tabbedPane) {
            if (tabbedPane == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            return TabCloseListenerManager.getInstance().getListeners(tabbedPane);
        }

        /**
         * Allows animations of the specified facet on the specified control. Due to performance
         * considerations, this API can only be used to control renderer-based components
         * (tables, lists, trees) and custom Radiance animations (focus loop, icon glow, etc).
         *
         * @param animationFacet Animation facet to allow.
         * @param comp           Control for allowing the animation facet.
         */
        public static void allowAnimations(Component comp, RadianceThemingSlices.AnimationFacet animationFacet) {
            if (comp == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            AnimationConfigurationManager.getInstance().allowAnimations(animationFacet, comp);
        }

        /**
         * Disallows animations of the specified facet on the specified control. Due to performance
         * considerations, this API can only be used to control renderer-based components
         * (tables, lists, trees) and custom Radiance animations (focus loop, icon glow, etc).
         *
         * @param animationFacet Animation facet to disallow.
         * @param comp           Control for disallowing the animation facet.
         */
        public static void disallowAnimations(Component comp, RadianceThemingSlices.AnimationFacet animationFacet) {
            if (comp == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            AnimationConfigurationManager.getInstance().disallowAnimations(animationFacet, comp);
        }

        /**
         * Checks whether the specified animation facet is allowed on the specified component.
         *
         * @param animationFacet Animation facet.
         * @param comp           Component.
         * @return <code>true</code> if the specified animation facet is allowed on the specified
         * component, <code>false</code> otherwise.
         */
        public static boolean isAnimationAllowed(Component comp, RadianceThemingSlices.AnimationFacet animationFacet) {
            if (comp == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            return AnimationConfigurationManager.getInstance().isAnimationAllowed(animationFacet,
                    comp);
        }

        /**
         * Returns the immediate decoration area type of the specified component. The component is
         * checked for the registered decoration area type. If
         * {@link ComponentOrParentChainScope#setDecorationType(JComponent, RadianceThemingSlices.DecorationAreaType)}
         * was not called on this component, this method returns <code>null</code>.
         *
         * @param comp Component.
         * @return Immediate decoration area type of the component.
         * @see ComponentOrParentChainScope#setDecorationType(JComponent, RadianceThemingSlices.DecorationAreaType)
         * @see ComponentOrParentChainScope#getDecorationType(Component)
         */
        public static RadianceThemingSlices.DecorationAreaType getImmediateDecorationType(Component comp) {
            if (comp == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            return DecorationPainterUtils.getImmediateDecorationType(comp);
        }

        /**
         * Specifies component-level visibility of the lock icon on the specific component.
         *
         * @param comp    Component.
         * @param visible If <code>true</code>, the specific text component will show a lock icon
         *                when it is in non-editable mode. Pass <code>null</code> to reset to the
         *                default behavior.
         * @see GlobalScope#setLockIconVisible(Boolean)
         * @see GlobalScope#setExtraWidgetsPresence(Boolean)
         * @see ComponentOrParentChainScope#setExtraWidgetsPresence(JComponent, Boolean)
         */
        public static void setLockIconVisible(JComponent comp, Boolean visible) {
            if (comp == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            comp.putClientProperty(RadianceSynapse.HAS_LOCK_ICON, visible);
        }

        /**
         * Specifies component-level visibility of the caps lock icon on the specific password field.
         * Note that this functionality may not be supported on all platforms. See
         * {@link Toolkit#getLockingKeyState(int)} documentation for more.
         *
         * @param passwordField Password field.
         * @param visible       If <code>true</code>, the specific password field will show an indicator icon
         *                      when it is focused and caps lock is on. Pass <code>null</code> to reset to the
         *                      default behavior.
         * @see GlobalScope#setCapsLockIconVisible(Boolean)
         * @see GlobalScope#setExtraWidgetsPresence(Boolean)
         * @see ComponentOrParentChainScope#setExtraWidgetsPresence(JComponent, Boolean)
         */
        public static void setCapsLockIconVisible(JPasswordField passwordField, Boolean visible) {
            if (passwordField == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            passwordField.putClientProperty(RadianceSynapse.HAS_CAPS_LOCK_ICON, visible);
        }

        /**
         * Specifies password strength checker for the specific password field.
         *
         * @param passwordField           Password field.
         * @param passwordStrengthChecker Password strength checker
         */
        public static void setPasswordStrengthChecker(JPasswordField passwordField,
                PasswordStrengthChecker passwordStrengthChecker) {
            if (passwordField == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            passwordField.putClientProperty(RadianceSynapse.PASSWORD_STRENGTH_CHECKER,
                    passwordStrengthChecker);
        }

        /**
         * Specifies whether the text component contents should flip selection on ESCAPE key press.
         *
         * @param comp                      Text component.
         * @param flipTextSelectionOnEscape If <code>true</code>, the contents of the specified
         *                                  text component will flip
         *                                  selection on ESCAPE key press. Pass <code>null</code>
         *                                  to reset to the default
         *                                  behavior.
         */
        public static void setFlipTextSelectionOnEscape(JTextComponent comp,
                Boolean flipTextSelectionOnEscape) {
            if (comp == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            comp.putClientProperty(RadianceSynapse.TEXT_FLIP_SELECT_ON_ESCAPE,
                    flipTextSelectionOnEscape);
        }

        /**
         * Specifies whether the text component should have the edit context menu (with Cut / Copy /
         * Paste / ... menu items).
         *
         * @param comp               Text component.
         * @param hasEditContextMenu If <code>true</code>, the text component will have the edit
         *                           context menu (with
         *                           Cut / Copy / Paste / ... menu items). Pass <code>null</code>
         *                           to reset to the
         *                           default behavior.
         * @see GlobalScope#setTextEditContextMenuPresence(Boolean)
         */
        public static void setTextEditContextMenuPresence(JTextComponent comp,
                Boolean hasEditContextMenu) {
            if (comp == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            comp.putClientProperty(RadianceSynapse.TEXT_EDIT_CONTEXT_MENU, hasEditContextMenu);
        }

        /**
         * Specifies whether the tree should have automatic drag and drop support.
         *
         * @param tree                           Tree component.
         * @param hasAutomaticDragAndDropSupport If <code>true</code>, the tree will have
         *                                       automatic drag and drop support. Pass
         *                                       <code>null</code> to reset to the default behavior.
         * @see GlobalScope#setAutomaticDragAndDropSupportPresence(Boolean)
         */
        public static void setAutomaticDragAndDropSupportPresence(JTree tree,
                Boolean hasAutomaticDragAndDropSupport) {
            if (tree == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            tree.putClientProperty(RadianceSynapse.TREE_AUTO_DND_SUPPORT, hasAutomaticDragAndDropSupport);
        }

        /**
         * Specifies whether the scroll pane should have have auto-scroll support invoked on mouse
         * button click that triggers popups.
         *
         * @param scrollPane         Scroll pane component.
         * @param hasAutomaticScroll If <code>true</code>, the scroll pane will have have
         *                           auto-scroll support
         *                           invoked on mouse button click that triggers popups. Pass
         *                           <code>null</code> to
         *                           reset to the default behavior.
         * @see GlobalScope#setAutomaticScrollPresence(Boolean)
         * @see GlobalScope#setExtraWidgetsPresence(Boolean)
         * @see ComponentOrParentChainScope#setExtraWidgetsPresence(JComponent, Boolean)
         */
        public static void setAutomaticScrollPresence(JScrollPane scrollPane,
                Boolean hasAutomaticScroll) {
            if (scrollPane == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            scrollPane.putClientProperty(RadianceSynapse.AUTO_SCROLL, hasAutomaticScroll);
        }

        /**
         * Specifies the open side for the specific button component. Note that the
         * {@link RadianceButtonShaper} implementations are not required to respect this call. The
         * default {@link PillButtonShaper} and {@link ClassicButtonShaper} respect this call.
         *
         * @param comp     Component.
         * @param openSide Open side.
         * @see #setButtonOpenSides(JComponent, Set)
         * @see #setButtonStraightSide(JComponent,
         * RadianceThemingSlices.Side)
         */
        public static void setButtonOpenSide(JComponent comp, RadianceThemingSlices.Side openSide) {
            if (comp == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            comp.putClientProperty(RadianceSynapse.BUTTON_OPEN_SIDE, openSide);
        }

        /**
         * Specifies the open sides for the specific button component. Note that the
         * {@link RadianceButtonShaper} implementations are not required to respect this call. The
         * default {@link PillButtonShaper} and {@link ClassicButtonShaper} respect this call.
         *
         * @param comp      Component.
         * @param openSides Open sides.
         * @see #setButtonOpenSide(JComponent, RadianceThemingSlices.Side)
         * @see #setButtonStraightSides(JComponent, Set)
         */
        public static void setButtonOpenSides(JComponent comp, Set<RadianceThemingSlices.Side> openSides) {
            if (comp == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            comp.putClientProperty(RadianceSynapse.BUTTON_OPEN_SIDE, openSides);
        }

        /**
         * Specifies the straight side for the specific button component. Note that the
         * {@link RadianceButtonShaper} implementations are not required to respect this call. The
         * default {@link PillButtonShaper} and {@link ClassicButtonShaper} respect this call.
         *
         * @param comp         Component.
         * @param straightSide Straight side.
         * @see #setButtonOpenSide(JComponent, RadianceThemingSlices.Side)
         * @see #setButtonStraightSides(JComponent, Set)
         */
        public static void setButtonStraightSide(JComponent comp, RadianceThemingSlices.Side straightSide) {
            if (comp == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            comp.putClientProperty(RadianceSynapse.BUTTON_STRAIGHT_SIDE, straightSide);
        }

        /**
         * Specifies the straight sides for the specific button component. Note that the
         * {@link RadianceButtonShaper} implementations are not required to respect this call. The
         * default {@link PillButtonShaper} and {@link ClassicButtonShaper} respect this call.
         *
         * @param comp          Component.
         * @param straightSides Straight sides.
         * @see #setButtonStraightSide(JComponent,
         * RadianceThemingSlices.Side)
         * @see #setButtonOpenSides(JComponent, Set)
         */
        public static void setButtonStraightSides(JComponent comp, Set<RadianceThemingSlices.Side> straightSides) {
            if (comp == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            comp.putClientProperty(RadianceSynapse.BUTTON_STRAIGHT_SIDE, straightSides);
        }

        /**
         * Specifies corner radius for the specific button. Note that this only applies when the
         * button is in a {@link JToolBar}.
         *
         * @param button                    Button.
         * @param toolbarButtonCornerRadius Corner radius for the button when it is in a
         *                                  {@link JToolBar}.
         * @see ComponentOrParentChainScope#setToolbarButtonCornerRadius(JToolBar, float)
         * @see GlobalScope#setToolbarButtonCornerRadius(float)
         */
        public static void setToolbarButtonCornerRadius(AbstractButton button,
                float toolbarButtonCornerRadius) {
            if (button == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            button.putClientProperty(RadianceSynapse.TOOLBAR_BUTTON_CORNER_RADIUS,
                    Float.valueOf(toolbarButtonCornerRadius));
        }

        /**
         * <p>
         * Specifies that contents of a tab component in {@link JTabbedPane} have been modified and
         * not saved. {@link #setRunModifiedAnimationOnTabCloseButton(JComponent, Boolean)},
         * {@link #setRunModifiedAnimationOnTabCloseButton(JTabbedPane, Boolean)} and
         * {@link GlobalScope#setRunModifiedAnimationOnTabCloseButton(Boolean)} APIs control whether
         * the entire tab or its close button area is animated.
         * </p>
         *
         * <p>
         * The animation cycles between red, orange and yellow color schemes. In most cases (all but
         * tabs not marked with
         * {@link #setRunModifiedAnimationOnTabCloseButton(JComponent, Boolean)},
         * {@link #setRunModifiedAnimationOnTabCloseButton(JTabbedPane, Boolean)} and
         * {@link GlobalScope#setRunModifiedAnimationOnTabCloseButton(Boolean)} APIs), the animation
         * will be visible only when the mouse hovers over the close button of the tab. The tooltip
         * of the close button is changed as well to reflect that the container contents are marked
         * as modified.
         * </p>
         *
         * @param tabComponent     Tab component.
         * @param contentsModified If <code>true</code>, the <b>close</b> button of the matching
         *                         tab of the
         *                         matching frame / dialog will be animated.
         * @see RootPaneScope#setContentsModified(JRootPane, Boolean)
         */
        public static void setTabContentsModified(JComponent tabComponent, Boolean contentsModified) {
            if (tabComponent == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            tabComponent.putClientProperty(RadianceSynapse.CONTENTS_MODIFIED, contentsModified);
        }

        /**
         * Configures visibility of close buttons on all tabs in the specified tabbed pane.
         *
         * @param tabbedPane             Tabbed pane.
         * @param tabCloseButtonsVisible If <code>true</code>, all tabs in the tabbed pane will
         *                               show close buttons.
         * @see #setTabCloseButtonVisible(JComponent, Boolean)
         * @see GlobalScope#setTabCloseButtonsVisible(Boolean)
         */
        public static void setTabCloseButtonsVisible(JTabbedPane tabbedPane,
                Boolean tabCloseButtonsVisible) {
            tabbedPane.putClientProperty(RadianceSynapse.TABBED_PANE_CLOSE_BUTTONS,
                    tabCloseButtonsVisible);
        }

        /**
         * Configures visibility of close button on the specified tab component.
         *
         * @param tabComponent          Tab component.
         * @param tabCloseButtonVisible If <code>true</code>, the tab will show close button.
         * @see #setTabCloseButtonsVisible(JTabbedPane, Boolean)
         * @see GlobalScope#setTabCloseButtonsVisible(Boolean)
         */
        public static void setTabCloseButtonVisible(JComponent tabComponent, Boolean tabCloseButtonVisible) {
            if (tabComponent == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            tabComponent.putClientProperty(RadianceSynapse.TABBED_PANE_CLOSE_BUTTONS, tabCloseButtonVisible);
        }

        /**
         * Configures the callback for deciding on the tab close type on all tabs in the specified
         * tabbed pane. Note that this is only relevant for tabs configured with
         * {@link #setTabCloseButtonVisible(JComponent, Boolean)},
         * {@link #setTabCloseButtonsVisible(JTabbedPane, Boolean)} and
         * {@link GlobalScope#setTabCloseButtonsVisible(Boolean)} APIs.
         *
         * @param tabbedPane       Tabbed pane.
         * @param tabCloseCallback Callback for deciding on the tab close type on all tabs in the
         *                         tabbed pane.
         * @see #setTabCloseCallback(JComponent, TabCloseCallback)
         * @see GlobalScope#setTabCloseCallback(TabCloseCallback)
         */
        public static void setTabCloseCallback(JTabbedPane tabbedPane,
                TabCloseCallback tabCloseCallback) {
            if (tabbedPane == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            tabbedPane.putClientProperty(RadianceSynapse.TABBED_PANE_CLOSE_CALLBACK, tabCloseCallback);
        }

        /**
         * Configures the callback for deciding on the tab close type on the specified tab
         * component. Note that this is only relevant for tabs configured with
         * {@link #setTabCloseButtonVisible(JComponent, Boolean)},
         * {@link #setTabCloseButtonsVisible(JTabbedPane, Boolean)} and
         * {@link GlobalScope#setTabCloseButtonsVisible(Boolean)} APIs.
         *
         * @param tabComponent     Tab component.
         * @param tabCloseCallback Callback for deciding on the tab close type on the tab component.
         * @see #setTabCloseCallback(JTabbedPane, TabCloseCallback)
         * @see GlobalScope#setTabCloseCallback(TabCloseCallback)
         */
        public static void setTabCloseCallback(JComponent tabComponent,
                TabCloseCallback tabCloseCallback) {
            if (tabComponent == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            tabComponent.putClientProperty(RadianceSynapse.TABBED_PANE_CLOSE_CALLBACK, tabCloseCallback);
        }

        /**
         * Specifies that only the close button of a marked-as-modified tab components should
         * pulsate. By default, the animation on modified tabs is on the entire tab rectangle. Note
         * that this is only relevant for tabs configured with
         * {@link #setTabContentsModified(JComponent, Boolean)}.
         *
         * @param tabbedPane                           Tabbed pane.
         * @param runModifiedAnimationOnTabCloseButton If <code>true</code>, the
         *                                             marked-as-modified animation will run only
         *                                             on the
         *                                             tab close button.
         * @see #setRunModifiedAnimationOnTabCloseButton(JComponent, Boolean)
         * @see GlobalScope#setRunModifiedAnimationOnTabCloseButton(Boolean)
         */
        public static void setRunModifiedAnimationOnTabCloseButton(JTabbedPane tabbedPane,
                Boolean runModifiedAnimationOnTabCloseButton) {
            if (tabbedPane == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            tabbedPane.putClientProperty(
                    RadianceSynapse.TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION,
                    runModifiedAnimationOnTabCloseButton);
        }

        /**
         * Specifies that only the close button of a marked-as-modified tab component should
         * pulsate. By default, the animation on modified tabs is on the entire tab rectangle. Note
         * that this is only relevant for tabs configured with
         * {@link #setTabContentsModified(JComponent, Boolean)}.
         *
         * @param tabComponent                         Tab component.
         * @param runModifiedAnimationOnTabCloseButton If <code>true</code>, the
         *                                             marked-as-modified animation will run only
         *                                             on the
         *                                             tab close button.
         * @see #setRunModifiedAnimationOnTabCloseButton(JTabbedPane, Boolean)
         * @see GlobalScope#setRunModifiedAnimationOnTabCloseButton(Boolean)
         */
        public static void setRunModifiedAnimationOnTabCloseButton(JComponent tabComponent,
                Boolean runModifiedAnimationOnTabCloseButton) {
            if (tabComponent == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            tabComponent.putClientProperty(
                    RadianceSynapse.TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION,
                    runModifiedAnimationOnTabCloseButton);
        }

        /**
         * Specifies the content pane border kind for the specified tabbed pane.
         *
         * @param tabbedPane               Tabbed pane.
         * @param tabContentPaneBorderKind Content pane border kind for the specified tabbed pane.
         * @see GlobalScope#setTabContentPaneBorderKind(RadianceThemingSlices.TabContentPaneBorderKind)
         */
        public static void setTabContentPaneBorderKind(JTabbedPane tabbedPane,
                RadianceThemingSlices.TabContentPaneBorderKind tabContentPaneBorderKind) {
            if (tabbedPane == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            tabbedPane.putClientProperty(RadianceSynapse.TABBED_PANE_CONTENT_BORDER_KIND,
                    tabContentPaneBorderKind);
        }

        /**
         * Specifies the button shaper to be used for the specific component.
         *
         * @param comp         Component.
         * @param buttonShaper Button shaper to be used for the component.
         */
        public static void setButtonShaper(JComponent comp, RadianceButtonShaper buttonShaper) {
            if (comp == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            comp.putClientProperty(RadianceSynapse.BUTTON_SHAPER, buttonShaper);
        }

        /**
         * Specifies the number of echo characters for each password character in the specific
         * password field.
         *
         * @param passwordField Password field.
         * @param echoCount     Number of echo characters for each password character in the
         *                      password field.
         * @see GlobalScope#setNumberOfPasswordEchoesPerCharacter(int)
         */
        public static void setNumberOfPasswordEchoesPerCharacter(JPasswordField passwordField,
                int echoCount) {
            if (passwordField == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            passwordField.putClientProperty(RadianceSynapse.PASSWORD_ECHO_PER_CHAR,
                    Integer.valueOf(echoCount));
        }

        /**
         * Specifies the combobox popup prototype callback which is used to compute the width of the
         * popup at runtime.
         *
         * @param comboBox                    Combobox.
         * @param comboPopupPrototypeCallback Popup prototype callback which is used to compute
         *                                    the width of the popup at
         *                                    runtime.
         * @see #setComboBoxPrototypeDisplayValue(JComboBox, Object)
         * @see GlobalScope#setComboBoxPrototypeCallback(ComboPopupPrototypeCallback)
         */
        public static void setComboBoxPrototypeCallback(JComboBox comboBox,
                ComboPopupPrototypeCallback comboPopupPrototypeCallback) {
            if (comboBox == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            comboBox.putClientProperty(RadianceSynapse.COMBOBOX_POPUP_PROTOTYPE_CALLBACK,
                    comboPopupPrototypeCallback);
        }

        /**
         * Specifies the combobox popup prototype display value which is used to compute the width
         * of the popup at runtime.
         *
         * @param comboBox                        Combobox.
         * @param comboPopupPrototypeDisplayValue Popup prototype display value which is used to
         *                                        compute the width of the popup
         *                                        at runtime.
         * @see #setComboBoxPrototypeCallback(JComboBox, ComboPopupPrototypeCallback)
         * @see GlobalScope#setComboBoxPrototypeCallback(ComboPopupPrototypeCallback)
         */
        public static void setComboBoxPrototypeDisplayValue(JComboBox comboBox,
                Object comboPopupPrototypeDisplayValue) {
            if (comboBox == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            comboBox.putClientProperty(RadianceSynapse.COMBOBOX_POPUP_PROTOTYPE_OBJECT,
                    comboPopupPrototypeDisplayValue);
        }

        /**
         * Specifies the combobox popup placement strategy. Pass <code>null</code> to reset to the
         * default placement strategy. Note that the combo arrow changes in accordance with the
         * combo popup placement strategy.
         *
         * @param comboBoxPopupPlacementStrategy Placement strategy for combobox popup.
         * @see GlobalScope#setComboBoxPopupPlacementStrategy(RadianceThemingSlices.PopupPlacementStrategy)
         */
        public static void setComboBoxPopupPlacementStrategy(JComboBox comboBox,
                RadianceThemingSlices.PopupPlacementStrategy comboBoxPopupPlacementStrategy) {
            if (comboBox == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            comboBox.putClientProperty(RadianceSynapse.COMBO_BOX_POPUP_PLACEMENT_STRATEGY,
                    comboBoxPopupPlacementStrategy);
        }

        /**
         * Specifies how icon on the specified control is themed.
         *
         * @param activeIconFilterStrategy   Icon filter strategy for active states.
         * @param enabledIconFilterStrategy  Icon filter strategy for enabled state.
         * @param disabledIconFilterStrategy Icon filter strategy for disabled states.
         * @see GlobalScope#setIconFilterStrategies(RadianceThemingSlices.IconFilterStrategy, RadianceThemingSlices.IconFilterStrategy, RadianceThemingSlices.IconFilterStrategy)
         */
        public static void setIconFilterStrategies(JComponent component,
                RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy) {
            component.putClientProperty(RadianceSynapse.ICON_FILTER_STRATEGY_ACTIVE,
                    activeIconFilterStrategy);
            component.putClientProperty(RadianceSynapse.ICON_FILTER_STRATEGY_ENABLED,
                    enabledIconFilterStrategy);
            component.putClientProperty(RadianceSynapse.ICON_FILTER_STRATEGY_DISABLED,
                    disabledIconFilterStrategy);
        }
    }

    /**
     * APIs in this scope apply to individual application {@link Component}s or all immediate child
     * components of a container.
     */
    public static final class ComponentOrParentScope {
        /**
         * Specifies preview painter to be used for showing preview of the specific component or its
         * immediate children. Default implementation is available in the
         * {@link DefaultPreviewPainter}.
         *
         * @param comp           Component.
         * @param previewPainter Preview painter. Can be <code>null</code>.
         * @see GlobalScope#setComponentPreviewPainter(PreviewPainter)
         */
        public static void setComponentPreviewPainter(JComponent comp,
                PreviewPainter previewPainter) {
            comp.putClientProperty(RadianceSynapse.COMPONENT_PREVIEW_PAINTER, previewPainter);
        }

        /**
         * Specifies whether the specific component or its immediate children should ignore the
         * default (minimum) dimension for buttons. Note that {@link RadianceButtonShaper}
         * implementations are not required to respect this call. The current implementations of the
         * default {@link PillButtonShaper} and {@link ClassicButtonShaper} respect this
         * setting.
         *
         * @param comp                    Component.
         * @param buttonIgnoreMinimumSize If <code>true</code>, the component or its immediate
         *                                children will ignore the
         *                                default (minimum) dimension for buttons under button
         *                                shapers that respect this
         *                                setting. Pass <code>null</code> to reset to the default
         *                                behavior.
         * @see GlobalScope#setButtonIgnoreMinimumSize(Boolean)
         */
        public static void setButtonIgnoreMinimumSize(JComponent comp,
                Boolean buttonIgnoreMinimumSize) {
            comp.putClientProperty(RadianceSynapse.BUTTON_NO_MIN_SIZE, buttonIgnoreMinimumSize);
        }

        /**
         * Specifies when the specific component or its immediate children should draw their
         * background.
         *
         * @param comp                         Component.
         * @param backgroundAppearanceStrategy Background appearance strategy. Pass
         *                                     <code>null</code> to reset to the default behavior (to <code>ALWAYS</code>)
         * @see GlobalScope#setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy)
         */
        public static void setBackgroundAppearanceStrategy(JComponent comp,
                RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {
            comp.putClientProperty(RadianceSynapse.BACKGROUND_APPEARANCE_STRATEGY,
                    backgroundAppearanceStrategy);
        }
    }

    /**
     * APIs in this scope apply to individual application {@link Component}s or all nested child
     * components of a container.
     */
    public static final class ComponentOrParentChainScope {
        /**
         * Specifies whether the contents of the specified text component or its nested children
         * should be selected on focus gain.
         *
         * @param comp              Component.
         * @param selectTextOnFocus If <code>true</code>, the contents of the specified text
         *                          component or its
         *                          nested children will be selected on focus gain. Pass
         *                          <code>null</code> to
         *                          reset to the default behavior.
         * @see GlobalScope#setSelectTextOnFocus(Boolean)
         */
        public static void setSelectTextOnFocus(JComponent comp, Boolean selectTextOnFocus) {
            comp.putClientProperty(RadianceSynapse.TEXT_SELECT_ON_FOCUS, selectTextOnFocus);
        }

        /**
         * Specifies corner radius for all buttons in the specified toolbar.
         *
         * @param toolbar                   Toolbar.
         * @param toolbarButtonCornerRadius Corner radius for all buttons in the toolbar.
         * @see ComponentScope#setToolbarButtonCornerRadius(AbstractButton, float)
         * @see GlobalScope#setToolbarButtonCornerRadius(float)
         */
        public static void setToolbarButtonCornerRadius(JToolBar toolbar,
                float toolbarButtonCornerRadius) {
            toolbar.putClientProperty(RadianceSynapse.TOOLBAR_BUTTON_CORNER_RADIUS,
                    Float.valueOf(toolbarButtonCornerRadius));
        }

        /**
         * Specifies that extra UI elements (such as menu items in system menu or lock borders)
         * can be shown in the specified component.
         *
         * @param comp                 Component.
         * @param extraWidgetsPresence If <code>true</code>, extra UI elements (such as menu
         *                             items in system menu or lock borders) can be shown in the
         *                             component. Pass <code>null</code> to reset to the default
         *                             behavior.
         * @see GlobalScope#setExtraWidgetsPresence(Boolean)
         */
        public static void setExtraWidgetsPresence(JComponent comp, Boolean extraWidgetsPresence) {
            comp.putClientProperty(RadianceSynapse.SHOW_EXTRA_WIDGETS, extraWidgetsPresence);
        }

        /**
         * <p>
         * Specifies colorization amount applied to the background and foreground of the current
         * color scheme and the specific control. By default, when the application does not use any
         * custom colors, all the controls are painted with the colors of the current color scheme /
         * skin. The colors coming from the look-and-feel implement the marker {@link UIResource}
         * interface which allows the UI delegates to differentiate between application-specific
         * colors which are not changed, and the LAF-provide colors that are changed on LAF switch.
         * </p>
         *
         * <p>
         * Calling this method installs the "smart colorization" mode which uses the colors of the
         * current color scheme and the custom background / foreground colors (when installed by
         * application) to colorize the relevant portions of the control. For example, on checkbox
         * the custom background color will be used to colorize the check box itself, while the
         * custom foreground color will be applied to the check box text and the check mark.
         * </p>
         *
         * <p>
         * Value of 0.0 of colorization amount results in Radiance completely
         * <strong>ignoring</strong> the custom application background and foreground colors set on
         * the components - no colorization. Values closer to 1.0 result in almost full usage of the
         * custom application background and foreground colors set on the components. Note that in
         * order to maintain the gradients (fill, border, etc), even value of 1.0 does not result in
         * full custom color being applied to the relevant visuals of the control.
         * </p>
         *
         * <p>
         * Calling this method applies colorization amount to the component / container itself and
         * all its children that do not call this method.
         * </p>
         *
         * <p>
         * The default colorization amount (when this method is not called at all) is 0.5. This
         * means that applications that install custom background / foreground colors on their UI
         * controls will see them colorized with 50% "strength", even without calling this method.
         * </p>
         *
         * @param comp               Component.
         * @param colorizationFactor Colorization factor to apply to the component and its nested
         *                           children.
         * @see GlobalScope#setColorizationFactor(double)
         */
        public static void setColorizationFactor(JComponent comp, double colorizationFactor) {
            comp.putClientProperty(RadianceSynapse.COLORIZATION_FACTOR,
                    Double.valueOf(colorizationFactor));
        }

        /**
         * Specifies the kind of focus indication to be used on the specified component and its
         * nested children.
         *
         * @param focusKind Kind of focus indication to be used on the component and its nested
         *                  children.
         * @param comp      Component.
         * @see GlobalScope#setFocusKind(RadianceThemingSlices.FocusKind)
         */
        public static void setFocusKind(JComponent comp, RadianceThemingSlices.FocusKind focusKind) {
            comp.putClientProperty(RadianceSynapse.FOCUS_KIND, focusKind);
        }

        /**
         * Sets the decoration type of the specified component and all its children.
         *
         * @param comp Component.
         * @param type Decoration type of the component and all its children.
         * @see #getDecorationType(Component)
         * @see ComponentScope#getImmediateDecorationType(Component)
         */
        public static void setDecorationType(JComponent comp, RadianceThemingSlices.DecorationAreaType type) {
            if (comp == null) {
                throw new IllegalArgumentException(
                        "Component scope APIs do not accept null components");
            }
            DecorationPainterUtils.setDecorationType(comp, type);
        }

        /**
         * Returns the decoration area type of the specified component. The component and its
         * ancestor hierarchy are scanned for the registered decoration area type. If
         * {@link #setDecorationType(JComponent, RadianceThemingSlices.DecorationAreaType)} has been
         * called on the
         * specified component, the matching decoration type is returned. Otherwise, the component
         * hierarchy is scanned to find the closest ancestor that was passed to
         * {@link #setDecorationType(JComponent, RadianceThemingSlices.DecorationAreaType)} - and its
         * decoration type is
         * returned. If neither the component, nor any one of its parent components has been passed
         * to the setter method, {@link RadianceThemingSlices.DecorationAreaType#NONE} is returned.
         *
         * @param comp Component.
         * @return Decoration area type of the component.
         * @see #setDecorationType(JComponent, RadianceThemingSlices.DecorationAreaType)
         * @see ComponentScope#getImmediateDecorationType(Component)
         */
        public static RadianceThemingSlices.DecorationAreaType getDecorationType(Component comp) {
            if (comp == null) {
                throw new IllegalArgumentException(
                        "Component scope APIs do not accept null components");
            }
            return DecorationPainterUtils.getDecorationType(comp);
        }
    }

    /**
     * APIs in this scope apply to individual application {@link JRootPane}s.
     */
    public static final class RootPaneScope {
        /**
         * Specifies a skin to be used on the specific root pane. This will affect all the controls
         * in that root pane. After calling this method, call
         * {@link SwingUtilities#updateComponentTreeUI(Component)} on the matching window.
         *
         * @param rootPane Root pane.
         * @param skin     Skin to use on all the controls in the root pane.
         * @see GlobalScope#setSkin(String)
         * @see GlobalScope#setSkin(RadianceSkin)
         */
        public static void setSkin(JRootPane rootPane, RadianceSkin skin) {
            if (rootPane == null) {
                throw new IllegalArgumentException(
                        "Root pane scope APIs do not accept null root panes");
            }
            rootPane.putClientProperty(RadianceSynapse.ROOT_PANE_SKIN, skin);
        }

        /**
         * <p>
         * Specifies that contents of a root pane have been modified and not saved. The <b>close</b>
         * button of the title pane of the matching frame / dialog will be animated (in case that
         * the frame / dialog have decorated title pane). In case the root pane belongs to a
         * {@link JInternalFrame} and that frame is iconified (to a
         * {@link JInternalFrame.JDesktopIcon}), the close button of the its desktop icon is
         * animated as well.
         * </p>
         *
         * <p>
         * The animation cycles between red, orange and yellow color schemes. The animation will be
         * visible only when the mouse hovers over the close button of the matching container
         * (frame, dialog, internal frame, desktop icon). The tooltip of the close button is changed
         * as well to reflect that the container contents are marked as modified.
         * </p>
         *
         * @param rootPane         Root pane.
         * @param contentsModified If <code>true</code>, the <b>close</b> button of the title
         *                         pane of the
         *                         matching frame / dialog will be animated.
         * @see ComponentScope#setTabContentsModified(JComponent, Boolean)
         */
        public static void setContentsModified(JRootPane rootPane, Boolean contentsModified) {
            if (rootPane == null) {
                throw new IllegalArgumentException(
                        "Root pane scope APIs do not accept null root panes");
            }
            rootPane.putClientProperty(RadianceSynapse.CONTENTS_MODIFIED, contentsModified);
        }

        public static void setTitlePaneButtonsProvider(JRootPane rootPane,
                TitlePaneButtonsProvider titlePaneButtonsProvider) {
            if (rootPane == null) {
                throw new IllegalArgumentException(
                        "Root pane scope APIs do not accept null root panes");
            }
            rootPane.putClientProperty(RadianceSynapse.TITLE_PANE_BUTTONS_PROVIDER,
                    titlePaneButtonsProvider);
        }
    }

    /**
     * APIs in this scope apply to individual application {@link Window}s.
     */
    public static final class WindowScope {
        /**
         * Sets the visibility of the specified widget type(s). This method should not be called
         * from inside the initialization sequence of your window. If the specific widget needs to
         * be visible when the window is shown, wrap the call with
         * {@link SwingUtilities#invokeLater(Runnable)}.
         *
         * @param window           Window. May not be <code>null</code>.
         * @param visible          Visibility indication.
         * @param radianceWidgets Widget types.
         */
        public static void setWidgetVisible(Window window, boolean visible,
                RadianceThemingSlices.WidgetType... radianceWidgets) {
            if (window == null) {
                throw new IllegalArgumentException("Window scope APIs do not accept null windows");
            }
            JRootPane rootPane = SwingUtilities.getRootPane(window);
            if (rootPane != null) {
                RadianceWidgetManager.getInstance().register(rootPane, visible, radianceWidgets);
                SwingUtilities.updateComponentTreeUI(rootPane);
            }
        }

        /**
         * Marks the specified window to have its content extend vertically into the title pane
         * area. Use the following methods for finer control over such extended content:
         *
         * <ul>
         * <li>{@link #getTitlePaneControlInsets(Window)} to query the insets that should be
         * reserved for the main control buttons - close / maximize / minimize.
         * <li>{@link #setPreferredTitlePaneHeight(Window, int)} to increase the preferred height of
         * the title pane area in case the content you extend into that area is taller than the main
         * control buttons.</li>
         * <li>{@link #createTitlePaneControlButton(Window)} to get a button that has consistent
         * visual appearance and preferred size with the main control buttons.</li>
         * </ul>
         *
         * @param window                              Window. May not be <code>null</code>.
         * @param controlButtonGroupHorizontalGravity Horizontal gravity for the title control
         *                                            buttons. Must be either
         *                                            {@link RadianceThemingSlices.HorizontalGravity#LEADING} or
         *                                            {@link RadianceThemingSlices.HorizontalGravity#TRAILING}.
         * @param controlButtonGroupVerticalGravity   Vertical gravity for the title control
         *                                            buttons. May not be <code>null</code>.
         * @see #getTitlePaneControlInsets(Window)
         * @see #setPreferredTitlePaneHeight(Window, int)
         * @see #getTitleControlButtonGroupHorizontalGravity(Window)
         * @see #createTitlePaneControlButton(Window)
         * @see #markLabelAsTitlePaneText(Window, JLabel)
         */
        public static void extendContentIntoTitlePane(Window window,
                RadianceThemingSlices.HorizontalGravity controlButtonGroupHorizontalGravity,
                RadianceThemingSlices.VerticalGravity controlButtonGroupVerticalGravity) {
            if (window == null) {
                throw new IllegalArgumentException("Window scope APIs do not accept null windows");
            }
            if ((controlButtonGroupHorizontalGravity != RadianceThemingSlices.HorizontalGravity.LEADING)
                    && (controlButtonGroupHorizontalGravity != RadianceThemingSlices.HorizontalGravity
                    .TRAILING)) {
                throw new IllegalArgumentException(
                        "Can only pass LEADING or TRAILING for control button group horizontal " +
                                "gravity.");
            }
            if (controlButtonGroupVerticalGravity == null) {
                throw new IllegalArgumentException(
                        "Cannot pass null for control button group vertical gravity. Did you mean" +
                                " CENTERED?");
            }
            JRootPane rootPane = SwingUtilities.getRootPane(window);
            if (rootPane != null) {
                rootPane.putClientProperty(
                        RadianceSynapse.ROOT_PANE_CONTENTS_EXTENDS_INTO_TITLE_PANE, Boolean.TRUE);
                rootPane.putClientProperty(
                        RadianceSynapse.TITLE_CONTROL_BUTTON_GROUP_HORIZONTAL_GRAVITY,
                        controlButtonGroupHorizontalGravity);
                rootPane.putClientProperty(
                        RadianceSynapse.TITLE_CONTROL_BUTTON_GROUP_VERTICAL_GRAVITY,
                        controlButtonGroupVerticalGravity);
                RadianceRootPaneUI ui = (RadianceRootPaneUI) rootPane.getUI();
                ui.extendContentIntoTitlePane();
            }
        }

        /**
         * Returns a new instance of a button that has consistent visuals and preferred size to be
         * used in application content that is extended into the title pane area with
         * {@link #extendContentIntoTitlePane(Window, RadianceThemingSlices.HorizontalGravity, RadianceThemingSlices.VerticalGravity)}
         * API. If the content of the button will need more space (horizontally and / or
         * vertically),
         * you can query the preferred size and then tweak it.
         *
         * @param window Window. May not be <code>null</code>.
         * @return A new instance of a button that has consistent visuals and preferred size to be
         * used in application content that is extended into the title pane area.
         * @see #extendContentIntoTitlePane(Window, RadianceThemingSlices.HorizontalGravity,
         * RadianceThemingSlices.VerticalGravity)
         * @see #getTitlePaneControlInsets(Window)
         * @see #setPreferredTitlePaneHeight(Window, int)
         * @see #markLabelAsTitlePaneText(Window, JLabel)
         */
        public static JButton createTitlePaneControlButton(Window window) {
            if (window == null) {
                throw new IllegalArgumentException("Window scope APIs do not accept null windows");
            }
            JRootPane rootPane = SwingUtilities.getRootPane(window);
            if (rootPane != null) {
                RadianceRootPaneUI ui = (RadianceRootPaneUI) rootPane.getUI();
                return ui.createTitlePaneControlButton();
            }
            return null;
        }

        /**
         * Queries the insets that should be reserved for the main control buttons (close / maximize
         * / minimize) in application content that is extended into the title pane area with
         * {@link #extendContentIntoTitlePane(Window, RadianceThemingSlices.HorizontalGravity, RadianceThemingSlices.VerticalGravity)}
         * API. {@link Insets#left} and {@link Insets#right} give the horizontal insets of the
         * control buttons.
         * {@link Insets#top} and {@link Insets#right} give the vertical insets within the matching
         * horizontal insets.
         *
         * @param window Window. May not be <code>null</code>.
         * @return The insets that should be reserved for the main control buttons (close / maximize
         * / minimize) in application content that is extended into the title pane area.
         * @see #extendContentIntoTitlePane(Window, RadianceThemingSlices.HorizontalGravity,
         * RadianceThemingSlices.VerticalGravity)
         * @see #createTitlePaneControlButton(Window)
         * @see #setPreferredTitlePaneHeight(Window, int)
         */
        public static Insets getTitlePaneControlInsets(Window window) {
            if (window == null) {
                throw new IllegalArgumentException("Window scope APIs do not accept null windows");
            }
            JRootPane rootPane = SwingUtilities.getRootPane(window);
            if (rootPane != null) {
                RadianceRootPaneUI ui = (RadianceRootPaneUI) rootPane.getUI();
                return ui.getTitlePaneControlInsets();
            }
            return null;
        }

        /**
         * Increase the preferred height of the title pane area in case the content you extend into
         * that area with
         * {@link #extendContentIntoTitlePane(Window, RadianceThemingSlices.HorizontalGravity, RadianceThemingSlices.VerticalGravity)}
         * API is taller than the main control buttons.
         *
         * @param window                   Window. May not be <code>null</code>.
         * @param preferredTitlePaneHeight Preferred height of the title pane area. Must be a
         *                                 positive value.
         * @see #extendContentIntoTitlePane(Window, RadianceThemingSlices.HorizontalGravity,
         * RadianceThemingSlices.VerticalGravity)
         * @see #createTitlePaneControlButton(Window)
         * @see #getTitlePaneControlInsets(Window)
         */
        public static void setPreferredTitlePaneHeight(Window window, int preferredTitlePaneHeight) {
            if (window == null) {
                throw new IllegalArgumentException("Window scope APIs do not accept null windows");
            }
            if (preferredTitlePaneHeight <= 0) {
                throw new IllegalArgumentException("Should pass positive value");
            }
            JRootPane rootPane = SwingUtilities.getRootPane(window);
            if (rootPane != null) {
                rootPane.putClientProperty(RadianceSynapse.ROOT_PANE_PREFERRED_TITLE_PANE_HEIGHT,
                        Integer.valueOf(preferredTitlePaneHeight));
                RadianceRootPaneUI ui = (RadianceRootPaneUI) rootPane.getUI();
                ui.setPreferredTitlePaneHeight(preferredTitlePaneHeight);
            }
        }

        /**
         * Returns the horizontal gravity for the control button group in the title pane of the
         * specific window.
         *
         * @param window Window. May not be <code>null</code>.
         * @return Horizontal gravity for the control button group in the title pane of the specific
         * window.
         * @see GlobalScope#configureTitleContentGravity(RadianceThemingSlices.HorizontalGravity, RadianceThemingSlices.HorizontalGravity,
         * RadianceThemingSlices.TitleIconHorizontalGravity)
         * @see #extendContentIntoTitlePane(Window,
         * RadianceThemingSlices.HorizontalGravity,
         * RadianceThemingSlices.VerticalGravity)
         * @see GlobalScope#getTitleTextHorizontalGravity()
         * @see GlobalScope#getTitleIconHorizontalGravity()
         */
        public static RadianceThemingSlices.HorizontalGravity getTitleControlButtonGroupHorizontalGravity(
                Window window) {
            if (window == null) {
                throw new IllegalArgumentException("Window scope APIs do not accept null windows");
            }
            return RadianceTitlePaneUtilities.getTitleControlButtonGroupHorizontalGravity(
                    SwingUtilities.getRootPane(window));
        }

        /**
         * Marks the passed label to be drawn as title pane text (window title).
         *
         * @param window Window. May not be <code>null</code>.
         * @param label  Label. May not be <code>null</code>.
         * @see #extendContentIntoTitlePane(Window, RadianceThemingSlices.HorizontalGravity,
         * RadianceThemingSlices.VerticalGravity)
         * @see #createTitlePaneControlButton(Window)
         */
        public static void markLabelAsTitlePaneText(Window window, JLabel label) {
            if (label == null) {
                throw new IllegalArgumentException("Should pass non-null label");
            }
            label.setFont(RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet().getWindowTitleFont());
            label.putClientProperty(RadianceSynapse.IS_TITLE_PANE_LABEL, true);
        }
    }
}
