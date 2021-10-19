
## Load progress

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/animation/musicapp/musicapp-loading.png" width="594" height="284" border=0>

While the previous part showed the code for the main window and the close button, it's now time to look at the main album overview panel. For the demo purposes, the code is built in a layered fashion, with each layer adding more functional and animation behavior.

We start with the base class (already mentioned in the previous part) that provides the container translucency, fade in on becoming part of the host window and mouse drag:

```java
public class Stage0Base extends JComponent {
   /**
    * The alpha value for this container. Is updated in the fade-in timeline
    * which starts when this container becomes a part of the host window
    * hierarchy.
    */
   float alpha;

   /**
    * Creates the basic container.
    */
   public Stage0Base() {
      this.setOpaque(false);
      this.alpha = 0.0f;
```
As in the previous entry, we have a non-opaque component with an alpha attribute set to zero during the initialization. To fade it in, we create a simple timeline that interpolates the alpha to 75% once the component becomes part of the window hierarchy:
```java
      // fade in the container once it's part of the window
      // hierarchy
      this.addHierarchyListener(hierarchyEvent ->
            Timeline.builder(Stage0Base.this)
                  .addPropertyToInterpolate("alpha", 0.0f, 0.9f)
                  .addCallback(new SwingRepaintCallback(Stage0Base.this))
                  .setDuration(500)
                  .play());
   }
```
As with most modern non-rectangular application, the main demo allows dragging the main window by simply grabbing it with the mouse. To do this we add the following mouse adapter:

```java
// mouse listener for dragging the host window
MouseAdapter adapter = new MouseAdapter() {
   int lastX;
   int lastY;

   @Override
   public void mousePressed(MouseEvent e) {
      Component source = (Component) e.getSource();

      Point eventLocationOnScreen = e.getLocationOnScreen();
      if (eventLocationOnScreen == null) {
         eventLocationOnScreen = new Point(e.getX()
            + source.getLocationOnScreen().x, e.getY()
            + source.getLocationOnScreen().y);
      }

      lastX = eventLocationOnScreen.x;
      lastY = eventLocationOnScreen.y;
   }

   @Override
   public void mouseDragged(MouseEvent e) {
      Component source = (Component) e.getSource();

      Point eventLocationOnScreen = e.getLocationOnScreen();
      if (eventLocationOnScreen == null) {
         eventLocationOnScreen = new Point(e.getX()
            + source.getLocationOnScreen().x, e.getY()
            + source.getLocationOnScreen().y);
      }

      int dx = eventLocationOnScreen.x - lastX;
      int dy = eventLocationOnScreen.y - lastY;
      Window win = SwingUtilities.getWindowAncestor(Stage0Base.this);
      Point loc = win.getLocation();
      win.setLocation(loc.x + dx, loc.y + dy);
      lastX = eventLocationOnScreen.x;
      lastY = eventLocationOnScreen.y;
   }
};
this.addMouseListener(adapter);
this.addMouseMotionListener(adapter);
```
We add a public setter for the alpha attribute so that it can be interpolated by Radiance:

```java
   public void setAlpha(float alpha) {
      this.alpha = alpha;
   }
```
and implement the painting based on the current alpha value:

```java
   @Override
   protected void paintComponent(Graphics g) {
      Graphics2D g2d = (Graphics2D) g.create();

      ...
      g2d.setComposite(AlphaComposite.SrcOver.derive(this.alpha));
      g2d.clipRect(0, TITLE_HEIGHT, getWidth(), getHeight() - TITLE_HEIGHT + 1);

      g2d.setColor(new Color(0, 0, 0));
      g2d.fill(contour);
      g2d.setPaint(new GradientPaint(0, TITLE_HEIGHT, new Color(57, 56, 57),
              0, getHeight() - TITLE_HEIGHT, new Color(50, 48, 50)));
      g2d.draw(innerContour);
      g2d.setPaint(new GradientPaint(0, TITLE_HEIGHT, new Color(13, 11, 15),
              0, getHeight() - TITLE_HEIGHT, new Color(15, 8, 13)));
      g2d.draw(contour);
      ...
      g2d.dispose();
   }
```
The next layer (in `Stage1Loading`) adds the load progress indication.

