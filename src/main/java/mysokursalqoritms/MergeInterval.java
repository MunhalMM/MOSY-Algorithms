package mysokursalqoritms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(intervals)));

    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length < 2) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] current = intervals[0]; //1,3
        int start = current[0];// 1
        int end = current[1];//3


        List<int[]> list = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            current = intervals[i];// 2,6//8,10//15,18
            if (current[0] <= end) {//2<=3//8<=6//15<=10
                end = Math.max(end, current[1]);//3 or 6
            } else {
                list.add(new int[]{start, end});
                start = current[0];
                end = current[1];
            }
        }
        list.add(new int[]{start, end});
        return list.toArray(new int[0][]);
    }
}
