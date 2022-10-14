package com.grivera64.datastructure.queue;

public class QueueDriver {
    public static void main(String[] args) {
        Queue<Integer> q = new CircularQueue<>();

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

        /* Reallocate doesn't work yet */
//        q.offer(60);
//        System.out.printf("Q: %s\n", q);
//
//        q.offer(70);
//        System.out.printf("Q: %s\n", q);

    }
}
