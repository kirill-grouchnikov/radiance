/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.extras.api;

import org.pushingpixels.radiance.theming.api.RadianceThemingSkinPlugin;
import org.pushingpixels.radiance.theming.api.skin.SkinInfo;
import org.pushingpixels.radiance.theming.extras.api.skinpack.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Extras plugin for skins.
 *
 * @author Kirill Grouchnikov.
 */
public class RadianceThemingExtrasSkinPlugin implements RadianceThemingSkinPlugin {
    @Override
    public Set<SkinInfo> getSkins() {
        Set<SkinInfo> result = new HashSet<>();
        result.add(new SkinInfo(FieldOfWheatSkin.NAME, FieldOfWheatSkin.class::getName,
                RadianceFieldOfWheatLookAndFeel.class::getName));
        result.add(new SkinInfo(FindingNemoSkin.NAME, FindingNemoSkin.class::getName,
                RadianceFindingNemoLookAndFeel.class::getName));
        result.add(new SkinInfo(HarvestSkin.NAME, HarvestSkin.class::getName,
                RadianceHarvestLookAndFeel.class::getName));
        result.add(new SkinInfo(MangoSkin.NAME, MangoSkin.class::getName,
                RadianceMangoLookAndFeel.class::getName));
        result.add(new SkinInfo(MagmaSkin.NAME, MagmaSkin.class::getName,
                RadianceMagmaLookAndFeel.class::getName));
        result.add(new SkinInfo(StreetlightsSkin.NAME, StreetlightsSkin.class::getName,
                RadianceStreetlightsLookAndFeel.class::getName));
        result.add(new SkinInfo(OfficeBlack2007Skin.NAME, OfficeBlack2007Skin.class::getName,
                RadianceOfficeBlack2007LookAndFeel.class::getName));
        result.add(new SkinInfo(OfficeBlue2007Skin.NAME, OfficeBlue2007Skin.class::getName,
                RadianceOfficeBlue2007LookAndFeel.class::getName));
        result.add(new SkinInfo(OfficeSilver2007Skin.NAME, OfficeSilver2007Skin.class::getName,
                RadianceOfficeSilver2007LookAndFeel.class::getName));
        return result;
    }
}
