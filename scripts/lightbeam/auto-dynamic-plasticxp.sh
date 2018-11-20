export JAVA_HOME=`/usr/libexec/java_home -v 9`
alias JAVA="java"

RADIANCE_VERSION=2.0-SNAPSHOT
CLASSPATH=../../drop/$RADIANCE_VERSION/tools/radiance-lightbeam-$RADIANCE_VERSION.jar:../../build/libs-tools/jgoodies-forms-1.9.0.jar:../../build/libs-tools/jgoodies-common-1.8.1.jar
PLASTIC_CLASSPATH=../../../thirdparty/jgoodies/jgoodies-looks-2.5.3.jar

java -Dswing.defaultlaf=com.jgoodies.looks.plastic.PlasticXPLookAndFeel -cp $CLASSPATH:$PLASTIC_CLASSPATH org.pushingpixels.lightbeam.DynamicPerformanceSuite 10
