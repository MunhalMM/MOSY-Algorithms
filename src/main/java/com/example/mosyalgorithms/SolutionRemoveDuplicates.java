package com.example.mosyalgorithms;

public class SolutionRemoveDuplicates {
    public static void main(String[] args) {
        SolutionRemoveDuplicates duplicates = new SolutionRemoveDuplicates();

        int[] nums = {1,1,2};
        System.out.println(duplicates.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            int nextNonDuplicate = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    nums[nextNonDuplicate] = nums[i + 1];
                    nextNonDuplicate++;
                }
            }
            return nextNonDuplicate;
        }
    }
}