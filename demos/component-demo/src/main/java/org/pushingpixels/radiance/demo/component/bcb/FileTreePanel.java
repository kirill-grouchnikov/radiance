package org.pushingpixels.radiance.demo.component.bcb;

import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeNode;
import java.awt.*;
import java.io.File;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * @author Kirill Grouchnikov
 */
public class FileTreePanel extends JPanel {
    /**
     * File system view.
     */
    private static FileSystemView fsv = FileSystemView.getFileSystemView();

    /**
     * Creates the file tree panel.
     */
    private FileTreePanel() {
        this.setLayout(new BorderLayout());

        final File[] roots = File.listRoots();
        final FileTreeNode rootTreeNode = new FileTreeNode(roots);
        final JTree tree = new JTree(rootTreeNode);
        tree.setCellRenderer(new FileTreeCellRenderer());
        tree.setRootVisible(false);
        final JScrollPane jsp = new JScrollPane(tree);
        jsp.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.add(jsp, BorderLayout.CENTER);
    }

    /**
     * Renderer for the file tree.
     *
     * @author Kirill Grouchnikov
     */
    private static class FileTreeCellRenderer extends DefaultTreeCellRenderer {
        /**
         * Icon cache to speed the rendering.
         */
        private Map<String, Icon> iconCache = new HashMap<>();

        /**
         * Root name cache to speed the rendering.
         */
        private Map<File, String> rootNameCache = new HashMap<>();

        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel,
                boolean expanded, boolean leaf, int row, boolean hasFocus) {
            FileTreeNode ftn = (FileTreeNode) value;
            File file = ftn.file;
            String filename = "";
            if (file != null) {
                if (ftn.isFileSystemRoot) {
                    // long start = System.currentTimeMillis();
                    filename = this.rootNameCache.get(file);
                    if (filename == null) {
                        filename = fsv.getSystemDisplayName(file);
                        this.rootNameCache.put(file, filename);
                    }
                    // long end = System.currentTimeMillis();
                    // System.out.println(filename + ":" + (end - start));
                } else {
                    filename = file.getName();
                }
            }
            JLabel result = (JLabel) super.getTreeCellRendererComponent(tree, filename, sel,
                    expanded, leaf, row, hasFocus);
            if (file != null) {
                Icon icon = this.iconCache.get(filename);
                if (icon == null) {
                    // System.out.println("Getting icon of " + filename);
                    icon = fsv.getSystemIcon(file);
                    this.iconCache.put(filename, icon);
                }
                result.setIcon(icon);
            }
            return result;
        }
    }

    /**
     * A node in the file tree.
     *
     * @author Kirill Grouchnikov
     */
    private static class FileTreeNode implements TreeNode {
        /**
         * Node file.
         */
        private File file;

        /**
         * Children of the node file.
         */
        private File[] children;

        /**
         * Parent node.
         */
        private TreeNode parent;

        /**
         * Indication whether this node corresponds to a file system root.
         */
        private boolean isFileSystemRoot;

        /**
         * Creates a new file tree node.
         *
         * @param file             Node file
         * @param isFileSystemRoot Indicates whether the file is a file system root.
         * @param parent           Parent node.
         */
        private FileTreeNode(File file, boolean isFileSystemRoot, TreeNode parent) {
            this.file = file;
            this.isFileSystemRoot = isFileSystemRoot;
            this.parent = parent;
            this.children = this.file.listFiles();
            if (this.children == null)
                this.children = new File[0];
        }

        /**
         * Creates a new file tree node.
         *
         * @param children Children files.
         */
        private FileTreeNode(File[] children) {
            this.file = null;
            this.parent = null;
            this.children = children;
        }

        @Override
        public Enumeration<FileTreeNode> children() {
            final int elementCount = this.children.length;
            return new Enumeration<>() {
                int count = 0;

                @Override
                public boolean hasMoreElements() {
                    return this.count < elementCount;
                }

                @Override
                public FileTreeNode nextElement() {
                    if (this.count < elementCount) {
                        return new FileTreeNode(FileTreeNode.this.children[this.count++], false,
                                FileTreeNode.this);
                    }
                    throw new NoSuchElementException("Vector Enumeration");
                }
            };

        }

        @Override
        public boolean getAllowsChildren() {
            return true;
        }

        @Override
        public TreeNode getChildAt(int childIndex) {
            return new FileTreeNode(this.children[childIndex], this.parent == null, this);
        }

        @Override
        public int getChildCount() {
            return this.children.length;
        }

        @Override
        public int getIndex(TreeNode node) {
            FileTreeNode ftn = (FileTreeNode) node;
            for (int i = 0; i < this.children.length; i++) {
                if (ftn.file.equals(this.children[i]))
                    return i;
            }
            return -1;
        }

        @Override
        public TreeNode getParent() {
            return this.parent;
        }

        @Override
        public boolean isLeaf() {
            return (this.getChildCount() == 0);
        }
    }

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin());

            JFrame frame = new JFrame("File tree");
            frame.setIconImage(RadianceLogo.getLogoImage(frame,
                    RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                            RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                            ComponentState.ENABLED)));
            frame.setSize(500, 400);
            frame.setLocationRelativeTo(null);
            frame.add(new FileTreePanel());
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}