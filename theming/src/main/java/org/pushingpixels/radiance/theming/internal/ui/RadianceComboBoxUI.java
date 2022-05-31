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
package org.pushingpixels.radiance.theming.internal.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.internal.contrib.flatlaf.HiDPIUtils;
import org.pushingpixels.radiance.theming.api.renderer.RadianceDefaultComboBoxRenderer;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.combo.ComboBoxBackgroundDelegate;
import org.pushingpixels.radiance.theming.internal.utils.*;
import org.pushingpixels.radiance.theming.internal.utils.border.RadianceTextComponentBorder;
import org.pushingpixels.radiance.theming.internal.utils.combo.RadianceComboBoxEditor;
import org.pushingpixels.radiance.theming.internal.utils.combo.RadianceComboPopup;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;

/**
 * UI for combo boxes in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 * @author Thomas Bierhance http://www.orbital-computer.de/JComboBox/
 * @author inostock
 */
public class RadianceComboBoxUI extends BasicComboBoxUI implements TransitionAwareUI {
    /**
     * Property change handler.
     */
    private ComboBoxPropertyChangeHandler radianceChangeHandler;

    private StateTransitionTracker stateTransitionTracker;

    /**
     * Surrogate button model for tracking the state transitions.
     */
    private ButtonModel transitionModel;

    /**
     * Listener for transition animations.
     */
    private RolloverTextControlListener radianceRolloverListener;

    /**
     * Painting delegate.
     */
    private ComboBoxBackgroundDelegate delegate;

    private Icon uneditableArrowIcon;

    private Insets layoutInsets;

