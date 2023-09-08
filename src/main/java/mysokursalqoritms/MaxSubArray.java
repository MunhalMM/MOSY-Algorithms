package mysokursalqoritms;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int curMaxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curMaxSum = Math.max(nums[i], curMaxSum + nums[i]);
            maxSoFar = Math.max(curMaxSum, maxSoFar);
        }
        return maxSoFar;
    }
}
