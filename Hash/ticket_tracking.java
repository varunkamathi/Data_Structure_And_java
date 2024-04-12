package Hash;
import java.util.HashMap;


public class ticket_tracking {
    public static String getStrat(HashMap<String, String> from){
        HashMap<String , String> to = new HashMap<>();

        for (String key : from.keySet()) {
            to.put(from.get(key), key);
        }
        for (String key : from.keySet()) {
            if (!to.containsKey(key)) {
                return key;
            }
        }
        return null;

    }
    public static void main(String[] args) {
        HashMap<String, String> from = new HashMap<>();
        from.put("chennai","Bengaluru");
        from.put("Mumbai", "Delhi");
        from.put("Goa","chennai" );
        from.put("Delhi", "Goa");

        String start = getStrat(from);
        System.out.print(start);
        for (String key : from.keySet()) {
            System.out.print("->" + from.get(start));
            start = from.get(start);
        }



    }
}
