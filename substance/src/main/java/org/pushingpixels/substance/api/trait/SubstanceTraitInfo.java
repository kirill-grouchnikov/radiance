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
package org.pushingpixels.substance.api.trait;

/**
 * Base interface for Substance traits info, like {@link ThemeInfo},
 * {@link WatermarkInfo} etc.
 * 
 * @author Kirill Grouchnikov
 */
public interface SubstanceTraitInfo {
	/**
	 * Returns the display name of the associated trait. This method is part of
	 * officially supported API.
	 * 
	 * @return The display name of the associated trait.
	 */
	public String getDisplayName();

	/**
	 * Returns the class name of the associated trait.
	 * 
	 * @return The class name of the associated trait. This method is part of
	 *         officially supported API.
	 */
	public String getClassName();

	/**
	 * Returns indication whether the associated trait is default.
	 * 
	 * @return <code>true</code> if the associated trait is default,
	 *         <code>false</code> otherwise.
	 */
	public boolean isDefault();

	/**
	 * Sets indication whether the associated trait is default.
	 * 
	 * @param isDefault
	 *            New indication whether the associated trait is default.
	 */
	public void setDefault(boolean isDefault);
}
