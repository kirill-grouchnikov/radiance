package org.pushingpixels.radiance.component.internal.ui.common;

import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.model.ColorSelectorCommand;
import org.pushingpixels.radiance.component.api.common.model.ColorSelectorCommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.model.BaseCommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuContentModel;
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.ColorSelectorPopupMenuPanelProjection;
import org.pushingpixels.radiance.component.api.common.projection.Projection;

public class JColorSelectorCommandButton extends JCommandButton {
    public JColorSelectorCommandButton(
            Projection<JCommandButton, ColorSelectorCommand, ColorSelectorCommandButtonPresentationModel> projection) {
        super(projection);

        ColorSelectorCommand command = projection.getContentModel();
        ColorSelectorCommandButtonPresentationModel commandButtonPresentationModel = projection.getPresentationModel();

        ColorSelectorPopupMenuContentModel popupMenuContentModel =
                command.getSecondaryContentModel();
        BaseCommandPopupMenuPresentationModel popupMenuPresentationModel =
                commandButtonPresentationModel.getPopupMenuPresentationModel();
        if (popupMenuPresentationModel == null) {
            popupMenuPresentationModel = ColorSelectorPopupMenuPresentationModel.builder().build();
        }
        ColorSelectorPopupMenuPanelProjection colorSelectorPopupMenuPanelProjection =
                new ColorSelectorPopupMenuPanelProjection(popupMenuContentModel,
                        (ColorSelectorPopupMenuPresentationModel) popupMenuPresentationModel);
        colorSelectorPopupMenuPanelProjection.setCommandOverlays(this.getProjection().getCommandOverlays());
        this.setPopupCallback(commandButton -> colorSelectorPopupMenuPanelProjection.buildComponent());
    }
}
