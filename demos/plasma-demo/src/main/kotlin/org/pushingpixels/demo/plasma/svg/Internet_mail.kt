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
class Internet_mail private constructor(private var width: Int, private var height: Int)
       : ResizableIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
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
g.composite = AlphaComposite.getInstance(3, 0.4557f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.8006000518798828f, 0.0f, 0.0f, 1.9747999906539917f, 1.083899974822998f, -38.01300048828125f))
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(26.5, 38.7)
generalPath!!.curveTo(26.522034, 40.061657, 23.90613, 41.322495, 19.642813, 42.00509)
generalPath!!.curveTo(15.379496, 42.68768, 10.120504, 42.68768, 5.8571877, 42.00509)
generalPath!!.curveTo(1.5938711, 41.322495, -1.0220345, 40.061657, -1.0, 38.7)
generalPath!!.curveTo(-1.0220345, 37.338345, 1.5938711, 36.077507, 5.8571877, 35.394913)
generalPath!!.curveTo(10.120504, 34.712322, 15.379496, 34.712322, 19.642813, 35.394913)
generalPath!!.curveTo(23.90613, 36.077507, 26.522034, 37.338345, 26.5, 38.7)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(6.702700138092041, 73.61599731445312), 7.2284f, Point2D.Double(6.702700138092041, 73.61599731445312), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.9021999835968018f, 0.0f, 0.0f, 0.5256999731063843f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.3334, 16.972)
generalPath!!.lineTo(6.3334, 41.482002)
generalPath!!.lineTo(43.3064, 41.482002)
generalPath!!.lineTo(43.2444, 17.090002)
generalPath!!.curveTo(43.2414, 15.712002, 31.3964, 2.4120016, 29.2114, 2.4120016)
generalPath!!.lineTo(20.659399, 2.4121015)
generalPath!!.curveTo(18.3624, 2.4121015, 6.333399, 15.674102, 6.333399, 16.972101)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(11.572999954223633, 4.746200084686279), Point2D.Double(18.475000381469727, 26.023000717163086), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(226, 226, 226, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.343500018119812f, 0.0f, 0.0f, 1.4178999662399292f, 2.879499912261963f, 0.31459999084472656f))
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(2.0618999004364014, 15.256999969482422), Point2D.Double(30.600000381469727, 15.256999969482422), floatArrayOf(0.0f,1.0f), arrayOf(Color(152, 150, 144, 255),Color(101, 100, 96, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.343500018119812f, 0.0f, 0.0f, 1.4178999662399292f, 2.879499912261963f, 0.31459999084472656f))
stroke = BasicStroke(0.8566f,0,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.3334, 16.972)
generalPath!!.lineTo(6.3334, 41.482002)
generalPath!!.lineTo(43.3064, 41.482002)
generalPath!!.lineTo(43.2444, 17.090002)
generalPath!!.curveTo(43.2414, 15.712002, 31.3964, 2.4120016, 29.2114, 2.4120016)
generalPath!!.lineTo(20.659399, 2.4121015)
generalPath!!.curveTo(18.3624, 2.4121015, 6.333399, 15.674102, 6.333399, 16.972101)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.9231, 16.787)
generalPath!!.curveTo(6.525, 16.357, 18.8101, 3.0930004, 20.6671, 3.0930004)
generalPath!!.lineTo(29.043102, 3.0935004)
generalPath!!.curveTo(30.790102, 3.0935004, 43.0801, 16.2215, 42.4701, 16.9795)
generalPath!!.lineTo(31.6091, 30.474499)
generalPath!!.lineTo(19.295101, 30.156498)
generalPath!!.lineTo(6.9231014, 16.786499)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(5.826600074768066, 7.231100082397461), Point2D.Double(13.467000007629395, 17.87700080871582), floatArrayOf(0.0f,1.0f), arrayOf(Color(237, 237, 237, 255),Color(200, 200, 200, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.5706000328063965f, 0.0f, 0.0f, 1.190999984741211f, 2.879499912261963f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.078, 30.018)
generalPath!!.lineTo(11.744999, 21.272)
generalPath!!.lineTo(36.563, 14.3359995)
generalPath!!.lineTo(39.592, 20.552)
generalPath!!.lineTo(32.176, 29.992)
shape = generalPath
paint = Color(0, 0, 0, 37)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.292, 29.836)
generalPath!!.lineTo(10.809, 21.026001)
generalPath!!.lineTo(35.457, 14.133001)
generalPath!!.lineTo(38.631, 20.404001)
generalPath!!.lineTo(31.39, 29.811)
shape = generalPath
paint = Color(0, 0, 0, 37)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.775, 29.957)
generalPath!!.lineTo(11.099999, 21.297)
generalPath!!.lineTo(36.068, 14.232)
generalPath!!.lineTo(39.354, 20.825)
generalPath!!.lineTo(31.874, 29.932001)
shape = generalPath
paint = Color(0, 0, 0, 37)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.594, 30.441)
generalPath!!.lineTo(11.261, 21.695)
generalPath!!.lineTo(35.973, 14.801)
generalPath!!.lineTo(39.083, 21.189)
generalPath!!.lineTo(31.963001, 30.175)
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(10.184000015258789, 15.14799976348877), Point2D.Double(15.310999870300293, 29.569000244140625), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(220, 220, 220, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.8193000555038452f, 0.0f, 0.0f, 1.0282000303268433f, 2.879499912261963f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.488, 29.064)
generalPath!!.lineTo(7.092001, 40.036)
generalPath!!.lineTo(21.001001, 30.432)
generalPath!!.lineTo(30.019001, 30.432)
generalPath!!.lineTo(42.439003, 39.914)
generalPath!!.lineTo(30.575003, 29.064001)
generalPath!!.lineTo(20.488003, 29.064001)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.915599822998047, 37.196998596191406), Point2D.Double(9.885499954223633, 52.090999603271484), floatArrayOf(0.0f,1.0f), arrayOf(Color(154, 162, 154, 255),Color(181, 190, 181, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.4547998905181885f, 0.0f, 0.0f, 0.7620000243186951f, 2.879499912261963f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.9635, 16.885)
generalPath!!.lineTo(18.4795, 31.201)
generalPath!!.lineTo(19.5475, 30.347)
generalPath!!.lineTo(6.963501, 16.885)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.915599822998047, 37.196998596191406), Point2D.Double(9.885499954223633, 52.090999603271484), floatArrayOf(0.0f,1.0f), arrayOf(Color(154, 162, 154, 255),Color(181, 190, 181, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.4547998905181885f, 0.0f, 0.0f, 0.7620000243186951f, 2.879499912261963f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_9
paint = LinearGradientPaint(Point2D.Double(11.232999801635742, 13.685999870300293), Point2D.Double(21.11199951171875, 24.132999420166016), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(237, 237, 237, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.37090003490448f, 0.0f, 0.0f, 1.4437999725341797f, 2.4310998916625977f, -0.14079000055789948f))
stroke = BasicStroke(0.8566f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.3077, 17.131)
generalPath!!.lineTo(7.3389, 40.342003)
generalPath!!.lineTo(42.2839, 40.342003)
generalPath!!.lineTo(42.2209, 17.258003)
generalPath!!.curveTo(42.218903, 16.508003, 31.004902, 3.4590034, 28.836903, 3.4590034)
generalPath!!.lineTo(20.941902, 3.4592035)
generalPath!!.curveTo(18.688902, 3.4592035, 7.306902, 16.351204, 7.3079023, 17.131203)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.957, 30.453)
generalPath!!.lineTo(9.016001, 38.724)
generalPath!!.lineTo(11.235001, 38.73)
generalPath!!.lineTo(21.233002, 31.861)
generalPath!!.lineTo(30.055, 30.438)
generalPath!!.lineTo(20.957, 30.453)
generalPath!!.closePath()
shape = generalPath
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.428, 21.67)
generalPath!!.lineTo(12.752001, 23.081)
generalPath!!.lineTo(35.543, 16.196999)
generalPath!!.lineTo(38.458, 21.878998)
generalPath!!.lineTo(39.072, 21.166998)
generalPath!!.lineTo(36.003, 14.788998)
generalPath!!.lineTo(11.427998, 21.669998)
generalPath!!.closePath()
shape = generalPath
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(13.308, 23.636)
generalPath!!.lineTo(19.334, 30.09)
generalPath!!.lineTo(20.531, 29.064)
generalPath!!.lineTo(30.618, 29.106998)
generalPath!!.lineTo(31.43, 29.833998)
generalPath!!.lineTo(35.405, 25.089998)
generalPath!!.curveTo(34.251, 23.678999, 13.307999, 23.635998, 13.307999, 23.635998)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(8.780400276184082, 37.78499984741211), Point2D.Double(9.761899948120117, 32.202999114990234), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 33),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.39490008354187f, 0.0f, 0.0f, 0.781059980392456f, 2.879499912261963f, 0.34299999475479126f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(41.813, 17.848)
generalPath!!.lineTo(31.861, 30.479)
generalPath!!.lineTo(30.793, 29.624)
generalPath!!.lineTo(41.813, 17.848)
generalPath!!.closePath()
shape = generalPath
paint = Color(177, 177, 177, 255)
g.paint = paint
g.fill(shape)
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
        fun of(width: Int, height: Int): ResizableIcon {
            return Internet_mail(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Internet_mail(width, height))
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

