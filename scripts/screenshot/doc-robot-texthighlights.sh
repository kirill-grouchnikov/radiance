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

RADIANCE_VERSION=5.0-SNAPSHOT
KOTLIN_VERSION=1.5.30
KOTLIN_COROUTINES_VERSION=1.5.2
CLASSPATH=../../drop/$RADIANCE_VERSION/tools/radiance-screenshot-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/tools/radiance-tools-common-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-laf-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-laf-extras-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-common-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-animation-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/demo/radiance-laf-demo-$RADIANCE_VERSION.jar:../../build/libs-tools/jgoodies-forms-1.9.0.jar:../../build/libs-tools/jgoodies-common-1.8.1.jar:../../build/libs-tools/kotlin-stdlib-$KOTLIN_VERSION.jar:../../build/libs-tools/kotlin-stdlib-common-$KOTLIN_VERSION.jar:../../build/libs-tools/kotlinx-coroutines-core-jvm-$KOTLIN_COROUTINES_VERSION.jar:../../build/libs-tools/kotlinx-coroutines-swing-$KOTLIN_COROUTINES_VERSION.jar

JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Autumn ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Business ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.BusinessBlackSteel ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.BusinessBlueSteel ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Cerulean ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Creme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.CremeCoffee ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Dust ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.DustCoffee ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Gemini ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Graphite ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.GraphiteAqua ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.GraphiteChalk ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.GraphiteElectric ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.GraphiteGlass ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.GraphiteGold ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.GraphiteSienna ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.GraphiteSunset ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Magellan ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Mariner ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.MistAqua ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.MistSilver ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Moderate ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Nebula ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.NebulaAmethyst ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.NebulaBrickWall ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.NightShade ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Raven ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Sahara ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Sentinel ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.radiance.tools.screenshot.RobotMain org.pushingpixels.radiance.tools.screenshot.laf.text.Twilight ../../docs/images/
