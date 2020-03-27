package org.pushingpixels.demo.substance.main.check.svg.flags;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class us implements ResizableIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
transformsStack.push(g.getTransform());
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(3.938499927520752f, 0.0f, 0.0f, 3.938499927520752f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0, 0.0);
generalPath.lineTo(247.0, 0.0);
generalPath.lineTo(247.0, 10.0);
generalPath.lineTo(0.0, 10.0);
generalPath.closePath();
generalPath.moveTo(0.0, 20.0);
generalPath.lineTo(247.0, 20.0);
generalPath.lineTo(247.0, 30.0);
generalPath.lineTo(0.0, 30.0);
generalPath.closePath();
generalPath.moveTo(0.0, 40.0);
generalPath.lineTo(247.0, 40.0);
generalPath.lineTo(247.0, 50.0);
generalPath.lineTo(0.0, 50.0);
generalPath.closePath();
generalPath.moveTo(0.0, 60.0);
generalPath.lineTo(247.0, 60.0);
generalPath.lineTo(247.0, 70.0);
generalPath.lineTo(0.0, 70.0);
generalPath.closePath();
generalPath.moveTo(0.0, 80.0);
generalPath.lineTo(247.0, 80.0);
generalPath.lineTo(247.0, 90.0);
generalPath.lineTo(0.0, 90.0);
generalPath.closePath();
generalPath.moveTo(0.0, 100.0);
generalPath.lineTo(247.0, 100.0);
generalPath.lineTo(247.0, 110.0);
generalPath.lineTo(0.0, 110.0);
generalPath.closePath();
generalPath.moveTo(0.0, 120.0);
generalPath.lineTo(247.0, 120.0);
generalPath.lineTo(247.0, 130.0);
generalPath.lineTo(0.0, 130.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(189, 61, 68, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0, 10.0);
generalPath.lineTo(247.0, 10.0);
generalPath.lineTo(247.0, 20.0);
generalPath.lineTo(0.0, 20.0);
generalPath.closePath();
generalPath.moveTo(0.0, 30.0);
generalPath.lineTo(247.0, 30.0);
generalPath.lineTo(247.0, 40.0);
generalPath.lineTo(0.0, 40.0);
generalPath.closePath();
generalPath.moveTo(0.0, 50.0);
generalPath.lineTo(247.0, 50.0);
generalPath.lineTo(247.0, 60.0);
generalPath.lineTo(0.0, 60.0);
generalPath.closePath();
generalPath.moveTo(0.0, 70.0);
generalPath.lineTo(247.0, 70.0);
generalPath.lineTo(247.0, 80.0);
generalPath.lineTo(0.0, 80.0);
generalPath.closePath();
generalPath.moveTo(0.0, 90.0);
generalPath.lineTo(247.0, 90.0);
generalPath.lineTo(247.0, 100.0);
generalPath.lineTo(0.0, 100.0);
generalPath.closePath();
generalPath.moveTo(0.0, 110.0);
generalPath.lineTo(247.0, 110.0);
generalPath.lineTo(247.0, 120.0);
generalPath.lineTo(0.0, 120.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0, 0.0);
generalPath.lineTo(98.8, 0.0);
generalPath.lineTo(98.8, 70.0);
generalPath.lineTo(0.0, 70.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(25, 47, 93, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.233, 2.996);
generalPath.lineTo(9.132999, 5.763);
generalPath.lineTo(12.040999, 5.763);
generalPath.lineTo(9.688, 7.473);
generalPath.lineTo(10.587, 10.239);
generalPath.lineTo(8.233, 8.529);
generalPath.lineTo(5.88, 10.239);
generalPath.lineTo(6.7790003, 7.4730005);
generalPath.lineTo(4.425, 5.7630005);
generalPath.lineTo(7.335, 5.7630005);
generalPath.closePath();
generalPath.moveTo(24.699999, 2.996);
generalPath.lineTo(25.598999, 5.763);
generalPath.lineTo(28.508, 5.763);
generalPath.lineTo(26.154999, 7.473);
generalPath.lineTo(27.053, 10.239);
generalPath.lineTo(24.7, 8.53);
generalPath.lineTo(22.347, 10.24);
generalPath.lineTo(23.245, 7.474);
generalPath.lineTo(20.892, 5.764);
generalPath.lineTo(23.801, 5.764);
generalPath.closePath();
generalPath.moveTo(41.167, 2.996);
generalPath.lineTo(42.065998, 5.763);
generalPath.lineTo(44.975, 5.763);
generalPath.lineTo(42.621998, 7.473);
generalPath.lineTo(43.520996, 10.239);
generalPath.lineTo(41.166996, 8.529);
generalPath.lineTo(38.813995, 10.239);
generalPath.lineTo(39.712994, 7.4730005);
generalPath.lineTo(37.358994, 5.7630005);
generalPath.lineTo(40.268993, 5.7630005);
generalPath.closePath();
generalPath.moveTo(57.633, 2.996);
generalPath.lineTo(58.531998, 5.763);
generalPath.lineTo(61.440998, 5.763);
generalPath.lineTo(59.087997, 7.473);
generalPath.lineTo(59.986996, 10.239);
generalPath.lineTo(57.632996, 8.529);
generalPath.lineTo(55.279995, 10.239);
generalPath.lineTo(56.178993, 7.4730005);
generalPath.lineTo(53.824993, 5.7630005);
generalPath.lineTo(56.734993, 5.7630005);
generalPath.closePath();
generalPath.moveTo(74.1, 2.996);
generalPath.lineTo(74.999, 5.763);
generalPath.lineTo(77.908, 5.763);
generalPath.lineTo(75.554, 7.473);
generalPath.lineTo(76.454, 10.239);
generalPath.lineTo(74.1, 8.53);
generalPath.lineTo(71.747, 10.24);
generalPath.lineTo(72.645004, 7.474);
generalPath.lineTo(70.29201, 5.764);
generalPath.lineTo(73.201004, 5.764);
generalPath.closePath();
generalPath.moveTo(90.567, 2.996);
generalPath.lineTo(91.466, 5.763);
generalPath.lineTo(94.375, 5.763);
generalPath.lineTo(92.020996, 7.473);
generalPath.lineTo(92.921, 10.239);
generalPath.lineTo(90.567, 8.529);
generalPath.lineTo(88.214005, 10.239);
generalPath.lineTo(89.11201, 7.4730005);
generalPath.lineTo(86.75901, 5.7630005);
generalPath.lineTo(89.66801, 5.7630005);
generalPath.closePath();
generalPath.moveTo(16.467, 9.996);
generalPath.lineTo(17.366, 12.7630005);
generalPath.lineTo(20.275, 12.7630005);
generalPath.lineTo(17.921999, 14.473001);
generalPath.lineTo(18.82, 17.239);
generalPath.lineTo(16.467, 15.529);
generalPath.lineTo(14.113999, 17.239);
generalPath.lineTo(15.011999, 14.473001);
generalPath.lineTo(12.658999, 12.7630005);
generalPath.lineTo(15.567999, 12.7630005);
generalPath.closePath();
generalPath.moveTo(32.933, 9.996);
generalPath.lineTo(33.831997, 12.7630005);
generalPath.lineTo(36.740997, 12.7630005);
generalPath.lineTo(34.387997, 14.473001);
generalPath.lineTo(35.286995, 17.239);
generalPath.lineTo(32.932995, 15.529);
generalPath.lineTo(30.579994, 17.239);
generalPath.lineTo(31.478994, 14.473001);
generalPath.lineTo(29.124994, 12.7630005);
generalPath.lineTo(32.034996, 12.7630005);
generalPath.closePath();
generalPath.moveTo(49.399998, 9.996);
generalPath.lineTo(50.298996, 12.7630005);
generalPath.lineTo(53.207996, 12.7630005);
generalPath.lineTo(50.854996, 14.473001);
generalPath.lineTo(51.753994, 17.239);
generalPath.lineTo(49.399994, 15.529);
generalPath.lineTo(47.046993, 17.239);
generalPath.lineTo(47.94599, 14.473001);
generalPath.lineTo(45.59199, 12.7630005);
generalPath.lineTo(48.50199, 12.7630005);
generalPath.closePath();
generalPath.moveTo(65.867, 9.996);
generalPath.lineTo(66.766, 12.7630005);
generalPath.lineTo(69.674995, 12.7630005);
generalPath.lineTo(67.322, 14.473001);
generalPath.lineTo(68.22, 17.239);
generalPath.lineTo(65.867004, 15.529);
generalPath.lineTo(63.514004, 17.239);
generalPath.lineTo(64.413, 14.473001);
generalPath.lineTo(62.059002, 12.7630005);
generalPath.lineTo(64.969, 12.7630005);
generalPath.closePath();
generalPath.moveTo(82.33299, 9.996);
generalPath.lineTo(83.231995, 12.7630005);
generalPath.lineTo(86.14099, 12.7630005);
generalPath.lineTo(83.78699, 14.473001);
generalPath.lineTo(84.68699, 17.239);
generalPath.lineTo(82.33299, 15.529);
generalPath.lineTo(79.979996, 17.239);
generalPath.lineTo(80.878, 14.473001);
generalPath.lineTo(78.525, 12.7630005);
generalPath.lineTo(81.434, 12.7630005);
generalPath.closePath();
generalPath.moveTo(8.233, 16.996);
generalPath.lineTo(9.132999, 19.763);
generalPath.lineTo(12.040999, 19.763);
generalPath.lineTo(9.688, 21.473);
generalPath.lineTo(10.587, 24.239);
generalPath.lineTo(8.233, 22.529);
generalPath.lineTo(5.88, 24.238998);
generalPath.lineTo(6.7790003, 21.472998);
generalPath.lineTo(4.425, 19.762997);
generalPath.lineTo(7.335, 19.762997);
generalPath.closePath();
generalPath.moveTo(24.699999, 16.996);
generalPath.lineTo(25.598999, 19.763);
generalPath.lineTo(28.508, 19.763);
generalPath.lineTo(26.154999, 21.473);
generalPath.lineTo(27.053, 24.239);
generalPath.lineTo(24.699999, 22.529);
generalPath.lineTo(22.346998, 24.238998);
generalPath.lineTo(23.244999, 21.472998);
generalPath.lineTo(20.891998, 19.762997);
generalPath.lineTo(23.800999, 19.762997);
generalPath.closePath();
generalPath.moveTo(41.167, 16.996);
generalPath.lineTo(42.065998, 19.763);
generalPath.lineTo(44.975, 19.763);
generalPath.lineTo(42.621998, 21.473);
generalPath.lineTo(43.520996, 24.239);
generalPath.lineTo(41.166996, 22.529);
generalPath.lineTo(38.813995, 24.238998);
generalPath.lineTo(39.712994, 21.472998);
generalPath.lineTo(37.358994, 19.762997);
generalPath.lineTo(40.268993, 19.762997);
generalPath.closePath();
generalPath.moveTo(57.633, 16.996);
generalPath.lineTo(58.531998, 19.763);
generalPath.lineTo(61.440998, 19.763);
generalPath.lineTo(59.087997, 21.473);
generalPath.lineTo(59.986996, 24.239);
generalPath.lineTo(57.632996, 22.529);
generalPath.lineTo(55.279995, 24.238998);
generalPath.lineTo(56.178993, 21.472998);
generalPath.lineTo(53.824993, 19.762997);
generalPath.lineTo(56.734993, 19.762997);
generalPath.closePath();
generalPath.moveTo(74.1, 16.996);
generalPath.lineTo(74.999, 19.763);
generalPath.lineTo(77.908, 19.763);
generalPath.lineTo(75.554, 21.473);
generalPath.lineTo(76.454, 24.239);
generalPath.lineTo(74.100006, 22.529);
generalPath.lineTo(71.74701, 24.238998);
generalPath.lineTo(72.64501, 21.472998);
generalPath.lineTo(70.292015, 19.762997);
generalPath.lineTo(73.20101, 19.762997);
generalPath.closePath();
generalPath.moveTo(90.567, 16.996);
generalPath.lineTo(91.466, 19.763);
generalPath.lineTo(94.375, 19.763);
generalPath.lineTo(92.020996, 21.473);
generalPath.lineTo(92.921, 24.239);
generalPath.lineTo(90.567, 22.529);
generalPath.lineTo(88.214005, 24.238998);
generalPath.lineTo(89.11201, 21.472998);
generalPath.lineTo(86.75901, 19.762997);
generalPath.lineTo(89.66801, 19.762997);
generalPath.closePath();
generalPath.moveTo(16.467, 23.996);
generalPath.lineTo(17.366, 26.763);
generalPath.lineTo(20.275, 26.763);
generalPath.lineTo(17.921999, 28.473);
generalPath.lineTo(18.82, 31.239);
generalPath.lineTo(16.467, 29.529);
generalPath.lineTo(14.113999, 31.238998);
generalPath.lineTo(15.011999, 28.472998);
generalPath.lineTo(12.658999, 26.762997);
generalPath.lineTo(15.567999, 26.762997);
generalPath.closePath();
generalPath.moveTo(32.933, 23.996);
generalPath.lineTo(33.831997, 26.763);
generalPath.lineTo(36.740997, 26.763);
generalPath.lineTo(34.387997, 28.473);
generalPath.lineTo(35.286995, 31.239);
generalPath.lineTo(32.932995, 29.529);
generalPath.lineTo(30.579994, 31.238998);
generalPath.lineTo(31.478994, 28.472998);
generalPath.lineTo(29.124994, 26.762997);
generalPath.lineTo(32.034996, 26.762997);
generalPath.closePath();
generalPath.moveTo(49.399998, 23.996);
generalPath.lineTo(50.298996, 26.763);
generalPath.lineTo(53.207996, 26.763);
generalPath.lineTo(50.854996, 28.473);
generalPath.lineTo(51.753994, 31.239);
generalPath.lineTo(49.399994, 29.529);
generalPath.lineTo(47.046993, 31.238998);
generalPath.lineTo(47.94599, 28.472998);
generalPath.lineTo(45.59199, 26.762997);
generalPath.lineTo(48.50199, 26.762997);
generalPath.closePath();
generalPath.moveTo(65.867, 23.996);
generalPath.lineTo(66.766, 26.763);
generalPath.lineTo(69.674995, 26.763);
generalPath.lineTo(67.322, 28.473);
generalPath.lineTo(68.22, 31.239);
generalPath.lineTo(65.867004, 29.529);
generalPath.lineTo(63.514004, 31.238998);
generalPath.lineTo(64.413, 28.472998);
generalPath.lineTo(62.059002, 26.762997);
generalPath.lineTo(64.969, 26.762997);
generalPath.closePath();
generalPath.moveTo(82.33299, 23.996);
generalPath.lineTo(83.231995, 26.763);
generalPath.lineTo(86.14099, 26.763);
generalPath.lineTo(83.78699, 28.473);
generalPath.lineTo(84.68699, 31.239);
generalPath.lineTo(82.33299, 29.529);
generalPath.lineTo(79.979996, 31.238998);
generalPath.lineTo(80.878, 28.472998);
generalPath.lineTo(78.525, 26.762997);
generalPath.lineTo(81.434, 26.762997);
generalPath.closePath();
generalPath.moveTo(8.233, 30.996);
generalPath.lineTo(9.132999, 33.763);
generalPath.lineTo(12.040999, 33.763);
generalPath.lineTo(9.688, 35.473);
generalPath.lineTo(10.587, 38.239);
generalPath.lineTo(8.233, 36.529);
generalPath.lineTo(5.88, 38.239);
generalPath.lineTo(6.7790003, 35.473);
generalPath.lineTo(4.425, 33.763);
generalPath.lineTo(7.335, 33.763);
generalPath.closePath();
generalPath.moveTo(24.699999, 30.996);
generalPath.lineTo(25.598999, 33.763);
generalPath.lineTo(28.508, 33.763);
generalPath.lineTo(26.154999, 35.473);
generalPath.lineTo(27.053, 38.239);
generalPath.lineTo(24.699999, 36.529);
generalPath.lineTo(22.346998, 38.239);
generalPath.lineTo(23.244999, 35.473);
generalPath.lineTo(20.891998, 33.763);
generalPath.lineTo(23.800999, 33.763);
generalPath.closePath();
generalPath.moveTo(41.167, 30.996);
generalPath.lineTo(42.065998, 33.763);
generalPath.lineTo(44.975, 33.763);
generalPath.lineTo(42.621998, 35.473);
generalPath.lineTo(43.520996, 38.239);
generalPath.lineTo(41.166996, 36.529);
generalPath.lineTo(38.813995, 38.239);
generalPath.lineTo(39.712994, 35.473);
generalPath.lineTo(37.358994, 33.763);
generalPath.lineTo(40.268993, 33.763);
generalPath.closePath();
generalPath.moveTo(57.633, 30.996);
generalPath.lineTo(58.531998, 33.763);
generalPath.lineTo(61.440998, 33.763);
generalPath.lineTo(59.087997, 35.473);
generalPath.lineTo(59.986996, 38.239);
generalPath.lineTo(57.632996, 36.529);
generalPath.lineTo(55.279995, 38.239);
generalPath.lineTo(56.178993, 35.473);
generalPath.lineTo(53.824993, 33.763);
generalPath.lineTo(56.734993, 33.763);
generalPath.closePath();
generalPath.moveTo(74.1, 30.996);
generalPath.lineTo(74.999, 33.763);
generalPath.lineTo(77.908, 33.763);
generalPath.lineTo(75.554, 35.473);
generalPath.lineTo(76.454, 38.239);
generalPath.lineTo(74.100006, 36.529);
generalPath.lineTo(71.74701, 38.239);
generalPath.lineTo(72.64501, 35.473);
generalPath.lineTo(70.292015, 33.763);
generalPath.lineTo(73.20101, 33.763);
generalPath.closePath();
generalPath.moveTo(90.567, 30.996);
generalPath.lineTo(91.466, 33.763);
generalPath.lineTo(94.375, 33.763);
generalPath.lineTo(92.020996, 35.473);
generalPath.lineTo(92.921, 38.239);
generalPath.lineTo(90.567, 36.529);
generalPath.lineTo(88.214005, 38.239);
generalPath.lineTo(89.11201, 35.473);
generalPath.lineTo(86.75901, 33.763);
generalPath.lineTo(89.66801, 33.763);
generalPath.closePath();
generalPath.moveTo(16.467, 37.996);
generalPath.lineTo(17.366, 40.762997);
generalPath.lineTo(20.275, 40.762997);
generalPath.lineTo(17.921999, 42.472996);
generalPath.lineTo(18.82, 45.238995);
generalPath.lineTo(16.467, 43.528996);
generalPath.lineTo(14.113999, 45.238995);
generalPath.lineTo(15.011999, 42.472996);
generalPath.lineTo(12.658999, 40.762997);
generalPath.lineTo(15.567999, 40.762997);
generalPath.closePath();
generalPath.moveTo(32.933, 37.996);
generalPath.lineTo(33.831997, 40.762997);
generalPath.lineTo(36.740997, 40.762997);
generalPath.lineTo(34.387997, 42.472996);
generalPath.lineTo(35.286995, 45.238995);
generalPath.lineTo(32.932995, 43.528996);
generalPath.lineTo(30.579994, 45.238995);
generalPath.lineTo(31.478994, 42.472996);
generalPath.lineTo(29.124994, 40.762997);
generalPath.lineTo(32.034996, 40.762997);
generalPath.closePath();
generalPath.moveTo(49.399998, 37.996);
generalPath.lineTo(50.298996, 40.762997);
generalPath.lineTo(53.207996, 40.762997);
generalPath.lineTo(50.854996, 42.472996);
generalPath.lineTo(51.753994, 45.238995);
generalPath.lineTo(49.399994, 43.528996);
generalPath.lineTo(47.046993, 45.238995);
generalPath.lineTo(47.94599, 42.472996);
generalPath.lineTo(45.59199, 40.762997);
generalPath.lineTo(48.50199, 40.762997);
generalPath.closePath();
generalPath.moveTo(65.867, 37.996);
generalPath.lineTo(66.766, 40.762997);
generalPath.lineTo(69.674995, 40.762997);
generalPath.lineTo(67.322, 42.472996);
generalPath.lineTo(68.22, 45.238995);
generalPath.lineTo(65.867004, 43.528996);
generalPath.lineTo(63.514004, 45.238995);
generalPath.lineTo(64.413, 42.472996);
generalPath.lineTo(62.059002, 40.762997);
generalPath.lineTo(64.969, 40.762997);
generalPath.closePath();
generalPath.moveTo(82.33299, 37.996);
generalPath.lineTo(83.231995, 40.762997);
generalPath.lineTo(86.14099, 40.762997);
generalPath.lineTo(83.78699, 42.472996);
generalPath.lineTo(84.68699, 45.238995);
generalPath.lineTo(82.33299, 43.528996);
generalPath.lineTo(79.979996, 45.238995);
generalPath.lineTo(80.878, 42.472996);
generalPath.lineTo(78.525, 40.762997);
generalPath.lineTo(81.434, 40.762997);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.233, 44.996);
generalPath.lineTo(9.132999, 47.762997);
generalPath.lineTo(12.040999, 47.762997);
generalPath.lineTo(9.688, 49.472996);
generalPath.lineTo(10.587, 52.238995);
generalPath.lineTo(8.233, 50.528996);
generalPath.lineTo(5.88, 52.238995);
generalPath.lineTo(6.7790003, 49.472996);
generalPath.lineTo(4.425, 47.762997);
generalPath.lineTo(7.335, 47.762997);
generalPath.closePath();
generalPath.moveTo(24.699999, 44.996);
generalPath.lineTo(25.598999, 47.762997);
generalPath.lineTo(28.508, 47.762997);
generalPath.lineTo(26.154999, 49.472996);
generalPath.lineTo(27.053, 52.238995);
generalPath.lineTo(24.699999, 50.528996);
generalPath.lineTo(22.346998, 52.238995);
generalPath.lineTo(23.244999, 49.472996);
generalPath.lineTo(20.891998, 47.762997);
generalPath.lineTo(23.800999, 47.762997);
generalPath.closePath();
generalPath.moveTo(41.167, 44.996);
generalPath.lineTo(42.065998, 47.762997);
generalPath.lineTo(44.975, 47.762997);
generalPath.lineTo(42.621998, 49.472996);
generalPath.lineTo(43.520996, 52.238995);
generalPath.lineTo(41.166996, 50.528996);
generalPath.lineTo(38.813995, 52.238995);
generalPath.lineTo(39.712994, 49.472996);
generalPath.lineTo(37.358994, 47.762997);
generalPath.lineTo(40.268993, 47.762997);
generalPath.closePath();
generalPath.moveTo(57.633, 44.996);
generalPath.lineTo(58.531998, 47.762997);
generalPath.lineTo(61.440998, 47.762997);
generalPath.lineTo(59.087997, 49.472996);
generalPath.lineTo(59.986996, 52.238995);
generalPath.lineTo(57.632996, 50.528996);
generalPath.lineTo(55.279995, 52.238995);
generalPath.lineTo(56.178993, 49.472996);
generalPath.lineTo(53.824993, 47.762997);
generalPath.lineTo(56.734993, 47.762997);
generalPath.closePath();
generalPath.moveTo(74.1, 44.996);
generalPath.lineTo(74.999, 47.762997);
generalPath.lineTo(77.908, 47.762997);
generalPath.lineTo(75.554, 49.472996);
generalPath.lineTo(76.454, 52.238995);
generalPath.lineTo(74.100006, 50.528996);
generalPath.lineTo(71.74701, 52.238995);
generalPath.lineTo(72.64501, 49.472996);
generalPath.lineTo(70.292015, 47.762997);
generalPath.lineTo(73.20101, 47.762997);
generalPath.closePath();
generalPath.moveTo(90.567, 44.996);
generalPath.lineTo(91.466, 47.762997);
generalPath.lineTo(94.375, 47.762997);
generalPath.lineTo(92.020996, 49.472996);
generalPath.lineTo(92.921, 52.238995);
generalPath.lineTo(90.567, 50.528996);
generalPath.lineTo(88.214005, 52.238995);
generalPath.lineTo(89.11201, 49.472996);
generalPath.lineTo(86.75901, 47.762997);
generalPath.lineTo(89.66801, 47.762997);
generalPath.closePath();
generalPath.moveTo(16.467, 51.996);
generalPath.lineTo(17.366, 54.762997);
generalPath.lineTo(20.275, 54.762997);
generalPath.lineTo(17.921999, 56.472996);
generalPath.lineTo(18.82, 59.238995);
generalPath.lineTo(16.467, 57.528996);
generalPath.lineTo(14.113999, 59.238995);
generalPath.lineTo(15.011999, 56.472996);
generalPath.lineTo(12.658999, 54.762997);
generalPath.lineTo(15.567999, 54.762997);
generalPath.closePath();
generalPath.moveTo(32.933, 51.996);
generalPath.lineTo(33.831997, 54.762997);
generalPath.lineTo(36.740997, 54.762997);
generalPath.lineTo(34.387997, 56.472996);
generalPath.lineTo(35.286995, 59.238995);
generalPath.lineTo(32.932995, 57.528996);
generalPath.lineTo(30.579994, 59.238995);
generalPath.lineTo(31.478994, 56.472996);
generalPath.lineTo(29.124994, 54.762997);
generalPath.lineTo(32.034996, 54.762997);
generalPath.closePath();
generalPath.moveTo(49.399998, 51.996);
generalPath.lineTo(50.298996, 54.762997);
generalPath.lineTo(53.207996, 54.762997);
generalPath.lineTo(50.854996, 56.472996);
generalPath.lineTo(51.753994, 59.238995);
generalPath.lineTo(49.399994, 57.528996);
generalPath.lineTo(47.046993, 59.238995);
generalPath.lineTo(47.94599, 56.472996);
generalPath.lineTo(45.59199, 54.762997);
generalPath.lineTo(48.50199, 54.762997);
generalPath.closePath();
generalPath.moveTo(65.867, 51.996);
generalPath.lineTo(66.766, 54.762997);
generalPath.lineTo(69.674995, 54.762997);
generalPath.lineTo(67.322, 56.472996);
generalPath.lineTo(68.22, 59.238995);
generalPath.lineTo(65.867004, 57.528996);
generalPath.lineTo(63.514004, 59.238995);
generalPath.lineTo(64.413, 56.472996);
generalPath.lineTo(62.059002, 54.762997);
generalPath.lineTo(64.969, 54.762997);
generalPath.closePath();
generalPath.moveTo(82.33299, 51.996);
generalPath.lineTo(83.231995, 54.762997);
generalPath.lineTo(86.14099, 54.762997);
generalPath.lineTo(83.78699, 56.472996);
generalPath.lineTo(84.68699, 59.238995);
generalPath.lineTo(82.33299, 57.528996);
generalPath.lineTo(79.979996, 59.238995);
generalPath.lineTo(80.878, 56.472996);
generalPath.lineTo(78.525, 54.762997);
generalPath.lineTo(81.434, 54.762997);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.233, 58.996);
generalPath.lineTo(9.132999, 61.762997);
generalPath.lineTo(12.040999, 61.762997);
generalPath.lineTo(9.688, 63.472996);
generalPath.lineTo(10.587, 66.239);
generalPath.lineTo(8.233, 64.529);
generalPath.lineTo(5.88, 66.239);
generalPath.lineTo(6.7790003, 63.473);
generalPath.lineTo(4.425, 61.763);
generalPath.lineTo(7.335, 61.763);
generalPath.closePath();
generalPath.moveTo(24.699999, 58.996);
generalPath.lineTo(25.598999, 61.762997);
generalPath.lineTo(28.508, 61.762997);
generalPath.lineTo(26.154999, 63.472996);
generalPath.lineTo(27.053, 66.239);
generalPath.lineTo(24.699999, 64.529);
generalPath.lineTo(22.346998, 66.239);
generalPath.lineTo(23.244999, 63.473);
generalPath.lineTo(20.891998, 61.763);
generalPath.lineTo(23.800999, 61.763);
generalPath.closePath();
generalPath.moveTo(41.167, 58.996);
generalPath.lineTo(42.065998, 61.762997);
generalPath.lineTo(44.975, 61.762997);
generalPath.lineTo(42.621998, 63.472996);
generalPath.lineTo(43.520996, 66.239);
generalPath.lineTo(41.166996, 64.529);
generalPath.lineTo(38.813995, 66.239);
generalPath.lineTo(39.712994, 63.473);
generalPath.lineTo(37.358994, 61.763);
generalPath.lineTo(40.268993, 61.763);
generalPath.closePath();
generalPath.moveTo(57.633, 58.996);
generalPath.lineTo(58.531998, 61.762997);
generalPath.lineTo(61.440998, 61.762997);
generalPath.lineTo(59.087997, 63.472996);
generalPath.lineTo(59.986996, 66.239);
generalPath.lineTo(57.632996, 64.529);
generalPath.lineTo(55.279995, 66.239);
generalPath.lineTo(56.178993, 63.473);
generalPath.lineTo(53.824993, 61.763);
generalPath.lineTo(56.734993, 61.763);
generalPath.closePath();
generalPath.moveTo(74.1, 58.996);
generalPath.lineTo(74.999, 61.762997);
generalPath.lineTo(77.908, 61.762997);
generalPath.lineTo(75.554, 63.472996);
generalPath.lineTo(76.454, 66.239);
generalPath.lineTo(74.100006, 64.529);
generalPath.lineTo(71.74701, 66.239);
generalPath.lineTo(72.64501, 63.473);
generalPath.lineTo(70.292015, 61.763);
generalPath.lineTo(73.20101, 61.763);
generalPath.closePath();
generalPath.moveTo(90.567, 58.996);
generalPath.lineTo(91.466, 61.762997);
generalPath.lineTo(94.375, 61.762997);
generalPath.lineTo(92.020996, 63.472996);
generalPath.lineTo(92.921, 66.239);
generalPath.lineTo(90.567, 64.529);
generalPath.lineTo(88.214005, 66.239);
generalPath.lineTo(89.11201, 63.473);
generalPath.lineTo(86.75901, 61.763);
generalPath.lineTo(89.66801, 61.763);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());

}



    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    _paint0(g, origAlpha);


	    shape = null;
	    generalPath = null;
	    paint = null;
	    stroke = null;
	    clip = null;
        transformsStack.clear();
	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.0;
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
		return 512.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 512.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private us() {
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
	public synchronized void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
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
       us base = new us();
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
       us base = new us();
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
        return us::new;
    }
}

