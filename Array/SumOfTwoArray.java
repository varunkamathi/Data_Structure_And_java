package array;

public class SumOfTwoArray {
    public static void main(String[] args) {
        int N = 3;
        int[] a ={1,3,7,8};
        int[] b = {1,3,7,8};

        if (a.length != b.length) {
            System.out.println("Arrays must be of the same length");
            return;
        }



        int[] sum = new int[a.length];
    
        for(int i = 0 ; i< a.length ; i++){
          sum[i] = a[i] + b[i];
        }

        System.out.println("Sum of two arrays: ");
        for (int value : sum) {
            System.out.print(value + " ");
        }
    
        
    }
}
