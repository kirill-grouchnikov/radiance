package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_ods implements ResizableIcon {
    

    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Shape clip = null;

        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
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
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 97.0), new Point2D.Double(36.20000076293945, -1.0), new float[] {0.029f,0.462f,0.998f}, new Color[] {new Color(35, 84, 39, 255),new Color(78, 176, 86, 255),new Color(100, 214, 109, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(0.30000001192092896, 50.0), new Point2D.Double(72.0999984741211, 50.0), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(7, 114, 101, 0),new Color(0, 106, 105, 0),new Color(0, 56, 54, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(35, 84, 39, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.2, 81.3);
((GeneralPath)shape).curveTo(7.2, 79.3, 7.5, 77.600006, 8.099999, 76.200005);
((GeneralPath)shape).curveTo(8.599999, 75.200005, 9.2, 74.3, 9.999999, 73.50001);
((GeneralPath)shape).curveTo(10.799999, 72.700005, 11.599999, 72.100006, 12.599998, 71.700005);
((GeneralPath)shape).curveTo(13.799998, 71.200005, 15.299998, 70.9, 16.899998, 70.9);
((GeneralPath)shape).curveTo(19.799997, 70.9, 22.199997, 71.8, 23.999998, 73.6);
((GeneralPath)shape).curveTo(25.8, 75.399994, 26.599998, 77.9, 26.599998, 81.2);
((GeneralPath)shape).curveTo(26.599998, 84.399994, 25.699999, 86.899994, 23.999998, 88.7);
((GeneralPath)shape).curveTo(22.299997, 90.5, 19.899998, 91.399994, 16.999998, 91.399994);
((GeneralPath)shape).curveTo(13.999998, 91.399994, 11.699998, 90.49999, 9.899998, 88.7);
((GeneralPath)shape).curveTo(8.0999975, 86.899994, 7.199998, 84.399994, 7.199998, 81.299995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(11.299999, 81.100006);
((GeneralPath)shape).curveTo(11.299999, 83.3, 11.799999, 85.100006, 12.9, 86.200005);
((GeneralPath)shape).curveTo(13.9, 87.4, 15.299999, 87.9, 16.9, 87.9);
((GeneralPath)shape).curveTo(18.5, 87.9, 19.8, 87.3, 20.9, 86.200005);
((GeneralPath)shape).curveTo(21.9, 85.00001, 22.4, 83.3, 22.4, 81.00001);
((GeneralPath)shape).curveTo(22.4, 78.700005, 21.9, 77.00001, 20.9, 75.90001);
((GeneralPath)shape).curveTo(19.9, 74.80001, 18.6, 74.20001, 16.9, 74.20001);
((GeneralPath)shape).curveTo(15.199999, 74.20001, 13.9, 74.80001, 12.9, 75.90001);
((GeneralPath)shape).curveTo(11.799999, 77.100006, 11.299999, 78.90001, 11.299999, 81.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.699999, 71.200005);
((GeneralPath)shape).lineTo(37.1, 71.200005);
((GeneralPath)shape).curveTo(38.8, 71.200005, 40.0, 71.3, 40.899998, 71.600006);
((GeneralPath)shape).curveTo(42.1, 71.90001, 43.1, 72.600006, 43.899998, 73.40001);
((GeneralPath)shape).curveTo(44.699997, 74.30001, 45.399998, 75.30001, 45.8, 76.600006);
((GeneralPath)shape).curveTo(46.2, 77.90001, 46.5, 79.40001, 46.5, 81.3);
((GeneralPath)shape).curveTo(46.5, 82.9, 46.3, 84.3, 45.9, 85.5);
((GeneralPath)shape).curveTo(45.4, 86.9, 44.7, 88.1, 43.800003, 89.0);
((GeneralPath)shape).curveTo(43.100002, 89.7, 42.200005, 90.2, 41.000004, 90.6);
((GeneralPath)shape).curveTo(40.100002, 90.9, 38.900005, 91.0, 37.400005, 91.0);
((GeneralPath)shape).lineTo(29.800005, 91.0);
((GeneralPath)shape).lineTo(29.800005, 71.2);
((GeneralPath)shape).lineTo(29.700005, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.699997, 74.600006);
((GeneralPath)shape).lineTo(33.699997, 87.700005);
((GeneralPath)shape).lineTo(36.699997, 87.700005);
((GeneralPath)shape).curveTo(37.799995, 87.700005, 38.6, 87.600006, 39.1, 87.50001);
((GeneralPath)shape).curveTo(39.8, 87.30001, 40.3, 87.100006, 40.699997, 86.700005);
((GeneralPath)shape).curveTo(41.1, 86.3, 41.499996, 85.700005, 41.799995, 84.8);
((GeneralPath)shape).curveTo(42.099995, 83.9, 42.199997, 82.700005, 42.199997, 81.200005);
((GeneralPath)shape).curveTo(42.199997, 79.700005, 42.1, 78.50001, 41.799995, 77.700005);
((GeneralPath)shape).curveTo(41.499996, 76.9, 41.099995, 76.200005, 40.699997, 75.8);
((GeneralPath)shape).curveTo(40.199997, 75.3, 39.6, 75.0, 38.799995, 74.9);
((GeneralPath)shape).curveTo(38.199997, 74.8, 37.099995, 74.700005, 35.499996, 74.700005);
((GeneralPath)shape).lineTo(33.699997, 74.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.799995, 84.600006);
((GeneralPath)shape).lineTo(52.699997, 84.200005);
((GeneralPath)shape).curveTo(52.899998, 85.50001, 53.399998, 86.50001, 54.1, 87.100006);
((GeneralPath)shape).curveTo(54.8, 87.700005, 55.8, 88.00001, 57.0, 88.00001);
((GeneralPath)shape).curveTo(58.3, 88.00001, 59.3, 87.700005, 59.9, 87.200005);
((GeneralPath)shape).curveTo(60.600002, 86.700005, 60.9, 86.00001, 60.9, 85.3);
((GeneralPath)shape).curveTo(60.9, 84.8, 60.800003, 84.4, 60.5, 84.100006);
((GeneralPath)shape).curveTo(60.199997, 83.80001, 59.7, 83.50001, 59.0, 83.200005);
((GeneralPath)shape).curveTo(58.5, 83.00001, 57.5, 82.700005, 55.8, 82.3);
((GeneralPath)shape).curveTo(53.6, 81.8, 52.1, 81.100006, 51.2, 80.3);
((GeneralPath)shape).curveTo(50.0, 79.200005, 49.4, 77.9, 49.4, 76.3);
((GeneralPath)shape).curveTo(49.4, 75.3, 49.7, 74.3, 50.300003, 73.5);
((GeneralPath)shape).curveTo(50.9, 72.6, 51.700005, 72.0, 52.800003, 71.5);
((GeneralPath)shape).curveTo(53.9, 71.0, 55.200005, 70.8, 56.700005, 70.8);
((GeneralPath)shape).curveTo(59.200005, 70.8, 61.100006, 71.3, 62.400005, 72.4);
((GeneralPath)shape).curveTo(63.700005, 73.5, 64.3, 74.9, 64.40001, 76.8);
((GeneralPath)shape).lineTo(60.40001, 77.0);
((GeneralPath)shape).curveTo(60.20001, 76.0, 59.90001, 75.2, 59.30001, 74.8);
((GeneralPath)shape).curveTo(58.700012, 74.40001, 57.90001, 74.100006, 56.700012, 74.100006);
((GeneralPath)shape).curveTo(55.50001, 74.100006, 54.600014, 74.3, 53.900013, 74.8);
((GeneralPath)shape).curveTo(53.50001, 75.100006, 53.300014, 75.5, 53.300014, 76.0);
((GeneralPath)shape).curveTo(53.300014, 76.5, 53.500015, 76.9, 53.900013, 77.2);
((GeneralPath)shape).curveTo(54.400013, 77.6, 55.600014, 78.1, 57.600014, 78.5);
((GeneralPath)shape).curveTo(59.600014, 79.0, 61.000015, 79.4, 62.000015, 79.9);
((GeneralPath)shape).curveTo(62.900017, 80.4, 63.700016, 81.1, 64.20001, 81.9);
((GeneralPath)shape).curveTo(64.70001, 82.700005, 65.000015, 83.8, 65.000015, 85.1);
((GeneralPath)shape).curveTo(65.000015, 86.2, 64.70001, 87.299995, 64.000015, 88.299995);
((GeneralPath)shape).curveTo(63.400017, 89.299995, 62.500015, 89.99999, 61.300014, 90.49999);
((GeneralPath)shape).curveTo(60.100014, 90.99999, 58.700016, 91.19999, 57.000015, 91.19999);
((GeneralPath)shape).curveTo(54.500015, 91.19999, 52.500015, 90.59999, 51.200016, 89.49999);
((GeneralPath)shape).curveTo(49.900017, 88.49999, 49.100018, 86.799995, 48.800014, 84.59999);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.22100067138672, 25.77899932861328), new Point2D.Double(58.672000885009766, 12.329000473022461), new float[] {0.484f,0.931f,0.998f}, new Color[] {new Color(204, 248, 210, 255),new Color(66, 155, 78, 255),new Color(45, 113, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(35, 84, 39, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(47.6, 41.1);
((GeneralPath)shape).lineTo(59.0, 41.1);
((GeneralPath)shape).lineTo(59.0, 48.699997);
((GeneralPath)shape).lineTo(47.6, 48.699997);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(53.279998779296875, 41.060001373291016), new Point2D.Double(53.279998779296875, 48.65599822998047), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(47.6, 52.8);
((GeneralPath)shape).lineTo(59.0, 52.8);
((GeneralPath)shape).lineTo(59.0, 60.399998);
((GeneralPath)shape).lineTo(47.6, 60.399998);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(53.279998779296875, 52.78200149536133), new Point2D.Double(53.279998779296875, 60.37799835205078), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.6, 36.0);
((GeneralPath)shape).lineTo(38.199997, 36.0);
((GeneralPath)shape).curveTo(40.6, 36.2, 42.499996, 36.8, 44.399998, 37.5);
((GeneralPath)shape).curveTo(47.999996, 35.9, 53.0, 37.1, 56.199997, 38.3);
((GeneralPath)shape).curveTo(52.199997, 37.899998, 47.399998, 38.3, 44.6, 39.899998);
((GeneralPath)shape).curveTo(41.8, 37.6, 36.5, 36.999996, 31.599998, 37.6);
((GeneralPath)shape).curveTo(32.899998, 36.8, 34.6, 36.199997, 36.6, 36.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(43.85499954223633, 36.0359992980957), new Point2D.Double(43.85499954223633, 39.974998474121094), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.5, 42.1);
((GeneralPath)shape).curveTo(32.6, 42.3, 30.2, 43.199997, 28.7, 44.5);
((GeneralPath)shape).curveTo(23.900002, 42.3, 15.700001, 43.3, 12.6, 46.2);
((GeneralPath)shape).curveTo(12.3, 46.4, 12.0, 46.600002, 12.1, 46.9);
((GeneralPath)shape).curveTo(14.8, 46.100002, 18.1, 45.4, 21.5, 45.7);
((GeneralPath)shape).curveTo(24.9, 46.0, 27.4, 47.100002, 29.3, 48.600002);
((GeneralPath)shape).curveTo(32.8, 45.500004, 37.9, 43.7, 44.4, 43.800003);
((GeneralPath)shape).curveTo(42.0, 42.800003, 38.7, 41.9, 35.5, 42.100002);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(28.138999938964844, 42.10499954223633), new Point2D.Double(28.138999938964844, 48.60200119018555), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
shape = new GeneralPath();
((GeneralPath)shape).moveTo(32.2, 52.9);
((GeneralPath)shape).lineTo(43.6, 52.9);
((GeneralPath)shape).lineTo(43.6, 60.5);
((GeneralPath)shape).lineTo(32.2, 60.5);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(37.90800094604492, 52.867000579833984), new Point2D.Double(37.90800094604492, 60.46200180053711), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.7, 52.9);
((GeneralPath)shape).lineTo(28.1, 52.9);
((GeneralPath)shape).lineTo(28.1, 60.5);
((GeneralPath)shape).lineTo(16.7, 60.5);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(22.434999465942383, 52.867000579833984), new Point2D.Double(22.434999465942383, 60.46200180053711), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_10);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.13300000131130219;
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
		return 0.7379999160766602;
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
	private ext_ods() {
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
    public static ResizableIcon of(int width, int height) {
       ext_ods base = new ext_ods();
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_ods base = new ext_ods();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_ods::new;
    }
}

