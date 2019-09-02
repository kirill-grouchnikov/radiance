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
public class ext_swift implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.699999);
((GeneralPath)shape).lineTo(72.0, 99.299995);
((GeneralPath)shape).lineTo(0.0, 99.299995);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, -3.200000047683716), new Point2D.Double(36.0, 95.30000305175781), new float[] {0.005f,1.0f}, new Color[] {new Color(252, 174, 63, 255),new Color(254, 82, 46, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.699999);
((GeneralPath)shape).lineTo(72.0, 99.299995);
((GeneralPath)shape).lineTo(0.0, 99.299995);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(0.0, 50.0), new Point2D.Double(72.0, 50.0), new float[] {0.005f,1.0f}, new Color[] {new Color(252, 174, 63, 0),new Color(252, 112, 50, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.699999);
((GeneralPath)shape).lineTo(72.0, 99.299995);
((GeneralPath)shape).lineTo(0.0, 99.299995);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
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
((GeneralPath)shape).moveTo(15.4, 24.5);
((GeneralPath)shape).curveTo(15.599999, 24.4, 16.199999, 24.3, 16.9, 24.3);
((GeneralPath)shape).lineTo(17.8, 24.3);
((GeneralPath)shape).curveTo(19.0, 24.4, 20.099998, 24.599998, 21.4, 25.599998);
((GeneralPath)shape).curveTo(21.699999, 25.8, 22.1, 26.199999, 22.4, 26.499998);
((GeneralPath)shape).curveTo(22.5, 26.599998, 22.6, 26.799997, 22.8, 26.599998);
((GeneralPath)shape).curveTo(23.099998, 26.199999, 23.599998, 25.199999, 24.4, 24.499998);
((GeneralPath)shape).curveTo(24.9, 23.999998, 26.199999, 23.299997, 28.3, 23.299997);
((GeneralPath)shape).lineTo(29.3, 23.299997);
((GeneralPath)shape).curveTo(32.0, 23.599997, 36.2, 24.699997, 39.3, 25.599997);
((GeneralPath)shape).curveTo(42.0, 26.399996, 53.5, 30.199997, 53.6, 30.299995);
((GeneralPath)shape).curveTo(53.6, 30.299995, 54.6, 30.599995, 54.399998, 31.099995);
((GeneralPath)shape).curveTo(54.3, 31.399994, 53.6, 31.399994, 53.399998, 31.299995);
((GeneralPath)shape).curveTo(52.0, 31.0, 39.8, 29.7, 37.0, 29.6);
((GeneralPath)shape).curveTo(35.1, 29.5, 34.2, 30.1, 34.0, 31.1);
((GeneralPath)shape).curveTo(33.9, 31.800001, 34.9, 35.6, 36.0, 37.0);
((GeneralPath)shape).curveTo(36.6, 37.3, 41.2, 39.6, 43.2, 40.5);
((GeneralPath)shape).curveTo(43.600002, 40.7, 44.4, 41.0, 45.600002, 41.5);
((GeneralPath)shape).curveTo(50.7, 43.6, 60.9, 48.1, 62.0, 48.6);
((GeneralPath)shape).curveTo(62.7, 49.0, 62.8, 50.0, 62.5, 49.899998);
((GeneralPath)shape).curveTo(61.9, 49.699997, 61.2, 49.399998, 61.0, 49.3);
((GeneralPath)shape).curveTo(60.0, 48.8, 48.9, 44.5, 46.0, 43.8);
((GeneralPath)shape).curveTo(44.1, 43.3, 42.7, 43.0, 41.8, 43.0);
((GeneralPath)shape).curveTo(41.6, 43.0, 41.1, 43.0, 41.0, 43.4);
((GeneralPath)shape).curveTo(40.8, 44.100002, 41.6, 45.2, 42.3, 46.2);
((GeneralPath)shape).curveTo(42.399998, 46.3, 42.5, 46.4, 42.5, 46.600002);
((GeneralPath)shape).curveTo(43.3, 47.800003, 45.6, 51.100002, 46.7, 52.4);
((GeneralPath)shape).curveTo(47.8, 53.7, 55.2, 62.300003, 55.300003, 62.5);
((GeneralPath)shape).curveTo(55.4, 62.8, 54.600002, 62.6, 54.600002, 62.6);
((GeneralPath)shape).curveTo(54.4, 62.5, 53.600002, 62.3, 53.100002, 61.699997);
((GeneralPath)shape).curveTo(52.500004, 60.999996, 36.300003, 44.299995, 34.9, 43.1);
((GeneralPath)shape).curveTo(34.300003, 42.6, 32.800003, 41.6, 31.400002, 41.8);
((GeneralPath)shape).curveTo(29.800001, 42.0, 28.300001, 43.5, 28.300001, 45.3);
((GeneralPath)shape).curveTo(28.300001, 46.3, 28.500002, 47.8, 28.800001, 49.7);
((GeneralPath)shape).curveTo(29.2, 52.100002, 29.400002, 53.0, 30.1, 55.600002);
((GeneralPath)shape).curveTo(30.2, 56.100002, 30.4, 56.7, 30.5, 57.300003);
((GeneralPath)shape).curveTo(30.7, 58.000004, 30.9, 58.800003, 31.1, 59.600002);
((GeneralPath)shape).curveTo(32.3, 64.200005, 32.3, 64.700005, 32.0, 64.9);
((GeneralPath)shape).curveTo(31.8, 65.0, 31.6, 64.9, 30.8, 64.0);
((GeneralPath)shape).curveTo(30.4, 63.5, 29.8, 62.8, 29.0, 61.8);
((GeneralPath)shape).curveTo(27.7, 60.1, 25.7, 57.5, 23.8, 54.8);
((GeneralPath)shape).curveTo(21.5, 51.399998, 17.4, 42.5, 16.9, 40.699997);
((GeneralPath)shape).curveTo(16.8, 40.199997, 15.799999, 37.299995, 16.6, 36.199997);
((GeneralPath)shape).curveTo(16.7, 36.1, 17.7, 34.899998, 17.7, 34.299995);
((GeneralPath)shape).curveTo(17.6, 33.699997, 17.2, 32.899994, 16.7, 32.099995);
((GeneralPath)shape).curveTo(16.2, 31.299995, 15.700001, 30.499994, 15.300001, 29.499994);
((GeneralPath)shape).curveTo(14.600001, 27.899994, 14.600001, 26.599995, 14.500001, 26.099995);
((GeneralPath)shape).lineTo(14.000001, 24.199995);
((GeneralPath)shape).lineTo(15.400001, 24.499994);
((GeneralPath)shape).closePath();
paint = new Color(250, 42, 34, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.3, 26.0);
((GeneralPath)shape).curveTo(15.3, 26.0, 16.0, 28.7, 17.1, 30.1);
((GeneralPath)shape).curveTo(18.2, 31.5, 21.7, 34.9, 19.9, 36.1);
((GeneralPath)shape).curveTo(18.1, 37.3, 17.199999, 37.1, 18.3, 41.0);
((GeneralPath)shape).curveTo(19.4, 44.9, 23.199999, 51.8, 23.9, 52.9);
((GeneralPath)shape).curveTo(25.6, 55.600002, 29.099998, 58.0, 28.9, 54.600002);
((GeneralPath)shape).curveTo(28.8, 52.800003, 28.5, 51.800003, 28.1, 49.9);
((GeneralPath)shape).curveTo(27.7, 47.9, 27.6, 46.4, 27.6, 45.4);
((GeneralPath)shape).curveTo(27.6, 43.800003, 29.4, 41.0, 29.6, 40.7);
((GeneralPath)shape).curveTo(29.800001, 40.4, 30.1, 40.0, 30.7, 40.0);
((GeneralPath)shape).curveTo(32.3, 39.9, 34.8, 42.2, 35.4, 42.7);
((GeneralPath)shape).curveTo(35.7, 43.0, 36.800003, 44.0, 38.2, 45.4);
((GeneralPath)shape).curveTo(39.600002, 46.600002, 41.7, 48.300003, 42.2, 48.7);
((GeneralPath)shape).curveTo(43.0, 49.3, 43.7, 50.3, 42.4, 47.8);
((GeneralPath)shape).curveTo(42.300003, 47.6, 41.800003, 46.8, 41.7, 46.7);
((GeneralPath)shape).curveTo(40.9, 45.5, 40.100002, 44.2, 40.4, 43.100002);
((GeneralPath)shape).curveTo(40.600002, 42.600002, 41.100002, 42.300003, 41.9, 42.300003);
((GeneralPath)shape).curveTo(42.9, 42.300003, 44.4, 42.600002, 46.300003, 43.100002);
((GeneralPath)shape).curveTo(47.200005, 43.300003, 51.100002, 44.7, 51.100002, 44.500004);
((GeneralPath)shape).curveTo(51.100002, 44.200005, 46.800003, 42.600002, 45.500004, 42.000004);
((GeneralPath)shape).curveTo(44.400005, 41.500004, 43.500004, 41.200005, 43.100002, 41.000004);
((GeneralPath)shape).curveTo(41.000004, 40.100002, 35.9, 37.500004, 35.800003, 37.500004);
((GeneralPath)shape).lineTo(35.700005, 37.500004);
((GeneralPath)shape).lineTo(35.600006, 37.400005);
((GeneralPath)shape).curveTo(34.100006, 35.500004, 33.200005, 31.500006, 33.400005, 30.900005);
((GeneralPath)shape).curveTo(33.600006, 30.000006, 34.300007, 28.800005, 36.700005, 28.800005);
((GeneralPath)shape).lineTo(37.100006, 28.800005);
((GeneralPath)shape).curveTo(37.900005, 28.800005, 39.400005, 28.900005, 41.200005, 29.100004);
((GeneralPath)shape).curveTo(43.800003, 29.200005, 47.000004, 29.300005, 47.300003, 28.900003);
((GeneralPath)shape).curveTo(47.300003, 28.900003, 47.300003, 28.700003, 47.100002, 28.700003);
((GeneralPath)shape).curveTo(43.9, 27.700003, 40.500004, 26.500002, 39.100002, 26.100002);
((GeneralPath)shape).curveTo(37.300003, 25.600002, 35.100002, 25.000002, 33.100002, 24.500002);
((GeneralPath)shape).curveTo(29.800003, 23.800001, 27.800003, 23.900002, 26.800003, 24.200003);
((GeneralPath)shape).curveTo(24.200003, 25.000002, 24.400003, 27.300003, 23.900003, 27.900003);
((GeneralPath)shape).curveTo(23.200003, 28.700003, 22.300003, 27.300003, 21.700003, 26.800003);
((GeneralPath)shape).curveTo(21.200003, 26.300003, 20.700003, 25.900003, 20.400003, 25.700003);
((GeneralPath)shape).curveTo(19.200003, 24.900003, 17.300003, 24.900003, 17.100004, 24.900003);
((GeneralPath)shape).curveTo(16.300005, 24.900003, 15.700005, 25.100004, 15.700005, 25.100004);
((GeneralPath)shape).lineTo(15.600004, 25.100004);
((GeneralPath)shape).lineTo(15.100004, 25.000004);
((GeneralPath)shape).lineTo(15.300004, 26.000004);
((GeneralPath)shape).closePath();
paint = new Color(250, 42, 34, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.699999);
((GeneralPath)shape).lineTo(45.0, 27.699999);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.06999969482422, 23.68000030517578), new Point2D.Double(58.56999969482422, 10.180000305175781), new float[] {0.0f,0.383f,0.521f,0.62f,0.699f,0.767f,0.828f,0.882f,0.933f,0.977f,1.0f}, new Color[] {new Color(255, 252, 227, 255),new Color(255, 250, 224, 255),new Color(253, 243, 216, 255),new Color(251, 235, 204, 255),new Color(248, 223, 187, 255),new Color(245, 208, 166, 255),new Color(241, 191, 141, 255),new Color(236, 170, 114, 255),new Color(231, 147, 84, 255),new Color(226, 124, 52, 255),new Color(223, 111, 38, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.699999);
((GeneralPath)shape).lineTo(45.0, 27.699999);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.699999);
((GeneralPath)shape).lineTo(45.0, 27.699999);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.0, 86.6);
((GeneralPath)shape).lineTo(7.8, 86.299995);
((GeneralPath)shape).curveTo(8.0, 87.2, 8.3, 87.899994, 8.8, 88.399994);
((GeneralPath)shape).curveTo(9.3, 88.899994, 10.0, 89.09999, 10.9, 89.09999);
((GeneralPath)shape).curveTo(11.799999, 89.09999, 12.5, 88.899994, 13.0, 88.49999);
((GeneralPath)shape).curveTo(13.5, 88.09999, 13.7, 87.59999, 13.7, 87.09999);
((GeneralPath)shape).curveTo(13.7, 86.79999, 13.599999, 86.49999, 13.4, 86.19999);
((GeneralPath)shape).curveTo(13.2, 85.99999, 12.9, 85.79999, 12.4, 85.59999);
((GeneralPath)shape).curveTo(12.099999, 85.49999, 11.299999, 85.29999, 10.099999, 84.99999);
((GeneralPath)shape).curveTo(8.499999, 84.59999, 7.3999996, 84.09999, 6.799999, 83.59999);
((GeneralPath)shape).curveTo(5.899999, 82.79999, 5.499999, 81.899994, 5.499999, 80.69999);
((GeneralPath)shape).curveTo(5.499999, 79.99999, 5.699999, 79.29999, 6.099999, 78.69999);
((GeneralPath)shape).curveTo(6.499999, 78.09999, 7.099999, 77.59999, 7.8999987, 77.19999);
((GeneralPath)shape).curveTo(8.699999, 76.79999, 9.599998, 76.69999, 10.699999, 76.69999);
((GeneralPath)shape).curveTo(12.499999, 76.69999, 13.899999, 77.09999, 14.799999, 77.89999);
((GeneralPath)shape).curveTo(15.699999, 78.69999, 16.199999, 79.69999, 16.199999, 81.09998);
((GeneralPath)shape).lineTo(13.299999, 81.19998);
((GeneralPath)shape).curveTo(13.199999, 80.499985, 12.9, 79.89998, 12.499999, 79.59998);
((GeneralPath)shape).curveTo(12.099998, 79.29999, 11.499999, 79.09998, 10.699999, 79.09998);
((GeneralPath)shape).curveTo(9.899999, 79.09998, 9.199999, 79.29998, 8.699999, 79.59998);
((GeneralPath)shape).curveTo(8.399999, 79.79998, 8.199999, 80.09998, 8.199999, 80.499985);
((GeneralPath)shape).curveTo(8.199999, 80.79999, 8.299999, 81.09998, 8.599998, 81.39999);
((GeneralPath)shape).curveTo(8.999998, 81.69999, 9.899999, 81.999985, 11.299998, 82.39999);
((GeneralPath)shape).curveTo(12.699998, 82.79999, 13.799998, 83.09998, 14.399998, 83.39999);
((GeneralPath)shape).curveTo(14.999997, 83.69999, 15.5999975, 84.19999, 15.999998, 84.89999);
((GeneralPath)shape).curveTo(16.399998, 85.59998, 16.599998, 86.29999, 16.599998, 87.19999);
((GeneralPath)shape).curveTo(16.599998, 87.99999, 16.399998, 88.79999, 15.899999, 89.49999);
((GeneralPath)shape).curveTo(15.399999, 90.19999, 14.799998, 90.69999, 13.999999, 91.09999);
((GeneralPath)shape).curveTo(13.199999, 91.399994, 12.099999, 91.59999, 10.9, 91.59999);
((GeneralPath)shape).curveTo(9.099999, 91.59999, 7.7, 91.19999, 6.7, 90.29999);
((GeneralPath)shape).curveTo(5.7, 89.39999, 5.2, 88.2, 5.0, 86.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.2, 91.299995);
((GeneralPath)shape).lineTo(17.8, 77.0);
((GeneralPath)shape).lineTo(20.8, 77.0);
((GeneralPath)shape).lineTo(23.0, 86.8);
((GeneralPath)shape).lineTo(25.6, 77.0);
((GeneralPath)shape).lineTo(29.0, 77.0);
((GeneralPath)shape).lineTo(31.5, 87.0);
((GeneralPath)shape).lineTo(33.7, 77.0);
((GeneralPath)shape).lineTo(36.600002, 77.0);
((GeneralPath)shape).lineTo(33.100002, 91.3);
((GeneralPath)shape).lineTo(30.0, 91.3);
((GeneralPath)shape).lineTo(27.1, 80.600006);
((GeneralPath)shape).lineTo(24.2, 91.3);
((GeneralPath)shape).lineTo(21.2, 91.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.1, 91.299995);
((GeneralPath)shape).lineTo(38.1, 77.0);
((GeneralPath)shape).lineTo(41.0, 77.0);
((GeneralPath)shape).lineTo(41.0, 91.3);
((GeneralPath)shape).lineTo(38.1, 91.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(43.8, 91.299995);
((GeneralPath)shape).lineTo(43.8, 77.0);
((GeneralPath)shape).lineTo(53.699997, 77.0);
((GeneralPath)shape).lineTo(53.699997, 79.4);
((GeneralPath)shape).lineTo(46.699997, 79.4);
((GeneralPath)shape).lineTo(46.699997, 82.8);
((GeneralPath)shape).lineTo(52.699997, 82.8);
((GeneralPath)shape).lineTo(52.699997, 85.200005);
((GeneralPath)shape).lineTo(46.699997, 85.200005);
((GeneralPath)shape).lineTo(46.699997, 91.3);
((GeneralPath)shape).lineTo(43.799995, 91.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(59.3, 91.299995);
((GeneralPath)shape).lineTo(59.3, 79.4);
((GeneralPath)shape).lineTo(55.0, 79.4);
((GeneralPath)shape).lineTo(55.0, 77.0);
((GeneralPath)shape).lineTo(66.5, 77.0);
((GeneralPath)shape).lineTo(66.5, 79.4);
((GeneralPath)shape).lineTo(62.2, 79.4);
((GeneralPath)shape).lineTo(62.2, 91.3);
((GeneralPath)shape).lineTo(59.3, 91.3);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
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
	private ext_swift() {
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
       ext_swift base = new ext_swift();
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
       ext_swift base = new ext_swift();
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
        return ext_swift::new;
    }
}

