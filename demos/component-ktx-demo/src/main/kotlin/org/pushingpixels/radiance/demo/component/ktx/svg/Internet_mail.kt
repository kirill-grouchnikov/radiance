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
class Internet_mail private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 0.4557f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.8006000518798828f, 0.0f, 0.0f, 1.9747999906539917f, 1.083899974822998f, -38.01300048828125f))
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(26.5f, 38.7f)
generalPath!!.curveTo(26.522034f, 40.061657f, 23.90613f, 41.322495f, 19.642813f, 42.00509f)
generalPath!!.curveTo(15.379496f, 42.68768f, 10.120504f, 42.68768f, 5.8571877f, 42.00509f)
generalPath!!.curveTo(1.5938711f, 41.322495f, -1.0220345f, 40.061657f, -1.0f, 38.7f)
generalPath!!.curveTo(-1.0220345f, 37.338345f, 1.5938711f, 36.077507f, 5.8571877f, 35.394913f)
generalPath!!.curveTo(10.120504f, 34.712322f, 15.379496f, 34.712322f, 19.642813f, 35.394913f)
generalPath!!.curveTo(23.90613f, 36.077507f, 26.522034f, 37.338345f, 26.5f, 38.7f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(6.702700138092041, 73.61599731445312), 7.2284f, Point2D.Double(6.702700138092041, 73.61599731445312), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.9021999835968018f, 0.0f, 0.0f, 0.5256999731063843f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.3334f, 16.972f)
generalPath!!.lineTo(6.3334f, 41.482002f)
generalPath!!.lineTo(43.3064f, 41.482002f)
generalPath!!.lineTo(43.2444f, 17.090002f)
generalPath!!.curveTo(43.2414f, 15.712002f, 31.3964f, 2.4120016f, 29.2114f, 2.4120016f)
generalPath!!.lineTo(20.659399f, 2.4121015f)
generalPath!!.curveTo(18.3624f, 2.4121015f, 6.333399f, 15.674102f, 6.333399f, 16.972101f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(11.572999954223633, 4.746200084686279), Point2D.Double(18.475000381469727, 26.023000717163086), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(226, 226, 226, 255)) ?: Color(226, 226, 226, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.343500018119812f, 0.0f, 0.0f, 1.4178999662399292f, 2.879499912261963f, 0.31459999084472656f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(2.0618999004364014, 15.256999969482422), Point2D.Double(30.600000381469727, 15.256999969482422), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(152, 150, 144, 255)) ?: Color(152, 150, 144, 255)),(colorFilter?.filter(Color(101, 100, 96, 255)) ?: Color(101, 100, 96, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.343500018119812f, 0.0f, 0.0f, 1.4178999662399292f, 2.879499912261963f, 0.31459999084472656f))
stroke = BasicStroke(0.8566f,0,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.3334f, 16.972f)
generalPath!!.lineTo(6.3334f, 41.482002f)
generalPath!!.lineTo(43.3064f, 41.482002f)
generalPath!!.lineTo(43.2444f, 17.090002f)
generalPath!!.curveTo(43.2414f, 15.712002f, 31.3964f, 2.4120016f, 29.2114f, 2.4120016f)
generalPath!!.lineTo(20.659399f, 2.4121015f)
generalPath!!.curveTo(18.3624f, 2.4121015f, 6.333399f, 15.674102f, 6.333399f, 16.972101f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.9231f, 16.787f)
generalPath!!.curveTo(6.525f, 16.357f, 18.8101f, 3.0930004f, 20.6671f, 3.0930004f)
generalPath!!.lineTo(29.043102f, 3.0935004f)
generalPath!!.curveTo(30.790102f, 3.0935004f, 43.0801f, 16.2215f, 42.4701f, 16.9795f)
generalPath!!.lineTo(31.6091f, 30.474499f)
generalPath!!.lineTo(19.295101f, 30.156498f)
generalPath!!.lineTo(6.9231014f, 16.786499f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(5.826600074768066, 7.231100082397461), Point2D.Double(13.467000007629395, 17.87700080871582), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(237, 237, 237, 255)) ?: Color(237, 237, 237, 255)),(colorFilter?.filter(Color(200, 200, 200, 255)) ?: Color(200, 200, 200, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.5706000328063965f, 0.0f, 0.0f, 1.190999984741211f, 2.879499912261963f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.078f, 30.018f)
generalPath!!.lineTo(11.744999f, 21.272f)
generalPath!!.lineTo(36.563f, 14.3359995f)
generalPath!!.lineTo(39.592f, 20.552f)
generalPath!!.lineTo(32.176f, 29.992f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 37)) ?: Color(0, 0, 0, 37)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.292f, 29.836f)
generalPath!!.lineTo(10.809f, 21.026001f)
generalPath!!.lineTo(35.457f, 14.133001f)
generalPath!!.lineTo(38.631f, 20.404001f)
generalPath!!.lineTo(31.39f, 29.811f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 37)) ?: Color(0, 0, 0, 37)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.775f, 29.957f)
generalPath!!.lineTo(11.099999f, 21.297f)
generalPath!!.lineTo(36.068f, 14.232f)
generalPath!!.lineTo(39.354f, 20.825f)
generalPath!!.lineTo(31.874f, 29.932001f)
shape = generalPath
paint = colorFilter?.filter(Color(0, 0, 0, 37)) ?: Color(0, 0, 0, 37)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.594f, 30.441f)
generalPath!!.lineTo(11.261f, 21.695f)
generalPath!!.lineTo(35.973f, 14.801f)
generalPath!!.lineTo(39.083f, 21.189f)
generalPath!!.lineTo(31.963001f, 30.175f)
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(10.184000015258789, 15.14799976348877), Point2D.Double(15.310999870300293, 29.569000244140625), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(220, 220, 220, 255)) ?: Color(220, 220, 220, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.8193000555038452f, 0.0f, 0.0f, 1.0282000303268433f, 2.879499912261963f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.488f, 29.064f)
generalPath!!.lineTo(7.092001f, 40.036f)
generalPath!!.lineTo(21.001001f, 30.432f)
generalPath!!.lineTo(30.019001f, 30.432f)
generalPath!!.lineTo(42.439003f, 39.914f)
generalPath!!.lineTo(30.575003f, 29.064001f)
generalPath!!.lineTo(20.488003f, 29.064001f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.915599822998047, 37.196998596191406), Point2D.Double(9.885499954223633, 52.090999603271484), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(154, 162, 154, 255)) ?: Color(154, 162, 154, 255)),(colorFilter?.filter(Color(181, 190, 181, 255)) ?: Color(181, 190, 181, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.4547998905181885f, 0.0f, 0.0f, 0.7620000243186951f, 2.879499912261963f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_8
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.9635f, 16.885f)
generalPath!!.lineTo(18.4795f, 31.201f)
generalPath!!.lineTo(19.5475f, 30.347f)
generalPath!!.lineTo(6.963501f, 16.885f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.915599822998047, 37.196998596191406), Point2D.Double(9.885499954223633, 52.090999603271484), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(154, 162, 154, 255)) ?: Color(154, 162, 154, 255)),(colorFilter?.filter(Color(181, 190, 181, 255)) ?: Color(181, 190, 181, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.4547998905181885f, 0.0f, 0.0f, 0.7620000243186951f, 2.879499912261963f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_9
paint = LinearGradientPaint(Point2D.Double(11.232999801635742, 13.685999870300293), Point2D.Double(21.11199951171875, 24.132999420166016), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(237, 237, 237, 255)) ?: Color(237, 237, 237, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.37090003490448f, 0.0f, 0.0f, 1.4437999725341797f, 2.4310998916625977f, -0.14079000055789948f))
stroke = BasicStroke(0.8566f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.3077f, 17.131f)
generalPath!!.lineTo(7.3389f, 40.342003f)
generalPath!!.lineTo(42.2839f, 40.342003f)
generalPath!!.lineTo(42.2209f, 17.258003f)
generalPath!!.curveTo(42.218903f, 16.508003f, 31.004902f, 3.4590034f, 28.836903f, 3.4590034f)
generalPath!!.lineTo(20.941902f, 3.4592035f)
generalPath!!.curveTo(18.688902f, 3.4592035f, 7.306902f, 16.351204f, 7.3079023f, 17.131203f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_10
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.957f, 30.453f)
generalPath!!.lineTo(9.016001f, 38.724f)
generalPath!!.lineTo(11.235001f, 38.73f)
generalPath!!.lineTo(21.233002f, 31.861f)
generalPath!!.lineTo(30.055f, 30.438f)
generalPath!!.lineTo(20.957f, 30.453f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_11
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.428f, 21.67f)
generalPath!!.lineTo(12.752001f, 23.081f)
generalPath!!.lineTo(35.543f, 16.196999f)
generalPath!!.lineTo(38.458f, 21.878998f)
generalPath!!.lineTo(39.072f, 21.166998f)
generalPath!!.lineTo(36.003f, 14.788998f)
generalPath!!.lineTo(11.427998f, 21.669998f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_12
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(13.308f, 23.636f)
generalPath!!.lineTo(19.334f, 30.09f)
generalPath!!.lineTo(20.531f, 29.064f)
generalPath!!.lineTo(30.618f, 29.106998f)
generalPath!!.lineTo(31.43f, 29.833998f)
generalPath!!.lineTo(35.405f, 25.089998f)
generalPath!!.curveTo(34.251f, 23.678999f, 13.307999f, 23.635998f, 13.307999f, 23.635998f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.780400276184082, 37.78499984741211), Point2D.Double(9.761899948120117, 32.202999114990234), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 33)) ?: Color(0, 0, 0, 33)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.39490008354187f, 0.0f, 0.0f, 0.781059980392456f, 2.879499912261963f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
// _0_0_13
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(41.813f, 17.848f)
generalPath!!.lineTo(31.861f, 30.479f)
generalPath!!.lineTo(30.793f, 29.624f)
generalPath!!.lineTo(41.813f, 17.848f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(177, 177, 177, 255)) ?: Color(177, 177, 177, 255)
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
            return 0.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 1.9837015867233276
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 48.0
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.30292510986328
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Internet_mail(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Internet_mail(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Internet_mail(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

