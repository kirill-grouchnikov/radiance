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
package org.pushingpixels.radiance.component.internal.ui.ribbon;

import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;
import org.pushingpixels.radiance.component.api.ribbon.JRibbonBand;
import org.pushingpixels.radiance.component.internal.utils.ComponentUtilities;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeListener;

public abstract class BasicRibbonComponentUI extends RibbonComponentUI {
    /**
     * The associated ribbon component.
     */
    protected JRibbonComponent ribbonComponent;

    private JLabel captionLabel;

    private PropertyChangeListener propertyChangeListener;

    private PropertyChangeListener projectionPropertyChangeListener;

    @Override
    public void installUI(JComponent c) {
        this.ribbonComponent = (JRibbonComponent) c;
        installDefaults();
        installComponents();
        installListeners();
        c.setLayout(createLayoutManager());
    }

    @Override
    public void uninstallUI(JComponent c) {
        c.setLayout(null);
        uninstallListeners();
        uninstallDefaults();
        uninstallComponents();
    }

    /**
     * Installs default parameters on the associated ribbon component.
     */
    protected void installDefaults() {
        if (!this.ribbonComponent.isSimpleWrapper()) {
            RadianceIcon icon = this.ribbonComponent.getIcon();
            if (icon != null) {
                icon.setDimension(new Dimension(16, 16));
            }
        }

        this.ribbonComponent.getMainComponent().setOpaque(false);
        this.ribbonComponent.setOpaque(false);
    }

    /**
     * Installs subcomponents on the associated ribbon component.
     */
    protected void installComponents() {
        this.captionLabel = new JLabel(this.ribbonComponent.getCaption());
        this.captionLabel.setEnabled(this.ribbonComponent.isEnabled());
        this.ribbonComponent.add(this.captionLabel);

        JComponent mainComponent = this.ribbonComponent.getMainComponent();
        this.ribbonComponent.add(mainComponent);

        this.propagateEnabled(this.ribbonComponent.isEnabled());
    }

    /**
     * Installs listeners on the associated ribbon component.
     */
    protected void installListeners() {
        this.propertyChangeListener = propertyChangeEvent -> {
            if ("enabled".equals(propertyChangeEvent.getPropertyName())) {
                propagateEnabled((Boolean) propertyChangeEvent.getNewValue());
            }
            if ("caption".equals(propertyChangeEvent.getPropertyName())) {
                captionLabel.setText((String) propertyChangeEvent.getNewValue());
                ribbonComponent.revalidate();
                ribbonComponent.doLayout();
            }
            if ("icon".equals(propertyChangeEvent.getPropertyName())) {
                RadianceIcon newIcon = (RadianceIcon) propertyChangeEvent.getNewValue();
                if (newIcon != null) {
                    newIcon.setDimension(new Dimension(16, 16));
                }

                ribbonComponent.revalidate();
                ribbonComponent.doLayout();
            }
            if ("presentationPriority".equals(propertyChangeEvent.getPropertyName())) {
                ribbonComponent.revalidate();
                ribbonComponent.doLayout();
            }
        };
        this.ribbonComponent.addPropertyChangeListener(this.propertyChangeListener);

        this.projectionPropertyChangeListener = propertyChangeEvent -> {
            if ("enabled".equals(propertyChangeEvent.getPropertyName())) {
                propagateEnabled((Boolean) propertyChangeEvent.getNewValue());
            }
        };
        this.ribbonComponent.getProjection().getContentModel().addPropertyChangeListener(
                this.projectionPropertyChangeListener);
    }

    /**
     * Uninstalls default parameters from the associated ribbon component.
     */
    protected void uninstallDefaults() {
    }

    /**
     * Uninstalls components from the associated ribbon component.
     */
    protected void uninstallComponents() {
        JComponent mainComponent = this.ribbonComponent.getMainComponent();
        this.ribbonComponent.remove(mainComponent);

        this.ribbonComponent.remove(this.captionLabel);
        this.captionLabel = null;
    }

    /**
     * Uninstalls listeners from the associated ribbon component.
     */
    protected void uninstallListeners() {
        this.ribbonComponent.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;

        this.ribbonComponent.getProjection().getContentModel().removePropertyChangeListener(
                this.projectionPropertyChangeListener);
        this.projectionPropertyChangeListener = null;
    }

    private void propagateEnabled(boolean enabled) {
        this.ribbonComponent.getMainComponent().setEnabled(enabled);
        if (!this.ribbonComponent.isSimpleWrapper()) {
            this.captionLabel.setEnabled(enabled);
        }
        this.ribbonComponent.repaint();
    }

