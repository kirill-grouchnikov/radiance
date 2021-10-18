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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_xrb implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
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
paint = new LinearGradientPaint(new Point2D.Double(36.275001525878906, 1017.1959838867188), new Point2D.Double(36.275001525878906, 973.3590087890625), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.275001525878906, 1017.9459838867188), new Point2D.Double(36.275001525878906, 972.6090087890625), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(7.8f, 91.5f);
generalPath.lineTo(14.5f, 81.4f);
generalPath.lineTo(8.5f, 72.200005f);
generalPath.lineTo(13.0f, 72.200005f);
generalPath.lineTo(16.9f, 78.4f);
generalPath.lineTo(20.699999f, 72.200005f);
generalPath.lineTo(25.3f, 72.200005f);
generalPath.lineTo(19.199999f, 81.600006f);
generalPath.lineTo(25.899998f, 91.50001f);
generalPath.lineTo(21.099998f, 91.50001f);
generalPath.lineTo(16.8f, 84.80001f);
generalPath.lineTo(12.499999f, 91.50001f);
generalPath.lineTo(7.8f, 91.50001f);
generalPath.closePath();
generalPath.moveTo(28.0f, 91.5f);
generalPath.lineTo(28.0f, 72.2f);
generalPath.lineTo(36.3f, 72.2f);
generalPath.curveTo(38.399998f, 72.2f, 39.899998f, 72.399994f, 40.8f, 72.7f);
generalPath.curveTo(41.7f, 73.0f, 42.5f, 73.7f, 43.1f, 74.6f);
generalPath.curveTo(43.699997f, 75.5f, 44.0f, 76.5f, 44.0f, 77.6f);
generalPath.curveTo(44.0f, 79.0f, 43.6f, 80.2f, 42.7f, 81.2f);
generalPath.curveTo(41.8f, 82.1f, 40.600002f, 82.7f, 38.8f, 83.0f);
generalPath.curveTo(39.7f, 83.5f, 40.399998f, 84.0f, 40.899998f, 84.6f);
generalPath.curveTo(41.399998f, 85.2f, 42.199997f, 86.2f, 43.1f, 87.7f);
generalPath.lineTo(45.5f, 91.5f);
generalPath.lineTo(40.8f, 91.5f);
generalPath.lineTo(38.0f, 87.3f);
generalPath.curveTo(37.0f, 85.8f, 36.3f, 84.8f, 35.9f, 84.5f);
generalPath.curveTo(35.5f, 84.1f, 35.100002f, 83.8f, 34.7f, 83.7f);
generalPath.curveTo(34.3f, 83.6f, 33.600002f, 83.5f, 32.7f, 83.5f);
generalPath.lineTo(31.900002f, 83.5f);
generalPath.lineTo(31.900002f, 91.6f);
generalPath.lineTo(28.0f, 91.6f);
generalPath.closePath();
generalPath.moveTo(31.9f, 80.4f);
generalPath.lineTo(34.8f, 80.4f);
generalPath.curveTo(36.7f, 80.4f, 37.899998f, 80.3f, 38.3f, 80.200005f);
generalPath.curveTo(38.7f, 80.100006f, 39.1f, 79.8f, 39.399998f, 79.4f);
generalPath.curveTo(39.699997f, 79.0f, 39.8f, 78.5f, 39.8f, 77.9f);
generalPath.curveTo(39.8f, 77.200005f, 39.6f, 76.700005f, 39.3f, 76.3f);
generalPath.curveTo(38.899998f, 75.9f, 38.5f, 75.600006f, 37.8f, 75.5f);
generalPath.curveTo(37.5f, 75.5f, 36.5f, 75.4f, 34.899998f, 75.4f);
generalPath.lineTo(31.799997f, 75.4f);
generalPath.lineTo(31.799997f, 80.4f);
generalPath.closePath();
generalPath.moveTo(47.7f, 72.200005f);
generalPath.lineTo(55.5f, 72.200005f);
generalPath.curveTo(57.0f, 72.200005f, 58.2f, 72.3f, 59.0f, 72.4f);
generalPath.curveTo(59.8f, 72.5f, 60.4f, 72.8f, 61.0f, 73.200005f);
generalPath.curveTo(61.6f, 73.600006f, 62.1f, 74.100006f, 62.5f, 74.8f);
generalPath.curveTo(62.9f, 75.5f, 63.1f, 76.200005f, 63.1f, 77.100006f);
generalPath.curveTo(63.1f, 78.00001f, 62.899998f, 78.8f, 62.399998f, 79.600006f);
generalPath.curveTo(61.899998f, 80.40001f, 61.199997f, 80.90001f, 60.399998f, 81.3f);
generalPath.curveTo(61.6f, 81.600006f, 62.499996f, 82.200005f, 63.1f, 83.100006f);
generalPath.curveTo(63.699997f, 83.90001f, 64.1f, 84.90001f, 64.1f, 86.00001f);
generalPath.curveTo(64.1f, 86.90001f, 63.899998f, 87.700005f, 63.5f, 88.600006f);
generalPath.curveTo(63.1f, 89.40001f, 62.5f, 90.100006f, 61.8f, 90.600006f);
generalPath.curveTo(61.1f, 91.100006f, 60.2f, 91.40001f, 59.2f, 91.50001f);
generalPath.curveTo(58.5f, 91.600006f, 57.0f, 91.600006f, 54.4f, 91.600006f);
generalPath.lineTo(47.800003f, 91.600006f);
generalPath.lineTo(47.800003f, 72.2f);
generalPath.closePath();
generalPath.moveTo(51.600002f, 75.4f);
generalPath.lineTo(51.600002f, 79.9f);
generalPath.lineTo(54.2f, 79.9f);
generalPath.curveTo(55.7f, 79.9f, 56.7f, 79.9f, 57.100002f, 79.8f);
generalPath.curveTo(57.800003f, 79.700005f, 58.300003f, 79.5f, 58.7f, 79.100006f);
generalPath.curveTo(59.100002f, 78.700005f, 59.3f, 78.200005f, 59.3f, 77.600006f);
generalPath.curveTo(59.3f, 77.00001f, 59.1f, 76.50001f, 58.8f, 76.100006f);
generalPath.curveTo(58.5f, 75.700005f, 58.0f, 75.50001f, 57.3f, 75.40001f);
generalPath.curveTo(56.899998f, 75.40001f, 55.8f, 75.30001f, 53.899998f, 75.30001f);
generalPath.lineTo(51.6f, 75.30001f);
generalPath.closePath();
generalPath.moveTo(51.600002f, 83.1f);
generalPath.lineTo(51.600002f, 88.299995f);
generalPath.lineTo(55.2f, 88.299995f);
generalPath.curveTo(56.600002f, 88.299995f, 57.5f, 88.299995f, 57.9f, 88.2f);
generalPath.curveTo(58.5f, 88.1f, 59.0f, 87.799995f, 59.300003f, 87.399994f);
generalPath.curveTo(59.700005f, 86.99999f, 59.9f, 86.399994f, 59.9f, 85.799995f);
generalPath.curveTo(59.9f, 85.2f, 59.800003f, 84.7f, 59.5f, 84.299995f);
generalPath.curveTo(59.199997f, 83.899994f, 58.8f, 83.6f, 58.3f, 83.399994f);
generalPath.curveTo(57.8f, 83.19999f, 56.6f, 83.09999f, 54.8f, 83.09999f);
generalPath.lineTo(51.6f, 83.09999f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_xrb() {
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
    public boolean supportsColorFilter() {
        return true;
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
    public static RadianceIcon of(int width, int height) {
       ext_xrb base = new ext_xrb();
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
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       ext_xrb base = new ext_xrb();
       base.width = width;
       base.height = height;
       return new RadianceIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_xrb::new;
    }
}

