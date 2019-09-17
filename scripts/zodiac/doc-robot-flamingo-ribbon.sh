#
#  Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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

RADIANCE_VERSION=3.0-SNAPSHOT
KOTLIN_VERSION=1.3.50
CLASSPATH=../../drop/$RADIANCE_VERSION/tools/radiance-zodiac-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/tools/radiance-tools-common-$RADIANCE_VERSION.jar:../../build/libs-tools/fest-swing-1.2.1.jar:../../build/libs-tools/fest-reflect-1.2.jar:../../build/libs-tools/fest-util-1.1.3.jar:../../drop/$RADIANCE_VERSION/core/radiance-substance-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-neon-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-trident-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/demo/radiance-flamingo-demo-$RADIANCE_VERSION.jar:../../drop/$RADIANCE_VERSION/core/radiance-flamingo-$RADIANCE_VERSION.jar:../../build/libs-tools/jgoodies-forms-1.9.0.jar:../../build/libs-tools/jgoodies-common-1.8.1.jar

JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Autumn ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Business ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.BusinessBlackSteel ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.BusinessBlueSteel ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Cerulean ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Creme ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.CremeCoffee ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Dust ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.DustCoffee ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Gemini ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Graphite ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.GraphiteAqua ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.GraphiteChalk ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.GraphiteElectric ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.GraphiteGlass ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.GraphiteGold ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.GraphiteSunset ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Magellan ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Mariner ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.MistAqua ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.MistSilver ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Moderate ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Nebula ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.NebulaAmethyst ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.NebulaBrickWall ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.NightShade ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Raven ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Sahara ../../docs/images/
JAVA -cp $CLASSPATH org.pushingpixels.tools.zodiac.RobotMain org.pushingpixels.tools.zodiac.flamingo.skins.Twilight ../../docs/images/
