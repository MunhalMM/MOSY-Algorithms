package com.example.mosyalgorithms;

public class MinSizeSubArraySum2 {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(findMinimalLength(nums, target));
    }

    public static int findMinimalLength(int[] nums, int target) {
        int length = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                length = Math.min(length, i - start + 1);
                sum = sum - nums[start];
                start++;
            }

        }
        return length == Integer.MAX_VALUE ? 0 : length;

    }
}
