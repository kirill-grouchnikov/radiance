package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_indd implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(72.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, -1.0), new Point2D.Double(36.20000076293945, 97.0), new float[] {0.312f,1.0f}, new Color[] {new Color(255, 234, 246, 255),new Color(219, 0, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(72.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(219, 0, 123, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(72.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.7, 91.1);
((GeneralPath)shape).lineTo(8.7, 73.9);
((GeneralPath)shape).lineTo(12.2, 73.9);
((GeneralPath)shape).lineTo(12.2, 91.100006);
((GeneralPath)shape).lineTo(8.7, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.6, 91.1);
((GeneralPath)shape).lineTo(15.6, 73.9);
((GeneralPath)shape).lineTo(19.0, 73.9);
((GeneralPath)shape).lineTo(26.1, 85.4);
((GeneralPath)shape).lineTo(26.1, 73.9);
((GeneralPath)shape).lineTo(29.4, 73.9);
((GeneralPath)shape).lineTo(29.4, 91.100006);
((GeneralPath)shape).lineTo(25.9, 91.100006);
((GeneralPath)shape).lineTo(18.9, 79.90001);
((GeneralPath)shape).lineTo(18.9, 91.100006);
((GeneralPath)shape).lineTo(15.599999, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.0, 73.9);
((GeneralPath)shape).lineTo(39.4, 73.9);
((GeneralPath)shape).curveTo(40.800003, 73.9, 41.9, 74.0, 42.7, 74.200005);
((GeneralPath)shape).curveTo(43.7, 74.50001, 44.600002, 75.00001, 45.3, 75.8);
((GeneralPath)shape).curveTo(45.999996, 76.6, 46.6, 77.5, 47.0, 78.600006);
((GeneralPath)shape).curveTo(47.4, 79.70001, 47.6, 81.100006, 47.6, 82.700005);
((GeneralPath)shape).curveTo(47.6, 84.100006, 47.399998, 85.3, 47.1, 86.4);
((GeneralPath)shape).curveTo(46.699997, 87.6, 46.0, 88.700005, 45.199997, 89.4);
((GeneralPath)shape).curveTo(44.6, 90.0, 43.799995, 90.4, 42.699997, 90.8);
((GeneralPath)shape).curveTo(41.899998, 91.0, 40.899998, 91.200005, 39.6, 91.200005);
((GeneralPath)shape).lineTo(33.0, 91.200005);
((GeneralPath)shape).lineTo(33.0, 73.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.5, 76.8);
((GeneralPath)shape).lineTo(36.5, 88.200005);
((GeneralPath)shape).lineTo(39.1, 88.200005);
((GeneralPath)shape).curveTo(40.1, 88.200005, 40.8, 88.100006, 41.199997, 88.00001);
((GeneralPath)shape).curveTo(41.799995, 87.90001, 42.199997, 87.600006, 42.6, 87.30001);
((GeneralPath)shape).curveTo(43.0, 87.000015, 43.3, 86.40001, 43.5, 85.60001);
((GeneralPath)shape).curveTo(43.7, 84.80001, 43.9, 83.80001, 43.9, 82.500015);
((GeneralPath)shape).curveTo(43.9, 81.20002, 43.800003, 80.20001, 43.5, 79.40002);
((GeneralPath)shape).curveTo(43.3, 78.70002, 42.9, 78.10001, 42.5, 77.70002);
((GeneralPath)shape).curveTo(42.1, 77.300026, 41.5, 77.00002, 40.9, 76.90002);
((GeneralPath)shape).curveTo(40.4, 76.80002, 39.5, 76.70002, 38.0, 76.70002);
((GeneralPath)shape).lineTo(36.5, 76.70002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.5, 73.9);
((GeneralPath)shape).lineTo(56.9, 73.9);
((GeneralPath)shape).curveTo(58.300003, 73.9, 59.4, 74.0, 60.2, 74.200005);
((GeneralPath)shape).curveTo(61.2, 74.50001, 62.100002, 75.00001, 62.8, 75.8);
((GeneralPath)shape).curveTo(63.5, 76.600006, 64.1, 77.5, 64.5, 78.600006);
((GeneralPath)shape).curveTo(64.9, 79.70001, 65.1, 81.100006, 65.1, 82.700005);
((GeneralPath)shape).curveTo(65.1, 84.100006, 64.9, 85.3, 64.6, 86.4);
((GeneralPath)shape).curveTo(64.2, 87.6, 63.5, 88.700005, 62.699997, 89.4);
((GeneralPath)shape).curveTo(62.1, 90.0, 61.299995, 90.4, 60.199997, 90.8);
((GeneralPath)shape).curveTo(59.399998, 91.0, 58.399998, 91.200005, 57.1, 91.200005);
((GeneralPath)shape).lineTo(50.5, 91.200005);
((GeneralPath)shape).lineTo(50.5, 73.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.0, 76.8);
((GeneralPath)shape).lineTo(54.0, 88.200005);
((GeneralPath)shape).lineTo(56.6, 88.200005);
((GeneralPath)shape).curveTo(57.6, 88.200005, 58.3, 88.100006, 58.699997, 88.00001);
((GeneralPath)shape).curveTo(59.299995, 87.90001, 59.699997, 87.600006, 60.1, 87.30001);
((GeneralPath)shape).curveTo(60.5, 87.000015, 60.8, 86.40001, 61.0, 85.60001);
((GeneralPath)shape).curveTo(61.2, 84.80001, 61.4, 83.80001, 61.4, 82.500015);
((GeneralPath)shape).curveTo(61.4, 81.20002, 61.300003, 80.20001, 61.0, 79.40002);
((GeneralPath)shape).curveTo(60.8, 78.70002, 60.4, 78.10001, 60.0, 77.70002);
((GeneralPath)shape).curveTo(59.6, 77.30002, 59.0, 77.00002, 58.4, 76.90002);
((GeneralPath)shape).curveTo(57.9, 76.80002, 57.0, 76.70002, 55.5, 76.70002);
((GeneralPath)shape).lineTo(54.0, 76.70002);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.275001525878906, 25.774999618530273), new Point2D.Double(58.775001525878906, 12.274999618530273), new float[] {0.0f,0.378f,0.515f,0.612f,0.69f,0.757f,0.817f,0.871f,0.921f,0.965f,1.0f}, new Color[] {new Color(249, 239, 246, 255),new Color(248, 237, 245, 255),new Color(243, 230, 241, 255),new Color(236, 219, 235, 255),new Color(227, 204, 226, 255),new Color(215, 184, 215, 255),new Color(202, 161, 201, 255),new Color(188, 136, 187, 255),new Color(174, 108, 171, 255),new Color(159, 77, 155, 255),new Color(147, 42, 142, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(219, 0, 123, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(24.6, 61.3);
((GeneralPath)shape).lineTo(24.6, 34.5);
((GeneralPath)shape).lineTo(28.2, 34.5);
((GeneralPath)shape).lineTo(28.2, 61.3);
((GeneralPath)shape).lineTo(24.6, 61.3);
((GeneralPath)shape).closePath();
paint = new Color(219, 0, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_0
paint = new Color(219, 0, 123, 255);
stroke = new BasicStroke(1.25f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(24.6, 61.3);
((GeneralPath)shape).lineTo(24.6, 34.5);
((GeneralPath)shape).lineTo(28.2, 34.5);
((GeneralPath)shape).lineTo(28.2, 61.3);
((GeneralPath)shape).lineTo(24.6, 61.3);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(42.5, 61.7);
((GeneralPath)shape).curveTo(36.5, 61.7, 33.3, 58.0, 33.3, 52.5);
((GeneralPath)shape).curveTo(33.3, 47.0, 36.399998, 42.7, 42.5, 42.7);
((GeneralPath)shape).curveTo(43.6, 42.7, 44.6, 42.8, 45.7, 43.100002);
((GeneralPath)shape).lineTo(45.7, 34.5);
((GeneralPath)shape).lineTo(49.100002, 34.5);
((GeneralPath)shape).lineTo(49.100002, 60.5);
((GeneralPath)shape).curveTo(47.7, 61.1, 45.2, 61.7, 42.500004, 61.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.7, 44.800003);
((GeneralPath)shape).curveTo(44.9, 44.600002, 43.9, 44.500004, 43.0, 44.500004);
((GeneralPath)shape).curveTo(38.2, 44.500004, 36.6, 48.200005, 36.6, 52.200005);
((GeneralPath)shape).curveTo(36.6, 56.600006, 38.3, 59.700005, 42.6, 59.700005);
((GeneralPath)shape).curveTo(44.0, 59.700005, 44.899998, 59.500004, 45.6, 59.200005);
((GeneralPath)shape).lineTo(45.6, 44.8);
((GeneralPath)shape).closePath();
paint = new Color(219, 0, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8_0
paint = new Color(219, 0, 123, 255);
stroke = new BasicStroke(1.25f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(42.5, 61.7);
((GeneralPath)shape).curveTo(36.5, 61.7, 33.3, 58.0, 33.3, 52.5);
((GeneralPath)shape).curveTo(33.3, 47.0, 36.399998, 42.7, 42.5, 42.7);
((GeneralPath)shape).curveTo(43.6, 42.7, 44.6, 42.8, 45.7, 43.100002);
((GeneralPath)shape).lineTo(45.7, 34.5);
((GeneralPath)shape).lineTo(49.100002, 34.5);
((GeneralPath)shape).lineTo(49.100002, 60.5);
((GeneralPath)shape).curveTo(47.7, 61.1, 45.2, 61.7, 42.500004, 61.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.7, 44.800003);
((GeneralPath)shape).curveTo(44.9, 44.600002, 43.9, 44.500004, 43.0, 44.500004);
((GeneralPath)shape).curveTo(38.2, 44.500004, 36.6, 48.200005, 36.6, 52.200005);
((GeneralPath)shape).curveTo(36.6, 56.600006, 38.3, 59.700005, 42.6, 59.700005);
((GeneralPath)shape).curveTo(44.0, 59.700005, 44.899998, 59.500004, 45.6, 59.200005);
((GeneralPath)shape).lineTo(45.6, 44.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
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
	private ext_indd() {
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
       ext_indd base = new ext_indd();
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
       ext_indd base = new ext_indd();
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
        return ext_indd::new;
    }
}

