package java_collection_framework;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;
public class queue {
    public static void main(String[] args) {
      // Queue<Integer> obj = new LinkedList<>();
       Deque<Integer> obj = new ArrayDeque();
       obj.addFirst(4);
       obj.addFirst(5);
       obj.offer(10);
       System.out.println(obj);
       System.out.println(obj.pollFirst());

        /*obj.offer(2);
     obj.offer(3);
        obj.offer(1);
        System.out.println(obj);
        //obj.poll();
        System.out.println(obj.poll());
        obj.add(5);
        System.out.println(obj);
        System.out.println(obj.peek());*/

        //Dequeue<Integer> obj = new 
    
    }
}
