/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.theming.api.trait.RadianceTraitInfo;

/**
 * Basic class for trait info.
 * 
 * @author Kirill Grouchnikov
 */
public class TraitInfoImpl implements RadianceTraitInfo {
	/**
	 * The display name of the associated trait.
	 */
	private String displayName;

	/**
	 * The class name of the associated trait.
	 */
	private String className;

	private boolean isClassNameResolved;
	private LazyClassNameResolver classNameResolver;

	public interface LazyClassNameResolver {
		String createClassName();
	}

	/**
	 * Simple constructor.
	 * 
	 * @param displayName
	 *            Display name of the associated trait.
	 * @param classNameResolver
	 *            Class name resolver of the associated trait.
	 */
	public TraitInfoImpl(String displayName, LazyClassNameResolver classNameResolver) {
		this.displayName = displayName;
		this.classNameResolver = classNameResolver;
	}

	@Override
	public String getClassName() {
		if (!this.isClassNameResolved) {
			this.className = this.classNameResolver.createClassName();
			this.isClassNameResolved = true;
		}

		return this.className;
	}

	@Override
	public String getDisplayName() {
		return this.displayName;
	}
}
