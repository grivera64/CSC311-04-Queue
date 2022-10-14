# CSC311-04-Queue

A Java implementation of the queue data structure using arrays.

## Available Methods (Located in Queue.java)
```java
public interface Queue<E> {
    boolean offer(E element);       // Add data
    E poll();                       // Remove data
    boolean isEmpty();              // Check if the queue is empty
    boolean isFull();               // Check if the queue is full
    E peek();                       // Returns the front of the queue without removing it
}
```
## How to run QueueDriver.java:

1. Clone the repository.
```bash
    $ git clone https://github.com/grivera64/CSC311-04-Queue.git
```
2. Compile the .java files
```bash
    $ cd CSC311-04-Queue
    $ javac ArrayQueue.java Queue.java QueueDriver.java
```
3. Run the driver code
```bash
    $ java QueueDriver
```

## Author

- Giovanni Rivera ([@grivera64](https://github.com/grivera64))