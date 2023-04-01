package Maps;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {7, 3, 9};
        int[] nums2 = {6, 3, 9, 2, 9, 4};

        Set<Integer> set = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }

        for (int i: nums2) {
            set.add(i);
        }

        System.out.println(set);
    }
}
