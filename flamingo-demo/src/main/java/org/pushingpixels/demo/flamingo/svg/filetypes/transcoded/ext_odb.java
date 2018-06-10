package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.IsHiDpiAware;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.NeonIcon;
import org.pushingpixels.neon.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Ibis SVG transcoder</a>.
 */
public class ext_odb implements ResizableIcon, IsHiDpiAware {
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
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0143001079559326), new Point2D.Double(36.20000076293945, 101.00050354003906), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
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
((GeneralPath)shape).lineTo(45.2, 1.0);
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.6, 80.3);
((GeneralPath)shape).curveTo(6.6, 78.3, 6.9, 76.600006, 7.5, 75.200005);
((GeneralPath)shape).curveTo(8.0, 74.200005, 8.6, 73.3, 9.4, 72.50001);
((GeneralPath)shape).curveTo(10.2, 71.700005, 11.099999, 71.100006, 12.0, 70.700005);
((GeneralPath)shape).curveTo(13.3, 70.200005, 14.7, 69.9, 16.3, 69.9);
((GeneralPath)shape).curveTo(19.3, 69.9, 21.599998, 70.8, 23.4, 72.6);
((GeneralPath)shape).curveTo(25.199999, 74.4, 26.1, 76.9, 26.1, 80.2);
((GeneralPath)shape).curveTo(26.1, 83.399994, 25.2, 85.899994, 23.5, 87.7);
((GeneralPath)shape).curveTo(21.8, 89.5, 19.4, 90.399994, 16.4, 90.399994);
((GeneralPath)shape).curveTo(13.4, 90.399994, 11.0, 89.49999, 9.299999, 87.7);
((GeneralPath)shape).curveTo(7.5999985, 85.9, 6.6, 83.4, 6.6, 80.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(10.8, 80.1);
((GeneralPath)shape).curveTo(10.8, 82.299995, 11.3, 84.0, 12.400001, 85.2);
((GeneralPath)shape).curveTo(13.500001, 86.399994, 14.800001, 86.899994, 16.400002, 86.899994);
((GeneralPath)shape).curveTo(18.000002, 86.899994, 19.300001, 86.299995, 20.400002, 85.2);
((GeneralPath)shape).curveTo(21.500002, 84.1, 22.000002, 82.299995, 22.000002, 80.0);
((GeneralPath)shape).curveTo(22.000002, 77.7, 21.500002, 76.0, 20.500002, 74.9);
((GeneralPath)shape).curveTo(19.500002, 73.8, 18.100002, 73.200005, 16.500002, 73.200005);
((GeneralPath)shape).curveTo(14.900002, 73.200005, 13.500002, 73.8, 12.500002, 74.9);
((GeneralPath)shape).curveTo(11.3, 76.1, 10.8, 77.9, 10.8, 80.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.2, 70.2);
((GeneralPath)shape).lineTo(36.600002, 70.2);
((GeneralPath)shape).curveTo(38.300003, 70.2, 39.600002, 70.299995, 40.4, 70.6);
((GeneralPath)shape).curveTo(41.600002, 70.9, 42.600002, 71.6, 43.4, 72.4);
((GeneralPath)shape).curveTo(44.2, 73.3, 44.9, 74.3, 45.300003, 75.6);
((GeneralPath)shape).curveTo(45.700005, 76.899994, 46.000004, 78.4, 46.000004, 80.299995);
((GeneralPath)shape).curveTo(46.000004, 81.899994, 45.800003, 83.299995, 45.400005, 84.49999);
((GeneralPath)shape).curveTo(44.900005, 85.899994, 44.200005, 87.09999, 43.200005, 87.99999);
((GeneralPath)shape).curveTo(42.500004, 88.69999, 41.500004, 89.19999, 40.300003, 89.59999);
((GeneralPath)shape).curveTo(39.4, 89.899994, 38.200005, 89.99999, 36.700005, 89.99999);
((GeneralPath)shape).lineTo(29.100004, 89.99999);
((GeneralPath)shape).lineTo(29.100004, 70.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.3, 73.6);
((GeneralPath)shape).lineTo(33.3, 86.7);
((GeneralPath)shape).lineTo(36.3, 86.7);
((GeneralPath)shape).curveTo(37.399998, 86.7, 38.3, 86.6, 38.8, 86.5);
((GeneralPath)shape).curveTo(39.5, 86.3, 40.0, 86.1, 40.399998, 85.7);
((GeneralPath)shape).curveTo(40.8, 85.299995, 41.199997, 84.7, 41.499996, 83.799995);
((GeneralPath)shape).curveTo(41.799995, 82.899994, 41.899998, 81.7, 41.899998, 80.2);
((GeneralPath)shape).curveTo(41.899998, 78.7, 41.8, 77.5, 41.499996, 76.7);
((GeneralPath)shape).curveTo(41.199997, 75.899994, 40.799995, 75.2, 40.299995, 74.799995);
((GeneralPath)shape).curveTo(39.799995, 74.399994, 39.199997, 73.99999, 38.399994, 73.899994);
((GeneralPath)shape).curveTo(37.799995, 73.799995, 36.699993, 73.7, 35.099995, 73.7);
((GeneralPath)shape).lineTo(33.3, 73.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.6, 70.2);
((GeneralPath)shape).lineTo(57.6, 70.2);
((GeneralPath)shape).curveTo(59.199997, 70.2, 60.399998, 70.299995, 61.199997, 70.399994);
((GeneralPath)shape).curveTo(61.999996, 70.49999, 62.699997, 70.799995, 63.299995, 71.2);
((GeneralPath)shape).curveTo(63.899994, 71.6, 64.399994, 72.2, 64.799995, 72.899994);
((GeneralPath)shape).curveTo(65.2, 73.59999, 65.399994, 74.399994, 65.399994, 75.2);
((GeneralPath)shape).curveTo(65.399994, 76.1, 65.09999, 77.0, 64.59999, 77.799995);
((GeneralPath)shape).curveTo(64.09999, 78.6, 63.39999, 79.2, 62.499992, 79.49999);
((GeneralPath)shape).curveTo(63.699993, 79.899994, 64.69999, 80.49999, 65.299995, 81.299995);
((GeneralPath)shape).curveTo(65.99999, 82.1, 66.299995, 83.1, 66.299995, 84.299995);
((GeneralPath)shape).curveTo(66.299995, 85.2, 66.1, 86.1, 65.7, 86.899994);
((GeneralPath)shape).curveTo(65.299995, 87.799995, 64.7, 88.399994, 63.999996, 88.899994);
((GeneralPath)shape).curveTo(63.299995, 89.399994, 62.399998, 89.7, 61.299995, 89.799995);
((GeneralPath)shape).curveTo(60.6, 90.0, 59.0, 90.0, 56.4, 90.1);
((GeneralPath)shape).lineTo(49.600002, 90.1);
((GeneralPath)shape).lineTo(49.600002, 70.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.6, 73.5);
((GeneralPath)shape).lineTo(53.6, 78.1);
((GeneralPath)shape).lineTo(56.3, 78.1);
((GeneralPath)shape).curveTo(57.899998, 78.1, 58.899998, 78.1, 59.2, 78.0);
((GeneralPath)shape).curveTo(59.9, 77.9, 60.4, 77.7, 60.8, 77.3);
((GeneralPath)shape).curveTo(61.2, 76.9, 61.399998, 76.4, 61.399998, 75.8);
((GeneralPath)shape).curveTo(61.399998, 75.200005, 61.199997, 74.700005, 60.899998, 74.3);
((GeneralPath)shape).curveTo(60.6, 73.9, 59.999996, 73.700005, 59.399998, 73.600006);
((GeneralPath)shape).curveTo(58.999996, 73.600006, 57.8, 73.50001, 55.899998, 73.50001);
((GeneralPath)shape).lineTo(53.6, 73.50001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.6, 81.4);
((GeneralPath)shape).lineTo(53.6, 86.700005);
((GeneralPath)shape).lineTo(57.399998, 86.700005);
((GeneralPath)shape).curveTo(58.899998, 86.700005, 59.8, 86.700005, 60.199997, 86.600006);
((GeneralPath)shape).curveTo(60.799995, 86.50001, 61.299995, 86.200005, 61.699997, 85.8);
((GeneralPath)shape).curveTo(62.1, 85.4, 62.299995, 84.8, 62.299995, 84.100006);
((GeneralPath)shape).curveTo(62.299995, 83.50001, 62.199997, 83.00001, 61.899994, 82.600006);
((GeneralPath)shape).curveTo(61.599995, 82.200005, 61.199993, 81.90001, 60.599995, 81.700005);
((GeneralPath)shape).curveTo(59.999996, 81.50001, 58.799995, 81.4, 56.999996, 81.4);
((GeneralPath)shape).lineTo(53.6, 81.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_2);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(31.747100830078125, 69.93489837646484), new Point2D.Double(31.747100830078125, 69.98639678955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.8, 32.0);
((GeneralPath)shape).curveTo(31.7, 32.1, 31.7, 32.1, 31.8, 32.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_0
paint = new Color(242, 242, 242, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(53.2, 48.9);
((GeneralPath)shape).curveTo(53.2, 51.4, 45.1, 53.4, 35.2, 53.4);
((GeneralPath)shape).curveTo(25.300003, 53.4, 17.2, 51.4, 17.2, 48.9);
((GeneralPath)shape).curveTo(17.2, 46.4, 25.300001, 44.4, 35.2, 44.4);
((GeneralPath)shape).curveTo(45.1, 44.4, 53.2, 46.4, 53.2, 48.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_1
paint = new LinearGradientPaint(new Point2D.Double(28.171100616455078, 46.372100830078125), new Point2D.Double(42.226898193359375, 60.42789840698242), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(48.7, 48.6);
((GeneralPath)shape).curveTo(48.7, 50.8, 42.7, 52.5, 35.2, 52.5);
((GeneralPath)shape).curveTo(27.7, 52.5, 21.7, 50.8, 21.7, 48.6);
((GeneralPath)shape).curveTo(21.7, 46.399998, 27.7, 44.699997, 35.2, 44.699997);
((GeneralPath)shape).curveTo(42.7, 44.699997, 48.7, 46.4, 48.7, 48.6);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_2
paint = new LinearGradientPaint(new Point2D.Double(17.198999404907227, 45.04999923706055), new Point2D.Double(53.19900131225586, 45.04999923706055), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.2, 49.1);
((GeneralPath)shape).lineTo(17.2, 60.3);
((GeneralPath)shape).curveTo(17.2, 60.3, 21.7, 64.8, 35.2, 64.8);
((GeneralPath)shape).curveTo(48.7, 64.8, 53.2, 60.300003, 53.2, 60.300003);
((GeneralPath)shape).lineTo(53.2, 49.1);
((GeneralPath)shape).curveTo(53.2, 49.1, 51.0, 53.0, 35.2, 53.3);
((GeneralPath)shape).curveTo(19.4, 53.6, 17.2, 49.1, 17.2, 49.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_0_2);
g.setTransform(defaultTransform__0_4_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_1_0
paint = new Color(242, 242, 242, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(53.2, 33.1);
((GeneralPath)shape).curveTo(53.2, 35.6, 45.1, 37.6, 35.2, 37.6);
((GeneralPath)shape).curveTo(25.300003, 37.6, 17.2, 35.6, 17.2, 33.1);
((GeneralPath)shape).curveTo(17.2, 30.599998, 25.300001, 28.599998, 35.2, 28.599998);
((GeneralPath)shape).curveTo(45.1, 28.599998, 53.2, 30.6, 53.2, 33.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_1_1
paint = new LinearGradientPaint(new Point2D.Double(28.152999877929688, 62.15399932861328), new Point2D.Double(42.20869827270508, 76.20970153808594), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(48.7, 32.8);
((GeneralPath)shape).curveTo(48.7, 35.0, 42.7, 36.7, 35.2, 36.7);
((GeneralPath)shape).curveTo(27.7, 36.7, 21.7, 35.0, 21.7, 32.8);
((GeneralPath)shape).curveTo(21.7, 30.599998, 27.7, 28.9, 35.2, 28.9);
((GeneralPath)shape).curveTo(42.7, 28.9, 48.7, 30.6, 48.7, 32.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_1_2
paint = new LinearGradientPaint(new Point2D.Double(17.198999404907227, 60.75), new Point2D.Double(53.19900131225586, 60.75), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.2, 33.4);
((GeneralPath)shape).lineTo(17.2, 44.600002);
((GeneralPath)shape).curveTo(17.2, 44.600002, 21.7, 49.100002, 35.2, 49.100002);
((GeneralPath)shape).curveTo(48.7, 49.100002, 53.2, 44.600002, 53.2, 44.600002);
((GeneralPath)shape).lineTo(53.2, 33.4);
((GeneralPath)shape).curveTo(53.2, 33.4, 51.0, 37.300003, 35.2, 37.600002);
((GeneralPath)shape).curveTo(19.4, 37.9, 17.2, 33.4, 17.2, 33.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_1_2);
g.setTransform(defaultTransform__0_4_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_2_0
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(53.2, 17.4);
((GeneralPath)shape).curveTo(53.2, 19.9, 45.1, 21.9, 35.2, 21.9);
((GeneralPath)shape).curveTo(25.300003, 21.9, 17.2, 19.9, 17.2, 17.4);
((GeneralPath)shape).curveTo(17.2, 14.9, 25.300001, 12.9, 35.2, 12.9);
((GeneralPath)shape).curveTo(45.1, 12.9, 53.2, 14.9, 53.2, 17.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_2_1
paint = new LinearGradientPaint(new Point2D.Double(28.171100616455078, 77.87210083007812), new Point2D.Double(42.226898193359375, 91.92790222167969), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(48.7, 17.1);
((GeneralPath)shape).curveTo(48.7, 19.300001, 42.7, 21.0, 35.2, 21.0);
((GeneralPath)shape).curveTo(27.7, 21.0, 21.7, 19.3, 21.7, 17.1);
((GeneralPath)shape).curveTo(21.7, 14.900002, 27.7, 13.200001, 35.2, 13.200001);
((GeneralPath)shape).curveTo(42.7, 13.200001, 48.7, 14.9, 48.7, 17.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_2_2
paint = new LinearGradientPaint(new Point2D.Double(17.198999404907227, 76.55000305175781), new Point2D.Double(53.19900131225586, 76.55000305175781), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.2, 17.6);
((GeneralPath)shape).lineTo(17.2, 28.8);
((GeneralPath)shape).curveTo(17.2, 28.8, 21.7, 33.3, 35.2, 33.3);
((GeneralPath)shape).curveTo(48.7, 33.3, 53.2, 28.8, 53.2, 28.8);
((GeneralPath)shape).lineTo(53.2, 17.6);
((GeneralPath)shape).curveTo(53.2, 17.6, 51.0, 21.5, 35.2, 21.8);
((GeneralPath)shape).curveTo(19.4, 22.1, 17.2, 17.6, 17.2, 17.6);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_2_2);
g.setTransform(defaultTransform__0_4_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_3
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.8, 37.6);
((GeneralPath)shape).curveTo(40.399998, 37.6, 41.1, 37.6, 41.7, 37.6);
((GeneralPath)shape).curveTo(44.5, 37.8, 46.8, 38.5, 49.0, 39.399998);
((GeneralPath)shape).curveTo(53.2, 37.499996, 59.3, 38.999996, 63.0, 40.399998);
((GeneralPath)shape).curveTo(58.2, 39.899998, 52.5, 40.399998, 49.2, 42.3);
((GeneralPath)shape).curveTo(45.9, 39.6, 39.6, 38.899998, 33.7, 39.6);
((GeneralPath)shape).curveTo(35.4, 38.5, 37.4, 37.9, 39.8, 37.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.4, 45.0);
((GeneralPath)shape).curveTo(35.0, 45.2, 32.2, 46.3, 30.300001, 47.9);
((GeneralPath)shape).curveTo(24.600002, 45.300003, 14.800001, 46.4, 11.1, 49.9);
((GeneralPath)shape).curveTo(10.8, 50.100002, 10.400001, 50.4, 10.5, 50.7);
((GeneralPath)shape).curveTo(13.7, 49.7, 17.6, 48.9, 21.7, 49.2);
((GeneralPath)shape).curveTo(25.7, 49.5, 28.7, 50.9, 31.0, 52.7);
((GeneralPath)shape).curveTo(35.1, 49.0, 41.2, 46.9, 48.9, 47.0);
((GeneralPath)shape).curveTo(46.2, 45.6, 42.3, 44.6, 38.4, 45.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_3);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new LinearGradientPaint(new Point2D.Double(45.32379913330078, 74.18440246582031), new Point2D.Double(58.87070083618164, 87.7313003540039), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
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
	public ext_odb() {
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
     * Returns an instance of this icon with specified dimensions.
     */
    public static NeonIcon of(int width, int height) {
       ext_odb base = new ext_odb();
       base.width = width;
       base.height = height;
       return new NeonIcon(base);
    }

    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_odb base = new ext_odb();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }
}

