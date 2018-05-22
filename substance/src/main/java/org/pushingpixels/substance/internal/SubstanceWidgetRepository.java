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
package org.pushingpixels.substance.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.text.JTextComponent;

import org.pushingpixels.substance.api.SubstanceWidget;

/**
 * Repository of Substance widgets.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceWidgetRepository {
    /**
     * All registered widgets. Key is {@link Class} in the UI component hierarchy, value is a
     * {@link Set} of fully-qualified widget class names.
     */
    private Map<Class<?>, Set<WidgetClassInfo>> widgets;

    /**
     * Contains fully qualified class names of widgets that should not be installed on any
     * components.
     */
    private Set<String> widgetClassesToIgnore;

    /**
     * Singleton instance.
     */
    private static SubstanceWidgetRepository repository;

    /**
     * Information on a single class.
     * 
     * @author Kirill Grouchnikov
     */
    private static class WidgetClassInfo {
        /**
         * Class name.
         */
        public String className;

        /**
         * Indicates whether the matching should be exact.
         */
        public boolean isExact;

        /**
         * Creates a new info object.
         * 
         * @param className
         *            Class name.
         * @param isExact
         *            Indicates whether the matching should be exact.
         */
        public WidgetClassInfo(String className, boolean isExact) {
            this.className = className;
            this.isExact = isExact;
        }
    }

    /**
     * Creates a new repository. Marked private to enforce single instance.
     */
    private SubstanceWidgetRepository() {
        this.widgets = new HashMap<Class<?>, Set<WidgetClassInfo>>();
        this.widgetClassesToIgnore = new HashSet<String>();
    }

    /**
     * Returns the widget repository.
     * 
     * @return Widget repository.
     */
    public static synchronized SubstanceWidgetRepository getRepository() {
        if (repository == null) {
            repository = new SubstanceWidgetRepository();

            // Populate default widgets
            repository.registerWidget(
                    "org.pushingpixels.substance.internal.widget.animation.effects.GhostAnimationWidget",
                    JButton.class, false);
            repository.registerWidget(
                    "org.pushingpixels.substance.internal.widget.animation.effects.GhostAnimationWidget",
                    JToggleButton.class, true);
            repository.registerWidget(
                    "org.pushingpixels.substance.internal.widget.desktop.DesktopIconHoverPreviewWidget",
                    JInternalFrame.JDesktopIcon.class, false);
            repository.registerWidget(
                    "org.pushingpixels.substance.internal.widget.menu.MenuSearchWidget",
                    JMenuBar.class, false);
            repository.registerWidget(
                    "org.pushingpixels.substance.internal.widget.scroll.AutoScrollWidget",
                    JScrollPane.class, false);
            repository.registerWidget(
                    "org.pushingpixels.substance.internal.widget.scroll.ScrollPaneSelectorWidget",
                    JScrollPane.class, false);
            repository.registerWidget(
                    "org.pushingpixels.substance.internal.widget.text.PasswordStrengthCheckerWidget",
                    JPasswordField.class, false);
            repository.registerWidget(
                    "org.pushingpixels.substance.internal.widget.text.LockBorderWidget",
                    JTextComponent.class, false);
            repository.registerWidget(
                    "org.pushingpixels.substance.internal.widget.text.SelectAllOnFocusGainWidget",
                    JTextComponent.class, false);
            repository.registerWidget(
                    "org.pushingpixels.substance.internal.widget.text.SelectOnEscapeWidget",
                    JTextComponent.class, false);
            repository.registerWidget(
                    "org.pushingpixels.substance.internal.widget.text.EditContextMenuWidget",
                    JTextComponent.class, false);
            repository.registerWidget(
                    "org.pushingpixels.substance.internal.widget.tree.dnd.TreeDragAndDropWidget",
                    JTree.class, false);
        }
        return repository;
    }

    /**
     * Registers a new widget for the specified UI classes. The list should contain {@link Class}
     * instances.
     * 
     * @param widgetClassName
     *            Full-qualified class name for the widget.
     * @param supportedClasses
     *            Classes supported by the widget.
     */
    public synchronized void registerWidget(String widgetClassName,
            List<Class<?>> supportedClasses) {
        for (Class<?> clazz : supportedClasses)
            this.registerWidget(widgetClassName, clazz, false);
    }

    /**
     * Registers a new widget for the specified UI class.
     * 
     * @param widgetClassName
     *            Full-qualified class name for the widget.
     * @param supportedClass
     *            Class supported by the widget.
     * @param isExact
     *            if <code>true</code>, the widget will be available only for the components of the
     *            specified class. If <code>false</code>, the widget be available for the components
     *            of the specified class and all its descendants (as defined in the
     *            {@link Class#isAssignableFrom(Class)} ).
     */
    public synchronized void registerWidget(String widgetClassName, Class<?> supportedClass,
            boolean isExact) {
        if (JComponent.class.isAssignableFrom(supportedClass)) {
            if (!this.widgets.containsKey(supportedClass))
                this.widgets.put(supportedClass, new HashSet<WidgetClassInfo>());
        }
        // Guard against multiple registrations of the same widget.
        // This can happen if more than one jar on the classpath defines
        // the same widget.
        for (WidgetClassInfo registered : this.widgets.get(supportedClass)) {
            if (registered.className.equals(widgetClassName))
                return;
        }
        this.widgets.get(supportedClass).add(new WidgetClassInfo(widgetClassName, isExact));
    }

    /**
     * Returns a set of widgets that match the specified component. The component hierarchy is
     * scanned bottom-up and all matching widget classes are used to instantiate new instance of
     * widgets.
     * 
     * @param jcomp
     *            UI component.
     * @return Set of widgets that match the specified component.
     */
    public synchronized Set<SubstanceWidget> getMatchingWidgets(JComponent jcomp) {
        Set<SubstanceWidget> result = new HashSet<SubstanceWidget>();
        Class<?> clazz = jcomp.getClass();
        boolean isOriginator = true;
        while (clazz != null) {
            Set<WidgetClassInfo> registered = this.widgets.get(clazz);
            if (registered != null) {
                for (WidgetClassInfo widgetClassInfo : registered) {
                    if (widgetClassInfo.isExact && !isOriginator)
                        continue;
                    try {
                        String widgetClassName = widgetClassInfo.className;
                        // check if the application requested to ignore the
                        // specific widget
                        if (this.widgetClassesToIgnore.contains(widgetClassName))
                            continue;

                        // The code below will fail if no such class exists.
                        // This allows safely removing the relevant widget
                        // classes making the jar size smaller (lite versions).
                        Object widgetObj = Class.forName(widgetClassName).newInstance();
                        if (widgetObj instanceof SubstanceWidget) {
                            SubstanceWidget widget = (SubstanceWidget) widgetObj;
                            widget.setComponent(jcomp);
                            result.add(widget);
                        }
                        // the exceptions are ignored - see the explanation
                        // above.
                    } catch (InstantiationException ie) {
                    } catch (IllegalAccessException iae) {
                    } catch (ClassNotFoundException cnfe) {
                    }
                }
            }
            clazz = clazz.getSuperclass();
            isOriginator = false;
        }
        return result;
    }

    /**
     * Marks widget with the specified class name to never be installed on any components.
     * 
     * @param widgetClassName
     *            Fully qualified widget class name.
     */
    public synchronized void addToIgnoreWidgets(String widgetClassName) {
        this.widgetClassesToIgnore.add(widgetClassName);
    }
}
