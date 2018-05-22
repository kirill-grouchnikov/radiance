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

import org.pushingpixels.substance.api.trait.SubstanceTraitInfo;

/**
 * Basic class for trait info.
 * 
 * @author Kirill Grouchnikov
 */
public class TraitInfoImpl implements SubstanceTraitInfo {
	/**
	 * The display name of the associated trait.
	 */
	private String displayName;

	/**
	 * The class name of the associated trait.
	 */
	private String className;

	/**
	 * Indication whether the associated trait is default in the application.
	 */
	private boolean isDefault;

	/**
	 * Simple constructor.
	 * 
	 * @param displayName
	 *            Display name of the associated trait.
	 * @param className
	 *            Class name of the associated trait.
	 */
	public TraitInfoImpl(String displayName, String className) {
		this.displayName = displayName;
		this.className = className;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.utils.SubstanceTraitInfo#getClassName()
	 */
	public String getClassName() {
		return this.className;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.utils.SubstanceTrait#getDisplayName()
	 */
	public String getDisplayName() {
		return this.displayName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.utils.SubstanceTraitInfo#isDefault()
	 */
	public boolean isDefault() {
		return this.isDefault;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.utils.SubstanceTraitInfo#setDefault(boolean)
	 */
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
}
