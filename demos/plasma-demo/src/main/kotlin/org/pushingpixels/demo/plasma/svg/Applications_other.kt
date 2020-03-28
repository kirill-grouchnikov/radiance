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
class Applications_other private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.1863800287246704f, 0.0f, 0.0f, 1.1863800287246704f, -4.539687156677246f, -7.794678211212158f))
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(44.285713f, 38.714287f)
generalPath!!.curveTo(44.31765f, 42.239277f, 40.526283f, 45.503265f, 34.347244f, 47.27033f)
generalPath!!.curveTo(28.168203f, 49.037388f, 20.546082f, 49.037388f, 14.367041f, 47.27033f)
generalPath!!.curveTo(8.188001f, 45.503265f, 4.396636f, 42.239277f, 4.4285717f, 38.714287f)
generalPath!!.curveTo(4.396636f, 35.189297f, 8.188001f, 31.925306f, 14.367041f, 30.158247f)
generalPath!!.curveTo(20.546082f, 28.391186f, 28.168203f, 28.391186f, 34.347244f, 30.158247f)
generalPath!!.curveTo(40.526283f, 31.925306f, 44.31765f, 35.189297f, 44.285713f, 38.714287f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(14.287617683410645, 68.87297058105469), 11.68987f, Point2D.Double(14.287617683410645, 72.56800079345703), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 83),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.399258017539978f, -2.2344450201217114E-7f, 8.196177958552653E-8f, 0.513264000415802f, 4.365074157714844f, 4.839284896850586f))
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
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(24.2858f, 43.196358f)
generalPath!!.lineTo(4.3751874f, 23.285744f)
generalPath!!.lineTo(24.2858f, 3.375129f)
generalPath!!.lineTo(44.196415f, 23.285744f)
generalPath!!.lineTo(24.2858f, 43.196358f)
generalPath!!.lineTo(24.2858f, 43.196358f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(24.28580093383789, 36.72077178955078), 20.410614f, Point2D.Double(24.28580093383789, 36.72077178955078), floatArrayOf(0.0f,1.0f), arrayOf(Color(252, 175, 62, 255),Color(211, 127, 3, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.7278729677200317f, -1.5237149729209637E-23f, 1.384133924351158E-23f, 1.7278729677200317f, -17.676979064941406f, -26.728050231933594f))
g.paint = paint
g.fill(shape)
paint = Color(245, 121, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(24.2858f, 43.196358f)
generalPath!!.lineTo(4.3751874f, 23.285744f)
generalPath!!.lineTo(24.2858f, 3.375129f)
generalPath!!.lineTo(44.196415f, 23.285744f)
generalPath!!.lineTo(24.2858f, 43.196358f)
generalPath!!.lineTo(24.2858f, 43.196358f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.5f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.439934f, 19.376677f)
generalPath!!.lineTo(38.70148f, 20.400862f)
generalPath!!.curveTo(38.06473f, 20.132368f, 37.400864f, 19.915792f, 36.715298f, 19.755976f)
generalPath!!.lineTo(36.72111f, 18.179117f)
generalPath!!.curveTo(36.293385f, 18.090782f, 35.8581f, 18.022982f, 35.417007f, 17.974747f)
generalPath!!.lineTo(34.93523f, 19.476637f)
generalPath!!.curveTo(34.59119f, 19.448158f, 34.24347f, 19.432468f, 33.891872f, 19.432468f)
generalPath!!.curveTo(33.54066f, 19.432468f, 33.192745f, 19.447966f, 32.848705f, 19.476637f)
generalPath!!.lineTo(32.36693f, 17.974747f)
generalPath!!.curveTo(31.925642f, 18.022982f, 31.490555f, 18.090782f, 31.062826f, 18.179117f)
generalPath!!.lineTo(31.06883f, 19.756168f)
generalPath!!.curveTo(30.383074f, 19.915792f, 29.719398f, 20.132368f, 29.08265f, 20.400862f)
generalPath!!.lineTo(28.16017f, 19.121359f)
generalPath!!.curveTo(27.757816f, 19.303453f, 27.365927f, 19.50395f, 26.985273f, 19.721882f)
generalPath!!.lineTo(27.47809f, 21.219896f)
generalPath!!.curveTo(26.880861f, 21.582148f, 26.316368f, 21.993216f, 25.79062f, 22.447868f)
generalPath!!.lineTo(24.518478f, 21.51609f)
generalPath!!.curveTo(24.19284f, 21.812672f, 23.88115f, 22.124363f, 23.584763f, 22.45f)
generalPath!!.lineTo(24.516348f, 23.721947f)
generalPath!!.curveTo(24.0615f, 24.247696f, 23.650433f, 24.811995f, 23.288181f, 25.409613f)
generalPath!!.lineTo(21.790167f, 24.916601f)
generalPath!!.curveTo(21.572235f, 25.29745f, 21.371544f, 25.689533f, 21.189838f, 26.091688f)
generalPath!!.lineTo(22.469147f, 27.013975f)
generalPath!!.curveTo(22.200653f, 27.650724f, 21.984077f, 28.314594f, 21.824066f, 29.000353f)
generalPath!!.lineTo(20.247404f, 28.994541f)
generalPath!!.curveTo(20.15907f, 29.422268f, 20.091267f, 29.857552f, 20.043226f, 30.29884f)
generalPath!!.lineTo(21.544922f, 30.780613f)
generalPath!!.curveTo(21.516056f, 31.12446f, 21.500753f, 31.472378f, 21.500753f, 31.82378f)
generalPath!!.curveTo(21.500753f, 32.175182f, 21.516445f, 32.522903f, 21.544922f, 32.86714f)
generalPath!!.lineTo(20.043226f, 33.348915f)
generalPath!!.curveTo(20.091072f, 33.79001f, 20.159264f, 34.225098f, 20.24721f, 34.65302f)
generalPath!!.lineTo(21.82426f, 34.647015f)
generalPath!!.curveTo(21.984077f, 35.33277f, 22.200653f, 35.99664f, 22.468952f, 36.633194f)
generalPath!!.lineTo(21.189644f, 37.555485f)
generalPath!!.curveTo(21.371351f, 37.957836f, 21.572235f, 38.349724f, 21.78978f, 38.73057f)
generalPath!!.lineTo(23.287989f, 38.23756f)
generalPath!!.curveTo(23.65024f, 38.834988f, 24.061308f, 39.399284f, 24.51596f, 39.92484f)
generalPath!!.lineTo(23.584375f, 41.19698f)
generalPath!!.curveTo(23.862747f, 41.50286f, 24.155453f, 41.794987f, 24.459784f, 42.0751f)
generalPath!!.lineTo(43.29878f, 23.23591f)
generalPath!!.lineTo(42.291836f, 22.22897f)
generalPath!!.lineTo(41.993122f, 22.447676f)
generalPath!!.curveTo(41.467377f, 21.993023f, 40.903076f, 21.581953f, 40.305653f, 21.219704f)
generalPath!!.lineTo(40.547607f, 20.484547f)
generalPath!!.lineTo(39.439545f, 19.376484f)
generalPath!!.lineTo(39.439934f, 19.376677f)
generalPath!!.closePath()
shape = generalPath
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.5f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.916729f, 14.330733f)
generalPath!!.curveTo(19.916729f, 20.815414f, 15.682846f, 26.310202f, 9.82949f, 28.204756f)
generalPath!!.lineTo(12.056461f, 30.431923f)
generalPath!!.curveTo(12.073315f, 30.424948f, 12.09036f, 30.418943f, 12.10702f, 30.411776f)
generalPath!!.lineTo(12.288533f, 30.663609f)
generalPath!!.lineTo(13.700537f, 32.07561f)
generalPath!!.curveTo(14.163716f, 31.856712f, 14.617207f, 31.621153f, 15.059852f, 31.367964f)
generalPath!!.lineTo(14.365763f, 29.258772f)
generalPath!!.curveTo(15.207077f, 28.749102f, 16.00151f, 28.17008f, 16.74151f, 27.530039f)
generalPath!!.lineTo(18.53262f, 28.841698f)
generalPath!!.curveTo(18.99134f, 28.424238f, 19.429916f, 27.985662f, 19.847183f, 27.527134f)
generalPath!!.lineTo(18.535719f, 25.73622f)
generalPath!!.curveTo(19.17576f, 24.996023f, 19.754587f, 24.201591f, 20.26445f, 23.360472f)
generalPath!!.lineTo(22.373837f, 24.05456f)
generalPath!!.curveTo(22.68049f, 23.518156f, 22.96293f, 22.966255f, 23.21883f, 22.399828f)
generalPath!!.lineTo(21.417648f, 21.101536f)
generalPath!!.curveTo(21.795591f, 20.205206f, 22.1005f, 19.270521f, 22.325407f, 18.305035f)
generalPath!!.lineTo(24.545406f, 18.313559f)
generalPath!!.curveTo(24.669579f, 17.711292f, 24.765274f, 17.09837f, 24.832882f, 16.477507f)
generalPath!!.lineTo(22.718458f, 15.799109f)
generalPath!!.curveTo(22.758753f, 15.314816f, 22.78045f, 14.825099f, 22.78045f, 14.330539f)
generalPath!!.curveTo(22.78045f, 13.835786f, 22.758753f, 13.346069f, 22.718458f, 12.861776f)
generalPath!!.lineTo(24.832882f, 12.18396f)
generalPath!!.curveTo(24.765274f, 11.562709f, 24.669579f, 10.949981f, 24.545212f, 10.347714f)
generalPath!!.lineTo(22.325407f, 10.356044f)
generalPath!!.curveTo(22.1005f, 9.390556f, 21.795591f, 8.455872f, 21.417648f, 7.559541f)
generalPath!!.lineTo(23.21883f, 6.2610555f)
generalPath!!.curveTo(23.076448f, 5.946265f, 22.924961f, 5.636124f, 22.766695f, 5.330632f)
generalPath!!.lineTo(18.962671f, 9.134269f)
generalPath!!.curveTo(19.578691f, 10.748514f, 19.916922f, 12.500106f, 19.916922f, 14.330539f)
generalPath!!.lineTo(19.916729f, 14.330733f)
generalPath!!.closePath()
shape = generalPath
paint = Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.47252747f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_3
paint = LinearGradientPaint(Point2D.Double(26.50260353088379, 10.027483940124512), Point2D.Double(28.786495208740234, 52.80744552612305), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(24.285791f, 41.605354f)
generalPath!!.lineTo(5.9661765f, 23.285736f)
generalPath!!.lineTo(24.285791f, 4.966119f)
generalPath!!.lineTo(42.605408f, 23.285736f)
generalPath!!.lineTo(24.285791f, 41.605354f)
generalPath!!.lineTo(24.285791f, 41.605354f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
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
            return 0.676393985748291
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 2.8263134956359863
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 47.323604583740234
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 45.17368698120117
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Applications_other(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Applications_other(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Applications_other(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

