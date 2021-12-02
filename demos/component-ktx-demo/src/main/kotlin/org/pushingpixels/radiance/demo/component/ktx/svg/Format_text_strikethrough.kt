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
class Format_text_strikethrough private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 0.15f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.4701440334320068f, 0.0f, 0.0f, 0.5354740023612976f, -12.76416015625f, 20.915340423583984f))
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.48186f, 36.421127f)
generalPath!!.curveTo(40.50693f, 39.429993f, 37.530556f, 42.216076f, 32.67976f, 43.724407f)
generalPath!!.curveTo(27.828962f, 45.23274f, 21.845287f, 45.23274f, 16.99449f, 43.724407f)
generalPath!!.curveTo(12.143692f, 42.216076f, 9.167317f, 39.429993f, 9.192389f, 36.421127f)
generalPath!!.curveTo(9.167317f, 33.412262f, 12.143692f, 30.626177f, 16.99449f, 29.117847f)
generalPath!!.curveTo(21.845287f, 27.609516f, 27.828962f, 27.609516f, 32.67976f, 29.117847f)
generalPath!!.curveTo(37.530556f, 30.626177f, 40.50693f, 33.412262f, 40.48186f, 36.421127f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.837125778198242, 36.42112731933594), 15.644737f, Point2D.Double(24.837125778198242, 36.42112731933594), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.5367230176925659f, 6.419148134724885E-15f, 16.87306022644043f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_1_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.0f, 4.5f)
generalPath!!.lineTo(5.0f, 41.5f)
generalPath!!.lineTo(11.0f, 41.5f)
generalPath!!.lineTo(14.25f, 33.5f)
generalPath!!.lineTo(33.75f, 33.5f)
generalPath!!.lineTo(37.0f, 41.5f)
generalPath!!.lineTo(43.0f, 41.5f)
generalPath!!.lineTo(28.0f, 4.5f)
generalPath!!.lineTo(20.0f, 4.5f)
generalPath!!.closePath()
generalPath!!.moveTo(24.0f, 9.5f)
generalPath!!.lineTo(31.71875f, 28.5f)
generalPath!!.lineTo(16.28125f, 28.5f)
generalPath!!.lineTo(24.0f, 9.5f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(29.033241271972656, 36.44520950317383), Point2D.Double(14.333789825439453, 9.459654808044434), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(73, 127, 198, 255)) ?: Color(73, 127, 198, 255)),(colorFilter?.filter(Color(144, 179, 217, 255)) ?: Color(144, 179, 217, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(22.125, 34.96281051635742), Point2D.Double(22.125, 6.25), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(42, 83, 135, 255)) ?: Color(42, 83, 135, 255)),(colorFilter?.filter(Color(52, 101, 164, 255)) ?: Color(52, 101, 164, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.0f, 4.5f)
generalPath!!.lineTo(5.0f, 41.5f)
generalPath!!.lineTo(11.0f, 41.5f)
generalPath!!.lineTo(14.25f, 33.5f)
generalPath!!.lineTo(33.75f, 33.5f)
generalPath!!.lineTo(37.0f, 41.5f)
generalPath!!.lineTo(43.0f, 41.5f)
generalPath!!.lineTo(28.0f, 4.5f)
generalPath!!.lineTo(20.0f, 4.5f)
generalPath!!.closePath()
generalPath!!.moveTo(24.0f, 9.5f)
generalPath!!.lineTo(31.71875f, 28.5f)
generalPath!!.lineTo(16.28125f, 28.5f)
generalPath!!.lineTo(24.0f, 9.5f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 0.6f * origAlpha)
// _0_1_1
paint = LinearGradientPaint(Point2D.Double(19.89179229736328, 16.114627838134766), Point2D.Double(21.50684356689453, 85.69680786132812), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(179, 179, 179, 0)) ?: Color(179, 179, 179, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(10.5f, 40.5f)
generalPath!!.lineTo(6.646263f, 40.5f)
generalPath!!.lineTo(20.682829f, 5.5f)
generalPath!!.lineTo(27.353737f, 5.5f)
generalPath!!.lineTo(41.68283f, 40.5f)
generalPath!!.lineTo(37.865658f, 40.5f)
generalPath!!.lineTo(34.403564f, 32.469063f)
generalPath!!.lineTo(13.523417f, 32.36827f)
generalPath!!.curveTo(13.523417f, 32.36827f, 10.5f, 40.5f, 10.5f, 40.5f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 0.46703297f * origAlpha)
// _0_1_2
paint = LinearGradientPaint(Point2D.Double(24.911611557006836, 22.13603973388672), Point2D.Double(24.911611557006836, 6.4029130935668945), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(14.68934f, 29.5f)
generalPath!!.lineTo(33.258884f, 29.5f)
generalPath!!.lineTo(24.041632f, 6.81103f)
generalPath!!.lineTo(14.68934f, 29.5f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 0.16470589f * origAlpha)
// _0_1_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(12.34375f, 22.0f)
generalPath!!.lineTo(10.75f, 26.0f)
generalPath!!.curveTo(10.75f, 26.0f, 17.84375f, 26.0f, 17.84375f, 26.0f)
generalPath!!.lineTo(19.46875f, 22.0f)
generalPath!!.lineTo(12.34375f, 22.0f)
generalPath!!.closePath()
generalPath!!.moveTo(28.53125f, 22.0f)
generalPath!!.lineTo(30.15625f, 26.0f)
generalPath!!.lineTo(37.25f, 26.0f)
generalPath!!.lineTo(35.65625f, 22.0f)
generalPath!!.lineTo(28.53125f, 22.0f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(16.841535568237305, 24.0), Point2D.Double(16.841535568237305, 25.010555267333984), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_1_4
shape = Rectangle2D.Double(4.5, 20.5, 39.0, 3.0)
paint = LinearGradientPaint(Point2D.Double(27.675018310546875, 45.398963928222656), Point2D.Double(16.074399948120117, 27.920007705688477), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(73, 127, 198, 255)) ?: Color(73, 127, 198, 255)),(colorFilter?.filter(Color(144, 179, 217, 255)) ?: Color(144, 179, 217, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -23.0f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(5.027165412902832, 27.761903762817383), Point2D.Double(5.027165412902832, 20.416152954101562), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(42, 83, 135, 255)) ?: Color(42, 83, 135, 255)),(colorFilter?.filter(Color(52, 101, 164, 255)) ?: Color(52, 101, 164, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = Rectangle2D.Double(4.5, 20.5, 39.0, 3.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 0.8f * origAlpha)
// _0_1_5
paint = LinearGradientPaint(Point2D.Double(39.42120361328125, 41.45926284790039), Point2D.Double(-24.13001823425293, 41.5), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -20.0f))
stroke = BasicStroke(1.0f,2,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.5f, 21.5f)
generalPath!!.lineTo(42.5f, 21.5f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)

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
            return 0.7131168246269226
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 4.0
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 46.07374954223633
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 41.13629913330078
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Format_text_strikethrough(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Format_text_strikethrough(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Format_text_strikethrough(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

