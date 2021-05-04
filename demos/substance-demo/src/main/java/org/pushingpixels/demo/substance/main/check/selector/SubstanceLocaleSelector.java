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
package org.pushingpixels.demo.substance.main.check.selector;

import org.pushingpixels.demo.substance.main.check.FlexiComboBox;
import org.pushingpixels.demo.substance.main.check.MyLocaleChangeListener;
import org.pushingpixels.demo.substance.main.check.svg.flags.*;
import org.pushingpixels.neon.api.icon.ResizableIcon;

import javax.swing.*;

public class SubstanceLocaleSelector extends FlexiComboBox<SubstanceLocaleSelector.LocaleInfo> {
    public static class LocaleInfo {
        private String language;
        private ResizableIcon icon;
        private String langCode;
        private String countryCode;

        private LocaleInfo(String language, ResizableIcon icon, String langCode,
                String countryCode) {
            this.language = language;
            this.icon = icon;
            this.langCode = langCode;
            this.countryCode = countryCode;
        }
    }

    public SubstanceLocaleSelector(JFrame frame) {
        // populate the combobox
        super(new LocaleInfo("English", us.of(16, 16), "en", "US"),
                new LocaleInfo("Arabic", sa.of(16, 16), "ar", "AR"),
                new LocaleInfo("Bulgarian", bg.of(16, 16), "bg", "BG"),
                new LocaleInfo("Chinese (Simplified)", cn.of(16, 16), "zh", "CN"),
                new LocaleInfo("Chinese (Hong Kong)", hk.of(16, 16), "zh", "HK"),
                new LocaleInfo("Chinese (Taiwan)", tw.of(16, 16), "zh", "TW"),
                new LocaleInfo("Czech", cz.of(16, 16), "cs", "CZ"),
                new LocaleInfo("Danish", dk.of(16, 16), "da", "DK"),
                new LocaleInfo("Dutch", nl.of(16, 16), "nl", "NL"),
                new LocaleInfo("Finnish", fi.of(16, 16), "fi", "FI"),
                new LocaleInfo("French", fr.of(16, 16), "fr", "FR"),
                new LocaleInfo("French (Canada)", ca.of(16, 16), "fr", "CA"),
                new LocaleInfo("German", de.of(16, 16), "de", "DE"),
                new LocaleInfo("Greek", gr.of(16, 16), "el", "GR"),
                new LocaleInfo("Hebrew", il.of(16, 16), "iw", "IL"),
                new LocaleInfo("Hungarian", hu.of(16, 16), "hu", "HU"),
                new LocaleInfo("Italian", it.of(16, 16), "it", "IT"),
                new LocaleInfo("Japanese", jp.of(16, 16), "ja", "JP"),
                new LocaleInfo("Norwegian", no.of(16, 16), "no", "NO"),
                new LocaleInfo("Polish", pl.of(16, 16), "pl", "PL"),
                new LocaleInfo("Portuguese", pt.of(16, 16), "pt", "PT"),
                new LocaleInfo("Portuguese (Brazil)", br.of(16, 16), "pt", "BR"),
                new LocaleInfo("Romanian", ro.of(16, 16), "ro", "RO"),
                new LocaleInfo("Russian", ru.of(16, 16), "ru", "RU"),
                new LocaleInfo("Spanish", es.of(16, 16), "es", "ES"),
                new LocaleInfo("Spanish (Argentina)", ar.of(16, 16), "es", "AR"),
                new LocaleInfo("Spanish (Mexico)", mx.of(16, 16), "es", "MX"),
                new LocaleInfo("Swedish", se.of(16, 16), "sv", "SE"),
                new LocaleInfo("Thai", th.of(16, 16), "th", "TH"),
                new LocaleInfo("Turkish", tr.of(16, 16), "tr", "TR"),
                new LocaleInfo("Vietnamese", vn.of(16, 16), "vi", "VN"));

        // add an action listener to change locale based on user selection
        this.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            LocaleInfo selected = (LocaleInfo) getSelectedItem();
            MyLocaleChangeListener.changeLocale(frame, selected.countryCode, selected.langCode);
        }));
    }

    @Override
    public String getCaption(LocaleInfo item) {
        return item.language;
    }

    @Override
    public Icon getItemIcon(LocaleInfo item) {
        return item.icon;
    }
}
