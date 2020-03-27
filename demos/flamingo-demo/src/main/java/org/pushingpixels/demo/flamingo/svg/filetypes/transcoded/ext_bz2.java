package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_bz2 implements ResizableIcon {
    private Shape shape = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
transformsStack.push(g.getTransform());
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(71.7, 99.2);
((GeneralPath)shape).lineTo(0.2, 99.2);
((GeneralPath)shape).lineTo(0.2, 0.9);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.880000114440918), new Point2D.Double(36.0, 101.125), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {new Color(239, 196, 2, 255),new Color(241, 200, 41, 255),new Color(244, 210, 100, 255),new Color(247, 220, 139, 255),new Color(249, 229, 172, 255),new Color(251, 236, 199, 255),new Color(252, 243, 221, 255),new Color(254, 249, 238, 255),new Color(255, 253, 249, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(71.7, 99.2);
((GeneralPath)shape).lineTo(0.2, 99.2);
((GeneralPath)shape).lineTo(0.2, 0.9);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(71.7, 99.2);
((GeneralPath)shape).lineTo(0.2, 99.2);
((GeneralPath)shape).lineTo(0.2, 0.9);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.5, 72.3);
((GeneralPath)shape).lineTo(19.5, 72.3);
((GeneralPath)shape).curveTo(21.1, 72.3, 22.2, 72.4, 23.0, 72.5);
((GeneralPath)shape).curveTo(23.8, 72.6, 24.5, 72.9, 25.1, 73.3);
((GeneralPath)shape).curveTo(25.7, 73.700005, 26.2, 74.3, 26.6, 75.0);
((GeneralPath)shape).curveTo(27.0, 75.7, 27.2, 76.5, 27.2, 77.3);
((GeneralPath)shape).curveTo(27.2, 78.200005, 26.900002, 79.100006, 26.400002, 79.9);
((GeneralPath)shape).curveTo(25.900002, 80.7, 25.2, 81.3, 24.400002, 81.700005);
((GeneralPath)shape).curveTo(25.600002, 82.100006, 26.500002, 82.700005, 27.2, 83.50001);
((GeneralPath)shape).curveTo(27.9, 84.30001, 28.2, 85.30001, 28.2, 86.50001);
((GeneralPath)shape).curveTo(28.2, 87.40001, 28.0, 88.30001, 27.6, 89.100006);
((GeneralPath)shape).curveTo(27.2, 90.00001, 26.6, 90.600006, 25.9, 91.100006);
((GeneralPath)shape).curveTo(25.199999, 91.600006, 24.3, 91.90001, 23.199999, 92.00001);
((GeneralPath)shape).curveTo(22.499998, 92.100006, 20.9, 92.100006, 18.399998, 92.100006);
((GeneralPath)shape).lineTo(11.5999975, 92.100006);
((GeneralPath)shape).lineTo(11.5999975, 72.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.5, 75.600006);
((GeneralPath)shape).lineTo(15.5, 80.200005);
((GeneralPath)shape).lineTo(18.1, 80.200005);
((GeneralPath)shape).curveTo(19.7, 80.200005, 20.6, 80.200005, 21.0, 80.100006);
((GeneralPath)shape).curveTo(21.7, 80.00001, 22.2, 79.8, 22.6, 79.40001);
((GeneralPath)shape).curveTo(23.0, 79.00001, 23.2, 78.50001, 23.2, 77.80001);
((GeneralPath)shape).curveTo(23.2, 77.20001, 23.0, 76.70001, 22.7, 76.30001);
((GeneralPath)shape).curveTo(22.400002, 75.90001, 21.900002, 75.70001, 21.2, 75.60001);
((GeneralPath)shape).curveTo(20.800001, 75.60001, 19.7, 75.500015, 17.800001, 75.500015);
((GeneralPath)shape).lineTo(15.500001, 75.500015);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.5, 83.50001);
((GeneralPath)shape).lineTo(15.5, 88.80001);
((GeneralPath)shape).lineTo(19.2, 88.80001);
((GeneralPath)shape).curveTo(20.6, 88.80001, 21.6, 88.80001, 22.0, 88.70001);
((GeneralPath)shape).curveTo(22.6, 88.60001, 23.1, 88.30001, 23.5, 87.90001);
((GeneralPath)shape).curveTo(23.9, 87.50001, 24.1, 86.90001, 24.1, 86.20001);
((GeneralPath)shape).curveTo(24.1, 85.60001, 24.0, 85.10001, 23.7, 84.70001);
((GeneralPath)shape).curveTo(23.400002, 84.30001, 23.0, 84.000015, 22.400002, 83.80001);
((GeneralPath)shape).curveTo(21.900002, 83.60001, 20.7, 83.50001, 18.800001, 83.50001);
((GeneralPath)shape).lineTo(15.500001, 83.50001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.8, 92.200005);
((GeneralPath)shape).lineTo(29.8, 88.600006);
((GeneralPath)shape).lineTo(40.3, 75.700005);
((GeneralPath)shape).lineTo(31.0, 75.700005);
((GeneralPath)shape).lineTo(31.0, 72.3);
((GeneralPath)shape).lineTo(45.6, 72.3);
((GeneralPath)shape).lineTo(45.6, 75.4);
((GeneralPath)shape).lineTo(34.6, 88.8);
((GeneralPath)shape).lineTo(46.0, 88.8);
((GeneralPath)shape).lineTo(46.0, 92.200005);
((GeneralPath)shape).lineTo(29.8, 92.200005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(60.5, 88.600006);
((GeneralPath)shape).lineTo(60.5, 92.100006);
((GeneralPath)shape).lineTo(47.2, 92.100006);
((GeneralPath)shape).curveTo(47.3, 90.8, 47.8, 89.50001, 48.5, 88.3);
((GeneralPath)shape).curveTo(49.2, 87.1, 50.7, 85.5, 52.8, 83.5);
((GeneralPath)shape).curveTo(54.5, 81.9, 55.6, 80.8, 56.0, 80.2);
((GeneralPath)shape).curveTo(56.5, 79.399994, 56.8, 78.6, 56.8, 77.899994);
((GeneralPath)shape).curveTo(56.8, 77.09999, 56.6, 76.399994, 56.1, 75.899994);
((GeneralPath)shape).curveTo(55.6, 75.399994, 55.0, 75.2, 54.199997, 75.2);
((GeneralPath)shape).curveTo(53.399998, 75.2, 52.799995, 75.399994, 52.299995, 75.899994);
((GeneralPath)shape).curveTo(51.799995, 76.399994, 51.599995, 77.2, 51.499996, 78.299995);
((GeneralPath)shape).lineTo(47.699997, 77.899994);
((GeneralPath)shape).curveTo(47.899998, 75.799995, 48.6, 74.299995, 49.799995, 73.399994);
((GeneralPath)shape).curveTo(50.999996, 72.49999, 52.499996, 71.99999, 54.299995, 71.99999);
((GeneralPath)shape).curveTo(56.299995, 71.99999, 57.799995, 72.49999, 58.899994, 73.59999);
((GeneralPath)shape).curveTo(59.999992, 74.69999, 60.599995, 75.99999, 60.599995, 77.49999);
((GeneralPath)shape).curveTo(60.599995, 78.399994, 60.399994, 79.19999, 60.099995, 80.09999);
((GeneralPath)shape).curveTo(59.799995, 80.899994, 59.299995, 81.79999, 58.599995, 82.59999);
((GeneralPath)shape).curveTo(58.099995, 83.19999, 57.299995, 83.99999, 56.099995, 85.09999);
((GeneralPath)shape).curveTo(54.899994, 86.19999, 54.099995, 86.899994, 53.799995, 87.29999);
((GeneralPath)shape).curveTo(53.499996, 87.69999, 53.199997, 87.999985, 52.999996, 88.39999);
((GeneralPath)shape).lineTo(60.499996, 88.39999);
((GeneralPath)shape).closePath();
paint = new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(44.9, 27.699999);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(44.94200134277344, 74.32599639892578), new Point2D.Double(58.347999572753906, 87.73300170898438), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 254, 251, 255),new Color(254, 250, 241, 255),new Color(253, 245, 228, 255),new Color(252, 240, 210, 255),new Color(250, 233, 188, 255),new Color(249, 226, 162, 255),new Color(247, 218, 131, 255),new Color(244, 209, 93, 255),new Color(241, 200, 39, 255),new Color(239, 196, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(44.9, 27.699999);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(44.9, 27.699999);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.0, 15.8);
((GeneralPath)shape).lineTo(29.6, 15.8);
((GeneralPath)shape).lineTo(29.6, 10.8);
((GeneralPath)shape).lineTo(38.0, 10.8);
((GeneralPath)shape).lineTo(38.0, 15.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.0, 24.7);
((GeneralPath)shape).lineTo(29.6, 24.7);
((GeneralPath)shape).lineTo(29.6, 29.7);
((GeneralPath)shape).lineTo(38.0, 29.7);
((GeneralPath)shape).lineTo(38.0, 24.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.0, 3.9000015);
((GeneralPath)shape).lineTo(29.6, 3.9000015);
((GeneralPath)shape).lineTo(29.6, 8.900002);
((GeneralPath)shape).lineTo(38.0, 8.900002);
((GeneralPath)shape).lineTo(38.0, 3.9000015);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.0, 17.7);
((GeneralPath)shape).lineTo(29.6, 17.7);
((GeneralPath)shape).lineTo(29.6, 22.7);
((GeneralPath)shape).lineTo(38.0, 22.7);
((GeneralPath)shape).lineTo(38.0, 17.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.0, 31.6);
((GeneralPath)shape).lineTo(29.6, 31.6);
((GeneralPath)shape).lineTo(29.6, 36.6);
((GeneralPath)shape).lineTo(38.0, 36.6);
((GeneralPath)shape).lineTo(38.0, 31.599998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.7, 56.2);
((GeneralPath)shape).curveTo(38.7, 59.0, 36.4, 61.3, 33.600002, 61.3);
((GeneralPath)shape).curveTo(30.800003, 61.3, 28.500002, 59.0, 28.500002, 56.2);
((GeneralPath)shape).lineTo(28.500002, 55.7);
((GeneralPath)shape).lineTo(30.200003, 41.1);
((GeneralPath)shape).curveTo(30.200003, 39.199997, 31.700003, 37.699997, 33.600002, 37.699997);
((GeneralPath)shape).curveTo(35.4, 37.699997, 36.9, 39.199997, 37.000004, 40.999996);
((GeneralPath)shape).lineTo(38.600002, 55.399994);
((GeneralPath)shape).curveTo(38.7, 55.799995, 38.7, 55.999992, 38.7, 56.199993);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.100002, 56.100002);
((GeneralPath)shape).curveTo(37.100002, 54.2, 35.500004, 52.600002, 33.600002, 52.600002);
((GeneralPath)shape).curveTo(31.7, 52.600002, 30.100002, 54.2, 30.100002, 56.100002);
((GeneralPath)shape).curveTo(30.100002, 58.000004, 31.700003, 59.600002, 33.600002, 59.600002);
((GeneralPath)shape).curveTo(35.600002, 59.500004, 37.100002, 57.9, 37.100002, 56.100002);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(33.617000579833984, 40.68899917602539), new Point2D.Double(33.617000579833984, 98.14800262451172), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {new Color(164, 125, 3, 255),new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(32.5, 41.6);
((GeneralPath)shape).lineTo(30.2, 37.1);
((GeneralPath)shape).lineTo(30.2, 34.8);
((GeneralPath)shape).lineTo(32.5, 32.6);
((GeneralPath)shape).lineTo(34.7, 32.6);
((GeneralPath)shape).lineTo(37.0, 34.8);
((GeneralPath)shape).lineTo(37.0, 37.1);
((GeneralPath)shape).lineTo(34.7, 41.6);
((GeneralPath)shape).lineTo(32.5, 41.6);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());

}



    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    _paint0(g, origAlpha);


	    shape = null;
	    paint = null;
	    stroke = null;
	    clip = null;
        transformsStack.clear();
	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.13199996948242188;
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
		return 0.73499995470047;
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
	private ext_bz2() {
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
       ext_bz2 base = new ext_bz2();
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
       ext_bz2 base = new ext_bz2();
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
        return ext_bz2::new;
    }
}

