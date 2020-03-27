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
class Format_text_bold private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 0.2f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.4701440334320068f, 0.0f, 0.0f, 0.5354740023612976f, -12.76416015625f, 20.915340423583984f))
// _0_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(40.48186, 36.421127)
(shape as GeneralPath).curveTo(40.50693, 39.429993, 37.530556, 42.216076, 32.67976, 43.724407)
(shape as GeneralPath).curveTo(27.828962, 45.23274, 21.845287, 45.23274, 16.99449, 43.724407)
(shape as GeneralPath).curveTo(12.143692, 42.216076, 9.167317, 39.429993, 9.192389, 36.421127)
(shape as GeneralPath).curveTo(9.167317, 33.412262, 12.143692, 30.626177, 16.99449, 29.117847)
(shape as GeneralPath).curveTo(21.845287, 27.609516, 27.828962, 27.609516, 32.67976, 29.117847)
(shape as GeneralPath).curveTo(37.530556, 30.626177, 40.50693, 33.412262, 40.48186, 36.421127)
(shape as GeneralPath).closePath()
paint = RadialGradientPaint(Point2D.Double(24.837125778198242, 36.42112731933594), 15.644737f, Point2D.Double(24.837125778198242, 36.42112731933594), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.5367230176925659f, 6.419148134724885E-15f, 16.87306022644043f))
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
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f))
// _0_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_0_0
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.0, 0.5)
(shape as GeneralPath).lineTo(3.0, 37.5)
(shape as GeneralPath).lineTo(13.0, 37.5)
(shape as GeneralPath).lineTo(15.224112, 31.5)
(shape as GeneralPath).lineTo(32.731693, 31.5)
(shape as GeneralPath).lineTo(35.0, 37.5)
(shape as GeneralPath).lineTo(45.0, 37.5)
(shape as GeneralPath).lineTo(30.0, 0.5)
(shape as GeneralPath).lineTo(27.0, 0.5)
(shape as GeneralPath).lineTo(21.0, 0.5)
(shape as GeneralPath).lineTo(18.0, 0.5)
(shape as GeneralPath).closePath()
(shape as GeneralPath).moveTo(24.0, 9.0)
(shape as GeneralPath).lineTo(29.59375, 23.5)
(shape as GeneralPath).lineTo(18.40625, 23.5)
(shape as GeneralPath).lineTo(24.0, 9.0)
(shape as GeneralPath).closePath()
paint = LinearGradientPaint(Point2D.Double(29.122220993041992, 33.43888854980469), Point2D.Double(14.29636287689209, 6.346399307250977), floatArrayOf(0.0f,1.0f), arrayOf(Color(73, 127, 198, 255),Color(144, 179, 217, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(19.988433837890625, 34.98324966430664), Point2D.Double(19.988433837890625, 6.434155464172363), floatArrayOf(0.0f,1.0f), arrayOf(Color(42, 83, 135, 255),Color(52, 101, 164, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(18.0, 0.5)
(shape as GeneralPath).lineTo(3.0, 37.5)
(shape as GeneralPath).lineTo(13.0, 37.5)
(shape as GeneralPath).lineTo(15.224112, 31.5)
(shape as GeneralPath).lineTo(32.731693, 31.5)
(shape as GeneralPath).lineTo(35.0, 37.5)
(shape as GeneralPath).lineTo(45.0, 37.5)
(shape as GeneralPath).lineTo(30.0, 0.5)
(shape as GeneralPath).lineTo(27.0, 0.5)
(shape as GeneralPath).lineTo(21.0, 0.5)
(shape as GeneralPath).lineTo(18.0, 0.5)
(shape as GeneralPath).closePath()
(shape as GeneralPath).moveTo(24.0, 9.0)
(shape as GeneralPath).lineTo(29.59375, 23.5)
(shape as GeneralPath).lineTo(18.40625, 23.5)
(shape as GeneralPath).lineTo(24.0, 9.0)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.7f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_0_1
paint = LinearGradientPaint(Point2D.Double(19.89179229736328, 16.114627838134766), Point2D.Double(31.85671615600586, 72.78054809570312), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(179, 179, 179, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -3.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(4.463434, 36.5)
(shape as GeneralPath).lineTo(18.69856, 1.5)
(shape as GeneralPath).lineTo(29.345564, 1.5)
(shape as GeneralPath).lineTo(43.563927, 36.5)
(shape as GeneralPath).lineTo(35.676777, 36.5)
(shape as GeneralPath).lineTo(33.5, 30.5)
(shape as GeneralPath).lineTo(14.5, 30.5)
(shape as GeneralPath).lineTo(12.265165, 36.5)
(shape as GeneralPath).lineTo(4.463434, 36.5)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.7f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_0_2
paint = LinearGradientPaint(Point2D.Double(25.0, 27.5), Point2D.Double(26.673967361450195, 10.0), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.0f, -4.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
(shape as GeneralPath).moveTo(16.881283, 24.5)
(shape as GeneralPath).lineTo(31.118717, 24.5)
(shape as GeneralPath).lineTo(24.0, 6.5)
(shape as GeneralPath).lineTo(16.881283, 24.5)
(shape as GeneralPath).closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
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
        fun of(width: Int, height: Int): ResizableIcon {
            return Format_text_bold(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Format_text_bold(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Format_text_bold(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

