export JAVA_HOME=`/usr/libexec/java_home -v 9`
alias JAVA="java"

RADIANCE_VERSION=1.0.00-dev
CLASSPATH=../drop/$RADIANCE_VERSION/demo/radiance-substance-tools-$RADIANCE_VERSION.jar:../build/libs-demo/fest-swing-1.2.1.jar:../build/libs-demo/fest-reflect-1.2.jar:../build/libs-demo/fest-util-1.1.3.jar:../drop/$RADIANCE_VERSION/core/radiance-substance-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/core/radiance-neon-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/core/radiance-trident-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/demo/radiance-substance-demo-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/core/radiance-substance-extras-$RADIANCE_VERSION.jar:../build/libs-demo/jgoodies-forms-1.9.0.jar:../build/libs-demo/jgoodies-common-1.8.1.jar

JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.AquaScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.BarbyPinkScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.BottleGreenScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.BrownScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.CharcoalScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.CremeScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.DarkVioletScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.EbonyScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.JadeForestScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.LightAquaScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.LimeGreenScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.OliveScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.OrangeScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.PurpleScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.RaspberryScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.SepiaScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.SteelBlueScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.SunGlareScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.SunsetScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.TerracottaScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.UltramarineScheme

JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.DerivedSaturatedScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.DerivedDesaturatedScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.DerivedInvertedScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.DerivedNegatedScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.DerivedHueShiftedScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.DerivedShadedScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.DerivedTintedScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.DerivedTonedScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.DerivedShiftedScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.main.docrobot.schemes.DerivedShiftedBackgroundScheme
