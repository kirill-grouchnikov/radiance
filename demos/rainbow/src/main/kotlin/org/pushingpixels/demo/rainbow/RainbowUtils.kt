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

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea
import org.fife.ui.rsyntaxtextarea.SyntaxConstants
import org.fife.ui.rsyntaxtextarea.SyntaxScheme
import org.fife.ui.rtextarea.RTextScrollPane
import org.pushingpixels.meteor.addDelayedActionListener
import org.pushingpixels.photon.api.transcoder.SvgStreamTranscoder
import org.pushingpixels.photon.api.transcoder.java.JavaLanguageRenderer
import java.awt.BorderLayout
import java.awt.Color
import java.awt.FlowLayout
import java.awt.Font
import java.io.*
import javax.swing.*
import javax.swing.filechooser.FileFilter

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

        val transcoder = SvgStreamTranscoder(
                ByteArrayInputStream(svgBytes), javaClassFilename,
                JavaLanguageRenderer())

        transcoder.setPrintWriter(pw)
        transcoder.transcode(RainbowUtils::class.java.getResourceAsStream(
                "TOKEN_PACKAGE\n\nimport java.awt.*;\nimport java.awt.geom.*;\nimport java.awt.image.BufferedImage;\nimport java.io.*;\nimport java.lang.ref.WeakReference;\nimport java.util.Base64;\nimport javax.imageio.ImageIO;\nimport javax.swing.plaf.UIResource;\n\nimport org.pushingpixels.neon.api.icon.ResizableIcon;\nimport org.pushingpixels.neon.api.icon.ResizableIconUIResource;\n\n/**\n * This class has been automatically generated using <a\n * href=\"https://github.com/kirill-grouchnikov/radiance\">Photon SVG transcoder</a>.\n */\npublic class TOKEN_CLASSNAME implements ResizableIcon {\n    TOKEN_RASTER_CODE\n\n    @SuppressWarnings(\"unused\")\n\tprivate void innerPaint(Graphics2D g) {\n        Shape shape = null;\n        Paint paint = null;\n        Stroke stroke = null;\n        Shape clip = null;\n\n        float origAlpha = 1.0f;\n        Composite origComposite = g.getComposite();\n        if (origComposite instanceof AlphaComposite) {\n            AlphaComposite origAlphaComposite = \n                (AlphaComposite)origComposite;\n            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {\n                origAlpha = origAlphaComposite.getAlpha();\n            }\n        }\n        \n\t    TOKEN_PAINTING_CODE\n\t}\n\n    /**\n     * Returns the X of the bounding box of the original SVG image.\n     * \n     * @return The X of the bounding box of the original SVG image.\n     */\n    public static double getOrigX() {\n        return TOKEN_ORIG_X;\n    }\n\n    /**\n     * Returns the Y of the bounding box of the original SVG image.\n     * \n     * @return The Y of the bounding box of the original SVG image.\n     */\n    public static double getOrigY() {\n        return TOKEN_ORIG_Y;\n    }\n\n\t/**\n\t * Returns the width of the bounding box of the original SVG image.\n\t * \n\t * @return The width of the bounding box of the original SVG image.\n\t */\n\tpublic static double getOrigWidth() {\n\t\treturn TOKEN_ORIG_WIDTH;\n\t}\n\n\t/**\n\t * Returns the height of the bounding box of the original SVG image.\n\t * \n\t * @return The height of the bounding box of the original SVG image.\n\t */\n\tpublic static double getOrigHeight() {\n\t\treturn TOKEN_ORIG_HEIGHT;\n\t}\n\n\t/** The current width of this resizable icon. */\n\tprivate int width;\n\n    /** The current height of this resizable icon. */\n\tprivate int height;\n\n\t/**\n\t * Creates a new transcoded SVG image. This is marked as private to indicate that app\n\t * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.\n\t */\n\tprivate TOKEN_CLASSNAME() {\n        this.width = (int) getOrigWidth();\n        this.height = (int) getOrigHeight();\n\t}\n\n    @Override\n\tpublic int getIconHeight() {\n\t\treturn height;\n\t}\n\n    @Override\n\tpublic int getIconWidth() {\n\t\treturn width;\n\t}\n\n\t@Override\n\tpublic void setDimension(Dimension newDimension) {\n\t\tthis.width = newDimension.width;\n\t\tthis.height = newDimension.height;\n\t}\n\n    @Override\n\tpublic void paintIcon(Component c, Graphics g, int x, int y) {\n\t\tGraphics2D g2d = (Graphics2D) g.create();\n\t\tg2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,\n\t\t\t\tRenderingHints.VALUE_ANTIALIAS_ON);\n        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,\n                RenderingHints.VALUE_INTERPOLATION_BICUBIC);\n\t\tg2d.translate(x, y);\n\n        double coef1 = (double) this.width / getOrigWidth();\n        double coef2 = (double) this.height / getOrigHeight();\n        double coef = Math.min(coef1, coef2);\n        g2d.clipRect(0, 0, this.width, this.height);\n        g2d.scale(coef, coef);\n        g2d.translate(-getOrigX(), -getOrigY());\n        if (coef1 != coef2) {\n            if (coef1 < coef2) {\n               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);\n               g2d.translate(0, extraDy);\n            } else {\n               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);\n               g2d.translate(extraDx, 0);\n            }\n        }\n        Graphics2D g2ForInner = (Graphics2D) g2d.create();\n        innerPaint(g2ForInner);\n        g2ForInner.dispose();\n        g2d.dispose();\n\t}\n    \n    /**\n     * Returns a new instance of this icon with specified dimensions.\n     *\n     * @param width Required width of the icon\n     * @param height Required height of the icon\n     * @return A new instance of this icon with specified dimensions.\n     */\n    public static ResizableIcon of(int width, int height) {\n       TOKEN_CLASSNAME base = new TOKEN_CLASSNAME();\n       base.width = width;\n       base.height = height;\n       return base;\n    }\n\n    /**\n     * Returns a new {@link UIResource} instance of this icon with specified dimensions.\n     *\n     * @param width Required width of the icon\n     * @param height Required height of the icon\n     * @return A new {@link UIResource} instance of this icon with specified dimensions.\n     */\n    public static ResizableIconUIResource uiResourceOf(int width, int height) {\n       TOKEN_CLASSNAME base = new TOKEN_CLASSNAME();\n       base.width = width;\n       base.height = height;\n       return new ResizableIconUIResource(base);\n    }\n\n    /**\n     * Returns a factory that returns instances of this icon on demand.\n     *\n     * @return Factory that returns instances of this icon on demand.\n     */\n    public static Factory factory() {\n        return TOKEN_CLASSNAME::new;\n    }\n}\n"))

        val javaContents = String(javaBaos.toByteArray())
        val javaEditorPane = RSyntaxTextArea(20, 60)
        javaEditorPane.syntaxEditingStyle = SyntaxConstants.SYNTAX_STYLE_JAVA
        javaEditorPane.isCodeFoldingEnabled = true
        setFont(javaEditorPane, font)
        javaEditorPane.isEditable = false
        javaEditorPane.background = Color.WHITE
        javaEditorPane.text = javaContents
        javaEditorPane.moveCaretPosition(0)
        val javaScroller = RTextScrollPane(javaEditorPane)

        val javaPanel = JPanel(BorderLayout())
        javaPanel.add(javaScroller, BorderLayout.CENTER)
        val saveAs = JButton("Save as...")
        saveAs.addDelayedActionListener {
            val fileChooser = JFileChooser(lastChosenFolder)
            fileChooser.isAcceptAllFileFilterUsed = false
            fileChooser.selectedFile = File("$javaClassFilename.java")
            fileChooser.addChoosableFileFilter(object : FileFilter() {
                override fun accept(pathname: File): Boolean {
                    return if (pathname.isDirectory) true else pathname.absolutePath.endsWith(".java")
                }

                override fun getDescription(): String {
                    return "Java source files"
                }
            })
            if (fileChooser.showDialog(fileFrame, "Save") == JFileChooser.APPROVE_OPTION) {
                val file = fileChooser.selectedFile
                lastChosenFolder = file.parentFile

                FileWriter(file).use { javaFileWriter ->
                    val javaContent = String(javaBaos.toByteArray())
                    javaFileWriter.write(javaContent)
                    println("Saved Java2D code to " + file.absolutePath)
                }
            }
        }
        val buttonPanel = JPanel(FlowLayout(FlowLayout.RIGHT))
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
