/*
 * @(#)ColorSliderUI.java  1.0.3  2005-09-11
 *
 * Copyright (c) 2004 Werner Randelshofer
 * Staldenmattweg 2, Immensee, CH-6405, Switzerland.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Werner Randelshofer. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Werner Randelshofer.
 */

package org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSliderUI;

import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.VisualMargin;
import org.pushingpixels.substance.internal.ui.SubstanceSliderUI;
import org.pushingpixels.substance.internal.utils.RolloverControlListener;

/**
 * A UI delegate for color sliders. The track of the slider visualizes how
 * changing the value of the slider affects the color.
 * 
 * 
 * @author Werner Randelshofer
 * @version 1.0.3 2005-09-11 Tweaked layout and drawing code. <br>
 *          1.0.2 2005-08-28 Color track must always be regenerated if the
 *          snapToTicks property changes. <br>
 *          1.0.1 2005-04-18 Fixed an undesired shift of the track on the
 *          x-axis. <br>
 *          1.0 29 March 2005 Created.
 */
public class ColorSliderUI extends SubstanceSliderUI implements TransitionAwareUI {
	private final static Color foreground = new Color(0x949494);
	private final static Color trackBackground = new Color(0xffffff);

	protected Integer componentIndex;

	protected ColorSliderModel colorSliderModel;

	/**
	 * Surrogate button model for tracking the thumb transitions.
	 */
	private ButtonModel thumbModel;

	/**
	 * Listener for transition animations.
	 */
	private RolloverControlListener substanceRolloverListener;

	/**
	 * Listener on property change events.
	 */
	private PropertyChangeListener substancePropertyChangeListener;

	/**
	 * Listener for transition animations.
	 */
	protected StateTransitionTracker stateTransitionTracker;

	private static final Dimension PREFERRED_HORIZONTAL_SIZE = new Dimension(36, 20);
	private static final Dimension PREFERRED_VERTICAL_SIZE = new Dimension(26, 100);
	private static final Dimension MINIMUM_HORIZONTAL_SIZE = new Dimension(36, 20);
	private static final Dimension MINIMUM_VERTICAL_SIZE = new Dimension(26, 36);

	/** Creates a new instance. */
	public ColorSliderUI(JSlider b) {
		super(b);
		this.thumbModel = new DefaultButtonModel();
		this.thumbModel.setArmed(false);
		this.thumbModel.setSelected(false);
		this.thumbModel.setPressed(false);
		this.thumbModel.setRollover(false);
		this.thumbModel.setEnabled(b.isEnabled());

		this.stateTransitionTracker = new StateTransitionTracker(b, this.thumbModel);
		// b.setLabelTable(new Hashtable());
	}

	public static ComponentUI createUI(JComponent b) {
		return new ColorSliderUI((JSlider) b);
	}

	@Override
	protected void installDefaults(JSlider slider) {
		super.installDefaults(slider);
		focusInsets = new Insets(0, 0, 0, 0);
		slider.setOpaque(false);
		if (slider.getOrientation() == JSlider.HORIZONTAL) {
			slider.setBorder(new VisualMargin(0, 1, -1, 1));
		} else {
			slider.setBorder(new VisualMargin(0, 0, 0, 1));
		}
		// slider.setRequestFocusEnabled(QuaquaManager.getBoolean("Slider.requestFocusEnabled"));
		slider.setRequestFocusEnabled(true);
	}

	@Override
	protected void installListeners(final JSlider slider) {
		super.installListeners(slider);

		this.substanceRolloverListener = new RolloverControlListener(this, this.thumbModel);
		slider.addMouseListener(this.substanceRolloverListener);
		slider.addMouseMotionListener(this.substanceRolloverListener);

		this.substancePropertyChangeListener = (PropertyChangeEvent evt) -> {
			if ("enabled".equals(evt.getPropertyName())) {
				thumbModel.setEnabled(slider.isEnabled());
			}
			if ("font".equals(evt.getPropertyName())) {
				SwingUtilities.invokeLater(slider::updateUI);
			}
		};
		this.slider.addPropertyChangeListener(this.substancePropertyChangeListener);

		this.stateTransitionTracker.registerModelListeners();
		this.stateTransitionTracker.registerFocusListeners();
	}

