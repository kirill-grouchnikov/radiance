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
public class ext_vcs implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 98.899994);
((GeneralPath)shape).lineTo(-0.19999695, 98.899994);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.75, 3.0959999561309814), new Point2D.Double(35.75, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 98.899994);
((GeneralPath)shape).lineTo(-0.19999695, 98.899994);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 98.899994);
((GeneralPath)shape).lineTo(-0.19999695, 98.899994);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
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
((GeneralPath)shape).moveTo(0.7, 63.6);
((GeneralPath)shape).lineTo(70.899994, 63.6);
((GeneralPath)shape).lineTo(70.899994, 97.899994);
((GeneralPath)shape).lineTo(0.7, 97.899994);
((GeneralPath)shape).lineTo(0.7, 63.6);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.849998474121094, 4.085000038146973), new Point2D.Double(35.849998474121094, 38.441001892089844), new float[] {0.0f,1.0f}, new Color[] {new Color(239, 65, 54, 255),new Color(190, 30, 45, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.6, 90.1);
((GeneralPath)shape).lineTo(7.4, 70.3);
((GeneralPath)shape).lineTo(11.8, 70.3);
((GeneralPath)shape).lineTo(16.9, 85.0);
((GeneralPath)shape).lineTo(21.8, 70.3);
((GeneralPath)shape).lineTo(26.099998, 70.3);
((GeneralPath)shape).lineTo(18.899998, 90.100006);
((GeneralPath)shape).lineTo(14.5999975, 90.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.9, 82.799995);
((GeneralPath)shape).lineTo(44.800003, 83.99999);
((GeneralPath)shape).curveTo(44.200005, 86.19999, 43.200005, 87.799995, 41.800003, 88.799995);
((GeneralPath)shape).curveTo(40.4, 89.899994, 38.600002, 90.399994, 36.500004, 90.399994);
((GeneralPath)shape).curveTo(33.800003, 90.399994, 31.700005, 89.49999, 29.900003, 87.7);
((GeneralPath)shape).curveTo(28.200003, 85.899994, 27.300003, 83.399994, 27.300003, 80.299995);
((GeneralPath)shape).curveTo(27.300003, 76.99999, 28.200003, 74.399994, 29.900003, 72.6);
((GeneralPath)shape).curveTo(31.600004, 70.8, 33.9, 69.9, 36.700005, 69.9);
((GeneralPath)shape).curveTo(39.200005, 69.9, 41.100006, 70.6, 42.700005, 72.0);
((GeneralPath)shape).curveTo(43.600006, 72.8, 44.300003, 74.1, 44.800003, 75.7);
((GeneralPath)shape).lineTo(40.800003, 76.6);
((GeneralPath)shape).curveTo(40.600002, 75.6, 40.100002, 74.799995, 39.300003, 74.2);
((GeneralPath)shape).curveTo(38.500004, 73.6, 37.600002, 73.299995, 36.600002, 73.299995);
((GeneralPath)shape).curveTo(35.100002, 73.299995, 33.9, 73.799995, 33.000004, 74.899994);
((GeneralPath)shape).curveTo(32.000004, 75.99999, 31.600004, 77.7, 31.600004, 79.99999);
((GeneralPath)shape).curveTo(31.600004, 82.49999, 32.100006, 84.299995, 33.000004, 85.399994);
((GeneralPath)shape).curveTo(33.900005, 86.49999, 35.100002, 86.99999, 36.600002, 86.99999);
((GeneralPath)shape).curveTo(37.7, 86.99999, 38.600002, 86.69999, 39.4, 85.99999);
((GeneralPath)shape).curveTo(40.0, 85.299995, 40.600002, 84.19999, 40.9, 82.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.300003, 83.6);
((GeneralPath)shape).lineTo(51.200005, 83.2);
((GeneralPath)shape).curveTo(51.400005, 84.5, 51.900005, 85.5, 52.600006, 86.1);
((GeneralPath)shape).curveTo(53.300007, 86.7, 54.300007, 87.0, 55.500008, 87.0);
((GeneralPath)shape).curveTo(56.800007, 87.0, 57.800007, 86.7, 58.40001, 86.2);
((GeneralPath)shape).curveTo(59.10001, 85.7, 59.40001, 85.0, 59.40001, 84.299995);
((GeneralPath)shape).curveTo(59.40001, 83.799995, 59.30001, 83.399994, 59.000008, 83.1);
((GeneralPath)shape).curveTo(58.70001, 82.799995, 58.20001, 82.5, 57.500008, 82.2);
((GeneralPath)shape).curveTo(57.000008, 82.0, 55.90001, 81.7, 54.300007, 81.299995);
((GeneralPath)shape).curveTo(52.100006, 80.799995, 50.600006, 80.1, 49.70001, 79.299995);
((GeneralPath)shape).curveTo(48.500008, 78.2, 47.90001, 76.899994, 47.90001, 75.299995);
((GeneralPath)shape).curveTo(47.90001, 74.299995, 48.20001, 73.299995, 48.80001, 72.49999);
((GeneralPath)shape).curveTo(49.40001, 71.59999, 50.200012, 70.99999, 51.30001, 70.49999);
((GeneralPath)shape).curveTo(52.40001, 69.99999, 53.700012, 69.799995, 55.200012, 69.799995);
((GeneralPath)shape).curveTo(57.700012, 69.799995, 59.600014, 70.299995, 60.900013, 71.399994);
((GeneralPath)shape).curveTo(62.200012, 72.49999, 62.800014, 73.899994, 62.900013, 75.799995);
((GeneralPath)shape).lineTo(58.900013, 75.99999);
((GeneralPath)shape).curveTo(58.700012, 74.99999, 58.400013, 74.19999, 57.800014, 73.799995);
((GeneralPath)shape).curveTo(57.200016, 73.399994, 56.400013, 73.1, 55.200016, 73.1);
((GeneralPath)shape).curveTo(54.000015, 73.1, 53.100018, 73.299995, 52.400017, 73.799995);
((GeneralPath)shape).curveTo(52.000015, 74.1, 51.80002, 74.49999, 51.80002, 74.99999);
((GeneralPath)shape).curveTo(51.80002, 75.49999, 52.00002, 75.899994, 52.400017, 76.19999);
((GeneralPath)shape).curveTo(52.900017, 76.59999, 54.200016, 77.09999, 56.100018, 77.49999);
((GeneralPath)shape).curveTo(58.00002, 77.899994, 59.50002, 78.399994, 60.50002, 78.899994);
((GeneralPath)shape).curveTo(61.40002, 79.399994, 62.20002, 80.09999, 62.70002, 80.899994);
((GeneralPath)shape).curveTo(63.20002, 81.799995, 63.50002, 82.799995, 63.50002, 84.09999);
((GeneralPath)shape).curveTo(63.50002, 85.19999, 63.20002, 86.29999, 62.50002, 87.29999);
((GeneralPath)shape).curveTo(61.90002, 88.29999, 61.00002, 88.999985, 59.80002, 89.499985);
((GeneralPath)shape).curveTo(58.600018, 89.999985, 57.20002, 90.19998, 55.400017, 90.19998);
((GeneralPath)shape).curveTo(52.900017, 90.19998, 50.900017, 89.59998, 49.600018, 88.499985);
((GeneralPath)shape).curveTo(48.400017, 87.499985, 47.600018, 85.79999, 47.30002, 83.59998);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.2, 54.4);
((GeneralPath)shape).lineTo(18.2, 48.2);
((GeneralPath)shape).lineTo(25.400002, 48.2);
((GeneralPath)shape).lineTo(25.400002, 54.4);
((GeneralPath)shape).lineTo(18.2, 54.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 54.4);
((GeneralPath)shape).lineTo(27.0, 48.2);
((GeneralPath)shape).lineTo(35.0, 48.2);
((GeneralPath)shape).lineTo(35.0, 54.4);
((GeneralPath)shape).lineTo(27.0, 54.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.2, 46.800003);
((GeneralPath)shape).lineTo(18.2, 39.9);
((GeneralPath)shape).lineTo(25.400002, 39.9);
((GeneralPath)shape).lineTo(25.400002, 46.800003);
((GeneralPath)shape).lineTo(18.2, 46.800003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 46.800003);
((GeneralPath)shape).lineTo(27.0, 39.9);
((GeneralPath)shape).lineTo(35.0, 39.9);
((GeneralPath)shape).lineTo(35.0, 46.800003);
((GeneralPath)shape).lineTo(27.0, 46.800003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.2, 38.500004);
((GeneralPath)shape).lineTo(18.2, 32.300003);
((GeneralPath)shape).lineTo(25.400002, 32.300003);
((GeneralPath)shape).lineTo(25.400002, 38.500004);
((GeneralPath)shape).lineTo(18.2, 38.500004);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.6, 54.4);
((GeneralPath)shape).lineTo(36.6, 48.2);
((GeneralPath)shape).lineTo(44.6, 48.2);
((GeneralPath)shape).lineTo(44.6, 54.4);
((GeneralPath)shape).lineTo(36.6, 54.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 38.5);
((GeneralPath)shape).lineTo(27.0, 32.3);
((GeneralPath)shape).lineTo(35.0, 32.3);
((GeneralPath)shape).lineTo(35.0, 38.5);
((GeneralPath)shape).lineTo(27.0, 38.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.2, 54.4);
((GeneralPath)shape).lineTo(46.2, 48.2);
((GeneralPath)shape).lineTo(53.4, 48.2);
((GeneralPath)shape).lineTo(53.4, 54.4);
((GeneralPath)shape).lineTo(46.2, 54.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.6, 46.800003);
((GeneralPath)shape).lineTo(36.6, 39.9);
((GeneralPath)shape).lineTo(44.6, 39.9);
((GeneralPath)shape).lineTo(44.6, 46.800003);
((GeneralPath)shape).lineTo(36.6, 46.800003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.8, 28.100002);
((GeneralPath)shape).curveTo(27.8, 28.500002, 27.4, 28.800003, 27.0, 28.800003);
((GeneralPath)shape).lineTo(25.4, 28.800003);
((GeneralPath)shape).curveTo(25.0, 28.800003, 24.6, 28.500004, 24.6, 28.100002);
((GeneralPath)shape).lineTo(24.6, 21.900002);
((GeneralPath)shape).curveTo(24.6, 21.500002, 25.0, 21.2, 25.4, 21.2);
((GeneralPath)shape).lineTo(27.0, 21.2);
((GeneralPath)shape).curveTo(27.4, 21.2, 27.8, 21.5, 27.8, 21.900002);
((GeneralPath)shape).lineTo(27.8, 28.100002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.199997, 46.800003);
((GeneralPath)shape).lineTo(46.199997, 39.9);
((GeneralPath)shape).lineTo(53.399998, 39.9);
((GeneralPath)shape).lineTo(53.399998, 46.800003);
((GeneralPath)shape).lineTo(46.199997, 46.800003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.6, 38.500004);
((GeneralPath)shape).lineTo(36.6, 32.300003);
((GeneralPath)shape).lineTo(44.6, 32.300003);
((GeneralPath)shape).lineTo(44.6, 38.500004);
((GeneralPath)shape).lineTo(36.6, 38.500004);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.199997, 38.500004);
((GeneralPath)shape).lineTo(46.199997, 32.300003);
((GeneralPath)shape).lineTo(53.399998, 32.300003);
((GeneralPath)shape).lineTo(53.399998, 38.500004);
((GeneralPath)shape).lineTo(46.199997, 38.500004);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.999996, 28.100004);
((GeneralPath)shape).curveTo(46.999996, 28.500004, 46.599995, 28.800005, 46.199997, 28.800005);
((GeneralPath)shape).lineTo(44.6, 28.800005);
((GeneralPath)shape).curveTo(44.199997, 28.800005, 43.8, 28.500006, 43.8, 28.100004);
((GeneralPath)shape).lineTo(43.8, 21.900005);
((GeneralPath)shape).curveTo(43.8, 21.500006, 44.2, 21.200005, 44.6, 21.200005);
((GeneralPath)shape).lineTo(46.199997, 21.200005);
((GeneralPath)shape).curveTo(46.6, 21.200005, 46.999996, 21.500004, 46.999996, 21.900005);
((GeneralPath)shape).lineTo(46.999996, 28.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(56.6, 26.700005);
((GeneralPath)shape).curveTo(56.6, 25.200005, 55.199997, 23.900005, 53.399998, 23.900005);
((GeneralPath)shape).lineTo(50.199997, 23.900005);
((GeneralPath)shape).lineTo(50.199997, 21.800005);
((GeneralPath)shape).curveTo(50.199997, 19.900005, 48.399998, 18.300005, 46.199997, 18.300005);
((GeneralPath)shape).lineTo(44.6, 18.300005);
((GeneralPath)shape).curveTo(42.399998, 18.300005, 40.6, 19.900005, 40.6, 21.800005);
((GeneralPath)shape).lineTo(40.6, 23.900005);
((GeneralPath)shape).lineTo(31.0, 23.900005);
((GeneralPath)shape).lineTo(31.0, 21.800005);
((GeneralPath)shape).curveTo(31.0, 19.900005, 29.2, 18.300005, 27.0, 18.300005);
((GeneralPath)shape).lineTo(25.4, 18.300005);
((GeneralPath)shape).curveTo(23.199999, 18.300005, 21.4, 19.900005, 21.4, 21.800005);
((GeneralPath)shape).lineTo(21.4, 23.900005);
((GeneralPath)shape).lineTo(18.199999, 23.900005);
((GeneralPath)shape).curveTo(16.499998, 23.900005, 14.999999, 25.200005, 14.999999, 26.700005);
((GeneralPath)shape).lineTo(14.999999, 54.400005);
((GeneralPath)shape).curveTo(14.999999, 55.900005, 16.4, 57.200005, 18.199999, 57.200005);
((GeneralPath)shape).lineTo(53.299995, 57.200005);
((GeneralPath)shape).curveTo(54.999996, 57.200005, 56.499996, 55.900005, 56.499996, 54.400005);
((GeneralPath)shape).lineTo(56.499996, 26.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(1025.800048828125, 947.9450073242188), new Point2D.Double(1025.800048828125, 986.7000122070312), new float[] {0.0f,1.0f}, new Color[] {new Color(135, 156, 168, 255),new Color(77, 106, 120, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -990.0f, 1005.1110229492188f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(44.800003, 27.7);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(44.82500076293945, 74.2239990234375), new Point2D.Double(58.32500076293945, 87.7239990234375), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(44.800003, 27.7);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(44.800003, 27.7);
((GeneralPath)shape).lineTo(44.800003, 1.0);
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
		return 0.7400000095367432;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 0.9990000128746033;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_vcs() {
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
       ext_vcs base = new ext_vcs();
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
       ext_vcs base = new ext_vcs();
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
        return ext_vcs::new;
    }
}

