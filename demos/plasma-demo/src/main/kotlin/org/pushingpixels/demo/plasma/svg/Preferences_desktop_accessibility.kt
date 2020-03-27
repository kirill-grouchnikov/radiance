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
class Preferences_desktop_accessibility private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 0.4064171f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(2.4600489139556885f, 0.0f, 0.0f, 2.4600489139556885f, -49.40945816040039f, -67.96373748779297f))
// _0_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(36.769554, 44.565483)
(shape as GeneralPath).curveTo(36.780075, 45.361816, 35.53091, 46.099186, 33.495064, 46.498383)
(shape as GeneralPath).curveTo(31.459217, 46.89758, 28.947906, 46.89758, 26.91206, 46.498383)
(shape as GeneralPath).curveTo(24.876213, 46.099186, 23.627047, 45.361816, 23.63757, 44.565483)
(shape as GeneralPath).curveTo(23.627047, 43.76915, 24.876213, 43.03178, 26.91206, 42.632584)
(shape as GeneralPath).curveTo(28.947906, 42.233387, 31.459217, 42.233387, 33.495064, 42.632584)
(shape as GeneralPath).curveTo(35.53091, 43.03178, 36.780075, 43.76915, 36.769554, 44.565483)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(30.203561782836914, 44.56548309326172), 6.5659914f, Point2D.Double(30.203561782836914, 44.56548309326172), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.3384619951248169f, -1.4354759471951642E-15f, 29.481779098510742f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
shape = RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355)
paint = RadialGradientPaint(Point2D.Double(25.457862854003906, 35.59623336791992), 20.530962f, Point2D.Double(25.457862854003906, 35.59623336791992), floatArrayOf(0.0f,1.0f), arrayOf(Color(156, 188, 222, 255),Color(32, 74, 135, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.1281850337982178f, -1.7271729602086339E-9f, 2.422814131750186E-16f, 2.128253936767578f, -29.019060134887695f, -39.917789459228516f))
g.paint = paint
g.fill(shape)
paint = Color(52, 101, 164, 255)
stroke = BasicStroke(1.0f,0,2,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(2.0000021f,0,2,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(5.8954033851623535, 5.004019737243652, 37.10063552856445, 37.10063552856445, 7.81350040435791, 7.81350040435791)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 1.5521910190582275f, -0.6401000022888184f))
// _0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.7692310214042664f, 0.0f, 0.0f, 0.7692310214042664f, 6.846158027648926f, 4.576913833618164f))
// _0_0_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.444443941116333f, 0.0f, 0.0f, 1.444443941116333f, -7.841267108917236f, -5.8095221519470215f))
// _0_0_3_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(20.857141, 13.071428)
(shape as GeneralPath).curveTo(20.862293, 14.2232065, 20.250782, 15.289703, 19.254162, 15.8670845)
(shape as GeneralPath).curveTo(18.257544, 16.444466, 17.02817, 16.444466, 16.03155, 15.8670845)
(shape as GeneralPath).curveTo(15.03493, 15.289703, 14.42342, 14.2232065, 14.428571, 13.071428)
(shape as GeneralPath).curveTo(14.42342, 11.91965, 15.03493, 10.853153, 16.03155, 10.275772)
(shape as GeneralPath).curveTo(17.02817, 9.698391, 18.257544, 9.698391, 19.254162, 10.275772)
(shape as GeneralPath).curveTo(20.250782, 10.853153, 20.862293, 11.91965, 20.857141, 13.071428)
(shape as GeneralPath).closePath()
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_0_1
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(2.5f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(17.571428, 13.142857)
(shape as GeneralPath).lineTo(20.0, 30.0)
(shape as GeneralPath).lineTo(32.0, 27.428572)
(shape as GeneralPath).lineTo(34.42857, 37.0)
(shape as GeneralPath).lineTo(38.0, 36.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_1
shape = GeneralPath()
(shape as GeneralPath).moveTo(17.374998, 21.668259)
(shape as GeneralPath).curveTo(14.821727, 23.078575, 13.0, 25.694616, 13.0, 28.80768)
(shape as GeneralPath).curveTo(13.0, 33.36178, 16.715132, 37.076912, 21.26923, 37.076912)
(shape as GeneralPath).curveTo(25.584839, 37.076912, 29.03297, 33.705624, 29.39423, 29.480759)
(shape as GeneralPath).lineTo(27.399036, 29.937489)
(shape as GeneralPath).curveTo(26.85153, 32.888084, 24.382202, 35.153835, 21.26923, 35.153835)
(shape as GeneralPath).curveTo(17.755636, 35.153835, 14.923077, 32.321274, 14.923077, 28.80768)
(shape as GeneralPath).curveTo(14.923077, 26.611685, 16.12003, 24.778076, 17.807692, 23.639412)
(shape as GeneralPath).lineTo(17.374998, 21.668259)
(shape as GeneralPath).closePath()
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.9230775f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(22.857143, 20.857143)
(shape as GeneralPath).lineTo(31.714287, 20.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
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
        fun of(width: Int, height: Int): ResizableIcon {
            return Preferences_desktop_accessibility(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Preferences_desktop_accessibility(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Preferences_desktop_accessibility(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

