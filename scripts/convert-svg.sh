# 
#  Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
# 
#  Redistribution and use in source and binary forms, with or without
#  modification, are permitted provided that the following conditions are met:
# 
#   o Redistributions of source code must retain the above copyright notice,
#     this list of conditions and the following disclaimer.
# 
#   o Redistributions in binary form must reproduce the above copyright notice,
#     this list of conditions and the following disclaimer in the documentation
#     and/or other materials provided with the distribution.
# 
#   o Neither the name of the copyright holder nor the names of
#     its contributors may be used to endorse or promote products derived
#     from this software without specific prior written permission.
# 
#  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
#  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
#  THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
#  PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
#  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
#  EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
#  PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
#  OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
#  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
#  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
#  EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

export JAVA_HOME=`/usr/libexec/java_home -v 9`
alias JAVA="java"

RADIANCE_VERSION=4.0-SNAPSHOT
CLASSPATH=../drop/$RADIANCE_VERSION/core/radiance-photon-$RADIANCE_VERSION.jar:../build/libs-core/batik-all-1.13.jar:../build/libs-core/xml-apis-1.4.01.jar:../build/libs-core/xml-apis-ext-1.3.04.jar:../build/libs-core/xmlgraphics-commons-2.4.jar

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/plasma-demo/src/main/kotlin/org/pushingpixels/demo/plasma/svg outputPackageName=org.pushingpixels.demo.plasma.svg templateFile=/org/pushingpixels/photon/api/transcoder/kotlin/SvgTranscoderTemplateResizable.templ outputLanguage=kotlin

# Don't convert the flamingo-demo transcoding to deep traversal since one of the
# folders needs class name prefix while others don't
java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/flamingo-demo/src/main/java/org/pushingpixels/demo/flamingo/svg/tango/transcoded outputPackageName=org.pushingpixels.demo.flamingo.svg.tango.transcoded templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/flamingo-demo/src/main/java/org/pushingpixels/demo/flamingo/svg/material/transcoded outputPackageName=org.pushingpixels.demo.flamingo.svg.material.transcoded templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/flamingo-demo/src/main/java/org/pushingpixels/demo/flamingo/svg/bigflag outputPackageName=org.pushingpixels.demo.flamingo.svg.bigflag templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/flamingo-demo/src/main/java/org/pushingpixels/demo/flamingo/svg/text outputPackageName=org.pushingpixels.demo.flamingo.svg.text templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/flamingo-demo/src/main/java/org/pushingpixels/demo/flamingo/svg/logo outputPackageName=org.pushingpixels.demo.flamingo.svg.logo templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/flamingo-demo/src/main/java/org/pushingpixels/demo/flamingo/svg/filetypes/transcoded outputPackageName=org.pushingpixels.demo.flamingo.svg.filetypes.transcoded templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputClassNamePrefix=ext_ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../substance/src/main/java/org/pushingpixels/substance/internal/svg outputPackageName=org.pushingpixels.substance.internal.svg templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/neon-demo/src/main/kotlin/org/pushingpixels/demo/neon outputPackageName=org.pushingpixels.demo.neon templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

# Don't convert the substance-demo transcoding to deep traversal since one of the
# folders needs class name prefix while others don't
java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/substance-demo/src/main/java/org/pushingpixels/demo/substance/main/check/svg outputPackageName=org.pushingpixels.demo.substance.main.check.svg templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/substance-demo/src/main/java/org/pushingpixels/demo/substance/main/check/svg/flags outputPackageName=org.pushingpixels.demo.substance.main.check.svg.flags templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/substance-demo/src/main/java/org/pushingpixels/demo/substance/main/check/svg/filetypes outputPackageName=org.pushingpixels.demo.substance.main.check.svg.filetypes templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputClassNamePrefix=ext_ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/substance-demo/src/main/java/org/pushingpixels/demo/substance/main/check/svg/tango outputPackageName=org.pushingpixels.demo.substance.main.check.svg.tango templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/substance-demo/src/main/java/org/pushingpixels/demo/substance/main/check/svg/vaadin outputPackageName=org.pushingpixels.demo.substance.main.check.svg.vaadin templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

# Use deep traversal for all Spyglass demo SVG files
java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgDeepBatchConverter sourceRootFolder=../demos/spyglass/src/main/java/org/pushingpixels/demo/spyglass/ outputRootPackageName=org.pushingpixels.demo.spyglass templateFile=/org/pushingpixels/photon/api/transcoder/java/SvgTranscoderTemplateResizable.templ outputLanguage=java

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../demos/rainbow/src/main/kotlin/org/pushingpixels/demo/rainbow/svg outputPackageName=org.pushingpixels.demo.rainbow.svg templateFile=/org/pushingpixels/photon/api/transcoder/kotlin/SvgTranscoderTemplateResizable.templ outputLanguage=kotlin

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../tools/tools-common/src/main/kotlin/org/pushingpixels/tools/common/ outputPackageName=org.pushingpixels.tools.common templateFile=/org/pushingpixels/photon/api/transcoder/kotlin/SvgTranscoderTemplateResizable.templ outputLanguage=kotlin

java -cp $CLASSPATH org.pushingpixels.photon.api.transcoder.SvgBatchConverter sourceFolder=../tools/apollo/src/main/kotlin/org/pushingpixels/tools/apollo/svg/ outputPackageName=org.pushingpixels.tools.apollo.svg templateFile=/org/pushingpixels/photon/api/transcoder/kotlin/SvgTranscoderTemplateResizable.templ outputLanguage=kotlin
