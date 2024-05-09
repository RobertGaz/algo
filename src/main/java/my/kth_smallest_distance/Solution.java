package my.kth_smallest_distance;

import java.util.Arrays;
import java.util.Map;

class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int[] distances = new int[nums.length-1];
        for (int i = 0; i < nums.length-1; i++) {
            distances[i] = nums[i+1]-nums[i];
        }

        Arrays.sort(distances);

        return distances[k- 1];

    }
}