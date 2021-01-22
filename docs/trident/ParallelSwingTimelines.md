## Multiple timelines in Swing applications

Trident supports running multiple independent timelines at the same time. This page shows the Swing application behind [this video](http://vimeo.com/3404285), where every cell rollover is implemented as a separate timeline.

We start with a class that implements a specific grid cell:

```java
	public static class SnakePanelRectangle {
		private Color backgroundColor;

		private boolean isRollover;

		private Timeline rolloverTimeline;

		private SwingRepaintTimeline repaintTimeline;

		public SnakePanelRectangle(SwingRepaintTimeline repaintTimeline) {
			this.backgroundColor = Color.black;
			this.isRollover = false;

			this.rolloverTimeline = Timeline.builder(this)
					.addPropertyToInterpolate("backgroundColor", Color.yellow, Color.black)
					.setDuration(2500)
					.build();

			this.repaintTimeline = repaintTimeline;
		}

		public void setRollover(boolean isRollover) {
			if (this.isRollover == isRollover)
				return;
			this.isRollover = isRollover;
			if (this.isRollover) {
				this.rolloverTimeline.replay();
			}
		}

		public void setBackgroundColor(Color backgroundColor) {
			this.backgroundColor = backgroundColor;
			this.repaintTimeline.forceRepaintOnNextPulse();
		}

		public Color getBackgroundColor() {
			return backgroundColor;
		}
	}
```

A few major points in this class:
* The default background color of a cell is black (line 11).
* The rollover timeline interpolates the background color from yellow to black over a period of 2.5 seconds (lines 14-17).
* The rollover timeline is replayed when `setRollover` is called with `true`. This restarts the timeline to interpolate the foreground color from yellow.
* When `setBackgroundColor` is called by the rollover timeline, we ask the repaint timeline to force the repaint of the window on the next pulse.

The next class implements a cell grid, tracing the mouse events and dispatching the rollover events to the relevant cells:

```java
	private static class SnakePanel extends JPanel {

		private SnakePanelRectangle[][] grid;

		private int ROWS = 10;

		private int COLUMNS = 20;

		private int DIM = 20;

		public SnakePanel() {
			SwingRepaintTimeline repaintTimeline = SwingRepaintTimeline.repaintBuilder(this)
					.setAutoRepaintMode(false).build();

			this.grid = new SnakePanelRectangle[COLUMNS][ROWS];
			for (int i = 0; i < COLUMNS; i++) {
				for (int j = 0; j < ROWS; j++) {
					this.grid[i][j] = new SnakePanelRectangle(repaintTimeline);
				}
			}
			this.setPreferredSize(new Dimension(COLUMNS * (DIM + 1), ROWS
					* (DIM + 1)));

			repaintTimeline.playLoop(RepeatBehavior.LOOP);

			this.addMouseMotionListener(new MouseMotionAdapter() {
				int rowOld = -1;
				int colOld = -1;

				@Override
				public void mouseMoved(MouseEvent e) {
					int x = e.getX();
					int y = e.getY();

					int column = x / (DIM + 1);
					int row = y / (DIM + 1);

					if ((column != colOld) || (row != rowOld)) {
						if ((colOld >= 0) && (rowOld >= 0))
							grid[colOld][rowOld].setRollover(false);
						grid[column][row].setRollover(true);
					}
					colOld = column;
					rowOld = row;
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			Graphics2D g2d = (Graphics2D) g.create();

			g2d.setColor(Color.black);
			g2d.fillRect(0, 0, getWidth(), getHeight());

			for (int i = 0; i < COLUMNS; i++) {
				for (int j = 0; j < ROWS; j++) {
					SnakePanelRectangle rect = this.grid[i][j];
					Color backgr = rect.getBackgroundColor();

					if (!Color.black.equals(backgr)) {
						g2d.setColor(backgr);
						g2d.fillRect(i * (DIM + 1), j * (DIM + 1), DIM, DIM);
					}
				}
			}

			g2d.dispose();
		}
	}
```

A few major points in this class:
* A special type of timeline is created and played in a loop - lines 12-14/25. In this example, each cell rollover timeline changes the background color of that cell and asks the main repaint timeline to repaint the entire grid panel. While this repaint timeline loops forever, it only repaints the window when its `forceRepaintOnNextPulse` has been called. This way we decouple the updates of the model from the repaint, while still not repainting the entire window when the mouse is not moving and all rollover timelines are idle.
* The mouse motion listener (lines 27-47) tracks the mouse location, calling the `setRollover` method on relevant cells. Since each cell rollover timeline runs for 2.5 seconds, quick mouse moves will result in multiple timelines running in parallel.
* The painting of each cell respects the current background color of that cell - lines 57-62.

Finally, the main method that creates a host frame and adds the cell grid panel to it:

```java
public static void main(String[] args) {
	SwingUtilities.invokeLater(() -> {
		JFrame frame = new JFrame("Snake");
		frame.add(new SnakePanel());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	});
}
```
