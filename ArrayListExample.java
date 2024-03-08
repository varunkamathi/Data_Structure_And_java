import java.util.*;
import java.io.*;
class ArrayListExample {
    static void addNo(ArrayList<Integer> list,int no){   
        list.add(no);
    }

    static void removeno(ArrayList<Integer> list ,int no){
        // we remove the arrylist place no.
        //   |   3  |   --2
        //   |   2  |   --1 <<----place no
        //   |   1  |  --0
        //
       list.remove(no);

    }
    static void showno( ArrayList<Integer> list){
       // ArrayList<String> myList = new ArrayList<>();

        System.out.println("Elements in the ArrayList:");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print("-->");
        }
        System.out.println();
        
    }
    
    public static void main(String[] args) {
        // Creating an ArrayList
       ArrayList<Integer> list = new ArrayList<>();
        
       
        Scanner sc = new Scanner(System.in);
        

         int no;
        int ch;
        do {
         
            System.out.println("1.adding number");
            System.out.println("2.removing number");
            System.out.println("3.display list");
            System.out.println("enter the ch :");
            ch = sc.nextInt();
            
            switch (ch) {
                case 1:
                System.out.println("enter the no.");
                no = sc.nextInt();
                addNo(list, no);
                    
                    break;
                case 2:
                   System.out.println("enter the place to remove in list");
                    no = sc.nextInt();
                    removeno(list, no);
                      break;
                case 3:
                    showno(list);
                     break;
                default:
                    break;
            }
            
        } while (ch!=4); 
            

    }
}