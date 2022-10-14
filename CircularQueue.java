package com.grivera64.datastructure.queue;

/*
 * Name: Giovanni Rivera
 * Instructor: Dr. Chatterjee
 * Course: CSC 311-04
 * Creation Date: 10/14/2022
 * Due Date: 10/21/2022
 * File Name: CircularQueue.java
 * Description: Represents a Queue implemented using a Circular Array
 */

public class CircularQueue<E> implements Queue<E> {

    private static final int DEFAULT_CAPACITY = 5;

    private final E[] q;                        // Array reference for actual queue
    private int front;                          // The front of the queue
    private int rear;                           // The back of the queue
    private int size;                           // The number of elements in the queue
    private int capacity;                       // Total number of spots taken up


    public CircularQueue() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public CircularQueue(int capacity) {
        this.q = (E[]) new Object[capacity];
        this.capacity = capacity;               // All other fields are defaulted to 0
    }

    @Override
    public boolean offer(E element) {

        /* Check if you can insert a new element to the queue */
        if (this.isFull()) {
            /* TODO: Add reallocate method (optional) */
            System.out.println("The queue is out of space, calling reallocate...");
//            this.reallocate();
            return false;
        }

        /* Insert the element */
        this.q[this.rear] = element;
        this.rear = (this.rear + 1) % this.capacity;
        this.size++;
        return true;
    }

    private void reallocate() {
        /* TODO: Try to implement reallocate */
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return this.size == this.capacity;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");

        final int end = this.front + this.size;
        for (int i = this.front; i < end - 1; i = (i + 1) % this.q.length) {
            s.append(this.q[i]);
            s.append(" | ");
        }

        s.append(this.q[end - 1]);
        s.append(']');
        return s.toString();
    }
}
