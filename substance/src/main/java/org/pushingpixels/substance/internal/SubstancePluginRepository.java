/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov and contributors. All Rights Reserved.
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
package org.pushingpixels.substance.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.swing.UIDefaults;

import org.pushingpixels.substance.api.SubstanceComponentPlugin;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSkinPlugin;
import org.pushingpixels.substance.internal.plugin.BasePlugin;
import org.pushingpixels.substance.internal.plugin.BaseSkinPlugin;

public class SubstancePluginRepository {
    private Set<SubstanceComponentPlugin> componentPlugins = new HashSet<>();
    private Set<SubstanceSkinPlugin> skinPlugins = new HashSet<>();

    private static SubstancePluginRepository instance = new SubstancePluginRepository();

    public static SubstancePluginRepository getInstance() {
        if (instance.componentPlugins.isEmpty()) {
            instance.componentPlugins.add(new BasePlugin());
        }
        if (instance.skinPlugins.isEmpty()) {
            instance.skinPlugins.add(new BaseSkinPlugin());
        }
        return instance;
    }

    public synchronized void registerComponentPlugin(SubstanceComponentPlugin componentPlugin) {
        componentPlugins.add(componentPlugin);
    }

    public synchronized void unregisterComponentPlugin(SubstanceComponentPlugin componentPlugin) {
        componentPlugins.remove(componentPlugin);
    }

    public synchronized void registerSkinPlugin(SubstanceSkinPlugin skinPlugin) {
        skinPlugins.add(skinPlugin);
    }

    public synchronized void unregisterSkinPlugin(SubstanceSkinPlugin skinPlugin) {
        skinPlugins.remove(skinPlugin);
    }

    public synchronized Set<SubstanceComponentPlugin> getComponentPlugins() {
        return Collections.unmodifiableSet(componentPlugins);
    }

    public synchronized Set<SubstanceSkinPlugin> getSkinPlugins() {
        return Collections.unmodifiableSet(skinPlugins);
    }

    /**
     * Helper function to initialize all available component plugins. Calls the
     * {@link SubstanceComponentPlugin#initialize()} of all available component plugins.
     */
    public void initializeAllComponentPlugins() {
        for (SubstanceComponentPlugin componentPlugin : componentPlugins) {
            componentPlugin.initialize();
        }
    }

    /**
     * Helper function to uninitialize all available component plugins. Calls the
     * {@link SubstanceComponentPlugin#uninitialize()} of all available component plugins.
     */
    public void uninitializeAllComponentPlugins() {
        for (SubstanceComponentPlugin componentPlugin : componentPlugins) {
            componentPlugin.uninitialize();
        }
    }

    /**
     * Helper function to process the (possibly) theme-dependent default settings of all available
     * component plugins. Calls the {@link SubstanceComponentPlugin#getDefaults(Object)} of all
     * available plugins and puts the respective results in the specified table.
     * 
     * @param table
     *            The table that will be updated with the (possibly) theme-dependent default
     *            settings of all available component plugins.
     * @param skin
     *            Skin.
     */
    public void processAllDefaultsEntriesComponentPlugins(UIDefaults table, SubstanceSkin skin) {
        for (SubstanceComponentPlugin componentPlugin : componentPlugins) {
            Object[] defaults = componentPlugin.getDefaults(skin);
            if (defaults != null) {
                table.putDefaults(defaults);
            }
        }
    }
}
