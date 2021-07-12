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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_dmg implements NeonIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private NeonIcon.ColorFilter colorFilter = null;
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 99.0f);
generalPath.lineTo(-0.19999695f, 99.0f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 2.994999885559082), new Point2D.Double(35.75, 101.0009994506836), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 196, 2, 255)) : new Color(239, 196, 2, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 200, 41, 255)) : new Color(241, 200, 41, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 210, 100, 255)) : new Color(244, 210, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 220, 139, 255)) : new Color(247, 220, 139, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 229, 172, 255)) : new Color(249, 229, 172, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 236, 199, 255)) : new Color(251, 236, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 243, 221, 255)) : new Color(252, 243, 221, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 249, 238, 255)) : new Color(254, 249, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 253, 249, 255)) : new Color(255, 253, 249, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 99.0f);
generalPath.lineTo(-0.19999695f, 99.0f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 156, 2, 255)) : new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 99.0f);
generalPath.lineTo(-0.19999695f, 99.0f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
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
generalPath.moveTo(5.0f, 72.2f);
generalPath.lineTo(12.4f, 72.2f);
generalPath.curveTo(14.099999f, 72.2f, 15.299999f, 72.299995f, 16.199999f, 72.6f);
generalPath.curveTo(17.4f, 72.9f, 18.4f, 73.6f, 19.199999f, 74.4f);
generalPath.curveTo(19.999998f, 75.3f, 20.699999f, 76.3f, 21.099998f, 77.6f);
generalPath.curveTo(21.499998f, 78.899994f, 21.8f, 80.4f, 21.8f, 82.299995f);
generalPath.curveTo(21.8f, 83.899994f, 21.599998f, 85.299995f, 21.199999f, 86.49999f);
generalPath.curveTo(20.699999f, 87.99999f, 19.999998f, 89.19999f, 18.999998f, 90.09999f);
generalPath.curveTo(18.299997f, 90.79999f, 17.399998f, 91.29999f, 16.199999f, 91.69999f);
generalPath.curveTo(15.299999f, 91.99999f, 14.099998f, 92.09999f, 12.599998f, 92.09999f);
generalPath.lineTo(5.0f, 92.09999f);
generalPath.lineTo(5.0f, 72.2f);
generalPath.closePath();
generalPath.moveTo(9.0f, 75.6f);
generalPath.lineTo(9.0f, 88.7f);
generalPath.lineTo(12.0f, 88.7f);
generalPath.curveTo(13.1f, 88.7f, 13.9f, 88.6f, 14.4f, 88.5f);
generalPath.curveTo(15.099999f, 88.3f, 15.599999f, 88.1f, 16.0f, 87.7f);
generalPath.curveTo(16.4f, 87.299995f, 16.8f, 86.7f, 17.1f, 85.799995f);
generalPath.curveTo(17.400002f, 84.899994f, 17.5f, 83.7f, 17.5f, 82.2f);
generalPath.curveTo(17.5f, 80.7f, 17.4f, 79.5f, 17.1f, 78.7f);
generalPath.curveTo(16.800001f, 77.899994f, 16.4f, 77.2f, 16.0f, 76.799995f);
generalPath.curveTo(15.5f, 76.299995f, 14.9f, 75.99999f, 14.1f, 75.899994f);
generalPath.curveTo(13.5f, 75.799995f, 12.400001f, 75.7f, 10.8f, 75.7f);
generalPath.lineTo(9.0f, 75.7f);
generalPath.closePath();
generalPath.moveTo(25.2f, 92.1f);
generalPath.lineTo(25.2f, 72.2f);
generalPath.lineTo(31.300001f, 72.2f);
generalPath.lineTo(34.9f, 85.7f);
generalPath.lineTo(38.5f, 72.2f);
generalPath.lineTo(44.6f, 72.2f);
generalPath.lineTo(44.6f, 92.0f);
generalPath.lineTo(40.8f, 92.0f);
generalPath.lineTo(40.8f, 76.4f);
generalPath.lineTo(36.8f, 92.0f);
generalPath.lineTo(32.899998f, 92.0f);
generalPath.lineTo(28.899998f, 76.4f);
generalPath.lineTo(28.899998f, 92.0f);
generalPath.lineTo(25.199997f, 92.0f);
generalPath.closePath();
generalPath.moveTo(57.9f, 84.799995f);
generalPath.lineTo(57.9f, 81.49999f);
generalPath.lineTo(66.6f, 81.49999f);
generalPath.lineTo(66.6f, 89.399994f);
generalPath.curveTo(65.799995f, 90.2f, 64.5f, 90.899994f, 62.899998f, 91.49999f);
generalPath.curveTo(61.3f, 92.09999f, 59.699997f, 92.399994f, 57.999996f, 92.399994f);
generalPath.curveTo(55.899998f, 92.399994f, 54.099995f, 91.99999f, 52.499996f, 91.09999f);
generalPath.curveTo(50.999996f, 90.19999f, 49.799995f, 88.99999f, 48.999996f, 87.399994f);
generalPath.curveTo(48.199997f, 85.799995f, 47.799995f, 83.99999f, 47.799995f, 82.09999f);
generalPath.curveTo(47.799995f, 79.99999f, 48.199997f, 78.19999f, 49.099995f, 76.59999f);
generalPath.curveTo(49.999992f, 74.99999f, 51.299995f, 73.79999f, 52.899994f, 72.899994f);
generalPath.curveTo(54.199993f, 72.2f, 55.799995f, 71.899994f, 57.699993f, 71.899994f);
generalPath.curveTo(60.199993f, 71.899994f, 62.099995f, 72.399994f, 63.499992f, 73.399994f);
generalPath.curveTo(64.899994f, 74.399994f, 65.799995f, 75.899994f, 66.19999f, 77.7f);
generalPath.lineTo(62.19999f, 78.399994f);
generalPath.curveTo(61.89999f, 77.399994f, 61.39999f, 76.7f, 60.59999f, 76.09999f);
generalPath.curveTo(59.79999f, 75.49999f, 58.79999f, 75.29999f, 57.69999f, 75.29999f);
generalPath.curveTo(55.89999f, 75.29999f, 54.49999f, 75.89999f, 53.49999f, 76.999985f);
generalPath.curveTo(52.49999f, 78.09998f, 51.89999f, 79.79999f, 51.89999f, 81.89999f);
generalPath.curveTo(51.89999f, 84.29999f, 52.39999f, 85.999985f, 53.49999f, 87.19999f);
generalPath.curveTo(54.599987f, 88.39999f, 55.89999f, 88.99999f, 57.69999f, 88.99999f);
generalPath.curveTo(58.49999f, 88.99999f, 59.39999f, 88.799995f, 60.299988f, 88.49999f);
generalPath.curveTo(61.19999f, 88.19999f, 61.899986f, 87.799995f, 62.49999f, 87.299995f);
generalPath.lineTo(62.49999f, 84.799995f);
generalPath.lineTo(57.89999f, 84.799995f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255);
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
generalPath.moveTo(30.0f, 973.4f);
generalPath.curveTo(29.9f, 973.4f, 29.8f, 973.4f, 29.7f, 973.5f);
generalPath.lineTo(13.0f, 981.1f);
generalPath.curveTo(12.5f, 981.3f, 12.3f, 982.1f, 12.7f, 982.6f);
generalPath.lineTo(17.9f, 988.69995f);
generalPath.lineTo(12.7f, 994.69995f);
generalPath.curveTo(12.4f, 995.1f, 12.5f, 995.89996f, 13.0f, 996.19995f);
generalPath.lineTo(18.2f, 998.6f);
generalPath.lineTo(18.2f, 1008.69995f);
generalPath.curveTo(18.2f, 1009.1f, 18.400002f, 1009.39996f, 18.800001f, 1009.6f);
generalPath.lineTo(35.9f, 1017.19995f);
generalPath.curveTo(36.100002f, 1017.2999f, 36.4f, 1017.2999f, 36.7f, 1017.19995f);
generalPath.lineTo(53.9f, 1009.6f);
generalPath.curveTo(54.2f, 1009.5f, 54.5f, 1009.1f, 54.5f, 1008.69995f);
generalPath.lineTo(54.5f, 998.6f);
generalPath.lineTo(59.7f, 996.19995f);
generalPath.curveTo(60.2f, 995.99994f, 60.4f, 995.19995f, 60.0f, 994.69995f);
generalPath.lineTo(54.8f, 988.69995f);
generalPath.lineTo(60.0f, 982.6f);
generalPath.curveTo(60.4f, 982.19995f, 60.2f, 981.39996f, 59.7f, 981.1f);
generalPath.lineTo(43.0f, 973.5f);
generalPath.curveTo(42.9f, 973.4f, 42.7f, 973.4f, 42.5f, 973.4f);
generalPath.curveTo(42.3f, 973.4f, 42.0f, 973.5f, 41.9f, 973.7f);
generalPath.lineTo(36.4f, 979.60004f);
generalPath.lineTo(30.900002f, 973.7f);
generalPath.curveTo(30.600002f, 973.5f, 30.300001f, 973.3f, 30.000002f, 973.4f);
generalPath.closePath();
generalPath.moveTo(29.8f, 975.5f);
generalPath.lineTo(34.6f, 980.7f);
generalPath.lineTo(19.3f, 987.5f);
generalPath.lineTo(14.9f, 982.3f);
generalPath.lineTo(29.8f, 975.5f);
generalPath.closePath();
generalPath.moveTo(42.699997f, 975.5f);
generalPath.lineTo(57.6f, 982.3f);
generalPath.lineTo(53.199997f, 987.5f);
generalPath.lineTo(37.899998f, 980.7f);
generalPath.lineTo(42.699997f, 975.5f);
generalPath.closePath();
generalPath.moveTo(36.299995f, 982.0f);
generalPath.lineTo(51.099995f, 988.6f);
generalPath.lineTo(36.299995f, 995.19995f);
generalPath.lineTo(21.499996f, 988.6f);
generalPath.lineTo(36.299995f, 982.0f);
generalPath.closePath();
generalPath.moveTo(19.399996f, 989.8f);
generalPath.lineTo(34.699997f, 996.6f);
generalPath.lineTo(29.899998f, 1001.8f);
generalPath.lineTo(15.0f, 995.0f);
generalPath.lineTo(19.4f, 989.8f);
generalPath.closePath();
generalPath.moveTo(53.199997f, 989.8f);
generalPath.lineTo(57.6f, 995.0f);
generalPath.lineTo(42.699997f, 1001.8f);
generalPath.lineTo(37.899998f, 996.6f);
generalPath.lineTo(53.199997f, 989.8f);
generalPath.closePath();
generalPath.moveTo(35.299995f, 998.7f);
generalPath.lineTo(35.299995f, 1014.8f);
generalPath.lineTo(20.0f, 1008.0f);
generalPath.lineTo(20.0f, 999.4f);
generalPath.lineTo(29.6f, 1003.80005f);
generalPath.curveTo(30.0f, 1004.00006f, 30.4f, 1003.9f, 30.7f, 1003.60004f);
generalPath.lineTo(35.3f, 998.7f);
generalPath.closePath();
generalPath.moveTo(37.199997f, 998.7f);
generalPath.lineTo(41.699997f, 1003.60004f);
generalPath.curveTo(41.999996f, 1003.9f, 42.399998f, 1004.00006f, 42.799995f, 1003.80005f);
generalPath.lineTo(52.399994f, 999.4f);
generalPath.lineTo(52.399994f, 1008.0f);
generalPath.lineTo(37.099995f, 1014.8f);
generalPath.lineTo(37.099995f, 998.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(12.470999717712402, 995.2769775390625), new Point2D.Double(60.077999114990234, 995.2769775390625), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(164, 125, 3, 255)) : new Color(164, 125, 3, 255)),((colorFilter != null) ? colorFilter.filter(new Color(222, 190, 0, 255)) : new Color(222, 190, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 173, 4, 255)) : new Color(207, 173, 4, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(11.720999717712402, 995.2769775390625), new Point2D.Double(60.827999114990234, 995.2769775390625), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(164, 125, 3, 255)) : new Color(164, 125, 3, 255)),((colorFilter != null) ? colorFilter.filter(new Color(222, 190, 0, 255)) : new Color(222, 190, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 173, 4, 255)) : new Color(207, 173, 4, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.0f, 973.4f);
generalPath.curveTo(29.9f, 973.4f, 29.8f, 973.4f, 29.7f, 973.5f);
generalPath.lineTo(13.0f, 981.1f);
generalPath.curveTo(12.5f, 981.3f, 12.3f, 982.1f, 12.7f, 982.6f);
generalPath.lineTo(17.9f, 988.69995f);
generalPath.lineTo(12.7f, 994.69995f);
generalPath.curveTo(12.4f, 995.1f, 12.5f, 995.89996f, 13.0f, 996.19995f);
generalPath.lineTo(18.2f, 998.6f);
generalPath.lineTo(18.2f, 1008.69995f);
generalPath.curveTo(18.2f, 1009.1f, 18.400002f, 1009.39996f, 18.800001f, 1009.6f);
generalPath.lineTo(35.9f, 1017.19995f);
generalPath.curveTo(36.100002f, 1017.2999f, 36.4f, 1017.2999f, 36.7f, 1017.19995f);
generalPath.lineTo(53.9f, 1009.6f);
generalPath.curveTo(54.2f, 1009.5f, 54.5f, 1009.1f, 54.5f, 1008.69995f);
generalPath.lineTo(54.5f, 998.6f);
generalPath.lineTo(59.7f, 996.19995f);
generalPath.curveTo(60.2f, 995.99994f, 60.4f, 995.19995f, 60.0f, 994.69995f);
generalPath.lineTo(54.8f, 988.69995f);
generalPath.lineTo(60.0f, 982.6f);
generalPath.curveTo(60.4f, 982.19995f, 60.2f, 981.39996f, 59.7f, 981.1f);
generalPath.lineTo(43.0f, 973.5f);
generalPath.curveTo(42.9f, 973.4f, 42.7f, 973.4f, 42.5f, 973.4f);
generalPath.curveTo(42.3f, 973.4f, 42.0f, 973.5f, 41.9f, 973.7f);
generalPath.lineTo(36.4f, 979.60004f);
generalPath.lineTo(30.900002f, 973.7f);
generalPath.curveTo(30.600002f, 973.5f, 30.300001f, 973.3f, 30.000002f, 973.4f);
generalPath.closePath();
generalPath.moveTo(29.8f, 975.5f);
generalPath.lineTo(34.6f, 980.7f);
generalPath.lineTo(19.3f, 987.5f);
generalPath.lineTo(14.9f, 982.3f);
generalPath.lineTo(29.8f, 975.5f);
generalPath.closePath();
generalPath.moveTo(42.699997f, 975.5f);
generalPath.lineTo(57.6f, 982.3f);
generalPath.lineTo(53.199997f, 987.5f);
generalPath.lineTo(37.899998f, 980.7f);
generalPath.lineTo(42.699997f, 975.5f);
generalPath.closePath();
generalPath.moveTo(36.299995f, 982.0f);
generalPath.lineTo(51.099995f, 988.6f);
generalPath.lineTo(36.299995f, 995.19995f);
generalPath.lineTo(21.499996f, 988.6f);
generalPath.lineTo(36.299995f, 982.0f);
generalPath.closePath();
generalPath.moveTo(19.399996f, 989.8f);
generalPath.lineTo(34.699997f, 996.6f);
generalPath.lineTo(29.899998f, 1001.8f);
generalPath.lineTo(15.0f, 995.0f);
generalPath.lineTo(19.4f, 989.8f);
generalPath.closePath();
generalPath.moveTo(53.199997f, 989.8f);
generalPath.lineTo(57.6f, 995.0f);
generalPath.lineTo(42.699997f, 1001.8f);
generalPath.lineTo(37.899998f, 996.6f);
generalPath.lineTo(53.199997f, 989.8f);
generalPath.closePath();
generalPath.moveTo(35.299995f, 998.7f);
generalPath.lineTo(35.299995f, 1014.8f);
generalPath.lineTo(20.0f, 1008.0f);
generalPath.lineTo(20.0f, 999.4f);
generalPath.lineTo(29.6f, 1003.80005f);
generalPath.curveTo(30.0f, 1004.00006f, 30.4f, 1003.9f, 30.7f, 1003.60004f);
generalPath.lineTo(35.3f, 998.7f);
generalPath.closePath();
generalPath.moveTo(37.199997f, 998.7f);
generalPath.lineTo(41.699997f, 1003.60004f);
generalPath.curveTo(41.999996f, 1003.9f, 42.399998f, 1004.00006f, 42.799995f, 1003.80005f);
generalPath.lineTo(52.399994f, 999.4f);
generalPath.lineTo(52.399994f, 1008.0f);
generalPath.lineTo(37.099995f, 1014.8f);
generalPath.lineTo(37.099995f, 998.7f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.34400177001953, 74.2300033569336), new Point2D.Double(58.84400177001953, 87.7300033569336), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 251, 255)) : new Color(255, 254, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 250, 241, 255)) : new Color(254, 250, 241, 255)),((colorFilter != null) ? colorFilter.filter(new Color(253, 245, 228, 255)) : new Color(253, 245, 228, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 240, 210, 255)) : new Color(252, 240, 210, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 233, 188, 255)) : new Color(250, 233, 188, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 226, 162, 255)) : new Color(249, 226, 162, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 218, 131, 255)) : new Color(247, 218, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 209, 93, 255)) : new Color(244, 209, 93, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 200, 39, 255)) : new Color(241, 200, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(239, 196, 2, 255)) : new Color(239, 196, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 156, 2, 255)) : new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
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
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
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
    public static NeonIcon of(int width, int height) {
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
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_dmg base = new ext_dmg();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
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

