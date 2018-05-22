package org.pushingpixels.demo.substance.main.check.svg.tango;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.Icon;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.icon.IsHiDpiAware;
import org.pushingpixels.substance.api.icon.IsResizable;
import org.pushingpixels.substance.api.icon.SubstanceIcon;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/ibis">Ibis SVG transcoder</a>.
 */
public class process_stop implements Icon, IsResizable, IsHiDpiAware, UIResource {
    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = ((Graphics2D)g).getComposite();
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.6306818f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.1738029718399048f, 0.0f, 0.0f, 0.6000000238418579f, -5.265865802764893f, 19.575000762939453f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(25.125, 36.75), 15.75f, new Point2D.Double(25.125, 36.75), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5952379703521729f, -2.3006780688054245E-15f, 14.875f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(40.875, 36.75);
((GeneralPath)shape).curveTo(40.900238, 40.109352, 37.90384, 43.21997, 33.020405, 44.904);
((GeneralPath)shape).curveTo(28.136969, 46.588028, 22.113031, 46.588028, 17.229597, 44.904);
((GeneralPath)shape).curveTo(12.346162, 43.21997, 9.34976, 40.109352, 9.375, 36.75);
((GeneralPath)shape).curveTo(9.34976, 33.390648, 12.346162, 30.28003, 17.229597, 28.596);
((GeneralPath)shape).curveTo(22.113031, 26.911972, 28.136969, 26.911972, 33.020405, 28.596);
((GeneralPath)shape).curveTo(37.90384, 30.28003, 40.900238, 33.390648, 40.875, 36.75);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new LinearGradientPaint(new Point2D.Double(23.99598503112793, 20.105337142944336), new Point2D.Double(41.04783630371094, 37.95978546142578), new float[] {0.0f,1.0f}, new Color[] {new Color(204, 0, 0, 255),new Color(179, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.591006, 0.4919213);
((GeneralPath)shape).lineTo(32.67631, 0.4919213);
((GeneralPath)shape).lineTo(45.497585, 13.586385);
((GeneralPath)shape).lineTo(45.497585, 31.48003);
((GeneralPath)shape).lineTo(32.848988, 43.49693);
((GeneralPath)shape).lineTo(15.418649, 43.49693);
((GeneralPath)shape).lineTo(2.4943857, 30.658264);
((GeneralPath)shape).lineTo(2.4943857, 13.464078);
((GeneralPath)shape).lineTo(15.591006, 0.4919213);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(134, 0, 0, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.591006, 0.4919213);
((GeneralPath)shape).lineTo(32.67631, 0.4919213);
((GeneralPath)shape).lineTo(45.497585, 13.586385);
((GeneralPath)shape).lineTo(45.497585, 31.48003);
((GeneralPath)shape).lineTo(32.848988, 43.49693);
((GeneralPath)shape).lineTo(15.418649, 43.49693);
((GeneralPath)shape).lineTo(2.4943857, 30.658264);
((GeneralPath)shape).lineTo(2.4943857, 13.464078);
((GeneralPath)shape).lineTo(15.591006, 0.4919213);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.8131868f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(15.737001419067383, 12.503600120544434), new Point2D.Double(53.570125579833984, 47.37431716918945), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 139, 139, 255),new Color(236, 27, 27, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -2.0f));
stroke = new BasicStroke(1.0000002f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.020655, 1.5003424);
((GeneralPath)shape).lineTo(32.24856, 1.5003424);
((GeneralPath)shape).lineTo(44.496456, 13.922717);
((GeneralPath)shape).lineTo(44.496456, 31.037);
((GeneralPath)shape).lineTo(32.638474, 42.48783);
((GeneralPath)shape).lineTo(15.870253, 42.48783);
((GeneralPath)shape).lineTo(3.5090792, 30.208717);
((GeneralPath)shape).lineTo(3.5090792, 13.84561);
((GeneralPath)shape).lineTo(16.020655, 1.5003424);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.28977272f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new RadialGradientPaint(new Point2D.Double(16.75, 10.666343688964844), 21.25f, new Point2D.Double(16.75, 10.666343688964844), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(4.154956817626953f, -2.9792059809856577E-24f, 3.255656960409251E-24f, 3.198723077774048f, -52.84553146362305f, -23.50921058654785f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.6875, 0.75);
((GeneralPath)shape).lineTo(2.75, 13.5625);
((GeneralPath)shape).lineTo(2.75, 30.5625);
((GeneralPath)shape).lineTo(5.6875, 33.46875);
((GeneralPath)shape).curveTo(22.45004, 33.5263, 22.164665, 20.450068, 45.25, 21.59375);
((GeneralPath)shape).lineTo(45.25, 13.6875);
((GeneralPath)shape).lineTo(32.5625, 0.75);
((GeneralPath)shape).lineTo(15.6875, 0.75);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new RadialGradientPaint(new Point2D.Double(24.302249908447266, 33.302249908447266), 12.30225f, new Point2D.Double(24.302249908447266, 33.302249908447266), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(219, 219, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.6939810514450073f, -5.775713850024141E-16f, 5.775713850024141E-16f, 1.6939810514450073f, -16.86528968811035f, -25.11111068725586f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.767176, 10.5);
((GeneralPath)shape).lineTo(12.5, 14.767175);
((GeneralPath)shape).lineTo(20.035074, 22.30225);
((GeneralPath)shape).lineTo(12.5, 29.837324);
((GeneralPath)shape).lineTo(16.767176, 34.1045);
((GeneralPath)shape).lineTo(24.30225, 26.569426);
((GeneralPath)shape).lineTo(31.837324, 34.1045);
((GeneralPath)shape).lineTo(36.1045, 29.837324);
((GeneralPath)shape).lineTo(28.569426, 22.30225);
((GeneralPath)shape).lineTo(36.1045, 14.767175);
((GeneralPath)shape).lineTo(31.837324, 10.5);
((GeneralPath)shape).lineTo(24.30225, 18.035074);
((GeneralPath)shape).lineTo(16.767176, 10.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(21.75, 15.802249908447266), new Point2D.Double(24.302249908447266, 35.052249908447266), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 2, 2, 255),new Color(255, 155, 155, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -2.0f));
stroke = new BasicStroke(0.9999996f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.767176, 10.5);
((GeneralPath)shape).lineTo(12.5, 14.767175);
((GeneralPath)shape).lineTo(20.035074, 22.30225);
((GeneralPath)shape).lineTo(12.5, 29.837324);
((GeneralPath)shape).lineTo(16.767176, 34.1045);
((GeneralPath)shape).lineTo(24.30225, 26.569426);
((GeneralPath)shape).lineTo(31.837324, 34.1045);
((GeneralPath)shape).lineTo(36.1045, 29.837324);
((GeneralPath)shape).lineTo(28.569426, 22.30225);
((GeneralPath)shape).lineTo(36.1045, 14.767175);
((GeneralPath)shape).lineTo(31.837324, 10.5);
((GeneralPath)shape).lineTo(24.30225, 18.035074);
((GeneralPath)shape).lineTo(16.767176, 10.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4);
g.setTransform(defaultTransform__0_0);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 1.9943857192993164;
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
		return 44.00351333618164;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 47.52781677246094;
	}

    /** The current width of this resizable icon. */
    private int width;

    /** The current height of this resizable icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image. It is recommended to use the 
     * {@link #of(int, int)} method to obtain a pre-configured instance.
     */
	public process_stop() {
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

		double coef1 = (double) this.width / (double) getOrigWidth();
		double coef2 = (double) this.height / (double) getOrigHeight();
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
    public static SubstanceIcon of(int width, int height) {
       process_stop base = new process_stop();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       process_stop base = new process_stop();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

