
## Lumen - album art layout and scrolling

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/radiance/sunshine/docs/images/lumen/lumen-main.png" width="594" height="284" border=0>

This entry will talk about loading the album art matching the specific search string and asynchronous display of the associated images.

The album items can be scrolled with right / left arrow keys, as well as by using the mouse wheel.

The base implementation of the layout does not use animations on the scrolling, but lays out the groundwork. It starts off by having the list of all album items, and the position of the currently leading item:

```java
public class Stage2Components extends Stage1LoadingProgress {
	/**
	 * The list of album overview components. Each component added with
	 * {@link #addOverviewComp(Item, ActivationCallback)} is added to this list.
	 */
	List comps;

	/**
	 * Indicates which album overview component is displayed at the left edge of
	 * this container. Note that while this specific class (in its
	 * {@link #scrollToNext()} and {@link #scrollToPrevious()}) operate on the
	 * integer values, the animated scrolling will result in fractional values
	 * of the leading position.
	 *
	 * At the beginning the value is 0.0 - displaying the first entry in
	 * {@link #comps} at the left edge. When scrolling to the next album, the
	 * value will become 1.0 (effectively pushing the first album over the left
	 * edge). If the scrolling is animated, this value will be gradually
	 * interpolated from 0.0 to 1.0.
	 *
	 * This value is respected in the {@link #doLayout()} to provide the
	 * seamless scroll animation.
	 *
	 */
	float leadingPosition;
```
In this class, the `leadingPosition` will only have discrete integer values – immediate scrolling. However, we define is as `float` for the animation purposes (see below).

The constructor of this class creates the list for holding the album items, as well as registering relevant mouse wheel listener, input map and action map:

```java
/**
 * Creates the new container that can host album overview components.
 */
public Stage2Components() {
	super();
	this.comps = new ArrayList();

	// register the mouse wheel listener for scrolling content
	this.addMouseWheelListener(new MouseWheelListener() {
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			if (e.getWheelRotation() > 0) {
				// next
				scrollToNext();
			} else {
				// previous
				scrollToPrevious();
			}
		}
	});

	// create the key input maps to handle the scrolling
	// with left / right arrows
	InputMap inputMap = new ComponentInputMap(this);
	inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "right");
	inputMap.put(KeyStroke.getKeyStroke("KP_RIGHT"), "right");
	inputMap.put(KeyStroke.getKeyStroke("LEFT"), "left");
	inputMap.put(KeyStroke.getKeyStroke("KP_LEFT"), "left");

	// create the relevant action map
	Action rightAction = new AbstractAction("right") {
		@Override
		public void actionPerformed(ActionEvent e) {
			// next
			scrollToNext();
		}
	};
	Action leftAction = new AbstractAction("left") {
		@Override
		public void actionPerformed(ActionEvent e) {
			// previous
			scrollToPrevious();
		}
	};
	ActionMap actionMap = new ActionMap();
	actionMap.put("right", rightAction);
	actionMap.put("left", leftAction);

	// and register the maps
	this.setInputMap(WHEN_IN_FOCUSED_WINDOW, inputMap);
	this.setActionMap(actionMap);
}
```
Next, a method to add a single album to this container:

```java
/**
 * Adds the specified album item to this album container.
 *
 * @param albumItem
 *            Description of the album item from the Amazon backend.
 * @return Thew matching album overview component.
 */
public synchronized AlbumOverviewComponent addAlbumItem(SearchResultRelease albumItem) {
	AlbumOverviewComponent comp = new AlbumOverviewComponent(albumItem);
	this.comps.add(comp);
	this.add(comp);
	return comp;
}
```
And the implementation of discrete scrolling:

