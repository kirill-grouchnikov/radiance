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
public class ext_dmg implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8, 1.0);
generalPath.lineTo(71.8, 27.7);
generalPath.lineTo(71.8, 99.0);
generalPath.lineTo(-0.19999695, 99.0);
generalPath.lineTo(-0.19999695, 1.0);
generalPath.lineTo(44.800003, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 2.994999885559082), new Point2D.Double(35.75, 101.0009994506836), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {new Color(239, 196, 2, 255),new Color(241, 200, 41, 255),new Color(244, 210, 100, 255),new Color(247, 220, 139, 255),new Color(249, 229, 172, 255),new Color(251, 236, 199, 255),new Color(252, 243, 221, 255),new Color(254, 249, 238, 255),new Color(255, 253, 249, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.8, 1.0);
generalPath.lineTo(71.8, 27.7);
generalPath.lineTo(71.8, 99.0);
generalPath.lineTo(-0.19999695, 99.0);
generalPath.lineTo(-0.19999695, 1.0);
generalPath.lineTo(44.800003, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8, 1.0);
generalPath.lineTo(71.8, 27.7);
generalPath.lineTo(71.8, 99.0);
generalPath.lineTo(-0.19999695, 99.0);
generalPath.lineTo(-0.19999695, 1.0);
generalPath.lineTo(44.800003, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(5.0, 72.2);
generalPath.lineTo(12.4, 72.2);
generalPath.curveTo(14.099999, 72.2, 15.299999, 72.299995, 16.199999, 72.6);
generalPath.curveTo(17.4, 72.9, 18.4, 73.6, 19.199999, 74.4);
generalPath.curveTo(19.999998, 75.3, 20.699999, 76.3, 21.099998, 77.6);
generalPath.curveTo(21.499998, 78.899994, 21.8, 80.4, 21.8, 82.299995);
generalPath.curveTo(21.8, 83.899994, 21.599998, 85.299995, 21.199999, 86.49999);
generalPath.curveTo(20.699999, 87.99999, 19.999998, 89.19999, 18.999998, 90.09999);
generalPath.curveTo(18.299997, 90.79999, 17.399998, 91.29999, 16.199999, 91.69999);
generalPath.curveTo(15.299999, 91.99999, 14.099998, 92.09999, 12.599998, 92.09999);
generalPath.lineTo(5.0, 92.09999);
generalPath.lineTo(5.0, 72.2);
generalPath.closePath();
generalPath.moveTo(9.0, 75.6);
generalPath.lineTo(9.0, 88.7);
generalPath.lineTo(12.0, 88.7);
generalPath.curveTo(13.1, 88.7, 13.9, 88.6, 14.4, 88.5);
generalPath.curveTo(15.099999, 88.3, 15.599999, 88.1, 16.0, 87.7);
generalPath.curveTo(16.4, 87.299995, 16.8, 86.7, 17.1, 85.799995);
generalPath.curveTo(17.400002, 84.899994, 17.5, 83.7, 17.5, 82.2);
generalPath.curveTo(17.5, 80.7, 17.4, 79.5, 17.1, 78.7);
generalPath.curveTo(16.800001, 77.899994, 16.4, 77.2, 16.0, 76.799995);
generalPath.curveTo(15.5, 76.299995, 14.9, 75.99999, 14.1, 75.899994);
generalPath.curveTo(13.5, 75.799995, 12.400001, 75.7, 10.8, 75.7);
generalPath.lineTo(9.0, 75.7);
generalPath.closePath();
generalPath.moveTo(25.2, 92.1);
generalPath.lineTo(25.2, 72.2);
generalPath.lineTo(31.300001, 72.2);
generalPath.lineTo(34.9, 85.7);
generalPath.lineTo(38.5, 72.2);
generalPath.lineTo(44.6, 72.2);
generalPath.lineTo(44.6, 92.0);
generalPath.lineTo(40.8, 92.0);
generalPath.lineTo(40.8, 76.4);
generalPath.lineTo(36.8, 92.0);
generalPath.lineTo(32.899998, 92.0);
generalPath.lineTo(28.899998, 76.4);
generalPath.lineTo(28.899998, 92.0);
generalPath.lineTo(25.199997, 92.0);
generalPath.closePath();
generalPath.moveTo(57.9, 84.799995);
generalPath.lineTo(57.9, 81.49999);
generalPath.lineTo(66.6, 81.49999);
generalPath.lineTo(66.6, 89.399994);
generalPath.curveTo(65.799995, 90.2, 64.5, 90.899994, 62.899998, 91.49999);
generalPath.curveTo(61.3, 92.09999, 59.699997, 92.399994, 57.999996, 92.399994);
generalPath.curveTo(55.899998, 92.399994, 54.099995, 91.99999, 52.499996, 91.09999);
generalPath.curveTo(50.999996, 90.19999, 49.799995, 88.99999, 48.999996, 87.399994);
generalPath.curveTo(48.199997, 85.799995, 47.799995, 83.99999, 47.799995, 82.09999);
generalPath.curveTo(47.799995, 79.99999, 48.199997, 78.19999, 49.099995, 76.59999);
generalPath.curveTo(49.999992, 74.99999, 51.299995, 73.79999, 52.899994, 72.899994);
generalPath.curveTo(54.199993, 72.2, 55.799995, 71.899994, 57.699993, 71.899994);
generalPath.curveTo(60.199993, 71.899994, 62.099995, 72.399994, 63.499992, 73.399994);
generalPath.curveTo(64.899994, 74.399994, 65.799995, 75.899994, 66.19999, 77.7);
generalPath.lineTo(62.19999, 78.399994);
generalPath.curveTo(61.89999, 77.399994, 61.39999, 76.7, 60.59999, 76.09999);
generalPath.curveTo(59.79999, 75.49999, 58.79999, 75.29999, 57.69999, 75.29999);
generalPath.curveTo(55.89999, 75.29999, 54.49999, 75.89999, 53.49999, 76.999985);
generalPath.curveTo(52.49999, 78.09998, 51.89999, 79.79999, 51.89999, 81.89999);
generalPath.curveTo(51.89999, 84.29999, 52.39999, 85.999985, 53.49999, 87.19999);
generalPath.curveTo(54.599987, 88.39999, 55.89999, 88.99999, 57.69999, 88.99999);
generalPath.curveTo(58.49999, 88.99999, 59.39999, 88.799995, 60.299988, 88.49999);
generalPath.curveTo(61.19999, 88.19999, 61.899986, 87.799995, 62.49999, 87.299995);
generalPath.lineTo(62.49999, 84.799995);
generalPath.lineTo(57.89999, 84.799995);
generalPath.closePath();
shape = generalPath;
paint = new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(30.0, 973.4);
generalPath.curveTo(29.9, 973.4, 29.8, 973.4, 29.7, 973.5);
generalPath.lineTo(13.0, 981.1);
generalPath.curveTo(12.5, 981.3, 12.3, 982.1, 12.7, 982.6);
generalPath.lineTo(17.9, 988.69995);
generalPath.lineTo(12.7, 994.69995);
generalPath.curveTo(12.4, 995.1, 12.5, 995.89996, 13.0, 996.19995);
generalPath.lineTo(18.2, 998.6);
generalPath.lineTo(18.2, 1008.69995);
generalPath.curveTo(18.2, 1009.1, 18.400002, 1009.39996, 18.800001, 1009.6);
generalPath.lineTo(35.9, 1017.19995);
generalPath.curveTo(36.100002, 1017.2999, 36.4, 1017.2999, 36.7, 1017.19995);
generalPath.lineTo(53.9, 1009.6);
generalPath.curveTo(54.2, 1009.5, 54.5, 1009.1, 54.5, 1008.69995);
generalPath.lineTo(54.5, 998.6);
generalPath.lineTo(59.7, 996.19995);
generalPath.curveTo(60.2, 995.99994, 60.4, 995.19995, 60.0, 994.69995);
generalPath.lineTo(54.8, 988.69995);
generalPath.lineTo(60.0, 982.6);
generalPath.curveTo(60.4, 982.19995, 60.2, 981.39996, 59.7, 981.1);
generalPath.lineTo(43.0, 973.5);
generalPath.curveTo(42.9, 973.4, 42.7, 973.4, 42.5, 973.4);
generalPath.curveTo(42.3, 973.4, 42.0, 973.5, 41.9, 973.7);
generalPath.lineTo(36.4, 979.60004);
generalPath.lineTo(30.900002, 973.7);
generalPath.curveTo(30.600002, 973.5, 30.300001, 973.3, 30.000002, 973.4);
generalPath.closePath();
generalPath.moveTo(29.8, 975.5);
generalPath.lineTo(34.6, 980.7);
generalPath.lineTo(19.3, 987.5);
generalPath.lineTo(14.9, 982.3);
generalPath.lineTo(29.8, 975.5);
generalPath.closePath();
generalPath.moveTo(42.699997, 975.5);
generalPath.lineTo(57.6, 982.3);
generalPath.lineTo(53.199997, 987.5);
generalPath.lineTo(37.899998, 980.7);
generalPath.lineTo(42.699997, 975.5);
generalPath.closePath();
generalPath.moveTo(36.299995, 982.0);
generalPath.lineTo(51.099995, 988.6);
generalPath.lineTo(36.299995, 995.19995);
generalPath.lineTo(21.499996, 988.6);
generalPath.lineTo(36.299995, 982.0);
generalPath.closePath();
generalPath.moveTo(19.399996, 989.8);
generalPath.lineTo(34.699997, 996.6);
generalPath.lineTo(29.899998, 1001.8);
generalPath.lineTo(15.0, 995.0);
generalPath.lineTo(19.4, 989.8);
generalPath.closePath();
generalPath.moveTo(53.199997, 989.8);
generalPath.lineTo(57.6, 995.0);
generalPath.lineTo(42.699997, 1001.8);
generalPath.lineTo(37.899998, 996.6);
generalPath.lineTo(53.199997, 989.8);
generalPath.closePath();
generalPath.moveTo(35.299995, 998.7);
generalPath.lineTo(35.299995, 1014.8);
generalPath.lineTo(20.0, 1008.0);
generalPath.lineTo(20.0, 999.4);
generalPath.lineTo(29.6, 1003.80005);
generalPath.curveTo(30.0, 1004.00006, 30.4, 1003.9, 30.7, 1003.60004);
generalPath.lineTo(35.3, 998.7);
generalPath.closePath();
generalPath.moveTo(37.199997, 998.7);
generalPath.lineTo(41.699997, 1003.60004);
generalPath.curveTo(41.999996, 1003.9, 42.399998, 1004.00006, 42.799995, 1003.80005);
generalPath.lineTo(52.399994, 999.4);
generalPath.lineTo(52.399994, 1008.0);
generalPath.lineTo(37.099995, 1014.8);
generalPath.lineTo(37.099995, 998.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(12.470999717712402, 995.2769775390625), new Point2D.Double(60.077999114990234, 995.2769775390625), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {new Color(164, 125, 3, 255),new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(11.720999717712402, 995.2769775390625), new Point2D.Double(60.827999114990234, 995.2769775390625), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {new Color(164, 125, 3, 255),new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.0, 973.4);
generalPath.curveTo(29.9, 973.4, 29.8, 973.4, 29.7, 973.5);
generalPath.lineTo(13.0, 981.1);
generalPath.curveTo(12.5, 981.3, 12.3, 982.1, 12.7, 982.6);
generalPath.lineTo(17.9, 988.69995);
generalPath.lineTo(12.7, 994.69995);
generalPath.curveTo(12.4, 995.1, 12.5, 995.89996, 13.0, 996.19995);
generalPath.lineTo(18.2, 998.6);
generalPath.lineTo(18.2, 1008.69995);
generalPath.curveTo(18.2, 1009.1, 18.400002, 1009.39996, 18.800001, 1009.6);
generalPath.lineTo(35.9, 1017.19995);
generalPath.curveTo(36.100002, 1017.2999, 36.4, 1017.2999, 36.7, 1017.19995);
generalPath.lineTo(53.9, 1009.6);
generalPath.curveTo(54.2, 1009.5, 54.5, 1009.1, 54.5, 1008.69995);
generalPath.lineTo(54.5, 998.6);
generalPath.lineTo(59.7, 996.19995);
generalPath.curveTo(60.2, 995.99994, 60.4, 995.19995, 60.0, 994.69995);
generalPath.lineTo(54.8, 988.69995);
generalPath.lineTo(60.0, 982.6);
generalPath.curveTo(60.4, 982.19995, 60.2, 981.39996, 59.7, 981.1);
generalPath.lineTo(43.0, 973.5);
generalPath.curveTo(42.9, 973.4, 42.7, 973.4, 42.5, 973.4);
generalPath.curveTo(42.3, 973.4, 42.0, 973.5, 41.9, 973.7);
generalPath.lineTo(36.4, 979.60004);
generalPath.lineTo(30.900002, 973.7);
generalPath.curveTo(30.600002, 973.5, 30.300001, 973.3, 30.000002, 973.4);
generalPath.closePath();
generalPath.moveTo(29.8, 975.5);
generalPath.lineTo(34.6, 980.7);
generalPath.lineTo(19.3, 987.5);
generalPath.lineTo(14.9, 982.3);
generalPath.lineTo(29.8, 975.5);
generalPath.closePath();
generalPath.moveTo(42.699997, 975.5);
generalPath.lineTo(57.6, 982.3);
generalPath.lineTo(53.199997, 987.5);
generalPath.lineTo(37.899998, 980.7);
generalPath.lineTo(42.699997, 975.5);
generalPath.closePath();
generalPath.moveTo(36.299995, 982.0);
generalPath.lineTo(51.099995, 988.6);
generalPath.lineTo(36.299995, 995.19995);
generalPath.lineTo(21.499996, 988.6);
generalPath.lineTo(36.299995, 982.0);
generalPath.closePath();
generalPath.moveTo(19.399996, 989.8);
generalPath.lineTo(34.699997, 996.6);
generalPath.lineTo(29.899998, 1001.8);
generalPath.lineTo(15.0, 995.0);
generalPath.lineTo(19.4, 989.8);
generalPath.closePath();
generalPath.moveTo(53.199997, 989.8);
generalPath.lineTo(57.6, 995.0);
generalPath.lineTo(42.699997, 1001.8);
generalPath.lineTo(37.899998, 996.6);
generalPath.lineTo(53.199997, 989.8);
generalPath.closePath();
generalPath.moveTo(35.299995, 998.7);
generalPath.lineTo(35.299995, 1014.8);
generalPath.lineTo(20.0, 1008.0);
generalPath.lineTo(20.0, 999.4);
generalPath.lineTo(29.6, 1003.80005);
generalPath.curveTo(30.0, 1004.00006, 30.4, 1003.9, 30.7, 1003.60004);
generalPath.lineTo(35.3, 998.7);
generalPath.closePath();
generalPath.moveTo(37.199997, 998.7);
generalPath.lineTo(41.699997, 1003.60004);
generalPath.curveTo(41.999996, 1003.9, 42.399998, 1004.00006, 42.799995, 1003.80005);
generalPath.lineTo(52.399994, 999.4);
generalPath.lineTo(52.399994, 1008.0);
generalPath.lineTo(37.099995, 1014.8);
generalPath.lineTo(37.099995, 998.7);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.2, 27.7);
generalPath.lineTo(45.199997, 27.7);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.34400177001953, 74.2300033569336), new Point2D.Double(58.84400177001953, 87.7300033569336), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 254, 251, 255),new Color(254, 250, 241, 255),new Color(253, 245, 228, 255),new Color(252, 240, 210, 255),new Color(250, 233, 188, 255),new Color(249, 226, 162, 255),new Color(247, 218, 131, 255),new Color(244, 209, 93, 255),new Color(241, 200, 39, 255),new Color(239, 196, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.2, 27.7);
generalPath.lineTo(45.199997, 27.7);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.2, 27.7);
generalPath.lineTo(45.199997, 27.7);
generalPath.lineTo(45.199997, 1.0);
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
        return 0.12800002098083496;
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
		return 0.7410314083099365;
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
	private ext_dmg() {
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
       ext_dmg base = new ext_dmg();
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
       ext_dmg base = new ext_dmg();
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
        return ext_dmg::new;
    }
}

