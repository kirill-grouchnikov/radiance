## Flamingo - keyboard accelerators

In addition to [keytips](RibbonKeytips.md) that are used to *navigate to* and activate a specific command in the larger context of the ribbon, Flamingo provides support for directly activating commands with the more traditional Swing keyboard accelerators.

Use the `JRibbonFrame.setKeyboardActions` API to pass a list of keyboard actions, each one providing a `KeyStroke` and the matching [command](Command.md) whose action will be activated when the user types that keystroke:

```java
Set<JRibbonFrame.RibbonKeyboardAction> keyboardActions = new HashSet<>();
keyboardActions.add(new RibbonKeyboardAction("cut",
        (NeonCortex.getPlatform() == NeonCortex.Platform.MACOS)
                ? KeyStroke.getKeyStroke("meta X")
                : KeyStroke.getKeyStroke("ctrl X"),
        this.cutCommand));
keyboardActions.add(new RibbonKeyboardAction("copy",
        (NeonCortex.getPlatform() == NeonCortex.Platform.MACOS)
                ? KeyStroke.getKeyStroke("meta C")
                : KeyStroke.getKeyStroke("ctrl C"),
        this.copyCommand));
keyboardActions.add(new RibbonKeyboardAction("paste",
        (NeonCortex.getPlatform() == NeonCortex.Platform.MACOS)
                ? KeyStroke.getKeyStroke("meta V")
                : KeyStroke.getKeyStroke("ctrl V"),
        this.pasteCommand));
this.setKeyboardActions(keyboardActions);
```

### Next

Continue to [ribbon resizing](RibbonResizing.md).
