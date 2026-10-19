/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
 *
 * Derived from AndroidX Compose EasingFunctions.kt
 * https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/animation/animation-core/src/commonMain/kotlin/androidx/compose/animation/core/EasingFunctions.kt
 */
package org.pushingpixels.radiance.animation.api.ease;

// This is a modified version of the original source code by The Android Open
// Source Project available under the Apache 2.0 license. See the full
// license under resources/AndroidX.license.

/**
 * A collection of easing functions
 *
 * @author Kirill Grouchnikov
 */
public final class EasingFunctions {
    private EasingFunctions() {
        // utility class
    }

    /**
     * Easing curve that speeds up quickly and ends slowly.
     */
    public static final TimelineEase EASE = new Spline(0.25f, 0.1f, 0.25f, 1.0f);

    /**
     * Easing curve that starts quickly and ends slowly.
     */
    public static final TimelineEase EASE_OUT = new Spline(0f, 0f, 0.58f, 1f);

    /**
     * Easing curve that starts slowly and ends quickly.
     */
    public static final TimelineEase EASE_IN = new Spline(0.42f, 0f, 1f, 1f);

    /**
     * Easing curve that starts slowly, speeds up and then ends slowly.
     */
    public static final TimelineEase EASE_IN_OUT = new Spline(0.42f, 0.0f, 0.58f, 1.0f);

    /**
     * Easing curve that starts slowly and ends quickly. Similar to {@link #EASE_IN},
     * but with slightly less abrupt beginning.
     */
    public static final TimelineEase EASE_IN_SINE = new Spline(0.12f, 0f, 0.39f, 0f);

    /**
     * Easing curve based on a sine wave, easing out.
     */
    public static final TimelineEase EASE_OUT_SINE = new Spline(0.61f, 1f, 0.88f, 1f);

    /**
     * Easing curve based on a sine wave, easing in and out.
     */
    public static final TimelineEase EASE_IN_OUT_SINE = new Spline(0.37f, 0f, 0.63f, 1f);

    /**
     * Easing curve based on a cubic function, easing in.
     */
    public static final TimelineEase EASE_IN_CUBIC = new Spline(0.32f, 0f, 0.67f, 0f);

    /**
     * Easing curve based on a cubic function, easing out.
     */
    public static final TimelineEase EASE_OUT_CUBIC = new Spline(0.33f, 1f, 0.68f, 1f);

    /**
     * Easing curve based on a cubic function, easing in and out.
     */
    public static final TimelineEase EASE_IN_OUT_CUBIC = new Spline(0.65f, 0f, 0.35f, 1f);

    /**
     * Easing curve based on a quintic function, easing in.
     */
    public static final TimelineEase EASE_IN_QUINT = new Spline(0.64f, 0f, 0.78f, 0f);

    /**
     * Easing curve based on a quintic function, easing out.
     */
    public static final TimelineEase EASE_OUT_QUINT = new Spline(0.22f, 1f, 0.36f, 1f);

    /**
     * Easing curve based on a quintic function, easing in and out.
     */
    public static final TimelineEase EASE_IN_OUT_QUINT = new Spline(0.83f, 0f, 0.17f, 1f);

    /**
     * Easing curve based on a circular function, easing in.
     */
    public static final TimelineEase EASE_IN_CIRC = new Spline(0.55f, 0f, 1f, 0.45f);

    /**
     * Easing curve based on a circular function, easing out.
     */
    public static final TimelineEase EASE_OUT_CIRC = new Spline(0f, 0.55f, 0.45f, 1f);

    /**
     * Easing curve based on a circular function, easing in and out.
     */
    public static final TimelineEase EASE_IN_OUT_CIRC = new Spline(0.85f, 0f, 0.15f, 1f);

    /**
     * Easing curve based on a quadratic function, easing in.
     */
    public static final TimelineEase EASE_IN_QUAD = new Spline(0.11f, 0f, 0.5f, 0f);

    /**
     * Easing curve based on a quadratic function, easing out.
     */
    public static final TimelineEase EASE_OUT_QUAD = new Spline(0.5f, 1f, 0.89f, 1f);

    /**
     * Easing curve based on a quadratic function, easing in and out.
     */
    public static final TimelineEase EASE_IN_OUT_QUAD = new Spline(0.45f, 0f, 0.55f, 1f);

    /**
     * Easing curve based on a quartic function, easing in.
     */
    public static final TimelineEase EASE_IN_QUART = new Spline(0.5f, 0f, 0.75f, 0f);

    /**
     * Easing curve based on a quartic function, easing out.
     */
    public static final TimelineEase EASE_OUT_QUART = new Spline(0.25f, 1f, 0.5f, 1f);

