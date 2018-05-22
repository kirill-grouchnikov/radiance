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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.pushingpixels.flamingo.api.common.FlamingoCommand;
import org.pushingpixels.flamingo.api.common.FlamingoCommand.FlamingoCommandBuilder;
import org.pushingpixels.flamingo.api.common.JCommandMenuButton;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuPrimaryCommand.PrimaryClearRolloverCallback;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuPrimaryCommand.PrimaryRolloverCallback;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuPrimaryCommand.RibbonApplicationMenuPrimaryCommandBuilder;

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
 * {@link RibbonApplicationMenuPrimaryCommandBuilder#setRolloverCallback(org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuPrimaryCommand.RibbonApplicationMenuPrimaryCommandBuilder.PrimaryRolloverCallback)}
 * . When this entry is armed (with mouse rollover or via keyboard navigation), the contents of the
 * secondary area are populated by the application callback implementation of
 * {@link PrimaryRolloverCallback#menuEntryActivated(javax.swing.JPanel)}. The <code>Open</code>
 * menu item is an example of such a primary menu entry, showing a list of recently opened files.
 * For a primary entry that is action-only, pass {@link PrimaryClearRolloverCallback} as the primary
 * rollover callback to clear the secondary area.</li>
 * <li>Associated list of {@link FlamingoCommand}s added with the
 * {@link RibbonApplicationMenuPrimaryCommandBuilder#addSecondaryMenuGroup(String, FlamingoCommand...)}
 * API. When this entry is armed (with mouse rollover or via keyboard navigation), the secondary
 * area shows menu buttons for the registered secondary menu entries. The <code>Save As</code> menu
 * item is an example of such a primary menu item, showing a list of default save formats.</li>
 * </ul>
 * 
 * <p>
 * At runtime, the application menu entries are implemented as {@link JCommandMenuButton}, but the
 * application code does not operate on that level. Instead, the application code creates
 * metadata-driven description of the ribbon application menu with
 * {@link RibbonApplicationMenuPrimaryCommandBuilder} and {@link FlamingoCommandBuilder}, and those
 * commands is used to create and populate the "real" controls of the application menu popup.
 * </p>
 * 
 * <p>
 * Note that once a {@link RibbonApplicationMenu} is set on the {@link JRibbon} with the
 * {@link JRibbon#setApplicationMenu(RibbonApplicationMenu)}, its contents cannot be changed. An
 * {@link IllegalStateException} will be thrown from
 * {@link #addMenuCommand(RibbonApplicationMenuPrimaryCommand)} and
 * {@link #addFooterCommand(FlamingoCommand)}.
 * </p>
 * 
 * @author Kirill Grouchnikov
 */
public class RibbonApplicationMenu {
    /**
     * Indicates whether this ribbon application menu has been set on the {@link JRibbon} with the
     * {@link JRibbon#setApplicationMenu(RibbonApplicationMenu)}. Once that API is called, the
     * contents of this menu cannot be changed. An {@link IllegalStateException} will be thrown from
     * {@link #addMenuCommand(FlamingoCommand)} and
     * {@link #addFooterCommand(RibbonApplicationMenuEntryFooter)}.
     * 
     * @see #setFrozen(boolean)
     * @see #addMenuCommand(FlamingoCommand)
     * @see #addFooterCommand(RibbonApplicationMenuEntryFooter)
     */
    private boolean isFrozen;

    /**
     * Primary commands.
     */
    private List<List<RibbonApplicationMenuPrimaryCommand>> primaryCommands;

    /**
     * Footer commands.
     */
    private List<FlamingoCommand> footerCommands;

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
     */
    public RibbonApplicationMenu() {
        this.primaryCommands = new ArrayList<List<RibbonApplicationMenuPrimaryCommand>>();
        this.primaryCommands.add(new ArrayList<RibbonApplicationMenuPrimaryCommand>());
        this.footerCommands = new ArrayList<FlamingoCommand>();
    }

    /**
     * Adds the specified primary menu command.
     * 
     * @param command
     *            Primary menu command to add.
     * @throws IllegalStateException
     *             if this ribbon application menu has already been set on the {@link JRibbon} with
     *             the {@link JRibbon#setApplicationMenu(RibbonApplicationMenu)}.
     * @see #getPrimaryCommands()
     * @see #addFooterCommand(RibbonApplicationMenuEntryFooter)
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
        this.primaryCommands.add(new ArrayList<RibbonApplicationMenuPrimaryCommand>());
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
     * @param entry
     *            Footer command to add.
     * @throws IllegalStateException
     *             if this ribbon application menu has already been set on the {@link JRibbon} with
     *             the {@link JRibbon#setApplicationMenu(RibbonApplicationMenu)}.
     * @see #getFooterCommands()
     * @see #addMenuCommand(RibbonApplicationMenuPrimaryCommand)
     */
    public synchronized void addFooterCommand(FlamingoCommand entry) {
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
     * @see #addFooterCommand(FlamingoCommand)
     * @see #getPrimaryCommands()
     */
    public List<FlamingoCommand> getFooterCommands() {
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
     * @param defaultCallback
     *            Default callback.
     */
    public void setDefaultCallback(PrimaryRolloverCallback defaultCallback) {
        this.defaultCallback = defaultCallback;
    }

    /**
     * Returns the default callback of this ribbon application menu.
     * 
     * @return The default callback of this ribbon application menu.
     * @see #setDefaultCallback(PrimaryRolloverCallback)
     */
    public PrimaryRolloverCallback getDefaultCallback() {
        return defaultCallback;
    }

    /**
     * Marks this application menu as frozen. Subsequent calls to
     * {@link #addMenuCommand(RibbonApplicationMenuPrimaryCommand)} and
     * {@link #addFooterCommand(RibbonApplicationMenuEntryFooter)} will throw an
     * {@link IllegalStateException}.
     * 
     * @see #addMenuCommand(RibbonApplicationMenuPrimaryCommand)
     * @see #addFooterCommand(RibbonApplicationMenuEntryFooter)
     * @see JRibbon#setApplicationMenu(RibbonApplicationMenu)
     */
    synchronized void setFrozen() {
        this.isFrozen = true;
        if (this.primaryCommands.get(this.primaryCommands.size() - 1).isEmpty()) {
            this.primaryCommands.remove(this.primaryCommands.size() - 1);
        }
    }
}
