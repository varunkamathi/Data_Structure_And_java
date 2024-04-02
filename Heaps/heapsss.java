package Heaps;
import java.util.*;
public class heapsss {
    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x = arr.size() - 1;//x is child index
            int par = (x-1)/2; // par index

            while(arr.get(x) < arr.get(par)){
                //swap
                int temp = arr.get(par);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x= par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        
    }
}
