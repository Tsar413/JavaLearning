package com.company.javaRelearn;

class Allocator {
    private int[] memory;

    public Allocator(int n) {
        this.memory = new int[n];
    }

    public int allocate(int size, int mID) {
        int free = 0;
        for (int i = 0; i < memory.length; i++) {
            if(memory[i] == 0){
                free++;
                if(free == size){
                    for (int j = i - size + 1; j <= i; j++) {
                        memory[j] = mID;
                    }
                    return i - size + 1;
                }
            } else {
                free = 0;
            }
        }
        return -1;
    }

    public int freeMemory(int mID) {
        int result = 0;
        for (int i = 0; i < memory.length; i++) {
            if(memory[i] == mID){
                result++;
                memory[i] = 0;
            }
        }
        return result;
    }
}

public class Allocator_20250225 {
}
