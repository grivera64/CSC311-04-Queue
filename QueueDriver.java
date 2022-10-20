//package com.grivera64.datastructure.queue;

/*
 * Name: Giovanni Rivera
 * Instructor: Dr. Chatterjee
 * Course: CSC 311-04
 * Creation Date: 10/14/2022
 * Due Date: 10/21/2022
 * File Name: QueueDriver.java
 * Description: Tests our CircularQueue implementation
 */

public class QueueDriver {
    public static void main(String[] args) {
        Queue<Integer> q = new CircularQueue<>();

        /* Offer 10-60 to the queue */
        q.offer(10);
        System.out.printf("Q: %s\n", q);
        q.offer(20);
        System.out.printf("Q: %s\n", q);
        q.offer(30);
        System.out.printf("Q: %s\n", q);
        q.offer(40);
        System.out.printf("Q: %s\n", q);
        q.offer(50);
        System.out.printf("Q: %s\n", q);
        System.out.printf("IsFull: %b\n", q.isFull());
        System.out.println();

        q.offer(60);                        // Reallocates more space
        System.out.printf("Q: %s\n", q);

        /* Remove the first 2 elements from the queue */
        q.poll();
        System.out.printf("Q: %s\n", q);
        q.poll();
        System.out.printf("Q: %s\n", q);

        /* Offer 2 more elements */
        q.offer(80);
        System.out.printf("Q: %s\n", q);
        q.offer(90);
        System.out.printf("Q: %s\n", q);
        System.out.println();

        System.out.printf("The first element is %d.\n", q.peek());
        System.out.println();

        /* Clear the queue */
        q.poll();
        System.out.printf("Q: %s\n", q);
        q.poll();
        System.out.printf("Q: %s\n", q);
        q.poll();
        System.out.printf("Q: %s\n", q);
        q.poll();
        System.out.printf("Q: %s\n", q);
        q.poll();
        System.out.printf("Q: %s\n", q);
        q.poll();
        System.out.printf("Q: %s\n", q);

        q.poll();                                   // Queue Underflow
        System.out.printf("Q: %s\n", q);

        System.out.printf("IsEmpty: %b\n", q.isEmpty());
    }
}
