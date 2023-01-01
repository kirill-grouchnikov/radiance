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
package org.pushingpixels.radiance.theming.internal;

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.animation.api.ease.Spline;
import org.pushingpixels.radiance.animation.api.swing.SwingComponentTimeline;

import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Internal implementation of animation configuration.
 *
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex
 */
public class AnimationConfigurationManager {
    private static final Spline DEFAULT_EASE = new Spline(0.5f);

    /**
     * Singleton instance.
     */
    private static AnimationConfigurationManager instance;

    private long timelineDuration;

    /**
     * Contains {@link RadianceThemingSlices.AnimationFacet} instances.
     */
    private Set<RadianceThemingSlices.AnimationFacet> globalAllowed;

    /**
     * Key - {@link RadianceThemingSlices.AnimationFacet}, value - set of {@link Class} instances.
     */
    private Map<RadianceThemingSlices.AnimationFacet, Set<Class<?>>> classAllowed;

    /**
     * Key - {@link RadianceThemingSlices.AnimationFacet}, value - set of {@link Class} instances.
     */
    private Map<RadianceThemingSlices.AnimationFacet, Set<Class<?>>> classDisallowed;

    /**
     * Key - {@link RadianceThemingSlices.AnimationFacet}, value - set of {@link Component} instances.
     */
    private Map<RadianceThemingSlices.AnimationFacet, Set<Component>> instanceAllowed;

    /**
     * Key - {@link RadianceThemingSlices.AnimationFacet}, value - set of {@link Component} instances.
     */
    private Map<RadianceThemingSlices.AnimationFacet, Set<Component>> instanceDisallowed;

    /**
     * Returns the configuration manager instance.
     *
     * @return Configuration manager instance.
     */
    public static synchronized AnimationConfigurationManager getInstance() {
        if (instance == null) {
            instance = new AnimationConfigurationManager();
        }
        return instance;
    }

    /**
     * Creates a new instance.
     */
    private AnimationConfigurationManager() {
        this.globalAllowed = new HashSet<>();
        this.classAllowed = new HashMap<>();
        this.classDisallowed = new HashMap<>();
        this.instanceAllowed = new HashMap<>();
        this.instanceDisallowed = new HashMap<>();
        this.timelineDuration = 200;
    }

    /**
     * Allows animations of the specified facet on all controls.
     *
     * @param animationFacet Animation facet to allow.
     */
    public synchronized void allowAnimations(RadianceThemingSlices.AnimationFacet animationFacet) {
        this.globalAllowed.add(animationFacet);
    }

    /**
     * Allows animations of the specified facet on all controls of specified class.
     *
     * @param animationFacet Animation facet to allow.
     * @param clazz          Control class for allowing the animation facet.
     */
    public synchronized void allowAnimations(RadianceThemingSlices.AnimationFacet animationFacet, Class<?> clazz) {
        Set<Class<?>> existingAllowed = this.classAllowed.get(animationFacet);
        if (existingAllowed == null) {
            existingAllowed = new HashSet<>();
            this.classAllowed.put(animationFacet, existingAllowed);
        }
        existingAllowed.add(clazz);

        Set<Class<?>> existingDisallowed = this.classDisallowed.get(animationFacet);
        if (existingDisallowed != null) {
            existingDisallowed.remove(clazz);
        }
    }

    /**
     * Allows animations of the specified facet on all controls of specified classes.
     *
     * @param animationFacet Animation facet to allow.
     * @param clazz          Control classes for allowing the animation facet.
     */
    public synchronized void allowAnimations(RadianceThemingSlices.AnimationFacet animationFacet, Class<?>[] clazz) {
        for (int i = 0; i < clazz.length; i++) {
            allowAnimations(animationFacet, clazz[i]);
        }
    }

    /**
     * Allows animations of the specified facet on the specified control.
     *
     * @param animationFacet Animation facet to allow.
     * @param comp           Control for allowing the animation facet.
     */
    public synchronized void allowAnimations(RadianceThemingSlices.AnimationFacet animationFacet, Component comp) {
        Set<Component> existingAllowed = this.instanceAllowed.get(animationFacet);
        if (existingAllowed == null) {
            existingAllowed = new HashSet<>();
            this.instanceAllowed.put(animationFacet, existingAllowed);
        }
        existingAllowed.add(comp);

        Set<Component> existingDisallowed = this.instanceDisallowed.get(animationFacet);
        if (existingDisallowed != null) {
            existingDisallowed.remove(comp);
        }
    }

