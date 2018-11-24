package org.pushingpixels.demo.kormorant.svg

import java.awt.*
import java.awt.geom.*
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.IsHiDpiAware
import org.pushingpixels.neon.icon.NeonIcon
import org.pushingpixels.neon.icon.NeonIconUIResource
import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.neon.icon.ResizableIconFactory

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Edit_select_all(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
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
g.composite = AlphaComposite.getInstance(3, 0.47368422f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.4723349809646606f, 0.0f, 0.0f, 0.2663849890232086f, -9.159070014953613f, 37.48202896118164f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(22.571428298950195, 30.85714340209961), 15.571428f, Point2D.Double(22.571428298950195, 30.85714340209961), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.6513760089874268f, 4.6386480336631404E-15f, 10.757539749145508f))
shape = GeneralPath()
shape.moveTo(38.142857, 30.857143)
shape.curveTo(38.16781, 34.491642, 35.205383, 37.857037, 30.377314, 39.678993)
shape.curveTo(25.549248, 41.500954, 19.593609, 41.500954, 14.765542, 39.678993)
shape.curveTo(9.937474, 37.857037, 6.9750466, 34.491642, 7.0, 30.857143)
shape.curveTo(6.9750466, 27.222643, 9.937474, 23.85725, 14.765542, 22.035294)
shape.curveTo(19.593609, 20.213335, 25.549248, 20.213335, 30.377314, 22.035294)
shape.curveTo(35.205383, 23.85725, 38.16781, 27.222643, 38.142857, 30.857143)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = LinearGradientPaint(Point2D.Double(20.794008255004883, 18.378812789916992), Point2D.Double(35.59600067138672, 39.600460052490234), floatArrayOf(0.0f,0.59928656f,1.0f), arrayOf(Color(248, 248, 247, 255),Color(232, 232, 232, 255),Color(226, 226, 222, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3427040576934814f, 0.0f, 0.0f, 1.2353780269622803f, -8.219611167907715f, -6.577188968658447f))
shape = RoundRectangle2D.Double(4.501601696014404, 1.4968987703323364, 38.99679183959961, 45.00310134887695, 1.133015751838684, 1.1330164670944214)
g.paint = paint
g.fill(shape)
paint = Color(136, 138, 133, 255)
stroke = BasicStroke(0.99999976f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(4.501601696014404, 1.4968987703323364, 38.99679183959961, 45.00310134887695, 1.133015751838684, 1.1330164670944214)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = Color(153, 153, 153, 255)
shape = Rectangle2D.Double(22.0, 10.0, 14.0, 2.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = Color(153, 153, 153, 255)
shape = Rectangle2D.Double(22.0, 16.0, 12.0, 2.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = Color(153, 153, 153, 255)
shape = Rectangle2D.Double(9.0, 22.0, 22.97153091430664, 2.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = Color(153, 153, 153, 255)
shape = Rectangle2D.Double(9.0, 28.0, 27.0, 2.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = Color(153, 153, 153, 255)
shape = Rectangle2D.Double(9.0, 34.0, 17.0, 2.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = Rectangle2D.Double(5.499715328216553, 2.4997177124023438, 37.00001907348633, 43.022315979003906)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = Color(153, 153, 153, 255)
shape = Rectangle2D.Double(9.0, 10.0, 11.0, 10.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 0.49999997f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
paint = Color(114, 159, 207, 255)
shape = Rectangle2D.Double(8.0, 14.0, 29.0, 6.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 0.49999997f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
paint = Color(114, 159, 207, 255)
shape = Rectangle2D.Double(8.0, 8.0, 31.0, 6.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_10
g.composite = AlphaComposite.getInstance(3, 0.5f * origAlpha)
val defaultTransform__0_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
paint = Color(114, 159, 207, 255)
shape = Rectangle2D.Double(8.0, 20.0, 25.0, 6.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_11
g.composite = AlphaComposite.getInstance(3, 0.5f * origAlpha)
val defaultTransform__0_0_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
paint = Color(114, 159, 207, 255)
shape = Rectangle2D.Double(8.0, 26.0, 29.0, 6.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_12
g.composite = AlphaComposite.getInstance(3, 0.5f * origAlpha)
val defaultTransform__0_0_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
paint = Color(114, 159, 207, 255)
shape = Rectangle2D.Double(8.0, 32.0, 19.0, 6.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_13
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_14 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_14
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(28.0, 32.0, 1.0, 7.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_14
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_15 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(27.0, 31.0, 1.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_15
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_16 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(29.0, 31.0, 1.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_16
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_17 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_17
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(29.0, 39.0, 1.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_17
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_18 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_18
paint = Color(0, 0, 0, 255)
shape = Rectangle2D.Double(27.0, 39.0, 1.0, 1.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_18
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
            return 1.1105351448059082
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.996898889541626
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 45.92619705200195
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 47.00310134887695
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Edit_select_all(width, height))
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Edit_select_all(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): ResizableIconFactory {
            return ResizableIconFactory { NeonIcon(Edit_select_all(16, 16)) }
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

