package mysokursalqoritms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalTwo {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals) {
        if (intervals.length < 2)
            return intervals;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);  //O(N logN)

        int[] curr = intervals[0];// {1,3}
        int start = curr[0]; //1
        int end = curr[1];  //3

        List<int[]> result = new ArrayList<>();//O(n)

        for (int i = 1; i < intervals.length; i++) {
            curr = intervals[i];   // {2,6}  // {8,10} // {15,18}
            if (curr[0] <= end) {   // 2<=3   // 8<=6   // 15<=10
                end = Math.max(end, curr[1]);  // 3 or 6 = end = 6
            } else {
                // (curr[0]>end)
                result.add(new int[]{start, end});  //  {1,6}  // {8,10}
                start = curr[0]; // 8  // 15
                end = curr[1];  // 10   //18
            }
        }
        result.add(new int[]{start, end});  //{15,18}
        return result.toArray(new int[0][]);// result.toArray(new int [0])
    }
}
