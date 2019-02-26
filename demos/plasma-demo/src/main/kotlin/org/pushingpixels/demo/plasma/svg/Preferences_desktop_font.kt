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
class Preferences_desktop_font private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 0.4064171f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(2.4600489139556885f, 0.0f, 0.0f, 2.4600489139556885f, -49.40945816040039f, -67.96373748779297f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(30.203561782836914, 44.56548309326172), 6.5659914f, Point2D.Double(30.203561782836914, 44.56548309326172), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.3384619951248169f, -1.4354759471951642E-15f, 29.481779098510742f))
shape = GeneralPath()
shape.moveTo(36.769554, 44.565483)
shape.curveTo(36.780075, 45.361816, 35.53091, 46.099186, 33.495064, 46.498383)
shape.curveTo(31.459217, 46.89758, 28.947906, 46.89758, 26.91206, 46.498383)
shape.curveTo(24.876213, 46.099186, 23.627047, 45.361816, 23.63757, 44.565483)
shape.curveTo(23.627047, 43.76915, 24.876213, 43.03178, 26.91206, 42.632584)
shape.curveTo(28.947906, 42.233387, 31.459217, 42.233387, 33.495064, 42.632584)
shape.curveTo(35.53091, 43.03178, 36.780075, 43.76915, 36.769554, 44.565483)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = RadialGradientPaint(Point2D.Double(24.445690155029297, 35.878170013427734), 20.530962f, Point2D.Double(24.445690155029297, 35.878170013427734), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(220, 220, 220, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.9950579404830933f, -1.6515269512350966E-32f, 0.0f, 1.9950579404830933f, -24.324880599975586f, -35.700870513916016f))
shape = RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355)
g.paint = paint
g.fill(shape)
paint = Color(155, 155, 155, 255)
stroke = BasicStroke(1.0f,0,2,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(0.99999976f,0,2,10.0f,null,0.0f)
shape = RoundRectangle2D.Double(5.597388744354248, 4.70600700378418, 37.69658660888672, 37.69658660888672, 8.485278129577637, 8.485278129577637)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(19.187523, 7.5673065)
shape.lineTo(16.902367, 15.512619)
shape.lineTo(16.644554, 16.579025)
shape.curveTo(16.621107, 16.68059, 16.60939, 16.766527, 16.609398, 16.836838)
shape.curveTo(16.60939, 16.96184, 16.648453, 17.071215, 16.726585, 17.164963)
shape.curveTo(16.789078, 17.235275, 16.867203, 17.270432, 16.96096, 17.270432)
shape.curveTo(17.062513, 17.270432, 17.195328, 17.207932, 17.359398, 17.082932)
shape.curveTo(17.664076, 16.85637, 18.070326, 16.38762, 18.578148, 15.676682)
shape.lineTo(18.976585, 15.957932)
shape.curveTo(18.437513, 16.770433, 17.882826, 17.391525, 17.312523, 17.821213)
shape.curveTo(16.742203, 18.243088, 16.214859, 18.454025, 15.730492, 18.454025)
shape.curveTo(15.394547, 18.454025, 15.140641, 18.368088, 14.968773, 18.196213)
shape.curveTo(14.804704, 18.03215, 14.722673, 17.789963, 14.72268, 17.46965)
shape.curveTo(14.722673, 17.08684, 14.80861, 16.582933, 14.980492, 15.957932)
shape.lineTo(15.226586, 15.079025)
shape.curveTo(14.203142, 16.414965, 13.261737, 17.348557, 12.402367, 17.879807)
shape.curveTo(11.785176, 18.262619, 11.179708, 18.454025, 10.585961, 18.454025)
shape.curveTo(10.015646, 18.454025, 9.523459, 18.21965, 9.109399, 17.7509)
shape.curveTo(8.695335, 17.27434, 8.488304, 16.621996, 8.488305, 15.793869)
shape.curveTo(8.488304, 14.551685, 8.859398, 13.243093, 9.601586, 11.868088)
shape.curveTo(10.351583, 10.485283, 11.300801, 9.379815, 12.449242, 8.5516815)
shape.curveTo(13.347674, 7.895442, 14.19533, 7.567317, 14.992211, 7.5673065)
shape.curveTo(15.468766, 7.567317, 15.863297, 7.692317, 16.175804, 7.9423065)
shape.curveTo(16.496109, 8.192317, 16.738297, 8.606379, 16.902367, 9.184494)
shape.lineTo(17.324242, 7.8485565)
shape.lineTo(19.187523, 7.5673065)
shape.moveTo(15.015648, 8.1766815)
shape.curveTo(14.515642, 8.176692, 13.984392, 8.411066, 13.421898, 8.8798065)
shape.curveTo(12.625019, 9.543878, 11.914082, 10.528252, 11.289086, 11.832932)
shape.curveTo(10.671896, 13.137624, 10.363302, 14.31731, 10.363305, 15.371994)
shape.curveTo(10.363302, 15.903246, 10.496115, 16.32512, 10.761742, 16.637619)
shape.curveTo(11.027364, 16.942308, 11.332051, 17.09465, 11.675805, 17.09465)
shape.curveTo(12.527363, 17.09465, 13.453143, 16.465746, 14.453148, 15.207932)
shape.curveTo(15.789078, 13.536061, 16.457047, 11.821219, 16.457054, 10.0634)
shape.curveTo(16.457047, 9.399346, 16.32814, 8.918879, 16.070335, 8.621994)
shape.curveTo(15.812515, 8.325129, 15.460953, 8.176692, 15.015648, 8.1766815)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(23.843164, 20.148026)
shape.lineTo(23.843164, 26.056417)
shape.curveTo(24.570492, 25.30076, 25.31199, 24.724564, 26.067669, 24.327824)
shape.curveTo(26.82333, 23.921665, 27.758469, 23.718578, 28.87309, 23.718563)
shape.curveTo(30.157719, 23.718578, 31.281775, 24.02557, 32.245266, 24.639536)
shape.curveTo(33.218178, 25.244085, 33.969124, 26.127274, 34.498108, 27.289103)
shape.curveTo(35.036507, 28.44151, 35.305714, 29.81116, 35.30573, 31.398058)
shape.curveTo(35.305714, 32.56935, 35.15458, 33.64618, 34.85233, 34.628544)
shape.curveTo(34.55949, 35.601475, 34.129704, 36.446877, 33.562965, 37.16476)
shape.curveTo(32.9962, 37.88265, 32.306652, 38.439953, 31.49432, 38.83668)
shape.curveTo(30.691408, 39.22396, 29.803497, 39.417603, 28.830585, 39.417603)
shape.curveTo(28.235485, 39.417603, 27.673456, 39.346756, 27.144497, 39.20507)
shape.curveTo(26.624966, 39.06338, 26.18101, 38.87919, 25.81263, 38.652485)
shape.curveTo(25.444233, 38.41634, 25.127796, 38.17547, 24.86332, 37.92988)
shape.curveTo(24.608274, 37.684284, 24.268223, 37.3159, 23.843164, 36.82471)
shape.lineTo(23.843164, 37.207268)
shape.curveTo(23.843159, 37.9346, 23.668411, 38.487183, 23.318918, 38.865017)
shape.curveTo(22.969418, 39.233406, 22.525461, 39.417603, 21.987051, 39.417603)
shape.curveTo(21.439188, 39.417603, 20.999954, 39.233406, 20.669352, 38.865017)
shape.curveTo(20.34819, 38.487183, 20.18761, 37.9346, 20.187613, 37.207268)
shape.lineTo(20.187613, 20.31805)
shape.curveTo(20.18761, 19.534063, 20.343468, 18.943695, 20.655184, 18.54695)
shape.curveTo(20.976341, 18.140799, 21.420296, 17.937712, 21.987051, 17.93769)
shape.curveTo(22.582136, 17.937712, 23.04026, 18.131351, 23.361425, 18.518612)
shape.curveTo(23.68258, 18.896467, 23.843159, 19.439604, 23.843164, 20.148026)
shape.moveTo(24.02736, 31.638927)
shape.curveTo(24.027353, 33.178608, 24.37685, 34.364063, 25.075851, 35.195297)
shape.curveTo(25.784285, 36.01709, 26.709978, 36.427986, 27.852938, 36.427982)
shape.curveTo(28.825851, 36.427986, 29.66181, 36.007645, 30.360815, 35.166958)
shape.curveTo(31.069244, 34.316837, 31.423464, 33.103043, 31.423475, 31.525576)
shape.curveTo(31.423464, 30.50543, 31.277052, 29.626966, 30.984243, 28.890179)
shape.curveTo(30.691408, 28.153412, 30.275791, 27.58666, 29.737389, 27.18992)
shape.curveTo(29.198963, 26.78376, 28.570812, 26.580675, 27.852938, 26.580664)
shape.curveTo(27.11615, 26.580675, 26.459663, 26.78376, 25.883472, 27.18992)
shape.curveTo(25.307268, 27.58666, 24.853867, 28.16758, 24.523268, 28.932686)
shape.curveTo(24.192656, 29.688364, 24.027353, 30.590443, 24.02736, 31.638927)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_5
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(39.201935, 12.649522)
shape.curveTo(39.201927, 12.84475, 39.18891, 13.13107, 39.16289, 13.508484)
shape.curveTo(39.149868, 13.8729, 39.14336, 14.139699, 39.143368, 14.308881)
shape.lineTo(36.41031, 14.308881)
shape.lineTo(36.41031, 11.907691)
shape.curveTo(36.4103, 11.439177, 36.15001, 11.204915, 35.629433, 11.204904)
shape.curveTo(35.108845, 11.204915, 34.848553, 11.439177, 34.848557, 11.907691)
shape.lineTo(34.848557, 19.618828)
shape.curveTo(34.848553, 20.100368, 35.108845, 20.341139, 35.629433, 20.341137)
shape.curveTo(36.15001, 20.341139, 36.4103, 20.100368, 36.41031, 19.618828)
shape.lineTo(36.41031, 17.061464)
shape.lineTo(39.143368, 17.061464)
shape.lineTo(39.143368, 19.560263)
shape.curveTo(39.14336, 20.328123, 38.726894, 20.913778, 37.89397, 21.31723)
shape.curveTo(37.23022, 21.642595, 36.475376, 21.805277, 35.629433, 21.805277)
shape.curveTo(34.770466, 21.805277, 34.01562, 21.642595, 33.364895, 21.31723)
shape.curveTo(32.531963, 20.913778, 32.115498, 20.328123, 32.115498, 19.560263)
shape.lineTo(32.115498, 12.044344)
shape.curveTo(32.115498, 10.599737, 33.286808, 9.877429, 35.629433, 9.877418)
shape.curveTo(36.80074, 9.877429, 37.6597, 10.053126, 38.206318, 10.404508)
shape.curveTo(38.870056, 10.833999, 39.201927, 11.582337, 39.201935, 12.649522)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_5
g.transform = defaultTransform__0_0
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
            return 3.9147281646728516
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 3.0233452320098877
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 41.061927795410156
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.38325500488281
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Preferences_desktop_font(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Preferences_desktop_font(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Preferences_desktop_font(16, 16) }
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

