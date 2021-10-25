## Kotlin extensions for core Swing APIs

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-swing-ktx/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pushing-pixels/radiance-swing-ktx) `radiance-swing-ktx` for build instructions of the latest stable release.

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

### Tracking property changes

`Component.firePropertyChange` allows reporting bound property changes in a decoupled way. Here is how a custom Swing component might use it to track changes to a property:

```java
public class JColorSchemeList extends JComponent {
  private boolean isModified;

  public boolean isModified() {
    return isModified;
  }

  public void setModified(boolean isModified) {
    if (this.isModified == isModified) {
      return;
    }

    boolean old = this.isModified;
    this.isModified = isModified;
    this.firePropertyChange("modified", old, isModified);
  }
```

Now, elsewhere in the app there's code that gets notified whenever this property is modified:

```java
// track modification changes on the scheme list and any scheme in it
this.colorSchemeList.addPropertyChangeListener("modified", propertyChangeEvent -> {
    boolean isModified = (Boolean) propertyChangeEvent.getNewValue();
    RadianceThemingCortex.RootPaneScope.setContentsModified(getRootPane(), isModified);

    // update the main frame title
    updateMainWindowTitle(isModified);

    File currFile = colorSchemeList.getCurrentFile();
    saveButton.setEnabled(currFile != null);
});
```

Here we have boilerplate familiar to any Swing developer:
* Getter and setter for each bound property.
* Setter that returns early if the new value is the same as the current one.
* Setter that calls `firePropertyChange` with the temporarily saved old and the new values.
* Call to `addPropertyChangeListener` with the same exact string name for the bound property.
* Explicit cast of the property value (new and / or old) inside that listener.

What can we do to remove most, if not all, of this boilerplate? Let's start with the property itself and use Kotlin's observables:

```kotlin
class JColorSchemeList : JComponent() {
  var isModified: Boolean by Delegates.observable(false) {
      prop, old, new -> this.firePropertyChange(prop.name, old, new)
  }
```

This is all we need to wire property change to integrate with the existing Swing mechanism for notifying observers on property change with `firePropertyChange`. What about the observer side?

```kotlin
// track modification changes on the scheme list and any scheme in it
this.colorSchemeList.addTypedDelayedPropertyChangeListener<Boolean>(
        this.colorSchemeList::isModified) { evt ->
    val isModified = evt.newValue ?: false

    // update the close / X button of the main frame
    this.rootPane.setContentsModified(isModified)

    // update the main frame title
    updateMainWindowTitle(isModified)

    // update the enabled state of the "save" button
    saveButton.isEnabled = (colorSchemeList.currentFile != null)
}
```

Here we use Radiance's typed property change listener to introduce type safety into querying the property value. For type completeness and null safety we use Kotlin's elvis operator to fall back on `false`.

In addition, note the use of `::isModified` to make sure that both sides of the property change processing use the same underlying property name that will play well with codebase renaming and refactoring.

### Working with actions

Adding an action to a `JPopupMenu` in Java can look like this:

```java
JPopupMenu popupMenu = new JPopupMenu();
popupMenu.add(new AbstractAction("remove") {
    @Override
    public void actionPerformed(ActionEvent e) {
        zoomBubbles.remove(pressed.zoomBubble);
        repaint();
    }
});
```

With straightforward conversion to Kotlin the code becomes:

```kotlin
val popupMenu = JPopupMenu()
popupMenu.add(object : AbstractAction("remove") {
    override fun actionPerformed(e: ActionEvent) {
        zoomBubbles.remove(pressed.zoomBubble)
        repaint()
    }
})
```

And with Radiance it looks like this:

```kotlin
val popupMenu = JPopupMenu()
popupMenu.addAction("remove") {
    zoomBubbles.remove(pressed.zoomBubble)
    repaint()
}
```

Wiring key strokes to actions is a two-step process that requires matching string keys:

