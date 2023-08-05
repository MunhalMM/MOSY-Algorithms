package com.example.mosyalgorithms;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue {
    public static void main(String[] args) {
        int[] nums = {4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(nums));
    }

    public static int maximumUniqueSubarray(int[] nums) {
        int max = 0;
        int sum = 0;
        int i = 0;
        int j = 0;
        Set<Integer> set = new HashSet<>();
        while (i < nums.length && j < nums.length) {
            if (!set.contains(nums[j])) {
                sum += nums[j];
                max = Math.max(max, sum);
                set.add(nums[j]);
                j++;
            } else {
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
        }
        return max;
    }
}