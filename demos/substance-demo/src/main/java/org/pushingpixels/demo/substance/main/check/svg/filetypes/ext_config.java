package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_config implements ResizableIcon {
    

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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(42.0, 46.4);
((GeneralPath)shape).curveTo(42.0, 43.9, 40.5, 41.9, 38.3, 41.0);
((GeneralPath)shape).lineTo(38.3, 33.7);
((GeneralPath)shape).curveTo(38.3, 32.5, 37.399998, 31.6, 36.2, 31.6);
((GeneralPath)shape).curveTo(35.000004, 31.6, 34.100002, 32.5, 34.100002, 33.7);
((GeneralPath)shape).lineTo(34.100002, 41.0);
((GeneralPath)shape).curveTo(31.900002, 41.8, 30.400002, 43.9, 30.400002, 46.4);
((GeneralPath)shape).curveTo(30.400002, 48.9, 31.900002, 51.0, 34.100002, 51.800003);
((GeneralPath)shape).curveTo(34.100002, 51.9, 34.000004, 52.100002, 34.000004, 52.200005);
((GeneralPath)shape).lineTo(34.000004, 70.600006);
((GeneralPath)shape).curveTo(34.000004, 71.8, 34.900005, 72.700005, 36.100002, 72.700005);
((GeneralPath)shape).curveTo(37.3, 72.700005, 38.2, 71.8, 38.2, 70.600006);
((GeneralPath)shape).lineTo(38.2, 52.2);
((GeneralPath)shape).curveTo(38.2, 52.0, 38.2, 51.9, 38.100002, 51.8);
((GeneralPath)shape).curveTo(40.500004, 51.0, 42.000004, 48.899998, 42.000004, 46.399998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.2, 48.0);
((GeneralPath)shape).curveTo(35.3, 48.0, 34.600002, 47.3, 34.600002, 46.4);
((GeneralPath)shape).curveTo(34.600002, 45.500004, 35.300003, 44.800003, 36.2, 44.800003);
((GeneralPath)shape).curveTo(37.1, 44.800003, 37.8, 45.500004, 37.8, 46.4);
((GeneralPath)shape).curveTo(37.8, 47.3, 37.1, 48.0, 36.2, 48.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 72.71700286865234), new Point2D.Double(36.20000076293945, 31.716999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 73.21700286865234), new Point2D.Double(36.20000076293945, 31.216999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(42.0, 46.4);
((GeneralPath)shape).curveTo(42.0, 43.9, 40.5, 41.9, 38.3, 41.0);
((GeneralPath)shape).lineTo(38.3, 33.7);
((GeneralPath)shape).curveTo(38.3, 32.5, 37.399998, 31.6, 36.2, 31.6);
((GeneralPath)shape).curveTo(35.000004, 31.6, 34.100002, 32.5, 34.100002, 33.7);
((GeneralPath)shape).lineTo(34.100002, 41.0);
((GeneralPath)shape).curveTo(31.900002, 41.8, 30.400002, 43.9, 30.400002, 46.4);
((GeneralPath)shape).curveTo(30.400002, 48.9, 31.900002, 51.0, 34.100002, 51.800003);
((GeneralPath)shape).curveTo(34.100002, 51.9, 34.000004, 52.100002, 34.000004, 52.200005);
((GeneralPath)shape).lineTo(34.000004, 70.600006);
((GeneralPath)shape).curveTo(34.000004, 71.8, 34.900005, 72.700005, 36.100002, 72.700005);
((GeneralPath)shape).curveTo(37.3, 72.700005, 38.2, 71.8, 38.2, 70.600006);
((GeneralPath)shape).lineTo(38.2, 52.2);
((GeneralPath)shape).curveTo(38.2, 52.0, 38.2, 51.9, 38.100002, 51.8);
((GeneralPath)shape).curveTo(40.500004, 51.0, 42.000004, 48.899998, 42.000004, 46.399998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.2, 48.0);
((GeneralPath)shape).curveTo(35.3, 48.0, 34.600002, 47.3, 34.600002, 46.4);
((GeneralPath)shape).curveTo(34.600002, 45.500004, 35.300003, 44.800003, 36.2, 44.800003);
((GeneralPath)shape).curveTo(37.1, 44.800003, 37.8, 45.500004, 37.8, 46.4);
((GeneralPath)shape).curveTo(37.8, 47.3, 37.1, 48.0, 36.2, 48.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(53.0, 33.8);
((GeneralPath)shape).curveTo(53.0, 32.6, 52.1, 31.699999, 50.9, 31.699999);
((GeneralPath)shape).curveTo(49.7, 31.699999, 48.800003, 32.6, 48.800003, 33.8);
((GeneralPath)shape).lineTo(48.800003, 51.0);
((GeneralPath)shape).curveTo(46.600002, 51.8, 45.100002, 53.9, 45.100002, 56.4);
((GeneralPath)shape).curveTo(45.100002, 58.9, 46.600002, 61.0, 48.800003, 61.800003);
((GeneralPath)shape).curveTo(48.800003, 61.9, 48.700005, 62.100002, 48.700005, 62.200005);
((GeneralPath)shape).lineTo(48.700005, 70.600006);
((GeneralPath)shape).curveTo(48.700005, 71.8, 49.600006, 72.700005, 50.800003, 72.700005);
((GeneralPath)shape).curveTo(52.000004, 72.700005, 52.9, 71.8, 52.9, 70.600006);
((GeneralPath)shape).lineTo(52.9, 62.200005);
((GeneralPath)shape).curveTo(52.9, 62.000004, 52.9, 61.900005, 52.800003, 61.800003);
((GeneralPath)shape).curveTo(55.000004, 61.000004, 56.500004, 58.9, 56.500004, 56.4);
((GeneralPath)shape).curveTo(56.500004, 53.9, 55.000004, 51.9, 52.800003, 51.0);
((GeneralPath)shape).lineTo(52.800003, 33.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.9, 58.0);
((GeneralPath)shape).curveTo(50.0, 58.0, 49.300003, 57.3, 49.300003, 56.4);
((GeneralPath)shape).curveTo(49.300003, 55.5, 50.000004, 54.800003, 50.9, 54.800003);
((GeneralPath)shape).curveTo(51.8, 54.800003, 52.5, 55.500004, 52.5, 56.4);
((GeneralPath)shape).curveTo(52.5, 57.300003, 51.8, 58.0, 50.9, 58.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 72.71700286865234), new Point2D.Double(50.917999267578125, 31.716999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 73.21700286865234), new Point2D.Double(50.917999267578125, 31.216999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(53.0, 33.8);
((GeneralPath)shape).curveTo(53.0, 32.6, 52.1, 31.699999, 50.9, 31.699999);
((GeneralPath)shape).curveTo(49.7, 31.699999, 48.800003, 32.6, 48.800003, 33.8);
((GeneralPath)shape).lineTo(48.800003, 51.0);
((GeneralPath)shape).curveTo(46.600002, 51.8, 45.100002, 53.9, 45.100002, 56.4);
((GeneralPath)shape).curveTo(45.100002, 58.9, 46.600002, 61.0, 48.800003, 61.800003);
((GeneralPath)shape).curveTo(48.800003, 61.9, 48.700005, 62.100002, 48.700005, 62.200005);
((GeneralPath)shape).lineTo(48.700005, 70.600006);
((GeneralPath)shape).curveTo(48.700005, 71.8, 49.600006, 72.700005, 50.800003, 72.700005);
((GeneralPath)shape).curveTo(52.000004, 72.700005, 52.9, 71.8, 52.9, 70.600006);
((GeneralPath)shape).lineTo(52.9, 62.200005);
((GeneralPath)shape).curveTo(52.9, 62.000004, 52.9, 61.900005, 52.800003, 61.800003);
((GeneralPath)shape).curveTo(55.000004, 61.000004, 56.500004, 58.9, 56.500004, 56.4);
((GeneralPath)shape).curveTo(56.500004, 53.9, 55.000004, 51.9, 52.800003, 51.0);
((GeneralPath)shape).lineTo(52.800003, 33.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.9, 58.0);
((GeneralPath)shape).curveTo(50.0, 58.0, 49.300003, 57.3, 49.300003, 56.4);
((GeneralPath)shape).curveTo(49.300003, 55.5, 50.000004, 54.800003, 50.9, 54.800003);
((GeneralPath)shape).curveTo(51.8, 54.800003, 52.5, 55.500004, 52.5, 56.4);
((GeneralPath)shape).curveTo(52.5, 57.300003, 51.8, 58.0, 50.9, 58.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.4, 70.6);
((GeneralPath)shape).curveTo(19.4, 71.799995, 20.3, 72.7, 21.5, 72.7);
((GeneralPath)shape).curveTo(22.7, 72.7, 23.6, 71.799995, 23.6, 70.6);
((GeneralPath)shape).lineTo(23.6, 62.199997);
((GeneralPath)shape).curveTo(23.6, 61.999996, 23.6, 61.899998, 23.5, 61.799995);
((GeneralPath)shape).curveTo(25.7, 60.999996, 27.2, 58.899994, 27.2, 56.399994);
((GeneralPath)shape).curveTo(27.2, 53.899994, 25.7, 51.899994, 23.5, 50.999992);
((GeneralPath)shape).lineTo(23.5, 33.8);
((GeneralPath)shape).curveTo(23.5, 32.6, 22.6, 31.699999, 21.4, 31.699999);
((GeneralPath)shape).curveTo(20.199999, 31.699999, 19.3, 32.6, 19.3, 33.8);
((GeneralPath)shape).lineTo(19.3, 51.0);
((GeneralPath)shape).curveTo(17.099998, 51.8, 15.599999, 53.9, 15.599999, 56.4);
((GeneralPath)shape).curveTo(15.599999, 58.9, 17.099998, 61.0, 19.3, 61.800003);
((GeneralPath)shape).curveTo(19.3, 61.9, 19.199999, 62.100002, 19.199999, 62.200005);
((GeneralPath)shape).lineTo(19.199999, 70.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.5, 54.8);
((GeneralPath)shape).curveTo(22.4, 54.8, 23.1, 55.5, 23.1, 56.399998);
((GeneralPath)shape).curveTo(23.1, 57.3, 22.4, 57.999996, 21.5, 57.999996);
((GeneralPath)shape).curveTo(20.6, 57.999996, 19.9, 57.299995, 19.9, 56.399998);
((GeneralPath)shape).curveTo(19.9, 55.499996, 20.6, 54.8, 21.5, 54.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 72.71700286865234), new Point2D.Double(21.48200035095215, 31.716999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 73.21700286865234), new Point2D.Double(21.48200035095215, 31.216999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.4, 70.6);
((GeneralPath)shape).curveTo(19.4, 71.799995, 20.3, 72.7, 21.5, 72.7);
((GeneralPath)shape).curveTo(22.7, 72.7, 23.6, 71.799995, 23.6, 70.6);
((GeneralPath)shape).lineTo(23.6, 62.199997);
((GeneralPath)shape).curveTo(23.6, 61.999996, 23.6, 61.899998, 23.5, 61.799995);
((GeneralPath)shape).curveTo(25.7, 60.999996, 27.2, 58.899994, 27.2, 56.399994);
((GeneralPath)shape).curveTo(27.2, 53.899994, 25.7, 51.899994, 23.5, 50.999992);
((GeneralPath)shape).lineTo(23.5, 33.8);
((GeneralPath)shape).curveTo(23.5, 32.6, 22.6, 31.699999, 21.4, 31.699999);
((GeneralPath)shape).curveTo(20.199999, 31.699999, 19.3, 32.6, 19.3, 33.8);
((GeneralPath)shape).lineTo(19.3, 51.0);
((GeneralPath)shape).curveTo(17.099998, 51.8, 15.599999, 53.9, 15.599999, 56.4);
((GeneralPath)shape).curveTo(15.599999, 58.9, 17.099998, 61.0, 19.3, 61.800003);
((GeneralPath)shape).curveTo(19.3, 61.9, 19.199999, 62.100002, 19.199999, 62.200005);
((GeneralPath)shape).lineTo(19.199999, 70.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.5, 54.8);
((GeneralPath)shape).curveTo(22.4, 54.8, 23.1, 55.5, 23.1, 56.399998);
((GeneralPath)shape).curveTo(23.1, 57.3, 22.4, 57.999996, 21.5, 57.999996);
((GeneralPath)shape).curveTo(20.6, 57.999996, 19.9, 57.299995, 19.9, 56.399998);
((GeneralPath)shape).curveTo(19.9, 55.499996, 20.6, 54.8, 21.5, 54.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_2);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
	private ext_config() {
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
       ext_config base = new ext_config();
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
       ext_config base = new ext_config();
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
        return ext_config::new;
    }
}

