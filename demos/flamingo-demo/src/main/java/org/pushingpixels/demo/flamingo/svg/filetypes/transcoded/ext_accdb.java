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
public class ext_accdb implements ResizableIcon {
    

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
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(-0.2, 99.0);
((GeneralPath)shape).lineTo(-0.2, 1.0);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(-0.2, 99.0);
((GeneralPath)shape).lineTo(-0.2, 1.0);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(160, 53, 55, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(-0.2, 99.0);
((GeneralPath)shape).lineTo(-0.2, 1.0);
((GeneralPath)shape).lineTo(45.1, 1.0);
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
((GeneralPath)shape).moveTo(16.5, 91.1);
((GeneralPath)shape).lineTo(13.6, 91.1);
((GeneralPath)shape).lineTo(12.5, 88.2);
((GeneralPath)shape).lineTo(7.2, 88.2);
((GeneralPath)shape).lineTo(6.1, 91.1);
((GeneralPath)shape).lineTo(3.3, 91.1);
((GeneralPath)shape).lineTo(8.4, 78.2);
((GeneralPath)shape).lineTo(11.2, 78.2);
((GeneralPath)shape).lineTo(16.5, 91.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(11.6, 86.0);
((GeneralPath)shape).lineTo(9.8, 81.2);
((GeneralPath)shape).lineTo(8.0, 86.0);
((GeneralPath)shape).lineTo(11.6, 86.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.3, 86.3);
((GeneralPath)shape).lineTo(28.9, 87.100006);
((GeneralPath)shape).curveTo(28.5, 88.50001, 27.9, 89.600006, 26.9, 90.200005);
((GeneralPath)shape).curveTo(26.0, 90.9, 24.8, 91.200005, 23.4, 91.200005);
((GeneralPath)shape).curveTo(21.699999, 91.200005, 20.199999, 90.600006, 19.099998, 89.4);
((GeneralPath)shape).curveTo(17.999998, 88.200005, 17.399998, 86.6, 17.399998, 84.6);
((GeneralPath)shape).curveTo(17.399998, 82.5, 17.999998, 80.799995, 19.099998, 79.6);
((GeneralPath)shape).curveTo(20.199999, 78.4, 21.699999, 77.799995, 23.499998, 77.799995);
((GeneralPath)shape).curveTo(25.099998, 77.799995, 26.399998, 78.299995, 27.399998, 79.2);
((GeneralPath)shape).curveTo(27.999998, 79.799995, 28.399998, 80.5, 28.699997, 81.6);
((GeneralPath)shape).lineTo(26.099997, 82.2);
((GeneralPath)shape).curveTo(25.899996, 81.5, 25.599997, 81.0, 25.099997, 80.6);
((GeneralPath)shape).curveTo(24.599997, 80.2, 24.0, 80.0, 23.3, 80.0);
((GeneralPath)shape).curveTo(22.3, 80.0, 21.5, 80.3, 20.9, 81.0);
((GeneralPath)shape).curveTo(20.3, 81.7, 20.0, 82.8, 20.0, 84.3);
((GeneralPath)shape).curveTo(20.0, 85.9, 20.3, 87.100006, 20.9, 87.8);
((GeneralPath)shape).curveTo(21.5, 88.5, 22.3, 88.8, 23.199999, 88.8);
((GeneralPath)shape).curveTo(23.9, 88.8, 24.499998, 88.600006, 24.999998, 88.100006);
((GeneralPath)shape).curveTo(25.699999, 88.00001, 25.999998, 87.3, 26.299997, 86.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(39.5, 86.3);
((GeneralPath)shape).lineTo(42.1, 87.100006);
((GeneralPath)shape).curveTo(41.699997, 88.50001, 41.1, 89.600006, 40.1, 90.200005);
((GeneralPath)shape).curveTo(39.199997, 90.9, 38.0, 91.200005, 36.6, 91.200005);
((GeneralPath)shape).curveTo(34.899998, 91.200005, 33.399998, 90.600006, 32.3, 89.4);
((GeneralPath)shape).curveTo(31.199999, 88.200005, 30.599998, 86.6, 30.599998, 84.6);
((GeneralPath)shape).curveTo(30.599998, 82.5, 31.199999, 80.799995, 32.3, 79.6);
((GeneralPath)shape).curveTo(33.399998, 78.4, 34.899998, 77.799995, 36.7, 77.799995);
((GeneralPath)shape).curveTo(38.3, 77.799995, 39.600002, 78.299995, 40.600002, 79.2);
((GeneralPath)shape).curveTo(41.2, 79.799995, 41.600002, 80.5, 41.9, 81.6);
((GeneralPath)shape).lineTo(39.300003, 82.2);
((GeneralPath)shape).curveTo(39.100002, 81.5, 38.800003, 81.0, 38.300003, 80.6);
((GeneralPath)shape).curveTo(37.800003, 80.2, 37.200005, 80.0, 36.500004, 80.0);
((GeneralPath)shape).curveTo(35.500004, 80.0, 34.700005, 80.3, 34.100002, 81.0);
((GeneralPath)shape).curveTo(33.5, 81.7, 33.2, 82.8, 33.2, 84.3);
((GeneralPath)shape).curveTo(33.2, 85.9, 33.5, 87.100006, 34.100002, 87.8);
((GeneralPath)shape).curveTo(34.7, 88.5, 35.500004, 88.8, 36.4, 88.8);
((GeneralPath)shape).curveTo(37.100002, 88.8, 37.7, 88.600006, 38.2, 88.100006);
((GeneralPath)shape).curveTo(38.9, 88.00001, 39.3, 87.3, 39.5, 86.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(44.3, 78.200005);
((GeneralPath)shape).lineTo(49.1, 78.200005);
((GeneralPath)shape).curveTo(50.199997, 78.200005, 51.0, 78.3, 51.6, 78.4);
((GeneralPath)shape).curveTo(52.399998, 78.6, 53.0, 79.0, 53.6, 79.6);
((GeneralPath)shape).curveTo(54.1, 80.2, 54.6, 80.9, 54.899998, 81.7);
((GeneralPath)shape).curveTo(55.199997, 82.5, 55.3, 83.5, 55.3, 84.7);
((GeneralPath)shape).curveTo(55.3, 85.799995, 55.2, 86.7, 54.899998, 87.399994);
((GeneralPath)shape).curveTo(54.6, 88.299995, 54.1, 89.09999, 53.499996, 89.7);
((GeneralPath)shape).curveTo(52.999996, 90.1, 52.399998, 90.5, 51.599995, 90.7);
((GeneralPath)shape).curveTo(50.999996, 90.899994, 50.199993, 91.0, 49.299995, 91.0);
((GeneralPath)shape).lineTo(44.299995, 91.0);
((GeneralPath)shape).lineTo(44.299995, 78.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.0, 80.4);
((GeneralPath)shape).lineTo(47.0, 88.9);
((GeneralPath)shape).lineTo(49.0, 88.9);
((GeneralPath)shape).curveTo(49.7, 88.9, 50.3, 88.9, 50.6, 88.8);
((GeneralPath)shape).curveTo(51.0, 88.700005, 51.399998, 88.5, 51.699997, 88.3);
((GeneralPath)shape).curveTo(51.999996, 88.100006, 52.199997, 87.600006, 52.399998, 87.100006);
((GeneralPath)shape).curveTo(52.6, 86.50001, 52.699997, 85.700005, 52.699997, 84.700005);
((GeneralPath)shape).curveTo(52.699997, 83.700005, 52.6, 82.9, 52.399998, 82.4);
((GeneralPath)shape).curveTo(52.199997, 81.9, 51.999996, 81.5, 51.6, 81.200005);
((GeneralPath)shape).curveTo(51.3, 80.9, 50.899998, 80.700005, 50.399998, 80.600006);
((GeneralPath)shape).curveTo(49.999996, 80.50001, 49.3, 80.50001, 48.199997, 80.50001);
((GeneralPath)shape).lineTo(47.0, 80.50001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(57.5, 78.200005);
((GeneralPath)shape).lineTo(62.7, 78.200005);
((GeneralPath)shape).curveTo(63.7, 78.200005, 64.5, 78.200005, 65.0, 78.3);
((GeneralPath)shape).curveTo(65.5, 78.4, 66.0, 78.600006, 66.4, 78.8);
((GeneralPath)shape).curveTo(66.8, 79.0, 67.1, 79.4, 67.4, 79.9);
((GeneralPath)shape).curveTo(67.700005, 80.3, 67.8, 80.9, 67.8, 81.4);
((GeneralPath)shape).curveTo(67.8, 82.0, 67.600006, 82.6, 67.3, 83.1);
((GeneralPath)shape).curveTo(67.0, 83.6, 66.5, 84.0, 66.0, 84.2);
((GeneralPath)shape).curveTo(66.8, 84.399994, 67.4, 84.799995, 67.8, 85.399994);
((GeneralPath)shape).curveTo(68.200005, 85.99999, 68.4, 86.59999, 68.4, 87.299995);
((GeneralPath)shape).curveTo(68.4, 87.899994, 68.3, 88.49999, 68.0, 88.99999);
((GeneralPath)shape).curveTo(67.7, 89.59999, 67.3, 89.99999, 66.9, 90.299995);
((GeneralPath)shape).curveTo(66.4, 90.6, 65.8, 90.799995, 65.1, 90.899994);
((GeneralPath)shape).curveTo(64.7, 90.899994, 63.6, 90.99999, 61.899998, 90.99999);
((GeneralPath)shape).lineTo(57.399998, 90.99999);
((GeneralPath)shape).lineTo(57.399998, 78.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(60.2, 80.3);
((GeneralPath)shape).lineTo(60.2, 83.3);
((GeneralPath)shape).lineTo(63.8, 83.3);
((GeneralPath)shape).curveTo(64.3, 83.200005, 64.6, 83.100006, 64.9, 82.8);
((GeneralPath)shape).curveTo(65.200005, 82.5, 65.3, 82.200005, 65.3, 81.8);
((GeneralPath)shape).curveTo(65.3, 81.4, 65.200005, 81.100006, 65.0, 80.8);
((GeneralPath)shape).curveTo(64.8, 80.600006, 64.4, 80.4, 64.0, 80.3);
((GeneralPath)shape).lineTo(60.2, 80.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(60.2, 85.5);
((GeneralPath)shape).lineTo(60.2, 88.9);
((GeneralPath)shape).lineTo(62.600002, 88.9);
((GeneralPath)shape).curveTo(63.600002, 88.9, 64.200005, 88.9, 64.4, 88.8);
((GeneralPath)shape).curveTo(64.8, 88.700005, 65.1, 88.600006, 65.4, 88.3);
((GeneralPath)shape).curveTo(65.6, 88.0, 65.8, 87.700005, 65.8, 87.200005);
((GeneralPath)shape).curveTo(65.8, 86.8, 65.700005, 86.50001, 65.5, 86.200005);
((GeneralPath)shape).curveTo(65.3, 85.9, 65.0, 85.700005, 64.7, 85.600006);
((GeneralPath)shape).curveTo(64.299995, 85.50001, 63.6, 85.40001, 62.399998, 85.40001);
((GeneralPath)shape).lineTo(60.199997, 85.40001);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 47.22200012207031), new Point2D.Double(43.02799987792969, 61.27799987792969), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(18.0, 45.900001525878906), new Point2D.Double(54.0, 45.900001525878906), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(28.95400047302246, 63.00400161743164), new Point2D.Double(43.0099983215332, 77.05999755859375), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(18.0, 61.599998474121094), new Point2D.Double(54.0, 61.599998474121094), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 78.72200012207031), new Point2D.Double(43.02799987792969, 92.77799987792969), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(18.0, 77.4000015258789), new Point2D.Double(54.0, 77.4000015258789), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_12
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_13
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.1, 1.0);
((GeneralPath)shape).lineTo(71.3, 27.7);
((GeneralPath)shape).lineTo(44.1, 27.7);
((GeneralPath)shape).lineTo(44.1, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(160, 53, 55, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.1, 1.0);
((GeneralPath)shape).lineTo(71.3, 27.7);
((GeneralPath)shape).lineTo(44.1, 27.7);
((GeneralPath)shape).lineTo(44.1, 1.0);
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
        return 0.12799999117851257;
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
		return 0.7450000047683716;
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
	private ext_accdb() {
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
       ext_accdb base = new ext_accdb();
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
       ext_accdb base = new ext_accdb();
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
        return ext_accdb::new;
    }
}

