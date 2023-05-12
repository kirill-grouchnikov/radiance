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
package org.pushingpixels.radiance.component.api.common.model;

import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;

/**
 * Encapsulates metadata for a single command. Use a new instance of
 * {@link Builder} to configure a new command, and {@link Builder#build()} to build a command.
 *
 * <p>A command can be projected to screen (creating a visual representation of that command)
 * using {@link CommandButtonPresentationModel} and {@link CommandButtonProjection}. Use
 * {@link #project()} for default presentation settings or
 * {@link #project(CommandButtonPresentationModel)} to customize presentation settings. Then use
 * {@link CommandButtonProjection#buildComponent()} to get an instance of
 * {@link JCommandButton} that can be added to the component hierarchy.
 * Note that you can - and should - use the same {@link Command} instance and one or more
 * {@link CommandButtonPresentationModel}s if you need to have multiple instances (or
 * projections) of the same command in your app UI. That way, changes in the command are propagated
 * and synced across all those projections.</p>
 *
 * @author Kirill Grouchnikov
 * @see CommandButtonPresentationModel
 * @see CommandButtonProjection
 */
public class Command extends BaseCommand<CommandMenuContentModel> {
    private Command() {
        super();
    }

    public static Builder builder() {
        return new Builder();
    }

    public CommandButtonProjection<Command> project() {
        return new CommandButtonProjection<>(this, CommandButtonPresentationModel.withDefaults());
    }

    public CommandButtonProjection<Command> project(
            CommandButtonPresentationModel commandPresentation) {
        return new CommandButtonProjection<>(this, commandPresentation);
    }

    @Override
    public String toString() {
        return "Command @" + hashCode() + " {text='" + getText() + "'}";
    }

    public static class Builder extends BaseBuilder<Command, CommandMenuContentModel, Builder> {
        @Override
        public Command build() {
            Command command = new Command();

            this.configureBaseCommand(command);

            command.checkConsistency();

            return command;
        }
    }
}
