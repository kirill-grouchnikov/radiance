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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.animation.api.swing.SwingRepaintCallback;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.UiThreadingViolationException;
import org.pushingpixels.radiance.common.internal.contrib.jgoodies.looks.LookUtils;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.combo.ComboPopupPrototypeCallback;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.RadianceDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.api.shaper.RadianceButtonShaper;
import org.pushingpixels.radiance.theming.api.tabbed.TabCloseCallback;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.ui.RadianceRootPaneUI;
import org.pushingpixels.radiance.theming.internal.utils.combo.RadianceComboPopup;
import org.pushingpixels.radiance.theming.internal.utils.icon.ArrowButtonTransitionAwareIcon;
import org.pushingpixels.radiance.theming.internal.utils.icon.TransitionAware;
import org.pushingpixels.radiance.theming.internal.utils.icon.TransitionAwareIcon;
import org.pushingpixels.radiance.theming.internal.utils.menu.RadianceMenu;

import javax.swing.*;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.UIResource;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.*;

/**
 * Various utility functions. This class is <b>for internal use only</b>.
 *
 * @author Kirill Grouchnikov
 * @author Romain Guy
 */
public class RadianceCoreUtilities {
    /**
     * Client property name for marking components covered by lightweight popups. This is tracking
     * the fix for issue 297. The client property value should be an instance of {@link Boolean}.
     */
    public static final String IS_COVERED_BY_LIGHTWEIGHT_POPUPS =
            "radiance.theming.internal.paint.isCoveredByLightweightPopups";

    public static final String TEXT_COMPONENT_AWARE = "radiance.theming.internal.textComponentAware";

    public interface TextComponentAware<T extends JComponent> {
        JTextComponent getTextComponent(T t);
    }

    /**
     * Private constructor. Is here to enforce using static methods only.
     */
    private RadianceCoreUtilities() {
    }

    /**
     * Clips string based on specified font metrics and available width (in pixels). Returns the
     * clipped string, which contains the beginning and the end of the input string separated by
     * ellipses (...) in case the string is too long to fit into the specified width, and the
     * original string otherwise.
     *
     * @param metrics        Font metrics.
     * @param availableWidth Available width in pixels.
     * @param fullText       String to clip.
     * @return The clipped string, which contains the beginning and the end of the input string
     * separated by ellipses (...) in case the string is too long to fit into the specified
     * width, and the original string otherwise.
     */
    public static String clipString(FontMetrics metrics, int availableWidth, String fullText) {

        if (metrics.stringWidth(fullText) <= availableWidth) {
            return fullText;
        }

        String ellipses = "...";
        int ellipsesWidth = metrics.stringWidth(ellipses);
        if (ellipsesWidth > availableWidth) {
            return "";
        }

        String starter = "";
        String ender = "";

        int w = fullText.length();
        int w2 = (w / 2) + (w % 2);
        String prevTitle = "";
        for (int i = 0; i < w2; i++) {
            String newStarter = starter + fullText.charAt(i);
            String newEnder = ender;
            if ((w - i) > w2) {
                newEnder = fullText.charAt(w - i - 1) + newEnder;
            }
            String newTitle = newStarter + ellipses + newEnder;
            if (metrics.stringWidth(newTitle) <= availableWidth) {
                starter = newStarter;
                ender = newEnder;
                prevTitle = newTitle;
                continue;
            }
            return prevTitle;
        }
        return fullText;
    }

    /**
     * Checks whether the specified button has associated icon.
     *
     * @param button Button.
     * @return If the button has associated icon, <code>true</code> is returned, otherwise
     * <code>false</code>.
     */
    public static boolean hasIcon(AbstractButton button) {
        return (button.getIcon() != null);
    }

    /**
     * Checks whether the specified button has associated text.
     *
     * @param button Button.
     * @return If the button has associated text, <code>true</code> is returned, otherwise
     * <code>false</code>.
     */
    public static boolean hasText(AbstractButton button) {
        String text = button.getText();
        if ((text != null) && (text.length() > 0)) {
            return true;
        }
        return false;
    }

    /**
     * Checks and answers if the specified button is in a combo box.
     *
     * @param button the button to check
     * @return <code>true</code> if in combo box, <code>false</code> otherwise
     */
    public static boolean isComboBoxButton(AbstractButton button) {
        return SwingUtilities.getAncestorOfClass(JComboBox.class, button) != null;
    }

    /**
     * Checks and answers if the specified button is in a scroll bar.
     *
     * @param button the button to check
     * @return <code>true</code> if in scroll bar, <code>false</code> otherwise
     */
    public static boolean isScrollBarButton(AbstractButton button) {
        return SwingUtilities.getAncestorOfClass(JScrollBar.class, button) != null;
    }

    /**
     * Checks and answers if the specified button is in a spinner.
     *
     * @param button the button to check
     * @return <code>true</code> if in spinner, <code>false</code> otherwise
     */
    public static boolean isSpinnerButton(AbstractButton button) {
        if (!(button instanceof RadianceSpinnerButton)) {
            return false;
        }
        return SwingUtilities.getAncestorOfClass(JSpinner.class, button) != null;
    }

    /**
     * Checks and answers if the specified button is in a toolbar.
     *
     * @param component the button to check
     * @return <code>true</code> if in toolbar, <code>false</code> otherwise
     */
    public static boolean isToolBarButton(JComponent component) {
        if (component.getClass().isAnnotationPresent(RadianceInternalButton.class)) {
            return false;
        }
        return SwingUtilities.getAncestorOfClass(JToolBar.class, component) != null;
    }

    /**
     * Checks whether the specified button never paints its background.
     *
     * @param button Button.
     * @return <code>true</code> if the specified button never paints its background,
     * <code>false</code> otherwise.
     * @see RadianceThemingCortex.GlobalScope#setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy)
     */
    public static boolean isButtonNeverPainted(JComponent button) {
        // small optimizations for checkboxes and radio buttons
        if (button instanceof JCheckBox) {
            return false;
        }
        if (button instanceof JRadioButton) {
            return false;
        }

        Object backgroundAppearanceStrategy = button.getClientProperty(RadianceSynapse.BACKGROUND_APPEARANCE_STRATEGY);
        if (backgroundAppearanceStrategy != null) {
            if (RadianceThemingSlices.BackgroundAppearanceStrategy.NEVER.equals(backgroundAppearanceStrategy)) {
                return true;
            }
        }

        Container parent = button.getParent();
        if (parent instanceof JComponent) {
            JComponent jparent = (JComponent) parent;
            backgroundAppearanceStrategy = jparent
                    .getClientProperty(RadianceSynapse.BACKGROUND_APPEARANCE_STRATEGY);
            if (backgroundAppearanceStrategy != null) {
                if (RadianceThemingSlices.BackgroundAppearanceStrategy.NEVER.equals(backgroundAppearanceStrategy)) {
                    return true;
                }
            }
        }

        return RadianceThemingSlices.BackgroundAppearanceStrategy.NEVER.equals(
                UIManager.get(RadianceSynapse.BACKGROUND_APPEARANCE_STRATEGY));
    }

    /**
     * Returns the focus ring kind of the specified component.
     *
     * @param component Component.
     * @return The focus ring kind of the specified component.
     */
    public static RadianceThemingSlices.FocusKind getFocusKind(Component component) {
        while (component != null) {
            if (component instanceof JComponent) {
                JComponent jcomp = (JComponent) component;
                Object jcompFocusKind = jcomp.getClientProperty(RadianceSynapse.FOCUS_KIND);
                if (jcompFocusKind instanceof RadianceThemingSlices.FocusKind) {
                    return (RadianceThemingSlices.FocusKind) jcompFocusKind;
                }
            }
            component = component.getParent();
        }
        Object globalFocusKind = UIManager.get(RadianceSynapse.FOCUS_KIND);
        if (globalFocusKind instanceof RadianceThemingSlices.FocusKind) {
            return (RadianceThemingSlices.FocusKind) globalFocusKind;
        }
        return RadianceThemingSlices.FocusKind.ALL_INNER;
    }

    /**
     * Returns the button shaper of the specified button.
     *
     * @param comp The button.
     * @return The button shaper of the specified button.
     * @see RadianceThemingCortex.ComponentScope#setButtonShaper(JComponent, RadianceButtonShaper)
     * @see RadianceSkin#getButtonShaper()
     */
    public static RadianceButtonShaper getButtonShaper(Component comp) {
        if (comp instanceof JComponent) {
            Object prop = ((JComponent) comp).getClientProperty(RadianceSynapse.BUTTON_SHAPER);
            if (prop instanceof RadianceButtonShaper)
                return (RadianceButtonShaper) prop;
        }
        RadianceSkin skin = RadianceCoreUtilities.getSkin(comp);
        if (skin == null)
            return null;
        return skin.getButtonShaper();
    }

    /**
     * Returns the fill painter of the specified component.
     *
     * @param comp Component.
     * @return The fill painter of the specified component.
     * @see RadianceSkin#getFillPainter()
     */
    public static RadianceFillPainter getFillPainter(Component comp) {
        return RadianceCoreUtilities.getSkin(comp).getFillPainter();
    }

