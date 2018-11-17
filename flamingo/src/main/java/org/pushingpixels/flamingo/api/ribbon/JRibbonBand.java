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
import org.pushingpixels.flamingo.api.common.model.CommandGroupModel;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.api.ribbon.model.*;
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.flamingo.internal.ui.ribbon.*;
import org.pushingpixels.neon.icon.ResizableIcon;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * Ribbon band component. Can host three types of content:
 *
 * <ul>
 * <li>Ribbon commands added with
 * {@link #addRibbonCommand(FlamingoCommand, RibbonElementPriority)}.</li>
 * <li>Wrapped core / 3rd party components added with
 * {@link #addRibbonComponent(JRibbonComponent)}.</li>
 * <li>Ribbon galleries added with
 * {@link #addRibbonGallery(String, RibbonGalleryContentModel, RibbonGalleryPresentationModel, RibbonElementPriority, String)} .</li>
 * </ul>
 *
 * <p>
 * Commands are added with associated {@link RibbonElementPriority}. The higher the priority, the
 * longer the presentation button "stays" in the {@link CommandButtonDisplayState#BIG} or
 * {@link CommandButtonDisplayState#MEDIUM} state - depending on the available resize policies.
 * </p>
 *
 * <p>
 * The content and behavior of galleries added with
 * {@link #addRibbonGallery(String, RibbonGalleryContentModel, RibbonGalleryPresentationModel, RibbonElementPriority, String)},
 * can be reconfigured using the following APIs on the model classes:
 * </p>
 *
 * <ul>
 * <li>{@link CommandGroupModel#addCommand(FlamingoCommand)}</li>
 * <li>{@link CommandGroupModel#removeCommand(FlamingoCommand)}</li>
 * <li>{@link RibbonGalleryContentModel#setSelectedCommand(FlamingoCommand)}</li>
 * <li>{@link RibbonGalleryContentModel#addExtraPopupCommandGroup(CommandGroupModel)}</li>
 * <li>{@link RibbonGalleryContentModel#removeExtraPopupCommandGroup(CommandGroupModel)}</li>
 * </ul>
 *
 * <p>
 * A ribbon band can have multiple visual groups separated with vertical separator lines. To start a
 * new unnamed group use the {@link #startGroup()} API. To start a new named group use the
 * {@link #startGroup(String)} API. Unnamed groups will have three rows of controls. Named groups
 * will have two rows of controls, with the top row showing the group title.
 * </p>
 *
 * @author Kirill Grouchnikov
 */
public class JRibbonBand extends AbstractRibbonBand {
    /**
     * This callback allows application code to place additional menu entries in the popup menu
     * shown when the ribbon gallery expand button is clicked. Application code should use
     * {@link JCommandPopupMenu#addMenuButton(JCommandMenuButton)} and
     * {@link JCommandPopupMenu#addMenuSeparator()} APIs on the passed menu parameter.
     *
     * @author Kirill Grouchnikov
     * @deprecated Use {@link RibbonGalleryContentModel#addExtraPopupCommandGroup(CommandGroupModel)}
     */
    @Deprecated
    public interface RibbonGalleryPopupCallback {
        /**
         * Called just before the popup menu is about to be shown.
         *
         * @param menu The popup menu that will be shown.
         */
        void popupToBeShown(JCommandPopupMenu menu);
    }

    /**
     * Big size with landscape orientation. Used for buttons in in-ribbon galleries.
     */
    public static final CommandButtonDisplayState BIG_FIXED_LANDSCAPE =
            new CommandButtonDisplayState(
                    "Big Fixed Landscape", 32) {
                @Override
                public CommandButtonLayoutManager createLayoutManager(AbstractCommandButton button) {
                    return new CommandButtonLayoutManagerBigFixedLandscape();
                }
            };

    /**
     * Big size with landscape orientation. Used for buttons in in-ribbon galleries.
     */
    public static final CommandButtonDisplayState BIG_FIXED = new CommandButtonDisplayState(
            "Big Fixed", 32) {
        @Override
        public CommandButtonLayoutManager createLayoutManager(AbstractCommandButton button) {
            return new CommandButtonLayoutManagerBigFixed();
        }
    };

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
     * @param title                Band title.
     * @param icon                 Associated icon (for collapsed state).
     * @param expandActionListener Expand action listener (can be <code>null</code>).
     */
    public JRibbonBand(String title, ResizableIcon icon, ActionListener expandActionListener) {
        super(title, icon, expandActionListener, new JBandControlPanel());
        this.resizePolicies = Collections
                .unmodifiableList(CoreRibbonResizePolicies.getCorePoliciesPermissive(this));
        updateUI();
    }

    /**
     * Adds the specified command to <code>this</code> band.
     *
     * @param ribbonCommand Command to add.
     * @param priority      Priority of the command.
     * @return The command button that represents the command.
     */
    public AbstractCommandButton addRibbonCommand(FlamingoCommand ribbonCommand,
            RibbonElementPriority priority) {
        AbstractCommandButton commandButton = ribbonCommand.buildButton();
        commandButton.setHorizontalAlignment(SwingConstants.LEADING);
        ((JBandControlPanel) this.getControlPanel()).addCommandButton(commandButton, priority);
        return commandButton;
    }

    /**
     * Adds a new ribbon gallery to <code>this</code> band.
     *
     * @param galleryName                         Gallery name.
     * @param commands                            Command groups.
     * @param preferredVisibleCommandCounts       Preferred count of visible commands of the
     *                                            ribbon gallery under different states.
     * @param preferredPopupMaxCommandColumns     Preferred maximum columns in the popup gallery
     *                                            associated with the ribbon gallery.
     * @param preferredPopupMaxVisibleCommandRows Preferred maximum visible rows in the popup
     *                                            gallery associated with the ribbon
     *                                            gallery.
     * @param priority                            The initial ribbon gallery priority.
     * @see CommandGroupModel#addCommand(FlamingoCommand)
     * @see CommandGroupModel#removeCommand(FlamingoCommand)
     * @see RibbonGalleryContentModel#setSelectedCommand(FlamingoCommand)
     * @deprecated Use {@link #addRibbonGallery(String, RibbonGalleryContentModel, RibbonGalleryPresentationModel, RibbonElementPriority, String)}
     */
    @Deprecated
    public void addRibbonGallery(String galleryName,
            List<StringValuePair<List<FlamingoCommand>>> commands,
            Map<RibbonElementPriority, Integer> preferredVisibleCommandCounts,
            int preferredPopupMaxCommandColumns, int preferredPopupMaxVisibleCommandRows,
            RibbonElementPriority priority) {
        List<CommandGroupModel> commandGroups = new ArrayList<>();
        for (StringValuePair<List<FlamingoCommand>> commandPair : commands) {
            commandGroups.add(new CommandGroupModel(commandPair.getKey(), commandPair.getValue()));
        }
        RibbonGalleryContentModel contentModel = new RibbonGalleryContentModel(null, commandGroups);
        RibbonGalleryPresentationModel presentationModel =
                RibbonGalleryPresentationModel.builder()
                        .setPreferredVisibleCommandCounts(preferredVisibleCommandCounts)
                        .setPreferredPopupMaxVisibleCommandRows(preferredPopupMaxVisibleCommandRows)
                        .setPreferredPopupMaxCommandColumns(preferredPopupMaxCommandColumns)
                        .setCommandDisplayState(JRibbonBand.BIG_FIXED_LANDSCAPE).build();
        this.addRibbonGallery(galleryName, contentModel, presentationModel, priority, null);
    }

    /**
     * Adds a new ribbon gallery to <code>this</code> band.
     *
     * @param galleryName                         Gallery name.
     * @param commands                            Command groups.
     * @param preferredVisibleCommandCounts       Preferred count of visible commands of the
     *                                            ribbon gallery under different states.
     * @param preferredPopupMaxCommandColumns     Preferred maximum columns in the popup gallery
     *                                            associated with the ribbon gallery.
     * @param preferredPopupMaxVisibleCommandRows Preferred maximum visible rows in the popup
     *                                            gallery associated with the ribbon
     *                                            gallery.
     * @param commandDisplayState                 Display state for all commands.
     * @param priority                            The initial ribbon gallery priority.
     * @see CommandGroupModel#addCommand(FlamingoCommand)
     * @see CommandGroupModel#removeCommand(FlamingoCommand)
     * @see RibbonGalleryContentModel#setSelectedCommand(FlamingoCommand)
     * @deprecated Use {@link #addRibbonGallery(String, RibbonGalleryContentModel, RibbonGalleryPresentationModel, RibbonElementPriority, String)}
     */
    @Deprecated
    public void addRibbonGallery(String galleryName,
            List<StringValuePair<List<FlamingoCommand>>> commands,
            Map<RibbonElementPriority, Integer> preferredVisibleCommandCounts,
            int preferredPopupMaxCommandColumns, int preferredPopupMaxVisibleCommandRows,
            CommandButtonDisplayState commandDisplayState, RibbonElementPriority priority) {
        List<CommandGroupModel> commandGroups = new ArrayList<>();
        for (StringValuePair<List<FlamingoCommand>> commandPair : commands) {
            commandGroups.add(new CommandGroupModel(commandPair.getKey(), commandPair.getValue()));
        }
        RibbonGalleryContentModel contentModel = new RibbonGalleryContentModel(null, commandGroups);
        RibbonGalleryPresentationModel presentationModel =
                RibbonGalleryPresentationModel.builder()
                        .setPreferredVisibleCommandCounts(preferredVisibleCommandCounts)
                        .setPreferredPopupMaxVisibleCommandRows(preferredPopupMaxVisibleCommandRows)
                        .setPreferredPopupMaxCommandColumns(preferredPopupMaxCommandColumns)
                        .setCommandDisplayState(commandDisplayState).build();
        this.addRibbonGallery(galleryName, contentModel, presentationModel, priority, null);
    }

    public void addRibbonGallery(String galleryName, RibbonGalleryContentModel galleryContentModel,
            RibbonGalleryPresentationModel galleryPresentationModel,
            RibbonElementPriority priority, String expandKeyTip) {
        JRibbonGallery gallery = new JRibbonGallery(galleryName, galleryContentModel,
                galleryPresentationModel);
        gallery.setExpandKeyTip(expandKeyTip);
        ((JBandControlPanel) this.getControlPanel()).addRibbonGallery(gallery, priority);
    }

    /**
     * Adds the specified command toggle commands to a command group in the specified ribbon
     * gallery.
     *
     * @param galleryName      Ribbon gallery name.
     * @param commandGroupName Command group name.
     * @param commands         Commands to add.
     * @see #addRibbonGallery(String, RibbonGalleryContentModel, RibbonGalleryPresentationModel, RibbonElementPriority, String)
     * @see RibbonGalleryContentModel#setSelectedCommand(FlamingoCommand)
     * @see CommandGroupModel#removeCommand(FlamingoCommand)
     * @deprecated Use {@link CommandGroupModel#addCommand(FlamingoCommand)}
     */
    @Deprecated
    public void addRibbonGalleryCommands(String galleryName, String commandGroupName,
            FlamingoCommand... commands) {
        JRibbonGallery gallery = ((JBandControlPanel) this.getControlPanel()).getRibbonGallery(
                galleryName);
        if (gallery == null) {
            return;
        }
        CommandGroupModel commandGroupModel =
                gallery.getContentModel().getCommandGroupByTitle(commandGroupName);
        for (FlamingoCommand command : commands) {
            commandGroupModel.addCommand(command);
        }
    }

    /**
     * Removes commands from the specified ribbon gallery.
     *
     * @param galleryName Ribbon gallery name.
     * @param commands    Commands to remove.
     * @see #addRibbonGallery(String, RibbonGalleryContentModel, RibbonGalleryPresentationModel, RibbonElementPriority, String)
     * @see CommandGroupModel#addCommand(FlamingoCommand)
     * @see RibbonGalleryContentModel#setSelectedCommand(FlamingoCommand)
     * @deprecated Use {@link CommandGroupModel#removeCommand(FlamingoCommand)}
     */
    @Deprecated
    public void removeRibbonGalleryCommands(String galleryName, FlamingoCommand... commands) {
        JRibbonGallery gallery = ((JBandControlPanel) this.getControlPanel()).getRibbonGallery(
                galleryName);
        if (gallery == null) {
            return;
        }
        // To not break backwards compatibility, go over all command groups in the
        // gallery and ask each one to remove all the commands
        for (CommandGroupModel commandGroupModel :
                gallery.getContentModel().getCommandGroups()) {
            for (FlamingoCommand command : commands) {
                commandGroupModel.removeCommand(command);
            }
        }
    }

    /**
     * Selects the specified command in the specified ribbon gallery.
     *
     * @param galleryName     Ribbon gallery name.
     * @param commandToSelect Command to select.
     * @see #addRibbonGallery(String, RibbonGalleryContentModel, RibbonGalleryPresentationModel, RibbonElementPriority, String)
     * @see CommandGroupModel#addCommand(FlamingoCommand)
     * @see CommandGroupModel#removeCommand(FlamingoCommand)
     * @deprecated Use {@link RibbonGalleryContentModel#setSelectedCommand(FlamingoCommand)}
     */
    @Deprecated
    public void setSelectedRibbonGalleryCommand(String galleryName,
            FlamingoCommand commandToSelect) {
        JRibbonGallery gallery = ((JBandControlPanel) this.getControlPanel()).getRibbonGallery(
                galleryName);
        if (gallery == null) {
            return;
        }
        gallery.getContentModel().setSelectedCommand(commandToSelect);
    }

    /**
     * Sets the display state for the commands of the specified ribbon gallery.
     *
     * @param galleryName  Ribbon gallery name.
     * @param displayState Display state for the commands of the matching ribbon gallery.
     * @deprecated Use {@link RibbonGalleryPresentationModel#setCommandDisplayState(CommandButtonDisplayState)}
     */
    @Deprecated
    public void setRibbonGalleryCommandDisplayState(String galleryName,
            CommandButtonDisplayState displayState) {
        JRibbonGallery gallery = ((JBandControlPanel) this.getControlPanel()).getRibbonGallery(
                galleryName);
        if (gallery == null) {
            return;
        }
        gallery.getPresentationModel().setCommandDisplayState(displayState);
    }

    /**
     * Sets the application callback to place additional entries in the popup menu shown when the
     * specified ribbon gallery is expanded.
     *
     * @param galleryName   Gallery name.
     * @param popupCallback Application callback.
     * @see RibbonGalleryPopupCallback
     * @deprecated Use {@link RibbonGalleryContentModel#addExtraPopupCommandGroup(CommandGroupModel)}
     */
    @Deprecated
    public void setRibbonGalleryPopupCallback(String galleryName,
            RibbonGalleryPopupCallback popupCallback) {
        JRibbonGallery gallery = ((JBandControlPanel) this.getControlPanel()).getRibbonGallery(
                galleryName);
        if (gallery == null) {
            return;
        }
        gallery.getContentModel().setPopupCallback(popupCallback);
    }

    /**
     * Sets the key tip on the expand button of the specified ribbon gallery.
     *
     * @param galleryName  Gallery name.
     * @param expandKeyTip The key tip on the expand button of the specified ribbon gallery.
     * @deprecated Pass key tip to
     * {@link #addRibbonGallery(String, RibbonGalleryContentModel, RibbonGalleryPresentationModel, RibbonElementPriority, String)}
     */
    @Deprecated
    public void setRibbonGalleryExpandKeyTip(String galleryName, String expandKeyTip) {
        JRibbonGallery gallery = ((JBandControlPanel) this.getControlPanel()).getRibbonGallery(
                galleryName);
        if (gallery == null) {
            return;
        }
        gallery.setExpandKeyTip(expandKeyTip);
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
        AbstractRibbonBand result = new JRibbonBand(this.getTitle(),
                this.getIcon(), this.getExpandActionListener());
        result.applyComponentOrientation(this.getComponentOrientation());
        return result;
    }
}
