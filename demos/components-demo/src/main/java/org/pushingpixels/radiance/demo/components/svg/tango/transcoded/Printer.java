package org.pushingpixels.radiance.demo.components.svg.tango.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.util.Stack;
import javax.swing.plaf.UIResource;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class Printer implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.3119190037250519f, -2.006727933883667f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.125f, 41.875f);
generalPath.curveTo(43.155647f, 44.15936f, 39.517162f, 46.274582f, 33.587276f, 47.41972f);
generalPath.curveTo(27.65739f, 48.564857f, 20.34261f, 48.564857f, 14.4127245f, 47.41972f);
generalPath.curveTo(8.482839f, 46.274582f, 4.8443522f, 44.15936f, 4.875f, 41.875f);
generalPath.curveTo(4.8443522f, 39.59064f, 8.482839f, 37.475418f, 14.4127245f, 36.33028f);
generalPath.curveTo(20.34261f, 35.185143f, 27.65739f, 35.185143f, 33.587276f, 36.33028f);
generalPath.curveTo(39.517162f, 37.475418f, 43.155647f, 39.59064f, 43.125f, 41.875f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.0, 41.875), 19.125f, new Point2D.Double(24.0, 41.875), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.33333298563957214f, 0.0f, 27.916669845581055f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new RoundRectangle2D.Double(4.75, 36.004188537597656, 38.4375, 6.491594314575195, 3.4230966567993164, 3.423095464706421);
paint = new LinearGradientPaint(new Point2D.Double(1.8456430435180664, 88.29493713378906), new Point2D.Double(18.972126007080078, 88.29493713378906), new float[] {0.0f,0.27586207f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(142, 141, 135, 255)) : new Color(142, 141, 135, 255)),((colorFilter != null) ? colorFilter.filter(new Color(203, 201, 193, 255)) : new Color(203, 201, 193, 255)),((colorFilter != null) ? colorFilter.filter(new Color(142, 141, 135, 255)) : new Color(142, 141, 135, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.302720069885254f, 0.0f, 0.0f, 0.4379180073738098f, 0.0f, 0.5840340256690979f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(89, 89, 89, 255)) : new Color(89, 89, 89, 255);
stroke = new BasicStroke(0.9999998f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(4.75, 36.004188537597656, 38.4375, 6.491594314575195, 3.4230966567993164, 3.423095464706421);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.130896f, 21.5f);
generalPath.lineTo(40.870613f, 21.5f);
generalPath.curveTo(41.25566f, 21.5f, 41.747646f, 21.788155f, 42.05105f, 22.223919f);
generalPath.curveTo(42.35445f, 22.659683f, 43.787518f, 24.83394f, 44.109447f, 25.297964f);
generalPath.curveTo(44.431377f, 25.761988f, 44.502396f, 26.201853f, 44.502396f, 26.77405f);
generalPath.lineTo(44.502396f, 38.850952f);
generalPath.curveTo(44.502396f, 39.764523f, 43.7704f, 40.5f, 42.861153f, 40.5f);
generalPath.lineTo(5.1403594f, 40.5f);
generalPath.curveTo(4.2311096f, 40.5f, 3.4991138f, 39.764523f, 3.4991138f, 38.850952f);
generalPath.lineTo(3.4991138f, 26.77405f);
generalPath.curveTo(3.4991138f, 26.280031f, 3.6002798f, 25.571642f, 3.9455202f, 25.120718f);
generalPath.curveTo(4.3811665f, 24.551714f, 5.549866f, 22.57277f, 5.8581276f, 22.153118f);
generalPath.curveTo(6.1663885f, 21.733467f, 6.732446f, 21.5f, 7.130896f, 21.5f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(1.8456430435180664, 88.29492950439453), new Point2D.Double(18.972126007080078, 88.29492950439453), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(220, 220, 218, 255)) : new Color(220, 220, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(186, 185, 183, 255)) : new Color(186, 185, 183, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.2918241024017334f, 0.0f, 0.0f, 0.4342690110206604f, 0.08855178952217102f, 2.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(103, 103, 103, 255)) : new Color(103, 103, 103, 255);
stroke = new BasicStroke(1.0000004f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.130896f, 21.5f);
generalPath.lineTo(40.870613f, 21.5f);
generalPath.curveTo(41.25566f, 21.5f, 41.747646f, 21.788155f, 42.05105f, 22.223919f);
generalPath.curveTo(42.35445f, 22.659683f, 43.787518f, 24.83394f, 44.109447f, 25.297964f);
generalPath.curveTo(44.431377f, 25.761988f, 44.502396f, 26.201853f, 44.502396f, 26.77405f);
generalPath.lineTo(44.502396f, 38.850952f);
generalPath.curveTo(44.502396f, 39.764523f, 43.7704f, 40.5f, 42.861153f, 40.5f);
generalPath.lineTo(5.1403594f, 40.5f);
generalPath.curveTo(4.2311096f, 40.5f, 3.4991138f, 39.764523f, 3.4991138f, 38.850952f);
generalPath.lineTo(3.4991138f, 26.77405f);
generalPath.curveTo(3.4991138f, 26.280031f, 3.6002798f, 25.571642f, 3.9455202f, 25.120718f);
generalPath.curveTo(4.3811665f, 24.551714f, 5.549866f, 22.57277f, 5.8581276f, 22.153118f);
generalPath.curveTo(6.1663885f, 21.733467f, 6.732446f, 21.5f, 7.130896f, 21.5f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.424621f, 21.975533f);
generalPath.curveTo(6.921893f, 21.975533f, 6.3048778f, 22.053783f, 6.0546017f, 22.46703f);
generalPath.lineTo(4.1542525f, 25.604816f);
generalPath.curveTo(3.8721285f, 26.070648f, 4.1881986f, 26.868141f, 5.087311f, 26.868141f);
generalPath.lineTo(42.730785f, 26.868141f);
generalPath.curveTo(44.040733f, 26.868141f, 43.950535f, 25.858072f, 43.663845f, 25.42804f);
generalPath.lineTo(41.896076f, 22.776388f);
generalPath.curveTo(41.575542f, 22.29559f, 41.459198f, 21.975533f, 40.65864f, 21.975533f);
generalPath.lineTo(7.424621f, 21.975533f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(251, 251, 251, 255)) : new Color(251, 251, 251, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(15.387969017028809, 32.53923797607422), new Point2D.Double(15.487822532653809, 58.83126449584961), new float[] {0.0f,0.10344828f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 32)) : new Color(255, 255, 255, 32)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.4925689697265625f, 0.0f, 0.0f, 0.66874098777771f, 0.08188071846961975f, 2.0f));
stroke = new BasicStroke(0.9469671f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.60536f, 22.445757f);
generalPath.lineTo(40.432674f, 22.445757f);
generalPath.curveTo(40.79835f, 22.445757f, 41.26559f, 22.71863f, 41.553734f, 23.131283f);
generalPath.curveTo(41.841873f, 23.543938f, 42.849964f, 25.160946f, 43.1557f, 25.60036f);
generalPath.curveTo(43.461437f, 26.039776f, 43.59127f, 26.456312f, 43.59127f, 26.998163f);
generalPath.lineTo(43.59127f, 38.279263f);
generalPath.curveTo(43.59127f, 39.144386f, 43.457546f, 39.528355f, 42.594032f, 39.528355f);
generalPath.lineTo(5.5322266f, 39.528355f);
generalPath.curveTo(4.6687107f, 39.528355f, 4.4726048f, 39.144386f, 4.4726048f, 38.279263f);
generalPath.lineTo(4.4726048f, 26.998163f);
generalPath.curveTo(4.4726048f, 26.530346f, 4.69345f, 25.859524f, 5.021325f, 25.432514f);
generalPath.curveTo(5.435059f, 24.893684f, 6.103854f, 23.461634f, 6.3966103f, 23.064238f);
generalPath.curveTo(6.6893663f, 22.666842f, 7.2269516f, 22.445757f, 7.60536f, 22.445757f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.672962f, 4.4999475f);
generalPath.lineTo(36.325115f, 4.4999475f);
generalPath.curveTo(36.97588f, 4.4999475f, 37.49978f, 5.0100775f, 37.49978f, 5.6437373f);
generalPath.lineTo(37.49978f, 24.348175f);
generalPath.lineTo(10.498298f, 24.348175f);
generalPath.lineTo(10.498298f, 5.6437373f);
generalPath.curveTo(10.498298f, 5.0100775f, 11.022197f, 4.4999475f, 11.672962f, 4.4999475f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.056711196899414, 3.6785457134246826), new Point2D.Double(24.78970718383789, 25.247310638427734), new float[] {0.0f,0.4054697f,0.5344828f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(224, 224, 224, 255)) : new Color(224, 224, 224, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(205, 205, 205, 255)) : new Color(205, 205, 205, 255)),((colorFilter != null) ? colorFilter.filter(new Color(73, 73, 73, 255)) : new Color(73, 73, 73, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9457100033760071f, 0.0f, 0.0f, 1.076032042503357f, 0.05016683042049408f, 4.095404148101807f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(137, 137, 137, 255)) : new Color(137, 137, 137, 255);
stroke = new BasicStroke(1.0000004f,1,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.672962f, 4.4999475f);
generalPath.lineTo(36.325115f, 4.4999475f);
generalPath.curveTo(36.97588f, 4.4999475f, 37.49978f, 5.0100775f, 37.49978f, 5.6437373f);
generalPath.lineTo(37.49978f, 24.348175f);
generalPath.lineTo(10.498298f, 24.348175f);
generalPath.lineTo(10.498298f, 5.6437373f);
generalPath.curveTo(10.498298f, 5.0100775f, 11.022197f, 4.4999475f, 11.672962f, 4.4999475f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
paint = new LinearGradientPaint(new Point2D.Double(20.771228790283203, 25.1402530670166), new Point2D.Double(20.71780014038086, 19.33746337890625), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0)),((colorFilter != null) ? colorFilter.filter(new Color(248, 248, 248, 255)) : new Color(248, 248, 248, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.198768973350525f, 0.0f, 0.0f, 0.853564977645874f, -0.1430860012769699f, 2.034512996673584f));
stroke = new BasicStroke(1.0000002f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(11.498513221740723, 5.499246597290039, 25.00057601928711, 18.836374282836914, 0.35355344414711, 0.35355350375175476);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
shape = new RoundRectangle2D.Double(6.875, 27.375, 33.75, 5.1875, 3.4230966567993164, 3.4230966567993164);
paint = new LinearGradientPaint(new Point2D.Double(10.33823299407959, 64.65225982666016), new Point2D.Double(10.33823299407959, 54.136138916015625), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(247, 246, 245, 255)) : new Color(247, 246, 245, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 246, 245, 0)) : new Color(247, 246, 245, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.3698439598083496f, 0.0f, 0.0f, 0.4219689965248108f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(9.731653213500977, 70.7249755859375), new Point2D.Double(9.705278396606445, 62.282466888427734), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(102, 102, 102, 255)) : new Color(102, 102, 102, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.3698439598083496f, 0.0f, 0.0f, 0.4219689965248108f, 0.0f, 2.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.875, 27.375, 33.75, 5.1875, 3.4230966567993164, 3.4230966567993164);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.871767f, 27.626486f);
generalPath.curveTo(10.873821f, 28.085733f, 10.629993f, 28.510979f, 10.232612f, 28.741198f);
generalPath.curveTo(9.83523f, 28.971416f, 9.345042f, 28.971416f, 8.94766f, 28.741198f);
generalPath.curveTo(8.550279f, 28.510979f, 8.306451f, 28.085733f, 8.308505f, 27.626486f);
generalPath.curveTo(8.306451f, 27.167238f, 8.550279f, 26.741993f, 8.94766f, 26.511774f);
generalPath.curveTo(9.345042f, 26.281555f, 9.83523f, 26.281555f, 10.232612f, 26.511774f);
generalPath.curveTo(10.629993f, 26.741993f, 10.873821f, 27.167238f, 10.871767f, 27.626486f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(9.129549026489258, 26.925594329833984), 2.1227016f, new Point2D.Double(9.129549026489258, 26.925594329833984), new float[] {0.0f,0.5f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 253, 255)) : new Color(255, 255, 253, 255)),((colorFilter != null) ? colorFilter.filter(new Color(187, 187, 185, 255)) : new Color(187, 187, 185, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.36571428f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.743718f, 25.416054f);
generalPath.lineTo(37.306217f, 25.478554f);
generalPath.curveTo(37.993717f, 25.480234f, 38.294037f, 25.107557f, 38.243717f, 24.478554f);
generalPath.lineTo(38.118717f, 22.916054f);
generalPath.lineTo(39.984837f, 22.916054f);
generalPath.curveTo(40.797337f, 22.916054f, 40.975037f, 23.108616f, 41.172337f, 23.478554f);
generalPath.lineTo(41.672337f, 24.416054f);
generalPath.curveTo(42.19913f, 25.403793f, 43.48351f, 26.390165f, 42.170494f, 26.390165f);
generalPath.curveTo(37.667786f, 26.390165f, 13.993718f, 26.041054f, 11.743718f, 25.416054f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(9.869808197021484, 57.2276496887207), new Point2D.Double(9.912813186645508, 72.06431579589844), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 60)) : new Color(0, 0, 0, 60)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7720859050750732f, 0.0f, 0.0f, 0.36073899269104004f, 0.6187180280685425f, 2.883882999420166f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.99999994f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.488808f, 26.5f);
generalPath.lineTo(4.5111804f, 26.5f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.43575415f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
// _0_0_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_0
shape = new Rectangle2D.Double(14.0, 7.0, 19.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 75)) : new Color(0, 0, 0, 75);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_1
shape = new Rectangle2D.Double(14.0, 9.0, 19.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 75)) : new Color(0, 0, 0, 75);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_2
shape = new Rectangle2D.Double(14.0, 11.0, 19.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 75)) : new Color(0, 0, 0, 75);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_3
shape = new Rectangle2D.Double(14.0, 13.0, 11.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 75)) : new Color(0, 0, 0, 75);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_4
shape = new Rectangle2D.Double(14.0, 17.0, 19.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 75)) : new Color(0, 0, 0, 75);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11_5
shape = new Rectangle2D.Double(14.0, 19.0, 19.0, 1.0);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 75)) : new Color(0, 0, 0, 75);
g.setPaint(paint);
g.fill(shape);
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
        return 2.9991135597229004;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.9999473094940186;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 42.00328063964844;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 42.55818176269531;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Printer() {
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
       Printer base = new Printer();
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
       Printer base = new Printer();
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
        return Printer::new;
    }
}

