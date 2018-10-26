package org.pushingpixels.demo.kormorant.svg

import java.awt.*
import java.awt.geom.*
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.IsHiDpiAware
import org.pushingpixels.neon.icon.NeonIcon
import org.pushingpixels.neon.icon.NeonIconUIResource
import org.pushingpixels.neon.icon.ResizableIcon

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Internet_mail(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
	private fun innerPaint(g : Graphics2D) {
        @Suppress("UNUSED_VARIABLE") var shape: Shape?
        @Suppress("UNUSED_VARIABLE") var paint: Paint?
        @Suppress("UNUSED_VARIABLE") var stroke: Stroke?
         
        var origAlpha = 1.0f
        val origComposite = g.composite
        if (origComposite is AlphaComposite) {
            if (origComposite.rule == AlphaComposite.SRC_OVER) {
                origAlpha = origComposite.alpha
            }
        }
        
	    val defaultTransform_ = g.transform
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 0.4557f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.8006000518798828f, 0.0f, 0.0f, 1.9747999906539917f, 1.083899974822998f, -38.01300048828125f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(6.702700138092041, 73.61599731445312), 7.2284f, Point2D.Double(6.702700138092041, 73.61599731445312), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.9021999835968018f, 0.0f, 0.0f, 0.5256999731063843f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(26.5, 38.7)
shape.curveTo(26.522034, 40.061657, 23.90613, 41.322495, 19.642813, 42.00509)
shape.curveTo(15.379496, 42.68768, 10.120504, 42.68768, 5.8571877, 42.00509)
shape.curveTo(1.5938711, 41.322495, -1.0220345, 40.061657, -1.0, 38.7)
shape.curveTo(-1.0220345, 37.338345, 1.5938711, 36.077507, 5.8571877, 35.394913)
shape.curveTo(10.120504, 34.712322, 15.379496, 34.712322, 19.642813, 35.394913)
shape.curveTo(23.90613, 36.077507, 26.522034, 37.338345, 26.5, 38.7)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = LinearGradientPaint(Point2D.Double(11.572999954223633, 4.746200084686279), Point2D.Double(18.475000381469727, 26.023000717163086), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(226, 226, 226, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.343500018119812f, 0.0f, 0.0f, 1.4178999662399292f, 2.879499912261963f, 0.31459999084472656f))
shape = GeneralPath()
shape.moveTo(6.3334, 16.972)
shape.lineTo(6.3334, 41.482002)
shape.lineTo(43.3064, 41.482002)
shape.lineTo(43.2444, 17.090002)
shape.curveTo(43.2414, 15.712002, 31.3964, 2.4120016, 29.2114, 2.4120016)
shape.lineTo(20.659399, 2.4121015)
shape.curveTo(18.3624, 2.4121015, 6.333399, 15.674102, 6.333399, 16.972101)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(2.0618999004364014, 15.256999969482422), Point2D.Double(30.600000381469727, 15.256999969482422), floatArrayOf(0.0f,1.0f), arrayOf(Color(152, 150, 144, 255),Color(101, 100, 96, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.343500018119812f, 0.0f, 0.0f, 1.4178999662399292f, 2.879499912261963f, 0.31459999084472656f))
stroke = BasicStroke(0.8566f,0,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(6.3334, 16.972)
shape.lineTo(6.3334, 41.482002)
shape.lineTo(43.3064, 41.482002)
shape.lineTo(43.2444, 17.090002)
shape.curveTo(43.2414, 15.712002, 31.3964, 2.4120016, 29.2114, 2.4120016)
shape.lineTo(20.659399, 2.4121015)
shape.curveTo(18.3624, 2.4121015, 6.333399, 15.674102, 6.333399, 16.972101)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = LinearGradientPaint(Point2D.Double(5.826600074768066, 7.231100082397461), Point2D.Double(13.467000007629395, 17.87700080871582), floatArrayOf(0.0f,1.0f), arrayOf(Color(237, 237, 237, 255),Color(200, 200, 200, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.5706000328063965f, 0.0f, 0.0f, 1.190999984741211f, 2.879499912261963f, 0.34299999475479126f))
shape = GeneralPath()
shape.moveTo(6.9231, 16.787)
shape.curveTo(6.525, 16.357, 18.8101, 3.0930004, 20.6671, 3.0930004)
shape.lineTo(29.043102, 3.0935004)
shape.curveTo(30.790102, 3.0935004, 43.0801, 16.2215, 42.4701, 16.9795)
shape.lineTo(31.6091, 30.474499)
shape.lineTo(19.295101, 30.156498)
shape.lineTo(6.9231014, 16.786499)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = Color(0, 0, 0, 37)
shape = GeneralPath()
shape.moveTo(19.078, 30.018)
shape.lineTo(11.744999, 21.272)
shape.lineTo(36.563, 14.3359995)
shape.lineTo(39.592, 20.552)
shape.lineTo(32.176, 29.992)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = Color(0, 0, 0, 37)
shape = GeneralPath()
shape.moveTo(18.292, 29.836)
shape.lineTo(10.809, 21.026001)
shape.lineTo(35.457, 14.133001)
shape.lineTo(38.631, 20.404001)
shape.lineTo(31.39, 29.811)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = Color(0, 0, 0, 37)
shape = GeneralPath()
shape.moveTo(18.775, 29.957)
shape.lineTo(11.099999, 21.297)
shape.lineTo(36.068, 14.232)
shape.lineTo(39.354, 20.825)
shape.lineTo(31.874, 29.932001)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = LinearGradientPaint(Point2D.Double(10.184000015258789, 15.14799976348877), Point2D.Double(15.310999870300293, 29.569000244140625), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(220, 220, 220, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.8193000555038452f, 0.0f, 0.0f, 1.0282000303268433f, 2.879499912261963f, 0.34299999475479126f))
shape = GeneralPath()
shape.moveTo(18.594, 30.441)
shape.lineTo(11.261, 21.695)
shape.lineTo(35.973, 14.801)
shape.lineTo(39.083, 21.189)
shape.lineTo(31.963001, 30.175)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = LinearGradientPaint(Point2D.Double(8.915599822998047, 37.196998596191406), Point2D.Double(9.885499954223633, 52.090999603271484), floatArrayOf(0.0f,1.0f), arrayOf(Color(154, 162, 154, 255),Color(181, 190, 181, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.4547998905181885f, 0.0f, 0.0f, 0.7620000243186951f, 2.879499912261963f, 0.34299999475479126f))
shape = GeneralPath()
shape.moveTo(20.488, 29.064)
shape.lineTo(7.092001, 40.036)
shape.lineTo(21.001001, 30.432)
shape.lineTo(30.019001, 30.432)
shape.lineTo(42.439003, 39.914)
shape.lineTo(30.575003, 29.064001)
shape.lineTo(20.488003, 29.064001)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = LinearGradientPaint(Point2D.Double(8.915599822998047, 37.196998596191406), Point2D.Double(9.885499954223633, 52.090999603271484), floatArrayOf(0.0f,1.0f), arrayOf(Color(154, 162, 154, 255),Color(181, 190, 181, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.4547998905181885f, 0.0f, 0.0f, 0.7620000243186951f, 2.879499912261963f, 0.34299999475479126f))
shape = GeneralPath()
shape.moveTo(6.9635, 16.885)
shape.lineTo(18.4795, 31.201)
shape.lineTo(19.5475, 30.347)
shape.lineTo(6.963501, 16.885)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
paint = LinearGradientPaint(Point2D.Double(11.232999801635742, 13.685999870300293), Point2D.Double(21.11199951171875, 24.132999420166016), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(237, 237, 237, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.37090003490448f, 0.0f, 0.0f, 1.4437999725341797f, 2.4310998916625977f, -0.14079000055789948f))
stroke = BasicStroke(0.8566f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(7.3077, 17.131)
shape.lineTo(7.3389, 40.342003)
shape.lineTo(42.2839, 40.342003)
shape.lineTo(42.2209, 17.258003)
shape.curveTo(42.218903, 16.508003, 31.004902, 3.4590034, 28.836903, 3.4590034)
shape.lineTo(20.941902, 3.4592035)
shape.curveTo(18.688902, 3.4592035, 7.306902, 16.351204, 7.3079023, 17.131203)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(20.957, 30.453)
shape.lineTo(9.016001, 38.724)
shape.lineTo(11.235001, 38.73)
shape.lineTo(21.233002, 31.861)
shape.lineTo(30.055, 30.438)
shape.lineTo(20.957, 30.453)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(11.428, 21.67)
shape.lineTo(12.752001, 23.081)
shape.lineTo(35.543, 16.196999)
shape.lineTo(38.458, 21.878998)
shape.lineTo(39.072, 21.166998)
shape.lineTo(36.003, 14.788998)
shape.lineTo(11.427998, 21.669998)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
paint = LinearGradientPaint(Point2D.Double(8.780400276184082, 37.78499984741211), Point2D.Double(9.761899948120117, 32.202999114990234), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 33),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.39490008354187f, 0.0f, 0.0f, 0.781059980392456f, 2.879499912261963f, 0.34299999475479126f))
shape = GeneralPath()
shape.moveTo(13.308, 23.636)
shape.lineTo(19.334, 30.09)
shape.lineTo(20.531, 29.064)
shape.lineTo(30.618, 29.106998)
shape.lineTo(31.43, 29.833998)
shape.lineTo(35.405, 25.089998)
shape.curveTo(34.251, 23.678999, 13.307999, 23.635998, 13.307999, 23.635998)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_12
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
paint = Color(177, 177, 177, 255)
shape = GeneralPath()
shape.moveTo(41.813, 17.848)
shape.lineTo(31.861, 30.479)
shape.lineTo(30.793, 29.624)
shape.lineTo(41.813, 17.848)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_13
g.transform = defaultTransform__0_0
g.transform = defaultTransform__0
g.transform = defaultTransform_

	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 0.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 1.9837015867233276
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 48.0
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.30292510986328
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Internet_mail(width, height))
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Internet_mail(width, height))
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

    override fun isHiDpiAware(): Boolean {
        return true
    }

    override fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)
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

