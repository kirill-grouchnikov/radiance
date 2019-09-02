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
public class ext_conf implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(42.0, 38.4);
((GeneralPath)shape).curveTo(42.0, 35.9, 40.5, 33.9, 38.3, 33.0);
((GeneralPath)shape).lineTo(38.3, 25.7);
((GeneralPath)shape).curveTo(38.3, 24.5, 37.399998, 23.6, 36.2, 23.6);
((GeneralPath)shape).curveTo(35.000004, 23.6, 34.100002, 24.5, 34.100002, 25.7);
((GeneralPath)shape).lineTo(34.100002, 33.0);
((GeneralPath)shape).curveTo(31.900002, 33.8, 30.400002, 35.9, 30.400002, 38.4);
((GeneralPath)shape).curveTo(30.400002, 40.9, 31.900002, 43.0, 34.100002, 43.800003);
((GeneralPath)shape).curveTo(34.100002, 43.9, 34.000004, 44.100002, 34.000004, 44.200005);
((GeneralPath)shape).lineTo(34.000004, 62.600006);
((GeneralPath)shape).curveTo(34.000004, 63.800007, 34.900005, 64.700005, 36.100002, 64.700005);
((GeneralPath)shape).curveTo(37.3, 64.700005, 38.2, 63.800003, 38.2, 62.600006);
((GeneralPath)shape).lineTo(38.2, 44.2);
((GeneralPath)shape).curveTo(38.2, 44.0, 38.2, 43.9, 38.100002, 43.8);
((GeneralPath)shape).curveTo(40.500004, 43.0, 42.000004, 40.899998, 42.000004, 38.399998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.2, 40.0);
((GeneralPath)shape).curveTo(35.3, 40.0, 34.600002, 39.3, 34.600002, 38.4);
((GeneralPath)shape).curveTo(34.600002, 37.500004, 35.300003, 36.800003, 36.2, 36.800003);
((GeneralPath)shape).curveTo(37.1, 36.800003, 37.8, 37.500004, 37.8, 38.4);
((GeneralPath)shape).curveTo(37.8, 39.3, 37.1, 40.0, 36.2, 40.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 64.71700286865234), new Point2D.Double(36.20000076293945, 23.716999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 65.21700286865234), new Point2D.Double(36.20000076293945, 23.216999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(42.0, 38.4);
((GeneralPath)shape).curveTo(42.0, 35.9, 40.5, 33.9, 38.3, 33.0);
((GeneralPath)shape).lineTo(38.3, 25.7);
((GeneralPath)shape).curveTo(38.3, 24.5, 37.399998, 23.6, 36.2, 23.6);
((GeneralPath)shape).curveTo(35.000004, 23.6, 34.100002, 24.5, 34.100002, 25.7);
((GeneralPath)shape).lineTo(34.100002, 33.0);
((GeneralPath)shape).curveTo(31.900002, 33.8, 30.400002, 35.9, 30.400002, 38.4);
((GeneralPath)shape).curveTo(30.400002, 40.9, 31.900002, 43.0, 34.100002, 43.800003);
((GeneralPath)shape).curveTo(34.100002, 43.9, 34.000004, 44.100002, 34.000004, 44.200005);
((GeneralPath)shape).lineTo(34.000004, 62.600006);
((GeneralPath)shape).curveTo(34.000004, 63.800007, 34.900005, 64.700005, 36.100002, 64.700005);
((GeneralPath)shape).curveTo(37.3, 64.700005, 38.2, 63.800003, 38.2, 62.600006);
((GeneralPath)shape).lineTo(38.2, 44.2);
((GeneralPath)shape).curveTo(38.2, 44.0, 38.2, 43.9, 38.100002, 43.8);
((GeneralPath)shape).curveTo(40.500004, 43.0, 42.000004, 40.899998, 42.000004, 38.399998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.2, 40.0);
((GeneralPath)shape).curveTo(35.3, 40.0, 34.600002, 39.3, 34.600002, 38.4);
((GeneralPath)shape).curveTo(34.600002, 37.500004, 35.300003, 36.800003, 36.2, 36.800003);
((GeneralPath)shape).curveTo(37.1, 36.800003, 37.8, 37.500004, 37.8, 38.4);
((GeneralPath)shape).curveTo(37.8, 39.3, 37.1, 40.0, 36.2, 40.0);
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
((GeneralPath)shape).moveTo(53.0, 25.8);
((GeneralPath)shape).curveTo(53.0, 24.599998, 52.1, 23.699999, 50.9, 23.699999);
((GeneralPath)shape).curveTo(49.7, 23.699999, 48.800003, 24.599998, 48.800003, 25.8);
((GeneralPath)shape).lineTo(48.800003, 43.0);
((GeneralPath)shape).curveTo(46.600002, 43.8, 45.100002, 45.9, 45.100002, 48.4);
((GeneralPath)shape).curveTo(45.100002, 50.9, 46.600002, 53.0, 48.800003, 53.800003);
((GeneralPath)shape).curveTo(48.800003, 53.9, 48.700005, 54.100002, 48.700005, 54.200005);
((GeneralPath)shape).lineTo(48.700005, 62.600006);
((GeneralPath)shape).curveTo(48.700005, 63.800007, 49.600006, 64.700005, 50.800003, 64.700005);
((GeneralPath)shape).curveTo(52.000004, 64.700005, 52.9, 63.800003, 52.9, 62.600006);
((GeneralPath)shape).lineTo(52.9, 54.200005);
((GeneralPath)shape).curveTo(52.9, 54.000004, 52.9, 53.900005, 52.800003, 53.800003);
((GeneralPath)shape).curveTo(55.000004, 53.000004, 56.500004, 50.9, 56.500004, 48.4);
((GeneralPath)shape).curveTo(56.500004, 45.9, 55.000004, 43.9, 52.800003, 43.0);
((GeneralPath)shape).lineTo(52.800003, 25.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.9, 50.0);
((GeneralPath)shape).curveTo(50.0, 50.0, 49.300003, 49.3, 49.300003, 48.4);
((GeneralPath)shape).curveTo(49.300003, 47.5, 50.000004, 46.800003, 50.9, 46.800003);
((GeneralPath)shape).curveTo(51.8, 46.800003, 52.5, 47.500004, 52.5, 48.4);
((GeneralPath)shape).curveTo(52.5, 49.300003, 51.8, 50.0, 50.9, 50.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 64.71700286865234), new Point2D.Double(50.917999267578125, 23.716999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 65.21700286865234), new Point2D.Double(50.917999267578125, 23.216999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(53.0, 25.8);
((GeneralPath)shape).curveTo(53.0, 24.599998, 52.1, 23.699999, 50.9, 23.699999);
((GeneralPath)shape).curveTo(49.7, 23.699999, 48.800003, 24.599998, 48.800003, 25.8);
((GeneralPath)shape).lineTo(48.800003, 43.0);
((GeneralPath)shape).curveTo(46.600002, 43.8, 45.100002, 45.9, 45.100002, 48.4);
((GeneralPath)shape).curveTo(45.100002, 50.9, 46.600002, 53.0, 48.800003, 53.800003);
((GeneralPath)shape).curveTo(48.800003, 53.9, 48.700005, 54.100002, 48.700005, 54.200005);
((GeneralPath)shape).lineTo(48.700005, 62.600006);
((GeneralPath)shape).curveTo(48.700005, 63.800007, 49.600006, 64.700005, 50.800003, 64.700005);
((GeneralPath)shape).curveTo(52.000004, 64.700005, 52.9, 63.800003, 52.9, 62.600006);
((GeneralPath)shape).lineTo(52.9, 54.200005);
((GeneralPath)shape).curveTo(52.9, 54.000004, 52.9, 53.900005, 52.800003, 53.800003);
((GeneralPath)shape).curveTo(55.000004, 53.000004, 56.500004, 50.9, 56.500004, 48.4);
((GeneralPath)shape).curveTo(56.500004, 45.9, 55.000004, 43.9, 52.800003, 43.0);
((GeneralPath)shape).lineTo(52.800003, 25.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.9, 50.0);
((GeneralPath)shape).curveTo(50.0, 50.0, 49.300003, 49.3, 49.300003, 48.4);
((GeneralPath)shape).curveTo(49.300003, 47.5, 50.000004, 46.800003, 50.9, 46.800003);
((GeneralPath)shape).curveTo(51.8, 46.800003, 52.5, 47.500004, 52.5, 48.4);
((GeneralPath)shape).curveTo(52.5, 49.300003, 51.8, 50.0, 50.9, 50.0);
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
((GeneralPath)shape).moveTo(19.4, 62.6);
((GeneralPath)shape).curveTo(19.4, 63.8, 20.3, 64.7, 21.5, 64.7);
((GeneralPath)shape).curveTo(22.7, 64.7, 23.6, 63.799995, 23.6, 62.6);
((GeneralPath)shape).lineTo(23.6, 54.199997);
((GeneralPath)shape).curveTo(23.6, 53.999996, 23.6, 53.899998, 23.5, 53.799995);
((GeneralPath)shape).curveTo(25.7, 52.999996, 27.2, 50.899994, 27.2, 48.399994);
((GeneralPath)shape).curveTo(27.2, 45.899994, 25.7, 43.899994, 23.5, 42.999992);
((GeneralPath)shape).lineTo(23.5, 25.8);
((GeneralPath)shape).curveTo(23.5, 24.599998, 22.6, 23.699999, 21.4, 23.699999);
((GeneralPath)shape).curveTo(20.199999, 23.699999, 19.3, 24.599998, 19.3, 25.8);
((GeneralPath)shape).lineTo(19.3, 43.0);
((GeneralPath)shape).curveTo(17.099998, 43.8, 15.599999, 45.9, 15.599999, 48.4);
((GeneralPath)shape).curveTo(15.599999, 50.9, 17.099998, 53.0, 19.3, 53.800003);
((GeneralPath)shape).curveTo(19.3, 53.9, 19.199999, 54.100002, 19.199999, 54.200005);
((GeneralPath)shape).lineTo(19.199999, 62.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.5, 46.8);
((GeneralPath)shape).curveTo(22.4, 46.8, 23.1, 47.5, 23.1, 48.399998);
((GeneralPath)shape).curveTo(23.1, 49.3, 22.4, 49.999996, 21.5, 49.999996);
((GeneralPath)shape).curveTo(20.6, 49.999996, 19.9, 49.299995, 19.9, 48.399998);
((GeneralPath)shape).curveTo(19.9, 47.499996, 20.6, 46.8, 21.5, 46.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 64.71700286865234), new Point2D.Double(21.48200035095215, 23.716999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 65.21700286865234), new Point2D.Double(21.48200035095215, 23.216999053955078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.4, 62.6);
((GeneralPath)shape).curveTo(19.4, 63.8, 20.3, 64.7, 21.5, 64.7);
((GeneralPath)shape).curveTo(22.7, 64.7, 23.6, 63.799995, 23.6, 62.6);
((GeneralPath)shape).lineTo(23.6, 54.199997);
((GeneralPath)shape).curveTo(23.6, 53.999996, 23.6, 53.899998, 23.5, 53.799995);
((GeneralPath)shape).curveTo(25.7, 52.999996, 27.2, 50.899994, 27.2, 48.399994);
((GeneralPath)shape).curveTo(27.2, 45.899994, 25.7, 43.899994, 23.5, 42.999992);
((GeneralPath)shape).lineTo(23.5, 25.8);
((GeneralPath)shape).curveTo(23.5, 24.599998, 22.6, 23.699999, 21.4, 23.699999);
((GeneralPath)shape).curveTo(20.199999, 23.699999, 19.3, 24.599998, 19.3, 25.8);
((GeneralPath)shape).lineTo(19.3, 43.0);
((GeneralPath)shape).curveTo(17.099998, 43.8, 15.599999, 45.9, 15.599999, 48.4);
((GeneralPath)shape).curveTo(15.599999, 50.9, 17.099998, 53.0, 19.3, 53.800003);
((GeneralPath)shape).curveTo(19.3, 53.9, 19.199999, 54.100002, 19.199999, 54.200005);
((GeneralPath)shape).lineTo(19.199999, 62.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.5, 46.8);
((GeneralPath)shape).curveTo(22.4, 46.8, 23.1, 47.5, 23.1, 48.399998);
((GeneralPath)shape).curveTo(23.1, 49.3, 22.4, 49.999996, 21.5, 49.999996);
((GeneralPath)shape).curveTo(20.6, 49.999996, 19.9, 49.299995, 19.9, 48.399998);
((GeneralPath)shape).curveTo(19.9, 47.499996, 20.6, 46.8, 21.5, 46.8);
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.5, 86.1);
((GeneralPath)shape).lineTo(19.6, 87.1);
((GeneralPath)shape).curveTo(19.1, 88.799995, 18.300001, 90.1, 17.2, 90.9);
((GeneralPath)shape).curveTo(16.1, 91.700005, 14.700001, 92.200005, 13.000001, 92.200005);
((GeneralPath)shape).curveTo(10.900002, 92.200005, 9.200001, 91.50001, 7.800001, 90.100006);
((GeneralPath)shape).curveTo(6.500001, 88.700005, 5.800001, 86.700005, 5.800001, 84.200005);
((GeneralPath)shape).curveTo(5.800001, 81.600006, 6.500001, 79.50001, 7.800001, 78.100006);
((GeneralPath)shape).curveTo(9.200001, 76.700005, 10.900002, 75.90001, 13.100001, 75.90001);
((GeneralPath)shape).curveTo(15.000001, 75.90001, 16.600002, 76.50001, 17.800001, 77.600006);
((GeneralPath)shape).curveTo(18.500002, 78.3, 19.1, 79.200005, 19.400002, 80.50001);
((GeneralPath)shape).lineTo(16.300001, 81.30001);
((GeneralPath)shape).curveTo(16.1, 80.50001, 15.700001, 79.80001, 15.100001, 79.40001);
((GeneralPath)shape).curveTo(14.500002, 79.00001, 13.800001, 78.70001, 12.900002, 78.70001);
((GeneralPath)shape).curveTo(11.700002, 78.70001, 10.800001, 79.10001, 10.100001, 80.000015);
((GeneralPath)shape).curveTo(9.400002, 80.80002, 9.000001, 82.20001, 9.000001, 84.10001);
((GeneralPath)shape).curveTo(9.000001, 86.10001, 9.400001, 87.500015, 10.100001, 88.40002);
((GeneralPath)shape).curveTo(10.800001, 89.20002, 11.700002, 89.70002, 12.900002, 89.70002);
((GeneralPath)shape).curveTo(13.700002, 89.70002, 14.500002, 89.40002, 15.100001, 88.90002);
((GeneralPath)shape).curveTo(15.800001, 88.10001, 16.2, 87.20002, 16.500002, 86.10001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.7, 84.1);
((GeneralPath)shape).curveTo(21.7, 82.5, 21.900002, 81.1, 22.400002, 80.1);
((GeneralPath)shape).curveTo(22.800001, 79.299995, 23.2, 78.6, 23.900002, 77.9);
((GeneralPath)shape).curveTo(24.500002, 77.3, 25.2, 76.8, 25.900002, 76.5);
((GeneralPath)shape).curveTo(26.900002, 76.1, 28.000002, 75.9, 29.300001, 75.9);
((GeneralPath)shape).curveTo(31.6, 75.9, 33.5, 76.6, 34.9, 78.1);
((GeneralPath)shape).curveTo(36.300003, 79.5, 37.0, 81.5, 37.0, 84.1);
((GeneralPath)shape).curveTo(37.0, 86.6, 36.3, 88.6, 34.9, 90.1);
((GeneralPath)shape).curveTo(33.5, 91.5, 31.7, 92.299995, 29.400002, 92.299995);
((GeneralPath)shape).curveTo(27.100002, 92.299995, 25.2, 91.6, 23.800001, 90.2);
((GeneralPath)shape).curveTo(22.400002, 88.6, 21.7, 86.6, 21.7, 84.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(25.0, 84.0);
((GeneralPath)shape).curveTo(25.0, 85.8, 25.4, 87.1, 26.2, 88.1);
((GeneralPath)shape).curveTo(27.0, 89.0, 28.1, 89.5, 29.300001, 89.5);
((GeneralPath)shape).curveTo(30.500002, 89.5, 31.6, 89.0, 32.4, 88.1);
((GeneralPath)shape).curveTo(33.2, 87.2, 33.600002, 85.799995, 33.600002, 84.0);
((GeneralPath)shape).curveTo(33.600002, 82.2, 33.2, 80.8, 32.4, 80.0);
((GeneralPath)shape).curveTo(31.600002, 79.1, 30.600002, 78.7, 29.2, 78.7);
((GeneralPath)shape).curveTo(27.8, 78.7, 27.0, 79.0, 26.2, 79.899994);
((GeneralPath)shape).curveTo(25.400002, 80.799995, 25.0, 82.2, 25.0, 83.99999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(39.5, 91.9);
((GeneralPath)shape).lineTo(39.5, 76.1);
((GeneralPath)shape).lineTo(42.6, 76.1);
((GeneralPath)shape).lineTo(49.0, 86.7);
((GeneralPath)shape).lineTo(49.0, 76.1);
((GeneralPath)shape).lineTo(52.0, 76.1);
((GeneralPath)shape).lineTo(52.0, 91.799995);
((GeneralPath)shape).lineTo(48.8, 91.799995);
((GeneralPath)shape).lineTo(42.5, 81.49999);
((GeneralPath)shape).lineTo(42.5, 91.799995);
((GeneralPath)shape).lineTo(39.5, 91.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(55.3, 91.9);
((GeneralPath)shape).lineTo(55.3, 76.1);
((GeneralPath)shape).lineTo(66.1, 76.1);
((GeneralPath)shape).lineTo(66.1, 78.799995);
((GeneralPath)shape).lineTo(58.5, 78.799995);
((GeneralPath)shape).lineTo(58.5, 82.49999);
((GeneralPath)shape).lineTo(65.1, 82.49999);
((GeneralPath)shape).lineTo(65.1, 85.19999);
((GeneralPath)shape).lineTo(58.5, 85.19999);
((GeneralPath)shape).lineTo(58.5, 91.89999);
((GeneralPath)shape).lineTo(55.3, 91.89999);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
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
	private ext_conf() {
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
       ext_conf base = new ext_conf();
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
       ext_conf base = new ext_conf();
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
        return ext_conf::new;
    }
}

