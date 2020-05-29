/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.lightbeam;

import org.pushingpixels.lightbeam.panels.*;

import javax.management.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.management.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;

public class DynamicPerformanceSuite {
    private ThreadMXBean threadBean;

    private long edtThreadId;

    public class ComponentInfo {
        public Component tabComponent;

        public List<PerformanceScenario> scenarios;

        public ComponentInfo(Component tabComponent, List<PerformanceScenario> scenarios) {
            super();
            this.tabComponent = tabComponent;
            this.scenarios = scenarios;
        }
    }

    Map<String, ComponentInfo> scenarios;

    JTabbedPane tabs;

    private JFrame frame;

    boolean isCancelled;

    private JButton cancelButton;

    private JButton startButton;

    private List<ScenarioTimesInfo> scenarioTimes;

    public static class ScenarioTimesInfo {
        public String tabTitle;

        public String scenarioName;

        public List<Long> times;

        public ScenarioTimesInfo(String tabTitle, String scenarioName) {
            this.tabTitle = tabTitle;
            this.scenarioName = scenarioName;
            this.times = new ArrayList<Long>();
        }
    }

    public DynamicPerformanceSuite() {
        this.scenarios = new TreeMap<>();
        this.tabs = new JTabbedPane();

        try {
            MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            ObjectName objName = new ObjectName(ManagementFactory.THREAD_MXBEAN_NAME);
            Set<ObjectName> mbeans = mbeanServer.queryNames(objName, null);
            for (ObjectName name : mbeans) {
                threadBean = ManagementFactory.newPlatformMXBeanProxy(mbeanServer, name.toString(),
                        ThreadMXBean.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        long threadIds[] = threadBean.getAllThreadIds();
        for (long threadId : threadIds) {
            ThreadInfo threadInfo = threadBean.getThreadInfo(threadId, Integer.MAX_VALUE);
            if (threadInfo.getThreadName().startsWith("AWT-EventQueue")) {
                edtThreadId = threadId;
            }
        }

        this.scenarioTimes = new ArrayList<>();
    }

    public void initialize() {
        this.frame = new JFrame("Dynamic performance suite");

        // The empty panel is added to the tabbed pane and set as selected for the menubar scenario
        // so that we measure how much time it takes to paint "just" the selected menu path
        JPanel emptyPanel = new JPanel();
        this.tabs.addTab("Empty", emptyPanel);

        ButtonsPanel buttonsPanel = new ButtonsPanel();
        this.scanAndAddTab("Buttons", buttonsPanel);

        CombosPanel combosPanel = new CombosPanel();
        this.scanAndAddTab("Combos", combosPanel);

        TablePanel tablePanel = new TablePanel();
        this.scanAndAddTab("Table", tablePanel);

        ListPanel listPanel = new ListPanel();
        this.scanAndAddTab("List", listPanel);

        SliderPanel slidersPanel = new SliderPanel();
        this.scanAndAddTab("Sliders", slidersPanel);

        ProgressBarPanel progressBarsPanel = new ProgressBarPanel();
        this.scanAndAddTab("Progress bars", progressBarsPanel);

        TextFieldsPanel textFieldsPanel = new TextFieldsPanel();
        this.scanAndAddTab("Text fields", textFieldsPanel);

        TextAreasPanel textAreasPanel = new TextAreasPanel();
        this.scanAndAddTab("Text areas", textAreasPanel);

        TabsPanel tabsPanel = new TabsPanel();
        this.scanAndAddTab("Tabs", tabsPanel);

        BigTextAreaPanel bigTextAreaPanel = new BigTextAreaPanel();
        this.scanAndAddTab("Text area", bigTextAreaPanel);

        TreePanel treePanel = new TreePanel();
        this.scanAndAddTab("Tree", treePanel);

        SpinnerPanel spinnersPanel = new SpinnerPanel();
        this.scanAndAddTab("Spinners", spinnersPanel);

        JMenuBar menuBar = new LightbeamMenuBar();
        this.frame.setJMenuBar(menuBar);
        this.scan("Menu bar", menuBar);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        cancelButton = new JButton("cancel");
        cancelButton.addActionListener((ActionEvent e) -> isCancelled = true);

        startButton = new JButton("start");
        startButton.addActionListener((ActionEvent e) -> {
            startButton.setEnabled(false);
            cancelButton.setEnabled(true);
            Runnable runnable = () -> runSingleRound(false, null);

            Executors.newCachedThreadPool().execute(runnable);
        });
        cancelButton.setEnabled(false);
        controls.add(startButton);
        controls.add(cancelButton);

        this.frame.add(this.tabs, BorderLayout.CENTER);
        this.frame.add(controls, BorderLayout.SOUTH);
        this.frame.setSize(860, 600);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setVisible(true);
    }

    private void runSingleRound(boolean toTime, String specificScenarioId) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>> START >>>>>>>>>>>>>>>>>>>>>");
        isCancelled = false;
        long total = 0;
        for (final Map.Entry<String, ComponentInfo> scenarioEntry : scenarios.entrySet()) {
            if (isCancelled)
                break;

            String tabTitle = scenarioEntry.getKey();
            final Component tabComponent = scenarioEntry.getValue().tabComponent;
            List<PerformanceScenario> scenarios = scenarioEntry.getValue().scenarios;
            for (final PerformanceScenario scenario : scenarios) {
                if (specificScenarioId != null) {
                    if (!specificScenarioId.equals(scenario.getName()))
                        continue;
                }

                // System.out.println("Running "
                // + scenario.getName());

                final boolean isTabPanel = (tabs.indexOfComponent(tabComponent) >= 0);
                try {
                    // must run scenario setup on EDT since most probably it involves UI-related operations
                    SwingUtilities.invokeAndWait(() -> {
                        tabs.setVisible(isTabPanel);
                        if (!isTabPanel) {
                            tabs.setSelectedIndex(0);
                        } else {
                            tabs.setSelectedComponent(tabComponent);
                        }
                        scenario.setup();
                    });
                } catch (Exception exc) {
                    exc.printStackTrace();
                    System.exit(1);
                }

                final int iterationCount = scenario.getIterationCount();
                final CountDownLatch latch = new CountDownLatch(1);
                long start = System.nanoTime();

                long startEdtUser = threadBean.getThreadUserTime(edtThreadId);
                long startEdtCPU = threadBean.getThreadCpuTime(edtThreadId);

                SwingWorker<Void, Integer> worker = new SwingWorker<>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        // System.out
                        // .println("Started working");
                        for (int i = 0; i < iterationCount; i++) {
                            this.publish(i);
                        }
                        return null;
                    }

                    @Override
                    protected void process(List<Integer> chunks) {
                        // System.out.println("Running "
                        // + chunks.size());
                        for (int chunk : chunks) {
                            if (!isCancelled)
                                scenario.runSingleIteration(chunk);
                        }
                    }

                    @Override
                    protected void done() {
                        // System.out.println("Done");
                        latch.countDown();
                    }
                };
                worker.execute();

                try {
                    latch.await();
                } catch (InterruptedException ie) {
                }

                long end = System.nanoTime();
                long time = end - start;

                long endEdtUser = threadBean.getThreadUserTime(edtThreadId);
                long endEdtCPU = threadBean.getThreadCpuTime(edtThreadId);

                long edtUserTime = endEdtUser - startEdtUser;
                long edtCPUTime = endEdtCPU - startEdtCPU;

                try {
                    SwingUtilities.invokeAndWait(scenario::tearDown);
                } catch (Exception exc) {
                    exc.printStackTrace();
                    System.exit(1);
                }

                StringBuilder sbKey = new StringBuilder();
                Formatter keyFormatter = new Formatter(sbKey, Locale.US);
                keyFormatter.format("%1$15s : %2$s", tabTitle, scenario.getName());

                StringBuilder sb = new StringBuilder();
                Formatter formatter = new Formatter(sb, Locale.US);
                formatter.format("%1$4d [cpu %2$4d / usr %3$4d]", time / 1000000,
                        edtCPUTime / 1000000, edtUserTime / 1000000);
                System.out.println(sb.toString() + keyFormatter.toString());
                keyFormatter.close();
                formatter.close();
                total += time;

                if (toTime) {
                    getTimes(tabTitle, scenario.getName()).times.add(time / 1000000);
                }

            }
        }
        System.out.println("\n" + total / 1000000 + " total");
        startButton.setEnabled(true);
        cancelButton.setEnabled(false);
        System.out.println(">>>>>>>>>>>>>>>>>>>>> END >>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);

            final DynamicPerformanceSuite suite = new DynamicPerformanceSuite();
            suite.initialize();

            if (args.length > 0) {
                Runnable auto = () -> {
                    int loopCount = Integer.parseInt(args[0]);
                    String specificScenarioId = null;
                    if (args.length == 2) {
                        specificScenarioId = args[1];
                    }
                    int warmups = 5;
                    for (int i = 0; i < loopCount + warmups; i++) {
                        suite.runSingleRound(i >= warmups, specificScenarioId);
                    }
                    long totalMin = 0;
                    for (ScenarioTimesInfo timesInfo : suite.scenarioTimes) {
                        List<Long> times = timesInfo.times;
                        long avg = 0;
                        for (long time : times) {
                            avg += time;
                        }
                        avg /= times.size();
                        long min = times.get(0);
                        for (long time : times) {
                            min = Math.min(min, time);
                        }
                        long max = times.get(0);
                        for (long time : times) {
                            max = Math.max(max, time);
                        }
                        double deviance = 0;
                        for (long time : times) {
                            deviance += (time - avg) * (time - avg);
                        }
                        deviance = Math.sqrt(deviance / times.size()) / avg;

                        StringBuilder sb = new StringBuilder();
                        Formatter formatter = new Formatter(sb, Locale.US);
                        formatter.format(
                                "avg %1$5d, min %2$5d, max %3$5d, dev %4$4.2f %5$15s : %6$s", avg,
                                min, max, deviance, timesInfo.tabTitle, timesInfo.scenarioName);
                        formatter.close();
                        System.out.println(sb.toString());
                        totalMin += min;
                    }
                    System.out.println("\n" + totalMin + " totalMin");

                    System.exit(0);
                };
                Executors.newCachedThreadPool().execute(auto);
            }
        });
    }

    private void scan(String title, Component comp) {
        Class<?> compClass = comp.getClass();
        List<PerformanceScenario> scenarioList = new LinkedList<>();
        ComponentInfo componentInfo = new ComponentInfo(comp, scenarioList);
        scenarios.put(title, componentInfo);
        for (Method m : compClass.getDeclaredMethods()) {
            // check annotation
            if (m.getAnnotation(PerformanceScenarioParticipant.class) != null) {
                // check return type and parameters
                if ((m.getReturnType() == PerformanceScenario.class)
                        && (m.getParameterTypes().length == 0)) {
                    try {
                        PerformanceScenario scenario = (PerformanceScenario) m.invoke(comp);
                        componentInfo.scenarios.add(scenario);
                    } catch (Exception exc) {
                    }
                }
            }
        }
        componentInfo.scenarios.sort(Comparator.comparing(PerformanceScenario::getName));
    }

    private void scanAndAddTab(String tabTitle, Component tabComp) {
        this.scan(tabTitle, tabComp);
        this.tabs.addTab(tabTitle, tabComp);
    }

    private ScenarioTimesInfo getTimes(String tabTitle, String scenarioName) {
        for (ScenarioTimesInfo sti : this.scenarioTimes) {
            if (tabTitle.equals(sti.tabTitle) && (scenarioName.equals(sti.scenarioName)))
                return sti;
        }
        ScenarioTimesInfo sti = new ScenarioTimesInfo(tabTitle, scenarioName);
        this.scenarioTimes.add(sti);
        return sti;
    }
}
