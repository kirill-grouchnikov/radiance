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
package org.pushingpixels.radiance.component.internal.ui.ribbon;

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.ribbon.JRibbonBand;
import org.pushingpixels.radiance.component.internal.theming.ribbon.ui.RadianceBandControlPanelUI;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.UIResource;
import java.util.*;

/**
 * Control panel of a single {@link JRibbonBand}. This class is for internal use
 * only and should not be directly used by the applications.
 *
 * @author Kirill Grouchnikov
 */
public class JBandControlPanel extends AbstractBandControlPanel implements UIResource {
    public static class ControlPanelGroup {
        private String groupTitle;

        /**
         * Mapping from priority to galleries.
         */
        private Map<JRibbonBand.PresentationPriority, List<JRibbonGallery>> ribbonGalleries;

        /**
         * Mapping from gallery to priority.
         */
        private Map<JRibbonGallery, JRibbonBand.PresentationPriority> ribbonGalleriesPriorities;

        /**
         * Mapping from priority to ribbon buttons.
         */
        private Map<JRibbonBand.PresentationPriority, List<JCommandButton>> ribbonButtons;

        /**
         * Mapping from ribbon button to priority.
         */
        private Map<JCommandButton, JRibbonBand.PresentationPriority> ribbonButtonsPriorities;

        private List<JRibbonComponent> coreComps;

        public ControlPanelGroup(String groupTitle) {
            this.groupTitle = groupTitle;
            this.ribbonButtons = new HashMap<>();
            this.ribbonButtonsPriorities = new HashMap<>();
            this.ribbonGalleries = new HashMap<>();
            this.ribbonGalleriesPriorities = new HashMap<>();
            this.coreComps = new ArrayList<>();
        }

        public String getGroupTitle() {
            return groupTitle;
        }

        public void setGroupTitle(String newTitle) {
            if ((this.groupTitle == null) && (newTitle != null)) {
                throw new IllegalArgumentException(
                        "Cannot set a title for an unnamed group");
            }
            if ((this.groupTitle != null) && (newTitle == null)) {
                throw new IllegalArgumentException(
                        "Cannot remove a title from a named group");
            }
            this.groupTitle = newTitle;
        }

        public boolean isCoreContent() {
            return !this.coreComps.isEmpty();
        }

        /**
         * Adds a new ribbon button to <code>this</code> control panel.
         *
         * @param ribbonButton Ribbon button to add.
         * @param priority     Ribbon button priority.
         */
        public synchronized void addCommandButton(
                JCommandButton ribbonButton,
                JRibbonBand.PresentationPriority priority) {
            if (this.groupTitle != null) {
                throw new UnsupportedOperationException(
                        "Can't add command buttons to ribbon band group with non-null title");
            }
            if (this.isCoreContent()) {
                throw new UnsupportedOperationException(
                        "Ribbon band groups do not support mixing JRibbonComponents and custom Radiance components");
            }
            if (!this.ribbonButtons.containsKey(priority)) {
                this.ribbonButtons.put(priority, new LinkedList<>());
            }
            List<JCommandButton> al = this.ribbonButtons.get(priority);
            al.add(ribbonButton);

            this.ribbonButtonsPriorities.put(ribbonButton, priority);

            ribbonButton.setPresentationState(CommandButtonPresentationState.BIG);
        }

        /**
         * Adds a new in-ribbon gallery to <code>this</code> control panel.
         *
         * @param ribbonGallery Ribbon gallery to add.
         * @param priority      Ribbon gallery priority.
         */
        public synchronized void addRibbonGallery(JRibbonGallery ribbonGallery,
                JRibbonBand.PresentationPriority priority) {
            if (this.groupTitle != null) {
                throw new UnsupportedOperationException(
                        "Can't add galleries to ribbon band group with non-null title");
            }
            if (this.isCoreContent()) {
                throw new UnsupportedOperationException(
                        "Ribbon band groups do not support mixing JRibbonComponents and custom Radiance components");
            }
            // check the name
            if (!this.ribbonGalleries.containsKey(priority)) {
                this.ribbonGalleries.put(priority, new LinkedList<>());
            }
            List<JRibbonGallery> al = this.ribbonGalleries.get(priority);
            al.add(ribbonGallery);

            this.ribbonGalleriesPriorities.put(ribbonGallery, priority);

            ribbonGallery.setPresentationPriority(JRibbonBand.PresentationPriority.TOP);
        }

        public void addRibbonComponent(JRibbonComponent comp) {
            if (!this.ribbonButtonsPriorities.isEmpty()
                    || !this.ribbonGalleries.isEmpty()) {
                throw new UnsupportedOperationException(
                        "Ribbon band groups do not support mixing JRibbonComponents and custom Radiance components");
            }
            comp.setOpaque(false);
            this.coreComps.add(comp);
        }

