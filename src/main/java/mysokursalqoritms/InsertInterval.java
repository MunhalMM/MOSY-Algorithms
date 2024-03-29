package mysokursalqoritms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 3));
        input.add(new Interval(5, 7));
        input.add(new Interval(8, 12));
        System.out.println(input);
        for (Interval intervals : InsertInterval.insert(input, new Interval(4, 6))) {
            System.out.println("[" + intervals.start + "," + intervals.end + "]");
        }

    }

    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (intervals == null || intervals.isEmpty()) {
            return Arrays.asList(newInterval);
        }
        List<Interval> mergedIntervals = new ArrayList<>();

        int i = 0;

        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            mergedIntervals.add(intervals.get(i++));
        }
        while (i < intervals.size() && intervals.get(i).start < newInterval.end) {
            newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
            newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
            i++;
        }
        mergedIntervals.add(newInterval);
        while (i < intervals.size())
            mergedIntervals.add(intervals.get(i++));
        return mergedIntervals;

    }
}
