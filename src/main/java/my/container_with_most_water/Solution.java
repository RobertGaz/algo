package my.container_with_most_water;

//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.
public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxArea = Integer.MIN_VALUE;

        while (left < right) {
            int area = (right - left) * Math.min(height[right], height[left]);
            if (area >= maxArea) {
                maxArea = area;
            }
            if (height[right] < height[left]) {
                right--;
            } else {
                left++;
            }
        }

        return maxArea;
    }
}
