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
package org.pushingpixels.substance.internal.ui;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;

import javax.swing.ButtonModel;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.text.JTextComponent;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultComboBoxRenderer;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.utils.RolloverTextControlListener;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities.TextComponentAware;
import org.pushingpixels.substance.internal.utils.SubstanceDropDownButton;
import org.pushingpixels.substance.internal.utils.SubstanceOutlineUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.SubstanceTextUtilities;
import org.pushingpixels.substance.internal.utils.border.SubstanceTextComponentBorder;
import org.pushingpixels.substance.internal.utils.combo.ComboBoxBackgroundDelegate;
import org.pushingpixels.substance.internal.utils.combo.SubstanceComboBoxEditor;
import org.pushingpixels.substance.internal.utils.combo.SubstanceComboPopup;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;

/**
 * UI for combo boxes in <b>Substance </b> look and feel.
 * 
 * @author Kirill Grouchnikov
 * @author Thomas Bierhance http://www.orbital-computer.de/JComboBox/
 * @author inostock
 */
public class SubstanceComboBoxUI extends BasicComboBoxUI implements TransitionAwareUI {
    /**
     * Property change handler on <code>enabled</code> property,
     * <code>componentOrientation</code> property and on
     * {@link SubstanceLookAndFeel#COMBO_BOX_POPUP_FLYOUT_ORIENTATION} property.
     */
    protected ComboBoxPropertyChangeHandler substanceChangeHandler;

    protected StateTransitionTracker stateTransitionTracker;

    /**
     * Surrogate button model for tracking the state transitions.
     */
    private ButtonModel transitionModel;

    /**
     * Listener for transition animations.
     */
    private RolloverTextControlListener substanceRolloverListener;

    /**
     * Painting delegate.
     */
    private ComboBoxBackgroundDelegate delegate;

    private Icon uneditableArrowIcon;

