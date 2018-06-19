## Substance look and feel - known issues

Both issues documented here have been reported to Sun all the way back in 2004. Fixing them in Substance would involve copying very substantial amount of code from either Metal or Basic LAF delegates, introducing code bloating, as well as forking and inheriting unfixed bugs.

Note that a number of other existing Swing bugs have been either fixed or circumvented in Substance.

The known issues are:

* Due to a bug in core Swing delegates, the scroller buttons on wrapped tabbed panels in right-to-left applications are not visible.

* Due to a bug in core Swing delegates, the tab overview button in wrapped tabbed panes will be shown on top of the scrolled tabs (the bug itself is in UI delegate not respecting the tab area insets setting).
