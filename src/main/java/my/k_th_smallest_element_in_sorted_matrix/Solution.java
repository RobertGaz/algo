package my.k_th_smallest_element_in_sorted_matrix;

// Given an n x n matrix where each of the rows and columns is sorted in ascending order,
// return the kth smallest element in the matrix.
//
// Note that it is the kth smallest element in the sorted order, not the kth distinct element.
//
// You must find a solution with a memory complexity better than O(n^2).

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Triple> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.element));

        int curIndex = 1;
        queue.add(new Triple(matrix[0][0], 0, 0));

        while (curIndex < k) {
            Triple triple = queue.remove();
            if (triple.row + 1 < matrix.length) {
                queue.add(new Triple(matrix[triple.row + 1][triple.column], triple.row + 1, triple.column));
            }
            if (triple.column + 1 < matrix.length) {
                queue.add(new Triple(matrix[triple.row][triple.column + 1], triple.row, triple.column + 1));
            }

            curIndex++;
        }

        return queue.remove().element;
    }

    record Triple(int element, int row, int column) {}
}
