package java_collection_framework;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class set {
    public static void main(String[] args) {
        Set<Integer> obj = new HashSet<>();
        //LinkedHashSet<Integer> obj = new LinkedHashSet<>();
        obj.add(15);
        obj.add(6);
        obj.add(5);
        obj.add(13);
        
        //obj.add(2, 9);
        System.out.println(obj);

    }
}
