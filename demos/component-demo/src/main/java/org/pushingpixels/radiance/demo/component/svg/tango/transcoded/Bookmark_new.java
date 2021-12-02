package org.pushingpixels.radiance.demo.component.svg.tango.transcoded;

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
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class Bookmark_new implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.7836257f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071080207824707f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.128307f, 42.07798f);
generalPath.curveTo(40.15366f, 43.693268f, 37.143654f, 45.188953f, 32.23805f, 45.998688f);
generalPath.curveTo(27.332438f, 46.808426f, 21.28115f, 46.808426f, 16.375542f, 45.998688f);
generalPath.curveTo(11.469933f, 45.188953f, 8.459927f, 43.693268f, 8.485281f, 42.07798f);
generalPath.curveTo(8.459927f, 40.462692f, 11.469933f, 38.967007f, 16.375542f, 38.157272f);
generalPath.curveTo(21.28115f, 37.347534f, 27.332438f, 37.347534f, 32.23805f, 38.157272f);
generalPath.curveTo(37.143654f, 38.967007f, 40.15366f, 40.462692f, 40.128307f, 42.07798f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.306795120239258, 42.077980041503906), 15.821514f, new Point2D.Double(24.306795120239258, 42.077980041503906), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.2849160134792328f, 0.0f, 30.089279174804688f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0
shape = new RoundRectangle2D.Double(6.5, 3.5, 34.875, 41.06343078613281, 2.2980971336364746, 2.298096179962158);
paint = new RadialGradientPaint(new Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, new Point2D.Double(33.966678619384766, 35.736915588378906), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(250, 250, 250, 255)) : new Color(250, 250, 250, 255)),((colorFilter != null) ? colorFilter.filter(new Color(187, 187, 187, 255)) : new Color(187, 187, 187, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.044769048690796f, -0.10355299711227417f, -0.15918299555778503f));
g.setPaint(paint);
g.fill(shape);
paint = new RadialGradientPaint(new Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, new Point2D.Double(8.824419021606445, 3.7561285495758057), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(163, 163, 163, 255)) : new Color(163, 163, 163, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 76, 76, 255)) : new Color(76, 76, 76, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0363739728927612f, 3.25f, 0.4895220100879669f));
stroke = new BasicStroke(0.9999998f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.5, 3.5, 34.875, 41.06343078613281, 2.2980971336364746, 2.298096179962158);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_1
paint = new RadialGradientPaint(new Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, new Point2D.Double(8.143556594848633, 7.26789665222168), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(248, 248, 248, 255)) : new Color(248, 248, 248, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9730330109596252f, 0.0f, 0.0f, 1.0349370241165161f, 3.1687541007995605f, 0.5552769899368286f));
stroke = new BasicStroke(0.9999996f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(7.502455234527588, 4.501048564910889, 32.93701171875, 39.0282096862793, 0.29809704422950745, 0.29809698462486267);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_2
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 4)) : new Color(0, 0, 0, 4);
stroke = new BasicStroke(0.9885531f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.505723f, 5.4942765f);
generalPath.lineTo(11.505723f, 43.400867f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_3
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 52)) : new Color(255, 255, 255, 52);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(12.5f, 5.0205154f);
generalPath.lineTo(12.5f, 43.038227f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_0
shape = new RoundRectangle2D.Double(15.999994277954102, 9.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_1
shape = new RoundRectangle2D.Double(15.999994277954102, 11.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_2
shape = new RoundRectangle2D.Double(15.999994277954102, 13.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_3
shape = new RoundRectangle2D.Double(15.999994277954102, 15.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_4
shape = new RoundRectangle2D.Double(15.999994277954102, 17.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_5
shape = new RoundRectangle2D.Double(15.999994277954102, 19.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_6
shape = new RoundRectangle2D.Double(15.999994277954102, 21.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_7
shape = new RoundRectangle2D.Double(15.999994277954102, 23.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_8
shape = new RoundRectangle2D.Double(15.999985694885254, 25.0, 9.000005722045898, 1.0, 0.12400771677494049, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_9
shape = new RoundRectangle2D.Double(15.999985694885254, 29.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_10
shape = new RoundRectangle2D.Double(15.999985694885254, 31.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_11
shape = new RoundRectangle2D.Double(15.999985694885254, 33.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_12
shape = new RoundRectangle2D.Double(15.999985694885254, 35.0, 20.0000057220459, 1.0, 0.27557262778282166, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0_13
shape = new RoundRectangle2D.Double(15.999985694885254, 37.0, 14.000014305114746, 1.0, 0.19290097057819366, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.28021976f * origAlpha));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.245857f, 31.324905f);
generalPath.lineTo(21.14787f, 27.133701f);
generalPath.lineTo(14.30757f, 30.8838f);
generalPath.lineTo(13.761859f, 3.9475667f);
generalPath.lineTo(28.549599f, 3.9475667f);
generalPath.lineTo(28.245857f, 31.324905f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(19.452348709106445, 13.174174308776855), new Point2D.Double(19.685436248779297, 27.095338821411133), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2242549657821655f, 0.0f, 0.0f, 1.2821760177612305f, 0.3715690076351166f, 0.26465699076652527f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(12.427339f, 3.5180202f);
generalPath.curveTo(12.427339f, 3.5180202f, 12.240033f, 0.6052061f, 15.107867f, 0.5427061f);
generalPath.lineTo(25.119343f, 0.50728625f);
generalPath.curveTo(26.277287f, 0.50728625f, 26.581888f, 1.1910177f, 26.581888f, 2.1095588f);
generalPath.lineTo(26.581888f, 29.729916f);
generalPath.lineTo(20.545425f, 24.533861f);
generalPath.lineTo(14.674346f, 29.729916f);
generalPath.lineTo(14.591655f, 3.519629f);
generalPath.lineTo(12.427339f, 3.5180202f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.431310653686523, 19.119474411010742), new Point2D.Double(18.4024715423584, 4.270232677459717), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(133, 157, 188, 255)) : new Color(133, 157, 188, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 114, 153, 255)) : new Color(84, 114, 153, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.3195489645004272f, 0.0f, 0.0f, 1.2990130186080933f, -3.1061999797821045f, -1.336164951324463f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(54, 72, 120, 255)) : new Color(54, 72, 120, 255);
stroke = new BasicStroke(0.9999999f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(12.427339f, 3.5180202f);
generalPath.curveTo(12.427339f, 3.5180202f, 12.240033f, 0.6052061f, 15.107867f, 0.5427061f);
generalPath.lineTo(25.119343f, 0.50728625f);
generalPath.curveTo(26.277287f, 0.50728625f, 26.581888f, 1.1910177f, 26.581888f, 2.1095588f);
generalPath.lineTo(26.581888f, 29.729916f);
generalPath.lineTo(20.545425f, 24.533861f);
generalPath.lineTo(14.674346f, 29.729916f);
generalPath.lineTo(14.591655f, 3.519629f);
generalPath.lineTo(12.427339f, 3.5180202f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.4450549f * origAlpha));
// _0_2_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.030252f, 3.011792f);
generalPath.curveTo(13.011046f, 2.225362f, 13.312918f, 1.0801307f, 15.375418f, 1.0176307f);
generalPath.lineTo(25.027906f, 1.0f);
generalPath.curveTo(25.640923f, 1.0f, 26.090153f, 1.167432f, 26.090153f, 1.7994802f);
generalPath.lineTo(26.060993f, 10.491851f);
generalPath.lineTo(15.317102f, 10.491851f);
generalPath.lineTo(15.192102f, 2.999325f);
generalPath.curveTo(15.192102f, 2.999325f, 13.030252f, 3.011792f, 13.030252f, 3.011792f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(16.8125, 1.875), new Point2D.Double(16.8125, 4.71875), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.3195489645004272f, 0.0f, 0.0f, 1.3620599508285522f, 40.38853073120117f, -0.36205700039863586f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.28021976f * origAlpha));
// _0_2_4
shape = new RoundRectangle2D.Double(15.317100524902344, 6.6907958984375, 10.556391716003418, 12.803556442260742, 0.12400771677494049, 0.13078175485134125);
paint = new LinearGradientPaint(new Point2D.Double(19.0, 9.773824691772461), new Point2D.Double(19.0, 15.63559627532959), new float[] {0.0f,0.5f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 145)) : new Color(0, 0, 0, 145)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.3195489645004272f, 0.0f, 0.0f, 2.1339259147644043f, -4.476132869720459f, -14.648449897766113f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_5
paint = new LinearGradientPaint(new Point2D.Double(19.97037696838379, 6.116710662841797), new Point2D.Double(19.97037696838379, 2.53125), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 49)) : new Color(255, 255, 255, 49)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.3195489645004272f, 0.0f, 0.0f, 1.2803560495376587f, -5.745297908782959f, 0.24900700151920319f));
stroke = new BasicStroke(1.0000001f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(24.476831f, 2.2095506f);
generalPath.lineTo(25.575535f, 3.113139f);
generalPath.lineTo(25.547445f, 27.511911f);
generalPath.lineTo(20.497463f, 23.203758f);
generalPath.lineTo(15.704084f, 27.415203f);
generalPath.lineTo(15.699081f, 2.7495618f);
generalPath.lineTo(24.476831f, 2.2095506f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.6111270189285278f, 0.0f, 0.0f, 0.6111270189285278f, 5.6324381828308105f, -67.28175354003906f));
// _0_2_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(69.375f, 125.0f);
generalPath.curveTo(69.39803f, 130.151f, 66.66322f, 134.92062f, 62.206123f, 137.50279f);
generalPath.curveTo(57.74902f, 140.08498f, 52.25098f, 140.08498f, 47.793877f, 137.50279f);
generalPath.curveTo(43.336773f, 134.92062f, 40.601963f, 130.151f, 40.625f, 125.0f);
generalPath.curveTo(40.601963f, 119.84899f, 43.336773f, 115.07938f, 47.793877f, 112.4972f);
generalPath.curveTo(52.25098f, 109.91502f, 57.74902f, 109.91502f, 62.206123f, 112.4972f);
generalPath.curveTo(66.66322f, 115.07938f, 69.39803f, 119.84899f, 69.375f, 125.0f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(55.0, 125.0), 14.375f, new Point2D.Double(55.0, 125.0), new float[] {0.0f,0.5f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 245, 32, 227)) : new Color(255, 245, 32, 227)),((colorFilter != null) ? colorFilter.filter(new Color(255, 243, 0, 0)) : new Color(255, 243, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.48295456f * origAlpha));
// _0_2_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.158602f, 3.9384084f);
generalPath.lineTo(15.114407f, 1.0335178f);
generalPath.curveTo(12.983906f, 1.0335178f, 12.993087f, 2.9680774f, 12.993087f, 3.9384084f);
generalPath.lineTo(15.158602f, 3.9384084f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.354310989379883, 1.4866424798965454), new Point2D.Double(14.075843811035156, 2.4017651081085205), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.1848160028457642f, 0.0f, -0.7278800010681152f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.35795456f * origAlpha));
// _0_2_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.158602f, 3.9384086f);
generalPath.lineTo(15.114407f, 1.8247592f);
generalPath.curveTo(12.81631f, 1.8426926f, 12.993087f, 3.9384086f, 12.993087f, 3.9384086f);
generalPath.lineTo(15.158602f, 3.9384086f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(14.584076881408691, 1.6392649412155151), new Point2D.Double(14.552827835083008, 2.4912447929382324), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.5942139625549316f, 0.0f, -0.7902489900588989f));
g.setPaint(paint);
g.fill(shape);

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
        return 6.0;
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
		return 42.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 47.515533447265625;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Bookmark_new() {
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
       Bookmark_new base = new Bookmark_new();
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
       Bookmark_new base = new Bookmark_new();
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
        return Bookmark_new::new;
    }
}

