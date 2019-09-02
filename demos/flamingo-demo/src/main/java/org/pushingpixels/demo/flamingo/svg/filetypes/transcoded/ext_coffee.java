package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_coffee implements ResizableIcon {
    

    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Shape clip = null;

        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.0), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 74.18699645996094), new Point2D.Double(58.5369987487793, 87.68699645996094), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.8, 87.8);
((GeneralPath)shape).lineTo(15.0, 88.5);
((GeneralPath)shape).curveTo(14.7, 89.7, 14.1, 90.6, 13.3, 91.2);
((GeneralPath)shape).curveTo(12.5, 91.799995, 11.5, 92.1, 10.4, 92.1);
((GeneralPath)shape).curveTo(8.9, 92.1, 7.7, 91.6, 6.7999997, 90.6);
((GeneralPath)shape).curveTo(5.8999996, 89.6, 5.3999996, 88.2, 5.3999996, 86.5);
((GeneralPath)shape).curveTo(5.3999996, 84.7, 5.8999996, 83.2, 6.7999997, 82.2);
((GeneralPath)shape).curveTo(7.7, 81.2, 9.0, 80.7, 10.599999, 80.7);
((GeneralPath)shape).curveTo(11.999999, 80.7, 13.099999, 81.1, 13.9, 81.899994);
((GeneralPath)shape).curveTo(14.4, 82.399994, 14.799999, 83.09999, 15.0, 83.899994);
((GeneralPath)shape).lineTo(12.8, 84.399994);
((GeneralPath)shape).curveTo(12.7, 83.799995, 12.400001, 83.399994, 12.0, 82.99999);
((GeneralPath)shape).curveTo(11.6, 82.69999, 11.1, 82.49999, 10.5, 82.49999);
((GeneralPath)shape).curveTo(9.7, 82.49999, 9.0, 82.799995, 8.5, 83.399994);
((GeneralPath)shape).curveTo(8.0, 83.99999, 7.7, 84.899994, 7.7, 86.299995);
((GeneralPath)shape).curveTo(7.7, 87.7, 8.0, 88.7, 8.5, 89.299995);
((GeneralPath)shape).curveTo(9.0, 89.899994, 9.7, 90.2, 10.5, 90.2);
((GeneralPath)shape).curveTo(11.1, 90.2, 11.6, 90.0, 12.0, 89.6);
((GeneralPath)shape).curveTo(12.3, 89.2, 12.6, 88.6, 12.8, 87.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(16.4, 86.4);
((GeneralPath)shape).curveTo(16.4, 85.3, 16.6, 84.3, 16.9, 83.6);
((GeneralPath)shape).curveTo(17.199999, 83.0, 17.5, 82.5, 17.9, 82.1);
((GeneralPath)shape).curveTo(18.3, 81.7, 18.8, 81.299995, 19.3, 81.1);
((GeneralPath)shape).curveTo(20.0, 80.799995, 20.8, 80.7, 21.699999, 80.7);
((GeneralPath)shape).curveTo(23.3, 80.7, 24.599998, 81.2, 25.599998, 82.2);
((GeneralPath)shape).curveTo(26.599998, 83.2, 27.099998, 84.6, 27.099998, 86.399994);
((GeneralPath)shape).curveTo(27.099998, 88.2, 26.599998, 89.59999, 25.599998, 90.59999);
((GeneralPath)shape).curveTo(24.599998, 91.59999, 23.3, 92.09999, 21.699999, 92.09999);
((GeneralPath)shape).curveTo(19.999998, 92.09999, 18.699999, 91.59999, 17.8, 90.59999);
((GeneralPath)shape).curveTo(16.9, 89.59999, 16.4, 88.19999, 16.4, 86.399994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.699999, 86.3);
((GeneralPath)shape).curveTo(18.699999, 87.600006, 18.999998, 88.5, 19.599998, 89.200005);
((GeneralPath)shape).curveTo(20.199999, 89.8, 20.899998, 90.200005, 21.8, 90.200005);
((GeneralPath)shape).curveTo(22.699999, 90.200005, 23.4, 89.9, 24.0, 89.200005);
((GeneralPath)shape).curveTo(24.6, 88.50001, 24.9, 87.600006, 24.9, 86.3);
((GeneralPath)shape).curveTo(24.9, 85.0, 24.6, 84.100006, 24.1, 83.5);
((GeneralPath)shape).curveTo(23.5, 82.9, 22.800001, 82.6, 21.9, 82.6);
((GeneralPath)shape).curveTo(21.0, 82.6, 20.199999, 82.9, 19.699999, 83.5);
((GeneralPath)shape).curveTo(18.999998, 84.1, 18.699999, 85.1, 18.699999, 86.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.0, 91.9);
((GeneralPath)shape).lineTo(29.0, 80.8);
((GeneralPath)shape).lineTo(36.6, 80.8);
((GeneralPath)shape).lineTo(36.6, 82.700005);
((GeneralPath)shape).lineTo(31.199999, 82.700005);
((GeneralPath)shape).lineTo(31.199999, 85.3);
((GeneralPath)shape).lineTo(35.8, 85.3);
((GeneralPath)shape).lineTo(35.8, 87.200005);
((GeneralPath)shape).lineTo(31.199999, 87.200005);
((GeneralPath)shape).lineTo(31.199999, 91.9);
((GeneralPath)shape).lineTo(29.0, 91.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.4, 91.9);
((GeneralPath)shape).lineTo(38.4, 80.8);
((GeneralPath)shape).lineTo(46.0, 80.8);
((GeneralPath)shape).lineTo(46.0, 82.700005);
((GeneralPath)shape).lineTo(40.6, 82.700005);
((GeneralPath)shape).lineTo(40.6, 85.3);
((GeneralPath)shape).lineTo(45.199997, 85.3);
((GeneralPath)shape).lineTo(45.199997, 87.200005);
((GeneralPath)shape).lineTo(40.6, 87.200005);
((GeneralPath)shape).lineTo(40.6, 91.9);
((GeneralPath)shape).lineTo(38.399998, 91.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.9, 91.9);
((GeneralPath)shape).lineTo(47.9, 80.8);
((GeneralPath)shape).lineTo(56.100002, 80.8);
((GeneralPath)shape).lineTo(56.100002, 82.700005);
((GeneralPath)shape).lineTo(50.100002, 82.700005);
((GeneralPath)shape).lineTo(50.100002, 85.200005);
((GeneralPath)shape).lineTo(55.7, 85.200005);
((GeneralPath)shape).lineTo(55.7, 87.0);
((GeneralPath)shape).lineTo(50.100002, 87.0);
((GeneralPath)shape).lineTo(50.100002, 90.0);
((GeneralPath)shape).lineTo(56.300003, 90.0);
((GeneralPath)shape).lineTo(56.300003, 91.9);
((GeneralPath)shape).lineTo(47.9, 91.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(58.2, 91.9);
((GeneralPath)shape).lineTo(58.2, 80.8);
((GeneralPath)shape).lineTo(66.4, 80.8);
((GeneralPath)shape).lineTo(66.4, 82.700005);
((GeneralPath)shape).lineTo(60.4, 82.700005);
((GeneralPath)shape).lineTo(60.4, 85.200005);
((GeneralPath)shape).lineTo(66.0, 85.200005);
((GeneralPath)shape).lineTo(66.0, 87.0);
((GeneralPath)shape).lineTo(60.4, 87.0);
((GeneralPath)shape).lineTo(60.4, 90.0);
((GeneralPath)shape).lineTo(66.6, 90.0);
((GeneralPath)shape).lineTo(66.6, 91.9);
((GeneralPath)shape).lineTo(58.199997, 91.9);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.0, 37.6);
((GeneralPath)shape).curveTo(35.2, 37.199997, 36.4, 34.6, 41.2, 34.1);
((GeneralPath)shape).curveTo(43.600002, 33.899998, 45.100002, 34.399998, 45.3, 35.199997);
((GeneralPath)shape).curveTo(45.399998, 35.999996, 44.3, 36.499996, 42.8, 36.6);
((GeneralPath)shape).curveTo(40.8, 36.8, 39.899998, 36.1, 39.8, 35.399998);
((GeneralPath)shape).curveTo(38.3, 35.499996, 38.1, 36.199997, 38.2, 36.6);
((GeneralPath)shape).curveTo(38.3, 37.5, 40.2, 38.3, 43.2, 38.0);
((GeneralPath)shape).curveTo(46.7, 37.7, 47.8, 36.4, 47.600002, 35.0);
((GeneralPath)shape).curveTo(47.2, 33.2, 44.600002, 31.7, 39.7, 32.1);
((GeneralPath)shape).curveTo(33.5, 32.699997, 33.600002, 35.5, 29.400002, 35.8);
((GeneralPath)shape).curveTo(27.7, 35.899998, 26.7, 35.6, 26.500002, 34.899998);
((GeneralPath)shape).curveTo(26.400002, 34.199997, 27.200003, 33.899998, 28.200003, 33.8);
((GeneralPath)shape).curveTo(29.100002, 33.7, 30.200003, 33.899998, 30.800003, 34.2);
((GeneralPath)shape).curveTo(31.200003, 34.0, 31.300003, 33.8, 31.300003, 33.600002);
((GeneralPath)shape).curveTo(31.200003, 33.000004, 29.900003, 32.7, 28.300003, 32.800003);
((GeneralPath)shape).curveTo(25.200003, 33.100002, 25.200003, 34.500004, 25.300003, 35.100002);
((GeneralPath)shape).curveTo(25.600002, 36.800003, 28.000004, 37.9, 31.000004, 37.600002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(51.9, 44.699997);
((GeneralPath)shape).curveTo(48.0, 45.6, 43.100002, 46.199997, 37.2, 46.199997);
((GeneralPath)shape).curveTo(31.2, 46.199997, 26.2, 45.6, 22.400002, 44.699997);
((GeneralPath)shape).curveTo(19.000002, 43.799995, 17.100002, 42.799995, 16.500002, 41.799995);
((GeneralPath)shape).curveTo(16.800001, 43.999996, 17.400002, 46.199997, 18.100002, 48.299995);
((GeneralPath)shape).curveTo(17.200003, 48.799995, 16.400002, 49.499996, 15.700003, 50.399994);
((GeneralPath)shape).curveTo(14.300003, 52.099995, 13.700003, 54.099995, 13.800003, 56.099995);
((GeneralPath)shape).curveTo(13.900003, 58.099995, 14.900003, 59.699993, 16.400003, 60.899994);
((GeneralPath)shape).curveTo(18.000004, 62.099995, 19.700003, 62.499992, 21.700005, 62.099995);
((GeneralPath)shape).curveTo(22.400005, 61.999996, 23.300005, 61.599995, 24.100004, 61.399994);
((GeneralPath)shape).curveTo(22.500004, 61.399994, 21.100004, 60.899994, 19.800003, 59.799995);
((GeneralPath)shape).curveTo(18.300003, 58.699997, 17.300003, 57.199997, 17.100002, 55.399994);
((GeneralPath)shape).curveTo(16.700003, 53.699993, 17.100002, 52.099995, 18.100002, 50.699993);
((GeneralPath)shape).curveTo(18.300003, 50.399994, 18.500002, 50.199993, 18.800003, 49.999992);
((GeneralPath)shape).curveTo(19.300003, 51.399994, 20.000004, 52.59999, 20.700003, 53.899994);
((GeneralPath)shape).curveTo(22.200003, 56.099995, 23.700003, 58.099995, 25.100002, 60.199993);
((GeneralPath)shape).curveTo(25.700003, 61.399994, 26.200003, 62.699993, 26.500002, 63.899994);
((GeneralPath)shape).curveTo(27.500002, 65.299995, 28.900002, 66.2, 30.600002, 66.7);
((GeneralPath)shape).curveTo(32.7, 67.399994, 34.9, 67.7, 37.2, 67.7);
((GeneralPath)shape).lineTo(37.4, 67.7);
((GeneralPath)shape).curveTo(39.600002, 67.7, 42.0, 67.299995, 44.2, 66.6);
((GeneralPath)shape).curveTo(45.8, 66.1, 47.2, 65.2, 48.2, 63.699997);
((GeneralPath)shape).lineTo(48.3, 63.699997);
((GeneralPath)shape).curveTo(48.5, 62.6, 48.899998, 61.299995, 49.5, 59.999996);
((GeneralPath)shape).curveTo(51.0, 57.899998, 52.5, 55.899998, 53.9, 53.699997);
((GeneralPath)shape).curveTo(55.9, 50.1, 57.2, 46.1, 58.0, 41.699997);
((GeneralPath)shape).curveTo(57.1, 42.899998, 55.2, 43.899998, 51.9, 44.699997);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(22.300001, 41.6);
((GeneralPath)shape).curveTo(26.2, 42.6, 31.100002, 43.1, 37.0, 43.1);
((GeneralPath)shape).curveTo(43.0, 43.1, 47.9, 42.6, 51.7, 41.6);
((GeneralPath)shape).curveTo(55.8, 40.6, 57.7, 39.399998, 57.7, 38.199997);
((GeneralPath)shape).curveTo(57.7, 37.299995, 56.8, 36.499996, 55.2, 35.799995);
((GeneralPath)shape).curveTo(55.600002, 35.999996, 55.8, 36.399994, 55.8, 36.899994);
((GeneralPath)shape).curveTo(55.8, 38.099995, 53.899998, 39.099995, 50.2, 39.999992);
((GeneralPath)shape).curveTo(46.8, 40.699993, 42.3, 41.29999, 37.0, 41.29999);
((GeneralPath)shape).curveTo(31.8, 41.29999, 27.2, 40.79999, 23.9, 40.09999);
((GeneralPath)shape).curveTo(20.3, 39.19999, 18.4, 38.19999, 18.4, 36.999992);
((GeneralPath)shape).curveTo(18.4, 36.499992, 18.6, 35.999992, 19.4, 35.499992);
((GeneralPath)shape).curveTo(17.199999, 36.399994, 16.0, 37.09999, 16.0, 38.199993);
((GeneralPath)shape).curveTo(16.2, 39.399994, 18.2, 40.699993, 22.3, 41.599995);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.89500045776367, 32.202999114990234), new Point2D.Double(35.89500045776367, 67.86799621582031), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12999999523162842;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.7400000095367432;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_coffee() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static ResizableIcon of(int width, int height) {
       ext_coffee base = new ext_coffee();
       base.width = width;
       base.height = height;
       return base;
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_coffee base = new ext_coffee();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_coffee::new;
    }
}

