/*
 * Copyright (c) 2005-2018 Rainbow Kirill Grouchnikov 
 * and Alexander Potochkin. All Rights Reserved.
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
 *  o Neither the name of Rainbow, Kirill Grouchnikov 
 *    and Alexander Potochkin nor the names of
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
package org.pushingpixels.rainbow.layout;

import java.awt.Container;
import java.awt.LayoutManager;

/**
 * Transition layout manager. Contains method for installing / uninstalling
 * transition layout effects on containers. Application code should use the
 * methods in this class instead of using the {@link TransitionLayout} class
 * directly.
 * 
 * @author Kirill Grouchnikov.
 */
public class TransitionLayoutManager {
	/**
	 * Singleton manager.
	 */
	private static TransitionLayoutManager instance;

	private TransitionLayoutManager() {
	}

	/**
	 * Returns the manager instance.
	 * 
	 * @return Manager instance.
	 */
	public synchronized static TransitionLayoutManager getInstance() {
		if (instance == null)
			instance = new TransitionLayoutManager();
		return instance;
	}

	/**
	 * Starts tracking the specified container adding the transition layout
	 * effects. Note that providing <code>true</code> for the
	 * <code>doImmediateRepaint</code> parameter will result in very
	 * CPU-intensive code - this is not recommended for now. This method can be
	 * called on a container that already has transition layout effects
	 * installed - in this case the call will have no effect (preserving the
	 * transition layout effects).
	 * 
	 * @param container
	 *            Container for transition layout effects.
	 * @param doImmediateRepaint
	 *            If <code>true</code>, every transition step will result in
	 *            repainting the relevant component. Recommended value is
	 *            <code>false</code> for better performance.
	 */
	public void track(Container container, boolean doImmediateRepaint) {
		LayoutManager currLayout = container.getLayout();
		if (currLayout instanceof TransitionLayout)
			return;

		TransitionLayout layout = new TransitionLayout(container, container
				.getLayout());
		layout.setDoImmediateRepaint(doImmediateRepaint);
		container.setLayout(layout);
	}

	/**
	 * Removes the transition layout effects from the specified container. The
	 * layout manager is reset to the original layout manager. This method can
	 * be called on a container that hadn't been tracked with
	 * {@link #track(Container, boolean)} or
	 * {@link #track(Container, boolean, boolean)}.
	 * 
	 * @param container
	 *            Container.
	 */
	public void untrack(Container container) {
		LayoutManager layout = container.getLayout();
		if (layout instanceof TransitionLayout) {
			TransitionLayout tLayout = (TransitionLayout) layout;
			container.setLayout(tLayout.getDelegate());
		}
	}
}
