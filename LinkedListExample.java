import java.util.*;
import java.io.*;
/**
 * 
 */
 class Node {
    int data;
    Node next;

    // Constructor to initialize a node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
   
    
}
public class LinkedListExample {
    public static Node head;
    public static Node tail;    
    //public static Node temp;
    public static int size;

    int val;

    //Node newNode = new Node(data);
    static void addFrist(int data){   
        Node newNode = new Node(data);

        if (head == null) {
            // If the list is empty, make the new node the head
            head = tail = newNode;
            size++;
            return;
        } else {
            // Traverse to the end of the list and add the new node
         newNode.next = head;
         head = newNode;
         size++;

        }}
    static void addLast(int data){   
        Node newNode = new Node(data);
         if (head == null) {
            // If the list is empty, make the new node the head
            head = tail = newNode;
            size++;
            return;
        } else {
            // Traverse to the end of the list and add the new node
         tail.next = newNode;
         tail = newNode;
         size++;

        }

        
    }

    static void removeFrist(LinkedList<Integer> list){
        //int val = head.data;
      head = head.next;
      head.next = head;
       size--;
      // return val;


            
    }
    static void removelast(){
    
      
      
      System.out.println();


            
    }
    static void printll( LinkedList<Integer> list){
     

        System.out.println("Elements in the linkedList:");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data+" ");
            temp = temp.next;
            
        }
        System.out.println();
        
        
    }
    
    public static void main(String[] args) {
        // Creating an ArrayList
       LinkedList<Integer> list = new LinkedList<>();
        
        Scanner sc = new Scanner(System.in);
        

         int data;
        int ch;
        do {
            //ArrayList<Integer> list = new ArrayList<>();
            System.out.println("1.adding number frist");
            System.out.println("2.adding number last");
            System.out.println("3.removing number frist");
            System.out.println("4.removing number last");
            System.out.println("5.display list");
            System.out.println("enter the ch :");
            ch = sc.nextInt();
            
            switch (ch) {
                case 1:
                    System.out.println("enter the data");
                    data = sc.nextInt();
                    addFrist(data);
                      break;
                case 2:
                    System.out.println("enter the data");
                    data = sc.nextInt();
                    addLast(data);
                      break;
                case 3:
                    removeFrist(list);
                      break;
                case 4:
                    removelast();
                        break;
                case 5:
                    printll(list);
                      break;
                default:
                    break;
            }
            
        } while (ch!=241); 
            

    }
}