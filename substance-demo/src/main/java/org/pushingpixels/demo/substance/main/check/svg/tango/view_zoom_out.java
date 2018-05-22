package org.pushingpixels.demo.substance.main.check.svg.tango;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.Icon;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.icon.IsHiDpiAware;
import org.pushingpixels.substance.api.icon.IsResizable;
import org.pushingpixels.substance.api.icon.SubstanceIcon;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/ibis">Ibis SVG transcoder</a>.
 */
public class view_zoom_out implements Icon, IsResizable, IsHiDpiAware, UIResource {
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
g.setComposite(AlphaComposite.getInstance(3, 0.17112301f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.446431040763855f, 0.0f, 0.0f, 1.5199899673461914f, -10.974530220031738f, -17.751680374145508f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(24.13001823425293, 37.96792221069336), 16.528622f, new Point2D.Double(24.13001823425293, 37.96792221069336), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.23796799778938293f, -2.47198095326695E-16f, 28.93277931213379f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(40.65864, 37.967922);
((GeneralPath)shape).curveTo(40.685127, 39.37734, 37.540596, 40.6824, 32.415745, 41.38893);
((GeneralPath)shape).curveTo(27.290888, 42.095467, 20.969152, 42.095467, 15.844297, 41.38893);
((GeneralPath)shape).curveTo(10.719443, 40.6824, 7.574911, 39.37734, 7.6013985, 37.967922);
((GeneralPath)shape).curveTo(7.574911, 36.558506, 10.719443, 35.253445, 15.844297, 34.546913);
((GeneralPath)shape).curveTo(20.969152, 33.840378, 27.290888, 33.840378, 32.415745, 34.546913);
((GeneralPath)shape).curveTo(37.540596, 35.253445, 40.685127, 36.558506, 40.65864, 37.967922);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(0.497763991355896f, 0.0f, 0.0f, 0.609620988368988f, 8.973526000976562f, 15.619290351867676f));
// _0_0_1
paint = new RadialGradientPaint(new Point2D.Double(24.13001823425293, 37.96792221069336), 16.528622f, new Point2D.Double(24.13001823425293, 37.96792221069336), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.23796799778938293f, 3.1528590705548996E-15f, 28.93277931213379f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(40.65864, 37.967922);
((GeneralPath)shape).curveTo(40.685127, 39.37734, 37.540596, 40.6824, 32.415745, 41.38893);
((GeneralPath)shape).curveTo(27.290888, 42.095467, 20.969152, 42.095467, 15.844297, 41.38893);
((GeneralPath)shape).curveTo(10.719443, 40.6824, 7.574911, 39.37734, 7.6013985, 37.967922);
((GeneralPath)shape).curveTo(7.574911, 36.558506, 10.719443, 35.253445, 15.844297, 34.546913);
((GeneralPath)shape).curveTo(20.969152, 33.840378, 27.290888, 33.840378, 32.415745, 34.546913);
((GeneralPath)shape).curveTo(37.540596, 35.253445, 40.685127, 36.558506, 40.65864, 37.967922);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.12372323125600815f, 0.07535096257925034f));
// _0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0_0
paint = new Color(220, 220, 220, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.62757, 3.1435547);
((GeneralPath)shape).curveTo(10.48844, 3.1435547, 3.8827686, 9.749226, 3.8827686, 17.888355);
((GeneralPath)shape).curveTo(3.8827686, 26.027485, 10.48844, 32.633156, 18.62757, 32.633156);
((GeneralPath)shape).curveTo(22.107124, 32.633156, 25.17857, 31.248762, 27.701292, 29.230509);
((GeneralPath)shape).curveTo(27.495914, 30.23739, 27.623262, 31.265877, 28.457436, 31.990433);
((GeneralPath)shape).lineTo(39.42152, 41.51784);
((GeneralPath)shape).curveTo(40.654938, 42.58917, 42.508984, 42.448803, 43.58031, 41.215385);
((GeneralPath)shape).curveTo(44.651638, 39.981968, 44.51127, 38.127922, 43.277855, 37.056595);
((GeneralPath)shape).lineTo(32.31377, 27.529188);
((GeneralPath)shape).curveTo(31.642242, 26.94591, 30.820892, 26.77322, 30.007532, 26.886467);
((GeneralPath)shape).curveTo(31.994232, 24.374044, 33.37237, 21.337664, 33.37237, 17.888357);
((GeneralPath)shape).curveTo(33.37237, 9.749228, 26.7667, 3.1435556, 18.627571, 3.1435556);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.551949, 4.369738);
((GeneralPath)shape).curveTo(26.191408, 4.369738, 31.843723, 9.158689, 31.843723, 17.661512);
((GeneralPath)shape).curveTo(31.843723, 26.336624, 26.027033, 30.953287, 18.551949, 30.953287);
((GeneralPath)shape).curveTo(11.249, 30.953287, 5.2601748, 25.475195, 5.2601748, 17.661512);
((GeneralPath)shape).curveTo(5.2601748, 9.677405, 11.084813, 4.3697376, 18.551949, 4.3697376);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(27.36634063720703, 26.58029556274414), new Point2D.Double(31.33596420288086, 30.557771682739258), new float[] {0.0f,1.0f}, new Color[] {new Color(138, 138, 138, 255),new Color(72, 72, 72, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.000001f,1,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.62757, 3.1435547);
((GeneralPath)shape).curveTo(10.48844, 3.1435547, 3.8827686, 9.749226, 3.8827686, 17.888355);
((GeneralPath)shape).curveTo(3.8827686, 26.027485, 10.48844, 32.633156, 18.62757, 32.633156);
((GeneralPath)shape).curveTo(22.107124, 32.633156, 25.17857, 31.248762, 27.701292, 29.230509);
((GeneralPath)shape).curveTo(27.495914, 30.23739, 27.623262, 31.265877, 28.457436, 31.990433);
((GeneralPath)shape).lineTo(39.42152, 41.51784);
((GeneralPath)shape).curveTo(40.654938, 42.58917, 42.508984, 42.448803, 43.58031, 41.215385);
((GeneralPath)shape).curveTo(44.651638, 39.981968, 44.51127, 38.127922, 43.277855, 37.056595);
((GeneralPath)shape).lineTo(32.31377, 27.529188);
((GeneralPath)shape).curveTo(31.642242, 26.94591, 30.820892, 26.77322, 30.007532, 26.886467);
((GeneralPath)shape).curveTo(31.994232, 24.374044, 33.37237, 21.337664, 33.37237, 17.888357);
((GeneralPath)shape).curveTo(33.37237, 9.749228, 26.7667, 3.1435556, 18.627571, 3.1435556);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.551949, 4.369738);
((GeneralPath)shape).curveTo(26.191408, 4.369738, 31.843723, 9.158689, 31.843723, 17.661512);
((GeneralPath)shape).curveTo(31.843723, 26.336624, 26.027033, 30.953287, 18.551949, 30.953287);
((GeneralPath)shape).curveTo(11.249, 30.953287, 5.2601748, 25.475195, 5.2601748, 17.661512);
((GeneralPath)shape).curveTo(5.2601748, 9.677405, 11.084813, 4.3697376, 18.551949, 4.3697376);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0_1
paint = new Color(220, 220, 220, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.602905, 3.0803552);
((GeneralPath)shape).curveTo(10.437466, 3.0803552, 3.810441, 9.707379, 3.810441, 17.87282);
((GeneralPath)shape).curveTo(3.810441, 26.03826, 10.437466, 32.665283, 18.602905, 32.665283);
((GeneralPath)shape).curveTo(22.093708, 32.665283, 25.175083, 31.276417, 27.70596, 29.251638);
((GeneralPath)shape).curveTo(27.499918, 30.261774, 27.627668, 31.293585, 28.464546, 32.020485);
((GeneralPath)shape).lineTo(39.464073, 41.57869);
((GeneralPath)shape).curveTo(40.701477, 42.65348, 42.561516, 42.51266, 43.636307, 41.275253);
((GeneralPath)shape).curveTo(44.711098, 40.03785, 44.570274, 38.17781, 43.33287, 37.10302);
((GeneralPath)shape).lineTo(32.333347, 27.544815);
((GeneralPath)shape).curveTo(31.659649, 26.959652, 30.835644, 26.786402, 30.019653, 26.900017);
((GeneralPath)shape).curveTo(32.012775, 24.379473, 33.39537, 21.333277, 33.39537, 17.87282);
((GeneralPath)shape).curveTo(33.39537, 9.70738, 26.768347, 3.0803556, 18.602905, 3.0803556);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.527046, 6.266424);
((GeneralPath)shape).curveTo(24.808155, 6.266424, 29.905865, 11.364135, 29.905865, 17.645243);
((GeneralPath)shape).curveTo(29.905865, 23.92635, 24.808155, 29.02406, 18.527046, 29.02406);
((GeneralPath)shape).curveTo(12.245938, 29.02406, 7.1482277, 23.92635, 7.1482277, 17.64524);
((GeneralPath)shape).curveTo(7.1482277, 11.364133, 12.245938, 6.2664223, 18.527046, 6.2664223);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0_2
paint = new LinearGradientPaint(new Point2D.Double(30.65625, 34.0), new Point2D.Double(33.21875, 31.0625), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(125, 125, 125, 255),new Color(177, 177, 177, 255),new Color(104, 104, 104, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.3345930576324463f, 0.0f, 0.0f, 1.2912919521331787f, -6.973842144012451f, -7.460658073425293f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.507004, 41.57769);
((GeneralPath)shape).curveTo(39.02833, 39.304504, 40.904335, 36.76627, 43.091057, 36.789314);
((GeneralPath)shape).curveTo(43.091057, 36.789314, 32.33069, 27.531204, 32.33069, 27.531204);
((GeneralPath)shape).curveTo(29.385897, 27.474495, 28.061186, 29.80382, 28.553875, 32.131126);
((GeneralPath)shape).lineTo(39.507004, 41.57769);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0_3 = g.getTransform();
g.transform(new AffineTransform(1.2457430362701416f, 0.0f, 0.0f, 1.2457430362701416f, -3.4253458976745605f, -6.177032947540283f));
// _0_1_0_3
paint = new LinearGradientPaint(new Point2D.Double(18.292673110961914, 13.602121353149414), new Point2D.Double(17.500892639160156, 25.74346923828125), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 56),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.8027336f,1,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.549437, 18.920233);
((GeneralPath)shape).curveTo(28.567142, 22.879269, 26.465181, 26.545166, 23.039478, 28.529814);
((GeneralPath)shape).curveTo(19.613773, 30.51446, 15.388013, 30.51446, 11.962308, 28.529814);
((GeneralPath)shape).curveTo(8.536603, 26.545166, 6.4346433, 22.879269, 6.4523487, 18.920233);
((GeneralPath)shape).curveTo(6.4346433, 14.961198, 8.536603, 11.295299, 11.962308, 9.310653);
((GeneralPath)shape).curveTo(15.388013, 7.326006, 19.613773, 7.326006, 23.039478, 9.310653);
((GeneralPath)shape).curveTo(26.465181, 11.295299, 28.567142, 14.961198, 28.549437, 18.920233);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_0_3);
g.setComposite(AlphaComposite.getInstance(3, 0.43315506f * origAlpha));
AffineTransform defaultTransform__0_1_0_4 = g.getTransform();
g.transform(new AffineTransform(0.7529860138893127f, 0.658037006855011f, -0.6489019989967346f, 0.7608720064163208f, 0.0f, 0.0f));
// _0_1_0_4
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0000311f,1,0,10.0f,null,0.0f);
shape = new RoundRectangle2D.Double(40.37333679199219, 0.14086054265499115, 19.048439025878906, 4.440478324890137, 4.273321628570557, 3.7758729457855225);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0_5 = g.getTransform();
g.transform(new AffineTransform(1.3986140489578247f, 0.0f, 0.0f, 1.3986140489578247f, -6.224338054656982f, -8.298957824707031f));
// _0_1_0_5
paint = new RadialGradientPaint(new Point2D.Double(18.240928649902344, 21.8179874420166), 8.308505f, new Point2D.Double(18.240928649902344, 21.8179874420166), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 53),new Color(114, 159, 207, 172)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.897785, 18.478292);
((GeneralPath)shape).curveTo(25.9111, 21.455486, 24.330425, 24.212242, 21.754295, 25.704697);
((GeneralPath)shape).curveTo(19.178165, 27.197151, 16.000395, 27.197151, 13.424264, 25.704697);
((GeneralPath)shape).curveTo(10.848134, 24.212242, 9.267461, 21.455486, 9.280775, 18.478292);
((GeneralPath)shape).curveTo(9.267461, 15.501098, 10.848134, 12.744342, 13.424264, 11.251888);
((GeneralPath)shape).curveTo(16.000395, 9.759434, 19.178165, 9.759434, 21.754295, 11.251888);
((GeneralPath)shape).curveTo(24.330425, 12.744342, 25.9111, 15.501098, 25.897785, 18.478292);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(48, 99, 163, 255);
stroke = new BasicStroke(0.71499395f,1,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.897785, 18.478292);
((GeneralPath)shape).curveTo(25.9111, 21.455486, 24.330425, 24.212242, 21.754295, 25.704697);
((GeneralPath)shape).curveTo(19.178165, 27.197151, 16.000395, 27.197151, 13.424264, 25.704697);
((GeneralPath)shape).curveTo(10.848134, 24.212242, 9.267461, 21.455486, 9.280775, 18.478292);
((GeneralPath)shape).curveTo(9.267461, 15.501098, 10.848134, 12.744342, 13.424264, 11.251888);
((GeneralPath)shape).curveTo(16.000395, 9.759434, 19.178165, 9.759434, 21.754295, 11.251888);
((GeneralPath)shape).curveTo(24.330425, 12.744342, 25.9111, 15.501098, 25.897785, 18.478292);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_0_5);
g.setComposite(AlphaComposite.getInstance(3, 0.8342246f * origAlpha));
AffineTransform defaultTransform__0_1_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0_6
paint = new RadialGradientPaint(new Point2D.Double(15.4143705368042, 13.078408241271973), 6.65625f, new Point2D.Double(15.4143705368042, 13.078408241271973), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 63)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.5929629802703857f, 0.0f, 0.0f, 2.2521040439605713f, -25.059749603271484f, -18.94099998474121f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.156916, 7.3966937);
((GeneralPath)shape).curveTo(12.949326, 7.3966937, 8.732368, 11.613651, 8.732368, 16.821241);
((GeneralPath)shape).curveTo(8.732368, 18.325216, 9.152676, 19.709015, 9.77954, 20.971144);
((GeneralPath)shape).curveTo(11.03192, 21.432756, 12.362297, 21.746826, 13.774307, 21.746826);
((GeneralPath)shape).curveTo(19.945263, 21.746826, 24.873589, 16.88519, 25.254414, 10.809697);
((GeneralPath)shape).curveTo(23.523449, 8.764167, 21.044374, 7.3966937, 18.156916, 7.3966937);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_0_6);
g.setTransform(defaultTransform__0_1_0);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(0.5028156042098999f, 0.0f, 0.0f, 0.5028156042098999f, 6.317196846008301f, 5.165855884552002f));
// _0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0
paint = new Color(81, 138, 196, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.307563, 20.552553);
((GeneralPath)shape).lineTo(10.307563, 28.507755);
((GeneralPath)shape).lineTo(20.251568, 28.507755);
((GeneralPath)shape).lineTo(28.206772, 28.507755);
((GeneralPath)shape).lineTo(38.150776, 28.507755);
((GeneralPath)shape).lineTo(38.150776, 20.552551);
((GeneralPath)shape).lineTo(28.206772, 20.552551);
((GeneralPath)shape).lineTo(20.251568, 20.552551);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(52, 101, 164, 255);
stroke = new BasicStroke(1.9888006f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.307563, 20.552553);
((GeneralPath)shape).lineTo(10.307563, 28.507755);
((GeneralPath)shape).lineTo(20.251568, 28.507755);
((GeneralPath)shape).lineTo(28.206772, 28.507755);
((GeneralPath)shape).lineTo(38.150776, 28.507755);
((GeneralPath)shape).lineTo(38.150776, 20.552551);
((GeneralPath)shape).lineTo(28.206772, 20.552551);
((GeneralPath)shape).lineTo(20.251568, 20.552551);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_0_0);
g.setComposite(AlphaComposite.getInstance(3, 0.41f * origAlpha));
AffineTransform defaultTransform__0_2_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1
paint = new Color(238, 238, 236, 255);
stroke = new BasicStroke(1.9888006f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.296364, 22.541353);
((GeneralPath)shape).lineTo(12.296364, 26.518955);
((GeneralPath)shape).lineTo(22.240368, 26.518955);
((GeneralPath)shape).lineTo(26.217968, 26.518955);
((GeneralPath)shape).lineTo(36.161972, 26.518955);
((GeneralPath)shape).lineTo(36.161972, 22.541355);
((GeneralPath)shape).lineTo(26.217968, 22.541355);
((GeneralPath)shape).lineTo(22.240368, 22.541355);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.4f * origAlpha));
AffineTransform defaultTransform__0_2_0_2 = g.getTransform();
g.transform(new AffineTransform(1.9888006448745728f, 0.0f, 0.0f, 1.9888006448745728f, -12.563645362854004f, -10.273857116699219f));
// _0_2_0_2
paint = new Color(238, 238, 236, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.0, 16.0);
((GeneralPath)shape).lineTo(16.5, 16.0);
((GeneralPath)shape).lineTo(12.0, 16.0);
((GeneralPath)shape).lineTo(12.0, 18.1875);
((GeneralPath)shape).curveTo(13.648689, 17.33277, 16.029589, 16.807531, 18.461166, 17.484835);
((GeneralPath)shape).curveTo(20.155914, 17.956898, 23.079975, 17.91651, 25.0, 17.625);
((GeneralPath)shape).lineTo(25.0, 16.0);
((GeneralPath)shape).lineTo(20.5, 16.0);
((GeneralPath)shape).lineTo(20.0, 16.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0_2);
g.setTransform(defaultTransform__0_2_0);
g.setTransform(defaultTransform__0_2);
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
        return 2.218905210494995;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 47.87369918823242;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 44.014102935791016;
	}

    /** The current width of this resizable icon. */
    private int width;

    /** The current height of this resizable icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image. It is recommended to use the 
     * {@link #of(int, int)} method to obtain a pre-configured instance.
     */
	public view_zoom_out() {
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
    public boolean isHiDpiAware() {
        return true;
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
    public static SubstanceIcon of(int width, int height) {
       view_zoom_out base = new view_zoom_out();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       view_zoom_out base = new view_zoom_out();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

