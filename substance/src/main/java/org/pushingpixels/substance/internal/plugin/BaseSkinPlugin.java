/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.substance.internal.plugin;

import org.pushingpixels.substance.api.SubstanceSkinPlugin;
import org.pushingpixels.substance.api.skin.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Core plugin for skins. See
 * {@link org.pushingpixels.substance.api.SubstanceSkinPlugin}
 * interface. This class is <b>for internal use only</b>.
 *
 * @author Kirill Grouchnikov.
 */
public class BaseSkinPlugin implements SubstanceSkinPlugin {
    @Override
    public Set<SkinInfo> getSkins() {
        Set<SkinInfo> result = new HashSet<>();
        result.add(new SkinInfo(BusinessSkin.NAME, BusinessSkin.class::getName));
        result.add(new SkinInfo(BusinessBlackSteelSkin.NAME,
                BusinessBlackSteelSkin.class::getName));
        result.add(new SkinInfo(BusinessBlueSteelSkin.NAME, BusinessBlueSteelSkin.class::getName));
        result.add(new SkinInfo(CremeSkin.NAME, CremeSkin.class::getName));
        result.add(new SkinInfo(ModerateSkin.NAME, ModerateSkin.class::getName));
        result.add(new SkinInfo(SaharaSkin.NAME, SaharaSkin.class::getName));
        result.add(new SkinInfo(RavenSkin.NAME, RavenSkin.class::getName));
        result.add(new SkinInfo(GraphiteSkin.NAME, GraphiteSkin.class::getName));
        result.add(new SkinInfo(GraphiteGlassSkin.NAME, GraphiteGlassSkin.class::getName));
        result.add(new SkinInfo(GraphiteAquaSkin.NAME, GraphiteAquaSkin.class::getName));
        result.add(new SkinInfo(GraphiteChalkSkin.NAME, GraphiteChalkSkin.class::getName));
        result.add(new SkinInfo(GraphiteElectricSkin.NAME, GraphiteElectricSkin.class::getName));
        result.add(new SkinInfo(GraphiteGoldSkin.NAME, GraphiteGoldSkin.class::getName));
        result.add(new SkinInfo(GraphiteSiennaSkin.NAME, GraphiteSiennaSkin.class::getName));
        result.add(new SkinInfo(GraphiteSunsetSkin.NAME, GraphiteSunsetSkin.class::getName));
        result.add(new SkinInfo(GreenMagicSkin.NAME, GreenMagicSkin.class::getName));
        result.add(new SkinInfo(NebulaSkin.NAME, NebulaSkin.class::getName));
        result.add(new SkinInfo(NebulaBrickWallSkin.NAME, NebulaBrickWallSkin.class::getName));
        result.add(new SkinInfo(MistSilverSkin.NAME, MistSilverSkin.class::getName));
        result.add(new SkinInfo(MistAquaSkin.NAME, MistAquaSkin.class::getName));
        result.add(new SkinInfo(AutumnSkin.NAME, AutumnSkin.class::getName));
        result.add(new SkinInfo(CremeCoffeeSkin.NAME, CremeCoffeeSkin.class::getName));
        result.add(new SkinInfo(DustSkin.NAME, DustSkin.class::getName));
        result.add(new SkinInfo(DustCoffeeSkin.NAME, DustCoffeeSkin.class::getName));
        result.add(new SkinInfo(TwilightSkin.NAME, TwilightSkin.class::getName));
        result.add(new SkinInfo(MagellanSkin.NAME, MagellanSkin.class::getName));
        result.add(new SkinInfo(GeminiSkin.NAME, GeminiSkin.class::getName));
        result.add(new SkinInfo(MarinerSkin.NAME, MarinerSkin.class::getName));
        result.add(new SkinInfo(CeruleanSkin.NAME, CeruleanSkin.class::getName));
        result.add(new SkinInfo(NightShadeSkin.NAME, NightShadeSkin.class::getName));
        result.add(new SkinInfo(NebulaAmethystSkin.NAME, NebulaAmethystSkin.class::getName));
        result.add(new SkinInfo(SentinelSkin.NAME, SentinelSkin.class::getName));

        return result;
    }
}
