package com.example.mosyalgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolutionTwoSumWithTwoPointer {
    public static void main(String[] args) {
        SolutionTwoSumWithTwoPointer solution = new SolutionTwoSumWithTwoPointer();

        int[] numsOne = {0, 2, 7, 11, 15};
        int targetOne = 9;
        System.out.println(Arrays.toString(solution.twoSum(numsOne, targetOne)));

        int[] numsTwo = {3, 2, 4};//tut nado otsortirovat massiv
        Arrays.sort(numsTwo);
        int targetTwo = 6;
        System.out.println(Arrays.toString(solution.twoSum(numsTwo, targetTwo)));

        int[] numsThree = {3, 3};
        int targetThree = 6;
        System.out.println(Arrays.toString(solution.twoSum(numsThree, targetThree)));
        System.out.println("----------------------------------------------------------");

        int[] numsFour = {0, 2, 7, 11, 15};
        int targetFour = 9;
        System.out.println(Arrays.toString(solution.twoSumOther(numsFour, targetFour)));

        int[] numsFive = {3, 2, 4};//tut nado otsortirovat massiv
        Arrays.sort(numsFive);
        int targetFive = 6;
        System.out.println(Arrays.toString(solution.twoSumOther(numsFive, targetFive)));

        int[] numsSix = {3, 3};
        int targetSix = 6;
        System.out.println(Arrays.toString(solution.twoSumOther(numsSix, targetSix)));
    }

    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{0, 0};
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSumOther(int[] number, int target) {
        if (number.length == 0) {
            return new int[]{0, 0};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < number.length; i++) {
            if (map.containsKey(target - number[i])) {
                return new int[]{map.get(target - number[i]), i};
            } else {
                map.put(number[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
