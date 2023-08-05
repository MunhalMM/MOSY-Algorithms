package com.example.mosyalgorithms;

import java.util.Arrays;
import java.util.PriorityQueue;


public class MaxMeetingRooms {

    public static void main(String[] args) {
        int[][] meetings = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(maxMeetingRooms(meetings)); // Output: 2
    }

    public static int maxMeetingRooms(int[][] meetings) {
        // Sort the meetings in ascending order based on their start time.
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        // Create a priority queue and add the end time of the first meeting.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(meetings[0][1]);

        // For each subsequent meeting, compare its start time with the end time of the meeting at the top of the priority queue.
        for (int i = 1; i < meetings.length; i++) {
            // If the start time of the meeting is greater than or equal to the end time of the meeting at the top of the queue, remove the meeting at the top of the queue and add the end time of the current meeting to the queue.
            if (meetings[i][0] >= pq.peek()) {
                pq.poll();
            }
            // If the start time of the meeting is less than the end time of the meeting at the top of the queue, add the end time of the current meeting to the queue.
            pq.add(meetings[i][1]);
        }

        // The size of the priority queue at any given time represents the number of meeting rooms required.
        return pq.size();
    }



}

