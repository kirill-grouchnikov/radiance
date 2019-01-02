/*
 * Copyright (c) 2005-2019 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.flamingo.bcb;

import org.pushingpixels.demo.flamingo.*;
import org.pushingpixels.flamingo.api.bcb.*;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.spoonbill.svn.BreadcrumbSvnSelector;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class SvnBreadCrumbTest extends JFrame {
    private ExplorerFileViewPanel<String> filePanel;

    private BreadcrumbSvnSelector bar;

    private JComboBox<SvnRepoInfo> svnCombo;

    private static class SvnRepoInfo {
        private String name;

        private String url;

        private String user;

        private String password;

        private SvnRepoInfo(String name, String url, String user, String password) {
            this.name = name;
            this.url = url;
            this.user = user;
            this.password = password;
        }
    }

    public class SvnComboListModel extends DefaultComboBoxModel<SvnRepoInfo> {
        private List<SvnRepoInfo> svnRepoList;

        private SvnComboListModel() {
            this.svnRepoList = new ArrayList<>();
        }

        @Override
        public SvnRepoInfo getElementAt(int index) {
            return this.svnRepoList.get(index);
        }

        @Override
        public int getSize() {
            return this.svnRepoList.size();
        }

        private void add(SvnRepoInfo svnRepoInfo) {
            int index = this.svnRepoList.size();
            this.svnRepoList.add(svnRepoInfo);
            this.fireContentsChanged(this, index, index);
        }
    }

    private SvnBreadCrumbTest() {
        super("BreadCrumb test");

        this.bar = new BreadcrumbSvnSelector();
        this.bar.setThrowsExceptions(true);
        this.bar.addExceptionHandler((Throwable t) -> MessageListDialog
                .showMessageDialog(SvnBreadCrumbTest.this, "Error", t));

        SvnComboListModel svnComboModel = new SvnComboListModel();
        svnComboModel.add(new SvnRepoInfo("SVNKit", "http://svn.svnkit.com/repos/svnkit",
                "anonymous", "anonymous"));
        svnComboModel.add(new SvnRepoInfo("KDE", "svn://anonsvn.kde.org/home/kde/trunk",
                "anonymous", "anonymous"));
        svnComboModel.add(new SvnRepoInfo("Apache", "http://svn.apache.org/repos/asf",
                "anonymous", "anonymous"));

        svnCombo = new JComboBox<>(svnComboModel);
        svnCombo.setRenderer(new SubstanceDefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                SvnRepoInfo repo = (SvnRepoInfo) value;
                String name = (repo == null) ? "" : repo.name;
                return super.getListCellRendererComponent(list, name, index, isSelected,
                        cellHasFocus);
            }
        });
        svnCombo.addItemListener((ItemEvent e) -> SwingUtilities.invokeLater(() -> {
            SvnRepoInfo selected = (SvnRepoInfo) svnCombo.getSelectedItem();
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            bar.setConnectionParams(selected.url, selected.user, selected.password.toCharArray(),
                    true);
            setCursor(Cursor.getDefaultCursor());
        }));

        this.bar.getModel()
                .addPathListener(
                        (BreadcrumbPathEvent<String> event) -> SwingUtilities.invokeLater(() -> {
                            final List<BreadcrumbItem<String>> newPath =
                                    event.getSource().getItems();
                            System.out.println("New path is ");
                            for (BreadcrumbItem<String> item : newPath) {
                                System.out.println("\t" + item.getData());
                            }

                            if (newPath.size() > 0) {
                                SwingWorker<List<StringValuePair<String>>, Void> worker =
                                        new SwingWorker<List<StringValuePair<String>>, Void>() {
                                            @Override
                                            protected List<StringValuePair<String>> doInBackground() {
                                                return bar.getCallback().getLeafs(newPath);
                                            }

                                            @Override
                                            protected void done() {
                                                try {
                                                    List<StringValuePair<String>> leafs = get();
                                                    filePanel.setFolder(leafs);
                                                } catch (Exception exc) {
                                                }
                                            }
                                        };
                                worker.execute();
                            }
                        }));

        JPanel toolbar = new JPanel(new BorderLayout(3, 0));
        SubstanceCortex.ComponentOrParentChainScope.setDecorationType(toolbar,
                SubstanceSlices.DecorationAreaType.HEADER);
        toolbar.add(svnCombo, BorderLayout.WEST);
        toolbar.add(bar, BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(toolbar, BorderLayout.NORTH);

        this.filePanel = new ExplorerFileViewPanel<String>(bar, CommandButtonPresentationState.MEDIUM) {
            @Override
            protected void configureCommand(Leaf leaf, Command command,
                    ResizableIcon icon) {
                long size = (Long) leaf.getLeafProp("size");
                Date date = (Date) leaf.getLeafProp("date");
                SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
                command.setExtraText(size + " bytes, " + sdf.format(date));

                command.setAction(
                        (CommandActionEvent cae) -> SwingUtilities.invokeLater(() -> {
                            SwingWorker<InputStream, Void> worker = new SwingWorker<InputStream,
                                    Void>() {
                                @Override
                                protected InputStream doInBackground() throws Exception {
                                    String leafName = command.getText();
                                    BreadcrumbBarModel<String> model = bar.getModel();
                                    String path = model.getItem(model.getItemCount() - 1).getData();
                                    return bar.getCallback().getLeafContent(path + "/" + leafName);
                                }

                                @Override
                                protected void done() {
                                    try {
                                        InputStream is = get();
                                        BufferedReader reader = new BufferedReader(
                                                new InputStreamReader(is));
                                        JTextArea textArea = new JTextArea();
                                        while (true) {
                                            String line = reader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            textArea.append(line + "\n");
                                        }
                                        textArea.setCaretPosition(0);
                                        JDialog contDialog = new JDialog(SvnBreadCrumbTest.this,
                                                false);
                                        contDialog.add(new JScrollPane(textArea),
                                                BorderLayout.CENTER);
                                        contDialog.setSize(500, 400);
                                        contDialog.setLocationRelativeTo(null);
                                        contDialog.setVisible(true);
                                    } catch (Exception exc) {
                                    }
                                }
                            };
                            worker.execute();
                        }));
            }
        };
        JScrollPane fileListScrollPane = new JScrollPane(this.filePanel);
        this.add(fileListScrollPane, BorderLayout.CENTER);

    }

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String... args) {
        try {
            System.setProperty("java.net.useSystemProxies", "true");
        } catch (SecurityException e) {
        }
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());
            SvnBreadCrumbTest test = new SvnBreadCrumbTest();
            test.setSize(700, 400);
            test.setLocation(300, 100);
            test.setVisible(true);
            test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