    private Insets layoutInsets;

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#createUI(javax.swing.JComponent)
     */
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        SubstanceComboBoxUI ui = new SubstanceComboBoxUI((JComboBox) comp);
        ui.comboBox = (JComboBox) comp;
        ui.comboBox.setOpaque(false);
        return ui;
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);

        c.putClientProperty(SubstanceCoreUtilities.TEXT_COMPONENT_AWARE,
                new TextComponentAware<JComboBox>() {
                    @Override
                    public JTextComponent getTextComponent(JComboBox t) {
                        if (t.isEditable()) {
                            Component editorComp = t.getEditor().getEditorComponent();
                            if (editorComp instanceof JTextComponent) {
                                return (JTextComponent) editorComp;
                            }
                        }
                        return null;
                    }
                });
    }

    @Override
    public void uninstallUI(JComponent c) {
        c.putClientProperty(SubstanceCoreUtilities.TEXT_COMPONENT_AWARE, null);

        super.uninstallUI(c);
    }

    public SubstanceComboBoxUI(JComboBox combo) {
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

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#createArrowButton()
     */
    @Override
    protected JButton createArrowButton() {
        SubstanceDropDownButton result = new SubstanceDropDownButton(this.comboBox);
        result.setFont(this.comboBox.getFont());
        result.setIcon(getCurrentIcon(result));
        return result;
    }

    /**
     * Returns the icon for the specified arrow button.
     * 
     * @param button
     *            Arrow button.
     * @return Icon for the specified button.
     */
    private Icon getCurrentIcon(JButton button) {
        int popupFlyoutOrientation = SubstanceCoreUtilities
                .getPopupFlyoutOrientation(this.comboBox);
        Icon icon = SubstanceCoreUtilities.getArrowIcon(button, popupFlyoutOrientation);
        return icon;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#createRenderer()
     */
    @Override
    protected ListCellRenderer createRenderer() {
        return new SubstanceDefaultComboBoxRenderer.SubstanceUIResource(this.comboBox);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#installListeners()
     */
    @Override
    protected void installListeners() {
        super.installListeners();
        this.substanceChangeHandler = new ComboBoxPropertyChangeHandler();
        this.comboBox.addPropertyChangeListener(this.substanceChangeHandler);

        this.substanceRolloverListener = new RolloverTextControlListener(this.comboBox, this,
                this.transitionModel);
        this.substanceRolloverListener.registerListeners();

        this.stateTransitionTracker.registerModelListeners();
        this.stateTransitionTracker.registerFocusListeners();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#uninstallListeners()
     */
    @Override
    protected void uninstallListeners() {
        this.stateTransitionTracker.unregisterModelListeners();
        this.stateTransitionTracker.unregisterFocusListeners();

        this.comboBox.removePropertyChangeListener(this.substanceChangeHandler);
        this.substanceChangeHandler = null;

        this.substanceRolloverListener.unregisterListeners();
        this.substanceRolloverListener = null;

        super.uninstallListeners();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#installDefaults()
     */
    @Override
    protected void installDefaults() {
        super.installDefaults();

        // this icon must be created after the font has been installed
        // on the combobox
        this.uneditableArrowIcon = SubstanceCoreUtilities.getArrowIcon(this.comboBox,
                () -> (TransitionAwareUI) comboBox.getUI(),
                SubstanceCoreUtilities.getPopupFlyoutOrientation(this.comboBox));
        this.updateComboBoxBorder();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#createLayoutManager()
     */
    @Override
    protected LayoutManager createLayoutManager() {
        return new SubstanceComboBoxLayoutManager();
    }

    /**
     * Layout manager for combo box.
     * 
     * @author Kirill Grouchnikov
     */
    private class SubstanceComboBoxLayoutManager extends BasicComboBoxUI.ComboBoxLayoutManager {
        /*
         * (non-Javadoc)
         * 
         * @see java.awt.LayoutManager#layoutContainer(java.awt.Container)
         */
        @Override
        public void layoutContainer(Container parent) {
            JComboBox cb = (JComboBox) parent;

            int width = cb.getWidth();
            int height = cb.getHeight();

            Insets insets = layoutInsets;
            int buttonWidth = (comboBox.isEditable())
                    ? SubstanceSizeUtils
                            .getScrollBarWidth(SubstanceSizeUtils.getComponentFontSize(comboBox))
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
        int buttonWidth = SubstanceSizeUtils
                .getScrollBarWidth(SubstanceSizeUtils.getComponentFontSize(comboBox));
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

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#getDefaultSize()
     */
    @Override
    protected Dimension getDefaultSize() {
        Component rend = new SubstanceDefaultComboBoxRenderer(this.comboBox)
                .getListCellRendererComponent(listBox, " ", -1, false, false);
        rend.setFont(this.comboBox.getFont());

        return rend.getPreferredSize();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#getMinimumSize(javax.swing.
     * JComponent )
     */
    @Override
    public Dimension getMinimumSize(JComponent c) {
        if (!this.isMinimumSizeDirty) {
            return new Dimension(this.cachedMinimumSize);
        }

        // Dimension size = null;
        //
        // if (!this.comboBox.isEditable() && this.arrowButton != null
        // && this.arrowButton instanceof SubstanceComboBoxButton) {
        //
        SubstanceDropDownButton button = (SubstanceDropDownButton) this.arrowButton;
        Insets buttonInsets = button.getInsets();
        Insets insets = this.comboBox.getInsets();

        Dimension size = this.getDisplaySize();

        size.width += insets.left + insets.right;
        size.width += buttonInsets.left + buttonInsets.right;
        size.width += button.getMinimumSize().getWidth();
        size.height += insets.top + insets.bottom;
        // } else if (this.comboBox.isEditable() && this.arrowButton != null
        // && this.editor != null) {
        // size = super.getMinimumSize(c);
        // } else {
        // size = super.getMinimumSize(c);
        // }

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
        /*
         * (non-Javadoc)
         * 
         * @seejavax.swing.plaf.basic.BasicComboBoxUI$PropertyChangeHandler#
         * propertyChange(java.beans.PropertyChangeEvent)
         */
        @Override
        public void propertyChange(final PropertyChangeEvent e) {
            String propertyName = e.getPropertyName();

            if (propertyName.equals("componentOrientation")) {
                SwingUtilities.invokeLater(() -> {
                    if (SubstanceComboBoxUI.this.comboBox == null)
                        return;
                    final ComponentOrientation newOrientation = (ComponentOrientation) e
                            .getNewValue();
                    final ListCellRenderer cellRenderer = SubstanceComboBoxUI.this.comboBox
                            .getRenderer();
                    final ComboBoxEditor editor = SubstanceComboBoxUI.this.comboBox.getEditor();
                    if (SubstanceComboBoxUI.this.popup instanceof Component) {
                        final Component cPopup = (Component) SubstanceComboBoxUI.this.popup;
                        cPopup.applyComponentOrientation(newOrientation);
                        cPopup.doLayout();
                    }
                    if (cellRenderer instanceof Component) {
                        ((Component) cellRenderer).applyComponentOrientation(newOrientation);
                    }
                    if ((editor != null) && (editor.getEditorComponent() != null)) {
                        (editor.getEditorComponent()).applyComponentOrientation(newOrientation);
                    }
                    if (SubstanceComboBoxUI.this.comboBox != null)
                        SubstanceComboBoxUI.this.comboBox.repaint();
                });
            }

            if (SubstanceSynapse.COMBO_BOX_POPUP_FLYOUT_ORIENTATION.equals(propertyName)) {
                SubstanceDropDownButton dropDownButton = (SubstanceDropDownButton) arrowButton;
                dropDownButton.setIcon(getCurrentIcon(dropDownButton));
                uneditableArrowIcon = SubstanceCoreUtilities.getArrowIcon(comboBox,
                        () -> (TransitionAwareUI) comboBox.getUI(),
                        SubstanceCoreUtilities.getPopupFlyoutOrientation(comboBox));
            }

            if ("font".equals(propertyName)) {
                SwingUtilities.invokeLater(() -> {
                    if (comboBox != null)
                        comboBox.updateUI();
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
                SubstanceComboBoxUI.this.transitionModel.setEnabled(comboBox.isEnabled());
            }
            // Do not call super - fix for bug 63
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#createPopup()
     */
    @Override
    protected ComboPopup createPopup() {
        final ComboPopup sPopup = new SubstanceComboPopup(this.comboBox);

        final ComponentOrientation currOrientation = this.comboBox.getComponentOrientation();

        SwingUtilities.invokeLater(() -> {
            if (SubstanceComboBoxUI.this.comboBox == null)
                return;

            if (sPopup instanceof Component) {
                final Component cPopup = (Component) sPopup;
                cPopup.applyComponentOrientation(currOrientation);
                cPopup.doLayout();
            }
            ListCellRenderer cellRenderer = SubstanceComboBoxUI.this.comboBox.getRenderer();
            if (cellRenderer instanceof Component) {
                ((Component) cellRenderer).applyComponentOrientation(currOrientation);
            }
            ComboBoxEditor editor = SubstanceComboBoxUI.this.comboBox.getEditor();
            if ((editor != null) && (editor.getEditorComponent() != null)) {
                (editor.getEditorComponent()).applyComponentOrientation(currOrientation);
            }
            SubstanceComboBoxUI.this.comboBox.repaint();
        });
        return sPopup;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#paint(java.awt.Graphics,
     * javax.swing.JComponent)
     */
    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D graphics = (Graphics2D) g.create();
        int width = this.comboBox.getWidth();
        int height = this.comboBox.getHeight();
        Insets insets = this.comboBox.getInsets();

        int componentFontSize = SubstanceSizeUtils.getComponentFontSize(this.comboBox);
        if (this.comboBox.isEditable()) {
            SubstanceTextUtilities.paintTextCompBackground(g, c);
        } else {
            this.delegate.updateBackground(graphics, this.comboBox, this.transitionModel);

            Icon icon = this.uneditableArrowIcon;
            int iw = icon.getIconWidth();
            int ih = icon.getIconHeight();
            int origButtonWidth = SubstanceSizeUtils.getScrollBarWidth(componentFontSize);
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

            ListCellRenderer renderer = this.comboBox.getRenderer();
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

            // SubstanceCoreUtilities.workaroundBug6576507(graphics);

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
     * @param g
     *            Graphics.
     * @param bounds
     *            Bounds for text.
     */
    protected void paintFocus(Graphics g, Rectangle bounds) {
        int fontSize = SubstanceSizeUtils.getComponentFontSize(this.comboBox);
        int x = bounds.x;
        int y = bounds.y;
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.translate(x, y);

        SubstanceCoreUtilities.paintFocus(g2d, this.comboBox, this.comboBox, this,
                SubstanceOutlineUtilities.getBaseOutline(bounds.width, bounds.height,
                        SubstanceSizeUtils.getClassicButtonCornerRadius(fontSize), null, 0),
                bounds, 1.0f, 0.0f);

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

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#configureArrowButton()
     */
    @Override
    public void configureArrowButton() {
        super.configureArrowButton();
        // Mustang decided to make the arrow button focusable on
        // focusable comboboxes
        this.arrowButton.setFocusable(false);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#configureEditor()
     */
    @Override
    protected void configureEditor() {
        super.configureEditor();
        // This for Mustang - setting Substance once again adds a border on
        // the text field in the combo editor.
        if (this.editor instanceof JComponent) {
            Insets ins = SubstanceSizeUtils
                    .getComboTextBorderInsets(SubstanceSizeUtils.getComponentFontSize(this.editor));
            ((JComponent) this.editor)
                    .setBorder(new EmptyBorder(ins.top, ins.left, ins.bottom, ins.right));
            this.editor.setBackground(this.comboBox.getBackground());
            // ((JComponent) this.editor).setBorder(new LineBorder(Color.red));
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicComboBoxUI#createEditor()
     */
    @Override
    protected ComboBoxEditor createEditor() {
        return new SubstanceComboBoxEditor.UIResource();
    }

    private void updateComboBoxBorder() {
        Border b = this.comboBox.getBorder();
        if (b == null || b instanceof UIResource) {
            int comboFontSize = SubstanceSizeUtils.getComponentFontSize(this.comboBox);
            Insets comboBorderInsets = SubstanceSizeUtils.getComboBorderInsets(comboFontSize);
            if (this.comboBox.isEditable()) {
                SubstanceTextComponentBorder border = new SubstanceTextComponentBorder(
                        comboBorderInsets);
                this.comboBox.setBorder(border);
            } else {
                this.comboBox
                        .setBorder(new BorderUIResource.EmptyBorderUIResource(comboBorderInsets));
                // BasicComboBoxUI does not invalidate display size when
                // combo becomes uneditable. However, this is not good
                // in Substance which has different preferred size for
                // editable and uneditable combos. Calling the method below
                // will trigger the path in BasicComboBoxUI.Handler that
                // will invalidate the cached sizes.
                this.comboBox.setPrototypeDisplayValue(this.comboBox.getPrototypeDisplayValue());
            }
            this.layoutInsets = SubstanceSizeUtils.getComboLayoutInsets(comboFontSize);
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
        if (!SubstanceCoreUtilities.isCurrentLookAndFeel()) {
            return false;
        }
        SubstanceButtonShaper shaper = ClassicButtonShaper.INSTANCE;
        if (shaper == null)
            return false;
        Shape contour = SubstanceOutlineUtilities.getBaseOutline(this.comboBox,
                SubstanceSizeUtils.getClassicButtonCornerRadius(
                        SubstanceSizeUtils.getComponentFontSize(this.comboBox)),
                null);
        return contour.contains(me.getPoint());
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#update(java.awt.Graphics,
     * javax.swing.JComponent)
     */
    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RenderingUtils.installDesktopHints(g2d, c);
        this.paint(g2d, c);
        g2d.dispose();
    }
}
