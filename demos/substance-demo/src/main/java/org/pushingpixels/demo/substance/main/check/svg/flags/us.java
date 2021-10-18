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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class us implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
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
generalPath.moveTo(0.0f, 0.0f);
generalPath.lineTo(247.0f, 0.0f);
generalPath.lineTo(247.0f, 10.0f);
generalPath.lineTo(0.0f, 10.0f);
generalPath.closePath();
generalPath.moveTo(0.0f, 20.0f);
generalPath.lineTo(247.0f, 20.0f);
generalPath.lineTo(247.0f, 30.0f);
generalPath.lineTo(0.0f, 30.0f);
generalPath.closePath();
generalPath.moveTo(0.0f, 40.0f);
generalPath.lineTo(247.0f, 40.0f);
generalPath.lineTo(247.0f, 50.0f);
generalPath.lineTo(0.0f, 50.0f);
generalPath.closePath();
generalPath.moveTo(0.0f, 60.0f);
generalPath.lineTo(247.0f, 60.0f);
generalPath.lineTo(247.0f, 70.0f);
generalPath.lineTo(0.0f, 70.0f);
generalPath.closePath();
generalPath.moveTo(0.0f, 80.0f);
generalPath.lineTo(247.0f, 80.0f);
generalPath.lineTo(247.0f, 90.0f);
generalPath.lineTo(0.0f, 90.0f);
generalPath.closePath();
generalPath.moveTo(0.0f, 100.0f);
generalPath.lineTo(247.0f, 100.0f);
generalPath.lineTo(247.0f, 110.0f);
generalPath.lineTo(0.0f, 110.0f);
generalPath.closePath();
generalPath.moveTo(0.0f, 120.0f);
generalPath.lineTo(247.0f, 120.0f);
generalPath.lineTo(247.0f, 130.0f);
generalPath.lineTo(0.0f, 130.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(189, 61, 68, 255)) : new Color(189, 61, 68, 255);
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
generalPath.moveTo(0.0f, 10.0f);
generalPath.lineTo(247.0f, 10.0f);
generalPath.lineTo(247.0f, 20.0f);
generalPath.lineTo(0.0f, 20.0f);
generalPath.closePath();
generalPath.moveTo(0.0f, 30.0f);
generalPath.lineTo(247.0f, 30.0f);
generalPath.lineTo(247.0f, 40.0f);
generalPath.lineTo(0.0f, 40.0f);
generalPath.closePath();
generalPath.moveTo(0.0f, 50.0f);
generalPath.lineTo(247.0f, 50.0f);
generalPath.lineTo(247.0f, 60.0f);
generalPath.lineTo(0.0f, 60.0f);
generalPath.closePath();
generalPath.moveTo(0.0f, 70.0f);
generalPath.lineTo(247.0f, 70.0f);
generalPath.lineTo(247.0f, 80.0f);
generalPath.lineTo(0.0f, 80.0f);
generalPath.closePath();
generalPath.moveTo(0.0f, 90.0f);
generalPath.lineTo(247.0f, 90.0f);
generalPath.lineTo(247.0f, 100.0f);
generalPath.lineTo(0.0f, 100.0f);
generalPath.closePath();
generalPath.moveTo(0.0f, 110.0f);
generalPath.lineTo(247.0f, 110.0f);
generalPath.lineTo(247.0f, 120.0f);
generalPath.lineTo(0.0f, 120.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(0.0f, 0.0f);
generalPath.lineTo(98.8f, 0.0f);
generalPath.lineTo(98.8f, 70.0f);
generalPath.lineTo(0.0f, 70.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(25, 47, 93, 255)) : new Color(25, 47, 93, 255);
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
generalPath.moveTo(8.233f, 2.996f);
generalPath.lineTo(9.132999f, 5.763f);
generalPath.lineTo(12.040999f, 5.763f);
generalPath.lineTo(9.688f, 7.473f);
generalPath.lineTo(10.587f, 10.239f);
generalPath.lineTo(8.233f, 8.529f);
generalPath.lineTo(5.88f, 10.239f);
generalPath.lineTo(6.7790003f, 7.4730005f);
generalPath.lineTo(4.425f, 5.7630005f);
generalPath.lineTo(7.335f, 5.7630005f);
generalPath.closePath();
generalPath.moveTo(24.699999f, 2.996f);
generalPath.lineTo(25.598999f, 5.763f);
generalPath.lineTo(28.508f, 5.763f);
generalPath.lineTo(26.154999f, 7.473f);
generalPath.lineTo(27.053f, 10.239f);
generalPath.lineTo(24.7f, 8.53f);
generalPath.lineTo(22.347f, 10.24f);
generalPath.lineTo(23.245f, 7.474f);
generalPath.lineTo(20.892f, 5.764f);
generalPath.lineTo(23.801f, 5.764f);
generalPath.closePath();
generalPath.moveTo(41.167f, 2.996f);
generalPath.lineTo(42.065998f, 5.763f);
generalPath.lineTo(44.975f, 5.763f);
generalPath.lineTo(42.621998f, 7.473f);
generalPath.lineTo(43.520996f, 10.239f);
generalPath.lineTo(41.166996f, 8.529f);
generalPath.lineTo(38.813995f, 10.239f);
generalPath.lineTo(39.712994f, 7.4730005f);
generalPath.lineTo(37.358994f, 5.7630005f);
generalPath.lineTo(40.268993f, 5.7630005f);
generalPath.closePath();
generalPath.moveTo(57.633f, 2.996f);
generalPath.lineTo(58.531998f, 5.763f);
generalPath.lineTo(61.440998f, 5.763f);
generalPath.lineTo(59.087997f, 7.473f);
generalPath.lineTo(59.986996f, 10.239f);
generalPath.lineTo(57.632996f, 8.529f);
generalPath.lineTo(55.279995f, 10.239f);
generalPath.lineTo(56.178993f, 7.4730005f);
generalPath.lineTo(53.824993f, 5.7630005f);
generalPath.lineTo(56.734993f, 5.7630005f);
generalPath.closePath();
generalPath.moveTo(74.1f, 2.996f);
generalPath.lineTo(74.999f, 5.763f);
generalPath.lineTo(77.908f, 5.763f);
generalPath.lineTo(75.554f, 7.473f);
generalPath.lineTo(76.454f, 10.239f);
generalPath.lineTo(74.1f, 8.53f);
generalPath.lineTo(71.747f, 10.24f);
generalPath.lineTo(72.645004f, 7.474f);
generalPath.lineTo(70.29201f, 5.764f);
generalPath.lineTo(73.201004f, 5.764f);
generalPath.closePath();
generalPath.moveTo(90.567f, 2.996f);
generalPath.lineTo(91.466f, 5.763f);
generalPath.lineTo(94.375f, 5.763f);
generalPath.lineTo(92.020996f, 7.473f);
generalPath.lineTo(92.921f, 10.239f);
generalPath.lineTo(90.567f, 8.529f);
generalPath.lineTo(88.214005f, 10.239f);
generalPath.lineTo(89.11201f, 7.4730005f);
generalPath.lineTo(86.75901f, 5.7630005f);
generalPath.lineTo(89.66801f, 5.7630005f);
generalPath.closePath();
generalPath.moveTo(16.467f, 9.996f);
generalPath.lineTo(17.366f, 12.7630005f);
generalPath.lineTo(20.275f, 12.7630005f);
generalPath.lineTo(17.921999f, 14.473001f);
generalPath.lineTo(18.82f, 17.239f);
generalPath.lineTo(16.467f, 15.529f);
generalPath.lineTo(14.113999f, 17.239f);
generalPath.lineTo(15.011999f, 14.473001f);
generalPath.lineTo(12.658999f, 12.7630005f);
generalPath.lineTo(15.567999f, 12.7630005f);
generalPath.closePath();
generalPath.moveTo(32.933f, 9.996f);
generalPath.lineTo(33.831997f, 12.7630005f);
generalPath.lineTo(36.740997f, 12.7630005f);
generalPath.lineTo(34.387997f, 14.473001f);
generalPath.lineTo(35.286995f, 17.239f);
generalPath.lineTo(32.932995f, 15.529f);
generalPath.lineTo(30.579994f, 17.239f);
generalPath.lineTo(31.478994f, 14.473001f);
generalPath.lineTo(29.124994f, 12.7630005f);
generalPath.lineTo(32.034996f, 12.7630005f);
generalPath.closePath();
generalPath.moveTo(49.399998f, 9.996f);
generalPath.lineTo(50.298996f, 12.7630005f);
generalPath.lineTo(53.207996f, 12.7630005f);
generalPath.lineTo(50.854996f, 14.473001f);
generalPath.lineTo(51.753994f, 17.239f);
generalPath.lineTo(49.399994f, 15.529f);
generalPath.lineTo(47.046993f, 17.239f);
generalPath.lineTo(47.94599f, 14.473001f);
generalPath.lineTo(45.59199f, 12.7630005f);
generalPath.lineTo(48.50199f, 12.7630005f);
generalPath.closePath();
generalPath.moveTo(65.867f, 9.996f);
generalPath.lineTo(66.766f, 12.7630005f);
generalPath.lineTo(69.674995f, 12.7630005f);
generalPath.lineTo(67.322f, 14.473001f);
generalPath.lineTo(68.22f, 17.239f);
generalPath.lineTo(65.867004f, 15.529f);
generalPath.lineTo(63.514004f, 17.239f);
generalPath.lineTo(64.413f, 14.473001f);
generalPath.lineTo(62.059002f, 12.7630005f);
generalPath.lineTo(64.969f, 12.7630005f);
generalPath.closePath();
generalPath.moveTo(82.33299f, 9.996f);
generalPath.lineTo(83.231995f, 12.7630005f);
generalPath.lineTo(86.14099f, 12.7630005f);
generalPath.lineTo(83.78699f, 14.473001f);
generalPath.lineTo(84.68699f, 17.239f);
generalPath.lineTo(82.33299f, 15.529f);
generalPath.lineTo(79.979996f, 17.239f);
generalPath.lineTo(80.878f, 14.473001f);
generalPath.lineTo(78.525f, 12.7630005f);
generalPath.lineTo(81.434f, 12.7630005f);
generalPath.closePath();
generalPath.moveTo(8.233f, 16.996f);
generalPath.lineTo(9.132999f, 19.763f);
generalPath.lineTo(12.040999f, 19.763f);
generalPath.lineTo(9.688f, 21.473f);
generalPath.lineTo(10.587f, 24.239f);
generalPath.lineTo(8.233f, 22.529f);
generalPath.lineTo(5.88f, 24.238998f);
generalPath.lineTo(6.7790003f, 21.472998f);
generalPath.lineTo(4.425f, 19.762997f);
generalPath.lineTo(7.335f, 19.762997f);
generalPath.closePath();
generalPath.moveTo(24.699999f, 16.996f);
generalPath.lineTo(25.598999f, 19.763f);
generalPath.lineTo(28.508f, 19.763f);
generalPath.lineTo(26.154999f, 21.473f);
generalPath.lineTo(27.053f, 24.239f);
generalPath.lineTo(24.699999f, 22.529f);
generalPath.lineTo(22.346998f, 24.238998f);
generalPath.lineTo(23.244999f, 21.472998f);
generalPath.lineTo(20.891998f, 19.762997f);
generalPath.lineTo(23.800999f, 19.762997f);
generalPath.closePath();
generalPath.moveTo(41.167f, 16.996f);
generalPath.lineTo(42.065998f, 19.763f);
generalPath.lineTo(44.975f, 19.763f);
generalPath.lineTo(42.621998f, 21.473f);
generalPath.lineTo(43.520996f, 24.239f);
generalPath.lineTo(41.166996f, 22.529f);
generalPath.lineTo(38.813995f, 24.238998f);
generalPath.lineTo(39.712994f, 21.472998f);
generalPath.lineTo(37.358994f, 19.762997f);
generalPath.lineTo(40.268993f, 19.762997f);
generalPath.closePath();
generalPath.moveTo(57.633f, 16.996f);
generalPath.lineTo(58.531998f, 19.763f);
generalPath.lineTo(61.440998f, 19.763f);
generalPath.lineTo(59.087997f, 21.473f);
generalPath.lineTo(59.986996f, 24.239f);
generalPath.lineTo(57.632996f, 22.529f);
generalPath.lineTo(55.279995f, 24.238998f);
generalPath.lineTo(56.178993f, 21.472998f);
generalPath.lineTo(53.824993f, 19.762997f);
generalPath.lineTo(56.734993f, 19.762997f);
generalPath.closePath();
generalPath.moveTo(74.1f, 16.996f);
generalPath.lineTo(74.999f, 19.763f);
generalPath.lineTo(77.908f, 19.763f);
generalPath.lineTo(75.554f, 21.473f);
generalPath.lineTo(76.454f, 24.239f);
generalPath.lineTo(74.100006f, 22.529f);
generalPath.lineTo(71.74701f, 24.238998f);
generalPath.lineTo(72.64501f, 21.472998f);
generalPath.lineTo(70.292015f, 19.762997f);
generalPath.lineTo(73.20101f, 19.762997f);
generalPath.closePath();
generalPath.moveTo(90.567f, 16.996f);
generalPath.lineTo(91.466f, 19.763f);
generalPath.lineTo(94.375f, 19.763f);
generalPath.lineTo(92.020996f, 21.473f);
generalPath.lineTo(92.921f, 24.239f);
generalPath.lineTo(90.567f, 22.529f);
generalPath.lineTo(88.214005f, 24.238998f);
generalPath.lineTo(89.11201f, 21.472998f);
generalPath.lineTo(86.75901f, 19.762997f);
generalPath.lineTo(89.66801f, 19.762997f);
generalPath.closePath();
generalPath.moveTo(16.467f, 23.996f);
generalPath.lineTo(17.366f, 26.763f);
generalPath.lineTo(20.275f, 26.763f);
generalPath.lineTo(17.921999f, 28.473f);
generalPath.lineTo(18.82f, 31.239f);
generalPath.lineTo(16.467f, 29.529f);
generalPath.lineTo(14.113999f, 31.238998f);
generalPath.lineTo(15.011999f, 28.472998f);
generalPath.lineTo(12.658999f, 26.762997f);
generalPath.lineTo(15.567999f, 26.762997f);
generalPath.closePath();
generalPath.moveTo(32.933f, 23.996f);
generalPath.lineTo(33.831997f, 26.763f);
generalPath.lineTo(36.740997f, 26.763f);
generalPath.lineTo(34.387997f, 28.473f);
generalPath.lineTo(35.286995f, 31.239f);
generalPath.lineTo(32.932995f, 29.529f);
generalPath.lineTo(30.579994f, 31.238998f);
generalPath.lineTo(31.478994f, 28.472998f);
generalPath.lineTo(29.124994f, 26.762997f);
generalPath.lineTo(32.034996f, 26.762997f);
generalPath.closePath();
generalPath.moveTo(49.399998f, 23.996f);
generalPath.lineTo(50.298996f, 26.763f);
generalPath.lineTo(53.207996f, 26.763f);
generalPath.lineTo(50.854996f, 28.473f);
generalPath.lineTo(51.753994f, 31.239f);
generalPath.lineTo(49.399994f, 29.529f);
generalPath.lineTo(47.046993f, 31.238998f);
generalPath.lineTo(47.94599f, 28.472998f);
generalPath.lineTo(45.59199f, 26.762997f);
generalPath.lineTo(48.50199f, 26.762997f);
generalPath.closePath();
generalPath.moveTo(65.867f, 23.996f);
generalPath.lineTo(66.766f, 26.763f);
generalPath.lineTo(69.674995f, 26.763f);
generalPath.lineTo(67.322f, 28.473f);
generalPath.lineTo(68.22f, 31.239f);
generalPath.lineTo(65.867004f, 29.529f);
generalPath.lineTo(63.514004f, 31.238998f);
generalPath.lineTo(64.413f, 28.472998f);
generalPath.lineTo(62.059002f, 26.762997f);
generalPath.lineTo(64.969f, 26.762997f);
generalPath.closePath();
generalPath.moveTo(82.33299f, 23.996f);
generalPath.lineTo(83.231995f, 26.763f);
generalPath.lineTo(86.14099f, 26.763f);
generalPath.lineTo(83.78699f, 28.473f);
generalPath.lineTo(84.68699f, 31.239f);
generalPath.lineTo(82.33299f, 29.529f);
generalPath.lineTo(79.979996f, 31.238998f);
generalPath.lineTo(80.878f, 28.472998f);
generalPath.lineTo(78.525f, 26.762997f);
generalPath.lineTo(81.434f, 26.762997f);
generalPath.closePath();
generalPath.moveTo(8.233f, 30.996f);
generalPath.lineTo(9.132999f, 33.763f);
generalPath.lineTo(12.040999f, 33.763f);
generalPath.lineTo(9.688f, 35.473f);
generalPath.lineTo(10.587f, 38.239f);
generalPath.lineTo(8.233f, 36.529f);
generalPath.lineTo(5.88f, 38.239f);
generalPath.lineTo(6.7790003f, 35.473f);
generalPath.lineTo(4.425f, 33.763f);
generalPath.lineTo(7.335f, 33.763f);
generalPath.closePath();
generalPath.moveTo(24.699999f, 30.996f);
generalPath.lineTo(25.598999f, 33.763f);
generalPath.lineTo(28.508f, 33.763f);
generalPath.lineTo(26.154999f, 35.473f);
generalPath.lineTo(27.053f, 38.239f);
generalPath.lineTo(24.699999f, 36.529f);
generalPath.lineTo(22.346998f, 38.239f);
generalPath.lineTo(23.244999f, 35.473f);
generalPath.lineTo(20.891998f, 33.763f);
generalPath.lineTo(23.800999f, 33.763f);
generalPath.closePath();
generalPath.moveTo(41.167f, 30.996f);
generalPath.lineTo(42.065998f, 33.763f);
generalPath.lineTo(44.975f, 33.763f);
generalPath.lineTo(42.621998f, 35.473f);
generalPath.lineTo(43.520996f, 38.239f);
generalPath.lineTo(41.166996f, 36.529f);
generalPath.lineTo(38.813995f, 38.239f);
generalPath.lineTo(39.712994f, 35.473f);
generalPath.lineTo(37.358994f, 33.763f);
generalPath.lineTo(40.268993f, 33.763f);
generalPath.closePath();
generalPath.moveTo(57.633f, 30.996f);
generalPath.lineTo(58.531998f, 33.763f);
generalPath.lineTo(61.440998f, 33.763f);
generalPath.lineTo(59.087997f, 35.473f);
generalPath.lineTo(59.986996f, 38.239f);
generalPath.lineTo(57.632996f, 36.529f);
generalPath.lineTo(55.279995f, 38.239f);
generalPath.lineTo(56.178993f, 35.473f);
generalPath.lineTo(53.824993f, 33.763f);
generalPath.lineTo(56.734993f, 33.763f);
generalPath.closePath();
generalPath.moveTo(74.1f, 30.996f);
generalPath.lineTo(74.999f, 33.763f);
generalPath.lineTo(77.908f, 33.763f);
generalPath.lineTo(75.554f, 35.473f);
generalPath.lineTo(76.454f, 38.239f);
generalPath.lineTo(74.100006f, 36.529f);
generalPath.lineTo(71.74701f, 38.239f);
generalPath.lineTo(72.64501f, 35.473f);
generalPath.lineTo(70.292015f, 33.763f);
generalPath.lineTo(73.20101f, 33.763f);
generalPath.closePath();
generalPath.moveTo(90.567f, 30.996f);
generalPath.lineTo(91.466f, 33.763f);
generalPath.lineTo(94.375f, 33.763f);
generalPath.lineTo(92.020996f, 35.473f);
generalPath.lineTo(92.921f, 38.239f);
generalPath.lineTo(90.567f, 36.529f);
generalPath.lineTo(88.214005f, 38.239f);
generalPath.lineTo(89.11201f, 35.473f);
generalPath.lineTo(86.75901f, 33.763f);
generalPath.lineTo(89.66801f, 33.763f);
generalPath.closePath();
generalPath.moveTo(16.467f, 37.996f);
generalPath.lineTo(17.366f, 40.762997f);
generalPath.lineTo(20.275f, 40.762997f);
generalPath.lineTo(17.921999f, 42.472996f);
generalPath.lineTo(18.82f, 45.238995f);
generalPath.lineTo(16.467f, 43.528996f);
generalPath.lineTo(14.113999f, 45.238995f);
generalPath.lineTo(15.011999f, 42.472996f);
generalPath.lineTo(12.658999f, 40.762997f);
generalPath.lineTo(15.567999f, 40.762997f);
generalPath.closePath();
generalPath.moveTo(32.933f, 37.996f);
generalPath.lineTo(33.831997f, 40.762997f);
generalPath.lineTo(36.740997f, 40.762997f);
generalPath.lineTo(34.387997f, 42.472996f);
generalPath.lineTo(35.286995f, 45.238995f);
generalPath.lineTo(32.932995f, 43.528996f);
generalPath.lineTo(30.579994f, 45.238995f);
generalPath.lineTo(31.478994f, 42.472996f);
generalPath.lineTo(29.124994f, 40.762997f);
generalPath.lineTo(32.034996f, 40.762997f);
generalPath.closePath();
generalPath.moveTo(49.399998f, 37.996f);
generalPath.lineTo(50.298996f, 40.762997f);
generalPath.lineTo(53.207996f, 40.762997f);
generalPath.lineTo(50.854996f, 42.472996f);
generalPath.lineTo(51.753994f, 45.238995f);
generalPath.lineTo(49.399994f, 43.528996f);
generalPath.lineTo(47.046993f, 45.238995f);
generalPath.lineTo(47.94599f, 42.472996f);
generalPath.lineTo(45.59199f, 40.762997f);
generalPath.lineTo(48.50199f, 40.762997f);
generalPath.closePath();
generalPath.moveTo(65.867f, 37.996f);
generalPath.lineTo(66.766f, 40.762997f);
generalPath.lineTo(69.674995f, 40.762997f);
generalPath.lineTo(67.322f, 42.472996f);
generalPath.lineTo(68.22f, 45.238995f);
generalPath.lineTo(65.867004f, 43.528996f);
generalPath.lineTo(63.514004f, 45.238995f);
generalPath.lineTo(64.413f, 42.472996f);
generalPath.lineTo(62.059002f, 40.762997f);
generalPath.lineTo(64.969f, 40.762997f);
generalPath.closePath();
generalPath.moveTo(82.33299f, 37.996f);
generalPath.lineTo(83.231995f, 40.762997f);
generalPath.lineTo(86.14099f, 40.762997f);
generalPath.lineTo(83.78699f, 42.472996f);
generalPath.lineTo(84.68699f, 45.238995f);
generalPath.lineTo(82.33299f, 43.528996f);
generalPath.lineTo(79.979996f, 45.238995f);
generalPath.lineTo(80.878f, 42.472996f);
generalPath.lineTo(78.525f, 40.762997f);
generalPath.lineTo(81.434f, 40.762997f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(8.233f, 44.996f);
generalPath.lineTo(9.132999f, 47.762997f);
generalPath.lineTo(12.040999f, 47.762997f);
generalPath.lineTo(9.688f, 49.472996f);
generalPath.lineTo(10.587f, 52.238995f);
generalPath.lineTo(8.233f, 50.528996f);
generalPath.lineTo(5.88f, 52.238995f);
generalPath.lineTo(6.7790003f, 49.472996f);
generalPath.lineTo(4.425f, 47.762997f);
generalPath.lineTo(7.335f, 47.762997f);
generalPath.closePath();
generalPath.moveTo(24.699999f, 44.996f);
generalPath.lineTo(25.598999f, 47.762997f);
generalPath.lineTo(28.508f, 47.762997f);
generalPath.lineTo(26.154999f, 49.472996f);
generalPath.lineTo(27.053f, 52.238995f);
generalPath.lineTo(24.699999f, 50.528996f);
generalPath.lineTo(22.346998f, 52.238995f);
generalPath.lineTo(23.244999f, 49.472996f);
generalPath.lineTo(20.891998f, 47.762997f);
generalPath.lineTo(23.800999f, 47.762997f);
generalPath.closePath();
generalPath.moveTo(41.167f, 44.996f);
generalPath.lineTo(42.065998f, 47.762997f);
generalPath.lineTo(44.975f, 47.762997f);
generalPath.lineTo(42.621998f, 49.472996f);
generalPath.lineTo(43.520996f, 52.238995f);
generalPath.lineTo(41.166996f, 50.528996f);
generalPath.lineTo(38.813995f, 52.238995f);
generalPath.lineTo(39.712994f, 49.472996f);
generalPath.lineTo(37.358994f, 47.762997f);
generalPath.lineTo(40.268993f, 47.762997f);
generalPath.closePath();
generalPath.moveTo(57.633f, 44.996f);
generalPath.lineTo(58.531998f, 47.762997f);
generalPath.lineTo(61.440998f, 47.762997f);
generalPath.lineTo(59.087997f, 49.472996f);
generalPath.lineTo(59.986996f, 52.238995f);
generalPath.lineTo(57.632996f, 50.528996f);
generalPath.lineTo(55.279995f, 52.238995f);
generalPath.lineTo(56.178993f, 49.472996f);
generalPath.lineTo(53.824993f, 47.762997f);
generalPath.lineTo(56.734993f, 47.762997f);
generalPath.closePath();
generalPath.moveTo(74.1f, 44.996f);
generalPath.lineTo(74.999f, 47.762997f);
generalPath.lineTo(77.908f, 47.762997f);
generalPath.lineTo(75.554f, 49.472996f);
generalPath.lineTo(76.454f, 52.238995f);
generalPath.lineTo(74.100006f, 50.528996f);
generalPath.lineTo(71.74701f, 52.238995f);
generalPath.lineTo(72.64501f, 49.472996f);
generalPath.lineTo(70.292015f, 47.762997f);
generalPath.lineTo(73.20101f, 47.762997f);
generalPath.closePath();
generalPath.moveTo(90.567f, 44.996f);
generalPath.lineTo(91.466f, 47.762997f);
generalPath.lineTo(94.375f, 47.762997f);
generalPath.lineTo(92.020996f, 49.472996f);
generalPath.lineTo(92.921f, 52.238995f);
generalPath.lineTo(90.567f, 50.528996f);
generalPath.lineTo(88.214005f, 52.238995f);
generalPath.lineTo(89.11201f, 49.472996f);
generalPath.lineTo(86.75901f, 47.762997f);
generalPath.lineTo(89.66801f, 47.762997f);
generalPath.closePath();
generalPath.moveTo(16.467f, 51.996f);
generalPath.lineTo(17.366f, 54.762997f);
generalPath.lineTo(20.275f, 54.762997f);
generalPath.lineTo(17.921999f, 56.472996f);
generalPath.lineTo(18.82f, 59.238995f);
generalPath.lineTo(16.467f, 57.528996f);
generalPath.lineTo(14.113999f, 59.238995f);
generalPath.lineTo(15.011999f, 56.472996f);
generalPath.lineTo(12.658999f, 54.762997f);
generalPath.lineTo(15.567999f, 54.762997f);
generalPath.closePath();
generalPath.moveTo(32.933f, 51.996f);
generalPath.lineTo(33.831997f, 54.762997f);
generalPath.lineTo(36.740997f, 54.762997f);
generalPath.lineTo(34.387997f, 56.472996f);
generalPath.lineTo(35.286995f, 59.238995f);
generalPath.lineTo(32.932995f, 57.528996f);
generalPath.lineTo(30.579994f, 59.238995f);
generalPath.lineTo(31.478994f, 56.472996f);
generalPath.lineTo(29.124994f, 54.762997f);
generalPath.lineTo(32.034996f, 54.762997f);
generalPath.closePath();
generalPath.moveTo(49.399998f, 51.996f);
generalPath.lineTo(50.298996f, 54.762997f);
generalPath.lineTo(53.207996f, 54.762997f);
generalPath.lineTo(50.854996f, 56.472996f);
generalPath.lineTo(51.753994f, 59.238995f);
generalPath.lineTo(49.399994f, 57.528996f);
generalPath.lineTo(47.046993f, 59.238995f);
generalPath.lineTo(47.94599f, 56.472996f);
generalPath.lineTo(45.59199f, 54.762997f);
generalPath.lineTo(48.50199f, 54.762997f);
generalPath.closePath();
generalPath.moveTo(65.867f, 51.996f);
generalPath.lineTo(66.766f, 54.762997f);
generalPath.lineTo(69.674995f, 54.762997f);
generalPath.lineTo(67.322f, 56.472996f);
generalPath.lineTo(68.22f, 59.238995f);
generalPath.lineTo(65.867004f, 57.528996f);
generalPath.lineTo(63.514004f, 59.238995f);
generalPath.lineTo(64.413f, 56.472996f);
generalPath.lineTo(62.059002f, 54.762997f);
generalPath.lineTo(64.969f, 54.762997f);
generalPath.closePath();
generalPath.moveTo(82.33299f, 51.996f);
generalPath.lineTo(83.231995f, 54.762997f);
generalPath.lineTo(86.14099f, 54.762997f);
generalPath.lineTo(83.78699f, 56.472996f);
generalPath.lineTo(84.68699f, 59.238995f);
generalPath.lineTo(82.33299f, 57.528996f);
generalPath.lineTo(79.979996f, 59.238995f);
generalPath.lineTo(80.878f, 56.472996f);
generalPath.lineTo(78.525f, 54.762997f);
generalPath.lineTo(81.434f, 54.762997f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(8.233f, 58.996f);
generalPath.lineTo(9.132999f, 61.762997f);
generalPath.lineTo(12.040999f, 61.762997f);
generalPath.lineTo(9.688f, 63.472996f);
generalPath.lineTo(10.587f, 66.239f);
generalPath.lineTo(8.233f, 64.529f);
generalPath.lineTo(5.88f, 66.239f);
generalPath.lineTo(6.7790003f, 63.473f);
generalPath.lineTo(4.425f, 61.763f);
generalPath.lineTo(7.335f, 61.763f);
generalPath.closePath();
generalPath.moveTo(24.699999f, 58.996f);
generalPath.lineTo(25.598999f, 61.762997f);
generalPath.lineTo(28.508f, 61.762997f);
generalPath.lineTo(26.154999f, 63.472996f);
generalPath.lineTo(27.053f, 66.239f);
generalPath.lineTo(24.699999f, 64.529f);
generalPath.lineTo(22.346998f, 66.239f);
generalPath.lineTo(23.244999f, 63.473f);
generalPath.lineTo(20.891998f, 61.763f);
generalPath.lineTo(23.800999f, 61.763f);
generalPath.closePath();
generalPath.moveTo(41.167f, 58.996f);
generalPath.lineTo(42.065998f, 61.762997f);
generalPath.lineTo(44.975f, 61.762997f);
generalPath.lineTo(42.621998f, 63.472996f);
generalPath.lineTo(43.520996f, 66.239f);
generalPath.lineTo(41.166996f, 64.529f);
generalPath.lineTo(38.813995f, 66.239f);
generalPath.lineTo(39.712994f, 63.473f);
generalPath.lineTo(37.358994f, 61.763f);
generalPath.lineTo(40.268993f, 61.763f);
generalPath.closePath();
generalPath.moveTo(57.633f, 58.996f);
generalPath.lineTo(58.531998f, 61.762997f);
generalPath.lineTo(61.440998f, 61.762997f);
generalPath.lineTo(59.087997f, 63.472996f);
generalPath.lineTo(59.986996f, 66.239f);
generalPath.lineTo(57.632996f, 64.529f);
generalPath.lineTo(55.279995f, 66.239f);
generalPath.lineTo(56.178993f, 63.473f);
generalPath.lineTo(53.824993f, 61.763f);
generalPath.lineTo(56.734993f, 61.763f);
generalPath.closePath();
generalPath.moveTo(74.1f, 58.996f);
generalPath.lineTo(74.999f, 61.762997f);
generalPath.lineTo(77.908f, 61.762997f);
generalPath.lineTo(75.554f, 63.472996f);
generalPath.lineTo(76.454f, 66.239f);
generalPath.lineTo(74.100006f, 64.529f);
generalPath.lineTo(71.74701f, 66.239f);
generalPath.lineTo(72.64501f, 63.473f);
generalPath.lineTo(70.292015f, 61.763f);
generalPath.lineTo(73.20101f, 61.763f);
generalPath.closePath();
generalPath.moveTo(90.567f, 58.996f);
generalPath.lineTo(91.466f, 61.762997f);
generalPath.lineTo(94.375f, 61.762997f);
generalPath.lineTo(92.020996f, 63.472996f);
generalPath.lineTo(92.921f, 66.239f);
generalPath.lineTo(90.567f, 64.529f);
generalPath.lineTo(88.214005f, 66.239f);
generalPath.lineTo(89.11201f, 63.473f);
generalPath.lineTo(86.75901f, 61.763f);
generalPath.lineTo(89.66801f, 61.763f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
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
    public boolean supportsColorFilter() {
        return true;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
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
    public static RadianceIcon of(int width, int height) {
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
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       us base = new us();
       base.width = width;
       base.height = height;
       return new RadianceIconUIResource(base);
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

