package org.pushingpixels.demo.plasma.svg

import java.awt.*
import java.awt.geom.*
import java.awt.image.BufferedImage
import java.io.*
import java.lang.ref.WeakReference
import java.util.Base64
import java.util.Stack
import javax.imageio.ImageIO
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.api.icon.ResizableIcon
import org.pushingpixels.neon.api.icon.ResizableIcon.Factory
import org.pushingpixels.neon.api.icon.ResizableIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Folder_remote private constructor(private var width: Int, private var height: Int)
       : ResizableIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private val transformsStack = Stack<AffineTransform>()

    

	private fun _paint0(g : Graphics2D,origAlpha : Float) {
transformsStack.push(g.transform)
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0
shape = Rectangle2D.Double(5.457477569580078, 40.52276611328125, 36.54252243041992, 4.0)
paint = LinearGradientPaint(Point2D.Double(1.6422368288040161, 117.82710266113281), Point2D.Double(15.343062400817871, 117.82710266113281), floatArrayOf(0.0f,0.23762377f,0.7810999f,1.0f), arrayOf(Color(104, 104, 104, 0),Color(104, 104, 104, 255),Color(104, 104, 104, 255),Color(104, 104, 104, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7401649951934814f, 0.0f, 0.0f, 0.3649420142173767f, 0.457491010427475f, -0.4772540032863617f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
shape = Rectangle2D.Double(5.457477569580078, 44.0550537109375, 36.54252243041992, 0.9895923733711243)
paint = LinearGradientPaint(Point2D.Double(0.6121002435684204, 372.57818603515625), Point2D.Double(5.08563756942749, 372.57818603515625), floatArrayOf(0.0f,0.1f,0.9f,1.0f), arrayOf(Color(71, 71, 71, 0),Color(71, 71, 71, 255),Color(71, 71, 71, 255),Color(71, 71, 71, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(8.168597221374512f, 0.0f, 0.0f, 0.22121000289916992f, 0.457491010427475f, -37.86827087402344f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
shape = Rectangle2D.Double(5.457477569580078, 40.0, 36.54252243041992, 1.0227470397949219)
paint = LinearGradientPaint(Point2D.Double(0.6121002435684204, 372.57818603515625), Point2D.Double(5.08563756942749, 372.57818603515625), floatArrayOf(0.0f,0.1f,0.9f,1.0f), arrayOf(Color(71, 71, 71, 0),Color(71, 71, 71, 255),Color(71, 71, 71, 255),Color(71, 71, 71, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(8.168597221374512f, 0.0f, 0.0f, 0.2286210060119629f, 0.457491010427475f, -36.56816864013672f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.83707863f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
shape = Rectangle2D.Double(5.457477569580078, 41.55805969238281, 36.54252243041992, 1.441941738128662)
paint = LinearGradientPaint(Point2D.Double(1.6422368288040161, 117.82710266113281), Point2D.Double(15.343062400817871, 117.82710266113281), floatArrayOf(0.0f,0.10827128f,0.920539f,1.0f), arrayOf(Color(255, 255, 255, 0),Color(255, 255, 255, 180),Color(255, 255, 255, 180),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7401649951934814f, 0.0f, 0.0f, 0.13155700266361237f, 0.457491010427475f, 26.778169631958008f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(21.923477f, 29.991507f)
generalPath!!.curveTo(21.139997f, 29.991507f, 20.517227f, 30.614277f, 20.517227f, 31.397757f)
generalPath!!.lineTo(20.517227f, 38.491505f)
generalPath!!.lineTo(16.892227f, 38.491505f)
generalPath!!.curveTo(16.108747f, 38.491505f, 15.485978f, 39.114277f, 15.485978f, 39.897755f)
generalPath!!.lineTo(15.485978f, 44.116505f)
generalPath!!.curveTo(15.485978f, 44.899975f, 16.108747f, 45.522755f, 16.892227f, 45.522755f)
generalPath!!.lineTo(30.079727f, 45.522755f)
generalPath!!.curveTo(30.863197f, 45.522755f, 31.485977f, 44.899975f, 31.485977f, 44.116505f)
generalPath!!.lineTo(31.485977f, 39.897755f)
generalPath!!.curveTo(31.485977f, 39.114277f, 30.863197f, 38.491505f, 30.079727f, 38.491505f)
generalPath!!.lineTo(27.048477f, 38.491505f)
generalPath!!.lineTo(27.048477f, 31.397757f)
generalPath!!.curveTo(27.048477f, 30.614277f, 26.425697f, 29.991507f, 25.642227f, 29.991507f)
generalPath!!.lineTo(21.923477f, 29.991507f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(23.100046157836914, 38.29674530029297), Point2D.Double(23.100046157836914, 43.91546630859375), floatArrayOf(0.0f,0.1980198f,0.5990099f,1.0f), arrayOf(Color(122, 122, 122, 255),Color(197, 197, 197, 255),Color(98, 98, 98, 255),Color(136, 136, 136, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.983801007270813f, 0.0f, 0.0f, 1.0164660215377808f, 0.457491010427475f, 0.5227450132369995f))
g.paint = paint
g.fill(shape)
paint = Color(67, 67, 67, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(21.923477f, 29.991507f)
generalPath!!.curveTo(21.139997f, 29.991507f, 20.517227f, 30.614277f, 20.517227f, 31.397757f)
generalPath!!.lineTo(20.517227f, 38.491505f)
generalPath!!.lineTo(16.892227f, 38.491505f)
generalPath!!.curveTo(16.108747f, 38.491505f, 15.485978f, 39.114277f, 15.485978f, 39.897755f)
generalPath!!.lineTo(15.485978f, 44.116505f)
generalPath!!.curveTo(15.485978f, 44.899975f, 16.108747f, 45.522755f, 16.892227f, 45.522755f)
generalPath!!.lineTo(30.079727f, 45.522755f)
generalPath!!.curveTo(30.863197f, 45.522755f, 31.485977f, 44.899975f, 31.485977f, 44.116505f)
generalPath!!.lineTo(31.485977f, 39.897755f)
generalPath!!.curveTo(31.485977f, 39.114277f, 30.863197f, 38.491505f, 30.079727f, 38.491505f)
generalPath!!.lineTo(27.048477f, 38.491505f)
generalPath!!.lineTo(27.048477f, 31.397757f)
generalPath!!.curveTo(27.048477f, 30.614277f, 26.425697f, 29.991507f, 25.642227f, 29.991507f)
generalPath!!.lineTo(21.923477f, 29.991507f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
shape = RoundRectangle2D.Double(21.457477569580078, 36.02276611328125, 1.9722718000411987, 3.0, 0.5991116762161255, 0.5991116762161255)
paint = LinearGradientPaint(Point2D.Double(36.37306594848633, 22.227985382080078), Point2D.Double(38.10511779785156, 22.227985382080078), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 115),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.1386909484863281f, 0.0f, 0.0f, 1.7320510149002075f, -19.9602108001709f, -0.9772539734840393f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(26.551237f, 35.975876f)
generalPath!!.lineTo(21.019987f, 35.975876f)
generalPath!!.curveTo(21.019987f, 35.975876f, 21.019987f, 37.663376f, 21.019987f, 38.147755f)
generalPath!!.curveTo(21.566858f, 36.366505f, 26.551237f, 35.975876f, 26.551237f, 35.975876f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(28.6326847076416, 29.943159103393555), Point2D.Double(28.783721923828125, 31.490198135375977), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 128),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.8108170032501221f, 0.0f, 0.0f, 1.2333240509033203f, 0.457491010427475f, -0.8522539734840393f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.5703089833259583f, 0.9008449912071228f))
// _0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7_0
shape = RoundRectangle2D.Double(19.007808685302734, 39.09915542602539, 11.5625, 0.9999999403953552, 1.0, 0.9999999403953552)
paint = Color(255, 255, 255, 184)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9411799907684326f, 0.0f, 0.0f, 0.9411799907684326f, 0.6878949999809265f, 1.413727045059204f))
// _0_0_7_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.0f, 40.625f)
generalPath!!.curveTo(19.00085f, 40.815365f, 18.899782f, 40.99163f, 18.735064f, 41.08706f)
generalPath!!.curveTo(18.570345f, 41.182487f, 18.367155f, 41.182487f, 18.202436f, 41.08706f)
generalPath!!.curveTo(18.037718f, 40.99163f, 17.93665f, 40.815365f, 17.9375f, 40.625f)
generalPath!!.curveTo(17.93665f, 40.434635f, 18.037718f, 40.25837f, 18.202436f, 40.16294f)
generalPath!!.curveTo(18.367155f, 40.067513f, 18.570345f, 40.067513f, 18.735064f, 40.16294f)
generalPath!!.curveTo(18.899782f, 40.25837f, 19.00085f, 40.434635f, 19.0f, 40.625f)
generalPath!!.closePath()
shape = generalPath
paint = Color(255, 255, 255, 184)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.471571f, 34.644497f)
generalPath!!.curveTo(5.493367f, 35.060802f, 5.931476f, 35.477108f, 6.3477807f, 35.477108f)
generalPath!!.lineTo(37.6748f, 35.477108f)
generalPath!!.curveTo(38.091103f, 35.477108f, 38.485615f, 35.060802f, 38.463818f, 34.644497f)
generalPath!!.lineTo(37.527374f, 7.4177623f)
generalPath!!.curveTo(37.50558f, 7.0014596f, 37.06748f, 6.5851464f, 36.651173f, 6.5851464f)
generalPath!!.lineTo(23.3803f, 6.5851464f)
generalPath!!.curveTo(22.895245f, 6.5851464f, 22.145828f, 6.2695575f, 21.978657f, 5.478514f)
generalPath!!.lineTo(21.367266f, 2.5854433f)
generalPath!!.curveTo(21.211798f, 1.84977f, 20.485052f, 1.547557f, 20.068748f, 1.547557f)
generalPath!!.lineTo(5.289888f, 1.547557f)
generalPath!!.curveTo(4.873575f, 1.547557f, 4.4790673f, 1.9638611f, 4.500863f, 2.3801653f)
generalPath!!.lineTo(5.471571f, 34.644497f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(20.706016540527344, 37.51798629760742), 30.905205f, Point2D.Double(20.706016540527344, 37.51798629760742), floatArrayOf(0.0f,1.0f), arrayOf(Color(32, 32, 32, 255),Color(185, 185, 185, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0550220012664795f, -0.027345040813088417f, 0.17770299315452576f, 1.1909290552139282f, -2.6223859786987305f, -11.168219566345215f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(18.112709045410156, 31.36775016784668), Point2D.Double(15.514888763427734, 6.18025016784668), floatArrayOf(0.0f,1.0f), arrayOf(Color(66, 66, 66, 255),Color(119, 119, 119, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.9497910141944885f, -4.042919158935547f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.471571f, 34.644497f)
generalPath!!.curveTo(5.493367f, 35.060802f, 5.931476f, 35.477108f, 6.3477807f, 35.477108f)
generalPath!!.lineTo(37.6748f, 35.477108f)
generalPath!!.curveTo(38.091103f, 35.477108f, 38.485615f, 35.060802f, 38.463818f, 34.644497f)
generalPath!!.lineTo(37.527374f, 7.4177623f)
generalPath!!.curveTo(37.50558f, 7.0014596f, 37.06748f, 6.5851464f, 36.651173f, 6.5851464f)
generalPath!!.lineTo(23.3803f, 6.5851464f)
generalPath!!.curveTo(22.895245f, 6.5851464f, 22.145828f, 6.2695575f, 21.978657f, 5.478514f)
generalPath!!.lineTo(21.367266f, 2.5854433f)
generalPath!!.curveTo(21.211798f, 1.84977f, 20.485052f, 1.547557f, 20.068748f, 1.547557f)
generalPath!!.lineTo(5.289888f, 1.547557f)
generalPath!!.curveTo(4.873575f, 1.547557f, 4.4790673f, 1.9638611f, 4.500863f, 2.3801653f)
generalPath!!.lineTo(5.471571f, 34.644497f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.176383f, 18.51958f)
generalPath!!.lineTo(36.441963f, 18.51958f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.176383f, 18.51958f)
generalPath!!.lineTo(36.441963f, 18.51958f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.991964f, 14.519581f)
generalPath!!.lineTo(36.438896f, 14.519581f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.991964f, 14.519581f)
generalPath!!.lineTo(36.438896f, 14.519581f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.930487f, 8.519581f)
generalPath!!.lineTo(36.437847f, 8.519581f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.930487f, 8.519581f)
generalPath!!.lineTo(36.437847f, 8.519581f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.335948f, 28.51958f)
generalPath!!.lineTo(36.44467f, 28.51958f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.335948f, 28.51958f)
generalPath!!.lineTo(36.44467f, 28.51958f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.4589305f, 30.51958f)
generalPath!!.lineTo(36.446686f, 30.51958f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.4589305f, 30.51958f)
generalPath!!.lineTo(36.446686f, 30.51958f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.5568182f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9145029783248901f, 0.0f, 0.0f, 1.0104689598083496f, 1.2309449911117554f, -6.716239929199219f))
// _0_0_14
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(43.48707f, 41.591846f)
generalPath!!.curveTo(43.517735f, 43.254642f, 39.87714f, 44.79432f, 33.943817f, 45.62787f)
generalPath!!.curveTo(28.010498f, 46.461422f, 20.691483f, 46.461422f, 14.758162f, 45.62787f)
generalPath!!.curveTo(8.8248415f, 44.79432f, 5.1842465f, 43.254642f, 5.2149124f, 41.591846f)
generalPath!!.curveTo(5.1842465f, 39.92905f, 8.8248415f, 38.389374f, 14.758162f, 37.555824f)
generalPath!!.curveTo(20.691483f, 36.72227f, 28.010498f, 36.72227f, 33.943817f, 37.555824f)
generalPath!!.curveTo(39.87714f, 38.389374f, 43.517735f, 39.92905f, 43.48707f, 41.591846f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.350990295410156, 41.59184646606445), 19.136078f, Point2D.Double(24.350990295410156, 41.59184646606445), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.24249400198459625f, 0.0f, 31.506059646606445f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.991964f, 12.519581f)
generalPath!!.lineTo(36.438896f, 12.519581f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.991964f, 12.519581f)
generalPath!!.lineTo(36.438896f, 12.519581f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.961225f, 10.519581f)
generalPath!!.lineTo(36.43837f, 10.519581f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.961225f, 10.519581f)
generalPath!!.lineTo(36.43837f, 10.519581f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_17
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.871887f, 6.5195804f)
generalPath!!.lineTo(21.152702f, 6.5195804f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.871887f, 6.5195804f)
generalPath!!.lineTo(21.152702f, 6.5195804f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_18
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.823544f, 4.5195804f)
generalPath!!.lineTo(20.607279f, 4.5195804f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(0.9999998f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.823544f, 4.5195804f)
generalPath!!.lineTo(20.607279f, 4.5195804f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_19
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.274457f, 24.51958f)
generalPath!!.lineTo(36.44367f, 24.51958f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.274457f, 24.51958f)
generalPath!!.lineTo(36.44367f, 24.51958f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_20
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.2378545f, 22.51958f)
generalPath!!.lineTo(36.442974f, 22.51958f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.2378545f, 22.51958f)
generalPath!!.lineTo(36.442974f, 22.51958f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_21
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.176383f, 20.51958f)
generalPath!!.lineTo(36.441963f, 20.51958f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.176383f, 20.51958f)
generalPath!!.lineTo(36.441963f, 20.51958f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_22
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.145644f, 16.51958f)
generalPath!!.lineTo(36.44144f, 16.51958f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000001f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.145644f, 16.51958f)
generalPath!!.lineTo(36.44144f, 16.51958f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_23
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.274457f, 26.51958f)
generalPath!!.lineTo(36.44367f, 26.51958f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.274457f, 26.51958f)
generalPath!!.lineTo(36.44367f, 26.51958f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_24
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.4589305f, 32.51958f)
generalPath!!.lineTo(36.446686f, 32.51958f)
shape = generalPath
paint = Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.4589305f, 32.51958f)
generalPath!!.lineTo(36.446686f, 32.51958f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.4514286f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_25
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.0181336f, 34.821102f)
generalPath!!.curveTo(7.0344763f, 35.13333f, 6.837222f, 35.341484f, 6.519549f, 35.237408f)
generalPath!!.lineTo(6.519549f, 35.237408f)
generalPath!!.curveTo(6.201867f, 35.13333f, 5.9828176f, 34.92518f, 5.966466f, 34.61295f)
generalPath!!.lineTo(5.0187464f, 2.5484643f)
generalPath!!.curveTo(5.0024037f, 2.236236f, 5.1839323f, 2.0476937f, 5.4961605f, 2.0476937f)
generalPath!!.lineTo(19.918211f, 2.0f)
generalPath!!.curveTo(20.230438f, 2.0f, 20.850155f, 2.3004727f, 21.051147f, 3.3221817f)
generalPath!!.lineTo(21.624636f, 6.1377163f)
generalPath!!.curveTo(21.197582f, 5.6724596f, 21.205442f, 5.6580977f, 20.987078f, 4.9810104f)
generalPath!!.lineTo(20.580982f, 3.7218282f)
generalPath!!.curveTo(20.361933f, 2.9941814f, 19.882782f, 2.889928f, 19.570555f, 2.889928f)
generalPath!!.lineTo(6.6827793f, 2.889928f)
generalPath!!.curveTo(6.3705516f, 2.889928f, 6.173298f, 3.0980804f, 6.1896486f, 3.4103167f)
generalPath!!.lineTo(7.127654f, 34.92518f)
generalPath!!.lineTo(7.0181336f, 34.821102f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(6.229796409606934, 13.773065567016602), Point2D.Double(9.898089408874512, 66.83405303955078), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 223),Color(255, 255, 254, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.5168440341949463f, 0.0f, 0.0f, 0.708977997303009f, 0.07021746784448624f, -5.361084938049316f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0407639741897583f, 0.0f, 0.0544925183057785f, 1.0407639741897583f, -7.720407962799072f, -1.3723249435424805f))
// _0_0_26
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_26_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(42.417183f, 8.515178f)
generalPath!!.curveTo(42.422268f, 8.418064f, 42.28902f, 8.268189f, 42.182068f, 8.268171f)
generalPath!!.lineTo(29.150665f, 8.266053f)
generalPath!!.curveTo(29.150665f, 8.266053f, 30.06238f, 8.854008f, 31.352476f, 8.862296f)
generalPath!!.lineTo(42.405975f, 8.933317f)
generalPath!!.curveTo(42.41706f, 8.721589f, 42.408695f, 8.677284f, 42.417183f, 8.515178f)
generalPath!!.closePath()
shape = generalPath
paint = Color(255, 255, 255, 130)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_27
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.733322f, 35.4677f)
generalPath!!.curveTo(41.877216f, 35.423637f, 42.6964f, 34.371403f, 42.780357f, 33.146694f)
generalPath!!.curveTo(43.572144f, 21.59801f, 44.439716f, 11.914747f, 44.439716f, 11.914747f)
generalPath!!.curveTo(44.51187f, 11.667263f, 44.27181f, 11.41978f, 43.95958f, 11.41978f)
generalPath!!.lineTo(9.588421f, 11.41978f)
generalPath!!.curveTo(9.588421f, 11.41978f, 7.738102f, 33.28667f, 7.738102f, 33.28667f)
generalPath!!.curveTo(7.6235466f, 34.268738f, 7.2720942f, 35.09139f, 6.188266f, 35.470387f)
generalPath!!.lineTo(40.733322f, 35.4677f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(22.175975799560547, 36.987998962402344), Point2D.Double(22.065330505371094, 32.050498962402344), floatArrayOf(0.0f,1.0f), arrayOf(Color(97, 148, 203, 255),Color(114, 159, 207, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.9497910141944885f, -4.042919158935547f))
g.paint = paint
g.fill(shape)
paint = Color(52, 101, 164, 255)
stroke = BasicStroke(1.0f,0,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.733322f, 35.4677f)
generalPath!!.curveTo(41.877216f, 35.423637f, 42.6964f, 34.371403f, 42.780357f, 33.146694f)
generalPath!!.curveTo(43.572144f, 21.59801f, 44.439716f, 11.914747f, 44.439716f, 11.914747f)
generalPath!!.curveTo(44.51187f, 11.667263f, 44.27181f, 11.41978f, 43.95958f, 11.41978f)
generalPath!!.lineTo(9.588421f, 11.41978f)
generalPath!!.curveTo(9.588421f, 11.41978f, 7.738102f, 33.28667f, 7.738102f, 33.28667f)
generalPath!!.curveTo(7.6235466f, 34.268738f, 7.2720942f, 35.09139f, 6.188266f, 35.470387f)
generalPath!!.lineTo(40.733322f, 35.4677f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.46590912f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_28
paint = LinearGradientPaint(Point2D.Double(13.035696029663086, 32.56718444824219), Point2D.Double(12.853771209716797, 46.68931198120117), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3174890279769897f, 0.0f, 0.0f, 0.8162559866905212f, 0.07021746784448624f, -5.361084938049316f))
stroke = BasicStroke(0.9999997f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(10.570035f, 12.421002f)
generalPath!!.lineTo(43.361134f, 12.485816f)
generalPath!!.lineTo(41.787086f, 32.487797f)
generalPath!!.curveTo(41.702766f, 33.559307f, 41.33641f, 33.91601f, 39.914433f, 33.91601f)
generalPath!!.curveTo(38.04293f, 33.91601f, 11.236464f, 33.883602f, 8.51969f, 33.883602f)
generalPath!!.curveTo(8.753288f, 33.562794f, 8.853445f, 32.89498f, 8.854786f, 32.87899f)
generalPath!!.lineTo(10.570035f, 12.421002f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_29
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(10.570039f, 12.180263f)
generalPath!!.lineTo(9.403392f, 27.823534f)
generalPath!!.curveTo(9.403392f, 27.823534f, 17.699547f, 23.675455f, 28.06974f, 23.675455f)
generalPath!!.curveTo(38.439934f, 23.675455f, 43.62503f, 12.180263f, 43.62503f, 12.180263f)
generalPath!!.lineTo(10.570039f, 12.180263f)
generalPath!!.closePath()
shape = generalPath
paint = Color(255, 255, 255, 23)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()

}



	private fun innerPaint(g : Graphics2D) {
        var origAlpha = 1.0f
        val origComposite = g.composite
        if (origComposite is AlphaComposite) {
            if (origComposite.rule == AlphaComposite.SRC_OVER) {
                origAlpha = origComposite.alpha
            }
        }
        
	    _paint0(g, origAlpha)


	    shape = null
	    generalPath = null
	    paint = null
	    stroke = null
	    clip = null
	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 4.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 1.04755699634552
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 41.04103469848633
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.975196838378906
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Folder_remote(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Folder_remote(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Folder_remote(getOrigWidth().toInt(), getOrigHeight().toInt()) }
        }
    }

    override fun getIconHeight(): Int {
        return width
    }

    override fun getIconWidth(): Int {
        return height
    }

    override @Synchronized fun setDimension(newDimension: Dimension) {
        width = newDimension.width
        height = newDimension.height
    }

    override @Synchronized fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC)
        g2d.translate(x, y)

        val coef1 = this.width.toDouble() / getOrigWidth()
        val coef2 = this.height.toDouble() / getOrigHeight()
        val coef = Math.min(coef1, coef2)
        g2d.clipRect(0, 0, this.width, this.height)
        g2d.scale(coef, coef)
        g2d.translate(-getOrigX(), -getOrigY())
        if (coef1 != coef2) {
            if (coef1 < coef2) {
                val extraDy = ((getOrigWidth() - getOrigHeight()) / 2.0).toInt()
                g2d.translate(0, extraDy)
            } else {
                val extraDx = ((getOrigHeight() - getOrigWidth()) / 2.0).toInt()
                g2d.translate(extraDx, 0)
            }
        }
        val g2ForInner = g2d.create() as Graphics2D
        innerPaint(g2ForInner)
        g2ForInner.dispose()
        g2d.dispose()
    }
}

