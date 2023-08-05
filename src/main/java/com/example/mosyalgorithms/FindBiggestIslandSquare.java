package com.example.mosyalgorithms;

import java.util.LinkedList;
import java.util.Queue;

public class FindBiggestIslandSquare {
    public static void main(String[] args) {
        int[][] nums = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

        System.out.println(maxAreaOfIsland(nums));
    }

    public static int maxAreaOfIsland(int[][] nums) {
        int rows = nums.length;
        int columns = nums[0].length;
        int max_area = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (nums[i][j] == 1) {
                    int islandSquare = area(i, j, nums);
                    max_area = Math.max(max_area, islandSquare);
                }
            }
        }
        return max_area;
    }

    public static int area(int i, int j, int[][] nums) {
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int row = arr[0];
            int column = arr[1];
            if (row < 0 || row >= nums.length || column < 0 || column >= nums[0].length) {
                continue;
            }
            if (nums[row][column] == 0) {
                continue;
            }
            int[] left = {row, column - 1};
            int[] right = {row, column + 1};
            int[] up = {row - 1, column};
            int[] down = {row + 1, column};
            nums[row][column] = 0;
            count++;
            queue.add(left);
            queue.add(right);
            queue.add(up);
            queue.add(down);
        }
        return count;
    }
}
