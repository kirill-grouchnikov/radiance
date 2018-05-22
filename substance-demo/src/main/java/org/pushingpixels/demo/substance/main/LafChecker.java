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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.demo.substance.main;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

import javax.swing.UIDefaults;
import javax.swing.UIManager;

public class LafChecker {
	private static class EntryInfo {
		public Object key;
		public Object value;
		
		public EntryInfo(Object key, Object value) {
			super();
			this.key = key;
			this.value = value;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof EntryInfo) {
				EntryInfo that = (EntryInfo) obj;
				return this.key.equals(that.key) && (this.value.equals(that.value)); 
			}
			return false;
		}
		
		@Override
		public int hashCode() {
			return (key == null ? 0 : key.hashCode()) + 31 * (value == null ? 0 : value.hashCode());
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Set<EntryInfo> defaultSet = new HashSet<EntryInfo>();
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		UIDefaults defaultUid = UIManager.getLookAndFeelDefaults();
		Enumeration<Object> defaultKeys = defaultUid.keys();
		while (defaultKeys.hasMoreElements()) {
			Object key = defaultKeys.nextElement();
			defaultSet.add(new EntryInfo(key, defaultUid.get(key)));
		}
		
		Set<EntryInfo> metalSet = new HashSet<EntryInfo>();
		UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		UIDefaults metalUid = UIManager.getLookAndFeelDefaults();
		Enumeration<Object> metalKeys = metalUid.keys();
		while (metalKeys.hasMoreElements()) {
			Object key = metalKeys.nextElement();
			metalSet.add(new EntryInfo(key, metalUid.get(key)));
		}
		
		for (EntryInfo entryInfo : defaultSet) {
			if (metalSet.contains(entryInfo)) {
				System.out.println(entryInfo.key + " : " + entryInfo.value);
				
			}
		}
//			
//			if (key instanceof String) {
////				if (((String) key).indexOf("render") >= 0) {
//				Object value = uid.get(key);
//				System.out.println(key + " : " + value);
////				}
//			}
//		}
	}

}