    @SuppressWarnings("unchecked")
    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        RadianceComboBoxUI ui = new RadianceComboBoxUI((JComboBox<Object>) comp);
        ui.comboBox = (JComboBox<Object>) comp;
        ui.comboBox.putClientProperty(RadianceButtonUI.OPACITY_ORIGINAL, ui.comboBox.isOpaque());
        ui.comboBox.setOpaque(false);
        return ui;
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);

        c.putClientProperty(RadianceCoreUtilities.TEXT_COMPONENT_AWARE,
                (RadianceCoreUtilities.TextComponentAware<JComboBox<?>>) t -> {
                    if (t.isEditable()) {
                        Component editorComp = t.getEditor().getEditorComponent();
                        if (editorComp instanceof JTextComponent) {
                            return (JTextComponent) editorComp;
                        }
                    }
                    return null;
                });
    }

    @Override
    public void uninstallUI(JComponent c) {
        c.putClientProperty(RadianceCoreUtilities.TEXT_COMPONENT_AWARE, null);
        Object originalOpacity = c.getClientProperty(RadianceButtonUI.OPACITY_ORIGINAL);
        if (originalOpacity instanceof Boolean) {
            c.setOpaque((Boolean) originalOpacity);
        }
        c.putClientProperty(RadianceButtonUI.OPACITY_ORIGINAL, null);

        super.uninstallUI(c);
    }

    private RadianceComboBoxUI(JComboBox<Object> combo) {
        this.comboBox = combo;

        this.transitionModel = new DefaultButtonModel();
        this.transitionModel.setArmed(false);
        this.transitionModel.setSelected(false);
        this.transitionModel.setPressed(false);
        this.transitionModel.setRollover(false);
        this.transitionModel.setEnabled(combo.isEnabled());

        this.stateTransitionTracker = new StateTransitionTracker(this.comboBox,
                this.transitionModel);

        this.delegate = new ComboBoxBackgroundDelegate();
    }

    @Override
    protected JButton createArrowButton() {
        RadianceDropDownButton result = new RadianceDropDownButton(this.comboBox);
        result.setFont(this.comboBox.getFont());
        result.setIcon(getCurrentIcon(result));
        return result;
    }

    /**
     * Returns the icon for the specified arrow button.
     *
     * @param button Arrow button.
     * @return Icon for the specified button.
     */
    private Icon getCurrentIcon(JButton button) {
        int popupFlyoutOrientation = RadianceCoreUtilities.getPopupFlyoutOrientation(this.comboBox);
        return RadianceCoreUtilities.getArrowIcon(button, popupFlyoutOrientation);
    }

    @Override
    protected ListCellRenderer<Object> createRenderer() {
        return new RadianceDefaultComboBoxRenderer.RadianceUIResource(this.comboBox);
    }

    @Override
    protected void installListeners() {
        super.installListeners();
        this.radianceChangeHandler = new ComboBoxPropertyChangeHandler();
        this.comboBox.addPropertyChangeListener(this.radianceChangeHandler);

        this.radianceRolloverListener = new RolloverTextControlListener(this.comboBox, this,
                this.transitionModel);
        this.radianceRolloverListener.registerListeners();

        this.stateTransitionTracker.registerModelListeners();
        this.stateTransitionTracker.registerFocusListeners();
    }

    @Override
    protected void uninstallListeners() {
        this.stateTransitionTracker.unregisterModelListeners();
        this.stateTransitionTracker.unregisterFocusListeners();

        this.comboBox.removePropertyChangeListener(this.radianceChangeHandler);
        this.radianceChangeHandler = null;

        this.radianceRolloverListener.unregisterListeners();
        this.radianceRolloverListener = null;

        super.uninstallListeners();
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();

        // this icon must be created after the font has been installed
        // on the combobox
        this.uneditableArrowIcon = RadianceCoreUtilities.getArrowIcon(this.comboBox,
                () -> (TransitionAwareUI) comboBox.getUI(),
                RadianceCoreUtilities.getPopupFlyoutOrientation(this.comboBox));
        this.updateComboBoxBorder();
    }

    @Override
    protected LayoutManager createLayoutManager() {
        return new RadianceComboBoxLayoutManager();
    }

    /**
     * Layout manager for combo box.
     *
     * @author Kirill Grouchnikov
     */
    private class RadianceComboBoxLayoutManager extends BasicComboBoxUI.ComboBoxLayoutManager {
        @Override
        public void layoutContainer(Container parent) {
            JComboBox cb = (JComboBox) parent;

            int width = cb.getWidth();
            int height = cb.getHeight();

            Insets insets = layoutInsets;
            int buttonWidth = comboBox.isEditable()
                    ? RadianceSizeUtils.getScrollBarWidth(RadianceSizeUtils.getComponentFontSize(comboBox))
                    : uneditableArrowIcon.getIconWidth();

            if (arrowButton != null) {
                if (!comboBox.isEditable()) {
                    arrowButton.setBounds(0, 0, 0, 0);
                } else {
                    if (cb.getComponentOrientation().isLeftToRight()) {
                        arrowButton.setBounds(width - buttonWidth - insets.right, 0,
                                buttonWidth + insets.right, height);
                    } else {
                        arrowButton.setBounds(0, 0, buttonWidth + insets.left, height);
                    }
                }
            }
            if (editor != null) {
                Rectangle r = rectangleForCurrentValue();
                editor.setBounds(r);
            }
        }
    }

    @Override
    protected Rectangle rectangleForCurrentValue() {
        int width = this.comboBox.getWidth();
        int height = this.comboBox.getHeight();
        Insets insets = this.layoutInsets;
        int buttonWidth = RadianceSizeUtils.getScrollBarWidth(RadianceSizeUtils.getComponentFontSize(comboBox));
        if (this.comboBox.getComponentOrientation().isLeftToRight()) {
            return new Rectangle(insets.left, insets.top,
                    width - insets.left - insets.right - buttonWidth,
                    height - insets.top - insets.bottom);
        } else {
            int startX = insets.left + buttonWidth;
            return new Rectangle(startX, insets.top, width - startX - insets.right,
                    height - insets.top - insets.bottom);
        }
    }

    @Override
    protected Dimension getDefaultSize() {
        Component rend = new RadianceDefaultComboBoxRenderer(this.comboBox)
                .getListCellRendererComponent(listBox, " ", -1, false, false);
        rend.setFont(this.comboBox.getFont());

        return rend.getPreferredSize();
    }

    @Override
    public Dimension getMinimumSize(JComponent c) {
        RadianceDropDownButton button = (RadianceDropDownButton) this.arrowButton;
        Insets buttonInsets = button.getInsets();
        Insets insets = this.comboBox.getInsets();

        Dimension size = this.getDisplaySize();

        size.width += insets.left + insets.right;
        size.width += buttonInsets.left + buttonInsets.right;
        size.width += button.getMinimumSize().getWidth();
        size.height += insets.top + insets.bottom;

        this.cachedMinimumSize.setSize(size.width, size.height);
        this.isMinimumSizeDirty = false;

        return new Dimension(this.cachedMinimumSize);
    }

    /**
     * This property change handler changes combo box arrow icon based on the
     * enabled status of the combo box.
     *
     * @author Kirill Grouchnikov
     */
    public class ComboBoxPropertyChangeHandler extends PropertyChangeHandler {
        @Override
        public void propertyChange(final PropertyChangeEvent e) {
            String propertyName = e.getPropertyName();

            if (propertyName.equals("componentOrientation")) {
                SwingUtilities.invokeLater(() -> {
                    if (RadianceComboBoxUI.this.comboBox == null)
                        return;
                    final ComponentOrientation newOrientation = (ComponentOrientation) e
                            .getNewValue();
                    final ListCellRenderer cellRenderer = RadianceComboBoxUI.this.comboBox
                            .getRenderer();
                    final ComboBoxEditor editor = RadianceComboBoxUI.this.comboBox.getEditor();
                    if (RadianceComboBoxUI.this.popup instanceof Component) {
                        final Component cPopup = (Component) RadianceComboBoxUI.this.popup;
                        cPopup.applyComponentOrientation(newOrientation);
                        cPopup.doLayout();
                    }
                    if (cellRenderer instanceof Component) {
                        ((Component) cellRenderer).applyComponentOrientation(newOrientation);
                    }
                    if ((editor != null) && (editor.getEditorComponent() != null)) {
                        (editor.getEditorComponent()).applyComponentOrientation(newOrientation);
                    }
                    if (RadianceComboBoxUI.this.comboBox != null)
                        RadianceComboBoxUI.this.comboBox.repaint();
                });
            }

            if (RadianceSynapse.COMBO_BOX_POPUP_FLYOUT_ORIENTATION.equals(propertyName)) {
                RadianceDropDownButton dropDownButton = (RadianceDropDownButton) arrowButton;
                dropDownButton.setIcon(getCurrentIcon(dropDownButton));
                uneditableArrowIcon = RadianceCoreUtilities.getArrowIcon(comboBox,
                        () -> (TransitionAwareUI) comboBox.getUI(),
                        RadianceCoreUtilities.getPopupFlyoutOrientation(comboBox));
            }

            if ("font".equals(propertyName)) {
                SwingUtilities.invokeLater(() -> {
                    if (comboBox != null) {
                        comboBox.updateUI();
                    }
                });
            }

            if ("background".equals(propertyName)) {
                if (comboBox.isEditable()) {
                    comboBox.getEditor().getEditorComponent()
                            .setBackground(comboBox.getBackground());
                    popup.getList().setBackground(comboBox.getBackground());
                }
            }

            if ("editable".equals(propertyName)) {
                updateComboBoxBorder();
                isMinimumSizeDirty = true;
            }

            if ("enabled".equals(propertyName)) {
                RadianceComboBoxUI.this.transitionModel.setEnabled(comboBox.isEnabled());
            }
            // Do not call super - fix for bug 63
        }
    }

    @Override
    protected ComboPopup createPopup() {
        final RadianceComboPopup sPopup = new RadianceComboPopup(this.comboBox);
        final ComponentOrientation currOrientation = this.comboBox.getComponentOrientation();

        SwingUtilities.invokeLater(() -> {
            if (RadianceComboBoxUI.this.comboBox == null) {
                return;
            }

            sPopup.applyComponentOrientation(currOrientation);
            sPopup.doLayout();
            ListCellRenderer cellRenderer = RadianceComboBoxUI.this.comboBox.getRenderer();
            if (cellRenderer instanceof Component) {
                ((Component) cellRenderer).applyComponentOrientation(currOrientation);
            }
            ComboBoxEditor editor = RadianceComboBoxUI.this.comboBox.getEditor();
            if ((editor != null) && (editor.getEditorComponent() != null)) {
                (editor.getEditorComponent()).applyComponentOrientation(currOrientation);
            }
            RadianceComboBoxUI.this.comboBox.repaint();
        });
        return sPopup;
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D graphics = (Graphics2D) g.create();
        int width = this.comboBox.getWidth();
        int height = this.comboBox.getHeight();
        Insets insets = this.comboBox.getInsets();

        int componentFontSize = RadianceSizeUtils.getComponentFontSize(this.comboBox);
        if (this.comboBox.isEditable()) {
            RadianceTextUtilities.paintTextCompBackground(g, c);
        } else {
            this.delegate.updateBackground(graphics, this.comboBox);

            Icon icon = this.uneditableArrowIcon;
            int iw = icon.getIconWidth();
            int ih = icon.getIconHeight();
            int origButtonWidth = RadianceSizeUtils.getScrollBarWidth(componentFontSize);
            Graphics2D forIcon = (Graphics2D) graphics.create();
            forIcon.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            int iconY = 1 + insets.top + (height - insets.top - insets.bottom - ih) / 2;
            if (this.comboBox.getComponentOrientation().isLeftToRight()) {
                int iconX = width - origButtonWidth - insets.right / 2 + (origButtonWidth - iw) / 2;
                forIcon.translate(iconX, iconY);
                icon.paintIcon(this.comboBox, forIcon, 0, 0);
            } else {
                int iconX = insets.left / 2 + (origButtonWidth - iw) / 2;
                forIcon.translate(iconX, iconY);
                icon.paintIcon(this.comboBox, forIcon, 0, 0);
            }
            forIcon.dispose();
        }

        hasFocus = comboBox.hasFocus();
        if (!comboBox.isEditable()) {
            Rectangle r = rectangleForCurrentValue();

            ListCellRenderer<Object> renderer = this.comboBox.getRenderer();
            Component rendererComponent;
            if (hasFocus) {
                rendererComponent = renderer.getListCellRendererComponent(this.listBox,
                        this.comboBox.getSelectedItem(), -1, true, hasFocus);
            } else {
                rendererComponent = renderer.getListCellRendererComponent(this.listBox,
                        this.comboBox.getSelectedItem(), -1, false, hasFocus);
            }
            rendererComponent.setFont(this.comboBox.getFont());

            // Fix for 4238829: should lay out the JPanel.
            boolean shouldValidate = false;
            if (rendererComponent instanceof JPanel) {
                shouldValidate = true;
            }

            if (this.comboBox.getComponentOrientation().isLeftToRight()) {
                this.currentValuePane.paintComponent(graphics, rendererComponent, this.comboBox,
                        r.x, r.y, r.width, r.height, shouldValidate);
            } else {
                this.currentValuePane.paintComponent(graphics, rendererComponent, this.comboBox,
                        r.x, r.y, r.width, r.height, shouldValidate);
            }
        }

        if (!this.comboBox.isEditable()) {
            Rectangle r = new Rectangle(insets.left, layoutInsets.top,
                    width - insets.left - insets.right,
                    height - layoutInsets.top - layoutInsets.bottom);
            this.paintFocus(graphics, r);
        }

        graphics.dispose();
    }

    /**
     * Paints the focus indication.
     *
     * @param g      Graphics.
     * @param bounds Bounds for text.
     */
    private void paintFocus(Graphics g, Rectangle bounds) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        HiDPIUtils.paintAtScale1x(g2d, 0, 0, bounds.width, bounds.height,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    graphics1X.translate(bounds.x, bounds.y);
                    int comboFontSize = RadianceSizeUtils.getComponentFontSize(this.comboBox);
                    float radius = (float) scaleFactor *
                            RadianceSizeUtils.getClassicButtonCornerRadius(comboFontSize);
                    Shape contour = RadianceOutlineUtilities.getBaseOutline(
                            scaledWidth - 1, scaledHeight - 1, radius, null, 0);
                    RadianceCoreUtilities.paintFocus(graphics1X, this.comboBox, this.comboBox,
                            this, scaleFactor, contour, bounds, 1.0f,
                            (float) scaleFactor * RadianceSizeUtils.getFocusRingPadding(
                                    this.comboBox, RadianceSizeUtils.getComponentFontSize(this.comboBox)));
                }
        );

        g2d.dispose();
    }

    /**
     * Returns the popup of the associated combobox.
     *
     * @return The popup of the associated combobox.
     */
    public ComboPopup getPopup() {
        return this.popup;
    }

    @Override
    public void configureArrowButton() {
        super.configureArrowButton();
        // Mustang decided to make the arrow button focusable on
        // focusable comboboxes
        this.arrowButton.setFocusable(false);
    }

    @Override
    protected void configureEditor() {
        super.configureEditor();
        // This for Mustang - setting Radiance once again adds a border on
        // the text field in the combo editor.
        if (this.editor instanceof JComponent) {
            Insets ins = RadianceSizeUtils.getComboTextBorderInsets(
                    RadianceSizeUtils.getComponentFontSize(this.editor));
            ((JComponent) this.editor).setBorder(new EmptyBorder(ins.top, ins.left, ins.bottom, ins.right));
            this.editor.setBackground(this.comboBox.getBackground());
        }
    }

    @Override
    protected ComboBoxEditor createEditor() {
        return new RadianceComboBoxEditor.UIResource();
    }

    private void updateComboBoxBorder() {
        Border b = this.comboBox.getBorder();
        if (b == null || b instanceof UIResource) {
            int comboFontSize = RadianceSizeUtils.getComponentFontSize(this.comboBox);
            Insets comboBorderInsets = RadianceSizeUtils.getComboBorderInsets(comboFontSize);
            if (this.comboBox.isEditable()) {
                RadianceTextComponentBorder border = new RadianceTextComponentBorder(
                        comboBorderInsets);
                this.comboBox.setBorder(border);
            } else {
                this.comboBox
                        .setBorder(new BorderUIResource.EmptyBorderUIResource(comboBorderInsets));
                // BasicComboBoxUI does not invalidate display size when
                // combo becomes uneditable. However, this is not good
                // in Radiance which has different preferred size for
                // editable and uneditable combos. Calling the method below
                // will trigger the path in BasicComboBoxUI.Handler that
                // will invalidate the cached sizes.
                this.comboBox.setPrototypeDisplayValue(this.comboBox.getPrototypeDisplayValue());
            }
            this.layoutInsets = RadianceSizeUtils.getComboLayoutInsets(comboFontSize);
        } else {
            this.layoutInsets = new Insets(0, 0, 0, 0);
        }
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.stateTransitionTracker;
    }

    @Override
    public boolean isInside(MouseEvent me) {
        if (!RadianceCoreUtilities.isCurrentLookAndFeel()) {
            return false;
        }
        Shape contour = RadianceOutlineUtilities.getBaseOutline(this.comboBox,
                RadianceSizeUtils.getClassicButtonCornerRadius(
                        RadianceSizeUtils.getComponentFontSize(this.comboBox)),
                null);
        return contour.contains(me.getPoint());
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        this.paint(g2d, c);
        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        return super.getPreferredSize(c);
    }
}