    /**
     * Retrieves the <code>modified</code> state for the specified component in a tabbed pane.
     *
     * @param tabComponent The associated tab component.
     * @return <code>true</code> if the specified component in a tabbed pane is marked as modified,
     * <code>false</code> otherwise.
     * @see RadianceThemingCortex.ComponentScope#setTabContentsModified(JComponent, Boolean)
     */
    public static boolean isTabModified(Component tabComponent) {
        if (tabComponent instanceof JComponent) {
            JComponent jc = (JComponent) tabComponent;
            return Boolean.TRUE.equals(jc.getClientProperty(RadianceSynapse.CONTENTS_MODIFIED));
        }
        return false;
    }

    /**
     * Retrieves the <code>modified</code> state for the specified root pane.
     *
     * @param rootPane The root pane.
     * @return <code>true</code> if the specified root pane is marked as modified,
     * <code>false</code> otherwise.
     * @see RadianceThemingCortex.RootPaneScope#setContentsModified(JRootPane, Boolean)
     */
    public static boolean isRootPaneModified(JRootPane rootPane) {
        return Boolean.TRUE.equals(rootPane.getClientProperty(RadianceSynapse.CONTENTS_MODIFIED));
    }

    /**
     * Checks whether the specified tab has a close button.
     *
     * @param tabbedPane Tabbed pane.
     * @param tabIndex   Tab index.
     * @return <code>true</code> if the specified tab has a close button, <code>false</code>
     * otherwise.
     */
    public static boolean hasCloseButton(JTabbedPane tabbedPane, int tabIndex) {
        int tabCount = tabbedPane.getTabCount();
        if ((tabIndex < 0) || (tabIndex >= tabCount))
            return false;

        // if tab is disabled, it doesn't have a close button
        if (!tabbedPane.isEnabledAt(tabIndex))
            return false;

        // check property on tab component
        Component tabComponent = tabbedPane.getComponentAt(tabIndex);
        if (tabComponent instanceof JComponent) {
            Object compProp = ((JComponent) tabComponent)
                    .getClientProperty(RadianceSynapse.TABBED_PANE_CLOSE_BUTTONS);
            if (Boolean.TRUE.equals(compProp))
                return true;
            if (Boolean.FALSE.equals(compProp))
                return false;
        }
        // check property on tabbed pane
        Object tabProp = tabbedPane.getClientProperty(RadianceSynapse.TABBED_PANE_CLOSE_BUTTONS);
        if (Boolean.TRUE.equals(tabProp))
            return true;
        if (Boolean.FALSE.equals(tabProp))
            return false;
        // check property in UIManager
        return UIManager.getBoolean(RadianceSynapse.TABBED_PANE_CLOSE_BUTTONS);
    }

    /**
     * Returns the size of the close button for a tab in the specified tabbed pane.
     *
     * @param tabbedPane Tabbed pane.
     * @param tabIndex   Tab index.
     * @return The size of the close button for a tab in the specified tabbed pane.
     */
    public static int getCloseButtonSize(JTabbedPane tabbedPane, int tabIndex) {
        if (!RadianceCoreUtilities.hasCloseButton(tabbedPane, tabIndex))
            return 0;
        return RadianceSizeUtils
                .getTabCloseIconSize(RadianceSizeUtils.getComponentFontSize(tabbedPane));
    }

    /**
     * Returns the content border kind of the specified tabbed pane.
     *
     * @param tabbedPane Tabbed pane.
     * @return Content border kind of the specified tabbed pane.
     * @see RadianceThemingCortex.GlobalScope#setTabContentPaneBorderKind(RadianceThemingSlices.TabContentPaneBorderKind)
     * @see RadianceThemingCortex.ComponentScope#setTabContentPaneBorderKind(JTabbedPane, RadianceThemingSlices.TabContentPaneBorderKind)
     */
    public static RadianceThemingSlices.TabContentPaneBorderKind getContentBorderKind(JTabbedPane tabbedPane) {
        // check property on tabbed pane
        Object tabProp = tabbedPane
                .getClientProperty(RadianceSynapse.TABBED_PANE_CONTENT_BORDER_KIND);
        if (tabProp instanceof RadianceThemingSlices.TabContentPaneBorderKind)
            return (RadianceThemingSlices.TabContentPaneBorderKind) tabProp;
        // check property in UIManager
        Object globalProp = UIManager.get(RadianceSynapse.TABBED_PANE_CONTENT_BORDER_KIND);
        if (globalProp instanceof RadianceThemingSlices.TabContentPaneBorderKind)
            return (RadianceThemingSlices.TabContentPaneBorderKind) globalProp;
        return RadianceThemingSlices.TabContentPaneBorderKind.DOUBLE_PLACEMENT;
    }

    /**
     * Checks whether the specified tab should show modified animation only on its close button.
     *
     * @param tabbedPane Tabbed pane.
     * @param tabIndex   Tab index.
     * @return <code>true</code> if the specified tab should show modified animation only on its
     * close button, <code>false</code> otherwise.
     */
    public static boolean toAnimateCloseIconOfModifiedTab(JTabbedPane tabbedPane, int tabIndex) {
        int tabCount = tabbedPane.getTabCount();
        if ((tabIndex < 0) || (tabIndex >= tabCount))
            return false;

        if (!hasCloseButton(tabbedPane, tabIndex))
            return false;

        // check property on tab component
        Component tabComponent = tabbedPane.getComponentAt(tabIndex);
        if (tabComponent instanceof JComponent) {
            Object compProp = ((JComponent) tabComponent).getClientProperty(
                    RadianceSynapse.TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION);
            if (Boolean.TRUE.equals(compProp))
                return true;
            if (Boolean.FALSE.equals(compProp))
                return false;
        }
        // check property on tabbed pane
        Object tabProp = tabbedPane
                .getClientProperty(RadianceSynapse.TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION);
        if (Boolean.TRUE.equals(tabProp))
            return true;
        if (Boolean.FALSE.equals(tabProp))
            return false;
        // check property in UIManager
        return UIManager.getBoolean(RadianceSynapse.TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION);
    }

    /**
     * Retrieves transparent image of specified dimension.
     *
     * @param width  Image width.
     * @param height Image height.
     * @return Transparent image of specified dimension.
     */
    public static BufferedImage getBlankImage(double scale, int width, int height) {
        if (MemoryAnalyzer.isRunning()) {
            // see if the request is unusual
            if ((width >= 100) || (height >= 100)) {
                StackTraceElement[] stack = Thread.currentThread().getStackTrace();
                StringBuffer sb = new StringBuffer();
                int count = 0;
                for (StackTraceElement stackEntry : stack) {
                    if (count++ > 8)
                        break;
                    sb.append(stackEntry.getClassName() + ".");
                    sb.append(stackEntry.getMethodName() + " [");
                    sb.append(stackEntry.getLineNumber() + "]");
                    sb.append("\n");
                }
                MemoryAnalyzer.enqueueUsage("Blank " + width + "*" + height + "\n" + sb.toString());
            }
        }

        return RadianceCommonCortex.getBlankScaledImage(scale, width, height);
    }

    /**
     * Retrieves transparent image of specified dimension.
     *
     * @param width  Image width.
     * @param height Image height.
     * @return Transparent image of specified dimension.
     */
    public static BufferedImage getBlankUnscaledImage(int width, int height) {
        if (MemoryAnalyzer.isRunning()) {
            // see if the request is unusual
            if ((width >= 100) || (height >= 100)) {
                StackTraceElement[] stack = Thread.currentThread().getStackTrace();
                StringBuffer sb = new StringBuffer();
                int count = 0;
                for (StackTraceElement stackEntry : stack) {
                    if (count++ > 8)
                        break;
                    sb.append(stackEntry.getClassName() + ".");
                    sb.append(stackEntry.getMethodName() + " [");
                    sb.append(stackEntry.getLineNumber() + "]");
                    sb.append("\n");
                }
                MemoryAnalyzer.enqueueUsage("Blank " + width + "*" + height + "\n" + sb.toString());
            }
        }

        return RadianceCommonCortex.getBlankUnscaledImage(width, height);
    }

    /**
     * Retrieves transparent image of specified dimension.
     *
     * @return Transparent image of specified dimension.
     */
    public static BufferedImage getBlankUnscaledImage(BufferedImage image) {
        int imageWidth = image.getWidth();
        int imageHeight = image.getHeight();
        if (MemoryAnalyzer.isRunning()) {
            // see if the request is unusual
            if ((imageWidth >= 100) || (imageHeight >= 100)) {
                StackTraceElement[] stack = Thread.currentThread().getStackTrace();
                StringBuffer sb = new StringBuffer();
                int count = 0;
                for (StackTraceElement stackEntry : stack) {
                    if (count++ > 8)
                        break;
                    sb.append(stackEntry.getClassName() + ".");
                    sb.append(stackEntry.getMethodName() + " [");
                    sb.append(stackEntry.getLineNumber() + "]");
                    sb.append("\n");
                }
                MemoryAnalyzer.enqueueUsage(
                        "Blank " + imageWidth + "*" + imageHeight + "\n" + sb.toString());
            }
        }

        return RadianceCommonCortex.getBlankUnscaledImage(imageWidth, imageHeight);
    }

