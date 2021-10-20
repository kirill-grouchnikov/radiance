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
public class Applications_multimedia implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.74372f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -0.8571400046348572f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(46.714f, 44.286f);
generalPath.curveTo(46.74937f, 45.92411f, 42.55032f, 47.440933f, 35.706844f, 48.26211f);
generalPath.curveTo(28.863367f, 49.083286f, 20.421633f, 49.083286f, 13.578157f, 48.26211f);
generalPath.curveTo(6.734681f, 47.440933f, 2.5356293f, 45.92411f, 2.5709991f, 44.286f);
generalPath.curveTo(2.5356293f, 42.64789f, 6.734681f, 41.131065f, 13.578157f, 40.309887f);
generalPath.curveTo(20.421633f, 39.488712f, 28.863367f, 39.488712f, 35.706844f, 40.309887f);
generalPath.curveTo(42.55032f, 41.131065f, 46.74937f, 42.64789f, 46.714f, 44.286f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.64299964904785, 44.2859992980957), 22.071f, new Point2D.Double(24.64299964904785, 44.2859992980957), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.20712000131607056f, 0.0f, 35.112998962402344f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new RoundRectangle2D.Double(5.428599834442139, 16.570999145507812, 38.143001556396484, 28.0, 2.285799980163574, 2.285799980163574);
paint = new RadialGradientPaint(new Point2D.Double(27.215999603271484, 35.67300033569336), 19.571f, new Point2D.Double(27.215999603271484, 35.67300033569336), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(93, 93, 93, 255)) : new Color(93, 93, 93, 255)),((colorFilter != null) ? colorFilter.filter(new Color(68, 68, 68, 255)) : new Color(68, 68, 68, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.8831000328063965f, 5.542399773829683E-23f, 8.493700076394464E-23f, 2.135999917984009f, -64.96800231933594f, -52.486000061035156f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(27, 27, 27, 255)) : new Color(27, 27, 27, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(5.428599834442139, 16.570999145507812, 38.143001556396484, 28.0, 2.285799980163574, 2.285799980163574);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.31156f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(5.463500022888184, 13.142999649047852), new Point2D.Double(21.535999298095703, 49.143001556396484), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.392099857330322, 17.48900032043457, 36.073001861572266, 26.059999465942383, 0.5474399924278259, 0.5474399924278259);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.9727100133895874f, 0.23202000558376312f, 0.23202000558376312f, 0.9727100133895874f, 45.7859992980957f, 5.110599994659424f));
// _0_0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.974405387304794f, -0.22479800086164994f, 0.22479800086164994f, 0.974405387304794f, 0.0f, 0.0f));
// _0_0_3_0
shape = new RoundRectangle2D.Double(1.705199956893921, 10.352999687194824, 39.805999755859375, 6.508800029754639, 2.285799980163574, 2.285799980163574);
paint = new LinearGradientPaint(new Point2D.Double(2.761199951171875, 6.110300064086914), new Point2D.Double(18.773000717163086, 18.69300079345703), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(253, 253, 253, 255)) : new Color(253, 253, 253, 255)),((colorFilter != null) ? colorFilter.filter(new Color(212, 212, 212, 255)) : new Color(212, 212, 212, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(43, 43, 43, 255)) : new Color(43, 43, 43, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(1.705199956893921, 10.352999687194824, 39.805999755859375, 6.508800029754639, 2.285799980163574, 2.285799980163574);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(9.1896f, 8.9692f);
generalPath.lineTo(6.7611f, 15.541f);
generalPath.lineTo(11.475f, 14.255f);
generalPath.lineTo(13.904f, 7.9692f);
generalPath.lineTo(9.1896f, 8.9692f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.332f, 6.8978f);
generalPath.lineTo(16.047f, 13.398f);
generalPath.lineTo(20.761002f, 12.255f);
generalPath.lineTo(23.047f, 5.8978f);
generalPath.lineTo(18.332f, 6.8978f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(27.904f, 4.6835f);
generalPath.lineTo(25.618f, 11.1119995f);
generalPath.lineTo(30.332f, 9.969199f);
generalPath.lineTo(32.618f, 3.6834993f);
generalPath.lineTo(27.904f, 4.6834993f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.413f, 2.0183f);
generalPath.curveTo(39.642f, 2.1743f, 39.814f, 2.3819f, 39.882f, 2.6745f);
generalPath.lineTo(40.614f, 5.7504f);
generalPath.lineTo(39.891f, 7.7504f);
generalPath.lineTo(35.203f, 8.8353f);
generalPath.lineTo(37.483997f, 2.4781003f);
generalPath.lineTo(39.413f, 2.0183003f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.974405387304794f, -0.22479800086164994f, 0.22479800086164994f, 0.974405387304794f, 0.0f, 0.0f));
// _0_0_3_5
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 147)) : new Color(255, 255, 255, 147);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(2.6717000007629395, 11.32699966430664, 37.84299850463867, 4.606900215148926, 0.5301200151443481, 0.5301200151443481);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.974405387304794f, -0.22479800086164994f, 0.22479800086164994f, 0.974405387304794f, 0.0f, 0.0f));
// _0_0_4
shape = new RoundRectangle2D.Double(0.6704300045967102, 9.685199737548828, 40.07699966430664, 6.9415998458862305, 2.285799980163574, 2.285799980163574);
paint = new LinearGradientPaint(new Point2D.Double(2.761199951171875, 6.110300064086914), new Point2D.Double(18.773000717163086, 18.69300079345703), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(253, 253, 253, 255)) : new Color(253, 253, 253, 255)),((colorFilter != null) ? colorFilter.filter(new Color(212, 212, 212, 255)) : new Color(212, 212, 212, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.5996699929237366f, -0.5781700015068054f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(46, 46, 46, 255)) : new Color(46, 46, 46, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(0.6704300045967102, 9.685199737548828, 40.07699966430664, 6.9415998458862305, 2.285799980163574, 2.285799980163574);
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
generalPath.moveTo(10.143f, 8.1429f);
generalPath.lineTo(7.7142997f, 14.714001f);
generalPath.lineTo(12.429f, 13.429001f);
generalPath.lineTo(14.857f, 7.142901f);
generalPath.lineTo(10.143f, 8.1429f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.429f, 5.7857f);
generalPath.lineTo(16.786001f, 12.785999f);
generalPath.lineTo(21.500002f, 11.643f);
generalPath.lineTo(24.143002f, 4.7857f);
generalPath.lineTo(19.429f, 5.7857f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
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
generalPath.moveTo(29.071f, 3.6429f);
generalPath.lineTo(26.5f, 10.785999f);
generalPath.lineTo(31.214f, 9.6428995f);
generalPath.lineTo(33.786f, 2.6428995f);
generalPath.lineTo(29.071f, 3.6428995f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(41.295f, 0.97768f);
generalPath.curveTo(41.524f, 1.1337f, 41.696f, 1.3413f, 41.762997f, 1.6339f);
generalPath.lineTo(42.423996f, 4.2813f);
generalPath.lineTo(41.343994f, 7.0670004f);
generalPath.lineTo(36.227993f, 8.2946005f);
generalPath.lineTo(38.579994f, 1.5804005f);
generalPath.lineTo(41.294994f, 0.97768044f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.974405387304794f, -0.22479800086164994f, 0.22479800086164994f, 0.974405387304794f, 0.0f, 0.0f));
// _0_0_9
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 147)) : new Color(255, 255, 255, 147);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(1.6368999481201172, 10.659000396728516, 38.19900131225586, 4.914700031280518, 0.5301200151443481, 0.5301200151443481);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.5357f, 10.893f);
generalPath.lineTo(6.5357f, 18.678999f);
generalPath.curveTo(6.5357f, 19.143f, 6.9286f, 19.571f, 7.3929f, 19.606998f);
generalPath.lineTo(15.285999f, 19.606998f);
generalPath.curveTo(16.149f, 19.606998f, 16.56f, 18.345f, 15.893f, 17.678999f);
generalPath.lineTo(9.6786f, 10.393f);
generalPath.curveTo(8.7143f, 9.0f, 6.5357003f, 9.678599f, 6.5357003f, 10.893f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(10.678999900817871, 15.928999900817871), new Point2D.Double(7.928599834442139, 11.107000350952148), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(147, 147, 147, 255)) : new Color(147, 147, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(217, 217, 217, 255)) : new Color(217, 217, 217, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(27, 27, 27, 255)) : new Color(27, 27, 27, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.5357f, 10.893f);
generalPath.lineTo(6.5357f, 18.678999f);
generalPath.curveTo(6.5357f, 19.143f, 6.9286f, 19.571f, 7.3929f, 19.606998f);
generalPath.lineTo(15.285999f, 19.606998f);
generalPath.curveTo(16.149f, 19.606998f, 16.56f, 18.345f, 15.893f, 17.678999f);
generalPath.lineTo(9.6786f, 10.393f);
generalPath.curveTo(8.7143f, 9.0f, 6.5357003f, 9.678599f, 6.5357003f, 10.893f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.07142899930477142f, -4.964300155639648f));
// _0_0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.0357f, 17.196f);
generalPath.curveTo(9.036472f, 17.368769f, 8.944744f, 17.528746f, 8.795249f, 17.615355f);
generalPath.curveTo(8.645754f, 17.701962f, 8.461346f, 17.701962f, 8.311851f, 17.615355f);
generalPath.curveTo(8.162355f, 17.528746f, 8.070627f, 17.368769f, 8.0714f, 17.196f);
generalPath.curveTo(8.070627f, 17.02323f, 8.162355f, 16.863253f, 8.311851f, 16.776644f);
generalPath.curveTo(8.461346f, 16.690037f, 8.645754f, 16.690037f, 8.795249f, 16.776644f);
generalPath.curveTo(8.944744f, 16.863253f, 9.036472f, 17.02323f, 9.0357f, 17.196f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.07142899930477142f, 0.3214299976825714f));
// _0_0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.0357f, 17.196f);
generalPath.curveTo(9.036472f, 17.368769f, 8.944744f, 17.528746f, 8.795249f, 17.615355f);
generalPath.curveTo(8.645754f, 17.701962f, 8.461346f, 17.701962f, 8.311851f, 17.615355f);
generalPath.curveTo(8.162355f, 17.528746f, 8.070627f, 17.368769f, 8.0714f, 17.196f);
generalPath.curveTo(8.070627f, 17.02323f, 8.162355f, 16.863253f, 8.311851f, 16.776644f);
generalPath.curveTo(8.461346f, 16.690037f, 8.645754f, 16.690037f, 8.795249f, 16.776644f);
generalPath.curveTo(8.944744f, 16.863253f, 9.036472f, 17.02323f, 9.0357f, 17.196f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.964300155639648f, 0.3214299976825714f));
// _0_0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.0357f, 17.196f);
generalPath.curveTo(9.036472f, 17.368769f, 8.944744f, 17.528746f, 8.795249f, 17.615355f);
generalPath.curveTo(8.645754f, 17.701962f, 8.461346f, 17.701962f, 8.311851f, 17.615355f);
generalPath.curveTo(8.162355f, 17.528746f, 8.070627f, 17.368769f, 8.0714f, 17.196f);
generalPath.curveTo(8.070627f, 17.02323f, 8.162355f, 16.863253f, 8.311851f, 16.776644f);
generalPath.curveTo(8.461346f, 16.690037f, 8.645754f, 16.690037f, 8.795249f, 16.776644f);
generalPath.curveTo(8.944744f, 16.863253f, 9.036472f, 17.02323f, 9.0357f, 17.196f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.26131f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
// _0_0_14
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_0
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.0f, 28.429f);
generalPath.lineTo(38.0f, 28.429f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_1
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.0f, 32.571f);
generalPath.lineTo(38.0f, 32.571f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_2
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.5f, 28.0f);
generalPath.lineTo(32.5f, 24.0f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_3
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.0f, 32.571f);
generalPath.lineTo(38.0f, 32.571f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_4
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.5f, 28.0f);
generalPath.lineTo(22.5f, 24.0f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_5
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.7429f, 36.571f);
generalPath.lineTo(23.0429f, 36.571f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.6880599856376648f, 0.0f, 0.0f, 0.6880599856376648f, 11.982000350952148f, 14.732999801635742f));
// _0_0_15
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.817f, 27.839f);
generalPath.curveTo(13.931001f, 28.804f, 14.062f, 29.766f, 14.212001f, 30.727001f);
generalPath.lineTo(12.104001f, 31.842001f);
generalPath.curveTo(11.971001f, 30.899f, 11.860001f, 29.949001f, 11.653001f, 29.018002f);
generalPath.lineTo(13.817001f, 27.839f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.665f, 28.673f);
generalPath.curveTo(17.641f, 30.752f, 18.343f, 29.866001f, 15.754001f, 31.262001f);
generalPath.curveTo(16.57f, 29.959002f, 17.946001f, 28.644001f, 19.303001f, 29.817001f);
generalPath.curveTo(21.894001f, 30.239002f, 17.869001f, 32.299f, 19.658f, 30.132002f);
generalPath.curveTo(22.258001f, 27.862001f, 21.880001f, 29.134003f, 24.062f, 29.263002f);
generalPath.curveTo(25.842001f, 29.693003f, 25.858f, 29.319002f, 23.492f, 30.680002f);
generalPath.lineTo(23.588001f, 30.596003f);
generalPath.lineTo(25.827002f, 29.649002f);
generalPath.curveTo(25.801003f, 29.688002f, 25.776001f, 29.726002f, 25.751001f, 29.765001f);
generalPath.curveTo(22.939001f, 31.443f, 24.082f, 30.949001f, 22.104002f, 30.691002f);
generalPath.curveTo(20.237001f, 30.364002f, 19.228003f, 30.138002f, 21.883001f, 29.207003f);
generalPath.curveTo(20.743002f, 30.501003f, 18.901001f, 32.507004f, 17.264002f, 31.090002f);
generalPath.curveTo(15.676002f, 29.919003f, 19.397001f, 28.676003f, 18.029001f, 30.359001f);
generalPath.curveTo(15.346001f, 31.837002f, 15.628001f, 31.910002f, 15.468001f, 29.793001f);
generalPath.lineTo(17.665f, 28.673f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.175f, 26.231f);
generalPath.curveTo(29.321f, 27.739f, 29.401f, 29.25f, 29.58f, 30.755001f);
generalPath.curveTo(31.004f, 32.606003f, 27.753f, 35.389f, 28.233f, 32.564003f);
generalPath.curveTo(28.575f, 29.320004f, 28.883f, 28.720003f, 31.762f, 27.684002f);
generalPath.curveTo(32.309f, 28.668001f, 32.608997f, 29.822002f, 33.466f, 30.412003f);
generalPath.curveTo(28.626f, 32.964005f, 35.159f, 28.931004f, 35.887f, 28.545002f);
generalPath.curveTo(36.352f, 28.436003f, 36.826f, 28.380001f, 37.299f, 28.314001f);
generalPath.lineTo(35.378f, 29.752f);
generalPath.curveTo(34.913f, 29.820002f, 34.442997f, 29.87f, 33.993f, 30.013f);
generalPath.curveTo(36.992f, 28.101f, 33.425f, 30.855f, 31.487f, 31.83f);
generalPath.curveTo(30.563f, 31.105999f, 30.344f, 29.936f, 29.703999f, 28.95f);
generalPath.curveTo(32.85f, 26.731f, 30.336998f, 28.809f, 30.342f, 31.527f);
generalPath.curveTo(30.057999f, 33.877f, 27.022f, 35.077f, 27.526999f, 31.834f);
generalPath.curveTo(27.353998f, 30.352f, 27.276999f, 28.851f, 26.996998f, 27.386f);
generalPath.lineTo(29.174997f, 26.230999f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0140000581741333f, 0.0f, 0.0f, 1.0140000581741333f, 1.878600001335144f, 5.469099998474121f));
// _0_0_16
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.316f, 22.374f);
generalPath.curveTo(13.137f, 21.041f, 12.443f, 22.093f, 12.445f, 23.521f);
generalPath.curveTo(12.429999f, 24.807f, 12.620999f, 26.078f, 12.907f, 27.327f);
generalPath.lineTo(11.643999f, 28.01f);
generalPath.curveTo(11.356999f, 26.75f, 11.164999f, 25.469f, 11.168999f, 24.173f);
generalPath.curveTo(11.148998f, 22.62f, 10.879999f, 22.220001f, 12.515999f, 21.502f);
generalPath.lineTo(11.315999f, 22.374f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.611f, 22.413f);
generalPath.curveTo(15.587f, 23.203001f, 15.587f, 23.994f, 15.584f, 24.785f);
generalPath.curveTo(15.582999f, 25.117f, 15.582999f, 25.449f, 15.582999f, 25.781f);
generalPath.lineTo(14.317999f, 26.425f);
generalPath.curveTo(14.317999f, 26.094f, 14.317999f, 25.762f, 14.3169985f, 25.431f);
generalPath.curveTo(14.313998f, 24.649f, 14.313998f, 23.868f, 14.289998f, 23.086f);
generalPath.lineTo(15.610998f, 22.413f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.833f, 21.201f);
generalPath.curveTo(17.932001f, 21.997f, 17.95f, 22.856f, 17.978f, 23.674f);
generalPath.curveTo(17.986f, 23.914999f, 17.992f, 24.156f, 17.998001f, 24.397f);
generalPath.lineTo(16.741001f, 25.043f);
generalPath.curveTo(16.733002f, 24.803f, 16.727001f, 24.561998f, 16.717001f, 24.321999f);
generalPath.curveTo(16.681002f, 23.506998f, 16.675001f, 22.673998f, 16.512001f, 21.873999f);
generalPath.lineTo(17.833f, 21.200998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.258f, 20.595f);
generalPath.curveTo(20.060999f, 21.276999f, 19.989f, 21.991f, 19.92f, 22.699f);
generalPath.curveTo(19.853f, 23.46f, 19.822f, 24.223f, 19.791f, 24.987f);
generalPath.lineTo(18.534f, 25.621f);
generalPath.curveTo(18.564001f, 24.858f, 18.594f, 24.095001f, 18.65f, 23.332f);
generalPath.curveTo(18.705f, 22.644001f, 18.733f, 21.927f, 18.935999f, 21.268002f);
generalPath.lineTo(20.258f, 20.595001f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.8969f, 22.31f);
generalPath.curveTo(10.804f, 22.501f, 11.724f, 22.659f, 12.639f, 22.814f);
generalPath.curveTo(14.789f, 23.146f, 16.946f, 23.441f, 19.107f, 23.688f);
generalPath.curveTo(20.011f, 23.779999f, 20.914f, 23.878f, 21.817001f, 23.984f);
generalPath.lineTo(20.649002f, 24.810999f);
generalPath.curveTo(19.755003f, 24.699999f, 18.860003f, 24.596998f, 17.964003f, 24.498999f);
generalPath.curveTo(15.802003f, 24.237999f, 13.6430025f, 23.943998f, 11.489002f, 23.620998f);
generalPath.curveTo(10.561003f, 23.471998f, 9.627102f, 23.289999f, 8.697103f, 23.182f);
generalPath.lineTo(9.896902f, 22.31f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
        return 2.230882406234741;
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
		return 44.518489837646484;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 48.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Applications_multimedia() {
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
       Applications_multimedia base = new Applications_multimedia();
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
       Applications_multimedia base = new Applications_multimedia();
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
        return Applications_multimedia::new;
    }
}

