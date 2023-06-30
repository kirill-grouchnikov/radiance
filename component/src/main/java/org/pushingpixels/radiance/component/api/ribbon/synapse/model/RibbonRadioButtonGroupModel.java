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
package org.pushingpixels.radiance.component.api.ribbon.synapse.model;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.*;

/**
 * Group of ribbon radio buttons.
 *
 * @author Kirill Grouchnikov
 */
public class RibbonRadioButtonGroupModel {
    /**
     * Contains all group radio button content models.
     */
    private Vector<RibbonRadioButtonContentModel> radioButtonModels;

    /**
     * Map of registered model change listeners.
     */
    private Map<RibbonRadioButtonContentModel, ChangeListener> modelChangeListeners;

    /**
     * The currently selected radio button content model. Can be <code>null</code>.
     */
    private RibbonRadioButtonContentModel selection;

    /**
     * If <code>false</code>, the selection cannot be cleared. By default the
     * radio button group allows clearing the selection in {@link #clearSelection()}
     * or {@link #setSelected(RibbonRadioButtonContentModel, boolean)} (passing the
     * currently selected content model and <code>false</code>).
     */
    private boolean allowsClearingSelection;

    /**
     * Creates a new radio button group.
     */
    public RibbonRadioButtonGroupModel() {
        this.radioButtonModels = new Vector<>();
        this.modelChangeListeners = new HashMap<>();
        this.allowsClearingSelection = true;
    }

    /**
     * Returns an unmodifiable collection with all the content models tracked by this model.
     *
     * @return An unmodifiable collection with all the content models tracked by this model.
     */
    public Collection<RibbonRadioButtonContentModel> getRadioButtonModels() {
        return Collections.unmodifiableCollection(this.radioButtonModels);
    }

    /**
     * Sets the new value for clearing selection. If <code>true</code> is
     * passed, the selection can be cleared in {@link #clearSelection()} or
     * {@link #setSelected(RibbonRadioButtonContentModel, boolean)} (passing the
     * currently selected content model and <code>false</code>).
     *
     * @param allowsClearingSelection The new value for clearing selection.
     */
    public void setAllowsClearingSelection(boolean allowsClearingSelection) {
        this.allowsClearingSelection = allowsClearingSelection;
    }

    /**
     * Returns the current value for clearing selection. <code>true</code> is
     * returned when selection can be cleared in {@link #clearSelection()} or
     * {@link #setSelected(RibbonRadioButtonContentModel, boolean)} (passing the
     * currently selected content model and <code>false</code>).
     *
     * @return The current value for clearing selection.
     */
    public boolean isAllowsClearingSelection() {
        return allowsClearingSelection;
    }

    /**
     * Adds the specified content model to the group. If the content model is selected, and
     * the group has a selected content model, the newly added content model is marked as
     * unselected.
     *
     * @param radioButtonContentModel The content model to be added.
     */
    public void add(final RibbonRadioButtonContentModel radioButtonContentModel) {
        if (radioButtonContentModel == null) {
            return;
        }
        radioButtonModels.addElement(radioButtonContentModel);

        boolean wasSelectionNull = (this.selection == null);
        if (radioButtonContentModel.isSelected()) {
            if (wasSelectionNull) {
                selection = radioButtonContentModel;
            } else {
                radioButtonContentModel.setSelected(false);
            }
        }
        ChangeListener cl = new ChangeListener() {
            boolean wasSelected = radioButtonContentModel.isSelected();

            @Override
            public void stateChanged(ChangeEvent e) {
                boolean isSelected = radioButtonContentModel.isSelected();
                if (wasSelected != isSelected) {
                    setSelected(radioButtonContentModel, isSelected);
                }
                wasSelected = isSelected;
            }
        };

        radioButtonContentModel.addChangeListener(cl);
        this.modelChangeListeners.put(radioButtonContentModel, cl);
    }

    /**
     * Removes the specified content model from the group.
     *
     * @param radioButtonContentModel The content model to be removed
     */
    public void remove(RibbonRadioButtonContentModel radioButtonContentModel) {
        if (radioButtonContentModel == null) {
            return;
        }
        radioButtonModels.removeElement(radioButtonContentModel);
        boolean wasSelected = (radioButtonContentModel == selection);
        if (wasSelected) {
            selection = null;
        }
        radioButtonContentModel.removeChangeListener(this.modelChangeListeners.get(radioButtonContentModel));
        this.modelChangeListeners.remove(radioButtonContentModel);
    }

    public void removeAll() {
        radioButtonModels.clear();
        selection = null;
    }

    /**
     * Changes the selected status of the specified content model.
     *
     * @param radioButtonContentModel Content model.
     * @param isSelected Selection indication.
     */
    public void setSelected(RibbonRadioButtonContentModel radioButtonContentModel, boolean isSelected) {
        if (isSelected && radioButtonContentModel != null && radioButtonContentModel != selection) {
            RibbonRadioButtonContentModel oldSelection = selection;
            selection = radioButtonContentModel;
            if (oldSelection != null) {
                oldSelection.setSelected(false);
            }
            radioButtonContentModel.setSelected(true);
        }

        if (!isSelected && (radioButtonContentModel != null) && (radioButtonContentModel == selection)) {
            if (this.allowsClearingSelection) {
                selection = null;
                radioButtonContentModel.setSelected(false);
            } else {
                // set the content model back to selected
                radioButtonContentModel.setSelected(true);
            }
        }
    }

    /**
     * Returns the selected content model of this group model.
     *
     * @return The selected content model of this group model. The result can be
     * <code>null</code>.
     */
    public RibbonRadioButtonContentModel getSelected() {
        return this.selection;
    }

    /**
     * Clears the selection of this content model toggle group model.
     */
    public void clearSelection() {
        if (this.allowsClearingSelection && (this.selection != null)) {
            this.selection.setSelected(false);
        }
    }
}
