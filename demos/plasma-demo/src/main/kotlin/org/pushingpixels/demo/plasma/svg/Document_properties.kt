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
class Document_properties private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 0.7836257f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071080207824707f))
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.128307, 42.07798)
generalPath!!.curveTo(40.15366, 43.693268, 37.143654, 45.188953, 32.23805, 45.998688)
generalPath!!.curveTo(27.332438, 46.808426, 21.28115, 46.808426, 16.375542, 45.998688)
generalPath!!.curveTo(11.469933, 45.188953, 8.459927, 43.693268, 8.485281, 42.07798)
generalPath!!.curveTo(8.459927, 40.462692, 11.469933, 38.967007, 16.375542, 38.157272)
generalPath!!.curveTo(21.28115, 37.347534, 27.332438, 37.347534, 32.23805, 38.157272)
generalPath!!.curveTo(37.143654, 38.967007, 40.15366, 40.462692, 40.128307, 42.07798)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.306795120239258, 42.077980041503906), 15.821514f, Point2D.Double(24.306795120239258, 42.077980041503906), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.2849160134792328f, 0.0f, 30.089279174804688f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_0
shape = RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746)
paint = RadialGradientPaint(Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, Point2D.Double(33.966678619384766, 35.736915588378906), floatArrayOf(0.0f,1.0f), arrayOf(Color(250, 250, 250, 255),Color(187, 187, 187, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.0411319732666016f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = RadialGradientPaint(Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, Point2D.Double(8.824419021606445, 3.7561285495758057), floatArrayOf(0.0f,1.0f), arrayOf(Color(163, 163, 163, 255),Color(76, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
paint = RadialGradientPaint(Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, Point2D.Double(8.143556594848633, 7.26789665222168), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(248, 248, 248, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(7.666053771972656, 4.583946228027344, 32.77588653564453, 38.94638442993164, 0.2980971336364746, 0.2980971336364746)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.6464470028877258f, -0.03798932954668999f))
// _0_1_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.967081069946289f, 4.244972229003906f))
// _0_1_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(23.428, 113.07)
generalPath!!.curveTo(23.428, 115.043, 21.828, 116.642, 19.855, 116.642)
generalPath!!.curveTo(17.881, 116.642, 16.282, 115.042, 16.282, 113.07)
generalPath!!.curveTo(16.282, 111.096, 17.882, 109.497, 19.855, 109.497)
generalPath!!.curveTo(21.828, 109.497, 23.428, 111.097, 23.428, 113.07)
generalPath!!.closePath()
shape = generalPath
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2_0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(23.428, 63.07)
generalPath!!.curveTo(23.428, 65.043, 21.828, 66.643, 19.855, 66.643)
generalPath!!.curveTo(17.881, 66.643, 16.282, 65.043, 16.282, 63.07)
generalPath!!.curveTo(16.282, 61.096, 17.882, 59.497, 19.855, 59.497)
generalPath!!.curveTo(21.828, 59.497, 23.428, 61.097, 23.428, 63.07)
generalPath!!.closePath()
shape = generalPath
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.995011, 29.952326)
generalPath!!.curveTo(9.995011, 30.40553, 9.627486, 30.772825, 9.174282, 30.772825)
generalPath!!.curveTo(8.720848, 30.772825, 8.353554, 30.4053, 8.353554, 29.952326)
generalPath!!.curveTo(8.353554, 29.498892, 8.721078, 29.131598, 9.174282, 29.131598)
generalPath!!.curveTo(9.627486, 29.131598, 9.995011, 29.499123, 9.995011, 29.952326)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(20.892099380493164, 114.56839752197266), 5.256f, Point2D.Double(20.892099380493164, 114.56839752197266), floatArrayOf(0.0f,1.0f), arrayOf(Color(240, 240, 240, 255),Color(154, 154, 154, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.995011, 18.467176)
generalPath!!.curveTo(9.995011, 18.92038, 9.627486, 19.287905, 9.174282, 19.287905)
generalPath!!.curveTo(8.720848, 19.287905, 8.353554, 18.92038, 8.353554, 18.467176)
generalPath!!.curveTo(8.353554, 18.013742, 8.721078, 17.646446, 9.174282, 17.646446)
generalPath!!.curveTo(9.627486, 17.646446, 9.995011, 18.013971, 9.995011, 18.467176)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(20.892099380493164, 64.56790161132812), 5.257f, Point2D.Double(20.892099380493164, 64.56790161132812), floatArrayOf(0.0f,1.0f), arrayOf(Color(240, 240, 240, 255),Color(154, 154, 154, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_3
paint = Color(0, 0, 0, 4)
stroke = BasicStroke(0.9885531f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.505723, 5.4942765)
generalPath!!.lineTo(11.505723, 43.400867)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4
paint = Color(255, 255, 255, 52)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(12.5, 5.0205154)
generalPath!!.lineTo(12.5, 43.038227)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9090909957885742f, 0.0f, 0.0f, 1.0f, 2.3636279106140137f, 0.0f))
// _0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_0
shape = RoundRectangle2D.Double(15.000001907348633, 9.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_1
shape = RoundRectangle2D.Double(15.000001907348633, 11.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_2
shape = RoundRectangle2D.Double(15.000001907348633, 13.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_3
shape = RoundRectangle2D.Double(15.000001907348633, 15.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_4
shape = RoundRectangle2D.Double(15.000001907348633, 17.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_5
shape = RoundRectangle2D.Double(15.000001907348633, 19.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_6
shape = RoundRectangle2D.Double(15.000001907348633, 21.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_7
shape = RoundRectangle2D.Double(15.000001907348633, 23.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_8
shape = RoundRectangle2D.Double(14.999992370605469, 25.0, 9.900005340576172, 1.0, 0.1364084780216217, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_9
shape = RoundRectangle2D.Double(14.999992370605469, 29.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_10
shape = RoundRectangle2D.Double(14.999992370605469, 31.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_11
shape = RoundRectangle2D.Double(14.999992370605469, 33.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_12
shape = RoundRectangle2D.Double(14.999992370605469, 35.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_13
shape = RoundRectangle2D.Double(14.999992370605469, 37.0, 15.40001392364502, 1.0, 0.21219104528427124, 0.13078175485134125)
paint = Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.4090909f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.96875, 14.555141)
generalPath!!.curveTo(25.65626, 14.579414, 25.35254, 14.618618, 25.03125, 14.680141)
generalPath!!.lineTo(23.75, 15.836391)
generalPath!!.lineTo(27.71875, 19.586391)
generalPath!!.lineTo(27.9375, 22.867641)
generalPath!!.lineTo(24.96875, 25.555141)
generalPath!!.lineTo(21.46875, 25.180141)
generalPath!!.lineTo(17.84375, 21.773891)
generalPath!!.curveTo(17.843748, 21.773891, 16.5625, 23.023891, 16.5625, 23.023891)
generalPath!!.curveTo(15.971737, 28.665209, 21.875, 33.71139, 27.9375, 30.336391)
generalPath!!.lineTo(39.78125, 42.46139)
generalPath!!.lineTo(39.78125, 32.08639)
generalPath!!.lineTo(33.21875, 25.055141)
generalPath!!.curveTo(35.345703, 19.146938, 31.370365, 14.13556, 25.96875, 14.555141)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(26.030092239379883, 24.226810455322266), 11.629837f, Point2D.Double(26.030092239379883, 24.226810455322266), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.110987901687622f, 2.1107379269321275E-23f, -2.5345160562552086E-23f, 2.5349299907684326f, -28.919130325317383f, -38.04383087158203f))
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
            return 6.10355281829834
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 3.1464462280273438
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 35.875
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.36908721923828
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Document_properties(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Document_properties(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Document_properties(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

