## Meteor - Kotlin extensions for core Swing APIs

### Working with listeners

In your Java app, this is how you would intercept the action to close the application window and prompt the user to save modified data:

```java
this.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
        // do we need to save the modified scheme list?
        if (colorSchemeList.checkModifiedStateAndSaveIfNecessary()) {
            dispose();
        }
    }
});
```

Here is how the same code can look like after initial conversion to Kotlin:

```kotlin
this.addWindowListener(object : WindowAdapter() {
    override fun windowClosing(e: WindowEvent?) {
        // do we need to save the modified scheme list?
        if (colorSchemeList.checkModifiedStateAndSaveIfNecessary()) {
            dispose()
        }
    }
})
```

This still looks much like the original Java code. Let's take a look at the signature of `Window.addDelayedWindowListener` extension function:

```kotlin
inline fun Window.addDelayedWindowListener(
        crossinline onWindowActivated: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowClosed: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowClosing: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowDeactivated: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowDeiconified: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowIconified: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowOpened: (event: WindowEvent?) -> Unit = {}): WindowListener {
```

Note that there is no more usage of either `WindowListener` or `WindowAdapter` Java-side constructs in the input parameters. This means that we can move away from the rather awkward `object: WindowAdapter()` Kotlin-Java bridge. In addition, if you're only interested in a single type of `WindowEvent`, the resulting code looks Kotlin-first:

```kotlin
this.addDelayedWindowListener(onWindowClosing = {
    // do we need to save the modified scheme list?
    if (colorSchemeList.checkModifiedStateAndSaveIfNecessary()) {
        dispose()
    }
})
```

Note that since we are not inspecting the `WindowEvent` that is passed to `onWindowClosing`, it is simply omitted from the lambda that we pass to this extension function.

### Rendering with `Graphics2D`

Here is how a custom `Icon` might implement a simple rectangular color fill in its `paintIcon`:

```java
@Override
public void paintIcon(Component c, Graphics g, int x, int y) {
    Graphics2D g2d = (Graphics2D) g.create();
    g2d.setColor(color);
    g2d.fillRect(x, y, w, h);
    float borderThickness = 1.0f / (float) NeonCortex.getScaleFactor();
    g2d.setColor(color.darker());
    g2d.setStroke(new BasicStroke(borderThickness, BasicStroke.CAP_ROUND,
            BasicStroke.JOIN_ROUND));
    g2d.draw(new Rectangle2D.Double(x, y, w - borderThickness, h - borderThickness));
    g2d.dispose();
}
```

And here is how the same code looks like with the Meteor-provided `Graphics.render` extension:

```kotlin
override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
    g.render {
        it.color = color
        it.fillRect(x, y, w, h)
        val borderThickness = 1.0f / NeonCortex.getScaleFactor().toFloat()
        it.color = color.darker()
        it.stroke = BasicStroke(borderThickness, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND)
        it.draw(Rectangle2D.Double(x.toDouble(), y.toDouble(),
                (w - borderThickness).toDouble(), (h - borderThickness).toDouble()))
    }
}
```

There is no more awkward dance caused by the backwards-compatible introduction of `Graphics2D` that is still there in the core Java even 20+ years after its introduction in 1998. And there is no more forgetting to `dispose()` on the `Graphics2D` object. 
