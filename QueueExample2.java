package cg;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample2 {
	public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();
  
        pq.add("Ganga");
        pq.add("sai");
        pq.add("akhil");
  
        System.out.println("Initial Queue " + pq);
  
        pq.remove("Ganga");
  
        System.out.println("After Remove " + pq);
  
        System.out.println("Poll Method " + pq.poll());
  
        System.out.println("Final Queue " + pq);
    }
}
