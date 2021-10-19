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
public class pt implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.79f, 0.0f);
generalPath.lineTo(512.05f, 0.0f);
generalPath.lineTo(512.05f, 512.0f);
generalPath.lineTo(204.79f, 512.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 0, 0, 255)) : new Color(255, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-0.05f, 0.0f);
generalPath.lineTo(204.79f, 0.0f);
generalPath.lineTo(204.79f, 512.0f);
generalPath.lineTo(-0.05f, 512.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 102, 0, 255)) : new Color(0, 102, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(293.78f, 326.588f);
generalPath.curveTo(259.41f, 325.552f, 101.79199f, 227.16801f, 100.70999f, 211.50201f);
generalPath.lineTo(109.41499f, 196.98701f);
generalPath.curveTo(125.048996f, 219.70401f, 286.18f, 315.38403f, 302.005f, 311.993f);
generalPath.lineTo(293.78f, 326.583f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(293.78f, 326.588f);
generalPath.curveTo(259.41f, 325.552f, 101.79199f, 227.16801f, 100.70999f, 211.50201f);
generalPath.lineTo(109.41499f, 196.98701f);
generalPath.curveTo(125.048996f, 219.70401f, 286.18f, 315.38403f, 302.005f, 311.993f);
generalPath.lineTo(293.78f, 326.583f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(107.583f, 195.015f);
generalPath.curveTo(104.5f, 203.315f, 148.713f, 230.648f, 201.909f, 263.002f);
generalPath.curveTo(255.101f, 295.35202f, 300.969f, 315.346f, 304.369f, 312.479f);
generalPath.curveTo(304.576f, 312.109f, 306.041f, 309.587f, 305.90598f, 309.607f);
generalPath.curveTo(305.26898f, 310.567f, 303.718f, 310.871f, 301.29797f, 310.173f);
generalPath.curveTo(286.925f, 306.028f, 249.44197f, 288.823f, 203.02197f, 260.673f);
generalPath.curveTo(156.60197f, 232.521f, 116.21597f, 206.57901f, 109.93897f, 195.556f);
generalPath.curveTo(109.503975f, 194.79199f, 109.19297f, 193.398f, 109.255974f, 192.316f);
generalPath.lineTo(109.10397f, 192.312f);
generalPath.lineTo(107.766975f, 194.649f);
generalPath.lineTo(107.58298f, 195.015f);
generalPath.closePath();
generalPath.moveTo(294.59f, 327.043f);
generalPath.curveTo(294.00598f, 328.1f, 292.91998f, 328.136f, 290.855f, 327.909f);
generalPath.curveTo(277.99802f, 326.485f, 238.98502f, 307.513f, 192.82202f, 279.879f);
generalPath.curveTo(139.10703f, 247.725f, 94.74502f, 218.427f, 99.55802f, 210.769f);
generalPath.lineTo(100.86802f, 208.455f);
generalPath.lineTo(101.12502f, 208.535f);
generalPath.curveTo(96.79802f, 221.51201f, 188.67502f, 274.047f, 194.08502f, 277.39502f);
generalPath.curveTo(247.24503f, 310.33102f, 292.06503f, 329.565f, 296.03003f, 324.565f);
generalPath.lineTo(294.58704f, 327.048f);
generalPath.lineTo(294.58704f, 327.044f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(107.583f, 195.015f);
generalPath.curveTo(104.5f, 203.315f, 148.713f, 230.648f, 201.909f, 263.002f);
generalPath.curveTo(255.101f, 295.35202f, 300.969f, 315.346f, 304.369f, 312.479f);
generalPath.curveTo(304.576f, 312.109f, 306.041f, 309.587f, 305.90598f, 309.607f);
generalPath.curveTo(305.26898f, 310.567f, 303.718f, 310.871f, 301.29797f, 310.173f);
generalPath.curveTo(286.925f, 306.028f, 249.44197f, 288.823f, 203.02197f, 260.673f);
generalPath.curveTo(156.60197f, 232.521f, 116.21597f, 206.57901f, 109.93897f, 195.556f);
generalPath.curveTo(109.503975f, 194.79199f, 109.19297f, 193.398f, 109.255974f, 192.316f);
generalPath.lineTo(109.10397f, 192.312f);
generalPath.lineTo(107.766975f, 194.649f);
generalPath.lineTo(107.58298f, 195.015f);
generalPath.closePath();
generalPath.moveTo(294.59f, 327.043f);
generalPath.curveTo(294.00598f, 328.1f, 292.91998f, 328.136f, 290.855f, 327.909f);
generalPath.curveTo(277.99802f, 326.485f, 238.98502f, 307.513f, 192.82202f, 279.879f);
generalPath.curveTo(139.10703f, 247.725f, 94.74502f, 218.427f, 99.55802f, 210.769f);
generalPath.lineTo(100.86802f, 208.455f);
generalPath.lineTo(101.12502f, 208.535f);
generalPath.curveTo(96.79802f, 221.51201f, 188.67502f, 274.047f, 194.08502f, 277.39502f);
generalPath.curveTo(247.24503f, 310.33102f, 292.06503f, 329.565f, 296.03003f, 324.565f);
generalPath.lineTo(294.58704f, 327.048f);
generalPath.lineTo(294.58704f, 327.044f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.954f, 220.99f);
generalPath.curveTo(239.357f, 220.72f, 281.811f, 216.29001f, 306.244f, 206.552f);
generalPath.lineTo(300.978f, 198.0f);
generalPath.curveTo(286.536f, 205.992f, 243.84799f, 211.248f, 204.66199f, 212.034f);
generalPath.curveTo(158.31198f, 211.608f, 125.597984f, 207.29199f, 109.205986f, 196.29399f);
generalPath.lineTo(104.235985f, 205.4f);
generalPath.curveTo(134.36998f, 218.15f, 165.24799f, 220.86f, 204.95299f, 220.98999f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.954f, 220.99f);
generalPath.curveTo(239.357f, 220.72f, 281.811f, 216.29001f, 306.244f, 206.552f);
generalPath.lineTo(300.978f, 198.0f);
generalPath.curveTo(286.536f, 205.992f, 243.84799f, 211.248f, 204.66199f, 212.034f);
generalPath.curveTo(158.31198f, 211.608f, 125.597984f, 207.29199f, 109.205986f, 196.29399f);
generalPath.lineTo(104.235985f, 205.4f);
generalPath.curveTo(134.36998f, 218.15f, 165.24799f, 220.86f, 204.95299f, 220.98999f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(307.662f, 206.746f);
generalPath.curveTo(306.822f, 208.09f, 290.887f, 213.586f, 267.41498f, 217.64f);
generalPath.curveTo(251.49998f, 220.066f, 230.73997f, 222.14f, 204.83298f, 222.166f);
generalPath.curveTo(180.21898f, 222.189f, 160.11298f, 220.436f, 144.88998f, 218.374f);
generalPath.curveTo(120.249985f, 214.51f, 107.53299f, 209.13399f, 102.831985f, 207.234f);
generalPath.curveTo(103.28198f, 206.34099f, 103.57198f, 205.71399f, 104.00398f, 204.879f);
generalPath.curveTo(117.53798f, 210.267f, 130.31398f, 213.51599f, 145.28198f, 215.819f);
generalPath.curveTo(160.40398f, 217.867f, 180.26797f, 219.644f, 204.75998f, 219.621f);
generalPath.curveTo(230.54698f, 219.595f, 251.07797f, 217.363f, 266.89996f, 215.009f);
generalPath.curveTo(290.96997f, 211.127f, 304.11996f, 206.131f, 305.96497f, 203.809f);
generalPath.lineTo(307.66498f, 206.74501f);
generalPath.lineTo(307.66296f, 206.74501f);
generalPath.closePath();
generalPath.moveTo(303.042f, 198.073f);
generalPath.curveTo(300.432f, 200.168f, 287.434f, 204.778f, 264.56198f, 208.43f);
generalPath.curveTo(249.29999f, 210.618f, 229.89198f, 212.57599f, 205.09698f, 212.59999f);
generalPath.curveTo(181.54099f, 212.62299f, 162.29498f, 211.03499f, 147.65698f, 208.90298f);
generalPath.curveTo(124.429985f, 205.86998f, 112.066986f, 200.39798f, 107.611984f, 198.80298f);
generalPath.curveTo(108.054985f, 198.03598f, 108.50698f, 197.27498f, 108.969986f, 196.51097f);
generalPath.curveTo(112.43799f, 198.25797f, 124.36799f, 203.10097f, 147.91199f, 206.43697f);
generalPath.curveTo(162.38399f, 208.48897f, 181.659f, 210.01697f, 205.09898f, 209.99397f);
generalPath.curveTo(229.77599f, 209.96898f, 248.96198f, 207.97397f, 264.12897f, 205.79697f);
generalPath.curveTo(287.11896f, 202.63397f, 299.48895f, 196.75497f, 301.36597f, 195.28296f);
generalPath.lineTo(303.04196f, 198.07295f);
generalPath.closePath();
generalPath.moveTo(91.985f, 262.44f);
generalPath.curveTo(113.145004f, 273.82f, 160.143f, 279.557f, 204.61801f, 279.95f);
generalPath.curveTo(245.11201f, 280.01602f, 297.868f, 273.69202f, 317.596f, 263.237f);
generalPath.lineTo(317.053f, 251.847f);
generalPath.curveTo(310.881f, 261.491f, 254.34601f, 270.743f, 204.17801f, 270.364f);
generalPath.curveTo(154.01001f, 269.98602f, 107.42401f, 262.237f, 91.89401f, 252.20702f);
generalPath.lineTo(91.98401f, 262.437f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(307.662f, 206.746f);
generalPath.curveTo(306.822f, 208.09f, 290.887f, 213.586f, 267.41498f, 217.64f);
generalPath.curveTo(251.49998f, 220.066f, 230.73997f, 222.14f, 204.83298f, 222.166f);
generalPath.curveTo(180.21898f, 222.189f, 160.11298f, 220.436f, 144.88998f, 218.374f);
generalPath.curveTo(120.249985f, 214.51f, 107.53299f, 209.13399f, 102.831985f, 207.234f);
generalPath.curveTo(103.28198f, 206.34099f, 103.57198f, 205.71399f, 104.00398f, 204.879f);
generalPath.curveTo(117.53798f, 210.267f, 130.31398f, 213.51599f, 145.28198f, 215.819f);
generalPath.curveTo(160.40398f, 217.867f, 180.26797f, 219.644f, 204.75998f, 219.621f);
generalPath.curveTo(230.54698f, 219.595f, 251.07797f, 217.363f, 266.89996f, 215.009f);
generalPath.curveTo(290.96997f, 211.127f, 304.11996f, 206.131f, 305.96497f, 203.809f);
generalPath.lineTo(307.66498f, 206.74501f);
generalPath.lineTo(307.66296f, 206.74501f);
generalPath.closePath();
generalPath.moveTo(303.042f, 198.073f);
generalPath.curveTo(300.432f, 200.168f, 287.434f, 204.778f, 264.56198f, 208.43f);
generalPath.curveTo(249.29999f, 210.618f, 229.89198f, 212.57599f, 205.09698f, 212.59999f);
generalPath.curveTo(181.54099f, 212.62299f, 162.29498f, 211.03499f, 147.65698f, 208.90298f);
generalPath.curveTo(124.429985f, 205.86998f, 112.066986f, 200.39798f, 107.611984f, 198.80298f);
generalPath.curveTo(108.054985f, 198.03598f, 108.50698f, 197.27498f, 108.969986f, 196.51097f);
generalPath.curveTo(112.43799f, 198.25797f, 124.36799f, 203.10097f, 147.91199f, 206.43697f);
generalPath.curveTo(162.38399f, 208.48897f, 181.659f, 210.01697f, 205.09898f, 209.99397f);
generalPath.curveTo(229.77599f, 209.96898f, 248.96198f, 207.97397f, 264.12897f, 205.79697f);
generalPath.curveTo(287.11896f, 202.63397f, 299.48895f, 196.75497f, 301.36597f, 195.28296f);
generalPath.lineTo(303.04196f, 198.07295f);
generalPath.closePath();
generalPath.moveTo(91.985f, 262.44f);
generalPath.curveTo(113.145004f, 273.82f, 160.143f, 279.557f, 204.61801f, 279.95f);
generalPath.curveTo(245.11201f, 280.01602f, 297.868f, 273.69202f, 317.596f, 263.237f);
generalPath.lineTo(317.053f, 251.847f);
generalPath.curveTo(310.881f, 261.491f, 254.34601f, 270.743f, 204.17801f, 270.364f);
generalPath.curveTo(154.01001f, 269.98602f, 107.42401f, 262.237f, 91.89401f, 252.20702f);
generalPath.lineTo(91.98401f, 262.437f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(318.675f, 260.8f);
generalPath.lineTo(318.675f, 263.51797f);
generalPath.curveTo(315.711f, 267.063f, 297.12f, 272.42096f, 273.805f, 276.19498f);
generalPath.curveTo(256.06198f, 278.91498f, 232.92899f, 280.96698f, 204.103f, 280.96698f);
generalPath.curveTo(176.718f, 280.96698f, 154.88f, 279.01498f, 137.943f, 276.41498f);
generalPath.curveTo(111.17299f, 272.51498f, 94.048996f, 265.68997f, 90.61299f, 263.65198f);
generalPath.lineTo(90.62699f, 260.48196f);
generalPath.curveTo(100.95199f, 267.34796f, 128.92699f, 272.36996f, 138.319f, 273.90695f);
generalPath.curveTo(155.144f, 276.48996f, 176.853f, 278.42694f, 204.101f, 278.42694f);
generalPath.curveTo(232.791f, 278.42694f, 255.795f, 276.38895f, 273.427f, 273.68695f);
generalPath.curveTo(290.154f, 271.27097f, 313.982f, 264.98694f, 318.673f, 260.80295f);
generalPath.closePath();
generalPath.moveTo(318.68698f, 251.13998f);
generalPath.lineTo(318.68698f, 253.85599f);
generalPath.curveTo(315.723f, 257.399f, 297.13098f, 262.75598f, 273.817f, 266.53f);
generalPath.curveTo(256.07397f, 269.25f, 232.93999f, 271.303f, 204.11499f, 271.303f);
generalPath.curveTo(176.72899f, 271.303f, 154.89099f, 269.353f, 137.95499f, 266.75f);
generalPath.curveTo(111.18498f, 262.854f, 94.06099f, 256.027f, 90.624985f, 253.99f);
generalPath.lineTo(90.638985f, 250.82f);
generalPath.curveTo(100.96298f, 257.683f, 128.93599f, 262.706f, 138.32898f, 264.24002f);
generalPath.curveTo(155.15498f, 266.82602f, 176.86398f, 268.765f, 204.11298f, 268.765f);
generalPath.curveTo(232.80298f, 268.765f, 255.80698f, 266.725f, 273.43896f, 264.02103f);
generalPath.curveTo(290.16498f, 261.60602f, 313.99396f, 255.32103f, 318.68497f, 251.13803f);
generalPath.lineTo(318.68497f, 251.14003f);
generalPath.closePath();
generalPath.moveTo(204.52197f, 324.62997f);
generalPath.curveTo(155.85696f, 324.33997f, 114.15897f, 311.36496f, 105.351974f, 309.21997f);
generalPath.lineTo(111.77397f, 319.27197f);
generalPath.curveTo(127.32797f, 325.81497f, 168.00797f, 335.56497f, 204.98897f, 334.485f);
generalPath.curveTo(241.96896f, 333.40698f, 274.28897f, 330.542f, 297.06598f, 319.455f);
generalPath.lineTo(303.649f, 309.037f);
generalPath.curveTo(288.129f, 316.347f, 235.305f, 324.55698f, 204.521f, 324.63098f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(318.675f, 260.8f);
generalPath.lineTo(318.675f, 263.51797f);
generalPath.curveTo(315.711f, 267.063f, 297.12f, 272.42096f, 273.805f, 276.19498f);
generalPath.curveTo(256.06198f, 278.91498f, 232.92899f, 280.96698f, 204.103f, 280.96698f);
generalPath.curveTo(176.718f, 280.96698f, 154.88f, 279.01498f, 137.943f, 276.41498f);
generalPath.curveTo(111.17299f, 272.51498f, 94.048996f, 265.68997f, 90.61299f, 263.65198f);
generalPath.lineTo(90.62699f, 260.48196f);
generalPath.curveTo(100.95199f, 267.34796f, 128.92699f, 272.36996f, 138.319f, 273.90695f);
generalPath.curveTo(155.144f, 276.48996f, 176.853f, 278.42694f, 204.101f, 278.42694f);
generalPath.curveTo(232.791f, 278.42694f, 255.795f, 276.38895f, 273.427f, 273.68695f);
generalPath.curveTo(290.154f, 271.27097f, 313.982f, 264.98694f, 318.673f, 260.80295f);
generalPath.closePath();
generalPath.moveTo(318.68698f, 251.13998f);
generalPath.lineTo(318.68698f, 253.85599f);
generalPath.curveTo(315.723f, 257.399f, 297.13098f, 262.75598f, 273.817f, 266.53f);
generalPath.curveTo(256.07397f, 269.25f, 232.93999f, 271.303f, 204.11499f, 271.303f);
generalPath.curveTo(176.72899f, 271.303f, 154.89099f, 269.353f, 137.95499f, 266.75f);
generalPath.curveTo(111.18498f, 262.854f, 94.06099f, 256.027f, 90.624985f, 253.99f);
generalPath.lineTo(90.638985f, 250.82f);
generalPath.curveTo(100.96298f, 257.683f, 128.93599f, 262.706f, 138.32898f, 264.24002f);
generalPath.curveTo(155.15498f, 266.82602f, 176.86398f, 268.765f, 204.11298f, 268.765f);
generalPath.curveTo(232.80298f, 268.765f, 255.80698f, 266.725f, 273.43896f, 264.02103f);
generalPath.curveTo(290.16498f, 261.60602f, 313.99396f, 255.32103f, 318.68497f, 251.13803f);
generalPath.lineTo(318.68497f, 251.14003f);
generalPath.closePath();
generalPath.moveTo(204.52197f, 324.62997f);
generalPath.curveTo(155.85696f, 324.33997f, 114.15897f, 311.36496f, 105.351974f, 309.21997f);
generalPath.lineTo(111.77397f, 319.27197f);
generalPath.curveTo(127.32797f, 325.81497f, 168.00797f, 335.56497f, 204.98897f, 334.485f);
generalPath.curveTo(241.96896f, 333.40698f, 274.28897f, 330.542f, 297.06598f, 319.455f);
generalPath.lineTo(303.649f, 309.037f);
generalPath.curveTo(288.129f, 316.347f, 235.305f, 324.55698f, 204.521f, 324.63098f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(299.538f, 317.12f);
generalPath.curveTo(298.57846f, 318.58954f, 297.59366f, 320.04242f, 296.58398f, 321.478f);
generalPath.curveTo(285.84097f, 325.266f, 268.91397f, 329.243f, 261.771f, 330.40298f);
generalPath.curveTo(247.181f, 333.40997f, 224.607f, 335.62997f, 204.571f, 335.63998f);
generalPath.curveTo(161.461f, 335.00998f, 126.173f, 326.56998f, 109.571f, 319.37f);
generalPath.lineTo(108.231f, 317.068f);
generalPath.lineTo(108.451004f, 316.722f);
generalPath.lineTo(110.72301f, 317.602f);
generalPath.curveTo(140.246f, 328.16498f, 173.40302f, 332.379f, 204.815f, 333.136f);
generalPath.curveTo(224.769f, 333.206f, 244.745f, 330.849f, 260.898f, 327.96f);
generalPath.curveTo(285.668f, 322.99698f, 295.68402f, 319.25598f, 298.758f, 317.56f);
generalPath.lineTo(299.538f, 317.122f);
generalPath.closePath();
generalPath.moveTo(305.246f, 307.706f);
generalPath.curveTo(305.271f, 307.736f, 305.296f, 307.763f, 305.321f, 307.794f);
generalPath.curveTo(304.5859f, 309.03665f, 303.8419f, 310.27402f, 303.08902f, 311.506f);
generalPath.curveTo(297.359f, 313.55402f, 281.80902f, 318.104f, 259.104f, 321.27902f);
generalPath.curveTo(244.144f, 323.316f, 234.84401f, 325.28903f, 205.084f, 325.86902f);
generalPath.curveTo(149.314f, 324.449f, 113.208f, 313.544f, 104.63f, 310.855f);
generalPath.lineTo(103.357994f, 308.415f);
generalPath.curveTo(135.678f, 316.853f, 168.691f, 322.743f, 205.08398f, 323.345f);
generalPath.curveTo(232.31198f, 322.765f, 243.89598f, 320.76f, 258.73398f, 318.737f);
generalPath.curveTo(285.21f, 314.62f, 298.55f, 310.261f, 302.554f, 309.002f);
generalPath.curveTo(302.49887f, 308.92398f, 302.44016f, 308.84854f, 302.378f, 308.776f);
generalPath.lineTo(305.248f, 307.703f);
generalPath.lineTo(305.248f, 307.70502f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.626f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(299.538f, 317.12f);
generalPath.curveTo(298.57846f, 318.58954f, 297.59366f, 320.04242f, 296.58398f, 321.478f);
generalPath.curveTo(285.84097f, 325.266f, 268.91397f, 329.243f, 261.771f, 330.40298f);
generalPath.curveTo(247.181f, 333.40997f, 224.607f, 335.62997f, 204.571f, 335.63998f);
generalPath.curveTo(161.461f, 335.00998f, 126.173f, 326.56998f, 109.571f, 319.37f);
generalPath.lineTo(108.231f, 317.068f);
generalPath.lineTo(108.451004f, 316.722f);
generalPath.lineTo(110.72301f, 317.602f);
generalPath.curveTo(140.246f, 328.16498f, 173.40302f, 332.379f, 204.815f, 333.136f);
generalPath.curveTo(224.769f, 333.206f, 244.745f, 330.849f, 260.898f, 327.96f);
generalPath.curveTo(285.668f, 322.99698f, 295.68402f, 319.25598f, 298.758f, 317.56f);
generalPath.lineTo(299.538f, 317.122f);
generalPath.closePath();
generalPath.moveTo(305.246f, 307.706f);
generalPath.curveTo(305.271f, 307.736f, 305.296f, 307.763f, 305.321f, 307.794f);
generalPath.curveTo(304.5859f, 309.03665f, 303.8419f, 310.27402f, 303.08902f, 311.506f);
generalPath.curveTo(297.359f, 313.55402f, 281.80902f, 318.104f, 259.104f, 321.27902f);
generalPath.curveTo(244.144f, 323.316f, 234.84401f, 325.28903f, 205.084f, 325.86902f);
generalPath.curveTo(149.314f, 324.449f, 113.208f, 313.544f, 104.63f, 310.855f);
generalPath.lineTo(103.357994f, 308.415f);
generalPath.curveTo(135.678f, 316.853f, 168.691f, 322.743f, 205.08398f, 323.345f);
generalPath.curveTo(232.31198f, 322.765f, 243.89598f, 320.76f, 258.73398f, 318.737f);
generalPath.curveTo(285.21f, 314.62f, 298.55f, 310.261f, 302.554f, 309.002f);
generalPath.curveTo(302.49887f, 308.92398f, 302.44016f, 308.84854f, 302.378f, 308.776f);
generalPath.lineTo(305.248f, 307.703f);
generalPath.lineTo(305.248f, 307.70502f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(305.83f, 253.45f);
generalPath.curveTo(305.98798f, 285.465f, 289.60498f, 314.193f, 276.40997f, 326.866f);
generalPath.curveTo(257.73996f, 344.796f, 232.98798f, 356.33f, 204.08197f, 356.862f);
generalPath.curveTo(171.80197f, 357.455f, 141.36697f, 336.412f, 133.20398f, 327.167f);
generalPath.curveTo(117.24398f, 309.093f, 104.24898f, 286.142f, 103.83198f, 255.20999f);
generalPath.curveTo(105.808975f, 220.26999f, 119.52598f, 195.93199f, 139.40797f, 179.24199f);
generalPath.curveTo(159.29097f, 162.55199f, 185.76497f, 154.42398f, 207.81297f, 155.00499f);
generalPath.curveTo(233.25098f, 155.67499f, 262.96597f, 168.15498f, 283.49896f, 192.93f);
generalPath.curveTo(296.94897f, 209.15999f, 302.77496f, 226.776f, 305.82895f, 253.45f);
generalPath.closePath();
generalPath.moveTo(204.356f, 143.837f);
generalPath.curveTo(266.348f, 143.837f, 317.333f, 194.283f, 317.333f, 256.139f);
generalPath.curveTo(317.333f, 317.993f, 266.34802f, 368.44202f, 204.35602f, 368.44202f);
generalPath.curveTo(142.36401f, 368.44202f, 91.80202f, 317.99503f, 91.80202f, 256.14f);
generalPath.curveTo(91.80202f, 194.28401f, 142.36401f, 143.83801f, 204.35602f, 143.83801f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(305.83f, 253.45f);
generalPath.curveTo(305.98798f, 285.465f, 289.60498f, 314.193f, 276.40997f, 326.866f);
generalPath.curveTo(257.73996f, 344.796f, 232.98798f, 356.33f, 204.08197f, 356.862f);
generalPath.curveTo(171.80197f, 357.455f, 141.36697f, 336.412f, 133.20398f, 327.167f);
generalPath.curveTo(117.24398f, 309.093f, 104.24898f, 286.142f, 103.83198f, 255.20999f);
generalPath.curveTo(105.808975f, 220.26999f, 119.52598f, 195.93199f, 139.40797f, 179.24199f);
generalPath.curveTo(159.29097f, 162.55199f, 185.76497f, 154.42398f, 207.81297f, 155.00499f);
generalPath.curveTo(233.25098f, 155.67499f, 262.96597f, 168.15498f, 283.49896f, 192.93f);
generalPath.curveTo(296.94897f, 209.15999f, 302.77496f, 226.776f, 305.82895f, 253.45f);
generalPath.closePath();
generalPath.moveTo(204.356f, 143.837f);
generalPath.curveTo(266.348f, 143.837f, 317.333f, 194.283f, 317.333f, 256.139f);
generalPath.curveTo(317.333f, 317.993f, 266.34802f, 368.44202f, 204.35602f, 368.44202f);
generalPath.curveTo(142.36401f, 368.44202f, 91.80202f, 317.99503f, 91.80202f, 256.14f);
generalPath.curveTo(91.80202f, 194.28401f, 142.36401f, 143.83801f, 204.35602f, 143.83801f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.66f, 143.45f);
generalPath.curveTo(266.706f, 143.45f, 317.31f, 194.06299f, 317.31f, 256.116f);
generalPath.curveTo(317.31f, 318.168f, 266.705f, 368.779f, 204.66f, 368.779f);
generalPath.curveTo(142.61f, 368.779f, 92.006004f, 318.169f, 92.006004f, 256.115f);
generalPath.curveTo(92.006004f, 194.06198f, 142.612f, 143.44998f, 204.659f, 143.44998f);
generalPath.closePath();
generalPath.moveTo(94.484f, 256.117f);
generalPath.curveTo(94.484f, 316.717f, 144.246f, 366.302f, 204.658f, 366.302f);
generalPath.curveTo(265.068f, 366.302f, 314.831f, 316.717f, 314.831f, 256.118f);
generalPath.curveTo(314.831f, 195.518f, 265.068f, 145.932f, 204.65698f, 145.932f);
generalPath.curveTo(144.24399f, 145.932f, 94.48198f, 195.52f, 94.48198f, 256.118f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.66f, 143.45f);
generalPath.curveTo(266.706f, 143.45f, 317.31f, 194.06299f, 317.31f, 256.116f);
generalPath.curveTo(317.31f, 318.168f, 266.705f, 368.779f, 204.66f, 368.779f);
generalPath.curveTo(142.61f, 368.779f, 92.006004f, 318.169f, 92.006004f, 256.115f);
generalPath.curveTo(92.006004f, 194.06198f, 142.612f, 143.44998f, 204.659f, 143.44998f);
generalPath.closePath();
generalPath.moveTo(94.484f, 256.117f);
generalPath.curveTo(94.484f, 316.717f, 144.246f, 366.302f, 204.658f, 366.302f);
generalPath.curveTo(265.068f, 366.302f, 314.831f, 316.717f, 314.831f, 256.118f);
generalPath.curveTo(314.831f, 195.518f, 265.068f, 145.932f, 204.65698f, 145.932f);
generalPath.curveTo(144.24399f, 145.932f, 94.48198f, 195.52f, 94.48198f, 256.118f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.75f, 152.815f);
generalPath.curveTo(261.332f, 152.815f, 307.938f, 199.26001f, 307.938f, 256.015f);
generalPath.curveTo(307.938f, 312.773f, 261.331f, 359.21503f, 204.74998f, 359.21503f);
generalPath.curveTo(148.16798f, 359.21503f, 101.55998f, 312.773f, 101.55998f, 256.015f);
generalPath.curveTo(101.55998f, 199.26001f, 148.16998f, 152.81502f, 204.74998f, 152.81502f);
generalPath.closePath();
generalPath.moveTo(104.04f, 256.015f);
generalPath.curveTo(104.04f, 311.40802f, 149.526f, 356.73502f, 204.75f, 356.73502f);
generalPath.curveTo(259.973f, 356.73502f, 305.46f, 311.40802f, 305.46f, 256.015f);
generalPath.curveTo(305.46f, 200.62102f, 259.974f, 155.29301f, 204.75f, 155.29301f);
generalPath.curveTo(149.526f, 155.29301f, 104.04f, 200.62f, 104.04f, 256.015f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.75f, 152.815f);
generalPath.curveTo(261.332f, 152.815f, 307.938f, 199.26001f, 307.938f, 256.015f);
generalPath.curveTo(307.938f, 312.773f, 261.331f, 359.21503f, 204.74998f, 359.21503f);
generalPath.curveTo(148.16798f, 359.21503f, 101.55998f, 312.773f, 101.55998f, 256.015f);
generalPath.curveTo(101.55998f, 199.26001f, 148.16998f, 152.81502f, 204.74998f, 152.81502f);
generalPath.closePath();
generalPath.moveTo(104.04f, 256.015f);
generalPath.curveTo(104.04f, 311.40802f, 149.526f, 356.73502f, 204.75f, 356.73502f);
generalPath.curveTo(259.973f, 356.73502f, 305.46f, 311.40802f, 305.46f, 256.015f);
generalPath.curveTo(305.46f, 200.62102f, 259.974f, 155.29301f, 204.75f, 155.29301f);
generalPath.curveTo(149.526f, 155.29301f, 104.04f, 200.62f, 104.04f, 256.015f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(209.29f, 142.996f);
generalPath.lineTo(199.635f, 142.996f);
generalPath.lineTo(199.64499f, 369.36798f);
generalPath.lineTo(209.33499f, 369.36798f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(209.29f, 142.996f);
generalPath.lineTo(199.635f, 142.996f);
generalPath.lineTo(199.64499f, 369.36798f);
generalPath.lineTo(209.33499f, 369.36798f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(208.322f, 141.706f);
generalPath.lineTo(210.78f, 141.706f);
generalPath.lineTo(210.8f, 370.68298f);
generalPath.lineTo(208.34f, 370.68298f);
generalPath.lineTo(208.323f, 141.70598f);
generalPath.closePath();
generalPath.moveTo(198.742f, 141.708f);
generalPath.lineTo(201.21701f, 141.708f);
generalPath.lineTo(201.22101f, 370.685f);
generalPath.lineTo(198.74301f, 370.685f);
generalPath.lineTo(198.74301f, 141.708f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(208.322f, 141.706f);
generalPath.lineTo(210.78f, 141.706f);
generalPath.lineTo(210.8f, 370.68298f);
generalPath.lineTo(208.34f, 370.68298f);
generalPath.lineTo(208.323f, 141.70598f);
generalPath.closePath();
generalPath.moveTo(198.742f, 141.708f);
generalPath.lineTo(201.21701f, 141.708f);
generalPath.lineTo(201.22101f, 370.685f);
generalPath.lineTo(198.74301f, 370.685f);
generalPath.lineTo(198.74301f, 141.708f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(317.39f, 260.477f);
generalPath.lineTo(317.39f, 252.107f);
generalPath.lineTo(310.574f, 245.76f);
generalPath.lineTo(271.89f, 235.51999f);
generalPath.lineTo(216.14001f, 229.82999f);
generalPath.lineTo(149.01001f, 233.24399f);
generalPath.lineTo(101.22301f, 244.622f);
generalPath.lineTo(91.575005f, 251.767f);
generalPath.lineTo(91.575005f, 260.137f);
generalPath.lineTo(116.01501f, 249.17299f);
generalPath.lineTo(174.04102f, 240.07098f);
generalPath.lineTo(229.79301f, 240.07098f);
generalPath.lineTo(270.75302f, 244.62299f);
generalPath.lineTo(299.19803f, 251.44998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(317.39f, 260.477f);
generalPath.lineTo(317.39f, 252.107f);
generalPath.lineTo(310.574f, 245.76f);
generalPath.lineTo(271.89f, 235.51999f);
generalPath.lineTo(216.14001f, 229.82999f);
generalPath.lineTo(149.01001f, 233.24399f);
generalPath.lineTo(101.22301f, 244.622f);
generalPath.lineTo(91.575005f, 251.767f);
generalPath.lineTo(91.575005f, 260.137f);
generalPath.lineTo(116.01501f, 249.17299f);
generalPath.lineTo(174.04102f, 240.07098f);
generalPath.lineTo(229.79301f, 240.07098f);
generalPath.lineTo(270.75302f, 244.62299f);
generalPath.lineTo(299.19803f, 251.44998f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.704f, 238.672f);
generalPath.curveTo(231.30899f, 238.622f, 257.122f, 241.192f, 277.596f, 245.179f);
generalPath.curveTo(298.72302f, 249.40201f, 313.592f, 254.685f, 318.67603f, 260.619f);
generalPath.lineTo(318.67f, 263.55698f);
generalPath.curveTo(312.54f, 256.17297f, 292.532f, 250.75897f, 277.12003f, 247.66397f);
generalPath.curveTo(256.80203f, 243.71198f, 231.16202f, 241.15997f, 204.70403f, 241.20897f);
generalPath.curveTo(176.78403f, 241.26097f, 150.78802f, 243.90497f, 130.76703f, 247.81197f);
generalPath.curveTo(114.7f, 251.0f, 93.277f, 257.333f, 90.6f, 263.58f);
generalPath.lineTo(90.6f, 260.52f);
generalPath.curveTo(92.07f, 256.197f, 108.024f, 249.736f, 130.405f, 245.25499f);
generalPath.curveTo(150.577f, 241.32199f, 176.622f, 238.72299f, 204.705f, 238.672f);
generalPath.closePath();
generalPath.moveTo(204.71599f, 229.009f);
generalPath.curveTo(231.31999f, 228.959f, 257.133f, 231.531f, 277.606f, 235.516f);
generalPath.curveTo(298.736f, 239.74101f, 313.603f, 245.02301f, 318.68597f, 250.95601f);
generalPath.lineTo(318.68097f, 253.89601f);
generalPath.curveTo(312.55096f, 246.51201f, 292.54398f, 241.098f, 277.13297f, 238.00401f);
generalPath.curveTo(256.81296f, 234.05002f, 231.17297f, 231.49802f, 204.71696f, 231.54901f);
generalPath.curveTo(176.79697f, 231.59901f, 150.92697f, 234.24501f, 130.90295f, 238.14902f);
generalPath.curveTo(115.399956f, 241.08902f, 93.09895f, 247.67302f, 90.61295f, 253.91902f);
generalPath.lineTo(90.61295f, 250.85902f);
generalPath.curveTo(92.080956f, 246.58102f, 108.357956f, 239.88902f, 130.41696f, 235.59203f);
generalPath.curveTo(150.58896f, 231.65903f, 176.63396f, 229.06203f, 204.71696f, 229.00903f);
generalPath.closePath();
generalPath.moveTo(204.16998f, 179.723f);
generalPath.curveTo(246.09499f, 179.513f, 282.66498f, 185.58601f, 299.396f, 194.156f);
generalPath.lineTo(305.499f, 204.714f);
generalPath.curveTo(290.956f, 196.877f, 251.50299f, 188.728f, 204.229f, 189.946f);
generalPath.curveTo(165.711f, 190.183f, 124.554f, 194.186f, 103.90501f, 205.204f);
generalPath.lineTo(111.19101f, 193.019f);
generalPath.curveTo(128.13802f, 184.229f, 168.10501f, 179.771f, 204.17102f, 179.72499f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.704f, 238.672f);
generalPath.curveTo(231.30899f, 238.622f, 257.122f, 241.192f, 277.596f, 245.179f);
generalPath.curveTo(298.72302f, 249.40201f, 313.592f, 254.685f, 318.67603f, 260.619f);
generalPath.lineTo(318.67f, 263.55698f);
generalPath.curveTo(312.54f, 256.17297f, 292.532f, 250.75897f, 277.12003f, 247.66397f);
generalPath.curveTo(256.80203f, 243.71198f, 231.16202f, 241.15997f, 204.70403f, 241.20897f);
generalPath.curveTo(176.78403f, 241.26097f, 150.78802f, 243.90497f, 130.76703f, 247.81197f);
generalPath.curveTo(114.7f, 251.0f, 93.277f, 257.333f, 90.6f, 263.58f);
generalPath.lineTo(90.6f, 260.52f);
generalPath.curveTo(92.07f, 256.197f, 108.024f, 249.736f, 130.405f, 245.25499f);
generalPath.curveTo(150.577f, 241.32199f, 176.622f, 238.72299f, 204.705f, 238.672f);
generalPath.closePath();
generalPath.moveTo(204.71599f, 229.009f);
generalPath.curveTo(231.31999f, 228.959f, 257.133f, 231.531f, 277.606f, 235.516f);
generalPath.curveTo(298.736f, 239.74101f, 313.603f, 245.02301f, 318.68597f, 250.95601f);
generalPath.lineTo(318.68097f, 253.89601f);
generalPath.curveTo(312.55096f, 246.51201f, 292.54398f, 241.098f, 277.13297f, 238.00401f);
generalPath.curveTo(256.81296f, 234.05002f, 231.17297f, 231.49802f, 204.71696f, 231.54901f);
generalPath.curveTo(176.79697f, 231.59901f, 150.92697f, 234.24501f, 130.90295f, 238.14902f);
generalPath.curveTo(115.399956f, 241.08902f, 93.09895f, 247.67302f, 90.61295f, 253.91902f);
generalPath.lineTo(90.61295f, 250.85902f);
generalPath.curveTo(92.080956f, 246.58102f, 108.357956f, 239.88902f, 130.41696f, 235.59203f);
generalPath.curveTo(150.58896f, 231.65903f, 176.63396f, 229.06203f, 204.71696f, 229.00903f);
generalPath.closePath();
generalPath.moveTo(204.16998f, 179.723f);
generalPath.curveTo(246.09499f, 179.513f, 282.66498f, 185.58601f, 299.396f, 194.156f);
generalPath.lineTo(305.499f, 204.714f);
generalPath.curveTo(290.956f, 196.877f, 251.50299f, 188.728f, 204.229f, 189.946f);
generalPath.curveTo(165.711f, 190.183f, 124.554f, 194.186f, 103.90501f, 205.204f);
generalPath.lineTo(111.19101f, 193.019f);
generalPath.curveTo(128.13802f, 184.229f, 168.10501f, 179.771f, 204.17102f, 179.72499f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.727f, 188.44f);
generalPath.curveTo(228.64f, 188.375f, 251.74701f, 189.724f, 270.122f, 193.04001f);
generalPath.curveTo(287.23502f, 196.225f, 303.555f, 201.005f, 305.889f, 203.576f);
generalPath.lineTo(307.69702f, 206.77301f);
generalPath.curveTo(302.02203f, 203.06702f, 287.89902f, 198.94101f, 269.765f, 195.503f);
generalPath.curveTo(251.55502f, 192.07901f, 228.46301f, 190.945f, 204.68501f, 191.00801f);
generalPath.curveTo(177.695f, 190.91501f, 156.725f, 192.34001f, 138.72801f, 195.47801f);
generalPath.curveTo(119.694016f, 199.03801f, 106.48801f, 204.128f, 103.23201f, 206.544f);
generalPath.lineTo(105.00501f, 203.164f);
generalPath.curveTo(111.335014f, 199.934f, 121.377014f, 196.044f, 138.255f, 193.004f);
generalPath.curveTo(156.865f, 189.604f, 178.057f, 188.584f, 204.727f, 188.439f);
generalPath.lineTo(204.725f, 188.439f);
generalPath.closePath();
generalPath.moveTo(204.71701f, 178.785f);
generalPath.curveTo(227.60101f, 178.725f, 250.197f, 180.001f, 267.80902f, 183.167f);
generalPath.curveTo(281.69904f, 185.871f, 295.43604f, 190.093f, 300.467f, 193.84901f);
generalPath.lineTo(303.113f, 198.05301f);
generalPath.curveTo(298.613f, 193.05301f, 281.681f, 188.313f, 266.733f, 185.66f);
generalPath.curveTo(249.256f, 182.647f, 227.599f, 181.45401f, 204.715f, 181.263f);
generalPath.curveTo(180.69899f, 181.33f, 158.505f, 182.801f, 141.282f, 185.937f);
generalPath.curveTo(124.852f, 189.064f, 114.248f, 192.767f, 109.76199f, 195.657f);
generalPath.lineTo(112.089f, 192.145f);
generalPath.curveTo(118.279f, 188.88501f, 128.282f, 185.892f, 140.879f, 183.445f);
generalPath.curveTo(158.229f, 180.285f, 180.55899f, 178.85301f, 204.716f, 178.785f);
generalPath.closePath();
generalPath.moveTo(260.683f, 302.945f);
generalPath.curveTo(239.95502f, 299.075f, 219.18901f, 298.513f, 204.68501f, 298.685f);
generalPath.curveTo(134.81702f, 299.503f, 112.24701f, 313.03f, 109.49301f, 317.125f);
generalPath.lineTo(104.27101f, 308.615f);
generalPath.curveTo(122.06101f, 295.72098f, 160.10602f, 288.49f, 205.06401f, 289.22998f);
generalPath.curveTo(228.40901f, 289.61197f, 248.55402f, 291.162f, 265.502f, 294.44498f);
generalPath.lineTo(260.682f, 302.947f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.727f, 188.44f);
generalPath.curveTo(228.64f, 188.375f, 251.74701f, 189.724f, 270.122f, 193.04001f);
generalPath.curveTo(287.23502f, 196.225f, 303.555f, 201.005f, 305.889f, 203.576f);
generalPath.lineTo(307.69702f, 206.77301f);
generalPath.curveTo(302.02203f, 203.06702f, 287.89902f, 198.94101f, 269.765f, 195.503f);
generalPath.curveTo(251.55502f, 192.07901f, 228.46301f, 190.945f, 204.68501f, 191.00801f);
generalPath.curveTo(177.695f, 190.91501f, 156.725f, 192.34001f, 138.72801f, 195.47801f);
generalPath.curveTo(119.694016f, 199.03801f, 106.48801f, 204.128f, 103.23201f, 206.544f);
generalPath.lineTo(105.00501f, 203.164f);
generalPath.curveTo(111.335014f, 199.934f, 121.377014f, 196.044f, 138.255f, 193.004f);
generalPath.curveTo(156.865f, 189.604f, 178.057f, 188.584f, 204.727f, 188.439f);
generalPath.lineTo(204.725f, 188.439f);
generalPath.closePath();
generalPath.moveTo(204.71701f, 178.785f);
generalPath.curveTo(227.60101f, 178.725f, 250.197f, 180.001f, 267.80902f, 183.167f);
generalPath.curveTo(281.69904f, 185.871f, 295.43604f, 190.093f, 300.467f, 193.84901f);
generalPath.lineTo(303.113f, 198.05301f);
generalPath.curveTo(298.613f, 193.05301f, 281.681f, 188.313f, 266.733f, 185.66f);
generalPath.curveTo(249.256f, 182.647f, 227.599f, 181.45401f, 204.715f, 181.263f);
generalPath.curveTo(180.69899f, 181.33f, 158.505f, 182.801f, 141.282f, 185.937f);
generalPath.curveTo(124.852f, 189.064f, 114.248f, 192.767f, 109.76199f, 195.657f);
generalPath.lineTo(112.089f, 192.145f);
generalPath.curveTo(118.279f, 188.88501f, 128.282f, 185.892f, 140.879f, 183.445f);
generalPath.curveTo(158.229f, 180.285f, 180.55899f, 178.85301f, 204.716f, 178.785f);
generalPath.closePath();
generalPath.moveTo(260.683f, 302.945f);
generalPath.curveTo(239.95502f, 299.075f, 219.18901f, 298.513f, 204.68501f, 298.685f);
generalPath.curveTo(134.81702f, 299.503f, 112.24701f, 313.03f, 109.49301f, 317.125f);
generalPath.lineTo(104.27101f, 308.615f);
generalPath.curveTo(122.06101f, 295.72098f, 160.10602f, 288.49f, 205.06401f, 289.22998f);
generalPath.curveTo(228.40901f, 289.61197f, 248.55402f, 291.162f, 265.502f, 294.44498f);
generalPath.lineTo(260.682f, 302.947f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.283f, 297.483f);
generalPath.curveTo(223.71901f, 297.773f, 242.796f, 298.576f, 261.21f, 302.01f);
generalPath.lineTo(259.87598f, 304.364f);
generalPath.curveTo(242.77397f, 301.207f, 224.54198f, 299.99902f, 204.34897f, 300.09702f);
generalPath.curveTo(178.56297f, 299.897f, 152.48297f, 302.30402f, 129.77698f, 308.82f);
generalPath.curveTo(122.612976f, 310.814f, 110.751976f, 315.42f, 109.54298f, 319.226f);
generalPath.lineTo(108.21597f, 317.039f);
generalPath.curveTo(108.598976f, 314.789f, 115.765976f, 310.119f, 129.16597f, 306.354f);
generalPath.curveTo(155.17596f, 298.906f, 179.50098f, 297.651f, 204.28197f, 297.48f);
generalPath.lineTo(204.28197f, 297.484f);
generalPath.closePath();
generalPath.moveTo(205.16501f, 287.703f);
generalPath.curveTo(225.302f, 288.079f, 246.09702f, 289.01f, 266.30902f, 293.013f);
generalPath.lineTo(264.919f, 295.463f);
generalPath.curveTo(246.667f, 291.841f, 229.229f, 290.63303f, 205.283f, 290.265f);
generalPath.curveTo(179.416f, 290.312f, 151.977f, 292.15503f, 127.02901f, 299.40903f);
generalPath.curveTo(118.97401f, 301.75403f, 105.073006f, 306.82703f, 104.60901f, 310.84302f);
generalPath.lineTo(103.28401f, 308.493f);
generalPath.curveTo(103.58601f, 304.845f, 115.61901f, 300.087f, 126.446014f, 296.937f);
generalPath.curveTo(151.58601f, 289.627f, 179.09601f, 287.74902f, 205.16602f, 287.70203f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.626f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.283f, 297.483f);
generalPath.curveTo(223.71901f, 297.773f, 242.796f, 298.576f, 261.21f, 302.01f);
generalPath.lineTo(259.87598f, 304.364f);
generalPath.curveTo(242.77397f, 301.207f, 224.54198f, 299.99902f, 204.34897f, 300.09702f);
generalPath.curveTo(178.56297f, 299.897f, 152.48297f, 302.30402f, 129.77698f, 308.82f);
generalPath.curveTo(122.612976f, 310.814f, 110.751976f, 315.42f, 109.54298f, 319.226f);
generalPath.lineTo(108.21597f, 317.039f);
generalPath.curveTo(108.598976f, 314.789f, 115.765976f, 310.119f, 129.16597f, 306.354f);
generalPath.curveTo(155.17596f, 298.906f, 179.50098f, 297.651f, 204.28197f, 297.48f);
generalPath.lineTo(204.28197f, 297.484f);
generalPath.closePath();
generalPath.moveTo(205.16501f, 287.703f);
generalPath.curveTo(225.302f, 288.079f, 246.09702f, 289.01f, 266.30902f, 293.013f);
generalPath.lineTo(264.919f, 295.463f);
generalPath.curveTo(246.667f, 291.841f, 229.229f, 290.63303f, 205.283f, 290.265f);
generalPath.curveTo(179.416f, 290.312f, 151.977f, 292.15503f, 127.02901f, 299.40903f);
generalPath.curveTo(118.97401f, 301.75403f, 105.073006f, 306.82703f, 104.60901f, 310.84302f);
generalPath.lineTo(103.28401f, 308.493f);
generalPath.curveTo(103.58601f, 304.845f, 115.61901f, 300.087f, 126.446014f, 296.937f);
generalPath.curveTo(151.58601f, 289.627f, 179.09601f, 287.74902f, 205.16602f, 287.70203f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(304.408f, 309.908f);
generalPath.lineTo(296.012f, 322.934f);
generalPath.lineTo(271.88998f, 301.511f);
generalPath.lineTo(209.31198f, 259.414f);
generalPath.lineTo(138.76999f, 220.73001f);
generalPath.lineTo(102.14499f, 208.20201f);

}

private void _paint1(Graphics2D g,float origAlpha) {
generalPath.lineTo(109.94999f, 193.729f);
generalPath.lineTo(112.59999f, 192.283f);
generalPath.lineTo(135.357f, 197.973f);
generalPath.lineTo(210.45f, 236.65701f);
generalPath.lineTo(253.685f, 263.963f);
generalPath.lineTo(290.095f, 290.13303f);
generalPath.lineTo(304.885f, 307.19904f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(304.408f, 309.908f);
generalPath.lineTo(296.012f, 322.934f);
generalPath.lineTo(271.88998f, 301.511f);
generalPath.lineTo(209.31198f, 259.414f);
generalPath.lineTo(138.76999f, 220.73001f);
generalPath.lineTo(102.14499f, 208.20201f);
generalPath.lineTo(109.94999f, 193.729f);
generalPath.lineTo(112.59999f, 192.283f);
generalPath.lineTo(135.357f, 197.973f);
generalPath.lineTo(210.45f, 236.65701f);
generalPath.lineTo(253.685f, 263.963f);
generalPath.lineTo(290.095f, 290.13303f);
generalPath.lineTo(304.885f, 307.19904f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(100.825f, 208.543f);
generalPath.curveTo(107.24899f, 204.186f, 154.459f, 225.217f, 203.857f, 255.00299f);
generalPath.curveTo(253.12299f, 284.875f, 300.2f, 318.629f, 295.951f, 324.94598f);
generalPath.lineTo(294.554f, 327.14398f);
generalPath.lineTo(293.91397f, 327.65f);
generalPath.curveTo(294.04996f, 327.552f, 294.75797f, 326.686f, 293.84396f, 324.344f);
generalPath.curveTo(291.74396f, 317.43698f, 258.34998f, 290.78998f, 202.94196f, 257.33398f);
generalPath.curveTo(148.92696f, 225.124f, 103.90896f, 205.71198f, 99.40796f, 211.26099f);
generalPath.lineTo(100.82796f, 208.54399f);
generalPath.lineTo(100.82596f, 208.54399f);
generalPath.closePath();
generalPath.moveTo(306.125f, 309.723f);
generalPath.curveTo(310.188f, 301.699f, 266.399f, 268.71298f, 212.10901f, 236.595f);
generalPath.curveTo(156.569f, 205.117f, 116.54101f, 186.589f, 109.22901f, 192.115f);
generalPath.lineTo(107.60501f, 195.071f);
generalPath.curveTo(107.59101f, 195.235f, 107.66501f, 194.871f, 108.00801f, 194.605f);
generalPath.curveTo(109.33601f, 193.44499f, 111.54001f, 193.525f, 112.53401f, 193.50499f);
generalPath.curveTo(125.12401f, 193.69499f, 161.08002f, 210.241f, 211.52802f, 239.16199f);
generalPath.curveTo(233.63202f, 252.03699f, 304.906f, 297.749f, 304.63403f, 310.602f);
generalPath.curveTo(304.65402f, 311.70798f, 304.72604f, 311.936f, 304.31003f, 312.482f);
generalPath.lineTo(306.12302f, 309.725f);
generalPath.lineTo(306.12302f, 309.723f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(100.825f, 208.543f);
generalPath.curveTo(107.24899f, 204.186f, 154.459f, 225.217f, 203.857f, 255.00299f);
generalPath.curveTo(253.12299f, 284.875f, 300.2f, 318.629f, 295.951f, 324.94598f);
generalPath.lineTo(294.554f, 327.14398f);
generalPath.lineTo(293.91397f, 327.65f);
generalPath.curveTo(294.04996f, 327.552f, 294.75797f, 326.686f, 293.84396f, 324.344f);
generalPath.curveTo(291.74396f, 317.43698f, 258.34998f, 290.78998f, 202.94196f, 257.33398f);
generalPath.curveTo(148.92696f, 225.124f, 103.90896f, 205.71198f, 99.40796f, 211.26099f);
generalPath.lineTo(100.82796f, 208.54399f);
generalPath.lineTo(100.82596f, 208.54399f);
generalPath.closePath();
generalPath.moveTo(306.125f, 309.723f);
generalPath.curveTo(310.188f, 301.699f, 266.399f, 268.71298f, 212.10901f, 236.595f);
generalPath.curveTo(156.569f, 205.117f, 116.54101f, 186.589f, 109.22901f, 192.115f);
generalPath.lineTo(107.60501f, 195.071f);
generalPath.curveTo(107.59101f, 195.235f, 107.66501f, 194.871f, 108.00801f, 194.605f);
generalPath.curveTo(109.33601f, 193.44499f, 111.54001f, 193.525f, 112.53401f, 193.50499f);
generalPath.curveTo(125.12401f, 193.69499f, 161.08002f, 210.241f, 211.52802f, 239.16199f);
generalPath.curveTo(233.63202f, 252.03699f, 304.906f, 297.749f, 304.63403f, 310.602f);
generalPath.curveTo(304.65402f, 311.70798f, 304.72604f, 311.936f, 304.31003f, 312.482f);
generalPath.lineTo(306.12302f, 309.725f);
generalPath.lineTo(306.12302f, 309.723f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.137779951095581f, 0.0f, 0.0f, 1.137779951095581f, -68.30599975585938f, 28.444000244140625f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(180.6f, 211.01f);
generalPath.curveTo(180.6f, 227.28f, 187.263f, 241.997f, 198.057f, 252.752f);
generalPath.curveTo(208.87201f, 263.53f, 223.569f, 270.332f, 239.867f, 270.332f);
generalPath.curveTo(256.247f, 270.332f, 271.113f, 263.678f, 281.88202f, 252.942f);
generalPath.curveTo(292.652f, 242.207f, 299.325f, 227.39f, 299.328f, 211.062f);
generalPath.lineTo(299.326f, 211.062f);
generalPath.lineTo(299.326f, 131.872f);
generalPath.lineTo(180.586f, 131.732f);
generalPath.lineTo(180.59799f, 211.01f);
generalPath.lineTo(180.59999f, 211.01f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.67f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(180.6f, 211.01f);
generalPath.curveTo(180.6f, 227.28f, 187.263f, 241.997f, 198.057f, 252.752f);
generalPath.curveTo(208.87201f, 263.53f, 223.569f, 270.332f, 239.867f, 270.332f);
generalPath.curveTo(256.247f, 270.332f, 271.113f, 263.678f, 281.88202f, 252.942f);
generalPath.curveTo(292.652f, 242.207f, 299.325f, 227.39f, 299.328f, 211.062f);
generalPath.lineTo(299.326f, 211.062f);
generalPath.lineTo(299.326f, 131.872f);
generalPath.lineTo(180.586f, 131.732f);
generalPath.lineTo(180.59799f, 211.01f);
generalPath.lineTo(180.59999f, 211.01f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(182.82f, 211.12f);
generalPath.lineTo(182.82f, 211.165f);
generalPath.curveTo(182.82f, 226.722f, 189.26001f, 240.88899f, 199.595f, 251.17499f);
generalPath.curveTo(209.949f, 261.47897f, 224.209f, 267.88498f, 239.809f, 267.88498f);
generalPath.curveTo(255.48901f, 267.88498f, 269.719f, 261.525f, 280.029f, 251.25998f);
generalPath.curveTo(290.339f, 240.99498f, 296.727f, 226.82698f, 296.729f, 211.21597f);
generalPath.lineTo(296.727f, 211.21597f);
generalPath.lineTo(296.727f, 134.39f);
generalPath.lineTo(182.887f, 134.37f);
generalPath.lineTo(182.81699f, 211.12f);
generalPath.moveTo(273.839f, 157.372f);
generalPath.lineTo(273.843f, 206.262f);
generalPath.lineTo(273.80298f, 211.435f);
generalPath.curveTo(273.80298f, 212.795f, 273.72098f, 214.347f, 273.563f, 215.668f);
generalPath.curveTo(272.637f, 223.398f, 269.08298f, 230.135f, 263.817f, 235.376f);
generalPath.curveTo(257.65298f, 241.51201f, 249.14699f, 245.31801f, 239.76999f, 245.31801f);
generalPath.curveTo(230.44398f, 245.31801f, 222.13199f, 241.38f, 215.94199f, 235.218f);
generalPath.curveTo(209.59198f, 228.898f, 205.91199f, 220.232f, 205.91199f, 211.271f);
generalPath.lineTo(205.89899f, 157.249f);
generalPath.lineTo(273.839f, 157.37099f);
generalPath.lineTo(273.839f, 157.37299f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 0, 0, 255)) : new Color(255, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.507f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(182.82f, 211.12f);
generalPath.lineTo(182.82f, 211.165f);
generalPath.curveTo(182.82f, 226.722f, 189.26001f, 240.88899f, 199.595f, 251.17499f);
generalPath.curveTo(209.949f, 261.47897f, 224.209f, 267.88498f, 239.809f, 267.88498f);
generalPath.curveTo(255.48901f, 267.88498f, 269.719f, 261.525f, 280.029f, 251.25998f);
generalPath.curveTo(290.339f, 240.99498f, 296.727f, 226.82698f, 296.729f, 211.21597f);
generalPath.lineTo(296.727f, 211.21597f);
generalPath.lineTo(296.727f, 134.39f);
generalPath.lineTo(182.887f, 134.37f);
generalPath.lineTo(182.81699f, 211.12f);
generalPath.moveTo(273.839f, 157.372f);
generalPath.lineTo(273.843f, 206.262f);
generalPath.lineTo(273.80298f, 211.435f);
generalPath.curveTo(273.80298f, 212.795f, 273.72098f, 214.347f, 273.563f, 215.668f);
generalPath.curveTo(272.637f, 223.398f, 269.08298f, 230.135f, 263.817f, 235.376f);
generalPath.curveTo(257.65298f, 241.51201f, 249.14699f, 245.31801f, 239.76999f, 245.31801f);
generalPath.curveTo(230.44398f, 245.31801f, 222.13199f, 241.38f, 215.94199f, 235.218f);
generalPath.curveTo(209.59198f, 228.898f, 205.91199f, 220.232f, 205.91199f, 211.271f);
generalPath.lineTo(205.89899f, 157.249f);
generalPath.lineTo(273.839f, 157.37099f);
generalPath.lineTo(273.839f, 157.37299f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.19f, 154.43f);
generalPath.curveTo(190.325f, 148.90999f, 194.242f, 147.60199f, 194.27f, 147.583f);
generalPath.curveTo(194.3f, 147.56299f, 198.502f, 148.98999f, 198.488f, 154.48099f);
generalPath.lineTo(190.19f, 154.43098f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_2_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
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
// _0_3_2_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_2_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
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
// _0_3_2_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9f, 140.61f);
generalPath.curveTo(193.874f, 139.983f, 194.777f, 139.976f, 194.76599f, 140.61f);
generalPath.lineTo(194.76599f, 142.146f);
generalPath.lineTo(193.9f, 142.146f);
generalPath.lineTo(193.9f, 140.61f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_2_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 46.31999969482422f));
// _0_3_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.19f, 154.43f);
generalPath.curveTo(190.325f, 148.90999f, 194.242f, 147.60199f, 194.27f, 147.583f);
generalPath.curveTo(194.3f, 147.56299f, 198.502f, 148.98999f, 198.488f, 154.48099f);
generalPath.lineTo(190.19f, 154.43098f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_2_1_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
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
// _0_3_2_1_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}

}

private void _paint2(Graphics2D g,float origAlpha) {
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_2_1_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
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
// _0_3_2_1_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9f, 140.61f);
generalPath.curveTo(193.874f, 139.983f, 194.777f, 139.976f, 194.76599f, 140.61f);
generalPath.lineTo(194.76599f, 142.146f);
generalPath.lineTo(193.9f, 142.146f);
generalPath.lineTo(193.9f, 140.61f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_2_1_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.704609445000542f, -0.7095953283499182f, 0.7095953283499182f, 0.704609445000542f, -35.34187619637483f, 275.10876704308373f));
// _0_3_2_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.19f, 154.43f);
generalPath.curveTo(190.325f, 148.90999f, 194.242f, 147.60199f, 194.27f, 147.583f);
generalPath.curveTo(194.3f, 147.56299f, 198.502f, 148.98999f, 198.488f, 154.48099f);
generalPath.lineTo(190.19f, 154.43098f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_2_2_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
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
// _0_3_2_2_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_2_2_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
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
// _0_3_2_2_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9f, 140.61f);
generalPath.curveTo(193.874f, 139.983f, 194.777f, 139.976f, 194.76599f, 140.61f);
generalPath.lineTo(194.76599f, 142.146f);
generalPath.lineTo(193.9f, 142.146f);
generalPath.lineTo(193.9f, 140.61f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_2_2_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 45.7140007019043f, 0.0f));
// _0_3_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.19f, 154.43f);
generalPath.curveTo(190.325f, 148.90999f, 194.242f, 147.60199f, 194.27f, 147.583f);
generalPath.curveTo(194.3f, 147.56299f, 198.502f, 148.98999f, 198.488f, 154.48099f);
generalPath.lineTo(190.19f, 154.43098f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_3_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
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
// _0_3_3_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_3_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);

}

private void _paint3(Graphics2D g,float origAlpha) {
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9f, 140.61f);
generalPath.curveTo(193.874f, 139.983f, 194.777f, 139.976f, 194.76599f, 140.61f);
generalPath.lineTo(194.76599f, 142.146f);
generalPath.lineTo(193.9f, 142.146f);
generalPath.lineTo(193.9f, 140.61f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_3_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 479.7919921875f, 0.0f));
// _0_3_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.19f, 154.43f);
generalPath.curveTo(190.325f, 148.90999f, 194.242f, 147.60199f, 194.27f, 147.583f);
generalPath.curveTo(194.3f, 147.56299f, 198.502f, 148.98999f, 198.488f, 154.48099f);
generalPath.lineTo(190.19f, 154.43098f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_4_0_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
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
// _0_3_4_0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_4_0_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
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
// _0_3_4_0_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9f, 140.61f);
generalPath.curveTo(193.874f, 139.983f, 194.777f, 139.976f, 194.76599f, 140.61f);
generalPath.lineTo(194.76599f, 142.146f);
generalPath.lineTo(193.9f, 142.146f);
generalPath.lineTo(193.9f, 140.61f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_4_0_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 46.31999969482422f));
// _0_3_4_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.19f, 154.43f);
generalPath.curveTo(190.325f, 148.90999f, 194.242f, 147.60199f, 194.27f, 147.583f);
generalPath.curveTo(194.3f, 147.56299f, 198.502f, 148.98999f, 198.488f, 154.48099f);
generalPath.lineTo(190.19f, 154.43098f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_4_0_1_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
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
// _0_3_4_0_1_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_4_0_1_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
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
// _0_3_4_0_1_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9f, 140.61f);
generalPath.curveTo(193.874f, 139.983f, 194.777f, 139.976f, 194.76599f, 140.61f);
generalPath.lineTo(194.76599f, 142.146f);
generalPath.lineTo(193.9f, 142.146f);
generalPath.lineTo(193.9f, 140.61f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_4_0_1_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.704609445000542f, -0.7095953283499182f, 0.7095953283499182f, 0.704609445000542f, -35.34187619637483f, 275.10876704308373f));
// _0_3_4_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}

}

private void _paint4(Graphics2D g,float origAlpha) {
generalPath.moveTo(190.19f, 154.43f);
generalPath.curveTo(190.325f, 148.90999f, 194.242f, 147.60199f, 194.27f, 147.583f);
generalPath.curveTo(194.3f, 147.56299f, 198.502f, 148.98999f, 198.488f, 154.48099f);
generalPath.lineTo(190.19f, 154.43098f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81f, 147.69f);
generalPath.lineTo(186.12799f, 154.035f);
generalPath.lineTo(190.26799f, 154.045f);
generalPath.curveTo(190.30798f, 148.795f, 194.243f, 147.921f, 194.338f, 147.941f);
generalPath.curveTo(194.428f, 147.937f, 198.328f, 149.101f, 198.431f, 154.045f);
generalPath.lineTo(202.583f, 154.045f);
generalPath.lineTo(201.833f, 147.651f);
generalPath.lineTo(186.81099f, 147.689f);
generalPath.lineTo(186.81099f, 147.691f);
generalPath.closePath();
generalPath.moveTo(185.84999f, 154.06f);
generalPath.lineTo(202.79599f, 154.06f);
generalPath.curveTo(203.15298f, 154.06f, 203.44598f, 154.413f, 203.44598f, 154.844f);
generalPath.curveTo(203.44598f, 155.27399f, 203.15298f, 155.624f, 202.79599f, 155.624f);
generalPath.lineTo(185.85f, 155.624f);
generalPath.curveTo(185.49301f, 155.624f, 185.20001f, 155.27399f, 185.20001f, 154.844f);
generalPath.curveTo(185.20001f, 154.414f, 185.49301f, 154.06f, 185.85f, 154.06f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01f, 154.03f);
generalPath.curveTo(192.028f, 150.717f, 194.27199f, 149.78f, 194.284f, 149.782f);
generalPath.curveTo(194.284f, 149.782f, 196.62599f, 150.748f, 196.644f, 154.03f);
generalPath.lineTo(192.01f, 154.03f);
generalPath.moveTo(186.20999f, 145.05f);
generalPath.lineTo(202.45499f, 145.05f);
generalPath.curveTo(202.79698f, 145.05f, 203.07799f, 145.368f, 203.07799f, 145.755f);
generalPath.curveTo(203.07799f, 146.142f, 202.79799f, 146.459f, 202.45499f, 146.459f);
generalPath.lineTo(186.21f, 146.459f);
generalPath.curveTo(185.86801f, 146.459f, 185.587f, 146.143f, 185.587f, 145.754f);
generalPath.curveTo(185.587f, 145.367f, 185.867f, 145.049f, 186.21f, 145.049f);
generalPath.closePath();
generalPath.moveTo(186.54999f, 146.47f);
generalPath.lineTo(202.08798f, 146.47f);
generalPath.curveTo(202.41498f, 146.47f, 202.68298f, 146.787f, 202.68298f, 147.174f);
generalPath.curveTo(202.68298f, 147.562f, 202.41498f, 147.87799f, 202.08798f, 147.87799f);
generalPath.lineTo(186.55f, 147.87799f);
generalPath.curveTo(186.223f, 147.87799f, 185.955f, 147.562f, 185.955f, 147.174f);
generalPath.curveTo(185.955f, 146.787f, 186.223f, 146.47f, 186.55f, 146.47f);
generalPath.closePath();
generalPath.moveTo(191.56999f, 135.88f);
generalPath.lineTo(192.797f, 135.882f);
generalPath.lineTo(192.797f, 136.752f);
generalPath.lineTo(193.692f, 136.752f);
generalPath.lineTo(193.692f, 135.862f);
generalPath.lineTo(194.949f, 135.867f);
generalPath.lineTo(194.949f, 136.754f);
generalPath.lineTo(195.845f, 136.754f);
generalPath.lineTo(195.845f, 135.864f);
generalPath.lineTo(197.103f, 135.864f);
generalPath.lineTo(197.101f, 137.874f);
generalPath.curveTo(197.101f, 138.191f, 196.847f, 138.394f, 196.551f, 138.394f);
generalPath.lineTo(192.14099f, 138.394f);
generalPath.curveTo(191.84499f, 138.394f, 191.57098f, 138.158f, 191.57098f, 137.869f);
generalPath.lineTo(191.56699f, 135.879f);
generalPath.closePath();
generalPath.moveTo(196.18999f, 138.57f);
generalPath.lineTo(196.46698f, 145.02f);
generalPath.lineTo(192.16399f, 145.005f);
generalPath.lineTo(192.44899f, 138.55301f);
generalPath.lineTo(196.189f, 138.57f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_4_0_2_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94f, 141.56f);
generalPath.lineTo(191.07f, 145.038f);
generalPath.lineTo(186.94601f, 145.038f);
generalPath.lineTo(187.06201f, 141.56f);
generalPath.lineTo(190.94202f, 141.56f);
generalPath.lineTo(190.94002f, 141.56f);
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
// _0_3_4_0_2_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_4_0_2_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 0, 255)) : new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3f, 139.04f);
generalPath.lineTo(187.5f, 139.043f);
generalPath.lineTo(187.5f, 139.915f);
generalPath.lineTo(188.377f, 139.915f);
generalPath.lineTo(188.377f, 139.023f);
generalPath.lineTo(189.607f, 139.027f);
generalPath.lineTo(189.607f, 139.91699f);
generalPath.lineTo(190.487f, 139.91699f);
generalPath.lineTo(190.487f, 139.023f);
generalPath.lineTo(191.717f, 139.025f);
generalPath.lineTo(191.71399f, 141.03699f);
generalPath.curveTo(191.71399f, 141.35098f, 191.46399f, 141.555f, 191.178f, 141.555f);
generalPath.lineTo(186.861f, 141.555f);
generalPath.curveTo(186.571f, 141.555f, 186.303f, 141.31999f, 186.303f, 141.03f);
generalPath.lineTo(186.29999f, 139.04f);
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
// _0_3_4_0_2_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9f, 140.61f);
generalPath.curveTo(193.874f, 139.983f, 194.777f, 139.976f, 194.76599f, 140.61f);
generalPath.lineTo(194.76599f, 142.146f);
generalPath.lineTo(193.9f, 142.146f);
generalPath.lineTo(193.9f, 140.61f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_4_0_2_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57f, 142.84f);
generalPath.curveTo(188.567f, 142.234f, 189.40701f, 142.222f, 189.39601f, 142.84f);
generalPath.lineTo(189.39601f, 144.027f);
generalPath.lineTo(188.57f, 144.027f);
generalPath.lineTo(188.57f, 142.84f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(232.636f, 202.406f);
generalPath.lineTo(232.636f, 202.41101f);
generalPath.curveTo(232.62772f, 204.51907f, 233.41805f, 206.55208f, 234.848f, 208.10101f);
generalPath.curveTo(236.21301f, 209.56801f, 238.093f, 210.47902f, 240.15001f, 210.47902f);
generalPath.curveTo(242.21701f, 210.47902f, 244.09401f, 209.57402f, 245.453f, 208.11401f);
generalPath.curveTo(246.811f, 206.654f, 247.655f, 204.64201f, 247.655f, 202.42102f);
generalPath.lineTo(247.655f, 191.65302f);
generalPath.lineTo(232.663f, 191.64001f);
generalPath.lineTo(232.635f, 202.40501f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 51, 153, 255)) : new Color(0, 51, 153, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5_1
shape = new Ellipse2D.Double(234.5880126953125, 194.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5_2
shape = new Ellipse2D.Double(242.906005859375, 194.25601196289062, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5_3
shape = new Ellipse2D.Double(238.739013671875, 198.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5_4
shape = new Ellipse2D.Double(234.5880126953125, 202.4300079345703, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5_5
shape = new Ellipse2D.Double(242.89700317382812, 202.41900634765625, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -26.016000747680664f));
// _0_3_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(232.636f, 202.406f);
generalPath.lineTo(232.636f, 202.41101f);
generalPath.curveTo(232.62772f, 204.51907f, 233.41805f, 206.55208f, 234.848f, 208.10101f);
generalPath.curveTo(236.21301f, 209.56801f, 238.093f, 210.47902f, 240.15001f, 210.47902f);
generalPath.curveTo(242.21701f, 210.47902f, 244.09401f, 209.57402f, 245.453f, 208.11401f);
generalPath.curveTo(246.811f, 206.654f, 247.655f, 204.64201f, 247.655f, 202.42102f);
generalPath.lineTo(247.655f, 191.65302f);
generalPath.lineTo(232.663f, 191.64001f);
generalPath.lineTo(232.635f, 202.40501f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 51, 153, 255)) : new Color(0, 51, 153, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0_1
shape = new Ellipse2D.Double(234.5880126953125, 194.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0_2
shape = new Ellipse2D.Double(242.906005859375, 194.25601196289062, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0_3
shape = new Ellipse2D.Double(238.739013671875, 198.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0_4
shape = new Ellipse2D.Double(234.5880126953125, 202.4300079345703, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0_5
shape = new Ellipse2D.Double(242.89700317382812, 202.41900634765625, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -20.798999786376953f, 0.0f));
// _0_3_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(232.636f, 202.406f);
generalPath.lineTo(232.636f, 202.41101f);
generalPath.curveTo(232.62772f, 204.51907f, 233.41805f, 206.55208f, 234.848f, 208.10101f);
generalPath.curveTo(236.21301f, 209.56801f, 238.093f, 210.47902f, 240.15001f, 210.47902f);
generalPath.curveTo(242.21701f, 210.47902f, 244.09401f, 209.57402f, 245.453f, 208.11401f);
generalPath.curveTo(246.811f, 206.654f, 247.655f, 204.64201f, 247.655f, 202.42102f);
generalPath.lineTo(247.655f, 191.65302f);
generalPath.lineTo(232.663f, 191.64001f);
generalPath.lineTo(232.635f, 202.40501f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 51, 153, 255)) : new Color(0, 51, 153, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0_1
shape = new Ellipse2D.Double(234.5880126953125, 194.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0_2
shape = new Ellipse2D.Double(242.906005859375, 194.25601196289062, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0_3
shape = new Ellipse2D.Double(238.739013671875, 198.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0_4
shape = new Ellipse2D.Double(234.5880126953125, 202.4300079345703, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0_5
shape = new Ellipse2D.Double(242.89700317382812, 202.41900634765625, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 20.7450008392334f, 0.0f));
// _0_3_8
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(232.636f, 202.406f);
generalPath.lineTo(232.636f, 202.41101f);
generalPath.curveTo(232.62772f, 204.51907f, 233.41805f, 206.55208f, 234.848f, 208.10101f);
generalPath.curveTo(236.21301f, 209.56801f, 238.093f, 210.47902f, 240.15001f, 210.47902f);
generalPath.curveTo(242.21701f, 210.47902f, 244.09401f, 209.57402f, 245.453f, 208.11401f);
generalPath.curveTo(246.811f, 206.654f, 247.655f, 204.64201f, 247.655f, 202.42102f);
generalPath.lineTo(247.655f, 191.65302f);
generalPath.lineTo(232.663f, 191.64001f);
generalPath.lineTo(232.635f, 202.40501f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 51, 153, 255)) : new Color(0, 51, 153, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0_1
shape = new Ellipse2D.Double(234.5880126953125, 194.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0_2
shape = new Ellipse2D.Double(242.906005859375, 194.25601196289062, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0_3
shape = new Ellipse2D.Double(238.739013671875, 198.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0_4
shape = new Ellipse2D.Double(234.5880126953125, 202.4300079345703, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0_5
shape = new Ellipse2D.Double(242.89700317382812, 202.41900634765625, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 25.784000396728516f));
// _0_3_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(232.636f, 202.406f);
generalPath.lineTo(232.636f, 202.41101f);
generalPath.curveTo(232.62772f, 204.51907f, 233.41805f, 206.55208f, 234.848f, 208.10101f);
generalPath.curveTo(236.21301f, 209.56801f, 238.093f, 210.47902f, 240.15001f, 210.47902f);
generalPath.curveTo(242.21701f, 210.47902f, 244.09401f, 209.57402f, 245.453f, 208.11401f);
generalPath.curveTo(246.811f, 206.654f, 247.655f, 204.64201f, 247.655f, 202.42102f);
generalPath.lineTo(247.655f, 191.65302f);
generalPath.lineTo(232.663f, 191.64001f);
generalPath.lineTo(232.635f, 202.40501f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 51, 153, 255)) : new Color(0, 51, 153, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0_1
shape = new Ellipse2D.Double(234.5880126953125, 194.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0_2
shape = new Ellipse2D.Double(242.906005859375, 194.25601196289062, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0_3
shape = new Ellipse2D.Double(238.739013671875, 198.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0_4
shape = new Ellipse2D.Double(234.5880126953125, 202.4300079345703, 2.9719998836517334, 2.9719998836517334);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0_5
shape = new Ellipse2D.Double(242.89700317382812, 202.41900634765625, 2.9719998836517334, 2.9719998836517334);
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
_paint1(g, origAlpha);
_paint2(g, origAlpha);
_paint3(g, origAlpha);
_paint4(g, origAlpha);


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
	private pt() {
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
       pt base = new pt();
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
       pt base = new pt();
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
        return pt::new;
    }
}

