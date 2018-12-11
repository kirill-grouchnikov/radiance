/**
 *
 */
package org.pushingpixels.demo.flamingo.common;

import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.model.*;
import org.pushingpixels.flamingo.api.common.projection.CommandPopupMenuProjection;

import java.util.List;
import java.util.*;

public class SamplePopupMenu {
    public static CommandPopupMenuProjection getSamplePopupMenu() {
        List<Command> menuProjections1 = new ArrayList<>();
        List<Command> menuProjections2 = new ArrayList<>();

        menuProjections1.add(Command.builder()
                .setText("Test menu item 1")
                .setIcon(new EmptyResizableIcon(16))
                .build());
        menuProjections1.add(Command.builder()
                .setText("Test menu item 2")
                .setIcon(new EmptyResizableIcon(16))
                .build());
        menuProjections1.add(Command.builder()
                .setText("Test menu item 3")
                .setIcon(new EmptyResizableIcon(16))
                .build());

        menuProjections2.add(Command.builder()
                .setText("Test menu item 4")
                .setIcon(new EmptyResizableIcon(16))
                .build());
        menuProjections2.add(Command.builder()
                .setText("Test menu item 5")
                .setIcon(new EmptyResizableIcon(16))
                .build());

        CommandPopupMenuContentModel menuContentModel = new CommandPopupMenuContentModel(
                Arrays.asList(new CommandGroupModel(menuProjections1),
                        new CommandGroupModel(menuProjections2)));

        return new CommandPopupMenuProjection(menuContentModel,
                CommandPopupMenuPresentationModel.builder().build());
    }
}