package learnAdvanced.learnQueue.learnPriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class LPQueue {
    public static void main(String[] args) {
        //Creation of queue
        Queue<Integer> q1 = new PriorityQueue<>();
        PriorityQueue<Integer> q2 = new PriorityQueue<>();

        //Adding the element
        q1.add(65);
        // System.err.println(q1.offer(74));
        q1.offer(41);
        q1.offer(32);
        q1.offer(45);
        
        q2.offer(41);
        q2.offer(69);
        q2.offer(32);

        q1.addAll(q2);

        // System.out.println(q1 + " >> " + q1.size());

        // Retrieval values
        // System.err.println(q1.peek());
        // System.err.println(q1);

        // deletion
        // System.err.println("Quere - " + q1);
        // System.err.println(q1.poll());
        // System.err.println("Quere - " + q1);;
        // System.err.println(q1.poll());
        // System.err.println("Quere - " + q1);
        // System.err.println(q1.remove());
        // System.err.println("Quere - " + q1);
        // System.err.println(q1.remove());
        // System.err.println("Quere - " + q1);
        // System.err.println(q1.remove());
        // System.err.println("Quere - " + q1);

        // System.err.println(q1);
        // q1.clear();
        // System.err.println(q1);

        // System.err.println(q1.isEmpty());

    }
}
