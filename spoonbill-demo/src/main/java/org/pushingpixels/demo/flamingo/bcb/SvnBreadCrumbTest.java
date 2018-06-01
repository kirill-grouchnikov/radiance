/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.demo.flamingo.MessageListDialog;
import org.pushingpixels.demo.flamingo.ExplorerFileViewPanel;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbBarModel;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbItem;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbPathEvent;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.spoonbill.svn.BreadcrumbSvnSelector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SvnBreadCrumbTest extends JFrame {
    private ExplorerFileViewPanel<String> filePanel;

    private BreadcrumbSvnSelector bar;

    protected JComboBox svnCombo;

    protected static class SvnRepoInfo {
        public String name;

        public String url;

        public String user;

        public String password;

        public SvnRepoInfo(String name, String url, String user, String password) {
            this.name = name;
            this.url = url;
            this.user = user;
            this.password = password;
        }
    }

    public class SvnComboListModel extends DefaultComboBoxModel {
        private List<SvnRepoInfo> svnRepoList;

        public SvnComboListModel() {
            this.svnRepoList = new ArrayList<SvnRepoInfo>();
        }

        @Override
        public Object getElementAt(int index) {
            return this.svnRepoList.get(index);
        }

        @Override
        public int getSize() {
            return this.svnRepoList.size();
        }

        public void addElement(SvnRepoInfo svnRepoInfo) {
            int index = this.svnRepoList.size();
            this.svnRepoList.add(svnRepoInfo);
            this.fireContentsChanged(this, index, index);
        }
    }

    public SvnBreadCrumbTest() {
        super("BreadCrumb test");

        this.bar = new BreadcrumbSvnSelector();
        this.bar.setThrowsExceptions(true);
        this.bar.addExceptionHandler((Throwable t) -> MessageListDialog
                .showMessageDialog(SvnBreadCrumbTest.this, "Error", t));

        SvnComboListModel svnComboModel = new SvnComboListModel();
        svnComboModel.addElement(new SvnRepoInfo("SVNKit", "http://svn.svnkit.com/repos/svnkit",
                "anonymous", "anonymous"));
        svnComboModel.addElement(new SvnRepoInfo("KDE", "svn://anonsvn.kde.org/home/kde/trunk",
                "anonymous", "anonymous"));
        svnComboModel.addElement(new SvnRepoInfo("Apache", "http://svn.apache.org/repos/asf",
                "anonymous", "anonymous"));

        svnCombo = new JComboBox(svnComboModel);
        svnCombo.setRenderer(new DefaultListCellRenderer() {
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

        // "http://svn.svnkit.com/repos/svnkit", "anonymous", "anonymous");
        this.bar.getModel()
                .addPathListener((BreadcrumbPathEvent event) -> SwingUtilities.invokeLater(() -> {
                    final List<BreadcrumbItem<String>> newPath = bar.getModel().getItems();
                    System.out.println("New path is ");
                    for (BreadcrumbItem<String> item : newPath) {
                        System.out.println("\t" + item.getData());
                    }

                    if (newPath.size() > 0) {
                        SwingWorker<List<StringValuePair<String>>, Void> worker = new SwingWorker<List<StringValuePair<String>>, Void>() {
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

        JToolBar toolbar = new JToolBar();
        toolbar.setLayout(new BorderLayout(3, 0));
        toolbar.setFloatable(false);

        toolbar.add(svnCombo, BorderLayout.WEST);
        toolbar.add(bar, BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(toolbar, BorderLayout.NORTH);

        this.filePanel = new ExplorerFileViewPanel<String>(bar, CommandButtonDisplayState.MEDIUM,
                null) {
            @Override
            protected void configureCommandButton(
                    org.pushingpixels.flamingo.api.common.AbstractFileViewPanel.Leaf leaf,
                    final JCommandButton button, ResizableIcon icon) {
                long size = (Long) leaf.getLeafProp("size");
                Date date = (Date) leaf.getLeafProp("date");
                SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
                button.setExtraText(size + " bytes, " + sdf.format(date));

                button.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        process(e);
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        process(e);
                    }

                    protected void process(MouseEvent me) {
                        JPopupMenu popupMenu = new JPopupMenu();
                        JMenuItem showContents = new JMenuItem("Show file contents");
                        showContents.addActionListener(
                                (ActionEvent ae) -> SwingUtilities.invokeLater(() -> {
                                    SwingWorker<InputStream, Void> worker = new SwingWorker<InputStream, Void>() {
                                        @Override
                                        protected InputStream doInBackground() throws Exception {
                                            String leafName = button.getText();
                                            BreadcrumbBarModel<String> model = bar.getModel();
                                            String path = model.getItem(model.getItemCount() - 1)
                                                    .getData();
                                            return bar.getCallback()
                                                    .getLeafContent(path + "/" + leafName);
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
                                                    if (line == null)
                                                        break;
                                                    textArea.append(line + "\n");
                                                }
                                                textArea.setCaretPosition(0);
                                                JDialog contDialog = new JDialog(
                                                        SvnBreadCrumbTest.this, false);
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
                        popupMenu.add(showContents);
                        popupMenu.show(button, me.getX(), me.getY());
                    }
                });
            }
        };
        JScrollPane fileListScrollPane = new JScrollPane(this.filePanel);
        this.add(fileListScrollPane, BorderLayout.CENTER);

    }

    /**
     * Main method for testing.
     * 
     * @param args
     *            Ignored.
     */
    public static void main(String... args) {
        try {
            System.setProperty("java.net.useSystemProxies", "true");
        } catch (SecurityException e) {
        }
        SwingUtilities.invokeLater(() -> {
            SvnBreadCrumbTest test = new SvnBreadCrumbTest();
            test.setSize(700, 400);
            test.setLocation(300, 100);
            test.setVisible(true);
            test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
