/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.plasma.bcb

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import kotlinx.coroutines.withContext
import org.pushingpixels.demo.plasma.RadianceLogo
import org.pushingpixels.flamingo.api.bcb.core.BreadcrumbTreeAdapterSelector
import org.pushingpixels.plasma.bcb.addDelayedPathListener
import org.pushingpixels.substance.api.ComponentState
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.SubstanceSlices
import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer
import org.pushingpixels.substance.api.skin.BusinessSkin
import java.awt.BorderLayout
import java.awt.Component
import java.io.File
import java.util.*
import javax.swing.*
import javax.swing.border.TitledBorder
import javax.swing.filechooser.FileSystemView
import javax.swing.tree.DefaultTreeModel
import javax.swing.tree.TreeNode

/**
 * Extension function for converting a {@link List} to an {@link Enumeration}
 */
fun <T> List<T>.toEnumeration(): Enumeration<T> {
    return object : Enumeration<T> {
        var count = 0

        override fun hasMoreElements(): Boolean {
            return this.count < size
        }

        override fun nextElement(): T {
            if (this.count < size) {
                return get(this.count++)
            }
            throw NoSuchElementException("List enumeration asked for more elements than present")
        }
    }
}

/**
 * A node in the file tree that will be used by the {@link BreadcrumbTreeAdapterSelector}
 */
data class FileTreeNode(val file: File?, val children: Array<File>, val nodeParent: TreeNode?) :
    TreeNode {
    constructor(file: File, parent: TreeNode) : this(file, file.listFiles() ?: arrayOf(), parent)
    constructor(children: Array<File>) : this(null, children, null)

    init {
        children.sortWith(compareBy { it.name.lowercase() })
    }

    override fun children(): Enumeration<FileTreeNode> {
        return children.map { FileTreeNode(it, this) }.toEnumeration()
    }

    override fun getAllowsChildren(): Boolean {
        return true
    }

    override fun getChildAt(childIndex: Int): TreeNode {
        return FileTreeNode(children[childIndex], this)
    }

    override fun getChildCount(): Int {
        return children.size
    }

    override fun getIndex(node: TreeNode): Int {
        val ftn = node as FileTreeNode
        return children.indexOfFirst { it == ftn.file }
    }

    override fun getParent(): TreeNode? {
        return this.nodeParent
    }

    override fun isLeaf(): Boolean {
        val isNotFolder = (this.file != null) && (this.file.isFile)
        return this.childCount == 0 && isNotFolder
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FileTreeNode

        if (file != other.file) return false
        if (!Arrays.equals(children, other.children)) return false
        if (nodeParent != other.nodeParent) return false

        return true
    }

    override fun hashCode(): Int {
        var result = file?.hashCode() ?: 0
        result = 31 * result + Arrays.hashCode(children)
        result = 31 * result + (nodeParent?.hashCode() ?: 0)
        return result
    }
}

/**
 * Model for the file list displayed for the current breadcrumb bar folder selection.
 */
class FileListModel : AbstractListModel<File>() {
    private val files = ArrayList<File>()

    fun add(file: File) {
        files.add(file)
    }

    fun sort() {
        files.sortWith(compareBy({ it.isDirectory }, { it.name.lowercase() }))
    }

    override fun getElementAt(index: Int): File {
        return files[index]
    }

    override fun getSize(): Int {
        return files.size
    }
}

/**
 * Renderer for the file list
 */
class FileListRenderer : SubstanceDefaultListCellRenderer() {
    override fun getListCellRendererComponent(
        list: JList<*>, value: Any?, index: Int,
        isSelected: Boolean, cellHasFocus: Boolean
    ): Component {
        val file = value as File?
        this.icon = FileSystemView.getFileSystemView().getSystemIcon(file)
        this.text = FileSystemView.getFileSystemView().getSystemDisplayName(file)
        return this
    }
}

fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        JFrame.setDefaultLookAndFeelDecorated(true)
        SubstanceCortex.GlobalScope.setSkin(BusinessSkin())

        val frame = JFrame()

        val rootTreeNode = FileTreeNode(File.listRoots())
        val bar: BreadcrumbTreeAdapterSelector<FileTreeNode> =
            BreadcrumbTreeAdapterSelector(DefaultTreeModel(rootTreeNode),
                object : BreadcrumbTreeAdapterSelector.TreeAdapter<FileTreeNode> {
                    override fun toString(node: FileTreeNode): String {
                        if (node.file == null) {
                            return "Computer"
                        }
                        var result =
                            FileSystemView.getFileSystemView().getSystemDisplayName(node.file)
                        if (result.isEmpty()) {
                            result = node.file.absolutePath
                        }
                        return result
                    }

                    override fun getIcon(node: FileTreeNode): Icon? {
                        return if (node.file == null) null else FileSystemView.getFileSystemView()
                            .getSystemIcon(
                                node.file
                            )
                    }
                }, false
            )


        val fileList = JList<File>()
        fileList.cellRenderer = FileListRenderer()

        bar.model.addDelayedPathListener { event ->
            val newPath = event.source.items
            println("New path is ")
            for (item in newPath) {
                if (item.data.file == null) {
                    continue
                }
                println("\t" + item.data.file!!.name)
            }

            if (newPath.size > 0) {
                val model = FileListModel()

                val leafs = withContext(Dispatchers.Default) {
                    bar.callback.getLeafs(newPath)
                }

                for (leaf in leafs) {
                    model.add(leaf.value.file!!)
                }
                model.sort()
                fileList.model = model
            }
        }

        frame.layout = BorderLayout()
        frame.add(bar, BorderLayout.NORTH)

        val fileListScrollPane = JScrollPane(fileList)
        fileListScrollPane.border = TitledBorder("File list")

        frame.add(fileListScrollPane, BorderLayout.CENTER)

        frame.iconImage = RadianceLogo.getLogoImage(
            frame,
            SubstanceCortex.GlobalScope.getCurrentSkin()!!.getColorScheme(
                SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                SubstanceSlices.ColorSchemeAssociationKind.FILL,
                ComponentState.ENABLED
            )
        )
        frame.setSize(700, 400)
        frame.setLocation(300, 100)
        frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}
