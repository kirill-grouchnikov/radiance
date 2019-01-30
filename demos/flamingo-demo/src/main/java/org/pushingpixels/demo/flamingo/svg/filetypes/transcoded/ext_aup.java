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
public class ext_aup implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
paint = new LinearGradientPaint(new Point2D.Double(36.150001525878906, 2.88700008392334), new Point2D.Double(36.150001525878906, 101.1259994506836), new float[] {0.0f,0.012f,0.182f,0.352f,0.521f,0.687f,0.848f,1.0f}, new Color[] {new Color(89, 85, 147, 255),new Color(91, 87, 148, 255),new Color(123, 119, 170, 255),new Color(152, 150, 191, 255),new Color(178, 178, 210, 255),new Color(199, 201, 226, 255),new Color(214, 217, 236, 255),new Color(219, 223, 240, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(72.3, 99.1);
((GeneralPath)shape).lineTo(0.0, 99.1);
((GeneralPath)shape).lineTo(0.0, 0.9);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(72.3, 99.1);
((GeneralPath)shape).lineTo(0.0, 99.1);
((GeneralPath)shape).lineTo(0.0, 0.9);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(72.3, 99.1);
((GeneralPath)shape).lineTo(0.0, 99.1);
((GeneralPath)shape).lineTo(0.0, 0.9);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(27.1, 91.2);
((GeneralPath)shape).lineTo(22.7, 91.2);
((GeneralPath)shape).lineTo(20.900002, 86.7);
((GeneralPath)shape).lineTo(12.900002, 86.7);
((GeneralPath)shape).lineTo(11.200002, 91.2);
((GeneralPath)shape).lineTo(6.9, 91.2);
((GeneralPath)shape).lineTo(14.700001, 71.299995);
((GeneralPath)shape).lineTo(19.0, 71.299995);
((GeneralPath)shape).lineTo(27.1, 91.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.6, 83.299995);
((GeneralPath)shape).lineTo(16.800001, 75.899994);
((GeneralPath)shape).lineTo(14.100001, 83.299995);
((GeneralPath)shape).lineTo(19.600002, 83.299995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.2, 71.299995);
((GeneralPath)shape).lineTo(33.3, 71.299995);
((GeneralPath)shape).lineTo(33.3, 82.0);
((GeneralPath)shape).curveTo(33.3, 83.7, 33.399998, 84.8, 33.5, 85.3);
((GeneralPath)shape).curveTo(33.7, 86.100006, 34.1, 86.8, 34.7, 87.3);
((GeneralPath)shape).curveTo(35.4, 87.8, 36.2, 88.0, 37.4, 88.0);
((GeneralPath)shape).curveTo(38.600002, 88.0, 39.4, 87.8, 40.0, 87.3);
((GeneralPath)shape).curveTo(40.6, 86.8, 40.9, 86.3, 41.1, 85.600006);
((GeneralPath)shape).curveTo(41.199997, 84.90001, 41.3, 83.8, 41.3, 82.200005);
((GeneralPath)shape).lineTo(41.3, 71.200005);
((GeneralPath)shape).lineTo(45.399998, 71.200005);
((GeneralPath)shape).lineTo(45.399998, 81.600006);
((GeneralPath)shape).curveTo(45.399998, 84.00001, 45.3, 85.700005, 45.1, 86.700005);
((GeneralPath)shape).curveTo(44.899998, 87.700005, 44.5, 88.50001, 43.899998, 89.200005);
((GeneralPath)shape).curveTo(43.299995, 89.9, 42.499996, 90.4, 41.499996, 90.8);
((GeneralPath)shape).curveTo(40.499996, 91.200005, 39.199997, 91.4, 37.599995, 91.4);
((GeneralPath)shape).curveTo(35.699993, 91.4, 34.199993, 91.200005, 33.199993, 90.700005);
((GeneralPath)shape).curveTo(32.199993, 90.3, 31.399994, 89.700005, 30.799994, 89.00001);
((GeneralPath)shape).curveTo(30.199993, 88.30001, 29.799994, 87.600006, 29.699993, 86.80001);
((GeneralPath)shape).curveTo(29.399994, 85.70001, 29.299994, 84.00001, 29.299994, 81.80001);
((GeneralPath)shape).lineTo(29.299994, 71.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.5, 91.2);
((GeneralPath)shape).lineTo(49.5, 71.3);
((GeneralPath)shape).lineTo(56.0, 71.3);
((GeneralPath)shape).curveTo(58.5, 71.3, 60.1, 71.4, 60.8, 71.600006);
((GeneralPath)shape).curveTo(62.0, 71.90001, 62.899998, 72.50001, 63.7, 73.50001);
((GeneralPath)shape).curveTo(64.5, 74.50001, 64.9, 75.80001, 64.9, 77.40001);
((GeneralPath)shape).curveTo(64.9, 78.600006, 64.700005, 79.600006, 64.200005, 80.50001);
((GeneralPath)shape).curveTo(63.800003, 81.30001, 63.200005, 82.00001, 62.500004, 82.50001);
((GeneralPath)shape).curveTo(61.800003, 83.00001, 61.100002, 83.30001, 60.400005, 83.40001);
((GeneralPath)shape).curveTo(59.400005, 83.600006, 58.000004, 83.70001, 56.200005, 83.70001);
((GeneralPath)shape).lineTo(53.600006, 83.70001);
((GeneralPath)shape).lineTo(53.600006, 91.20001);
((GeneralPath)shape).lineTo(49.500008, 91.20001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.6, 74.6);
((GeneralPath)shape).lineTo(53.6, 80.2);
((GeneralPath)shape).lineTo(55.8, 80.2);
((GeneralPath)shape).curveTo(57.399998, 80.2, 58.5, 80.1, 59.0, 79.899994);
((GeneralPath)shape).curveTo(59.5, 79.69999, 60.0, 79.399994, 60.3, 78.899994);
((GeneralPath)shape).curveTo(60.6, 78.49999, 60.8, 77.899994, 60.8, 77.399994);
((GeneralPath)shape).curveTo(60.8, 76.7, 60.6, 76.09999, 60.2, 75.59999);
((GeneralPath)shape).curveTo(59.8, 75.09999, 59.2, 74.79999, 58.600002, 74.69999);
((GeneralPath)shape).curveTo(58.100002, 74.59999, 57.100002, 74.59999, 55.7, 74.59999);
((GeneralPath)shape).lineTo(53.600002, 74.59999);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new LinearGradientPaint(new Point2D.Double(10.784000396728516, 45.05400085449219), new Point2D.Double(22.30699920654297, 45.05400085449219), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.3, 54.7);
((GeneralPath)shape).lineTo(13.599999, 45.1);
((GeneralPath)shape).lineTo(13.599999, 45.0);
((GeneralPath)shape).lineTo(22.3, 35.4);
((GeneralPath)shape).lineTo(22.3, 29.0);
((GeneralPath)shape).lineTo(10.8, 42.5);
((GeneralPath)shape).lineTo(10.8, 47.6);
((GeneralPath)shape).lineTo(22.3, 61.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(10.034000396728516, 45.05400085449219), new Point2D.Double(23.05699920654297, 45.05400085449219), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.3, 54.7);
((GeneralPath)shape).lineTo(13.599999, 45.1);
((GeneralPath)shape).lineTo(13.599999, 45.0);
((GeneralPath)shape).lineTo(22.3, 35.4);
((GeneralPath)shape).lineTo(22.3, 29.0);
((GeneralPath)shape).lineTo(10.8, 42.5);
((GeneralPath)shape).lineTo(10.8, 47.6);
((GeneralPath)shape).lineTo(22.3, 61.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(51.47600173950195, 45.05400085449219), new Point2D.Double(63.0, 45.05400085449219), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(51.5, 29.0);
((GeneralPath)shape).lineTo(51.5, 35.4);
((GeneralPath)shape).lineTo(60.4, 45.0);
((GeneralPath)shape).lineTo(60.4, 45.1);
((GeneralPath)shape).lineTo(51.5, 54.699997);
((GeneralPath)shape).lineTo(51.5, 61.1);
((GeneralPath)shape).lineTo(63.0, 47.8);
((GeneralPath)shape).lineTo(63.0, 42.3);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(50.72600173950195, 45.05400085449219), new Point2D.Double(63.75, 45.05400085449219), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(51.5, 29.0);
((GeneralPath)shape).lineTo(51.5, 35.4);
((GeneralPath)shape).lineTo(60.4, 45.0);
((GeneralPath)shape).lineTo(60.4, 45.1);
((GeneralPath)shape).lineTo(51.5, 54.699997);
((GeneralPath)shape).lineTo(51.5, 61.1);
((GeneralPath)shape).lineTo(63.0, 47.8);
((GeneralPath)shape).lineTo(63.0, 42.3);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new LinearGradientPaint(new Point2D.Double(25.065000534057617, 45.04399871826172), new Point2D.Double(48.935001373291016, 45.04399871826172), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(42.8, 33.9);
((GeneralPath)shape).curveTo(41.3, 33.2, 39.399998, 32.100002, 38.7, 30.500002);
((GeneralPath)shape).curveTo(38.7, 29.700003, 38.0, 29.000002, 37.2, 29.000002);
((GeneralPath)shape).curveTo(36.4, 29.000002, 35.7, 29.700003, 35.7, 30.500002);
((GeneralPath)shape).lineTo(35.7, 50.100002);
((GeneralPath)shape).curveTo(34.2, 49.300003, 31.300001, 49.500004, 29.0, 50.800003);
((GeneralPath)shape).curveTo(25.6, 52.700005, 24.1, 56.300003, 25.6, 58.9);
((GeneralPath)shape).curveTo(27.1, 61.4, 31.2, 61.9, 34.6, 60.0);
((GeneralPath)shape).curveTo(37.0, 58.7, 38.6, 56.4, 38.699997, 54.2);
((GeneralPath)shape).lineTo(38.699997, 37.3);
((GeneralPath)shape).curveTo(43.699997, 37.3, 46.6, 39.3, 45.499996, 44.1);
((GeneralPath)shape).curveTo(45.299995, 45.0, 44.999996, 45.899998, 44.599995, 46.699997);
((GeneralPath)shape).curveTo(44.399994, 46.999996, 44.399994, 47.299995, 44.699993, 47.6);
((GeneralPath)shape).curveTo(44.899994, 47.8, 45.399994, 47.8, 45.79999, 47.399998);
((GeneralPath)shape).curveTo(47.699993, 45.6, 48.79999, 43.199997, 48.89999, 40.6);
((GeneralPath)shape).curveTo(48.99999, 37.3, 45.69999, 35.199997, 42.79999, 33.899998);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(24.565000534057617, 45.04399871826172), new Point2D.Double(49.435001373291016, 45.04399871826172), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(42.8, 33.9);
((GeneralPath)shape).curveTo(41.3, 33.2, 39.399998, 32.100002, 38.7, 30.500002);
((GeneralPath)shape).curveTo(38.7, 29.700003, 38.0, 29.000002, 37.2, 29.000002);
((GeneralPath)shape).curveTo(36.4, 29.000002, 35.7, 29.700003, 35.7, 30.500002);
((GeneralPath)shape).lineTo(35.7, 50.100002);
((GeneralPath)shape).curveTo(34.2, 49.300003, 31.300001, 49.500004, 29.0, 50.800003);
((GeneralPath)shape).curveTo(25.6, 52.700005, 24.1, 56.300003, 25.6, 58.9);
((GeneralPath)shape).curveTo(27.1, 61.4, 31.2, 61.9, 34.6, 60.0);
((GeneralPath)shape).curveTo(37.0, 58.7, 38.6, 56.4, 38.699997, 54.2);
((GeneralPath)shape).lineTo(38.699997, 37.3);
((GeneralPath)shape).curveTo(43.699997, 37.3, 46.6, 39.3, 45.499996, 44.1);
((GeneralPath)shape).curveTo(45.299995, 45.0, 44.999996, 45.899998, 44.599995, 46.699997);
((GeneralPath)shape).curveTo(44.399994, 46.999996, 44.399994, 47.299995, 44.699993, 47.6);
((GeneralPath)shape).curveTo(44.899994, 47.8, 45.399994, 47.8, 45.79999, 47.399998);
((GeneralPath)shape).curveTo(47.699993, 45.6, 48.79999, 43.199997, 48.89999, 40.6);
((GeneralPath)shape).curveTo(48.99999, 37.3, 45.69999, 35.199997, 42.79999, 33.899998);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
paint = new LinearGradientPaint(new Point2D.Double(58.32099914550781, 87.27300262451172), new Point2D.Double(50.78300094604492, 78.83899688720703), new float[] {0.0f,0.07f,0.159f,0.255f,0.359f,0.471f,0.598f,0.751f,1.0f}, new Color[] {new Color(89, 85, 147, 255),new Color(112, 108, 162, 255),new Color(137, 136, 181, 255),new Color(163, 165, 200, 255),new Color(186, 191, 217, 255),new Color(206, 213, 231, 255),new Color(222, 230, 242, 255),new Color(233, 243, 250, 255),new Color(236, 248, 254, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(45.2, 27.699999);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(45.2, 27.699999);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(45.2, 27.699999);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_5_1);
g.setTransform(defaultTransform__0_5);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12999999523162842;
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
		return 0.7430000305175781;
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
	private ext_aup() {
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
       ext_aup base = new ext_aup();
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
       ext_aup base = new ext_aup();
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
        return () -> new ext_aup();
    }
}

