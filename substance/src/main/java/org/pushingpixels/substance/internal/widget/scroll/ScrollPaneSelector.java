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
package org.pushingpixels.substance.internal.widget.scroll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.EnumSet;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.preview.PreviewPainter;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;
import org.pushingpixels.substance.internal.utils.icon.TransitionAwareIcon;
import org.pushingpixels.trident.Timeline;
import org.pushingpixels.trident.Timeline.TimelineState;
import org.pushingpixels.trident.callback.UIThreadTimelineCallbackAdapter;

/**
 * ScrollPaneSelector is a little utility class that provides a means to quickly scroll both
 * vertically and horizontally on a single mouse click, by dragging a selection rectangle over a
 * "thumbnail" of the scrollPane's viewport view.
 * <p>
 * Once the selector is installed on a given JScrollPane instance, a little button appears as soon
 * as at least one of its scroll bars is made visible.
 * <p>
 * Contributed by the original author under BSD license. Also appears in the
 * <a href="https://jdnc-incubator.dev.java.net">JDNC Incubator</a>.
 * 
 * @author weebib (Pierre LE LANNIC)
 * @author Kirill Grouchnikov (animations).
 */
public class ScrollPaneSelector extends JComponent {
    // static final fields
    private static final String COMPONENT_ORIENTATION = "componentOrientation";

    // member fields
    private LayoutManager theFormerLayoutManager;
    private JScrollPane theScrollPane;
    private JComponent theComponent;
    private JPopupMenu thePopupMenu;
    private boolean toRestoreOriginal;
    private JButton theButton;
    private BufferedImage theImage;
    private Rectangle theStartRectangle;
    private Rectangle theRectangle;
    private Point theStartPoint;
    private Point thePrevPoint;
    private double theScale;
    private PropertyChangeListener propertyChangeListener;
    private ContainerAdapter theViewPortViewListener;

