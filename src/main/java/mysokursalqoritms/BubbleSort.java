package mysokursalqoritms;

import java.util.Arrays;

public class BubbleSort   {
    public static void main(String[] args) {
        int[] numbers = {3, -5, 6, 12, 43, 0, -32, 1, -11, 111, 32,};
        String s = Arrays.toString(bubbleSort(numbers));
        System.out.println(s);
    }

    static int[] bubbleSort(int[] num) {
        if (num.length <= 1) {
            return num;
        }

        while (!isSorted(num)) {
            for (int i = 1; i < num.length; i++) {
                if (num[i - 1] > num[i]) { // {3, 2}
                    int temp = num[i - 1];  // temp = 3
                    num[i - 1] = num[i]; // {2, 2}
                    num[i] = temp; // {2, 3}
                 }
            }
        }
        return num;
    }

    static boolean isSorted(int[] numbs) {
        if (numbs.length <= 1) {
            return true;
        }
        for (int i = 1; i < numbs.length; i++) { //{1, 3, 4}
            if (numbs[i - 1] > numbs[i]) {
                return false;
            }
        }
        return true;
    }
}

