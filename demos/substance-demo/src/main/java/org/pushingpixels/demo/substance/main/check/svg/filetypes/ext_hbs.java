package org.pushingpixels.demo.substance.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.IsHiDpiAware;
import org.pushingpixels.neon.icon.NeonIcon;
import org.pushingpixels.neon.icon.NeonIconUIResource;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconFactory;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_hbs implements ResizableIcon, IsHiDpiAware {
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
((GeneralPath)shape).moveTo(8.6, 90.1);
((GeneralPath)shape).lineTo(8.6, 70.2);
((GeneralPath)shape).lineTo(12.700001, 70.2);
((GeneralPath)shape).lineTo(12.700001, 78.0);
((GeneralPath)shape).lineTo(20.7, 78.0);
((GeneralPath)shape).lineTo(20.7, 70.2);
((GeneralPath)shape).lineTo(24.800001, 70.2);
((GeneralPath)shape).lineTo(24.800001, 90.0);
((GeneralPath)shape).lineTo(20.7, 90.0);
((GeneralPath)shape).lineTo(20.7, 81.3);
((GeneralPath)shape).lineTo(12.700001, 81.3);
((GeneralPath)shape).lineTo(12.700001, 90.0);
((GeneralPath)shape).lineTo(8.6, 90.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.9, 70.2);
((GeneralPath)shape).lineTo(36.9, 70.2);
((GeneralPath)shape).curveTo(38.5, 70.2, 39.7, 70.299995, 40.5, 70.399994);
((GeneralPath)shape).curveTo(41.3, 70.49999, 42.0, 70.799995, 42.6, 71.2);
((GeneralPath)shape).curveTo(43.199997, 71.6, 43.699997, 72.2, 44.1, 72.899994);
((GeneralPath)shape).curveTo(44.5, 73.59999, 44.699997, 74.399994, 44.699997, 75.2);
((GeneralPath)shape).curveTo(44.699997, 76.1, 44.399998, 77.0, 43.899998, 77.799995);
((GeneralPath)shape).curveTo(43.399998, 78.59999, 42.699997, 79.2, 41.8, 79.49999);
((GeneralPath)shape).curveTo(43.0, 79.899994, 44.0, 80.49999, 44.6, 81.299995);
((GeneralPath)shape).curveTo(45.3, 82.1, 45.6, 83.1, 45.6, 84.299995);
((GeneralPath)shape).curveTo(45.6, 85.2, 45.399998, 86.1, 45.0, 86.899994);
((GeneralPath)shape).curveTo(44.6, 87.799995, 44.0, 88.399994, 43.3, 88.899994);
((GeneralPath)shape).curveTo(42.6, 89.399994, 41.7, 89.7, 40.6, 89.799995);
((GeneralPath)shape).curveTo(40.0, 89.99999, 38.399998, 89.99999, 35.8, 90.1);
((GeneralPath)shape).lineTo(29.0, 90.1);
((GeneralPath)shape).lineTo(29.0, 70.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.0, 73.5);
((GeneralPath)shape).lineTo(33.0, 78.1);
((GeneralPath)shape).lineTo(35.7, 78.1);
((GeneralPath)shape).curveTo(37.3, 78.1, 38.3, 78.1, 38.7, 78.0);
((GeneralPath)shape).curveTo(39.4, 77.9, 39.9, 77.7, 40.3, 77.3);
((GeneralPath)shape).curveTo(40.7, 76.9, 40.899998, 76.4, 40.899998, 75.8);
((GeneralPath)shape).curveTo(40.899998, 75.200005, 40.699997, 74.700005, 40.399998, 74.3);
((GeneralPath)shape).curveTo(40.1, 73.9, 39.499996, 73.700005, 38.899998, 73.600006);
((GeneralPath)shape).curveTo(38.499996, 73.600006, 37.3, 73.50001, 35.399998, 73.50001);
((GeneralPath)shape).lineTo(33.0, 73.50001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.0, 81.4);
((GeneralPath)shape).lineTo(33.0, 86.700005);
((GeneralPath)shape).lineTo(36.8, 86.700005);
((GeneralPath)shape).curveTo(38.3, 86.700005, 39.2, 86.700005, 39.6, 86.600006);
((GeneralPath)shape).curveTo(40.199997, 86.50001, 40.699997, 86.200005, 41.1, 85.8);
((GeneralPath)shape).curveTo(41.5, 85.4, 41.699997, 84.8, 41.699997, 84.100006);
((GeneralPath)shape).curveTo(41.699997, 83.50001, 41.6, 83.00001, 41.299995, 82.600006);
((GeneralPath)shape).curveTo(40.999996, 82.200005, 40.599995, 81.90001, 39.999996, 81.700005);
((GeneralPath)shape).curveTo(39.399998, 81.5, 38.199997, 81.4, 36.399998, 81.4);
((GeneralPath)shape).lineTo(33.0, 81.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.2, 83.6);
((GeneralPath)shape).lineTo(52.2, 83.2);
((GeneralPath)shape).curveTo(52.4, 84.5, 52.9, 85.5, 53.600002, 86.1);
((GeneralPath)shape).curveTo(54.300003, 86.7, 55.300003, 87.0, 56.500004, 87.0);
((GeneralPath)shape).curveTo(57.800003, 87.0, 58.800003, 86.7, 59.500004, 86.2);
((GeneralPath)shape).curveTo(60.200005, 85.7, 60.500004, 85.0, 60.500004, 84.299995);
((GeneralPath)shape).curveTo(60.500004, 83.799995, 60.400005, 83.399994, 60.100002, 83.1);
((GeneralPath)shape).curveTo(59.800003, 82.799995, 59.300003, 82.5, 58.600002, 82.2);
((GeneralPath)shape).curveTo(58.100002, 82.0, 57.000004, 81.7, 55.300003, 81.299995);
((GeneralPath)shape).curveTo(53.100002, 80.799995, 51.600002, 80.1, 50.700005, 79.299995);
((GeneralPath)shape).curveTo(49.500004, 78.2, 48.800003, 76.899994, 48.800003, 75.299995);
((GeneralPath)shape).curveTo(48.800003, 74.299995, 49.100002, 73.299995, 49.700005, 72.49999);
((GeneralPath)shape).curveTo(50.300007, 71.69999, 51.100006, 70.99999, 52.200005, 70.49999);
((GeneralPath)shape).curveTo(53.300003, 69.99999, 54.600006, 69.799995, 56.200005, 69.799995);
((GeneralPath)shape).curveTo(58.700005, 69.799995, 60.600006, 70.299995, 61.900005, 71.399994);
((GeneralPath)shape).curveTo(63.200005, 72.49999, 63.800007, 73.899994, 63.900005, 75.799995);
((GeneralPath)shape).lineTo(59.800007, 75.99999);
((GeneralPath)shape).curveTo(59.600006, 74.99999, 59.300007, 74.19999, 58.70001, 73.799995);
((GeneralPath)shape).curveTo(58.10001, 73.399994, 57.300007, 73.1, 56.10001, 73.1);
((GeneralPath)shape).curveTo(54.90001, 73.1, 54.00001, 73.299995, 53.30001, 73.799995);
((GeneralPath)shape).curveTo(52.90001, 74.1, 52.700012, 74.49999, 52.700012, 74.99999);
((GeneralPath)shape).curveTo(52.700012, 75.49999, 52.900013, 75.899994, 53.30001, 76.19999);
((GeneralPath)shape).curveTo(53.80001, 76.59999, 55.10001, 77.09999, 57.00001, 77.49999);
((GeneralPath)shape).curveTo(58.900013, 77.899994, 60.400013, 78.399994, 61.400013, 78.899994);
((GeneralPath)shape).curveTo(62.300014, 79.399994, 63.100014, 80.09999, 63.600014, 80.899994);
((GeneralPath)shape).curveTo(64.10001, 81.7, 64.40002, 82.799995, 64.40002, 84.09999);
((GeneralPath)shape).curveTo(64.40002, 85.19999, 64.10001, 86.29999, 63.400017, 87.29999);
((GeneralPath)shape).curveTo(62.80002, 88.29999, 61.900017, 88.999985, 60.700016, 89.499985);
((GeneralPath)shape).curveTo(59.500015, 89.999985, 58.100018, 90.19998, 56.300014, 90.19998);
((GeneralPath)shape).curveTo(53.800014, 90.19998, 51.800014, 89.59998, 50.400013, 88.499985);
((GeneralPath)shape).curveTo(49.300014, 87.499985, 48.50001, 85.79999, 48.200012, 83.59998);
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
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
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
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 0.93f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_0
paint = new LinearGradientPaint(new Point2D.Double(37.0, 60.48899841308594), new Point2D.Double(37.0, 48.3120002746582), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.4, 48.3);
((GeneralPath)shape).curveTo(32.1, 48.2, 33.9, 48.8, 35.3, 50.0);
((GeneralPath)shape).curveTo(36.0, 50.6, 36.5, 51.2, 37.0, 52.1);
((GeneralPath)shape).curveTo(37.8, 50.699997, 39.1, 49.5, 40.6, 49.0);
((GeneralPath)shape).curveTo(42.5, 48.3, 44.6, 48.3, 46.5, 49.0);
((GeneralPath)shape).curveTo(48.2, 49.7, 49.6, 50.6, 50.9, 51.8);
((GeneralPath)shape).curveTo(51.9, 52.7, 52.9, 53.7, 54.0, 54.5);
((GeneralPath)shape).curveTo(54.6, 55.0, 55.2, 55.3, 55.8, 55.6);
((GeneralPath)shape).curveTo(56.7, 55.899998, 57.8, 55.6, 58.399998, 54.899998);
((GeneralPath)shape).curveTo(58.999996, 54.199997, 58.999996, 53.199997, 58.3, 52.499996);
((GeneralPath)shape).curveTo(57.899998, 52.199997, 57.3, 52.199997, 56.899998, 52.599995);
((GeneralPath)shape).curveTo(56.899998, 52.599995, 56.899998, 52.699993, 56.8, 52.699993);
((GeneralPath)shape).curveTo(56.6, 53.099995, 56.6, 53.599995, 56.899998, 53.899994);
((GeneralPath)shape).curveTo(56.3, 53.599995, 55.899998, 52.899994, 55.8, 52.199993);
((GeneralPath)shape).curveTo(55.7, 51.399994, 56.3, 50.599995, 57.0, 50.399994);
((GeneralPath)shape).curveTo(58.5, 49.799995, 60.2, 50.299995, 61.1, 51.599995);
((GeneralPath)shape).curveTo(61.8, 52.799995, 62.199997, 54.299995, 61.899998, 55.699993);
((GeneralPath)shape).curveTo(61.699997, 56.999992, 60.999996, 58.29999, 59.8, 59.099995);
((GeneralPath)shape).curveTo(58.2, 60.199993, 56.3, 60.699993, 54.399998, 60.499996);
((GeneralPath)shape).curveTo(52.6, 60.399998, 50.8, 60.099995, 49.1, 59.299995);
((GeneralPath)shape).curveTo(46.3, 58.099995, 43.699997, 56.699997, 40.8, 55.699997);
((GeneralPath)shape).curveTo(39.8, 55.499996, 38.7, 55.199997, 37.7, 54.999996);
((GeneralPath)shape).lineTo(35.4, 54.999996);
((GeneralPath)shape).curveTo(34.5, 55.099995, 33.5, 55.299995, 32.7, 55.699997);
((GeneralPath)shape).curveTo(29.7, 56.6, 27.1, 58.199997, 24.300001, 59.299995);
((GeneralPath)shape).curveTo(21.900002, 60.299995, 19.300001, 60.599995, 16.7, 60.099995);
((GeneralPath)shape).curveTo(15.200001, 59.899994, 13.900001, 59.099995, 12.900001, 57.999996);
((GeneralPath)shape).curveTo(12.1, 56.999996, 11.700001, 55.799995, 11.700001, 54.499996);
((GeneralPath)shape).curveTo(11.6, 53.299995, 11.900001, 52.099995, 12.700001, 51.099995);
((GeneralPath)shape).curveTo(13.400001, 50.199993, 14.6, 49.799995, 15.800001, 49.899994);
((GeneralPath)shape).curveTo(16.500002, 49.899994, 17.2, 50.199993, 17.7, 50.799995);
((GeneralPath)shape).curveTo(18.0, 51.299995, 18.1, 51.899994, 17.900002, 52.499996);
((GeneralPath)shape).curveTo(17.7, 52.999996, 17.300001, 53.399998, 16.900002, 53.699997);
((GeneralPath)shape).curveTo(17.100002, 53.399998, 17.2, 52.899998, 17.000002, 52.499996);
((GeneralPath)shape).curveTo(16.700003, 52.099995, 16.100002, 51.899998, 15.600002, 52.299995);
((GeneralPath)shape).curveTo(15.500002, 52.299995, 15.500002, 52.399994, 15.4000025, 52.399994);
((GeneralPath)shape).curveTo(14.9000025, 52.999992, 14.800002, 53.699993, 15.200003, 54.399994);
((GeneralPath)shape).curveTo(15.600002, 55.099995, 16.300003, 55.499992, 17.000002, 55.599995);
((GeneralPath)shape).curveTo(18.100002, 55.599995, 19.100002, 55.099995, 19.900002, 54.399994);
((GeneralPath)shape).curveTo(21.500002, 52.799995, 23.2, 51.399994, 24.900002, 50.099995);
((GeneralPath)shape).curveTo(26.7, 48.999996, 28.500002, 48.399994, 30.400002, 48.299995);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_1
paint = new LinearGradientPaint(new Point2D.Double(37.0, 42.487998962402344), new Point2D.Double(37.0, 30.31100082397461), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.4, 30.3);
((GeneralPath)shape).curveTo(32.1, 30.199999, 33.9, 30.8, 35.3, 32.0);
((GeneralPath)shape).curveTo(36.0, 32.6, 36.5, 33.2, 37.0, 34.1);
((GeneralPath)shape).curveTo(37.8, 32.699997, 39.1, 31.499998, 40.6, 30.999998);
((GeneralPath)shape).curveTo(42.5, 30.299997, 44.6, 30.299997, 46.5, 30.999998);
((GeneralPath)shape).curveTo(48.2, 31.699999, 49.6, 32.6, 50.9, 33.8);
((GeneralPath)shape).curveTo(51.9, 34.7, 52.9, 35.7, 54.0, 36.5);
((GeneralPath)shape).curveTo(54.6, 37.0, 55.2, 37.3, 55.8, 37.6);
((GeneralPath)shape).curveTo(56.7, 37.899998, 57.8, 37.6, 58.399998, 36.899998);
((GeneralPath)shape).curveTo(58.999996, 36.199997, 58.999996, 35.199997, 58.3, 34.499996);
((GeneralPath)shape).curveTo(57.899998, 34.199997, 57.3, 34.199997, 56.899998, 34.599995);
((GeneralPath)shape).curveTo(56.899998, 34.599995, 56.899998, 34.699993, 56.8, 34.699993);
((GeneralPath)shape).curveTo(56.6, 35.099995, 56.6, 35.599995, 56.899998, 35.899994);
((GeneralPath)shape).curveTo(56.3, 35.599995, 55.899998, 34.899994, 55.8, 34.199993);
((GeneralPath)shape).curveTo(55.7, 33.399994, 56.3, 32.599995, 57.0, 32.399994);
((GeneralPath)shape).curveTo(58.5, 31.799994, 60.2, 32.299995, 61.1, 33.599995);
((GeneralPath)shape).curveTo(61.8, 34.799995, 62.199997, 36.299995, 61.899998, 37.699993);
((GeneralPath)shape).curveTo(61.699997, 38.999992, 60.999996, 40.29999, 59.8, 41.099995);
((GeneralPath)shape).curveTo(58.2, 42.199993, 56.3, 42.699993, 54.399998, 42.499996);
((GeneralPath)shape).curveTo(52.6, 42.399998, 50.8, 42.099995, 49.1, 41.299995);
((GeneralPath)shape).curveTo(46.3, 40.099995, 43.699997, 38.699997, 40.8, 37.699997);
((GeneralPath)shape).curveTo(39.8, 37.499996, 38.7, 37.199997, 37.7, 36.999996);
((GeneralPath)shape).lineTo(35.4, 36.999996);
((GeneralPath)shape).curveTo(34.5, 37.099995, 33.5, 37.299995, 32.7, 37.699997);
((GeneralPath)shape).curveTo(29.7, 38.6, 27.1, 40.199997, 24.300001, 41.299995);
((GeneralPath)shape).curveTo(21.900002, 42.299995, 19.300001, 42.599995, 16.7, 42.099995);
((GeneralPath)shape).curveTo(15.200001, 41.899994, 13.900001, 41.099995, 12.900001, 39.999996);
((GeneralPath)shape).curveTo(12.1, 38.999996, 11.700001, 37.799995, 11.700001, 36.499996);
((GeneralPath)shape).curveTo(11.6, 35.299995, 11.900001, 34.099995, 12.700001, 33.099995);
((GeneralPath)shape).curveTo(13.400001, 32.199993, 14.6, 31.799995, 15.800001, 31.899994);
((GeneralPath)shape).curveTo(16.500002, 31.899994, 17.2, 32.199993, 17.7, 32.799995);
((GeneralPath)shape).curveTo(18.0, 33.299995, 18.1, 33.899994, 17.900002, 34.499996);
((GeneralPath)shape).curveTo(17.7, 34.999996, 17.300001, 35.399998, 16.900002, 35.699997);
((GeneralPath)shape).curveTo(17.100002, 35.399998, 17.2, 34.899998, 17.000002, 34.499996);
((GeneralPath)shape).curveTo(16.700003, 34.099995, 16.100002, 33.899998, 15.600002, 34.299995);
((GeneralPath)shape).curveTo(15.500002, 34.299995, 15.500002, 34.399994, 15.4000025, 34.399994);
((GeneralPath)shape).curveTo(14.9000025, 34.999992, 14.800002, 35.699993, 15.200003, 36.399994);
((GeneralPath)shape).curveTo(15.600002, 37.099995, 16.300003, 37.499992, 17.000002, 37.599995);
((GeneralPath)shape).curveTo(18.100002, 37.599995, 19.100002, 37.099995, 19.900002, 36.399994);
((GeneralPath)shape).curveTo(21.500002, 34.799995, 23.2, 33.399994, 24.900002, 32.099995);
((GeneralPath)shape).curveTo(26.7, 30.999994, 28.500002, 30.399994, 30.400002, 30.299995);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6_1);
g.setTransform(defaultTransform__0_6);
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
	public ext_hbs() {
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
       ext_hbs base = new ext_hbs();
       base.width = width;
       base.height = height;
       return new NeonIcon(base);
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_hbs base = new ext_hbs();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static ResizableIconFactory factory() {
        return () -> new NeonIcon(new ext_hbs());
    }
}

