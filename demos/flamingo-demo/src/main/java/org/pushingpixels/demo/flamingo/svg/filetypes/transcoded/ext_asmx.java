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
public class ext_asmx implements ResizableIcon, IsHiDpiAware {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.265000104904175), new Point2D.Double(36.0, 100.25), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
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
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.9, 89.8);
((GeneralPath)shape).lineTo(16.4, 89.8);
((GeneralPath)shape).lineTo(15.0, 86.2);
((GeneralPath)shape).lineTo(8.6, 86.2);
((GeneralPath)shape).lineTo(7.3, 89.799995);
((GeneralPath)shape).lineTo(3.9, 89.799995);
((GeneralPath)shape).lineTo(10.1, 74.1);
((GeneralPath)shape).lineTo(13.5, 74.1);
((GeneralPath)shape).lineTo(19.9, 89.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(14.0, 83.6);
((GeneralPath)shape).lineTo(11.8, 77.799995);
((GeneralPath)shape).lineTo(9.700001, 83.6);
((GeneralPath)shape).lineTo(14.0, 83.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(20.8, 84.7);
((GeneralPath)shape).lineTo(23.9, 84.399994);
((GeneralPath)shape).curveTo(24.1, 85.399994, 24.5, 86.2, 25.0, 86.7);
((GeneralPath)shape).curveTo(25.6, 87.2, 26.4, 87.399994, 27.3, 87.399994);
((GeneralPath)shape).curveTo(28.3, 87.399994, 29.099998, 87.2, 29.599998, 86.7);
((GeneralPath)shape).curveTo(30.099998, 86.299995, 30.399998, 85.799995, 30.399998, 85.2);
((GeneralPath)shape).curveTo(30.399998, 84.799995, 30.299997, 84.5, 30.099998, 84.2);
((GeneralPath)shape).curveTo(29.999998, 84.0, 29.599998, 83.799995, 28.999998, 83.6);
((GeneralPath)shape).curveTo(28.599998, 83.5, 27.799997, 83.2, 26.399998, 82.9);
((GeneralPath)shape).curveTo(24.699997, 82.5, 23.499998, 82.0, 22.799997, 81.3);
((GeneralPath)shape).curveTo(21.799997, 80.4, 21.299997, 79.4, 21.299997, 78.100006);
((GeneralPath)shape).curveTo(21.299997, 77.3, 21.499998, 76.50001, 21.999998, 75.90001);
((GeneralPath)shape).curveTo(22.499998, 75.20001, 23.099998, 74.70001, 23.999998, 74.30001);
((GeneralPath)shape).curveTo(24.899998, 73.90001, 25.899998, 73.80001, 27.099998, 73.80001);
((GeneralPath)shape).curveTo(29.099998, 73.80001, 30.599998, 74.20001, 31.599998, 75.10001);
((GeneralPath)shape).curveTo(32.6, 76.000015, 33.1, 77.10001, 33.199997, 78.60001);
((GeneralPath)shape).lineTo(29.999996, 78.70001);
((GeneralPath)shape).curveTo(29.899996, 77.90001, 29.599997, 77.30001, 29.099997, 77.000015);
((GeneralPath)shape).curveTo(28.599997, 76.60001, 27.999996, 76.500015, 27.099997, 76.500015);
((GeneralPath)shape).curveTo(26.199997, 76.500015, 25.399996, 76.70001, 24.899996, 77.10001);
((GeneralPath)shape).curveTo(24.599997, 77.30001, 24.399996, 77.70001, 24.399996, 78.10001);
((GeneralPath)shape).curveTo(24.399996, 78.500015, 24.599997, 78.80001, 24.899996, 79.10001);
((GeneralPath)shape).curveTo(25.299995, 79.40002, 26.299995, 79.80001, 27.899996, 80.20001);
((GeneralPath)shape).curveTo(29.499996, 80.60001, 30.599997, 80.90001, 31.399996, 81.30001);
((GeneralPath)shape).curveTo(32.099995, 81.70001, 32.699997, 82.20001, 33.199997, 82.90001);
((GeneralPath)shape).curveTo(33.6, 83.600006, 33.799995, 84.40001, 33.799995, 85.40001);
((GeneralPath)shape).curveTo(33.799995, 86.30001, 33.499996, 87.100006, 32.999996, 87.90001);
((GeneralPath)shape).curveTo(32.499996, 88.70001, 31.799995, 89.30001, 30.899996, 89.70001);
((GeneralPath)shape).curveTo(29.999996, 90.10001, 28.799995, 90.30001, 27.399996, 90.30001);
((GeneralPath)shape).curveTo(25.399996, 90.30001, 23.799995, 89.80001, 22.799995, 88.90001);
((GeneralPath)shape).curveTo(21.599995, 87.80001, 20.999996, 86.50001, 20.799995, 84.70001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.4, 89.799995);
((GeneralPath)shape).lineTo(36.4, 74.1);
((GeneralPath)shape).lineTo(41.2, 74.1);
((GeneralPath)shape).lineTo(44.100002, 84.799995);
((GeneralPath)shape).lineTo(47.0, 74.1);
((GeneralPath)shape).lineTo(51.8, 74.1);
((GeneralPath)shape).lineTo(51.8, 89.799995);
((GeneralPath)shape).lineTo(48.8, 89.799995);
((GeneralPath)shape).lineTo(48.8, 77.4);
((GeneralPath)shape).lineTo(45.6, 89.8);
((GeneralPath)shape).lineTo(42.5, 89.8);
((GeneralPath)shape).lineTo(39.4, 77.4);
((GeneralPath)shape).lineTo(39.4, 89.8);
((GeneralPath)shape).lineTo(36.4, 89.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.300003, 89.799995);
((GeneralPath)shape).lineTo(58.700005, 81.6);
((GeneralPath)shape).lineTo(53.800003, 74.1);
((GeneralPath)shape).lineTo(57.600002, 74.1);
((GeneralPath)shape).lineTo(60.800003, 79.2);
((GeneralPath)shape).lineTo(63.9, 74.1);
((GeneralPath)shape).lineTo(67.6, 74.1);
((GeneralPath)shape).lineTo(62.699997, 81.7);
((GeneralPath)shape).lineTo(68.1, 89.799995);
((GeneralPath)shape).lineTo(64.2, 89.799995);
((GeneralPath)shape).lineTo(60.699997, 84.399994);
((GeneralPath)shape).lineTo(57.199997, 89.799995);
((GeneralPath)shape).lineTo(53.299995, 89.799995);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(35.61899948120117, 64.5), new Point2D.Double(35.61899948120117, 18.9060001373291), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.2, 44.6);
((GeneralPath)shape).curveTo(26.800001, 45.6, 25.5, 46.699997, 24.2, 47.699997);
((GeneralPath)shape).curveTo(21.5, 49.699997, 18.900002, 51.799995, 16.2, 53.799995);
((GeneralPath)shape).curveTo(15.800001, 54.099995, 15.6, 54.099995, 15.200001, 53.899994);
((GeneralPath)shape).curveTo(14.700001, 53.599995, 14.1, 53.299995, 13.500001, 52.999992);
((GeneralPath)shape).curveTo(13.200001, 52.79999, 13.100001, 52.59999, 13.100001, 52.29999);
((GeneralPath)shape).lineTo(13.100001, 31.1);
((GeneralPath)shape).curveTo(13.100001, 30.9, 13.300001, 30.5, 13.500001, 30.4);
((GeneralPath)shape).curveTo(14.100001, 30.0, 14.800001, 29.699999, 15.400001, 29.4);
((GeneralPath)shape).curveTo(15.700001, 29.199999, 16.0, 29.4, 16.300001, 29.6);
((GeneralPath)shape).curveTo(18.500002, 31.300001, 20.7, 33.0, 22.900002, 34.6);
((GeneralPath)shape).curveTo(24.7, 36.0, 26.500002, 37.399998, 28.300001, 38.699997);
((GeneralPath)shape).curveTo(28.400002, 38.6, 28.6, 38.499996, 28.7, 38.399998);
((GeneralPath)shape).curveTo(35.3, 31.999998, 41.9, 25.599998, 48.4, 19.199997);
((GeneralPath)shape).curveTo(48.7, 18.899998, 49.0, 18.799997, 49.4, 18.999996);
((GeneralPath)shape).curveTo(52.2, 20.099997, 55.0, 21.199997, 57.800003, 22.399996);
((GeneralPath)shape).curveTo(58.000004, 22.499996, 58.200005, 22.799995, 58.300003, 22.999996);
((GeneralPath)shape).curveTo(58.4, 23.099997, 58.300003, 23.299995, 58.300003, 23.499996);
((GeneralPath)shape).lineTo(58.300003, 60.0);
((GeneralPath)shape).curveTo(58.300003, 60.9, 58.300003, 60.9, 57.4, 61.2);
((GeneralPath)shape).curveTo(54.7, 62.3, 52.100002, 63.3, 49.5, 64.4);
((GeneralPath)shape).curveTo(49.0, 64.6, 48.7, 64.5, 48.4, 64.200005);
((GeneralPath)shape).curveTo(41.9, 57.800003, 35.4, 51.500004, 28.800001, 45.200005);
((GeneralPath)shape).lineTo(28.2, 44.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.2, 50.399998);
((GeneralPath)shape).lineTo(47.2, 33.0);
((GeneralPath)shape).curveTo(43.3, 35.9, 39.5, 38.8, 35.6, 41.7);
((GeneralPath)shape).curveTo(39.5, 44.600002, 43.3, 47.5, 47.199997, 50.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(22.900002, 41.699997);
((GeneralPath)shape).curveTo(21.000002, 39.999996, 19.100002, 38.299995, 17.100002, 36.499996);
((GeneralPath)shape).lineTo(17.100002, 46.899994);
((GeneralPath)shape).curveTo(19.000002, 45.199993, 20.900002, 43.399994, 22.900002, 41.699993);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 73.45700073242188), new Point2D.Double(58.569000244140625, 86.95700073242188), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
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
		return 0.9980000257492065;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. It is recommended to use the 
	 * {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	public ext_asmx() {
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
       ext_asmx base = new ext_asmx();
       base.width = width;
       base.height = height;
       return new NeonIcon(base);
    }

    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_asmx base = new ext_asmx();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }
}

