/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.flamingo.api.ribbon;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.projection.CommandProjection;
import org.pushingpixels.flamingo.api.ribbon.model.*;
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.flamingo.internal.ui.ribbon.*;
import org.pushingpixels.neon.icon.ResizableIcon;

import java.util.*;

/**
 * Ribbon band component. Can host three types of content:
 *
 * <ul>
 * <li>Ribbon commands added with
 * {@link #addRibbonCommand(CommandProjection, PresentationPriority)}.</li>
 * <li>Wrapped core / 3rd party components added with
 * {@link #addRibbonComponent(JRibbonComponent)}.</li>
 * <li>Ribbon galleries added with
 * {@link #addRibbonGallery(RibbonGalleryContentModel, RibbonGalleryPresentationModel, PresentationPriority)} .</li>
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
 * {@link #addRibbonGallery(RibbonGalleryContentModel, RibbonGalleryPresentationModel, PresentationPriority)}
 * can be reconfigured using the following APIs on the model classes:
 * </p>
 *
 * <ul>
 * <li>{@link CommandProjectionGroupModel#addCommandProjection(CommandProjection)}</li>
 * <li>{@link CommandProjectionGroupModel#removeCommandProjection(CommandProjection)}</li>
 * <li>{@link RibbonGalleryContentModel#setSelectedCommand(Command)}</li>
 * <li>{@link RibbonGalleryContentModel#addExtraPopupCommandGroup(CommandProjectionGroupModel)}</li>
 * <li
 * >{@link RibbonGalleryContentModel#removeExtraPopupCommandGroup(CommandProjectionGroupModel)}</li>
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
            new CommandButtonPresentationState(
                    "Big Fixed Landscape", 32) {
                @Override
                public CommandButtonLayoutManager createLayoutManager(AbstractCommandButton button) {
                    return new CommandButtonLayoutManagerBigFixedLandscape();
                }
            };

    /**
     * Big size with landscape orientation. Used for buttons in in-ribbon galleries.
     */
    public static final CommandButtonPresentationState BIG_FIXED =
            new CommandButtonPresentationState(
            "Big Fixed", 32) {
        @Override
        public CommandButtonLayoutManager createLayoutManager(AbstractCommandButton button) {
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
        LOW;
    }

    /**
     * Creates a new ribbon band.
     *
     * @param title Band title.
     * @param icon  Associated icon (for collapsed state).
     */
    public JRibbonBand(String title, ResizableIcon icon) {
        this(title, icon, null);
    }

    /**
     * Creates a new ribbon band.
     *
     * @param title                 Band title.
     * @param icon                  Associated icon (for collapsed state).
     * @param expandCommandListener Expand command listener (can be <code>null</code>).
     */
    public JRibbonBand(String title, ResizableIcon icon, CommandListener expandCommandListener) {
        super(title, icon, expandCommandListener, new JBandControlPanel());
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
    public AbstractCommandButton addRibbonCommand(CommandProjection projection,
            PresentationPriority priority) {
        AbstractCommandButton commandButton = projection.buildComponent();
        ((JBandControlPanel) this.getControlPanel()).addCommandButton(commandButton, priority);
        return commandButton;
    }

    public void addRibbonGallery(RibbonGalleryContentModel galleryContentModel,
            RibbonGalleryPresentationModel galleryPresentationModel,
            PresentationPriority priority) {
        JRibbonGallery gallery = new JRibbonGallery(galleryContentModel,
                galleryPresentationModel);
        ((JBandControlPanel) this.getControlPanel()).addRibbonGallery(gallery, priority);
    }

    /**
     * Adds the specified ribbon component to this ribbon band.
     *
     * @param comp The ribbon component to add.
     */
    public void addRibbonComponent(JRibbonComponent comp) {
        ((JBandControlPanel) this.getControlPanel()).addRibbonComponent(comp);
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

    public List<JRibbonComponent> getRibbonComponents(int groupIndex) {
        return ((JBandControlPanel) this.getControlPanel()).getRibbonComponents(groupIndex);
    }

    @Override
    public AbstractRibbonBand cloneBand() {
        AbstractRibbonBand result = new JRibbonBand(this.getTitle(), this.getIcon(),
                this.getExpandCommandListener());
        result.applyComponentOrientation(this.getComponentOrientation());
        return result;
    }
}
