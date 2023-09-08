package mysokursalqoritms;

public class CanCompleteAllTripsOne {
    public static void main(String[] args) {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};

        int capacity1 = 4;
        boolean canComplete1 = canComplete(trips, capacity1);
        System.out.println(canComplete1);

        int capacity2 = 5;
        boolean canComplete2 = canComplete(trips, capacity2);
        System.out.println(canComplete2);
    }

    public static boolean canComplete(int[][] trips, int capacity) {
        int totalPassenger = 0;
        for (int[] trip : trips) {
            totalPassenger += trip[0];
        }
        return totalPassenger <= capacity;
    }
}
