
## Lumen - complex scenarios

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/master/docs/images/lumen/lumen-album.png" width="452" height="226" border=0>

This entry will talk about displaying larger album art and scrollable track listing when the specific album is selected, along with a complex transition between selected albums.

The full transition scenario that is played when the user selects a specific album has six steps:

1. (Relevant when the details window already shows album art) – collapse the album art component and track listing component to fully overlap.
2. (In parallel with step 1) – load the new album art from Amazon-hosted URL.
3. (In parallel with steps 1 and 2) – load the track listing from MusicBrainz.
4. (After steps 1, 2 and 3 have all completed) – set the loaded album art on the album art component. This may also cause resizing the album art if it cannot fully fit in the available space.
5. (In parallel with step 4) – set the list of album tracks on the track listing component.
6. (After steps 4 and 5 have both completed) – cross fade the old album art to the new album art.
7. (After step 6 has been completed) – move the album art component (that displays the new album art) and the track listing to be displayed side by side.

To implement this complex timeline scenario, the code uses the rendezvous timeline scenario provided by Trident. `Timeline.RendezvousSequence` allows simple branch-and-wait ordering. The rendezvous scenario has a stage-like approach. All actors belonging to the same stage run in parallel, while actors in stage N+1 wait for all actors in stage N to be finished. The `RendezvousSequence.rendezvous` marks the end of one stage and the beginning of another.

Here is how the code looks like:

```java
/**
 * Returns the timeline scenario that implements a transition from the
 * currently shown album item (which may be null) to the
 * specified album item.
 *
 * @param albumItem
 *            The new album item to be shown in this window.
 * @return The timeline scenario that implements a transition from the
 *         currently shown album item (which may be null) to
 *         the specified album item.
 */
private TimelineScenario getShowAlbumDetailsScenario(final SearchResultRelease albumItem) {
	TimelineScenario.RendezvousSequence scenario = new TimelineScenario.RendezvousSequence();

	// step 1 - move album art and track listing to the same location
	Timeline collapseArtAndTracks = Timeline.builder(this)
		.addPropertyToInterpolate("overlayPosition", this.overlayPosition, 0.0f)
		.setDuration((int) (500 * this.overlayPosition))
		.build();
	scenario.addScenarioActor(collapseArtAndTracks);

	// step 2 (in parallel) - load the new album art
	final BufferedImage[] albumArtHolder = new BufferedImage[1];
	TimelineSwingWorker loadNewAlbumArt = new TimelineSwingWorker() {
		@Override
		protected Void doInBackground() throws Exception {
			albumArtHolder[0] = BackendConnector.getLargeAlbumArt(album.asin);
			return null;
		}
	};
	scenario.addScenarioActor(loadNewAlbumArt);
	scenario.rendezvous();

	// step 3 (in parallel) - load the track listing
	final java.util.List<Track> tracks = new ArrayList<>();
	TimelineSwingWorker<Void, Void> loadNewAlbumTrackList =
        new TimelineSwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                tracks.addAll(BackendConnector.doTrackSearch(album.id));
                return null;
            }
        };
	scenario.addScenarioActor(loadNewAlbumTrackList);
	scenario.rendezvous();

	// step 4 (wait for steps 1-3) - replace album art
	TimelineRunnable replaceAlbumArt = new TimelineRunnable() {
        @Override
        public void run() {
            albumArt.setAlbumArtImage(albumArtHolder[0]);
        }
	};
	scenario.addScenarioActor(replaceAlbumArt);

	// step 5 (in parallel) - replace the track listing
	TimelineRunnable replaceTrackListing = new TimelineRunnable() {
        @Override
        public void run() {
            trackListingScroller.setAlbumItem(album, tracks);
        }
	};
	scenario.addScenarioActor(replaceTrackListing);
	scenario.rendezvous();

	// step 6 (wait for steps 4 and 5) - cross fade album art from old to new
	Timeline albumArtCrossfadeTimeline = Timeline.builder(this.albumArt)
		.addPropertyToInterpolate("oldImageAlpha", 1.0f, 0.0f)
		.addPropertyToInterpolate("imageAlpha", 0.0f, 1.0f)
		.addCallback(new SwingRepaintCallback(this.albumArt))
		.setDuration(400)
		.build();

	scenario.addScenarioActor(albumArtCrossfadeTimeline);
	scenario.rendezvous();

	// step 7 (wait for step 6) - move new album art and track listing to
	// be side by side.
	Timeline separateArtAndTracks = Timeline.builder(this)
		.addPropertyToInterpolate("overlayPosition", 0.0f, 1.0f)
		.setDuration(500)
		.build();
	scenario.addScenarioActor(separateArtAndTracks);

	return scenario;
}
```

This scenario uses the full capabilities offered by the Trident timeline scenarios which allow combining multiple timeline scenario actors in a parallel, sequential or custom order. There are three core types of timeline scenario actors, all used in this code:

* `Timeline`
* `TimelineSwingWorker` – extension of `SwingWorker`
* `TimelineRunnable` – extension of `Runnable`

To create a custom timeline scenario, use the following APIs of the `TimelineScenario` class:

