package org.pushingpixels.demo.substance.flamingo.svg.transcoded;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/ibis">Ibis SVG transcoder</a>.
 */
public class Applications_internet implements
		org.pushingpixels.flamingo.api.common.icon.ResizableIcon {
    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = ((Graphics2D)g).getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.2431999444961548f, 0.0f, -10.272000312805176f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(15.116000175476074, 63.96500015258789), 12.289f, new Point2D.Double(15.116000175476074, 63.96500015258789), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.6440000534057617f, 0.0f, 0.0f, 0.6082800030708313f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.053, 38.909);
((GeneralPath)shape).curveTo(45.085377, 41.58756, 41.241802, 44.06779, 34.977673, 45.41054);
((GeneralPath)shape).curveTo(28.713545, 46.753292, 20.98646, 46.753292, 14.722331, 45.41054);
((GeneralPath)shape).curveTo(8.458201, 44.06779, 4.614628, 41.58756, 4.647003, 38.909);
((GeneralPath)shape).curveTo(4.614628, 36.230442, 8.458201, 33.75021, 14.722331, 32.40746);
((GeneralPath)shape).curveTo(20.98646, 31.064709, 28.713545, 31.064709, 34.977673, 32.40746);
((GeneralPath)shape).curveTo(41.241802, 33.75021, 45.085377, 36.230442, 45.053, 38.909);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new RadialGradientPaint(new Point2D.Double(18.24799919128418, 15.715999603271484), 29.993f, new Point2D.Double(18.24799919128418, 15.715999603271484), new float[] {0.0f,0.15517f,0.75f,1.0f}, new Color[] {new Color(211, 233, 255, 255),new Color(211, 233, 255, 255),new Color(64, 116, 174, 255),new Color(54, 72, 108, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9999899864196777f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(43.96, 23.485);
((GeneralPath)shape).curveTo(43.96, 34.195, 35.278, 42.877, 24.57, 42.877);
((GeneralPath)shape).curveTo(13.86, 42.877, 5.178999, 34.195, 5.178999, 23.484999);
((GeneralPath)shape).curveTo(5.178699, 12.775999, 13.859999, 4.0949993, 24.57, 4.0949993);
((GeneralPath)shape).curveTo(35.278, 4.095199, 43.96, 12.775999, 43.96, 23.484999);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(57, 57, 108, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(43.96, 23.485);
((GeneralPath)shape).curveTo(43.96, 34.195, 35.278, 42.877, 24.57, 42.877);
((GeneralPath)shape).curveTo(13.86, 42.877, 5.178999, 34.195, 5.178999, 23.484999);
((GeneralPath)shape).curveTo(5.178699, 12.775999, 13.859999, 4.0949993, 24.57, 4.0949993);
((GeneralPath)shape).curveTo(35.278, 4.095199, 43.96, 12.775999, 43.96, 23.484999);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(0.9823700189590454f, 0.0f, 0.0f, 0.9823700189590454f, 0.12108000367879868f, 0.23291000723838806f));
// _0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.071, 20.714);
((GeneralPath)shape).lineTo(44.071, 20.714);
((GeneralPath)shape).lineTo(43.526, 21.332);
((GeneralPath)shape).curveTo(43.192, 20.938002, 42.817, 20.607, 42.437, 20.261002);
((GeneralPath)shape).lineTo(41.601, 20.384);
((GeneralPath)shape).lineTo(40.837, 19.521);
((GeneralPath)shape).lineTo(40.837, 20.589);
((GeneralPath)shape).lineTo(41.491, 21.084002);
((GeneralPath)shape).lineTo(41.927002, 21.578001);
((GeneralPath)shape).lineTo(42.509003, 20.920002);
((GeneralPath)shape).curveTo(42.655003, 21.194002, 42.800003, 21.468002, 42.945004, 21.743002);
((GeneralPath)shape).lineTo(42.945004, 22.565002);
((GeneralPath)shape).lineTo(42.290005, 23.305002);
((GeneralPath)shape).lineTo(41.091003, 24.128002);
((GeneralPath)shape).lineTo(40.183002, 25.035002);
((GeneralPath)shape).lineTo(39.601, 24.374002);
((GeneralPath)shape).lineTo(39.892002, 23.634003);
((GeneralPath)shape).lineTo(39.31, 22.976002);
((GeneralPath)shape).lineTo(38.329002, 20.878002);
((GeneralPath)shape).lineTo(37.493004, 19.933002);
((GeneralPath)shape).lineTo(37.274002, 20.179003);
((GeneralPath)shape).lineTo(37.602, 21.373003);
((GeneralPath)shape).lineTo(38.22, 22.072002);
((GeneralPath)shape).curveTo(38.572002, 23.089003, 38.921, 24.062002, 39.384003, 25.035002);
((GeneralPath)shape).curveTo(40.102, 25.035002, 40.778004, 24.958002, 41.491, 24.869001);
((GeneralPath)shape).lineTo(41.491, 25.445002);
((GeneralPath)shape).lineTo(40.619, 27.584002);
((GeneralPath)shape).lineTo(39.819, 28.488);
((GeneralPath)shape).lineTo(39.165, 29.889);
((GeneralPath)shape).lineTo(39.165, 32.192);
((GeneralPath)shape).lineTo(39.384003, 33.098);
((GeneralPath)shape).lineTo(39.020004, 33.508);
((GeneralPath)shape).lineTo(38.220005, 34.002);
((GeneralPath)shape).lineTo(37.384007, 34.701);
((GeneralPath)shape).lineTo(38.075005, 35.483);
((GeneralPath)shape).lineTo(37.130005, 36.307003);
((GeneralPath)shape).lineTo(37.312004, 36.840004);
((GeneralPath)shape).lineTo(35.894005, 38.446003);
((GeneralPath)shape).lineTo(34.949005, 38.446003);
((GeneralPath)shape).lineTo(34.149006, 38.940002);
((GeneralPath)shape).lineTo(33.640007, 38.940002);
((GeneralPath)shape).lineTo(33.640007, 38.281002);
((GeneralPath)shape).lineTo(33.423008, 36.963);
((GeneralPath)shape).curveTo(33.14201, 36.137, 32.849007, 35.316, 32.551006, 34.496002);
((GeneralPath)shape).curveTo(32.551006, 33.891003, 32.587006, 33.291, 32.623005, 32.686);
((GeneralPath)shape).lineTo(32.987003, 31.863);
((GeneralPath)shape).lineTo(32.478004, 30.875);
((GeneralPath)shape).lineTo(32.515003, 29.518);
((GeneralPath)shape).lineTo(31.823004, 28.736);
((GeneralPath)shape).lineTo(32.169003, 27.606);
((GeneralPath)shape).lineTo(31.606003, 26.967001);
((GeneralPath)shape).lineTo(30.624002, 26.967001);
((GeneralPath)shape).lineTo(30.297003, 26.597);
((GeneralPath)shape).lineTo(29.316002, 27.215);
((GeneralPath)shape).lineTo(28.916002, 26.761);
((GeneralPath)shape).lineTo(28.007002, 27.543);
((GeneralPath)shape).curveTo(27.390001, 26.842999, 26.772001, 26.144, 26.153002, 25.445);
((GeneralPath)shape).lineTo(25.427002, 23.716);
((GeneralPath)shape).lineTo(26.081001, 22.73);
((GeneralPath)shape).lineTo(25.718, 22.319);
((GeneralPath)shape).lineTo(26.517, 20.425);
((GeneralPath)shape).curveTo(27.173, 19.609, 27.858, 18.826, 28.552, 18.039999);
((GeneralPath)shape).lineTo(29.788, 17.710999);
((GeneralPath)shape).lineTo(31.169, 17.545998);
((GeneralPath)shape).lineTo(32.114002, 17.793997);
((GeneralPath)shape).lineTo(33.459003, 19.149998);
((GeneralPath)shape).lineTo(33.932003, 18.615997);
((GeneralPath)shape).lineTo(34.585003, 18.533997);
((GeneralPath)shape).lineTo(35.821003, 18.944996);
((GeneralPath)shape).lineTo(36.767002, 18.944996);
((GeneralPath)shape).lineTo(37.421, 18.368996);
((GeneralPath)shape).lineTo(37.712, 17.957996);
((GeneralPath)shape).lineTo(37.057003, 17.545996);
((GeneralPath)shape).lineTo(35.966003, 17.463995);
((GeneralPath)shape).curveTo(35.663002, 17.044994, 35.382004, 16.602995, 35.022003, 16.229996);
((GeneralPath)shape).lineTo(34.658005, 16.393995);
((GeneralPath)shape).lineTo(34.513004, 17.463995);
((GeneralPath)shape).lineTo(33.858006, 16.723995);
((GeneralPath)shape).lineTo(33.714005, 15.899995);
((GeneralPath)shape).lineTo(32.987003, 15.3259945);
((GeneralPath)shape).lineTo(32.695004, 15.3259945);
((GeneralPath)shape).lineTo(33.423004, 16.147995);
((GeneralPath)shape).lineTo(33.132004, 16.887995);
((GeneralPath)shape).lineTo(32.551003, 17.051994);
((GeneralPath)shape).lineTo(32.914, 16.311995);
((GeneralPath)shape).lineTo(32.259003, 15.9839945);
((GeneralPath)shape).lineTo(31.678003, 15.3259945);
((GeneralPath)shape).lineTo(30.587004, 15.571995);
((GeneralPath)shape).lineTo(30.442003, 15.899995);
((GeneralPath)shape).lineTo(29.788004, 16.311995);
((GeneralPath)shape).lineTo(29.425003, 17.217995);
((GeneralPath)shape).lineTo(28.516003, 17.669994);
((GeneralPath)shape).lineTo(28.116003, 17.217995);
((GeneralPath)shape).lineTo(27.680002, 17.217995);
((GeneralPath)shape).lineTo(27.680002, 15.735994);
((GeneralPath)shape).lineTo(28.626001, 15.241994);
((GeneralPath)shape).lineTo(29.352001, 15.241994);
((GeneralPath)shape).lineTo(29.206001, 14.666994);
((GeneralPath)shape).lineTo(28.626001, 14.090994);
((GeneralPath)shape).lineTo(29.606, 13.884994);
((GeneralPath)shape).lineTo(30.151001, 13.267994);
((GeneralPath)shape).lineTo(30.587002, 12.526994);
((GeneralPath)shape).lineTo(31.388002, 12.526994);
((GeneralPath)shape).lineTo(31.169003, 11.951994);
((GeneralPath)shape).lineTo(31.678003, 11.622993);
((GeneralPath)shape).lineTo(31.678003, 12.280993);
((GeneralPath)shape).lineTo(32.768, 12.526994);
((GeneralPath)shape).lineTo(33.858, 11.622993);
((GeneralPath)shape).lineTo(33.931004, 11.210994);
((GeneralPath)shape).lineTo(34.876003, 10.552994);
((GeneralPath)shape).curveTo(34.534004, 10.595994, 34.192, 10.626994, 33.858, 10.717994);
((GeneralPath)shape).lineTo(33.858, 9.976594);
((GeneralPath)shape).lineTo(34.221, 9.153794);
((GeneralPath)shape).lineTo(33.858, 9.153794);
((GeneralPath)shape).lineTo(33.06, 9.893994);
((GeneralPath)shape).lineTo(32.841, 10.305994);
((GeneralPath)shape).lineTo(33.06, 10.881994);
((GeneralPath)shape).lineTo(32.695, 11.868994);
((GeneralPath)shape).lineTo(32.114, 11.539993);
((GeneralPath)shape).lineTo(31.605999, 10.963993);
((GeneralPath)shape).lineTo(30.806, 11.539993);
((GeneralPath)shape).lineTo(30.515, 10.223993);
((GeneralPath)shape).lineTo(31.896, 9.318793);
((GeneralPath)shape).lineTo(31.896, 8.824694);
((GeneralPath)shape).lineTo(32.768, 8.248994);
((GeneralPath)shape).lineTo(34.149002, 7.919394);
((GeneralPath)shape).lineTo(35.095, 8.248994);
((GeneralPath)shape).lineTo(36.839, 8.578094);
((GeneralPath)shape).lineTo(36.403, 9.071294);
((GeneralPath)shape).lineTo(35.458, 9.071294);
((GeneralPath)shape).lineTo(36.403, 10.058994);
((GeneralPath)shape).lineTo(37.13, 9.236294);
((GeneralPath)shape).lineTo(37.351, 8.874494);
((GeneralPath)shape).curveTo(37.351, 8.874494, 40.138, 11.371994, 41.730003, 14.104994);
((GeneralPath)shape).curveTo(43.323, 16.837994, 44.071003, 20.059994, 44.071003, 20.713993);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_0_0_0);
g.setTransform(defaultTransform__0_0_2_0_0);
g.setTransform(defaultTransform__0_0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_1_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(26.07, 9.2363);
((GeneralPath)shape).lineTo(25.997, 9.729501);
((GeneralPath)shape).lineTo(26.507, 10.059001);
((GeneralPath)shape).lineTo(27.378, 9.482901);
((GeneralPath)shape).lineTo(26.942, 8.989201);
((GeneralPath)shape).lineTo(26.359999, 9.318801);
((GeneralPath)shape).lineTo(26.069998, 9.2363);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_1_0_0);
g.setTransform(defaultTransform__0_0_2_1_0);
g.setTransform(defaultTransform__0_0_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_2_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(26.87, 5.8633);
((GeneralPath)shape).lineTo(24.980001, 5.1225996);
((GeneralPath)shape).lineTo(22.800001, 5.3691998);
((GeneralPath)shape).lineTo(20.109001, 6.1094);
((GeneralPath)shape).lineTo(19.601002, 6.6035);
((GeneralPath)shape).lineTo(21.272001, 7.7549);
((GeneralPath)shape).lineTo(21.272001, 8.4131);
((GeneralPath)shape).lineTo(20.618002, 9.0713005);
((GeneralPath)shape).lineTo(21.491001, 10.8);
((GeneralPath)shape).lineTo(22.071001, 10.47);
((GeneralPath)shape).lineTo(22.800001, 9.3188);
((GeneralPath)shape).curveTo(23.923, 8.9716, 24.93, 8.5781, 25.997002, 8.0844);
((GeneralPath)shape).lineTo(26.87, 5.8632);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_2_0_0);
g.setTransform(defaultTransform__0_0_2_2_0);
g.setTransform(defaultTransform__0_0_2_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_3_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_3_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.833, 12.775);
((GeneralPath)shape).lineTo(28.542, 12.033999);
((GeneralPath)shape).lineTo(28.032, 12.198999);
((GeneralPath)shape).lineTo(28.178999, 13.103);
((GeneralPath)shape).lineTo(28.832998, 12.775);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_3_0_0);
g.setTransform(defaultTransform__0_0_2_3_0);
g.setTransform(defaultTransform__0_0_2_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_4_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_4_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_4_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.123, 12.609);
((GeneralPath)shape).lineTo(28.977999, 13.597);
((GeneralPath)shape).lineTo(29.776999, 13.432);
((GeneralPath)shape).lineTo(30.357998, 12.857);
((GeneralPath)shape).lineTo(29.849998, 12.363);
((GeneralPath)shape).curveTo(29.678999, 11.908, 29.481998, 11.483, 29.267998, 11.046);
((GeneralPath)shape).lineTo(28.832998, 11.046);
((GeneralPath)shape).lineTo(28.832998, 11.54);
((GeneralPath)shape).lineTo(29.123, 11.8689995);
((GeneralPath)shape).lineTo(29.123, 12.608999);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_4_0_0);
g.setTransform(defaultTransform__0_0_2_4_0);
g.setTransform(defaultTransform__0_0_2_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_5_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_5_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_5_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_5_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.365, 28.242);
((GeneralPath)shape).lineTo(17.782999, 27.09);
((GeneralPath)shape).lineTo(16.692999, 26.843);
((GeneralPath)shape).lineTo(16.110998, 25.281);
((GeneralPath)shape).lineTo(14.657998, 25.445);
((GeneralPath)shape).lineTo(13.421998, 24.541);
((GeneralPath)shape).lineTo(12.112998, 25.692001);
((GeneralPath)shape).lineTo(12.112998, 25.874);
((GeneralPath)shape).curveTo(11.716998, 25.759, 11.229998, 25.744001, 10.877998, 25.527);
((GeneralPath)shape).lineTo(10.586998, 24.705);
((GeneralPath)shape).lineTo(10.586998, 23.799);
((GeneralPath)shape).lineTo(9.714798, 23.881);
((GeneralPath)shape).curveTo(9.787598, 23.305, 9.859798, 22.73, 9.933098, 22.154001);
((GeneralPath)shape).lineTo(9.423798, 22.154001);
((GeneralPath)shape).lineTo(8.915498, 22.812);
((GeneralPath)shape).lineTo(8.406198, 23.058);
((GeneralPath)shape).lineTo(7.6790977, 22.648);
((GeneralPath)shape).lineTo(7.6062975, 21.743);
((GeneralPath)shape).lineTo(7.7517977, 20.755);
((GeneralPath)shape).lineTo(8.842598, 19.932999);
((GeneralPath)shape).lineTo(9.714698, 19.932999);
((GeneralPath)shape).lineTo(9.859698, 19.439);
((GeneralPath)shape).lineTo(10.949998, 19.685);
((GeneralPath)shape).lineTo(11.749998, 20.673);
((GeneralPath)shape).lineTo(11.894999, 19.027);
((GeneralPath)shape).lineTo(13.2769985, 17.875);
((GeneralPath)shape).lineTo(13.784999, 16.641);
((GeneralPath)shape).lineTo(14.802999, 16.230001);
((GeneralPath)shape).lineTo(15.383999, 15.408001);
((GeneralPath)shape).lineTo(16.692999, 15.160001);
((GeneralPath)shape).lineTo(17.346998, 14.173);
((GeneralPath)shape).lineTo(15.383998, 14.173);
((GeneralPath)shape).lineTo(16.619997, 13.597);
((GeneralPath)shape).lineTo(17.491997, 13.597);
((GeneralPath)shape).lineTo(18.727997, 13.185);
((GeneralPath)shape).lineTo(18.873997, 12.693001);
((GeneralPath)shape).lineTo(18.436996, 12.281001);
((GeneralPath)shape).lineTo(17.927996, 12.116001);
((GeneralPath)shape).lineTo(18.073996, 11.622001);
((GeneralPath)shape).lineTo(17.710995, 10.882001);
((GeneralPath)shape).lineTo(16.837996, 11.210001);
((GeneralPath)shape).lineTo(16.983995, 10.553001);
((GeneralPath)shape).lineTo(15.965996, 9.976501);
((GeneralPath)shape).lineTo(15.166996, 11.3740015);
((GeneralPath)shape).lineTo(15.238996, 11.868002);
((GeneralPath)shape).lineTo(14.439996, 12.199002);
((GeneralPath)shape).lineTo(13.929996, 13.2680025);
((GeneralPath)shape).lineTo(13.711995, 12.281002);
((GeneralPath)shape).lineTo(12.330996, 11.704002);
((GeneralPath)shape).lineTo(12.112995, 10.964003);
((GeneralPath)shape).lineTo(13.929996, 9.893903);
((GeneralPath)shape).lineTo(14.729996, 9.153703);
((GeneralPath)shape).lineTo(14.802996, 8.248902);
((GeneralPath)shape).lineTo(14.366996, 8.001802);
((GeneralPath)shape).lineTo(13.784996, 7.9193025);
((GeneralPath)shape).lineTo(13.421996, 8.824602);
((GeneralPath)shape).curveTo(13.421996, 8.824602, 12.813996, 8.943702, 12.657996, 8.982302);
((GeneralPath)shape).curveTo(10.661996, 10.822001, 6.6285963, 14.792002, 5.691596, 22.288301);
((GeneralPath)shape).curveTo(5.728696, 22.462301, 6.370796, 23.4703, 6.370796, 23.4703);
((GeneralPath)shape).lineTo(7.8971963, 24.3743);
((GeneralPath)shape).lineTo(9.423596, 24.7863);
((GeneralPath)shape).lineTo(10.077996, 25.6103);
((GeneralPath)shape).lineTo(11.095996, 26.3503);
((GeneralPath)shape).lineTo(11.676996, 26.2683);
((GeneralPath)shape).lineTo(12.112996, 26.464298);
((GeneralPath)shape).lineTo(12.112996, 26.597298);
((GeneralPath)shape).lineTo(11.531996, 28.160297);
((GeneralPath)shape).lineTo(11.0949955, 28.818298);
((GeneralPath)shape).lineTo(11.240995, 29.148298);
((GeneralPath)shape).lineTo(10.8779955, 30.381298);
((GeneralPath)shape).lineTo(12.185995, 32.7673);
((GeneralPath)shape).lineTo(13.493995, 33.9203);
((GeneralPath)shape).lineTo(14.0759945, 34.7423);
((GeneralPath)shape).lineTo(14.002995, 36.4703);
((GeneralPath)shape).lineTo(14.439995, 37.4573);
((GeneralPath)shape).lineTo(14.002995, 39.349297);
((GeneralPath)shape).curveTo(14.002995, 39.349297, 13.968994, 39.338295, 14.024995, 39.527298);
((GeneralPath)shape).curveTo(14.080995, 39.717297, 16.353994, 40.9783, 16.497995, 40.8713);
((GeneralPath)shape).curveTo(16.641994, 40.7623, 16.764996, 40.666298, 16.764996, 40.666298);
((GeneralPath)shape).lineTo(16.619995, 40.256298);
((GeneralPath)shape).lineTo(17.200994, 39.6793);
((GeneralPath)shape).lineTo(17.419994, 39.1033);
((GeneralPath)shape).lineTo(18.364994, 38.773296);
((GeneralPath)shape).lineTo(19.091993, 36.963295);
((GeneralPath)shape).lineTo(18.873993, 36.470295);
((GeneralPath)shape).lineTo(19.381992, 35.730293);
((GeneralPath)shape).lineTo(20.471992, 35.482292);
((GeneralPath)shape).lineTo(21.053993, 34.16629);
((GeneralPath)shape).lineTo(20.908993, 32.52129);
((GeneralPath)shape).lineTo(21.780993, 31.28729);
((GeneralPath)shape).lineTo(21.925993, 30.05229);
((GeneralPath)shape).curveTo(20.732992, 29.46129, 19.549994, 28.85129, 18.364992, 28.24229);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_5_0_0);
g.setTransform(defaultTransform__0_0_2_5_0);
g.setTransform(defaultTransform__0_0_2_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_6_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_6_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_6_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_6_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.766, 9.5649);
((GeneralPath)shape).lineTo(17.492, 10.059);
((GeneralPath)shape).lineTo(18.074001, 10.059);
((GeneralPath)shape).lineTo(18.074001, 9.4829);
((GeneralPath)shape).lineTo(17.348001, 9.1538);
((GeneralPath)shape).lineTo(16.766, 9.5649);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_6_0_0);
g.setTransform(defaultTransform__0_0_2_6_0);
g.setTransform(defaultTransform__0_0_2_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_7_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_7_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_7_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_7_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.876, 8.9072);
((GeneralPath)shape).lineTo(14.512, 9.812);
((GeneralPath)shape).lineTo(15.239, 9.812);
((GeneralPath)shape).lineTo(15.603001, 8.989201);
((GeneralPath)shape).curveTo(15.917001, 8.767501, 16.229, 8.5444, 16.548, 8.331);
((GeneralPath)shape).lineTo(17.275, 8.5781);
((GeneralPath)shape).curveTo(17.758999, 8.9072, 18.244, 9.2363, 18.729, 9.5649);
((GeneralPath)shape).lineTo(19.456, 8.907201);
((GeneralPath)shape).lineTo(18.656, 8.578101);
((GeneralPath)shape).lineTo(18.292, 7.8374014);
((GeneralPath)shape).lineTo(16.911, 7.6728015);
((GeneralPath)shape).lineTo(16.838, 7.2612014);
((GeneralPath)shape).lineTo(16.184, 7.4262013);
((GeneralPath)shape).lineTo(15.894, 8.002002);
((GeneralPath)shape).lineTo(15.53, 7.261302);
((GeneralPath)shape).lineTo(15.384999, 7.590402);
((GeneralPath)shape).lineTo(15.457999, 8.413202);
((GeneralPath)shape).lineTo(14.875999, 8.907203);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_7_0_0);
g.setTransform(defaultTransform__0_0_2_7_0);
g.setTransform(defaultTransform__0_0_2_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_8
g.setComposite(AlphaComposite.getInstance(3, 0.75f * origAlpha));
AffineTransform defaultTransform__0_0_2_8_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_8_0
g.setTransform(defaultTransform__0_0_2_8_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_8_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_8_1
g.setTransform(defaultTransform__0_0_2_8_1);
g.setTransform(defaultTransform__0_0_2_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_9
g.setComposite(AlphaComposite.getInstance(3, 0.75f * origAlpha));
AffineTransform defaultTransform__0_0_2_9_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_9_0
g.setTransform(defaultTransform__0_0_2_9_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_9_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_9_1
g.setTransform(defaultTransform__0_0_2_9_1);
g.setTransform(defaultTransform__0_0_2_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_10_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_10_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_10_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_10_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.492, 6.8496);
((GeneralPath)shape).lineTo(17.856, 6.521);
((GeneralPath)shape).lineTo(18.583, 6.3564);
((GeneralPath)shape).curveTo(19.081, 6.1142, 19.581, 5.9511, 20.11, 5.7802);
((GeneralPath)shape).lineTo(19.82, 5.2865);
((GeneralPath)shape).lineTo(18.881, 5.4213);
((GeneralPath)shape).lineTo(18.438, 5.8632);
((GeneralPath)shape).lineTo(17.706999, 5.9692);
((GeneralPath)shape).lineTo(17.057, 6.2744);
((GeneralPath)shape).lineTo(16.741, 6.4272003);
((GeneralPath)shape).lineTo(16.547998, 6.6855);
((GeneralPath)shape).lineTo(17.491999, 6.8496003);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_10_0_0);
g.setTransform(defaultTransform__0_0_2_10_0);
g.setTransform(defaultTransform__0_0_2_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_11_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_11_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_11_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_11_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.728, 14.666);
((GeneralPath)shape).lineTo(19.165, 14.008);
((GeneralPath)shape).lineTo(18.51, 13.515);
((GeneralPath)shape).lineTo(18.728, 14.666);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_11_0_0);
g.setTransform(defaultTransform__0_0_2_11_0);
g.setTransform(defaultTransform__0_0_2_11);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.3956f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new RadialGradientPaint(new Point2D.Double(15.60099983215332, 12.142000198364258), 43.527f, new Point2D.Double(15.60099983215332, 12.142000198364258), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 42)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9999899864196777f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(42.975, 23.486);
((GeneralPath)shape).curveTo(42.975, 33.651, 34.733997, 41.892, 24.568998, 41.892);
((GeneralPath)shape).curveTo(14.403999, 41.892, 6.162998, 33.650997, 6.162998, 23.485998);
((GeneralPath)shape).curveTo(6.1633983, 13.319998, 14.403998, 5.079998, 24.568998, 5.079998);
((GeneralPath)shape).curveTo(34.733997, 5.079898, 42.975, 13.319998, 42.975, 23.485998);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.13100004196167f, 0.613099992275238f, -0.47655999660491943f, 0.8791400194168091f, 54.090999603271484f, 16.04400062561035f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(-25.176000595092773, 30.05699920654297), new Point2D.Double(-22.25200080871582, 21.04199981689453), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.88164f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-2.8284, 21.042);
((GeneralPath)shape).curveTo(-2.803187, 24.431059, -5.7964487, 27.569181, -10.6747675, 29.268103);
((GeneralPath)shape).curveTo(-15.553087, 30.967022, -21.570711, 30.967022, -26.449032, 29.268103);
((GeneralPath)shape).curveTo(-31.32735, 27.569181, -34.32061, 24.431059, -34.2954, 21.042);
((GeneralPath)shape).curveTo(-34.32061, 17.65294, -31.32735, 14.514817, -26.44903, 12.815898);
((GeneralPath)shape).curveTo(-21.570711, 11.116979, -15.553086, 11.116979, -10.6747675, 12.815898);
((GeneralPath)shape).curveTo(-5.796448, 14.514817, -2.8031867, 17.65294, -2.8283997, 21.042);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(0.939329981803894f, -0.8790900111198425f, 0.6833099722862244f, 0.7301300168037415f, 32.31399917602539f, -4.451600074768066f));
// _0_0_5
paint = new LinearGradientPaint(new Point2D.Double(-25.176000595092773, 30.05699920654297), new Point2D.Double(-22.11400032043457, 22.66200065612793), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.88164f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-2.8284, 21.042);
((GeneralPath)shape).curveTo(-2.803187, 24.431059, -5.7964487, 27.569181, -10.6747675, 29.268103);
((GeneralPath)shape).curveTo(-15.553087, 30.967022, -21.570711, 30.967022, -26.449032, 29.268103);
((GeneralPath)shape).curveTo(-31.32735, 27.569181, -34.32061, 24.431059, -34.2954, 21.042);
((GeneralPath)shape).curveTo(-34.32061, 17.65294, -31.32735, 14.514817, -26.44903, 12.815898);
((GeneralPath)shape).curveTo(-21.570711, 11.116979, -15.553086, 11.116979, -10.6747675, 12.815898);
((GeneralPath)shape).curveTo(-5.796448, 14.514817, -2.8031867, 17.65294, -2.8283997, 21.042);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(-1.045799970626831f, 0.7672500014305115f, 0.7672500014305115f, 1.045799970626831f, 35.617000579833984f, -22.143999099731445f));
// _0_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.949999809265137f, 22.93000030517578f));
// _0_0_6_0
paint = new RadialGradientPaint(new Point2D.Double(12.071000099182129, 12.493000030517578), 6.7175f, new Point2D.Double(12.071000099182129, 12.493000030517578), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.789, 12.493);
((GeneralPath)shape).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611);
((GeneralPath)shape).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611);
((GeneralPath)shape).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493);
((GeneralPath)shape).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388);
((GeneralPath)shape).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388);
((GeneralPath)shape).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6_1 = g.getTransform();
g.transform(new AffineTransform(0.30827000737190247f, 0.0f, 0.0f, 0.30827000737190247f, 23.299999237060547f, 31.57200050354004f));
// _0_0_6_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.789, 12.493);
((GeneralPath)shape).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611);
((GeneralPath)shape).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611);
((GeneralPath)shape).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493);
((GeneralPath)shape).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388);
((GeneralPath)shape).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388);
((GeneralPath)shape).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6_1);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(-1.2803000211715698f, -0.12615999579429626f, 0.09806200116872787f, -0.9951800107955933f, -2.405100107192993f, 40.52399826049805f));
// _0_0_7
paint = new LinearGradientPaint(new Point2D.Double(-22.822999954223633, 28.33799934387207), new Point2D.Double(-22.11400032043457, 22.66200065612793), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.88164f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-2.8284, 21.042);
((GeneralPath)shape).curveTo(-2.803187, 24.431059, -5.7964487, 27.569181, -10.6747675, 29.268103);
((GeneralPath)shape).curveTo(-15.553087, 30.967022, -21.570711, 30.967022, -26.449032, 29.268103);
((GeneralPath)shape).curveTo(-31.32735, 27.569181, -34.32061, 24.431059, -34.2954, 21.042);
((GeneralPath)shape).curveTo(-34.32061, 17.65294, -31.32735, 14.514817, -26.44903, 12.815898);
((GeneralPath)shape).curveTo(-21.570711, 11.116979, -15.553086, 11.116979, -10.6747675, 12.815898);
((GeneralPath)shape).curveTo(-5.796448, 14.514817, -2.8031867, 17.65294, -2.8283997, 21.042);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(0.9178699851036072f, -0.8589800000190735f, 0.6676999926567078f, 0.7134299874305725f, 27.632999420166016f, -6.90910005569458f));
// _0_0_8
paint = new LinearGradientPaint(new Point2D.Double(-21.659000396728516, 15.64900016784668), new Point2D.Double(-21.961999893188477, 21.336000442504883), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.90226f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-2.8284, 21.042);
((GeneralPath)shape).curveTo(-2.803187, 24.431059, -5.7964487, 27.569181, -10.6747675, 29.268103);
((GeneralPath)shape).curveTo(-15.553087, 30.967022, -21.570711, 30.967022, -26.449032, 29.268103);
((GeneralPath)shape).curveTo(-31.32735, 27.569181, -34.32061, 24.431059, -34.2954, 21.042);
((GeneralPath)shape).curveTo(-34.32061, 17.65294, -31.32735, 14.514817, -26.44903, 12.815898);
((GeneralPath)shape).curveTo(-21.570711, 11.116979, -15.553086, 11.116979, -10.6747675, 12.815898);
((GeneralPath)shape).curveTo(-5.796448, 14.514817, -2.8031867, 17.65294, -2.8283997, 21.042);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(-0.8062800168991089f, 0.5915399789810181f, 0.5915399789810181f, 0.8062800168991089f, 12.38599967956543f, -18.02899932861328f));
// _0_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.949999809265137f, 22.93000030517578f));
// _0_0_9_0
paint = new RadialGradientPaint(new Point2D.Double(12.071000099182129, 12.493000030517578), 6.7175f, new Point2D.Double(12.071000099182129, 12.493000030517578), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.789, 12.493);
((GeneralPath)shape).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611);
((GeneralPath)shape).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611);
((GeneralPath)shape).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493);
((GeneralPath)shape).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388);
((GeneralPath)shape).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388);
((GeneralPath)shape).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9_1 = g.getTransform();
g.transform(new AffineTransform(0.30827000737190247f, 0.0f, 0.0f, 0.30827000737190247f, 23.299999237060547f, 31.57200050354004f));
// _0_0_9_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.789, 12.493);
((GeneralPath)shape).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611);
((GeneralPath)shape).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611);
((GeneralPath)shape).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493);
((GeneralPath)shape).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388);
((GeneralPath)shape).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388);
((GeneralPath)shape).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9_1);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(-0.8062800168991089f, 0.5915399789810181f, 0.5915399789810181f, 0.8062800168991089f, 13.49899959564209f, -31.5f));
// _0_0_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.949999809265137f, 22.93000030517578f));
// _0_0_10_0
paint = new RadialGradientPaint(new Point2D.Double(12.071000099182129, 12.493000030517578), 6.7175f, new Point2D.Double(12.071000099182129, 12.493000030517578), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.789, 12.493);
((GeneralPath)shape).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611);
((GeneralPath)shape).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611);
((GeneralPath)shape).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493);
((GeneralPath)shape).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388);
((GeneralPath)shape).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388);
((GeneralPath)shape).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_1 = g.getTransform();
g.transform(new AffineTransform(0.30827000737190247f, 0.0f, 0.0f, 0.30827000737190247f, 23.299999237060547f, 31.57200050354004f));
// _0_0_10_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.789, 12.493);
((GeneralPath)shape).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611);
((GeneralPath)shape).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611);
((GeneralPath)shape).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493);
((GeneralPath)shape).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388);
((GeneralPath)shape).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388);
((GeneralPath)shape).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_1);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(-0.8702300190925598f, 0.6385700106620789f, 0.6384599804878235f, 0.8703799843788147f, 25.204999923706055f, -35.3129997253418f));
// _0_0_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.949999809265137f, 22.93000030517578f));
// _0_0_11_0
paint = new RadialGradientPaint(new Point2D.Double(12.071000099182129, 12.493000030517578), 6.7175f, new Point2D.Double(12.071000099182129, 12.493000030517578), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.789, 12.493);
((GeneralPath)shape).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611);
((GeneralPath)shape).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611);
((GeneralPath)shape).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493);
((GeneralPath)shape).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388);
((GeneralPath)shape).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388);
((GeneralPath)shape).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11_1 = g.getTransform();
g.transform(new AffineTransform(0.30827000737190247f, 0.0f, 0.0f, 0.30827000737190247f, 23.299999237060547f, 31.57200050354004f));
// _0_0_11_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.789, 12.493);
((GeneralPath)shape).curveTo(18.799765, 14.900088, 17.521776, 17.12895, 15.4389515, 18.335611);
((GeneralPath)shape).curveTo(13.356128, 19.542274, 10.786871, 19.542274, 8.704047, 18.335611);
((GeneralPath)shape).curveTo(6.621223, 17.12895, 5.343234, 14.900088, 5.353999, 12.493);
((GeneralPath)shape).curveTo(5.343234, 10.085912, 6.621223, 7.8570504, 8.704047, 6.650388);
((GeneralPath)shape).curveTo(10.786871, 5.4437256, 13.356128, 5.4437256, 15.4389515, 6.650388);
((GeneralPath)shape).curveTo(17.521776, 7.8570504, 18.799765, 10.085912, 18.789, 12.493);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11_1);
g.setTransform(defaultTransform__0_0_11);
g.setTransform(defaultTransform__0_0);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. It is recommended to use the 
	 * {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	public Applications_internet() {
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
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);

        double coef1 = (double) this.width / (double) getOrigWidth();
        double coef2 = (double) this.height / (double) getOrigHeight();
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
     * Returns an instance of this icon with specified dimensions.
     */
    public static Applications_internet of(int width, int height) {
       Applications_internet result = new Applications_internet();
       result.width = width;
       result.height = height;
       return result;
    }
}

