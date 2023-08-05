package com.example.mosyalgorithms;

public class MaxMeetingRoomsBruteForce {
    public static void main(String[] args) {
        int[][] meetings = {{0, 30}, {15, 20}, {5, 10}, {35, 59}, {40, 45}, {42, 44}, {50, 56}};
        System.out.println(maxMeetingRooms(meetings));
    }

    public static int maxMeetingRooms(int[][] meetings) {
        int maxRooms = 0;
        for (int i = 0; i < meetings.length; i++) {
            int rooms = 1;
            for (int j = 0; j < meetings.length; j++) {
                if (i != j && overlap(meetings[i], meetings[j])) {
                    rooms++;
                }
            }
            maxRooms = Math.max(maxRooms, rooms);
        }

        return maxRooms;
    }
    private static boolean overlap(int[] a, int[] b) {
        return (a[0] >= b[0] && a[0] < b[1]) || (b[0] >= a[0] && b[0] < a[1]);
    }
}
