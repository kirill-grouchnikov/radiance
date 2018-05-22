/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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

import java.util.HashSet;
import java.util.Set;

import org.pushingpixels.substance.api.SubstanceSkinPlugin;
import org.pushingpixels.substance.api.skin.SkinInfo;
import org.pushingpixels.substance.extras.api.skinpack.FieldOfWheatSkin;
import org.pushingpixels.substance.extras.api.skinpack.FindingNemoSkin;
import org.pushingpixels.substance.extras.api.skinpack.GreenMagicSkin;
import org.pushingpixels.substance.extras.api.skinpack.MagmaSkin;
import org.pushingpixels.substance.extras.api.skinpack.MangoSkin;
import org.pushingpixels.substance.extras.api.skinpack.StreetlightsSkin;

/**
 * Core plugin for skins. See
 * {@link org.pushingpixels.substance.api.SubstanceSkinPlugin} interface. This class is
 * <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov.
 */
public class SubstanceExtrasSkinPlugin implements SubstanceSkinPlugin {
    /**
     * Creates info object on a single skin.
     * 
     * @param displayName
     *            Skin display name.
     * @param skinClass
     *            Skin class.
     * @param isDefault
     *            Indication whether the specified skin is default.
     * @return Info object on the specified skin.
     */
    private static SkinInfo create(String displayName, Class<?> skinClass, boolean isDefault) {
        SkinInfo result = new SkinInfo(displayName, skinClass.getName());
        result.setDefault(isDefault);
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.substance.plugin.SubstanceSkinPlugin#getSkins()
     */
    @Override
    public Set<SkinInfo> getSkins() {
        Set<SkinInfo> result = new HashSet<SkinInfo>();
        result.add(create(FieldOfWheatSkin.NAME, FieldOfWheatSkin.class, false));
        result.add(create(FindingNemoSkin.NAME, FindingNemoSkin.class, false));
        result.add(create(GreenMagicSkin.NAME, GreenMagicSkin.class, false));
        result.add(create(MangoSkin.NAME, MangoSkin.class, false));
        result.add(create(MagmaSkin.NAME, MagmaSkin.class, false));
        result.add(create(StreetlightsSkin.NAME, StreetlightsSkin.class, false));
        return result;
    }
}
