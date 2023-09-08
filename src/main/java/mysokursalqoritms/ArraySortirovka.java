package mysokursalqoritms;

import java.util.Arrays;

public class ArraySortirovka {
    public static void main(String[] args) {
        int[] array = {3, 2, -4, 0, -5, 11, -22, 25};
        System.out.println(Arrays.toString(ArraySortirovka.sortirovka(array)));
    }

    public static int[] sortirovka(int[] arr) {
        int a;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if (i != index) {
                a = arr[i];
                arr[i] = min;
                arr[index] = a;

            }
        }
        return arr;
    }
}
