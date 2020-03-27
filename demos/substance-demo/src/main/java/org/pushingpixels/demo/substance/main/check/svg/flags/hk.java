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
public class hk implements ResizableIcon {
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
g.transform(new AffineTransform(0.699999988079071f, 0.0f, 0.0f, 0.699999988079071f, -113.43000030517578f, 0.0f));
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
generalPath.moveTo(1063.0, 744.094);
generalPath.lineTo(0.0, 744.094);
generalPath.lineTo(0.0, 0.004);
generalPath.lineTo(1063.0, 0.004);
generalPath.closePath();
shape = generalPath;
paint = new Color(186, 0, 0, 255);
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
generalPath.moveTo(516.372, 360.137);
generalPath.curveTo(516.372, 360.137, 441.35202, 327.837, 452.117, 244.137);
generalPath.curveTo(462.53702, 203.84698, 480.945, 176.41, 514.287, 161.47699);
generalPath.curveTo(529.917, 156.61299, 545.894, 154.52899, 562.217, 153.13998);
generalPath.curveTo(557.933, 157.19199, 554.345, 161.24399, 552.493, 166.33798);
generalPath.curveTo(548.90295, 175.48398, 551.566, 184.28299, 556.313, 193.08098);
generalPath.curveTo(562.333, 203.27098, 565.919, 213.80498, 567.078, 227.46597);
generalPath.curveTo(569.278, 246.68398, 561.058, 265.20898, 545.892, 276.43896);
generalPath.curveTo(536.28204, 283.84897, 524.93805, 286.39496, 515.67505, 294.84598);
generalPath.curveTo(508.49805, 301.90897, 504.09906, 308.972, 502.47806, 321.24197);
generalPath.curveTo(502.24606, 344.62897, 508.61505, 347.87198, 516.3721, 360.14197);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(502.132, 239.037);
generalPath.lineTo(502.132, 238.69);
shape = generalPath;
paint = new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(502.132, 239.037);
generalPath.lineTo(502.132, 238.69);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new Color(186, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(506.872, 351.447);
generalPath.curveTo(477.69202, 325.62698, 480.242, 260.68698, 502.47202, 239.03699);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(501.898, 223.064);
generalPath.lineTo(511.508, 220.899);
generalPath.lineTo(512.652, 211.529);
generalPath.lineTo(517.432, 219.559);
generalPath.lineTo(527.04, 217.37901);
generalPath.lineTo(520.383, 224.50601);
generalPath.lineTo(525.177, 232.52602);
generalPath.lineTo(516.283, 228.90402);
generalPath.lineTo(509.63702, 236.04002);
generalPath.lineTo(510.79703, 226.67502);
shape = generalPath;
paint = new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(522.747, 354.6);
generalPath.curveTo(522.747, 354.6, 531.64703, 273.406, 614.827, 259.174);
generalPath.curveTo(656.403, 257.33102, 688.03, 266.89102, 712.077, 294.394);
generalPath.curveTo(721.307, 307.91202, 727.98206, 322.578, 734.093, 337.777);
generalPath.curveTo(728.963, 334.86902, 724.038, 332.625, 718.625, 332.34702);
generalPath.curveTo(708.828, 331.595, 701.195, 336.71902, 694.175, 343.83502);
generalPath.curveTo(686.198, 352.575, 677.175, 359.09302, 664.455, 364.20502);
generalPath.curveTo(646.72504, 371.937, 626.60504, 369.50702, 611.42303, 358.298);
generalPath.curveTo(601.523, 351.28, 595.76306, 341.181, 584.96906, 334.80002);
generalPath.curveTo(576.11206, 330.00803, 568.06903, 327.872, 555.8641, 329.91702);
generalPath.curveTo(533.4361, 336.54703, 532.2021, 343.58704, 522.7441, 354.60004);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(634.36, 305.5);
generalPath.lineTo(634.69, 305.397);
shape = generalPath;
paint = new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(634.36, 305.5);
generalPath.lineTo(634.69, 305.397);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new Color(186, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(528.272, 342.97);
generalPath.curveTo(544.409, 307.504, 607.246, 290.914, 634.459, 305.824);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(649.563, 300.594);
generalPath.lineTo(654.449, 309.15);
generalPath.lineTo(663.73895, 307.498);
generalPath.lineTo(657.4639, 314.421);
generalPath.lineTo(662.36395, 322.969);
generalPath.lineTo(653.59894, 318.693);
generalPath.lineTo(647.33496, 325.626);
generalPath.lineTo(648.19196, 316.061);
generalPath.lineTo(639.42194, 311.798);
generalPath.lineTo(648.7169, 310.163);
shape = generalPath;
paint = new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(528.353, 360.463);
generalPath.curveTo(528.353, 360.463, 608.16705, 343.117, 648.08105, 417.46902);
generalPath.curveTo(663.03107, 456.30502, 664.01105, 489.32904, 645.57104, 520.869);
generalPath.curveTo(635.684, 533.91205, 623.89703, 544.89905, 611.426, 555.521);
generalPath.curveTo(612.556, 549.733, 613.116, 544.351, 611.66205, 539.12897);
generalPath.curveTo(609.2651, 529.60095, 601.98206, 523.99097, 593.00507, 519.594);
generalPath.curveTo(582.18304, 514.80597, 573.13904, 508.32098, 564.2521, 497.88098);
generalPath.curveTo(551.2881, 483.525, 547.2021, 463.675, 553.0101, 445.72098);
generalPath.curveTo(556.5201, 434.10397, 564.2671, 425.43597, 566.8901, 413.17398);
generalPath.curveTo(568.62006, 403.25397, 568.0921, 394.951, 562.27606, 384.02597);
generalPath.curveTo(548.8661, 364.86597, 541.7991, 365.93097, 528.35205, 360.45798);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(610.357, 450.702);
generalPath.lineTo(610.559, 450.984);
shape = generalPath;
paint = new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(610.357, 450.702);
generalPath.lineTo(610.559, 450.984);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
paint = new Color(186, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(541.134, 362.008);
generalPath.curveTo(579.888, 366.046, 615.576, 420.36, 610.07996, 450.9);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(619.836, 463.56);
generalPath.lineTo(613.276, 470.91);
generalPath.lineTo(617.793, 479.196);
generalPath.lineTo(609.236, 475.444);
generalPath.lineTo(602.68604, 482.804);
generalPath.lineTo(603.958, 473.136);
generalPath.lineTo(595.394, 469.39798);
generalPath.lineTo(604.737, 467.17297);
generalPath.lineTo(605.993, 457.50296);
generalPath.lineTo(610.495, 465.79797);
shape = generalPath;
paint = new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(526.556, 368.693);
generalPath.curveTo(526.556, 368.693, 565.61804, 440.425, 505.46603, 499.61298);
generalPath.curveTo(472.39102, 524.86896, 440.97003, 535.083, 405.52304, 526.24097);
generalPath.curveTo(390.22604, 520.41595, 376.37305, 512.18896, 362.67505, 503.20096);
generalPath.curveTo(368.54706, 502.66095, 373.87106, 501.68896, 378.47305, 498.82596);
generalPath.curveTo(386.94507, 493.84897, 390.28305, 485.28296, 391.98306, 475.43195);
generalPath.curveTo(393.53906, 463.70193, 397.22305, 453.20193, 404.74707, 441.73993);
generalPath.curveTo(414.88406, 425.26593, 432.78708, 415.76993, 451.65207, 416.30194);
generalPath.curveTo(463.78607, 416.40793, 474.28207, 421.40994, 486.78607, 420.48193);
generalPath.curveTo(496.79306, 419.35794, 504.61407, 416.51892, 513.46606, 407.86893);
generalPath.curveTo(528.08905, 389.61893, 525.0821, 383.1339, 526.55804, 368.69193);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(462.977, 472.74);
generalPath.lineTo(462.763, 473.013);
shape = generalPath;
paint = new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(462.977, 472.74);
generalPath.lineTo(462.763, 473.013);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13_2
paint = new Color(186, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(528.662, 381.395);
generalPath.curveTo(535.67, 419.722, 493.564, 469.228, 462.71, 472.53);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(453.298, 485.45);
generalPath.lineTo(444.402, 481.216);
generalPath.lineTo(437.71802, 487.878);
generalPath.lineTo(438.915, 478.612);
generalPath.lineTo(430.01202, 474.392);
generalPath.lineTo(439.64902, 472.898);
generalPath.lineTo(440.829, 463.62802);
generalPath.lineTo(445.58902, 471.971);
generalPath.lineTo(455.22302, 470.463);
generalPath.lineTo(448.52603, 477.113);
shape = generalPath;
paint = new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(517.706, 367.138);
generalPath.curveTo(517.706, 367.138, 463.029, 427.815, 387.218, 390.748);
generalPath.curveTo(352.408, 367.942, 332.33298, 341.69998, 328.895, 305.328);
generalPath.curveTo(329.30698, 288.966, 332.465, 273.165, 336.38898, 257.26);
generalPath.curveTo(338.84897, 262.618, 341.53598, 267.31702, 345.76498, 270.707);
generalPath.curveTo(353.275, 277.043, 362.46198, 277.34702, 372.318, 275.677);
generalPath.curveTo(383.89798, 273.247, 395.02798, 273.231, 408.33798, 276.52);
generalPath.curveTo(427.244, 280.608, 442.14798, 294.34, 447.91498, 312.30798);
generalPath.curveTo(451.84497, 323.788, 450.615, 335.348, 455.645, 346.835);
generalPath.curveTo(460.03, 355.9, 465.30698, 362.33298, 476.40698, 367.80798);
generalPath.curveTo(498.47897, 375.53598, 503.59497, 370.546, 517.707, 367.13797);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(398.446, 341.743);
generalPath.lineTo(398.118, 341.631);
shape = generalPath;
paint = new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(398.446, 341.743);
generalPath.lineTo(398.118, 341.631);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_2
paint = new Color(186, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(506.426, 373.345);
generalPath.curveTo(472.606, 392.69, 411.922, 369.425, 398.556, 341.421);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(383.244, 336.836);
generalPath.lineTo(384.28, 327.039);
generalPath.lineTo(375.775, 322.947);
generalPath.lineTo(384.913, 320.99698);
generalPath.lineTo(385.93298, 311.19897);
generalPath.lineTo(390.546, 319.79196);
generalPath.lineTo(399.681, 317.82697);
generalPath.lineTo(393.395, 325.08698);
generalPath.lineTo(398.02, 333.67197);
generalPath.lineTo(389.52, 329.56497);
shape = generalPath;
paint = new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
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
        return 1.9650020599365234;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0028000001329928637;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 510.0350036621094;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 511.9971923828125;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private hk() {
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
       hk base = new hk();
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
       hk base = new hk();
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
        return hk::new;
    }
}

