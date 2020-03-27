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
public class ext_p7b implements ResizableIcon {
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
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.1, 91.9);
((GeneralPath)shape).lineTo(11.1, 71.9);
((GeneralPath)shape).lineTo(17.6, 71.9);
((GeneralPath)shape).curveTo(20.1, 71.9, 21.7, 72.0, 22.400002, 72.200005);
((GeneralPath)shape).curveTo(23.500002, 72.50001, 24.500002, 73.200005, 25.300001, 74.200005);
((GeneralPath)shape).curveTo(26.1, 75.200005, 26.500002, 76.50001, 26.500002, 78.100006);
((GeneralPath)shape).curveTo(26.500002, 79.3, 26.300001, 80.40001, 25.800001, 81.200005);
((GeneralPath)shape).curveTo(25.400002, 82.00001, 24.800001, 82.700005, 24.1, 83.200005);
((GeneralPath)shape).curveTo(23.4, 83.700005, 22.7, 84.00001, 22.0, 84.200005);
((GeneralPath)shape).curveTo(21.0, 84.4, 19.6, 84.50001, 17.8, 84.50001);
((GeneralPath)shape).lineTo(15.199999, 84.50001);
((GeneralPath)shape).lineTo(15.199999, 92.100006);
((GeneralPath)shape).lineTo(11.099998, 92.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.1, 75.2);
((GeneralPath)shape).lineTo(15.1, 80.899994);
((GeneralPath)shape).lineTo(17.300001, 80.899994);
((GeneralPath)shape).curveTo(18.900002, 80.899994, 20.000002, 80.799995, 20.500002, 80.59999);
((GeneralPath)shape).curveTo(21.000002, 80.399994, 21.500002, 80.09999, 21.800001, 79.59999);
((GeneralPath)shape).curveTo(22.1, 79.19999, 22.300001, 78.59999, 22.300001, 77.99999);
((GeneralPath)shape).curveTo(22.300001, 77.299995, 22.1, 76.69999, 21.7, 76.19999);
((GeneralPath)shape).curveTo(21.300001, 75.69999, 20.7, 75.39999, 20.1, 75.29999);
((GeneralPath)shape).curveTo(19.6, 75.19999, 18.6, 75.19999, 17.2, 75.19999);
((GeneralPath)shape).lineTo(15.1, 75.19999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.900002, 75.7);
((GeneralPath)shape).lineTo(28.900002, 72.1);
((GeneralPath)shape).lineTo(42.0, 72.1);
((GeneralPath)shape).lineTo(42.0, 74.9);
((GeneralPath)shape).curveTo(40.9, 76.0, 39.8, 77.5, 38.7, 79.5);
((GeneralPath)shape).curveTo(37.600002, 81.5, 36.7, 83.6, 36.100002, 85.9);
((GeneralPath)shape).curveTo(35.500004, 88.200005, 35.2, 90.200005, 35.2, 91.9);
((GeneralPath)shape).lineTo(31.5, 91.9);
((GeneralPath)shape).curveTo(31.6, 89.1, 32.1, 86.3, 33.2, 83.4);
((GeneralPath)shape).curveTo(34.300003, 80.5, 35.7, 77.9, 37.5, 75.700005);
((GeneralPath)shape).lineTo(28.9, 75.700005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.300003, 71.799995);
((GeneralPath)shape).lineTo(53.300003, 71.799995);
((GeneralPath)shape).curveTo(54.9, 71.799995, 56.100002, 71.899994, 56.800003, 71.99999);
((GeneralPath)shape).curveTo(57.500004, 72.09999, 58.300003, 72.399994, 58.9, 72.799995);
((GeneralPath)shape).curveTo(59.5, 73.2, 60.0, 73.799995, 60.4, 74.49999);
((GeneralPath)shape).curveTo(60.800003, 75.19999, 61.0, 75.99999, 61.0, 76.799995);
((GeneralPath)shape).curveTo(61.0, 77.7, 60.7, 78.6, 60.2, 79.399994);
((GeneralPath)shape).curveTo(59.7, 80.19999, 59.0, 80.799995, 58.100002, 81.2);
((GeneralPath)shape).curveTo(59.300003, 81.6, 60.300003, 82.2, 60.9, 83.0);
((GeneralPath)shape).curveTo(61.5, 83.8, 61.9, 84.9, 61.9, 86.0);
((GeneralPath)shape).curveTo(61.9, 86.9, 61.7, 87.8, 61.300003, 88.7);
((GeneralPath)shape).curveTo(60.900005, 89.59999, 60.300003, 90.2, 59.600002, 90.799995);
((GeneralPath)shape).curveTo(58.9, 91.299995, 58.000004, 91.6, 56.9, 91.799995);
((GeneralPath)shape).curveTo(56.2, 91.899994, 54.600002, 91.899994, 52.0, 91.899994);
((GeneralPath)shape).lineTo(45.2, 91.899994);
((GeneralPath)shape).lineTo(45.2, 71.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.4, 75.2);
((GeneralPath)shape).lineTo(49.4, 79.799995);
((GeneralPath)shape).lineTo(52.0, 79.799995);
((GeneralPath)shape).curveTo(53.6, 79.799995, 54.6, 79.799995, 54.9, 79.7);
((GeneralPath)shape).curveTo(55.600002, 79.6, 56.100002, 79.399994, 56.5, 79.0);
((GeneralPath)shape).curveTo(56.899998, 78.600006, 57.1, 78.1, 57.1, 77.4);
((GeneralPath)shape).curveTo(57.1, 76.8, 56.899998, 76.3, 56.6, 75.9);
((GeneralPath)shape).curveTo(56.3, 75.5, 55.699997, 75.3, 55.1, 75.200005);
((GeneralPath)shape).curveTo(54.699997, 75.200005, 53.5, 75.100006, 51.6, 75.100006);
((GeneralPath)shape).lineTo(49.399998, 75.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.4, 83.1);
((GeneralPath)shape).lineTo(49.4, 88.5);
((GeneralPath)shape).lineTo(53.100002, 88.5);
((GeneralPath)shape).curveTo(54.600002, 88.5, 55.500004, 88.5, 55.9, 88.4);
((GeneralPath)shape).curveTo(56.5, 88.3, 57.0, 88.0, 57.4, 87.6);
((GeneralPath)shape).curveTo(57.800003, 87.2, 58.0, 86.6, 58.0, 85.9);
((GeneralPath)shape).curveTo(58.0, 85.3, 57.9, 84.8, 57.6, 84.4);
((GeneralPath)shape).curveTo(57.3, 84.0, 56.899998, 83.700005, 56.3, 83.5);
((GeneralPath)shape).curveTo(55.7, 83.3, 54.6, 83.2, 52.7, 83.2);
((GeneralPath)shape).lineTo(49.4, 83.2);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -952.3619995117188f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.4, 978.9);
((GeneralPath)shape).curveTo(38.5, 982.0, 39.5, 986.4, 38.300003, 990.4);
((GeneralPath)shape).lineTo(54.800003, 1006.9);
((GeneralPath)shape).lineTo(55.200005, 1014.30005);
((GeneralPath)shape).lineTo(45.900005, 1013.50006);
((GeneralPath)shape).lineTo(45.900005, 1008.80005);
((GeneralPath)shape).lineTo(41.200005, 1008.80005);
((GeneralPath)shape).lineTo(41.200005, 1004.10004);
((GeneralPath)shape).lineTo(36.500004, 1004.10004);
((GeneralPath)shape).lineTo(30.500004, 998.10004);
((GeneralPath)shape).curveTo(26.600004, 999.30005, 22.100004, 998.30005, 19.000004, 995.2);
((GeneralPath)shape).curveTo(14.500004, 990.7, 14.500004, 983.4, 19.000004, 978.9);
((GeneralPath)shape).curveTo(23.600004, 974.4, 30.900003, 974.4, 35.4, 978.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.800001, 982.0);
((GeneralPath)shape).curveTo(26.177185, 981.3759, 25.3317, 981.0252, 24.45, 981.0252);
((GeneralPath)shape).curveTo(23.568304, 981.0252, 22.722818, 981.3759, 22.100002, 982.0);
((GeneralPath)shape).curveTo(21.475904, 982.6228, 21.125183, 983.4683, 21.125183, 984.35);
((GeneralPath)shape).curveTo(21.125183, 985.2317, 21.475904, 986.0772, 22.100002, 986.7);
((GeneralPath)shape).curveTo(23.400002, 988.0, 25.500002, 988.0, 26.800003, 986.7);
((GeneralPath)shape).curveTo(28.100002, 985.4, 28.100002, 983.3, 26.800003, 982.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.444000244140625, 1014.3270263671875), new Point2D.Double(35.444000244140625, 975.551025390625), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
	private ext_p7b() {
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
       ext_p7b base = new ext_p7b();
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
       ext_p7b base = new ext_p7b();
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
        return ext_p7b::new;
    }
}

