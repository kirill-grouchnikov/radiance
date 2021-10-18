/*
 * Copyright (c) 2005-2020 Rainbow Kirill Grouchnikov
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
package org.pushingpixels.demo.rainbow

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea
import org.fife.ui.rsyntaxtextarea.SyntaxConstants
import org.fife.ui.rsyntaxtextarea.SyntaxScheme
import org.fife.ui.rtextarea.RTextScrollPane
import org.pushingpixels.meteor.addDelayedActionListener
import org.pushingpixels.meteor.swing.addChoosableFileFilter
import org.pushingpixels.photon.api.transcoder.SvgStreamTranscoder
import org.pushingpixels.photon.api.transcoder.java.JavaLanguageRenderer
import java.awt.BorderLayout
import java.awt.Color
import java.awt.FlowLayout
import java.awt.Font
import java.io.*
import javax.swing.*

/**
 * Utilities class.
 *
 * @author Kirill Grouchnikov
 * @author Alexander Potochkin
 */
object RainbowUtils {
    /**
     * Last chosen folder for saving Java2D code.
     */
    private var lastChosenFolder: File? = null

    private fun setFont(textArea: RSyntaxTextArea, font: Font) {
        var syntaxScheme = textArea.syntaxScheme
        syntaxScheme = syntaxScheme.clone() as SyntaxScheme
        for (i in 0 until syntaxScheme.styleCount) {
            if (syntaxScheme.getStyle(i) != null) {
                syntaxScheme.getStyle(i).font = font
            }
        }
        textArea.syntaxScheme = syntaxScheme
        textArea.font = font
    }

    /**
     * Processes the click on SVG icon button.
     *
     * @param svgBytes SVG bytes.
     * @param svgName  SVG file name (not necessarily on the hard disk).
     */
    fun processSvgButtonClick(svgBytes: ByteArray, svgName: String) {
        val fileFrame = JFrame(svgName)
        fileFrame.setSize(600, 500)
        fileFrame.setLocationRelativeTo(null)
        fileFrame.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE

        fileFrame.layout = BorderLayout()
        fileFrame.iconImage = RadianceLogo.getTitlePaneLogoImage(fileFrame)

        val jtp = JTabbedPane()
        jtp.tabPlacement = SwingConstants.LEFT

        val classLoader = Thread.currentThread().contextClassLoader
        val fontURL = classLoader.getResource("fonts/FiraCode-Regular.ttf")
        val streamFont = fontURL!!.openStream()
        var font = Font.createFont(Font.TRUETYPE_FONT, streamFont)
        font = font.deriveFont(1.0f + UIManager.getFont("TextArea.font").size2D)

        val svgContents = String(svgBytes)
        val xmlEditorPane = RSyntaxTextArea(20, 60)
        xmlEditorPane.syntaxEditingStyle = SyntaxConstants.SYNTAX_STYLE_XML
        xmlEditorPane.isCodeFoldingEnabled = true
        setFont(xmlEditorPane, font)
        xmlEditorPane.isEditable = false
        xmlEditorPane.background = Color.WHITE
        xmlEditorPane.text = svgContents
        xmlEditorPane.moveCaretPosition(0)
        val xmlScroller = RTextScrollPane(xmlEditorPane)
        jtp.add("SVG contents", xmlScroller)

        fileFrame.add(jtp, BorderLayout.CENTER)
        fileFrame.isVisible = true

        val javaClassFilename = getSvgClassName(svgName)

        val javaBaos = ByteArrayOutputStream()
        val pw = PrintWriter(javaBaos)

        val transcoder =
            SvgStreamTranscoder(
                ByteArrayInputStream(svgBytes), javaClassFilename,
                JavaLanguageRenderer()
            )

        transcoder.setPrintWriter(pw)
        transcoder.transcode(RainbowUtils::class.java.getResourceAsStream(
                "/org/pushingpixels/photon/api/transcoder/java" +
                        "/SvgTranscoderTemplateRadiance.templ"))

        val javaEditorPane = RSyntaxTextArea(20, 60)
        javaEditorPane.syntaxEditingStyle = SyntaxConstants.SYNTAX_STYLE_JAVA
        javaEditorPane.isCodeFoldingEnabled = true
        setFont(javaEditorPane, font)
        javaEditorPane.isEditable = false
        javaEditorPane.background = Color.WHITE
        javaEditorPane.text = String(javaBaos.toByteArray())
        javaEditorPane.moveCaretPosition(0)
        val javaScroller = RTextScrollPane(javaEditorPane)

        val javaPanel = JPanel(BorderLayout())
        javaPanel.add(javaScroller, BorderLayout.CENTER)
        val saveAs = JButton("Save as...")
        saveAs.addDelayedActionListener {
            val fileChooser = JFileChooser(lastChosenFolder)
            fileChooser.isAcceptAllFileFilterUsed = false
            fileChooser.selectedFile = File("$javaClassFilename.java")
            fileChooser.addChoosableFileFilter("Java source files") { pathname ->
                if (pathname.isDirectory) true else pathname.absolutePath.endsWith(".java")
            }
            if (fileChooser.showDialog(fileFrame, "Save") == JFileChooser.APPROVE_OPTION) {
                val file = fileChooser.selectedFile
                lastChosenFolder = file.parentFile

                @Suppress("BlockingMethodInNonBlockingContext")
                withContext(Dispatchers.IO) {
                    FileWriter(file).use { javaFileWriter ->
                        val javaContent = String(javaBaos.toByteArray())
                        javaFileWriter.write(javaContent)
                        println("Saved Java2D code to " + file.absolutePath)
                    }
                }
            }
        }
        val buttonPanel = JPanel(FlowLayout(FlowLayout.TRAILING))
        buttonPanel.add(saveAs)
        javaPanel.add(buttonPanel, BorderLayout.SOUTH)
        jtp.add("Java2D code", javaPanel)
    }

    /**
     * Returns the Java class name for the SVG file name.
     *
     * @param svgName SVG file name.
     * @return Java class name for the SVG file name.
     */
    private fun getSvgClassName(svgName: String): String {
        val lastDotIndex = svgName.lastIndexOf('.')
        var svgClassName = svgName.substring(0, lastDotIndex)
        svgClassName = svgClassName.replace('-', '_')
        svgClassName = svgClassName.replace(' ', '_')
        return svgClassName
    }
}
