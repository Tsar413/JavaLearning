package com.company.javaRelearn.Concurrency_2023_2_28;

public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
