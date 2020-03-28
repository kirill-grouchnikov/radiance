package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_diz implements ResizableIcon {
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.108001708984375, 3.003000020980835), new Point2D.Double(36.108001708984375, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -952.3619995117188f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(56.2f, 979.2f);
generalPath.curveTo(53.2f, 979.2f, 54.0f, 982.2f, 53.4f, 983.60004f);
generalPath.curveTo(53.2f, 984.2f, 52.800003f, 985.00006f, 52.5f, 985.80005f);
generalPath.lineTo(52.7f, 985.30005f);
generalPath.curveTo(52.5f, 985.7001f, 52.4f, 985.9f, 51.8f, 986.2001f);
generalPath.lineTo(47.8f, 988.6001f);
generalPath.curveTo(45.6f, 984.8001f, 41.6f, 982.5001f, 37.1f, 982.4001f);
generalPath.curveTo(32.699997f, 982.4001f, 28.599998f, 984.8001f, 26.499998f, 988.6001f);
generalPath.lineTo(22.499998f, 986.2001f);
generalPath.curveTo(21.999998f, 985.9001f, 21.799997f, 985.7001f, 21.599998f, 985.30005f);
generalPath.lineTo(21.8f, 985.80005f);
generalPath.curveTo(21.5f, 985.00006f, 21.099998f, 984.2001f, 20.9f, 983.60004f);
generalPath.curveTo(20.4f, 982.2f, 21.199999f, 979.2f, 18.1f, 979.2f);
generalPath.curveTo(15.1f, 979.2f, 15.6f, 983.3f, 14.700001f, 984.9f);
generalPath.curveTo(14.1f, 985.9f, 12.300001f, 986.9f, 11.500001f, 988.2f);
generalPath.curveTo(11.400001f, 988.3f, 11.400001f, 988.4f, 11.400001f, 988.5f);
generalPath.curveTo(11.1f, 989.1f, 11.000001f, 989.9f, 11.500001f, 990.7f);
generalPath.curveTo(13.000001f, 993.3f, 15.200001f, 991.10004f, 16.6f, 990.9f);
generalPath.curveTo(17.2f, 990.80005f, 18.1f, 990.80005f, 19.0f, 990.60004f);
generalPath.lineTo(18.4f, 990.7f);
generalPath.curveTo(18.8f, 990.60004f, 19.1f, 990.7f, 19.6f, 991.0f);
generalPath.curveTo(19.6f, 991.0f, 21.9f, 992.2f, 24.8f, 993.9f);
generalPath.lineTo(24.8f, 994.60004f);
generalPath.curveTo(24.8f, 996.9f, 25.5f, 999.10004f, 26.699999f, 1001.10004f);
generalPath.curveTo(22.699999f, 1003.50006f, 19.3f, 1005.60004f, 19.3f, 1005.60004f);
generalPath.curveTo(18.8f, 1005.9f, 18.5f, 1006.00006f, 18.099998f, 1006.00006f);
generalPath.lineTo(18.599998f, 1006.00006f);
generalPath.lineTo(16.399998f, 1006.00006f);
generalPath.curveTo(15.0999975f, 1006.00006f, 13.199998f, 1004.30005f, 11.499998f, 1006.7001f);
generalPath.curveTo(9.799998f, 1009.00006f, 13.299998f, 1010.00006f, 13.999998f, 1011.2001f);
generalPath.curveTo(14.699998f, 1012.4001f, 13.799998f, 1015.9001f, 16.699999f, 1015.7001f);
generalPath.curveTo(19.599998f, 1015.4001f, 19.099998f, 1013.00006f, 19.699999f, 1011.80005f);
generalPath.curveTo(19.999998f, 1011.30005f, 20.4f, 1010.60004f, 20.8f, 1009.9f);
generalPath.lineTo(20.5f, 1010.4f);
generalPath.curveTo(20.7f, 1010.0f, 20.9f, 1009.9f, 21.4f, 1009.60004f);
generalPath.curveTo(21.4f, 1009.60004f, 24.699999f, 1007.80005f, 28.5f, 1005.7f);
generalPath.lineTo(28.5f, 1011.10004f);
generalPath.curveTo(29.5f, 1011.50006f, 30.5f, 1011.80005f, 31.6f, 1012.00006f);
generalPath.lineTo(31.6f, 1009.10004f);
generalPath.lineTo(33.1f, 1009.4f);
generalPath.lineTo(33.1f, 1012.30005f);
generalPath.curveTo(34.1f, 1012.50006f, 35.199997f, 1012.60004f, 36.199997f, 1012.60004f);
generalPath.lineTo(36.199997f, 1009.7f);
generalPath.lineTo(37.799995f, 1009.7f);
generalPath.lineTo(37.799995f, 1012.60004f);
generalPath.curveTo(38.799995f, 1012.60004f, 39.899994f, 1012.50006f, 40.899994f, 1012.30005f);
generalPath.lineTo(40.899994f, 1009.4f);
generalPath.curveTo(41.399994f, 1009.30005f, 41.999992f, 1009.2f, 42.399994f, 1009.10004f);
generalPath.lineTo(42.399994f, 1012.00006f);
generalPath.curveTo(43.499992f, 1011.80005f, 44.499992f, 1011.4001f, 45.499992f, 1011.10004f);
generalPath.lineTo(45.499992f, 1005.7f);
generalPath.curveTo(49.29999f, 1007.8f, 52.59999f, 1009.60004f, 52.59999f, 1009.60004f);
generalPath.curveTo(53.09999f, 1009.9f, 53.29999f, 1010.10004f, 53.499992f, 1010.4f);
generalPath.curveTo(53.79999f, 1011.0f, 54.09999f, 1011.5f, 54.29999f, 1011.80005f);
generalPath.curveTo(54.89999f, 1013.00006f, 54.499992f, 1015.4f, 57.29999f, 1015.7001f);
generalPath.curveTo(60.199993f, 1016.00006f, 59.29999f, 1012.50006f, 59.999992f, 1011.2001f);
generalPath.curveTo(60.699993f, 1010.00006f, 64.19999f, 1009.00006f, 62.499992f, 1006.7001f);
generalPath.curveTo(60.79999f, 1004.4001f, 58.999992f, 1006.00006f, 57.59999f, 1006.00006f);
generalPath.lineTo(55.39999f, 1006.00006f);
generalPath.lineTo(55.89999f, 1006.00006f);
generalPath.curveTo(55.49999f, 1006.00006f, 55.19999f, 1005.9001f, 54.69999f, 1005.60004f);
generalPath.curveTo(54.69999f, 1005.60004f, 51.19999f, 1003.50006f, 47.299988f, 1001.10004f);
generalPath.curveTo(48.49999f, 999.2f, 49.19999f, 996.9f, 49.19999f, 994.60004f);
generalPath.lineTo(49.19999f, 993.9f);
generalPath.curveTo(52.09999f, 992.30005f, 54.39999f, 991.0f, 54.39999f, 991.0f);
generalPath.curveTo(54.89999f, 990.7f, 55.19999f, 990.7f, 55.59999f, 990.7f);
generalPath.lineTo(54.999992f, 990.60004f);
generalPath.curveTo(55.899994f, 990.7f, 56.79999f, 990.80005f, 57.399994f, 990.9f);
generalPath.curveTo(58.799995f, 991.10004f, 60.999992f, 993.30005f, 62.499992f, 990.7f);
generalPath.curveTo(63.999992f, 988.10004f, 60.199993f, 986.5f, 59.29999f, 984.9f);
generalPath.curveTo(58.699993f, 983.9f, 58.699993f, 981.80005f, 57.999992f, 980.5f);
generalPath.curveTo(57.999992f, 980.4f, 57.899994f, 980.3f, 57.79999f, 980.2f);
generalPath.curveTo(57.79999f, 979.60004f, 57.199993f, 979.2f, 56.199993f, 979.2f);
generalPath.closePath();
generalPath.moveTo(32.7f, 993.4f);
generalPath.curveTo(33.0f, 993.4f, 33.2f, 993.4f, 33.5f, 993.5f);
generalPath.curveTo(35.2f, 994.0f, 35.6f, 995.5f, 35.2f, 997.2f);
generalPath.curveTo(34.8f, 998.9f, 33.0f, 999.9f, 31.300001f, 999.4f);
generalPath.curveTo(29.6f, 998.9f, 29.1f, 997.4f, 29.6f, 995.7f);
generalPath.curveTo(29.9f, 994.3f, 31.300001f, 993.4f, 32.7f, 993.4f);
generalPath.closePath();
generalPath.moveTo(41.800003f, 993.4f);
generalPath.curveTo(43.200005f, 993.4f, 44.600002f, 994.30005f, 44.9f, 995.7f);
generalPath.curveTo(45.300003f, 997.4f, 44.9f, 999.0f, 43.2f, 999.4f);
generalPath.curveTo(41.5f, 999.9f, 39.8f, 998.9f, 39.3f, 997.2f);
generalPath.curveTo(38.899998f, 995.5f, 39.3f, 994.0f, 41.0f, 993.5f);
generalPath.curveTo(41.3f, 993.4f, 41.6f, 993.4f, 41.8f, 993.4f);
generalPath.closePath();
generalPath.moveTo(37.200005f, 1001.2f);
generalPath.curveTo(37.700005f, 1001.2f, 39.700005f, 1003.8f, 39.500004f, 1004.10004f);
generalPath.curveTo(39.300003f, 1004.4f, 35.200005f, 1004.4f, 35.000004f, 1004.10004f);
generalPath.curveTo(34.800003f, 1003.9f, 36.800003f, 1001.2f, 37.200005f, 1001.2f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.25, 1015.56298828125), new Point2D.Double(37.25, 979.1619873046875), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(16.3f, 71.2f);
generalPath.lineTo(23.699999f, 71.2f);
generalPath.curveTo(25.4f, 71.2f, 26.599998f, 71.299995f, 27.499998f, 71.6f);
generalPath.curveTo(28.699999f, 71.9f, 29.699999f, 72.6f, 30.499998f, 73.4f);
generalPath.curveTo(31.299997f, 74.3f, 31.999998f, 75.3f, 32.399998f, 76.6f);
generalPath.curveTo(32.799995f, 77.899994f, 33.1f, 79.4f, 33.1f, 81.299995f);
generalPath.curveTo(33.1f, 82.899994f, 32.899998f, 84.299995f, 32.5f, 85.49999f);
generalPath.curveTo(32.0f, 86.899994f, 31.3f, 88.09999f, 30.4f, 88.99999f);
generalPath.curveTo(29.699999f, 89.69999f, 28.8f, 90.19999f, 27.6f, 90.59999f);
generalPath.curveTo(26.7f, 90.899994f, 25.5f, 90.99999f, 24.0f, 90.99999f);
generalPath.lineTo(16.4f, 90.99999f);
generalPath.lineTo(16.4f, 71.2f);
generalPath.closePath();
generalPath.moveTo(20.3f, 74.6f);
generalPath.lineTo(20.3f, 87.7f);
generalPath.lineTo(23.3f, 87.7f);
generalPath.curveTo(24.4f, 87.7f, 25.199999f, 87.6f, 25.699999f, 87.5f);
generalPath.curveTo(26.4f, 87.3f, 26.9f, 87.1f, 27.3f, 86.7f);
generalPath.curveTo(27.699999f, 86.299995f, 28.099998f, 85.7f, 28.4f, 84.799995f);
generalPath.curveTo(28.7f, 83.899994f, 28.8f, 82.7f, 28.8f, 81.2f);
generalPath.curveTo(28.8f, 79.7f, 28.699999f, 78.5f, 28.4f, 77.7f);
generalPath.curveTo(28.1f, 76.899994f, 27.699999f, 76.2f, 27.3f, 75.799995f);
generalPath.curveTo(26.8f, 75.299995f, 26.199999f, 74.99999f, 25.4f, 74.899994f);
generalPath.curveTo(24.8f, 74.799995f, 23.699999f, 74.7f, 22.1f, 74.7f);
generalPath.lineTo(20.300001f, 74.7f);
generalPath.closePath();
generalPath.moveTo(36.3f, 91.1f);
generalPath.lineTo(36.3f, 71.2f);
generalPath.lineTo(40.3f, 71.2f);
generalPath.lineTo(40.3f, 91.0f);
generalPath.lineTo(36.3f, 91.0f);
generalPath.closePath();
generalPath.moveTo(42.5f, 91.1f);
generalPath.lineTo(42.5f, 87.5f);
generalPath.lineTo(53.0f, 74.6f);
generalPath.lineTo(43.7f, 74.6f);
generalPath.lineTo(43.7f, 71.2f);
generalPath.lineTo(58.300003f, 71.2f);
generalPath.lineTo(58.300003f, 74.299995f);
generalPath.lineTo(47.300003f, 87.7f);
generalPath.lineTo(58.700005f, 87.7f);
generalPath.lineTo(58.700005f, 91.0f);
generalPath.lineTo(42.5f, 91.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
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
        return 0.13199996948242188;
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
		return 0.7380000352859497;
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
	private ext_diz() {
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
       ext_diz base = new ext_diz();
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
       ext_diz base = new ext_diz();
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
        return ext_diz::new;
    }
}

