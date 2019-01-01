package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconFactory;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_phar implements ResizableIcon {
    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
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
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.0, 90.1);
((GeneralPath)shape).lineTo(6.0, 74.3);
((GeneralPath)shape).lineTo(11.2, 74.3);
((GeneralPath)shape).curveTo(13.2, 74.3, 14.4, 74.4, 15.0, 74.5);
((GeneralPath)shape).curveTo(15.9, 74.7, 16.7, 75.3, 17.3, 76.0);
((GeneralPath)shape).curveTo(17.9, 76.8, 18.199999, 77.8, 18.199999, 79.1);
((GeneralPath)shape).curveTo(18.199999, 80.1, 17.999998, 80.9, 17.699999, 81.5);
((GeneralPath)shape).curveTo(17.4, 82.1, 16.9, 82.7, 16.3, 83.1);
((GeneralPath)shape).curveTo(15.799999, 83.5, 15.199999, 83.7, 14.599999, 83.799995);
((GeneralPath)shape).curveTo(13.799999, 83.99999, 12.7, 83.99999, 11.299999, 83.99999);
((GeneralPath)shape).lineTo(9.2, 83.99999);
((GeneralPath)shape).lineTo(9.2, 89.899994);
((GeneralPath)shape).lineTo(6.0, 89.899994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(9.2, 77.0);
((GeneralPath)shape).lineTo(9.2, 81.5);
((GeneralPath)shape).lineTo(11.0, 81.5);
((GeneralPath)shape).curveTo(12.3, 81.5, 13.1, 81.4, 13.5, 81.3);
((GeneralPath)shape).curveTo(13.9, 81.100006, 14.3, 80.9, 14.5, 80.5);
((GeneralPath)shape).curveTo(14.7, 80.1, 14.9, 79.7, 14.9, 79.3);
((GeneralPath)shape).curveTo(14.9, 78.700005, 14.7, 78.3, 14.4, 77.9);
((GeneralPath)shape).curveTo(14.099999, 77.5, 13.599999, 77.3, 13.099999, 77.200005);
((GeneralPath)shape).curveTo(12.7, 77.00001, 11.999999, 77.00001, 10.799999, 77.00001);
((GeneralPath)shape).lineTo(9.2, 77.00001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(20.9, 90.1);
((GeneralPath)shape).lineTo(20.9, 74.3);
((GeneralPath)shape).lineTo(24.1, 74.3);
((GeneralPath)shape).lineTo(24.1, 80.5);
((GeneralPath)shape).lineTo(30.400002, 80.5);
((GeneralPath)shape).lineTo(30.400002, 74.3);
((GeneralPath)shape).lineTo(33.600002, 74.3);
((GeneralPath)shape).lineTo(33.600002, 90.0);
((GeneralPath)shape).lineTo(30.400002, 90.0);
((GeneralPath)shape).lineTo(30.400002, 83.1);
((GeneralPath)shape).lineTo(24.100002, 83.1);
((GeneralPath)shape).lineTo(24.100002, 90.0);
((GeneralPath)shape).lineTo(20.900002, 90.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(51.4, 90.1);
((GeneralPath)shape).lineTo(47.9, 90.1);
((GeneralPath)shape).lineTo(46.5, 86.5);
((GeneralPath)shape).lineTo(40.1, 86.5);
((GeneralPath)shape).lineTo(38.8, 90.1);
((GeneralPath)shape).lineTo(35.399998, 90.1);
((GeneralPath)shape).lineTo(41.6, 74.4);
((GeneralPath)shape).lineTo(45.0, 74.4);
((GeneralPath)shape).lineTo(51.4, 90.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.5, 83.799995);
((GeneralPath)shape).lineTo(43.3, 78.0);
((GeneralPath)shape).lineTo(41.1, 83.8);
((GeneralPath)shape).lineTo(45.5, 83.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.1, 90.1);
((GeneralPath)shape).lineTo(53.1, 74.3);
((GeneralPath)shape).lineTo(59.899998, 74.3);
((GeneralPath)shape).curveTo(61.6, 74.3, 62.8, 74.4, 63.6, 74.700005);
((GeneralPath)shape).curveTo(64.4, 75.00001, 65.0, 75.50001, 65.5, 76.200005);
((GeneralPath)shape).curveTo(66.0, 76.9, 66.2, 77.8, 66.2, 78.700005);
((GeneralPath)shape).curveTo(66.2, 79.9, 65.799995, 80.9, 65.1, 81.600006);
((GeneralPath)shape).curveTo(64.4, 82.40001, 63.3, 82.90001, 61.899998, 83.100006);
((GeneralPath)shape).curveTo(62.6, 83.50001, 63.199997, 83.90001, 63.6, 84.40001);
((GeneralPath)shape).curveTo(64.0, 84.90001, 64.7, 85.70001, 65.4, 87.00001);
((GeneralPath)shape).lineTo(67.4, 90.100006);
((GeneralPath)shape).lineTo(63.5, 90.100006);
((GeneralPath)shape).lineTo(61.2, 86.700005);
((GeneralPath)shape).curveTo(60.4, 85.50001, 59.8, 84.700005, 59.5, 84.4);
((GeneralPath)shape).curveTo(59.2, 84.1, 58.9, 83.9, 58.5, 83.700005);
((GeneralPath)shape).curveTo(58.2, 83.600006, 57.6, 83.50001, 56.9, 83.50001);
((GeneralPath)shape).lineTo(56.2, 83.50001);
((GeneralPath)shape).lineTo(56.2, 90.100006);
((GeneralPath)shape).lineTo(53.100002, 90.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(56.399998, 81.0);
((GeneralPath)shape).lineTo(58.8, 81.0);
((GeneralPath)shape).curveTo(60.3, 81.0, 61.3, 80.9, 61.7, 80.8);
((GeneralPath)shape).curveTo(62.100002, 80.700005, 62.4, 80.4, 62.600002, 80.100006);
((GeneralPath)shape).curveTo(62.800003, 79.80001, 62.9, 79.40001, 62.9, 78.90001);
((GeneralPath)shape).curveTo(62.9, 78.40001, 62.800003, 77.90001, 62.5, 77.600006);
((GeneralPath)shape).curveTo(62.2, 77.3, 61.8, 77.100006, 61.3, 77.00001);
((GeneralPath)shape).curveTo(61.0, 77.00001, 60.3, 76.90001, 58.899998, 76.90001);
((GeneralPath)shape).lineTo(56.399998, 76.90001);
((GeneralPath)shape).lineTo(56.399998, 81.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.8, 32.0);
((GeneralPath)shape).curveTo(31.699999, 32.1, 31.699999, 32.1, 31.8, 32.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new LinearGradientPaint(new Point2D.Double(42.16999816894531, 38.369998931884766), new Point2D.Double(42.16999816894531, 27.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(56.4, 35.2);
((GeneralPath)shape).lineTo(36.0, 27.0);
((GeneralPath)shape).lineTo(28.0, 30.2);
((GeneralPath)shape).lineTo(48.3, 38.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new LinearGradientPaint(new Point2D.Double(29.434999465942383, 43.30400085449219), new Point2D.Double(29.434999465942383, 32.25), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.9, 32.2);
((GeneralPath)shape).lineTo(15.599999, 35.2);
((GeneralPath)shape).lineTo(36.0, 43.3);
((GeneralPath)shape).lineTo(43.2, 40.399998);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
paint = new LinearGradientPaint(new Point2D.Double(25.11400032043457, 67.0), new Point2D.Double(25.11400032043457, 36.11000061035156), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.8, 58.8);
((GeneralPath)shape).lineTo(35.4, 67.0);
((GeneralPath)shape).lineTo(35.4, 44.3);
((GeneralPath)shape).lineTo(14.800001, 36.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
paint = new LinearGradientPaint(new Point2D.Double(46.88600158691406, 67.0), new Point2D.Double(46.88600158691406, 36.11000061035156), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.1, 39.3);
((GeneralPath)shape).lineTo(49.1, 45.7);
((GeneralPath)shape).lineTo(48.3, 45.2);
((GeneralPath)shape).lineTo(47.399998, 46.4);
((GeneralPath)shape).lineTo(46.6, 45.9);
((GeneralPath)shape).lineTo(45.699997, 47.100002);
((GeneralPath)shape).lineTo(44.899998, 46.600002);
((GeneralPath)shape).lineTo(43.999996, 47.800003);
((GeneralPath)shape).lineTo(43.999996, 41.4);
((GeneralPath)shape).lineTo(36.599995, 44.300003);
((GeneralPath)shape).lineTo(36.599995, 67.0);
((GeneralPath)shape).lineTo(57.199997, 58.8);
((GeneralPath)shape).lineTo(57.199997, 36.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
paint = new Color(234, 237, 239, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.5, 49.6);
((GeneralPath)shape).curveTo(19.9, 49.8, 20.3, 49.8, 20.6, 49.699997);
((GeneralPath)shape).curveTo(20.900002, 49.599995, 21.1, 49.399998, 21.300001, 48.999996);
((GeneralPath)shape).curveTo(21.500002, 48.699997, 21.6, 48.399998, 21.500002, 48.199997);
((GeneralPath)shape).curveTo(21.400002, 47.999996, 21.200003, 47.799995, 20.800001, 47.699997);
((GeneralPath)shape).lineTo(20.1, 47.399998);
((GeneralPath)shape).lineTo(18.9, 49.3);
((GeneralPath)shape).curveTo(18.9, 49.399998, 19.5, 49.6, 19.5, 49.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(16.2, 51.199997);
((GeneralPath)shape).curveTo(16.2, 51.199997, 16.1, 51.199997, 16.2, 51.199997);
((GeneralPath)shape).curveTo(16.1, 51.1, 16.1, 51.1, 16.2, 50.999996);
((GeneralPath)shape).lineTo(19.300001, 45.899998);
((GeneralPath)shape).lineTo(19.400002, 45.8);
((GeneralPath)shape).lineTo(21.7, 46.7);
((GeneralPath)shape).curveTo(22.400002, 47.0, 22.900002, 47.4, 23.0, 47.9);
((GeneralPath)shape).curveTo(23.099998, 48.4, 23.1, 49.0, 22.7, 49.600002);
((GeneralPath)shape).curveTo(22.5, 49.9, 22.300001, 50.100002, 22.1, 50.300003);
((GeneralPath)shape).curveTo(21.9, 50.500004, 21.6, 50.600002, 21.4, 50.700005);
((GeneralPath)shape).curveTo(21.1, 50.800003, 20.699999, 50.900005, 20.4, 50.900005);
((GeneralPath)shape).curveTo(20.1, 50.900005, 19.699999, 50.800007, 19.199999, 50.600006);
((GeneralPath)shape).lineTo(18.3, 50.300007);
((GeneralPath)shape).lineTo(17.5, 51.600006);
((GeneralPath)shape).lineTo(17.4, 51.700005);
((GeneralPath)shape).lineTo(16.199999, 51.200005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(25.2, 52.999996);
((GeneralPath)shape).curveTo(25.1, 52.899998, 25.1, 52.899998, 25.2, 52.799995);
((GeneralPath)shape).lineTo(26.6, 50.599995);
((GeneralPath)shape).curveTo(26.7, 50.399994, 26.800001, 50.199993, 26.800001, 50.099995);
((GeneralPath)shape).curveTo(26.800001, 49.999996, 26.7, 49.899994, 26.400002, 49.799995);
((GeneralPath)shape).lineTo(25.600002, 49.499996);
((GeneralPath)shape).lineTo(23.900002, 52.299995);
((GeneralPath)shape).lineTo(23.800001, 52.399994);
((GeneralPath)shape).lineTo(22.6, 51.999992);
((GeneralPath)shape).lineTo(22.5, 51.899994);
((GeneralPath)shape).lineTo(22.5, 51.799995);
((GeneralPath)shape).lineTo(25.6, 46.699997);
((GeneralPath)shape).lineTo(25.7, 46.6);
((GeneralPath)shape).lineTo(26.900002, 47.0);
((GeneralPath)shape).lineTo(27.000002, 47.1);
((GeneralPath)shape).lineTo(27.000002, 47.199997);
((GeneralPath)shape).lineTo(26.200003, 48.399998);
((GeneralPath)shape).lineTo(27.100002, 48.699997);
((GeneralPath)shape).curveTo(27.800003, 48.999996, 28.200003, 49.299995, 28.400002, 49.6);
((GeneralPath)shape).curveTo(28.6, 49.9, 28.500002, 50.399998, 28.2, 50.899998);
((GeneralPath)shape).lineTo(26.800001, 53.199997);
((GeneralPath)shape).lineTo(26.7, 53.299995);
((GeneralPath)shape).lineTo(25.2, 52.999996);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.1, 53.699997);
((GeneralPath)shape).curveTo(30.6, 53.899998, 30.9, 53.899998, 31.2, 53.899998);
((GeneralPath)shape).curveTo(31.5, 53.8, 31.7, 53.6, 32.0, 53.199997);
((GeneralPath)shape).curveTo(32.2, 52.899998, 32.3, 52.6, 32.2, 52.399998);
((GeneralPath)shape).curveTo(32.100002, 52.199997, 31.900002, 51.999996, 31.5, 51.899998);
((GeneralPath)shape).lineTo(30.8, 51.6);
((GeneralPath)shape).lineTo(29.599998, 53.5);
((GeneralPath)shape).lineTo(30.099998, 53.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.7, 55.299995);
((GeneralPath)shape).curveTo(26.7, 55.299995, 26.6, 55.199997, 26.7, 55.299995);
((GeneralPath)shape).curveTo(26.6, 55.199997, 26.6, 55.199997, 26.6, 55.099995);
((GeneralPath)shape).lineTo(29.800001, 50.099995);
((GeneralPath)shape).curveTo(29.800001, 50.099995, 29.900002, 49.999996, 30.000002, 49.999996);
((GeneralPath)shape).lineTo(32.300003, 50.899998);
((GeneralPath)shape).curveTo(33.000004, 51.199997, 33.500004, 51.6, 33.700005, 52.1);
((GeneralPath)shape).curveTo(33.900005, 52.6, 33.800003, 53.199997, 33.400005, 53.8);
((GeneralPath)shape).curveTo(33.200005, 54.1, 33.000004, 54.3, 32.800007, 54.5);
((GeneralPath)shape).curveTo(32.600006, 54.7, 32.300007, 54.8, 32.000008, 54.9);
((GeneralPath)shape).curveTo(31.700008, 55.0, 31.300007, 55.100002, 31.000008, 55.100002);
((GeneralPath)shape).curveTo(30.700008, 55.100002, 30.300007, 55.000004, 29.800007, 54.800003);
((GeneralPath)shape).lineTo(28.900007, 54.4);
((GeneralPath)shape).lineTo(28.100008, 55.7);
((GeneralPath)shape).curveTo(28.100008, 55.7, 28.000008, 55.8, 27.900007, 55.8);
((GeneralPath)shape).lineTo(26.700006, 55.3);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
        return 0.13099999725818634;
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
		return 0.7420064210891724;
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
	 * Creates a new transcoded SVG image. It is recommended to use the 
	 * {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	public ext_phar() {
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
       ext_phar base = new ext_phar();
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
       ext_phar base = new ext_phar();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static ResizableIconFactory factory() {
        return () -> new ext_phar();
    }
}