    @Override
    public Point getKeyTipAnchorCenterPoint() {
        int smallIconSize = ComponentUtilities.getCommandButtonSmallIconSize(
                this.ribbonComponent.getFont().getSize());
        int tipCenterY = (this.ribbonComponent.getHeight() + smallIconSize) / 2;
        String caption = this.ribbonComponent.getCaption();
        boolean hasCaption = (caption != null) && (caption.length() > 0);
        if (hasCaption) {
            return new Point(this.captionLabel.getX(), tipCenterY);
        } else {
            return new Point(this.ribbonComponent.getMainComponent().getX() +
                    this.ribbonComponent.getMainComponent().getWidth() / 2, tipCenterY);
        }
    }

    protected LayoutManager createLayoutManager() {
        return new ExtComponentLayout();
    }

    protected class ExtComponentLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            Insets ins = ribbonComponent.getInsets();
            JComponent mainComponent = ribbonComponent.getMainComponent();
            Dimension minMain = mainComponent.getMinimumSize();

            int width = ins.left;
            int height = minMain.height;
            if (isIconVisible(ribbonComponent.getPresentationPriority())) {
                RadianceIcon icon = ribbonComponent.getIcon();
                if (icon != null) {
                    width += (icon.getIconWidth() + getLayoutGap());
                    height = Math.max(height, icon.getIconHeight());
                }
            }
            if (isCaptionVisible(ribbonComponent.getPresentationPriority())) {
                Dimension minCaption = captionLabel.getMinimumSize();
                width += (minCaption.width + getLayoutGap());
                height = Math.max(height, minCaption.height);
            }
            width += minMain.width;
            width += ins.right;
            height += (ins.top + ins.bottom);

