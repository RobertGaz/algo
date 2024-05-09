package my.arrays_intersection_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must appear as many times as it shows in both arrays
// and you may return the result in any order.
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int a : nums1) {
            if (!counts.containsKey(a)) {
                counts.put(a, 0);
            }
            counts.put(a, counts.get(a) + 1);
        }
        int[] result = new int[nums1.length];
        int resultIndex = 0;
        for (int b : nums2) {
            if (counts.containsKey(b) && counts.get(b) > 0) {
                result[resultIndex] = b;
                resultIndex++;
                counts.put(b, counts.get(b) - 1);
            }
        }
        return Arrays.copyOfRange(result, 0, resultIndex);
    }
}