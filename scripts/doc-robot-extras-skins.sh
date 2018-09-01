export JAVA_HOME=`/usr/libexec/java_home -v 9`
alias JAVA="java"

RADIANCE_VERSION=0.9-SNAPSHOT
CLASSPATH=../drop/$RADIANCE_VERSION/tools/radiance-substance-tools-$RADIANCE_VERSION.jar:../build/libs-demo/fest-swing-1.2.1.jar:../build/libs-demo/fest-reflect-1.2.jar:../build/libs-demo/fest-util-1.1.3.jar:../drop/$RADIANCE_VERSION/core/radiance-substance-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/core/radiance-neon-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/core/radiance-trident-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/demo/radiance-substance-demo-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/core/radiance-substance-extras-$RADIANCE_VERSION.jar:../build/libs-demo/jgoodies-forms-1.9.0.jar:../build/libs-demo/jgoodies-common-1.8.1.jar

JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.skins.FieldOfWheat
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.skins.FindingNemo
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.skins.GreenMagic
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.skins.Magma
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.skins.Mango
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.skins.Streetlights

