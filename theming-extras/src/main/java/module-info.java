module org.pushingpixels.radiance.theming.extras {
	exports org.pushingpixels.radiance.theming.extras.api;
	exports org.pushingpixels.radiance.theming.extras.api.colorschemepack;
	exports org.pushingpixels.radiance.theming.extras.api.painterpack.decoration;
	exports org.pushingpixels.radiance.theming.extras.api.shaperpack;
	exports org.pushingpixels.radiance.theming.extras.api.skinpack;
	exports org.pushingpixels.radiance.theming.extras.api.tabbed;

	requires java.desktop;
	requires org.pushingpixels.radiance.animation;
	requires org.pushingpixels.radiance.common;
	requires org.pushingpixels.radiance.theming;
}