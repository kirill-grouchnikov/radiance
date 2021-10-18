
## Lumen - album art loading

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/lumen/lumen-main.png" width="594" height="284" border=0>

This entry will talk about loading the album art matching the specific search string and asynchronous display of the associated images. Each album item displays the following:

* Album art image
* Album title
* Album release date

When the application starts, it sends a query to the MusicBrainz backend and displays the load progress indication while the query is processed. When the query results are returned, the application adds an album overview component for each one of the results (details in the [next part](part5-scrolling.md)). However, there is one more step that needs to be done.

The query results do not contain the actual images, but rather the URLs pointing at those images. The application sends an additional request for each one of those URLs (hosted on Amazon), but we do not want the user to wait until all those images have been downloaded and scaled (if necessary). Instead, an album overview panel is immediately added to the main container, and a image begins loading. Once the image is loaded, it is scaled and then faded in in the matching component.

Here is a walkthrough for the relevant application class:
```java
public class AlbumOverviewComponent extends JComponent {
	/**
	 * The dimensions of the overview image.
	 */
	public static final int OVERVIEW_IMAGE_DIM = 132;

	/**
	 * The original album art.
	 */
	private BufferedImage image;

	/**
	 * Indicates whether the image loading is done.
	 */
	private boolean imageLoadedDone;

	/**
	 * The alpha value of the image. Is updated in the fade-in timeline which
	 * starts after the image has been successfully loaded and scaled.
	 */
	private float imageAlpha;

  /**
   * The alpha value of the border. Is updated in the fade-in timeline which
   * starts when the mouse moves over this component.
   */
  private float borderAlpha;
```
These fields store the image itself, the alpha value (while the image is faded-in) and boolean indication that the image is available for painting. The later is needed to mark the end of loading and scaling stage.

We also have fields that store the overall component alpha, as well as the album caption and price:
```java
	/**
	 * The album caption.
	 */
	private String caption;

	/**
	 * The album release date.
	 */
	private String releaseDate;

	/**
	 * The alpha value of this component. Is updated in the fade-in timeline
	 * which starts when this component becomes a part of the host window
	 * hierarchy.
	 */
	private float alpha;
```
and a few static fields for the layout purposes:

```java
/**
 * Default width of this component.
 */
public static final int DEFAULT_WIDTH = 160;

/**
 * Default height of this component.
 */
public static final int DEFAULT_HEIGHT = 200;

/**
 * Component insets.
 */
private static final int INSETS = 8;
```
Here is the constructor that creates a new album overview component from the album description:

```java
/**
 * Creates a new component that shows overview information on the specified
 * album.
 *
 * @param albumItem
 *            Information on an album.
 */
public AlbumOverviewComponent(final SearchResultRelease albumItem) {
  this.caption = albumItem.title;
  this.releaseDate = albumItem.date;
  this.imageLoadedDone = false;
  this.imageAlpha = 0.0f;

  this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
  this.setOpaque(false);
  this.alpha = 0.0f;

  this.addHierarchyListener(hierarchyEvent ->
      SwingComponentTimeline.componentBuilder(AlbumOverviewComponent.this)
          .addPropertyToInterpolate("alpha", 0.0f, 1.0f)
          .addCallback(new SwingRepaintCallback(AlbumOverviewComponent.this))
          .setDuration(1000)
          .play());

  final Timeline rolloverTimeline = SwingComponentTimeline.componentBuilder(this)
      .addPropertyToInterpolate("borderAlpha", 0.0f, 0.6f)
        .addCallback(new SwingRepaintCallback(AlbumOverviewComponent.this))
      .setEase(new Spline(0.7f))
      .setDuration(800)
      .build();
  this.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
          rolloverTimeline.playLoop(RepeatBehavior.REVERSE);
      }

      @Override
      public void mouseExited(MouseEvent e) {
          rolloverTimeline.playReverse();
      }
  });
  this.addComponentListener(new ComponentAdapter() {
      @Override
      public void componentResized(ComponentEvent e) {
          if (borderAlpha > 0.0f) {
              rolloverTimeline.playReverse();
          }
      }
  });

  this.labelFont = RadianceCommonCortex.getDefaultFontPolicy().getFontSet().getControlFont();

  SwingUtilities.invokeLater(() -> getLoadImageScenario(albumItem).play());
}
```
Here, we:

* Set the title and the release date from the album item fetched from MusicBrainz.
* Set the alphas to zero.
* Add a listener to fade in the component once it's added to the window hierarchy (as in the previous entries)
* Add a rollover listener to show a "glowing" border
* Get the timeline scenario that will load, scale and fade in the image and play it – see below.

The most interesting code is in the `getLoadImageScenario`. It returns a Radiance timeline scenario that has the following sequential steps:

* Load the `BufferedImage` from the specified `URL`. This is done with a `TimelineSwingWorker`.
* Scale the loaded image to fit the available dimensions. This is done with a `TimelineRunnable`.
* Fade in the scaled image. This is done with a `Timeline`.

Let’s see the code of this method:

```java
/**
 * Returns the timeline scenario that loads, scaled and fades in the
 * associated album art.
 *
 * @param albumItem
 *            Album item.
 * @return The timeline scenario that loads, scaled and fades in the
 *         associated album art.
 */
private TimelineScenario getLoadImageScenario(final SearchResultRelease albumItem) {
	TimelineScenario loadScenario = new TimelineScenario.Sequence();
```
It creates a sequential timeline scenario. This is a utility that allows specifying a sequence of timelines, swing workers and runnables and have them run one after another – each one waiting until the previously added one has finished.

First up is the wrapped `SwingWorker` that loads the image:

