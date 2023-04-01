package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class FindItinerary {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("MUC", "LHR");
        map.put("JFK", "MUC");
        map.put("SFO", "SJC");
        map.put("LHR", "SFO");

        // Check for every key if it is present in the values:
        ArrayList<String> list = new ArrayList<>();

        String source = "";
        for (String key : map.keySet()) {
            if (!map.containsValue(key)) {
                source = key;
                list.add(key);
            }
        }

        for (int i=0; i<map.size(); i++) {
            String value = map.get(source);
            list.add(value);
            source = value;
        }

//        System.out.println(map.size());

//        System.out.println(source);
        System.out.println(list);
    }
}
