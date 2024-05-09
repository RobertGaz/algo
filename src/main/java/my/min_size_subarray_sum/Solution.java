package my.min_size_subarray_sum;

//Given an array of positive integers nums and a positive integer target, return the minimal length of a
//subarray
// whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        long sum = 0;
        int minLength = Integer.MAX_VALUE;

        while (end < nums.length) {
            sum += nums[end];
            if (sum >= target) {
                while (sum >= target) {
                    minLength = Math.min(minLength, end - start + 1);
                    sum -= nums[start];
                    start++;
                }
            }
            end++;
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;

    }
}
