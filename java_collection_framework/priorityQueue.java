package java_collection_framework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        //PriorityQueue<Integer> obj = new PriorityQueue<>();
        PriorityQueue<Integer> obj = new PriorityQueue<>(Comparator.reverseOrder());

        obj.offer(4);
        obj.offer(2);
        obj.offer(1);
        obj.offer(0);
        obj.offer(15);
        System.out.println(obj);
        System.out.println(obj.poll());
    
    
    }
}