```java
// load the image
TimelineSwingWorker imageLoadWorker =
		new TimelineSwingWorker() {
	@Override
	protected Void doInBackground() throws Exception {
		image = BackendConnector.getLargeAlbumArt(albumItem.asin);
		return null;
	}
};
loadScenario.addScenarioActor(imageLoadWorker);
```
The next one is the image scaler. Note that for very large images it would be better to have this as a SwingWorker as well. However, in this particular case we are using the “medium” album art images which will not be overly big, and we would be needlessly hogging SwingWorkers that are better suited to long image loading operations.

```java
// scale if necessary
TimelineRunnable scaler = new TimelineRunnable() {
	@Override
	public void run() {
		if (image != null) {
      float vFactor = (float) OVERVIEW_IMAGE_DIM / (float) image.getHeight();
      float hFactor = (float) OVERVIEW_IMAGE_DIM / (float) image.getWidth();
      float factor = Math.min(1.0f, Math.min(vFactor, hFactor));
      if (factor < 1.0f) {
          // scaled to fit available area
          image = RadianceCommonCortex.createThumbnail(image,
                  (int) (factor * image.getWidth()));
      }

      imageLoadedDone = true;
		}
	}
};
loadScenario.addScenarioActor(scaler);
```
Finally, we add a timeline to fade in the scaled image:

```java
// and fade it in
loadScenario.addScenarioActor(Timeline.builder(AlbumOverviewComponent.this)
		.addPropertyToInterpolate("imageAlpha", 0.0f, 1.0f)
		.addCallback(new SwingRepaintCallback(AlbumOverviewComponent.this))
		.setDuration(500)
		.build());

return loadScenario;
```
Now we need a couple of public setters for the alpha attributes (so that the main Radiance animation engine can interpolate them):

```java
/**
 * Sets the alpha value for the image. Used by the image fade-in timeline.
 *
 * @param imageAlpha
 *            Alpha value for the image.
 */
public void setImageAlpha(float imageAlpha) {
	this.imageAlpha = imageAlpha;
}

/**
 * Sets the alpha value. Used by the fade-in timeline.
 *
 * @param alpha
 *            Alpha value for this component.
 */
public void setAlpha(float alpha) {
	this.alpha = alpha;
}
```
And finally, the custom painting:

```java
@Override
protected void paintComponent(Graphics g) {
  Graphics2D g2d = (Graphics2D) g.create();

  g2d.setComposite(AlphaComposite.SrcOver.derive(this.alpha));

  g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
          RenderingHints.VALUE_ANTIALIAS_ON);
  g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
          RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

  g2d.setPaint(new GradientPaint(0, 0, new Color(0, 0, 0, 196), 0,
          DEFAULT_HEIGHT, new Color(0, 0, 0, 0)));
  g2d.fillRoundRect(0, 0, DEFAULT_WIDTH - 1, DEFAULT_HEIGHT - 1, 18, 18);
  g2d.drawRoundRect(0, 0, DEFAULT_WIDTH - 1, DEFAULT_HEIGHT - 1, 18, 18);

  if (this.borderAlpha > 0.0f) {
      // show the pulsating bluish outline of the rollover album
      g2d.setComposite(AlphaComposite.SrcOver.derive(this.alpha * this.borderAlpha));
      g2d.setPaint(new GradientPaint(0, 0, new Color(64, 140, 255, 196),
              0, DEFAULT_HEIGHT, new Color(64, 140, 255, 0)));
      g2d.setStroke(new BasicStroke(2.0f, BasicStroke.CAP_ROUND,
              BasicStroke.JOIN_ROUND));
      g2d.drawRoundRect(1, 1, DEFAULT_WIDTH - 2, DEFAULT_HEIGHT - 2, 17, 17);
      g2d.setStroke(new BasicStroke(1.0f));
      g2d.setComposite(AlphaComposite.SrcOver.derive(this.alpha));
  }

  int contentHorizontalOffset = INSETS;
  if (this.imageLoadedDone) {
      Graphics2D g2dImage = (Graphics2D) g2d.create();
      g2dImage.setComposite(AlphaComposite.SrcOver.derive(this.alpha * this.imageAlpha));

      // draw the album art image
      double scaleFactor = RadianceCommonCortex.getScaleFactor();
      int imageWidth = this.image.getWidth();
      int imageHeight = this.image.getHeight();
      contentHorizontalOffset = (int) ((this.getWidth() - imageWidth / scaleFactor) / 2);
      int offsetY = INSETS + (int) ((OVERVIEW_IMAGE_DIM - imageHeight / scaleFactor) / 2);
      g2dImage.drawImage(this.image, contentHorizontalOffset, offsetY,
              (int) (imageWidth / scaleFactor), (int) (imageHeight / scaleFactor), null);
      g2dImage.dispose();
  }

  g2d.setColor(Color.white);
  g2d.setFont(this.labelFont);

  FontMetrics fontMetrics = g2d.getFontMetrics();
  int textY = INSETS + OVERVIEW_IMAGE_DIM + fontMetrics.getHeight();
  int textWidth = DEFAULT_WIDTH - 2 * contentHorizontalOffset;
  LumenUtils.paintMultilineText(g2d, this.caption, contentHorizontalOffset,
          textWidth, textY, 2);

  g2d.setColor(new Color(64, 140, 255));
  LumenUtils.paintMultilineText(g2d, this.releaseDate, contentHorizontalOffset, textWidth,
          textY + 2 * g2d.getFontMetrics().getHeight(), 1);

  g2d.dispose();
}
```
A few points about the painting:

* The current alpha values are used to provide the overall and image fade in effects
* The image is painted only when the `imageLoadedDone` is true
* The `OnyxUtils.paintMultilineText` is a helper method to paint a multiline text

Here we have seen how to load the album art matching the specific search string and asynchronously display the associated images.
