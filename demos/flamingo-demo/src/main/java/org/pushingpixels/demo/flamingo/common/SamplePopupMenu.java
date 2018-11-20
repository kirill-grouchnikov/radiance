/**
 *
 */
package org.pushingpixels.demo.flamingo.common;

import org.pushingpixels.flamingo.api.common.FlamingoCommand;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.model.*;

import java.awt.*;
import java.util.*;
import java.util.List;

public class SamplePopupMenu {

    public static JCommandPopupMenu getSamplePopupMenu(ComponentOrientation orientation) {
        List<CommandProjection> menuProjections1 = new ArrayList<>();
        List<CommandProjection> menuProjections2 = new ArrayList<>();

        menuProjections1.add(FlamingoCommand.builder()
                .setTitle("Test menu item 1")
                .setIcon(new EmptyResizableIcon(16))
                .build().project());
        menuProjections1.add(FlamingoCommand.builder()
                .setTitle("Test menu item 2")
                .setIcon(new EmptyResizableIcon(16))
                .build().project());
        menuProjections1.add(FlamingoCommand.builder()
                .setTitle("Test menu item 3")
                .setIcon(new EmptyResizableIcon(16))
                .build().project());

        menuProjections2.add(FlamingoCommand.builder()
                .setTitle("Test menu item 4")
                .setIcon(new EmptyResizableIcon(16))
                .build().project());
        menuProjections2.add(FlamingoCommand.builder()
                .setTitle("Test menu item 5")
                .setIcon(new EmptyResizableIcon(16))
                .build().project());

        CommandPopupMenuContentModel menuContentModel = new CommandPopupMenuContentModel(
                Arrays.asList(new CommandProjectionGroupModel(menuProjections1),
                        new CommandProjectionGroupModel(menuProjections2)));

        JCommandPopupMenu result = new JCommandPopupMenu(menuContentModel,
                CommandPopupMenuPresentationModel.builder().build());
        result.applyComponentOrientation(orientation);
        return result;
    }
}