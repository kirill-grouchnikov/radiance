/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.extras.internal.tabbed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.pushingpixels.substance.internal.utils.TrackableThread;

/**
 * Delta queue. Follows a standard approach from OS world for efficiently
 * keeping tracks of scheduled events.
 * 
 * @author Kirill Grouchnikov
 */
public class DeltaQueue {
	/**
	 * Base class for entries in a {@link DeltaQueue}.
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static abstract class Deltable {
		/**
		 * Delta in application specific units.
		 */
		protected int delta;

		/**
		 * Creates a new delta.
		 */
		public Deltable() {
			super();
		}

		/**
		 * Returns the current delta in application specific units.
		 * 
		 * @return The current delta in application specific units.
		 */
		public int getDelta() {
			return delta;
		}

		/**
		 * Sets the new value of delta in application specific units.
		 * 
		 * @param delta
		 *            New value of delta in application specific units.
		 */
		public void setDelta(int delta) {
			this.delta = delta;
		}

		/**
		 * Increments the delta value by the specified amount.
		 * 
		 * @param diff
		 *            Amount for incrementing the delta value.
		 */
		public void incrementDelta(int diff) {
			this.delta += diff;
		}

		/**
		 * Decrements the delta value by the specified amount.
		 * 
		 * @param diff
		 *            Amount for decrementing the delta value.
		 */
		public void decrementDelta(int diff) {
			this.delta -= diff;
		}
	}

	/**
	 * Interface for comparing two delta instances.
	 * 
	 * @author Kirill Grouchnikov.
	 */
	public interface DeltaMatcher {
		/**
		 * Returns <code>true</code> if the specified delta matches some
		 * criteria.
		 * 
		 * @param deltable
		 *            Delta.
		 * @return <code>true</code> if the specified delta matches some
		 *         criteria, <code>false</code> otherwise.
		 */
		boolean matches(Deltable deltable);
	}

	/**
	 * List of entries. Contains {@link Deltable}s.
	 */
	protected ArrayList<Deltable> queue;

	/**
	 * Constructs a new empty non-blocking synchronized delta queue.
	 */
	public DeltaQueue() {
		this.queue = new ArrayList<>();
	}

	/**
	 * Queues the specified deltable. The specified deltable is placed somewhere
	 * in the queue based on the initial value of its delta. Note that when this
	 * method returns, the value of a {@link Deltable#getDelta()} may have
	 * changed. Do not reuse or change the passed deltable after this method
	 * returns.
	 * 
	 * @param deltable
	 *            Deltable.
	 */
	public synchronized void queue(Deltable deltable) {
		// locate the correct position in a time-difference queue
		int currDiff = deltable.getDelta();
		for (int i = 0; i < this.queue.size(); i++) {
			Deltable currDeltable = this.queue.get(i);
			currDiff -= currDeltable.getDelta();
			if (currDiff > 0) {
				continue;
			}

			if (currDiff == 0) {
				// scan until the next diff is more than 0
				deltable.setDelta(0);
				for (int j = i + 1; j < this.queue.size(); j++) {
					Deltable nextDeltable = this.queue.get(j);
					if (nextDeltable.getDelta() > 0) {
						// put just before it
						this.queue.add(j, deltable);
						return;
					}
				}
				// if here - add at the end
				this.queue.add(this.queue.size(), deltable);
				return;
			}

			deltable.setDelta(currDiff + currDeltable.getDelta());
			currDeltable.decrementDelta(deltable.getDelta());
			this.queue.add(i, deltable);
			return;
		}

		// put last
		deltable.setDelta(currDiff);
		this.queue.add(this.queue.size(), deltable);
	}

	/**
	 * Returns all deltables that have at most specified delay left. The
	 * returned list may be empty.
	 * 
	 * @param delay
	 *            Delay.
	 * @return The possibly empty list of all deltables that have at most
	 *         specified delay left.
	 */
	public synchronized List<Deltable> dequeue(int delay) {
		List<Deltable> result = new LinkedList<>();
		while (this.queue.size() > 0) {
			Deltable next = this.queue.get(0);
			int timeToExpire = next.getDelta();
			next.decrementDelta(delay);
			if (next.getDelta() > 0) {
				break;
			}
			if (timeToExpire > 0)
				delay -= timeToExpire;
			result.add(next);
			this.queue.remove(0);
		}
		return result;
	}

	/**
	 * Removes all deltas matching the specified matcher.
	 * 
	 * @param matcher
	 *            Delta matcher.
	 */
	public synchronized void removeMatching(DeltaMatcher matcher) {
		// start from the end
		while (true) {
			int toRemoveInd = -1;
			Deltable toRemove = null;
			for (int i = this.queue.size() - 1; i >= 0; i--) {
				Deltable deltable = this.queue.get(i);
				if (!matcher.matches(deltable))
					continue;
				toRemoveInd = i;
				toRemove = deltable;
				break;
			}

			if (toRemoveInd >= 0) {
				if (toRemoveInd < (this.queue.size() - 1)) {
					Deltable next = this.queue.get(toRemoveInd + 1);
					next.incrementDelta(toRemove.getDelta());
				}
				this.queue.remove(toRemoveInd);
			} else {
				return;
			}
		}
	}

	/**
	 * Dumps the contents of the delta queue.
	 */
	public void dump() {
		System.out.println("Dump");
		for (int i = 0; i < this.queue.size(); i++) {
			System.out.println("\t" + this.queue.get(i));
		}
	}

	/**
	 * Test class.
	 * 
	 * @author Kirill Grouchnikov
	 */
	private static class DeltableTest extends Deltable {
		/**
		 * ID.
		 */
		private int id;

		/**
		 * Creates a test delta.
		 * 
		 * @param id
		 *            ID.
		 * @param delta
		 *            Delta.
		 */
		public DeltableTest(int id, int delta) {
			super();
			this.id = id;
			this.delta = delta;
		}

		public String toString() {
			return this.id + ":" + this.delta;
		}
	}

	/**
	 * For testing.
	 * 
	 * @param args
	 *            Ignored.
	 */
	public static void main(String[] args) {
		DeltaQueue dq = new DeltaQueue();
		DeltableTest tpi11 = new DeltableTest(11, 100);
		dq.queue(tpi11);
		dq.dump();

		DeltableTest tpi12 = new DeltableTest(12, 100);
		dq.queue(tpi12);
		dq.dump();

		DeltableTest tpi21 = new DeltableTest(21, 200);
		dq.queue(tpi21);
		dq.dump();

		DeltableTest tpi31 = new DeltableTest(31, 300);
		dq.queue(tpi31);
		dq.dump();

		DeltableTest tpi13 = new DeltableTest(13, 100);
		dq.queue(tpi13);
		dq.dump();

		DeltableTest tpi22 = new DeltableTest(22, 200);
		dq.queue(tpi22);
		dq.dump();

		DeltableTest tpi25 = new DeltableTest(25, 250);
		dq.queue(tpi25);
		dq.dump();

		DeltableTest tpi51 = new DeltableTest(51, 500);
		dq.queue(tpi51);
		dq.dump();

		DeltableTest tpi05 = new DeltableTest(5, 50);
		dq.queue(tpi05);
		dq.dump();

		List<Deltable> gr150 = dq.dequeue(100);
		System.out.println("Dump 150");
		for (int i = 0; i < gr150.size(); i++) {
			DeltableTest tpi = (DeltableTest) gr150.get(i);
			System.out.println("\t" + tpi);
		}
		dq.dump();

		dq.removeMatching(deltable -> ((DeltableTest) deltable).id < 30);
		dq.dump();

		TrackableThread.requestStopAllThreads();
	}
}
