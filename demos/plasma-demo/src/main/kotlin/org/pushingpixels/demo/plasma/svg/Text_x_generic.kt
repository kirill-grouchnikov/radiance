package org.pushingpixels.demo.plasma.svg

import java.awt.*
import java.awt.geom.*
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.neon.icon.ResizableIcon.Factory
import org.pushingpixels.neon.icon.ResizableIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Text_x_generic private constructor(private var width: Int, private var height: Int)
       : ResizableIcon {
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
g.composite = AlphaComposite.getInstance(3, 0.8f * origAlpha)
val defaultTransform__0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
paint = RadialGradientPaint(Point2D.Double(24.309999465942383, 42.099998474121094), 15.82f, Point2D.Double(24.309999465942383, 42.099998474121094), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0759999752044678f, 0.0f, 0.0f, 0.2849999964237213f, -1.850000023841858f, 30.799999237060547f))
shape = Ellipse2D.Double(7.299999237060547, 38.29999923706055, 34.0, 9.0)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
paint = RadialGradientPaint(Point2D.Double(33.970001220703125, 35.7400016784668), 86.7f, Point2D.Double(33.970001220703125, 35.7400016784668), floatArrayOf(0.0f,1.0f), arrayOf(Color(250, 250, 250, 255),Color(187, 187, 187, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9610000252723694f, 0.0f, 0.0f, 1.0410000085830688f, 0.0f, 0.0f))
shape = RoundRectangle2D.Double(6.599999904632568, 3.6500000953674316, 34.880001068115234, 41.0, 2.4000000953674316, 2.4000000953674316)
g.paint = paint
g.fill(shape)
paint = RadialGradientPaint(Point2D.Double(8.819999694824219, 3.759999990463257), 37.75f, Point2D.Double(8.819999694824219, 3.759999990463257), floatArrayOf(0.0f,1.0f), arrayOf(Color(163, 163, 163, 255),Color(76, 76, 76, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9679999947547913f, 0.0f, 0.0f, 1.0329999923706055f, 3.3499999046325684f, 0.6499999761581421f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(6.599999904632568, 3.6500000953674316, 34.880001068115234, 41.0, 2.4000000953674316, 2.4000000953674316)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
paint = RadialGradientPaint(Point2D.Double(8.140000343322754, 7.269999980926514), 38.2f, Point2D.Double(8.140000343322754, 7.269999980926514), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(248, 248, 248, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9679999947547913f, 0.0f, 0.0f, 1.0329999923706055f, 3.3499999046325684f, 0.6499999761581421f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(7.659999847412109, 4.579999923706055, 32.779998779296875, 39.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_3_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3_0
paint = Color(0, 0, 0, 5)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(11.5, 5.4)
shape.lineTo(11.5, 43.300003)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_3_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3_1
paint = Color(255, 255, 255, 51)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(12.5, 5.0)
shape.lineTo(12.5, 43.0)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_3_1
g.transform = defaultTransform__0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_0_0
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 9.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_0_1
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 11.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_0_2
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 13.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_0_3
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 15.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_0_3
g.transform = defaultTransform__0_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_1
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 25.0, 9.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_2
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 37.0, 14.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 8.0f))
// _0_4_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_3_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_3_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_3_0_0
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 9.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_3_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_3_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_3_0_1
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 11.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_3_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_3_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_3_0_2
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 13.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_3_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_3_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_3_0_3
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 15.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_3_0_3
g.transform = defaultTransform__0_4_3_0
g.transform = defaultTransform__0_4_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 20.0f))
// _0_4_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_4_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_4_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_4_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_4_0_0
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 9.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_4_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_4_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_4_0_1
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 11.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_4_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_4_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_4_0_2
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 13.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_4_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4_4_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4_4_0_3
paint = Color(155, 155, 155, 140)
shape = RoundRectangle2D.Double(16.0, 15.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4_4_0_3
g.transform = defaultTransform__0_4_4_0
g.transform = defaultTransform__0_4_4
g.transform = defaultTransform__0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_5_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5_0
paint = Color(255, 255, 255, 255)
shape = Ellipse2D.Double(9.350000381469727, 17.8700008392334, 1.6399999856948853, 1.6399999856948853)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_5_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_5_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5_1
paint = RadialGradientPaint(Point2D.Double(10.100000381469727, 18.81999969482422), 1.21f, Point2D.Double(10.100000381469727, 18.81999969482422), floatArrayOf(0.0f,1.0f), arrayOf(Color(240, 240, 240, 255),Color(154, 154, 154, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = Ellipse2D.Double(9.0, 17.610000610351562, 1.6399999856948853, 1.6399999856948853)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_5_1
g.transform = defaultTransform__0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 11.5f))
// _0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_6_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_6_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_6_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_6_0_0
paint = Color(255, 255, 255, 255)
shape = Ellipse2D.Double(9.350000381469727, 17.8700008392334, 1.6399999856948853, 1.6399999856948853)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_6_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_6_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_6_0_1
paint = RadialGradientPaint(Point2D.Double(10.100000381469727, 18.81999969482422), 1.21f, Point2D.Double(10.100000381469727, 18.81999969482422), floatArrayOf(0.0f,1.0f), arrayOf(Color(240, 240, 240, 255),Color(154, 154, 154, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = Ellipse2D.Double(9.0, 17.610000610351562, 1.6399999856948853, 1.6399999856948853)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_6_0_1
g.transform = defaultTransform__0_6_0
g.transform = defaultTransform__0_6
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
            return 6.099999904632568
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 3.1500000953674316
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 35.880001068115234
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.14999771118164
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Text_x_generic(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Text_x_generic(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Text_x_generic(16, 16) }
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

