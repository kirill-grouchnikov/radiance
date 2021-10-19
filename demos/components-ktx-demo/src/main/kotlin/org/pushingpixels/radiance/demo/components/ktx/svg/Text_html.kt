package org.pushingpixels.radiance.demo.components.ktx.svg

import java.awt.*
import java.awt.geom.*
import java.awt.image.BufferedImage
import java.io.*
import java.lang.ref.WeakReference
import java.util.Base64
import java.util.Stack
import javax.imageio.ImageIO
import javax.swing.plaf.UIResource

import org.pushingpixels.radiance.common.api.icon.RadianceIcon
import org.pushingpixels.radiance.common.api.icon.RadianceIcon.Factory
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
class Text_html private constructor(private var width: Int, private var height: Int)
       : RadianceIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var colorFilter: RadianceIcon.ColorFilter? = null
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
g.composite = AlphaComposite.getInstance(3, 0.56725144f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.167598009109497f, 0.0f, 0.0f, 1.0f, -4.880565166473389f, 0.17202000319957733f))
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.128307f, 42.07798f)
generalPath!!.curveTo(40.15366f, 43.693268f, 37.143654f, 45.188953f, 32.23805f, 45.998688f)
generalPath!!.curveTo(27.332438f, 46.808426f, 21.28115f, 46.808426f, 16.375542f, 45.998688f)
generalPath!!.curveTo(11.469933f, 45.188953f, 8.459927f, 43.693268f, 8.485281f, 42.07798f)
generalPath!!.curveTo(8.459927f, 40.462692f, 11.469933f, 38.967007f, 16.375542f, 38.157272f)
generalPath!!.curveTo(21.28115f, 37.347534f, 27.332438f, 37.347534f, 32.23805f, 38.157272f)
generalPath!!.curveTo(37.143654f, 38.967007f, 40.15366f, 40.462692f, 40.128307f, 42.07798f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.306795120239258, 42.077980041503906), 15.821514f, Point2D.Double(24.306795120239258, 42.077980041503906), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.2849160134792328f, -7.702171174545839E-16f, 30.089279174804688f))
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
paint = RadialGradientPaint(Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, Point2D.Double(33.966678619384766, 35.736915588378906), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(250, 250, 250, 255)) ?: Color(250, 250, 250, 255)),(colorFilter?.filter(Color(187, 187, 187, 255)) ?: Color(187, 187, 187, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.0411319732666016f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = RadialGradientPaint(Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, Point2D.Double(8.824419021606445, 3.7561285495758057), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(163, 163, 163, 255)) ?: Color(163, 163, 163, 255)),(colorFilter?.filter(Color(76, 76, 76, 255)) ?: Color(76, 76, 76, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f))
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
paint = RadialGradientPaint(Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, Point2D.Double(8.143556594848633, 7.26789665222168), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(248, 248, 248, 255)) ?: Color(248, 248, 248, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f))
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
generalPath!!.moveTo(23.428f, 113.07f)
generalPath!!.curveTo(23.428f, 115.043f, 21.828f, 116.642f, 19.855f, 116.642f)
generalPath!!.curveTo(17.881f, 116.642f, 16.282f, 115.042f, 16.282f, 113.07f)
generalPath!!.curveTo(16.282f, 111.096f, 17.882f, 109.497f, 19.855f, 109.497f)
generalPath!!.curveTo(21.828f, 109.497f, 23.428f, 111.097f, 23.428f, 113.07f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
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
generalPath!!.moveTo(23.428f, 63.07f)
generalPath!!.curveTo(23.428f, 65.043f, 21.828f, 66.643f, 19.855f, 66.643f)
generalPath!!.curveTo(17.881f, 66.643f, 16.282f, 65.043f, 16.282f, 63.07f)
generalPath!!.curveTo(16.282f, 61.096f, 17.882f, 59.497f, 19.855f, 59.497f)
generalPath!!.curveTo(21.828f, 59.497f, 23.428f, 61.097f, 23.428f, 63.07f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
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
generalPath!!.moveTo(9.995011f, 29.952326f)
generalPath!!.curveTo(9.995011f, 30.40553f, 9.627486f, 30.772825f, 9.174282f, 30.772825f)
generalPath!!.curveTo(8.720848f, 30.772825f, 8.353554f, 30.4053f, 8.353554f, 29.952326f)
generalPath!!.curveTo(8.353554f, 29.498892f, 8.721078f, 29.131598f, 9.174282f, 29.131598f)
generalPath!!.curveTo(9.627486f, 29.131598f, 9.995011f, 29.499123f, 9.995011f, 29.952326f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(20.892099380493164, 114.56839752197266), 5.256f, Point2D.Double(20.892099380493164, 114.56839752197266), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(240, 240, 240, 255)) ?: Color(240, 240, 240, 255)),(colorFilter?.filter(Color(154, 154, 154, 255)) ?: Color(154, 154, 154, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f))
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
generalPath!!.moveTo(9.995011f, 18.467176f)
generalPath!!.curveTo(9.995011f, 18.92038f, 9.627486f, 19.287905f, 9.174282f, 19.287905f)
generalPath!!.curveTo(8.720848f, 19.287905f, 8.353554f, 18.92038f, 8.353554f, 18.467176f)
generalPath!!.curveTo(8.353554f, 18.013742f, 8.721078f, 17.646446f, 9.174282f, 17.646446f)
generalPath!!.curveTo(9.627486f, 17.646446f, 9.995011f, 18.013971f, 9.995011f, 18.467176f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(20.892099380493164, 64.56790161132812), 5.257f, Point2D.Double(20.892099380493164, 64.56790161132812), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(240, 240, 240, 255)) ?: Color(240, 240, 240, 255)),(colorFilter?.filter(Color(154, 154, 154, 255)) ?: Color(154, 154, 154, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_3
paint = colorFilter?.filter(Color(0, 0, 0, 4)) ?: Color(0, 0, 0, 4)
stroke = BasicStroke(0.9885531f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.505723f, 5.4942765f)
generalPath!!.lineTo(11.505723f, 43.400867f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4
paint = colorFilter?.filter(Color(255, 255, 255, 52)) ?: Color(255, 255, 255, 52)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(12.5f, 5.0205154f)
generalPath!!.lineTo(12.5f, 43.038227f)
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
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_1
shape = RoundRectangle2D.Double(15.000001907348633, 11.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_2
shape = RoundRectangle2D.Double(15.000001907348633, 13.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_3
shape = RoundRectangle2D.Double(15.000001907348633, 15.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_4
shape = RoundRectangle2D.Double(15.000001907348633, 17.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_5
shape = RoundRectangle2D.Double(15.000001907348633, 19.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_6
shape = RoundRectangle2D.Double(15.000001907348633, 21.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_7
shape = RoundRectangle2D.Double(15.000001907348633, 23.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_8
shape = RoundRectangle2D.Double(14.999992370605469, 25.0, 9.900005340576172, 1.0, 0.1364084780216217, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_9
shape = RoundRectangle2D.Double(14.999992370605469, 29.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_10
shape = RoundRectangle2D.Double(14.999992370605469, 31.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_11
shape = RoundRectangle2D.Double(14.999992370605469, 33.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_12
shape = RoundRectangle2D.Double(14.999992370605469, 35.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_13
shape = RoundRectangle2D.Double(14.999992370605469, 37.0, 15.40001392364502, 1.0, 0.21219104528427124, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.1605110168457031f, 0.0f, 0.0f, 1.1605110168457031f, 1.8477129936218262f, 3.119486093521118f))
// _0_2_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.5871359705924988f, 0.0f, 0.0f, 0.7299540042877197f, 11.299189567565918f, 4.3983588218688965f))
// _0_2_1_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(45.052803f, 38.908627f)
generalPath!!.curveTo(45.08518f, 41.587196f, 41.241596f, 44.06744f, 34.97745f, 45.410194f)
generalPath!!.curveTo(28.713305f, 46.75295f, 20.9862f, 46.75295f, 14.722055f, 45.410194f)
generalPath!!.curveTo(8.45791f, 44.06744f, 4.6143265f, 41.587196f, 4.646702f, 38.908627f)
generalPath!!.curveTo(4.6143265f, 36.230057f, 8.45791f, 33.749813f, 14.722055f, 32.40706f)
generalPath!!.curveTo(20.9862f, 31.064304f, 28.713305f, 31.064304f, 34.97745f, 32.40706f)
generalPath!!.curveTo(41.241596f, 33.749813f, 45.08518f, 36.230057f, 45.052803f, 38.908627f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(15.115513801574707, 63.965389251708984), 12.289036f, Point2D.Double(15.115513801574707, 63.965389251708984), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.6439900398254395f, 0.0f, 0.0f, 0.6082760095596313f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(37.109608f, 24.218857f)
generalPath!!.curveTo(37.109608f, 30.50692f, 32.012028f, 35.60444f, 25.72483f, 35.60444f)
generalPath!!.curveTo(19.437057f, 35.60444f, 14.339767f, 30.50686f, 14.339767f, 24.218857f)
generalPath!!.curveTo(14.339767f, 17.931082f, 19.437057f, 12.834081f, 25.72483f, 12.834081f)
generalPath!!.curveTo(32.012028f, 12.834081f, 37.109608f, 17.931082f, 37.109608f, 24.218857f)
generalPath!!.lineTo(37.109608f, 24.218857f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.247644424438477, 15.716078758239746), 29.99335f, Point2D.Double(18.247644424438477, 15.716078758239746), floatArrayOf(0.0f,0.15517241f,0.75f,1.0f), arrayOf((colorFilter?.filter(Color(211, 233, 255, 255)) ?: Color(211, 233, 255, 255)),(colorFilter?.filter(Color(211, 233, 255, 255)) ?: Color(211, 233, 255, 255)),(colorFilter?.filter(Color(64, 116, 174, 255)) ?: Color(64, 116, 174, 255)),(colorFilter?.filter(Color(54, 72, 108, 255)) ?: Color(54, 72, 108, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.5871300101280212f, 0.0f, 0.0f, 0.5871419906616211f, 11.299189567565918f, 10.429670333862305f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(57, 57, 108, 255)) ?: Color(57, 57, 108, 255)
stroke = BasicStroke(1.7233788f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(37.109608f, 24.218857f)
generalPath!!.curveTo(37.109608f, 30.50692f, 32.012028f, 35.60444f, 25.72483f, 35.60444f)
generalPath!!.curveTo(19.437057f, 35.60444f, 14.339767f, 30.50686f, 14.339767f, 24.218857f)
generalPath!!.curveTo(14.339767f, 17.931082f, 19.437057f, 12.834081f, 25.72483f, 12.834081f)
generalPath!!.curveTo(32.012028f, 12.834081f, 37.109608f, 17.931082f, 37.109608f, 24.218857f)
generalPath!!.lineTo(37.109608f, 24.218857f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.42159382f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.49080899357795715f, 0.0f, 0.0f, 0.5871359705924988f, 17.104129791259766f, 10.429670333862305f))
// _0_2_1_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(30.708637f, 15.271057f)
generalPath!!.curveTo(30.729357f, 18.601171f, 28.269464f, 21.684715f, 24.26041f, 23.354086f)
generalPath!!.curveTo(20.251358f, 25.023458f, 15.306011f, 25.023458f, 11.296958f, 23.354086f)
generalPath!!.curveTo(7.287905f, 21.684715f, 4.8280115f, 18.601171f, 4.848732f, 15.271057f)
generalPath!!.curveTo(4.8280115f, 11.940943f, 7.287905f, 8.857399f, 11.296958f, 7.1880274f)
generalPath!!.curveTo(15.306011f, 5.5186563f, 20.251358f, 5.5186563f, 24.26041f, 7.1880274f)
generalPath!!.curveTo(28.269464f, 8.857399f, 30.729357f, 11.940943f, 30.708637f, 15.271057f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(11.82690715789795, 10.476452827453613), 32.66485f, Point2D.Double(11.82690715789795, 10.476452827453613), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.179535984992981f, 0.0f, 0.0f, 0.8477910161018372f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.5767859816551208f, 0.0f, 0.0f, 0.5767859816551208f, 11.370280265808105f, 10.56641960144043f))
// _0_2_1_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(44.0713f, 20.7144f)
generalPath!!.curveTo(44.0713f, 20.9771f, 44.0713f, 20.7144f, 44.0713f, 20.7144f)
generalPath!!.lineTo(43.5264f, 21.3316f)
generalPath!!.curveTo(43.1924f, 20.938f, 42.8174f, 20.607f, 42.4366f, 20.2613f)
generalPath!!.lineTo(41.6007f, 20.3843f)
generalPath!!.lineTo(40.837f, 19.521f)
generalPath!!.lineTo(40.837f, 20.5894f)
generalPath!!.lineTo(41.4913f, 21.0845f)
generalPath!!.lineTo(41.9268f, 21.5777f)
generalPath!!.lineTo(42.5088f, 20.9195f)
generalPath!!.curveTo(42.6553f, 21.1939f, 42.7998f, 21.4683f, 42.9453f, 21.7427f)
generalPath!!.lineTo(42.9453f, 22.565f)
generalPath!!.lineTo(42.29f, 23.3052f)
generalPath!!.lineTo(41.0908f, 24.1284f)
generalPath!!.lineTo(40.1826f, 25.0347f)
generalPath!!.lineTo(39.6006f, 24.3745f)
generalPath!!.lineTo(39.8916f, 23.6343f)
generalPath!!.lineTo(39.3105f, 22.9761f)
generalPath!!.lineTo(38.3291f, 20.8784f)
generalPath!!.lineTo(37.4932f, 19.9331f)
generalPath!!.lineTo(37.2744f, 20.1792f)
generalPath!!.lineTo(37.6025f, 21.3726f)
generalPath!!.lineTo(38.2197f, 22.0718f)
generalPath!!.curveTo(38.5722f, 23.0894f, 38.9209f, 24.062f, 39.3838f, 25.0347f)
generalPath!!.curveTo(40.1016f, 25.0347f, 40.7783f, 24.9585f, 41.4912f, 24.8687f)
generalPath!!.lineTo(41.4912f, 25.4449f)
generalPath!!.lineTo(40.6191f, 27.5841f)
generalPath!!.lineTo(39.8193f, 28.4884f)
generalPath!!.lineTo(39.165f, 29.8888f)
generalPath!!.curveTo(39.165f, 30.6564f, 39.165f, 31.424f, 39.165f, 32.1915f)
generalPath!!.lineTo(39.3838f, 33.0978f)
generalPath!!.lineTo(39.0205f, 33.508f)
generalPath!!.lineTo(38.2197f, 34.0021f)
generalPath!!.lineTo(37.3838f, 34.7013f)
generalPath!!.lineTo(38.0752f, 35.4826f)
generalPath!!.lineTo(37.1299f, 36.3068f)
generalPath!!.lineTo(37.3115f, 36.84f)
generalPath!!.lineTo(35.8935f, 38.4455f)
generalPath!!.lineTo(34.9492f, 38.4455f)
generalPath!!.lineTo(34.1494f, 38.9396f)
generalPath!!.lineTo(33.6396f, 38.9396f)
generalPath!!.lineTo(33.6396f, 38.2814f)
generalPath!!.lineTo(33.4228f, 36.963f)
generalPath!!.curveTo(33.1415f, 36.1368f, 32.8486f, 35.3165f, 32.5507f, 34.4962f)
generalPath!!.curveTo(32.5507f, 33.8907f, 32.5868f, 33.2911f, 32.623f, 32.6857f)
generalPath!!.lineTo(32.9873f, 31.8634f)
generalPath!!.lineTo(32.4775f, 30.8751f)
generalPath!!.lineTo(32.5146f, 29.5177f)
generalPath!!.lineTo(31.8232f, 28.7364f)
generalPath!!.lineTo(32.1689f, 27.6055f)
generalPath!!.lineTo(31.6064f, 26.9673f)
generalPath!!.lineTo(30.624f, 26.9673f)
generalPath!!.lineTo(30.2969f, 26.5972f)
generalPath!!.lineTo(29.3155f, 27.2149f)
generalPath!!.lineTo(28.9161f, 26.7613f)
generalPath!!.lineTo(28.0069f, 27.543f)
generalPath!!.curveTo(27.3897f, 26.8433f, 26.7715f, 26.1441f, 26.1534f, 25.4449f)
generalPath!!.lineTo(25.4268f, 23.7164f)
generalPath!!.lineTo(26.0811f, 22.7301f)
generalPath!!.lineTo(25.7178f, 22.319f)
generalPath!!.lineTo(26.5166f, 20.4254f)
generalPath!!.curveTo(27.1729f, 19.609f, 27.8584f, 18.8258f, 28.5518f, 18.0397f)
generalPath!!.lineTo(29.7881f, 17.7106f)
generalPath!!.lineTo(31.169f, 17.5465f)
generalPath!!.lineTo(32.1143f, 17.7936f)
generalPath!!.lineTo(33.459f, 19.15f)
generalPath!!.lineTo(33.9317f, 18.6158f)
generalPath!!.lineTo(34.585f, 18.5338f)
generalPath!!.lineTo(35.8213f, 18.9449f)
generalPath!!.lineTo(36.7666f, 18.9449f)
generalPath!!.lineTo(37.4209f, 18.3687f)
generalPath!!.lineTo(37.7119f, 17.9576f)
generalPath!!.lineTo(37.0566f, 17.5465f)
generalPath!!.lineTo(35.9658f, 17.4645f)
generalPath!!.curveTo(35.6631f, 17.0446f, 35.3818f, 16.6032f, 35.0224f, 16.2301f)
generalPath!!.lineTo(34.6581f, 16.3942f)
generalPath!!.lineTo(34.5126f, 17.4645f)
generalPath!!.lineTo(33.8583f, 16.7243f)
generalPath!!.lineTo(33.7138f, 15.9001f)
generalPath!!.lineTo(32.9872f, 15.3259f)
generalPath!!.lineTo(32.6952f, 15.3259f)
generalPath!!.lineTo(33.4227f, 16.1482f)
generalPath!!.lineTo(33.1317f, 16.8884f)
generalPath!!.lineTo(32.5506f, 17.0525f)
generalPath!!.lineTo(32.9139f, 16.3123f)
generalPath!!.lineTo(32.2586f, 15.9842f)
generalPath!!.lineTo(31.6785f, 15.326f)
generalPath!!.lineTo(30.5867f, 15.5721f)
generalPath!!.lineTo(30.4422f, 15.9002f)
generalPath!!.lineTo(29.7879f, 16.3123f)
generalPath!!.lineTo(29.4246f, 17.2176f)
generalPath!!.lineTo(28.5164f, 17.6697f)
generalPath!!.lineTo(28.116f, 17.2176f)
generalPath!!.lineTo(27.6805f, 17.2176f)
generalPath!!.lineTo(27.6805f, 15.7362f)
generalPath!!.lineTo(28.6258f, 15.2421f)
generalPath!!.lineTo(29.3524f, 15.2421f)
generalPath!!.lineTo(29.2059f, 14.6669f)
generalPath!!.lineTo(28.6258f, 14.0907f)
generalPath!!.lineTo(29.6063f, 13.8846f)
generalPath!!.lineTo(30.1512f, 13.2684f)
generalPath!!.lineTo(30.5867f, 12.5272f)
generalPath!!.lineTo(31.3875f, 12.5272f)
generalPath!!.lineTo(31.1687f, 11.952f)
generalPath!!.lineTo(31.6785f, 11.6229f)
generalPath!!.lineTo(31.6785f, 12.2811f)
generalPath!!.lineTo(32.7683f, 12.5272f)
generalPath!!.lineTo(33.8581f, 11.6229f)
generalPath!!.lineTo(33.9313f, 11.2108f)
generalPath!!.lineTo(34.8756f, 10.5531f)
generalPath!!.curveTo(34.5338f, 10.5956f, 34.192f, 10.6268f, 33.858f, 10.7177f)
generalPath!!.lineTo(33.858f, 9.9766f)
generalPath!!.lineTo(34.2213f, 9.1538f)
generalPath!!.lineTo(33.858f, 9.1538f)
generalPath!!.lineTo(33.0596f, 9.894f)
generalPath!!.lineTo(32.8408f, 10.3056f)
generalPath!!.lineTo(33.0596f, 10.8823f)
generalPath!!.lineTo(32.6953f, 11.8686f)
generalPath!!.lineTo(32.1142f, 11.5395f)
generalPath!!.lineTo(31.6064f, 10.9643f)
generalPath!!.lineTo(30.8056f, 11.5395f)
generalPath!!.lineTo(30.5146f, 10.2236f)
generalPath!!.lineTo(31.8955f, 9.3188f)
generalPath!!.lineTo(31.8955f, 8.8247f)
generalPath!!.lineTo(32.7685f, 8.249001f)
generalPath!!.lineTo(34.1494f, 7.9194f)
generalPath!!.lineTo(35.0947f, 8.249001f)
generalPath!!.lineTo(36.8388f, 8.5781f)
generalPath!!.lineTo(36.4033f, 9.0713005f)
generalPath!!.lineTo(35.458f, 9.0713005f)
generalPath!!.lineTo(36.4033f, 10.0586f)
generalPath!!.lineTo(37.1299f, 9.2363f)
generalPath!!.lineTo(37.3506f, 8.8745f)
generalPath!!.curveTo(37.3506f, 8.8745f, 40.1377f, 11.3725f, 41.7305f, 14.105f)
generalPath!!.curveTo(43.3233f, 16.8384f, 44.0713f, 20.0601f, 44.0713f, 20.7144f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_1_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(26.0703f, 9.2363f)
generalPath!!.lineTo(25.9971f, 9.7295f)
generalPath!!.lineTo(26.5069f, 10.0586f)
generalPath!!.lineTo(27.378f, 9.4829f)
generalPath!!.lineTo(26.9425f, 8.9892f)
generalPath!!.lineTo(26.3605f, 9.3188f)
generalPath!!.lineTo(26.0705f, 9.2363f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_2_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(26.8701f, 5.8633f)
generalPath!!.lineTo(24.9795f, 5.1226f)
generalPath!!.lineTo(22.7998f, 5.3692f)
generalPath!!.lineTo(20.1094f, 6.1094f)
generalPath!!.lineTo(19.6006f, 6.6035f)
generalPath!!.lineTo(21.2725f, 7.7549f)
generalPath!!.lineTo(21.2725f, 8.4131f)
generalPath!!.lineTo(20.6182f, 9.0713005f)
generalPath!!.lineTo(21.4912f, 10.8003f)
generalPath!!.lineTo(22.0713f, 10.4702f)
generalPath!!.lineTo(22.7998f, 9.3188f)
generalPath!!.curveTo(23.9228f, 8.971601f, 24.9297f, 8.5781f, 25.9971f, 8.0844f)
generalPath!!.lineTo(26.8701f, 5.8632f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_3_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(28.833f, 12.7749f)
generalPath!!.lineTo(28.542f, 12.0337f)
generalPath!!.lineTo(28.0322f, 12.1987f)
generalPath!!.lineTo(28.1787f, 13.103f)
generalPath!!.lineTo(28.833f, 12.7749f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_4_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(29.123f, 12.6089f)
generalPath!!.lineTo(28.9775f, 13.5972f)
generalPath!!.lineTo(29.7773f, 13.4322f)
generalPath!!.lineTo(30.3584f, 12.857f)
generalPath!!.lineTo(29.8496f, 12.3629f)
generalPath!!.curveTo(29.6787f, 11.9078f, 29.4824f, 11.483f, 29.2685f, 11.0465f)
generalPath!!.lineTo(28.833f, 11.0465f)
generalPath!!.lineTo(28.833f, 11.5397f)
generalPath!!.lineTo(29.123f, 11.8688f)
generalPath!!.lineTo(29.123f, 12.609f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_5_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_5_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.3652f, 28.2422f)
generalPath!!.lineTo(17.7832f, 27.0899f)
generalPath!!.lineTo(16.6929f, 26.8433f)
generalPath!!.lineTo(16.1114f, 25.2808f)
generalPath!!.lineTo(14.6578f, 25.4449f)
generalPath!!.lineTo(13.4224f, 24.5406f)
generalPath!!.lineTo(12.1133f, 25.692f)
generalPath!!.lineTo(12.1133f, 25.8736f)
generalPath!!.curveTo(11.7173f, 25.7593f, 11.2305f, 25.7437f, 10.8779f, 25.5269f)
generalPath!!.lineTo(10.5869f, 24.7046f)
generalPath!!.lineTo(10.5869f, 23.7993f)
generalPath!!.lineTo(9.7148f, 23.8813f)
generalPath!!.curveTo(9.7876005f, 23.3051f, 9.8598f, 22.7299f, 9.9331f, 22.1538f)
generalPath!!.lineTo(9.4238f, 22.1538f)
generalPath!!.lineTo(8.9155f, 22.812f)
generalPath!!.lineTo(8.4062f, 23.0581f)
generalPath!!.lineTo(7.6791f, 22.6479f)
generalPath!!.lineTo(7.6063f, 21.7426f)
generalPath!!.lineTo(7.7518f, 20.7553f)
generalPath!!.lineTo(8.8426f, 19.933f)
generalPath!!.lineTo(9.7147f, 19.933f)
generalPath!!.lineTo(9.8597f, 19.4389f)
generalPath!!.lineTo(10.95f, 19.685f)
generalPath!!.lineTo(11.7498f, 20.6733f)
generalPath!!.lineTo(11.8953f, 19.0268f)
generalPath!!.lineTo(13.2766f, 17.8754f)
generalPath!!.lineTo(13.7854f, 16.641f)
generalPath!!.lineTo(14.803f, 16.2299f)
generalPath!!.lineTo(15.3845f, 15.4076f)
generalPath!!.lineTo(16.6926f, 15.1596f)
generalPath!!.lineTo(17.3474f, 14.1733f)
generalPath!!.curveTo(16.6931f, 14.1733f, 16.0388f, 14.1733f, 15.3845f, 14.1733f)
generalPath!!.lineTo(16.6203f, 13.5971f)
generalPath!!.lineTo(17.4919f, 13.5971f)
generalPath!!.lineTo(18.7282f, 13.185f)
generalPath!!.lineTo(18.8737f, 12.6928f)
generalPath!!.lineTo(18.4372f, 12.2807f)
generalPath!!.lineTo(17.9284f, 12.1157f)
generalPath!!.lineTo(18.0739f, 11.6225f)
generalPath!!.lineTo(17.7106f, 10.8823f)
generalPath!!.lineTo(16.838f, 11.2104f)
generalPath!!.lineTo(16.9835f, 10.5527f)
generalPath!!.lineTo(15.9659f, 9.9765005f)
generalPath!!.lineTo(15.1666f, 11.3744f)
generalPath!!.lineTo(15.2389f, 11.8685f)
generalPath!!.lineTo(14.4396f, 12.1986f)
generalPath!!.lineTo(13.9303f, 13.2679f)
generalPath!!.lineTo(13.7125f, 12.2806f)
generalPath!!.lineTo(12.3312f, 11.7044f)
generalPath!!.lineTo(12.1129f, 10.9642f)
generalPath!!.lineTo(13.9303f, 9.8939f)
generalPath!!.lineTo(14.7301f, 9.1537f)
generalPath!!.lineTo(14.8029f, 8.2489f)
generalPath!!.lineTo(14.3669f, 8.001801f)
generalPath!!.lineTo(13.7854f, 7.9193f)
generalPath!!.lineTo(13.4221f, 8.8246f)
generalPath!!.curveTo(13.4221f, 8.8246f, 12.8142f, 8.9437f, 12.6579f, 8.9823f)
generalPath!!.curveTo(10.6618f, 10.8217f, 6.6286f, 14.7924f, 5.6916f, 22.2885f)
generalPath!!.curveTo(5.7287f, 22.4623f, 6.3708f, 23.4701f, 6.3708f, 23.4701f)
generalPath!!.lineTo(7.8972f, 24.3744f)
generalPath!!.lineTo(9.4236f, 24.7865f)
generalPath!!.lineTo(10.0784f, 25.6097f)
generalPath!!.lineTo(11.0955f, 26.3499f)
generalPath!!.lineTo(11.677f, 26.2679f)
generalPath!!.lineTo(12.113f, 26.4642f)
generalPath!!.lineTo(12.113f, 26.597f)
generalPath!!.lineTo(11.5319f, 28.16f)
generalPath!!.lineTo(11.0954f, 28.8182f)
generalPath!!.lineTo(11.2409f, 29.1483f)
generalPath!!.lineTo(10.8776f, 30.3807f)
generalPath!!.lineTo(12.1862f, 32.7674f)
generalPath!!.lineTo(13.4943f, 33.9197f)
generalPath!!.lineTo(14.0763f, 34.742f)
generalPath!!.lineTo(14.0031f, 36.4705f)
generalPath!!.lineTo(14.4396f, 37.4568f)
generalPath!!.lineTo(14.0031f, 39.3494f)
generalPath!!.curveTo(14.0031f, 39.3494f, 13.9689f, 39.3377f, 14.0246f, 39.5271f)
generalPath!!.curveTo(14.0808f, 39.7166f, 16.3537f, 40.9783f, 16.4982f, 40.8709f)
generalPath!!.curveTo(16.6422f, 40.7615f, 16.7653f, 40.6658f, 16.7653f, 40.6658f)
generalPath!!.lineTo(16.6203f, 40.2556f)
generalPath!!.lineTo(17.2014f, 39.6794f)
generalPath!!.lineTo(17.4197f, 39.1032f)
generalPath!!.lineTo(18.365f, 38.7731f)
generalPath!!.lineTo(19.0916f, 36.9626f)
generalPath!!.lineTo(18.8738f, 36.4704f)
generalPath!!.lineTo(19.3816f, 35.7302f)
generalPath!!.lineTo(20.4724f, 35.4822f)
generalPath!!.lineTo(21.0544f, 34.1658f)
generalPath!!.lineTo(20.9089f, 32.5213f)
generalPath!!.lineTo(21.781f, 31.2869f)
generalPath!!.lineTo(21.9265f, 30.0525f)
generalPath!!.curveTo(20.7331f, 29.4607f, 19.5495f, 28.8513f, 18.365f, 28.242f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_6_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_6_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.7656f, 9.5649f)
generalPath!!.lineTo(17.4922f, 10.0586f)
generalPath!!.lineTo(18.0742f, 10.0586f)
generalPath!!.lineTo(18.0742f, 9.4829f)
generalPath!!.lineTo(17.3476f, 9.1538f)
generalPath!!.lineTo(16.7656f, 9.5649f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_7_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_7_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(14.876f, 8.9072f)
generalPath!!.lineTo(14.5122f, 9.812f)
generalPath!!.lineTo(15.2393f, 9.812f)
generalPath!!.lineTo(15.6031f, 8.9892f)
generalPath!!.curveTo(15.9166f, 8.7675f, 16.2286f, 8.5444f, 16.5479f, 8.331f)
generalPath!!.lineTo(17.275f, 8.5781f)
generalPath!!.curveTo(17.7594f, 8.9072f, 18.2438f, 9.2363f, 18.7286f, 9.5649f)
generalPath!!.lineTo(19.4561f, 8.9072f)
generalPath!!.lineTo(18.6558f, 8.5781f)
generalPath!!.lineTo(18.292f, 7.8374f)
generalPath!!.lineTo(16.9111f, 7.6728f)
generalPath!!.lineTo(16.8383f, 7.2612f)
generalPath!!.lineTo(16.184f, 7.4262f)
generalPath!!.lineTo(15.8936f, 8.002f)
generalPath!!.lineTo(15.5298f, 7.2613f)
generalPath!!.lineTo(15.3848f, 7.5904f)
generalPath!!.lineTo(15.4576f, 8.4132f)
generalPath!!.lineTo(14.876f, 8.9072f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_8
g.composite = AlphaComposite.getInstance(3, 0.75f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_8_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_8_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_8_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_8_1_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_9
g.composite = AlphaComposite.getInstance(3, 0.75f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_9_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_9_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_9_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_9_1_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_10_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_10_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.4922f, 6.8496003f)
generalPath!!.lineTo(17.856f, 6.521f)

}

private fun _paint1(g : Graphics2D,origAlpha : Float) {
generalPath!!.lineTo(18.5831f, 6.3564f)
generalPath!!.curveTo(19.0811f, 6.1142f, 19.5811f, 5.9511f, 20.1095f, 5.7802f)
generalPath!!.lineTo(19.8195f, 5.2865f)
generalPath!!.lineTo(18.881f, 5.4213f)
generalPath!!.lineTo(18.4376f, 5.8632f)
generalPath!!.lineTo(17.7066f, 5.9692f)
generalPath!!.lineTo(17.0567f, 6.2744f)
generalPath!!.lineTo(16.7408f, 6.4272f)
generalPath!!.lineTo(16.5479f, 6.6855f)
generalPath!!.lineTo(17.4922f, 6.8496003f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_11_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3_11_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.7285f, 14.6665f)
generalPath!!.lineTo(19.165f, 14.0083f)
generalPath!!.lineTo(18.5102f, 13.5151f)
generalPath!!.lineTo(18.7285f, 14.6665f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 182)) ?: Color(0, 0, 0, 182)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.5767859816551208f, 0.0f, 0.0f, 0.5767859816551208f, 11.251660346984863f, 10.447799682617188f))
// _0_2_1_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(44.0713f, 20.7144f)
generalPath!!.curveTo(44.0713f, 20.9771f, 44.0713f, 20.7144f, 44.0713f, 20.7144f)
generalPath!!.lineTo(43.5264f, 21.3316f)
generalPath!!.curveTo(43.1924f, 20.938f, 42.8174f, 20.607f, 42.4366f, 20.2613f)
generalPath!!.lineTo(41.6007f, 20.3843f)
generalPath!!.lineTo(40.837f, 19.521f)
generalPath!!.lineTo(40.837f, 20.5894f)
generalPath!!.lineTo(41.4913f, 21.0845f)
generalPath!!.lineTo(41.9268f, 21.5777f)
generalPath!!.lineTo(42.5088f, 20.9195f)
generalPath!!.curveTo(42.6553f, 21.1939f, 42.7998f, 21.4683f, 42.9453f, 21.7427f)
generalPath!!.lineTo(42.9453f, 22.565f)
generalPath!!.lineTo(42.29f, 23.3052f)
generalPath!!.lineTo(41.0908f, 24.1284f)
generalPath!!.lineTo(40.1826f, 25.0347f)
generalPath!!.lineTo(39.6006f, 24.3745f)
generalPath!!.lineTo(39.8916f, 23.6343f)
generalPath!!.lineTo(39.3105f, 22.9761f)
generalPath!!.lineTo(38.3291f, 20.8784f)
generalPath!!.lineTo(37.4932f, 19.9331f)
generalPath!!.lineTo(37.2744f, 20.1792f)
generalPath!!.lineTo(37.6025f, 21.3726f)
generalPath!!.lineTo(38.2197f, 22.0718f)
generalPath!!.curveTo(38.5722f, 23.0894f, 38.9209f, 24.062f, 39.3838f, 25.0347f)
generalPath!!.curveTo(40.1016f, 25.0347f, 40.7783f, 24.9585f, 41.4912f, 24.8687f)
generalPath!!.lineTo(41.4912f, 25.4449f)
generalPath!!.lineTo(40.6191f, 27.5841f)
generalPath!!.lineTo(39.8193f, 28.4884f)
generalPath!!.lineTo(39.165f, 29.8888f)
generalPath!!.curveTo(39.165f, 30.6564f, 39.165f, 31.424f, 39.165f, 32.1915f)
generalPath!!.lineTo(39.3838f, 33.0978f)
generalPath!!.lineTo(39.0205f, 33.508f)
generalPath!!.lineTo(38.2197f, 34.0021f)
generalPath!!.lineTo(37.3838f, 34.7013f)
generalPath!!.lineTo(38.0752f, 35.4826f)
generalPath!!.lineTo(37.1299f, 36.3068f)
generalPath!!.lineTo(37.3115f, 36.84f)
generalPath!!.lineTo(35.8935f, 38.4455f)
generalPath!!.lineTo(34.9492f, 38.4455f)
generalPath!!.lineTo(34.1494f, 38.9396f)
generalPath!!.lineTo(33.6396f, 38.9396f)
generalPath!!.lineTo(33.6396f, 38.2814f)
generalPath!!.lineTo(33.4228f, 36.963f)
generalPath!!.curveTo(33.1415f, 36.1368f, 32.8486f, 35.3165f, 32.5507f, 34.4962f)
generalPath!!.curveTo(32.5507f, 33.8907f, 32.5868f, 33.2911f, 32.623f, 32.6857f)
generalPath!!.lineTo(32.9873f, 31.8634f)
generalPath!!.lineTo(32.4775f, 30.8751f)
generalPath!!.lineTo(32.5146f, 29.5177f)
generalPath!!.lineTo(31.8232f, 28.7364f)
generalPath!!.lineTo(32.1689f, 27.6055f)
generalPath!!.lineTo(31.6064f, 26.9673f)
generalPath!!.lineTo(30.624f, 26.9673f)
generalPath!!.lineTo(30.2969f, 26.5972f)
generalPath!!.lineTo(29.3155f, 27.2149f)
generalPath!!.lineTo(28.9161f, 26.7613f)
generalPath!!.lineTo(28.0069f, 27.543f)
generalPath!!.curveTo(27.3897f, 26.8433f, 26.7715f, 26.1441f, 26.1534f, 25.4449f)
generalPath!!.lineTo(25.4268f, 23.7164f)
generalPath!!.lineTo(26.0811f, 22.7301f)
generalPath!!.lineTo(25.7178f, 22.319f)
generalPath!!.lineTo(26.5166f, 20.4254f)
generalPath!!.curveTo(27.1729f, 19.609f, 27.8584f, 18.8258f, 28.5518f, 18.0397f)
generalPath!!.lineTo(29.7881f, 17.7106f)
generalPath!!.lineTo(31.169f, 17.5465f)
generalPath!!.lineTo(32.1143f, 17.7936f)
generalPath!!.lineTo(33.459f, 19.15f)
generalPath!!.lineTo(33.9317f, 18.6158f)
generalPath!!.lineTo(34.585f, 18.5338f)
generalPath!!.lineTo(35.8213f, 18.9449f)
generalPath!!.lineTo(36.7666f, 18.9449f)
generalPath!!.lineTo(37.4209f, 18.3687f)
generalPath!!.lineTo(37.7119f, 17.9576f)
generalPath!!.lineTo(37.0566f, 17.5465f)
generalPath!!.lineTo(35.9658f, 17.4645f)
generalPath!!.curveTo(35.6631f, 17.0446f, 35.3818f, 16.6032f, 35.0224f, 16.2301f)
generalPath!!.lineTo(34.6581f, 16.3942f)
generalPath!!.lineTo(34.5126f, 17.4645f)
generalPath!!.lineTo(33.8583f, 16.7243f)
generalPath!!.lineTo(33.7138f, 15.9001f)
generalPath!!.lineTo(32.9872f, 15.3259f)
generalPath!!.lineTo(32.6952f, 15.3259f)
generalPath!!.lineTo(33.4227f, 16.1482f)
generalPath!!.lineTo(33.1317f, 16.8884f)
generalPath!!.lineTo(32.5506f, 17.0525f)
generalPath!!.lineTo(32.9139f, 16.3123f)
generalPath!!.lineTo(32.2586f, 15.9842f)
generalPath!!.lineTo(31.6785f, 15.326f)
generalPath!!.lineTo(30.5867f, 15.5721f)
generalPath!!.lineTo(30.4422f, 15.9002f)
generalPath!!.lineTo(29.7879f, 16.3123f)
generalPath!!.lineTo(29.4246f, 17.2176f)
generalPath!!.lineTo(28.5164f, 17.6697f)
generalPath!!.lineTo(28.116f, 17.2176f)
generalPath!!.lineTo(27.6805f, 17.2176f)
generalPath!!.lineTo(27.6805f, 15.7362f)
generalPath!!.lineTo(28.6258f, 15.2421f)
generalPath!!.lineTo(29.3524f, 15.2421f)
generalPath!!.lineTo(29.2059f, 14.6669f)
generalPath!!.lineTo(28.6258f, 14.0907f)
generalPath!!.lineTo(29.6063f, 13.8846f)
generalPath!!.lineTo(30.1512f, 13.2684f)
generalPath!!.lineTo(30.5867f, 12.5272f)
generalPath!!.lineTo(31.3875f, 12.5272f)
generalPath!!.lineTo(31.1687f, 11.952f)
generalPath!!.lineTo(31.6785f, 11.6229f)
generalPath!!.lineTo(31.6785f, 12.2811f)
generalPath!!.lineTo(32.7683f, 12.5272f)
generalPath!!.lineTo(33.8581f, 11.6229f)
generalPath!!.lineTo(33.9313f, 11.2108f)
generalPath!!.lineTo(34.8756f, 10.5531f)
generalPath!!.curveTo(34.5338f, 10.5956f, 34.192f, 10.6268f, 33.858f, 10.7177f)
generalPath!!.lineTo(33.858f, 9.9766f)
generalPath!!.lineTo(34.2213f, 9.1538f)
generalPath!!.lineTo(33.858f, 9.1538f)
generalPath!!.lineTo(33.0596f, 9.894f)
generalPath!!.lineTo(32.8408f, 10.3056f)
generalPath!!.lineTo(33.0596f, 10.8823f)
generalPath!!.lineTo(32.6953f, 11.8686f)
generalPath!!.lineTo(32.1142f, 11.5395f)
generalPath!!.lineTo(31.6064f, 10.9643f)
generalPath!!.lineTo(30.8056f, 11.5395f)
generalPath!!.lineTo(30.5146f, 10.2236f)
generalPath!!.lineTo(31.8955f, 9.3188f)
generalPath!!.lineTo(31.8955f, 8.8247f)
generalPath!!.lineTo(32.7685f, 8.249001f)
generalPath!!.lineTo(34.1494f, 7.9194f)
generalPath!!.lineTo(35.0947f, 8.249001f)
generalPath!!.lineTo(36.8388f, 8.5781f)
generalPath!!.lineTo(36.4033f, 9.0713005f)
generalPath!!.lineTo(35.458f, 9.0713005f)
generalPath!!.lineTo(36.4033f, 10.0586f)
generalPath!!.lineTo(37.1299f, 9.2363f)
generalPath!!.lineTo(37.3506f, 8.8745f)
generalPath!!.curveTo(37.3506f, 8.8745f, 40.1377f, 11.3725f, 41.7305f, 14.105f)
generalPath!!.curveTo(43.3233f, 16.8384f, 44.0713f, 20.0601f, 44.0713f, 20.7144f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_1_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(26.0703f, 9.2363f)
generalPath!!.lineTo(25.9971f, 9.7295f)
generalPath!!.lineTo(26.5069f, 10.0586f)
generalPath!!.lineTo(27.378f, 9.4829f)
generalPath!!.lineTo(26.9425f, 8.9892f)
generalPath!!.lineTo(26.3605f, 9.3188f)
generalPath!!.lineTo(26.0705f, 9.2363f)
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_2_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(26.8701f, 5.8633f)
generalPath!!.lineTo(24.9795f, 5.1226f)
generalPath!!.lineTo(22.7998f, 5.3692f)
generalPath!!.lineTo(20.1094f, 6.1094f)
generalPath!!.lineTo(19.6006f, 6.6035f)
generalPath!!.lineTo(21.2725f, 7.7549f)
generalPath!!.lineTo(21.2725f, 8.4131f)
generalPath!!.lineTo(20.6182f, 9.0713005f)
generalPath!!.lineTo(21.4912f, 10.8003f)
generalPath!!.lineTo(22.0713f, 10.4702f)
generalPath!!.lineTo(22.7998f, 9.3188f)
generalPath!!.curveTo(23.9228f, 8.971601f, 24.9297f, 8.5781f, 25.9971f, 8.0844f)
generalPath!!.lineTo(26.8701f, 5.8632f)
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_3_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(28.833f, 12.7749f)
generalPath!!.lineTo(28.542f, 12.0337f)
generalPath!!.lineTo(28.0322f, 12.1987f)
generalPath!!.lineTo(28.1787f, 13.103f)
generalPath!!.lineTo(28.833f, 12.7749f)
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_4_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(29.123f, 12.6089f)
generalPath!!.lineTo(28.9775f, 13.5972f)
generalPath!!.lineTo(29.7773f, 13.4322f)
generalPath!!.lineTo(30.3584f, 12.857f)
generalPath!!.lineTo(29.8496f, 12.3629f)
generalPath!!.curveTo(29.6787f, 11.9078f, 29.4824f, 11.483f, 29.2685f, 11.0465f)
generalPath!!.lineTo(28.833f, 11.0465f)
generalPath!!.lineTo(28.833f, 11.5397f)
generalPath!!.lineTo(29.123f, 11.8688f)
generalPath!!.lineTo(29.123f, 12.609f)
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_5_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_5_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.3652f, 28.2422f)
generalPath!!.lineTo(17.7832f, 27.0899f)
generalPath!!.lineTo(16.6929f, 26.8433f)
generalPath!!.lineTo(16.1114f, 25.2808f)
generalPath!!.lineTo(14.6578f, 25.4449f)
generalPath!!.lineTo(13.4224f, 24.5406f)
generalPath!!.lineTo(12.1133f, 25.692f)
generalPath!!.lineTo(12.1133f, 25.8736f)
generalPath!!.curveTo(11.7173f, 25.7593f, 11.2305f, 25.7437f, 10.8779f, 25.5269f)
generalPath!!.lineTo(10.5869f, 24.7046f)
generalPath!!.lineTo(10.5869f, 23.7993f)
generalPath!!.lineTo(9.7148f, 23.8813f)
generalPath!!.curveTo(9.7876005f, 23.3051f, 9.8598f, 22.7299f, 9.9331f, 22.1538f)
generalPath!!.lineTo(9.4238f, 22.1538f)
generalPath!!.lineTo(8.9155f, 22.812f)
generalPath!!.lineTo(8.4062f, 23.0581f)
generalPath!!.lineTo(7.6791f, 22.6479f)
generalPath!!.lineTo(7.6063f, 21.7426f)
generalPath!!.lineTo(7.7518f, 20.7553f)
generalPath!!.lineTo(8.8426f, 19.933f)
generalPath!!.lineTo(9.7147f, 19.933f)
generalPath!!.lineTo(9.8597f, 19.4389f)
generalPath!!.lineTo(10.95f, 19.685f)
generalPath!!.lineTo(11.7498f, 20.6733f)
generalPath!!.lineTo(11.8953f, 19.0268f)
generalPath!!.lineTo(13.2766f, 17.8754f)
generalPath!!.lineTo(13.7854f, 16.641f)
generalPath!!.lineTo(14.803f, 16.2299f)
generalPath!!.lineTo(15.3845f, 15.4076f)
generalPath!!.lineTo(16.6926f, 15.1596f)
generalPath!!.lineTo(17.3474f, 14.1733f)
generalPath!!.curveTo(16.6931f, 14.1733f, 16.0388f, 14.1733f, 15.3845f, 14.1733f)
generalPath!!.lineTo(16.6203f, 13.5971f)
generalPath!!.lineTo(17.4919f, 13.5971f)
generalPath!!.lineTo(18.7282f, 13.185f)
generalPath!!.lineTo(18.8737f, 12.6928f)
generalPath!!.lineTo(18.4372f, 12.2807f)
generalPath!!.lineTo(17.9284f, 12.1157f)
generalPath!!.lineTo(18.0739f, 11.6225f)
generalPath!!.lineTo(17.7106f, 10.8823f)
generalPath!!.lineTo(16.838f, 11.2104f)
generalPath!!.lineTo(16.9835f, 10.5527f)
generalPath!!.lineTo(15.9659f, 9.9765005f)
generalPath!!.lineTo(15.1666f, 11.3744f)
generalPath!!.lineTo(15.2389f, 11.8685f)
generalPath!!.lineTo(14.4396f, 12.1986f)
generalPath!!.lineTo(13.9303f, 13.2679f)
generalPath!!.lineTo(13.7125f, 12.2806f)
generalPath!!.lineTo(12.3312f, 11.7044f)
generalPath!!.lineTo(12.1129f, 10.9642f)
generalPath!!.lineTo(13.9303f, 9.8939f)
generalPath!!.lineTo(14.7301f, 9.1537f)
generalPath!!.lineTo(14.8029f, 8.2489f)
generalPath!!.lineTo(14.3669f, 8.001801f)
generalPath!!.lineTo(13.7854f, 7.9193f)
generalPath!!.lineTo(13.4221f, 8.8246f)
generalPath!!.curveTo(13.4221f, 8.8246f, 12.8142f, 8.9437f, 12.6579f, 8.9823f)
generalPath!!.curveTo(10.6618f, 10.8217f, 6.6286f, 14.7924f, 5.6916f, 22.2885f)
generalPath!!.curveTo(5.7287f, 22.4623f, 6.3708f, 23.4701f, 6.3708f, 23.4701f)
generalPath!!.lineTo(7.8972f, 24.3744f)
generalPath!!.lineTo(9.4236f, 24.7865f)
generalPath!!.lineTo(10.0784f, 25.6097f)
generalPath!!.lineTo(11.0955f, 26.3499f)
generalPath!!.lineTo(11.677f, 26.2679f)
generalPath!!.lineTo(12.113f, 26.4642f)
generalPath!!.lineTo(12.113f, 26.597f)
generalPath!!.lineTo(11.5319f, 28.16f)
generalPath!!.lineTo(11.0954f, 28.8182f)
generalPath!!.lineTo(11.2409f, 29.1483f)
generalPath!!.lineTo(10.8776f, 30.3807f)
generalPath!!.lineTo(12.1862f, 32.7674f)
generalPath!!.lineTo(13.4943f, 33.9197f)
generalPath!!.lineTo(14.0763f, 34.742f)
generalPath!!.lineTo(14.0031f, 36.4705f)
generalPath!!.lineTo(14.4396f, 37.4568f)
generalPath!!.lineTo(14.0031f, 39.3494f)
generalPath!!.curveTo(14.0031f, 39.3494f, 13.9689f, 39.3377f, 14.0246f, 39.5271f)
generalPath!!.curveTo(14.0808f, 39.7166f, 16.3537f, 40.9783f, 16.4982f, 40.8709f)
generalPath!!.curveTo(16.6422f, 40.7615f, 16.7653f, 40.6658f, 16.7653f, 40.6658f)
generalPath!!.lineTo(16.6203f, 40.2556f)
generalPath!!.lineTo(17.2014f, 39.6794f)
generalPath!!.lineTo(17.4197f, 39.1032f)
generalPath!!.lineTo(18.365f, 38.7731f)
generalPath!!.lineTo(19.0916f, 36.9626f)
generalPath!!.lineTo(18.8738f, 36.4704f)
generalPath!!.lineTo(19.3816f, 35.7302f)
generalPath!!.lineTo(20.4724f, 35.4822f)
generalPath!!.lineTo(21.0544f, 34.1658f)
generalPath!!.lineTo(20.9089f, 32.5213f)
generalPath!!.lineTo(21.781f, 31.2869f)
generalPath!!.lineTo(21.9265f, 30.0525f)
generalPath!!.curveTo(20.7331f, 29.4607f, 19.5495f, 28.8513f, 18.365f, 28.242f)
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_6_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_6_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.7656f, 9.5649f)
generalPath!!.lineTo(17.4922f, 10.0586f)
generalPath!!.lineTo(18.0742f, 10.0586f)
generalPath!!.lineTo(18.0742f, 9.4829f)
generalPath!!.lineTo(17.3476f, 9.1538f)
generalPath!!.lineTo(16.7656f, 9.5649f)
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_7_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_7_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(14.876f, 8.9072f)
generalPath!!.lineTo(14.5122f, 9.812f)
generalPath!!.lineTo(15.2393f, 9.812f)
generalPath!!.lineTo(15.6031f, 8.9892f)
generalPath!!.curveTo(15.9166f, 8.7675f, 16.2286f, 8.5444f, 16.5479f, 8.331f)
generalPath!!.lineTo(17.275f, 8.5781f)
generalPath!!.curveTo(17.7594f, 8.9072f, 18.2438f, 9.2363f, 18.7286f, 9.5649f)
generalPath!!.lineTo(19.4561f, 8.9072f)
generalPath!!.lineTo(18.6558f, 8.5781f)
generalPath!!.lineTo(18.292f, 7.8374f)
generalPath!!.lineTo(16.9111f, 7.6728f)
generalPath!!.lineTo(16.8383f, 7.2612f)
generalPath!!.lineTo(16.184f, 7.4262f)
generalPath!!.lineTo(15.8936f, 8.002f)
generalPath!!.lineTo(15.5298f, 7.2613f)
generalPath!!.lineTo(15.3848f, 7.5904f)
generalPath!!.lineTo(15.4576f, 8.4132f)
generalPath!!.lineTo(14.876f, 8.9072f)
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_8
g.composite = AlphaComposite.getInstance(3, 0.75f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_8_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_8_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_8_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_8_1_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_9
g.composite = AlphaComposite.getInstance(3, 0.75f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_9_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_9_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_9_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_9_1_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_10_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_10_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.4922f, 6.8496003f)
generalPath!!.lineTo(17.856f, 6.521f)
generalPath!!.lineTo(18.5831f, 6.3564f)
generalPath!!.curveTo(19.0811f, 6.1142f, 19.5811f, 5.9511f, 20.1095f, 5.7802f)
generalPath!!.lineTo(19.8195f, 5.2865f)
generalPath!!.lineTo(18.881f, 5.4213f)
generalPath!!.lineTo(18.4376f, 5.8632f)
generalPath!!.lineTo(17.7066f, 5.9692f)
generalPath!!.lineTo(17.0567f, 6.2744f)
generalPath!!.lineTo(16.7408f, 6.4272f)
generalPath!!.lineTo(16.5479f, 6.6855f)
generalPath!!.lineTo(17.4922f, 6.8496003f)
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_11_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_4_11_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.7285f, 14.6665f)
generalPath!!.lineTo(19.165f, 14.0083f)
generalPath!!.lineTo(18.5102f, 13.5151f)
generalPath!!.lineTo(18.7285f, 14.6665f)
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, Point2D.Double(18.93430519104004, 17.810213088989258), floatArrayOf(0.0f,0.37931034f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(254, 254, 254, 255)) ?: Color(254, 254, 254, 255)),(colorFilter?.filter(Color(29, 29, 29, 255)) ?: Color(29, 29, 29, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_5
paint = RadialGradientPaint(Point2D.Double(15.601279258728027, 12.142301559448242), 43.526714f, Point2D.Double(15.601279258728027, 12.142301559448242), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 42)) ?: Color(255, 255, 255, 42))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.5871300101280212f, 0.0f, 0.0f, 0.5871419906616211f, 11.299189567565918f, 10.429670333862305f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(36.531418f, 24.218876f)
generalPath!!.curveTo(36.531418f, 30.187597f, 31.692724f, 35.026237f, 25.724825f, 35.026237f)
generalPath!!.curveTo(19.756376f, 35.026237f, 14.917956f, 30.187544f, 14.917956f, 24.218876f)
generalPath!!.curveTo(14.917956f, 18.25043f, 19.756376f, 13.412282f, 25.724825f, 13.412282f)
generalPath!!.curveTo(31.692724f, 13.412282f, 36.531418f, 18.25043f, 36.531418f, 24.218876f)
generalPath!!.lineTo(36.531418f, 24.218876f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
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
_paint1(g, origAlpha)


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
            return 4.997228145599365
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
            return 40.916595458984375
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.6827278137207
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Text_html(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Text_html(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Text_html(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

    override fun setColorFilter(colorFilter: RadianceIcon.ColorFilter?) {
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

