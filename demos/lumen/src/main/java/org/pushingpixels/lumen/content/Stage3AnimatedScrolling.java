/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.lumen.content;

import org.pushingpixels.trident.Timeline;

/**
 * Adds the following functionality to the album scroller container:
 *
 * <ul>
 * <li>Animated scrolling of album overview components with mouse wheel and left
 * / right arrow keys</li>
 * </ul>
 *
 * @author Kirill Grouchnikov
 */
public class Stage3AnimatedScrolling extends Stage2Components {
    /**
     * Contains the target leading position - this is the index of the album
     * which should appear at the left edge once the current
     * {@link #scrollTimeline} is done. Note that the user scrolling can be done
     * in the middle of the current scrolling animation. In this case, the field
     * is updated with the new target index.
     */
    float targetLeadingPosition;

    /**
     * The scroll timeline. Note that the user scrolling can be done in the
     * middle of the current scrolling animation. In this case, the current
     * timeline is cancelled, and a new one is created - this allows quick
     * scrolling with multiple mouse wheel / arrow events.
     */
    Timeline scrollTimeline;

    /**
     * Creates the new container that can animate the album scrolling.
     */
    public Stage3AnimatedScrolling() {
        super();
        this.targetLeadingPosition = 0;
    }

    @Override
    protected void scrollToNext() {
        if (this.targetLeadingPosition < (this.comps.size() - 1)) {
            this.targetLeadingPosition++;
            scrollContents();
        }
    }

    @Override
    protected void scrollToPrevious() {
        if (this.targetLeadingPosition > 0) {
            this.targetLeadingPosition--;
            scrollContents();
        }
    }

    /**
     * Scrolls the contents of this container.
     */
    private synchronized void scrollContents() {
        if (this.scrollTimeline != null) {
            // abort the playing scroll timeline
            this.scrollTimeline.abort();
        }

        // and dynamically create a new one to change the
        // leading position
        this.scrollTimeline = Timeline.builder(this)
                .addPropertyToInterpolate(Timeline.<Float>property("leadingPosition")
                        .fromCurrent().to(this.targetLeadingPosition))
                .setDuration(250)
                .build();

        scrollTimeline.play();
    }

    public float getLeadingPosition() {
        return this.leadingPosition;
    }

    /**
     * Sets the new value for the leading position. This is called from
     * {@link #scrollTimeline}.
     *
     * @param leadingPosition The new value for the leading position.
     */
    public void setLeadingPosition(float leadingPosition) {
        this.leadingPosition = leadingPosition;
        revalidate();
    }
}
