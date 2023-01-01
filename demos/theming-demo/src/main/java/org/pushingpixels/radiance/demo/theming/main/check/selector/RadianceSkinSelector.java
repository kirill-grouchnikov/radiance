/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.check.selector;

import org.pushingpixels.radiance.demo.theming.main.check.FlexiComboBox;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.SkinInfo;

import javax.swing.*;
import java.util.ArrayList;

public class RadianceSkinSelector extends FlexiComboBox<SkinInfo> {
    public RadianceSkinSelector() {
        // populate the combobox
        super(new ArrayList<>(RadianceThemingCortex.GlobalScope.getAllSkins().values())
                .toArray(new SkinInfo[0]));
        // set the current skin as the selected item
        RadianceSkin currentSkin = RadianceThemingCortex.GlobalScope.getCurrentSkin();
        for (SkinInfo skinInfo : RadianceThemingCortex.GlobalScope.getAllSkins().values()) {
            if (skinInfo.getDisplayName().compareTo(currentSkin.getDisplayName()) == 0) {
                this.setSelectedItem(skinInfo);
                break;
            }
        }

        // add an action listener to change skin based on user selection
        this.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            RadianceSkin currSkin = RadianceThemingCortex.ComponentScope.getCurrentSkin(RadianceSkinSelector.this);
            SkinInfo newSkinInfo = (SkinInfo) RadianceSkinSelector.this.getSelectedItem();
            if (!currSkin.getClass().getName().equals(newSkinInfo.getClassName())) {
                // Only call GlobalScope.setSkin when the new selection is different
                // from the current skin
                RadianceThemingCortex.GlobalScope.setSkin(newSkinInfo.getClassName());
            }
        }));

        // keep track of current skin to update the selection in this combobox
        RadianceThemingCortex.GlobalScope.registerSkinChangeListener(() -> SwingUtilities.invokeLater(() -> {
            RadianceSkin currSkin = RadianceThemingCortex.ComponentScope.getCurrentSkin(RadianceSkinSelector.this);
            ComboBoxModel model = getModel();
            for (int i = 0; i < model.getSize(); i++) {
                if (((SkinInfo) model.getElementAt(i)).getDisplayName().equals(currSkin.getDisplayName())) {
                    setSelectedIndex(i);
                    break;
                }
            }
        }));
    }

    @Override
    public String getCaption(SkinInfo item) {
        return item.getDisplayName();
    }
}
