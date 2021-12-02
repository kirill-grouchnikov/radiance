package org.pushingpixels.radiance.demo.theming.main.check.svg.flags;

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
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class hk implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.699999988079071f, 0.0f, 0.0f, 0.699999988079071f, -113.43000030517578f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(1063.0f, 744.094f);
generalPath.lineTo(0.0f, 744.094f);
generalPath.lineTo(0.0f, 0.004f);
generalPath.lineTo(1063.0f, 0.004f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(516.372f, 360.137f);
generalPath.curveTo(516.372f, 360.137f, 441.35202f, 327.837f, 452.117f, 244.137f);
generalPath.curveTo(462.53702f, 203.84698f, 480.945f, 176.41f, 514.287f, 161.47699f);
generalPath.curveTo(529.917f, 156.61299f, 545.894f, 154.52899f, 562.217f, 153.13998f);
generalPath.curveTo(557.933f, 157.19199f, 554.345f, 161.24399f, 552.493f, 166.33798f);
generalPath.curveTo(548.90295f, 175.48398f, 551.566f, 184.28299f, 556.313f, 193.08098f);
generalPath.curveTo(562.333f, 203.27098f, 565.919f, 213.80498f, 567.078f, 227.46597f);
generalPath.curveTo(569.278f, 246.68398f, 561.058f, 265.20898f, 545.892f, 276.43896f);
generalPath.curveTo(536.28204f, 283.84897f, 524.93805f, 286.39496f, 515.67505f, 294.84598f);
generalPath.curveTo(508.49805f, 301.90897f, 504.09906f, 308.972f, 502.47806f, 321.24197f);
generalPath.curveTo(502.24606f, 344.62897f, 508.61505f, 347.87198f, 516.3721f, 360.14197f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(502.132f, 239.037f);
generalPath.lineTo(502.132f, 238.69f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(502.132f, 239.037f);
generalPath.lineTo(502.132f, 238.69f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_3
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(506.872f, 351.447f);
generalPath.curveTo(477.69202f, 325.62698f, 480.242f, 260.68698f, 502.47202f, 239.03699f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(501.898f, 223.064f);
generalPath.lineTo(511.508f, 220.899f);
generalPath.lineTo(512.652f, 211.529f);
generalPath.lineTo(517.432f, 219.559f);
generalPath.lineTo(527.04f, 217.37901f);
generalPath.lineTo(520.383f, 224.50601f);
generalPath.lineTo(525.177f, 232.52602f);
generalPath.lineTo(516.283f, 228.90402f);
generalPath.lineTo(509.63702f, 236.04002f);
generalPath.lineTo(510.79703f, 226.67502f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(522.747f, 354.6f);
generalPath.curveTo(522.747f, 354.6f, 531.64703f, 273.406f, 614.827f, 259.174f);
generalPath.curveTo(656.403f, 257.33102f, 688.03f, 266.89102f, 712.077f, 294.394f);
generalPath.curveTo(721.307f, 307.91202f, 727.98206f, 322.578f, 734.093f, 337.777f);
generalPath.curveTo(728.963f, 334.86902f, 724.038f, 332.625f, 718.625f, 332.34702f);
generalPath.curveTo(708.828f, 331.595f, 701.195f, 336.71902f, 694.175f, 343.83502f);
generalPath.curveTo(686.198f, 352.575f, 677.175f, 359.09302f, 664.455f, 364.20502f);
generalPath.curveTo(646.72504f, 371.937f, 626.60504f, 369.50702f, 611.42303f, 358.298f);
generalPath.curveTo(601.523f, 351.28f, 595.76306f, 341.181f, 584.96906f, 334.80002f);
generalPath.curveTo(576.11206f, 330.00803f, 568.06903f, 327.872f, 555.8641f, 329.91702f);
generalPath.curveTo(533.4361f, 336.54703f, 532.2021f, 343.58704f, 522.7441f, 354.60004f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(634.36f, 305.5f);
generalPath.lineTo(634.69f, 305.397f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(634.36f, 305.5f);
generalPath.lineTo(634.69f, 305.397f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_7
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(528.272f, 342.97f);
generalPath.curveTo(544.409f, 307.504f, 607.246f, 290.914f, 634.459f, 305.824f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(649.563f, 300.594f);
generalPath.lineTo(654.449f, 309.15f);
generalPath.lineTo(663.73895f, 307.498f);
generalPath.lineTo(657.4639f, 314.421f);
generalPath.lineTo(662.36395f, 322.969f);
generalPath.lineTo(653.59894f, 318.693f);
generalPath.lineTo(647.33496f, 325.626f);
generalPath.lineTo(648.19196f, 316.061f);
generalPath.lineTo(639.42194f, 311.798f);
generalPath.lineTo(648.7169f, 310.163f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(528.353f, 360.463f);
generalPath.curveTo(528.353f, 360.463f, 608.16705f, 343.117f, 648.08105f, 417.46902f);
generalPath.curveTo(663.03107f, 456.30502f, 664.01105f, 489.32904f, 645.57104f, 520.869f);
generalPath.curveTo(635.684f, 533.91205f, 623.89703f, 544.89905f, 611.426f, 555.521f);
generalPath.curveTo(612.556f, 549.733f, 613.116f, 544.351f, 611.66205f, 539.12897f);
generalPath.curveTo(609.2651f, 529.60095f, 601.98206f, 523.99097f, 593.00507f, 519.594f);
generalPath.curveTo(582.18304f, 514.80597f, 573.13904f, 508.32098f, 564.2521f, 497.88098f);
generalPath.curveTo(551.2881f, 483.525f, 547.2021f, 463.675f, 553.0101f, 445.72098f);
generalPath.curveTo(556.5201f, 434.10397f, 564.2671f, 425.43597f, 566.8901f, 413.17398f);
generalPath.curveTo(568.62006f, 403.25397f, 568.0921f, 394.951f, 562.27606f, 384.02597f);
generalPath.curveTo(548.8661f, 364.86597f, 541.7991f, 365.93097f, 528.35205f, 360.45798f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(610.357f, 450.702f);
generalPath.lineTo(610.559f, 450.984f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(610.357f, 450.702f);
generalPath.lineTo(610.559f, 450.984f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_11
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(541.134f, 362.008f);
generalPath.curveTo(579.888f, 366.046f, 615.576f, 420.36f, 610.07996f, 450.9f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(619.836f, 463.56f);
generalPath.lineTo(613.276f, 470.91f);
generalPath.lineTo(617.793f, 479.196f);
generalPath.lineTo(609.236f, 475.444f);
generalPath.lineTo(602.68604f, 482.804f);
generalPath.lineTo(603.958f, 473.136f);
generalPath.lineTo(595.394f, 469.39798f);
generalPath.lineTo(604.737f, 467.17297f);
generalPath.lineTo(605.993f, 457.50296f);
generalPath.lineTo(610.495f, 465.79797f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_13
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_13_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(526.556f, 368.693f);
generalPath.curveTo(526.556f, 368.693f, 565.61804f, 440.425f, 505.46603f, 499.61298f);
generalPath.curveTo(472.39102f, 524.86896f, 440.97003f, 535.083f, 405.52304f, 526.24097f);
generalPath.curveTo(390.22604f, 520.41595f, 376.37305f, 512.18896f, 362.67505f, 503.20096f);
generalPath.curveTo(368.54706f, 502.66095f, 373.87106f, 501.68896f, 378.47305f, 498.82596f);
generalPath.curveTo(386.94507f, 493.84897f, 390.28305f, 485.28296f, 391.98306f, 475.43195f);
generalPath.curveTo(393.53906f, 463.70193f, 397.22305f, 453.20193f, 404.74707f, 441.73993f);
generalPath.curveTo(414.88406f, 425.26593f, 432.78708f, 415.76993f, 451.65207f, 416.30194f);
generalPath.curveTo(463.78607f, 416.40793f, 474.28207f, 421.40994f, 486.78607f, 420.48193f);
generalPath.curveTo(496.79306f, 419.35794f, 504.61407f, 416.51892f, 513.46606f, 407.86893f);
generalPath.curveTo(528.08905f, 389.61893f, 525.0821f, 383.1339f, 526.55804f, 368.69193f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_13_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(462.977f, 472.74f);
generalPath.lineTo(462.763f, 473.013f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(462.977f, 472.74f);
generalPath.lineTo(462.763f, 473.013f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_13_2
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(528.662f, 381.395f);
generalPath.curveTo(535.67f, 419.722f, 493.564f, 469.228f, 462.71f, 472.53f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_13_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(453.298f, 485.45f);
generalPath.lineTo(444.402f, 481.216f);
generalPath.lineTo(437.71802f, 487.878f);
generalPath.lineTo(438.915f, 478.612f);
generalPath.lineTo(430.01202f, 474.392f);
generalPath.lineTo(439.64902f, 472.898f);
generalPath.lineTo(440.829f, 463.62802f);
generalPath.lineTo(445.58902f, 471.971f);
generalPath.lineTo(455.22302f, 470.463f);
generalPath.lineTo(448.52603f, 477.113f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_14
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_14_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(517.706f, 367.138f);
generalPath.curveTo(517.706f, 367.138f, 463.029f, 427.815f, 387.218f, 390.748f);
generalPath.curveTo(352.408f, 367.942f, 332.33298f, 341.69998f, 328.895f, 305.328f);
generalPath.curveTo(329.30698f, 288.966f, 332.465f, 273.165f, 336.38898f, 257.26f);
generalPath.curveTo(338.84897f, 262.618f, 341.53598f, 267.31702f, 345.76498f, 270.707f);
generalPath.curveTo(353.275f, 277.043f, 362.46198f, 277.34702f, 372.318f, 275.677f);
generalPath.curveTo(383.89798f, 273.247f, 395.02798f, 273.231f, 408.33798f, 276.52f);
generalPath.curveTo(427.244f, 280.608f, 442.14798f, 294.34f, 447.91498f, 312.30798f);
generalPath.curveTo(451.84497f, 323.788f, 450.615f, 335.348f, 455.645f, 346.835f);
generalPath.curveTo(460.03f, 355.9f, 465.30698f, 362.33298f, 476.40698f, 367.80798f);
generalPath.curveTo(498.47897f, 375.53598f, 503.59497f, 370.546f, 517.707f, 367.13797f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_14_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(398.446f, 341.743f);
generalPath.lineTo(398.118f, 341.631f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(398.446f, 341.743f);
generalPath.lineTo(398.118f, 341.631f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_14_2
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
stroke = new BasicStroke(3.127f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(506.426f, 373.345f);
generalPath.curveTo(472.606f, 392.69f, 411.922f, 369.425f, 398.556f, 341.421f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_14_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(383.244f, 336.836f);
generalPath.lineTo(384.28f, 327.039f);
generalPath.lineTo(375.775f, 322.947f);
generalPath.lineTo(384.913f, 320.99698f);
generalPath.lineTo(385.93298f, 311.19897f);
generalPath.lineTo(390.546f, 319.79196f);
generalPath.lineTo(399.681f, 317.82697f);
generalPath.lineTo(393.395f, 325.08698f);
generalPath.lineTo(398.02f, 333.67197f);
generalPath.lineTo(389.52f, 329.56497f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 0, 0, 255)) : new Color(186, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
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
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       hk base = new hk();
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
        return hk::new;
    }
}

