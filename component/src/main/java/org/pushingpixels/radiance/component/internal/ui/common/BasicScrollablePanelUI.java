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
package org.pushingpixels.radiance.component.internal.ui.common;

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.JScrollablePanel;
import org.pushingpixels.radiance.component.api.common.JScrollablePanel.ScrollType;
import org.pushingpixels.radiance.component.api.common.icon.CommandButtonFollowColorSchemeIcon;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.blade.BladeArrowIconUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseWheelListener;
import java.beans.PropertyChangeListener;
import java.util.EnumSet;

/**
 * Basic UI for scrollable panel {@link JScrollablePanel}.
 *
 * @author Kirill Grouchnikov
 */
public abstract class BasicScrollablePanelUI extends ScrollablePanelUI {
    /**
     * The associated scrollable panel.
     */
    protected JScrollablePanel scrollablePanel;

    private JPanel viewport;

    private Command leadingScrollCommand;

    private Command trailingScrollCommand;

    private JCommandButton leadingScroller;

    private JCommandButton trailingScroller;

    private int viewOffset;

    private MouseWheelListener mouseWheelListener;

    private PropertyChangeListener propertyChangeListener;

    private ComponentListener componentListener;

    @Override
    public void installUI(JComponent c) {
        this.scrollablePanel = (JScrollablePanel) c;
        super.installUI(this.scrollablePanel);
        installDefaults();
        installComponents();
        installListeners();
    }

