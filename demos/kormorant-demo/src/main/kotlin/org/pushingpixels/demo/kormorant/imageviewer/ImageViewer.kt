package org.pushingpixels.demo.kormorant.imageviewer

import kotlinx.coroutines.experimental.DefaultDispatcher
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.swing.Swing
import kotlinx.coroutines.experimental.withContext
import org.pushingpixels.demo.kormorant.RadianceLogo
import org.pushingpixels.flamingo.api.bcb.BreadcrumbPathEvent
import org.pushingpixels.flamingo.api.bcb.core.BreadcrumbFileSelector
import org.pushingpixels.flamingo.api.common.AbstractFileViewPanel
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState
import org.pushingpixels.flamingo.api.common.JCommandButton
import org.pushingpixels.flamingo.api.common.StringValuePair
import org.pushingpixels.flamingo.api.common.icon.ImageWrapperResizableIcon
import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.substance.api.ComponentState
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.SubstanceSlices
import org.pushingpixels.substance.api.skin.BusinessSkin
import java.awt.BorderLayout
import java.awt.Dimension
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import javax.swing.JFrame
import javax.swing.JScrollPane
import javax.swing.JSlider
import javax.swing.WindowConstants

fun main(args: Array<String>) {
    launch(Swing) {
        JFrame.setDefaultLookAndFeelDecorated(true)
        SubstanceCortex.GlobalScope.setSkin(BusinessSkin())

        val frame = JFrame("Image Viewer")

        frame.layout = BorderLayout()
        val initialSize = 100

        val bar = BreadcrumbFileSelector()
        val fileViewPanel = object : AbstractFileViewPanel<File>(initialSize) {
            override fun configureCommandButton(leaf: AbstractFileViewPanel.Leaf,
                    button: JCommandButton, icon: ResizableIcon) {
            }

            override fun getLeafContent(leaf: File): InputStream? {
                return try {
                    FileInputStream(leaf)
                } catch (exc: Exception) {
                    exc.printStackTrace()
                    null
                }
            }

            override fun getResizableIcon(leaf: AbstractFileViewPanel.Leaf,
                    stream: InputStream, state: CommandButtonDisplayState,
                    dimension: Dimension): ResizableIcon {
                var dimensionForIcon = dimension
                val prefSize = state.preferredIconSize
                if (prefSize > 0) {
                    dimensionForIcon = Dimension(prefSize, prefSize)
                }
                return ImageWrapperResizableIcon.getIcon(stream, dimensionForIcon)
            }

            override fun toShowFile(pair: StringValuePair<File>): Boolean {
                val name = pair.key.toLowerCase()
                return name.endsWith(".jpeg") || name.endsWith(".jpg") || name.endsWith(".gif")
                        || name.endsWith(".png") || name.endsWith(".bmp")
            }
        }

        bar.model.addPathListener { event: BreadcrumbPathEvent<File> ->
            launch(Swing) {
                val newPath = event.source.items
                println("New path is ")
                for (item in newPath) {
                    println("\t" + item.data.absolutePath)
                }

                if (newPath.size > 0) {
                    fileViewPanel.setFolder(withContext(DefaultDispatcher) {
                        bar.callback.getLeafs(newPath)
                    })
                }
            }
        }

        frame.add(bar, BorderLayout.NORTH)

        val jsp = JScrollPane(fileViewPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS)
        frame.add(jsp, BorderLayout.CENTER)

        val iconSizeSlider = JSlider()
        iconSizeSlider.minimum = 50
        iconSizeSlider.maximum = 200
        iconSizeSlider.snapToTicks = true
        iconSizeSlider.paintLabels = true
        iconSizeSlider.paintTicks = true
        iconSizeSlider.majorTickSpacing = 50
        iconSizeSlider.minorTickSpacing = 10
        iconSizeSlider.value = initialSize

        var currIconSize = initialSize
        iconSizeSlider.addChangeListener {
            if (!iconSizeSlider.model.valueIsAdjusting) {
                val newValue = iconSizeSlider.value
                if (newValue != currIconSize) {
                    currIconSize = newValue
                    launch(Swing) {
                        fileViewPanel.setIconDimension(currIconSize)
                        frame.invalidate()
                        frame.doLayout()
                    }
                }
            }
        }
        frame.add(iconSizeSlider, BorderLayout.SOUTH)

        frame.iconImage = RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin()!!.getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED))
        frame.setSize(550, 400)
        frame.setLocationRelativeTo(null)
        frame.isVisible = true
        frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
    }
}
