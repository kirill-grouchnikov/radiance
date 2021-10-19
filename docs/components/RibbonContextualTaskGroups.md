## Components - ribbon contextual task groups

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/ribbon-start.png" width="1181" border=0/>

When you use the ribbon container in your application, you need to ask yourself what is the logical structure of all the available operations - or commands - that your users can activate to interact with the application content. At the top level of such structure you would find the ribbon tasks - "Page Layout", "Write", "Animations" and "Wrapped" in the screenshot above. At the second level you would find the ribbon bands - "Clipboard", "Quick Styles", "Font", "Document" and "Find (toggle)" for the "Page Layout" task.

However, some of those top-level groups of operations (or tasks) are only applicable when a very specific condition occurs in the user interaction with the application content. For example, a text editor might expose a rich variety of operations available on embedded tables or charts. But it does not necessarily make sense to always display those operations at the top level of your ribbon UI.

This is where contextual task groups come in play. They allow you to dynamically show and hide one or more tasks based on those specific conditions.

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/contextualtasks/contextual-task-added.png" width="1289" border=0/>

The screenshot above shows a contextual task group named "Group 1" that has two tasks ("Group 1A" and "Group 1B") that was marked as visible. For as long as this contextual task group remains visible, the user can interact with its content. Here is how it looks like when the mouse is moved over the task toggle button of its first task - using group-specific hue color for consistent visual delineation of the entire group:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/contextualtasks/contextual-task-rollover.png" width="1289" border=0/>

And when that task toggle button is activated, the associated task becomes selected:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/contextualtasks/contextual-task-selected.png" width="1289" border=0/>

You can have more than one contextual task group visible:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/contextualtasks/contextual-task-another-added.png" width="1289" border=0/>

This one has green hue color that is used for highlighting its title in the window title pane, as well as for the task toggle button when it's activated to be selected:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/components/walkthrough/ribbon/contextualtasks/contextual-task-another-selected.png" width="1289" border=0/>

### Working with contextual task groups

First, define your contextual tasks - with the same exact `RibbonTask` APIs as you do for your regular ribbon tasks:

```java
JRibbonBand actionBand = this.getActionBand();
JRibbonBand arrangeBand = this.getApplicationsBand();
JRibbonBand previewBand = this.getPreviewBand();
JRibbonBand transitionBand = this.getTransitionBand();
RibbonTask contextualTask1 = new RibbonTask(
    resourceBundle.getString("Task11.textTaskTitle"),
    actionBand, arrangeBand, previewBand, transitionBand);
task.setKeyTip("XA");
```

Then create your contextual task group(s):

```java
group1 = new RibbonContextualTaskGroup(
        resourceBundle.getString("Group1.textTaskGroupTitle"),
        Color.red,
        contextualTask1, contextualTask2);
group2 = new RibbonContextualTaskGroup(
        resourceBundle.getString("Group2.textTaskGroupTitle"),
        Color.green,
        contextualTask3);
```

and add them to the ribbon:

```java
this.getRibbon().addContextualTaskGroup(group1);
this.getRibbon().addContextualTaskGroup(group2);
```

At this point, the contextual task groups are part of your ribbon, but they are not visible. Use the  `JRibbon.setVisible(RibbonContextualTaskGroup, boolean)` API to change the visibility of the specific contextual task group (and, by extension, all tasks in it).

For example, this is the code from the main ribbon demo application that toggles the visibility of contextual task groups:

```java
final JCheckBox group1Visible = new JCheckBox("visible");
final JCheckBox group2Visible = new JCheckBox("visible");
group1Visible.addActionListener(actionEvent -> SwingUtilities.invokeLater(
        () -> getRibbon().setVisible(group1, group1Visible.isSelected())));
group2Visible.addActionListener(actionEvent -> SwingUtilities.invokeLater(
        () -> getRibbon().setVisible(group2, group2Visible.isSelected())));
```

In your real application, the "trigger" condition may be selection or deselection of certain elements in the main content area / canvas - such as the aforementioned tables and charts in a text editor.

### Next

Continue to [ribbon taskbar](RibbonTaskbar.md).
