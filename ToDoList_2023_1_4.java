package com.company.javaRelearn;

import java.util.PriorityQueue;

public class ToDoList_2023_1_4 extends PriorityQueue<ToDoList_2023_1_4.ToDoItem> {
    static class ToDoItem implements Comparable<ToDoItem> {
        private char primary;
        private int secondary;
        private String item;

        public ToDoItem(String td, char pri, int sec) {
            this.item = td;
            this.primary = pri;
            this.secondary = sec;
        }

        @Override
        public int compareTo(ToDoItem arg) {
            if (primary > arg.primary) {
                return +1;
            }
            if (primary == arg.primary) {
                if (secondary > arg.secondary) {
                    return +1;
                } else if (secondary == arg.secondary) {
                    return 0;
                }
            }
            return -1;
        }

        @Override
        public String toString() {
            return Character.toString(primary) +
                     secondary + ": " + item;
        }
    }

    public void add(String td, char pri, int sec) {
        super.add(new ToDoItem(td, pri, sec));
    }

    public static void main(String[] args) {
        ToDoList_2023_1_4 toDoList = new ToDoList_2023_1_4();
        toDoList.add("Empty trash",'C',4);
        toDoList.add("Feed dog",'A',2);
        toDoList.add("Feed bird",'B',7);
        toDoList.add("Mow lawn",'C',3);
        toDoList.add("Water lawn",'A',1);
        toDoList.add("Feed cat",'B',1);
        while (!toDoList.isEmpty()) {
            System.out.println(toDoList.remove());
        }
    }
}
