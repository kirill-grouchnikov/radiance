/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.trident.api;

import org.pushingpixels.trident.api.TimelineEngine.TridentAnimationThread;
import org.pushingpixels.trident.api.interpolator.PropertyInterpolator;
import org.pushingpixels.trident.api.interpolator.PropertyInterpolatorSource;
import org.pushingpixels.trident.internal.interpolator.CorePropertyInterpolators;
import org.pushingpixels.trident.internal.swing.AWTPropertyInterpolators;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TridentConfig {
    private static TridentConfig config;

    private Set<PropertyInterpolator<?>> propertyInterpolators;

    private TridentConfig.PulseSource pulseSource;

    public interface PulseSource {
        void waitUntilNextPulse();
    }

    public static class FixedRatePulseSource implements TridentConfig.PulseSource {
        private int msDelay;

        public FixedRatePulseSource(int msDelay) {
            this.msDelay = msDelay;
        }

        @Override
        public void waitUntilNextPulse() {
            try {
                Thread.sleep(this.msDelay);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    private static class DefaultPulseSource extends FixedRatePulseSource {
        DefaultPulseSource() {
            super(40);
        }
    }

    private TridentConfig() {
        this.pulseSource = new DefaultPulseSource();

        this.propertyInterpolators = new HashSet<>();

        this.addPropertyInterpolatorSource(new CorePropertyInterpolators());
        this.addPropertyInterpolatorSource(new AWTPropertyInterpolators());
    }

    public static synchronized TridentConfig getInstance() {
        if (config == null) {
            config = new TridentConfig();
        }
        return config;
    }

    public synchronized Collection<PropertyInterpolator<?>> getPropertyInterpolators() {
        return Collections.unmodifiableSet(this.propertyInterpolators);
    }

    @SuppressWarnings("unchecked")
    public synchronized <T> PropertyInterpolator<T> getPropertyInterpolator(Collection<T> values) {
        for (PropertyInterpolator<?> interpolator : this.propertyInterpolators) {
            try {
                Class<?> basePropertyClass = interpolator.getBasePropertyClass();
                boolean hasMatch = true;
                for (Object value : values) {
                    if (!basePropertyClass.isAssignableFrom(value.getClass())) {
                        hasMatch = false;
                    }
                }
                if (hasMatch) {
                    return (PropertyInterpolator<T>) interpolator;
                }
            } catch (NoClassDefFoundError ncdfe) {
            }
        }
        return null;
    }

    public synchronized void addPropertyInterpolator(PropertyInterpolator<?> pInterpolator) {
        this.propertyInterpolators.add(pInterpolator);
    }

    public synchronized void addPropertyInterpolatorSource(PropertyInterpolatorSource pInterpolatorSource) {
        this.propertyInterpolators.addAll(pInterpolatorSource.getPropertyInterpolators());
    }

    public synchronized void removePropertyInterpolator(PropertyInterpolator<?> pInterpolator) {
        this.propertyInterpolators.remove(pInterpolator);
    }

    public synchronized void setPulseSource(PulseSource pulseSource) {
        TridentAnimationThread current = TimelineEngine.getInstance().animatorThread;
        if ((current != null) && current.isAlive())
            throw new IllegalStateException("Cannot replace the pulse source thread once it's running");
        this.pulseSource = pulseSource;
    }

    public synchronized TridentConfig.PulseSource getPulseSource() {
        return pulseSource;
    }
}
