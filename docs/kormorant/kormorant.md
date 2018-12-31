## Kormorant - Kotlin DSL for Flamingo components

In your Java app, this is how you would create a toggle button and add it to a command button strip:

```java
JCommandButtonStrip styleStrip = new JCommandButtonStrip();

JCommandToggleButton styleBoldButton = new JCommandToggleButton("", new Format_text_bold());
styleBoldButton.addActionListener((ActionEvent e) -> System.out.println("Bold toggled"));
styleBoldButton.getActionModel().setSelected(true);
styleBoldButton
        .setActionRichTooltip(RichTooltip.builder()
                .setTitle(resourceBundle.getString("FontBold.tooltip.textActionTitle"))
                .addDescriptionSection(
                        resourceBundle.getString("FontBold.tooltip.textActionParagraph1"))
                .build());
styleBoldButton.setActionKeyTip("1");
styleStrip.add(styleBoldButton);
```

And here is how the same code would look like in Kotlin using the Kormorant-provided DSL:

```kotlin
commandButtonStrip {
    command {
        icon = Format_text_bold.of(16, 16)
        action = ActionListener { println("Bold toggled") }
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

Kormorant provides DSL constructs for the following Flamingo components:

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
        icon = Edit_find.of(16, 16)
        collapsedStateKeyTip = "ZY"

        command(RibbonElementPriority.TOP) {
            title = resourceBundle.getString("Search.text")
            icon = System_search.of(16, 16)
            action = ActionListener { println("Search activated") }
            actionKeyTip = "FD"
        }

        command(RibbonElementPriority.MEDIUM) {
            title = resourceBundle.getString("Find.text")
            icon = Edit_find.of(16, 16)
            action = ActionListener { println("Find activated") }
        }

        command(RibbonElementPriority.MEDIUM) {
            title = resourceBundle.getString("FindReplace.text")
            icon = Edit_find_replace.of(16, 16)
            action = ActionListener { println("Find Replace activated") }
            isEnabled = false
        }

        command(RibbonElementPriority.MEDIUM) {
            title = resourceBundle.getString("SelectAll.text")
            icon = Edit_select_all.of(16, 16)
            action = ActionListener { println("Select All activated") }
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
    applicationIcon = Applications_internet.of(16, 16)

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
