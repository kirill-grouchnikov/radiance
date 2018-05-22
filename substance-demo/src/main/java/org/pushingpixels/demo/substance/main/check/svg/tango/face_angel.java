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
public class face_angel implements Icon, IsResizable, IsHiDpiAware, UIResource {
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
paint = new RadialGradientPaint(new Point2D.Double(29.288070678710938, 15.72098445892334), 8.90208f, new Point2D.Double(29.158466339111328, 15.755711555480957), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(246, 231, 106, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
paint = new Color(228, 154, 23, 255);
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.1758090257644653f, 0.0f, 0.0f, 2.5822269916534424f, -5.280448913574219f, -20.477800369262695f));
// _0_0_2
paint = new RadialGradientPaint(new Point2D.Double(25.127777099609375, 10.451922416687012), 15.076666f, new Point2D.Double(25.127777099609375, 10.451922416687012), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 252, 154, 160),new Color(254, 252, 154, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.16666699945926666f, 7.650132117244495E-16f, 8.709935188293457f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(40.204445, 10.451922);
((GeneralPath)shape).curveTo(40.228607, 11.352328, 37.360306, 12.186067, 32.685642, 12.637436);
((GeneralPath)shape).curveTo(28.01098, 13.088805, 22.244576, 13.088805, 17.569914, 12.637436);
((GeneralPath)shape).curveTo(12.895251, 12.186067, 10.026951, 11.352328, 10.051111, 10.451922);
((GeneralPath)shape).curveTo(10.026951, 9.551517, 12.895251, 8.717778, 17.569914, 8.266409);
((GeneralPath)shape).curveTo(22.244576, 7.8150396, 28.01098, 7.8150396, 32.685642, 8.266409);
((GeneralPath)shape).curveTo(37.360306, 8.717778, 40.228607, 9.551517, 40.204445, 10.451922);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.4f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.979781985282898f, 0.0f, 0.0f, 1.979781985282898f, -37.33127975463867f, -14.527460098266602f));
// _0_0_3
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
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 0.35999998f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(37.284637, 24.719967);
((GeneralPath)shape).curveTo(34.26817, 29.94464, 30.741135, 33.710007, 24.462492, 33.710007);
((GeneralPath)shape).curveTo(18.362474, 33.710007, 13.896955, 29.370308, 11.110016, 24.543188);
((GeneralPath)shape).curveTo(13.659429, 27.59911, 17.392948, 31.1095, 24.197327, 31.1095);
((GeneralPath)shape).curveTo(32.32753, 31.1095, 33.749104, 28.202646, 37.284637, 24.719967);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new RadialGradientPaint(new Point2D.Double(25.05270004272461, 39.59280014038086), 15.7572f, new Point2D.Double(25.05270004272461, 39.59280014038086), new float[] {0.0f,1.0f}, new Color[] {new Color(119, 119, 119, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.25f, 0.0f, 0.0f, 1.25f, -6.479445934295654f, -13.372110366821289f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(37.284637, 24.012861);
((GeneralPath)shape).curveTo(34.26817, 29.237535, 30.741135, 33.0029, 24.462492, 33.0029);
((GeneralPath)shape).curveTo(18.362474, 33.0029, 13.896955, 28.663204, 11.110016, 23.836084);
((GeneralPath)shape).curveTo(13.659429, 26.892006, 17.392948, 30.402397, 24.197327, 30.402397);
((GeneralPath)shape).curveTo(32.32753, 30.402397, 33.749104, 27.495543, 37.284637, 24.012861);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0125030279159546f, 0.0f, 0.0f, 1.645326018333435f, -1.1769349575042725f, -10.685379981994629f));
// _0_0_6
paint = new Color(195, 180, 0, 255);
stroke = new BasicStroke(2.3243268f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(40.204445, 10.451922);
((GeneralPath)shape).curveTo(40.228607, 11.352328, 37.360306, 12.186067, 32.685642, 12.637436);
((GeneralPath)shape).curveTo(28.01098, 13.088805, 22.244576, 13.088805, 17.569914, 12.637436);
((GeneralPath)shape).curveTo(12.895251, 12.186067, 10.026951, 11.352328, 10.051111, 10.451922);
((GeneralPath)shape).curveTo(10.026951, 9.551517, 12.895251, 8.717778, 17.569914, 8.266409);
((GeneralPath)shape).curveTo(22.244576, 7.8150396, 28.01098, 7.8150396, 32.685642, 8.266409);
((GeneralPath)shape).curveTo(37.360306, 8.717778, 40.228607, 9.551517, 40.204445, 10.451922);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.014855980873108f, 0.0f, 0.0f, 1.611564040184021f, -1.206928014755249f, -10.33866024017334f));
// _0_0_7
paint = new Color(255, 255, 6, 255);
stroke = new BasicStroke(0.78194094f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(40.204445, 10.451922);
((GeneralPath)shape).curveTo(40.228607, 11.352328, 37.360306, 12.186067, 32.685642, 12.637436);
((GeneralPath)shape).curveTo(28.01098, 13.088805, 22.244576, 13.088805, 17.569914, 12.637436);
((GeneralPath)shape).curveTo(12.895251, 12.186067, 10.026951, 11.352328, 10.051111, 10.451922);
((GeneralPath)shape).curveTo(10.026951, 9.551517, 12.895251, 8.717778, 17.569914, 8.266409);
((GeneralPath)shape).curveTo(22.244576, 7.8150396, 28.01098, 7.8150396, 32.685642, 8.266409);
((GeneralPath)shape).curveTo(37.360306, 8.717778, 40.228607, 9.551517, 40.204445, 10.451922);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.203062, 17.57856);
((GeneralPath)shape).curveTo(26.982405, 21.949411, 31.532944, 22.064182, 33.1343, 17.728636);
((GeneralPath)shape).curveTo(30.310009, 19.967516, 27.713179, 19.322697, 25.203062, 17.57856);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.134298, 17.57856);
((GeneralPath)shape).curveTo(21.354958, 21.949411, 16.804419, 22.064182, 15.203063, 17.728636);
((GeneralPath)shape).curveTo(18.027353, 19.967516, 20.624184, 19.322697, 23.134298, 17.57856);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
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
        return 0.0;
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
		return 45.46742248535156;
	}

    /** The current width of this resizable icon. */
    private int width;

    /** The current height of this resizable icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image. It is recommended to use the 
     * {@link #of(int, int)} method to obtain a pre-configured instance.
     */
	public face_angel() {
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
       face_angel base = new face_angel();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       face_angel base = new face_angel();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

