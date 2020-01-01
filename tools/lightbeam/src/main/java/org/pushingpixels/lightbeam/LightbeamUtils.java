/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.lightbeam;

import java.awt.*;
import java.util.*;

/**
 * Utilities for the Lightbeam project.
 * 
 * @author Kirill Grouchnikov
 */
public class LightbeamUtils {

	/**
	 * Returns a random permutation. The <code>inputSize</code> specifies the
	 * size of the input pool. The <code>outputSize</code> specifies the size of
	 * the output permutation. All numbers in 0..<code>inputSize</code>-1 range
	 * have the same probability to appear in the output.
	 * <code>outputSize</code> does not have to be smaller than
	 * <code>inputSize</code>. This method is guaranteed to return the same
	 * exact output for the same parameter values, thus making the scenarios
	 * relying on the parameters to work on the same random (as far as they are
	 * concerned) input.
	 * 
	 * @param inputSize
	 * 		The size of the input tool.
	 * @param outputSize
	 * 		The size of the output permutation.
	 * @return A random permutation containing elements in 0..
	 * 	<code>inputSize</code>-1 range.
	 */
	public static int[] getPermutation(int inputSize, int outputSize) {
		int countToShuffle = inputSize;
		while (countToShuffle < outputSize)
			countToShuffle += inputSize;

		int[] workArray = new int[countToShuffle];
		for (int i = 0; i < countToShuffle; i++) {
			workArray[i] = i % inputSize;
		}
		// Using a constant seed makes sure that the same exact
		// sequence is returned on the same input / output size pair.
		// As far as the specific scenario is concerned, it is getting
		// a random input, and different runs of the same scenario
		// (under different LAFs, for example) get the same sequence.
		Random rand = new Random(inputSize * outputSize);
		for (int i = 0; i < outputSize; i++) {
			int toSwap = i + rand.nextInt(countToShuffle - i);
			int temp = workArray[i];
			workArray[i] = workArray[toSwap];
			workArray[toSwap] = temp;
		}

		int[] result = new int[outputSize];
		System.arraycopy(workArray, 0, result, 0, outputSize);

		return result;
	}

	public static void collectFromContainer(Container cont,
			Class<?> componentClass, boolean isStrictMatch,
			Collection toPopulate) {
		for (int i = 0; i < cont.getComponentCount(); i++) {
			Component child = cont.getComponent(i);
			if (isStrictMatch) {
				if (componentClass == child.getClass())
					toPopulate.add(child);
			} else {
				if (componentClass.isAssignableFrom(child.getClass()))
					toPopulate.add(child);
			}
			if (child instanceof Container) {
				collectFromContainer((Container) child, componentClass,
						isStrictMatch, toPopulate);
			}
		}
	}

	/**
	 * Test main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] perms = LightbeamUtils.getPermutation(15, 5);
		for (int perm : perms)
			System.out.print(perm + " ");
		System.out.println();
	}

	public static String[] dictionary = new String[] { "some", "good",
	"brown", "fox", "flag", "ruler", "zombie", "automate", "chicken",
	"zesty", "Jumbo", "AK 47", "QWERTY", "foobar", "emphasis",
	"delicate", "Rowdy", "BaNaNaS", "jeopardize", "Moniker",
	"Santa Cruz", "Jupiter", "Glasgow", "remember", "Colts",
	"demeanor", "Nefarious", "subtitles", "dominate", "repeatedly",
	"WaterWorks", "articulate" };

}
