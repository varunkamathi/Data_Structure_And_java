package queue;
public class Queues {
    static class Queue{
        static int arr[];
        static int size;
        static int rear ;

        Queue(int n){
            arr = new int[n];
            size = n ;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //add
        public static void add(int data){
            if (rear == size-1){
                System.out.println("queue is full");
            }
            else{
                rear = rear + 1;
                arr[rear] = data;
                /*for(int i =0; i < rear - 1 ;i++ ){
                    arr[i] = arr[i+1];
                    System.out.println(arr[i]);
                }*/
                
            }

        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            else {
                int front = arr[0];
                for (int i = 0; i < rear; i++) {
                    arr[i] = arr[i+1];
                }
                rear = rear -1;
                size--;
                return front;

            }
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return-1;
            }
            else{
                return arr[0];
            }
        }
      /* public static int print(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;

            }
            else{
                for(int i =0; i == arr[i] ;i++ ){
                    return arr[i];
                }
                
            }
        }*/
    }
    public static void main(String[] args) {
      Queue s = new Queue(5);
      s.add(5);
      s.add(4);
      s.add(6);
      for (int i = 0; i < args.length; i++) {
        System.out.println(args.length);
    }
    
      
        while(!s.isEmpty()){
        System.out.println(s.peek());
        s.remove();
       
      }


    }
}
