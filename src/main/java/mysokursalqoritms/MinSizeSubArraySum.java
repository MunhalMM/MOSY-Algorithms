package mysokursalqoritms;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(findMinimalLength(nums, target));
    }

    public static int findMinimalLength(int[] nums, int target) {

        int length = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int count = 0;
            // i = 0 ; 2,3,1,2,4,3
            // i = 1;  3,1,2,4,3
            // i = 2;  1,2,4,3

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                count++;
                if (sum >= target) {
                    length = Math.min(length, count);
                    break;
                }
            }
        }

        return length == Integer.MAX_VALUE ? 0 : length;

    }
}
