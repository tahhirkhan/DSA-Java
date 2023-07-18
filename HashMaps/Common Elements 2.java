package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonElements2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 2, 3, 5, 5};
        int[] arr2 = {1, 1, 1, 2, 2, 4, 5};
      
      // output should be: [1, 1, 2, 2, 5];
      
        System.out.println(commonElements(arr1, arr2));
    }
    public static List<Integer> commonElements(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(map);

//        for (int num : nums2) {
//            if (map.containsKey(num)) {
//                int of = map.get(num);
//                if (of == 0) {
//                    map.remove(num);
//                }
//                else {
//                    list.add(num);
//                    int nf = map.get(num) - 1;
//                    map.put(num, nf);
//                }
//            }
//        }
        
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        System.out.println(map);
        return list;
    }
}
