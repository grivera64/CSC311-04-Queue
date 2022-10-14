package com.grivera64.datastructure.queue;

/*
 * Name: Giovanni Rivera
 * Instructor: Dr. Chatterjee
 * Course: CSC 311-04
 * Creation Date: 10/14/2022
 * Due Date: 10/21/2022
 * File Name: Queue.java
 * Description: Represents the "bare-bones" ADT of a Queue
 */

public interface Queue<E> {
    boolean offer(E element);       // Add data
    E poll();                       // Remove data
    boolean isEmpty();              // Check if the queue is empty
    boolean isFull();               // Check if the queue is full
    E peek();                       // Returns the front of the queue without removing it
}
