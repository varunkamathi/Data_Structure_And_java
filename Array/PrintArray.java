package Array;

public class PrintArray {
    public static void main(String[] args) {
        int[] a = {1,23,3,4,5,6,7};
        // for loop
         for(int i= 0; i< a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        //for-each loop
        for(int num : a){
            System.out.print(num + " ");
        }
    }
}
