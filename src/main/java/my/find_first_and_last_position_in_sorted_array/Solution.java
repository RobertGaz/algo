package my.find_first_and_last_position_in_sorted_array;

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findfirst(nums, target);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    private int findfirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target && (mid-1 == -1 || nums[mid-1] < target)) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
                continue;
            }
            if (nums[mid] > target) {
                end = mid;
                continue;
            }
            if (nums[mid] == target) {
                end = mid;
            }
        }

        return -1;
    }

    private int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target && (mid+1 == nums.length || nums[mid+1] > target)) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
                continue;
            }
            if (nums[mid] > target) {
                end = mid;
                continue;
            }
            if (nums[mid] == target) {
                start = mid+1;
            }
        }

        return -1;
    }
}