```java
/**
 * Scrolls the albums to show the next album.
 */
protected void scrollToNext() {
	if (this.leadingPosition < (this.comps.size() - 1)) {
		this.leadingPosition++;
		revalidate();
	}
}

/**
 * Scrolls the albums to show the previous album.
 */
protected void scrollToPrevious() {
	if (this.leadingPosition > 0) {
		this.leadingPosition--;
		revalidate();
	}
}
```
The layout itself (triggered by the calls to `revalidate()`` above) is quite simple – computing the X position of each album item based on the current `leadingPosition`:

```java
@Override
public synchronized void doLayout() {
	if (comps.size() == 0)
		return;

	for (int i = 0; i < this.comps.size(); i++) {
		float delta = i - this.leadingPosition;
		// compute the left X based on the current leading position
		int x = 10 + (int) (delta * (AlbumOverviewComponent.DEFAULT_WIDTH + 10));
		this.comps.get(i).setBounds(x,
				(getHeight() - AlbumOverviewComponent.DEFAULT_HEIGHT) / 2,
				AlbumOverviewComponent.DEFAULT_WIDTH,
				AlbumOverviewComponent.DEFAULT_HEIGHT);
	}
}
```

Finally, to prevent the album items painting too close to the main container edges we clip the matching graphics in the paintChildren:

```java
@Override
protected void paintChildren(Graphics g) {
	// clip the graphics context
	g.clipRect(10, 10, getWidth() - 20, getHeight() - 20);
	super.paintChildren(g);
}
```
Now it's time to add the scrolling animation to the mix. With the groundwork laid out already, the implementation is quite simple.

```java
public class Stage3AnimatedScrolling extends Stage2Components {
	/**
	 * Contains the target leading position - this is the index of the album
	 * which should appear at the left edge once the current
	 * {@link #scrollTimeline} is done. Note that the user scrolling can be done
	 * in the middle of the current scrolling animation. In this case, the field
	 * is updated with the new target index.
	 */
	int targetLeadingPosition;

	/**
	 * The scroll timeline. Note that the user scrolling can be done in the
	 * middle of the current scrolling animation. In this case, the current
	 * timeline is cancelled, and a new one is created - this allows quick
	 * scrolling with multiple mouse wheel / arrow events.
	 */
	Timeline scrollTimeline;
```
The `targetLeadingPosition` allows us to handle multiple consecutive scrolling requests (user quickly scrolling the mouse wheel) without having multiple timelines “competing” to scroll the album items.

The constructor doesn't do anything special:

```java
/**
 * Creates the new container that can animate the album scrolling.
 */
public Stage3AnimatedScrolling() {
	super();
	this.targetLeadingPosition = 0;
}
```
Now we get to the “meat” of this class – adding the scrolling animations. First, we override the scrolling methods from the super class to update the target position:

```java
@Override
protected void scrollToNext() {
	if (this.targetLeadingPosition < (this.comps.size() - 1)) {
		this.targetLeadingPosition++;
		scrollContents();
	}
}

@Override
protected void scrollToPrevious() {
	if (this.targetLeadingPosition > 0) {
		this.targetLeadingPosition--;
		scrollContents();
	}
}
```
Where the `scrollContents` cancels the existing timeline (if necessary), and plays a new one:

```java
/**
 * Scrolls the contents of this container.
 */
private synchronized void scrollContents() {
	if (this.scrollTimeline != null) {
		// cancel the playing scroll timeline
		this.scrollTimeline.cancel();
	}

	// and dynamically create a new one to change the
	// leading position
	this.scrollTimeline = Timeline.builder(this)
		.addPropertyToInterpolate(Timeline.<Float>property("leadingPosition")
			.fromCurrent().to(this.targetLeadingPosition))
		.setDuration(250)
		.build();

	scrollTimeline.play();
}
```
Canceling the old timeline makes sure that we will not have multiple timeline updating the `leadingPosition` field. And the `targetLeadingPosition` field holds the final value of the `leadingPosition` – or at least until the user makes an additional scrolling request.

Finally, we have a public setter so that the Trident engine can change the value of the `leadingPosition` field:

```java
	/**
	 * Sets the new value for the leading position. This is called from
	 * {@link #scrollTimeline}.
	 *
	 * @param leadingPosition
	 *            The new value for the leading position.
	 */
	public void setLeadingPosition(float leadingPosition) {
		this.leadingPosition = leadingPosition;
		revalidate();
	}
}
```
Here we have seen how to scroll the album covers showed in the container and how to add animations to the scrolling.
