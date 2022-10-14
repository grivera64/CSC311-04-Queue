package com.grivera64.datastructure.queue;

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
    }
}
