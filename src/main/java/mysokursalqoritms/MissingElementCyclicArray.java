package mysokursalqoritms;

public class MissingElementCyclicArray {
    public static void main(String[] args) {
        int[] nums = {8, 3, 5, 2, 4, 6, 0, 1};
        System.out.println(findMissingNumber(nums));

    }

    public static int findMissingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i];
            if (index != i && nums[i] < nums.length) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        return nums.length;
    }

    private static void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}