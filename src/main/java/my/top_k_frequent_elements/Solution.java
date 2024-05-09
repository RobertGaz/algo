package my.top_k_frequent_elements;

import java.util.*;

class Solution {
    // O(n)
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!counts.containsKey(nums[i])) {
                counts.put(nums[i], 0);
            }

            counts.put(nums[i], counts.get(nums[i]) + 1);
        }


        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (buckets[entry.getValue()] == null) {
                buckets[entry.getValue()] = new ArrayList<>();
            }

            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int curBucket = nums.length;
        while (k > 0) {
            if (buckets[curBucket] == null || buckets[curBucket].isEmpty()) {
                curBucket--;
                continue;
            }
            result[k-1] = buckets[curBucket].remove(buckets[curBucket].size()-1);
            k--;
        }

        return result;
    }
}