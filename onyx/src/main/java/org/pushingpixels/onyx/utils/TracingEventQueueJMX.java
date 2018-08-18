package org.pushingpixels.onyx.utils;

import java.awt.AWTEvent;
import java.awt.EventQueue;

public final class TracingEventQueueJMX extends EventQueue {

	private TracingEventQueueThreadJMX tracingThread;

	public TracingEventQueueJMX() {
		this.tracingThread = new TracingEventQueueThreadJMX(500);
		this.tracingThread.start();
	}

	@Override
	protected void dispatchEvent(AWTEvent event) {
		this.tracingThread.eventDispatched(event);
		super.dispatchEvent(event);
		this.tracingThread.eventProcessed(event);
	}
}
