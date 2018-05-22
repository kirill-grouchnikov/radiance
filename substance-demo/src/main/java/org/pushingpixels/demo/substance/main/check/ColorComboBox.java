/*
 *                 Sun Public License Notice
 * 
 * The contents of this file are subject to the Sun Public License
 * Version 1.0 (the "License"). You may not use this file except in
 * compliance with the License. A copy of the License is available at
 * http://www.sun.com/
 * 
 * The Original Code is NetBeans. The Initial Developer of the Original
 * Code is Sun Microsystems, Inc. Portions Copyright 1997-2000 Sun
 * Microsystems, Inc. All Rights Reserved.
 */

package org.pushingpixels.demo.substance.main.check;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

/**
 * 
 * @author Administrator
 */
public class ColorComboBox extends JComboBox {

	public static final String PROP_COLOR = "color"; // NOI18N

	public static final Value CUSTOM_COLOR = new Value(loc("Custom"), null); // NOI18N

	private static Map<Color, String> colorMap = new HashMap<Color, String>();
	static {
		colorMap.put(Color.BLACK, loc("Black")); // NOI18N
		colorMap.put(Color.BLUE, loc("Blue")); // NOI18N
		colorMap.put(Color.CYAN, loc("Cyan")); // NOI18N
		colorMap.put(Color.DARK_GRAY, loc("Dark_Gray")); // NOI18N
		colorMap.put(Color.GRAY, loc("Gray")); // NOI18N
		colorMap.put(Color.GREEN, loc("Green")); // NOI18N
		colorMap.put(Color.LIGHT_GRAY, loc("Light_Gray")); // NOI18N
		colorMap.put(Color.MAGENTA, loc("Magenta")); // NOI18N
		colorMap.put(Color.ORANGE, loc("Orange")); // NOI18N
		colorMap.put(Color.PINK, loc("Pink")); // NOI18N
		colorMap.put(Color.RED, loc("Red")); // NOI18N
		colorMap.put(Color.WHITE, loc("White")); // NOI18N
		colorMap.put(Color.YELLOW, loc("Yellow")); // NOI18N
	}

	private static Object[] content = new Object[] { new Value(Color.BLACK),
			new Value(Color.BLUE), new Value(Color.CYAN),
			new Value(Color.DARK_GRAY), new Value(Color.GRAY),
			new Value(Color.GREEN), new Value(Color.LIGHT_GRAY),
			new Value(Color.MAGENTA), new Value(Color.ORANGE),
			new Value(Color.PINK), new Value(Color.RED),
			new Value(Color.WHITE), new Value(Color.YELLOW), CUSTOM_COLOR };

	private Color lastColor;

	/** Creates a new instance of ColorChooser */
	public ColorComboBox() {
		super(content);
		setRenderer(new Renderer());
		setEditable(true);
		setEditor(new Renderer());
		setSelectedItem(new Value(null, null));
		addActionListener((ActionEvent ev) -> {
			if (getSelectedItem() == CUSTOM_COLOR) {
				Color c = JColorChooser.showDialog(SwingUtilities
						.getAncestorOfClass(Dialog.class,
								ColorComboBox.this), loc("SelectColor"),
						lastColor);
				if (c != null)
					setColor(c);
			} else {
				lastColor = ((Value) getSelectedItem()).color;
			}
			ColorComboBox.this.firePropertyChange(PROP_COLOR, null, null);
		});
	}

	public void setInheritedColor(Color color) {
		Object[] ncontent = new Object[content.length];
		System.arraycopy(content, 0, ncontent, 0, content.length);
		if (color != null)
			ncontent[content.length - 1] = new Value(
					loc("CTL_Inherited_Color"), color // NOI18N
			);
		else
			ncontent[content.length - 1] = new Value(loc("CTL_None_Color"),
					null // NOI18N
			);
		setModel(new DefaultComboBoxModel(ncontent));
	}

	public void setColor(Color color) {
		if (color == null) {
			setSelectedIndex(content.length - 1);
			lastColor = ((Value) getItemAt(content.length - 1)).color;
		} else {
			setSelectedItem(new Value(color));
			lastColor = color;
		}
	}

	public Color getColor() {
		if (getSelectedIndex() == (content.length - 1))
			return null;
		return ((Value) getSelectedItem()).color;
	}

	private static String loc(String key) {
		return key;
	}

	// innerclasses ............................................................

	public static class Value {
		String text;

		Color color;

		Value(Color color) {
			this.color = color;
			text = colorMap.get(color);
			if (text != null)
				return;
			StringBuffer sb = new StringBuffer();
			sb.append('[').append(color.getRed()).append(',').append(
					color.getGreen()).append(',').append(color.getBlue())
					.append(']');
			text = sb.toString();
		}

		Value(String text, Color color) {
			this.text = text;
			this.color = color;
		}
	}

	private class Renderer extends JComponent implements ListCellRenderer,
			ComboBoxEditor {

		private int SIZE = 9;

		private Value value;

		Renderer() {
			setPreferredSize(new Dimension(50, getFontMetrics(
					ColorComboBox.this.getFont()).getHeight() + 2));
			setOpaque(true);
			setFocusable(true);
			// setBorder(new SubstanceBorder());
		}

		@Override
		public void paint(Graphics g) {
			Color oldColor = g.getColor();
			Dimension size = getSize();
			if (isFocusOwner())
				g.setColor(SystemColor.textHighlight);
			else
				g.setColor(getBackground());
			g.fillRect(0, 0, size.width, size.height);
			int i = (size.height - SIZE) / 2;
			if (value.color != null) {
				g.setColor(Color.black);
				g.drawRect(i, i, SIZE, SIZE);
				g.setColor(value.color);
				g.fillRect(i + 1, i + 1, SIZE - 1, SIZE - 1);
			}
			if (value.text != null) {
				if (isFocusOwner())
					g.setColor(SystemColor.textHighlightText);
				else
					g.setColor(getForeground());
				if (value.color != null)
					g.drawString(value.text, i + SIZE + 5, i + SIZE);
				else
					g.drawString(value.text, 5, i + SIZE);
			}
			g.setColor(oldColor);
		}

		@Override
		public void setEnabled(boolean enabled) {
			setBackground(enabled ? SystemColor.text : SystemColor.control);
			super.setEnabled(enabled);
		}

		public Component getListCellRendererComponent(JList list, Object value,
				int index, boolean isSelected, boolean cellHasFocus) {
			this.value = (Value) value;
			setEnabled(list.isEnabled());
			setBackground(isSelected ? SystemColor.textHighlight
					: SystemColor.text);
			setForeground(isSelected ? SystemColor.textHighlightText
					: SystemColor.textText);
			return this;
		}

		public Component getEditorComponent() {
			setEnabled(ColorComboBox.this.isEnabled());
			setBackground(ColorComboBox.this.isFocusOwner() ? SystemColor.textHighlight
					: SystemColor.text);
			setForeground(ColorComboBox.this.isFocusOwner() ? SystemColor.textHighlightText
					: SystemColor.textText);
			return this;
		}

		public void setItem(Object anObject) {
			this.value = (Value) anObject;
		}

		public Object getItem() {
			return value;
		}

		public void selectAll() {
		}

		public void addActionListener(ActionListener l) {
		}

		public void removeActionListener(ActionListener l) {
		}
	}
}