    /**
     * Checks whether the specified button should have minimal size.
     *
     * @param button Button.
     * @return <code>false</code> if the specified button should have minimal size,
     * <code>true</code> otherwise.
     * @see RadianceThemingCortex.ComponentOrParentScope#setButtonIgnoreMinimumSize(JComponent, Boolean)
     * @see RadianceThemingCortex.GlobalScope#setButtonIgnoreMinimumSize(Boolean)
     */
    public static boolean hasNoMinSizeProperty(AbstractButton button) {
        Object noMinSizeProperty = button.getClientProperty(RadianceSynapse.BUTTON_NO_MIN_SIZE);
        if (Boolean.TRUE.equals(noMinSizeProperty))
            return true;
        if (Boolean.FALSE.equals(noMinSizeProperty))
            return false;
        Container parent = button.getParent();
        if (parent instanceof JComponent) {
            noMinSizeProperty = ((JComponent) parent)
                    .getClientProperty(RadianceSynapse.BUTTON_NO_MIN_SIZE);
            if (Boolean.TRUE.equals(noMinSizeProperty))
                return true;
            if (Boolean.FALSE.equals(noMinSizeProperty))
                return false;
        }
        return (Boolean.TRUE.equals(UIManager.get(RadianceSynapse.BUTTON_NO_MIN_SIZE)));
    }

    /**
     * Marks the specified button as <code>flat</code>. A flat button doesn't show its background
     * unless selected, armed, pressed or (possibly) hovered over.
     *
     * @param button Button to mark as flat.
     */
    public static void markButtonAsFlat(AbstractButton button) {
        RadianceThemingCortex.ComponentOrParentScope.setBackgroundAppearanceStrategy(button,
                RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT);
        button.setOpaque(false);
    }

    /**
     * Checks whether the specified component is flat.
     *
     * @param comp         Component.
     * @param defaultValue The value to return.
     * @return <code>false</code> if the specified button is flat, <code>true</code> otherwise.
     * @see RadianceThemingCortex.ComponentOrParentScope#setBackgroundAppearanceStrategy(JComponent, RadianceThemingSlices.BackgroundAppearanceStrategy)
     * @see RadianceThemingCortex.GlobalScope#setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy)
     */
    public static boolean hasFlatAppearance(Component comp, boolean defaultValue) {
        // small optimizations for checkboxes and radio buttons
        if (comp instanceof JCheckBox) {
            return defaultValue;
        }
        if (comp instanceof JRadioButton) {
            return defaultValue;
        }

        Component c = comp;
        if (c instanceof JComponent) {
            JComponent jcomp = (JComponent) c;
            Object backgroundAppearanceStrategyProperty =
                    jcomp.getClientProperty(RadianceSynapse.BACKGROUND_APPEARANCE_STRATEGY);
            if (backgroundAppearanceStrategyProperty != null) {
                if (RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT.equals(backgroundAppearanceStrategyProperty)) {
                    return true;
                }
            }
        }
        if (c != null) {
            Container parent = c.getParent();
            if (parent instanceof JComponent) {
                JComponent jparent = (JComponent) parent;
                Object backgroundAppearanceStrategyProperty =
                        jparent.getClientProperty(RadianceSynapse.BACKGROUND_APPEARANCE_STRATEGY);
                if (backgroundAppearanceStrategyProperty != null) {
                    if (RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT.equals(backgroundAppearanceStrategyProperty)) {
                        return true;
                    }
                }
            }
        }

        Object backgroundAppearanceStrategyProperty =
                UIManager.get(RadianceSynapse.BACKGROUND_APPEARANCE_STRATEGY);
        if (backgroundAppearanceStrategyProperty != null) {
            if (RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT.equals(backgroundAppearanceStrategyProperty)) {
                return true;
            }
        }
        return defaultValue;
    }

    /**
     * Computes whether the specified button has flat appearance.
     *
     * @param button Button.
     * @return <code>true</code> if the button has flat appearance, <code>false</code> otherwise.
     */
    public static boolean hasFlatAppearance(AbstractButton button) {
        // small optimizations for checkboxes and radio buttons
        if (button instanceof JCheckBox)
            return false;
        if (button instanceof JRadioButton)
            return false;
        return ((RadianceCoreUtilities.isToolBarButton(button)
                && RadianceCoreUtilities.hasFlatAppearance(button, true))
                || RadianceCoreUtilities.hasFlatAppearance(button, false));
    }

    /**
     * Returns the popup flyout orientation for the specified combobox.
     *
     * @param combobox Combobox.
     * @return The popup flyout orientation for the specified combobox.
     * @see RadianceThemingCortex.ComponentScope#setComboBoxPopupFlyoutOrientation(JComboBox, Integer)
     * @see RadianceThemingCortex.GlobalScope#setComboBoxPopupFlyoutOrientation(int)
     */
    public static int getPopupFlyoutOrientation(JComboBox combobox) {
        Object comboProperty = combobox
                .getClientProperty(RadianceSynapse.COMBO_BOX_POPUP_FLYOUT_ORIENTATION);
        if (comboProperty instanceof Integer)
            return (Integer) comboProperty;
        Object globalProperty = UIManager.get(RadianceSynapse.COMBO_BOX_POPUP_FLYOUT_ORIENTATION);
        if (globalProperty instanceof Integer)
            return (Integer) globalProperty;
        return SwingConstants.SOUTH;
    }

    /**
     * Makes the specified component and all its descendants non-opaque.
     *
     * @param comp            Component.
     * @param opacitySnapshot The "snapshot" map that will contain the original opacity status of the specified
     *                        component and all its descendants.
     */
    public static void makeNonOpaque(Component comp, Map<Component, Boolean> opacitySnapshot) {
        if (comp instanceof JComponent) {
            JComponent jcomp = (JComponent) comp;
            opacitySnapshot.put(comp, jcomp.isOpaque());
            jcomp.setOpaque(false);
        }
        if (comp instanceof Container) {
            Container cont = (Container) comp;
            for (int i = 0; i < cont.getComponentCount(); i++)
                makeNonOpaque(cont.getComponent(i), opacitySnapshot);
        }
    }

    /**
     * Restores the opacity of the specified component and all its descendants.
     *
     * @param comp            Component.
     * @param opacitySnapshot The "snapshot" map that contains the original opacity status of the specified
     *                        component and all its descendants.
     */
    public static void restoreOpaque(Component comp, Map<Component, Boolean> opacitySnapshot) {
        if (comp instanceof JComponent) {
            JComponent jcomp = (JComponent) comp;
            // fix for defect 159 - snapshot may not contain
            // opacity for table header of a table when it's used
            // inside tree cell renderer (wrapper in a scroll pane).
            if (opacitySnapshot.containsKey(comp))
                jcomp.setOpaque(opacitySnapshot.get(comp));
            else
                jcomp.setOpaque(true);
        }
        if (comp instanceof Container) {
            Container cont = (Container) comp;
            for (int i = 0; i < cont.getComponentCount(); i++)
                restoreOpaque(cont.getComponent(i), opacitySnapshot);
        }
    }

    public static RadianceThemingSlices.IconFilterStrategy getActiveIconFilterStrategy(JComponent comp) {
        if ((comp == null) || comp.getClass().isAnnotationPresent(RadianceInternalButton.class)) {
            return RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        }
        Object compProperty = comp.getClientProperty(RadianceSynapse.ICON_FILTER_STRATEGY_ACTIVE);
        if (compProperty instanceof RadianceThemingSlices.IconFilterStrategy) {
            return (RadianceThemingSlices.IconFilterStrategy) compProperty;
        }

        Object globalProperty = UIManager.get(RadianceSynapse.ICON_FILTER_STRATEGY_ACTIVE);
        if (globalProperty instanceof RadianceThemingSlices.IconFilterStrategy) {
            return (RadianceThemingSlices.IconFilterStrategy) globalProperty;
        }

        return RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
    }

    public static RadianceThemingSlices.IconFilterStrategy getEnabledIconFilterStrategy(JComponent comp) {
        if ((comp == null) || comp.getClass().isAnnotationPresent(RadianceInternalButton.class)) {
            return RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        }
        Object compProperty = comp.getClientProperty(RadianceSynapse.ICON_FILTER_STRATEGY_ENABLED);
        if (compProperty instanceof RadianceThemingSlices.IconFilterStrategy) {
            return (RadianceThemingSlices.IconFilterStrategy) compProperty;
        }

        Object globalProperty = UIManager.get(RadianceSynapse.ICON_FILTER_STRATEGY_ENABLED);
        if (globalProperty instanceof RadianceThemingSlices.IconFilterStrategy) {
            return (RadianceThemingSlices.IconFilterStrategy) globalProperty;
        }

        return RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
    }

