export JAVA_HOME=`/usr/libexec/java_home -v 9`
alias JAVA="java"

RADIANCE_VERSION=0.9-SNAPSHOT
CLASSPATH=../../drop/$RADIANCE_VERSION/tools/radiance-zodiac-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/tools/radiance-tools-common-$RADIANCE_VERSION.jar:../../build/libs-tools/fest-swing-1.2.1.jar:../../build/libs-tools/fest-reflect-1.2.jar:../../build/libs-tools/fest-util-1.1.3.jar:../../drop/$RADIANCE_VERSION/core/radiance-substance-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-substance-extras-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-neon-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-trident-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/demo/radiance-substance-demo-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-substance-extras-$RADIANCE_VERSION.jar:../../build/libs-tools/jgoodies-forms-1.9.0.jar:../../build/libs-tools/jgoodies-common-1.8.1.jar

JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.skins.FieldOfWheat ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.skins.FindingNemo ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.skins.GreenMagic ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.skins.Magma ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.skins.Mango ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.skins.Streetlights ../../docs/images/

