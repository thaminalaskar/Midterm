package datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;


public class UseQueue<waitingQueue> {

    public static void main(String[] args) {
        // Create and initialize a Queue using a LinkedList
        Queue<String> waitingQueue = new LinkedList<>();

        // Adding new elements to the Queue (The Enqueue operation)
        waitingQueue.add("Thamina");
        waitingQueue.add("Tanzina");
        waitingQueue.add("Farzin");
        waitingQueue.add("Shadman");
        waitingQueue.add("Julia");

        System.out.println("WaitingQueue : " + waitingQueue);

        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty
        String name = waitingQueue.remove();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);


            String firstPersonInTheWaitingQueue = waitingQueue.element();
            System.out.println("First Person in the Waiting Queue (element()) : " + firstPersonInTheWaitingQueue);

            // Get the element at the front of the Queue without removing it using peek()
            // The peek() method is similar to element() except that it returns null if the Queue is empty
            firstPersonInTheWaitingQueue = waitingQueue.peek();
            System.out.println("First Person in the Waiting Queue : " + firstPersonInTheWaitingQueue);

        }
    }

    















/*
 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
 * Use For Each loop and while loop with Iterator to retrieve data.
 *
 */


