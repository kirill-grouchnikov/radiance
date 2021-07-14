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
public class Preferences_desktop_assistive_technology implements NeonIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.4064171f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(2.4600489139556885f, 0.0f, 0.0f, 2.4600489139556885f, -49.40945816040039f, -67.96373748779297f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.769554f, 44.565483f);
generalPath.curveTo(36.780075f, 45.361816f, 35.53091f, 46.099186f, 33.495064f, 46.498383f);
generalPath.curveTo(31.459217f, 46.89758f, 28.947906f, 46.89758f, 26.91206f, 46.498383f);
generalPath.curveTo(24.876213f, 46.099186f, 23.627047f, 45.361816f, 23.63757f, 44.565483f);
generalPath.curveTo(23.627047f, 43.76915f, 24.876213f, 43.03178f, 26.91206f, 42.632584f);
generalPath.curveTo(28.947906f, 42.233387f, 31.459217f, 42.233387f, 33.495064f, 42.632584f);
generalPath.curveTo(35.53091f, 43.03178f, 36.780075f, 43.76915f, 36.769554f, 44.565483f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(30.203561782836914, 44.56548309326172), 6.5659914f, new Point2D.Double(30.203561782836914, 44.56548309326172), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.3384619951248169f, -1.4354759471951642E-15f, 29.481779098510742f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355);
paint = new RadialGradientPaint(new Point2D.Double(25.457862854003906, 35.59623336791992), 20.530962f, new Point2D.Double(25.457862854003906, 35.59623336791992), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(156, 188, 222, 255)) : new Color(156, 188, 222, 255)),((colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 255)) : new Color(32, 74, 135, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.1281850337982178f, -1.7271729602086339E-9f, 2.422814131750186E-16f, 2.128253936767578f, -29.019060134887695f, -39.917789459228516f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(52, 101, 164, 255)) : new Color(52, 101, 164, 255);
stroke = new BasicStroke(1.0f,0,2,10.0f,null,0.0f);
shape = new RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(2.0000021f,0,2,10.0f,null,0.0f);
shape = new RoundRectangle2D.Double(5.8954033851623535, 5.004019737243652, 37.10063552856445, 37.10063552856445, 7.81350040435791, 7.81350040435791);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.5521910190582275f, -0.6401000022888184f));
// _0_0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.7692310214042664f, 0.0f, 0.0f, 0.7692310214042664f, 6.846158027648926f, 4.576913833618164f));
// _0_0_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.444443941116333f, 0.0f, 0.0f, 1.444443941116333f, -7.841267108917236f, -5.8095221519470215f));
// _0_0_3_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.857141f, 13.071428f);
generalPath.curveTo(20.862293f, 14.2232065f, 20.250782f, 15.289703f, 19.254162f, 15.8670845f);
generalPath.curveTo(18.257544f, 16.444466f, 17.02817f, 16.444466f, 16.03155f, 15.8670845f);
generalPath.curveTo(15.03493f, 15.289703f, 14.42342f, 14.2232065f, 14.428571f, 13.071428f);
generalPath.curveTo(14.42342f, 11.91965f, 15.03493f, 10.853153f, 16.03155f, 10.275772f);
generalPath.curveTo(17.02817f, 9.698391f, 18.257544f, 9.698391f, 19.254162f, 10.275772f);
generalPath.curveTo(20.250782f, 10.853153f, 20.862293f, 11.91965f, 20.857141f, 13.071428f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_0_1
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(2.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.571428f, 13.142857f);
generalPath.lineTo(20.0f, 30.0f);
generalPath.lineTo(32.0f, 27.428572f);
generalPath.lineTo(34.42857f, 37.0f);
generalPath.lineTo(38.0f, 36.0f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.374998f, 21.668259f);
generalPath.curveTo(14.821727f, 23.078575f, 13.0f, 25.694616f, 13.0f, 28.80768f);
generalPath.curveTo(13.0f, 33.36178f, 16.715132f, 37.076912f, 21.26923f, 37.076912f);
generalPath.curveTo(25.584839f, 37.076912f, 29.03297f, 33.705624f, 29.39423f, 29.480759f);
generalPath.lineTo(27.399036f, 29.937489f);
generalPath.curveTo(26.85153f, 32.888084f, 24.382202f, 35.153835f, 21.26923f, 35.153835f);
generalPath.curveTo(17.755636f, 35.153835f, 14.923077f, 32.321274f, 14.923077f, 28.80768f);
generalPath.curveTo(14.923077f, 26.611685f, 16.12003f, 24.778076f, 17.807692f, 23.639412f);
generalPath.lineTo(17.374998f, 21.668259f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.9230775f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.857143f, 20.857143f);
generalPath.lineTo(31.714287f, 20.0f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.6082140207290649f, 0.0f, 0.0f, 0.6082140207290649f, 20.155799865722656f, 19.565080642700195f));
// _0_0_5
g.setComposite(AlphaComposite.getInstance(3, 0.40909088f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.8838850259780884f, 2.4748740196228027f));
// _0_0_5_0
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
paint = new RadialGradientPaint(new Point2D.Double(25.45584487915039, 39.161163330078125), 19.622213f, new Point2D.Double(25.45584487915039, 39.161163330078125), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.31531500816345215f, 6.894484305295864E-14f, 26.81304931640625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5_1
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
paint = new LinearGradientPaint(new Point2D.Double(14.462891578674316, 12.284523963928223), new Point2D.Double(34.53434753417969, 39.684913635253906), new float[] {0.0f,0.25f,0.5f,0.75f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(201, 201, 201, 255)) : new Color(201, 201, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(248, 248, 248, 255)) : new Color(248, 248, 248, 255)),((colorFilter != null) ? colorFilter.filter(new Color(226, 226, 226, 255)) : new Color(226, 226, 226, 255)),((colorFilter != null) ? colorFilter.filter(new Color(176, 176, 176, 255)) : new Color(176, 176, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(201, 201, 201, 255)) : new Color(201, 201, 201, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.2419350147247314f, 0.0f, 0.0f, 1.2419350147247314f, -5.027507781982422f, -7.208988189697266f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(128, 128, 128, 255)) : new Color(128, 128, 128, 255);
stroke = new BasicStroke(1.6441573f,0,0,4.0f,null,0.0f);
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
g.transform(new AffineTransform(0.6684309840202332f, 0.0f, 0.0f, 0.6684309840202332f, 8.69454574584961f, 6.464436054229736f));
// _0_0_5_2
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(2.4597247f,0,0,4.0f,null,0.0f);
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
// _0_0_5_3
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.644156f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.66343f, 2.8294024f);
generalPath.lineTo(21.834734f, 8.282713f);
generalPath.curveTo(20.257912f, 8.641812f, 17.357416f, 9.740083f, 16.022846f, 10.568205f);
generalPath.lineTo(11.614124f, 7.2775526f);
generalPath.curveTo(10.441019f, 8.188315f, 10.36057f, 8.250079f, 9.42251f, 9.40051f);
generalPath.lineTo(12.610179f, 14.128108f);
generalPath.curveTo(11.6954f, 15.526075f, 10.596635f, 18.017319f, 10.202127f, 19.797586f);
generalPath.curveTo(10.202127f, 19.797586f, 4.61633f, 20.73919f, 4.61633f, 20.73919f);
generalPath.curveTo(4.5203147f, 21.523417f, 4.566459f, 23.201902f, 4.631081f, 23.84773f);
generalPath.lineTo(9.966658f, 24.80891f);
generalPath.curveTo(10.340164f, 26.632656f, 11.7379f, 29.568249f, 12.727915f, 31.07189f);
generalPath.lineTo(9.353855f, 35.52969f);
generalPath.curveTo(10.248374f, 36.640198f, 10.427401f, 36.741817f, 11.540642f, 37.63307f);
generalPath.lineTo(16.052347f, 34.327667f);
generalPath.curveTo(17.597954f, 35.313633f, 20.66584f, 36.51303f, 22.536043f, 36.853455f);
generalPath.lineTo(23.276506f, 42.23811f);
generalPath.curveTo(23.865746f, 42.291744f, 25.493572f, 42.4422f, 26.316393f, 42.336266f);
generalPath.lineTo(27.145086f, 36.730892f);
generalPath.curveTo(28.920776f, 36.288998f, 31.988947f, 35.02955f, 33.437565f, 33.999138f);
generalPath.lineTo(37.944447f, 37.255463f);
generalPath.curveTo(39.04833f, 36.316303f, 39.05822f, 36.17479f, 39.93009f, 35.01477f);
generalPath.lineTo(36.59036f, 30.267595f);
generalPath.curveTo(37.428738f, 28.819675f, 38.51277f, 25.987974f, 38.807198f, 24.279242f);
generalPath.lineTo(44.275257f, 23.371965f);
generalPath.curveTo(44.321068f, 22.826805f, 44.3233f, 21.306536f, 44.187027f, 20.376335f);
generalPath.lineTo(38.61598f, 19.415154f);
generalPath.curveTo(38.200092f, 17.879461f, 36.77285f, 15.112168f, 35.908627f, 13.823982f);
generalPath.lineTo(39.4495f, 9.366181f);
generalPath.curveTo(38.481354f, 8.182182f, 38.12138f, 8.019728f, 36.904682f, 7.091162f);
generalPath.lineTo(32.240913f, 10.430893f);
generalPath.curveTo(30.946007f, 9.66506f, 28.363857f, 8.497611f, 26.850887f, 8.164979f);
generalPath.lineTo(26.027018f, 2.8294024f);
generalPath.curveTo(25.272272f, 2.7406204f, 23.094751f, 2.7800448f, 22.66343f, 2.8294024f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
        return 3.9147281646728516;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.0233452320098877;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 44.08527374267578;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 44.976654052734375;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Preferences_desktop_assistive_technology() {
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
    public static NeonIcon of(int width, int height) {
       Preferences_desktop_assistive_technology base = new Preferences_desktop_assistive_technology();
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
       Preferences_desktop_assistive_technology base = new Preferences_desktop_assistive_technology();
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
        return Preferences_desktop_assistive_technology::new;
    }
}

