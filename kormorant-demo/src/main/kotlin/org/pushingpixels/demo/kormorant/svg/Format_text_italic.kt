package org.pushingpixels.demo.kormorant.svg

import java.awt.*
import java.awt.geom.*

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/ibis">Ibis SVG transcoder</a>.
 */
class Format_text_italic(private var width: Int, private var height: Int) : 
        org.pushingpixels.flamingo.api.common.icon.ResizableIcon {
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
paint = LinearGradientPaint(Point2D.Double(29.033241271972656, 36.44520950317383), Point2D.Double(14.333789825439453, 9.459654808044434), floatArrayOf(0.0f,1.0f), arrayOf(Color(73, 127, 198, 255),Color(144, 179, 217, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.000003814697266f, 1.0f))
shape = GeneralPath()
shape.moveTo(34.0, 4.5)
shape.lineTo(4.0, 41.5)
shape.lineTo(10.500004, 41.5)
shape.lineTo(16.990517, 33.5)
shape.lineTo(36.5, 33.5)
shape.lineTo(36.500004, 41.5)
shape.lineTo(41.5, 41.5)
shape.lineTo(41.5, 4.5)
shape.lineTo(34.0, 4.5)
shape.closePath()
shape.moveTo(36.5, 9.5)
shape.lineTo(36.5, 28.5)
shape.lineTo(21.047087, 28.5)
shape.lineTo(36.5, 9.5)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(22.125, 34.96281051635742), Point2D.Double(22.125, 6.25), floatArrayOf(0.0f,1.0f), arrayOf(Color(42, 83, 135, 255),Color(52, 101, 164, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.000003814697266f, 4.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(34.0, 4.5)
shape.lineTo(4.0, 41.5)
shape.lineTo(10.500004, 41.5)
shape.lineTo(16.990517, 33.5)
shape.lineTo(36.5, 33.5)
shape.lineTo(36.500004, 41.5)
shape.lineTo(41.5, 41.5)
shape.lineTo(41.5, 4.5)
shape.lineTo(34.0, 4.5)
shape.closePath()
shape.moveTo(36.5, 9.5)
shape.lineTo(36.5, 28.5)
shape.lineTo(21.047087, 28.5)
shape.lineTo(36.5, 9.5)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_0
g.composite = AlphaComposite.getInstance(3, 0.7f * origAlpha)
val defaultTransform__0_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
paint = LinearGradientPaint(Point2D.Double(20.846664428710938, 15.432576179504395), Point2D.Double(21.077463150024414, 61.9260368347168), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(179, 179, 179, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.000003814697266f, 1.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(6.1325827, 40.5)
shape.lineTo(34.5, 5.5)
shape.lineTo(40.5, 5.5)
shape.lineTo(40.5, 40.5)
shape.lineTo(37.38827, 40.48699)
shape.lineTo(37.38827, 32.490986)
shape.lineTo(16.793787, 32.490986)
shape.lineTo(9.899495, 40.5)
shape.lineTo(6.1325827, 40.5)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_1
g.composite = AlphaComposite.getInstance(3, 0.3846154f * origAlpha)
val defaultTransform__0_1_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2
paint = LinearGradientPaint(Point2D.Double(30.123498916625977, 28.5), Point2D.Double(30.916004180908203, 5.399416446685791), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 5.000006198883057f, 1.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(18.976889, 29.411612)
shape.lineTo(37.47949, 29.5)
shape.lineTo(37.38827, 6.8994164)
shape.lineTo(18.976889, 29.411612)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_2
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
         * Returns an instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): Format_text_italic {
            return Format_text_italic(width, height)
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
                g2d.translate(extraDx, 0);
            }
        }
        val g2ForInner = g2d.create() as Graphics2D
        innerPaint(g2ForInner)
        g2ForInner.dispose()
        g2d.dispose()

    }
}