            return new Dimension(width, height);
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            return getPreferredSize(ribbonComponent.getPresentationPriority());
        }

        @Override
        public void layoutContainer(Container parent) {
            JRibbonComponent ribbonComp = (JRibbonComponent) parent;
            Insets ins = ribbonComp.getInsets();
            int gap = getLayoutGap();
            int availableHeight = ribbonComp.getHeight() - ins.top - ins.bottom;
            int availableWidth = ribbonComp.getWidth() - ins.left - ins.right;

            HorizontalAlignment horizAlignment = ribbonComp.getHorizontalAlignment();
            JComponent mainComp = ribbonComp.getMainComponent();
            Dimension prefMainDim = mainComp.getPreferredSize();
            int prefMainWidth = prefMainDim.width;
            int finalHeight = Math.min(prefMainDim.height, availableHeight);
            boolean ltr = ribbonComp.getComponentOrientation().isLeftToRight();

            if (ribbonComp.isSimpleWrapper()) {
                int finalMainWidth = Math.min(availableWidth, prefMainWidth);
                int offset = availableWidth - prefMainWidth;
                int topMain = ins.top + (availableHeight - finalHeight) / 2;
                int x = ltr ? ins.left : ribbonComp.getWidth() - ins.right;
                switch (horizAlignment) {
                    case LEADING:
                        if (ltr) {
                            mainComp.setBounds(x, topMain, finalMainWidth, finalHeight);
                        } else {
                            mainComp.setBounds(x - finalMainWidth, topMain, finalMainWidth,
                                    finalHeight);
                        }
                        break;
                    case TRAILING:
                        if (ltr) {
                            mainComp.setBounds(x + offset, topMain, finalMainWidth, finalHeight);
                        } else {
                            mainComp.setBounds(x - finalMainWidth - offset, topMain, finalMainWidth,
                                    finalHeight);
                        }
                        break;
                    case CENTER:
                        if (ltr) {
                            mainComp.setBounds(x + offset / 2, topMain, finalMainWidth,
                                    finalHeight);
                        } else {
                            mainComp.setBounds(x - finalMainWidth - offset / 2, topMain,
                                    finalMainWidth,
                                    finalHeight);
                        }
                        break;
                    case FILL:
                        if (ltr) {
                            mainComp.setBounds(x, topMain, availableWidth, finalHeight);
                        } else {
                            mainComp.setBounds(x - availableWidth, topMain, availableWidth,
                                    finalHeight);
                        }
                        break;
                }
                mainComp.doLayout();
            } else {
                int x = ltr ? ins.left : ribbonComp.getWidth() - ins.right;
                if (isIconVisible(ribbonComponent.getPresentationPriority())) {
                    if (ribbonComp.getIcon() != null) {
                        // icon is painted separately
                        int iconW = ribbonComp.getIcon().getIconWidth();
                        x = ltr ? x + iconW + gap : x - iconW - gap;
                    }
                }

                if (isCaptionVisible(ribbonComponent.getPresentationPriority())) {
                    captionLabel.setVisible(true);
                    Dimension prefCaptionDim = captionLabel.getPreferredSize();
                    if (ltr) {
                        captionLabel.setBounds(x,
                                ins.top + (availableHeight - prefCaptionDim.height) / 2,
                                prefCaptionDim.width, prefCaptionDim.height);
                        x += (prefCaptionDim.width + gap);
                    } else {
                        captionLabel.setBounds(x - prefCaptionDim.width,
                                ins.top + (availableHeight - prefCaptionDim.height) / 2,
                                prefCaptionDim.width, prefCaptionDim.height);
                        x -= (prefCaptionDim.width + gap);
                    }
                } else {
                    captionLabel.setVisible(false);
                }

                int topMain = ins.top + (availableHeight - finalHeight) / 2;
                int finalMainWidth = ltr
                        ? Math.min(ribbonComp.getWidth() - ins.right - x, prefMainWidth)
                        : Math.min(x - ins.left, prefMainWidth);
                int offset = ltr ? ribbonComp.getWidth() - ins.right - x - prefMainWidth
                        : x - prefMainWidth - ins.left;

                switch (horizAlignment) {
                    case LEADING:
                        if (ltr) {
                            mainComp.setBounds(x, topMain, finalMainWidth, finalHeight);
                        } else {
                            mainComp.setBounds(x - finalMainWidth, topMain, finalMainWidth,
                                    finalHeight);
                        }
                        break;
                    case TRAILING:
                        if (ltr) {
                            mainComp.setBounds(x + offset, topMain, finalMainWidth, finalHeight);
                        } else {
                            mainComp.setBounds(x - finalMainWidth - offset, topMain, finalMainWidth,
                                    finalHeight);
                        }
                        break;
                    case CENTER:
                        if (ltr) {
                            mainComp.setBounds(x + offset / 2, topMain, finalMainWidth,
                                    finalHeight);
                        } else {
                            mainComp.setBounds(x - finalMainWidth - offset / 2, topMain,
                                    finalMainWidth,
                                    finalHeight);
                        }
                        break;
                    case FILL:
                        if (ltr) {
                            mainComp.setBounds(x, topMain, ribbonComp.getWidth() - ins.right - x,
                                    finalHeight);
                        } else {
                            mainComp.setBounds(ins.left, topMain, x - ins.left, finalHeight);
                        }
                        break;
                }
                mainComp.doLayout();
            }
        }
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D graphics = (Graphics2D) g.create();

        JRibbonComponent ribbonComp = (JRibbonComponent) c;
        if (isIconVisible(this.ribbonComponent.getPresentationPriority())) {
            Insets ins = ribbonComp.getInsets();
            RadianceIcon icon = ribbonComp.getIcon();
            if (icon != null) {
                int availableHeight = ribbonComp.getHeight() - ins.top - ins.bottom;
                int iconY = Math.max(0, ins.top + (availableHeight - icon.getIconHeight()) / 2);
                if (ribbonComp.getComponentOrientation().isLeftToRight()) {
                    paintIcon(graphics, ribbonComp, icon, ins.left, iconY);
                } else {
                    paintIcon(graphics, ribbonComp, icon,
                            ribbonComp.getWidth() - ins.right - icon.getIconWidth(), iconY);
                }
            }
        }

        graphics.dispose();
    }

    protected abstract void paintIcon(Graphics g, JRibbonComponent ribbonComp, Icon icon, int x, int y);

    private int getLayoutGap() {
        return 4;
    }

    private boolean isIconVisible(JRibbonBand.PresentationPriority presentationPriority) {
        if (this.ribbonComponent.isSimpleWrapper()) {
            return false;
        }
        return (presentationPriority == JRibbonBand.PresentationPriority.TOP)
                || (presentationPriority == JRibbonBand.PresentationPriority.MEDIUM);
    }

    private boolean isCaptionVisible(JRibbonBand.PresentationPriority presentationPriority) {
        if (this.ribbonComponent.isSimpleWrapper()) {
            return false;
        }
        return (presentationPriority == JRibbonBand.PresentationPriority.TOP);
    }

    @Override
    public Dimension getPreferredSize(JRibbonBand.PresentationPriority priority) {
        Insets ins = ribbonComponent.getInsets();
        JComponent mainComponent = ribbonComponent.getMainComponent();
        Dimension prefMain = mainComponent.getPreferredSize();

        int width = ins.left;
        int height = prefMain.height;
        if (isIconVisible(priority)) {
            RadianceIcon icon = ribbonComponent.getIcon();
            if (icon != null) {
                width += (icon.getIconWidth() + getLayoutGap());
                height = Math.max(height, icon.getIconHeight());
            }
        }
        if (isCaptionVisible(priority)) {
            Dimension prefCaption = captionLabel.getPreferredSize();
            width += (prefCaption.width + getLayoutGap());
            height = Math.max(height, prefCaption.height);
        }
        width += prefMain.width;
        width += ins.right;
        height += (ins.top + ins.bottom);

        return new Dimension(width, height);
    }
}
