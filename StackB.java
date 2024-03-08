import java.util.*;
public class StackB {
    public static void PushAtButtom(Stack<Integer> s , int data){
      if(s.isEmpty()){
        s.push(data);
        return ;
      }
      else {
         int top = s.pop();
         PushAtButtom(s, data);
         s.push(top);
      }
    }
    public static void reverseStack(Stack<Integer> s){
     if(s.isEmpty()){
        return;
     }
     else{
        int top =s.pop();
        reverseStack(s);
        PushAtButtom(s, top);

     }
    
    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
           System.out.println(s.pop());
            }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       /*  while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
        */
        printStack(s);
        reverseStack(s);
        printStack(s);
 

    }
}
