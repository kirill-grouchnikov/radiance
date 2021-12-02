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
class Info private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.0f, 77.5f)
generalPath!!.curveTo(19.322f, 77.5f, 2.5f, 60.678f, 2.5f, 40.0f)
generalPath!!.curveTo(2.5f, 19.321999f, 19.322f, 2.5f, 40.0f, 2.5f)
generalPath!!.curveTo(60.678f, 2.5f, 77.5f, 19.322f, 77.5f, 40.0f)
generalPath!!.curveTo(77.5f, 60.678f, 60.678f, 77.5f, 40.0f, 77.5f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(139, 183, 240, 255)) ?: Color(139, 183, 240, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_1_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.0f, 3.0f)
generalPath!!.curveTo(60.402f, 3.0f, 77.0f, 19.598f, 77.0f, 40.0f)
generalPath!!.curveTo(77.0f, 60.402f, 60.402f, 77.0f, 40.0f, 77.0f)
generalPath!!.curveTo(19.598f, 77.0f, 3.0f, 60.402f, 3.0f, 40.0f)
generalPath!!.curveTo(3.0f, 19.598f, 19.598f, 3.0f, 40.0f, 3.0f)
generalPath!!.moveTo(40.0f, 2.0f)
generalPath!!.curveTo(19.013f, 2.0f, 2.0f, 19.013f, 2.0f, 40.0f)
generalPath!!.curveTo(2.0f, 60.987f, 19.013f, 78.0f, 40.0f, 78.0f)
generalPath!!.curveTo(60.987f, 78.0f, 78.0f, 60.987f, 78.0f, 40.0f)
generalPath!!.curveTo(78.0f, 19.013f, 60.987f, 2.0f, 40.0f, 2.0f)
generalPath!!.lineTo(40.0f, 2.0f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(78, 122, 181, 255)) ?: Color(78, 122, 181, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_1
shape = Ellipse2D.Double(37.0, 21.0, 6.0, 6.0)
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_2_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(43.0f, 56.0f)
generalPath!!.lineTo(43.0f, 31.0f)
generalPath!!.lineTo(35.0f, 31.0f)
generalPath!!.lineTo(35.0f, 33.0f)
generalPath!!.lineTo(37.0f, 33.0f)
generalPath!!.lineTo(37.0f, 56.0f)
generalPath!!.lineTo(35.0f, 56.0f)
generalPath!!.lineTo(35.0f, 58.0f)
generalPath!!.lineTo(45.0f, 58.0f)
generalPath!!.lineTo(45.0f, 56.0f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
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
            return 2.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 2.0
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 76.0
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 76.0
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Info(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Info(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Info(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

