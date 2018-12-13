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

import org.pushingpixels.flamingo.api.common.JCommandMenuButton;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.model.AbstractPopupMenuContentModel;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuPrimaryCommand.*;

import java.util.*;

/**
 * Metadata description of the application menu of the {@link JRibbon} component. The ribbon
 * application menu has three parts:
 *
 * <pre>
 * +-------------------------------------+
 * |           |                         |
 * |           |                         |
 * |  primary  |        secondary        |
 * |   area    |           area          |
 * |           |                         |
 * |           |                         |
 * |-------------------------------------|
 * |            footer area              |
 * +-------------------------------------+
 * </pre>
 *
 * <p>
 * The entries in the primary area are always visible. The secondary area entries are shown based on
 * the currently active element in the primary area. There are two different types of primary
 * entries:
 * </p>
 *
 * <ul>
 * <li>Associated {@link PrimaryRolloverCallback} configured by the
 * {@link Builder#setRolloverCallback(RibbonApplicationMenuPrimaryCommand.PrimaryRolloverCallback)}
 * . When this entry is armed (with mouse rollover or via keyboard navigation), the contents of the
 * secondary area are populated by the application callback implementation of
 * {@link PrimaryRolloverCallback#menuEntryActivated(javax.swing.JPanel)}. The <code>Open</code>
 * menu item is an example of such a primary menu entry, showing a list of recently opened files.
 * For a primary entry that is action-only, pass {@link PrimaryClearRolloverCallback} as the primary
 * rollover callback to clear the secondary area.</li>
 * <li>Associated list of {@link Command}s added with the
 * {@link Builder#addSecondaryMenuGroup(String, Command...)}
 * API. When this entry is armed (with mouse rollover or via keyboard navigation), the secondary
 * area shows menu buttons for the registered secondary menu entries. The <code>Save As</code> menu
 * item is an example of such a primary menu item, showing a list of default save formats.</li>
 * </ul>
 *
 * <p>
 * At runtime, the application menu entries are implemented as {@link JCommandMenuButton}, but the
 * application code does not operate on that level. Instead, the application code creates
 * metadata-driven description of the ribbon application menu with
 * {@link Builder} and
 * {@link Command.Builder}, and those commands is used to create and populate the "real"
 * controls of the application menu popup.
 * </p>
 *
 * <p>
 * Note that once a {@link RibbonApplicationMenu} is set on the {@link JRibbon} with the
 * {@link JRibbon#setApplicationMenu(RibbonApplicationMenu)}, its contents cannot be changed. An
 * {@link IllegalStateException} will be thrown from
 * {@link #addMenuCommand(RibbonApplicationMenuPrimaryCommand)}, {@link #addMenuSeparator()} and
 * {@link #addFooterCommand(Command)}.
 * </p>
 *
 * @author Kirill Grouchnikov
 */
public class RibbonApplicationMenu extends AbstractPopupMenuContentModel {
    /**
     * Indicates whether this ribbon application menu has been set on the {@link JRibbon} with the
     * {@link JRibbon#setApplicationMenu(RibbonApplicationMenu)}. Once that API is called, the
     * contents of this menu cannot be changed. An {@link IllegalStateException} will be thrown from
     * {@link #addMenuCommand(RibbonApplicationMenuPrimaryCommand)} and
     * {@link #addFooterCommand(Command)}.
     *
     * @see #addMenuCommand(RibbonApplicationMenuPrimaryCommand)
     * @see #addFooterCommand(Command)
     */
    private boolean isFrozen;

    private String title;

    /**
     * Primary commands.
     */
    private List<List<RibbonApplicationMenuPrimaryCommand>> primaryCommands;

    /**
     * Footer commands.
     */
    private List<Command> footerCommands;

    /**
     * The default callback to be called when:
     *
     * <ul>
     * <li>The ribbon application menu is first shown.</li>
     * <li>The currently active (rollover) primary application menu entry has no secondary menu
     * entries and no associated rollover callback.
     * </ul>
     */
    private PrimaryRolloverCallback defaultCallback;

