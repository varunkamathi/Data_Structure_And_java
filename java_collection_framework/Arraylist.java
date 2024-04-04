package java_collection_framework;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(6);
        obj.add(5);
        obj.add(8);
        obj.add(2, 9);
        System.out.println(obj);
        //obj.remove(2);
        obj.clear();

        System.out.println(obj);
    }
}
