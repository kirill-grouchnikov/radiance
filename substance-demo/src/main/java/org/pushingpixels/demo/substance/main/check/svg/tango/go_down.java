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
public class go_down implements Icon, IsResizable, IsHiDpiAware, UIResource {
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
g.setComposite(AlphaComposite.getInstance(3, 0.20454545f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.2144659757614136f, 0.0f, 0.0f, 0.5954579710960388f, -6.163846015930176f, 16.3127498626709f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(24.837125778198242, 36.42112731933594), 15.644737f, new Point2D.Double(24.837125778198242, 36.42112731933594), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5367230176925659f, 1.6147159538889362E-15f, 16.87306022644043f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(40.48186, 36.421127);
((GeneralPath)shape).curveTo(40.50693, 39.429993, 37.530556, 42.216076, 32.67976, 43.724407);
((GeneralPath)shape).curveTo(27.828962, 45.23274, 21.845287, 45.23274, 16.99449, 43.724407);
((GeneralPath)shape).curveTo(12.143692, 42.216076, 9.167317, 39.429993, 9.192389, 36.421127);
((GeneralPath)shape).curveTo(9.167317, 33.412262, 12.143692, 30.626177, 16.99449, 29.117847);
((GeneralPath)shape).curveTo(21.845287, 27.609516, 27.828962, 27.609516, 32.67976, 29.117847);
((GeneralPath)shape).curveTo(37.530556, 30.626177, 40.50693, 33.412262, 40.48186, 36.421127);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, 47.028560638427734f, 43.999210357666016f));
// _0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_0
paint = new RadialGradientPaint(new Point2D.Double(35.292667388916016, 20.49449348449707), 16.9562f, new Point2D.Double(35.292667388916016, 20.49449348449707), new float[] {0.0f,1.0f}, new Color[] {new Color(115, 210, 22, 255),new Color(78, 154, 6, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.871884976963574E-16f, -0.8430219888687134f, 1.0201679468154907f, 2.26522788707826E-16f, 0.606436014175415f, 42.58613967895508f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.519136, 38.5);
((GeneralPath)shape).lineTo(32.524166, 38.496094);
((GeneralPath)shape).lineTo(32.524166, 25.504469);
((GeneralPath)shape).lineTo(40.51953, 25.496656);
((GeneralPath)shape).lineTo(23.37481, 5.4992137);
((GeneralPath)shape).lineTo(6.5285587, 25.497284);
((GeneralPath)shape).lineTo(14.52444, 25.501074);
((GeneralPath)shape).lineTo(14.519136, 38.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(58, 115, 4, 255);
stroke = new BasicStroke(1.0000004f,1,1,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.519136, 38.5);
((GeneralPath)shape).lineTo(32.524166, 38.496094);
((GeneralPath)shape).lineTo(32.524166, 25.504469);
((GeneralPath)shape).lineTo(40.51953, 25.496656);
((GeneralPath)shape).lineTo(23.37481, 5.4992137);
((GeneralPath)shape).lineTo(6.5285587, 25.497284);
((GeneralPath)shape).lineTo(14.52444, 25.501074);
((GeneralPath)shape).lineTo(14.519136, 38.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 0.5080214f * origAlpha));
AffineTransform defaultTransform__0_0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1
paint = new RadialGradientPaint(new Point2D.Double(15.987215995788574, 1.5350308418273926), 17.171415f, new Point2D.Double(15.987215995788574, 1.5350308418273926), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.7494270752236227E-16f, -2.04672908782959f, -1.557610034942627f, -2.853404124580298E-16f, 44.1155891418457f, 66.93274688720703f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.42989, 24.993467);
((GeneralPath)shape).lineTo(32.0235, 25.005186);
((GeneralPath)shape).lineTo(32.02618, 37.998024);
((GeneralPath)shape).lineTo(16.647623, 37.98887);
((GeneralPath)shape).curveTo(17.417545, 19.64788, 27.370272, 26.995796, 32.02928, 16.341991);
((GeneralPath)shape).lineTo(39.42989, 24.993467);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1_1);
g.setComposite(AlphaComposite.getInstance(3, 0.4812834f * origAlpha));
AffineTransform defaultTransform__0_0_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0000004f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.520704, 37.496094);
((GeneralPath)shape).lineTo(31.522108, 37.5);
((GeneralPath)shape).lineTo(31.522108, 24.50705);
((GeneralPath)shape).lineTo(38.33892, 24.491425);
((GeneralPath)shape).lineTo(23.384644, 7.03884);
((GeneralPath)shape).lineTo(8.678118, 24.495783);
((GeneralPath)shape).lineTo(15.518018, 24.501028);
((GeneralPath)shape).lineTo(15.520704, 37.496094);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1_2);
g.setTransform(defaultTransform__0_0_1);
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
        return 4.969549179077148;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 4.999208450317383;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 38.06089782714844;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 38.247737884521484;
	}

    /** The current width of this resizable icon. */
    private int width;

    /** The current height of this resizable icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image. It is recommended to use the 
     * {@link #of(int, int)} method to obtain a pre-configured instance.
     */
	public go_down() {
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
       go_down base = new go_down();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       go_down base = new go_down();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

