package queue;
/**
 * CricluarQueue
 */
public class CricularQueue {

    static class Queue{
        static int arr[];
        static int size;
        static int rear ;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n ;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return ((rear+1) % size) == front;
        }
    
    //add
    public  static void add(int data){
        if(isFull()){
            System.out.println("cricular queue is full");
        }
        else{
            // 1st el condition
            if(front == -1){
                front = 0;
            }
              rear = (rear +1)%size;
              arr[rear] = data;

        }
    }
    //remove
    public static int remove(){
        if(isEmpty()){
        System.out.println("cricular queue is empty");
        return -1;
        }
        else{
            int result = arr[front];
            //last el condition;
            if(rear == front){
                rear = front = -1;
            } else{
                front = (front + 1 ) % size;
            }
            return result;
        }

    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return-1;
        }
        else{
            return arr[front];
        }
    }


}
    public static void main(String[] args) {
        Queue s = new Queue(5);
        s.add(5);
        s.add(4);
        s.add(6);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.remove();
           
          }
    
    }
}