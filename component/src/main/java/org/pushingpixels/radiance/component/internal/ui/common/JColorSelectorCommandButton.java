package org.pushingpixels.radiance.component.internal.ui.common;

import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.model.ColorSelectorCommand;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.model.AbstractPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuContentModel;
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.ColorSelectorPopupMenuPanelProjection;
import org.pushingpixels.radiance.component.api.common.projection.Projection;

public class JColorSelectorCommandButton extends JCommandButton {
    public JColorSelectorCommandButton(
            Projection<JCommandButton, ColorSelectorCommand, CommandButtonPresentationModel> projection) {
        super(projection);

        ColorSelectorCommand command = projection.getContentModel();
        CommandButtonPresentationModel commandButtonPresentationModel = projection.getPresentationModel();

        ColorSelectorPopupMenuContentModel popupMenuContentModel =
                command.getSecondaryContentModel();
        AbstractPopupMenuPresentationModel popupMenuPresentationModel =
                commandButtonPresentationModel.getPopupMenuPresentationModel();
        if (popupMenuPresentationModel == null) {
            popupMenuPresentationModel = ColorSelectorPopupMenuPresentationModel.builder().build();
        }
        ColorSelectorPopupMenuPanelProjection colorSelectorPopupMenuPanelProjection =
                new ColorSelectorPopupMenuPanelProjection(popupMenuContentModel,
                        (ColorSelectorPopupMenuPresentationModel) popupMenuPresentationModel);
        colorSelectorPopupMenuPanelProjection.setCommandOverlays(this.getProjection().getCommandOverlays());
        this.setPopupCallback(commandButton -> colorSelectorPopupMenuPanelProjection.buildComponent());

        this.setPopupKeyTip(commandButtonPresentationModel.getPopupKeyTip());

        boolean hasAction = (command.getAction() != null);
        if (hasAction) {
            this.setCommandButtonKind(commandButtonPresentationModel.getTextClick() == CommandButtonPresentationModel.TextClick.ACTION
                    ? JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION
                    : JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
        } else {
            this.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
        }

        this.updateUI();
    }
}
