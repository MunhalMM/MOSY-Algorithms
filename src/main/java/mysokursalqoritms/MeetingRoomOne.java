package mysokursalqoritms;

import java.util.Arrays;

public class MeetingRoomOne {
    public static void main(String[] args) {
        int[][] ints = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(MeetingRoomOne.canAttendMeeting(ints));
        int[][] intsOne = {{7, 10}, {2, 4}};
        System.out.println(MeetingRoomOne.canAttendMeeting(intsOne));

    }

    public static boolean canAttendMeeting(int[][] intervals) {
        int n = intervals.length;
        if (n == 0) {
            return true;
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < n - 1; i++) {
            int[] meetingOne = intervals[i];
            int[] meetingTwo = intervals[i + 1];
            if (meetingOne[1] > meetingTwo[0]) {
                return false;
            }
        }
        return true;
    }
}
