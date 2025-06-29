package com.company.javaRelearn.AlgorithmsDataStructuresLearning.Exam;

public interface NewStack<E> {
    public boolean isEmpty();// Return true if and only if this stack is empty.
    public void clear();// Make this stack empty.
    public void push (E elem);// Add elem as the top element of this stack.
    public E pop();// remove and return the top element of the stack
    public String toString();
}
