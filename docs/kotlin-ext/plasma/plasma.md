## Plasma - Kotlin DSL for Flamingo components

In your Java app, this is how you would configure a toggle command, add it to a command group, and project the group to create a command button strip:

```java
Command styleBold = Command.builder()
      .setIconFactory(Format_text_bold.factory())
      .setAction((CommandActionEvent e) -> System.out.println("Bold toggled"))
      .setToggleSelected(true)
      .setActionRichTooltip(RichTooltip.builder()
              .setTitle(resourceBundle.getString("FontBold.tooltip.textActionTitle"))
              .addDescriptionSection(resourceBundle.getString("FontBold.tooltip.textActionParagraph1"))
              .build())
      .build();

Map<Command, CommandButtonPresentationModel.Overlay> styleOverlays = new HashMap<>();
styleOverlays.put(styleBold, CommandButtonPresentationModel.overlay().setActionKeyTip("1"));

CommandStripProjection styleStripProjection = new CommandStripProjection(
      new CommandGroup(styleBold),
      CommandStripPresentationModel.withDefaults());
styleStripProjection.setCommandOverlays(styleOverlays);

JCommandButtonStrip buttonStrip = styleStripProjection.buildComponent();
```

And here is how the same code would look like in Kotlin using the Plasma-provided DSL:

```kotlin
commandButtonStrip {
    command {
        iconFactory = Format_text_bold.factory()
        action = CommandAction { println("Bold toggled") }
        isToggleSelected = true
        actionRichTooltip {
            title = resourceBundle.getString("FontBold.tooltip.textActionTitle")
            description {
                +resourceBundle.getString("FontBold.tooltip.textActionParagraph1")
            }
        }
        actionKeyTip = "1"
    }
}
```

Plasma provides DSL constructs for the following Flamingo components:

* `JCommandButton`
* `JCommandToggleButton`
* `JCommandMenuButton`
* `JCommandToggleMenuButton`
* `JCommandButtonPanel`
* `JCommandButtonStrip`
* `JCommandPopupMenu`
* `JRibbon` and all its parts

For example, here is a function that constructs and returns a ribbon band:

```kotlin
fun getFindBand(): KRibbonBand {
    return ribbonBand {
        title = resourceBundle.getString("Find.textBandTitle")
        iconFactory = Edit_find.factory()
        collapsedStateKeyTip = "ZY"

        command(RibbonElementPriority.TOP) {
            title = resourceBundle.getString("Search.text")
            iconFactory = System_search.factory()
            action = CommandAction { println("Search activated") }
            actionKeyTip = "FD"
        }

        command(RibbonElementPriority.MEDIUM) {
            title = resourceBundle.getString("Find.text")
            iconFactory = Edit_find.factory()
            action = CommandAction { println("Find activated") }
        }

        command(RibbonElementPriority.MEDIUM) {
            title = resourceBundle.getString("FindReplace.text")
            iconFactory = Edit_find_replace.factory()
            action = CommandAction { println("Find Replace activated") }
            isEnabled = false
        }

        command(RibbonElementPriority.MEDIUM) {
            title = resourceBundle.getString("SelectAll.text")
            iconFactory = Edit_select_all.factory()
            action = CommandAction { println("Select All activated") }
        }

        resizePolicies = { ribbonBand ->
            listOf(CoreRibbonResizePolicies.Mirror(ribbonBand),
         CoreRibbonResizePolicies.IconRibbonBandResizePolicy(ribbonBand))
        }
    }
}
```

You can then construct a ribbon task out of one or more bands:

```kotlin
fun getPageLayoutTask(): KRibbonTask {
    return ribbonTask {
        title = resourceBundle.getString("PageLayout.textTaskTitle")
        keyTip = "P"

        bands {
            +getClipboardBand()
            +getQuickStylesBand()
            +getFontBand()
            +getDocumentBand()
            +getFindBand()
        }
    }
}
```

And a ribbon frame out of one or more ribbon tasks and other elements:

```kotlin
val ribbonFrame = ribbonFrame {
    title = builder.resourceBundle.getString("Frame.title")
    applicationIcon = Applications_internet.factory()

    tasks {
        +builder.getPageLayoutTask()
        +builder.getWriteTask()
        +builder.getAnimationsTask()
        +builder.getWrappedTask()
    }

    contextualTaskGroups {
        // ...
    }

    anchored {
        // ...
    }

    taskbar {
        // ...
    }

    applicationMenu {
        // ...
    }

// This returns a JRibbonFrame object
val javaRibbonFrame = ribbonFrame.asRibbonFrame()

// Which we can then configure and display
javaRibbonFrame.preferredSize = Dimension(...)
javaRibbonFrame.minimumSize = Dimension(...)
javaRibbonFrame.pack()
javaRibbonFrame.setLocation(...)
javaRibbonFrame.defaultCloseOperation = WindowConstants.DISPOSE_ON_CLOSE

javaRibbonFrame.setVisible(true)

```
