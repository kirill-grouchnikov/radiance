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

import org.pushingpixels.neon.api.icon.NeonIcon
import org.pushingpixels.neon.api.icon.NeonIcon.Factory
import org.pushingpixels.neon.api.icon.NeonIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class System_search private constructor(private var width: Int, private var height: Int)
       : NeonIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var colorFilter: NeonIcon.ColorFilter? = null
    private val transformsStack = Stack<AffineTransform>()

    

	private fun _paint0(g : Graphics2D,origAlpha : Float) {
transformsStack.push(g.transform)
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 0.17f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
shape = Ellipse2D.Double(0.020000457763671875, 33.97999954223633, 47.79999923706055, 11.960000038146973)
paint = RadialGradientPaint(Point2D.Double(-174.5, -511.6000061035156), 16.53f, Point2D.Double(-174.5, -511.6000061035156), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.4459999799728394f, 0.0f, 0.0f, -0.3619999885559082f, 276.20001220703125f, -145.10000610351562f))
g.paint = paint
g.fill(shape)
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
generalPath!!.moveTo(18.63f, 3.14f)
generalPath!!.curveTo(10.489999f, 3.14f, 3.8799992f, 9.75f, 3.8799992f, 17.89f)
generalPath!!.curveTo(3.8799992f, 26.029999f, 10.49f, 32.629997f, 18.63f, 32.629997f)
generalPath!!.curveTo(22.109999f, 32.629997f, 25.18f, 31.249998f, 27.73f, 29.229998f)
generalPath!!.curveTo(27.529999f, 30.229998f, 27.65f, 31.269997f, 28.49f, 31.989998f)
generalPath!!.lineTo(39.45f, 41.519997f)
generalPath!!.curveTo(40.68f, 42.589996f, 42.54f, 42.449997f, 43.61f, 41.219997f)
generalPath!!.curveTo(44.68f, 39.979996f, 44.54f, 38.129997f, 43.31f, 37.059998f)
generalPath!!.lineTo(32.34f, 27.529999f)
generalPath!!.curveTo(31.67f, 26.949999f, 30.85f, 26.769999f, 30.04f, 26.89f)
generalPath!!.curveTo(32.02f, 24.369999f, 33.4f, 21.34f, 33.4f, 17.89f)
generalPath!!.curveTo(33.4f, 9.749999f, 26.800001f, 3.1399994f, 18.660002f, 3.1399994f)
generalPath!!.closePath()
generalPath!!.moveTo(18.55f, 4.37f)
generalPath!!.curveTo(26.189999f, 4.37f, 31.84f, 9.16f, 31.84f, 17.66f)
generalPath!!.curveTo(31.84f, 26.34f, 26.03f, 30.95f, 18.55f, 30.95f)
generalPath!!.curveTo(11.249999f, 30.95f, 5.2599993f, 25.480001f, 5.2599993f, 17.66f)
generalPath!!.curveTo(5.2599993f, 9.68f, 11.08f, 4.37f, 18.55f, 4.37f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(220, 220, 220, 255)) ?: Color(220, 220, 220, 255)
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(27.010000228881836, 23.350000381469727), Point2D.Double(31.299999237060547, 30.600000381469727), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(138, 138, 138, 255)) ?: Color(138, 138, 138, 255)),(colorFilter?.filter(Color(72, 72, 72, 255)) ?: Color(72, 72, 72, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(2.0f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.63f, 3.14f)
generalPath!!.curveTo(10.489999f, 3.14f, 3.8799992f, 9.75f, 3.8799992f, 17.89f)
generalPath!!.curveTo(3.8799992f, 26.029999f, 10.49f, 32.629997f, 18.63f, 32.629997f)
generalPath!!.curveTo(22.109999f, 32.629997f, 25.18f, 31.249998f, 27.73f, 29.229998f)
generalPath!!.curveTo(27.529999f, 30.229998f, 27.65f, 31.269997f, 28.49f, 31.989998f)
generalPath!!.lineTo(39.45f, 41.519997f)
generalPath!!.curveTo(40.68f, 42.589996f, 42.54f, 42.449997f, 43.61f, 41.219997f)
generalPath!!.curveTo(44.68f, 39.979996f, 44.54f, 38.129997f, 43.31f, 37.059998f)
generalPath!!.lineTo(32.34f, 27.529999f)
generalPath!!.curveTo(31.67f, 26.949999f, 30.85f, 26.769999f, 30.04f, 26.89f)
generalPath!!.curveTo(32.02f, 24.369999f, 33.4f, 21.34f, 33.4f, 17.89f)
generalPath!!.curveTo(33.4f, 9.749999f, 26.800001f, 3.1399994f, 18.660002f, 3.1399994f)
generalPath!!.closePath()
generalPath!!.moveTo(18.55f, 4.37f)
generalPath!!.curveTo(26.189999f, 4.37f, 31.84f, 9.16f, 31.84f, 17.66f)
generalPath!!.curveTo(31.84f, 26.34f, 26.03f, 30.95f, 18.55f, 30.95f)
generalPath!!.curveTo(11.249999f, 30.95f, 5.2599993f, 25.480001f, 5.2599993f, 17.66f)
generalPath!!.curveTo(5.2599993f, 9.68f, 11.08f, 4.37f, 18.55f, 4.37f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.6f, 3.08f)
generalPath!!.curveTo(10.440001f, 3.08f, 3.8100004f, 9.71f, 3.8100004f, 17.869999f)
generalPath!!.curveTo(3.8100004f, 26.039999f, 10.440001f, 32.67f, 18.6f, 32.67f)
generalPath!!.curveTo(22.09f, 32.67f, 25.18f, 31.279999f, 27.71f, 29.249998f)
generalPath!!.curveTo(27.5f, 30.249998f, 27.63f, 31.289997f, 28.46f, 32.019997f)
generalPath!!.lineTo(39.46f, 41.579998f)
generalPath!!.curveTo(40.7f, 42.649998f, 42.559998f, 42.51f, 43.64f, 41.28f)
generalPath!!.curveTo(44.71f, 40.039997f, 44.57f, 38.18f, 43.329998f, 37.1f)
generalPath!!.lineTo(32.329998f, 27.539997f)
generalPath!!.curveTo(31.659998f, 26.959997f, 30.839998f, 26.789997f, 30.019999f, 26.899998f)
generalPath!!.curveTo(32.01f, 24.379997f, 33.399998f, 21.329998f, 33.399998f, 17.899998f)
generalPath!!.curveTo(33.399998f, 9.739998f, 26.769997f, 3.1099977f, 18.599998f, 3.1099977f)
generalPath!!.moveTo(18.529999f, 6.299998f)
generalPath!!.curveTo(24.81f, 6.299998f, 29.91f, 11.3899975f, 29.91f, 17.679998f)
generalPath!!.curveTo(29.91f, 23.96f, 24.81f, 29.05f, 18.529999f, 29.05f)
generalPath!!.curveTo(12.249998f, 29.05f, 7.1499987f, 23.96f, 7.1499987f, 17.68f)
generalPath!!.curveTo(7.1499987f, 11.39f, 12.249998f, 6.3f, 18.529999f, 6.3f)
shape = generalPath
paint = colorFilter?.filter(Color(220, 220, 220, 255)) ?: Color(220, 220, 220, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.51f, 41.58f)
generalPath!!.curveTo(39.03f, 39.300003f, 40.899998f, 36.77f, 43.089996f, 36.79f)
generalPath!!.lineTo(32.329994f, 27.53f)
generalPath!!.curveTo(29.389994f, 27.470001f, 28.059994f, 29.800001f, 28.549994f, 32.13f)
generalPath!!.lineTo(39.509995f, 41.58f)
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(-146.89999389648438, 52.709999084472656), Point2D.Double(-144.3000030517578, 55.650001525878906), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(125, 125, 125, 255)) ?: Color(125, 125, 125, 255)),(colorFilter?.filter(Color(177, 177, 177, 255)) ?: Color(177, 177, 177, 255)),(colorFilter?.filter(Color(104, 104, 104, 255)) ?: Color(104, 104, 104, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3350000381469727f, 0.0f, 0.0f, -1.2910000085830688f, 229.60000610351562f, 104.0999984741211f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_3
paint = LinearGradientPaint(Point2D.Double(18.809999465942383, 10.729999542236328), Point2D.Double(17.829999923706055, 25.860000610351562), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 56)) ?: Color(255, 255, 255, 56)),(colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = Ellipse2D.Double(4.60999870300293, 3.6299991607666016, 27.540000915527344, 27.540000915527344)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_4
shape = Ellipse2D.Double(12.760000228881836, 36.369998931884766, 16.459999084472656, 4.800000190734863)
paint = RadialGradientPaint(Point2D.Double(314.8999938964844, -1674.0), 16.53f, Point2D.Double(314.8999938964844, -1674.0), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.49799999594688416f, 0.0f, 0.0f, -0.14499999582767487f, -135.8000030517578f, -204.10000610351562f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_5
shape = Ellipse2D.Double(6.7599992752075195, 5.929999351501465, 23.239999771118164, 23.239999771118164)
paint = RadialGradientPaint(Point2D.Double(-171.6999969482422, 81.5), 8.31f, Point2D.Double(-171.6999969482422, 81.5), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(114, 159, 207, 54)) ?: Color(114, 159, 207, 54)),(colorFilter?.filter(Color(114, 159, 207, 173)) ?: Color(114, 159, 207, 173))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3990000486373901f, 0.0f, 0.0f, -1.3990000486373901f, 259.5f, 136.1999969482422f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(48, 99, 163, 255)) ?: Color(48, 99, 163, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = Ellipse2D.Double(6.7599992752075195, 5.929999351501465, 23.239999771118164, 23.239999771118164)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.83f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.2f, 7.4f)
generalPath!!.curveTo(12.990001f, 7.4f, 8.77f, 11.610001f, 8.77f, 16.82f)
generalPath!!.curveTo(8.77f, 18.33f, 9.190001f, 19.71f, 9.820001f, 20.97f)
generalPath!!.curveTo(11.070001f, 21.429998f, 12.400001f, 21.75f, 13.81f, 21.75f)
generalPath!!.curveTo(19.99f, 21.75f, 24.91f, 16.89f, 25.29f, 10.81f)
generalPath!!.curveTo(23.560001f, 8.76f, 21.080002f, 7.4000006f, 18.2f, 7.4000006f)
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(-296.79998779296875, 166.39999389648438), 6.66f, Point2D.Double(-296.79998779296875, 166.39999389648438), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 64)) ?: Color(255, 255, 255, 64))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.5929999351501465f, 0.0f, 0.0f, -2.252000093460083f, 784.5999755859375f, 385.29998779296875f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.43f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.753000020980835f, 0.6579999923706055f, -0.6488999724388123f, 0.7609000205993652f, 0.0f, 0.0f))
// _0_7
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(40.5, -0.12999999523162842, 19.0, 5.0, 4.935999870300293, 4.935999870300293)
g.paint = paint
g.stroke = stroke
g.draw(shape)
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
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return System_search(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(System_search(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { System_search(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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

    override fun setColorFilter(colorFilter: NeonIcon.ColorFilter?) {
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

