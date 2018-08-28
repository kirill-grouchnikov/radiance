export JAVA_HOME=`/usr/libexec/java_home -v 9`
alias JAVA="java"

RADIANCE_VERSION=0.9-SNAPSHOT
CLASSPATH=../drop/$RADIANCE_VERSION/tools/radiance-substance-tools-$RADIANCE_VERSION.jar:../build/libs-demo/fest-swing-1.2.1.jar:../build/libs-demo/fest-reflect-1.2.jar:../build/libs-demo/fest-util-1.1.3.jar:../drop/$RADIANCE_VERSION/core/radiance-substance-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/core/radiance-neon-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/core/radiance-trident-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/demo/radiance-substance-demo-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/core/radiance-substance-extras-$RADIANCE_VERSION.jar:../build/libs-demo/jgoodies-forms-1.9.0.jar:../build/libs-demo/jgoodies-common-1.8.1.jar

JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.BinaryWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.BrushedMetalWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.BubblesWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.CrosshatchWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.ExceedWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.FlameFractalKaleidoscopeWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.FlameFractalScripturesWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.FlameFractalSingularityWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.FlameFractalVortexWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.KatakanaWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.LatchWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.MetalWallWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.MosaicWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.NoiseCopperplateEngravingWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.NoiseFabricWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.NoiseMagneticFieldWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.NoiseMarbleVeinWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.NoiseMazeWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.NoisePlanktonWatermark
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.watermarks.NoiseWoodWatermark
