package org.pushingpixels.substance.internal.contrib.xoetrope.editor.color;

import java.awt.Color;

/**
 * A RYB Color model $Revision: 2254 $
 */
public class ModelColor {
	public static final int NUM_COLOR_RINGS = 7;
	public static final int NUM_SEGMENTS = 24;
	protected boolean webSnap = false;

	private static ModelColor[][] baseColors;

	protected int R, G, B;
	protected double H, S, V;
	protected double rgbMinValue, rgbMaxValue;

	public static double[] SATURATION_BANDS = { 0.4, 0.6, 0.8, 1.0, 1.0, 1.0,
			1.0 };
	public static double[] BRIGHTNESS_BANDS = { 1.0, 1.0, 1.0, 1.0, 1.0, 0.85,
			0.65, 0.45 };

	/**
	 * Create a new ModelColor
	 * 
	 * @param R
	 *            the red value in the range 0-255
	 * @param G
	 *            the green value in the range 0-255
	 * @param B
	 *            the blue value in the range 0-255
	 */
	public ModelColor(int R, int G, int B) {
		this(R, G, B, -1);
	}

	public ModelColor(double H, double S, double V) {
		setHSV(H, S, V);
	}

	/**
	 * Create a new ModelColor
	 * 
	 * @param R
	 *            the red value in the range 0-255
	 * @param G
	 *            the green value in the range 0-255
	 * @param B
	 *            the blue value in the range 0-255
	 * @param H
	 *            the hue value in the range 0-255
	 */
	public ModelColor(int R, int G, int B, int H) {
		initColorWheel();
		setRGB(R, G, B, H);
	}

	/**
	 * Creates a copy of an ModelColor
	 * 
	 * @param c
	 *            the ModelColor to copy
	 */
	public ModelColor(ModelColor c) {
		initColorWheel();
		R = c.R;
		G = c.G;
		B = c.B;

		H = c.H;
		S = c.S;
		V = c.V;
		getRgbMinMaxValues();
	}

	/**
	 * Get the red value
	 * 
	 * @return the red value in the range 0-255
	 */
	public int getRed() {
		return R;
	}

	/**
	 * Get the green value
	 * 
	 * @return the green value in the range 0-255
	 */
	public int getGreen() {
		return G;
	}

	/**
	 * Get the blue value
	 * 
	 * @return the blue value in the range 0-255
	 */
	public int getBlue() {
		return B;
	}

	/**
	 * Get the hue value
	 * 
	 * @return the hue value in the range 0-255
	 */
	public int getHue() {
		return (int) Math.floor(H + 0.5);
	}

	/**
	 * Get the hue value
	 * 
	 * @return the hue value in the range 0-255
	 */
	public double getH() {
		return H;
	}

	/**
	 * Get the saturation value
	 * 
	 * @return the saturation value in the range 0.0-1.0
	 */
	public double getSaturation() {
		return S;
	}

	/**
	 * Get the brightness value
	 * 
	 * @return the brightness value in the range 0.0-1.0
	 */
	public double getBrightness() {
		return V;
	}

	/**
	 * Set an RGB color
	 * 
	 * @param R
	 *            the red value in the range 0-255
	 * @param G
	 *            the green value in the range 0-255
	 * @param B
	 *            the blue value in the range 0-255
	 */
	public void setRGB(int R, int G, int B) {
		setRGB(R, G, B, -1);
	}

	/**
	 * Set an RGB color
	 * 
	 * @param R
	 *            the red value in the range 0-255
	 * @param G
	 *            the green value in the range 0-255
	 * @param B
	 *            the blue value in the range 0-255
	 * @param H
	 *            the hue value in the range 0-255
	 */
	public void setRGB(int r, int g, int b, int h) {
		if (webSnap) {
			R = Math.round(r / 51) * 51;
			G = Math.round(g / 51) * 51;
			B = Math.round(b / 51) * 51;
		} else {
			R = r;
			G = g;
			B = b;
		}

		checkRange();
		getRgbMinMaxValues();
		if (h > -1) {
			H = h;
			S = (rgbMaxValue > 0) ? (rgbMaxValue - rgbMinValue) / rgbMaxValue
					: 0;
			V = rgbMaxValue / 255;
		} else if ((R == G) && (G == B)) {
			H = 0;
			S = 0;
			V = rgbMaxValue / 255;
		} else
			calculateHSVfromRGB();
	}

	/**
	 * Set the color to a HSV value
	 * 
	 * @param _h
	 *            the hue
	 * @param _s
	 *            the saturation
	 * @param _v
	 *            the value
	 */
	public void setHSV(double _h, double _s, double _v) {
		if (Math.abs(H - _h) > 0.499999)
			H = _h;
		if (Math.abs(S - _s) > 0.009999)
			S = _s;
		if (Math.abs(V - _v) > 0.009999)
			V = _v;

		if ((S > 1.0) || (S < 0.0))
			S = (S < 0.0) ? 0.0 : 1.0;
		if ((V > 1.0) || (V < 0.0))
			V = (V < 0.0) ? 0.0 : 1.0;

		calculateRGBfromHSV();
	}

