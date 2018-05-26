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
 * href="https://github.com/kirill-grouchnikov/radiance">Ibis SVG transcoder</a>.
 */
class Format_text_underline(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
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
g.composite = AlphaComposite.getInstance(3, 0.15f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.4701440334320068f, 0.0f, 0.0f, 0.5354740023612976f, -12.76416015625f, 20.915340423583984f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(24.837125778198242, 36.42112731933594), 15.644737f, Point2D.Double(24.837125778198242, 36.42112731933594), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.5367230176925659f, 6.419148134724885E-15f, 16.87306022644043f))
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
g.transform = defaultTransform__0_0_0
g.transform = defaultTransform__0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_0
paint = LinearGradientPaint(Point2D.Double(29.033241271972656, 36.44520950317383), Point2D.Double(14.333789825439453, 9.459654808044434), floatArrayOf(0.0f,1.0f), arrayOf(Color(73, 127, 198, 255),Color(144, 179, 217, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.0f))
shape = GeneralPath()
shape.moveTo(20.0, 2.5)
shape.lineTo(5.0, 39.5)
shape.lineTo(11.0, 39.5)
shape.lineTo(14.25, 31.5)
shape.lineTo(33.75, 31.5)
shape.lineTo(37.0, 39.5)
shape.lineTo(43.0, 39.5)
shape.lineTo(28.0, 2.5)
shape.lineTo(20.0, 2.5)
shape.closePath()
shape.moveTo(24.0, 7.5)
shape.lineTo(31.71875, 26.5)
shape.lineTo(16.28125, 26.5)
shape.lineTo(24.0, 7.5)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(22.125, 34.96281051635742), Point2D.Double(22.125, 6.25), floatArrayOf(0.0f,1.0f), arrayOf(Color(42, 83, 135, 255),Color(52, 101, 164, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(20.0, 2.5)
shape.lineTo(5.0, 39.5)
shape.lineTo(11.0, 39.5)
shape.lineTo(14.25, 31.5)
shape.lineTo(33.75, 31.5)
shape.lineTo(37.0, 39.5)
shape.lineTo(43.0, 39.5)
shape.lineTo(28.0, 2.5)
shape.lineTo(20.0, 2.5)
shape.closePath()
shape.moveTo(24.0, 7.5)
shape.lineTo(31.71875, 26.5)
shape.lineTo(16.28125, 26.5)
shape.lineTo(24.0, 7.5)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_0
g.composite = AlphaComposite.getInstance(3, 0.6f * origAlpha)
val defaultTransform__0_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
paint = LinearGradientPaint(Point2D.Double(19.89179229736328, 16.114627838134766), Point2D.Double(21.50684356689453, 85.69680786132812), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(179, 179, 179, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(10.5, 38.5)
shape.lineTo(6.646263, 38.5)
shape.lineTo(20.682829, 3.5)
shape.lineTo(27.353737, 3.5)
shape.lineTo(41.68283, 38.5)
shape.lineTo(37.865658, 38.5)
shape.lineTo(34.403564, 30.469063)
shape.lineTo(13.523417, 30.368273)
shape.curveTo(13.523417, 30.368273, 10.5, 38.5, 10.5, 38.5)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_1
g.composite = AlphaComposite.getInstance(3, 0.47802198f * origAlpha)
val defaultTransform__0_1_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2
paint = LinearGradientPaint(Point2D.Double(24.911611557006836, 22.13603973388672), Point2D.Double(24.911611557006836, 6.4029130935668945), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.0f, -1.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(14.43934, 27.5)
shape.lineTo(33.383884, 27.5)
shape.lineTo(24.041632, 4.81103)
shape.lineTo(14.43934, 27.5)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_3
paint = LinearGradientPaint(Point2D.Double(27.675018310546875, 45.398963928222656), Point2D.Double(16.074399948120117, 27.920007705688477), floatArrayOf(0.0f,1.0f), arrayOf(Color(73, 127, 198, 255),Color(144, 179, 217, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -2.0f))
shape = Rectangle2D.Double(4.5, 41.5, 39.0, 3.0)
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(5.027165412902832, 27.761903762817383), Point2D.Double(5.027165412902832, 20.416152954101562), floatArrayOf(0.0f,1.0f), arrayOf(Color(42, 83, 135, 255),Color(52, 101, 164, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 21.0f))
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = Rectangle2D.Double(4.5, 41.5, 39.0, 3.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_3
g.composite = AlphaComposite.getInstance(3, 0.8f * origAlpha)
val defaultTransform__0_1_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4
paint = LinearGradientPaint(Point2D.Double(39.42120361328125, 41.45926284790039), Point2D.Double(-24.13001823425293, 41.5), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f))
stroke = BasicStroke(1.0f,2,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.5, 42.5)
shape.lineTo(42.5, 42.5)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_4
g.transform = defaultTransform__0_1
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
            return 0.7131168246269226
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 1.9994829893112183
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
            return 43.13681411743164
        }

        /**
         * Returns an instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Format_text_underline(width, height))
        }

        /**
         * Returns a [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Format_text_underline(width, height))
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

    override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
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

