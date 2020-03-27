package org.pushingpixels.demo.substance.main.check.svg.tango;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class go_top implements ResizableIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
transformsStack.push(g.getTransform());
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.2994652f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.2144659757614136f, 0.0f, 0.0f, 0.5954579710960388f, -6.694176197052002f, 16.66629981994629f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.48186, 36.421127);
generalPath.curveTo(40.50693, 39.429993, 37.530556, 42.216076, 32.67976, 43.724407);
generalPath.curveTo(27.828962, 45.23274, 21.845287, 45.23274, 16.99449, 43.724407);
generalPath.curveTo(12.143692, 42.216076, 9.167317, 39.429993, 9.192389, 36.421127);
generalPath.curveTo(9.167317, 33.412262, 12.143692, 30.626177, 16.99449, 29.117847);
generalPath.curveTo(21.845287, 27.609516, 27.828962, 27.609516, 32.67976, 29.117847);
generalPath.curveTo(37.530556, 30.626177, 40.50693, 33.412262, 40.48186, 36.421127);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.837125778198242, 36.42112731933594), 15.644737f, new Point2D.Double(24.837125778198242, 36.42112731933594), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5367230176925659f, 1.513667993775932E-15f, 16.87306022644043f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.5, 1.5);
generalPath.lineTo(6.5, 7.4962087);
generalPath.lineTo(21.625, 7.4962087);
generalPath.lineTo(6.53125, 25.5);
generalPath.lineTo(14.5, 25.5625);
generalPath.lineTo(14.5, 38.5);
generalPath.lineTo(32.46875, 38.5);
generalPath.lineTo(32.46875, 25.5625);
generalPath.lineTo(40.5, 25.5625);
generalPath.lineTo(25.125, 7.4962087);
generalPath.lineTo(40.498104, 7.4962087);
generalPath.lineTo(40.498104, 1.5);
generalPath.lineTo(6.5, 1.5);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(11.319205284118652, 22.454971313476562), 16.9562f, new Point2D.Double(11.319205284118652, 22.454971313476562), new float[] {0.0f,1.0f}, new Color[] {new Color(115, 210, 22, 255),new Color(78, 154, 6, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.871884976963574E-16f, -0.8430219888687134f, 1.0201679468154907f, 2.26522788707826E-16f, 0.606436014175415f, 42.58613967895508f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(58, 115, 4, 255);
stroke = new BasicStroke(1.0000004f,1,1,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.5, 1.5);
generalPath.lineTo(6.5, 7.4962087);
generalPath.lineTo(21.625, 7.4962087);
generalPath.lineTo(6.53125, 25.5);
generalPath.lineTo(14.5, 25.5625);
generalPath.lineTo(14.5, 38.5);
generalPath.lineTo(32.46875, 38.5);
generalPath.lineTo(32.46875, 25.5625);
generalPath.lineTo(40.5, 25.5625);
generalPath.lineTo(25.125, 7.4962087);
generalPath.lineTo(40.498104, 7.4962087);
generalPath.lineTo(40.498104, 1.5);
generalPath.lineTo(6.5, 1.5);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5080214f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.5855236, 25.03253);
generalPath.lineTo(14.995821, 25.03253);
generalPath.lineTo(15.062422, 31.59434);
generalPath.curveTo(20.718035, 20.593878, 23.98445, 26.108685, 32.894203, 18.087994);
generalPath.curveTo(32.894203, 18.087994, 25.110422, 7.9689126, 24.086803, 7.0621667);
generalPath.lineTo(22.681929, 7.018591);
generalPath.lineTo(7.5855236, 25.03253);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(33.261287689208984, 8.79853630065918), 17.171415f, new Point2D.Double(33.261287689208984, 8.79853630065918), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-3.7494270752236227E-16f, -2.04672908782959f, 1.557610034942627f, -2.853404124580298E-16f, 2.7670090198516846f, 66.93274688720703f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.4812834f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0000004f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.602735, 37.5);
generalPath.lineTo(31.502579, 37.5);
generalPath.lineTo(31.502579, 24.50705);
generalPath.lineTo(38.311577, 24.50705);
generalPath.lineTo(23.809519, 7.4800653);
generalPath.lineTo(22.919266, 7.5120316);
generalPath.lineTo(8.65468, 24.55047);
generalPath.lineTo(15.475049, 24.528374);
generalPath.lineTo(15.602735, 37.5);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.481f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0000002f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(7.498863220214844, 2.4954285621643066, 32.01188278198242, 4.009467124938965);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.52272725f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
shape = new Rectangle2D.Double(6.894291400909424, 1.8612821102142334, 33.2340202331543, 5.303300857543945);
paint = new RadialGradientPaint(new Point2D.Double(26.43802833557129, 7.663613319396973), 17.171415f, new Point2D.Double(26.43802833557129, 7.663613319396973), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-3.7494270752236227E-16f, -2.04672908782959f, 1.557610034942627f, -2.853404124580298E-16f, 2.7670090198516846f, 66.93274688720703f));
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
	    generalPath = null;
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
        return 4.439218997955322;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.9999998211860657;
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
		return 42.600494384765625;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private go_top() {
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
	public synchronized void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
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
       go_top base = new go_top();
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
       go_top base = new go_top();
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
        return go_top::new;
    }
}

