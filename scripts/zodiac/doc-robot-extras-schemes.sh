export JAVA_HOME=`/usr/libexec/java_home -v 9`
alias JAVA="java"

RADIANCE_VERSION=0.9-SNAPSHOT
CLASSPATH=../../drop/$RADIANCE_VERSION/tools/radiance-zodiac-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/tools/radiance-tools-common-$RADIANCE_VERSION.jar:../../build/libs-tools/fest-swing-1.2.1.jar:../../build/libs-tools/fest-reflect-1.2.jar:../../build/libs-tools/fest-util-1.1.3.jar:../../drop/$RADIANCE_VERSION/core/radiance-substance-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-substance-extras-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-neon-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-trident-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/demo/radiance-substance-demo-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-substance-extras-$RADIANCE_VERSION.jar:../../build/libs-tools/jgoodies-forms-1.9.0.jar:../../build/libs-tools/jgoodies-common-1.8.1.jar

JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.BelizeScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.BloodyMoonScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.BlueYonderScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.BrickWallScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.BrownVelvetScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.CobaltSteelScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.DesertMarsScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.EarthFrescoScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.EmeraldGrassScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.FauveMauveScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.GooseberryJungleScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.GreenPearlScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.MahoganyScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.OrchidAlloyScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.PeachScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.PlacidPinkScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.SkyHighScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.SpringLeafScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.TurquoiseLakeScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.WildPineScheme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.substance.extras.schemes.YellowMarineScheme ../../docs/images/
