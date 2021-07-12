package org.pushingpixels.demo.flamingo.svg.tango.transcoded;

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
public class Edit_cut implements NeonIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
generalPath.moveTo(34.174313f, 1.6249996f);
generalPath.curveTo(34.38626f, 1.6935354f, 34.59157f, 1.7696619f, 34.798294f, 1.842502f);
generalPath.curveTo(35.44971f, 4.0395036f, 38.469776f, 6.261222f, 37.321354f, 8.449133f);
generalPath.curveTo(33.49551f, 14.82952f, 29.697021f, 21.294565f, 25.89976f, 27.72527f);
generalPath.curveTo(25.154013f, 27.872171f, 24.401731f, 27.952183f, 23.647995f, 27.96996f);
generalPath.curveTo(22.061604f, 28.01017f, 20.433064f, 27.775465f, 18.927431f, 27.23589f);
generalPath.curveTo(23.978304f, 18.684616f, 29.031301f, 10.114483f, 34.174313f, 1.6249996f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(292.9716796875, 4.75927734375), new Point2D.Double(296.9397888183594, 10.711433410644531), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(238, 238, 236, 255)) : new Color(238, 238, 236, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-4.127760887145996f, 0.0f, 0.0f, 4.136600971221924f, 1244.4649658203125f, -11.904950141906738f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 138, 133, 255)) : new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(34.174313f, 1.6249996f);
generalPath.curveTo(34.38626f, 1.6935354f, 34.59157f, 1.7696619f, 34.798294f, 1.842502f);
generalPath.curveTo(35.44971f, 4.0395036f, 38.469776f, 6.261222f, 37.321354f, 8.449133f);
generalPath.curveTo(33.49551f, 14.82952f, 29.697021f, 21.294565f, 25.89976f, 27.72527f);
generalPath.curveTo(25.154013f, 27.872171f, 24.401731f, 27.952183f, 23.647995f, 27.96996f);
generalPath.curveTo(22.061604f, 28.01017f, 20.433064f, 27.775465f, 18.927431f, 27.23589f);
generalPath.curveTo(23.978304f, 18.684616f, 29.031301f, 10.114483f, 34.174313f, 1.6249996f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(34.288822f, 4.25f);
generalPath.curveTo(34.0577f, 4.5574527f, 33.839207f, 5.120942f, 33.602795f, 5.40625f);
generalPath.curveTo(29.555939f, 12.158979f, 25.440784f, 18.90033f, 21.378977f, 25.625f);
generalPath.curveTo(21.318424f, 25.878117f, 20.565046f, 26.637291f, 21.366936f, 26.567963f);
generalPath.curveTo(22.478493f, 26.765842f, 23.638681f, 26.918568f, 24.746761f, 26.625f);
generalPath.curveTo(28.505753f, 20.407795f, 32.19264f, 14.142582f, 35.943047f, 7.923178f);
generalPath.curveTo(36.28552f, 7.5359044f, 36.35216f, 6.99792f, 35.9924f, 6.611197f);
generalPath.curveTo(35.462387f, 5.794589f, 34.925465f, 4.936482f, 34.382374f, 4.15625f);
generalPath.lineTo(34.311813f, 4.2269607f);
generalPath.lineTo(34.288822f, 4.25f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(20.28802490234375, 6.460364818572998), new Point2D.Double(24.325969696044922, 23.942537307739258), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(226, 226, 226, 255)) : new Color(226, 226, 226, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 216, 216, 255)) : new Color(216, 216, 216, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(3.637892961502075f, 0.0f, 0.0f, 3.4703750610351562f, -1056.115966796875f, -16.007240295410156f));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(297.04443f, 12.300293f);
generalPath.lineTo(296.3994f, 13.384766f);
generalPath.lineTo(295.1328f, 14.71875f);
generalPath.lineTo(294.73242f, 13.672852f);
generalPath.lineTo(295.74658f, 11.960449f);
generalPath.lineTo(297.04443f, 12.300293f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(294.594970703125, 12.187602996826172), new Point2D.Double(297.1851501464844, 13.339599609375), new float[] {0.0f,1.0E-9f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 53, 53, 255)) : new Color(239, 53, 53, 255)),((colorFilter != null) ? colorFilter.filter(new Color(201, 26, 26, 255)) : new Color(201, 26, 26, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 76, 76, 255)) : new Color(255, 76, 76, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0103000402450562f, 1.0079690004374643E-18f, -0.15980100631713867f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(154, 12, 0, 255)) : new Color(154, 12, 0, 255);
stroke = new BasicStroke(0.28144068f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(297.04443f, 12.300293f);
generalPath.lineTo(296.3994f, 13.384766f);
generalPath.lineTo(295.1328f, 14.71875f);
generalPath.lineTo(294.73242f, 13.672852f);
generalPath.lineTo(295.74658f, 11.960449f);
generalPath.lineTo(297.04443f, 12.300293f);
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
generalPath.moveTo(20.40625f, 26.96875f);
generalPath.curveTo(19.183905f, 27.455467f, 19.192232f, 29.00393f, 18.481272f, 29.932762f);
generalPath.curveTo(18.138948f, 30.648558f, 17.537483f, 31.27899f, 17.28125f, 32.03125f);
generalPath.curveTo(17.27157f, 32.546642f, 17.729202f, 33.391476f, 18.3125f, 32.9375f);
generalPath.curveTo(19.697475f, 31.791172f, 20.876865f, 30.39882f, 21.756725f, 28.810629f);
generalPath.curveTo(21.989088f, 28.320597f, 22.552477f, 27.916466f, 22.625f, 27.40625f);
generalPath.curveTo(22.086432f, 26.835442f, 21.112183f, 26.873224f, 20.40625f, 26.96875f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(296.4861145019531, 15.506916046142578), new Point2D.Double(296.529052734375, 9.876952171325684), new float[] {0.0f,1.0E-9f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 53, 53, 255)) : new Color(239, 53, 53, 255)),((colorFilter != null) ? colorFilter.filter(new Color(201, 26, 26, 255)) : new Color(201, 26, 26, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 76, 76, 255)) : new Color(255, 76, 76, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.637892961502075f, 0.0f, 0.0f, 3.4703750610351562f, -1056.115966796875f, -16.007240295410156f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(12.960099f, 1.6249996f);
generalPath.curveTo(12.751966f, 1.6935354f, 12.550355f, 1.7696619f, 12.347353f, 1.842502f);
generalPath.curveTo(11.707669f, 4.0395036f, 8.741988f, 6.261222f, 9.86973f, 8.449133f);
generalPath.curveTo(13.626677f, 14.82952f, 17.35676f, 21.294565f, 21.08564f, 27.72527f);
generalPath.curveTo(21.817957f, 27.872171f, 22.55669f, 27.952183f, 23.296852f, 27.96996f);
generalPath.curveTo(24.854677f, 28.01017f, 26.45389f, 27.775465f, 27.932407f, 27.23589f);
generalPath.curveTo(22.972492f, 18.684616f, 18.010492f, 10.114483f, 12.960099f, 1.6249996f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(292.9716796875, 4.75927734375), new Point2D.Double(296.9397888183594, 10.711433410644531), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(238, 238, 236, 255)) : new Color(238, 238, 236, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(4.053427219390869f, 0.0f, 0.0f, 4.136600971221924f, -1175.5350341796875f, -11.904950141906738f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 138, 133, 255)) : new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(12.960099f, 1.6249996f);
generalPath.curveTo(12.751966f, 1.6935354f, 12.550355f, 1.7696619f, 12.347353f, 1.842502f);
generalPath.curveTo(11.707669f, 4.0395036f, 8.741988f, 6.261222f, 9.86973f, 8.449133f);
generalPath.curveTo(13.626677f, 14.82952f, 17.35676f, 21.294565f, 21.08564f, 27.72527f);
generalPath.curveTo(21.817957f, 27.872171f, 22.55669f, 27.952183f, 23.296852f, 27.96996f);
generalPath.curveTo(24.854677f, 28.01017f, 26.45389f, 27.775465f, 27.932407f, 27.23589f);
generalPath.curveTo(22.972492f, 18.684616f, 18.010492f, 10.114483f, 12.960099f, 1.6249996f);
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
generalPath.moveTo(12.719667f, 4.25f);
generalPath.curveTo(12.336632f, 5.3766794f, 11.270006f, 6.2059646f, 11.004855f, 7.40625f);
generalPath.curveTo(14.713376f, 13.800362f, 18.475798f, 20.175379f, 22.181757f, 26.5625f);
generalPath.curveTo(23.380123f, 26.820799f, 24.610197f, 26.655657f, 25.795113f, 26.40625f);
generalPath.curveTo(25.606339f, 25.665808f, 25.056911f, 25.07532f, 24.76513f, 24.3767f);
generalPath.curveTo(20.870525f, 17.806173f, 16.94143f, 11.242872f, 13.087127f, 4.65625f);
generalPath.curveTo(13.072466f, 4.50464f, 12.870425f, 4.1721153f, 12.719667f, 4.25f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(20.28802490234375, 6.460364818572998), new Point2D.Double(24.325969696044922, 23.942537307739258), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(226, 226, 226, 255)) : new Color(226, 226, 226, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 216, 216, 255)) : new Color(216, 216, 216, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9798930287361145f, 0.0f, 0.0f, 1.0f, 0.311383992433548f, 0.17404299974441528f));
// _0_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(24.190449f, 23.843431f);
generalPath.curveTo(24.192022f, 24.195501f, 24.0051f, 24.521502f, 23.700459f, 24.697992f);
generalPath.curveTo(23.395819f, 24.874483f, 23.02003f, 24.874483f, 22.71539f, 24.697992f);
generalPath.curveTo(22.410748f, 24.521502f, 22.223825f, 24.195501f, 22.225399f, 23.843431f);
generalPath.curveTo(22.223825f, 23.491362f, 22.410748f, 23.165361f, 22.71539f, 22.98887f);
generalPath.curveTo(23.02003f, 22.81238f, 23.395819f, 22.81238f, 23.700459f, 22.98887f);
generalPath.curveTo(24.0051f, 23.165361f, 24.192022f, 23.491362f, 24.190449f, 23.843431f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(22.225399017333984, 23.84343147277832), new Point2D.Double(24.190448760986328, 22.86090660095215), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(186, 189, 182, 255)) : new Color(186, 189, 182, 255)),((colorFilter != null) ? colorFilter.filter(new Color(238, 238, 236, 255)) : new Color(238, 238, 236, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.700394f, 30.286934f);
generalPath.curveTo(20.935404f, 32.013584f, 21.19623f, 36.899853f, 18.278337f, 41.201286f);
generalPath.curveTo(15.360479f, 45.50525f, 10.373849f, 47.596474f, 7.1373806f, 45.87742f);
generalPath.curveTo(3.9008825f, 44.15077f, 3.6415462f, 39.267033f, 6.5594354f, 34.965595f);
generalPath.curveTo(9.475807f, 30.664165f, 14.463925f, 28.572945f, 17.700394f, 30.286934f);
generalPath.closePath();
generalPath.moveTo(15.845268f, 33.02908f);
generalPath.curveTo(14.408745f, 32.26545f, 11.33781f, 33.5696f, 9.378926f, 36.463108f);
generalPath.curveTo(7.4160166f, 39.356613f, 7.5560293f, 42.376625f, 8.991202f, 43.13795f);
generalPath.curveTo(10.426348f, 43.90618f, 13.499985f, 42.59743f, 15.458868f, 39.703926f);
generalPath.curveTo(17.42313f, 36.81042f, 17.281765f, 33.79271f, 15.845268f, 33.02908f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(7.184844970703125, 31.056621551513672), new Point2D.Double(25.15223503112793, 50.77488708496094), new float[] {0.0f,1.0E-9f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 53, 53, 255)) : new Color(239, 53, 53, 255)),((colorFilter != null) ? colorFilter.filter(new Color(201, 26, 26, 255)) : new Color(201, 26, 26, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 76, 76, 255)) : new Color(255, 76, 76, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.161877989768982f, 0.0f, 0.0f, 0.9924970269203186f, -2.430778980255127f, 0.26576098799705505f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(164, 0, 0, 255)) : new Color(164, 0, 0, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.700394f, 30.286934f);
generalPath.curveTo(20.935404f, 32.013584f, 21.19623f, 36.899853f, 18.278337f, 41.201286f);
generalPath.curveTo(15.360479f, 45.50525f, 10.373849f, 47.596474f, 7.1373806f, 45.87742f);
generalPath.curveTo(3.9008825f, 44.15077f, 3.6415462f, 39.267033f, 6.5594354f, 34.965595f);
generalPath.curveTo(9.475807f, 30.664165f, 14.463925f, 28.572945f, 17.700394f, 30.286934f);
generalPath.closePath();
generalPath.moveTo(15.845268f, 33.02908f);
generalPath.curveTo(14.408745f, 32.26545f, 11.33781f, 33.5696f, 9.378926f, 36.463108f);
generalPath.curveTo(7.4160166f, 39.356613f, 7.5560293f, 42.376625f, 8.991202f, 43.13795f);
generalPath.curveTo(10.426348f, 43.90618f, 13.499985f, 42.59743f, 15.458868f, 39.703926f);
generalPath.curveTo(17.42313f, 36.81042f, 17.281765f, 33.79271f, 15.845268f, 33.02908f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.3255f, 30.583288f);
generalPath.curveTo(12.400369f, 30.97051f, 10.691041f, 32.037308f, 9.278593f, 33.06453f);
generalPath.curveTo(8.52683f, 33.759434f, 8.035029f, 34.514454f, 7.362945f, 35.31874f);
generalPath.curveTo(5.654618f, 37.670807f, 4.938707f, 40.76217f, 6.290107f, 43.38841f);
generalPath.curveTo(6.90956f, 44.841515f, 8.932742f, 45.435852f, 10.658323f, 45.067543f);
generalPath.curveTo(12.110236f, 44.819077f, 13.339639f, 43.90647f, 14.470735f, 43.268642f);
generalPath.curveTo(15.391637f, 42.47786f, 16.02475f, 41.64213f, 16.803625f, 40.677364f);
generalPath.curveTo(18.612986f, 38.20296f, 19.595537f, 34.928688f, 18.101604f, 32.16508f);
generalPath.curveTo(17.377897f, 31.022951f, 15.866963f, 30.41829f, 14.3255f, 30.583288f);
generalPath.closePath();
generalPath.moveTo(14.797513f, 31.54477f);
generalPath.curveTo(16.814016f, 31.795124f, 18.154488f, 33.577583f, 17.92006f, 35.266636f);
generalPath.curveTo(17.940832f, 37.553574f, 16.774038f, 39.710728f, 15.196909f, 41.500755f);
generalPath.curveTo(13.779705f, 42.902737f, 11.848294f, 44.229027f, 9.532754f, 44.137077f);
generalPath.curveTo(8.1739f, 44.13421f, 7.100179f, 43.224777f, 6.716933f, 42.176617f);
generalPath.curveTo(6.1002936f, 39.644695f, 6.9116497f, 36.91139f, 8.683129f, 34.83862f);
generalPath.curveTo(10.041367f, 33.315308f, 11.877976f, 31.95152f, 14.150642f, 31.596926f);
generalPath.curveTo(14.366331f, 31.581652f, 14.581522f, 31.554432f, 14.797513f, 31.54477f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.825360298156738, 40.06875228881836), new Point2D.Double(7.670061111450195, 2.3262276649475098), new float[] {0.0f,1.0E-9f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 53, 53, 255)) : new Color(239, 53, 53, 255)),((colorFilter != null) ? colorFilter.filter(new Color(201, 26, 26, 255)) : new Color(201, 26, 26, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 76, 76, 255)) : new Color(255, 76, 76, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.161877989768982f, 0.0f, 0.0f, 0.9924970269203186f, -2.6669669151306152f, 0.06400521844625473f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.331764f, 30.286934f);
generalPath.curveTo(27.096752f, 32.013584f, 26.83593f, 36.899853f, 29.75382f, 41.201286f);
generalPath.curveTo(32.67168f, 45.50525f, 37.65831f, 47.596474f, 40.894775f, 45.87742f);
generalPath.curveTo(44.131275f, 44.15077f, 44.39061f, 39.267033f, 41.47272f, 34.965595f);
generalPath.curveTo(38.55635f, 30.664165f, 33.568233f, 28.572945f, 30.331764f, 30.286934f);
generalPath.closePath();
generalPath.moveTo(32.18689f, 33.02908f);
generalPath.curveTo(33.623413f, 32.26545f, 36.694347f, 33.5696f, 38.653233f, 36.463108f);
generalPath.curveTo(40.616142f, 39.356613f, 40.476128f, 42.376625f, 39.040955f, 43.13795f);
generalPath.curveTo(37.60581f, 43.90618f, 34.532173f, 42.59743f, 32.57329f, 39.703926f);
generalPath.curveTo(30.609028f, 36.81042f, 30.750393f, 33.79271f, 32.18689f, 33.02908f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(34.37609100341797, 37.50008010864258), 8.388787f, new Point2D.Double(34.37609100341797, 37.50008010864258), new float[] {0.0f,1.0E-9f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 53, 53, 255)) : new Color(239, 53, 53, 255)),((colorFilter != null) ? colorFilter.filter(new Color(201, 26, 26, 255)) : new Color(201, 26, 26, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 76, 76, 255)) : new Color(255, 76, 76, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0603810548782349f, 0.0f, -2.299514055252075f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(164, 0, 0, 255)) : new Color(164, 0, 0, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.331764f, 30.286934f);
generalPath.curveTo(27.096752f, 32.013584f, 26.83593f, 36.899853f, 29.75382f, 41.201286f);
generalPath.curveTo(32.67168f, 45.50525f, 37.65831f, 47.596474f, 40.894775f, 45.87742f);
generalPath.curveTo(44.131275f, 44.15077f, 44.39061f, 39.267033f, 41.47272f, 34.965595f);
generalPath.curveTo(38.55635f, 30.664165f, 33.568233f, 28.572945f, 30.331764f, 30.286934f);
generalPath.closePath();
generalPath.moveTo(32.18689f, 33.02908f);
generalPath.curveTo(33.623413f, 32.26545f, 36.694347f, 33.5696f, 38.653233f, 36.463108f);
generalPath.curveTo(40.616142f, 39.356613f, 40.476128f, 42.376625f, 39.040955f, 43.13795f);
generalPath.curveTo(37.60581f, 43.90618f, 34.532173f, 42.59743f, 32.57329f, 39.703926f);
generalPath.curveTo(30.609028f, 36.81042f, 30.750393f, 33.79271f, 32.18689f, 33.02908f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(3.6244380474090576f, 0.0f, 0.0f, 3.6244380474090576f, -1053.178955078125f, -16.847200393676758f));
// _0_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(296.95605f, 12.300293f);
generalPath.lineTo(297.6001f, 13.384766f);
generalPath.lineTo(298.8672f, 14.71875f);
generalPath.lineTo(299.26807f, 13.672852f);
generalPath.lineTo(298.2539f, 11.960449f);
generalPath.lineTo(296.95605f, 12.300293f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(298.478515625, 13.599584579467773), new Point2D.Double(298.8694763183594, 13.802948951721191), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(223, 42, 42, 255)) : new Color(223, 42, 42, 255)),((colorFilter != null) ? colorFilter.filter(new Color(223, 42, 42, 0)) : new Color(223, 42, 42, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(298.478515625, 13.599584579467773), new Point2D.Double(298.8694763183594, 13.802948951721191), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(154, 12, 0, 255)) : new Color(154, 12, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 12, 0, 0)) : new Color(154, 12, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.2759049f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(296.95605f, 12.300293f);
generalPath.lineTo(297.6001f, 13.384766f);
generalPath.lineTo(298.8672f, 14.71875f);
generalPath.lineTo(299.26807f, 13.672852f);
generalPath.lineTo(298.2539f, 11.960449f);
generalPath.lineTo(296.95605f, 12.300293f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.15625f, 27.9375f);
generalPath.curveTo(25.729502f, 28.13632f, 25.139437f, 28.13898f, 24.8125f, 28.4375f);
generalPath.curveTo(25.76252f, 29.838888f, 26.702412f, 31.352161f, 27.66338f, 32.650078f);
generalPath.curveTo(28.331932f, 33.40462f, 29.019194f, 34.150303f, 29.78125f, 34.8125f);
generalPath.curveTo(30.516527f, 33.421078f, 29.91641f, 31.751291f, 28.96875f, 30.625f);
generalPath.curveTo(28.366215f, 29.725307f, 28.138927f, 28.512037f, 27.125f, 28.03125f);
generalPath.curveTo(26.820951f, 27.91284f, 26.474384f, 27.853373f, 26.15625f, 27.9375f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(296.7619934082031, 12.012225151062012), new Point2D.Double(297.7982177734375, 10.946586608886719), new float[] {0.0f,1.0E-9f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 53, 53, 255)) : new Color(239, 53, 53, 255)),((colorFilter != null) ? colorFilter.filter(new Color(201, 26, 26, 255)) : new Color(201, 26, 26, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 76, 76, 255)) : new Color(255, 76, 76, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.6244380474090576f, 0.0f, 0.0f, 3.6244380474090576f, -1053.178955078125f, -16.847200393676758f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.280087f, 30.449093f);
generalPath.curveTo(30.759703f, 30.678844f, 29.385141f, 31.534748f, 29.039639f, 32.837055f);
generalPath.curveTo(27.908495f, 35.23251f, 28.824762f, 37.95057f, 30.319418f, 40.063908f);
generalPath.curveTo(31.421345f, 41.40911f, 32.259487f, 42.99382f, 33.959f, 43.83788f);
generalPath.curveTo(35.429653f, 44.7615f, 37.300144f, 45.72845f, 39.17664f, 45.138767f);
generalPath.curveTo(40.689957f, 44.70532f, 41.547314f, 43.4582f, 41.85681f, 42.166912f);
generalPath.curveTo(42.461243f, 39.85688f, 41.561115f, 37.49095f, 40.149845f, 35.53043f);
generalPath.curveTo(39.491173f, 34.616722f, 38.81686f, 33.64722f, 38.03653f, 32.83578f);
generalPath.curveTo(36.84197f, 31.93233f, 35.398613f, 31.184254f, 33.94769f, 30.603432f);
generalPath.curveTo(33.41359f, 30.49302f, 32.832462f, 30.37069f, 32.280087f, 30.449093f);
generalPath.closePath();
generalPath.moveTo(32.715794f, 31.658699f);
generalPath.curveTo(34.473095f, 31.591923f, 35.950306f, 32.398155f, 37.092163f, 33.427666f);
generalPath.curveTo(38.12446f, 34.396793f, 39.113815f, 35.23287f, 39.754673f, 36.42654f);
generalPath.curveTo(40.831856f, 38.24711f, 41.142532f, 40.4065f, 40.594776f, 42.39007f);
generalPath.curveTo(40.0664f, 43.714584f, 38.36862f, 44.36211f, 36.803658f, 44.00652f);
generalPath.curveTo(34.821777f, 43.77769f, 33.586315f, 42.335503f, 32.277092f, 41.19816f);
generalPath.curveTo(30.771343f, 39.76677f, 29.83647f, 37.719532f, 29.76651f, 35.715782f);
generalPath.curveTo(29.780622f, 34.698112f, 29.740042f, 33.53736f, 30.464653f, 32.682213f);
generalPath.curveTo(30.876926f, 32.13906f, 31.84466f, 31.627886f, 32.715794f, 31.658699f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(39.61994171142578, 44.540931701660156), new Point2D.Double(-3.532515048980713, -11.889041900634766), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 53, 53, 255)) : new Color(239, 53, 53, 255)),((colorFilter != null) ? colorFilter.filter(new Color(164, 0, 0, 0)) : new Color(164, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.161877989768982f, 0.0f, 0.0f, 0.9924970269203186f, -5.1121110916137695f, 0.06400521844625473f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.26704544f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.2560549974441528f, 0.0f, 0.0f, 0.8191490173339844f, -7.199394226074219f, 9.090420722961426f));
// _0_0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.25f, 41.625f);
generalPath.curveTo(43.278946f, 43.730194f, 39.842598f, 45.679516f, 34.24215f, 46.73484f);
generalPath.curveTo(28.6417f, 47.790165f, 21.7333f, 47.790165f, 16.13285f, 46.73484f);
generalPath.curveTo(10.532403f, 45.679516f, 7.0960546f, 43.730194f, 7.125f, 41.625f);
generalPath.curveTo(7.0960546f, 39.519806f, 10.532403f, 37.570484f, 16.13285f, 36.51516f);
generalPath.curveTo(21.7333f, 35.459835f, 28.6417f, 35.459835f, 34.24215f, 36.51516f);
generalPath.curveTo(39.842598f, 37.570484f, 43.278946f, 39.519806f, 43.25f, 41.625f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(25.1875, 41.625), 18.0625f, new Point2D.Double(25.1875, 41.625), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.3252600133419037f, 2.0296259374972723E-16f, 28.086069107055664f));
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
        return 1.713640570640564;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 1.0767812728881836;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 45.44770050048828;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 46.9232177734375;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Edit_cut() {
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
       Edit_cut base = new Edit_cut();
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
       Edit_cut base = new Edit_cut();
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
        return Edit_cut::new;
    }
}

