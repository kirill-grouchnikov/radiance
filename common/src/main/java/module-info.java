module org.pushingpixels.radiance.common {
	exports org.pushingpixels.radiance.common.api;
	exports org.pushingpixels.radiance.common.api.filter;
	exports org.pushingpixels.radiance.common.api.font;
	exports org.pushingpixels.radiance.common.api.icon;
	exports org.pushingpixels.radiance.common.api.model;
	
	exports org.pushingpixels.radiance.common.internal.contrib.jgoodies.looks to org.pushingpixels.radiance.theming;

	requires java.desktop;
}