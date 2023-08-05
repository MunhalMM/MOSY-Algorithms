package com.example.mosyalgorithms;

import java.util.Map;
import java.util.TreeMap;

public class CountMeetingRoom {
    public static void main(String[] args) {
        int[][] intervals = {{5, 15}, {10, 30}, {45, 55}};
        System.out.println(howMuchRoomsForMeetings(intervals));

    }
    public static int howMuchRoomsForMeetings(int[][] intervals) {
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