There are two separate attributes that control the load progress animation. The first controls the alpha, fading the load progress in on load start and fading it out on load end. The second controls the stripes offset and is responsible for creating a continuous indefinite appearance of "marching ants" progress. Each one is controlled by a separate timeline, and here we need to synchronize these two timelines:

* On load start, we start both timelines.
* On load end, we start the fade out timeline, and once it's done, we cancel the looping "marching ants" timeline.

We start with the definitions of these two attributes and the matching timelines:

```java
public class Stage1LoadingProgress extends Stage0Base {
   /**
    * The looping timeline to animate the indefinite load progress. When
    * {@link #setLoading(boolean)} is called with true, this
    * timeline is started. When {@link #setLoading(boolean)} is called with
    * false, this timeline is cancelled at the end of the
    * {@link #loadingBarFadeTimeline}.
    */
   Timeline loadingBarLoopTimeline;

   /**
    * The current position of the {@link #loadingBarLoopTimeline}.
    */
   float loadingBarLoopPosition;

   /**
    * The timeline for showing and hiding the loading progress bar. When
    * {@link #setLoading(boolean)} is called with true, this
    * timeline is started. When {@link #setLoading(boolean)} is called with
    * false, this timeline is started in reverse.
    */
   Timeline loadingBarFadeTimeline;

   /**
    * The current alpha value of the loading progress bar. Is updated by the
    * {@link #loadingBarFadeTimeline}.
    */
   float loadingBarAlpha;
```
and define the pixel dimensions of the load progress

```java
   /**
    * The pixel width of the load progress visuals.
    */
   private static final int PROGRESS_WIDTH = 300;

   /**
    * The pixel height of the load progress visuals.
    */
   private static final int PROGRESS_HEIGHT = 32;
```
Now it's time to initialize the attributes:

```java
public Stage1LoadingProgress() {
   super();

   this.loadingBarAlpha = 0.0f;

   // create the looping timeline
   this.loadingBarLoopTimeline = Timeline.builder(this)
        .addPropertyToInterpolate("loadingBarLoopPosition", 0.0f, 1.0f)
        .addCallback(new TimelineCallbackAdapter() {
            @Override
            public void onTimelinePulse(float durationFraction,
                       float timelinePosition) {
                // don't repaint the whole window
                int x = (getWidth() - PROGRESS_WIDTH) / 2;
                int y = (getHeight() - PROGRESS_HEIGHT) / 2;
                Stage1LoadingProgress.this.repaint(x - 5, y - 5,
                        PROGRESS_WIDTH + 10, PROGRESS_HEIGHT + 10);
            }
        })
        .setDuration(750)
        .build();
```
This initializes the stripe location value to zero, and configures the looping timeline to interpolate it from zero to one. Later on this timeline will be played in an indefinite loop (cancelled once the load is done), and together with the matching painting code will result in a continuous visual appearance of indefinitely moving stripes. Note a custom repaint callback that only repaints the "dirty" area of the load progress, resulting in better CPU utilization during the load stage.

Now, it's time to initialize the fading timeline:

```java
// create the fade timeline
this.loadingBarFadeTimeline = Timeline.builder(this)
    .addPropertyToInterpolate("loadingBarAlpha", 0.0f, 1.0f)
    .addCallback(new TimelineCallbackAdapter() {
        @Override
        public void onTimelineStateChanged(TimelineState oldState,
              TimelineState newState, float durationFraction,
              float timelinePosition) {
            if (oldState == TimelineState.PLAYING_REVERSE
                    && newState == TimelineState.DONE) {
                // after the loading progress is faded out, stop the loading
                // animation
                loadingBarLoopTimeline.cancel();
            }
        }
    })
    .setDuration(500)
    .build();
```
In addition to interpolating the alpha value, it also cancels the looping timeline when the state changes from PLAYING_REVERSE to DONE – this signifies the end of the fade out sequence.

Adding the simple setters for the two float attributes:

