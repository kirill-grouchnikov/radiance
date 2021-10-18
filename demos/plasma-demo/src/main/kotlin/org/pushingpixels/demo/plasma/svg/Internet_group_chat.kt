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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon
import org.pushingpixels.radiance.common.api.icon.RadianceIcon.Factory
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
class Internet_group_chat private constructor(private var width: Int, private var height: Int)
       : RadianceIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var colorFilter: RadianceIcon.ColorFilter? = null
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
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.75f, -6.5f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 0.12f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0
shape = Ellipse2D.Double(3.59999942779541, 32.580997467041016, 31.6200008392334, 8.718000411987305)
paint = RadialGradientPaint(Point2D.Double(29.5, 27.639999389648438), 11.52f, Point2D.Double(29.5, 27.639999389648438), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3730000257492065f, 0.0f, 0.0f, 0.3785000145435333f, -21.09000015258789f, 26.469999313354492f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.12f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
shape = Ellipse2D.Double(3.59999942779541, 32.580997467041016, 31.6200008392334, 8.718000411987305)
paint = RadialGradientPaint(Point2D.Double(29.5, 27.639999389648438), 11.52f, Point2D.Double(29.5, 27.639999389648438), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3730000257492065f, 0.0f, 0.0f, 0.3785000145435333f, -21.09000015258789f, 26.469999313354492f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(-1.0299999713897705f, 0.0f, 0.0f, 0.989799976348877f, 49.08000183105469f, -8.723999977111816f))
// _0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.64f, 17.39f)
generalPath!!.lineTo(31.64f, 32.579998f)
generalPath!!.curveTo(31.64f, 33.639f, 30.817f, 34.477997f, 29.778f, 34.477997f)
generalPath!!.lineTo(16.068f, 34.477997f)
generalPath!!.curveTo(15.237f, 35.590996f, 13.564001f, 37.406f, 9.641001f, 38.887997f)
generalPath!!.curveTo(11.366001f, 36.822f, 11.468f, 35.428997f, 11.273001f, 34.477997f)
generalPath!!.lineTo(8.464001f, 34.477997f)
generalPath!!.curveTo(7.4250007f, 34.477997f, 6.5710006f, 33.638996f, 6.5710006f, 32.579998f)
generalPath!!.lineTo(6.5710006f, 17.39f)
generalPath!!.curveTo(6.5710006f, 16.331f, 7.4250007f, 15.459999f, 8.464001f, 15.459999f)
generalPath!!.lineTo(29.784f, 15.459999f)
generalPath!!.curveTo(30.823f, 15.459999f, 31.646f, 16.331f, 31.646f, 17.39f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(36.439998626708984, 19.989999771118164), Point2D.Double(49.08000183105469, 35.47999954223633), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(245, 245, 245, 255)) ?: Color(245, 245, 245, 255)),(colorFilter?.filter(Color(233, 233, 233, 255)) ?: Color(233, 233, 233, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-1.0080000162124634f, 0.0f, 0.0f, 0.9876000285148621f, 61.880001068115234f, 0.2750000059604645f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(120, 120, 120, 255)) ?: Color(120, 120, 120, 255)
stroke = BasicStroke(0.99f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.64f, 17.39f)
generalPath!!.lineTo(31.64f, 32.579998f)
generalPath!!.curveTo(31.64f, 33.639f, 30.817f, 34.477997f, 29.778f, 34.477997f)
generalPath!!.lineTo(16.068f, 34.477997f)
generalPath!!.curveTo(15.237f, 35.590996f, 13.564001f, 37.406f, 9.641001f, 38.887997f)
generalPath!!.curveTo(11.366001f, 36.822f, 11.468f, 35.428997f, 11.273001f, 34.477997f)
generalPath!!.lineTo(8.464001f, 34.477997f)
generalPath!!.curveTo(7.4250007f, 34.477997f, 6.5710006f, 33.638996f, 6.5710006f, 32.579998f)
generalPath!!.lineTo(6.5710006f, 17.39f)
generalPath!!.curveTo(6.5710006f, 16.331f, 7.4250007f, 15.459999f, 8.464001f, 15.459999f)
generalPath!!.lineTo(29.784f, 15.459999f)
generalPath!!.curveTo(30.823f, 15.459999f, 31.646f, 16.331f, 31.646f, 17.39f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2_0_1
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(0.99f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(30.62f, 17.88f)
generalPath!!.lineTo(30.62f, 32.079998f)
generalPath!!.curveTo(30.62f, 33.039997f, 30.378f, 33.447998f, 29.436f, 33.447998f)
generalPath!!.lineTo(15.536001f, 33.447998f)
generalPath!!.curveTo(14.783001f, 34.457996f, 13.468001f, 36.044f, 12.025002f, 36.698997f)
generalPath!!.curveTo(12.428001f, 35.531998f, 12.273002f, 34.562996f, 12.198002f, 33.447998f)
generalPath!!.lineTo(8.791002f, 33.447998f)
generalPath!!.curveTo(7.8490024f, 33.447998f, 7.5790024f, 33.039997f, 7.5790024f, 32.079998f)
generalPath!!.lineTo(7.5790024f, 17.999998f)
generalPath!!.curveTo(7.5790024f, 17.039999f, 7.8490024f, 16.451998f, 8.791002f, 16.451998f)
generalPath!!.lineTo(29.391003f, 16.451998f)
generalPath!!.curveTo(30.334003f, 16.451998f, 30.626003f, 16.912998f, 30.626003f, 17.873999f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.64f, 17.39f)
generalPath!!.lineTo(31.64f, 32.579998f)
generalPath!!.curveTo(31.64f, 33.639f, 30.817f, 34.477997f, 29.778f, 34.477997f)
generalPath!!.lineTo(16.068f, 34.477997f)
generalPath!!.curveTo(15.237f, 35.590996f, 13.564001f, 37.406f, 9.641001f, 38.887997f)
generalPath!!.curveTo(11.366001f, 36.822f, 11.468f, 35.428997f, 11.273001f, 34.477997f)
generalPath!!.lineTo(8.464001f, 34.477997f)
generalPath!!.curveTo(7.4250007f, 34.477997f, 6.5710006f, 33.638996f, 6.5710006f, 32.579998f)
generalPath!!.lineTo(6.5710006f, 17.39f)
generalPath!!.curveTo(6.5710006f, 16.331f, 7.4250007f, 15.459999f, 8.464001f, 15.459999f)
generalPath!!.lineTo(29.784f, 15.459999f)
generalPath!!.curveTo(30.823f, 15.459999f, 31.646f, 16.331f, 31.646f, 17.39f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(35.0, 10.960000038146973), Point2D.Double(27.270000457763672, 24.139999389648438), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(245, 245, 245, 255)) ?: Color(245, 245, 245, 255)),(colorFilter?.filter(Color(233, 233, 233, 255)) ?: Color(233, 233, 233, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-0.9771999716758728f, 0.0f, 0.0f, 0.9958999752998352f, 50.599998474121094f, 9.116000175476074f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(120, 120, 120, 255)) ?: Color(120, 120, 120, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.64f, 17.39f)
generalPath!!.lineTo(31.64f, 32.579998f)
generalPath!!.curveTo(31.64f, 33.639f, 30.817f, 34.477997f, 29.778f, 34.477997f)
generalPath!!.lineTo(16.068f, 34.477997f)
generalPath!!.curveTo(15.237f, 35.590996f, 13.564001f, 37.406f, 9.641001f, 38.887997f)
generalPath!!.curveTo(11.366001f, 36.822f, 11.468f, 35.428997f, 11.273001f, 34.477997f)
generalPath!!.lineTo(8.464001f, 34.477997f)
generalPath!!.curveTo(7.4250007f, 34.477997f, 6.5710006f, 33.638996f, 6.5710006f, 32.579998f)
generalPath!!.lineTo(6.5710006f, 17.39f)
generalPath!!.curveTo(6.5710006f, 16.331f, 7.4250007f, 15.459999f, 8.464001f, 15.459999f)
generalPath!!.lineTo(29.784f, 15.459999f)
generalPath!!.curveTo(30.823f, 15.459999f, 31.646f, 16.331f, 31.646f, 17.39f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3_0_1
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(30.62f, 17.88f)
generalPath!!.lineTo(30.62f, 32.079998f)
generalPath!!.curveTo(30.62f, 33.039997f, 30.378f, 33.447998f, 29.436f, 33.447998f)
generalPath!!.lineTo(15.536001f, 33.447998f)
generalPath!!.curveTo(14.783001f, 34.457996f, 13.468001f, 36.044f, 12.025002f, 36.698997f)
generalPath!!.curveTo(12.428001f, 35.531998f, 12.273002f, 34.562996f, 12.198002f, 33.447998f)
generalPath!!.lineTo(8.791002f, 33.447998f)
generalPath!!.curveTo(7.8490024f, 33.447998f, 7.5790024f, 33.039997f, 7.5790024f, 32.079998f)
generalPath!!.lineTo(7.5790024f, 17.999998f)
generalPath!!.curveTo(7.5790024f, 17.039999f, 7.8490024f, 16.451998f, 8.791002f, 16.451998f)
generalPath!!.lineTo(29.391003f, 16.451998f)
generalPath!!.curveTo(30.334003f, 16.451998f, 30.626003f, 16.912998f, 30.626003f, 17.873999f)
generalPath!!.closePath()
shape = generalPath
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
        fun of(width: Int, height: Int): RadianceIcon {
            return Internet_group_chat(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Internet_group_chat(width, height))
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

