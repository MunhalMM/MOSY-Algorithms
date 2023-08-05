package com.example.mosyalgorithms;

public class CanCompleteAllTrips {
    public static void main(String[] args) {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};

        int capacity1 = 4;
        boolean canComplete1 = canCompleteAllTrips(trips, capacity1);
        System.out.println(canComplete1);

        int capacity2 = 5;
        boolean canComplete2 = canCompleteAllTrips(trips, capacity2);
        System.out.println(canComplete2);
    }

    public static boolean canCompleteAllTrips(int[][] trips, int capacity) {
        int[] passengersAtEachStop = new int[10 ];
        for (int[] trip : trips) {
            int passengers = trip[0];
            int startRoute = trip[1];
            int endRoute = trip[2];
            passengersAtEachStop[startRoute] += passengers;
            passengersAtEachStop[endRoute] -= passengers;
        }
        int totalPassengers = 0;
        for (int passengers : passengersAtEachStop) {
            totalPassengers += passengers;
            if (totalPassengers > capacity) {
                return false;
            }
        }
        return true;
    }
}