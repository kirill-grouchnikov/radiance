/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.tools.lafbenchmark;

import javax.swing.*;
import java.util.*;

public class IconManager {
	private static List<Icon> iconList;

	private static synchronized List<Icon> getIconList() {
		if (iconList == null) {
			iconList = new LinkedList<Icon>();
			ClassLoader cl = IconManager.class.getClassLoader();
			String prefix = "org/pushingpixels/radiance/tools/lafbenchmark/resources/flag_";
			iconList.add(new ImageIcon(cl.getResource(prefix + "canada.png")));
			iconList.add(new ImageIcon(cl.getResource(prefix + "denmark.png")));
			iconList.add(new ImageIcon(cl.getResource(prefix + "germany.png")));
			iconList.add(new ImageIcon(cl.getResource(prefix + "italy.png")));
			iconList.add(new ImageIcon(cl.getResource(prefix + "mexico.png")));
			iconList.add(new ImageIcon(cl.getResource(prefix + "russia.png")));
			iconList.add(new ImageIcon(cl.getResource(prefix + "turkey.png")));
			iconList.add(new ImageIcon(cl.getResource(prefix + "united_states.png")));
		}
		return iconList;
	}

	public static Icon getRandomIcon() {
		int iconNumber = new Random().nextInt(8);
		return getIconList().get(iconNumber);
	}
}
