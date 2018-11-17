/**
 *
 */
package org.pushingpixels.demo.flamingo.common;

import org.pushingpixels.flamingo.api.common.FlamingoCommand;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.model.CommandGroupModel;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.model.*;

import java.awt.*;
import java.util.*;
import java.util.List;

public class SamplePopupMenu {

    public static JCommandPopupMenu getSamplePopupMenu(ComponentOrientation orientation) {
        java.util.List<FlamingoCommand> menuCommands1 = new ArrayList<>();
        List<FlamingoCommand> menuCommands2 = new ArrayList<>();

        menuCommands1.add(FlamingoCommand.builder()
                .setTitle("Test menu item 1")
                .setIcon(new EmptyResizableIcon(16))
                .build());
        menuCommands1.add(FlamingoCommand.builder()
                .setTitle("Test menu item 2")
                .setIcon(new EmptyResizableIcon(16))
                .build());
        menuCommands1.add(FlamingoCommand.builder()
                .setTitle("Test menu item 3")
                .setIcon(new EmptyResizableIcon(16))
                .build());

        menuCommands2.add(FlamingoCommand.builder()
                .setTitle("Test menu item 4")
                .setIcon(new EmptyResizableIcon(16))
                .build());
        menuCommands2.add(FlamingoCommand.builder()
                .setTitle("Test menu item 5")
                .setIcon(new EmptyResizableIcon(16))
                .build());

        CommandPopupMenuContentModel menuContentModel = new CommandPopupMenuContentModel(
                Arrays.asList(new CommandGroupModel(menuCommands1),
                        new CommandGroupModel(menuCommands2)));

        JCommandPopupMenu result = new JCommandPopupMenu(menuContentModel,
                CommandPopupMenuPresentationModel.builder().build());
        result.applyComponentOrientation(orientation);
        return result;
    }
}