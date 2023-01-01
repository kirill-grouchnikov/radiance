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
package org.pushingpixels.radiance.theming.internal.widget.tree.dnd;

import java.util.EventListener;

/**
 * StringTreeDnDListener represents a listener that is informed when a String is
 * about to be dropped into a node in a JTree.
 * 
 * @author Antonio Vieiro (antonio@antonioshome.net), $Author: kirillcool $
 */
public interface StringTreeDnDListener extends EventListener {
	/**
	 * Invoked to verify that aSourceString may be dropped into aTargetNode
	 * inside aTargetTree.
	 * 
	 * @param anEvent
	 *            a StringTreeDnDEvent containing information about the data
	 *            being dropped.
	 * @throws DnDVetoException
	 *             if the drag and drop operation is not valid.
	 */
    void mayDrop(StringTreeDnDEvent anEvent) throws DnDVetoException;

	/**
	 * Invoked when the drop operation happens.
	 * 
	 * @param anEvent
	 *            a StringTreeDnDEvent the event containing information about
	 *            the Drag and Drop operation.
	 * @throws DnDVetoException
	 *             if the drag and drop operation is not valid.
	 */
    void drop(StringTreeDnDEvent anEvent) throws DnDVetoException;
}