```java
/**
 * Sets the new alpha value of the loading progress bar. Is called by the
 * {@link #loadingBarFadeTimeline}.
 *
 * @param loadingBarAlpha
 *            The new alpha value of the loading progress bar.
 */
public void setLoadingBarAlpha(float loadingBarAlpha) {
   this.loadingBarAlpha = loadingBarAlpha;
}

/**
 * Sets the new loop position of the loading progress bar. Is called by the
 * {@link #loadingBarLoopTimeline}.
 *
 * @param loadingBarLoopPosition
 *            The new loop position of the loading progress bar.
 */
public void setLoadingBarLoopPosition(float loadingBarLoopPosition) {
   this.loadingBarLoopPosition = loadingBarLoopPosition;
}
```
it's time for a very simple implementation of load state change:

```java
 /**
  * Starts or stops the loading progress animation.
  *
  * @param isLoading
  *            if true, this container will display a loading
  *            progress animation, if false, the loading
  *            progress animation will be stopped.
  */
public void setLoading(boolean isLoading) {
   if (isLoading) {
      this.loadingBarFadeTimeline.play();
      this.loadingBarLoopTimeline.playLoop(RepeatBehavior.LOOP);
   } else {
      this.loadingBarFadeTimeline.playReverse();
   }
}
```
As said before, on load start both timelines start playing (note that the second one is played in a loop). On load end, the fade timeline is played in reverse – once it's done, it will cancel the second looping timeline in the listener registered in its initialization.

Finally, the painting code respects both the alpha and the looping position. Note that it is done in the `paintChildren` method ensuring that the load progress is painted on top of all children:

```java
@Override
protected void paintChildren(Graphics g) {
   super.paintChildren(g);

   if (this.loadingBarAlpha > 0.0f) {
      // paint the load progress over the children
      int x = (getWidth() - PROGRESS_WIDTH) / 2;
      int y = (getHeight() - PROGRESS_HEIGHT) / 2;

      Graphics2D g2d = (Graphics2D) g.create();
      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
      g2d.setComposite(AlphaComposite.SrcOver
            .derive(this.loadingBarAlpha));

      Shape currClip = g2d.getClip();
      g2d.clip(new RoundRectangle2D.Double(x, y, PROGRESS_WIDTH,
            PROGRESS_HEIGHT, 8, 8));
      g2d.setPaint(new LinearGradientPaint(x, y, x, y + PROGRESS_HEIGHT,
           new float[] { 0.0f, 0.49999f, 0.5f, 1.0f },
           new Color[] {
               new Color(156, 208, 221), new Color(101, 183, 243),
               new Color(67, 169, 241), new Color(138, 201, 247) }));
      g2d.fillRect(x, y, PROGRESS_WIDTH, PROGRESS_HEIGHT);

      int stripeCellWidth = 25;
      g2d.setPaint(new LinearGradientPaint(x, y, x, y + PROGRESS_HEIGHT,
         new float[] { 0.0f, 0.49999f, 0.5f, 1.0f },
         new Color[] {
               new Color(36, 155, 239), new Color(17, 145, 238),
               new Color(15, 56, 200), new Color(3, 133, 219) }));
      g2d.setStroke(new BasicStroke(9.0f));
      for (int stripeX = x + (int) (this.loadingBarLoopPosition * stripeCellWidth);
           stripeX < x + PROGRESS_WIDTH + PROGRESS_HEIGHT;
           stripeX += stripeCellWidth) {
         g2d.drawLine(stripeX, y, stripeX - stripeCellWidth, y
               + PROGRESS_HEIGHT);
      }

      g2d.setClip(currClip);

      g2d.setColor(Color.lightGray);
      g2d.setStroke(new BasicStroke(1.3f));
      g2d.drawRoundRect(x, y, PROGRESS_WIDTH, PROGRESS_HEIGHT, 8, 8);

      g2d.dispose();
   }
}
```
Each load progress stripe is painted as a thick diagonal line, and the X offset of the first stripe is computed based on the current position of the looping timeline. The `stripeCellWidth` value indicates the horizontal distance between two adjacent stripes, and multiplying it by the current position of the looping timeline results in continuous indefinite progress:

```java
for (int stripeX = x + (int) (this.loadingBarLoopPosition * stripeCellWidth);
     stripeX < x + PROGRESS_WIDTH + PROGRESS_HEIGHT;
     stripeX += stripeCellWidth) {
   g2d.drawLine(stripeX, y, stripeX - stripeCellWidth, y
         + PROGRESS_HEIGHT);
}
```
