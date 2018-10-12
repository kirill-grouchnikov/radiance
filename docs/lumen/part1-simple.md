
## Lumen - window structure and simple animations

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/lumen/lumen-main.png" width="594" height="284" border=0>

Lumen main window is a non-rectangular surface with translucent painting and overlapping components. Here is a short walkthrough of the matching class:

```java
public class MainWindow extends JFrame {
   AlbumOverviewPanel contentPanel;

   CloseButton closeButton;
```

It is a regular Swing `JFrame` with two components – the content panel and the close button. Let’s take a look at the constructor of this frame:

```java
public MainWindow() {
   super("Lumen");
   this.setUndecorated(true);
   this.setBackground(new Color(0, 0, 0, 0));
```

It starts with setting the title for this frame, which is useful for identifying it in the taskbar. The next two lines set the frame to be undecorated (without the usual title pane) and translucent – setting the background color to a completely transparent color.

Next, we add the two components and set their Z order to have the close button painted last:

```java
   this.contentPanel = new AlbumOverviewPanel();
   this.closeButton = new CloseButton();

   Container contentPane = this.getContentPane();
   contentPane.add(this.contentPanel);
   contentPane.add(this.closeButton);

   contentPane.setComponentZOrder(this.contentPanel, 1);
   contentPane.setComponentZOrder(this.closeButton, 0);
```

Next, we create a custom layout manager that sets the bounds for these two components. The close button is displayed in the top right corner, and the album overview panel spans the available size minus 10 pixels on top and on right:

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

Finally, we set the frame size and center it in the screen (ignore the window focus listener for now, it will be explained later):

```java
   this.setSize(560, 250);
   this.setLocationRelativeTo(null);
}
```

This is it for the constructor. Now let’s take a look at the implementation of the close button. The close button has a rollover animation that displays a blueish outline and inner cross on acquiring the mouse.

It is an extension of the JButton class with a float field that stores the current alpha channel:

```java
public class CloseButton extends JButton {
   /**
    * The alpha value of this button. Is updated in the fade-in timeline which
    * starts when this button becomes a part of the host window hierarchy.
    */
   float alpha;
```
The code uses the foreground attribute of the `JComponent` class and the matching `setForeground` method to provide the rollover animation. Let’s take a look at the constructor of the close button:

```java
public CloseButton() {
   // mark the button as non-opaque since it will be
   // round shaped and translucent
   this.setOpaque(false);
   this.setForeground(new Color(158, 205, 255));
   this.alpha = 0.0f;
```
It first marks the button as non-opaque and initializes the foreground to light blue. Then it sets the current alpha to zero so that we will fade in the button when it first appears on the screen. Next we add an action listener to close the ancestor window when this button is activated:

```java
this.addActionListener((ActionEvent e) -> {
    SwingUtilities.invokeLater(() -> {
        // dispose the host window
        Window windowAncestor = SwingUtilities.getWindowAncestor(CloseButton.this);
        LumenUtils.fadeOutAndDispose(windowAncestor, 500);
    });
});
```
Now it’s time to create a rollover timeline that will interpolate the foreground color of the button (note how here we are relying on the presence of the `JComponent.setForeground` API):

```java
// timeline for the rollover effect (interpolating the
// button's foreground color)
final Timeline rolloverTimeline = new Timeline(this);
rolloverTimeline.addPropertyToInterpolate("foreground", new Color(158, 205, 255),
   new Color(64, 140, 255));
rolloverTimeline.setDuration(200);
```
And wire it to the mouse events on the button:

```java
// and register a mouse listener to play the rollover
// timeline
this.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseEntered(MouseEvent e) {
      rolloverTimeline.play();
   }

   @Override
   public void mouseExited(MouseEvent e) {
      rolloverTimeline.playReverse();
   }
});
```
Here, we are using the built-in Trident functionality that detects the current state of the timeline when the application code asks to play it forward or reverse. Suppose it takes two seconds to play a timeline, and you move the mouse out after one second. In this case, you do want the timeline to play back from its current position – and the other way around. Trident provides this functionality out of the box, and you do not need any additional application code or configuration.

Finally, we are going to add an hierarchy listener to fade in the button when it first is added to the window hierarchy:

```java
// fade in the component once it's part of the window
// hierarchy
this.addHierarchyListener((HierarchyEvent e) -> {
    Timeline shownTimeline = new Timeline(CloseButton.this);
    shownTimeline.addPropertyToInterpolate("alpha", 0.0f, 1.0f);
    shownTimeline.addCallback(new Repaint(CloseButton.this));
    shownTimeline.setDuration(500);
    shownTimeline.play();
});
```
Here, we also need a public setter for the alpha property since it is used in this timeline:

