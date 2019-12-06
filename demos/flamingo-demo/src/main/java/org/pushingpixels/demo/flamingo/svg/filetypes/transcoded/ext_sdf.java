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
public class ext_sdf implements ResizableIcon {
    

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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.953000068664551), new Point2D.Double(36.0, 100.94999694824219), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
((GeneralPath)shape).moveTo(9.6, 84.8);
((GeneralPath)shape).lineTo(13.400001, 84.4);
((GeneralPath)shape).curveTo(13.6, 85.700005, 14.1, 86.6, 14.8, 87.200005);
((GeneralPath)shape).curveTo(15.5, 87.8, 16.5, 88.100006, 17.7, 88.100006);
((GeneralPath)shape).curveTo(19.0, 88.100006, 19.900002, 87.8, 20.6, 87.3);
((GeneralPath)shape).curveTo(21.2, 86.8, 21.6, 86.100006, 21.6, 85.4);
((GeneralPath)shape).curveTo(21.6, 84.9, 21.5, 84.6, 21.2, 84.200005);
((GeneralPath)shape).curveTo(20.900002, 83.9, 20.5, 83.600006, 19.800001, 83.4);
((GeneralPath)shape).curveTo(19.300001, 83.200005, 18.300001, 83.0, 16.6, 82.6);
((GeneralPath)shape).curveTo(14.5, 82.1, 13.0, 81.4, 12.200001, 80.7);
((GeneralPath)shape).curveTo(11.000001, 79.6, 10.400001, 78.299995, 10.400001, 76.799995);
((GeneralPath)shape).curveTo(10.400001, 75.799995, 10.700001, 74.899994, 11.200001, 73.99999);
((GeneralPath)shape).curveTo(11.800001, 73.09999, 12.6, 72.49999, 13.6, 71.99999);
((GeneralPath)shape).curveTo(14.6, 71.49999, 15.900001, 71.299995, 17.4, 71.299995);
((GeneralPath)shape).curveTo(19.9, 71.299995, 21.7, 71.799995, 22.9, 72.899994);
((GeneralPath)shape).curveTo(24.1, 73.99999, 24.8, 75.399994, 24.9, 77.2);
((GeneralPath)shape).lineTo(21.0, 77.5);
((GeneralPath)shape).curveTo(20.8, 76.5, 20.5, 75.8, 19.9, 75.4);
((GeneralPath)shape).curveTo(19.3, 75.0, 18.5, 74.700005, 17.4, 74.700005);
((GeneralPath)shape).curveTo(16.3, 74.700005, 15.4, 74.9, 14.7, 75.4);
((GeneralPath)shape).curveTo(14.3, 75.700005, 14.099999, 76.1, 14.099999, 76.6);
((GeneralPath)shape).curveTo(14.099999, 77.1, 14.299999, 77.4, 14.7, 77.799995);
((GeneralPath)shape).curveTo(15.2, 78.2, 16.4, 78.6, 18.3, 79.1);
((GeneralPath)shape).curveTo(20.199999, 79.5, 21.599998, 80.0, 22.599998, 80.5);
((GeneralPath)shape).curveTo(23.499998, 81.0, 24.199999, 81.6, 24.8, 82.5);
((GeneralPath)shape).curveTo(25.3, 83.3, 25.599998, 84.4, 25.599998, 85.6);
((GeneralPath)shape).curveTo(25.599998, 86.7, 25.3, 87.7, 24.699999, 88.7);
((GeneralPath)shape).curveTo(24.099998, 89.7, 23.199999, 90.399994, 22.099998, 90.899994);
((GeneralPath)shape).curveTo(20.999998, 91.399994, 19.499998, 91.59999, 17.899998, 91.59999);
((GeneralPath)shape).curveTo(15.399998, 91.59999, 13.499998, 90.99999, 12.199998, 89.899994);
((GeneralPath)shape).curveTo(10.699998, 88.59999, 9.899998, 86.99999, 9.599998, 84.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.800001, 71.8);
((GeneralPath)shape).lineTo(36.0, 71.8);
((GeneralPath)shape).curveTo(37.6, 71.8, 38.9, 71.9, 39.7, 72.200005);
((GeneralPath)shape).curveTo(40.8, 72.50001, 41.8, 73.100006, 42.600002, 74.00001);
((GeneralPath)shape).curveTo(43.4, 74.90001, 44.000004, 75.90001, 44.500004, 77.100006);
((GeneralPath)shape).curveTo(44.900005, 78.3, 45.100002, 79.90001, 45.100002, 81.700005);
((GeneralPath)shape).curveTo(45.100002, 83.3, 44.9, 84.700005, 44.500004, 85.8);
((GeneralPath)shape).curveTo(44.000004, 87.200005, 43.300003, 88.3, 42.400005, 89.200005);
((GeneralPath)shape).curveTo(41.700005, 89.9, 40.800007, 90.4, 39.600006, 90.700005);
((GeneralPath)shape).curveTo(38.700005, 91.00001, 37.600006, 91.100006, 36.100006, 91.100006);
((GeneralPath)shape).lineTo(28.700006, 91.100006);
((GeneralPath)shape).lineTo(28.700006, 71.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.800003, 75.100006);
((GeneralPath)shape).lineTo(32.800003, 87.90001);
((GeneralPath)shape).lineTo(35.700005, 87.90001);
((GeneralPath)shape).curveTo(36.800003, 87.90001, 37.600006, 87.80001, 38.100006, 87.70001);
((GeneralPath)shape).curveTo(38.700005, 87.500015, 39.300007, 87.30001, 39.700005, 86.90001);
((GeneralPath)shape).curveTo(40.100006, 86.50001, 40.500004, 85.90001, 40.700005, 85.00001);
((GeneralPath)shape).curveTo(41.000004, 84.100006, 41.100006, 83.00001, 41.100006, 81.50001);
((GeneralPath)shape).curveTo(41.100006, 80.00001, 41.000008, 78.80001, 40.700005, 78.00001);
((GeneralPath)shape).curveTo(40.400005, 77.200005, 40.100006, 76.600006, 39.600006, 76.100006);
((GeneralPath)shape).curveTo(39.100006, 75.700005, 38.500008, 75.3, 37.800007, 75.200005);
((GeneralPath)shape).curveTo(37.20001, 75.100006, 36.20001, 75.00001, 34.600006, 75.00001);
((GeneralPath)shape).lineTo(32.800007, 75.00001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.600002, 91.100006);
((GeneralPath)shape).lineTo(48.600002, 71.8);
((GeneralPath)shape).lineTo(62.0, 71.8);
((GeneralPath)shape).lineTo(62.0, 75.100006);
((GeneralPath)shape).lineTo(52.6, 75.100006);
((GeneralPath)shape).lineTo(52.6, 79.700005);
((GeneralPath)shape).lineTo(60.8, 79.700005);
((GeneralPath)shape).lineTo(60.8, 83.0);
((GeneralPath)shape).lineTo(52.6, 83.0);
((GeneralPath)shape).lineTo(52.6, 91.2);
((GeneralPath)shape).lineTo(48.6, 91.2);
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
((GeneralPath)shape).moveTo(54.0, 48.1);
((GeneralPath)shape).curveTo(54.0, 50.6, 45.9, 52.6, 36.0, 52.6);
((GeneralPath)shape).curveTo(26.099998, 52.6, 18.0, 50.6, 18.0, 48.1);
((GeneralPath)shape).curveTo(18.0, 45.6, 26.1, 43.6, 36.0, 43.6);
((GeneralPath)shape).curveTo(45.9, 43.6, 54.0, 45.6, 54.0, 48.1);
((GeneralPath)shape).closePath();
paint = new Color(242, 242, 242, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.5, 47.8);
((GeneralPath)shape).curveTo(49.5, 50.0, 43.5, 51.7, 36.0, 51.7);
((GeneralPath)shape).curveTo(28.5, 51.7, 22.5, 50.0, 22.5, 47.8);
((GeneralPath)shape).curveTo(22.5, 45.6, 28.5, 43.899998, 36.0, 43.899998);
((GeneralPath)shape).curveTo(43.5, 43.899998, 49.5, 45.6, 49.5, 47.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 47.22200012207031), new Point2D.Double(43.02799987792969, 61.27799987792969), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.0, 48.3);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).curveTo(18.0, 59.5, 22.5, 64.0, 36.0, 64.0);
((GeneralPath)shape).curveTo(49.5, 64.0, 54.0, 59.5, 54.0, 59.5);
((GeneralPath)shape).lineTo(54.0, 48.3);
((GeneralPath)shape).curveTo(54.0, 48.3, 51.8, 52.2, 36.0, 52.5);
((GeneralPath)shape).curveTo(20.2, 52.8, 18.0, 48.3, 18.0, 48.3);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(18.0, 45.900001525878906), new Point2D.Double(54.0, 45.900001525878906), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 32.3);
((GeneralPath)shape).curveTo(54.0, 34.8, 45.9, 36.8, 36.0, 36.8);
((GeneralPath)shape).curveTo(26.099998, 36.8, 18.0, 34.8, 18.0, 32.3);
((GeneralPath)shape).curveTo(18.0, 29.8, 26.1, 27.8, 36.0, 27.8);
((GeneralPath)shape).curveTo(45.9, 27.8, 54.0, 29.8, 54.0, 32.3);
((GeneralPath)shape).closePath();
paint = new Color(242, 242, 242, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.5, 31.9);
((GeneralPath)shape).curveTo(49.5, 34.1, 43.5, 35.8, 36.0, 35.8);
((GeneralPath)shape).curveTo(28.5, 35.8, 22.5, 34.1, 22.5, 31.9);
((GeneralPath)shape).curveTo(22.5, 29.7, 28.5, 28.0, 36.0, 28.0);
((GeneralPath)shape).curveTo(43.5, 28.1, 49.5, 29.8, 49.5, 31.9);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(28.95400047302246, 63.00400161743164), new Point2D.Double(43.0099983215332, 77.05999755859375), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.0, 32.6);
((GeneralPath)shape).lineTo(18.0, 43.8);
((GeneralPath)shape).curveTo(18.0, 43.8, 22.5, 48.3, 36.0, 48.3);
((GeneralPath)shape).curveTo(49.5, 48.3, 54.0, 43.8, 54.0, 43.8);
((GeneralPath)shape).lineTo(54.0, 32.6);
((GeneralPath)shape).curveTo(54.0, 32.6, 51.8, 36.5, 36.0, 36.8);
((GeneralPath)shape).curveTo(20.2, 37.1, 18.0, 32.6, 18.0, 32.6);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(18.0, 61.599998474121094), new Point2D.Double(54.0, 61.599998474121094), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 16.6);
((GeneralPath)shape).curveTo(54.0, 19.1, 45.9, 21.1, 36.0, 21.1);
((GeneralPath)shape).curveTo(26.099998, 21.1, 18.0, 19.1, 18.0, 16.6);
((GeneralPath)shape).curveTo(18.0, 14.1, 26.1, 12.1, 36.0, 12.1);
((GeneralPath)shape).curveTo(45.9, 12.1, 54.0, 14.1, 54.0, 16.6);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.5, 16.3);
((GeneralPath)shape).curveTo(49.5, 18.5, 43.5, 20.199999, 36.0, 20.199999);
((GeneralPath)shape).curveTo(28.5, 20.199999, 22.5, 18.499998, 22.5, 16.3);
((GeneralPath)shape).curveTo(22.5, 14.1, 28.5, 12.4, 36.0, 12.4);
((GeneralPath)shape).curveTo(43.5, 12.4, 49.5, 14.099999, 49.5, 16.3);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 78.72200012207031), new Point2D.Double(43.02799987792969, 92.77799987792969), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_11
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.0, 16.8);
((GeneralPath)shape).lineTo(18.0, 28.0);
((GeneralPath)shape).curveTo(18.0, 28.0, 22.5, 32.5, 36.0, 32.5);
((GeneralPath)shape).curveTo(49.5, 32.5, 54.0, 28.0, 54.0, 28.0);
((GeneralPath)shape).lineTo(54.0, 16.8);
((GeneralPath)shape).curveTo(54.0, 16.8, 51.8, 20.699999, 36.0, 21.0);
((GeneralPath)shape).curveTo(20.2, 21.3, 18.0, 16.8, 18.0, 16.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(18.0, 77.4000015258789), new Point2D.Double(54.0, 77.4000015258789), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_12
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.06800079345703, 74.15499877929688), new Point2D.Double(58.56800079345703, 87.65499877929688), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_13
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
g.setTransform(defaultTransform__0_13);
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
	private ext_sdf() {
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
       ext_sdf base = new ext_sdf();
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
       ext_sdf base = new ext_sdf();
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
        return ext_sdf::new;
    }
}