    public static RadianceThemingSlices.IconFilterStrategy getDisabledIconFilterStrategy(JComponent comp) {
        if ((comp == null) || comp.getClass().isAnnotationPresent(RadianceInternalButton.class)) {
            return RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME;
        }
        Object compProperty = comp.getClientProperty(RadianceSynapse.ICON_FILTER_STRATEGY_DISABLED);
        if (compProperty instanceof RadianceThemingSlices.IconFilterStrategy) {
            return (RadianceThemingSlices.IconFilterStrategy) compProperty;
        }

        Object globalProperty = UIManager.get(RadianceSynapse.ICON_FILTER_STRATEGY_DISABLED);
        if (globalProperty instanceof RadianceThemingSlices.IconFilterStrategy) {
            return (RadianceThemingSlices.IconFilterStrategy) globalProperty;
        }

        return RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME;
    }

    /**
     * Returns the callback to be called upon tab closing (using the tab close button).
     *
     * @param tabbedPane Tabbed pane.
     * @param tabIndex   Tab index.
     * @return Callback to be called upon tab closing (using the tab close button).
     * @see RadianceThemingCortex.ComponentScope#setTabCloseCallback(JTabbedPane, TabCloseCallback)
     * @see RadianceThemingCortex.GlobalScope#setTabCloseCallback(TabCloseCallback)
     */
    public static TabCloseCallback getTabCloseCallback(JTabbedPane tabbedPane,
            int tabIndex) {
        int tabCount = tabbedPane.getTabCount();
        if ((tabIndex < 0) || (tabIndex >= tabCount))
            return null;

        // check property on tab component
        Component tabComponent = tabbedPane.getComponentAt(tabIndex);
        if (tabComponent instanceof JComponent) {
            Object compProp = ((JComponent) tabComponent)
                    .getClientProperty(RadianceSynapse.TABBED_PANE_CLOSE_CALLBACK);
            if (compProp instanceof TabCloseCallback)
                return (TabCloseCallback) compProp;
        }

        // check property on tabbed pane
        Object tabProp = tabbedPane.getClientProperty(RadianceSynapse.TABBED_PANE_CLOSE_CALLBACK);
        if (tabProp instanceof TabCloseCallback)
            return (TabCloseCallback) tabProp;

        Object globProp = UIManager.get(RadianceSynapse.TABBED_PANE_CLOSE_CALLBACK);
        if (globProp instanceof TabCloseCallback)
            return (TabCloseCallback) globProp;

        return null;
    }

    /**
     * Blends two images along Y-axis.
     *
     * @param imageTop    The left image.
     * @param imageBottom The right image.
     * @param start       Relative start of the blend area (in 0.0-1.0 range).
     * @param end         Relative end of the blend area (in 0.0-1.0 range).
     * @return Blended image.
     */
    public static BufferedImage blendImagesVertical(BufferedImage imageTop,
            BufferedImage imageBottom, double start, double end) {
        int width = imageTop.getWidth();
        if (width != imageBottom.getWidth())
            throw new IllegalArgumentException("Widths are not the same: " + imageTop.getWidth()
                    + " and " + imageBottom.getWidth());
        int height = imageTop.getHeight();
        if (height != imageBottom.getHeight())
            throw new IllegalArgumentException("Heights are not the same: " + imageTop.getHeight()
                    + " and " + imageBottom.getHeight());

        BufferedImage result = getBlankUnscaledImage(imageTop);
        Graphics2D graphics = result.createGraphics();

        int startY = (int) (start * height);
        int endY = (int) (end * height);
        int rampHeight = endY - startY;

        if (rampHeight == 0) {
            graphics.drawImage(imageTop, 0, 0, width, startY, 0, 0, width, startY, null);
            graphics.drawImage(imageBottom, 0, startY, width, height, 0, startY, width, height,
                    null);
        } else {
            BufferedImage rampBottom = getBlankUnscaledImage(width, rampHeight);
            Graphics2D rampBottomG = (Graphics2D) rampBottom.getGraphics();
            rampBottomG.setPaint(new GradientPaint(new Point(0, 0), new Color(0, 0, 0, 255),
                    new Point(0, rampHeight), new Color(0, 0, 0, 0)));
            rampBottomG.fillRect(0, 0, width, rampHeight);

            BufferedImage tempBottom = getBlankUnscaledImage(width, height - startY);
            Graphics2D tempBottomG = (Graphics2D) tempBottom.getGraphics();
            tempBottomG.drawImage(imageBottom, 0, 0, width, height - startY, 0, startY, width,
                    height, null);
            tempBottomG.setComposite(AlphaComposite.DstOut);
            tempBottomG.drawImage(rampBottom, 0, 0, null);

            tempBottomG.setComposite(AlphaComposite.SrcOver);
            graphics.drawImage(imageTop, 0, 0, null);
            graphics.drawImage(tempBottom, 0, startY, null);
        }
        graphics.dispose();
        return result;
    }

    /**
     * Blends two images along X-axis.
     *
     * @param imageLeft  The left image.
     * @param imageRight The right image.
     * @param start      Relative start of the blend area (in 0.0-1.0 range).
     * @param end        Relative end of the blend area (in 0.0-1.0 range).
     * @return Blended image.
     */
    public static BufferedImage blendImagesHorizontal(BufferedImage imageLeft,
            BufferedImage imageRight, double start, double end) {
        int width = imageLeft.getWidth();
        if (width != imageRight.getWidth())
            throw new IllegalArgumentException("Widths are not the same: " + imageLeft.getWidth()
                    + " and " + imageRight.getWidth());
        int height = imageLeft.getHeight();
        if (height != imageRight.getHeight())
            throw new IllegalArgumentException("Heights are not the same: " + imageLeft.getHeight()
                    + " and " + imageRight.getHeight());

        BufferedImage result = getBlankUnscaledImage(imageLeft);
        Graphics2D graphics = result.createGraphics();

        int startX = (int) (start * width);
        int endX = (int) (end * width);
        int rampWidth = endX - startX;

        if (rampWidth == 0) {
            graphics.drawImage(imageLeft, 0, 0, startX, height, 0, 0, startX, height, null);
            graphics.drawImage(imageRight, startX, 0, width, height, startX, 0, width, height,
                    null);
        } else {
            BufferedImage rampRight = getBlankUnscaledImage(rampWidth, height);
            Graphics2D rampRightG = (Graphics2D) rampRight.getGraphics();
            rampRightG.setPaint(new GradientPaint(new Point(0, 0), new Color(0, 0, 0, 255),
                    new Point(rampWidth, 0), new Color(0, 0, 0, 0)));
            rampRightG.fillRect(0, 0, rampWidth, height);

            BufferedImage tempRight = getBlankUnscaledImage(width - startX, height);
            Graphics2D tempRightG = (Graphics2D) tempRight.getGraphics();
            tempRightG.drawImage(imageRight, 0, 0, width - startX, height, startX, 0, width, height,
                    null);
            tempRightG.setComposite(AlphaComposite.DstOut);
            tempRightG.drawImage(rampRight, 0, 0, null);

            tempRightG.setComposite(AlphaComposite.SrcOver);
            graphics.drawImage(imageLeft, 0, 0, null);
            graphics.drawImage(tempRight, startX, 0, null);
        }
        graphics.dispose();
        return result;
    }

    /**
     * Returns the popup prototype display value for the specified combo box. This value is used to
     * compute the width of the combo popup.
     *
     * @param combo Combo box.
     * @return The popup prototype display value for the specified combo box.
     */
    @SuppressWarnings("unchecked")
    public static <T> T getComboPopupPrototypeDisplayValue(JComboBox<T> combo) {
        Object callback = combo
                .getClientProperty(RadianceSynapse.COMBOBOX_POPUP_PROTOTYPE_CALLBACK);
        if (callback == null)
            callback = UIManager.get(RadianceSynapse.COMBOBOX_POPUP_PROTOTYPE_CALLBACK);
        if (callback instanceof ComboPopupPrototypeCallback) {
            return ((ComboPopupPrototypeCallback<T>) callback).getPopupPrototypeDisplayValue(combo);
        }

        Object displayValue = combo
                .getClientProperty(RadianceSynapse.COMBOBOX_POPUP_PROTOTYPE_OBJECT);
        if (displayValue == null)
            displayValue = UIManager.get(RadianceSynapse.COMBOBOX_POPUP_PROTOTYPE_OBJECT);

        // check if this object is in the model ???
        return (T) displayValue;
    }

