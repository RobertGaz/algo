package my.count_pairs_with_sum_less_than_target;

// Easy

// Given a 0-indexed integer array nums of length n and an integer target,
// return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.

import java.util.Comparator;
import java.util.List;

public class Solution {
    public int countPairs(List<Integer> nums, int target) {
        nums.sort(Comparator.naturalOrder());
        int left = 0;
        int right = nums.size() - 1;

        int result = 0;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                result += right - left;
                left++;
            } else {
                right--;
            }

        }

        return result;
    }
}
