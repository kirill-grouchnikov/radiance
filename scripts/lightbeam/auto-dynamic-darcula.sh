export JAVA_HOME=`/usr/libexec/java_home -v 9`
alias JAVA="java"

RADIANCE_VERSION=2.0-SNAPSHOT
CLASSPATH=../../drop/$RADIANCE_VERSION/tools/radiance-lightbeam-$RADIANCE_VERSION.jar:../../build/libs-tools/jgoodies-forms-1.9.0.jar:../../build/libs-tools/jgoodies-common-1.8.1.jar
DARCULA_CLASSPATH=../../../thirdparty/darcula.jar

java -Dswing.defaultlaf=com.bulenkov.darcula.DarculaLaf -cp $CLASSPATH:$DARCULA_CLASSPATH org.pushingpixels.lightbeam.DynamicPerformanceSuite 10
