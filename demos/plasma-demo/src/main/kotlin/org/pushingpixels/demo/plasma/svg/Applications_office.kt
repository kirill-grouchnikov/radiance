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

import org.pushingpixels.neon.api.icon.NeonIcon
import org.pushingpixels.neon.api.icon.NeonIcon.Factory
import org.pushingpixels.neon.api.icon.NeonIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Applications_office private constructor(private var width: Int, private var height: Int)
       : NeonIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var colorFilter: NeonIcon.ColorFilter? = null
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
g.composite = AlphaComposite.getInstance(3, 0.3186813f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 4.0f))
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(37.625f, 37.75f)
generalPath!!.curveTo(37.648037f, 39.810402f, 34.913227f, 41.71825f, 30.456121f, 42.751118f)
generalPath!!.curveTo(25.999018f, 43.78399f, 20.500982f, 43.78399f, 16.043879f, 42.751118f)
generalPath!!.curveTo(11.586774f, 41.71825f, 8.851964f, 39.810402f, 8.875f, 37.75f)
generalPath!!.curveTo(8.851964f, 35.689598f, 11.586774f, 33.78175f, 16.043879f, 32.748882f)
generalPath!!.curveTo(20.500982f, 31.71601f, 25.999018f, 31.71601f, 30.456121f, 32.748882f)
generalPath!!.curveTo(34.913227f, 33.78175f, 37.648037f, 35.689598f, 37.625f, 37.75f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(23.25, 37.75), 14.875f, Point2D.Double(23.25, 37.75), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.4201680123806f, 0.0f, 21.888660430908203f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.6978022f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.125f, 4.75f))
// _0_0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(33.5f, 36.8125f)
generalPath!!.curveTo(33.51372f, 37.865097f, 31.884726f, 38.839756f, 29.229843f, 39.36742f)
generalPath!!.curveTo(26.574959f, 39.89508f, 23.300041f, 39.89508f, 20.645157f, 39.36742f)
generalPath!!.curveTo(17.990274f, 38.839756f, 16.361279f, 37.865097f, 16.375f, 36.8125f)
generalPath!!.curveTo(16.361279f, 35.759903f, 17.990274f, 34.785244f, 20.645157f, 34.25758f)
generalPath!!.curveTo(23.300041f, 33.72992f, 26.574959f, 33.72992f, 29.229843f, 34.25758f)
generalPath!!.curveTo(31.884726f, 34.785244f, 33.51372f, 35.759903f, 33.5f, 36.8125f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.78571427f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.5739129781723022f, 0.0f, 0.0f, 0.5739129781723022f, 10.906519889831543f, 19.584779739379883f))
// _0_0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(37.625f, 37.75f)
generalPath!!.curveTo(37.648037f, 39.810402f, 34.913227f, 41.71825f, 30.456121f, 42.751118f)
generalPath!!.curveTo(25.999018f, 43.78399f, 20.500982f, 43.78399f, 16.043879f, 42.751118f)
generalPath!!.curveTo(11.586774f, 41.71825f, 8.851964f, 39.810402f, 8.875f, 37.75f)
generalPath!!.curveTo(8.851964f, 35.689598f, 11.586774f, 33.78175f, 16.043879f, 32.748882f)
generalPath!!.curveTo(20.500982f, 31.71601f, 25.999018f, 31.71601f, 30.456121f, 32.748882f)
generalPath!!.curveTo(34.913227f, 33.78175f, 37.648037f, 35.689598f, 37.625f, 37.75f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(23.25, 37.75), 14.875f, Point2D.Double(23.25, 37.75), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.4201680123806f, 8.187894806610529E-16f, 21.888660430908203f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.005025029182434f, 0.0f, 0.0f, 1.0f, -0.18655799329280853f, 5.625f))
// _0_0_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(37.125f, 14.1875f)
generalPath!!.curveTo(37.14493f, 16.225508f, 34.778725f, 18.112616f, 30.922361f, 19.13426f)
generalPath!!.curveTo(27.065998f, 20.155903f, 22.309002f, 20.155903f, 18.452639f, 19.13426f)
generalPath!!.curveTo(14.596274f, 18.112616f, 12.230069f, 16.225508f, 12.25f, 14.1875f)
generalPath!!.curveTo(12.230069f, 12.149492f, 14.596274f, 10.262384f, 18.452639f, 9.240741f)
generalPath!!.curveTo(22.309002f, 8.219097f, 27.065998f, 8.219097f, 30.922361f, 9.240741f)
generalPath!!.curveTo(34.778725f, 10.262384f, 37.14493f, 12.149492f, 37.125f, 14.1875f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(11.75, 14.1875), Point2D.Double(37.625, 14.1875), floatArrayOf(0.0f,0.32894737f,0.65789473f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 176)) ?: Color(255, 255, 255, 176)),(colorFilter?.filter(Color(194, 194, 194, 87)) ?: Color(194, 194, 194, 87)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(140, 140, 140, 255)) ?: Color(140, 140, 140, 255)
stroke = BasicStroke(0.99749684f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(37.125f, 14.1875f)
generalPath!!.curveTo(37.14493f, 16.225508f, 34.778725f, 18.112616f, 30.922361f, 19.13426f)
generalPath!!.curveTo(27.065998f, 20.155903f, 22.309002f, 20.155903f, 18.452639f, 19.13426f)
generalPath!!.curveTo(14.596274f, 18.112616f, 12.230069f, 16.225508f, 12.25f, 14.1875f)
generalPath!!.curveTo(12.230069f, 12.149492f, 14.596274f, 10.262384f, 18.452639f, 9.240741f)
generalPath!!.curveTo(22.309002f, 8.219097f, 27.065998f, 8.219097f, 30.922361f, 9.240741f)
generalPath!!.curveTo(34.778725f, 10.262384f, 37.14493f, 12.149492f, 37.125f, 14.1875f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -40.25f, -7.5f))
// _0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(81.18932f, 8.851212f)
generalPath!!.lineTo(75.59399f, 14.505723f)
generalPath!!.lineTo(60.324795f, 46.150494f)
generalPath!!.curveTo(59.091904f, 49.407024f, 63.727036f, 51.320175f, 65.33689f, 48.436665f)
generalPath!!.lineTo(80.231415f, 16.856367f)
generalPath!!.lineTo(81.18932f, 8.851212f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(203, 144, 34, 255)) ?: Color(203, 144, 34, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(92, 65, 12, 255)) ?: Color(92, 65, 12, 255)
stroke = BasicStroke(1.0000008f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(81.18932f, 8.851212f)
generalPath!!.lineTo(75.59399f, 14.505723f)
generalPath!!.lineTo(60.324795f, 46.150494f)
generalPath!!.curveTo(59.091904f, 49.407024f, 63.727036f, 51.320175f, 65.33689f, 48.436665f)
generalPath!!.lineTo(80.231415f, 16.856367f)
generalPath!!.lineTo(81.18932f, 8.851212f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(63.226658f, 41.398f)
generalPath!!.curveTo(63.226658f, 41.398f, 63.32797f, 42.834988f, 64.58091f, 43.390907f)
generalPath!!.curveTo(65.871704f, 43.96362f, 67.23713f, 43.376938f, 67.23713f, 43.376938f)
generalPath!!.lineTo(64.79487f, 48.421104f)
generalPath!!.curveTo(64.79487f, 48.421104f, 63.92115f, 49.877754f, 61.95461f, 49.092304f)
generalPath!!.curveTo(60.01493f, 48.31758f, 60.78424f, 46.41092f, 60.78424f, 46.41092f)
generalPath!!.lineTo(63.226658f, 41.398f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(48.90625, 17.376184463500977), Point2D.Double(50.98833465576172, 22.250591278076172), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 209, 209, 255)) ?: Color(255, 209, 209, 255)),(colorFilter?.filter(Color(255, 29, 29, 255)) ?: Color(255, 29, 29, 255)),(colorFilter?.filter(Color(111, 0, 0, 255)) ?: Color(111, 0, 0, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.005259571131318808f, 0.999987006187439f, 0.999987006187439f, -0.005259571131318808f, 42.99549865722656f, -2.4962410926818848f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(63.226658f, 41.398f)
generalPath!!.curveTo(63.226658f, 41.398f, 63.32797f, 42.834988f, 64.58091f, 43.390907f)
generalPath!!.curveTo(65.871704f, 43.96362f, 67.23713f, 43.376938f, 67.23713f, 43.376938f)
generalPath!!.lineTo(66.24766f, 45.38217f)
generalPath!!.curveTo(66.24766f, 45.38217f, 64.93316f, 46.216125f, 63.561344f, 45.61505f)
generalPath!!.curveTo(62.151825f, 44.997456f, 62.23719f, 43.403233f, 62.23719f, 43.403233f)
generalPath!!.lineTo(63.226658f, 41.398f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(46.0, 19.8125), Point2D.Double(47.6875, 22.625), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(193, 193, 193, 255)) ?: Color(193, 193, 193, 255)),(colorFilter?.filter(Color(172, 172, 172, 255)) ?: Color(172, 172, 172, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.005259571131318808f, 0.999987006187439f, 0.999987006187439f, -0.005259571131318808f, 42.995521545410156f, -2.4962410926818848f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(80.47809f, 10.282021f)
generalPath!!.lineTo(76.001816f, 14.805631f)
generalPath!!.curveTo(76.8222f, 16.301338f, 78.17004f, 17.07551f, 79.73038f, 16.661047f)
generalPath!!.lineTo(80.47809f, 10.282021f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(29.053354263305664, 27.640750885009766), 3.2408545f, Point2D.Double(29.053354263305664, 27.640750885009766), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(231, 226, 184, 255)) ?: Color(231, 226, 184, 255)),(colorFilter?.filter(Color(231, 226, 184, 0)) ?: Color(231, 226, 184, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.015376700088381767f, 2.9235270023345947f, 2.029690980911255f, -0.010675439611077309f, 20.390979766845703f, -69.72664642333984f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(79.078926f, 11.63315f)
generalPath!!.lineTo(80.66411f, 9.999789f)
generalPath!!.lineTo(80.36394f, 12.345152f)
generalPath!!.curveTo(79.64635f, 12.567679f, 79.30047f, 12.163243f, 79.078926f, 11.63315f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(25.71875, 31.046875), Point2D.Double(25.514589309692383, 30.703125), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(201, 201, 201, 255)) ?: Color(201, 201, 201, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.005259571131318808f, 0.999987006187439f, 0.999987006187439f, -0.005259571131318808f, 48.692901611328125f, -14.144909858703613f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(75.970566f, 14.805795f)
generalPath!!.lineTo(77.22877f, 16.3617f)
generalPath!!.lineTo(64.439995f, 43.31636f)
generalPath!!.curveTo(63.581627f, 42.87644f, 63.348885f, 42.080315f, 63.26774f, 41.41912f)
generalPath!!.lineTo(75.970566f, 14.805795f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 93)) ?: Color(255, 255, 255, 93)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(79.79288f, 16.660719f)
generalPath!!.lineTo(79.04388f, 16.852161f)
generalPath!!.lineTo(66.49448f, 43.620552f)
generalPath!!.curveTo(66.49448f, 43.620552f, 67.10751f, 43.507168f, 67.24268f, 43.400734f)
generalPath!!.lineTo(79.79288f, 16.660719f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 93)) ?: Color(0, 0, 0, 93)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.53846157f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(0.9999996f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(35.590973f, 22.336294f)
generalPath!!.lineTo(33.477154f, 40.669163f)
generalPath!!.curveTo(32.63409f, 45.449017f, 16.730858f, 45.501263f, 15.772831f, 40.669163f)
generalPath!!.lineTo(13.570621f, 22.398108f)
generalPath!!.curveTo(15.678392f, 27.62852f, 34.583355f, 26.853544f, 35.590973f, 22.336294f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
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
generalPath!!.moveTo(23.876644f, 29.502754f)
generalPath!!.curveTo(24.759054f, 28.895351f, 27.257458f, 31.087465f, 29.508623f, 34.357876f)
generalPath!!.curveTo(31.759789f, 37.62829f, 32.227455f, 41.218243f, 32.03304f, 41.35207f)
generalPath!!.curveTo(31.816362f, 41.501217f, 28.652225f, 39.767357f, 26.40106f, 36.496944f)
generalPath!!.curveTo(24.149895f, 33.226536f, 22.994232f, 30.110155f, 23.876644f, 29.502754f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(231, 231, 231, 255)) ?: Color(231, 231, 231, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(125, 125, 125, 255)) ?: Color(125, 125, 125, 255)
stroke = BasicStroke(0.9999996f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(23.876644f, 29.502754f)
generalPath!!.curveTo(24.759054f, 28.895351f, 27.257458f, 31.087465f, 29.508623f, 34.357876f)
generalPath!!.curveTo(31.759789f, 37.62829f, 32.227455f, 41.218243f, 32.03304f, 41.35207f)
generalPath!!.curveTo(31.816362f, 41.501217f, 28.652225f, 39.767357f, 26.40106f, 36.496944f)
generalPath!!.curveTo(24.149895f, 33.226536f, 22.994232f, 30.110155f, 23.876644f, 29.502754f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.7960140109062195f, 0.08258056640625f, -0.08258056640625f, 0.7960140109062195f, 1.5307120084762573f, -0.7299680113792419f))
// _0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.5625100135803223f, -0.8171939849853516f, 0.825069010257721f, -0.5679309964179993f, -15.220560073852539f, 83.8867416381836f))
// _0_0_7_0
paint = colorFilter?.filter(Color(52, 101, 164, 255)) ?: Color(52, 101, 164, 255)
stroke = BasicStroke(1.2535026f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(32.085888f, 57.685642f)
generalPath!!.curveTo(35.617744f, 56.50985f, 40.33878f, 56.182793f, 44.579147f, 56.820156f)
generalPath!!.curveTo(48.819515f, 57.45752f, 51.981396f, 58.969444f, 52.94643f, 60.82116f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.5625100135803223f, -0.8171939849853516f, 0.825069010257721f, -0.5679309964179993f, -14.28555965423584f, 81.45323944091797f))
// _0_0_7_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(36.364517f, 54.473244f)
generalPath!!.curveTo(36.846443f, 55.27986f, 36.010174f, 56.13992f, 34.47655f, 56.414906f)
generalPath!!.curveTo(32.94293f, 56.68989f, 31.267382f, 56.28022f, 30.69383f, 55.49003f)
generalPath!!.lineTo(33.5f, 54.9375f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(52, 101, 164, 255)) ?: Color(52, 101, 164, 255)
stroke = BasicStroke(1.2535026f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(36.364517f, 54.473244f)
generalPath!!.curveTo(36.846443f, 55.27986f, 36.010174f, 56.13992f, 34.47655f, 56.414906f)
generalPath!!.curveTo(32.94293f, 56.68989f, 31.267382f, 56.28022f, 30.69383f, 55.49003f)
generalPath!!.lineTo(33.5f, 54.9375f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
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
generalPath!!.moveTo(18.309496f, 27.045877f)
generalPath!!.curveTo(21.251305f, 31.200586f, 24.142324f, 34.798885f, 26.528053f, 37.384544f)
generalPath!!.lineTo(30.395567f, 34.722366f)
generalPath!!.curveTo(28.634237f, 31.171968f, 25.891142f, 26.577557f, 22.565008f, 21.745474f)
generalPath!!.curveTo(16.561094f, 13.023205f, 10.607438f, 6.378291f, 8.252501f, 5.590012f)
generalPath!!.curveTo(8.18023f, 5.5671086f, 8.083313f, 5.536959f, 8.018113f, 5.5255275f)
generalPath!!.curveTo(7.9722757f, 5.5185456f, 7.9043655f, 5.52092f, 7.862244f, 5.5199065f)
generalPath!!.curveTo(7.796054f, 5.520212f, 7.7111893f, 5.533879f, 7.6548076f, 5.5497823f)
generalPath!!.curveTo(7.641025f, 5.554251f, 7.598818f, 5.55428f, 7.5856624f, 5.5597405f)
generalPath!!.curveTo(7.572823f, 5.565697f, 7.5463f, 5.58828f, 7.534096f, 5.5952363f)
generalPath!!.curveTo(7.528154f, 5.598964f, 7.514095f, 5.609004f, 7.5083127f, 5.6129837f)
generalPath!!.curveTo(7.5025306f, 5.616964f, 7.488133f, 5.626512f, 7.4825296f, 5.6307316f)
generalPath!!.curveTo(7.471675f, 5.639648f, 7.4411106f, 5.6563606f, 7.4309626f, 5.6662273f)
generalPath!!.curveTo(7.421165f, 5.6765656f, 7.4060698f, 5.715981f, 7.396974f, 5.72726f)
generalPath!!.curveTo(7.36199f, 5.774247f, 7.3189254f, 5.8486404f, 7.295009f, 5.910359f)
generalPath!!.curveTo(7.2809167f, 5.9500666f, 7.2544537f, 6.012654f, 7.2446103f, 6.0579634f)
generalPath!!.curveTo(7.232011f, 6.122947f, 7.225572f, 6.224241f, 7.2211637f, 6.299926f)
generalPath!!.curveTo(7.11673f, 8.781096f, 11.19814f, 16.71476f, 17.202055f, 25.437027f)
generalPath!!.curveTo(17.575632f, 25.979746f, 17.93728f, 26.520197f, 18.309496f, 27.045877f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(28.24468421936035, 60.44550323486328), Point2D.Double(28.24468421936035, 68.22488403320312), floatArrayOf(0.0f,0.31578946f,1.0f), arrayOf((colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)),(colorFilter?.filter(Color(165, 191, 218, 255)) ?: Color(165, 191, 218, 255)),(colorFilter?.filter(Color(55, 108, 164, 255)) ?: Color(55, 108, 164, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.4933040142059326f, -0.7166540026664734f, 0.7166540026664734f, -0.4933040142059326f, -9.267809867858887f, 79.41919708251953f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(52, 101, 164, 255)) ?: Color(52, 101, 164, 255)
stroke = BasicStroke(0.9999997f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.309496f, 27.045877f)
generalPath!!.curveTo(21.251305f, 31.200586f, 24.142324f, 34.798885f, 26.528053f, 37.384544f)
generalPath!!.lineTo(30.395567f, 34.722366f)
generalPath!!.curveTo(28.634237f, 31.171968f, 25.891142f, 26.577557f, 22.565008f, 21.745474f)
generalPath!!.curveTo(16.561094f, 13.023205f, 10.607438f, 6.378291f, 8.252501f, 5.590012f)
generalPath!!.curveTo(8.18023f, 5.5671086f, 8.083313f, 5.536959f, 8.018113f, 5.5255275f)
generalPath!!.curveTo(7.9722757f, 5.5185456f, 7.9043655f, 5.52092f, 7.862244f, 5.5199065f)
generalPath!!.curveTo(7.796054f, 5.520212f, 7.7111893f, 5.533879f, 7.6548076f, 5.5497823f)
generalPath!!.curveTo(7.641025f, 5.554251f, 7.598818f, 5.55428f, 7.5856624f, 5.5597405f)
generalPath!!.curveTo(7.572823f, 5.565697f, 7.5463f, 5.58828f, 7.534096f, 5.5952363f)
generalPath!!.curveTo(7.528154f, 5.598964f, 7.514095f, 5.609004f, 7.5083127f, 5.6129837f)
generalPath!!.curveTo(7.5025306f, 5.616964f, 7.488133f, 5.626512f, 7.4825296f, 5.6307316f)
generalPath!!.curveTo(7.471675f, 5.639648f, 7.4411106f, 5.6563606f, 7.4309626f, 5.6662273f)
generalPath!!.curveTo(7.421165f, 5.6765656f, 7.4060698f, 5.715981f, 7.396974f, 5.72726f)
generalPath!!.curveTo(7.36199f, 5.774247f, 7.3189254f, 5.8486404f, 7.295009f, 5.910359f)
generalPath!!.curveTo(7.2809167f, 5.9500666f, 7.2544537f, 6.012654f, 7.2446103f, 6.0579634f)
generalPath!!.curveTo(7.232011f, 6.122947f, 7.225572f, 6.224241f, 7.2211637f, 6.299926f)
generalPath!!.curveTo(7.11673f, 8.781096f, 11.19814f, 16.71476f, 17.202055f, 25.437027f)
generalPath!!.curveTo(17.575632f, 25.979746f, 17.93728f, 26.520197f, 18.309496f, 27.045877f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(13.743778f, 20.854607f)
generalPath!!.curveTo(14.490825f, 21.902176f, 15.264732f, 22.908716f, 15.999685f, 23.855883f)
generalPath!!.lineTo(21.414206f, 20.128834f)
generalPath!!.curveTo(20.528967f, 18.671322f, 19.545881f, 17.138575f, 18.484474f, 15.596602f)
generalPath!!.curveTo(13.418672f, 8.237188f, 8.191582f, 2.7719285f, 5.9415207f, 2.2879093f)
generalPath!!.curveTo(5.921755f, 2.284001f, 5.8740907f, 2.2754467f, 5.8547974f, 2.2723305f)
generalPath!!.curveTo(5.8357406f, 2.2696111f, 5.786651f, 2.2586727f, 5.7680736f, 2.2567518f)
generalPath!!.curveTo(5.722229f, 2.2529485f, 5.654997f, 2.249885f, 5.612204f, 2.2511306f)
generalPath!!.curveTo(5.5953336f, 2.2520366f, 5.5594306f, 2.259366f, 5.543059f, 2.261089f)
generalPath!!.curveTo(5.494695f, 2.2674897f, 5.422768f, 2.2848985f, 5.378985f, 2.298754f)
generalPath!!.curveTo(5.364648f, 2.3037906f, 5.3236556f, 2.3028367f, 5.3098397f, 2.3087125f)
generalPath!!.curveTo(5.289508f, 2.3181574f, 5.2516346f, 2.3506057f, 5.2324896f, 2.361956f)
generalPath!!.curveTo(5.2262406f, 2.365952f, 5.212821f, 2.3754945f, 5.2067056f, 2.379704f)
generalPath!!.curveTo(5.2005906f, 2.3839133f, 5.1868863f, 2.3930414f, 5.1809225f, 2.3974514f)
generalPath!!.curveTo(5.1634846f, 2.411283f, 5.119654f, 2.435075f, 5.103572f, 2.4506953f)
generalPath!!.curveTo(5.093151f, 2.461503f, 5.0794067f, 2.5001342f, 5.069584f, 2.5117283f)
generalPath!!.curveTo(5.0410094f, 2.5476797f, 4.9990687f, 2.608651f, 4.975823f, 2.6515422f)
generalPath!!.curveTo(4.9683685f, 2.6662195f, 4.948704f, 2.6971397f, 4.9418344f, 2.7125752f)
generalPath!!.curveTo(4.925393f, 2.752103f, 4.9042516f, 2.8159978f, 4.8914366f, 2.860179f)
generalPath!!.curveTo(4.886598f, 2.8782182f, 4.87929f, 2.9279776f, 4.8750267f, 2.9467492f)
generalPath!!.curveTo(4.871049f, 2.9658837f, 4.8620224f, 3.0134604f, 4.8586164f, 3.0333192f)
generalPath!!.curveTo(4.5074186f, 5.307897f, 7.7463174f, 12.141716f, 12.812121f, 19.50113f)
generalPath!!.curveTo(13.127326f, 19.959047f, 13.428214f, 20.4121f, 13.743778f, 20.854607f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(28.24468421936035, 60.44550323486328), Point2D.Double(28.24468421936035, 68.22488403320312), floatArrayOf(0.0f,0.31578946f,1.0f), arrayOf((colorFilter?.filter(Color(91, 144, 200, 255)) ?: Color(91, 144, 200, 255)),(colorFilter?.filter(Color(143, 176, 209, 255)) ?: Color(143, 176, 209, 255)),(colorFilter?.filter(Color(52, 103, 157, 255)) ?: Color(52, 103, 157, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.4933040142059326f, -0.7166540026664734f, 0.7166540026664734f, -0.4933040142059326f, -9.267809867858887f, 79.41919708251953f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(52, 101, 164, 255)) ?: Color(52, 101, 164, 255)
stroke = BasicStroke(0.9999997f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(13.743778f, 20.854607f)
generalPath!!.curveTo(14.490825f, 21.902176f, 15.264732f, 22.908716f, 15.999685f, 23.855883f)
generalPath!!.lineTo(21.414206f, 20.128834f)
generalPath!!.curveTo(20.528967f, 18.671322f, 19.545881f, 17.138575f, 18.484474f, 15.596602f)
generalPath!!.curveTo(13.418672f, 8.237188f, 8.191582f, 2.7719285f, 5.9415207f, 2.2879093f)
generalPath!!.curveTo(5.921755f, 2.284001f, 5.8740907f, 2.2754467f, 5.8547974f, 2.2723305f)
generalPath!!.curveTo(5.8357406f, 2.2696111f, 5.786651f, 2.2586727f, 5.7680736f, 2.2567518f)
generalPath!!.curveTo(5.722229f, 2.2529485f, 5.654997f, 2.249885f, 5.612204f, 2.2511306f)
generalPath!!.curveTo(5.5953336f, 2.2520366f, 5.5594306f, 2.259366f, 5.543059f, 2.261089f)
generalPath!!.curveTo(5.494695f, 2.2674897f, 5.422768f, 2.2848985f, 5.378985f, 2.298754f)
generalPath!!.curveTo(5.364648f, 2.3037906f, 5.3236556f, 2.3028367f, 5.3098397f, 2.3087125f)
generalPath!!.curveTo(5.289508f, 2.3181574f, 5.2516346f, 2.3506057f, 5.2324896f, 2.361956f)
generalPath!!.curveTo(5.2262406f, 2.365952f, 5.212821f, 2.3754945f, 5.2067056f, 2.379704f)
generalPath!!.curveTo(5.2005906f, 2.3839133f, 5.1868863f, 2.3930414f, 5.1809225f, 2.3974514f)
generalPath!!.curveTo(5.1634846f, 2.411283f, 5.119654f, 2.435075f, 5.103572f, 2.4506953f)
generalPath!!.curveTo(5.093151f, 2.461503f, 5.0794067f, 2.5001342f, 5.069584f, 2.5117283f)
generalPath!!.curveTo(5.0410094f, 2.5476797f, 4.9990687f, 2.608651f, 4.975823f, 2.6515422f)
generalPath!!.curveTo(4.9683685f, 2.6662195f, 4.948704f, 2.6971397f, 4.9418344f, 2.7125752f)
generalPath!!.curveTo(4.925393f, 2.752103f, 4.9042516f, 2.8159978f, 4.8914366f, 2.860179f)
generalPath!!.curveTo(4.886598f, 2.8782182f, 4.87929f, 2.9279776f, 4.8750267f, 2.9467492f)
generalPath!!.curveTo(4.871049f, 2.9658837f, 4.8620224f, 3.0134604f, 4.8586164f, 3.0333192f)
generalPath!!.curveTo(4.5074186f, 5.307897f, 7.7463174f, 12.141716f, 12.812121f, 19.50113f)
generalPath!!.curveTo(13.127326f, 19.959047f, 13.428214f, 20.4121f, 13.743778f, 20.854607f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.2003446f, 8.018811f)
generalPath!!.lineTo(10.016292f, 5.3921294f)
generalPath!!.curveTo(7.991423f, 3.1273553f, 6.163735f, 1.7285397f, 5.1772695f, 1.7848891f)
generalPath!!.curveTo(5.1709747f, 1.7853731f, 5.1469803f, 1.7864435f, 5.1407557f, 1.7870493f)
generalPath!!.curveTo(5.1346025f, 1.7877759f, 5.1103263f, 1.7883613f, 5.104243f, 1.7892089f)
generalPath!!.curveTo(5.098231f, 1.7901787f, 5.0736694f, 1.7902766f, 5.0677285f, 1.7913684f)
generalPath!!.curveTo(5.032521f, 1.7986523f, 4.975711f, 1.8194528f, 4.943135f, 1.8311831f)
generalPath!!.curveTo(4.93778f, 1.8332626f, 4.922632f, 1.8467262f, 4.9173517f, 1.8489307f)
generalPath!!.curveTo(4.9121466f, 1.85126f, 4.885968f, 1.8486359f, 4.8808393f, 1.8510911f)
generalPath!!.curveTo(4.8757854f, 1.8536721f, 4.860033f, 1.8661321f, 4.8550553f, 1.8688391f)
generalPath!!.curveTo(4.850154f, 1.8716723f, 4.834096f, 1.8836267f, 4.8292723f, 1.8865868f)
generalPath!!.curveTo(4.8245244f, 1.8896735f, 4.8081584f, 1.9011205f, 4.8034887f, 1.9043349f)
generalPath!!.curveTo(4.798819f, 1.9075493f, 4.7822833f, 1.9187498f, 4.7777057f, 1.9220825f)
generalPath!!.curveTo(4.7732177f, 1.9255319f, 4.756318f, 1.9362636f, 4.7519217f, 1.9398305f)
generalPath!!.curveTo(4.747616f, 1.9435138f, 4.7303534f, 1.9537793f, 4.7261386f, 1.9575782f)
generalPath!!.curveTo(4.7220135f, 1.961493f, 4.7151184f, 1.986883f, 4.7110844f, 1.9909135f)
generalPath!!.curveTo(4.70714f, 1.9950587f, 4.6891556f, 2.0044017f, 4.6853013f, 2.008661f)
generalPath!!.curveTo(4.6627135f, 2.0349023f, 4.6230016f, 2.080542f, 4.603627f, 2.1108296f)
generalPath!!.curveTo(4.600487f, 2.1159885f, 4.5916266f, 2.1388962f, 4.5885744f, 2.1441658f)
generalPath!!.curveTo(4.585611f, 2.1495457f, 4.5763965f, 2.1720133f, 4.5735207f, 2.177502f)
generalPath!!.curveTo(4.570733f, 2.1830995f, 4.561167f, 2.2051303f, 4.5584674f, 2.2108374f)
generalPath!!.curveTo(4.1536427f, 3.1121736f, 4.807748f, 5.3188167f, 6.2003446f, 8.018811f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(28.24468421936035, 60.44550323486328), Point2D.Double(28.24468421936035, 68.22488403320312), floatArrayOf(0.0f,0.31578946f,1.0f), arrayOf((colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)),(colorFilter?.filter(Color(165, 191, 218, 255)) ?: Color(165, 191, 218, 255)),(colorFilter?.filter(Color(55, 108, 164, 255)) ?: Color(55, 108, 164, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.4933040142059326f, -0.7166540026664734f, 0.7166540026664734f, -0.4933040142059326f, -9.267809867858887f, 79.41919708251953f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(52, 101, 164, 255)) ?: Color(52, 101, 164, 255)
stroke = BasicStroke(0.9999997f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.2003446f, 8.018811f)
generalPath!!.lineTo(10.016292f, 5.3921294f)
generalPath!!.curveTo(7.991423f, 3.1273553f, 6.163735f, 1.7285397f, 5.1772695f, 1.7848891f)
generalPath!!.curveTo(5.1709747f, 1.7853731f, 5.1469803f, 1.7864435f, 5.1407557f, 1.7870493f)
generalPath!!.curveTo(5.1346025f, 1.7877759f, 5.1103263f, 1.7883613f, 5.104243f, 1.7892089f)
generalPath!!.curveTo(5.098231f, 1.7901787f, 5.0736694f, 1.7902766f, 5.0677285f, 1.7913684f)
generalPath!!.curveTo(5.032521f, 1.7986523f, 4.975711f, 1.8194528f, 4.943135f, 1.8311831f)
generalPath!!.curveTo(4.93778f, 1.8332626f, 4.922632f, 1.8467262f, 4.9173517f, 1.8489307f)
generalPath!!.curveTo(4.9121466f, 1.85126f, 4.885968f, 1.8486359f, 4.8808393f, 1.8510911f)
generalPath!!.curveTo(4.8757854f, 1.8536721f, 4.860033f, 1.8661321f, 4.8550553f, 1.8688391f)
generalPath!!.curveTo(4.850154f, 1.8716723f, 4.834096f, 1.8836267f, 4.8292723f, 1.8865868f)
generalPath!!.curveTo(4.8245244f, 1.8896735f, 4.8081584f, 1.9011205f, 4.8034887f, 1.9043349f)
generalPath!!.curveTo(4.798819f, 1.9075493f, 4.7822833f, 1.9187498f, 4.7777057f, 1.9220825f)
generalPath!!.curveTo(4.7732177f, 1.9255319f, 4.756318f, 1.9362636f, 4.7519217f, 1.9398305f)
generalPath!!.curveTo(4.747616f, 1.9435138f, 4.7303534f, 1.9537793f, 4.7261386f, 1.9575782f)
generalPath!!.curveTo(4.7220135f, 1.961493f, 4.7151184f, 1.986883f, 4.7110844f, 1.9909135f)
generalPath!!.curveTo(4.70714f, 1.9950587f, 4.6891556f, 2.0044017f, 4.6853013f, 2.008661f)
generalPath!!.curveTo(4.6627135f, 2.0349023f, 4.6230016f, 2.080542f, 4.603627f, 2.1108296f)
generalPath!!.curveTo(4.600487f, 2.1159885f, 4.5916266f, 2.1388962f, 4.5885744f, 2.1441658f)
generalPath!!.curveTo(4.585611f, 2.1495457f, 4.5763965f, 2.1720133f, 4.5735207f, 2.177502f)
generalPath!!.curveTo(4.570733f, 2.1830995f, 4.561167f, 2.2051303f, 4.5584674f, 2.2108374f)
generalPath!!.curveTo(4.1536427f, 3.1121736f, 4.807748f, 5.3188167f, 6.2003446f, 8.018811f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.35714284f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
paint = LinearGradientPaint(Point2D.Double(55.87603759765625, 62.4019889831543), Point2D.Double(38.06135559082031, 62.827091217041016), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.4933040142059326f, -0.7166540026664734f, 0.7166540026664734f, -0.4933040142059326f, -9.267809867858887f, 79.41919708251953f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(15.417724f, 21.244087f)
generalPath!!.curveTo(15.60655f, 21.511402f, 15.795857f, 21.760462f, 15.983434f, 22.02224f)
generalPath!!.lineTo(19.733027f, 19.438211f)
generalPath!!.curveTo(19.219873f, 18.65987f, 18.496328f, 17.390278f, 17.956781f, 16.581053f)
generalPath!!.curveTo(11.744978f, 7.264434f, 5.6568522f, 2.6091151f, 5.40304f, 2.7829475f)
generalPath!!.curveTo(5.1238437f, 2.974165f, 7.567532f, 10.260041f, 13.900362f, 19.06121f)
generalPath!!.curveTo(14.272182f, 19.577953f, 15.059948f, 20.737597f, 15.417724f, 21.244087f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(37.125f, 20.0f)
generalPath!!.lineTo(34.25f, 41.375f)
generalPath!!.curveTo(33.333332f, 46.57216f, 16.041668f, 46.628963f, 15.0f, 41.375f)
generalPath!!.lineTo(12.036612f, 20.007584f)
generalPath!!.curveTo(13.877231f, 26.876867f, 36.02941f, 27.218151f, 37.125f, 20.0f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(15.375, 26.0846004486084), Point2D.Double(34.25041580200195, 26.0846004486084), floatArrayOf(0.0f,0.2631579f,0.7479224f,1.0f), arrayOf((colorFilter?.filter(Color(245, 245, 245, 23)) ?: Color(245, 245, 245, 23)),(colorFilter?.filter(Color(255, 255, 255, 230)) ?: Color(255, 255, 255, 230)),(colorFilter?.filter(Color(199, 199, 199, 117)) ?: Color(199, 199, 199, 117)),(colorFilter?.filter(Color(255, 255, 255, 199)) ?: Color(255, 255, 255, 199))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 5.625f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(30.875, 19.4596004486084), Point2D.Double(15.625, 19.0846004486084), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(149, 151, 145, 255)) ?: Color(149, 151, 145, 255)),(colorFilter?.filter(Color(248, 248, 248, 255)) ?: Color(248, 248, 248, 255)),(colorFilter?.filter(Color(140, 140, 140, 255)) ?: Color(140, 140, 140, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 5.625f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(37.125f, 20.0f)
generalPath!!.lineTo(34.25f, 41.375f)
generalPath!!.curveTo(33.333332f, 46.57216f, 16.041668f, 46.628963f, 15.0f, 41.375f)
generalPath!!.lineTo(12.036612f, 20.007584f)
generalPath!!.curveTo(13.877231f, 26.876867f, 36.02941f, 27.218151f, 37.125f, 20.0f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.72527474f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.48186f, 2.524195f)
generalPath!!.lineTo(35.708893f, 7.3855543f)
generalPath!!.lineTo(27.400389f, 24.665476f)
generalPath!!.lineTo(36.10664f, 7.8716903f)
generalPath!!.lineTo(40.48186f, 2.524195f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.41758242f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.34928f, 2.524195f)
generalPath!!.lineTo(39.465397f, 9.24171f)
generalPath!!.lineTo(32.70369f, 23.64901f)
generalPath!!.lineTo(39.244427f, 9.1975155f)
generalPath!!.lineTo(38.714096f, 9.285904f)
generalPath!!.lineTo(40.34928f, 2.524195f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.473166f, 25.284195f)
generalPath!!.lineTo(19.445436f, 44.199303f)
generalPath!!.lineTo(22.715805f, 44.72963f)
generalPath!!.lineTo(22.892582f, 25.814526f)
generalPath!!.lineTo(18.473166f, 25.284195f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(20.06415557861328, 27.140348434448242), Point2D.Double(20.682872772216797, 44.11091232299805), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
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
            return 1.2306827306747437
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.0
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 40.37824249267578
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 47.78398895263672
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return Applications_office(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Applications_office(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Applications_office(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

    override fun setColorFilter(colorFilter: NeonIcon.ColorFilter?) {
        this.colorFilter = colorFilter
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

