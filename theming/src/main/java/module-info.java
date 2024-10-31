module org.pushingpixels.radiance.theming {
	exports org.pushingpixels.radiance.theming.api;
	exports org.pushingpixels.radiance.theming.api.colorscheme;
	exports org.pushingpixels.radiance.theming.api.combo;
	exports org.pushingpixels.radiance.theming.api.icon;
	exports org.pushingpixels.radiance.theming.api.inputmap;
	exports org.pushingpixels.radiance.theming.api.painter;
	exports org.pushingpixels.radiance.theming.api.painter.border;
	exports org.pushingpixels.radiance.theming.api.painter.decoration;
	exports org.pushingpixels.radiance.theming.api.painter.fill;
	exports org.pushingpixels.radiance.theming.api.painter.overlay;
	exports org.pushingpixels.radiance.theming.api.painter.preview;
	exports org.pushingpixels.radiance.theming.api.password;
	exports org.pushingpixels.radiance.theming.api.renderer;
	exports org.pushingpixels.radiance.theming.api.shaper;
	exports org.pushingpixels.radiance.theming.api.skin;
	exports org.pushingpixels.radiance.theming.api.tabbed;
	exports org.pushingpixels.radiance.theming.api.text;
	exports org.pushingpixels.radiance.theming.api.titlepane;
	exports org.pushingpixels.radiance.theming.api.trait;

	exports org.pushingpixels.radiance.theming.internal
			to org.pushingpixels.radiance.component, org.pushingpixels.radiance.theming.extras;
	exports org.pushingpixels.radiance.theming.internal.animation to org.pushingpixels.radiance.component;
	exports org.pushingpixels.radiance.theming.internal.blade
			to org.pushingpixels.radiance.component, org.pushingpixels.radiance.theming.extras;
	exports org.pushingpixels.radiance.theming.internal.utils.combo to org.pushingpixels.radiance.component;
	exports org.pushingpixels.radiance.theming.internal.painter to org.pushingpixels.radiance.component;
	exports org.pushingpixels.radiance.theming.internal.ui
			to org.pushingpixels.radiance.component, org.pushingpixels.radiance.theming.extras;
	exports org.pushingpixels.radiance.theming.internal.utils
			to org.pushingpixels.radiance.component, org.pushingpixels.radiance.theming.extras;
	exports org.pushingpixels.radiance.theming.internal.utils.border
			to org.pushingpixels.radiance.component, org.pushingpixels.radiance.theming.extras;
	exports org.pushingpixels.radiance.theming.internal.utils.icon to org.pushingpixels.radiance.component;
	exports org.pushingpixels.radiance.theming.internal.widget.animation.effects
			to org.pushingpixels.radiance.component;

	requires java.datatransfer;
	requires java.desktop;
	requires org.pushingpixels.radiance.animation;
	requires org.pushingpixels.radiance.common;
}