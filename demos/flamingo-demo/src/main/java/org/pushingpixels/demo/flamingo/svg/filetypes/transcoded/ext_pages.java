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
public class ext_pages implements ResizableIcon {
    

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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.056f,0.16f,0.274f,0.398f,0.539f,0.711f,1.0f}, new Color[] {new Color(0, 45, 68, 255),new Color(1, 56, 82, 255),new Color(10, 77, 107, 255),new Color(15, 94, 130, 255),new Color(15, 109, 150, 255),new Color(13, 119, 164, 255),new Color(10, 126, 174, 255),new Color(8, 129, 178, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new Color(1, 65, 94, 255);
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
((GeneralPath)shape).moveTo(63.6, 67.0);
((GeneralPath)shape).lineTo(63.5, 67.8);
((GeneralPath)shape).lineTo(63.4, 68.9);
((GeneralPath)shape).lineTo(8.200001, 68.8);
((GeneralPath)shape).lineTo(7.500001, 68.700005);
((GeneralPath)shape).lineTo(7.200001, 68.3);
((GeneralPath)shape).lineTo(7.100001, 67.8);
((GeneralPath)shape).lineTo(7.200001, 67.4);
((GeneralPath)shape).lineTo(7.700001, 67.0);
((GeneralPath)shape).lineTo(63.600002, 67.0);
((GeneralPath)shape).closePath();
paint = new Color(11, 68, 102, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(63.6, 67.0);
((GeneralPath)shape).lineTo(63.5, 67.8);
((GeneralPath)shape).lineTo(63.4, 68.9);
((GeneralPath)shape).lineTo(8.200001, 68.8);
((GeneralPath)shape).lineTo(7.500001, 68.700005);
((GeneralPath)shape).lineTo(7.200001, 68.3);
((GeneralPath)shape).lineTo(7.100001, 67.8);
((GeneralPath)shape).lineTo(7.200001, 67.4);
((GeneralPath)shape).lineTo(7.700001, 67.0);
((GeneralPath)shape).lineTo(63.600002, 67.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(14, 85, 128, 255);
stroke = new BasicStroke(0.6f,0,1,1.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(63.6, 67.0);
((GeneralPath)shape).lineTo(63.5, 67.8);
((GeneralPath)shape).lineTo(63.4, 68.9);
((GeneralPath)shape).lineTo(8.200001, 68.8);
((GeneralPath)shape).lineTo(7.500001, 68.700005);
((GeneralPath)shape).lineTo(7.200001, 68.3);
((GeneralPath)shape).lineTo(7.100001, 67.8);
((GeneralPath)shape).lineTo(7.200001, 67.4);
((GeneralPath)shape).lineTo(7.700001, 67.0);
((GeneralPath)shape).lineTo(63.600002, 67.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.1, 60.9);
((GeneralPath)shape).lineTo(13.1, 63.0);
((GeneralPath)shape).lineTo(10.400001, 64.9);
((GeneralPath)shape).lineTo(9.000001, 65.700005);
((GeneralPath)shape).lineTo(8.500001, 65.700005);
((GeneralPath)shape).lineTo(8.300001, 65.100006);
((GeneralPath)shape).lineTo(9.200001, 63.700005);
((GeneralPath)shape).lineTo(11.1, 60.900005);
((GeneralPath)shape).closePath();
paint = new Color(11, 68, 102, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.1, 60.9);
((GeneralPath)shape).lineTo(13.1, 63.0);
((GeneralPath)shape).lineTo(10.400001, 64.9);
((GeneralPath)shape).lineTo(9.000001, 65.700005);
((GeneralPath)shape).lineTo(8.500001, 65.700005);
((GeneralPath)shape).lineTo(8.300001, 65.100006);
((GeneralPath)shape).lineTo(9.200001, 63.700005);
((GeneralPath)shape).lineTo(11.1, 60.900005);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(14, 85, 128, 255);
stroke = new BasicStroke(0.6f,0,1,1.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.1, 60.9);
((GeneralPath)shape).lineTo(13.1, 63.0);
((GeneralPath)shape).lineTo(10.400001, 64.9);
((GeneralPath)shape).lineTo(9.000001, 65.700005);
((GeneralPath)shape).lineTo(8.500001, 65.700005);
((GeneralPath)shape).lineTo(8.300001, 65.100006);
((GeneralPath)shape).lineTo(9.200001, 63.700005);
((GeneralPath)shape).lineTo(11.1, 60.900005);
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
((GeneralPath)shape).moveTo(28.9, 40.6);
((GeneralPath)shape).lineTo(33.3, 45.1);
((GeneralPath)shape).lineTo(29.4, 49.0);
((GeneralPath)shape).lineTo(25.099998, 52.9);
((GeneralPath)shape).lineTo(20.8, 56.7);
((GeneralPath)shape).lineTo(17.4, 59.600002);
((GeneralPath)shape).lineTo(13.799999, 62.2);
((GeneralPath)shape).lineTo(11.699999, 60.100002);
((GeneralPath)shape).lineTo(13.699999, 57.2);
((GeneralPath)shape).lineTo(16.499998, 53.9);
((GeneralPath)shape).lineTo(18.699999, 51.300003);
((GeneralPath)shape).lineTo(21.499998, 48.300003);
((GeneralPath)shape).lineTo(24.999998, 44.600002);
((GeneralPath)shape).lineTo(28.899998, 40.600002);
((GeneralPath)shape).closePath();
paint = new Color(11, 68, 102, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.9, 40.6);
((GeneralPath)shape).lineTo(33.3, 45.1);
((GeneralPath)shape).lineTo(29.4, 49.0);
((GeneralPath)shape).lineTo(25.099998, 52.9);
((GeneralPath)shape).lineTo(20.8, 56.7);
((GeneralPath)shape).lineTo(17.4, 59.600002);
((GeneralPath)shape).lineTo(13.799999, 62.2);
((GeneralPath)shape).lineTo(11.699999, 60.100002);
((GeneralPath)shape).lineTo(13.699999, 57.2);
((GeneralPath)shape).lineTo(16.499998, 53.9);
((GeneralPath)shape).lineTo(18.699999, 51.300003);
((GeneralPath)shape).lineTo(21.499998, 48.300003);
((GeneralPath)shape).lineTo(24.999998, 44.600002);
((GeneralPath)shape).lineTo(28.899998, 40.600002);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(14, 85, 128, 255);
stroke = new BasicStroke(0.6f,0,1,1.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.9, 40.6);
((GeneralPath)shape).lineTo(33.3, 45.1);
((GeneralPath)shape).lineTo(29.4, 49.0);
((GeneralPath)shape).lineTo(25.099998, 52.9);
((GeneralPath)shape).lineTo(20.8, 56.7);
((GeneralPath)shape).lineTo(17.4, 59.600002);
((GeneralPath)shape).lineTo(13.799999, 62.2);
((GeneralPath)shape).lineTo(11.699999, 60.100002);
((GeneralPath)shape).lineTo(13.699999, 57.2);
((GeneralPath)shape).lineTo(16.499998, 53.9);
((GeneralPath)shape).lineTo(18.699999, 51.300003);
((GeneralPath)shape).lineTo(21.499998, 48.300003);
((GeneralPath)shape).lineTo(24.999998, 44.600002);
((GeneralPath)shape).lineTo(28.899998, 40.600002);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.2, 22.3);
((GeneralPath)shape).lineTo(50.3, 22.4);
((GeneralPath)shape).lineTo(51.0, 23.0);
((GeneralPath)shape).curveTo(51.0, 23.0, 51.5, 24.0, 51.5, 23.9);
((GeneralPath)shape).lineTo(51.5, 25.1);
((GeneralPath)shape).lineTo(51.1, 26.2);
((GeneralPath)shape).lineTo(50.6, 27.0);
((GeneralPath)shape).lineTo(50.6, 27.9);
((GeneralPath)shape).lineTo(51.0, 28.4);
((GeneralPath)shape).lineTo(51.1, 29.1);
((GeneralPath)shape).lineTo(50.899998, 30.0);
((GeneralPath)shape).lineTo(41.899998, 39.6);
((GeneralPath)shape).lineTo(39.399998, 42.3);
((GeneralPath)shape).lineTo(38.399998, 43.5);
((GeneralPath)shape).lineTo(38.3, 44.1);
((GeneralPath)shape).lineTo(38.399998, 44.8);
((GeneralPath)shape).lineTo(37.8, 45.5);
((GeneralPath)shape).lineTo(37.0, 45.0);
((GeneralPath)shape).lineTo(36.7, 44.0);
((GeneralPath)shape).lineTo(36.9, 43.0);
((GeneralPath)shape).lineTo(37.5, 42.2);
((GeneralPath)shape).lineTo(43.8, 35.5);
((GeneralPath)shape).lineTo(49.1, 29.6);
((GeneralPath)shape).lineTo(49.199997, 28.9);
((GeneralPath)shape).lineTo(48.499996, 29.0);
((GeneralPath)shape).lineTo(44.699997, 33.1);
((GeneralPath)shape).lineTo(38.499996, 39.5);
((GeneralPath)shape).lineTo(34.099995, 44.0);
((GeneralPath)shape).lineTo(29.599995, 39.8);
((GeneralPath)shape).lineTo(34.699993, 34.399998);
((GeneralPath)shape).lineTo(40.499992, 28.799997);
((GeneralPath)shape).lineTo(45.79999, 23.899998);
((GeneralPath)shape).lineTo(47.199993, 22.899998);
((GeneralPath)shape).lineTo(48.199993, 22.299997);
((GeneralPath)shape).lineTo(49.199993, 22.299997);
((GeneralPath)shape).closePath();
paint = new Color(11, 68, 102, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.2, 22.3);
((GeneralPath)shape).lineTo(50.3, 22.4);
((GeneralPath)shape).lineTo(51.0, 23.0);
((GeneralPath)shape).curveTo(51.0, 23.0, 51.5, 24.0, 51.5, 23.9);
((GeneralPath)shape).lineTo(51.5, 25.1);
((GeneralPath)shape).lineTo(51.1, 26.2);
((GeneralPath)shape).lineTo(50.6, 27.0);
((GeneralPath)shape).lineTo(50.6, 27.9);
((GeneralPath)shape).lineTo(51.0, 28.4);
((GeneralPath)shape).lineTo(51.1, 29.1);
((GeneralPath)shape).lineTo(50.899998, 30.0);
((GeneralPath)shape).lineTo(41.899998, 39.6);
((GeneralPath)shape).lineTo(39.399998, 42.3);
((GeneralPath)shape).lineTo(38.399998, 43.5);
((GeneralPath)shape).lineTo(38.3, 44.1);
((GeneralPath)shape).lineTo(38.399998, 44.8);
((GeneralPath)shape).lineTo(37.8, 45.5);
((GeneralPath)shape).lineTo(37.0, 45.0);
((GeneralPath)shape).lineTo(36.7, 44.0);
((GeneralPath)shape).lineTo(36.9, 43.0);
((GeneralPath)shape).lineTo(37.5, 42.2);
((GeneralPath)shape).lineTo(43.8, 35.5);
((GeneralPath)shape).lineTo(49.1, 29.6);
((GeneralPath)shape).lineTo(49.199997, 28.9);
((GeneralPath)shape).lineTo(48.499996, 29.0);
((GeneralPath)shape).lineTo(44.699997, 33.1);
((GeneralPath)shape).lineTo(38.499996, 39.5);
((GeneralPath)shape).lineTo(34.099995, 44.0);
((GeneralPath)shape).lineTo(29.599995, 39.8);
((GeneralPath)shape).lineTo(34.699993, 34.399998);
((GeneralPath)shape).lineTo(40.499992, 28.799997);
((GeneralPath)shape).lineTo(45.79999, 23.899998);
((GeneralPath)shape).lineTo(47.199993, 22.899998);
((GeneralPath)shape).lineTo(48.199993, 22.299997);
((GeneralPath)shape).lineTo(49.199993, 22.299997);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(14, 85, 128, 255);
stroke = new BasicStroke(0.6f,0,1,1.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.2, 22.3);
((GeneralPath)shape).lineTo(50.3, 22.4);
((GeneralPath)shape).lineTo(51.0, 23.0);
((GeneralPath)shape).curveTo(51.0, 23.0, 51.5, 24.0, 51.5, 23.9);
((GeneralPath)shape).lineTo(51.5, 25.1);
((GeneralPath)shape).lineTo(51.1, 26.2);
((GeneralPath)shape).lineTo(50.6, 27.0);
((GeneralPath)shape).lineTo(50.6, 27.9);
((GeneralPath)shape).lineTo(51.0, 28.4);
((GeneralPath)shape).lineTo(51.1, 29.1);
((GeneralPath)shape).lineTo(50.899998, 30.0);
((GeneralPath)shape).lineTo(41.899998, 39.6);
((GeneralPath)shape).lineTo(39.399998, 42.3);
((GeneralPath)shape).lineTo(38.399998, 43.5);
((GeneralPath)shape).lineTo(38.3, 44.1);
((GeneralPath)shape).lineTo(38.399998, 44.8);
((GeneralPath)shape).lineTo(37.8, 45.5);
((GeneralPath)shape).lineTo(37.0, 45.0);
((GeneralPath)shape).lineTo(36.7, 44.0);
((GeneralPath)shape).lineTo(36.9, 43.0);
((GeneralPath)shape).lineTo(37.5, 42.2);
((GeneralPath)shape).lineTo(43.8, 35.5);
((GeneralPath)shape).lineTo(49.1, 29.6);
((GeneralPath)shape).lineTo(49.199997, 28.9);
((GeneralPath)shape).lineTo(48.499996, 29.0);
((GeneralPath)shape).lineTo(44.699997, 33.1);
((GeneralPath)shape).lineTo(38.499996, 39.5);
((GeneralPath)shape).lineTo(34.099995, 44.0);
((GeneralPath)shape).lineTo(29.599995, 39.8);
((GeneralPath)shape).lineTo(34.699993, 34.399998);
((GeneralPath)shape).lineTo(40.499992, 28.799997);
((GeneralPath)shape).lineTo(45.79999, 23.899998);
((GeneralPath)shape).lineTo(47.199993, 22.899998);
((GeneralPath)shape).lineTo(48.199993, 22.299997);
((GeneralPath)shape).lineTo(49.199993, 22.299997);
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
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {new Color(223, 241, 250, 255),new Color(220, 238, 247, 255),new Color(211, 228, 239, 255),new Color(196, 214, 227, 255),new Color(177, 197, 213, 255),new Color(154, 176, 197, 255),new Color(129, 154, 179, 255),new Color(100, 130, 159, 255),new Color(66, 108, 140, 255),new Color(6, 87, 122, 255),new Color(1, 86, 121, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_11
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(1, 65, 94, 255);
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
g.setTransform(defaultTransform__0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_12
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.9, 93.0);
((GeneralPath)shape).lineTo(4.9, 79.4);
((GeneralPath)shape).lineTo(9.3, 79.4);
((GeneralPath)shape).curveTo(11.0, 79.4, 12.1, 79.5, 12.6, 79.6);
((GeneralPath)shape).curveTo(13.400001, 79.799995, 14.0, 80.2, 14.6, 80.9);
((GeneralPath)shape).curveTo(15.1, 81.6, 15.400001, 82.5, 15.400001, 83.5);
((GeneralPath)shape).curveTo(15.400001, 84.3, 15.200001, 85.0, 14.900001, 85.6);
((GeneralPath)shape).curveTo(14.6, 86.2, 14.200001, 86.6, 13.700001, 86.9);
((GeneralPath)shape).curveTo(13.200001, 87.200005, 12.800001, 87.4, 12.300001, 87.5);
((GeneralPath)shape).curveTo(11.600001, 87.6, 10.700001, 87.7, 9.500001, 87.7);
((GeneralPath)shape).lineTo(7.6, 87.7);
((GeneralPath)shape).lineTo(7.6, 93.0);
((GeneralPath)shape).lineTo(4.9, 93.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(7.6000004, 81.7);
((GeneralPath)shape).lineTo(7.6000004, 85.6);
((GeneralPath)shape).lineTo(9.1, 85.6);
((GeneralPath)shape).curveTo(10.200001, 85.6, 10.900001, 85.5, 11.3, 85.4);
((GeneralPath)shape).curveTo(11.7, 85.3, 12.0, 85.0, 12.2, 84.700005);
((GeneralPath)shape).curveTo(12.4, 84.4, 12.5, 84.00001, 12.5, 83.600006);
((GeneralPath)shape).curveTo(12.5, 83.100006, 12.4, 82.700005, 12.1, 82.40001);
((GeneralPath)shape).curveTo(11.8, 82.100006, 11.400001, 81.90001, 11.0, 81.80001);
((GeneralPath)shape).curveTo(10.7, 81.70001, 10.0, 81.70001, 9.0, 81.70001);
((GeneralPath)shape).lineTo(7.6, 81.70001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.4, 93.0);
((GeneralPath)shape).lineTo(25.4, 93.0);
((GeneralPath)shape).lineTo(24.199999, 89.9);
((GeneralPath)shape).lineTo(18.8, 89.9);
((GeneralPath)shape).lineTo(17.7, 93.0);
((GeneralPath)shape).lineTo(14.800001, 93.0);
((GeneralPath)shape).lineTo(20.100002, 79.4);
((GeneralPath)shape).lineTo(23.0, 79.4);
((GeneralPath)shape).lineTo(28.4, 93.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.4, 87.6);
((GeneralPath)shape).lineTo(21.5, 82.6);
((GeneralPath)shape).lineTo(19.7, 87.6);
((GeneralPath)shape).lineTo(23.400002, 87.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.2, 88.0);
((GeneralPath)shape).lineTo(36.2, 85.7);
((GeneralPath)shape).lineTo(42.100002, 85.7);
((GeneralPath)shape).lineTo(42.100002, 91.1);
((GeneralPath)shape).curveTo(41.500004, 91.7, 40.7, 92.1, 39.600002, 92.6);
((GeneralPath)shape).curveTo(38.500004, 93.0, 37.4, 93.2, 36.300003, 93.2);
((GeneralPath)shape).curveTo(34.9, 93.2, 33.600002, 92.899994, 32.600002, 92.299995);
((GeneralPath)shape).curveTo(31.600002, 91.7, 30.700003, 90.799995, 30.200003, 89.7);
((GeneralPath)shape).curveTo(29.700003, 88.6, 29.400003, 87.399994, 29.400003, 86.1);
((GeneralPath)shape).curveTo(29.400003, 84.7, 29.700003, 83.4, 30.300003, 82.299995);
((GeneralPath)shape).curveTo(30.900003, 81.2, 31.800003, 80.399994, 32.9, 79.799995);
((GeneralPath)shape).curveTo(33.800003, 79.299995, 34.9, 79.1, 36.2, 79.1);
((GeneralPath)shape).curveTo(37.9, 79.1, 39.2, 79.5, 40.2, 80.2);
((GeneralPath)shape).curveTo(41.100002, 80.899994, 41.8, 81.899994, 42.0, 83.1);
((GeneralPath)shape).lineTo(39.3, 83.6);
((GeneralPath)shape).curveTo(39.1, 82.9, 38.7, 82.4, 38.2, 82.0);
((GeneralPath)shape).curveTo(37.7, 81.6, 37.0, 81.4, 36.2, 81.4);
((GeneralPath)shape).curveTo(35.0, 81.4, 34.0, 81.8, 33.3, 82.5);
((GeneralPath)shape).curveTo(32.6, 83.3, 32.2, 84.4, 32.2, 85.9);
((GeneralPath)shape).curveTo(32.2, 87.5, 32.600002, 88.700005, 33.3, 89.5);
((GeneralPath)shape).curveTo(34.0, 90.3, 35.0, 90.7, 36.1, 90.7);
((GeneralPath)shape).curveTo(36.699997, 90.7, 37.3, 90.6, 37.8, 90.399994);
((GeneralPath)shape).curveTo(38.399998, 90.2, 38.899998, 89.899994, 39.3, 89.59999);
((GeneralPath)shape).lineTo(39.3, 88.0);
((GeneralPath)shape).lineTo(36.2, 88.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(44.7, 93.0);
((GeneralPath)shape).lineTo(44.7, 79.4);
((GeneralPath)shape).lineTo(54.800003, 79.4);
((GeneralPath)shape).lineTo(54.800003, 81.700005);
((GeneralPath)shape).lineTo(47.500004, 81.700005);
((GeneralPath)shape).lineTo(47.500004, 84.700005);
((GeneralPath)shape).lineTo(54.300003, 84.700005);
((GeneralPath)shape).lineTo(54.300003, 87.0);
((GeneralPath)shape).lineTo(47.500004, 87.0);
((GeneralPath)shape).lineTo(47.500004, 90.7);
((GeneralPath)shape).lineTo(55.0, 90.7);
((GeneralPath)shape).lineTo(55.0, 93.0);
((GeneralPath)shape).lineTo(44.7, 93.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(56.6, 88.6);
((GeneralPath)shape).lineTo(59.3, 88.299995);
((GeneralPath)shape).curveTo(59.5, 89.2, 59.8, 89.899994, 60.3, 90.299995);
((GeneralPath)shape).curveTo(60.8, 90.7, 61.5, 90.899994, 62.3, 90.899994);
((GeneralPath)shape).curveTo(63.2, 90.899994, 63.899998, 90.7, 64.3, 90.299995);
((GeneralPath)shape).curveTo(64.700005, 89.99999, 65.0, 89.49999, 65.0, 88.99999);
((GeneralPath)shape).curveTo(65.0, 88.69999, 64.9, 88.399994, 64.7, 88.19999);
((GeneralPath)shape).curveTo(64.5, 87.99999, 64.2, 87.79999, 63.699997, 87.59999);
((GeneralPath)shape).curveTo(63.399998, 87.49999, 62.6, 87.29999, 61.499996, 86.99999);
((GeneralPath)shape).curveTo(59.999996, 86.59999, 58.999996, 86.19999, 58.399998, 85.69999);
((GeneralPath)shape).curveTo(57.6, 84.99999, 57.1, 83.99999, 57.1, 82.99999);
((GeneralPath)shape).curveTo(57.1, 82.299995, 57.3, 81.69999, 57.699997, 81.09999);
((GeneralPath)shape).curveTo(58.1, 80.49999, 58.699997, 79.99999, 59.399998, 79.69999);
((GeneralPath)shape).curveTo(60.1, 79.39999, 60.999996, 79.19999, 62.1, 79.19999);
((GeneralPath)shape).curveTo(63.8, 79.19999, 65.1, 79.59999, 66.0, 80.29999);
((GeneralPath)shape).curveTo(66.9, 80.999985, 67.3, 81.999985, 67.4, 83.29999);
((GeneralPath)shape).lineTo(64.700005, 83.39999);
((GeneralPath)shape).curveTo(64.600006, 82.69999, 64.3, 82.19999, 63.900005, 81.89999);
((GeneralPath)shape).curveTo(63.500004, 81.59998, 62.900005, 81.39999, 62.200005, 81.39999);
((GeneralPath)shape).curveTo(61.400005, 81.39999, 60.800003, 81.59998, 60.300003, 81.89999);
((GeneralPath)shape).curveTo(60.000004, 82.09998, 59.9, 82.39999, 59.9, 82.69999);
((GeneralPath)shape).curveTo(59.9, 82.99999, 60.0, 83.29999, 60.300003, 83.49999);
((GeneralPath)shape).curveTo(60.600002, 83.799995, 61.500004, 84.09999, 62.800003, 84.399994);
((GeneralPath)shape).curveTo(64.100006, 84.7, 65.100006, 84.99999, 65.8, 85.399994);
((GeneralPath)shape).curveTo(66.4, 85.7, 66.9, 86.2, 67.3, 86.799995);
((GeneralPath)shape).curveTo(67.700005, 87.399994, 67.8, 88.1, 67.8, 88.99999);
((GeneralPath)shape).curveTo(67.8, 89.799995, 67.600006, 90.49999, 67.200005, 91.19999);
((GeneralPath)shape).curveTo(66.8, 91.89999, 66.200005, 92.39999, 65.4, 92.69999);
((GeneralPath)shape).curveTo(64.6, 92.99999, 63.600002, 93.19999, 62.4, 93.19999);
((GeneralPath)shape).curveTo(60.7, 93.19999, 59.4, 92.79999, 58.4, 91.99999);
((GeneralPath)shape).curveTo(57.4, 91.19999, 56.800003, 90.09999, 56.600002, 88.59999);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_12);
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
	private ext_pages() {
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
       ext_pages base = new ext_pages();
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
       ext_pages base = new ext_pages();
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
        return ext_pages::new;
    }
}

