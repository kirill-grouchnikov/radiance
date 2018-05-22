package org.pushingpixels.substance.internal.contrib.xoetrope.editor.color;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicBorders;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;
import org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser.SubstanceColorChooserPanel;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.SubstanceTextUtilities;
import org.pushingpixels.substance.internal.utils.border.SubstanceTextComponentBorder;
import org.pushingpixels.substance.internal.utils.icon.TransitionAwareIcon;

/**
 * A color wheel showing a Red, Yellow, Blue color model traditionally used by
 * graphic artists. $Revision: 2254 $
 */
public class ColorWheelPanel extends SubstanceColorChooserPanel implements
		ActionListener, MouseListener, MouseMotionListener, MouseWheelListener,
		ChangeListener {
	public static final int MONOCHROMATIC_SCHEME = 0;
	public static final int CONTRASTING_SCHEME = 1;
	public static final int SOFT_CONTRAST_SCHEME = 2;
	public static final int DOUBLE_CONTRAST_SCHEME = 3;
	public static final int ANALOGIC_SCHEME = 4;

	public static final int CTRL_ADJUST = 0;
	public static final int ALWAYS_ADJUST = 1;
	public static final int NEVER_ADJUST = 2;

	protected JTextField hueEdit, satEdit, brightEdit, baseColorEdit;
	protected BufferedImage pickerImage;
	protected ColorWheel imagePicker;
	protected JPanel fixedPanel;
	protected JButton resetBtn;
	protected JSlider brightnessSlider, saturationSlider;
	protected JLabel baseColorLabel;
	protected Ellipse2D innerCircle, outerCircle, borderCircle;
	protected JCheckBox useWebColors, decimalRGB;
	protected Font fontSmall;

	protected ModelColor chooserColor;
	protected ModelColor[] selectedIttenColours;

	private float values[] = new float[3];
	private double h, s, b;

	private int colorScheme = 0;

	private boolean busy = false;
	private boolean displayScheme = false;
	private boolean hasChooser = false;

	private ArrayList<ChangeListener> changeListeners;
	private static double[] arcDelta = { -7.5, -7.5, -7.5, -7.5, -7.5, -1.0,
			4.0, 7.5 };

	private double ringThickness;
	private GeneralPath[] paths;
	private static ResourceBundle labelBundle;

	// Rollover related variables
	private GeneralPath rolloverPath, selectedPath;
	private boolean showRollovers;
	private Color rolloverColor, selectedColor;
	private Color systemColor;

	private String fontFamily;

	private int adjustWheel;
	private boolean adjustRollover;
	private boolean ctrlKeyDown;
	private double saturationMultipler;
	private double brightnessMultipler;

	/**
	 * Creates a new instance of ColorWheelPanel
	 */
	public ColorWheelPanel() {
		saturationMultipler = brightnessMultipler = 1.0;
		changeListeners = new ArrayList<ChangeListener>();
		adjustWheel = CTRL_ADJUST;
		adjustRollover = true;
		ctrlKeyDown = false;

		fontSmall = UIManager.getFont("ColorChooser.smallFont");
		if (fontSmall == null)
			fontSmall = new Font("Arial", 0, 9);

		fontFamily = fontSmall.getFamily();

		showRollovers = true;
		innerCircle = new Ellipse2D.Double(96, 96, 36, 36);
		outerCircle = new Ellipse2D.Double(6, 6, 214, 214);
		borderCircle = new Ellipse2D.Double(0, 0, 227, 227);

		fixedPanel = new JPanel();
		fixedPanel.setLayout(null);
		fixedPanel.setOpaque(false);
		// fixedPanel.setBackground( Color.white );
		fixedPanel.setBounds(0, 0, 255, 328);
		fixedPanel.setPreferredSize(new Dimension(255, 328));

		setLayout(new LayoutManager() {
			public void addLayoutComponent(String name, Component comp) {
			}

			public void removeLayoutComponent(Component comp) {
			}

			public void layoutContainer(Container parent) {
				Dimension fpp = fixedPanel.getPreferredSize();
				int dx = (parent.getWidth() - fpp.width) / 2;
				int dy = (parent.getHeight() - fpp.height) / 2;
				fixedPanel.setBounds(dx, dy, fpp.width, fpp.height);
			}

			public Dimension minimumLayoutSize(Container parent) {
				return preferredLayoutSize(parent);
			}

			public Dimension preferredLayoutSize(Container parent) {
				return fixedPanel.getPreferredSize();
			}

		});
		imagePicker = new ColorWheel();
		imagePicker.setBounds(0, 0, 228, 228);
		imagePicker.addMouseListener(this);
		imagePicker.addMouseMotionListener(this);
		imagePicker.setOpaque(false);
		imagePicker.addMouseWheelListener(this);
		fixedPanel.add(imagePicker);

		brightnessSlider = new JSlider(JSlider.VERTICAL);
		brightnessSlider.setBounds(230, 0, 25, 108);
		brightnessSlider.setMinimum(0);
		brightnessSlider.setMaximum(100);
		brightnessSlider.setValue(100);
		brightnessSlider.setOpaque(false);
		// brightnessSlider.setBackground( Color.white );
		brightnessSlider.setPaintLabels(true);
		brightnessSlider.addChangeListener(this);
		brightnessSlider.addMouseWheelListener(this);
		brightnessSlider.addMouseMotionListener(this);
		brightnessSlider.setToolTipText(getLabel("Xoetrope.ctrlDrag",
				"CTRL+drag to adjust the color wheel"));
		fixedPanel.add(brightnessSlider);

		resetBtn = new JButton() {
	        @Override
	        public Insets getInsets() {
	            return new Insets(0, 0, 0, 0);
	        }

	        @Override
	        public Insets getInsets(Insets insets) {
	            if (insets == null) {
	                insets = new Insets(0, 0, 0, 0);
	            }
	            insets.set(0, 0, 0, 0);
	            return insets;
	        }

	        @Override
	        public Dimension getPreferredSize() {
	            return new Dimension(10, 10);
	        }
		};
		resetBtn.setBounds(237, 109, 10, 10);
		resetBtn.setBackground(getBackground());
		resetBtn.addActionListener(this);

        // Create a transition-aware wrapper around our icon so that it is colorized
        // based on the color scheme that matches the current state of our toggle button
        resetBtn.setIcon(new TransitionAwareIcon(resetBtn,
                (SubstanceColorScheme scheme) -> SubstanceCortex.GlobalScope.getIconPack()
                        .getRefreshIcon(10, scheme),
                "Color wheel reset"));

		resetBtn.setToolTipText(getLabel("Xoetrope.reset",
				"Reset the color wheel saturation and brightness"));
        SubstanceCortex.ComponentOrParentScope.setButtonNeverPaintBackground(resetBtn, true);
        SubstanceCortex.ComponentOrParentChainScope.setFocusKind(resetBtn,
                SubstanceSlices.FocusKind.NONE);
		fixedPanel.add(resetBtn);

		saturationSlider = new JSlider(JSlider.VERTICAL);
		saturationSlider.setBounds(230, 120, 25, 110);
		saturationSlider.setMinimum(0);
		saturationSlider.setMaximum(100);
		saturationSlider.setValue(100);
		saturationSlider.setOpaque(false);
		// saturationSlider.setBackground( Color.white );
		saturationSlider.setInverted(true);
		saturationSlider.setPaintLabels(true);
		saturationSlider.addChangeListener(this);
		saturationSlider.addMouseWheelListener(this);
		saturationSlider.addMouseMotionListener(this);
		saturationSlider.setToolTipText(getLabel("Xoetrope.ctrlDrag",
				"CTRL+drag to adjust the color wheel"));
		fixedPanel.add(saturationSlider);

		useWebColors = new JCheckBox(getLabel("Xoetrope.webSafeColors",
				"Use web safe colors"));
		useWebColors.setBounds(8, 248, 140, 18);
		useWebColors.addActionListener(this);
		useWebColors.setOpaque(false);
		useWebColors.setFont(fontSmall);
		fixedPanel.add(useWebColors);

		decimalRGB = new JCheckBox(getLabel("Xoetrope.decimalRGB",
				"Decimal RGB"));
		decimalRGB.setBounds(143, 248, 118, 18);
		decimalRGB.addActionListener(this);
		decimalRGB.setOpaque(false);
		decimalRGB.setFont(fontSmall);
		fixedPanel.add(decimalRGB);

		baseColorLabel = new JLabel();
		baseColorLabel.setBounds(10, 268, 160, 20);
		baseColorLabel.setBackground(Color.red);
		baseColorLabel.setOpaque(true);
		baseColorLabel.setToolTipText(getLabel("Xoetrope.systemColorsTooltip",
				"Right click for system colours"));
		baseColorLabel.putClientProperty(SubstanceTextUtilities.ENFORCE_FG_COLOR, Boolean.TRUE);
		fixedPanel.add(baseColorLabel);
		baseColorLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent me) {
				showSystemColorList(me.getPoint());
			}
		});

		baseColorEdit = new JTextField();
		baseColorEdit.setBounds(180, 268, 75, 20);
		baseColorEdit.setOpaque(true);
		fixedPanel.add(baseColorEdit);
		baseColorEdit.addActionListener(this);
		Insets baseColorEditInsets = SubstanceSizeUtils.getTextBorderInsets(SubstanceSizeUtils
                .getComponentFontSize(baseColorEdit));
		baseColorEditInsets.top = 0;
		baseColorEditInsets.bottom = 0;
        baseColorEdit.setBorder(new CompoundBorder(
                new SubstanceTextComponentBorder(baseColorEditInsets),
                new BasicBorders.MarginBorder()));

		hueEdit = new JTextField();
		hueEdit.setBounds(10, 290, 75, 20);
		fixedPanel.add(hueEdit);
		hueEdit.setText("0");
		hueEdit.getDocument().addDocumentListener(
				new ColorDocumentListener(hueEdit));

		JLabel hueLabel = new JLabel(getLabel("Xoetrope.hue", "Hue")
				+ " \u00B0");
		hueLabel.setBounds(10, 310, 75, 20);
		hueLabel.setFont(fontSmall);
		fixedPanel.add(hueLabel);

		satEdit = new JTextField();
		satEdit.setBounds(95, 290, 75, 20);
		fixedPanel.add(satEdit);
		satEdit.setText("0");
		satEdit.getDocument().addDocumentListener(
				new ColorDocumentListener(satEdit));

		JLabel satLabel = new JLabel(getLabel("Xoetrope.saturation",
				"Saturation")
				+ " %");
		satLabel.setBounds(95, 310, 75, 20);
		satLabel.setFont(fontSmall);
		fixedPanel.add(satLabel);

		brightEdit = new JTextField();
		brightEdit.setBounds(180, 290, 75, 20);
		fixedPanel.add(brightEdit);
		brightEdit.setText("0");
		brightEdit.getDocument().addDocumentListener(
				new ColorDocumentListener(brightEdit));

		JLabel brightnessLabel = new JLabel(getLabel("Xoetrope.brightness",
				"Brightness")
				+ " %");
		brightnessLabel.setBounds(180, 310, 75, 20);
		brightnessLabel.setFont(fontSmall);
		fixedPanel.add(brightnessLabel);

		add(fixedPanel);
	}

	/**
	 * Set the reference to the selected colours for the colour scheme
	 * 
	 * @param clrs
	 *            the colors
	 */
	public void setSelectedColors(ModelColor[] clrs) {
		selectedIttenColours = clrs;
	}

	/**
	 * Add a listener for changes in the selected color
	 * 
	 * @param l
	 *            the change listener to add
	 */
	public void addChangeListener(ChangeListener l) {
		changeListeners.add(l);
	}

	/**
	 * Remove a change listener
	 * 
	 * @param l
	 *            the change listener to remove
	 */
	public void removeChangeListener(ChangeListener l) {
		changeListeners.remove(l);
	}

	/**
	 * Has the user selected the use decimal rgb checkbox?
	 * 
	 * @return true if decimal rgb values are to be shown
	 */
	public boolean useDecimalRGB() {
		return decimalRGB.isSelected();
	}

	/**
	 * Has the user selected the use web safe colors checkbox?
	 * 
	 * @return true if only web safe colors are to be shown
	 */
	public boolean useWebColors() {
		return useWebColors.isSelected();
	}

	/**
	 * Set the display of the color scheme markers.
	 * 
	 * @param disp
	 *            true to display the color scheme markers.
	 */
	public void setDisplayScheme(boolean disp) {
		displayScheme = disp;
	}

	/**
	 * Get the selected colors hue
	 * 
	 * @return the selected hue in the range 0-255
	 */
	public int getHue() {
		try {
			return Integer.parseInt(hueEdit.getText());
		} catch (NumberFormatException e) {
		}

		return 128;
	}

	/**
	 * Set the selected hue
	 * 
	 * @param h
	 *            the selected hue in the range 0-255
	 */
	public void setHue(int h) {
		try {
			if (h < 0)
				h = 360 + h;

			int selHue = Math.max(0, Math.min(h, 360));
			hueEdit.setText(Integer.toString(selHue));
			resetColor();
		} catch (NumberFormatException e) {
		}
	}

	/**
	 * Get the selected colors saturation
	 * 
	 * @return the selected saturation in the range 0-255
	 */
	public int getSaturation() {
		try {
			return Integer.parseInt(satEdit.getText());
		} catch (NumberFormatException e) {
		}

		return 128;
	}

	/**
	 * Get the selected colors brightness
	 * 
	 * @return the selected brightness in the range 0-255
	 */
	public int getBrightness() {
		try {
			return Integer.parseInt(brightEdit.getText());
		} catch (NumberFormatException e) {
		}

		return 128;
	}

	/**
	 * Set the Itten color scheme to use
	 * 
	 * @param scheme
	 *            <ul>
	 *            <li>-1 for no scheme display</li>
	 *            <li>0 for a monchromatic color scheme: MONOCHROMATIC_SCHEME</li>
	 *            <li>1 for a contrasting color scheme: CONTRASTING_SCHEME</li>
	 *            <li>2 for a soft-contrasting color scheme:
	 *            SOFT_CONTRAST_SCHEME</li>
	 *            <li>3 for a double contrasting color scheme:
	 *            DOUBLE_CONTRAST_SCHEME</li>
	 *            <li>4 for a analogical color scheme: ANALOGIC_SCHEME</li>
	 *            </ul>
	 */
	public void setColorScheme(int scheme) {
		colorScheme = scheme;
	}

	/**
	 * Change the hue to match the angle identified by the point (in the inner
	 * circle).
	 * 
	 * @param pt
	 *            the point within the inner circle
	 */
	boolean moveHue(Point pt) {
		if ((borderCircle.contains(pt) && !outerCircle.contains(pt))
				|| innerCircle.contains(pt)) {
			int h = getAngle(pt);
			hueEdit.setText(Integer.toString(h));
			selectedPath = null;
			resetColor();
			return true;
		}
		return false;
	}

	private int getAngle(Point pt) {
		int eX = (pt.x > 0) ? pt.x : 96;
		int eY = (pt.y > 0) ? pt.y : 96;
		int x = eX - 112;
		int y = eY - 114;
		return (int) (Math
				.round(((Math.atan2(-x, y) * 180.0 / Math.PI) + 180.0) % 360.0));
	}

	public void setColor(Color c) {
		systemColor = null;

		if (c != null) {
			int r = c.getRed();
			int g = c.getGreen();
			int b = c.getBlue();
			if (useWebColors.isSelected()) {
				r = Math.round(r / 51) * 51;
				g = Math.round(g / 51) * 51;
				b = Math.round(b / 51) * 51;
			}
			chooserColor = new ModelColor(r, g, b);
		}
		// else
		c = new Color(chooserColor.R, chooserColor.G, chooserColor.B);

		values = Color.RGBtoHSB(c.getRed(), c.getGreen(), c.getBlue(), values);
		if (values[1] == 0.0F) {
			s = values[1];
			b = values[2];
		} else if (values[2] == 0.0F) {
			b = values[2];
		} else {
			h = values[0];
			s = values[1];
			b = values[2];
		}
		h = Math.min(Math.max(h, 0.0), 1.0);
		s = Math.min(Math.max(s, 0.0), 1.0);
		b = Math.min(Math.max(b, 0.0), 1.0);

		if (values[1] != 0.0F) {
			if (values[1] != 0.0F)
				setHue();
			setSaturation();
		}
		setBrightness();

		busy = true;
		brightnessSlider.setValue(Integer.parseInt(brightEdit.getText()));
		saturationSlider.setValue(Integer.parseInt(satEdit.getText()));
		busy = false;

		baseColorLabel.setBackground(new Color(chooserColor.R, chooserColor.G,
				chooserColor.B));

		if (SubstanceColorUtilities.getColorBrightness(
				baseColorLabel.getBackground().getRGB()) < 128)
			baseColorLabel.setForeground(Color.white);
		else
			baseColorLabel.setForeground(Color.black);

		String colorStr;
		if (decimalRGB.isSelected()) {
			// Output decimal values
			colorStr = " " + Integer.toString(c.getRed()) + "."
					+ Integer.toString(c.getGreen()) + "."
					+ Integer.toString(c.getBlue());
		} else {
			// Output HEX values
			colorStr = " " + ModelColor.toHexString(c.getRed())
					+ ModelColor.toHexString(c.getGreen())
					+ ModelColor.toHexString(c.getBlue());
		}
		baseColorLabel.setText(colorStr);
		baseColorEdit.setText(colorStr);

		ChangeEvent evt = new ChangeEvent(this);
		int numListeners = changeListeners.size();
		for (int i = 0; i < numListeners; i++) {
			ChangeListener l = changeListeners.get(i);
			l.stateChanged(evt);
		}

		if (hasChooser)
			getColorSelectionModel().setSelectedColor(c);
	}

	/**
	 * Get the selected color
	 * 
	 * @return the color
	 */
	public Color getColor() {
		return new Color(chooserColor.R, chooserColor.G, chooserColor.B);
	}

	/**
	 * Get the chooser color
	 * 
	 * @param return
	 *            the chooser color
	 */
	public ModelColor getChooserColour() {
		return chooserColor;
	}

	/**
	 * Set the value of the hue edit to match the current color
	 */
	private void setHue() {
		hueEdit.setText(Integer.toString(chooserColor.getHue()));
	}

	/**
	 * Set the value of the saturation edit to match the current color
	 */
	private void setSaturation() {
		satEdit.setText(Integer.toString((int) (100.0 * chooserColor.S)));
	}

	/**
	 * Set the value of the brightness edit to match the current color
	 */
	private void setBrightness() {
		brightEdit.setText(Integer.toString((int) (100.0 * chooserColor.V)));
	}

	/**
	 * Respond to action events for the edit fields
	 */
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == resetBtn)
			resetColorWheel();
		else if (source instanceof JMenuItem) {
			// A popup menu item has been selected
			Color sysColor = getSystemColor(((JMenuItem) source).getText());
			if (sysColor != null)
				setColor(sysColor);

			resetColor();
			systemColor = sysColor;
			if (hasChooser) {
				hasChooser = false;
				getColorSelectionModel().setSelectedColor(systemColor);
				hasChooser = true;
			}
			return;
		} else if (source == useWebColors) {
			boolean snap = useWebColors.isSelected();
			chooserColor.setWebSnap(snap);
			if (snap)
				resetColor();
			else {
				// Drop through to the next block to reset the internal color values
				source = baseColorEdit;
			}
		} else if (source == baseColorEdit) {
			String hex = baseColorEdit.getText().trim();
			if (hex.length() == 0)
				resetColor();
			else if (decimalRGB.isSelected()) {
				int pos = 0;
				try {
					int r = 255;
					int g = 0;
					int b = 0;
					int pos2 = hex.indexOf('.', pos);
					if (pos2 > 0) {
						r = Integer.parseInt(hex.substring(pos, pos2));
						pos = ++pos2;
						pos2 = hex.indexOf('.', pos);
						if (pos2 > 0) {
							g = Integer.parseInt(hex.substring(pos, pos2));
							pos = ++pos2;
							if (pos2 < hex.length())
								b = Integer.parseInt(hex.substring(pos));
						}
					}
					setColor(new Color(r, g, b));
				} catch (NumberFormatException nfe) {
					setColor(Color.red);
					baseColorEdit.setText("255.0.0");
				}
			} else {
				for (int i = hex.length(); i < 6; i++)
					hex += "0";
				try {
					setColor(new Color(ModelColor.hex2dec(hex.substring(0, 2)),
							ModelColor.hex2dec(hex.substring(2, 4)), ModelColor
									.hex2dec(hex.substring(4, 6))));
				} catch (NumberFormatException nfe) {
					setColor(Color.red);
					baseColorEdit.setText("FF0000");
				}
			}
		} else
			resetColor();
	}

	/**
	 * Reset the displayed color to the color specified by the edit fields
	 */
	private void resetColor() {
		if (chooserColor != null) {
			if (!busy) {
				busy = true;
				int h = 0;
				try {
					h = Integer.parseInt(hueEdit.getText());
					selectedPath = null;
				} catch (NumberFormatException nfe) {
					hueEdit.setText("0");
				}
				if (h >= 360) {
					h = h % 360;
					hueEdit.setText(Integer.toString(h));
				}
				if (h < 0) {
					h = (int) ((h + (Math.floor(-h / 360) + 1) * 360) % 360);
					hueEdit.setText(Integer.toString(h));
				}

				double s = 1.0;
				try {
					s = Integer.parseInt(satEdit.getText()) / 100.0;
				} catch (NumberFormatException nfe) {
					satEdit.setText("100");
				}
				if (s > 1 || s < 0) {
					s = (s < 0) ? 0 : 1;
					satEdit.setText(Integer.toString((int) (s * 100.0)));
				}

				double v = 1.0;
				try {
					v = Integer.parseInt(brightEdit.getText()) / 100.0;
				} catch (NumberFormatException nfe) {
					brightEdit.setText("100");
				}

				if (v > 1 || v < 0) {
					v = (v < 0) ? 0 : 1;
					brightEdit.setText(Integer.toString((int) (v * 100.0)));
				}

				if (shouldAdjustWheel()) {
					saturationMultipler = s;
					brightnessMultipler = v;
				}

				if (selectedIttenColours != null)
					selectedIttenColours[0].setHSV(h, s, v);
				chooserColor.setHSV(h, s, v);
				busy = false;
			}
			setColor(null);
		}
	}

	/**
	 * Invoked when the mouse button has been clicked (pressed and released) on
	 * a component.
	 */
	public void mouseClicked(MouseEvent e) {
		Object src = e.getSource();
		if (src == imagePicker) {
			Point pt = e.getPoint();

			if (borderCircle.contains(pt)) {
				selectedColor = rolloverColor;
				selectedPath = rolloverPath;
				if (!moveHue(pt)) {
					if (outerCircle.contains(pt)) {
						int width = imagePicker.getWidth();
						int center = width / 2;
						int dx = Math.abs(pt.x - center);
						int dy = Math.abs(pt.y - center);
						double dr = Math.pow((dx * dx + dy * dy), 0.5);
						dr -= ringThickness * 1.5;
						int bandIdx = (int) (dr / ringThickness);

						int hue = 0;
						int bandOffset = bandIdx * ModelColor.NUM_SEGMENTS;
						for (int i = 0; i < ModelColor.NUM_SEGMENTS; i++) {
							if (paths[bandOffset + i].contains(pt))
								hue = i * 15;
						}

						int hueInc = (hue / 15) % 2;
						// hue -= hue % 15;
						ModelColor mc = new ModelColor(hue,
								ModelColor.SATURATION_BANDS[bandIdx],
								ModelColor.BRIGHTNESS_BANDS[bandIdx + 1
										- hueInc]);
						mc = new ModelColor(mc.H, saturationMultipler * mc.S,
								brightnessMultipler * mc.V);
						Color pixelColor = new Color(mc.getRed(),
								mc.getGreen(), mc.getBlue());
						if (!pixelColor.equals(Color.white))
							setColor(pixelColor);
					}
				}
			}
		}
		// repaint for synchronizing the hue marker
		if (displayScheme)
			imagePicker.repaint();
	}

	/**
	 * Invoked when a mouse button has been pressed on a component.
	 */
	public void mousePressed(MouseEvent e) {
		imagePicker.repaint();
	}

	/**
	 * Invoked when a mouse button has been released on a component.
	 */
	public void mouseReleased(MouseEvent e) {
	}

	/**
	 * Invoked when the mouse enters a component.
	 */
	public void mouseEntered(MouseEvent e) {
	}

	/**
	 * Invoked when the mouse exits a component.
	 */
	public void mouseExited(MouseEvent e) {
		rolloverPath = null;
		repaint();
	}

	/**
	 * Invoked when the mouse exits a component.
	 */
	public void mouseMoved(MouseEvent e) {
		GeneralPath oldPath = rolloverPath;
		rolloverPath = null;
		if (e.getSource() == imagePicker) {
			Point pt = e.getPoint();
			if (paths != null) {
				int numPaths = paths.length;
				for (int i = 0; i < numPaths; i++) {
					if (paths[i].contains(pt.x, pt.y)) {
						rolloverPath = paths[i];
						ModelColor[][] baseColors = ModelColor.getBaseColors();
						int ring = i / ModelColor.NUM_SEGMENTS;
						ModelColor modelColor = baseColors[i
								% ModelColor.NUM_SEGMENTS][ring];
						if (adjustRollover)
							modelColor = new ModelColor(modelColor.H,
									saturationMultipler * modelColor.S,
									brightnessMultipler * modelColor.V);

						rolloverColor = new Color(modelColor.getRed(),
								modelColor.getGreen(), modelColor.getBlue());
						if (ring < 4)
							rolloverColor = rolloverColor.darker();
						else
							rolloverColor = rolloverColor.brighter().brighter();
						break;
					}
				}
			}
		}

		if (rolloverPath != oldPath)
			repaint();
	}

	/**
	 * Move the sliders in rsponse to the mouse wheel
	 */
	public void mouseWheelMoved(MouseWheelEvent e) {
		Object src = e.getSource();
		ctrlKeyDown = e.isControlDown();
		int notches = e.getWheelRotation();

		if (src == brightnessSlider) {
			brightnessSlider
					.setValue(brightnessSlider.getValue() - 2 * notches);
		} else if (src == saturationSlider) {
			saturationSlider
					.setValue(saturationSlider.getValue() + 2 * notches);
		} else if (src == imagePicker) {
			setHue(getHue() + 2 * notches);
		}

		ctrlKeyDown = false;
	}

	/**
	 * Invoked when the mouse exits a component.
	 */
	public void mouseDragged(MouseEvent e) {
		ctrlKeyDown = e.isControlDown();
	}

	/**
	 * Invoked when the target of the listener has changed its state.
	 * 
	 * @param e
	 *            a ChangeEvent object
	 */
	public void stateChanged(ChangeEvent e) {
		Object source = e.getSource();
		if (source == saturationSlider) {
			satEdit.setText(Integer.toString(saturationSlider.getValue()));
			resetColor();
		} else if (source == brightnessSlider) {
			brightEdit.setText(Integer.toString(brightnessSlider.getValue()));
			resetColor();
		}

		if (hasChooser) {
			getColorSelectionModel().setSelectedColor(
					new Color(chooserColor.getRed(), chooserColor.getGreen(),
							chooserColor.getBlue()));
		}

		ctrlKeyDown = false;
	}

	@Override
	protected void buildChooser() {
	}

	@Override
	public String getDisplayName() {
		return "Xoetrope Color Wheel";
	}

	@Override
	public SubstanceIconUIResource getHiDpiAwareIcon(int size, SubstanceColorScheme colorScheme) {
        return SubstanceCortex.GlobalScope.getIconPack().getColorChooserImagePalettesIcon(size,
                colorScheme);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(255, 328);
	}

	@Override
	public void updateChooser() {
		if (hasChooser) {
			Color selected = getColorFromModel();
			ModelColor selectedModelColor = new ModelColor(selected.getRed(),
					selected.getGreen(), selected.getBlue());
			setSelectedColors(new ModelColor[] { selectedModelColor });
			setColor(selected);
		}
	}

	@Override
	public void installChooserPanel(JColorChooser enclosingChooser) {
		hasChooser = (enclosingChooser != null);

		super.installChooserPanel(enclosingChooser);
		// if runs in the color chooser, set the hue marker
		this.setDisplayScheme(true);
	}

	// -ColorWheel inner
	// class------------------------------------------------------
	/**
	 * A class that wraps the image of the color wheel and draws markers for the
	 * selected color scheme
	 */
	class ColorWheel extends JLabel {
		public ColorWheel() {
		}

		/**
		 * Draw markers for the selected color scheme
		 */
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			paintWheel((Graphics2D) g);

			if (displayScheme) {
				double x, y;

				int selIdx = colorScheme;// > 0 ? 1 : 0;
				int numColours = Math.min(selIdx + 1, 4);
				for (int i = 0; i < numColours; i++) {
					double r = (selectedIttenColours[i].H - 90.0) / 360.0 * 2.0
							* Math.PI;
					x = Math.round(111.0 + 110.0 * Math.cos(r));
					y = Math.round(111.0 + 110.0 * Math.sin(r));
					g.setColor(Color.gray);
					g.fillOval((int) x, (int) y, 4, 4);
					g.setColor(Color.darkGray);
					g.drawOval((int) x, (int) y, 4, 4);
				}
			}
		}

		public void paintWheel(Graphics2D g2d) {
			// Store the paths for detecting the area with the mouse click.
			if (paths == null)
				paths = new GeneralPath[ModelColor.NUM_COLOR_RINGS
						* ModelColor.NUM_SEGMENTS];

			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
					RenderingHints.VALUE_RENDER_QUALITY);

			ModelColor[][] baseColors = ModelColor.getBaseColors();
			int idx = 0;
			double width = getWidth() - 1;
			double center = width / 2.0;
			ringThickness = width / ((ModelColor.NUM_COLOR_RINGS + 2) * 2);
			double fontHeight = ringThickness / 2.0;
			double inset = ringThickness / 2.0;

			// Paint the outer band
			g2d.setColor(new Color(228, 228, 228));
			Arc2D.Double innerArc = new Arc2D.Double(inset, inset, width
					- inset - inset, width - inset - inset, 0.0, 360.0,
					Arc2D.OPEN);
			Arc2D.Double outerArc = new Arc2D.Double(0.0, 0.0, width, width,
					360.0, -360.0, Arc2D.OPEN);
			GeneralPath gp = new GeneralPath();
			gp.append(innerArc, true);
			gp.append(outerArc, true);
			gp.closePath();
			g2d.fill(gp);

			g2d.setColor(Color.black);
			g2d.setStroke(new BasicStroke(0.3F));
			g2d.draw(outerArc);

			// Paint the inner yellow arc
			g2d.setColor(new Color(255, 253, 220));
			innerArc = new Arc2D.Double(center - ringThickness / 2.0, center
					- ringThickness / 2.0, ringThickness, ringThickness, -30.0,
					180.0, Arc2D.OPEN);
			outerArc = new Arc2D.Double(center - ringThickness, center
					- ringThickness, ringThickness * 2, ringThickness * 2,
					150.0, -180.0, Arc2D.OPEN);
			gp = new GeneralPath();
			gp.append(innerArc, true);
			gp.append(outerArc, true);
			gp.closePath();
			g2d.fill(gp);

			// Paint the inner blue arc
			g2d.setColor(new Color(202, 230, 252));
			innerArc = new Arc2D.Double(center - ringThickness / 2.0, center
					- ringThickness / 2.0, ringThickness, ringThickness, 150.0,
					180.0, Arc2D.OPEN);
			outerArc = new Arc2D.Double(center - ringThickness, center
					- ringThickness, ringThickness * 2, ringThickness * 2,
					330.0, -180.0, Arc2D.OPEN);
			gp = new GeneralPath();
			gp.append(innerArc, true);
			gp.append(outerArc, true);
			gp.closePath();
			g2d.fill(gp);

			// Draw the 'dial'
			g2d.setColor(Color.black);
			AffineTransform identityTransform = g2d.getTransform();
			AffineTransform at = ((AffineTransform) identityTransform.clone());
			at.translate(center, center);
			at.rotate(Math.PI / 6.0);
			g2d.setTransform(at);

			gp = new GeneralPath();
			gp.moveTo((float) (-ringThickness / 2.0), 0.0F);
			gp.lineTo((float) (-ringThickness * 1.2), 0.0F);
			gp.lineTo((float) (-ringThickness * 1.2), (float) (-fontHeight));
			gp.lineTo((float) (-ringThickness * 1.4),
					(float) (-fontHeight + ringThickness * 0.2));
			gp.moveTo((float) (-ringThickness * 1.2), (float) (-fontHeight));
			gp.lineTo((float) (-ringThickness),
					(float) (-fontHeight + ringThickness * 0.2));
			g2d.draw(gp);

			gp = new GeneralPath();
			gp.moveTo((float) (ringThickness / 2.0), 0.0F);
			gp.lineTo((float) (ringThickness * 1.2), 0.0F);
			gp.lineTo((float) (ringThickness * 1.2), (float) (fontHeight));
			gp.lineTo((float) (ringThickness * 1.4),
					(float) (fontHeight - ringThickness * 0.2));
			gp.moveTo((float) (ringThickness * 1.2), (float) (fontHeight));
			gp.lineTo((float) (ringThickness),
					(float) (fontHeight - ringThickness * 0.2));
			g2d.draw(gp);

			// Draw the tick marks
			double r1 = center;
			double r2 = r1 - fontHeight;
			double r3 = r1 - ringThickness / 2.3;
			double r4 = r1 + ringThickness / 2.7;

			// The angles for cos and sin are in radians
			double inc = Math.PI / 12.0;
			// double fullArc = Math.PI * 2.0;
			g2d.setColor(Color.black);
			for (int i = 0; i < ModelColor.NUM_SEGMENTS; i++) {
				double angle = i * inc;
				double sin = Math.sin(angle);
				double cos = Math.cos(angle);
				gp = new GeneralPath();
				if ((width > 200) && (i % 2 == 0)) {
					AttributedString as = new AttributedString(""
							+ (((i * 15) + 90) % 360) + "°");
					as.addAttribute(TextAttribute.FAMILY, fontFamily);
					as.addAttribute(TextAttribute.SIZE, (float) (fontHeight));
					as.addAttribute(TextAttribute.FOREGROUND, Color.black);
					at = ((AffineTransform) identityTransform.clone());
					at.translate((center + fontHeight / 5.0 + r3 * cos),
							(center + r3 * sin));
					at.rotate(angle + Math.PI / 2.0);
					g2d.setTransform(at);
					g2d.drawString(as.getIterator(), 0.0F, 0.0F);
				} else {
					g2d.setTransform(identityTransform);
					gp.moveTo((float) (center + r1 * cos), (float) (center + r1
							* sin));
					gp.lineTo((float) (center + r2 * cos), (float) (center + r2
							* sin));
					g2d.draw(gp);
				}
			}

			// Paint the rings / star
			// int pathIdx = 0;
			for (int i = 0; i < ModelColor.NUM_COLOR_RINGS; i++) {
				double outerX = inset + (ModelColor.NUM_COLOR_RINGS - (i + 1))
						* ringThickness;
				double outerW = width - outerX - outerX;
				double innerX = outerX + ringThickness;
				double innerW = outerW - 2 * ringThickness;
				for (int j = 0; j < ModelColor.NUM_SEGMENTS; j++) {
					ModelColor modelColor = baseColors[j][i];
					modelColor = new ModelColor(modelColor.H,
							saturationMultipler * modelColor.S,
							brightnessMultipler * modelColor.V);
					Color c = new Color(modelColor.getRed(), modelColor
							.getGreen(), modelColor.getBlue());
					g2d.setColor(c);
					double startAngle = ((82.5 - (j * 15.0)) + 360) % 360.0;

					double delta1 = j % 2 == 0 ? arcDelta[i] : -arcDelta[i];
					double delta2 = j % 2 == 0 ? arcDelta[i + 1]
							: -arcDelta[i + 1];
					innerArc = new Arc2D.Double(innerX, innerX, innerW, innerW,
							startAngle + delta1, 15.0 - 2.0 * delta1,
							Arc2D.OPEN);
					outerArc = new Arc2D.Double(outerX, outerX, outerW, outerW,
							startAngle + 15.0 - delta2, -15.0 + 2.0 * delta2,
							Arc2D.OPEN);
					gp = new GeneralPath();
					gp.append(innerArc, true);
					gp.append(outerArc, true);
					gp.closePath();

					g2d.fill(gp);
					paths[idx++] = gp;
				}
			}

			// Paint the labels
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_OFF);
			g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
					RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			if (width > 200) {
				double angle = (Math.PI / 6.0) - (Math.PI / 2.0);
				double angle2 = angle - 0.055;
				double sin = Math.sin(angle2);
				double cos = Math.cos(angle2);

				AttributedString as = new AttributedString(getLabel(
						"Xoetrope.warm", "WARM"));
				as.addAttribute(TextAttribute.FAMILY, fontFamily);
				as.addAttribute(TextAttribute.SIZE,
						(float) (ringThickness / 1.5));
				as.addAttribute(TextAttribute.FOREGROUND, new Color(92, 0, 0));
				at = ((AffineTransform) identityTransform.clone());
				at.translate((center + fontHeight / 5.0 + r4 * cos),
						(center + r4 * sin));
				at.rotate(angle + Math.PI / 2.0 + 0.05);
				g2d.setTransform(at);
				g2d.drawString(as.getIterator(), 0.0F, 0.0F);

				angle += Math.PI;
				sin = Math.sin(angle);
				cos = Math.cos(angle);
				as = new AttributedString(getLabel("Xoetrope.cold", "COLD"));
				as.addAttribute(TextAttribute.FAMILY, fontFamily);
				as.addAttribute(TextAttribute.SIZE,
						(float) (ringThickness / 1.5));
				as.addAttribute(TextAttribute.FOREGROUND, new Color(0, 0, 92));
				at = ((AffineTransform) identityTransform.clone());
				at.translate((center + fontHeight / 5.0 + r4 * cos),
						(center + r4 * sin));
				at.rotate(angle + Math.PI / 2.0 + 0.05);
				g2d.setTransform(at);
				g2d.drawString(as.getIterator(), 0.0F, 0.0F);

				angle = Math.PI;
				sin = Math.sin(angle);
				cos = Math.cos(angle);
				as = new AttributedString(getLabel("Xoetrope.saturation",
						"Saturation"));
				as.addAttribute(TextAttribute.FAMILY, fontFamily);
				as.addAttribute(TextAttribute.SIZE,
						(float) (ringThickness / 1.3));
				as.addAttribute(TextAttribute.FOREGROUND, UIManager
						.getColor("Label.foreground"));
				at = ((AffineTransform) identityTransform.clone());
				at.translate((width - fontHeight), (width));
				at.rotate(angle + Math.PI / 2.0);
				g2d.setTransform(at);
				g2d.drawString(as.getIterator(), 0.0F, 0.0F);

				String brightnessText = getLabel("Xoetrope.brightness",
						"Brightness");
				as = new AttributedString(brightnessText);
				as.addAttribute(TextAttribute.FAMILY, fontFamily);
				as.addAttribute(TextAttribute.SIZE,
						(float) (ringThickness / 1.3));
				as.addAttribute(TextAttribute.FOREGROUND, UIManager
						.getColor("Label.foreground"));
				at = ((AffineTransform) identityTransform.clone());
				at.translate((width - fontHeight), (ringThickness
						* brightnessText.length() / 2.3));
				at.rotate(angle + Math.PI / 2.0);
				g2d.setTransform(at);
				g2d.drawString(as.getIterator(), 0.0F, 0.0F);
			}
			g2d.setTransform(identityTransform);

			if (showRollovers) {
				g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
						RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);
				if (rolloverPath != null) {
					g2d.setColor(rolloverColor);
					g2d.setStroke(new BasicStroke(1.5F));
					g2d.draw(rolloverPath);
				}
				if (selectedPath != null) {
					g2d.setColor(selectedColor);
					g2d.setStroke(new BasicStroke(1.0F));
					g2d.draw(selectedPath);
				}
			}
		}
	}

	// End ColorWheel inner class
	// ------------------------------------------------

	// ----------------------------------------------------------------------------
	private class ColorDocumentListener implements DocumentListener {
		private JTextField originator;

		private static final String MARKER = "Xoetrope.XUI.ColorWheel.DocumentEvent";

		public ColorDocumentListener(JTextField originator) {
			this.originator = originator;
		}

		/**
		 * This method is called after an insert into the document
		 */
		public void insertUpdate(DocumentEvent evt) {
			synchronize(evt);
		}

		/**
		 * This method is called after a removal from the document
		 */
		public void removeUpdate(DocumentEvent evt) {
			synchronize(evt);
		}

		/**
		 * This method is called after one or more attributes have changed. This
		 * method is not called when characters are inserted with attributes.
		 */
		public void changedUpdate(DocumentEvent evt) {
			synchronize(evt);
		}

		public void synchronize(DocumentEvent evt) {
			boolean _hasAllValues = true;
			if (hueEdit.getText().length() == 0)
				_hasAllValues = false;
			if (brightEdit.getText().length() == 0)
				_hasAllValues = false;
			if (satEdit.getText().length() == 0)
				_hasAllValues = false;

			final boolean hasAllValues = _hasAllValues;
            SwingUtilities.invokeLater(() -> {
                useWebColors.setEnabled(hasAllValues);
                decimalRGB.setEnabled(hasAllValues);
            });

            SwingUtilities.invokeLater(() -> {
                // the below use of client property is to prevent
                // infinite event loop (resetColor evetually changes
                // the text boxes)
                if (hasAllValues && originator.hasFocus()) {
                    if (Boolean.TRUE.equals(originator.getClientProperty(MARKER))) {
                        originator.putClientProperty(MARKER, null);
                    } else {
                        originator.putClientProperty(MARKER, Boolean.TRUE);
                        resetColor();
                    }
                }
                // repaint for synchronizing the hue marker
                if (displayScheme)
                    imagePicker.repaint();
            });
        }
	}

	// ----------------------------------------------------------------------------
	public static void setLabelBundle(ResourceBundle labelBundle) {
		ColorWheelPanel.labelBundle = labelBundle;
	}

	private static String getLabel(String labelName, String defaultValue) {
		if (ColorWheelPanel.labelBundle == null)
			return defaultValue;

		try {
			return ColorWheelPanel.labelBundle.getString(labelName);
		} catch (MissingResourceException mre) {
			return defaultValue;
		}
	}

	/**
	 * Show a popup menu with the list of system colors
	 * 
	 * @param p
	 *            the location to display the popup
	 */
	private void showSystemColorList(Point p) {
		JPopupMenu popupMenu = new JPopupMenu();
		String[] systemColors = { "activeCaption", "desktop",
				"activeCaptionText", "activeCaptionBorder", "inactiveCaption",
				"inactiveCaptionText", "inactiveCaptionBorder", "window",
				"windowBorder", "windowText", "menu", "menuText", "text",
				"textText", "textHighlight", "textHighlightText",
				"textInactiveText", "control", "controlText",
				"controlHighlight", "controlLtHighlight", "controlShadow",
				"controlDkShadow", "scrollbar", "info", "infoText", "white",
				"lightGray", "gray", "darkGray", "black", "red", "pink",
				"orange", "yellow", "green", "magenta", "cyan", "blue" };

		for (int i = 0; i < systemColors.length; i++) {
			if (systemColors[i].equals("white")) {
				popupMenu.addSeparator();
				continue;
			}

			JMenuItem mi = new JMenuItem(systemColors[i]);
			mi.addActionListener(this);

			BufferedImage image = new BufferedImage(8, 8,
					BufferedImage.TYPE_INT_RGB);
			Graphics g = image.getGraphics();
			g.setColor(getSystemColor(systemColors[i]));
			g.fillRect(0, 0, 8, 8);
			g.setColor(SystemColor.windowBorder);
			g.drawRect(0, 0, 7, 7);
			g.dispose();
			Icon icon = new ImageIcon(image);
			mi.setIcon(icon);
			popupMenu.add(mi);
		}

		popupMenu.show(this, p.x, p.y);
	}

	/**
	 * Get the named system color
	 * 
	 * @param name
	 *            the color name
	 * @retrun the color value or null if the name is not recognized
	 */
	public Color getSystemColor(String temp) {
		Color clr = null;
		if (temp.equals("activeCaption"))
			clr = SystemColor.activeCaption;
		else if (temp.equals("desktop"))
			clr = SystemColor.desktop;
		else if (temp.equals("activeCaptionText"))
			clr = SystemColor.activeCaptionText;
		else if (temp.equals("activeCaptionBorder"))
			clr = SystemColor.activeCaptionBorder;
		else if (temp.equals("inactiveCaption"))
			clr = SystemColor.inactiveCaption;
		else if (temp.equals("inactiveCaptionText"))
			clr = SystemColor.inactiveCaptionText;
		else if (temp.equals("inactiveCaptionBorder"))
			clr = SystemColor.inactiveCaptionBorder;
		else if (temp.equals("window"))
			clr = SystemColor.window;
		else if (temp.equals("windowBorder"))
			clr = SystemColor.windowBorder;
		else if (temp.equals("windowText"))
			clr = SystemColor.windowText;
		else if (temp.equals("menu"))
			clr = SystemColor.menu;
		else if (temp.equals("menuText"))
			clr = SystemColor.menuText;
		else if (temp.equals("text"))
			clr = SystemColor.text;
		else if (temp.equals("textText"))
			clr = SystemColor.textText;
		else if (temp.equals("textHighlight"))
			clr = SystemColor.textHighlight;
		else if (temp.equals("textHighlightText"))
			clr = SystemColor.textHighlightText;
		else if (temp.equals("textInactiveText"))
			clr = SystemColor.textInactiveText;
		else if (temp.equals("control"))
			clr = SystemColor.control;
		else if (temp.equals("controlText"))
			clr = SystemColor.controlText;
		else if (temp.equals("controlHighlight"))
			clr = SystemColor.controlHighlight;
		else if (temp.equals("controlLtHighlight"))
			clr = SystemColor.controlLtHighlight;
		else if (temp.equals("controlShadow"))
			clr = SystemColor.controlShadow;
		else if (temp.equals("controlDkShadow"))
			clr = SystemColor.controlDkShadow;
		else if (temp.equals("scrollbar"))
			clr = SystemColor.scrollbar;
		else if (temp.equals("info"))
			clr = SystemColor.info;
		else if (temp.equals("infoText"))
			clr = SystemColor.infoText;

		else if (temp.equals("white"))
			clr = Color.white;
		else if (temp.equals("lightGray"))
			clr = Color.lightGray;
		else if (temp.equals("gray"))
			clr = Color.gray;
		else if (temp.equals("darkGray"))
			clr = Color.darkGray;
		else if (temp.equals("black"))
			clr = Color.black;
		else if (temp.equals("red"))
			clr = Color.red;
		else if (temp.equals("pink"))
			clr = Color.pink;
		else if (temp.equals("orange"))
			clr = Color.orange;
		else if (temp.equals("yellow"))
			clr = Color.yellow;
		else if (temp.equals("green"))
			clr = Color.green;
		else if (temp.equals("magenta"))
			clr = Color.magenta;
		else if (temp.equals("cyan"))
			clr = Color.green;
		else if (temp.equals("blue"))
			clr = Color.blue;

		return clr;
	}

	/**
	 * Should the color wheel's colors be adjusted
	 * 
	 * @return true if the colors should change to match the brightness and
	 *         saturation
	 */
	private boolean shouldAdjustWheel() {
		if (adjustWheel == NEVER_ADJUST)
			return false;
		else if (adjustWheel == ALWAYS_ADJUST)
			return true;
		else if (ctrlKeyDown)
			return true;

		return false;
	}

	/**
	 * Get the adjust color wheel flag.
	 * 
	 * @return the adjustment mode
	 */
	public int getAdjustWheel() {
		return adjustWheel;
	}

	/**
	 * Set the adjust color wheel flag.
	 * 
	 * @param state
	 *            the color wheel's new adjustment mode ( CTRL_ADJUST |
	 *            ALWAYS_ADJUST | NEVER_ADJUST );
	 */
	public void setAdjustWheel(int state) {
		adjustWheel = state;
	}

	/**
	 * Get the adjust rollover color flag.
	 * 
	 * @return the adjustment mode
	 */
	public boolean getRollover() {
		return adjustRollover;
	}

	/**
	 * Set the adjust rollover color flag.
	 * 
	 * @param state
	 *            the rollover's new adjustment mode ( true | false );
	 */
	public void setRollover(boolean state) {
		adjustRollover = state;
	}

	/**
	 * Reset the brightness and saturation multipliers for the ColorWheel.
	 */
	public void resetColorWheel() {
		saturationMultipler = brightnessMultipler = 1.0;
		resetColor();
	}
}