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
public class ext_class implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
paint = new LinearGradientPaint(new Point2D.Double(21.450000762939453, 61.54999923706055), new Point2D.Double(21.450000762939453, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.4, 44.1);
((GeneralPath)shape).lineTo(14.4, 39.199997);
((GeneralPath)shape).curveTo(15.4, 39.1, 16.199999, 38.999996, 16.699999, 38.699997);
((GeneralPath)shape).curveTo(17.199999, 38.499996, 17.599998, 37.999996, 17.999998, 37.499996);
((GeneralPath)shape).curveTo(18.399998, 36.899998, 18.599998, 36.199997, 18.799997, 35.299995);
((GeneralPath)shape).curveTo(18.899998, 34.599995, 18.999998, 33.499996, 18.999998, 31.899996);
((GeneralPath)shape).curveTo(18.999998, 29.199995, 19.099998, 27.399996, 19.399998, 26.299995);
((GeneralPath)shape).curveTo(19.599998, 25.299995, 20.099998, 24.399996, 20.699997, 23.799995);
((GeneralPath)shape).curveTo(21.299995, 23.199995, 22.299997, 22.699995, 23.499996, 22.299995);
((GeneralPath)shape).curveTo(24.299995, 22.099995, 25.599997, 21.899996, 27.399996, 21.899996);
((GeneralPath)shape).lineTo(28.499996, 21.899996);
((GeneralPath)shape).lineTo(28.499996, 26.799995);
((GeneralPath)shape).curveTo(26.999996, 26.799995, 25.999996, 26.899996, 25.599997, 27.099995);
((GeneralPath)shape).curveTo(25.199997, 27.299995, 24.899996, 27.499994, 24.599997, 27.899994);
((GeneralPath)shape).curveTo(24.399996, 28.199993, 24.299997, 28.799994, 24.299997, 29.699993);
((GeneralPath)shape).curveTo(24.299997, 30.599993, 24.199997, 32.199993, 24.099997, 34.599995);
((GeneralPath)shape).curveTo(23.999996, 35.999996, 23.899996, 37.099995, 23.599997, 37.999996);
((GeneralPath)shape).curveTo(23.299997, 38.799995, 22.899996, 39.499996, 22.499996, 40.099995);
((GeneralPath)shape).curveTo(22.099997, 40.599995, 21.399996, 41.199993, 20.499996, 41.799995);
((GeneralPath)shape).curveTo(21.299995, 42.299995, 21.999996, 42.799995, 22.499996, 43.399994);
((GeneralPath)shape).curveTo(22.999996, 43.999992, 23.399996, 44.799995, 23.699997, 45.699993);
((GeneralPath)shape).curveTo(23.999998, 46.59999, 24.199997, 47.79999, 24.199997, 49.29999);
((GeneralPath)shape).curveTo(24.299997, 51.59999, 24.299997, 52.999992, 24.299997, 53.699993);
((GeneralPath)shape).curveTo(24.299997, 54.599995, 24.399998, 55.199993, 24.599997, 55.599995);
((GeneralPath)shape).curveTo(24.799997, 55.999996, 25.199997, 56.199993, 25.599997, 56.399994);
((GeneralPath)shape).curveTo(25.999996, 56.599995, 26.999996, 56.699993, 28.499996, 56.699993);
((GeneralPath)shape).lineTo(28.499996, 61.599995);
((GeneralPath)shape).lineTo(27.399996, 61.599995);
((GeneralPath)shape).curveTo(25.599997, 61.599995, 24.099997, 61.499996, 23.199997, 61.199993);
((GeneralPath)shape).curveTo(22.199997, 60.899994, 21.399998, 60.399994, 20.699997, 59.699993);
((GeneralPath)shape).curveTo(19.999996, 58.999992, 19.599997, 58.199993, 19.299997, 57.199993);
((GeneralPath)shape).curveTo(19.099997, 56.199993, 18.999998, 54.599995, 18.999998, 52.399994);
((GeneralPath)shape).curveTo(18.999998, 49.899994, 18.899998, 48.199993, 18.699999, 47.499992);
((GeneralPath)shape).curveTo(18.4, 46.399994, 17.9, 45.59999, 17.3, 45.09999);
((GeneralPath)shape).curveTo(16.599998, 44.499992, 15.699999, 44.09999, 14.4, 44.09999);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
paint = new LinearGradientPaint(new Point2D.Double(51.70000076293945, 61.45000076293945), new Point2D.Double(51.70000076293945, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(58.7, 44.1);
((GeneralPath)shape).curveTo(57.7, 44.199997, 56.9, 44.3, 56.4, 44.6);
((GeneralPath)shape).curveTo(55.9, 44.8, 55.5, 45.3, 55.100002, 45.8);
((GeneralPath)shape).curveTo(54.7, 46.399998, 54.500004, 47.1, 54.300003, 48.0);
((GeneralPath)shape).curveTo(54.200005, 48.7, 54.100002, 49.8, 54.100002, 51.4);
((GeneralPath)shape).curveTo(54.100002, 54.100002, 54.000004, 55.9, 53.7, 57.0);
((GeneralPath)shape).curveTo(53.5, 58.1, 53.0, 58.9, 52.4, 59.5);
((GeneralPath)shape).curveTo(51.800003, 60.1, 50.800003, 60.6, 49.600002, 61.0);
((GeneralPath)shape).curveTo(48.800003, 61.2, 47.500004, 61.4, 45.7, 61.4);
((GeneralPath)shape).lineTo(44.600002, 61.4);
((GeneralPath)shape).lineTo(44.600002, 56.5);
((GeneralPath)shape).curveTo(46.100002, 56.5, 47.000004, 56.4, 47.500004, 56.2);
((GeneralPath)shape).curveTo(48.000004, 56.0, 48.300003, 55.7, 48.500004, 55.4);
((GeneralPath)shape).curveTo(48.700005, 55.100002, 48.800003, 54.5, 48.800003, 53.600002);
((GeneralPath)shape).curveTo(48.800003, 52.800003, 48.9, 51.2, 49.000004, 48.800003);
((GeneralPath)shape).curveTo(49.100002, 47.4, 49.300003, 46.200005, 49.600002, 45.4);
((GeneralPath)shape).curveTo(49.9, 44.5, 50.300003, 43.800003, 50.800003, 43.2);
((GeneralPath)shape).curveTo(51.300003, 42.6, 51.9, 42.100002, 52.700005, 41.600002);
((GeneralPath)shape).curveTo(51.700005, 40.9, 50.900005, 40.300003, 50.500004, 39.7);
((GeneralPath)shape).curveTo(49.900005, 38.8, 49.400005, 37.600002, 49.200005, 36.3);
((GeneralPath)shape).curveTo(49.000004, 35.3, 48.900005, 33.2, 48.900005, 30.0);
((GeneralPath)shape).curveTo(48.900005, 29.0, 48.800007, 28.3, 48.600006, 27.9);
((GeneralPath)shape).curveTo(48.400005, 27.6, 48.100006, 27.3, 47.700005, 27.1);
((GeneralPath)shape).curveTo(47.300003, 26.9, 46.300003, 26.800001, 44.700005, 26.800001);
((GeneralPath)shape).lineTo(44.700005, 22.0);
((GeneralPath)shape).lineTo(45.800003, 22.0);
((GeneralPath)shape).curveTo(47.600002, 22.0, 49.100002, 22.1, 50.000004, 22.4);
((GeneralPath)shape).curveTo(51.000004, 22.699999, 51.800003, 23.199999, 52.500004, 23.9);
((GeneralPath)shape).curveTo(53.200005, 24.6, 53.600002, 25.4, 53.900005, 26.4);
((GeneralPath)shape).curveTo(54.100006, 27.4, 54.300007, 29.0, 54.300007, 31.2);
((GeneralPath)shape).curveTo(54.300007, 33.7, 54.400005, 35.3, 54.600006, 36.100002);
((GeneralPath)shape).curveTo(54.900005, 37.2, 55.400005, 38.000004, 56.000008, 38.4);
((GeneralPath)shape).curveTo(56.600006, 38.9, 57.600006, 39.100002, 58.800007, 39.2);
((GeneralPath)shape).lineTo(58.70001, 44.100002);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_1);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.3, 86.5);
((GeneralPath)shape).lineTo(17.0, 87.3);
((GeneralPath)shape).curveTo(16.6, 88.8, 15.9, 89.9, 15.0, 90.600006);
((GeneralPath)shape).curveTo(14.1, 91.3, 12.8, 91.700005, 11.4, 91.700005);
((GeneralPath)shape).curveTo(9.599999, 91.700005, 8.099999, 91.100006, 6.8999996, 89.8);
((GeneralPath)shape).curveTo(5.7, 88.600006, 5.2, 86.9, 5.2, 84.700005);
((GeneralPath)shape).curveTo(5.2, 82.4, 5.7999997, 80.700005, 7.0, 79.4);
((GeneralPath)shape).curveTo(8.2, 78.1, 9.7, 77.5, 11.6, 77.5);
((GeneralPath)shape).curveTo(13.3, 77.5, 14.6, 78.0, 15.700001, 79.0);
((GeneralPath)shape).curveTo(16.300001, 79.6, 16.800001, 80.4, 17.1, 81.5);
((GeneralPath)shape).lineTo(14.400001, 82.1);
((GeneralPath)shape).curveTo(14.200001, 81.4, 13.900001, 80.799995, 13.400001, 80.4);
((GeneralPath)shape).curveTo(12.900001, 80.0, 12.3, 79.8, 11.500001, 79.8);
((GeneralPath)shape).curveTo(10.500001, 79.8, 9.700001, 80.200005, 9.000001, 80.9);
((GeneralPath)shape).curveTo(8.300001, 81.9, 8.000001, 83.0, 8.000001, 84.700005);
((GeneralPath)shape).curveTo(8.000001, 86.4, 8.300001, 87.600006, 8.900001, 88.4);
((GeneralPath)shape).curveTo(9.500001, 89.1, 10.3, 89.5, 11.300001, 89.5);
((GeneralPath)shape).curveTo(12.000001, 89.5, 12.700001, 89.3, 13.200001, 88.8);
((GeneralPath)shape).curveTo(13.700001, 88.3, 14.1, 87.5, 14.300001, 86.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.4, 91.5);
((GeneralPath)shape).lineTo(19.4, 78.1);
((GeneralPath)shape).lineTo(22.1, 78.1);
((GeneralPath)shape).lineTo(22.1, 89.299995);
((GeneralPath)shape).lineTo(29.0, 89.299995);
((GeneralPath)shape).lineTo(29.0, 91.6);
((GeneralPath)shape).lineTo(19.4, 91.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(43.199997, 91.5);
((GeneralPath)shape).lineTo(40.199997, 91.5);
((GeneralPath)shape).lineTo(38.999996, 88.5);
((GeneralPath)shape).lineTo(33.599995, 88.5);
((GeneralPath)shape).lineTo(32.499996, 91.6);
((GeneralPath)shape).lineTo(29.599997, 91.6);
((GeneralPath)shape).lineTo(34.9, 78.0);
((GeneralPath)shape).lineTo(37.800003, 78.0);
((GeneralPath)shape).lineTo(43.200005, 91.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.199997, 86.2);
((GeneralPath)shape).lineTo(36.299995, 81.2);
((GeneralPath)shape).lineTo(34.499996, 86.2);
((GeneralPath)shape).lineTo(38.199997, 86.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(43.999996, 87.1);
((GeneralPath)shape).lineTo(46.699997, 86.799995);
((GeneralPath)shape).curveTo(46.899998, 87.7, 47.199997, 88.399994, 47.699997, 88.799995);
((GeneralPath)shape).curveTo(48.199997, 89.2, 48.899998, 89.399994, 49.699997, 89.399994);
((GeneralPath)shape).curveTo(50.6, 89.399994, 51.299995, 89.2, 51.699997, 88.799995);
((GeneralPath)shape).curveTo(52.1, 88.399994, 52.399998, 87.99999, 52.399998, 87.49999);
((GeneralPath)shape).curveTo(52.399998, 87.19999, 52.3, 86.899994, 52.1, 86.69999);
((GeneralPath)shape).curveTo(51.899998, 86.49999, 51.6, 86.29999, 51.1, 86.09999);
((GeneralPath)shape).curveTo(50.8, 85.99999, 50.0, 85.79999, 48.899998, 85.49999);
((GeneralPath)shape).curveTo(47.399998, 85.09999, 46.399998, 84.69999, 45.8, 84.19999);
((GeneralPath)shape).curveTo(45.0, 83.49999, 44.5, 82.49999, 44.5, 81.49999);
((GeneralPath)shape).curveTo(44.5, 80.799995, 44.7, 80.19999, 45.1, 79.59999);
((GeneralPath)shape).curveTo(45.5, 78.99999, 46.1, 78.49999, 46.8, 78.19999);
((GeneralPath)shape).curveTo(47.5, 77.89999, 48.399998, 77.69999, 49.5, 77.69999);
((GeneralPath)shape).curveTo(51.2, 77.69999, 52.5, 78.09999, 53.4, 78.79999);
((GeneralPath)shape).curveTo(54.300003, 79.499985, 54.7, 80.499985, 54.800003, 81.79999);
((GeneralPath)shape).lineTo(52.100002, 81.89999);
((GeneralPath)shape).curveTo(52.000004, 81.19999, 51.7, 80.69999, 51.300003, 80.39999);
((GeneralPath)shape).curveTo(50.9, 80.09998, 50.300003, 79.89999, 49.600002, 79.89999);
((GeneralPath)shape).curveTo(48.800003, 79.89999, 48.2, 80.09998, 47.7, 80.39999);
((GeneralPath)shape).curveTo(47.4, 80.59998, 47.3, 80.89999, 47.3, 81.19999);
((GeneralPath)shape).curveTo(47.3, 81.49999, 47.399998, 81.79999, 47.7, 81.99999);
((GeneralPath)shape).curveTo(48.0, 82.299995, 48.9, 82.59999, 50.2, 82.899994);
((GeneralPath)shape).curveTo(51.5, 83.2, 52.5, 83.49999, 53.2, 83.899994);
((GeneralPath)shape).curveTo(53.8, 84.2, 54.3, 84.7, 54.7, 85.299995);
((GeneralPath)shape).curveTo(55.100002, 85.899994, 55.2, 86.6, 55.2, 87.49999);
((GeneralPath)shape).curveTo(55.2, 88.299995, 55.0, 88.99999, 54.600002, 89.69999);
((GeneralPath)shape).curveTo(54.2, 90.39999, 53.600002, 90.89999, 52.800003, 91.19999);
((GeneralPath)shape).curveTo(52.000004, 91.49999, 51.000004, 91.69999, 49.800003, 91.69999);
((GeneralPath)shape).curveTo(48.100002, 91.69999, 46.800003, 91.29999, 45.800003, 90.49999);
((GeneralPath)shape).curveTo(44.700005, 89.799995, 44.100002, 88.59999, 44.000004, 87.09999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(56.6, 87.1);
((GeneralPath)shape).lineTo(59.3, 86.799995);
((GeneralPath)shape).curveTo(59.5, 87.7, 59.8, 88.399994, 60.3, 88.799995);
((GeneralPath)shape).curveTo(60.8, 89.2, 61.5, 89.399994, 62.3, 89.399994);
((GeneralPath)shape).curveTo(63.2, 89.399994, 63.899998, 89.2, 64.3, 88.799995);
((GeneralPath)shape).curveTo(64.700005, 88.399994, 65.0, 87.99999, 65.0, 87.49999);
((GeneralPath)shape).curveTo(65.0, 87.19999, 64.9, 86.899994, 64.7, 86.69999);
((GeneralPath)shape).curveTo(64.5, 86.49999, 64.2, 86.29999, 63.699997, 86.09999);
((GeneralPath)shape).curveTo(63.399998, 85.99999, 62.6, 85.79999, 61.499996, 85.49999);
((GeneralPath)shape).curveTo(59.999996, 85.09999, 58.999996, 84.69999, 58.399998, 84.19999);
((GeneralPath)shape).curveTo(57.6, 83.49999, 57.1, 82.49999, 57.1, 81.49999);
((GeneralPath)shape).curveTo(57.1, 80.799995, 57.3, 80.19999, 57.699997, 79.59999);
((GeneralPath)shape).curveTo(58.1, 78.99999, 58.699997, 78.49999, 59.399998, 78.19999);
((GeneralPath)shape).curveTo(60.1, 77.89999, 60.999996, 77.69999, 62.1, 77.69999);
((GeneralPath)shape).curveTo(63.8, 77.69999, 65.1, 78.09999, 66.0, 78.79999);
((GeneralPath)shape).curveTo(66.9, 79.499985, 67.3, 80.499985, 67.4, 81.79999);
((GeneralPath)shape).lineTo(64.700005, 81.89999);
((GeneralPath)shape).curveTo(64.600006, 81.19999, 64.3, 80.69999, 63.900005, 80.39999);
((GeneralPath)shape).curveTo(63.500004, 80.09998, 62.900005, 79.89999, 62.200005, 79.89999);
((GeneralPath)shape).curveTo(61.400005, 79.89999, 60.800003, 80.09998, 60.300003, 80.39999);
((GeneralPath)shape).curveTo(60.000004, 80.59998, 59.9, 80.89999, 59.9, 81.19999);
((GeneralPath)shape).curveTo(59.9, 81.49999, 60.0, 81.79999, 60.300003, 81.99999);
((GeneralPath)shape).curveTo(60.600002, 82.299995, 61.500004, 82.59999, 62.800003, 82.899994);
((GeneralPath)shape).curveTo(64.100006, 83.2, 65.100006, 83.49999, 65.8, 83.899994);
((GeneralPath)shape).curveTo(66.4, 84.2, 66.9, 84.7, 67.3, 85.299995);
((GeneralPath)shape).curveTo(67.700005, 85.899994, 67.8, 86.6, 67.8, 87.49999);
((GeneralPath)shape).curveTo(67.8, 88.299995, 67.600006, 88.99999, 67.200005, 89.69999);
((GeneralPath)shape).curveTo(66.8, 90.39999, 66.200005, 90.89999, 65.4, 91.19999);
((GeneralPath)shape).curveTo(64.6, 91.49999, 63.600002, 91.69999, 62.4, 91.69999);
((GeneralPath)shape).curveTo(60.7, 91.69999, 59.4, 91.29999, 58.4, 90.49999);
((GeneralPath)shape).curveTo(57.4, 89.799995, 56.800003, 88.59999, 56.600002, 87.09999);
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
		return 0.7400000095367432;
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
	private ext_class() {
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
       ext_class base = new ext_class();
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
       ext_class base = new ext_class();
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
        return () -> new ext_class();
    }
}

