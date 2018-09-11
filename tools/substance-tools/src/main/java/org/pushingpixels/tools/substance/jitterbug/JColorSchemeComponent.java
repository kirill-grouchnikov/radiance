/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.tools.substance.jitterbug;

import com.jgoodies.forms.builder.FormBuilder;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.tools.substance.jitterbug.StateChangeEvent.StateChangeType;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;

public class JColorSchemeComponent extends JPanel {
    private JCheckBox isLight;
    private JLabel name;
    private JColorComponent ultraLight;
    private JColorComponent extraLight;
    private JColorComponent light;
    private JColorComponent mid;
    private JColorComponent dark;
    private JColorComponent ultraDark;
    private JColorComponent foreground;
    private ButtonGroup bg;

    public JColorSchemeComponent() {
        FormBuilder formBuilder = FormBuilder.create().
                columns("fill:pref").
                rows("p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p");

        this.bg = new ButtonGroup();

        this.ultraLight = createColorComponent("ultra light");
        this.extraLight = createColorComponent("extra light");
        this.light = createColorComponent("light");
        this.mid = createColorComponent("mid");
        this.dark = createColorComponent("dark");
        this.ultraDark = createColorComponent("ultra dark");
        this.foreground = createColorComponent("foreground");

        JPanel header = new JPanel();
        FormBuilder headerBuilder = FormBuilder.create().
                columns("fill:pref,2dlu,fill:min(150px;pref):grow,4dlu,right:pref").
                rows("p");

        name = new JLabel("");
        name.setFont(name.getFont().deriveFont(Font.BOLD));
        isLight = new JCheckBox("light");
        isLight.setSelected(true);
        isLight.setFocusable(false);
        headerBuilder.add(new JLabel("Display name:")).xy(1, 1);
        headerBuilder.add(name).xy(3, 1);
        headerBuilder.add(isLight).xy(5, 1);

        isLight.addActionListener((ActionEvent e) -> fireStateChanged(StateChangeType.MODIFIED));

        formBuilder.add(header).xy(1, 1);

        formBuilder.add(ultraLight).xy(1, 3);
        formBuilder.add(extraLight).xy(1, 5);
        formBuilder.add(light).xy(1, 7);
        formBuilder.add(mid).xy(1, 9);
        formBuilder.add(dark).xy(1, 11);
        formBuilder.add(ultraDark).xy(1, 13);
        formBuilder.add(foreground).xy(1, 15);
    }

