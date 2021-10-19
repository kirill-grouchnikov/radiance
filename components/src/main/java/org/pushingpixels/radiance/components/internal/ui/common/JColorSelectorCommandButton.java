package org.pushingpixels.radiance.components.internal.ui.common;

import org.pushingpixels.radiance.components.api.common.JCommandButton;
import org.pushingpixels.radiance.components.api.common.model.ColorSelectorCommand;
import org.pushingpixels.radiance.components.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.components.api.common.popup.model.AbstractPopupMenuPresentationModel;
import org.pushingpixels.radiance.components.api.common.popup.model.ColorSelectorPopupMenuContentModel;
import org.pushingpixels.radiance.components.api.common.popup.model.ColorSelectorPopupMenuPresentationModel;
import org.pushingpixels.radiance.components.api.common.projection.ColorSelectorPopupMenuProjection;
import org.pushingpixels.radiance.components.api.common.projection.Projection;

public class JColorSelectorCommandButton extends JCommandButton {
    public JColorSelectorCommandButton(
            Projection<JCommandButton, ColorSelectorCommand, CommandButtonPresentationModel> projection) {
        super(projection);

        ColorSelectorCommand command = projection.getContentModel();
        CommandButtonPresentationModel commandButtonPresentationModel = projection.getPresentationModel();

        ColorSelectorPopupMenuContentModel popupMenuContentModel =
                command.getColorSelectorPopupMenuContentModel();
        AbstractPopupMenuPresentationModel popupMenuPresentationModel =
                commandButtonPresentationModel.getPopupMenuPresentationModel();
        if (popupMenuPresentationModel == null) {
            popupMenuPresentationModel = ColorSelectorPopupMenuPresentationModel.builder().build();
        }
        ColorSelectorPopupMenuProjection colorSelectorPopupMenuProjection =
                new ColorSelectorPopupMenuProjection(popupMenuContentModel,
                        (ColorSelectorPopupMenuPresentationModel) popupMenuPresentationModel);
        colorSelectorPopupMenuProjection.setCommandOverlays(this.getProjection().getCommandOverlays());
        this.setPopupCallback(commandButton -> colorSelectorPopupMenuProjection.buildComponent());

        this.setPopupRichTooltip(command.getSecondaryRichTooltip());
        this.setPopupKeyTip(commandButtonPresentationModel.getPopupKeyTip());

        boolean hasAction = (command.getAction() != null);
        if (hasAction) {
            this.setCommandButtonKind(commandButtonPresentationModel.isTextClickAction()
                    ? JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION
                    : JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
        } else {
            this.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
        }

        this.updateUI();
    }
}