    /**
     * Returns the set of sides registered on the specified button.
     *
     * @param component    Button.
     * @param propertyName Client property name for retrieving the registered sides.
     * @return Set of sides registered on the specified button.
     */
    @SuppressWarnings("unchecked")
    public static Set<RadianceThemingSlices.Side> getSides(JComponent component, String propertyName) {
        if (component == null) {
            return null;
        }

        Object prop = component.getClientProperty(propertyName);
        if (prop == null) {
            return null;
        }

        if (prop instanceof Set) {
            return (Set<RadianceThemingSlices.Side>) prop;
        }

        if (prop instanceof RadianceThemingSlices.Side) {
            Set<RadianceThemingSlices.Side> result = EnumSet.noneOf(RadianceThemingSlices.Side.class);
            result.add((RadianceThemingSlices.Side) prop);
            return result;
        }
        return null;
    }

    /**
     * Returns the corner radius of the specified toolbar button.
     *
     * @param button Toolbar button.
     * @param insets Button insets.
     * @return Corner radius of the specified toolbar button.
     * @see RadianceThemingCortex.ComponentScope#setToolbarButtonCornerRadius(AbstractButton, float)
     * @see RadianceThemingCortex.GlobalScope#setToolbarButtonCornerRadius(float)
     */
    public static float getToolbarButtonCornerRadius(JComponent button, float insets) {

        JToolBar toolbar = null;
        Component c = button.getParent();
        while (c != null) {
            if (c instanceof JToolBar) {
                toolbar = (JToolBar) c;
                break;
            }
            c = c.getParent();
        }
        if (toolbar == null)
            return 2.0f;

        float width = button.getWidth() - 2 * insets;
        float height = button.getHeight() - 2 * insets;
        float maxRadius = (width > height) ? (height) / 2.0f : (width) / 2.0f;

        Object buttonProp = button.getClientProperty(RadianceSynapse.TOOLBAR_BUTTON_CORNER_RADIUS);
        if (buttonProp instanceof Float)
            return Math.min(maxRadius, ((Float) buttonProp).floatValue());

        Object toolbarProp = toolbar
                .getClientProperty(RadianceSynapse.TOOLBAR_BUTTON_CORNER_RADIUS);
        if (toolbarProp instanceof Float)
            return Math.min(maxRadius, ((Float) toolbarProp).floatValue());

        Object globalProp = UIManager.get(RadianceSynapse.TOOLBAR_BUTTON_CORNER_RADIUS);
        if (globalProp instanceof Float)
            return Math.min(maxRadius, ((Float) globalProp).floatValue());

        return 2.0f;
    }

    /**
     * Returns the number of echo characters per each password character.
     *
     * @param jpf Password field.
     * @return The number of echo characters per each password character.
     */
    public static int getEchoPerChar(JPasswordField jpf) {
        Object obj = jpf.getClientProperty(RadianceSynapse.PASSWORD_ECHO_PER_CHAR);
        if ((obj instanceof Integer)) {
            int result = (Integer) obj;
            if (result >= 1)
                return result;
        }

        obj = UIManager.get(RadianceSynapse.PASSWORD_ECHO_PER_CHAR);
        if ((obj instanceof Integer)) {
            int result = (Integer) obj;
            if (result >= 1)
                return result;
        }
        return 1;
    }

    /**
     * Creates a soft-clipped image. Code taken from
     * <a href= "https://community.oracle.com/blogs/campbell/2006/07/27/java-2d-trickery-light-and-shadow"
     * >here</a>.
     *
     * @author Chris Campbell.
     */
    public static BufferedImage softClip(double scale, int width, int height,
            BufferedImage source, Shape clipShape) {
        // Create a translucent intermediate image in which we can perform
        // the soft clipping
        BufferedImage img = RadianceCoreUtilities.getBlankImage(scale, width, height);
        Graphics2D g2 = img.createGraphics();

        // Clear the image so all pixels have zero alpha
        g2.setComposite(AlphaComposite.Clear);
        g2.fillRect(0, 0, width, height);

        // Render our clip shape into the image. Note that we enable
        // antialiasing to achieve the soft clipping effect. Try
        // commenting out the line that enables antialiasing, and
        // you will see that you end up with the usual hard clipping.
        g2.setComposite(AlphaComposite.Src);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.fill(clipShape);

        // Here's the trick... We use SrcAtop, which effectively uses the
        // alpha value as a coverage value for each pixel stored in the
        // destination. For the areas outside our clip shape, the destination
        // alpha will be zero, so nothing is rendered in those areas. For
        // the areas inside our clip shape, the destination alpha will be fully
        // opaque, so the full color is rendered. At the edges, the original
        // antialiasing is carried over to give us the desired soft clipping
        // effect.
        g2.setComposite(AlphaComposite.SrcAtop);
        g2.drawImage(source, 0, 0, null);
        g2.dispose();

        return img;
    }

    /**
     * Checks whether the specified component has extra Radiance-specific UI elements.
     *
     * @param component Component.
     * @return <code>true</code> if the specified component has extra Radiance-specific UI
     * elements, <code>false</code> otherwise.
     * @see RadianceThemingCortex.ComponentOrParentChainScope#setExtraWidgetsPresence(JComponent, Boolean)
     * @see RadianceThemingCortex.GlobalScope#setExtraWidgetsPresence(Boolean)
     */
    public static boolean toShowExtraWidgets(Component component) {
        Component c = component;
        while (c != null) {
            if (c instanceof JComponent) {
                JComponent jcomp = (JComponent) c;
                Object componentProp = jcomp.getClientProperty(RadianceSynapse.SHOW_EXTRA_WIDGETS);
                if (componentProp != null) {
                    if (Boolean.TRUE.equals(componentProp))
                        return false;
                    if (Boolean.FALSE.equals(componentProp))
                        return true;
                }
            }
            c = c.getParent();
        }
        return Boolean.TRUE.equals(UIManager.get(RadianceSynapse.SHOW_EXTRA_WIDGETS));
    }

    public static RadianceThemingSlices.IconFilterStrategy getIconFilterStrategy(JComponent component,
                                                                                 ComponentState componentState) {
        if (componentState.isDisabled()) {
            return RadianceCoreUtilities.getDisabledIconFilterStrategy(component);
        }
        if (componentState == ComponentState.ENABLED) {
            return RadianceCoreUtilities.getEnabledIconFilterStrategy(component);
        }
        return RadianceCoreUtilities.getActiveIconFilterStrategy(component);
    }

    public static Icon getFilteredIcon(JComponent comp, Icon orig,
            ComponentState componentState, Color textColor) {
        double scale = RadianceCommonCortex.getScaleFactor(comp);

        RadianceThemingSlices.IconFilterStrategy iconFilterStrategy = getIconFilterStrategy(comp, componentState);
        RadianceColorScheme colorScheme = RadianceColorSchemeUtilities.getColorScheme(
                comp, componentState);
        switch (iconFilterStrategy) {
            case ORIGINAL:
                return orig;
            case THEMED_FOLLOW_TEXT:
                Color foreground = (textColor != null) ? textColor
                        : colorScheme.getForegroundColor();
                return new ScaleAwareImageWrapperIcon(RadianceImageCreator.getColorImage(
                        comp, orig, foreground, 1.0f), scale);
            case THEMED_FOLLOW_COLOR_SCHEME:
                float brightnessFactor = colorScheme.isDark() ? 0.2f : 0.8f;
                return new ScaleAwareImageWrapperIcon(RadianceImageCreator.getColorSchemeImage(
                        comp, orig, colorScheme, brightnessFactor), scale);
        }
        return null;
    }

    public static Icon getFilteredIcon(JTabbedPane tab, int tabIndex, Icon orig,
            ComponentState componentState, Color textColor) {
        double scale = RadianceCommonCortex.getScaleFactor(tab);

        RadianceThemingSlices.IconFilterStrategy iconFilterStrategy = getIconFilterStrategy(tab, componentState);
        RadianceColorScheme colorScheme = RadianceColorSchemeUtilities.getColorScheme(
                tab, componentState);
        switch (iconFilterStrategy) {
            case ORIGINAL:
                return orig;
            case THEMED_FOLLOW_TEXT:
                Color foreground = (textColor != null) ? textColor
                        : colorScheme.getForegroundColor();
                return new ScaleAwareImageWrapperIcon(RadianceImageCreator.getColorImage(
                        tab, orig, foreground, 1.0f), scale);
            case THEMED_FOLLOW_COLOR_SCHEME:
                float brightnessFactor = colorScheme.isDark() ? 0.2f : 0.8f;
                return new ScaleAwareImageWrapperIcon(RadianceImageCreator.getColorSchemeImage(
                        tab, orig, colorScheme, brightnessFactor), scale);
        }
        return null;
    }

    public static Icon getOriginalIcon(AbstractButton b, Icon defaultIcon) {
        ButtonModel model = b.getModel();
        Icon icon = b.getIcon();
        if (icon == null)
            icon = defaultIcon;

        if (icon.getClass().isAnnotationPresent(TransitionAware.class))
            return icon;

        Icon tmpIcon = null;

        if (icon != null) {
            if (!model.isEnabled()) {
                if (model.isSelected()) {
                    tmpIcon = b.getDisabledSelectedIcon();
                } else {
                    tmpIcon = b.getDisabledIcon();
                }
            } else if (model.isPressed() && model.isArmed()) {
                tmpIcon = b.getPressedIcon();
            } else if (b.isRolloverEnabled() && model.isRollover()) {
                if (model.isSelected()) {
                    tmpIcon = b.getRolloverSelectedIcon();
                    if (tmpIcon == null) {
                        tmpIcon = b.getSelectedIcon();
                    }
                } else {
                    tmpIcon = b.getRolloverIcon();
                }
            } else if (model.isSelected()) {
                tmpIcon = b.getSelectedIcon();
            }

            if (tmpIcon != null) {
                icon = tmpIcon;
            }
        }
        return icon;
    }

