/**
 *
 */
package org.pushingpixels.demo.flamingo.common;

import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandGroup;
import org.pushingpixels.flamingo.api.common.model.CommandMenuContentModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SamplePopupMenu {
    public static CommandMenuContentModel getSamplePopupMenuContentModel() {
        List<Command> menuProjections1 = new ArrayList<>();
        List<Command> menuProjections2 = new ArrayList<>();

        menuProjections1.add(Command.builder()
                .setText("Test menu item 1")
                .setIconFactory(EmptyResizableIcon.factory())
                .build());
        menuProjections1.add(Command.builder()
                .setText("Test menu item 2")
                .setIconFactory(EmptyResizableIcon.factory())
                .build());
        menuProjections1.add(Command.builder()
                .setText("Test menu item 3")
                .setIconFactory(EmptyResizableIcon.factory())
                .build());

        menuProjections2.add(Command.builder()
                .setText("Test menu item 4")
                .setIconFactory(EmptyResizableIcon.factory())
                .build());
        menuProjections2.add(Command.builder()
                .setText("Test menu item 5")
                .setIconFactory(EmptyResizableIcon.factory())
                .build());

        CommandMenuContentModel menuContentModel = new CommandMenuContentModel(
                Arrays.asList(new CommandGroup(menuProjections1),
                        new CommandGroup(menuProjections2)));

        return menuContentModel;
    }
}