```java
this.captionEditor = new JTextField(25);

InputMap im = this.captionEditor.getInputMap();
im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enter");
im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "escape");

ActionMap am = this.captionEditor.getActionMap();
am.put("enter", new AbstractAction() {
    public void actionPerformed(ActionEvent ae) {
        stopCaptionEdit(true);
    }
});

am.put("escape", new AbstractAction() {
    public void actionPerformed(ActionEvent ae) {
        stopCaptionEdit(false);
    }
});
```

And with Radiance it becomes a streamlined, compact expression:

```kotlin
this.captionEditor = JTextField(25)

this.captionEditor.wireActionToKeyStroke("enter",
        KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0)) {
    stopCaptionEdit(true)
}
this.captionEditor.wireActionToKeyStroke("escape",
        KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0)) {
    stopCaptionEdit(false)
}
```

### Simple layout managers

The core Swing [LayoutManager](https://docs.oracle.com/javase/9/docs/api/java/awt/LayoutManager.html) and its extension [LayoutManager2](https://docs.oracle.com/javase/9/docs/api/java/awt/LayoutManager2.html) provide a lot of flexibility to write complex layout logic in your app. But what if you don't need that flexibility, and only looking to express something simple?

If we start with something as simple as wanting to put a custom close button in the top-right corner of our container, the resulting code in traditional Java might look like this:

```java
contentPane.setLayout(new LayoutManager() {
    @Override
    public void addLayoutComponent(String name, Component comp) {
    }

    @Override
    public void removeLayoutComponent(Component comp) {
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public void layoutContainer(Container parent) {
        int closeButtonDim = 35;
        closeButton.setBounds(getWidth() - closeButtonDim, 0,
                closeButtonDim, closeButtonDim);
        contentPanel.setBounds(0, 10, getWidth() - 10, getHeight() - 10);
    }
});
```

There's a lot of boilerplate that is added to just implement the `LayoutManager` interface, even if you only have custom logic for the `layoutContainer` method.

Here is how it looks like in Radiance:

```kotlin
contentPane.layout = RadianceLayoutManager(
        onLayout = {
            val closeButtonDim = 35
            closeButton.setBounds(width - closeButtonDim, 0,
                    closeButtonDim, closeButtonDim)
            contentPanel.setBounds(0, 10, width - 10, height - 10)
        })
```

For a slightly more complex logic that needs to compute the preferred size:

```kotlin
this.layout = RadianceLayoutManager(
        getPreferredSize = { parent ->
            ...  // compute preferred width and height
            Dimension(myPreferredWidth, myPreferredHeight)
        },
        onLayout = { parent ->
            ...  // compute child(ren) bounds
        })
```

### Rendering with `Graphics2D`

Here is how a custom `Icon` might implement a simple rectangular color fill in its `paintIcon`:

```java
@Override
public void paintIcon(Component c, Graphics g, int x, int y) {
    Graphics2D g2d = (Graphics2D) g.create();
    g2d.setColor(color);
    g2d.fillRect(x, y, w, h);
    float borderThickness = 1.0f / (float) RadianceCommonCortex.getScaleFactor();
    g2d.setColor(color.darker());
    g2d.setStroke(new BasicStroke(borderThickness, BasicStroke.CAP_ROUND,
            BasicStroke.JOIN_ROUND));
    g2d.draw(new Rectangle2D.Double(x, y, w - borderThickness, h - borderThickness));
    g2d.dispose();
}
```

And here is how the same code looks like with the Radiance-provided `Graphics.render` extension:

```kotlin
override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
    g.render {
        it.color = color
        it.fillRect(x, y, w, h)
        val borderThickness = 1.0f / RadianceCommonCortex.getScaleFactor().toFloat()
        it.color = color.darker()
        it.stroke = BasicStroke(borderThickness, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND)
        it.draw(Rectangle2D.Double(x.toDouble(), y.toDouble(),
                (w - borderThickness).toDouble(), (h - borderThickness).toDouble()))
    }
}
```

There is no more awkward dance caused by the backwards-compatible introduction of `Graphics2D` that is still there in the core Java even 20+ years after its introduction in 1998. And there is no more forgetting to `dispose()` on the `Graphics2D` object.