    /**
     * Returns the global menu gutter fill alpha.
     *
     * @return The global menu gutter fill alpha.
     */
    public static float getMenuGutterFillAlpha() {
        Object globalSetting = UIManager.get(RadianceSynapse.MENU_GUTTER_FILL_ALPHA);
        if (globalSetting instanceof Float) {
            return ((Float) globalSetting).floatValue();
        }
        return 0.75f;
    }

    /**
     * Given a component, returns the parent for computing the {@link RadianceDecorationPainter}.
     *
     * @param c Component.
     * @return The parent for computing the {@link RadianceDecorationPainter}.
     */
    public static Container getHeaderParent(Component c) {
        Component comp = c.getParent();
        Container result = null;
        while (comp != null) {
            // the second part fixes the incorrect alignments on
            // internal frames.
            if ((comp instanceof JLayeredPane) && (result == null))
                result = (Container) comp;
            if ((result == null) && (comp instanceof Window))
                result = (Container) comp;
            comp = comp.getParent();
        }
        return result;
    }

    public static void paintFocus(Graphics g, Component mainComp, Component focusedComp,
            TransitionAwareUI transitionAwareUI, double scaleFactor, Shape focusShape,
            Rectangle textRect, float maxAlphaCoef, float extraPadding) {
        Color color = RadianceColorUtilities.getFocusColor(mainComp, transitionAwareUI);
        paintFocus(g, mainComp, focusedComp, transitionAwareUI,
                scaleFactor, focusShape, textRect, color, maxAlphaCoef, extraPadding);
    }

    public static void paintFocus(Graphics g, Component mainComp, Component focusedComp,
            TransitionAwareUI transitionAwareUI, double scaleFactor, Shape focusShape,
            Rectangle textRect, Color focusColor, float maxAlphaCoef, float extraPadding) {
        float focusStrength = transitionAwareUI.getTransitionTracker()
                .getFocusStrength(focusedComp.hasFocus());
        if (focusStrength == 0.0f) {
            return;
        }

        RadianceThemingSlices.FocusKind focusKind = RadianceCoreUtilities.getFocusKind(mainComp);
        if (focusKind == RadianceThemingSlices.FocusKind.NONE) {
            return;
        }

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        float alpha = maxAlphaCoef * focusStrength;
        graphics.setComposite(WidgetUtilities.getAlphaComposite(mainComp, alpha, g));

        graphics.setColor(focusColor);
        focusKind.paintFocus(mainComp, focusedComp, transitionAwareUI, graphics, scaleFactor,
                focusShape, textRect, extraPadding);
        graphics.dispose();
    }

    /**
     * Uninstalls the specified menu item.
     *
     * @param menuItem Menu item.
     */
    public static void uninstallMenu(JMenuItem menuItem) {
        if (menuItem instanceof JMenu) {
            JMenu menu = (JMenu) menuItem;
            for (Component comp : menu.getMenuComponents())
                if (comp instanceof JMenuItem)
                    RadianceCoreUtilities.uninstallMenu((JMenuItem) comp);
        }

        ButtonUI menuItemUI = menuItem.getUI();
        if (menuItemUI instanceof RadianceMenu) {
            RadianceMenu sMenu = (RadianceMenu) menuItemUI;
            if (sMenu.getAssociatedMenuItem() != null) {
                menuItemUI.uninstallUI(menuItem);
            }
        }

        for (ActionListener actionListener : menuItem.getActionListeners())
            menuItem.removeActionListener(actionListener);

        menuItem.removeAll();
    }

    /**
     * Returns the class loader for loading the resource files. It is a fix by Dag Joar and
     * Christian Schlichtherle for application running with -Xbootclasspath VM flag. In this case,
     * using MyClass.class.getClassLoader() would return null, but the context class loader will
     * function properly that classes will be properly loaded regardless of whether the lib is added
     * to the system class path, the extension class path and regardless of the class loader
     * architecture set up by some frameworks.
     *
     * @return The class loader for loading the resource files.
     */
    public static ClassLoader getClassLoaderForResources() {
        ClassLoader cl = (ClassLoader) UIManager.get("ClassLoader");
        if (cl == null)
            cl = Thread.currentThread().getContextClassLoader();
        return cl;
    }

