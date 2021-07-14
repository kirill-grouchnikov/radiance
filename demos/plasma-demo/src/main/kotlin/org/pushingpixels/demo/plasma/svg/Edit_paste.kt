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
class Edit_paste private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9133830070495605f, 0.0f, 0.0f, 1.1788920164108276f, 1.9209460020065308f, -8.110469818115234f))
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(45.658894f, 45.272587f)
generalPath!!.curveTo(45.692566f, 46.105114f, 41.695236f, 46.876003f, 35.180527f, 47.293343f)
generalPath!!.curveTo(28.665815f, 47.710686f, 20.629627f, 47.710686f, 14.114916f, 47.293343f)
generalPath!!.curveTo(7.600205f, 46.876003f, 3.6028783f, 46.105114f, 3.636549f, 45.272587f)
generalPath!!.curveTo(3.6028783f, 44.44006f, 7.600205f, 43.66917f, 14.114916f, 43.25183f)
generalPath!!.curveTo(20.629627f, 42.834488f, 28.665815f, 42.834488f, 35.180527f, 43.25183f)
generalPath!!.curveTo(41.695236f, 43.66917f, 45.692566f, 44.44006f, 45.658894f, 45.272587f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.647722244262695, 45.272586822509766), 21.011173f, Point2D.Double(24.647722244262695, 45.272586822509766), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(100, 100, 89, 255)) ?: Color(100, 100, 89, 255)),(colorFilter?.filter(Color(100, 100, 89, 0)) ?: Color(100, 100, 89, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.11057700216770172f, 4.9873299934333204E-17f, 40.2664794921875f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
shape = RoundRectangle2D.Double(4.464317321777344, 4.5, 39.035682678222656, 41.04543685913086, 2.775874137878418, 2.7758727073669434)
paint = LinearGradientPaint(Point2D.Double(6.107174396514893, 10.451290130615234), Point2D.Double(33.85714340209961, 37.879859924316406), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(198, 136, 39, 255)) ?: Color(198, 136, 39, 255)),(colorFilter?.filter(Color(137, 96, 31, 255)) ?: Color(137, 96, 31, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(113, 76, 22, 255)) ?: Color(113, 76, 22, 255)
stroke = BasicStroke(0.99999976f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(4.464317321777344, 4.5, 39.035682678222656, 41.04543685913086, 2.775874137878418, 2.7758727073669434)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
shape = RoundRectangle2D.Double(8.53232192993164, 6.529515743255615, 30.95155906677246, 35.976688385009766, 1.1330167055130005, 1.1330167055130005)
paint = LinearGradientPaint(Point2D.Double(22.308330535888672, 18.99213981628418), Point2D.Double(35.78529357910156, 39.49823760986328), floatArrayOf(0.0f,0.59928656f,0.82758623f,1.0f), arrayOf((colorFilter?.filter(Color(240, 240, 239, 255)) ?: Color(240, 240, 239, 255)),(colorFilter?.filter(Color(232, 232, 232, 255)) ?: Color(232, 232, 232, 255)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(216, 216, 211, 255)) ?: Color(216, 216, 211, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0656980276107788f, 0.0f, 0.0f, 0.9875950217247009f, -1.564439058303833f, 0.07487332075834274f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 138, 133, 255)) ?: Color(136, 138, 133, 255)
stroke = BasicStroke(1.0000002f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(8.53232192993164, 6.529515743255615, 30.95155906677246, 35.976688385009766, 1.1330167055130005, 1.1330167055130005)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
shape = RoundRectangle2D.Double(18.0, 0.0, 12.0, 4.0, 1.9677506685256958, 1.9677506685256958)
paint = colorFilter?.filter(Color(92, 92, 92, 255)) ?: Color(92, 92, 92, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(26.076091766357422, 26.69667625427246), Point2D.Double(30.811172485351562, 42.00735092163086), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0000005f,0,0,4.0f,null,0.0f)
shape = Rectangle2D.Double(9.517141342163086, 7.466585636138916, 29.01414680480957, 34.04076385498047)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = colorFilter?.filter(Color(198, 136, 39, 255)) ?: Color(198, 136, 39, 255)
stroke = BasicStroke(0.99999976f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(5.439342498779297, 5.430777549743652, 37.085655212402344, 39.092987060546875, 0.9575969576835632, 0.9575969576835632)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.10795455f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
shape = RoundRectangle2D.Double(14.791487693786621, 4.472271919250488, 18.947376251220703, 7.0, 2.7758753299713135, 2.7758727073669434)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000001f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(14.791487693786621, 4.472271919250488, 18.947376251220703, 7.0, 2.7758753299713135, 2.7758727073669434)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
shape = RoundRectangle2D.Double(14.526322364807129, 3.5, 18.947376251220703, 7.0, 2.7758753299713135, 2.7758727073669434)
paint = LinearGradientPaint(Point2D.Double(25.404571533203125, 3.818019390106201), Point2D.Double(25.464210510253906, 9.32335090637207), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(151, 151, 138, 255)) ?: Color(151, 151, 138, 255)),(colorFilter?.filter(Color(194, 194, 185, 255)) ?: Color(194, 194, 185, 255)),(colorFilter?.filter(Color(125, 125, 111, 255)) ?: Color(125, 125, 111, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0526319742202759f, 0.0f, 0.0f, 1.0f, -1.7894740104675293f, 0.0f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(92, 92, 92, 255)) ?: Color(92, 92, 92, 255)
stroke = BasicStroke(1.0000001f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(14.526322364807129, 3.5, 18.947376251220703, 7.0, 2.7758753299713135, 2.7758727073669434)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
shape = RoundRectangle2D.Double(19.151323318481445, 1.20867919921875, 9.697376251220703, 3.5826404094696045, 0.6508727073669434, 0.6508727073669434)
paint = LinearGradientPaint(Point2D.Double(25.404571533203125, 3.818019390106201), Point2D.Double(25.404571533203125, 6.481060981750488), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(151, 151, 138, 255)) ?: Color(151, 151, 138, 255)),(colorFilter?.filter(Color(194, 194, 185, 255)) ?: Color(194, 194, 185, 255)),(colorFilter?.filter(Color(125, 125, 111, 255)) ?: Color(125, 125, 111, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.5387430191040039f, 0.0f, 0.0f, 0.5118060111999512f, 10.800800323486328f, -0.5826399922370911f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
shape = RoundRectangle2D.Double(14.953014373779297, 3.9375, 18.093992233276367, 6.1875, 2.0258727073669434, 2.0258727073669434)
paint = LinearGradientPaint(Point2D.Double(25.404571533203125, 3.818019390106201), Point2D.Double(25.464210510253906, 9.32335090637207), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(151, 151, 138, 255)) ?: Color(151, 151, 138, 255)),(colorFilter?.filter(Color(194, 194, 185, 255)) ?: Color(194, 194, 185, 255)),(colorFilter?.filter(Color(125, 125, 111, 255)) ?: Color(125, 125, 111, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.005221962928772f, 0.0f, 0.0f, 0.8839280009269714f, -0.6279230117797852f, 0.84375f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.48863637f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.018307f, 36.25f)
generalPath!!.lineTo(39.0625f, 42.0625f)
generalPath!!.lineTo(30.5625f, 42.018307f)
generalPath!!.lineTo(39.018307f, 36.25f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(36.8125, 39.15625), Point2D.Double(39.0625, 42.0625), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(30.059082f, 42.086864f)
generalPath!!.curveTo(31.850224f, 42.254517f, 39.04881f, 37.717278f, 39.53992f, 33.698856f)
generalPath!!.curveTo(37.97666f, 36.121952f, 34.584972f, 35.667446f, 30.476213f, 35.826454f)
generalPath!!.curveTo(30.476213f, 35.826454f, 30.871582f, 41.586864f, 30.059082f, 42.086864f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(35.99658203125, 40.458221435546875), Point2D.Double(33.664920806884766, 37.770721435546875), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(124, 124, 124, 255)) ?: Color(124, 124, 124, 255)),(colorFilter?.filter(Color(184, 184, 184, 255)) ?: Color(184, 184, 184, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(134, 138, 132, 255)) ?: Color(134, 138, 132, 255)
stroke = BasicStroke(1.0000002f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(30.059082f, 42.086864f)
generalPath!!.curveTo(31.850224f, 42.254517f, 39.04881f, 37.717278f, 39.53992f, 33.698856f)
generalPath!!.curveTo(37.97666f, 36.121952f, 34.584972f, 35.667446f, 30.476213f, 35.826454f)
generalPath!!.curveTo(30.476213f, 35.826454f, 30.871582f, 41.586864f, 30.059082f, 42.086864f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.31681818f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
paint = LinearGradientPaint(Point2D.Double(25.682828903198242, 12.172059059143066), Point2D.Double(25.692169189453125, -0.2029409557580948), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.99999994f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.46875f, 1.46875f)
generalPath!!.curveTo(19.466654f, 1.4708456f, 19.470413f, 1.4975336f, 19.46875f, 1.5f)
generalPath!!.curveTo(19.46758f, 1.502776f, 19.438116f, 1.4969757f, 19.4375f, 1.5f)
generalPath!!.lineTo(19.4375f, 4.375f)
generalPath!!.curveTo(19.4375f, 4.381423f, 19.46641f, 4.400698f, 19.46875f, 4.40625f)
generalPath!!.curveTo(19.471216f, 4.4079137f, 19.465975f, 4.43633f, 19.46875f, 4.4375f)
generalPath!!.lineTo(15.9375f, 4.4375f)
generalPath!!.curveTo(15.91974f, 4.4375f, 15.892285f, 4.4357553f, 15.875f, 4.4375f)
generalPath!!.curveTo(15.840968f, 4.4426713f, 15.781454f, 4.4572763f, 15.75f, 4.46875f)
generalPath!!.curveTo(15.611832f, 4.5269966f, 15.482328f, 4.66777f, 15.4375f, 4.8125f)
generalPath!!.curveTo(15.426991f, 4.8535347f, 15.4375f, 4.924349f, 15.4375f, 4.96875f)
generalPath!!.lineTo(15.4375f, 9.125f)
generalPath!!.curveTo(15.4375f, 9.14276f, 15.435755f, 9.170215f, 15.4375f, 9.1875f)
generalPath!!.curveTo(15.442671f, 9.221532f, 15.457276f, 9.281046f, 15.46875f, 9.3125f)
generalPath!!.curveTo(15.478458f, 9.335528f, 15.487176f, 9.3851f, 15.5f, 9.40625f)
generalPath!!.curveTo(15.5046f, 9.41307f, 15.526336f, 9.430921f, 15.53125f, 9.4375f)
generalPath!!.curveTo(15.552124f, 9.462814f, 15.599686f, 9.510377f, 15.625f, 9.53125f)
generalPath!!.curveTo(15.638159f, 9.541079f, 15.6734f, 9.55395f, 15.6875f, 9.5625f)
generalPath!!.curveTo(15.702038f, 9.570378f, 15.734648f, 9.587278f, 15.75f, 9.59375f)
generalPath!!.curveTo(15.781454f, 9.605224f, 15.840968f, 9.619829f, 15.875f, 9.625f)
generalPath!!.curveTo(15.892285f, 9.626745f, 15.91974f, 9.625f, 15.9375f, 9.625f)
generalPath!!.lineTo(32.0625f, 9.625f)
generalPath!!.curveTo(32.08026f, 9.625f, 32.107716f, 9.626745f, 32.125f, 9.625f)
generalPath!!.curveTo(32.15903f, 9.619829f, 32.218548f, 9.605224f, 32.25f, 9.59375f)
generalPath!!.curveTo(32.26535f, 9.587278f, 32.297962f, 9.570378f, 32.3125f, 9.5625f)
generalPath!!.curveTo(32.3266f, 9.55395f, 32.36184f, 9.541079f, 32.375f, 9.53125f)
generalPath!!.curveTo(32.400314f, 9.510377f, 32.447876f, 9.462814f, 32.46875f, 9.4375f)
generalPath!!.curveTo(32.473663f, 9.430921f, 32.4954f, 9.41307f, 32.5f, 9.40625f)
generalPath!!.curveTo(32.512825f, 9.3851f, 32.52154f, 9.335528f, 32.53125f, 9.3125f)
generalPath!!.curveTo(32.542725f, 9.281046f, 32.557327f, 9.221532f, 32.5625f, 9.1875f)
generalPath!!.curveTo(32.564243f, 9.170215f, 32.5625f, 9.14276f, 32.5625f, 9.125f)
generalPath!!.lineTo(32.5625f, 4.96875f)
generalPath!!.curveTo(32.5625f, 4.924349f, 32.57301f, 4.8535347f, 32.5625f, 4.8125f)
generalPath!!.curveTo(32.517673f, 4.66777f, 32.38817f, 4.5269966f, 32.25f, 4.46875f)
generalPath!!.curveTo(32.218548f, 4.4572763f, 32.15903f, 4.4426713f, 32.125f, 4.4375f)
generalPath!!.curveTo(32.107716f, 4.4357553f, 32.08026f, 4.4375f, 32.0625f, 4.4375f)
generalPath!!.lineTo(28.53125f, 4.4375f)
generalPath!!.curveTo(28.534025f, 4.43633f, 28.528784f, 4.4079137f, 28.53125f, 4.40625f)
generalPath!!.curveTo(28.53359f, 4.400698f, 28.5625f, 4.381423f, 28.5625f, 4.375f)
generalPath!!.lineTo(28.5625f, 1.5f)
generalPath!!.curveTo(28.561884f, 1.4969757f, 28.53242f, 1.502776f, 28.53125f, 1.5f)
generalPath!!.curveTo(28.529587f, 1.4975336f, 28.533346f, 1.4708456f, 28.53125f, 1.46875f)
generalPath!!.curveTo(28.528475f, 1.4675798f, 28.503023f, 1.4693657f, 28.5f, 1.46875f)
generalPath!!.lineTo(19.5f, 1.46875f)
generalPath!!.curveTo(19.496977f, 1.4693657f, 19.471525f, 1.4675798f, 19.46875f, 1.46875f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.3693182f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
paint = LinearGradientPaint(Point2D.Double(33.39600372314453, 36.92133331298828), Point2D.Double(34.170047760009766, 38.07038116455078), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.9999998f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.50952f, 40.68705f)
generalPath!!.curveTo(32.8793f, 40.00322f, 36.038784f, 38.086018f, 37.338165f, 36.205013f)
generalPath!!.curveTo(35.545643f, 36.581497f, 34.347244f, 36.794586f, 31.610577f, 36.900494f)
generalPath!!.curveTo(31.610577f, 36.900494f, 31.697138f, 39.91208f, 31.50952f, 40.68705f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.17045455f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14
shape = Rectangle2D.Double(14.0, 15.0, 21.0, 2.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.17045455f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
shape = Rectangle2D.Double(14.0, 19.0, 20.0, 2.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.17045455f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16
shape = Rectangle2D.Double(14.0, 23.0, 18.0, 2.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.17045455f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_17
shape = Rectangle2D.Double(14.0, 27.0, 21.0, 2.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.17045455f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_18
shape = Rectangle2D.Double(14.0, 31.0, 13.0, 2.0)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
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
            return 3.9643173217773438
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
            return 40.035682678222656
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 48.0
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return Edit_paste(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Edit_paste(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Edit_paste(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

    override fun supportsColorFilter(): Boolean {
        return true
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

