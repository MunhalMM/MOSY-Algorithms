package com.example.mosyalgorithms;

public class DoubleElementCycleArray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 4, 4};
        System.out.println(findNumber(nums));
    }

    public static int findNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (index != i) {
                if (nums[i] == nums[index]) {
                    return nums[index];
                }
                swap(nums, i, index);
            } else {
                i++;
            }
        }
        return -1;
    }

    private static void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
