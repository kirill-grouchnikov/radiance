# 
#  Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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

RADIANCE_VERSION=6.5-SNAPSHOT
CLASSPATH=../drop/$RADIANCE_VERSION/tools/radiance-svg-transcoder-$RADIANCE_VERSION.jar:../build/libs-tools/batik-all-1.14.jar:../build/libs-tools/xml-apis-1.4.01.jar:../build/libs-tools/xml-apis-ext-1.3.04.jar:../build/libs-tools/xmlgraphics-commons-2.6.jar

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/component-ktx-demo/src/main/kotlin/org/pushingpixels/radiance/demo/component/ktx outputPackageName=org.pushingpixels.radiance.demo.component.ktx templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/kotlin/SvgTranscoderTemplateRadiance.templ outputLanguage=kotlin

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/component-ktx-demo/src/main/kotlin/org/pushingpixels/radiance/demo/component/ktx/svg outputPackageName=org.pushingpixels.radiance.demo.component.ktx.svg templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/kotlin/SvgTranscoderTemplateRadiance.templ outputLanguage=kotlin

# Don't convert the component-demo transcoding to deep traversal since one of the
# folders needs class name prefix while others don't
java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/component-demo/src/main/java/org/pushingpixels/radiance/demo/component/svg/tango/transcoded outputPackageName=org.pushingpixels.radiance.demo.component.svg.tango.transcoded templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/component-demo/src/main/java/org/pushingpixels/radiance/demo/component/svg/material/transcoded outputPackageName=org.pushingpixels.radiance.demo.component.svg.material.transcoded templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/component-demo/src/main/java/org/pushingpixels/radiance/demo/component/svg/bigflag outputPackageName=org.pushingpixels.radiance.demo.component.svg.bigflag templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/component-demo/src/main/java/org/pushingpixels/radiance/demo/component/svg/text outputPackageName=org.pushingpixels.radiance.demo.component.svg.text templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/component-demo/src/main/java/org/pushingpixels/radiance/demo/component/svg/logo outputPackageName=org.pushingpixels.radiance.demo.component.svg.logo templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/component-demo/src/main/java/org/pushingpixels/radiance/demo/component/svg/filetypes/transcoded outputPackageName=org.pushingpixels.radiance.demo.component.svg.filetypes.transcoded templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputClassNamePrefix=ext_ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../component/src/main/java/org/pushingpixels/radiance/component/internal/svg outputPackageName=org.pushingpixels.radiance.component.internal.svg templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../theming/src/main/java/org/pushingpixels/radiance/theming/internal/svg outputPackageName=org.pushingpixels.radiance.theming.internal.svg templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/common-demo/src/main/kotlin/org/pushingpixels/radiance/demo/common outputPackageName=org.pushingpixels.radiance.demo.common templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

# Don't convert the theming-demo transcoding to deep traversal since one of the
# folders needs class name prefix while others don't
java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/theming-demo/src/main/java/org/pushingpixels/radiance/demo/theming/main/check/svg outputPackageName=org.pushingpixels.radiance.demo.theming.main.check.svg templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/theming-demo/src/main/java/org/pushingpixels/radiance/demo/theming/main/check/svg/flags outputPackageName=org.pushingpixels.radiance.demo.theming.main.check.svg.flags templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/theming-demo/src/main/java/org/pushingpixels/radiance/demo/theming/main/check/svg/filetypes outputPackageName=org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputClassNamePrefix=ext_ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/theming-demo/src/main/java/org/pushingpixels/radiance/demo/theming/main/check/svg/tango outputPackageName=org.pushingpixels.radiance.demo.theming.main.check.svg.tango templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../demos/theming-demo/src/main/java/org/pushingpixels/radiance/demo/theming/main/check/svg/vaadin outputPackageName=org.pushingpixels.radiance.demo.theming.main.check.svg.vaadin templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

# Use deep traversal for all theming apps SVG files
java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgDeepBatchConverter sourceRootFolder=../demos/theming-apps/src/main/java/org/pushingpixels/radiance/demo/themingapps/ outputRootPackageName=org.pushingpixels.radiance.demo.themingapps templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/java/SvgTranscoderTemplateRadiance.templ outputLanguage=java

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../tools/tools-common/src/main/kotlin/org/pushingpixels/radiance/tools/common/ outputPackageName=org.pushingpixels.radiance.tools.common templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/kotlin/SvgTranscoderTemplateRadiance.templ outputLanguage=kotlin

java -Djava.awt.headless=true -cp $CLASSPATH org.pushingpixels.radiance.tools.svgtranscoder.api.SvgBatchConverter sourceFolder=../tools/scheme-editor/src/main/kotlin/org/pushingpixels/radiance/tools/schemeeditor/svg/ outputPackageName=org.pushingpixels.radiance.tools.schemeeditor.svg templateFile=/org/pushingpixels/radiance/tools/svgtranscoder/api/kotlin/SvgTranscoderTemplateRadiance.templ outputLanguage=kotlin
