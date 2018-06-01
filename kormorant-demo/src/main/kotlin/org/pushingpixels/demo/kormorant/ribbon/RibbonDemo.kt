/*
 * Copyright (c) 2018 Radiance Kormorant Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Kormorant Kirill Grouchnikov nor the names of
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
package org.pushingpixels.demo.kormorant.ribbon

import org.pushingpixels.demo.kormorant.svg.*
import org.pushingpixels.flamingo.api.common.icon.ColorResizableIcon
import org.pushingpixels.flamingo.api.common.icon.DecoratedResizableIcon
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies
import org.pushingpixels.flamingo.api.ribbon.resize.RibbonBandResizePolicy
import org.pushingpixels.flamingo.internal.ui.ribbon.JBandControlPanel
import org.pushingpixels.kormorant.commandPopupMenu
import org.pushingpixels.kormorant.ribbon.*
import org.pushingpixels.neon.NeonUtil
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.skin.BusinessSkin
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.text.MessageFormat
import java.util.*
import javax.swing.*

private class ExpandActionListener : ActionListener {
    override fun actionPerformed(e: ActionEvent) {
        JOptionPane.showMessageDialog(null, "Expand button clicked")
    }
}

private class RibbonDemoBuilder {
    val currLocale = Locale.getDefault() as Locale
    val resourceBundle = ResourceBundle.getBundle(
            "org.pushingpixels.demo.kormorant.resources.Resources", currLocale) as ResourceBundle

    fun getSimplePopupMenu(): PopupPanelCallback {
        return PopupPanelCallback {
            val mf = MessageFormat(resourceBundle.getString("TestMenuItem.text"))
            val popupMenuCommand = commandPopupMenu {
                command {
                    title = mf.format(arrayOf("1"))
                    icon = ColorResizableIcon(16, Color(0x80, 0xDE, 0xEA))
                    action = ActionListener {
                        println("Test menu item 1 activated")
                    }
                    actionKeyTip = "1"
                }
                command {
                    title = mf.format(arrayOf("2"))
                    icon = ColorResizableIcon(16, Color(0x80, 0xCB, 0xC4))
                    action = ActionListener {
                        println("Test menu item 2 activated")
                    }
                    actionKeyTip = "2"
                }
                command {
                    title = mf.format(arrayOf("3"))
                    icon = ColorResizableIcon(16, Color(0xA5, 0xD6, 0xA7))
                    action = ActionListener {
                        println("Test menu item 3 activated")
                    }
                    actionKeyTip = "3"
                }
                separator()
                command {
                    title = mf.format(arrayOf("4"))
                    icon = ColorResizableIcon(16, Color(0xC5, 0xE1, 0xA5))
                    action = ActionListener {
                        println("Test menu item 4 activated")
                    }
                    actionKeyTip = "4"
                }
                command {
                    title = mf.format(arrayOf("5"))
                    icon = ColorResizableIcon(16, Color(0xE6, 0xEE, 0x9C))
                    action = ActionListener {
                        println("Test menu item 5 activated")
                    }
                    actionKeyTip = "5"
                }
            }
            popupMenuCommand.asCommandPopupMenu()
        }
    }

    fun getClipboardBand(): KRibbonBand {
        return ribbonBand {
            title = resourceBundle.getString("Clipboard.textBandTitle")
            icon = Edit_paste.of(16, 16)
            expandCommand {
                keyTip = "Q"
                richTooltip {
                    title = resourceBundle.getString("Clipboard.textBandTitle")
                    description {
                        +resourceBundle.getString("Clipboard.textBandTooltipParagraph1")
                    }
                }
                action = ExpandActionListener()
            }
            collapsedStateKeyTip = "ZC"

            command(RibbonElementPriority.TOP) {
                title = resourceBundle.getString("Paste.text")
                icon = Edit_paste.of(16, 16)
                action = ActionListener { println("Pasted!") }
                actionRichTooltip {
                    title = resourceBundle.getString("Paste.text")
                    description {
                        +resourceBundle.getString("Paste.tooltip.actionParagraph1")
                    }
                }
                popupCallback = getSimplePopupMenu()
                popupRichTooltip {
                    title = resourceBundle.getString("Paste.text")
                    description {
                        +resourceBundle.getString("Paste.tooltip.popupParagraph1")
                    }
                }
                popupKeyTip = "V"
                isTitleClickAction = true
            }

            command(RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("Cut.text")
                icon = Edit_cut.of(16, 16)
                action = ActionListener { println("Cut!") }
                actionRichTooltip {
                    title = resourceBundle.getString("Cut.text")
                    description {
                        +resourceBundle.getString("Cut.tooltip.actionParagraph1")
                    }
                }
                popupCallback = getSimplePopupMenu()
                popupKeyTip = "X"
                isTitleClickAction = true
            }

            command(RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("Copy.text")
                icon = Edit_copy.of(16, 16)
                action = ActionListener { println("Copy!") }
                popupCallback = getSimplePopupMenu()
                popupKeyTip = "C"
                isTitleClickPopup = true
            }

            command(RibbonElementPriority.MEDIUM) {
                title = resourceBundle.getString("Format.text")
                icon = Edit_paste.of(16, 16)
                popupCallback = PopupPanelCallback {
                    val mfGroupTitle = MessageFormat(resourceBundle.getString("PanelStyles.text"))
                    mfGroupTitle.locale = currLocale
                    val mfTooltipTitle = MessageFormat(
                            resourceBundle.getString("PanelStyles.tooltip.textActionTitle"))
                    mfTooltipTitle.locale = currLocale
                    val mfTooltipParagraph = MessageFormat(
                            resourceBundle.getString("PanelStyles.tooltip.textActionParagraph1"))
                    mfTooltipParagraph.locale = currLocale

                    val popupMenuCommand = commandPopupMenu {
                        commandPanel {
                            display {
                                dimension = 32
                                maxButtonColumns = 5
                                maxVisibleButtonRows = 3
                                isShowingGroupTitles = true
                            }

                            for (groupIndex in 0 until 4) {
                                commandGroup {
                                    title = mfGroupTitle.format(arrayOf<Any>(groupIndex))

                                    for (i in 0 until 15) {
                                        command {
                                            icon = DecoratedResizableIcon(Font_x_generic.of(16, 16),
                                                    DecoratedResizableIcon.IconDecorator { component, graphics, x, y, width, height ->
                                                        val g2d = graphics.create() as Graphics2D
                                                        g2d.color = Color.black
                                                        g2d.font = UIManager.getFont("Label.font")
                                                        NeonUtil.installDesktopHints(g2d, component)
                                                        g2d.drawString("" + i, x + 2, y + height - 2)
                                                        g2d.dispose()
                                                    }
                                            )

                                            isToggle = true
                                            action = ActionListener { println("Invoked action on $i") }
                                            actionRichTooltip {
                                                title = mfTooltipTitle.format(arrayOf<Any>(i))
                                                description {
                                                    +mfTooltipParagraph.format(arrayOf<Any>(i))
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            isSingleSelectionMode = true
                        }

                        command {
                            title = resourceBundle.getString("Format.menuSaveSelection.text")
                            icon = ColorResizableIcon(16, Color(0xFB, 0xC0, 0x2D))
                            action = ActionListener { println("Save Selection activated") }
                            actionKeyTip = "SS"
                        }

                        command {
                            title = resourceBundle.getString("Format.menuClearSelection.text")
                            icon = ColorResizableIcon(16, Color(0xFF, 0xA0, 0x00))
                            action = ActionListener { println("Clear Selection activated") }
                            actionKeyTip = "SC"
                        }

                        separator()

                        command {
                            title = resourceBundle.getString("Format.applyStyles.text")
                            icon = ColorResizableIcon(16, Color(0xF5, 0x7C, 0x00))
                            action = ActionListener { println("Apply Styles activated") }
                            actionKeyTip = "SA"
                        }
                    }
                    popupMenuCommand.asCommandPopupMenu()
                }
                popupRichTooltip {
                    title = "Main title that can go over multiple lines of text even exceeding the bigger"
                    description {
                        +"Simple description that can go over multiple lines of text even exceeding the bigger"
                        +"Second paragraph that can be multiline as well to test this feature"
                    }
                    mainIcon = Address_book_new.of(32, 32)
                    footer {
                        +"Multiline footer description to provide a little bit more information on this subject"
                    }
                    footerIcon = Help_browser.of(16, 16)
                }
                popupKeyTip = "FP"
            }

            // This is kind of ugly for now
            resizePolicies {
                +object : ResizePolicySource {
                    override fun getResizePolicy(controlPanel: JBandControlPanel): RibbonBandResizePolicy {
                        return CoreRibbonResizePolicies.Mirror(controlPanel)
                    }
                }
                +object : ResizePolicySource {
                    override fun getResizePolicy(controlPanel: JBandControlPanel): RibbonBandResizePolicy {
                        return CoreRibbonResizePolicies.Mid2Low(controlPanel)
                    }
                }
            }
        }
    }

    fun getPageLayoutTask(): KRibbonTask {
        return ribbonTask {
            title = resourceBundle.getString("PageLayout.textTaskTitle")
            keyTip = "P"

            bands {
                +getClipboardBand()
            }
        }
    }
}

fun main(args: Array<String>) {
    SwingUtilities.invokeLater({
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)

        SubstanceCortex.GlobalScope.setSkin(BusinessSkin())

        val builder = RibbonDemoBuilder()

        val ribbonFrame = ribbonFrame {
            title = builder.resourceBundle.getString("Frame.title")
            applicationIcon = Applications_internet.of(16, 16)

            tasks {
                +builder.getPageLayoutTask()
            }
        }

        val javaRibbonFrame = ribbonFrame.asRibbonFrame()

        javaRibbonFrame.applyComponentOrientation(
                ComponentOrientation.getOrientation(builder.currLocale))
        val r = GraphicsEnvironment.getLocalGraphicsEnvironment().maximumWindowBounds
        javaRibbonFrame.preferredSize = Dimension(r.width, r.height / 2)
        javaRibbonFrame.minimumSize = Dimension(r.width / 10, r.height / 2)
        javaRibbonFrame.pack()
        javaRibbonFrame.setLocation(r.x, r.y)
        javaRibbonFrame.defaultCloseOperation = WindowConstants.DISPOSE_ON_CLOSE

        javaRibbonFrame.setVisible(true)
    })
}
