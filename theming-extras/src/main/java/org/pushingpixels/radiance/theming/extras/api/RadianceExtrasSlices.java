/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.extras.api;

public class RadianceExtrasSlices {
    /**
     * Enumerates all available kinds of tab overview dialog.
     * 
     * @author Kirill Grouchnikov
     */
    public final static class TabOverviewKind {
        /**
         * Shows a grid with all tab thumbnails.
         */
        public static final TabOverviewKind GRID = new TabOverviewKind("grid");

        /**
         * Shows a round carousel with all tab thumbnails.
         */
        public static final TabOverviewKind ROUND_CAROUSEL = new TabOverviewKind("round carousel");

        /**
         * Shows a menu carousel with all tab thumbnails.
         */
        public static final TabOverviewKind MENU_CAROUSEL = new TabOverviewKind("menu carousel");

        /**
         * Animation kind name.
         */
        private String name;

        /**
         * Creates a new tab overview kind.
         * 
         * @param name
         *            Tab overview kind name.
         */
        private TabOverviewKind(String name) {
            this.name = name;
        }

        /**
         * Returns the name of <code>this</code> overview kind.
         * 
         * @return Name of <code>this</code> overview kind.
         */
        public String getName() {
            return this.name;
        }
    }
}
