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
import org.pushingpixels.radiance.component.api.common.RichTooltip;
import org.pushingpixels.radiance.component.api.common.RichTooltipManager;
import org.pushingpixels.radiance.component.api.common.model.RichTooltipPresentationModel;
import org.pushingpixels.radiance.component.api.ribbon.JFlowRibbonBand;
import org.pushingpixels.radiance.component.api.ribbon.JRibbonBand;
import org.pushingpixels.radiance.component.api.ribbon.synapse.model.ComponentContentModel;
import org.pushingpixels.radiance.component.api.ribbon.synapse.projection.ComponentProjection;
import org.pushingpixels.radiance.component.internal.theming.ribbon.ui.RadianceRibbonComponentUI;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.ribbon.JRibbon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Wrapper around core and 3rd party Swing controls to allow placing them in the ribbon.
 * This class is for internal use only and should not be directly used by the applications.
 *
 * @author Kirill Grouchnikov
 * @see JRibbon#addTaskbarComponent(ComponentProjection)
 * @see JRibbonBand#addRibbonComponent(ComponentProjection)
 * @see JFlowRibbonBand#addFlowComponent(ComponentProjection)
 */
public class JRibbonComponent extends JComponent implements RichTooltipManager.WithRichTooltip {
    private ComponentProjection<? extends JComponent, ? extends ComponentContentModel> projection;

    /**
     * Wrapper icon. Can be <code>null</code>.
     */
    private RadianceIcon icon;

    /**
     * Wrapper caption. Can be <code>null</code>.
     */
    private String caption;

    /**
     * The wrapped component. Is guaranteed to be non <code>null</code>.
     */
    private JComponent mainComponent;

    /**
     * The key tip for this wrapper component.
     *
     * @see #setKeyTip(String)
     * @see #getKeyTip()
     */
    private String keyTip;

    /**
     * The horizontal alignment for this wrapper component.
     *
     * @see #getHorizontalAlignment()
     * @see #setHorizontalAlignment(HorizontalAlignment)
     */
    private HorizontalAlignment horizontalAlignment;

    private JRibbonBand.PresentationPriority presentationPriority;

    private boolean isResizingAware;

    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "RibbonComponentUI";

    public JRibbonComponent(
            ComponentProjection<? extends JComponent, ? extends ComponentContentModel> projection) {
        this.projection = projection;

        this.mainComponent = projection.buildComponent();
        this.keyTip = projection.getPresentationModel().getKeyTip();
        this.isResizingAware = projection.getPresentationModel().isResizingAware();
        this.horizontalAlignment =
                projection.getPresentationModel().getHorizontalAlignment();
        if (projection.getContentModel().getIconFactory() != null) {
            RadianceIcon icon = projection.getContentModel().getIconFactory().createNewIcon();
            icon.setDimension(new Dimension(16, 16));
            this.icon = icon;
        }
        this.caption = projection.getContentModel().getCaption();
        this.setEnabled(projection.getContentModel().isEnabled());

        this.presentationPriority = JRibbonBand.PresentationPriority.TOP;

        this.setFocusTraversalPolicyProvider(true);
        java.util.List<Component> comps = new ArrayList<>();
        comps.add(this.mainComponent);
        this.setFocusTraversalPolicy(new SequentialFocusTraversalPolicy(comps));

        this.updateUI();
    }

    @Override
    public void updateUI() {
        setUI(RadianceRibbonComponentUI.createUI(this));
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    /**
     * Returns the UI delegate for this component.
     *
     * @return a <code>RibbonComponentUI</code> object
     * @see #setUI
     */
    public RibbonComponentUI getUI() {
        return (RibbonComponentUI) ui;
    }

    public ComponentProjection<? extends JComponent, ? extends ComponentContentModel> getProjection() {
        return this.projection;
    }

    /**
     * Returns the wrapper icon of this wrapper component. Can return
     * <code>null</code>.
     *
     * @return The wrapper icon of this wrapper component.
     */
    public RadianceIcon getIcon() {
        return this.icon;
    }

    /**
     * Returns the caption of this wrapper component. Can return
     * <code>null</code>.
     *
     * @return The caption of this wrapper component.
     */
    public String getCaption() {
        return this.caption;
    }

    /**
     * Sets new value for the caption of this wrapper component.
     *
     * @param caption The new caption.
     */
    public void setCaption(String caption) {
        String old = this.caption;
        this.caption = caption;
        this.firePropertyChange("caption", old, this.caption);
    }

    public void setIcon(RadianceIcon icon) {
        RadianceIcon old = this.icon;
        this.icon = icon;
        this.firePropertyChange("icon", old, this.icon);
    }

    /**
     * Returns the wrapped component of this wrapper component. The result is
     * guaranteed to be non <code>null</code>.
     *
     * @return The wrapped component of this wrapper component.
     */
    public JComponent getMainComponent() {
        return this.mainComponent;
    }

    /**
     * Returns indication whether this wrapper is simple.
     *
     * @return <code>true</code> if both {@link #getIcon()} and
     * {@link #getCaption()} return <code>null</code>,
     * <code>false</code> otherwise.
     */
    public boolean isSimpleWrapper() {
        return (this.caption == null) || (this.caption.length() == 0);
    }

    /**
     * Returns the key tip for this wrapper component.
     *
     * @return The key tip for this wrapper component.
     * @see #setKeyTip(String)
     */
    public String getKeyTip() {
        return this.keyTip;
    }

    /**
     * Sets the specified string to be the key tip for this wrapper component.
     * Fires a <code>keyTip</code> property change event.
     *
     * @param keyTip The new key tip for this wrapper component.
     */
    public void setKeyTip(String keyTip) {
        String old = this.keyTip;
        this.keyTip = keyTip;
        this.firePropertyChange("keyTip", old, this.keyTip);
    }

    @Override
    public RichTooltip getRichTooltip(MouseEvent mouseEvent) {
        return this.projection.getContentModel().getRichTooltip();
    }

    @Override
    public RichTooltipPresentationModel getRichTooltipPresentationModel(MouseEvent mouseEvent) {
        return this.projection.getPresentationModel().getRichTooltipPresentationModel();
    }

    /**
     * Returns the horizontal alignment for this wrapper component.
     *
     * @return The horizontal alignment for this wrapper component.
     * @see #setHorizontalAlignment(HorizontalAlignment)
     */
    public HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /**
     * Sets the specified parameter to be the horizontal alignment for this
     * wrapper component.
     *
     * @param horizontalAlignment The new horizontal alignment for this wrapper component.
     * @see #getHorizontalAlignment()
     */
    public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
    }

    public JRibbonBand.PresentationPriority getPresentationPriority() {
        return this.presentationPriority;
    }

    public void setPresentationPriority(JRibbonBand.PresentationPriority presentationPriority) {
        JRibbonBand.PresentationPriority old = this.presentationPriority;
        this.presentationPriority = presentationPriority;
        if (old != presentationPriority) {
            this.firePropertyChange("presentationPriority", old, this.presentationPriority);
        }
    }

    public boolean isResizingAware() {
        return this.isResizingAware;
    }

    public void setResizingAware(boolean isResizingAware) {
        this.isResizingAware = isResizingAware;
    }

    @Override
    public void setFont(Font font) {
        super.setFont(font);
    }
}
