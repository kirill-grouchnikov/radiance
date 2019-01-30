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
public class ext_psp implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {new Color(0, 107, 105, 255),new Color(0, 128, 127, 255),new Color(0, 147, 147, 255),new Color(0, 163, 163, 255),new Color(0, 176, 175, 255),new Color(8, 184, 183, 255),new Color(20, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.6, 91.1);
((GeneralPath)shape).lineTo(10.6, 71.2);
((GeneralPath)shape).lineTo(17.0, 71.2);
((GeneralPath)shape).curveTo(19.5, 71.2, 21.1, 71.299995, 21.8, 71.5);
((GeneralPath)shape).curveTo(22.9, 71.8, 23.9, 72.4, 24.699999, 73.4);
((GeneralPath)shape).curveTo(25.499998, 74.4, 25.9, 75.700005, 25.9, 77.3);
((GeneralPath)shape).curveTo(25.9, 78.5, 25.699999, 79.5, 25.199999, 80.4);
((GeneralPath)shape).curveTo(24.8, 81.200005, 24.199999, 81.9, 23.499998, 82.4);
((GeneralPath)shape).curveTo(22.799997, 82.9, 22.099998, 83.200005, 21.399998, 83.3);
((GeneralPath)shape).curveTo(20.399998, 83.5, 18.999998, 83.600006, 17.199997, 83.600006);
((GeneralPath)shape).lineTo(14.599997, 83.600006);
((GeneralPath)shape).lineTo(14.599997, 91.100006);
((GeneralPath)shape).lineTo(10.599997, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(14.6, 74.6);
((GeneralPath)shape).lineTo(14.6, 80.2);
((GeneralPath)shape).lineTo(16.800001, 80.2);
((GeneralPath)shape).curveTo(18.400002, 80.2, 19.500002, 80.1, 20.000002, 79.899994);
((GeneralPath)shape).curveTo(20.500002, 79.7, 21.000002, 79.399994, 21.300001, 78.899994);
((GeneralPath)shape).curveTo(21.6, 78.49999, 21.800001, 77.899994, 21.800001, 77.399994);
((GeneralPath)shape).curveTo(21.800001, 76.7, 21.6, 76.09999, 21.2, 75.59999);
((GeneralPath)shape).curveTo(20.800001, 75.09999, 20.2, 74.79999, 19.6, 74.69999);
((GeneralPath)shape).curveTo(19.1, 74.59999, 18.2, 74.59999, 16.7, 74.59999);
((GeneralPath)shape).lineTo(14.6, 74.59999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.2, 84.6);
((GeneralPath)shape).lineTo(32.100002, 84.2);
((GeneralPath)shape).curveTo(32.300003, 85.5, 32.800003, 86.5, 33.500004, 87.1);
((GeneralPath)shape).curveTo(34.200005, 87.7, 35.200005, 88.0, 36.400005, 88.0);
((GeneralPath)shape).curveTo(37.700005, 88.0, 38.700005, 87.7, 39.300007, 87.2);
((GeneralPath)shape).curveTo(40.000008, 86.7, 40.300007, 86.0, 40.300007, 85.299995);
((GeneralPath)shape).curveTo(40.300007, 84.799995, 40.20001, 84.399994, 39.900005, 84.1);
((GeneralPath)shape).curveTo(39.600006, 83.799995, 39.100006, 83.5, 38.400005, 83.2);
((GeneralPath)shape).curveTo(37.900005, 83.0, 36.900005, 82.7, 35.200005, 82.299995);
((GeneralPath)shape).curveTo(33.000004, 81.799995, 31.500004, 81.1, 30.600004, 80.299995);
((GeneralPath)shape).curveTo(29.400003, 79.2, 28.800005, 77.899994, 28.800005, 76.299995);
((GeneralPath)shape).curveTo(28.800005, 75.299995, 29.100004, 74.299995, 29.700005, 73.49999);
((GeneralPath)shape).curveTo(30.300005, 72.59999, 31.100004, 71.99999, 32.200005, 71.49999);
((GeneralPath)shape).curveTo(33.300003, 70.99999, 34.600006, 70.799995, 36.100006, 70.799995);
((GeneralPath)shape).curveTo(38.600006, 70.799995, 40.500008, 71.299995, 41.800007, 72.399994);
((GeneralPath)shape).curveTo(43.100006, 73.49999, 43.70001, 74.899994, 43.800007, 76.799995);
((GeneralPath)shape).lineTo(39.800007, 76.99999);
((GeneralPath)shape).curveTo(39.600006, 75.99999, 39.300007, 75.19999, 38.70001, 74.799995);
((GeneralPath)shape).curveTo(38.10001, 74.399994, 37.300007, 74.1, 36.10001, 74.1);
((GeneralPath)shape).curveTo(34.90001, 74.1, 34.00001, 74.299995, 33.30001, 74.799995);
((GeneralPath)shape).curveTo(32.90001, 75.1, 32.700012, 75.49999, 32.700012, 75.99999);
((GeneralPath)shape).curveTo(32.700012, 76.49999, 32.900013, 76.899994, 33.30001, 77.19999);
((GeneralPath)shape).curveTo(33.80001, 77.59999, 35.00001, 78.09999, 37.00001, 78.49999);
((GeneralPath)shape).curveTo(39.00001, 78.899994, 40.400013, 79.399994, 41.400013, 79.899994);
((GeneralPath)shape).curveTo(42.300014, 80.399994, 43.100014, 81.09999, 43.600014, 81.899994);
((GeneralPath)shape).curveTo(44.100014, 82.7, 44.400013, 83.799995, 44.400013, 85.09999);
((GeneralPath)shape).curveTo(44.400013, 86.19999, 44.100014, 87.29999, 43.400013, 88.29999);
((GeneralPath)shape).curveTo(42.800014, 89.29999, 41.900013, 89.999985, 40.700012, 90.499985);
((GeneralPath)shape).curveTo(39.50001, 90.999985, 38.100014, 91.19998, 36.400013, 91.19998);
((GeneralPath)shape).curveTo(33.900013, 91.19998, 31.900013, 90.59998, 30.600014, 89.499985);
((GeneralPath)shape).curveTo(29.200014, 88.499985, 28.400013, 86.79999, 28.200014, 84.59998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.800003, 91.1);
((GeneralPath)shape).lineTo(47.800003, 71.2);
((GeneralPath)shape).lineTo(54.300003, 71.2);
((GeneralPath)shape).curveTo(56.800003, 71.2, 58.4, 71.299995, 59.100002, 71.5);
((GeneralPath)shape).curveTo(60.2, 71.8, 61.2, 72.4, 62.000004, 73.4);
((GeneralPath)shape).curveTo(62.800007, 74.4, 63.200005, 75.700005, 63.200005, 77.3);
((GeneralPath)shape).curveTo(63.200005, 78.5, 63.000004, 79.5, 62.500004, 80.4);
((GeneralPath)shape).curveTo(62.100002, 81.200005, 61.500004, 81.9, 60.800003, 82.4);
((GeneralPath)shape).curveTo(60.100002, 82.9, 59.4, 83.200005, 58.700005, 83.3);
((GeneralPath)shape).curveTo(57.700005, 83.5, 56.300003, 83.600006, 54.500004, 83.600006);
((GeneralPath)shape).lineTo(51.900005, 83.600006);
((GeneralPath)shape).lineTo(51.900005, 91.100006);
((GeneralPath)shape).lineTo(47.800007, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(51.800003, 74.6);
((GeneralPath)shape).lineTo(51.800003, 80.2);
((GeneralPath)shape).lineTo(54.0, 80.2);
((GeneralPath)shape).curveTo(55.6, 80.2, 56.7, 80.1, 57.2, 79.899994);
((GeneralPath)shape).curveTo(57.7, 79.7, 58.2, 79.399994, 58.5, 78.899994);
((GeneralPath)shape).curveTo(58.8, 78.49999, 59.0, 77.899994, 59.0, 77.399994);
((GeneralPath)shape).curveTo(59.0, 76.7, 58.8, 76.09999, 58.4, 75.59999);
((GeneralPath)shape).curveTo(58.0, 75.09999, 57.4, 74.79999, 56.800003, 74.69999);
((GeneralPath)shape).curveTo(56.300003, 74.59999, 55.4, 74.59999, 53.9, 74.59999);
((GeneralPath)shape).lineTo(51.800003, 74.59999);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {new Color(214, 237, 232, 255),new Color(211, 235, 230, 255),new Color(199, 227, 223, 255),new Color(183, 216, 213, 255),new Color(160, 203, 201, 255),new Color(132, 186, 185, 255),new Color(98, 167, 167, 255),new Color(52, 147, 148, 255),new Color(0, 127, 127, 255),new Color(0, 107, 106, 255),new Color(0, 107, 105, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_1);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(36.25, 37.35300064086914), new Point2D.Double(36.25, 85.16100311279297), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(62.7, 56.8);
((GeneralPath)shape).curveTo(61.100002, 56.0, 58.100002, 50.2, 53.5, 49.8);
((GeneralPath)shape).curveTo(49.5, 49.5, 44.4, 48.0, 41.6, 47.8);
((GeneralPath)shape).curveTo(38.1, 42.0, 32.1, 32.8, 27.099998, 27.9);
((GeneralPath)shape).lineTo(40.899998, 28.6);
((GeneralPath)shape).curveTo(37.2, 19.8, 27.7, 23.0, 27.7, 23.0);
((GeneralPath)shape).lineTo(34.100002, 17.7);
((GeneralPath)shape).curveTo(25.900002, 14.400001, 22.500002, 22.400002, 22.500002, 22.400002);
((GeneralPath)shape).curveTo(14.000002, 17.7, 9.600002, 25.7, 9.600002, 25.7);
((GeneralPath)shape).lineTo(18.400002, 26.300001);
((GeneralPath)shape).curveTo(8.4, 29.1, 11.2, 39.0, 11.2, 39.0);
((GeneralPath)shape).lineTo(20.099998, 31.0);
((GeneralPath)shape).curveTo(18.199999, 35.4, 22.399998, 38.5, 22.399998, 38.5);
((GeneralPath)shape).lineTo(25.0, 27.7);
((GeneralPath)shape).curveTo(25.0, 27.7, 34.3, 38.300003, 37.2, 49.1);
((GeneralPath)shape).curveTo(33.5, 51.0, 27.7, 54.1, 23.2, 54.699997);
((GeneralPath)shape).curveTo(17.0, 55.499996, 9.700001, 59.699997, 9.700001, 59.699997);
((GeneralPath)shape).lineTo(9.700001, 64.6);
((GeneralPath)shape).lineTo(62.8, 64.6);
((GeneralPath)shape).lineTo(62.7, 56.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.13300000131130219;
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
		return 0.7380063533782959;
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
	private ext_psp() {
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
       ext_psp base = new ext_psp();
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
       ext_psp base = new ext_psp();
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
        return () -> new ext_psp();
    }
}

