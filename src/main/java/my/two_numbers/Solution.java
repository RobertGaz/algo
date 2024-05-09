package my.two_numbers;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            values.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            Integer otherIndex = values.get(remainder);
            if (otherIndex != null && otherIndex != i) {
                return new int[]{i, otherIndex};
            }
        }

        return null;
    }
}
