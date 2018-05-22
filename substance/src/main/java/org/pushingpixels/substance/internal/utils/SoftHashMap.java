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

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * The original implementation is taken from <a
 * href="http://www.javaspecialists.co.za/archive/Issue098.html">The Java
 * Specialists' Newsletter [Issue 098]</a> with permission of the original
 * author. Tweaked code by Endre Stolsvik was <a href=
 * "https://substance.dev.java.net/servlets/ReadMsg?list=users&msgNo=1396"
 * >contributed</a> in December 2009.
 * 
 * @author Dr. Heinz M. Kabutz
 * @author Endre Stolsvik
 */
class SoftHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
	/** The internal HashMap that will hold the SoftReference. */
	private final Map<K, KeySoftReference<K, V>> hash = new HashMap<K, KeySoftReference<K, V>>();

	/** Reference queue for cleared SoftReference objects. */
	private final ReferenceQueue<V> queue = new ReferenceQueue<V>();

	public static class KeySoftReference<K, V> extends SoftReference<V> {
		final K key;

		public KeySoftReference(K key, V referent, ReferenceQueue<V> q) {
			super(referent, q);
			this.key = key;
		}
	}

	@Override
	public V get(Object key) {
		expungeStaleEntries();
		V result = null;
		// We get the SoftReference represented by that key
		KeySoftReference<K, V> soft_ref = hash.get(key);
		if (soft_ref != null) {
			// From the SoftReference we get the value, which can be
			// null if it has been garbage collected
			result = soft_ref.get();
			if (result == null) {
				// If the value has been garbage collected, remove the
				// entry from the HashMap.
				hash.remove(key);
			}
		}
		return result;
	}

	private void expungeStaleEntries() {
		Reference<? extends V> ref;
		while ((ref = queue.poll()) != null) {
			KeySoftReference keyRef = (KeySoftReference<K, V>) ref;
			hash.remove(keyRef.key);
		}
	}

	@Override
	public V put(K key, V value) {
		expungeStaleEntries();
		KeySoftReference<K, V> keyRef = new KeySoftReference<K, V>(key, value,
				queue);
		SoftReference<V> result = hash.put(key, keyRef);
		if (result == null)
			return null;
		return result.get();
	}

	@Override
	public V remove(Object key) {
		expungeStaleEntries();
		SoftReference<V> result = hash.remove(key);
		if (result == null)
			return null;
		return result.get();
	}

	@Override
	public void clear() {
		hash.clear();
	}

	@Override
	public int size() {
		expungeStaleEntries();
		return hash.size();
	}

	@Override
	public boolean containsKey(Object key) {
		expungeStaleEntries();
		SoftReference<V> keyRef = hash.get(key);
		if (keyRef != null) {
			// From the SoftReference we get the value, which can be
			// null if it has been garbage collected
			V result = keyRef.get();
			if (result != null) {
				return true;
			}
			// If the value has been garbage collected, remove the
			// entry from the HashMap.
			hash.remove(key);
		}
		return false;
	}

	/**
	 * Returns a copy of the key/values in the map at the point of calling.
	 * However, setValue still sets the value in the actual SoftHashMap.
	 */
	@Override
	public Set<Entry<K, V>> entrySet() {
		expungeStaleEntries();
		Set<Entry<K, V>> result = new LinkedHashSet<Entry<K, V>>();
		for (final Entry<K, KeySoftReference<K, V>> entry : hash.entrySet()) {
			final V value = entry.getValue().get();
			if (value != null) {
				result.add(new Entry<K, V>() {
					public K getKey() {
						return entry.getKey();
					}

					public V getValue() {
						return value;
					}

					public V setValue(V v) {
						entry.setValue(new KeySoftReference<K, V>(entry
								.getKey(), v, queue));
						return value;
					}
				});
			}
		}
		return result;
	}
}
