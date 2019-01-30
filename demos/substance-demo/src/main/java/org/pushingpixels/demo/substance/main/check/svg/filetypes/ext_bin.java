package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_bin implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
paint = new LinearGradientPaint(new Point2D.Double(36.29399871826172, 38.97600173950195), new Point2D.Double(36.29399871826172, 22.783000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.3, 22.8);
((GeneralPath)shape).curveTo(32.5, 22.8, 29.4, 26.4, 29.4, 30.9);
((GeneralPath)shape).curveTo(29.4, 35.4, 32.5, 39.0, 36.3, 39.0);
((GeneralPath)shape).curveTo(40.1, 39.0, 43.2, 35.4, 43.2, 30.9);
((GeneralPath)shape).curveTo(43.2, 26.399998, 40.100002, 22.8, 36.3, 22.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.3, 35.9);
((GeneralPath)shape).curveTo(34.2, 35.9, 32.399998, 33.7, 32.399998, 30.900002);
((GeneralPath)shape).curveTo(32.399998, 28.100002, 34.1, 25.900002, 36.3, 25.900002);
((GeneralPath)shape).curveTo(38.399998, 25.900002, 40.2, 28.100002, 40.2, 30.900002);
((GeneralPath)shape).curveTo(40.100002, 33.600002, 38.4, 35.9, 36.3, 35.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.29399871826172, 39.47600173950195), new Point2D.Double(36.29399871826172, 22.283000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.3, 22.8);
((GeneralPath)shape).curveTo(32.5, 22.8, 29.4, 26.4, 29.4, 30.9);
((GeneralPath)shape).curveTo(29.4, 35.4, 32.5, 39.0, 36.3, 39.0);
((GeneralPath)shape).curveTo(40.1, 39.0, 43.2, 35.4, 43.2, 30.9);
((GeneralPath)shape).curveTo(43.2, 26.399998, 40.100002, 22.8, 36.3, 22.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.3, 35.9);
((GeneralPath)shape).curveTo(34.2, 35.9, 32.399998, 33.7, 32.399998, 30.900002);
((GeneralPath)shape).curveTo(32.399998, 28.100002, 34.1, 25.900002, 36.3, 25.900002);
((GeneralPath)shape).curveTo(38.399998, 25.900002, 40.2, 28.100002, 40.2, 30.900002);
((GeneralPath)shape).curveTo(40.100002, 33.600002, 38.4, 35.9, 36.3, 35.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
paint = new LinearGradientPaint(new Point2D.Double(20.75, 38.97600173950195), new Point2D.Double(20.75, 22.783000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.3, 37.4);
((GeneralPath)shape).lineTo(22.3, 24.3);
((GeneralPath)shape).curveTo(22.3, 23.4, 21.599998, 22.8, 20.8, 22.8);
((GeneralPath)shape).curveTo(19.9, 22.8, 19.3, 23.5, 19.3, 24.3);
((GeneralPath)shape).lineTo(19.3, 37.4);
((GeneralPath)shape).curveTo(19.3, 38.300003, 20.0, 38.9, 20.8, 38.9);
((GeneralPath)shape).curveTo(21.599998, 39.0, 22.3, 38.300003, 22.3, 37.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(20.75, 39.47600173950195), new Point2D.Double(20.75, 22.283000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.3, 37.4);
((GeneralPath)shape).lineTo(22.3, 24.3);
((GeneralPath)shape).curveTo(22.3, 23.4, 21.599998, 22.8, 20.8, 22.8);
((GeneralPath)shape).curveTo(19.9, 22.8, 19.3, 23.5, 19.3, 24.3);
((GeneralPath)shape).lineTo(19.3, 37.4);
((GeneralPath)shape).curveTo(19.3, 38.300003, 20.0, 38.9, 20.8, 38.9);
((GeneralPath)shape).curveTo(21.599998, 39.0, 22.3, 38.300003, 22.3, 37.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
paint = new LinearGradientPaint(new Point2D.Double(20.75, 62.64899826049805), new Point2D.Double(20.75, 46.457000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.7, 46.5);
((GeneralPath)shape).curveTo(16.900002, 46.5, 13.800001, 50.1, 13.800001, 54.6);
((GeneralPath)shape).curveTo(13.800001, 59.1, 16.900002, 62.699997, 20.7, 62.699997);
((GeneralPath)shape).curveTo(24.5, 62.699997, 27.6, 59.1, 27.6, 54.6);
((GeneralPath)shape).curveTo(27.7, 50.1, 24.6, 46.5, 20.7, 46.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(20.7, 59.6);
((GeneralPath)shape).curveTo(18.6, 59.6, 16.800001, 57.399998, 16.800001, 54.6);
((GeneralPath)shape).curveTo(16.800001, 51.8, 18.500002, 49.6, 20.7, 49.6);
((GeneralPath)shape).curveTo(22.9, 49.6, 24.6, 51.8, 24.6, 54.6);
((GeneralPath)shape).curveTo(24.6, 57.3, 22.9, 59.6, 20.7, 59.6);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(20.75, 63.14899826049805), new Point2D.Double(20.75, 45.957000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.7, 46.5);
((GeneralPath)shape).curveTo(16.900002, 46.5, 13.800001, 50.1, 13.800001, 54.6);
((GeneralPath)shape).curveTo(13.800001, 59.1, 16.900002, 62.699997, 20.7, 62.699997);
((GeneralPath)shape).curveTo(24.5, 62.699997, 27.6, 59.1, 27.6, 54.6);
((GeneralPath)shape).curveTo(27.7, 50.1, 24.6, 46.5, 20.7, 46.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(20.7, 59.6);
((GeneralPath)shape).curveTo(18.6, 59.6, 16.800001, 57.399998, 16.800001, 54.6);
((GeneralPath)shape).curveTo(16.800001, 51.8, 18.500002, 49.6, 20.7, 49.6);
((GeneralPath)shape).curveTo(22.9, 49.6, 24.6, 51.8, 24.6, 54.6);
((GeneralPath)shape).curveTo(24.6, 57.3, 22.9, 59.6, 20.7, 59.6);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_3
paint = new LinearGradientPaint(new Point2D.Double(36.29399871826172, 62.64899826049805), new Point2D.Double(36.29399871826172, 46.457000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(37.8, 61.1);
((GeneralPath)shape).lineTo(37.8, 48.0);
((GeneralPath)shape).curveTo(37.8, 47.1, 37.1, 46.5, 36.3, 46.5);
((GeneralPath)shape).curveTo(35.399998, 46.5, 34.8, 47.2, 34.8, 48.0);
((GeneralPath)shape).lineTo(34.8, 61.1);
((GeneralPath)shape).curveTo(34.8, 62.0, 35.5, 62.6, 36.3, 62.6);
((GeneralPath)shape).curveTo(37.1, 62.6, 37.8, 62.0, 37.8, 61.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.29399871826172, 63.14899826049805), new Point2D.Double(36.29399871826172, 45.957000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(37.8, 61.1);
((GeneralPath)shape).lineTo(37.8, 48.0);
((GeneralPath)shape).curveTo(37.8, 47.1, 37.1, 46.5, 36.3, 46.5);
((GeneralPath)shape).curveTo(35.399998, 46.5, 34.8, 47.2, 34.8, 48.0);
((GeneralPath)shape).lineTo(34.8, 61.1);
((GeneralPath)shape).curveTo(34.8, 62.0, 35.5, 62.6, 36.3, 62.6);
((GeneralPath)shape).curveTo(37.1, 62.6, 37.8, 62.0, 37.8, 61.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4
paint = new LinearGradientPaint(new Point2D.Double(52.250999450683594, 40.11000061035156), new Point2D.Double(52.250999450683594, 23.917999267578125), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(53.8, 38.6);
((GeneralPath)shape).lineTo(53.8, 25.5);
((GeneralPath)shape).curveTo(53.8, 24.6, 53.1, 24.0, 52.3, 24.0);
((GeneralPath)shape).curveTo(51.399998, 24.0, 50.8, 24.7, 50.8, 25.5);
((GeneralPath)shape).lineTo(50.8, 38.6);
((GeneralPath)shape).curveTo(50.8, 39.5, 51.5, 40.1, 52.3, 40.1);
((GeneralPath)shape).curveTo(53.1, 40.1, 53.8, 39.399998, 53.8, 38.6);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(52.250999450683594, 40.61000061035156), new Point2D.Double(52.250999450683594, 23.417999267578125), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(53.8, 38.6);
((GeneralPath)shape).lineTo(53.8, 25.5);
((GeneralPath)shape).curveTo(53.8, 24.6, 53.1, 24.0, 52.3, 24.0);
((GeneralPath)shape).curveTo(51.399998, 24.0, 50.8, 24.7, 50.8, 25.5);
((GeneralPath)shape).lineTo(50.8, 38.6);
((GeneralPath)shape).curveTo(50.8, 39.5, 51.5, 40.1, 52.3, 40.1);
((GeneralPath)shape).curveTo(53.1, 40.1, 53.8, 39.399998, 53.8, 38.6);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_5
paint = new LinearGradientPaint(new Point2D.Double(52.250999450683594, 63.78300094604492), new Point2D.Double(52.250999450683594, 47.590999603271484), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(52.3, 47.6);
((GeneralPath)shape).curveTo(48.5, 47.6, 45.399998, 51.199997, 45.399998, 55.699997);
((GeneralPath)shape).curveTo(45.399998, 60.199997, 48.499996, 63.799995, 52.3, 63.799995);
((GeneralPath)shape).curveTo(56.100002, 63.799995, 59.2, 60.199997, 59.2, 55.699997);
((GeneralPath)shape).curveTo(59.2, 51.199997, 56.100002, 47.6, 52.3, 47.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.3, 60.699997);
((GeneralPath)shape).curveTo(50.2, 60.699997, 48.399998, 58.499996, 48.399998, 55.699997);
((GeneralPath)shape).curveTo(48.399998, 52.899998, 50.1, 50.699997, 52.3, 50.699997);
((GeneralPath)shape).curveTo(54.5, 50.699997, 56.2, 52.899998, 56.2, 55.699997);
((GeneralPath)shape).curveTo(56.100002, 58.499996, 54.4, 60.699997, 52.3, 60.699997);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(52.250999450683594, 64.28299713134766), new Point2D.Double(52.250999450683594, 47.090999603271484), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(52.3, 47.6);
((GeneralPath)shape).curveTo(48.5, 47.6, 45.399998, 51.199997, 45.399998, 55.699997);
((GeneralPath)shape).curveTo(45.399998, 60.199997, 48.499996, 63.799995, 52.3, 63.799995);
((GeneralPath)shape).curveTo(56.100002, 63.799995, 59.2, 60.199997, 59.2, 55.699997);
((GeneralPath)shape).curveTo(59.2, 51.199997, 56.100002, 47.6, 52.3, 47.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.3, 60.699997);
((GeneralPath)shape).curveTo(50.2, 60.699997, 48.399998, 58.499996, 48.399998, 55.699997);
((GeneralPath)shape).curveTo(48.399998, 52.899998, 50.1, 50.699997, 52.3, 50.699997);
((GeneralPath)shape).curveTo(54.5, 50.699997, 56.2, 52.899998, 56.2, 55.699997);
((GeneralPath)shape).curveTo(56.100002, 58.499996, 54.4, 60.699997, 52.3, 60.699997);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_5);
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
((GeneralPath)shape).moveTo(14.0, 71.5);
((GeneralPath)shape).lineTo(22.0, 71.5);
((GeneralPath)shape).curveTo(23.6, 71.5, 24.8, 71.6, 25.5, 71.7);
((GeneralPath)shape).curveTo(26.2, 71.799995, 27.0, 72.1, 27.6, 72.5);
((GeneralPath)shape).curveTo(28.2, 72.9, 28.7, 73.5, 29.1, 74.2);
((GeneralPath)shape).curveTo(29.5, 74.899994, 29.7, 75.7, 29.7, 76.5);
((GeneralPath)shape).curveTo(29.7, 77.4, 29.400002, 78.3, 28.900002, 79.1);
((GeneralPath)shape).curveTo(28.400002, 79.899994, 27.7, 80.5, 26.800001, 80.9);
((GeneralPath)shape).curveTo(28.000002, 81.3, 29.000002, 81.9, 29.6, 82.700005);
((GeneralPath)shape).curveTo(30.199999, 83.50001, 30.6, 84.600006, 30.6, 85.700005);
((GeneralPath)shape).curveTo(30.6, 86.600006, 30.4, 87.50001, 30.0, 88.4);
((GeneralPath)shape).curveTo(29.6, 89.299995, 29.0, 89.9, 28.3, 90.5);
((GeneralPath)shape).curveTo(27.599998, 91.0, 26.699999, 91.3, 25.599998, 91.5);
((GeneralPath)shape).curveTo(24.899998, 91.6, 23.3, 91.6, 20.699999, 91.6);
((GeneralPath)shape).lineTo(14.0, 91.6);
((GeneralPath)shape).lineTo(14.0, 71.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.1, 74.8);
((GeneralPath)shape).lineTo(18.1, 79.4);
((GeneralPath)shape).lineTo(20.800001, 79.4);
((GeneralPath)shape).curveTo(22.400002, 79.4, 23.400002, 79.4, 23.7, 79.3);
((GeneralPath)shape).curveTo(24.400002, 79.200005, 24.900002, 79.0, 25.300001, 78.600006);
((GeneralPath)shape).curveTo(25.7, 78.20001, 25.900002, 77.700005, 25.900002, 77.00001);
((GeneralPath)shape).curveTo(25.900002, 76.40001, 25.7, 75.90001, 25.400002, 75.50001);
((GeneralPath)shape).curveTo(25.100002, 75.100006, 24.500002, 74.90001, 23.900002, 74.80001);
((GeneralPath)shape).curveTo(23.500002, 74.80001, 22.300001, 74.70001, 20.400002, 74.70001);
((GeneralPath)shape).lineTo(18.100002, 74.70001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.1, 82.8);
((GeneralPath)shape).lineTo(18.1, 88.200005);
((GeneralPath)shape).lineTo(21.800001, 88.200005);
((GeneralPath)shape).curveTo(23.300001, 88.200005, 24.2, 88.200005, 24.6, 88.100006);
((GeneralPath)shape).curveTo(25.2, 88.00001, 25.7, 87.700005, 26.1, 87.3);
((GeneralPath)shape).curveTo(26.5, 86.9, 26.7, 86.3, 26.7, 85.600006);
((GeneralPath)shape).curveTo(26.7, 85.00001, 26.6, 84.50001, 26.300001, 84.100006);
((GeneralPath)shape).curveTo(26.000002, 83.700005, 25.6, 83.40001, 25.000002, 83.200005);
((GeneralPath)shape).curveTo(24.400002, 83.00001, 23.300001, 82.9, 21.400002, 82.9);
((GeneralPath)shape).lineTo(18.100002, 82.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(34.1, 91.5);
((GeneralPath)shape).lineTo(34.1, 71.5);
((GeneralPath)shape).lineTo(38.1, 71.5);
((GeneralPath)shape).lineTo(38.1, 91.5);
((GeneralPath)shape).lineTo(34.1, 91.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.1, 91.5);
((GeneralPath)shape).lineTo(42.1, 71.5);
((GeneralPath)shape).lineTo(46.0, 71.5);
((GeneralPath)shape).lineTo(54.2, 84.9);
((GeneralPath)shape).lineTo(54.2, 71.5);
((GeneralPath)shape).lineTo(58.0, 71.5);
((GeneralPath)shape).lineTo(58.0, 91.5);
((GeneralPath)shape).lineTo(53.9, 91.5);
((GeneralPath)shape).lineTo(45.800003, 78.4);
((GeneralPath)shape).lineTo(45.800003, 91.5);
((GeneralPath)shape).lineTo(42.100002, 91.5);
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
	private ext_bin() {
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
       ext_bin base = new ext_bin();
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
       ext_bin base = new ext_bin();
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
        return () -> new ext_bin();
    }
}

