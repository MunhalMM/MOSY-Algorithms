package mysokursalqoritms;

import java.util.Map;
import java.util.TreeMap;

public class CountOfMeetingRoom {
    public int howMuchRoomsForMeetings(int[][] intervals) {
        int counter = 0;
        // proverjaem dlinu massiva, esli znachenie 1 to vozvrashaem chto nado 1 komnatu
        if (intervals.length == 1) {
            return 1;
        }

        Map<Integer, Integer> result = new TreeMap<>();
        for (int i = 0; i < intervals.length; i++) {
            result.put(intervals[i][0], result.getOrDefault(intervals[i][0], 0) + 1);
            result.put(intervals[i][1], result.getOrDefault(intervals[i][0], 0) - 1);
        }
        int max = 0;
        for (int value : result.values()) {
            counter += value;
            max = Math.max(counter, max);
        }

        return max;
    }
}