    /**
     * Disallows animations of the specified facet on all controls.
     *
     * @param animationFacet Animation facet to disallow.
     */
    public synchronized void disallowAnimations(RadianceThemingSlices.AnimationFacet animationFacet) {
        this.globalAllowed.remove(animationFacet);
    }

    /**
     * Disallows animations of the specified facet on all controls of specified class.
     *
     * @param animationFacet Animation facet to disallow.
     * @param clazz          Control class for disallowing the animation facet.
     */
    public synchronized void disallowAnimations(RadianceThemingSlices.AnimationFacet animationFacet, Class<?> clazz) {
        Set<Class<?>> existingAllowed = this.classAllowed.get(animationFacet);
        if (existingAllowed != null) {
            existingAllowed.remove(clazz);
            if (existingAllowed.size() == 0)
                this.classAllowed.remove(animationFacet);
        }

        Set<Class<?>> existingDisallowed = this.classDisallowed.get(animationFacet);
        if (existingDisallowed == null) {
            existingDisallowed = new HashSet<>();
            this.classDisallowed.put(animationFacet, existingDisallowed);
        }
        existingDisallowed.add(clazz);
    }

    /**
     * Disallows animations of the specified facet on all controls of specified classes.
     *
     * @param animationFacet Animation facet to disallow.
     * @param clazz          Control classes for disallowing the animation facet.
     */
    public synchronized void disallowAnimations(RadianceThemingSlices.AnimationFacet animationFacet, Class<?>[] clazz) {
        for (int i = 0; i < clazz.length; i++) {
            disallowAnimations(animationFacet, clazz[i]);
        }
    }

    /**
     * Disallows animations of the specified facet on the specified control.
     *
     * @param animationFacet Animation facet to disallow.
     * @param comp           Control for disallowing the animation facet.
     */
    public synchronized void disallowAnimations(RadianceThemingSlices.AnimationFacet animationFacet, Component comp) {
        Set<Component> existingAllowed = this.instanceAllowed.get(animationFacet);
        if (existingAllowed != null) {
            existingAllowed.remove(comp);
            if (existingAllowed.size() == 0)
                this.instanceAllowed.remove(animationFacet);
        }

        Set<Component> existingDisallowed = this.instanceDisallowed.get(animationFacet);
        if (existingDisallowed == null) {
            existingDisallowed = new HashSet<>();
            this.instanceDisallowed.put(animationFacet, existingDisallowed);
        }
        existingDisallowed.add(comp);
    }

    /**
     * Checks whether the specified animation facet is allowed on the specified component.
     *
     * @param animationFacet Animation facet.
     * @param comp           Component. Can be <code>null</code>.
     * @return <code>true</code> if the specified animation facet is allowed on the specified
     * component, <code>false</code> otherwise.
     */
    public synchronized boolean isAnimationAllowed(RadianceThemingSlices.AnimationFacet animationFacet, Component comp) {
        Set<Component> instanceDisallowed = this.instanceDisallowed.get(animationFacet);
        if (instanceDisallowed != null) {
            if (instanceDisallowed.contains(comp))
                return false;
        }
        Set<Component> instanceAllowed = this.instanceAllowed.get(animationFacet);
        if (instanceAllowed != null) {
            if (instanceAllowed.contains(comp))
                return true;
        }

        if (comp != null) {
            Class<?> clazz = comp.getClass();
            Set<Class<?>> classAllowed = this.classAllowed.get(animationFacet);
            Set<Class<?>> classDisallowed = this.classDisallowed.get(animationFacet);
            if (classDisallowed != null) {
                for (Class<?> disallowed : classDisallowed) {
                    if (disallowed.isAssignableFrom(clazz))
                        return false;
                }
            }
            if (classAllowed != null) {
                for (Class<?> allowed : classAllowed) {
                    if (allowed.isAssignableFrom(clazz))
                        return true;
                }
            }
        }
        return this.globalAllowed.contains(animationFacet);
    }

    public void setTimelineDuration(long timelineDuration) {
        this.timelineDuration = timelineDuration;
    }

    public long getTimelineDuration() {
        return timelineDuration;
    }

    public SwingComponentTimeline.Builder timelineBuilder(Component component) {
        return SwingComponentTimeline.componentBuilder(component)
                .setDuration(this.timelineDuration)
                .setEase(DEFAULT_EASE);
    }

    public SwingComponentTimeline.Builder modifiedTimelineBuilder(Component component) {
        return SwingComponentTimeline.componentBuilder(component)
                .setDuration(this.timelineDuration)
                .setEase(durationFraction -> {
                    if (durationFraction < 0.8f) {
                        return 0.0f;
                    }
                    return 5.0f * (durationFraction - 0.8f);
                });
    }
}
