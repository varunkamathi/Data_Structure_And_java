package java_collection_framework;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();
        obj.push(4);
        obj.push(8);
        obj.push(10);
        System.out.println(obj);
       // obj.peek();
        System.out.println(obj.peek());
        obj.pop();
        obj.pop();
        System.out.println(obj);
        obj.empty();
        System.out.println(obj);
    }
}
