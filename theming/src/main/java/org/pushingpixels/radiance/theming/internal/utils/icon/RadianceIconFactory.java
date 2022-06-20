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
package org.pushingpixels.radiance.theming.internal.utils.icon;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Icon factory for dynamically-changing icons. This class is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceIconFactory {
    /**
     * Icon kind of a title pane button.
     * 
     * @author Kirill Grocuhnikov.
     */
    public enum IconKind {
        /**
         * Icon of a close button.
         */
        CLOSE,

        /**
         * Icon of a minimize button.
         */
        MINIMIZE,

        /**
         * Icon of a maximize button.
         */
        MAXIMIZE,

        /**
         * Icon of a restore button.
         */
        RESTORE
    }

    /**
     * Cache of title pane icons.
     */
    private static final Map<IconKind, LazyResettableHashMap<ScaleAwareImageWrapperIcon>> titlePaneIcons =
            RadianceIconFactory.createTitlePaneIcons();

    /**
     * Creates an empty map of title pane icons.
     * 
     * @return Empty map of title pane icons.
     */
    private static Map<IconKind, LazyResettableHashMap<ScaleAwareImageWrapperIcon>> createTitlePaneIcons() {
        Map<IconKind, LazyResettableHashMap<ScaleAwareImageWrapperIcon>> result = new HashMap<>();

        result.put(IconKind.CLOSE, new LazyResettableHashMap<>("Close title pane icons"));
        result.put(IconKind.MINIMIZE, new LazyResettableHashMap<>("Minimize title pane icons"));
        result.put(IconKind.MAXIMIZE, new LazyResettableHashMap<>("Maximize title pane icons"));
        result.put(IconKind.RESTORE, new LazyResettableHashMap<>("Restore title pane icons"));
        return result;
    }

    /**
     * Returns title pane icon of the specified kind.
     * 
     * @param iconKind
     *            Icon kind.
     * @param scheme
     *            Color scheme.
     * @return Title pane icon of the specified kind.
     */
    public static ScaleAwareImageWrapperIcon getTitlePaneIcon(Component titlePane,
            IconKind iconKind, RadianceColorScheme scheme) {
        LazyResettableHashMap<ScaleAwareImageWrapperIcon> kindMap =
                RadianceIconFactory.titlePaneIcons.get(iconKind);
        ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                RadianceCommonCortex.getScaleFactor(titlePane), scheme.getDisplayName());
        ScaleAwareImageWrapperIcon result = kindMap.get(key);
        if (result != null)
            return result;

        switch (iconKind) {
            case CLOSE:
                throw new UnsupportedOperationException();
            case MINIMIZE:
                result = RadianceImageCreator.getMinimizeIcon(titlePane, scheme);
                break;
            case MAXIMIZE:
                result = RadianceImageCreator.getMaximizeIcon(titlePane, scheme);
                break;
            case RESTORE:
                result = RadianceImageCreator.getRestoreIcon(titlePane, scheme);
                break;
        }
        kindMap.put(key, result);
        return result;
    }
}
