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
package org.pushingpixels.radiance.common.api.model;

import java.awt.*;

/**
 * Event fired when the selection state of a tri-state button changes.
 */
public class TriStateSelectionChangeEvent extends AWTEvent {
    /** The item affected by the event. */
    private Object item;

    /** The type of selection state change. */
    private TriStateButtonModel.SelectionState selectionStateChange;

    /**
     * Creates a new tri-state selection change event.
     *
     * @param source               The event source.
     * @param id                   The event ID.
     * @param item                 The item affected by the event.
     * @param selectionStateChange The new selection state.
     */
    public TriStateSelectionChangeEvent(Object source, int id, Object item,
            TriStateButtonModel.SelectionState selectionStateChange) {
        super(source, id);
        this.item = item;
        this.selectionStateChange = selectionStateChange;
    }

    /**
     * Returns the item affected by the event.
     *
     * @return the item (object) that was affected by the event
     */
    public Object getItem() {
        return item;
    }

    /**
     * Returns the type of selection state change.
     *
     * @return The type of selection state change.
     */
    public TriStateButtonModel.SelectionState getSelectionStateChange() {
        return this.selectionStateChange;
    }
}