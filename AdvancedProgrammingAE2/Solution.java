package com.company.javaRelearn.AdvancedProgrammingAE2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution implements CommandRunner {
    private Thread thread;
    private Long N;
    private ThreadGroup threadGroup;
    private SlowCalculator c;
    private static Map<Thread,Long> map = new HashMap<Thread, Long>();
    private static Map<SlowCalculator,Long> objectMap = new HashMap<SlowCalculator,Long>();
    private static int index = 0;

    public Solution() {}

    @Override
    public String runCommand(String command) {
        try {
            String command1 = divideCommand(command);
            if (command1.equals("start")) {
                String temp = divideN(command);
                if (temp.contains(".")) {
                    return "Invalid command";
                } else {
                    N = Long.parseLong(divideN(command));
                    c = new SlowCalculator(N);
                    thread = new Thread(c);
                    c.setThread(thread);
                    map.put(thread, N);
                    objectMap.put(c, N);
                    thread.start();
                    return "Started " + N;
                }
            }
            if (command1.equals("running")) {
                threadGroup = Thread.currentThread().getThreadGroup();
                int number = threadGroup.activeCount();
                Thread[] activateThreads = new Thread[number];
                threadGroup.enumerate(activateThreads);

                for (int i = 0; i < activateThreads.length; i++) {
                    if (activateThreads[i].getName().contains("Thread")) {
                        index = i;
                        break;
                    } else {
                        index = activateThreads.length;
                    }
                }

                String output = "";
                output += (number - index);
                output += " calculations running: ";
                for (int i = index; i < number; i++) {
                    output += map.get(activateThreads[i]);
                    output += " ";
                }
                return output;
            }
            //static问题
            if (command1.equals("cancel")) {
                String temp = divideN(command);
                if (temp.contains(".")) {
                    return "Invalid command";
                } else {
                    threadGroup = Thread.currentThread().getThreadGroup();
                    int number = threadGroup.activeCount();
                    Thread[] activateThreads = new Thread[number];
                    threadGroup.enumerate(activateThreads);

                    int index = 0;
                    for (int i = 0; i < activateThreads.length; i++) {
                        if (activateThreads[i].getName().contains("Thread")) {
                            index = i;
                            break;
                        } else {
                            index = activateThreads.length;
                        }
                    }

                    N = Long.parseLong(divideN(command));
                    List<Thread> result = findWithN(map, N);
                    List<SlowCalculator> result1 = findWithN(objectMap, N);
                    if (result.isEmpty()) {
                        return "";
                    }
                    if (result1.get(0).getResult1() == -1) {
                        for (Thread thread : result) {
                            for (int i = index; i < number; i++) {
                                if (thread.getName().equals(activateThreads[i].getName())) {
                                    activateThreads[i].interrupt();
                                    map.remove(activateThreads[i]);
                                    objectMap.remove(result1.get(0));
                                }
                            }
                        }
                        return "Cancelled " + N;
                    } else {
                        return "";
                    }
                }
            }
            if (command1.equals("get")) {
                String temp = divideN(command);
                if (temp.contains(".")) {
                    return "Invalid command";
                } else {
                    N = Long.parseLong(divideN(command));
                    List<SlowCalculator> result = findWithN(objectMap, N);
                    if (result.get(0).getResult1() == -1) {
                        return "calculating";
                    } else {
                        return "result is " + result.get(0).getResult1();
                    }
                }
            }
            if (command1.equals("finish")) {
                while (true) {
                    boolean judge = true;
                    for (SlowCalculator s : objectMap.keySet()) {
                        if (s.getResult1() == -1) {
                            judge = false;
                            break;
                        }
                    }
                    if (judge) {
                        return "Finished";
                    }
                }
            }
            if (command1.equals("abort")) {
                threadGroup = Thread.currentThread().getThreadGroup();
                int number = threadGroup.activeCount();
                Thread[] activateThreads = new Thread[number];
                threadGroup.enumerate(activateThreads);

                int index = 0;
                for (int i = 0; i < activateThreads.length; i++) {
                    if (activateThreads[i].getName().contains("Thread")) {
                        index = i;
                        break;
                    } else {
                        index = activateThreads.length;
                    }
                }

                for (int i = index; i < number; i++) {
                    activateThreads[i].interrupt();
                    map.remove(activateThreads[i]);
                    objectMap.clear();
                }
                return "Aborted";
            }
        } catch (Exception e) {
            return "Invalid command";
        }
        return "Invalid command";
    }

    public static String divideCommand(String command) {
        if (!command.contains(" ")) {
            return command;
        } else {
            int index = command.indexOf(" ");
            return command.substring(0,index);
        }
    }

    public static String divideN(String command) {
        int index = command.indexOf(" ");
        return command.substring(index + 1);
    }

    public static <K,V>List<K> findWithN(Map<K, V> data, V v) {
        List<K> result = new ArrayList<K>();
        for (K key : data.keySet()) {
            if (data.get(key).equals(v)) {
                result.add(key);
            }
        }
        return result;
    }
}
