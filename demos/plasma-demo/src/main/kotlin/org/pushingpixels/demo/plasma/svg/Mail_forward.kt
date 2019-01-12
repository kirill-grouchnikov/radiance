package org.pushingpixels.demo.plasma.svg

import java.awt.*
import java.awt.geom.*
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.neon.icon.ResizableIconFactory
import org.pushingpixels.neon.icon.ResizableIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Mail_forward(private var width: Int, private var height: Int) : ResizableIcon {
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
g.transform(AffineTransform(1.0136200189590454f, 0.0f, 0.0f, -1.0136200189590454f, 11.129389762878418f, -8.619853973388672f))
// _0_0_0
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 0.3f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.596972942352295f, 0.0f, 0.0f, 1.5260640382766724f, 3.9802498817443848f, -19.785049438476562f))
// _0_0_1
paint = RadialGradientPaint(Point2D.Double(6.7027130126953125, 73.61571502685547), 7.228416f, Point2D.Double(6.7027130126953125, 73.61571502685547), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.9022150039672852f, 0.0f, 0.0f, 0.5257030129432678f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(26.5, 38.7)
shape.curveTo(26.522034, 40.061657, 23.90613, 41.322495, 19.642813, 42.00509)
shape.curveTo(15.379496, 42.68768, 10.120504, 42.68768, 5.8571877, 42.00509)
shape.curveTo(1.5938711, 41.322495, -1.0220345, 40.061657, -1.0, 38.7)
shape.curveTo(-1.0220345, 37.338345, 1.5938711, 36.077507, 5.8571877, 35.394913)
shape.curveTo(10.120504, 34.712322, 15.379496, 34.712322, 19.642813, 35.394913)
shape.curveTo(23.90613, 36.077507, 26.522034, 37.338345, 26.5, 38.7)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0047270059585571f, 0.0f, 0.0f, 1.001608967781067f, 0.042089998722076416f, -8.972783088684082f))
// _0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_0
paint = LinearGradientPaint(Point2D.Double(11.57284164428711, 4.746162414550781), Point2D.Double(18.47528648376465, 26.02290916442871), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(226, 226, 226, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3434749841690063f, 0.0f, 0.0f, 1.5058460235595703f, 2.8795111179351807f, -2.2660179138183594f))
shape = GeneralPath()
shape.moveTo(6.34375, 15.454879)
shape.lineTo(6.34375, 41.44216)
shape.lineTo(43.3125, 41.44216)
shape.lineTo(43.25, 15.554447)
shape.curveTo(43.24999, 15.548732, 43.250374, 15.527358, 43.25, 15.521258)
shape.curveTo(43.249268, 15.514776, 43.251087, 15.494928, 43.25, 15.488068)
shape.curveTo(43.24856, 15.480833, 43.22054, 15.462487, 43.21875, 15.454879)
shape.lineTo(6.34375, 15.454879)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(136, 138, 133, 255)
stroke = BasicStroke(0.99684346f,0,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(6.34375, 15.454879)
shape.lineTo(6.34375, 41.44216)
shape.lineTo(43.3125, 41.44216)
shape.lineTo(43.25, 15.554447)
shape.curveTo(43.24999, 15.548732, 43.250374, 15.527358, 43.25, 15.521258)
shape.curveTo(43.249268, 15.514776, 43.251087, 15.494928, 43.25, 15.488068)
shape.curveTo(43.24856, 15.480833, 43.22054, 15.462487, 43.21875, 15.454879)
shape.lineTo(6.34375, 15.454879)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_1
paint = LinearGradientPaint(Point2D.Double(9.164306640625, 38.070892333984375), Point2D.Double(9.885503768920898, 52.09067916870117), floatArrayOf(0.0f,0.23809524f,1.0f), arrayOf(Color(223, 224, 223, 255),Color(166, 176, 166, 255),Color(181, 190, 181, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.4547810554504395f, 0.0f, 0.0f, 0.762004017829895f, 2.8817501068115234f, 0.33738601207733154f))
shape = GeneralPath()
shape.moveTo(20.490673, 29.058712)
shape.lineTo(7.09471, 40.0307)
shape.lineTo(21.003551, 30.426394)
shape.lineTo(30.02171, 30.426394)
shape.lineTo(42.440758, 39.90859)
shape.lineTo(30.577332, 29.058712)
shape.lineTo(20.490673, 29.058712)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_2
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(0.9968433f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(7.4471445, 16.725622)
shape.curveTo(7.440469, 16.738968, 7.4525223, 16.74528, 7.4471445, 16.757236)
shape.curveTo(7.4447837, 16.762865, 7.4180174, 16.783579, 7.415987, 16.788853)
shape.curveTo(7.4142895, 16.793766, 7.417349, 16.81591, 7.415987, 16.820465)
shape.curveTo(7.414963, 16.82466, 7.416671, 16.848255, 7.415987, 16.852081)
shape.lineTo(7.4471445, 40.341904)
shape.lineTo(42.28123, 40.341904)
shape.lineTo(42.218914, 16.97854)
shape.curveTo(42.21823, 16.974827, 42.219936, 16.951012, 42.218914, 16.946924)
shape.curveTo(42.2043, 16.898813, 42.177208, 16.814676, 42.125443, 16.725622)
shape.lineTo(7.4471445, 16.725622)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_3
paint = RadialGradientPaint(Point2D.Double(27.741130828857422, 38.71150588989258), 17.977943f, Point2D.Double(27.741130828857422, 38.71150588989258), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 33),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.6299290060997009f, 0.45937299728393555f, -0.14767499268054962f, 0.24851199984550476f, 16.517240524291992f, 9.053736686706543f))
shape = GeneralPath()
shape.moveTo(23.329298, 32.99672)
shape.curveTo(20.93719, 32.550377, 7.9003873, 18.771126, 6.596606, 16.372023)
shape.curveTo(6.5816493, 16.343449, 6.5559707, 16.288609, 6.5446897, 16.2636)
shape.lineTo(41.057804, 16.2636)
shape.curveTo(40.780724, 18.766403, 33.533577, 32.769344, 31.496525, 32.99672)
shape.curveTo(31.488352, 32.99719, 31.475246, 32.99672, 31.46725, 32.99672)
shape.lineTo(23.446392, 32.99672)
shape.curveTo(23.412766, 32.99672, 23.368837, 33.0041, 23.329298, 32.99672)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_4
paint = LinearGradientPaint(Point2D.Double(11.742170333862305, 11.484869956970215), Point2D.Double(13.846982955932617, 11.98198127746582), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(226, 226, 226, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2960150241851807f, 0.0f, 0.0f, -1.4369200468063354f, 3.7465760707855225f, 33.20515823364258f))
shape = GeneralPath()
shape.moveTo(20.77475, 31.085394)
shape.curveTo(18.407309, 30.694258, 7.945269, 18.619434, 7.118584, 16.51709)
shape.curveTo(7.109327, 16.49205, 7.094677, 16.443993, 7.088438, 16.42208)
shape.lineTo(42.630646, 16.42208)
shape.curveTo(41.80703, 18.6153, 31.332195, 30.886145, 29.185501, 31.085394)
shape.curveTo(29.176985, 31.085802, 29.16359, 31.085394, 29.155355, 31.085394)
shape.lineTo(20.895334, 31.085394)
shape.curveTo(20.860706, 31.085394, 20.81388, 31.091858, 20.77475, 31.085394)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(152, 152, 152, 255)
stroke = BasicStroke(0.85390013f,0,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(20.77475, 31.085394)
shape.curveTo(18.407309, 30.694258, 7.945269, 18.619434, 7.118584, 16.51709)
shape.curveTo(7.109327, 16.49205, 7.094677, 16.443993, 7.088438, 16.42208)
shape.lineTo(42.630646, 16.42208)
shape.curveTo(41.80703, 18.6153, 31.332195, 30.886145, 29.185501, 31.085394)
shape.curveTo(29.176985, 31.085802, 29.16359, 31.085394, 29.155355, 31.085394)
shape.lineTo(20.895334, 31.085394)
shape.curveTo(20.860706, 31.085394, 20.81388, 31.091858, 20.77475, 31.085394)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_5
paint = LinearGradientPaint(Point2D.Double(10.027000427246094, 20.21976089477539), Point2D.Double(17.178024291992188, -7.527464389801025), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(226, 226, 226, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.5706069469451904f, 0.0f, 0.0f, -1.2315109968185425f, 2.973436117172241f, 33.3348503112793f))
shape = GeneralPath()
shape.moveTo(20.625174, 30.490479)
shape.curveTo(18.51921, 29.999928, 7.7224803, 17.98771, 7.0314245, 16.466377)
shape.curveTo(7.028888, 16.460379, 7.033602, 16.43969, 7.0314245, 16.434063)
shape.curveTo(7.0259733, 16.418306, 7.002328, 16.381763, 7.0001745, 16.369436)
shape.curveTo(7.000203, 16.366104, 6.9997683, 16.34006, 7.0001745, 16.337122)
shape.curveTo(7.0013437, 16.334982, 7.0298696, 16.33886, 7.0314245, 16.337122)
shape.lineTo(7.1251745, 16.240181)
shape.lineTo(42.593925, 16.240181)
shape.curveTo(42.59121, 16.264507, 42.57124, 16.307055, 42.562675, 16.337122)
shape.curveTo(42.555172, 16.360727, 42.542103, 16.407354, 42.531425, 16.434063)
shape.curveTo(41.609325, 18.615, 31.023436, 30.200512, 29.187674, 30.490479)
shape.curveTo(29.172747, 30.492123, 29.138826, 30.490479, 29.125174, 30.490479)
shape.lineTo(20.750174, 30.490479)
shape.curveTo(20.719887, 30.488811, 20.66042, 30.49869, 20.625174, 30.490479)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_6
paint = LinearGradientPaint(Point2D.Double(11.841544151306152, 4.250730514526367), Point2D.Double(40.0240592956543, 7.412107467651367), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(237, 237, 237, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3709280490875244f, 0.0f, 0.0f, -1.4645600318908691f, 2.525057077407837f, 33.71268844604492f))
stroke = BasicStroke(0.85389996f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(20.875174, 30.051142)
shape.curveTo(18.427216, 29.50167, 8.704, 18.433899, 7.5314245, 16.451725)
shape.lineTo(42.125175, 16.451725)
shape.curveTo(40.634987, 18.784897, 31.078503, 29.863516, 28.968924, 30.051142)
shape.curveTo(28.96018, 30.051542, 28.946142, 30.051142, 28.937674, 30.051142)
shape.lineTo(21.031424, 30.051142)
shape.curveTo(21.00503, 30.051142, 20.966541, 30.054691, 20.937674, 30.051142)
shape.curveTo(20.917889, 30.047995, 20.896025, 30.05582, 20.875174, 30.051142)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_7
paint = LinearGradientPaint(Point2D.Double(17.39720344543457, 33.35737609863281), Point2D.Double(22.177709579467773, 31.02674102783203), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(20.95951, 30.447113)
shape.lineTo(9.018012, 38.717968)
shape.lineTo(11.237445, 38.724075)
shape.lineTo(21.23557, 31.855137)
shape.lineTo(30.057478, 30.432299)
shape.lineTo(20.95951, 30.447113)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2_7
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3_0 = g.transform
g.transform(AffineTransform(-0.8457019925117493f, 0.0f, 0.0f, -0.8457019925117493f, 51.403228759765625f, 49.140480041503906f))
// _0_0_3_0
paint = LinearGradientPaint(Point2D.Double(32.707862854003906, 28.042139053344727), Point2D.Double(43.98674392700195, 34.40784454345703), floatArrayOf(0.0f,1.0f), arrayOf(Color(253, 157, 20, 255),Color(255, 200, 121, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(49.78573, 36.46161)
shape.curveTo(31.871506, 29.801214, 51.855164, 14.067224, 22.462412, 12.49765)
shape.lineTo(22.462412, 3.1222396)
shape.lineTo(5.81393, 17.708818)
shape.lineTo(22.462412, 33.006348)
shape.curveTo(22.462412, 33.006348, 22.462412, 23.337969, 22.462412, 23.337969)
shape.curveTo(39.481644, 22.456387, 30.293505, 37.380238, 49.78573, 36.46161)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(32.707862854003906, 28.042139053344727), Point2D.Double(43.98674392700195, 34.40784454345703), floatArrayOf(0.0f,1.0f), arrayOf(Color(159, 98, 11, 255),Color(255, 200, 121, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(1.1824504f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(49.78573, 36.46161)
shape.curveTo(31.871506, 29.801214, 51.855164, 14.067224, 22.462412, 12.49765)
shape.lineTo(22.462412, 3.1222396)
shape.lineTo(5.81393, 17.708818)
shape.lineTo(22.462412, 33.006348)
shape.curveTo(22.462412, 33.006348, 22.462412, 23.337969, 22.462412, 23.337969)
shape.curveTo(39.481644, 22.456387, 30.293505, 37.380238, 49.78573, 36.46161)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_3_0
g.composite = AlphaComposite.getInstance(3, 0.7f * origAlpha)
val defaultTransform__0_0_3_1 = g.transform
g.transform(AffineTransform(-0.8457019925117493f, 0.0f, 0.0f, -0.8457019925117493f, 51.403228759765625f, 49.140480041503906f))
// _0_0_3_1
paint = LinearGradientPaint(Point2D.Double(23.70759391784668, 11.027570724487305), Point2D.Double(36.172122955322266, 50.995052337646484), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9141139984130859f, 1.412791001969375E-16f, -1.412791001969375E-16f, 0.9141139984130859f, -3.8686978816986084f, -2.706902027130127f))
stroke = BasicStroke(1.1824498f,0,0,10.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(44.926064, 35.103043)
shape.curveTo(33.88701, 28.727802, 48.67967, 14.639454, 21.448702, 13.549959)
shape.lineTo(21.448702, 5.4508677)
shape.curveTo(21.448702, 5.4508677, 7.400963, 17.714588, 7.400963, 17.714588)
shape.lineTo(21.448702, 30.658617)
shape.curveTo(21.448702, 30.658617, 21.448702, 22.38098, 21.448702, 22.38098)
shape.curveTo(37.544903, 20.111229, 34.13055, 34.399548, 44.926064, 35.103043)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_3_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3_2
paint = LinearGradientPaint(Point2D.Double(11.6875, 14.319357872009277), Point2D.Double(37.11378479003906, 36.08745193481445), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(32.84375, 38.1875)
shape.lineTo(32.78125, 45.5)
shape.lineTo(45.875, 34.15625)
shape.lineTo(32.84375, 22.09375)
shape.curveTo(32.84375, 22.093752, 32.78125, 29.65625, 32.78125, 29.65625)
shape.curveTo(20.26305, 32.276806, 23.547112, 18.410612, 11.6875, 18.9375)
shape.curveTo(22.872463, 24.02322, 9.730253, 37.29154, 32.84375, 38.1875)
shape.closePath()
shape.moveTo(40.78125, 29.625)
shape.curveTo(40.860493, 29.62021, 40.917072, 29.627337, 41.0, 29.625)
shape.lineTo(45.8125, 34.1875)
shape.lineTo(32.875, 45.46875)
shape.lineTo(32.78125, 38.15625)
shape.lineTo(28.59375, 37.625)
shape.curveTo(37.938694, 35.04962, 35.789047, 29.926678, 40.78125, 29.625)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_3_2
g.transform = defaultTransform__0_0_3
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
            return 2.348088502883911
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 6.0077385902404785
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 44.88691329956055
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 41.595096588134766
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): ResizableIcon {
            return Mail_forward(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): ResizableIconUIResource {
            return ResizableIconUIResource(Mail_forward(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): ResizableIconFactory {
            return ResizableIconFactory { Mail_forward(16, 16) }
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

