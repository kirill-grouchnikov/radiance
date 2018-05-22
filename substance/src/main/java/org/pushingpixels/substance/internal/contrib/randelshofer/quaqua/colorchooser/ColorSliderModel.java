/*
 * @(#)ColorSliderModel.java  1.0  May 22, 2005
 *
 * Copyright (c) 2005 Werner Randelshofer
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
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Abstract super class for ColorModels which can be used in conjunction with
 * ColorSliderUI user interface delegates.
 * <p>
 * Colors are represented as arrays of color components represented as
 * BoundedRangeModel's. Each BoundedRangeModel can be visualized using a JSlider
 * having a ColorSliderUI.
 *
 * @author Werner Randelshofer
 * @version 1.0 May 22, 2005 Created.
 */
public abstract class ColorSliderModel {
	/**
	 * JSlider's associated to this ColorSliderModel.
	 */
	private LinkedList<JSlider> sliders = new LinkedList<JSlider>();
	/**
	 * ChangeListener's listening to changes in this ColorSliderModel.
	 */
	private LinkedList<ChangeListener> listeners = new LinkedList<ChangeListener>();

	/**
	 * Components of the color model.
	 */
	protected DefaultBoundedRangeModel[] components;

	/**
	 * Speed optimization. This way, we do not need to create a new array for
	 * each invocation of method getInterpolatedRGB(). Note: This variable must
	 * not use in reentrant methods.
	 */
	protected int[] values;

	/**
	 * Creates a new ColorSliderModel with an array of BoundedRangeModel's for
	 * the color components.
	 */
	protected ColorSliderModel(DefaultBoundedRangeModel[] components) {
		this.components = components;
		values = new int[components.length];

		for (int i = 0; i < components.length; i++) {
			final int componentIndex = i;
            components[i].addChangeListener((ChangeEvent e) -> {
                fireColorChanged(componentIndex);
                fireStateChanged();
            });
		}
	}

	/**
	 * Configures a JSlider for this ColorSliderModel. If the JSlider is already
	 * configured for another ColorSliderModel, it is unconfigured first.
	 */
	public void configureColorSlider(int component, JSlider slider) {
		if (slider.getClientProperty("ColorSliderModel") != null) {
			((ColorSliderModel) slider.getClientProperty("ColorSliderModel"))
					.unconfigureColorSlider(slider);
		}
		if (!(slider.getUI() instanceof ColorSliderUI)) {
			slider.setUI(new ColorSliderUI(slider));
			slider.createStandardLabels(16);
		}
		slider.setModel(getBoundedRangeModel(component));
		slider.putClientProperty("ColorSliderModel", this);
		slider.putClientProperty("ColorComponentIndex", new Integer(component));
		addColorSlider(slider);
	}

	/**
	 * Unconfigures a JSlider from this ColorSliderModel.
	 */
	public void unconfigureColorSlider(JSlider slider) {
		if (slider.getClientProperty("ColorSliderModel") == this) {
			// XXX - This creates a NullPointerException ??
			// slider.setUI((SliderUI) UIManager.getUI(slider));
			slider.setModel(new DefaultBoundedRangeModel());
			slider.putClientProperty("ColorSliderModel", null);
			slider.putClientProperty("ColorComponentIndex", null);
			removeColorSlider(slider);
		}
	}

	/**
	 * Returns the number of components of this color component model.
	 */
	public int getComponentCount() {
		return components.length;
	}

	/**
	 * Returns the bounded range model of the specified color component.
	 */
	public DefaultBoundedRangeModel getBoundedRangeModel(int component) {
		return components[component];
	}

	/**
	 * Returns the value of the specified color component.
	 */
	public int getValue(int component) {
		return components[component].getValue();
	}

	/**
	 * Sets the value of the specified color component.
	 */
	public void setValue(int component, int value) {
		components[component].setValue(value);
	}

	/**
	 * Returns an interpolated RGB value by using the values of the color
	 * components of this ColorSliderModel except for the component specified as
	 * an argument. For this component the ratio between zero and the maximum of
	 * its BoundedRangeModel is used.
	 */
	public int getInterpolatedRGB(int component, float ratio) {
		for (int i = 0, n = getComponentCount(); i < n; i++) {
			values[i] = components[i].getValue();
		}
		values[component] = (int) (ratio * components[component].getMaximum());
		return toRGB(values);
	}

	protected void addColorSlider(JSlider slider) {
		sliders.add(slider);
	}

	protected void removeColorSlider(JSlider slider) {
		sliders.remove(slider);
	}

	public void addChangeListener(ChangeListener l) {
		listeners.add(l);
	}

	public void removeChangeListener(ChangeListener l) {
		listeners.remove(l);
	}

	protected void fireColorChanged(int componentIndex) {
		Integer index = new Integer(componentIndex);
		Color value = getColor();
		for (Iterator<JSlider> i = sliders.iterator(); i.hasNext();) {
			JSlider slider = (JSlider) i.next();
			slider.putClientProperty("ColorComponentChange", index);
			slider.putClientProperty("ColorComponentValue", value);
		}
	}

	public void fireStateChanged() {
		ChangeEvent event = new ChangeEvent(this);
		for (Iterator<ChangeListener> i = listeners.iterator(); i.hasNext();) {
			ChangeListener l = (ChangeListener) i.next();
			l.stateChanged(event);
		}
	}

	public Color getColor() {
		return new Color(getRGB());
	}

	public void setColor(Color color) {
		int rgb = color.getRGB();
		if (rgb != getRGB()) {
			setRGB(rgb);
		}
	}

	public abstract void setRGB(int rgb);

	public abstract int getRGB();

	public abstract int toRGB(int[] values);
}
