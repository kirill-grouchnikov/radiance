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
class System_log_out(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(93.78003692626953, 40.54505157470703), 16.321514f, Point2D.Double(93.78003692626953, 40.54505157470703), floatArrayOf(0.0f,1.0f), arrayOf(Color(80, 80, 80, 255),Color(24, 24, 24, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.0069069862365723f, 4.456228159406257E-16f, -5.855910929470178E-16f, 2.63726806640625f, -143.57159423828125f, -61.96371078491211f))
shape = RoundRectangle2D.Double(13.611804962158203, 2.568389415740967, 31.819805145263672, 41.89607620239258, 1.4142094850540161, 1.4142094850540161)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,0,0,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(13.611804962158203, 2.568389415740967, 31.819805145263672, 41.89607620239258, 1.4142094850540161, 1.4142094850540161)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = LinearGradientPaint(Point2D.Double(30.93592071533203, 43.75735855102539), Point2D.Double(30.93592071533203, 28.112619400024414), floatArrayOf(0.0f,1.0f), arrayOf(Color(114, 126, 10, 255),Color(114, 126, 10, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.6355140209197998f, 0.0f, 15.94894027709961f))
shape = Rectangle2D.Double(14.495688438415527, 31.736541748046875, 30.22881507873535, 12.020814895629883)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = LinearGradientPaint(Point2D.Double(46.8458251953125, 19.80411720275879), Point2D.Double(18.031221389770508, 27.759069442749023), floatArrayOf(0.0f,1.0f), arrayOf(Color(78, 78, 78, 255),Color(171, 171, 171, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(14.318912, 43.75736)
shape.lineTo(14.186329, 3.0545251)
shape.lineTo(33.941124, 3.0987194)
shape.lineTo(33.985317, 33.018173)
shape.lineTo(14.318912, 43.75736)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 0.3368984f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0000002f,0,0,10.0f,null,0.0f)
shape = Rectangle2D.Double(14.684172630310059, 3.496565580368042, 29.719282150268555, 39.951332092285156)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 0.2994652f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(0.7784900069236755f, 0.0f, 0.0f, 0.7784900069236755f, -7.579814910888672f, 1.5981390476226807f))
// _0_0_4
paint = RadialGradientPaint(Point2D.Double(24.837125778198242, 36.42112731933594), 15.644737f, Point2D.Double(24.837125778198242, 36.42112731933594), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.5367230176925659f, 1.6735750028442167E-15f, 16.87306022644043f))
shape = GeneralPath()
shape.moveTo(40.48186, 36.421127)
shape.curveTo(40.50693, 39.429993, 37.530556, 42.216076, 32.67976, 43.724407)
shape.curveTo(27.828962, 45.23274, 21.845287, 45.23274, 16.99449, 43.724407)
shape.curveTo(12.143692, 42.216076, 9.167317, 39.429993, 9.192389, 36.421127)
shape.curveTo(9.167317, 33.412262, 12.143692, 30.626177, 16.99449, 29.117847)
shape.curveTo(21.845287, 27.609516, 27.828962, 27.609516, 32.67976, 29.117847)
shape.curveTo(37.530556, 30.626177, 40.50693, 33.412262, 40.48186, 36.421127)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = Color(204, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(1.731798, 17.593819)
shape.lineTo(1.731798, 30.355364)
shape.lineTo(9.6641035, 30.355364)
shape.lineTo(9.6641035, 36.176147)
shape.lineTo(21.887745, 23.952503)
shape.lineTo(9.591343, 11.656101)
shape.lineTo(9.591343, 17.597067)
shape.lineTo(1.731798, 17.593819)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(164, 0, 0, 255)
stroke = BasicStroke(0.9999998f,1,1,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(1.731798, 17.593819)
shape.lineTo(1.731798, 30.355364)
shape.lineTo(9.6641035, 30.355364)
shape.lineTo(9.6641035, 36.176147)
shape.lineTo(21.887745, 23.952503)
shape.lineTo(9.591343, 11.656101)
shape.lineTo(9.591343, 17.597067)
shape.lineTo(1.731798, 17.593819)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 0.5080214f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = RadialGradientPaint(Point2D.Double(19.701141357421875, 2.8969380855560303), 17.171415f, Point2D.Double(19.701141357421875, 2.8969380855560303), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2534420490264893f, -2.296194882234285E-16f, 1.7474599398277556E-16f, 0.9538999795913696f, -15.479080200195312f, 11.276630401611328f))
shape = GeneralPath()
shape.moveTo(9.924008, 12.478043)
shape.lineTo(9.924008, 17.865662)
shape.lineTo(2.074615, 17.865662)
shape.lineTo(2.074615, 24.53144)
shape.curveTo(12.332521, 20.703863, 11.954992, 27.773987, 21.29428, 23.94641)
shape.lineTo(9.924008, 12.478043)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 0.4812834f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = LinearGradientPaint(Point2D.Double(8.760064125061035, 13.663073539733887), Point2D.Double(19.75554847717285, 43.449947357177734), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,0,0,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(2.7193258, 18.399984)
shape.lineTo(2.7193258, 29.53603)
shape.lineTo(10.553144, 29.53603)
shape.lineTo(10.553144, 33.79398)
shape.lineTo(20.404596, 23.948406)
shape.lineTo(10.488577, 13.684714)
shape.lineTo(10.488577, 18.402866)
shape.lineTo(2.7193258, 18.399984)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = RadialGradientPaint(Point2D.Double(27.883882522583008, 7.139606952667236), 9.722718f, Point2D.Double(27.883882522583008, 7.139606952667236), floatArrayOf(0.0f,1.0f), arrayOf(Color(78, 78, 78, 255),Color(97, 97, 97, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.530474901199341f, 5.084555975452191E-18f, -2.3829779498946678E-14f, 1.4032620191574097f, -36.79512023925781f, -9.48330307006836f))
shape = GeneralPath()
shape.moveTo(14.318912, 43.75736)
shape.lineTo(14.274718, 3.0545251)
shape.lineTo(33.941124, 3.0545251)
shape.lineTo(33.764347, 33.681087)
shape.lineTo(14.318912, 43.75736)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
paint = LinearGradientPaint(Point2D.Double(31.852951049804688, 19.107728958129883), Point2D.Double(34.007415771484375, 24.764583587646484), floatArrayOf(0.0f,1.0f), arrayOf(Color(82, 82, 82, 255),Color(82, 82, 82, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.1161199808120728f, 0.0f))
shape = GeneralPath()
shape.moveTo(29.643024, 18.456196)
shape.lineTo(31.565472, 20.908972)
shape.lineTo(30.107063, 25.726135)
shape.curveTo(30.107063, 25.726135, 30.372229, 27.228739, 31.145626, 26.212273)
shape.curveTo(31.919025, 25.195807, 34.11808, 22.630219, 33.730988, 20.754292)
shape.curveTo(33.443726, 19.362175, 32.648228, 18.699263, 32.648228, 18.699263)
shape.lineTo(29.643024, 18.456196)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
paint = LinearGradientPaint(Point2D.Double(31.078954696655273, 21.511184692382812), Point2D.Double(33.71065139770508, 18.06403923034668), floatArrayOf(0.0f,1.0f), arrayOf(Color(206, 206, 206, 255),Color(158, 158, 158, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(31.477083, 17.35134)
shape.curveTo(31.477083, 17.35134, 33.640354, 18.353058, 33.70889, 19.229593)
shape.curveTo(33.81067, 20.531315, 29.466248, 24.665476, 29.466248, 24.665476)
shape.curveTo(28.958015, 25.284195, 28.118326, 24.731768, 28.582365, 24.135145)
shape.curveTo(28.582365, 24.135145, 32.04897, 20.017174, 31.830637, 19.69363)
shape.curveTo(31.557026, 19.288174, 29.863997, 18.655067, 29.863997, 18.655067)
shape.curveTo(28.84753, 17.903769, 30.131617, 16.349606, 31.477083, 17.35134)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_10
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
            return 2.068389415740967
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 45.931610107421875
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 42.89607620239258
        }

        /**
         * Returns an instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return An instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(System_log_out(width, height))
        }

        /**
         * Returns a [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(System_log_out(width, height))
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

