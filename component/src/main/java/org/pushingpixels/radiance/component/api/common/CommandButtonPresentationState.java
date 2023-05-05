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
package org.pushingpixels.radiance.component.api.common;

import org.pushingpixels.radiance.component.internal.ui.common.CommandButtonLayoutManagerBig;
import org.pushingpixels.radiance.component.internal.ui.common.CommandButtonLayoutManagerMedium;
import org.pushingpixels.radiance.component.internal.ui.common.CommandButtonLayoutManagerSmall;
import org.pushingpixels.radiance.component.internal.ui.common.CommandButtonLayoutManagerTile;

/**
 * Presentation state for command buttons. This class provides a number of core
 * presentation states, and it is possible to create additional custom states by
 * using the protected constructor and implementing the relevant abstract
 * methods.
 *
 * @author Kirill Grouchnikov
 */
public abstract class CommandButtonPresentationState {
    /**
     * Big state.
     */
    public static final CommandButtonPresentationState BIG = new CommandButtonPresentationState(
            "Big", 32) {
        @Override
        public CommandButtonLayoutManager createLayoutManager(JCommandButton commandButton) {
            return new CommandButtonLayoutManagerBig();
        }
    };

    /**
     * Fit-to-icon + big state
     */
    public static final CommandButtonPresentationState BIG_FIT_TO_ICON =
            new CommandButtonPresentationState("Big fit to icon", 32) {
                @Override
                public CommandButtonLayoutManager createLayoutManager(JCommandButton commandButton) {
                    return new CommandButtonLayoutManagerBig.FitToIcon();
                }
            };

    /**
     * Tile state.
     */
    public static final CommandButtonPresentationState TILE = new CommandButtonPresentationState(
            "Tile", 32) {
        @Override
        public CommandButtonLayoutManager createLayoutManager(JCommandButton commandButton) {
            return new CommandButtonLayoutManagerTile();
        }
    };

    /**
     * Fit-to-icon + tile state
     */
    public static final CommandButtonPresentationState TILE_FIT_TO_ICON =
            new CommandButtonPresentationState("Tile fit to icon", 32) {
                @Override
                public CommandButtonLayoutManager createLayoutManager(JCommandButton commandButton) {
                    return new CommandButtonLayoutManagerTile.FitToIcon();
                }
            };

    /**
     * Medium state.
     */
    public static final CommandButtonPresentationState MEDIUM = new CommandButtonPresentationState(
            "Medium", 16) {
        @Override
        public CommandButtonLayoutManager createLayoutManager(JCommandButton commandButton) {
            return new CommandButtonLayoutManagerMedium();
        }
    };

    /**
     * Fit-to-icon + medium state
     */
    public static final CommandButtonPresentationState MEDIUM_FIT_TO_ICON =
            new CommandButtonPresentationState("Medium fit to icon", 16) {
                @Override
                public CommandButtonLayoutManager createLayoutManager(JCommandButton commandButton) {
                    return new CommandButtonLayoutManagerMedium.FitToIcon();
                }
            };

    /**
     * Small state.
     */
    public static final CommandButtonPresentationState SMALL = new CommandButtonPresentationState(
            "Small", 16) {
        @Override
        public CommandButtonLayoutManager createLayoutManager(JCommandButton commandButton) {
            return new CommandButtonLayoutManagerSmall();
        }
    };

    /**
     * Fit-to-icon + small state
     */
    public static final CommandButtonPresentationState SMALL_FIT_TO_ICON =
            new CommandButtonPresentationState("Small fit to icon", 16) {
                @Override
                public CommandButtonLayoutManager createLayoutManager(JCommandButton commandButton) {
                    return new CommandButtonLayoutManagerSmall.FitToIcon();
                }
            };

    /**
     * Preferred icon size for this state.
     *
     * @see #CommandButtonPresentationState(String, int)
     * @see #getPreferredIconSize()
     */
    private int preferredIconSize;

    /**
     * Display name for this state.
     *
     * @see #CommandButtonPresentationState(String, int)
     * @see #getDisplayName()
     */
    private String displayName;

    /**
     * Creates a new element state.
     *
     * @param displayName       Display name.
     * @param preferredIconSize Preferred icon size.
     */
    protected CommandButtonPresentationState(String displayName, int preferredIconSize) {
        this.displayName = displayName;
        this.preferredIconSize = preferredIconSize;
    }

    /**
     * Returns the display name for this state.
     *
     * @return The display name for this state.
     * @see #CommandButtonPresentationState(String, int)
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Returns the preferred icon size for this state.
     *
     * @return The preferred icon size for this state.
     * @see #CommandButtonPresentationState(String, int)
     */
    public int getPreferredIconSize() {
        return this.preferredIconSize;
    }

    /**
     * Creates a layout manager for the specified button.
     *
     * @param commandButton Command button.
     * @return A layout manager for the specified button.
     */
    public abstract CommandButtonLayoutManager createLayoutManager(
            JCommandButton commandButton);

    @Override
    public String toString() {
        return this.getDisplayName();
    }
}
