package org.pushingpixels.onyx.utils;

import java.awt.AWTEvent;
import java.lang.management.*;
import java.util.*;

import javax.management.MBeanServer;
import javax.management.ObjectName;

class TracingEventQueueThreadJMX extends Thread {
	private long thresholdDelay;

	private Map<AWTEvent, Long> eventTimeMap;

	private ThreadMXBean threadBean;

	public TracingEventQueueThreadJMX(long thresholdDelay) {
		this.thresholdDelay = thresholdDelay;
		this.eventTimeMap = new HashMap<AWTEvent, Long>();

		try {
			MBeanServer mbeanServer = ManagementFactory
					.getPlatformMBeanServer();
			ObjectName objName = new ObjectName(
					ManagementFactory.THREAD_MXBEAN_NAME);
			Set<ObjectName> mbeans = mbeanServer.queryNames(objName, null);
			for (ObjectName name : mbeans) {
				this.threadBean = ManagementFactory.newPlatformMXBeanProxy(
						mbeanServer, name.toString(), ThreadMXBean.class);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void eventDispatched(AWTEvent event) {
		this.eventTimeMap.put(event, System.currentTimeMillis());
	}

	public synchronized void eventProcessed(AWTEvent event) {
		this.checkEventTime(event, System.currentTimeMillis(),
				this.eventTimeMap.get(event));
		this.eventTimeMap.put(event, null);
	}

	private void checkEventTime(AWTEvent event, long currTime, long startTime) {
		long currProcessingTime = currTime - startTime;
		if (currProcessingTime >= this.thresholdDelay) {
			System.out.println("Event [" + event.hashCode() + "] "
					+ event.getClass().getName()
					+ " is taking too much time on EDT (" + currProcessingTime
					+ ")");

			if (this.threadBean != null) {
				long threadIds[] = threadBean.getAllThreadIds();
				for (long threadId : threadIds) {
					ThreadInfo threadInfo = threadBean.getThreadInfo(threadId,
							Integer.MAX_VALUE);
					if (threadInfo.getThreadName().startsWith("AWT-EventQueue")) {
						System.out.println(threadInfo.getThreadName() + " / "
								+ threadInfo.getThreadState());
						StackTraceElement[] stack = threadInfo.getStackTrace();
						for (StackTraceElement stackEntry : stack) {
							System.out.println("\t" + stackEntry.getClassName()
									+ "." + stackEntry.getMethodName() + " ["
									+ stackEntry.getLineNumber() + "]");
						}
					}
				}

				long[] deadlockedThreads = threadBean.findDeadlockedThreads();
				if ((deadlockedThreads != null)
						&& (deadlockedThreads.length > 0)) {
					System.out.println("Deadlocked threads:");
					for (long threadId : deadlockedThreads) {
						ThreadInfo threadInfo = threadBean.getThreadInfo(
								threadId, Integer.MAX_VALUE);
						System.out.println(threadInfo.getThreadName() + " / "
								+ threadInfo.getThreadState());
						StackTraceElement[] stack = threadInfo.getStackTrace();
						for (StackTraceElement stackEntry : stack) {
							System.out.println("\t" + stackEntry.getClassName()
									+ "." + stackEntry.getMethodName() + " ["
									+ stackEntry.getLineNumber() + "]");
						}
					}
				}
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			long currTime = System.currentTimeMillis();
			synchronized (this) {
				for (Map.Entry<AWTEvent, Long> entry : this.eventTimeMap
						.entrySet()) {
					AWTEvent event = entry.getKey();
					if (entry.getValue() == null)
						continue;
					long startTime = entry.getValue();
					this.checkEventTime(event, currTime, startTime);
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
			}
		}
	}
}