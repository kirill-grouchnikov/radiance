package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconFactory;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_ott implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.056f,0.16f,0.274f,0.398f,0.539f,0.711f,1.0f}, new Color[] {new Color(0, 45, 68, 255),new Color(1, 56, 82, 255),new Color(10, 77, 107, 255),new Color(15, 94, 130, 255),new Color(15, 109, 150, 255),new Color(13, 119, 164, 255),new Color(10, 126, 174, 255),new Color(8, 129, 178, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.8, 81.3);
((GeneralPath)shape).curveTo(8.8, 79.3, 9.1, 77.600006, 9.7, 76.200005);
((GeneralPath)shape).curveTo(10.2, 75.200005, 10.8, 74.3, 11.599999, 73.50001);
((GeneralPath)shape).curveTo(12.4, 72.700005, 13.299999, 72.100006, 14.199999, 71.700005);
((GeneralPath)shape).curveTo(15.399999, 71.200005, 16.9, 70.9, 18.5, 70.9);
((GeneralPath)shape).curveTo(21.5, 70.9, 23.8, 71.8, 25.6, 73.6);
((GeneralPath)shape).curveTo(27.4, 75.4, 28.300001, 77.9, 28.300001, 81.2);
((GeneralPath)shape).curveTo(28.300001, 84.399994, 27.400002, 86.899994, 25.7, 88.7);
((GeneralPath)shape).curveTo(23.900002, 90.5, 21.6, 91.399994, 18.6, 91.399994);
((GeneralPath)shape).curveTo(15.6, 91.399994, 13.200001, 90.49999, 11.5, 88.7);
((GeneralPath)shape).curveTo(9.7, 86.899994, 8.8, 84.399994, 8.8, 81.299995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(13.0, 81.100006);
((GeneralPath)shape).curveTo(13.0, 83.3, 13.5, 85.100006, 14.6, 86.200005);
((GeneralPath)shape).curveTo(15.6, 87.4, 17.0, 87.9, 18.6, 87.9);
((GeneralPath)shape).curveTo(20.2, 87.9, 21.5, 87.3, 22.6, 86.200005);
((GeneralPath)shape).curveTo(23.6, 85.00001, 24.2, 83.3, 24.2, 81.00001);
((GeneralPath)shape).curveTo(24.2, 78.700005, 23.7, 77.00001, 22.7, 75.90001);
((GeneralPath)shape).curveTo(21.7, 74.80001, 20.400002, 74.20001, 18.7, 74.20001);
((GeneralPath)shape).curveTo(17.0, 74.20001, 15.700001, 74.80001, 14.700001, 75.90001);
((GeneralPath)shape).curveTo(13.500001, 77.100006, 13.000001, 78.80001, 13.000001, 81.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.9, 91.100006);
((GeneralPath)shape).lineTo(35.9, 74.6);
((GeneralPath)shape).lineTo(30.0, 74.6);
((GeneralPath)shape).lineTo(30.0, 71.2);
((GeneralPath)shape).lineTo(45.9, 71.2);
((GeneralPath)shape).lineTo(45.9, 74.6);
((GeneralPath)shape).lineTo(40.0, 74.6);
((GeneralPath)shape).lineTo(40.0, 91.1);
((GeneralPath)shape).lineTo(35.9, 91.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.0, 91.100006);
((GeneralPath)shape).lineTo(53.0, 74.6);
((GeneralPath)shape).lineTo(47.1, 74.6);
((GeneralPath)shape).lineTo(47.1, 71.2);
((GeneralPath)shape).lineTo(63.0, 71.2);
((GeneralPath)shape).lineTo(63.0, 74.6);
((GeneralPath)shape).lineTo(57.1, 74.6);
((GeneralPath)shape).lineTo(57.1, 91.1);
((GeneralPath)shape).lineTo(53.0, 91.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {new Color(223, 241, 250, 255),new Color(220, 238, 247, 255),new Color(211, 228, 239, 255),new Color(196, 214, 227, 255),new Color(177, 197, 213, 255),new Color(154, 176, 197, 255),new Color(129, 154, 179, 255),new Color(100, 130, 159, 255),new Color(66, 108, 140, 255),new Color(6, 87, 122, 255),new Color(1, 86, 121, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.2, 34.0);
((GeneralPath)shape).lineTo(41.100002, 34.0);
((GeneralPath)shape).curveTo(43.9, 34.2, 46.2, 34.9, 48.4, 35.8);
((GeneralPath)shape).curveTo(52.600002, 33.899998, 58.7, 35.399998, 62.4, 36.8);
((GeneralPath)shape).curveTo(57.600002, 36.3, 51.9, 36.8, 48.600002, 38.7);
((GeneralPath)shape).curveTo(45.3, 36.0, 39.0, 35.3, 33.1, 36.0);
((GeneralPath)shape).curveTo(34.8, 34.9, 36.8, 34.2, 39.199997, 34.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.8, 41.3);
((GeneralPath)shape).curveTo(34.399998, 41.5, 31.599998, 42.6, 29.699999, 44.2);
((GeneralPath)shape).curveTo(24.0, 41.600002, 14.199999, 42.7, 10.499998, 46.2);
((GeneralPath)shape).curveTo(10.199998, 46.4, 9.799998, 46.7, 9.899998, 47.0);
((GeneralPath)shape).curveTo(13.0999975, 46.0, 16.999998, 45.2, 21.099998, 45.5);
((GeneralPath)shape).curveTo(25.099998, 45.8, 28.099998, 47.2, 30.399998, 49.0);
((GeneralPath)shape).curveTo(34.499996, 45.3, 40.6, 43.2, 48.299995, 43.3);
((GeneralPath)shape).curveTo(45.599995, 42.0, 41.699997, 41.0, 37.799995, 41.3);
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
	public ext_ott() {
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
       ext_ott base = new ext_ott();
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
       ext_ott base = new ext_ott();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static ResizableIconFactory factory() {
        return () -> new ext_ott();
    }
}