```java
/**
 * Sets the alpha value. Used by the fade-in timeline.
 *
 * @param alpha
 *            Alpha value for this button.
 */
public void setAlpha(float alpha) {
   this.alpha = alpha;
}
```
Now that the button has been configured to fade in on appearance and interpolate its foreground on acquiring the mouse, we need to provide the custom painting based on these two values (alpha and foreground). We start with overriding the paintBorder to do nothing:

```java
@Override
protected void paintBorder(Graphics g) {
   // overriden to remove the default border painting
}
```
And continue with the custom paintComponent method:

```java
@Override
protected void paintComponent(Graphics g) {
   Graphics2D g2d = (Graphics2D) g.create();

   g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
      RenderingHints.VALUE_ANTIALIAS_ON);

   // use the current alpha
   g2d.setComposite(AlphaComposite.SrcOver.derive(this.alpha));
```
Here, after switching the anti-alias on, we are setting the composite based on the current alpha value. The rest of the painting operations will be affected by this alpha:

```java
   // paint the background - black fill and a dark outline
   // based on the current foreground color
   Shape contour = new Ellipse2D.Double(1, 1, getWidth() - 3,
      getHeight() - 3);
   g2d.setColor(Color.black);
   g2d.setStroke(new BasicStroke(2.0f));
   g2d.fill(contour);
   g2d.setColor(this.getForeground().darker().darker());
   g2d.draw(contour);

   // paint the outer cross (always white)
   g2d.setColor(Color.white);
   g2d.setStroke(new BasicStroke(6.0f, BasicStroke.CAP_ROUND,
      BasicStroke.JOIN_ROUND));
   int offset = getWidth() / 3;
   g2d.drawLine(offset, offset, getWidth() - offset - 1, getHeight()
      - offset - 1);
   g2d.drawLine(getWidth() - offset - 1, offset, offset, getHeight()
      - offset - 1);
```
This code paints the black background and the white outer cross. Note how here we are using the current foreground color for the outer contour of the button – since setForeground calls repaint inside, on every step of the rollover timeline the foreground will be changed, and the paintComponent method will be called – effectively animating the outer contour from white to blue on mouse enter and from blue to white on mouse exit.

```java
   // paint the inner cross (using the current foreground color)
   g2d.setColor(this.getForeground());
   g2d.setStroke(new BasicStroke(4.2f, BasicStroke.CAP_ROUND,
      BasicStroke.JOIN_ROUND));
   g2d.drawLine(offset, offset, getWidth() - offset - 1, getHeight()
      - offset - 1);
   g2d.drawLine(getWidth() - offset - 1, offset, offset, getHeight()
      - offset - 1);

   g2d.dispose();
}
```
Here we are painting the inner cross using the current foreground color – once again providing a smooth animated indication of acquiring or losing the mouse.

Now it is time to go back to the main window to show how it is disposed. Remember that this is the code in the close button:

```java
this.addActionListener((ActionEvent e) -> {
    SwingUtilities.invokeLater(() -> {
        // dispose the host window
        Window windowAncestor = SwingUtilities.getWindowAncestor(CloseButton.this);
        LumenUtils.fadeOutAndDispose(windowAncestor, 500);
    });
});
```

The helper `LumenUtils.fadeOutAndDispose` looks like this:

```java
public static void fadeOutAndDispose(final Window window,
        int fadeOutDuration) {
    Timeline dispose = new Timeline(window);

    dispose.addPropertyToInterpolate(Timeline.<Float>property("opacity").from(1.0f).to(0.0f));
    dispose.addCallback(new UIThreadTimelineCallbackAdapter() {
        @Override
        public void onTimelineStateChanged(TimelineState oldState,
                TimelineState newState, float durationFraction,
                float timelinePosition) {
            if (newState == TimelineState.DONE) {
                window.dispose();
            }
        }
    });
    dispose.setDuration(fadeOutDuration);
    dispose.play();
}
```

Instead of abruptly hiding the window, it fades it out over the given period of time using `Window.setOpacity` API - conveniently wrapped by Trident as the `opacity` property. We start a new timeline that interpolates this synthetic property, which effectively fades out the window. Once the timeline is done, we call `Window.dispose`.

Here we have seen how easy it is to add simple animation behavior to such scenarios as component appearance (fade in), rollovers and window disposal (fade-out) using built in and custom class attributes and setters. The next entry is going to show to talk about the base implementation of the album overview panel and the load progress animation.
