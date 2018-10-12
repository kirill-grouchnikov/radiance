export JAVA_HOME=`/usr/libexec/java_home -v 9`
alias JAVA="java"

RADIANCE_VERSION=1.5-SNAPSHOT
CLASSPATH=../../drop/$RADIANCE_VERSION/tools/radiance-lightbeam-$RADIANCE_VERSION.jar:../../build/libs-tools/jgoodies-forms-1.9.0.jar:../../build/libs-tools/jgoodies-common-1.8.1.jar
SUBSTANCE_CLASSPATH=../../drop/$RADIANCE_VERSION/core/radiance-substance-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-trident-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-neon-$RADIANCE_VERSION.jar

java -Dswing.defaultlaf=org.pushingpixels.substance.api.skin.SubstanceGeminiLookAndFeel -cp $CLASSPATH:$SUBSTANCE_CLASSPATH org.pushingpixels.lightbeam.DynamicPerformanceSuite 10
