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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class Applications_internet implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.2431999444961548f, 0.0f, -10.272000312805176f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.053f, 38.909f);
generalPath.curveTo(45.085377f, 41.58756f, 41.241802f, 44.06779f, 34.977673f, 45.41054f);
generalPath.curveTo(28.713545f, 46.753292f, 20.98646f, 46.753292f, 14.722331f, 45.41054f);
generalPath.curveTo(8.458201f, 44.06779f, 4.614628f, 41.58756f, 4.647003f, 38.909f);
generalPath.curveTo(4.614628f, 36.230442f, 8.458201f, 33.75021f, 14.722331f, 32.40746f);
generalPath.curveTo(20.98646f, 31.064709f, 28.713545f, 31.064709f, 34.977673f, 32.40746f);
generalPath.curveTo(41.241802f, 33.75021f, 45.085377f, 36.230442f, 45.053f, 38.909f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(15.116000175476074, 63.96500015258789), 12.289f, new Point2D.Double(15.116000175476074, 63.96500015258789), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.6440000534057617f, 0.0f, 0.0f, 0.6082800030708313f, 0.0f, 0.0f));
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
generalPath.moveTo(43.96f, 23.485f);
generalPath.curveTo(43.96f, 34.195f, 35.278f, 42.877f, 24.57f, 42.877f);
generalPath.curveTo(13.86f, 42.877f, 5.178999f, 34.195f, 5.178999f, 23.484999f);
generalPath.curveTo(5.178699f, 12.775999f, 13.859999f, 4.0949993f, 24.57f, 4.0949993f);
generalPath.curveTo(35.278f, 4.095199f, 43.96f, 12.775999f, 43.96f, 23.484999f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.24799919128418, 15.715999603271484), 29.993f, new Point2D.Double(18.24799919128418, 15.715999603271484), new float[] {0.0f,0.15517f,0.75f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(211, 233, 255, 255)) : new Color(211, 233, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 233, 255, 255)) : new Color(211, 233, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(64, 116, 174, 255)) : new Color(64, 116, 174, 255)),((colorFilter != null) ? colorFilter.filter(new Color(54, 72, 108, 255)) : new Color(54, 72, 108, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9999899864196777f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(57, 57, 108, 255)) : new Color(57, 57, 108, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.96f, 23.485f);
generalPath.curveTo(43.96f, 34.195f, 35.278f, 42.877f, 24.57f, 42.877f);
generalPath.curveTo(13.86f, 42.877f, 5.178999f, 34.195f, 5.178999f, 23.484999f);
generalPath.curveTo(5.178699f, 12.775999f, 13.859999f, 4.0949993f, 24.57f, 4.0949993f);
generalPath.curveTo(35.278f, 4.095199f, 43.96f, 12.775999f, 43.96f, 23.484999f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9823700189590454f, 0.0f, 0.0f, 0.9823700189590454f, 0.12108000367879868f, 0.23291000723838806f));
// _0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.071f, 20.714f);
generalPath.lineTo(44.071f, 20.714f);
generalPath.lineTo(43.526f, 21.332f);
generalPath.curveTo(43.192f, 20.938002f, 42.817f, 20.607f, 42.437f, 20.261002f);
generalPath.lineTo(41.601f, 20.384f);
generalPath.lineTo(40.837f, 19.521f);
generalPath.lineTo(40.837f, 20.589f);
generalPath.lineTo(41.491f, 21.084002f);
generalPath.lineTo(41.927002f, 21.578001f);
generalPath.lineTo(42.509003f, 20.920002f);
generalPath.curveTo(42.655003f, 21.194002f, 42.800003f, 21.468002f, 42.945004f, 21.743002f);
generalPath.lineTo(42.945004f, 22.565002f);
generalPath.lineTo(42.290005f, 23.305002f);
generalPath.lineTo(41.091003f, 24.128002f);
generalPath.lineTo(40.183002f, 25.035002f);
generalPath.lineTo(39.601f, 24.374002f);
generalPath.lineTo(39.892002f, 23.634003f);
generalPath.lineTo(39.31f, 22.976002f);
generalPath.lineTo(38.329002f, 20.878002f);
generalPath.lineTo(37.493004f, 19.933002f);
generalPath.lineTo(37.274002f, 20.179003f);
generalPath.lineTo(37.602f, 21.373003f);
generalPath.lineTo(38.22f, 22.072002f);
generalPath.curveTo(38.572002f, 23.089003f, 38.921f, 24.062002f, 39.384003f, 25.035002f);
generalPath.curveTo(40.102f, 25.035002f, 40.778004f, 24.958002f, 41.491f, 24.869001f);
generalPath.lineTo(41.491f, 25.445002f);
generalPath.lineTo(40.619f, 27.584002f);
generalPath.lineTo(39.819f, 28.488f);
generalPath.lineTo(39.165f, 29.889f);
generalPath.lineTo(39.165f, 32.192f);
generalPath.lineTo(39.384003f, 33.098f);
generalPath.lineTo(39.020004f, 33.508f);
generalPath.lineTo(38.220005f, 34.002f);
generalPath.lineTo(37.384007f, 34.701f);
generalPath.lineTo(38.075005f, 35.483f);
generalPath.lineTo(37.130005f, 36.307003f);
generalPath.lineTo(37.312004f, 36.840004f);
generalPath.lineTo(35.894005f, 38.446003f);
generalPath.lineTo(34.949005f, 38.446003f);
generalPath.lineTo(34.149006f, 38.940002f);
generalPath.lineTo(33.640007f, 38.940002f);
generalPath.lineTo(33.640007f, 38.281002f);
generalPath.lineTo(33.423008f, 36.963f);
generalPath.curveTo(33.14201f, 36.137f, 32.849007f, 35.316f, 32.551006f, 34.496002f);
generalPath.curveTo(32.551006f, 33.891003f, 32.587006f, 33.291f, 32.623005f, 32.686f);
generalPath.lineTo(32.987003f, 31.863f);
generalPath.lineTo(32.478004f, 30.875f);
generalPath.lineTo(32.515003f, 29.518f);
generalPath.lineTo(31.823004f, 28.736f);
generalPath.lineTo(32.169003f, 27.606f);
generalPath.lineTo(31.606003f, 26.967001f);
generalPath.lineTo(30.624002f, 26.967001f);
generalPath.lineTo(30.297003f, 26.597f);
generalPath.lineTo(29.316002f, 27.215f);
generalPath.lineTo(28.916002f, 26.761f);
generalPath.lineTo(28.007002f, 27.543f);
generalPath.curveTo(27.390001f, 26.842999f, 26.772001f, 26.144f, 26.153002f, 25.445f);
generalPath.lineTo(25.427002f, 23.716f);
generalPath.lineTo(26.081001f, 22.73f);
generalPath.lineTo(25.718f, 22.319f);
generalPath.lineTo(26.517f, 20.425f);
generalPath.curveTo(27.173f, 19.609f, 27.858f, 18.826f, 28.552f, 18.039999f);
generalPath.lineTo(29.788f, 17.710999f);
generalPath.lineTo(31.169f, 17.545998f);
generalPath.lineTo(32.114002f, 17.793997f);
generalPath.lineTo(33.459003f, 19.149998f);
generalPath.lineTo(33.932003f, 18.615997f);
generalPath.lineTo(34.585003f, 18.533997f);
generalPath.lineTo(35.821003f, 18.944996f);
generalPath.lineTo(36.767002f, 18.944996f);
generalPath.lineTo(37.421f, 18.368996f);
generalPath.lineTo(37.712f, 17.957996f);
generalPath.lineTo(37.057003f, 17.545996f);
generalPath.lineTo(35.966003f, 17.463995f);
generalPath.curveTo(35.663002f, 17.044994f, 35.382004f, 16.602995f, 35.022003f, 16.229996f);
generalPath.lineTo(34.658005f, 16.393995f);
generalPath.lineTo(34.513004f, 17.463995f);
generalPath.lineTo(33.858006f, 16.723995f);
generalPath.lineTo(33.714005f, 15.899995f);
generalPath.lineTo(32.987003f, 15.3259945f);
generalPath.lineTo(32.695004f, 15.3259945f);
generalPath.lineTo(33.423004f, 16.147995f);
generalPath.lineTo(33.132004f, 16.887995f);
generalPath.lineTo(32.551003f, 17.051994f);
generalPath.lineTo(32.914f, 16.311995f);
generalPath.lineTo(32.259003f, 15.9839945f);
generalPath.lineTo(31.678003f, 15.3259945f);
generalPath.lineTo(30.587004f, 15.571995f);
generalPath.lineTo(30.442003f, 15.899995f);
generalPath.lineTo(29.788004f, 16.311995f);
generalPath.lineTo(29.425003f, 17.217995f);
generalPath.lineTo(28.516003f, 17.669994f);
generalPath.lineTo(28.116003f, 17.217995f);
generalPath.lineTo(27.680002f, 17.217995f);
generalPath.lineTo(27.680002f, 15.735994f);
generalPath.lineTo(28.626001f, 15.241994f);
generalPath.lineTo(29.352001f, 15.241994f);
generalPath.lineTo(29.206001f, 14.666994f);
generalPath.lineTo(28.626001f, 14.090994f);
generalPath.lineTo(29.606f, 13.884994f);
generalPath.lineTo(30.151001f, 13.267994f);
generalPath.lineTo(30.587002f, 12.526994f);
generalPath.lineTo(31.388002f, 12.526994f);
generalPath.lineTo(31.169003f, 11.951994f);
generalPath.lineTo(31.678003f, 11.622993f);
generalPath.lineTo(31.678003f, 12.280993f);
generalPath.lineTo(32.768f, 12.526994f);
generalPath.lineTo(33.858f, 11.622993f);
generalPath.lineTo(33.931004f, 11.210994f);
generalPath.lineTo(34.876003f, 10.552994f);
generalPath.curveTo(34.534004f, 10.595994f, 34.192f, 10.626994f, 33.858f, 10.717994f);
generalPath.lineTo(33.858f, 9.976594f);
generalPath.lineTo(34.221f, 9.153794f);
generalPath.lineTo(33.858f, 9.153794f);
generalPath.lineTo(33.06f, 9.893994f);
generalPath.lineTo(32.841f, 10.305994f);
generalPath.lineTo(33.06f, 10.881994f);
generalPath.lineTo(32.695f, 11.868994f);
generalPath.lineTo(32.114f, 11.539993f);
generalPath.lineTo(31.605999f, 10.963993f);
generalPath.lineTo(30.806f, 11.539993f);
generalPath.lineTo(30.515f, 10.223993f);
generalPath.lineTo(31.896f, 9.318793f);
generalPath.lineTo(31.896f, 8.824694f);
generalPath.lineTo(32.768f, 8.248994f);
generalPath.lineTo(34.149002f, 7.919394f);
generalPath.lineTo(35.095f, 8.248994f);
generalPath.lineTo(36.839f, 8.578094f);
generalPath.lineTo(36.403f, 9.071294f);
generalPath.lineTo(35.458f, 9.071294f);
generalPath.lineTo(36.403f, 10.058994f);
generalPath.lineTo(37.13f, 9.236294f);
generalPath.lineTo(37.351f, 8.874494f);
generalPath.curveTo(37.351f, 8.874494f, 40.138f, 11.371994f, 41.730003f, 14.104994f);
generalPath.curveTo(43.323f, 16.837994f, 44.071003f, 20.059994f, 44.071003f, 20.713993f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 182)) : new Color(32, 74, 135, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.07f, 9.2363f);
generalPath.lineTo(25.997f, 9.729501f);
generalPath.lineTo(26.507f, 10.059001f);
generalPath.lineTo(27.378f, 9.482901f);
generalPath.lineTo(26.942f, 8.989201f);
generalPath.lineTo(26.359999f, 9.318801f);
generalPath.lineTo(26.069998f, 9.2363f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 182)) : new Color(32, 74, 135, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.87f, 5.8633f);
generalPath.lineTo(24.980001f, 5.1225996f);
generalPath.lineTo(22.800001f, 5.3691998f);
generalPath.lineTo(20.109001f, 6.1094f);
generalPath.lineTo(19.601002f, 6.6035f);
generalPath.lineTo(21.272001f, 7.7549f);
generalPath.lineTo(21.272001f, 8.4131f);
generalPath.lineTo(20.618002f, 9.0713005f);
generalPath.lineTo(21.491001f, 10.8f);
generalPath.lineTo(22.071001f, 10.47f);
generalPath.lineTo(22.800001f, 9.3188f);
generalPath.curveTo(23.923f, 8.9716f, 24.93f, 8.5781f, 25.997002f, 8.0844f);
generalPath.lineTo(26.87f, 5.8632f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 182)) : new Color(32, 74, 135, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.833f, 12.775f);
generalPath.lineTo(28.542f, 12.033999f);
generalPath.lineTo(28.032f, 12.198999f);
generalPath.lineTo(28.178999f, 13.103f);
generalPath.lineTo(28.832998f, 12.775f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 182)) : new Color(32, 74, 135, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_4_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.123f, 12.609f);
generalPath.lineTo(28.977999f, 13.597f);
generalPath.lineTo(29.776999f, 13.432f);
generalPath.lineTo(30.357998f, 12.857f);
generalPath.lineTo(29.849998f, 12.363f);
generalPath.curveTo(29.678999f, 11.908f, 29.481998f, 11.483f, 29.267998f, 11.046f);
generalPath.lineTo(28.832998f, 11.046f);
generalPath.lineTo(28.832998f, 11.54f);
generalPath.lineTo(29.123f, 11.8689995f);
generalPath.lineTo(29.123f, 12.608999f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 182)) : new Color(32, 74, 135, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_5_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_5_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.365f, 28.242f);
generalPath.lineTo(17.782999f, 27.09f);
generalPath.lineTo(16.692999f, 26.843f);
generalPath.lineTo(16.110998f, 25.281f);
generalPath.lineTo(14.657998f, 25.445f);
generalPath.lineTo(13.421998f, 24.541f);
generalPath.lineTo(12.112998f, 25.692001f);
generalPath.lineTo(12.112998f, 25.874f);
generalPath.curveTo(11.716998f, 25.759f, 11.229998f, 25.744001f, 10.877998f, 25.527f);
generalPath.lineTo(10.586998f, 24.705f);
generalPath.lineTo(10.586998f, 23.799f);
generalPath.lineTo(9.714798f, 23.881f);
generalPath.curveTo(9.787598f, 23.305f, 9.859798f, 22.73f, 9.933098f, 22.154001f);
generalPath.lineTo(9.423798f, 22.154001f);
generalPath.lineTo(8.915498f, 22.812f);
generalPath.lineTo(8.406198f, 23.058f);
generalPath.lineTo(7.6790977f, 22.648f);
generalPath.lineTo(7.6062975f, 21.743f);
generalPath.lineTo(7.7517977f, 20.755f);
generalPath.lineTo(8.842598f, 19.932999f);
generalPath.lineTo(9.714698f, 19.932999f);
generalPath.lineTo(9.859698f, 19.439f);
generalPath.lineTo(10.949998f, 19.685f);
generalPath.lineTo(11.749998f, 20.673f);
generalPath.lineTo(11.894999f, 19.027f);
generalPath.lineTo(13.2769985f, 17.875f);
generalPath.lineTo(13.784999f, 16.641f);
generalPath.lineTo(14.802999f, 16.230001f);
generalPath.lineTo(15.383999f, 15.408001f);
generalPath.lineTo(16.692999f, 15.160001f);
generalPath.lineTo(17.346998f, 14.173f);
generalPath.lineTo(15.383998f, 14.173f);
generalPath.lineTo(16.619997f, 13.597f);
generalPath.lineTo(17.491997f, 13.597f);
generalPath.lineTo(18.727997f, 13.185f);
generalPath.lineTo(18.873997f, 12.693001f);
generalPath.lineTo(18.436996f, 12.281001f);
generalPath.lineTo(17.927996f, 12.116001f);
generalPath.lineTo(18.073996f, 11.622001f);
generalPath.lineTo(17.710995f, 10.882001f);
generalPath.lineTo(16.837996f, 11.210001f);
generalPath.lineTo(16.983995f, 10.553001f);
generalPath.lineTo(15.965996f, 9.976501f);
generalPath.lineTo(15.166996f, 11.3740015f);
generalPath.lineTo(15.238996f, 11.868002f);
generalPath.lineTo(14.439996f, 12.199002f);
generalPath.lineTo(13.929996f, 13.2680025f);
generalPath.lineTo(13.711995f, 12.281002f);
generalPath.lineTo(12.330996f, 11.704002f);
generalPath.lineTo(12.112995f, 10.964003f);
generalPath.lineTo(13.929996f, 9.893903f);
generalPath.lineTo(14.729996f, 9.153703f);
generalPath.lineTo(14.802996f, 8.248902f);
generalPath.lineTo(14.366996f, 8.001802f);
generalPath.lineTo(13.784996f, 7.9193025f);
generalPath.lineTo(13.421996f, 8.824602f);
generalPath.curveTo(13.421996f, 8.824602f, 12.813996f, 8.943702f, 12.657996f, 8.982302f);
generalPath.curveTo(10.661996f, 10.822001f, 6.6285963f, 14.792002f, 5.691596f, 22.288301f);
generalPath.curveTo(5.728696f, 22.462301f, 6.370796f, 23.4703f, 6.370796f, 23.4703f);
generalPath.lineTo(7.8971963f, 24.3743f);
generalPath.lineTo(9.423596f, 24.7863f);
generalPath.lineTo(10.077996f, 25.6103f);
generalPath.lineTo(11.095996f, 26.3503f);
generalPath.lineTo(11.676996f, 26.2683f);
generalPath.lineTo(12.112996f, 26.464298f);
generalPath.lineTo(12.112996f, 26.597298f);
generalPath.lineTo(11.531996f, 28.160297f);
generalPath.lineTo(11.0949955f, 28.818298f);
generalPath.lineTo(11.240995f, 29.148298f);
generalPath.lineTo(10.8779955f, 30.381298f);
generalPath.lineTo(12.185995f, 32.7673f);
generalPath.lineTo(13.493995f, 33.9203f);
generalPath.lineTo(14.0759945f, 34.7423f);
generalPath.lineTo(14.002995f, 36.4703f);
generalPath.lineTo(14.439995f, 37.4573f);
generalPath.lineTo(14.002995f, 39.349297f);
generalPath.curveTo(14.002995f, 39.349297f, 13.968994f, 39.338295f, 14.024995f, 39.527298f);
generalPath.curveTo(14.080995f, 39.717297f, 16.353994f, 40.9783f, 16.497995f, 40.8713f);
generalPath.curveTo(16.641994f, 40.7623f, 16.764996f, 40.666298f, 16.764996f, 40.666298f);
generalPath.lineTo(16.619995f, 40.256298f);
generalPath.lineTo(17.200994f, 39.6793f);
generalPath.lineTo(17.419994f, 39.1033f);
generalPath.lineTo(18.364994f, 38.773296f);
generalPath.lineTo(19.091993f, 36.963295f);
generalPath.lineTo(18.873993f, 36.470295f);
generalPath.lineTo(19.381992f, 35.730293f);
generalPath.lineTo(20.471992f, 35.482292f);
generalPath.lineTo(21.053993f, 34.16629f);
generalPath.lineTo(20.908993f, 32.52129f);
generalPath.lineTo(21.780993f, 31.28729f);
generalPath.lineTo(21.925993f, 30.05229f);
generalPath.curveTo(20.732992f, 29.46129f, 19.549994f, 28.85129f, 18.364992f, 28.24229f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 182)) : new Color(32, 74, 135, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_6_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_6_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.766f, 9.5649f);
generalPath.lineTo(17.492f, 10.059f);
generalPath.lineTo(18.074001f, 10.059f);
generalPath.lineTo(18.074001f, 9.4829f);
generalPath.lineTo(17.348001f, 9.1538f);
generalPath.lineTo(16.766f, 9.5649f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 182)) : new Color(32, 74, 135, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_7_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_7_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.876f, 8.9072f);
generalPath.lineTo(14.512f, 9.812f);
generalPath.lineTo(15.239f, 9.812f);
generalPath.lineTo(15.603001f, 8.989201f);
generalPath.curveTo(15.917001f, 8.767501f, 16.229f, 8.5444f, 16.548f, 8.331f);
generalPath.lineTo(17.275f, 8.5781f);
generalPath.curveTo(17.758999f, 8.9072f, 18.244f, 9.2363f, 18.729f, 9.5649f);
generalPath.lineTo(19.456f, 8.907201f);
generalPath.lineTo(18.656f, 8.578101f);
generalPath.lineTo(18.292f, 7.8374014f);
generalPath.lineTo(16.911f, 7.6728015f);
generalPath.lineTo(16.838f, 7.2612014f);
generalPath.lineTo(16.184f, 7.4262013f);
generalPath.lineTo(15.894f, 8.002002f);
generalPath.lineTo(15.53f, 7.261302f);
generalPath.lineTo(15.384999f, 7.590402f);
generalPath.lineTo(15.457999f, 8.413202f);
generalPath.lineTo(14.875999f, 8.907203f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 182)) : new Color(32, 74, 135, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_8
g.setComposite(AlphaComposite.getInstance(3, 0.75f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_8_0
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_8_1
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_9
g.setComposite(AlphaComposite.getInstance(3, 0.75f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_9_0
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_9_1
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_10_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_10_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.492f, 6.8496f);
generalPath.lineTo(17.856f, 6.521f);
generalPath.lineTo(18.583f, 6.3564f);
generalPath.curveTo(19.081f, 6.1142f, 19.581f, 5.9511f, 20.11f, 5.7802f);
generalPath.lineTo(19.82f, 5.2865f);
generalPath.lineTo(18.881f, 5.4213f);
generalPath.lineTo(18.438f, 5.8632f);
generalPath.lineTo(17.706999f, 5.9692f);
generalPath.lineTo(17.057f, 6.2744f);
generalPath.lineTo(16.741f, 6.4272003f);
generalPath.lineTo(16.547998f, 6.6855f);
generalPath.lineTo(17.491999f, 6.8496003f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 182)) : new Color(32, 74, 135, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_11_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_11_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.728f, 14.666f);
generalPath.lineTo(19.165f, 14.008f);
generalPath.lineTo(18.51f, 13.515f);
generalPath.lineTo(18.728f, 14.666f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(32, 74, 135, 182)) : new Color(32, 74, 135, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.3956f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new RadialGradientPaint(new Point2D.Double(15.60099983215332, 12.142000198364258), 43.527f, new Point2D.Double(15.60099983215332, 12.142000198364258), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 42)) : new Color(255, 255, 255, 42))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9999899864196777f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(42.975f, 23.486f);
generalPath.curveTo(42.975f, 33.651f, 34.733997f, 41.892f, 24.568998f, 41.892f);
generalPath.curveTo(14.403999f, 41.892f, 6.162998f, 33.650997f, 6.162998f, 23.485998f);
generalPath.curveTo(6.1633983f, 13.319998f, 14.403998f, 5.079998f, 24.568998f, 5.079998f);
generalPath.curveTo(34.733997f, 5.079898f, 42.975f, 13.319998f, 42.975f, 23.485998f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.13100004196167f, 0.613099992275238f, -0.47655999660491943f, 0.8791400194168091f, 54.090999603271484f, 16.04400062561035f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(-25.176000595092773, 30.05699920654297), new Point2D.Double(-22.25200080871582, 21.04199981689453), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.88164f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-2.8284f, 21.042f);
generalPath.curveTo(-2.803187f, 24.431059f, -5.7964487f, 27.569181f, -10.6747675f, 29.268103f);
generalPath.curveTo(-15.553087f, 30.967022f, -21.570711f, 30.967022f, -26.449032f, 29.268103f);
generalPath.curveTo(-31.32735f, 27.569181f, -34.32061f, 24.431059f, -34.2954f, 21.042f);
generalPath.curveTo(-34.32061f, 17.65294f, -31.32735f, 14.514817f, -26.44903f, 12.815898f);
generalPath.curveTo(-21.570711f, 11.116979f, -15.553086f, 11.116979f, -10.6747675f, 12.815898f);
generalPath.curveTo(-5.796448f, 14.514817f, -2.8031867f, 17.65294f, -2.8283997f, 21.042f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.939329981803894f, -0.8790900111198425f, 0.6833099722862244f, 0.7301300168037415f, 32.31399917602539f, -4.451600074768066f));
// _0_0_5
paint = new LinearGradientPaint(new Point2D.Double(-25.176000595092773, 30.05699920654297), new Point2D.Double(-22.11400032043457, 22.66200065612793), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.88164f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-2.8284f, 21.042f);
generalPath.curveTo(-2.803187f, 24.431059f, -5.7964487f, 27.569181f, -10.6747675f, 29.268103f);
generalPath.curveTo(-15.553087f, 30.967022f, -21.570711f, 30.967022f, -26.449032f, 29.268103f);
generalPath.curveTo(-31.32735f, 27.569181f, -34.32061f, 24.431059f, -34.2954f, 21.042f);
generalPath.curveTo(-34.32061f, 17.65294f, -31.32735f, 14.514817f, -26.44903f, 12.815898f);
generalPath.curveTo(-21.570711f, 11.116979f, -15.553086f, 11.116979f, -10.6747675f, 12.815898f);
generalPath.curveTo(-5.796448f, 14.514817f, -2.8031867f, 17.65294f, -2.8283997f, 21.042f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-1.045799970626831f, 0.7672500014305115f, 0.7672500014305115f, 1.045799970626831f, 35.617000579833984f, -22.143999099731445f));
// _0_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.949999809265137f, 22.93000030517578f));
// _0_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.789f, 12.493f);
generalPath.curveTo(18.799765f, 14.900088f, 17.521776f, 17.12895f, 15.4389515f, 18.335611f);
generalPath.curveTo(13.356128f, 19.542274f, 10.786871f, 19.542274f, 8.704047f, 18.335611f);
generalPath.curveTo(6.621223f, 17.12895f, 5.343234f, 14.900088f, 5.353999f, 12.493f);
generalPath.curveTo(5.343234f, 10.085912f, 6.621223f, 7.8570504f, 8.704047f, 6.650388f);
generalPath.curveTo(10.786871f, 5.4437256f, 13.356128f, 5.4437256f, 15.4389515f, 6.650388f);
generalPath.curveTo(17.521776f, 7.8570504f, 18.799765f, 10.085912f, 18.789f, 12.493f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(12.071000099182129, 12.493000030517578), 6.7175f, new Point2D.Double(12.071000099182129, 12.493000030517578), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.30827000737190247f, 0.0f, 0.0f, 0.30827000737190247f, 23.299999237060547f, 31.57200050354004f));
// _0_0_6_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.789f, 12.493f);
generalPath.curveTo(18.799765f, 14.900088f, 17.521776f, 17.12895f, 15.4389515f, 18.335611f);
generalPath.curveTo(13.356128f, 19.542274f, 10.786871f, 19.542274f, 8.704047f, 18.335611f);
generalPath.curveTo(6.621223f, 17.12895f, 5.343234f, 14.900088f, 5.353999f, 12.493f);
generalPath.curveTo(5.343234f, 10.085912f, 6.621223f, 7.8570504f, 8.704047f, 6.650388f);
generalPath.curveTo(10.786871f, 5.4437256f, 13.356128f, 5.4437256f, 15.4389515f, 6.650388f);
generalPath.curveTo(17.521776f, 7.8570504f, 18.799765f, 10.085912f, 18.789f, 12.493f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-1.2803000211715698f, -0.12615999579429626f, 0.09806200116872787f, -0.9951800107955933f, -2.405100107192993f, 40.52399826049805f));
// _0_0_7
paint = new LinearGradientPaint(new Point2D.Double(-22.822999954223633, 28.33799934387207), new Point2D.Double(-22.11400032043457, 22.66200065612793), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.88164f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-2.8284f, 21.042f);
generalPath.curveTo(-2.803187f, 24.431059f, -5.7964487f, 27.569181f, -10.6747675f, 29.268103f);
generalPath.curveTo(-15.553087f, 30.967022f, -21.570711f, 30.967022f, -26.449032f, 29.268103f);
generalPath.curveTo(-31.32735f, 27.569181f, -34.32061f, 24.431059f, -34.2954f, 21.042f);
generalPath.curveTo(-34.32061f, 17.65294f, -31.32735f, 14.514817f, -26.44903f, 12.815898f);
generalPath.curveTo(-21.570711f, 11.116979f, -15.553086f, 11.116979f, -10.6747675f, 12.815898f);
generalPath.curveTo(-5.796448f, 14.514817f, -2.8031867f, 17.65294f, -2.8283997f, 21.042f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9178699851036072f, -0.8589800000190735f, 0.6676999926567078f, 0.7134299874305725f, 27.632999420166016f, -6.90910005569458f));
// _0_0_8
paint = new LinearGradientPaint(new Point2D.Double(-21.659000396728516, 15.64900016784668), new Point2D.Double(-21.961999893188477, 21.336000442504883), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.90226f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-2.8284f, 21.042f);
generalPath.curveTo(-2.803187f, 24.431059f, -5.7964487f, 27.569181f, -10.6747675f, 29.268103f);
generalPath.curveTo(-15.553087f, 30.967022f, -21.570711f, 30.967022f, -26.449032f, 29.268103f);
generalPath.curveTo(-31.32735f, 27.569181f, -34.32061f, 24.431059f, -34.2954f, 21.042f);
generalPath.curveTo(-34.32061f, 17.65294f, -31.32735f, 14.514817f, -26.44903f, 12.815898f);
generalPath.curveTo(-21.570711f, 11.116979f, -15.553086f, 11.116979f, -10.6747675f, 12.815898f);
generalPath.curveTo(-5.796448f, 14.514817f, -2.8031867f, 17.65294f, -2.8283997f, 21.042f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.8062800168991089f, 0.5915399789810181f, 0.5915399789810181f, 0.8062800168991089f, 12.38599967956543f, -18.02899932861328f));
// _0_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.949999809265137f, 22.93000030517578f));
// _0_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.789f, 12.493f);
generalPath.curveTo(18.799765f, 14.900088f, 17.521776f, 17.12895f, 15.4389515f, 18.335611f);
generalPath.curveTo(13.356128f, 19.542274f, 10.786871f, 19.542274f, 8.704047f, 18.335611f);
generalPath.curveTo(6.621223f, 17.12895f, 5.343234f, 14.900088f, 5.353999f, 12.493f);
generalPath.curveTo(5.343234f, 10.085912f, 6.621223f, 7.8570504f, 8.704047f, 6.650388f);
generalPath.curveTo(10.786871f, 5.4437256f, 13.356128f, 5.4437256f, 15.4389515f, 6.650388f);
generalPath.curveTo(17.521776f, 7.8570504f, 18.799765f, 10.085912f, 18.789f, 12.493f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(12.071000099182129, 12.493000030517578), 6.7175f, new Point2D.Double(12.071000099182129, 12.493000030517578), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.30827000737190247f, 0.0f, 0.0f, 0.30827000737190247f, 23.299999237060547f, 31.57200050354004f));
// _0_0_9_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.789f, 12.493f);
generalPath.curveTo(18.799765f, 14.900088f, 17.521776f, 17.12895f, 15.4389515f, 18.335611f);
generalPath.curveTo(13.356128f, 19.542274f, 10.786871f, 19.542274f, 8.704047f, 18.335611f);
generalPath.curveTo(6.621223f, 17.12895f, 5.343234f, 14.900088f, 5.353999f, 12.493f);
generalPath.curveTo(5.343234f, 10.085912f, 6.621223f, 7.8570504f, 8.704047f, 6.650388f);
generalPath.curveTo(10.786871f, 5.4437256f, 13.356128f, 5.4437256f, 15.4389515f, 6.650388f);
generalPath.curveTo(17.521776f, 7.8570504f, 18.799765f, 10.085912f, 18.789f, 12.493f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.8062800168991089f, 0.5915399789810181f, 0.5915399789810181f, 0.8062800168991089f, 13.49899959564209f, -31.5f));
// _0_0_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.949999809265137f, 22.93000030517578f));
// _0_0_10_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.789f, 12.493f);
generalPath.curveTo(18.799765f, 14.900088f, 17.521776f, 17.12895f, 15.4389515f, 18.335611f);
generalPath.curveTo(13.356128f, 19.542274f, 10.786871f, 19.542274f, 8.704047f, 18.335611f);
generalPath.curveTo(6.621223f, 17.12895f, 5.343234f, 14.900088f, 5.353999f, 12.493f);
generalPath.curveTo(5.343234f, 10.085912f, 6.621223f, 7.8570504f, 8.704047f, 6.650388f);
generalPath.curveTo(10.786871f, 5.4437256f, 13.356128f, 5.4437256f, 15.4389515f, 6.650388f);
generalPath.curveTo(17.521776f, 7.8570504f, 18.799765f, 10.085912f, 18.789f, 12.493f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(12.071000099182129, 12.493000030517578), 6.7175f, new Point2D.Double(12.071000099182129, 12.493000030517578), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.30827000737190247f, 0.0f, 0.0f, 0.30827000737190247f, 23.299999237060547f, 31.57200050354004f));
// _0_0_10_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.789f, 12.493f);
generalPath.curveTo(18.799765f, 14.900088f, 17.521776f, 17.12895f, 15.4389515f, 18.335611f);
generalPath.curveTo(13.356128f, 19.542274f, 10.786871f, 19.542274f, 8.704047f, 18.335611f);
generalPath.curveTo(6.621223f, 17.12895f, 5.343234f, 14.900088f, 5.353999f, 12.493f);
generalPath.curveTo(5.343234f, 10.085912f, 6.621223f, 7.8570504f, 8.704047f, 6.650388f);
generalPath.curveTo(10.786871f, 5.4437256f, 13.356128f, 5.4437256f, 15.4389515f, 6.650388f);
generalPath.curveTo(17.521776f, 7.8570504f, 18.799765f, 10.085912f, 18.789f, 12.493f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-0.8702300190925598f, 0.6385700106620789f, 0.6384599804878235f, 0.8703799843788147f, 25.204999923706055f, -35.3129997253418f));
// _0_0_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.949999809265137f, 22.93000030517578f));
// _0_0_11_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.789f, 12.493f);
generalPath.curveTo(18.799765f, 14.900088f, 17.521776f, 17.12895f, 15.4389515f, 18.335611f);
generalPath.curveTo(13.356128f, 19.542274f, 10.786871f, 19.542274f, 8.704047f, 18.335611f);
generalPath.curveTo(6.621223f, 17.12895f, 5.343234f, 14.900088f, 5.353999f, 12.493f);
generalPath.curveTo(5.343234f, 10.085912f, 6.621223f, 7.8570504f, 8.704047f, 6.650388f);
generalPath.curveTo(10.786871f, 5.4437256f, 13.356128f, 5.4437256f, 15.4389515f, 6.650388f);
generalPath.curveTo(17.521776f, 7.8570504f, 18.799765f, 10.085912f, 18.789f, 12.493f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(12.071000099182129, 12.493000030517578), 6.7175f, new Point2D.Double(12.071000099182129, 12.493000030517578), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.30827000737190247f, 0.0f, 0.0f, 0.30827000737190247f, 23.299999237060547f, 31.57200050354004f));
// _0_0_11_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.789f, 12.493f);
generalPath.curveTo(18.799765f, 14.900088f, 17.521776f, 17.12895f, 15.4389515f, 18.335611f);
generalPath.curveTo(13.356128f, 19.542274f, 10.786871f, 19.542274f, 8.704047f, 18.335611f);
generalPath.curveTo(6.621223f, 17.12895f, 5.343234f, 14.900088f, 5.353999f, 12.493f);
generalPath.curveTo(5.343234f, 10.085912f, 6.621223f, 7.8570504f, 8.704047f, 6.650388f);
generalPath.curveTo(10.786871f, 5.4437256f, 13.356128f, 5.4437256f, 15.4389515f, 6.650388f);
generalPath.curveTo(17.521776f, 7.8570504f, 18.799765f, 10.085912f, 18.789f, 12.493f);
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
        return 0.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 2.34157395362854;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 48.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 45.658424377441406;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Applications_internet() {
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
       Applications_internet base = new Applications_internet();
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
       Applications_internet base = new Applications_internet();
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
        return Applications_internet::new;
    }
}

