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
class Edit_find_replace private constructor(private var width: Int, private var height: Int)
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
g.transform(AffineTransform(0.02083333395421505f, 0.0f, 0.0f, 0.02083333395421505f, -0.0f, -0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 0.7836257f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071080207824707f))
// _0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.128307f, 42.07798f)
generalPath!!.curveTo(40.15366f, 43.693268f, 37.143654f, 45.188953f, 32.238045f, 45.998688f)
generalPath!!.curveTo(27.332438f, 46.808426f, 21.281149f, 46.808426f, 16.37554f, 45.998688f)
generalPath!!.curveTo(11.469932f, 45.188953f, 8.459925f, 43.693268f, 8.485279f, 42.07798f)
generalPath!!.curveTo(8.459925f, 40.462692f, 11.469932f, 38.967007f, 16.37554f, 38.157272f)
generalPath!!.curveTo(21.281149f, 37.347534f, 27.332438f, 37.347534f, 32.238045f, 38.157272f)
generalPath!!.curveTo(37.143654f, 38.967007f, 40.15366f, 40.462692f, 40.128307f, 42.07798f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.306795120239258, 42.077980041503906), 15.821514f, Point2D.Double(24.306795120239258, 42.077980041503906), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.2849160134792328f, 0.0f, 30.089279174804688f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
paint = colorFilter?.filter(Color(0, 0, 0, 4)) ?: Color(0, 0, 0, 4)
stroke = BasicStroke(0.9885531f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.505723f, 5.4942765f)
generalPath!!.lineTo(11.505723f, 43.40087f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0035840272903442f, 0.0f, 0.0f, 1.0019429922103882f, -0.1272200047969818f, -0.15353399515151978f))
// _0_2_0
shape = RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2898895740509033, 2.2936408519744873)
paint = RadialGradientPaint(Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, Point2D.Double(33.966678619384766, 35.736915588378906), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(250, 250, 250, 255)) ?: Color(250, 250, 250, 255)),(colorFilter?.filter(Color(187, 187, 187, 255)) ?: Color(187, 187, 187, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.0411319732666016f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = RadialGradientPaint(Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, Point2D.Double(8.824419021606445, 3.7561285495758057), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(163, 163, 163, 255)) ?: Color(163, 163, 163, 255)),(colorFilter?.filter(Color(76, 76, 76, 255)) ?: Color(76, 76, 76, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f))
stroke = BasicStroke(0.99724436f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2898895740509033, 2.2936408519744873)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0035840272903442f, 0.0f, 0.0f, 1.0019429922103882f, -0.1272200047969818f, -0.15353399515151978f))
// _0_2_1
paint = RadialGradientPaint(Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, Point2D.Double(8.143556594848633, 7.26789665222168), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(248, 248, 248, 255)) ?: Color(248, 248, 248, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f))
stroke = BasicStroke(0.99724436f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(7.666053771972656, 4.583946228027344, 32.77588653564453, 38.94638442993164, 0.29703250527381897, 0.29751908779144287)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.6464470028877258f, -0.03798932954668999f))
// _0_2_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.967081069946289f, 4.244972229003906f))
// _0_2_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_0_0
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
// _0_2_2_0_1
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
// _0_2_2_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.995011f, 29.952326f)
generalPath!!.curveTo(9.995011f, 30.405529f, 9.627486f, 30.772825f, 9.174282f, 30.772825f)
generalPath!!.curveTo(8.720848f, 30.772825f, 8.353553f, 30.405302f, 8.353553f, 29.952326f)
generalPath!!.curveTo(8.353553f, 29.498892f, 8.721078f, 29.131598f, 9.174282f, 29.131598f)
generalPath!!.curveTo(9.627486f, 29.131598f, 9.99501f, 29.499123f, 9.99501f, 29.952326f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(9.412507057189941, 30.296512603759766), 1.207319f, Point2D.Double(9.412507057189941, 30.296512603759766), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(240, 240, 240, 255)) ?: Color(240, 240, 240, 255)),(colorFilter?.filter(Color(154, 154, 154, 255)) ?: Color(154, 154, 154, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_2_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.995011f, 18.467176f)
generalPath!!.curveTo(9.995011f, 18.92038f, 9.627486f, 19.287905f, 9.174282f, 19.287905f)
generalPath!!.curveTo(8.720848f, 19.287905f, 8.353553f, 18.92038f, 8.353553f, 18.467176f)
generalPath!!.curveTo(8.353553f, 18.013742f, 8.721078f, 17.646448f, 9.174282f, 17.646448f)
generalPath!!.curveTo(9.627486f, 17.646448f, 9.99501f, 18.013973f, 9.99501f, 18.467176f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(9.412507057189941, 18.811248779296875), 1.2075487f, Point2D.Double(9.412507057189941, 18.811248779296875), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(240, 240, 240, 255)) ?: Color(240, 240, 240, 255)),(colorFilter?.filter(Color(154, 154, 154, 255)) ?: Color(154, 154, 154, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_3
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9090909957885742f, 0.0f, 0.0f, 1.0f, 2.3636279106140137f, 0.0f))
// _0_2_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_0
shape = RoundRectangle2D.Double(15.000001907348633, 9.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_1
shape = RoundRectangle2D.Double(15.000001907348633, 11.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_2
shape = RoundRectangle2D.Double(15.000001907348633, 13.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_3
shape = RoundRectangle2D.Double(15.000001907348633, 15.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_4
shape = RoundRectangle2D.Double(15.000001907348633, 17.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_5
shape = RoundRectangle2D.Double(15.000001907348633, 19.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_6
shape = RoundRectangle2D.Double(15.000001907348633, 21.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_7
shape = RoundRectangle2D.Double(15.000001907348633, 23.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_8
shape = RoundRectangle2D.Double(14.999992370605469, 25.0, 9.900005340576172, 1.0, 0.1364084780216217, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_9
shape = RoundRectangle2D.Double(14.999992370605469, 29.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_10
shape = RoundRectangle2D.Double(14.999992370605469, 31.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_11
shape = RoundRectangle2D.Double(14.999992370605469, 33.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_12
shape = RoundRectangle2D.Double(14.999992370605469, 35.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_4_13
shape = RoundRectangle2D.Double(14.999992370605469, 37.0, 15.40001392364502, 1.0, 0.21219104528427124, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.17112301f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9624220132827759f, 0.0f, 0.0f, 1.0113660097122192f, -7.130765914916992f, -7.903209209442139f))
// _0_2_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.65864f, 37.967922f)
generalPath!!.curveTo(40.685127f, 39.37734f, 37.540596f, 40.6824f, 32.415745f, 41.38893f)
generalPath!!.curveTo(27.290888f, 42.095467f, 20.969152f, 42.095467f, 15.844297f, 41.38893f)
generalPath!!.curveTo(10.719443f, 40.6824f, 7.574911f, 39.37734f, 7.6013985f, 37.967922f)
generalPath!!.curveTo(7.574911f, 36.558506f, 10.719443f, 35.253445f, 15.844297f, 34.546913f)
generalPath!!.curveTo(20.969152f, 33.840378f, 27.290888f, 33.840378f, 32.415745f, 34.546913f)
generalPath!!.curveTo(37.540596f, 35.253445f, 40.685127f, 36.558506f, 40.65864f, 37.967922f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.13001823425293, 37.96792221069336), 16.528622f, Point2D.Double(24.13001823425293, 37.96792221069336), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.23796799778938293f, 0.0f, 28.93277931213379f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.0003249645233154f, -0.8508800268173218f))
// _0_2_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_6_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.6432769894599915f, 0.0f, 0.0f, 0.6432769894599915f, 31.49802017211914f, 4.828703880310059f))
// _0_2_6_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.62757f, 3.1435547f)
generalPath!!.curveTo(10.48844f, 3.1435547f, 3.8827686f, 9.749226f, 3.8827686f, 17.888355f)
generalPath!!.curveTo(3.8827686f, 26.027485f, 10.48844f, 32.633156f, 18.62757f, 32.633156f)
generalPath!!.curveTo(22.107124f, 32.633156f, 25.17857f, 31.248762f, 27.701292f, 29.230509f)
generalPath!!.curveTo(27.495914f, 30.23739f, 27.623257f, 31.265877f, 28.457436f, 31.990433f)
generalPath!!.lineTo(39.42152f, 41.51784f)
generalPath!!.curveTo(40.654938f, 42.58917f, 42.508984f, 42.448803f, 43.58031f, 41.215385f)
generalPath!!.curveTo(44.651638f, 39.981968f, 44.51127f, 38.127922f, 43.277855f, 37.056595f)
generalPath!!.lineTo(32.31377f, 27.529182f)
generalPath!!.curveTo(31.642242f, 26.945904f, 30.820892f, 26.773214f, 30.007532f, 26.886461f)
generalPath!!.curveTo(31.994232f, 24.374039f, 33.37237f, 21.337658f, 33.37237f, 17.888351f)
generalPath!!.curveTo(33.37237f, 9.749222f, 26.7667f, 3.14355f, 18.627571f, 3.14355f)
generalPath!!.closePath()
generalPath!!.moveTo(18.551954f, 4.369738f)
generalPath!!.curveTo(26.191414f, 4.369738f, 31.843729f, 9.158689f, 31.843729f, 17.661512f)
generalPath!!.curveTo(31.843729f, 26.336624f, 26.027039f, 30.953287f, 18.551954f, 30.953287f)
generalPath!!.curveTo(11.249005f, 30.953287f, 5.2601805f, 25.475195f, 5.2601805f, 17.661512f)
generalPath!!.curveTo(5.2601805f, 9.677405f, 11.084819f, 4.3697376f, 18.551954f, 4.3697376f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(220, 220, 220, 255)) ?: Color(220, 220, 220, 255)
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(27.36634063720703, 26.58029556274414), Point2D.Double(31.33596420288086, 30.557771682739258), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(138, 138, 138, 255)) ?: Color(138, 138, 138, 255)),(colorFilter?.filter(Color(72, 72, 72, 255)) ?: Color(72, 72, 72, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 48.18408966064453f, 0.0f))
stroke = BasicStroke(3.1090834f,1,0,10.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.62757f, 3.1435547f)
generalPath!!.curveTo(10.48844f, 3.1435547f, 3.8827686f, 9.749226f, 3.8827686f, 17.888355f)
generalPath!!.curveTo(3.8827686f, 26.027485f, 10.48844f, 32.633156f, 18.62757f, 32.633156f)
generalPath!!.curveTo(22.107124f, 32.633156f, 25.17857f, 31.248762f, 27.701292f, 29.230509f)
generalPath!!.curveTo(27.495914f, 30.23739f, 27.623257f, 31.265877f, 28.457436f, 31.990433f)
generalPath!!.lineTo(39.42152f, 41.51784f)
generalPath!!.curveTo(40.654938f, 42.58917f, 42.508984f, 42.448803f, 43.58031f, 41.215385f)
generalPath!!.curveTo(44.651638f, 39.981968f, 44.51127f, 38.127922f, 43.277855f, 37.056595f)
generalPath!!.lineTo(32.31377f, 27.529182f)
generalPath!!.curveTo(31.642242f, 26.945904f, 30.820892f, 26.773214f, 30.007532f, 26.886461f)
generalPath!!.curveTo(31.994232f, 24.374039f, 33.37237f, 21.337658f, 33.37237f, 17.888351f)
generalPath!!.curveTo(33.37237f, 9.749222f, 26.7667f, 3.14355f, 18.627571f, 3.14355f)
generalPath!!.closePath()
generalPath!!.moveTo(18.551954f, 4.369738f)
generalPath!!.curveTo(26.191414f, 4.369738f, 31.843729f, 9.158689f, 31.843729f, 17.661512f)
generalPath!!.curveTo(31.843729f, 26.336624f, 26.027039f, 30.953287f, 18.551954f, 30.953287f)
generalPath!!.curveTo(11.249005f, 30.953287f, 5.2601805f, 25.475195f, 5.2601805f, 17.661512f)
generalPath!!.curveTo(5.2601805f, 9.677405f, 11.084819f, 4.3697376f, 18.551954f, 4.3697376f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.6432769894599915f, 0.0f, 0.0f, 0.6432769894599915f, 31.49802017211914f, 4.828703880310059f))
// _0_2_6_0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.602905f, 3.0803552f)
generalPath!!.curveTo(10.437466f, 3.0803552f, 3.810441f, 9.707379f, 3.810441f, 17.87282f)
generalPath!!.curveTo(3.810441f, 26.03826f, 10.437466f, 32.665283f, 18.602905f, 32.665283f)
generalPath!!.curveTo(22.093708f, 32.665283f, 25.175083f, 31.276417f, 27.70596f, 29.251638f)
generalPath!!.curveTo(27.499918f, 30.261774f, 27.627672f, 31.293585f, 28.464546f, 32.020485f)
generalPath!!.lineTo(39.464073f, 41.57869f)
generalPath!!.curveTo(40.701477f, 42.65348f, 42.561516f, 42.51266f, 43.636307f, 41.275253f)
generalPath!!.curveTo(44.711098f, 40.03785f, 44.570274f, 38.17781f, 43.33287f, 37.10302f)
generalPath!!.lineTo(32.333344f, 27.544811f)
generalPath!!.curveTo(31.659645f, 26.959648f, 30.83564f, 26.786398f, 30.01965f, 26.900013f)
generalPath!!.curveTo(32.01277f, 24.379469f, 33.395367f, 21.333273f, 33.395367f, 17.872816f)
generalPath!!.curveTo(33.395367f, 9.7073765f, 26.768343f, 3.0803518f, 18.602901f, 3.0803518f)
generalPath!!.closePath()
generalPath!!.moveTo(18.527046f, 6.266424f)
generalPath!!.curveTo(24.808155f, 6.266424f, 29.905865f, 11.364135f, 29.905865f, 17.645243f)
generalPath!!.curveTo(29.905865f, 23.92635f, 24.808155f, 29.02406f, 18.527046f, 29.02406f)
generalPath!!.curveTo(12.245937f, 29.02406f, 7.1482277f, 23.92635f, 7.1482277f, 17.64524f)
generalPath!!.curveTo(7.1482277f, 11.364133f, 12.245938f, 6.2664223f, 18.527046f, 6.2664223f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(220, 220, 220, 255)) ?: Color(220, 220, 220, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.6432769894599915f, 0.0f, 0.0f, 0.6432769894599915f, 31.49802017211914f, 4.828703880310059f))
// _0_2_6_0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.507004f, 41.57769f)
generalPath!!.curveTo(39.02833f, 39.304504f, 40.904335f, 36.76627f, 43.091057f, 36.789314f)
generalPath!!.curveTo(43.091057f, 36.789314f, 32.33069f, 27.531204f, 32.33069f, 27.531204f)
generalPath!!.curveTo(29.385897f, 27.474499f, 28.061186f, 29.80382f, 28.553875f, 32.131126f)
generalPath!!.lineTo(39.507004f, 41.57769f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(30.65625, 34.0), Point2D.Double(33.21875, 31.0625), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(125, 125, 125, 255)) ?: Color(125, 125, 125, 255)),(colorFilter?.filter(Color(177, 177, 177, 255)) ?: Color(177, 177, 177, 255)),(colorFilter?.filter(Color(104, 104, 104, 255)) ?: Color(104, 104, 104, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-1.3345930576324463f, 0.0f, 0.0f, 1.2912919521331787f, 55.157928466796875f, -7.460658073425293f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.8013579845428467f, 0.0f, 0.0f, 0.8013579845428467f, 33.70146942138672f, 0.8551589846611023f))
// _0_2_6_1
paint = LinearGradientPaint(Point2D.Double(18.292673110961914, 13.602121353149414), Point2D.Double(17.500892639160156, 25.74346923828125), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 56)) ?: Color(255, 255, 255, 56)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 44.17826843261719f, 0.0f))
stroke = BasicStroke(1.2478822f,1,0,10.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(28.549437f, 18.920233f)
generalPath!!.curveTo(28.567142f, 22.879269f, 26.465181f, 26.545166f, 23.039478f, 28.529814f)
generalPath!!.curveTo(19.613773f, 30.51446f, 15.388013f, 30.51446f, 11.962308f, 28.529814f)
generalPath!!.curveTo(8.536603f, 26.545166f, 6.4346433f, 22.879269f, 6.4523487f, 18.920233f)
generalPath!!.curveTo(6.4346433f, 14.961198f, 8.536603f, 11.295299f, 11.962308f, 9.310653f)
generalPath!!.curveTo(15.388013f, 7.326006f, 19.613773f, 7.326006f, 23.039478f, 9.310653f)
generalPath!!.curveTo(26.465181f, 11.295299f, 28.567142f, 14.961198f, 28.549437f, 18.920233f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.43315506f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.48437899351119995f, 0.42329999804496765f, 0.4174230098724365f, 0.4894520044326782f, 31.49802017211914f, 4.828703880310059f))
// _0_2_6_2
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(1.5545894f,1,0,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(40.37333679199219, 0.14086054265499115, 19.048439025878906, 4.440478324890137, 6.64305305480957, 4.440478324890137)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-0.8996970057487488f, 0.0f, 0.0f, 0.8996970057487488f, 35.50199890136719f, -0.5098260045051575f))
// _0_2_6_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.897785f, 18.478292f)
generalPath!!.curveTo(25.9111f, 21.455486f, 24.330425f, 24.212242f, 21.754295f, 25.704697f)
generalPath!!.curveTo(19.178165f, 27.197151f, 16.000395f, 27.197151f, 13.424264f, 25.704697f)
generalPath!!.curveTo(10.848134f, 24.212242f, 9.267461f, 21.455486f, 9.280775f, 18.478292f)
generalPath!!.curveTo(9.267461f, 15.501098f, 10.848134f, 12.744342f, 13.424264f, 11.251888f)
generalPath!!.curveTo(16.000395f, 9.759434f, 19.178165f, 9.759434f, 21.754295f, 11.251888f)
generalPath!!.curveTo(24.330425f, 12.744342f, 25.9111f, 15.501098f, 25.897785f, 18.478292f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.240928649902344, 21.8179874420166), 8.308505f, Point2D.Double(18.240928649902344, 21.8179874420166), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(114, 159, 207, 53)) ?: Color(114, 159, 207, 53)),(colorFilter?.filter(Color(114, 159, 207, 172)) ?: Color(114, 159, 207, 172))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 43.35200119018555f, 0.0f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(48, 99, 163, 255)) ?: Color(48, 99, 163, 255)
stroke = BasicStroke(1.1114874f,1,0,10.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.897785f, 18.478292f)
generalPath!!.curveTo(25.9111f, 21.455486f, 24.330425f, 24.212242f, 21.754295f, 25.704697f)
generalPath!!.curveTo(19.178165f, 27.197151f, 16.000395f, 27.197151f, 13.424264f, 25.704697f)
generalPath!!.curveTo(10.848134f, 24.212242f, 9.267461f, 21.455486f, 9.280775f, 18.478292f)
generalPath!!.curveTo(9.267461f, 15.501098f, 10.848134f, 12.744342f, 13.424264f, 11.251888f)
generalPath!!.curveTo(16.000395f, 9.759434f, 19.178165f, 9.759434f, 21.754295f, 11.251888f)
generalPath!!.curveTo(24.330425f, 12.744342f, 25.9111f, 15.501098f, 25.897785f, 18.478292f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.8342246f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.6432769894599915f, 0.0f, 0.0f, 0.6432769894599915f, 7.85593318939209f, 4.828703880310059f))
// _0_2_6_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.156916f, 7.3966937f)
generalPath!!.curveTo(12.949326f, 7.3966937f, 8.732368f, 11.613651f, 8.732368f, 16.821241f)
generalPath!!.curveTo(8.732368f, 18.325216f, 9.152676f, 19.709015f, 9.77954f, 20.971144f)
generalPath!!.curveTo(11.03192f, 21.432756f, 12.362297f, 21.746826f, 13.774307f, 21.746826f)
generalPath!!.curveTo(19.945263f, 21.746826f, 24.873589f, 16.88519f, 25.254414f, 10.809697f)
generalPath!!.curveTo(23.523449f, 8.764166f, 21.044374f, 7.396693f, 18.156916f, 7.396693f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(15.4143705368042, 13.078408241271973), 6.65625f, Point2D.Double(15.4143705368042, 13.078408241271973), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 63)) ?: Color(255, 255, 255, 63))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.5929629802703857f, 0.0f, 0.0f, 2.2521040439605713f, -25.05975914001465f, -18.94099998474121f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.2f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.61661297082901f, 0.0f, 0.0f, 0.2935769855976105f, 12.738160133361816f, 29.128480911254883f))
// _0_2_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(43.125f, 40.4375f)
generalPath!!.curveTo(43.15635f, 42.878628f, 39.434628f, 45.13901f, 33.36909f, 46.36274f)
generalPath!!.curveTo(27.303555f, 47.586468f, 19.821445f, 47.586468f, 13.755908f, 46.36274f)
generalPath!!.curveTo(7.690371f, 45.13901f, 3.9686508f, 42.878628f, 4.0f, 40.4375f)
generalPath!!.curveTo(3.9686508f, 37.996372f, 7.690371f, 35.73599f, 13.755908f, 34.51226f)
generalPath!!.curveTo(19.821445f, 33.288532f, 27.303555f, 33.288532f, 33.36909f, 34.51226f)
generalPath!!.curveTo(39.434628f, 35.73599f, 43.15635f, 37.996372f, 43.125f, 40.4375f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(23.5625, 40.4375), 19.5625f, Point2D.Double(23.5625, 40.4375), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.34824299812316895f, 0.0f, 26.355430603027344f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0336990356445312f, -0.276978999376297f, 0.276978999376297f, 1.0336990356445312f, -9.427308082580566f, 13.333688735961914f))
// _0_2_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_8_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.34116f, 32.5f)
generalPath!!.lineTo(22.96616f, 26.875f)
generalPath!!.lineTo(43.059906f, 17.125f)
generalPath!!.curveTo(46.309906f, 15.875f, 48.247406f, 20.5f, 45.372406f, 22.125f)
generalPath!!.lineTo(25.341158f, 31.5f)
generalPath!!.lineTo(17.341158f, 32.5f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(203, 144, 34, 255)) ?: Color(203, 144, 34, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(92, 65, 12, 255)) ?: Color(92, 65, 12, 255)
stroke = BasicStroke(0.9344358f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(17.34116f, 32.5f)
generalPath!!.lineTo(22.96616f, 26.875f)
generalPath!!.lineTo(43.059906f, 17.125f)
generalPath!!.curveTo(46.309906f, 15.875f, 48.247406f, 20.5f, 45.372406f, 22.125f)
generalPath!!.lineTo(25.341158f, 31.5f)
generalPath!!.lineTo(17.341158f, 32.5f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_8_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(38.330708f, 20.0f)
generalPath!!.curveTo(38.330708f, 20.0f, 39.768208f, 20.09375f, 40.330708f, 21.34375f)
generalPath!!.curveTo(40.910202f, 22.631512f, 40.330708f, 24.0f, 40.330708f, 24.0f)
generalPath!!.lineTo(45.361958f, 21.53125f)
generalPath!!.curveTo(45.361958f, 21.53125f, 46.813988f, 20.649883f, 46.018208f, 18.6875f)
generalPath!!.curveTo(45.233295f, 16.751923f, 43.330708f, 17.53125f, 43.330708f, 17.53125f)
generalPath!!.lineTo(38.330708f, 20.0f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(43.23695755004883, 17.376184463500977), Point2D.Double(45.31904220581055, 22.250591278076172), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 209, 209, 255)) ?: Color(255, 209, 209, 255)),(colorFilter?.filter(Color(255, 29, 29, 255)) ?: Color(255, 29, 29, 255)),(colorFilter?.filter(Color(111, 0, 0, 255)) ?: Color(111, 0, 0, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_8_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(38.330708f, 20.0f)
generalPath!!.curveTo(38.330708f, 20.0f, 39.768208f, 20.09375f, 40.330708f, 21.34375f)
generalPath!!.curveTo(40.910202f, 22.631512f, 40.330708f, 24.0f, 40.330708f, 24.0f)
generalPath!!.lineTo(42.330708f, 23.0f)
generalPath!!.curveTo(42.330708f, 23.0f, 43.157738f, 21.681133f, 42.549458f, 20.3125f)
generalPath!!.curveTo(41.924458f, 18.90625f, 40.330708f, 19.0f, 40.330708f, 19.0f)
generalPath!!.lineTo(38.330708f, 20.0f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(40.33070755004883, 19.8125), Point2D.Double(42.01820755004883, 22.625), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(193, 193, 193, 255)) ?: Color(193, 193, 193, 255)),(colorFilter?.filter(Color(172, 172, 172, 255)) ?: Color(172, 172, 172, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_8_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.768208f, 31.78125f)
generalPath!!.lineTo(23.268208f, 27.28125f)
generalPath!!.curveTo(24.768208f, 28.09375f, 25.549458f, 29.4375f, 25.143208f, 31.0f)
generalPath!!.lineTo(18.768208f, 31.78125f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(29.053354263305664, 27.640750885009766), 3.2408545f, Point2D.Double(29.053354263305664, 27.640750885009766), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(231, 226, 184, 255)) ?: Color(231, 226, 184, 255)),(colorFilter?.filter(Color(231, 226, 184, 0)) ?: Color(231, 226, 184, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.923564910888672f, 0.0f, 0.0f, 2.029716968536377f, -61.555320739746094f, -27.884170532226562f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_8_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.111958f, 30.375f)
generalPath!!.lineTo(18.486958f, 31.96875f)
generalPath!!.lineTo(20.830708f, 31.65625f)
generalPath!!.curveTo(21.049458f, 30.9375f, 20.643208f, 30.59375f, 20.111958f, 30.375f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(19.893207550048828, 31.171875), Point2D.Double(19.68904685974121, 30.828125), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(201, 201, 201, 255)) ?: Color(201, 201, 201, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_8_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(23.268208f, 27.25f)
generalPath!!.lineTo(24.830708f, 28.5f)
generalPath!!.lineTo(40.21805f, 21.18133f)
generalPath!!.curveTo(39.773617f, 20.325285f, 38.97628f, 20.096733f, 38.31467f, 20.019068f)
generalPath!!.lineTo(23.26821f, 27.25f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 93)) ?: Color(255, 255, 255, 93)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_8_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.143208f, 31.0625f)
generalPath!!.lineTo(25.330708f, 30.3125f)
generalPath!!.lineTo(40.5618f, 23.1829f)
generalPath!!.curveTo(40.5618f, 23.1829f, 40.451637f, 23.796526f, 40.34592f, 23.93225f)
generalPath!!.lineTo(25.14321f, 31.0625f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 93)) ?: Color(0, 0, 0, 93)
g.paint = paint
g.fill(shape)
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
            return 0.0033228187821805477
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.0625084638595581
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 0.9966771602630615
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 0.9273985028266907
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Edit_find_replace(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Edit_find_replace(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Edit_find_replace(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

