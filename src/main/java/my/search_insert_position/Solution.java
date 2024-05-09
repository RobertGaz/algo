package my.search_insert_position;

//Given a sorted array of distinct integers and a target value, return the index if the target is found.
//If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
                continue;
            }
            end = mid;
        }

        return start;

    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 4));
    }
}
