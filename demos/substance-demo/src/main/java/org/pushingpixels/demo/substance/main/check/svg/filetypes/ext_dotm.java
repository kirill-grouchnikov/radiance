package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_dotm implements ResizableIcon {
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
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.056f,0.16f,0.274f,0.398f,0.539f,0.711f,1.0f}, new Color[] {new Color(0, 45, 68, 255),new Color(1, 56, 82, 255),new Color(10, 77, 107, 255),new Color(15, 94, 130, 255),new Color(15, 109, 150, 255),new Color(13, 119, 164, 255),new Color(10, 126, 174, 255),new Color(8, 129, 178, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(1, 65, 94, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.3, 76.7);
generalPath.lineTo(12.6, 76.7);
generalPath.curveTo(13.8, 76.7, 14.700001, 76.799995, 15.400001, 77.0);
generalPath.curveTo(16.2, 77.2, 17.0, 77.7, 17.6, 78.3);
generalPath.curveTo(18.2, 78.9, 18.7, 79.700005, 19.0, 80.600006);
generalPath.curveTo(19.3, 81.50001, 19.5, 82.600006, 19.5, 84.00001);
generalPath.curveTo(19.5, 85.200005, 19.4, 86.200005, 19.1, 87.00001);
generalPath.curveTo(18.7, 88.00001, 18.2, 88.90001, 17.6, 89.50001);
generalPath.curveTo(17.1, 90.00001, 16.4, 90.40001, 15.5, 90.600006);
generalPath.curveTo(14.9, 90.8, 14.0, 90.90001, 12.9, 90.90001);
generalPath.lineTo(7.3, 90.90001);
generalPath.lineTo(7.3, 76.7);
generalPath.closePath();
generalPath.moveTo(10.200001, 79.2);
generalPath.lineTo(10.200001, 88.7);
generalPath.lineTo(12.400001, 88.7);
generalPath.curveTo(13.200001, 88.7, 13.8, 88.7, 14.200001, 88.6);
generalPath.curveTo(14.700001, 88.5, 15.1, 88.299995, 15.400001, 88.0);
generalPath.curveTo(15.700001, 87.7, 16.0, 87.3, 16.2, 86.6);
generalPath.curveTo(16.400002, 86.0, 16.5, 85.1, 16.5, 84.0);
generalPath.curveTo(16.5, 82.9, 16.4, 82.0, 16.2, 81.5);
generalPath.curveTo(16.0, 80.9, 15.700001, 80.4, 15.400001, 80.1);
generalPath.curveTo(15.000001, 79.799995, 14.6, 79.5, 14.000001, 79.4);
generalPath.curveTo(13.600001, 79.3, 12.800001, 79.3, 11.6, 79.3);
generalPath.lineTo(10.200001, 79.3);
generalPath.closePath();
generalPath.moveTo(21.3, 84.0);
generalPath.curveTo(21.3, 82.5, 21.5, 81.3, 22.0, 80.3);
generalPath.curveTo(22.3, 79.600006, 22.8, 78.9, 23.3, 78.3);
generalPath.curveTo(23.8, 77.700005, 24.5, 77.3, 25.199999, 77.0);
generalPath.curveTo(26.099998, 76.6, 27.099998, 76.4, 28.3, 76.4);
generalPath.curveTo(30.4, 76.4, 32.1, 77.1, 33.399998, 78.4);
generalPath.curveTo(34.699997, 79.700005, 35.3, 81.5, 35.3, 83.9);
generalPath.curveTo(35.3, 86.200005, 34.7, 88.0, 33.399998, 89.3);
generalPath.curveTo(32.099995, 90.600006, 30.399998, 91.3, 28.299997, 91.3);
generalPath.curveTo(26.099997, 91.3, 24.399998, 90.700005, 23.199997, 89.4);
generalPath.curveTo(21.899998, 88.1, 21.299997, 86.3, 21.299997, 84.0);
generalPath.closePath();
generalPath.moveTo(24.3, 83.9);
generalPath.curveTo(24.3, 85.5, 24.699999, 86.700005, 25.4, 87.6);
generalPath.curveTo(26.1, 88.49999, 27.1, 88.9, 28.3, 88.9);
generalPath.curveTo(29.499998, 88.9, 30.4, 88.5, 31.199999, 87.700005);
generalPath.curveTo(31.9, 86.9, 32.3, 85.600006, 32.3, 84.00001);
generalPath.curveTo(32.3, 82.40001, 31.9, 81.100006, 31.199999, 80.30001);
generalPath.curveTo(30.499998, 79.50001, 29.499998, 79.10001, 28.3, 79.10001);
generalPath.curveTo(27.1, 79.10001, 26.099998, 79.500015, 25.4, 80.30001);
generalPath.curveTo(24.699999, 81.00001, 24.3, 82.20001, 24.3, 83.90001);
generalPath.closePath();
generalPath.moveTo(40.9, 91.1);
generalPath.lineTo(40.9, 79.2);
generalPath.lineTo(36.600002, 79.2);
generalPath.lineTo(36.600002, 76.799995);
generalPath.lineTo(48.100002, 76.799995);
generalPath.lineTo(48.100002, 79.2);
generalPath.lineTo(43.800003, 79.2);
generalPath.lineTo(43.800003, 91.1);
generalPath.lineTo(40.9, 91.1);
generalPath.closePath();
generalPath.moveTo(49.9, 91.1);
generalPath.lineTo(49.9, 76.7);
generalPath.lineTo(54.300003, 76.7);
generalPath.lineTo(56.9, 86.5);
generalPath.lineTo(59.5, 76.7);
generalPath.lineTo(63.9, 76.7);
generalPath.lineTo(63.9, 91.0);
generalPath.lineTo(61.2, 91.0);
generalPath.lineTo(61.2, 79.8);
generalPath.lineTo(58.3, 91.100006);
generalPath.lineTo(55.5, 91.100006);
generalPath.lineTo(52.6, 79.8);
generalPath.lineTo(52.6, 91.100006);
generalPath.lineTo(49.899998, 91.100006);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(64.4, 25.7);
generalPath.curveTo(63.9, 25.7, 63.4, 25.900002, 63.0, 26.0);
generalPath.curveTo(62.5, 26.2, 62.0, 26.4, 61.6, 26.6);
generalPath.curveTo(60.899998, 27.0, 60.399998, 27.4, 60.1, 27.9);
generalPath.curveTo(59.8, 28.4, 59.5, 29.0, 59.3, 29.6);
generalPath.curveTo(58.399998, 32.0, 57.1, 35.6, 55.3, 40.9);
generalPath.curveTo(53.5, 46.0, 51.7, 51.4, 49.7, 56.9);
generalPath.lineTo(45.0, 56.9);
generalPath.lineTo(36.3, 32.5);
generalPath.lineTo(28.4, 56.9);
generalPath.lineTo(23.7, 56.9);
generalPath.curveTo(21.1, 49.4, 19.1, 43.600002, 17.7, 39.7);
generalPath.curveTo(16.300001, 35.600002, 15.200001, 32.3, 14.200001, 29.5);
generalPath.curveTo(13.900001, 28.7, 13.6, 28.1, 13.200001, 27.7);
generalPath.curveTo(12.800001, 27.300001, 12.300001, 26.900002, 11.800001, 26.5);
generalPath.curveTo(11.400002, 26.2, 10.900002, 26.0, 10.500001, 25.9);
generalPath.curveTo(10.000001, 25.8, 9.500001, 25.699999, 8.900001, 25.6);
generalPath.lineTo(8.900001, 23.800001);
generalPath.lineTo(26.5, 23.800001);
generalPath.lineTo(26.5, 25.6);
generalPath.curveTo(25.5, 25.7, 24.7, 25.800001, 24.2, 26.0);
generalPath.curveTo(23.7, 26.1, 23.300001, 26.2, 23.0, 26.4);
generalPath.curveTo(22.7, 26.5, 22.5, 26.699999, 22.5, 26.8);
generalPath.curveTo(22.4, 26.9, 22.4, 27.099998, 22.4, 27.199999);
generalPath.curveTo(22.4, 27.4, 22.4, 27.599998, 22.5, 27.8);
generalPath.curveTo(22.6, 28.0, 22.6, 28.199999, 22.7, 28.5);
generalPath.curveTo(23.1, 29.7, 23.800001, 32.0, 25.0, 35.3);
generalPath.curveTo(26.1, 38.7, 27.5, 42.8, 29.2, 47.8);
generalPath.lineTo(36.7, 24.0);
generalPath.lineTo(41.600002, 24.0);
generalPath.lineTo(50.300003, 48.5);
generalPath.curveTo(51.600002, 44.5, 52.600002, 41.3, 53.4, 38.8);
generalPath.curveTo(54.2, 36.3, 54.800003, 34.1, 55.300003, 32.399998);
generalPath.curveTo(55.600002, 31.299997, 55.9, 30.399998, 56.000004, 29.599998);
generalPath.curveTo(56.200005, 28.899998, 56.300003, 28.199999, 56.300003, 27.699999);
generalPath.curveTo(56.300003, 27.4, 56.100002, 27.099998, 55.800003, 26.9);
generalPath.curveTo(55.500004, 26.699999, 55.100002, 26.5, 54.600002, 26.3);
generalPath.curveTo(54.2, 26.199999, 53.600002, 26.0, 52.9, 26.0);
generalPath.curveTo(52.2, 25.9, 51.600002, 25.8, 51.100002, 25.8);
generalPath.lineTo(51.100002, 23.8);
generalPath.lineTo(64.4, 23.8);
generalPath.lineTo(64.4, 25.699999);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.121000289916992, 50.46799850463867), new Point2D.Double(55.04100036621094, 87.38899993896484), new float[] {0.005f,0.116f,0.239f,0.369f,0.502f,0.639f,0.779f,0.918f,1.0f}, new Color[] {new Color(0, 97, 134, 255),new Color(0, 95, 131, 255),new Color(0, 90, 125, 255),new Color(0, 83, 115, 255),new Color(0, 72, 101, 255),new Color(0, 57, 83, 255),new Color(0, 37, 60, 255),new Color(0, 3, 29, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {new Color(223, 241, 250, 255),new Color(220, 238, 247, 255),new Color(211, 228, 239, 255),new Color(196, 214, 227, 255),new Color(177, 197, 213, 255),new Color(154, 176, 197, 255),new Color(129, 154, 179, 255),new Color(100, 130, 159, 255),new Color(66, 108, 140, 255),new Color(6, 87, 122, 255),new Color(1, 86, 121, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(1, 65, 94, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_dotm() {
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
       ext_dotm base = new ext_dotm();
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
       ext_dotm base = new ext_dotm();
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
        return ext_dotm::new;
    }
}

