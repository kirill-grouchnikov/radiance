package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_doc implements ResizableIcon {
    

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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.056f,0.16f,0.274f,0.398f,0.539f,0.711f,1.0f}, new Color[] {new Color(0, 45, 68, 255),new Color(1, 56, 82, 255),new Color(10, 77, 107, 255),new Color(15, 94, 130, 255),new Color(15, 109, 150, 255),new Color(13, 119, 164, 255),new Color(10, 126, 174, 255),new Color(8, 129, 178, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(1, 65, 94, 255);
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
((GeneralPath)shape).moveTo(6.6, 71.2);
((GeneralPath)shape).lineTo(14.0, 71.2);
((GeneralPath)shape).curveTo(15.7, 71.2, 16.9, 71.299995, 17.8, 71.6);
((GeneralPath)shape).curveTo(19.0, 71.9, 20.0, 72.6, 20.8, 73.4);
((GeneralPath)shape).curveTo(21.599998, 74.3, 22.3, 75.3, 22.699999, 76.6);
((GeneralPath)shape).curveTo(23.099998, 77.9, 23.4, 79.4, 23.4, 81.299995);
((GeneralPath)shape).curveTo(23.4, 82.899994, 23.199999, 84.299995, 22.8, 85.49999);
((GeneralPath)shape).curveTo(22.3, 86.899994, 21.599998, 88.09999, 20.699999, 88.99999);
((GeneralPath)shape).curveTo(19.999998, 89.69999, 19.099998, 90.19999, 17.9, 90.59999);
((GeneralPath)shape).curveTo(17.0, 90.899994, 15.799999, 90.99999, 14.299999, 90.99999);
((GeneralPath)shape).lineTo(6.6, 90.99999);
((GeneralPath)shape).lineTo(6.6, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(10.6, 74.6);
((GeneralPath)shape).lineTo(10.6, 87.7);
((GeneralPath)shape).lineTo(13.6, 87.7);
((GeneralPath)shape).curveTo(14.700001, 87.7, 15.5, 87.6, 16.0, 87.5);
((GeneralPath)shape).curveTo(16.7, 87.3, 17.2, 87.1, 17.6, 86.7);
((GeneralPath)shape).curveTo(18.0, 86.299995, 18.4, 85.7, 18.7, 84.799995);
((GeneralPath)shape).curveTo(19.000002, 83.899994, 19.1, 82.7, 19.1, 81.2);
((GeneralPath)shape).curveTo(19.1, 79.7, 19.0, 78.5, 18.7, 77.7);
((GeneralPath)shape).curveTo(18.400002, 76.899994, 18.0, 76.2, 17.6, 75.799995);
((GeneralPath)shape).curveTo(17.2, 75.399994, 16.5, 74.99999, 15.700001, 74.899994);
((GeneralPath)shape).curveTo(15.1, 74.799995, 14.000001, 74.7, 12.400001, 74.7);
((GeneralPath)shape).lineTo(10.6, 74.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.0, 81.3);
((GeneralPath)shape).curveTo(26.0, 79.3, 26.3, 77.600006, 26.9, 76.200005);
((GeneralPath)shape).curveTo(27.4, 75.200005, 28.0, 74.3, 28.8, 73.50001);
((GeneralPath)shape).curveTo(29.599998, 72.700005, 30.5, 72.100006, 31.4, 71.700005);
((GeneralPath)shape).curveTo(32.6, 71.200005, 34.1, 70.9, 35.7, 70.9);
((GeneralPath)shape).curveTo(38.7, 70.9, 41.0, 71.8, 42.8, 73.6);
((GeneralPath)shape).curveTo(44.6, 75.399994, 45.5, 77.9, 45.5, 81.2);
((GeneralPath)shape).curveTo(45.5, 84.399994, 44.6, 86.899994, 42.9, 88.7);
((GeneralPath)shape).curveTo(41.200005, 90.5, 38.800003, 91.399994, 35.800003, 91.399994);
((GeneralPath)shape).curveTo(32.800003, 91.399994, 30.400003, 90.49999, 28.700003, 88.7);
((GeneralPath)shape).curveTo(26.900003, 86.899994, 26.000002, 84.399994, 26.000002, 81.299995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 81.100006);
((GeneralPath)shape).curveTo(30.2, 83.3, 30.7, 85.100006, 31.800001, 86.200005);
((GeneralPath)shape).curveTo(32.800003, 87.4, 34.2, 87.9, 35.800003, 87.9);
((GeneralPath)shape).curveTo(37.400005, 87.9, 38.700005, 87.3, 39.800003, 86.200005);
((GeneralPath)shape).curveTo(40.800003, 85.00001, 41.4, 83.3, 41.4, 81.00001);
((GeneralPath)shape).curveTo(41.4, 78.700005, 40.9, 77.00001, 39.9, 75.90001);
((GeneralPath)shape).curveTo(38.9, 74.80001, 37.600002, 74.20001, 35.9, 74.20001);
((GeneralPath)shape).curveTo(34.2, 74.20001, 32.9, 74.80001, 31.900002, 75.90001);
((GeneralPath)shape).curveTo(30.7, 77.100006, 30.2, 78.80001, 30.2, 81.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(61.4, 83.8);
((GeneralPath)shape).lineTo(65.3, 85.0);
((GeneralPath)shape).curveTo(64.700005, 87.2, 63.700005, 88.8, 62.300003, 89.8);
((GeneralPath)shape).curveTo(60.9, 90.8, 59.100002, 91.4, 57.000004, 91.4);
((GeneralPath)shape).curveTo(54.300003, 91.4, 52.200005, 90.5, 50.400005, 88.700005);
((GeneralPath)shape).curveTo(48.600006, 86.90001, 47.800007, 84.4, 47.800007, 81.3);
((GeneralPath)shape).curveTo(47.800007, 78.0, 48.70001, 75.4, 50.400005, 73.600006);
((GeneralPath)shape).curveTo(52.100002, 71.80001, 54.400005, 70.90001, 57.200005, 70.90001);
((GeneralPath)shape).curveTo(59.700005, 70.90001, 61.600006, 71.600006, 63.200005, 73.100006);
((GeneralPath)shape).curveTo(64.100006, 73.90001, 64.8, 75.200005, 65.3, 76.8);
((GeneralPath)shape).lineTo(61.300003, 77.700005);
((GeneralPath)shape).curveTo(61.100002, 76.700005, 60.600002, 75.9, 59.800003, 75.3);
((GeneralPath)shape).curveTo(59.000004, 74.700005, 58.100002, 74.4, 57.100002, 74.4);
((GeneralPath)shape).curveTo(55.600002, 74.4, 54.4, 74.9, 53.500004, 76.0);
((GeneralPath)shape).curveTo(52.600006, 77.1, 52.100002, 78.8, 52.100002, 81.1);
((GeneralPath)shape).curveTo(52.100002, 83.6, 52.600002, 85.4, 53.500004, 86.5);
((GeneralPath)shape).curveTo(54.400005, 87.6, 55.500004, 88.0, 57.000004, 88.0);
((GeneralPath)shape).curveTo(58.100002, 88.0, 59.000004, 87.7, 59.800003, 87.0);
((GeneralPath)shape).curveTo(60.600002, 86.3, 61.100002, 85.2, 61.4, 83.8);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(64.4, 25.7);
((GeneralPath)shape).curveTo(63.9, 25.7, 63.4, 25.900002, 63.0, 26.0);
((GeneralPath)shape).curveTo(62.5, 26.2, 62.0, 26.4, 61.6, 26.6);
((GeneralPath)shape).curveTo(60.899998, 27.0, 60.399998, 27.4, 60.1, 27.9);
((GeneralPath)shape).curveTo(59.8, 28.4, 59.5, 29.0, 59.3, 29.6);
((GeneralPath)shape).curveTo(58.399998, 32.0, 57.1, 35.6, 55.3, 40.9);
((GeneralPath)shape).curveTo(53.5, 46.0, 51.7, 51.4, 49.7, 56.9);
((GeneralPath)shape).lineTo(45.0, 56.9);
((GeneralPath)shape).lineTo(36.3, 32.5);
((GeneralPath)shape).lineTo(28.4, 56.9);
((GeneralPath)shape).lineTo(23.7, 56.9);
((GeneralPath)shape).curveTo(21.1, 49.4, 19.1, 43.600002, 17.7, 39.7);
((GeneralPath)shape).curveTo(16.300001, 35.600002, 15.200001, 32.3, 14.200001, 29.5);
((GeneralPath)shape).curveTo(13.900001, 28.7, 13.6, 28.1, 13.200001, 27.7);
((GeneralPath)shape).curveTo(12.800001, 27.300001, 12.300001, 26.900002, 11.800001, 26.5);
((GeneralPath)shape).curveTo(11.400002, 26.2, 10.900002, 26.0, 10.500001, 25.9);
((GeneralPath)shape).curveTo(10.000001, 25.8, 9.500001, 25.699999, 8.900001, 25.6);
((GeneralPath)shape).lineTo(8.900001, 23.800001);
((GeneralPath)shape).lineTo(26.5, 23.800001);
((GeneralPath)shape).lineTo(26.5, 25.6);
((GeneralPath)shape).curveTo(25.5, 25.7, 24.7, 25.800001, 24.2, 26.0);
((GeneralPath)shape).curveTo(23.7, 26.1, 23.300001, 26.2, 23.0, 26.4);
((GeneralPath)shape).curveTo(22.7, 26.5, 22.5, 26.699999, 22.5, 26.8);
((GeneralPath)shape).curveTo(22.4, 26.9, 22.4, 27.099998, 22.4, 27.199999);
((GeneralPath)shape).curveTo(22.4, 27.4, 22.4, 27.599998, 22.5, 27.8);
((GeneralPath)shape).curveTo(22.6, 28.0, 22.6, 28.199999, 22.7, 28.5);
((GeneralPath)shape).curveTo(23.1, 29.7, 23.800001, 32.0, 25.0, 35.3);
((GeneralPath)shape).curveTo(26.1, 38.7, 27.5, 42.8, 29.2, 47.8);
((GeneralPath)shape).lineTo(36.7, 24.0);
((GeneralPath)shape).lineTo(41.600002, 24.0);
((GeneralPath)shape).lineTo(50.300003, 48.5);
((GeneralPath)shape).curveTo(51.600002, 44.5, 52.600002, 41.3, 53.4, 38.8);
((GeneralPath)shape).curveTo(54.2, 36.3, 54.800003, 34.1, 55.300003, 32.399998);
((GeneralPath)shape).curveTo(55.600002, 31.299997, 55.9, 30.399998, 56.000004, 29.599998);
((GeneralPath)shape).curveTo(56.200005, 28.899998, 56.300003, 28.199999, 56.300003, 27.699999);
((GeneralPath)shape).curveTo(56.300003, 27.4, 56.100002, 27.099998, 55.800003, 26.9);
((GeneralPath)shape).curveTo(55.500004, 26.699999, 55.100002, 26.5, 54.600002, 26.3);
((GeneralPath)shape).curveTo(54.2, 26.199999, 53.600002, 26.0, 52.9, 26.0);
((GeneralPath)shape).curveTo(52.2, 25.9, 51.600002, 25.8, 51.100002, 25.8);
((GeneralPath)shape).lineTo(51.100002, 23.8);
((GeneralPath)shape).lineTo(64.4, 23.8);
((GeneralPath)shape).lineTo(64.4, 25.699999);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(18.121000289916992, 50.46799850463867), new Point2D.Double(55.04100036621094, 87.38899993896484), new float[] {0.005f,0.116f,0.239f,0.369f,0.502f,0.639f,0.779f,0.918f,1.0f}, new Color[] {new Color(0, 97, 134, 255),new Color(0, 95, 131, 255),new Color(0, 90, 125, 255),new Color(0, 83, 115, 255),new Color(0, 72, 101, 255),new Color(0, 57, 83, 255),new Color(0, 37, 60, 255),new Color(0, 3, 29, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {new Color(223, 241, 250, 255),new Color(220, 238, 247, 255),new Color(211, 228, 239, 255),new Color(196, 214, 227, 255),new Color(177, 197, 213, 255),new Color(154, 176, 197, 255),new Color(129, 154, 179, 255),new Color(100, 130, 159, 255),new Color(66, 108, 140, 255),new Color(6, 87, 122, 255),new Color(1, 86, 121, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(1, 65, 94, 255);
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
	private ext_doc() {
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
       ext_doc base = new ext_doc();
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
       ext_doc base = new ext_doc();
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
        return ext_doc::new;
    }
}

