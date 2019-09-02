package org.pushingpixels.demo.plasma.svg

import java.awt.*
import java.awt.geom.*
import java.awt.image.BufferedImage
import java.io.*
import java.lang.ref.WeakReference
import java.util.Base64
import javax.imageio.ImageIO
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.neon.icon.ResizableIcon.Factory
import org.pushingpixels.neon.icon.ResizableIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Internet_group_chat private constructor(private var width: Int, private var height: Int)
       : ResizableIcon {
    

	private fun innerPaint(g : Graphics2D) {
        @Suppress("UNUSED_VARIABLE") var shape: Shape?
        @Suppress("UNUSED_VARIABLE") var paint: Paint?
        @Suppress("UNUSED_VARIABLE") var stroke: Stroke?
        @Suppress("UNUSED_VARIABLE") var clip: Shape?

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
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.75f, -6.5f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 0.12f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0
shape = Ellipse2D.Double(3.59999942779541, 32.580997467041016, 31.6200008392334, 8.718000411987305)
paint = RadialGradientPaint(Point2D.Double(29.5, 27.639999389648438), 11.52f, Point2D.Double(29.5, 27.639999389648438), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3730000257492065f, 0.0f, 0.0f, 0.3785000145435333f, -21.09000015258789f, 26.469999313354492f))
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.transform = defaultTransform__0_0
g.composite = AlphaComposite.getInstance(3, 0.12f * origAlpha)
val defaultTransform__0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
shape = Ellipse2D.Double(3.59999942779541, 32.580997467041016, 31.6200008392334, 8.718000411987305)
paint = RadialGradientPaint(Point2D.Double(29.5, 27.639999389648438), 11.52f, Point2D.Double(29.5, 27.639999389648438), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3730000257492065f, 0.0f, 0.0f, 0.3785000145435333f, -21.09000015258789f, 26.469999313354492f))
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2 = g.transform
g.transform(AffineTransform(-1.0299999713897705f, 0.0f, 0.0f, 0.989799976348877f, 49.08000183105469f, -8.723999977111816f))
// _0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_0
shape = GeneralPath()
shape.moveTo(31.64, 17.39)
shape.lineTo(31.64, 32.579998)
shape.curveTo(31.64, 33.639, 30.817, 34.477997, 29.778, 34.477997)
shape.lineTo(16.068, 34.477997)
shape.curveTo(15.237, 35.590996, 13.564001, 37.406, 9.641001, 38.887997)
shape.curveTo(11.366001, 36.822, 11.468, 35.428997, 11.273001, 34.477997)
shape.lineTo(8.464001, 34.477997)
shape.curveTo(7.4250007, 34.477997, 6.5710006, 33.638996, 6.5710006, 32.579998)
shape.lineTo(6.5710006, 17.39)
shape.curveTo(6.5710006, 16.331, 7.4250007, 15.459999, 8.464001, 15.459999)
shape.lineTo(29.784, 15.459999)
shape.curveTo(30.823, 15.459999, 31.646, 16.331, 31.646, 17.39)
shape.closePath()
paint = LinearGradientPaint(Point2D.Double(36.439998626708984, 19.989999771118164), Point2D.Double(49.08000183105469, 35.47999954223633), floatArrayOf(0.0f,1.0f), arrayOf(Color(245, 245, 245, 255),Color(233, 233, 233, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-1.0080000162124634f, 0.0f, 0.0f, 0.9876000285148621f, 61.880001068115234f, 0.2750000059604645f))
g.paint = paint
g.fill(shape)
paint = Color(120, 120, 120, 255)
stroke = BasicStroke(0.99f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(31.64, 17.39)
shape.lineTo(31.64, 32.579998)
shape.curveTo(31.64, 33.639, 30.817, 34.477997, 29.778, 34.477997)
shape.lineTo(16.068, 34.477997)
shape.curveTo(15.237, 35.590996, 13.564001, 37.406, 9.641001, 38.887997)
shape.curveTo(11.366001, 36.822, 11.468, 35.428997, 11.273001, 34.477997)
shape.lineTo(8.464001, 34.477997)
shape.curveTo(7.4250007, 34.477997, 6.5710006, 33.638996, 6.5710006, 32.579998)
shape.lineTo(6.5710006, 17.39)
shape.curveTo(6.5710006, 16.331, 7.4250007, 15.459999, 8.464001, 15.459999)
shape.lineTo(29.784, 15.459999)
shape.curveTo(30.823, 15.459999, 31.646, 16.331, 31.646, 17.39)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_2_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_1
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(0.99f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(30.62, 17.88)
shape.lineTo(30.62, 32.079998)
shape.curveTo(30.62, 33.039997, 30.378, 33.447998, 29.436, 33.447998)
shape.lineTo(15.536001, 33.447998)
shape.curveTo(14.783001, 34.457996, 13.468001, 36.044, 12.025002, 36.698997)
shape.curveTo(12.428001, 35.531998, 12.273002, 34.562996, 12.198002, 33.447998)
shape.lineTo(8.791002, 33.447998)
shape.curveTo(7.8490024, 33.447998, 7.5790024, 33.039997, 7.5790024, 32.079998)
shape.lineTo(7.5790024, 17.999998)
shape.curveTo(7.5790024, 17.039999, 7.8490024, 16.451998, 8.791002, 16.451998)
shape.lineTo(29.391003, 16.451998)
shape.curveTo(30.334003, 16.451998, 30.626003, 16.912998, 30.626003, 17.873999)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_2_0_1
g.transform = defaultTransform__0_2_0
g.transform = defaultTransform__0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_3_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_3_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3_0_0
shape = GeneralPath()
shape.moveTo(31.64, 17.39)
shape.lineTo(31.64, 32.579998)
shape.curveTo(31.64, 33.639, 30.817, 34.477997, 29.778, 34.477997)
shape.lineTo(16.068, 34.477997)
shape.curveTo(15.237, 35.590996, 13.564001, 37.406, 9.641001, 38.887997)
shape.curveTo(11.366001, 36.822, 11.468, 35.428997, 11.273001, 34.477997)
shape.lineTo(8.464001, 34.477997)
shape.curveTo(7.4250007, 34.477997, 6.5710006, 33.638996, 6.5710006, 32.579998)
shape.lineTo(6.5710006, 17.39)
shape.curveTo(6.5710006, 16.331, 7.4250007, 15.459999, 8.464001, 15.459999)
shape.lineTo(29.784, 15.459999)
shape.curveTo(30.823, 15.459999, 31.646, 16.331, 31.646, 17.39)
shape.closePath()
paint = LinearGradientPaint(Point2D.Double(35.0, 10.960000038146973), Point2D.Double(27.270000457763672, 24.139999389648438), floatArrayOf(0.0f,1.0f), arrayOf(Color(245, 245, 245, 255),Color(233, 233, 233, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.9771999716758728f, 0.0f, 0.0f, 0.9958999752998352f, 50.599998474121094f, 9.116000175476074f))
g.paint = paint
g.fill(shape)
paint = Color(120, 120, 120, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(31.64, 17.39)
shape.lineTo(31.64, 32.579998)
shape.curveTo(31.64, 33.639, 30.817, 34.477997, 29.778, 34.477997)
shape.lineTo(16.068, 34.477997)
shape.curveTo(15.237, 35.590996, 13.564001, 37.406, 9.641001, 38.887997)
shape.curveTo(11.366001, 36.822, 11.468, 35.428997, 11.273001, 34.477997)
shape.lineTo(8.464001, 34.477997)
shape.curveTo(7.4250007, 34.477997, 6.5710006, 33.638996, 6.5710006, 32.579998)
shape.lineTo(6.5710006, 17.39)
shape.curveTo(6.5710006, 16.331, 7.4250007, 15.459999, 8.464001, 15.459999)
shape.lineTo(29.784, 15.459999)
shape.curveTo(30.823, 15.459999, 31.646, 16.331, 31.646, 17.39)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_3_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_3_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3_0_1
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(30.62, 17.88)
shape.lineTo(30.62, 32.079998)
shape.curveTo(30.62, 33.039997, 30.378, 33.447998, 29.436, 33.447998)
shape.lineTo(15.536001, 33.447998)
shape.curveTo(14.783001, 34.457996, 13.468001, 36.044, 12.025002, 36.698997)
shape.curveTo(12.428001, 35.531998, 12.273002, 34.562996, 12.198002, 33.447998)
shape.lineTo(8.791002, 33.447998)
shape.curveTo(7.8490024, 33.447998, 7.5790024, 33.039997, 7.5790024, 32.079998)
shape.lineTo(7.5790024, 17.999998)
shape.curveTo(7.5790024, 17.039999, 7.8490024, 16.451998, 8.791002, 16.451998)
shape.lineTo(29.391003, 16.451998)
shape.curveTo(30.334003, 16.451998, 30.626003, 16.912998, 30.626003, 17.873999)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_3_0_1
g.transform = defaultTransform__0_3_0
g.transform = defaultTransform__0_3
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
            return 3.59999942779541
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 6.088356018066406
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 42.37000274658203
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 35.21063995361328
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Internet_group_chat(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Internet_group_chat(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Internet_group_chat(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

