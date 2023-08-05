package com.example.mosyalgorithms;

public class BiggestWaterReservoir {

    public static void main(String[] args) {
        int[] heightOfColumns = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(heightOfColumns));
    }

    private static int solution(int[] arr) {
        int biggestSquare = 0;
        int left = 0;
        int right = arr.length - 1;// 7
        while (left < right) {
            if (arr[left] <= arr[right]) {//1<=7
                int square = arr[left] * (right - left);//square=1*6=6
                if (biggestSquare < square) {//0<6
                    biggestSquare = square;//6
                }
                left++;//8
            } else {
                int square = arr[right] * (right - left);
                if (biggestSquare < square) {
                    biggestSquare = square;
                }
                right--;
            }
        }
        return biggestSquare;
    }

}