    /**
     * Creates an empty ribbon application menu.
     *
     * @param title Application menu title. Must not be null or empty.
     */
    public RibbonApplicationMenu(String title) {
        if ((title == null) || title.isEmpty()) {
            throw new IllegalArgumentException("Menu title can not be null or empty");
        }
        this.title = title;
        this.primaryCommands = new ArrayList<>();
        this.primaryCommands.add(new ArrayList<>());
        this.footerCommands = new ArrayList<>();
    }

    public String getTitle() {
        return this.title;
    }

    /**
     * Adds the specified primary menu command.
     *
     * @param command Primary menu command to add.
     * @throws IllegalStateException if this ribbon application menu has already been set on the
     *                               {@link JRibbon} with
     *                               the {@link JRibbon#setApplicationMenu(RibbonApplicationMenu)}.
     * @see #getPrimaryCommands()
     * @see #addFooterCommand(Command)
     */
    public synchronized void addMenuCommand(RibbonApplicationMenuPrimaryCommand command) {
        if (this.isFrozen) {
            throw new IllegalStateException(
                    "Cannot add menu entries after the menu has been set on the ribbon");
        }
        this.primaryCommands.get(this.primaryCommands.size() - 1).add(command);
    }

    public synchronized void addMenuSeparator() {
        if (this.isFrozen) {
            throw new IllegalStateException(
                    "Cannot add menu entries after the menu has been set on the ribbon");
        }
        this.primaryCommands.add(new ArrayList<>());
    }

    /**
     * Returns an unmodifiable list of all primary menu commands of this application menu. The
     * result is guaranteed to be non-<code>null</code>.
     *
     * @return An unmodifiable list of all primary menu commands of this application menu.
     * @see #addMenuCommand(RibbonApplicationMenuPrimaryCommand)
     * @see #getFooterCommands()
     */
    public List<List<RibbonApplicationMenuPrimaryCommand>> getPrimaryCommands() {
        return Collections.unmodifiableList(this.primaryCommands);
    }

    /**
     * Adds the specified footer command.
     *
     * @param entry Footer command to add.
     * @throws IllegalStateException if this ribbon application menu has already been set on the
     *                               {@link JRibbon} with
     *                               the {@link JRibbon#setApplicationMenu(RibbonApplicationMenu)}.
     * @see #getFooterCommands()
     * @see #addMenuCommand(RibbonApplicationMenuPrimaryCommand)
     */
    public synchronized void addFooterCommand(Command entry) {
        if (this.isFrozen) {
            throw new IllegalStateException(
                    "Cannot add footer commands after the menu has been set on the ribbon");
        }
        this.footerCommands.add(entry);
    }

    /**
     * Returns an unmodifiable list of all footer commands of this application menu. The result is
     * guaranteed to be non-<code>null</code>.
     *
     * @return An unmodifiable list of all footer commands of this application menu.
     * @see #addFooterCommand(Command)
     * @see #getPrimaryCommands()
     */
    public List<Command> getFooterCommands() {
        return Collections.unmodifiableList(this.footerCommands);
    }

    /**
     * Sets the default callback to be called when:
     *
     * <ul>
     * <li>The ribbon application menu is first shown.</li>
     * <li>The currently active (rollover) primary application menu entry has no secondary menu
     * entries and no associated rollover callback.
     * </ul>
     *
     * @param defaultCallback Default callback.
     */
    public void setDefaultCallback(PrimaryRolloverCallback defaultCallback) {
        this.defaultCallback = defaultCallback;
    }

    /**
     * Returns the default callback of this ribbon application menu.
     *
     * @return The default callback of this ribbon application menu.
     */
    public PrimaryRolloverCallback getDefaultCallback() {
        return defaultCallback;
    }

    /**
     * Marks this application menu as frozen. Subsequent calls to
     * {@link #addMenuCommand(RibbonApplicationMenuPrimaryCommand)} and
     * {@link #addFooterCommand(Command)} will throw an
     * {@link IllegalStateException}.
     *
     * @see #addMenuCommand(RibbonApplicationMenuPrimaryCommand)
     * @see #addFooterCommand(Command)
     * @see JRibbon#setApplicationMenu(RibbonApplicationMenu)
     */
    synchronized void freeze() {
        this.isFrozen = true;
        if (this.primaryCommands.get(this.primaryCommands.size() - 1).isEmpty()) {
            this.primaryCommands.remove(this.primaryCommands.size() - 1);
        }
    }
}
