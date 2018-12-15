package org.pushingpixels.flamingo.api.common.model;

import org.pushingpixels.flamingo.api.common.popup.model.ColorSelectorPopupMenuContentModel;

public class ColorSelectorCommand extends Command {
    private ColorSelectorPopupMenuContentModel popupMenuContentModel;

    public static Builder colorSelectorBuilder() {
        return new Builder();
    }

    public ColorSelectorCommand() {
    }

    public ColorSelectorPopupMenuContentModel getColorSelectorPopupMenuContentModel() {
        return this.popupMenuContentModel;
    }

    public static class Builder extends BaseBuilder<ColorSelectorCommand,
            ColorSelectorCommand.Builder> {
        private ColorSelectorPopupMenuContentModel popupMenuContentModel;

        public Builder setColorSelectorPopupMenuContentModel(ColorSelectorPopupMenuContentModel popupMenuContentModel) {
            this.popupMenuContentModel = popupMenuContentModel;
            return this;
        }

        /**
         * Builds a color selector command from this builder.
         *
         * @return Command.
         */
        public ColorSelectorCommand build() {
            ColorSelectorCommand command = new ColorSelectorCommand();

            this.configureBaseCommand(command);
            command.popupMenuContentModel = this.popupMenuContentModel;

            return command;
        }
    }
}
