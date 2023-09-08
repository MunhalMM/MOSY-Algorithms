package mysokursalqoritms;


public class SW {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(findMinimalLength(nums, target));
    }

    public static int findMinimalLength(int[] nums, int target) {
        int length = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {   // i = 4; i = 5;
            sum += nums[i];   // 3,1,2,4  = 10 ,  2,4,3 = 9
            while (sum >= target) {  //    start = 0, i = 3; sum = 8   ,  start = 1, i = 4, sum = 10; sum = 7; sum = 9 , sum = 7
                length = Math.min(length, i - start + 1);   // length = 3 -0 +1 = 4;    length = 4 - 1 +1 = 4;   length = 4 - 2 +1 = 3; length = 5 - 3 +1 = 3; length = 5 - 4 + 1 = 2;
                sum = sum - nums[start]; //  2,3,1,2  = 3,1,2 = 6 ,   3,1,2,4 = 1,2,4 , ; 1,2,4 = 2,4 ; 2,4,3 = 4,3 = 7; 4,3 = 3
                start++; // start = 1; start = 2; start = 3; start = 4; start = 5;
            }
        }

        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