    // -- Constructor ------
    ScrollPaneSelector() {
        setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        theScrollPane = null;
        theImage = null;
        theStartRectangle = null;
        theRectangle = null;
        theStartPoint = null;
        theScale = 0.0;
        theButton = new JButton() {
            @Override
            public Insets getInsets() {
                return new Insets(2, 2, 2, 2);
            }

            @Override
            public Insets getInsets(Insets insets) {
                if (insets == null) {
                    insets = new Insets(2, 2, 2, 2);
                }
                insets.set(2, 2, 2, 2);
                return insets;
            }
        };
        SubstanceCoreUtilities.markButtonAsFlat(theButton);
        theButton.setFocusable(false);
        theButton.setFocusPainted(false);
        SubstanceCortex.ComponentScope.setButtonStraightSides(this.theButton,
                EnumSet.allOf(SubstanceSlices.Side.class));

        MouseInputListener mil = new MouseInputAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point p = e.getPoint();
                SwingUtilities.convertPointToScreen(p, theButton);
                display(p);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (!thePopupMenu.isVisible())
                    return;
                toRestoreOriginal = false;
                thePopupMenu.setVisible(false);
                theStartRectangle = theRectangle;
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (theStartPoint == null)
                    return;

                if (!thePopupMenu.isShowing())
                    return;

                Point newPoint = e.getPoint();
                SwingUtilities.convertPointToScreen(newPoint, (Component) e.getSource());

                Rectangle popupScreenRect = new Rectangle(thePopupMenu.getLocationOnScreen(),
                        thePopupMenu.getSize());
                if (!popupScreenRect.contains(newPoint))
                    return;

                int deltaX = (int) ((newPoint.x - thePrevPoint.x) / theScale);
                int deltaY = (int) ((newPoint.y - thePrevPoint.y) / theScale);
                scroll(deltaX, deltaY, false);

                thePrevPoint = newPoint;
            }
        };
        theButton.addMouseListener(mil);
        theButton.addMouseMotionListener(mil);
        setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
        thePopupMenu = new JPopupMenu();
        thePopupMenu.setLayout(new BorderLayout());
        thePopupMenu.add(this, BorderLayout.CENTER);
        propertyChangeListener = (PropertyChangeEvent evt) -> {
            if (theScrollPane == null)
                return;
            if ("componentOrientation".equals(evt.getPropertyName())) {
                theScrollPane.setCorner(JScrollPane.LOWER_LEADING_CORNER, null);
                theScrollPane.setCorner(JScrollPane.LOWER_TRAILING_CORNER, theButton);
            }
        };
        theViewPortViewListener = new ContainerAdapter() {
            @Override
            public void componentAdded(ContainerEvent e) {
                if (thePopupMenu.isVisible())
                    thePopupMenu.setVisible(false);
                Component comp = theScrollPane.getViewport().getView();
                theComponent = (comp instanceof JComponent) ? (JComponent) comp : null;
            }
        };
        thePopupMenu.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if ("visible".equals(evt.getPropertyName())) {
                if (!thePopupMenu.isVisible()) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    if (toRestoreOriginal) {
                        int deltaX = (int) ((thePrevPoint.x - theStartPoint.x) / theScale);
                        int deltaY = (int) ((thePrevPoint.y - theStartPoint.y) / theScale);
                        scroll(-deltaX, -deltaY, true);
                    }
                }
            }
        });
    }

    // -- JComponent overriden methods ------
    @Override
    public Dimension getPreferredSize() {
        if (theImage == null || theRectangle == null)
            return new Dimension();
        Insets insets = getInsets();
        double scaleFactor = UIUtil.getScaleFactor();
        return new Dimension((int) (theImage.getWidth() / scaleFactor) + insets.left + insets.right,
                (int) (theImage.getHeight() / scaleFactor) + insets.top + insets.bottom);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (theImage == null || theRectangle == null)
            return;
        Graphics2D g2d = (Graphics2D) g.create();

        Insets insets = getInsets();
        int xOffset = insets.left;
        int yOffset = insets.top;
        int availableWidth = getWidth() - insets.left - insets.right;
        int availableHeight = getHeight() - insets.top - insets.bottom;
        double scaleFactor = UIUtil.getScaleFactor();
        g2d.drawImage(theImage, xOffset, yOffset, (int) (theImage.getWidth() / scaleFactor),
                (int) (theImage.getHeight() / scaleFactor), null);

        Color tmpColor = g2d.getColor();
        Area area = new Area(new Rectangle(xOffset, yOffset, availableWidth, availableHeight));
        area.subtract(new Area(theRectangle));
        g2d.setColor(new Color(200, 200, 200, 128));
        g2d.fill(area);
        g2d.setColor(Color.BLACK);
        g2d.draw(theRectangle);
        g2d.setColor(tmpColor);

        g2d.dispose();
    }

    // -- Private methods ------
    void installOnScrollPane(JScrollPane aScrollPane) {
        if (theScrollPane != null)
            uninstallFromScrollPane();
        theScrollPane = aScrollPane;
        theFormerLayoutManager = theScrollPane.getLayout();
        theScrollPane.setLayout(new TweakedScrollPaneLayout());
        theScrollPane.firePropertyChange("layoutManager", false, true);
        theScrollPane.addPropertyChangeListener(COMPONENT_ORIENTATION, propertyChangeListener);
        theScrollPane.getViewport().addContainerListener(theViewPortViewListener);
        theScrollPane.setCorner(JScrollPane.LOWER_TRAILING_CORNER, theButton);
        Component comp = theScrollPane.getViewport().getView();
        theComponent = (comp instanceof JComponent) ? (JComponent) comp : null;

        int dimension = UIManager.getInt("ScrollBar.width") - 4;
        this.theButton.setIcon(new TransitionAwareIcon(
                this.theButton, (SubstanceColorScheme scheme) -> SubstanceCortex.GlobalScope
                        .getIconPack().getInspectIcon(dimension, scheme),
                "substance.widget.scroll.selector"));

        theScrollPane.doLayout();
    }

    void uninstallFromScrollPane() {
        if (theScrollPane == null)
            return;
        if (thePopupMenu.isVisible())
            thePopupMenu.setVisible(false);
        theScrollPane.setCorner(JScrollPane.LOWER_TRAILING_CORNER, null);
        theScrollPane.removePropertyChangeListener(COMPONENT_ORIENTATION, propertyChangeListener);
        theScrollPane.getViewport().removeContainerListener(theViewPortViewListener);
        theScrollPane.setLayout(theFormerLayoutManager);
        theScrollPane.firePropertyChange("layoutManager", true, false);
        theScrollPane = null;
    }

    private void display(Point aPointOnScreen) {
        if (theComponent == null)
            return;

        PreviewPainter previewPainter = WidgetUtilities.getComponentPreviewPainter(theScrollPane);
        if (!previewPainter.hasPreview(theComponent.getParent(), theComponent, 0))
            return;

        Dimension pDimension = previewPainter.getPreviewWindowDimension(theComponent.getParent(),
                theComponent, 0);
        double compWidth = theComponent.getWidth();
        double compHeight = theComponent.getHeight();
        double scaleX = pDimension.getWidth() / compWidth;
        double scaleY = pDimension.getHeight() / compHeight;
        theScale = Math.min(scaleX, scaleY);
        int previewWidth = (int) (theComponent.getWidth() * theScale);
        int previewHeight = (int) (theComponent.getHeight() * theScale);
        theImage = SubstanceCoreUtilities.getBlankImage(previewWidth, previewHeight);

        Graphics2D g = theImage.createGraphics();
        previewPainter.previewComponent(null, theComponent, 0, g, 0, 0, theImage.getWidth(),
                theImage.getHeight());
        g.dispose();

        theStartRectangle = theComponent.getVisibleRect();
        Insets insets = getInsets();
        theStartRectangle.x = (int) (theScale * theStartRectangle.x + insets.left);
        theStartRectangle.y = (int) (theScale * theStartRectangle.y + insets.right);
        theStartRectangle.width *= theScale;
        theStartRectangle.height *= theScale;
        theRectangle = theStartRectangle;

        Dimension pref = thePopupMenu.getPreferredSize();
        Point buttonLocation = theButton.getLocationOnScreen();
        Point popupLocation = new Point((theButton.getWidth() - pref.width) / 2,
                (theButton.getHeight() - pref.height) / 2);
        Point centerPoint = new Point(
                buttonLocation.x + popupLocation.x + theRectangle.x + theRectangle.width / 2,
                buttonLocation.y + popupLocation.y + theRectangle.y + theRectangle.height / 2);
        try {
            // Attempt to move the mouse pointer to the center of the selector's
            // rectangle.
            new Robot().mouseMove(centerPoint.x, centerPoint.y);
            theStartPoint = centerPoint;
        } catch (Exception e) {
            // Since we cannot move the cursor, we'll move the popup instead.
            theStartPoint = aPointOnScreen;
            popupLocation.x += theStartPoint.x - centerPoint.x;
            popupLocation.y += theStartPoint.y - centerPoint.y;
        }
        thePrevPoint = new Point(theStartPoint);
        toRestoreOriginal = true;
        thePopupMenu.show(theButton, popupLocation.x, popupLocation.y);
    }

    private void syncRectangle() {
        JViewport viewport = this.theScrollPane.getViewport();
        Rectangle viewRect = viewport.getViewRect();

        Insets insets = getInsets();
        Rectangle newRect = new Rectangle();
        newRect.x = (int) (theScale * viewRect.x + insets.left);
        newRect.y = (int) (theScale * viewRect.y + insets.top);
        newRect.width = (int) (viewRect.width * theScale);
        newRect.height = (int) (viewRect.height * theScale);

        Rectangle clip = new Rectangle();
        Rectangle.union(theRectangle, newRect, clip);
        clip.grow(2, 2);
        theRectangle = newRect;

        paintImmediately(clip);
    }

    private void scroll(final int aDeltaX, final int aDeltaY, boolean toAnimate) {
        if (theComponent == null)
            return;
        final Rectangle oldRectangle = theComponent.getVisibleRect();
        final Rectangle newRectangle = new Rectangle(oldRectangle.x + aDeltaX,
                oldRectangle.y + aDeltaY, oldRectangle.width, oldRectangle.height);

        // Animate scrolling
        if (toAnimate) {
            Timeline scrollTimeline = new Timeline(theComponent);
            AnimationConfigurationManager.getInstance().configureTimeline(scrollTimeline);
            scrollTimeline.addCallback(new UIThreadTimelineCallbackAdapter() {
                @Override
                public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                        float durationFraction, float timelinePosition) {
                    if ((oldState == TimelineState.DONE) && (newState == TimelineState.IDLE)) {
                        theComponent.scrollRectToVisible(newRectangle);
                        syncRectangle();
                    }
                }

                @Override
                public void onTimelinePulse(float durationFraction, float timelinePosition) {
                    int x = (int) (oldRectangle.x + timelinePosition * aDeltaX);
                    int y = (int) (oldRectangle.y + timelinePosition * aDeltaY);
                    theComponent.scrollRectToVisible(
                            new Rectangle(x, y, oldRectangle.width, oldRectangle.height));
                    syncRectangle();
                }
            });
            scrollTimeline.play();
        } else {
            theComponent.scrollRectToVisible(newRectangle);
            syncRectangle();
        }
    }
}