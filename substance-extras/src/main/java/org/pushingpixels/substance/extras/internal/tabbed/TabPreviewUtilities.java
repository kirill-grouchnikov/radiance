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
package org.pushingpixels.substance.extras.internal.tabbed;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JTabbedPane;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.extras.api.tabbed.TabPreviewPainter;
import org.pushingpixels.substance.extras.internal.SubstanceExtrasSynapse;

public class TabPreviewUtilities {

    /**
     * Returns the preview painter for the specified tabbed pane.
     * 
     * @param tabbedPane
     *            Tabbed pane.
     * @return Preview painter for the specified tabbed pane.
     */
    public static TabPreviewPainter getTabPreviewPainter(JTabbedPane tabbedPane) {
        if (tabbedPane == null)
            return null;

        // check property on tabbed pane
        Object tabProp = tabbedPane
                .getClientProperty(SubstanceExtrasSynapse.TABBED_PANE_PREVIEW_PAINTER);
        if (tabProp instanceof TabPreviewPainter)
            return (TabPreviewPainter) tabProp;

        return null;
    }

    /**
     * Retrieves the label bundle for the default locale.
     * 
     * @return The label bundle for the default locale.
     */
    static synchronized ResourceBundle getLabelBundle() {
        // fix for RFE 157 on Substance (allowing custom class loader for
        // resource bundles which can remove server calls
        // in applets)
        ClassLoader labelBundleClassLoader = SubstanceCortex.GlobalScope
                .getLabelBundleClassLoader();
        if (labelBundleClassLoader == null) {
            return ResourceBundle.getBundle(
                    "org.pushingpixels.substance.extras.internal.tabbed.resources.Labels",
                    Locale.getDefault());
        } else {
            return ResourceBundle.getBundle(
                    "org.pushingpixels.substance.extras.internal.tabbed.resources.Labels",
                    Locale.getDefault(), labelBundleClassLoader);
        }
    }
}
