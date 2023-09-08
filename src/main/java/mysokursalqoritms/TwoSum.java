package mysokursalqoritms;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(arr, target)));
    }

    public int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
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
}
