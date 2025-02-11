/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.plugin;

import org.pushingpixels.radiance.theming.api.RadianceThemingSkinPlugin;
import org.pushingpixels.radiance.theming.api.skin.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Core plugin for skins. See
 * {@link RadianceThemingSkinPlugin}
 * interface. This class is <b>for internal use only</b>.
 *
 * @author Kirill Grouchnikov.
 */
public class BaseSkinPlugin implements RadianceThemingSkinPlugin {
    @Override
    public Set<SkinInfo> getSkins() {
        Set<SkinInfo> result = new HashSet<>();
        result.add(new SkinInfo(BusinessSkin.NAME, BusinessSkin.class::getName,
                RadianceBusinessLookAndFeel.class::getName));
        result.add(new SkinInfo(BusinessBlackSteelSkin.NAME, BusinessBlackSteelSkin.class::getName,
                RadianceBusinessBlackSteelLookAndFeel.class::getName));
        result.add(new SkinInfo(BusinessBlueSteelSkin.NAME, BusinessBlueSteelSkin.class::getName,
                RadianceBusinessBlueSteelLookAndFeel.class::getName));
        result.add(new SkinInfo(CremeSkin.NAME, CremeSkin.class::getName,
                RadianceCremeLookAndFeel.class::getName));
        result.add(new SkinInfo(ModerateSkin.NAME, ModerateSkin.class::getName,
                RadianceModerateLookAndFeel.class::getName));
        result.add(new SkinInfo(SaharaSkin.NAME, SaharaSkin.class::getName,
                RadianceSaharaLookAndFeel.class::getName));
        result.add(new SkinInfo(RavenSkin.NAME, RavenSkin.class::getName,
                RadianceRavenLookAndFeel.class::getName));
        result.add(new SkinInfo(GraphiteSkin.NAME, GraphiteSkin.class::getName,
                RadianceGraphiteLookAndFeel.class::getName));
        result.add(new SkinInfo(GraphiteGlassSkin.NAME, GraphiteGlassSkin.class::getName,
                RadianceGraphiteGlassLookAndFeel.class::getName));
        result.add(new SkinInfo(GraphiteAquaSkin.NAME, GraphiteAquaSkin.class::getName,
                RadianceGraphiteAquaLookAndFeel.class::getName));
        result.add(new SkinInfo(GraphiteChalkSkin.NAME, GraphiteChalkSkin.class::getName,
                RadianceGraphiteChalkLookAndFeel.class::getName));
        result.add(new SkinInfo(GraphiteElectricSkin.NAME, GraphiteElectricSkin.class::getName,
                RadianceGraphiteElectricLookAndFeel.class::getName));
        result.add(new SkinInfo(GraphiteGoldSkin.NAME, GraphiteGoldSkin.class::getName,
                RadianceGraphiteGoldLookAndFeel.class::getName));
        result.add(new SkinInfo(GraphiteSiennaSkin.NAME, GraphiteSiennaSkin.class::getName,
                RadianceGraphiteSiennaLookAndFeel.class::getName));
        result.add(new SkinInfo(GraphiteSunsetSkin.NAME, GraphiteSunsetSkin.class::getName,
                RadianceGraphiteSunsetLookAndFeel.class::getName));
        result.add(new SkinInfo(GreenMagicSkin.NAME, GreenMagicSkin.class::getName,
                RadianceGreenMagicLookAndFeel.class::getName));
        result.add(new SkinInfo(NebulaSkin.NAME, NebulaSkin.class::getName,
                RadianceNebulaLookAndFeel.class::getName));
        result.add(new SkinInfo(NebulaBrickWallSkin.NAME, NebulaBrickWallSkin.class::getName,
                RadianceNebulaBrickWallLookAndFeel.class::getName));
        result.add(new SkinInfo(MistSilverSkin.NAME, MistSilverSkin.class::getName,
                RadianceMistSilverLookAndFeel.class::getName));
        result.add(new SkinInfo(MistAquaSkin.NAME, MistAquaSkin.class::getName,
                RadianceMistAquaLookAndFeel.class::getName));
        result.add(new SkinInfo(AutumnSkin.NAME, AutumnSkin.class::getName,
                RadianceAutumnLookAndFeel.class::getName));
        result.add(new SkinInfo(CremeCoffeeSkin.NAME, CremeCoffeeSkin.class::getName,
                RadianceCremeCoffeeLookAndFeel.class::getName));
        result.add(new SkinInfo(DustSkin.NAME, DustSkin.class::getName,
                RadianceDustLookAndFeel.class::getName));
        result.add(new SkinInfo(DustCoffeeSkin.NAME, DustCoffeeSkin.class::getName,
                RadianceDustCoffeeLookAndFeel.class::getName));
        result.add(new SkinInfo(TwilightSkin.NAME, TwilightSkin.class::getName,
                RadianceTwilightLookAndFeel.class::getName));
        result.add(new SkinInfo(MagellanSkin.NAME, MagellanSkin.class::getName,
                RadianceMagellanLookAndFeel.class::getName));
        result.add(new SkinInfo(GeminiSkin.NAME, GeminiSkin.class::getName,
                RadianceGeminiLookAndFeel.class::getName));
        result.add(new SkinInfo(MarinerSkin.NAME, MarinerSkin.class::getName,
                RadianceMarinerLookAndFeel.class::getName));
        result.add(new SkinInfo(CeruleanSkin.NAME, CeruleanSkin.class::getName,
                RadianceCeruleanLookAndFeel.class::getName));
        result.add(new SkinInfo(NightShadeSkin.NAME, NightShadeSkin.class::getName,
                RadianceNightShadeLookAndFeel.class::getName));
        result.add(new SkinInfo(NebulaAmethystSkin.NAME, NebulaAmethystSkin.class::getName,
                RadianceNebulaAmethystLookAndFeel.class::getName));
        result.add(new SkinInfo(SentinelSkin.NAME, SentinelSkin.class::getName,
                RadianceSentinelLookAndFeel.class::getName));

        result.add(new SkinInfo(SaharaSkin.SaharaTonalSkin.NAME, SaharaSkin.SaharaTonalSkin.class::getName,
            RadianceSaharaLookAndFeel.RadianceSaharaTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(ModerateSkin.ModerateTonalSkin.NAME, ModerateSkin.ModerateTonalSkin.class::getName,
            RadianceModerateLookAndFeel.RadianceModerateTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(BusinessSkin.BusinessTonalSkin.NAME, BusinessSkin.BusinessTonalSkin.class::getName,
            RadianceBusinessLookAndFeel.RadianceBusinessTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(BusinessBlackSteelSkin.BusinessBlackSteelTonalSkin.NAME,
            BusinessBlackSteelSkin.BusinessBlackSteelTonalSkin.class::getName,
            RadianceBusinessBlackSteelLookAndFeel.RadianceBusinessBlackSteelTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(BusinessBlueSteelSkin.BusinessBlueSteelTonalSkin.NAME,
            BusinessBlueSteelSkin.BusinessBlueSteelTonalSkin.class::getName,
            RadianceBusinessBlueSteelLookAndFeel.RadianceBusinessBlueSteelTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(AutumnSkin.AutumnTonalSkin.NAME,
            AutumnSkin.AutumnTonalSkin.class::getName,
            RadianceAutumnLookAndFeel.RadianceAutumnTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(MarinerSkin.MarinerTonalSkin.NAME,
            MarinerSkin.MarinerTonalSkin.class::getName,
            RadianceMarinerLookAndFeel.RadianceMarinerTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(NightShadeSkin.NightShadeTonalSkin.NAME,
            NightShadeSkin.NightShadeTonalSkin.class::getName,
            RadianceNightShadeLookAndFeel.RadianceNightShadeTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(TwilightSkin.TwilightTonalSkin.NAME,
            TwilightSkin.TwilightTonalSkin.class::getName,
            RadianceTwilightLookAndFeel.RadianceTwilightTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(MagellanSkin.MagellanTonalSkin.NAME,
            MagellanSkin.MagellanTonalSkin.class::getName,
            RadianceMagellanLookAndFeel.RadianceMagellanTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(GeminiSkin.GeminiTonalSkin.NAME,
            GeminiSkin.GeminiTonalSkin.class::getName,
            RadianceGeminiLookAndFeel.RadianceGeminiTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(NebulaSkin.NebulaTonalSkin.NAME,
            NebulaSkin.NebulaTonalSkin.class::getName,
            RadianceNebulaLookAndFeel.RadianceNebulaTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(NebulaBrickWallSkin.NebulaBrickWallTonalSkin.NAME,
            NebulaBrickWallSkin.NebulaBrickWallTonalSkin.class::getName,
            RadianceNebulaBrickWallLookAndFeel.RadianceNebulaBrickWallTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(NebulaAmethystSkin.NebulaAmethystTonalSkin.NAME,
            NebulaAmethystSkin.NebulaAmethystTonalSkin.class::getName,
            RadianceNebulaAmethystLookAndFeel.RadianceNebulaAmethystTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(DustSkin.DustTonalSkin.NAME,
            DustSkin.DustTonalSkin.class::getName,
            RadianceDustLookAndFeel.RadianceDustTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(DustCoffeeSkin.DustCoffeeTonalSkin.NAME,
            DustCoffeeSkin.DustCoffeeTonalSkin.class::getName,
            RadianceDustCoffeeLookAndFeel.RadianceDustCoffeeTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(CremeSkin.CremeTonalSkin.NAME,
            CremeSkin.CremeTonalSkin.class::getName,
            RadianceCremeLookAndFeel.RadianceCremeTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(CremeCoffeeSkin.CremeCoffeeTonalSkin.NAME,
            CremeCoffeeSkin.CremeCoffeeTonalSkin.class::getName,
            RadianceCremeCoffeeLookAndFeel.RadianceCremeCoffeeTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(MistAquaSkin.MistAquaTonalSkin.NAME,
            MistAquaSkin.MistAquaTonalSkin.class::getName,
            RadianceMistAquaLookAndFeel.RadianceMistAquaTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(MistSilverSkin.MistSilverTonalSkin.NAME,
            MistSilverSkin.MistSilverTonalSkin.class::getName,
            RadianceMistSilverLookAndFeel.RadianceMistSilverTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(RavenSkin.RavenTonalSkin.NAME,
            RavenSkin.RavenTonalSkin.class::getName,
            RadianceRavenLookAndFeel.RadianceRavenTonalLookAndFeel.class::getName));
        result.add(new SkinInfo(CeruleanSkin.CeruleanTonalSkin.NAME,
            CeruleanSkin.CeruleanTonalSkin.class::getName,
            RadianceCeruleanLookAndFeel.RadianceCeruleanTonalLookAndFeel.class::getName));

        return result;
    }
}
