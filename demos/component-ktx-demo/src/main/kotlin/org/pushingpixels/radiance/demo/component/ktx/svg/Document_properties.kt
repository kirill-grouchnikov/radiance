package org.pushingpixels.radiance.demo.component.ktx.svg

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
class Document_properties private constructor(private var width: Int, private var height: Int)
       : RadianceIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var colorFilter: RadianceIcon.ColorFilter? = null
    private val transformsStack = Stack<AffineTransform>()

    

	private fun _paint0(g : Graphics2D,origAlpha : Float) {
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
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
paint = RadialGradientPaint(Point2D.Double(24.306795120239258, 42.077980041503906), 15.821514f, Point2D.Double(24.306795120239258, 42.077980041503906), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.2849160134792328f, 0.0f, 30.089279174804688f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_1_1
paint = RadialGradientPaint(Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, Point2D.Double(8.143556594848633, 7.26789665222168), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(248, 248, 248, 255)) ?: Color(248, 248, 248, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(7.666053771972656, 4.583946228027344, 32.77588653564453, 38.94638442993164, 0.2980971336364746, 0.2980971336364746)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.6464470028877258f, -0.03798932954668999f))
// _0_1_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.967081069946289f, 4.244972229003906f))
// _0_1_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.9090909957885742f, 0.0f, 0.0f, 1.0f, 2.3636279106140137f, 0.0f))
// _0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_0
shape = RoundRectangle2D.Double(15.000001907348633, 9.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_1
shape = RoundRectangle2D.Double(15.000001907348633, 11.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_2
shape = RoundRectangle2D.Double(15.000001907348633, 13.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_3
shape = RoundRectangle2D.Double(15.000001907348633, 15.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_4
shape = RoundRectangle2D.Double(15.000001907348633, 17.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_5
shape = RoundRectangle2D.Double(15.000001907348633, 19.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_6
shape = RoundRectangle2D.Double(15.000001907348633, 21.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_7
shape = RoundRectangle2D.Double(15.000001907348633, 23.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_8
shape = RoundRectangle2D.Double(14.999992370605469, 25.0, 9.900005340576172, 1.0, 0.1364084780216217, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_9
shape = RoundRectangle2D.Double(14.999992370605469, 29.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_10
shape = RoundRectangle2D.Double(14.999992370605469, 31.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_11
shape = RoundRectangle2D.Double(14.999992370605469, 33.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_12
shape = RoundRectangle2D.Double(14.999992370605469, 35.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0_13
shape = RoundRectangle2D.Double(14.999992370605469, 37.0, 15.40001392364502, 1.0, 0.21219104528427124, 0.13078175485134125)
paint = colorFilter?.filter(Color(155, 155, 155, 140)) ?: Color(155, 155, 155, 140)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.4090909f * origAlpha)
// _0_2_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.96875f, 14.555141f)
generalPath!!.curveTo(25.65626f, 14.579414f, 25.35254f, 14.618618f, 25.03125f, 14.680141f)
generalPath!!.lineTo(23.75f, 15.836391f)
generalPath!!.lineTo(27.71875f, 19.586391f)
generalPath!!.lineTo(27.9375f, 22.867641f)
generalPath!!.lineTo(24.96875f, 25.555141f)
generalPath!!.lineTo(21.46875f, 25.180141f)
generalPath!!.lineTo(17.84375f, 21.773891f)
generalPath!!.curveTo(17.843748f, 21.773891f, 16.5625f, 23.023891f, 16.5625f, 23.023891f)
generalPath!!.curveTo(15.971737f, 28.665209f, 21.875f, 33.71139f, 27.9375f, 30.336391f)
generalPath!!.lineTo(39.78125f, 42.46139f)
generalPath!!.lineTo(39.78125f, 32.08639f)
generalPath!!.lineTo(33.21875f, 25.055141f)
generalPath!!.curveTo(35.345703f, 19.146938f, 31.370365f, 14.13556f, 25.96875f, 14.555141f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(26.030092239379883, 24.226810455322266), 11.629837f, Point2D.Double(26.030092239379883, 24.226810455322266), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.110987901687622f, 2.1107379269321275E-23f, -2.5345160562552086E-23f, 2.5349299907684326f, -28.919130325317383f, -38.04383087158203f))
g.paint = paint
g.fill(shape)

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
        fun of(width: Int, height: Int): RadianceIcon {
            return Document_properties(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Document_properties(width, height))
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