	@Override
	protected void uninstallListeners(JSlider slider) {
		super.uninstallListeners(slider);

		slider.removeMouseListener(this.substanceRolloverListener);
		slider.removeMouseMotionListener(this.substanceRolloverListener);
		this.substanceRolloverListener = null;

		slider.removePropertyChangeListener(this.substancePropertyChangeListener);
		this.substancePropertyChangeListener = null;

		this.stateTransitionTracker.unregisterModelListeners();
		this.stateTransitionTracker.unregisterFocusListeners();
	}

	@Override
	public Dimension getPreferredHorizontalSize() {
		return PREFERRED_HORIZONTAL_SIZE;
	}

	@Override
	public Dimension getPreferredVerticalSize() {
		return PREFERRED_VERTICAL_SIZE;
	}

	@Override
	public Dimension getMinimumHorizontalSize() {
		return MINIMUM_HORIZONTAL_SIZE;
	}

	@Override
	public Dimension getMinimumVerticalSize() {
		return MINIMUM_VERTICAL_SIZE;
	}

	@Override
	protected void calculateThumbLocation() {
		super.calculateThumbLocation();
		if (slider.getOrientation() == JSlider.HORIZONTAL) {
			thumbRect.y += 3;
		} else {
			thumbRect.x -= 1;
		}
	}

	@Override
	public void paintTrack(Graphics g) {
		int cx, cy, cw, ch;
		int pad;

		Rectangle trackBounds = trackRect;
		if (slider.getOrientation() == JSlider.HORIZONTAL) {
			pad = trackBuffer;// - thumbRect.width / 2 + 2;
			cx = trackBounds.x - pad + 1;
			cy = trackBounds.y;
			// cy = (trackBounds.height / 2) - 4;
			cw = trackBounds.width + pad * 2 - 2;
			ch = trackBounds.height;
		} else {
			pad = trackBuffer;
			// cx = (trackBounds.width / 2) - 4;
			// cx = (trackBounds.width / 2);
			// cx = thumbRect.x + 2;
			cx = trackBounds.x;
			// cy = pad;
			cy = contentRect.y + 2;
			cw = trackBounds.width - 1;
			// ch = trackBounds.height;
			ch = trackBounds.height + pad * 2 - 5;
		}
		g.setColor(trackBackground);
		g.fillRect(cx, cy, cw, ch);
		g.setColor(foreground);
		g.drawRect(cx, cy, cw - 1, ch - 1);
		paintColorTrack(g, cx + 2, cy + 2, cw - 4, ch - 4, trackBuffer);
	}

	@Override
	public void paintTicks(Graphics g) {
		Rectangle tickBounds = tickRect;
		g.setColor(foreground);

		if (slider.getOrientation() == JSlider.HORIZONTAL) {
			g.translate(0, tickBounds.y);

			int value = slider.getMinimum();
			int xPos;

			if (slider.getMinorTickSpacing() > 0) {
				while (value <= slider.getMaximum()) {
					xPos = xPositionForValue(value);
					paintMinorTickForHorizSlider(g, tickBounds, xPos);
					value += slider.getMinorTickSpacing();
				}
			}

			if (slider.getMajorTickSpacing() > 0) {
				value = slider.getMinimum();

				while (value <= slider.getMaximum()) {
					xPos = xPositionForValue(value);
					paintMajorTickForHorizSlider(g, tickBounds, xPos);
					value += slider.getMajorTickSpacing();
				}
			}

			g.translate(0, -tickBounds.y);
		} else {
			g.translate(tickBounds.x, 0);

			int value = slider.getMinimum();
			int yPos;

			if (slider.getMinorTickSpacing() > 0) {
				int offset = 0;
				if (!slider.getComponentOrientation().isLeftToRight()) {
					offset = tickBounds.width - tickBounds.width / 2;
					g.translate(offset, 0);
				}

				while (value <= slider.getMaximum()) {
					yPos = yPositionForValue(value);
					paintMinorTickForVertSlider(g, tickBounds, yPos);
					value += slider.getMinorTickSpacing();
				}

				if (!slider.getComponentOrientation().isLeftToRight()) {
					g.translate(-offset, 0);
				}
			}

			if (slider.getMajorTickSpacing() > 0) {
				value = slider.getMinimum();
				if (!slider.getComponentOrientation().isLeftToRight()) {
					g.translate(2, 0);
				}

				while (value <= slider.getMaximum()) {
					yPos = yPositionForValue(value);
					paintMajorTickForVertSlider(g, tickBounds, yPos);
					value += slider.getMajorTickSpacing();
				}

				if (!slider.getComponentOrientation().isLeftToRight()) {
					g.translate(-2, 0);
				}
			}
			g.translate(-tickBounds.x, 0);
		}
		/*
		 * g.setColor(Color.red); ((Graphics2D) g).draw(tickBounds);
		 */
	}

