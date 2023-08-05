package com.example.mosyalgorithms;

import java.util.LinkedList;
import java.util.Queue;

public class CountSubIslands {
    public static void main(String[] args) {
        int[][] grid1 = {{1, 1, 1, 0, 0}, {0, 1, 1, 1, 1}, {0, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 1, 1}};
        int[][] grid2 = {{1, 1, 1, 0, 0}, {0, 0, 1, 1, 1}, {0, 1, 0, 0, 0}, {1, 0, 1, 1, 0}, {0, 1, 0, 1, 0}};
        System.out.println(countSubIslands(grid1, grid2));
    }

    public static int countSubIslands(int[][] grid1, int[][] grid2) {
        int rows = grid1.length;
        int columns = grid1[0].length;
        int subIslandCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid2[i][j] == 1) {
                    if (isIlandCount(grid1, grid2, i, j)) {
                        subIslandCount++;
                    }
                }
            }
        }
        return subIslandCount;
    }

    public static boolean isIlandCount(int[][] matrix1, int[][] matrix2, int i, int j) {
        boolean isSubIcland = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int row = arr[0];
            int col = arr[1];
            if (row < 0 || row >= matrix1.length || col < 0 || col >= matrix1[0].length) {
                continue;
            }
            if (matrix2[row][col] == 0) {
                continue;
            }
            if (matrix2[row][col] == 1 && matrix1[row][col] != 1) {
                isSubIcland = false;
            }
            matrix2[row][col] = 0;
            int[] left = {row, col - 1};
            int[] right = {row, col + 1};
            int[] up = {row - 1, col};
            int[] down = {row + 1, col};
            queue.add(left);
            queue.add(right);
            queue.add(up);
            queue.add(down);
        }
        return isSubIcland;
    }
}
