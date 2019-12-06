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
public class ext_cfm implements ResizableIcon {
    

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
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.0, 44.7);
((GeneralPath)shape).lineTo(26.0, 32.6);
((GeneralPath)shape).lineTo(26.0, 38.699997);
((GeneralPath)shape).lineTo(16.5, 46.6);
((GeneralPath)shape).lineTo(16.5, 46.699997);
((GeneralPath)shape).lineTo(26.0, 54.6);
((GeneralPath)shape).lineTo(26.0, 60.699997);
((GeneralPath)shape).lineTo(12.0, 48.699997);
((GeneralPath)shape).lineTo(12.0, 44.699997);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(19.0, 39.207000732421875), new Point2D.Double(19.0, 67.39700317382812), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(19.0, 37.56800079345703), new Point2D.Double(19.0, 69.03600311279297), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.0, 44.7);
((GeneralPath)shape).lineTo(26.0, 32.6);
((GeneralPath)shape).lineTo(26.0, 38.699997);
((GeneralPath)shape).lineTo(16.5, 46.6);
((GeneralPath)shape).lineTo(16.5, 46.699997);
((GeneralPath)shape).lineTo(26.0, 54.6);
((GeneralPath)shape).lineTo(26.0, 60.699997);
((GeneralPath)shape).lineTo(12.0, 48.699997);
((GeneralPath)shape).lineTo(12.0, 44.699997);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.4, 29.5);
((GeneralPath)shape).lineTo(42.100002, 29.5);
((GeneralPath)shape).lineTo(34.9, 64.5);
((GeneralPath)shape).lineTo(31.300001, 64.5);
((GeneralPath)shape).lineTo(38.4, 29.5);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.70000076293945, 35.5), new Point2D.Double(36.70000076293945, 70.5), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.70100021362305, 34.75), new Point2D.Double(36.70100021362305, 71.25), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.4, 29.5);
((GeneralPath)shape).lineTo(42.100002, 29.5);
((GeneralPath)shape).lineTo(34.9, 64.5);
((GeneralPath)shape).lineTo(31.300001, 64.5);
((GeneralPath)shape).lineTo(38.4, 29.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(47.2, 54.8);
((GeneralPath)shape).lineTo(56.7, 46.899998);
((GeneralPath)shape).lineTo(56.7, 46.8);
((GeneralPath)shape).lineTo(47.2, 38.899998);
((GeneralPath)shape).lineTo(47.2, 32.8);
((GeneralPath)shape).lineTo(61.2, 44.9);
((GeneralPath)shape).lineTo(61.2, 49.0);
((GeneralPath)shape).lineTo(47.2, 61.1);
((GeneralPath)shape).lineTo(47.2, 54.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(54.20000076293945, 38.948001861572266), new Point2D.Double(54.20000076293945, 67.30999755859375), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(54.20000076293945, 37.30699920654297), new Point2D.Double(54.20000076293945, 68.94599914550781), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(47.2, 54.8);
((GeneralPath)shape).lineTo(56.7, 46.899998);
((GeneralPath)shape).lineTo(56.7, 46.8);
((GeneralPath)shape).lineTo(47.2, 38.899998);
((GeneralPath)shape).lineTo(47.2, 32.8);
((GeneralPath)shape).lineTo(61.2, 44.9);
((GeneralPath)shape).lineTo(61.2, 49.0);
((GeneralPath)shape).lineTo(47.2, 61.1);
((GeneralPath)shape).lineTo(47.2, 54.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_2);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 74.18699645996094), new Point2D.Double(58.5369987487793, 87.68699645996094), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.9, 84.4);
((GeneralPath)shape).lineTo(24.699999, 85.6);
((GeneralPath)shape).curveTo(24.099998, 87.7, 23.099998, 89.299995, 21.8, 90.299995);
((GeneralPath)shape).curveTo(20.4, 91.299995, 18.699999, 91.799995, 16.599998, 91.799995);
((GeneralPath)shape).curveTo(13.999998, 91.799995, 11.899999, 90.899994, 10.199999, 89.2);
((GeneralPath)shape).curveTo(8.5, 87.4, 7.7, 85.0, 7.7, 82.0);
((GeneralPath)shape).curveTo(7.7, 78.8, 8.5, 76.3, 10.2, 74.5);
((GeneralPath)shape).curveTo(11.9, 72.7, 14.1, 71.8, 16.8, 71.8);
((GeneralPath)shape).curveTo(19.199999, 71.8, 21.099998, 72.5, 22.599998, 73.9);
((GeneralPath)shape).curveTo(23.499998, 74.700005, 24.199999, 75.9, 24.599998, 77.5);
((GeneralPath)shape).lineTo(20.699999, 78.4);
((GeneralPath)shape).curveTo(20.499998, 77.4, 19.999998, 76.6, 19.3, 76.0);
((GeneralPath)shape).curveTo(18.6, 75.4, 17.699999, 75.1, 16.599998, 75.1);
((GeneralPath)shape).curveTo(15.199999, 75.1, 13.999998, 75.6, 13.099998, 76.6);
((GeneralPath)shape).curveTo(12.199999, 77.6, 11.699999, 79.299995, 11.699999, 81.6);
((GeneralPath)shape).curveTo(11.699999, 84.0, 12.099998, 85.799995, 12.999999, 86.799995);
((GeneralPath)shape).curveTo(13.9, 87.799995, 14.999999, 88.399994, 16.5, 88.399994);
((GeneralPath)shape).curveTo(17.5, 88.399994, 18.4, 88.09999, 19.2, 87.399994);
((GeneralPath)shape).curveTo(20.0, 86.899994, 20.5, 85.899994, 20.900002, 84.399994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.099998, 91.5);
((GeneralPath)shape).lineTo(28.099998, 72.2);
((GeneralPath)shape).lineTo(41.5, 72.2);
((GeneralPath)shape).lineTo(41.5, 75.5);
((GeneralPath)shape).lineTo(32.0, 75.5);
((GeneralPath)shape).lineTo(32.0, 80.1);
((GeneralPath)shape).lineTo(40.2, 80.1);
((GeneralPath)shape).lineTo(40.2, 83.4);
((GeneralPath)shape).lineTo(32.0, 83.4);
((GeneralPath)shape).lineTo(32.0, 91.6);
((GeneralPath)shape).lineTo(28.1, 91.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(44.699997, 91.5);
((GeneralPath)shape).lineTo(44.699997, 72.2);
((GeneralPath)shape).lineTo(50.6, 72.2);
((GeneralPath)shape).lineTo(54.1, 85.399994);
((GeneralPath)shape).lineTo(57.6, 72.2);
((GeneralPath)shape).lineTo(63.5, 72.2);
((GeneralPath)shape).lineTo(63.5, 91.5);
((GeneralPath)shape).lineTo(59.8, 91.5);
((GeneralPath)shape).lineTo(59.8, 76.3);
((GeneralPath)shape).lineTo(56.0, 91.5);
((GeneralPath)shape).lineTo(52.2, 91.5);
((GeneralPath)shape).lineTo(48.3, 76.3);
((GeneralPath)shape).lineTo(48.3, 91.5);
((GeneralPath)shape).lineTo(44.7, 91.5);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
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
	private ext_cfm() {
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
       ext_cfm base = new ext_cfm();
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
       ext_cfm base = new ext_cfm();
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
        return ext_cfm::new;
    }
}

