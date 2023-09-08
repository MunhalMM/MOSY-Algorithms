package mysokursalqoritms;

import java.util.Arrays;

public class SortedArraySquares {
    public static void main(String[] args) {
        SortedArraySquares squares = new SortedArraySquares();
        int[] arr = {-3, -2, -1, 2, 4, 65, 66};
        System.out.println(Arrays.toString(squares.makeSquares(arr)));

    }

    public int[] makeSquares(int[] arr) {
        int n = arr.length;
        int[] squares = new int[n];
        int highestSquaresInd = n - 1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int leftSquares = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if (leftSquares > rightSquare) {
                squares[highestSquaresInd--] = leftSquares;
                left++;
            } else {
                squares[highestSquaresInd--] = rightSquare;
                right--;
            }
        }
        return squares;
    }
}
