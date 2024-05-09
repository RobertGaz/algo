package my.max_subarray;

//Given an integer array nums, find the subarray
// with the largest sum, and return its sum.
public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = nums[0];
        int i = 1;
        while (i < nums.length) {
            curSum = Math.max(curSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, curSum);
            i++;
        }

        return maxSum;
    }
}
