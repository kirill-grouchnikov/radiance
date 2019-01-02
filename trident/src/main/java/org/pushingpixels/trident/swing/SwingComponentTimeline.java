/*
 * Copyright (c) 2005-2019 Trident Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Trident Kirill Grouchnikov nor the names of
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
package org.pushingpixels.trident.swing;

import org.pushingpixels.trident.Timeline;

import java.awt.*;

public class SwingComponentTimeline extends Timeline {
    private boolean forceUiUpdate;

    /**
     * Constructs a new timeline associated with a Swing component.
     *
     * @param mainTimelineComp Main component for this timeline. Must not be <code>null</code>,
     *                         otherwise an exception will be thrown.
     */
    public SwingComponentTimeline(Component mainTimelineComp) {
        this(mainTimelineComp, false);
    }

    /**
     * Constructs a new timeline associated with a Swing component.
     *
     * @param mainTimelineComp Main component for this timeline. Must not be <code>null</code>,
     *                         otherwise an exception will be thrown.
     * @param forceUiUpdate    If this is <code>true</code>, updates to the timeline (pulse and
     *                         state changes) will be forced to run even if the
     *                         {@link SwingToolkitHandler}
     *                         considers the associated component to not be in the ready state.
     */
    public SwingComponentTimeline(Component mainTimelineComp, boolean forceUiUpdate) {
        super(mainTimelineComp);
        if (mainTimelineComp == null) {
            throw new IllegalArgumentException("Must have non-null component");
        }
        this.forceUiUpdate = forceUiUpdate;
    }

    @Override
    protected boolean shouldForceUiUpdate() {
        return this.forceUiUpdate;
    }
}