    public static boolean isCoveredByLightweightPopups(final Component comp) {
        JRootPane rootPane = SwingUtilities.getRootPane(comp);
        if (rootPane == null)
            return false;
        Component[] popups = rootPane.getLayeredPane()
                .getComponentsInLayer(JLayeredPane.POPUP_LAYER);
        if (popups == null)
            return false;

        // System.out.println("Has " + popups.length + " popups");

        // Convert the component bounds to the layered pane.
        // Can't use the SwingUtilities.convertRectangle() as that
        // eventually will try to acquire the lock on the container
        Rectangle compBoundsConverted = SwingUtilities.convertRectangle(comp.getParent(),
                comp.getBounds(), rootPane.getLayeredPane());

        // System.out.println("Bounds : \n\torig : " + comp.getBounds()
        // + "\n\ttrans:" + compBoundsConverted);

        int popupIndexToStartWith = getPopupParentIndexOf(comp, popups) - 1;
        // String txt = (comp instanceof JMenuItem) ? ((JMenuItem) comp)
        // .getText() : "";
        // System.out.println("Starting scan from popup "
        // + popupIndexToStartWith + " for " + txt);
        for (int i = popupIndexToStartWith; i >= 0; i--) {
            Component popup = popups[i];
            // System.out.println("Popup " +
            // popup.getClass().getName());
            // System.out.println("Popup bounds " + popup.getBounds());
            if (compBoundsConverted.intersects(popup.getBounds())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets a component and a list of popups and returns the index of the popup that is a parent of
     * the specified component. Is used to track issue 297 and prevent visual artifacts.
     *
     * @param comp   Component.
     * @param popups List of popups.
     * @return Index of the popup which is component's parent if any, or the popup list length
     * otherwise.
     */
    public static int getPopupParentIndexOf(Component comp, Component[] popups) {
        for (int i = 0; i < popups.length; i++) {
            Component popup = popups[i];

            Component currComp = comp;
            while (currComp != null) {
                if (currComp == popup) {
                    return i;
                }
                currComp = currComp.getParent();
            }
        }
        return popups.length;
    }

    /**
     * Returns the border painter for the specified component.
     *
     * @param comp Component.
     * @return Border painter for the specified component.
     * @see RadianceSkin#getBorderPainter()
     */
    public static RadianceBorderPainter getBorderPainter(Component comp) {
        return RadianceCoreUtilities.getSkin(comp).getBorderPainter();
    }

    /**
     * Returns the highlight border painter for the specified component.
     *
     * @param comp Component.
     * @return Highlight border painter for the specified component.
     * @see RadianceSkin#getBorderPainter()
     * @see RadianceSkin#getHighlightBorderPainter()
     */
    public static RadianceBorderPainter getHighlightBorderPainter(Component comp) {
        RadianceBorderPainter result = RadianceCoreUtilities.getSkin(comp)
                .getHighlightBorderPainter();
        if (result != null)
            return result;
        return getBorderPainter(comp);
    }

    /**
     * Returns the component hierarchy.
     *
     * @param comp Component.
     * @return Component hierarchy string.
     */
    public static String getHierarchy(Component comp) {
        StringBuffer buffer = new StringBuffer();
        getHierarchy(comp, buffer, 0);
        while (true) {
            if (comp instanceof Window) {
                Window w = (Window) comp;
                comp = w.getOwner();
                if (comp != null) {
                    buffer.append("Owner --->\n");
                    getHierarchy(comp, buffer, 0);
                }
            } else {
                break;
            }
        }
        return buffer.toString();
    }

    /**
     * Computes the component hierarchy.
     *
     * @param comp   Component.
     * @param buffer Hierarchy representation buffer.
     * @param level  Hierarchy level.
     */
    public static void getHierarchy(Component comp, StringBuffer buffer, int level) {
        for (int i = 0; i < level; i++)
            buffer.append("   ");
        String name = comp.getName();
        if (comp instanceof Dialog)
            name = ((Dialog) comp).getTitle();
        if (comp instanceof Frame)
            name = ((Frame) comp).getTitle();
        buffer.append(comp.getClass().getName() + "[" + name + "]\n");
        if (comp instanceof Container) {
            Container cont = (Container) comp;
            for (int i = 0; i < cont.getComponentCount(); i++)
                getHierarchy(cont.getComponent(i), buffer, level + 1);
        }
    }

    /**
     * Returns the arrow icon.
     *
     * @param button      Button.
     * @param orientation Arrow orientation.
     * @return Arrow icon.
     */
    public static Icon getArrowIcon(AbstractButton button, int orientation) {
        Icon result = new ArrowButtonTransitionAwareIcon(button, orientation);
        return result;
    }

    /**
     * Returns the arrow icon.
     *
     * @param comp        Component.
     * @param orientation Arrow orientation.
     * @return Arrow icon.
     */
    public static Icon getArrowIcon(JComponent comp,
            TransitionAwareIcon.TransitionAwareUIDelegate transitionAwareUIDelegate,
            int orientation) {
        Icon result = new ArrowButtonTransitionAwareIcon(comp, transitionAwareUIDelegate,
                orientation);
        return result;
    }

    /**
     * Returns the colorization factor for the specified component.
     *
     * @param c Component.
     * @return The colorization factor for the specified component.
     * @see RadianceThemingCortex.ComponentOrParentChainScope#setColorizationFactor(JComponent, double)
     * @see RadianceThemingCortex.GlobalScope#setColorizationFactor(double)
     */
    public static double getColorizationFactor(Component c) {
        JPopupMenu popupMenu = null;
        while (c != null) {
            if (c instanceof JComponent) {
                JComponent jcomp = (JComponent) c;
                Object compProp = jcomp.getClientProperty(RadianceSynapse.COLORIZATION_FACTOR);
                if (compProp instanceof Double)
                    return (Double) compProp;
            }
            if (c instanceof JPopupMenu) {
                popupMenu = (JPopupMenu) c;
            }
            c = c.getParent();
        }

        if (popupMenu != null) {
            Component invoker = popupMenu.getInvoker();
            if (popupMenu != invoker)
                return getColorizationFactor(popupMenu.getInvoker());
        }

        Object globalProp = UIManager.get(RadianceSynapse.COLORIZATION_FACTOR);
        if (globalProp instanceof Double) {
            return (Double) globalProp;
        }

        return 0.5;
    }

    /**
     * Returns the skin of the specified component.
     *
     * @param c Component.
     * @return The skin of the specified component.
     */
    public static RadianceSkin getSkin(Component c) {
        if (!RadianceCoreUtilities.isCurrentLookAndFeel())
            return null;

        if (!RadianceRootPaneUI.hasCustomSkinOnAtLeastOneRootPane())
            return RadianceThemingCortex.GlobalScope.getCurrentSkin();

        RadianceComboPopup comboPopup = (RadianceComboPopup) SwingUtilities
                .getAncestorOfClass(RadianceComboPopup.class, c);
        if (comboPopup != null) {
            // special case for combobox popup - take the skin
            // of the combobox itself - issue 439
            return getSkin(comboPopup.getCombobox());
        }

        JRootPane rootPane = SwingUtilities.getRootPane(c);

        if (c instanceof RadianceInternalFrameTitlePane) {
            // use correct root pane for painting the
            // title panes of internal frames
            Component frame = c.getParent();
            if (frame instanceof JInternalFrame) {
                rootPane = ((JInternalFrame) frame).getRootPane();
            }
        }
        if ((c != null) && (c.getParent() instanceof RadianceInternalFrameTitlePane)) {
            // use correct root pane for painting the
            // title buttons of internal frames
            Component frame = c.getParent().getParent();
            if ((frame instanceof JInternalFrame)) {
                rootPane = ((JInternalFrame) frame).getRootPane();
            }
        }
        if (rootPane != null) {
            Object skinProp = rootPane.getClientProperty(RadianceSynapse.ROOT_PANE_SKIN);
            if (skinProp instanceof RadianceSkin)
                return (RadianceSkin) skinProp;
        }
        return RadianceThemingCortex.GlobalScope.getCurrentSkin();
    }

    /**
     * Returns a hash key for the specified parameters.
     *
     * @param objects Key components.
     * @return Hash key.
     */
    public static HashMapKey getHashKey(Object... objects) {
        return new HashMapKey(objects);
    }

    public static ImageHashMapKey getScaleAwareHashKey(double scale, Object... objects) {
        return new ImageHashMapKey(scale, objects);
    }

    /**
     * Stops all Radiance threads. Improper use may result in UI artifacts and runtime exceptions.
     */
    public static void stopThreads() {
        TrackableThread.requestStopAllThreads();
    }

    /**
     * Tests UI threading violations on creating the specified component.
     *
     * @param comp Component.
     * @throws UiThreadingViolationException If the component is created off Event Dispatch Thread.
     */
    public static void testComponentCreationThreadingViolation(Component comp) {
        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                    "Component creation must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }
    }

    /**
     * Tests UI threading violations on changing the state the specified component.
     *
     * @param comp Component.
     * @throws UiThreadingViolationException If the component is changing state off Event Dispatch Thread.
     */
    public static void testComponentStateChangeThreadingViolation(Component comp) {
        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                    "Component state change must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }
    }

    /**
     * Tests UI threading violations on closing the specified window.
     *
     * @param w Window.
     * @throws UiThreadingViolationException If the window is closed off Event Dispatch Thread.
     */
    public static void testWindowCloseThreadingViolation(Window w) {
        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                    "Window close must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }
    }

    public static void traceRadianceApiUsage(Component comp, String message) {
        Window w = SwingUtilities.getWindowAncestor(comp);
        String wTitle = null;
        if (w instanceof Frame) {
            wTitle = ((Frame) w).getTitle();
        }
        if (w instanceof Dialog) {
            wTitle = ((Dialog) w).getTitle();
        }
        String wClassName = (w != null) ? w.getClass().getName() : null;
        throw new IllegalArgumentException(message + " [component "
                + comp.getClass().getSimpleName() + " in window " + wClassName + ":'" + wTitle
                + "' under " + UIManager.getLookAndFeel().getName() + "]");
    }

    /**
     * Scans {@code imageList} for best-looking image of specified dimensions. Image can be scaled
     * and/or padded with transparency.
     */
    public static BufferedImage getScaledIconImage(double scale,
            java.util.List<Image> imageList, int width, int height) {
        if (width == 0 || height == 0) {
            return null;
        }
        Image bestImage = null;
        int bestWidth = 0;
        int bestHeight = 0;
        double bestSimilarity = 3; // Impossibly high value
        for (Iterator<Image> i = imageList.iterator(); i.hasNext(); ) {
            // Iterate imageList looking for best matching image.
            // 'Similarity' measure is defined as good scale factor and small
            // insets.
            // Best possible similarity is 0 (no scale, no insets).
            // It's found while the experiments that good-looking result is
            // achieved with scale factors x1, x3/4, x2/3, xN, x1/N.
            Image im = i.next();
            if (im == null) {
                continue;
            }
            int iw;
            int ih;
            try {
                iw = im.getWidth(null);
                ih = im.getHeight(null);
            } catch (Exception e) {
                continue;
            }
            if (iw > 0 && ih > 0) {
                // Calc scale factor
                double scaleFactor = Math.min((double) width / (double) iw,
                        (double) height / (double) ih);
                // Calculate scaled image dimensions
                // adjusting scale factor to nearest "good" value
                int adjw = 0;
                int adjh = 0;
                double scaleMeasure = 1; // 0 - best (no) scale, 1 - impossibly
                // bad
                if (scaleFactor >= 2) {
                    // Need to enlarge image more than twice
                    // Round down scale factor to multiply by integer value
                    scaleFactor = Math.floor(scaleFactor);
                    adjw = iw * (int) scaleFactor;
                    adjh = ih * (int) scaleFactor;
                    scaleMeasure = 1.0 - 0.5 / scaleFactor;
                } else if (scaleFactor >= 1) {
                    // Don't scale
                    scaleFactor = 1.0;
                    adjw = iw;
                    adjh = ih;
                    scaleMeasure = 0;
                } else if (scaleFactor >= 0.75) {
                    // Multiply by 3/4
                    scaleFactor = 0.75;
                    adjw = iw * 3 / 4;
                    adjh = ih * 3 / 4;
                    scaleMeasure = 0.3;
                } else if (scaleFactor >= 0.6666) {
                    // Multiply by 2/3
                    scaleFactor = 0.6666;
                    adjw = iw * 2 / 3;
                    adjh = ih * 2 / 3;
                    scaleMeasure = 0.33;
                } else {
                    // Multiply size by 1/scaleDivider
                    // where scaleDivider is minimum possible integer
                    // larger than 1/scaleFactor
                    double scaleDivider = Math.ceil(1.0 / scaleFactor);
                    scaleFactor = 1.0 / scaleDivider;
                    adjw = (int) Math.round(iw / scaleDivider);
                    adjh = (int) Math.round(ih / scaleDivider);
                    scaleMeasure = 1.0 - 1.0 / scaleDivider;
                }
                double similarity = ((double) width - (double) adjw) / width
                        + ((double) height - (double) adjh) / height + // Large
                        // padding
                        // is
                        // bad
                        scaleMeasure; // Large rescale is bad
                if (similarity < bestSimilarity) {
                    bestSimilarity = similarity;
                    bestImage = im;
                    bestWidth = adjw;
                    bestHeight = adjh;
                }
                if (similarity == 0)
                    break;
            }
        }
        if (bestImage == null) {
            // No images were found, possibly all are broken
            return null;
        }
        BufferedImage bimage = getBlankImage(scale, width, height);
        Graphics2D g = bimage.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        int x = (width - bestWidth) / 2;
        int y = (height - bestHeight) / 2;
        g.drawImage(bestImage, x, y, bestWidth, bestHeight, null);
        g.dispose();
        return bimage;
    }

    public static boolean canReplaceChildBackgroundColor(Color background) {
        return (background instanceof UIResource) || (background instanceof RadianceColorResource);
    }

    @SuppressWarnings("unchecked")
    public static JTextComponent getTextComponentForTransitions(Component c) {
        if (!(c instanceof JComponent))
            return null;

        JComponent jc = (JComponent) c;
        TextComponentAware<JComponent> tcaui = (TextComponentAware<JComponent>)
                jc.getClientProperty(TEXT_COMPONENT_AWARE);
        if (tcaui != null) {
            return tcaui.getTextComponent(jc);
        }

        if (c instanceof JTextComponent) {
            return (JTextComponent) c;
        }
        return null;
    }

    public static SwingRepaintCallback getTextComponentRepaintCallback(
            JTextComponent textComponent) {
        Component c = textComponent;
        while (c != null) {
            if (c instanceof JComponent) {
                TextComponentAware tcaui = (TextComponentAware) ((JComponent) c)
                        .getClientProperty(TEXT_COMPONENT_AWARE);
                if (tcaui != null) {
                    return new SwingRepaintCallback(c);
                }
            }
            c = c.getParent();
        }
        return new SwingRepaintCallback(textComponent);
    }

    public static boolean isOpaque(JComponent c) {
        return c.isOpaque();
    }

    /**
     * Checks whether Radiance is the current look-and-feel. This method is for internal use only.
     *
     * @return <code>true</code> if Radiance is the current look-and-feel, <code>false</code>
     * otherwise.
     */
    public static boolean isCurrentLookAndFeel() {
        return (RadianceThemingCortex.GlobalScope.getCurrentSkin() != null);
    }

    public static int getButtonBarGravity(Container c) {
        boolean isLeftToRight = c.getComponentOrientation().isLeftToRight();
        RadianceThemingSlices.HorizontalGravity buttonBarGravity = RadianceThemingCortex.GlobalScope
                .getButtonBarGravity();
        switch (buttonBarGravity) {
            case PLATFORM:
                // On macOS the buttons are aligned to the trailing edge of
                // the container (right under LTR and left under RTL)
                return LookUtils.IS_OS_MAC
                        ? (isLeftToRight ? SwingConstants.RIGHT : SwingConstants.LEFT)
                        : SwingConstants.CENTER;
            case LEADING:
                return isLeftToRight ? SwingConstants.LEFT : SwingConstants.RIGHT;
            case CENTERED:
            case SWING_DEFAULT:
                return SwingConstants.CENTER;
            case TRAILING:
                return isLeftToRight ? SwingConstants.RIGHT : SwingConstants.LEFT;
        }
        throw new IllegalStateException("Unknown button alignment " + buttonBarGravity);
    }

    /**
     * Returns the title pane of the specified top-level window.
     *
     * @param window Top-level window.
     * @return If the parameter is either {@link JFrame} or {@link JDialog} and has custom
     * decorations, the result is the title pane, <code>null</code> otherwise.
     */
    public static JComponent getTitlePaneComponent(Window window) {
        JRootPane rootPane = SwingUtilities.getRootPane(window);
        if (rootPane != null) {
            RadianceRootPaneUI ui = (RadianceRootPaneUI) rootPane.getUI();
            return ui.getTitlePane();
        }
        return null;
    }

    public static void updateActiveUi() {
        for (Window window : Window.getWindows()) {
            SwingUtilities.updateComponentTreeUI(window);
        }

        for (MenuElement menuElement : MenuSelectionManager.defaultManager().getSelectedPath()) {
            if (menuElement instanceof JPopupMenu) {
                SwingUtilities.updateComponentTreeUI((JPopupMenu) menuElement);
            }
        }
    }

    public static Point getOffsetInRootPaneCoords(Component comp) {
        if (comp == null) {
            throw new IllegalArgumentException("Cannot pass null component");
        }
        JRootPane rootPane = SwingUtilities.getRootPane(comp);
        int dx = 0;
        int dy = 0;

        if (rootPane != null) {
            JLayeredPane layeredPane = rootPane.getLayeredPane();

            if (layeredPane != null) {
                Insets layeredPaneInsets = layeredPane.getInsets();
                if (comp.isShowing() && layeredPane.isShowing()) {
                    dx += (comp.getLocationOnScreen().x - layeredPane.getLocationOnScreen().x
                            + layeredPaneInsets.left);
                    dy += (comp.getLocationOnScreen().y - layeredPane.getLocationOnScreen().y
                            + layeredPaneInsets.top);
                } else {
                    // have to traverse the hierarchy
                    Component c = comp;
                    dx = 0;
                    dy = 0;
                    while (c != rootPane) {
                        dx += c.getX();
                        dy += c.getY();
                        c = c.getParent();
                    }
                    c = layeredPane;
                    if ((c != null) && (c.getParent() != null)) {
                        while (c != rootPane) {
                            dx -= c.getX();
                            dy -= c.getY();
                            c = c.getParent();
                        }
                    }
                    dx += layeredPaneInsets.left;
                    dy += layeredPaneInsets.right;
                }
            }
        }

        return new Point(dx, dy);
    }

    public static Component getTopMostParentWithDecorationAreaType(Component comp,
            RadianceThemingSlices.DecorationAreaType type) {
        if (comp == null) {
            throw new IllegalArgumentException(
                    "Component scope APIs do not accept null components");
        }
        Component c = comp;
        Component topMostWithSameDecorationAreaType = c;
        while (c != null) {
            if (DecorationPainterUtils.getImmediateDecorationType(c) == type) {
                topMostWithSameDecorationAreaType = c;
            }
            c = c.getParent();
        }
        return topMostWithSameDecorationAreaType;
    }

    private static List<AWTEventListener> awtEventListeners = new ArrayList<>();

    public synchronized static void registerAWTEventListener(AWTEventListener awtEventListener) {
        if (awtEventListeners.contains(awtEventListener)) {
            // Already registered
            return;
        }
        awtEventListeners.add(awtEventListener);
    }

    public synchronized static void unregisterAWTEventListener(AWTEventListener awtEventListener) {
        awtEventListeners.remove(awtEventListener);
    }

    public synchronized static List<AWTEventListener> getAwtEventListeners() {
        return awtEventListeners;
    }

    public static Color getBackgroundFill(RadianceSkin skin, RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        Color overlay = skin.getOverlayColor(RadianceThemingSlices.ColorOverlayType.BACKGROUND_FILL,
                decorationAreaType, ComponentState.ENABLED);
        if (overlay != null) {
            return overlay;
        }
        return skin.getBackgroundColorScheme(decorationAreaType).getBackgroundFillColor();
    }

    public static Color getTextBackgroundFill(Component component, ComponentState componentState) {
        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        RadianceThemingSlices.DecorationAreaType decorationAreaType = DecorationPainterUtils.getDecorationType(component);
        Color overlay = skin.getOverlayColor(RadianceThemingSlices.ColorOverlayType.TEXT_BACKGROUND_FILL,
                decorationAreaType, componentState);
        if (overlay != null) {
            return overlay;
        }
        return RadianceColorSchemeUtilities.getColorScheme(component, componentState).getTextBackgroundFillColor();
    }

    public static Color getTextSelectionBackground(Component component, ComponentState componentState) {
        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        RadianceThemingSlices.DecorationAreaType decorationAreaType = DecorationPainterUtils.getDecorationType(component);
        Color overlay = skin.getOverlayColor(RadianceThemingSlices.ColorOverlayType.SELECTION_BACKGROUND_FILL,
                decorationAreaType, componentState);
        if (overlay != null) {
            return overlay;
        }
        return RadianceColorSchemeUtilities.getColorScheme(
                component, RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_TEXT, componentState).getSelectionBackgroundColor();
    }

    public static Color getTextSelectionForeground(Component component, ComponentState componentState) {
        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        RadianceThemingSlices.DecorationAreaType decorationAreaType = DecorationPainterUtils.getDecorationType(component);
        Color overlay = skin.getOverlayColor(RadianceThemingSlices.ColorOverlayType.SELECTION_FOREGROUND,
                decorationAreaType, componentState);
        if (overlay != null) {
            return overlay;
        }
        return RadianceColorSchemeUtilities.getColorScheme(
                component, RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_TEXT, componentState).getSelectionForegroundColor();
    }
}
