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
class Applications_games private constructor(private var width: Int, private var height: Int)
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
g.composite = AlphaComposite.getInstance(3, 0.38636363f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.408115029335022f, 0.0f, 0.0f, 0.4929580092430115f, -7.856804847717285f, 28.288719177246094f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(22.571428298950195, 30.85714340209961), 15.571428f, Point2D.Double(22.571428298950195, 30.85714340209961), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.6513760089874268f, 3.8960779657278184E-15f, 10.757539749145508f))
shape = GeneralPath()
shape.moveTo(38.142857, 30.857143)
shape.curveTo(38.16781, 34.491642, 35.205383, 37.857037, 30.377314, 39.678993)
shape.curveTo(25.549248, 41.500954, 19.593609, 41.500954, 14.765542, 39.678993)
shape.curveTo(9.937474, 37.857037, 6.9750466, 34.491642, 7.0, 30.857143)
shape.curveTo(6.9750466, 27.222643, 9.937474, 23.85725, 14.765542, 22.035294)
shape.curveTo(19.593609, 20.213335, 25.549248, 20.213335, 30.377314, 22.035294)
shape.curveTo(35.205383, 23.85725, 38.16781, 27.222643, 38.142857, 30.857143)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(0.9802799820899963f, -0.19761699438095093f, 0.19761699438095093f, 0.9802799820899963f, -10.728349685668945f, 1.0851049423217773f))
// _0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1_0 = g.transform
g.transform(AffineTransform(0.9653639793395996f, 0.26090800762176514f, -0.26090800762176514f, 0.9653639793395996f, 11.349209785461426f, -0.5226759910583496f))
// _0_0_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1_0_0 = g.transform
g.transform(AffineTransform(0.9653840065002441f, -0.2608329951763153f, 0.2608329951763153f, 0.9653840065002441f, 0.0f, 0.0f))
// _0_0_1_0_0
paint = LinearGradientPaint(Point2D.Double(42.15003204345703, 23.40526580810547), Point2D.Double(50.87135696411133, 39.3181266784668), floatArrayOf(0.0f,1.0f), arrayOf(Color(229, 229, 229, 255),Color(200, 200, 200, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.8930889964103699f, 2.4185458797894126E-16f, -3.7011480501146997E-16f, 1.1197090148925781f, -18.45684051513672f, -0.381848007440567f))
shape = RoundRectangle2D.Double(-1.9805312156677246, 8.210731506347656, 30.930360794067383, 39.03262710571289, 6.060927867889404, 5.656864643096924)
g.paint = paint
g.fill(shape)
paint = Color(136, 138, 133, 255)
stroke = BasicStroke(1.0000017f,1,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(-1.9805312156677246, 8.210731506347656, 30.930360794067383, 39.03262710571289, 6.060927867889404, 5.656864643096924)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1_0_1 = g.transform
g.transform(AffineTransform(0.9653760194778442f, -0.2608639895915985f, 0.2608030140399933f, 0.965391993522644f, 0.0f, 0.0f))
// _0_0_1_0_1
paint = LinearGradientPaint(Point2D.Double(38.897804260253906, 32.23447799682617), Point2D.Double(69.18116760253906, 57.055389404296875), floatArrayOf(0.0f,1.0f), arrayOf(Color(229, 229, 229, 255),Color(200, 200, 200, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.8824639916419983f, 3.464905002471759E-16f, -8.831331208893642E-16f, 1.1232290267944336f, -18.457029342651367f, -0.30422499775886536f))
shape = RoundRectangle2D.Double(-1.0130478143692017, 9.101876258850098, 28.99733543395996, 37.150211334228516, 4.4699506759643555, 3.8891007900238037)
g.paint = paint
g.fill(shape)
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0000025f,1,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(-1.0130478143692017, 9.101876258850098, 28.99733543395996, 37.150211334228516, 4.4699506759643555, 3.8891007900238037)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1_0_1
g.transform = defaultTransform__0_0_1_0
g.composite = AlphaComposite.getInstance(3, 0.51648355f * origAlpha)
val defaultTransform__0_0_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.1767760068178177f, 7.24783992767334f))
// _0_0_1_1
paint = LinearGradientPaint(Point2D.Double(48.0, 18.534204483032227), Point2D.Double(78.0, 18.534204483032227), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0157170295715332f, 7.557276759059008E-18f, -7.795538689879395E-18f, 1.0477399826049805f, -38.624019622802734f, -6.5425190925598145f))
shape = GeneralPath()
shape.moveTo(10.130389, 22.794182)
shape.curveTo(22.980885, 26.961538, 29.3674, 17.052488, 40.601906, 22.794182)
shape.lineTo(38.721928, 3.5888283)
shape.curveTo(38.721928, 3.5888283, 38.11114, 1.4341087, 36.70666, 1.6919748)
shape.lineTo(12.249217, 1.922697)
shape.curveTo(10.654669, 1.781581, 10.44653, 2.8886232, 10.479394, 4.067412)
shape.lineTo(10.130389, 22.794182)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_1_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1_2
paint = Color(0, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(17.6875, 12.28125)
shape.curveTo(14.13478, 15.630644, 12.705188, 16.554443, 12.6875, 18.4375)
shape.curveTo(12.670309, 20.26803, 14.981028, 21.868397, 17.0, 20.71875)
shape.curveTo(17.064192, 21.65549, 17.094534, 23.274815, 16.53125, 23.9375)
shape.curveTo(16.61964, 23.937502, 19.0, 23.96875, 19.0, 23.96875)
shape.curveTo(18.999998, 23.968752, 18.387556, 21.93878, 18.3125, 20.59375)
shape.curveTo(20.52189, 21.985624, 22.669676, 20.474531, 22.6875, 18.34375)
shape.curveTo(22.706844, 16.109568, 21.406126, 15.397146, 17.6875, 12.28125)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_1_2
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.25f))
// _0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.875f))
// _0_0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 2.5f, 2.75f))
// _0_0_2_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.1767760068178177f, 7.24783992767334f))
// _0_0_2_0_0_0
g.composite = AlphaComposite.getInstance(3, 0.51648355f * origAlpha)
val defaultTransform__0_0_2_0_0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_0_0_0_0
paint = LinearGradientPaint(Point2D.Double(48.0, 18.534204483032227), Point2D.Double(78.0, 18.534204483032227), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.969323992729187f, 0.3034670054912567f, -0.3130339980125427f, 0.9998840093612671f, -26.513540267944336f, -28.877639770507812f))
shape = GeneralPath()
shape.moveTo(11.249051, 13.68551)
shape.curveTo(22.267511, 21.50188, 31.322859, 13.953532, 40.328777, 22.789518)
shape.lineTo(45.504536, 4.778087)
shape.lineTo(44.31062, 2.2533867)
shape.lineTo(19.506897, -5.5996203)
shape.lineTo(16.789787, -4.294419)
shape.lineTo(11.249051, 13.68551)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2_0_0_0_0
g.transform = defaultTransform__0_0_2_0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_0_0_1 = g.transform
g.transform(AffineTransform(0.9664639830589294f, 0.2568039894104004f, -0.2568039894104004f, 0.9664639830589294f, 0.0f, 0.0f))
// _0_0_2_0_0_1
paint = LinearGradientPaint(Point2D.Double(35.32130813598633, 24.98446273803711), Point2D.Double(51.86124801635742, 41.3704719543457), floatArrayOf(0.0f,1.0f), arrayOf(Color(229, 229, 229, 255),Color(200, 200, 200, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.8930889964103699f, -5.9912960600914874E-18f, 7.511521263475638E-18f, 1.1197099685668945f, 0.123710997402668f, -12.572319984436035f))
shape = RoundRectangle2D.Double(16.60003089904785, -3.979738712310791, 30.93037223815918, 39.03263854980469, 6.060929775238037, 5.656866550445557)
g.paint = paint
g.fill(shape)
paint = Color(136, 138, 133, 255)
stroke = BasicStroke(1.0000019f,1,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(16.60003089904785, -3.979738712310791, 30.93037223815918, 39.03263854980469, 6.060929775238037, 5.656866550445557)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_0_0_2 = g.transform
g.transform(AffineTransform(0.9664720296859741f, 0.2567729949951172f, -0.2568340003490448f, 0.9664559960365295f, 0.0f, 0.0f))
// _0_0_2_0_0_2
paint = LinearGradientPaint(Point2D.Double(34.56182098388672, 17.249048233032227), Point2D.Double(50.808902740478516, 44.76952362060547), floatArrayOf(0.0f,1.0f), arrayOf(Color(229, 229, 229, 255),Color(223, 223, 223, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.8824639916419983f, -2.896566144245519E-17f, -5.327444162002464E-17f, 1.1232320070266724f, 0.1231599971652031f, -12.494110107421875f))
shape = RoundRectangle2D.Double(17.567136764526367, -3.087998390197754, 28.99733543395996, 37.1502571105957, 4.469949722290039, 3.889106273651123)
g.paint = paint
g.fill(shape)
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0000031f,1,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(17.567136764526367, -3.087998390197754, 28.99733543395996, 37.1502571105957, 4.469949722290039, 3.889106273651123)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_0_0_3
paint = Color(204, 0, 0, 255)
shape = GeneralPath()
shape.moveTo(28.21921, 18.57943)
shape.curveTo(32.016663, 16.34947, 35.37125, 20.241547, 34.574306, 23.107834)
shape.curveTo(33.84576, 25.728115, 31.535908, 26.45757, 25.327822, 29.802046)
shape.curveTo(21.304976, 24.065321, 19.745802, 22.573204, 20.607912, 19.463713)
shape.curveTo(21.49938, 16.244665, 25.660599, 14.764478, 28.21921, 18.57943)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2_0_0_3
g.transform = defaultTransform__0_0_2_0_0
g.composite = AlphaComposite.getInstance(3, 0.51648355f * origAlpha)
val defaultTransform__0_0_2_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_0_1
paint = LinearGradientPaint(Point2D.Double(54.287078857421875, 9.11362075805664), Point2D.Double(68.8434829711914, 38.11833190917969), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.985863983631134f, 0.24445000290870667f, -0.2521570026874542f, 1.0169450044631958f, -24.58715057373047f, -15.188389778137207f))
shape = GeneralPath()
shape.moveTo(15.408724, 24.666098)
shape.curveTo(26.878572, 31.803663, 32.987286, 22.750612, 42.50975, 31.027325)
shape.lineTo(47.031673, 13.797161)
shape.curveTo(47.29684, 12.824889, 47.01348, 12.056174, 45.59927, 11.70262)
shape.lineTo(22.57675, 5.2715507)
shape.curveTo(21.250923, 4.9179974, 20.120085, 5.8543754, 19.943308, 6.738259)
shape.lineTo(15.408724, 24.666098)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2_0_1
g.transform = defaultTransform__0_0_2_0
g.transform = defaultTransform__0_0_2
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
            return 0.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.07118791341781616
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
            return 47.92881393432617
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Applications_games(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Applications_games(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Applications_games(16, 16) }
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

