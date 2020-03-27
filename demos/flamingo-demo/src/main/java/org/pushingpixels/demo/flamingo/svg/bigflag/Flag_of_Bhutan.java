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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class Flag_of_Bhutan implements ResizableIcon {
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
generalPath.moveTo(0.0, 0.0);
generalPath.lineTo(900.0, 0.0);
generalPath.lineTo(900.0, 600.0);
generalPath.lineTo(0.0, 600.0);
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
generalPath.moveTo(0.0, 600.0);
generalPath.lineTo(900.0, 600.0);
generalPath.lineTo(900.0, 0.0);
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
generalPath.moveTo(481.74, 187.59);
generalPath.curveTo(476.753, 185.81999, 473.53198, 188.39499, 473.694, 194.834);
generalPath.curveTo(473.853, 201.274, 477.236, 204.976, 482.224, 202.561);
generalPath.lineTo(481.74, 187.591);
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
generalPath.moveTo(481.74, 187.59);
generalPath.curveTo(476.753, 185.81999, 473.53198, 188.39499, 473.694, 194.834);
generalPath.curveTo(473.853, 201.274, 477.236, 204.976, 482.224, 202.561);
generalPath.lineTo(481.74, 187.591);
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
generalPath.moveTo(486.12, 175.53);
generalPath.curveTo(481.966, 172.25, 478.09, 173.656, 476.17398, 179.806);
generalPath.curveTo(474.258, 185.955, 476.27, 190.548, 481.77, 189.864);
generalPath.lineTo(486.12, 175.531);
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
generalPath.moveTo(486.12, 175.53);
generalPath.curveTo(481.966, 172.25, 478.09, 173.656, 476.17398, 179.806);
generalPath.curveTo(474.258, 185.955, 476.27, 190.548, 481.77, 189.864);
generalPath.lineTo(486.12, 175.531);
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
generalPath.moveTo(493.04, 163.86);
generalPath.curveTo(489.46002, 159.955, 485.41, 160.722, 482.532, 166.485);
generalPath.curveTo(479.657, 172.248, 480.907, 177.103, 486.449, 177.31);
generalPath.lineTo(493.04, 163.86);
generalPath.closePath();
generalPath.moveTo(488.5, 220.59);
generalPath.curveTo(482.383, 222.844, 481.737, 231.215, 485.604, 236.366);
generalPath.curveTo(489.467, 241.517, 496.55002, 242.483, 500.41202, 236.366);
generalPath.lineTo(488.502, 220.586);
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
generalPath.moveTo(493.04, 163.86);
generalPath.curveTo(489.46002, 159.955, 485.41, 160.722, 482.532, 166.485);
generalPath.curveTo(479.657, 172.248, 480.907, 177.103, 486.449, 177.31);
generalPath.lineTo(493.04, 163.86);
generalPath.closePath();
generalPath.moveTo(488.5, 220.59);
generalPath.curveTo(482.383, 222.844, 481.737, 231.215, 485.604, 236.366);
generalPath.curveTo(489.467, 241.517, 496.55002, 242.483, 500.41202, 236.366);
generalPath.lineTo(488.502, 220.586);
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
generalPath.moveTo(481.42, 202.88);
generalPath.curveTo(475.62402, 200.948, 470.403, 208.733, 469.50702, 215.75801);
generalPath.curveTo(468.38202, 224.61201, 455.824, 227.50902, 462.74902, 240.87102);
generalPath.curveTo(464.19403, 232.33902, 469.83203, 227.67102, 474.33704, 227.34901);
generalPath.curveTo(478.84503, 227.02701, 485.60703, 226.06102, 488.50403, 220.58801);
generalPath.lineTo(481.42, 202.88);
generalPath.closePath();
generalPath.moveTo(499.77, 237.33);
generalPath.curveTo(493.007, 238.94, 492.03998, 247.955, 496.87, 254.394);
generalPath.curveTo(501.003, 259.90698, 513.933, 258.579, 513.612, 253.106);
generalPath.lineTo(499.77, 237.33);
generalPath.closePath();
generalPath.moveTo(518.93, 291.58);
generalPath.curveTo(519.25, 285.78497, 509.918, 283.53098, 505.409, 284.658);
generalPath.curveTo(500.901, 285.785, 492.288, 284.498, 490.276, 279.668);
generalPath.curveTo(488.668, 283.531, 491.001, 287.717, 497.522, 289.809);
generalPath.curveTo(502.45502, 291.39398, 502.351, 294.961, 500.901, 296.57098);
generalPath.curveTo(504.605, 297.215, 515.551, 297.215, 518.93, 291.581);
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
generalPath.moveTo(481.42, 202.88);
generalPath.curveTo(475.62402, 200.948, 470.403, 208.733, 469.50702, 215.75801);
generalPath.curveTo(468.38202, 224.61201, 455.824, 227.50902, 462.74902, 240.87102);
generalPath.curveTo(464.19403, 232.33902, 469.83203, 227.67102, 474.33704, 227.34901);
generalPath.curveTo(478.84503, 227.02701, 485.60703, 226.06102, 488.50403, 220.58801);
generalPath.lineTo(481.42, 202.88);
generalPath.closePath();
generalPath.moveTo(499.77, 237.33);
generalPath.curveTo(493.007, 238.94, 492.03998, 247.955, 496.87, 254.394);
generalPath.curveTo(501.003, 259.90698, 513.933, 258.579, 513.612, 253.106);
generalPath.lineTo(499.77, 237.33);
generalPath.closePath();
generalPath.moveTo(518.93, 291.58);
generalPath.curveTo(519.25, 285.78497, 509.918, 283.53098, 505.409, 284.658);
generalPath.curveTo(500.901, 285.785, 492.288, 284.498, 490.276, 279.668);
generalPath.curveTo(488.668, 283.531, 491.001, 287.717, 497.522, 289.809);
generalPath.curveTo(502.45502, 291.39398, 502.351, 294.961, 500.901, 296.57098);
generalPath.curveTo(504.605, 297.215, 515.551, 297.215, 518.93, 291.581);
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
generalPath.moveTo(513.62, 254.56);
generalPath.curveTo(507.02, 251.663, 503.107, 256.076, 500.582, 260.355);
generalPath.curveTo(496.878, 266.633, 485.449, 258.58502, 481.586, 266.95502);
generalPath.curveTo(486.819, 264.70203, 492.144, 269.50803, 494.624, 271.14102);
generalPath.curveTo(501.707, 275.80902, 515.391, 274.36102, 517.324, 263.41403);
generalPath.lineTo(513.62, 254.56003);
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
generalPath.moveTo(513.62, 254.56);
generalPath.curveTo(507.02, 251.663, 503.107, 256.076, 500.582, 260.355);
generalPath.curveTo(496.878, 266.633, 485.449, 258.58502, 481.586, 266.95502);
generalPath.curveTo(486.819, 264.70203, 492.144, 269.50803, 494.624, 271.14102);
generalPath.curveTo(501.707, 275.80902, 515.391, 274.36102, 517.324, 263.41403);
generalPath.lineTo(513.62, 254.56003);
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
generalPath.moveTo(517.48, 262.28);
generalPath.curveTo(510.87997, 267.27, 508.305, 273.226, 508.468, 277.251);
generalPath.curveTo(508.62997, 281.276, 514.263, 290.129, 520.381, 290.612);
generalPath.curveTo(523.922, 283.368, 525.693, 268.075, 517.48096, 262.28);
generalPath.closePath();
generalPath.moveTo(490.12, 293.35);
generalPath.curveTo(490.12, 290.935, 493.662, 289.97, 496.074, 290.77402);
generalPath.curveTo(498.491, 291.579, 502.191, 293.99402, 500.904, 296.57);
generalPath.lineTo(490.12, 293.35);
generalPath.closePath();
generalPath.moveTo(453.73, 280.15);
generalPath.curveTo(453.088, 277.253, 457.755, 272.262, 464.034, 274.999);
generalPath.curveTo(470.309, 277.735, 471.117, 283.048, 468.538, 285.141);
generalPath.lineTo(453.72998, 280.151);
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
generalPath.moveTo(517.48, 262.28);
generalPath.curveTo(510.87997, 267.27, 508.305, 273.226, 508.468, 277.251);
generalPath.curveTo(508.62997, 281.276, 514.263, 290.129, 520.381, 290.612);
generalPath.curveTo(523.922, 283.368, 525.693, 268.075, 517.48096, 262.28);
generalPath.closePath();
generalPath.moveTo(490.12, 293.35);
generalPath.curveTo(490.12, 290.935, 493.662, 289.97, 496.074, 290.77402);
generalPath.curveTo(498.491, 291.579, 502.191, 293.99402, 500.904, 296.57);
generalPath.lineTo(490.12, 293.35);
generalPath.closePath();
generalPath.moveTo(453.73, 280.15);
generalPath.curveTo(453.088, 277.253, 457.755, 272.262, 464.034, 274.999);
generalPath.curveTo(470.309, 277.735, 471.117, 283.048, 468.538, 285.141);
generalPath.lineTo(453.72998, 280.151);
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
generalPath.moveTo(469.02, 285.46);
generalPath.curveTo(468.537, 283.85, 473.05698, 280.63498, 480.774, 282.56198);
generalPath.curveTo(488.499, 284.494, 490.39398, 289.469, 490.112, 293.348);
generalPath.lineTo(469.019, 285.46);
generalPath.closePath();
generalPath.moveTo(452.93, 280.15);
generalPath.curveTo(456.955, 277.09198, 455.43, 271.29498, 451.8, 269.525);
generalPath.curveTo(445.19998, 266.305, 447.61697, 257.935, 443.43, 256.32498);
generalPath.curveTo(439.24698, 254.71498, 435.222, 251.81699, 435.06, 248.91998);
generalPath.curveTo(432.968, 252.94398, 434.255, 256.64697, 437.155, 259.223);
generalPath.curveTo(440.051, 261.79898, 434.901, 272.262, 438.601, 274.999);
generalPath.lineTo(452.93002, 280.15);
generalPath.closePath();
generalPath.moveTo(366.64, 277.9);
generalPath.curveTo(363.26, 272.58798, 355.21002, 273.554, 351.83002, 277.25598);
generalPath.curveTo(348.45, 280.95898, 348.933, 286.43198, 352.152, 288.84598);
generalPath.lineTo(366.64, 277.9);
generalPath.closePath();
generalPath.moveTo(385.96, 270.01);
generalPath.curveTo(384.672, 262.927, 376.13998, 262.122, 371.472, 263.893);
generalPath.curveTo(366.804, 265.663, 363.58398, 272.747, 366.642, 277.898);
generalPath.lineTo(385.961, 270.01);
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
generalPath.moveTo(469.02, 285.46);
generalPath.curveTo(468.537, 283.85, 473.05698, 280.63498, 480.774, 282.56198);
generalPath.curveTo(488.499, 284.494, 490.39398, 289.469, 490.112, 293.348);
generalPath.lineTo(469.019, 285.46);
generalPath.closePath();
generalPath.moveTo(452.93, 280.15);
generalPath.curveTo(456.955, 277.09198, 455.43, 271.29498, 451.8, 269.525);
generalPath.curveTo(445.19998, 266.305, 447.61697, 257.935, 443.43, 256.32498);
generalPath.curveTo(439.24698, 254.71498, 435.222, 251.81699, 435.06, 248.91998);
generalPath.curveTo(432.968, 252.94398, 434.255, 256.64697, 437.155, 259.223);
generalPath.curveTo(440.051, 261.79898, 434.901, 272.262, 438.601, 274.999);
generalPath.lineTo(452.93002, 280.15);
generalPath.closePath();
generalPath.moveTo(366.64, 277.9);
generalPath.curveTo(363.26, 272.58798, 355.21002, 273.554, 351.83002, 277.25598);
generalPath.curveTo(348.45, 280.95898, 348.933, 286.43198, 352.152, 288.84598);
generalPath.lineTo(366.64, 277.9);
generalPath.closePath();
generalPath.moveTo(385.96, 270.01);
generalPath.curveTo(384.672, 262.927, 376.13998, 262.122, 371.472, 263.893);
generalPath.curveTo(366.804, 265.663, 363.58398, 272.747, 366.642, 277.898);
generalPath.lineTo(385.961, 270.01);
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
generalPath.moveTo(398.84, 269.04);
generalPath.curveTo(401.898, 263.084, 395.943, 254.23001, 389.181, 252.94202);
generalPath.curveTo(383.537, 251.86801, 376.866, 251.89601, 374.693, 246.34201);
generalPath.curveTo(373.32498, 251.17201, 376.947, 254.23001, 381.133, 256.967);
generalPath.curveTo(385.318, 259.704, 380.327, 266.78702, 387.089, 270.811);
generalPath.lineTo(398.841, 269.04102);
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
generalPath.moveTo(398.84, 269.04);
generalPath.curveTo(401.898, 263.084, 395.943, 254.23001, 389.181, 252.94202);
generalPath.curveTo(383.537, 251.86801, 376.866, 251.89601, 374.693, 246.34201);
generalPath.curveTo(373.32498, 251.17201, 376.947, 254.23001, 381.133, 256.967);
generalPath.curveTo(385.318, 259.704, 380.327, 266.78702, 387.089, 270.811);
generalPath.lineTo(398.841, 269.04102);
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
generalPath.moveTo(398.2, 269.25);
generalPath.curveTo(396.79102, 264.983, 399.64902, 259.307, 405.432, 259.705);
generalPath.curveTo(411.217, 260.103, 414.512, 264.305, 411.962, 269.56);
generalPath.lineTo(398.199, 269.25);
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
generalPath.moveTo(398.2, 269.25);
generalPath.curveTo(396.79102, 264.983, 399.64902, 259.307, 405.432, 259.705);
generalPath.curveTo(411.217, 260.103, 414.512, 264.305, 411.962, 269.56);
generalPath.lineTo(398.199, 269.25);
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
generalPath.moveTo(411.07, 269.57);
generalPath.curveTo(410.27402, 265.148, 413.9, 259.93, 419.57, 261.135);
generalPath.curveTo(425.242, 262.34, 427.913, 266.965, 424.65402, 271.81);
generalPath.lineTo(411.07, 269.57);
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
generalPath.moveTo(411.07, 269.57);
generalPath.curveTo(410.27402, 265.148, 413.9, 259.93, 419.57, 261.135);
generalPath.curveTo(425.242, 262.34, 427.913, 266.965, 424.65402, 271.81);
generalPath.lineTo(411.07, 269.57);
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
generalPath.moveTo(423.86, 271.6);
generalPath.curveTo(423.28497, 267.143, 427.168, 262.112, 432.77197, 263.599);
generalPath.curveTo(438.37698, 265.086, 440.81396, 269.839, 437.31396, 274.514);
generalPath.lineTo(423.86, 271.6);
generalPath.closePath();
generalPath.moveTo(326.72, 345.35);
generalPath.curveTo(315.934, 345.35, 313.3, 347.918, 311.749, 359.03302);
generalPath.curveTo(309.817, 372.877, 328.65198, 374.48703, 326.72, 345.35);
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
generalPath.moveTo(423.86, 271.6);
generalPath.curveTo(423.28497, 267.143, 427.168, 262.112, 432.77197, 263.599);
generalPath.curveTo(438.37698, 265.086, 440.81396, 269.839, 437.31396, 274.514);
generalPath.lineTo(423.86, 271.6);
generalPath.closePath();
generalPath.moveTo(326.72, 345.35);
generalPath.curveTo(315.934, 345.35, 313.3, 347.918, 311.749, 359.03302);
generalPath.curveTo(309.817, 372.877, 328.65198, 374.48703, 326.72, 345.35);
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
generalPath.moveTo(331.55, 330.86);
generalPath.curveTo(314.969, 324.58197, 305.955, 350.82098, 289.53497, 346.15298);
generalPath.curveTo(295.40997, 355.49, 309.65298, 346.16998, 314.96896, 347.119);
generalPath.curveTo(323.98398, 348.72897, 343.46198, 345.348, 331.54996, 330.85898);
generalPath.closePath();
generalPath.moveTo(320.76, 366.76);
generalPath.curveTo(312.55002, 363.058, 303.696, 375.614, 305.306, 381.087);
generalPath.curveTo(307.35, 388.039, 326.072, 382.375, 320.76, 366.76);
generalPath.closePath();
generalPath.moveTo(282.45, 420.85);
generalPath.curveTo(286.958, 422.133, 292.43002, 424.712, 291.46503, 433.404);
generalPath.curveTo(290.49902, 442.09598, 274.08002, 459.804, 259.27002, 460.771);
generalPath.curveTo(244.46002, 461.738, 239.14702, 479.604, 226.43002, 474.613);
generalPath.curveTo(238.34203, 472.363, 238.34203, 458.838, 247.67902, 454.655);
generalPath.curveTo(240.91702, 452.238, 237.37602, 467.534, 228.68402, 467.534);
generalPath.curveTo(219.99103, 467.534, 215.80602, 481.376, 205.18102, 480.409);
generalPath.curveTo(194.55602, 479.44598, 193.43802, 497.263, 172.18102, 497.47598);
generalPath.curveTo(155.92102, 497.63397, 135.80002, 516.63, 128.55602, 508.422);
generalPath.curveTo(144.33202, 506.168, 150.69801, 497.426, 160.10802, 487.814);
generalPath.curveTo(175.24002, 472.36398, 192.30402, 479.284, 198.09802, 465.60098);
generalPath.curveTo(191.17603, 470.26797, 183.12802, 472.521, 175.24002, 472.36398);
generalPath.curveTo(165.33801, 472.159, 154.47401, 488.13898, 143.36603, 481.055);
generalPath.curveTo(149.80502, 480.251, 153.99103, 477.514, 160.75203, 470.43);
generalPath.curveTo(167.67503, 463.176, 177.83502, 467.86398, 185.86504, 460.451);
generalPath.curveTo(198.42104, 448.85898, 209.20703, 458.51797, 221.28003, 444.03);
generalPath.curveTo(217.89903, 442.422, 210.65503, 443.547, 203.89403, 447.088);
generalPath.curveTo(197.13203, 450.63, 188.44003, 444.67203, 180.71303, 448.859);
generalPath.curveTo(181.67802, 439.363, 199.70802, 444.797, 210.97702, 438.234);
generalPath.curveTo(223.69502, 430.83002, 234.23901, 433.001, 244.30002, 433.888);
generalPath.curveTo(230.29501, 433.809, 224.82202, 420.525, 205.50502, 424.388);
generalPath.curveTo(197.08002, 426.076, 190.37302, 412.8, 182.00201, 419.559);
generalPath.curveTo(182.24202, 414.572, 191.01701, 410.546, 200.03201, 415.37598);
generalPath.curveTo(209.04602, 420.205, 212.68001, 411.14996, 230.61801, 422.45898);
generalPath.curveTo(238.02301, 427.12598, 250.74, 419.559, 258.78802, 424.551);
generalPath.curveTo(257.74203, 421.49298, 253.15402, 419.559, 247.76202, 419.96298);
generalPath.curveTo(251.14203, 413.04297, 272.95502, 413.926, 282.45203, 420.85098);
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
generalPath.moveTo(331.55, 330.86);
generalPath.curveTo(314.969, 324.58197, 305.955, 350.82098, 289.53497, 346.15298);
generalPath.curveTo(295.40997, 355.49, 309.65298, 346.16998, 314.96896, 347.119);
generalPath.curveTo(323.98398, 348.72897, 343.46198, 345.348, 331.54996, 330.85898);
generalPath.closePath();
generalPath.moveTo(320.76, 366.76);
generalPath.curveTo(312.55002, 363.058, 303.696, 375.614, 305.306, 381.087);
generalPath.curveTo(307.35, 388.039, 326.072, 382.375, 320.76, 366.76);
generalPath.closePath();
generalPath.moveTo(282.45, 420.85);
generalPath.curveTo(286.958, 422.133, 292.43002, 424.712, 291.46503, 433.404);
generalPath.curveTo(290.49902, 442.09598, 274.08002, 459.804, 259.27002, 460.771);
generalPath.curveTo(244.46002, 461.738, 239.14702, 479.604, 226.43002, 474.613);
generalPath.curveTo(238.34203, 472.363, 238.34203, 458.838, 247.67902, 454.655);
generalPath.curveTo(240.91702, 452.238, 237.37602, 467.534, 228.68402, 467.534);
generalPath.curveTo(219.99103, 467.534, 215.80602, 481.376, 205.18102, 480.409);
generalPath.curveTo(194.55602, 479.44598, 193.43802, 497.263, 172.18102, 497.47598);
generalPath.curveTo(155.92102, 497.63397, 135.80002, 516.63, 128.55602, 508.422);
generalPath.curveTo(144.33202, 506.168, 150.69801, 497.426, 160.10802, 487.814);
generalPath.curveTo(175.24002, 472.36398, 192.30402, 479.284, 198.09802, 465.60098);
generalPath.curveTo(191.17603, 470.26797, 183.12802, 472.521, 175.24002, 472.36398);
generalPath.curveTo(165.33801, 472.159, 154.47401, 488.13898, 143.36603, 481.055);
generalPath.curveTo(149.80502, 480.251, 153.99103, 477.514, 160.75203, 470.43);
generalPath.curveTo(167.67503, 463.176, 177.83502, 467.86398, 185.86504, 460.451);
generalPath.curveTo(198.42104, 448.85898, 209.20703, 458.51797, 221.28003, 444.03);
generalPath.curveTo(217.89903, 442.422, 210.65503, 443.547, 203.89403, 447.088);
generalPath.curveTo(197.13203, 450.63, 188.44003, 444.67203, 180.71303, 448.859);
generalPath.curveTo(181.67802, 439.363, 199.70802, 444.797, 210.97702, 438.234);
generalPath.curveTo(223.69502, 430.83002, 234.23901, 433.001, 244.30002, 433.888);
generalPath.curveTo(230.29501, 433.809, 224.82202, 420.525, 205.50502, 424.388);
generalPath.curveTo(197.08002, 426.076, 190.37302, 412.8, 182.00201, 419.559);
generalPath.curveTo(182.24202, 414.572, 191.01701, 410.546, 200.03201, 415.37598);
generalPath.curveTo(209.04602, 420.205, 212.68001, 411.14996, 230.61801, 422.45898);
generalPath.curveTo(238.02301, 427.12598, 250.74, 419.559, 258.78802, 424.551);
generalPath.curveTo(257.74203, 421.49298, 253.15402, 419.559, 247.76202, 419.96298);
generalPath.curveTo(251.14203, 413.04297, 272.95502, 413.926, 282.45203, 420.85098);
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
generalPath.moveTo(296.78, 410.38);
generalPath.curveTo(289.697, 404.907, 279.877, 411.508, 273.116, 408.931);
generalPath.curveTo(273.116, 413.437, 275.37, 420.201, 282.775, 422.775);
generalPath.curveTo(285.029, 421.167, 295.16998, 412.31198, 296.78, 410.38);
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
generalPath.moveTo(296.78, 410.38);
generalPath.curveTo(289.697, 404.907, 279.877, 411.508, 273.116, 408.931);
generalPath.curveTo(273.116, 413.437, 275.37, 420.201, 282.775, 422.775);
generalPath.curveTo(285.029, 421.167, 295.16998, 412.31198, 296.78, 410.38);
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
generalPath.moveTo(307.89, 394.77);
generalPath.curveTo(296.782, 389.136, 294.851, 403.13998, 286.15802, 400.24298);
generalPath.curveTo(286.48, 404.26797, 289.7, 409.258, 296.78302, 410.38498);
generalPath.lineTo(307.89102, 394.77);
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
generalPath.moveTo(307.89, 394.77);
generalPath.curveTo(296.782, 389.136, 294.851, 403.13998, 286.15802, 400.24298);
generalPath.curveTo(286.48, 404.26797, 289.7, 409.258, 296.78302, 410.38498);
generalPath.lineTo(307.89102, 394.77);
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
generalPath.moveTo(314.49, 382.05);
generalPath.curveTo(298.06998, 375.61, 295.977, 391.387, 286.319, 388.328);
generalPath.curveTo(288.573, 393.801, 302.417, 396.698, 309.5, 394.768);
generalPath.lineTo(314.49, 382.05002);
generalPath.closePath();
generalPath.moveTo(337.02, 312.99);
generalPath.curveTo(332.67297, 306.873, 323.498, 311.86298, 322.04898, 319.107);
generalPath.curveTo(320.59998, 326.35098, 324.141, 336.49298, 330.25897, 334.23898);
generalPath.lineTo(337.01898, 312.99);
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
generalPath.moveTo(314.49, 382.05);
generalPath.curveTo(298.06998, 375.61, 295.977, 391.387, 286.319, 388.328);
generalPath.curveTo(288.573, 393.801, 302.417, 396.698, 309.5, 394.768);
generalPath.lineTo(314.49, 382.05002);
generalPath.closePath();
generalPath.moveTo(337.02, 312.99);
generalPath.curveTo(332.67297, 306.873, 323.498, 311.86298, 322.04898, 319.107);
generalPath.curveTo(320.59998, 326.35098, 324.141, 336.49298, 330.25897, 334.23898);
generalPath.lineTo(337.01898, 312.99);
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
generalPath.moveTo(348.13, 293.67);
generalPath.curveTo(340.564, 291.90002, 331.871, 292.704, 332.837, 300.11002);
generalPath.curveTo(329.939, 301.397, 329.134, 310.89502, 337.022, 312.98703);
generalPath.lineTo(348.13, 293.66904);
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
generalPath.moveTo(348.13, 293.67);
generalPath.curveTo(340.564, 291.90002, 331.871, 292.704, 332.837, 300.11002);
generalPath.curveTo(329.939, 301.397, 329.134, 310.89502, 337.022, 312.98703);
generalPath.lineTo(348.13, 293.66904);
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
generalPath.moveTo(353.12, 288.68);
generalPath.curveTo(345.715, 279.987, 337.457, 280.19, 332.837, 283.85);
generalPath.curveTo(324.305, 290.612, 316.014, 286.74802, 315.773, 293.51);
generalPath.curveTo(320.92502, 289.565, 325.432, 294.314, 329.617, 292.86502);
generalPath.curveTo(333.802, 291.41702, 336.861, 299.46503, 348.452, 296.08502);
generalPath.lineTo(353.12, 288.68002);
generalPath.closePath();
generalPath.moveTo(335.25, 418.6);
generalPath.curveTo(336.377, 420.69202, 343.299, 421.65802, 346.68, 418.117);
generalPath.curveTo(351.16, 413.421, 346.197, 400.407, 339.11398, 399.44202);
generalPath.curveTo(332.03098, 398.476, 331.387, 414.092, 335.24997, 418.6);
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
generalPath.moveTo(353.12, 288.68);
generalPath.curveTo(345.715, 279.987, 337.457, 280.19, 332.837, 283.85);
generalPath.curveTo(324.305, 290.612, 316.014, 286.74802, 315.773, 293.51);
generalPath.curveTo(320.92502, 289.565, 325.432, 294.314, 329.617, 292.86502);
generalPath.curveTo(333.802, 291.41702, 336.861, 299.46503, 348.452, 296.08502);
generalPath.lineTo(353.12, 288.68002);
generalPath.closePath();
generalPath.moveTo(335.25, 418.6);
generalPath.curveTo(336.377, 420.69202, 343.299, 421.65802, 346.68, 418.117);
generalPath.curveTo(351.16, 413.421, 346.197, 400.407, 339.11398, 399.44202);
generalPath.curveTo(332.03098, 398.476, 331.387, 414.092, 335.24997, 418.6);
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
generalPath.moveTo(327.2, 418.92);
generalPath.curveTo(337.341, 422.62003, 341.68802, 414.25, 336.21503, 408.93903);
generalPath.curveTo(334.765, 410.709, 329.45303, 417.14902, 327.2, 418.92);
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
generalPath.moveTo(327.2, 418.92);
generalPath.curveTo(337.341, 422.62003, 341.68802, 414.25, 336.21503, 408.93903);
generalPath.curveTo(334.765, 410.709, 329.45303, 417.14902, 327.2, 418.92);
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
generalPath.moveTo(289.21, 432.76);
generalPath.curveTo(287.27798, 438.556, 277.297, 439.523, 266.029, 457.552);
generalPath.curveTo(254.76, 475.581, 243.97499, 468.015, 241.23799, 480.41);
generalPath.curveTo(254.76, 469.464, 265.38, 476.73502, 273.43298, 465.922);
generalPath.curveTo(285.66797, 449.501, 295.74197, 451.859, 300.478, 440.809);
generalPath.curveTo(307.238, 425.034, 336.859, 425.35498, 338.469, 400.565);
generalPath.curveTo(328.48898, 398.633, 296.936, 425.355, 289.21, 432.759);
generalPath.closePath();
generalPath.moveTo(543.24, 189.36);
generalPath.curveTo(556.119, 193.545, 556.44, 210.287, 571.248, 215.76);
generalPath.curveTo(586.061, 221.233, 587.511, 234.433, 599.581, 231.21399);
generalPath.curveTo(588.31396, 228.15498, 589.118, 215.116, 577.368, 211.896);
generalPath.curveTo(563.58496, 208.12, 558.372, 187.105, 547.422, 183.886);
generalPath.moveTo(602.32, 276.77);
generalPath.curveTo(604.57404, 281.921, 604.253, 291.097, 596.203, 293.512);
generalPath.curveTo(600.549, 296.249, 606.986, 293.672, 610.528, 287.71698);
generalPath.curveTo(605.216, 299.468, 608.758, 310.093, 617.128, 312.18597);
generalPath.curveTo(613.10297, 303.97598, 622.12, 300.11197, 619.224, 294.8);
generalPath.curveTo(624.537, 297.054, 629.204, 304.29797, 629.041, 308.805);
generalPath.curveTo(635.966, 301.078, 623.891, 290.775, 626.145, 283.53198);
generalPath.lineTo(602.32, 276.771);
generalPath.closePath();
generalPath.moveTo(518.93, 359.51);
generalPath.curveTo(511.042, 352.588, 507.676, 361.32, 503.797, 358.302);
generalPath.curveTo(500.177, 355.48502, 495.347, 355.082, 493.497, 357.9);
generalPath.curveTo(500.259, 358.142, 496.95502, 363.373, 510.07602, 364.66098);
generalPath.curveTo(496.95502, 365.54697, 499.372, 380.19598, 490.59702, 379.47098);
generalPath.curveTo(499.93503, 388.32498, 504.764, 371.58298, 512.33, 374.32098);
generalPath.curveTo(510.07602, 374.964, 515.872, 380.27597, 511.84702, 387.35898);
generalPath.curveTo(518.367, 387.19897, 521.02203, 378.18298, 521.83, 373.51498);
generalPath.lineTo(518.93, 359.50998);
generalPath.closePath();
generalPath.moveTo(345.23, 434.69);
generalPath.curveTo(342.332, 432.277, 333.961, 431.148, 330.742, 433.082);
generalPath.curveTo(327.522, 435.011, 328.65, 435.494, 332.512, 435.819);
generalPath.curveTo(336.37698, 436.14, 341.365, 442.39, 332.996, 442.74);
generalPath.curveTo(329.132, 442.89798, 330.42, 452.236, 322.371, 452.882);
generalPath.curveTo(325.671, 456.90698, 335.089, 454.249, 338.469, 449.82397);
generalPath.curveTo(337.82498, 453.44397, 342.654, 456.744, 340.723, 461.09097);
generalPath.curveTo(346.679, 461.73697, 343.218, 449.01996, 352.636, 449.66098);
generalPath.curveTo(348.77197, 450.145, 350.382, 458.83698, 357.14297, 456.58298);
generalPath.curveTo(353.11798, 458.516, 355.21097, 463.18298, 359.718, 462.05798);
generalPath.curveTo(356.82098, 463.024, 355.85498, 466.72397, 359.879, 468.81998);
generalPath.curveTo(363.743, 463.50797, 359.396, 444.51196, 345.23, 434.69098);
generalPath.closePath();
generalPath.moveTo(695.85, 257.07);
generalPath.curveTo(708.17096, 257.07, 718.15796, 247.08, 718.15796, 234.75801);
generalPath.curveTo(718.15796, 222.43802, 708.17, 212.44801, 695.85, 212.44801);
generalPath.curveTo(683.52496, 212.44801, 673.537, 222.43802, 673.537, 234.75801);
generalPath.curveTo(673.537, 247.08002, 683.52496, 257.07, 695.85, 257.07);
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
generalPath.moveTo(289.21, 432.76);
generalPath.curveTo(287.27798, 438.556, 277.297, 439.523, 266.029, 457.552);
generalPath.curveTo(254.76, 475.581, 243.97499, 468.015, 241.23799, 480.41);
generalPath.curveTo(254.76, 469.464, 265.38, 476.73502, 273.43298, 465.922);
generalPath.curveTo(285.66797, 449.501, 295.74197, 451.859, 300.478, 440.809);
generalPath.curveTo(307.238, 425.034, 336.859, 425.35498, 338.469, 400.565);
generalPath.curveTo(328.48898, 398.633, 296.936, 425.355, 289.21, 432.759);
generalPath.closePath();
generalPath.moveTo(543.24, 189.36);
generalPath.curveTo(556.119, 193.545, 556.44, 210.287, 571.248, 215.76);
generalPath.curveTo(586.061, 221.233, 587.511, 234.433, 599.581, 231.21399);
generalPath.curveTo(588.31396, 228.15498, 589.118, 215.116, 577.368, 211.896);
generalPath.curveTo(563.58496, 208.12, 558.372, 187.105, 547.422, 183.886);
generalPath.moveTo(602.32, 276.77);
generalPath.curveTo(604.57404, 281.921, 604.253, 291.097, 596.203, 293.512);
generalPath.curveTo(600.549, 296.249, 606.986, 293.672, 610.528, 287.71698);
generalPath.curveTo(605.216, 299.468, 608.758, 310.093, 617.128, 312.18597);
generalPath.curveTo(613.10297, 303.97598, 622.12, 300.11197, 619.224, 294.8);
generalPath.curveTo(624.537, 297.054, 629.204, 304.29797, 629.041, 308.805);
generalPath.curveTo(635.966, 301.078, 623.891, 290.775, 626.145, 283.53198);
generalPath.lineTo(602.32, 276.771);
generalPath.closePath();
generalPath.moveTo(518.93, 359.51);
generalPath.curveTo(511.042, 352.588, 507.676, 361.32, 503.797, 358.302);
generalPath.curveTo(500.177, 355.48502, 495.347, 355.082, 493.497, 357.9);
generalPath.curveTo(500.259, 358.142, 496.95502, 363.373, 510.07602, 364.66098);
generalPath.curveTo(496.95502, 365.54697, 499.372, 380.19598, 490.59702, 379.47098);
generalPath.curveTo(499.93503, 388.32498, 504.764, 371.58298, 512.33, 374.32098);
generalPath.curveTo(510.07602, 374.964, 515.872, 380.27597, 511.84702, 387.35898);
generalPath.curveTo(518.367, 387.19897, 521.02203, 378.18298, 521.83, 373.51498);
generalPath.lineTo(518.93, 359.50998);
generalPath.closePath();
generalPath.moveTo(345.23, 434.69);
generalPath.curveTo(342.332, 432.277, 333.961, 431.148, 330.742, 433.082);
generalPath.curveTo(327.522, 435.011, 328.65, 435.494, 332.512, 435.819);
generalPath.curveTo(336.37698, 436.14, 341.365, 442.39, 332.996, 442.74);
generalPath.curveTo(329.132, 442.89798, 330.42, 452.236, 322.371, 452.882);
generalPath.curveTo(325.671, 456.90698, 335.089, 454.249, 338.469, 449.82397);
generalPath.curveTo(337.82498, 453.44397, 342.654, 456.744, 340.723, 461.09097);
generalPath.curveTo(346.679, 461.73697, 343.218, 449.01996, 352.636, 449.66098);
generalPath.curveTo(348.77197, 450.145, 350.382, 458.83698, 357.14297, 456.58298);
generalPath.curveTo(353.11798, 458.516, 355.21097, 463.18298, 359.718, 462.05798);
generalPath.curveTo(356.82098, 463.024, 355.85498, 466.72397, 359.879, 468.81998);
generalPath.curveTo(363.743, 463.50797, 359.396, 444.51196, 345.23, 434.69098);
generalPath.closePath();
generalPath.moveTo(695.85, 257.07);
generalPath.curveTo(708.17096, 257.07, 718.15796, 247.08, 718.15796, 234.75801);
generalPath.curveTo(718.15796, 222.43802, 708.17, 212.44801, 695.85, 212.44801);

}

