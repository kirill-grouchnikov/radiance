/*
 * Copyright 2005-2018 Kirill Grouchnikov, based on work by
 * Sun Microsystems, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.pushingpixels.substance.swingx;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicLookAndFeel;

import org.jdesktop.swingx.JXMonthView;
import org.jdesktop.swingx.border.IconBorder;
import org.jdesktop.swingx.calendar.DateSelectionModel;
import org.jdesktop.swingx.event.DateSelectionEvent;
import org.jdesktop.swingx.event.DateSelectionListener;
import org.jdesktop.swingx.plaf.basic.BasicMonthViewUI;
import org.jdesktop.swingx.plaf.basic.CalendarState;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.animation.StateTransitionMultiTracker;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.HighlightPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.SubstanceTextUtilities;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;
import org.pushingpixels.trident.Timeline.TimelineState;
import org.pushingpixels.trident.callback.UIThreadTimelineCallbackAdapter;

/**
 * Substance-consistent UI delegate for {@link JXMonthView}.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceMonthViewUI extends BasicMonthViewUI implements
		TransitionAwareUI {
	/**
	 * Listener for transition animations on rollovers.
	 */
	protected DayRolloverFadeListener substanceFadeRolloverListener;

	protected DateId rolloverDateId;

	/**
	 * Holds the list of currently selected days. Every entry is day:month:year
	 */
	protected Set<DateId> selectedDates;

	/**
	 * Listener for transition animations on day selections.
	 */
	protected DateSelectionListener substanceFadeSelectionListener;

	private StateTransitionMultiTracker<DateId> dayStateTransitionMultiTracker;

	private StateTransitionMultiTracker<MonthId> monthStateTransitionMultiTracker;

	static class DateId implements Comparable<DateId> {
		protected int day;

		protected int month;

		protected int year;

		public DateId(int day, int month, int year) {
			this.day = day;
			this.month = month;
			this.year = year;
		}

		@Override
		public int compareTo(DateId o) {
			if ((this.day == o.day) && (this.month == o.month)
					&& (this.year == o.year))
				return 0;
			return 1;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof DateId) {
				return this.compareTo((DateId) obj) == 0;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return (this.day ^ (this.day >>> 32))
					& (this.month ^ (this.month >>> 32))
					& (this.year ^ (this.year >>> 32));
		}

		@Override
		public String toString() {
			return "Day " + this.day + ", Month " + this.month + ", Year "
					+ this.year;
		}
	}

	static class MonthId implements Comparable<MonthId> {
		protected int month;

		protected int year;

		public MonthId(int month, int year) {
			this.month = month;
			this.year = year;
		}

		@Override
		public int compareTo(MonthId o) {
			if ((this.month == o.month) && (this.year == o.year))
				return 0;
			return 1;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof MonthId) {
				return this.compareTo((MonthId) obj) == 0;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return (this.month ^ (this.month >>> 32))
					& (this.year ^ (this.year >>> 32));
		}

		@Override
		public String toString() {
			return "Month " + this.month + ", Year " + this.year;
		}
	}

	public static ComponentUI createUI(JComponent comp) {
		SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
		return new SubstanceMonthViewUI();
	}

	/**
	 * Creates a new UI delegate.
	 */
	public SubstanceMonthViewUI() {
		super();

		this.dayStateTransitionMultiTracker = new StateTransitionMultiTracker<DateId>();
		this.monthStateTransitionMultiTracker = new StateTransitionMultiTracker<MonthId>();
		this.selectedDates = new HashSet<DateId>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jdesktop.swingx.plaf.basic.BasicMonthViewUI#installDefaults()
	 */
	@Override
	protected void installDefaults() {
		super.installDefaults();
		BasicLookAndFeel.installColors(this.monthView,
				"JXMonthView.background", "JXMonthView.foreground");

		Calendar cal = this.monthView.getCalendar();
		if (cal != null) {
			for (Date selected : this.getSelection()) {
				cal.setTime(selected);
				int day = cal.get(Calendar.DAY_OF_MONTH);
				int month = cal.get(Calendar.MONTH);
				int year = cal.get(Calendar.YEAR);
				this.selectedDates.add(new DateId(day, month, year));
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jdesktop.swingx.plaf.basic.BasicMonthViewUI#installDelegate()
	 */
	@Override
	protected void installDelegate() {
		super.installDelegate();
		this.monthDownImage = SubstanceImageCreator.getArrowIcon(this.monthView
				.getFont().getSize(), SwingConstants.WEST,
				SubstanceColorSchemeUtilities
						.getColorScheme(this.monthView,
								ColorSchemeAssociationKind.MARK,
								ComponentState.ENABLED));
		this.monthUpImage = SubstanceImageCreator.getArrowIcon(this.monthView
				.getFont().getSize(), SwingConstants.EAST,
				SubstanceColorSchemeUtilities
						.getColorScheme(this.monthView,
								ColorSchemeAssociationKind.MARK,
								ComponentState.ENABLED));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jdesktop.swingx.plaf.basic.BasicMonthViewUI#installListeners()
	 */
	@Override
	protected void installListeners() {
		super.installListeners();

		this.substanceFadeRolloverListener = new DayRolloverFadeListener();
		this.monthView.addMouseMotionListener(substanceFadeRolloverListener);
		this.monthView.addMouseListener(substanceFadeRolloverListener);

		// Add listener for the selection animation
		substanceFadeSelectionListener = new DateSelectionListener() {
			public void valueChanged(DateSelectionEvent ev) {
				// System.out.println("Has "
				// + monthView.getSelectionModel().getSelection().size());

				// try {
				boolean hasSelectionAnimations = !WidgetUtilities
						.hasNoAnimations(monthView, AnimationFacet.SELECTION);

				Calendar cal = monthView.getCalendar();

				DateSelectionModel selectionModel = monthView
						.getSelectionModel();

				for (Iterator<DateId> selIt = selectedDates.iterator(); selIt
						.hasNext();) {
					DateId currSelected = selIt.next();
					// still selected?
					cal.set(Calendar.DAY_OF_MONTH, currSelected.day);
					cal.set(Calendar.MONTH, currSelected.month);
					cal.set(Calendar.YEAR, currSelected.year);
					if (selectionModel.isSelected(cal.getTime()))
						continue;

					if (hasSelectionAnimations) {
						StateTransitionTracker tracker = getDayTracker(
								currSelected, getDayState(currSelected.day,
										currSelected.month, currSelected.year)
										.isFacetActive(
												ComponentStateFacet.ROLLOVER),
								true);
						tracker.getModel().setSelected(false);
					}
					selIt.remove();
				}

				for (Date newlySelected : selectionModel.getSelection()) {
					cal.setTime(newlySelected);
					DateId newlySelectedDate = new DateId(cal
							.get(Calendar.DAY_OF_MONTH), cal
							.get(Calendar.MONTH), cal.get(Calendar.YEAR));
					if (selectedDates.contains(newlySelectedDate))
						continue;

					if (hasSelectionAnimations) {
						StateTransitionTracker tracker = getDayTracker(
								newlySelectedDate, getDayState(
										newlySelectedDate.day,
										newlySelectedDate.month,
										newlySelectedDate.year).isFacetActive(
										ComponentStateFacet.ROLLOVER), false);
						tracker.getModel().setSelected(true);
					}
					selectedDates.add(newlySelectedDate);
				}
			}
		};
		this.monthView.getSelectionModel().addDateSelectionListener(
				this.substanceFadeSelectionListener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jdesktop.swingx.plaf.basic.BasicMonthViewUI#uninstallListeners()
	 */
	@Override
	protected void uninstallListeners() {
		this.monthView.getSelectionModel().removeDateSelectionListener(
				this.substanceFadeSelectionListener);
		this.substanceFadeSelectionListener = null;

		this.monthView.removeMouseListener(this.substanceFadeRolloverListener);
		this.monthView
				.removeMouseMotionListener(this.substanceFadeRolloverListener);
		this.substanceFadeRolloverListener = null;

		super.uninstallListeners();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jdesktop.swingx.plaf.basic.BasicMonthViewUI#uninstallDefaults()
	 */
	@Override
	protected void uninstallDefaults() {
		this.selectedDates.clear();

		super.uninstallDefaults();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jvnet.substance.utils.Trackable#isInside(java.awt.event.MouseEvent)
	 */
	public boolean isInside(MouseEvent me) {
		// The entire component area is considered as trackable for rollover
		// effects.
		return true;
	}

	@Override
	public StateTransitionTracker getTransitionTracker() {
		return null;
	}

	/**
	 * Listener for fade animations on month view rollovers.
	 * 
	 * @author Kirill Grouchnikov
	 */
	private class DayRolloverFadeListener implements MouseListener,
			MouseMotionListener {
		public void mouseClicked(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
			this.fadeOutDay();
			this.fadeOutMonth();
			// System.out.println("Nulling RO index");
			resetRolloverIndex();
		}

		public void mouseMoved(MouseEvent e) {
			if (!monthView.isEnabled())
				return;
			this.handleMove(e);
		}

		public void mouseDragged(MouseEvent e) {
			// if (SubstanceCoreUtilities.toBleedWatermark(list))
			// return;

			if (!monthView.isEnabled())
				return;
			this.handleMove(e);
		}

		/**
		 * Handles various mouse move events and initiates the fade animation if
		 * necessary.
		 * 
		 * @param e
		 *            Mouse event.
		 */
		private void handleMove(MouseEvent e) {
			boolean fadeAllowed = AnimationConfigurationManager.getInstance()
					.isAnimationAllowed(AnimationFacet.ROLLOVER, monthView);
			if (!fadeAllowed) {
				this.fadeOutDay();
				this.fadeOutMonth();
				resetRolloverIndex();
				return;
			}

			Date matchingDay = monthView.getDayAtLocation(e.getX(), e.getY());
			if (matchingDay == null) {
				this.fadeOutDay();
				this.fadeOutMonth();
				// System.out.println("Nulling RO index");
				resetRolloverIndex();
			} else {
				// special case - check the month bounds of the matching day
				Rectangle monthBounds = getMonthBounds(matchingDay);
				if ((monthBounds == null)
						|| !monthBounds.contains(e.getPoint())) {
					// either trailing or leading day
					this.fadeOutDay();
					this.fadeOutMonth();
					resetRolloverIndex();
				} else {
					Calendar cal = monthView.getCalendar();
					cal.setTime(matchingDay);
					int roIndexDay = cal.get(Calendar.DAY_OF_MONTH);
					int roIndexMonth = cal.get(Calendar.MONTH);
					int roIndexYear = cal.get(Calendar.YEAR);

					DateId dateId = new DateId(roIndexDay, roIndexMonth,
							roIndexYear);
					// check if this is the same index
					if (dateId.equals(rolloverDateId))
						return;

					this.fadeOutDay();
					boolean isDifferentMonth = (rolloverDateId == null)
							|| (rolloverDateId.month != roIndexMonth)
							|| (rolloverDateId.year != roIndexYear);
					if (isDifferentMonth) {
						this.fadeOutMonth();
					}

					rolloverDateId = dateId;

					StateTransitionTracker dayTracker = getDayTracker(dateId,
							false, getDayState(roIndexDay, roIndexMonth,
									roIndexYear).isFacetActive(
									ComponentStateFacet.SELECTION));
					dayTracker.getModel().setRollover(true);

					if (isDifferentMonth) {
						StateTransitionTracker monthTracker = getMonthTracker(
								new MonthId(roIndexMonth, roIndexYear), false,
								getMonthState(roIndexMonth, roIndexYear)
										.isFacetActive(
												ComponentStateFacet.SELECTION));
						monthTracker.getModel().setRollover(true);
						// System.out.println("Fading in " + rolloverMonthId +
						// ":"
						// + rolloverYearId);
					}
					// System.out.println("Setting RO index to " + roIndex);
				}
			}
		}

		/**
		 * Initiates the fade out effect on the specific day.
		 */
		private void fadeOutDay() {
			if (rolloverDateId == null)
				return;

			StateTransitionTracker tracker = getDayTracker(rolloverDateId,
					true, getDayState(rolloverDateId.day, rolloverDateId.month,
							rolloverDateId.year).isFacetActive(
							ComponentStateFacet.SELECTION));
			tracker.getModel().setRollover(false);
		}

		/**
		 * Initiates the fade out effect on the specific month.
		 */
		private void fadeOutMonth() {
			if (rolloverDateId == null)
				return;

			StateTransitionTracker tracker = getMonthTracker(new MonthId(
					rolloverDateId.month, rolloverDateId.year), true,
					getMonthState(rolloverDateId.month, rolloverDateId.year)
							.isFacetActive(ComponentStateFacet.SELECTION));
			tracker.getModel().setRollover(false);
		}
	}

	/**
	 * Repaints a single month during the fade animation cycle.
	 * 
	 * @author Kirill Grouchnikov
	 */
	protected class MonthRepaintCallback extends
			UIThreadTimelineCallbackAdapter {
		/**
		 * Associated control.
		 */
		protected JXMonthView monthView;

		/**
		 * Associated (animated) month index.
		 */
		protected int monthIndex;

		protected int yearIndex;

		/**
		 * Creates a new animation repaint callback.
		 * 
		 * @param monthView
		 *            Associated control.
		 * @param monthIndex
		 *            Associated (animated) month index.
		 */
		public MonthRepaintCallback(JXMonthView monthView, int monthIndex,
				int yearIndex) {
			this.monthView = monthView;
			this.monthIndex = monthIndex;
			this.yearIndex = yearIndex;
		}

		@Override
		public void onTimelinePulse(float durationFraction,
				float timelinePosition) {
			this.repaintCell();
		}

		@Override
		public void onTimelineStateChanged(TimelineState oldState,
				TimelineState newState, float durationFraction,
				float timelinePosition) {
			this.repaintCell();
		}

		/**
		 * Repaints the associated cell.
		 */
		private void repaintCell() {
			SwingUtilities.invokeLater(() -> {
				if (monthView != SubstanceMonthViewUI.this.monthView) {
					// may happen if the LAF was switched in the meantime
					return;
				}
				Calendar cal = monthView.getCalendar();
				cal.set(Calendar.MONTH, monthIndex);
				cal.set(Calendar.YEAR, yearIndex);
				Rectangle monthBounds = getMonthBounds(cal.getTime());
				// Rectangle monthTitleBounds = monthTitleBoundsMap
				// .get(monthIndex + ":" + yearIndex);
				if (monthBounds != null) {
					monthView.repaint(monthBounds);
				}
			});
		}
	}

	/**
	 * Repaints a single day during the fade animation cycle.
	 * 
	 * @author Kirill Grouchnikov
	 */
	protected class DayRepaintCallback extends UIThreadTimelineCallbackAdapter {
		/**
		 * Associated control.
		 */
		protected JXMonthView monthView;

		/**
		 * Associated (animated) day index.
		 */
		protected int dayIndex;

		protected int monthIndex;

		protected int yearIndex;

		/**
		 * Creates a new animation repaint callback.
		 * 
		 * @param monthView
		 *            Associated control.
		 * @param dayIndex
		 *            Associated (animated) day index.
		 */
		public DayRepaintCallback(JXMonthView monthView, int dayIndex,
				int monthIndex, int yearIndex) {
			this.monthView = monthView;
			this.dayIndex = dayIndex;
			this.monthIndex = monthIndex;
			this.yearIndex = yearIndex;
		}

		@Override
		public void onTimelinePulse(float durationFraction,
				float timelinePosition) {
			this.repaintCell();
		}

		@Override
		public void onTimelineStateChanged(TimelineState oldState,
				TimelineState newState, float durationFraction,
				float timelinePosition) {
			this.repaintCell();
		}

		/**
		 * Repaints the associated cell.
		 */
		private void repaintCell() {
			SwingUtilities.invokeLater(() -> {
				if (monthView != SubstanceMonthViewUI.this.monthView) {
					// may happen if the LAF was switched in the meantime
					return;
				}
				Calendar cal = monthView.getCalendar();
				cal.set(Calendar.DAY_OF_MONTH, dayIndex);
				cal.set(Calendar.MONTH, monthIndex);
				cal.set(Calendar.YEAR, yearIndex);

				Rectangle dayBounds = getDayBounds(cal.getTime());

				if (dayBounds != null) {
					DayRepaintCallback.this.monthView.repaint(dayBounds);
				}
			});
		}
	}

	private ComponentState getDayState(int dayIndex, int monthIndex,
			int yearIndex) {
		DateId dateId = new DateId(dayIndex, monthIndex, yearIndex);
		boolean isEnabled = this.monthView.isEnabled();
		StateTransitionTracker tracker = this.dayStateTransitionMultiTracker
				.getTracker(dateId);
		if (tracker == null) {
			boolean isRollover = dateId.equals(this.rolloverDateId);
			boolean isSelected = this.selectedDates.contains(dateId);
			return ComponentState.getState(isEnabled, isRollover, isSelected);
		} else {
			ComponentState fromTracker = tracker.getModelStateInfo()
					.getCurrModelState();
			return ComponentState.getState(isEnabled, fromTracker
					.isFacetActive(ComponentStateFacet.ROLLOVER), fromTracker
					.isFacetActive(ComponentStateFacet.SELECTION));
		}
	}

	private ComponentState getMonthState(int monthIndex, int yearIndex) {
		MonthId monthId = new MonthId(monthIndex, yearIndex);
		boolean isEnabled = this.monthView.isEnabled();
		StateTransitionTracker tracker = this.monthStateTransitionMultiTracker
				.getTracker(monthId);
		if (tracker == null) {
			boolean isRollover = (this.rolloverDateId != null)
					&& (this.rolloverDateId.month == monthIndex)
					&& (this.rolloverDateId.year == yearIndex);
			return ComponentState.getState(isEnabled, isRollover, false);
		} else {
			ComponentState fromTracker = tracker.getModelStateInfo()
					.getCurrModelState();
			return ComponentState.getState(isEnabled, fromTracker
					.isFacetActive(ComponentStateFacet.ROLLOVER), fromTracker
					.isFacetActive(ComponentStateFacet.SELECTION));
		}
	}

	/**
	 * Resets the rollover index.
	 */
	public void resetRolloverIndex() {
		this.rolloverDateId = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jdesktop.swingx.plaf.basic.BasicMonthViewUI#createRenderingHandler()
	 */
	@Override
	protected RenderingHandler createRenderingHandler() {
		// return null;
		return new SubstanceRenderingHandler();
	}

	@Override
	protected void paintMonthHeader(Graphics g, Calendar calendar) {
		Rectangle page = getMonthHeaderBounds(calendar.getTime(), false);
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);

		Graphics2D g2d = (Graphics2D) g.create();

		ComponentState componentState = monthView.isEnabled() ? ComponentState.ENABLED
				: ComponentState.DISABLED_UNSELECTED;
		float fillAlpha = SubstanceColorSchemeUtilities.getAlpha(monthView,
				componentState);
		g2d.setComposite(WidgetUtilities.getAlphaComposite(monthView,
				fillAlpha, g));
		SubstanceColorScheme bgFillScheme = SubstanceColorSchemeUtilities
				.getColorScheme(monthView,
						ColorSchemeAssociationKind.HIGHLIGHT, componentState);
		SubstanceColorScheme bgBorderScheme = SubstanceColorSchemeUtilities
				.getColorScheme(monthView,
						ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
						componentState);
		HighlightPainterUtils.paintHighlight(g2d, null, monthView, page, 0.5f,
				null, bgFillScheme, bgBorderScheme);
		g2d.setComposite(WidgetUtilities.getAlphaComposite(monthView, g));

		StateTransitionTracker monthTracker = this.monthStateTransitionMultiTracker
				.getTracker(new MonthId(month, year));
		StateTransitionTracker.ModelStateInfo modelStateInfo = (monthTracker == null) ? null
				: monthTracker.getModelStateInfo();
		Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = ((modelStateInfo == null) ? null
				: modelStateInfo.getStateContributionMap());
		ComponentState currState = ((modelStateInfo == null) ? getMonthState(
				month, year) : modelStateInfo.getCurrModelState());

		if (activeStates == null) {
			SubstanceColorScheme currFillScheme = SubstanceColorSchemeUtilities
					.getColorScheme(monthView,
							ColorSchemeAssociationKind.HIGHLIGHT, currState);
			SubstanceColorScheme currBorderScheme = SubstanceColorSchemeUtilities
					.getColorScheme(monthView,
							ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
							currState);
			g2d.setComposite(WidgetUtilities.getAlphaComposite(monthView,
					SubstanceColorSchemeUtilities.getHighlightAlpha(monthView,
							currState), g));
			HighlightPainterUtils.paintHighlight(g2d, null, monthView, page,
					0.5f, null, currFillScheme, currBorderScheme);
		} else {
			for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
					.entrySet()) {
				float contribution = activeEntry.getValue().getContribution();
				if (contribution == 0.0f)
					continue;
				ComponentState activeState = activeEntry.getKey();
				SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
						.getColorScheme(monthView,
								ColorSchemeAssociationKind.HIGHLIGHT,
								activeState);
				SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
						.getColorScheme(monthView,
								ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
								activeState);
				g2d.setComposite(WidgetUtilities.getAlphaComposite(
						monthView, SubstanceColorSchemeUtilities
								.getHighlightAlpha(monthView, activeState)
								* contribution, g));
				HighlightPainterUtils.paintHighlight(g2d, null, monthView,
						page, 0.5f, null, fillScheme, borderScheme);
			}
		}
		g2d.dispose();

		super.paintMonthHeader(g, calendar);
	}

	@Override
	protected void paintDayOfMonth(Graphics g, Rectangle bounds,
			Calendar calendar, CalendarState state) {
		if (state == CalendarState.IN_MONTH || state == CalendarState.TODAY) {
			// paint rollover / selection background
			Graphics2D graphics = (Graphics2D) g.create();

			int day = calendar.get(Calendar.DAY_OF_MONTH);
			int month = calendar.get(Calendar.MONTH);
			int year = calendar.get(Calendar.YEAR);

			if (isToday(calendar.getTime())) {
				graphics.setColor(monthView.getTodayBackground());
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);
				graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
						RenderingHints.VALUE_STROKE_PURE);
				graphics.setStroke(new BasicStroke(SubstanceSizeUtils.getBorderStrokeWidth(),
						BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
				graphics.draw(bounds);
			}

			StateTransitionTracker dayTracker = this.dayStateTransitionMultiTracker
					.getTracker(new DateId(day, month, year));
			StateTransitionTracker.ModelStateInfo modelStateInfo = (dayTracker == null) ? null
					: dayTracker.getModelStateInfo();
			Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = ((modelStateInfo == null) ? null
					: modelStateInfo.getStateContributionMap());
			ComponentState currState = ((modelStateInfo == null) ? getDayState(
					day, month, year) : modelStateInfo.getCurrModelState());

			if (activeStates == null) {
				SubstanceColorScheme currFillScheme = SubstanceColorSchemeUtilities
						.getColorScheme(monthView,
								ColorSchemeAssociationKind.HIGHLIGHT, currState);
				SubstanceColorScheme currBorderScheme = SubstanceColorSchemeUtilities
						.getColorScheme(monthView,
								ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
								currState);
				graphics.setComposite(WidgetUtilities.getAlphaComposite(
						monthView, SubstanceColorSchemeUtilities
								.getHighlightAlpha(monthView, currState), g));
				HighlightPainterUtils.paintHighlight(graphics, null, monthView,
						bounds, 0.5f, null, currFillScheme, currBorderScheme);
			} else {
				for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
						.entrySet()) {
					float contribution = activeEntry.getValue()
							.getContribution();
					if (contribution == 0.0f)
						continue;
					ComponentState activeState = activeEntry.getKey();
					SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
							.getColorScheme(monthView,
									ColorSchemeAssociationKind.HIGHLIGHT,
									activeState);
					SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
							.getColorScheme(
									monthView,
									ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
									activeState);
					graphics.setComposite(WidgetUtilities.getAlphaComposite(
							monthView, SubstanceColorSchemeUtilities
									.getHighlightAlpha(monthView, activeState)
									* contribution, g));
					HighlightPainterUtils.paintHighlight(graphics, null,
							monthView, bounds, 0.5f, null, fillScheme,
							borderScheme);
				}
			}

			graphics.dispose();

		}
		super.paintDayOfMonth(g, bounds, calendar, state);
	}
	
	@Override
	protected void paintWeekOfYearSeparator(Graphics g, Calendar month) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
				RenderingHints.VALUE_STROKE_PURE);
		g2d.setStroke(new BasicStroke(SubstanceSizeUtils.getBorderStrokeWidth(),
				BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
		super.paintWeekOfYearSeparator(g2d, month);
		g2d.dispose();
	}
	
	@Override
	protected void paintDaysOfWeekSeparator(Graphics g, Calendar month) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
				RenderingHints.VALUE_STROKE_PURE);
		g2d.setStroke(new BasicStroke(SubstanceSizeUtils.getBorderStrokeWidth(),
				BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
		super.paintDaysOfWeekSeparator(g2d, month);
		g2d.dispose();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.plaf.ComponentUI#update(java.awt.Graphics,
	 * javax.swing.JComponent)
	 */
	@Override
	public void update(Graphics g, JComponent c) {
		Graphics2D g2d = (Graphics2D) g.create();
		RenderingUtils.installDesktopHints(g2d, this.monthView);
		BackgroundPaintingUtils.update(g2d, this.monthView, false);
		this.paint(g2d, c);
		g2d.dispose();
	}
	
	private class SubstanceIconBorder extends IconBorder {
        public SubstanceIconBorder(Icon validIcon, int iconPosition, int padding) {
            super(validIcon, iconPosition, padding);
        }

        @Override
	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        Graphics2D g2d = (Graphics2D) g.create();
	        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
	        super.paintBorder(c, g2d, x, y, width, height);
	        g2d.dispose();
	    }
	}

	protected class SubstanceRenderingHandler extends RenderingHandler {
		@Override
		public JComponent prepareRenderingComponent(JXMonthView monthView,
				Calendar calendar, CalendarState dayState) {
			JComponent result = super.prepareRenderingComponent(monthView,
					calendar, dayState);

			// System.out.println(dayState + ":" + result.getForeground());

			int day = calendar.get(Calendar.DAY_OF_MONTH);
			int month = calendar.get(Calendar.MONTH);
			int year = calendar.get(Calendar.YEAR);
			if (dayState == CalendarState.IN_MONTH
					|| dayState == CalendarState.TODAY) {
				// fix for issue 4 (custom colors on the control)
				Color customFgColor = result.getForeground();
				boolean isForegroundUiResource = customFgColor instanceof UIResource;
				Color fgColor = customFgColor;
				if (isForegroundUiResource) {
					if (monthView.isEnabled()) {
						StateTransitionTracker dayTracker = dayStateTransitionMultiTracker
								.getTracker(new DateId(day, month, year));
						StateTransitionTracker.ModelStateInfo modelStateInfo = (dayTracker == null) ? null
								: dayTracker.getModelStateInfo();
						Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = ((modelStateInfo == null) ? null
								: modelStateInfo.getStateContributionMap());
						ComponentState currState = ((modelStateInfo == null) ? getDayState(
								day, month, year)
								: modelStateInfo.getCurrModelState());

						SubstanceColorScheme colorScheme = getColorSchemeForState(
								monthView, currState);
						if (currState.isDisabled() || (activeStates == null)
								|| (activeStates.size() == 1)) {
							fgColor = colorScheme.getForegroundColor();
						} else {
							float aggrRed = 0;
							float aggrGreen = 0;
							float aggrBlue = 0;

							for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : modelStateInfo
									.getStateContributionMap().entrySet()) {
								ComponentState activeState = activeEntry
										.getKey();
								SubstanceColorScheme scheme = getColorSchemeForState(
										monthView, activeState);
								Color schemeFg = scheme.getForegroundColor();
								float contribution = activeEntry.getValue()
										.getContribution();
								aggrRed += schemeFg.getRed() * contribution;
								aggrGreen += schemeFg.getGreen() * contribution;
								aggrBlue += schemeFg.getBlue() * contribution;
							}
							fgColor = new Color((int) aggrRed, (int) aggrGreen,
									(int) aggrBlue);
						}
					} else {
						float textAlpha = SubstanceColorSchemeUtilities
								.getAlpha(monthView,
										ComponentState.DISABLED_UNSELECTED);
						fgColor = SubstanceTextUtilities.getForegroundColor(
								monthView, " ",
								ComponentState.DISABLED_UNSELECTED, textAlpha);
					}
				}
				result.setForeground(fgColor);
			}

			if (dayState == CalendarState.TITLE) {
				// month title
				StateTransitionTracker monthTracker = monthStateTransitionMultiTracker
						.getTracker(new MonthId(month, year));
				StateTransitionTracker.ModelStateInfo modelStateInfo = (monthTracker == null) ? null
						: monthTracker.getModelStateInfo();
				Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = ((modelStateInfo == null) ? null
						: modelStateInfo.getStateContributionMap());
				ComponentState currState = ((modelStateInfo == null) ? getMonthState(
						month, year)
						: modelStateInfo.getCurrModelState());

				SubstanceColorScheme colorScheme = getColorSchemeForState(
						monthView, currState);
				Color fgColor = null;
				if (currState.isDisabled() || (activeStates == null)
						|| (activeStates.size() == 1)) {
					fgColor = colorScheme.getForegroundColor();
				} else {
					float aggrRed = 0;
					float aggrGreen = 0;
					float aggrBlue = 0;

					for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : modelStateInfo
							.getStateContributionMap().entrySet()) {
						ComponentState activeState = activeEntry.getKey();
						SubstanceColorScheme scheme = getColorSchemeForState(
								monthView, activeState);
						Color schemeFg = scheme.getForegroundColor();
						float contribution = activeEntry.getValue()
								.getContribution();
						aggrRed += schemeFg.getRed() * contribution;
						aggrGreen += schemeFg.getGreen() * contribution;
						aggrBlue += schemeFg.getBlue() * contribution;
					}
					fgColor = new Color((int) aggrRed, (int) aggrGreen,
							(int) aggrBlue);
				}

				result.setForeground(fgColor);
			}

			if (dayState == CalendarState.LEADING
					|| dayState == CalendarState.TRAILING) {
				float textAlpha = SubstanceColorSchemeUtilities.getAlpha(
						monthView, ComponentState.DISABLED_UNSELECTED);
				result.setForeground(SubstanceTextUtilities.getForegroundColor(
						monthView, " ", ComponentState.DISABLED_UNSELECTED,
						textAlpha));
			}

			if (dayState == CalendarState.TITLE) {
				result.setBorder(getTitleBorder());
			}

			result.setOpaque(false);

			return result;
		}

		private Border getTitleBorder() {
			if (monthView.isTraversable()) {
			    SubstanceIconBorder up = new SubstanceIconBorder(monthUpImage,
						SwingConstants.EAST, monthView.getBoxPaddingX());
				SubstanceIconBorder down = new SubstanceIconBorder(monthDownImage,
						SwingConstants.WEST, monthView.getBoxPaddingX());
				Border compound = BorderFactory.createCompoundBorder(up, down);
				Border empty = BorderFactory
						.createEmptyBorder(2 * monthView.getBoxPaddingY(), 0,
								2 * monthView.getBoxPaddingY(), 0);
				return BorderFactory.createCompoundBorder(compound, empty);
			}

			return BorderFactory.createEmptyBorder(monthView.getBoxPaddingY(),
					monthView.getBoxPaddingX(), monthView.getBoxPaddingY(),
					monthView.getBoxPaddingX());
		}
	}

	private static SubstanceColorScheme getColorSchemeForState(
			JXMonthView monthView, ComponentState state) {
		if (state == ComponentState.ENABLED)
			return SubstanceColorSchemeUtilities.getColorScheme(monthView,
					state);
		return SubstanceColorSchemeUtilities.getColorScheme(monthView,
				ColorSchemeAssociationKind.HIGHLIGHT, state);
	}

	private StateTransitionTracker getDayTracker(final DateId dateId,
			boolean initialRollover, boolean initialSelected) {
		StateTransitionTracker tracker = dayStateTransitionMultiTracker
				.getTracker(dateId);
		if (tracker == null) {
			ButtonModel model = new DefaultButtonModel();
			model.setSelected(initialSelected);
			model.setRollover(initialRollover);
			tracker = new StateTransitionTracker(this.monthView, model);
			tracker.registerModelListeners();
			tracker.setRepaintCallback(() -> new DayRepaintCallback(monthView, dateId.day,
							dateId.month, dateId.year));
			dayStateTransitionMultiTracker.addTracker(dateId, tracker);
		}
		return tracker;
	}

	private StateTransitionTracker getMonthTracker(final MonthId monthId,
			boolean initialRollover, boolean initialSelected) {
		StateTransitionTracker tracker = monthStateTransitionMultiTracker
				.getTracker(monthId);
		if (tracker == null) {
			ButtonModel model = new DefaultButtonModel();
			model.setSelected(initialSelected);
			model.setRollover(initialRollover);
			tracker = new StateTransitionTracker(this.monthView, model);
			tracker.registerModelListeners();
			tracker.setRepaintCallback(() -> new MonthRepaintCallback(monthView, monthId.month,
							monthId.year));
			monthStateTransitionMultiTracker.addTracker(monthId, tracker);
		}
		return tracker;
	}
}
