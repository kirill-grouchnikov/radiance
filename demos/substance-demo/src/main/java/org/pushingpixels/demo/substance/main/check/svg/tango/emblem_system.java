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
public class emblem_system implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.40909088f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.8838850259780884f, 2.4748740196228027f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.078056f, 39.161163f);
generalPath.curveTo(45.1095f, 41.378223f, 41.37642f, 43.431126f, 35.29237f, 44.542526f);
generalPath.curveTo(29.208319f, 45.65393f, 21.70337f, 45.65393f, 15.619318f, 44.542526f);
generalPath.curveTo(9.535267f, 43.431126f, 5.802187f, 41.378223f, 5.8336315f, 39.161163f);
generalPath.curveTo(5.802187f, 36.944103f, 9.535267f, 34.8912f, 15.619318f, 33.7798f);
generalPath.curveTo(21.70337f, 32.668396f, 29.208319f, 32.668396f, 35.29237f, 33.7798f);
generalPath.curveTo(41.37642f, 34.8912f, 45.1095f, 36.944103f, 45.078056f, 39.161163f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(25.45584487915039, 39.161163330078125), 19.622213f, new Point2D.Double(25.45584487915039, 39.161163330078125), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.31531500816345215f, 0.0f, 26.81304931640625f));
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
generalPath.moveTo(23.25f, 0.46875f);
generalPath.curveTo(22.784561f, 0.5005963f, 22.332167f, 0.5726847f, 21.875f, 0.625f);
generalPath.lineTo(21.84375f, 0.625f);
generalPath.lineTo(20.75f, 6.59375f);
generalPath.curveTo(18.967276f, 6.99974f, 17.29009f, 7.6887417f, 15.78125f, 8.625f);
generalPath.lineTo(10.875f, 5.09375f);
generalPath.curveTo(9.548712f, 6.1234407f, 8.341802f, 7.3243456f, 7.28125f, 8.625f);
generalPath.lineTo(10.6875f, 13.59375f);
generalPath.curveTo(9.653267f, 15.174265f, 8.875532f, 16.978973f, 8.4375f, 18.875f);
generalPath.curveTo(8.437425f, 18.883963f, 8.437439f, 18.904688f, 8.4375f, 18.90625f);
generalPath.lineTo(2.5f, 19.84375f);
generalPath.curveTo(2.3914466f, 20.730383f, 2.34375f, 21.646688f, 2.34375f, 22.5625f);
generalPath.curveTo(2.34375f, 23.3118f, 2.3644395f, 24.051088f, 2.4375f, 24.78125f);
generalPath.lineTo(8.375f, 25.84375f);
generalPath.curveTo(8.797279f, 27.905642f, 9.599459f, 29.831263f, 10.71875f, 31.53125f);
generalPath.lineTo(7.1875f, 36.375f);
generalPath.curveTo(8.198826f, 37.63052f, 9.366392f, 38.773617f, 10.625f, 39.78125f);
generalPath.lineTo(15.625f, 36.34375f);
generalPath.curveTo(17.372433f, 37.458466f, 19.323084f, 38.240124f, 21.4375f, 38.625f);
generalPath.lineTo(22.375f, 44.53125f);
generalPath.curveTo(23.041183f, 44.59189f, 23.724348f, 44.59375f, 24.40625f, 44.59375f);
generalPath.curveTo(25.368935f, 44.59375f, 26.288486f, 44.557266f, 27.21875f, 44.4375f);
generalPath.lineTo(28.34375f, 38.40625f);
generalPath.curveTo(30.35131f, 37.90665f, 32.23722f, 37.03996f, 33.875f, 35.875f);
generalPath.lineTo(38.6875f, 39.375f);
generalPath.curveTo(39.935528f, 38.3132f, 41.07678f, 37.092743f, 42.0625f, 35.78125f);
generalPath.lineTo(38.5625f, 30.71875f);
generalPath.curveTo(39.510353f, 29.08176f, 40.16713f, 27.275608f, 40.5f, 25.34375f);
generalPath.lineTo(46.40625f, 24.40625f);
generalPath.curveTo(46.458042f, 23.789904f, 46.46875f, 23.192163f, 46.46875f, 22.5625f);
generalPath.curveTo(46.46875f, 21.468287f, 46.341568f, 20.395416f, 46.1875f, 19.34375f);
generalPath.lineTo(40.1875f, 18.25f);
generalPath.curveTo(39.717304f, 16.513777f, 38.945824f, 14.893898f, 37.96875f, 13.4375f);
generalPath.lineTo(41.5f, 8.59375f);
generalPath.curveTo(40.405426f, 7.255143f, 39.156822f, 6.018569f, 37.78125f, 4.96875f);
generalPath.lineTo(32.6875f, 8.46875f);
generalPath.curveTo(31.223503f, 7.602913f, 29.648037f, 6.938568f, 27.9375f, 6.5625f);
generalPath.lineTo(27.0f, 0.625f);
generalPath.curveTo(26.146702f, 0.5246246f, 25.286379f, 0.46875f, 24.40625f, 0.46875f);
generalPath.curveTo(24.168379f, 0.46875f, 23.923567f, 0.4612654f, 23.6875f, 0.46875f);
generalPath.curveTo(23.572416f, 0.47239882f, 23.458534f, 0.4620551f, 23.34375f, 0.46875f);
generalPath.curveTo(23.312662f, 0.4705632f, 23.281029f, 0.4666269f, 23.25f, 0.46875f);
generalPath.closePath();
generalPath.moveTo(24.0625f, 15.65625f);
generalPath.curveTo(24.176666f, 15.650457f, 24.290651f, 15.65625f, 24.40625f, 15.65625f);
generalPath.curveTo(28.105377f, 15.65625f, 31.125f, 18.675875f, 31.125f, 22.375f);
generalPath.curveTo(31.125002f, 26.074125f, 28.105375f, 29.0625f, 24.40625f, 29.0625f);
generalPath.curveTo(20.707125f, 29.062502f, 17.71875f, 26.074125f, 17.71875f, 22.375f);
generalPath.curveTo(17.718752f, 18.791473f, 20.52335f, 15.835842f, 24.0625f, 15.65625f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(14.462891578674316, 12.284523963928223), new Point2D.Double(34.53434753417969, 39.684913635253906), new float[] {0.0f,0.25f,0.5f,0.75f,1.0f}, new Color[] {new Color(201, 201, 201, 255),new Color(248, 248, 248, 255),new Color(226, 226, 226, 255),new Color(176, 176, 176, 255),new Color(201, 201, 201, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2419350147247314f, 0.0f, 0.0f, 1.2419350147247314f, -5.027507781982422f, -7.208988189697266f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(128, 128, 128, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.25f, 0.46875f);
generalPath.curveTo(22.784561f, 0.5005963f, 22.332167f, 0.5726847f, 21.875f, 0.625f);
generalPath.lineTo(21.84375f, 0.625f);
generalPath.lineTo(20.75f, 6.59375f);
generalPath.curveTo(18.967276f, 6.99974f, 17.29009f, 7.6887417f, 15.78125f, 8.625f);
generalPath.lineTo(10.875f, 5.09375f);
generalPath.curveTo(9.548712f, 6.1234407f, 8.341802f, 7.3243456f, 7.28125f, 8.625f);
generalPath.lineTo(10.6875f, 13.59375f);
generalPath.curveTo(9.653267f, 15.174265f, 8.875532f, 16.978973f, 8.4375f, 18.875f);
generalPath.curveTo(8.437425f, 18.883963f, 8.437439f, 18.904688f, 8.4375f, 18.90625f);
generalPath.lineTo(2.5f, 19.84375f);
generalPath.curveTo(2.3914466f, 20.730383f, 2.34375f, 21.646688f, 2.34375f, 22.5625f);
generalPath.curveTo(2.34375f, 23.3118f, 2.3644395f, 24.051088f, 2.4375f, 24.78125f);
generalPath.lineTo(8.375f, 25.84375f);
generalPath.curveTo(8.797279f, 27.905642f, 9.599459f, 29.831263f, 10.71875f, 31.53125f);
generalPath.lineTo(7.1875f, 36.375f);
generalPath.curveTo(8.198826f, 37.63052f, 9.366392f, 38.773617f, 10.625f, 39.78125f);
generalPath.lineTo(15.625f, 36.34375f);
generalPath.curveTo(17.372433f, 37.458466f, 19.323084f, 38.240124f, 21.4375f, 38.625f);
generalPath.lineTo(22.375f, 44.53125f);
generalPath.curveTo(23.041183f, 44.59189f, 23.724348f, 44.59375f, 24.40625f, 44.59375f);
generalPath.curveTo(25.368935f, 44.59375f, 26.288486f, 44.557266f, 27.21875f, 44.4375f);
generalPath.lineTo(28.34375f, 38.40625f);
generalPath.curveTo(30.35131f, 37.90665f, 32.23722f, 37.03996f, 33.875f, 35.875f);
generalPath.lineTo(38.6875f, 39.375f);
generalPath.curveTo(39.935528f, 38.3132f, 41.07678f, 37.092743f, 42.0625f, 35.78125f);
generalPath.lineTo(38.5625f, 30.71875f);
generalPath.curveTo(39.510353f, 29.08176f, 40.16713f, 27.275608f, 40.5f, 25.34375f);
generalPath.lineTo(46.40625f, 24.40625f);
generalPath.curveTo(46.458042f, 23.789904f, 46.46875f, 23.192163f, 46.46875f, 22.5625f);
generalPath.curveTo(46.46875f, 21.468287f, 46.341568f, 20.395416f, 46.1875f, 19.34375f);
generalPath.lineTo(40.1875f, 18.25f);
generalPath.curveTo(39.717304f, 16.513777f, 38.945824f, 14.893898f, 37.96875f, 13.4375f);
generalPath.lineTo(41.5f, 8.59375f);
generalPath.curveTo(40.405426f, 7.255143f, 39.156822f, 6.018569f, 37.78125f, 4.96875f);
generalPath.lineTo(32.6875f, 8.46875f);
generalPath.curveTo(31.223503f, 7.602913f, 29.648037f, 6.938568f, 27.9375f, 6.5625f);
generalPath.lineTo(27.0f, 0.625f);
generalPath.curveTo(26.146702f, 0.5246246f, 25.286379f, 0.46875f, 24.40625f, 0.46875f);
generalPath.curveTo(24.168379f, 0.46875f, 23.923567f, 0.4612654f, 23.6875f, 0.46875f);
generalPath.curveTo(23.572416f, 0.47239882f, 23.458534f, 0.4620551f, 23.34375f, 0.46875f);
generalPath.curveTo(23.312662f, 0.4705632f, 23.281029f, 0.4666269f, 23.25f, 0.46875f);
generalPath.closePath();
generalPath.moveTo(24.0625f, 15.65625f);
generalPath.curveTo(24.176666f, 15.650457f, 24.290651f, 15.65625f, 24.40625f, 15.65625f);
generalPath.curveTo(28.105377f, 15.65625f, 31.125f, 18.675875f, 31.125f, 22.375f);
generalPath.curveTo(31.125002f, 26.074125f, 28.105375f, 29.0625f, 24.40625f, 29.0625f);
generalPath.curveTo(20.707125f, 29.062502f, 17.71875f, 26.074125f, 17.71875f, 22.375f);
generalPath.curveTo(17.718752f, 18.791473f, 20.52335f, 15.835842f, 24.0625f, 15.65625f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.64772725f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.6065179705619812f, 0.0f, 0.0f, 0.6065179705619812f, 10.1502103805542f, 7.936834812164307f));
// _0_0_2
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.6487557f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.239223f, 23.781593f);
generalPath.curveTo(36.25962f, 28.342402f, 33.83816f, 32.565517f, 29.89175f, 34.85183f);
generalPath.curveTo(25.94534f, 37.13814f, 21.077263f, 37.13814f, 17.130852f, 34.85183f);
generalPath.curveTo(13.18444f, 32.565517f, 10.762982f, 28.342402f, 10.783379f, 23.781593f);
generalPath.curveTo(10.762982f, 19.220785f, 13.18444f, 14.997669f, 17.130852f, 12.711357f);
generalPath.curveTo(21.077263f, 10.425044f, 25.94534f, 10.425044f, 29.89175f, 12.711357f);
generalPath.curveTo(33.83816f, 14.997669f, 36.25962f, 19.220785f, 36.239223f, 23.781593f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.34659088f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.9999997f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.557789f, 1.6501132f);
generalPath.lineTo(21.6796f, 7.4291234f);
generalPath.curveTo(20.0086f, 7.809669f, 16.934874f, 8.973535f, 15.520595f, 9.851116f);
generalPath.lineTo(10.848562f, 6.3639293f);
generalPath.curveTo(9.605394f, 7.3290873f, 9.520139f, 7.3945394f, 8.526054f, 8.613681f);
generalPath.lineTo(11.904107f, 13.623634f);
generalPath.curveTo(10.934692f, 15.105095f, 9.770303f, 17.745129f, 9.352234f, 19.631721f);
generalPath.curveTo(9.352234f, 19.631721f, 3.4328249f, 20.629562f, 3.4328249f, 20.629562f);
generalPath.curveTo(3.331075f, 21.460629f, 3.379975f, 23.23936f, 3.448457f, 23.923761f);
generalPath.lineTo(9.1027f, 24.942348f);
generalPath.curveTo(9.498514f, 26.875017f, 10.979731f, 29.985937f, 12.028874f, 31.579384f);
generalPath.lineTo(8.453299f, 36.30343f);
generalPath.curveTo(9.401242f, 37.48026f, 9.590962f, 37.587948f, 10.770691f, 38.532433f);
generalPath.lineTo(15.551859f, 35.029613f);
generalPath.curveTo(17.189777f, 36.074467f, 20.440891f, 37.345497f, 22.422794f, 37.706253f);
generalPath.lineTo(23.207481f, 43.412506f);
generalPath.curveTo(23.831913f, 43.469345f, 25.556961f, 43.628788f, 26.428925f, 43.516525f);
generalPath.lineTo(27.307112f, 37.576374f);
generalPath.curveTo(29.188854f, 37.108086f, 32.440273f, 35.773415f, 33.97541f, 34.68146f);
generalPath.lineTo(38.751465f, 38.13227f);
generalPath.curveTo(39.921276f, 37.13702f, 39.93176f, 36.987057f, 40.8557f, 35.757755f);
generalPath.lineTo(37.316505f, 30.727055f);
generalPath.curveTo(38.204952f, 29.192656f, 39.353733f, 26.191832f, 39.66574f, 24.381044f);
generalPath.lineTo(45.460384f, 23.419582f);
generalPath.curveTo(45.50893f, 22.841864f, 45.511295f, 21.230793f, 45.366882f, 20.245037f);
generalPath.lineTo(39.463104f, 19.226448f);
generalPath.curveTo(39.022377f, 17.599037f, 37.509895f, 14.666467f, 36.594055f, 13.301345f);
generalPath.lineTo(40.34641f, 8.577302f);
generalPath.curveTo(39.320435f, 7.3225875f, 38.938965f, 7.150431f, 37.6496f, 6.1664066f);
generalPath.lineTo(32.70729f, 9.705604f);
generalPath.curveTo(31.335043f, 8.894031f, 28.598675f, 7.656856f, 26.99534f, 7.304357f);
generalPath.lineTo(26.122267f, 1.6501132f);
generalPath.curveTo(25.322445f, 1.5560285f, 23.014872f, 1.5978075f, 22.557789f, 1.6501132f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
        return 1.84375;
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
		return 45.125;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 48.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private emblem_system() {
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
       emblem_system base = new emblem_system();
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
       emblem_system base = new emblem_system();
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
        return emblem_system::new;
    }
}

