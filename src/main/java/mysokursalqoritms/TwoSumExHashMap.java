package mysokursalqoritms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumExHashMap {
    public static void main(String[] args) {
        TwoSumExHashMap twoSumExHashMap = new TwoSumExHashMap();
        int[] arr = {1, 2, 3, 4, 6};
        int target = 9;
        System.out.println(Arrays.toString(twoSumExHashMap.twoSum(arr, target)));

    }

    public int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[]{map.get(target - arr[i]), i};
            } else {
                map.put(arr[i], i);
            }

        }
        return new int[]{-1, -1};
    }
}
