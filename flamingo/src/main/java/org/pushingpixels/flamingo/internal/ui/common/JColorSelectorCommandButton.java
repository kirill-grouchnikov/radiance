package org.pushingpixels.flamingo.internal.ui.common;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.model.ColorSelectorCommand;
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.flamingo.api.common.popup.model.AbstractPopupMenuPresentationModel;
import org.pushingpixels.flamingo.api.common.popup.model.ColorSelectorPopupMenuContentModel;
import org.pushingpixels.flamingo.api.common.popup.model.ColorSelectorPopupMenuPresentationModel;
import org.pushingpixels.flamingo.api.common.projection.ColorSelectorPopupMenuProjection;
import org.pushingpixels.flamingo.api.common.projection.Projection;

public class JColorSelectorCommandButton extends JCommandButton {
    public JColorSelectorCommandButton(
            Projection<AbstractCommandButton, ColorSelectorCommand, CommandButtonPresentationModel> projection) {
        super(projection);

        ColorSelectorCommand command = projection.getContentModel();

        ColorSelectorPopupMenuContentModel popupMenuContentModel =
                command.getColorSelectorPopupMenuContentModel();
        AbstractPopupMenuPresentationModel popupMenuPresentationModel =
                commandPresentation.getPopupMenuPresentationModel();
        if (popupMenuPresentationModel == null) {
            popupMenuPresentationModel = ColorSelectorPopupMenuPresentationModel.builder().build();
        }
        ColorSelectorPopupMenuProjection colorSelectorPopupMenuProjection =
                new ColorSelectorPopupMenuProjection(popupMenuContentModel,
                        (ColorSelectorPopupMenuPresentationModel) popupMenuPresentationModel);
        colorSelectorPopupMenuProjection.setCommandOverlays(
                this.projection.getCommandOverlays());
        this.setPopupCallback((JCommandButton commandButton)
                -> colorSelectorPopupMenuProjection.buildComponent());

        this.setPopupRichTooltip(command.getSecondaryRichTooltip());
        this.setPopupKeyTip(commandPresentation.getPopupKeyTip());

        boolean hasAction = (command.getAction() != null);
        if (hasAction) {
            this.setCommandButtonKind(commandPresentation.isTextClickAction()
                    ? JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION
                    : JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
        } else {
            this.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
        }

        this.updateUI();
    }
}
