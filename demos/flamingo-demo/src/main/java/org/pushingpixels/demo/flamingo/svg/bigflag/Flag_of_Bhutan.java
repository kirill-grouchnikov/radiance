package org.pushingpixels.demo.flamingo.svg.bigflag;

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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class Flag_of_Bhutan implements NeonIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(0.0f, 0.0f);
generalPath.lineTo(900.0f, 0.0f);
generalPath.lineTo(900.0f, 600.0f);
generalPath.lineTo(0.0f, 600.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 213, 32, 255);
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(0.0f, 600.0f);
generalPath.lineTo(900.0f, 600.0f);
generalPath.lineTo(900.0f, 0.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 78, 18, 255);
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(481.74f, 187.59f);
generalPath.curveTo(476.753f, 185.81999f, 473.53198f, 188.39499f, 473.694f, 194.834f);
generalPath.curveTo(473.853f, 201.274f, 477.236f, 204.976f, 482.224f, 202.561f);
generalPath.lineTo(481.74f, 187.591f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(481.74f, 187.59f);
generalPath.curveTo(476.753f, 185.81999f, 473.53198f, 188.39499f, 473.694f, 194.834f);
generalPath.curveTo(473.853f, 201.274f, 477.236f, 204.976f, 482.224f, 202.561f);
generalPath.lineTo(481.74f, 187.591f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(486.12f, 175.53f);
generalPath.curveTo(481.966f, 172.25f, 478.09f, 173.656f, 476.17398f, 179.806f);
generalPath.curveTo(474.258f, 185.955f, 476.27f, 190.548f, 481.77f, 189.864f);
generalPath.lineTo(486.12f, 175.531f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(486.12f, 175.53f);
generalPath.curveTo(481.966f, 172.25f, 478.09f, 173.656f, 476.17398f, 179.806f);
generalPath.curveTo(474.258f, 185.955f, 476.27f, 190.548f, 481.77f, 189.864f);
generalPath.lineTo(486.12f, 175.531f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(493.04f, 163.86f);
generalPath.curveTo(489.46002f, 159.955f, 485.41f, 160.722f, 482.532f, 166.485f);
generalPath.curveTo(479.657f, 172.248f, 480.907f, 177.103f, 486.449f, 177.31f);
generalPath.lineTo(493.04f, 163.86f);
generalPath.closePath();
generalPath.moveTo(488.5f, 220.59f);
generalPath.curveTo(482.383f, 222.844f, 481.737f, 231.215f, 485.604f, 236.366f);
generalPath.curveTo(489.467f, 241.517f, 496.55002f, 242.483f, 500.41202f, 236.366f);
generalPath.lineTo(488.502f, 220.586f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(493.04f, 163.86f);
generalPath.curveTo(489.46002f, 159.955f, 485.41f, 160.722f, 482.532f, 166.485f);
generalPath.curveTo(479.657f, 172.248f, 480.907f, 177.103f, 486.449f, 177.31f);
generalPath.lineTo(493.04f, 163.86f);
generalPath.closePath();
generalPath.moveTo(488.5f, 220.59f);
generalPath.curveTo(482.383f, 222.844f, 481.737f, 231.215f, 485.604f, 236.366f);
generalPath.curveTo(489.467f, 241.517f, 496.55002f, 242.483f, 500.41202f, 236.366f);
generalPath.lineTo(488.502f, 220.586f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(481.42f, 202.88f);
generalPath.curveTo(475.62402f, 200.948f, 470.403f, 208.733f, 469.50702f, 215.75801f);
generalPath.curveTo(468.38202f, 224.61201f, 455.824f, 227.50902f, 462.74902f, 240.87102f);
generalPath.curveTo(464.19403f, 232.33902f, 469.83203f, 227.67102f, 474.33704f, 227.34901f);
generalPath.curveTo(478.84503f, 227.02701f, 485.60703f, 226.06102f, 488.50403f, 220.58801f);
generalPath.lineTo(481.42f, 202.88f);
generalPath.closePath();
generalPath.moveTo(499.77f, 237.33f);
generalPath.curveTo(493.007f, 238.94f, 492.03998f, 247.955f, 496.87f, 254.394f);
generalPath.curveTo(501.003f, 259.90698f, 513.933f, 258.579f, 513.612f, 253.106f);
generalPath.lineTo(499.77f, 237.33f);
generalPath.closePath();
generalPath.moveTo(518.93f, 291.58f);
generalPath.curveTo(519.25f, 285.78497f, 509.918f, 283.53098f, 505.409f, 284.658f);
generalPath.curveTo(500.901f, 285.785f, 492.288f, 284.498f, 490.276f, 279.668f);
generalPath.curveTo(488.668f, 283.531f, 491.001f, 287.717f, 497.522f, 289.809f);
generalPath.curveTo(502.45502f, 291.39398f, 502.351f, 294.961f, 500.901f, 296.57098f);
generalPath.curveTo(504.605f, 297.215f, 515.551f, 297.215f, 518.93f, 291.581f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(481.42f, 202.88f);
generalPath.curveTo(475.62402f, 200.948f, 470.403f, 208.733f, 469.50702f, 215.75801f);
generalPath.curveTo(468.38202f, 224.61201f, 455.824f, 227.50902f, 462.74902f, 240.87102f);
generalPath.curveTo(464.19403f, 232.33902f, 469.83203f, 227.67102f, 474.33704f, 227.34901f);
generalPath.curveTo(478.84503f, 227.02701f, 485.60703f, 226.06102f, 488.50403f, 220.58801f);
generalPath.lineTo(481.42f, 202.88f);
generalPath.closePath();
generalPath.moveTo(499.77f, 237.33f);
generalPath.curveTo(493.007f, 238.94f, 492.03998f, 247.955f, 496.87f, 254.394f);
generalPath.curveTo(501.003f, 259.90698f, 513.933f, 258.579f, 513.612f, 253.106f);
generalPath.lineTo(499.77f, 237.33f);
generalPath.closePath();
generalPath.moveTo(518.93f, 291.58f);
generalPath.curveTo(519.25f, 285.78497f, 509.918f, 283.53098f, 505.409f, 284.658f);
generalPath.curveTo(500.901f, 285.785f, 492.288f, 284.498f, 490.276f, 279.668f);
generalPath.curveTo(488.668f, 283.531f, 491.001f, 287.717f, 497.522f, 289.809f);
generalPath.curveTo(502.45502f, 291.39398f, 502.351f, 294.961f, 500.901f, 296.57098f);
generalPath.curveTo(504.605f, 297.215f, 515.551f, 297.215f, 518.93f, 291.581f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(513.62f, 254.56f);
generalPath.curveTo(507.02f, 251.663f, 503.107f, 256.076f, 500.582f, 260.355f);
generalPath.curveTo(496.878f, 266.633f, 485.449f, 258.58502f, 481.586f, 266.95502f);
generalPath.curveTo(486.819f, 264.70203f, 492.144f, 269.50803f, 494.624f, 271.14102f);
generalPath.curveTo(501.707f, 275.80902f, 515.391f, 274.36102f, 517.324f, 263.41403f);
generalPath.lineTo(513.62f, 254.56003f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(513.62f, 254.56f);
generalPath.curveTo(507.02f, 251.663f, 503.107f, 256.076f, 500.582f, 260.355f);
generalPath.curveTo(496.878f, 266.633f, 485.449f, 258.58502f, 481.586f, 266.95502f);
generalPath.curveTo(486.819f, 264.70203f, 492.144f, 269.50803f, 494.624f, 271.14102f);
generalPath.curveTo(501.707f, 275.80902f, 515.391f, 274.36102f, 517.324f, 263.41403f);
generalPath.lineTo(513.62f, 254.56003f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(517.48f, 262.28f);
generalPath.curveTo(510.87997f, 267.27f, 508.305f, 273.226f, 508.468f, 277.251f);
generalPath.curveTo(508.62997f, 281.276f, 514.263f, 290.129f, 520.381f, 290.612f);
generalPath.curveTo(523.922f, 283.368f, 525.693f, 268.075f, 517.48096f, 262.28f);
generalPath.closePath();
generalPath.moveTo(490.12f, 293.35f);
generalPath.curveTo(490.12f, 290.935f, 493.662f, 289.97f, 496.074f, 290.77402f);
generalPath.curveTo(498.491f, 291.579f, 502.191f, 293.99402f, 500.904f, 296.57f);
generalPath.lineTo(490.12f, 293.35f);
generalPath.closePath();
generalPath.moveTo(453.73f, 280.15f);
generalPath.curveTo(453.088f, 277.253f, 457.755f, 272.262f, 464.034f, 274.999f);
generalPath.curveTo(470.309f, 277.735f, 471.117f, 283.048f, 468.538f, 285.141f);
generalPath.lineTo(453.72998f, 280.151f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(517.48f, 262.28f);
generalPath.curveTo(510.87997f, 267.27f, 508.305f, 273.226f, 508.468f, 277.251f);
generalPath.curveTo(508.62997f, 281.276f, 514.263f, 290.129f, 520.381f, 290.612f);
generalPath.curveTo(523.922f, 283.368f, 525.693f, 268.075f, 517.48096f, 262.28f);
generalPath.closePath();
generalPath.moveTo(490.12f, 293.35f);
generalPath.curveTo(490.12f, 290.935f, 493.662f, 289.97f, 496.074f, 290.77402f);
generalPath.curveTo(498.491f, 291.579f, 502.191f, 293.99402f, 500.904f, 296.57f);
generalPath.lineTo(490.12f, 293.35f);
generalPath.closePath();
generalPath.moveTo(453.73f, 280.15f);
generalPath.curveTo(453.088f, 277.253f, 457.755f, 272.262f, 464.034f, 274.999f);
generalPath.curveTo(470.309f, 277.735f, 471.117f, 283.048f, 468.538f, 285.141f);
generalPath.lineTo(453.72998f, 280.151f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(469.02f, 285.46f);
generalPath.curveTo(468.537f, 283.85f, 473.05698f, 280.63498f, 480.774f, 282.56198f);
generalPath.curveTo(488.499f, 284.494f, 490.39398f, 289.469f, 490.112f, 293.348f);
generalPath.lineTo(469.019f, 285.46f);
generalPath.closePath();
generalPath.moveTo(452.93f, 280.15f);
generalPath.curveTo(456.955f, 277.09198f, 455.43f, 271.29498f, 451.8f, 269.525f);
generalPath.curveTo(445.19998f, 266.305f, 447.61697f, 257.935f, 443.43f, 256.32498f);
generalPath.curveTo(439.24698f, 254.71498f, 435.222f, 251.81699f, 435.06f, 248.91998f);
generalPath.curveTo(432.968f, 252.94398f, 434.255f, 256.64697f, 437.155f, 259.223f);
generalPath.curveTo(440.051f, 261.79898f, 434.901f, 272.262f, 438.601f, 274.999f);
generalPath.lineTo(452.93002f, 280.15f);
generalPath.closePath();
generalPath.moveTo(366.64f, 277.9f);
generalPath.curveTo(363.26f, 272.58798f, 355.21002f, 273.554f, 351.83002f, 277.25598f);
generalPath.curveTo(348.45f, 280.95898f, 348.933f, 286.43198f, 352.152f, 288.84598f);
generalPath.lineTo(366.64f, 277.9f);
generalPath.closePath();
generalPath.moveTo(385.96f, 270.01f);
generalPath.curveTo(384.672f, 262.927f, 376.13998f, 262.122f, 371.472f, 263.893f);
generalPath.curveTo(366.804f, 265.663f, 363.58398f, 272.747f, 366.642f, 277.898f);
generalPath.lineTo(385.961f, 270.01f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(469.02f, 285.46f);
generalPath.curveTo(468.537f, 283.85f, 473.05698f, 280.63498f, 480.774f, 282.56198f);
generalPath.curveTo(488.499f, 284.494f, 490.39398f, 289.469f, 490.112f, 293.348f);
generalPath.lineTo(469.019f, 285.46f);
generalPath.closePath();
generalPath.moveTo(452.93f, 280.15f);
generalPath.curveTo(456.955f, 277.09198f, 455.43f, 271.29498f, 451.8f, 269.525f);
generalPath.curveTo(445.19998f, 266.305f, 447.61697f, 257.935f, 443.43f, 256.32498f);
generalPath.curveTo(439.24698f, 254.71498f, 435.222f, 251.81699f, 435.06f, 248.91998f);
generalPath.curveTo(432.968f, 252.94398f, 434.255f, 256.64697f, 437.155f, 259.223f);
generalPath.curveTo(440.051f, 261.79898f, 434.901f, 272.262f, 438.601f, 274.999f);
generalPath.lineTo(452.93002f, 280.15f);
generalPath.closePath();
generalPath.moveTo(366.64f, 277.9f);
generalPath.curveTo(363.26f, 272.58798f, 355.21002f, 273.554f, 351.83002f, 277.25598f);
generalPath.curveTo(348.45f, 280.95898f, 348.933f, 286.43198f, 352.152f, 288.84598f);
generalPath.lineTo(366.64f, 277.9f);
generalPath.closePath();
generalPath.moveTo(385.96f, 270.01f);
generalPath.curveTo(384.672f, 262.927f, 376.13998f, 262.122f, 371.472f, 263.893f);
generalPath.curveTo(366.804f, 265.663f, 363.58398f, 272.747f, 366.642f, 277.898f);
generalPath.lineTo(385.961f, 270.01f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(398.84f, 269.04f);
generalPath.curveTo(401.898f, 263.084f, 395.943f, 254.23001f, 389.181f, 252.94202f);
generalPath.curveTo(383.537f, 251.86801f, 376.866f, 251.89601f, 374.693f, 246.34201f);
generalPath.curveTo(373.32498f, 251.17201f, 376.947f, 254.23001f, 381.133f, 256.967f);
generalPath.curveTo(385.318f, 259.704f, 380.327f, 266.78702f, 387.089f, 270.811f);
generalPath.lineTo(398.841f, 269.04102f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(398.84f, 269.04f);
generalPath.curveTo(401.898f, 263.084f, 395.943f, 254.23001f, 389.181f, 252.94202f);
generalPath.curveTo(383.537f, 251.86801f, 376.866f, 251.89601f, 374.693f, 246.34201f);
generalPath.curveTo(373.32498f, 251.17201f, 376.947f, 254.23001f, 381.133f, 256.967f);
generalPath.curveTo(385.318f, 259.704f, 380.327f, 266.78702f, 387.089f, 270.811f);
generalPath.lineTo(398.841f, 269.04102f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(398.2f, 269.25f);
generalPath.curveTo(396.79102f, 264.983f, 399.64902f, 259.307f, 405.432f, 259.705f);
generalPath.curveTo(411.217f, 260.103f, 414.512f, 264.305f, 411.962f, 269.56f);
generalPath.lineTo(398.199f, 269.25f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(398.2f, 269.25f);
generalPath.curveTo(396.79102f, 264.983f, 399.64902f, 259.307f, 405.432f, 259.705f);
generalPath.curveTo(411.217f, 260.103f, 414.512f, 264.305f, 411.962f, 269.56f);
generalPath.lineTo(398.199f, 269.25f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(411.07f, 269.57f);
generalPath.curveTo(410.27402f, 265.148f, 413.9f, 259.93f, 419.57f, 261.135f);
generalPath.curveTo(425.242f, 262.34f, 427.913f, 266.965f, 424.65402f, 271.81f);
generalPath.lineTo(411.07f, 269.57f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(411.07f, 269.57f);
generalPath.curveTo(410.27402f, 265.148f, 413.9f, 259.93f, 419.57f, 261.135f);
generalPath.curveTo(425.242f, 262.34f, 427.913f, 266.965f, 424.65402f, 271.81f);
generalPath.lineTo(411.07f, 269.57f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(423.86f, 271.6f);
generalPath.curveTo(423.28497f, 267.143f, 427.168f, 262.112f, 432.77197f, 263.599f);
generalPath.curveTo(438.37698f, 265.086f, 440.81396f, 269.839f, 437.31396f, 274.514f);
generalPath.lineTo(423.86f, 271.6f);
generalPath.closePath();
generalPath.moveTo(326.72f, 345.35f);
generalPath.curveTo(315.934f, 345.35f, 313.3f, 347.918f, 311.749f, 359.03302f);
generalPath.curveTo(309.817f, 372.877f, 328.65198f, 374.48703f, 326.72f, 345.35f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(423.86f, 271.6f);
generalPath.curveTo(423.28497f, 267.143f, 427.168f, 262.112f, 432.77197f, 263.599f);
generalPath.curveTo(438.37698f, 265.086f, 440.81396f, 269.839f, 437.31396f, 274.514f);
generalPath.lineTo(423.86f, 271.6f);
generalPath.closePath();
generalPath.moveTo(326.72f, 345.35f);
generalPath.curveTo(315.934f, 345.35f, 313.3f, 347.918f, 311.749f, 359.03302f);
generalPath.curveTo(309.817f, 372.877f, 328.65198f, 374.48703f, 326.72f, 345.35f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(331.55f, 330.86f);
generalPath.curveTo(314.969f, 324.58197f, 305.955f, 350.82098f, 289.53497f, 346.15298f);
generalPath.curveTo(295.40997f, 355.49f, 309.65298f, 346.16998f, 314.96896f, 347.119f);
generalPath.curveTo(323.98398f, 348.72897f, 343.46198f, 345.348f, 331.54996f, 330.85898f);
generalPath.closePath();
generalPath.moveTo(320.76f, 366.76f);
generalPath.curveTo(312.55002f, 363.058f, 303.696f, 375.614f, 305.306f, 381.087f);
generalPath.curveTo(307.35f, 388.039f, 326.072f, 382.375f, 320.76f, 366.76f);
generalPath.closePath();
generalPath.moveTo(282.45f, 420.85f);
generalPath.curveTo(286.958f, 422.133f, 292.43002f, 424.712f, 291.46503f, 433.404f);
generalPath.curveTo(290.49902f, 442.09598f, 274.08002f, 459.804f, 259.27002f, 460.771f);
generalPath.curveTo(244.46002f, 461.738f, 239.14702f, 479.604f, 226.43002f, 474.613f);
generalPath.curveTo(238.34203f, 472.363f, 238.34203f, 458.838f, 247.67902f, 454.655f);
generalPath.curveTo(240.91702f, 452.238f, 237.37602f, 467.534f, 228.68402f, 467.534f);
generalPath.curveTo(219.99103f, 467.534f, 215.80602f, 481.376f, 205.18102f, 480.409f);
generalPath.curveTo(194.55602f, 479.44598f, 193.43802f, 497.263f, 172.18102f, 497.47598f);
generalPath.curveTo(155.92102f, 497.63397f, 135.80002f, 516.63f, 128.55602f, 508.422f);
generalPath.curveTo(144.33202f, 506.168f, 150.69801f, 497.426f, 160.10802f, 487.814f);
generalPath.curveTo(175.24002f, 472.36398f, 192.30402f, 479.284f, 198.09802f, 465.60098f);
generalPath.curveTo(191.17603f, 470.26797f, 183.12802f, 472.521f, 175.24002f, 472.36398f);
generalPath.curveTo(165.33801f, 472.159f, 154.47401f, 488.13898f, 143.36603f, 481.055f);
generalPath.curveTo(149.80502f, 480.251f, 153.99103f, 477.514f, 160.75203f, 470.43f);
generalPath.curveTo(167.67503f, 463.176f, 177.83502f, 467.86398f, 185.86504f, 460.451f);
generalPath.curveTo(198.42104f, 448.85898f, 209.20703f, 458.51797f, 221.28003f, 444.03f);
generalPath.curveTo(217.89903f, 442.422f, 210.65503f, 443.547f, 203.89403f, 447.088f);
generalPath.curveTo(197.13203f, 450.63f, 188.44003f, 444.67203f, 180.71303f, 448.859f);
generalPath.curveTo(181.67802f, 439.363f, 199.70802f, 444.797f, 210.97702f, 438.234f);
generalPath.curveTo(223.69502f, 430.83002f, 234.23901f, 433.001f, 244.30002f, 433.888f);
generalPath.curveTo(230.29501f, 433.809f, 224.82202f, 420.525f, 205.50502f, 424.388f);
generalPath.curveTo(197.08002f, 426.076f, 190.37302f, 412.8f, 182.00201f, 419.559f);
generalPath.curveTo(182.24202f, 414.572f, 191.01701f, 410.546f, 200.03201f, 415.37598f);
generalPath.curveTo(209.04602f, 420.205f, 212.68001f, 411.14996f, 230.61801f, 422.45898f);
generalPath.curveTo(238.02301f, 427.12598f, 250.74f, 419.559f, 258.78802f, 424.551f);
generalPath.curveTo(257.74203f, 421.49298f, 253.15402f, 419.559f, 247.76202f, 419.96298f);
generalPath.curveTo(251.14203f, 413.04297f, 272.95502f, 413.926f, 282.45203f, 420.85098f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(331.55f, 330.86f);
generalPath.curveTo(314.969f, 324.58197f, 305.955f, 350.82098f, 289.53497f, 346.15298f);
generalPath.curveTo(295.40997f, 355.49f, 309.65298f, 346.16998f, 314.96896f, 347.119f);
generalPath.curveTo(323.98398f, 348.72897f, 343.46198f, 345.348f, 331.54996f, 330.85898f);
generalPath.closePath();
generalPath.moveTo(320.76f, 366.76f);
generalPath.curveTo(312.55002f, 363.058f, 303.696f, 375.614f, 305.306f, 381.087f);
generalPath.curveTo(307.35f, 388.039f, 326.072f, 382.375f, 320.76f, 366.76f);
generalPath.closePath();
generalPath.moveTo(282.45f, 420.85f);
generalPath.curveTo(286.958f, 422.133f, 292.43002f, 424.712f, 291.46503f, 433.404f);
generalPath.curveTo(290.49902f, 442.09598f, 274.08002f, 459.804f, 259.27002f, 460.771f);
generalPath.curveTo(244.46002f, 461.738f, 239.14702f, 479.604f, 226.43002f, 474.613f);
generalPath.curveTo(238.34203f, 472.363f, 238.34203f, 458.838f, 247.67902f, 454.655f);
generalPath.curveTo(240.91702f, 452.238f, 237.37602f, 467.534f, 228.68402f, 467.534f);
generalPath.curveTo(219.99103f, 467.534f, 215.80602f, 481.376f, 205.18102f, 480.409f);
generalPath.curveTo(194.55602f, 479.44598f, 193.43802f, 497.263f, 172.18102f, 497.47598f);
generalPath.curveTo(155.92102f, 497.63397f, 135.80002f, 516.63f, 128.55602f, 508.422f);
generalPath.curveTo(144.33202f, 506.168f, 150.69801f, 497.426f, 160.10802f, 487.814f);
generalPath.curveTo(175.24002f, 472.36398f, 192.30402f, 479.284f, 198.09802f, 465.60098f);
generalPath.curveTo(191.17603f, 470.26797f, 183.12802f, 472.521f, 175.24002f, 472.36398f);
generalPath.curveTo(165.33801f, 472.159f, 154.47401f, 488.13898f, 143.36603f, 481.055f);
generalPath.curveTo(149.80502f, 480.251f, 153.99103f, 477.514f, 160.75203f, 470.43f);
generalPath.curveTo(167.67503f, 463.176f, 177.83502f, 467.86398f, 185.86504f, 460.451f);
generalPath.curveTo(198.42104f, 448.85898f, 209.20703f, 458.51797f, 221.28003f, 444.03f);
generalPath.curveTo(217.89903f, 442.422f, 210.65503f, 443.547f, 203.89403f, 447.088f);
generalPath.curveTo(197.13203f, 450.63f, 188.44003f, 444.67203f, 180.71303f, 448.859f);
generalPath.curveTo(181.67802f, 439.363f, 199.70802f, 444.797f, 210.97702f, 438.234f);
generalPath.curveTo(223.69502f, 430.83002f, 234.23901f, 433.001f, 244.30002f, 433.888f);
generalPath.curveTo(230.29501f, 433.809f, 224.82202f, 420.525f, 205.50502f, 424.388f);
generalPath.curveTo(197.08002f, 426.076f, 190.37302f, 412.8f, 182.00201f, 419.559f);
generalPath.curveTo(182.24202f, 414.572f, 191.01701f, 410.546f, 200.03201f, 415.37598f);
generalPath.curveTo(209.04602f, 420.205f, 212.68001f, 411.14996f, 230.61801f, 422.45898f);
generalPath.curveTo(238.02301f, 427.12598f, 250.74f, 419.559f, 258.78802f, 424.551f);
generalPath.curveTo(257.74203f, 421.49298f, 253.15402f, 419.559f, 247.76202f, 419.96298f);
generalPath.curveTo(251.14203f, 413.04297f, 272.95502f, 413.926f, 282.45203f, 420.85098f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(296.78f, 410.38f);
generalPath.curveTo(289.697f, 404.907f, 279.877f, 411.508f, 273.116f, 408.931f);
generalPath.curveTo(273.116f, 413.437f, 275.37f, 420.201f, 282.775f, 422.775f);
generalPath.curveTo(285.029f, 421.167f, 295.16998f, 412.31198f, 296.78f, 410.38f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(296.78f, 410.38f);
generalPath.curveTo(289.697f, 404.907f, 279.877f, 411.508f, 273.116f, 408.931f);
generalPath.curveTo(273.116f, 413.437f, 275.37f, 420.201f, 282.775f, 422.775f);
generalPath.curveTo(285.029f, 421.167f, 295.16998f, 412.31198f, 296.78f, 410.38f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(307.89f, 394.77f);
generalPath.curveTo(296.782f, 389.136f, 294.851f, 403.13998f, 286.15802f, 400.24298f);
generalPath.curveTo(286.48f, 404.26797f, 289.7f, 409.258f, 296.78302f, 410.38498f);
generalPath.lineTo(307.89102f, 394.77f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(307.89f, 394.77f);
generalPath.curveTo(296.782f, 389.136f, 294.851f, 403.13998f, 286.15802f, 400.24298f);
generalPath.curveTo(286.48f, 404.26797f, 289.7f, 409.258f, 296.78302f, 410.38498f);
generalPath.lineTo(307.89102f, 394.77f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(314.49f, 382.05f);
generalPath.curveTo(298.06998f, 375.61f, 295.977f, 391.387f, 286.319f, 388.328f);
generalPath.curveTo(288.573f, 393.801f, 302.417f, 396.698f, 309.5f, 394.768f);
generalPath.lineTo(314.49f, 382.05002f);
generalPath.closePath();
generalPath.moveTo(337.02f, 312.99f);
generalPath.curveTo(332.67297f, 306.873f, 323.498f, 311.86298f, 322.04898f, 319.107f);
generalPath.curveTo(320.59998f, 326.35098f, 324.141f, 336.49298f, 330.25897f, 334.23898f);
generalPath.lineTo(337.01898f, 312.99f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(314.49f, 382.05f);
generalPath.curveTo(298.06998f, 375.61f, 295.977f, 391.387f, 286.319f, 388.328f);
generalPath.curveTo(288.573f, 393.801f, 302.417f, 396.698f, 309.5f, 394.768f);
generalPath.lineTo(314.49f, 382.05002f);
generalPath.closePath();
generalPath.moveTo(337.02f, 312.99f);
generalPath.curveTo(332.67297f, 306.873f, 323.498f, 311.86298f, 322.04898f, 319.107f);
generalPath.curveTo(320.59998f, 326.35098f, 324.141f, 336.49298f, 330.25897f, 334.23898f);
generalPath.lineTo(337.01898f, 312.99f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(348.13f, 293.67f);
generalPath.curveTo(340.564f, 291.90002f, 331.871f, 292.704f, 332.837f, 300.11002f);
generalPath.curveTo(329.939f, 301.397f, 329.134f, 310.89502f, 337.022f, 312.98703f);
generalPath.lineTo(348.13f, 293.66904f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(348.13f, 293.67f);
generalPath.curveTo(340.564f, 291.90002f, 331.871f, 292.704f, 332.837f, 300.11002f);
generalPath.curveTo(329.939f, 301.397f, 329.134f, 310.89502f, 337.022f, 312.98703f);
generalPath.lineTo(348.13f, 293.66904f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(353.12f, 288.68f);
generalPath.curveTo(345.715f, 279.987f, 337.457f, 280.19f, 332.837f, 283.85f);
generalPath.curveTo(324.305f, 290.612f, 316.014f, 286.74802f, 315.773f, 293.51f);
generalPath.curveTo(320.92502f, 289.565f, 325.432f, 294.314f, 329.617f, 292.86502f);
generalPath.curveTo(333.802f, 291.41702f, 336.861f, 299.46503f, 348.452f, 296.08502f);
generalPath.lineTo(353.12f, 288.68002f);
generalPath.closePath();
generalPath.moveTo(335.25f, 418.6f);
generalPath.curveTo(336.377f, 420.69202f, 343.299f, 421.65802f, 346.68f, 418.117f);
generalPath.curveTo(351.16f, 413.421f, 346.197f, 400.407f, 339.11398f, 399.44202f);
generalPath.curveTo(332.03098f, 398.476f, 331.387f, 414.092f, 335.24997f, 418.6f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(353.12f, 288.68f);
generalPath.curveTo(345.715f, 279.987f, 337.457f, 280.19f, 332.837f, 283.85f);
generalPath.curveTo(324.305f, 290.612f, 316.014f, 286.74802f, 315.773f, 293.51f);
generalPath.curveTo(320.92502f, 289.565f, 325.432f, 294.314f, 329.617f, 292.86502f);
generalPath.curveTo(333.802f, 291.41702f, 336.861f, 299.46503f, 348.452f, 296.08502f);
generalPath.lineTo(353.12f, 288.68002f);
generalPath.closePath();
generalPath.moveTo(335.25f, 418.6f);
generalPath.curveTo(336.377f, 420.69202f, 343.299f, 421.65802f, 346.68f, 418.117f);
generalPath.curveTo(351.16f, 413.421f, 346.197f, 400.407f, 339.11398f, 399.44202f);
generalPath.curveTo(332.03098f, 398.476f, 331.387f, 414.092f, 335.24997f, 418.6f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_17
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(327.2f, 418.92f);
generalPath.curveTo(337.341f, 422.62003f, 341.68802f, 414.25f, 336.21503f, 408.93903f);
generalPath.curveTo(334.765f, 410.709f, 329.45303f, 417.14902f, 327.2f, 418.92f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(327.2f, 418.92f);
generalPath.curveTo(337.341f, 422.62003f, 341.68802f, 414.25f, 336.21503f, 408.93903f);
generalPath.curveTo(334.765f, 410.709f, 329.45303f, 417.14902f, 327.2f, 418.92f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(289.21f, 432.76f);
generalPath.curveTo(287.27798f, 438.556f, 277.297f, 439.523f, 266.029f, 457.552f);
generalPath.curveTo(254.76f, 475.581f, 243.97499f, 468.015f, 241.23799f, 480.41f);
generalPath.curveTo(254.76f, 469.464f, 265.38f, 476.73502f, 273.43298f, 465.922f);
generalPath.curveTo(285.66797f, 449.501f, 295.74197f, 451.859f, 300.478f, 440.809f);
generalPath.curveTo(307.238f, 425.034f, 336.859f, 425.35498f, 338.469f, 400.565f);
generalPath.curveTo(328.48898f, 398.633f, 296.936f, 425.355f, 289.21f, 432.759f);
generalPath.closePath();
generalPath.moveTo(543.24f, 189.36f);
generalPath.curveTo(556.119f, 193.545f, 556.44f, 210.287f, 571.248f, 215.76f);
generalPath.curveTo(586.061f, 221.233f, 587.511f, 234.433f, 599.581f, 231.21399f);
generalPath.curveTo(588.31396f, 228.15498f, 589.118f, 215.116f, 577.368f, 211.896f);
generalPath.curveTo(563.58496f, 208.12f, 558.372f, 187.105f, 547.422f, 183.886f);
generalPath.moveTo(602.32f, 276.77f);
generalPath.curveTo(604.57404f, 281.921f, 604.253f, 291.097f, 596.203f, 293.512f);
generalPath.curveTo(600.549f, 296.249f, 606.986f, 293.672f, 610.528f, 287.71698f);
generalPath.curveTo(605.216f, 299.468f, 608.758f, 310.093f, 617.128f, 312.18597f);
generalPath.curveTo(613.10297f, 303.97598f, 622.12f, 300.11197f, 619.224f, 294.8f);
generalPath.curveTo(624.537f, 297.054f, 629.204f, 304.29797f, 629.041f, 308.805f);
generalPath.curveTo(635.966f, 301.078f, 623.891f, 290.775f, 626.145f, 283.53198f);
generalPath.lineTo(602.32f, 276.771f);
generalPath.closePath();
generalPath.moveTo(518.93f, 359.51f);
generalPath.curveTo(511.042f, 352.588f, 507.676f, 361.32f, 503.797f, 358.302f);
generalPath.curveTo(500.177f, 355.48502f, 495.347f, 355.082f, 493.497f, 357.9f);
generalPath.curveTo(500.259f, 358.142f, 496.95502f, 363.373f, 510.07602f, 364.66098f);
generalPath.curveTo(496.95502f, 365.54697f, 499.372f, 380.19598f, 490.59702f, 379.47098f);
generalPath.curveTo(499.93503f, 388.32498f, 504.764f, 371.58298f, 512.33f, 374.32098f);
generalPath.curveTo(510.07602f, 374.964f, 515.872f, 380.27597f, 511.84702f, 387.35898f);
generalPath.curveTo(518.367f, 387.19897f, 521.02203f, 378.18298f, 521.83f, 373.51498f);
generalPath.lineTo(518.93f, 359.50998f);
generalPath.closePath();
generalPath.moveTo(345.23f, 434.69f);
generalPath.curveTo(342.332f, 432.277f, 333.961f, 431.148f, 330.742f, 433.082f);
generalPath.curveTo(327.522f, 435.011f, 328.65f, 435.494f, 332.512f, 435.819f);
generalPath.curveTo(336.37698f, 436.14f, 341.365f, 442.39f, 332.996f, 442.74f);
generalPath.curveTo(329.132f, 442.89798f, 330.42f, 452.236f, 322.371f, 452.882f);
generalPath.curveTo(325.671f, 456.90698f, 335.089f, 454.249f, 338.469f, 449.82397f);
generalPath.curveTo(337.82498f, 453.44397f, 342.654f, 456.744f, 340.723f, 461.09097f);
generalPath.curveTo(346.679f, 461.73697f, 343.218f, 449.01996f, 352.636f, 449.66098f);
generalPath.curveTo(348.77197f, 450.145f, 350.382f, 458.83698f, 357.14297f, 456.58298f);
generalPath.curveTo(353.11798f, 458.516f, 355.21097f, 463.18298f, 359.718f, 462.05798f);
generalPath.curveTo(356.82098f, 463.024f, 355.85498f, 466.72397f, 359.879f, 468.81998f);
generalPath.curveTo(363.743f, 463.50797f, 359.396f, 444.51196f, 345.23f, 434.69098f);
generalPath.closePath();
generalPath.moveTo(695.85f, 257.07f);
generalPath.curveTo(708.17096f, 257.07f, 718.15796f, 247.08f, 718.15796f, 234.75801f);
generalPath.curveTo(718.15796f, 222.43802f, 708.17f, 212.44801f, 695.85f, 212.44801f);
generalPath.curveTo(683.52496f, 212.44801f, 673.537f, 222.43802f, 673.537f, 234.75801f);
generalPath.curveTo(673.537f, 247.08002f, 683.52496f, 257.07f, 695.85f, 257.07f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(289.21f, 432.76f);
generalPath.curveTo(287.27798f, 438.556f, 277.297f, 439.523f, 266.029f, 457.552f);
generalPath.curveTo(254.76f, 475.581f, 243.97499f, 468.015f, 241.23799f, 480.41f);
generalPath.curveTo(254.76f, 469.464f, 265.38f, 476.73502f, 273.43298f, 465.922f);
generalPath.curveTo(285.66797f, 449.501f, 295.74197f, 451.859f, 300.478f, 440.809f);
generalPath.curveTo(307.238f, 425.034f, 336.859f, 425.35498f, 338.469f, 400.565f);
generalPath.curveTo(328.48898f, 398.633f, 296.936f, 425.355f, 289.21f, 432.759f);
generalPath.closePath();
generalPath.moveTo(543.24f, 189.36f);
generalPath.curveTo(556.119f, 193.545f, 556.44f, 210.287f, 571.248f, 215.76f);
generalPath.curveTo(586.061f, 221.233f, 587.511f, 234.433f, 599.581f, 231.21399f);
generalPath.curveTo(588.31396f, 228.15498f, 589.118f, 215.116f, 577.368f, 211.896f);
generalPath.curveTo(563.58496f, 208.12f, 558.372f, 187.105f, 547.422f, 183.886f);
generalPath.moveTo(602.32f, 276.77f);
generalPath.curveTo(604.57404f, 281.921f, 604.253f, 291.097f, 596.203f, 293.512f);
generalPath.curveTo(600.549f, 296.249f, 606.986f, 293.672f, 610.528f, 287.71698f);
generalPath.curveTo(605.216f, 299.468f, 608.758f, 310.093f, 617.128f, 312.18597f);
generalPath.curveTo(613.10297f, 303.97598f, 622.12f, 300.11197f, 619.224f, 294.8f);
generalPath.curveTo(624.537f, 297.054f, 629.204f, 304.29797f, 629.041f, 308.805f);
generalPath.curveTo(635.966f, 301.078f, 623.891f, 290.775f, 626.145f, 283.53198f);
generalPath.lineTo(602.32f, 276.771f);
generalPath.closePath();
generalPath.moveTo(518.93f, 359.51f);
generalPath.curveTo(511.042f, 352.588f, 507.676f, 361.32f, 503.797f, 358.302f);
generalPath.curveTo(500.177f, 355.48502f, 495.347f, 355.082f, 493.497f, 357.9f);
generalPath.curveTo(500.259f, 358.142f, 496.95502f, 363.373f, 510.07602f, 364.66098f);
generalPath.curveTo(496.95502f, 365.54697f, 499.372f, 380.19598f, 490.59702f, 379.47098f);
generalPath.curveTo(499.93503f, 388.32498f, 504.764f, 371.58298f, 512.33f, 374.32098f);
generalPath.curveTo(510.07602f, 374.964f, 515.872f, 380.27597f, 511.84702f, 387.35898f);
generalPath.curveTo(518.367f, 387.19897f, 521.02203f, 378.18298f, 521.83f, 373.51498f);
generalPath.lineTo(518.93f, 359.50998f);
generalPath.closePath();
generalPath.moveTo(345.23f, 434.69f);
generalPath.curveTo(342.332f, 432.277f, 333.961f, 431.148f, 330.742f, 433.082f);
generalPath.curveTo(327.522f, 435.011f, 328.65f, 435.494f, 332.512f, 435.819f);
generalPath.curveTo(336.37698f, 436.14f, 341.365f, 442.39f, 332.996f, 442.74f);
generalPath.curveTo(329.132f, 442.89798f, 330.42f, 452.236f, 322.371f, 452.882f);
generalPath.curveTo(325.671f, 456.90698f, 335.089f, 454.249f, 338.469f, 449.82397f);
generalPath.curveTo(337.82498f, 453.44397f, 342.654f, 456.744f, 340.723f, 461.09097f);
generalPath.curveTo(346.679f, 461.73697f, 343.218f, 449.01996f, 352.636f, 449.66098f);
generalPath.curveTo(348.77197f, 450.145f, 350.382f, 458.83698f, 357.14297f, 456.58298f);
generalPath.curveTo(353.11798f, 458.516f, 355.21097f, 463.18298f, 359.718f, 462.05798f);
generalPath.curveTo(356.82098f, 463.024f, 355.85498f, 466.72397f, 359.879f, 468.81998f);
generalPath.curveTo(363.743f, 463.50797f, 359.396f, 444.51196f, 345.23f, 434.69098f);
generalPath.closePath();
generalPath.moveTo(695.85f, 257.07f);
generalPath.curveTo(708.17096f, 257.07f, 718.15796f, 247.08f, 718.15796f, 234.75801f);
generalPath.curveTo(718.15796f, 222.43802f, 708.17f, 212.44801f, 695.85f, 212.44801f);

}

private void _paint1(Graphics2D g,float origAlpha) {
generalPath.curveTo(683.52496f, 212.44801f, 673.537f, 222.43802f, 673.537f, 234.75801f);
generalPath.curveTo(673.537f, 247.08002f, 683.52496f, 257.07f, 695.85f, 257.07f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(579.3f, 284.02f);
generalPath.curveTo(586.063f, 277.58f, 596.367f, 274.361f, 603.446f, 279.19f);
generalPath.curveTo(610.529f, 284.02f, 634.034f, 289.815f, 645.625f, 281.766f);
generalPath.curveTo(657.213f, 273.71698f, 662.688f, 269.531f, 667.838f, 270.49698f);
generalPath.curveTo(671.705f, 276.29297f, 676.37103f, 279.029f, 682.167f, 279.512f);
generalPath.curveTo(683.937f, 281.444f, 690.217f, 283.054f, 693.759f, 282.57f);
generalPath.curveTo(698.909f, 283.858f, 705.188f, 282.249f, 710.17596f, 276.775f);
generalPath.curveTo(717.90594f, 277.902f, 725.147f, 272.107f, 727.884f, 263.415f);
generalPath.curveTo(736.092f, 262.449f, 736.576f, 253.272f, 731.42596f, 247.15501f);
generalPath.curveTo(726.59595f, 246.19002f, 730.30096f, 229.93001f, 712.751f, 233.15001f);
generalPath.curveTo(720.159f, 237.658f, 714.521f, 246.67201f, 720.64197f, 250.858f);
generalPath.curveTo(716.45496f, 250.858f, 711.063f, 252.629f, 709.77496f, 258.908f);
generalPath.curveTo(711.384f, 254.56099f, 709.53394f, 251.663f, 708.40497f, 250.69798f);
generalPath.curveTo(708.56696f, 246.99498f, 700.35895f, 237.89998f, 692.62994f, 241.19998f);
generalPath.curveTo(698.18396f, 242.40698f, 695.04596f, 251.34198f, 699.0709f, 254.72198f);
generalPath.curveTo(696.1709f, 254.88298f, 693.1129f, 256.33197f, 691.3419f, 258.90698f);
generalPath.curveTo(689.24994f, 255.20499f, 681.84595f, 251.34099f, 677.3379f, 251.01898f);
generalPath.curveTo(677.3379f, 249.73099f, 677.0959f, 247.15598f, 676.5339f, 245.86899f);
generalPath.curveTo(674.5209f, 242.00499f, 672.8299f, 237.41699f, 673.63385f, 231.54099f);
generalPath.curveTo(669.7709f, 235.72598f, 666.55084f, 241.52098f, 664.62085f, 245.70699f);
generalPath.curveTo(658.5048f, 241.52199f, 643.37085f, 247.63899f, 636.28784f, 249.24799f);
generalPath.curveTo(629.20483f, 250.85799f, 605.3798f, 246.99498f, 599.90485f, 241.19899f);
generalPath.curveTo(594.4349f, 235.40399f, 583.80884f, 231.86299f, 573.82983f, 228.965f);
generalPath.curveTo(560.10486f, 224.982f, 559.9838f, 209.97f, 544.8508f, 199.66699f);
generalPath.curveTo(544.5308f, 218.34099f, 572.86383f, 277.581f, 579.30084f, 284.02f);
generalPath.closePath();
generalPath.moveTo(421.54f, 426.32f);
generalPath.curveTo(433.453f, 426.32f, 443.11102f, 416.66202f, 443.11102f, 404.74902f);
generalPath.curveTo(443.11102f, 392.83603f, 433.45303f, 383.17902f, 421.54004f, 383.17902f);
generalPath.curveTo(409.62704f, 383.17902f, 399.96906f, 392.837f, 399.96906f, 404.74902f);
generalPath.curveTo(399.96906f, 416.66202f, 409.62704f, 426.32f, 421.54004f, 426.32f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(579.3f, 284.02f);
generalPath.curveTo(586.063f, 277.58f, 596.367f, 274.361f, 603.446f, 279.19f);
generalPath.curveTo(610.529f, 284.02f, 634.034f, 289.815f, 645.625f, 281.766f);
generalPath.curveTo(657.213f, 273.71698f, 662.688f, 269.531f, 667.838f, 270.49698f);
generalPath.curveTo(671.705f, 276.29297f, 676.37103f, 279.029f, 682.167f, 279.512f);
generalPath.curveTo(683.937f, 281.444f, 690.217f, 283.054f, 693.759f, 282.57f);
generalPath.curveTo(698.909f, 283.858f, 705.188f, 282.249f, 710.17596f, 276.775f);
generalPath.curveTo(717.90594f, 277.902f, 725.147f, 272.107f, 727.884f, 263.415f);
generalPath.curveTo(736.092f, 262.449f, 736.576f, 253.272f, 731.42596f, 247.15501f);
generalPath.curveTo(726.59595f, 246.19002f, 730.30096f, 229.93001f, 712.751f, 233.15001f);
generalPath.curveTo(720.159f, 237.658f, 714.521f, 246.67201f, 720.64197f, 250.858f);
generalPath.curveTo(716.45496f, 250.858f, 711.063f, 252.629f, 709.77496f, 258.908f);
generalPath.curveTo(711.384f, 254.56099f, 709.53394f, 251.663f, 708.40497f, 250.69798f);
generalPath.curveTo(708.56696f, 246.99498f, 700.35895f, 237.89998f, 692.62994f, 241.19998f);
generalPath.curveTo(698.18396f, 242.40698f, 695.04596f, 251.34198f, 699.0709f, 254.72198f);
generalPath.curveTo(696.1709f, 254.88298f, 693.1129f, 256.33197f, 691.3419f, 258.90698f);
generalPath.curveTo(689.24994f, 255.20499f, 681.84595f, 251.34099f, 677.3379f, 251.01898f);
generalPath.curveTo(677.3379f, 249.73099f, 677.0959f, 247.15598f, 676.5339f, 245.86899f);
generalPath.curveTo(674.5209f, 242.00499f, 672.8299f, 237.41699f, 673.63385f, 231.54099f);
generalPath.curveTo(669.7709f, 235.72598f, 666.55084f, 241.52098f, 664.62085f, 245.70699f);
generalPath.curveTo(658.5048f, 241.52199f, 643.37085f, 247.63899f, 636.28784f, 249.24799f);
generalPath.curveTo(629.20483f, 250.85799f, 605.3798f, 246.99498f, 599.90485f, 241.19899f);
generalPath.curveTo(594.4349f, 235.40399f, 583.80884f, 231.86299f, 573.82983f, 228.965f);
generalPath.curveTo(560.10486f, 224.982f, 559.9838f, 209.97f, 544.8508f, 199.66699f);
generalPath.curveTo(544.5308f, 218.34099f, 572.86383f, 277.581f, 579.30084f, 284.02f);
generalPath.closePath();
generalPath.moveTo(421.54f, 426.32f);
generalPath.curveTo(433.453f, 426.32f, 443.11102f, 416.66202f, 443.11102f, 404.74902f);
generalPath.curveTo(443.11102f, 392.83603f, 433.45303f, 383.17902f, 421.54004f, 383.17902f);
generalPath.curveTo(409.62704f, 383.17902f, 399.96906f, 392.837f, 399.96906f, 404.74902f);
generalPath.curveTo(399.96906f, 416.66202f, 409.62704f, 426.32f, 421.54004f, 426.32f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_20
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(370.02f, 409.74f);
generalPath.curveTo(374.366f, 415.375f, 381.771f, 415.054f, 384.83f, 414.56998f);
generalPath.curveTo(387.40598f, 421.32898f, 395.615f, 421.16998f, 399.15698f, 424.86996f);
generalPath.curveTo(402.69897f, 428.57495f, 414.77f, 428.25397f, 418.31198f, 426.15796f);
generalPath.curveTo(415.09497f, 425.83795f, 410.909f, 423.90796f, 406.88397f, 420.52496f);
generalPath.curveTo(402.02597f, 416.44498f, 404.30798f, 408.29095f, 400.44397f, 405.39395f);
generalPath.curveTo(403.34198f, 402.17395f, 403.82498f, 396.86194f, 403.18097f, 394.76895f);
generalPath.curveTo(406.24097f, 392.99796f, 408.49396f, 390.09995f, 408.81598f, 388.65094f);
generalPath.curveTo(414.12897f, 388.32895f, 418.796f, 385.59293f, 420.72897f, 383.50095f);
generalPath.curveTo(423.46597f, 386.07596f, 430.38696f, 382.69495f, 434.09198f, 387.04095f);
generalPath.curveTo(434.89597f, 376.41595f, 424.75397f, 370.78195f, 417.99197f, 374.32394f);
generalPath.curveTo(415.25397f, 372.87595f, 408.01196f, 373.84195f, 406.72397f, 375.77396f);
generalPath.curveTo(404.46997f, 374.80695f, 398.19196f, 378.02695f, 395.29398f, 380.11996f);
generalPath.curveTo(398.51398f, 378.34998f, 398.99597f, 373.03696f, 397.70798f, 371.10495f);
generalPath.curveTo(400.44498f, 369.97794f, 403.50397f, 366.27496f, 403.82498f, 363.53894f);
generalPath.curveTo(407.689f, 364.18295f, 413.48297f, 361.60693f, 416.05798f, 362.25095f);
generalPath.curveTo(411.87497f, 356.77795f, 404.95297f, 354.84595f, 397.869f, 355.32895f);
generalPath.curveTo(390.54398f, 355.73196f, 387.40598f, 360.88293f, 386.44f, 366.43695f);
generalPath.curveTo(382.094f, 369.01294f, 380.645f, 377.70496f, 382.255f, 380.76395f);
generalPath.curveTo(379.759f, 380.68396f, 377.42502f, 383.09894f, 376.46f, 384.46695f);
generalPath.curveTo(373.08f, 383.01694f, 368.25f, 381.97195f, 364.789f, 381.97195f);
generalPath.moveTo(366.32f, 373.2f);
generalPath.curveTo(364.871f, 369.015f, 366.79f, 365.247f, 367.769f, 361.932f);
generalPath.curveTo(370.264f, 353.482f, 368.73502f, 351.307f, 361.169f, 352.43402f);
generalPath.curveTo(360.525f, 356.459f, 364.389f, 369.65903f, 366.32f, 373.2f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(370.02f, 409.74f);
generalPath.curveTo(374.366f, 415.375f, 381.771f, 415.054f, 384.83f, 414.56998f);
generalPath.curveTo(387.40598f, 421.32898f, 395.615f, 421.16998f, 399.15698f, 424.86996f);
generalPath.curveTo(402.69897f, 428.57495f, 414.77f, 428.25397f, 418.31198f, 426.15796f);
generalPath.curveTo(415.09497f, 425.83795f, 410.909f, 423.90796f, 406.88397f, 420.52496f);
generalPath.curveTo(402.02597f, 416.44498f, 404.30798f, 408.29095f, 400.44397f, 405.39395f);
generalPath.curveTo(403.34198f, 402.17395f, 403.82498f, 396.86194f, 403.18097f, 394.76895f);
generalPath.curveTo(406.24097f, 392.99796f, 408.49396f, 390.09995f, 408.81598f, 388.65094f);
generalPath.curveTo(414.12897f, 388.32895f, 418.796f, 385.59293f, 420.72897f, 383.50095f);
generalPath.curveTo(423.46597f, 386.07596f, 430.38696f, 382.69495f, 434.09198f, 387.04095f);
generalPath.curveTo(434.89597f, 376.41595f, 424.75397f, 370.78195f, 417.99197f, 374.32394f);
generalPath.curveTo(415.25397f, 372.87595f, 408.01196f, 373.84195f, 406.72397f, 375.77396f);
generalPath.curveTo(404.46997f, 374.80695f, 398.19196f, 378.02695f, 395.29398f, 380.11996f);
generalPath.curveTo(398.51398f, 378.34998f, 398.99597f, 373.03696f, 397.70798f, 371.10495f);
generalPath.curveTo(400.44498f, 369.97794f, 403.50397f, 366.27496f, 403.82498f, 363.53894f);
generalPath.curveTo(407.689f, 364.18295f, 413.48297f, 361.60693f, 416.05798f, 362.25095f);
generalPath.curveTo(411.87497f, 356.77795f, 404.95297f, 354.84595f, 397.869f, 355.32895f);
generalPath.curveTo(390.54398f, 355.73196f, 387.40598f, 360.88293f, 386.44f, 366.43695f);
generalPath.curveTo(382.094f, 369.01294f, 380.645f, 377.70496f, 382.255f, 380.76395f);
generalPath.curveTo(379.759f, 380.68396f, 377.42502f, 383.09894f, 376.46f, 384.46695f);
generalPath.curveTo(373.08f, 383.01694f, 368.25f, 381.97195f, 364.789f, 381.97195f);
generalPath.moveTo(366.32f, 373.2f);
generalPath.curveTo(364.871f, 369.015f, 366.79f, 365.247f, 367.769f, 361.932f);
generalPath.curveTo(370.264f, 353.482f, 368.73502f, 351.307f, 361.169f, 352.43402f);
generalPath.curveTo(360.525f, 356.459f, 364.389f, 369.65903f, 366.32f, 373.2f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_21
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(360.77f, 352.91f);
generalPath.curveTo(362.702f, 354.842f, 369.54398f, 355.727f, 370.26797f, 349.61002f);
generalPath.curveTo(371.09998f, 342.588f, 368.25598f, 339.87003f, 362.13797f, 342.60703f);
generalPath.curveTo(361.65598f, 344.217f, 361.09198f, 350.81702f, 360.76996f, 352.91003f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(360.77f, 352.91f);
generalPath.curveTo(362.702f, 354.842f, 369.54398f, 355.727f, 370.26797f, 349.61002f);
generalPath.curveTo(371.09998f, 342.588f, 368.25598f, 339.87003f, 362.13797f, 342.60703f);
generalPath.curveTo(361.65598f, 344.217f, 361.09198f, 350.81702f, 360.76996f, 352.91003f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_22
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(362.22f, 342.37f);
generalPath.curveTo(364.796f, 343.416f, 370.35f, 345.509f, 373.408f, 339.553f);
generalPath.curveTo(375.974f, 334.557f, 372.603f, 330.699f, 367.291f, 331.02002f);
generalPath.curveTo(366.003f, 332.47003f, 363.42798f, 337.62003f, 362.21997f, 342.37003f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(362.22f, 342.37f);
generalPath.curveTo(364.796f, 343.416f, 370.35f, 345.509f, 373.408f, 339.553f);
generalPath.curveTo(375.974f, 334.557f, 372.603f, 330.699f, 367.291f, 331.02002f);
generalPath.curveTo(366.003f, 332.47003f, 363.42798f, 337.62003f, 362.21997f, 342.37003f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_23
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(366.97f, 330.54f);
generalPath.curveTo(367.614f, 332.47202f, 374.214f, 338.91f, 379.043f, 334.243f);
generalPath.curveTo(383.873f, 329.574f, 383.873f, 322.653f, 376.628f, 320.07703f);
generalPath.curveTo(374.69598f, 320.39804f, 368.901f, 327.15903f, 366.97f, 330.54004f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(366.97f, 330.54f);
generalPath.curveTo(367.614f, 332.47202f, 374.214f, 338.91f, 379.043f, 334.243f);
generalPath.curveTo(383.873f, 329.574f, 383.873f, 322.653f, 376.628f, 320.07703f);
generalPath.curveTo(374.69598f, 320.39804f, 368.901f, 327.15903f, 366.97f, 330.54004f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_24
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(376.62f, 320.08f);
generalPath.curveTo(378.069f, 324.10397f, 382.576f, 331.026f, 390.947f, 327.80698f);
generalPath.curveTo(399.318f, 324.58698f, 395.77698f, 314.12396f, 391.913f, 312.03098f);
generalPath.curveTo(389.659f, 312.19098f, 380.483f, 316.37698f, 376.62f, 320.08f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(376.62f, 320.08f);
generalPath.curveTo(378.069f, 324.10397f, 382.576f, 331.026f, 390.947f, 327.80698f);
generalPath.curveTo(399.318f, 324.58698f, 395.77698f, 314.12396f, 391.913f, 312.03098f);
generalPath.curveTo(389.659f, 312.19098f, 380.483f, 316.37698f, 376.62f, 320.08f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_25
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(391.92f, 312.03f);
generalPath.curveTo(391.276f, 315.572f, 391.92f, 325.23f, 403.349f, 325.069f);
generalPath.curveTo(414.777f, 324.909f, 411.56f, 311.547f, 408.662f, 309.615f);
generalPath.curveTo(403.99298f, 309.615f, 396.106f, 309.775f, 391.91998f, 312.03f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(391.92f, 312.03f);
generalPath.curveTo(391.276f, 315.572f, 391.92f, 325.23f, 403.349f, 325.069f);
generalPath.curveTo(414.777f, 324.909f, 411.56f, 311.547f, 408.662f, 309.615f);
generalPath.curveTo(403.99298f, 309.615f, 396.106f, 309.775f, 391.91998f, 312.03f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_26
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(409.14f, 310.09f);
generalPath.curveTo(407.85202f, 312.827f, 404.95f, 330.84f, 427.33102f, 325.866f);
generalPath.curveTo(430.22702f, 325.222f, 437.79404f, 308.641f, 409.14f, 310.09f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(409.14f, 310.09f);
generalPath.curveTo(407.85202f, 312.827f, 404.95f, 330.84f, 427.33102f, 325.866f);
generalPath.curveTo(430.22702f, 325.222f, 437.79404f, 308.641f, 409.14f, 310.09f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_27
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(421.37f, 311.7f);
generalPath.curveTo(419.12f, 313.953f, 424.912f, 332.144f, 440.04498f, 329.08502f);
generalPath.curveTo(455.17798f, 326.02603f, 442.46198f, 308.80203f, 421.37f, 311.7f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(421.37f, 311.7f);
generalPath.curveTo(419.12f, 313.953f, 424.912f, 332.144f, 440.04498f, 329.08502f);
generalPath.curveTo(455.17798f, 326.02603f, 442.46198f, 308.80203f, 421.37f, 311.7f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_28
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(434.25f, 314.44f);
generalPath.curveTo(431.837f, 319.43f, 435.462f, 334.24f, 454.133f, 334.24f);
generalPath.curveTo(471.054f, 334.24f, 453.246f, 314.762f, 434.25f, 314.44f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(434.25f, 314.44f);
generalPath.curveTo(431.837f, 319.43f, 435.462f, 334.24f, 454.133f, 334.24f);
generalPath.curveTo(471.054f, 334.24f, 453.246f, 314.762f, 434.25f, 314.44f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_29
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(448.9f, 318.79f);
generalPath.curveTo(447.688f, 321.556f, 446.20398f, 337.258f, 468.21698f, 338.59f);
generalPath.curveTo(484.15497f, 339.556f, 480.292f, 317.01898f, 448.9f, 318.79f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(448.9f, 318.79f);
generalPath.curveTo(447.688f, 321.556f, 446.20398f, 337.258f, 468.21698f, 338.59f);
generalPath.curveTo(484.15497f, 339.556f, 480.292f, 317.01898f, 448.9f, 318.79f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_30
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(472.57f, 325.39f);
generalPath.curveTo(469.837f, 330.22f, 466.937f, 342.29303f, 491.083f, 343.259f);
generalPath.curveTo(506.55402f, 343.879f, 497.04102f, 325.712f, 472.57f, 325.39f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(472.57f, 325.39f);
generalPath.curveTo(469.837f, 330.22f, 466.937f, 342.29303f, 491.083f, 343.259f);
generalPath.curveTo(506.55402f, 343.879f, 497.04102f, 325.712f, 472.57f, 325.39f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_31
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(492.69f, 329.09f);
generalPath.curveTo(489.148f, 333.91998f, 491.757f, 343.393f, 500.736f, 345.188f);
generalPath.curveTo(512.006f, 347.442f, 513.615f, 336.818f, 505.88998f, 331.666f);
generalPath.curveTo(498.15997f, 326.51498f, 492.68997f, 329.09f, 492.68997f, 329.09f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(492.69f, 329.09f);
generalPath.curveTo(489.148f, 333.91998f, 491.757f, 343.393f, 500.736f, 345.188f);
generalPath.curveTo(512.006f, 347.442f, 513.615f, 336.818f, 505.88998f, 331.666f);
generalPath.curveTo(498.15997f, 326.51498f, 492.68997f, 329.09f, 492.68997f, 329.09f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_32
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(503.64f, 331.34f);
generalPath.curveTo(501.065f, 335.848f, 502.66f, 346.794f, 519.736f, 346.794f);
generalPath.curveTo(523.278f, 346.794f, 536.80304f, 332.95f, 503.64f, 331.34f);
generalPath.closePath();
generalPath.moveTo(371.48f, 541.27f);
generalPath.curveTo(385.31f, 541.27f, 396.522f, 530.057f, 396.522f, 516.228f);
generalPath.curveTo(396.522f, 502.39502f, 385.31f, 491.18204f, 371.48f, 491.18204f);
generalPath.curveTo(357.64902f, 491.18204f, 346.437f, 502.39505f, 346.437f, 516.228f);
generalPath.curveTo(346.437f, 530.057f, 357.64902f, 541.27f, 371.48f, 541.27f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(503.64f, 331.34f);
generalPath.curveTo(501.065f, 335.848f, 502.66f, 346.794f, 519.736f, 346.794f);
generalPath.curveTo(523.278f, 346.794f, 536.80304f, 332.95f, 503.64f, 331.34f);
generalPath.closePath();
generalPath.moveTo(371.48f, 541.27f);
generalPath.curveTo(385.31f, 541.27f, 396.522f, 530.057f, 396.522f, 516.228f);
generalPath.curveTo(396.522f, 502.39502f, 385.31f, 491.18204f, 371.48f, 491.18204f);
generalPath.curveTo(357.64902f, 491.18204f, 346.437f, 502.39505f, 346.437f, 516.228f);
generalPath.curveTo(346.437f, 530.057f, 357.64902f, 541.27f, 371.48f, 541.27f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_33
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(555.15f, 177.13f);
generalPath.curveTo(553.21704f, 179.06201f, 549.19604f, 184.85701f, 548.387f, 187.11f);
generalPath.curveTo(540.017f, 212.223f, 562.362f, 230.981f, 575.43304f, 257.94f);
generalPath.curveTo(585.73706f, 279.19f, 584.4501f, 312.673f, 568.35004f, 333.922f);
generalPath.curveTo(562.84204f, 341.191f, 564.48804f, 343.259f, 557.40405f, 350.664f);
generalPath.curveTo(554.6871f, 353.505f, 551.60803f, 357.104f, 552.5751f, 367.406f);
generalPath.curveTo(557.08307f, 365.79602f, 563.52106f, 369.982f, 564.80804f, 373.52402f);
generalPath.curveTo(568.028f, 371.91403f, 572.538f, 372.558f, 574.145f, 374.489f);
generalPath.curveTo(579.616f, 371.914f, 584.125f, 373.20102f, 588.953f, 378.35303f);
generalPath.curveTo(593.141f, 377.709f, 597.649f, 378.35303f, 601.833f, 382.86002f);
generalPath.curveTo(604.08704f, 378.35303f, 608.59503f, 376.743f, 611.812f, 377.709f);
generalPath.curveTo(611.491f, 371.914f, 617.287f, 367.729f, 622.437f, 369.98203f);
generalPath.curveTo(620.828f, 362.25504f, 627.912f, 356.459f, 634.675f, 358.713f);
generalPath.curveTo(640.466f, 354.20602f, 652.058f, 353.884f, 657.854f, 360.64502f);
generalPath.curveTo(647.55f, 357.74802f, 647.874f, 368.695f, 639.179f, 367.72803f);
generalPath.curveTo(641.43304f, 374.16803f, 635.637f, 377.87003f, 629.84503f, 379.96204f);
generalPath.curveTo(633.54504f, 378.19205f, 637.57f, 376.09903f, 638.85803f, 378.35205f);
generalPath.curveTo(642.078f, 375.53604f, 648.51605f, 376.58206f, 650.12805f, 378.03104f);
generalPath.curveTo(654.39105f, 376.66302f, 658.50006f, 377.70905f, 660.42804f, 382.86005f);
generalPath.curveTo(666.22504f, 386.40204f, 670.088f, 395.41605f, 665.90405f, 402.17804f);
generalPath.curveTo(664.616f, 395.09503f, 659.78705f, 395.41705f, 657.85406f, 392.51904f);
generalPath.curveTo(653.3451f, 394.12903f, 648.83704f, 394.12903f, 647.55005f, 391.23105f);
generalPath.curveTo(644.97504f, 393.80704f, 636.283f, 396.06104f, 632.42004f, 392.19705f);
generalPath.curveTo(630.97003f, 397.99207f, 625.98004f, 402.82205f, 620.18304f, 402.82205f);
generalPath.curveTo(621.79504f, 407.32904f, 617.28705f, 415.05804f, 613.74506f, 418.92004f);
generalPath.curveTo(619.22003f, 421.81604f, 617.60803f, 428.25705f, 616.32007f, 432.12006f);
generalPath.curveTo(624.69104f, 433.40704f, 617.6081f, 440.81204f, 632.0951f, 445.64105f);
generalPath.curveTo(625.0161f, 447.89505f, 611.1701f, 445.64105f, 609.2371f, 436.94907f);
generalPath.curveTo(602.1541f, 436.62906f, 597.3241f, 429.54507f, 597.6491f, 422.13608f);
generalPath.curveTo(592.17413f, 416.98608f, 591.3701f, 409.5821f, 598.93713f, 404.4311f);
generalPath.curveTo(592.4951f, 406.3631f, 588.9531f, 396.0611f, 579.61615f, 400.2461f);
generalPath.curveTo(574.9741f, 402.3281f, 562.7161f, 398.7971f, 562.8782f, 394.4501f);
generalPath.curveTo(560.94415f, 397.6701f, 549.1952f, 396.38312f, 547.58215f, 390.9101f);
generalPath.curveTo(543.7192f, 393.0021f, 534.70215f, 389.46008f, 534.8652f, 384.1481f);
generalPath.curveTo(529.87317f, 386.4021f, 523.1152f, 382.3781f, 523.4352f, 377.2261f);
generalPath.curveTo(518.76917f, 376.5821f, 518.28516f, 372.39612f, 518.6072f, 368.8561f);
generalPath.curveTo(514.4192f, 366.9231f, 515.54816f, 362.8991f, 517.15717f, 358.0701f);
generalPath.curveTo(514.26117f, 354.8501f, 515.54816f, 350.3431f, 517.8022f, 346.1571f);
generalPath.curveTo(514.5822f, 342.9371f, 515.2272f, 339.0741f, 516.1902f, 334.5671f);
generalPath.curveTo(500.73618f, 333.2791f, 481.3772f, 329.5521f, 436.99017f, 315.8941f);
generalPath.curveTo(370.02316f, 295.2891f, 351.99316f, 343.5821f, 366.80316f, 373.8461f);
generalPath.curveTo(383.89017f, 408.7661f, 364.87115f, 416.3461f, 370.66718f, 442.4261f);
generalPath.curveTo(376.78418f, 443.71307f, 380.00317f, 448.8631f, 379.6822f, 454.33807f);
generalPath.curveTo(383.3022f, 454.49606f, 385.8782f, 457.87607f, 384.5912f, 464.31808f);
generalPath.curveTo(387.6492f, 463.7551f, 391.59418f, 464.6381f, 394.1692f, 467.21307f);
generalPath.curveTo(396.4232f, 463.03006f, 403.8292f, 462.06308f, 407.6922f, 466.89307f);
generalPath.curveTo(416.0622f, 466.24606f, 420.2482f, 473.00906f, 419.9272f, 481.38007f);
generalPath.curveTo(424.4322f, 489.43005f, 422.82318f, 499.25107f, 417.99417f, 505.52606f);
generalPath.curveTo(418.47717f, 502.14706f, 417.99417f, 497.31805f, 417.83618f, 494.42206f);
generalPath.curveTo(417.5362f, 489.09305f, 410.10617f, 487.98105f, 410.91217f, 483.63406f);
generalPath.curveTo(407.04816f, 483.95508f, 403.34518f, 481.86407f, 402.05817f, 478.96808f);
generalPath.curveTo(399.80417f, 480.89706f, 396.58417f, 481.5431f, 393.84818f, 480.57608f);
generalPath.curveTo(398.19418f, 482.5091f, 401.57516f, 490.23407f, 400.28717f, 495.3841f);
generalPath.curveTo(402.54117f, 499.2511f, 402.05716f, 506.3341f, 399.32117f, 509.3921f);
generalPath.curveTo(398.03317f, 515.6671f, 393.20416f, 517.9221f, 386.92618f, 515.1841f);
generalPath.curveTo(390.46817f, 512.9341f, 391.75616f, 508.9091f, 391.59418f, 505.5251f);
generalPath.curveTo(389.3412f, 503.5961f, 388.21417f, 499.8921f, 388.0532f, 497.6381f);
generalPath.curveTo(381.7752f, 498.6041f, 373.08218f, 493.29208f, 371.4792f, 491.19208f);
generalPath.curveTo(357.6482f, 491.19208f, 346.4362f, 502.4051f, 346.4362f, 516.2381f);
generalPath.curveTo(345.79218f, 511.0841f, 339.27618f, 506.0091f, 340.08118f, 501.6631f);
generalPath.curveTo(336.21817f, 489.7501f, 341.69116f, 478.6421f, 357.46716f, 476.3921f);
generalPath.curveTo(355.53616f, 471.8841f, 362.29715f, 467.2121f, 359.72116f, 462.06308f);
generalPath.curveTo(356.43115f, 455.4831f, 350.38516f, 446.93008f, 341.37115f, 436.95007f);
generalPath.curveTo(346.84415f, 427.61206f, 345.23416f, 415.05807f, 342.01416f, 407.33008f);
generalPath.curveTo(337.39117f, 396.23407f, 332.99915f, 398.96008f, 316.57916f, 416.98807f);
generalPath.curveTo(289.81915f, 446.37106f, 254.11917f, 438.23807f, 222.56717f, 457.55505f);
generalPath.curveTo(214.18317f, 462.68805f, 205.82617f, 464.63806f, 214.84016f, 455.62506f);
generalPath.curveTo(223.85516f, 446.60907f, 247.68016f, 437.59705f, 263.13318f, 429.86807f);
generalPath.curveTo(292.07318f, 415.39706f, 316.5782f, 391.23306f, 326.23718f, 344.2281f);
generalPath.curveTo(348.93417f, 233.7681f, 432.47717f, 270.1781f, 485.27716f, 290.78308f);
generalPath.curveTo(534.84814f, 310.1291f, 525.8442f, 266.31308f, 500.73117f, 239.91309f);
generalPath.curveTo(470.54816f, 208.18208f, 476.58517f, 183.25009f, 490.75217f, 163.28809f);
generalPath.curveTo(516.1852f, 159.74608f, 564.96515f, 168.60008f, 555.14417f, 177.13309f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(555.15f, 177.13f);
generalPath.curveTo(553.21704f, 179.06201f, 549.19604f, 184.85701f, 548.387f, 187.11f);
generalPath.curveTo(540.017f, 212.223f, 562.362f, 230.981f, 575.43304f, 257.94f);
generalPath.curveTo(585.73706f, 279.19f, 584.4501f, 312.673f, 568.35004f, 333.922f);
generalPath.curveTo(562.84204f, 341.191f, 564.48804f, 343.259f, 557.40405f, 350.664f);
generalPath.curveTo(554.6871f, 353.505f, 551.60803f, 357.104f, 552.5751f, 367.406f);
generalPath.curveTo(557.08307f, 365.79602f, 563.52106f, 369.982f, 564.80804f, 373.52402f);
generalPath.curveTo(568.028f, 371.91403f, 572.538f, 372.558f, 574.145f, 374.489f);
generalPath.curveTo(579.616f, 371.914f, 584.125f, 373.20102f, 588.953f, 378.35303f);
generalPath.curveTo(593.141f, 377.709f, 597.649f, 378.35303f, 601.833f, 382.86002f);
generalPath.curveTo(604.08704f, 378.35303f, 608.59503f, 376.743f, 611.812f, 377.709f);
generalPath.curveTo(611.491f, 371.914f, 617.287f, 367.729f, 622.437f, 369.98203f);
generalPath.curveTo(620.828f, 362.25504f, 627.912f, 356.459f, 634.675f, 358.713f);
generalPath.curveTo(640.466f, 354.20602f, 652.058f, 353.884f, 657.854f, 360.64502f);
generalPath.curveTo(647.55f, 357.74802f, 647.874f, 368.695f, 639.179f, 367.72803f);
generalPath.curveTo(641.43304f, 374.16803f, 635.637f, 377.87003f, 629.84503f, 379.96204f);
generalPath.curveTo(633.54504f, 378.19205f, 637.57f, 376.09903f, 638.85803f, 378.35205f);
generalPath.curveTo(642.078f, 375.53604f, 648.51605f, 376.58206f, 650.12805f, 378.03104f);
generalPath.curveTo(654.39105f, 376.66302f, 658.50006f, 377.70905f, 660.42804f, 382.86005f);
generalPath.curveTo(666.22504f, 386.40204f, 670.088f, 395.41605f, 665.90405f, 402.17804f);
generalPath.curveTo(664.616f, 395.09503f, 659.78705f, 395.41705f, 657.85406f, 392.51904f);
generalPath.curveTo(653.3451f, 394.12903f, 648.83704f, 394.12903f, 647.55005f, 391.23105f);
generalPath.curveTo(644.97504f, 393.80704f, 636.283f, 396.06104f, 632.42004f, 392.19705f);
generalPath.curveTo(630.97003f, 397.99207f, 625.98004f, 402.82205f, 620.18304f, 402.82205f);
generalPath.curveTo(621.79504f, 407.32904f, 617.28705f, 415.05804f, 613.74506f, 418.92004f);
generalPath.curveTo(619.22003f, 421.81604f, 617.60803f, 428.25705f, 616.32007f, 432.12006f);
generalPath.curveTo(624.69104f, 433.40704f, 617.6081f, 440.81204f, 632.0951f, 445.64105f);
generalPath.curveTo(625.0161f, 447.89505f, 611.1701f, 445.64105f, 609.2371f, 436.94907f);
generalPath.curveTo(602.1541f, 436.62906f, 597.3241f, 429.54507f, 597.6491f, 422.13608f);
generalPath.curveTo(592.17413f, 416.98608f, 591.3701f, 409.5821f, 598.93713f, 404.4311f);
generalPath.curveTo(592.4951f, 406.3631f, 588.9531f, 396.0611f, 579.61615f, 400.2461f);
generalPath.curveTo(574.9741f, 402.3281f, 562.7161f, 398.7971f, 562.8782f, 394.4501f);
generalPath.curveTo(560.94415f, 397.6701f, 549.1952f, 396.38312f, 547.58215f, 390.9101f);
generalPath.curveTo(543.7192f, 393.0021f, 534.70215f, 389.46008f, 534.8652f, 384.1481f);
generalPath.curveTo(529.87317f, 386.4021f, 523.1152f, 382.3781f, 523.4352f, 377.2261f);
generalPath.curveTo(518.76917f, 376.5821f, 518.28516f, 372.39612f, 518.6072f, 368.8561f);
generalPath.curveTo(514.4192f, 366.9231f, 515.54816f, 362.8991f, 517.15717f, 358.0701f);
generalPath.curveTo(514.26117f, 354.8501f, 515.54816f, 350.3431f, 517.8022f, 346.1571f);
generalPath.curveTo(514.5822f, 342.9371f, 515.2272f, 339.0741f, 516.1902f, 334.5671f);
generalPath.curveTo(500.73618f, 333.2791f, 481.3772f, 329.5521f, 436.99017f, 315.8941f);
generalPath.curveTo(370.02316f, 295.2891f, 351.99316f, 343.5821f, 366.80316f, 373.8461f);
generalPath.curveTo(383.89017f, 408.7661f, 364.87115f, 416.3461f, 370.66718f, 442.4261f);
generalPath.curveTo(376.78418f, 443.71307f, 380.00317f, 448.8631f, 379.6822f, 454.33807f);
generalPath.curveTo(383.3022f, 454.49606f, 385.8782f, 457.87607f, 384.5912f, 464.31808f);
generalPath.curveTo(387.6492f, 463.7551f, 391.59418f, 464.6381f, 394.1692f, 467.21307f);
generalPath.curveTo(396.4232f, 463.03006f, 403.8292f, 462.06308f, 407.6922f, 466.89307f);
generalPath.curveTo(416.0622f, 466.24606f, 420.2482f, 473.00906f, 419.9272f, 481.38007f);
generalPath.curveTo(424.4322f, 489.43005f, 422.82318f, 499.25107f, 417.99417f, 505.52606f);
generalPath.curveTo(418.47717f, 502.14706f, 417.99417f, 497.31805f, 417.83618f, 494.42206f);
generalPath.curveTo(417.5362f, 489.09305f, 410.10617f, 487.98105f, 410.91217f, 483.63406f);
generalPath.curveTo(407.04816f, 483.95508f, 403.34518f, 481.86407f, 402.05817f, 478.96808f);
generalPath.curveTo(399.80417f, 480.89706f, 396.58417f, 481.5431f, 393.84818f, 480.57608f);
generalPath.curveTo(398.19418f, 482.5091f, 401.57516f, 490.23407f, 400.28717f, 495.3841f);
generalPath.curveTo(402.54117f, 499.2511f, 402.05716f, 506.3341f, 399.32117f, 509.3921f);
generalPath.curveTo(398.03317f, 515.6671f, 393.20416f, 517.9221f, 386.92618f, 515.1841f);
generalPath.curveTo(390.46817f, 512.9341f, 391.75616f, 508.9091f, 391.59418f, 505.5251f);
generalPath.curveTo(389.3412f, 503.5961f, 388.21417f, 499.8921f, 388.0532f, 497.6381f);
generalPath.curveTo(381.7752f, 498.6041f, 373.08218f, 493.29208f, 371.4792f, 491.19208f);
generalPath.curveTo(357.6482f, 491.19208f, 346.4362f, 502.4051f, 346.4362f, 516.2381f);
generalPath.curveTo(345.79218f, 511.0841f, 339.27618f, 506.0091f, 340.08118f, 501.6631f);
generalPath.curveTo(336.21817f, 489.7501f, 341.69116f, 478.6421f, 357.46716f, 476.3921f);
generalPath.curveTo(355.53616f, 471.8841f, 362.29715f, 467.2121f, 359.72116f, 462.06308f);
generalPath.curveTo(356.43115f, 455.4831f, 350.38516f, 446.93008f, 341.37115f, 436.95007f);
generalPath.curveTo(346.84415f, 427.61206f, 345.23416f, 415.05807f, 342.01416f, 407.33008f);
generalPath.curveTo(337.39117f, 396.23407f, 332.99915f, 398.96008f, 316.57916f, 416.98807f);
generalPath.curveTo(289.81915f, 446.37106f, 254.11917f, 438.23807f, 222.56717f, 457.55505f);
generalPath.curveTo(214.18317f, 462.68805f, 205.82617f, 464.63806f, 214.84016f, 455.62506f);
generalPath.curveTo(223.85516f, 446.60907f, 247.68016f, 437.59705f, 263.13318f, 429.86807f);
generalPath.curveTo(292.07318f, 415.39706f, 316.5782f, 391.23306f, 326.23718f, 344.2281f);
generalPath.curveTo(348.93417f, 233.7681f, 432.47717f, 270.1781f, 485.27716f, 290.78308f);
generalPath.curveTo(534.84814f, 310.1291f, 525.8442f, 266.31308f, 500.73117f, 239.91309f);
generalPath.curveTo(470.54816f, 208.18208f, 476.58517f, 183.25009f, 490.75217f, 163.28809f);
generalPath.curveTo(516.1852f, 159.74608f, 564.96515f, 168.60008f, 555.14417f, 177.13309f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_34
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(644.82f, 448.48f);
generalPath.curveTo(660.037f, 448.48f, 672.374f, 436.147f, 672.374f, 420.93002f);
generalPath.curveTo(672.374f, 405.71204f, 660.036f, 393.37604f, 644.82f, 393.37604f);
generalPath.curveTo(629.603f, 393.37604f, 617.266f, 405.71204f, 617.266f, 420.93005f);
generalPath.curveTo(617.266f, 436.14706f, 629.604f, 448.48004f, 644.82f, 448.48004f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(644.82f, 448.48f);
generalPath.curveTo(660.037f, 448.48f, 672.374f, 436.147f, 672.374f, 420.93002f);
generalPath.curveTo(672.374f, 405.71204f, 660.036f, 393.37604f, 644.82f, 393.37604f);
generalPath.curveTo(629.603f, 393.37604f, 617.266f, 405.71204f, 617.266f, 420.93005f);
generalPath.curveTo(617.266f, 436.14706f, 629.604f, 448.48004f, 644.82f, 448.48004f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_0
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(539.7f, 178.41f);
generalPath.curveTo(533.583f, 205.455f, 538.73303f, 217.689f, 547.75f, 229.60101f);
generalPath.curveTo(566.379f, 254.22202f, 581.23303f, 310.41202f, 559.983f, 347.11102f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_1_0
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,1,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(571.89f, 315.41f);
generalPath.curveTo(574.465f, 314.444f, 579.294f, 311.38602f, 580.42303f, 306.073f);
generalPath.moveTo(573.82f, 303.66f);
generalPath.curveTo(574.624f, 298.992f, 581.866f, 296.98f, 582.028f, 291.99f);
generalPath.moveTo(573.98f, 285.46f);
generalPath.curveTo(573.497f, 280.63f, 581.22595f, 276.284f, 580.097f, 271.455f);
generalPath.moveTo(569.8f, 268.08f);
generalPath.curveTo(569.154f, 265.343f, 576.238f, 260.192f, 574.308f, 255.846f);
generalPath.moveTo(564.49f, 251.18f);
generalPath.curveTo(563.04f, 248.12099f, 567.87f, 244.57999f, 565.778f, 241.35999f);
generalPath.moveTo(556.76f, 237.65f);
generalPath.curveTo(556.27704f, 235.558f, 559.256f, 230.97f, 557.64703f, 228.234f);
generalPath.moveTo(549.03f, 221.72f);
generalPath.curveTo(549.67206f, 220.91501f, 552.25f, 218.983f, 551.2f, 216.569f);
generalPath.moveTo(543.72f, 210.05f);
generalPath.curveTo(544.766f, 209.48601f, 547.90295f, 208.52f, 547.503f, 206.187f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_1_1
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(382.58f, 513.57f);
generalPath.curveTo(376.13998f, 511.316f, 368.09198f, 514.537f, 366.482f, 520.012f);
generalPath.moveTo(371.31f, 525.0f);
generalPath.curveTo(372.115f, 519.53f, 380.486f, 517.112f, 383.061f, 519.687f);
generalPath.curveTo(377.749f, 516.792f, 375.173f, 527.09204f, 379.841f, 527.417f);
generalPath.moveTo(423.15f, 397.67f);
generalPath.curveTo(419.288f, 399.60202f, 418.163f, 406.68503f, 423.15f, 411.99902f);
generalPath.moveTo(428.94f, 399.28f);
generalPath.curveTo(426.207f, 401.534f, 426.365f, 408.295f, 430.39f, 409.905f);
generalPath.curveTo(427.01f, 407.49f, 430.39f, 403.305f, 432.807f, 403.144f);
generalPath.curveTo(435.219f, 402.983f, 436.827f, 405.88f, 433.932f, 408.778f);
generalPath.moveTo(655.12f, 415.21f);
generalPath.curveTo(646.108f, 412.797f, 638.862f, 423.25998f, 647.07f, 432.598f);
generalPath.curveTo(646.912f, 423.581f, 653.35004f, 417.62698f, 661.237f, 419.235f);
generalPath.moveTo(657.61f, 425.47f);
generalPath.curveTo(655.393f, 425.47f, 654.148f, 427.203f, 654.148f, 428.89f);
generalPath.curveTo(654.148f, 430.66202f, 655.677f, 432.35303f, 658.17303f, 432.35303f);
generalPath.curveTo(659.78503f, 432.35303f, 661.07306f, 430.50302f, 661.07306f, 429.05304f);
generalPath.moveTo(689.4f, 227.83f);
generalPath.curveTo(690.85004f, 233.30301f, 698.41705f, 235.557f, 704.37103f, 234.27f);
generalPath.moveTo(704.37f, 230.73f);
generalPath.curveTo(699.703f, 230.89099f, 695.83997f, 226.545f, 696.162f, 222.842f);
generalPath.curveTo(696.162f, 225.579f, 702.441f, 226.86699f, 704.37f, 225.096f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_1_2
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,1,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(384.83f, 414.57f);
generalPath.curveTo(383.542f, 411.35f, 388.694f, 408.13f, 388.85498f, 405.07f);
generalPath.curveTo(389.01498f, 402.013f, 394.65f, 399.59802f, 400.44498f, 405.393f);
generalPath.moveTo(397.71f, 371.11f);
generalPath.curveTo(396.58298f, 371.593f, 395.617f, 372.237f, 394.651f, 372.559f);
generalPath.moveTo(408.82f, 388.65f);
generalPath.curveTo(407.45102f, 388.731f, 404.635f, 388.57f, 403.105f, 387.52298f);
generalPath.moveTo(403.19f, 394.77f);
generalPath.curveTo(402.063f, 395.33398f, 399.56702f, 396.3f, 398.118f, 396.62198f);
generalPath.moveTo(347.97f, 492.0f);
generalPath.curveTo(347.809f, 494.9f, 350.707f, 499.083f, 352.316f, 500.37f);
generalPath.moveTo(360.53f, 485.08f);
generalPath.curveTo(358.92f, 487.49298f, 357.955f, 491.68f, 358.92f, 494.576f);
generalPath.moveTo(384.51f, 494.74f);
generalPath.curveTo(381.612f, 492.80698f, 383.544f, 487.815f, 383.22202f, 484.598f);
generalPath.curveTo(382.90002f, 481.378f, 386.60202f, 476.228f, 393.84702f, 480.573f);
generalPath.moveTo(357.47f, 476.39f);
generalPath.curveTo(360.368f, 475.907f, 363.426f, 476.065f, 365.358f, 476.87003f);
generalPath.moveTo(394.17f, 467.21f);
generalPath.curveTo(392.88202f, 468.97998f, 392.56003f, 470.914f, 392.40002f, 472.202f);
generalPath.moveTo(407.69f, 466.89f);
generalPath.curveTo(405.436f, 466.89f, 403.505f, 468.49802f, 402.539f, 470.11002f);
generalPath.moveTo(376.46f, 384.47f);
generalPath.curveTo(379.03598f, 385.356f, 385.716f, 389.46f, 385.95798f, 393.727f);
generalPath.moveTo(403.83f, 363.54f);
generalPath.curveTo(395.942f, 363.379f, 392.88397f, 355.33002f, 398.84f, 355.33002f);
generalPath.moveTo(418.0f, 374.32f);
generalPath.curveTo(414.942f, 375.608f, 416.392f, 380.92f, 420.737f, 383.496f);
generalPath.moveTo(399.16f, 424.87f);
generalPath.curveTo(397.63f, 422.94f, 399.643f, 417.307f, 404.633f, 418.995f);
generalPath.moveTo(410.91f, 483.63f);
generalPath.curveTo(411.23f, 478.72202f, 417.43f, 475.822f, 419.926f, 481.376f);
generalPath.moveTo(388.05f, 497.63f);
generalPath.curveTo(387.64697f, 492.238f, 390.384f, 490.46802f, 392.79797f, 490.147f);
generalPath.curveTo(395.21298f, 489.826f, 398.675f, 491.834f, 400.28497f, 495.376f);
generalPath.moveTo(340.08f, 501.66f);
generalPath.curveTo(340.40198f, 498.44f, 343.13898f, 495.06f, 346.03598f, 495.543f);
generalPath.moveTo(634.67f, 358.71f);
generalPath.curveTo(632.574f, 360.24f, 631.208f, 367.08f, 639.174f, 367.725f);
generalPath.moveTo(622.44f, 369.98f);
generalPath.curveTo(622.44f, 370.785f, 623.486f, 371.91202f, 624.132f, 372.39502f);
generalPath.moveTo(660.43f, 382.86f);
generalPath.curveTo(658.338f, 381.25f, 652.943f, 387.77f, 657.855f, 392.51898f);
generalPath.moveTo(609.24f, 436.95f);
generalPath.curveTo(608.032f, 432.362f, 612.298f, 431.15402f, 616.323f, 432.12003f);
generalPath.moveTo(598.94f, 404.43f);
generalPath.curveTo(601.353f, 402.82f, 603.77f, 401.05f, 606.828f, 400.245f);
generalPath.moveTo(597.65f, 422.13f);
generalPath.curveTo(597.65f, 418.268f, 599.58f, 415.05002f, 601.35004f, 414.084f);
generalPath.moveTo(611.81f, 377.71f);
generalPath.curveTo(611.49f, 382.378f, 613.423f, 386.886f, 614.873f, 389.3f);
generalPath.moveTo(650.13f, 378.03f);
generalPath.curveTo(647.793f, 378.755f, 645.7f, 379.63998f, 644.817f, 381.572f);
generalPath.moveTo(647.55f, 391.23f);
generalPath.curveTo(648.68f, 390.264f, 649.967f, 389.138f, 650.52997f, 388.333f);
generalPath.moveTo(708.4f, 250.69f);
generalPath.curveTo(708.4f, 255.197f, 702.767f, 257.612f, 699.067f, 254.714f);
generalPath.moveTo(720.64f, 250.85f);
generalPath.curveTo(723.132f, 252.78201f, 731.744f, 250.931f, 729.732f, 245.94f);
generalPath.moveTo(710.17f, 276.77f);
generalPath.curveTo(708.39996f, 276.448f, 705.33997f, 274.516f, 704.053f, 272.90698f);
generalPath.moveTo(727.88f, 263.41f);
generalPath.curveTo(724.984f, 264.05402f, 723.05f, 263.41f, 721.6f, 262.766f);
generalPath.moveTo(682.16f, 279.51f);
generalPath.curveTo(683.76794f, 279.51f, 687.62994f, 278.866f, 690.29f, 277.49802f);
generalPath.moveTo(677.33f, 251.02f);
generalPath.curveTo(675.23804f, 250.78f, 673.705f, 251.181f, 672.5f, 251.98601f);
generalPath.moveTo(709.77f, 258.9f);
generalPath.curveTo(709.20703f, 260.913f, 707.757f, 264.051f, 705.987f, 265.41998f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_1_3
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(671.86f, 265.99f);

}

private void _paint2(Graphics2D g,float origAlpha) {
generalPath.curveTo(675.885f, 264.22f, 680.877f, 277.90198f, 690.535f, 273.073f);
generalPath.moveTo(691.34f, 258.9f);
generalPath.curveTo(690.052f, 260.66998f, 689.24805f, 263.408f, 689.086f, 265.822f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_2
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(498.81f, 237.98f);
generalPath.curveTo(500.098f, 237.81999f, 502.352f, 237.336f, 502.835f, 235.726f);
generalPath.moveTo(333.16f, 387.85f);
generalPath.curveTo(337.99f, 390.587f, 341.37f, 395.255f, 339.277f, 402.177f);
generalPath.moveTo(554.5f, 223.17f);
generalPath.curveTo(555.95f, 224.136f, 561.425f, 224.136f, 564.483f, 223.01f);
generalPath.moveTo(568.35f, 226.39f);
generalPath.curveTo(568.18695f, 228.644f, 568.83295f, 237.175f, 564.488f, 238.946f);
generalPath.moveTo(566.1f, 237.82f);
generalPath.curveTo(570.125f, 239.108f, 578.175f, 238.625f, 580.75f, 231.22f);
generalPath.moveTo(575.11f, 237.49f);
generalPath.curveTo(577.20197f, 240.71f, 577.84296f, 246.988f, 571.568f, 250.36801f);
generalPath.moveTo(576.72f, 242.81f);
generalPath.curveTo(581.38696f, 244.42f, 592.17395f, 244.58f, 591.045f, 235.405f);
generalPath.moveTo(587.35f, 242.81f);
generalPath.curveTo(590.56995f, 247.317f, 604.738f, 252.63f, 602.483f, 243.293f);
generalPath.moveTo(574.31f, 255.84f);
generalPath.curveTo(579.77997f, 257.128f, 587.51f, 253.425f, 584.29f, 243.767f);
generalPath.moveTo(599.74f, 248.6f);
generalPath.curveTo(600.544f, 252.30301f, 618.573f, 256.16602f, 616.161f, 247.79501f);
generalPath.moveTo(612.78f, 252.63f);
generalPath.curveTo(616.163f, 260.357f, 634.03f, 259.713f, 628.39703f, 249.41f);
generalPath.moveTo(625.5f, 257.45f);
generalPath.curveTo(629.042f, 261.797f, 644.821f, 259.22f, 638.542f, 248.75702f);
generalPath.moveTo(638.37f, 257.29f);
generalPath.curveTo(648.19f, 264.695f, 659.62f, 254.07f, 647.224f, 246.343f);
generalPath.moveTo(652.86f, 254.88f);
generalPath.curveTo(661.55597f, 261.802f, 672.18097f, 249.24501f, 664.614f, 245.70401f);
generalPath.moveTo(584.12f, 251.98f);
generalPath.curveTo(586.857f, 252.78499f, 592.653f, 252.463f, 593.94f, 247.47299f);
generalPath.moveTo(591.77f, 250.85f);
generalPath.curveTo(591.45f, 258.17502f, 603.766f, 260.992f, 606.903f, 252.54001f);
generalPath.moveTo(602.8f, 257.13f);
generalPath.curveTo(605.054f, 261.96f, 615.838f, 263.89f, 617.608f, 256.969f);
generalPath.moveTo(615.84f, 260.19f);
generalPath.curveTo(617.61005f, 265.02f, 626.948f, 264.537f, 629.523f, 259.546f);
generalPath.moveTo(626.14f, 262.77f);
generalPath.curveTo(629.036f, 269.04797f, 640.948f, 269.04797f, 643.68604f, 259.87198f);
generalPath.moveTo(641.6f, 263.89f);
generalPath.curveTo(646.26697f, 266.78802f, 656.25f, 265.66f, 655.44196f, 256.64603f);
generalPath.moveTo(653.51f, 263.09f);
generalPath.curveTo(660.43f, 268.725f, 670.252f, 263.251f, 665.42303f, 253.75299f);
generalPath.moveTo(664.94f, 270.49f);
generalPath.curveTo(668.644f, 269.84598f, 670.573f, 262.44098f, 666.71f, 260.50998f);
generalPath.moveTo(579.14f, 271.78f);
generalPath.curveTo(586.865f, 267.595f, 588.315f, 260.512f, 583.002f, 253.59f);
generalPath.moveTo(585.74f, 264.7f);
generalPath.curveTo(590.57f, 267.59702f, 599.744f, 264.54f, 601.35297f, 257.45602f);
generalPath.moveTo(592.34f, 265.5f);
generalPath.curveTo(595.073f, 269.041f, 595.557f, 273.388f, 592.015f, 277.412f);
generalPath.moveTo(594.59f, 270.01f);
generalPath.curveTo(603.12006f, 264.698f, 613.744f, 274.518f, 605.85706f, 280.474f);
generalPath.moveTo(604.41f, 269.53f);
generalPath.curveTo(606.34296f, 269.047f, 609.72296f, 265.506f, 610.04297f, 261.481f);
generalPath.moveTo(608.27f, 273.23f);
generalPath.curveTo(611.812f, 269.527f, 635.96204f, 277.09402f, 620.666f, 284.82f);
generalPath.moveTo(619.54f, 263.09f);
generalPath.curveTo(624.207f, 264.86f, 626.623f, 271.461f, 619.54f, 273.715f);
generalPath.moveTo(625.66f, 279.19f);
generalPath.curveTo(630.81f, 273.878f, 646.91f, 277.258f, 641.11395f, 284.02f);
generalPath.moveTo(637.25f, 277.09f);
generalPath.curveTo(640.146f, 267.27f, 657.371f, 273.387f, 651.738f, 277.412f);
generalPath.moveTo(633.71f, 267.27f);
generalPath.curveTo(634.193f, 269.202f, 634.35205f, 274.03098f, 631.135f, 276.607f);
generalPath.moveTo(648.2f, 265.34f);
generalPath.curveTo(648.84204f, 266.94998f, 648.683f, 270.008f, 647.23303f, 271.94f);
generalPath.moveTo(659.14f, 265.5f);
generalPath.curveTo(660.107f, 267.27f, 661.715f, 270.651f, 658.17303f, 273.388f);
generalPath.moveTo(521.35f, 191.45f);
generalPath.curveTo(521.508f, 200.625f, 524.73f, 206.743f, 537.125f, 200.948f);
generalPath.moveTo(525.21f, 202.4f);
generalPath.curveTo(519.093f, 210.61f, 526.01404f, 219.46399f, 538.08905f, 210.61f);
generalPath.moveTo(506.37f, 206.42f);
generalPath.curveTo(514.74f, 215.435f, 529.712f, 208.83499f, 520.053f, 195.151f);
generalPath.moveTo(530.2f, 214.15f);
generalPath.curveTo(528.58704f, 223.004f, 535.833f, 224.775f, 541.788f, 220.75f);
generalPath.moveTo(498.97f, 207.87f);
generalPath.curveTo(500.495f, 216.771f, 509.595f, 223.80699f, 518.449f, 218.334f);
generalPath.moveTo(509.92f, 220.11f);
generalPath.curveTo(509.92f, 232.828f, 527.466f, 234.276f, 531.491f, 221.076f);
generalPath.moveTo(525.21f, 229.12f);
generalPath.curveTo(530.843f, 240.70999f, 543.077f, 236.04199f, 547.10205f, 228.95999f);
generalPath.moveTo(512.81f, 210.61f);
generalPath.curveTo(515.064f, 216.244f, 519.573f, 222.523f, 530.035f, 217.854f);
generalPath.moveTo(480.62f, 207.87f);
generalPath.curveTo(482.07f, 212.538f, 490.44f, 218.17299f, 500.099f, 211.733f);
generalPath.moveTo(486.57f, 213.83f);
generalPath.curveTo(481.41602f, 221.396f, 491.72f, 228.479f, 504.116f, 217.21f);
generalPath.moveTo(492.69f, 223.17f);
generalPath.curveTo(494.782f, 233.795f, 498.965f, 242.327f, 514.098f, 228.643f);
generalPath.moveTo(506.53f, 234.11f);
generalPath.curveTo(512.005f, 240.87f, 520.376f, 245.056f, 528.263f, 233.627f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_3
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(534.06f, 236.04f);
generalPath.curveTo(533.577f, 244.08899f, 535.185f, 248.11299f, 541.464f, 247.791f);
generalPath.curveTo(546.414f, 247.538f, 551.123f, 243.606f, 553.86f, 239.421f);
generalPath.moveTo(540.34f, 247.8f);
generalPath.curveTo(540.177f, 256.976f, 547.42004f, 264.22f, 560.94403f, 254.883f);
generalPath.moveTo(545.97f, 258.58f);
generalPath.curveTo(543.39496f, 265.50198f, 551.12f, 276.77f, 566.253f, 270.97498f);
generalPath.moveTo(513.94f, 240.23f);
generalPath.curveTo(512.977f, 249.084f, 521.186f, 255.04f, 534.386f, 243.61f);
generalPath.moveTo(520.38f, 250.05f);
generalPath.curveTo(520.863f, 257.294f, 529.072f, 265.987f, 541.14703f, 253.43001f);
generalPath.moveTo(526.17f, 259.23f);
generalPath.curveTo(525.203f, 271.625f, 536.633f, 275.16702f, 546.29095f, 265.67f);
generalPath.moveTo(508.95f, 250.05f);
generalPath.curveTo(511.52502f, 250.211f, 513.617f, 247.95801f, 514.904f, 246.347f);
generalPath.moveTo(514.42f, 259.06f);
generalPath.curveTo(516.674f, 259.543f, 520.54f, 257.45f, 521.828f, 254.875f);
generalPath.moveTo(520.06f, 273.71f);
generalPath.curveTo(522.635f, 276.447f, 531.327f, 274.51498f, 532.452f, 270.813f);
generalPath.moveTo(529.72f, 273.55f);
generalPath.curveTo(534.55f, 284.818f, 547.42395f, 284.335f, 552.737f, 271.61798f);
generalPath.moveTo(550.32f, 276.13f);
generalPath.curveTo(552.73303f, 282.73f, 558.853f, 286.915f, 568.833f, 284.66202f);
generalPath.moveTo(555.15f, 282.89f);
generalPath.curveTo(549.517f, 292.066f, 556.92004f, 302.851f, 569.47504f, 292.22702f);
generalPath.moveTo(558.21f, 296.57f);
generalPath.curveTo(557.568f, 302.36502f, 562.88f, 308.965f, 570.12305f, 309.77002f);
generalPath.moveTo(534.38f, 279.67f);
generalPath.curveTo(532.447f, 292.709f, 541.784f, 298.988f, 553.538f, 292.065f);
generalPath.moveTo(520.7f, 285.95f);
generalPath.curveTo(523.758f, 288.36502f, 529.23303f, 288.687f, 534.383f, 286.755f);
generalPath.moveTo(540.66f, 294.32f);
generalPath.curveTo(537.75995f, 305.267f, 549.02997f, 313.155f, 558.68896f, 300.92f);
generalPath.moveTo(525.05f, 287.72f);
generalPath.curveTo(525.213f, 293.354f, 530.688f, 299.471f, 540.183f, 297.7f);
generalPath.moveTo(566.74f, 308.97f);
generalPath.curveTo(560.298f, 313.316f, 559.01f, 321.043f, 568.028f, 326.033f);
generalPath.moveTo(550.96f, 306.71f);
generalPath.curveTo(551.28503f, 313.31f, 554.343f, 317.013f, 561.585f, 317.656f);
generalPath.moveTo(541.47f, 303.33f);
generalPath.curveTo(531.81195f, 312.184f, 541.30695f, 322.487f, 552.737f, 313.79398f);
generalPath.moveTo(548.23f, 316.53f);
generalPath.curveTo(545.01f, 326.672f, 557.084f, 332.789f, 563.522f, 322.486f);
generalPath.moveTo(528.27f, 294.96f);
generalPath.curveTo(524.728f, 304.94f, 529.237f, 311.541f, 537.445f, 310.897f);
generalPath.moveTo(515.55f, 293.03f);
generalPath.curveTo(516.03296f, 298.986f, 521.183f, 301.079f, 526.979f, 299.791f);
generalPath.moveTo(519.25f, 299.31f);
generalPath.curveTo(514.904f, 307.68f, 521.504f, 312.188f, 530.2f, 308.969f);
generalPath.moveTo(556.6f, 327.64f);
generalPath.curveTo(555.14996f, 332.95203f, 555.954f, 336.816f, 563.842f, 338.587f);
generalPath.moveTo(557.08f, 335.21f);
generalPath.curveTo(547.58f, 339.557f, 546.776f, 348.733f, 554.18f, 354.688f);
generalPath.moveTo(549.43f, 324.99f);
generalPath.curveTo(544.443f, 329.498f, 545.40497f, 337.304f, 550.88f, 340.36298f);
generalPath.moveTo(507.18f, 295.61f);
generalPath.curveTo(501.705f, 301.003f, 506.938f, 315.89297f, 519.009f, 307.76498f);
generalPath.moveTo(538.57f, 314.44f);
generalPath.curveTo(531.162f, 320.557f, 534.545f, 331.665f, 546.778f, 328.60602f);
generalPath.moveTo(526.33f, 309.77f);
generalPath.curveTo(522.468f, 320.71698f, 526.172f, 324.58f, 534.86304f, 324.741f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_4
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(499.13f, 295.12f);
generalPath.curveTo(492.53f, 300.11f, 494.30002f, 307.193f, 497.2f, 310.413f);
generalPath.curveTo(500.09702f, 313.633f, 505.56802f, 312.18298f, 507.33902f, 307.998f);
generalPath.moveTo(485.28f, 290.78f);
generalPath.curveTo(477.876f, 300.27798f, 485.28f, 311.546f, 495.747f, 308.166f);
generalPath.moveTo(524.89f, 318.95f);
generalPath.curveTo(517.323f, 321.687f, 511.552f, 328.557f, 516.19403f, 334.565f);
generalPath.curveTo(518.932f, 338.107f, 530.84406f, 338.59f, 534.22406f, 324.906f);
generalPath.moveTo(511.2f, 310.09f);
generalPath.curveTo(506.854f, 316.36798f, 508.30002f, 322.32498f, 516.35004f, 325.383f);
generalPath.moveTo(510.72f, 321.85f);
generalPath.curveTo(506.05f, 324.426f, 502.99f, 327.48502f, 504.12f, 333.11902f);
generalPath.moveTo(500.26f, 312.03f);
generalPath.curveTo(498.49002f, 319.596f, 500.58002f, 324.26498f, 505.247f, 326.518f);
generalPath.moveTo(500.1f, 321.04f);
generalPath.curveTo(492.854f, 320.557f, 489.154f, 323.61502f, 491.56702f, 330.699f);
generalPath.moveTo(492.21f, 322.81f);
generalPath.curveTo(485.12698f, 320.234f, 483.99698f, 314.117f, 487.056f, 307.678f);
generalPath.moveTo(486.09f, 317.18f);
generalPath.curveTo(478.36f, 317.50198f, 474.982f, 321.365f, 474.982f, 326.67798f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_5
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(475.62f, 287.07f);
generalPath.curveTo(469.987f, 289.48502f, 468.216f, 297.05002f, 470.307f, 301.23602f);
generalPath.curveTo(472.403f, 305.42102f, 479.00302f, 305.74402f, 483.028f, 303.006f);
generalPath.moveTo(459.85f, 281.12f);
generalPath.curveTo(454.7f, 286.915f, 460.654f, 298.184f, 469.833f, 295.447f);
generalPath.moveTo(446.65f, 276.61f);
generalPath.curveTo(441.82f, 283.37f, 447.133f, 294.63998f, 459.529f, 291.41998f);
generalPath.moveTo(460.17f, 322.81f);
generalPath.curveTo(458.88202f, 314.76f, 467.25302f, 309.449f, 477.558f, 319.912f);
generalPath.moveTo(472.57f, 303.66f);
generalPath.curveTo(469.512f, 306.397f, 468.066f, 310.743f, 468.545f, 314.285f);
generalPath.moveTo(433.45f, 272.75f);
generalPath.curveTo(428.13702f, 281.765f, 434.58002f, 289.975f, 446.00803f, 286.755f);
generalPath.moveTo(463.23f, 295.12f);
generalPath.curveTo(455.66302f, 302.686f, 458.238f, 310.25198f, 463.872f, 314.598f);
generalPath.moveTo(458.4f, 303.98f);
generalPath.curveTo(446.971f, 304.14f, 446.32898f, 317.341f, 455.667f, 321.527f);
generalPath.moveTo(449.71f, 290.78f);
generalPath.curveTo(445.043f, 294.0f, 443.593f, 302.853f, 451.643f, 306.395f);
generalPath.moveTo(449.39f, 310.58f);
generalPath.curveTo(444.56003f, 308.326f, 438.765f, 311.063f, 439.24802f, 316.697f);
generalPath.moveTo(442.14f, 310.74f);
generalPath.curveTo(437.794f, 300.43698f, 425.07703f, 302.20798f, 426.207f, 312.83298f);
generalPath.moveTo(445.68f, 298.02f);
generalPath.curveTo(442.947f, 298.503f, 437.472f, 300.112f, 435.38f, 304.29797f);
generalPath.moveTo(436.19f, 286.43f);
generalPath.curveTo(431.04f, 292.225f, 435.06f, 299.147f, 439.24802f, 300.596f);
generalPath.moveTo(420.9f, 270.17f);
generalPath.curveTo(419.93298f, 277.092f, 422.66998f, 280.47302f, 431.363f, 279.829f);
generalPath.moveTo(423.95f, 279.03f);
generalPath.curveTo(420.56702f, 287.4f, 425.075f, 291.103f, 433.767f, 290.62f);
generalPath.moveTo(425.88f, 289.33f);
generalPath.curveTo(420.73f, 295.447f, 424.272f, 302.04797f, 429.26f, 304.784f);
generalPath.moveTo(423.47f, 297.06f);
generalPath.curveTo(414.295f, 295.93298f, 412.845f, 306.55798f, 415.903f, 311.548f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_6
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(416.06f, 269.37f);
generalPath.curveTo(410.428f, 271.785f, 407.208f, 278.86798f, 410.267f, 283.214f);
generalPath.curveTo(413.327f, 287.56f, 419.443f, 286.111f, 422.823f, 283.858f);
generalPath.moveTo(412.2f, 285.14f);
generalPath.curveTo(407.532f, 292.22302f, 411.717f, 297.535f, 416.708f, 299.62802f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_7
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(394.17f, 268.56f);
generalPath.curveTo(390.46802f, 272.423f, 392.721f, 280.312f, 401.73602f, 280.473f);
generalPath.curveTo(408.99402f, 280.603f, 412.68204f, 273.712f, 410.42902f, 268.883f);
generalPath.moveTo(400.45f, 280.47f);
generalPath.curveTo(397.553f, 286.91f, 399.323f, 293.831f, 410.27002f, 292.704f);
generalPath.moveTo(414.94f, 302.85f);
generalPath.curveTo(408.18f, 299.792f, 399.164f, 302.85f, 403.028f, 310.9f);
generalPath.moveTo(402.06f, 291.42f);
generalPath.curveTo(399.323f, 295.28302f, 400.29f, 300.75702f, 403.348f, 304.13702f);
generalPath.moveTo(401.58f, 301.72f);
generalPath.curveTo(397.072f, 302.525f, 392.72598f, 304.94f, 395.46298f, 312.023f);
generalPath.moveTo(394.81f, 306.23f);
generalPath.curveTo(389.01498f, 304.46002f, 381.61f, 308.64502f, 386.117f, 314.6f);
generalPath.moveTo(385.16f, 308.97f);
generalPath.curveTo(380.17f, 308.165f, 374.214f, 313.477f, 379.043f, 318.79f);
generalPath.moveTo(377.11f, 314.44f);
generalPath.curveTo(372.602f, 315.56702f, 367.28998f, 320.71802f, 371.95798f, 324.743f);
generalPath.moveTo(399.81f, 289.17f);
generalPath.curveTo(393.37f, 292.06702f, 392.727f, 299.312f, 395.785f, 304.62402f);
generalPath.moveTo(393.04f, 275.81f);
generalPath.curveTo(383.381f, 279.513f, 383.54202f, 292.391f, 394.16702f, 296.415f);
generalPath.moveTo(389.66f, 293.51f);
generalPath.curveTo(383.865f, 296.89f, 382.738f, 303.33002f, 386.602f, 307.515f);
generalPath.moveTo(379.52f, 270.98f);
generalPath.curveTo(375.65598f, 272.268f, 375.978f, 284.18002f, 386.28098f, 283.858f);
generalPath.moveTo(368.9f, 275.0f);
generalPath.curveTo(361.173f, 280.151f, 370.50998f, 293.19f, 383.06598f, 283.854f);
generalPath.moveTo(376.14f, 287.07f);
generalPath.curveTo(375.013f, 292.383f, 376.462f, 298.178f, 384.99402f, 298.82202f);
generalPath.moveTo(376.62f, 294.16f);
generalPath.curveTo(370.503f, 296.413f, 369.376f, 308.97f, 380.483f, 309.936f);
generalPath.moveTo(357.15f, 282.73f);
generalPath.curveTo(349.262f, 289.974f, 363.59f, 296.252f, 368.902f, 285.789f);
generalPath.moveTo(346.2f, 294.8f);
generalPath.curveTo(342.336f, 299.468f, 355.858f, 311.703f, 361.815f, 291.258f);
generalPath.moveTo(363.26f, 290.94f);
generalPath.curveTo(363.582f, 295.77f, 366.48f, 298.667f, 372.435f, 298.989f);
generalPath.moveTo(372.28f, 303.66f);
generalPath.curveTo(362.782f, 305.109f, 359.724f, 317.021f, 370.348f, 319.59702f);
generalPath.moveTo(354.73f, 302.05f);
generalPath.curveTo(354.40802f, 306.55698f, 359.07602f, 310.25998f, 364.389f, 309.455f);
generalPath.moveTo(369.22f, 319.27f);
generalPath.curveTo(360.527f, 321.202f, 359.4f, 332.47f, 367.128f, 331.826f);
generalPath.moveTo(363.1f, 342.29f);
generalPath.curveTo(355.855f, 340.117f, 355.695f, 331.504f, 362.134f, 328.285f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_8
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(357.15f, 334.72f);
generalPath.curveTo(351.033f, 338.423f, 353.448f, 347.276f, 356.667f, 348.564f);
generalPath.curveTo(359.887f, 349.852f, 362.462f, 348.242f, 362.785f, 345.50598f);
generalPath.moveTo(362.3f, 357.9f);
generalPath.curveTo(362.944f, 362.085f, 347.409f, 360.47598f, 355.378f, 347.43698f);
generalPath.moveTo(355.29f, 358.63f);
generalPath.curveTo(350.05902f, 366.84f, 358.59f, 373.52002f, 363.983f, 366.518f);
generalPath.moveTo(356.02f, 368.53f);
generalPath.curveTo(353.927f, 375.13f, 361.895f, 379.88f, 367.046f, 374.728f);
generalPath.moveTo(338.63f, 306.71f);
generalPath.curveTo(335.732f, 312.666f, 350.22f, 314.91998f, 351.186f, 302.685f);
generalPath.moveTo(334.61f, 315.57f);
generalPath.curveTo(331.71298f, 327.16f, 353.60498f, 324.746f, 347.97098f, 309.775f);
generalPath.moveTo(348.45f, 317.5f);
generalPath.curveTo(351.50803f, 319.27f, 360.685f, 319.432f, 362.93802f, 309.612f);
generalPath.moveTo(356.34f, 317.82f);
generalPath.curveTo(356.984f, 320.87802f, 359.72f, 324.58002f, 362.296f, 325.708f);
generalPath.moveTo(345.88f, 320.88f);
generalPath.curveTo(344.914f, 327.15802f, 351.19202f, 332.31f, 358.436f, 331.827f);
generalPath.moveTo(347.0f, 327.0f);
generalPath.curveTo(343.459f, 331.83f, 342.332f, 341.16602f, 353.44f, 341.81f);
generalPath.moveTo(330.1f, 328.61f);
generalPath.curveTo(328.33002f, 333.59998f, 338.793f, 338.75198f, 344.91f, 330.542f);
generalPath.moveTo(326.88f, 341.32f);
generalPath.curveTo(325.99402f, 345.104f, 335.41202f, 350.174f, 340.724f, 334.07602f);
generalPath.moveTo(336.54f, 342.29f);
generalPath.curveTo(338.794f, 346.314f, 346.36002f, 349.534f, 351.028f, 341.646f);
generalPath.moveTo(343.46f, 346.48f);
generalPath.curveTo(341.52798f, 352.114f, 346.84f, 357.42603f, 353.28f, 355.81702f);
generalPath.moveTo(331.39f, 345.19f);
generalPath.curveTo(330.10202f, 353.239f, 339.43903f, 357.907f, 345.234f, 353.72202f);
generalPath.moveTo(325.27f, 348.73f);
generalPath.curveTo(322.534f, 359.03302f, 335.73398f, 362.896f, 340.724f, 355.169f);
generalPath.moveTo(337.35f, 358.23f);
generalPath.curveTo(337.833f, 364.02502f, 346.848f, 369.015f, 353.931f, 364.186f);
generalPath.moveTo(321.25f, 363.06f);
generalPath.curveTo(320.606f, 365.635f, 331.392f, 368.211f, 333.001f, 359.19598f);
generalPath.moveTo(327.53f, 365.31f);
generalPath.curveTo(330.105f, 371.91f, 338.798f, 373.52f, 343.789f, 365.471f);
generalPath.moveTo(340.89f, 368.69f);
generalPath.curveTo(342.01703f, 374.807f, 349.90503f, 378.188f, 356.82703f, 374.002f);
generalPath.moveTo(359.72f, 376.42f);
generalPath.curveTo(357.95f, 384.63f, 366.481f, 391.23f, 371.793f, 386.72302f);
generalPath.moveTo(346.04f, 374.97f);
generalPath.curveTo(343.465f, 383.98502f, 354.733f, 389.136f, 361.01102f, 384.146f);
generalPath.moveTo(332.52f, 370.46f);
generalPath.curveTo(331.87598f, 378.83f, 338.47598f, 383.82098f, 346.042f, 380.11798f);
generalPath.moveTo(318.19f, 371.27f);
generalPath.curveTo(315.936f, 376.74298f, 327.849f, 381.25f, 333.483f, 376.58298f);
generalPath.moveTo(310.78f, 386.24f);
generalPath.curveTo(313.839f, 389.78098f, 324.463f, 386.24f, 325.429f, 378.352f);
generalPath.moveTo(322.54f, 384.14f);
generalPath.curveTo(326.403f, 388.648f, 335.579f, 391.062f, 339.282f, 381.403f);
generalPath.moveTo(336.06f, 386.4f);
generalPath.curveTo(335.899f, 393.322f, 348.29498f, 398.313f, 352.319f, 385.595f);
generalPath.moveTo(366.88f, 388.09f);
generalPath.curveTo(365.753f, 391.47f, 368.41f, 396.863f, 373.963f, 397.507f);
generalPath.moveTo(356.66f, 386.0f);
generalPath.curveTo(355.855f, 389.863f, 361.49f, 395.255f, 367.446f, 393.083f);
generalPath.moveTo(368.58f, 394.69f);
generalPath.curveTo(366.97f, 398.875f, 368.33798f, 404.911f, 373.972f, 404.831f);
generalPath.moveTo(369.14f, 402.5f);
generalPath.curveTo(364.95502f, 406.041f, 366.725f, 412.32f, 372.763f, 412.562f);
generalPath.moveTo(366.97f, 408.45f);
generalPath.curveTo(361.014f, 412.47202f, 363.107f, 421.32703f, 370.994f, 420.84802f);
generalPath.moveTo(348.94f, 391.39f);
generalPath.curveTo(348.94f, 400.083f, 359.725f, 401.37003f, 361.818f, 393.32202f);
generalPath.moveTo(357.63f, 398.47f);
generalPath.curveTo(356.02002f, 403.621f, 360.20502f, 408.612f, 366.805f, 407.163f);
generalPath.moveTo(358.92f, 460.61f);
generalPath.curveTo(360.37003f, 462.706f, 366.325f, 459.16397f, 364.71503f, 455.623f);
generalPath.curveTo(363.10504f, 452.081f, 356.79602f, 454.00598f, 357.47104f, 457.714f);
generalPath.moveTo(363.26f, 454.17f);
generalPath.curveTo(364.065f, 447.087f, 355.694f, 445.962f, 353.601f, 452.078f);
generalPath.moveTo(356.66f, 448.54f);
generalPath.curveTo(358.753f, 444.99802f, 351.67f, 440.17f, 348.772f, 445.32f);
generalPath.moveTo(351.35f, 443.22f);
generalPath.curveTo(353.282f, 438.066f, 345.233f, 435.816f, 344.58902f, 440.483f);
generalPath.moveTo(342.82f, 433.72f);
generalPath.curveTo(343.786f, 431.145f, 352.80002f, 432.753f, 348.937f, 438.066f);
generalPath.moveTo(355.86f, 444.51f);
generalPath.curveTo(359.40198f, 441.29f, 353.44598f, 434.69f, 349.74298f, 437.10602f);
generalPath.moveTo(379.68f, 454.33f);
generalPath.curveTo(376.862f, 454.65f, 373.964f, 456.5f, 376.057f, 462.46f);
generalPath.curveTo(377.508f, 466.593f, 383.704f, 466.805f, 384.58902f, 464.31f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_9
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(375.58f, 457.31f);
generalPath.curveTo(372.843f, 455.54f, 366.887f, 458.518f, 369.624f, 464.314f);
generalPath.curveTo(371.684f, 468.677f, 376.86798f, 466.889f, 377.673f, 464.635f);
generalPath.moveTo(360.2f, 465.6f);
generalPath.curveTo(361.56702f, 468.013f, 368.409f, 466.97f, 369.617f, 464.312f);
generalPath.moveTo(364.87f, 457.63f);
generalPath.curveTo(366.319f, 456.663f, 368.974f, 457.867f, 369.538f, 459.07602f);
generalPath.moveTo(364.39f, 417.95f);
generalPath.curveTo(359.72202f, 421.00803f, 362.62003f, 430.346f, 369.863f, 427.93002f);
generalPath.moveTo(362.94f, 425.52f);
generalPath.curveTo(359.237f, 428.416f, 362.618f, 437.43298f, 369.54f, 434.05298f);
generalPath.moveTo(364.07f, 434.05f);
generalPath.curveTo(361.495f, 436.625f, 363.99002f, 443.788f, 370.67f, 442.41998f);
generalPath.moveTo(363.1f, 437.59f);
generalPath.curveTo(361.65f, 436.944f, 357.868f, 437.427f, 356.25702f, 439.84f);
generalPath.moveTo(358.92f, 404.99f);
generalPath.curveTo(355.37903f, 408.37f, 357.06802f, 415.29398f, 363.668f, 415.856f);
generalPath.moveTo(357.63f, 412.07f);
generalPath.curveTo(352.558f, 414.566f, 352.558f, 424.624f, 362.7f, 425.028f);
generalPath.moveTo(357.23f, 423.42f);
generalPath.curveTo(354.41302f, 425.674f, 355.781f, 434.36603f, 363.02502f, 433.237f);
generalPath.moveTo(359.56f, 432.92f);
generalPath.curveTo(358.513f, 433.966f, 358.352f, 436.62402f, 359.238f, 437.75f);
generalPath.moveTo(356.34f, 429.62f);
generalPath.curveTo(353.76498f, 429.69998f, 350.384f, 431.553f, 349.497f, 434.208f);
generalPath.moveTo(344.83f, 424.87f);
generalPath.curveTo(345.796f, 422.29498f, 353.76498f, 422.457f, 354.32797f, 430.024f);
generalPath.moveTo(355.13f, 421.01f);
generalPath.curveTo(354.003f, 421.252f, 351.83002f, 422.298f, 351.267f, 424.47202f);
generalPath.moveTo(351.67f, 397.43f);
generalPath.curveTo(348.208f, 400.569f, 346.519f, 410.47f, 357.062f, 412.4f);
generalPath.moveTo(344.67f, 417.87f);
generalPath.curveTo(344.67f, 415.212f, 351.834f, 412.958f, 354.329f, 416.90298f);
generalPath.moveTo(340.08f, 403.46f);
generalPath.curveTo(341.12598f, 405.473f, 346.116f, 408.21f, 349.175f, 405.956f);
generalPath.moveTo(314.16f, 387.69f);
generalPath.curveTo(314.0f, 392.358f, 317.863f, 396.544f, 323.17502f, 395.9f);
generalPath.curveTo(328.48703f, 395.25598f, 329.61502f, 390.587f, 328.005f, 387.529f);
generalPath.moveTo(323.98f, 396.06f);
generalPath.curveTo(320.43802f, 400.406f, 324.785f, 406.524f, 328.81f, 404.753f);
generalPath.moveTo(328.01f, 393.0f);
generalPath.curveTo(330.103f, 392.195f, 337.02502f, 391.23f, 339.118f, 394.449f);
generalPath.moveTo(305.63f, 394.29f);
generalPath.curveTo(304.02002f, 396.70502f, 314.001f, 399.12f, 317.381f, 394.45f);
generalPath.moveTo(314.0f, 396.86f);
generalPath.curveTo(313.677f, 400.08f, 315.288f, 405.55298f, 323.498f, 403.3f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_10
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(324.79f, 408.29f);
generalPath.curveTo(326.078f, 405.553f, 319.96002f, 401.04602f, 315.29202f, 406.036f);
generalPath.curveTo(310.62402f, 411.026f, 315.93604f, 416.661f, 318.834f, 414.728f);
generalPath.moveTo(303.38f, 397.51f);
generalPath.curveTo(300.965f, 401.695f, 310.302f, 409.34302f, 315.615f, 402.26f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_11
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(297.18f, 404.75f);
generalPath.curveTo(293.8f, 408.212f, 297.985f, 414.57f, 303.056f, 412.638f);
generalPath.curveTo(308.126f, 410.706f, 307.644f, 405.394f, 306.437f, 404.026f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_12
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(290.66f, 411.19f);
generalPath.curveTo(287.923f, 413.684f, 290.579f, 419.56f, 294.363f, 419.56f);
generalPath.curveTo(298.14502f, 419.56f, 300.48f, 416.58398f, 299.755f, 412.8f);
generalPath.moveTo(306.03f, 410.71f);
generalPath.curveTo(305.547f, 414.412f, 311.02f, 416.987f, 314.562f, 413.529f);
generalPath.moveTo(314.73f, 406.76f);
generalPath.curveTo(315.213f, 405.95502f, 314.811f, 404.586f, 314.00702f, 403.94202f);
generalPath.moveTo(284.79f, 416.18f);
generalPath.curveTo(281.652f, 418.676f, 288.413f, 425.597f, 292.678f, 419.238f);
generalPath.moveTo(309.01f, 414.81f);
generalPath.curveTo(306.997f, 416.74f, 310.217f, 421.81f, 313.436f, 420.28f);
generalPath.moveTo(297.99f, 418.35f);
generalPath.curveTo(298.473f, 421.808f, 305.23398f, 424.383f, 309.5f, 419.075f);
generalPath.moveTo(301.69f, 421.81f);
generalPath.curveTo(300.644f, 423.985f, 302.737f, 427.448f, 305.313f, 426.964f);
generalPath.moveTo(365.76f, 441.7f);
generalPath.curveTo(363.26602f, 446.608f, 371.233f, 452.325f, 377.02902f, 446.367f);
generalPath.moveTo(371.55f, 449.02f);
generalPath.curveTo(370.343f, 451.67398f, 371.792f, 455.378f, 373.965f, 456.745f);
generalPath.moveTo(363.99f, 454.57f);
generalPath.curveTo(364.554f, 452.153f, 368.01398f, 449.9f, 371.154f, 451.028f);
generalPath.moveTo(359.8f, 448.21f);
generalPath.curveTo(360.283f, 446.03998f, 363.18f, 443.86398f, 365.35397f, 444.43f);
generalPath.moveTo(549.35f, 347.76f);
generalPath.curveTo(537.92096f, 347.92102f, 542.75f, 366.273f, 552.56995f, 362.57f);
generalPath.moveTo(545.65f, 361.29f);
generalPath.curveTo(543.396f, 364.993f, 547.742f, 370.86902f, 552.57f, 367.407f);
generalPath.moveTo(551.29f, 368.13f);
generalPath.curveTo(547.907f, 373.764f, 559.982f, 382.376f, 564.811f, 373.522f);
generalPath.moveTo(560.95f, 376.9f);
generalPath.curveTo(561.10803f, 382.21298f, 576.563f, 385.593f, 574.313f, 374.968f);
generalPath.moveTo(572.86f, 380.76f);
generalPath.curveTo(576.56f, 387.03802f, 590.406f, 387.682f, 588.956f, 378.345f);
generalPath.moveTo(585.9f, 384.79f);
generalPath.curveTo(588.80005f, 388.975f, 602.32104f, 391.55002f, 601.838f, 382.858f);
generalPath.moveTo(531.0f, 331.83f);
generalPath.curveTo(532.93f, 336.81998f, 539.53f, 338.59097f, 546.775f, 335.693f);
generalPath.moveTo(526.82f, 335.37f);
generalPath.curveTo(531.328f, 338.267f, 524.728f, 351.468f, 517.808f, 346.155f);
generalPath.moveTo(526.82f, 343.58f);
generalPath.curveTo(531.812f, 345.995f, 537.928f, 344.224f, 539.69904f, 337.13998f);
generalPath.moveTo(536.64f, 342.61f);
generalPath.curveTo(537.123f, 346.313f, 542.43604f, 349.21f, 549.357f, 347.761f);
generalPath.moveTo(524.24f, 346.48f);
generalPath.curveTo(530.682f, 351.953f, 521.344f, 363.22202f, 517.157f, 358.07f);
generalPath.moveTo(526.66f, 350.66f);
generalPath.curveTo(529.71796f, 352.914f, 537.60596f, 351.626f, 538.41f, 345.67f);
generalPath.moveTo(534.87f, 350.66f);
generalPath.curveTo(535.516f, 354.523f, 538.574f, 355.97202f, 542.92f, 356.133f);
generalPath.moveTo(524.89f, 355.97f);
generalPath.curveTo(528.107f, 360.478f, 536.15704f, 361.765f, 539.698f, 355.81f);
generalPath.moveTo(536.15f, 359.19f);
generalPath.curveTo(535.83f, 363.537f, 540.658f, 367.078f, 545.65f, 366.112f);
generalPath.moveTo(518.61f, 368.85f);
generalPath.curveTo(522.79297f, 370.94202f, 527.302f, 363.055f, 523.76f, 357.582f);
generalPath.moveTo(523.44f, 377.22f);
generalPath.curveTo(528.432f, 377.542f, 529.073f, 369.976f, 524.407f, 365.79f);
generalPath.moveTo(534.87f, 384.14f);
generalPath.curveTo(539.058f, 383.174f, 537.766f, 373.99802f, 527.624f, 373.19302f);
generalPath.moveTo(547.58f, 390.91f);
generalPath.curveTo(551.60504f, 389.783f, 548.38403f, 379.641f, 537.28f, 380.285f);
generalPath.moveTo(562.88f, 394.45f);
generalPath.curveTo(565.613f, 390.265f, 556.6f, 383.182f, 549.197f, 386.884f);
generalPath.moveTo(570.44f, 400.24f);
generalPath.curveTo(575.432f, 401.689f, 578.81f, 388.48898f, 563.036f, 390.581f);
generalPath.moveTo(579.62f, 400.24f);
generalPath.curveTo(583.97f, 399.11298f, 587.028f, 391.22498f, 574.312f, 393.8f);
generalPath.moveTo(589.28f, 400.89f);
generalPath.curveTo(593.142f, 402.82202f, 594.913f, 391.553f, 583.16003f, 394.612f);
generalPath.moveTo(524.4f, 365.79f);
generalPath.curveTo(529.23004f, 368.527f, 536.796f, 365.307f, 536.15f, 359.19f);
generalPath.moveTo(534.22f, 364.51f);
generalPath.curveTo(535.83295f, 367.407f, 535.18695f, 373.04202f, 532.128f, 374.49002f);
generalPath.moveTo(534.7f, 371.27f);
generalPath.curveTo(537.92f, 372.55798f, 542.267f, 371.431f, 544.84204f, 366.28f);
generalPath.moveTo(540.34f, 371.27f);
generalPath.curveTo(541.30304f, 373.524f, 541.62805f, 378.03098f, 539.53204f, 380.285f);
generalPath.moveTo(541.15f, 375.13f);
generalPath.curveTo(544.692f, 377.062f, 548.875f, 374.486f, 550.646f, 370.78302f);
generalPath.moveTo(548.39f, 374.0f);
generalPath.curveTo(550.965f, 375.61f, 553.22003f, 383.176f, 548.873f, 386.235f);
generalPath.moveTo(551.29f, 382.7f);
generalPath.curveTo(554.34796f, 382.86002f, 558.857f, 382.86002f, 561.753f, 378.997f);
generalPath.moveTo(559.66f, 381.09f);
generalPath.curveTo(562.397f, 381.895f, 565.61395f, 386.40298f, 564.49f, 390.427f);
generalPath.moveTo(564.65f, 388.97f);
generalPath.curveTo(567.713f, 388.648f, 573.02f, 386.555f, 574.47003f, 382.853f);
generalPath.moveTo(573.02f, 385.27f);
generalPath.curveTo(575.60004f, 386.719f, 577.37f, 389.77698f, 577.04504f, 393.319f);
generalPath.moveTo(577.04f, 390.74f);
generalPath.curveTo(580.09796f, 390.58f, 582.836f, 388.97f, 583.63995f, 385.589f);
generalPath.moveTo(582.84f, 387.85f);
generalPath.curveTo(585.09406f, 388.655f, 587.83203f, 391.23f, 587.994f, 394.29f);
generalPath.moveTo(587.67f, 392.35f);
generalPath.curveTo(589.924f, 392.028f, 591.532f, 390.58002f, 592.983f, 388.325f);
generalPath.moveTo(599.1f, 388.01f);
generalPath.curveTo(602.0f, 390.90802f, 598.13696f, 400.56702f, 592.18f, 398.79602f);
generalPath.moveTo(537.28f, 192.9f);
generalPath.curveTo(531.322f, 196.441f, 514.41705f, 195.31499f, 522.788f, 181.31f);
generalPath.moveTo(538.89f, 183.4f);
generalPath.curveTo(527.14f, 188.068f, 512.648f, 179.054f, 527.78204f, 169.234f);
generalPath.moveTo(523.76f, 166.02f);
generalPath.curveTo(513.94f, 166.02f, 507.33902f, 181.796f, 520.543f, 187.26901f);
generalPath.moveTo(485.61f, 172.62f);
generalPath.curveTo(483.03497f, 177.61f, 492.21f, 183.083f, 498.48898f, 178.093f);
generalPath.curveTo(503.352f, 174.227f, 502.99298f, 163.766f, 500.097f, 159.741f);
generalPath.moveTo(480.62f, 184.53f);
generalPath.curveTo(477.4f, 195.15399f, 501.06598f, 195.798f, 497.362f, 178.895f);
generalPath.moveTo(479.33f, 200.31f);
generalPath.curveTo(480.13397f, 208.359f, 502.03f, 205.783f, 494.943f, 189.524f);
generalPath.moveTo(497.52f, 185.01f);
generalPath.curveTo(499.28998f, 187.42499f, 504.12f, 191.61f, 512.328f, 190.805f);
generalPath.moveTo(501.38f, 173.58f);
generalPath.curveTo(502.105f, 176.477f, 507.013f, 178.731f, 513.293f, 176.559f);
generalPath.moveTo(281.73f, 418.51f);
generalPath.curveTo(276.177f, 422.45602f, 284.709f, 428.652f, 287.84702f, 421.81f);
generalPath.moveTo(277.38f, 421.57f);
generalPath.curveTo(271.827f, 425.512f, 280.359f, 431.708f, 283.497f, 424.866f);
generalPath.moveTo(272.79f, 424.55f);
generalPath.curveTo(267.23502f, 428.496f, 275.768f, 434.692f, 278.907f, 427.84998f);
generalPath.moveTo(267.96f, 427.29f);
generalPath.curveTo(262.647f, 430.107f, 268.845f, 437.028f, 274.23798f, 430.91f);
generalPath.moveTo(262.73f, 429.95f);
generalPath.curveTo(257.41702f, 432.763f, 263.616f, 439.68802f, 269.008f, 433.57f);
generalPath.moveTo(289.7f, 421.65f);
generalPath.curveTo(289.61902f, 425.754f, 297.427f, 427.44598f, 300.243f, 421.32498f);
generalPath.moveTo(294.61f, 425.44f);
generalPath.curveTo(292.19498f, 428.49802f, 296.623f, 432.282f, 299.038f, 430.91f);
generalPath.moveTo(284.22f, 424.87f);
generalPath.curveTo(283.978f, 428.332f, 290.739f, 430.345f, 294.04f, 426.56198f);
generalPath.moveTo(287.93f, 428.5f);
generalPath.curveTo(285.75598f, 431.317f, 290.022f, 435.1f, 292.75998f, 433.97f);
generalPath.moveTo(279.72f, 428.01f);
generalPath.curveTo(279.96f, 430.747f, 283.824f, 433.885f, 288.01f, 432.114f);
generalPath.moveTo(282.21f, 431.71f);
generalPath.curveTo(280.6f, 433.16f, 281.405f, 436.543f, 283.659f, 437.59f);
generalPath.moveTo(273.84f, 431.47f);
generalPath.curveTo(273.19598f, 433.966f, 277.46298f, 438.395f, 281.809f, 435.495f);
generalPath.moveTo(274.72f, 434.37f);
generalPath.curveTo(272.145f, 436.383f, 272.466f, 439.44f, 275.766f, 439.84f);
generalPath.moveTo(268.53f, 434.05f);
generalPath.curveTo(268.208f, 435.73798f, 270.382f, 438.47498f, 273.119f, 438.154f);
generalPath.moveTo(254.76f, 433.89f);
generalPath.curveTo(252.185f, 435.25702f, 258.785f, 442.26f, 262.889f, 435.74002f);
generalPath.moveTo(248.4f, 436.78f);
generalPath.curveTo(245.18f, 438.313f, 253.15f, 446.038f, 256.69098f, 438.15f);
generalPath.moveTo(269.25f, 436.46f);
generalPath.curveTo(266.754f, 437.02298f, 265.145f, 440.64798f, 267.237f, 442.093f);
generalPath.moveTo(261.12f, 437.75f);
generalPath.curveTo(260.798f, 439.2f, 263.857f, 441.612f, 266.353f, 440.73f);
generalPath.moveTo(259.03f, 438.4f);
generalPath.curveTo(256.615f, 439.93f, 257.90298f, 444.192f, 260.72f, 443.55f);
generalPath.moveTo(250.42f, 441.21f);
generalPath.curveTo(248.166f, 442.89798f, 249.69499f, 446.28f, 252.83499f, 445.477f);
generalPath.moveTo(254.52f, 440.97f);
generalPath.curveTo(254.601f, 441.853f, 256.613f, 443.224f, 258.30402f, 442.662f);
generalPath.moveTo(242.61f, 439.52f);
generalPath.curveTo(239.794f, 440.728f, 239.955f, 447.81198f, 249.453f, 443.94998f);
generalPath.moveTo(236.25f, 442.34f);
generalPath.curveTo(232.305f, 444.273f, 233.593f, 449.586f, 242.206f, 444.51498f);
generalPath.moveTo(242.93f, 444.92f);
generalPath.curveTo(241.88399f, 445.724f, 240.758f, 449.26602f, 244.7f, 447.89502f);
generalPath.moveTo(235.69f, 446.6f);
generalPath.curveTo(234.08f, 448.05002f, 235.127f, 451.03f, 238.67f, 449.9f);
generalPath.moveTo(227.4f, 447.09f);
generalPath.curveTo(224.50299f, 448.78198f, 230.86f, 451.036f, 235.127f, 446.527f);
generalPath.moveTo(229.33f, 449.18f);
generalPath.curveTo(228.042f, 450.468f, 228.042f, 454.25f, 231.422f, 452.884f);
generalPath.moveTo(221.12f, 450.71f);
generalPath.curveTo(219.18799f, 452.16f, 222.48799f, 454.093f, 228.525f, 451.435f);
generalPath.moveTo(223.53f, 452.8f);
generalPath.curveTo(221.276f, 454.65f, 221.517f, 456.983f, 224.818f, 456.258f);
generalPath.moveTo(216.85f, 453.85f);
generalPath.curveTo(214.35501f, 456.104f, 217.977f, 457.633f, 222.32301f, 455.78f);
generalPath.moveTo(216.93f, 456.35f);
generalPath.curveTo(212.663f, 458.28f, 214.515f, 461.82f, 217.17f, 460.454f);
generalPath.moveTo(359.4f, 468.66f);
generalPath.curveTo(358.41f, 470.79f, 361.654f, 472.522f, 364.71298f, 472.04f);
generalPath.curveTo(367.65f, 471.577f, 370.46097f, 469.156f, 368.253f, 465.764f);
generalPath.moveTo(368.41f, 469.95f);
generalPath.curveTo(371.307f, 472.204f, 376.459f, 469.63f, 376.459f, 466.246f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(545.97f, 128.83f);
generalPath.curveTo(533.09094f, 122.39f, 506.36996f, 110.478004f, 498.80298f, 120.137f);
generalPath.curveTo(505.723f, 117.24f, 526.00696f, 120.298004f, 542.74896f, 135.752f);
generalPath.lineTo(545.96893f, 128.83f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(545.97f, 128.83f);
generalPath.curveTo(533.09094f, 122.39f, 506.36996f, 110.478004f, 498.80298f, 120.137f);
generalPath.curveTo(505.723f, 117.24f, 526.00696f, 120.298004f, 542.74896f, 135.752f);
generalPath.lineTo(545.96893f, 128.83f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(553.78f, 128.15f);
generalPath.curveTo(538.888f, 110.80299f, 530.117f, 114.686f, 519.40906f, 108.711f);
generalPath.curveTo(509.35104f, 103.097f, 493.33005f, 101.95f, 490.22604f, 110.878f);
generalPath.curveTo(504.92206f, 103.721f, 518.41406f, 114.727f, 526.70105f, 116.058f);
generalPath.curveTo(538.08405f, 117.886f, 544.50903f, 126.687f, 547.83905f, 130.734f);
generalPath.lineTo(553.78107f, 128.15f);
generalPath.closePath();
generalPath.moveTo(609.88f, 125.93f);
generalPath.curveTo(602.15f, 108.222f, 585.626f, 112.847f, 578.326f, 105.325f);
generalPath.curveTo(567.705f, 94.379f, 540.82196f, 84.237f, 529.713f, 91.80299f);
generalPath.curveTo(554.18f, 90.51499f, 564.601f, 108.66799f, 577.684f, 114.98399f);
generalPath.curveTo(587.02203f, 119.492f, 597.00104f, 129.15f, 609.88f, 125.93099f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(553.78f, 128.15f);
generalPath.curveTo(538.888f, 110.80299f, 530.117f, 114.686f, 519.40906f, 108.711f);
generalPath.curveTo(509.35104f, 103.097f, 493.33005f, 101.95f, 490.22604f, 110.878f);
generalPath.curveTo(504.92206f, 103.721f, 518.41406f, 114.727f, 526.70105f, 116.058f);
generalPath.curveTo(538.08405f, 117.886f, 544.50903f, 126.687f, 547.83905f, 130.734f);
generalPath.lineTo(553.78107f, 128.15f);
generalPath.closePath();
generalPath.moveTo(609.88f, 125.93f);
generalPath.curveTo(602.15f, 108.222f, 585.626f, 112.847f, 578.326f, 105.325f);
generalPath.curveTo(567.705f, 94.379f, 540.82196f, 84.237f, 529.713f, 91.80299f);
generalPath.curveTo(554.18f, 90.51499f, 564.601f, 108.66799f, 577.684f, 114.98399f);
generalPath.curveTo(587.02203f, 119.492f, 597.00104f, 129.15f, 609.88f, 125.93099f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(580.91f, 124.0f);
generalPath.curveTo(567.70996f, 107.58f, 547.422f, 93.091995f, 538.089f, 98.565f);
generalPath.curveTo(550.32196f, 99.209f, 554.185f, 107.741005f, 562.881f, 113.214005f);
generalPath.curveTo(571.573f, 118.687004f, 567.711f, 126.575005f, 580.91f, 124.00001f);
generalPath.closePath();
generalPath.moveTo(518.12f, 152.98f);
generalPath.curveTo(504.274f, 147.829f, 477.232f, 145.25299f, 464.674f, 161.03f);
generalPath.curveTo(485.60303f, 164.56999f, 517.153f, 162.63899f, 518.12f, 152.98f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(580.91f, 124.0f);
generalPath.curveTo(567.70996f, 107.58f, 547.422f, 93.091995f, 538.089f, 98.565f);
generalPath.curveTo(550.32196f, 99.209f, 554.185f, 107.741005f, 562.881f, 113.214005f);
generalPath.curveTo(571.573f, 118.687004f, 567.711f, 126.575005f, 580.91f, 124.00001f);
generalPath.closePath();
generalPath.moveTo(518.12f, 152.98f);
generalPath.curveTo(504.274f, 147.829f, 477.232f, 145.25299f, 464.674f, 161.03f);
generalPath.curveTo(485.60303f, 164.56999f, 517.153f, 162.63899f, 518.12f, 152.98f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(515.55f, 159.1f);
generalPath.curveTo(501.70398f, 152.66f, 490.892f, 161.655f, 477.879f, 160.388f);
generalPath.curveTo(453.091f, 157.973f, 435.383f, 159.422f, 433.129f, 171.334f);
generalPath.curveTo(447.296f, 158.617f, 471.121f, 169.081f, 480.779f, 166.505f);
generalPath.curveTo(490.43698f, 163.929f, 526.175f, 166.183f, 537.442f, 171.01201f);
generalPath.curveTo(531.646f, 163.92902f, 522.63403f, 161.99802f, 515.55f, 159.1f);
generalPath.closePath();
generalPath.moveTo(559.01f, 122.23f);
generalPath.curveTo(555.793f, 111.605f, 555.952f, 100.337006f, 571.88904f, 101.142006f);
generalPath.curveTo(567.864f, 96.15201f, 553.056f, 93.576004f, 550.63904f, 112.25001f);
generalPath.curveTo(533.093f, 99.37201f, 513.93506f, 97.11801f, 510.39703f, 108.226006f);
generalPath.curveTo(519.40906f, 100.49901f, 533.41406f, 106.133f, 550.155f, 125.129005f);
generalPath.curveTo(551.60504f, 124.324005f, 555.468f, 122.714005f, 559.00903f, 122.231f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(515.55f, 159.1f);
generalPath.curveTo(501.70398f, 152.66f, 490.892f, 161.655f, 477.879f, 160.388f);
generalPath.curveTo(453.091f, 157.973f, 435.383f, 159.422f, 433.129f, 171.334f);
generalPath.curveTo(447.296f, 158.617f, 471.121f, 169.081f, 480.779f, 166.505f);
generalPath.curveTo(490.43698f, 163.929f, 526.175f, 166.183f, 537.442f, 171.01201f);
generalPath.curveTo(531.646f, 163.92902f, 522.63403f, 161.99802f, 515.55f, 159.1f);
generalPath.closePath();
generalPath.moveTo(559.01f, 122.23f);
generalPath.curveTo(555.793f, 111.605f, 555.952f, 100.337006f, 571.88904f, 101.142006f);
generalPath.curveTo(567.864f, 96.15201f, 553.056f, 93.576004f, 550.63904f, 112.25001f);
generalPath.curveTo(533.093f, 99.37201f, 513.93506f, 97.11801f, 510.39703f, 108.226006f);
generalPath.curveTo(519.40906f, 100.49901f, 533.41406f, 106.133f, 550.155f, 125.129005f);
generalPath.curveTo(551.60504f, 124.324005f, 555.468f, 122.714005f, 559.00903f, 122.231f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(534.87f, 136.88f);
generalPath.curveTo(524.89f, 130.44101f, 511.366f, 119.977005f, 535.033f, 115.79201f);
generalPath.curveTo(524.891f, 110.31901f, 510.079f, 112.73301f, 511.691f, 131.40701f);
generalPath.curveTo(484.64502f, 120.460014f, 465.224f, 124.155014f, 461.14102f, 134.94801f);
generalPath.curveTo(456.63202f, 146.86101f, 473.37903f, 153.46101f, 476.27402f, 145.89502f);
generalPath.curveTo(473.21503f, 147.18301f, 462.75302f, 143.64201f, 468.22403f, 136.88002f);
generalPath.curveTo(473.69904f, 130.12003f, 501.74902f, 135.19502f, 528.432f, 149.11502f);
generalPath.curveTo(535.836f, 152.97902f, 561.27f, 152.33502f, 534.869f, 136.88002f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(534.87f, 136.88f);
generalPath.curveTo(524.89f, 130.44101f, 511.366f, 119.977005f, 535.033f, 115.79201f);
generalPath.curveTo(524.891f, 110.31901f, 510.079f, 112.73301f, 511.691f, 131.40701f);
generalPath.curveTo(484.64502f, 120.460014f, 465.224f, 124.155014f, 461.14102f, 134.94801f);
generalPath.curveTo(456.63202f, 146.86101f, 473.37903f, 153.46101f, 476.27402f, 145.89502f);
generalPath.curveTo(473.21503f, 147.18301f, 462.75302f, 143.64201f, 468.22403f, 136.88002f);
generalPath.curveTo(473.69904f, 130.12003f, 501.74902f, 135.19502f, 528.432f, 149.11502f);
generalPath.curveTo(535.836f, 152.97902f, 561.27f, 152.33502f, 534.869f, 136.88002f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}

}

private void _paint3(Graphics2D g,float origAlpha) {
generalPath.moveTo(527.78f, 154.59f);
generalPath.curveTo(520.08f, 138.868f, 495.101f, 153.14099f, 490.06702f, 137.912f);
generalPath.curveTo(483.187f, 160.224f, 525.588f, 147.878f, 527.78f, 154.59f);
generalPath.closePath();
generalPath.moveTo(686.67f, 171.65f);
generalPath.curveTo(691.907f, 174.25299f, 696.437f, 170.161f, 688.424f, 166.952f);
generalPath.curveTo(693.666f, 169.553f, 698.237f, 165.56f, 690.224f, 162.349f);
generalPath.curveTo(695.466f, 164.95f, 700.037f, 160.957f, 692.024f, 157.747f);
generalPath.curveTo(689.88696f, 159.898f, 686.828f, 167.78699f, 686.67f, 171.65f);
generalPath.closePath();
generalPath.moveTo(689.4f, 141.39f);
generalPath.curveTo(700.992f, 129.156f, 688.437f, 124.97f, 702.60004f, 112.414f);
generalPath.curveTo(714.192f, 102.141f, 704.812f, 95.294f, 715.804f, 87.301f);
generalPath.curveTo(719.346f, 84.726006f, 727.07104f, 79.574005f, 727.71704f, 74.423004f);
generalPath.curveTo(732.38403f, 86.013f, 713.22504f, 87.623f, 714.51306f, 106.297005f);
generalPath.curveTo(715.33307f, 118.187004f, 707.2961f, 117.148f, 704.2131f, 137.205f);
generalPath.curveTo(703.5671f, 141.39f, 700.6711f, 150.727f, 689.4001f, 141.39f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(527.78f, 154.59f);
generalPath.curveTo(520.08f, 138.868f, 495.101f, 153.14099f, 490.06702f, 137.912f);
generalPath.curveTo(483.187f, 160.224f, 525.588f, 147.878f, 527.78f, 154.59f);
generalPath.closePath();
generalPath.moveTo(686.67f, 171.65f);
generalPath.curveTo(691.907f, 174.25299f, 696.437f, 170.161f, 688.424f, 166.952f);
generalPath.curveTo(693.666f, 169.553f, 698.237f, 165.56f, 690.224f, 162.349f);
generalPath.curveTo(695.466f, 164.95f, 700.037f, 160.957f, 692.024f, 157.747f);
generalPath.curveTo(689.88696f, 159.898f, 686.828f, 167.78699f, 686.67f, 171.65f);
generalPath.closePath();
generalPath.moveTo(689.4f, 141.39f);
generalPath.curveTo(700.992f, 129.156f, 688.437f, 124.97f, 702.60004f, 112.414f);
generalPath.curveTo(714.192f, 102.141f, 704.812f, 95.294f, 715.804f, 87.301f);
generalPath.curveTo(719.346f, 84.726006f, 727.07104f, 79.574005f, 727.71704f, 74.423004f);
generalPath.curveTo(732.38403f, 86.013f, 713.22504f, 87.623f, 714.51306f, 106.297005f);
generalPath.curveTo(715.33307f, 118.187004f, 707.2961f, 117.148f, 704.2131f, 137.205f);
generalPath.curveTo(703.5671f, 141.39f, 700.6711f, 150.727f, 689.4001f, 141.39f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(694.56f, 146.86f);
generalPath.curveTo(700.998f, 133.016f, 708.389f, 133.282f, 711.943f, 127.865f);
generalPath.curveTo(718.706f, 117.562f, 733.031f, 129.635f, 745.106f, 120.46f);
generalPath.curveTo(743.01404f, 133.499f, 726.75604f, 128.83f, 719.67303f, 137.202f);
generalPath.curveTo(712.59f, 145.57199f, 706.794f, 149.437f, 694.56006f, 146.861f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(694.56f, 146.86f);
generalPath.curveTo(700.998f, 133.016f, 708.389f, 133.282f, 711.943f, 127.865f);
generalPath.curveTo(718.706f, 117.562f, 733.031f, 129.635f, 745.106f, 120.46f);
generalPath.curveTo(743.01404f, 133.499f, 726.75604f, 128.83f, 719.67303f, 137.202f);
generalPath.curveTo(712.59f, 145.57199f, 706.794f, 149.437f, 694.56006f, 146.861f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(696.17f, 151.37f);
generalPath.curveTo(707.441f, 142.355f, 715.745f, 148.37f, 723.537f, 143.64299f);
generalPath.curveTo(743.175f, 131.73f, 751.066f, 146.05699f, 768.612f, 140.42299f);
generalPath.curveTo(763.942f, 151.691f, 738.024f, 142.03299f, 726.758f, 150.40399f);
generalPath.curveTo(715.487f, 158.77399f, 675.887f, 166.82399f, 696.17f, 151.37f);
generalPath.closePath();
generalPath.moveTo(663.33f, 215.6f);
generalPath.curveTo(663.167f, 210.449f, 658.338f, 203.848f, 651.576f, 203.044f);
generalPath.curveTo(644.818f, 202.23901f, 641.91797f, 195.156f, 636.768f, 194.834f);
generalPath.curveTo(631.618f, 194.512f, 628.235f, 184.209f, 621.151f, 184.37f);
generalPath.curveTo(614.068f, 184.53099f, 611.171f, 193.707f, 627.751f, 202.078f);
generalPath.curveTo(644.334f, 210.449f, 662.68396f, 220.108f, 663.32996f, 215.601f);
generalPath.closePath();
generalPath.moveTo(642.4f, 219.95f);
generalPath.curveTo(635.317f, 220.272f, 634.35004f, 230.575f, 627.59204f, 230.897f);
generalPath.curveTo(636.92505f, 235.88701f, 643.68805f, 228.643f, 648.517f, 222.20401f);
generalPath.lineTo(642.4f, 219.95001f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(696.17f, 151.37f);
generalPath.curveTo(707.441f, 142.355f, 715.745f, 148.37f, 723.537f, 143.64299f);
generalPath.curveTo(743.175f, 131.73f, 751.066f, 146.05699f, 768.612f, 140.42299f);
generalPath.curveTo(763.942f, 151.691f, 738.024f, 142.03299f, 726.758f, 150.40399f);
generalPath.curveTo(715.487f, 158.77399f, 675.887f, 166.82399f, 696.17f, 151.37f);
generalPath.closePath();
generalPath.moveTo(663.33f, 215.6f);
generalPath.curveTo(663.167f, 210.449f, 658.338f, 203.848f, 651.576f, 203.044f);
generalPath.curveTo(644.818f, 202.23901f, 641.91797f, 195.156f, 636.768f, 194.834f);
generalPath.curveTo(631.618f, 194.512f, 628.235f, 184.209f, 621.151f, 184.37f);
generalPath.curveTo(614.068f, 184.53099f, 611.171f, 193.707f, 627.751f, 202.078f);
generalPath.curveTo(644.334f, 210.449f, 662.68396f, 220.108f, 663.32996f, 215.601f);
generalPath.closePath();
generalPath.moveTo(642.4f, 219.95f);
generalPath.curveTo(635.317f, 220.272f, 634.35004f, 230.575f, 627.59204f, 230.897f);
generalPath.curveTo(636.92505f, 235.88701f, 643.68805f, 228.643f, 648.517f, 222.20401f);
generalPath.lineTo(642.4f, 219.95001f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(648.2f, 221.23f);
generalPath.curveTo(642.083f, 226.381f, 640.312f, 237.16699f, 649.167f, 240.22499f);
generalPath.curveTo(643.854f, 232.9f, 658.50397f, 229.59999f, 653.996f, 222.83899f);
generalPath.lineTo(648.19995f, 221.22899f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(648.2f, 221.23f);
generalPath.curveTo(642.083f, 226.381f, 640.312f, 237.16699f, 649.167f, 240.22499f);
generalPath.curveTo(643.854f, 232.9f, 658.50397f, 229.59999f, 653.996f, 222.83899f);
generalPath.lineTo(648.19995f, 221.22899f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(654.31f, 221.56f);
generalPath.curveTo(649.48f, 230.897f, 661.877f, 232.023f, 658.656f, 239.107f);
generalPath.curveTo(665.739f, 237.497f, 666.868f, 224.136f, 660.426f, 220.594f);
generalPath.lineTo(654.31f, 221.56f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(654.31f, 221.56f);
generalPath.curveTo(649.48f, 230.897f, 661.877f, 232.023f, 658.656f, 239.107f);
generalPath.curveTo(665.739f, 237.497f, 666.868f, 224.136f, 660.426f, 220.594f);
generalPath.lineTo(654.31f, 221.56f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(606.98f, 201.59f);
generalPath.curveTo(618.57196f, 200.946f, 629.172f, 207.217f, 636.27997f, 217.366f);
generalPath.curveTo(640.78796f, 223.805f, 655.91797f, 226.381f, 661.07196f, 221.229f);
generalPath.curveTo(666.222f, 216.07901f, 663.326f, 205.13101f, 650.44696f, 208.673f);
generalPath.curveTo(647.227f, 203.2f, 637.889f, 205.132f, 633.384f, 200.62401f);
generalPath.curveTo(628.876f, 196.117f, 611.488f, 183.23901f, 606.98f, 201.59001f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(606.98f, 201.59f);
generalPath.curveTo(618.57196f, 200.946f, 629.172f, 207.217f, 636.27997f, 217.366f);
generalPath.curveTo(640.78796f, 223.805f, 655.91797f, 226.381f, 661.07196f, 221.229f);
generalPath.curveTo(666.222f, 216.07901f, 663.326f, 205.13101f, 650.44696f, 208.673f);
generalPath.curveTo(647.227f, 203.2f, 637.889f, 205.132f, 633.384f, 200.62401f);
generalPath.curveTo(628.876f, 196.117f, 611.488f, 183.23901f, 606.98f, 201.59001f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(650.45f, 208.68f);
generalPath.curveTo(647.392f, 209.32399f, 646.425f, 214.63599f, 648.354f, 217.37299f);
generalPath.moveTo(657.05f, 211.9f);
generalPath.curveTo(658.01697f, 213.51f, 657.37f, 215.763f, 656.88696f, 216.89f);
generalPath.moveTo(625.34f, 202.08f);
generalPath.curveTo(631.294f, 202.40201f, 632.42303f, 206.74901f, 638.861f, 208.358f);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,1,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(650.45f, 208.68f);
generalPath.curveTo(647.392f, 209.32399f, 646.425f, 214.63599f, 648.354f, 217.37299f);
generalPath.moveTo(657.05f, 211.9f);
generalPath.curveTo(658.01697f, 213.51f, 657.37f, 215.763f, 656.88696f, 216.89f);
generalPath.moveTo(625.34f, 202.08f);
generalPath.curveTo(631.294f, 202.40201f, 632.42303f, 206.74901f, 638.861f, 208.358f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(621.4f, 187.43f);
generalPath.curveTo(641.971f, 192.581f, 658.292f, 197.08899f, 668.413f, 202.88399f);
generalPath.curveTo(678.534f, 208.67899f, 694.205f, 210.28899f, 707.91705f, 206.426f);
generalPath.curveTo(721.63007f, 202.562f, 748.07104f, 199.021f, 746.767f, 216.08499f);
generalPath.curveTo(753.955f, 207.55199f, 744.809f, 198.37599f, 726.525f, 196.76599f);
generalPath.curveTo(726.85504f, 188.396f, 717.895f, 180.829f, 711.45404f, 185.81898f);
generalPath.curveTo(717.41205f, 185.01498f, 722.554f, 196.12198f, 710.804f, 200.62898f);
generalPath.curveTo(713.08704f, 192.25899f, 704.762f, 184.69199f, 696.112f, 188.39499f);
generalPath.curveTo(701.662f, 190.00499f, 707.275f, 199.31198f, 694.858f, 202.883f);
generalPath.curveTo(687.01996f, 205.137f, 675.595f, 202.23999f, 667.108f, 197.088f);
generalPath.curveTo(658.62f, 191.937f, 610.954f, 173.263f, 621.39996f, 187.43f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(621.4f, 187.43f);
generalPath.curveTo(641.971f, 192.581f, 658.292f, 197.08899f, 668.413f, 202.88399f);
generalPath.curveTo(678.534f, 208.67899f, 694.205f, 210.28899f, 707.91705f, 206.426f);
generalPath.curveTo(721.63007f, 202.562f, 748.07104f, 199.021f, 746.767f, 216.08499f);
generalPath.curveTo(753.955f, 207.55199f, 744.809f, 198.37599f, 726.525f, 196.76599f);
generalPath.curveTo(726.85504f, 188.396f, 717.895f, 180.829f, 711.45404f, 185.81898f);
generalPath.curveTo(717.41205f, 185.01498f, 722.554f, 196.12198f, 710.804f, 200.62898f);
generalPath.curveTo(713.08704f, 192.25899f, 704.762f, 184.69199f, 696.112f, 188.39499f);
generalPath.curveTo(701.662f, 190.00499f, 707.275f, 199.31198f, 694.858f, 202.883f);
generalPath.curveTo(687.01996f, 205.137f, 675.595f, 202.23999f, 667.108f, 197.088f);
generalPath.curveTo(658.62f, 191.937f, 610.954f, 173.263f, 621.39996f, 187.43f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(673.31f, 179.06f);
generalPath.curveTo(666.872f, 181.957f, 671.05597f, 188.719f, 661.077f, 192.582f);
generalPath.curveTo(651.09406f, 196.445f, 644.17303f, 205.299f, 646.427f, 212.865f);
generalPath.curveTo(653.19f, 198.05501f, 665.102f, 198.699f, 669.285f, 192.904f);
generalPath.curveTo(673.47296f, 187.10901f, 679.589f, 178.57701f, 673.31f, 179.06001f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(673.31f, 179.06f);
generalPath.curveTo(666.872f, 181.957f, 671.05597f, 188.719f, 661.077f, 192.582f);
generalPath.curveTo(651.09406f, 196.445f, 644.17303f, 205.299f, 646.427f, 212.865f);
generalPath.curveTo(653.19f, 198.05501f, 665.102f, 198.699f, 669.285f, 192.904f);
generalPath.curveTo(673.47296f, 187.10901f, 679.589f, 178.57701f, 673.31f, 179.06001f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(675.08f, 180.02f);
generalPath.curveTo(674.76f, 191.77101f, 665.51f, 187.49f, 669.122f, 204.00601f);
generalPath.curveTo(670.25104f, 209.15701f, 672.342f, 217.52802f, 668.801f, 225.89902f);
generalPath.curveTo(679.184f, 218.33302f, 672.505f, 202.43903f, 677.171f, 196.44002f);
generalPath.curveTo(679.426f, 193.54301f, 682.32104f, 189.03502f, 683.45105f, 185.17201f);
generalPath.curveTo(681.03406f, 191.932f, 681.197f, 204.49002f, 687.79706f, 207.70901f);
generalPath.curveTo(682.4841f, 195.15201f, 702.12604f, 184.85002f, 688.6011f, 170.36201f);
generalPath.curveTo(686.6711f, 173.90402f, 680.5511f, 180.182f, 675.0801f, 180.02101f);
generalPath.closePath();
generalPath.moveTo(642.24f, 168.27f);
generalPath.curveTo(643.85297f, 170.685f, 645.45996f, 176.802f, 644.01f, 180.183f);
generalPath.curveTo(647.232f, 178.25099f, 651.903f, 173.261f, 653.348f, 169.88f);
generalPath.curveTo(659.948f, 170.84601f, 662.523f, 179.056f, 656.24805f, 182.597f);
generalPath.curveTo(660.111f, 182.597f, 666.71106f, 182.597f, 670.4111f, 178.251f);
generalPath.curveTo(665.90704f, 173.261f, 651.9031f, 165.533f, 642.2411f, 168.27f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(675.08f, 180.02f);
generalPath.curveTo(674.76f, 191.77101f, 665.51f, 187.49f, 669.122f, 204.00601f);
generalPath.curveTo(670.25104f, 209.15701f, 672.342f, 217.52802f, 668.801f, 225.89902f);
generalPath.curveTo(679.184f, 218.33302f, 672.505f, 202.43903f, 677.171f, 196.44002f);
generalPath.curveTo(679.426f, 193.54301f, 682.32104f, 189.03502f, 683.45105f, 185.17201f);
generalPath.curveTo(681.03406f, 191.932f, 681.197f, 204.49002f, 687.79706f, 207.70901f);
generalPath.curveTo(682.4841f, 195.15201f, 702.12604f, 184.85002f, 688.6011f, 170.36201f);
generalPath.curveTo(686.6711f, 173.90402f, 680.5511f, 180.182f, 675.0801f, 180.02101f);
generalPath.closePath();
generalPath.moveTo(642.24f, 168.27f);
generalPath.curveTo(643.85297f, 170.685f, 645.45996f, 176.802f, 644.01f, 180.183f);
generalPath.curveTo(647.232f, 178.25099f, 651.903f, 173.261f, 653.348f, 169.88f);
generalPath.curveTo(659.948f, 170.84601f, 662.523f, 179.056f, 656.24805f, 182.597f);
generalPath.curveTo(660.111f, 182.597f, 666.71106f, 182.597f, 670.4111f, 178.251f);
generalPath.curveTo(665.90704f, 173.261f, 651.9031f, 165.533f, 642.2411f, 168.27f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(542.11f, 145.18f);
generalPath.curveTo(541.068f, 144.23f, 539.31f, 143.32799f, 536.156f, 142.68f);
generalPath.curveTo(526.41003f, 140.68199f, 531.443f, 131.896f, 539.739f, 131.974f);
generalPath.curveTo(557.443f, 112.657f, 567.385f, 127.548f, 588.956f, 121.431f);
generalPath.curveTo(596.506f, 119.291f, 601.68896f, 119.923996f, 605.802f, 121.703f);
generalPath.curveTo(615.46f, 115.263f, 626.79f, 117.063f, 635.002f, 124.629005f);
generalPath.curveTo(635.91504f, 123.17801f, 637.14f, 122.07001f, 638.86f, 121.592f);
generalPath.curveTo(646.423f, 119.492004f, 652.54f, 125.94f, 654.631f, 134.312f);
generalPath.curveTo(660.527f, 133.219f, 667.261f, 136.137f, 671.68896f, 140.162f);
generalPath.curveTo(677.82294f, 137.01201f, 682.04694f, 136.87201f, 683.602f, 140.11f);
generalPath.curveTo(689.07697f, 137.535f, 696.169f, 135.92f, 699.70996f, 144.612f);
generalPath.curveTo(703.25195f, 153.305f, 691.33997f, 150.73f, 689.40594f, 169.082f);
generalPath.curveTo(688.21497f, 180.40201f, 675.56396f, 184.857f, 665.58093f, 178.09601f);
generalPath.curveTo(649.61395f, 167.279f, 634.03094f, 165.539f, 626.30194f, 181.96f);
generalPath.curveTo(618.57697f, 198.38f, 612.52295f, 207.92001f, 593.7849f, 202.565f);
generalPath.curveTo(587.0269f, 200.633f, 578.33093f, 203.209f, 572.8599f, 210.614f);
generalPath.curveTo(567.38495f, 218.019f, 559.0139f, 211.096f, 549.0349f, 211.901f);
generalPath.curveTo(561.5889f, 209.97f, 556.7809f, 206.811f, 567.7099f, 206.106f);
generalPath.curveTo(577.6899f, 205.462f, 575.1149f, 196.126f, 581.5519f, 194.838f);
generalPath.curveTo(556.4389f, 201.278f, 557.4059f, 191.94f, 536.8019f, 198.379f);
generalPath.curveTo(545.8149f, 186.789f, 559.9819f, 193.228f, 567.0649f, 186.467f);
generalPath.curveTo(548.3899f, 186.14499f, 540.03986f, 173.94499f, 531.6479f, 179.062f);
generalPath.curveTo(518.4479f, 187.112f, 524.23987f, 210.027f, 489.79388f, 208.038f);
generalPath.curveTo(473.05188f, 207.07199f, 462.42688f, 209.32599f, 452.44788f, 219.308f);
generalPath.curveTo(469.83588f, 183.248f, 493.48587f, 203.058f, 504.9279f, 191.619f);
generalPath.curveTo(511.68988f, 184.858f, 516.8399f, 179.70601f, 520.38086f, 173.267f);
generalPath.curveTo(521.62683f, 171.00099f, 523.3149f, 169.705f, 525.42285f, 169.204f);
generalPath.curveTo(496.76886f, 160.189f, 514.09784f, 146.146f, 542.11084f, 145.181f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(542.11f, 145.18f);
generalPath.curveTo(541.068f, 144.23f, 539.31f, 143.32799f, 536.156f, 142.68f);
generalPath.curveTo(526.41003f, 140.68199f, 531.443f, 131.896f, 539.739f, 131.974f);
generalPath.curveTo(557.443f, 112.657f, 567.385f, 127.548f, 588.956f, 121.431f);
generalPath.curveTo(596.506f, 119.291f, 601.68896f, 119.923996f, 605.802f, 121.703f);
generalPath.curveTo(615.46f, 115.263f, 626.79f, 117.063f, 635.002f, 124.629005f);
generalPath.curveTo(635.91504f, 123.17801f, 637.14f, 122.07001f, 638.86f, 121.592f);
generalPath.curveTo(646.423f, 119.492004f, 652.54f, 125.94f, 654.631f, 134.312f);
generalPath.curveTo(660.527f, 133.219f, 667.261f, 136.137f, 671.68896f, 140.162f);
generalPath.curveTo(677.82294f, 137.01201f, 682.04694f, 136.87201f, 683.602f, 140.11f);
generalPath.curveTo(689.07697f, 137.535f, 696.169f, 135.92f, 699.70996f, 144.612f);
generalPath.curveTo(703.25195f, 153.305f, 691.33997f, 150.73f, 689.40594f, 169.082f);
generalPath.curveTo(688.21497f, 180.40201f, 675.56396f, 184.857f, 665.58093f, 178.09601f);
generalPath.curveTo(649.61395f, 167.279f, 634.03094f, 165.539f, 626.30194f, 181.96f);
generalPath.curveTo(618.57697f, 198.38f, 612.52295f, 207.92001f, 593.7849f, 202.565f);
generalPath.curveTo(587.0269f, 200.633f, 578.33093f, 203.209f, 572.8599f, 210.614f);
generalPath.curveTo(567.38495f, 218.019f, 559.0139f, 211.096f, 549.0349f, 211.901f);
generalPath.curveTo(561.5889f, 209.97f, 556.7809f, 206.811f, 567.7099f, 206.106f);
generalPath.curveTo(577.6899f, 205.462f, 575.1149f, 196.126f, 581.5519f, 194.838f);
generalPath.curveTo(556.4389f, 201.278f, 557.4059f, 191.94f, 536.8019f, 198.379f);
generalPath.curveTo(545.8149f, 186.789f, 559.9819f, 193.228f, 567.0649f, 186.467f);
generalPath.curveTo(548.3899f, 186.14499f, 540.03986f, 173.94499f, 531.6479f, 179.062f);
generalPath.curveTo(518.4479f, 187.112f, 524.23987f, 210.027f, 489.79388f, 208.038f);
generalPath.curveTo(473.05188f, 207.07199f, 462.42688f, 209.32599f, 452.44788f, 219.308f);
generalPath.curveTo(469.83588f, 183.248f, 493.48587f, 203.058f, 504.9279f, 191.619f);
generalPath.curveTo(511.68988f, 184.858f, 516.8399f, 179.70601f, 520.38086f, 173.267f);
generalPath.curveTo(521.62683f, 171.00099f, 523.3149f, 169.705f, 525.42285f, 169.204f);
generalPath.curveTo(496.76886f, 160.189f, 514.09784f, 146.146f, 542.11084f, 145.181f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(683.59f, 140.11f);
generalPath.curveTo(684.028f, 141.015f, 684.252f, 142.19f, 684.252f, 143.643f);
generalPath.curveTo(684.252f, 150.725f, 673.628f, 151.048f, 672.986f, 161.51201f);
generalPath.curveTo(672.648f, 166.98502f, 672.01904f, 170.04301f, 668.315f, 169.399f);
generalPath.curveTo(664.615f, 168.755f, 661.394f, 162.96f, 664.935f, 156.199f);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,1,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(683.59f, 140.11f);
generalPath.curveTo(684.028f, 141.015f, 684.252f, 142.19f, 684.252f, 143.643f);
generalPath.curveTo(684.252f, 150.725f, 673.628f, 151.048f, 672.986f, 161.51201f);
generalPath.curveTo(672.648f, 166.98502f, 672.01904f, 170.04301f, 668.315f, 169.399f);
generalPath.curveTo(664.615f, 168.755f, 661.394f, 162.96f, 664.935f, 156.199f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_17
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(547.42f, 134.63f);
generalPath.curveTo(544.753f, 132.75601f, 542.087f, 131.99501f, 539.695f, 131.973f);
generalPath.moveTo(605.74f, 121.65f);
generalPath.curveTo(614.265f, 125.340004f, 618.423f, 134.196f, 630.807f, 134.63f);
generalPath.curveTo(642.728f, 135.048f, 650.128f, 152.33801f, 670.086f, 141.069f);
generalPath.curveTo(670.628f, 140.764f, 671.156f, 140.479f, 671.669f, 140.215f);
generalPath.moveTo(635.0f, 124.63f);
generalPath.curveTo(633.22f, 127.46f, 632.817f, 131.40799f, 633.304f, 134.874f);
generalPath.moveTo(596.04f, 161.03f);
generalPath.curveTo(580.91095f, 161.03f, 577.044f, 168.757f, 577.044f, 176.162f);
generalPath.curveTo(577.044f, 183.567f, 584.127f, 193.226f, 596.68604f, 193.226f);
generalPath.curveTo(609.24005f, 193.226f, 616.00305f, 185.499f, 616.00305f, 177.12799f);
generalPath.curveTo(616.00305f, 168.75699f, 608.2731f, 161.03f, 596.04004f, 161.03f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(547.42f, 134.63f);
generalPath.curveTo(544.753f, 132.75601f, 542.087f, 131.99501f, 539.695f, 131.973f);
generalPath.moveTo(605.74f, 121.65f);
generalPath.curveTo(614.265f, 125.340004f, 618.423f, 134.196f, 630.807f, 134.63f);
generalPath.curveTo(642.728f, 135.048f, 650.128f, 152.33801f, 670.086f, 141.069f);
generalPath.curveTo(670.628f, 140.764f, 671.156f, 140.479f, 671.669f, 140.215f);
generalPath.moveTo(635.0f, 124.63f);
generalPath.curveTo(633.22f, 127.46f, 632.817f, 131.40799f, 633.304f, 134.874f);
generalPath.moveTo(596.04f, 161.03f);
generalPath.curveTo(580.91095f, 161.03f, 577.044f, 168.757f, 577.044f, 176.162f);
generalPath.curveTo(577.044f, 183.567f, 584.127f, 193.226f, 596.68604f, 193.226f);
generalPath.curveTo(609.24005f, 193.226f, 616.00305f, 185.499f, 616.00305f, 177.12799f);
generalPath.curveTo(616.00305f, 168.75699f, 608.2731f, 161.03f, 596.04004f, 161.03f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(598.77f, 192.9f);
generalPath.curveTo(598.45f, 188.715f, 590.882f, 189.35799f, 591.203f, 186.13899f);
generalPath.curveTo(591.524f, 182.91899f, 595.391f, 181.631f, 595.391f, 177.124f);
generalPath.curveTo(595.391f, 172.61699f, 602.149f, 172.29399f, 604.403f, 175.836f);
generalPath.curveTo(606.658f, 179.377f, 613.42004f, 186.299f, 614.87f, 182.758f);
generalPath.moveTo(604.41f, 175.84f);
generalPath.curveTo(600.868f, 179.381f, 599.25995f, 186.625f, 603.927f, 192.26f);
generalPath.moveTo(609.24f, 181.31f);
generalPath.curveTo(608.115f, 183.72499f, 607.794f, 187.427f, 609.082f, 189.68f);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(598.77f, 192.9f);
generalPath.curveTo(598.45f, 188.715f, 590.882f, 189.35799f, 591.203f, 186.13899f);
generalPath.curveTo(591.524f, 182.91899f, 595.391f, 181.631f, 595.391f, 177.124f);
generalPath.curveTo(595.391f, 172.61699f, 602.149f, 172.29399f, 604.403f, 175.836f);
generalPath.curveTo(606.658f, 179.377f, 613.42004f, 186.299f, 614.87f, 182.758f);
generalPath.moveTo(604.41f, 175.84f);
generalPath.curveTo(600.868f, 179.381f, 599.25995f, 186.625f, 603.927f, 192.26f);
generalPath.moveTo(609.24f, 181.31f);
generalPath.curveTo(608.115f, 183.72499f, 607.794f, 187.427f, 609.082f, 189.68f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_19
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(669.36f, 169.48f);
generalPath.curveTo(681.193f, 170.446f, 683.206f, 157.40599f, 674.352f, 156.60199f);
generalPath.moveTo(654.8f, 134.31f);
generalPath.curveTo(650.696f, 129.079f, 641.279f, 127.308f, 641.117f, 138.415f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_20
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(639.99f, 151.05f);
generalPath.curveTo(635.96497f, 141.07f, 625.661f, 139.62f, 620.186f, 144.61f);
generalPath.curveTo(615.63196f, 148.764f, 615.519f, 159.582f, 625.33997f, 161.836f);
generalPath.curveTo(628.72f, 157.812f, 635.31995f, 152.499f, 639.99f, 151.051f);
generalPath.closePath();
generalPath.moveTo(635.56f, 144.77f);
generalPath.curveTo(629.764f, 139.61801f, 621.231f, 149.358f, 628.96f, 158.292f);
generalPath.moveTo(525.31f, 169.16f);
generalPath.curveTo(529.19f, 168.24f, 534.86f, 170.138f, 543.55597f, 174.227f);
generalPath.curveTo(549.03094f, 176.80301f, 565.45197f, 182.27701f, 575.75195f, 176.80301f);
generalPath.curveTo(565.12695f, 180.667f, 557.08093f, 164.56801f, 549.03094f, 166.50002f);
generalPath.curveTo(540.98096f, 168.43202f, 526.25195f, 171.41002f, 520.05597f, 165.53401f);
generalPath.curveTo(535.185f, 166.50002f, 543.323f, 154.51302f, 560.61896f, 164.89001f);
generalPath.curveTo(565.45197f, 167.78801f, 571.569f, 169.72002f, 577.04f, 169.39801f);
generalPath.curveTo(562.87695f, 152.33401f, 544.20197f, 163.28001f, 542.269f, 149.43701f);
generalPath.curveTo(550.802f, 158.613f, 571.648f, 147.34401f, 582.273f, 164.56902f);
generalPath.moveTo(545.33f, 152.01f);
generalPath.curveTo(543.338f, 149.53f, 544.23804f, 147.06f, 542.10004f, 145.105f);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(639.99f, 151.05f);
generalPath.curveTo(635.96497f, 141.07f, 625.661f, 139.62f, 620.186f, 144.61f);
generalPath.curveTo(615.63196f, 148.764f, 615.519f, 159.582f, 625.33997f, 161.836f);
generalPath.curveTo(628.72f, 157.812f, 635.31995f, 152.499f, 639.99f, 151.051f);
generalPath.closePath();
generalPath.moveTo(635.56f, 144.77f);
generalPath.curveTo(629.764f, 139.61801f, 621.231f, 149.358f, 628.96f, 158.292f);
generalPath.moveTo(525.31f, 169.16f);
generalPath.curveTo(529.19f, 168.24f, 534.86f, 170.138f, 543.55597f, 174.227f);
generalPath.curveTo(549.03094f, 176.80301f, 565.45197f, 182.27701f, 575.75195f, 176.80301f);
generalPath.curveTo(565.12695f, 180.667f, 557.08093f, 164.56801f, 549.03094f, 166.50002f);
generalPath.curveTo(540.98096f, 168.43202f, 526.25195f, 171.41002f, 520.05597f, 165.53401f);
generalPath.curveTo(535.185f, 166.50002f, 543.323f, 154.51302f, 560.61896f, 164.89001f);
generalPath.curveTo(565.45197f, 167.78801f, 571.569f, 169.72002f, 577.04f, 169.39801f);
generalPath.curveTo(562.87695f, 152.33401f, 544.20197f, 163.28001f, 542.269f, 149.43701f);
generalPath.curveTo(550.802f, 158.613f, 571.648f, 147.34401f, 582.273f, 164.56902f);
generalPath.moveTo(545.33f, 152.01f);
generalPath.curveTo(543.338f, 149.53f, 544.23804f, 147.06f, 542.10004f, 145.105f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(654.8f, 134.31f);
generalPath.curveTo(651.258f, 130.527f, 643.53296f, 133.505f, 645.704f, 141.152f);
generalPath.curveTo(647.396f, 137.611f, 651.01697f, 134.63199f, 654.8f, 134.31f);
generalPath.closePath();
generalPath.moveTo(632.91f, 154.93f);
generalPath.curveTo(635.34796f, 153.15999f, 637.86395f, 151.70699f, 639.985f, 151.04799f);
generalPath.curveTo(638.82697f, 148.18399f, 637.15497f, 146.02199f, 635.227f, 144.51399f);
generalPath.curveTo(633.385f, 143.24199f, 628.093f, 150.35799f, 632.91f, 154.93f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_4_0
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,1,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(623.4f, 141.87f);
generalPath.curveTo(617.604f, 138.00699f, 612.29205f, 138.329f, 610.521f, 141.54799f);
generalPath.curveTo(606.338f, 141.38799f, 602.875f, 144.44598f, 602.713f, 150.56299f);
generalPath.moveTo(611.65f, 153.14f);
generalPath.curveTo(604.73004f, 148.392f, 595.229f, 150.162f, 595.875f, 160.787f);
generalPath.moveTo(591.69f, 166.82f);
generalPath.curveTo(595.07f, 164.08301f, 599.898f, 162.15201f, 603.603f, 166.981f);
generalPath.moveTo(643.37f, 156.36f);
generalPath.curveTo(642.082f, 158.13f, 641.11597f, 160.867f, 643.207f, 165.053f);
generalPath.curveTo(640.63196f, 161.67299f, 634.19495f, 161.67299f, 627.269f, 170.687f);
generalPath.moveTo(658.66f, 155.88f);
generalPath.curveTo(650.29f, 156.84601f, 650.45197f, 162.319f, 657.20996f, 164.73401f);
generalPath.moveTo(599.1f, 135.43f);
generalPath.curveTo(592.01697f, 133.98099f, 586.867f, 138.16699f, 596.68695f, 141.708f);
generalPath.moveTo(612.62f, 130.6f);
generalPath.curveTo(602.637f, 128.18501f, 598.612f, 130.76001f, 603.12f, 133.015f);
generalPath.moveTo(583.8f, 170.69f);
generalPath.curveTo(583.48f, 174.23201f, 585.40796f, 178.90001f, 591.204f, 173.588f);
generalPath.moveTo(585.74f, 181.31f);
generalPath.curveTo(585.74f, 182.276f, 585.57697f, 183.402f, 584.932f, 184.207f);
generalPath.moveTo(562.55f, 134.14f);
generalPath.curveTo(556.433f, 132.37f, 555.308f, 126.735f, 562.39197f, 127.218f);
generalPath.moveTo(560.46f, 147.18f);
generalPath.curveTo(553.697f, 144.926f, 553.697f, 138.32599f, 559.33f, 138.96999f);
generalPath.moveTo(573.02f, 143.8f);
generalPath.curveTo(565.132f, 141.868f, 564.812f, 136.395f, 570.77f, 137.2f);
generalPath.moveTo(573.98f, 127.06f);
generalPath.curveTo(569.797f, 126.738f, 563.355f, 131.407f, 574.143f, 134.143f);
generalPath.moveTo(585.74f, 136.4f);
generalPath.curveTo(575.92f, 134.95099f, 576.082f, 138.976f, 581.873f, 141.55199f);
generalPath.moveTo(593.14f, 127.06f);
generalPath.curveTo(585.573f, 125.611f, 582.998f, 130.119f, 588.148f, 132.05f);
generalPath.moveTo(569.32f, 154.91f);
generalPath.curveTo(567.466f, 153.381f, 565.94f, 146.056f, 574.79f, 148.23001f);
generalPath.moveTo(587.67f, 152.66f);
generalPath.curveTo(581.716f, 151.05f, 576.082f, 156.845f, 581.553f, 160.226f);
generalPath.moveTo(595.55f, 145.74f);
generalPath.curveTo(589.27496f, 144.613f, 583.962f, 146.384f, 587.342f, 148.63701f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(654.46f, 134.31f);
generalPath.curveTo(650.922f, 134.965f, 647.752f, 137.04399f, 645.698f, 141.15f);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.521f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(654.46f, 134.31f);
generalPath.curveTo(650.922f, 134.965f, 647.752f, 137.04399f, 645.698f, 141.15f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
_paint1(g, origAlpha);
_paint2(g, origAlpha);
_paint3(g, origAlpha);


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
		return 900.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 600.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Flag_of_Bhutan() {
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
    public static NeonIcon of(int width, int height) {
       Flag_of_Bhutan base = new Flag_of_Bhutan();
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
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       Flag_of_Bhutan base = new Flag_of_Bhutan();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return Flag_of_Bhutan::new;
    }
}