    /**
     * Easing curve based on a quartic function, easing in and out.
     */
    public static final TimelineEase EASE_IN_OUT_QUART = new Spline(0.76f, 0f, 0.24f, 1f);

    /**
     * Easing curve based on an exponential function, easing in.
     */
    public static final TimelineEase EASE_IN_EXPO = new Spline(0.7f, 0f, 0.84f, 0f);

    /**
     * Easing curve based on an exponential function, easing out.
     */
    public static final TimelineEase EASE_OUT_EXPO = new Spline(0.16f, 1f, 0.3f, 1f);

    /**
     * Easing curve based on an exponential function, easing in and out.
     */
    public static final TimelineEase EASE_IN_OUT_EXPO = new Spline(0.87f, 0f, 0.13f, 1f);

    /**
     * Easing curve that overshoots the target, easing in (anticipates).
     */
    public static final TimelineEase EASE_IN_BACK = new Spline(0.36f, 0f, 0.66f, -0.56f);

    /**
     * Easing curve that overshoots the target, easing out.
     */
    public static final TimelineEase EASE_OUT_BACK = new Spline(0.34f, 1.56f, 0.64f, 1f);

    /**
     * Easing curve that overshoots the target, easing in and out.
     */
    public static final TimelineEase EASE_IN_OUT_BACK = new Spline(0.68f, -0.6f, 0.32f, 1.6f);

    /**
     * Easing curve with an elastic (oscillating) effect, easing in.
     */
    public static final TimelineEase EASE_IN_ELASTIC = new TimelineEase() {
        private static final float C4 = (2f * (float) Math.PI) / 3f;

        @Override
        public float map(float fraction) {
            if (fraction == 0f) return 0f;
            if (fraction == 1f) return 1f;
            return (float) -(Math.pow(2.0, 10.0 * fraction - 10.0)
                    * Math.sin((fraction * 10.0 - 10.75) * C4));
        }
    };

    /**
     * Easing curve with an elastic (oscillating) effect, easing out.
     */
    public static final TimelineEase EASE_OUT_ELASTIC = new TimelineEase() {
        private static final float C4 = (2f * (float) Math.PI) / 3f;

        @Override
        public float map(float fraction) {
            if (fraction == 0f) return 0f;
            if (fraction == 1f) return 1f;
            return (float) (Math.pow(2.0, -10.0 * fraction)
                    * Math.sin((fraction * 10.0 - 0.75) * C4) + 1.0);
        }
    };

    /**
     * Easing curve with an elastic (oscillating) effect, easing in and out.
     */
    public static final TimelineEase EASE_IN_OUT_ELASTIC = new TimelineEase() {
        private static final float C5 = (2f * (float) Math.PI) / 4.5f;

        @Override
        public float map(float fraction) {
            if (fraction == 0f) return 0f;
            if (fraction == 1f) return 1f;
            if (fraction <= 0.5f) {
                return (float) -(Math.pow(2.0, 20.0 * fraction - 10.0)
                        * Math.sin((20.0 * fraction - 11.125) * C5)) / 2.0f;
            }
            return (float) ((Math.pow(2.0, -20.0 * fraction + 10.0)
                    * Math.sin((fraction * 20.0 - 11.125) * C5)) / 2.0f + 1.0);
        }
    };

    /**
     * Easing curve with a bounce effect, easing out.
     */
    public static final TimelineEase EASE_OUT_BOUNCE = new TimelineEase() {
        private static final float N1 = 7.5625f;
        private static final float D1 = 2.75f;

        @Override
        public float map(float fraction) {
            if (fraction < 1f / D1) {
                return N1 * fraction * fraction;
            }
            if (fraction < 2f / D1) {
                float f = fraction - 1.5f / D1;
                return N1 * f * f + 0.75f;
            }
            if (fraction < 2.5f / D1) {
                float f = fraction - 2.25f / D1;
                return N1 * f * f + 0.9375f;
            }
            float f = fraction - 2.625f / D1;
            return N1 * f * f + 0.984375f;
        }
    };

    /**
     * Easing curve with a bounce effect, easing in.
     */
    public static final TimelineEase EASE_IN_BOUNCE = new TimelineEase() {
        @Override
        public float map(float fraction) {
            return 1f - EASE_OUT_BOUNCE.map(1f - fraction);
        }
    };

    /**
     * Easing curve with a bounce effect, easing in and out.
     */
    public static final TimelineEase EASE_IN_OUT_BOUNCE = new TimelineEase() {
        @Override
        public float map(float fraction) {
            if (fraction < 0.5f) {
                return (1f - EASE_OUT_BOUNCE.map(1f - 2f * fraction)) / 2f;
            }
            return (1f + EASE_OUT_BOUNCE.map(2f * fraction - 1f)) / 2f;
        }
    };
}