private void _paint1(Graphics2D g,float origAlpha) {
generalPath.curveTo(683.52496, 212.44801, 673.537, 222.43802, 673.537, 234.75801);
generalPath.curveTo(673.537, 247.08002, 683.52496, 257.07, 695.85, 257.07);
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
generalPath.moveTo(579.3, 284.02);
generalPath.curveTo(586.063, 277.58, 596.367, 274.361, 603.446, 279.19);
generalPath.curveTo(610.529, 284.02, 634.034, 289.815, 645.625, 281.766);
generalPath.curveTo(657.213, 273.71698, 662.688, 269.531, 667.838, 270.49698);
generalPath.curveTo(671.705, 276.29297, 676.37103, 279.029, 682.167, 279.512);
generalPath.curveTo(683.937, 281.444, 690.217, 283.054, 693.759, 282.57);
generalPath.curveTo(698.909, 283.858, 705.188, 282.249, 710.17596, 276.775);
generalPath.curveTo(717.90594, 277.902, 725.147, 272.107, 727.884, 263.415);
generalPath.curveTo(736.092, 262.449, 736.576, 253.272, 731.42596, 247.15501);
generalPath.curveTo(726.59595, 246.19002, 730.30096, 229.93001, 712.751, 233.15001);
generalPath.curveTo(720.159, 237.658, 714.521, 246.67201, 720.64197, 250.858);
generalPath.curveTo(716.45496, 250.858, 711.063, 252.629, 709.77496, 258.908);
generalPath.curveTo(711.384, 254.56099, 709.53394, 251.663, 708.40497, 250.69798);
generalPath.curveTo(708.56696, 246.99498, 700.35895, 237.89998, 692.62994, 241.19998);
generalPath.curveTo(698.18396, 242.40698, 695.04596, 251.34198, 699.0709, 254.72198);
generalPath.curveTo(696.1709, 254.88298, 693.1129, 256.33197, 691.3419, 258.90698);
generalPath.curveTo(689.24994, 255.20499, 681.84595, 251.34099, 677.3379, 251.01898);
generalPath.curveTo(677.3379, 249.73099, 677.0959, 247.15598, 676.5339, 245.86899);
generalPath.curveTo(674.5209, 242.00499, 672.8299, 237.41699, 673.63385, 231.54099);
generalPath.curveTo(669.7709, 235.72598, 666.55084, 241.52098, 664.62085, 245.70699);
generalPath.curveTo(658.5048, 241.52199, 643.37085, 247.63899, 636.28784, 249.24799);
generalPath.curveTo(629.20483, 250.85799, 605.3798, 246.99498, 599.90485, 241.19899);
generalPath.curveTo(594.4349, 235.40399, 583.80884, 231.86299, 573.82983, 228.965);
generalPath.curveTo(560.10486, 224.982, 559.9838, 209.97, 544.8508, 199.66699);
generalPath.curveTo(544.5308, 218.34099, 572.86383, 277.581, 579.30084, 284.02);
generalPath.closePath();
generalPath.moveTo(421.54, 426.32);
generalPath.curveTo(433.453, 426.32, 443.11102, 416.66202, 443.11102, 404.74902);
generalPath.curveTo(443.11102, 392.83603, 433.45303, 383.17902, 421.54004, 383.17902);
generalPath.curveTo(409.62704, 383.17902, 399.96906, 392.837, 399.96906, 404.74902);
generalPath.curveTo(399.96906, 416.66202, 409.62704, 426.32, 421.54004, 426.32);
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
generalPath.moveTo(579.3, 284.02);
generalPath.curveTo(586.063, 277.58, 596.367, 274.361, 603.446, 279.19);
generalPath.curveTo(610.529, 284.02, 634.034, 289.815, 645.625, 281.766);
generalPath.curveTo(657.213, 273.71698, 662.688, 269.531, 667.838, 270.49698);
generalPath.curveTo(671.705, 276.29297, 676.37103, 279.029, 682.167, 279.512);
generalPath.curveTo(683.937, 281.444, 690.217, 283.054, 693.759, 282.57);
generalPath.curveTo(698.909, 283.858, 705.188, 282.249, 710.17596, 276.775);
generalPath.curveTo(717.90594, 277.902, 725.147, 272.107, 727.884, 263.415);
generalPath.curveTo(736.092, 262.449, 736.576, 253.272, 731.42596, 247.15501);
generalPath.curveTo(726.59595, 246.19002, 730.30096, 229.93001, 712.751, 233.15001);
generalPath.curveTo(720.159, 237.658, 714.521, 246.67201, 720.64197, 250.858);
generalPath.curveTo(716.45496, 250.858, 711.063, 252.629, 709.77496, 258.908);
generalPath.curveTo(711.384, 254.56099, 709.53394, 251.663, 708.40497, 250.69798);
generalPath.curveTo(708.56696, 246.99498, 700.35895, 237.89998, 692.62994, 241.19998);
generalPath.curveTo(698.18396, 242.40698, 695.04596, 251.34198, 699.0709, 254.72198);
generalPath.curveTo(696.1709, 254.88298, 693.1129, 256.33197, 691.3419, 258.90698);
generalPath.curveTo(689.24994, 255.20499, 681.84595, 251.34099, 677.3379, 251.01898);
generalPath.curveTo(677.3379, 249.73099, 677.0959, 247.15598, 676.5339, 245.86899);
generalPath.curveTo(674.5209, 242.00499, 672.8299, 237.41699, 673.63385, 231.54099);
generalPath.curveTo(669.7709, 235.72598, 666.55084, 241.52098, 664.62085, 245.70699);
generalPath.curveTo(658.5048, 241.52199, 643.37085, 247.63899, 636.28784, 249.24799);
generalPath.curveTo(629.20483, 250.85799, 605.3798, 246.99498, 599.90485, 241.19899);
generalPath.curveTo(594.4349, 235.40399, 583.80884, 231.86299, 573.82983, 228.965);
generalPath.curveTo(560.10486, 224.982, 559.9838, 209.97, 544.8508, 199.66699);
generalPath.curveTo(544.5308, 218.34099, 572.86383, 277.581, 579.30084, 284.02);
generalPath.closePath();
generalPath.moveTo(421.54, 426.32);
generalPath.curveTo(433.453, 426.32, 443.11102, 416.66202, 443.11102, 404.74902);
generalPath.curveTo(443.11102, 392.83603, 433.45303, 383.17902, 421.54004, 383.17902);
generalPath.curveTo(409.62704, 383.17902, 399.96906, 392.837, 399.96906, 404.74902);
generalPath.curveTo(399.96906, 416.66202, 409.62704, 426.32, 421.54004, 426.32);
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
generalPath.moveTo(370.02, 409.74);
generalPath.curveTo(374.366, 415.375, 381.771, 415.054, 384.83, 414.56998);
generalPath.curveTo(387.40598, 421.32898, 395.615, 421.16998, 399.15698, 424.86996);
generalPath.curveTo(402.69897, 428.57495, 414.77, 428.25397, 418.31198, 426.15796);
generalPath.curveTo(415.09497, 425.83795, 410.909, 423.90796, 406.88397, 420.52496);
generalPath.curveTo(402.02597, 416.44498, 404.30798, 408.29095, 400.44397, 405.39395);
generalPath.curveTo(403.34198, 402.17395, 403.82498, 396.86194, 403.18097, 394.76895);
generalPath.curveTo(406.24097, 392.99796, 408.49396, 390.09995, 408.81598, 388.65094);
generalPath.curveTo(414.12897, 388.32895, 418.796, 385.59293, 420.72897, 383.50095);
generalPath.curveTo(423.46597, 386.07596, 430.38696, 382.69495, 434.09198, 387.04095);
generalPath.curveTo(434.89597, 376.41595, 424.75397, 370.78195, 417.99197, 374.32394);
generalPath.curveTo(415.25397, 372.87595, 408.01196, 373.84195, 406.72397, 375.77396);
generalPath.curveTo(404.46997, 374.80695, 398.19196, 378.02695, 395.29398, 380.11996);
generalPath.curveTo(398.51398, 378.34998, 398.99597, 373.03696, 397.70798, 371.10495);
generalPath.curveTo(400.44498, 369.97794, 403.50397, 366.27496, 403.82498, 363.53894);
generalPath.curveTo(407.689, 364.18295, 413.48297, 361.60693, 416.05798, 362.25095);
generalPath.curveTo(411.87497, 356.77795, 404.95297, 354.84595, 397.869, 355.32895);
generalPath.curveTo(390.54398, 355.73196, 387.40598, 360.88293, 386.44, 366.43695);
generalPath.curveTo(382.094, 369.01294, 380.645, 377.70496, 382.255, 380.76395);
generalPath.curveTo(379.759, 380.68396, 377.42502, 383.09894, 376.46, 384.46695);
generalPath.curveTo(373.08, 383.01694, 368.25, 381.97195, 364.789, 381.97195);
generalPath.moveTo(366.32, 373.2);
generalPath.curveTo(364.871, 369.015, 366.79, 365.247, 367.769, 361.932);
generalPath.curveTo(370.264, 353.482, 368.73502, 351.307, 361.169, 352.43402);
generalPath.curveTo(360.525, 356.459, 364.389, 369.65903, 366.32, 373.2);
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
generalPath.moveTo(370.02, 409.74);
generalPath.curveTo(374.366, 415.375, 381.771, 415.054, 384.83, 414.56998);
generalPath.curveTo(387.40598, 421.32898, 395.615, 421.16998, 399.15698, 424.86996);
generalPath.curveTo(402.69897, 428.57495, 414.77, 428.25397, 418.31198, 426.15796);
generalPath.curveTo(415.09497, 425.83795, 410.909, 423.90796, 406.88397, 420.52496);
generalPath.curveTo(402.02597, 416.44498, 404.30798, 408.29095, 400.44397, 405.39395);
generalPath.curveTo(403.34198, 402.17395, 403.82498, 396.86194, 403.18097, 394.76895);
generalPath.curveTo(406.24097, 392.99796, 408.49396, 390.09995, 408.81598, 388.65094);
generalPath.curveTo(414.12897, 388.32895, 418.796, 385.59293, 420.72897, 383.50095);
generalPath.curveTo(423.46597, 386.07596, 430.38696, 382.69495, 434.09198, 387.04095);
generalPath.curveTo(434.89597, 376.41595, 424.75397, 370.78195, 417.99197, 374.32394);
generalPath.curveTo(415.25397, 372.87595, 408.01196, 373.84195, 406.72397, 375.77396);
generalPath.curveTo(404.46997, 374.80695, 398.19196, 378.02695, 395.29398, 380.11996);
generalPath.curveTo(398.51398, 378.34998, 398.99597, 373.03696, 397.70798, 371.10495);
generalPath.curveTo(400.44498, 369.97794, 403.50397, 366.27496, 403.82498, 363.53894);
generalPath.curveTo(407.689, 364.18295, 413.48297, 361.60693, 416.05798, 362.25095);
generalPath.curveTo(411.87497, 356.77795, 404.95297, 354.84595, 397.869, 355.32895);
generalPath.curveTo(390.54398, 355.73196, 387.40598, 360.88293, 386.44, 366.43695);
generalPath.curveTo(382.094, 369.01294, 380.645, 377.70496, 382.255, 380.76395);
generalPath.curveTo(379.759, 380.68396, 377.42502, 383.09894, 376.46, 384.46695);
generalPath.curveTo(373.08, 383.01694, 368.25, 381.97195, 364.789, 381.97195);
generalPath.moveTo(366.32, 373.2);
generalPath.curveTo(364.871, 369.015, 366.79, 365.247, 367.769, 361.932);
generalPath.curveTo(370.264, 353.482, 368.73502, 351.307, 361.169, 352.43402);
generalPath.curveTo(360.525, 356.459, 364.389, 369.65903, 366.32, 373.2);
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
generalPath.moveTo(360.77, 352.91);
generalPath.curveTo(362.702, 354.842, 369.54398, 355.727, 370.26797, 349.61002);
generalPath.curveTo(371.09998, 342.588, 368.25598, 339.87003, 362.13797, 342.60703);
generalPath.curveTo(361.65598, 344.217, 361.09198, 350.81702, 360.76996, 352.91003);
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
generalPath.moveTo(360.77, 352.91);
generalPath.curveTo(362.702, 354.842, 369.54398, 355.727, 370.26797, 349.61002);
generalPath.curveTo(371.09998, 342.588, 368.25598, 339.87003, 362.13797, 342.60703);
generalPath.curveTo(361.65598, 344.217, 361.09198, 350.81702, 360.76996, 352.91003);
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
generalPath.moveTo(362.22, 342.37);
generalPath.curveTo(364.796, 343.416, 370.35, 345.509, 373.408, 339.553);
generalPath.curveTo(375.974, 334.557, 372.603, 330.699, 367.291, 331.02002);
generalPath.curveTo(366.003, 332.47003, 363.42798, 337.62003, 362.21997, 342.37003);
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
generalPath.moveTo(362.22, 342.37);
generalPath.curveTo(364.796, 343.416, 370.35, 345.509, 373.408, 339.553);
generalPath.curveTo(375.974, 334.557, 372.603, 330.699, 367.291, 331.02002);
generalPath.curveTo(366.003, 332.47003, 363.42798, 337.62003, 362.21997, 342.37003);
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
generalPath.moveTo(366.97, 330.54);
generalPath.curveTo(367.614, 332.47202, 374.214, 338.91, 379.043, 334.243);
generalPath.curveTo(383.873, 329.574, 383.873, 322.653, 376.628, 320.07703);
generalPath.curveTo(374.69598, 320.39804, 368.901, 327.15903, 366.97, 330.54004);
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
generalPath.moveTo(366.97, 330.54);
generalPath.curveTo(367.614, 332.47202, 374.214, 338.91, 379.043, 334.243);
generalPath.curveTo(383.873, 329.574, 383.873, 322.653, 376.628, 320.07703);
generalPath.curveTo(374.69598, 320.39804, 368.901, 327.15903, 366.97, 330.54004);
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
generalPath.moveTo(376.62, 320.08);
generalPath.curveTo(378.069, 324.10397, 382.576, 331.026, 390.947, 327.80698);
generalPath.curveTo(399.318, 324.58698, 395.77698, 314.12396, 391.913, 312.03098);
generalPath.curveTo(389.659, 312.19098, 380.483, 316.37698, 376.62, 320.08);
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
generalPath.moveTo(376.62, 320.08);
generalPath.curveTo(378.069, 324.10397, 382.576, 331.026, 390.947, 327.80698);
generalPath.curveTo(399.318, 324.58698, 395.77698, 314.12396, 391.913, 312.03098);
generalPath.curveTo(389.659, 312.19098, 380.483, 316.37698, 376.62, 320.08);
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
generalPath.moveTo(391.92, 312.03);
generalPath.curveTo(391.276, 315.572, 391.92, 325.23, 403.349, 325.069);
generalPath.curveTo(414.777, 324.909, 411.56, 311.547, 408.662, 309.615);
generalPath.curveTo(403.99298, 309.615, 396.106, 309.775, 391.91998, 312.03);
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
generalPath.moveTo(391.92, 312.03);
generalPath.curveTo(391.276, 315.572, 391.92, 325.23, 403.349, 325.069);
generalPath.curveTo(414.777, 324.909, 411.56, 311.547, 408.662, 309.615);
generalPath.curveTo(403.99298, 309.615, 396.106, 309.775, 391.91998, 312.03);
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
generalPath.moveTo(409.14, 310.09);
generalPath.curveTo(407.85202, 312.827, 404.95, 330.84, 427.33102, 325.866);
generalPath.curveTo(430.22702, 325.222, 437.79404, 308.641, 409.14, 310.09);
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
generalPath.moveTo(409.14, 310.09);
generalPath.curveTo(407.85202, 312.827, 404.95, 330.84, 427.33102, 325.866);
generalPath.curveTo(430.22702, 325.222, 437.79404, 308.641, 409.14, 310.09);
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
generalPath.moveTo(421.37, 311.7);
generalPath.curveTo(419.12, 313.953, 424.912, 332.144, 440.04498, 329.08502);
generalPath.curveTo(455.17798, 326.02603, 442.46198, 308.80203, 421.37, 311.7);
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
generalPath.moveTo(421.37, 311.7);
generalPath.curveTo(419.12, 313.953, 424.912, 332.144, 440.04498, 329.08502);
generalPath.curveTo(455.17798, 326.02603, 442.46198, 308.80203, 421.37, 311.7);
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
generalPath.moveTo(434.25, 314.44);
generalPath.curveTo(431.837, 319.43, 435.462, 334.24, 454.133, 334.24);
generalPath.curveTo(471.054, 334.24, 453.246, 314.762, 434.25, 314.44);
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
generalPath.moveTo(434.25, 314.44);
generalPath.curveTo(431.837, 319.43, 435.462, 334.24, 454.133, 334.24);
generalPath.curveTo(471.054, 334.24, 453.246, 314.762, 434.25, 314.44);
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
generalPath.moveTo(448.9, 318.79);
generalPath.curveTo(447.688, 321.556, 446.20398, 337.258, 468.21698, 338.59);
generalPath.curveTo(484.15497, 339.556, 480.292, 317.01898, 448.9, 318.79);
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
generalPath.moveTo(448.9, 318.79);
generalPath.curveTo(447.688, 321.556, 446.20398, 337.258, 468.21698, 338.59);
generalPath.curveTo(484.15497, 339.556, 480.292, 317.01898, 448.9, 318.79);
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
generalPath.moveTo(472.57, 325.39);
generalPath.curveTo(469.837, 330.22, 466.937, 342.29303, 491.083, 343.259);
generalPath.curveTo(506.55402, 343.879, 497.04102, 325.712, 472.57, 325.39);
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
generalPath.moveTo(472.57, 325.39);
generalPath.curveTo(469.837, 330.22, 466.937, 342.29303, 491.083, 343.259);
generalPath.curveTo(506.55402, 343.879, 497.04102, 325.712, 472.57, 325.39);
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
generalPath.moveTo(492.69, 329.09);
generalPath.curveTo(489.148, 333.91998, 491.757, 343.393, 500.736, 345.188);
generalPath.curveTo(512.006, 347.442, 513.615, 336.818, 505.88998, 331.666);
generalPath.curveTo(498.15997, 326.51498, 492.68997, 329.09, 492.68997, 329.09);
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
generalPath.moveTo(492.69, 329.09);
generalPath.curveTo(489.148, 333.91998, 491.757, 343.393, 500.736, 345.188);
generalPath.curveTo(512.006, 347.442, 513.615, 336.818, 505.88998, 331.666);
generalPath.curveTo(498.15997, 326.51498, 492.68997, 329.09, 492.68997, 329.09);
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
generalPath.moveTo(503.64, 331.34);
generalPath.curveTo(501.065, 335.848, 502.66, 346.794, 519.736, 346.794);
generalPath.curveTo(523.278, 346.794, 536.80304, 332.95, 503.64, 331.34);
generalPath.closePath();
generalPath.moveTo(371.48, 541.27);
generalPath.curveTo(385.31, 541.27, 396.522, 530.057, 396.522, 516.228);
generalPath.curveTo(396.522, 502.39502, 385.31, 491.18204, 371.48, 491.18204);
generalPath.curveTo(357.64902, 491.18204, 346.437, 502.39505, 346.437, 516.228);
generalPath.curveTo(346.437, 530.057, 357.64902, 541.27, 371.48, 541.27);
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
generalPath.moveTo(503.64, 331.34);
generalPath.curveTo(501.065, 335.848, 502.66, 346.794, 519.736, 346.794);
generalPath.curveTo(523.278, 346.794, 536.80304, 332.95, 503.64, 331.34);
generalPath.closePath();
generalPath.moveTo(371.48, 541.27);
generalPath.curveTo(385.31, 541.27, 396.522, 530.057, 396.522, 516.228);
generalPath.curveTo(396.522, 502.39502, 385.31, 491.18204, 371.48, 491.18204);
generalPath.curveTo(357.64902, 491.18204, 346.437, 502.39505, 346.437, 516.228);
generalPath.curveTo(346.437, 530.057, 357.64902, 541.27, 371.48, 541.27);
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
generalPath.moveTo(555.15, 177.13);
generalPath.curveTo(553.21704, 179.06201, 549.19604, 184.85701, 548.387, 187.11);
generalPath.curveTo(540.017, 212.223, 562.362, 230.981, 575.43304, 257.94);
generalPath.curveTo(585.73706, 279.19, 584.4501, 312.673, 568.35004, 333.922);
generalPath.curveTo(562.84204, 341.191, 564.48804, 343.259, 557.40405, 350.664);
generalPath.curveTo(554.6871, 353.505, 551.60803, 357.104, 552.5751, 367.406);
generalPath.curveTo(557.08307, 365.79602, 563.52106, 369.982, 564.80804, 373.52402);
generalPath.curveTo(568.028, 371.91403, 572.538, 372.558, 574.145, 374.489);
generalPath.curveTo(579.616, 371.914, 584.125, 373.20102, 588.953, 378.35303);
generalPath.curveTo(593.141, 377.709, 597.649, 378.35303, 601.833, 382.86002);
generalPath.curveTo(604.08704, 378.35303, 608.59503, 376.743, 611.812, 377.709);
generalPath.curveTo(611.491, 371.914, 617.287, 367.729, 622.437, 369.98203);
generalPath.curveTo(620.828, 362.25504, 627.912, 356.459, 634.675, 358.713);
generalPath.curveTo(640.466, 354.20602, 652.058, 353.884, 657.854, 360.64502);
generalPath.curveTo(647.55, 357.74802, 647.874, 368.695, 639.179, 367.72803);
generalPath.curveTo(641.43304, 374.16803, 635.637, 377.87003, 629.84503, 379.96204);
generalPath.curveTo(633.54504, 378.19205, 637.57, 376.09903, 638.85803, 378.35205);
generalPath.curveTo(642.078, 375.53604, 648.51605, 376.58206, 650.12805, 378.03104);
generalPath.curveTo(654.39105, 376.66302, 658.50006, 377.70905, 660.42804, 382.86005);
generalPath.curveTo(666.22504, 386.40204, 670.088, 395.41605, 665.90405, 402.17804);
generalPath.curveTo(664.616, 395.09503, 659.78705, 395.41705, 657.85406, 392.51904);
generalPath.curveTo(653.3451, 394.12903, 648.83704, 394.12903, 647.55005, 391.23105);
generalPath.curveTo(644.97504, 393.80704, 636.283, 396.06104, 632.42004, 392.19705);
generalPath.curveTo(630.97003, 397.99207, 625.98004, 402.82205, 620.18304, 402.82205);
generalPath.curveTo(621.79504, 407.32904, 617.28705, 415.05804, 613.74506, 418.92004);
generalPath.curveTo(619.22003, 421.81604, 617.60803, 428.25705, 616.32007, 432.12006);
generalPath.curveTo(624.69104, 433.40704, 617.6081, 440.81204, 632.0951, 445.64105);
generalPath.curveTo(625.0161, 447.89505, 611.1701, 445.64105, 609.2371, 436.94907);
generalPath.curveTo(602.1541, 436.62906, 597.3241, 429.54507, 597.6491, 422.13608);
generalPath.curveTo(592.17413, 416.98608, 591.3701, 409.5821, 598.93713, 404.4311);
generalPath.curveTo(592.4951, 406.3631, 588.9531, 396.0611, 579.61615, 400.2461);
generalPath.curveTo(574.9741, 402.3281, 562.7161, 398.7971, 562.8782, 394.4501);
generalPath.curveTo(560.94415, 397.6701, 549.1952, 396.38312, 547.58215, 390.9101);
generalPath.curveTo(543.7192, 393.0021, 534.70215, 389.46008, 534.8652, 384.1481);
generalPath.curveTo(529.87317, 386.4021, 523.1152, 382.3781, 523.4352, 377.2261);
generalPath.curveTo(518.76917, 376.5821, 518.28516, 372.39612, 518.6072, 368.8561);
generalPath.curveTo(514.4192, 366.9231, 515.54816, 362.8991, 517.15717, 358.0701);
generalPath.curveTo(514.26117, 354.8501, 515.54816, 350.3431, 517.8022, 346.1571);
generalPath.curveTo(514.5822, 342.9371, 515.2272, 339.0741, 516.1902, 334.5671);
generalPath.curveTo(500.73618, 333.2791, 481.3772, 329.5521, 436.99017, 315.8941);
generalPath.curveTo(370.02316, 295.2891, 351.99316, 343.5821, 366.80316, 373.8461);
generalPath.curveTo(383.89017, 408.7661, 364.87115, 416.3461, 370.66718, 442.4261);
generalPath.curveTo(376.78418, 443.71307, 380.00317, 448.8631, 379.6822, 454.33807);
generalPath.curveTo(383.3022, 454.49606, 385.8782, 457.87607, 384.5912, 464.31808);
generalPath.curveTo(387.6492, 463.7551, 391.59418, 464.6381, 394.1692, 467.21307);
generalPath.curveTo(396.4232, 463.03006, 403.8292, 462.06308, 407.6922, 466.89307);
generalPath.curveTo(416.0622, 466.24606, 420.2482, 473.00906, 419.9272, 481.38007);
generalPath.curveTo(424.4322, 489.43005, 422.82318, 499.25107, 417.99417, 505.52606);
generalPath.curveTo(418.47717, 502.14706, 417.99417, 497.31805, 417.83618, 494.42206);
generalPath.curveTo(417.5362, 489.09305, 410.10617, 487.98105, 410.91217, 483.63406);
generalPath.curveTo(407.04816, 483.95508, 403.34518, 481.86407, 402.05817, 478.96808);
generalPath.curveTo(399.80417, 480.89706, 396.58417, 481.5431, 393.84818, 480.57608);
generalPath.curveTo(398.19418, 482.5091, 401.57516, 490.23407, 400.28717, 495.3841);
generalPath.curveTo(402.54117, 499.2511, 402.05716, 506.3341, 399.32117, 509.3921);
generalPath.curveTo(398.03317, 515.6671, 393.20416, 517.9221, 386.92618, 515.1841);
generalPath.curveTo(390.46817, 512.9341, 391.75616, 508.9091, 391.59418, 505.5251);
generalPath.curveTo(389.3412, 503.5961, 388.21417, 499.8921, 388.0532, 497.6381);
generalPath.curveTo(381.7752, 498.6041, 373.08218, 493.29208, 371.4792, 491.19208);
generalPath.curveTo(357.6482, 491.19208, 346.4362, 502.4051, 346.4362, 516.2381);
generalPath.curveTo(345.79218, 511.0841, 339.27618, 506.0091, 340.08118, 501.6631);
generalPath.curveTo(336.21817, 489.7501, 341.69116, 478.6421, 357.46716, 476.3921);
generalPath.curveTo(355.53616, 471.8841, 362.29715, 467.2121, 359.72116, 462.06308);
generalPath.curveTo(356.43115, 455.4831, 350.38516, 446.93008, 341.37115, 436.95007);
generalPath.curveTo(346.84415, 427.61206, 345.23416, 415.05807, 342.01416, 407.33008);
generalPath.curveTo(337.39117, 396.23407, 332.99915, 398.96008, 316.57916, 416.98807);
generalPath.curveTo(289.81915, 446.37106, 254.11917, 438.23807, 222.56717, 457.55505);
generalPath.curveTo(214.18317, 462.68805, 205.82617, 464.63806, 214.84016, 455.62506);
generalPath.curveTo(223.85516, 446.60907, 247.68016, 437.59705, 263.13318, 429.86807);
generalPath.curveTo(292.07318, 415.39706, 316.5782, 391.23306, 326.23718, 344.2281);
generalPath.curveTo(348.93417, 233.7681, 432.47717, 270.1781, 485.27716, 290.78308);
generalPath.curveTo(534.84814, 310.1291, 525.8442, 266.31308, 500.73117, 239.91309);
generalPath.curveTo(470.54816, 208.18208, 476.58517, 183.25009, 490.75217, 163.28809);
generalPath.curveTo(516.1852, 159.74608, 564.96515, 168.60008, 555.14417, 177.13309);
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
generalPath.moveTo(555.15, 177.13);
generalPath.curveTo(553.21704, 179.06201, 549.19604, 184.85701, 548.387, 187.11);
generalPath.curveTo(540.017, 212.223, 562.362, 230.981, 575.43304, 257.94);
generalPath.curveTo(585.73706, 279.19, 584.4501, 312.673, 568.35004, 333.922);
generalPath.curveTo(562.84204, 341.191, 564.48804, 343.259, 557.40405, 350.664);
generalPath.curveTo(554.6871, 353.505, 551.60803, 357.104, 552.5751, 367.406);
generalPath.curveTo(557.08307, 365.79602, 563.52106, 369.982, 564.80804, 373.52402);
generalPath.curveTo(568.028, 371.91403, 572.538, 372.558, 574.145, 374.489);
generalPath.curveTo(579.616, 371.914, 584.125, 373.20102, 588.953, 378.35303);
generalPath.curveTo(593.141, 377.709, 597.649, 378.35303, 601.833, 382.86002);
generalPath.curveTo(604.08704, 378.35303, 608.59503, 376.743, 611.812, 377.709);
generalPath.curveTo(611.491, 371.914, 617.287, 367.729, 622.437, 369.98203);
generalPath.curveTo(620.828, 362.25504, 627.912, 356.459, 634.675, 358.713);
generalPath.curveTo(640.466, 354.20602, 652.058, 353.884, 657.854, 360.64502);
generalPath.curveTo(647.55, 357.74802, 647.874, 368.695, 639.179, 367.72803);
generalPath.curveTo(641.43304, 374.16803, 635.637, 377.87003, 629.84503, 379.96204);
generalPath.curveTo(633.54504, 378.19205, 637.57, 376.09903, 638.85803, 378.35205);
generalPath.curveTo(642.078, 375.53604, 648.51605, 376.58206, 650.12805, 378.03104);
generalPath.curveTo(654.39105, 376.66302, 658.50006, 377.70905, 660.42804, 382.86005);
generalPath.curveTo(666.22504, 386.40204, 670.088, 395.41605, 665.90405, 402.17804);
generalPath.curveTo(664.616, 395.09503, 659.78705, 395.41705, 657.85406, 392.51904);
generalPath.curveTo(653.3451, 394.12903, 648.83704, 394.12903, 647.55005, 391.23105);
generalPath.curveTo(644.97504, 393.80704, 636.283, 396.06104, 632.42004, 392.19705);
generalPath.curveTo(630.97003, 397.99207, 625.98004, 402.82205, 620.18304, 402.82205);
generalPath.curveTo(621.79504, 407.32904, 617.28705, 415.05804, 613.74506, 418.92004);
generalPath.curveTo(619.22003, 421.81604, 617.60803, 428.25705, 616.32007, 432.12006);
generalPath.curveTo(624.69104, 433.40704, 617.6081, 440.81204, 632.0951, 445.64105);
generalPath.curveTo(625.0161, 447.89505, 611.1701, 445.64105, 609.2371, 436.94907);
generalPath.curveTo(602.1541, 436.62906, 597.3241, 429.54507, 597.6491, 422.13608);
generalPath.curveTo(592.17413, 416.98608, 591.3701, 409.5821, 598.93713, 404.4311);
generalPath.curveTo(592.4951, 406.3631, 588.9531, 396.0611, 579.61615, 400.2461);
generalPath.curveTo(574.9741, 402.3281, 562.7161, 398.7971, 562.8782, 394.4501);
generalPath.curveTo(560.94415, 397.6701, 549.1952, 396.38312, 547.58215, 390.9101);
generalPath.curveTo(543.7192, 393.0021, 534.70215, 389.46008, 534.8652, 384.1481);
generalPath.curveTo(529.87317, 386.4021, 523.1152, 382.3781, 523.4352, 377.2261);
generalPath.curveTo(518.76917, 376.5821, 518.28516, 372.39612, 518.6072, 368.8561);
generalPath.curveTo(514.4192, 366.9231, 515.54816, 362.8991, 517.15717, 358.0701);
generalPath.curveTo(514.26117, 354.8501, 515.54816, 350.3431, 517.8022, 346.1571);
generalPath.curveTo(514.5822, 342.9371, 515.2272, 339.0741, 516.1902, 334.5671);
generalPath.curveTo(500.73618, 333.2791, 481.3772, 329.5521, 436.99017, 315.8941);
generalPath.curveTo(370.02316, 295.2891, 351.99316, 343.5821, 366.80316, 373.8461);
generalPath.curveTo(383.89017, 408.7661, 364.87115, 416.3461, 370.66718, 442.4261);
generalPath.curveTo(376.78418, 443.71307, 380.00317, 448.8631, 379.6822, 454.33807);
generalPath.curveTo(383.3022, 454.49606, 385.8782, 457.87607, 384.5912, 464.31808);
generalPath.curveTo(387.6492, 463.7551, 391.59418, 464.6381, 394.1692, 467.21307);
generalPath.curveTo(396.4232, 463.03006, 403.8292, 462.06308, 407.6922, 466.89307);
generalPath.curveTo(416.0622, 466.24606, 420.2482, 473.00906, 419.9272, 481.38007);
generalPath.curveTo(424.4322, 489.43005, 422.82318, 499.25107, 417.99417, 505.52606);
generalPath.curveTo(418.47717, 502.14706, 417.99417, 497.31805, 417.83618, 494.42206);
generalPath.curveTo(417.5362, 489.09305, 410.10617, 487.98105, 410.91217, 483.63406);
generalPath.curveTo(407.04816, 483.95508, 403.34518, 481.86407, 402.05817, 478.96808);
generalPath.curveTo(399.80417, 480.89706, 396.58417, 481.5431, 393.84818, 480.57608);
generalPath.curveTo(398.19418, 482.5091, 401.57516, 490.23407, 400.28717, 495.3841);
generalPath.curveTo(402.54117, 499.2511, 402.05716, 506.3341, 399.32117, 509.3921);
generalPath.curveTo(398.03317, 515.6671, 393.20416, 517.9221, 386.92618, 515.1841);
generalPath.curveTo(390.46817, 512.9341, 391.75616, 508.9091, 391.59418, 505.5251);
generalPath.curveTo(389.3412, 503.5961, 388.21417, 499.8921, 388.0532, 497.6381);
generalPath.curveTo(381.7752, 498.6041, 373.08218, 493.29208, 371.4792, 491.19208);
generalPath.curveTo(357.6482, 491.19208, 346.4362, 502.4051, 346.4362, 516.2381);
generalPath.curveTo(345.79218, 511.0841, 339.27618, 506.0091, 340.08118, 501.6631);
generalPath.curveTo(336.21817, 489.7501, 341.69116, 478.6421, 357.46716, 476.3921);
generalPath.curveTo(355.53616, 471.8841, 362.29715, 467.2121, 359.72116, 462.06308);
generalPath.curveTo(356.43115, 455.4831, 350.38516, 446.93008, 341.37115, 436.95007);
generalPath.curveTo(346.84415, 427.61206, 345.23416, 415.05807, 342.01416, 407.33008);
generalPath.curveTo(337.39117, 396.23407, 332.99915, 398.96008, 316.57916, 416.98807);
generalPath.curveTo(289.81915, 446.37106, 254.11917, 438.23807, 222.56717, 457.55505);
generalPath.curveTo(214.18317, 462.68805, 205.82617, 464.63806, 214.84016, 455.62506);
generalPath.curveTo(223.85516, 446.60907, 247.68016, 437.59705, 263.13318, 429.86807);
generalPath.curveTo(292.07318, 415.39706, 316.5782, 391.23306, 326.23718, 344.2281);
generalPath.curveTo(348.93417, 233.7681, 432.47717, 270.1781, 485.27716, 290.78308);
generalPath.curveTo(534.84814, 310.1291, 525.8442, 266.31308, 500.73117, 239.91309);
generalPath.curveTo(470.54816, 208.18208, 476.58517, 183.25009, 490.75217, 163.28809);
generalPath.curveTo(516.1852, 159.74608, 564.96515, 168.60008, 555.14417, 177.13309);
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
generalPath.moveTo(644.82, 448.48);
generalPath.curveTo(660.037, 448.48, 672.374, 436.147, 672.374, 420.93002);
generalPath.curveTo(672.374, 405.71204, 660.036, 393.37604, 644.82, 393.37604);
generalPath.curveTo(629.603, 393.37604, 617.266, 405.71204, 617.266, 420.93005);
generalPath.curveTo(617.266, 436.14706, 629.604, 448.48004, 644.82, 448.48004);
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
generalPath.moveTo(644.82, 448.48);
generalPath.curveTo(660.037, 448.48, 672.374, 436.147, 672.374, 420.93002);
generalPath.curveTo(672.374, 405.71204, 660.036, 393.37604, 644.82, 393.37604);
generalPath.curveTo(629.603, 393.37604, 617.266, 405.71204, 617.266, 420.93005);
generalPath.curveTo(617.266, 436.14706, 629.604, 448.48004, 644.82, 448.48004);
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
generalPath.moveTo(539.7, 178.41);
generalPath.curveTo(533.583, 205.455, 538.73303, 217.689, 547.75, 229.60101);
generalPath.curveTo(566.379, 254.22202, 581.23303, 310.41202, 559.983, 347.11102);
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
generalPath.moveTo(571.89, 315.41);
generalPath.curveTo(574.465, 314.444, 579.294, 311.38602, 580.42303, 306.073);
generalPath.moveTo(573.82, 303.66);
generalPath.curveTo(574.624, 298.992, 581.866, 296.98, 582.028, 291.99);
generalPath.moveTo(573.98, 285.46);
generalPath.curveTo(573.497, 280.63, 581.22595, 276.284, 580.097, 271.455);
generalPath.moveTo(569.8, 268.08);
generalPath.curveTo(569.154, 265.343, 576.238, 260.192, 574.308, 255.846);
generalPath.moveTo(564.49, 251.18);
generalPath.curveTo(563.04, 248.12099, 567.87, 244.57999, 565.778, 241.35999);
generalPath.moveTo(556.76, 237.65);
generalPath.curveTo(556.27704, 235.558, 559.256, 230.97, 557.64703, 228.234);
generalPath.moveTo(549.03, 221.72);
generalPath.curveTo(549.67206, 220.91501, 552.25, 218.983, 551.2, 216.569);
generalPath.moveTo(543.72, 210.05);
generalPath.curveTo(544.766, 209.48601, 547.90295, 208.52, 547.503, 206.187);
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
generalPath.moveTo(382.58, 513.57);
generalPath.curveTo(376.13998, 511.316, 368.09198, 514.537, 366.482, 520.012);
generalPath.moveTo(371.31, 525.0);
generalPath.curveTo(372.115, 519.53, 380.486, 517.112, 383.061, 519.687);
generalPath.curveTo(377.749, 516.792, 375.173, 527.09204, 379.841, 527.417);
generalPath.moveTo(423.15, 397.67);
generalPath.curveTo(419.288, 399.60202, 418.163, 406.68503, 423.15, 411.99902);
generalPath.moveTo(428.94, 399.28);
generalPath.curveTo(426.207, 401.534, 426.365, 408.295, 430.39, 409.905);
generalPath.curveTo(427.01, 407.49, 430.39, 403.305, 432.807, 403.144);
generalPath.curveTo(435.219, 402.983, 436.827, 405.88, 433.932, 408.778);
generalPath.moveTo(655.12, 415.21);
generalPath.curveTo(646.108, 412.797, 638.862, 423.25998, 647.07, 432.598);
generalPath.curveTo(646.912, 423.581, 653.35004, 417.62698, 661.237, 419.235);
generalPath.moveTo(657.61, 425.47);
generalPath.curveTo(655.393, 425.47, 654.148, 427.203, 654.148, 428.89);
generalPath.curveTo(654.148, 430.66202, 655.677, 432.35303, 658.17303, 432.35303);
generalPath.curveTo(659.78503, 432.35303, 661.07306, 430.50302, 661.07306, 429.05304);
generalPath.moveTo(689.4, 227.83);
generalPath.curveTo(690.85004, 233.30301, 698.41705, 235.557, 704.37103, 234.27);
generalPath.moveTo(704.37, 230.73);
generalPath.curveTo(699.703, 230.89099, 695.83997, 226.545, 696.162, 222.842);
generalPath.curveTo(696.162, 225.579, 702.441, 226.86699, 704.37, 225.096);
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
generalPath.moveTo(384.83, 414.57);
generalPath.curveTo(383.542, 411.35, 388.694, 408.13, 388.85498, 405.07);
generalPath.curveTo(389.01498, 402.013, 394.65, 399.59802, 400.44498, 405.393);
generalPath.moveTo(397.71, 371.11);
generalPath.curveTo(396.58298, 371.593, 395.617, 372.237, 394.651, 372.559);
generalPath.moveTo(408.82, 388.65);
generalPath.curveTo(407.45102, 388.731, 404.635, 388.57, 403.105, 387.52298);
generalPath.moveTo(403.19, 394.77);
generalPath.curveTo(402.063, 395.33398, 399.56702, 396.3, 398.118, 396.62198);
generalPath.moveTo(347.97, 492.0);
generalPath.curveTo(347.809, 494.9, 350.707, 499.083, 352.316, 500.37);
generalPath.moveTo(360.53, 485.08);
generalPath.curveTo(358.92, 487.49298, 357.955, 491.68, 358.92, 494.576);
generalPath.moveTo(384.51, 494.74);
generalPath.curveTo(381.612, 492.80698, 383.544, 487.815, 383.22202, 484.598);
generalPath.curveTo(382.90002, 481.378, 386.60202, 476.228, 393.84702, 480.573);
generalPath.moveTo(357.47, 476.39);
generalPath.curveTo(360.368, 475.907, 363.426, 476.065, 365.358, 476.87003);
generalPath.moveTo(394.17, 467.21);
generalPath.curveTo(392.88202, 468.97998, 392.56003, 470.914, 392.40002, 472.202);
generalPath.moveTo(407.69, 466.89);
generalPath.curveTo(405.436, 466.89, 403.505, 468.49802, 402.539, 470.11002);
generalPath.moveTo(376.46, 384.47);
generalPath.curveTo(379.03598, 385.356, 385.716, 389.46, 385.95798, 393.727);
generalPath.moveTo(403.83, 363.54);
generalPath.curveTo(395.942, 363.379, 392.88397, 355.33002, 398.84, 355.33002);
generalPath.moveTo(418.0, 374.32);
generalPath.curveTo(414.942, 375.608, 416.392, 380.92, 420.737, 383.496);
generalPath.moveTo(399.16, 424.87);
generalPath.curveTo(397.63, 422.94, 399.643, 417.307, 404.633, 418.995);
generalPath.moveTo(410.91, 483.63);
generalPath.curveTo(411.23, 478.72202, 417.43, 475.822, 419.926, 481.376);
generalPath.moveTo(388.05, 497.63);
generalPath.curveTo(387.64697, 492.238, 390.384, 490.46802, 392.79797, 490.147);
generalPath.curveTo(395.21298, 489.826, 398.675, 491.834, 400.28497, 495.376);
generalPath.moveTo(340.08, 501.66);
generalPath.curveTo(340.40198, 498.44, 343.13898, 495.06, 346.03598, 495.543);
generalPath.moveTo(634.67, 358.71);
generalPath.curveTo(632.574, 360.24, 631.208, 367.08, 639.174, 367.725);
generalPath.moveTo(622.44, 369.98);
generalPath.curveTo(622.44, 370.785, 623.486, 371.91202, 624.132, 372.39502);
generalPath.moveTo(660.43, 382.86);
generalPath.curveTo(658.338, 381.25, 652.943, 387.77, 657.855, 392.51898);
generalPath.moveTo(609.24, 436.95);
generalPath.curveTo(608.032, 432.362, 612.298, 431.15402, 616.323, 432.12003);
generalPath.moveTo(598.94, 404.43);
generalPath.curveTo(601.353, 402.82, 603.77, 401.05, 606.828, 400.245);
generalPath.moveTo(597.65, 422.13);
generalPath.curveTo(597.65, 418.268, 599.58, 415.05002, 601.35004, 414.084);
generalPath.moveTo(611.81, 377.71);
generalPath.curveTo(611.49, 382.378, 613.423, 386.886, 614.873, 389.3);
generalPath.moveTo(650.13, 378.03);
generalPath.curveTo(647.793, 378.755, 645.7, 379.63998, 644.817, 381.572);
generalPath.moveTo(647.55, 391.23);
generalPath.curveTo(648.68, 390.264, 649.967, 389.138, 650.52997, 388.333);
generalPath.moveTo(708.4, 250.69);
generalPath.curveTo(708.4, 255.197, 702.767, 257.612, 699.067, 254.714);
generalPath.moveTo(720.64, 250.85);
generalPath.curveTo(723.132, 252.78201, 731.744, 250.931, 729.732, 245.94);
generalPath.moveTo(710.17, 276.77);
generalPath.curveTo(708.39996, 276.448, 705.33997, 274.516, 704.053, 272.90698);
generalPath.moveTo(727.88, 263.41);
generalPath.curveTo(724.984, 264.05402, 723.05, 263.41, 721.6, 262.766);
generalPath.moveTo(682.16, 279.51);
generalPath.curveTo(683.76794, 279.51, 687.62994, 278.866, 690.29, 277.49802);
generalPath.moveTo(677.33, 251.02);
generalPath.curveTo(675.23804, 250.78, 673.705, 251.181, 672.5, 251.98601);
generalPath.moveTo(709.77, 258.9);
generalPath.curveTo(709.20703, 260.913, 707.757, 264.051, 705.987, 265.41998);
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
generalPath.moveTo(671.86, 265.99);

}

