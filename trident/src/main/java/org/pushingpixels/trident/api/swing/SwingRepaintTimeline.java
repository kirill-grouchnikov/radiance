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
package org.pushingpixels.trident.api.swing;

import org.pushingpixels.trident.api.Timeline;

import java.awt.*;

public class SwingRepaintTimeline extends Timeline {
    private static final String ERROR_PLAY_MESSAGE =
            "Only infinite looping is supported on SwingRepaintTimeline";

    private SwingRepaintCallback repaintCallback;

    public static SwingRepaintTimeline.Builder repaintBuilder(Component component) {
        return new SwingRepaintTimeline.Builder(component);
    }

    private SwingRepaintTimeline(Component mainTimelineComp, Rectangle toRepaint) {
        super(mainTimelineComp);
        this.repaintCallback = new SwingRepaintCallback(mainTimelineComp, toRepaint);
        this.addCallback(this.repaintCallback);
    }

    public void forceRepaintOnNextPulse() {
        this.repaintCallback.forceRepaintOnNextPulse();
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException(ERROR_PLAY_MESSAGE);
    }

    @Override
    public void playReverse() {
        throw new UnsupportedOperationException(ERROR_PLAY_MESSAGE);
    }

    @Override
    public void replay() {
        throw new UnsupportedOperationException(ERROR_PLAY_MESSAGE);
    }

    @Override
    public void replayReverse() {
        throw new UnsupportedOperationException(ERROR_PLAY_MESSAGE);
    }

    @Override
    public void playLoop(int loopCount, RepeatBehavior repeatBehavior) {
        if (loopCount >= 0) {
            throw new UnsupportedOperationException(ERROR_PLAY_MESSAGE);
        }
        super.playLoop(loopCount, repeatBehavior);
    }

    public static class Builder extends BaseBuilder<SwingRepaintTimeline,
            SwingRepaintTimeline.Builder, Component> {
        private Rectangle toRepaint;
        private boolean autoRepaintMode = true;

        public Builder(Component mainObject) {
            super(mainObject);
        }

        public SwingRepaintTimeline.Builder setRepaintRectangle(Rectangle toRepaint) {
            this.toRepaint = toRepaint;
            return this;
        }

        public SwingRepaintTimeline.Builder setAutoRepaintMode(boolean autoRepaintMode) {
            this.autoRepaintMode = autoRepaintMode;
            return this;
        }

        public SwingRepaintTimeline build() {
            SwingRepaintTimeline timeline = new SwingRepaintTimeline(this.mainObject,
                    this.toRepaint);

            this.configureBaseTimeline(timeline);

            timeline.repaintCallback.setAutoRepaintMode(this.autoRepaintMode);

            return timeline;
        }
    }
}