* `public void addScenarioActor(TimelineScenarioActor actor)`` adds the specified actor
* `public void addDependency(TimelineScenarioActor actor, TimelineScenarioActor... waitFor)`` specifies the dependencies between the actors

The rest of the code is pretty straightforward. It defines the components for album art and track listing, as well as the float position of the overlay between them (during the collapse / expand steps):

```java
/**
 * Component that shows the album art.
 */
private BigAlbumArt albumArt;

/**
 * Component that shows the scrollable list of album tracks.
 */
private TrackListingScroller trackListingScroller;

/**
 * 0.0f - the album art and track listing are completely overlayed, 1.0f -
 * the album art and track listing are completely separate. Is updated in
 * the {@link #currentShowAlbumDetailsScenario}.
 */
private float overlayPosition;
```
When these components are added, we make sure that the album art is displayed on top of the track listing (during the collapse stage). In addition, we install a custom layout manager that respects the current value of the `overlayPosition` field:

```java
Container contentPane = this.getContentPane();
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
		int w = parent.getWidth();
		int h = parent.getHeight();

		// respect the current overlay position to implement the sliding
		// effect in steps 1 and 7 of currentShowAlbumDetailsScenario
		int dim = BigAlbumArt.TOTAL_DIM;
		int dx = (int) (overlayPosition * dim / 2);
		albumArt.setBounds((w - dim) / 2 - dx, (h - dim) / 2, dim, dim);
		trackListingScroller.setBounds((w - dim) / 2 + dx,
            (h - dim) / 2 + 2, dim, dim - 4);
	}
});
contentPane.add(albumArt);
contentPane.add(trackListingScroller);

contentPane.setComponentZOrder(trackListingScroller, 1);
contentPane.setComponentZOrder(albumArt, 0);
```
The `overlayPosition` is changed in steps 1 and 6 of the main transition scenario, and the public setter revalidates the container causing the layout:

```java
/**
 * Sets the new overlay position of the album art and track listing. This
 * method will also cause revalidation of the main window content pane.
 *
 * @param overlayPosition
 *            The new overlay position of the album art and track listing.
 */
public void setOverlayPosition(float overlayPosition) {
	this.overlayPosition = overlayPosition;
	this.getContentPane().invalidate();
	this.getContentPane().validate();
}
```
Finally, the scenario itself is created and played when the mouse listener installed on the album overview component detects a mouse click and calls the `setAlbumItem` API:

```java
/**
 * Signals that details of the specified album item should be displayed in
 * this window. Note that this window can already display another album item
 * when this method is called.
 *
 * @param albumItem
 *            New album item to show in this window.
 */
 public void setAlbum(SearchResultRelease albumItem) {
   if (this.currentShowAlbumDetailsScenario != null) {
        this.currentShowAlbumDetailsScenario.cancel();
   }

   this.currentShowAlbumDetailsScenario = this.getShowAlbumDetailsScenario(albumItem);
   this.currentShowAlbumDetailsScenario.play();
 }
```
Note how we first cancel the currently playing scenario – this handles quick subsequent selections by the user, reversing the currently playing scenario in the middle.

One last thing to note in the transition scenario:

```java
// step 6 (wait for steps 4 and 5) - cross fade album art from old to new
Timeline albumArtCrossfadeTimeline = Timeline.builder(this.albumArt)
	.addPropertyToInterpolate("oldImageAlpha", 1.0f, 0.0f)
	.addPropertyToInterpolate("imageAlpha", 0.0f, 1.0f)
	.addCallback(new SwingRepaintCallback(this.albumArt))
	.setDuration(400)
	.build();
```
Note that this timeline is created on the child album art component. After the new album art has been loaded and scaled (in step 4), we initiate the cross-fading timeline on another object – which is fully supported by Trident timelines.

The rest of the code in this package is very similar to the code examples showed earlier, including custom painting that respects the alpha values, fading out on dispose, translucent window etc.

The final code sample shows how the album details panel is shown. Here, we use a separate translucent `Window` placed alongside the bottom edge of the main application window:

```java
currentlyShownWindow = new DetailsWindow();
currentlyShownWindow.setAlwaysOnTop(true);
// place the details window centered along the bottom edge of the
// main application window
Point mainWindowLoc = mainWindow.getLocation();
Dimension mainWindowDim = mainWindow.getSize();
int x = mainWindowLoc.x + mainWindowDim.width / 2
        - currentlyShownWindow.getWidth() / 2;
int y = mainWindowLoc.y + mainWindowDim.height
        - currentlyShownWindow.getHeight() / 2;
currentlyShownWindow.setLocation(x, y);

currentlyShownWindow.setOpacity(0.0f);

currentlyShownWindow.setBackground(new Color(0, 0, 0, 0));
currentlyShownWindow.setVisible(true);
currentlyShownWindow.setAlbum(album);

Timeline.builder(currentlyShownWindow)
	.addPropertyToInterpolate(Timeline.<Float>property("opacity").from(0.0f).to(1.0f))
	.setDuration(500)
	.play();
```
What happens here?

* Create a new window and position it in the required location.
* Set its opacity to 0.0 (it will be gradually faded in).
* Set its background to a fully transparent color – allowing the collapse / expand stage to show the underlying window.
* Set the album item, initiating the transition scenario described above.
* Create and play the timeline that fades in this window.
