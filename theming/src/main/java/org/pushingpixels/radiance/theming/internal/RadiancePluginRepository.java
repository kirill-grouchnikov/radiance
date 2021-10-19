/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov and contributors. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal;

import org.pushingpixels.radiance.theming.api.RadianceThemingComponentPlugin;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSkinPlugin;
import org.pushingpixels.radiance.theming.internal.plugin.BaseSkinPlugin;
import org.pushingpixels.radiance.theming.internal.plugin.ColorChooserPlugin;

import javax.swing.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RadiancePluginRepository {
    private Set<RadianceThemingComponentPlugin> componentPlugins = new HashSet<>();
    private Set<RadianceThemingSkinPlugin> skinPlugins = new HashSet<>();

    private static RadiancePluginRepository instance = new RadiancePluginRepository();

    public static RadiancePluginRepository getInstance() {
        if (instance.componentPlugins.isEmpty()) {
            instance.componentPlugins.add(new ColorChooserPlugin());
        }
        if (instance.skinPlugins.isEmpty()) {
            instance.skinPlugins.add(new BaseSkinPlugin());
        }
        return instance;
    }

    public synchronized void registerComponentPlugin(RadianceThemingComponentPlugin componentPlugin) {
        componentPlugins.add(componentPlugin);
    }

    public synchronized void unregisterComponentPlugin(RadianceThemingComponentPlugin componentPlugin) {
        componentPlugins.remove(componentPlugin);
    }

    public synchronized void registerSkinPlugin(RadianceThemingSkinPlugin skinPlugin) {
        skinPlugins.add(skinPlugin);
    }

    public synchronized void unregisterSkinPlugin(RadianceThemingSkinPlugin skinPlugin) {
        skinPlugins.remove(skinPlugin);
    }

    public synchronized Set<RadianceThemingComponentPlugin> getComponentPlugins() {
        return Collections.unmodifiableSet(componentPlugins);
    }

    public synchronized Set<RadianceThemingSkinPlugin> getSkinPlugins() {
        return Collections.unmodifiableSet(skinPlugins);
    }

    /**
     * Helper function to initialize all available component plugins. Calls the
     * {@link RadianceThemingComponentPlugin#initialize()} of all available component plugins.
     */
    public void initializeAllComponentPlugins() {
        for (RadianceThemingComponentPlugin componentPlugin : componentPlugins) {
            componentPlugin.initialize();
        }
    }

    /**
     * Helper function to uninitialize all available component plugins. Calls the
     * {@link RadianceThemingComponentPlugin#uninitialize()} of all available component plugins.
     */
    public void uninitializeAllComponentPlugins() {
        for (RadianceThemingComponentPlugin componentPlugin : componentPlugins) {
            componentPlugin.uninitialize();
        }
    }

    /**
     * Helper function to process the (possibly) skin-dependent default settings of all available
     * component plugins. Calls the {@link RadianceThemingComponentPlugin#getDefaults(RadianceSkin)} of all
     * available plugins and puts the respective results in the specified table.
     * 
     * @param table
     *            The table that will be updated with the (possibly) theme-dependent default
     *            settings of all available component plugins.
     * @param skin
     *            Skin.
     */
    public void processAllDefaultsEntriesComponentPlugins(UIDefaults table, RadianceSkin skin) {
        for (RadianceThemingComponentPlugin componentPlugin : componentPlugins) {
            Object[] defaults = componentPlugin.getDefaults(skin);
            if (defaults != null) {
                table.putDefaults(defaults);
            }
        }
    }
}
