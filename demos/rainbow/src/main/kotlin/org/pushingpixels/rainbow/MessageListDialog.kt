/*
 * Copyright (c) 2005-2019 Rainbow Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.rainbow

import org.pushingpixels.meteor.addDelayedActionListener
import java.awt.*
import java.util.*
import javax.swing.*

/**
 * A dialog for displaying a list of messages (in a scroll panel).
 *
 * @author Kirill Grouchnikov
 */
class MessageListDialog
private constructor(owner: Frame?, mainMessage: String, messages: LinkedList<String>) : JDialog(owner, "Message list") {
    private var toExitOnDispose: Boolean = false

    init {
        val messageLabel = JLabel(mainMessage)
        val messageList = JList(messages.toTypedArray())
        messageList.foreground = Color.red
        messageList.font = UIManager.getFont("Panel.font").deriveFont(Font.BOLD)
        val mesScrollPane = JScrollPane(messageList)
        val closeButton = JButton("Close")
        closeButton.addDelayedActionListener {
            dispose()
            if (toExitOnDispose) {
                System.exit(0)
            }
        }

        this.layout = BorderLayout()
        val upperPanel = JPanel()
        upperPanel.layout = FlowLayout(FlowLayout.CENTER)
        val bottomPanel = JPanel()
        bottomPanel.layout = FlowLayout(FlowLayout.CENTER)

        upperPanel.add(messageLabel)
        bottomPanel.add(closeButton)

        this.add(upperPanel, BorderLayout.NORTH)
        this.add(mesScrollPane, BorderLayout.CENTER)
        this.add(bottomPanel, BorderLayout.SOUTH)

        val width = 400
        val height = 250
        val thisDim = Dimension(width, height)
        this.size = thisDim
        this.preferredSize = thisDim
        this.isResizable = true

        if (owner != null) {
            val ownerDim = owner.size
            val ownerLoc = owner.location

            val xc = ownerLoc.x + ownerDim.width / 2
            val yc = ownerLoc.y + ownerDim.height / 2
            this.setLocation(xc - width / 2, yc - height / 2)
        } else {
            // retrieve the physical screen dimension
            val d = Toolkit.getDefaultToolkit().screenSize
            // center the configuration screen in the physical screen
            this.setLocation((d.width - width) / 2, (d.height - height) / 2)
        }

        this.getRootPane().defaultButton = closeButton
        this.toExitOnDispose = false
    }

    fun setToExitOnDispose(toExitOnDispose: Boolean) {
        this.toExitOnDispose = toExitOnDispose
    }

    companion object {

        /**
         * Shows a message dialog.
         *
         * @param owner
         * The owner frame (`this` dialog is modal).
         * @param mainMessage
         * The main message (displayed in the top portion of the dialog).
         * @param messages
         * The list of messages to display in a scroll panel.
         */
        fun showMessageDialog(owner: Frame?, mainMessage: String,
                messages: LinkedList<String>): MessageListDialog {
            val mld = MessageListDialog(owner, mainMessage, messages)
            mld.isModal = owner != null
            mld.isVisible = true
            return mld
        }

        /**
         * Shows a message dialog for exception.
         *
         * @param owner
         * The owner frame (`this` dialog is modal).
         * @param message
         * The main message (displayed in the top portion of the dialog).
         * @param throwable
         * An exception. The stack trace of the exception will be shown
         * in a scroll panel.
         */
        fun showMessageDialog(owner: Frame?, message: String,
                throwable: Throwable): MessageListDialog {
            var currThrowable: Throwable? = throwable
            val errors = LinkedList<String>()
            while (true) {
                val mainMessage = currThrowable!!.javaClass.name + " : " + currThrowable.message
                errors.addLast(mainMessage)
                val stack = currThrowable.stackTrace
                for (ste in stack) {
                    val className = ste.className
                    val methodName = ste.methodName
                    val lineNumber = "" + ste.lineNumber
                    val steMessage = ("      in " + className + "." + methodName + "(); [line "
                            + lineNumber + "]")
                    errors.addLast(steMessage)
                }
                currThrowable = currThrowable.cause
                if (currThrowable == null) {
                    break
                }
                errors.addLast("Caused by")
            }
            return showMessageDialog(owner, message, errors)
        }
    }
}