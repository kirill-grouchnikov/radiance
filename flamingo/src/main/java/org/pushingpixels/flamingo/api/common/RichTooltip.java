/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.flamingo.api.common;

import java.awt.Image;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;

/**
 * Rich tooltip for command buttons.
 * 
 * <p>
 * In its most basic form, the rich tooltip has a title and one (possible multiline) description
 * text:
 * </p>
 * 
 * <pre>
 * +--------------------------------+
 * | Title                          |
 * |        Some description text   |
 * +--------------------------------+
 * </pre>
 * 
 * <p>
 * The {@link #addDescriptionSection(String)} can be used to add multiple sections to the
 * description:
 * </p>
 * 
 * <pre>
 * +--------------------------------+
 * | Title                          |
 * |        First multiline         |
 * |        description section     |
 * |                                |
 * |        Second multiline        |
 * |        description section     |
 * |                                |
 * |        Third multiline         |
 * |        description section     |
 * +--------------------------------+
 * </pre>
 * 
 * <p>
 * The {@link #setMainImage(Image)} can be used to place an image below the title and to the left of
 * the description sections:
 * </p>
 * 
 * <pre>
 * +--------------------------------+
 * | Title                          |
 * | *******  First multiline       |
 * | *image*  description section   |
 * | *******                        |
 * |          Second multiline      |
 * |          description section   |
 * +--------------------------------+
 * </pre>
 * 
 * <p>
 * The {@link #addFooterSection(String)} can be used to add (possibly) multiple footer sections that
 * will be shown below a horizontal separator:
 * </p>
 * 
 * <pre>
 * +--------------------------------+
 * | Title                          |
 * |        First multiline         |
 * |        description section     |
 * |                                |
 * |        Second multiline        |
 * |        description section     |
 * |--------------------------------|
 * | A multiline footer section     |
 * | placed below a separator       |
 * +--------------------------------+
 * </pre>
 * 
 * <p>
 * The {@link #setFooterImage(Image)} can be used to place an image to the left of the footer
 * sections:
 * </p>
 * 
 * <pre>
 * +--------------------------------+
 * | Title                          |
 * |        First multiline         |
 * |        description section     |
 * |                                |
 * |        Second multiline        |
 * |        description section     |
 * |--------------------------------|
 * | *******  A multiline           |
 * | *image*  footer section        |
 * | *******                        |
 * +--------------------------------+
 * </pre>
 * 
 * <p>
 * Here is a fully fledged rich tooltip that shows all these APIs in action:
 * </p>
 * 
 * <pre>
 * +--------------------------------+
 * | Title                          |
 * | *******  First multiline       |
 * | *image*  description section   |
 * | *******                        |
 * |          Second multiline      |
 * |          description section   |
 * |--------------------------------|
 * | *******  First multiline       |
 * | *image*  footer section        |
 * | *******                        |
 * |          Second multiline      |
 * |          footer section        |
 * +--------------------------------+
 * </pre>
 * 
 * @author Kirill Grouchnikov
 */
public class RichTooltip {
    /**
     * The main title of this tooltip.
     * 
     * @see #getTitle()
     */
    private String title;

    /**
     * The main icon of this tooltip. Can be <code>null</code>.
     * 
     * @see #getMainIcon()
     */
    private ResizableIcon mainIcon;

    /**
     * The description sections of this tooltip.
     * 
     * @see #getDescriptionSections()
     */
    private List<String> descriptionSections;

    /**
     * The footer image of this tooltip. Can be <code>null</code>.
     * 
     * @see #getFooterImage()
     */
    private ResizableIcon footerIcon;

    /**
     * The footer sections of this tooltip. Can be empty.
     * 
     * @see #getFooterSections()
     */
    private List<String> footerSections;

    private RichTooltip() {
    }

    /**
     * Returns the main title of this tooltip.
     * 
     * @return The main title of this tooltip.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Returns the main icon of this tooltip. Can return <code>null</code>.
     * 
     * @return The main icon of this tooltip.
     * @see #getDescriptionSections()
     */
    public ResizableIcon getMainIcon() {
        return this.mainIcon;
    }

    /**
     * Returns an unmodifiable list of description sections of this tooltip. Guaranteed to return a
     * non-<code>null</code> list.
     * 
     * @return An unmodifiable list of description sections of this tooltip.
     * @see #getTitle()
     * @see #getMainIcon()
     */
    public List<String> getDescriptionSections() {
        return this.descriptionSections;
    }

    /**
     * Returns the footer icon of this tooltip. Can return <code>null</code>.
     * 
     * @return The footer icon of this tooltip.
     * @see #getFooterSections()
     */
    public ResizableIcon getFooterIcon() {
        return this.footerIcon;
    }

    /**
     * Returns an unmodifiable list of footer sections of this tooltip. Guaranteed to return a
     * non-<code>null</code> list.
     * 
     * @return An unmodifiable list of footer sections of this tooltip.
     * @see #getFooterImage()
     */
    public List<String> getFooterSections() {
        return this.footerSections;
    }

    public static class RichTooltipBuilder {
        private String title;
        private ResizableIcon mainIcon;
        private List<String> descriptionSections;
        private ResizableIcon footerIcon;
        private List<String> footerSections;

        @SuppressWarnings("unchecked")
        public RichTooltip build() {
            RichTooltip richTooltip = new RichTooltip();

            richTooltip.title = this.title;
            richTooltip.mainIcon = this.mainIcon;
            richTooltip.descriptionSections = (this.descriptionSections != null)
                    ? Collections.unmodifiableList(this.descriptionSections)
                    : Collections.EMPTY_LIST;
            richTooltip.footerIcon = this.footerIcon;
            richTooltip.footerSections = (this.footerSections != null)
                    ? Collections.unmodifiableList(this.footerSections)
                    : Collections.EMPTY_LIST;

            return richTooltip;
        }

        public RichTooltipBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public RichTooltipBuilder setMainIcon(ResizableIcon mainIcon) {
            this.mainIcon = mainIcon;
            return this;
        }

        public RichTooltipBuilder addDescriptionSection(String section) {
            if (this.descriptionSections == null) {
                this.descriptionSections = new LinkedList<String>();
            }
            this.descriptionSections.add(section);
            return this;
        }

        public RichTooltipBuilder setFooterIcon(ResizableIcon footerIcon) {
            this.footerIcon = footerIcon;
            return this;
        }

        public RichTooltipBuilder addFooterSection(String section) {
            if (this.footerSections == null) {
                this.footerSections = new LinkedList<String>();
            }
            this.footerSections.add(section);
            return this;
        }

    }
}
