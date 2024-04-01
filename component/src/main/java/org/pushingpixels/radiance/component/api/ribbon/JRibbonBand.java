/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.api.ribbon;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.CommandAction;
import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.api.common.popup.model.BaseCommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.BaseCommandButtonProjection;
import org.pushingpixels.radiance.component.api.ribbon.model.RibbonGalleryContentModel;
import org.pushingpixels.radiance.component.api.ribbon.projection.RibbonGalleryProjection;
import org.pushingpixels.radiance.component.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.radiance.component.api.ribbon.synapse.model.ComponentContentModel;
import org.pushingpixels.radiance.component.api.ribbon.synapse.projection.ComponentProjection;
import org.pushingpixels.radiance.component.internal.ui.ribbon.*;

import javax.swing.*;
import java.util.Collections;

/**
 * Ribbon band component. Can host three types of content:
 *
 * <ul>
 * <li>Ribbon commands added with
 * {@link #addRibbonCommand(BaseCommandButtonProjection, PresentationPriority)}.</li>
 * <li>Wrapped core / 3rd party components added with
 * {@link #addRibbonComponent(ComponentProjection)}.</li>
 * <li>Ribbon galleries added with
 * {@link #addRibbonGallery(RibbonGalleryProjection, PresentationPriority)} .</li>
 * </ul>
 *
 * <p>
 * Commands are added with associated {@link PresentationPriority}. The higher the priority, the
 * longer the presentation button "stays" in the {@link CommandButtonPresentationState#BIG} or
 * {@link CommandButtonPresentationState#MEDIUM} state - depending on the available resize policies.
 * </p>
 *
 * <p>
 * The content and behavior of galleries added with
 * {@link #addRibbonGallery(RibbonGalleryProjection, PresentationPriority)}
 * can be reconfigured using the following APIs on the model classes:
 * </p>
 *
 * <ul>
 * <li>{@link CommandGroup#addCommand(Command)}</li>
 * <li>{@link CommandGroup#removeCommand(Command)}</li>
 * <li>{@link RibbonGalleryContentModel#setSelectedCommand(Command)}</li>
 * <li>{@link RibbonGalleryContentModel#addExtraPopupCommandGroup(CommandGroup)}</li>
 * <li>{@link RibbonGalleryContentModel#removeExtraPopupCommandGroup(CommandGroup)}</li>
 * </ul>
 *
 * <p>
 * A ribbon band can have multiple visual groups delineated by vertical separator lines. To start a
 * new unnamed group use the {@link #startGroup()} API. To start a new named group use the
 * {@link #startGroup(String)} API. Unnamed groups will have three rows of controls. Named groups
 * will have two rows of controls, with an additional top row showing the group title.
 * </p>
 *
 * @author Kirill Grouchnikov
 */
public class JRibbonBand extends AbstractRibbonBand {
    /**
     * Big size with landscape orientation. Used for buttons in in-ribbon galleries.
     */
    public static final CommandButtonPresentationState BIG_FIXED_LANDSCAPE =
            new CommandButtonPresentationState("Big Fixed Landscape", 32) {
                @Override
                public CommandButtonLayoutManager createLayoutManager() {
                    return new CommandButtonLayoutManagerBigFixedLandscape();
                }
            };

    /**
     * Big size with landscape orientation. Used for buttons in in-ribbon galleries.
     */
    public static final CommandButtonPresentationState BIG_FIXED =
            new CommandButtonPresentationState("Big Fixed", 32) {
                @Override
                public CommandButtonLayoutManager createLayoutManager() {
                    return new CommandButtonLayoutManagerBigFixed();
                }
            };

    /**
     * Presentation priority of ribbon band components.
     *
     * @author Kirill Grouchnikov
     */
    public enum PresentationPriority {
        /**
         * Top priority.
         */
        TOP,

        /**
         * Medium priority.
         */
        MEDIUM,

        /**
         * Low priority.
         */
        LOW
    }

    /**
     * Creates a new ribbon band.
     *
     * @param title       Band title.
     * @param iconFactory Associated icon factory (for collapsed state).
     */
    public JRibbonBand(String title, RadianceIcon.Factory iconFactory) {
        this(title, iconFactory, null);
    }

    /**
     * Creates a new ribbon band.
     *
     * @param title                 Band title.
     * @param iconFactory           Associated icon factory (for collapsed state).
     * @param expandCommandListener Expand command listener (can be <code>null</code>).
     */
    public JRibbonBand(String title, RadianceIcon.Factory iconFactory,
            CommandAction expandCommandListener) {
        super(title, iconFactory, expandCommandListener, new JBandControlPanel());
        this.resizePolicies = Collections
                .unmodifiableList(CoreRibbonResizePolicies.getCorePoliciesPermissive(this));
        updateUI();
    }

    /**
     * Adds the specified command projection to <code>this</code> band.
     *
     * @param projection Command projection to add.
     * @param priority   Priority of the command.
     * @return The command button that represents the command.
     */
    public void addRibbonCommand(BaseCommandButtonProjection<? extends BaseCommand<?>,
            ? extends BaseCommandMenuContentModel,
            ? extends BaseCommandButtonPresentationModel<?, ?>,
            ? extends BaseCommandPopupMenuPresentationModel> projection,
            PresentationPriority priority) {
        ((JBandControlPanel) this.getControlPanel()).addCommandButton(projection, priority);
    }

    public void addRibbonGallery(RibbonGalleryProjection galleryProjection,
            PresentationPriority priority) {
        JRibbonGallery gallery = new JRibbonGallery(galleryProjection);
        ((JBandControlPanel) this.getControlPanel()).addRibbonGallery(gallery, priority);
    }

    public void addRibbonComponent(
            ComponentProjection<? extends JComponent, ? extends ComponentContentModel> projection) {
        JRibbonComponent ribbonComponent = new JRibbonComponent(projection);
        ((JBandControlPanel) this.getControlPanel()).addRibbonComponent(ribbonComponent);
    }

    /**
     * Starts a new unnamed group.
     *
     * @return The index of the new group.
     */
    public int startGroup() {
        return ((JBandControlPanel) this.getControlPanel()).startGroup();
    }

    /**
     * Starts a new named group.
     *
     * @param groupTitle The group title.
     * @return The index of the new group.
     */
    public int startGroup(String groupTitle) {
        return ((JBandControlPanel) this.getControlPanel()).startGroup(groupTitle);
    }

    /**
     * Changes the title of the specified group.
     *
     * @param groupIndex Group index.
     * @param groupTitle The new title for this group.
     */
    public void setGroupTitle(int groupIndex, String groupTitle) {
        ((JBandControlPanel) this.getControlPanel()).setGroupTitle(groupIndex, groupTitle);
    }

    @Override
    public AbstractRibbonBand cloneBand() {
        AbstractRibbonBand result = new JRibbonBand(this.getTitle(), this.getIconFactory(),
                this.getExpandCommandListener());
        result.applyComponentOrientation(this.getComponentOrientation());
        return result;
    }
}