	@Override
	protected void paintMajorTickForHorizSlider(Graphics g, Rectangle tickBounds, int x) {
		g.drawLine(x, 0, x, tickBounds.height - 1);
	}

	@Override
	protected void paintMinorTickForHorizSlider(Graphics g, Rectangle tickBounds, int x) {
		// g.drawLine( x, 0, x, tickBounds.height / 2 - 1 );
		g.drawLine(x, 0, x, tickBounds.height - 1);
	}

	@Override
	protected void paintMinorTickForVertSlider(Graphics g, Rectangle tickBounds, int y) {
		g.drawLine(tickBounds.width / 2, y, tickBounds.width / 2 - 1, y);
	}

	@Override
	protected void paintMajorTickForVertSlider(Graphics g, Rectangle tickBounds, int y) {
		g.drawLine(0, y, tickBounds.width - 1, y);
	}

	@Override
	public void paintFocus(Graphics g) {
	}

	private void paintColorTrack(Graphics g, int x, int y, int width, int height, int buffer) {
		int x2 = x;
		int y2 = y;
		if (slider.getOrientation() == JSlider.HORIZONTAL) {
			x2 += width;
		} else {
			y2 += height;
		}

		if (componentIndex == null) {
			componentIndex = (Integer) slider.getClientProperty("ColorComponentIndex");
		}
		if (colorSliderModel == null) {
			colorSliderModel = (ColorSliderModel) slider.getClientProperty("ColorSliderModel");
		}

		Graphics2D gg = (Graphics2D) g.create();
		Color c1 = new Color(colorSliderModel.getInterpolatedRGB(componentIndex, 0.0f),
		        true);
		Color c2 = new Color(colorSliderModel.getInterpolatedRGB(componentIndex, 1.0f));
		gg.setPaint(new LinearGradientPaint(x, y, x2, y2, new float[] { 0f, 1.0f },
		        slider.getOrientation() == JSlider.HORIZONTAL ?
		                new Color[] { c1, c2 } : new Color[] { c2, c1 }));
		gg.fillRect(x, y, width, height);
		gg.dispose();
	}

	@Override
	protected void calculateTrackRect() {
		// BorderLayout.CENTER (bug 4275631)
		if (slider.getOrientation() == JSlider.HORIZONTAL) {
			trackRect.x = contentRect.x + trackBuffer + 1;
			trackRect.height = 13;
			trackRect.y = contentRect.y + contentRect.height - trackRect.height;
			trackRect.width = contentRect.width - (trackBuffer * 2) - 1;
		} else {
			trackRect.width = 14;
			trackRect.x = contentRect.x + contentRect.width - trackRect.width;
			trackRect.y = contentRect.y + trackBuffer;
			trackRect.height = contentRect.height - (trackBuffer * 2) + 1;
		}

	}

