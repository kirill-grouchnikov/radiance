## Components - ribbon anchored commands

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/ribbon/ribbon-start.png" width="1181" border=0/>

The top-right (under left-to-right orientation) corner of the ribbon is reserved for anchored commands. This area can be used to place a small number of commands that can be identified quickly by either their icon only, or by a very short text.

Use `JRibbon.addAnchoredCommand()` API to add anchored command content. For the screenshot above (that has Share, Chat and Help anchored commands) this is the code that adds such content:

```java
this.getRibbon().addAnchoredCommand(Command.builder()
        .setText(resourceBundle.getString("Share.title"))
        .setIconFactory(Internet_mail.factory())
        .setAction(commandActionEvent -> JOptionPane
                .showMessageDialog(BasicCheckRibbon.this, "Share button clicked"))
        .build()
        .project(CommandButtonPresentationModel.builder().setActionKeyTip("GS").build()));

this.getRibbon().addAnchoredCommand(Command.builder()
        .setIconFactory(Internet_group_chat.factory())
        .setAction(commandActionEvent -> JOptionPane
                .showMessageDialog(BasicCheckRibbon.this, "Chat button clicked"))
        .build()
        .project(CommandButtonPresentationModel.builder().setActionKeyTip("GC").build()));

this.getRibbon().addAnchoredCommand(Command.builder()
        .setIconFactory(Help_browser.factory())
        .setActionRichTooltip(RichTooltip.builder()
                .setTitle(resourceBundle.getString("Help.tooltip.title"))
                .addDescriptionSection(
                        resourceBundle.getString("Help.tooltip.actionParagraph"))
                .build())
        .setAction(commandActionEvent -> JOptionPane
                .showMessageDialog(BasicCheckRibbon.this, "Help button clicked"))
        .build()
        .project(CommandButtonPresentationModel.builder().setActionKeyTip("GH").build()));
```

The associated keytips are shown at the root level:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/ribbon/bands/ribbon-keytips.png" width="1400" border=0/>

Rich tooltips associated with the commands are shown right below the anchored command area:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/component/walkthrough/ribbon/ribbon-anchored-richtooltip.png" width="1119" border=0/>


### Next

Continue to [ribbon contextual task groups](RibbonContextualTaskGroups.md).
