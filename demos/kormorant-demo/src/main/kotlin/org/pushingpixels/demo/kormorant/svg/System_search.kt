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
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class System_search(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
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
g.composite = AlphaComposite.getInstance(3, 0.17f * origAlpha)
val defaultTransform__0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
paint = RadialGradientPaint(Point2D.Double(-174.5, -511.6000061035156), 16.53f, Point2D.Double(-174.5, -511.6000061035156), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.4459999799728394f, 0.0f, 0.0f, -0.3619999885559082f, 276.20001220703125f, -145.10000610351562f))
shape = Ellipse2D.Double(0.020000457763671875, 33.97999954223633, 47.79999923706055, 11.960000038146973)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_0
paint = Color(220, 220, 220, 255)
shape = GeneralPath()
shape.moveTo(18.63, 3.14)
shape.curveTo(10.489999, 3.14, 3.8799992, 9.75, 3.8799992, 17.89)
shape.curveTo(3.8799992, 26.029999, 10.49, 32.629997, 18.63, 32.629997)
shape.curveTo(22.109999, 32.629997, 25.18, 31.249998, 27.73, 29.229998)
shape.curveTo(27.529999, 30.229998, 27.65, 31.269997, 28.49, 31.989998)
shape.lineTo(39.45, 41.519997)
shape.curveTo(40.68, 42.589996, 42.54, 42.449997, 43.61, 41.219997)
shape.curveTo(44.68, 39.979996, 44.54, 38.129997, 43.31, 37.059998)
shape.lineTo(32.34, 27.529999)
shape.curveTo(31.67, 26.949999, 30.85, 26.769999, 30.04, 26.89)
shape.curveTo(32.02, 24.369999, 33.4, 21.34, 33.4, 17.89)
shape.curveTo(33.4, 9.749999, 26.800001, 3.1399994, 18.660002, 3.1399994)
shape.closePath()
shape.moveTo(18.55, 4.37)
shape.curveTo(26.189999, 4.37, 31.84, 9.16, 31.84, 17.66)
shape.curveTo(31.84, 26.34, 26.03, 30.95, 18.55, 30.95)
shape.curveTo(11.249999, 30.95, 5.2599993, 25.480001, 5.2599993, 17.66)
shape.curveTo(5.2599993, 9.68, 11.08, 4.37, 18.55, 4.37)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(27.010000228881836, 23.350000381469727), Point2D.Double(31.299999237060547, 30.600000381469727), floatArrayOf(0.0f,1.0f), arrayOf(Color(138, 138, 138, 255),Color(72, 72, 72, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(2.0f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(18.63, 3.14)
shape.curveTo(10.489999, 3.14, 3.8799992, 9.75, 3.8799992, 17.89)
shape.curveTo(3.8799992, 26.029999, 10.49, 32.629997, 18.63, 32.629997)
shape.curveTo(22.109999, 32.629997, 25.18, 31.249998, 27.73, 29.229998)
shape.curveTo(27.529999, 30.229998, 27.65, 31.269997, 28.49, 31.989998)
shape.lineTo(39.45, 41.519997)
shape.curveTo(40.68, 42.589996, 42.54, 42.449997, 43.61, 41.219997)
shape.curveTo(44.68, 39.979996, 44.54, 38.129997, 43.31, 37.059998)
shape.lineTo(32.34, 27.529999)
shape.curveTo(31.67, 26.949999, 30.85, 26.769999, 30.04, 26.89)
shape.curveTo(32.02, 24.369999, 33.4, 21.34, 33.4, 17.89)
shape.curveTo(33.4, 9.749999, 26.800001, 3.1399994, 18.660002, 3.1399994)
shape.closePath()
shape.moveTo(18.55, 4.37)
shape.curveTo(26.189999, 4.37, 31.84, 9.16, 31.84, 17.66)
shape.curveTo(31.84, 26.34, 26.03, 30.95, 18.55, 30.95)
shape.curveTo(11.249999, 30.95, 5.2599993, 25.480001, 5.2599993, 17.66)
shape.curveTo(5.2599993, 9.68, 11.08, 4.37, 18.55, 4.37)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
paint = Color(220, 220, 220, 255)
shape = GeneralPath()
shape.moveTo(18.6, 3.08)
shape.curveTo(10.440001, 3.08, 3.8100004, 9.71, 3.8100004, 17.869999)
shape.curveTo(3.8100004, 26.039999, 10.440001, 32.67, 18.6, 32.67)
shape.curveTo(22.09, 32.67, 25.18, 31.279999, 27.71, 29.249998)
shape.curveTo(27.5, 30.249998, 27.63, 31.289997, 28.46, 32.019997)
shape.lineTo(39.46, 41.579998)
shape.curveTo(40.7, 42.649998, 42.559998, 42.51, 43.64, 41.28)
shape.curveTo(44.71, 40.039997, 44.57, 38.18, 43.329998, 37.1)
shape.lineTo(32.329998, 27.539997)
shape.curveTo(31.659998, 26.959997, 30.839998, 26.789997, 30.019999, 26.899998)
shape.curveTo(32.01, 24.379997, 33.399998, 21.329998, 33.399998, 17.899998)
shape.curveTo(33.399998, 9.739998, 26.769997, 3.1099977, 18.599998, 3.1099977)
shape.moveTo(18.529999, 6.299998)
shape.curveTo(24.81, 6.299998, 29.91, 11.3899975, 29.91, 17.679998)
shape.curveTo(29.91, 23.96, 24.81, 29.05, 18.529999, 29.05)
shape.curveTo(12.249998, 29.05, 7.1499987, 23.96, 7.1499987, 17.68)
shape.curveTo(7.1499987, 11.39, 12.249998, 6.3, 18.529999, 6.3)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_1
g.transform = defaultTransform__0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
paint = LinearGradientPaint(Point2D.Double(-146.89999389648438, 52.709999084472656), Point2D.Double(-144.3000030517578, 55.650001525878906), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(125, 125, 125, 255),Color(177, 177, 177, 255),Color(104, 104, 104, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3350000381469727f, 0.0f, 0.0f, -1.2910000085830688f, 229.60000610351562f, 104.0999984741211f))
shape = GeneralPath()
shape.moveTo(39.51, 41.58)
shape.curveTo(39.03, 39.300003, 40.899998, 36.77, 43.089996, 36.79)
shape.lineTo(32.329994, 27.53)
shape.curveTo(29.389994, 27.470001, 28.059994, 29.800001, 28.549994, 32.13)
shape.lineTo(39.509995, 41.58)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3
paint = LinearGradientPaint(Point2D.Double(18.809999465942383, 10.729999542236328), Point2D.Double(17.829999923706055, 25.860000610351562), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 56),Color(255, 255, 255, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = Ellipse2D.Double(4.60999870300293, 3.6299991607666016, 27.540000915527344, 27.540000915527344)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4
paint = RadialGradientPaint(Point2D.Double(314.8999938964844, -1674.0), 16.53f, Point2D.Double(314.8999938964844, -1674.0), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.49799999594688416f, 0.0f, 0.0f, -0.14499999582767487f, -135.8000030517578f, -204.10000610351562f))
shape = Ellipse2D.Double(12.760000228881836, 36.369998931884766, 16.459999084472656, 4.800000190734863)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5
paint = RadialGradientPaint(Point2D.Double(-171.6999969482422, 81.5), 8.31f, Point2D.Double(-171.6999969482422, 81.5), floatArrayOf(0.0f,1.0f), arrayOf(Color(114, 159, 207, 54),Color(114, 159, 207, 173)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3990000486373901f, 0.0f, 0.0f, -1.3990000486373901f, 259.5f, 136.1999969482422f))
shape = Ellipse2D.Double(6.7599992752075195, 5.929999351501465, 23.239999771118164, 23.239999771118164)
g.paint = paint
g.fill(shape)
paint = Color(48, 99, 163, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = Ellipse2D.Double(6.7599992752075195, 5.929999351501465, 23.239999771118164, 23.239999771118164)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_5
g.composite = AlphaComposite.getInstance(3, 0.83f * origAlpha)
val defaultTransform__0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_6
paint = RadialGradientPaint(Point2D.Double(-296.79998779296875, 166.39999389648438), 6.66f, Point2D.Double(-296.79998779296875, 166.39999389648438), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 64)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.5929999351501465f, 0.0f, 0.0f, -2.252000093460083f, 784.5999755859375f, 385.29998779296875f))
shape = GeneralPath()
shape.moveTo(18.2, 7.4)
shape.curveTo(12.990001, 7.4, 8.77, 11.610001, 8.77, 16.82)
shape.curveTo(8.77, 18.33, 9.190001, 19.71, 9.820001, 20.97)
shape.curveTo(11.070001, 21.429998, 12.400001, 21.75, 13.81, 21.75)
shape.curveTo(19.99, 21.75, 24.91, 16.89, 25.29, 10.81)
shape.curveTo(23.560001, 8.76, 21.080002, 7.4000006, 18.2, 7.4000006)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_6
g.composite = AlphaComposite.getInstance(3, 0.43f * origAlpha)
val defaultTransform__0_7 = g.transform
g.transform(AffineTransform(0.753000020980835f, 0.6579999923706055f, -0.6488999724388123f, 0.7609000205993652f, 0.0f, 0.0f))
// _0_7
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(40.5, -0.12999999523162842, 19.0, 5.0, 4.935999870300293, 4.935999870300293)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_7
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
            return 0.020000457763671875
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 2.1399993896484375
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 47.79999923706055
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 43.79999923706055
        }

        /**
         * Returns an instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(System_search(width, height))
        }

        /**
         * Returns a [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(System_search(width, height))
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

