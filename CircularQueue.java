//package com.grivera64.datastructure.queue;

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

    private E[] q;                              // Array reference for actual queue
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

        /* Check if you need more space to insert a new element to the queue */
        if (this.isFull()) {
            System.out.println("The queue is out of space, calling reallocate...");
            this.reallocate();
        }

        /* Insert the element */
        this.q[this.rear] = element;
        this.rear = (this.rear + 1) % this.capacity;
        this.size++;
        return true;
    }

    @SuppressWarnings("unchecked")
    private void reallocate() {
        /* Create a new Queue */
        E[] newQ = (E[]) new Object[this.capacity * 2];

        /* Copy the elements from the first queue to the new queue */
        int j = this.front;
        for (int i = 0; i < this.capacity; i++) {
            newQ[i] = this.q[j];
            j = (j + 1) % this.capacity;
        }

        /* Set the queue data to match that of the new queue */
        this.q = newQ;
        this.capacity *= 2;
        this.front = 0;
        this.rear = this.size;
    }

    @Override
    public E poll() {

        /* Check if there is an element to remove */
        if (this.isEmpty()) {
            System.out.println("Queue Underflow!");         // poll does not throw an exception for Queues,
            return null;                                    // while remove/pop does for other data structures
        }

        /* Remove the front element */
        E tmp = this.q[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size--;
        return tmp;                                         // Return the deleted element
    }

    @Override
    public boolean isEmpty() {
        return this.size < 1;
    }

    @Override
    public boolean isFull() {
        return this.size == this.capacity;
    }

    @Override
    public E peek() {
        /* Check if there is an element to remove */
        if (this.isEmpty()) {
            System.out.println("Queue Underflow!");         // peek does not throw an exception for Queues,
            return null;                                    // while peek/remove/pop does for other data structures
        }

        return this.q[this.front];
    }

    @Override
    public String toString() {

        /* Print out the empty queue */
        if (this.isEmpty()) {
            return "[]";
        }

        StringBuilder s = new StringBuilder("[");
        final int end = this.front + this.size;
        for (int i = this.front; i < end - 1; i++) {
            s.append(this.q[i % this.capacity]);
            s.append(" | ");
        }

        s.append(this.q[(end - 1) % this.capacity]);
        s.append(']');
        return s.toString();
    }
}