private void _paint2(Graphics2D g,float origAlpha) {
generalPath.curveTo(675.885, 264.22, 680.877, 277.90198, 690.535, 273.073);
generalPath.moveTo(691.34, 258.9);
generalPath.curveTo(690.052, 260.66998, 689.24805, 263.408, 689.086, 265.822);
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
generalPath.moveTo(498.81, 237.98);
generalPath.curveTo(500.098, 237.81999, 502.352, 237.336, 502.835, 235.726);
generalPath.moveTo(333.16, 387.85);
generalPath.curveTo(337.99, 390.587, 341.37, 395.255, 339.277, 402.177);
generalPath.moveTo(554.5, 223.17);
generalPath.curveTo(555.95, 224.136, 561.425, 224.136, 564.483, 223.01);
generalPath.moveTo(568.35, 226.39);
generalPath.curveTo(568.18695, 228.644, 568.83295, 237.175, 564.488, 238.946);
generalPath.moveTo(566.1, 237.82);
generalPath.curveTo(570.125, 239.108, 578.175, 238.625, 580.75, 231.22);
generalPath.moveTo(575.11, 237.49);
generalPath.curveTo(577.20197, 240.71, 577.84296, 246.988, 571.568, 250.36801);
generalPath.moveTo(576.72, 242.81);
generalPath.curveTo(581.38696, 244.42, 592.17395, 244.58, 591.045, 235.405);
generalPath.moveTo(587.35, 242.81);
generalPath.curveTo(590.56995, 247.317, 604.738, 252.63, 602.483, 243.293);
generalPath.moveTo(574.31, 255.84);
generalPath.curveTo(579.77997, 257.128, 587.51, 253.425, 584.29, 243.767);
generalPath.moveTo(599.74, 248.6);
generalPath.curveTo(600.544, 252.30301, 618.573, 256.16602, 616.161, 247.79501);
generalPath.moveTo(612.78, 252.63);
generalPath.curveTo(616.163, 260.357, 634.03, 259.713, 628.39703, 249.41);
generalPath.moveTo(625.5, 257.45);
generalPath.curveTo(629.042, 261.797, 644.821, 259.22, 638.542, 248.75702);
generalPath.moveTo(638.37, 257.29);
generalPath.curveTo(648.19, 264.695, 659.62, 254.07, 647.224, 246.343);
generalPath.moveTo(652.86, 254.88);
generalPath.curveTo(661.55597, 261.802, 672.18097, 249.24501, 664.614, 245.70401);
generalPath.moveTo(584.12, 251.98);
generalPath.curveTo(586.857, 252.78499, 592.653, 252.463, 593.94, 247.47299);
generalPath.moveTo(591.77, 250.85);
generalPath.curveTo(591.45, 258.17502, 603.766, 260.992, 606.903, 252.54001);
generalPath.moveTo(602.8, 257.13);
generalPath.curveTo(605.054, 261.96, 615.838, 263.89, 617.608, 256.969);
generalPath.moveTo(615.84, 260.19);
generalPath.curveTo(617.61005, 265.02, 626.948, 264.537, 629.523, 259.546);
generalPath.moveTo(626.14, 262.77);
generalPath.curveTo(629.036, 269.04797, 640.948, 269.04797, 643.68604, 259.87198);
generalPath.moveTo(641.6, 263.89);
generalPath.curveTo(646.26697, 266.78802, 656.25, 265.66, 655.44196, 256.64603);
generalPath.moveTo(653.51, 263.09);
generalPath.curveTo(660.43, 268.725, 670.252, 263.251, 665.42303, 253.75299);
generalPath.moveTo(664.94, 270.49);
generalPath.curveTo(668.644, 269.84598, 670.573, 262.44098, 666.71, 260.50998);
generalPath.moveTo(579.14, 271.78);
generalPath.curveTo(586.865, 267.595, 588.315, 260.512, 583.002, 253.59);
generalPath.moveTo(585.74, 264.7);
generalPath.curveTo(590.57, 267.59702, 599.744, 264.54, 601.35297, 257.45602);
generalPath.moveTo(592.34, 265.5);
generalPath.curveTo(595.073, 269.041, 595.557, 273.388, 592.015, 277.412);
generalPath.moveTo(594.59, 270.01);
generalPath.curveTo(603.12006, 264.698, 613.744, 274.518, 605.85706, 280.474);
generalPath.moveTo(604.41, 269.53);
generalPath.curveTo(606.34296, 269.047, 609.72296, 265.506, 610.04297, 261.481);
generalPath.moveTo(608.27, 273.23);
generalPath.curveTo(611.812, 269.527, 635.96204, 277.09402, 620.666, 284.82);
generalPath.moveTo(619.54, 263.09);
generalPath.curveTo(624.207, 264.86, 626.623, 271.461, 619.54, 273.715);
generalPath.moveTo(625.66, 279.19);
generalPath.curveTo(630.81, 273.878, 646.91, 277.258, 641.11395, 284.02);
generalPath.moveTo(637.25, 277.09);
generalPath.curveTo(640.146, 267.27, 657.371, 273.387, 651.738, 277.412);
generalPath.moveTo(633.71, 267.27);
generalPath.curveTo(634.193, 269.202, 634.35205, 274.03098, 631.135, 276.607);
generalPath.moveTo(648.2, 265.34);
generalPath.curveTo(648.84204, 266.94998, 648.683, 270.008, 647.23303, 271.94);
generalPath.moveTo(659.14, 265.5);
generalPath.curveTo(660.107, 267.27, 661.715, 270.651, 658.17303, 273.388);
generalPath.moveTo(521.35, 191.45);
generalPath.curveTo(521.508, 200.625, 524.73, 206.743, 537.125, 200.948);
generalPath.moveTo(525.21, 202.4);
generalPath.curveTo(519.093, 210.61, 526.01404, 219.46399, 538.08905, 210.61);
generalPath.moveTo(506.37, 206.42);
generalPath.curveTo(514.74, 215.435, 529.712, 208.83499, 520.053, 195.151);
generalPath.moveTo(530.2, 214.15);
generalPath.curveTo(528.58704, 223.004, 535.833, 224.775, 541.788, 220.75);
generalPath.moveTo(498.97, 207.87);
generalPath.curveTo(500.495, 216.771, 509.595, 223.80699, 518.449, 218.334);
generalPath.moveTo(509.92, 220.11);
generalPath.curveTo(509.92, 232.828, 527.466, 234.276, 531.491, 221.076);
generalPath.moveTo(525.21, 229.12);
generalPath.curveTo(530.843, 240.70999, 543.077, 236.04199, 547.10205, 228.95999);
generalPath.moveTo(512.81, 210.61);
generalPath.curveTo(515.064, 216.244, 519.573, 222.523, 530.035, 217.854);
generalPath.moveTo(480.62, 207.87);
generalPath.curveTo(482.07, 212.538, 490.44, 218.17299, 500.099, 211.733);
generalPath.moveTo(486.57, 213.83);
generalPath.curveTo(481.41602, 221.396, 491.72, 228.479, 504.116, 217.21);
generalPath.moveTo(492.69, 223.17);
generalPath.curveTo(494.782, 233.795, 498.965, 242.327, 514.098, 228.643);
generalPath.moveTo(506.53, 234.11);
generalPath.curveTo(512.005, 240.87, 520.376, 245.056, 528.263, 233.627);
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
generalPath.moveTo(534.06, 236.04);
generalPath.curveTo(533.577, 244.08899, 535.185, 248.11299, 541.464, 247.791);
generalPath.curveTo(546.414, 247.538, 551.123, 243.606, 553.86, 239.421);
generalPath.moveTo(540.34, 247.8);
generalPath.curveTo(540.177, 256.976, 547.42004, 264.22, 560.94403, 254.883);
generalPath.moveTo(545.97, 258.58);
generalPath.curveTo(543.39496, 265.50198, 551.12, 276.77, 566.253, 270.97498);
generalPath.moveTo(513.94, 240.23);
generalPath.curveTo(512.977, 249.084, 521.186, 255.04, 534.386, 243.61);
generalPath.moveTo(520.38, 250.05);
generalPath.curveTo(520.863, 257.294, 529.072, 265.987, 541.14703, 253.43001);
generalPath.moveTo(526.17, 259.23);
generalPath.curveTo(525.203, 271.625, 536.633, 275.16702, 546.29095, 265.67);
generalPath.moveTo(508.95, 250.05);
generalPath.curveTo(511.52502, 250.211, 513.617, 247.95801, 514.904, 246.347);
generalPath.moveTo(514.42, 259.06);
generalPath.curveTo(516.674, 259.543, 520.54, 257.45, 521.828, 254.875);
generalPath.moveTo(520.06, 273.71);
generalPath.curveTo(522.635, 276.447, 531.327, 274.51498, 532.452, 270.813);
generalPath.moveTo(529.72, 273.55);
generalPath.curveTo(534.55, 284.818, 547.42395, 284.335, 552.737, 271.61798);
generalPath.moveTo(550.32, 276.13);
generalPath.curveTo(552.73303, 282.73, 558.853, 286.915, 568.833, 284.66202);
generalPath.moveTo(555.15, 282.89);
generalPath.curveTo(549.517, 292.066, 556.92004, 302.851, 569.47504, 292.22702);
generalPath.moveTo(558.21, 296.57);
generalPath.curveTo(557.568, 302.36502, 562.88, 308.965, 570.12305, 309.77002);
generalPath.moveTo(534.38, 279.67);
generalPath.curveTo(532.447, 292.709, 541.784, 298.988, 553.538, 292.065);
generalPath.moveTo(520.7, 285.95);
generalPath.curveTo(523.758, 288.36502, 529.23303, 288.687, 534.383, 286.755);
generalPath.moveTo(540.66, 294.32);
generalPath.curveTo(537.75995, 305.267, 549.02997, 313.155, 558.68896, 300.92);
generalPath.moveTo(525.05, 287.72);
generalPath.curveTo(525.213, 293.354, 530.688, 299.471, 540.183, 297.7);
generalPath.moveTo(566.74, 308.97);
generalPath.curveTo(560.298, 313.316, 559.01, 321.043, 568.028, 326.033);
generalPath.moveTo(550.96, 306.71);
generalPath.curveTo(551.28503, 313.31, 554.343, 317.013, 561.585, 317.656);
generalPath.moveTo(541.47, 303.33);
generalPath.curveTo(531.81195, 312.184, 541.30695, 322.487, 552.737, 313.79398);
generalPath.moveTo(548.23, 316.53);
generalPath.curveTo(545.01, 326.672, 557.084, 332.789, 563.522, 322.486);
generalPath.moveTo(528.27, 294.96);
generalPath.curveTo(524.728, 304.94, 529.237, 311.541, 537.445, 310.897);
generalPath.moveTo(515.55, 293.03);
generalPath.curveTo(516.03296, 298.986, 521.183, 301.079, 526.979, 299.791);
generalPath.moveTo(519.25, 299.31);
generalPath.curveTo(514.904, 307.68, 521.504, 312.188, 530.2, 308.969);
generalPath.moveTo(556.6, 327.64);
generalPath.curveTo(555.14996, 332.95203, 555.954, 336.816, 563.842, 338.587);
generalPath.moveTo(557.08, 335.21);
generalPath.curveTo(547.58, 339.557, 546.776, 348.733, 554.18, 354.688);
generalPath.moveTo(549.43, 324.99);
generalPath.curveTo(544.443, 329.498, 545.40497, 337.304, 550.88, 340.36298);
generalPath.moveTo(507.18, 295.61);
generalPath.curveTo(501.705, 301.003, 506.938, 315.89297, 519.009, 307.76498);
generalPath.moveTo(538.57, 314.44);
generalPath.curveTo(531.162, 320.557, 534.545, 331.665, 546.778, 328.60602);
generalPath.moveTo(526.33, 309.77);
generalPath.curveTo(522.468, 320.71698, 526.172, 324.58, 534.86304, 324.741);
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
generalPath.moveTo(499.13, 295.12);
generalPath.curveTo(492.53, 300.11, 494.30002, 307.193, 497.2, 310.413);
generalPath.curveTo(500.09702, 313.633, 505.56802, 312.18298, 507.33902, 307.998);
generalPath.moveTo(485.28, 290.78);
generalPath.curveTo(477.876, 300.27798, 485.28, 311.546, 495.747, 308.166);
generalPath.moveTo(524.89, 318.95);
generalPath.curveTo(517.323, 321.687, 511.552, 328.557, 516.19403, 334.565);
generalPath.curveTo(518.932, 338.107, 530.84406, 338.59, 534.22406, 324.906);
generalPath.moveTo(511.2, 310.09);
generalPath.curveTo(506.854, 316.36798, 508.30002, 322.32498, 516.35004, 325.383);
generalPath.moveTo(510.72, 321.85);
generalPath.curveTo(506.05, 324.426, 502.99, 327.48502, 504.12, 333.11902);
generalPath.moveTo(500.26, 312.03);
generalPath.curveTo(498.49002, 319.596, 500.58002, 324.26498, 505.247, 326.518);
generalPath.moveTo(500.1, 321.04);
generalPath.curveTo(492.854, 320.557, 489.154, 323.61502, 491.56702, 330.699);
generalPath.moveTo(492.21, 322.81);
generalPath.curveTo(485.12698, 320.234, 483.99698, 314.117, 487.056, 307.678);
generalPath.moveTo(486.09, 317.18);
generalPath.curveTo(478.36, 317.50198, 474.982, 321.365, 474.982, 326.67798);
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
generalPath.moveTo(475.62, 287.07);
generalPath.curveTo(469.987, 289.48502, 468.216, 297.05002, 470.307, 301.23602);
generalPath.curveTo(472.403, 305.42102, 479.00302, 305.74402, 483.028, 303.006);
generalPath.moveTo(459.85, 281.12);
generalPath.curveTo(454.7, 286.915, 460.654, 298.184, 469.833, 295.447);
generalPath.moveTo(446.65, 276.61);
generalPath.curveTo(441.82, 283.37, 447.133, 294.63998, 459.529, 291.41998);
generalPath.moveTo(460.17, 322.81);
generalPath.curveTo(458.88202, 314.76, 467.25302, 309.449, 477.558, 319.912);
generalPath.moveTo(472.57, 303.66);
generalPath.curveTo(469.512, 306.397, 468.066, 310.743, 468.545, 314.285);
generalPath.moveTo(433.45, 272.75);
generalPath.curveTo(428.13702, 281.765, 434.58002, 289.975, 446.00803, 286.755);
generalPath.moveTo(463.23, 295.12);
generalPath.curveTo(455.66302, 302.686, 458.238, 310.25198, 463.872, 314.598);
generalPath.moveTo(458.4, 303.98);
generalPath.curveTo(446.971, 304.14, 446.32898, 317.341, 455.667, 321.527);
generalPath.moveTo(449.71, 290.78);
generalPath.curveTo(445.043, 294.0, 443.593, 302.853, 451.643, 306.395);
generalPath.moveTo(449.39, 310.58);
generalPath.curveTo(444.56003, 308.326, 438.765, 311.063, 439.24802, 316.697);
generalPath.moveTo(442.14, 310.74);
generalPath.curveTo(437.794, 300.43698, 425.07703, 302.20798, 426.207, 312.83298);
generalPath.moveTo(445.68, 298.02);
generalPath.curveTo(442.947, 298.503, 437.472, 300.112, 435.38, 304.29797);
generalPath.moveTo(436.19, 286.43);
generalPath.curveTo(431.04, 292.225, 435.06, 299.147, 439.24802, 300.596);
generalPath.moveTo(420.9, 270.17);
generalPath.curveTo(419.93298, 277.092, 422.66998, 280.47302, 431.363, 279.829);
generalPath.moveTo(423.95, 279.03);
generalPath.curveTo(420.56702, 287.4, 425.075, 291.103, 433.767, 290.62);
generalPath.moveTo(425.88, 289.33);
generalPath.curveTo(420.73, 295.447, 424.272, 302.04797, 429.26, 304.784);
generalPath.moveTo(423.47, 297.06);
generalPath.curveTo(414.295, 295.93298, 412.845, 306.55798, 415.903, 311.548);
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
generalPath.moveTo(416.06, 269.37);
generalPath.curveTo(410.428, 271.785, 407.208, 278.86798, 410.267, 283.214);
generalPath.curveTo(413.327, 287.56, 419.443, 286.111, 422.823, 283.858);
generalPath.moveTo(412.2, 285.14);
generalPath.curveTo(407.532, 292.22302, 411.717, 297.535, 416.708, 299.62802);
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
generalPath.moveTo(394.17, 268.56);
generalPath.curveTo(390.46802, 272.423, 392.721, 280.312, 401.73602, 280.473);
generalPath.curveTo(408.99402, 280.603, 412.68204, 273.712, 410.42902, 268.883);
generalPath.moveTo(400.45, 280.47);
generalPath.curveTo(397.553, 286.91, 399.323, 293.831, 410.27002, 292.704);
generalPath.moveTo(414.94, 302.85);
generalPath.curveTo(408.18, 299.792, 399.164, 302.85, 403.028, 310.9);
generalPath.moveTo(402.06, 291.42);
generalPath.curveTo(399.323, 295.28302, 400.29, 300.75702, 403.348, 304.13702);
generalPath.moveTo(401.58, 301.72);
generalPath.curveTo(397.072, 302.525, 392.72598, 304.94, 395.46298, 312.023);
generalPath.moveTo(394.81, 306.23);
generalPath.curveTo(389.01498, 304.46002, 381.61, 308.64502, 386.117, 314.6);
generalPath.moveTo(385.16, 308.97);
generalPath.curveTo(380.17, 308.165, 374.214, 313.477, 379.043, 318.79);
generalPath.moveTo(377.11, 314.44);
generalPath.curveTo(372.602, 315.56702, 367.28998, 320.71802, 371.95798, 324.743);
generalPath.moveTo(399.81, 289.17);
generalPath.curveTo(393.37, 292.06702, 392.727, 299.312, 395.785, 304.62402);
generalPath.moveTo(393.04, 275.81);
generalPath.curveTo(383.381, 279.513, 383.54202, 292.391, 394.16702, 296.415);
generalPath.moveTo(389.66, 293.51);
generalPath.curveTo(383.865, 296.89, 382.738, 303.33002, 386.602, 307.515);
generalPath.moveTo(379.52, 270.98);
generalPath.curveTo(375.65598, 272.268, 375.978, 284.18002, 386.28098, 283.858);
generalPath.moveTo(368.9, 275.0);
generalPath.curveTo(361.173, 280.151, 370.50998, 293.19, 383.06598, 283.854);
generalPath.moveTo(376.14, 287.07);
generalPath.curveTo(375.013, 292.383, 376.462, 298.178, 384.99402, 298.82202);
generalPath.moveTo(376.62, 294.16);
generalPath.curveTo(370.503, 296.413, 369.376, 308.97, 380.483, 309.936);
generalPath.moveTo(357.15, 282.73);
generalPath.curveTo(349.262, 289.974, 363.59, 296.252, 368.902, 285.789);
generalPath.moveTo(346.2, 294.8);
generalPath.curveTo(342.336, 299.468, 355.858, 311.703, 361.815, 291.258);
generalPath.moveTo(363.26, 290.94);
generalPath.curveTo(363.582, 295.77, 366.48, 298.667, 372.435, 298.989);
generalPath.moveTo(372.28, 303.66);
generalPath.curveTo(362.782, 305.109, 359.724, 317.021, 370.348, 319.59702);
generalPath.moveTo(354.73, 302.05);
generalPath.curveTo(354.40802, 306.55698, 359.07602, 310.25998, 364.389, 309.455);
generalPath.moveTo(369.22, 319.27);
generalPath.curveTo(360.527, 321.202, 359.4, 332.47, 367.128, 331.826);
generalPath.moveTo(363.1, 342.29);
generalPath.curveTo(355.855, 340.117, 355.695, 331.504, 362.134, 328.285);
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
generalPath.moveTo(357.15, 334.72);
generalPath.curveTo(351.033, 338.423, 353.448, 347.276, 356.667, 348.564);
generalPath.curveTo(359.887, 349.852, 362.462, 348.242, 362.785, 345.50598);
generalPath.moveTo(362.3, 357.9);
generalPath.curveTo(362.944, 362.085, 347.409, 360.47598, 355.378, 347.43698);
generalPath.moveTo(355.29, 358.63);
generalPath.curveTo(350.05902, 366.84, 358.59, 373.52002, 363.983, 366.518);
generalPath.moveTo(356.02, 368.53);
generalPath.curveTo(353.927, 375.13, 361.895, 379.88, 367.046, 374.728);
generalPath.moveTo(338.63, 306.71);
generalPath.curveTo(335.732, 312.666, 350.22, 314.91998, 351.186, 302.685);
generalPath.moveTo(334.61, 315.57);
generalPath.curveTo(331.71298, 327.16, 353.60498, 324.746, 347.97098, 309.775);
generalPath.moveTo(348.45, 317.5);
generalPath.curveTo(351.50803, 319.27, 360.685, 319.432, 362.93802, 309.612);
generalPath.moveTo(356.34, 317.82);
generalPath.curveTo(356.984, 320.87802, 359.72, 324.58002, 362.296, 325.708);
generalPath.moveTo(345.88, 320.88);
generalPath.curveTo(344.914, 327.15802, 351.19202, 332.31, 358.436, 331.827);
generalPath.moveTo(347.0, 327.0);
generalPath.curveTo(343.459, 331.83, 342.332, 341.16602, 353.44, 341.81);
generalPath.moveTo(330.1, 328.61);
generalPath.curveTo(328.33002, 333.59998, 338.793, 338.75198, 344.91, 330.542);
generalPath.moveTo(326.88, 341.32);
generalPath.curveTo(325.99402, 345.104, 335.41202, 350.174, 340.724, 334.07602);
generalPath.moveTo(336.54, 342.29);
generalPath.curveTo(338.794, 346.314, 346.36002, 349.534, 351.028, 341.646);
generalPath.moveTo(343.46, 346.48);
generalPath.curveTo(341.52798, 352.114, 346.84, 357.42603, 353.28, 355.81702);
generalPath.moveTo(331.39, 345.19);
generalPath.curveTo(330.10202, 353.239, 339.43903, 357.907, 345.234, 353.72202);
generalPath.moveTo(325.27, 348.73);
generalPath.curveTo(322.534, 359.03302, 335.73398, 362.896, 340.724, 355.169);
generalPath.moveTo(337.35, 358.23);
generalPath.curveTo(337.833, 364.02502, 346.848, 369.015, 353.931, 364.186);
generalPath.moveTo(321.25, 363.06);
generalPath.curveTo(320.606, 365.635, 331.392, 368.211, 333.001, 359.19598);
generalPath.moveTo(327.53, 365.31);
generalPath.curveTo(330.105, 371.91, 338.798, 373.52, 343.789, 365.471);
generalPath.moveTo(340.89, 368.69);
generalPath.curveTo(342.01703, 374.807, 349.90503, 378.188, 356.82703, 374.002);
generalPath.moveTo(359.72, 376.42);
generalPath.curveTo(357.95, 384.63, 366.481, 391.23, 371.793, 386.72302);
generalPath.moveTo(346.04, 374.97);
generalPath.curveTo(343.465, 383.98502, 354.733, 389.136, 361.01102, 384.146);
generalPath.moveTo(332.52, 370.46);
generalPath.curveTo(331.87598, 378.83, 338.47598, 383.82098, 346.042, 380.11798);
generalPath.moveTo(318.19, 371.27);
generalPath.curveTo(315.936, 376.74298, 327.849, 381.25, 333.483, 376.58298);
generalPath.moveTo(310.78, 386.24);
generalPath.curveTo(313.839, 389.78098, 324.463, 386.24, 325.429, 378.352);
generalPath.moveTo(322.54, 384.14);
generalPath.curveTo(326.403, 388.648, 335.579, 391.062, 339.282, 381.403);
generalPath.moveTo(336.06, 386.4);
generalPath.curveTo(335.899, 393.322, 348.29498, 398.313, 352.319, 385.595);
generalPath.moveTo(366.88, 388.09);
generalPath.curveTo(365.753, 391.47, 368.41, 396.863, 373.963, 397.507);
generalPath.moveTo(356.66, 386.0);
generalPath.curveTo(355.855, 389.863, 361.49, 395.255, 367.446, 393.083);
generalPath.moveTo(368.58, 394.69);
generalPath.curveTo(366.97, 398.875, 368.33798, 404.911, 373.972, 404.831);
generalPath.moveTo(369.14, 402.5);
generalPath.curveTo(364.95502, 406.041, 366.725, 412.32, 372.763, 412.562);
generalPath.moveTo(366.97, 408.45);
generalPath.curveTo(361.014, 412.47202, 363.107, 421.32703, 370.994, 420.84802);
generalPath.moveTo(348.94, 391.39);
generalPath.curveTo(348.94, 400.083, 359.725, 401.37003, 361.818, 393.32202);
generalPath.moveTo(357.63, 398.47);
generalPath.curveTo(356.02002, 403.621, 360.20502, 408.612, 366.805, 407.163);
generalPath.moveTo(358.92, 460.61);
generalPath.curveTo(360.37003, 462.706, 366.325, 459.16397, 364.71503, 455.623);
generalPath.curveTo(363.10504, 452.081, 356.79602, 454.00598, 357.47104, 457.714);
generalPath.moveTo(363.26, 454.17);
generalPath.curveTo(364.065, 447.087, 355.694, 445.962, 353.601, 452.078);
generalPath.moveTo(356.66, 448.54);
generalPath.curveTo(358.753, 444.99802, 351.67, 440.17, 348.772, 445.32);
generalPath.moveTo(351.35, 443.22);
generalPath.curveTo(353.282, 438.066, 345.233, 435.816, 344.58902, 440.483);
generalPath.moveTo(342.82, 433.72);
generalPath.curveTo(343.786, 431.145, 352.80002, 432.753, 348.937, 438.066);
generalPath.moveTo(355.86, 444.51);
generalPath.curveTo(359.40198, 441.29, 353.44598, 434.69, 349.74298, 437.10602);
generalPath.moveTo(379.68, 454.33);
generalPath.curveTo(376.862, 454.65, 373.964, 456.5, 376.057, 462.46);
generalPath.curveTo(377.508, 466.593, 383.704, 466.805, 384.58902, 464.31);
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
generalPath.moveTo(375.58, 457.31);
generalPath.curveTo(372.843, 455.54, 366.887, 458.518, 369.624, 464.314);
generalPath.curveTo(371.684, 468.677, 376.86798, 466.889, 377.673, 464.635);
generalPath.moveTo(360.2, 465.6);
generalPath.curveTo(361.56702, 468.013, 368.409, 466.97, 369.617, 464.312);
generalPath.moveTo(364.87, 457.63);
generalPath.curveTo(366.319, 456.663, 368.974, 457.867, 369.538, 459.07602);
generalPath.moveTo(364.39, 417.95);
generalPath.curveTo(359.72202, 421.00803, 362.62003, 430.346, 369.863, 427.93002);
generalPath.moveTo(362.94, 425.52);
generalPath.curveTo(359.237, 428.416, 362.618, 437.43298, 369.54, 434.05298);
generalPath.moveTo(364.07, 434.05);
generalPath.curveTo(361.495, 436.625, 363.99002, 443.788, 370.67, 442.41998);
generalPath.moveTo(363.1, 437.59);
generalPath.curveTo(361.65, 436.944, 357.868, 437.427, 356.25702, 439.84);
generalPath.moveTo(358.92, 404.99);
generalPath.curveTo(355.37903, 408.37, 357.06802, 415.29398, 363.668, 415.856);
generalPath.moveTo(357.63, 412.07);
generalPath.curveTo(352.558, 414.566, 352.558, 424.624, 362.7, 425.028);
generalPath.moveTo(357.23, 423.42);
generalPath.curveTo(354.41302, 425.674, 355.781, 434.36603, 363.02502, 433.237);
generalPath.moveTo(359.56, 432.92);
generalPath.curveTo(358.513, 433.966, 358.352, 436.62402, 359.238, 437.75);
generalPath.moveTo(356.34, 429.62);
generalPath.curveTo(353.76498, 429.69998, 350.384, 431.553, 349.497, 434.208);
generalPath.moveTo(344.83, 424.87);
generalPath.curveTo(345.796, 422.29498, 353.76498, 422.457, 354.32797, 430.024);
generalPath.moveTo(355.13, 421.01);
generalPath.curveTo(354.003, 421.252, 351.83002, 422.298, 351.267, 424.47202);
generalPath.moveTo(351.67, 397.43);
generalPath.curveTo(348.208, 400.569, 346.519, 410.47, 357.062, 412.4);
generalPath.moveTo(344.67, 417.87);
generalPath.curveTo(344.67, 415.212, 351.834, 412.958, 354.329, 416.90298);
generalPath.moveTo(340.08, 403.46);
generalPath.curveTo(341.12598, 405.473, 346.116, 408.21, 349.175, 405.956);
generalPath.moveTo(314.16, 387.69);
generalPath.curveTo(314.0, 392.358, 317.863, 396.544, 323.17502, 395.9);
generalPath.curveTo(328.48703, 395.25598, 329.61502, 390.587, 328.005, 387.529);
generalPath.moveTo(323.98, 396.06);
generalPath.curveTo(320.43802, 400.406, 324.785, 406.524, 328.81, 404.753);
generalPath.moveTo(328.01, 393.0);
generalPath.curveTo(330.103, 392.195, 337.02502, 391.23, 339.118, 394.449);
generalPath.moveTo(305.63, 394.29);
generalPath.curveTo(304.02002, 396.70502, 314.001, 399.12, 317.381, 394.45);
generalPath.moveTo(314.0, 396.86);
generalPath.curveTo(313.677, 400.08, 315.288, 405.55298, 323.498, 403.3);
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
generalPath.moveTo(324.79, 408.29);
generalPath.curveTo(326.078, 405.553, 319.96002, 401.04602, 315.29202, 406.036);
generalPath.curveTo(310.62402, 411.026, 315.93604, 416.661, 318.834, 414.728);
generalPath.moveTo(303.38, 397.51);
generalPath.curveTo(300.965, 401.695, 310.302, 409.34302, 315.615, 402.26);
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
generalPath.moveTo(297.18, 404.75);
generalPath.curveTo(293.8, 408.212, 297.985, 414.57, 303.056, 412.638);
generalPath.curveTo(308.126, 410.706, 307.644, 405.394, 306.437, 404.026);
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
generalPath.moveTo(290.66, 411.19);
generalPath.curveTo(287.923, 413.684, 290.579, 419.56, 294.363, 419.56);
generalPath.curveTo(298.14502, 419.56, 300.48, 416.58398, 299.755, 412.8);
generalPath.moveTo(306.03, 410.71);
generalPath.curveTo(305.547, 414.412, 311.02, 416.987, 314.562, 413.529);
generalPath.moveTo(314.73, 406.76);
generalPath.curveTo(315.213, 405.95502, 314.811, 404.586, 314.00702, 403.94202);
generalPath.moveTo(284.79, 416.18);
generalPath.curveTo(281.652, 418.676, 288.413, 425.597, 292.678, 419.238);
generalPath.moveTo(309.01, 414.81);
generalPath.curveTo(306.997, 416.74, 310.217, 421.81, 313.436, 420.28);
generalPath.moveTo(297.99, 418.35);
generalPath.curveTo(298.473, 421.808, 305.23398, 424.383, 309.5, 419.075);
generalPath.moveTo(301.69, 421.81);
generalPath.curveTo(300.644, 423.985, 302.737, 427.448, 305.313, 426.964);
generalPath.moveTo(365.76, 441.7);
generalPath.curveTo(363.26602, 446.608, 371.233, 452.325, 377.02902, 446.367);
generalPath.moveTo(371.55, 449.02);
generalPath.curveTo(370.343, 451.67398, 371.792, 455.378, 373.965, 456.745);
generalPath.moveTo(363.99, 454.57);
generalPath.curveTo(364.554, 452.153, 368.01398, 449.9, 371.154, 451.028);
generalPath.moveTo(359.8, 448.21);
generalPath.curveTo(360.283, 446.03998, 363.18, 443.86398, 365.35397, 444.43);
generalPath.moveTo(549.35, 347.76);
generalPath.curveTo(537.92096, 347.92102, 542.75, 366.273, 552.56995, 362.57);
generalPath.moveTo(545.65, 361.29);
generalPath.curveTo(543.396, 364.993, 547.742, 370.86902, 552.57, 367.407);
generalPath.moveTo(551.29, 368.13);
generalPath.curveTo(547.907, 373.764, 559.982, 382.376, 564.811, 373.522);
generalPath.moveTo(560.95, 376.9);
generalPath.curveTo(561.10803, 382.21298, 576.563, 385.593, 574.313, 374.968);
generalPath.moveTo(572.86, 380.76);
generalPath.curveTo(576.56, 387.03802, 590.406, 387.682, 588.956, 378.345);
generalPath.moveTo(585.9, 384.79);
generalPath.curveTo(588.80005, 388.975, 602.32104, 391.55002, 601.838, 382.858);
generalPath.moveTo(531.0, 331.83);
generalPath.curveTo(532.93, 336.81998, 539.53, 338.59097, 546.775, 335.693);
generalPath.moveTo(526.82, 335.37);
generalPath.curveTo(531.328, 338.267, 524.728, 351.468, 517.808, 346.155);
generalPath.moveTo(526.82, 343.58);
generalPath.curveTo(531.812, 345.995, 537.928, 344.224, 539.69904, 337.13998);
generalPath.moveTo(536.64, 342.61);
generalPath.curveTo(537.123, 346.313, 542.43604, 349.21, 549.357, 347.761);
generalPath.moveTo(524.24, 346.48);
generalPath.curveTo(530.682, 351.953, 521.344, 363.22202, 517.157, 358.07);
generalPath.moveTo(526.66, 350.66);
generalPath.curveTo(529.71796, 352.914, 537.60596, 351.626, 538.41, 345.67);
generalPath.moveTo(534.87, 350.66);
generalPath.curveTo(535.516, 354.523, 538.574, 355.97202, 542.92, 356.133);
generalPath.moveTo(524.89, 355.97);
generalPath.curveTo(528.107, 360.478, 536.15704, 361.765, 539.698, 355.81);
generalPath.moveTo(536.15, 359.19);
generalPath.curveTo(535.83, 363.537, 540.658, 367.078, 545.65, 366.112);
generalPath.moveTo(518.61, 368.85);
generalPath.curveTo(522.79297, 370.94202, 527.302, 363.055, 523.76, 357.582);
generalPath.moveTo(523.44, 377.22);
generalPath.curveTo(528.432, 377.542, 529.073, 369.976, 524.407, 365.79);
generalPath.moveTo(534.87, 384.14);
generalPath.curveTo(539.058, 383.174, 537.766, 373.99802, 527.624, 373.19302);
generalPath.moveTo(547.58, 390.91);
generalPath.curveTo(551.60504, 389.783, 548.38403, 379.641, 537.28, 380.285);
generalPath.moveTo(562.88, 394.45);
generalPath.curveTo(565.613, 390.265, 556.6, 383.182, 549.197, 386.884);
generalPath.moveTo(570.44, 400.24);
generalPath.curveTo(575.432, 401.689, 578.81, 388.48898, 563.036, 390.581);
generalPath.moveTo(579.62, 400.24);
generalPath.curveTo(583.97, 399.11298, 587.028, 391.22498, 574.312, 393.8);
generalPath.moveTo(589.28, 400.89);
generalPath.curveTo(593.142, 402.82202, 594.913, 391.553, 583.16003, 394.612);
generalPath.moveTo(524.4, 365.79);
generalPath.curveTo(529.23004, 368.527, 536.796, 365.307, 536.15, 359.19);
generalPath.moveTo(534.22, 364.51);
generalPath.curveTo(535.83295, 367.407, 535.18695, 373.04202, 532.128, 374.49002);
generalPath.moveTo(534.7, 371.27);
generalPath.curveTo(537.92, 372.55798, 542.267, 371.431, 544.84204, 366.28);
generalPath.moveTo(540.34, 371.27);
generalPath.curveTo(541.30304, 373.524, 541.62805, 378.03098, 539.53204, 380.285);
generalPath.moveTo(541.15, 375.13);
generalPath.curveTo(544.692, 377.062, 548.875, 374.486, 550.646, 370.78302);
generalPath.moveTo(548.39, 374.0);
generalPath.curveTo(550.965, 375.61, 553.22003, 383.176, 548.873, 386.235);
generalPath.moveTo(551.29, 382.7);
generalPath.curveTo(554.34796, 382.86002, 558.857, 382.86002, 561.753, 378.997);
generalPath.moveTo(559.66, 381.09);
generalPath.curveTo(562.397, 381.895, 565.61395, 386.40298, 564.49, 390.427);
generalPath.moveTo(564.65, 388.97);
generalPath.curveTo(567.713, 388.648, 573.02, 386.555, 574.47003, 382.853);
generalPath.moveTo(573.02, 385.27);
generalPath.curveTo(575.60004, 386.719, 577.37, 389.77698, 577.04504, 393.319);
generalPath.moveTo(577.04, 390.74);
generalPath.curveTo(580.09796, 390.58, 582.836, 388.97, 583.63995, 385.589);
generalPath.moveTo(582.84, 387.85);
generalPath.curveTo(585.09406, 388.655, 587.83203, 391.23, 587.994, 394.29);
generalPath.moveTo(587.67, 392.35);
generalPath.curveTo(589.924, 392.028, 591.532, 390.58002, 592.983, 388.325);
generalPath.moveTo(599.1, 388.01);
generalPath.curveTo(602.0, 390.90802, 598.13696, 400.56702, 592.18, 398.79602);
generalPath.moveTo(537.28, 192.9);
generalPath.curveTo(531.322, 196.441, 514.41705, 195.31499, 522.788, 181.31);
generalPath.moveTo(538.89, 183.4);
generalPath.curveTo(527.14, 188.068, 512.648, 179.054, 527.78204, 169.234);
generalPath.moveTo(523.76, 166.02);
generalPath.curveTo(513.94, 166.02, 507.33902, 181.796, 520.543, 187.26901);
generalPath.moveTo(485.61, 172.62);
generalPath.curveTo(483.03497, 177.61, 492.21, 183.083, 498.48898, 178.093);
generalPath.curveTo(503.352, 174.227, 502.99298, 163.766, 500.097, 159.741);
generalPath.moveTo(480.62, 184.53);
generalPath.curveTo(477.4, 195.15399, 501.06598, 195.798, 497.362, 178.895);
generalPath.moveTo(479.33, 200.31);
generalPath.curveTo(480.13397, 208.359, 502.03, 205.783, 494.943, 189.524);
generalPath.moveTo(497.52, 185.01);
generalPath.curveTo(499.28998, 187.42499, 504.12, 191.61, 512.328, 190.805);
generalPath.moveTo(501.38, 173.58);
generalPath.curveTo(502.105, 176.477, 507.013, 178.731, 513.293, 176.559);
generalPath.moveTo(281.73, 418.51);
generalPath.curveTo(276.177, 422.45602, 284.709, 428.652, 287.84702, 421.81);
generalPath.moveTo(277.38, 421.57);
generalPath.curveTo(271.827, 425.512, 280.359, 431.708, 283.497, 424.866);
generalPath.moveTo(272.79, 424.55);
generalPath.curveTo(267.23502, 428.496, 275.768, 434.692, 278.907, 427.84998);
generalPath.moveTo(267.96, 427.29);
generalPath.curveTo(262.647, 430.107, 268.845, 437.028, 274.23798, 430.91);
generalPath.moveTo(262.73, 429.95);
generalPath.curveTo(257.41702, 432.763, 263.616, 439.68802, 269.008, 433.57);
generalPath.moveTo(289.7, 421.65);
generalPath.curveTo(289.61902, 425.754, 297.427, 427.44598, 300.243, 421.32498);
generalPath.moveTo(294.61, 425.44);
generalPath.curveTo(292.19498, 428.49802, 296.623, 432.282, 299.038, 430.91);
generalPath.moveTo(284.22, 424.87);
generalPath.curveTo(283.978, 428.332, 290.739, 430.345, 294.04, 426.56198);
generalPath.moveTo(287.93, 428.5);
generalPath.curveTo(285.75598, 431.317, 290.022, 435.1, 292.75998, 433.97);
generalPath.moveTo(279.72, 428.01);
generalPath.curveTo(279.96, 430.747, 283.824, 433.885, 288.01, 432.114);
generalPath.moveTo(282.21, 431.71);
generalPath.curveTo(280.6, 433.16, 281.405, 436.543, 283.659, 437.59);
generalPath.moveTo(273.84, 431.47);
generalPath.curveTo(273.19598, 433.966, 277.46298, 438.395, 281.809, 435.495);
generalPath.moveTo(274.72, 434.37);
generalPath.curveTo(272.145, 436.383, 272.466, 439.44, 275.766, 439.84);
generalPath.moveTo(268.53, 434.05);
generalPath.curveTo(268.208, 435.73798, 270.382, 438.47498, 273.119, 438.154);
generalPath.moveTo(254.76, 433.89);
generalPath.curveTo(252.185, 435.25702, 258.785, 442.26, 262.889, 435.74002);
generalPath.moveTo(248.4, 436.78);
generalPath.curveTo(245.18, 438.313, 253.15, 446.038, 256.69098, 438.15);
generalPath.moveTo(269.25, 436.46);
generalPath.curveTo(266.754, 437.02298, 265.145, 440.64798, 267.237, 442.093);
generalPath.moveTo(261.12, 437.75);
generalPath.curveTo(260.798, 439.2, 263.857, 441.612, 266.353, 440.73);
generalPath.moveTo(259.03, 438.4);
generalPath.curveTo(256.615, 439.93, 257.90298, 444.192, 260.72, 443.55);
generalPath.moveTo(250.42, 441.21);
generalPath.curveTo(248.166, 442.89798, 249.69499, 446.28, 252.83499, 445.477);
generalPath.moveTo(254.52, 440.97);
generalPath.curveTo(254.601, 441.853, 256.613, 443.224, 258.30402, 442.662);
generalPath.moveTo(242.61, 439.52);
generalPath.curveTo(239.794, 440.728, 239.955, 447.81198, 249.453, 443.94998);
generalPath.moveTo(236.25, 442.34);
generalPath.curveTo(232.305, 444.273, 233.593, 449.586, 242.206, 444.51498);
generalPath.moveTo(242.93, 444.92);
generalPath.curveTo(241.88399, 445.724, 240.758, 449.26602, 244.7, 447.89502);
generalPath.moveTo(235.69, 446.6);
generalPath.curveTo(234.08, 448.05002, 235.127, 451.03, 238.67, 449.9);
generalPath.moveTo(227.4, 447.09);
generalPath.curveTo(224.50299, 448.78198, 230.86, 451.036, 235.127, 446.527);
generalPath.moveTo(229.33, 449.18);
generalPath.curveTo(228.042, 450.468, 228.042, 454.25, 231.422, 452.884);
generalPath.moveTo(221.12, 450.71);
generalPath.curveTo(219.18799, 452.16, 222.48799, 454.093, 228.525, 451.435);
generalPath.moveTo(223.53, 452.8);
generalPath.curveTo(221.276, 454.65, 221.517, 456.983, 224.818, 456.258);
generalPath.moveTo(216.85, 453.85);
generalPath.curveTo(214.35501, 456.104, 217.977, 457.633, 222.32301, 455.78);
generalPath.moveTo(216.93, 456.35);
generalPath.curveTo(212.663, 458.28, 214.515, 461.82, 217.17, 460.454);
generalPath.moveTo(359.4, 468.66);
generalPath.curveTo(358.41, 470.79, 361.654, 472.522, 364.71298, 472.04);
generalPath.curveTo(367.65, 471.577, 370.46097, 469.156, 368.253, 465.764);
generalPath.moveTo(368.41, 469.95);
generalPath.curveTo(371.307, 472.204, 376.459, 469.63, 376.459, 466.246);
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
generalPath.moveTo(545.97, 128.83);
generalPath.curveTo(533.09094, 122.39, 506.36996, 110.478004, 498.80298, 120.137);
generalPath.curveTo(505.723, 117.24, 526.00696, 120.298004, 542.74896, 135.752);
generalPath.lineTo(545.96893, 128.83);
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
generalPath.moveTo(545.97, 128.83);
generalPath.curveTo(533.09094, 122.39, 506.36996, 110.478004, 498.80298, 120.137);
generalPath.curveTo(505.723, 117.24, 526.00696, 120.298004, 542.74896, 135.752);
generalPath.lineTo(545.96893, 128.83);
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
generalPath.moveTo(553.78, 128.15);
generalPath.curveTo(538.888, 110.80299, 530.117, 114.686, 519.40906, 108.711);
generalPath.curveTo(509.35104, 103.097, 493.33005, 101.95, 490.22604, 110.878);
generalPath.curveTo(504.92206, 103.721, 518.41406, 114.727, 526.70105, 116.058);
generalPath.curveTo(538.08405, 117.886, 544.50903, 126.687, 547.83905, 130.734);
generalPath.lineTo(553.78107, 128.15);
generalPath.closePath();
generalPath.moveTo(609.88, 125.93);
generalPath.curveTo(602.15, 108.222, 585.626, 112.847, 578.326, 105.325);
generalPath.curveTo(567.705, 94.379, 540.82196, 84.237, 529.713, 91.80299);
generalPath.curveTo(554.18, 90.51499, 564.601, 108.66799, 577.684, 114.98399);
generalPath.curveTo(587.02203, 119.492, 597.00104, 129.15, 609.88, 125.93099);
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
generalPath.moveTo(553.78, 128.15);
generalPath.curveTo(538.888, 110.80299, 530.117, 114.686, 519.40906, 108.711);
generalPath.curveTo(509.35104, 103.097, 493.33005, 101.95, 490.22604, 110.878);
generalPath.curveTo(504.92206, 103.721, 518.41406, 114.727, 526.70105, 116.058);
generalPath.curveTo(538.08405, 117.886, 544.50903, 126.687, 547.83905, 130.734);
generalPath.lineTo(553.78107, 128.15);
generalPath.closePath();
generalPath.moveTo(609.88, 125.93);
generalPath.curveTo(602.15, 108.222, 585.626, 112.847, 578.326, 105.325);
generalPath.curveTo(567.705, 94.379, 540.82196, 84.237, 529.713, 91.80299);
generalPath.curveTo(554.18, 90.51499, 564.601, 108.66799, 577.684, 114.98399);
generalPath.curveTo(587.02203, 119.492, 597.00104, 129.15, 609.88, 125.93099);
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
generalPath.moveTo(580.91, 124.0);
generalPath.curveTo(567.70996, 107.58, 547.422, 93.091995, 538.089, 98.565);
generalPath.curveTo(550.32196, 99.209, 554.185, 107.741005, 562.881, 113.214005);
generalPath.curveTo(571.573, 118.687004, 567.711, 126.575005, 580.91, 124.00001);
generalPath.closePath();
generalPath.moveTo(518.12, 152.98);
generalPath.curveTo(504.274, 147.829, 477.232, 145.25299, 464.674, 161.03);
generalPath.curveTo(485.60303, 164.56999, 517.153, 162.63899, 518.12, 152.98);
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
generalPath.moveTo(580.91, 124.0);
generalPath.curveTo(567.70996, 107.58, 547.422, 93.091995, 538.089, 98.565);
generalPath.curveTo(550.32196, 99.209, 554.185, 107.741005, 562.881, 113.214005);
generalPath.curveTo(571.573, 118.687004, 567.711, 126.575005, 580.91, 124.00001);
generalPath.closePath();
generalPath.moveTo(518.12, 152.98);
generalPath.curveTo(504.274, 147.829, 477.232, 145.25299, 464.674, 161.03);
generalPath.curveTo(485.60303, 164.56999, 517.153, 162.63899, 518.12, 152.98);
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
generalPath.moveTo(515.55, 159.1);
generalPath.curveTo(501.70398, 152.66, 490.892, 161.655, 477.879, 160.388);
generalPath.curveTo(453.091, 157.973, 435.383, 159.422, 433.129, 171.334);
generalPath.curveTo(447.296, 158.617, 471.121, 169.081, 480.779, 166.505);
generalPath.curveTo(490.43698, 163.929, 526.175, 166.183, 537.442, 171.01201);
generalPath.curveTo(531.646, 163.92902, 522.63403, 161.99802, 515.55, 159.1);
generalPath.closePath();
generalPath.moveTo(559.01, 122.23);
generalPath.curveTo(555.793, 111.605, 555.952, 100.337006, 571.88904, 101.142006);
generalPath.curveTo(567.864, 96.15201, 553.056, 93.576004, 550.63904, 112.25001);
generalPath.curveTo(533.093, 99.37201, 513.93506, 97.11801, 510.39703, 108.226006);
generalPath.curveTo(519.40906, 100.49901, 533.41406, 106.133, 550.155, 125.129005);
generalPath.curveTo(551.60504, 124.324005, 555.468, 122.714005, 559.00903, 122.231);
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
generalPath.moveTo(515.55, 159.1);
generalPath.curveTo(501.70398, 152.66, 490.892, 161.655, 477.879, 160.388);
generalPath.curveTo(453.091, 157.973, 435.383, 159.422, 433.129, 171.334);
generalPath.curveTo(447.296, 158.617, 471.121, 169.081, 480.779, 166.505);
generalPath.curveTo(490.43698, 163.929, 526.175, 166.183, 537.442, 171.01201);
generalPath.curveTo(531.646, 163.92902, 522.63403, 161.99802, 515.55, 159.1);
generalPath.closePath();
generalPath.moveTo(559.01, 122.23);
generalPath.curveTo(555.793, 111.605, 555.952, 100.337006, 571.88904, 101.142006);
generalPath.curveTo(567.864, 96.15201, 553.056, 93.576004, 550.63904, 112.25001);
generalPath.curveTo(533.093, 99.37201, 513.93506, 97.11801, 510.39703, 108.226006);
generalPath.curveTo(519.40906, 100.49901, 533.41406, 106.133, 550.155, 125.129005);
generalPath.curveTo(551.60504, 124.324005, 555.468, 122.714005, 559.00903, 122.231);
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
generalPath.moveTo(534.87, 136.88);
generalPath.curveTo(524.89, 130.44101, 511.366, 119.977005, 535.033, 115.79201);
generalPath.curveTo(524.891, 110.31901, 510.079, 112.73301, 511.691, 131.40701);
generalPath.curveTo(484.64502, 120.460014, 465.224, 124.155014, 461.14102, 134.94801);
generalPath.curveTo(456.63202, 146.86101, 473.37903, 153.46101, 476.27402, 145.89502);
generalPath.curveTo(473.21503, 147.18301, 462.75302, 143.64201, 468.22403, 136.88002);
generalPath.curveTo(473.69904, 130.12003, 501.74902, 135.19502, 528.432, 149.11502);
generalPath.curveTo(535.836, 152.97902, 561.27, 152.33502, 534.869, 136.88002);
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
generalPath.moveTo(534.87, 136.88);
generalPath.curveTo(524.89, 130.44101, 511.366, 119.977005, 535.033, 115.79201);
generalPath.curveTo(524.891, 110.31901, 510.079, 112.73301, 511.691, 131.40701);
generalPath.curveTo(484.64502, 120.460014, 465.224, 124.155014, 461.14102, 134.94801);
generalPath.curveTo(456.63202, 146.86101, 473.37903, 153.46101, 476.27402, 145.89502);
generalPath.curveTo(473.21503, 147.18301, 462.75302, 143.64201, 468.22403, 136.88002);
generalPath.curveTo(473.69904, 130.12003, 501.74902, 135.19502, 528.432, 149.11502);
generalPath.curveTo(535.836, 152.97902, 561.27, 152.33502, 534.869, 136.88002);
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
generalPath.moveTo(527.78, 154.59);
generalPath.curveTo(520.08, 138.868, 495.101, 153.14099, 490.06702, 137.912);
generalPath.curveTo(483.187, 160.224, 525.588, 147.878, 527.78, 154.59);
generalPath.closePath();
generalPath.moveTo(686.67, 171.65);
generalPath.curveTo(691.907, 174.25299, 696.437, 170.161, 688.424, 166.952);
generalPath.curveTo(693.666, 169.553, 698.237, 165.56, 690.224, 162.349);
generalPath.curveTo(695.466, 164.95, 700.037, 160.957, 692.024, 157.747);
generalPath.curveTo(689.88696, 159.898, 686.828, 167.78699, 686.67, 171.65);
generalPath.closePath();
generalPath.moveTo(689.4, 141.39);
generalPath.curveTo(700.992, 129.156, 688.437, 124.97, 702.60004, 112.414);
generalPath.curveTo(714.192, 102.141, 704.812, 95.294, 715.804, 87.301);
generalPath.curveTo(719.346, 84.726006, 727.07104, 79.574005, 727.71704, 74.423004);
generalPath.curveTo(732.38403, 86.013, 713.22504, 87.623, 714.51306, 106.297005);
generalPath.curveTo(715.33307, 118.187004, 707.2961, 117.148, 704.2131, 137.205);
generalPath.curveTo(703.5671, 141.39, 700.6711, 150.727, 689.4001, 141.39);
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
generalPath.moveTo(527.78, 154.59);
generalPath.curveTo(520.08, 138.868, 495.101, 153.14099, 490.06702, 137.912);
generalPath.curveTo(483.187, 160.224, 525.588, 147.878, 527.78, 154.59);
generalPath.closePath();
generalPath.moveTo(686.67, 171.65);
generalPath.curveTo(691.907, 174.25299, 696.437, 170.161, 688.424, 166.952);
generalPath.curveTo(693.666, 169.553, 698.237, 165.56, 690.224, 162.349);
generalPath.curveTo(695.466, 164.95, 700.037, 160.957, 692.024, 157.747);
generalPath.curveTo(689.88696, 159.898, 686.828, 167.78699, 686.67, 171.65);
generalPath.closePath();
generalPath.moveTo(689.4, 141.39);
generalPath.curveTo(700.992, 129.156, 688.437, 124.97, 702.60004, 112.414);
generalPath.curveTo(714.192, 102.141, 704.812, 95.294, 715.804, 87.301);
generalPath.curveTo(719.346, 84.726006, 727.07104, 79.574005, 727.71704, 74.423004);
generalPath.curveTo(732.38403, 86.013, 713.22504, 87.623, 714.51306, 106.297005);
generalPath.curveTo(715.33307, 118.187004, 707.2961, 117.148, 704.2131, 137.205);
generalPath.curveTo(703.5671, 141.39, 700.6711, 150.727, 689.4001, 141.39);
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
generalPath.moveTo(694.56, 146.86);
generalPath.curveTo(700.998, 133.016, 708.389, 133.282, 711.943, 127.865);
generalPath.curveTo(718.706, 117.562, 733.031, 129.635, 745.106, 120.46);
generalPath.curveTo(743.01404, 133.499, 726.75604, 128.83, 719.67303, 137.202);
generalPath.curveTo(712.59, 145.57199, 706.794, 149.437, 694.56006, 146.861);
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
generalPath.moveTo(694.56, 146.86);
generalPath.curveTo(700.998, 133.016, 708.389, 133.282, 711.943, 127.865);
generalPath.curveTo(718.706, 117.562, 733.031, 129.635, 745.106, 120.46);
generalPath.curveTo(743.01404, 133.499, 726.75604, 128.83, 719.67303, 137.202);
generalPath.curveTo(712.59, 145.57199, 706.794, 149.437, 694.56006, 146.861);
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
generalPath.moveTo(696.17, 151.37);
generalPath.curveTo(707.441, 142.355, 715.745, 148.37, 723.537, 143.64299);
generalPath.curveTo(743.175, 131.73, 751.066, 146.05699, 768.612, 140.42299);
generalPath.curveTo(763.942, 151.691, 738.024, 142.03299, 726.758, 150.40399);
generalPath.curveTo(715.487, 158.77399, 675.887, 166.82399, 696.17, 151.37);
generalPath.closePath();
generalPath.moveTo(663.33, 215.6);
generalPath.curveTo(663.167, 210.449, 658.338, 203.848, 651.576, 203.044);
generalPath.curveTo(644.818, 202.23901, 641.91797, 195.156, 636.768, 194.834);
generalPath.curveTo(631.618, 194.512, 628.235, 184.209, 621.151, 184.37);
generalPath.curveTo(614.068, 184.53099, 611.171, 193.707, 627.751, 202.078);
generalPath.curveTo(644.334, 210.449, 662.68396, 220.108, 663.32996, 215.601);
generalPath.closePath();
generalPath.moveTo(642.4, 219.95);
generalPath.curveTo(635.317, 220.272, 634.35004, 230.575, 627.59204, 230.897);
generalPath.curveTo(636.92505, 235.88701, 643.68805, 228.643, 648.517, 222.20401);
generalPath.lineTo(642.4, 219.95001);
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
generalPath.moveTo(696.17, 151.37);
generalPath.curveTo(707.441, 142.355, 715.745, 148.37, 723.537, 143.64299);
generalPath.curveTo(743.175, 131.73, 751.066, 146.05699, 768.612, 140.42299);
generalPath.curveTo(763.942, 151.691, 738.024, 142.03299, 726.758, 150.40399);
generalPath.curveTo(715.487, 158.77399, 675.887, 166.82399, 696.17, 151.37);
generalPath.closePath();
generalPath.moveTo(663.33, 215.6);
generalPath.curveTo(663.167, 210.449, 658.338, 203.848, 651.576, 203.044);
generalPath.curveTo(644.818, 202.23901, 641.91797, 195.156, 636.768, 194.834);
generalPath.curveTo(631.618, 194.512, 628.235, 184.209, 621.151, 184.37);
generalPath.curveTo(614.068, 184.53099, 611.171, 193.707, 627.751, 202.078);
generalPath.curveTo(644.334, 210.449, 662.68396, 220.108, 663.32996, 215.601);
generalPath.closePath();
generalPath.moveTo(642.4, 219.95);
generalPath.curveTo(635.317, 220.272, 634.35004, 230.575, 627.59204, 230.897);
generalPath.curveTo(636.92505, 235.88701, 643.68805, 228.643, 648.517, 222.20401);
generalPath.lineTo(642.4, 219.95001);
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
generalPath.moveTo(648.2, 221.23);
generalPath.curveTo(642.083, 226.381, 640.312, 237.16699, 649.167, 240.22499);
generalPath.curveTo(643.854, 232.9, 658.50397, 229.59999, 653.996, 222.83899);
generalPath.lineTo(648.19995, 221.22899);
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
generalPath.moveTo(648.2, 221.23);
generalPath.curveTo(642.083, 226.381, 640.312, 237.16699, 649.167, 240.22499);
generalPath.curveTo(643.854, 232.9, 658.50397, 229.59999, 653.996, 222.83899);
generalPath.lineTo(648.19995, 221.22899);
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
generalPath.moveTo(654.31, 221.56);
generalPath.curveTo(649.48, 230.897, 661.877, 232.023, 658.656, 239.107);
generalPath.curveTo(665.739, 237.497, 666.868, 224.136, 660.426, 220.594);
generalPath.lineTo(654.31, 221.56);
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
generalPath.moveTo(654.31, 221.56);
generalPath.curveTo(649.48, 230.897, 661.877, 232.023, 658.656, 239.107);
generalPath.curveTo(665.739, 237.497, 666.868, 224.136, 660.426, 220.594);
generalPath.lineTo(654.31, 221.56);
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
generalPath.moveTo(606.98, 201.59);
generalPath.curveTo(618.57196, 200.946, 629.172, 207.217, 636.27997, 217.366);
generalPath.curveTo(640.78796, 223.805, 655.91797, 226.381, 661.07196, 221.229);
generalPath.curveTo(666.222, 216.07901, 663.326, 205.13101, 650.44696, 208.673);
generalPath.curveTo(647.227, 203.2, 637.889, 205.132, 633.384, 200.62401);
generalPath.curveTo(628.876, 196.117, 611.488, 183.23901, 606.98, 201.59001);
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
generalPath.moveTo(606.98, 201.59);
generalPath.curveTo(618.57196, 200.946, 629.172, 207.217, 636.27997, 217.366);
generalPath.curveTo(640.78796, 223.805, 655.91797, 226.381, 661.07196, 221.229);
generalPath.curveTo(666.222, 216.07901, 663.326, 205.13101, 650.44696, 208.673);
generalPath.curveTo(647.227, 203.2, 637.889, 205.132, 633.384, 200.62401);
generalPath.curveTo(628.876, 196.117, 611.488, 183.23901, 606.98, 201.59001);
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
generalPath.moveTo(650.45, 208.68);
generalPath.curveTo(647.392, 209.32399, 646.425, 214.63599, 648.354, 217.37299);
generalPath.moveTo(657.05, 211.9);
generalPath.curveTo(658.01697, 213.51, 657.37, 215.763, 656.88696, 216.89);
generalPath.moveTo(625.34, 202.08);
generalPath.curveTo(631.294, 202.40201, 632.42303, 206.74901, 638.861, 208.358);
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
generalPath.moveTo(650.45, 208.68);
generalPath.curveTo(647.392, 209.32399, 646.425, 214.63599, 648.354, 217.37299);
generalPath.moveTo(657.05, 211.9);
generalPath.curveTo(658.01697, 213.51, 657.37, 215.763, 656.88696, 216.89);
generalPath.moveTo(625.34, 202.08);
generalPath.curveTo(631.294, 202.40201, 632.42303, 206.74901, 638.861, 208.358);
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
generalPath.moveTo(621.4, 187.43);
generalPath.curveTo(641.971, 192.581, 658.292, 197.08899, 668.413, 202.88399);
generalPath.curveTo(678.534, 208.67899, 694.205, 210.28899, 707.91705, 206.426);
generalPath.curveTo(721.63007, 202.562, 748.07104, 199.021, 746.767, 216.08499);
generalPath.curveTo(753.955, 207.55199, 744.809, 198.37599, 726.525, 196.76599);
generalPath.curveTo(726.85504, 188.396, 717.895, 180.829, 711.45404, 185.81898);
generalPath.curveTo(717.41205, 185.01498, 722.554, 196.12198, 710.804, 200.62898);
generalPath.curveTo(713.08704, 192.25899, 704.762, 184.69199, 696.112, 188.39499);
generalPath.curveTo(701.662, 190.00499, 707.275, 199.31198, 694.858, 202.883);
generalPath.curveTo(687.01996, 205.137, 675.595, 202.23999, 667.108, 197.088);
generalPath.curveTo(658.62, 191.937, 610.954, 173.263, 621.39996, 187.43);
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
generalPath.moveTo(621.4, 187.43);
generalPath.curveTo(641.971, 192.581, 658.292, 197.08899, 668.413, 202.88399);
generalPath.curveTo(678.534, 208.67899, 694.205, 210.28899, 707.91705, 206.426);
generalPath.curveTo(721.63007, 202.562, 748.07104, 199.021, 746.767, 216.08499);
generalPath.curveTo(753.955, 207.55199, 744.809, 198.37599, 726.525, 196.76599);
generalPath.curveTo(726.85504, 188.396, 717.895, 180.829, 711.45404, 185.81898);
generalPath.curveTo(717.41205, 185.01498, 722.554, 196.12198, 710.804, 200.62898);
generalPath.curveTo(713.08704, 192.25899, 704.762, 184.69199, 696.112, 188.39499);
generalPath.curveTo(701.662, 190.00499, 707.275, 199.31198, 694.858, 202.883);
generalPath.curveTo(687.01996, 205.137, 675.595, 202.23999, 667.108, 197.088);
generalPath.curveTo(658.62, 191.937, 610.954, 173.263, 621.39996, 187.43);
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
generalPath.moveTo(673.31, 179.06);
generalPath.curveTo(666.872, 181.957, 671.05597, 188.719, 661.077, 192.582);
generalPath.curveTo(651.09406, 196.445, 644.17303, 205.299, 646.427, 212.865);
generalPath.curveTo(653.19, 198.05501, 665.102, 198.699, 669.285, 192.904);
generalPath.curveTo(673.47296, 187.10901, 679.589, 178.57701, 673.31, 179.06001);
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
generalPath.moveTo(673.31, 179.06);
generalPath.curveTo(666.872, 181.957, 671.05597, 188.719, 661.077, 192.582);
generalPath.curveTo(651.09406, 196.445, 644.17303, 205.299, 646.427, 212.865);
generalPath.curveTo(653.19, 198.05501, 665.102, 198.699, 669.285, 192.904);
generalPath.curveTo(673.47296, 187.10901, 679.589, 178.57701, 673.31, 179.06001);
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
generalPath.moveTo(675.08, 180.02);
generalPath.curveTo(674.76, 191.77101, 665.51, 187.49, 669.122, 204.00601);
generalPath.curveTo(670.25104, 209.15701, 672.342, 217.52802, 668.801, 225.89902);
generalPath.curveTo(679.184, 218.33302, 672.505, 202.43903, 677.171, 196.44002);
generalPath.curveTo(679.426, 193.54301, 682.32104, 189.03502, 683.45105, 185.17201);
generalPath.curveTo(681.03406, 191.932, 681.197, 204.49002, 687.79706, 207.70901);
generalPath.curveTo(682.4841, 195.15201, 702.12604, 184.85002, 688.6011, 170.36201);
generalPath.curveTo(686.6711, 173.90402, 680.5511, 180.182, 675.0801, 180.02101);
generalPath.closePath();
generalPath.moveTo(642.24, 168.27);
generalPath.curveTo(643.85297, 170.685, 645.45996, 176.802, 644.01, 180.183);
generalPath.curveTo(647.232, 178.25099, 651.903, 173.261, 653.348, 169.88);
generalPath.curveTo(659.948, 170.84601, 662.523, 179.056, 656.24805, 182.597);
generalPath.curveTo(660.111, 182.597, 666.71106, 182.597, 670.4111, 178.251);
generalPath.curveTo(665.90704, 173.261, 651.9031, 165.533, 642.2411, 168.27);
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
generalPath.moveTo(675.08, 180.02);
generalPath.curveTo(674.76, 191.77101, 665.51, 187.49, 669.122, 204.00601);
generalPath.curveTo(670.25104, 209.15701, 672.342, 217.52802, 668.801, 225.89902);
generalPath.curveTo(679.184, 218.33302, 672.505, 202.43903, 677.171, 196.44002);
generalPath.curveTo(679.426, 193.54301, 682.32104, 189.03502, 683.45105, 185.17201);
generalPath.curveTo(681.03406, 191.932, 681.197, 204.49002, 687.79706, 207.70901);
generalPath.curveTo(682.4841, 195.15201, 702.12604, 184.85002, 688.6011, 170.36201);
generalPath.curveTo(686.6711, 173.90402, 680.5511, 180.182, 675.0801, 180.02101);
generalPath.closePath();
generalPath.moveTo(642.24, 168.27);
generalPath.curveTo(643.85297, 170.685, 645.45996, 176.802, 644.01, 180.183);
generalPath.curveTo(647.232, 178.25099, 651.903, 173.261, 653.348, 169.88);
generalPath.curveTo(659.948, 170.84601, 662.523, 179.056, 656.24805, 182.597);
generalPath.curveTo(660.111, 182.597, 666.71106, 182.597, 670.4111, 178.251);
generalPath.curveTo(665.90704, 173.261, 651.9031, 165.533, 642.2411, 168.27);
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
generalPath.moveTo(542.11, 145.18);
generalPath.curveTo(541.068, 144.23, 539.31, 143.32799, 536.156, 142.68);
generalPath.curveTo(526.41003, 140.68199, 531.443, 131.896, 539.739, 131.974);
generalPath.curveTo(557.443, 112.657, 567.385, 127.548, 588.956, 121.431);
generalPath.curveTo(596.506, 119.291, 601.68896, 119.923996, 605.802, 121.703);
generalPath.curveTo(615.46, 115.263, 626.79, 117.063, 635.002, 124.629005);
generalPath.curveTo(635.91504, 123.17801, 637.14, 122.07001, 638.86, 121.592);
generalPath.curveTo(646.423, 119.492004, 652.54, 125.94, 654.631, 134.312);
generalPath.curveTo(660.527, 133.219, 667.261, 136.137, 671.68896, 140.162);
generalPath.curveTo(677.82294, 137.01201, 682.04694, 136.87201, 683.602, 140.11);
generalPath.curveTo(689.07697, 137.535, 696.169, 135.92, 699.70996, 144.612);
generalPath.curveTo(703.25195, 153.305, 691.33997, 150.73, 689.40594, 169.082);
generalPath.curveTo(688.21497, 180.40201, 675.56396, 184.857, 665.58093, 178.09601);
generalPath.curveTo(649.61395, 167.279, 634.03094, 165.539, 626.30194, 181.96);
generalPath.curveTo(618.57697, 198.38, 612.52295, 207.92001, 593.7849, 202.565);
generalPath.curveTo(587.0269, 200.633, 578.33093, 203.209, 572.8599, 210.614);
generalPath.curveTo(567.38495, 218.019, 559.0139, 211.096, 549.0349, 211.901);
generalPath.curveTo(561.5889, 209.97, 556.7809, 206.811, 567.7099, 206.106);
generalPath.curveTo(577.6899, 205.462, 575.1149, 196.126, 581.5519, 194.838);
generalPath.curveTo(556.4389, 201.278, 557.4059, 191.94, 536.8019, 198.379);
generalPath.curveTo(545.8149, 186.789, 559.9819, 193.228, 567.0649, 186.467);
generalPath.curveTo(548.3899, 186.14499, 540.03986, 173.94499, 531.6479, 179.062);
generalPath.curveTo(518.4479, 187.112, 524.23987, 210.027, 489.79388, 208.038);
generalPath.curveTo(473.05188, 207.07199, 462.42688, 209.32599, 452.44788, 219.308);
generalPath.curveTo(469.83588, 183.248, 493.48587, 203.058, 504.9279, 191.619);
generalPath.curveTo(511.68988, 184.858, 516.8399, 179.70601, 520.38086, 173.267);
generalPath.curveTo(521.62683, 171.00099, 523.3149, 169.705, 525.42285, 169.204);
generalPath.curveTo(496.76886, 160.189, 514.09784, 146.146, 542.11084, 145.181);
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
generalPath.moveTo(542.11, 145.18);
generalPath.curveTo(541.068, 144.23, 539.31, 143.32799, 536.156, 142.68);
generalPath.curveTo(526.41003, 140.68199, 531.443, 131.896, 539.739, 131.974);
generalPath.curveTo(557.443, 112.657, 567.385, 127.548, 588.956, 121.431);
generalPath.curveTo(596.506, 119.291, 601.68896, 119.923996, 605.802, 121.703);
generalPath.curveTo(615.46, 115.263, 626.79, 117.063, 635.002, 124.629005);
generalPath.curveTo(635.91504, 123.17801, 637.14, 122.07001, 638.86, 121.592);
generalPath.curveTo(646.423, 119.492004, 652.54, 125.94, 654.631, 134.312);
generalPath.curveTo(660.527, 133.219, 667.261, 136.137, 671.68896, 140.162);
generalPath.curveTo(677.82294, 137.01201, 682.04694, 136.87201, 683.602, 140.11);
generalPath.curveTo(689.07697, 137.535, 696.169, 135.92, 699.70996, 144.612);
generalPath.curveTo(703.25195, 153.305, 691.33997, 150.73, 689.40594, 169.082);
generalPath.curveTo(688.21497, 180.40201, 675.56396, 184.857, 665.58093, 178.09601);
generalPath.curveTo(649.61395, 167.279, 634.03094, 165.539, 626.30194, 181.96);
generalPath.curveTo(618.57697, 198.38, 612.52295, 207.92001, 593.7849, 202.565);
generalPath.curveTo(587.0269, 200.633, 578.33093, 203.209, 572.8599, 210.614);
generalPath.curveTo(567.38495, 218.019, 559.0139, 211.096, 549.0349, 211.901);
generalPath.curveTo(561.5889, 209.97, 556.7809, 206.811, 567.7099, 206.106);
generalPath.curveTo(577.6899, 205.462, 575.1149, 196.126, 581.5519, 194.838);
generalPath.curveTo(556.4389, 201.278, 557.4059, 191.94, 536.8019, 198.379);
generalPath.curveTo(545.8149, 186.789, 559.9819, 193.228, 567.0649, 186.467);
generalPath.curveTo(548.3899, 186.14499, 540.03986, 173.94499, 531.6479, 179.062);
generalPath.curveTo(518.4479, 187.112, 524.23987, 210.027, 489.79388, 208.038);
generalPath.curveTo(473.05188, 207.07199, 462.42688, 209.32599, 452.44788, 219.308);
generalPath.curveTo(469.83588, 183.248, 493.48587, 203.058, 504.9279, 191.619);
generalPath.curveTo(511.68988, 184.858, 516.8399, 179.70601, 520.38086, 173.267);
generalPath.curveTo(521.62683, 171.00099, 523.3149, 169.705, 525.42285, 169.204);
generalPath.curveTo(496.76886, 160.189, 514.09784, 146.146, 542.11084, 145.181);
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
generalPath.moveTo(683.59, 140.11);
generalPath.curveTo(684.028, 141.015, 684.252, 142.19, 684.252, 143.643);
generalPath.curveTo(684.252, 150.725, 673.628, 151.048, 672.986, 161.51201);
generalPath.curveTo(672.648, 166.98502, 672.01904, 170.04301, 668.315, 169.399);
generalPath.curveTo(664.615, 168.755, 661.394, 162.96, 664.935, 156.199);
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
generalPath.moveTo(683.59, 140.11);
generalPath.curveTo(684.028, 141.015, 684.252, 142.19, 684.252, 143.643);
generalPath.curveTo(684.252, 150.725, 673.628, 151.048, 672.986, 161.51201);
generalPath.curveTo(672.648, 166.98502, 672.01904, 170.04301, 668.315, 169.399);
generalPath.curveTo(664.615, 168.755, 661.394, 162.96, 664.935, 156.199);
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
generalPath.moveTo(547.42, 134.63);
generalPath.curveTo(544.753, 132.75601, 542.087, 131.99501, 539.695, 131.973);
generalPath.moveTo(605.74, 121.65);
generalPath.curveTo(614.265, 125.340004, 618.423, 134.196, 630.807, 134.63);
generalPath.curveTo(642.728, 135.048, 650.128, 152.33801, 670.086, 141.069);
generalPath.curveTo(670.628, 140.764, 671.156, 140.479, 671.669, 140.215);
generalPath.moveTo(635.0, 124.63);
generalPath.curveTo(633.22, 127.46, 632.817, 131.40799, 633.304, 134.874);
generalPath.moveTo(596.04, 161.03);
generalPath.curveTo(580.91095, 161.03, 577.044, 168.757, 577.044, 176.162);
generalPath.curveTo(577.044, 183.567, 584.127, 193.226, 596.68604, 193.226);
generalPath.curveTo(609.24005, 193.226, 616.00305, 185.499, 616.00305, 177.12799);
generalPath.curveTo(616.00305, 168.75699, 608.2731, 161.03, 596.04004, 161.03);
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
generalPath.moveTo(547.42, 134.63);
generalPath.curveTo(544.753, 132.75601, 542.087, 131.99501, 539.695, 131.973);
generalPath.moveTo(605.74, 121.65);
generalPath.curveTo(614.265, 125.340004, 618.423, 134.196, 630.807, 134.63);
generalPath.curveTo(642.728, 135.048, 650.128, 152.33801, 670.086, 141.069);
generalPath.curveTo(670.628, 140.764, 671.156, 140.479, 671.669, 140.215);
generalPath.moveTo(635.0, 124.63);
generalPath.curveTo(633.22, 127.46, 632.817, 131.40799, 633.304, 134.874);
generalPath.moveTo(596.04, 161.03);
generalPath.curveTo(580.91095, 161.03, 577.044, 168.757, 577.044, 176.162);
generalPath.curveTo(577.044, 183.567, 584.127, 193.226, 596.68604, 193.226);
generalPath.curveTo(609.24005, 193.226, 616.00305, 185.499, 616.00305, 177.12799);
generalPath.curveTo(616.00305, 168.75699, 608.2731, 161.03, 596.04004, 161.03);
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
generalPath.moveTo(598.77, 192.9);
generalPath.curveTo(598.45, 188.715, 590.882, 189.35799, 591.203, 186.13899);
generalPath.curveTo(591.524, 182.91899, 595.391, 181.631, 595.391, 177.124);
generalPath.curveTo(595.391, 172.61699, 602.149, 172.29399, 604.403, 175.836);
generalPath.curveTo(606.658, 179.377, 613.42004, 186.299, 614.87, 182.758);
generalPath.moveTo(604.41, 175.84);
generalPath.curveTo(600.868, 179.381, 599.25995, 186.625, 603.927, 192.26);
generalPath.moveTo(609.24, 181.31);
generalPath.curveTo(608.115, 183.72499, 607.794, 187.427, 609.082, 189.68);
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
generalPath.moveTo(598.77, 192.9);
generalPath.curveTo(598.45, 188.715, 590.882, 189.35799, 591.203, 186.13899);
generalPath.curveTo(591.524, 182.91899, 595.391, 181.631, 595.391, 177.124);
generalPath.curveTo(595.391, 172.61699, 602.149, 172.29399, 604.403, 175.836);
generalPath.curveTo(606.658, 179.377, 613.42004, 186.299, 614.87, 182.758);
generalPath.moveTo(604.41, 175.84);
generalPath.curveTo(600.868, 179.381, 599.25995, 186.625, 603.927, 192.26);
generalPath.moveTo(609.24, 181.31);
generalPath.curveTo(608.115, 183.72499, 607.794, 187.427, 609.082, 189.68);
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
generalPath.moveTo(669.36, 169.48);
generalPath.curveTo(681.193, 170.446, 683.206, 157.40599, 674.352, 156.60199);
generalPath.moveTo(654.8, 134.31);
generalPath.curveTo(650.696, 129.079, 641.279, 127.308, 641.117, 138.415);
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
generalPath.moveTo(639.99, 151.05);
generalPath.curveTo(635.96497, 141.07, 625.661, 139.62, 620.186, 144.61);
generalPath.curveTo(615.63196, 148.764, 615.519, 159.582, 625.33997, 161.836);
generalPath.curveTo(628.72, 157.812, 635.31995, 152.499, 639.99, 151.051);
generalPath.closePath();
generalPath.moveTo(635.56, 144.77);
generalPath.curveTo(629.764, 139.61801, 621.231, 149.358, 628.96, 158.292);
generalPath.moveTo(525.31, 169.16);
generalPath.curveTo(529.19, 168.24, 534.86, 170.138, 543.55597, 174.227);
generalPath.curveTo(549.03094, 176.80301, 565.45197, 182.27701, 575.75195, 176.80301);
generalPath.curveTo(565.12695, 180.667, 557.08093, 164.56801, 549.03094, 166.50002);
generalPath.curveTo(540.98096, 168.43202, 526.25195, 171.41002, 520.05597, 165.53401);
generalPath.curveTo(535.185, 166.50002, 543.323, 154.51302, 560.61896, 164.89001);
generalPath.curveTo(565.45197, 167.78801, 571.569, 169.72002, 577.04, 169.39801);
generalPath.curveTo(562.87695, 152.33401, 544.20197, 163.28001, 542.269, 149.43701);
generalPath.curveTo(550.802, 158.613, 571.648, 147.34401, 582.273, 164.56902);
generalPath.moveTo(545.33, 152.01);
generalPath.curveTo(543.338, 149.53, 544.23804, 147.06, 542.10004, 145.105);
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
generalPath.moveTo(639.99, 151.05);
generalPath.curveTo(635.96497, 141.07, 625.661, 139.62, 620.186, 144.61);
generalPath.curveTo(615.63196, 148.764, 615.519, 159.582, 625.33997, 161.836);
generalPath.curveTo(628.72, 157.812, 635.31995, 152.499, 639.99, 151.051);
generalPath.closePath();
generalPath.moveTo(635.56, 144.77);
generalPath.curveTo(629.764, 139.61801, 621.231, 149.358, 628.96, 158.292);
generalPath.moveTo(525.31, 169.16);
generalPath.curveTo(529.19, 168.24, 534.86, 170.138, 543.55597, 174.227);
generalPath.curveTo(549.03094, 176.80301, 565.45197, 182.27701, 575.75195, 176.80301);
generalPath.curveTo(565.12695, 180.667, 557.08093, 164.56801, 549.03094, 166.50002);
generalPath.curveTo(540.98096, 168.43202, 526.25195, 171.41002, 520.05597, 165.53401);
generalPath.curveTo(535.185, 166.50002, 543.323, 154.51302, 560.61896, 164.89001);
generalPath.curveTo(565.45197, 167.78801, 571.569, 169.72002, 577.04, 169.39801);
generalPath.curveTo(562.87695, 152.33401, 544.20197, 163.28001, 542.269, 149.43701);
generalPath.curveTo(550.802, 158.613, 571.648, 147.34401, 582.273, 164.56902);
generalPath.moveTo(545.33, 152.01);
generalPath.curveTo(543.338, 149.53, 544.23804, 147.06, 542.10004, 145.105);
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
generalPath.moveTo(654.8, 134.31);
generalPath.curveTo(651.258, 130.527, 643.53296, 133.505, 645.704, 141.152);
generalPath.curveTo(647.396, 137.611, 651.01697, 134.63199, 654.8, 134.31);
generalPath.closePath();
generalPath.moveTo(632.91, 154.93);
generalPath.curveTo(635.34796, 153.15999, 637.86395, 151.70699, 639.985, 151.04799);
generalPath.curveTo(638.82697, 148.18399, 637.15497, 146.02199, 635.227, 144.51399);
generalPath.curveTo(633.385, 143.24199, 628.093, 150.35799, 632.91, 154.93);
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
generalPath.moveTo(623.4, 141.87);
generalPath.curveTo(617.604, 138.00699, 612.29205, 138.329, 610.521, 141.54799);
generalPath.curveTo(606.338, 141.38799, 602.875, 144.44598, 602.713, 150.56299);
generalPath.moveTo(611.65, 153.14);
generalPath.curveTo(604.73004, 148.392, 595.229, 150.162, 595.875, 160.787);
generalPath.moveTo(591.69, 166.82);
generalPath.curveTo(595.07, 164.08301, 599.898, 162.15201, 603.603, 166.981);
generalPath.moveTo(643.37, 156.36);
generalPath.curveTo(642.082, 158.13, 641.11597, 160.867, 643.207, 165.053);
generalPath.curveTo(640.63196, 161.67299, 634.19495, 161.67299, 627.269, 170.687);
generalPath.moveTo(658.66, 155.88);
generalPath.curveTo(650.29, 156.84601, 650.45197, 162.319, 657.20996, 164.73401);
generalPath.moveTo(599.1, 135.43);
generalPath.curveTo(592.01697, 133.98099, 586.867, 138.16699, 596.68695, 141.708);
generalPath.moveTo(612.62, 130.6);
generalPath.curveTo(602.637, 128.18501, 598.612, 130.76001, 603.12, 133.015);
generalPath.moveTo(583.8, 170.69);
generalPath.curveTo(583.48, 174.23201, 585.40796, 178.90001, 591.204, 173.588);
generalPath.moveTo(585.74, 181.31);
generalPath.curveTo(585.74, 182.276, 585.57697, 183.402, 584.932, 184.207);
generalPath.moveTo(562.55, 134.14);
generalPath.curveTo(556.433, 132.37, 555.308, 126.735, 562.39197, 127.218);
generalPath.moveTo(560.46, 147.18);
generalPath.curveTo(553.697, 144.926, 553.697, 138.32599, 559.33, 138.96999);
generalPath.moveTo(573.02, 143.8);
generalPath.curveTo(565.132, 141.868, 564.812, 136.395, 570.77, 137.2);
generalPath.moveTo(573.98, 127.06);
generalPath.curveTo(569.797, 126.738, 563.355, 131.407, 574.143, 134.143);
generalPath.moveTo(585.74, 136.4);
generalPath.curveTo(575.92, 134.95099, 576.082, 138.976, 581.873, 141.55199);
generalPath.moveTo(593.14, 127.06);
generalPath.curveTo(585.573, 125.611, 582.998, 130.119, 588.148, 132.05);
generalPath.moveTo(569.32, 154.91);
generalPath.curveTo(567.466, 153.381, 565.94, 146.056, 574.79, 148.23001);
generalPath.moveTo(587.67, 152.66);
generalPath.curveTo(581.716, 151.05, 576.082, 156.845, 581.553, 160.226);
generalPath.moveTo(595.55, 145.74);
generalPath.curveTo(589.27496, 144.613, 583.962, 146.384, 587.342, 148.63701);
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
generalPath.moveTo(654.46, 134.31);
generalPath.curveTo(650.922, 134.965, 647.752, 137.04399, 645.698, 141.15);
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
generalPath.moveTo(654.46, 134.31);
generalPath.curveTo(650.922, 134.965, 647.752, 137.04399, 645.698, 141.15);
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
    public static ResizableIcon of(int width, int height) {
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       Flag_of_Bhutan base = new Flag_of_Bhutan();
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
        return Flag_of_Bhutan::new;
    }
}

