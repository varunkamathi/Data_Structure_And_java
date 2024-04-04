package java_collection_framework;

import java.util.HashMap;
import java.util.TreeMap;

public class map {
  public static void main(String[] args) {
   // HashMap<String, Integer> obj = new HashMap<>();
   TreeMap<String,Integer> obj = new TreeMap<>();
    obj.put("varun", 1);
    obj.put("Aniket", 2);
    System.out.println(obj);
    obj.putAll(obj);


}


}
