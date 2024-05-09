package my.arrays_intersection;

import java.util.*;
import java.util.stream.Collectors;

//Given two integer arrays nums1 and nums2, return an array of their intersection.
//Each element in the result must be unique and you may return the result in any order.
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numbers = new HashSet<>(Arrays.stream(nums1).boxed().toList());
        int[] result = new int[nums1.length];
        int resultIndex = 0;
        for (int b : nums2) {
            if (numbers.contains(b)) {
                numbers.remove(b);
                result[resultIndex] = b;
                resultIndex++;
            }
        }
        return Arrays.copyOfRange(result, 0, resultIndex);
    }
}