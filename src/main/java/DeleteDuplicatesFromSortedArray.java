public class DeleteDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int nextNonDuplicates = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[nextNonDuplicates] = nums[i + 1];
                nextNonDuplicates++;
            }
        }
        return nextNonDuplicates;
    }
}
