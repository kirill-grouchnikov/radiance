/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.api.common;

import org.pushingpixels.radiance.component.api.common.model.BaseCommand;

import java.awt.event.ActionEvent;

/**
 * Event fired when a command action is triggered.
 */
public class CommandActionEvent extends ActionEvent {
    /**
     * The command that triggered this event.
     */
    private BaseCommand<?> command;

    /**
     * Constructs a {@code CommandActionEvent}.
     *
     * @param source The event source.
     * @param id The event ID.
     * @param radianceCommand The command.
     * @param command The command string.
     * @param when The timestamp.
     * @param modifiers The modifier keys.
     */
    public CommandActionEvent(Object source, int id, BaseCommand<?> radianceCommand,
            String command, long when, int modifiers) {
        super(source, id, command, when, modifiers);
        this.command = radianceCommand;
    }

    /**
     * Returns the command that triggered this event.
     *
     * @return The command.
     */
    public BaseCommand<?> getCommand() {
        return this.command;
    }

    /**
     * Returns the button source if the event source is a {@link JCommandButton}.
     *
     * @return The button source, or {@code null}.
     */
    public JCommandButton getButtonSource() {
        Object source = this.getSource();
        if (source instanceof JCommandButton) {
            return (JCommandButton) source;
        }
        return null;
    }
}
