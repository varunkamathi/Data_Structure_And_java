package java_collection_framework;
//import java.util.*;
import java.util.List;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        List<Integer> obj = new LinkedList();
        obj.add(9);
        obj.add(8);
        obj.add(3);
        System.out.println(obj);
        obj.clear();
        System.out.println(obj);

    }
}