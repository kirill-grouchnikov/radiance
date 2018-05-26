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
import org.pushingpixels.demo.flamingo.common.ExplorerFileViewPanel;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbItem;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbPathEvent;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.spoonbill.svn.BreadcrumbMultiSvnSelector;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class MultiSvnBreadCrumbTest extends JFrame {
    private ExplorerFileViewPanel<String> filePanel;

    private BreadcrumbMultiSvnSelector bar;

    public static class SvnFolderListModel extends AbstractListModel {
        private ArrayList<String> entries = new ArrayList<String>();

        public void add(String entry) {
            entries.add(entry);
        }

        public void sort() {
            Collections.sort(entries);
        }

        public Object getElementAt(int index) {
            return entries.get(index);
        }

        public int getSize() {
            return entries.size();
        }
    }

    public MultiSvnBreadCrumbTest() {
        super("BreadCrumb test");

        this.bar = new BreadcrumbMultiSvnSelector(
                new BreadcrumbMultiSvnSelector.SvnRepositoryInfo("SVNKit",
                        "http://svn.svnkit.com/repos/svnkit", "anonymous",
                        "anonymous".toCharArray()),
                new BreadcrumbMultiSvnSelector.SvnRepositoryInfo("KDE",
                        "svn://anonsvn.kde.org/home/kde/trunk", "anonymous",
                        "anonymous".toCharArray()),
                new BreadcrumbMultiSvnSelector.SvnRepositoryInfo("Apache",
                        "http://svn.apache.org/repos/asf", "anonymous", "anonymous".toCharArray()));
        this.bar.setThrowsExceptions(true);
        this.bar.addExceptionHandler((Throwable t) -> MessageListDialog
                .showMessageDialog(MultiSvnBreadCrumbTest.this, "Error", t));

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
                                    MessageListDialog.showMessageDialog(MultiSvnBreadCrumbTest.this,
                                            exc.getMessage(), exc);
                                }
                            }
                        };
                        worker.execute();
                    }
                }));

        JToolBar toolbar = new JToolBar();
        toolbar.setLayout(new BorderLayout(3, 0));
        toolbar.setFloatable(false);

        toolbar.add(bar, BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(toolbar, BorderLayout.NORTH);

        this.filePanel = new ExplorerFileViewPanel<String>(bar, CommandButtonDisplayState.MEDIUM,
                null) {
            @Override
            protected void configureCommandButton(
                    org.pushingpixels.flamingo.api.common.AbstractFileViewPanel.Leaf leaf,
                    JCommandButton button, ResizableIcon icon) {
                long size = (Long) leaf.getLeafProp("size");
                Date date = (Date) leaf.getLeafProp("date");
                SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
                button.setExtraText(size + " bytes, " + sdf.format(date));
            }
        };
        this.filePanel.setUseNativeIcons(true);
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
            MultiSvnBreadCrumbTest test = new MultiSvnBreadCrumbTest();
            test.setSize(550, 385);
            test.setLocationRelativeTo(null);
            test.setVisible(true);
            test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