    private JColorComponent createColorComponent(String label) {
        JColorComponent result = new JColorComponent(label, null);
        result.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if ("selectedColor".equals(evt.getPropertyName())) {
                fireStateChanged(StateChangeType.MODIFIED);
            }
        });
        this.bg.add(result.getRadio());
        return result;
    }

    public void setContent(SubstanceColorScheme scheme) {
        this.setEnabled(true);

        ultraLight.setColor(scheme.getUltraLightColor(), false);
        extraLight.setColor(scheme.getExtraLightColor(), false);
        light.setColor(scheme.getLightColor(), false);
        mid.setColor(scheme.getMidColor(), false);
        dark.setColor(scheme.getDarkColor(), false);
        ultraDark.setColor(scheme.getUltraDarkColor(), false);
        foreground.setColor(scheme.getForegroundColor(), false);
        isLight.setSelected(!scheme.isDark());
        name.setText(scheme.getDisplayName());

        fireStateChanged(StateChangeType.INITIALIZED);
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.setEnabledChildren(this, enabled);
    }

    private void setEnabledChildren(Component c, boolean enabled) {
        if (c instanceof Container) {
            Container cont = (Container) c;
            for (int i = 0; i < cont.getComponentCount(); i++) {
                Component child = cont.getComponent(i);
                child.setEnabled(enabled);
                setEnabledChildren(child, enabled);
            }
        }
    }

    public void clearContent() {
        this.setEnabled(false);

        ultraLight.setColor(null, false);
        extraLight.setColor(null, false);
        light.setColor(null, false);
        mid.setColor(null, false);
        dark.setColor(null, false);
        ultraDark.setColor(null, false);
        foreground.setColor(null, false);
        isLight.setSelected(true);
        name.setText("");

        fireStateChanged(StateChangeType.RESET);
    }

    public boolean isLight() {
        return this.isLight.isSelected();
    }

    public String getDisplayName() {
        return this.name.getText();
    }

    public Color getUltraLightColor() {
        return ultraLight.getColor();
    }

    public Color getExtraLightColor() {
        return extraLight.getColor();
    }

    public Color getLightColor() {
        return light.getColor();
    }

    public Color getMidColor() {
        return mid.getColor();
    }

    public Color getDarkColor() {
        return dark.getColor();
    }

    public Color getUltraDarkColor() {
        return ultraDark.getColor();
    }

    public Color getForegroundColor() {
        return foreground.getColor();
    }

    public String getEncoded() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.getDisplayName() + " {\n");
        sb.append("\tkind=" + (this.isLight() ? "Light" : "Dark") + "\n");
        sb.append("\tcolorUltraLight=" + this.ultraLight.getEncodedColor() + "\n");
        sb.append("\tcolorExtraLight=" + this.extraLight.getEncodedColor() + "\n");
        sb.append("\tcolorLight=" + this.light.getEncodedColor() + "\n");
        sb.append("\tcolorMid=" + this.mid.getEncodedColor() + "\n");
        sb.append("\tcolorDark=" + this.dark.getEncodedColor() + "\n");
        sb.append("\tcolorUltraDark=" + this.ultraDark.getEncodedColor() + "\n");
        sb.append("\tcolorForeground=" + this.foreground.getEncodedColor() + "\n");
        sb.append("}\n");
        return sb.toString();
    }

    /**
     * Adds the specified change listener to track changes to this ribbon.
     * 
     * @param l
     *            Change listener to add.
     * @see #removeChangeListener(ChangeListener)
     */
    public void addStateChangeListener(StateChangeListener l) {
        this.listenerList.add(StateChangeListener.class, l);
    }

    /**
     * Removes the specified change listener from tracking changes to this ribbon.
     * 
     * @param l
     *            Change listener to remove.
     * @see #addChangeListener(ChangeListener)
     */
    public void removeStateChangeListener(StateChangeListener l) {
        this.listenerList.remove(StateChangeListener.class, l);
    }

    /**
     * Notifies all registered listener that the state of this component has changed.
     */
    protected void fireStateChanged(StateChangeEvent.StateChangeType stateChangeType) {
        // Guaranteed to return a non-null array
        Object[] listeners = this.listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        StateChangeEvent event = new StateChangeEvent(this, stateChangeType);
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == StateChangeListener.class) {
                ((StateChangeListener) listeners[i + 1]).stateChanged(event);
            }
        }
    }

    public boolean isDefined() {
        if ((this.name.getText() == null) || (this.name.getText().trim().length() == 0))
            return false;
        if (!this.ultraLight.isDefined())
            return false;
        if (!this.extraLight.isDefined())
            return false;
        if (!this.light.isDefined())
            return false;
        if (!this.mid.isDefined())
            return false;
        if (!this.dark.isDefined())
            return false;
        if (!this.ultraDark.isDefined())
            return false;
        if (!this.foreground.isDefined())
            return false;
        return true;
    }

    public JColorComponent getSelectedColorComponent() {
        if (this.ultraLight.getRadio().isSelected())
            return this.ultraLight;
        if (this.extraLight.getRadio().isSelected())
            return this.extraLight;
        if (this.light.getRadio().isSelected())
            return this.light;
        if (this.mid.getRadio().isSelected())
            return this.mid;
        if (this.dark.getRadio().isSelected())
            return this.dark;
        if (this.ultraDark.getRadio().isSelected())
            return this.ultraDark;
        if (this.foreground.getRadio().isSelected())
            return this.foreground;
        return null;
    }
}
