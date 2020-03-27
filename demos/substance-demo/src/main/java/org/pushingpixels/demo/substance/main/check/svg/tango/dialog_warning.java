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
public class dialog_warning implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.5666669607162476f, 0.0f, 0.0f, 1.5666669607162476f, -8.925565719604492f, -23.94763946533203f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.014440740458667278f, 0.0f, 0.0f, 0.013319729827344418f, 33.388710021972656f, 40.40336990356445f));
// _0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0
shape = new Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375);
paint = new LinearGradientPaint(new Point2D.Double(302.8571472167969, 366.64788818359375), new Point2D.Double(302.8571472167969, 609.5050659179688), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(0, 0, 0, 0),new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-219.61876, -150.68037);
generalPath.curveTo(-219.61876, -150.68037, -219.61876, 327.65042, -219.61876, 327.65042);
generalPath.curveTo(-76.74459, 328.55087, 125.78146, 220.48074, 125.78138, 88.45424);
generalPath.curveTo(125.78138, -43.572304, -33.655437, -150.68036, -219.61876, -150.68037);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-1559.2523, -150.68037);
generalPath.curveTo(-1559.2523, -150.68037, -1559.2523, 327.65042, -1559.2523, 327.65042);
generalPath.curveTo(-1702.1265, 328.55087, -1904.6525, 220.48074, -1904.6525, 88.45424);
generalPath.curveTo(-1904.6525, -43.572304, -1745.2157, -150.68036, -1559.2523, -150.68037);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.004537845961749554f, 1.0f, -0.13890700042247772f, -1.3947179923227081E-15f));
// _0_0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, -0.00872668344527483f, 1.0f, 0.32807400822639465f, 1.276595950126648f));
// _0_0_0_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.28278, 38.644745);
generalPath.lineTo(22.407791, 18.394766);
generalPath.curveTo(22.095291, 17.832266, 21.532791, 17.519768, 20.907793, 17.519768);
generalPath.curveTo(20.282793, 17.519768, 19.720295, 17.894766, 19.407795, 18.457266);
generalPath.lineTo(8.7828045, 38.707245);
generalPath.curveTo(8.5328045, 39.207245, 8.5328045, 39.894745, 8.8453045, 40.394745);
generalPath.curveTo(9.157804, 40.894745, 9.657804, 41.14474, 10.282804, 41.14474);
generalPath.lineTo(31.782782, 41.14474);
generalPath.curveTo(32.40778, 41.14474, 32.97028, 40.832245, 33.22028, 40.332245);
generalPath.curveTo(33.53278, 39.832245, 33.53278, 39.207245, 33.28278, 38.644745);
generalPath.closePath();
shape = generalPath;
paint = new Color(204, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(159, 0, 0, 255);
stroke = new BasicStroke(0.6382978f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.28278, 38.644745);
generalPath.lineTo(22.407791, 18.394766);
generalPath.curveTo(22.095291, 17.832266, 21.532791, 17.519768, 20.907793, 17.519768);
generalPath.curveTo(20.282793, 17.519768, 19.720295, 17.894766, 19.407795, 18.457266);
generalPath.lineTo(8.7828045, 38.707245);
generalPath.curveTo(8.5328045, 39.207245, 8.5328045, 39.894745, 8.8453045, 40.394745);
generalPath.curveTo(9.157804, 40.894745, 9.657804, 41.14474, 10.282804, 41.14474);
generalPath.lineTo(31.782782, 41.14474);
generalPath.curveTo(32.40778, 41.14474, 32.97028, 40.832245, 33.22028, 40.332245);
generalPath.curveTo(33.53278, 39.832245, 33.53278, 39.207245, 33.28278, 38.644745);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.625f, 0.0f, -0.005534933879971504f, 0.634253978729248f, 6.164052963256836f, 15.760549545288086f));
// _0_0_0_1_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.5, 37.6);
generalPath.curveTo(9.2, 38.1, 9.5, 38.5, 10.0, 38.5);
generalPath.lineTo(38.2, 38.5);
generalPath.curveTo(38.7, 38.5, 39.0, 38.1, 38.7, 37.6);
generalPath.lineTo(24.4, 11.0);
generalPath.curveTo(24.1, 10.5, 23.7, 10.5, 23.5, 11.0);
generalPath.lineTo(9.5, 37.6);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(4.191400051116943, 11.113300323486328), new Point2D.Double(47.319698333740234, 56.05229949951172), new float[] {0.0f,0.3982f,1.0f}, new Color[] {new Color(212, 212, 212, 255),new Color(226, 226, 226, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, -0.00872668344527483f, 1.0f, 0.3182770013809204f, 1.276595950126648f));
// _0_0_0_1_2
paint = new LinearGradientPaint(new Point2D.Double(8.546934127807617, 30.281681060791016), new Point2D.Double(30.850879669189453, 48.301883697509766), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 87)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8990089893341064f, 0.0f, 0.0f, 0.9342349767684937f, 1.875108003616333f, 1.1936450004577637f));
stroke = new BasicStroke(0.6382979f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.323105, 38.183907);
generalPath.lineTo(22.15027, 19.265665);
generalPath.curveTo(21.71698, 18.45069, 21.561699, 18.189213, 20.908405, 18.189213);
generalPath.curveTo(20.346525, 18.189213, 20.054127, 18.57002, 19.651304, 19.33929);
generalPath.lineTo(9.748929, 38.242294);
generalPath.curveTo(9.173765, 39.30359, 9.1128235, 39.580227, 9.3937645, 40.047344);
generalPath.curveTo(9.674704, 40.51446, 10.032797, 40.48902, 11.356441, 40.51949);
generalPath.lineTo(30.974592, 40.51949);
generalPath.curveTo(32.206825, 40.534725, 32.48399, 40.440838, 32.70874, 39.97372);
generalPath.curveTo(32.98968, 39.506603, 32.867798, 39.136, 32.323105, 38.183907);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.5550879836082458f, 0.0f, 0.0f, 0.5550519824028015f, 7.749711036682129f, 17.801959991455078f));
// _0_0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.9, 36.5);
generalPath.curveTo(22.6, 36.5, 21.6, 35.5, 21.6, 34.2);
generalPath.curveTo(21.6, 32.8, 22.5, 31.9, 23.9, 31.9);
generalPath.curveTo(25.3, 31.9, 26.1, 32.8, 26.2, 34.2);
generalPath.curveTo(26.2, 35.5, 25.3, 36.5, 23.9, 36.5);
generalPath.lineTo(23.9, 36.5);
generalPath.closePath();
generalPath.moveTo(22.5, 30.6);
generalPath.lineTo(21.9, 19.1);
generalPath.lineTo(25.9, 19.1);
generalPath.lineTo(25.3, 30.6);
generalPath.lineTo(22.4, 30.6);
generalPath.lineTo(22.5, 30.6);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
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
        return 0.2928876578807831;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 5.000002384185791;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 45.93619155883789;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 41.20704650878906;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private dialog_warning() {
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
       dialog_warning base = new dialog_warning();
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
       dialog_warning base = new dialog_warning();
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
        return dialog_warning::new;
    }
}

