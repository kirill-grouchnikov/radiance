/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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
package org.pushingpixels.substance.internal.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Lazily initialized hash map for caching images. 
 * 
 * @author Kirill Grouchnikov
 * @param <T>
 *            Class for the stored values.
 */
public class LazyResettableHashMap<T> {
	/**
	 * List of all existing maps.
	 */
	private static List<LazyResettableHashMap<?>> all;

	/**
	 * The delegate cache.
	 */
	private Map<HashMapKey, T> cache;

	/**
	 * Display name of this hash map. Is used for tracking the statistics.
	 */
	private String displayName;

	/**
	 * Creates a new hash map.
	 * 
	 * @param displayName
	 *            Display name of the new hash map.
	 */
	public LazyResettableHashMap(String displayName) {
		this.displayName = displayName;
		if (all == null) {
			all = new LinkedList<LazyResettableHashMap<?>>();
		}
		all.add(this);
	}

	/**
	 * Creates the delegate cache if necessary.
	 */
	private void createIfNecessary() {
		if (this.cache == null)
			this.cache = new SoftHashMap<HashMapKey, T>();
	}

	/**
	 * Puts a new key-value pair in the map.
	 * 
	 * @param key
	 *            Pair key.
	 * @param entry
	 *            Pair value.
	 */
	public synchronized void put(HashMapKey key, T entry) {
		this.createIfNecessary();
		this.cache.put(key, entry);
	}

	/**
	 * Returns the value registered for the specified key.
	 * 
	 * @param key
	 *            Key.
	 * @return Registered value or <code>null</code> if none.
	 */
	public synchronized T get(HashMapKey key) {
		if (this.cache == null)
			return null;
		return this.cache.get(key);
	}

	/**
	 * Checks whether there is a value associated with the specified key.
	 * 
	 * @param key
	 *            Key.
	 * @return <code>true</code> if there is an associated value,
	 *         <code>false</code> otherwise.
	 */
	public boolean containsKey(HashMapKey key) {
		if (this.cache == null)
			return false;
		return this.cache.containsKey(key);
	}

	/**
	 * Returns the number of key-value pairs of this hash map.
	 * 
	 * @return The number of key-value pairs of this hash map.
	 */
	public int size() {
		if (this.cache == null)
			return 0;
		return this.cache.size();
	}

	/**
	 * Resets all existing hash maps.
	 */
	public static void reset() {
		if (all != null) {
			for (LazyResettableHashMap<?> map : all) {
				if (map.cache != null)
					map.cache.clear();
			}
		}
	}

	/**
	 * Returns statistical information of the existing hash maps.
	 * 
	 * @return Statistical information of the existing hash maps.
	 */
	public static List<String> getStats() {
		if (all != null) {
			List<String> result = new LinkedList<String>();

			Map<String, Integer> mapCounter = new TreeMap<String, Integer>();
			Map<String, Integer> entryCounter = new TreeMap<String, Integer>();

			for (LazyResettableHashMap<?> map : all) {
				String key = map.displayName;
				if (!mapCounter.containsKey(key)) {
					mapCounter.put(key, 0);
					entryCounter.put(key, 0);
				}
				mapCounter.put(key, mapCounter.get(key) + 1);
				entryCounter.put(key, entryCounter.get(key) + map.size());
			}

			for (Map.Entry<String, Integer> entry : mapCounter.entrySet()) {
				String key = entry.getKey();
				result.add(entry.getValue() + " " + key + " with "
						+ entryCounter.get(key) + " entries total");
			}

			return result;
		}
		return null;
	}
}
