/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.internal.utils;

import java.util.Arrays;

/**
 * Implementation of a key for the {@link LazyResettableHashMap}.
 * 
 * @author Kirill Grouchnikov
 */
public class ImageHashMapKey extends LazyResettableHashMap.Key {
	private double scale;

	/**
	 * Fields that represent this key object.
	 */
	private Object[] keyFields;

	/**
	 * Creates a new key object.
	 *
	 * @param fields
	 *            Fields of the key object.
	 */
	public ImageHashMapKey(double scale, Object... fields) {
		this.scale = scale;
		this.keyFields = fields;
	}

	@Override
	public int hashCode() {
		long scaleBits = Double.doubleToLongBits(this.scale);
		int scaleHash = (int) (scaleBits ^ (scaleBits >>> 32));
		return 31 * Arrays.deepHashCode(this.keyFields) + scaleHash;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ImageHashMapKey)) {
			return false;
		}
		ImageHashMapKey key2 = (ImageHashMapKey) obj;
		return (this.scale == key2.scale) && Arrays.equals(this.keyFields, key2.keyFields);
	}
}
