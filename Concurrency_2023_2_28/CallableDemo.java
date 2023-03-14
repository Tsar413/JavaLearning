package com.company.javaRelearn.Concurrency_2023_2_28;

import java.util.ArrayList;
import java.util.concurrent.*;

class TaskWithResult implements Callable {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "Result of TaskWithResult is " + id;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> list = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            list.add(exec.submit(new TaskWithResult(i)));
        }
        for (Future<String> s : list) {
            try {
                System.out.println(s.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }
}
