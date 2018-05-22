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

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Test application panel that test {@link CardLayout}.
 * 
 * @author Kirill Grouchnikov
 */
public class CardPanel extends JPanel implements ItemListener {
	/**
	 * Test panel with {@link CardLayout}
	 */
	JPanel cards; 

	/**
	 * ID for the button panel.
	 */
	final static String BUTTONPANEL = "JPanel with JButtons";

	/**
	 * ID for the text panel.
	 */
	final static String TEXTPANEL = "JPanel with JTextField";

	/**
	 * Creates a new panel.
	 */
	public CardPanel() {
		// Put the JComboBox in a JPanel to get a nicer look.
		JPanel comboBoxPane = new JPanel(); // use FlowLayout
		String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL };
		JComboBox cb = new JComboBox(comboBoxItems);
		cb.setEditable(false);
		cb.addItemListener(this);
		comboBoxPane.add(cb);

		// Create the "cards".
		JPanel card1 = new JPanel();
		card1.add(new JButton("Button 1"));
		card1.add(new JButton("Button 2"));
		card1.add(new JButton("Button 3"));

		JPanel card2 = new JPanel();
		card2.add(new JTextField("TextField", 20));

		// Create the panel that contains the "cards".
		cards = new JPanel(new CardLayout());
		cards.add(card1, BUTTONPANEL);
		cards.add(card2, TEXTPANEL);

		this.add(comboBoxPane, BorderLayout.PAGE_START);
		this.add(cards, BorderLayout.CENTER);
	}

	public void itemStateChanged(ItemEvent evt) {
		CardLayout cl = (CardLayout) (cards.getLayout());
		cl.show(cards, (String) evt.getItem());
	}
}