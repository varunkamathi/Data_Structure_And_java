package stack;
import java.util.*;
public class StackUsingArrylist {
    static void push(ArrayList<Integer> list,int no){   
        list.add(no);
        //list.size();
        System.out.println(list.size());
    }

    static void pop(ArrayList<Integer> list ){
        if(list.size() == 0){
            System.out.println("Empty stack");
        }
       else{list.remove(list.size()-1);}

    }
    static void display( ArrayList<Integer> list){

        System.out.println("Elements in the ArrayList:");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print("-->");
        }
        System.out.println();
        
    }
    static void PushAtBottam(ArrayList<Integer> list , int no){
       int top = list.remove(no);
       PushAtBottam(list, no);
       list.add(top);
    }
    static void reverseStack(ArrayList<Integer> list ){
      int idx = 0;
     while (idx < list.size()) {
        push(list, idx);
        idx++;
     }
    }
    
    public static void main(String[] args) {
        
       ArrayList<Integer> list = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
        

         int no;
        int ch;
        do {
            System.out.println("1.adding number");
            System.out.println("2.removing number");
            System.out.println("3.display list");
            System.out.println("4.Push at bottom");
            System.out.println("5.reverse stack");
            System.out.println("enter the ch :");
            ch = sc.nextInt();
            
            switch (ch) {
                case 1:
                System.out.println("enter the no.");
                no = sc.nextInt();
                push(list, no);
                    
                    break;
                case 2:
                   //System.out.println("remove the no.");
                    //no = sc.nextInt();
                    pop(list);
                      break;
                case 3:
                    display(list);
                     break;
                case 4:
                System.out.println("enter the no.");

                no = sc.nextInt();
                PushAtBottam(list, no);
                    break;  
                case 5 :
                   reverseStack(list); 
                   break;    
                default:
                    break;
            }
            
        } while (ch!=6); 
            

    }
}

