package org.pushingpixels.demo.substance.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_ovf implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
paint = new LinearGradientPaint(new Point2D.Double(35.75, 2.994999885559082), new Point2D.Double(35.75, 101.0009994506836), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {new Color(239, 196, 2, 255),new Color(241, 200, 41, 255),new Color(244, 210, 100, 255),new Color(247, 220, 139, 255),new Color(249, 229, 172, 255),new Color(251, 236, 199, 255),new Color(252, 243, 221, 255),new Color(254, 249, 238, 255),new Color(255, 253, 249, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
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
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
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
paint = new Color(160, 120, 2, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.1, 82.3);
((GeneralPath)shape).curveTo(8.1, 80.3, 8.400001, 78.600006, 9.0, 77.200005);
((GeneralPath)shape).curveTo(9.5, 76.200005, 10.1, 75.3, 10.9, 74.50001);
((GeneralPath)shape).curveTo(11.7, 73.700005, 12.599999, 73.100006, 13.5, 72.700005);
((GeneralPath)shape).curveTo(14.7, 72.200005, 16.2, 71.9, 17.8, 71.9);
((GeneralPath)shape).curveTo(20.8, 71.9, 23.099998, 72.8, 24.9, 74.6);
((GeneralPath)shape).curveTo(26.699999, 76.4, 27.6, 78.9, 27.6, 82.2);
((GeneralPath)shape).curveTo(27.6, 85.399994, 26.7, 87.899994, 25.0, 89.7);
((GeneralPath)shape).curveTo(23.2, 91.5, 20.9, 92.399994, 17.9, 92.399994);
((GeneralPath)shape).curveTo(14.9, 92.399994, 12.5, 91.49999, 10.799999, 89.7);
((GeneralPath)shape).curveTo(8.999999, 87.899994, 8.099999, 85.399994, 8.099999, 82.299995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.200001, 82.100006);
((GeneralPath)shape).curveTo(12.200001, 84.3, 12.700001, 86.100006, 13.800001, 87.200005);
((GeneralPath)shape).curveTo(14.800001, 88.4, 16.2, 88.9, 17.800001, 88.9);
((GeneralPath)shape).curveTo(19.400002, 88.9, 20.7, 88.3, 21.800001, 87.200005);
((GeneralPath)shape).curveTo(22.800001, 86.00001, 23.400002, 84.3, 23.400002, 82.00001);
((GeneralPath)shape).curveTo(23.400002, 79.700005, 22.900002, 78.00001, 21.900002, 76.90001);
((GeneralPath)shape).curveTo(20.900002, 75.80001, 19.600002, 75.20001, 17.900002, 75.20001);
((GeneralPath)shape).curveTo(16.2, 75.20001, 14.900002, 75.80001, 13.900002, 76.90001);
((GeneralPath)shape).curveTo(12.800001, 78.100006, 12.200002, 79.80001, 12.200002, 82.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.800003, 92.100006);
((GeneralPath)shape).lineTo(28.600002, 72.3);
((GeneralPath)shape).lineTo(33.0, 72.3);
((GeneralPath)shape).lineTo(38.1, 87.0);
((GeneralPath)shape).lineTo(43.0, 72.2);
((GeneralPath)shape).lineTo(47.3, 72.2);
((GeneralPath)shape).lineTo(40.1, 92.0);
((GeneralPath)shape).lineTo(35.8, 92.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.4, 92.100006);
((GeneralPath)shape).lineTo(49.4, 72.2);
((GeneralPath)shape).lineTo(63.100002, 72.2);
((GeneralPath)shape).lineTo(63.100002, 75.6);
((GeneralPath)shape).lineTo(53.4, 75.6);
((GeneralPath)shape).lineTo(53.4, 80.299995);
((GeneralPath)shape).lineTo(61.800003, 80.299995);
((GeneralPath)shape).lineTo(61.800003, 83.7);
((GeneralPath)shape).lineTo(53.4, 83.7);
((GeneralPath)shape).lineTo(53.4, 92.1);
((GeneralPath)shape).lineTo(49.4, 92.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
paint = new LinearGradientPaint(new Point2D.Double(45.34400177001953, 74.2300033569336), new Point2D.Double(58.84400177001953, 87.7300033569336), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 254, 251, 255),new Color(254, 250, 241, 255),new Color(253, 245, 228, 255),new Color(252, 240, 210, 255),new Color(250, 233, 188, 255),new Color(249, 226, 162, 255),new Color(247, 218, 131, 255),new Color(244, 209, 93, 255),new Color(241, 200, 39, 255),new Color(239, 196, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_1);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(35.715999603271484, 62.0), new Point2D.Double(35.715999603271484, 49.770999908447266), new float[] {0.0f,0.164f,1.0f}, new Color[] {new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(61.2, 53.4);
((GeneralPath)shape).curveTo(61.2, 51.4, 59.600002, 49.800003, 57.600002, 49.800003);
((GeneralPath)shape).lineTo(13.8, 49.800003);
((GeneralPath)shape).curveTo(11.8, 49.800003, 10.200001, 51.4, 10.200001, 53.4);
((GeneralPath)shape).lineTo(10.200001, 58.4);
((GeneralPath)shape).curveTo(10.200001, 60.4, 11.800001, 62.0, 13.800001, 62.0);
((GeneralPath)shape).lineTo(57.6, 62.0);
((GeneralPath)shape).curveTo(59.6, 62.0, 61.199997, 60.4, 61.199997, 58.4);
((GeneralPath)shape).lineTo(61.199997, 53.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.4, 57.9);
((GeneralPath)shape).curveTo(41.300003, 57.9, 40.4, 57.0, 40.4, 55.9);
((GeneralPath)shape).curveTo(40.4, 54.800003, 41.300003, 53.9, 42.4, 53.9);
((GeneralPath)shape).curveTo(43.5, 53.9, 44.4, 54.800003, 44.4, 55.9);
((GeneralPath)shape).curveTo(44.4, 57.0, 43.5, 57.9, 42.4, 57.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.5, 57.9);
((GeneralPath)shape).curveTo(47.4, 57.9, 46.5, 57.0, 46.5, 55.9);
((GeneralPath)shape).curveTo(46.5, 54.800003, 47.4, 53.9, 48.5, 53.9);
((GeneralPath)shape).curveTo(49.6, 53.9, 50.5, 54.800003, 50.5, 55.9);
((GeneralPath)shape).curveTo(50.5, 57.0, 49.6, 57.9, 48.5, 57.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.6, 57.9);
((GeneralPath)shape).curveTo(53.5, 57.9, 52.6, 57.0, 52.6, 55.9);
((GeneralPath)shape).curveTo(52.6, 54.800003, 53.5, 53.9, 54.6, 53.9);
((GeneralPath)shape).curveTo(55.699997, 53.9, 56.6, 54.800003, 56.6, 55.9);
((GeneralPath)shape).curveTo(56.6, 57.0, 55.699997, 57.9, 54.6, 57.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new LinearGradientPaint(new Point2D.Double(35.715999603271484, 48.45600128173828), new Point2D.Double(35.715999603271484, 35.93000030517578), new float[] {0.0f,0.164f,1.0f}, new Color[] {new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.8, 47.7);
((GeneralPath)shape).lineTo(57.6, 47.7);
((GeneralPath)shape).curveTo(58.6, 47.7, 59.5, 48.0, 60.3, 48.4);
((GeneralPath)shape).lineTo(56.1, 39.5);
((GeneralPath)shape).curveTo(55.0, 36.9, 53.0, 35.9, 51.0, 35.9);
((GeneralPath)shape).lineTo(46.2, 35.9);
((GeneralPath)shape).lineTo(39.3, 42.9);
((GeneralPath)shape).curveTo(38.8, 43.4, 38.3, 43.800003, 37.6, 44.100002);
((GeneralPath)shape).curveTo(37.0, 44.4, 36.3, 44.500004, 35.6, 44.500004);
((GeneralPath)shape).curveTo(34.899998, 44.500004, 34.199997, 44.400005, 33.6, 44.100002);
((GeneralPath)shape).lineTo(33.399998, 44.100002);
((GeneralPath)shape).curveTo(32.899998, 43.800003, 32.399998, 43.500004, 31.899998, 43.100002);
((GeneralPath)shape).lineTo(24.999998, 36.100002);
((GeneralPath)shape).lineTo(20.199997, 36.100002);
((GeneralPath)shape).curveTo(18.199997, 36.100002, 16.399998, 37.2, 15.099997, 39.7);
((GeneralPath)shape).lineTo(10.899997, 48.6);
((GeneralPath)shape).curveTo(11.899997, 48.0, 12.799996, 47.699997, 13.799997, 47.699997);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new LinearGradientPaint(new Point2D.Double(35.71500015258789, 41.981998443603516), new Point2D.Double(35.71500015258789, 17.854999542236328), new float[] {0.0f,0.164f,1.0f}, new Color[] {new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.9, 32.6);
((GeneralPath)shape).curveTo(46.100002, 32.399998, 46.300003, 32.1, 46.5, 31.699999);
((GeneralPath)shape).curveTo(46.6, 31.4, 46.7, 30.999998, 46.7, 30.699999);
((GeneralPath)shape).curveTo(46.7, 30.3, 46.600002, 29.999998, 46.5, 29.699999);
((GeneralPath)shape).curveTo(46.4, 29.4, 46.2, 29.099998, 45.9, 28.9);
((GeneralPath)shape).curveTo(45.600002, 28.6, 45.4, 28.4, 45.0, 28.3);
((GeneralPath)shape).curveTo(44.7, 28.199999, 44.4, 28.099998, 44.0, 28.099998);
((GeneralPath)shape).curveTo(43.6, 28.099998, 43.3, 28.199999, 43.0, 28.3);
((GeneralPath)shape).lineTo(42.1, 28.9);
((GeneralPath)shape).lineTo(38.199997, 32.9);
((GeneralPath)shape).lineTo(38.199997, 20.5);
((GeneralPath)shape).curveTo(38.199997, 20.1, 38.1, 19.8, 37.999996, 19.5);
((GeneralPath)shape).curveTo(37.899998, 19.2, 37.699997, 18.9, 37.399998, 18.6);
((GeneralPath)shape).curveTo(37.199997, 18.300001, 36.899998, 18.1, 36.499996, 18.0);
((GeneralPath)shape).curveTo(36.199997, 17.9, 35.899998, 17.8, 35.499996, 17.8);
((GeneralPath)shape).curveTo(35.099995, 17.8, 34.799995, 17.9, 34.499996, 18.0);
((GeneralPath)shape).lineTo(33.599995, 18.6);
((GeneralPath)shape).curveTo(33.399994, 18.9, 33.199993, 19.1, 32.999996, 19.5);
((GeneralPath)shape).curveTo(32.899998, 19.8, 32.799995, 20.2, 32.799995, 20.5);
((GeneralPath)shape).lineTo(32.799995, 32.8);
((GeneralPath)shape).lineTo(28.899996, 28.8);
((GeneralPath)shape).curveTo(28.699995, 28.599998, 28.399996, 28.4, 27.999996, 28.199999);
((GeneralPath)shape).curveTo(27.699997, 28.099998, 27.399996, 27.999998, 26.999996, 27.999998);
((GeneralPath)shape).curveTo(26.599997, 27.999998, 26.299995, 28.099998, 25.999996, 28.199999);
((GeneralPath)shape).curveTo(25.699997, 28.3, 25.399996, 28.499998, 25.099997, 28.8);
((GeneralPath)shape).curveTo(24.899996, 29.0, 24.699997, 29.3, 24.499996, 29.599998);
((GeneralPath)shape).curveTo(24.399996, 29.899998, 24.299995, 30.3, 24.299995, 30.599998);
((GeneralPath)shape).curveTo(24.299995, 30.999998, 24.399996, 31.3, 24.499996, 31.599998);
((GeneralPath)shape).curveTo(24.599997, 31.899998, 24.799995, 32.199997, 25.099997, 32.5);
((GeneralPath)shape).lineTo(33.499996, 41.1);
((GeneralPath)shape).curveTo(33.699997, 41.3, 33.999996, 41.5, 34.399998, 41.699997);
((GeneralPath)shape).curveTo(34.699997, 41.799995, 34.999996, 41.899998, 35.399998, 41.899998);
((GeneralPath)shape).curveTo(35.8, 41.899998, 36.1, 41.8, 36.399998, 41.699997);
((GeneralPath)shape).curveTo(36.699997, 41.6, 36.999996, 41.399998, 37.3, 41.1);
((GeneralPath)shape).lineTo(45.9, 32.6);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
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
        return 0.12800002098083496;
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
		return 0.7410314083099365;
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
	private ext_ovf() {
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
       ext_ovf base = new ext_ovf();
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
       ext_ovf base = new ext_ovf();
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
        return () -> new ext_ovf();
    }
}

