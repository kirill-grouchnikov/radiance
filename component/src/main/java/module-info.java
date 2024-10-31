module org.pushingpixels.radiance.component {
	exports org.pushingpixels.radiance.component.api.bcb;
	exports org.pushingpixels.radiance.component.api.bcb.core;
	exports org.pushingpixels.radiance.component.api.common;
	exports org.pushingpixels.radiance.component.api.common.icon;
	exports org.pushingpixels.radiance.component.api.common.model;
	exports org.pushingpixels.radiance.component.api.common.model.panel;
	exports org.pushingpixels.radiance.component.api.common.popup.model;
	exports org.pushingpixels.radiance.component.api.common.popup;
	exports org.pushingpixels.radiance.component.api.common.projection;
	exports org.pushingpixels.radiance.component.api.layout;
	exports org.pushingpixels.radiance.component.api.ribbon;
	exports org.pushingpixels.radiance.component.api.ribbon.model;
	exports org.pushingpixels.radiance.component.api.ribbon.projection;
	exports org.pushingpixels.radiance.component.api.ribbon.resize;
	exports org.pushingpixels.radiance.component.api.ribbon.synapse;
	exports org.pushingpixels.radiance.component.api.ribbon.synapse.model;
	exports org.pushingpixels.radiance.component.api.ribbon.synapse.projection;

	requires java.desktop;
	requires org.pushingpixels.radiance.animation;
	requires org.pushingpixels.radiance.common;
	requires org.pushingpixels.radiance.theming;
}