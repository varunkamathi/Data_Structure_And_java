package java_collection_framework;

import java.util.HashMap;
import java.util.TreeMap;

public class map {
  public static void main(String[] args) {
   HashMap<String, Integer> obj = new HashMap<>();
   obj.put("Varun", 1);
   obj.put("yash", 20);
   System.out.println(obj);
   obj.putAll(obj);

   System.out.println(obj.get("Varun"));
System.out.println(obj.containsKey("yash"));
System.out.println(obj.remove("yash"));
System.out.println(obj);
   
   TreeMap<String,Integer> obj1 = new TreeMap<>();
    obj1.put("varun", 8);
    obj1.put("Aniket", 4);
    System.out.println(obj1);
    obj1.putAll(obj1);


}


}
