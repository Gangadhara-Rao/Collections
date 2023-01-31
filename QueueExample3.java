package cg;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample3 {
	public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();
  
        pq.add("Ganga");
        pq.add("siva");
        pq.add("Ganga");
  
        System.out.println(pq);
    }
}
