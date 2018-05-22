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
package org.pushingpixels.demo.substance.main.check;

import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.password.PasswordStrengthChecker;

/**
 * A custom password strength checker for the test application.
 * 
 * @author Kirill Grouchnikov
 */
public class MyPasswordStrengthChecker implements PasswordStrengthChecker {
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.lafwidget.text.PasswordStrengthChecker#getStrength(char[])
	 */
	public SubstanceSlices.PasswordStrength getStrength(char[] password) {
		if (password == null)
			return SubstanceSlices.PasswordStrength.WEAK;
		int length = password.length;
		if (length < 3)
			return SubstanceSlices.PasswordStrength.WEAK;
		if (length < 6)
			return SubstanceSlices.PasswordStrength.MEDIUM;
		return SubstanceSlices.PasswordStrength.STRONG;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.lafwidget.text.PasswordStrengthChecker#getDescription(org.pushingpixels.lafwidget.utils.LafConstants.PasswordStrength)
	 */
	public String getDescription(SubstanceSlices.PasswordStrength strength) {
		if (strength == SubstanceSlices.PasswordStrength.WEAK)
			return "<html>This password is <b>way</b> too weak</html>";
		if (strength == SubstanceSlices.PasswordStrength.MEDIUM)
			return "<html>Come on, you can do<br> a little better than that</html>";
		if (strength == SubstanceSlices.PasswordStrength.STRONG)
			return "OK";
		return null;
	}
}