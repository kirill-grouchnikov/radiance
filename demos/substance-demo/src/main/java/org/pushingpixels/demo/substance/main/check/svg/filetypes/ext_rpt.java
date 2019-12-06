package org.pushingpixels.demo.substance.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_rpt implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.9, 18.0);
((GeneralPath)shape).curveTo(31.4, 18.0, 30.9, 18.4, 30.699999, 18.8);
((GeneralPath)shape).lineTo(29.499998, 21.099998);
((GeneralPath)shape).lineTo(21.0, 21.099998);
((GeneralPath)shape).curveTo(20.2, 21.099998, 19.4, 21.8, 19.4, 22.599998);
((GeneralPath)shape).curveTo(19.3, 35.8, 19.6, 49.0, 19.4, 62.199997);
((GeneralPath)shape).curveTo(19.4, 63.1, 20.1, 63.899998, 21.0, 63.899998);
((GeneralPath)shape).lineTo(51.1, 63.899998);
((GeneralPath)shape).curveTo(51.899998, 63.899998, 52.699997, 63.1, 52.699997, 62.3);
((GeneralPath)shape).lineTo(52.699997, 22.7);
((GeneralPath)shape).curveTo(52.699997, 21.900002, 51.899998, 21.1, 51.1, 21.1);
((GeneralPath)shape).lineTo(42.6, 21.1);
((GeneralPath)shape).lineTo(41.399998, 18.800001);
((GeneralPath)shape).curveTo(41.1, 18.300001, 40.6, 18.000002, 39.999996, 18.000002);
((GeneralPath)shape).lineTo(31.899996, 18.000002);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 64.0), new Point2D.Double(36.0, 18.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.0, 64.5), new Point2D.Double(36.0, 17.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.9, 18.0);
((GeneralPath)shape).curveTo(31.4, 18.0, 30.9, 18.4, 30.699999, 18.8);
((GeneralPath)shape).lineTo(29.499998, 21.099998);
((GeneralPath)shape).lineTo(21.0, 21.099998);
((GeneralPath)shape).curveTo(20.2, 21.099998, 19.4, 21.8, 19.4, 22.599998);
((GeneralPath)shape).curveTo(19.3, 35.8, 19.6, 49.0, 19.4, 62.199997);
((GeneralPath)shape).curveTo(19.4, 63.1, 20.1, 63.899998, 21.0, 63.899998);
((GeneralPath)shape).lineTo(51.1, 63.899998);
((GeneralPath)shape).curveTo(51.899998, 63.899998, 52.699997, 63.1, 52.699997, 62.3);
((GeneralPath)shape).lineTo(52.699997, 22.7);
((GeneralPath)shape).curveTo(52.699997, 21.900002, 51.899998, 21.1, 51.1, 21.1);
((GeneralPath)shape).lineTo(42.6, 21.1);
((GeneralPath)shape).lineTo(41.399998, 18.800001);
((GeneralPath)shape).curveTo(41.1, 18.300001, 40.6, 18.000002, 39.999996, 18.000002);
((GeneralPath)shape).lineTo(31.899996, 18.000002);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.5, 24.4);
((GeneralPath)shape).lineTo(28.1, 24.4);
((GeneralPath)shape).curveTo(28.1, 26.0, 28.300001, 27.5, 29.7, 27.5);
((GeneralPath)shape).lineTo(42.4, 27.5);
((GeneralPath)shape).curveTo(44.0, 27.5, 44.0, 25.9, 44.0, 24.4);
((GeneralPath)shape).lineTo(49.6, 24.4);
((GeneralPath)shape).lineTo(49.6, 60.800003);
((GeneralPath)shape).lineTo(22.599998, 60.800003);
((GeneralPath)shape).curveTo(22.599998, 48.700005, 22.599998, 36.500004, 22.499998, 24.400002);
((GeneralPath)shape).closePath();
paint = new Color(247, 248, 250, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(26.5, 33.1);
((GeneralPath)shape).lineTo(45.5, 33.1);
((GeneralPath)shape).lineTo(45.5, 36.3);
((GeneralPath)shape).lineTo(26.5, 36.3);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(26.500999450683594, 34.64899826049805), new Point2D.Double(45.525001525878906, 34.64899826049805), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(26.5, 39.4);
((GeneralPath)shape).lineTo(45.5, 39.4);
((GeneralPath)shape).lineTo(45.5, 42.600002);
((GeneralPath)shape).lineTo(26.5, 42.600002);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(26.500999450683594, 41.0), new Point2D.Double(45.525001525878906, 41.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(26.5, 45.8);
((GeneralPath)shape).lineTo(45.5, 45.8);
((GeneralPath)shape).lineTo(45.5, 48.899998);
((GeneralPath)shape).lineTo(26.5, 48.899998);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(26.500999450683594, 47.33700180053711), new Point2D.Double(45.525001525878906, 47.33700180053711), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
shape = new GeneralPath();
((GeneralPath)shape).moveTo(26.5, 52.1);
((GeneralPath)shape).lineTo(39.2, 52.1);
((GeneralPath)shape).lineTo(39.2, 55.3);
((GeneralPath)shape).lineTo(26.5, 55.3);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(26.500999450683594, 53.67300033569336), new Point2D.Double(39.20199966430664, 53.67300033569336), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
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
g.setTransform(defaultTransform__0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.1, 91.9);
((GeneralPath)shape).lineTo(10.1, 71.9);
((GeneralPath)shape).lineTo(18.6, 71.9);
((GeneralPath)shape).curveTo(20.7, 71.9, 22.300001, 72.1, 23.3, 72.4);
((GeneralPath)shape).curveTo(24.299997, 72.700005, 25.0, 73.4, 25.599998, 74.3);
((GeneralPath)shape).curveTo(26.199999, 75.200005, 26.499998, 76.3, 26.499998, 77.5);
((GeneralPath)shape).curveTo(26.499998, 79.0, 26.099998, 80.2, 25.199999, 81.2);
((GeneralPath)shape).curveTo(24.3, 82.2, 22.999998, 82.799995, 21.199999, 83.1);
((GeneralPath)shape).curveTo(22.099998, 83.6, 22.8, 84.2, 23.4, 84.799995);
((GeneralPath)shape).curveTo(24.0, 85.399994, 24.699999, 86.49999, 25.699999, 88.1);
((GeneralPath)shape).lineTo(28.099998, 92.0);
((GeneralPath)shape).lineTo(23.3, 92.0);
((GeneralPath)shape).lineTo(20.4, 87.6);
((GeneralPath)shape).curveTo(19.4, 86.0, 18.6, 85.1, 18.3, 84.7);
((GeneralPath)shape).curveTo(17.999998, 84.299995, 17.5, 84.0, 17.099998, 83.899994);
((GeneralPath)shape).curveTo(16.699999, 83.7, 15.999998, 83.7, 15.099998, 83.7);
((GeneralPath)shape).lineTo(14.299998, 83.7);
((GeneralPath)shape).lineTo(14.299998, 92.1);
((GeneralPath)shape).lineTo(10.099998, 92.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(14.1, 80.3);
((GeneralPath)shape).lineTo(17.1, 80.3);
((GeneralPath)shape).curveTo(19.0, 80.3, 20.300001, 80.200005, 20.7, 80.100006);
((GeneralPath)shape).curveTo(21.2, 79.90001, 21.6, 79.700005, 21.800001, 79.3);
((GeneralPath)shape).curveTo(22.000002, 78.9, 22.2, 78.4, 22.2, 77.8);
((GeneralPath)shape).curveTo(22.2, 77.100006, 22.0, 76.600006, 21.7, 76.200005);
((GeneralPath)shape).curveTo(21.300001, 75.8, 20.800001, 75.50001, 20.2, 75.4);
((GeneralPath)shape).curveTo(19.900002, 75.4, 18.900002, 75.3, 17.2, 75.3);
((GeneralPath)shape).lineTo(14.0, 75.3);
((GeneralPath)shape).lineTo(14.0, 80.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.300001, 91.9);
((GeneralPath)shape).lineTo(30.300001, 71.9);
((GeneralPath)shape).lineTo(36.800003, 71.9);
((GeneralPath)shape).curveTo(39.300003, 71.9, 40.9, 72.0, 41.600002, 72.200005);
((GeneralPath)shape).curveTo(42.7, 72.50001, 43.7, 73.200005, 44.500004, 74.200005);
((GeneralPath)shape).curveTo(45.300003, 75.200005, 45.700005, 76.50001, 45.700005, 78.100006);
((GeneralPath)shape).curveTo(45.700005, 79.3, 45.500004, 80.40001, 45.000004, 81.200005);
((GeneralPath)shape).curveTo(44.600002, 82.00001, 44.000004, 82.700005, 43.300003, 83.200005);
((GeneralPath)shape).curveTo(42.600002, 83.700005, 41.9, 84.00001, 41.200005, 84.200005);
((GeneralPath)shape).curveTo(40.200005, 84.4, 38.800003, 84.50001, 37.000004, 84.50001);
((GeneralPath)shape).lineTo(34.400005, 84.50001);
((GeneralPath)shape).lineTo(34.400005, 92.100006);
((GeneralPath)shape).lineTo(30.300005, 92.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(34.300003, 75.2);
((GeneralPath)shape).lineTo(34.300003, 80.899994);
((GeneralPath)shape).lineTo(36.500004, 80.899994);
((GeneralPath)shape).curveTo(38.100002, 80.899994, 39.200005, 80.799995, 39.700005, 80.59999);
((GeneralPath)shape).curveTo(40.200005, 80.399994, 40.700005, 80.09999, 41.000004, 79.59999);
((GeneralPath)shape).curveTo(41.300003, 79.19999, 41.500004, 78.59999, 41.500004, 77.99999);
((GeneralPath)shape).curveTo(41.500004, 77.299995, 41.300003, 76.69999, 40.900005, 76.19999);
((GeneralPath)shape).curveTo(40.500004, 75.69999, 39.900005, 75.39999, 39.300007, 75.29999);
((GeneralPath)shape).curveTo(38.800007, 75.19999, 37.800007, 75.19999, 36.400005, 75.19999);
((GeneralPath)shape).lineTo(34.300007, 75.19999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.4, 91.899994);
((GeneralPath)shape).lineTo(53.4, 75.2);
((GeneralPath)shape).lineTo(47.5, 75.2);
((GeneralPath)shape).lineTo(47.5, 71.799995);
((GeneralPath)shape).lineTo(63.4, 71.799995);
((GeneralPath)shape).lineTo(63.4, 75.2);
((GeneralPath)shape).lineTo(57.5, 75.2);
((GeneralPath)shape).lineTo(57.5, 91.899994);
((GeneralPath)shape).lineTo(53.4, 91.899994);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
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
	private ext_rpt() {
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
       ext_rpt base = new ext_rpt();
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
       ext_rpt base = new ext_rpt();
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
        return ext_rpt::new;
    }
}

