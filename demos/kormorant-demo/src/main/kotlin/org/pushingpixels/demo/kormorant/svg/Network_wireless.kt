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
class Network_wireless(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
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
g.composite = AlphaComposite.getInstance(3, 0.4064171f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(2.4600489139556885f, 0.0f, 0.0f, 2.4600489139556885f, -49.40945816040039f, -67.96373748779297f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(30.203561782836914, 44.56548309326172), 6.5659914f, Point2D.Double(30.203561782836914, 44.56548309326172), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.3384619951248169f, -1.4354759471951642E-15f, 29.481779098510742f))
shape = GeneralPath()
shape.moveTo(36.769554, 44.565483)
shape.curveTo(36.780075, 45.361816, 35.53091, 46.099186, 33.495064, 46.498383)
shape.curveTo(31.459217, 46.89758, 28.947906, 46.89758, 26.91206, 46.498383)
shape.curveTo(24.876213, 46.099186, 23.627047, 45.361816, 23.63757, 44.565483)
shape.curveTo(23.627047, 43.76915, 24.876213, 43.03178, 26.91206, 42.632584)
shape.curveTo(28.947906, 42.233387, 31.459217, 42.233387, 33.495064, 42.632584)
shape.curveTo(35.53091, 43.03178, 36.780075, 43.76915, 36.769554, 44.565483)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = RadialGradientPaint(Point2D.Double(24.445690155029297, 35.878170013427734), 20.530962f, Point2D.Double(24.445690155029297, 35.878170013427734), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(220, 220, 220, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.9950579404830933f, -1.6515269512350966E-32f, 0.0f, 1.9950579404830933f, -24.324880599975586f, -35.700870513916016f))
shape = RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355)
g.paint = paint
g.fill(shape)
paint = Color(155, 155, 155, 255)
stroke = BasicStroke(1.0f,0,2,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,0,0,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(20.224903, 38.95567)
shape.lineTo(24.819939, 24.359674)
shape.lineTo(30.135763, 38.95567)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(0.6892200112342834f, 0.0f, 0.0f, 0.6892200112342834f, 5.768155097961426f, 11.069000244140625f))
// _0_0_3
paint = Color(239, 41, 41, 255)
shape = GeneralPath()
shape.moveTo(30.910667, 18.60456)
shape.curveTo(30.91601, 19.799059, 30.281818, 20.905113, 29.248234, 21.503908)
shape.curveTo(28.21465, 22.102705, 26.939678, 22.102705, 25.906094, 21.503908)
shape.curveTo(24.872509, 20.905113, 24.238317, 19.799059, 24.24366, 18.60456)
shape.curveTo(24.238317, 17.410063, 24.872509, 16.304008, 25.906094, 15.705213)
shape.curveTo(26.939678, 15.106417, 28.21465, 15.106417, 29.248234, 15.705213)
shape.curveTo(30.281818, 16.304008, 30.91601, 17.410063, 30.910667, 18.60456)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(2.38230299949646f, 0.0f, 0.0f, 2.38230299949646f, -40.92229080200195f, -20.430070877075195f))
// _0_0_4
paint = RadialGradientPaint(Point2D.Double(27.577173233032227, 16.04913330078125), 3.8335035f, Point2D.Double(27.577173233032227, 16.04913330078125), floatArrayOf(0.0f,1.0f), arrayOf(Color(239, 41, 41, 255),Color(239, 41, 41, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.243453025817871f, 2.1067840215472386E-16f, -2.1067840215472386E-16f, 1.243453025817871f, -6.713754177093506f, -3.742846965789795f))
stroke = BasicStroke(1.1812764f,0,0,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(30.910667, 18.60456)
shape.curveTo(30.91601, 19.799059, 30.281818, 20.905113, 29.248234, 21.503908)
shape.curveTo(28.21465, 22.102705, 26.939678, 22.102705, 25.906094, 21.503908)
shape.curveTo(24.872509, 20.905113, 24.238317, 19.799059, 24.24366, 18.60456)
shape.curveTo(24.238317, 17.410063, 24.872509, 16.304008, 25.906094, 15.705213)
shape.curveTo(26.939678, 15.106417, 28.21465, 15.106417, 29.248234, 15.705213)
shape.curveTo(30.281818, 16.304008, 30.91601, 17.410063, 30.910667, 18.60456)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(4.6576080322265625f, 0.0f, 0.0f, 4.6576080322265625f, -103.66899871826172f, -62.761131286621094f))
// _0_0_5
paint = RadialGradientPaint(Point2D.Double(27.577173233032227, 15.048257827758789), 3.8335035f, Point2D.Double(27.577173233032227, 15.048257827758789), floatArrayOf(0.0f,1.0f), arrayOf(Color(239, 41, 41, 255),Color(239, 41, 41, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.243453025817871f, 2.1067840215472386E-16f, -2.1067840215472386E-16f, 1.243453025817871f, -6.713754177093506f, -3.742846965789795f))
stroke = BasicStroke(0.60420674f,0,0,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(30.910667, 18.60456)
shape.curveTo(30.91601, 19.799059, 30.281818, 20.905113, 29.248234, 21.503908)
shape.curveTo(28.21465, 22.102705, 26.939678, 22.102705, 25.906094, 21.503908)
shape.curveTo(24.872509, 20.905113, 24.238317, 19.799059, 24.24366, 18.60456)
shape.curveTo(24.238317, 17.410063, 24.872509, 16.304008, 25.906094, 15.705213)
shape.curveTo(26.939678, 15.106417, 28.21465, 15.106417, 29.248234, 15.705213)
shape.curveTo(30.281818, 16.304008, 30.91601, 17.410063, 30.910667, 18.60456)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 0.1764706f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.5677410364151f, 0.0f, 0.0f, 1.5677410364151f, -22.256559371948242f, -31.995590209960938f))
// _0_0_6
paint = RadialGradientPaint(Point2D.Double(30.203561782836914, 44.56548309326172), 6.5659914f, Point2D.Double(30.203561782836914, 44.56548309326172), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.3384619951248169f, 2.2203589742633353E-14f, 29.481779098510742f))
shape = GeneralPath()
shape.moveTo(36.769554, 44.565483)
shape.curveTo(36.780075, 45.361816, 35.53091, 46.099186, 33.495064, 46.498383)
shape.curveTo(31.459217, 46.89758, 28.947906, 46.89758, 26.91206, 46.498383)
shape.curveTo(24.876213, 46.099186, 23.627047, 45.361816, 23.63757, 44.565483)
shape.curveTo(23.627047, 43.76915, 24.876213, 43.03178, 26.91206, 42.632584)
shape.curveTo(28.947906, 42.233387, 31.459217, 42.233387, 33.495064, 42.632584)
shape.curveTo(35.53091, 43.03178, 36.780075, 43.76915, 36.769554, 44.565483)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,0,2,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(23.812107, 28.571856)
shape.lineTo(26.719572, 29.426992)
shape.lineTo(22.44389, 32.334457)
shape.lineTo(28.258818, 33.873703)
shape.lineTo(21.07567, 36.781166)
shape.lineTo(29.627037, 37.636303)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(0.99999976f,0,2,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(5.597388744354248, 4.70600700378418, 37.69658660888672, 37.69658660888672, 8.485278129577637, 8.485278129577637)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_8
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
            return 3.9147281646728516
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 3.0233452320098877
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 41.061927795410156
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.38325500488281
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Network_wireless(width, height))
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Network_wireless(width, height))
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

