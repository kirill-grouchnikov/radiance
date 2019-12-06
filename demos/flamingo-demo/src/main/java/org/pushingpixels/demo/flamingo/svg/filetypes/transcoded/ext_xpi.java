package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_xpi implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.4, 99.0);
((GeneralPath)shape).lineTo(0.4, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.003999948501587), new Point2D.Double(36.20000076293945, 100.9990005493164), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.4, 99.0);
((GeneralPath)shape).lineTo(0.4, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.4, 99.0);
((GeneralPath)shape).lineTo(0.4, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
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
((GeneralPath)shape).moveTo(13.8, 91.1);
((GeneralPath)shape).lineTo(20.6, 80.7);
((GeneralPath)shape).lineTo(14.400001, 71.2);
((GeneralPath)shape).lineTo(19.1, 71.2);
((GeneralPath)shape).lineTo(23.1, 77.6);
((GeneralPath)shape).lineTo(27.0, 71.2);
((GeneralPath)shape).lineTo(31.7, 71.2);
((GeneralPath)shape).lineTo(25.5, 80.799995);
((GeneralPath)shape).lineTo(32.3, 91.0);
((GeneralPath)shape).lineTo(27.4, 91.0);
((GeneralPath)shape).lineTo(23.0, 84.2);
((GeneralPath)shape).lineTo(18.6, 91.1);
((GeneralPath)shape).lineTo(13.8, 91.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(34.4, 91.1);
((GeneralPath)shape).lineTo(34.4, 71.2);
((GeneralPath)shape).lineTo(40.9, 71.2);
((GeneralPath)shape).curveTo(43.300003, 71.2, 44.9, 71.299995, 45.7, 71.5);
((GeneralPath)shape).curveTo(46.8, 71.8, 47.8, 72.4, 48.600002, 73.4);
((GeneralPath)shape).curveTo(49.4, 74.4, 49.800003, 75.700005, 49.800003, 77.3);
((GeneralPath)shape).curveTo(49.800003, 78.5, 49.600002, 79.5, 49.100002, 80.4);
((GeneralPath)shape).curveTo(48.600002, 81.3, 48.100002, 81.9, 47.4, 82.4);
((GeneralPath)shape).curveTo(46.7, 82.9, 46.0, 83.200005, 45.300003, 83.3);
((GeneralPath)shape).curveTo(44.300003, 83.5, 42.9, 83.600006, 41.100002, 83.600006);
((GeneralPath)shape).lineTo(38.500004, 83.600006);
((GeneralPath)shape).lineTo(38.500004, 91.100006);
((GeneralPath)shape).lineTo(34.400005, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.4, 74.6);
((GeneralPath)shape).lineTo(38.4, 80.2);
((GeneralPath)shape).lineTo(40.600002, 80.2);
((GeneralPath)shape).curveTo(42.2, 80.2, 43.2, 80.1, 43.800003, 79.899994);
((GeneralPath)shape).curveTo(44.300003, 79.7, 44.800003, 79.399994, 45.100002, 78.899994);
((GeneralPath)shape).curveTo(45.4, 78.49999, 45.600002, 77.899994, 45.600002, 77.399994);
((GeneralPath)shape).curveTo(45.600002, 76.7, 45.4, 76.09999, 45.000004, 75.59999);
((GeneralPath)shape).curveTo(44.600002, 75.09999, 44.000004, 74.79999, 43.400005, 74.69999);
((GeneralPath)shape).curveTo(42.900005, 74.59999, 42.000004, 74.59999, 40.500004, 74.59999);
((GeneralPath)shape).lineTo(38.400005, 74.59999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.800003, 91.1);
((GeneralPath)shape).lineTo(52.800003, 71.2);
((GeneralPath)shape).lineTo(56.800003, 71.2);
((GeneralPath)shape).lineTo(56.800003, 91.0);
((GeneralPath)shape).lineTo(52.800003, 91.0);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.6, 19.9);
((GeneralPath)shape).lineTo(28.300001, 21.699999);
((GeneralPath)shape).lineTo(28.500002, 25.3);
((GeneralPath)shape).lineTo(31.200003, 27.699999);
((GeneralPath)shape).lineTo(31.200003, 29.599998);
((GeneralPath)shape).lineTo(30.600002, 30.399998);
((GeneralPath)shape).lineTo(22.600002, 30.699997);
((GeneralPath)shape).lineTo(20.800003, 32.6);
((GeneralPath)shape).lineTo(20.800003, 40.199997);
((GeneralPath)shape).lineTo(20.100002, 41.899998);
((GeneralPath)shape).lineTo(18.100002, 41.899998);
((GeneralPath)shape).lineTo(16.600002, 40.699997);
((GeneralPath)shape).lineTo(16.200003, 38.299995);
((GeneralPath)shape).lineTo(11.9000025, 38.199997);
((GeneralPath)shape).lineTo(9.800003, 39.699997);
((GeneralPath)shape).lineTo(9.800003, 50.899998);
((GeneralPath)shape).lineTo(11.200003, 53.399998);
((GeneralPath)shape).lineTo(15.700003, 53.399998);
((GeneralPath)shape).lineTo(17.700003, 51.1);
((GeneralPath)shape).lineTo(18.500002, 48.699997);
((GeneralPath)shape).lineTo(20.200003, 48.6);
((GeneralPath)shape).lineTo(20.900003, 50.3);
((GeneralPath)shape).lineTo(20.900003, 62.3);
((GeneralPath)shape).lineTo(22.700003, 64.4);
((GeneralPath)shape).lineTo(29.500004, 64.4);
((GeneralPath)shape).lineTo(30.800003, 62.300003);
((GeneralPath)shape).lineTo(30.000004, 60.9);
((GeneralPath)shape).lineTo(28.600004, 60.100002);
((GeneralPath)shape).lineTo(28.600004, 57.300003);
((GeneralPath)shape).lineTo(30.800005, 55.4);
((GeneralPath)shape).lineTo(41.500004, 55.4);
((GeneralPath)shape).lineTo(43.800003, 57.300003);
((GeneralPath)shape).lineTo(43.800003, 59.9);
((GeneralPath)shape).lineTo(42.5, 61.0);
((GeneralPath)shape).lineTo(41.5, 62.3);
((GeneralPath)shape).lineTo(42.7, 64.4);
((GeneralPath)shape).lineTo(52.9, 64.3);
((GeneralPath)shape).lineTo(54.9, 62.300003);
((GeneralPath)shape).lineTo(54.9, 52.700005);
((GeneralPath)shape).lineTo(54.4, 51.000004);
((GeneralPath)shape).lineTo(52.9, 50.900005);
((GeneralPath)shape).lineTo(51.5, 52.000004);
((GeneralPath)shape).lineTo(50.5, 53.200005);
((GeneralPath)shape).lineTo(48.0, 53.100006);
((GeneralPath)shape).lineTo(45.9, 51.300007);
((GeneralPath)shape).lineTo(45.9, 40.9);
((GeneralPath)shape).lineTo(47.600002, 38.100002);
((GeneralPath)shape).lineTo(52.0, 38.100002);
((GeneralPath)shape).lineTo(53.0, 39.9);
((GeneralPath)shape).lineTo(55.0, 39.600002);
((GeneralPath)shape).lineTo(55.0, 32.9);
((GeneralPath)shape).lineTo(53.0, 30.800001);
((GeneralPath)shape).lineTo(41.2, 30.500002);
((GeneralPath)shape).lineTo(39.9, 29.400002);
((GeneralPath)shape).lineTo(40.100002, 27.400002);
((GeneralPath)shape).lineTo(43.4, 25.7);
((GeneralPath)shape).lineTo(43.800003, 22.0);
((GeneralPath)shape).lineTo(41.500004, 19.9);
((GeneralPath)shape).lineTo(30.6, 19.9);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(32.20500183105469, 37.54899978637695), new Point2D.Double(32.20500183105469, 82.09500122070312), new float[] {0.0f,1.0f}, new Color[] {new Color(76, 236, 0, 255),new Color(36, 127, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.6, 19.9);
((GeneralPath)shape).lineTo(28.300001, 21.699999);
((GeneralPath)shape).lineTo(28.500002, 25.3);
((GeneralPath)shape).lineTo(31.200003, 27.699999);
((GeneralPath)shape).lineTo(31.200003, 29.599998);
((GeneralPath)shape).lineTo(30.600002, 30.399998);
((GeneralPath)shape).lineTo(22.600002, 30.699997);
((GeneralPath)shape).lineTo(20.800003, 32.6);
((GeneralPath)shape).lineTo(20.800003, 40.199997);
((GeneralPath)shape).lineTo(20.100002, 41.899998);
((GeneralPath)shape).lineTo(18.100002, 41.899998);
((GeneralPath)shape).lineTo(16.600002, 40.699997);
((GeneralPath)shape).lineTo(16.200003, 38.299995);
((GeneralPath)shape).lineTo(11.9000025, 38.199997);
((GeneralPath)shape).lineTo(9.800003, 39.699997);
((GeneralPath)shape).lineTo(9.800003, 50.899998);
((GeneralPath)shape).lineTo(11.200003, 53.399998);
((GeneralPath)shape).lineTo(15.700003, 53.399998);
((GeneralPath)shape).lineTo(17.700003, 51.1);
((GeneralPath)shape).lineTo(18.500002, 48.699997);
((GeneralPath)shape).lineTo(20.200003, 48.6);
((GeneralPath)shape).lineTo(20.900003, 50.3);
((GeneralPath)shape).lineTo(20.900003, 62.3);
((GeneralPath)shape).lineTo(22.700003, 64.4);
((GeneralPath)shape).lineTo(29.500004, 64.4);
((GeneralPath)shape).lineTo(30.800003, 62.300003);
((GeneralPath)shape).lineTo(30.000004, 60.9);
((GeneralPath)shape).lineTo(28.600004, 60.100002);
((GeneralPath)shape).lineTo(28.600004, 57.300003);
((GeneralPath)shape).lineTo(30.800005, 55.4);
((GeneralPath)shape).lineTo(41.500004, 55.4);
((GeneralPath)shape).lineTo(43.800003, 57.300003);
((GeneralPath)shape).lineTo(43.800003, 59.9);
((GeneralPath)shape).lineTo(42.5, 61.0);
((GeneralPath)shape).lineTo(41.5, 62.3);
((GeneralPath)shape).lineTo(42.7, 64.4);
((GeneralPath)shape).lineTo(52.9, 64.3);
((GeneralPath)shape).lineTo(54.9, 62.300003);
((GeneralPath)shape).lineTo(54.9, 52.700005);
((GeneralPath)shape).lineTo(54.4, 51.000004);
((GeneralPath)shape).lineTo(52.9, 50.900005);
((GeneralPath)shape).lineTo(51.5, 52.000004);
((GeneralPath)shape).lineTo(50.5, 53.200005);
((GeneralPath)shape).lineTo(48.0, 53.100006);
((GeneralPath)shape).lineTo(45.9, 51.300007);
((GeneralPath)shape).lineTo(45.9, 40.9);
((GeneralPath)shape).lineTo(47.600002, 38.100002);
((GeneralPath)shape).lineTo(52.0, 38.100002);
((GeneralPath)shape).lineTo(53.0, 39.9);
((GeneralPath)shape).lineTo(55.0, 39.600002);
((GeneralPath)shape).lineTo(55.0, 32.9);
((GeneralPath)shape).lineTo(53.0, 30.800001);
((GeneralPath)shape).lineTo(41.2, 30.500002);
((GeneralPath)shape).lineTo(39.9, 29.400002);
((GeneralPath)shape).lineTo(40.100002, 27.400002);
((GeneralPath)shape).lineTo(43.4, 25.7);
((GeneralPath)shape).lineTo(43.800003, 22.0);
((GeneralPath)shape).lineTo(41.500004, 19.9);
((GeneralPath)shape).lineTo(30.6, 19.9);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(36, 127, 0, 255);
stroke = new BasicStroke(2.0f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.6, 19.9);
((GeneralPath)shape).lineTo(28.300001, 21.699999);
((GeneralPath)shape).lineTo(28.500002, 25.3);
((GeneralPath)shape).lineTo(31.200003, 27.699999);
((GeneralPath)shape).lineTo(31.200003, 29.599998);
((GeneralPath)shape).lineTo(30.600002, 30.399998);
((GeneralPath)shape).lineTo(22.600002, 30.699997);
((GeneralPath)shape).lineTo(20.800003, 32.6);
((GeneralPath)shape).lineTo(20.800003, 40.199997);
((GeneralPath)shape).lineTo(20.100002, 41.899998);
((GeneralPath)shape).lineTo(18.100002, 41.899998);
((GeneralPath)shape).lineTo(16.600002, 40.699997);
((GeneralPath)shape).lineTo(16.200003, 38.299995);
((GeneralPath)shape).lineTo(11.9000025, 38.199997);
((GeneralPath)shape).lineTo(9.800003, 39.699997);
((GeneralPath)shape).lineTo(9.800003, 50.899998);
((GeneralPath)shape).lineTo(11.200003, 53.399998);
((GeneralPath)shape).lineTo(15.700003, 53.399998);
((GeneralPath)shape).lineTo(17.700003, 51.1);
((GeneralPath)shape).lineTo(18.500002, 48.699997);
((GeneralPath)shape).lineTo(20.200003, 48.6);
((GeneralPath)shape).lineTo(20.900003, 50.3);
((GeneralPath)shape).lineTo(20.900003, 62.3);
((GeneralPath)shape).lineTo(22.700003, 64.4);
((GeneralPath)shape).lineTo(29.500004, 64.4);
((GeneralPath)shape).lineTo(30.800003, 62.300003);
((GeneralPath)shape).lineTo(30.000004, 60.9);
((GeneralPath)shape).lineTo(28.600004, 60.100002);
((GeneralPath)shape).lineTo(28.600004, 57.300003);
((GeneralPath)shape).lineTo(30.800005, 55.4);
((GeneralPath)shape).lineTo(41.500004, 55.4);
((GeneralPath)shape).lineTo(43.800003, 57.300003);
((GeneralPath)shape).lineTo(43.800003, 59.9);
((GeneralPath)shape).lineTo(42.5, 61.0);
((GeneralPath)shape).lineTo(41.5, 62.3);
((GeneralPath)shape).lineTo(42.7, 64.4);
((GeneralPath)shape).lineTo(52.9, 64.3);
((GeneralPath)shape).lineTo(54.9, 62.300003);
((GeneralPath)shape).lineTo(54.9, 52.700005);
((GeneralPath)shape).lineTo(54.4, 51.000004);
((GeneralPath)shape).lineTo(52.9, 50.900005);
((GeneralPath)shape).lineTo(51.5, 52.000004);
((GeneralPath)shape).lineTo(50.5, 53.200005);
((GeneralPath)shape).lineTo(48.0, 53.100006);
((GeneralPath)shape).lineTo(45.9, 51.300007);
((GeneralPath)shape).lineTo(45.9, 40.9);
((GeneralPath)shape).lineTo(47.600002, 38.100002);
((GeneralPath)shape).lineTo(52.0, 38.100002);
((GeneralPath)shape).lineTo(53.0, 39.9);
((GeneralPath)shape).lineTo(55.0, 39.600002);
((GeneralPath)shape).lineTo(55.0, 32.9);
((GeneralPath)shape).lineTo(53.0, 30.800001);
((GeneralPath)shape).lineTo(41.2, 30.500002);
((GeneralPath)shape).lineTo(39.9, 29.400002);
((GeneralPath)shape).lineTo(40.100002, 27.400002);
((GeneralPath)shape).lineTo(43.4, 25.7);
((GeneralPath)shape).lineTo(43.800003, 22.0);
((GeneralPath)shape).lineTo(41.500004, 19.9);
((GeneralPath)shape).lineTo(30.6, 19.9);
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
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.180999755859375, 74.24199676513672), new Point2D.Double(58.60599899291992, 87.66699981689453), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
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
        return 0.1340000033378601;
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
		return 0.7359999418258667;
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
	private ext_xpi() {
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
       ext_xpi base = new ext_xpi();
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
       ext_xpi base = new ext_xpi();
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
        return ext_xpi::new;
    }
}

