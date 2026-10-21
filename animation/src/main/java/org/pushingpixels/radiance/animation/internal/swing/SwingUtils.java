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
 */
package org.pushingpixels.radiance.animation.internal.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Utility methods for Swing component handling in animations.
 */
public class SwingUtils {

    /**
     * Default constructor.
     */
    public SwingUtils() {
    }

    /**
     * Checks whether the given object is a UI component.
     *
     * @param mainTimelineObject The object to check.
     * @return {@code true} if the object is a {@link Component}.
     */
    public static boolean isUiComponent(Object mainTimelineObject) {
        return (mainTimelineObject instanceof Component);
    }

    /**
     * Checks whether the given component is in a ready state (displayable).
     *
     * @param mainTimelineObject The component to check.
     * @return {@code true} if the component is displayable.
     */
    public static boolean isComponentInReadyState(Object mainTimelineObject) {
        return ((Component) mainTimelineObject).isDisplayable();
    }

    /**
     * Runs the given runnable on the event dispatch thread.
     * If already on the EDT, runs immediately; otherwise schedules via {@link SwingUtilities#invokeLater(Runnable)}.
     *
     * @param runnable The runnable to execute.
     */
    public static void runOnEventDispatchThread(Runnable runnable) {
        if (SwingUtilities.isEventDispatchThread()) {
            runnable.run();
        } else {
            SwingUtilities.invokeLater(runnable);
        }
    }
}
