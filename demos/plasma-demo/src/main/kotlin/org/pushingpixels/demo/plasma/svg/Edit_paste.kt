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
class Edit_paste private constructor(private var width: Int, private var height: Int)
       : ResizableIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
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
g.transform(AffineTransform(0.9133830070495605f, 0.0f, 0.0f, 1.1788920164108276f, 1.9209460020065308f, -8.110469818115234f))
// _0_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(45.658894, 45.272587)
(shape as GeneralPath).curveTo(45.692566, 46.105114, 41.695236, 46.876003, 35.180527, 47.293343)
(shape as GeneralPath).curveTo(28.665815, 47.710686, 20.629627, 47.710686, 14.114916, 47.293343)
(shape as GeneralPath).curveTo(7.600205, 46.876003, 3.6028783, 46.105114, 3.636549, 45.272587)
(shape as GeneralPath).curveTo(3.6028783, 44.44006, 7.600205, 43.66917, 14.114916, 43.25183)
(shape as GeneralPath).curveTo(20.629627, 42.834488, 28.665815, 42.834488, 35.180527, 43.25183)
(shape as GeneralPath).curveTo(41.695236, 43.66917, 45.692566, 44.44006, 45.658894, 45.272587)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(24.647722244262695, 45.272586822509766), 21.011173f, Point2D.Double(24.647722244262695, 45.272586822509766), floatArrayOf(0.0f,1.0f), arrayOf(Color(100, 100, 89, 255),Color(100, 100, 89, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.11057700216770172f, 4.9873299934333204E-17f, 40.2664794921875f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
shape = RoundRectangle2D.Double(4.464317321777344, 4.5, 39.035682678222656, 41.04543685913086, 2.775874137878418, 2.7758727073669434)
paint = LinearGradientPaint(Point2D.Double(6.107174396514893, 10.451290130615234), Point2D.Double(33.85714340209961, 37.879859924316406), floatArrayOf(0.0f,1.0f), arrayOf(Color(198, 136, 39, 255),Color(137, 96, 31, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = Color(113, 76, 22, 255)
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
paint = LinearGradientPaint(Point2D.Double(22.308330535888672, 18.99213981628418), Point2D.Double(35.78529357910156, 39.49823760986328), floatArrayOf(0.0f,0.59928656f,0.82758623f,1.0f), arrayOf(Color(240, 240, 239, 255),Color(232, 232, 232, 255),Color(255, 255, 255, 255),Color(216, 216, 211, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0656980276107788f, 0.0f, 0.0f, 0.9875950217247009f, -1.564439058303833f, 0.07487332075834274f))
g.paint = paint
g.fill(shape)
paint = Color(136, 138, 133, 255)
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
paint = Color(92, 92, 92, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(26.076091766357422, 26.69667625427246), Point2D.Double(30.811172485351562, 42.00735092163086), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
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
paint = Color(198, 136, 39, 255)
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
paint = Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
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
paint = LinearGradientPaint(Point2D.Double(25.404571533203125, 3.818019390106201), Point2D.Double(25.464210510253906, 9.32335090637207), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(151, 151, 138, 255),Color(194, 194, 185, 255),Color(125, 125, 111, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0526319742202759f, 0.0f, 0.0f, 1.0f, -1.7894740104675293f, 0.0f))
g.paint = paint
g.fill(shape)
paint = Color(92, 92, 92, 255)
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
paint = LinearGradientPaint(Point2D.Double(25.404571533203125, 3.818019390106201), Point2D.Double(25.404571533203125, 6.481060981750488), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(151, 151, 138, 255),Color(194, 194, 185, 255),Color(125, 125, 111, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.5387430191040039f, 0.0f, 0.0f, 0.5118060111999512f, 10.800800323486328f, -0.5826399922370911f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
shape = RoundRectangle2D.Double(14.953014373779297, 3.9375, 18.093992233276367, 6.1875, 2.0258727073669434, 2.0258727073669434)
paint = LinearGradientPaint(Point2D.Double(25.404571533203125, 3.818019390106201), Point2D.Double(25.464210510253906, 9.32335090637207), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(151, 151, 138, 255),Color(194, 194, 185, 255),Color(125, 125, 111, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.005221962928772f, 0.0f, 0.0f, 0.8839280009269714f, -0.6279230117797852f, 0.84375f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.48863637f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
shape = GeneralPath()
(shape as GeneralPath).moveTo(39.018307, 36.25)
(shape as GeneralPath).lineTo(39.0625, 42.0625)
(shape as GeneralPath).lineTo(30.5625, 42.018307)
(shape as GeneralPath).lineTo(39.018307, 36.25)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(36.8125, 39.15625), Point2D.Double(39.0625, 42.0625), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
shape = GeneralPath()
(shape as GeneralPath).moveTo(30.059082, 42.086864)
(shape as GeneralPath).curveTo(31.850224, 42.254517, 39.04881, 37.717278, 39.53992, 33.698856)
(shape as GeneralPath).curveTo(37.97666, 36.121952, 34.584972, 35.667446, 30.476213, 35.826454)
(shape as GeneralPath).curveTo(30.476213, 35.826454, 30.871582, 41.586864, 30.059082, 42.086864)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(35.99658203125, 40.458221435546875), Point2D.Double(33.664920806884766, 37.770721435546875), floatArrayOf(0.0f,1.0f), arrayOf(Color(124, 124, 124, 255),Color(184, 184, 184, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = Color(134, 138, 132, 255)
stroke = BasicStroke(1.0000002f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(30.059082, 42.086864)
(shape as GeneralPath).curveTo(31.850224, 42.254517, 39.04881, 37.717278, 39.53992, 33.698856)
(shape as GeneralPath).curveTo(37.97666, 36.121952, 34.584972, 35.667446, 30.476213, 35.826454)
(shape as GeneralPath).curveTo(30.476213, 35.826454, 30.871582, 41.586864, 30.059082, 42.086864)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.31681818f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
paint = LinearGradientPaint(Point2D.Double(25.682828903198242, 12.172059059143066), Point2D.Double(25.692169189453125, -0.2029409557580948), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.99999994f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(19.46875, 1.46875)
(shape as GeneralPath).curveTo(19.466654, 1.4708456, 19.470413, 1.4975336, 19.46875, 1.5)
(shape as GeneralPath).curveTo(19.46758, 1.502776, 19.438116, 1.4969757, 19.4375, 1.5)
(shape as GeneralPath).lineTo(19.4375, 4.375)
(shape as GeneralPath).curveTo(19.4375, 4.381423, 19.46641, 4.400698, 19.46875, 4.40625)
(shape as GeneralPath).curveTo(19.471216, 4.4079137, 19.465975, 4.43633, 19.46875, 4.4375)
(shape as GeneralPath).lineTo(15.9375, 4.4375)
(shape as GeneralPath).curveTo(15.91974, 4.4375, 15.892285, 4.4357553, 15.875, 4.4375)
(shape as GeneralPath).curveTo(15.840968, 4.4426713, 15.781454, 4.4572763, 15.75, 4.46875)
(shape as GeneralPath).curveTo(15.611832, 4.5269966, 15.482328, 4.66777, 15.4375, 4.8125)
(shape as GeneralPath).curveTo(15.426991, 4.8535347, 15.4375, 4.924349, 15.4375, 4.96875)
(shape as GeneralPath).lineTo(15.4375, 9.125)
(shape as GeneralPath).curveTo(15.4375, 9.14276, 15.435755, 9.170215, 15.4375, 9.1875)
(shape as GeneralPath).curveTo(15.442671, 9.221532, 15.457276, 9.281046, 15.46875, 9.3125)
(shape as GeneralPath).curveTo(15.478458, 9.335528, 15.487176, 9.3851, 15.5, 9.40625)
(shape as GeneralPath).curveTo(15.5046, 9.41307, 15.526336, 9.430921, 15.53125, 9.4375)
(shape as GeneralPath).curveTo(15.552124, 9.462814, 15.599686, 9.510377, 15.625, 9.53125)
(shape as GeneralPath).curveTo(15.638159, 9.541079, 15.6734, 9.55395, 15.6875, 9.5625)
(shape as GeneralPath).curveTo(15.702038, 9.570378, 15.734648, 9.587278, 15.75, 9.59375)
(shape as GeneralPath).curveTo(15.781454, 9.605224, 15.840968, 9.619829, 15.875, 9.625)
(shape as GeneralPath).curveTo(15.892285, 9.626745, 15.91974, 9.625, 15.9375, 9.625)
(shape as GeneralPath).lineTo(32.0625, 9.625)
(shape as GeneralPath).curveTo(32.08026, 9.625, 32.107716, 9.626745, 32.125, 9.625)
(shape as GeneralPath).curveTo(32.15903, 9.619829, 32.218548, 9.605224, 32.25, 9.59375)
(shape as GeneralPath).curveTo(32.26535, 9.587278, 32.297962, 9.570378, 32.3125, 9.5625)
(shape as GeneralPath).curveTo(32.3266, 9.55395, 32.36184, 9.541079, 32.375, 9.53125)
(shape as GeneralPath).curveTo(32.400314, 9.510377, 32.447876, 9.462814, 32.46875, 9.4375)
(shape as GeneralPath).curveTo(32.473663, 9.430921, 32.4954, 9.41307, 32.5, 9.40625)
(shape as GeneralPath).curveTo(32.512825, 9.3851, 32.52154, 9.335528, 32.53125, 9.3125)
(shape as GeneralPath).curveTo(32.542725, 9.281046, 32.557327, 9.221532, 32.5625, 9.1875)
(shape as GeneralPath).curveTo(32.564243, 9.170215, 32.5625, 9.14276, 32.5625, 9.125)
(shape as GeneralPath).lineTo(32.5625, 4.96875)
(shape as GeneralPath).curveTo(32.5625, 4.924349, 32.57301, 4.8535347, 32.5625, 4.8125)
(shape as GeneralPath).curveTo(32.517673, 4.66777, 32.38817, 4.5269966, 32.25, 4.46875)
(shape as GeneralPath).curveTo(32.218548, 4.4572763, 32.15903, 4.4426713, 32.125, 4.4375)
(shape as GeneralPath).curveTo(32.107716, 4.4357553, 32.08026, 4.4375, 32.0625, 4.4375)
(shape as GeneralPath).lineTo(28.53125, 4.4375)
(shape as GeneralPath).curveTo(28.534025, 4.43633, 28.528784, 4.4079137, 28.53125, 4.40625)
(shape as GeneralPath).curveTo(28.53359, 4.400698, 28.5625, 4.381423, 28.5625, 4.375)
(shape as GeneralPath).lineTo(28.5625, 1.5)
(shape as GeneralPath).curveTo(28.561884, 1.4969757, 28.53242, 1.502776, 28.53125, 1.5)
(shape as GeneralPath).curveTo(28.529587, 1.4975336, 28.533346, 1.4708456, 28.53125, 1.46875)
(shape as GeneralPath).curveTo(28.528475, 1.4675798, 28.503023, 1.4693657, 28.5, 1.46875)
(shape as GeneralPath).lineTo(19.5, 1.46875)
(shape as GeneralPath).curveTo(19.496977, 1.4693657, 19.471525, 1.4675798, 19.46875, 1.46875)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.3693182f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
paint = LinearGradientPaint(Point2D.Double(33.39600372314453, 36.92133331298828), Point2D.Double(34.170047760009766, 38.07038116455078), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.9999998f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(31.50952, 40.68705)
(shape as GeneralPath).curveTo(32.8793, 40.00322, 36.038784, 38.086018, 37.338165, 36.205013)
(shape as GeneralPath).curveTo(35.545643, 36.581497, 34.347244, 36.794586, 31.610577, 36.900494)
(shape as GeneralPath).curveTo(31.610577, 36.900494, 31.697138, 39.91208, 31.50952, 40.68705)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.17045455f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14
shape = Rectangle2D.Double(14.0, 15.0, 21.0, 2.0)
paint = Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.17045455f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
shape = Rectangle2D.Double(14.0, 19.0, 20.0, 2.0)
paint = Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.17045455f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16
shape = Rectangle2D.Double(14.0, 23.0, 18.0, 2.0)
paint = Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.17045455f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_17
shape = Rectangle2D.Double(14.0, 27.0, 21.0, 2.0)
paint = Color(0, 0, 0, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.17045455f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_18
shape = Rectangle2D.Double(14.0, 31.0, 13.0, 2.0)
paint = Color(0, 0, 0, 255)
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
        fun of(width: Int, height: Int): ResizableIcon {
            return Edit_paste(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Edit_paste(width, height))
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

    override fun setDimension(newDimension: Dimension) {
        width = newDimension.width
        height = newDimension.height
    }

    override fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
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