    protected void installListeners() {
        this.mouseWheelListener = mouseWheelEvent -> {
            if (scrollablePanel.getScrollType() != JScrollablePanel.ScrollType.VERTICALLY) {
                return;
            }

            int scrollAmount = 8 * mouseWheelEvent.getScrollAmount() * mouseWheelEvent.getWheelRotation();
            viewOffset += scrollAmount;
            syncScrolling();
        };
        this.scrollablePanel.addMouseWheelListener(this.mouseWheelListener);

        this.propertyChangeListener = propertyChangeEvent -> {
            if ("scrollOnRollover".equals(propertyChangeEvent.getPropertyName())) {
                boolean isScrollOnRollover = (Boolean) propertyChangeEvent.getNewValue();
                leadingScroller.setFireActionOnRollover(isScrollOnRollover);
                trailingScroller.setFireActionOnRollover(isScrollOnRollover);
            }
        };
        this.scrollablePanel.addPropertyChangeListener(this.propertyChangeListener);

        if (this.scrollablePanel.getView() != null) {
            this.componentListener = new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    scrollablePanel.doLayout();
                }
            };
            this.scrollablePanel.getView().addComponentListener(this.componentListener);
        }
    }

    protected void installComponents() {
        this.viewport = new JPanel(new LayoutManager() {
            @Override
            public void addLayoutComponent(String name, Component comp) {
            }

            @Override
            public void removeLayoutComponent(Component comp) {
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                return new Dimension(10, 10);
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return preferredLayoutSize(parent);
            }

            @Override
            public void layoutContainer(Container parent) {
                JComponent view = scrollablePanel.getView();
                if (scrollablePanel.getScrollType() == ScrollType.HORIZONTALLY) {
                    int viewWidth = view.getPreferredSize().width;
                    int availWidth = parent.getWidth();

                    int offsetX = -viewOffset;
                    view.setBounds(offsetX, 0, Math.max(viewWidth, availWidth), parent.getHeight());
                } else {
                    int viewHeight = view.getPreferredSize().height;
                    int availHeight = parent.getHeight();

                    int offsetY = -viewOffset;
                    view.setBounds(0, offsetY, parent.getWidth(),
                            Math.max(viewHeight, availHeight));
                }
            }
        });
        JComponent view = scrollablePanel.getView();
        if (view != null) {
            this.viewport.add(view);
        }
        this.scrollablePanel.add(this.viewport);

        final int fontSize = RadianceSizeUtils.getComponentFontSize(null);
        int arrowIconWidth = (int) RadianceSizeUtils.getSmallArrowIconWidth(fontSize);
        int arrowIconHeight = (int) RadianceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);
        this.leadingScrollCommand = Command.builder()
                .setAction(commandActionEvent -> {
                    viewOffset -= 12;
                    syncScrolling();
                })
                .setIconFactory(() -> new CommandButtonFollowColorSchemeIcon(
                        (g, scheme, width, height) -> {
                            BladeArrowIconUtils.drawDoubleArrow(g, width, height,
                                    RadianceSizeUtils.getSmallDoubleArrowGap(fontSize),
                                    RadianceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                                    (scrollablePanel.getScrollType() == JScrollablePanel.ScrollType.HORIZONTALLY)
                                            ? SwingUtilities.WEST
                                            : SwingUtilities.NORTH,
                                    scheme);
                        }, new Dimension(arrowIconHeight, arrowIconWidth)))
                .build();

        this.trailingScrollCommand = Command.builder()
                .setAction(commandActionEvent -> {
                    viewOffset += 12;
                    syncScrolling();
                })
                .setIconFactory(() -> new CommandButtonFollowColorSchemeIcon(
                        (g, scheme, width, height) -> {
                            BladeArrowIconUtils.drawDoubleArrow(g, width, height,
                                    RadianceSizeUtils.getSmallDoubleArrowGap(fontSize),
                                    RadianceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                                    (scrollablePanel.getScrollType() == JScrollablePanel.ScrollType.HORIZONTALLY)
                                            ? SwingUtilities.EAST
                                            : SwingUtilities.SOUTH,
                                    scheme);
                        }, new Dimension(arrowIconHeight, arrowIconWidth)))
                .build();

        // Common scroller command presentation
        CommandButtonPresentationModel scrollerActionsPresentation = CommandButtonPresentationModel.builder()
                .setPresentationState(CommandButtonPresentationState.SMALL_FIT_TO_ICON)
                .setContentPadding(new Insets(2, 2, 2, 2))
                .setFocusable(false)
                .setToDismissPopupsOnActivation(false)
                .setHorizontalAlignment(SwingConstants.CENTER)
                .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)
                .setActionFireTrigger(this.scrollablePanel.isScrollOnRollover() ?
                        CommandButtonPresentationModel.ActionFireTrigger.ON_ROLLOVER :
                        CommandButtonPresentationModel.ActionFireTrigger.ON_PRESS_RELEASED)
                .setAutoRepeatAction(true)
                .setAutoRepeatActionIntervals(200, 50)
                .build();

        // Create command projections for scroller commands
        CommandButtonProjection<Command> leadingScrollerProjection =
                leadingScrollCommand.project(scrollerActionsPresentation.overlayWith(
                        CommandButtonPresentationModel.overlay().setSides(
                                RadianceThemingSlices.Sides.builder().setStraightSides(
                                                (scrollablePanel.getScrollType() == JScrollablePanel.ScrollType.HORIZONTALLY)
                                                        ? EnumSet.of(RadianceThemingSlices.Side.TRAILING)
                                                        : EnumSet.of(RadianceThemingSlices.Side.BOTTOM))
                                        .build()
                        )
                ));

        CommandButtonProjection<Command> trailingScrollerProjection =
                trailingScrollCommand.project(scrollerActionsPresentation.overlayWith(
                        CommandButtonPresentationModel.overlay().setSides(
                                RadianceThemingSlices.Sides.builder().setStraightSides(
                                                (scrollablePanel.getScrollType() == JScrollablePanel.ScrollType.HORIZONTALLY)
                                                        ? EnumSet.of(RadianceThemingSlices.Side.LEADING)
                                                        : EnumSet.of(RadianceThemingSlices.Side.TOP))
                                        .build()
                        )
                ));

        this.leadingScroller = leadingScrollerProjection.buildComponent();
        this.scrollablePanel.add(this.leadingScroller);

        this.trailingScroller = trailingScrollerProjection.buildComponent();
        this.scrollablePanel.add(this.trailingScroller);
    }

    protected void installDefaults() {
        this.scrollablePanel.setLayout(new ScrollablePanelLayout());
    }

    @Override
    public void uninstallUI(JComponent c) {
        uninstallListeners();
        uninstallComponents();
        uninstallDefaults();
        super.uninstallUI(this.scrollablePanel);
    }

    protected void uninstallDefaults() {
    }

    protected void uninstallComponents() {
        this.scrollablePanel.remove(this.viewport);
        this.scrollablePanel.remove(this.leadingScroller);
        this.scrollablePanel.remove(this.trailingScroller);
    }

    protected void uninstallListeners() {
        this.scrollablePanel.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;

        this.scrollablePanel.removeMouseWheelListener(this.mouseWheelListener);
        this.mouseWheelListener = null;

        if (this.scrollablePanel.getView() != null) {
            this.scrollablePanel.getView().removeComponentListener(this.componentListener);
            this.componentListener = null;
        }
    }

    private void syncScrolling() {
        this.scrollablePanel.doLayout();
    }

    @Override
    public void scrollToIfNecessary(int startPosition, int span) {
        if (this.scrollablePanel.getScrollType() == ScrollType.HORIZONTALLY) {
            if (this.scrollablePanel.getComponentOrientation().isLeftToRight()) {
                revealRightEdge(startPosition, span);
                revealLeftEdge(startPosition);
            } else {
                revealLeftEdge(startPosition);
                revealRightEdge(startPosition, span);
            }
        } else {
            revealBottomEdge(startPosition, span);
            revealTopEdge(startPosition);
        }
    }

    private void revealLeftEdge(int x) {
        if (x < viewOffset) {
            // left edge is not visible
            viewOffset = x - 5;
            syncScrolling();
        }
    }

    private void revealRightEdge(int x, int width) {
        if ((x + width) > (viewOffset + viewport.getWidth())) {
            // right edge is not visible
            viewOffset = x + width - viewport.getWidth() + 5;
            syncScrolling();
        }
    }

    private void revealTopEdge(int y) {
        if (y < viewOffset) {
            // top edge is not visible
            viewOffset = y - 5;
            syncScrolling();
        }
    }

    private void revealBottomEdge(int y, int height) {
        if ((y + height) > (viewOffset + viewport.getHeight())) {
            // bottom edge is not visible
            viewOffset = y + height - viewport.getHeight() + 5;
            syncScrolling();
        }
    }

    @Override
    public boolean isShowingScrollButtons() {
        return (this.leadingScroller.isVisible());
    }

    /**
     * Layout for the scrollable panel.
     *
     * @author Kirill Grouchnikov
     * @author Topologi
     */
    protected class ScrollablePanelLayout implements LayoutManager {
        /**
         * Creates new layout manager.
         */
        private ScrollablePanelLayout() {
        }

        @Override
        public void addLayoutComponent(String name, Component c) {
        }

        @Override
        public void removeLayoutComponent(Component c) {
        }

        @Override
        public Dimension preferredLayoutSize(Container c) {
            if (scrollablePanel.getScrollType() == ScrollType.HORIZONTALLY) {
                return new Dimension(c.getWidth(), 21);
            } else {
                return new Dimension(21, c.getHeight());
            }
        }

        @Override
        public Dimension minimumLayoutSize(Container c) {
            if (scrollablePanel.getScrollType() == ScrollType.HORIZONTALLY) {
                return new Dimension(10, 21);
            } else {
                return new Dimension(21, 10);
            }
        }

        @Override
        public void layoutContainer(Container c) {
            int width = c.getWidth();
            int height = c.getHeight();

            Insets ins = c.getInsets();

            JComponent view = scrollablePanel.getView();
            Dimension viewPrefSize = view.getPreferredSize();

            // System.out.println(width + "*" + height + " - "
            // + viewPrefSize.width + "*" + viewPrefSize.height);

            if (scrollablePanel.getScrollType() == ScrollType.HORIZONTALLY) {
                boolean shouldShowScrollerButtons = (viewPrefSize.width > width);

                leadingScroller.setVisible(shouldShowScrollerButtons);
                trailingScroller.setVisible(shouldShowScrollerButtons);

                int scrollPanelWidth = shouldShowScrollerButtons
                        ? width - ins.left - ins.right - leadingScroller.getPreferredSize().width
                        - trailingScroller.getPreferredSize().width - 4
                        : width - ins.left - ins.right;
                int x = ins.left;
                if (shouldShowScrollerButtons) {
                    int spw = leadingScroller.getPreferredSize().width;
                    leadingScroller.setBounds(x, ins.top, spw, height - ins.top - ins.bottom);
                    x += spw + 2;
                }
                viewport.setBounds(x, ins.top, scrollPanelWidth, height - ins.top - ins.bottom);

                int viewPreferredWidth = view.getPreferredSize().width;
                if (viewOffset < 0) {
                    viewOffset = 0;
                }
                if ((viewPreferredWidth > 0)
                        && (viewOffset + scrollPanelWidth > viewPreferredWidth)) {
                    viewOffset = Math.max(0, viewPreferredWidth - scrollPanelWidth);
                }
                viewport.doLayout();

                x += scrollPanelWidth + 2;
                if (shouldShowScrollerButtons) {
                    int spw = trailingScroller.getPreferredSize().width;
                    trailingScroller.setBounds(x, ins.top, spw, height - ins.top - ins.bottom);
                }
            } else {
                boolean shouldShowScrollerButtons = (viewPrefSize.height > height);

                leadingScroller.setVisible(shouldShowScrollerButtons);
                trailingScroller.setVisible(shouldShowScrollerButtons);

                int scrollPanelHeight = shouldShowScrollerButtons
                        ? height - ins.top - ins.bottom - leadingScroller.getPreferredSize().height
                        - trailingScroller.getPreferredSize().height - 4
                        : height - ins.top - ins.bottom;
                int y = ins.top;
                if (shouldShowScrollerButtons) {
                    int sph = leadingScroller.getPreferredSize().height;
                    leadingScroller.setBounds(ins.left, y, width - ins.left - ins.right, sph);
                    y += sph + 2;
                }
                viewport.setBounds(ins.left, y, width - ins.left - ins.right, scrollPanelHeight);

                int viewPreferredHeight = view.getPreferredSize().height;
                if (viewOffset < 0) {
                    viewOffset = 0;
                }
                if ((viewPreferredHeight > 0)
                        && (viewOffset + scrollPanelHeight > viewPreferredHeight)) {
                    viewOffset = Math.max(0, viewPreferredHeight - scrollPanelHeight);
                }
                viewport.doLayout();

                y += scrollPanelHeight + 2;
                if (shouldShowScrollerButtons) {
                    int sph = trailingScroller.getPreferredSize().height;
                    trailingScroller.setBounds(ins.left, y, width - ins.left - ins.right, sph);
                }
            }
            leadingScrollCommand.setActionEnabled(viewOffset > 0);
            trailingScrollCommand.setActionEnabled((scrollablePanel.getScrollType() == ScrollType.HORIZONTALLY)
                    ?  (viewOffset + viewport.getWidth()) < view.getWidth()
                    :  (viewOffset + viewport.getHeight()) < view.getHeight());
        }
    }

}
