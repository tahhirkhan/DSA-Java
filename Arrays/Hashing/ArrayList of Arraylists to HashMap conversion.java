package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListToHashMap {
    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();

        list1.add("MUC");
        list1.add("LHR");

        list2.add("JKF");
        list2.add("MUC");

        list3.add("SFO");
        list3.add("SJC");

        list4.add("LHR");
        list4.add("SFO");

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);
        listOfLists.add(list4);

        HashMap<String, String> map = new HashMap<>();
        int index = 0;
        for (int i=0; i<listOfLists.size(); i++) {
            map.put(listOfLists.get(i).get(index), listOfLists.get(i).get(index+1));
            index = 0;
        }

        System.out.println(map);

    }
}
