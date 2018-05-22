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
public class face_grin implements Icon, IsResizable, IsHiDpiAware, UIResource {
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
g.setComposite(AlphaComposite.getInstance(3, 0.5316456f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(24.714284896850586, 38.57143020629883), 19.714285f, new Point2D.Double(24.714284896850586, 38.57143020629883), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.33333298563957214f, 0.0f, 25.714290618896484f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.42857, 38.57143);
((GeneralPath)shape).curveTo(44.460163, 40.926178, 40.709564, 43.10657, 34.596966, 44.286995);
((GeneralPath)shape).curveTo(28.484367, 45.46742, 20.944202, 45.46742, 14.831604, 44.286995);
((GeneralPath)shape).curveTo(8.719005, 43.10657, 4.9684076, 40.926178, 5.0, 38.57143);
((GeneralPath)shape).curveTo(4.9684076, 36.216682, 8.719005, 34.03629, 14.831604, 32.855865);
((GeneralPath)shape).curveTo(20.944202, 31.675442, 28.484367, 31.675442, 34.596966, 32.855865);
((GeneralPath)shape).curveTo(40.709564, 34.03629, 44.460163, 36.216682, 44.42857, 38.57143);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(2.083142042160034f, 0.0f, 0.0f, 2.083142042160034f, -40.547149658203125f, -16.49224090576172f));
// _0_0_1
paint = new RadialGradientPaint(new Point2D.Double(29.288070678710938, 15.72098445892334), 8.90208f, new Point2D.Double(29.158466339111328, 15.755711555480957), new float[] {0.0f,0.6448598f,1.0f}, new Color[] {new Color(255, 252, 222, 255),new Color(246, 231, 106, 255),new Color(255, 183, 56, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.774754, 19.008621);
((GeneralPath)shape).curveTo(39.788635, 22.112505, 38.140697, 24.986568, 35.454945, 26.54253);
((GeneralPath)shape).curveTo(32.769196, 28.098494, 29.4562, 28.098494, 26.770447, 26.54253);
((GeneralPath)shape).curveTo(24.084696, 24.986568, 22.436758, 22.112505, 22.45064, 19.008621);
((GeneralPath)shape).curveTo(22.436758, 15.904738, 24.084696, 13.030674, 26.770447, 11.474711);
((GeneralPath)shape).curveTo(29.4562, 9.918749, 32.769196, 9.918749, 35.454945, 11.474711);
((GeneralPath)shape).curveTo(38.140697, 13.030674, 39.788635, 15.904738, 39.774754, 19.008621);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(156, 140, 10, 255);
stroke = new BasicStroke(0.48004404f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.774754, 19.008621);
((GeneralPath)shape).curveTo(39.788635, 22.112505, 38.140697, 24.986568, 35.454945, 26.54253);
((GeneralPath)shape).curveTo(32.769196, 28.098494, 29.4562, 28.098494, 26.770447, 26.54253);
((GeneralPath)shape).curveTo(24.084696, 24.986568, 22.436758, 22.112505, 22.45064, 19.008621);
((GeneralPath)shape).curveTo(22.436758, 15.904738, 24.084696, 13.030674, 26.770447, 11.474711);
((GeneralPath)shape).curveTo(29.4562, 9.918749, 32.769196, 9.918749, 35.454945, 11.474711);
((GeneralPath)shape).curveTo(38.140697, 13.030674, 39.788635, 15.904738, 39.774754, 19.008621);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.6772152f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.979781985282898f, 0.0f, 0.0f, 1.979781985282898f, -37.33127975463867f, -14.527460098266602f));
// _0_0_2
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.5051063f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.774754, 19.008621);
((GeneralPath)shape).curveTo(39.788635, 22.112505, 38.140697, 24.986568, 35.454945, 26.54253);
((GeneralPath)shape).curveTo(32.769196, 28.098494, 29.4562, 28.098494, 26.770447, 26.54253);
((GeneralPath)shape).curveTo(24.084696, 24.986568, 22.436758, 22.112505, 22.45064, 19.008621);
((GeneralPath)shape).curveTo(22.436758, 15.904738, 24.084696, 13.030674, 26.770447, 11.474711);
((GeneralPath)shape).curveTo(29.4562, 9.918749, 32.769196, 9.918749, 35.454945, 11.474711);
((GeneralPath)shape).curveTo(38.140697, 13.030674, 39.788635, 15.904738, 39.774754, 19.008621);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(-0.9659259915351868f, -0.25881901383399963f, 0.25881901383399963f, -0.9659259915351868f, 24.534420013427734f, 17.201309204101562f));
// _0_0_3
paint = new Color(85, 87, 83, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-0.875, 1.875);
((GeneralPath)shape).curveTo(-0.875, 3.1762414, -1.7679925, 4.315251, -3.052219, 4.6520367);
((GeneralPath)shape).curveTo(-4.336446, 4.988823, -5.691685, 4.439408, -6.3564496, 3.3125);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(-0.9659259915351868f, -0.25881901383399963f, 0.25881901383399963f, -0.9659259915351868f, 15.784420013427734f, 17.201309204101562f));
// _0_0_4
paint = new Color(85, 87, 83, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-0.875, 1.875);
((GeneralPath)shape).curveTo(-0.875, 3.1762414, -1.7679925, 4.315251, -3.052219, 4.6520367);
((GeneralPath)shape).curveTo(-4.336446, 4.988823, -5.691685, 4.439408, -6.3564496, 3.3125);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new LinearGradientPaint(new Point2D.Double(9.789263725280762, 29.629091262817383), new Point2D.Double(38.39073181152344, 29.629091262817383), new float[] {0.0f,0.34579438f,0.7248668f,1.0f}, new Color[] {new Color(204, 204, 204, 255),new Color(255, 255, 255, 255),new Color(255, 255, 255, 255),new Color(206, 206, 206, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0488970279693604f, 0.0f, 0.0f, 1.0f, -1.2679309844970703f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.187535, 21.04477);
((GeneralPath)shape).curveTo(7.6485543, 28.612146, 13.879571, 38.212296, 24.038687, 38.212296);
((GeneralPath)shape).curveTo(34.286186, 38.212296, 40.544216, 29.781872, 38.758728, 21.10727);
((GeneralPath)shape).lineTo(9.187535, 21.04477);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 0.18181819f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
paint = new LinearGradientPaint(new Point2D.Double(14.0, 21.0625), new Point2D.Double(14.0, 34.30552673339844), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.4045230150222778f, 10.5f, -7.9663310050964355f));
stroke = new BasicStroke(0.9999999f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(24.5, 21.528658);
((GeneralPath)shape).lineTo(24.5, 38.382935);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 0.18181819f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new LinearGradientPaint(new Point2D.Double(14.0, 21.0625), new Point2D.Double(13.5, 33.42667007446289), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.1718950271606445f, 2.5f, -3.1411659717559814f));
stroke = new BasicStroke(1.0000002f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.5, 21.468636);
((GeneralPath)shape).lineTo(16.5, 35.53138);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 0.18181819f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new LinearGradientPaint(new Point2D.Double(14.0, 21.0625), new Point2D.Double(14.5, 33.431156158447266), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.1598149538040161f, 18.5f, -2.815047025680542f));
stroke = new BasicStroke(1.0000005f,2,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(32.5, 21.541107);
((GeneralPath)shape).lineTo(32.5, 35.458908);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
paint = new Color(143, 89, 2, 255);
stroke = new BasicStroke(0.99999994f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.44094, 20.615864);
((GeneralPath)shape).curveTo(7.6602855, 29.43779, 14.599952, 38.703674, 24.250002, 38.703674);
((GeneralPath)shape).curveTo(34.253548, 38.703674, 40.902218, 29.12529, 38.621563, 20.553364);
((GeneralPath)shape).lineTo(9.44094, 20.615864);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_9);
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
        return 4.96840763092041;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.647554874420166;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 39.491756439208984;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 41.819862365722656;
	}

    /** The current width of this resizable icon. */
    private int width;

    /** The current height of this resizable icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image. It is recommended to use the 
     * {@link #of(int, int)} method to obtain a pre-configured instance.
     */
	public face_grin() {
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
       face_grin base = new face_grin();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       face_grin base = new face_grin();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