        /**
         * Retrieves all ribbon buttons of specified priority from
         * <code>this</code> control panel.
         *
         * @param priority Priority.
         * @return All ribbon buttons of specified priority from
         * <code>this</code> control panel.
         */
        public List<JCommandButton> getRibbonButtons(
                JRibbonBand.PresentationPriority priority) {
            List<JCommandButton> result = this.ribbonButtons
                    .get(priority);
            if (result == null) {
                return EMPTY_GALLERY_BUTTONS_LIST;
            }
            return result;
        }

        /**
         * Retrieves all in-ribbon galleries of specified priority from
         * <code>this</code> control panel.
         *
         * @param priority Priority.
         * @return All in-ribbon galleries of specified priority from
         * <code>this</code> control panel.
         */
        public List<JRibbonGallery> getRibbonGalleries(JRibbonBand.PresentationPriority priority) {
            List<JRibbonGallery> result = this.ribbonGalleries.get(priority);
            if (result == null) {
                return EMPTY_RIBBON_GALLERIES_LIST;
            }
            return result;
        }

        public List<JRibbonComponent> getRibbonComps() {
            return this.coreComps;
        }
    }

    private LinkedList<ControlPanelGroup> controlPanelGroups;

    /**
     * Empty list of buttons.
     */
    private static final List<JCommandButton> EMPTY_GALLERY_BUTTONS_LIST = new LinkedList<>();

    /**
     * Empty list of galleries.
     */
    private static final List<JRibbonGallery> EMPTY_RIBBON_GALLERIES_LIST = new LinkedList<>();

    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "BandControlPanelUI";

    /**
     * Creates a control panel for specified ribbon band.
     */
    public JBandControlPanel() {
        super();

        this.controlPanelGroups = new LinkedList<>();
    }

    /**
     * Sets the new UI delegate.
     *
     * @param ui New UI delegate.
     */
    public void setUI(BandControlPanelUI ui) {
        super.setUI(ui);
    }

    @Override
    public void updateUI() {
        setUI(RadianceBandControlPanelUI.createUI(this));
    }

    @Override
    public BandControlPanelUI getUI() {
        return (BandControlPanelUI) ui;
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    /**
     * Adds a new ribbon button to <code>this</code> control panel.
     *
     * @param ribbonButton Ribbon button to add.
     * @param priority     Ribbon button priority.
     */
    public synchronized void addCommandButton(
            JCommandButton ribbonButton, JRibbonBand.PresentationPriority priority) {
        if (this.controlPanelGroups.isEmpty()) {
            this.startGroup();
        }

        this.controlPanelGroups.getLast().addCommandButton(ribbonButton, priority);

        super.add(ribbonButton);
    }

    /**
     * Adds a new in-ribbon gallery to <code>this</code> control panel.
     *
     * @param ribbonGallery Ribbon gallery to add.
     * @param priority      Ribbon gallery priority.
     */
    public synchronized void addRibbonGallery(JRibbonGallery ribbonGallery,
            JRibbonBand.PresentationPriority priority) {
        if (this.controlPanelGroups.isEmpty()) {
            this.startGroup();
        }

        this.controlPanelGroups.getLast().addRibbonGallery(ribbonGallery, priority);

        super.add(ribbonGallery);
    }

    public void addRibbonComponent(JRibbonComponent comp) {
        if (this.controlPanelGroups.isEmpty()) {
            this.startGroup();
        }

        this.controlPanelGroups.getLast().addRibbonComponent(comp);
        super.add(comp);
    }

    public List<ControlPanelGroup> getControlPanelGroups() {
        return Collections.unmodifiableList(this.controlPanelGroups);
    }

    public int getControlPanelGroupCount() {
        if (this.controlPanelGroups == null) {
            return 1;
        }
        return this.controlPanelGroups.size();
    }

    public String getControlPanelGroupTitle(int controlPanelGroupIndex) {
        if (this.controlPanelGroups == null) {
            return null;
        }
        return this.controlPanelGroups.get(controlPanelGroupIndex).groupTitle;
    }

    public int startGroup() {
        return this.startGroup(null);
    }

    public int startGroup(String groupTitle) {
        ControlPanelGroup controlPanelGroup = new ControlPanelGroup(groupTitle);
        this.controlPanelGroups.addLast(controlPanelGroup);
        this.fireChanged();
        return this.controlPanelGroups.size() - 1;
    }

    public void setGroupTitle(int groupIndex, String groupTitle) {
        this.controlPanelGroups.get(groupIndex).setGroupTitle(groupTitle);
        this.fireChanged();
    }

    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    private void fireChanged() {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        ChangeEvent ce = new ChangeEvent(this);
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ChangeListener.class) {
                ((ChangeListener) listeners[i + 1]).stateChanged(ce);
            }
        }
    }
}
