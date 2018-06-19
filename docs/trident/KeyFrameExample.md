## Simple key frame example

The Swing application discussed below implements a simple infinite progress indication illustrated in this screenshot:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/trident/master/www/images/progressindication.png" width="347" height="121" />

The bluish highlighter moves from left to right, fading in as it appears on the left edge, and fading out as it disappears on the right edge. There are two properties that control the appearance of the highlighter:

* **xPosition** - an integer property that is linearly interpolated between the left X and the right X.
* **alpha** - a float property that starts at `0.0f`, goes to `1.0f` at 30% of the timeline duration, stays at `1.0f` until the timeline reaches its 70% mark and then goes back to `0.0f`

The **alpha** property in this example is interpolated using **key frames**.

The progress indication panel is a Swing `JPanel` with two fields and matching public setters:

```java
public static class ProgressPanel extends JPanel {
	private int xPosition;

	private float alpha;

	public void setXPosition(int position) {
		xPosition = position;
	}

	public void setAlpha(float alpha) {
		this.alpha = alpha;
	}
}
```

The constructor of this panel wires a mouse listener that starts the indefinite progress animation. The boolean `started` field tracks whether this animation has been started:

```java
private boolean started;

public ProgressPanel() {
	this.xPosition = 0;
	this.alpha = 0;

	this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					if (started)
							return;

					start();
					started = true;
			}
	});
}
```

The `start()` method creates a timeline that interpolates the X position and alpha of the progress highlight. The X position is a simple interpolation between two values (taking into account that the highlight should not be painted outside the track). The alpha interpolation uses key frames in lines 11-14:

```java
public void start() {
	progressTimeline = new Timeline(this);

	int startX = (getWidth() - INNER_WIDTH) / 2 + 18 + HIGHLIGHTER_WIDTH / 2;
	int endX = (getWidth() + INNER_WIDTH) / 2 - 18 - HIGHLIGHTER_WIDTH / 2;
	progressTimeline.addPropertyToInterpolate("xPosition", startX, endX);

	KeyValues<Float> alphaValues = KeyValues.create(0.0f, 1.0f, 1.0f, 0.0f);
	KeyTimes alphaTimes = new KeyTimes(0.0f, 0.3f, 0.7f, 1.0f);
	progressTimeline.addPropertyToInterpolate("alpha",
					new KeyFrames<Float>(alphaValues, alphaTimes));

	progressTimeline.setDuration(1500);
	progressTimeline.playLoop(RepeatBehavior.LOOP);
}
```

The panel constructor also creates a repaint timeline so that the progress animation is properly reflected on the screen:
```java
new SwingRepaintTimeline(this).playLoop(RepeatBehavior.LOOP);
```

The actual painting is done in the custom `paintComponent` method of this `JPanel` extension. The full code can be found in the `test.swing.ProgressIndication` class. It uses the matching Java2D graphics operations to paint the overall background, the inner gradient background and contour, the track and the track highlight. The track highlight painting uses the current values of both `xPosition` and `alpha` fields to display the correct visuals.
