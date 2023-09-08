package mysokursalqoritms;

import java.util.Arrays;

public class MeetingRoom {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return true;
        }
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // [2,4] [7,10];
        for (int i = 0; i < n - 1; i++) {    // i = 0;
            int[] meetingOne = intervals[i];                 //   [0,30] // [2,4]
            int[] meetingTwo = intervals[i + 1];     //     [5,10] //[7,10]
            if (meetingOne[1] > meetingTwo[0]) {   //       30>5  // 4>7 //
                return false;
            }
        }
        return true;
    }
}
