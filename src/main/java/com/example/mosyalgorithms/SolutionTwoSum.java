package com.example.mosyalgorithms;

import java.util.Arrays;

public class SolutionTwoSum {
    public static void main(String[] args) {
        int[] numbers = {-1, 0, 1, 2, 7, 11, 15};
        int target = 9;
        SolutionTwoSum solution = new SolutionTwoSum();
        System.out.println(Arrays.toString(solution.twoSum(numbers, target)));
    }

    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0) {
            return new int[]{0, 0};
        }
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1};
            }
            if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{-1, -1};
    }

}