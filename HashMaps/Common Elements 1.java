package Maps;

// Common elements in two arrays.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 0, 6, 4};
        int[] arr2 = {2, 1, 1, 4, 9};
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

        for (int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                map.remove(num);
            }
        }
        return list;
    }
}
