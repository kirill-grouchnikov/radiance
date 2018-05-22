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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.demo.substance.main.check;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultComboBoxRenderer;
import org.pushingpixels.substance.api.skin.SkinInfo;

public class SubstanceSkinComboSelector extends JComboBox {
    public SubstanceSkinComboSelector() {
        // populate the combobox
        super(new ArrayList<SkinInfo>(SubstanceCortex.GlobalScope.getAllSkins().values())
                .toArray());
        // set the current skin as the selected item
        SubstanceSkin currentSkin = SubstanceCortex.GlobalScope.getCurrentSkin();
        for (SkinInfo skinInfo : SubstanceCortex.GlobalScope.getAllSkins().values()) {
            if (skinInfo.getDisplayName().compareTo(currentSkin.getDisplayName()) == 0) {
                this.setSelectedItem(skinInfo);
                break;
            }
        }
        // set custom renderer to show the skin display name
        this.setRenderer(new SubstanceDefaultComboBoxRenderer(this) {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                return super.getListCellRendererComponent(list, ((SkinInfo) value).getDisplayName(),
                        index, isSelected, cellHasFocus);
            }
        });
        // add an action listener to change skin based on user selection
        this.addActionListener(
                (ActionEvent e) -> SwingUtilities.invokeLater(() -> SubstanceCortex.GlobalScope
                        .setSkin(((SkinInfo) SubstanceSkinComboSelector.this.getSelectedItem())
                                .getClassName())));
    }
}