	@Override
	protected void calculateTickRect() {
		if (slider.getOrientation() == JSlider.HORIZONTAL) {
			tickRect.x = trackRect.x;
			// tickRect.y = trackRect.y + trackRect.height;
			tickRect.y = trackRect.y - getTickLength();
			tickRect.width = trackRect.width;
			tickRect.height = getTickLength();

			if (!slider.getPaintTicks()) {
				--tickRect.y;
				tickRect.height = 0;
			}
		} else {
			/*
			 * if(! QuaquaUtilities.isLeftToRight(slider)) { tickRect.x =
			 * trackRect.x + trackRect.width; tickRect.width = getTickLength();
			 * } else { tickRect.width = getTickLength(); tickRect.x =
			 * trackRect.x - tickRect.width; }
			 */
			tickRect.width = getTickLength();
			tickRect.x = contentRect.x;// trackRect.x - tickRect.width - 1;
			tickRect.y = trackRect.y;
			tickRect.height = trackRect.height;

			if (!slider.getPaintTicks()) {
				--tickRect.x;
				tickRect.width = 0;
			}
		}
	}

	/**
	 * Gets the height of the tick area for horizontal sliders and the width of
	 * the tick area for vertical sliders. BasicSliderUI uses the returned value
	 * to determine the tick area rectangle. If you want to give your ticks some
	 * room, make this larger than you need and paint your ticks away from the
	 * sides in paintTicks().
	 */
	@Override
	protected int getTickLength() {
		return 4;
	}

	@Override
	protected PropertyChangeListener createPropertyChangeListener(JSlider slider) {
		return new CSUIPropertyChangeHandler();
	}

	public class CSUIPropertyChangeHandler extends BasicSliderUI.PropertyChangeHandler {
		@Override
		public void propertyChange(PropertyChangeEvent e) {
			String propertyName = e.getPropertyName();

			if (propertyName.equals("Frame.active")) {
				// calculateGeometry();
				slider.repaint();
			} else if (propertyName.equals("ColorSliderModel")) {
				colorSliderModel = (ColorSliderModel) e.getNewValue();
				slider.repaint();
			} else if (propertyName.equals("snapToTicks")) {
				slider.repaint();
			} else if (propertyName.equals("ColorComponentIndex")) {
				componentIndex = (Integer) e.getNewValue();
				slider.repaint();
			} else if (propertyName.equals("ColorComponentChange")) {
				slider.repaint();
			} else if (propertyName.equals("ColorComponentValue")) {
				slider.repaint();
			} else if (propertyName.equals("Orientation")) {
				if (slider.getOrientation() == JSlider.HORIZONTAL) {
					slider.setBorder(new VisualMargin(0, 1, -1, 1));
				} else {
					slider.setBorder(new VisualMargin(0, 0, 0, 1));
				}
			}

			super.propertyChange(e);
		}
	}

	@Override
	protected TrackListener createTrackListener(JSlider slider) {
		return new QuaquaTrackListener();
	}

	/**
	 * Track mouse movements.
	 * 
	 * This inner class is marked &quot;public&quot; due to a compiler bug. This
	 * class should be treated as a &quot;protected&quot; inner class.
	 * Instantiate it only within subclasses of <Foo>.
	 */
	public class QuaquaTrackListener extends BasicSliderUI.TrackListener {
		/**
		 * If the mouse is pressed above the "thumb" component then reduce the
		 * scrollbars value by one page ("page up"), otherwise increase it by
		 * one page. If there is no thumb then page up if the mouse is in the
		 * upper half of the track.
		 */
		@Override
		public void mousePressed(MouseEvent e) {
			if (!slider.isEnabled())
				return;

			currentMouseX = e.getX();
			currentMouseY = e.getY();

			if (slider.isRequestFocusEnabled()) {
				slider.requestFocus();
			}

			// Clicked inside the Thumb area?
			if (thumbRect.contains(currentMouseX, currentMouseY)) {
				super.mousePressed(e);
			} else {
				switch (slider.getOrientation()) {
				case JSlider.VERTICAL:
					slider.setValue(valueForYPosition(currentMouseY));
					break;
				case JSlider.HORIZONTAL:
					slider.setValue(valueForXPosition(currentMouseX));
					break;
				}

				// FIXME:
				// We should set isDragging to false here. Unfortunately,
				// we can not access this variable in class BasicSliderUI.
			}
		}
	}

	@Override
	public StateTransitionTracker getTransitionTracker() {
		return this.stateTransitionTracker;
	}

	@Override
	public boolean isInside(MouseEvent me) {
		Rectangle thumbB = this.thumbRect;
		return thumbB != null && thumbB.contains(me.getX(), me.getY());
	}
}
