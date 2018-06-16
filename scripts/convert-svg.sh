RADIANCE_VERSION=0.9-dev
CLASSPATH=../drop/$RADIANCE_VERSION/core/radiance-ibis-$RADIANCE_VERSION.jar:../build/libs-core/batik-all-1.10.jar:../build/libs-core/xml-apis-1.3.04.jar:../build/libs-core/xml-apis-ext-1.3.04.jar:../build/libs-core/xmlgraphics-commons-2.2.jar

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../kormorant-demo/src/main/kotlin/org/pushingpixels/demo/kormorant/svg outputPackageName=org.pushingpixels.demo.kormorant.svg templateFile=/org/pushingpixels/ibis/transcoder/kotlin/SvgTranscoderTemplateResizable.templ outputLanguage=kotlin

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../flamingo-demo/src/main/java/org/pushingpixels/demo/flamingo/svg/tango/transcoded outputPackageName=org.pushingpixels.demo.flamingo.svg.tango.transcoded templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../flamingo-demo/src/main/java/org/pushingpixels/demo/flamingo/svg/logo outputPackageName=org.pushingpixels.demo.flamingo.svg.logo templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../flamingo-demo/src/main/java/org/pushingpixels/demo/flamingo/svg/filetypes/transcoded outputPackageName=org.pushingpixels.demo.flamingo.svg.filetypes.transcoded templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputClassNamePrefix=ext_ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../substance/src/main/java/org/pushingpixels/substance/internal/svg outputPackageName=org.pushingpixels.substance.internal.svg templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../substance-demo/src/main/java/org/pushingpixels/demo/substance/main/check/svg outputPackageName=org.pushingpixels.demo.substance.main.check.svg templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../substance-demo/src/main/java/org/pushingpixels/demo/substance/main/check/svg/flags outputPackageName=org.pushingpixels.demo.substance.main.check.svg.flags templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../substance-demo/src/main/java/org/pushingpixels/demo/substance/main/check/svg/tango outputPackageName=org.pushingpixels.demo.substance.main.check.svg.tango templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../substance-swingx/src/main/java/org/pushingpixels/substance/swingx/svg outputPackageName=org.pushingpixels.substance.swingx.svg templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../substance-tools/src/main/java/org/pushingpixels/tools/substance/main/docrobot/svg outputPackageName=org.pushingpixels.tools.substance.main.docrobot.svg templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java 

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../substance-samples/src/main/java/org/pushingpixels/samples/substance/mail/svg outputPackageName=org.pushingpixels.samples.substance.mail.svg templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../substance-samples/src/main/java/org/pushingpixels/samples/substance/cookbook/svg outputPackageName=org.pushingpixels.samples.substance.cookbook.svg templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../substance-samples/src/main/java/org/pushingpixels/samples/substance/chat/svg outputPackageName=org.pushingpixels.samples.substance.chat.svg templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../rainbow/src/main/java/org/pushingpixels/rainbow/svg outputPackageName=org.pushingpixels.rainbow.svg templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.ibis.transcoder.SvgBatchConverter sourceFolder=../substance-tools/src/main/java/org/pushingpixels/tools/substance/jitterbug/ outputPackageName=org.pushingpixels.tools.substance.jitterbug templateFile=/org/pushingpixels/ibis/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

