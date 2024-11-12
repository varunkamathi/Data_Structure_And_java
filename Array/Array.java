package Array;

public class Array {
    public static void findMinMax(int[] arr) {
    int min = arr[0];
    int max = arr[0];
    
    for (int i = 1; i < arr.length; i=i+1) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    
    System.out.println("Minimum element: " + min);
    System.out.println("Maximum element: " + max);
}

public static void main(String[] args) {
    int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};
    findMinMax(array);
}
}

