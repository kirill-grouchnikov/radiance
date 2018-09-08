package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.IsHiDpiAware;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.NeonIcon;
import org.pushingpixels.neon.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_lua implements ResizableIcon, IsHiDpiAware {
    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.0), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
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
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new LinearGradientPaint(new Point2D.Double(38.0, 64.00399780273438), new Point2D.Double(38.0, 26.09600067138672), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.5, 64.0);
((GeneralPath)shape).curveTo(26.4, 64.0, 19.0, 56.6, 19.0, 47.5);
((GeneralPath)shape).curveTo(19.0, 38.4, 26.4, 30.8, 35.9, 31.0);
((GeneralPath)shape).curveTo(44.800003, 31.2, 52.0, 38.4, 52.0, 47.5);
((GeneralPath)shape).curveTo(52.0, 56.6, 44.7, 64.0, 35.5, 64.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.4, 35.7);
((GeneralPath)shape).curveTo(39.7, 35.7, 37.5, 38.0, 37.5, 40.600002);
((GeneralPath)shape).curveTo(37.5, 43.300003, 39.6, 45.500004, 42.4, 45.500004);
((GeneralPath)shape).curveTo(45.100002, 45.500004, 47.300003, 43.400005, 47.300003, 40.600002);
((GeneralPath)shape).curveTo(47.300003, 38.000004, 45.200005, 35.7, 42.4, 35.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.100002, 35.7);
((GeneralPath)shape).curveTo(49.4, 35.7, 47.2, 33.600002, 47.4, 30.800001);
((GeneralPath)shape).curveTo(47.4, 28.1, 49.5, 26.100002, 52.300003, 26.100002);
((GeneralPath)shape).curveTo(55.000004, 26.100002, 57.000004, 28.400002, 57.000004, 31.000002);
((GeneralPath)shape).curveTo(57.000004, 33.600002, 54.700005, 35.7, 52.100002, 35.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 74.18699645996094), new Point2D.Double(58.5369987487793, 87.68699645996094), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
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
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.5, 91.9);
((GeneralPath)shape).lineTo(10.5, 72.0);
((GeneralPath)shape).lineTo(14.5, 72.0);
((GeneralPath)shape).lineTo(14.5, 88.5);
((GeneralPath)shape).lineTo(24.6, 88.5);
((GeneralPath)shape).lineTo(24.6, 91.9);
((GeneralPath)shape).lineTo(10.5, 91.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.5, 71.8);
((GeneralPath)shape).lineTo(31.5, 71.8);
((GeneralPath)shape).lineTo(31.5, 82.700005);
((GeneralPath)shape).curveTo(31.5, 84.4, 31.5, 85.50001, 31.7, 86.00001);
((GeneralPath)shape).curveTo(31.900002, 86.80001, 32.3, 87.50001, 32.9, 88.00001);
((GeneralPath)shape).curveTo(33.600002, 88.50001, 34.4, 88.700005, 35.600002, 88.700005);
((GeneralPath)shape).curveTo(36.7, 88.700005, 37.600002, 88.50001, 38.2, 88.00001);
((GeneralPath)shape).curveTo(38.8, 87.50001, 39.100002, 87.00001, 39.3, 86.30001);
((GeneralPath)shape).curveTo(39.399998, 85.60001, 39.5, 84.50001, 39.5, 82.90001);
((GeneralPath)shape).lineTo(39.5, 71.8);
((GeneralPath)shape).lineTo(43.5, 71.8);
((GeneralPath)shape).lineTo(43.5, 82.3);
((GeneralPath)shape).curveTo(43.5, 84.700005, 43.4, 86.4, 43.2, 87.4);
((GeneralPath)shape).curveTo(43.0, 88.4, 42.600002, 89.200005, 42.0, 89.9);
((GeneralPath)shape).curveTo(41.399998, 90.6, 40.6, 91.1, 39.6, 91.5);
((GeneralPath)shape).curveTo(38.6, 91.9, 37.3, 92.1, 35.699997, 92.1);
((GeneralPath)shape).curveTo(33.799995, 92.1, 32.299995, 91.9, 31.299997, 91.4);
((GeneralPath)shape).curveTo(30.299997, 91.0, 29.499998, 90.4, 28.999998, 89.700005);
((GeneralPath)shape).curveTo(28.499998, 89.00001, 27.999998, 88.3, 27.899998, 87.50001);
((GeneralPath)shape).curveTo(27.599998, 86.40001, 27.499998, 84.700005, 27.499998, 82.40001);
((GeneralPath)shape).lineTo(27.499998, 71.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(65.8, 91.9);
((GeneralPath)shape).lineTo(61.4, 91.9);
((GeneralPath)shape).lineTo(59.600002, 87.3);
((GeneralPath)shape).lineTo(51.600002, 87.3);
((GeneralPath)shape).lineTo(50.0, 91.9);
((GeneralPath)shape).lineTo(45.7, 91.9);
((GeneralPath)shape).lineTo(53.5, 71.9);
((GeneralPath)shape).lineTo(57.8, 71.9);
((GeneralPath)shape).lineTo(65.8, 91.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(58.4, 84.0);
((GeneralPath)shape).lineTo(55.600002, 76.6);
((GeneralPath)shape).lineTo(52.9, 84.0);
((GeneralPath)shape).lineTo(58.4, 84.0);
((GeneralPath)shape).closePath();
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
	 * Creates a new transcoded SVG image. It is recommended to use the 
	 * {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	public ext_lua() {
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
    public boolean isHiDpiAware() {
        return true;
    }

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
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
     * Returns an instance of this icon with specified dimensions.
     */
    public static NeonIcon of(int width, int height) {
       ext_lua base = new ext_lua();
       base.width = width;
       base.height = height;
       return new NeonIcon(base);
    }

    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_lua base = new ext_lua();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }
}