	/**
	 * Check that the RGB values are in range
	 */
	private void checkRange() {
		if (R > 255)
			R = 255;
		if (G > 255)
			G = 255;
		if (B > 255)
			B = 255;

		if (webSnap) {
			R = Math.round(R / 51) * 51;
			G = Math.round(G / 51) * 51;
			B = Math.round(B / 51) * 51;
		}
	}

	/**
	 * Get the minimum and maximum of the RGB values.
	 */
	private void getRgbMinMaxValues() {
		rgbMaxValue = Math.max(Math.max(R, G), B);
		rgbMinValue = Math.min(Math.min(R, G), B);
	}

	private void calculateHSVfromRGB() {
		// Find the two base colors
		boolean exactMatch = false;
		outer: for (int j = 0; j < NUM_COLOR_RINGS; j++) {
			if (j == 6)
				j = 6;
			for (int i = 0; i < 360; i += 15) {
				ModelColor c = baseColors[i / 15][j];
				if ((R == c.R) && (G == c.G) && (B == c.B)) {
					exactMatch = true;
					H = c.H;
					S = (rgbMaxValue > 0) ? 1.0 * (rgbMaxValue - rgbMinValue)
							/ rgbMaxValue : 0.0;
					V = rgbMaxValue / 255.0;
					break outer;
				}
			}
		}

		if (!exactMatch) {
			// Red-Green-Blue to Red-Yellow-Blue
			// degrees
			// R = 0 R = 0
			// Y = 60 Y = 120
			// G = 120 G = 180
			// B == 240 B = 240
			// Fractional values = degrees / 360.0
			float values[] = new float[3];
			values = Color.RGBtoHSB(R, G, B, values);
			float h = values[0];
			S = (rgbMaxValue > 0) ? 1.0 * (rgbMaxValue - rgbMinValue)
					/ rgbMaxValue : 0.0;
			V = rgbMaxValue / 255.0;
			if (h < 0.1666668f)
				h *= 2.0f;
			else if (h < 0.3333334f)
				h += 0.1666667f;
			else if (h < 0.6666668f)
				h = h + 0.1666667f * ((0.6666667f - h) / 0.3333334f);
			H = 360.0 * h;
		}
	}

	private void calculateRGBfromHSV() {
		// Red-Green-Blue to Red-Yellow-Blue
		// degrees degrees
		// R = 0 R = 0
		// Y = 60 Y = 120
		// G = 120 G = 180
		// B == 240 B = 240
		// Fractional values = degrees / 360.0
		double h = H / 360.0;
		if (h < 0.3333334)
			h /= 2.0;
		else if (h < 0.5000001)
			h -= 0.1666667;
		else if (h < 0.6666668)
			h = 2.0 * h - 0.6666667;

		Color c = new Color(Color.HSBtoRGB((float) h, (float) S, (float) V));
		R = c.getRed();
		G = c.getGreen();
		B = c.getBlue();

		checkRange();
		getRgbMinMaxValues();
	}

	/**
	 * Rotate this color by a specified amount
	 * 
	 * @param angle
	 *            the angle by which to move this color (hue)
	 */
	public void rotate(int angle) {
		if ((S > 0) && (V > 0)) {
			double newHue = (H + angle) % 360.0;
			setHSV(newHue, S, V);// S * S1 / S2, V * V1 / V2 );
		}
	}

	/**
	 * Set the snap to web colors setting
	 * 
	 * @param snapTo
	 *            true to snap to web colors
	 */
	public void setWebSnap(boolean snapTo) {
		webSnap = snapTo;
	}

	/**
	 * Convert a decimal rgb value to a hexadecimal value
	 * 
	 * @param n
	 *            the decimal value
	 * @return the hex value
	 */
	public static String dec2hex(int n) {
		String s = Integer.toHexString(n);
		if (s.length() < 2)
			s = "0" + s;
		return s.toUpperCase();
	}

	/**
	 * Convert a hexadecimal rgb value to a decimal value
	 * 
	 * @param n
	 *            the hex value
	 * @return the decimal value
	 */
	public static int hex2dec(String n) {
		if (n.length() == 0)
			return 0;
		return Integer.parseInt(n, 16);
	}

	/**
	 * Get a two letter hex string for the decimal value in the range 0-255
	 */
	public static String toHexString(int value) {
		String hex = Integer.toHexString(value).toUpperCase();
		if (hex.length() < 2)
			return "0" + hex;

		return hex;
	}

	/**
	 * Get a grayscale hex value for an rgb color
	 * 
	 * @param r
	 *            the red value
	 * @param g
	 *            the green value
	 * @param b
	 *            the blue value
	 * @return the hex value
	 */
	public static String col2Gray(double r, double g, double b) {
		double lum = Math.round(r * 0.299 + g * 0.587 + b * 0.114);
		return dec2hex((int) lum) + dec2hex((int) lum) + dec2hex((int) lum);
	}

	public static ModelColor[][] getBaseColors() {
		initColorWheel();
		return baseColors;
	}

	private static void initColorWheel() {
		if (baseColors == null) {
			baseColors = new ModelColor[24][NUM_COLOR_RINGS];

			for (int i = 0; i < NUM_COLOR_RINGS; i++) {
				for (int j = 0; j < 24; j++) {
					baseColors[j][i] = new ModelColor(15.0 * j,
							SATURATION_BANDS[i], BRIGHTNESS_BANDS[i + 1 - (j % 2)]);
				}
			}
		}
	}
}
