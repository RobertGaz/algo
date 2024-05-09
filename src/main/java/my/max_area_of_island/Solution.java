package my.max_area_of_island;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i , j);
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }
        }

        return maxArea;
    }

    private int dfs(int grid[][], int i, int j) {
        grid[i][j] = 0;
        int result = 1;
        if (i - 1 >= 0 && grid[i-1][j] == 1) {
            result += dfs(grid, i-1, j);
        }
        if (i + 1 < grid.length && grid[i+1][j] == 1) {
            result += dfs(grid, i+1, j);
        }
        if (j - 1 >= 0 && grid[i][j-1] == 1) {
            result += dfs(grid, i, j-1);
        }
        if (j + 1 < grid[i].length && grid[i][j+1] == 1) {
            result += dfs(grid, i, j+1);
        }
        return result;
    }
}