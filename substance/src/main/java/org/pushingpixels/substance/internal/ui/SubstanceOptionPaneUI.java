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

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicOptionPaneUI;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.colorscheme.SteelBlueColorScheme;
import org.pushingpixels.substance.api.colorscheme.SunsetColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIconPack;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.animation.IconGlowTracker;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.icon.GlowingIcon;

/**
 * UI for option panes in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceOptionPaneUI extends BasicOptionPaneUI {
    static {
        AnimationConfigurationManager.getInstance().allowAnimations(AnimationFacet.ICON_GLOW,
                OptionPaneLabel.class);
    }

    private static final int ICON_SIZE = 20;

    /**
     * Label extension class. Due to defect 250, the option pane icon animation (glowing icon)
     * should repaint only the icon itself and not the entire option pane. While the
     * {@link AnimationConfigurationManager} API provides an option to enable animations on the
     * specific component, it's better to enable it on the component class (to make the lookups
     * faster). So, when the option pane icon label is created (in addIcon method), we use this
     * class.
     * 
     * @author Kirill Grouchnikov
     */
    protected static class OptionPaneLabel extends JLabel {
    }

    /**
     * Icon label.
     */
    private OptionPaneLabel substanceIconLabel;

    private IconGlowTracker iconGlowTracker;

    /**
     * Creates a new SubstanceOptionPaneUI instance.
     */
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceOptionPaneUI();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#paint(java.awt.Graphics, javax.swing.JComponent)
     */
    @Override
    public void paint(Graphics g, JComponent c) {
        BackgroundPaintingUtils.updateIfOpaque(g, c);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicOptionPaneUI#addIcon(java.awt.Container)
     */
    @Override
    protected void addIcon(Container top) {
        Icon sideIcon = (optionPane == null ? null : optionPane.getIcon());

        int messageType = optionPane.getMessageType();
        if (sideIcon == null && optionPane != null) {
            sideIcon = getIconForType(messageType);
        }

        if (sideIcon != null) {
            this.substanceIconLabel = new OptionPaneLabel();
            this.iconGlowTracker = new IconGlowTracker(substanceIconLabel);
            GlowingIcon glowingIcon = new GlowingIcon(sideIcon, this.iconGlowTracker);
            glowingIcon.setDampeningFactor(10.0f);
            this.substanceIconLabel.setIcon(glowingIcon);
            this.substanceIconLabel.setBorder(new EmptyBorder(0, 8, 0, 8));

            this.substanceIconLabel.setName("OptionPane.iconLabel");
            this.substanceIconLabel.setVerticalAlignment(SwingConstants.TOP);
            top.add(this.substanceIconLabel, BorderLayout.BEFORE_LINE_BEGINS);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicOptionPaneUI#getIconForType(int)
     */
    @Override
    protected Icon getIconForType(int messageType) {
        SubstanceIconPack iconPack = SubstanceCortex.GlobalScope.getIconPack();
        int size = (int) (ICON_SIZE * UIUtil.getScaleFactor());
        switch (messageType) {
        case JOptionPane.ERROR_MESSAGE:
            return iconPack.getOptionPaneErrorIcon(size, new SunsetColorScheme());
        case JOptionPane.INFORMATION_MESSAGE:
            return iconPack.getOptionPaneInformationIcon(size, new SteelBlueColorScheme());
        case JOptionPane.WARNING_MESSAGE:
            return iconPack.getOptionPaneWarningIcon(size, new SunsetColorScheme());
        case JOptionPane.QUESTION_MESSAGE:
            return iconPack.getOptionPaneQuestionIcon(size, new SteelBlueColorScheme());
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicOptionPaneUI#installComponents()
     */
    @Override
    protected void installComponents() {
        super.installComponents();
        // fix for defect 265 - check that the label is not null
        // before activating the loop.
        if (this.substanceIconLabel != null) {
            // Make the icon glow for three cycles. There's no need to
            // explicitly cancel the animation when the option pane is closed
            // before the animation is over - when the three cycles are up,
            // the animation will be removed by the tracker.
            if (!this.iconGlowTracker.isPlaying()) {
                this.iconGlowTracker.play(3);
            }
        }
    }

    protected Container createButtonArea() {
        JPanel bottom = new JPanel();
        bottom.setName("OptionPane.buttonArea");
        bottom.setLayout(new SubstanceFooterLayout(
                SubstanceSizeUtils.getAdjustedSize(SubstanceSizeUtils.getComponentFontSize(bottom),
                        8, 4, 1, true),
                SubstanceCortex.GlobalScope.getButtonBarOrder().isDefaultButtonLeading()));
        addButtonComponents(bottom, getButtons(), getInitialValueIndex());
        return bottom;
    }

    /**
     * This class extends ButtonAreaLayout from the base class because in one of the places there is
     * an explicit cast of the button container to that layout.
     */
    private static class SubstanceFooterLayout extends ButtonAreaLayout {
        private int padding;
        private boolean isDefaultButtonLeading;

        public SubstanceFooterLayout(int padding, boolean isDefaultButtonLeading) {
            super(true, padding);
            this.padding = padding;
            this.isDefaultButtonLeading = isDefaultButtonLeading;
        }

        public void addLayoutComponent(String string, Component comp) {
        }

        private Dimension getMaxButtonSize(Container container) {
            Component[] children = container.getComponents();
            Dimension result = new Dimension(0, 0);
            for (Component child : children) {
                Dimension pref = child.getPreferredSize();
                result.width = Math.max(result.width, pref.width);
                result.height = Math.max(result.height, pref.height);
            }
            return result;
        }

        public void layoutContainer(Container container) {
            Component[] children = container.getComponents();

            if (children != null && children.length > 0) {
                int numChildren = children.length;
                Insets insets = container.getInsets();
                Dimension maxDimension = getMaxButtonSize(container);
                int totalButtonWidth = maxDimension.width * numChildren
                        + padding * (numChildren - 1);

                boolean isLeftToRight = container.getComponentOrientation().isLeftToRight();
                int buttonAlignment = SubstanceCoreUtilities.getButtonBarGravity(container);
                int x;
                switch (buttonAlignment) {
                case SwingConstants.LEFT:
                    x = insets.left;
                    break;
                case SwingConstants.CENTER:
                    x = (container.getWidth() - insets.left - insets.right - totalButtonWidth) / 2;
                    break;
                default:
                    x = container.getWidth() - insets.right - totalButtonWidth;
                }

                // Here we have four cases:
                // 1. Under LTR mode and button #0 leading - button #0 goes leftmost
                // 2. Under LTR mode and button #0 trailing - button #0 goes rightmost
                // 3. Under RTL mode and button #0 leading - button #0 goes rightmost
                // 4. Under RTL mode and button #0 trailing - button #0 goes leftmost
                // So the condition is to iterate over the child buttons in their order
                // and place them from left to right when the LTR'ness is the same
                // as the "default button is leading"'ness
                boolean iterateForward = (isLeftToRight == this.isDefaultButtonLeading);

                for (int counter = 0; counter < numChildren; counter++) {
                    int index = iterateForward ? counter : numChildren - counter - 1;
                    children[index].setBounds(x, insets.top, maxDimension.width,
                            maxDimension.height);
                    x += children[index].getWidth() + padding;
                }
            }
        }

        public Dimension minimumLayoutSize(Container container) {
            if (container == null) {
                return new Dimension(0, 0);
            }

            Component[] children = container.getComponents();
            if ((children == null) || (children.length == 0)) {
                return new Dimension(0, 0);
            }
            int numChildren = children.length;
            Insets insets = container.getInsets();

            Dimension maxDimension = getMaxButtonSize(container);
            return new Dimension(
                    insets.left + insets.right + maxDimension.width * numChildren
                            + padding * (numChildren - 1),
                    insets.top + insets.bottom + maxDimension.height);
        }

        public Dimension preferredLayoutSize(Container c) {
            return minimumLayoutSize(c);
        }

        public void removeLayoutComponent(Component c) {
        }
    }

}
