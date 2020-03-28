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
class Edit_find private constructor(private var width: Int, private var height: Int)
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
generalPath!!.moveTo(40.128307f, 42.07798f)
generalPath!!.curveTo(40.15366f, 43.693268f, 37.143654f, 45.188953f, 32.23805f, 45.998688f)
generalPath!!.curveTo(27.332438f, 46.808426f, 21.28115f, 46.808426f, 16.375542f, 45.998688f)
generalPath!!.curveTo(11.469933f, 45.188953f, 8.459927f, 43.693268f, 8.485281f, 42.07798f)
generalPath!!.curveTo(8.459927f, 40.462692f, 11.469933f, 38.967007f, 16.375542f, 38.157272f)
generalPath!!.curveTo(21.28115f, 37.347534f, 27.332438f, 37.347534f, 32.23805f, 38.157272f)
generalPath!!.curveTo(37.143654f, 38.967007f, 40.15366f, 40.462692f, 40.128307f, 42.07798f)
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
generalPath!!.moveTo(23.428f, 113.07f)
generalPath!!.curveTo(23.428f, 115.043f, 21.828f, 116.642f, 19.855f, 116.642f)
generalPath!!.curveTo(17.881f, 116.642f, 16.282f, 115.042f, 16.282f, 113.07f)
generalPath!!.curveTo(16.282f, 111.096f, 17.882f, 109.497f, 19.855f, 109.497f)
generalPath!!.curveTo(21.828f, 109.497f, 23.428f, 111.097f, 23.428f, 113.07f)
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
generalPath!!.moveTo(23.428f, 63.07f)
generalPath!!.curveTo(23.428f, 65.043f, 21.828f, 66.643f, 19.855f, 66.643f)
generalPath!!.curveTo(17.881f, 66.643f, 16.282f, 65.043f, 16.282f, 63.07f)
generalPath!!.curveTo(16.282f, 61.096f, 17.882f, 59.497f, 19.855f, 59.497f)
generalPath!!.curveTo(21.828f, 59.497f, 23.428f, 61.097f, 23.428f, 63.07f)
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
generalPath!!.moveTo(9.995011f, 29.952326f)
generalPath!!.curveTo(9.995011f, 30.40553f, 9.627486f, 30.772825f, 9.174282f, 30.772825f)
generalPath!!.curveTo(8.720848f, 30.772825f, 8.353554f, 30.4053f, 8.353554f, 29.952326f)
generalPath!!.curveTo(8.353554f, 29.498892f, 8.721078f, 29.131598f, 9.174282f, 29.131598f)
generalPath!!.curveTo(9.627486f, 29.131598f, 9.995011f, 29.499123f, 9.995011f, 29.952326f)
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
generalPath!!.moveTo(9.995011f, 18.467176f)
generalPath!!.curveTo(9.995011f, 18.92038f, 9.627486f, 19.287905f, 9.174282f, 19.287905f)
generalPath!!.curveTo(8.720848f, 19.287905f, 8.353554f, 18.92038f, 8.353554f, 18.467176f)
generalPath!!.curveTo(8.353554f, 18.013742f, 8.721078f, 17.646446f, 9.174282f, 17.646446f)
generalPath!!.curveTo(9.627486f, 17.646446f, 9.995011f, 18.013971f, 9.995011f, 18.467176f)
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
paint = Color(255, 255, 255, 52)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.6653770208358765f, 0.0f, 0.0f, 0.6653770208358765f, 15.9864501953125f, 17.908349990844727f))
// _0_2_1
g.composite = AlphaComposite.getInstance(3, 0.17112298f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.446431040763855f, 0.0f, 0.0f, 1.5199899673461914f, -10.974530220031738f, -17.751680374145508f))
// _0_2_1_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.65864f, 37.967922f)
generalPath!!.curveTo(40.685127f, 39.37734f, 37.540596f, 40.6824f, 32.41574f, 41.38893f)
generalPath!!.curveTo(27.290888f, 42.095467f, 20.96915f, 42.095467f, 15.8442955f, 41.38893f)
generalPath!!.curveTo(10.719441f, 40.6824f, 7.574909f, 39.37734f, 7.6013966f, 37.967922f)
generalPath!!.curveTo(7.574909f, 36.558506f, 10.719441f, 35.253445f, 15.8442955f, 34.546913f)
generalPath!!.curveTo(20.96915f, 33.840378f, 27.290888f, 33.840378f, 32.41574f, 34.546913f)
generalPath!!.curveTo(37.540596f, 35.253445f, 40.685127f, 36.558506f, 40.65864f, 37.967922f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.13001823425293, 37.96792221069336), 16.528622f, Point2D.Double(24.13001823425293, 37.96792221069336), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.23796799778938293f, -8.82106781655088E-16f, 28.93277931213379f))
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
generalPath!!.moveTo(18.62757f, 3.1435547f)
generalPath!!.curveTo(10.488439f, 3.1435547f, 3.8827682f, 9.749226f, 3.8827682f, 17.888355f)
generalPath!!.curveTo(3.8827682f, 26.027487f, 10.488439f, 32.63316f, 18.62757f, 32.63316f)
generalPath!!.curveTo(22.107124f, 32.63316f, 25.17857f, 31.248766f, 27.701292f, 29.23051f)
generalPath!!.curveTo(27.495914f, 30.237392f, 27.623257f, 31.265879f, 28.457436f, 31.990437f)
generalPath!!.lineTo(39.42152f, 41.517845f)
generalPath!!.curveTo(40.654938f, 42.589176f, 42.508984f, 42.448807f, 43.58031f, 41.21539f)
generalPath!!.curveTo(44.651638f, 39.98197f, 44.51127f, 38.127926f, 43.27785f, 37.0566f)
generalPath!!.lineTo(32.31377f, 27.529188f)
generalPath!!.curveTo(31.642242f, 26.94591f, 30.82089f, 26.773218f, 30.00753f, 26.886465f)
generalPath!!.curveTo(31.99423f, 24.374044f, 33.37237f, 21.337664f, 33.37237f, 17.888355f)
generalPath!!.curveTo(33.37237f, 9.749226f, 26.766699f, 3.1435547f, 18.62757f, 3.1435547f)
generalPath!!.closePath()
generalPath!!.moveTo(18.551954f, 4.369738f)
generalPath!!.curveTo(26.191414f, 4.369738f, 31.843729f, 9.158689f, 31.843729f, 17.661512f)
generalPath!!.curveTo(31.843729f, 26.336626f, 26.027039f, 30.953287f, 18.551954f, 30.953287f)
generalPath!!.curveTo(11.249005f, 30.953287f, 5.2601805f, 25.475197f, 5.2601805f, 17.661512f)
generalPath!!.curveTo(5.2601805f, 9.677406f, 11.084819f, 4.369738f, 18.551954f, 4.369738f)
generalPath!!.closePath()
shape = generalPath
paint = Color(220, 220, 220, 255)
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(27.36634063720703, 26.58029556274414), Point2D.Double(31.33596420288086, 30.557771682739258), floatArrayOf(0.0f,1.0f), arrayOf(Color(138, 138, 138, 255),Color(72, 72, 72, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(3.0058157f,1,0,10.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.62757f, 3.1435547f)
generalPath!!.curveTo(10.488439f, 3.1435547f, 3.8827682f, 9.749226f, 3.8827682f, 17.888355f)
generalPath!!.curveTo(3.8827682f, 26.027487f, 10.488439f, 32.63316f, 18.62757f, 32.63316f)
generalPath!!.curveTo(22.107124f, 32.63316f, 25.17857f, 31.248766f, 27.701292f, 29.23051f)
generalPath!!.curveTo(27.495914f, 30.237392f, 27.623257f, 31.265879f, 28.457436f, 31.990437f)
generalPath!!.lineTo(39.42152f, 41.517845f)
generalPath!!.curveTo(40.654938f, 42.589176f, 42.508984f, 42.448807f, 43.58031f, 41.21539f)
generalPath!!.curveTo(44.651638f, 39.98197f, 44.51127f, 38.127926f, 43.27785f, 37.0566f)
generalPath!!.lineTo(32.31377f, 27.529188f)
generalPath!!.curveTo(31.642242f, 26.94591f, 30.82089f, 26.773218f, 30.00753f, 26.886465f)
generalPath!!.curveTo(31.99423f, 24.374044f, 33.37237f, 21.337664f, 33.37237f, 17.888355f)
generalPath!!.curveTo(33.37237f, 9.749226f, 26.766699f, 3.1435547f, 18.62757f, 3.1435547f)
generalPath!!.closePath()
generalPath!!.moveTo(18.551954f, 4.369738f)
generalPath!!.curveTo(26.191414f, 4.369738f, 31.843729f, 9.158689f, 31.843729f, 17.661512f)
generalPath!!.curveTo(31.843729f, 26.336626f, 26.027039f, 30.953287f, 18.551954f, 30.953287f)
generalPath!!.curveTo(11.249005f, 30.953287f, 5.2601805f, 25.475197f, 5.2601805f, 17.661512f)
generalPath!!.curveTo(5.2601805f, 9.677406f, 11.084819f, 4.369738f, 18.551954f, 4.369738f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.602905f, 3.0803552f)
generalPath!!.curveTo(10.437465f, 3.0803552f, 3.8104408f, 9.707379f, 3.8104408f, 17.87282f)
generalPath!!.curveTo(3.8104408f, 26.03826f, 10.437465f, 32.665283f, 18.602905f, 32.665283f)
generalPath!!.curveTo(22.093708f, 32.665283f, 25.175081f, 31.276417f, 27.70596f, 29.251638f)
generalPath!!.curveTo(27.49992f, 30.261774f, 27.627672f, 31.293585f, 28.464546f, 32.020485f)
generalPath!!.lineTo(39.464073f, 41.57869f)
generalPath!!.curveTo(40.701477f, 42.653484f, 42.561516f, 42.51266f, 43.636307f, 41.275257f)
generalPath!!.curveTo(44.711098f, 40.037853f, 44.570274f, 38.177814f, 43.33287f, 37.103024f)
generalPath!!.lineTo(32.333347f, 27.544815f)
generalPath!!.curveTo(31.659649f, 26.959652f, 30.835642f, 26.786402f, 30.019653f, 26.900017f)
generalPath!!.curveTo(32.012775f, 24.379473f, 33.39537f, 21.333277f, 33.39537f, 17.87282f)
generalPath!!.curveTo(33.39537f, 9.707379f, 26.768345f, 3.0803552f, 18.602905f, 3.0803552f)
generalPath!!.closePath()
generalPath!!.moveTo(18.527046f, 6.266424f)
generalPath!!.curveTo(24.808153f, 6.2664247f, 29.905865f, 11.364135f, 29.905865f, 17.645243f)
generalPath!!.curveTo(29.905865f, 23.926352f, 24.808153f, 29.024061f, 18.527046f, 29.024061f)
generalPath!!.curveTo(12.245938f, 29.024061f, 7.1482277f, 23.926352f, 7.1482277f, 17.645243f)
generalPath!!.curveTo(7.1482277f, 11.364135f, 12.245938f, 6.266424f, 18.527046f, 6.266424f)
generalPath!!.closePath()
shape = generalPath
paint = Color(220, 220, 220, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.507004f, 41.57769f)
generalPath!!.curveTo(39.02833f, 39.304504f, 40.904335f, 36.76627f, 43.091057f, 36.789314f)
generalPath!!.curveTo(43.091057f, 36.789314f, 32.33069f, 27.531204f, 32.33069f, 27.531204f)
generalPath!!.curveTo(29.385899f, 27.474499f, 28.061188f, 29.80382f, 28.553877f, 32.131126f)
generalPath!!.lineTo(39.507004f, 41.57769f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(30.65625, 34.0), Point2D.Double(33.21875, 31.0625), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(125, 125, 125, 255),Color(177, 177, 177, 255),Color(104, 104, 104, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3345930576324463f, 0.0f, 0.0f, 1.2912919521331787f, -6.973842144012451f, -7.460658073425293f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.2457430362701416f, 0.0f, 0.0f, 1.2457430362701416f, -3.4253458976745605f, -6.177032947540283f))
// _0_2_1_4
paint = LinearGradientPaint(Point2D.Double(18.292673110961914, 13.602121353149414), Point2D.Double(17.500892639160156, 25.74346923828125), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 56),Color(255, 255, 255, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.206434f,1,0,10.0f,null,0.0f)
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
g.composite = AlphaComposite.getInstance(3, 0.4331551f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.7529860138893127f, 0.658037006855011f, -0.6489019989967346f, 0.7608720064163208f, 0.0f, 0.0f))
// _0_2_1_5
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.5029539f,1,0,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(40.37333679199219, 0.14086054265499115, 19.048439025878906, 4.440478324890137, 6.422405242919922, 4.440478324890137)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.3986140489578247f, 0.0f, 0.0f, 1.3986140489578247f, -6.224338054656982f, -8.298957824707031f))
// _0_2_1_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.897785f, 18.478292f)
generalPath!!.curveTo(25.9111f, 21.455486f, 24.330425f, 24.212242f, 21.754295f, 25.704697f)
generalPath!!.curveTo(19.178165f, 27.197151f, 16.000395f, 27.197151f, 13.424265f, 25.704697f)
generalPath!!.curveTo(10.848135f, 24.212242f, 9.267462f, 21.455486f, 9.280776f, 18.478292f)
generalPath!!.curveTo(9.267462f, 15.501098f, 10.848135f, 12.744343f, 13.424265f, 11.251888f)
generalPath!!.curveTo(16.000395f, 9.759435f, 19.178165f, 9.759435f, 21.754295f, 11.251888f)
generalPath!!.curveTo(24.330425f, 12.744343f, 25.9111f, 15.501098f, 25.897785f, 18.478292f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(18.240928649902344, 21.8179874420166), 8.308505f, Point2D.Double(18.240928649902344, 21.8179874420166), floatArrayOf(0.0f,1.0f), arrayOf(Color(114, 159, 207, 53),Color(114, 159, 207, 172)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = Color(48, 99, 163, 255)
stroke = BasicStroke(1.0745695f,1,0,10.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.897785f, 18.478292f)
generalPath!!.curveTo(25.9111f, 21.455486f, 24.330425f, 24.212242f, 21.754295f, 25.704697f)
generalPath!!.curveTo(19.178165f, 27.197151f, 16.000395f, 27.197151f, 13.424265f, 25.704697f)
generalPath!!.curveTo(10.848135f, 24.212242f, 9.267462f, 21.455486f, 9.280776f, 18.478292f)
generalPath!!.curveTo(9.267462f, 15.501098f, 10.848135f, 12.744343f, 13.424265f, 11.251888f)
generalPath!!.curveTo(16.000395f, 9.759435f, 19.178165f, 9.759435f, 21.754295f, 11.251888f)
generalPath!!.curveTo(24.330425f, 12.744343f, 25.9111f, 15.501098f, 25.897785f, 18.478292f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.8342246f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_1_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.156916f, 7.3966937f)
generalPath!!.curveTo(12.949325f, 7.3966937f, 8.732368f, 11.613651f, 8.732368f, 16.821241f)
generalPath!!.curveTo(8.732368f, 18.325216f, 9.152676f, 19.709015f, 9.77954f, 20.971144f)
generalPath!!.curveTo(11.03192f, 21.432756f, 12.362297f, 21.746826f, 13.774307f, 21.746826f)
generalPath!!.curveTo(19.945263f, 21.746826f, 24.873589f, 16.88519f, 25.254414f, 10.809698f)
generalPath!!.curveTo(23.523449f, 8.764167f, 21.044374f, 7.3966937f, 18.156916f, 7.3966937f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(15.4143705368042, 13.078408241271973), 6.65625f, Point2D.Double(15.4143705368042, 13.078408241271973), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 63)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.5929629802703857f, -7.746899656918026E-24f, -5.714442921965876E-24f, 2.2521040439605713f, -25.059749603271484f, -18.94099998474121f))
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
            return 41.73695755004883
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.853553771972656
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Edit_find(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Edit_find(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Edit_find(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

