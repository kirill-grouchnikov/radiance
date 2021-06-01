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
package org.pushingpixels.substance.extras.api;

import org.pushingpixels.substance.api.SubstanceSkinPlugin;
import org.pushingpixels.substance.api.skin.SkinInfo;
import org.pushingpixels.substance.extras.api.skinpack.*;

import java.util.*;

/**
 * Extras plugin for skins.
 *
 * @author Kirill Grouchnikov.
 */
public class SubstanceExtrasSkinPlugin implements SubstanceSkinPlugin {
    @Override
    public Set<SkinInfo> getSkins() {
        Set<SkinInfo> result = new HashSet<>();
        result.add(new SkinInfo(FieldOfWheatSkin.NAME, FieldOfWheatSkin.class::getName,
                SubstanceFieldOfWheatLookAndFeel.class::getName));
        result.add(new SkinInfo(FindingNemoSkin.NAME, FindingNemoSkin.class::getName,
                SubstanceFindingNemoLookAndFeel.class::getName));
        result.add(new SkinInfo(HarvestSkin.NAME, HarvestSkin.class::getName,
                SubstanceHarvestLookAndFeel.class::getName));
        result.add(new SkinInfo(MangoSkin.NAME, MangoSkin.class::getName,
                SubstanceMangoLookAndFeel.class::getName));
        result.add(new SkinInfo(MagmaSkin.NAME, MagmaSkin.class::getName,
                SubstanceMagmaLookAndFeel.class::getName));
        result.add(new SkinInfo(StreetlightsSkin.NAME, StreetlightsSkin.class::getName,
                SubstanceStreetlightsLookAndFeel.class::getName));
        result.add(new SkinInfo(OfficeBlack2007Skin.NAME, OfficeBlack2007Skin.class::getName,
                SubstanceOfficeBlack2007LookAndFeel.class::getName));
        result.add(new SkinInfo(OfficeBlue2007Skin.NAME, OfficeBlue2007Skin.class::getName,
                SubstanceOfficeBlue2007LookAndFeel.class::getName));
        result.add(new SkinInfo(OfficeSilver2007Skin.NAME, OfficeSilver2007Skin.class::getName,
                SubstanceOfficeSilver2007LookAndFeel.class::getName));
        return result;
    }
}
