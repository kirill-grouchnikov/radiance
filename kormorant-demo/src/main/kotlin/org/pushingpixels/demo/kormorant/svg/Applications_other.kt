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
class Applications_other(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.1863800287246704f, 0.0f, 0.0f, 1.1863800287246704f, -4.539687156677246f, -7.794678211212158f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(14.287617683410645, 68.87297058105469), 11.68987f, Point2D.Double(14.287617683410645, 72.56800079345703), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 83),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.399258017539978f, -2.2344450201217114E-7f, 8.196177958552653E-8f, 0.513264000415802f, 4.365074157714844f, 4.839284896850586f))
shape = GeneralPath()
shape.moveTo(44.285713, 38.714287)
shape.curveTo(44.31765, 42.239277, 40.526283, 45.503265, 34.347244, 47.27033)
shape.curveTo(28.168203, 49.037388, 20.546082, 49.037388, 14.367041, 47.27033)
shape.curveTo(8.188001, 45.503265, 4.396636, 42.239277, 4.4285717, 38.714287)
shape.curveTo(4.396636, 35.189297, 8.188001, 31.925306, 14.367041, 30.158247)
shape.curveTo(20.546082, 28.391186, 28.168203, 28.391186, 34.347244, 30.158247)
shape.curveTo(40.526283, 31.925306, 44.31765, 35.189297, 44.285713, 38.714287)
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
paint = RadialGradientPaint(Point2D.Double(24.28580093383789, 36.72077178955078), 20.410614f, Point2D.Double(24.28580093383789, 36.72077178955078), floatArrayOf(0.0f,1.0f), arrayOf(Color(252, 175, 62, 255),Color(211, 127, 3, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.7278729677200317f, -1.5237149729209637E-23f, 1.384133924351158E-23f, 1.7278729677200317f, -17.676979064941406f, -26.728050231933594f))
shape = GeneralPath()
shape.moveTo(24.2858, 43.196358)
shape.lineTo(4.3751874, 23.285744)
shape.lineTo(24.2858, 3.375129)
shape.lineTo(44.196415, 23.285744)
shape.lineTo(24.2858, 43.196358)
shape.lineTo(24.2858, 43.196358)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(245, 121, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(24.2858, 43.196358)
shape.lineTo(4.3751874, 23.285744)
shape.lineTo(24.2858, 3.375129)
shape.lineTo(44.196415, 23.285744)
shape.lineTo(24.2858, 43.196358)
shape.lineTo(24.2858, 43.196358)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_0
g.composite = AlphaComposite.getInstance(3, 0.5f * origAlpha)
val defaultTransform__0_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(39.439934, 19.376677)
shape.lineTo(38.70148, 20.400862)
shape.curveTo(38.06473, 20.132368, 37.400864, 19.915792, 36.715298, 19.755976)
shape.lineTo(36.72111, 18.179117)
shape.curveTo(36.293385, 18.090782, 35.8581, 18.022982, 35.417007, 17.974747)
shape.lineTo(34.93523, 19.476637)
shape.curveTo(34.59119, 19.448158, 34.24347, 19.432468, 33.891872, 19.432468)
shape.curveTo(33.54066, 19.432468, 33.192745, 19.447966, 32.848705, 19.476637)
shape.lineTo(32.36693, 17.974747)
shape.curveTo(31.925642, 18.022982, 31.490555, 18.090782, 31.062826, 18.179117)
shape.lineTo(31.06883, 19.756168)
shape.curveTo(30.383074, 19.915792, 29.719398, 20.132368, 29.08265, 20.400862)
shape.lineTo(28.16017, 19.121359)
shape.curveTo(27.757816, 19.303453, 27.365927, 19.50395, 26.985273, 19.721882)
shape.lineTo(27.47809, 21.219896)
shape.curveTo(26.880861, 21.582148, 26.316368, 21.993216, 25.79062, 22.447868)
shape.lineTo(24.518478, 21.51609)
shape.curveTo(24.19284, 21.812672, 23.88115, 22.124363, 23.584763, 22.45)
shape.lineTo(24.516348, 23.721947)
shape.curveTo(24.0615, 24.247696, 23.650433, 24.811995, 23.288181, 25.409613)
shape.lineTo(21.790167, 24.916601)
shape.curveTo(21.572235, 25.29745, 21.371544, 25.689533, 21.189838, 26.091688)
shape.lineTo(22.469147, 27.013975)
shape.curveTo(22.200653, 27.650724, 21.984077, 28.314594, 21.824066, 29.000353)
shape.lineTo(20.247404, 28.994541)
shape.curveTo(20.15907, 29.422268, 20.091267, 29.857552, 20.043226, 30.29884)
shape.lineTo(21.544922, 30.780613)
shape.curveTo(21.516056, 31.12446, 21.500753, 31.472378, 21.500753, 31.82378)
shape.curveTo(21.500753, 32.175182, 21.516445, 32.522903, 21.544922, 32.86714)
shape.lineTo(20.043226, 33.348915)
shape.curveTo(20.091072, 33.79001, 20.159264, 34.225098, 20.24721, 34.65302)
shape.lineTo(21.82426, 34.647015)
shape.curveTo(21.984077, 35.33277, 22.200653, 35.99664, 22.468952, 36.633194)
shape.lineTo(21.189644, 37.555485)
shape.curveTo(21.371351, 37.957836, 21.572235, 38.349724, 21.78978, 38.73057)
shape.lineTo(23.287989, 38.23756)
shape.curveTo(23.65024, 38.834988, 24.061308, 39.399284, 24.51596, 39.92484)
shape.lineTo(23.584375, 41.19698)
shape.curveTo(23.862747, 41.50286, 24.155453, 41.794987, 24.459784, 42.0751)
shape.lineTo(43.29878, 23.23591)
shape.lineTo(42.291836, 22.22897)
shape.lineTo(41.993122, 22.447676)
shape.curveTo(41.467377, 21.993023, 40.903076, 21.581953, 40.305653, 21.219704)
shape.lineTo(40.547607, 20.484547)
shape.lineTo(39.439545, 19.376484)
shape.lineTo(39.439934, 19.376677)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_1
g.composite = AlphaComposite.getInstance(3, 0.5f * origAlpha)
val defaultTransform__0_1_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(19.916729, 14.330733)
shape.curveTo(19.916729, 20.815414, 15.682846, 26.310202, 9.82949, 28.204756)
shape.lineTo(12.056461, 30.431923)
shape.curveTo(12.073315, 30.424948, 12.09036, 30.418943, 12.10702, 30.411776)
shape.lineTo(12.288533, 30.663609)
shape.lineTo(13.700537, 32.07561)
shape.curveTo(14.163716, 31.856712, 14.617207, 31.621153, 15.059852, 31.367964)
shape.lineTo(14.365763, 29.258772)
shape.curveTo(15.207077, 28.749102, 16.00151, 28.17008, 16.74151, 27.530039)
shape.lineTo(18.53262, 28.841698)
shape.curveTo(18.99134, 28.424238, 19.429916, 27.985662, 19.847183, 27.527134)
shape.lineTo(18.535719, 25.73622)
shape.curveTo(19.17576, 24.996023, 19.754587, 24.201591, 20.26445, 23.360472)
shape.lineTo(22.373837, 24.05456)
shape.curveTo(22.68049, 23.518156, 22.96293, 22.966255, 23.21883, 22.399828)
shape.lineTo(21.417648, 21.101536)
shape.curveTo(21.795591, 20.205206, 22.1005, 19.270521, 22.325407, 18.305035)
shape.lineTo(24.545406, 18.313559)
shape.curveTo(24.669579, 17.711292, 24.765274, 17.09837, 24.832882, 16.477507)
shape.lineTo(22.718458, 15.799109)
shape.curveTo(22.758753, 15.314816, 22.78045, 14.825099, 22.78045, 14.330539)
shape.curveTo(22.78045, 13.835786, 22.758753, 13.346069, 22.718458, 12.861776)
shape.lineTo(24.832882, 12.18396)
shape.curveTo(24.765274, 11.562709, 24.669579, 10.949981, 24.545212, 10.347714)
shape.lineTo(22.325407, 10.356044)
shape.curveTo(22.1005, 9.390556, 21.795591, 8.455872, 21.417648, 7.559541)
shape.lineTo(23.21883, 6.2610555)
shape.curveTo(23.076448, 5.946265, 22.924961, 5.636124, 22.766695, 5.330632)
shape.lineTo(18.962671, 9.134269)
shape.curveTo(19.578691, 10.748514, 19.916922, 12.500106, 19.916922, 14.330539)
shape.lineTo(19.916729, 14.330733)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_2
g.composite = AlphaComposite.getInstance(3, 0.47252747f * origAlpha)
val defaultTransform__0_1_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_3
paint = LinearGradientPaint(Point2D.Double(26.50260353088379, 10.027483940124512), Point2D.Double(28.786495208740234, 52.80744552612305), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(24.285791, 41.605354)
shape.lineTo(5.9661765, 23.285736)
shape.lineTo(24.285791, 4.966119)
shape.lineTo(42.605408, 23.285736)
shape.lineTo(24.285791, 41.605354)
shape.lineTo(24.285791, 41.605354)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_3
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
            return 0.676393985748291
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 2.8262746334075928
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
            return 45.17372512817383
        }

        /**
         * Returns an instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Applications_other(width, height))
        }

        /**
         * Returns a [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Applications_other(width, height))
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

    override fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
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

