export JAVA_HOME=`/usr/libexec/java_home -v 9`
alias JAVA="java"

RADIANCE_VERSION=0.9-SNAPSHOT
CLASSPATH=../drop/$RADIANCE_VERSION/tools/radiance-substance-tools-$RADIANCE_VERSION.jar:../build/libs-demo/fest-swing-1.2.1.jar:../build/libs-demo/fest-reflect-1.2.jar:../build/libs-demo/fest-util-1.1.3.jar:../drop/$RADIANCE_VERSION/core/radiance-substance-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/core/radiance-neon-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/core/radiance-trident-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/demo/radiance-substance-demo-$RADIANCE_VERSION.jar:../drop/$RADIANCE_VERSION/core/radiance-substance-extras-$RADIANCE_VERSION.jar:../build/libs-demo/jgoodies-forms-1.9.0.jar:../build/libs-demo/jgoodies-common-1.8.1.jar

JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.BelizeScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.BloodyMoonScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.BlueYonderScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.BrickWallScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.BrownVelvetScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.CobaltSteelScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.DesertMarsScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.EarthFrescoScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.EmeraldGrassScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.FauveMauveScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.GooseberryJungleScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.GreenPearlScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.MahoganyScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.OrchidAlloyScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.PeachScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.PlacidPinkScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.SkyHighScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.SpringLeafScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.TurquoiseLakeScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.WildPineScheme
JAVA -cp $CLASSPATH org.pushingpixels.tools.substance.main.docrobot.RobotMain org.pushingpixels.tools.substance.extras.docrobot.schemes.YellowMarineScheme
