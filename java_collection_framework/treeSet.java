package java_collection_framework;
import java.util.TreeSet;
public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> obj = new TreeSet<>();
        obj.add(15);
        obj.add(6);
        obj.add(5);
        obj.add(13);
        //obj.add(2, 9);
        System.out.println(obj);
    }
}
